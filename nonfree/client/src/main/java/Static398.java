import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "Lclient!lo;")
	public static Class207 aClass207_1;

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
	public static int anInt7614;

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "[I")
	public static final int[] anIntArray387 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!pea", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[128][128];

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIZIII)Z")
	public static boolean method6283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0];
		@Pc(13) int local13 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0];
		if (local8 < 0 || local8 >= Static428.anInt8046 || local13 < 0 || local13 >= Static119.anInt2717) {
			return false;
		} else if (arg1 >= 0 && Static428.anInt8046 > arg1 && arg6 >= 0 && arg6 < Static119.anInt2717) {
			@Pc(76) int local76 = Static397.method6278(arg4, arg1, arg6, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925(), Static86.aClass111Array1[Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126], Static450.anIntArray464, local13, arg7, Static572.anIntArray534, local8, arg2, arg3, arg0, arg5);
			if (local76 < 1) {
				return false;
			}
			Static582.anInt10107 = Static450.anIntArray464[local76 - 1];
			Static8.anInt182 = Static572.anIntArray534[local76 - 1];
			Static569.aBoolean704 = false;
			Static224.method3666();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)V")
	public static void method6284() {
		Static223.aClass245_2.method5977();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIB)V")
	public static void method6286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class112 local9 = Static442.aClass112ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static52.anInt767 = local9.anInt3245;
			Static242.anInt4373 = local9.anInt3254;
			Static401.anInt7654 = local9.anInt3246;
		}
		Static511.method7460();
	}
}
