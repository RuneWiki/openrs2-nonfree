import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!ae;")
	public static Class5 aClass5_606 = Static56.method972("");

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public static int anInt1278 = 0;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "Lclient!ae;")
	private static Class5 aClass5_613 = Static56.method972("wishes to trade with you)3");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!ae;")
	public static Class5 aClass5_607 = aClass5_613;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "J")
	public static long aLong44 = 0L;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!ae;")
	private static Class5 aClass5_609 = Static56.method972("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_608 = aClass5_609;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[5][5000];

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	public static int anInt1282 = 0;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public static int anInt1283 = 0;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "Lclient!ae;")
	public static Class5 aClass5_610 = Static56.method972(" x ");

	@OriginalMember(owner = "client!id", name = "p", descriptor = "I")
	public static int anInt1284 = 0;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_611 = Static56.method972("backbase2");

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_612 = Static56.method972(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	public static final int anInt1286 = 50;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method855() {
		aClass3_Sub1_Sub2_Sub4_4 = null;
		aClass5_610 = null;
		aClass5_612 = null;
		aClass5_609 = null;
		aClass5_613 = null;
		aClass5_608 = null;
		aClass5_611 = null;
		aClass5_607 = null;
		anIntArrayArray11 = null;
		aClass5_606 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)Lclient!ae;")
	public static Class5 method856() {
		@Pc(7) Class5 local7 = new Class5();
		local7.anInt311 = 0;
		local7.aByteArray1 = new byte[100];
		return local7;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method857() {
		for (@Pc(3) int local3 = -1; local3 < Static38.anInt1056; local3++) {
			@Pc(15) int local15;
			if (local3 == -1) {
				local15 = 2047;
			} else {
				local15 = Static1.anIntArray6[local3];
			}
			@Pc(25) Class3_Sub1_Sub1_Sub1_Sub2 local25 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local15];
			if (local25 != null) {
				Static27.method543(local25, 1);
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I")
	public static int method858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		return Static108.aClass3_Sub1_Sub5_1 != null && Static108.aClass3_Sub1_Sub5_1.aLong85 == local10 ? Static64.aClass3_Sub6_5.anInt2416 * 99 / (Static64.aClass3_Sub6_5.aByteArray17.length - Static108.aClass3_Sub1_Sub5_1.aByte3) + 1 : 0;
	}
}
