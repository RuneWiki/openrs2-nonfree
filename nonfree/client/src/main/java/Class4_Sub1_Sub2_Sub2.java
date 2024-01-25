import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class4_Sub1_Sub2_Sub2 extends Class4_Sub1_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "Lclient!ro;")
	private Class297 aClass297_3;

	@OriginalMember(owner = "client!eb", name = "gb", descriptor = "Z")
	private final boolean aBoolean169;

	@OriginalMember(owner = "client!eb", name = "nb", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!eb", name = "kb", descriptor = "S")
	private final short aShort40;

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "Z")
	private final boolean aBoolean168;

	@OriginalMember(owner = "client!eb", name = "jb", descriptor = "B")
	private final byte aByte32;

	@OriginalMember(owner = "client!eb", name = "hb", descriptor = "Z")
	private final boolean aBoolean170;

	@OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lclient!ka;")
	public Class17 aClass17_1;

	@OriginalMember(owner = "client!eb", name = "pb", descriptor = "Lclient!r;")
	private Class3_Sub4_Sub5 aClass3_Sub4_Sub5_1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!ha;Lclient!rq;IIIIIZIIIIIIZ)V")
	public Class4_Sub1_Sub2_Sub2(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8654 == 1, Static398.method6436(arg13, arg12));
		this.aBoolean169 = arg1.anInt8641 != 0 && !arg7;
		this.aBoolean171 = arg14;
		super.aByte124 = (byte) arg3;
		this.aShort40 = (short) arg1.anInt8677;
		this.aByte31 = (byte) arg12;
		this.aBoolean168 = arg7;
		this.aByte32 = (byte) arg13;
		this.aBoolean170 = arg0.method7494() && arg1.aBoolean600 && !this.aBoolean168 && Static262.aClass3_Sub27_12.aClass21_Sub5_1.method1474() != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean171) {
			local78 |= 0x10000;
		}
		@Pc(93) Class216 local93 = this.method2358(local78, this.aBoolean170, arg0);
		if (local93 != null) {
			this.aClass17_1 = local93.aClass17_6;
			this.aClass3_Sub4_Sub5_1 = local93.aClass3_Sub4_Sub5_6;
			if (this.aBoolean171) {
				this.aClass17_1 = this.aClass17_1.method5409((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		if (arg0 >= -4) {
			Static115.anInt2494 = 35;
		}
		return this.aClass17_1 == null ? 0 : this.aClass17_1.ma();
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(B)I")
	public int method2357() {
		return this.aClass17_1 == null ? 15 : this.aClass17_1.na() / 4;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIZLclient!ha;)Lclient!mg;")
	private Class216 method2358(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(13) Class299 local13 = Static105.aClass302_1.method7466(this.aShort40 & 0xFFFF);
		@Pc(27) Class51 local27;
		@Pc(33) Class51 local33;
		if (this.aBoolean168) {
			local33 = Static559.aClass51Array4[0];
			local27 = Static2.aClass51Array1[super.aByte124];
		} else {
			local27 = Static559.aClass51Array4[super.aByte124];
			if (super.aByte124 >= 3) {
				local33 = null;
			} else {
				local33 = Static559.aClass51Array4[super.aByte124 + 1];
			}
		}
		return local13.method7408(super.anInt8916, this.aByte31 == 11 ? this.aByte32 + 4 : this.aByte32, arg1, super.anInt8911, this.aByte31 == 11 ? 10 : this.aByte31, arg0, arg2, super.anInt8915, local27, local33);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
	@Override
	public void method7384() {
		if (this.aClass17_1 != null) {
			this.aClass17_1.method5426();
		}
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.aClass17_1 == null ? 0 : this.aClass17_1.fa();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		if (this.aClass17_1 == null) {
			return null;
		}
		@Pc(19) Class39 local19 = arg0.method7546();
		local19.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
		@Pc(33) Class4_Sub8 local33 = Static271.method4457(this.aBoolean169, 1);
		if (Static279.aBoolean329) {
			this.aClass17_1.method5413(local19, local33.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
		} else {
			this.aClass17_1.method5411(local19, local33.aClass4_Sub5Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	@Override
	public void method7697() {
		this.aBoolean171 = false;
		if (this.aClass17_1 != null) {
			this.aClass17_1.s(this.aClass17_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7378() {
		return this.aBoolean170;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class4_Sub1_Sub3_Sub2) {
			@Pc(32) Class4_Sub1_Sub3_Sub2 local32 = (Class4_Sub1_Sub3_Sub2) arg1;
			if (this.aClass17_1 != null && local32.aClass17_3 != null) {
				this.aClass17_1.method5429(local32.aClass17_3, arg0, arg3, arg5, arg4);
			}
		} else if (arg1 instanceof Class4_Sub1_Sub2_Sub2) {
			@Pc(12) Class4_Sub1_Sub2_Sub2 local12 = (Class4_Sub1_Sub2_Sub2) arg1;
			if (this.aClass17_1 != null && local12.aClass17_1 != null) {
				this.aClass17_1.method5429(local12.aClass17_1, arg0, arg3, arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7690() {
		return this.aBoolean171;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(9) Class17 local9 = this.method2361(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class39 local19 = arg2.method7546();
			local19.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
			return Static279.aBoolean329 ? local9.method5420(arg1, arg0, local19, false, 0, Static401.anInt7417) : local9.method5433(arg1, arg0, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7383(@OriginalArg(0) Class5 arg0) {
		@Pc(24) Class3_Sub4_Sub5 local24;
		if (this.aClass3_Sub4_Sub5_1 == null && this.aBoolean170) {
			@Pc(35) Class216 local35 = this.method2358(262144, true, arg0);
			local24 = local35 == null ? null : local35.aClass3_Sub4_Sub5_6;
		} else {
			local24 = this.aClass3_Sub4_Sub5_1;
			this.aClass3_Sub4_Sub5_1 = null;
		}
		if (local24 != null) {
			Static112.method2304(local24, super.aByte124, super.anInt8916, super.anInt8911, null);
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		if (this.aClass17_1 == null) {
			return true;
		} else {
			return !this.aClass17_1.r();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7380(@OriginalArg(0) Class5 arg0) {
		@Pc(14) Class3_Sub4_Sub5 local14;
		if (this.aClass3_Sub4_Sub5_1 == null && this.aBoolean170) {
			@Pc(25) Class216 local25 = this.method2358(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass3_Sub4_Sub5_6;
		} else {
			local14 = this.aClass3_Sub4_Sub5_1;
			this.aClass3_Sub4_Sub5_1 = null;
		}
		if (local14 != null) {
			Static145.method2663(local14, super.aByte124, super.anInt8916, super.anInt8911, null);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I")
	@Override
	public int method7381() {
		return this.aShort40 & 0xFFFF;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
	@Override
	public int method7379() {
		return this.aByte32;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLclient!ha;I)Lclient!ka;")
	private Class17 method2361(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass17_1 != null && arg0.method7541(this.aClass17_1.ua(), arg1) == 0) {
			return this.aClass17_1;
		} else {
			@Pc(26) Class216 local26 = this.method2358(arg1, false, arg0);
			return local26 == null ? null : local26.aClass17_6;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
	@Override
	public int method7382() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aClass17_1 == null ? false : this.aClass17_1.F();
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		if (this.aClass297_3 == null) {
			this.aClass297_3 = Static476.method7143(this.method2361(arg0, 0), super.anInt8916, super.anInt8915, super.anInt8911);
		}
		return this.aClass297_3;
	}
}
