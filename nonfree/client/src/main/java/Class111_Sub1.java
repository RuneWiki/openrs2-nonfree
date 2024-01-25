import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
	private int anInt2795;

	@OriginalMember(owner = "client!mp", name = "s", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
	private int anInt2796;

	@OriginalMember(owner = "client!mp", name = "z", descriptor = "I")
	private int anInt2802;

	@OriginalMember(owner = "client!mp", name = "D", descriptor = "I")
	private int anInt2806;

	@OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
	private final int anInt2798;

	@OriginalMember(owner = "client!mp", name = "y", descriptor = "I")
	private final int anInt2801;

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
	private final int anInt2794;

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "I")
	private int anInt2797;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class111_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2798 = (int) (arg6 * 4096.0F);
		this.anInt2801 = (int) (arg7 * 4096.0F);
		this.anInt2797 = this.anInt2794 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BIB)V")
	protected void method2304(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray26[arg0] = arg1;
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V")
	@Override
	protected final void method5103() {
		this.anInt2796 = 0;
		this.anInt2806 = 0;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5105() {
		this.anInt2796 >>= 0x4;
		this.anInt2797 = this.anInt2794;
		if (this.anInt2796 < 0) {
			this.anInt2796 = 0;
		} else if (this.anInt2796 > 255) {
			this.anInt2796 = 255;
		}
		this.method2304(this.anInt2806++, (byte) this.anInt2796);
		this.anInt2796 = 0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method5109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2802 = this.anInt2798 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt2802 = this.anInt2802 * this.anInt2802 >> 12;
			this.anInt2795 = 4096;
			this.anInt2796 = this.anInt2802;
			return;
		}
		this.anInt2795 = this.anInt2801 * this.anInt2802 >> 12;
		this.anInt2802 = this.anInt2798 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt2795 < 0) {
			this.anInt2795 = 0;
		} else if (this.anInt2795 > 4096) {
			this.anInt2795 = 4096;
		}
		this.anInt2802 = this.anInt2802 * this.anInt2802 >> 12;
		this.anInt2802 = this.anInt2795 * this.anInt2802 >> 12;
		this.anInt2796 += this.anInt2797 * this.anInt2802 >> 12;
		this.anInt2797 = this.anInt2797 * this.anInt2794 >> 12;
	}
}
