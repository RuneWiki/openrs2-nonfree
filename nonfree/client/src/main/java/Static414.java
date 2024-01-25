import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!uu", name = "cb", descriptor = "I")
	public static int anInt7168;

	@OriginalMember(owner = "client!uu", name = "Z", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_237 = new Class92(53, 3);

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(JI)V")
	public static void method5544(@OriginalArg(0) long arg0) {
		if (Static151.aClass217ArrayArrayArray3 != null) {
			if (Static107.anInt2382 == 1 || Static107.anInt2382 == 5) {
				Static431.method5696(arg0);
			} else if (Static107.anInt2382 == 4) {
				Static391.method5289(arg0);
			}
		}
		Static386.method5261(Static266.aClass75_7, (long) Static290.anInt5325);
		if (Static337.anInt6221 != -1) {
			Static83.method1452(Static337.anInt6221);
		}
		for (@Pc(47) int local47 = 0; local47 < Static54.anInt1292; local47++) {
			if (Static308.aBooleanArray18[local47]) {
				Static290.aBooleanArray16[local47] = true;
			}
			Static406.aBooleanArray24[local47] = Static308.aBooleanArray18[local47];
			Static308.aBooleanArray18[local47] = false;
		}
		Static183.anInt4104 = Static290.anInt5325;
		if (Static266.aClass75_7.method2617()) {
			Static329.aBoolean423 = true;
		}
		if (Static337.anInt6221 != -1) {
			Static54.anInt1292 = 0;
			Static369.method5155();
		}
		Static266.aClass75_7.va();
		Static391.method5290(Static266.aClass75_7);
		@Pc(97) int local97 = Static133.method2298();
		if (local97 == -1) {
			local97 = Static332.anInt6029;
		}
		if (local97 == -1) {
			local97 = Static287.anInt5247;
		}
		Static166.method2898(local97);
		Static81.method1412(Static429.anInt7317, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053, Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055);
		Static429.anInt7317 = 0;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLclient!hb;)V")
	public static void method5552(@OriginalArg(1) Class92 arg0) {
		Static302.aClass3_Sub2_Sub2_2.method6058(arg0.method2663());
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(JI)Ljava/lang/String;")
	public static String method5553(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(39) long local39 = arg0; local39 != 0L; local39 /= 37L) {
				local29++;
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				@Pc(73) char local73 = Static405.aCharArray11[(int) (local59 - arg0 * 37L)];
				if (local73 == '_') {
					@Pc(83) int local83 = local56.length() - 1;
					local73 = ' ';
					local56.setCharAt(local83, Character.toUpperCase(local56.charAt(local83)));
				}
				local56.append(local73);
			}
			local56.reverse();
			local56.setCharAt(0, Character.toUpperCase(local56.charAt(0)));
			return local56.toString();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z")
	public static boolean method5561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
