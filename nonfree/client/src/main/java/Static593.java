import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!ud;")
	public static final Class342 aClass342_1 = new Class342();

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!ud;")
	public static final Class342 aClass342_2 = new Class342();

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!ud;")
	public static final Class342 aClass342_3 = new Class342();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!ud;")
	public static final Class342 aClass342_4 = new Class342();

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Z")
	public static boolean aBoolean754 = false;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
	public static final int[] anIntArray551 = new int[4];

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_115 = new Class387(7, 7);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[S)[S")
	public static short[] method8589(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static682.method795(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ic;)V")
	public static void method8591(@OriginalArg(1) Class8_Sub1_Sub3_Sub2_Sub1 arg0) {
		@Pc(16) Class5_Sub22 local16 = (Class5_Sub22) Static679.aClass291_46.method6993((long) arg0.anInt6994, 1);
		if (local16 == null) {
			return;
		}
		if (local16.aClass5_Sub16_Sub3_2 != null) {
			Static91.aClass5_Sub16_Sub1_1.method2554(local16.aClass5_Sub16_Sub3_2);
			local16.aClass5_Sub16_Sub3_2 = null;
		}
		local16.method9327(1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method8592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg4 > arg3 && arg0 < arg3 + arg6) {
			return arg5 + arg1 > arg7 && arg2 + arg7 > arg1;
		} else {
			return false;
		}
	}
}
