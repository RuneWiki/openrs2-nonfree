import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_113 = new Class253(9, 5);

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_78 = new Class2(24, 16);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
	public static boolean method4007(@OriginalArg(0) int arg0) {
		if (arg0 == 3 || arg0 == 45 || arg0 == 21 || arg0 == 57 || arg0 == 9) {
			return true;
		} else {
			return arg0 == 49 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Z")
	public static boolean method4008(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4009(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local10++;
			} else if (local23 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method4011() {
		Static102.anInt2085 = 0;
		Static237.aClass85_26.method2008();
		Static331.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBIIILclient!ya;)V")
	public static void method4012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class51 arg4) {
		arg4.OA(arg1, arg0, arg1 + arg3, arg2 + arg0);
		arg4.method5286(arg3, -16777216, arg1, arg2, arg0);
		if (Static24.anInt346 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static93.anInt4330 / (float) Static93.anInt4332;
		@Pc(36) int local36 = arg3;
		@Pc(38) int local38 = arg2;
		if (local34 < 1.0F) {
			local38 = (int) ((float) arg3 * local34);
		} else {
			local36 = (int) ((float) arg2 / local34);
		}
		@Pc(69) int local69 = arg0 + (arg2 - local38) / 2;
		@Pc(78) int local78 = arg1 + (arg3 - local36) / 2;
		if (Static54.aClass11_3 == null || arg3 != Static54.aClass11_3.la() || Static54.aClass11_3.ma() != arg2) {
			Static93.method3417(Static93.anInt4322, Static93.anInt4330 + Static93.anInt4323, Static93.anInt4322 + Static93.anInt4332, Static93.anInt4323, local78, local69, local78 + local36, local38 + local69);
			Static93.method3410(arg4);
			Static54.aClass11_3 = arg4.method5349(local78, local69, local36, local38, false);
		}
		Static54.aClass11_3.method4394(local78, local69);
		@Pc(129) int local129 = local36 * Static56.anInt942 / Static93.anInt4332;
		@Pc(135) int local135 = Static153.anInt5628 * local38 / Static93.anInt4330;
		@Pc(143) int local143 = local36 * Static5.anInt22 / Static93.anInt4332 + local78;
		@Pc(156) int local156 = local38 + local69 - local38 * Static246.anInt4200 / Static93.anInt4330 - local135;
		@Pc(158) int local158 = -1996554240;
		if (Static191.aClass137_3 == Static55.aClass137_1) {
			local158 = -1996488705;
		}
		arg4.O(local143, local156, local129, local135, local158, 1);
		arg4.method5287(local143, local156, local129, local135, local158, 0);
		if (Static339.anInt5508 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static129.anInt2479 <= 50) {
			local193 = Static129.anInt2479 * 5;
		} else {
			local193 = 500 - Static129.anInt2479 * 5;
		}
		for (@Pc(207) Class7_Sub11 local207 = (Class7_Sub11) Static93.aClass85_28.method2010(); local207 != null; local207 = (Class7_Sub11) Static93.aClass85_28.method2000()) {
			@Pc(215) Class20 local215 = Static93.aClass62_4.method1481(local207.anInt1062);
			if (Static273.method3652(local215)) {
				@Pc(245) int local245;
				@Pc(257) int local257;
				if (Static237.anInt4069 == local207.anInt1062) {
					local245 = local36 * local207.anInt1059 / Static93.anInt4332 + local78;
					local257 = local69 + (Static93.anInt4330 - local207.anInt1058) * local38 / Static93.anInt4330;
					arg4.method5286(4, local193 << 24 | 0xFFFF00, local245 - 2, 4, local257 - 2);
				} else if (Static54.anInt935 != -1 && local215.anInt314 == Static54.anInt935) {
					local245 = local78 + local207.anInt1059 * local36 / Static93.anInt4332;
					local257 = local38 * (Static93.anInt4330 - local207.anInt1058) / Static93.anInt4330 + local69;
					arg4.method5286(4, local193 << 24 | 0xFFFF00, local245 - 2, 4, local257 - 2);
				}
			}
		}
	}
}
