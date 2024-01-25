import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static int anInt1976 = 0;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_24 = new Class240(14, 1);

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_18 = new Class171(53, 8);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method1642() {
		Static2.aClass51Array1 = new Class51[50];
		Static217.anInt10315 = 0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIZ)V")
	public static void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg0 < 1 || arg2 < 1 || arg0 > Static98.anInt361 - 2 || arg2 > Static438.anInt7120 - 2) {
			return;
		}
		@Pc(38) int local38 = arg3;
		if (arg3 < 3 && Static209.method3118(arg0, arg2)) {
			local38 = arg3 + 1;
		}
		if (Static336.aClass3_Sub41_18.aClass14_Sub25_1.method6576() == 0 && !Static647.method8700(arg2, Static566.anInt9142, local38, arg0)) {
			return;
		}
		if (Static254.aClass368ArrayArrayArray2 == null) {
			return;
		}
		Static326.aClass49_Sub1_1.method1218(arg2, arg0, Static609.aClass110Array1[arg3], arg4, Static119.aClass95_4, arg3);
		if (arg5 < 0) {
			return;
		}
		@Pc(89) int local89 = Static336.aClass3_Sub41_18.aClass14_Sub23_1.method6428();
		Static336.aClass3_Sub41_18.method6705(1, Static336.aClass3_Sub41_18.aClass14_Sub23_1);
		Static326.aClass49_Sub1_1.method1222(Static609.aClass110Array1[arg3], arg7, Static119.aClass95_4, arg3, arg5, arg0, local38, arg2, arg1, arg6);
		Static336.aClass3_Sub41_18.method6705(local89, Static336.aClass3_Sub41_18.aClass14_Sub23_1);
		return;
	}
}
