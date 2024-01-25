import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
	public static int anInt3159;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_52 = new Class397(67, 5);

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
	public static int anInt3158 = 0;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "Lclient!fr;")
	public static final Class123 aClass123_2 = new Class123(11, 0, 1, 2);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lclient!js;")
	public static Class201 method2882(@OriginalArg(0) int arg0) {
		@Pc(10) Class201 local10 = (Class201) Static460.aClass307_71.method7002((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static488.aClass182_98.method3985(arg0, 0);
		local10 = new Class201();
		if (local21 != null) {
			local10.method4709(new Class3_Sub2(local21));
		}
		local10.method4708();
		Static460.aClass307_71.method7000(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIII)V")
	public static void method2883(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		Static334.anInt5381 = arg0;
		Static77.anInt1737 = arg1;
		Static549.anInt5294 = 0;
		Static82.anInt1902 = 0;
	}
}
