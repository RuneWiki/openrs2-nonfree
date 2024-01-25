import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ar", name = "D", descriptor = "Lclient!la;")
	public static Class208 aClass208_2;

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "Lclient!fs;")
	public static Class134 aClass134_4;

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "Lclient!um;")
	public static final Class354 aClass354_4 = new Class354("", 14);

	@OriginalMember(owner = "client!ar", name = "I", descriptor = "J")
	public static long aLong10 = 0L;

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V")
	public static void method424() {
		Static617.aClass57_14.method7657(Static296.aClass203_15);
		Static617.aClass57_14.DA(Static278.anInt4829, Static325.anInt5804, Static248.anInt4279, Static25.anInt394);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
	public static void method425(@OriginalArg(1) int arg0) {
		@Pc(17) Class5_Sub5_Sub6 local17 = Static478.method6972((long) arg0, 16);
		local17.method2686();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ib;)Lclient!sr;")
	public static Class31_Sub3 method427(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(13) Class31 local13 = Static617.method8748(arg0);
		@Pc(17) int local17 = arg0.method8527();
		@Pc(21) int local21 = arg0.method8527();
		@Pc(25) int local25 = arg0.method8519();
		return new Class31_Sub3(local13.aClass219_12, local13.aClass368_11, local13.anInt9298, local13.anInt9300, local13.anInt9301, local13.anInt9302, local13.anInt9305, local13.anInt9299, local13.anInt9306, local17, local21, local25);
	}
}
