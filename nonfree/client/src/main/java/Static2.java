import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
	public static int anInt66;

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_35 = method66("backhmid2");

	@OriginalMember(owner = "client!aa", name = "db", descriptor = "Lclient!ke;")
	public static Class39 aClass39_36 = method66("(U5");

	@OriginalMember(owner = "client!aa", name = "qb", descriptor = "Lclient!qd;")
	public static Class54 aClass54_1 = new Class54(64);

	@OriginalMember(owner = "client!aa", name = "rb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_37 = method66("@gr2@");

	@OriginalMember(owner = "client!aa", name = "xb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_38 = method66(" more options");

	@OriginalMember(owner = "client!aa", name = "Ab", descriptor = "[I")
	public static int[] anIntArray9 = new int[5];

	@OriginalMember(owner = "client!aa", name = "Bb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_39 = aClass39_38;

	@OriginalMember(owner = "client!aa", name = "Eb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_41 = method66("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!aa", name = "Db", descriptor = "Lclient!ke;")
	public static Class39 aClass39_40 = aClass39_41;

	@OriginalMember(owner = "client!aa", name = "Fb", descriptor = "I")
	public static int anInt90 = 0;

	@OriginalMember(owner = "client!aa", name = "Gb", descriptor = "I")
	public static int anInt91 = 0;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
	public static void method50() {
		aClass39_35 = null;
		aClass39_36 = null;
		aClass39_38 = null;
		aClass39_40 = null;
		anIntArray9 = null;
		aClass39_41 = null;
		aClass39_39 = null;
		aClass54_1 = null;
		aClass39_37 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZLclient!jd;Lclient!jd;Z)Lclient!ua;")
	public static Class2_Sub1_Sub16 method51(@OriginalArg(0) int arg0, @OriginalArg(2) Class36 arg1, @OriginalArg(3) Class36 arg2) {
		@Pc(10) int[] local10 = arg1.method1762(arg0);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(24) byte[] local24 = arg1.method1767(arg0, local10[local14]);
			if (local24 == null) {
				local12 = false;
			} else {
				@Pc(44) int local44 = (local24[0] & 0xFF) << 8 | local24[1] & 0xFF;
				@Pc(52) byte[] local52 = arg2.method1767(local44, 0);
				if (local52 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub16(arg1, arg2, arg0, false);
		} catch (@Pc(86) Exception local86) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	public static void method52() {
		for (@Pc(3) int local3 = 0; local3 < Static95.anInt2510; local3++) {
			@Pc(9) int local9 = Static50.anIntArray193[local3];
			@Pc(13) Class2_Sub1_Sub2_Sub3_Sub2 local13 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local9];
			if (local13 != null) {
				Static39.method819(local13.aClass2_Sub1_Sub8_1.anInt1369, local13);
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(B)V")
	public static void method55() {
		Static49.anInt1373 = 0;
		@Pc(8) int local8 = Static75.anInt454 + (Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 >> 7);
		@Pc(28) int local28 = (Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 >> 7) + Static19.anInt575;
		if (local28 >= 3053 && local28 <= 3156 && local8 >= 3056 && local8 <= 3136) {
			Static49.anInt1373 = 1;
		}
		if (local28 >= 3072 && local28 <= 3118 && local8 >= 9492 && local8 <= 9535) {
			Static49.anInt1373 = 1;
		}
		if (Static49.anInt1373 == 1 && local28 >= 3139 && local28 <= 3199 && local8 >= 3008 && local8 <= 3062) {
			Static49.anInt1373 = 0;
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
	public static void method56() {
		if (Static85.aClass10_3 != null) {
			Static85.aClass10_3.method251();
			Static85.aClass10_3 = null;
		}
		Static41.method831();
		Static77.aClass43_1.method1208();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static5.aClass47Array1[local18].method1458();
		}
		System.gc();
		Static73.method1498();
		Static38.anInt1156 = -1;
		Static31.anInt1773 = 0;
		Static60.method1125();
		Static60.method1127(10);
	}

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "(B)V")
	public static void method59() {
		for (@Pc(10) Class2_Sub10 local10 = (Class2_Sub10) Static12.aClass34_9.method872(); local10 != null; local10 = (Class2_Sub10) Static12.aClass34_9.method879()) {
			if (local10.aClass2_Sub1_Sub5_1 != null) {
				local10.method1490();
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I")
	public static int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static96.aByteArrayArrayArray8[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static96.aByteArrayArrayArray8[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lclient!md;")
	public static Class2_Sub1_Sub11 method65(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub11 local10 = (Class2_Sub1_Sub11) Static55.aClass54_14.method1634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static6.aClass36_75.method1761(16, arg0);
		local10 = new Class2_Sub1_Sub11();
		if (local20 != null) {
			local10.method1358(new Class2_Sub5(local20));
		}
		Static55.aClass54_14.method1637((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ke;")
	public static Class39 method66(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(16) int local16 = 0;
		@Pc(20) Class39 local20 = new Class39();
		local20.aByteArray13 = new byte[local9];
		while (local9 > local16) {
			@Pc(32) int local32 = local6[local16++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local9 <= local16) {
					break;
				}
				@Pc(65) int local65 = local6[local16++] & 0xFF;
				local20.aByteArray13[local20.anInt1601++] = (byte) (local65 + (local32 + -40) * 43 - 48);
			} else {
				local20.aByteArray13[local20.anInt1601++] = (byte) local32;
			}
		}
		local20.method1096();
		return local20.method1108();
	}
}
