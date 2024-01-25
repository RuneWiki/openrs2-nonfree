import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bk", name = "V", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!bk", name = "W", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!bk", name = "xb", descriptor = "[I")
	public static final int[] anIntArray48 = new int[5];

	@OriginalMember(owner = "client!bk", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray50 = new int[5];

	@OriginalMember(owner = "client!bk", name = "Jb", descriptor = "F")
	public static float aFloat4 = 0.0F;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method709(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static442.method6404(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static398.anInt2169; local25++) {
			@Pc(31) String local31 = Static314.aStringArray32[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static442.method6404(local31);
			if (local31 != null && local31.equals(local20)) {
				Static398.anInt2169--;
				for (@Pc(55) int local55 = local25; local55 < Static398.anInt2169; local55++) {
					Static314.aStringArray32[local55] = Static314.aStringArray32[local55 + 1];
					Static185.aStringArray24[local55] = Static185.aStringArray24[local55 + 1];
					Static137.anIntArray174[local55] = Static137.anIntArray174[local55 + 1];
					Static88.aStringArray29[local55] = Static88.aStringArray29[local55 + 1];
					Static198.anIntArray239[local55] = Static198.anIntArray239[local55 + 1];
					Static156.aBooleanArray7[local55] = Static156.aBooleanArray7[local55 + 1];
				}
				Static185.anInt3634 = Static144.anInt2943;
				Static403.method5961(Static160.aClass92_55);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static16.method471(arg0));
				Static109.aClass6_Sub1_Sub1_5.method6448(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!gl;)V")
	public static void method713(@OriginalArg(1) Class57_Sub2 arg0) {
		arg0.aClass3_1 = null;
		@Pc(18) int local18 = arg0.aClass57_Sub5Array1.length;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			arg0.aClass57_Sub5Array1[local20].aBoolean267 = false;
		}
		@Pc(38) Class111[] local38 = Class6_Sub2_Sub4.aClass111Array3;
		synchronized (Class6_Sub2_Sub4.aClass111Array3) {
			if (Class6_Sub2_Sub4.aClass111Array3.length > local18 && anIntArray50[local18] < 200) {
				Class6_Sub2_Sub4.aClass111Array3[local18].method2696(arg0);
				@Pc(65) int local65 = anIntArray50[local18]++;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)I")
	public static int method719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = (arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00 | arg0 * (arg2 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(31) int local31 = 255 - arg0;
		return local26 + (((arg1 & 0xFF00FF) * local31 & 0xFF00FF00 | (arg1 & 0xFF00) * local31 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!cu;B)I")
	public static int method722(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0) {
		@Pc(8) Class48 local8 = arg0.aClass48_1;
		if (local8.anIntArray103 != null) {
			local8 = local8.method1378(Static393.aClass207_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local8.anInt1760;
		@Pc(36) Class246 local36 = arg0.method5513();
		if (arg0.aBoolean418) {
			local30 = local8.anInt1776;
		} else if (arg0.anInt6597 == local36.anInt7296 || arg0.anInt6597 == local36.anInt7311 || arg0.anInt6597 == local36.anInt7293 || arg0.anInt6597 == local36.anInt7315) {
			local30 = local8.anInt1778;
		} else if (arg0.anInt6597 == local36.anInt7325 || arg0.anInt6597 == local36.anInt7322 || local36.anInt7327 == arg0.anInt6597 || arg0.anInt6597 == local36.anInt7308) {
			local30 = local8.anInt1771;
		}
		return local30;
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V")
	public static void method731() {
		if (Static217.anInt3941 == 10) {
			Static100.method1818(28);
		}
		if (Static217.anInt3941 == 30) {
			Static100.method1818(25);
		}
	}
}
