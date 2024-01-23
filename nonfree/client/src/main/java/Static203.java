import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!th", name = "P", descriptor = "Lclient!ok;")
	public static Class1_Sub12_Sub3 aClass1_Sub12_Sub3_2;

	@OriginalMember(owner = "client!th", name = "R", descriptor = "Lclient!pa;")
	public static Class86 aClass86_13;

	@OriginalMember(owner = "client!th", name = "T", descriptor = "Z")
	private static boolean aBoolean25;

	@OriginalMember(owner = "client!th", name = "U", descriptor = "Z")
	private static boolean aBoolean26;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!ah;")
	public static Class6 aClass6_2 = new Class6();

	@OriginalMember(owner = "client!th", name = "N", descriptor = "Lclient!hh;")
	private static Class50 aClass50_276 = Static186.method3527("slide:");

	@OriginalMember(owner = "client!th", name = "u", descriptor = "Lclient!hh;")
	public static Class50 aClass50_273 = aClass50_276;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!th", name = "D", descriptor = "Lclient!hh;")
	public static Class50 aClass50_274 = Static186.method3527("p11_full");

	@OriginalMember(owner = "client!th", name = "L", descriptor = "Lclient!hh;")
	public static Class50 aClass50_275 = aClass50_276;

	@OriginalMember(owner = "client!th", name = "O", descriptor = "Lclient!oj;")
	public static Class84 aClass84_14 = new Class84(5);

	@OriginalMember(owner = "client!th", name = "Q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_277 = Static186.method3527("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!hd;B)V")
	public static void method532(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		@Pc(3) int local3 = (int) arg1.aLong173;
		@Pc(10) int local10 = arg1.anInt1588;
		arg1.method3525();
		if (arg0) {
			Static97.method1527(local10);
		}
		Static57.method837(local10);
		@Pc(25) Class93 local25 = Static164.method2725(local3);
		if (local25 != null) {
			Static66.method999(local25);
		}
		Static193.anInt3035 = 0;
		Static40.aBoolean44 = false;
		Static73.method2567(Static143.anInt2913, Static233.anInt4463, Static126.anInt2534, Static15.anInt284);
		if (Static10.anInt204 != -1) {
			Static113.method1839(1, Static10.anInt204);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!bg;B)V")
	public static void method535(@OriginalArg(0) Class1_Sub4 arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(7) int local7 = -1;
		if (arg0.anInt367 == 0) {
			local5 = Static14.method199(arg0.anInt361, arg0.anInt365, arg0.anInt366);
		}
		if (arg0.anInt367 == 1) {
			local5 = Static50.method783(arg0.anInt361, arg0.anInt365, arg0.anInt366);
		}
		if (arg0.anInt367 == 2) {
			local5 = Static26.method382(arg0.anInt361, arg0.anInt365, arg0.anInt366);
		}
		@Pc(47) int local47 = 0;
		if (arg0.anInt367 == 3) {
			local5 = Static64.method988(arg0.anInt361, arg0.anInt365, arg0.anInt366);
		}
		@Pc(65) int local65 = 0;
		if (local5 != 0L) {
			local47 = (int) local5 >> 14 & 0x1F;
			local7 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
			local65 = (int) local5 >> 20 & 0x3;
		}
		arg0.anInt360 = local47;
		arg0.anInt363 = local65;
		arg0.anInt362 = local7;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Lclient!ba;")
	public static Class9 method541(@OriginalArg(0) int arg0) {
		@Pc(15) Class9 local15 = (Class9) Static18.aClass84_10.method2579((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static58.aClass86_20.method3325(1, arg0);
		local15 = new Class9();
		if (local25 != null) {
			local15.method189(arg0, new Class1_Sub17(local25));
		}
		Static18.aClass84_10.method2582(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)V")
	public static void method543(@OriginalArg(1) int arg0) {
		Static181.method2969();
		Static9.method153();
		@Pc(17) int local17 = Static102.method1586(arg0).anInt2181;
		if (local17 == 0) {
			return;
		}
		@Pc(27) int local27 = Static24.anIntArray49[arg0];
		if (local17 == 6) {
			Static77.anInt1555 = local27;
		}
		if (local17 == 5) {
			Static92.anInt1866 = local27;
		}
		if (local17 == 9) {
			Static114.anInt2289 = local27;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!pa;IZ)[Lclient!rh;")
	public static Class78_Sub1[] method545(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		return Static116.method1858(arg1, arg0) ? Static70.method1017() : null;
	}
}
