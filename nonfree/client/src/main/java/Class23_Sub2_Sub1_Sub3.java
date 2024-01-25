import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class23_Sub2_Sub1_Sub3 extends Class23_Sub2_Sub1 implements Interface2 {

	@OriginalMember(owner = "client!hw", name = "pb", descriptor = "Lclient!dg;")
	private Class77 aClass77_3;

	@OriginalMember(owner = "client!hw", name = "R", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!hw", name = "fb", descriptor = "Z")
	private final boolean aBoolean354;

	@OriginalMember(owner = "client!hw", name = "nb", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!hw", name = "jb", descriptor = "Z")
	private final boolean aBoolean355;

	@OriginalMember(owner = "client!hw", name = "Q", descriptor = "Z")
	private boolean aBoolean352;

	@OriginalMember(owner = "client!hw", name = "ub", descriptor = "S")
	private final short aShort60;

	@OriginalMember(owner = "client!hw", name = "U", descriptor = "Z")
	private final boolean aBoolean353;

	@OriginalMember(owner = "client!hw", name = "S", descriptor = "Lclient!r;")
	private Class3_Sub6_Sub12 aClass3_Sub6_Sub12_3;

	@OriginalMember(owner = "client!hw", name = "K", descriptor = "Lclient!ka;")
	public Class28 aClass28_4;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!ha;Lclient!ij;IIIIIZIIIIIIZ)V")
	public Class23_Sub2_Sub1_Sub3(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4756 == 1, Static649.method8505(arg13, arg12));
		this.aByte62 = (byte) arg13;
		this.aBoolean354 = arg7;
		this.aByte63 = (byte) arg12;
		this.aBoolean355 = arg1.anInt4743 != 0 && !arg7;
		super.aByte143 = (byte) arg3;
		this.aBoolean352 = arg14;
		this.aShort60 = (short) arg1.anInt4778;
		this.aBoolean353 = arg0.method8120() && arg1.aBoolean393 && !this.aBoolean354 && Static227.aClass3_Sub15_11.aClass17_Sub21_1.method6502() != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean352) {
			local78 |= 0x10000;
		}
		@Pc(93) Class50 local93 = this.method3850(local78, this.aBoolean353, arg0);
		if (local93 != null) {
			this.aClass3_Sub6_Sub12_3 = local93.aClass3_Sub6_Sub12_1;
			this.aClass28_4 = local93.aClass28_2;
			if (this.aBoolean352) {
				this.aClass28_4 = this.aClass28_4.method6900((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZILclient!ha;)Lclient!cb;")
	private Class50 method3850(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(13) Class178 local13 = Static349.aClass374_2.method8357(this.aShort60 & 0xFFFF);
		@Pc(25) Class104 local25;
		@Pc(20) Class104 local20;
		if (this.aBoolean354) {
			local20 = Static239.aClass104Array1[0];
			local25 = Static605.aClass104Array3[super.aByte143];
		} else {
			local25 = Static239.aClass104Array1[super.aByte143];
			if (super.aByte143 >= 3) {
				local20 = null;
			} else {
				local20 = Static239.aClass104Array1[super.aByte143 + 1];
			}
		}
		return local13.method4011(this.aByte63 == 11 ? 10 : this.aByte63, super.anInt10109, arg0, arg1, arg2, super.anInt10114, this.aByte63 == 11 ? this.aByte62 + 4 : this.aByte62, local20, local25, (Class81) null, super.anInt10108);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8594() {
		return this.aClass28_4 == null ? false : this.aClass28_4.F();
	}

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "(I)I")
	@Override
	public int method8606(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			Static239.method3853(106, -123);
		}
		return this.aClass28_4 == null ? 0 : this.aClass28_4.ma();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)I")
	@Override
	public int method7823() {
		return this.aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		if (this.aClass28_4 == null) {
			return null;
		}
		@Pc(11) Class25 local11 = arg0.method8156();
		local11.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
		@Pc(25) Class23_Sub6 local25 = Static564.method8406(1, this.aBoolean355);
		if (Static148.aBoolean221) {
			this.aClass28_4.method6894(local11, local25.aClass23_Sub4Array1[0], Static209.anInt10104, 0);
		} else {
			this.aClass28_4.method6908(local11, local25.aClass23_Sub4Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class28 method3851(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass28_4 != null && arg0.method8122(this.aClass28_4.ua(), arg1) == 0) {
			return this.aClass28_4;
		} else {
			@Pc(31) Class50 local31 = this.method3850(arg1, false, arg0);
			return local31 == null ? null : local31.aClass28_2;
		}
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(I)V")
	@Override
	public void method8592() {
		this.aBoolean352 = false;
		if (this.aClass28_4 != null) {
			this.aClass28_4.s(this.aClass28_4.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7825(@OriginalArg(0) Class16 arg0) {
		@Pc(32) Class3_Sub6_Sub12 local32;
		if (this.aClass3_Sub6_Sub12_3 == null && this.aBoolean353) {
			@Pc(25) Class50 local25 = this.method3850(262144, true, arg0);
			local32 = local25 == null ? null : local25.aClass3_Sub6_Sub12_1;
		} else {
			local32 = this.aClass3_Sub6_Sub12_3;
			this.aClass3_Sub6_Sub12_3 = null;
		}
		if (local32 != null) {
			Static517.method7339(local32, super.aByte143, super.anInt10108, super.anInt10109, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		if (this.aClass77_3 == null) {
			this.aClass77_3 = Static109.method2088(super.anInt10109, super.anInt10108, this.method3851(arg0, 0), super.anInt10114);
		}
		return this.aClass77_3;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
	}

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8608() {
		if (this.aClass28_4 == null) {
			return true;
		} else {
			return !this.aClass28_4.r();
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7829(@OriginalArg(0) Class16 arg0) {
		@Pc(18) Class3_Sub6_Sub12 local18;
		if (this.aClass3_Sub6_Sub12_3 == null && this.aBoolean353) {
			@Pc(29) Class50 local29 = this.method3850(262144, true, arg0);
			local18 = local29 == null ? null : local29.aClass3_Sub6_Sub12_1;
		} else {
			local18 = this.aClass3_Sub6_Sub12_3;
			this.aClass3_Sub6_Sub12_3 = null;
		}
		if (local18 != null) {
			Static267.method4227(local18, super.aByte143, super.anInt10108, super.anInt10109, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aBoolean352;
	}

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "(I)I")
	@Override
	public int method8601() {
		return this.aClass28_4 == null ? 0 : this.aClass28_4.fa();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7828() {
		return this.aBoolean353;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)I")
	@Override
	public int method7824() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class28 local9 = this.method3851(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class25 local14 = arg0.method8156();
			local14.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
			return Static148.aBoolean221 ? local9.method6904(arg1, arg2, local14, false, 0, Static209.anInt10104) : local9.method6887(arg1, arg2, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class23_Sub2_Sub5_Sub2) {
			@Pc(32) Class23_Sub2_Sub5_Sub2 local32 = (Class23_Sub2_Sub5_Sub2) arg1;
			if (this.aClass28_4 != null && local32.aClass28_5 != null) {
				this.aClass28_4.method6897(local32.aClass28_5, arg2, arg5, arg3, arg4);
			}
		} else if (arg1 instanceof Class23_Sub2_Sub1_Sub3) {
			@Pc(12) Class23_Sub2_Sub1_Sub3 local12 = (Class23_Sub2_Sub1_Sub3) arg1;
			if (this.aClass28_4 != null && local12.aClass28_4 != null) {
				this.aClass28_4.method6897(local12.aClass28_4, arg2, arg5, arg3, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
	@Override
	public void method7826() {
		if (this.aClass28_4 != null) {
			this.aClass28_4.method6892();
		}
	}

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "(I)I")
	public int method3855() {
		return this.aClass28_4 == null ? 15 : this.aClass28_4.na() / 4;
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aByte62;
	}
}
