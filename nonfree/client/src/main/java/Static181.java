import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!t", name = "K", descriptor = "J")
	public static long aLong215;

	@OriginalMember(owner = "client!t", name = "M", descriptor = "Lclient!wa;")
	public static Class23 aClass23_66;

	@OriginalMember(owner = "client!t", name = "T", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1339 = Static161.method2452("Drop");

	@OriginalMember(owner = "client!t", name = "D", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1334 = aClass20_1339;

	@OriginalMember(owner = "client!t", name = "F", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1335 = Static161.method2452("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!t", name = "J", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1336 = Static161.method2452("Loaded textures");

	@OriginalMember(owner = "client!t", name = "N", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1337 = Static161.method2452("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!t", name = "R", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1338 = aClass20_1337;

	@OriginalMember(owner = "client!t", name = "U", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1340 = aClass20_1336;

	@OriginalMember(owner = "client!t", name = "V", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1341 = Static161.method2452("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Lclient!rf;")
	public static Class5_Sub2_Sub17 method2739(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub17 local10 = (Class5_Sub2_Sub17) Static77.aClass8_31.method227((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static116.aClass23_43.method738(Static50.method888(arg0), Static15.method269(arg0));
		local10 = new Class5_Sub2_Sub17();
		local10.anInt3304 = arg0;
		if (local24 != null) {
			local10.method2505(new Class5_Sub6(local24));
		}
		Static77.aClass8_31.method232((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BJ)V")
	public static void method2740(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static43.aClass5_Sub6_Sub1_2.method3087(244);
			Static43.aClass5_Sub6_Sub1_2.method3037(arg0);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIILclient!ia;JZ)V")
	public static void method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class73 local6 = new Class73();
		local6.aClass1_8 = arg4;
		local6.anInt2716 = arg1 * 128 + 64;
		local6.anInt2712 = arg2 * 128 + 64;
		local6.anInt2713 = arg3;
		local6.aLong154 = arg5;
		if (Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2] = new Class5_Sub3(arg0, arg1, arg2);
		}
		Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2].aClass73_1 = local6;
	}
}
