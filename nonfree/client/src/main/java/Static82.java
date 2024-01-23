import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Lclient!ho;")
	public static Class70 aClass70_2;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Z")
	public static boolean aBoolean100 = true;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "[I")
	public static int[] anIntArray146 = new int[4096];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method1395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static173.anInt3481 && arg2 <= Static121.anInt2460 && Static293.anInt5688 <= arg1 && arg5 <= Static100.anInt1982) {
			Static144.method2297(arg0, arg6, arg4, arg5, arg1, arg2, arg3);
		} else {
			Static230.method3614(arg4, arg1, arg2, arg6, arg0, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZB)V")
	public static void method1397(@OriginalArg(2) boolean arg0) {
		Static75.anInt1523 = 22050;
		Static183.anInt3659 = 2;
		Static155.aBoolean207 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method1400(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(27) byte[] local27 = (byte[]) arg1;
			return arg0 ? Static92.method1528(local27) : local27;
		} else if (arg1 instanceof Class60) {
			@Pc(41) Class60 local41 = (Class60) arg1;
			return local41.method2554();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIII)I")
	public static int method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg0;
			arg0 = local6;
		}
		@Pc(18) int local18 = arg2 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return arg3;
		} else if (local18 == 2) {
			return 7 + 1 - arg5 - arg1;
		} else {
			return 7 + 1 - arg3 - arg0;
		}
	}
}
