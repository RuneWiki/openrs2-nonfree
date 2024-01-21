import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_5;

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "[[I")
	public static int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
	public static int anInt1457;

	@OriginalMember(owner = "client!ia", name = "mb", descriptor = "[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array4;

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "Lclient!lc;")
	public static Class31 aClass31_531 = Static56.method1206("");

	@OriginalMember(owner = "client!ia", name = "X", descriptor = "Lclient!lc;")
	public static Class31 aClass31_532 = Static56.method1206("Nov");

	@OriginalMember(owner = "client!ia", name = "db", descriptor = "Lclient!lc;")
	public static Class31 aClass31_533 = Static56.method1206("Enter name of player to delete from list");

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_534 = aClass31_531;

	@OriginalMember(owner = "client!ia", name = "hb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_535 = Static56.method1206(" has logged in)3");

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "Lclient!lc;")
	public static Class31 aClass31_536 = Static56.method1206("redstone2");

	@OriginalMember(owner = "client!ia", name = "jb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_537 = aClass31_531;

	@OriginalMember(owner = "client!ia", name = "kb", descriptor = "I")
	public static volatile int anInt1458 = 0;

	@OriginalMember(owner = "client!ia", name = "lb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_538 = aClass31_531;

	@OriginalMember(owner = "client!ia", name = "nb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_539 = Static56.method1206("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ia", name = "ob", descriptor = "Lclient!lc;")
	public static Class31 aClass31_540 = Static56.method1206("Public chat");

	@OriginalMember(owner = "client!ia", name = "pb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_541 = aClass31_531;

	@OriginalMember(owner = "client!ia", name = "qb", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!ia", name = "rb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_542 = aClass31_531;

	@OriginalMember(owner = "client!ia", name = "tb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_543 = aClass31_531;

	@OriginalMember(owner = "client!ia", name = "vb", descriptor = "I")
	public static int anInt1462 = 0;

	@OriginalMember(owner = "client!ia", name = "wb", descriptor = "[I")
	public static int[] anIntArray232 = new int[50];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII[Lclient!vb;III[BI)V")
	public static void method1005(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class60[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (local3 + arg1 > 0 && arg1 + local3 < 103 && local7 + arg2 > 0 && arg2 + local7 < 103) {
					arg3[arg8].anIntArrayArray69[local3 + arg1][local7 + arg2] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(76) Class2_Sub6 local76 = new Class2_Sub6(arg7);
		for (@Pc(78) int local78 = 0; local78 < 4; local78++) {
			for (@Pc(82) int local82 = 0; local82 < 64; local82++) {
				for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
					if (local78 == arg6 && local82 >= arg5 && arg5 + 8 > local82 && local86 >= arg4 && local86 < arg4 + 8) {
						Static47.method1105(0, local76, 0, Static14.method426(arg0, local82 & 0x7, local86 & 0x7) + arg1, arg0, arg8, arg2 + Static14.method419(local86 & 0x7, arg0, local82 & 0x7));
					} else {
						Static47.method1105(0, local76, 0, -1, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Lclient!le;")
	public static Class2_Sub1_Sub9 method1006(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub1_Sub9 local6 = (Class2_Sub1_Sub9) Static19.aClass17_34.method786((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static90.aClass11_21.method338(16, arg0);
		local6 = new Class2_Sub1_Sub9();
		if (local25 != null) {
			local6.method1246(new Class2_Sub6(local25));
		}
		Static19.aClass17_34.method783(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)Z")
	public static boolean method1008(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method1009() {
		aClass31_542 = null;
		aClass31_534 = null;
		aClass31_540 = null;
		aClass31_535 = null;
		aClass31_538 = null;
		aClass31_532 = null;
		aClass31_543 = null;
		aClass31_533 = null;
		anIntArray232 = null;
		aClass31_539 = null;
		aClass31_536 = null;
		aClass31_531 = null;
		aClass2_Sub1_Sub3_Sub2_5 = null;
		aClass2_Sub1_Sub3_Sub2Array4 = null;
		anIntArrayArray49 = null;
		aClass31_537 = null;
		aClass31_541 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IJ)Lclient!lc;")
	public static Class31 method1010(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) long local27 = arg0;
			@Pc(29) int local29 = 0;
			while (local27 != 0L) {
				local29++;
				local27 /= 37L;
			}
			@Pc(43) byte[] local43 = new byte[local29];
			while (arg0 != 0L) {
				@Pc(47) long local47 = arg0;
				arg0 /= 37L;
				local29--;
				local43[local29] = Static41.aByteArray14[(int) (local47 - arg0 * 37L)];
			}
			@Pc(79) Class31 local79 = new Class31();
			local79.aByteArray17 = local43;
			local79.anInt1901 = local43.length;
			return local79;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(BI)V")
	public static void method1011(@OriginalArg(1) int arg0) {
		Static79.method1435(arg0);
	}
}
