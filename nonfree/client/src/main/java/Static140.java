import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "I")
	public static int anInt2503;

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_65 = new Class163(54, 3);

	@OriginalMember(owner = "client!gs", name = "E", descriptor = "[I")
	public static final int[] anIntArray129 = new int[100];

	@OriginalMember(owner = "client!gs", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString37 = "";

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)I")
	public static int method2138(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!co;)Z")
	public static boolean method2149(@OriginalArg(1) Class35 arg0) {
		return arg0 == Static266.aClass35_5 || Static246.aClass35_4 == arg0 || Static390.aClass35_7 == arg0 || Static317.aClass35_6 == arg0;
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(II)V")
	public static void method2150(@OriginalArg(1) int arg0) {
		Static14.method264();
		@Pc(11) int local11 = Static208.aClass159_1.method3765(arg0).anInt6991;
		if (local11 == 0) {
			return;
		}
		@Pc(20) int local20 = Static119.aClass47_1.anIntArray67[arg0];
		if (local11 == 6) {
			Static335.anInt5574 = local20;
		}
		if (local11 == 5) {
			Static29.anInt5767 = local20;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIII)I")
	public static int method2151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > arg2) {
			return arg0;
		} else if (arg1 < arg2) {
			return arg1;
		} else {
			return arg2;
		}
	}
}
