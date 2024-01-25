import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!tn", name = "G", descriptor = "[Lclient!qv;")
	public static Class4_Sub1_Sub2_Sub1[] aClass4_Sub1_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!tn", name = "L", descriptor = "Lclient!ok;")
	public static Class178 aClass178_4;

	@OriginalMember(owner = "client!tn", name = "M", descriptor = "Lclient!ob;")
	public static Class3 aClass3_3;

	@OriginalMember(owner = "client!tn", name = "N", descriptor = "I")
	public static int anInt6557;

	@OriginalMember(owner = "client!tn", name = "O", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas5;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BIZZI)V")
	public static void method5126(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static53.method914(arg1, Static22.aClass147_Sub1Array1.length - 1, arg2, 0, arg3, arg0);
		Static61.anInt1459 = 0;
		Static310.aClass1_Sub42_2 = null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)V")
	public static void method5127(@OriginalArg(0) int arg0) {
		if (arg0 == Static222.anInt3997) {
			return;
		}
		Static296.anInt5187 = Static206.anInt3607 = Static195.anIntArray222[arg0];
		Static10.method143();
		Static166.anIntArrayArrayArray2 = new int[4][Static296.anInt5187 >> 3][Static206.anInt3607 >> 3];
		Static97.anIntArrayArray25 = new int[Static296.anInt5187][Static206.anInt3607];
		Static200.anIntArrayArray32 = new int[Static296.anInt5187][Static206.anInt3607];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static447.aClass14Array3[local40] = Static260.method1930(Static206.anInt3607, Static296.anInt5187);
		}
		Static41.aByteArrayArrayArray4 = new byte[4][Static296.anInt5187][Static206.anInt3607];
		Static353.method4771(Static206.anInt3607, Static296.anInt5187);
		Static143.method2018(Static185.aClass34_7, Static206.anInt3607 >> 3, Static296.anInt5187 >> 3);
		Static222.anInt3997 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "(B)I")
	public static int method5128() {
		@Pc(5) Class102 local5 = Static218.aClass102_26;
		synchronized (Static218.aClass102_26) {
			return Static218.aClass102_26.method2264();
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIZ[Lclient!jk;B)V")
	public static void method5129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class124[] arg4) {
		for (@Pc(12) int local12 = 0; local12 < arg4.length; local12++) {
			@Pc(18) Class124 local18 = arg4[local12];
			if (local18 != null && local18.anInt3344 == arg0) {
				Static3.method4551(arg3, local18, arg2, arg1);
				Static365.method4858(local18, arg1, arg2);
				if (local18.anInt3390 > local18.anInt3389 - local18.anInt3376) {
					local18.anInt3390 = local18.anInt3389 - local18.anInt3376;
				}
				if (local18.anInt3390 < 0) {
					local18.anInt3390 = 0;
				}
				if (local18.anInt3415 - local18.anInt3356 < local18.anInt3418) {
					local18.anInt3418 = local18.anInt3415 - local18.anInt3356;
				}
				if (local18.anInt3418 < 0) {
					local18.anInt3418 = 0;
				}
				if (local18.anInt3417 == 0) {
					Static177.method2498(local18, arg3);
				}
			}
		}
	}
}
