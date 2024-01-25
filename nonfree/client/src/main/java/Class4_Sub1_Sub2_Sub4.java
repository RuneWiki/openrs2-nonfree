import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class4_Sub1_Sub2_Sub4 extends Class4_Sub1_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "Lclient!ro;")
	private Class297 aClass297_7;

	@OriginalMember(owner = "client!ki", name = "R", descriptor = "Z")
	private boolean aBoolean348 = false;

	@OriginalMember(owner = "client!ki", name = "T", descriptor = "Lclient!lm;")
	public final Class207 aClass207_3;

	@OriginalMember(owner = "client!ki", name = "P", descriptor = "Z")
	private final boolean aBoolean347;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!ha;Lclient!rq;IIIIIZIIIIIII)V")
	public Class4_Sub1_Sub2_Sub4(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8654 == 1, Static458.method7005(arg12, arg13));
		this.aClass207_3 = new Class207(arg0, arg1, arg12, arg13, super.aByte123, arg3, this, arg7, arg14);
		this.aBoolean347 = arg1.anInt8641 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7383(@OriginalArg(0) Class5 arg0) {
		this.aClass207_3.method5301(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
	@Override
	public void method7697() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
		@Pc(16) Class17 local16 = this.aClass207_3.method5311(262144, true, true, arg0);
		if (local16 != null) {
			@Pc(21) Class39 local21 = arg0.method7546();
			local21.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
			this.aClass207_3.method5306(super.aShort116, super.aShort117, local16, false, arg0, super.aShort119, super.aShort118, local21);
		}
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7690() {
		return false;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
	@Override
	public void method7384() {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
	@Override
	public int method7381() {
		return this.aClass207_3.anInt6090;
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		if (arg0 >= -4) {
			this.method7379();
		}
		return this.aClass207_3.method5304(0);
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		return this.aClass297_7;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7380(@OriginalArg(0) Class5 arg0) {
		this.aClass207_3.method5308(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		return false;
	}

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.aClass207_3.method5307();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		@Pc(14) Class17 local14 = this.aClass207_3.method5311(2048, true, false, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(27) Class39 local27 = arg0.method7546();
		local27.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
		@Pc(41) Class4_Sub8 local41 = Static271.method4457(this.aBoolean347, 1);
		this.aClass207_3.method5306(super.aShort116, super.aShort117, local14, true, arg0, super.aShort119, super.aShort118, local27);
		if (Static279.aBoolean329) {
			local14.method5413(local27, local41.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
		} else {
			local14.method5411(local27, local41.aClass4_Sub5Array1[0], 0);
		}
		if (this.aClass207_3.aClass4_Sub10_6 != null) {
			@Pc(87) Class85 local87 = this.aClass207_3.aClass4_Sub10_6.method7850();
			if (Static279.aBoolean329) {
				arg0.method7551(local87, Static401.anInt7417);
			} else {
				arg0.method7538(local87);
			}
		}
		this.aBoolean348 = local14.F() || this.aClass207_3.aClass4_Sub10_6 != null;
		if (this.aClass297_7 == null) {
			this.aClass297_7 = Static476.method7143(local14, super.anInt8916, super.anInt8915, super.anInt8911);
		} else {
			Static254.method4162(super.anInt8915, super.anInt8911, local14, super.anInt8916, this.aClass297_7);
		}
		return local41;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)I")
	@Override
	public int method7379() {
		return this.aClass207_3.anInt6108;
	}

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aBoolean348;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7378() {
		return this.aClass207_3.method5310();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(12) Class17 local12 = this.aClass207_3.method5311(131072, false, false, arg2);
		if (local12 == null) {
			return false;
		} else {
			@Pc(25) Class39 local25 = arg2.method7546();
			local25.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
			return Static279.aBoolean329 ? local12.method5420(arg1, arg0, local25, false, 0, Static401.anInt7417) : local12.method5433(arg1, arg0, local25, false, 0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I")
	@Override
	public int method7382() {
		return this.aClass207_3.anInt6095;
	}
}
