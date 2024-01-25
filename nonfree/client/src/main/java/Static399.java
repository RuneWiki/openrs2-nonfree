import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static399 {

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "[I")
	public static int[] anIntArray113;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "[[[Lclient!sk;")
	public static Class262[][][] aClass262ArrayArrayArray2;

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "Z")
	private static boolean aBoolean90;

	@OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
	private static int anInt1334;

	@OriginalMember(owner = "client!qn", name = "O", descriptor = "Z")
	private static boolean aBoolean91;

	@OriginalMember(owner = "client!qn", name = "P", descriptor = "Z")
	private static boolean aBoolean92;

	@OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
	private static int anInt1335;

	@OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
	private static int anInt1336;

	@OriginalMember(owner = "client!qn", name = "S", descriptor = "Z")
	private static boolean aBoolean93;

	@OriginalMember(owner = "client!qn", name = "T", descriptor = "Z")
	private static boolean aBoolean94;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "[I")
	public static final int[] anIntArray114 = new int[200];

	@OriginalMember(owner = "client!qn", name = "providesignlink", descriptor = "(Lclient!uf;)V")
	private static void method1219(@OriginalArg(0) Class283 arg0) {
		Static531.aClass283_6 = arg0;
		Static348.aClass283_3 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)Z")
	public static boolean method1229(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
