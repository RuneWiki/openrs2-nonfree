import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "[Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3[] aClass5_Sub2_Sub1_Sub3Array33;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	public static int anInt2832;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "Lclient!bf;")
	public static Class5_Sub5_Sub1 aClass5_Sub5_Sub1_2;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_859 = Static129.method2060("(U0a )2 in: ");

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	public static int anInt2840 = 2;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "Lclient!r;")
	public static Class61 aClass61_860 = Static129.method2060("(U3");

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
	public static int method1829(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub2_Sub6 local9 = Static68.method1131(arg0);
		@Pc(12) int local12 = local9.anInt1101;
		@Pc(15) int local15 = local9.anInt1109;
		@Pc(18) int local18 = local9.anInt1104;
		@Pc(30) int local30 = Class44.anIntArray250[local15 - local18];
		return Static83.anIntArray289[local12] >> local18 & local30;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Lclient!mb;")
	public static Class5_Sub2_Sub11 method1830(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub11 local10 = (Class5_Sub2_Sub11) Static121.aClass29_27.method766((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static50.aClass26_5.method1038(10, arg0);
		local10 = new Class5_Sub2_Sub11();
		local10.anInt1965 = arg0;
		if (local20 != null) {
			local10.method1269(new Class5_Sub14(local20));
		}
		local10.method1279();
		if (local10.anInt1943 != -1) {
			local10.method1280(method1830(local10.anInt1943), method1830(local10.anInt1968));
		}
		if (!Static38.aBoolean54 && local10.aBoolean74) {
			local10.anInt1984 = 0;
			local10.aClass61Array14 = null;
			local10.aClass61_597 = Static66.aClass61_499;
			local10.aClass61Array15 = null;
		}
		Static121.aClass29_27.method762(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(JI)Lclient!r;")
	public static Class61 method1831(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			@Pc(53) byte[] local53 = new byte[local35];
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local35--;
				local53[local35] = Static17.aByteArray15[(int) (local57 - arg0 * 37L)];
			}
			@Pc(84) Class61 local84 = new Class61();
			local84.aByteArray38 = local53;
			local84.anInt2675 = local53.length;
			return local84;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method1832() {
		aClass61_859 = null;
		aLongArray6 = null;
		aClass5_Sub5_Sub1_2 = null;
		aClass5_Sub2_Sub1_Sub3Array33 = null;
		aClass61_860 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ff;Lclient!ff;I)V")
	public static void method1833(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1) {
		Static74.aClass26_15 = arg1;
		Static132.aClass26_32 = arg0;
		anInt2832 = Static74.aClass26_15.method1031(3);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!jc;II[B)V")
	public static void method1834(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class5_Sub9 local7 = new Class5_Sub9();
		local7.aLong100 = arg1;
		local7.aByteArray18 = arg2;
		local7.aClass40_1 = arg0;
		local7.anInt946 = 0;
		@Pc(22) Class58 local22 = Static55.aClass58_30;
		synchronized (Static55.aClass58_30) {
			Static55.aClass58_30.method1663(local7);
		}
		Static86.method1534();
	}
}
