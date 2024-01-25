import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "Z")
	public static boolean aBoolean209;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!hca", name = "s", descriptor = "[I")
	public static int[] anIntArray199;

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "Lclient!v;")
	public static final Class362 aClass362_18 = new Class362();

	@OriginalMember(owner = "client!hca", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Lclient!hv;")
	public static Class6_Sub24 method3058() {
		if (Static528.aClass362_26 == null || Static324.aClass364_1 == null) {
			return null;
		}
		Static324.aClass364_1.method8566(Static528.aClass362_26);
		@Pc(23) Class6_Sub24 local23 = (Class6_Sub24) Static324.aClass364_1.method8570();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class318 local33 = Static528.aClass280_3.method6911(local23.anInt3909);
			return local33 != null && local33.aBoolean617 && local33.method7386(Static528.anInterface19_2) ? local23 : Static103.method1676();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IBII)V")
	public static void method3061(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static90.aByteArrayArrayArray2 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
	public static boolean method3062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static476.method6973(arg0, arg1) & Static527.method7377(arg0, arg1);
	}
}
