import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "[Lclient!rc;")
	public static Class2_Sub2_Sub16[] aClass2_Sub2_Sub16Array18;

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_105;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array60 = new Class41[8];

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "Lclient!tb;")
	public static Class91 aClass91_3 = new Class91();

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
	public static int anInt3996 = 1;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)Lclient!li;")
	public static Class2_Sub2_Sub13 method2742(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub13 local12 = (Class2_Sub2_Sub13) Static186.aClass43_20.method1464((long) arg0);
		if (local12 != null) {
			return local12;
		}
		local12 = Static42.method171(Static133.aClass15_26, arg0, Static127.aClass15_25);
		if (local12 != null) {
			Static186.aClass43_20.method1462((long) arg0, local12);
		}
		return local12;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!i;)V")
	public static void method2743(@OriginalArg(1) Class41 arg0) {
		@Pc(7) Class2_Sub27 local7 = Static30.method563(arg0);
		if (local7 == null) {
			return;
		}
		Static32.anInt850 = Static40.anInt1214 + Static105.anInt2549 - local7.anInt4752;
		Static167.anInt3886 = local7.anInt4750 - Static15.anInt422;
		@Pc(41) int local41 = Static32.anInt850 - (int) ((double) Static79.aClass80_8.anInt3660 / Static54.aDouble1);
		@Pc(51) int local51 = Static167.anInt3886 - (int) ((double) Static79.aClass80_8.anInt3635 / Static54.aDouble1);
		@Pc(61) int local61 = Static167.anInt3886 + (int) ((double) Static79.aClass80_8.anInt3635 / Static54.aDouble1);
		if (local51 < 0) {
			Static167.anInt3886 = (int) ((double) Static79.aClass80_8.anInt3635 / Static54.aDouble1);
		}
		@Pc(79) int local79 = (int) ((double) Static79.aClass80_8.anInt3660 / Static54.aDouble1) + Static32.anInt850;
		if (local61 > Static95.anInt2353) {
			Static167.anInt3886 = Static95.anInt2353 - (int) ((double) Static79.aClass80_8.anInt3635 / Static54.aDouble1);
		}
		if (local41 < 0) {
			Static32.anInt850 = (int) ((double) Static79.aClass80_8.anInt3660 / Static54.aDouble1);
		}
		if (local79 > Static40.anInt1214) {
			Static32.anInt850 = Static40.anInt1214 - (int) ((double) Static79.aClass80_8.anInt3660 / Static54.aDouble1);
		}
	}
}
