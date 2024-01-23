import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Lclient!cg;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
	public static int anInt1430;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public static int anInt1427 = 0;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method1183(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static270.aClass1_Sub18_Sub1_3.method3130(205);
		Static270.aClass1_Sub18_Sub1_3.method3115(Static136.method2158(arg0));
		Static270.aClass1_Sub18_Sub1_3.method3110(arg1);
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public static void method1184() {
		if (Static270.anInt5407 == 2) {
			if (Static279.anInt5594 == Static54.anInt1146 && Static119.anInt4988 == Static223.anInt4678) {
				Static270.anInt5407 = 0;
				if (Static266.aBoolean410 && Static246.aBooleanArray15[81] && Static29.anInt626 > 2) {
					Static1.method2(Static29.anInt626 - 2);
				} else {
					Static1.method2(Static29.anInt626 - 1);
				}
			}
		} else if (Static207.anInt4122 == Static54.anInt1146 && anInt1427 == Static223.anInt4678) {
			Static270.anInt5407 = 0;
			if (Static266.aBoolean410 && Static246.aBooleanArray15[81] && Static29.anInt626 > 2) {
				Static1.method2(Static29.anInt626 - 2);
			} else {
				Static1.method2(Static29.anInt626 - 1);
			}
		} else {
			Static279.anInt5594 = Static207.anInt4122;
			Static119.anInt4988 = anInt1427;
			Static270.anInt5407 = 2;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIZZZ)Lclient!ak;")
	public static Class7 method1186(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) Class159 local9 = null;
		if (Static147.aClass66_3 != null) {
			local9 = new Class159(arg1, Static147.aClass66_3, Static43.aClass66Array1[arg1], 1000000);
		}
		Static61.aClass143_Sub1Array2[arg1] = Static254.aClass20_113.method618(arg1, Static8.aClass159_1, local9);
		if (arg0) {
			Static61.aClass143_Sub1Array2[arg1].method3831();
		}
		return new Class7(Static61.aClass143_Sub1Array2[arg1], arg3, arg2);
	}
}
