import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "Lclient!fk;")
	public static final Class74 aClass74_4 = new Class74();

	@OriginalMember(owner = "client!dr", name = "T", descriptor = "[I")
	public static final int[] anIntArray76 = new int[50];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)I")
	public static int method936() {
		return 6;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V")
	public static void method940() {
		Static168.aClass26_30.method329(5);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZI)V")
	public static void method941(@OriginalArg(1) int arg0) {
		@Pc(13) Class11_Sub4_Sub12 local13 = Static35.method512(6, arg0);
		local13.method3864();
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)V")
	public static void method942() {
		Static212.aClass26_40.method329(5);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)Z")
	public static boolean method945(@OriginalArg(1) int arg0) {
		return arg0 == 47 || arg0 == 6 || arg0 == 1002 || arg0 == 9 || arg0 == 2;
	}
}
