import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public static int anInt3373;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	public static int anInt3382;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1150 = Static161.method2971("Close");

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1151 = Static161.method2971("au");

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
	public static int anInt3377 = 0;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1152 = aClass13_1150;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1153 = Static161.method2971("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray29 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "[I")
	public static int[] anIntArray332 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(JZ)V")
	public static void method2422(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(26) int local26 = 0; local26 < Static21.anInt784; local26++) {
			if (Static149.aLongArray8[local26] == arg0) {
				Static21.anInt784--;
				for (@Pc(48) int local48 = local26; local48 < Static21.anInt784; local48++) {
					Static34.aClass13Array7[local48] = Static34.aClass13Array7[local48 + 1];
					Static162.anIntArray427[local48] = Static162.anIntArray427[local48 + 1];
					Static60.aClass13Array16[local48] = Static60.aClass13Array16[local48 + 1];
					Static149.aLongArray8[local48] = Static149.aLongArray8[local48 + 1];
					Static39.anIntArray133[local48] = Static39.anIntArray133[local48 + 1];
				}
				Static88.anInt2490 = Static10.anInt388;
				Static1.aClass1_Sub8_Sub1_1.method1654(161);
				Static1.aClass1_Sub8_Sub1_1.method1625(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[BI)Lclient!dd;")
	public static Class13 method2423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(9) Class13 local9 = new Class13();
		local9.aByteArray19 = new byte[arg1];
		local9.anInt1080 = 0;
		for (@Pc(23) int local23 = arg0; local23 < arg0 + arg1; local23++) {
			if (arg2[local23] != 0) {
				local9.aByteArray19[local9.anInt1080++] = arg2[local23];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public static void method2424() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class35 local3 = new Class35();
		local3.anInt1992 = arg2 / 128;
		local3.anInt2005 = arg3 / 128;
		local3.anInt1989 = arg4 / 128;
		local3.anInt1996 = arg5 / 128;
		local3.anInt1998 = arg1;
		local3.anInt1999 = arg2;
		local3.anInt1986 = arg3;
		local3.anInt2002 = arg4;
		local3.anInt2001 = arg5;
		local3.anInt1993 = arg6;
		local3.anInt1985 = arg7;
		Static125.aClass35ArrayArray1[arg0][Static125.anIntArray309[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	public static void method2426() {
		aClass13_1150 = null;
		aClass13_1153 = null;
		aClass13_1151 = null;
		aClass13_1152 = null;
		anIntArray332 = null;
		anIntArrayArray29 = null;
	}
}
