import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class4_Sub1_Sub3_Sub1 extends Class4_Sub1_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!dca", name = "D", descriptor = "Lclient!ro;")
	private Class297 aClass297_1;

	@OriginalMember(owner = "client!dca", name = "P", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!dca", name = "eb", descriptor = "Lclient!lm;")
	public Class207 aClass207_1;

	@OriginalMember(owner = "client!dca", name = "K", descriptor = "Z")
	private final boolean aBoolean145;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!ha;Lclient!rq;IIIIIZIII)V")
	public Class4_Sub1_Sub3_Sub1(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static397.method6415(arg9, arg8));
		this.aClass207_1 = new Class207(arg0, arg1, arg8, arg9, super.aByte123, arg3, this, arg7, arg10);
		this.aBoolean145 = arg1.anInt8641 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(B)I")
	@Override
	public int method7382() {
		return this.aClass207_1.anInt6095;
	}

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.aClass207_1.method5307();
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7380(@OriginalArg(0) Class5 arg0) {
		this.aClass207_1.method5308(arg0);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(12) Class17 local12 = this.aClass207_1.method5311(131072, false, false, arg2);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class39 local19 = arg2.method7546();
			local19.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
			return Static279.aBoolean329 ? local12.method5420(arg1, arg0, local19, false, 0, Static401.anInt7417) : local12.method5433(arg1, arg0, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aBoolean146;
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
		@Pc(16) Class17 local16 = this.aClass207_1.method5311(262144, true, true, arg0);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8916 >> 9;
		@Pc(28) int local28 = super.anInt8911 >> 9;
		@Pc(31) Class39 local31 = arg0.method7546();
		local31.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
		this.aClass207_1.method5306(local28, local23, local16, false, arg0, local28, local23, local31);
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)I")
	@Override
	public int method7379() {
		return this.aClass207_1.anInt6108;
	}

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		return false;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		@Pc(21) Class17 local21 = this.aClass207_1.method5311(2048, true, false, arg0);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class39 local28 = arg0.method7546();
		local28.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
		@Pc(42) Class4_Sub8 local42 = Static271.method4457(this.aBoolean145, 1);
		@Pc(47) int local47 = super.anInt8916 >> 9;
		@Pc(52) int local52 = super.anInt8911 >> 9;
		this.aClass207_1.method5306(local52, local47, local21, true, arg0, local52, local47, local28);
		if (Static279.aBoolean329) {
			local21.method5413(local28, local42.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
		} else {
			local21.method5411(local28, local42.aClass4_Sub5Array1[0], 0);
		}
		if (this.aClass207_1.aClass4_Sub10_6 != null) {
			@Pc(94) Class85 local94 = this.aClass207_1.aClass4_Sub10_6.method7850();
			if (Static279.aBoolean329) {
				arg0.method7551(local94, Static401.anInt7417);
			} else {
				arg0.method7538(local94);
			}
		}
		this.aBoolean146 = local21.F() || this.aClass207_1.aClass4_Sub10_6 != null;
		if (this.aClass297_1 == null) {
			this.aClass297_1 = Static476.method7143(local21, super.anInt8916, super.anInt8915, super.anInt8911);
		} else {
			Static254.method4162(super.anInt8915, super.anInt8911, local21, super.anInt8916, this.aClass297_1);
		}
		return local42;
	}

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		if (arg0 > -4) {
			this.aClass207_1 = null;
		}
		return this.aClass207_1.method5304(0);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7383(@OriginalArg(0) Class5 arg0) {
		this.aClass207_1.method5301(arg0);
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		return this.aClass297_1;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)I")
	@Override
	public int method7381() {
		return this.aClass207_1.anInt6090;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "(I)V")
	@Override
	public void method7697() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(B)V")
	@Override
	public void method7384() {
	}

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7690() {
		return false;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7378() {
		return this.aClass207_1.method5310();
	}
}
