import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static386 {

	@OriginalMember(owner = "client!nca", name = "G", descriptor = "Lclient!rf;")
	public static Class298 aClass298_2;

	@OriginalMember(owner = "client!nca", name = "V", descriptor = "I")
	public static int anInt7119;

	@OriginalMember(owner = "client!nca", name = "cb", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!nca", name = "gb", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_129 = new Class44(116, 16);

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BI)Lclient!jba;")
	public static Class175 method5772(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static70.aClass175Array1[arg0] : null;
	}
}
