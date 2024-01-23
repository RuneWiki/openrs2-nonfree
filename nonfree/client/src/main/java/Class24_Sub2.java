import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	private int anInt3994;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
	private int anInt3996;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
	private int anInt4003;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
	private int anInt4006;

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
	private int anInt4007;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
	private int anInt4002;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
	private int anInt3997;

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
	private int anInt4005;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class24_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4007 = (int) (arg7 * 4096.0F);
		this.anInt4002 = (int) (arg6 * 4096.0F);
		this.anInt4005 = this.anInt3997 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	@Override
	protected final void method3197() {
		this.anInt4003 = 0;
		this.anInt4006 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	@Override
	protected final void method3201() {
		this.anInt4005 = this.anInt3997;
		this.anInt4006 >>= 0x4;
		if (this.anInt4006 < 0) {
			this.anInt4006 = 0;
		} else if (this.anInt4006 > 255) {
			this.anInt4006 = 255;
		}
		this.method3202(this.anInt4003++, (byte) this.anInt4006);
		this.anInt4006 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method3194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3996 = this.anInt4002 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt3996 = this.anInt3996 * this.anInt3996 >> 12;
			this.anInt3994 = 4096;
			this.anInt4006 = this.anInt3996;
			return;
		}
		this.anInt3994 = this.anInt4007 * this.anInt3996 >> 12;
		if (this.anInt3994 < 0) {
			this.anInt3994 = 0;
		} else if (this.anInt3994 > 4096) {
			this.anInt3994 = 4096;
		}
		this.anInt3996 = this.anInt4002 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt3996 = this.anInt3996 * this.anInt3996 >> 12;
		this.anInt3996 = this.anInt3994 * this.anInt3996 >> 12;
		this.anInt4006 += this.anInt3996 * this.anInt4005 >> 12;
		this.anInt4005 = this.anInt3997 * this.anInt4005 >> 12;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)V")
	protected void method3202(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray54[arg0] = arg1;
	}
}
