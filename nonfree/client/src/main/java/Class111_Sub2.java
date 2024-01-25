import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public class Class111_Sub2 extends Class111 {

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	private int anInt6595;

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
	private int anInt6598;

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "[I")
	private final int[] anIntArray553 = new int[this.anInt6588];

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class111_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt6588 > local15; local15++) {
			this.anIntArray553[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5105() {
		this.anInt6598 = Math.abs(this.anInt6598);
		if (this.anInt6598 >= 4096) {
			this.anInt6598 = 4095;
		}
		this.method5113(this.anInt6595++, (byte) (this.anInt6598 >> 4));
		this.anInt6598 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
	@Override
	protected final void method5103() {
		this.anInt6595 = 0;
		this.anInt6598 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIB)V")
	protected void method5113(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray83[this.anInt6595++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method5109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6598 += arg0 * this.anIntArray553[arg1] >> 12;
	}
}
