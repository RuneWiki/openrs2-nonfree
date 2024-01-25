import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public class Class81_Sub2 extends Class81 {

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "Lclient!bka;")
	private Class9 aClass9_22;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "Lclient!bka;")
	private Class9 aClass9_23;

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "Lclient!bka;")
	protected Class9 aClass9_24;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "Lclient!bka;")
	private Class9 aClass9_25;

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "Lclient!bka;")
	private Class9 aClass9_26;

	@OriginalMember(owner = "client!hm", name = "w", descriptor = "Lclient!bka;")
	private Class9 aClass9_27;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!lb;Lclient!lb;Lclient!sf;)V")
	public Class81_Sub2(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class21_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
	protected void method6790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass9_24.method8614(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method8744() {
		if (!super.method8744()) {
			return false;
		}
		@Pc(14) Class21_Sub3 local14 = (Class21_Sub3) super.aClass21_5;
		if (!super.aClass221_148.method5068(local14.anInt3476)) {
			return false;
		} else if (!super.aClass221_148.method5068(local14.anInt3470)) {
			return false;
		} else if (!super.aClass221_148.method5068(local14.anInt3477)) {
			return false;
		} else if (!super.aClass221_148.method5068(local14.anInt3474)) {
			return false;
		} else if (super.aClass221_148.method5068(local14.anInt3475)) {
			return super.aClass221_148.method5068(local14.anInt3473);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	@Override
	public final void method8745() {
		super.method8745();
		@Pc(10) Class21_Sub3 local10 = (Class21_Sub3) super.aClass21_5;
		this.aClass9_24 = Static307.method4661(super.aClass221_148, local10.anInt3476);
		this.aClass9_27 = Static307.method4661(super.aClass221_148, local10.anInt3470);
		this.aClass9_25 = Static307.method4661(super.aClass221_148, local10.anInt3477);
		this.aClass9_22 = Static307.method4661(super.aClass221_148, local10.anInt3474);
		this.aClass9_26 = Static307.method4661(super.aClass221_148, local10.anInt3475);
		this.aClass9_23 = Static307.method4661(super.aClass221_148, local10.anInt3473);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZZI)V")
	@Override
	protected final void method8297(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int[] local13 = new int[4];
		Static488.aClass67_12.K(local13);
		Static488.aClass67_12.KA(arg1, arg0, super.aClass21_5.anInt3462 + arg1, super.aClass21_5.anInt3460 + arg0);
		@Pc(34) int local34 = this.aClass9_25.method8619();
		@Pc(38) int local38 = this.aClass9_25.method8613();
		@Pc(42) int local42 = this.aClass9_22.method8619();
		@Pc(46) int local46 = this.aClass9_22.method8613();
		this.aClass9_25.method8617(arg1, arg0 + (super.aClass21_5.anInt3460 - local38) / 2);
		this.aClass9_22.method8617(arg1 + super.aClass21_5.anInt3462 - local42, arg0 + (super.aClass21_5.anInt3460 - local46) / 2);
		Static488.aClass67_12.KA(arg1, arg0, arg1 + super.aClass21_5.anInt3462, this.aClass9_26.method8613() + arg0);
		this.aClass9_26.method8614(arg1 + local34, arg0, super.aClass21_5.anInt3462 - local42 - local34, super.aClass21_5.anInt3460);
		@Pc(117) int local117 = this.aClass9_23.method8613();
		Static488.aClass67_12.KA(arg1, arg0 + super.aClass21_5.anInt3460 - local117, super.aClass21_5.anInt3462 + arg1, super.aClass21_5.anInt3460 + arg0);
		this.aClass9_23.method8614(arg1 + local34, arg0 + super.aClass21_5.anInt3460 - local117, super.aClass21_5.anInt3462 - local42 - local34, super.aClass21_5.anInt3460);
		Static488.aClass67_12.KA(local13[0], local13[1], local13[2], local13[3]);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method8295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = this.aClass9_25.method8619() + arg0;
		@Pc(19) int local19 = arg0 + super.aClass21_5.anInt3462 - this.aClass9_22.method8619();
		@Pc(26) int local26 = arg1 + this.aClass9_26.method8613();
		@Pc(36) int local36 = super.aClass21_5.anInt3460 + arg1 - this.aClass9_23.method8613();
		@Pc(41) int local41 = local19 - local9;
		@Pc(45) int local45 = local36 - local26;
		@Pc(53) int local53 = local41 * this.method8296() / 10000;
		@Pc(56) int[] local56 = new int[4];
		Static488.aClass67_12.K(local56);
		Static488.aClass67_12.KA(local9, local26, local9 + local53, local36);
		this.method6790(local9, local26, local41, local45);
		Static488.aClass67_12.KA(local9 + local53, local26, local19, local36);
		this.aClass9_27.method8614(local9, local26, local41, local45);
		Static488.aClass67_12.KA(local56[0], local56[1], local56[2], local56[3]);
	}
}
