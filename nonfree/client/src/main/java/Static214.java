import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_52 = new Class200(80, -1);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ha;Lclient!hb;I)I")
	public static int method3615(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class132 arg1) {
		if (arg1.anInt3926 != -1) {
			return arg1.anInt3926;
		}
		if (arg1.anInt3925 != -1) {
			@Pc(31) Class195 local31 = arg0.anInterface7_15.method8118(arg1.anInt3925);
			if (!local31.aBoolean365) {
				return local31.aShort79;
			}
		}
		return arg1.anInt3936;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public static void method3617() {
		Static204.method3515((long) Static101.anInt2262, Static323.aClass5_9);
		if (Static307.anInt5465 != -1) {
			Static507.method7838(Static307.anInt5465);
		}
		for (@Pc(21) int local21 = 0; local21 < Static619.anInt10014; local21++) {
			if (Static477.aBooleanArray21[local21]) {
				Static314.aBooleanArray17[local21] = true;
			}
			Static504.aBooleanArray23[local21] = Static477.aBooleanArray21[local21];
			Static477.aBooleanArray21[local21] = false;
		}
		Static174.anInt3395 = Static101.anInt2262;
		if (Static307.anInt5465 != -1) {
			Static619.anInt10014 = 0;
			Static346.method5781();
		}
		Static323.aClass5_9.la();
		Static366.method5971(Static323.aClass5_9);
		@Pc(67) int local67 = Static141.method2609();
		if (local67 == -1) {
			local67 = Static32.anInt7819;
		}
		if (local67 == -1) {
			local67 = Static291.anInt5161;
		}
		Static563.method8100(local67);
		Static354.anInt6785 = 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg0);
		@Pc(20) int local20 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg4);
		@Pc(26) int local26 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg5);
		@Pc(32) int local32 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg6);
		@Pc(42) int local42 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg1 + arg0);
		@Pc(50) int local50 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg4 - arg1);
		for (@Pc(52) int local52 = local14; local52 < local42; local52++) {
			Static611.method8472(local32, local26, Static460.anIntArrayArray53[local52], arg2);
		}
		for (@Pc(74) int local74 = local20; local74 > local50; local74--) {
			Static611.method8472(local32, local26, Static460.anIntArrayArray53[local74], arg2);
		}
		@Pc(96) int local96 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg1 + arg5);
		@Pc(104) int local104 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg6 - arg1);
		for (@Pc(106) int local106 = local42; local106 <= local50; local106++) {
			@Pc(112) int[] local112 = Static460.anIntArrayArray53[local106];
			Static611.method8472(local96, local26, local112, arg2);
			Static611.method8472(local104, local96, local112, arg3);
			Static611.method8472(local32, local104, local112, arg2);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3619(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg0); local9 != -1; local9 = arg1.indexOf(arg0, local9 + arg2.length())) {
			arg1 = arg1.substring(0, local9) + arg2 + arg1.substring(arg0.length() + local9);
		}
		return arg1;
	}
}
