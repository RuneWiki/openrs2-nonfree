import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "[S")
	public static short[] aShortArray32;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "[B")
	public static byte[] aByteArray31 = new byte[520];

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "[I")
	public static int[] anIntArray241 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "[I")
	public static int[] anIntArray242 = new int[32];

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "Lclient!ic;")
	private static Class34 aClass34_852 = Static56.method816("Your profile will be transferred in:");

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "Lclient!ic;")
	public static Class34 aClass34_853 = Static56.method816("AUS");

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "Lclient!ic;")
	public static Class34 aClass34_854 = Static56.method816("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
	public static int anInt1877 = 0;

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "Lclient!ic;")
	public static Class34 aClass34_855 = Static56.method816("sl_arrows");

	@OriginalMember(owner = "client!mc", name = "Z", descriptor = "[I")
	public static int[] anIntArray244 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_856 = aClass34_852;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method1133(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = Static27.method495(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			System.out.println("Error: " + local5);
			local5 = local5.replace(':', '.');
			local5 = local5.replace('@', '_');
			local5 = local5.replace('&', '_');
			local5 = local5.replace('#', '_');
			if (Static125.aClass40_4.anApplet1 != null) {
				@Pc(104) Class10 local104 = Static125.aClass40_4.method947(new URL(Static125.aClass40_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static113.anInt2573 + "&u=" + Static86.aLong73 + "&v1=" + Static63.aString2 + "&v2=" + Static63.aString3 + "&e=" + local5));
				while (local104.anInt295 == 0) {
					Static107.method1511(1L);
				}
				if (local104.anInt295 == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local104.anObject1;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!pd;[BII)V")
	public static void method1134(@OriginalArg(0) Class61 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub10 local7 = new Class8_Sub10();
		local7.aClass61_2 = arg0;
		local7.anInt1311 = 0;
		local7.aByteArray17 = arg1;
		local7.aLong102 = arg2;
		@Pc(29) Class49 local29 = Static127.aClass49_14;
		synchronized (Static127.aClass49_14) {
			Static127.aClass49_14.method1114(local7);
		}
		Static118.method1650();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
	public static void method1135() {
		for (@Pc(3) int local3 = -1; local3 < Static41.anInt986; local3++) {
			@Pc(13) int local13;
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static29.anIntArray109[local3];
			}
			@Pc(23) Class8_Sub1_Sub1_Sub4_Sub1 local23 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local13];
			if (local23 != null) {
				Static18.method307(local23, 1);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ic;B)V")
	public static void method1136(@OriginalArg(0) Class34 arg0) {
		if (Static24.aClass8_Sub17Array2 == null) {
			return;
		}
		@Pc(18) int local18 = 0;
		@Pc(22) long local22 = arg0.method830();
		if (local22 == 0L) {
			return;
		}
		while (local18 < Static24.aClass8_Sub17Array2.length && Static24.aClass8_Sub17Array2[local18].aLong102 != local22) {
			local18++;
		}
		if (local18 < Static24.aClass8_Sub17Array2.length && Static24.aClass8_Sub17Array2[local18] != null) {
			Static106.aClass8_Sub20_Sub1_3.method1907(219);
			Static106.aClass8_Sub20_Sub1_3.method1879(Static24.aClass8_Sub17Array2[local18].aLong102);
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1138() {
		for (@Pc(10) Class8_Sub7 local10 = (Class8_Sub7) Static31.aClass7_3.method47(); local10 != null; local10 = (Class8_Sub7) Static31.aClass7_3.method46()) {
			@Pc(15) int local15 = local10.anInt954;
			if (Static100.method1458(local15)) {
				@Pc(21) boolean local21 = true;
				@Pc(25) Class8_Sub24[] local25 = Static44.aClass8_Sub24ArrayArray1[local15];
				for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
					if (local25[local27] != null) {
						local21 = local25[local27].aBoolean117;
						break;
					}
				}
				if (!local21) {
					@Pc(51) int local51 = (int) local10.aLong102;
					@Pc(55) Class8_Sub24 local55 = Static113.method1614(local51);
					if (local55 != null) {
						Static40.method608(local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
	public static void method1139() {
		aClass34_856 = null;
		aByteArray31 = null;
		aClass34_852 = null;
		anIntArray242 = null;
		aShortArray32 = null;
		aClass34_853 = null;
		aClass34_855 = null;
		aClass34_854 = null;
		anIntArray244 = null;
		anIntArray241 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)V")
	public static void method1140(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static62.anInt1593; local14++) {
			if (Static77.aLongArray3[local14] == arg0) {
				Static62.anInt1593--;
				for (@Pc(32) int local32 = local14; local32 < Static62.anInt1593; local32++) {
					Static93.aClass34Array16[local32] = Static93.aClass34Array16[local32 + 1];
					Static83.anIntArray266[local32] = Static83.anIntArray266[local32 + 1];
					Static77.aLongArray3[local32] = Static77.aLongArray3[local32 + 1];
					Static21.anIntArray70[local32] = Static21.anIntArray70[local32 + 1];
				}
				Static108.anInt2491 = Static86.anInt2177;
				Static106.aClass8_Sub20_Sub1_3.method1907(211);
				Static106.aClass8_Sub20_Sub1_3.method1879(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)V")
	public static void method1141() {
		Static50.aClass3_1.method1484();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static127.aLongArray7[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static111.aLongArray8[local24] = 0L;
		}
		Static62.anInt1589 = 0;
	}
}
