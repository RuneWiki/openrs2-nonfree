import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "[I")
	public static final int[] anIntArray79 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "S")
	public static short aShort25 = 1;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!vo;")
	public static RuntimeException_Sub1 method730(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString61 = local9.aString61 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(JI)V")
	public static void method731(@OriginalArg(0) long arg0) {
		@Pc(12) int local12 = Static124.anInt4240;
		@Pc(14) int local14 = Static273.anInt5127;
		@Pc(22) int local22;
		@Pc(30) int local30;
		if (Static74.anInt1635 != local12) {
			local22 = local12 - Static74.anInt1635;
			local30 = (int) (arg0 * (long) local22 / 320L);
			if (local22 > 0) {
				if (local30 == 0) {
					local30 = 1;
				} else if (local30 > local22) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = -1;
			} else if (local22 > local30) {
				local30 = local22;
			}
			Static74.anInt1635 += local30;
		}
		if (!Static260.aBoolean369) {
			Static350.aFloat74 += (float) arg0 * Static335.aFloat72 / 40.0F * 8.0F;
			Static323.aFloat71 += Static106.aFloat8 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local14 != Static211.anInt4264) {
			local22 = local14 - Static211.anInt4264;
			local30 = (int) ((long) local22 * arg0 / 320L);
			if (local22 <= 0) {
				if (local30 == 0) {
					local30 = -1;
				} else if (local22 > local30) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = 1;
			} else if (local22 < local30) {
				local30 = local22;
			}
			Static211.anInt4264 += local30;
		}
		Static238.method4241();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBLclient!ab;)V")
	public static void method732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2) {
		if (Static268.aClass3_13 != null || Static214.aBoolean313 || (arg2 == null || Static76.method1318(arg2) == null)) {
			return;
		}
		Static268.aClass3_13 = arg2;
		Static220.aClass3_10 = Static76.method1318(arg2);
		Static334.anInt6175 = arg0;
		Static191.aBoolean362 = false;
		Static180.anInt3782 = arg1;
		Static328.anInt6054 = 0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ve;I)I")
	public static int method733(@OriginalArg(0) Class2_Sub24_Sub2 arg0) {
		@Pc(20) int local20 = arg0.method5793(2);
		@Pc(24) int local24;
		if (local20 == 0) {
			local24 = 0;
		} else if (local20 == 1) {
			local24 = arg0.method5793(5);
		} else if (local20 == 2) {
			local24 = arg0.method5793(8);
		} else {
			local24 = arg0.method5793(11);
		}
		return local24;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public static void method735() {
		Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
		Static317.aClass208_165 = null;
		Static248.anInt4821 = 0;
		Static222.anInt4434 = 0;
		Static217.aClass208_121 = null;
		Static89.anInt1900 = 0;
		Static198.aClass208_113 = null;
		Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
		Static178.aClass208_103 = null;
		Static282.method4699();
		Static145.method4759();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			Static42.aClass1_Sub2_Sub1_Sub1Array1[local33] = null;
		}
		Static182.aClass1_Sub2_Sub1_Sub1_1 = null;
		for (@Pc(51) int local51 = 0; local51 < Static223.aClass1_Sub2_Sub1_Sub2Array1.length; local51++) {
			@Pc(57) Class1_Sub2_Sub1_Sub2 local57 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local51];
			if (local57 != null) {
				local57.anInt5418 = -1;
			}
		}
		Static221.method5899();
		Static198.anInt4108 = 1;
		Static181.method3326(30);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static93.aBooleanArray10[local80] = true;
		}
		Static212.method3829();
		Static357.aClass2_Sub22_2 = null;
		Static7.aLong4 = 0L;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method738(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(29) String local29 = Static287.method4731(arg0);
		if (local29 == null) {
			return;
		}
		for (@Pc(34) int local34 = 0; local34 < Static139.anInt2976; local34++) {
			@Pc(40) String local40 = Static30.aStringArray6[local34];
			if (local40.startsWith("*")) {
				local40 = local40.substring(1);
			}
			local40 = Static287.method4731(local40);
			if (local40 != null && local40.equals(local29)) {
				Static139.anInt2976--;
				for (@Pc(66) int local66 = local34; local66 < Static139.anInt2976; local66++) {
					Static30.aStringArray6[local66] = Static30.aStringArray6[local66 + 1];
					Static288.aStringArray29[local66] = Static288.aStringArray29[local66 + 1];
					Static23.anIntArray42[local66] = Static23.anIntArray42[local66 + 1];
					Static73.aStringArray10[local66] = Static73.aStringArray10[local66 + 1];
					Static299.anIntArray474[local66] = Static299.anIntArray474[local66 + 1];
					Static289.aBooleanArray23[local66] = Static289.aBooleanArray23[local66 + 1];
				}
				Static342.anInt6304 = Static245.anInt4796;
				Static77.method1332(Static328.aClass183_95);
				Static76.aClass2_Sub24_Sub2_7.method5746(Static305.method6026(arg0));
				Static76.aClass2_Sub24_Sub2_7.method5772(arg0);
				return;
			}
		}
	}
}
