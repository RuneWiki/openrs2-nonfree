import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
	public static int anInt6266;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!ne;")
	public static final Class170 aClass170_11 = new Class170("WTI", 5);

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([SBI)[S")
	public static short[] method4958(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static468.method3864(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)V")
	public static void method4962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(9, arg0);
		local8.method3026();
		local8.anInt3818 = arg1;
		local8.anInt3826 = arg2;
	}
}
