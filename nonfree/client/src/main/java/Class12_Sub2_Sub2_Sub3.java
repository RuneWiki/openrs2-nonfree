import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class12_Sub2_Sub2_Sub3 extends Class12_Sub2_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "Lclient!rn;")
	private Class305 aClass305_4;

	@OriginalMember(owner = "client!gf", name = "hb", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!gf", name = "db", descriptor = "Lclient!nia;")
	public final Class246 aClass246_2;

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "Z")
	private final boolean aBoolean270;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!ha;Lclient!kv;IIIIIZIIIIIII)V")
	public Class12_Sub2_Sub2_Sub3(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt6007 == 1, Static494.method7324(arg12, arg13));
		this.aClass246_2 = new Class246(arg0, arg1, arg12, arg13, super.aByte146, arg3, this, arg7, arg14);
		this.aBoolean270 = arg1.anInt6045 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)I")
	@Override
	public int method9174() {
		return this.aClass246_2.anInt7309;
	}

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
	@Override
	public void method9158() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9160() {
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)I")
	@Override
	public int method9159() {
		return this.aClass246_2.method5940();
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method9161() {
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9173() {
		return this.aClass246_2.method5949();
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
		@Pc(16) Class80 local16 = this.aClass246_2.method5944(262144, arg0, true, true);
		if (local16 != null) {
			@Pc(21) Class26 local21 = arg0.method7923();
			local21.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
			this.aClass246_2.method5947(super.aShort110, local16, super.aShort109, super.aShort111, super.aShort112, false, local21, arg0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)I")
	@Override
	public int method9175() {
		return this.aClass246_2.anInt7314;
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9150() {
		return this.aBoolean271;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		@Pc(14) Class80 local14 = this.aClass246_2.method5944(2048, arg0, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(28) Class26 local28 = arg0.method7923();
		local28.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
		@Pc(44) Class12_Sub8 local44 = Static291.method4323(this.aBoolean270, 1);
		this.aClass246_2.method5947(super.aShort110, local14, super.aShort109, super.aShort111, super.aShort112, true, local28, arg0);
		if (Static401.aBoolean511) {
			local14.method6375(local28, local44.aClass12_Sub1Array1[0], Static331.anInt6277, 0);
		} else {
			local14.method6391(local28, local44.aClass12_Sub1Array1[0], 0);
		}
		if (this.aClass246_2.aClass12_Sub4_6 != null) {
			@Pc(90) Class196 local90 = this.aClass246_2.aClass12_Sub4_6.method1613();
			if (Static401.aBoolean511) {
				arg0.method7942(local90, Static331.anInt6277);
			} else {
				arg0.method7917(local90);
			}
		}
		this.aBoolean271 = local14.F() || this.aClass246_2.aClass12_Sub4_6 != null;
		if (this.aClass305_4 == null) {
			this.aClass305_4 = Static662.method9180(super.anInt10998, local14, super.anInt11002, super.anInt10997);
		} else {
			Static396.method5937(local14, super.anInt10998, this.aClass305_4, super.anInt11002, super.anInt10997);
		}
		return local44;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!mi;)V")
	public void method2907(@OriginalArg(1) Class232 arg0) {
		this.aClass246_2.method5948(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	@Override
	public int method9171() {
		return this.aClass246_2.anInt7308;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9172(@OriginalArg(1) Class137 arg0) {
		this.aClass246_2.method5939(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)I")
	@Override
	public int method9149(@OriginalArg(0) int arg0) {
		if (arg0 != -1760267218) {
			this.method9160();
		}
		return this.aClass246_2.method5950(1);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		return this.aClass305_4;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	@Override
	public void method9176() {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(12) Class80 local12 = this.aClass246_2.method5944(131072, arg2, false, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(29) Class26 local29 = arg2.method7923();
			local29.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
			return Static401.aBoolean511 ? local12.method6386(arg0, arg1, local29, false, 0, Static331.anInt6277) : local12.method6380(arg0, arg1, local29, false, 0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9177(@OriginalArg(1) Class137 arg0) {
		this.aClass246_2.method5946(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
