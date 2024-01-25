import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!vj", name = "E", descriptor = "Z")
	public static boolean aBoolean375;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_90 = new Class287(2, -1);

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
	public static int anInt5470 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Z")
	public static boolean method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)Z")
	public static boolean method4397() {
		if (Static458.aBoolean553) {
			try {
				if ((Boolean) Static600.method2906("showingVideoAd", Static304.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(25) Throwable local25) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
	public static void method4398() {
		if (Static79.anInt2118 == -1) {
			return;
		}
		@Pc(12) int local12 = Static234.aClass54_4.method7306();
		@Pc(18) int local18 = Static234.aClass54_4.method7315();
		@Pc(23) Class3_Sub27 local23 = (Class3_Sub27) Static114.aClass244_23.method5572();
		if (local23 != null) {
			local12 = local23.method5338();
			local18 = local23.method5337();
		}
		Static460.method6318(local12, 0, Static492.anInt8445, Static34.anInt3201, 0, 0, Static79.anInt2118, 0, local18);
		if (Static389.aClass251_13 != null) {
			Static192.method3364(local12, local18);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!r;IIII)V")
	public static void method4399(@OriginalArg(1) Class31 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.da(arg2, arg4, arg3 + arg2, arg4 - -arg1);
		arg0.method8094(arg4, arg2, arg1, arg3, -16777216);
		if (Static111.anInt2675 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static157.anInt2663 / (float) Static157.anInt2673;
		@Pc(36) int local36 = arg3;
		@Pc(38) int local38 = arg1;
		if (local34 < 1.0F) {
			local38 = (int) (local34 * (float) arg3);
		} else {
			local36 = (int) ((float) arg1 / local34);
		}
		@Pc(64) int local64 = arg2 + (arg3 - local36) / 2;
		@Pc(79) int local79 = arg4 + (arg1 - local38) / 2;
		if (Static153.aClass73_12 == null || Static153.aClass73_12.E() != arg3 || arg1 != Static153.aClass73_12.u()) {
			Static157.method2235(Static157.anInt2670, Static157.anInt2671 + Static157.anInt2663, Static157.anInt2673 + Static157.anInt2670, Static157.anInt2671, local64, local79, local64 + local36, local38 + local79);
			Static157.method2251(arg0);
			Static153.aClass73_12 = arg0.method8091(local64, local79, local36, local38, false);
		}
		Static153.aClass73_12.method7957(local64, local79);
		@Pc(135) int local135 = local36 * Static454.anInt7940 / Static157.anInt2673;
		@Pc(141) int local141 = local38 * Static228.anInt4656 / Static157.anInt2663;
		@Pc(149) int local149 = local64 + local36 * Static585.anInt10112 / Static157.anInt2673;
		@Pc(163) int local163 = local79 + local38 - local141 - local38 * Static454.anInt7931 / Static157.anInt2663;
		@Pc(165) int local165 = -1996554240;
		if (Static31.aClass89_1 == Static40.aClass89_2) {
			local165 = -1996488705;
		}
		arg0.J(local149, local163, local135, local141, local165, 1);
		arg0.method8035(local149, local163, local135, local141, local165, 0);
		if (Static438.anInt4270 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (Static21.anInt211 > 50) {
			local198 = 500 - Static21.anInt211 * 5;
		} else {
			local198 = Static21.anInt211 * 5;
		}
		for (@Pc(209) Class3_Sub33 local209 = (Class3_Sub33) Static157.aClass244_22.method5572(); local209 != null; local209 = (Class3_Sub33) Static157.aClass244_22.method5576()) {
			@Pc(217) Class338 local217 = Static157.aClass189_2.method4642(local209.anInt5496);
			if (Static331.method4879(local217)) {
				@Pc(234) int local234;
				@Pc(246) int local246;
				if (local209.anInt5496 == Static158.anInt3573) {
					local234 = local64 + local36 * local209.anInt5494 / Static157.anInt2673;
					local246 = local79 + (Static157.anInt2663 - local209.anInt5495) * local38 / Static157.anInt2663;
					arg0.method8094(local246 - 2, local234 + -2, 4, 4, local198 << 24 | 0xFFFF00);
				} else if (Static372.anInt6490 != -1 && local217.anInt9749 == Static372.anInt6490) {
					local234 = local36 * local209.anInt5494 / Static157.anInt2673 + local64;
					local246 = (Static157.anInt2663 - local209.anInt5495) * local38 / Static157.anInt2663 + local79;
					arg0.method8094(local246 - 2, local234 - 2, 4, 4, local198 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([Lclient!pn;II)V")
	public static void method4400(@OriginalArg(0) Class25_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class25_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8478;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8478 > local27 + (local29 & 0x1)) {
				@Pc(44) Class25_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4400(arg0, arg1, local10 - 1);
		method4400(arg0, local10 + 1, arg2);
	}
}
