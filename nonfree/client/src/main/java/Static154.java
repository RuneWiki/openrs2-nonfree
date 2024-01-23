import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "[Lclient!lj;")
	public static Class1_Sub5_Sub6[] aClass1_Sub5_Sub6Array7;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	public static int anInt3091;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
	public static int anInt3085 = 0;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public static int anInt3089 = 1;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	public static int anInt3090 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIILclient!re;I)V")
	public static void method2658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub4 arg5) {
		Static264.method4086(arg0, arg5.anInt3865, arg1, arg4, arg3, arg2, arg5.anInt3856);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!si;IIIZ)V")
	public static void method2659(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static71.aBoolean165) {
			Static93.method1772(arg3, arg2, arg3 + arg0.anInt4680, arg0.anInt4689 + arg2);
		}
		if (Static124.anInt597 < 3) {
			if (Static71.aBoolean165) {
				((Class1_Sub5_Sub6_Sub2) Static302.aClass1_Sub5_Sub6_11).method3210(arg3, arg2, arg0.anInt4680, arg0.anInt4689, Static302.aClass1_Sub5_Sub6_11.anInt3617 / 2, Static302.aClass1_Sub5_Sub6_11.anInt3625 / 2, (int) Static148.aFloat64, 256, (Class1_Sub5_Sub6_Sub2) arg0.method3973(false));
			} else {
				((Class1_Sub5_Sub6_Sub1) Static302.aClass1_Sub5_Sub6_11).method1284(arg3, arg2, arg0.anInt4680, arg0.anInt4689, Static302.aClass1_Sub5_Sub6_11.anInt3617 / 2, Static302.aClass1_Sub5_Sub6_11.anInt3625 / 2, (int) Static148.aFloat64, arg0.anIntArray533, arg0.anIntArray539);
			}
		} else if (Static71.aBoolean165) {
			@Pc(100) Class1_Sub5_Sub6 local100 = arg0.method3973(false);
			if (local100 != null) {
				local100.method3195(arg3, arg2);
			}
		} else {
			Static77.method1605(arg3, arg2, arg0.anIntArray533, arg0.anIntArray539);
		}
		Static88.aBooleanArray5[arg1] = true;
	}
}
