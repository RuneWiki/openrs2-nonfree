import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!lw", name = "Ac", descriptor = "I")
	public static int anInt5961;

	@OriginalMember(owner = "client!lw", name = "Mb", descriptor = "J")
	public static long aLong152 = 0L;

	@OriginalMember(owner = "client!lw", name = "Qb", descriptor = "Lclient!jv;")
	public static final Class191 aClass191_4 = new Class191();

	@OriginalMember(owner = "client!lw", name = "zc", descriptor = "[Lclient!ic;")
	public static final Class2_Sub7_Sub6[] aClass2_Sub7_Sub6Array6 = new Class2_Sub7_Sub6[14];

	@OriginalMember(owner = "client!lw", name = "Jc", descriptor = "I")
	public static int anInt5965 = 999999;

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
	public static void method5136() {
		Static261.aClass303ArrayArray1 = new Class303[Static477.aClass238_220.method5569()][];
		Static649.aClass303ArrayArray5 = new Class303[Static477.aClass238_220.method5569()][];
		Static139.aBooleanArray5 = new boolean[Static477.aClass238_220.method5569()];
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)I")
	public static int method5140() {
		if ((double) Static371.aFloat187 == 3.0D) {
			return 37;
		} else if ((double) Static371.aFloat187 == 4.0D) {
			return 50;
		} else if ((double) Static371.aFloat187 == 6.0D) {
			return 75;
		} else if ((double) Static371.aFloat187 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!sl;)Lclient!ih;")
	public static Class56_Sub3 method5146(@OriginalArg(1) Class2_Sub17 arg0) {
		@Pc(14) Class56 local14 = Static316.method4866(arg0);
		@Pc(18) int local18 = arg0.method2881();
		@Pc(22) int local22 = arg0.method2881();
		return new Class56_Sub3(local14.aClass97_15, local14.aClass252_11, local14.anInt9417, local14.anInt9419, local14.anInt9422, local14.anInt9414, local14.anInt9421, local14.anInt9415, local14.anInt9412, local18, local22);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBI)V")
	public static void method5147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static371.aFloat186 < Static371.aFloat187) {
			Static371.aFloat186 = (float) ((double) Static371.aFloat186 + (double) Static371.aFloat186 / 30.0D);
			if (Static371.aFloat186 > Static371.aFloat187) {
				Static371.aFloat186 = Static371.aFloat187;
			}
			Static274.method4476();
			Static371.anInt9378 = (int) Static371.aFloat186 >> 1;
			Static371.aByteArrayArrayArray16 = Static105.method1963(Static371.anInt9378);
		} else if (Static371.aFloat187 < Static371.aFloat186) {
			Static371.aFloat186 = (float) ((double) Static371.aFloat186 - (double) Static371.aFloat186 / 30.0D);
			if (Static371.aFloat187 > Static371.aFloat186) {
				Static371.aFloat186 = Static371.aFloat187;
			}
			Static274.method4476();
			Static371.anInt9378 = (int) Static371.aFloat186 >> 1;
			Static371.aByteArrayArrayArray16 = Static105.method1963(Static371.anInt9378);
		}
		if (Static285.anInt5179 != -1 && Static280.anInt5122 != -1) {
			@Pc(78) int local78 = Static285.anInt5179 - Static331.anInt5801;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(95) int local95 = Static280.anInt5122 - Static611.anInt10071;
			Static331.anInt5801 -= -local78;
			if (local95 < 2 || local95 > 2) {
				local95 /= 8;
			}
			if (local78 == 0 && local95 == 0) {
				Static280.anInt5122 = -1;
				Static285.anInt5179 = -1;
			}
			Static611.anInt10071 += local95;
			Static274.method4476();
		}
		if (Static648.anInt10477 > 0) {
			Static14.anInt274--;
			if (Static14.anInt274 == 0) {
				Static14.anInt274 = 100;
				Static648.anInt10477--;
			}
		} else {
			Static50.anInt1296 = -1;
			Static286.anInt5207 = -1;
		}
		if (!Static603.aBoolean719 || Static435.aClass114_38 == null) {
			return;
		}
		for (@Pc(167) Class2_Sub35 local167 = (Class2_Sub35) Static435.aClass114_38.method2772(); local167 != null; local167 = (Class2_Sub35) Static435.aClass114_38.method2762()) {
			@Pc(176) Class353 local176 = Static371.aClass336_4.method7855(local167.aClass2_Sub13_1.anInt2179);
			if (local167.method6334(arg1, arg0)) {
				if (local176.aStringArray52 != null) {
					if (local176.aStringArray52[4] != null) {
						Static244.method4145((long) local167.aClass2_Sub13_1.anInt2179, (long) local167.aClass2_Sub13_1.anInt2179, false, true, local176.aString101, -1, -1, 1004, 0, local176.aStringArray52[4], false, local176.anInt9797);
					}
					if (local176.aStringArray52[3] != null) {
						Static244.method4145((long) local167.aClass2_Sub13_1.anInt2179, (long) local167.aClass2_Sub13_1.anInt2179, false, true, local176.aString101, -1, -1, 1010, 0, local176.aStringArray52[3], false, local176.anInt9797);
					}
					if (local176.aStringArray52[2] != null) {
						Static244.method4145((long) local167.aClass2_Sub13_1.anInt2179, (long) local167.aClass2_Sub13_1.anInt2179, false, true, local176.aString101, -1, -1, 1006, 0, local176.aStringArray52[2], false, local176.anInt9797);
					}
					if (local176.aStringArray52[1] != null) {
						Static244.method4145((long) local167.aClass2_Sub13_1.anInt2179, (long) local167.aClass2_Sub13_1.anInt2179, false, true, local176.aString101, -1, -1, 1012, 0, local176.aStringArray52[1], false, local176.anInt9797);
					}
					if (local176.aStringArray52[0] != null) {
						Static244.method4145((long) local167.aClass2_Sub13_1.anInt2179, (long) local167.aClass2_Sub13_1.anInt2179, false, true, local176.aString101, -1, -1, 1011, 0, local176.aStringArray52[0], false, local176.anInt9797);
					}
				}
				if (!local167.aClass2_Sub13_1.aBoolean182) {
					local167.aClass2_Sub13_1.aBoolean182 = true;
					Static156.method2739(Static368.aClass312_4, local167.aClass2_Sub13_1.anInt2179, local176.anInt9797);
				}
				if (local167.aClass2_Sub13_1.aBoolean182) {
					Static156.method2739(Static481.aClass312_11, local167.aClass2_Sub13_1.anInt2179, local176.anInt9797);
				}
			} else if (local167.aClass2_Sub13_1.aBoolean182) {
				local167.aClass2_Sub13_1.aBoolean182 = false;
				Static156.method2739(Static628.aClass312_13, local167.aClass2_Sub13_1.anInt2179, local176.anInt9797);
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)Z")
	public static boolean method5148(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
