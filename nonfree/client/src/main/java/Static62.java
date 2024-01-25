import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static62 {

	@OriginalMember(owner = "client!br", name = "h", descriptor = "Z")
	public static boolean aBoolean126 = false;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "Lclient!pk;")
	public static final Class293 aClass293_1 = new Class293();

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method940(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method941(@OriginalArg(1) byte[] arg0) {
		return Static155.method2227(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BII)Z")
	public static boolean method942(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)[Lclient!lk;")
	public static Class225[] method943() {
		return new Class225[] { Static302.aClass225_90, Static268.aClass225_77, Static465.aClass225_137, Static176.aClass225_57, Static617.aClass225_185, Static77.aClass225_28, Static160.aClass225_47, Static307.aClass225_93, Static123.aClass225_37, Static527.aClass225_158, Static167.aClass225_52, Static570.aClass225_169, Static605.aClass225_181, Static596.aClass225_178, Static594.aClass225_177, Static671.aClass225_201, Static674.aClass225_202, Static583.aClass225_42, Static541.aClass225_160, Static624.aClass225_188, Static273.aClass225_80, Static455.aClass225_133, Static572.aClass225_172, Static618.aClass225_187, Static642.aClass225_191, Static627.aClass225_189, Static510.aClass225_153, Static141.aClass225_171, Static705.aClass225_206, Static225.aClass225_65, Static336.aClass225_99, Static337.aClass225_101, Static638.aClass225_190, Static500.aClass225_149, Static511.aClass225_154, Static180.aClass225_117, Static225.aClass225_66, Static660.aClass225_199, Static608.aClass225_182, Static685.aClass225_203, Static230.aClass225_67, Static371.aClass225_114, Static285.aClass225_83, Static162.aClass225_49, Static296.aClass225_88, Static288.aClass225_86, Static17.aClass225_13, Static34.aClass225_162, Static652.aClass225_197, Static714.aClass225_208, Static648.aClass225_194, Static592.aClass225_176, Static218.aClass225_62, Static704.aClass225_205, Static224.aClass225_211, Static294.aClass225_120, Static489.aClass225_144, Static173.aClass225_56, Static85.aClass225_30, Static631.aClass225_159, Static482.aClass225_139, Static458.aClass225_135, Static526.aClass225_157, Static399.aClass225_124, Static34.aClass225_163, Static650.aClass225_196, Static48.aClass225_19, Static313.aClass225_94, Static307.aClass225_92, Static498.aClass225_148, Static8.aClass225_7, Static511.aClass225_155, Static231.aClass225_69, Static168.aClass225_53, Static455.aClass225_132, Static5.aClass225_1, Static324.aClass225_98, Static434.aClass225_126, Static89.aClass225_31, Static441.aClass225_129, Static15.aClass225_12, Static140.aClass225_43, Static132.aClass225_39, Static584.aClass225_173, Static388.aClass225_122, Static712.aClass225_207, Static85.aClass225_29, Static235.aClass225_71, Static206.aClass225_60, Static648.aClass225_195, Static313.aClass225_95, Static565.aClass225_168, Static612.aClass225_184, Static233.aClass225_70, Static545.aClass225_164, Static196.aClass225_59, Static358.aClass225_107, Static114.aClass225_35, Static495.aClass225_145, Static621.aClass225_186, Static345.aClass225_104, Static133.aClass225_40, Static724.aClass225_210, Static339.aClass225_103, Static285.aClass225_84, Static680.aClass225_204, Static255.aClass225_73, Static272.aClass225_79, Static646.aClass225_192, Static352.aClass225_105, Static128.aClass225_38, Static213.aClass225_61, Static377.aClass225_119, Static14.aClass225_11, Static154.aClass225_46, Static464.aClass225_136, Static611.aClass225_183, Static376.aClass225_118, Static471.aClass225_138, Static121.aClass225_36, Static275.aClass225_82, Static722.aClass225_209, Static398.aClass225_123, Static595.aClass225_143, Static230.aClass225_68, Static7.aClass225_5, Static372.aClass225_115, Static7.aClass225_6, Static296.aClass225_89, Static243.aClass225_72, Static306.aClass225_91, Static60.aClass225_26, Static556.aClass225_166, Static25.aClass225_14, Static550.aClass225_165, Static336.aClass225_100, Static588.aClass225_174, Static191.aClass225_58, Static320.aClass225_175, Static220.aClass225_63, Static53.aClass225_25, Static456.aClass225_134, Static338.aClass225_102, Static268.aClass225_78, Static442.aClass225_130 };
	}
}
