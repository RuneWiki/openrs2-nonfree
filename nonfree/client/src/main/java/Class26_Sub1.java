import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt830 = (int) (arg6 * 4096.0F);
		this.anInt838 = (int) (arg7 * 4096.0F);
		this.anInt825 = this.anInt832 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt834 = 4096;
			this.anInt829 = this.anInt830 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt829 = this.anInt829 * this.anInt829 >> 12;
			this.anInt831 = this.anInt829;
			return;
		}
		this.anInt834 = this.anInt838 * this.anInt829 >> 12;
		if (this.anInt834 < 0) {
			this.anInt834 = 0;
		} else if (this.anInt834 > 4096) {
			this.anInt834 = 4096;
		}
		this.anInt829 = this.anInt830 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt829 = this.anInt829 * this.anInt829 >> 12;
		this.anInt829 = this.anInt829 * this.anInt834 >> 12;
		this.anInt831 += this.anInt825 * this.anInt829 >> 12;
		this.anInt825 = this.anInt825 * this.anInt832 >> 12;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IB)V")
	protected void method718(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray30[arg0] = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4616() {
		this.anInt831 >>= 0x4;
		this.anInt825 = this.anInt832;
		if (this.anInt831 < 0) {
			this.anInt831 = 0;
		} else if (this.anInt831 > 255) {
			this.anInt831 = 255;
		}
		this.method718(this.anInt840++, (byte) this.anInt831);
		this.anInt831 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4611() {
		this.anInt840 = 0;
		this.anInt831 = 0;
	}
}
