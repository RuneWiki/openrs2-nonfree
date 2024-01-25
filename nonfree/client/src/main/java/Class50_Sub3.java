import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public class Class50_Sub3 extends Class50 {

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Lclient!f;")
	private Class14 aClass14_27;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Lclient!f;")
	protected Class14 aClass14_28;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Lclient!f;")
	private Class14 aClass14_29;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "Lclient!f;")
	private Class14 aClass14_30;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "Lclient!f;")
	private Class14 aClass14_31;

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "Lclient!f;")
	private Class14 aClass14_32;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!tf;Lclient!tf;Lclient!wm;)V")
	public Class50_Sub3(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class65_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZIZ)V")
	@Override
	protected final void method6781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int[] local13 = new int[4];
		Static505.aClass45_11.oa(local13);
		Static505.aClass45_11.da(arg1, arg0, arg1 + super.aClass65_5.anInt5462, super.aClass65_5.anInt5461 + arg0);
		@Pc(34) int local34 = this.aClass14_30.A();
		@Pc(38) int local38 = this.aClass14_30.ca();
		@Pc(42) int local42 = this.aClass14_27.A();
		@Pc(46) int local46 = this.aClass14_27.ca();
		this.aClass14_30.method7680(arg1, arg0 + (super.aClass65_5.anInt5461 - local38) / 2);
		this.aClass14_27.method7680(arg1 + super.aClass65_5.anInt5462 - local42, (super.aClass65_5.anInt5461 + -local46) / 2 + arg0);
		Static505.aClass45_11.da(arg1, arg0, super.aClass65_5.anInt5462 + arg1, arg0 + this.aClass14_32.ca());
		this.aClass14_32.method7682(local34 + arg1, arg0, super.aClass65_5.anInt5462 - local42 - local34, super.aClass65_5.anInt5461);
		@Pc(119) int local119 = this.aClass14_29.ca();
		Static505.aClass45_11.da(arg1, super.aClass65_5.anInt5461 + arg0 - local119, arg1 + super.aClass65_5.anInt5462, super.aClass65_5.anInt5461 + arg0);
		this.aClass14_29.method7682(arg1 + local34, arg0 + super.aClass65_5.anInt5461 - local119, super.aClass65_5.anInt5462 - local34 - local42, super.aClass65_5.anInt5461);
		Static505.aClass45_11.da(local13[0], local13[1], local13[2], local13[3]);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	@Override
	public final void method6872() {
		super.method6872();
		@Pc(10) Class65_Sub1 local10 = (Class65_Sub1) super.aClass65_5;
		this.aClass14_28 = Static249.method3865(local10.anInt2131, super.aClass322_136);
		this.aClass14_31 = Static249.method3865(local10.anInt2132, super.aClass322_136);
		this.aClass14_30 = Static249.method3865(local10.anInt2126, super.aClass322_136);
		this.aClass14_27 = Static249.method3865(local10.anInt2124, super.aClass322_136);
		this.aClass14_32 = Static249.method3865(local10.anInt2128, super.aClass322_136);
		this.aClass14_29 = Static249.method3865(local10.anInt2127, super.aClass322_136);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method6871() {
		if (!super.method6871()) {
			return false;
		}
		@Pc(13) Class65_Sub1 local13 = (Class65_Sub1) super.aClass65_5;
		if (!super.aClass322_136.method6797(local13.anInt2131)) {
			return false;
		} else if (!super.aClass322_136.method6797(local13.anInt2132)) {
			return false;
		} else if (!super.aClass322_136.method6797(local13.anInt2126)) {
			return false;
		} else if (!super.aClass322_136.method6797(local13.anInt2124)) {
			return false;
		} else if (super.aClass322_136.method6797(local13.anInt2128)) {
			return super.aClass322_136.method6797(local13.anInt2127);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method6782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + this.aClass14_30.A();
		@Pc(20) int local20 = super.aClass65_5.anInt5462 + arg1 - this.aClass14_27.A();
		@Pc(27) int local27 = arg0 + this.aClass14_32.ca();
		@Pc(39) int local39 = arg0 + super.aClass65_5.anInt5461 - this.aClass14_29.ca();
		@Pc(44) int local44 = local20 - local9;
		@Pc(49) int local49 = local39 - local27;
		@Pc(57) int local57 = this.method6783() * local44 / 10000;
		@Pc(60) int[] local60 = new int[4];
		Static505.aClass45_11.oa(local60);
		Static505.aClass45_11.da(local9, local27, local57 + local9, local39);
		this.method6786(local44, local49, local9, local27);
		Static505.aClass45_11.da(local57 + local9, local27, local20, local39);
		this.aClass14_31.method7682(local9, local27, local44, local49);
		Static505.aClass45_11.da(local60[0], local60[1], local60[2], local60[3]);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
	protected void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.aClass14_28.method7682(arg2, arg3, arg0, arg1);
	}
}
