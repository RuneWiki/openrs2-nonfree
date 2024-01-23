import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!og", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString262 = "Started 3d Library";

	@OriginalMember(owner = "client!og", name = "v", descriptor = "I")
	public static int anInt3979 = 0;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "[I")
	public static int[] anIntArray299 = new int[500];

	@OriginalMember(owner = "client!og", name = "z", descriptor = "Lclient!lc;")
	public static Class79 aClass79_26 = new Class79(4);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I")
	public static int method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method2960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
