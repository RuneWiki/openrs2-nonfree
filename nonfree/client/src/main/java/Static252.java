import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "[S")
	public static short[] aShortArray80;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "Z")
	public static boolean aBoolean308;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "Lclient!qn;")
	public static Class211 aClass211_63;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Lclient!vq;")
	public static final Class260 aClass260_3 = new Class260(16);

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
	public static int anInt4173 = 0;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "Z")
	public static boolean aBoolean309 = true;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_148 = new Class56(13, 2);

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "[I")
	public static final int[] anIntArray347 = new int[14];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B[B)[B")
	public static byte[] method3317(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static461.method1985(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZIIII)Lclient!cl;")
	public static Class4_Sub8 method3318(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class4_Sub8 local7 = new Class4_Sub8();
		local7.anInt861 = arg1;
		local7.anInt859 = arg3;
		Static449.aClass67_37.method1426(local7, (long) arg2);
		Static9.method3941(arg1);
		@Pc(33) Class110 local33 = Static235.method3185(arg2);
		if (local33 != null) {
			Static118.method1693(local33);
		}
		if (Static246.aClass110_11 != null) {
			Static118.method1693(Static246.aClass110_11);
			Static246.aClass110_11 = null;
		}
		Static8.method99();
		if (local33 != null) {
			Static453.method6005(local33, !arg0);
		}
		if (!arg0) {
			Static80.method1283(arg1);
		}
		if (!arg0 && Static182.anInt3346 != -1) {
			Static199.method2849(Static182.anInt3346, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BILclient!hd;I)V")
	public static void method3319(@OriginalArg(1) int arg0, @OriginalArg(2) Class110 arg1, @OriginalArg(3) int arg2) {
		Static268.anInt4434 = arg0;
		Static245.aClass110_10 = arg1;
		Static130.anInt2342 = arg2;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)Lclient!mv;")
	public static Class176_Sub1 method3320(@OriginalArg(0) int arg0) {
		return Static327.aBoolean376 && Static137.anInt2495 <= arg0 && arg0 <= Static338.anInt5506 ? Static12.aClass176_Sub1Array1[arg0 - Static137.anInt2495] : null;
	}
}
