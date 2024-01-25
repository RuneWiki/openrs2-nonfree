import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class4_Sub1_Sub4_Sub2 extends Class4_Sub1_Sub4 implements Interface2 {

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "Lclient!ro;")
	private Class297 aClass297_6;

	@OriginalMember(owner = "client!ji", name = "ab", descriptor = "S")
	private final short aShort64;

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "Z")
	private final boolean aBoolean322;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!ji", name = "db", descriptor = "B")
	private final byte aByte69;

	@OriginalMember(owner = "client!ji", name = "X", descriptor = "Z")
	private final boolean aBoolean323;

	@OriginalMember(owner = "client!ji", name = "Z", descriptor = "Z")
	private final boolean aBoolean324;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "Lclient!ka;")
	private Class17 aClass17_4;

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "Lclient!r;")
	private Class3_Sub4_Sub5 aClass3_Sub4_Sub5_4;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!ha;Lclient!rq;IIIIIZIIII)V")
	public Class4_Sub1_Sub4_Sub2(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aShort64 = (short) arg1.anInt8677;
		this.aBoolean322 = arg1.anInt8641 != 0 && !arg7;
		this.aByte68 = (byte) arg11;
		this.aByte69 = (byte) arg10;
		super.anInt8916 = arg4;
		this.aBoolean323 = arg7;
		super.anInt8911 = arg6;
		this.aBoolean324 = arg0.method7494() && arg1.aBoolean600 && !this.aBoolean323 && Static262.aClass3_Sub27_12.aClass21_Sub5_1.method1474() != 0;
		@Pc(67) Class216 local67 = this.method4394(this.aBoolean324, arg0, 2048);
		if (local67 != null) {
			this.aClass17_4 = local67.aClass17_6;
			this.aClass3_Sub4_Sub5_4 = local67.aClass3_Sub4_Sub5_6;
		}
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aClass17_4 == null ? false : this.aClass17_4.F();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7383(@OriginalArg(0) Class5 arg0) {
		@Pc(35) Class3_Sub4_Sub5 local35;
		if (this.aClass3_Sub4_Sub5_4 == null && this.aBoolean324) {
			@Pc(28) Class216 local28 = this.method4394(true, arg0, 262144);
			local35 = local28 == null ? null : local28.aClass3_Sub4_Sub5_6;
		} else {
			local35 = this.aClass3_Sub4_Sub5_4;
			this.aClass3_Sub4_Sub5_4 = null;
		}
		if (local35 != null) {
			Static112.method2304(local35, super.aByte124, super.anInt8916, super.anInt8911, null);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(9) Class17 local9 = this.method4396(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class39 local19 = arg2.method7546();
			local19.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
			return Static279.aBoolean329 ? local9.method5420(arg1, arg0, local19, false, 0, Static401.anInt7417) : local9.method5433(arg1, arg0, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		if (arg0 > -4) {
			Static266.method4392();
		}
		return this.aClass17_4 == null ? 0 : this.aClass17_4.ma();
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		if (this.aClass17_4 == null) {
			return true;
		} else {
			return !this.aClass17_4.r();
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7380(@OriginalArg(0) Class5 arg0) {
		@Pc(22) Class3_Sub4_Sub5 local22;
		if (this.aClass3_Sub4_Sub5_4 == null && this.aBoolean324) {
			@Pc(33) Class216 local33 = this.method4394(true, arg0, 262144);
			local22 = local33 == null ? null : local33.aClass3_Sub4_Sub5_6;
		} else {
			local22 = this.aClass3_Sub4_Sub5_4;
			this.aClass3_Sub4_Sub5_4 = null;
		}
		if (local22 != null) {
			Static145.method2663(local22, super.aByte124, super.anInt8916, super.anInt8911, null);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)I")
	@Override
	public int method7381() {
		return this.aShort64 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		if (this.aClass297_6 == null) {
			this.aClass297_6 = Static476.method7143(this.method4396(arg0, 0), super.anInt8916, super.anInt8915, super.anInt8911);
		}
		return this.aClass297_6;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)I")
	@Override
	public int method7379() {
		return this.aByte68;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLclient!ha;II)Lclient!mg;")
	private Class216 method4394(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class299 local13 = Static105.aClass302_1.method7466(this.aShort64 & 0xFFFF);
		@Pc(26) Class51 local26;
		@Pc(34) Class51 local34;
		if (this.aBoolean323) {
			local26 = Static2.aClass51Array1[super.aByte124];
			local34 = Static559.aClass51Array4[0];
		} else {
			local26 = Static559.aClass51Array4[super.aByte124];
			if (super.aByte124 >= 3) {
				local34 = null;
			} else {
				local34 = Static559.aClass51Array4[super.aByte124 + 1];
			}
		}
		return local13.method7408(super.anInt8916, this.aByte68, arg0, super.anInt8911, this.aByte69, arg2, arg1, super.anInt8915, local26, local34);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
	@Override
	public int method7382() {
		return this.aByte69;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		if (this.aClass17_4 == null) {
			return null;
		}
		@Pc(16) Class39 local16 = arg0.method7546();
		local16.method7240(super.anInt8916 + super.aShort62, super.anInt8915, super.aShort63 + super.anInt8911);
		@Pc(37) Class4_Sub8 local37 = Static271.method4457(this.aBoolean322, 1);
		if (Static279.aBoolean329) {
			this.aClass17_4.method5413(local16, local37.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
		} else {
			this.aClass17_4.method5411(local16, local37.aClass4_Sub5Array1[0], 0);
		}
		return local37;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7378() {
		return this.aBoolean324;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)V")
	@Override
	public void method7384() {
		if (this.aClass17_4 != null) {
			this.aClass17_4.method5426();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class17 method4396(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass17_4 != null && arg0.method7541(this.aClass17_4.ua(), arg1) == 0) {
			return this.aClass17_4;
		} else {
			@Pc(27) Class216 local27 = this.method4394(false, arg0, arg1);
			return local27 == null ? null : local27.aClass17_6;
		}
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.aClass17_4 == null ? 0 : this.aClass17_4.fa();
	}
}
