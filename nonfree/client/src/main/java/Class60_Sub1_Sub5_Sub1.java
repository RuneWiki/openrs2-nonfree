import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class60_Sub1_Sub5_Sub1 extends Class60_Sub1_Sub5 implements Interface23 {

	@OriginalMember(owner = "client!oia", name = "jb", descriptor = "Lclient!sba;")
	private Class323 aClass323_6;

	@OriginalMember(owner = "client!oia", name = "hb", descriptor = "Z")
	private boolean aBoolean548 = true;

	@OriginalMember(owner = "client!oia", name = "O", descriptor = "Lclient!mu;")
	public final Class240 aClass240_3;

	@OriginalMember(owner = "client!oia", name = "T", descriptor = "Z")
	private final boolean aBoolean547;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lclient!ha;Lclient!fw;IIIIIZIIIII)V")
	public Class60_Sub1_Sub5_Sub1(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass240_3 = new Class240(arg0, arg1, arg10, arg11, super.aByte135, arg3, this, arg7, arg12);
		this.aBoolean547 = arg1.anInt3587 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class54 local12 = this.aClass240_3.method5914(131072, arg0, false, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(20) Class109 local20 = arg0.method6643();
			local20.method4606(super.anInt9048 + super.aShort113, super.anInt9051, super.aShort112 + super.anInt9057);
			return Static490.aBoolean634 ? local12.method7399(arg2, arg1, local20, false, 0, Static377.anInt6468) : local12.method7417(arg2, arg1, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "(I)I")
	@Override
	public int method7929(@OriginalArg(0) int arg0) {
		if (arg0 < 70) {
			this.aBoolean548 = false;
		}
		return this.aClass240_3.anInt6663;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		return this.aClass323_6;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILclient!ao;)V")
	public void method6563(@OriginalArg(1) Class22 arg0) {
		this.aClass240_3.method5911(arg0);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Z)I")
	@Override
	public int method7934() {
		return this.aClass240_3.anInt6660;
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(Z)V")
	@Override
	public void method7933() {
	}

	@OriginalMember(owner = "client!oia", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method7919() {
		return false;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			Static429.aBoolean549 = true;
		}
		@Pc(18) Class54 local18 = this.aClass240_3.method5914(262144, arg0, false, true);
		if (local18 == null) {
			return;
		}
		@Pc(25) int local25 = super.anInt9048 >> 9;
		@Pc(30) int local30 = super.anInt9057 >> 9;
		@Pc(33) Class109 local33 = arg0.method6643();
		local33.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
		this.aClass240_3.method5920(local25, local18, local25, local30, arg0, false, local30, local33);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7930() {
		return this.aClass240_3.method5913();
	}

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "(Z)I")
	@Override
	public int method7922() {
		return this.aClass240_3.method5922();
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		@Pc(14) Class54 local14 = this.aClass240_3.method5914(2048, arg0, false, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class109 local22 = arg0.method6643();
		local22.method4606(super.anInt9048 + super.aShort113, super.anInt9051, super.anInt9057 + super.aShort112);
		@Pc(43) Class60_Sub9 local43 = Static511.method7383(this.aBoolean547, 1);
		@Pc(48) int local48 = super.anInt9048 >> 9;
		@Pc(53) int local53 = super.anInt9057 >> 9;
		this.aClass240_3.method5920(local48, local14, local48, local53, arg0, true, local53, local22);
		if (Static490.aBoolean634) {
			local14.method7407(local22, local43.aClass60_Sub10Array1[0], Static377.anInt6468, 0);
		} else {
			local14.method7401(local22, local43.aClass60_Sub10Array1[0], 0);
		}
		if (this.aClass240_3.aClass60_Sub4_6 != null) {
			@Pc(99) Class209 local99 = this.aClass240_3.aClass60_Sub4_6.method4544();
			if (Static490.aBoolean634) {
				arg0.method6685(local99, Static377.anInt6468);
			} else {
				arg0.method6634(local99);
			}
		}
		this.aBoolean548 = local14.F() || this.aClass240_3.aClass60_Sub4_6 != null;
		if (this.aClass323_6 == null) {
			this.aClass323_6 = Static469.method7078(super.anInt9048, super.anInt9057, super.anInt9051, local14);
		} else {
			Static378.method5858(this.aClass323_6, super.anInt9057, super.anInt9048, local14, super.anInt9051);
		}
		return local43;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method7931(@OriginalArg(1) Class75 arg0) {
		this.aClass240_3.method5918(arg0);
	}

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "(B)I")
	@Override
	public int method7921(@OriginalArg(0) byte arg0) {
		if (arg0 != 114) {
			this.aClass323_6 = null;
		}
		return this.aClass240_3.method5916(98);
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)I")
	@Override
	public int method7932() {
		return this.aClass240_3.anInt6647;
	}

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7918() {
		return this.aBoolean548;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		this.aClass240_3.method5919(4, arg1);
		if (arg0 != -18864) {
			this.method7929(11);
		}
	}
}
