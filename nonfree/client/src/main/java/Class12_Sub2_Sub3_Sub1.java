import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class12_Sub2_Sub3_Sub1 extends Class12_Sub2_Sub3 implements Interface19 {

	@OriginalMember(owner = "client!bs", name = "lb", descriptor = "I")
	public static int lb = 2;

	@OriginalMember(owner = "client!bs", name = "Y", descriptor = "Lclient!rn;")
	private Class305 aClass305_2;

	@OriginalMember(owner = "client!bs", name = "Z", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!bs", name = "V", descriptor = "Lclient!nia;")
	public final Class246 aClass246_1;

	@OriginalMember(owner = "client!bs", name = "gb", descriptor = "Z")
	private final boolean aBoolean114;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!ha;Lclient!kv;IIIIIZIIIII)V")
	public Class12_Sub2_Sub3_Sub1(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass246_1 = new Class246(arg0, arg1, arg10, arg11, super.aByte146, arg3, this, arg7, arg12);
		this.aBoolean114 = arg1.anInt6045 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9150() {
		return this.aBoolean113;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9177(@OriginalArg(1) Class137 arg0) {
		this.aClass246_1.method5946(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9172(@OriginalArg(1) Class137 arg0) {
		this.aClass246_1.method5939(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method9161() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)I")
	@Override
	public int method9174() {
		return this.aClass246_1.anInt7309;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		@Pc(14) Class80 local14 = this.aClass246_1.method5944(2048, arg0, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class26 local21 = arg0.method7923();
		local21.method6457(super.aShort119 + super.anInt10998, super.anInt10997, super.anInt11002 + super.aShort120);
		@Pc(43) Class12_Sub8 local43 = Static291.method4323(this.aBoolean114, 1);
		@Pc(48) int local48 = super.anInt10998 >> 9;
		@Pc(53) int local53 = super.anInt11002 >> 9;
		this.aClass246_1.method5947(local53, local14, local53, local48, local48, true, local21, arg0);
		if (Static401.aBoolean511) {
			local14.method6375(local21, local43.aClass12_Sub1Array1[0], Static331.anInt6277, 0);
		} else {
			local14.method6391(local21, local43.aClass12_Sub1Array1[0], 0);
		}
		if (this.aClass246_1.aClass12_Sub4_6 != null) {
			@Pc(95) Class196 local95 = this.aClass246_1.aClass12_Sub4_6.method1613();
			if (Static401.aBoolean511) {
				arg0.method7942(local95, Static331.anInt6277);
			} else {
				arg0.method7917(local95);
			}
		}
		this.aBoolean113 = local14.F() || this.aClass246_1.aClass12_Sub4_6 != null;
		if (this.aClass305_2 == null) {
			this.aClass305_2 = Static662.method9180(super.anInt10998, local14, super.anInt11002, super.anInt10997);
		} else {
			Static396.method5937(local14, super.anInt10998, this.aClass305_2, super.anInt11002, super.anInt10997);
		}
		return local43;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)I")
	@Override
	public int method9159() {
		return this.aClass246_1.method5940();
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		return this.aClass305_2;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLclient!mi;)V")
	public void method1183(@OriginalArg(1) Class232 arg0) {
		this.aClass246_1.method5948(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)I")
	@Override
	public int method9171() {
		return this.aClass246_1.anInt7308;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
	@Override
	public void method9176() {
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(12) Class80 local12 = this.aClass246_1.method5944(131072, arg2, false, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(24) Class26 local24 = arg2.method7923();
			local24.method6457(super.aShort119 + super.anInt10998, super.anInt10997, super.aShort120 + super.anInt11002);
			return Static401.aBoolean511 ? local12.method6386(arg0, arg1, local24, false, 0, Static331.anInt6277) : local12.method6380(arg0, arg1, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9173() {
		return this.aClass246_1.method5949();
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)I")
	@Override
	public int method9149(@OriginalArg(0) int arg0) {
		if (arg0 != -1760267218) {
			this.method9154(-3, 90, (Class137) null);
		}
		return this.aClass246_1.method5950(1);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)I")
	@Override
	public int method9175() {
		return this.aClass246_1.anInt7314;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
		@Pc(12) Class80 local12 = this.aClass246_1.method5944(262144, arg0, true, false);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10998 >> 9;
		@Pc(24) int local24 = super.anInt11002 >> 9;
		@Pc(27) Class26 local27 = arg0.method7923();
		local27.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
		this.aClass246_1.method5947(local24, local12, local24, local19, local19, false, local27, arg0);
	}
}
