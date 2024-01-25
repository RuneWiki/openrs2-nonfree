import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!jaa", name = "v", descriptor = "[I")
	public static final int[] anIntArray427 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!jaa", name = "F", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_59 = new Class158(47, 3);

	@OriginalMember(owner = "client!jaa", name = "G", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)V")
	public static void method3972(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub10_Sub16 local14 = Static362.method5701(arg0, 4);
		local14.method6212();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)I")
	public static int method3976() {
		return 14;
	}
}
