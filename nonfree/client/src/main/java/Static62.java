import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
	public static int anInt971 = 0;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
	public static int anInt973 = 0;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "[I")
	public static final int[] anIntArray50 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "[I")
	public static final int[] anIntArray51 = new int[25];

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)Z")
	public static boolean method870() {
		@Pc(10) Class5_Sub32 local10 = (Class5_Sub32) Static608.aClass102_71.method1916();
		if (local10 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < local10.anInt5872; local17++) {
			if (local10.aClass366Array2[local17] != null && local10.aClass366Array2[local17].anInt10206 == 0) {
				return false;
			}
			if (local10.aClass366Array1[local17] != null && local10.aClass366Array1[local17].anInt10206 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BII)Z")
	public static boolean method872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static583.method8399(arg1, arg0) | Static349.method5252(arg1, arg0) | Static433.method6424(arg1, arg0)) & Static608.method8687(arg0, arg1);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
	public static void method873() {
		if (Static311.aClass175_1 != null) {
			Static311.aClass175_1.method4705();
		}
		if (Static536.aClass175_3 != null) {
			Static536.aClass175_3.method4705();
		}
	}
}
