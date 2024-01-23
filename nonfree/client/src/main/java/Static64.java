import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
	public static int anInt1245;

	@OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
	public static int anInt1249;

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "Lclient!qe;")
	private static Class78 aClass78_304 = Static199.method3560("Please remove ");

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "Lclient!qe;")
	public static Class78 aClass78_303 = aClass78_304;

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "[S")
	public static short[] aShortArray39 = new short[256];

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "J")
	public static long aLong55 = 0L;

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
	public static int anInt1246 = 0;

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "[I")
	public static int[] anIntArray223 = new int[128];

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "Z")
	public static boolean aBoolean42 = true;

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "Lclient!qe;")
	public static Class78 aClass78_306 = aClass78_304;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method1034(@OriginalArg(0) Class78 arg0) {
		Static29.aClass78_95 = arg0;
		if (Static133.aClass41_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) Class78 local15 = Static170.aClass78_682.method3019(Static133.aClass41_2.anApplet1);
			@Pc(21) Class78 local21 = Static224.aClass78_864.method3019(Static133.aClass41_2.anApplet1);
			@Pc(46) Class78 local46 = Static94.method1640(new Class78[] { local15, Static208.aClass78_818, arg0, Static170.aClass78_681, local21 });
			if (arg0.method3041() == 0) {
				local46 = Static94.method1640(new Class78[] { local46, Static184.aClass78_736 });
			} else {
				local46 = Static94.method1640(new Class78[] { local46, Static13.aClass78_49, Static9.method190(Static111.method1911() + 94608000000L), Static205.aClass78_139, Static157.method2820(94608000L) });
			}
			Static94.method1640(new Class78[] { Static84.aClass78_413, local46, Static214.aClass78_827 }).method3051(Static133.aClass41_2.anApplet1);
		} catch (@Pc(126) Throwable local126) {
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)Z")
	public static boolean method1035(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)V")
	public static void method1036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) Class2_Sub3_Sub28 local5 = Static203.method3592(arg0);
		@Pc(12) int local12 = local5.anInt4637;
		@Pc(19) int local19 = local5.anInt4635;
		@Pc(26) int local26 = Class109.anIntArray770[local12 - local19];
		if (arg1 < 0 || arg1 > local26) {
			arg1 = 0;
		}
		local26 <<= local19;
		@Pc(40) int local40 = local5.anInt4641;
		Static57.method463(local40, Static198.anIntArray724[local40] & ~local26 | local26 & arg1 << local19);
	}
}
