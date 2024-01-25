import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oja")
public class Class94_Sub2 extends Class94 {

	@OriginalMember(owner = "client!oja", name = "r", descriptor = "Lclient!jd;")
	private Class20 aClass20_17;

	@OriginalMember(owner = "client!oja", name = "t", descriptor = "Lclient!jd;")
	private Class20 aClass20_18;

	@OriginalMember(owner = "client!oja", name = "w", descriptor = "Lclient!jd;")
	private Class20 aClass20_19;

	@OriginalMember(owner = "client!oja", name = "x", descriptor = "Lclient!jd;")
	private Class20 aClass20_20;

	@OriginalMember(owner = "client!oja", name = "D", descriptor = "Lclient!jd;")
	private Class20 aClass20_21;

	@OriginalMember(owner = "client!oja", name = "E", descriptor = "Lclient!jd;")
	protected Class20 aClass20_22;

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lclient!wia;Lclient!wia;Lclient!eia;)V")
	public Class94_Sub2(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class92_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IIIBI)V")
	protected void method3772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.aClass20_22.method7414(arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method8745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		Static677.aClass137_47.K(local4);
		Static677.aClass137_47.KA(arg1, arg0, arg1 + super.aClass92_5.anInt10903, arg0 - -super.aClass92_5.anInt10907);
		@Pc(26) int local26 = this.aClass20_19.method7394();
		@Pc(30) int local30 = this.aClass20_19.method7408();
		@Pc(34) int local34 = this.aClass20_21.method7394();
		@Pc(38) int local38 = this.aClass20_21.method7408();
		this.aClass20_19.method7399(arg1, arg0 + (super.aClass92_5.anInt10907 - local30) / 2);
		this.aClass20_21.method7399(arg1 + super.aClass92_5.anInt10903 - local34, (-local38 + super.aClass92_5.anInt10907) / 2 + arg0);
		Static677.aClass137_47.KA(arg1, arg0, arg1 + super.aClass92_5.anInt10903, this.aClass20_20.method7408() + arg0);
		this.aClass20_20.method7414(local26 + arg1, arg0, super.aClass92_5.anInt10903 - local34 - local26, super.aClass92_5.anInt10907);
		@Pc(112) int local112 = this.aClass20_18.method7408();
		Static677.aClass137_47.KA(arg1, arg0 + super.aClass92_5.anInt10907 - local112, super.aClass92_5.anInt10903 + arg1, super.aClass92_5.anInt10907 + arg0);
		this.aClass20_18.method7414(local26 + arg1, -local112 + super.aClass92_5.anInt10907 + arg0, super.aClass92_5.anInt10903 - local26 - local34, super.aClass92_5.anInt10907);
		Static677.aClass137_47.KA(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IBIZ)V")
	@Override
	protected final void method8743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.aClass20_19.method7394() + arg0;
		@Pc(19) int local19 = super.aClass92_5.anInt10903 + arg0 - this.aClass20_21.method7394();
		@Pc(25) int local25 = this.aClass20_20.method7408() + arg1;
		@Pc(36) int local36 = arg1 + super.aClass92_5.anInt10907 - this.aClass20_18.method7408();
		@Pc(46) int local46 = local19 - local9;
		@Pc(50) int local50 = local36 - local25;
		@Pc(58) int local58 = this.method8744() * local46 / 10000;
		@Pc(61) int[] local61 = new int[4];
		Static677.aClass137_47.K(local61);
		Static677.aClass137_47.KA(local9, local25, local9 + local58, local36);
		this.method3772(local9, local25, local50, local46);
		Static677.aClass137_47.KA(local9 + local58, local25, local19, local36);
		this.aClass20_17.method7414(local9, local25, local46, local50);
		Static677.aClass137_47.KA(local61[0], local61[1], local61[2], local61[3]);
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8740() {
		if (!super.method8740()) {
			return false;
		}
		@Pc(13) Class92_Sub1 local13 = (Class92_Sub1) super.aClass92_5;
		if (!super.aClass386_130.method9206(local13.anInt4239)) {
			return false;
		} else if (!super.aClass386_130.method9206(local13.anInt4234)) {
			return false;
		} else if (!super.aClass386_130.method9206(local13.anInt4237)) {
			return false;
		} else if (!super.aClass386_130.method9206(local13.anInt4235)) {
			return false;
		} else if (super.aClass386_130.method9206(local13.anInt4233)) {
			return super.aClass386_130.method9206(local13.anInt4236);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(I)V")
	@Override
	public final void method8739() {
		super.method8739();
		@Pc(10) Class92_Sub1 local10 = (Class92_Sub1) super.aClass92_5;
		this.aClass20_22 = Static410.method6055(super.aClass386_130, local10.anInt4239);
		this.aClass20_17 = Static410.method6055(super.aClass386_130, local10.anInt4234);
		this.aClass20_19 = Static410.method6055(super.aClass386_130, local10.anInt4237);
		this.aClass20_21 = Static410.method6055(super.aClass386_130, local10.anInt4235);
		this.aClass20_20 = Static410.method6055(super.aClass386_130, local10.anInt4233);
		this.aClass20_18 = Static410.method6055(super.aClass386_130, local10.anInt4236);
	}
}
