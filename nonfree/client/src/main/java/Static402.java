import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "Lclient!pt;")
	public static Class3_Sub9_Sub5 aClass3_Sub9_Sub5_2;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_140 = new Class126(98, 6);

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
	public static final int anInt6874 = Static289.method7950(1600);

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "Lclient!aca;")
	public static final Class6 aClass6_24 = new Class6(8, 1);

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "Z")
	public static boolean aBoolean517 = false;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([FII)[F")
	public static float[] method5741(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static689.method8057(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Z")
	public static boolean method5742(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V")
	public static void method5744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub6_Sub7 local14 = Static198.method3146((long) arg1, 14);
		local14.method1712();
		local14.anInt1790 = arg0;
	}
}
