import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_49 = new Class22(108, 8);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(JI)V")
	public static void method764(@OriginalArg(0) long arg0) {
		if (Static202.aClass164ArrayArrayArray5 != null) {
			if (Static111.anInt2386 == 1 || Static111.anInt2386 == 5) {
				Static217.method3266(arg0);
			} else if (Static111.anInt2386 == 4) {
				Static194.method3052(arg0);
			}
		}
		Static70.method1340((long) Static24.anInt5323, Static122.aClass19_16);
		if (Static334.anInt5766 != -1) {
			Static146.method208(Static334.anInt5766);
		}
		for (@Pc(40) int local40 = 0; local40 < Static229.anInt4407; local40++) {
			if (Static416.aBooleanArray21[local40]) {
				Static263.aBooleanArray15[local40] = true;
			}
			Static65.aBooleanArray9[local40] = Static416.aBooleanArray21[local40];
			Static416.aBooleanArray21[local40] = false;
		}
		Static250.anInt4639 = Static24.anInt5323;
		if (Static122.aClass19_16.method4243()) {
			Static401.aBoolean600 = true;
		}
		if (Static334.anInt5766 != -1) {
			Static229.anInt4407 = 0;
			Static445.method5615();
		}
		Static122.aClass19_16.e();
		Static348.method4696(Static122.aClass19_16);
		@Pc(94) int local94 = Static320.method4409();
		if (local94 == -1) {
			local94 = Static157.anInt3147;
		}
		if (local94 == -1) {
			local94 = Static343.anInt770;
		}
		Static368.method4938(local94);
		Static258.method3728(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892, Static176.anInt3414, Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893, Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82);
		Static176.anInt3414 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(JI)Ljava/lang/String;")
	public static String method766(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local29++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static20.aCharArray1[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(80) int local80 = local52.length() - 1;
					local70 = ' ';
					local52.setCharAt(local80, Character.toUpperCase(local52.charAt(local80)));
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}
}
