import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	public static int anInt5230;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!ik;")
	public static Class103 aClass103_54 = new Class103(64);

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString332 = "M";

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString333 = " is already on your ignore list.";

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4450(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static124.anInt2775 >= 100 && !Static63.aBoolean407 || Static124.anInt2775 >= 200) {
			Static16.method2749(Static160.aString218);
			return;
		}
		@Pc(22) String local22 = Static142.method2873(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(27) int local27 = 0; local27 < Static124.anInt2775; local27++) {
			@Pc(39) String local39 = Static142.method2873(Static64.aStringArray15[local27]);
			if (local39 != null && local39.equals(local22)) {
				Static16.method2749(arg0 + Static227.aString417);
				return;
			}
			if (Static323.aStringArray49[local27] != null) {
				local66 = Static142.method2873(Static323.aStringArray49[local27]);
				if (local66 != null && local66.equals(local22)) {
					Static16.method2749(arg0 + Static227.aString417);
					return;
				}
			}
		}
		for (@Pc(89) int local89 = 0; local89 < Static2.anInt17; local89++) {
			local66 = Static142.method2873(Static76.aStringArray17[local89]);
			if (local66 != null && local66.equals(local22)) {
				Static16.method2749(Static232.aString290 + arg0 + Static327.aString407);
				return;
			}
			if (Static77.aStringArray18[local89] != null) {
				@Pc(125) String local125 = Static142.method2873(Static77.aStringArray18[local89]);
				if (local125 != null && local125.equals(local22)) {
					Static16.method2749(Static232.aString290 + arg0 + Static327.aString407);
					return;
				}
			}
		}
		if (Static142.method2873(Static252.aClass22_Sub2_Sub1_Sub1_4.aString78).equals(local22)) {
			Static16.method2749(Static286.aString356);
		} else {
			Static29.aClass7_Sub3_Sub2_1.method2799(112);
			Static29.aClass7_Sub3_Sub2_1.method2735(Static344.method5559(arg0));
			Static29.aClass7_Sub3_Sub2_1.method2738(arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!pe;Lclient!hh;III)V")
	public static void method4451(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class49 local12;
		if (arg3 < Static346.anInt6536) {
			local12 = Static229.aClass49ArrayArrayArray6[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass22_Sub1_1 != null && local12.aClass22_Sub1_1.method5343()) {
				arg1.method5340(true, local12.aClass22_Sub1_1, arg0, 0, 128, 0);
			}
		}
		if (arg4 < Static346.anInt6536) {
			local12 = Static229.aClass49ArrayArrayArray6[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass22_Sub1_1 != null && local12.aClass22_Sub1_1.method5343()) {
				arg1.method5340(true, local12.aClass22_Sub1_1, arg0, 0, 0, 128);
			}
		}
		if (arg3 < Static346.anInt6536 && arg4 < Static174.anInt3604) {
			local12 = Static229.aClass49ArrayArrayArray6[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass22_Sub1_1 != null && local12.aClass22_Sub1_1.method5343()) {
				arg1.method5340(true, local12.aClass22_Sub1_1, arg0, 0, 128, 128);
			}
		}
		if (arg3 < Static346.anInt6536 && arg4 > 0) {
			local12 = Static229.aClass49ArrayArrayArray6[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass22_Sub1_1 != null && local12.aClass22_Sub1_1.method5343()) {
				arg1.method5340(true, local12.aClass22_Sub1_1, arg0, 0, 128, -128);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!rk;Lclient!rk;)V")
	public static void method4453(@OriginalArg(1) Class180 arg0, @OriginalArg(2) Class180 arg1) {
		Static154.aClass180_42 = arg1;
		Static331.aClass180_93 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!ap;)V")
	public static void method4454(@OriginalArg(1) Class7_Sub3 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static101.anInt2448; local5++) {
			@Pc(12) int local12 = arg0.method2732();
			@Pc(18) int local18 = arg0.method2764();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static238.aClass187_Sub1Array1[local12] != null) {
				Static238.aClass187_Sub1Array1[local12].anInt5942 = local18;
			}
		}
	}
}
