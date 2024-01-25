import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!na", name = "R", descriptor = "Lclient!us;")
	public static final Class234 aClass234_84 = new Class234(51, 4);

	@OriginalMember(owner = "client!na", name = "V", descriptor = "Lclient!cp;")
	public static final Class44 aClass44_25 = new Class44(512);

	@OriginalMember(owner = "client!na", name = "W", descriptor = "[I")
	public static int[] anIntArray433 = new int[2];

	@OriginalMember(owner = "client!na", name = "X", descriptor = "Lclient!kr;")
	public static Class138 aClass138_34 = new Class138();

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "Lclient!gm;")
	public static final Class3_Sub17 aClass3_Sub17_1 = new Class3_Sub17(0, 0);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)I")
	public static int method3806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg0;
			arg0 = local12;
		}
		@Pc(20) int local20 = arg2 & 0x3;
		if (local20 == 0) {
			return arg5;
		} else if (local20 == 1) {
			return arg4;
		} else if (local20 == 2) {
			return 7 + 1 - arg5 - arg1;
		} else {
			return 1 + 7 - arg0 - arg4;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V")
	public static void method3807(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(12, arg0);
		local8.method3217();
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)[Lclient!us;")
	public static Class234[] method3808() {
		return new Class234[] { Static198.aClass234_74, Static293.aClass234_103, Static339.aClass234_115, Static227.aClass234_82, Static56.aClass234_24, Static104.aClass234_45, Static23.aClass234_11, Static308.aClass234_108, Static226.aClass234_80, Static216.aClass234_125, Static175.aClass234_67, Static317.aClass234_90, Static179.aClass234_68, Static235.aClass234_86, Static79.aClass234_35, Static102.aClass234_44, Static55.aClass234_22, Static96.aClass234_42, Static261.aClass234_91, Static187.aClass234_72, Static135.aClass234_53, Static135.aClass234_54, Static23.aClass234_10, Static379.aClass234_129, Static343.aClass234_117, Static123.aClass234_50, Static61.aClass234_26, Static61.aClass234_25, Static4.aClass234_1, Static216.aClass234_124, Static248.aClass234_88, Static350.aClass234_120, Static175.aClass234_66, Static113.aClass234_47, Static296.aClass234_105, Static80.aClass234_36, Static135.aClass234_52, Static226.aClass234_81, Static252.aClass234_89, Static380.aClass234_130, Static182.aClass234_70, Static37.aClass234_19, Static356.aClass234_13, Static153.aClass234_62, Static145.aClass234_59, Static138.aClass234_58, Static62.aClass234_27, Static328.aClass234_111, Static385.aClass234_131, Static372.aClass234_128, Static77.aClass234_34, aClass234_84, Static306.aClass234_107, Static118.aClass234_48, Static55.aClass234_23, Static313.aClass234_118, Static300.aClass234_106, Static14.aClass234_8, Static188.aClass234_73, Static280.aClass234_97, Static138.aClass234_57, Static315.aClass234_110, Static355.aClass234_122, Static113.aClass234_46, Static352.aClass234_121, Static96.aClass234_43, Static83.aClass234_37, Static72.aClass234_32, Static204.aClass234_98, Static136.aClass234_56, Static131.aClass234_51, Static182.aClass234_69, Static273.aClass234_93, Static279.aClass234_119, Static162.aClass234_63, Static90.aClass234_38, Static329.aClass234_112, Static338.aClass234_114, Static6.aClass234_2, Static38.aClass234_20, Static228.aClass234_83, Static66.aClass234_29, Static95.aClass234_127, Static150.aClass234_87, Static289.aClass234_102, Static330.aClass234_113, Static91.aClass234_65, Static261.aClass234_92, Static342.aClass234_116, Static219.aClass234_78, Static289.aClass234_100, Static282.aClass234_99, Static365.aClass234_126, Static289.aClass234_101, Static118.aClass234_49, Static47.aClass234_21, Static21.aClass234_9, Static366.aClass234_96, Static163.aClass234_60, Static213.aClass234_75, Static231.aClass234_85, Static152.aClass234_61, Static30.aClass234_14, Static65.aClass234_28, Static12.aClass234_7, Static73.aClass234_33 };
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(III)V")
	public static void method3809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub7_Sub8 local12 = Static275.method4307(16, arg0);
		local12.method3219();
		local12.anInt3670 = arg1;
	}
}
