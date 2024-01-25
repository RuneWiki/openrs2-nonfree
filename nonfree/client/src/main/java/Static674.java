import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static674 {

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	public static int anInt10898;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "Lclient!hp;")
	public static Class152 aClass152_5;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "[I")
	public static final int[] anIntArray628 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
	public static int anInt10900 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)Lclient!qf;")
	public static Class293 method8986(@OriginalArg(0) int arg0) {
		@Pc(10) Class293 local10 = (Class293) Static16.aClass295_67.method6470((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static368.aClass362_76.method8368(1, arg0);
		local10 = new Class293();
		local10.anInt7715 = arg0;
		if (local29 != null) {
			local10.method6395(new Class3_Sub4(local29));
		}
		local10.method6397();
		if (local10.anInt7718 == 2 && Static20.aClass333_2.method7489((long) arg0) == null) {
			Static20.aClass333_2.method7488((long) arg0, new Class3_Sub24(Static570.anInt9193));
			Static171.aClass293Array1[Static570.anInt9193++] = local10;
		}
		Static16.aClass295_67.method6469((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIII)Z")
	public static boolean method8987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static355.aBoolean420 || !Static296.aBoolean335) {
			return false;
		} else if (Static304.anInt5127 < 100) {
			return false;
		} else {
			@Pc(24) int local24 = Static638.anIntArrayArrayArray18[arg0][arg1][arg2];
			if (local24 == -Static276.anInt4711) {
				return false;
			} else if (Static276.anInt4711 == local24) {
				return true;
			} else if (Static368.aClass35Array1 == Static582.aClass35Array3) {
				return false;
			} else {
				@Pc(52) int local52 = arg1 << Static571.anInt9216;
				@Pc(56) int local56 = arg2 << Static571.anInt9216;
				if (Static118.method7907(local52 + 1, Static582.aClass35Array3[arg0].method7461(arg2, arg1), Static582.aClass35Array3[arg0].method7461(arg2 + 1, arg1), local52 + 1, local56 - -1, local52 + Static599.anInt7773 - 1, Static599.anInt7773 + -1 + local56, Static582.aClass35Array3[arg0].method7461(arg2 + 1, arg1 + 1), Static599.anInt7773 + local56 - 1) && Static118.method7907(local52 + 1, Static582.aClass35Array3[arg0].method7461(arg2, arg1), Static582.aClass35Array3[arg0].method7461(arg2 + 1, arg1 + 1), local52 + Static599.anInt7773 - 1, local56 - -1, local52 + Static599.anInt7773 - 1, Static599.anInt7773 + local56 + -1, Static582.aClass35Array3[arg0].method7461(arg2, arg1 + 1), local56 + 1)) {
					Static453.anInt7307++;
					Static638.anIntArrayArrayArray18[arg0][arg1][arg2] = Static276.anInt4711;
					return true;
				} else {
					Static638.anIntArrayArrayArray18[arg0][arg1][arg2] = -Static276.anInt4711;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBI)Z")
	public static boolean method8989(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static382.method5376(arg0, arg1) | (arg0 & 0x10000) != 0 || Static58.method7704(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static506.method6604(arg1, arg0);
		}
	}
}
