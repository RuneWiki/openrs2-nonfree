import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "F")
	public static float aFloat79;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
	public static boolean aBoolean427 = false;

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_77 = new Class212(50, -1);

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
	public static int anInt5744 = 0;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_176 = new Class214(13, 8);

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_96 = new Class21("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_34 = new Class91();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II[Lclient!tf;)V")
	public static void method4764(@OriginalArg(1) int arg0, @OriginalArg(2) Class240[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class240 local9 = arg1[local3];
			if (local9 != null && local9.anInt6917 == arg0 && !Static50.method1133(local9)) {
				if (local9.anInt6873 == 0) {
					method4764(local9.anInt6909, arg1);
					if (local9.aClass240Array2 != null) {
						method4764(local9.anInt6909, local9.aClass240Array2);
					}
					@Pc(46) Class4_Sub39 local46 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local9.anInt6909);
					if (local46 != null) {
						Static392.method5525(local46.anInt6721);
					}
				}
				if (local9.anInt6873 == 6 && local9.anInt6858 != -1) {
					@Pc(69) Class130 local69 = Static143.aClass85_1.method2406(local9.anInt6858);
					if (local69 != null) {
						local9.anInt6890 += Static75.anInt1854;
						while (local69.anIntArray308[local9.anInt6867] < local9.anInt6890) {
							local9.anInt6890 -= local69.anIntArray308[local9.anInt6867];
							local9.anInt6867++;
							if (local9.anInt6867 >= local69.anIntArray306.length) {
								local9.anInt6867 -= local69.anInt3940;
								if (local9.anInt6867 < 0 || local9.anInt6867 >= local69.anIntArray306.length) {
									local9.anInt6867 = 0;
								}
							}
							local9.anInt6847 = local9.anInt6867 + 1;
							if (local9.anInt6847 >= local69.anIntArray306.length) {
								local9.anInt6847 -= local69.anInt3940;
								if (local9.anInt6847 < 0 || local69.anIntArray306.length <= local9.anInt6847) {
									local9.anInt6847 = -1;
								}
							}
							Static273.method4374(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)V")
	public static void method4765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(16, arg0);
		local8.method521();
		local8.anInt621 = arg1;
	}
}
