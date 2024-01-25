import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!su", name = "f", descriptor = "Lclient!ll;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!su", name = "e", descriptor = "I")
	public static int anInt6628 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)V")
	public static void method5267(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg0, 3);
		local8.method2578();
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I[Lclient!o;)V")
	public static void method5269(@OriginalArg(1) Class41[] arg0) {
		Static380.anInt6600 = arg0.length;
		Static112.anIntArray145 = new int[Static380.anInt6600 + 10];
		Static243.aClass41Array8 = new Class41[Static380.anInt6600 + 10];
		Static472.method5024(arg0, 0, Static243.aClass41Array8, 0, Static380.anInt6600);
		for (@Pc(26) int local26 = 0; local26 < Static380.anInt6600; local26++) {
			Static112.anIntArray145[local26] = Static243.aClass41Array8[local26].Q();
		}
		for (@Pc(45) int local45 = Static380.anInt6600; local45 < Static243.aClass41Array8.length; local45++) {
			Static112.anIntArray145[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BI)V")
	public static void method5270(@OriginalArg(1) int arg0) {
		Static180.anInt3183 = arg0;
		Static227.anInt3810 = -1;
		Static227.anInt3810 = -1;
		Static423.method5788();
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "([[BLclient!hd;Z)V")
	public static void method5273(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class107_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class2_Sub17 local30 = new Class2_Sub17(local23);
				local36 = Static450.anIntArray635[local17] >> 8;
				@Pc(42) int local42 = Static450.anIntArray635[local17] & 0xFF;
				@Pc(48) int local48 = local36 * 64 - Static386.anInt7205;
				@Pc(55) int local55 = local42 * 64 - Static153.anInt2798;
				Static230.method3117();
				arg1.method2277(Static89.aClass225Array2, local30, Static386.anInt7205, Static153.anInt2798, local48, local55);
				arg1.method2283(local30, local48, local12, Static257.aClass75_8, local55);
				if (!arg1.aBoolean171 && local36 == Static269.anInt2101 / 8 && Static163.anInt2919 / 8 == local42 && local12[0] != -1) {
					Static454.aClass247_1 = Static174.aClass147_1.method3049(Static388.aClass35_1, local12[2], local12[0], local12[3], local12[1]);
					Static149.anInt7394 = local12[4];
				}
			}
		}
		for (@Pc(131) int local131 = 0; local131 < local15; local131++) {
			@Pc(144) int local144 = (Static450.anIntArray635[local131] >> 8) * 64 - Static386.anInt7205;
			local36 = (Static450.anIntArray635[local131] & 0xFF) * 64 - Static153.anInt2798;
			@Pc(159) byte[] local159 = arg0[local131];
			if (local159 == null && Static163.anInt2919 < 800) {
				Static230.method3117();
				arg1.method2269(local36, local144);
			}
		}
	}
}
