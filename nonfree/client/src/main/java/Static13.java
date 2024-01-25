import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "Lclient!wu;")
	public static Class380 aClass380_4;

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_2 = new Class222(15, 0, 1, 0);

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "([BIII)I")
	public static int method184(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg1; local14++) {
			local12 = Class342.anIntArray623[(local12 ^ arg0[local14]) & 0xFF] ^ local12 >>> 8;
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIII)V")
	public static void method185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static414.method5547(arg3 + arg1, Static379.anInt5914, Static624.anInt10032);
		@Pc(31) int local31 = Static414.method5547(arg1 - arg3, Static379.anInt5914, Static624.anInt10032);
		Static134.method1841(Static543.anIntArrayArray57[arg0], local31, local22, arg2);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(62) int local62;
			@Pc(67) int local67;
			@Pc(82) int local82;
			@Pc(91) int local91;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local62 = arg0 - local9;
				local67 = arg0 + local9;
				if (Static257.anInt4068 <= local67 && local62 <= Static67.anInt1214) {
					local82 = Static414.method5547(arg1 + local7, Static379.anInt5914, Static624.anInt10032);
					local91 = Static414.method5547(arg1 - local7, Static379.anInt5914, Static624.anInt10032);
					if (Static67.anInt1214 >= local67) {
						Static134.method1841(Static543.anIntArrayArray57[local67], local91, local82, arg2);
					}
					if (Static257.anInt4068 <= local62) {
						Static134.method1841(Static543.anIntArrayArray57[local62], local91, local82, arg2);
					}
				}
			}
			local7++;
			local62 = arg0 - local7;
			local67 = local7 + arg0;
			if (local67 >= Static257.anInt4068 && Static67.anInt1214 >= local62) {
				local82 = Static414.method5547(local9 + arg1, Static379.anInt5914, Static624.anInt10032);
				local91 = Static414.method5547(arg1 - local9, Static379.anInt5914, Static624.anInt10032);
				if (local67 <= Static67.anInt1214) {
					Static134.method1841(Static543.anIntArrayArray57[local67], local91, local82, arg2);
				}
				if (Static257.anInt4068 <= local62) {
					Static134.method1841(Static543.anIntArrayArray57[local62], local91, local82, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!wu;ILclient!mr;)V")
	public static void method187(@OriginalArg(0) Class380 arg0, @OriginalArg(2) Class226 arg1) {
		Static401.aClass226_4 = arg1;
		Static281.aClass380_68 = arg0;
		Static231.aString35 = "";
		if (Class363.aString107.startsWith("win")) {
			Static231.aString35 = Static231.aString35 + "windows/";
		} else if (Class363.aString107.startsWith("linux")) {
			Static231.aString35 = Static231.aString35 + "linux/";
		} else if (Class363.aString107.startsWith("mac")) {
			Static231.aString35 = Static231.aString35 + "macos/";
		}
		if (Static401.aClass226_4.aBoolean415) {
			Static231.aString35 = Static231.aString35 + "msjava/";
		} else if (Class363.aString108.startsWith("amd64") || Class363.aString108.startsWith("x86_64")) {
			Static231.aString35 = Static231.aString35 + "x86_64/";
		} else if (Class363.aString108.startsWith("i386") || Class363.aString108.startsWith("i486") || Class363.aString108.startsWith("i586") || Class363.aString108.startsWith("x86")) {
			Static231.aString35 = Static231.aString35 + "x86/";
		} else if (Class363.aString108.startsWith("ppc")) {
			Static231.aString35 = Static231.aString35 + "ppc/";
		} else {
			Static231.aString35 = Static231.aString35 + "universal/";
		}
	}
}
