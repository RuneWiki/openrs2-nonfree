import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	public static int anInt558;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
	public static int anInt561;

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
	public static int anInt565;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
	public static int anInt564 = 3;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public static void method476() {
		Static43.aClass70_22.method1405();
		Static113.aClass70_37.method1405();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lclient!wo;")
	public static Class6_Sub2_Sub21 method477(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2_Sub21 local10 = (Class6_Sub2_Sub21) Static111.aClass31_6.method634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static329.aClass53_150.method1033(arg0, 5);
		local10 = new Class6_Sub2_Sub21();
		if (local20 != null) {
			local10.method5768(new Class6_Sub10(local20));
		}
		Static111.aClass31_6.method632((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public static void method479() {
		Static16.aClass81_1.method3007(Static311.aFloat83, Static329.aFloat85, Static209.aFloat71);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V")
	public static void method480() {
		Static120.aClass211_19.method5584();
		for (@Pc(17) Class6_Sub32 local17 = (Class6_Sub32) Static214.aClass211_24.method5594(); local17 != null; local17 = (Class6_Sub32) Static214.aClass211_24.method5582()) {
			if (local17.anInt4932 < 1000) {
				local17.method5756();
				Static120.aClass211_19.method5585(local17);
			}
		}
		Static120.aClass211_19.method5586(Static214.aClass211_24);
		if (Static313.aClass132_18 != null || (Static350.aClass132_20 != null || Static301.anInt5701 > 0)) {
			return;
		}
		@Pc(55) int local55 = Static118.anInt2240;
		@Pc(62) int local62;
		if (!Static201.aBoolean284) {
			if (local55 == 1 && Static256.anInt4749 > 0) {
				local62 = ((Class6_Sub32) Static214.aClass211_24.aClass6_237.aClass6_247).anInt4932;
				if (local62 == 7 || local62 == 8 || local62 == 10 || local62 == 48 || local62 == 16 || local62 == 28 || local62 == 42 || local62 == 23 || local62 == 24 || local62 == 34 || local62 == 11 || local62 == 1005) {
					@Pc(317) Class6_Sub32 local317 = (Class6_Sub32) Static214.aClass211_24.aClass6_237.aClass6_247;
					@Pc(322) Class132 local322 = Static249.method4316(local317.anInt4929);
					@Pc(325) Class6_Sub34 local325 = Static43.method751(local322);
					if (local325.method4571()) {
						Static147.aBoolean216 = false;
						Static102.anInt5257 = 0;
						if (Static313.aClass132_18 != null) {
							Static298.method5108(Static313.aClass132_18);
						}
						Static313.aClass132_18 = Static249.method4316(local317.anInt4929);
						Static283.anInt5344 = Static182.anInt3425;
						Static234.anInt32 = Static198.anInt3691;
						Static65.anInt1207 = local317.anInt4931;
						Static298.method5108(Static313.aClass132_18);
						return;
					}
				}
			}
			if (local55 <= 0 && Static171.anInt3191 > 0) {
				local55 = Static171.anInt3191;
			}
			Static171.anInt3191 = 0;
			if (local55 == 1 && (Static118.anInt2251 == 1 && Static256.anInt4749 > 2 || Static313.method5292())) {
				local55 = 2;
			}
			if (local55 == 2 && Static256.anInt4749 > 0) {
				Static328.method5459();
			}
			if (local55 != 1 || Static256.anInt4749 <= 0) {
				return;
			}
			Static167.method3292();
			return;
		}
		@Pc(64) int local64;
		if (local55 != 1) {
			local62 = Static7.anInt149;
			local64 = Static79.anInt1449;
			if (Static194.anInt3666 - 10 > local62 || local62 > Static194.anInt3666 + Static25.anInt507 + 10 || local64 < Static267.anInt4963 - 10 || Static267.anInt4963 + Static320.anInt5930 + 10 < local64) {
				Static201.aBoolean284 = false;
				Static101.method2080(Static25.anInt507, Static320.anInt5930, Static194.anInt3666, Static267.anInt4963);
			}
		}
		if (local55 != 1) {
			return;
		}
		local62 = Static194.anInt3666;
		local64 = Static267.anInt4963;
		@Pc(115) int local115 = Static25.anInt507;
		@Pc(117) int local117 = Static182.anInt3425;
		@Pc(119) int local119 = Static198.anInt3691;
		@Pc(121) int local121 = -1;
		@Pc(140) int local140;
		for (@Pc(123) int local123 = 0; local123 < Static256.anInt4749; local123++) {
			if (Static10.aBoolean19) {
				local140 = local64 + (Static256.anInt4749 - local123 - 1) * 16 + 33;
				if (local62 < local117 && local62 + local115 > local117 && local119 > local140 - 13 && local119 < local140 + 3) {
					local121 = local123;
				}
			} else {
				local140 = local64 + (Static256.anInt4749 - local123 - 1) * 16 + 31;
				if (local62 < local117 && local115 + local62 > local117 && local140 - 13 < local119 && local119 < local140 + 3) {
					local121 = local123;
				}
			}
		}
		if (local121 != -1) {
			local140 = 0;
			@Pc(221) Class4 local221 = new Class4(Static214.aClass211_24);
			for (@Pc(226) Class6_Sub32 local226 = (Class6_Sub32) local221.method51(); local226 != null; local226 = (Class6_Sub32) local221.method49()) {
				if (local140 == local121) {
					Static142.method2686(local226);
				}
				local140++;
			}
		}
		Static201.aBoolean284 = false;
		Static101.method2080(Static25.anInt507, Static320.anInt5930, Static194.anInt3666, Static267.anInt4963);
		return;
	}
}
