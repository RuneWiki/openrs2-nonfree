import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "Lclient!vt;")
	public static final Interface26 anInterface26_3 = new Class220();

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_148 = new Class225(69, 10);

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[4];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZILclient!oh;I)V")
	public static void method7107(@OriginalArg(1) int arg0, @OriginalArg(2) Class273 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray12 != null) {
			@Pc(14) Class2_Sub36 local14 = new Class2_Sub36();
			local14.aClass273_6 = arg1;
			local14.anObjectArray2 = arg1.anObjectArray12;
			Static484.method6919(local14);
		}
		Static581.aBoolean787 = true;
		Static523.anInt6605 = arg0;
		Static166.anInt2883 = arg1.anInt7410;
		Static27.anInt377 = arg2;
		Static203.anInt3318 = arg1.anInt7350;
		Static359.anInt5735 = arg1.anInt7415;
		Static96.anInt1729 = arg1.anInt7352;
		Static85.anInt1436 = arg1.anInt7384;
		Static371.method5299(arg1);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
	public static void method7108(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub6_Sub12 local18 = Static636.method8647(10, (long) arg0);
		local18.method6245();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)I")
	public static int method7109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static348.method4820(4, arg1 + 91923, arg0 + 45365) + (Static348.method4820(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static348.method4820(1, arg1, arg0) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}
}
