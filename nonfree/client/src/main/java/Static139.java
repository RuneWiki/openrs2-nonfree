import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
	public static int anInt2563;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "Lclient!da;")
	public static Class62 aClass62_7;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "Z")
	public static boolean aBoolean199;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
	public static int anInt2567;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "[[Lclient!ig;")
	public static Class13_Sub1[][] aClass13_Sub1ArrayArray1;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "Lclient!ag;")
	public static final Class8 aClass8_5 = new Class8(9, 2);

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "[S")
	private static final short[] aShortArray34 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "[S")
	private static final short[] aShortArray35 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "[S")
	private static final short[] aShortArray36 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "[S")
	private static final short[] aShortArray37 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "[[S")
	public static final short[][] aShortArrayArray21 = new short[][] { aShortArray36, aShortArray35, aShortArray37, aShortArray34 };

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZ)Z")
	public static boolean method2122(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;IBI)V")
	public static void method2125(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class261 local8 = Static98.method1508(arg3, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray4 != null) {
			@Pc(18) Class2_Sub46 local18 = new Class2_Sub46();
			local18.anInt9260 = arg2;
			local18.aString104 = arg1;
			local18.aClass261_10 = local8;
			local18.anObjectArray32 = local8.anObjectArray4;
			Static300.method4138(local18);
		}
		if (Static324.anInt5145 != 10 || !Static76.method1071(local8).method6882(arg2 - 1)) {
			return;
		}
		@Pc(62) Class2_Sub40 local62;
		if (arg2 == 1) {
			local62 = Static464.method6285(Static251.aClass131_1, Static569.aClass179_121);
			Static444.method6064(local8.anInt6585, local62, arg0, arg3);
			Static528.method7295(local62);
		}
		if (arg2 == 2) {
			local62 = Static464.method6285(Static251.aClass131_1, Static270.aClass179_58);
			Static444.method6064(local8.anInt6585, local62, arg0, arg3);
			Static528.method7295(local62);
		}
		if (arg2 == 3) {
			local62 = Static464.method6285(Static251.aClass131_1, Static109.aClass179_26);
			Static444.method6064(local8.anInt6585, local62, arg0, arg3);
			Static528.method7295(local62);
		}
		@Pc(136) Class2_Sub40 local136;
		if (arg2 == 4) {
			local136 = Static464.method6285(Static251.aClass131_1, Static344.aClass179_70);
			Static444.method6064(local8.anInt6585, local136, arg0, arg3);
			Static528.method7295(local136);
		}
		if (arg2 == 5) {
			local136 = Static464.method6285(Static251.aClass131_1, Static523.aClass179_109);
			Static444.method6064(local8.anInt6585, local136, arg0, arg3);
			Static528.method7295(local136);
		}
		if (arg2 == 6) {
			local136 = Static464.method6285(Static251.aClass131_1, Static386.aClass179_83);
			Static444.method6064(local8.anInt6585, local136, arg0, arg3);
			Static528.method7295(local136);
		}
		if (arg2 == 7) {
			local136 = Static464.method6285(Static251.aClass131_1, Static614.aClass179_128);
			Static444.method6064(local8.anInt6585, local136, arg0, arg3);
			Static528.method7295(local136);
		}
		if (arg2 == 8) {
			local136 = Static464.method6285(Static251.aClass131_1, Static42.aClass179_78);
			Static444.method6064(local8.anInt6585, local136, arg0, arg3);
			Static528.method7295(local136);
		}
		if (arg2 == 9) {
			local136 = Static464.method6285(Static251.aClass131_1, Static597.aClass179_126);
			Static444.method6064(local8.anInt6585, local136, arg0, arg3);
			Static528.method7295(local136);
		}
		if (arg2 == 10) {
			local136 = Static464.method6285(Static251.aClass131_1, Static516.aClass179_90);
			Static444.method6064(local8.anInt6585, local136, arg0, arg3);
			Static528.method7295(local136);
		}
	}
}
