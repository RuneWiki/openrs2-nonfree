import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!lca;")
	public static Class199 aClass199_2;

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "Lclient!fi;")
	public static Class102 aClass102_2;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "Lclient!gaa;")
	public static final Class3_Sub25_Sub1 aClass3_Sub25_Sub1_3 = new Class3_Sub25_Sub1(15000);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!qn;ILclient!aj;)V")
	public static void method7895(@OriginalArg(0) Class291 arg0, @OriginalArg(2) Class15 arg1) {
		Static513.aClass291_6 = arg0;
		Static87.aString13 = "";
		Static649.aClass15_160 = arg1;
		if (Class6_Sub8.aString37.startsWith("win")) {
			Static87.aString13 = Static87.aString13 + "windows/";
		} else if (Class6_Sub8.aString37.startsWith("linux")) {
			Static87.aString13 = Static87.aString13 + "linux/";
		} else if (Class6_Sub8.aString37.startsWith("mac")) {
			Static87.aString13 = Static87.aString13 + "macos/";
		}
		if (Static513.aClass291_6.aBoolean618) {
			Static87.aString13 = Static87.aString13 + "msjava/";
		} else if (Class6_Sub8.aString36.startsWith("amd64") || Class6_Sub8.aString36.startsWith("x86_64")) {
			Static87.aString13 = Static87.aString13 + "x86_64/";
		} else if (Class6_Sub8.aString36.startsWith("i386") || Class6_Sub8.aString36.startsWith("i486") || Class6_Sub8.aString36.startsWith("i586") || Class6_Sub8.aString36.startsWith("x86")) {
			Static87.aString13 = Static87.aString13 + "x86/";
		} else if (Class6_Sub8.aString36.startsWith("ppc")) {
			Static87.aString13 = Static87.aString13 + "ppc/";
		} else {
			Static87.aString13 = Static87.aString13 + "universal/";
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIIZ)V")
	public static void method7896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(28) int local28 = arg1 - 334;
		if (local28 < 0) {
			local28 = 0;
		} else if (local28 > 100) {
			local28 = 100;
		}
		@Pc(52) int local52 = (Static387.aShort56 - Static403.aShort71) * local28 / 100 + Static403.aShort71;
		if (local52 < Static569.aShort97) {
			local52 = Static569.aShort97;
		} else if (local52 > Static492.aShort86) {
			local52 = Static492.aShort86;
		}
		@Pc(78) int local78 = local52 * 512 * arg1 / (arg0 * 334);
		@Pc(119) int local119;
		@Pc(126) int local126;
		@Pc(90) short local90;
		if (Static546.aShort96 > local78) {
			local90 = Static546.aShort96;
			local52 = local90 * 334 * arg0 / (arg1 * 512);
			if (Static492.aShort86 < local52) {
				local52 = Static492.aShort86;
				local119 = local52 * 512 * arg1 / (local90 * 334);
				local126 = (arg0 - local119) / 2;
				if (arg4) {
					Static674.aClass13_22.la();
					Static674.aClass13_22.method8452(local126, arg3, arg1, arg2, -16777216);
					Static674.aClass13_22.method8452(local126, arg3, arg1, arg0 + arg2 - local126, -16777216);
				}
				arg2 += local126;
				arg0 -= local126 * 2;
			}
		} else if (Static265.aShort45 < local78) {
			local90 = Static265.aShort45;
			local52 = local90 * arg0 * 334 / (arg1 * 512);
			if (local52 < Static569.aShort97) {
				local52 = Static569.aShort97;
				local119 = local90 * arg0 * 334 / (local52 * 512);
				local126 = (arg1 - local119) / 2;
				if (arg4) {
					Static674.aClass13_22.la();
					Static674.aClass13_22.method8452(arg0, arg3, local126, arg2, -16777216);
					Static674.aClass13_22.method8452(arg0, arg3 + arg1 - local126, local126, arg2, -16777216);
				}
				arg3 += local126;
				arg1 -= local126 * 2;
			}
		}
		Static669.anInt10705 = arg2;
		Static509.anInt8221 = (short) arg1;
		Static152.anInt3031 = local52 * arg1 / 334;
		Static180.anInt3540 = arg3;
		Static235.anInt4338 = (short) arg0;
	}
}
