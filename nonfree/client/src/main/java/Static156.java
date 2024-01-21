import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!tc", name = "S", descriptor = "[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array10;

	@OriginalMember(owner = "client!tc", name = "lb", descriptor = "I")
	public static int anInt3422;

	@OriginalMember(owner = "client!tc", name = "db", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1521 = Static32.method683("slide:");

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1518 = aClass49_1521;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
	public static int anInt3412 = 255;

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "[S")
	public static short[] aShortArray38 = new short[] { 48, 5, 22, 38, 11, 18, 33, 57 };

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1519 = Static32.method683("Close");

	@OriginalMember(owner = "client!tc", name = "rb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1529 = Static32.method683(" is already on your ignore list)3");

	@OriginalMember(owner = "client!tc", name = "bb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1520 = aClass49_1529;

	@OriginalMember(owner = "client!tc", name = "eb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1522 = Static32.method683("::fps ");

	@OriginalMember(owner = "client!tc", name = "gb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1523 = aClass49_1519;

	@OriginalMember(owner = "client!tc", name = "ib", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1524 = Static32.method683("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!tc", name = "mb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1525 = aClass49_1524;

	@OriginalMember(owner = "client!tc", name = "nb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1526 = aClass49_1521;

	@OriginalMember(owner = "client!tc", name = "ob", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1527 = Static32.method683("blinken2:");

	@OriginalMember(owner = "client!tc", name = "pb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1528 = Static32.method683(":clan:");

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(III)V")
	public static void method2641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt15; local12++) {
			@Pc(18) Class22 local18 = local7.aClass22Array1[local12];
			if ((local18.aLong41 >> 29 & 0x3L) == 2L && local18.anInt1000 == arg1 && local18.anInt988 == arg2) {
				Static140.method2338(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(III)J")
	public static long method2642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt15; local13++) {
			@Pc(19) Class22 local19 = local7.aClass22Array1[local13];
			if ((local19.aLong41 >> 29 & 0x3L) == 2L && local19.anInt1000 == arg1 && local19.anInt988 == arg2) {
				return local19.aLong41;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)V")
	public static void method2643() {
		aShortArray38 = null;
		aClass49_1521 = null;
		aClass49_1520 = null;
		aClass49_1523 = null;
		aClass2_Sub2_Sub2_Sub3Array10 = null;
		aClass49_1527 = null;
		aClass49_1519 = null;
		aClass49_1528 = null;
		aClass49_1525 = null;
		aClass49_1518 = null;
		aClass49_1529 = null;
		aClass49_1526 = null;
		aClass49_1524 = null;
		aClass49_1522 = null;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)Z")
	public static boolean method2644(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)V")
	public static void method2645() {
		Static54.aClass74_34.method2347();
		Static131.aClass74_93.method2347();
		Static41.aClass74_31.method2347();
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(B)[Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2[] method2648() {
		@Pc(13) Class2_Sub2_Sub2_Sub2[] local13 = new Class2_Sub2_Sub2_Sub2[Static116.anInt2433];
		for (@Pc(15) int local15 = 0; local15 < Static116.anInt2433; local15++) {
			@Pc(21) Class2_Sub2_Sub2_Sub2 local21 = new Class2_Sub2_Sub2_Sub2();
			local21.anInt880 = Static103.anInt2179;
			local21.anInt883 = Static148.anInt3150;
			local21.anInt879 = Static142.anIntArray282[local15];
			local21.anInt882 = Static178.anIntArray364[local15];
			local21.anInt878 = Static20.anIntArray41[local15];
			local21.anInt881 = Static63.anIntArray165[local15];
			local21.anIntArray79 = Static47.anIntArray105;
			local21.aByteArray11 = Static9.aByteArrayArray1[local15];
			local13[local15] = local21;
		}
		Static63.method1094();
		return local13;
	}
}
