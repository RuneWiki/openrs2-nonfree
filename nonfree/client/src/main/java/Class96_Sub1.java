import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
	private int anInt2325;

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
	private int anInt2328;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "[I")
	private final int[] anIntArray187 = new int[this.anInt2789];

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class96_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt2789 > local15; local15++) {
			this.anIntArray187[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method2157() {
		this.anInt2325 = Math.abs(this.anInt2325);
		if (this.anInt2325 >= 4096) {
			this.anInt2325 = 4095;
		}
		this.method1846(this.anInt2328++, (byte) (this.anInt2325 >> 4));
		this.anInt2325 = 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	@Override
	protected final void method2159() {
		this.anInt2328 = 0;
		this.anInt2325 = 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBB)V")
	protected void method1846(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray18[this.anInt2328++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2325 += arg0 * this.anIntArray187[arg1] >> 12;
	}
}
