import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	private int anInt2072;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	private int anInt2073;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "[I")
	private final int[] anIntArray179 = new int[this.anInt5871];

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class67_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; super.anInt5871 > local13; local13++) {
			this.anIntArray179[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2072 += this.anIntArray179[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4684() {
		this.anInt2072 = Math.abs(this.anInt2072);
		if (this.anInt2072 >= 4096) {
			this.anInt2072 = 4095;
		}
		this.method1672(this.anInt2073++, (byte) (this.anInt2072 >> 4));
		this.anInt2072 = 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BIB)V")
	protected void method1672(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray26[this.anInt2073++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4678() {
		this.anInt2073 = 0;
		this.anInt2072 = 0;
	}
}
