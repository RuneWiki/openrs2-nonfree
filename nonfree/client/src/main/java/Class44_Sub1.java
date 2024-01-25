import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!ht", name = "o", descriptor = "I")
	private int anInt3801;

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "I")
	private int anInt3802;

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
	private int anInt3809;

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
	private int anInt3811;

	@OriginalMember(owner = "client!ht", name = "B", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
	private final int anInt3800;

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
	private final int anInt3805;

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
	private final int anInt3806;

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "I")
	private int anInt3807;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class44_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3800 = (int) (arg7 * 4096.0F);
		this.anInt3805 = (int) (arg6 * 4096.0F);
		this.anInt3807 = this.anInt3806 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
	@Override
	protected final void method8028() {
		this.anInt3802 = 0;
		this.anInt3801 = 0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBI)V")
	protected void method3263(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray29[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8021() {
		this.anInt3801 >>= 0x4;
		this.anInt3807 = this.anInt3806;
		if (this.anInt3801 < 0) {
			this.anInt3801 = 0;
		} else if (this.anInt3801 > 255) {
			this.anInt3801 = 255;
		}
		this.method3263(this.anInt3802++, (byte) this.anInt3801);
		this.anInt3801 = 0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt3809 = this.anInt3805 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt3809 = this.anInt3809 * this.anInt3809 >> 12;
			this.anInt3811 = 4096;
			this.anInt3801 = this.anInt3809;
			return;
		}
		this.anInt3811 = this.anInt3800 * this.anInt3809 >> 12;
		if (this.anInt3811 < 0) {
			this.anInt3811 = 0;
		} else if (this.anInt3811 > 4096) {
			this.anInt3811 = 4096;
		}
		this.anInt3809 = this.anInt3805 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt3809 = this.anInt3809 * this.anInt3809 >> 12;
		this.anInt3809 = this.anInt3809 * this.anInt3811 >> 12;
		this.anInt3801 += this.anInt3809 * this.anInt3807 >> 12;
		this.anInt3807 = this.anInt3806 * this.anInt3807 >> 12;
	}
}
