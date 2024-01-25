import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "Z")
	public static boolean aBoolean306;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "Lclient!vr;")
	public static Class258 aClass258_7;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "[I")
	public static final int[] anIntArray362 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "[I")
	public static final int[] anIntArray363 = new int[5];

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)[Lclient!rb;")
	public static Class211[] method3497() {
		return new Class211[] { Static386.aClass211_137, Static30.aClass211_17, Static354.aClass211_123, Static124.aClass211_33, Static20.aClass211_8, Static361.aClass211_125, Static116.aClass211_54, Static273.aClass211_103, Static245.aClass211_94, Static251.aClass211_97, Static148.aClass211_64, Static36.aClass211_22, Static312.aClass211_115, Static384.aClass211_134, Static289.aClass211_107, Static85.aClass211_42, Static185.aClass211_76, Static70.aClass211_40, Static96.aClass211_48, Static402.aClass211_143, Static116.aClass211_53, Static424.aClass211_148, Static428.aClass211_155, Static228.aClass211_89, Static17.aClass211_6, Static59.aClass211_74, Static39.aClass211_24, Static68.aClass211_112, Static257.aClass211_100, Static221.aClass211_85, Static253.aClass211_99, Static53.aClass211_25, Static117.aClass211_55, Static229.aClass211_90, Static140.aClass211_61, Static334.aClass211_117, Static67.aClass211_36, Static372.aClass211_130, Static431.aClass211_156, Static252.aClass211_98, Static93.aClass211_46, Static199.aClass211_81, Static375.aClass211_131, Static224.aClass211_86, Static239.aClass211_92, Static7.aClass211_5, Static112.aClass211_93, Static226.aClass211_87, Static424.aClass211_147, Static59.aClass211_75, Static20.aClass211_7, Static404.aClass211_149, Static385.aClass211_136, Static289.aClass211_106, Static4.aClass211_4, Static128.aClass211_56, Static364.aClass211_129, Static385.aClass211_135, Static317.aClass211_151, Static343.aClass211_118, Static361.aClass211_126, Static378.aClass211_133, Static320.aClass211_116, Static228.aClass211_88, Static403.aClass211_144, Static259.aClass211_102, Static303.aClass211_113, Static418.aClass211_154, Static392.aClass211_140, Static189.aClass211_77, Static61.aClass211_34, Static150.aClass211_65, Static346.aClass211_120, Static95.aClass211_59, Static208.aClass211_82, Static360.aClass211_124, Static90.aClass211_43, Static54.aClass211_27, Static92.aClass211_45, Static296.aClass211_109, Static146.aClass211_63, Static352.aClass211_121, Static450.aClass211_159, Static192.aClass211_78, Static375.aClass211_132, Static161.aClass211_128, Static101.aClass211_49, Static400.aClass211_142, Static235.aClass211_91, Static162.aClass211_68, Static446.aClass211_157, Static363.aClass211_127, Static175.aClass211_72, Static295.aClass211_108, Static79.aClass211_41, Static64.aClass211_35, Static257.aClass211_101, Static223.aClass211_153, Static113.aClass211_51, Static25.aClass211_12, Static26.aClass211_13, Static283.aClass211_105, Static170.aClass211_70, Static243.aClass211_21, Static141.aClass211_62, Static116.aClass211_52, Static387.aClass211_138, Static243.aClass211_20, Static312.aClass211_114, Static24.aClass211_11, Static29.aClass211_16, Static447.aClass211_158, Static155.aClass211_66 };
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)Lclient!bi;")
	public static Class24 method3499(@OriginalArg(1) int arg0) {
		@Pc(12) Class24 local12 = (Class24) Static168.aClass132_20.method2701((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static357.aClass54_93.method1126(0, arg0);
		local12 = new Class24();
		if (local27 != null) {
			local12.method464(arg0, new Class2_Sub13(local27));
		}
		Static168.aClass132_20.method2711(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZIZ)I")
	public static int method3500(@OriginalArg(1) int arg0) {
		@Pc(20) Class2_Sub36 local20 = Static382.method4911(false, arg0);
		if (local20 == null) {
			return Static331.aClass271_1.method5708(arg0).anInt6072;
		}
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < local20.anIntArray395.length; local32++) {
			if (local20.anIntArray395[local32] == -1) {
				local30++;
			}
		}
		return local30 + Static331.aClass271_1.method5708(arg0).anInt6072 - local20.anIntArray395.length;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BI)Z")
	public static boolean method3501(@OriginalArg(1) int arg0) {
		if (Static119.aBooleanArray10[arg0]) {
			return true;
		} else if (Static445.aClass54_116.method1103(arg0)) {
			@Pc(28) int local28 = Static445.aClass54_116.method1123(arg0);
			if (local28 == 0) {
				Static119.aBooleanArray10[arg0] = true;
				return true;
			}
			if (Static151.aClass16ArrayArray1[arg0] == null) {
				Static151.aClass16ArrayArray1[arg0] = new Class16[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static151.aClass16ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static445.aClass54_116.method1126(arg0, local47);
					if (local61 != null) {
						@Pc(73) Class16 local73 = Static151.aClass16ArrayArray1[arg0][local47] = new Class16();
						local73.anInt293 = (arg0 << 16) + local47;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method244(new Class2_Sub13(local61));
					}
				}
			}
			Static119.aBooleanArray10[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
