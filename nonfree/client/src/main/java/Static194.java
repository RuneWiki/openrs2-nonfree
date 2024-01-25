import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
	public static int anInt3301;

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
	public static int anInt3305;

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "Lclient!tt;")
	public static Class344 aClass344_1;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2753(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class6_Sub26 local20 = Static268.method3981(Static377.aClass15_2, Static378.aClass289_118);
		local20.aClass6_Sub23_Sub1_2.method8366(Static622.method8568(arg0) + 1);
		local20.aClass6_Sub23_Sub1_2.method8366(arg1);
		local20.aClass6_Sub23_Sub1_2.method8398(arg0);
		Static670.method9077(local20);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(III)Z")
	public static boolean method2754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
