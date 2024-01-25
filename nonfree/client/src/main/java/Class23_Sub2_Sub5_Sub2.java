import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class23_Sub2_Sub5_Sub2 extends Class23_Sub2_Sub5 implements Interface2 {

	@OriginalMember(owner = "client!rd", name = "jb", descriptor = "Lclient!dg;")
	private Class77 aClass77_6;

	@OriginalMember(owner = "client!rd", name = "rb", descriptor = "B")
	private final byte aByte113;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "Z")
	private final boolean aBoolean637;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "Z")
	private boolean aBoolean636;

	@OriginalMember(owner = "client!rd", name = "gb", descriptor = "S")
	private final short aShort112;

	@OriginalMember(owner = "client!rd", name = "nb", descriptor = "B")
	private final byte aByte112;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "Z")
	private final boolean aBoolean638;

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "Z")
	private final boolean aBoolean639;

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "Lclient!ka;")
	public Class28 aClass28_5;

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "Lclient!r;")
	private Class3_Sub6_Sub12 aClass3_Sub6_Sub12_4;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!ha;Lclient!ij;IIIIIZIIZ)V")
	public Class23_Sub2_Sub5_Sub2(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static283.method4483(arg9, arg8));
		this.aByte113 = (byte) arg8;
		super.anInt10109 = arg6;
		this.aBoolean637 = arg1.anInt4743 != 0 && !arg7;
		this.aBoolean636 = arg10;
		this.aShort112 = (short) arg1.anInt4778;
		this.aByte112 = (byte) arg9;
		super.anInt10108 = arg4;
		this.aBoolean638 = arg7;
		this.aBoolean639 = arg0.method8120() && arg1.aBoolean393 && !this.aBoolean638 && Static227.aClass3_Sub15_11.aClass17_Sub21_1.method6502() != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean636) {
			local69 |= 0x10000;
		}
		@Pc(84) Class50 local84 = this.method7229(local69, this.aBoolean639, arg0);
		if (local84 != null) {
			this.aClass28_5 = local84.aClass28_2;
			this.aClass3_Sub6_Sub12_4 = local84.aClass3_Sub6_Sub12_1;
			if (this.aBoolean636) {
				this.aClass28_5 = this.aClass28_5.method6900((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	@Override
	public void method7826() {
		if (this.aClass28_5 != null) {
			this.aClass28_5.method6892();
		}
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aBoolean636;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		if (this.aClass28_5 == null) {
			return null;
		}
		@Pc(11) Class25 local11 = arg0.method8156();
		local11.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
		@Pc(31) Class23_Sub6 local31 = Static564.method8406(1, this.aBoolean637);
		if (Static148.aBoolean221) {
			this.aClass28_5.method6894(local11, local31.aClass23_Sub4Array1[0], Static209.anInt10104, 0);
		} else {
			this.aClass28_5.method6908(local11, local31.aClass23_Sub4Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBZLclient!ha;)Lclient!cb;")
	private Class50 method7229(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(13) Class178 local13 = Static349.aClass374_2.method8357(this.aShort112 & 0xFFFF);
		@Pc(31) Class104 local31;
		@Pc(35) Class104 local35;
		if (this.aBoolean638) {
			local31 = Static605.aClass104Array3[super.aByte143];
			local35 = Static239.aClass104Array1[0];
		} else {
			local31 = Static239.aClass104Array1[super.aByte143];
			if (super.aByte143 < 3) {
				local35 = Static239.aClass104Array1[super.aByte143 + 1];
			} else {
				local35 = null;
			}
		}
		return local13.method4011(this.aByte113, super.anInt10109, arg0, arg1, arg2, super.anInt10114, this.aByte112, local35, local31, (Class81) null, super.anInt10108);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8594() {
		return this.aClass28_5 == null ? false : this.aClass28_5.F();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)I")
	@Override
	public int method7823() {
		return this.aShort112 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aByte112;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class23_Sub2_Sub5_Sub2) {
			@Pc(32) Class23_Sub2_Sub5_Sub2 local32 = (Class23_Sub2_Sub5_Sub2) arg1;
			if (this.aClass28_5 != null && local32.aClass28_5 != null) {
				this.aClass28_5.method6897(local32.aClass28_5, arg2, arg5, arg3, arg4);
			}
		} else if (arg1 instanceof Class23_Sub2_Sub1_Sub3) {
			@Pc(12) Class23_Sub2_Sub1_Sub3 local12 = (Class23_Sub2_Sub1_Sub3) arg1;
			if (this.aClass28_5 != null && local12.aClass28_4 != null) {
				this.aClass28_5.method6897(local12.aClass28_4, arg2, arg5, arg3, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)I")
	@Override
	public int method8606(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method7827();
		}
		return this.aClass28_5 == null ? 0 : this.aClass28_5.ma();
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
	@Override
	public int method8601() {
		return this.aClass28_5 == null ? 0 : this.aClass28_5.fa();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7829(@OriginalArg(0) Class16 arg0) {
		@Pc(31) Class3_Sub6_Sub12 local31;
		if (this.aClass3_Sub6_Sub12_4 == null && this.aBoolean639) {
			@Pc(24) Class50 local24 = this.method7229(262144, true, arg0);
			local31 = local24 == null ? null : local24.aClass3_Sub6_Sub12_1;
		} else {
			local31 = this.aClass3_Sub6_Sub12_4;
			this.aClass3_Sub6_Sub12_4 = null;
		}
		if (local31 != null) {
			Static267.method4227(local31, super.aByte143, super.anInt10108, super.anInt10109, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		if (this.aClass77_6 == null) {
			this.aClass77_6 = Static109.method2088(super.anInt10109, super.anInt10108, this.method7231(0, arg0), super.anInt10114);
		}
		return this.aClass77_6;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class28 method7231(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1) {
		if (this.aClass28_5 != null && arg1.method8122(this.aClass28_5.ua(), arg0) == 0) {
			return this.aClass28_5;
		} else {
			@Pc(26) Class50 local26 = this.method7229(arg0, false, arg1);
			return local26 == null ? null : local26.aClass28_2;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7825(@OriginalArg(0) Class16 arg0) {
		@Pc(18) Class3_Sub6_Sub12 local18;
		if (this.aClass3_Sub6_Sub12_4 == null && this.aBoolean639) {
			@Pc(29) Class50 local29 = this.method7229(262144, true, arg0);
			local18 = local29 == null ? null : local29.aClass3_Sub6_Sub12_1;
		} else {
			local18 = this.aClass3_Sub6_Sub12_4;
			this.aClass3_Sub6_Sub12_4 = null;
		}
		if (local18 != null) {
			Static517.method7339(local18, super.aByte143, super.anInt10108, super.anInt10109, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I")
	@Override
	public int method7824() {
		return this.aByte113;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class28 local9 = this.method7231(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class25 local14 = arg0.method8156();
			local14.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
			return Static148.aBoolean221 ? local9.method6904(arg1, arg2, local14, false, 0, Static209.anInt10104) : local9.method6887(arg1, arg2, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	@Override
	public void method8592() {
		this.aBoolean636 = false;
		if (this.aClass28_5 != null) {
			this.aClass28_5.s(this.aClass28_5.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8608() {
		if (this.aClass28_5 == null) {
			return true;
		} else {
			return !this.aClass28_5.r();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7828() {
		return this.aBoolean639;
	}
}
