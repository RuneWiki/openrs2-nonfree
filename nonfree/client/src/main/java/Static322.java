import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Lclient!um;")
	public static Class243 aClass243_181;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "Lclient!hv;")
	public static final Class107 aClass107_10 = new Class107();

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_88 = new Class194(26, -1);

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Z")
	public static boolean method3971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V")
	public static void method3972() {
		Static400.aClass44_65.method1024();
		Static222.aClass44_33.method1024();
		Static304.aClass44_48.method1024();
		Static323.aClass44_51.method1024();
		Static445.aClass44_25.method1024();
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)Z")
	public static boolean method3973(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static14.method262(arg1, arg0) & Static95.method1331(arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!wl;IILclient!wl;IIIII)V")
	public static void method3975(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class2_Sub1_Sub3 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg0.method4914();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class49 local21 = (Class49) Static92.aClass44_16.method1028((long) local7);
		if (local21 == null) {
			@Pc(28) Class214[] local28 = Static470.method4679(Static344.aClass243_196, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static407.aClass200_9.method5871(local28[0]);
			Static92.aClass44_16.method1017((long) local7, local21);
		}
		Static193.method2590(arg4 >> 1, 0, arg2.aByte105, arg6 >> 1, arg2.anInt7502, arg2.method4913() * 64, arg2.anInt7500);
		@Pc(74) int local74 = Static205.anIntArray194[0] + arg1 - 18;
		@Pc(82) int local82 = local74 + arg3 / 4 * 18;
		@Pc(90) int local90 = Static205.anIntArray194[1] + arg5 - 70;
		@Pc(106) int local106 = local90 + arg3 % 4 * 18;
		local21.method5785(local82, local106);
		if (arg0 == arg2) {
			Static407.aClass200_9.method5857(local82 - 1, local106 + -1, 18, 18, -256);
		}
		@Pc(128) Class88_Sub5 local128 = Static222.method2922();
		local128.anInt6071 = local82;
		local128.anInt6072 = local106 + 16;
		local128.anInt6081 = local82 + 16;
		local128.aClass2_Sub1_Sub3_1 = arg0;
		local128.anInt6074 = local106;
		Static381.aClass107_8.method2332(local128);
	}
}
