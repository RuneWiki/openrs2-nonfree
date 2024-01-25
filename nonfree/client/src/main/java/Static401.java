import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	public static int anInt7435;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "[I")
	public static int[] anIntArray371;

	@OriginalMember(owner = "client!og", name = "eb", descriptor = "Lclient!ni;")
	public static Class223 aClass223_87;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	public static void method6299() {
		Static580.method8049(Static448.aClass302_13);
		Static191.anInt4144++;
		if (Static308.aBoolean477 && Static423.aBoolean623) {
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			if (Static238.aBoolean425) {
				local26 = Static352.method5739();
				local28 = Static573.method7997();
			}
			@Pc(43) int local43 = Static6.aClass96_1.method8026() + local26;
			@Pc(50) int local50 = Static6.aClass96_1.method8019() + local28;
			local50 -= Static131.anInt3186;
			local43 -= Static334.anInt6640;
			if (local43 < Static66.anInt2272) {
				local43 = Static66.anInt2272;
			}
			if (Static448.aClass302_13.anInt8909 + local43 > Static352.aClass302_9.anInt8909 + Static66.anInt2272) {
				local43 = Static66.anInt2272 + Static352.aClass302_9.anInt8909 - Static448.aClass302_13.anInt8909;
			}
			if (Static397.anInt7407 > local50) {
				local50 = Static397.anInt7407;
			}
			if (Static448.aClass302_13.anInt8872 + local50 > Static397.anInt7407 - -Static352.aClass302_9.anInt8872) {
				local50 = Static397.anInt7407 + Static352.aClass302_9.anInt8872 - Static448.aClass302_13.anInt8872;
			}
			@Pc(121) int local121 = local43 + Static352.aClass302_9.anInt8865 - Static66.anInt2272;
			@Pc(130) int local130 = local50 + Static352.aClass302_9.anInt8847 - Static397.anInt7407;
			@Pc(181) Class6_Sub29 local181;
			if (Static6.aClass96_1.method8017()) {
				if (Static448.aClass302_13.anInt8934 < Static191.anInt4144) {
					@Pc(224) int local224 = local43 - Static313.anInt6261;
					@Pc(228) int local228 = local50 - Static456.anInt8196;
					if (local224 > Static448.aClass302_13.anInt8905 || -Static448.aClass302_13.anInt8905 > local224 || local228 > Static448.aClass302_13.anInt8905 || local228 < -Static448.aClass302_13.anInt8905) {
						Static30.aBoolean79 = true;
					}
				}
				if (Static448.aClass302_13.anObjectArray24 != null && Static30.aBoolean79) {
					local181 = new Class6_Sub29();
					local181.anObjectArray1 = Static448.aClass302_13.anObjectArray24;
					local181.aClass302_7 = Static448.aClass302_13;
					local181.anInt5605 = local121;
					local181.anInt5603 = local130;
					Static435.method6669(local181);
				}
			} else {
				if (Static30.aBoolean79) {
					Static516.method7391();
					if (Static448.aClass302_13.anObjectArray22 != null) {
						local181 = new Class6_Sub29();
						local181.aClass302_6 = Static302.aClass302_8;
						local181.anInt5603 = local130;
						local181.aClass302_7 = Static448.aClass302_13;
						local181.anObjectArray1 = Static448.aClass302_13.anObjectArray22;
						local181.anInt5605 = local121;
						Static435.method6669(local181);
					}
					if (Static302.aClass302_8 != null && Static75.method2137(Static448.aClass302_13) != null) {
						Static371.method5910(Static302.aClass302_8, Static448.aClass302_13);
					}
				} else if ((Static358.anInt6951 == 1 || Static135.method2721()) && Static611.anInt10324 > 2) {
					Static604.method8339(Static131.anInt3186 + Static456.anInt8196, Static334.anInt6640 - -Static313.anInt6261);
				} else if (Static182.method3423()) {
					Static604.method8339(Static456.anInt8196 + Static131.anInt3186, Static334.anInt6640 + Static313.anInt6261);
				}
				Static448.aClass302_13 = null;
			}
		} else if (Static191.anInt4144 > 1) {
			Static448.aClass302_13 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Lclient!jp;")
	public static Class42 method6314() {
		try {
			return (Class42) Class.forName("Class42_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class42_Sub2();
		}
	}
}
