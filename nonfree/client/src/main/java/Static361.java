import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "Lclient!mh;")
	public static Class6_Sub22 aClass6_Sub22_2;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "Lclient!nd;")
	public static final Class175 aClass175_17 = new Class175(12, -1);

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
	public static int anInt6103 = -1;

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "[I")
	public static final int[] anIntArray535 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;IIIIZLjava/lang/String;IBJZ)V")
	public static void method5112(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) boolean arg9) {
		if (!Static206.aBoolean239 && Static228.anInt3878 < 500) {
			@Pc(19) int local19 = arg4 == -1 ? Static54.anInt1132 : arg4;
			@Pc(33) Class6_Sub33 local33 = new Class6_Sub33(arg6, arg0, local19, arg1, arg7, arg8, arg3, arg2, arg5, arg9);
			Static307.aClass88_23.method1878(local33);
			Static228.anInt3878++;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method5113(@OriginalArg(0) Class239 arg0) {
		if (!Static274.aBoolean336) {
			return;
		}
		if (arg0.anObjectArray8 != null) {
			@Pc(20) Class239 local20 = Static316.method5795(Static321.anInt5236, Static391.anInt2016);
			if (local20 != null) {
				@Pc(26) Class6_Sub29 local26 = new Class6_Sub29();
				local26.aClass239_9 = local20;
				local26.aClass239_10 = arg0;
				local26.anObjectArray4 = arg0.anObjectArray8;
				Static308.method4424(local26);
			}
		}
		Static298.method4373(Static101.aClass25_23);
		Static449.aClass6_Sub15_Sub1_2.method3107(arg0.anInt6423);
		Static449.aClass6_Sub15_Sub1_2.method3136(Static365.anInt3369);
		Static449.aClass6_Sub15_Sub1_2.method3136(arg0.anInt6492);
		Static449.aClass6_Sub15_Sub1_2.method3120(Static391.anInt2016);
		Static449.aClass6_Sub15_Sub1_2.method3106(arg0.anInt6487);
		Static449.aClass6_Sub15_Sub1_2.method3100(Static321.anInt5236);
	}
}
