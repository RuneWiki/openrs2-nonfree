import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static409 {

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
	public static int anInt6712;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString69 = null;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "Lclient!al;")
	public static final Class18 aClass18_10 = new Class18();

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZI)Z")
	public static boolean method6022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static619.method8404(arg0, arg1) | Static562.method7824(arg0, arg1) | Static406.method6007(arg1, arg0)) & Static368.method5276(arg1, arg0);
	}
}
