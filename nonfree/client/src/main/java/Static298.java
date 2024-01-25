import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Z")
	public static boolean method4740() {
		if (Static488.aBoolean570) {
			try {
				Static557.method5219("showVideoAd", Static466.aClass102_4.anApplet1);
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	public static void method4741() {
		Static438.anInt7729 = 1;
		Static418.anInt7355 = -1;
		if (Static306.aString51 == null) {
			Static375.method5758(35);
		} else {
			@Pc(24) Class1_Sub6 local24 = new Class1_Sub6(Static388.method5883(Static387.method5880(Static306.aString51)));
			@Pc(28) long local28 = local24.method3949();
			Static157.aLong181 = local24.method3949();
			Static524.method7186("", true, Static545.method7543(local28));
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!dg;Z)V")
	public static void method4742(@OriginalArg(0) Class49_Sub2_Sub2_Sub1 arg0) {
		@Pc(11) Class1_Sub10 local11 = (Class1_Sub10) Static403.aClass17_31.method738((long) arg0.anInt4295);
		if (local11 == null) {
			Static174.method2614(arg0.aByte98, 0, null, arg0.anIntArray427[0], null, arg0, arg0.anIntArray428[0]);
		} else {
			local11.method1182();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIIII)V")
	public static void method4743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static506.anInt8568 = arg2;
		Static474.anInt7956 = arg0;
		Static359.anInt6311 = arg1;
		Static196.anInt3864 = arg3;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)[Lclient!im;")
	public static Class140[] method4744() {
		return new Class140[] { Static40.aClass140_17, Static545.aClass140_153, Static292.aClass140_143, Static474.aClass140_130, Static10.aClass140_5, Static104.aClass140_36, Static373.aClass140_25, Static27.aClass140_13, Static236.aClass140_70, Static252.aClass140_73, Static328.aClass140_89, Static422.aClass140_116, Static66.aClass140_22, Static104.aClass140_35, Static194.aClass140_63, Static283.aClass140_78, Static240.aClass140_71, Static276.aClass140_147, Static181.aClass140_58, Static368.aClass140_100, Static219.aClass140_125, Static471.aClass140_128, Static388.aClass140_109, Static538.aClass140_151, Static31.aClass140_14, Static343.aClass140_96, Static95.aClass140_31, Static108.aClass140_39, Static467.aClass140_127, Static51.aClass140_18, Static20.aClass140_8, Static537.aClass140_149, Static360.aClass140_98, Static171.aClass140_56, Static7.aClass140_1, Static16.aClass140_7, Static80.aClass140_28, Static509.aClass140_141, Static533.aClass140_146, Static149.aClass140_51, Static395.aClass140_110, Static402.aClass140_113, Static420.aClass140_115, Static302.aClass140_81, Static320.aClass140_84, Static487.aClass140_134, Static530.aClass140_145, Static507.aClass140_140, Static318.aClass140_83, Static211.aClass140_67, Static529.aClass140_144, Static185.aClass140_60, Static274.aClass140_76, Static108.aClass140_38, Static448.aClass140_122, Static446.aClass140_121, Static484.aClass140_133, Static285.aClass140_79, Static124.aClass140_45, Static536.aClass140_148, Static397.aClass140_111, Static24.aClass140_11, Static505.aClass140_139, Static316.aClass140_82, Static436.aClass140_104, Static57.aClass140_20, Static111.aClass140_40, Static25.aClass140_12, Static203.aClass140_66, Static449.aClass140_123, Static141.aClass140_46, Static329.aClass140_90, Static330.aClass140_93, Static241.aClass140_72, Static16.aClass140_6, Static497.aClass140_138, Static473.aClass140_129, Static320.aClass140_85, Static189.aClass140_61, Static185.aClass140_59, Static484.aClass140_132, Static189.aClass140_62, Static329.aClass140_91, Static369.aClass140_102, Static144.aClass140_49, Static369.aClass140_103, Static368.aClass140_101, Static467.aClass140_126, Static384.aClass140_105, Static51.aClass140_19, Static196.aClass140_64, Static488.aClass140_135, Static258.aClass140_74, Static34.aClass140_15, Static385.aClass140_106, Static373.aClass140_26, Static429.aClass140_137, Static339.aClass140_94, Static146.aClass140_50, Static96.aClass140_32, Static329.aClass140_92, Static173.aClass140_57, Static166.aClass140_55, Static62.aClass140_21, Static454.aClass140_124, Static351.aClass140_97, Static537.aClass140_150, Static88.aClass140_29, Static37.aClass140_16, Static98.aClass140_136, Static437.aClass140_119, Static364.aClass140_99, Static106.aClass140_37, Static248.aClass140_42, Static80.aClass140_27 };
	}
}
