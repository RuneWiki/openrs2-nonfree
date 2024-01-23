import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!d", name = "x", descriptor = "I")
	private int anInt1934;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "I")
	private int anInt1937;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "[I")
	private int[] anIntArray201 = new int[this.anInt2932];

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt2932; local15++) {
			this.anIntArray201[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method2234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1934 += this.anIntArray201[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	@Override
	protected final void method2233() {
		this.anInt1934 = Math.abs(this.anInt1934);
		if (this.anInt1934 >= 4096) {
			this.anInt1934 = 4095;
		}
		this.method1452(this.anInt1937++, (byte) (this.anInt1934 >> 4));
		this.anInt1934 = 0;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	@Override
	protected final void method2230() {
		this.anInt1934 = 0;
		this.anInt1937 = 0;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IB)V")
	protected void method1452(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray23[this.anInt1937++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
