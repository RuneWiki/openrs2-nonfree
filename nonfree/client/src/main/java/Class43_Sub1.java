import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
	private int anInt1081;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
	private int anInt1083;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "[I")
	private final int[] anIntArray76 = new int[this.anInt3902];

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt3902 > local15; local15++) {
			this.anIntArray76[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII)V")
	protected void method961(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray12[this.anInt1083++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	@Override
	protected final void method3177() {
		this.anInt1081 = Math.abs(this.anInt1081);
		if (this.anInt1081 >= 4096) {
			this.anInt1081 = 4095;
		}
		this.method961((byte) (this.anInt1081 >> 4), this.anInt1083++);
		this.anInt1081 = 0;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	@Override
	protected final void method3176() {
		this.anInt1083 = 0;
		this.anInt1081 = 0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1081 += arg0 * this.anIntArray76[arg1] >> 12;
	}
}
