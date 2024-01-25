import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	public static void method4562() {
		Static243.aClass47_10.method2662(((float) Static305.anInt6786 * 0.1F + 0.7F) * Static337.aFloat96);
		Static243.aClass47_10.method2746(Static192.anInt4032, Static127.aFloat36, Static151.aFloat61, (float) Static84.anInt2385, (float) Static147.anInt3292, (float) Static99.anInt2546);
		Static243.aClass47_10.method2739(Static278.aClass81_7);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ge;Lclient!ge;)V")
	public static void method4565(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg0.aClass4_251 != null) {
			arg0.method5687();
		}
		arg0.aClass4_252 = arg1;
		arg0.aClass4_251 = arg1.aClass4_251;
		arg0.aClass4_251.aClass4_252 = arg0;
		arg0.aClass4_252.aClass4_251 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!fa;Z)V")
	public static void method4566(@OriginalArg(0) Class8_Sub1_Sub2_Sub1 arg0) {
		@Pc(15) Class4_Sub29 local15 = (Class4_Sub29) Static74.aClass43_11.method1273((long) arg0.anInt4916);
		if (local15 == null) {
			return;
		}
		if (local15.aClass4_Sub1_Sub1_1 != null) {
			Static196.aClass4_Sub1_Sub3_3.method3510(local15.aClass4_Sub1_Sub1_1);
			local15.aClass4_Sub1_Sub1_1 = null;
		}
		local15.method5687();
	}
}
