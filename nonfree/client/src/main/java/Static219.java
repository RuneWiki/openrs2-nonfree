import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "[I")
	public static int[] anIntArray421;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_54 = new Class244(21, 15);

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "Lclient!us;")
	public static final Class234 aClass234_78 = new Class234(89, 8);

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "Z")
	public static boolean aBoolean316 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZIB)V")
	public static void method3669(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class3_Sub18 local10 = Static214.method3324(arg1, arg0);
		if (local10 != null) {
			for (@Pc(22) int local22 = 0; local22 < local10.anIntArray226.length; local22++) {
				local10.anIntArray226[local22] = -1;
				local10.anIntArray227[local22] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)Lclient!k;")
	public static Class128 method3670(@OriginalArg(0) int arg0) {
		@Pc(6) Class128[] local6 = Static121.method1915();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(17) Class128 local17 = local6[local8];
			if (local17.anInt3174 == arg0) {
				return local17;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method3671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static302.method4687(arg1, 0, arg2, arg5, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3672(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V")
	public static void method3674(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(9, arg2);
		local8.method3219();
		local8.anInt3669 = arg1;
		local8.anInt3670 = arg0;
	}
}
