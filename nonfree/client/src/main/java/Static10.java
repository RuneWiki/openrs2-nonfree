import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array10;

	@OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
	public static int anInt2576;

	@OriginalMember(owner = "client!bd", name = "Z", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "J")
	public static long aLong82 = 0L;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "[I")
	public static int[] anIntArray317 = new int[1000];

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!cb;")
	public static Class11 aClass11_25 = new Class11(260);

	@OriginalMember(owner = "client!bd", name = "T", descriptor = "Lclient!a;")
	public static Class1 aClass1_2677 = Static94.method1596("backbase2");

	@OriginalMember(owner = "client!bd", name = "U", descriptor = "Lclient!a;")
	private static Class1 aClass1_2678 = Static94.method1596("Please try again)3");

	@OriginalMember(owner = "client!bd", name = "V", descriptor = "Lclient!a;")
	public static Class1 aClass1_2679 = aClass1_2678;

	@OriginalMember(owner = "client!bd", name = "W", descriptor = "Lclient!a;")
	public static Class1 aClass1_2680 = Static94.method1596("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!bd", name = "X", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void method1681(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static90.method1571(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			@Pc(102) Class18 local102 = Static67.aClass34_6.method1256(new URL(Static67.aClass34_6.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static68.anInt1942 + "&u=" + Static62.aLong62 + "&v1=" + Static58.aString5 + "&v2=" + Static58.aString7 + "&e=" + local7));
			while (local102.anInt1028 == 0) {
				Static72.method1367(1L);
			}
			if (local102.anInt1028 == 1) {
				@Pc(123) DataInputStream local123 = (DataInputStream) local102.anObject3;
				local123.read();
				local123.close();
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method1692() {
		aClass1_2680 = null;
		aClass2_Sub1_Sub2_Sub2Array10 = null;
		aClass1_2677 = null;
		aClass11_25 = null;
		aClass1_2678 = null;
		anIntArray317 = null;
		anIntArrayArrayArray8 = null;
		aClass1_2679 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([BI)V")
	public static void method1696(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg0);
		local10.anInt1168 = arg0.length - 2;
		Static64.anInt1927 = local10.method792();
		Static67.anIntArray342 = new int[Static64.anInt1927];
		Static94.aByteArrayArray8 = new byte[Static64.anInt1927][];
		Static27.anIntArray113 = new int[Static64.anInt1927];
		Static109.anIntArray347 = new int[Static64.anInt1927];
		Static93.anIntArray293 = new int[Static64.anInt1927];
		local10.anInt1168 = arg0.length - Static64.anInt1927 * 8 - 7;
		Static96.anInt2462 = local10.method792();
		Static55.anInt757 = local10.method792();
		@Pc(62) int local62 = (local10.method791() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static64.anInt1927; local64++) {
			Static93.anIntArray293[local64] = local10.method792();
		}
		for (@Pc(82) int local82 = 0; local82 < Static64.anInt1927; local82++) {
			Static67.anIntArray342[local82] = local10.method792();
		}
		for (@Pc(98) int local98 = 0; local98 < Static64.anInt1927; local98++) {
			Static27.anIntArray113[local98] = local10.method792();
		}
		for (@Pc(112) int local112 = 0; local112 < Static64.anInt1927; local112++) {
			Static109.anIntArray347[local112] = local10.method792();
		}
		local10.anInt1168 = arg0.length + 3 - Static64.anInt1927 * 8 - local62 * 3 - 7;
		Static7.anIntArray121 = new int[local62];
		for (@Pc(145) int local145 = 1; local145 < local62; local145++) {
			Static7.anIntArray121[local145] = local10.method811();
			if (Static7.anIntArray121[local145] == 0) {
				Static7.anIntArray121[local145] = 1;
			}
		}
		local10.anInt1168 = 0;
		for (@Pc(174) int local174 = 0; local174 < Static64.anInt1927; local174++) {
			@Pc(180) int local180 = Static109.anIntArray347[local174];
			@Pc(184) int local184 = Static27.anIntArray113[local174];
			@Pc(188) int local188 = local180 * local184;
			@Pc(191) byte[] local191 = new byte[local188];
			Static94.aByteArrayArray8[local174] = local191;
			@Pc(199) int local199 = local10.method791();
			@Pc(211) int local211;
			if (local199 == 0) {
				for (local211 = 0; local211 < local188; local211++) {
					local191[local211] = local10.method831();
				}
			} else if (local199 == 1) {
				for (local211 = 0; local211 < local184; local211++) {
					for (@Pc(215) int local215 = 0; local215 < local180; local215++) {
						local191[local184 * local215 + local211] = local10.method831();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method1700() {
		Static41.aClass11_13.method435();
		Static71.aClass11_16.method435();
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
	public static void method1701() {
		Static88.aClass11_21.method435();
	}
}
