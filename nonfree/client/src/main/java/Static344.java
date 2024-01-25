import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!th;")
	public static Class338 aClass338_8;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
	public static int anInt5895;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "Lclient!uq;")
	public static Class362 aClass362_72;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "[J")
	public static final long[] aLongArray12 = new long[32];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method5000(@OriginalArg(0) Class3_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static582.aClass35Array3 != Static368.aClass35Array1) {
			@Pc(12) int local12 = Static556.aClass35Array2[arg1].method7452(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class35 local19 = Static556.aClass35Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7452(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7460(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Lclient!tga;")
	public static Class3_Sub12_Sub3 method5002() {
		return Static574.aClass3_Sub12_Sub3_3;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)[Lclient!jb;")
	public static Class171[] method5007() {
		return new Class171[] { Static627.aClass171_155, Static562.aClass171_136, Static577.aClass171_142, Static414.aClass171_104, Static280.aClass171_69, Static242.aClass171_115, Static225.aClass171_44, Static349.aClass171_93, Static571.aClass171_140, Static319.aClass171_81, Static112.aClass171_24, Static468.aClass171_121, Static122.aClass171_26, Static41.aClass171_10, Static445.aClass171_118, Static354.aClass171_95, Static228.aClass171_45, Static571.aClass171_139, Static337.aClass171_153, Static328.aClass171_86, Static576.aClass171_141, Static187.aClass171_37, Static273.aClass171_66, Static229.aClass171_48, Static251.aClass171_58, Static351.aClass171_94, Static32.aClass171_9, Static676.aClass171_162, Static214.aClass171_146, Static302.aClass171_74, Static27.aClass171_6, Static424.aClass171_108, Static316.aClass171_80, Static241.aClass171_53, Static389.aClass171_103, Static303.aClass171_76, Static190.aClass171_38, Static170.aClass171_35, Static241.aClass171_54, Static256.aClass171_61, Static337.aClass171_152, Static185.aClass171_36, Static426.aClass171_112, Static430.aClass171_113, Static281.aClass171_70, Static516.aClass171_129, Static108.aClass171_22, Static505.aClass171_128, Static254.aClass171_60, Static666.aClass171_160, Static149.aClass171_33, Static414.aClass171_105, Static295.aClass171_73, Static101.aClass171_18, Static358.aClass171_97, Static619.aClass171_150, Static340.aClass171_92, Static627.aClass171_154, Static108.aClass171_21, Static210.aClass171_42, Static388.aClass171_102, Static100.aClass171_17, Static494.aClass171_125, Static209.aClass171_41, Static312.aClass171_78, Static421.aClass171_107, Static11.aClass171_2, Static356.aClass171_96, Static54.aClass171_11, Static67.aClass171_14, Static274.aClass171_67, Static206.aClass171_40, Static489.aClass171_123, Static568.aClass171_138, Static149.aClass171_32, Static241.aClass171_52, Static234.aClass171_49, Static285.aClass171_71, Static377.aClass171_126, Static105.aClass171_20, Static244.aClass171_56, Static322.aClass171_84, Static124.aClass171_27, Static329.aClass171_87, Static237.aClass171_50, Static631.aClass171_156, Static204.aClass171_39, Static591.aClass171_144, Static610.aClass171_148, Static493.aClass171_124, Static211.aClass171_43, Static465.aClass171_120, Static382.aClass171_101, Static319.aClass171_82, Static498.aClass171_163, Static331.aClass171_88, Static272.aClass171_65, Static302.aClass171_75, Static426.aClass171_111, Static128.aClass171_29, Static523.aClass171_130, Static445.aClass171_117, Static589.aClass171_143, Static10.aClass171_1, Static169.aClass171_34, Static109.aClass171_23, Static33.aClass171_134, Static453.aClass171_119, Static57.aClass171_12, Static568.aClass171_137, Static613.aClass171_149, Static261.aClass171_63, Static667.aClass171_161, Static328.aClass171_85, Static61.aClass171_13, Static622.aClass171_151, Static381.aClass171_100, Static598.aClass171_145, Static440.aClass171_116, Static278.aClass171_68, Static247.aClass171_57, Static472.aClass171_122, Static530.aClass171_131, Static294.aClass171_159, Static372.aClass171_98, Static96.aClass171_16, Static651.aClass171_158, Static25.aClass171_5, Static261.aClass171_62, Static641.aClass171_157, Static425.aClass171_109, Static609.aClass171_147, Static320.aClass171_83 };
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(II)V")
	public static void method5009(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub15 local13 = (Class3_Sub15) Static484.aClass333_30.method7489((long) arg0);
		if (local13 != null) {
			local13.aClass207_Sub1_1.method8466();
			Static417.method5667(local13.anInt2738, local13.aBoolean205);
			local13.method9034();
		}
	}
}
