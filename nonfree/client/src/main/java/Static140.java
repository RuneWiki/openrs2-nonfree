import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!qc;")
	public static Class3_Sub1_Sub4_Sub3_Sub1 aClass3_Sub1_Sub4_Sub3_Sub1_6;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1172 = Static120.method1824("::");

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method2165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static172.anInt3861 <= arg6 && Static85.anInt1779 >= arg6 && Static172.anInt3861 <= arg0 && Static85.anInt1779 >= arg0 && Static172.anInt3861 <= arg7 && Static85.anInt1779 >= arg7 && arg2 >= Static172.anInt3861 && Static85.anInt1779 >= arg2 && Static34.anInt790 <= arg3 && arg3 <= Static17.anInt440 && arg8 >= Static34.anInt790 && arg8 <= Static17.anInt440 && arg1 >= Static34.anInt790 && arg1 <= Static17.anInt440 && Static34.anInt790 <= arg4 && arg4 <= Static17.anInt440) {
			Static149.method2387(arg1, arg6, arg8, arg5, arg2, arg4, arg0, arg7, arg3);
		} else {
			Static146.method2322(arg8, arg4, arg3, arg6, arg5, arg7, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
	public static void method2166() {
		while (true) {
			@Pc(9) Class70 local9 = Static118.aClass70_14;
			@Pc(16) Class3_Sub12 local16;
			synchronized (Static118.aClass70_14) {
				local16 = (Class3_Sub12) Static122.aClass70_16.method1957();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass1_Sub1_11.method67((int) local16.aLong154, local16.aByteArray12, local16.aClass53_3, false);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!bc;B)V")
	public static void method2167(@OriginalArg(0) Class1 arg0) {
		Static145.aClass1_25 = arg0;
		Static145.aClass1_25.method56(4);
	}
}
