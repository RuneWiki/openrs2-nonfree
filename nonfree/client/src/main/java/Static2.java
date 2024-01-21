import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!ha;")
	public static Class1_Sub5_Sub2 aClass1_Sub5_Sub2_1;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!ef;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public static int anInt102;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!ea;")
	private static Class18 aClass18_54 = Static8.method128("Loaded wordpack");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_52 = aClass18_54;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public static int anInt100 = 0;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1 = new byte[4][104][104];

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_53 = Static8.method128("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public static volatile int anInt103 = 0;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!ea;")
	public static Class18 aClass18_55 = Static8.method128("hel");

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_56 = Static8.method128("leuchten1:");

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_57 = Static8.method128("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIII)V")
	public static void method53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static48.method1038(arg1)) {
			Static58.method1197(arg4, arg0, arg2, arg3, arg5, -1, arg6, Static148.aClass20ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!dd;IB)Lclient!nc;")
	public static Class1_Sub16 method54(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method2234(arg1);
		return local13 == null ? null : new Class1_Sub16(local13);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method55() {
		aClass18_57 = null;
		aClass18_55 = null;
		aClass18_56 = null;
		anIntArray3 = null;
		aByteArrayArrayArray1 = null;
		aClass1_Sub5_Sub2_1 = null;
		aClass18_53 = null;
		aClass18_52 = null;
		aClass20_1 = null;
		aClass18_54 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method56() {
		for (@Pc(11) Class1_Sub9 local11 = (Class1_Sub9) Static12.aClass59_59.method2417(); local11 != null; local11 = (Class1_Sub9) Static12.aClass59_59.method2424()) {
			if (local11.aClass1_Sub1_Sub11_1 != null) {
				local11.method821();
			}
		}
	}
}
