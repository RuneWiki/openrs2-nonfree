import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!paa", name = "dd", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!paa", name = "gd", descriptor = "I")
	public static int anInt6880;

	@OriginalMember(owner = "client!paa", name = "Oc", descriptor = "I")
	public static int anInt6866 = -1;

	@OriginalMember(owner = "client!paa", name = "cd", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_11 = new Class316(0, 17);

	@OriginalMember(owner = "client!paa", name = "ed", descriptor = "[[F")
	public static final float[][] aFloatArrayArray8 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "(B)Z")
	public static boolean method5441() {
		return Static577.aBoolean745;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)V")
	public static void method5446() {
		if (Static505.aClass177_2 != null) {
			Static505.aClass177_2.method7507();
		}
		if (Static163.aClass177_1 != null) {
			Static163.aClass177_1.method7507();
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method5449(@OriginalArg(2) String arg0) {
		return Static421.method5834(arg0, 16);
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(II)V")
	public static void method5451(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(9, arg0);
		local8.method6593();
	}
}
