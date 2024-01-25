import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_65 = new Class100(29, 3);

	@OriginalMember(owner = "client!hka", name = "h", descriptor = "Lclient!ne;")
	public static final Class240 aClass240_3 = new Class240("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)V")
	public static void method3456() {
		if (Static217.anInt4095 != -1) {
			Static518.method8570(-1, Static217.anInt4095, -1, false);
			Static217.anInt4095 = -1;
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Lclient!ru;IZBZILclient!ru;)I")
	public static int method3457(@OriginalArg(0) Class217_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class217_Sub1 arg5) {
		@Pc(17) int local17 = Static651.method9067(arg3, arg0, arg5, arg4);
		if (local17 != 0) {
			return arg3 ? -local17 : local17;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(38) int local38 = Static651.method9067(arg2, arg0, arg5, arg1);
			return arg2 ? -local38 : local38;
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method3458(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(24) Class14_Sub19 local24 = Static286.method4081(Static205.aClass394_1, Static608.aClass100_129);
		local24.aClass14_Sub29_Sub1_1.method5854(Static651.method9066(arg1) + 1);
		local24.aClass14_Sub29_Sub1_1.method5899(arg0);
		local24.aClass14_Sub29_Sub1_1.method5855(arg1);
		Static576.method8234(local24);
	}
}
