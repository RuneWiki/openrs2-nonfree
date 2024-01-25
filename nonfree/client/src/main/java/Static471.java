import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "Lclient!da;")
	public static Class6 aClass6_12;

	@OriginalMember(owner = "client!qn", name = "O", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "Lclient!ro;")
	public static final Class306 aClass306_45 = new Class306();

	@OriginalMember(owner = "client!qn", name = "N", descriptor = "[I")
	public static final int[] anIntArray636 = new int[14];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)V")
	public static void method6899() {
		Static645.aClass293_77.method6922(5);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)Z")
	public static boolean method6900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static51.method804(arg1, arg0) || Static130.method1926(arg0, arg1);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[B)Z")
	public static boolean method6901(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class5_Sub12 local8 = new Class5_Sub12(arg0);
		@Pc(12) int local12 = local8.method8645();
		if (local12 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local8.method8645() == 1;
		if (local33) {
			Static38.method710(local8);
		}
		Static540.method7701(local8);
		return true;
	}
}
