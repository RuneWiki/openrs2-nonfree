import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
	public static int anInt4058;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
	public static int anInt4075;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_33 = new Class132(64);

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_99 = new Class211(30, 4);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!sv;I)V")
	public static void method3203(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(9) int local9 = arg0.method3588();
		Static149.aClass186Array1 = new Class186[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static149.aClass186Array1[local14] = new Class186();
			Static149.aClass186Array1[local14].anInt4825 = arg0.method3588();
			Static149.aClass186Array1[local14].aString144 = arg0.method3589();
		}
		Static9.anInt132 = arg0.method3588();
		Static311.anInt6696 = arg0.method3588();
		Static409.anInt6678 = arg0.method3588();
		Static379.aClass65_Sub1Array5 = new Class65_Sub1[Static311.anInt6696 + 1 - Static9.anInt132];
		for (@Pc(69) int local69 = 0; local69 < Static409.anInt6678; local69++) {
			@Pc(75) int local75 = arg0.method3588();
			@Pc(83) Class65_Sub1 local83 = Static379.aClass65_Sub1Array5[local75] = new Class65_Sub1();
			local83.anInt2400 = arg0.method3580();
			local83.anInt2397 = arg0.method3574();
			local83.anInt2404 = local75 + Static9.anInt132;
			local83.aString74 = arg0.method3589();
			local83.aString73 = arg0.method3589();
		}
		Static317.anInt6669 = arg0.method3574();
		Static390.aBoolean491 = true;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	public static void method3209() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static138.aBooleanArray11[local7] = false;
		}
		Static96.anInt1857 = -1;
		Static414.anInt6776 = 5;
		Static278.anInt4571 = Static235.anInt3805;
		Static267.anInt4400 = Static174.anInt3028;
		Static49.anInt856 = Static40.anInt771;
		Static98.anInt1863 = 0;
		Static332.anInt5620 = Static310.anInt5375;
		Static115.anInt2124 = Static143.anInt2544;
		Static27.anInt2471 = -1;
		Static334.anInt5640 = 0;
		Static76.anInt1457 = Static266.anInt4392;
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
	public static void method3212() {
		@Pc(5) Class132 local5 = Static192.aClass132_24;
		synchronized (Static192.aClass132_24) {
			Static192.aClass132_24.method2708();
		}
		local5 = Static55.aClass132_7;
		synchronized (Static55.aClass132_7) {
			Static55.aClass132_7.method2708();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;I[BI)I")
	public static int method3213(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				arg1[local10++] = (byte) local23;
			} else if (local23 <= '\u07ff') {
				arg1[local10++] = (byte) (local23 >> 6 | 0xC0);
				arg1[local10++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg1[local10++] = (byte) (local23 >> 12 | 0xE0);
				arg1[local10++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg1[local10++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local10 - arg2;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([Lclient!at;II)V")
	public static void method3214(@OriginalArg(0) Class16[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class16 local13 = arg0[local7];
			if (local13 != null && arg1 == local13.anInt324 && !Static55.method802(local13)) {
				if (local13.anInt298 == 0) {
					method3214(arg0, local13.anInt293);
					if (local13.aClass16Array1 != null) {
						method3214(local13.aClass16Array1, local13.anInt293);
					}
					@Pc(50) Class2_Sub21 local50 = (Class2_Sub21) Static418.aClass72_44.method1659((long) local13.anInt293);
					if (local50 != null) {
						Static98.method1507(local50.anInt2585);
					}
				}
				if (local13.anInt298 == 6 && local13.anInt278 != -1) {
					@Pc(71) Class128 local71 = Static334.aClass62_2.method1418(local13.anInt278);
					if (local71 != null) {
						local13.anInt309 += Static233.anInt6983;
						while (local13.anInt309 > local71.anIntArray276[local13.anInt304]) {
							local13.anInt309 -= local71.anIntArray276[local13.anInt304];
							local13.anInt304++;
							if (local13.anInt304 >= local71.anIntArray278.length) {
								local13.anInt304 -= local71.anInt3335;
								if (local13.anInt304 < 0 || local13.anInt304 >= local71.anIntArray278.length) {
									local13.anInt304 = 0;
								}
							}
							local13.anInt299 = local13.anInt304 + 1;
							if (local13.anInt299 >= local71.anIntArray278.length) {
								local13.anInt299 -= local71.anInt3335;
								if (local13.anInt299 < 0 || local13.anInt299 >= local71.anIntArray278.length) {
									local13.anInt299 = -1;
								}
							}
							Static176.method70(local13);
						}
					}
				}
			}
		}
	}
}
