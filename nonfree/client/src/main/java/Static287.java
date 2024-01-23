import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
	public static int anInt5204;

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "Z")
	public static boolean aBoolean492 = false;

	@OriginalMember(owner = "client!ul", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString202 = "Attack";

	@OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
	public static int anInt5198 = 0;

	@OriginalMember(owner = "client!ul", name = "L", descriptor = "[I")
	public static int[] anIntArray568 = new int[14];

	@OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
	public static int anInt5199 = -1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBI)V")
	public static void method4319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub5_Sub21 local16 = Static278.method4266(5, arg0);
		local16.method4062();
		local16.anInt4863 = arg1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!re;I)V")
	public static void method4321(@OriginalArg(0) Class11_Sub4 arg0) {
		@Pc(9) int local9 = arg0.anInt3867 - Static167.anInt637;
		@Pc(21) int local21 = arg0.anInt3844 * 128 + arg0.method3347() * 64;
		@Pc(33) int local33 = arg0.anInt3827 * 128 + arg0.method3347() * 64;
		arg0.anInt3806 = 0;
		if (arg0.anInt3819 == 0) {
			arg0.anInt3853 = 1024;
		}
		arg0.anInt3865 += (local21 - arg0.anInt3865) / local9;
		if (arg0.anInt3819 == 1) {
			arg0.anInt3853 = 1536;
		}
		arg0.anInt3856 += (local33 - arg0.anInt3856) / local9;
		if (arg0.anInt3819 == 2) {
			arg0.anInt3853 = 0;
		}
		if (arg0.anInt3819 == 3) {
			arg0.anInt3853 = 512;
		}
	}
}
