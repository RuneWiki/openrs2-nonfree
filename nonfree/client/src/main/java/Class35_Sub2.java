import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	private int anInt2761;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	private int anInt2762;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	private int anInt2763;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
	private int anInt2768;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	private final int anInt2760;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
	private final int anInt2767;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private final int anInt2758;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
	private int anInt2769;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class35_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2760 = (int) (arg6 * 4096.0F);
		this.anInt2767 = (int) (arg7 * 4096.0F);
		this.anInt2769 = this.anInt2758 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	@Override
	protected final void method2279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt2762 = this.anInt2760 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt2763 = 4096;
			this.anInt2762 = this.anInt2762 * this.anInt2762 >> 12;
			this.anInt2761 = this.anInt2762;
			return;
		}
		this.anInt2763 = this.anInt2762 * this.anInt2767 >> 12;
		if (this.anInt2763 < 0) {
			this.anInt2763 = 0;
		} else if (this.anInt2763 > 4096) {
			this.anInt2763 = 4096;
		}
		this.anInt2762 = this.anInt2760 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2762 = this.anInt2762 * this.anInt2762 >> 12;
		this.anInt2762 = this.anInt2762 * this.anInt2763 >> 12;
		this.anInt2761 += this.anInt2762 * this.anInt2769 >> 12;
		this.anInt2769 = this.anInt2758 * this.anInt2769 >> 12;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
	@Override
	protected final void method2278() {
		this.anInt2761 >>= 0x4;
		this.anInt2769 = this.anInt2758;
		if (this.anInt2761 < 0) {
			this.anInt2761 = 0;
		} else if (this.anInt2761 > 255) {
			this.anInt2761 = 255;
		}
		this.method2283(this.anInt2768++, (byte) this.anInt2761);
		this.anInt2761 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	@Override
	protected final void method2274() {
		this.anInt2768 = 0;
		this.anInt2761 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
	protected void method2283(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray55[arg0] = arg1;
	}
}
