import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Z")
	public static boolean aBoolean795;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public static int anInt9395 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method7937(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1 || arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(35) int local35 = 2;
		for (@Pc(39) int local39 = arg0 / 10; local39 != 0; local39 /= 10) {
			local35++;
		}
		@Pc(53) char[] local53 = new char[local35];
		local53[0] = '+';
		for (@Pc(66) int local66 = local35 - 1; local66 > 0; local66--) {
			@Pc(69) int local69 = arg0;
			arg0 /= 10;
			@Pc(80) int local80 = local69 - arg0 * 10;
			if (local80 >= 10) {
				local53[local66] = (char) (local80 + 87);
			} else {
				local53[local66] = (char) (local80 + 48);
			}
		}
		return new String(local53);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)[Lclient!uw;")
	public static Class359[] method7938() {
		return new Class359[] { Static248.aClass359_86, Static469.aClass359_173, Static461.aClass359_167, Static139.aClass359_47, Static533.aClass359_208, Static397.aClass359_145, Static223.aClass359_72, Static607.aClass359_183, Static54.aClass359_15, Static471.aClass359_252, Static220.aClass359_85, Static471.aClass359_253, Static491.aClass359_188, Static665.aClass359_195, Static64.aClass359_19, Static160.aClass359_52, Static333.aClass359_117, Static663.aClass359_248, Static595.aClass359_224, Static485.aClass359_179, Static397.aClass359_144, Static220.aClass359_84, Static478.aClass359_177, Static99.aClass359_31, Static441.aClass359_160, Static278.aClass359_97, Static321.aClass359_112, Static406.aClass359_146, Static486.aClass359_181, Static633.aClass359_241, Static433.aClass359_155, Static235.aClass359_81, Static466.aClass359_170, Static455.aClass359_165, Static115.aClass359_40, Static269.aClass359_95, Static499.aClass359_193, Static504.aClass359_196, Static667.aClass359_249, Static616.aClass359_238, Static103.aClass359_32, Static598.aClass359_227, Static395.aClass359_143, Static603.aClass359_232, Static377.aClass359_135, Static441.aClass359_161, Static262.aClass359_93, Static282.aClass359_101, Static532.aClass359_205, Static35.aClass359_10, Static127.aClass359_43, Static214.aClass359_68, Static495.aClass359_192, Static280.aClass359_100, Static393.aClass359_142, Static484.aClass359_178, Static233.aClass359_78, Static542.aClass359_127, Static285.aClass359_102, Static60.aClass359_169, Static177.aClass359_56, Static93.aClass359_30, Static73.aClass359_21, Static514.aClass359_199, Static477.aClass359_176, Static555.aClass359_119, Static75.aClass359_24, Static415.aClass359_147, Static390.aClass359_141, Static107.aClass359_35, Static589.aClass359_220, Static72.aClass359_20, Static13.aClass359_200, Static268.aClass359_94, Static588.aClass359_219, Static421.aClass359_150, Static510.aClass359_140, Static279.aClass359_98, Static577.aClass359_218, Static653.aClass359_244, Static439.aClass359_157, Static674.aClass359_255, Static476.aClass359_175, Static130.aClass359_45, Static280.aClass359_99, Static114.aClass359_38, Static167.aClass359_54, Static180.aClass359_57, Static446.aClass359_162, Static136.aClass359_46, Static146.aClass359_48, Static491.aClass359_187, Static609.aClass359_235, Static295.aClass359_106, Static668.aClass359_251, Static36.aClass359_11, Static491.aClass359_186, Static595.aClass359_223, Static153.aClass359_51, Static602.aClass359_231, Static519.aClass359_201, Static553.aClass359_211, Static273.aClass359_96, Static255.aClass359_88, Static166.aClass359_53, Static422.aClass359_151, Static493.aClass359_190, Static662.aClass359_247, Static293.aClass359_105, Static571.aClass359_213, Static329.aClass359_115, Static485.aClass359_180, Static128.aClass359_44, Static321.aClass359_113, Static447.aClass359_163, Static486.aClass359_182, Static532.aClass359_204, Static495.aClass359_191, Static500.aClass359_194, Static554.aClass359_212, Static223.aClass359_71, Static582.aClass359_254, Static433.aClass359_153, Static623.aClass359_239, Static450.aClass359_164, Static388.aClass359_138, Static460.aClass359_166, Static512.aClass359_198, Static228.aClass359_75, Static601.aClass359_230, Static115.aClass359_39, Static358.aClass359_129, Static310.aClass359_111 };
	}
}
