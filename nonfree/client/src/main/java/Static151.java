import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!iq;")
	public static Class104 aClass104_90;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "[I")
	public static final int[] anIntArray270 = new int[2048];

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
	public static int anInt3469 = 0;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V")
	public static void method3017() {
		if (Static191.anInt4208 < 0) {
			return;
		}
		@Pc(9) long local9 = Static22.method285();
		Static191.anInt4208 = (int) ((long) Static191.anInt4208 + Static238.aLong155 - local9);
		if (Static191.anInt4208 > 0) {
			@Pc(29) int local29 = (Static191.anInt4208 << 8) / Static211.anInt6303;
			@Pc(34) int local34 = 255 - local29;
			@Pc(39) float local39 = (float) local29 / 255.0F;
			Static207.anInt4537 = ((Static36.aClass191_1.anInt6124 & 0xFF00) * local34 + (Static184.anInt4077 & 0xFF00) * local29 & 0xFF0000) + (local34 * (Static36.aClass191_1.anInt6124 & 0xFF00FF) + local29 * (Static184.anInt4077 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			@Pc(76) float local76 = 1.0F - local39;
			Static163.aFloat40 = Static233.aFloat51 + local76 * (Static36.aClass191_1.aFloat72 - Static233.aFloat51);
			Static346.anInt5919 = local29 * Static292.anInt5815 + local34 * Static36.aClass191_1.anInt6118 >> 8;
			Static111.aFloat36 = local76 * (Static36.aClass191_1.aFloat70 - Static161.aFloat39) + Static161.aFloat39;
			Static327.aFloat77 = Static73.aFloat30 + (Static36.aClass191_1.aFloat68 - Static73.aFloat30) * local76;
			Static164.aFloat41 = (Static36.aClass191_1.aFloat71 - Static86.aFloat31) * local76 + Static86.aFloat31;
			Static149.aFloat38 = (Static36.aClass191_1.aFloat69 - Static258.aFloat65) * local76 + Static258.aFloat65;
			Static341.anInt462 = (local29 * (Static125.anInt2666 & 0xFF00FF) + (Static36.aClass191_1.anInt6112 & 0xFF00FF) * local34 & 0xFF00FF00) + (local34 * (Static36.aClass191_1.anInt6112 & 0xFF00) + (Static125.anInt2666 & 0xFF00) * local29 & 0xFF0000) >>> 8;
			Static59.aFloat28 = Static189.aFloat43 + (Static36.aClass191_1.aFloat73 - Static189.aFloat43) * local76;
			if (Static319.aClass3_4 != Static36.aClass191_1.aClass3_3) {
				Static57.aClass3_1 = Static79.aClass37_2.method3702(Static319.aClass3_4, Static36.aClass191_1.aClass3_3, local76, Static57.aClass3_1);
			}
		} else {
			Static149.aFloat38 = Static36.aClass191_1.aFloat69;
			Static57.aClass3_1 = Static36.aClass191_1.aClass3_3;
			Static341.anInt462 = Static36.aClass191_1.anInt6112;
			Static327.aFloat77 = Static36.aClass191_1.aFloat68;
			Static207.anInt4537 = Static36.aClass191_1.anInt6124;
			Static163.aFloat40 = Static36.aClass191_1.aFloat72;
			Static191.anInt4208 = -1;
			Static59.aFloat28 = Static36.aClass191_1.aFloat73;
			Static346.anInt5919 = Static36.aClass191_1.anInt6118;
			Static164.aFloat41 = Static36.aClass191_1.aFloat71;
			Static111.aFloat36 = Static36.aClass191_1.aFloat70;
		}
		Static238.aLong155 = local9;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg8 && arg6 == arg2 && arg0 == arg7 && arg3 == arg1) {
			Static276.method4762(arg6, arg1, arg5, arg7, arg4);
			return;
		}
		@Pc(38) int local38 = arg5;
		@Pc(40) int local40 = arg6;
		@Pc(44) int local44 = arg5 * 3;
		@Pc(48) int local48 = arg6 * 3;
		@Pc(52) int local52 = arg8 * 3;
		@Pc(56) int local56 = arg2 * 3;
		@Pc(60) int local60 = arg0 * 3;
		@Pc(64) int local64 = arg3 * 3;
		@Pc(74) int local74 = local52 + arg7 - arg5 - local60;
		@Pc(84) int local84 = local56 + arg1 - local64 - arg6;
		@Pc(94) int local94 = local44 + local60 - local52 - local52;
		@Pc(104) int local104 = local64 + local48 - local56 - local56;
		@Pc(108) int local108 = local52 - local44;
		@Pc(113) int local113 = local56 - local48;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local123 * local115 >> 12;
			@Pc(133) int local133 = local129 * local74;
			@Pc(137) int local137 = local84 * local129;
			@Pc(141) int local141 = local123 * local94;
			@Pc(145) int local145 = local123 * local104;
			@Pc(149) int local149 = local115 * local108;
			@Pc(153) int local153 = local115 * local113;
			@Pc(163) int local163 = (local149 + local141 + local133 >> 12) + arg5;
			@Pc(173) int local173 = (local153 + local145 + local137 >> 12) + arg6;
			Static276.method4762(local40, local173, local38, local163, arg4);
			local40 = local173;
			local38 = local163;
		}
	}
}
