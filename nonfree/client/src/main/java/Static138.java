import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!im", name = "B", descriptor = "I")
	public static int anInt2673;

	@OriginalMember(owner = "client!im", name = "C", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!im", name = "y", descriptor = "[Lclient!nj;")
	public static final Class141[] aClass141Array1 = new Class141[6];

	@OriginalMember(owner = "client!im", name = "G", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_65 = new Class85("Hidden", "Versteckt", "Caché", "Oculto");

	@OriginalMember(owner = "client!im", name = "I", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_66 = new Class85("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(II)Z")
	public static boolean method2445(@OriginalArg(0) int arg0) {
		Static194.aBoolean297 = true;
		Static215.anInt4249 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ea;I)V")
	public static void method2446(@OriginalArg(0) Class55 arg0) {
		if (Static160.anInt3181 < 2 && !Static54.aBoolean72 || Static204.aClass201_8 != null) {
			return;
		}
		@Pc(43) String local43;
		if (Static54.aBoolean72 && Static160.anInt3181 < 2) {
			local43 = Static255.aString49 + Static333.aClass85_142.method2020(Static41.anInt726) + Static230.aString42 + " ->";
		} else if (Static317.aBoolean513 && Static174.aClass2_1.method1425(81) && Static160.anInt3181 > 2) {
			local43 = Static124.method2199((Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.aClass5_114.aClass5_252.aClass5_252);
		} else {
			@Pc(37) Class5_Sub20 local37 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.aClass5_114.aClass5_252;
			local43 = Static124.method2199(local37);
			@Pc(45) int[] local45 = null;
			if (Static96.method1758(local37.anInt2094)) {
				local45 = Static322.method544((int) local37.aLong73).anIntArray385;
			} else if (Static60.method1846(local37.anInt2094)) {
				@Pc(61) Class4_Sub5_Sub2_Sub2 local61 = Static280.aClass4_Sub5_Sub2_Sub2Array1[(int) local37.aLong73];
				if (local61 != null) {
					local45 = local61.aClass106_1.anIntArray323;
				}
			} else if (Static134.method1927(local37.anInt2094)) {
				if (local37.anInt2094 == 1011) {
					local45 = Static111.method1967((int) local37.aLong73).anIntArray436;
				} else {
					local45 = Static111.method1967((int) (local37.aLong73 >>> 32 & 0x7FFFFFFFL)).anIntArray436;
				}
			}
			if (local45 != null) {
				local43 = local43 + Static7.method121(local45);
			}
		}
		if (Static160.anInt3181 > 2) {
			local43 = local43 + "<col=ffffff> / " + (Static160.anInt3181 - 2) + Static224.aClass85_105.method2020(Static41.anInt726);
		}
		if (Static109.aClass201_6 != null) {
			@Pc(213) Class18 local213 = Static109.aClass201_6.method5802(arg0);
			if (local213 == null) {
				local213 = Static77.aClass18_1;
			}
			local213.method4170(Static159.anInt3171, local43, Static109.aClass201_6.anInt6542, Static109.aClass201_6.anInt6505, Static109.aClass201_6.anInt6535, Static92.anInt1719, Static109.aClass201_6.anInt6488, Static55.aRandom3, Static303.aClass95Array15, Static313.anInt6081, Static74.anIntArray115, Static109.aClass201_6.anInt6544, Static34.anIntArray70, Static109.aClass201_6.anInt6510);
			Static184.method5033(Static74.anIntArray115[0], Static74.anIntArray115[3], Static74.anIntArray115[2], Static74.anIntArray115[1]);
		} else if (Static349.aClass201_14 != null && Static111.anInt2077 == 0) {
			@Pc(193) int local193 = Static77.aClass18_1.method4176(Static303.aClass95Array15, Static163.anInt3237 + 4, Static10.anInt201 + 16, Static34.anIntArray70, Static92.anInt1719, local43, Static55.aRandom3);
			Static184.method5033(Static163.anInt3237 + 4, 16, local193 + Static268.aClass36_8.method640(local43), Static10.anInt201);
		}
	}
}
