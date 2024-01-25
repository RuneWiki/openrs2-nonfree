import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static155 {

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "Lclient!uh;")
	public static final Class352 aClass352_5 = new Class352(9, 0, 4, 1);

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
	public static int anInt3058 = -1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLclient!ip;)I")
	public static int method2504(@OriginalArg(1) Class169 arg0) {
		if (Static201.aClass169_3 == arg0) {
			return 5890;
		} else if (Static370.aClass169_8 == arg0) {
			return 34167;
		} else if (arg0 == Static567.aClass169_7) {
			return 34168;
		} else if (Static490.aClass169_6 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZB)V")
	public static void method2506(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static608.method8557(arg1, Static514.aClass303_14.method7473(Static232.anInt4258), arg0);
	}
}
