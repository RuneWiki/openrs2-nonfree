import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
	public static int anInt1626;

	@OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
	public static int anInt1632;

	@OriginalMember(owner = "client!fa", name = "fb", descriptor = "I")
	public static int anInt1635;

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "Lclient!ll;")
	public static Class114 aClass114_8 = new Class114();

	@OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
	public static int anInt1629 = 0;

	@OriginalMember(owner = "client!fa", name = "bb", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!fa", name = "cb", descriptor = "[I")
	public static int[] anIntArray117 = new int[500];

	@OriginalMember(owner = "client!fa", name = "db", descriptor = "I")
	public static int anInt1633 = -1;

	@OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
	public static int anInt1634 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIII)V")
	public static void method1200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 + arg5;
		@Pc(18) int local18 = arg2 - arg4;
		@Pc(22) int local22 = arg4 + arg1;
		@Pc(24) int local24;
		for (local24 = arg5; local24 < local10; local24++) {
			Static99.method1656(Static220.anIntArrayArray36[local24], arg0, arg1, arg3);
		}
		for (local24 = arg2; local24 > local18; local24--) {
			Static99.method1656(Static220.anIntArrayArray36[local24], arg0, arg1, arg3);
		}
		@Pc(66) int local66 = arg3 - arg4;
		for (local24 = local10; local24 <= local18; local24++) {
			@Pc(79) int[] local79 = Static220.anIntArrayArray36[local24];
			Static99.method1656(local79, arg0, arg1, local22);
			Static99.method1656(local79, arg0, local66, arg3);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1201(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static272.anInt5215; local12++) {
			if (arg0.equalsIgnoreCase(Static181.aStringArray23[local12])) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLclient!gb;ZLclient!gb;IZ)I")
	public static int method1202(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class63_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class63_Sub1 arg4, @OriginalArg(5) int arg5) {
		@Pc(15) int local15 = Static287.method4403(arg2, arg0, arg4, arg1);
		if (local15 != 0) {
			return arg1 ? -local15 : local15;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static287.method4403(arg2, arg5, arg4, arg3);
			return arg3 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(B)V")
	public static void method1203() {
		Static223.aClass26_45.method515();
		Static296.aClass26_57.method515();
	}
}
