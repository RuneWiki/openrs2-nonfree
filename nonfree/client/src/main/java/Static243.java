import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "[J")
	public static long[] aLongArray13 = new long[100];

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "[I")
	public static int[] anIntArray427 = new int[100];

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "Lclient!an;")
	public static Class10 aClass10_52 = new Class10();

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
	public static volatile int anInt4643 = -1;

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
	public static int anInt4645 = 0;

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
	public static int anInt4648 = 0;

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
	public static int anInt4649 = 0;

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString158 = "purple:";

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIB)V")
	public static void method3712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg0 << 1;
		@Pc(21) int local21 = arg0 * arg0;
		@Pc(25) int local25 = local13 << 1;
		@Pc(34) int local34 = local21 - local25 * (local17 - 1);
		@Pc(42) int local42 = local21 << 2;
		@Pc(46) int local46 = local13 << 2;
		@Pc(54) int local54 = ((arg0 << 1) - 3) * local25;
		@Pc(58) int local58 = local21 << 1;
		@Pc(66) int local66 = local58 * 3;
		@Pc(75) int local75 = local58 + (1 - local17) * local13;
		@Pc(81) int local81 = (arg0 - 1) * local46;
		@Pc(100) int local100;
		@Pc(109) int local109;
		if (arg2 >= Static171.anInt3392 && arg2 <= Static141.anInt2889) {
			local100 = Static142.method2311(arg1 + arg3, Static154.anInt3126, Static211.anInt4200);
			local109 = Static142.method2311(arg1 - arg3, Static154.anInt3126, Static211.anInt4200);
			Static129.method2127(local100, local109, arg4, Static234.anIntArrayArray40[arg2]);
		}
		@Pc(123) int local123 = local42;
		while (local9 > 0) {
			local9--;
			local100 = arg2 - local9;
			if (local75 < 0) {
				while (local75 < 0) {
					local34 += local123;
					local75 += local66;
					local7++;
					local66 += local42;
					local123 += local42;
				}
			}
			local109 = arg2 + local9;
			if (local34 < 0) {
				local75 += local66;
				local7++;
				local34 += local123;
				local66 += local42;
				local123 += local42;
			}
			local75 += -local81;
			if (local109 >= Static171.anInt3392 && local100 <= Static141.anInt2889) {
				@Pc(212) int local212 = Static142.method2311(arg1 + local7, Static154.anInt3126, Static211.anInt4200);
				@Pc(220) int local220 = Static142.method2311(arg1 - local7, Static154.anInt3126, Static211.anInt4200);
				if (local100 >= Static171.anInt3392) {
					Static129.method2127(local212, local220, arg4, Static234.anIntArrayArray40[local100]);
				}
				if (Static141.anInt2889 >= local109) {
					Static129.method2127(local212, local220, arg4, Static234.anIntArrayArray40[local109]);
				}
			}
			local81 -= local46;
			local34 += -local54;
			local54 -= local46;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)Lclient!vn;")
	public static Class178 method3713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(27) long local27 = ((long) arg2 & 0xFFFFL) << 48 | ((long) arg1 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(37) Class178 local37 = (Class178) Static99.aClass33_15.method841(local27);
		if (local37 != null) {
			return local37;
		}
		@Pc(43) Class78[] local43 = null;
		@Pc(47) Class14 local47 = Static85.method1337(arg0);
		if (local47.anIntArray38 != null) {
			local43 = new Class78[local47.anIntArray38.length];
			for (@Pc(58) int local58 = 0; local58 < local43.length; local58++) {
				@Pc(75) Class41 local75 = Static45.method707(local47.anIntArray38[local58]);
				local43[local58] = new Class78(local75.anInt1167, local75.anInt1163, local75.anInt1172, local75.anInt1166, local75.anInt1162, local75.anInt1175, local75.anInt1169, local75.aBoolean90);
			}
		}
		local37 = new Class178(local47.anInt374, local43, local47.anInt376, arg2, arg1, arg3);
		Static99.aClass33_15.method845(local37, local27);
		return local37;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!lc;)Z")
	public static boolean method3715(@OriginalArg(0) int arg0, @OriginalArg(2) Class98 arg1) {
		@Pc(14) byte[] local14 = arg1.method2392(arg0);
		if (local14 == null) {
			return false;
		} else {
			Static117.method2006(local14);
			return true;
		}
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
	public static void method3717() {
		aString158 = null;
		anIntArray427 = null;
		aClass10_52 = null;
		aLongArray13 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V")
	public static void method3718(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static25.method381(-1, arg0, 9, arg2, arg1);
	}
}
