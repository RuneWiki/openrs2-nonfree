import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static437 {

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
	public static int anInt7555;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_15 = new Class146(0, 15);

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_127 = new Class237(105, 3);

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_16 = new Class146(1, 18);

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
	public static int anInt7556 = 0;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "[Lclient!qp;")
	public static final Class191[] aClass191Array2 = new Class191[14];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ss;I)Ljava/lang/String;")
	public static String method5858(@OriginalArg(0) Class219 arg0) {
		if (Static53.method916(arg0).method5784() == 0) {
			return null;
		} else if (arg0.aString48 == null || arg0.aString48.trim().length() == 0) {
			return Static239.aBoolean287 ? "Hidden-use" : null;
		} else {
			return arg0.aString48;
		}
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	public static void method5859() {
		Static342.aClass83_50.method1669();
	}
}
