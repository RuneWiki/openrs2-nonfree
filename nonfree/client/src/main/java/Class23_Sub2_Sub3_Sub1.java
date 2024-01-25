import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class23_Sub2_Sub3_Sub1 extends Class23_Sub2_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!er", name = "bb", descriptor = "Lclient!dg;")
	private Class77 aClass77_2;

	@OriginalMember(owner = "client!er", name = "cb", descriptor = "Z")
	private final boolean aBoolean220;

	@OriginalMember(owner = "client!er", name = "P", descriptor = "S")
	private final short aShort35;

	@OriginalMember(owner = "client!er", name = "lb", descriptor = "B")
	private final byte lb;

	@OriginalMember(owner = "client!er", name = "Q", descriptor = "Z")
	private final boolean aBoolean218;

	@OriginalMember(owner = "client!er", name = "S", descriptor = "Z")
	private boolean aBoolean219;

	@OriginalMember(owner = "client!er", name = "K", descriptor = "Z")
	private final boolean aBoolean217;

	@OriginalMember(owner = "client!er", name = "db", descriptor = "Lclient!r;")
	private Class3_Sub6_Sub12 aClass3_Sub6_Sub12_2;

	@OriginalMember(owner = "client!er", name = "W", descriptor = "Lclient!ka;")
	private Class28 aClass28_3;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!ha;Lclient!ij;IIIIIZIZ)V")
	public Class23_Sub2_Sub3_Sub1(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt4759);
		this.aBoolean220 = arg1.anInt4743 != 0 && !arg7;
		this.aShort35 = (short) arg1.anInt4778;
		super.anInt10109 = arg6;
		this.lb = (byte) arg8;
		super.anInt10108 = arg4;
		this.aBoolean218 = arg7;
		this.aBoolean219 = arg9;
		this.aBoolean217 = arg0.method8120() && arg1.aBoolean393 && !this.aBoolean218 && Static227.aClass3_Sub15_11.aClass17_Sub21_1.method6502() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean219) {
			local63 |= 0x10000;
		}
		@Pc(78) Class50 local78 = this.method2525(this.aBoolean217, arg0, local63);
		if (local78 != null) {
			this.aClass3_Sub6_Sub12_2 = local78.aClass3_Sub6_Sub12_1;
			this.aClass28_3 = local78.aClass28_2;
			if (this.aBoolean219) {
				this.aClass28_3 = this.aClass28_3.method6900((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aBoolean219;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLclient!ha;IZ)Lclient!cb;")
	private Class50 method2525(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class178 local13 = Static349.aClass374_2.method8357(this.aShort35 & 0xFFFF);
		@Pc(27) Class104 local27;
		@Pc(40) Class104 local40;
		if (this.aBoolean218) {
			local40 = Static239.aClass104Array1[0];
			local27 = Static605.aClass104Array3[super.aByte143];
		} else {
			local27 = Static239.aClass104Array1[super.aByte143];
			if (super.aByte143 < 3) {
				local40 = Static239.aClass104Array1[super.aByte143 + 1];
			} else {
				local40 = null;
			}
		}
		return local13.method4011(22, super.anInt10109, arg2, arg0, arg1, super.anInt10114, this.lb, local40, local27, (Class81) null, super.anInt10108);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class28 local9 = this.method2527(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class25 local14 = arg0.method8156();
			local14.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
			return Static148.aBoolean221 ? local9.method6904(arg1, arg2, local14, false, 0, Static209.anInt10104) : local9.method6887(arg1, arg2, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)I")
	@Override
	public int method7823() {
		return this.aShort35 & 0xFFFF;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.lb;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)I")
	@Override
	public int method7824() {
		return 22;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class23_Sub2_Sub3_Sub1) {
			@Pc(9) Class23_Sub2_Sub3_Sub1 local9 = (Class23_Sub2_Sub3_Sub1) arg1;
			if (this.aClass28_3 != null && local9.aClass28_3 != null) {
				this.aClass28_3.method6897(local9.aClass28_3, arg2, arg5, arg3, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8608() {
		if (this.aClass28_3 == null) {
			return true;
		} else {
			return !this.aClass28_3.r();
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		if (this.aClass77_2 == null) {
			this.aClass77_2 = Static109.method2088(super.anInt10109, super.anInt10108, this.method2527(0, arg0), super.anInt10114);
		}
		return this.aClass77_2;
	}

	@OriginalMember(owner = "client!er", name = "h", descriptor = "(I)I")
	@Override
	public int method8606(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method8607();
		}
		return this.aClass28_3 == null ? 0 : this.aClass28_3.ma();
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		if (this.aClass28_3 == null) {
			return null;
		}
		@Pc(17) Class25 local17 = arg0.method8156();
		local17.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
		@Pc(31) Class23_Sub6 local31 = Static564.method8406(1, this.aBoolean220);
		if (Static148.aBoolean221) {
			this.aClass28_3.method6894(local17, local31.aClass23_Sub4Array1[0], Static209.anInt10104, 0);
		} else {
			this.aClass28_3.method6908(local17, local31.aClass23_Sub4Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(I)I")
	@Override
	public int method8601() {
		return this.aClass28_3 == null ? 0 : this.aClass28_3.fa();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7828() {
		return this.aBoolean217;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	@Override
	public void method8592() {
		this.aBoolean219 = false;
		if (this.aClass28_3 != null) {
			this.aClass28_3.s(this.aClass28_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	@Override
	public void method7826() {
		if (this.aClass28_3 != null) {
			this.aClass28_3.method6892();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!ha;B)Lclient!ka;")
	private Class28 method2527(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1) {
		if (this.aClass28_3 != null && arg1.method8122(this.aClass28_3.ua(), arg0) == 0) {
			return this.aClass28_3;
		} else {
			@Pc(27) Class50 local27 = this.method2525(false, arg1, arg0);
			return local27 == null ? null : local27.aClass28_2;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7825(@OriginalArg(0) Class16 arg0) {
		@Pc(18) Class3_Sub6_Sub12 local18;
		if (this.aClass3_Sub6_Sub12_2 == null && this.aBoolean217) {
			@Pc(29) Class50 local29 = this.method2525(true, arg0, 262144);
			local18 = local29 == null ? null : local29.aClass3_Sub6_Sub12_1;
		} else {
			local18 = this.aClass3_Sub6_Sub12_2;
			this.aClass3_Sub6_Sub12_2 = null;
		}
		if (local18 != null) {
			Static517.method7339(local18, super.aByte143, super.anInt10108, super.anInt10109, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7829(@OriginalArg(0) Class16 arg0) {
		@Pc(31) Class3_Sub6_Sub12 local31;
		if (this.aClass3_Sub6_Sub12_2 == null && this.aBoolean217) {
			@Pc(24) Class50 local24 = this.method2525(true, arg0, 262144);
			local31 = local24 == null ? null : local24.aClass3_Sub6_Sub12_1;
		} else {
			local31 = this.aClass3_Sub6_Sub12_2;
			this.aClass3_Sub6_Sub12_2 = null;
		}
		if (local31 != null) {
			Static267.method4227(local31, super.aByte143, super.anInt10108, super.anInt10109, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8594() {
		return this.aClass28_3 == null ? false : this.aClass28_3.F();
	}
}
