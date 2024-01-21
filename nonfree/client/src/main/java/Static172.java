import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1353 = Static65.method1172("mapmarker");

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public static int anInt3773 = 0;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1354 = Static65.method1172("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1355 = Static65.method1172("FULL");

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1356 = Static65.method1172(":chalreq:");

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1357 = aClass46_1355;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!ih;IBII)V")
	public static void method2723(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub15 local8 = new Class3_Sub15();
		local8.anInt2322 = arg1.anInt1832 * 128;
		local8.anIntArray236 = arg1.anIntArray169;
		@Pc(25) int local25 = arg1.anInt1795;
		local8.anInt2321 = arg1.anInt1809;
		local8.anInt2310 = arg1.anInt1827;
		local8.anInt2313 = arg1.anInt1807;
		local8.anInt2311 = arg4 * 128;
		@Pc(45) int local45 = arg1.anInt1825;
		if (arg0 == 1 || arg0 == 3) {
			local45 = arg1.anInt1795;
			local25 = arg1.anInt1825;
		}
		local8.anInt2318 = (local25 + arg2) * 128;
		local8.anInt2314 = arg3;
		local8.anInt2316 = (local45 + arg4) * 128;
		local8.anInt2319 = arg2 * 128;
		if (arg1.anIntArray171 != null) {
			local8.aClass3_Sub2_Sub9_1 = arg1;
			local8.method1572();
		}
		Static86.aClass59_6.method1730(local8);
		if (local8.anIntArray236 != null) {
			local8.anInt2312 = local8.anInt2313 + (int) ((double) (local8.anInt2310 - local8.anInt2313) * Math.random());
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!mc;II)V")
	public static void method2724(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt1720 > Static20.anInt512) {
			Static92.method1533(arg0);
		} else if (arg0.anInt1705 < Static20.anInt512) {
			Static170.method2714(arg0);
		} else {
			Static141.method2370(arg0);
		}
		if (arg0.anInt1700 < 128 || arg0.anInt1711 < 128 || arg0.anInt1700 >= 13184 || arg0.anInt1711 >= 13184) {
			arg0.anInt1720 = 0;
			arg0.anInt1711 = arg0.anIntArray163[0] * 128 + arg0.anInt1712 * 64;
			arg0.anInt1738 = -1;
			arg0.anInt1707 = -1;
			arg0.anInt1705 = 0;
			arg0.anInt1700 = arg0.anInt1712 * 64 + arg0.anIntArray160[0] * 128;
			arg0.method1162();
		}
		if (arg0 == Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1 && (arg0.anInt1700 < 1536 || arg0.anInt1711 < 1536 || arg0.anInt1700 >= 11776 || arg0.anInt1711 >= 11776)) {
			arg0.anInt1707 = -1;
			arg0.anInt1700 = arg0.anInt1712 * 64 + arg0.anIntArray160[0] * 128;
			arg0.anInt1705 = 0;
			arg0.anInt1711 = arg0.anIntArray163[0] * 128 + arg0.anInt1712 * 64;
			arg0.anInt1738 = -1;
			arg0.anInt1720 = 0;
			arg0.method1162();
		}
		Static171.method2722(arg0);
		Static141.method2371(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method2725() {
		aClass46_1353 = null;
		aClass46_1357 = null;
		aClass46_1356 = null;
		aClass46_1354 = null;
		aClass46_1355 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)I")
	public static int method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static155.method2520(arg1 - 1, arg0 + -1) + Static155.method2520(arg1 - 1, arg0 + 1) + Static155.method2520(arg1 + 1, arg0 + -1) + Static155.method2520(arg1 + 1, arg0 + 1);
		@Pc(70) int local70 = Static155.method2520(arg1, arg0 - 1) + Static155.method2520(arg1, arg0 + 1) + Static155.method2520(arg1 + -1, arg0) + Static155.method2520(arg1 - -1, arg0);
		@Pc(75) int local75 = Static155.method2520(arg1, arg0);
		return local75 / 4 + local70 / 8 + local41 / 16;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
	public static void method2727(@OriginalArg(0) int arg0) {
		if (!Static57.method1063(arg0)) {
			return;
		}
		@Pc(14) Class33[] local14 = Static26.aClass33ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(27) Class33 local27 = local14[local16];
			if (local27 != null) {
				local27.anInt1483 = 0;
				local27.anInt1423 = 0;
			}
		}
	}
}
