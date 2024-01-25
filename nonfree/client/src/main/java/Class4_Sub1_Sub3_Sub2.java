import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class4_Sub1_Sub3_Sub2 extends Class4_Sub1_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!haa", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!haa", name = "Z", descriptor = "Lclient!ro;")
	private Class297 aClass297_5;

	@OriginalMember(owner = "client!haa", name = "hb", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!haa", name = "T", descriptor = "Z")
	private boolean aBoolean261;

	@OriginalMember(owner = "client!haa", name = "S", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!haa", name = "W", descriptor = "Z")
	private final boolean aBoolean262;

	@OriginalMember(owner = "client!haa", name = "G", descriptor = "Z")
	private final boolean aBoolean259;

	@OriginalMember(owner = "client!haa", name = "jb", descriptor = "S")
	private final short aShort54;

	@OriginalMember(owner = "client!haa", name = "R", descriptor = "Z")
	private final boolean aBoolean260;

	@OriginalMember(owner = "client!haa", name = "X", descriptor = "Lclient!ka;")
	public Class17 aClass17_3;

	@OriginalMember(owner = "client!haa", name = "D", descriptor = "Lclient!r;")
	private Class3_Sub4_Sub5 aClass3_Sub4_Sub5_3;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!ha;Lclient!rq;IIIIIZIIZ)V")
	public Class4_Sub1_Sub3_Sub2(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static414.method6546(arg9, arg8));
		this.aByte61 = (byte) arg9;
		this.aBoolean261 = arg10;
		this.aByte60 = (byte) arg8;
		super.anInt8916 = arg4;
		this.aBoolean262 = arg1.anInt8641 != 0 && !arg7;
		this.aBoolean259 = arg7;
		super.anInt8911 = arg6;
		this.aShort54 = (short) arg1.anInt8677;
		this.aBoolean260 = arg0.method7494() && arg1.aBoolean600 && !this.aBoolean259 && Static262.aClass3_Sub27_12.aClass21_Sub5_1.method1474() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean261) {
			local66 |= 0x10000;
		}
		@Pc(81) Class216 local81 = this.method3470(this.aBoolean260, arg0, local66);
		if (local81 != null) {
			this.aClass17_3 = local81.aClass17_6;
			this.aClass3_Sub4_Sub5_3 = local81.aClass3_Sub4_Sub5_6;
			if (this.aBoolean261) {
				this.aClass17_3 = this.aClass17_3.method5409((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)I")
	@Override
	public int method7379() {
		return this.aByte61;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7383(@OriginalArg(0) Class5 arg0) {
		@Pc(19) Class3_Sub4_Sub5 local19;
		if (this.aClass3_Sub4_Sub5_3 == null && this.aBoolean260) {
			@Pc(30) Class216 local30 = this.method3470(true, arg0, 262144);
			local19 = local30 == null ? null : local30.aClass3_Sub4_Sub5_6;
		} else {
			local19 = this.aClass3_Sub4_Sub5_3;
			this.aClass3_Sub4_Sub5_3 = null;
		}
		if (local19 != null) {
			Static112.method2304(local19, super.aByte124, super.anInt8916, super.anInt8911, null);
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class4_Sub1_Sub3_Sub2) {
			@Pc(37) Class4_Sub1_Sub3_Sub2 local37 = (Class4_Sub1_Sub3_Sub2) arg1;
			if (this.aClass17_3 == null || local37.aClass17_3 == null) {
				return;
			}
			this.aClass17_3.method5429(local37.aClass17_3, arg0, arg3, arg5, arg4);
		} else if (arg1 instanceof Class4_Sub1_Sub2_Sub2) {
			@Pc(18) Class4_Sub1_Sub2_Sub2 local18 = (Class4_Sub1_Sub2_Sub2) arg1;
			if (this.aClass17_3 != null && local18.aClass17_1 != null) {
				this.aClass17_3.method5429(local18.aClass17_1, arg0, arg3, arg5, arg4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7690() {
		return this.aBoolean261;
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		if (arg0 > -4) {
			Static199.anInt3911 = 29;
		}
		return this.aClass17_3 == null ? 0 : this.aClass17_3.ma();
	}

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		if (this.aClass17_3 == null) {
			return true;
		} else {
			return !this.aClass17_3.r();
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZLclient!ha;I)Lclient!mg;")
	private Class216 method3470(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class299 local20 = Static105.aClass302_1.method7466(this.aShort54 & 0xFFFF);
		@Pc(28) Class51 local28;
		@Pc(36) Class51 local36;
		if (this.aBoolean259) {
			local28 = Static2.aClass51Array1[super.aByte124];
			local36 = Static559.aClass51Array4[0];
		} else {
			local28 = Static559.aClass51Array4[super.aByte124];
			if (super.aByte124 >= 3) {
				local36 = null;
			} else {
				local36 = Static559.aClass51Array4[super.aByte124 + 1];
			}
		}
		return local20.method7408(super.anInt8916, this.aByte61, arg0, super.anInt8911, this.aByte60, arg2, arg1, super.anInt8915, local28, local36);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)I")
	@Override
	public int method7381() {
		return this.aShort54 & 0xFFFF;
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(B)V")
	@Override
	public void method7384() {
		if (this.aClass17_3 != null) {
			this.aClass17_3.method5426();
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)I")
	@Override
	public int method7382() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		if (this.aClass17_3 == null) {
			return null;
		}
		@Pc(17) Class39 local17 = arg0.method7546();
		local17.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
		@Pc(31) Class4_Sub8 local31 = Static271.method4457(this.aBoolean262, 1);
		if (Static279.aBoolean329) {
			this.aClass17_3.method5413(local17, local31.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
		} else {
			this.aClass17_3.method5411(local17, local31.aClass4_Sub5Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.aClass17_3 == null ? 0 : this.aClass17_3.fa();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(15) Class17 local15 = this.method3471(arg2, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class39 local20 = arg2.method7546();
			local20.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
			return Static279.aBoolean329 ? local15.method5420(arg1, arg0, local20, false, 0, Static401.anInt7417) : local15.method5433(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7378() {
		return this.aBoolean260;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class17 method3471(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass17_3 != null && arg0.method7541(this.aClass17_3.ua(), arg1) == 0) {
			return this.aClass17_3;
		} else {
			@Pc(30) Class216 local30 = this.method3470(false, arg0, arg1);
			return local30 == null ? null : local30.aClass17_6;
		}
	}

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aClass17_3 == null ? false : this.aClass17_3.F();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7380(@OriginalArg(0) Class5 arg0) {
		@Pc(14) Class3_Sub4_Sub5 local14;
		if (this.aClass3_Sub4_Sub5_3 == null && this.aBoolean260) {
			@Pc(25) Class216 local25 = this.method3470(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass3_Sub4_Sub5_6;
		} else {
			local14 = this.aClass3_Sub4_Sub5_3;
			this.aClass3_Sub4_Sub5_3 = null;
		}
		if (local14 != null) {
			Static145.method2663(local14, super.aByte124, super.anInt8916, super.anInt8911, null);
		}
	}

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)V")
	@Override
	public void method7697() {
		this.aBoolean261 = false;
		if (this.aClass17_3 != null) {
			this.aClass17_3.s(this.aClass17_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		if (this.aClass297_5 == null) {
			this.aClass297_5 = Static476.method7143(this.method3471(arg0, 0), super.anInt8916, super.anInt8915, super.anInt8911);
		}
		return this.aClass297_5;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
	}
}
