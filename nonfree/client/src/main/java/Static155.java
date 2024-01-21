import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!u", name = "db", descriptor = "[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] aClass3_Sub2_Sub2_Sub4Array8;

	@OriginalMember(owner = "client!u", name = "ab", descriptor = "I")
	public static int anInt3857 = -1;

	@OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
	public static int anInt3860 = 0;

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "[I")
	public static int[] anIntArray646 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "[J")
	public static long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!u", name = "kb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1299 = Static170.method3101("sl_back");

	@OriginalMember(owner = "client!u", name = "sb", descriptor = "I")
	public static int anInt3870 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Lclient!hc;")
	public static Class3_Sub2_Sub8 method2946(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub2_Sub8 local6 = (Class3_Sub2_Sub8) Static131.aClass63_23.method2337((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static127.aClass7_Sub1_13.method1021(arg0, 0);
		if (local20 == null) {
			return null;
		}
		local6 = new Class3_Sub2_Sub8();
		@Pc(38) Class3_Sub8 local38 = new Class3_Sub8(local20);
		local38.anInt1948 = local38.aByteArray19.length - 12;
		@Pc(49) int local49 = local38.method1540();
		local6.anInt1582 = local38.method1510();
		@Pc(56) int local56 = 0;
		local6.anInt1581 = local38.method1510();
		local6.anInt1586 = local38.method1510();
		local6.anInt1588 = local38.method1510();
		local38.anInt1948 = 0;
		local6.aClass28_477 = local38.method1521();
		local6.aClass28Array9 = new Class28[local49];
		local6.anIntArray282 = new int[local49];
		local6.anIntArray283 = new int[local49];
		while (local38.aByteArray19.length - 12 > local38.anInt1948) {
			@Pc(100) int local100 = local38.method1510();
			if (local100 == 3) {
				local6.aClass28Array9[local56] = local38.method1516();
			} else if (local100 >= 100 || local100 == 21 || local100 == 38 || local100 == 39) {
				local6.anIntArray282[local56] = local38.method1545();
			} else {
				local6.anIntArray282[local56] = local38.method1540();
			}
			local6.anIntArray283[local56++] = local100;
		}
		Static131.aClass63_23.method2338((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
	public static void method2947() {
		aLongArray8 = null;
		aClass28_1299 = null;
		aClass3_Sub2_Sub2_Sub4Array8 = null;
		anIntArray646 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIZIIII)V")
	public static void method2948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static48.method1149(arg1)) {
			Static35.aClass33Array1 = null;
			Static57.method1259(-1, Static42.aClass33ArrayArray1[arg1], arg7, arg5, arg6, arg2, arg3, arg4, arg0);
			if (Static35.aClass33Array1 != null) {
				Static57.method1259(-1412584499, Static35.aClass33Array1, arg7, arg5, arg6, arg2, Static113.anInt2912, Static108.anInt2798, arg0);
				Static35.aClass33Array1 = null;
			}
		} else if (arg2 == -1) {
			for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
				Static137.aBooleanArray15[local17] = true;
			}
		} else {
			Static137.aBooleanArray15[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
	public static void method2949() {
		Static1.aClass87_1 = new Class87(32);
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
	public static void method2950() {
		@Pc(14) int local14;
		if (Static153.anInt3787 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static153.anInt3787 > 768) {
					Static135.anIntArray591[local14] = Static107.method2178(Static149.anIntArray625[local14], 1024 - Static153.anInt3787, Static52.anIntArray254[local14]);
				} else if (Static153.anInt3787 <= 256) {
					Static135.anIntArray591[local14] = Static107.method2178(Static52.anIntArray254[local14], 256 - Static153.anInt3787, Static149.anIntArray625[local14]);
				} else {
					Static135.anIntArray591[local14] = Static52.anIntArray254[local14];
				}
			}
		} else if (Static67.anInt2101 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static67.anInt2101 > 768) {
					Static135.anIntArray591[local14] = Static107.method2178(Static149.anIntArray625[local14], 1024 - Static67.anInt2101, Static74.anIntArray363[local14]);
				} else if (Static67.anInt2101 > 256) {
					Static135.anIntArray591[local14] = Static74.anIntArray363[local14];
				} else {
					Static135.anIntArray591[local14] = Static107.method2178(Static74.anIntArray363[local14], 256 - Static67.anInt2101, Static149.anIntArray625[local14]);
				}
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				Static135.anIntArray591[local14] = Static149.anIntArray625[local14];
			}
		}
		local14 = 0;
		@Pc(149) int local149 = 0;
		@Pc(154) int local154 = Static60.aClass3_Sub2_Sub2_Sub4_4.anInt1175 * 9;
		@Pc(171) int local171;
		@Pc(181) int local181;
		@Pc(188) int local188;
		@Pc(194) int local194;
		@Pc(206) int local206;
		@Pc(211) int local211;
		for (@Pc(156) int local156 = 1; local156 < 255; local156++) {
			local171 = (256 - local156) * Static77.anIntArray370[local156] / 256 + 22;
			if (local171 < 0) {
				local171 = 0;
			}
			local14 += local171;
			for (local181 = local171; local181 < 128; local181++) {
				local188 = Static9.anIntArray97[local14++];
				local194 = Static60.aClass3_Sub2_Sub2_Sub4_4.anIntArray222[local154++];
				if (local188 == 0) {
					Static122.aClass3_Sub2_Sub2_Sub4_6.anIntArray222[local149++] = local194;
				} else {
					local206 = local188;
					local211 = 256 - local188;
					local188 = Static135.anIntArray591[local188];
					Static122.aClass3_Sub2_Sub2_Sub4_6.anIntArray222[local149++] = ((local194 & 0xFF00) * local211 + local206 * (local188 & 0xFF00) & 0xFF0000) + ((local194 & 0xFF00FF) * local211 + local206 * (local188 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local188 = 0; local188 < local171; local188++) {
				Static122.aClass3_Sub2_Sub2_Sub4_6.anIntArray222[local149++] = Static60.aClass3_Sub2_Sub2_Sub4_4.anIntArray222[local154++];
			}
			local154 += Static60.aClass3_Sub2_Sub2_Sub4_4.anInt1175 - 128;
		}
		local149 = 0;
		local14 = 0;
		Static122.aClass3_Sub2_Sub2_Sub4_6.method986(0, 9);
		local154 = Static60.aClass3_Sub2_Sub2_Sub4_4.anInt1175 * 9 + 128;
		for (local171 = 1; local171 < 255; local171++) {
			local181 = (256 - local171) * Static77.anIntArray370[local171] / 256 + 22;
			if (local181 < 0) {
				local181 = 0;
			}
			for (local188 = 0; local188 < local181; local188++) {
				@Pc(332) int local332 = local149++;
				local154--;
				Static60.aClass3_Sub2_Sub2_Sub4_5.anIntArray222[local332] = Static60.aClass3_Sub2_Sub2_Sub4_4.anIntArray222[local154];
			}
			for (local194 = local181; local194 < 128; local194++) {
				local206 = Static9.anIntArray97[local14++];
				local154--;
				local211 = Static60.aClass3_Sub2_Sub2_Sub4_4.anIntArray222[local154];
				if (local206 == 0) {
					Static60.aClass3_Sub2_Sub2_Sub4_5.anIntArray222[local149++] = local211;
				} else {
					@Pc(362) int local362 = local206;
					@Pc(366) int local366 = 256 - local206;
					local206 = Static135.anIntArray591[local206];
					Static60.aClass3_Sub2_Sub2_Sub4_5.anIntArray222[local149++] = ((local211 & 0xFF00FF) * local366 + (local206 & 0xFF00FF) * local362 & 0xFF00FF00) + ((local211 & 0xFF00) * local366 + (local206 & 0xFF00) * local362 & 0xFF0000) >> 8;
				}
			}
			local154 += Static60.aClass3_Sub2_Sub2_Sub4_4.anInt1175 + 128;
			local14 += local181;
		}
		Static60.aClass3_Sub2_Sub2_Sub4_5.method986(637, 9);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2951(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static139.aClass48_3);
		arg0.addMouseMotionListener(Static139.aClass48_3);
		arg0.addFocusListener(Static139.aClass48_3);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(IZI)V")
	public static void method2952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg0 + (arg1 << 16));
		@Pc(23) Class3_Sub2_Sub6 local23 = (Class3_Sub2_Sub6) Static106.aClass87_9.method3201(local17);
		if (local23 != null) {
			Static131.aClass88_2.method3204(local23);
		}
	}
}
