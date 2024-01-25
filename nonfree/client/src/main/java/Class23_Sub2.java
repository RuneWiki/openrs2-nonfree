import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!ds", name = "C", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
	private int anInt1673;

	@OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
	private int anInt1675;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "[I")
	private final int[] anIntArray138 = new int[this.anInt5165];

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class23_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt5165 > local15; local15++) {
			this.anIntArray138[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZ)V")
	@Override
	protected final void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1675 += this.anIntArray138[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4621() {
		this.anInt1673 = 0;
		this.anInt1675 = 0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)V")
	protected void method1606(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray17[this.anInt1673++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method4629() {
		this.anInt1675 = Math.abs(this.anInt1675);
		if (this.anInt1675 >= 4096) {
			this.anInt1675 = 4095;
		}
		this.method1606(this.anInt1673++, (byte) (this.anInt1675 >> 4));
		this.anInt1675 = 0;
	}
}
