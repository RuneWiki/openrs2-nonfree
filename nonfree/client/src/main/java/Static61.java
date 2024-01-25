import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_17 = new Class216(50, 11);

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
	public static final int[] anIntArray88 = new int[256];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
	public static void method1342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg0, 11);
		local9.method3955();
		local9.anInt4427 = arg1;
		local9.anInt4425 = arg2;
	}
}
