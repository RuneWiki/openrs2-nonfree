import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static int anInt1356;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
	public static final int[] anIntArray183 = new int[13];

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_52 = new Class221("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1296(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static282.anInt4969 > 0) {
			local18 = Static154.aByteArrayArray10[--Static282.anInt4969];
			Static154.aByteArrayArray10[Static282.anInt4969] = null;
			return local18;
		} else if (arg0 == 5000 && Static321.anInt5637 > 0) {
			local18 = Static327.aByteArrayArray18[--Static321.anInt5637];
			Static327.aByteArrayArray18[Static321.anInt5637] = null;
			return local18;
		} else if (arg0 == 30000 && Static338.anInt5997 > 0) {
			local18 = Static208.aByteArrayArray12[--Static338.anInt5997];
			Static208.aByteArrayArray12[Static338.anInt5997] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method1297() {
		Static209.aClass210_27.method5043();
		for (@Pc(18) Class2_Sub7 local18 = (Class2_Sub7) Static66.aClass210_43.method5035(); local18 != null; local18 = (Class2_Sub7) Static66.aClass210_43.method5037()) {
			if (local18.anInt541 < 1000) {
				local18.method5745();
				Static209.aClass210_27.method5044(local18);
			}
		}
		Static209.aClass210_27.method5041(Static66.aClass210_43);
		if (Static388.anInt4033 > 0) {
			return;
		}
		@Pc(50) int local50 = -1;
		if (Static345.aClass2_Sub10_1 != null) {
			local50 = Static345.aClass2_Sub10_1.method1120();
		}
		if (!Static48.aBoolean87) {
			if (local50 == 0 && (Static334.anInt5856 == 1 && Static379.anInt1192 > 2 || Static280.method4312())) {
				local50 = 2;
			}
			if (local50 == 2 && Static379.anInt1192 > 0 && Static345.aClass2_Sub10_1 != null) {
				if (Static243.aClass155_26 == null) {
					Static317.method4925(Static345.aClass2_Sub10_1.method1116(), Static345.aClass2_Sub10_1.method1124());
				} else {
					Static184.anInt6290 = 2;
				}
			}
			if (local50 == 0 && Static379.anInt1192 > 0) {
				Static7.method242();
			}
			if (Static243.aClass155_26 != null) {
				return;
			}
			Static298.aClass2_Sub7_1 = null;
			Static184.anInt6290 = 0;
			return;
		}
		@Pc(65) int local65;
		@Pc(69) int local69;
		if (local50 == -1) {
			local65 = Static138.aClass78_1.method1804();
			local69 = Static138.aClass78_1.method1808();
			if (Static8.anInt189 - 10 > local65 || Static8.anInt189 + Static300.anInt5403 + 10 < local65 || Static40.anInt6591 - 10 > local69 || Static40.anInt6591 + Static71.anInt1351 + 10 < local69) {
				Static48.aBoolean87 = false;
				Static299.method4675(Static71.anInt1351, Static8.anInt189, Static40.anInt6591, Static300.anInt5403);
			}
		}
		if (local50 != 0) {
			return;
		}
		local65 = Static8.anInt189;
		local69 = Static40.anInt6591;
		@Pc(112) int local112 = Static300.anInt5403;
		@Pc(116) int local116 = Static345.aClass2_Sub10_1.method1124();
		@Pc(120) int local120 = Static345.aClass2_Sub10_1.method1116();
		@Pc(122) int local122 = -1;
		@Pc(141) int local141;
		for (@Pc(124) int local124 = 0; local124 < Static379.anInt1192; local124++) {
			if (Static372.aBoolean487) {
				local141 = (Static379.anInt1192 - local124 - 1) * 16 + local69 + 33;
				if (local65 < local116 && local112 + local65 > local116 && local141 - 13 < local120 && local141 + 4 > local120) {
					local122 = local124;
				}
			} else {
				local141 = (Static379.anInt1192 - local124 - 1) * 16 + local69 + 31;
				if (local116 > local65 && local116 < local112 + local65 && local141 - 13 < local120 && local141 + 3 > local120) {
					local122 = local124;
				}
			}
		}
		if (local122 != -1) {
			local141 = 0;
			@Pc(230) Class150 local230 = new Class150(Static66.aClass210_43);
			for (@Pc(235) Class2_Sub7 local235 = (Class2_Sub7) local230.method3700(); local235 != null; local235 = (Class2_Sub7) local230.method3698()) {
				if (local122 == local141) {
					Static294.method4660(local235);
				}
				local141++;
			}
		}
		Static48.aBoolean87 = false;
		Static299.method4675(Static71.anInt1351, Static8.anInt189, Static40.anInt6591, Static300.anInt5403);
		return;
	}
}
