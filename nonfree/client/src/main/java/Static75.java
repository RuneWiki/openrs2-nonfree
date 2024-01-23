import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "Lclient!jd;")
	public static Class84 aClass84_33;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
	public static int anInt1615;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	public static int anInt1618;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Lclient!ec;")
	public static Class46 aClass46_11 = new Class46(4);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public static void method1371() {
		Static72.aClass46_8.method1068(5);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BIIII)V")
	public static void method1374(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) int local9 = 0; local9 < Static231.anInt4776; local9++) {
			if (Static295.anIntArray526[local9] + Static12.anIntArray14[local9] > arg0 && Static12.anIntArray14[local9] < arg2 + arg0 && arg1 < Static113.anIntArray166[local9] + Static264.anIntArray483[local9] && Static113.anIntArray166[local9] < arg3 + arg1) {
				Static90.aBooleanArray9[local9] = true;
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public static void method1375() {
		if (Static161.anInt3399 > 0) {
			Static226.method1673();
		} else {
			Static254.aClass45_4 = Static42.aClass45_1;
			Static42.aClass45_1 = null;
			Static21.method453(40);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method1377(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) char local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) char local19 = 0;
		while (local15 - local13 < local8 || local17 - local19 < local11) {
			if (local8 <= local15 - local13) {
				return -1;
			}
			if (local11 <= local17 - local19) {
				return 1;
			}
			@Pc(62) char local62;
			if (local13 == '\u0000') {
				local62 = arg1.charAt(local15++);
			} else {
				local62 = local13;
			}
			@Pc(75) char local75;
			if (local19 == '\u0000') {
				local75 = arg0.charAt(local17++);
			} else {
				local75 = local19;
			}
			local13 = Static72.method1337(local62);
			local19 = Static72.method1337(local75);
			local62 = Static144.method2552(arg2, local62);
			local75 = Static144.method2552(arg2, local75);
			if (local75 != local62 && Character.toUpperCase(local62) != Character.toUpperCase(local75)) {
				local62 = Character.toLowerCase(local62);
				local75 = Character.toLowerCase(local75);
				if (local75 != local62) {
					return Static292.method4849(arg2, local62) - Static292.method4849(arg2, local75);
				}
			}
		}
		@Pc(140) int local140 = Math.min(local8, local11);
		@Pc(176) char local176;
		@Pc(142) int local142;
		for (local142 = 0; local142 < local140; local142++) {
			if (arg2 == 2) {
				local17 = local11 - local142 - 1;
				local15 = local8 - local142 - 1;
			} else {
				local17 = local142;
				local15 = local142;
			}
			@Pc(172) char local172 = arg1.charAt(local15);
			local176 = arg0.charAt(local17);
			if (local176 != local172 && Character.toUpperCase(local172) != Character.toUpperCase(local176)) {
				local172 = Character.toLowerCase(local172);
				local176 = Character.toLowerCase(local176);
				if (local176 != local172) {
					return Static292.method4849(arg2, local172) - Static292.method4849(arg2, local176);
				}
			}
		}
		local142 = local8 - local11;
		if (local142 != 0) {
			return local142;
		}
		for (@Pc(225) int local225 = 0; local225 < local140; local225++) {
			local176 = arg1.charAt(local225);
			@Pc(240) char local240 = arg0.charAt(local225);
			if (local240 != local176) {
				return Static292.method4849(arg2, local176) - Static292.method4849(arg2, local240);
			}
		}
		return 0;
	}
}
