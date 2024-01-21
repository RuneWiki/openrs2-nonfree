import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public static int anInt1819;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!wd;")
	private static Class80 aClass80_676 = Static2.method59("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!wd;")
	private static Class80 aClass80_682 = Static2.method59("Enter name:");

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_677 = aClass80_682;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	public static int anInt1820 = 0;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!wd;")
	public static Class80 aClass80_678 = Static2.method59("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_679 = Static2.method59("");

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_680 = aClass80_676;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_681 = Static2.method59("@or2@");

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "[Lclient!de;")
	public static Class2_Sub1_Sub1_Sub6[] aClass2_Sub1_Sub1_Sub6Array1 = new Class2_Sub1_Sub1_Sub6[4];

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
	public static int anInt1824 = 0;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([BLclient!pb;II)V")
	public static void method1078(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class2_Sub12 local3 = new Class2_Sub12();
		local3.aLong91 = arg2;
		local3.aClass60_4 = arg1;
		local3.anInt1981 = 0;
		local3.aByteArray28 = arg0;
		@Pc(22) Class58 local22 = Static63.aClass58_8;
		synchronized (Static63.aClass58_8) {
			Static63.aClass58_8.method1294(local3);
		}
		Static43.method708();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)I")
	public static int method1079(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			arg0--;
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public static void method1080() {
		aClass2_Sub1_Sub1_Sub6Array1 = null;
		aClass80_677 = null;
		aClass80_676 = null;
		aClass80_680 = null;
		aLongArray5 = null;
		aClass80_682 = null;
		anIntArray225 = null;
		aClass80_681 = null;
		aClass80_679 = null;
		aClass80_678 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)I")
	public static int method1081(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(23) int local23 = local12 | local12 >>> 4;
		@Pc(29) int local29 = local23 | local23 >>> 8;
		@Pc(39) int local39 = local29 | local29 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!wd;Lclient!ff;Lclient!wd;B)Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1 method1082(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class80 arg2) {
		@Pc(13) int local13 = arg1.method378(arg0);
		@Pc(19) int local19 = arg1.method391(local13, arg2);
		return Static95.method1458(arg1, local13, local19);
	}
}
