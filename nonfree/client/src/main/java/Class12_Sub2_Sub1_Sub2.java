import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class12_Sub2_Sub1_Sub2 extends Class12_Sub2_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "Z")
	public static boolean lb = false;

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "Lclient!rn;")
	private Class305 aClass305_7;

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "Z")
	private boolean aBoolean647 = false;

	@OriginalMember(owner = "client!sa", name = "mb", descriptor = "Lclient!nia;")
	public final Class246 aClass246_4;

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "Z")
	private final boolean aBoolean648;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!ha;Lclient!kv;IIIIIZIII)V")
	public Class12_Sub2_Sub1_Sub2(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static617.method8661(arg8, arg9));
		this.aClass246_4 = new Class246(arg0, arg1, arg8, arg9, super.aByte146, arg3, this, arg7, arg10);
		this.aBoolean648 = arg1.anInt6045 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		@Pc(14) Class80 local14 = this.aClass246_4.method5944(2048, arg0, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class26 local21 = arg0.method7923();
		local21.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
		@Pc(35) Class12_Sub8 local35 = Static291.method4323(this.aBoolean648, 1);
		@Pc(40) int local40 = super.anInt10998 >> 9;
		@Pc(52) int local52 = super.anInt11002 >> 9;
		this.aClass246_4.method5947(local52, local14, local52, local40, local40, true, local21, arg0);
		if (Static401.aBoolean511) {
			local14.method6375(local21, local35.aClass12_Sub1Array1[0], Static331.anInt6277, 0);
		} else {
			local14.method6391(local21, local35.aClass12_Sub1Array1[0], 0);
		}
		if (this.aClass246_4.aClass12_Sub4_6 != null) {
			@Pc(94) Class196 local94 = this.aClass246_4.aClass12_Sub4_6.method1613();
			if (Static401.aBoolean511) {
				arg0.method7942(local94, Static331.anInt6277);
			} else {
				arg0.method7917(local94);
			}
		}
		this.aBoolean647 = local14.F() || this.aClass246_4.aClass12_Sub4_6 != null;
		if (this.aClass305_7 == null) {
			this.aClass305_7 = Static662.method9180(super.anInt10998, local14, super.anInt11002, super.anInt10997);
		} else {
			Static396.method5937(local14, super.anInt10998, this.aClass305_7, super.anInt11002, super.anInt10997);
		}
		return local35;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)I")
	@Override
	public int method9174() {
		return this.aClass246_4.anInt7309;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9177(@OriginalArg(1) Class137 arg0) {
		this.aClass246_4.method5946(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
	@Override
	public void method9158() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9160() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method9161() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)I")
	@Override
	public int method9149(@OriginalArg(0) int arg0) {
		if (arg0 != -1760267218) {
			this.method9149(-108);
		}
		return this.aClass246_4.method5950(1);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)I")
	@Override
	public int method9175() {
		return this.aClass246_4.anInt7314;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I")
	@Override
	public int method9171() {
		return this.aClass246_4.anInt7308;
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9150() {
		return this.aBoolean647;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	@Override
	public void method9176() {
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		return this.aClass305_7;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
		@Pc(16) Class80 local16 = this.aClass246_4.method5944(262144, arg0, true, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt10998 >> 9;
		@Pc(28) int local28 = super.anInt11002 >> 9;
		@Pc(31) Class26 local31 = arg0.method7923();
		local31.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
		this.aClass246_4.method5947(local28, local16, local28, local23, local23, false, local31, arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(18) Class80 local18 = this.aClass246_4.method5944(131072, arg2, false, false);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class26 local25 = arg2.method7923();
			local25.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
			return Static401.aBoolean511 ? local18.method6386(arg0, arg1, local25, false, 0, Static331.anInt6277) : local18.method6380(arg0, arg1, local25, false, 0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLclient!mi;)V")
	public void method7614(@OriginalArg(1) Class232 arg0) {
		this.aClass246_4.method5948(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9172(@OriginalArg(1) Class137 arg0) {
		this.aClass246_4.method5939(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9173() {
		return this.aClass246_4.method5949();
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)I")
	@Override
	public int method9159() {
		return this.aClass246_4.method5940();
	}
}
