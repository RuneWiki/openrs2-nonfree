import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_40 = new Class130(20, 11);

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_41 = new Class130(46, 15);

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!he;I)Z")
	public static boolean method2421(@OriginalArg(0) Class135 arg0) {
		return Static252.aClass135_5 == arg0 || Static310.aClass135_6 == arg0 || arg0 == Static350.aClass135_12 || arg0 == Static531.aClass135_15;
	}
}
