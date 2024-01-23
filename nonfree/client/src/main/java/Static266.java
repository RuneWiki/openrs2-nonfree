import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	public static int anInt5552;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public static int anInt5550 = 0;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!lc;")
	public static Class79 aClass79_40 = new Class79(500);

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "Lclient!lc;")
	public static Class79 aClass79_41 = new Class79(64);

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
	public static int anInt5558 = -1;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
	public static int anInt5559 = -1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4217(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(17) int local17 = local8.length() - 3; local17 > 0; local17 -= 3) {
			local8 = local8.substring(0, local17) + "," + local8.substring(local17);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static125.aString200 + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static14.aString16 + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!ql;)Lclient!nd;")
	public static Class25_Sub3 method4221(@OriginalArg(1) Class1_Sub13 arg0) {
		return new Class25_Sub3(arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1773(), arg0.method1773(), arg0.method1772());
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ak;I[I[I[I)V")
	public static void method4222(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg3.length; local8++) {
			@Pc(14) int local14 = arg3[local8];
			@Pc(18) int local18 = arg2[local8];
			@Pc(22) int local22 = arg1[local8];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && arg0.aClass83Array3.length > local24) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass83Array3[local24] = null;
					} else {
						@Pc(48) Class49 local48 = Static131.method697(local14);
						@Pc(51) int local51 = local48.anInt2190;
						@Pc(56) Class83 local56 = arg0.aClass83Array3[local24];
						if (local56 != null) {
							if (local56.anInt3390 == local14) {
								if (local51 == 0) {
									local56 = arg0.aClass83Array3[local24] = null;
								} else if (local51 == 1) {
									local56.anInt3391 = 1;
									local56.anInt3386 = 0;
									local56.anInt3384 = 0;
									local56.anInt3385 = 0;
									local56.anInt3392 = local22;
									Static232.method3865(arg0.anInt479, arg0.anInt427, false, 0, local48);
								} else if (local51 == 2) {
									local56.anInt3386 = 0;
								}
							} else if (local48.anInt2189 >= Static131.method697(local56.anInt3390).anInt2189) {
								local56 = arg0.aClass83Array3[local24] = null;
							}
						}
						if (local56 == null) {
							local56 = arg0.aClass83Array3[local24] = new Class83();
							local56.anInt3391 = 1;
							local56.anInt3390 = local14;
							local56.anInt3385 = 0;
							local56.anInt3386 = 0;
							local56.anInt3392 = local22;
							local56.anInt3384 = 0;
							Static232.method3865(arg0.anInt479, arg0.anInt427, false, 0, local48);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIBII)V")
	public static void method4223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg2; local8 <= arg4; local8++) {
			Static147.method2681(Static29.anIntArrayArray10[local8], arg1, arg3, arg0);
		}
	}
}
