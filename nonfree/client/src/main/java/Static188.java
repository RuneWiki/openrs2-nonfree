import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	public static int anInt3900;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	public static int anInt3902;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Z")
	public static boolean aBoolean295 = true;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "[I")
	public static int[] anIntArray349 = new int[14];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	public static void method3142() {
		Static227.aClass135_27.method3320(5);
		Static140.aClass135_14.method3320(5);
		Static71.aClass135_5.method3320(5);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!ec;)V")
	public static void method3144(@OriginalArg(1) Class1_Sub14 arg0) {
		Static127.method2188(200000, arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)Lclient!nh;")
	public static Class112 method3145(@OriginalArg(1) int arg0) {
		@Pc(10) Class112 local10 = (Class112) Static127.aClass135_13.method3316((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static282.aClass91_198.method2495(3, arg0);
		local10 = new Class112();
		if (local21 != null) {
			local10.method2996(new Class1_Sub11(local21));
		}
		Static127.aClass135_13.method3321((long) arg0, local10);
		return local10;
	}
}
