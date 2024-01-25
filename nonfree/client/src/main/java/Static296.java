import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!n;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "[S")
	public static short[] aShortArray95 = new short[256];

	@OriginalMember(owner = "client!r", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
	public static final int[] anIntArray604 = new int[4096];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIILclient!je;)V")
	public static void method4458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class117 arg2) {
		if (!Static90.aBoolean144) {
			@Pc(12) String local12;
			for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
				local12 = Static224.method3127(arg2, local5);
				if (local12 != null) {
					Static337.method4814((long) (local5 + 1), 1006, true, Static297.method4474(local5, arg2), arg2.aString28, local12, arg2.anInt3043, arg2.anInt3080, false, arg2.anInt3093);
				}
			}
			local12 = Static24.method369(arg2);
			if (local12 != null) {
				Static337.method4814(0L, 30, true, arg2.anInt3094, arg2.aString28, local12, arg2.anInt3043, arg2.anInt3080, false, arg2.anInt3093);
			}
			for (@Pc(73) int local73 = 4; local73 >= 0; local73--) {
				@Pc(80) String local80 = Static224.method3127(arg2, local73);
				if (local80 != null) {
					Static337.method4814((long) (local73 + 1), 50, true, Static297.method4474(local73, arg2), arg2.aString28, local80, arg2.anInt3043, arg2.anInt3080, false, arg2.anInt3093);
				}
			}
			if (Static50.method810(arg2).method2815()) {
				if (arg2.aString31 == null) {
					Static337.method4814(0L, 13, true, -1, "", Static125.aClass169_111.method3680(Static48.anInt952), arg2.anInt3043, arg2.anInt3080, false, arg2.anInt3093);
				} else {
					Static337.method4814(0L, 13, true, -1, "", arg2.aString31, arg2.anInt3043, arg2.anInt3080, false, arg2.anInt3093);
				}
			}
		} else if (Static50.method810(arg2).method2810() && (Static176.anInt3186 & 0x20) != 0) {
			Static337.method4814(0L, 46, true, Static215.anInt3687, Static28.aString7 + " -> " + arg2.aString28, Static114.aString18, arg2.anInt3043, arg2.anInt3080, false, arg2.anInt3093);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBILclient!ui;ZII)V")
	public static void method4459(@OriginalArg(0) int arg0, @OriginalArg(3) Class230 arg1, @OriginalArg(6) int arg2) {
		Static243.anInt4123 = arg0;
		Static315.aClass230_71 = arg1;
		Static157.anInt2868 = arg2;
		Static355.aBoolean431 = false;
		Static229.anInt3862 = 2;
		Static211.anInt3648 = 0;
		Static271.anInt4720 = 1;
	}
}
