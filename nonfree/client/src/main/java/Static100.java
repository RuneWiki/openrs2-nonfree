import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	public static int anInt2932 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!ea;")
	private static Class18 aClass18_742 = Static8.method128("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Lclient!ea;")
	public static Class18 aClass18_741 = aClass18_742;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "I")
	public static int anInt2935 = 0;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "I")
	public static int anInt2938 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLclient!dd;Lclient!ea;Lclient!ea;)Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 method2069(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class18 arg1, @OriginalArg(3) Class18 arg2) {
		@Pc(13) int local13 = arg0.method2246(arg2);
		@Pc(19) int local19 = arg0.method2251(arg1, local13);
		return Static16.method276(local13, local19, arg0);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lclient!t;")
	public static Class1_Sub1_Sub16 method2071(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub16 local15 = (Class1_Sub1_Sub16) Static173.aClass66_26.method2599((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static69.method1448(Static84.aClass16_10, arg0, Static16.aClass16_1);
		if (local15 != null) {
			Static173.aClass66_26.method2597((long) arg0, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIB)I")
	public static int method2073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >> 31 & arg1 - 1;
		return local12 + ((arg0 >>> 31) + arg0) % arg1;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public static void method2075() {
		aClass18_741 = null;
		aClass18_742 = null;
	}
}
