import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "Lclient!tm;")
	public static Class338 aClass338_192 = new Class338();

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
	public static void method7008(@OriginalArg(1) int arg0) {
		Static492.anInt8116 = arg0;
		Static649.aClass165_78.method4403();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7009(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class3_Sub25 local13 = new Class3_Sub25(arg0);
		@Pc(17) int local17 = local13.method8632();
		@Pc(21) int local21 = local13.method8618();
		if (local21 < 0 || Static567.anInt5914 != 0 && local21 > Static567.anInt5914) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(43) byte[] local43 = new byte[local21];
			local13.method8623(0, local21, local43);
			return local43;
		} else {
			@Pc(55) int local55 = local13.method8618();
			if (local55 < 0 || Static567.anInt5914 != 0 && Static567.anInt5914 < local55) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local55];
			if (local17 == 1) {
				Static61.method1297(local76, local55, arg0, local21);
			} else {
				@Pc(81) Class169 local81 = Static380.aClass169_1;
				synchronized (Static380.aClass169_1) {
					Static380.aClass169_1.method4459(local76, local13);
				}
			}
			return local76;
		}
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)[Lclient!jw;")
	public static Class180[] method7011() {
		return new Class180[] { Static642.aClass180_206, Static148.aClass180_66, Static384.aClass180_144, Static292.aClass180_113, Static137.aClass180_50, Static256.aClass180_85, Static322.aClass180_121, Static99.aClass180_207, Static665.aClass180_215, Static292.aClass180_114, Static246.aClass180_96, Static68.aClass180_21, Static56.aClass180_18, Static433.aClass180_174, Static183.aClass180_74, Static1.aClass180_146, Static29.aClass180_7, Static321.aClass180_120, Static579.aClass180_188, Static421.aClass180_152, Static531.aClass180_176, Static41.aClass180_14, Static88.aClass180_33, Static672.aClass180_220, Static370.aClass180_138, Static94.aClass180_35, Static237.aClass180_94, Static189.aClass180_123, Static187.aClass180_77, Static454.aClass180_128, Static50.aClass180_16, Static136.aClass180_49, Static600.aClass180_190, Static219.aClass180_87, Static217.aClass180_83, Static390.aClass180_219, Static115.aClass180_40, Static230.aClass180_91, Static544.aClass180_178, Static419.aClass180_31, Static221.aClass180_88, Static552.aClass180_180, Static358.aClass180_132, Static647.aClass180_209, Static630.aClass180_201, Static144.aClass180_58, Static294.aClass180_149, Static343.aClass180_124, Static554.aClass180_182, Static37.aClass180_12, Static360.aClass180_134, Static513.aClass180_173, Static72.aClass180_24, Static456.aClass180_187, Static140.aClass180_52, Static63.aClass180_19, Static111.aClass180_39, Static225.aClass180_89, Static350.aClass180_131, Static179.aClass180_72, Static461.aClass180_157, Static311.aClass180_117, Static360.aClass180_135, Static384.aClass180_145, Static65.aClass180_20, Static152.aClass180_65, Static52.aClass180_17, Static271.aClass180_194, Static511.aClass180_172, Static150.aClass180_122, Static431.aClass180_153, Static226.aClass180_90, Static287.aClass180_112, Static346.aClass180_126, Static78.aClass180_75, Static180.aClass180_73, Static379.aClass180_142, Static451.aClass180_155, Static555.aClass180_183, Static139.aClass180_51, Static39.aClass180_13, Static391.aClass180_208, Static619.aClass180_218, Static374.aClass180_141, Static369.aClass180_136, Static608.aClass180_197, Static656.aClass180_213, Static79.aClass180_32, Static575.aClass180_186, Static676.aClass180_221, Static369.aClass180_137, Static164.aClass180_67, Static488.aClass180_166, Static147.aClass180_61, Static115.aClass180_41, Static271.aClass180_193, Static350.aClass180_130, Static238.aClass180_95, Static132.aClass180_47, Static631.aClass180_203, Static209.aClass180_81, Static77.aClass180_27, Static634.aClass180_204, Static553.aClass180_181, Static651.aClass180_210, Static248.aClass180_97, Static78.aClass180_76, Static231.aClass180_92, Static600.aClass180_189, Static663.aClass180_214, Static486.aClass180_165, Static477.aClass180_163, Static192.aClass180_79, Static274.aClass180_110, Static315.aClass180_119, Static142.aClass180_56, Static546.aClass180_179, Static382.aClass180_143, Static532.aClass180_177, Static464.aClass180_158, Static347.aClass180_129, Static91.aClass180_34, Static607.aClass180_196, Static372.aClass180_140, Static49.aClass180_15, Static508.aClass180_169, Static132.aClass180_48, Static630.aClass180_202, Static625.aClass180_200, Static654.aClass180_212, Static141.aClass180_55, Static133.aClass180_217, Static507.aClass180_162, Static151.aClass180_63 };
	}
}
