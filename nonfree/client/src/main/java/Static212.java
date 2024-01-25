import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "Lclient!jn;")
	public static Class176 aClass176_59;

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "Lclient!jn;")
	public static Class176 aClass176_60;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_30 = new Class244();

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_66 = new Class173(47, 7);

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_10 = new Class162(3, 7);

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "[I")
	public static final int[] anIntArray191 = new int[5];

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
	public static int anInt3952 = 503;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "[I")
	public static final int[] anIntArray192 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)[Lclient!wo;")
	public static Class362[] method3529() {
		return new Class362[] { Static542.aClass362_216, Static72.aClass362_174, Static243.aClass362_98, Static480.aClass362_230, Static174.aClass362_78, Static440.aClass362_182, Static264.aClass362_109, Static490.aClass362_198, Static234.aClass362_95, Static6.aClass362_7, Static189.aClass362_83, Static539.aClass362_211, Static99.aClass362_51, Static263.aClass362_108, Static222.aClass362_90, Static297.aClass362_127, Static371.aClass362_155, Static84.aClass362_43, Static523.aClass362_204, Static314.aClass362_134, Static474.aClass362_197, Static265.aClass362_113, Static331.aClass362_141, Static301.aClass362_129, Static544.aClass362_217, Static159.aClass362_74, Static42.aClass362_27, Static262.aClass362_107, Static329.aClass362_140, Static569.aClass362_228, Static261.aClass362_106, Static340.aClass362_145, Static236.aClass362_96, Static113.aClass362_62, Static385.aClass362_159, Static266.aClass362_114, Static70.aClass362_37, Static322.aClass362_137, Static196.aClass362_86, Static427.aClass362_176, Static53.aClass362_28, Static332.aClass362_142, Static122.aClass362_64, Static298.aClass362_128, Static412.aClass362_172, Static59.aClass362_32, Static266.aClass362_115, Static524.aClass362_227, Static526.aClass362_77, Static251.aClass362_99, Static585.aClass362_220, Static315.aClass362_135, Static187.aClass362_82, Static583.aClass362_231, Static264.aClass362_110, Static458.aClass362_191, Static453.aClass362_189, Static58.aClass362_31, Static466.aClass362_214, Static104.aClass362_53, Static367.aClass362_151, Static136.aClass362_67, Static26.aClass362_19, Static462.aClass362_193, Static471.aClass362_194, Static439.aClass362_181, Static14.aClass362_8, Static456.aClass362_190, Static433.aClass362_179, Static335.aClass362_144, Static367.aClass362_150, Static306.aClass362_130, Static502.aClass362_199, Static17.aClass362_10, Static232.aClass362_93, Static15.aClass362_9, Static140.aClass362_52, Static42.aClass362_26, Static99.aClass362_50, Static17.aClass362_11, Static463.aClass362_154, Static71.aClass362_39, Static542.aClass362_215, Static111.aClass362_60, Static124.aClass362_219, Static468.aClass362_55, Static73.aClass362_40, Static530.aClass362_206, Static191.aClass362_85, Static34.aClass362_24, Static34.aClass362_25, Static518.aClass362_202, Static553.aClass362_221, Static111.aClass362_61, Static559.aClass362_223, Static68.aClass362_36, Static308.aClass362_131, Static375.aClass362_156, Static65.aClass362_35, Static446.aClass362_186, Static572.aClass362_225, Static148.aClass362_229, Static33.aClass362_23, Static439.aClass362_180, Static75.aClass362_21, Static424.aClass362_175, Static558.aClass362_222, Static309.aClass362_132, Static416.aClass362_173, Static440.aClass362_183, Static515.aClass362_201, Static521.aClass362_203, Static241.aClass362_97, Static98.aClass362_49, Static535.aClass362_210, Static275.aClass362_122, Static219.aClass362_89, Static265.aClass362_112 };
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIIIII)V")
	public static void method3531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static214.aClass4_Sub19_Sub1_1.anInt3064 != 0 && arg4 != 0 && Static459.anInt8551 < 50 && arg0 != -1) {
			Static104.aClass281Array1[Static459.anInt8551++] = new Class281((byte) 1, arg0, arg4, arg3, arg1, 0, arg2, null);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
	public static void method3532(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg0, 5);
		local8.method7134();
	}
}
