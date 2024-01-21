import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "[I")
	public static int[] anIntArray294;

	@OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
	public static int anInt2281;

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "Lclient!bc;")
	public static Class8 aClass8_50 = new Class8(64);

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "Lclient!pe;")
	public static Class65 aClass65_959 = Static119.method1462("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!rb", name = "ab", descriptor = "Lclient!pe;")
	private static Class65 aClass65_962 = Static119.method1462(" ");

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "Lclient!pe;")
	public static Class65 aClass65_960 = aClass65_962;

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!rb", name = "Z", descriptor = "Lclient!pe;")
	public static Class65 aClass65_961 = Static119.method1462("Titelbild geladen)3");

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
	public static int anInt2280 = 0;

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
	public static int anInt2282 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)I")
	public static int method1644(@OriginalArg(1) int arg0) {
		@Pc(7) Class2_Sub1_Sub7 local7 = Static108.method1744(arg0);
		@Pc(10) int local10 = local7.anInt1196;
		@Pc(13) int local13 = local7.anInt1198;
		@Pc(21) int local21 = local7.anInt1204;
		@Pc(28) int local28 = Class35.anIntArray120[local21 - local13];
		return local28 & Static129.anIntArray363[local10] >> local13;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZII)I")
	public static int method1646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V")
	public static void method1647() {
		Static66.aClass2_Sub4_Sub1_2.method954();
		@Pc(13) int local13 = Static66.aClass2_Sub4_Sub1_2.method953(8);
		@Pc(27) int local27;
		if (Static110.anInt2469 > local13) {
			for (local27 = local13; local27 < Static110.anInt2469; local27++) {
				Static98.anIntArray290[Static47.anInt1129++] = Static117.anIntArray340[local27];
			}
		}
		if (Static110.anInt2469 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static110.anInt2469 = 0;
		for (local27 = 0; local27 < local13; local27++) {
			@Pc(69) int local69 = Static117.anIntArray340[local27];
			@Pc(73) Class2_Sub1_Sub1_Sub4_Sub2 local73 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local69];
			@Pc(78) int local78 = Static66.aClass2_Sub4_Sub1_2.method953(1);
			if (local78 == 0) {
				Static117.anIntArray340[Static110.anInt2469++] = local69;
				local73.anInt1969 = Static10.anInt2951;
			} else {
				@Pc(101) int local101 = Static66.aClass2_Sub4_Sub1_2.method953(2);
				if (local101 == 0) {
					Static117.anIntArray340[Static110.anInt2469++] = local69;
					local73.anInt1969 = Static10.anInt2951;
					Static68.anIntArray376[Static33.anInt761++] = local69;
				} else {
					@Pc(143) int local143;
					@Pc(153) int local153;
					if (local101 == 1) {
						Static117.anIntArray340[Static110.anInt2469++] = local69;
						local73.anInt1969 = Static10.anInt2951;
						local143 = Static66.aClass2_Sub4_Sub1_2.method953(3);
						local73.method1470(false, local143);
						local153 = Static66.aClass2_Sub4_Sub1_2.method953(1);
						if (local153 == 1) {
							Static68.anIntArray376[Static33.anInt761++] = local69;
						}
					} else if (local101 == 2) {
						Static117.anIntArray340[Static110.anInt2469++] = local69;
						local73.anInt1969 = Static10.anInt2951;
						local143 = Static66.aClass2_Sub4_Sub1_2.method953(3);
						local73.method1470(true, local143);
						local153 = Static66.aClass2_Sub4_Sub1_2.method953(3);
						local73.method1470(true, local153);
						@Pc(207) int local207 = Static66.aClass2_Sub4_Sub1_2.method953(1);
						if (local207 == 1) {
							Static68.anIntArray376[Static33.anInt761++] = local69;
						}
					} else if (local101 == 3) {
						Static98.anIntArray290[Static47.anInt1129++] = local69;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)Lclient!hf;")
	public static Class2_Sub1_Sub6 method1648(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub6 local10 = (Class2_Sub1_Sub6) Static130.aClass8_62.method172((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static41.aClass56_18.method1666(arg0, 5);
		local10 = new Class2_Sub1_Sub6();
		if (local22 != null) {
			local10.method759(new Class2_Sub4(local22));
		}
		Static130.aClass8_62.method176((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	public static void method1650() {
		aClass65_960 = null;
		aClass8_50 = null;
		aClass65_961 = null;
		aBooleanArray16 = null;
		anIntArray294 = null;
		aClass65_962 = null;
		aClass65_959 = null;
	}
}
