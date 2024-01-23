import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!c", name = "jb", descriptor = "[I")
	public static int[] anIntArray47;

	@OriginalMember(owner = "client!c", name = "V", descriptor = "Lclient!mi;")
	public static Class75 aClass75_3 = new Class75();

	@OriginalMember(owner = "client!c", name = "hb", descriptor = "Lclient!qc;")
	public static Class90 aClass90_5 = new Class90(32);

	@OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
	public static int anInt466 = -1;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
	public static void method330() {
		try {
			if (Static140.aClass73_1 == null) {
				Static140.aClass73_1 = new Class73(Static4.aClass87_1, Static17.method257(new Class50[] { Static5.method80(), Static159.aClass50_1343 }).method1212());
			}
		} catch (@Pc(32) Exception local32) {
			local32.printStackTrace();
			Static140.aClass73_1 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(B)V")
	public static void method334() {
		if (Static140.aClass73_1 == null) {
			return;
		}
		try {
			@Pc(20) byte[] local20 = Static140.aClass73_1.method2043();
			if (local20 != null) {
				@Pc(27) Class1_Sub17 local27 = new Class1_Sub17(local20);
				Static97.anInt1980 = local27.method2178();
				Static53.aClass106Array1 = new Class106[Static97.anInt1980];
				for (@Pc(36) int local36 = 0; local36 < Static97.anInt1980; local36++) {
					@Pc(46) Class106 local46 = Static53.aClass106Array1[local36] = new Class106();
					@Pc(50) int local50 = local27.method2178();
					local46.anInt3934 = local50 & 0x7FFF;
					local46.aBoolean184 = (local50 & 0x8000) != 0;
					local46.aClass50_1262 = local27.method2125();
					local46.anInt3932 = local27.method2167();
					local46.anInt3930 = local36;
					@Pc(84) int local84 = local27.method2178();
					local46.anInt3929 = Static112.method1758(local84);
				}
				Static144.method2383(Static53.aClass106Array1.length - 1, Static53.aClass106Array1, 0);
				Static140.aClass73_1 = null;
			}
		} catch (@Pc(105) Exception local105) {
			local105.printStackTrace();
			Static140.aClass73_1 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)V")
	public static void method335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) (arg1 + (arg0 << 16));
		@Pc(17) Class1_Sub1_Sub14 local17 = (Class1_Sub1_Sub14) Static40.aClass90_7.method2819(local11);
		if (local17 != null) {
			Static212.aClass121_5.method3379(local17);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIII)V")
	public static void method336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = Static92.method1433(Static49.anInt1030, arg0, Static177.anInt3701);
		@Pc(18) int local18 = Static92.method1433(Static49.anInt1030, arg2, Static177.anInt3701);
		@Pc(24) int local24 = Static92.method1433(Static131.anInt2713, arg4, Static135.anInt2790);
		@Pc(34) int local34 = Static92.method1433(Static131.anInt2713, arg3, Static135.anInt2790);
		for (@Pc(36) int local36 = local12; local36 <= local18; local36++) {
			Static107.method1641(local24, arg1, Static139.anIntArrayArray21[local36], local34);
		}
	}
}
