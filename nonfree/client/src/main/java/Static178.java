import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	public static int anInt3317;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
	public static int anInt3321 = -1;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2684(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < Static147.anInt2712; local17++) {
			if (arg0.equalsIgnoreCase(Static147.aStringArray12[local17])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static28.aClass6_Sub6_Sub2_1.aString147)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public static void method2685() {
		if (Static282.aBoolean447) {
			return;
		}
		if (Static290.aBoolean436) {
			Static177.aFloat97 = (int) Static177.aFloat97 - 65 & 0xFFFFFF80;
		} else {
			Static149.aFloat80 += (-Static149.aFloat80 - 24.0F) / 2.0F;
		}
		Static45.aBoolean87 = true;
		Static282.aBoolean447 = true;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public static void method2686() {
		for (@Pc(11) Class1_Sub24 local11 = (Class1_Sub24) Static16.aClass69_2.method1636(); local11 != null; local11 = (Class1_Sub24) Static16.aClass69_2.method1631()) {
			if (local11.anInt4114 > 0) {
				local11.anInt4114--;
			}
			if (local11.anInt4114 != 0) {
				if (local11.anInt4102 > 0) {
					local11.anInt4102--;
				}
				if (local11.anInt4102 == 0 && local11.anInt4112 >= 1 && local11.anInt4100 >= 1 && local11.anInt4112 <= 102 && local11.anInt4100 <= 102 && (local11.anInt4107 < 0 || Static48.method845(local11.anInt4107, local11.anInt4108))) {
					Static249.method3881(local11.anInt4100, local11.anInt4107, local11.anInt4104, local11.anInt4110, local11.anInt4112, local11.anInt4108, local11.anInt4099);
					local11.anInt4102 = -1;
					if (local11.anInt4105 == local11.anInt4107 && local11.anInt4105 == -1) {
						local11.method4534();
					} else if (local11.anInt4107 == local11.anInt4105 && local11.anInt4111 == local11.anInt4099 && local11.anInt4116 == local11.anInt4108) {
						local11.method4534();
					}
				}
			} else if (local11.anInt4105 < 0 || Static48.method845(local11.anInt4105, local11.anInt4116)) {
				Static249.method3881(local11.anInt4100, local11.anInt4105, local11.anInt4104, local11.anInt4110, local11.anInt4112, local11.anInt4116, local11.anInt4111);
				local11.method4534();
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method2687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg2 < 0 || arg0 >= 103 || arg2 >= 103) {
			return;
		}
		@Pc(31) int local31;
		if (arg6 == 0) {
			@Pc(21) Class125 local21 = Static84.method1403(arg5, arg0, arg2);
			if (local21 != null) {
				local31 = (int) (local21.aLong118 >>> 32) & Integer.MAX_VALUE;
				if (arg1 == 2) {
					local21.aClass6_8 = new Class6_Sub5(local31, 2, arg4 + 4, arg5, arg0, arg2, arg3, false, local21.aClass6_8);
					local21.aClass6_7 = new Class6_Sub5(local31, 2, arg4 + 1 & 0x3, arg5, arg0, arg2, arg3, false, local21.aClass6_7);
				} else {
					local21.aClass6_8 = new Class6_Sub5(local31, arg1, arg4, arg5, arg0, arg2, arg3, false, local21.aClass6_8);
				}
			}
		}
		if (arg6 == 1) {
			@Pc(97) Class63 local97 = Static120.method1888(arg5, arg0, arg2);
			if (local97 != null) {
				local31 = Integer.MAX_VALUE & (int) (local97.aLong55 >>> 32);
				if (arg1 == 4 || arg1 == 5) {
					local97.aClass6_4 = new Class6_Sub5(local31, 4, arg4, arg5, arg0, arg2, arg3, false, local97.aClass6_4);
				} else if (arg1 == 6) {
					local97.aClass6_4 = new Class6_Sub5(local31, 4, arg4 + 4, arg5, arg0, arg2, arg3, false, local97.aClass6_4);
				} else if (arg1 == 7) {
					local97.aClass6_4 = new Class6_Sub5(local31, 4, (arg4 + 2 & 0x3) + 4, arg5, arg0, arg2, arg3, false, local97.aClass6_4);
				} else if (arg1 == 8) {
					local97.aClass6_4 = new Class6_Sub5(local31, 4, arg4 + 4, arg5, arg0, arg2, arg3, false, local97.aClass6_4);
					local97.aClass6_5 = new Class6_Sub5(local31, 4, (arg4 + 2 & 0x3) + 4, arg5, arg0, arg2, arg3, false, local97.aClass6_5);
				}
			}
		}
		if (arg6 == 2) {
			if (arg1 == 11) {
				arg1 = 10;
			}
			@Pc(243) Class124 local243 = Static147.method2286(arg5, arg0, arg2);
			if (local243 != null) {
				local243.aClass6_6 = new Class6_Sub5(Integer.MAX_VALUE & (int) (local243.aLong114 >>> 32), arg1, arg4, arg5, arg0, arg2, arg3, false, local243.aClass6_6);
			}
		}
		if (arg6 == 3) {
			@Pc(277) Class167 local277 = Static146.method2285(arg5, arg0, arg2);
			if (local277 != null) {
				local277.aClass6_9 = new Class6_Sub5(Integer.MAX_VALUE & (int) (local277.aLong178 >>> 32), 22, arg4, arg5, arg0, arg2, arg3, false, local277.aClass6_9);
			}
		}
	}
}
