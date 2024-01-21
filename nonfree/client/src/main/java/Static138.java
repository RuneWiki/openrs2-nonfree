import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "[Lclient!dj;")
	public static Class24[] aClass24Array21;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Z")
	public static boolean aBoolean145;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] aClass1_Sub2_Sub8_Sub3Array18;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "[I")
	public static final int[] anIntArray253 = new int[100];

	@OriginalMember(owner = "client!og", name = "g", descriptor = "[I")
	public static final int[] anIntArray254 = new int[32768];

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_925 = Static81.method1507("leuchten1:");

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	public static int anInt3107 = 0;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	public static void method2411() {
		if (Static107.aClass73_1 != null) {
			@Pc(3) Class73 local3 = Static107.aClass73_1;
			synchronized (Static107.aClass73_1) {
				Static107.aClass73_1 = null;
			}
		}
	}
}
