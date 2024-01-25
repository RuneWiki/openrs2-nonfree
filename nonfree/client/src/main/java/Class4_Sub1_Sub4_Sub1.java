import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class4_Sub1_Sub4_Sub1 extends Class4_Sub1_Sub4 implements Interface2 {

	@OriginalMember(owner = "client!ds", name = "M", descriptor = "Lclient!ro;")
	private Class297 aClass297_2;

	@OriginalMember(owner = "client!ds", name = "ab", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!ds", name = "U", descriptor = "Lclient!lm;")
	public Class207 aClass207_2;

	@OriginalMember(owner = "client!ds", name = "Y", descriptor = "Z")
	private final boolean aBoolean161;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!ha;Lclient!rq;IIIIIZIIIII)V")
	public Class4_Sub1_Sub4_Sub1(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass207_2 = new Class207(arg0, arg1, arg10, arg11, super.aByte123, arg3, this, arg7, arg12);
		this.aBoolean161 = arg1.anInt8641 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(12) Class17 local12 = this.aClass207_2.method5311(131072, false, false, arg2);
		if (local12 == null) {
			return false;
		} else {
			@Pc(26) Class39 local26 = arg2.method7546();
			local26.method7240(super.anInt8916 + super.aShort62, super.anInt8915, super.anInt8911 + super.aShort63);
			return Static279.aBoolean329 ? local12.method5420(arg1, arg0, local26, false, 0, Static401.anInt7417) : local12.method5433(arg1, arg0, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.aClass207_2.method5307();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7383(@OriginalArg(0) Class5 arg0) {
		this.aClass207_2.method5301(arg0);
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V")
	@Override
	public void method7384() {
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		if (arg0 >= -4) {
			this.aClass207_2 = null;
		}
		return this.aClass207_2.method5304(0);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)I")
	@Override
	public int method7381() {
		return this.aClass207_2.anInt6090;
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		return this.aClass297_2;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)I")
	@Override
	public int method7382() {
		return this.aClass207_2.anInt6095;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)I")
	@Override
	public int method7379() {
		return this.aClass207_2.anInt6108;
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		return false;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7380(@OriginalArg(0) Class5 arg0) {
		this.aClass207_2.method5308(arg0);
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
		@Pc(12) Class17 local12 = this.aClass207_2.method5311(262144, true, false, arg0);
		if (local12 == null) {
			return;
		}
		@Pc(24) int local24 = super.anInt8916 >> 9;
		@Pc(29) int local29 = super.anInt8911 >> 9;
		@Pc(32) Class39 local32 = arg0.method7546();
		local32.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
		this.aClass207_2.method5306(local29, local24, local12, false, arg0, local29, local24, local32);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7378() {
		return this.aClass207_2.method5310();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		@Pc(14) Class17 local14 = this.aClass207_2.method5311(2048, true, false, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(26) Class39 local26 = arg0.method7546();
		local26.method7240(super.aShort62 + super.anInt8916, super.anInt8915, super.aShort63 + super.anInt8911);
		@Pc(46) Class4_Sub8 local46 = Static271.method4457(this.aBoolean161, 1);
		@Pc(51) int local51 = super.anInt8916 >> 9;
		@Pc(56) int local56 = super.anInt8911 >> 9;
		this.aClass207_2.method5306(local56, local51, local14, true, arg0, local56, local51, local26);
		if (Static279.aBoolean329) {
			local14.method5413(local26, local46.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
		} else {
			local14.method5411(local26, local46.aClass4_Sub5Array1[0], 0);
		}
		if (this.aClass207_2.aClass4_Sub10_6 != null) {
			@Pc(98) Class85 local98 = this.aClass207_2.aClass4_Sub10_6.method7850();
			if (Static279.aBoolean329) {
				arg0.method7551(local98, Static401.anInt7417);
			} else {
				arg0.method7538(local98);
			}
		}
		this.aBoolean162 = local14.F() || this.aClass207_2.aClass4_Sub10_6 != null;
		if (this.aClass297_2 == null) {
			this.aClass297_2 = Static476.method7143(local14, super.anInt8916, super.anInt8915, super.anInt8911);
		} else {
			Static254.method4162(super.anInt8915, super.anInt8911, local14, super.anInt8916, this.aClass297_2);
		}
		return local46;
	}

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aBoolean162;
	}
}
