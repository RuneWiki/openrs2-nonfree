import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Z")
	public static boolean aBoolean421 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!iha;")
	public static RuntimeException_Sub1 method5409(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString51 = local12.aString51 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V")
	public static void method5410(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg0, 11);
		local9.method7979();
	}
}
