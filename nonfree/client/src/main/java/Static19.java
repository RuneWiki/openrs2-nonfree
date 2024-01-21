import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	public static int anInt551;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static int anInt558;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!eh;")
	private static Class28 aClass28_211 = Static170.method3101("Loaded input handler");

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!eh;")
	private static Class28 aClass28_214 = Static170.method3101("Attack");

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_212 = aClass28_214;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_213 = Static170.method3101(")4lang)4de");

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_215 = Static170.method3101("scape main");

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_216 = aClass28_211;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public static int anInt557 = 0;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!eh;")
	public static Class28 aClass28_217 = Static170.method3101("(U0a )2 via: ");

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_218 = Static170.method3101("T");

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11 = new int[4][13][13];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Lclient!gf;")
	public static Class33 method576(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static42.aClass33ArrayArray1[local12] == null || Static42.aClass33ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static48.method1149(local12);
			if (!local30) {
				return null;
			}
		}
		return Static42.aClass33ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 1 || arg1 < 1 || arg4 > 102 || arg1 > 102) {
			return;
		}
		if (Static179.aBoolean202 && Static171.anInt4109 != arg2) {
			return;
		}
		@Pc(29) long local29 = 0L;
		if (arg0 == 0) {
			local29 = Static80.method2760(arg2, arg4, arg1);
		}
		if (arg0 == 1) {
			local29 = Static44.method3009(arg2, arg4, arg1);
		}
		if (arg0 == 2) {
			local29 = Static172.method3138(arg2, arg4, arg1);
		}
		if (arg0 == 3) {
			local29 = Static74.method1709(arg2, arg4, arg1);
		}
		if (local29 != 0L) {
			@Pc(81) int local81 = (int) local29 >> 14 & 0x1F;
			@Pc(88) int local88 = (int) (local29 >>> 32) & Integer.MAX_VALUE;
			@Pc(95) int local95 = (int) local29 >> 20 & 0x3;
			@Pc(108) Class3_Sub2_Sub18 local108;
			if (arg0 == 0) {
				Static85.method1971(arg2, arg4, arg1);
				local108 = Static86.method1991(local88);
				if (local108.anInt4236 != 0) {
					Static45.aClass21Array1[arg2].method806(arg4, local108.aBoolean196, local81, local95, arg1);
				}
			}
			if (arg0 == 1) {
				Static83.method1910(arg2, arg4, arg1);
			}
			if (arg0 == 2) {
				Static73.method1683(arg2, arg4, arg1);
				local108 = Static86.method1991(local88);
				if (arg4 + local108.anInt4242 > 103 || local108.anInt4242 + arg1 > 103 || arg4 + local108.anInt4226 > 103 || arg1 + local108.anInt4226 > 103) {
					return;
				}
				if (local108.anInt4236 != 0) {
					Static45.aClass21Array1[arg2].method793(arg4, local108.anInt4226, local108.anInt4242, arg1, local108.aBoolean196, local95);
				}
			}
			if (arg0 == 3) {
				Static122.method2454(arg2, arg4, arg1);
				local108 = Static86.method1991(local88);
				if (local108.anInt4236 == 1) {
					Static45.aClass21Array1[arg2].method801(arg1, arg4);
				}
			}
		}
		if (arg6 < 0) {
			return;
		}
		@Pc(223) int local223 = arg2;
		if (arg2 < 3 && (Static157.aByteArrayArrayArray41[1][arg4][arg1] & 0x2) == 2) {
			local223 = arg2 + 1;
		}
		Static177.method3180(local223, arg6, Static45.aClass21Array1[arg2], arg3, arg2, arg4, arg5, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ah;II)Z")
	public static boolean method578(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1026(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static71.method1654(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method579() {
		if (Static127.aClass16_1 != null) {
			@Pc(3) Class16 local3 = Static127.aClass16_1;
			synchronized (Static127.aClass16_1) {
				Static127.aClass16_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method580(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method581() {
		for (@Pc(5) int local5 = -1; local5 < Static112.anInt2872; local5++) {
			@Pc(12) int local12;
			if (local5 == -1) {
				local12 = 2047;
			} else {
				local12 = Static126.anIntArray557[local5];
			}
			@Pc(21) Class3_Sub2_Sub1_Sub2_Sub1 local21 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local12];
			if (local21 != null) {
				Static1.method5(local21, 1);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public static void method582() {
		Static51.aClass3_Sub8_Sub1_2.method1559(140);
		Static51.aClass3_Sub8_Sub1_2.method1541(0L);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public static void method583() {
		aClass28_216 = null;
		aClass28_218 = null;
		aClass28_214 = null;
		aClass28_211 = null;
		aClass28_215 = null;
		aClass28_217 = null;
		aClass28_212 = null;
		aClass28_213 = null;
		anIntArrayArrayArray11 = null;
	}
}
