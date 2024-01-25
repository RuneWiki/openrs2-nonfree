import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
	private int anInt8596;

	@OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
	private int anInt8597;

	@OriginalMember(owner = "client!qu", name = "y", descriptor = "[B")
	private byte[] aByteArray110;

	@OriginalMember(owner = "client!qu", name = "z", descriptor = "[I")
	private final int[] anIntArray720 = new int[this.anInt8592];

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class45_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt8592 > local15; local15++) {
			this.anIntArray720[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8596 += arg0 * this.anIntArray720[arg1] >> 12;
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7173() {
		this.anInt8596 = 0;
		this.anInt8597 = 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	@Override
	protected final void method7170() {
		this.anInt8596 = Math.abs(this.anInt8596);
		if (this.anInt8596 >= 4096) {
			this.anInt8596 = 4095;
		}
		this.method7182(this.anInt8597++, (byte) (this.anInt8596 >> 4));
		this.anInt8596 = 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IBB)V")
	protected void method7182(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray110[this.anInt8597++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
