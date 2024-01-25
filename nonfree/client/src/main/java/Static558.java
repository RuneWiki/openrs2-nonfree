import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "Z")
	public static boolean aBoolean714 = false;

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_165 = new Class73(40, 6);

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "Lclient!jd;")
	public static final Class153 aClass153_12 = new Class153(1, 2);

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "Lclient!bq;")
	public static final Class36 aClass36_1 = new Class36();

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "([FIB)[F")
	public static float[] method7546(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static601.method2935(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
