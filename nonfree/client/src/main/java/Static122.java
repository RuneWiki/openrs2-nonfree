import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!ya;")
	public static Class19 aClass19_16;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_32 = new Class215(76, 3);

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "[I")
	public static final int[] anIntArray176 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_33 = new Class215(18, 6);

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI[Lclient!uu;)V")
	public static void method2212(@OriginalArg(1) int arg0, @OriginalArg(2) Class247[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) Class247 local18 = arg1[local12];
			if (local18 != null && arg0 == local18.anInt6850 && !Static53.method895(local18)) {
				if (local18.anInt6840 == 0) {
					method2212(local18.anInt6809, arg1);
					if (local18.aClass247Array2 != null) {
						method2212(local18.anInt6809, local18.aClass247Array2);
					}
					@Pc(56) Class4_Sub43 local56 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local18.anInt6809);
					if (local56 != null) {
						Static146.method208(local56.anInt6979);
					}
				}
				if (local18.anInt6840 == 6 && local18.anInt6788 != -1) {
					@Pc(77) Class138 local77 = Static182.aClass55_1.method1397(local18.anInt6788);
					if (local77 != null) {
						local18.anInt6829 += Static176.anInt3414;
						while (local77.anIntArray296[local18.anInt6815] < local18.anInt6829) {
							local18.anInt6829 -= local77.anIntArray296[local18.anInt6815];
							local18.anInt6815++;
							if (local77.anIntArray295.length <= local18.anInt6815) {
								local18.anInt6815 -= local77.anInt4405;
								if (local18.anInt6815 < 0 || local18.anInt6815 >= local77.anIntArray295.length) {
									local18.anInt6815 = 0;
								}
							}
							local18.anInt6783 = local18.anInt6815 + 1;
							if (local77.anIntArray295.length <= local18.anInt6783) {
								local18.anInt6783 -= local77.anInt4405;
								if (local18.anInt6783 < 0 || local18.anInt6783 >= local77.anIntArray295.length) {
									local18.anInt6783 = -1;
								}
							}
							Static63.method1142(local18);
						}
					}
				}
			}
		}
	}
}
