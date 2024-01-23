import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!mb;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!ck;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public static int anInt75;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!ag;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!ia;")
	public static Class51 aClass51_39 = Static64.method1101("<)4col>");

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_40 = Static64.method1101("<img=1>");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
	public static void method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg1 <= arg3) {
			for (local6 = arg1; local6 < arg3; local6++) {
				Static113.anIntArrayArray10[local6][arg0] = arg2;
			}
		} else {
			for (local6 = arg3; local6 < arg1; local6++) {
				Static113.anIntArrayArray10[local6][arg0] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
	public static void method66() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static174.anInt3861; local1++) {
			for (local4 = 0; local4 < Static58.anInt1373; local4++) {
				for (local7 = 0; local7 < Static172.anInt3854; local7++) {
					Static22.aClass1_Sub7ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static92.anInt2045; local4++) {
			for (local7 = 0; local7 < Static92.anIntArray128[local4]; local7++) {
				Static92.aClass31ArrayArray1[local4][local7] = null;
			}
			Static92.anIntArray128[local4] = 0;
		}
		for (local7 = 0; local7 < Static55.anInt1279; local7++) {
			Static34.aClass83Array2[local7] = null;
		}
		Static55.anInt1279 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static8.aClass83Array1.length; local69++) {
			Static8.aClass83Array1[local69] = null;
		}
	}
}
