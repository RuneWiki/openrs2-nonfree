import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public static int anInt3037;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!vaa;")
	public static Class322_Sub1 aClass322_Sub1_1;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
	public static final int[] anIntArray152 = new int[5];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZI)Lclient!uba;")
	public static Class2_Sub48 method2840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(17) Class2_Sub48 local17 = new Class2_Sub48();
		local17.anInt10125 = arg0;
		local17.anInt10127 = arg2;
		Static372.aClass99_51.method3059((long) arg1, local17);
		Static176.method3672(arg0);
		@Pc(38) Class24 local38 = Static87.method8101(arg1);
		if (local38 != null) {
			Static553.method8248(local38);
		}
		if (Static249.aClass24_10 != null) {
			Static553.method8248(Static249.aClass24_10);
			Static249.aClass24_10 = null;
		}
		Static198.method3990();
		if (local38 != null) {
			Static553.method8245(!arg3, local38);
		}
		if (!arg3) {
			Static284.method5151(arg0);
		}
		if (!arg3 && Static475.anInt10143 != -1) {
			Static26.method659(Static475.anInt10143, 1);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	public static void method2842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static66.anInt10075 != 1) {
			return;
		}
		@Pc(15) int local15 = arg0 / Static267.anInt5684;
		@Pc(19) int local19 = arg1 / Static267.anInt5684;
		@Pc(23) int local23 = arg2 / Static11.anInt6559;
		@Pc(27) int local27 = arg3 / Static11.anInt6559;
		if (local15 >= Static228.anInt5033 || local19 < 0 || Static548.anInt9814 <= local23 || local27 < 0) {
			return;
		}
		if (local19 >= Static228.anInt5033) {
			local19 = Static228.anInt5033 - 1;
		}
		if (local23 < 0) {
			local23 = 0;
		}
		if (Static548.anInt9814 <= local27) {
			local27 = Static548.anInt9814 - 1;
		}
		if (local15 < 0) {
			local15 = 0;
		}
		for (@Pc(79) int local79 = local23; local79 <= local27; local79++) {
			@Pc(90) int local90 = Static126.method2964(local79 + Static605.anInt10972, Static548.anInt9814) * Static228.anInt5033;
			for (@Pc(92) int local92 = local15; local92 <= local19; local92++) {
				@Pc(103) int local103 = local90 + Static126.method2964(Static90.anInt2649 + local92, Static228.anInt5033);
				Static380.anIntArray468[local103] = Static579.anInt10337;
			}
		}
	}
}
