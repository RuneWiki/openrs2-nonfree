import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public class Class71_Sub2 extends Class71 {

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "Lclient!qda;")
	private Class59 aClass59_25;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "Lclient!qda;")
	private Class59 aClass59_26;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "Lclient!qda;")
	private Class59 aClass59_27;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "Lclient!qda;")
	protected Class59 aClass59_28;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "Lclient!qda;")
	private Class59 aClass59_29;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "Lclient!qda;")
	private Class59 aClass59_30;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;Lclient!gea;)V")
	public Class71_Sub2(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class110_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8563() {
		if (!super.method8563()) {
			return false;
		}
		@Pc(13) Class110_Sub1 local13 = (Class110_Sub1) super.aClass110_5;
		if (!super.aClass50_134.method897(local13.anInt3556)) {
			return false;
		} else if (!super.aClass50_134.method897(local13.anInt3560)) {
			return false;
		} else if (!super.aClass50_134.method897(local13.anInt3563)) {
			return false;
		} else if (!super.aClass50_134.method897(local13.anInt3558)) {
			return false;
		} else if (super.aClass50_134.method897(local13.anInt3559)) {
			return super.aClass50_134.method897(local13.anInt3561);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method6932(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(17) int[] local17 = new int[4];
		Static563.aClass143_13.K(local17);
		Static563.aClass143_13.KA(arg0, arg1, arg0 + super.aClass110_5.anInt8729, super.aClass110_5.anInt8731 + arg1);
		@Pc(39) int local39 = this.aClass59_29.method8053();
		@Pc(43) int local43 = this.aClass59_29.method8064();
		@Pc(47) int local47 = this.aClass59_27.method8053();
		@Pc(51) int local51 = this.aClass59_27.method8064();
		this.aClass59_29.method8057(arg0, arg1 + (super.aClass110_5.anInt8731 - local43) / 2);
		this.aClass59_27.method8057(super.aClass110_5.anInt8729 + arg0 - local47, (-local51 + super.aClass110_5.anInt8731) / 2 + arg1);
		Static563.aClass143_13.KA(arg0, arg1, super.aClass110_5.anInt8729 + arg0, this.aClass59_26.method8064() + arg1);
		this.aClass59_26.method8063(arg0 + local39, arg1, super.aClass110_5.anInt8729 - local39 - local47, super.aClass110_5.anInt8731);
		@Pc(123) int local123 = this.aClass59_30.method8064();
		Static563.aClass143_13.KA(arg0, arg1 + super.aClass110_5.anInt8731 - local123, arg0 - -super.aClass110_5.anInt8729, super.aClass110_5.anInt8731 + arg1);
		this.aClass59_30.method8063(arg0 + local39, -local123 + arg1 - -super.aClass110_5.anInt8731, super.aClass110_5.anInt8729 - local47 - local39, super.aClass110_5.anInt8731);
		Static563.aClass143_13.KA(local17[0], local17[1], local17[2], local17[3]);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8562() {
		super.method8562();
		@Pc(10) Class110_Sub1 local10 = (Class110_Sub1) super.aClass110_5;
		this.aClass59_28 = Static231.method799(local10.anInt3556, super.aClass50_134);
		this.aClass59_25 = Static231.method799(local10.anInt3560, super.aClass50_134);
		this.aClass59_29 = Static231.method799(local10.anInt3563, super.aClass50_134);
		this.aClass59_27 = Static231.method799(local10.anInt3558, super.aClass50_134);
		this.aClass59_26 = Static231.method799(local10.anInt3559, super.aClass50_134);
		this.aClass59_30 = Static231.method799(local10.anInt3561, super.aClass50_134);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)V")
	protected void method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass59_28.method8063(arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIBZ)V")
	@Override
	protected final void method6931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 + this.aClass59_29.method8053();
		@Pc(19) int local19 = arg1 + super.aClass110_5.anInt8729 - this.aClass59_27.method8053();
		@Pc(30) int local30 = this.aClass59_26.method8064() + arg0;
		@Pc(40) int local40 = super.aClass110_5.anInt8731 + arg0 - this.aClass59_30.method8064();
		@Pc(45) int local45 = local19 - local9;
		@Pc(50) int local50 = local40 - local30;
		@Pc(58) int local58 = local45 * this.method6933() / 10000;
		@Pc(61) int[] local61 = new int[4];
		Static563.aClass143_13.K(local61);
		Static563.aClass143_13.KA(local9, local30, local9 + local58, local40);
		this.method6937(local50, local30, local45, local9);
		Static563.aClass143_13.KA(local58 + local9, local30, local19, local40);
		this.aClass59_25.method8063(local9, local30, local45, local50);
		Static563.aClass143_13.KA(local61[0], local61[1], local61[2], local61[3]);
	}
}
