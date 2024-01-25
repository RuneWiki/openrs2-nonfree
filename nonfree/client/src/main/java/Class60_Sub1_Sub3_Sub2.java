import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public final class Class60_Sub1_Sub3_Sub2 extends Class60_Sub1_Sub3 implements Interface23 {

	@OriginalMember(owner = "client!sja", name = "fb", descriptor = "Lclient!sba;")
	private Class323 aClass323_8;

	@OriginalMember(owner = "client!sja", name = "T", descriptor = "Z")
	private boolean aBoolean686 = true;

	@OriginalMember(owner = "client!sja", name = "K", descriptor = "Lclient!mu;")
	public final Class240 aClass240_4;

	@OriginalMember(owner = "client!sja", name = "V", descriptor = "Z")
	private final boolean aBoolean685;

	@OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(Lclient!ha;Lclient!fw;IIIIIZIII)V")
	public Class60_Sub1_Sub3_Sub2(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static448.method6917(arg8, arg9));
		this.aClass240_4 = new Class240(arg0, arg1, arg8, arg9, super.aByte135, arg3, this, arg7, arg10);
		this.aBoolean685 = arg1.anInt3587 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "(I)I")
	@Override
	public int method7929(@OriginalArg(0) int arg0) {
		return arg0 < 70 ? 71 : this.aClass240_4.anInt6663;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method7931(@OriginalArg(1) Class75 arg0) {
		this.aClass240_4.method5918(arg0);
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		return this.aClass323_8;
	}

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(I)I")
	@Override
	public int method7932() {
		return this.aClass240_4.anInt6647;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(ILclient!ao;)V")
	public void method7936(@OriginalArg(1) Class22 arg0) {
		this.aClass240_4.method5911(arg0);
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class54 local12 = this.aClass240_4.method5914(131072, arg0, false, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(28) Class109 local28 = arg0.method6643();
			local28.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
			return Static490.aBoolean634 ? local12.method7399(arg2, arg1, local28, false, 0, Static377.anInt6468) : local12.method7417(arg2, arg1, local28, false, 0);
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(Z)I")
	@Override
	public int method7934() {
		return this.aClass240_4.anInt6660;
	}

	@OriginalMember(owner = "client!sja", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7918() {
		return this.aBoolean686;
	}

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(Z)V")
	@Override
	public void method7933() {
	}

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "(Z)I")
	@Override
	public int method7922() {
		return this.aClass240_4.method5922();
	}

	@OriginalMember(owner = "client!sja", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		@Pc(14) Class54 local14 = this.aClass240_4.method5914(2048, arg0, false, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class109 local22 = arg0.method6643();
		local22.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
		@Pc(36) Class60_Sub9 local36 = Static511.method7383(this.aBoolean685, 1);
		@Pc(41) int local41 = super.anInt9048 >> 9;
		@Pc(46) int local46 = super.anInt9057 >> 9;
		this.aClass240_4.method5920(local41, local14, local41, local46, arg0, true, local46, local22);
		if (Static490.aBoolean634) {
			local14.method7407(local22, local36.aClass60_Sub10Array1[0], Static377.anInt6468, 0);
		} else {
			local14.method7401(local22, local36.aClass60_Sub10Array1[0], 0);
		}
		if (this.aClass240_4.aClass60_Sub4_6 != null) {
			@Pc(92) Class209 local92 = this.aClass240_4.aClass60_Sub4_6.method4544();
			if (Static490.aBoolean634) {
				arg0.method6685(local92, Static377.anInt6468);
			} else {
				arg0.method6634(local92);
			}
		}
		this.aBoolean686 = local14.F() || this.aClass240_4.aClass60_Sub4_6 != null;
		if (this.aClass323_8 == null) {
			this.aClass323_8 = Static469.method7078(super.anInt9048, super.anInt9057, super.anInt9051, local14);
		} else {
			Static378.method5858(this.aClass323_8, super.anInt9057, super.anInt9048, local14, super.anInt9051);
		}
		return local36;
	}

	@OriginalMember(owner = "client!sja", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method7919() {
		return false;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class54 local12 = this.aClass240_4.method5914(262144, arg0, true, true);
		if (arg1 != 0) {
			this.method7935(117, (Class75) null);
		}
		if (local12 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt9048 >> 9;
		@Pc(32) int local32 = super.anInt9057 >> 9;
		@Pc(35) Class109 local35 = arg0.method6643();
		local35.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
		this.aClass240_4.method5920(local27, local12, local27, local32, arg0, false, local32, local35);
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sja", name = "d", descriptor = "(B)V")
	@Override
	public void method7917() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sja", name = "c", descriptor = "(B)I")
	@Override
	public int method7921(@OriginalArg(0) byte arg0) {
		return arg0 == 114 ? this.aClass240_4.method5916(104) : 38;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		if (arg0 != -18864) {
			Static561.method7937(-82);
		}
		this.aClass240_4.method5919(arg0 ^ 0xFFFFB654, arg1);
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7930() {
		return this.aClass240_4.method5913();
	}
}
