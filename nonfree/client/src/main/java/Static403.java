import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "F")
	public static float aFloat211;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
	public static final int anInt6670 = 50;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "[I")
	public static final int[] anIntArray507 = new int[anInt6670];

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
	public static final int[] anIntArray508 = new int[anInt6670];

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
	public static final int[] anIntArray509 = new int[anInt6670];

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
	public static int anInt6667 = 0;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "[I")
	public static final int[] anIntArray510 = new int[anInt6670];

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[anInt6670];

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
	public static final int[] anIntArray511 = new int[anInt6670];

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "[I")
	public static final int[] anIntArray512 = new int[anInt6670];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
	public static void method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static229.anInt4407; local3++) {
			@Pc(9) Rectangle local9 = Class4_Sub6_Sub23.aRectangleArray1[local3];
			if (arg3 < local9.width + local9.x && arg0 + arg3 > local9.x && local9.height + local9.y > arg2 && arg1 + arg2 > local9.y) {
				Static263.aBooleanArray15[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)Lclient!aq;")
	public static Class4_Sub3 method5217() {
		if (Static148.aClass183_41 == null || Static308.aClass63_1 == null) {
			return null;
		}
		Static308.aClass63_1.method1615(Static148.aClass183_41);
		@Pc(18) Class4_Sub3 local18 = (Class4_Sub3) Static308.aClass63_1.method1611();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class157 local28 = Static148.aClass182_3.method4124(local18.anInt234);
			return local28 != null && local28.aBoolean448 && local28.method3778(Static148.anInterface12_2) ? local18 : Static187.method2937();
		}
	}
}
