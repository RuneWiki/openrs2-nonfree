import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "B", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_1 = new Class145(17, 2);

	@OriginalMember(owner = "client!aaa", name = "D", descriptor = "Lclient!pw;")
	public static final Class280 aClass280_1 = new Class280(16);

	@OriginalMember(owner = "client!aaa", name = "E", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_1 = new Class200(37, -2);

	@OriginalMember(owner = "client!aaa", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString1 = null;

	@OriginalMember(owner = "client!aaa", name = "G", descriptor = "I")
	public static int anInt38 = 0;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BIZ)V")
	public static void method57(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(11) Class2_Sub31 local11 = Static275.method4480(Static640.aClass314_2, Static565.aClass145_165);
			local11.aClass2_Sub17_Sub1_2.method2879(arg0);
			Static526.method7309(local11);
		} else {
			Static156.method2739(Static12.aClass312_1, arg0, -1);
		}
	}
}
