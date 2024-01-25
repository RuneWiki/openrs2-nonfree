import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Lclient!dfa;")
	public static Class54 aClass54_2;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public static final int anInt2982 = 1403;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
	public static int anInt2996 = 0;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2590(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static361.method5671("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(III)Lclient!jba;")
	public static Class152 method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass152_2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZ)I")
	public static int method2594(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static105.anInt2774;
		if (local5 == 0) {
			return arg0 ? 0 : Static58.anInt1883;
		} else if (local5 == 1) {
			return Static58.anInt1883;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	public static void method2595() {
		@Pc(7) int local7 = Static315.anInt9128;
		@Pc(15) int[] local15 = Static533.anIntArray506;
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(25) Class15_Sub1_Sub2_Sub2_Sub1 local25 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local15[local17]];
			if (local25 != null) {
				Static314.method5188(local25, local25.method6692());
			}
		}
	}
}
