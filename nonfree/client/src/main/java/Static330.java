import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static330 {

	@OriginalMember(owner = "client!ur", name = "Q", descriptor = "Lclient!bb;")
	public static Class16 aClass16_7;

	@OriginalMember(owner = "client!ur", name = "L", descriptor = "[S")
	public static final short[] aShortArray106 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ur", name = "R", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_234 = new Class198(64);

	@OriginalMember(owner = "client!ur", name = "U", descriptor = "I")
	public static int anInt6311 = 0;

	@OriginalMember(owner = "client!ur", name = "V", descriptor = "I")
	public static int anInt6312 = 0;

	@OriginalMember(owner = "client!ur", name = "W", descriptor = "[I")
	public static final int[] anIntArray486 = new int[6];

	@OriginalMember(owner = "client!ur", name = "X", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_235 = new Class198(64);

	@OriginalMember(owner = "client!ur", name = "Y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray76 = new String[8];

	@OriginalMember(owner = "client!ur", name = "Z", descriptor = "[I")
	public static final int[] anIntArray487 = new int[100];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIZII)V")
	public static void method5341(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static225.anInt4568 == 0) {
			Static354.method5641(false);
		} else {
			Static233.anInt4713 = Static225.anInt4568;
			Static106.method2349(0);
		}
		Static254.aBoolean195 = arg1;
		Static101.anInt6799 = arg3;
		Static101.anInt6798 = arg0;
		Static54.method4165(arg2);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZC)Z")
	public static boolean method5342(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
