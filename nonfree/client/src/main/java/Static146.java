import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_80 = new Class77(62, 1);

	@OriginalMember(owner = "client!id", name = "t", descriptor = "I")
	public static int anInt2670 = 3;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	public static int anInt2671 = 0;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "[Lclient!vh;")
	public static final Class236[] aClass236Array1 = new Class236[50];

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)[Lclient!fn;")
	public static Class77[] method2504() {
		return new Class77[] { Static373.aClass77_174, Static229.aClass77_163, Static264.aClass77_122, Static59.aClass77_27, Static286.aClass77_135, Static55.aClass77_24, Static126.aClass77_71, Static298.aClass77_139, Static123.aClass77_69, Static226.aClass77_110, Static276.aClass77_130, Static375.aClass77_112, Static55.aClass77_25, Static184.aClass77_171, Static53.aClass77_20, Static169.aClass77_86, Static108.aClass77_55, Static377.aClass77_175, Static250.aClass77_120, Static336.aClass77_153, Static197.aClass77_93, Static97.aClass77_53, Static362.aClass77_172, Static252.aClass77_121, Static226.aClass77_111, Static60.aClass77_28, Static375.aClass77_113, Static223.aClass77_109, Static140.aClass77_151, Static155.aClass77_83, Static273.aClass77_127, Static174.aClass77_180, Static333.aClass77_152, Static363.aClass77_154, Static390.aClass77_179, Static68.aClass77_33, Static135.aClass77_76, Static284.aClass77_134, Static364.aClass77_138, Static199.aClass77_94, Static89.aClass77_50, Static32.aClass77_162, Static54.aClass77_23, Static275.aClass77_129, Static171.aClass77_87, Static347.aClass77_165, Static85.aClass77_49, Static243.aClass77_118, Static266.aClass77_124, Static109.aClass77_58, Static389.aClass77_177, Static326.aClass77_146, Static191.aClass77_91, Static353.aClass77_168, Static331.aClass77_150, Static208.aClass77_99, Static211.aClass77_102, Static103.aClass77_54, Static118.aClass77_67, Static258.aClass77_108, Static33.aClass77_16, Static203.aClass77_95, aClass77_80, Static112.aClass77_66, Static29.aClass77_10, Static187.aClass77_90, Static120.aClass77_68, Static330.aClass77_149, Static32.aClass77_161, Static127.aClass77_73, Static329.aClass77_148, Static6.aClass77_4, Static111.aClass77_63, Static288.aClass77_136, Static367.aClass77_173, Static67.aClass77_32, Static35.aClass77_17, Static387.aClass77_156, Static128.aClass77_74, Static390.aClass77_178, Static155.aClass77_82, Static301.aClass77_140, Static382.aClass77_176, Static280.aClass77_133, Static38.aClass77_18, Static237.aClass77_117, Static235.aClass77_115, Static126.aClass77_70, Static134.aClass77_75, Static279.aClass77_132, Static246.aClass77_119, Static358.aClass77_170, Static340.aClass77_159, Static352.aClass77_166, Static269.aClass77_125, Static312.aClass77_141, Static2.aClass77_96, Static63.aClass77_29, Static305.aClass77_57, Static156.aClass77_85, Static126.aClass77_72, Static340.aClass77_158, Static153.aClass77_81, Static32.aClass77_160, Static352.aClass77_167 };
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ji;ILclient!fr;Lclient!km;)V")
	public static void method2506(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) Class82 arg2) {
		@Pc(10) Class5 local10 = arg1.method1853(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5002();
		if (local16 < local10.method4999()) {
			local16 = local10.method4999();
		}
		@Pc(32) int local32 = arg0.anInt2995;
		@Pc(35) int local35 = arg0.anInt3004;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg1.aString23 != null) {
			local37 = Static296.aClass216_6.method5072(null, arg1.aString23, null, Static22.aStringArray5);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static22.aStringArray5[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static172.aClass176_8.method4162(local61);
				if (local82 > local39) {
					local39 = local82;
				}
			}
			local41 = Static172.aClass176_8.method4159() * local37 + Static172.aClass176_8.method4158() / 2;
		}
		local55 = local16 / 2 + arg0.anInt2995;
		@Pc(119) int local119 = arg0.anInt3004;
		if (local16 + Static302.anInt394 > local32) {
			local32 = Static302.anInt394;
			local55 = local39 / 2 + Static302.anInt394 + local16 / 2 + 5 + 10;
		} else if (Static302.anInt397 - local16 < local32) {
			local32 = Static302.anInt397 - local16;
			local55 = Static302.anInt397 - local16 / 2 - local39 / 2 - 10 - 5;
		}
		if (local16 + Static302.anInt392 > local35) {
			local119 = Static302.anInt392 + local16 / 2 + 10;
			local35 = Static302.anInt392;
		} else if (local35 > Static302.anInt390 - local16) {
			local119 = Static302.anInt390 - local16 / 2 - local41 - 10;
			local35 = Static302.anInt390 - local16;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg0.anInt2995), (double) (local35 - arg0.anInt3004)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method4993((float) local16 / 2.0F + (float) local32, (float) local35 + (float) local16 / 2.0F, 4096, local82);
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		if (arg1.aString23 != null) {
			local259 = local119;
			local257 = local55 - local39 / 2 - 5;
			local261 = local39 + local257 + 10;
			local263 = local37 * Static172.aClass176_8.method4159() + local119 + 3;
			if (arg1.anInt2029 != 0) {
				arg2.method4486(local263 - local119, local261 + -local257, local257, arg1.anInt2029, local119);
			}
			if (arg1.anInt2050 != 0) {
				arg2.method4525(local261 - local257, -local119 + local263, local119, arg1.anInt2050, local257);
			}
			for (@Pc(335) int local335 = 0; local335 < local37; local335++) {
				@Pc(341) String local341 = Static22.aStringArray5[local335];
				if (local37 - 1 > local335) {
					local341 = local341.substring(0, local341.length() - 4);
				}
				Static172.aClass176_8.method4156(arg2, local341, local55, local119, arg1.anInt2031);
				local119 += Static172.aClass176_8.method4159();
			}
		}
		if (arg1.anInt2037 == -1 && arg1.aString23 == null) {
			return;
		}
		@Pc(389) Class2_Sub39 local389 = new Class2_Sub39(arg0);
		local16 >>= 0x1;
		local389.anInt6186 = local259;
		local389.anInt6192 = local263;
		local389.anInt6188 = local16 + local35;
		local389.anInt6189 = local32 - local16;
		local389.anInt6185 = local261;
		local389.anInt6184 = local257;
		local389.anInt6187 = local16 + local32;
		local389.anInt6190 = local35 - local16;
		Static100.aClass210_16.method5044(local389);
	}
}
