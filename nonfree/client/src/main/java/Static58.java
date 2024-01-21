import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!g", name = "G", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_420 = Static158.method3034(" is already on your friend list)3");

	@OriginalMember(owner = "client!g", name = "db", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_426 = Static158.method3034("glow2:");

	@OriginalMember(owner = "client!g", name = "I", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_421 = aClass60_426;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "I")
	public static int anInt1813 = 0;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "Lclient!ob;")
	public static Class60 aClass60_422 = aClass60_426;

	@OriginalMember(owner = "client!g", name = "O", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_423 = Static158.method3034("Close");

	@OriginalMember(owner = "client!g", name = "X", descriptor = "Lclient!ob;")
	public static Class60 aClass60_424 = aClass60_420;

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "Lclient!ob;")
	public static Class60 aClass60_425 = aClass60_423;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIII)V")
	public static void method1356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) int local14 = arg3; local14 <= arg2 + arg3; local14++) {
			for (@Pc(18) int local18 = arg0; local18 <= arg1 + arg0; local18++) {
				if (local18 >= 0 && local18 < 104 && local14 >= 0 && local14 < 104) {
					Static54.aByteArrayArrayArray19[0][local18][local14] = 127;
					if (arg0 == local18 && local18 > 0) {
						Static32.anIntArrayArrayArray4[0][local18][local14] = Static32.anIntArrayArrayArray4[0][local18 - 1][local14];
					}
					if (local18 == arg1 + arg0 && local18 < 103) {
						Static32.anIntArrayArrayArray4[0][local18][local14] = Static32.anIntArrayArrayArray4[0][local18 + 1][local14];
					}
					if (local14 == arg3 && local14 > 0) {
						Static32.anIntArrayArrayArray4[0][local18][local14] = Static32.anIntArrayArrayArray4[0][local18][local14 - 1];
					}
					if (arg3 + arg2 == local14 && local14 < 103) {
						Static32.anIntArrayArrayArray4[0][local18][local14] = Static32.anIntArrayArrayArray4[0][local18][local14 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)I")
	public static int method1360(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
