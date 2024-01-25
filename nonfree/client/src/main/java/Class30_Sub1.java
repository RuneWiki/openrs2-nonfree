import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
	private int anInt2026;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
	private int anInt2028;

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
	private int anInt2029;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
	private int anInt2035;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
	private final int anInt2027;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
	private final int anInt2034;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
	private final int anInt2036;

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
	private int anInt2037;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2027 = (int) (arg6 * 4096.0F);
		this.anInt2034 = (int) (arg7 * 4096.0F);
		this.anInt2037 = this.anInt2036 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
	@Override
	protected final void method4021() {
		this.anInt2026 >>= 0x4;
		this.anInt2037 = this.anInt2036;
		if (this.anInt2026 < 0) {
			this.anInt2026 = 0;
		} else if (this.anInt2026 > 255) {
			this.anInt2026 = 255;
		}
		this.method1862(this.anInt2028++, (byte) this.anInt2026);
		this.anInt2026 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4019() {
		this.anInt2028 = 0;
		this.anInt2026 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
	protected void method1862(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray35[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt2035 = this.anInt2027 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt2035 = this.anInt2035 * this.anInt2035 >> 12;
			this.anInt2029 = 4096;
			this.anInt2026 = this.anInt2035;
			return;
		}
		this.anInt2029 = this.anInt2035 * this.anInt2034 >> 12;
		this.anInt2035 = this.anInt2027 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt2029 < 0) {
			this.anInt2029 = 0;
		} else if (this.anInt2029 > 4096) {
			this.anInt2029 = 4096;
		}
		this.anInt2035 = this.anInt2035 * this.anInt2035 >> 12;
		this.anInt2035 = this.anInt2035 * this.anInt2029 >> 12;
		this.anInt2026 += this.anInt2037 * this.anInt2035 >> 12;
		this.anInt2037 = this.anInt2037 * this.anInt2036 >> 12;
	}
}
