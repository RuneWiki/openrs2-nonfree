import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	public static int anInt1155;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Lclient!fe;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public static int anInt1146 = 0;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "Lclient!ad;")
	public static Class4 aClass4_579 = Static75.method1216("@gr3@");

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!ad;")
	public static Class4 aClass4_580 = Static75.method1216("");

	@OriginalMember(owner = "client!i", name = "o", descriptor = "[I")
	public static int[] anIntArray159 = new int[5];

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_581 = Static75.method1216("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!i", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray13 = new int[104][104];

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method805() {
		Static32.aClass3_Sub4_Sub1_2.method468();
		@Pc(13) int local13 = Static32.aClass3_Sub4_Sub1_2.method462(8);
		@Pc(18) int local18;
		if (local13 < Static29.anInt905) {
			for (local18 = local13; local18 < Static29.anInt905; local18++) {
				Static1.anIntArray1[Static29.anInt911++] = Static24.anIntArray40[local18];
			}
		}
		if (Static29.anInt905 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static29.anInt905 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(56) int local56 = Static24.anIntArray40[local18];
			@Pc(60) Class3_Sub1_Sub1_Sub1_Sub1 local60 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local56];
			@Pc(65) int local65 = Static32.aClass3_Sub4_Sub1_2.method462(1);
			if (local65 == 0) {
				Static24.anIntArray40[Static29.anInt905++] = local56;
				local60.anInt2343 = Static60.anInt1489;
			} else {
				@Pc(88) int local88 = Static32.aClass3_Sub4_Sub1_2.method462(2);
				if (local88 == 0) {
					Static24.anIntArray40[Static29.anInt905++] = local56;
					local60.anInt2343 = Static60.anInt1489;
					Static12.anIntArray13[Static95.anInt2230++] = local56;
				} else {
					@Pc(132) int local132;
					@Pc(142) int local142;
					if (local88 == 1) {
						Static24.anIntArray40[Static29.anInt905++] = local56;
						local60.anInt2343 = Static60.anInt1489;
						local132 = Static32.aClass3_Sub4_Sub1_2.method462(3);
						local60.method1551(false, local132);
						local142 = Static32.aClass3_Sub4_Sub1_2.method462(1);
						if (local142 == 1) {
							Static12.anIntArray13[Static95.anInt2230++] = local56;
						}
					} else if (local88 == 2) {
						Static24.anIntArray40[Static29.anInt905++] = local56;
						local60.anInt2343 = Static60.anInt1489;
						local132 = Static32.aClass3_Sub4_Sub1_2.method462(3);
						local60.method1551(true, local132);
						local142 = Static32.aClass3_Sub4_Sub1_2.method462(3);
						local60.method1551(true, local142);
						@Pc(196) int local196 = Static32.aClass3_Sub4_Sub1_2.method462(1);
						if (local196 == 1) {
							Static12.anIntArray13[Static95.anInt2230++] = local56;
						}
					} else if (local88 == 3) {
						Static1.anIntArray1[Static29.anInt911++] = local56;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public static void method806() {
		Static21.anIntArray37 = null;
		Static98.aByteArrayArrayArray42 = null;
		Static54.anIntArrayArrayArray12 = null;
		Static51.anIntArray175 = null;
		Static66.aByteArrayArrayArray25 = null;
		Static52.anIntArrayArray15 = null;
		Static18.aByteArrayArrayArray7 = null;
		Static30.anIntArray88 = null;
		Static92.aByteArrayArrayArray36 = null;
		Static100.anIntArray305 = null;
		Static92.aByteArrayArrayArray35 = null;
		Static36.anIntArray100 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZIB[BI)V")
	public static void method807(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (Static8.aClass30_1 == null) {
			return;
		}
		if (Static35.anInt640 >= 0) {
			arg3 -= 20;
			if (arg3 < 1) {
				arg3 = 1;
			}
			Static9.anInt310 = arg3;
			if (Static35.anInt640 == 0) {
				Static87.anInt1449 = 0;
			} else {
				@Pc(27) int local27 = method808(Static35.anInt640);
				@Pc(31) int local31 = local27 - Static113.anInt2852;
				Static87.anInt1449 = (arg3 + local31 + 3600 - 1) / arg3;
			}
			Static43.aBoolean81 = arg0;
			Static87.anInt1450 = arg1;
			Static56.aByteArray16 = arg2;
		} else if (Static9.anInt310 == 0) {
			Static25.method494(arg0, arg2, arg1);
		} else {
			Static43.aBoolean81 = arg0;
			Static87.anInt1450 = arg1;
			Static56.aByteArray16 = arg2;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
	public static int method808(@OriginalArg(0) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	public static void method809() {
		aClass4_581 = null;
		anIntArrayArray13 = null;
		aClass4_579 = null;
		aClass29_1 = null;
		anIntArray159 = null;
		aClass4_580 = null;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Lclient!td;")
	public static Class3_Sub1_Sub17 method810(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub17 local10 = (Class3_Sub1_Sub17) Static74.aClass8_23.method195((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static6.aClass64_9.method1625(9, arg0);
		local10 = new Class3_Sub1_Sub17();
		local10.anInt2522 = arg0;
		if (local25 != null) {
			local10.method1677(new Class3_Sub4(local25));
		}
		local10.method1684();
		Static74.aClass8_23.method199((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!r;ILclient!tb;)V")
	public static void method811(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class64_Sub1 arg2) {
		@Pc(7) Class3_Sub6 local7 = new Class3_Sub6();
		local7.aClass62_1 = arg0;
		local7.aLong88 = arg1;
		local7.aClass64_Sub1_11 = arg2;
		local7.anInt1199 = 1;
		@Pc(26) Class20 local26 = Static88.aClass20_10;
		synchronized (Static88.aClass20_10) {
			Static88.aClass20_10.method304(local7);
		}
		Static51.method870();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(JI)V")
	public static void method812(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static87.anInt1451; local12++) {
			if (Static31.aLongArray9[local12] == arg0) {
				Static39.aBoolean74 = true;
				Static87.anInt1451--;
				for (@Pc(36) int local36 = local12; local36 < Static87.anInt1451; local36++) {
					Static21.aClass4Array2[local36] = Static21.aClass4Array2[local36 + 1];
					Static36.anIntArray101[local36] = Static36.anIntArray101[local36 + 1];
					Static31.aLongArray9[local36] = Static31.aLongArray9[local36 + 1];
				}
				Static5.aClass3_Sub4_Sub1_1.method464(30);
				Static5.aClass3_Sub4_Sub1_1.method456(arg0);
				break;
			}
		}
	}
}
