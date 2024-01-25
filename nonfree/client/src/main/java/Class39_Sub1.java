import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
	private int anInt3882;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
	private int anInt3886;

	@OriginalMember(owner = "client!cn", name = "F", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
	private int anInt3890;

	@OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
	private int anInt3895;

	@OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
	private final int anInt3891;

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
	private final int anInt3883;

	@OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
	private final int anInt3897;

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
	private int anInt3889;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class39_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3891 = (int) (arg7 * 4096.0F);
		this.anInt3883 = (int) (arg6 * 4096.0F);
		this.anInt3889 = this.anInt3897 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3556() {
		this.anInt3890 = 0;
		this.anInt3895 = 0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt3882 = this.anInt3883 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt3886 = 4096;
			this.anInt3882 = this.anInt3882 * this.anInt3882 >> 12;
			this.anInt3890 = this.anInt3882;
			return;
		}
		this.anInt3886 = this.anInt3882 * this.anInt3891 >> 12;
		if (this.anInt3886 < 0) {
			this.anInt3886 = 0;
		} else if (this.anInt3886 > 4096) {
			this.anInt3886 = 4096;
		}
		this.anInt3882 = this.anInt3883 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt3882 = this.anInt3882 * this.anInt3882 >> 12;
		this.anInt3882 = this.anInt3882 * this.anInt3886 >> 12;
		this.anInt3890 += this.anInt3889 * this.anInt3882 >> 12;
		this.anInt3889 = this.anInt3889 * this.anInt3897 >> 12;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
	@Override
	protected final void method3560() {
		this.anInt3890 >>= 0x4;
		this.anInt3889 = this.anInt3897;
		if (this.anInt3890 < 0) {
			this.anInt3890 = 0;
		} else if (this.anInt3890 > 255) {
			this.anInt3890 = 255;
		}
		this.method3565(this.anInt3895++, (byte) this.anInt3890);
		this.anInt3890 = 0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V")
	protected void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray50[arg0] = arg1;
	}
}
