import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "Lclient!kea;")
	public static Class161 aClass161_65;

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "J")
	public static long aLong180;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_79 = new Class158(42, 11);

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "[I")
	public static final int[] anIntArray543 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "Z")
	public static boolean aBoolean394 = true;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public static void method5179(@OriginalArg(1) int arg0) {
		if (Static62.method7109(arg0)) {
			Static366.method5731(-1, Static459.aClass245ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V")
	public static void method5180(@OriginalArg(0) int arg0) {
		Static392.anInt7211 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static126.anInt2626; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static108.anInt2385; local6++) {
				if (Static279.aClass290ArrayArrayArray7[arg0][local3][local6] == null) {
					Static279.aClass290ArrayArrayArray7[arg0][local3][local6] = new Class290(arg0, local3, local6);
				}
			}
		}
	}
}
