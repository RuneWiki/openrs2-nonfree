import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public class Class188_Sub2 extends Class188 {

	@OriginalMember(owner = "client!os", name = "m", descriptor = "Lclient!iea;")
	private Class31 aClass31_26;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "Lclient!iea;")
	private Class31 aClass31_27;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "Lclient!iea;")
	private Class31 aClass31_28;

	@OriginalMember(owner = "client!os", name = "t", descriptor = "Lclient!iea;")
	protected Class31 aClass31_29;

	@OriginalMember(owner = "client!os", name = "u", descriptor = "Lclient!iea;")
	private Class31 aClass31_30;

	@OriginalMember(owner = "client!os", name = "A", descriptor = "Lclient!iea;")
	private Class31 aClass31_31;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!nd;Lclient!nd;Lclient!ek;)V")
	public Class188_Sub2(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class56_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method8063() {
		if (!super.method8063()) {
			return false;
		}
		@Pc(13) Class56_Sub1 local13 = (Class56_Sub1) super.aClass56_5;
		if (!super.aClass238_249.method5568(local13.anInt9425)) {
			return false;
		} else if (!super.aClass238_249.method5568(local13.anInt9433)) {
			return false;
		} else if (!super.aClass238_249.method5568(local13.anInt9426)) {
			return false;
		} else if (!super.aClass238_249.method5568(local13.anInt9423)) {
			return false;
		} else if (super.aClass238_249.method5568(local13.anInt9430)) {
			return super.aClass238_249.method5568(local13.anInt9431);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIZI)V")
	@Override
	protected final void method7582(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static141.aClass13_27.K(local8);
		Static141.aClass13_27.KA(arg1, arg0, arg1 + super.aClass56_5.anInt9422, super.aClass56_5.anInt9414 + arg0);
		@Pc(30) int local30 = this.aClass31_31.method8788();
		@Pc(34) int local34 = this.aClass31_31.method8807();
		@Pc(38) int local38 = this.aClass31_30.method8788();
		@Pc(42) int local42 = this.aClass31_30.method8807();
		this.aClass31_31.method8793(arg1, arg0 + (super.aClass56_5.anInt9414 - local34) / 2);
		this.aClass31_30.method8793(arg1 + super.aClass56_5.anInt9422 - local38, arg0 - -((-local42 + super.aClass56_5.anInt9414) / 2));
		Static141.aClass13_27.KA(arg1, arg0, arg1 + super.aClass56_5.anInt9422, arg0 + this.aClass31_27.method8807());
		this.aClass31_27.method8810(local30 + arg1, arg0, super.aClass56_5.anInt9422 - local38 - local30, super.aClass56_5.anInt9414);
		@Pc(114) int local114 = this.aClass31_26.method8807();
		Static141.aClass13_27.KA(arg1, arg0 + super.aClass56_5.anInt9414 - local114, arg1 + super.aClass56_5.anInt9422, arg0 + super.aClass56_5.anInt9414);
		this.aClass31_26.method8810(local30 + arg1, -local114 + arg0 + super.aClass56_5.anInt9414, super.aClass56_5.anInt9422 - local38 - local30, super.aClass56_5.anInt9414);
		Static141.aClass13_27.KA(local8[0], local8[1], local8[2], local8[3]);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	@Override
	public final void method8062() {
		super.method8062();
		@Pc(10) Class56_Sub1 local10 = (Class56_Sub1) super.aClass56_5;
		this.aClass31_29 = Static449.method6408(local10.anInt9425, super.aClass238_249);
		this.aClass31_28 = Static449.method6408(local10.anInt9433, super.aClass238_249);
		this.aClass31_31 = Static449.method6408(local10.anInt9426, super.aClass238_249);
		this.aClass31_30 = Static449.method6408(local10.anInt9423, super.aClass238_249);
		this.aClass31_27 = Static449.method6408(local10.anInt9430, super.aClass238_249);
		this.aClass31_26 = Static449.method6408(local10.anInt9431, super.aClass238_249);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZBII)V")
	@Override
	protected final void method7581(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = this.aClass31_31.method8788() + arg1;
		@Pc(20) int local20 = super.aClass56_5.anInt9422 + arg1 - this.aClass31_30.method8788();
		@Pc(26) int local26 = arg0 + this.aClass31_27.method8807();
		@Pc(36) int local36 = super.aClass56_5.anInt9414 + arg0 - this.aClass31_26.method8807();
		@Pc(40) int local40 = local20 - local9;
		@Pc(45) int local45 = local36 - local26;
		@Pc(53) int local53 = this.method7583() * local40 / 10000;
		@Pc(61) int[] local61 = new int[4];
		Static141.aClass13_27.K(local61);
		Static141.aClass13_27.KA(local9, local26, local53 + local9, local36);
		this.method6399(local45, local26, local40, local9);
		Static141.aClass13_27.KA(local53 + local9, local26, local20, local36);
		this.aClass31_28.method8810(local9, local26, local40, local45);
		Static141.aClass13_27.KA(local61[0], local61[1], local61[2], local61[3]);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIBI)V")
	protected void method6399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.aClass31_29.method8810(arg3, arg1, arg2, arg0);
	}
}
