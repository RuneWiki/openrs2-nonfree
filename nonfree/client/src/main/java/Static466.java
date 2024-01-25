import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!qj", name = "L", descriptor = "[Lclient!ig;")
	public static Class13_Sub1[] aClass13_Sub1Array3;

	@OriginalMember(owner = "client!qj", name = "G", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject17 = null;

	@OriginalMember(owner = "client!qj", name = "M", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([BI)Z")
	public static boolean method6312(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub22 local8 = new Class2_Sub22(arg0);
		@Pc(12) int local12 = local8.method8547();
		if (local12 != 2) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method8547() == 1;
		if (local30) {
			Static5.method99(local8);
		}
		Static286.method3982(local8);
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Z")
	public static boolean method6313(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
