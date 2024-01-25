import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	public static final int anInt4668 = 4;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public static void method4026(@OriginalArg(0) int arg0) {
		if (Static171.anInt3648 == 0) {
			Static587.aClass6_Sub18_Sub2_3.method3316(arg0);
		} else {
			Static430.anInt7500 = arg0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method4028(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static230.aClass156_32.method4065(Static25.anInt769) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static230.aClass156_34.method4065(Static25.anInt769) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
