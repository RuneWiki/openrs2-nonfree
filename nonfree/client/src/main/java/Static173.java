import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array8;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "[I")
	public static int[] anIntArray224;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	public static int anInt3296;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	public static int anInt3297;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
	public static int anInt3293 = 0;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "Lclient!jja;")
	public static final Class195 aClass195_1 = new Class195();

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
	public static final int[] anIntArray225 = new int[500];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!gj;Z)V")
	public static void method2915(@OriginalArg(0) Class143 arg0) {
		Static72.anInt1666 = arg0.method3131("p11_full");
		Static397.anInt6848 = arg0.method3131("p12_full");
		Static496.anInt8329 = arg0.method3131("b12_full");
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	public static void method2916() {
		@Pc(11) Class279 local11 = Static104.aClass279_10;
		synchronized (Static104.aClass279_10) {
			Static104.aClass279_10.method6637();
		}
		local11 = Static488.aClass279_44;
		synchronized (Static488.aClass279_44) {
			Static488.aClass279_44.method6637();
		}
	}
}
