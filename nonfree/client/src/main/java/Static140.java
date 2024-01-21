import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_3;

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
	public static int anInt3001;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1354 = Static32.method683("<col=ffff00>");

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1355 = Static32.method683("null");

	@OriginalMember(owner = "client!ra", name = "Y", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
	public static int anInt3002 = 0;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
	public static void method2334() {
		aClass49_1354 = null;
		aClass2_Sub2_Sub2_Sub2_3 = null;
		aClass49_1355 = null;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
	public static void method2335() {
		if (Static68.aBooleanArray10[98]) {
			Static175.anInt3806 += (12 - Static175.anInt3806) / 2;
		} else if (Static68.aBooleanArray10[99]) {
			Static175.anInt3806 += (-Static175.anInt3806 - 12) / 2;
		} else {
			Static175.anInt3806 /= 2;
		}
		if (Static68.aBooleanArray10[96]) {
			Static154.anInt3329 += (-Static154.anInt3329 - 24) / 2;
		} else if (Static68.aBooleanArray10[97]) {
			Static154.anInt3329 += (24 - Static154.anInt3329) / 2;
		} else {
			Static154.anInt3329 /= 2;
		}
		Static126.anInt2750 += Static175.anInt3806 / 2;
		Static63.anInt1356 = Static154.anInt3329 / 2 + Static63.anInt1356 & 0x7FF;
		@Pc(90) int local90 = Static54.anInt1195 + Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529;
		if (Static126.anInt2750 < 128) {
			Static126.anInt2750 = 128;
		}
		@Pc(100) int local100 = Static154.anInt3331 + Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578;
		if (Static126.anInt2750 > 383) {
			Static126.anInt2750 = 383;
		}
		if (Static11.anInt194 - local90 < -500 || Static11.anInt194 - local90 > 500 || Static1.anInt1 - local100 < -500 || Static1.anInt1 - local100 > 500) {
			Static1.anInt1 = local100;
			Static11.anInt194 = local90;
		}
		if (Static11.anInt194 != local90) {
			Static11.anInt194 += (local90 - Static11.anInt194) / 16;
		}
		if (local100 != Static1.anInt1) {
			Static1.anInt1 += (local100 - Static1.anInt1) / 16;
		}
		@Pc(173) int local173 = Static1.anInt1 >> 7;
		@Pc(177) int local177 = Static11.anInt194 >> 7;
		@Pc(183) int local183 = Static18.method346(Static1.anInt1, Static66.anInt1396, Static11.anInt194);
		@Pc(185) int local185 = 0;
		@Pc(207) int local207;
		if (local177 > 3 && local173 > 3 && local177 < 100 && local173 < 100) {
			for (local207 = local177 - 4; local207 <= local177 + 4; local207++) {
				for (@Pc(213) int local213 = local173 - 4; local213 <= local173 + 4; local213++) {
					@Pc(217) int local217 = Static66.anInt1396;
					if (local217 < 3 && (Static81.aByteArrayArrayArray2[1][local207][local213] & 0x2) == 2) {
						local217++;
					}
					@Pc(245) int local245 = local183 - Static162.anIntArrayArrayArray7[local217][local207][local213];
					if (local245 > local185) {
						local185 = local245;
					}
				}
			}
		}
		local207 = local185 * 192;
		if (local207 > 98048) {
			local207 = 98048;
		}
		if (local207 < 32768) {
			local207 = 32768;
		}
		if (local207 > Static8.anInt2210) {
			Static8.anInt2210 += (local207 - Static8.anInt2210) / 24;
		} else if (Static8.anInt2210 > local207) {
			Static8.anInt2210 += (local207 - Static8.anInt2210) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)Z")
	public static boolean method2336(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)Lclient!vg;")
	public static Class85 method2337(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static149.aClass85ArrayArray1[local12] == null || Static149.aClass85ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static163.method531(local12);
			if (!local30) {
				return null;
			}
		}
		return Static149.aClass85ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ed;)V")
	public static void method2338(@OriginalArg(0) Class22 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1000; local2 <= arg0.anInt983; local2++) {
			for (@Pc(6) int local6 = arg0.anInt988; local6 <= arg0.anInt999; local6++) {
				@Pc(16) Class2_Sub1 local16 = Static72.aClass2_Sub1ArrayArrayArray1[arg0.anInt994][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt15; local20++) {
						if (local16.aClass22Array1[local20] == arg0) {
							local16.anInt15--;
							for (local35 = local20; local35 < local16.anInt15; local35++) {
								local16.aClass22Array1[local35] = local16.aClass22Array1[local35 + 1];
								local16.anIntArray2[local35] = local16.anIntArray2[local35 + 1];
							}
							local16.aClass22Array1[local16.anInt15] = null;
							break;
						}
					}
					local16.anInt20 = 0;
					for (local35 = 0; local35 < local16.anInt15; local35++) {
						local16.anInt20 |= local16.anIntArray2[local35];
					}
				}
			}
		}
	}
}
