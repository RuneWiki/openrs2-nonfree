import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	public static int anInt1589;

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
	public static int anInt1590;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	public static int anInt1595;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "Lclient!ga;")
	public static Class111 aClass111_15;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "Z")
	public static final boolean aBoolean128 = true;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(JJ)J")
	public static long method1445(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method1446() {
		Static541.aClass361_101.method7860();
		Static347.aClass361_100.method7860();
		@Pc(26) int local26;
		for (@Pc(21) Class1_Sub23 local21 = (Class1_Sub23) Static3.aClass361_1.method7854(); local21 != null; local21 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
			local26 = local21.anInt5147;
			if (local26 < 1000) {
				local21.method7878();
				if (local26 == 20 || local26 == 18 || local26 == 19 || local26 == 59 || local26 == 22 || local26 == 57 || local26 == 2) {
					Static347.aClass361_100.method7855(local21);
				} else {
					Static541.aClass361_101.method7855(local21);
				}
			}
		}
		Static541.aClass361_101.method7856(Static3.aClass361_1);
		Static347.aClass361_100.method7856(Static3.aClass361_1);
		if (Static135.anInt2684 <= 1) {
			Static323.aClass1_Sub23_1 = null;
		} else if (Static490.aBoolean598 && Static595.aClass31_1.method985(81) && Static135.anInt2684 > 2) {
			Static323.aClass1_Sub23_1 = (Class1_Sub23) Static3.aClass361_1.aClass1_281.aClass1_285.aClass1_285;
		} else {
			Static323.aClass1_Sub23_1 = (Class1_Sub23) Static3.aClass361_1.aClass1_281.aClass1_285;
		}
		local26 = -1;
		@Pc(133) Class1_Sub13 local133 = (Class1_Sub13) Static270.aClass361_55.method7854();
		if (local133 != null) {
			local26 = local133.method2533();
		}
		if (!Static294.aBoolean407) {
			if (local26 == 0 && (Static54.anInt1401 == 1 && Static135.anInt2684 > 2 || Static9.method136())) {
				local26 = 2;
			}
			if (local26 == 2 && Static135.anInt2684 > 0 && local133 != null) {
				if (Static363.aClass365_14 == null && Static347.anInt9410 == 0) {
					Static198.method3416(local133.method2536(), local133.method2537());
				} else {
					Static68.anInt1585 = 2;
				}
			}
			if (local26 == 0 && Static135.anInt2684 > 0) {
				Static84.method1707();
			}
			if (Static363.aClass365_14 != null || Static347.anInt9410 != 0) {
				return;
			}
			Static330.aClass1_Sub23_2 = null;
			Static68.anInt1585 = 0;
			return;
		}
		@Pc(148) int local148;
		@Pc(152) int local152;
		if (local26 == -1) {
			local148 = Static287.aClass256_8.method7558();
			local152 = Static287.aClass256_8.method7561();
			if (local148 < Static215.anInt4176 - 10 || local148 > Static86.anInt1957 + Static215.anInt4176 + 10 || local152 < Static2.anInt57 - 10 || local152 > Static100.anInt2087 + Static2.anInt57 + 10) {
				Static38.method901();
			}
		}
		if (local26 != 0) {
			return;
		}
		local148 = Static215.anInt4176;
		local152 = Static2.anInt57;
		@Pc(186) int local186 = Static86.anInt1957;
		@Pc(190) int local190 = local133.method2536();
		@Pc(194) int local194 = local133.method2537();
		@Pc(196) int local196 = -1;
		@Pc(215) int local215;
		for (@Pc(198) int local198 = 0; local198 < Static135.anInt2684; local198++) {
			if (Static268.aBoolean383) {
				local215 = (Static135.anInt2684 - local198 - 1) * 16 + local152 + 33;
				if (local148 < local190 && local148 + local186 > local190 && local194 > local215 - 13 && local194 < local215 + 4) {
					local196 = local198;
				}
			} else {
				local215 = (Static135.anInt2684 - local198 - 1) * 16 + local152 + 31;
				if (local148 < local190 && local186 + local148 > local190 && local194 > local215 - 13 && local215 + 3 > local194) {
					local196 = local198;
				}
			}
		}
		if (local196 != -1) {
			local215 = 0;
			@Pc(306) Class187 local306 = new Class187(Static3.aClass361_1);
			for (@Pc(311) Class1_Sub23 local311 = (Class1_Sub23) local306.method4201(); local311 != null; local311 = (Class1_Sub23) local306.method4204()) {
				if (local196 == local215) {
					Static394.method5603(local194, local311, local190);
				}
				local215++;
			}
		}
		Static38.method901();
		return;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!r;II)V")
	public static void method1447(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static176.aClass278ArrayArray1 = new Class278[arg1][arg2];
		Static174.aClass12_9 = arg0;
		if (Static317.anIntArray365 != null) {
			Static582.aClass36_4 = Static209.method3525(Static317.anIntArray365[1], Static317.anIntArray365[4], Static317.anIntArray365[0], Static317.anIntArray365[3], Static317.anIntArray365[5], Static317.anIntArray365[2]);
		}
		Static433.aClass278_1 = new Class278();
		Static293.method4615();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
	public static void method1449(@OriginalArg(1) int arg0) {
		Static82.method7596(arg0, Static103.aClass77_14.method1864(Static562.anInt9127));
	}
}
