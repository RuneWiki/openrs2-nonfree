import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1323 = Static63.method1251("null");

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
	public static int anInt3035 = 127;

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1324 = Static63.method1251("Lade Texturen )2 ");

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1325 = Static63.method1251("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1327 = Static63.method1251("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)I")
	public static int method2100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 > 127) {
				arg0 = 127;
			}
			return 127 - arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V")
	public static void method2101() {
		aClass45_1324 = null;
		aClass45_1323 = null;
		aClass45_1325 = null;
		aClass45_1327 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg5 < 1 || arg1 > 102 || arg5 > 102) {
			return;
		}
		if (Static103.aBoolean122 && arg4 != Static8.anInt262) {
			return;
		}
		@Pc(40) int local40 = 0;
		if (arg6 == 0) {
			local40 = Static110.aClass34_1.method916(arg4, arg1, arg5);
		}
		if (arg6 == 1) {
			local40 = Static110.aClass34_1.method918(arg4, arg1, arg5);
		}
		if (arg6 == 2) {
			local40 = Static110.aClass34_1.method909(arg4, arg1, arg5);
		}
		if (arg6 == 3) {
			local40 = Static110.aClass34_1.method888(arg4, arg1, arg5);
		}
		@Pc(99) int local99;
		if (local40 != 0) {
			local99 = Static110.aClass34_1.method928(arg4, arg1, arg5, local40);
			@Pc(105) int local105 = local99 >> 6 & 0x3;
			@Pc(111) int local111 = local40 >> 14 & 0x7FFF;
			@Pc(115) int local115 = local99 & 0x1F;
			@Pc(126) Class5_Sub2_Sub7 local126;
			if (arg6 == 0) {
				Static110.aClass34_1.method891(arg4, arg1, arg5);
				local126 = Static62.method1232(local111);
				if (local126.aBoolean43) {
					Static51.aClass37Array1[arg4].method1112(arg1, arg5, local105, local115, local126.aBoolean35);
				}
			}
			if (arg6 == 1) {
				Static110.aClass34_1.method900(arg4, arg1, arg5);
			}
			if (arg6 == 2) {
				Static110.aClass34_1.method901(arg4, arg1, arg5);
				local126 = Static62.method1232(local111);
				if (arg1 + local126.anInt839 > 103 || local126.anInt839 + arg5 > 103 || local126.anInt829 + arg1 > 103 || local126.anInt829 + arg5 > 103) {
					return;
				}
				if (local126.aBoolean43) {
					Static51.aClass37Array1[arg4].method1121(local105, local126.aBoolean35, arg1, local126.anInt829, arg5, local126.anInt839);
				}
			}
			if (arg6 == 3) {
				Static110.aClass34_1.method880(arg4, arg1, arg5);
				local126 = Static62.method1232(local111);
				if (local126.aBoolean43 && local126.anInt828 == 1) {
					Static51.aClass37Array1[arg4].method1120(arg1, arg5);
				}
			}
		}
		if (arg0 < 0) {
			return;
		}
		local99 = arg4;
		if (arg4 < 3 && (Static48.aByteArrayArrayArray3[1][arg1][arg5] & 0x2) == 2) {
			local99 = arg4 + 1;
		}
		Static78.method1487(arg0, local99, Static51.aClass37Array1[arg4], arg4, arg2, arg1, arg3, Static110.aClass34_1, arg5);
		return;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)I")
	public static int method2103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return arg0 / 2 + (arg2 / 4 << 10) + (arg1 / 32 << -1986147609);
	}
}
