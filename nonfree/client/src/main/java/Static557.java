import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "[Lclient!i;")
	public static Class47[] aClass47Array3;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "[I")
	public static int[] anIntArray708;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "F")
	public static float aFloat208;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "[I")
	public static final int[] anIntArray709 = new int[5];

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
	public static int anInt9336 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Lclient!lv;")
	public static Class8_Sub6 method7582() {
		@Pc(16) Class8_Sub6 local16 = (Class8_Sub6) Static528.aClass209_8.method4192();
		if (local16 == null) {
			return new Class8_Sub6();
		} else {
			Static122.anInt2408--;
			return local16;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public static void method7584() {
		for (@Pc(7) int local7 = 0; local7 < Static39.anInt609; local7++) {
			@Pc(13) int local13 = Static17.anIntArray24[local7];
			@Pc(20) Class1_Sub42 local20 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local13);
			if (local20 != null) {
				@Pc(25) Class8_Sub3_Sub3_Sub1_Sub2 local25 = local20.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				Static297.method4157(local25, local25.aClass20_1.anInt350);
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Z")
	public static boolean method7585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static142.method2139(arg0, arg1) || Static69.method1218(arg1, arg0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Z")
	public static boolean method7586(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BII)Z")
	public static boolean method7587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
