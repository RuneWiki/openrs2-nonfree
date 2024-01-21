import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!md", name = "O", descriptor = "I")
	public static int anInt2952;

	@OriginalMember(owner = "client!md", name = "S", descriptor = "I")
	public static int anInt2954;

	@OriginalMember(owner = "client!md", name = "I", descriptor = "Lclient!dd;")
	public static Class13 aClass13_974 = Static161.method2971("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Lclient!th;")
	public static Class82 aClass82_8 = new Class82();

	@OriginalMember(owner = "client!md", name = "U", descriptor = "Lclient!dd;")
	private static Class13 aClass13_978 = Static161.method2971(" is already on your ignore list)3");

	@OriginalMember(owner = "client!md", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_976 = aClass13_978;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_977 = Static161.method2971("Null");

	@OriginalMember(owner = "client!md", name = "T", descriptor = "[I")
	public static int[] anIntArray290 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)I")
	public static int method2112(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub18 local12 = Static26.method805(arg0);
		@Pc(15) int local15 = local12.anInt3781;
		@Pc(18) int local18 = local12.anInt3783;
		@Pc(21) int local21 = local12.anInt3782;
		@Pc(27) int local27 = Class1_Sub2_Sub2_Sub7.anIntArray388[local18 - local21];
		return local27 & Static103.anIntArray266[local15] >> local21;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V")
	public static void method2113() {
		aClass13_974 = null;
		aClass82_8 = null;
		aClass13_977 = null;
		anIntArray290 = null;
		aClass13_978 = null;
		aClass13_976 = null;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(III)Z")
	public static boolean method2114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static174.anInt1394; local1++) {
			@Pc(6) Class35 local6 = Static34.aClass35Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2000 == 1) {
				local15 = local6.anInt1999 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2002 + (local6.anInt2006 * local15 >> 8);
					local37 = local6.anInt2001 + (local6.anInt1991 * local15 >> 8);
					local47 = local6.anInt1993 + (local6.anInt1997 * local15 >> 8);
					local57 = local6.anInt1985 + (local6.anInt2003 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2000 == 2) {
				local15 = arg0 - local6.anInt1999;
				if (local15 > 0) {
					local27 = local6.anInt2002 + (local6.anInt2006 * local15 >> 8);
					local37 = local6.anInt2001 + (local6.anInt1991 * local15 >> 8);
					local47 = local6.anInt1993 + (local6.anInt1997 * local15 >> 8);
					local57 = local6.anInt1985 + (local6.anInt2003 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2000 == 3) {
				local15 = local6.anInt2002 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1999 + (local6.anInt1988 * local15 >> 8);
					local37 = local6.anInt1986 + (local6.anInt1990 * local15 >> 8);
					local47 = local6.anInt1993 + (local6.anInt1997 * local15 >> 8);
					local57 = local6.anInt1985 + (local6.anInt2003 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2000 == 4) {
				local15 = arg2 - local6.anInt2002;
				if (local15 > 0) {
					local27 = local6.anInt1999 + (local6.anInt1988 * local15 >> 8);
					local37 = local6.anInt1986 + (local6.anInt1990 * local15 >> 8);
					local47 = local6.anInt1993 + (local6.anInt1997 * local15 >> 8);
					local57 = local6.anInt1985 + (local6.anInt2003 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2000 == 5) {
				local15 = arg1 - local6.anInt1993;
				if (local15 > 0) {
					local27 = local6.anInt1999 + (local6.anInt1988 * local15 >> 8);
					local37 = local6.anInt1986 + (local6.anInt1990 * local15 >> 8);
					local47 = local6.anInt2002 + (local6.anInt2006 * local15 >> 8);
					local57 = local6.anInt2001 + (local6.anInt1991 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
	public static void method2115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) Class1_Sub5 local11 = (Class1_Sub5) Static149.aClass82_14.method2849(); local11 != null; local11 = (Class1_Sub5) Static149.aClass82_14.method2855()) {
			if (local11.anInt412 != -1 || local11.anIntArray49 != null) {
				@Pc(23) int local23 = 0;
				if (local11.anInt400 < arg3) {
					local23 = arg3 - local11.anInt400;
				} else if (arg3 < local11.anInt407) {
					local23 = local11.anInt407 - arg3;
				}
				if (local11.anInt402 < arg1) {
					local23 += arg1 - local11.anInt402;
				} else if (arg1 < local11.anInt409) {
					local23 += local11.anInt409 - arg1;
				}
				if (local23 - 64 > local11.anInt404 || Static21.anInt786 == 0 || local11.anInt405 != arg0) {
					if (local11.aClass1_Sub12_Sub1_2 != null) {
						Static77.aClass1_Sub12_Sub2_1.method2355(local11.aClass1_Sub12_Sub1_2);
						local11.aClass1_Sub12_Sub1_2 = null;
					}
					if (local11.aClass1_Sub12_Sub1_1 != null) {
						Static77.aClass1_Sub12_Sub2_1.method2355(local11.aClass1_Sub12_Sub1_1);
						local11.aClass1_Sub12_Sub1_1 = null;
					}
				} else {
					local23 -= 64;
					if (local23 < 0) {
						local23 = 0;
					}
					@Pc(132) int local132 = Static21.anInt786 * (local11.anInt404 - local23) / local11.anInt404;
					if (local11.aClass1_Sub12_Sub1_2 != null) {
						local11.aClass1_Sub12_Sub1_2.method1756(local132);
					} else if (local11.anInt412 >= 0) {
						@Pc(150) Class83 local150 = Static194.method2882(Static51.aClass4_Sub1_24, local11.anInt412, 0);
						if (local150 != null) {
							@Pc(157) Class1_Sub4_Sub1 local157 = local150.method2884().method319(Static7.aClass43_2);
							@Pc(162) Class1_Sub12_Sub1 local162 = Static192.method1754(local157, local132);
							local162.method1760(-1);
							Static77.aClass1_Sub12_Sub2_1.method2357(local162);
							local11.aClass1_Sub12_Sub1_2 = local162;
						}
					}
					if (local11.aClass1_Sub12_Sub1_1 != null) {
						local11.aClass1_Sub12_Sub1_1.method1756(local132);
						if (!local11.aClass1_Sub12_Sub1_1.method3059()) {
							local11.aClass1_Sub12_Sub1_1 = null;
						}
					} else if (local11.anIntArray49 != null && (local11.anInt408 -= arg2) <= 0) {
						@Pc(207) int local207 = (int) ((double) local11.anIntArray49.length * Math.random());
						@Pc(215) Class83 local215 = Static194.method2882(Static51.aClass4_Sub1_24, local11.anIntArray49[local207], 0);
						if (local215 != null) {
							@Pc(222) Class1_Sub4_Sub1 local222 = local215.method2884().method319(Static7.aClass43_2);
							@Pc(227) Class1_Sub12_Sub1 local227 = Static192.method1754(local222, local132);
							local227.method1760(0);
							Static77.aClass1_Sub12_Sub2_1.method2357(local227);
							local11.anInt408 = (int) (Math.random() * (double) (local11.anInt406 - local11.anInt401)) + local11.anInt401;
							local11.aClass1_Sub12_Sub1_1 = local227;
						}
					}
				}
			}
		}
	}
}
