import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!h", name = "M", descriptor = "Lclient!qa;")
	public static Class61 aClass61_30;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "Z")
	public static boolean aBoolean250;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "Lclient!sb;")
	public static Class25 aClass25_152;

	@OriginalMember(owner = "client!h", name = "P", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_46;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1574 = Static75.method1216("@or2@");

	@OriginalMember(owner = "client!h", name = "V", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1578 = Static75.method1216("wave2:");

	@OriginalMember(owner = "client!h", name = "I", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1575 = aClass4_1578;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray36 = new int[4][105][105];

	@OriginalMember(owner = "client!h", name = "K", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1576 = Static75.method1216("(Y");

	@OriginalMember(owner = "client!h", name = "L", descriptor = "I")
	public static int anInt2802 = 0;

	@OriginalMember(owner = "client!h", name = "T", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1577 = Static75.method1216("(Z");

	@OriginalMember(owner = "client!h", name = "U", descriptor = "[J")
	public static long[] aLongArray35 = new long[32];

	@OriginalMember(owner = "client!h", name = "W", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1579 = Static75.method1216("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1580 = Static75.method1216("Freunde");

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	public static void method1907() {
		aClass3_Sub1_Sub4_Sub3_46 = null;
		aClass25_152 = null;
		aClass4_1578 = null;
		aClass61_30 = null;
		aClass4_1580 = null;
		anIntArrayArrayArray36 = null;
		aClass4_1575 = null;
		aClass4_1574 = null;
		aLongArray35 = null;
		aClass4_1576 = null;
		aClass4_1577 = null;
		aClass4_1579 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BIII)I")
	public static int method1908(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public static void method1910() {
		if (Static8.aClass30_1 == null) {
			return;
		}
		Static9.method200();
		if (Static9.anInt310 > 0) {
			Static8.aClass30_1.method1873(256);
			Static9.anInt310 = 0;
		}
		Static8.aClass30_1.method1881();
		Static8.aClass30_1 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)Lclient!ld;")
	public static Class3_Sub1_Sub5 method1911(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub1_Sub5 local15 = (Class3_Sub1_Sub5) Static5.aClass8_2.method195((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static54.aClass64_38.method1625(6, arg0);
		local15 = new Class3_Sub1_Sub5();
		local15.anInt1512 = arg0;
		if (local25 != null) {
			local15.method1037(new Class3_Sub4(local25));
		}
		local15.method1026();
		if (local15.aBoolean110) {
			local15.aBoolean113 = false;
			local15.aBoolean116 = false;
		}
		Static5.aClass8_2.method199((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IBLclient!rd;II)[B")
	public static byte[] method1912(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(33) long local33 = (long) (arg2 * 37 + arg3 & 0xFFFF) + ((long) arg0 << 32) + (long) (arg2 << 16);
		if (Static20.aClass8_7 != null) {
			@Pc(41) Class3_Sub1_Sub10 local41 = (Class3_Sub1_Sub10) Static20.aClass8_7.method195(local33);
			if (local41 != null) {
				return local41.aByteArray20;
			}
		}
		@Pc(52) byte[] local52 = arg1.method1625(arg2, arg3);
		if (local52 == null) {
			return null;
		} else {
			if (Static20.aClass8_7 != null) {
				Static20.aClass8_7.method199(local33, new Class3_Sub1_Sub10(local52));
			}
			return local52;
		}
	}
}
