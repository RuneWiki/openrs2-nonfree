import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	private int anInt2833;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	private int anInt2837;

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "[I")
	private final int[] anIntArray215 = new int[this.anInt4761];

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class23_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt4761 > local15; local15++) {
			this.anIntArray215[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2833 += this.anIntArray215[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
	protected void method2272(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray34[this.anInt2837++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4270() {
		this.anInt2833 = 0;
		this.anInt2837 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4268() {
		this.anInt2833 = Math.abs(this.anInt2833);
		if (this.anInt2833 >= 4096) {
			this.anInt2833 = 4095;
		}
		this.method2272(this.anInt2837++, (byte) (this.anInt2833 >> 4));
		this.anInt2833 = 0;
	}
}
