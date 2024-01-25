import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	public static int anInt5756;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	public static int anInt5749 = 0;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
	public static int anInt5752 = -2;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "[Lclient!cm;")
	public static final Class4_Sub2_Sub6[] aClass4_Sub2_Sub6Array4 = new Class4_Sub2_Sub6[14];

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Lclient!cq;")
	public static final Class43 aClass43_17 = new Class43("", 13);

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "[I")
	public static final int[] anIntArray456 = new int[1];

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)V")
	public static void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class4_Sub2_Sub17 local13 = Static34.method1709(13, arg1);
		local13.method5529();
		local13.anInt6873 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;ILclient!ug;I)Lclient!ti;")
	public static Class238 method4604(@OriginalArg(0) String arg0, @OriginalArg(2) Class135_Sub2 arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static283.anIntArray375, 0);
		if (Static283.anIntArray375[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class238(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIB)Z")
	public static boolean method4605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public static void method4606() {
		Static267.anInt4402 = 0;
		@Pc(19) int local19 = Static56.aClass4_Sub9_Sub2_1.method5042();
		@Pc(23) int local23 = Static56.aClass4_Sub9_Sub2_1.method5013();
		@Pc(27) int local27 = Static56.aClass4_Sub9_Sub2_1.method5028();
		@Pc(38) boolean local38 = Static56.aClass4_Sub9_Sub2_1.method5012() == 1;
		Static35.method468(local23);
		@Pc(49) int local49 = (Static313.anInt5082 - Static56.aClass4_Sub9_Sub2_1.anInt6207) / 16;
		Static229.anIntArrayArray42 = new int[local49][4];
		@Pc(59) int local59;
		for (@Pc(55) int local55 = 0; local55 < local49; local55++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static229.anIntArrayArray42[local55][local59] = Static56.aClass4_Sub9_Sub2_1.method4997();
			}
		}
		Static146.anIntArray220 = new int[local49];
		Static131.aByteArrayArray5 = new byte[local49][];
		Static127.anIntArray182 = new int[local49];
		Static225.anIntArray279 = null;
		Static271.aByteArrayArray10 = new byte[local49][];
		Static318.anIntArray417 = new int[local49];
		Static418.aByteArrayArray17 = new byte[local49][];
		Static91.anIntArray131 = new int[local49];
		Static375.aByteArrayArray14 = new byte[local49][];
		Static398.anIntArray495 = new int[local49];
		Static372.aByteArrayArray13 = null;
		local49 = 0;
		for (local59 = (local19 - (Static337.anInt5497 >> 4)) / 8; local59 <= (local19 + (Static337.anInt5497 >> 4)) / 8; local59++) {
			for (@Pc(132) int local132 = (local27 - (Static282.anInt4644 >> 4)) / 8; local132 <= ((Static282.anInt4644 >> 4) + local27) / 8; local132++) {
				Static91.anIntArray131[local49] = (local59 << 8) + local132;
				Static318.anIntArray417[local49] = Static280.aClass211_68.method4384("m" + local59 + "_" + local132);
				Static146.anIntArray220[local49] = Static280.aClass211_68.method4384("l" + local59 + "_" + local132);
				Static127.anIntArray182[local49] = Static280.aClass211_68.method4384("um" + local59 + "_" + local132);
				Static398.anIntArray495[local49] = Static280.aClass211_68.method4384("ul" + local59 + "_" + local132);
				local49++;
			}
		}
		Static326.method4297(10, local38, local27, local19);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
	public static void method4607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(15, 0);
		local8.method5529();
		local8.anInt6873 = arg0;
		local8.anInt6871 = arg1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!ya;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4608(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static323.aClass135_12 = arg0;
		Static75.anInt1524 = arg1;
		Static290.aClass35_2 = arg3;
		Static299.aBoolean357 = Static323.aClass135_12.method5362() > 0;
		Static32.anInt531 = arg4 >> Static145.anInt2581;
		Static150.anInt2733 = arg6 >> Static145.anInt2581;
		Static35.anInt570 = arg4;
		Static70.anInt1418 = arg6;
		Static315.anInt5094 = arg5;
		Static288.anInt4749 = Static32.anInt531 - Static387.anInt6326;
		if (Static288.anInt4749 < 0) {
			Static442.anInt6884 = -Static288.anInt4749;
			Static288.anInt4749 = 0;
		} else {
			Static442.anInt6884 = 0;
		}
		Static431.anInt7346 = Static150.anInt2733 - Static387.anInt6326;
		if (Static431.anInt7346 < 0) {
			Static182.anInt3335 = -Static431.anInt7346;
			Static431.anInt7346 = 0;
		} else {
			Static182.anInt3335 = 0;
		}
		Static333.anInt5438 = Static32.anInt531 + Static387.anInt6326;
		if (Static333.anInt5438 > Static81.anInt1606) {
			Static333.anInt5438 = Static81.anInt1606;
		}
		Static217.anInt7222 = Static150.anInt2733 + Static387.anInt6326;
		if (Static217.anInt7222 > Static18.anInt297) {
			Static217.anInt7222 = Static18.anInt297;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static387.anInt6326 + Static387.anInt6326 + 2; local74++) {
			for (local77 = 0; local77 < Static387.anInt6326 + Static387.anInt6326 + 2; local77++) {
				local84 = Static32.anInt531 + local74 - Static387.anInt6326;
				local90 = Static150.anInt2733 + local77 - Static387.anInt6326;
				if (local84 >= 0 && local90 >= 0 && local84 < Static81.anInt1606 && local90 < Static18.anInt297) {
					@Pc(104) int local104 = local84 << Static145.anInt2581;
					@Pc(108) int local108 = local90 << Static145.anInt2581;
					@Pc(124) int local124 = Static228.aClass41Array2[Static228.aClass41Array2.length - 1].l(local84, local90) - (0x3E8 << Static145.anInt2581 - 7);
					@Pc(144) int local144 = Static169.aClass41Array1 == null ? Static228.aClass41Array2[0].l(local84, local90) + Static416.anInt7020 : Static169.aClass41Array1[0].l(local84, local90) + Static416.anInt7020;
					Static399.aBooleanArrayArray7[local74][local77] = Static323.aClass135_12.JA(local104, local124, local108, local104, local144, local108);
				} else {
					Static399.aBooleanArrayArray7[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static387.anInt6326 + Static387.anInt6326 + 1; local77++) {
			for (local84 = 0; local84 < Static387.anInt6326 + Static387.anInt6326 + 1; local84++) {
				Static458.aBooleanArrayArray8[local77][local84] = Static399.aBooleanArrayArray7[local77][local84] || Static399.aBooleanArrayArray7[local77 + 1][local84] || Static399.aBooleanArrayArray7[local77][local84 + 1] || Static399.aBooleanArrayArray7[local77 + 1][local84 + 1];
			}
		}
		Static386.anIntArray501 = arg8;
		Static284.anIntArray378 = arg9;
		Static140.anIntArray210 = arg10;
		Static209.anIntArray272 = arg11;
		Static86.anIntArray126 = arg12;
		Static409.method5555();
		Static458.method5366();
		for (@Pc(260) Class20_Sub5 local260 = (Class20_Sub5) Static301.aClass248_6.method5583(); local260 != null; local260 = (Class20_Sub5) Static301.aClass248_6.method5577()) {
			local260.method5771();
			Static342.method4556(local260);
		}
		if (Static299.aBoolean357) {
			for (local90 = 0; local90 < Static440.anInt7325; local90++) {
				Static367.aClass154Array1[local90].method2941(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static323.aClass135_12.method5340(0);
			if (Static146.aClass28_1 == null || Static146.aClass28_1 instanceof Class28_Sub2) {
				Static146.aClass28_1 = new Class28_Sub1();
			}
		} else if (Static146.aClass28_1 == null || Static146.aClass28_1 instanceof Class28_Sub1) {
			Static146.aClass28_1 = new Class28_Sub2();
		}
		Static146.aClass28_1.method4504(arg2);
		Static146.aClass28_1.method4503();
		if (Static221.aClass75ArrayArrayArray3 != null) {
			Static371.method4767(true);
			Static146.aClass28_1.method4499(22);
			Static256.method3377(arg2, null, 0, (byte) 0, arg15, arg16);
			Static146.aClass28_1.method4503();
			Static146.aClass28_1.method4499(23);
			Static371.method4767(false);
		}
		Static256.method3377(arg2, arg7, arg13, arg14, arg15, arg16);
		Static146.aClass28_1.method4503();
		Static146.aClass28_1.method4506();
		Static146.aClass28_1.method4503();
		if (arg2 > 1) {
			Static323.aClass135_12.method5335(0);
		}
		Static323.aClass135_12.method5359(0, null);
	}
}
