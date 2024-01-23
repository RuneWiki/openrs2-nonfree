import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!md", name = "B", descriptor = "I")
	public static int anInt3314;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!md", name = "P", descriptor = "[[I")
	public static int[][] anIntArrayArray25 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
	public static void method2869() {
		if (Static168.aClass66_28 != null || (Static5.aClass66_1 != null || Static303.anInt5384 > 0)) {
			return;
		}
		@Pc(19) int local19 = Static83.anInt1652;
		@Pc(87) int local87;
		@Pc(93) int local93;
		if (!Static249.aBoolean307) {
			if (local19 == 1 && Static110.anInt2281 > 0) {
				@Pc(34) short local34 = Static17.aShortArray2[Static110.anInt2281 - 1];
				if (local34 == 26 || local34 == 12 || local34 == 38 || local34 == 23 || local34 == 47 || local34 == 35 || local34 == 34 || local34 == 31 || local34 == 51 || local34 == 16 || local34 == 50 || local34 == 1001) {
					local87 = Static85.anIntArray147[Static110.anInt2281 - 1];
					local93 = Static252.anIntArray400[Static110.anInt2281 - 1];
					@Pc(97) Class66 local97 = Static53.method968(local93);
					@Pc(100) Class1_Sub22 local100 = Static37.method679(local97);
					if (local100.method3063() || local100.method3061()) {
						Static258.anInt4702 = 0;
						Static55.aBoolean58 = false;
						if (Static168.aClass66_28 != null) {
							Static103.method1865(Static168.aClass66_28);
						}
						Static168.aClass66_28 = Static53.method968(local93);
						Static244.anInt4432 = Static238.anInt4321;
						Static33.anInt579 = local87;
						Static229.anInt4206 = Static282.anInt5092;
						Static103.method1865(Static168.aClass66_28);
						return;
					}
				}
			}
			if (local19 == 1 && (Static287.anInt5144 == 1 && Static110.anInt2281 > 2 || Static214.method3358(Static110.anInt2281 - 1))) {
				local19 = 2;
			}
			if (local19 == 2 && Static110.anInt2281 > 0 || Static304.anInt5397 == 1) {
				Static301.method4557();
			}
			if (local19 == 1 && Static110.anInt2281 > 0 || Static304.anInt5397 == 2) {
				Static258.method4086();
			}
			return;
		}
		@Pc(192) int local192;
		if (local19 != 1) {
			local192 = Static247.anInt4467;
			local87 = Static222.anInt4105;
			if (Static207.anInt3960 - 10 > local192 || Static207.anInt3960 + Static93.anInt1898 + 10 < local192 || local87 < Static36.anInt685 - 10 || Static36.anInt685 + Static83.anInt1650 + 10 < local87) {
				Static249.aBoolean307 = false;
				Static86.method1605(Static36.anInt685, Static207.anInt3960, Static93.anInt1898, Static83.anInt1650);
			}
		}
		if (local19 != 1) {
			return;
		}
		local192 = Static207.anInt3960;
		local87 = Static36.anInt685;
		local93 = Static93.anInt1898;
		@Pc(245) int local245 = Static238.anInt4321;
		@Pc(247) int local247 = Static282.anInt5092;
		@Pc(249) int local249 = -1;
		for (@Pc(251) int local251 = 0; local251 < Static110.anInt2281; local251++) {
			@Pc(273) int local273;
			if (Static41.aBoolean46) {
				local273 = (Static110.anInt2281 - local251 - 1) * 15 + local87 + 33;
				if (local192 < local245 && local93 + local192 > local245 && local273 - 13 < local247 && local247 < local273 + 3) {
					local249 = local251;
				}
			} else {
				local273 = (Static110.anInt2281 - local251 - 1) * 15 + local87 + 31;
				if (local245 > local192 && local93 + local192 > local245 && local247 > local273 - 13 && local273 + 3 > local247) {
					local249 = local251;
				}
			}
		}
		if (local249 != -1) {
			Static43.method805(local249);
		}
		Static249.aBoolean307 = false;
		Static86.method1605(Static36.anInt685, Static207.anInt3960, Static93.anInt1898, Static83.anInt1650);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method2871() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("maxMemory");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(27) Long local27 = (Long) local16.invoke(local20, (Object[]) null);
					Static207.anInt3958 = (int) (local27 / 1048576L) + 1;
				} catch (@Pc(37) Throwable local37) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}
}
