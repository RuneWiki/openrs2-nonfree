import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!la;")
	public static Class37 aClass37_16;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "I")
	public static int anInt9012 = 0;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	public static final int anInt9019 = 1406;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!mq;)V")
	public static void method7178(@OriginalArg(1) Class12_Sub2_Sub1_Sub4_Sub1 arg0) {
		@Pc(16) Class2_Sub40 local16 = (Class2_Sub40) Static399.aClass90_23.method1685((long) arg0.anInt8406);
		if (local16 == null) {
			Static169.method2211(arg0.anIntArray566[0], arg0, 0, arg0.anIntArray565[0], arg0.aByte128, null, null);
		} else {
			local16.method5859();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
	public static void method7181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static290.method4092(Static48.anInt898, arg0, Static275.anInt4756);
		@Pc(17) int local17 = Static290.method4092(Static48.anInt898, arg1, Static275.anInt4756);
		@Pc(23) int local23 = Static290.method4092(Static89.anInt1576, arg4, Static130.anInt2131);
		@Pc(29) int local29 = Static290.method4092(Static89.anInt1576, arg3, Static130.anInt2131);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static437.method5735(local23, Static238.anIntArrayArray36[local35], local29, arg2);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)I")
	public static int method7198() {
		return Static255.anInt4255;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	public static void method7203() {
		@Pc(12) Class2_Sub29 local12 = (Class2_Sub29) Static359.aClass70_17.method1264();
		@Pc(20) boolean local20 = Class12_Sub2_Sub1_Sub3.lb != null || Static294.anInt9620 > 0;
		if (local20) {
			Static339.anInt5844 = 1;
		}
		if (Static418.aBoolean542 && Static106.aClass150_3.method2632(81) && Static484.anInt7715 > 2) {
			if (local20) {
				Static150.aClass2_Sub27_1 = (Class2_Sub27) Static411.aClass70_43.aClass2_39.aClass2_285.aClass2_285;
			} else {
				Static345.method5016((Class2_Sub27) Static411.aClass70_43.aClass2_39.aClass2_285.aClass2_285, local12.method6293(), local12.method6294());
			}
		} else if (local20) {
			Static150.aClass2_Sub27_1 = (Class2_Sub27) Static411.aClass70_43.aClass2_39.aClass2_285;
		} else {
			Static345.method5016((Class2_Sub27) Static411.aClass70_43.aClass2_39.aClass2_285, local12.method6293(), local12.method6294());
		}
	}
}
