import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "Lclient!of;")
	public static Class240 aClass240_10;

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "Z")
	public static boolean aBoolean539 = false;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLclient!cea;)V")
	public static void method6268(@OriginalArg(1) Class2_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static513.anInt9421; local7++) {
			@Pc(13) int local13 = arg0.method8378();
			@Pc(17) int local17 = arg0.method8326();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static507.aClass206_Sub1Array2[local13] != null) {
				Static507.aClass206_Sub1Array2[local13].anInt6899 = local17;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method6269(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static152.aString36 = Static152.aString36 + arg0[0];
			Static511.anInt9363 += arg0[0].length();
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
			if (arg0[local14].startsWith("pause")) {
				@Pc(24) int local24 = 5;
				try {
					local24 = Integer.parseInt(arg0[local14].substring(6));
				} catch (@Pc(33) Exception local33) {
				}
				Static300.method2224("Pausing for " + local24 + " seconds...");
				Static172.aStringArray17 = arg0;
				Static369.anInt7335 = local14 + 1;
				Static108.aLong69 = (long) (local24 * 1000) + Static277.method5091();
				return;
			}
			Static152.aString36 = arg0[local14];
			Static487.method7986(false);
		}
	}
}
