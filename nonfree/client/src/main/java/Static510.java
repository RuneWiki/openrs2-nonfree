import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
	public static void method7252(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub4_Sub18 local12 = Static565.method7924((long) arg0, 12);
		local12.method7979();
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
	public static void method7253() {
		for (@Pc(11) int local11 = 0; local11 < Static505.anInt8479; local11++) {
			@Pc(17) Class243 local17 = Static461.aClass243Array1[local11];
			if (local17.aByte108 == 3) {
				if (local17.aClass6_Sub8_Sub5_4 == null) {
					local17.anInt6783 = Integer.MIN_VALUE;
				} else {
					Static106.aClass6_Sub8_Sub3_2.method4258(local17.aClass6_Sub8_Sub5_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
	public static void method7254(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		Static92.method1534(arg0, arg1, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBIII)V")
	public static void method7255(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static502.anInt8456 <= arg3 && Static153.anInt2554 >= arg3) {
			@Pc(19) int local19 = Static154.method2176(arg0, Static292.anInt4921, Static55.anInt4238);
			@Pc(25) int local25 = Static154.method2176(arg1, Static292.anInt4921, Static55.anInt4238);
			Static562.method7898(local19, local25, arg2, arg3);
		}
	}
}
