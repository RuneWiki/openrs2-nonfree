import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "[Lclient!uo;")
	public static Class205[] aClass205Array1;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array3;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
	public static int anInt861;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
	public static int anInt862;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "Lclient!am;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Z")
	public static final boolean aBoolean62 = false;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
	public static int anInt859 = 0;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
	public static int anInt866 = 0;

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString52 = "skill: ";

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V")
	public static void method795(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		if (Static215.anInt4279 == 2) {
			Static311.anInt6461 = local11;
			Static160.anInt3243 = 0;
			Static199.anInt3858 = local3;
		}
		Static155.aFloat64 = local3;
		Static5.aFloat2 = local11;
		Static65.method1806();
		Static255.aBoolean381 = true;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!sl;)Z")
	public static boolean method796(@OriginalArg(1) Interface8 arg0) {
		@Pc(9) Class137 local9 = Static228.method3923(arg0.method5549());
		if (local9.anInt4130 == -1) {
			return true;
		} else {
			@Pc(21) Class188 local21 = Static316.method5384(local9.anInt4130);
			return local21.anInt5702 == -1 ? true : local21.method5047();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIZIII)V")
	public static void method797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static323.method5433(arg1)) {
			Static43.method970(Static348.aClass96ArrayArray1[arg1], -1, arg0, arg6, arg3, arg5, arg4, arg2);
		}
	}
}
