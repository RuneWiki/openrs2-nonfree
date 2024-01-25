import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!su", name = "J", descriptor = "I")
	public static int anInt9472 = -1;

	@OriginalMember(owner = "client!su", name = "N", descriptor = "I")
	public static int anInt9476 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "([ILclient!av;[I[II)V")
	public static void method7831(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class12_Sub2_Sub2_Sub1_Sub1 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) int local9 = arg0[local3];
			@Pc(13) int local13 = arg2[local3];
			@Pc(17) int local17 = arg3[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && local19 < arg1.aClass351Array3.length) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg1.aClass351Array3[local19] = null;
					} else {
						@Pc(44) Class275 local44 = Static501.aClass191_2.method4322(local9);
						@Pc(47) int local47 = local44.anInt7920;
						@Pc(52) Class351 local52 = arg1.aClass351Array3[local19];
						if (local52 != null) {
							if (local9 == local52.anInt10181) {
								if (local47 == 0) {
									local52 = arg1.aClass351Array3[local19] = null;
								} else if (local47 == 1) {
									local52.anInt10180 = 0;
									local52.anInt10182 = 1;
									local52.anInt10178 = 0;
									local52.anInt10179 = local17;
									local52.anInt10177 = 0;
									if (!arg1.aBoolean221) {
										Static51.method1064(arg1, local44, 0);
									}
								} else if (local47 == 2) {
									local52.anInt10177 = 0;
								}
							} else if (local44.anInt7930 >= Static501.aClass191_2.method4322(local52.anInt10181).anInt7930) {
								local52 = arg1.aClass351Array3[local19] = null;
							}
						}
						if (local52 == null) {
							local52 = arg1.aClass351Array3[local19] = new Class351();
							local52.anInt10182 = 1;
							local52.anInt10177 = 0;
							local52.anInt10181 = local9;
							local52.anInt10178 = 0;
							local52.anInt10180 = 0;
							local52.anInt10179 = local17;
							if (!arg1.aBoolean221) {
								Static51.method1064(arg1, local44, 0);
							}
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IILclient!kv;ILclient!ha;I)V")
	public static void method7832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(4) Class137 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class221 local9 = Static313.aClass83_6.method2081(arg2.anInt6019);
		if (local9.anInt6395 == -1) {
			return;
		}
		if (arg2.aBoolean426) {
			@Pc(27) int local27 = arg4 + arg2.anInt6038;
			arg4 = local27 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(43) Class20 local43 = local9.method5293(arg2.aBoolean411, arg4, arg3);
		if (local43 == null) {
			return;
		}
		@Pc(49) int local49 = arg2.anInt6065;
		@Pc(52) int local52 = arg2.anInt6028;
		if ((arg4 & 0x1) == 1) {
			local52 = arg2.anInt6065;
			local49 = arg2.anInt6028;
		}
		@Pc(68) int local68 = local43.method7394();
		@Pc(71) int local71 = local43.method7408();
		if (local9.aBoolean437) {
			local68 = local49 * 4;
			local71 = local52 * 4;
		}
		if (local9.anInt6394 == 0) {
			local43.method7405(arg0, arg1 + 4 - local52 * 4, local68, local71);
		} else {
			local43.method7398(arg0, arg1 - (local52 - 1) * 4, local68, local71, 0, local9.anInt6394 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!br;I)Z")
	public static boolean method7833(@OriginalArg(0) Class42 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean105) {
			return false;
		} else if (!arg0.method1109(Static498.anInterface20_2)) {
			return false;
		} else if (Static38.aClass187_7.method4078((long) arg0.anInt1278) == null) {
			return Static7.aClass187_1.method4078((long) arg0.anInt1303) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(II)V")
	public static void method7834(@OriginalArg(0) int arg0) {
		Static616.aLong276 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(III)I")
	public static int method7835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(30) int local30 = (local7 * (arg0 & 0xFF00) & 0xFF0000 | local7 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return ((local12 * (arg1 & 0xFF00) & 0xFF0000 | local12 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local30;
	}
}
