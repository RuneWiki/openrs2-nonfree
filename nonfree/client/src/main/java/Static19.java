import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
	public static int anInt866;

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "[Lclient!ha;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
	public static int anInt868;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Lclient!kv;")
	public static final Class171 aClass171_1 = new Class171();

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)Z")
	public static boolean method824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) boolean local25 = (arg0 & 0x37) == 0 ? Static153.method3113(arg0, arg1) : Static350.method5565(arg1, arg0);
		return Static327.method5345(arg1, arg0) | (arg1 & 0x10000) != 0 | local25;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BII)Z")
	public static boolean method826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 < 128 || arg3 < 128 || arg2 > (Static542.anInt9387 - 2) * 128 || (Static36.anInt1324 - 2) * 128 < arg3) {
			Static367.anIntArray490[0] = Static367.anIntArray490[1] = -1;
			return;
		}
		@Pc(48) int local48 = Static74.method1954(arg5, arg3, arg2) - arg6;
		Static56.aClass22_5.TA(arg4, 0, 0);
		Static478.aClass9_10.method7597(Static56.aClass22_5);
		Static478.aClass9_10.IA(arg2, local48, arg3, Static367.anIntArray490);
		Static56.aClass22_5.TA(-arg4, 0, 0);
		Static478.aClass9_10.method7597(Static56.aClass22_5);
	}
}
