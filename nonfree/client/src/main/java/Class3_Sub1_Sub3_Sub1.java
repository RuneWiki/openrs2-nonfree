import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class3_Sub1_Sub3_Sub1 extends Class3_Sub1_Sub3 implements Interface21 {

	@OriginalMember(owner = "client!dm", name = "lb", descriptor = "I")
	public static int lb = -60;

	@OriginalMember(owner = "client!dm", name = "nb", descriptor = "Lclient!hw;")
	private Class142 aClass142_2;

	@OriginalMember(owner = "client!dm", name = "ub", descriptor = "S")
	private final short aShort19;

	@OriginalMember(owner = "client!dm", name = "db", descriptor = "B")
	private final byte aByte36;

	@OriginalMember(owner = "client!dm", name = "mb", descriptor = "B")
	private final byte aByte37;

	@OriginalMember(owner = "client!dm", name = "cb", descriptor = "Z")
	private final boolean aBoolean233;

	@OriginalMember(owner = "client!dm", name = "fb", descriptor = "Z")
	private final boolean aBoolean234;

	@OriginalMember(owner = "client!dm", name = "hb", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!dm", name = "I", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!dm", name = "qb", descriptor = "Lclient!ka;")
	public Class166 aClass166_4;

	@OriginalMember(owner = "client!dm", name = "yb", descriptor = "Lclient!r;")
	private Class2_Sub6_Sub7 aClass2_Sub6_Sub7_4;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!ha;Lclient!iv;IIIIIZIIIIIIZ)V")
	public Class3_Sub1_Sub3_Sub1(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5375 == 1, Static206.method4086(arg13, arg12));
		this.aShort19 = (short) arg1.anInt5398;
		this.aByte36 = (byte) arg13;
		this.aByte37 = (byte) arg12;
		this.aBoolean233 = arg1.anInt5363 != 0 && !arg7;
		this.aBoolean234 = arg7;
		this.aBoolean235 = arg14;
		super.aByte131 = (byte) arg3;
		this.aBoolean232 = arg0.method7285() && arg1.aBoolean398 && !this.aBoolean234 && Static74.aClass2_Sub13_5.aClass14_Sub15_1.method5864() != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean235) {
			local77 |= 0x10000;
		}
		@Pc(92) Class16 local92 = this.method2754(arg0, local77, this.aBoolean232);
		if (local92 != null) {
			this.aClass166_4 = local92.aClass166_1;
			this.aClass2_Sub6_Sub7_4 = local92.aClass2_Sub6_Sub7_1;
			if (this.aBoolean235) {
				this.aClass166_4 = this.aClass166_4.method6684((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
	@Override
	public void method8623() {
		if (this.aClass166_4 != null) {
			this.aClass166_4.method6682();
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return this.aClass166_4 == null ? 0 : this.aClass166_4.fa();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8627(@OriginalArg(1) Class20 arg0) {
		@Pc(14) Class2_Sub6_Sub7 local14;
		if (this.aClass2_Sub6_Sub7_4 == null && this.aBoolean232) {
			@Pc(25) Class16 local25 = this.method2754(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass2_Sub6_Sub7_1;
		} else {
			local14 = this.aClass2_Sub6_Sub7_4;
			this.aClass2_Sub6_Sub7_4 = null;
		}
		if (local14 != null) {
			Static378.method2839(local14, super.aByte131, super.anInt10303, super.anInt10310, null);
		}
	}

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		if (arg0 != -25675) {
			Static105.method2755(null);
		}
		return this.aClass166_4 == null ? 0 : this.aClass166_4.ma();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8621() {
		return this.aBoolean232;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class166 local13 = this.method2751(arg0, 131072);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class30 local18 = arg0.method7308();
			local18.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
			return Static639.aBoolean753 ? local13.method6693(arg2, arg1, local18, false, 0, Static380.anInt7419) : local13.method6698(arg2, arg1, local18, false, 0);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class166 method2751(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass166_4 != null && arg0.method7270(this.aClass166_4.ua(), arg1) == 0) {
			return this.aClass166_4;
		} else {
			@Pc(32) Class16 local32 = this.method2754(arg0, arg1, false);
			return local32 == null ? null : local32.aClass166_1;
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
	}

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "(I)I")
	public int method2753() {
		return this.aClass166_4 == null ? 15 : this.aClass166_4.na() / 4;
	}

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8612() {
		return this.aBoolean235;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)I")
	@Override
	public int method8624() {
		return this.aByte36;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ha;IZLclient!ga;IBI)V")
	@Override
	public void method8604(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class3_Sub1_Sub5_Sub1) {
			@Pc(9) Class3_Sub1_Sub5_Sub1 local9 = (Class3_Sub1_Sub5_Sub1) arg3;
			if (this.aClass166_4 != null && local9.aClass166_5 != null) {
				this.aClass166_4.method6683(local9.aClass166_5, arg5, arg1, arg4, arg2);
			}
		} else if (arg3 instanceof Class3_Sub1_Sub3_Sub1) {
			@Pc(32) Class3_Sub1_Sub3_Sub1 local32 = (Class3_Sub1_Sub3_Sub1) arg3;
			if (this.aClass166_4 != null && local32.aClass166_4 != null) {
				this.aClass166_4.method6683(local32.aClass166_4, arg5, arg1, arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)I")
	@Override
	public int method8625() {
		return this.aShort19 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)V")
	@Override
	public void method8616() {
		this.aBoolean235 = false;
		if (this.aClass166_4 != null) {
			this.aClass166_4.s(this.aClass166_4.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		if (this.aClass142_2 == null) {
			this.aClass142_2 = Static268.method4930(super.anInt10303, this.method2751(arg0, 0), super.anInt10310, super.anInt10306);
		}
		return this.aClass142_2;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!ha;IZ)Lclient!ak;")
	private Class16 method2754(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class161 local13 = Static27.aClass342_3.method8534(this.aShort19 & 0xFFFF);
		@Pc(21) Class65 local21;
		@Pc(25) Class65 local25;
		if (this.aBoolean234) {
			local21 = Static103.aClass65Array3[super.aByte131];
			local25 = Static40.aClass65Array2[0];
		} else {
			local21 = Static40.aClass65Array2[super.aByte131];
			if (super.aByte131 >= 3) {
				local25 = null;
			} else {
				local25 = Static40.aClass65Array2[super.aByte131 + 1];
			}
		}
		return local13.method4602(arg0, local25, this.aByte37 == 11 ? 10 : this.aByte37, arg1, super.anInt10303, arg2, local21, super.anInt10306, super.anInt10310, this.aByte37 == 11 ? this.aByte36 + 4 : this.aByte36);
	}

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		if (this.aClass166_4 == null) {
			return true;
		} else {
			return !this.aClass166_4.r();
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aClass166_4 == null ? false : this.aClass166_4.F();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8626(@OriginalArg(0) Class20 arg0) {
		@Pc(33) Class2_Sub6_Sub7 local33;
		if (this.aClass2_Sub6_Sub7_4 == null && this.aBoolean232) {
			@Pc(26) Class16 local26 = this.method2754(arg0, 262144, true);
			local33 = local26 == null ? null : local26.aClass2_Sub6_Sub7_1;
		} else {
			local33 = this.aClass2_Sub6_Sub7_4;
			this.aClass2_Sub6_Sub7_4 = null;
		}
		if (local33 != null) {
			Static427.method6848(local33, super.aByte131, super.anInt10303, super.anInt10310, null);
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)I")
	@Override
	public int method8622() {
		return this.aByte37;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		if (this.aClass166_4 == null) {
			return null;
		}
		@Pc(11) Class30 local11 = arg0.method7308();
		local11.method4649(super.anInt10303, super.anInt10306, super.anInt10310);
		@Pc(25) Class3_Sub4 local25 = Static546.method8162(1, this.aBoolean233);
		if (Static639.aBoolean753) {
			this.aClass166_4.method6678(local11, local25.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
		} else {
			this.aClass166_4.method6685(local11, local25.aClass3_Sub3Array1[0], 0);
		}
		return local25;
	}
}
