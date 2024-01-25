import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static568 {

	@OriginalMember(owner = "client!tba", name = "w", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_137 = new Class171(109, 8);

	@OriginalMember(owner = "client!tba", name = "B", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_138 = new Class171(73, 12);

	@OriginalMember(owner = "client!tba", name = "D", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_100 = new Class240(58, -1);

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILclient!mq;)I")
	public static int method7474(@OriginalArg(1) Class235 arg0) {
		if (Static665.aClass235_4 == arg0) {
			return 5890;
		} else if (arg0 == Static189.aClass235_1) {
			return 34167;
		} else if (Static383.aClass235_2 == arg0) {
			return 34168;
		} else if (arg0 == Static576.aClass235_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
