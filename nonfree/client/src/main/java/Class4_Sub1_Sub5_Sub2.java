import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class4_Sub1_Sub5_Sub2 extends Class4_Sub1_Sub5 implements Interface2 {

	@OriginalMember(owner = "client!rm", name = "P", descriptor = "Lclient!ro;")
	private Class297 aClass297_8;

	@OriginalMember(owner = "client!rm", name = "G", descriptor = "Z")
	private boolean aBoolean595 = false;

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "Lclient!lm;")
	public final Class207 aClass207_4;

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "Z")
	private final boolean aBoolean596;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!ha;Lclient!rq;IIIIIZII)V")
	public Class4_Sub1_Sub5_Sub2(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt8672);
		this.aClass207_4 = new Class207(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean596 = arg1.anInt8641 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7380(@OriginalArg(0) Class5 arg0) {
		this.aClass207_4.method5308(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		@Pc(14) Class17 local14 = this.aClass207_4.method5311(2048, true, false, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class39 local21 = arg0.method7546();
		local21.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
		@Pc(35) Class4_Sub8 local35 = Static271.method4457(this.aBoolean596, 1);
		@Pc(40) int local40 = super.anInt8916 >> 9;
		@Pc(45) int local45 = super.anInt8911 >> 9;
		this.aClass207_4.method5306(local45, local40, local14, true, arg0, local45, local40, local21);
		if (Static279.aBoolean329) {
			local14.method5413(local21, local35.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
		} else {
			local14.method5411(local21, local35.aClass4_Sub5Array1[0], 0);
		}
		if (this.aClass207_4.aClass4_Sub10_6 != null) {
			@Pc(87) Class85 local87 = this.aClass207_4.aClass4_Sub10_6.method7850();
			if (Static279.aBoolean329) {
				arg0.method7551(local87, Static401.anInt7417);
			} else {
				arg0.method7538(local87);
			}
		}
		this.aBoolean595 = local14.F() || this.aClass207_4.aClass4_Sub10_6 != null;
		if (this.aClass297_8 == null) {
			this.aClass297_8 = Static476.method7143(local14, super.anInt8916, super.anInt8915, super.anInt8911);
		} else {
			Static254.method4162(super.anInt8915, super.anInt8911, local14, super.anInt8916, this.aClass297_8);
		}
		return local35;
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		return this.aClass297_8;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)I")
	@Override
	public int method7379() {
		return this.aClass207_4.anInt6108;
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(B)V")
	@Override
	public void method7384() {
	}

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.aClass207_4.method5307();
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
		@Pc(12) Class17 local12 = this.aClass207_4.method5311(262144, true, true, arg0);
		if (local12 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt8916 >> 9;
		@Pc(28) int local28 = super.anInt8911 >> 9;
		@Pc(31) Class39 local31 = arg0.method7546();
		local31.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
		this.aClass207_4.method5306(local28, local23, local12, false, arg0, local28, local23, local31);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7378() {
		return this.aClass207_4.method5310();
	}

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aBoolean595;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7383(@OriginalArg(0) Class5 arg0) {
		this.aClass207_4.method5301(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		if (arg0 > -4) {
			this.method7689((byte) 93);
		}
		return this.aClass207_4.method5304(0);
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		return false;
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V")
	@Override
	public void method7697() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7690() {
		return false;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)I")
	@Override
	public int method7382() {
		return this.aClass207_4.anInt6095;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(12) Class17 local12 = this.aClass207_4.method5311(131072, false, false, arg2);
		if (local12 == null) {
			return false;
		} else {
			@Pc(26) Class39 local26 = arg2.method7546();
			local26.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
			return Static279.aBoolean329 ? local12.method5420(arg1, arg0, local26, false, 0, Static401.anInt7417) : local12.method5433(arg1, arg0, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)I")
	@Override
	public int method7381() {
		return this.aClass207_4.anInt6090;
	}
}
