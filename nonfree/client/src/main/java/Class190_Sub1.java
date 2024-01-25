import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public class Class190_Sub1 extends Class190 {

	@OriginalMember(owner = "client!jea", name = "s", descriptor = "Lclient!nf;")
	private Class102 aClass102_25;

	@OriginalMember(owner = "client!jea", name = "t", descriptor = "Lclient!nf;")
	private Class102 aClass102_26;

	@OriginalMember(owner = "client!jea", name = "u", descriptor = "Lclient!nf;")
	protected Class102 aClass102_27;

	@OriginalMember(owner = "client!jea", name = "w", descriptor = "Lclient!nf;")
	private Class102 aClass102_28;

	@OriginalMember(owner = "client!jea", name = "B", descriptor = "Lclient!nf;")
	private Class102 aClass102_29;

	@OriginalMember(owner = "client!jea", name = "C", descriptor = "Lclient!nf;")
	private Class102 aClass102_30;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!gj;Lclient!gj;Lclient!hja;)V")
	public Class190_Sub1(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class84_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method7984() {
		if (!super.method7984()) {
			return false;
		}
		@Pc(13) Class84_Sub1 local13 = (Class84_Sub1) super.aClass84_5;
		if (!super.aClass143_101.method3130(local13.anInt6458)) {
			return false;
		} else if (!super.aClass143_101.method3130(local13.anInt6450)) {
			return false;
		} else if (!super.aClass143_101.method3130(local13.anInt6451)) {
			return false;
		} else if (!super.aClass143_101.method3130(local13.anInt6449)) {
			return false;
		} else if (super.aClass143_101.method3130(local13.anInt6453)) {
			return super.aClass143_101.method3130(local13.anInt6452);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
	@Override
	public final void method7986() {
		super.method7986();
		@Pc(10) Class84_Sub1 local10 = (Class84_Sub1) super.aClass84_5;
		this.aClass102_27 = Static188.method3032(local10.anInt6458, super.aClass143_101);
		this.aClass102_26 = Static188.method3032(local10.anInt6450, super.aClass143_101);
		this.aClass102_29 = Static188.method3032(local10.anInt6451, super.aClass143_101);
		this.aClass102_28 = Static188.method3032(local10.anInt6449, super.aClass143_101);
		this.aClass102_30 = Static188.method3032(local10.anInt6453, super.aClass143_101);
		this.aClass102_25 = Static188.method3032(local10.anInt6452, super.aClass143_101);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method5816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.aClass102_29.method6951() + arg1;
		@Pc(20) int local20 = arg1 + super.aClass84_5.anInt10343 - this.aClass102_28.method6951();
		@Pc(27) int local27 = arg0 + this.aClass102_30.method6958();
		@Pc(37) int local37 = arg0 + super.aClass84_5.anInt10342 - this.aClass102_25.method6958();
		@Pc(41) int local41 = local20 - local9;
		@Pc(45) int local45 = local37 - local27;
		@Pc(55) int local55 = this.method5819() * local41 / 10000;
		@Pc(58) int[] local58 = new int[4];
		Static582.aClass16_12.K(local58);
		Static582.aClass16_12.KA(local9, local27, local9 + local55, local37);
		this.method5688(local41, local9, local45, local27);
		Static582.aClass16_12.KA(local55 + local9, local27, local20, local37);
		this.aClass102_26.method6949(local9, local27, local41, local45);
		Static582.aClass16_12.KA(local58[0], local58[1], local58[2], local58[3]);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(BIIII)V")
	protected void method5688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass102_27.method6949(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ZZII)V")
	@Override
	protected final void method5818(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		Static582.aClass16_12.K(local4);
		Static582.aClass16_12.KA(arg1, arg0, super.aClass84_5.anInt10343 + arg1, arg0 + super.aClass84_5.anInt10342);
		@Pc(25) int local25 = this.aClass102_29.method6951();
		@Pc(29) int local29 = this.aClass102_29.method6958();
		@Pc(33) int local33 = this.aClass102_28.method6951();
		@Pc(37) int local37 = this.aClass102_28.method6958();
		this.aClass102_29.method6961(arg1, arg0 + (super.aClass84_5.anInt10342 - local29) / 2);
		this.aClass102_28.method6961(arg1 + super.aClass84_5.anInt10343 - local33, arg0 - -((-local37 + super.aClass84_5.anInt10342) / 2));
		Static582.aClass16_12.KA(arg1, arg0, arg1 + super.aClass84_5.anInt10343, arg0 + this.aClass102_30.method6958());
		this.aClass102_30.method6949(arg1 + local25, arg0, super.aClass84_5.anInt10343 - local33 - local25, super.aClass84_5.anInt10342);
		@Pc(110) int local110 = this.aClass102_25.method6958();
		Static582.aClass16_12.KA(arg1, super.aClass84_5.anInt10342 + arg0 - local110, super.aClass84_5.anInt10343 + arg1, arg0 + super.aClass84_5.anInt10342);
		this.aClass102_25.method6949(local25 + arg1, -local110 + arg0 - -super.aClass84_5.anInt10342, super.aClass84_5.anInt10343 - local33 - local25, super.aClass84_5.anInt10342);
		Static582.aClass16_12.KA(local4[0], local4[1], local4[2], local4[3]);
	}
}
