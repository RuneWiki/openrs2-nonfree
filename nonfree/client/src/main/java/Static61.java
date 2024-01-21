import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lclient!hb;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "[I")
	public static int[] anIntArray166;

	@OriginalMember(owner = "client!kd", name = "ab", descriptor = "Lclient!qc;")
	public static Class60 aClass60_585 = Static121.method2047("hel");

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
	public static int anInt1530 = 0;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_586 = Static121.method2047("::clientdrop");

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
	public static int anInt1533 = 0;

	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][13][13];

	@OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
	public static int anInt1540 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!kd", name = "Bb", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array12 = new Class60[200];

	@OriginalMember(owner = "client!kd", name = "Db", descriptor = "I")
	public static int anInt1544 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!t;III)V")
	public static void method1121(@OriginalArg(1) Class4_Sub4_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static130.anInt3022 >= 50 || Static107.anInt2537 == 0 || (arg0.anIntArray297 == null || arg0.anIntArray297.length <= arg3)) {
			return;
		}
		@Pc(32) int local32 = arg0.anIntArray297[arg3];
		if (local32 == 0) {
			return;
		}
		@Pc(42) int local42 = local32 >> 8;
		Static131.anIntArray339[Static130.anInt3022] = local42;
		@Pc(50) int local50 = local32 & 0xF;
		@Pc(56) int local56 = local32 >> 4 & 0x7;
		@Pc(62) int local62 = (arg1 - 64) / 128;
		@Pc(68) int local68 = (arg2 - 64) / 128;
		Static87.anIntArray206[Static130.anInt3022] = local56;
		Static85.anIntArray204[Static130.anInt3022] = 0;
		Static20.aClass73Array1[Static130.anInt3022] = null;
		Static87.anIntArray207[Static130.anInt3022] = (local62 << 16) + (local68 << 8) + local50;
		Static130.anInt3022++;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIILclient!gf;B)V")
	public static void method1123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub4_Sub5 arg4) {
		@Pc(7) Class4_Sub21 local7 = new Class4_Sub21();
		local7.anInt2766 = arg2 * 128;
		local7.anInt2767 = arg4.anInt1105 * 128;
		local7.anInt2770 = arg1;
		local7.anInt2779 = arg4.anInt1093;
		local7.anInt2769 = arg4.anInt1079;
		@Pc(32) int local32 = arg4.anInt1075;
		local7.anInt2764 = arg4.anInt1100;
		local7.anInt2772 = arg0 * 128;
		@Pc(44) int local44 = arg4.anInt1085;
		if (arg3 == 1 || arg3 == 3) {
			local32 = arg4.anInt1085;
			local44 = arg4.anInt1075;
		}
		local7.anIntArray302 = arg4.anIntArray93;
		local7.anInt2777 = (local44 + arg0) * 128;
		local7.anInt2774 = (local32 + arg2) * 128;
		if (arg4.anIntArray94 != null) {
			local7.aClass4_Sub4_Sub5_1 = arg4;
			local7.method1948();
		}
		Static8.aClass70_2.method1931(local7);
		if (local7.anIntArray302 != null) {
			local7.anInt2765 = (int) ((double) (local7.anInt2764 - local7.anInt2779) * Math.random()) + local7.anInt2779;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
	public static void method1125() {
		Static56.aClass4_Sub13_Sub1_1.method1265(26);
		for (@Pc(10) Class4_Sub18 local10 = (Class4_Sub18) Static111.aClass66_12.method1838(); local10 != null; local10 = (Class4_Sub18) Static111.aClass66_12.method1831()) {
			if (local10.anInt2399 == 0 || local10.anInt2399 == 3) {
				Static5.method38(true, local10);
			}
		}
		if (Static11.aClass4_Sub17_1 != null) {
			Static130.method2133(Static11.aClass4_Sub17_1);
			Static11.aClass4_Sub17_1 = null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)Z")
	public static boolean method1127() {
		@Pc(5) Class64 local5 = Static102.aClass64_1;
		synchronized (Static102.aClass64_1) {
			if (Static110.anInt2676 == Static104.anInt2501) {
				return false;
			} else {
				Static111.anInt2685 = Static109.anIntArray291[Static104.anInt2501];
				Static13.anInt427 = Static66.anIntArray164[Static104.anInt2501];
				Static104.anInt2501 = Static104.anInt2501 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public static void method1132() {
		aClass60_586 = null;
		aClass60Array12 = null;
		aClass29_1 = null;
		aClass60_585 = null;
		anIntArrayArrayArray6 = null;
		anIntArray166 = null;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)V")
	public static void method1133(@OriginalArg(0) boolean arg0) {
		Static9.method138();
		Static82.anInt1971++;
		if (Static82.anInt1971 < 50 && !arg0) {
			return;
		}
		Static82.anInt1971 = 0;
		if (Static10.aBoolean8 || Static7.aClass78_6 == null) {
			return;
		}
		Static56.aClass4_Sub13_Sub1_1.method1265(132);
		try {
			Static7.aClass78_6.method2081(Static56.aClass4_Sub13_Sub1_1.aByteArray68, Static56.aClass4_Sub13_Sub1_1.anInt1643);
			Static56.aClass4_Sub13_Sub1_1.anInt1643 = 0;
		} catch (@Pc(49) IOException local49) {
			Static10.aBoolean8 = true;
		}
	}
}
