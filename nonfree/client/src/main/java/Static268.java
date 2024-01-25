import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "[[[Lclient!sd;")
	public static Class211[][][] aClass211ArrayArrayArray4;

	@OriginalMember(owner = "client!nl", name = "A", descriptor = "[Lclient!ss;")
	public static Class219[] aClass219Array2;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	public static void method4065() {
		Static355.method4895(Static442.aClass219_14);
		Static368.anInt6278++;
		if (Static168.aBoolean183 && Static400.aBoolean448) {
			@Pc(28) int local28 = Static16.aClass228_1.method5485();
			@Pc(32) int local32 = Static16.aClass228_1.method5486();
			local28 -= Static63.anInt1323;
			local32 -= Static285.anInt7840;
			if (Static365.anInt6210 > local28) {
				local28 = Static365.anInt6210;
			}
			if (local28 + Static442.aClass219_14.anInt6398 > Static365.anInt6210 - -Static207.aClass219_11.anInt6398) {
				local28 = Static365.anInt6210 + Static207.aClass219_11.anInt6398 - Static442.aClass219_14.anInt6398;
			}
			if (Static394.anInt6861 > local32) {
				local32 = Static394.anInt6861;
			}
			if (Static442.aClass219_14.anInt6363 + local32 > Static207.aClass219_11.anInt6363 + Static394.anInt6861) {
				local32 = Static394.anInt6861 + Static207.aClass219_11.anInt6363 - Static442.aClass219_14.anInt6363;
			}
			@Pc(112) int local112 = local28 + Static207.aClass219_11.anInt6368 - Static365.anInt6210;
			@Pc(121) int local121 = local32 + Static207.aClass219_11.anInt6371 - Static394.anInt6861;
			@Pc(179) Class1_Sub6 local179;
			if (Static16.aClass228_1.method5480()) {
				if (Static368.anInt6278 > Static442.aClass219_14.anInt6357) {
					@Pc(222) int local222 = local28 - Static317.anInt3564;
					@Pc(227) int local227 = local32 - Static25.anInt551;
					if (local222 > Static442.aClass219_14.lb || local222 < -Static442.aClass219_14.lb || Static442.aClass219_14.lb < local227 || -Static442.aClass219_14.lb > local227) {
						Static385.aBoolean439 = true;
					}
				}
				if (Static442.aClass219_14.anObjectArray33 != null && Static385.aBoolean439) {
					local179 = new Class1_Sub6();
					local179.anInt1462 = local121;
					local179.anInt1463 = local112;
					local179.aClass219_4 = Static442.aClass219_14;
					local179.anObjectArray3 = Static442.aClass219_14.anObjectArray33;
					Static104.method1608(local179);
				}
			} else {
				if (Static385.aBoolean439) {
					Static82.method1412();
					if (Static442.aClass219_14.anObjectArray22 != null) {
						local179 = new Class1_Sub6();
						local179.aClass219_4 = Static442.aClass219_14;
						local179.anInt1463 = local112;
						local179.aClass219_3 = Static295.aClass219_15;
						local179.anObjectArray3 = Static442.aClass219_14.anObjectArray22;
						local179.anInt1462 = local121;
						Static104.method1608(local179);
					}
					if (Static295.aClass219_15 != null && Static53.method922(Static442.aClass219_14) != null) {
						Static331.method4642(Static295.aClass219_15, Static442.aClass219_14);
					}
				} else if ((Static42.anInt758 == 1 || Static294.method4794()) && Static82.anInt1627 > 2) {
					Static100.method1553(Static285.anInt7840 + Static25.anInt551, Static317.anInt3564 + Static63.anInt1323);
				} else if (Static269.method3929()) {
					Static100.method1553(Static285.anInt7840 + Static25.anInt551, Static63.anInt1323 + Static317.anInt3564);
				}
				Static442.aClass219_14 = null;
			}
		} else if (Static368.anInt6278 > 1) {
			Static442.aClass219_14 = null;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method4067(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static183.aBoolean197) {
			try {
				@Pc(30) Class6 local30 = (Class6) Class.forName("Class6_Sub1").getDeclaredConstructor().newInstance();
				local30.method208(arg0);
				return local30;
			} catch (@Pc(37) Throwable local37) {
				Static183.aBoolean197 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BIIIII)V")
	public static void method4068(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg2; local12++) {
			Static217.method3280(Static59.anIntArrayArray34[local12], arg4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
	public static boolean method4069(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIZIII)V")
	public static void method4071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static139.anInt2356 = arg1;
		Static265.anInt4783 = arg5;
		Static113.anInt5757 = arg3;
		Static208.anInt3851 = arg0;
		Static91.anInt1741 = arg4;
		if (arg2 && Static208.anInt3851 >= 100) {
			Static306.anInt5497 = Static91.anInt1741 * 128 + 64;
			Static402.anInt6941 = Static139.anInt2356 * 128 + 64;
			Static254.anInt4567 = Static289.method4078(Static306.anInt5497, Static402.anInt6941, Static152.anInt2600) - Static113.anInt5757;
		}
		Static310.anInt5540 = 2;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)Z")
	public static boolean method4072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
