import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public class Class94_Sub3 extends Class94 {

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "Lclient!f;")
	private Class73 aClass73_24;

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "Lclient!f;")
	private Class73 aClass73_25;

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "Lclient!f;")
	protected Class73 aClass73_26;

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "Lclient!f;")
	private Class73 aClass73_27;

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "Lclient!f;")
	private Class73 aClass73_28;

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "Lclient!f;")
	private Class73 aClass73_29;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!ri;Lclient!ri;Lclient!gaa;)V")
	public Class94_Sub3(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class38_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	@Override
	public final void method7700() {
		super.method7700();
		@Pc(10) Class38_Sub1 local10 = (Class38_Sub1) super.aClass38_5;
		this.aClass73_26 = Static581.method7907(local10.anInt1201, super.aClass284_91);
		this.aClass73_27 = Static581.method7907(local10.anInt1204, super.aClass284_91);
		this.aClass73_25 = Static581.method7907(local10.anInt1202, super.aClass284_91);
		this.aClass73_29 = Static581.method7907(local10.anInt1207, super.aClass284_91);
		this.aClass73_24 = Static581.method7907(local10.anInt1205, super.aClass284_91);
		this.aClass73_28 = Static581.method7907(local10.anInt1199, super.aClass284_91);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZIZ)V")
	@Override
	protected final void method4391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int[] local11 = new int[4];
		Static319.aClass31_11.oa(local11);
		Static319.aClass31_11.da(arg0, arg1, arg0 + super.aClass38_5.anInt8020, super.aClass38_5.anInt8019 + arg1);
		@Pc(32) int local32 = this.aClass73_25.A();
		@Pc(36) int local36 = this.aClass73_25.ca();
		@Pc(40) int local40 = this.aClass73_29.A();
		@Pc(44) int local44 = this.aClass73_29.ca();
		this.aClass73_25.method7957(arg0, (super.aClass38_5.anInt8019 - local36) / 2 + arg1);
		this.aClass73_29.method7957(super.aClass38_5.anInt8020 + arg0 - local40, arg1 + (-local44 + super.aClass38_5.anInt8019) / 2);
		Static319.aClass31_11.da(arg0, arg1, arg0 + super.aClass38_5.anInt8020, this.aClass73_24.ca() + arg1);
		this.aClass73_24.method7953(local32 + arg0, arg1, super.aClass38_5.anInt8020 - local40 - local32, super.aClass38_5.anInt8019);
		@Pc(117) int local117 = this.aClass73_28.ca();
		Static319.aClass31_11.da(arg0, arg1 + super.aClass38_5.anInt8019 - local117, arg0 - -super.aClass38_5.anInt8020, super.aClass38_5.anInt8019 + arg1);
		this.aClass73_28.method7953(arg0 + local32, super.aClass38_5.anInt8019 + arg1 + -local117, super.aClass38_5.anInt8020 - local32 - local40, super.aClass38_5.anInt8019);
		Static319.aClass31_11.da(local11[0], local11[1], local11[2], local11[3]);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIII)V")
	@Override
	protected final void method4388(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = this.aClass73_25.A() + arg0;
		@Pc(21) int local21 = arg0 + super.aClass38_5.anInt8020 - this.aClass73_29.A();
		@Pc(27) int local27 = this.aClass73_24.ca() + arg1;
		@Pc(37) int local37 = arg1 + super.aClass38_5.anInt8019 - this.aClass73_28.ca();
		@Pc(42) int local42 = local21 - local9;
		@Pc(47) int local47 = local37 - local27;
		@Pc(55) int local55 = this.method4389() * local42 / 10000;
		@Pc(58) int[] local58 = new int[4];
		Static319.aClass31_11.oa(local58);
		Static319.aClass31_11.da(local9, local27, local9 + local55, local37);
		this.method4401(local42, local9, local27, local47);
		Static319.aClass31_11.da(local55 + local9, local27, local21, local37);
		this.aClass73_27.method7953(local9, local27, local42, local47);
		Static319.aClass31_11.da(local58[0], local58[1], local58[2], local58[3]);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method7701() {
		if (!super.method7701()) {
			return false;
		}
		@Pc(13) Class38_Sub1 local13 = (Class38_Sub1) super.aClass38_5;
		if (!super.aClass284_91.method6347(local13.anInt1201)) {
			return false;
		} else if (!super.aClass284_91.method6347(local13.anInt1204)) {
			return false;
		} else if (!super.aClass284_91.method6347(local13.anInt1202)) {
			return false;
		} else if (!super.aClass284_91.method6347(local13.anInt1207)) {
			return false;
		} else if (super.aClass284_91.method6347(local13.anInt1205)) {
			return super.aClass284_91.method6347(local13.anInt1199);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V")
	protected void method4401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass73_26.method7953(arg1, arg2, arg0, arg3);
	}
}
