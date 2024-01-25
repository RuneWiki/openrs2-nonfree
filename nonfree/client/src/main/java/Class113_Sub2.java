import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public class Class113_Sub2 extends Class113 {

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "[B")
	private byte[] aByteArray80;

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
	private int anInt5672;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
	private int anInt5673;

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "[I")
	private final int[] anIntArray414 = new int[this.anInt5661];

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class113_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt5661 > local15; local15++) {
			this.anIntArray414[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBI)V")
	protected void method4572(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray80[this.anInt5672++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
	@Override
	protected final void method4569() {
		this.anInt5672 = 0;
		this.anInt5673 = 0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5673 += this.anIntArray414[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	@Override
	protected final void method4568() {
		this.anInt5673 = Math.abs(this.anInt5673);
		if (this.anInt5673 >= 4096) {
			this.anInt5673 = 4095;
		}
		this.method4572(this.anInt5672++, (byte) (this.anInt5673 >> 4));
		this.anInt5673 = 0;
	}
}
