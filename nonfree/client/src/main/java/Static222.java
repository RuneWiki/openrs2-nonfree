import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!o", name = "w", descriptor = "Lclient!wd;")
	public static Class212 aClass212_12;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "I")
	public static int anInt4459;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray57 = new String[100];

	@OriginalMember(owner = "client!o", name = "G", descriptor = "Z")
	public static boolean aBoolean294 = true;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "I")
	public static int anInt4457 = 0;

	@OriginalMember(owner = "client!o", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray58 = new String[100];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBII)I")
	public static int method3991(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > arg0) {
			return arg2;
		} else if (arg0 > arg1) {
			return arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!mo;IB)Lclient!g;")
	public static Class71 method3992(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1) {
		@Pc(14) byte[] local14 = arg1.method3745(arg0, 0);
		return local14 == null ? null : new Class71(local14);
	}
}
