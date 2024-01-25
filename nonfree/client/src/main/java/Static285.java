import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public static int anInt5263;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([BIBIII)Z")
	public static boolean method4701(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) boolean local15 = true;
		@Pc(20) Class2_Sub24 local20 = new Class2_Sub24(arg0);
		@Pc(22) int local22 = -1;
		label54: while (true) {
			@Pc(26) int local26 = local20.method5752();
			if (local26 == 0) {
				return local15;
			}
			local22 += local26;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local20.method5722();
					if (local42 == 0) {
						continue label54;
					}
					local34 += local42 - 1;
					@Pc(69) int local69 = local34 & 0x3F;
					@Pc(75) int local75 = local34 >> 6 & 0x3F;
					@Pc(81) int local81 = local20.method5732() >> 2;
					@Pc(85) int local85 = arg3 + local75;
					@Pc(89) int local89 = arg4 + local69;
					if (local85 > 0 && local89 > 0 && arg1 - 1 > local85 && local89 < arg2 - 1) {
						@Pc(118) Class47 local118 = Static230.aClass96_4.method2303(local22);
						if (local81 != 22 || Static72.aBoolean125 || local118.anInt1274 != 0 || local118.anInt1263 == 1 || local118.aBoolean92) {
							local36 = true;
							if (!local118.method897()) {
								local15 = false;
								Static202.anInt4204++;
							}
						}
					}
				}
				local42 = local20.method5722();
				if (local42 == 0) {
					break;
				}
				local20.method5732();
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(BI)V")
	public static void method4704(@OriginalArg(1) int arg0) {
		Static327.method5269();
		@Pc(11) int local11 = Static179.aClass204_1.method5029(arg0).anInt2853;
		if (local11 == 0) {
			return;
		}
		@Pc(30) int local30 = Static179.aClass115_1.anIntArray257[arg0];
		if (local11 == 6) {
			Static35.anInt618 = local30;
		}
		if (local11 == 5) {
			Static251.anInt4857 = local30;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIIIII)V")
	public static void method4706(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(19) int local19 = arg3 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(55) int local55 = Static350.aShort92 + (Static75.aShort31 - Static350.aShort92) * local19 / 100;
		if (Static97.aShort32 > local55) {
			local55 = Static97.aShort32;
		} else if (Static39.aShort12 < local55) {
			local55 = Static39.aShort12;
		}
		@Pc(81) int local81 = arg3 * local55 * 512 / (arg2 * 334);
		@Pc(115) int local115;
		@Pc(121) int local121;
		@Pc(90) short local90;
		if (Static50.aShort25 > local81) {
			local90 = Static50.aShort25;
			local55 = arg2 * local90 * 334 / (arg3 * 512);
			if (Static39.aShort12 < local55) {
				local55 = Static39.aShort12;
				local115 = arg3 * local55 * 512 / (local90 * 334);
				local121 = (arg2 - local115) / 2;
				if (arg0) {
					Static383.aClass48_9.method2505();
					Static383.aClass48_9.method2509(arg3, local121, arg1, -16777216, arg4);
					Static383.aClass48_9.method2509(arg3, local121, arg1, -16777216, arg2 + arg4 - local121);
				}
				arg4 += local121;
				arg2 -= local121 * 2;
			}
		} else if (local81 > Static28.aShort5) {
			local90 = Static28.aShort5;
			local55 = arg2 * 334 * local90 / (arg3 * 512);
			if (Static97.aShort32 > local55) {
				local55 = Static97.aShort32;
				local115 = arg2 * local90 * 334 / (local55 * 512);
				local121 = (arg3 - local115) / 2;
				if (arg0) {
					Static383.aClass48_9.method2505();
					Static383.aClass48_9.method2509(local121, arg2, arg1, -16777216, arg4);
					Static383.aClass48_9.method2509(local121, arg2, arg3 + arg1 - local121, -16777216, arg4);
				}
				arg1 += local121;
				arg3 -= local121 * 2;
			}
		}
		Static340.anInt6282 = (short) arg3;
		Static74.anInt1640 = arg3 * local55 / 334;
		Static274.anInt5133 = arg4;
		Static246.anInt3042 = arg1;
		Static93.anInt1980 = (short) arg2;
	}
}
