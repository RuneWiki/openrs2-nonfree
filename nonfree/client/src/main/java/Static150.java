import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_112 = new Class123(24, 8);

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Z")
	public static boolean aBoolean247 = false;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
	public static int anInt3468 = 0;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "Lclient!eu;")
	public static final Class95 aClass95_3 = new Class95(8, 1);

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
	public static final int anInt3469 = 7000;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(JB)V")
	public static void method2826(@OriginalArg(0) long arg0) {
		if (Static189.aClass333ArrayArrayArray1 != null) {
			if (Static188.anInt4080 == 1 || Static188.anInt4080 == 5) {
				Static106.method2189(arg0);
			} else if (Static188.anInt4080 == 4) {
				Static554.method7608(arg0);
			}
		}
		Static592.method5620(Static319.aClass31_11, (long) Static397.anInt6998);
		if (Static79.anInt2118 != -1) {
			Static8.method72(Static79.anInt2118);
		}
		for (@Pc(39) int local39 = 0; local39 < Static314.anInt5780; local39++) {
			if (Static544.aBooleanArray32[local39]) {
				Static383.aBooleanArray20[local39] = true;
			}
			Static178.aBooleanArray11[local39] = Static544.aBooleanArray32[local39];
			Static544.aBooleanArray32[local39] = false;
		}
		Static177.anInt3896 = Static397.anInt6998;
		if (Static79.anInt2118 != -1) {
			Static314.anInt5780 = 0;
			Static40.method1076();
		}
		Static319.aClass31_11.JA();
		Static204.method3505(Static319.aClass31_11);
		@Pc(86) int local86 = Static90.method1967();
		if (local86 == -1) {
			local86 = Static580.anInt10049;
		}
		if (local86 == -1) {
			local86 = Static211.anInt8483;
		}
		Static306.method4607(local86);
		@Pc(109) int local109 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method6668() << 8;
		Static184.method8139(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 + local109, local109 + Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482, Static208.anInt4448);
		Static208.anInt4448 = 0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Z")
	public static boolean method2828(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
