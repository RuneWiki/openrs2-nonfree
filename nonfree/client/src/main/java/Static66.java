import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_14;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Lclient!qh;")
	public static Class93 aClass93_44;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!hh;")
	private static Class50 aClass50_471 = Static186.method3527("cyan:");

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_470 = aClass50_471;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "[I")
	public static int[] anIntArray108 = new int[2000];

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "[I")
	public static int[] anIntArray109 = new int[500];

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
	public static int anInt1298 = 0;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "Lclient!hh;")
	public static Class50 aClass50_472 = Static186.method3527("(Y");

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_473 = aClass50_471;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Lclient!hh;")
	public static Class50 aClass50_474 = Static186.method3527("underlay");

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "S")
	public static short aShort5 = 256;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLclient!qh;)V")
	public static void method999(@OriginalArg(1) Class93 arg0) {
		if (Static62.anInt1226 == arg0.anInt3609) {
			Static98.aBooleanArray5[arg0.anInt3599] = true;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIZIII)Lclient!vf;")
	public static Class1_Sub1_Sub8 method1000(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = (arg0 << 19) + arg2 + (arg1 ? 65536 : 0) + (arg4 << 17);
		@Pc(32) long local32 = (long) local18 * 3849834839L + (long) arg3 * 3147483667L;
		@Pc(43) Class1_Sub1_Sub8 local43 = (Class1_Sub1_Sub8) Static201.aClass84_34.method2579(local32);
		if (local43 != null) {
			return local43;
		}
		Static215.aBoolean205 = false;
		local43 = Static131.method2212(arg0, arg4, false, arg1, arg3, arg2);
		if (local43 != null && !Static215.aBoolean205) {
			Static201.aClass84_34.method2582(local43, local32);
		}
		return local43;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public static void method1002() {
		Static37.anInt795++;
	}
}
