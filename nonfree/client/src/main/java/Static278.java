import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_232 = new Class22(52, 8);

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_63 = new Class215(41, 3);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!et;ILclient!ga;)Lclient!ya;")
	public static Class19 method3941(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Class66 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface7 arg4) {
		return new Class19_Sub2(arg0, arg1, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(JB)V")
	public static void method3942(@OriginalArg(0) long arg0) {
		Static3.aClass4_Sub12_Sub1_5.anInt2997 = 0;
		Static3.aClass4_Sub12_Sub1_5.method2551(Static153.aClass60_7.anInt1812);
		Static3.aClass4_Sub12_Sub1_5.method2504(arg0);
		Static348.anInt5976 = 0;
		Static119.anInt2524 = 0;
		Static354.anInt6183 = 1;
		Static249.anInt4623 = -3;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ya;)V")
	public static void method3943(@OriginalArg(0) Class19 arg0) {
		for (@Pc(1) int local1 = Static358.anInt6251; local1 < Static235.anInt4487; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static422.anInt6945; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static171.anInt3361; local7++) {
					@Pc(16) Class164 local16 = Static202.aClass164ArrayArrayArray5[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class16_Sub5 local21 = local16.aClass16_Sub5_3;
						@Pc(24) Class16_Sub5 local24 = local16.aClass16_Sub5_2;
						if (local21 != null && local21.method5338()) {
							Static100.method1774(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5338()) {
								Static100.method1774(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5337(0, 0, local21, false, arg0, 0);
								local24.method5333();
							}
							local21.method5333();
						}
						for (@Pc(70) Class7 local70 = local16.aClass7_3; local70 != null; local70 = local70.aClass7_1) {
							@Pc(74) Class16_Sub1 local74 = local70.aClass16_Sub1_1;
							if (local74 != null && local74.method5338()) {
								Static100.method1774(arg0, local74, local1, local4, local7, local74.aShort97 + 1 - local74.aShort94, local74.aShort95 - local74.aShort96 + 1);
								local74.method5333();
							}
						}
						@Pc(111) Class16_Sub4 local111 = local16.aClass16_Sub4_2;
						if (local111 != null && local111.method5338()) {
							Static261.method3787(arg0, local111, local1, local4, local7);
							local111.method5333();
						}
					}
				}
			}
		}
	}
}
