import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class Class120_Sub1 extends Class120 {

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
	private int anInt3713;

	@OriginalMember(owner = "client!rn", name = "x", descriptor = "I")
	private int anInt3714;

	@OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
	private int anInt3718;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
	private int anInt3725;

	@OriginalMember(owner = "client!rn", name = "K", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
	private int anInt3717;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
	private int anInt3727;

	@OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
	private int anInt3722;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
	private int anInt3721;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class120_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3717 = (int) (arg7 * 4096.0F);
		this.anInt3727 = (int) (arg6 * 4096.0F);
		this.anInt3721 = this.anInt3722 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3718 = 4096;
			this.anInt3713 = this.anInt3727 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt3713 = this.anInt3713 * this.anInt3713 >> 12;
			this.anInt3725 = this.anInt3713;
			return;
		}
		this.anInt3718 = this.anInt3713 * this.anInt3717 >> 12;
		if (this.anInt3718 < 0) {
			this.anInt3718 = 0;
		} else if (this.anInt3718 > 4096) {
			this.anInt3718 = 4096;
		}
		this.anInt3713 = this.anInt3727 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt3713 = this.anInt3713 * this.anInt3713 >> 12;
		this.anInt3713 = this.anInt3713 * this.anInt3718 >> 12;
		this.anInt3725 += this.anInt3713 * this.anInt3721 >> 12;
		this.anInt3721 = this.anInt3722 * this.anInt3721 >> 12;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4263() {
		this.anInt3725 = 0;
		this.anInt3714 = 0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4256() {
		this.anInt3725 >>= 0x4;
		this.anInt3721 = this.anInt3722;
		if (this.anInt3725 < 0) {
			this.anInt3725 = 0;
		} else if (this.anInt3725 > 255) {
			this.anInt3725 = 255;
		}
		this.method2950(this.anInt3714++, (byte) this.anInt3725);
		this.anInt3725 = 0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V")
	protected void method2950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray42[arg0] = arg1;
	}
}
