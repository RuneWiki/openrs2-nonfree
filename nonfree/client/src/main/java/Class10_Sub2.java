import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
	private int anInt1809;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
	private int anInt1810;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "[I")
	private final int[] anIntArray138 = new int[this.anInt4488];

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class10_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt4488 > local15; local15++) {
			this.anIntArray138[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
	@Override
	protected final void method3908() {
		this.anInt1809 = 0;
		this.anInt1810 = 0;
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
	@Override
	protected final void method3914() {
		this.anInt1809 = Math.abs(this.anInt1809);
		if (this.anInt1809 >= 4096) {
			this.anInt1809 = 4095;
		}
		this.method1716((byte) (this.anInt1809 >> 4), this.anInt1810++);
		this.anInt1809 = 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1809 += arg1 * this.anIntArray138[arg0] >> 12;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BZI)V")
	protected void method1716(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray44[this.anInt1810++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}
}
