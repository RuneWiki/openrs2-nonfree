import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!kc;")
	public static Class3 aClass3_4;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_76 = new Class146(9, -1);

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public static int anInt5549 = -1;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "[I")
	public static final int[] anIntArray446 = new int[5];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZI)Z")
	public static boolean method4513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static174.method2447(arg1, arg0) || Static107.method1597(arg1, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method4515() {
		Static382.method5075();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static409.aClass128Array1[local8].method2466();
		}
		Static351.method4657();
		Static297.method3871();
		System.gc();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	public static void method4516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static413.aClass49_Sub1_1.anInt3199 != 0 && arg1 != 0 && Static418.anInt7061 < 50 && arg2 != -1) {
			Static246.aClass46Array1[Static418.anInt7061++] = new Class46((byte) 1, arg2, arg1, arg0, arg3, 0);
		}
	}
}
