import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!df", name = "E", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_73;

	@OriginalMember(owner = "client!df", name = "K", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_74;

	@OriginalMember(owner = "client!df", name = "L", descriptor = "I")
	public static int anInt3168;

	@OriginalMember(owner = "client!df", name = "O", descriptor = "Lclient!pd;")
	public static Class20 aClass20_62;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "I")
	public static final int anInt3164 = 5063219;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "Z")
	public static boolean aBoolean155 = true;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1781 = Static28.method504("ams");

	@OriginalMember(owner = "client!df", name = "C", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1782 = Static28.method504("<br>(X");

	@OriginalMember(owner = "client!df", name = "F", descriptor = "[I")
	public static int[] anIntArray363 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!df", name = "I", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1783 = Static28.method504("Nehmen");

	@OriginalMember(owner = "client!df", name = "J", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1784 = Static28.method504("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!df", name = "N", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1785 = Static28.method504("M");

	@OriginalMember(owner = "client!df", name = "P", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1786 = aClass39_1785;

	@OriginalMember(owner = "client!df", name = "S", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1787 = aClass39_1785;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public static void method2194() {
		Static83.aClass12_56.method233();
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4 method2195() {
		@Pc(7) Class4_Sub2_Sub3_Sub4 local7 = new Class4_Sub2_Sub3_Sub4();
		local7.anInt2267 = Static21.anIntArray61[0];
		local7.anInt2266 = Static16.anIntArray49[0];
		local7.anIntArray248 = Static114.anIntArray308;
		local7.anInt2264 = Static9.anInt291;
		local7.aByteArray25 = Static70.aByteArrayArray6[0];
		local7.anInt2262 = Static121.anIntArray320[0];
		local7.anInt2265 = Static51.anIntArray277[0];
		local7.anInt2263 = Static15.anInt375;
		Static120.method2049();
		return local7;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
	public static void method2196() {
		aClass39_1786 = null;
		aClass20_62 = null;
		aClass4_Sub5_73 = null;
		aClass39_1782 = null;
		aClass39_1785 = null;
		aClass39_1784 = null;
		aClass39_1787 = null;
		aClass4_Sub5_74 = null;
		aClass39_1783 = null;
		anIntArray363 = null;
		aClass39_1781 = null;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(II)Lclient!of;")
	public static Class4_Sub2_Sub12 method2197(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub2_Sub12 local10 = (Class4_Sub2_Sub12) Static83.aClass12_56.method235((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static91.aClass20_45.method474(4, arg0);
		local10 = new Class4_Sub2_Sub12();
		if (local22 != null) {
			local10.method1608(new Class4_Sub16(local22), arg0);
		}
		local10.method1606();
		Static83.aClass12_56.method234(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ae;I)V")
	public static void method2198(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0) {
		if (arg0.anInt2658 == 0) {
			return;
		}
		@Pc(33) int local33;
		@Pc(40) int local40;
		if (arg0.anInt2674 != -1 && arg0.anInt2674 < 32768) {
			@Pc(25) Class4_Sub2_Sub1_Sub1_Sub2 local25 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[arg0.anInt2674];
			if (local25 != null) {
				local33 = arg0.anInt2643 - local25.anInt2643;
				local40 = arg0.anInt2641 - local25.anInt2641;
				if (local33 != 0 || local40 != 0) {
					arg0.anInt2644 = (int) (Math.atan2((double) local33, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(70) int local70;
		if (arg0.anInt2674 >= 32768) {
			local70 = arg0.anInt2674 - 32768;
			if (Static30.anInt783 == local70) {
				local70 = 2047;
			}
			@Pc(83) Class4_Sub2_Sub1_Sub1_Sub1 local83 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local70];
			if (local83 != null) {
				@Pc(92) int local92 = arg0.anInt2641 - local83.anInt2641;
				local40 = arg0.anInt2643 - local83.anInt2643;
				if (local40 != 0 || local92 != 0) {
					arg0.anInt2644 = (int) (Math.atan2((double) local40, (double) local92) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2686 != 0 || arg0.anInt2640 != 0) && (arg0.anInt2660 == 0 || arg0.anInt2648 > 0)) {
			local70 = arg0.anInt2643 - (arg0.anInt2686 - Static36.anInt909 - Static36.anInt909) * 64;
			local33 = arg0.anInt2641 - (arg0.anInt2640 - Static24.anInt503 - Static24.anInt503) * 64;
			if (local70 != 0 || local33 != 0) {
				arg0.anInt2644 = (int) (Math.atan2((double) local70, (double) local33) * 325.949D) & 0x7FF;
			}
			arg0.anInt2640 = 0;
			arg0.anInt2686 = 0;
		}
		local70 = arg0.anInt2644 - arg0.anInt2670 & 0x7FF;
		if (local70 == 0) {
			arg0.anInt2651 = 0;
			return;
		}
		arg0.anInt2651++;
		@Pc(235) boolean local235;
		if (local70 > 1024) {
			arg0.anInt2670 -= arg0.anInt2658;
			local235 = true;
			if (arg0.anInt2658 > local70 || local70 > 2048 - arg0.anInt2658) {
				arg0.anInt2670 = arg0.anInt2644;
				local235 = false;
			}
			if (arg0.anInt2679 == arg0.anInt2691 && (arg0.anInt2651 > 25 || local235)) {
				if (arg0.anInt2657 == -1) {
					arg0.anInt2691 = arg0.anInt2690;
				} else {
					arg0.anInt2691 = arg0.anInt2657;
				}
			}
		} else {
			arg0.anInt2670 += arg0.anInt2658;
			local235 = true;
			if (local70 < arg0.anInt2658 || local70 > 2048 - arg0.anInt2658) {
				arg0.anInt2670 = arg0.anInt2644;
				local235 = false;
			}
			if (arg0.anInt2691 == arg0.anInt2679 && (arg0.anInt2651 > 25 || local235)) {
				if (arg0.anInt2656 == -1) {
					arg0.anInt2691 = arg0.anInt2690;
				} else {
					arg0.anInt2691 = arg0.anInt2656;
				}
			}
		}
		arg0.anInt2670 &= 0x7FF;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)V")
	public static void method2199(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static83.anInt2086; local14++) {
			if (Static42.aLongArray3[local14] == arg0) {
				Static83.anInt2086--;
				for (@Pc(32) int local32 = local14; local32 < Static83.anInt2086; local32++) {
					Static42.aLongArray3[local32] = Static42.aLongArray3[local32 + 1];
				}
				Static4.anInt88 = Static129.anInt3153;
				Static114.aClass4_Sub16_Sub1_3.method1499(23);
				Static114.aClass4_Sub16_Sub1_3.method1457(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!pd;B)V")
	public static void method2200(@OriginalArg(0) Class20 arg0) {
		Static23.aClass20_17 = arg0;
	}
}
