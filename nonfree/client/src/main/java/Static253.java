import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "Z")
	public static boolean aBoolean348;

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "Z")
	public static volatile boolean aBoolean349 = true;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "[I")
	public static final int[] anIntArray376 = new int[1];

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "[I")
	public static final int[] anIntArray377 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
	public static void method4294() {
		Static307.aClass361_46.method7842();
		Static535.aClass361_64.method7842();
		@Pc(26) int local26;
		for (@Pc(16) Class6_Sub45 local16 = (Class6_Sub45) Static182.aClass361_23.method7838(); local16 != null; local16 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
			local26 = local16.anInt8730;
			if (local26 < 1000) {
				local16.method7804();
				if (local26 == 45 || local26 == 50 || local26 == 58 || local26 == 46 || local26 == 57 || local26 == 5 || local26 == 60) {
					Static535.aClass361_64.method7833(local16);
				} else {
					Static307.aClass361_46.method7833(local16);
				}
			}
		}
		Static307.aClass361_46.method7843(Static182.aClass361_23);
		Static535.aClass361_64.method7843(Static182.aClass361_23);
		if (Static421.anInt7365 <= 1) {
			Static328.aClass6_Sub45_3 = null;
		} else if (Static159.aBoolean736 && Static365.aClass155_1.method4042(81) && Static421.anInt7365 > 2) {
			Static328.aClass6_Sub45_3 = (Class6_Sub45) Static182.aClass361_23.aClass6_287.aClass6_285.aClass6_285;
		} else {
			Static328.aClass6_Sub45_3 = (Class6_Sub45) Static182.aClass361_23.aClass6_287.aClass6_285;
		}
		local26 = -1;
		@Pc(125) Class6_Sub5 local125 = (Class6_Sub5) Static395.aClass361_52.method7838();
		if (local125 != null) {
			local26 = local125.method1986();
		}
		if (!Static587.aBoolean734) {
			if (local26 == 0 && (Static51.anInt1132 == 1 && Static421.anInt7365 > 2 || Static176.method3232())) {
				local26 = 2;
			}
			if (local26 == 2 && Static421.anInt7365 > 0 && local125 != null) {
				if (Static547.aClass292_14 == null && Static114.anInt2194 == 0) {
					Static273.method4515(local125.method1991(), local125.method1982());
				} else {
					Static300.anInt5542 = 2;
				}
			}
			if (local26 == 0 && Static421.anInt7365 > 0) {
				Static498.method6757();
			}
			if (Static547.aClass292_14 != null || Static114.anInt2194 != 0) {
				return;
			}
			Static113.aClass6_Sub45_2 = null;
			Static300.anInt5542 = 0;
			return;
		}
		@Pc(141) int local141;
		@Pc(145) int local145;
		if (local26 == -1) {
			local141 = Static164.aClass173_1.method6487();
			local145 = Static164.aClass173_1.method6489();
			if (local141 < Static574.anInt9422 - 10 || Static574.anInt9422 + Static363.anInt6354 + 10 < local141 || Static397.anInt6954 - 10 > local145 || Static397.anInt6954 + Static144.anInt3166 + 10 < local145) {
				Static175.method3221();
			}
		}
		if (local26 != 0) {
			return;
		}
		local141 = Static574.anInt9422;
		local145 = Static397.anInt6954;
		@Pc(192) int local192 = Static363.anInt6354;
		@Pc(196) int local196 = local125.method1991();
		@Pc(202) int local202 = local125.method1982();
		@Pc(204) int local204 = -1;
		@Pc(222) int local222;
		for (@Pc(206) int local206 = 0; local206 < Static421.anInt7365; local206++) {
			if (Static370.aBoolean454) {
				local222 = (Static421.anInt7365 - local206 - 1) * 16 + local145 + 33;
				if (local196 > local141 && local192 + local141 > local196 && local202 > local222 - 13 && local222 + 4 > local202) {
					local204 = local206;
				}
			} else {
				local222 = (Static421.anInt7365 - local206 - 1) * 16 + local145 + 31;
				if (local141 < local196 && local196 < local141 + local192 && local202 > local222 - 13 && local222 + 3 > local202) {
					local204 = local206;
				}
			}
		}
		if (local204 != -1) {
			local222 = 0;
			@Pc(321) Class36 local321 = new Class36(Static182.aClass361_23);
			for (@Pc(326) Class6_Sub45 local326 = (Class6_Sub45) local321.method1056(); local326 != null; local326 = (Class6_Sub45) local321.method1052()) {
				if (local204 == local222) {
					Static540.method3563(local326, local202, local196);
				}
				local222++;
			}
		}
		Static175.method3221();
		return;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
	public static boolean method4295(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class252 local8 = Static412.aClass307_4.method6636(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method5788(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)I")
	public static int method4296(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}
}
