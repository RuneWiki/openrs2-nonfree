import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
	public static int anInt5433;

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "Lclient!fg;")
	public static Class1_Sub2_Sub6 aClass1_Sub2_Sub6_4;

	@OriginalMember(owner = "client!wd", name = "xb", descriptor = "I")
	public static int anInt5466;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!wd", name = "X", descriptor = "J")
	public static long aLong206 = 0L;

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString332 = "Loaded world list data";

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!nk;I)Lclient!ch;")
	public static Class1_Sub2_Sub1_Sub2 method4636(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1) {
		return Static31.method501(arg1, arg0) ? Static275.method4270() : null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method4640(@OriginalArg(1) long arg0) {
		return Static8.method120(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!jh;Lclient!nk;Lclient!nk;ZI)V")
	public static void method4643(@OriginalArg(0) Class1_Sub2_Sub6_Sub1 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class121 arg2) {
		Static92.aBoolean375 = true;
		Static222.aClass121_95 = arg1;
		Static175.aClass121_83 = arg2;
		@Pc(15) int local15 = Static175.aClass121_83.method3137() - 1;
		Static131.anInt2608 = Static175.aClass121_83.method3125(local15) + local15 * 256;
		Static92.aStringArray40 = new String[] { null, null, Static199.aString212, null, null };
		Static232.aStringArray31 = new String[] { null, null, null, null, Static63.aString183 };
		Static81.aClass1_Sub2_Sub6_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(II)Lclient!cb;")
	public static Class20 method4654(@OriginalArg(1) int arg0) {
		@Pc(10) Class20 local10 = (Class20) Static36.aClass187_22.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static102.aClass121_51.method3115(34, arg0);
		local10 = new Class20();
		if (local22 != null) {
			local10.method508(arg0, new Class1_Sub14(local22));
		}
		Static36.aClass187_22.method4524((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(JZIIB)Ljava/lang/String;")
	public static String method4662(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) char local9 = '.';
		@Pc(11) char local11 = ',';
		if (arg3 == 0) {
			local9 = ',';
			local11 = '.';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(32) boolean local32 = false;
		@Pc(37) StringBuffer local37 = new StringBuffer(26);
		if (arg0 < 0L) {
			arg0 = -arg0;
			local32 = true;
		}
		@Pc(53) int local53;
		@Pc(63) int local63;
		if (arg2 > 0) {
			for (local53 = 0; local53 < arg2; local53++) {
				local63 = (int) arg0;
				arg0 /= 10L;
				local37.append((char) (local63 + 48 - (int) arg0 * 10));
			}
			local37.append(local11);
		}
		local53 = 0;
		while (true) {
			local63 = (int) arg0;
			arg0 /= 10L;
			local37.append((char) (local63 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local32) {
					local37.append('-');
				}
				return local37.reverse().toString();
			}
			if (arg1) {
				local53++;
				if (local53 % 3 == 0) {
					local37.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIII)Z")
	public static boolean method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static12.method165(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static154.method2639(local10 + 1, Static24.anIntArrayArrayArray2[arg0][arg1][arg2] + arg3, local14 + 1) && Static154.method2639(local10 + 128 - 1, Static24.anIntArrayArrayArray2[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static154.method2639(local10 + 128 - 1, Static24.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static154.method2639(local10 + 1, Static24.anIntArrayArrayArray2[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
