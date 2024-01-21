import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
	public static int anInt2613;

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "Lclient!c;")
	public static Class10 aClass10_29;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "Lclient!od;")
	private static Class60 aClass60_1012 = Static41.method597("Login limit exceeded)3");

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "Lclient!od;")
	private static Class60 aClass60_1016 = Static41.method597("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!od;")
	public static Class60 aClass60_1013 = aClass60_1016;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_1014 = Static41.method597("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "Lclient!od;")
	public static Class60 aClass60_1015 = aClass60_1012;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "Lclient!od;")
	public static Class60 aClass60_1017 = Static41.method597("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "[I")
	public static int[] anIntArray332 = new int[32];

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
	public static int anInt2618 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBII)I")
	public static int method1819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lclient!qd;")
	public static Class4_Sub3_Sub13 method1820(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub13 local10 = (Class4_Sub3_Sub13) Static96.aClass12_21.method289((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static10.aClass10_7.method1774(9, arg0);
		local10 = new Class4_Sub3_Sub13();
		local10.anInt2203 = arg0;
		if (local20 != null) {
			local10.method1523(new Class4_Sub9(local20));
		}
		local10.method1527();
		Static96.aClass12_21.method290(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[Lclient!ee;[II[II)V")
	public static void method1822(@OriginalArg(0) int arg0, @OriginalArg(1) Class22[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(20) int local20 = arg0 - 1;
		@Pc(24) int local24 = arg3 + 1;
		@Pc(30) int local30 = (arg3 + arg0) / 2;
		@Pc(34) Class22 local34 = arg1[local30];
		arg1[local30] = arg1[arg0];
		arg1[arg0] = local34;
		while (local24 > local20) {
			@Pc(48) boolean local48 = true;
			@Pc(51) int local51;
			@Pc(65) int local65;
			@Pc(68) int local68;
			do {
				local24--;
				for (local51 = 0; local51 < 4; local51++) {
					if (arg2[local51] == 2) {
						local65 = arg1[local24].anInt911;
						local68 = local34.anInt911;
					} else if (arg2[local51] == 1) {
						local65 = arg1[local24].anInt916;
						local68 = local34.anInt916;
						if (local65 == -1 && arg4[local51] == 1) {
							local65 = 2001;
						}
						if (local68 == -1 && arg4[local51] == 1) {
							local68 = 2001;
						}
					} else if (arg2[local51] == 3) {
						local65 = arg1[local24].aBoolean37 ? 1 : 0;
						local68 = local34.aBoolean37 ? 1 : 0;
					} else {
						local65 = arg1[local24].anInt915;
						local68 = local34.anInt915;
					}
					if (local65 != local68) {
						if ((arg4[local51] != 1 || local65 <= local68) && (arg4[local51] != 0 || local68 <= local65)) {
							local48 = false;
						}
						break;
					}
					if (local51 == 3) {
						local48 = false;
					}
				}
			} while (local48);
			local48 = true;
			do {
				local20++;
				for (local51 = 0; local51 < 4; local51++) {
					if (arg2[local51] == 2) {
						local68 = local34.anInt911;
						local65 = arg1[local20].anInt911;
					} else if (arg2[local51] == 1) {
						local65 = arg1[local20].anInt916;
						if (local65 == -1 && arg4[local51] == 1) {
							local65 = 2001;
						}
						local68 = local34.anInt916;
						if (local68 == -1 && arg4[local51] == 1) {
							local68 = 2001;
						}
					} else if (arg2[local51] == 3) {
						local68 = local34.aBoolean37 ? 1 : 0;
						local65 = arg1[local20].aBoolean37 ? 1 : 0;
					} else {
						local65 = arg1[local20].anInt915;
						local68 = local34.anInt915;
					}
					if (local68 != local65) {
						if ((arg4[local51] != 1 || local65 >= local68) && (arg4[local51] != 0 || local68 >= local65)) {
							local48 = false;
						}
						break;
					}
					if (local51 == 3) {
						local48 = false;
					}
				}
			} while (local48);
			if (local24 > local20) {
				@Pc(337) Class22 local337 = arg1[local20];
				arg1[local20] = arg1[local24];
				arg1[local24] = local337;
			}
		}
		method1822(arg0, arg1, arg2, local24, arg4);
		method1822(local24 + 1, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method1823() {
		anIntArray332 = null;
		aClass60_1013 = null;
		aClass60_1014 = null;
		anIntArray331 = null;
		aClass60_1016 = null;
		aCanvas1 = null;
		aClass10_29 = null;
		aClass60_1012 = null;
		aClass60_1015 = null;
		aClass60_1017 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method1824() {
		Static64.aBoolean55 = true;
		Static8.aBoolean3 = true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!c;I)Z")
	public static boolean method1825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2) {
		@Pc(9) byte[] local9 = arg2.method1774(arg0, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static45.method629(local9);
			return true;
		}
	}
}
