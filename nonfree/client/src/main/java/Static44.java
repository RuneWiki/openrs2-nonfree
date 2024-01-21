import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
	public static int anInt998 = 0;

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "Lclient!q;")
	public static final Class79 aClass79_4 = new Class79(50);

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
	public static int anInt1005 = 0;

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_321 = Static151.method2243("Art");

	@OriginalMember(owner = "client!ed", name = "I", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_322 = Static151.method2243("Loaded update list");

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "Lclient!mb;")
	public static Class62 aClass62_323 = aClass62_322;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!mb;I)Lclient!jb;")
	public static Class2_Sub10 method686(@OriginalArg(0) Class62 arg0) {
		if (arg0.method1878() == 0) {
			return null;
		}
		for (@Pc(17) Class2_Sub10 local17 = (Class2_Sub10) Static125.aClass13_8.method303(); local17 != null; local17 = (Class2_Sub10) Static125.aClass13_8.method309()) {
			if (local17.aClass62_721.method1877(arg0)) {
				return local17;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
	public static void method688() {
		try {
			if (Static3.aClass92_1 == null) {
				Static3.aClass92_1 = new Class92(Static170.aClass41_3, Static169.method2460(new Class62[] { Static13.aClass62_95, Static119.method1865(Static134.anInt2873), Static213.aClass62_1521 }).method1875());
			} else {
				@Pc(41) byte[] local41 = Static3.aClass92_1.method2623();
				if (local41 != null) {
					@Pc(48) Class2_Sub11 local48 = new Class2_Sub11(local41);
					Static178.anInt3749 = local48.method1557();
					Static187.aClass38Array1 = new Class38[Static178.anInt3749];
					for (@Pc(57) int local57 = 0; local57 < Static178.anInt3749; local57++) {
						@Pc(67) Class38 local67 = Static187.aClass38Array1[local57] = new Class38();
						@Pc(71) int local71 = local48.method1557();
						local67.anInt1432 = local71 & 0x7FFF;
						local67.aBoolean62 = (local71 & 0x8000) != 0;
						local67.aClass62_486 = local48.method1538();
						local67.anInt1436 = local48.method1568();
						local67.anInt1433 = local57;
						local67.anInt1434 = Static141.method1037(local48.method1557());
					}
					Static12.method229(Static187.aClass38Array1, 0, Static187.aClass38Array1.length - 1);
					Static3.aClass92_1 = null;
					Static56.aBoolean49 = true;
				}
			}
		} catch (@Pc(123) Exception local123) {
			local123.printStackTrace();
			Static3.aClass92_1 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILclient!ii;IZI)V")
	public static void method689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg2 * arg2 + arg0 * arg0;
		if (local12 > 360000) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg3.anInt1910 / 2, arg3.anInt1858 / 2);
		if (local30 * local30 >= local12) {
			Static194.method2774(arg2, arg5, arg0, Static140.aClass2_Sub1_Sub2Array9[arg1], arg4, arg3);
			return;
		}
		local30 -= 10;
		@Pc(57) int local57 = Static151.anInt3204 + Static203.anInt4219 & 0x7FF;
		@Pc(61) int local61 = Class26.anIntArray77[local57];
		@Pc(69) int local69 = local61 * 256 / (Static206.anInt397 + 256);
		@Pc(73) int local73 = Class26.anIntArray76[local57];
		@Pc(81) int local81 = local73 * 256 / (Static206.anInt397 + 256);
		@Pc(92) int local92 = local69 * arg2 + local81 * arg0 >> 16;
		@Pc(102) int local102 = arg2 * local81 - arg0 * local69 >> 16;
		@Pc(108) double local108 = Math.atan2((double) local92, (double) local102);
		@Pc(115) int local115 = (int) (Math.sin(local108) * (double) local30);
		@Pc(122) int local122 = (int) ((double) local30 * Math.cos(local108));
		((Class2_Sub1_Sub2_Sub1) Static154.aClass2_Sub1_Sub2Array10[arg1]).method291(local115 + arg4 + arg3.anInt1910 / 2 - 10, arg3.anInt1858 / 2 + (arg5 - local122) + -10, local108);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!pb;ILclient!pb;II)Lclient!ji;")
	public static Class2_Sub1_Sub12 method690(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return Static157.method2317(arg2, arg1, arg3) ? Static94.method1424(arg0.method2130(arg2, arg3)) : null;
	}
}
