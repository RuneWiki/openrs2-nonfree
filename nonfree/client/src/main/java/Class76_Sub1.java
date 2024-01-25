import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	private int anInt6475;

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
	private int anInt6479;

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "[I")
	private final int[] anIntArray567 = new int[this.anInt6469];

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class76_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt6469 > local15; local15++) {
			this.anIntArray567[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
	@Override
	protected final void method5042() {
		this.anInt6475 = Math.abs(this.anInt6475);
		if (this.anInt6475 >= 4096) {
			this.anInt6475 = 4095;
		}
		this.method5047((byte) (this.anInt6475 >> 4), this.anInt6479++);
		this.anInt6475 = 0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIZ)V")
	protected void method5047(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray84[this.anInt6479++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6475 += arg0 * this.anIntArray567[arg1] >> 12;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5041() {
		this.anInt6479 = 0;
		this.anInt6475 = 0;
	}
}
