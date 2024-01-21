import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!td", name = "T", descriptor = "Z")
	public static boolean aBoolean153;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1474 = Static120.method1824("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!td", name = "X", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1476 = Static120.method1824("red:");

	@OriginalMember(owner = "client!td", name = "O", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1475 = aClass80_1476;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "[I")
	public static final int[] anIntArray464 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1477 = aClass80_1476;

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "Lclient!af;")
	public static final Class5 aClass5_55 = new Class5(64);

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1478 = aClass80_1474;

	@OriginalMember(owner = "client!td", name = "db", descriptor = "I")
	public static int anInt3847 = 0;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "Lclient!le;")
	public static final Class55 aClass55_1 = new Class55();

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!ra;Z)V")
	public static void method2756(@OriginalArg(1) Class78 arg0, @OriginalArg(2) boolean arg1) {
		if (Static88.aClass78_2 != null) {
			try {
				Static88.aClass78_2.method2417();
			} catch (@Pc(8) Exception local8) {
			}
			Static88.aClass78_2 = null;
		}
		Static88.aClass78_2 = arg0;
		Static97.method1466(arg1);
		Static155.aClass3_Sub17_3.anInt2923 = 0;
		Static68.anInt1522 = 0;
		Static133.aClass3_Sub1_Sub19_1 = null;
		Static101.aClass3_Sub17_2 = null;
		while (true) {
			@Pc(40) Class3_Sub1_Sub19 local40 = (Class3_Sub1_Sub19) Static108.aClass54_12.method1503();
			if (local40 == null) {
				while (true) {
					local40 = (Class3_Sub1_Sub19) Static174.aClass54_15.method1503();
					if (local40 == null) {
						if (Static22.aByte1 != 0) {
							try {
								@Pc(92) Class3_Sub17 local92 = new Class3_Sub17(4);
								local92.method2108(4);
								local92.method2108(Static22.aByte1);
								local92.method2092(0);
								Static88.aClass78_2.method2419(local92.aByteArray40, 4);
							} catch (@Pc(113) IOException local113) {
								try {
									Static88.aClass78_2.method2417();
								} catch (@Pc(118) Exception local118) {
								}
								Static88.aClass78_2 = null;
								Static112.anInt2525++;
							}
						}
						Static164.anInt3661 = 0;
						Static168.aLong127 = Static86.method1251();
						return;
					}
					Static143.aClass58_2.method1574(local40);
					Static62.aClass54_6.method1494(local40.aLong154, local40);
					Static94.anInt2012++;
					Static187.anInt4250--;
				}
			}
			Static95.aClass54_14.method1494(local40.aLong154, local40);
			Static44.anInt1015++;
			Static47.anInt1067--;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!bc;BLclient!rd;Lclient!rd;)[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] method2758(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) Class80 arg2) {
		@Pc(4) int local4 = arg0.method53(arg1);
		@Pc(22) int local22 = arg0.method33(arg2, local4);
		return Static54.method801(local4, local22, arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V")
	public static void method2759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static172.anInt3861 <= arg1 - arg2 && arg2 + arg1 <= Static85.anInt1779 && Static34.anInt790 <= arg5 - arg2 && Static17.anInt440 >= arg5 + arg2) {
			Static11.method226(arg2, arg5, arg0, arg1, arg4, arg3);
		} else {
			Static36.method576(arg2, arg1, arg3, arg5, arg4, arg0);
		}
	}
}
