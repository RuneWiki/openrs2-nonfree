import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!lo;")
	public static Class139 aClass139_4;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Lclient!la;")
	public static Class136 aClass136_201;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)I")
	public static int method6151() {
		return 2;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII[BI)Z")
	public static boolean method6152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class3_Sub25 local17 = new Class3_Sub25(arg3);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method4072();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(101) Class31 local101;
				do {
					@Pc(68) int local68;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method4086();
										if (local39 == 0) {
											continue label70;
										}
										local17.method4096();
									}
									local39 = local17.method4086();
									if (local39 == 0) {
										continue label70;
									}
									local31 += local39 - 1;
									@Pc(51) int local51 = local31 & 0x3F;
									@Pc(57) int local57 = local31 >> 6 & 0x3F;
									local63 = local17.method4096() >> 2;
									local68 = local57 + arg2;
									local72 = local51 + arg0;
								} while (local68 <= 0);
							} while (local72 <= 0);
						} while (arg4 - 1 <= local68);
					} while (arg1 - 1 <= local72);
					local101 = Static9.aClass149_1.method3573(local19);
				} while (local63 == 22 && !Static39.aClass79_Sub1_1.aBoolean152 && local101.anInt788 == 0 && local101.anInt776 != 1 && !local101.aBoolean43);
				if (!local101.method867()) {
					Static430.anInt7238++;
					local7 = false;
				}
				local33 = true;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(FFBF)I")
	public static int method6155(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local21 > local12 && local21 > local35) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local12 < local35 && local21 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	public static void method6156() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local16.invoke(local24, (Object[]) null);
					Static358.anInt6108 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIIIII)V")
	public static void method6157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(14) int local14 = arg3 - arg2;
		if (local10 == 0) {
			if (local14 != 0) {
				Static163.method5709(arg4, arg2, arg1, arg3);
			}
		} else if (local14 == 0) {
			Static458.method6236(arg2, arg1, arg4, arg0);
		} else {
			@Pc(55) int local55 = (local14 << 12) / local10;
			@Pc(64) int local64 = arg2 - (arg1 * local55 >> 12);
			@Pc(84) int local84;
			@Pc(82) int local82;
			if (arg0 < Static399.anInt2866) {
				local84 = Static399.anInt2866;
				local82 = (Static399.anInt2866 * local55 >> 12) + local64;
			} else if (arg0 > Static372.anInt6316) {
				local82 = local64 + (local55 * Static372.anInt6316 >> 12);
				local84 = Static372.anInt6316;
			} else {
				local82 = arg3;
				local84 = arg0;
			}
			@Pc(120) int local120;
			@Pc(118) int local118;
			if (arg1 < Static399.anInt2866) {
				local118 = local64 + (local55 * Static399.anInt2866 >> 12);
				local120 = Static399.anInt2866;
			} else if (arg1 > Static372.anInt6316) {
				local120 = Static372.anInt6316;
				local118 = local64 + (Static372.anInt6316 * local55 >> 12);
			} else {
				local120 = arg1;
				local118 = arg2;
			}
			if (local118 < Static316.anInt5349) {
				local118 = Static316.anInt5349;
				local120 = (Static316.anInt5349 - local64 << 12) / local55;
			} else if (local118 > Static418.anInt7030) {
				local118 = Static418.anInt7030;
				local120 = (Static418.anInt7030 - local64 << 12) / local55;
			}
			if (Static316.anInt5349 > local82) {
				local82 = Static316.anInt5349;
				local84 = (Static316.anInt5349 - local64 << 12) / local55;
			} else if (Static418.anInt7030 < local82) {
				local84 = (Static418.anInt7030 - local64 << 12) / local55;
				local82 = Static418.anInt7030;
			}
			Static460.method6240(arg4, local118, local84, local120, local82);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	public static void method6158(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub3_Sub4 local14 = Static281.method3883(3, arg0);
		local14.method1006();
	}
}
