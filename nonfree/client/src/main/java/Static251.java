import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static251 {

	@OriginalMember(owner = "client!te", name = "x", descriptor = "Lclient!fm;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "I")
	public static int anInt5003;

	@OriginalMember(owner = "client!te", name = "E", descriptor = "I")
	public static int anInt5008;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "Lclient!rj;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_10;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "C")
	public static char aChar4;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BC)Z")
	public static boolean method4015(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
