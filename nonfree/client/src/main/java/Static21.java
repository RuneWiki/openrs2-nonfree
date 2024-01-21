import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "Lclient!wd;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!c", name = "S", descriptor = "I")
	public static int anInt609 = 0;

	@OriginalMember(owner = "client!c", name = "U", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_144 = Static158.method3034("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!c", name = "cb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_145 = Static158.method3034("hint_headicons");

	@OriginalMember(owner = "client!c", name = "eb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_147 = Static158.method3034("Loaded config");

	@OriginalMember(owner = "client!c", name = "db", descriptor = "Lclient!ob;")
	public static Class60 aClass60_146 = aClass60_147;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ob;Lclient!ob;Lclient!ob;B)V")
	public static void method473(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2) {
		Static95.aClass60_781 = arg2;
		Static95.aClass60_776 = arg1;
		Static95.aClass60_782 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ph;ZB)V")
	public static void method474(@OriginalArg(0) Class66 arg0, @OriginalArg(1) boolean arg1) {
		if (Static159.aClass66_41 != null) {
			try {
				Static159.aClass66_41.method2834();
			} catch (@Pc(16) Exception local16) {
			}
			Static159.aClass66_41 = null;
		}
		Static159.aClass66_41 = arg0;
		Static143.method2896(arg1);
		Static192.aClass2_Sub3_5.anInt273 = 0;
		Static183.aClass2_Sub3_4 = null;
		Static54.aClass2_Sub1_Sub20_1 = null;
		Static59.anInt1834 = 0;
		while (true) {
			@Pc(37) Class2_Sub1_Sub20 local37 = (Class2_Sub1_Sub20) Static138.aClass51_2.method2465();
			if (local37 == null) {
				while (true) {
					local37 = (Class2_Sub1_Sub20) Static160.aClass51_4.method2465();
					if (local37 == null) {
						if (Static172.aByte6 != 0) {
							try {
								@Pc(92) Class2_Sub3 local92 = new Class2_Sub3(4);
								local92.method224(4);
								local92.method224(Static172.aByte6);
								local92.method199(0);
								Static159.aClass66_41.method2838(local92.aByteArray4, 4);
							} catch (@Pc(113) IOException local113) {
								try {
									Static159.aClass66_41.method2834();
								} catch (@Pc(118) Exception local118) {
								}
								Static159.aClass66_41 = null;
								Static39.anInt1274++;
							}
						}
						Static72.anInt2165 = 0;
						Static161.aLong131 = Static1.method2();
						return;
					}
					Static114.aClass55_1.method2524(local37);
					Static179.aClass51_14.method2463(local37, local37.aLong151);
					Static85.anInt2515++;
					Static135.anInt3578--;
				}
			}
			Static147.aClass51_10.method2463(local37, local37.aLong151);
			Static64.anInt1969++;
			Static159.anInt4431--;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILclient!aa;IJIIII)Z")
	public static boolean method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static87.method2043(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}
