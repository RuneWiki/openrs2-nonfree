import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString74 = null;

	@OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
	public static int anInt1969 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIZ)V")
	public static void method2148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(12, arg0);
		local8.method2648();
		local8.anInt2511 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)V")
	public static void method2151(@OriginalArg(0) int arg0) {
		Static297.anInt5578 = 100;
		Static151.anInt2868 = arg0;
		Static204.anInt3768 = -1;
		Static41.anInt6388 = 3;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[BII)Z")
	public static boolean method2152(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) boolean local14 = true;
		@Pc(19) Class6_Sub10 local19 = new Class6_Sub10(arg0);
		@Pc(21) int local21 = -1;
		label56: while (true) {
			@Pc(27) int local27 = local19.method4010();
			if (local27 == 0) {
				return local14;
			}
			local21 += local27;
			@Pc(35) int local35 = 0;
			@Pc(37) boolean local37 = false;
			while (true) {
				@Pc(43) int local43;
				while (!local37) {
					local43 = local19.method4017();
					if (local43 == 0) {
						continue label56;
					}
					local35 += local43 - 1;
					@Pc(73) int local73 = local35 & 0x3F;
					@Pc(79) int local79 = local35 >> 6 & 0x3F;
					@Pc(85) int local85 = local19.method3972() >> 2;
					@Pc(89) int local89 = arg2 + local79;
					@Pc(93) int local93 = arg1 + local73;
					if (local89 > 0 && local93 > 0 && Static153.anInt2883 - 1 > local89 && Static246.anInt4606 - 1 > local93) {
						@Pc(120) Class66 local120 = Static196.method3622(local21);
						if (local85 != 22 || Static293.aBoolean382 || local120.anInt1476 != 0 || local120.anInt1486 == 1 || local120.aBoolean110) {
							if (!local120.method1364()) {
								local14 = false;
								Static15.anInt290++;
							}
							local37 = true;
						}
					}
				}
				local43 = local19.method4017();
				if (local43 == 0) {
					break;
				}
				local19.method3972();
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V")
	public static void method2153() {
		if (Static181.anInt3370 == 5) {
			Static181.anInt3370 = 6;
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)I")
	public static int method2155(@OriginalArg(0) int arg0) {
		if (Static216.aClass11_5 != null) {
			Static216.aClass11_5.method159();
			Static216.aClass11_5 = null;
		}
		Static301.anInt5708++;
		if (Static301.anInt5708 > 4) {
			Static301.anInt5708 = 0;
			Static250.anInt486 = 0;
			return arg0;
		}
		if (Static137.anInt2483 == Static240.anInt4008) {
			Static137.anInt2483 = Static203.anInt3732;
		} else {
			Static137.anInt2483 = Static240.anInt4008;
		}
		Static250.anInt486 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIII)V")
	public static void method2159(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = arg4; local3 < arg4 + arg1; local3++) {
			for (local12 = arg0; local12 < arg3 + arg0; local12++) {
				if (local12 >= 0 && Static153.anInt2883 > local12 && local3 >= 0 && Static246.anInt4606 > local3) {
					Static5.anIntArrayArrayArray1[arg2][local12][local3] = arg2 > 0 ? Static5.anIntArrayArrayArray1[arg2 - 1][local12][local3] - 240 : 0;
				}
			}
		}
		if (arg0 > 0 && Static153.anInt2883 > arg0) {
			for (local12 = arg4 + 1; local12 < arg1 + arg4; local12++) {
				if (local12 >= 0 && local12 < Static246.anInt4606) {
					Static5.anIntArrayArrayArray1[arg2][arg0][local12] = Static5.anIntArrayArrayArray1[arg2][arg0 - 1][local12];
				}
			}
		}
		if (arg4 > 0 && Static246.anInt4606 > arg4) {
			for (local12 = arg0 + 1; local12 < arg0 + arg3; local12++) {
				if (local12 >= 0 && Static153.anInt2883 > local12) {
					Static5.anIntArrayArrayArray1[arg2][local12][arg4] = Static5.anIntArrayArrayArray1[arg2][local12][arg4 - 1];
				}
			}
		}
		if (arg0 < 0 || arg4 < 0 || arg0 >= Static153.anInt2883 || arg4 >= Static246.anInt4606) {
			return;
		}
		if (arg2 != 0) {
			if (arg0 > 0 && Static5.anIntArrayArrayArray1[arg2 - 1][arg0 - 1][arg4] != Static5.anIntArrayArrayArray1[arg2][arg0 - 1][arg4]) {
				Static5.anIntArrayArrayArray1[arg2][arg0][arg4] = Static5.anIntArrayArrayArray1[arg2][arg0 - 1][arg4];
				return;
			}
			if (arg4 > 0 && Static5.anIntArrayArrayArray1[arg2][arg0][arg4 - 1] != Static5.anIntArrayArrayArray1[arg2 - 1][arg0][arg4 - 1]) {
				Static5.anIntArrayArrayArray1[arg2][arg0][arg4] = Static5.anIntArrayArrayArray1[arg2][arg0][arg4 - 1];
				return;
			}
			if (arg0 > 0 && arg4 > 0 && Static5.anIntArrayArrayArray1[arg2][arg0 - 1][arg4 - 1] != Static5.anIntArrayArrayArray1[arg2 - 1][arg0 - 1][arg4 - 1]) {
				Static5.anIntArrayArrayArray1[arg2][arg0][arg4] = Static5.anIntArrayArrayArray1[arg2][arg0 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && Static5.anIntArrayArrayArray1[arg2][arg0 - 1][arg4] != 0) {
			Static5.anIntArrayArrayArray1[arg2][arg0][arg4] = Static5.anIntArrayArrayArray1[arg2][arg0 - 1][arg4];
			return;
		}
		if (arg4 > 0 && Static5.anIntArrayArrayArray1[arg2][arg0][arg4 - 1] != 0) {
			Static5.anIntArrayArrayArray1[arg2][arg0][arg4] = Static5.anIntArrayArrayArray1[arg2][arg0][arg4 - 1];
			return;
		}
		if (arg0 > 0 && arg4 > 0 && Static5.anIntArrayArrayArray1[arg2][arg0 - 1][arg4 - 1] != 0) {
			Static5.anIntArrayArrayArray1[arg2][arg0][arg4] = Static5.anIntArrayArrayArray1[arg2][arg0 - 1][arg4 - 1];
			return;
		}
	}
}
