import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!q;")
	public static Class62 aClass62_19;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!q;")
	public static Class62 aClass62_20;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4 aClass1_Sub1_Sub4_Sub4_4;

	@OriginalMember(owner = "client!l", name = "z", descriptor = "[Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1[] aClass1_Sub1_Sub4_Sub1Array6;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_848 = Static108.method1915("blinken1:");

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_849 = Static108.method1915("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!kd;")
	public static Class39 aClass39_850 = Static108.method1915("mapscene");

	@OriginalMember(owner = "client!l", name = "m", descriptor = "I")
	public static int anInt1736 = 0;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_851 = Static108.method1915("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!ie;")
	public static Class31 aClass31_39 = new Class31();

	@OriginalMember(owner = "client!l", name = "q", descriptor = "[I")
	public static int[] anIntArray250 = new int[500];

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Lclient!kd;")
	private static Class39 aClass39_852 = Static108.method1915("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!kd;")
	public static Class39 aClass39_853 = Static108.method1915("<col=ffff00>*V");

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Z")
	public static boolean aBoolean147 = true;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "[Lclient!kd;")
	public static Class39[] aClass39Array19 = new Class39[100];

	@OriginalMember(owner = "client!l", name = "x", descriptor = "I")
	public static int anInt1739 = 0;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "Lclient!kd;")
	public static Class39 aClass39_854 = Static108.method1915("backhmid2");

	@OriginalMember(owner = "client!l", name = "D", descriptor = "Lclient!kd;")
	private static Class39 aClass39_857 = Static108.method1915(" is already on your friend list");

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_855 = aClass39_857;

	@OriginalMember(owner = "client!l", name = "C", descriptor = "Lclient!kd;")
	public static Class39 aClass39_856 = aClass39_852;

	@OriginalMember(owner = "client!l", name = "E", descriptor = "Lclient!kd;")
	public static Class39 aClass39_858 = aClass39_852;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method1198() {
		if (Static100.anInt2556 > 0) {
			Static25.method460();
		} else {
			Static41.method2108(40);
			Static91.aClass74_4 = Static29.aClass74_1;
			Static29.aClass74_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	public static void method1200() {
		aClass39_855 = null;
		aClass39Array19 = null;
		aClass1_Sub1_Sub4_Sub1Array6 = null;
		aClass39_856 = null;
		aClass62_20 = null;
		aClass62_19 = null;
		aClass31_39 = null;
		aClass39_851 = null;
		aClass39_849 = null;
		aClass1_Sub1_Sub4_Sub4_4 = null;
		aClass39_857 = null;
		aClass39_858 = null;
		aClass39_852 = null;
		aClass39_850 = null;
		aClass39_854 = null;
		aClass39_848 = null;
		aClass39_853 = null;
		anIntArray250 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!ec;")
	public static Class1_Sub1_Sub6 method1202(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub6 local12 = (Class1_Sub1_Sub6) Static123.aClass33_42.method1038((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(29) byte[] local29 = Static129.aClass62_36.method2008(arg0, 5);
		local12 = new Class1_Sub1_Sub6();
		if (local29 != null) {
			local12.method599(new Class1_Sub18(local29));
		}
		Static123.aClass33_42.method1042(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!q;Lclient!kd;ILclient!kd;)Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4 method1204(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) Class39 arg2) {
		@Pc(8) int local8 = arg0.method2015(arg2);
		@Pc(16) int local16 = arg0.method2012(local8, arg1);
		return Static129.method2211(arg0, local16, local8);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	public static void method1205() {
		if (Static71.anInt1792 == 0) {
			return;
		}
		@Pc(14) int local14 = 0;
		if (Static49.anInt1372 != 0) {
			local14 = 1;
		}
		for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
			if (aClass39Array19[local20] != null) {
				@Pc(30) int local30 = Static94.anIntArray338[local20];
				@Pc(34) Class39 local34 = Static16.aClass39Array25[local20];
				if (local34 != null && local34.method1185(Static112.aClass39_1343)) {
					local34 = local34.method1181(5);
				}
				if (local34 != null && local34.method1185(Static38.aClass39_534)) {
					local34 = local34.method1181(5);
				}
				if ((local30 == 3 || local30 == 7) && (local30 == 7 || Static24.anInt816 == 0 || Static24.anInt816 == 1 && Static98.method1718(local34))) {
					@Pc(91) int local91 = 329 - local14 * 13;
					if (Static29.anInt971 > 4 && local91 - 10 < Static3.anInt150 - 4 && Static3.anInt150 - 4 <= local91 + 3) {
						@Pc(143) int local143 = Static93.aClass1_Sub1_Sub4_Sub3_3.method755(Static30.method601(new Class39[] { Static114.aClass39_1372, Static46.aClass39_1329, local34, aClass39Array19[local20] })) + 25;
						if (local143 > 450) {
							local143 = 450;
						}
						if (Static29.anInt971 < local143 + 4) {
							if (Static58.anInt1566 >= 1) {
								Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local34 }), 2008, Static68.aClass39_867, 0, 0, 0);
							}
							Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local34 }), 2053, Static16.aClass39_1220, 0, 0, 0);
							Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local34 }), 2049, Static105.aClass39_1303, 0, 0, 0);
						}
					}
					local14++;
					if (local14 >= 5) {
						return;
					}
				}
				if ((local30 == 5 || local30 == 6) && Static24.anInt816 < 2) {
					local14++;
					if (local14 >= 5) {
						return;
					}
				}
			}
		}
	}
}
