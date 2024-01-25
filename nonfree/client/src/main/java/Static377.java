import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
	public static int anInt7161;

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
	public static int anInt7162;

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "Lclient!hia;")
	public static Class144 aClass144_3;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!si;")
	public static final Class335 aClass335_23 = new Class335(8);

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "Z")
	public static boolean aBoolean540 = false;

	@OriginalMember(owner = "client!mm", name = "C", descriptor = "[I")
	public static final int[] anIntArray347 = new int[6];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public static void method6402(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(16, (long) arg0);
		local9.method2489();
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Z")
	public static boolean method6405(@OriginalArg(1) int arg0) {
		if (arg0 == 9 || arg0 == 20 || arg0 == 58 || arg0 == 30 || arg0 == 21) {
			return true;
		} else {
			return arg0 == 17 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[SI)[S")
	public static short[] method6406(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static679.method4132(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
