import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!ph;")
	public static Class187 aClass187_107;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "[Lclient!ei;")
	public static final Class10_Sub1_Sub4[] aClass10_Sub1_Sub4Array4 = new Class10_Sub1_Sub4[14];

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Lclient!je;")
	public static final Class127 aClass127_15 = new Class127(15, 0, 1, 0);

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	public static int anInt5937 = 0;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_85 = new Class27(17, 16);

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
	public static int anInt5939 = 503;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V")
	public static void method4719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class10_Sub23 local6 = (Class10_Sub23) Static418.aClass163_43.method3620(); local6 != null; local6 = (Class10_Sub23) Static418.aClass163_43.method3621()) {
			Static302.method4201(arg3, arg2, local6, arg0, arg1);
		}
		for (@Pc(31) Class10_Sub23 local31 = (Class10_Sub23) Static104.aClass163_19.method3620(); local31 != null; local31 = (Class10_Sub23) Static104.aClass163_19.method3621()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class6 local40 = local31.aClass24_Sub3_Sub2_Sub1_1.method4923();
			if (local31.aClass24_Sub3_Sub2_Sub1_1.aBoolean403) {
				local35 = 0;
			} else if (local40.anInt77 == local31.aClass24_Sub3_Sub2_Sub1_1.anInt6238 || local31.aClass24_Sub3_Sub2_Sub1_1.anInt6238 == local40.anInt65 || local31.aClass24_Sub3_Sub2_Sub1_1.anInt6238 == local40.anInt41 || local31.aClass24_Sub3_Sub2_Sub1_1.anInt6238 == local40.anInt70) {
				local35 = 2;
			} else if (local31.aClass24_Sub3_Sub2_Sub1_1.anInt6238 == local40.anInt74 || local40.anInt54 == local31.aClass24_Sub3_Sub2_Sub1_1.anInt6238 || local31.aClass24_Sub3_Sub2_Sub1_1.anInt6238 == local40.anInt58 || local31.aClass24_Sub3_Sub2_Sub1_1.anInt6238 == local40.anInt38) {
				local35 = 3;
			}
			if (local31.anInt3994 != local35) {
				@Pc(131) int local131 = Static109.method1900(local31.aClass24_Sub3_Sub2_Sub1_1);
				if (local31.anInt3996 != local131) {
					if (local31.aClass10_Sub7_Sub1_2 != null) {
						Static461.aClass10_Sub7_Sub2_5.method1841(local31.aClass10_Sub7_Sub1_2);
						local31.aClass10_Sub7_Sub1_2 = null;
					}
					local31.anInt3996 = local131;
				}
				local31.anInt3994 = local35;
			}
			local31.anInt4002 = local31.aClass24_Sub3_Sub2_Sub1_1.anInt7092;
			local31.anInt3992 = local31.aClass24_Sub3_Sub2_Sub1_1.anInt7092 + (local31.aClass24_Sub3_Sub2_Sub1_1.method4919() << 6);
			local31.anInt4005 = local31.aClass24_Sub3_Sub2_Sub1_1.anInt7094;
			local31.anInt3995 = local31.aClass24_Sub3_Sub2_Sub1_1.anInt7094 + (local31.aClass24_Sub3_Sub2_Sub1_1.method4919() << 6);
			Static302.method4201(arg3, arg2, local31, arg0, arg1);
		}
		for (@Pc(204) Class10_Sub23 local204 = (Class10_Sub23) Static414.aClass167_32.method3702(); local204 != null; local204 = (Class10_Sub23) Static414.aClass167_32.method3708()) {
			@Pc(216) byte local216 = 1;
			@Pc(221) Class6 local221 = local204.aClass24_Sub3_Sub2_Sub2_3.method4923();
			if (local204.aClass24_Sub3_Sub2_Sub2_3.aBoolean403) {
				local216 = 0;
			} else if (local204.aClass24_Sub3_Sub2_Sub2_3.anInt6238 == local221.anInt77 || local204.aClass24_Sub3_Sub2_Sub2_3.anInt6238 == local221.anInt65 || local221.anInt41 == local204.aClass24_Sub3_Sub2_Sub2_3.anInt6238 || local204.aClass24_Sub3_Sub2_Sub2_3.anInt6238 == local221.anInt70) {
				local216 = 2;
			} else if (local204.aClass24_Sub3_Sub2_Sub2_3.anInt6238 == local221.anInt74 || local221.anInt54 == local204.aClass24_Sub3_Sub2_Sub2_3.anInt6238 || local204.aClass24_Sub3_Sub2_Sub2_3.anInt6238 == local221.anInt58 || local221.anInt38 == local204.aClass24_Sub3_Sub2_Sub2_3.anInt6238) {
				local216 = 3;
			}
			if (local204.anInt3994 != local216) {
				@Pc(324) int local324 = Static125.method2191(local204.aClass24_Sub3_Sub2_Sub2_3);
				if (local324 != local204.anInt3996) {
					if (local204.aClass10_Sub7_Sub1_2 != null) {
						Static461.aClass10_Sub7_Sub2_5.method1841(local204.aClass10_Sub7_Sub1_2);
						local204.aClass10_Sub7_Sub1_2 = null;
					}
					local204.anInt3996 = local324;
				}
				local204.anInt3994 = local216;
			}
			local204.anInt4002 = local204.aClass24_Sub3_Sub2_Sub2_3.anInt7092;
			local204.anInt3992 = local204.aClass24_Sub3_Sub2_Sub2_3.anInt7092 + (local204.aClass24_Sub3_Sub2_Sub2_3.method4919() << 6);
			local204.anInt4005 = local204.aClass24_Sub3_Sub2_Sub2_3.anInt7094;
			local204.anInt3995 = local204.aClass24_Sub3_Sub2_Sub2_3.anInt7094 + (local204.aClass24_Sub3_Sub2_Sub2_3.method4919() << 6);
			Static302.method4201(arg3, arg2, local204, arg0, arg1);
		}
	}
}
