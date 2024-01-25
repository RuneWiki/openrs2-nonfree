import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class Class96_Sub2 extends Class96 {

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	private int anInt2802;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	private int anInt2803;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
	private int anInt2807;

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
	private int anInt2809;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	private final int anInt2801;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
	private final int anInt2804;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
	private final int anInt2806;

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
	private int anInt2813;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class96_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2801 = (int) (arg6 * 4096.0F);
		this.anInt2804 = (int) (arg7 * 4096.0F);
		this.anInt2813 = this.anInt2806 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2803 = this.anInt2801 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt2803 = this.anInt2803 * this.anInt2803 >> 12;
			this.anInt2802 = 4096;
			this.anInt2807 = this.anInt2803;
			return;
		}
		this.anInt2802 = this.anInt2804 * this.anInt2803 >> 12;
		if (this.anInt2802 < 0) {
			this.anInt2802 = 0;
		} else if (this.anInt2802 > 4096) {
			this.anInt2802 = 4096;
		}
		this.anInt2803 = this.anInt2801 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt2803 = this.anInt2803 * this.anInt2803 >> 12;
		this.anInt2803 = this.anInt2802 * this.anInt2803 >> 12;
		this.anInt2807 += this.anInt2803 * this.anInt2813 >> 12;
		this.anInt2813 = this.anInt2806 * this.anInt2813 >> 12;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method2157() {
		this.anInt2807 >>= 0x4;
		this.anInt2813 = this.anInt2806;
		if (this.anInt2807 < 0) {
			this.anInt2807 = 0;
		} else if (this.anInt2807 > 255) {
			this.anInt2807 = 255;
		}
		this.method2169((byte) this.anInt2807, this.anInt2809++);
		this.anInt2807 = 0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	@Override
	protected final void method2159() {
		this.anInt2809 = 0;
		this.anInt2807 = 0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBI)V")
	protected void method2169(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray26[arg1] = arg0;
	}
}
