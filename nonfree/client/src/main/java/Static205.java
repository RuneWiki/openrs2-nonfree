import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!w", name = "i", descriptor = "[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] aClass3_Sub3_Sub2_Sub1Array13;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	public static int anInt4176;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2074 = Static193.method3027("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2076 = Static193.method3027("Select");

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2075 = aClass70_2076;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
	public static final int[] anIntArray361 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2077 = Static193.method3027("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public static int anInt4177 = 3;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2078 = Static193.method3027("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ke;Lclient!ke;Z)V")
	public static void method3235(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class52 arg1) {
		Static76.aClass52_17 = arg1;
		Static153.aClass52_34 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZII)V")
	public static void method3237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static35.anInt770 < 2 && Static210.anInt4244 == 0 && !Static5.aBoolean7) {
			return;
		}
		@Pc(32) Class70 local32;
		if (Static210.anInt4244 == 1 && Static35.anInt770 < 2) {
			local32 = Static207.method3296(new Class70[] { Static41.aClass70_428, Static15.aClass70_156, Static2.aClass70_2, Static186.aClass70_1839 });
		} else if (Static5.aBoolean7 && Static35.anInt770 < 2) {
			local32 = Static207.method3296(new Class70[] { Static136.aClass70_1289, Static15.aClass70_156, Static110.aClass70_1097, Static186.aClass70_1839 });
		} else {
			local32 = Static44.method723(Static35.anInt770 - 1);
		}
		if (Static35.anInt770 > 2) {
			local32 = Static207.method3296(new Class70[] { local32, Static202.aClass70_2054, Static107.method2404(Static35.anInt770 - 2), Static191.aClass70_1895 });
		}
		@Pc(129) int local129 = Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3130(local32, arg0 + 4, arg1 - -15, Static72.aRandom1, Static55.anInt1189);
		Static5.method92(arg0 + 4, Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3115(local32) - -local129, arg1, 15);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!tc;Lclient!ke;Lclient!ke;Lclient!ke;B)Z")
	public static boolean method3238(@OriginalArg(0) Class3_Sub19_Sub2 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) Class52 arg3) {
		Static175.aClass3_Sub19_Sub2_2 = arg0;
		Static46.aClass52_10 = arg3;
		Static93.aClass52_20 = arg2;
		Static65.aClass52_15 = arg1;
		return true;
	}
}
