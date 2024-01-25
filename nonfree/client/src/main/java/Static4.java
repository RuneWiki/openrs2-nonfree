import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!qn;")
	public static Class211 aClass211_2;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Lclient!rp;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_6 = new Class146(32, 8);

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
	public static final int anInt88 = 1339;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public static int method68(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local15 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local15 == 19 || local15 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)I")
	public static int method70() {
		if ((double) Static292.aFloat73 == 3.0D) {
			return 37;
		} else if ((double) Static292.aFloat73 == 4.0D) {
			return 50;
		} else if ((double) Static292.aFloat73 == 6.0D) {
			return 75;
		} else if ((double) Static292.aFloat73 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method71(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static239.aBoolean298) {
			try {
				@Pc(23) Class22 local23 = (Class22) Class.forName("Class22_Sub1").getDeclaredConstructor().newInstance();
				local23.method428(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static239.aBoolean298 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public static void method72(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(1, arg0);
		local8.method5529();
		local8.anInt6873 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
	public static void method73() {
		if (Static354.aBoolean417) {
			return;
		}
		Static333.aBoolean386 = true;
		Static354.aBoolean417 = true;
		if (Static413.aClass49_Sub1_1.aBoolean230) {
			Static109.aFloat75 = (int) Static109.aFloat75 - 65 & 0xFFFFFF80;
		} else {
			Static33.aFloat7 += (-24.0F - Static33.aFloat7) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(Z)V")
	public static void method74() {
		if (!Static70.aBoolean94) {
			return;
		}
		@Pc(15) Class110 local15 = Static220.method2992(Static259.anInt4347, Static270.anInt4512);
		if (local15 != null && local15.anObjectArray4 != null) {
			@Pc(24) Class4_Sub34 local24 = new Class4_Sub34();
			local24.anObjectArray34 = local15.anObjectArray4;
			local24.aClass110_14 = local15;
			Static80.method1289(local24);
		}
		Static70.aBoolean94 = false;
		Static81.anInt1601 = -1;
		Static340.anInt5535 = -1;
		if (local15 != null) {
			Static118.method1693(local15);
		}
	}
}
