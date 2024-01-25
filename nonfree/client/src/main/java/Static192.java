import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
	public static int anInt3946;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	public static int anInt3950;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "[S")
	public static final short[] aShortArray74 = new short[] { 20, 30, 5, 13, 18, 8, 21, 46 };

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "J")
	public static volatile long aLong115 = 0L;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V")
	public static void method3520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static195.anInt4513 = arg0;
		Static63.anInt1169 = arg5;
		Static328.anInt6298 = arg1;
		Static177.anInt3491 = arg4;
		Static165.anInt3296 = arg3;
		Static355.anInt6751 = arg2;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	public static void method3523() {
		@Pc(5) Class26 local5 = Static114.aClass26_18;
		synchronized (Static114.aClass26_18) {
			Static114.aClass26_18.method328();
		}
	}
}
