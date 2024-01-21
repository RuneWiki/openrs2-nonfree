import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!nh;")
	public static Class62 aClass62_12;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
	public static final int[] anIntArray91 = new int[2000];

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_357 = Static177.method3050("Art");

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_358 = Static177.method3050("::fpson");

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt1045 = 0;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[J")
	public static final long[] aLongArray14 = new long[500];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BSIJLclient!jd;ILclient!jd;)V")
	public static void method695(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class46 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class46 arg5) {
		if (Static64.aBoolean76 || Static3.anInt86 >= 500) {
			return;
		}
		Static83.aClass46Array15[Static3.anInt86] = arg5;
		Static166.aClass46Array24[Static3.anInt86] = arg3;
		Static11.aShortArray5[Static3.anInt86] = arg0;
		aLongArray14[Static3.anInt86] = arg2;
		Static163.anIntArray370[Static3.anInt86] = arg1;
		Static123.anIntArray280[Static3.anInt86] = arg4;
		Static3.anInt86++;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;)Lclient!jd;")
	public static Class46 method696(@OriginalArg(1) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class46 local18 = new Class46();
		local18.anInt2141 = 0;
		local18.aByteArray20 = local9;
		for (@Pc(26) int local26 = 0; local26 < local9.length; local26++) {
			if (local9[local26] != 0) {
				local9[local18.anInt2141++] = local9[local26];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V")
	public static void method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static65.anInt1716 == 1) {
			Static139.aClass4_Sub1_Sub7_Sub2Array10[Static179.anInt3998 / 100].method2538(Static162.anInt3596 - 8, Static143.anInt3331 + -8);
		}
		if (Static65.anInt1716 == 2) {
			Static139.aClass4_Sub1_Sub7_Sub2Array10[Static179.anInt3998 / 100 + 4].method2538(Static162.anInt3596 - 8, Static143.anInt3331 + -8);
		}
		Static18.method327();
		if (!Static26.aBoolean31) {
			return;
		}
		@Pc(45) int local45 = arg1 + 20;
		@Pc(51) int local51 = arg3 + 512 - 5;
		Static155.aClass4_Sub1_Sub7_Sub1_Sub1_6.method898(Static69.method1482(new Class46[] { Static128.aClass46_1119, Static127.method2240(Static176.anInt3960) }), local51, local45, 16776960, -1);
		@Pc(72) int local72 = local45 + 15;
		@Pc(74) Runtime local74 = Runtime.getRuntime();
		@Pc(83) int local83 = (int) ((local74.totalMemory() - local74.freeMemory()) / 1024L);
		@Pc(85) int local85 = 16776960;
		if (local83 > 32768 && Static103.aBoolean113) {
			local85 = 16711680;
		}
		if (local83 > 65536 && !Static103.aBoolean113) {
			local85 = 16711680;
		}
		Static155.aClass4_Sub1_Sub7_Sub1_Sub1_6.method898(Static69.method1482(new Class46[] { Static45.aClass46_397, Static127.method2240(local83), Static167.aClass46_1366 }), local51, local72, local85, -1);
		local45 = local72 + 15;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!jd;I)Z")
	public static boolean method699(@OriginalArg(0) Class46 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static57.anInt1403; local11++) {
			if (arg0.method1683(Static153.aClass46Array23[local11])) {
				return true;
			}
		}
		return false;
	}
}
