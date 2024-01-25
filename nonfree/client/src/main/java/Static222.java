import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!cda;")
	public static Class44 aClass44_2 = null;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
	public static int anInt4817 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIBI)V")
	public static void method4040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg2 * Static7.aClass3_Sub15_Sub1_1.anInt8382 >> 8;
		if (local14 != 0 && arg1 != -1) {
			Static317.method5135(arg1, Static494.aClass161_110, local14);
			Static432.aBoolean563 = true;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z[B)Z")
	public static boolean method4042(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub27 local8 = new Class3_Sub27(arg0);
		@Pc(12) int local12 = local8.method7548();
		if (local12 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local8.method7548() == 1;
		if (local33) {
			Static242.method4202(local8);
		}
		Static132.method2304(local8);
		return true;
	}
}
