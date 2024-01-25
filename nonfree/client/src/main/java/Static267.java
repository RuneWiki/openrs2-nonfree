import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public static int anInt4660;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "[Lclient!ho;")
	public static Class9[] aClass9Array79;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
	public static int anInt4661 = 0;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Z")
	public static boolean aBoolean292 = true;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public static int anInt4665 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!bja;Lclient!ha;)I")
	public static int method3975(@OriginalArg(1) Class38 arg0, @OriginalArg(2) Class132 arg1) {
		if (arg0.anInt1023 != -1) {
			return arg0.anInt1023;
		}
		if (arg0.anInt1014 != -1) {
			@Pc(22) Class294 local22 = arg1.anInterface6_11.method7088(arg0.anInt1014);
			if (!local22.aBoolean573) {
				return local22.aShort108;
			}
		}
		return arg0.anInt1021;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3977(@OriginalArg(1) String arg0) {
		return Static29.method5713(arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJ)V")
	public static void method3978(@OriginalArg(1) long arg0) {
		if (Static441.aClass351ArrayArrayArray1 != null) {
			if (Static407.anInt6820 == 1 || Static407.anInt6820 == 5) {
				Static223.method3248(arg0);
			} else if (Static407.anInt6820 == 4) {
				Static296.method4233(arg0);
			}
		}
		Static564.method7908(Static546.aClass132_13, (long) Static90.anInt1698);
		if (Static561.anInt9357 != -1) {
			Static663.method8290(Static561.anInt9357);
		}
		for (@Pc(47) int local47 = 0; local47 < Static65.anInt1203; local47++) {
			if (Static224.aBooleanArray12[local47]) {
				Static504.aBooleanArray24[local47] = true;
			}
			Static253.aBooleanArray15[local47] = Static224.aBooleanArray12[local47];
			Static224.aBooleanArray12[local47] = false;
		}
		Static188.anInt3222 = Static90.anInt1698;
		Static159.method2243((Class321) null, -1, -1);
		Static526.method7373(-1, -1, (Class321) null);
		if (Static561.anInt9357 != -1) {
			Static65.anInt1203 = 0;
			Static577.method8021();
		}
		Static546.aClass132_13.la();
		Static340.method4998(Static546.aClass132_13);
		@Pc(98) int local98 = Static578.method8043();
		if (local98 == -1) {
			local98 = Static357.anInt6124;
		}
		if (local98 == -1) {
			local98 = Static471.anInt8114;
		}
		Static226.method3295(local98);
		@Pc(118) int local118 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326() << 8;
		Static648.method8828(Static332.anInt7620, local118 + Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140, local118 + Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001);
		Static332.anInt7620 = 0;
	}
}
