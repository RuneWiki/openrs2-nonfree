import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!cc;")
	public static Class2_Sub2_Sub4 aClass2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public static int anInt71 = 5063219;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!i;")
	public static Class41 aClass41_22 = Static184.method2923("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_23 = Static184.method2923("null");

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!i;")
	private static Class41 aClass41_26 = Static184.method2923("Please enter your username)3");

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_24 = aClass41_26;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_25 = Static184.method2923("(Z");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method54() {
		Static205.aClass43_23.method1469();
		Static93.aClass16_5.method436();
		Static126.aClass16_7.method436();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!i;ZLclient!i;Lclient!nb;)[Lclient!pf;")
	public static Class2_Sub2_Sub16_Sub1[] method56(@OriginalArg(0) Class41 arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) Class15 arg2) {
		@Pc(13) int local13 = arg2.method414(arg0);
		@Pc(19) int local19 = arg2.method416(arg1, local13);
		return Static212.method3260(local19, arg2, local13);
	}
}
