import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "Lclient!jo;")
	public static Class168 aClass168_79;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Lclient!tb;")
	public static Class294 aClass294_1;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "Lclient!vw;")
	public static final Class340 aClass340_10 = new Class340();

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_115 = new Class254(89, 2);

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "[I")
	public static int[] anIntArray457 = new int[1];

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_116 = new Class254(5, 12);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)Lclient!vf;")
	public static Class330 method5264(@OriginalArg(0) int arg0) {
		@Pc(15) Class330 local15 = (Class330) Static392.aClass245_54.method6082((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static356.aClass168_86.method4435(arg0, 1);
		local15 = new Class330();
		local15.anInt9301 = arg0;
		if (local25 != null) {
			local15.method7787(new Class6_Sub26(local25));
		}
		local15.method7786();
		if (local15.anInt9306 == 2 && Static535.aClass305_38.method7447((long) arg0) == null) {
			Static535.aClass305_38.method7448((long) arg0, new Class6_Sub24(Static131.anInt2844));
			Static536.aClass330Array1[Static131.anInt2844++] = local15;
		}
		Static392.aClass245_54.method6075(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)Z")
	public static boolean method5265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static61.method1332(arg1, arg0) & Static90.method2003(arg0, arg1);
	}
}
