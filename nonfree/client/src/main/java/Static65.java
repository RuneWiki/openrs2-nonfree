import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZ)Z")
	public static boolean method1238(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZLclient!ak;IIB)V")
	public static void method1239(@OriginalArg(1) Class11_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.anIntArray232[0];
		@Pc(13) int local13 = arg0.anIntArray233[0];
		if (local8 < 0 || Static3.anInt46 <= local8 || local13 < 0 || local13 >= Static270.anInt5194 || (arg2 < 0 || Static3.anInt46 <= arg2 || arg1 < 0 || arg1 >= Static270.anInt5194)) {
			return;
		}
		@Pc(78) int local78 = Static32.method748(0, -4, 0, local13, Static288.anIntArray366, true, arg0.method2778(), arg2, 0, arg1, Static19.aClass179Array2[arg0.aByte124], Static466.anIntArray304, 0, local8);
		if (local78 >= 1 && local78 <= 3) {
			for (@Pc(90) int local90 = 0; local90 < local78 - 1; local90++) {
				arg0.method431(Static466.anIntArray304[local90], (byte) 2, Static288.anIntArray366[local90]);
			}
		}
	}
}
