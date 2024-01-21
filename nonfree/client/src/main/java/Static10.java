import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_18;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "Lclient!gg;")
	private static Class28 aClass28_335 = Static107.method1838("Please try using a different world)3");

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_332 = aClass28_335;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "[J")
	public static long[] aLongArray2 = new long[500];

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_333 = aClass28_335;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
	public static int anInt494 = 0;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "Lclient!gg;")
	public static Class28 aClass28_334 = aClass28_335;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "Lclient!gg;")
	public static Class28 aClass28_336 = Static107.method1838("(U0a )2 via: ");

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "Lclient!gg;")
	public static Class28 aClass28_337 = aClass28_335;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "Lclient!gg;")
	public static Class28 aClass28_338 = aClass28_335;

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "Lclient!gg;")
	private static Class28 aClass28_339 = Static107.method1838("glow1:");

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "[I")
	public static int[] anIntArray38 = new int[50];

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
	public static int anInt498 = 0;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "Lclient!gg;")
	public static Class28 aClass28_340 = aClass28_335;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "Lclient!gg;")
	public static Class28 aClass28_341 = aClass28_339;

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "Lclient!gg;")
	public static Class28 aClass28_342 = aClass28_339;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)I")
	public static int method317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			arg0--;
			local7 = local7 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
	public static void method318(@OriginalArg(1) int arg0) {
		Static140.method2211();
		Static166.method2582();
		@Pc(10) int local10 = Static152.method2361(arg0).anInt2953;
		if (local10 == 0) {
			return;
		}
		@Pc(29) int local29 = Static24.anIntArray52[arg0];
		if (local10 == 1) {
			Static115.anInt2789 = local29;
			if (Static115.anInt2789 == 1) {
				Static25.method542(0.9F);
			}
			if (Static115.anInt2789 == 2) {
				Static25.method542(0.8F);
			}
			if (Static115.anInt2789 == 3) {
				Static25.method542(0.7F);
			}
			if (Static115.anInt2789 == 4) {
				Static25.method542(0.6F);
			}
			Static121.method2000();
		}
		if (local10 == 3) {
			@Pc(69) short local69 = 0;
			if (local29 == 0) {
				local69 = 255;
			}
			if (local29 == 1) {
				local69 = 192;
			}
			if (local29 == 2) {
				local69 = 128;
			}
			if (local29 == 3) {
				local69 = 64;
			}
			if (local29 == 4) {
				local69 = 0;
			}
			if (Static84.anInt2125 != local69) {
				if (Static84.anInt2125 == 0 && Static6.anInt373 != -1) {
					Static59.method1060(0, aClass40_Sub1_18, Static6.anInt373, local69);
					Static148.aBoolean151 = false;
				} else if (local69 == 0) {
					Static50.method936();
					Static148.aBoolean151 = false;
				} else {
					Static104.method1825(local69);
				}
				Static84.anInt2125 = local69;
			}
		}
		if (local10 == 6) {
			Static136.anInt3111 = local29;
		}
		if (local10 == 9) {
			Static180.anInt4028 = local29;
		}
		if (local10 == 5) {
			Static164.anInt3647 = local29;
		}
		if (local10 == 4) {
			if (local29 == 0) {
				Static58.anInt1512 = 127;
			}
			if (local29 == 1) {
				Static58.anInt1512 = 96;
			}
			if (local29 == 2) {
				Static58.anInt1512 = 64;
			}
			if (local29 == 3) {
				Static58.anInt1512 = 32;
			}
			if (local29 == 4) {
				Static58.anInt1512 = 0;
			}
		}
		if (local10 != 10) {
			return;
		}
		if (local29 == 0) {
			Static101.anInt443 = 127;
		}
		if (local29 == 1) {
			Static101.anInt443 = 96;
		}
		if (local29 == 2) {
			Static101.anInt443 = 64;
		}
		if (local29 == 3) {
			Static101.anInt443 = 32;
		}
		if (local29 == 4) {
			Static101.anInt443 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V")
	public static void method319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static125.anInt2948 = -1;
			Static167.anInt3744 = -1;
			return;
		}
		@Pc(40) int local40 = Static103.method1808(Static103.anInt2568, arg0, arg2) - arg1;
		@Pc(44) int local44 = Class2_Sub4_Sub3_Sub1.anIntArray58[Static112.anInt2716];
		@Pc(48) int local48 = arg2 - Static21.anInt726;
		@Pc(52) int local52 = arg0 - Static36.anInt977;
		@Pc(56) int local56 = local40 - Static40.anInt1057;
		@Pc(60) int local60 = Class2_Sub4_Sub3_Sub1.anIntArray60[Static112.anInt2716];
		@Pc(64) int local64 = Class2_Sub4_Sub3_Sub1.anIntArray58[Static33.anInt943];
		@Pc(68) int local68 = Class2_Sub4_Sub3_Sub1.anIntArray60[Static33.anInt943];
		@Pc(78) int local78 = local68 * local52 + local48 * local64 >> 16;
		@Pc(88) int local88 = local68 * local48 - local64 * local52 >> 16;
		@Pc(90) int local90 = local78;
		@Pc(100) int local100 = local60 * local56 - local44 * local88 >> 16;
		@Pc(110) int local110 = local88 * local60 + local44 * local56 >> 16;
		if (local110 < 50) {
			Static167.anInt3744 = -1;
			Static125.anInt2948 = -1;
		} else {
			Static125.anInt2948 = (local90 << 9) / local110 + 256;
			Static167.anInt3744 = (local100 << 9) / local110 + 167;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public static void method321() {
		Static36.anInt975 = 99;
		Static160.aByteArrayArrayArray8 = new byte[4][104][104];
		Static69.aByteArrayArrayArray5 = new byte[4][105][105];
		Static178.anIntArray364 = new int[104];
		Static56.anIntArray131 = new int[104];
		Static139.anIntArrayArrayArray8 = new int[4][105][105];
		Static90.anIntArray222 = new int[104];
		Static116.aByteArrayArrayArray7 = new byte[4][104][104];
		Static41.aByteArrayArrayArray3 = new byte[4][104][104];
		Static105.anIntArray241 = new int[104];
		Static18.aByteArrayArrayArray9 = new byte[4][104][104];
		Static93.anIntArray227 = new int[104];
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLclient!ff;)I")
	public static int method323(@OriginalArg(1) Class24 arg0) {
		@Pc(13) Class2_Sub10 local13 = (Class2_Sub10) Static151.aClass35_40.method1354((long) arg0.anInt1409 + ((long) arg0.anInt1367 << 32));
		return local13 == null ? arg0.anInt1375 : local13.anInt2113;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method324() {
		aClass28_339 = null;
		aClass28_340 = null;
		aClass28_336 = null;
		anIntArray38 = null;
		aClass28_332 = null;
		aLongArray2 = null;
		aClass28_335 = null;
		aClass28_338 = null;
		aClass28_333 = null;
		aClass40_Sub1_18 = null;
		aClass28_341 = null;
		aClass28_337 = null;
		aClass28_342 = null;
		aClass28_334 = null;
	}
}
