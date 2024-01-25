import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array2;

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "Lclient!vh;")
	public static Class250 aClass250_16;

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "Lclient!qo;")
	public static final Class190 aClass190_4 = new Class190("", 13);

	@OriginalMember(owner = "client!dp", name = "x", descriptor = "Lclient!qo;")
	public static final Class190 aClass190_5 = new Class190("", 16);

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I[Lclient!f;)V")
	public static void method1281(@OriginalArg(1) Class80[] arg0) {
		Static130.anInt2269 = arg0.length;
		Static364.aClass80Array17 = new Class80[Static130.anInt2269 + 10];
		Static63.anIntArray87 = new int[Static130.anInt2269 + 10];
		Static460.method4214(arg0, 0, Static364.aClass80Array17, 0, Static130.anInt2269);
		for (@Pc(26) int local26 = 0; local26 < Static130.anInt2269; local26++) {
			Static63.anIntArray87[local26] = Static364.aClass80Array17[local26].JA();
		}
		for (@Pc(47) int local47 = Static130.anInt2269; local47 < Static364.aClass80Array17.length; local47++) {
			Static63.anIntArray87[local47] = 12;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!ki;Lclient!ki;I)V")
	public static void method1282(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_262 != null) {
			arg1.method6071();
		}
		arg1.aClass1_262 = arg0.aClass1_262;
		arg1.aClass1_261 = arg0;
		arg1.aClass1_262.aClass1_261 = arg1;
		arg1.aClass1_261.aClass1_262 = arg1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIII)V")
	public static void method1283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg0 * Static389.aClass128_Sub1_1.anInt3559 >> 8;
		if (local6 != 0 && arg2 != -1) {
			Static82.method1407(client.lb, arg2, local6);
			Static94.aBoolean98 = true;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)I")
	public static int method1285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static403.aByteArrayArray135 == null ? 0 : Static403.aByteArrayArray135[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!qa;IIBI)V")
	public static void method1287(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg1.pa(arg4, arg3, arg2 + arg4, arg0 + arg3);
		arg1.method4743(arg4, -16777216, arg3, arg0, arg2);
		if (Static411.anInt7188 < 100) {
			return;
		}
		@Pc(39) float local39 = (float) Static7.anInt2570 / (float) Static7.anInt2568;
		@Pc(41) int local41 = arg2;
		@Pc(43) int local43 = arg0;
		if (local39 < 1.0F) {
			local43 = (int) ((float) arg2 * local39);
		} else {
			local41 = (int) ((float) arg0 / local39);
		}
		@Pc(70) int local70 = arg4 + (arg2 - local41) / 2;
		@Pc(79) int local79 = arg3 + (arg0 - local43) / 2;
		if (Static55.aClass80_3 == null || Static55.aClass80_3.UA() != arg2 || arg0 != Static55.aClass80_3.qa()) {
			Static7.method2287(Static7.anInt2566, Static7.anInt2570 + Static7.anInt2576, Static7.anInt2566 - -Static7.anInt2568, Static7.anInt2576, local70, local79, local41 + local70, local43 + local79);
			Static7.method2284(arg1);
			Static55.aClass80_3 = arg1.method4714(local70, local79, local41, local43, false);
		}
		Static55.aClass80_3.method6099(local70, local79);
		@Pc(131) int local131 = local41 * Static361.anInt6130 / Static7.anInt2568;
		@Pc(137) int local137 = Static178.anInt3224 * local43 / Static7.anInt2570;
		@Pc(146) int local146 = local70 + Static246.anInt4386 * local41 / Static7.anInt2568;
		@Pc(160) int local160 = local43 + local79 - local137 - local43 * Static362.anInt6144 / Static7.anInt2570;
		@Pc(162) int local162 = -1996554240;
		if (Static248.aClass145_2 == Static96.aClass145_1) {
			local162 = -1996488705;
		}
		arg1.NA(local146, local160, local131, local137, local162, 1);
		arg1.method4685(local146, local160, local131, local137, local162, 0);
		if (Static273.anInt4877 <= 0) {
			return;
		}
		@Pc(192) int local192;
		if (Static397.anInt6910 <= 50) {
			local192 = Static397.anInt6910 * 5;
		} else {
			local192 = 500 - Static397.anInt6910 * 5;
		}
		for (@Pc(205) Class1_Sub28 local205 = (Class1_Sub28) Static7.aClass266_18.method6000(); local205 != null; local205 = (Class1_Sub28) Static7.aClass266_18.method5994()) {
			@Pc(213) Class231 local213 = Static7.aClass224_3.method5302(local205.anInt4274);
			if (Static179.method2763(local213)) {
				@Pc(234) int local234;
				@Pc(247) int local247;
				if (Static440.anInt7583 == local205.anInt4274) {
					local234 = local205.anInt4277 * local41 / Static7.anInt2568 + local70;
					local247 = local79 + (Static7.anInt2570 - local205.anInt4275) * local43 / Static7.anInt2570;
					arg1.method4743(local234 - 2, local192 << 24 | 0xFFFF00, local247 - 2, 4, 4);
				} else if (Static66.anInt1356 != -1 && local213.anInt6858 == Static66.anInt1356) {
					local234 = local70 + local41 * local205.anInt4277 / Static7.anInt2568;
					local247 = local43 * (Static7.anInt2570 - local205.anInt4275) / Static7.anInt2570 + local79;
					arg1.method4743(local234 - 2, local192 << 24 | 0xFFFF00, local247 - 2, 4, 4);
				}
			}
		}
	}
}
