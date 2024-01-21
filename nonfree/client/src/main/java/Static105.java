import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!nf", name = "qb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_790 = Static8.method128("green:");

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_782 = aClass18_790;

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "[I")
	public static int[] anIntArray275 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!nf", name = "ib", descriptor = "Lclient!ea;")
	private static Class18 aClass18_786 = Static8.method128("purple:");

	@OriginalMember(owner = "client!nf", name = "fb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_783 = aClass18_786;

	@OriginalMember(owner = "client!nf", name = "gb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_784 = aClass18_790;

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_785 = Static8.method128("welle:");

	@OriginalMember(owner = "client!nf", name = "jb", descriptor = "[[[Lclient!pg;")
	public static Class59[][][] aClass59ArrayArrayArray1 = new Class59[4][104][104];

	@OriginalMember(owner = "client!nf", name = "kb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_787 = Static8.method128("Your account is already logged in)3");

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_788 = aClass18_787;

	@OriginalMember(owner = "client!nf", name = "ob", descriptor = "Lclient!ea;")
	public static Class18 aClass18_789 = aClass18_786;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
	public static void method2177() {
		aClass18_783 = null;
		aClass18_788 = null;
		aClass18_785 = null;
		aClass18_789 = null;
		aClass18_784 = null;
		aClass59ArrayArrayArray1 = null;
		aClass18_787 = null;
		aClass18_790 = null;
		anIntArray275 = null;
		aClass18_782 = null;
		aClass18_786 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZIIB)V")
	public static void method2178(@OriginalArg(0) boolean arg0) {
		Static71.aBoolean84 = arg0;
		Static74.anInt2248 = 22050;
		Static27.anInt913 = 2;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!hc;ILclient!ea;)I")
	public static int method2179(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(2) Class18 arg1) {
		@Pc(11) int local11 = arg0.anInt839;
		arg0.method517(arg1.anInt1129);
		arg0.anInt839 += Static110.aClass15_1.method574(arg0.aByteArray3, 0, arg0.anInt839, arg1.anInt1129, arg1.aByteArray6);
		return arg0.anInt839 - local11;
	}
}
