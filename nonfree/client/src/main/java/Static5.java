import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!bq;")
	public static final Class2_Sub7 aClass2_Sub7_1 = new Class2_Sub7(0, 0);

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public static final int anInt74 = -1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)Z")
	public static boolean method78(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static297.method3932(arg0, arg1) & Static369.method4838(arg1, arg0);
	}
}
