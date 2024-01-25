import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "Lclient!hf;")
	public static Class118_Sub1 aClass118_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Lclient!h;")
	public static final Class114 aClass114_17 = new Class114("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	public static void method1295(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static41.anInt1359 = 1;
		Static15.anInt836 = -1;
		Static54.method3635(arg0, false, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)V")
	public static void method1296() {
		@Pc(9) Class145[] local9 = Class114.aClass145Array1;
		synchronized (Class114.aClass145Array1) {
			for (@Pc(13) int local13 = 0; local13 < Class114.aClass145Array1.length; local13++) {
				Class114.aClass145Array1[local13] = new Class145();
				Static213.anIntArray328[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	public static void method1298(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static476.method6225(5, arg0);
		local12.method4925();
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(B)V")
	public static void method1299() {
		Static441.aClass81_6.method2637();
		Static88.aClass40_1.method1497();
		Static489.aClass34_2.method1365();
		Static365.aClass194_6.method5076();
		Static345.aClass222_1.method5583();
		Static454.aClass153_2.method3997();
		Static6.aClass126_1.method3572();
		Static529.aClass90_2.method2962();
		Static483.aClass187_1.method4854();
		Static133.aClass173_1.method4405();
		Static109.aClass18_1.method873();
		Static198.aClass165_3.method4291();
		Static167.aClass250_4.method6148();
		Static182.aClass133_1.method3774();
		Static162.aClass98_11.method3002();
		Static27.aClass310_1.method7430();
		Static86.aClass254_1.method6211();
		Static294.aClass119_1.method3468();
		Static530.aClass137_2.method3829();
		Static90.aClass229_1.method5695();
		Static192.method3614();
		Static301.method5032();
		Static541.method7915();
		if (Static359.aClass199_13 != Static363.aClass199_14) {
			for (@Pc(74) int local74 = 0; local74 < Static241.aByteArrayArray11.length; local74++) {
				Static241.aByteArrayArray11[local74] = null;
			}
			Static3.anInt56 = 0;
		}
		Static404.method7823();
		Static392.method5912();
		Static533.method7790();
		Static149.method5063();
		Static238.method4034();
		Static387.aClass316_51.method7794();
		Static478.aClass9_10.method7624();
		Static196.aClass290_2.method7075();
		Static213.method3845();
		Static149.aClass160_65.method4201();
		Static44.aClass160_9.method4201();
		Static68.aClass160_17.method4201();
		Static336.aClass160_72.method4201();
		Static51.aClass160_93.method4201();
		Static350.aClass160_74.method4201();
		Static45.aClass160_10.method4201();
		Static118.aClass160_26.method4201();
		Static390.aClass160_80.method4201();
		Static105.aClass160_20.method4201();
		Static239.aClass160_52.method4201();
		Static386.aClass160_79.method4201();
		Static214.aClass160_48.method4201();
		Static309.aClass160_69.method4201();
		Static42.aClass160_8.method4201();
		Static517.aClass160_100.method4201();
		Static439.aClass160_71.method4201();
		Static76.aClass160_18.method4201();
		Static154.aClass160_34.method4201();
		Static542.aClass160_105.method4201();
		Static223.aClass160_49.method4201();
		Static153.aClass160_33.method4201();
		Static316.aClass160_103.method4201();
		Static115.aClass160_24.method4201();
		Static513.aClass160_99.method4201();
		Static322.aClass160_28.method4201();
		Static447.aClass160_92.method4201();
		Static62.aClass160_16.method4201();
		Static356.aClass160_77.method4201();
		Static474.aClass160_55.method4201();
		Static261.aClass160_59.method4201();
		Static40.aClass160_5.method4201();
		Static309.aClass316_45.method7794();
		Static497.aClass316_60.method7794();
		Static45.aClass316_6.method7794();
		Static536.aClass316_63.method7794();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIII)I")
	public static int method1300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg1;
		}
		@Pc(13) int local13 = 128 - arg2;
		@Pc(33) int local33 = local13 * (arg1 & 0x7F) + (arg0 & 0x7F) * arg2 >> 7;
		@Pc(47) int local47 = (arg0 & 0x380) * arg2 + local13 * (arg1 & 0x380) >> 7;
		@Pc(61) int local61 = (arg1 & 0xFC00) * local13 + arg2 * (arg0 & 0xFC00) >> 7;
		return local33 & 0x7F | local47 & 0x380 | local61 & 0xFC00;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
	public static void method1301(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static476.method6225(6, arg1);
		local12.method4919();
		local12.anInt5686 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)[Lclient!ada;")
	public static Class6[] method1302() {
		return new Class6[] { Static143.aClass6_49, Static301.aClass6_89, Static8.aClass6_4, Static38.aClass6_17, Static373.aClass6_115, Static440.aClass6_39, Static88.aClass6_30, Static343.aClass6_103, Static258.aClass6_79, Static324.aClass6_97, Static347.aClass6_108, Static425.aClass6_121, Static357.aClass6_111, Static328.aClass6_99, Static345.aClass6_105, Static182.aClass6_58, Static517.aClass6_138, Static494.aClass6_133, Static76.aClass6_26, Static292.aClass6_87, Static354.aClass6_110, Static358.aClass6_36, Static225.aClass6_71, Static80.aClass6_27, Static488.aClass6_130, Static135.aClass6_47, Static169.aClass6_55, Static493.aClass6_131, Static202.aClass6_98, Static244.aClass6_74, Static262.aClass6_80, Static92.aClass6_31, Static170.aClass6_56, Static526.aClass6_140, Static507.aClass6_137, Static35.aClass6_16, Static254.aClass6_76, Static350.aClass6_109, Static12.aClass6_6, Static440.aClass6_40, Static96.aClass6_32, Static453.aClass6_125, Static126.aClass6_44, Static40.aClass6_18, Static32.aClass6_15, Static12.aClass6_7, Static372.aClass6_114, Static61.aClass6_20, Static185.aClass6_59, Static146.aClass6_51, Static2.aClass6_84, Static29.aClass6_14, Static47.aClass6_19, Static217.aClass6_66, Static397.aClass6_119, Static256.aClass6_78, Static101.aClass6_41, Static71.aClass6_24, Static469.aClass6_127, Static335.aClass6_102, Static531.aClass6_141, Static189.aClass6_60, Static345.aClass6_106, Static9.aClass6_5, Static12.aClass6_8, Static2.aClass6_82, Static518.aClass6_139, Static307.aClass6_93, Static379.aClass6_116, Static111.aClass6_43, Static2.aClass6_83, Static219.aClass6_67, Static501.aClass6_135, Static364.aClass6_112, Static222.aClass6_69, Static447.aClass6_124, Static91.aClass6_10, Static87.aClass6_101, Static132.aClass6_46, Static212.aClass6_64, Static81.aClass6_28, Static500.aClass6_134, Static370.aClass6_73, Static308.aClass6_94, Static320.aClass6_96, Static317.aClass6_95, Static291.aClass6_86, Static358.aClass6_35, Static483.aClass6_128, Static130.aClass6_45, Static223.aClass6_70, Static178.aClass6_57, Static435.aClass6_122, Static446.aClass6_123, Static300.aClass6_88, Static368.aClass6_113, Static217.aClass6_65, Static344.aClass6_104, Static150.aClass6_52, Static246.aClass6_75, Static494.aClass6_132, Static221.aClass6_68, Static293.aClass6_54, Static346.aClass6_107, Static394.aClass6_118, Static195.aClass6_63, Static111.aClass6_42, Static301.aClass6_90, Static301.aClass6_91, Static254.aClass6_77, Static462.aClass6_126, Static73.aClass6_25, Static403.aClass6_136, Static328.aClass6_100 };
	}
}
