import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class60_Sub1_Sub1_Sub4 extends Class60_Sub1_Sub1 implements Interface23 {

	@OriginalMember(owner = "client!lu", name = "Y", descriptor = "Lclient!sba;")
	private Class323 aClass323_4;

	@OriginalMember(owner = "client!lu", name = "U", descriptor = "Z")
	private boolean aBoolean448 = true;

	@OriginalMember(owner = "client!lu", name = "tb", descriptor = "Lclient!mu;")
	public Class240 aClass240_2;

	@OriginalMember(owner = "client!lu", name = "kb", descriptor = "Z")
	private final boolean aBoolean447;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!ha;Lclient!fw;IIIIIZIIIIIII)V")
	public Class60_Sub1_Sub1_Sub4(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3613 == 1, Static61.method767(arg12, arg13));
		this.aClass240_2 = new Class240(arg0, arg1, arg12, arg13, super.aByte135, arg3, this, arg7, arg14);
		this.aBoolean447 = arg1.anInt3587 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)I")
	@Override
	public int method7929(@OriginalArg(0) int arg0) {
		if (arg0 < 70) {
			this.method7935(109, (Class75) null);
		}
		return this.aClass240_2.anInt6663;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		@Pc(14) Class54 local14 = this.aClass240_2.method5914(2048, arg0, false, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class109 local22 = arg0.method6643();
		local22.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
		@Pc(36) Class60_Sub9 local36 = Static511.method7383(this.aBoolean447, 1);
		this.aClass240_2.method5920(super.aShort101, local14, super.aShort100, super.aShort99, arg0, true, super.aShort102, local22);
		if (Static490.aBoolean634) {
			local14.method7407(local22, local36.aClass60_Sub10Array1[0], Static377.anInt6468, 0);
		} else {
			local14.method7401(local22, local36.aClass60_Sub10Array1[0], 0);
		}
		if (this.aClass240_2.aClass60_Sub4_6 != null) {
			@Pc(86) Class209 local86 = this.aClass240_2.aClass60_Sub4_6.method4544();
			if (Static490.aBoolean634) {
				arg0.method6685(local86, Static377.anInt6468);
			} else {
				arg0.method6634(local86);
			}
		}
		this.aBoolean448 = local14.F() || this.aClass240_2.aClass60_Sub4_6 != null;
		if (this.aClass323_4 == null) {
			this.aClass323_4 = Static469.method7078(super.anInt9048, super.anInt9057, super.anInt9051, local14);
		} else {
			Static378.method5858(this.aClass323_4, super.anInt9057, super.anInt9048, local14, super.anInt9051);
		}
		return local36;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)V")
	@Override
	public void method7917() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ao;Z)V")
	public void method5482(@OriginalArg(0) Class22 arg0) {
		this.aClass240_2.method5911(arg0);
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(Z)I")
	@Override
	public int method7922() {
		return this.aClass240_2.method5922();
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)V")
	@Override
	public void method7933() {
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)I")
	@Override
	public int method7921(@OriginalArg(0) byte arg0) {
		if (arg0 != 114) {
			this.method7935(-59, (Class75) null);
		}
		return this.aClass240_2.method5916(112);
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7918() {
		return this.aBoolean448;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class54 local20 = this.aClass240_2.method5914(131072, arg0, false, false);
		if (local20 == null) {
			return false;
		} else {
			@Pc(28) Class109 local28 = arg0.method6643();
			local28.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
			return Static490.aBoolean634 ? local20.method7399(arg2, arg1, local28, false, 0, Static377.anInt6468) : local20.method7417(arg2, arg1, local28, false, 0);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		if (arg0 != -18864) {
			this.aClass240_2 = null;
		}
		this.aClass240_2.method5919(arg0 ^ 0xFFFFB654, arg1);
	}

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method7919() {
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)I")
	@Override
	public int method7934() {
		return this.aClass240_2.anInt6660;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)I")
	@Override
	public int method7932() {
		return this.aClass240_2.anInt6647;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class54 local12 = this.aClass240_2.method5914(262144, arg0, true, true);
		if (local12 != null) {
			@Pc(17) Class109 local17 = arg0.method6643();
			local17.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
			this.aClass240_2.method5920(super.aShort101, local12, super.aShort100, super.aShort99, arg0, false, super.aShort102, local17);
		}
		if (arg1 != 0) {
			Static360.anInt6091 = 93;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		return this.aClass323_4;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method7931(@OriginalArg(1) Class75 arg0) {
		this.aClass240_2.method5918(arg0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7930() {
		return this.aClass240_2.method5913();
	}
}
