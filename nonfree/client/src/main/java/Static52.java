import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!f", name = "Yb", descriptor = "[Lclient!ch;")
	public static Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array2;

	@OriginalMember(owner = "client!f", name = "sc", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!f", name = "Cc", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!f", name = "Dc", descriptor = "[Lclient!ch;")
	public static Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array3;

	@OriginalMember(owner = "client!f", name = "Pb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_413 = Static200.method3116("lila:");

	@OriginalMember(owner = "client!f", name = "lc", descriptor = "Lclient!ge;")
	public static Class39 aClass39_9 = new Class39(64);

	@OriginalMember(owner = "client!f", name = "qc", descriptor = "Lclient!kh;")
	public static Class60 aClass60_415 = Static200.method3116("mod_icons");

	@OriginalMember(owner = "client!f", name = "vc", descriptor = "Lclient!nc;")
	public static Class1_Sub9 aClass1_Sub9_4 = new Class1_Sub9(new byte[5000]);

	@OriginalMember(owner = "client!f", name = "xc", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array8 = new Class60[500];

	@OriginalMember(owner = "client!f", name = "yc", descriptor = "I")
	public static int anInt1420 = 0;

	@OriginalMember(owner = "client!f", name = "zc", descriptor = "I")
	public static int anInt1421 = 0;

	@OriginalMember(owner = "client!f", name = "Ac", descriptor = "Lclient!kh;")
	private static Class60 aClass60_416 = Static200.method3116("skill)2");

	@OriginalMember(owner = "client!f", name = "Bc", descriptor = "I")
	public static int anInt1422 = -1;

	@OriginalMember(owner = "client!f", name = "Ec", descriptor = "Lclient!kh;")
	public static Class60 aClass60_417 = Static200.method3116("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!f", name = "Fc", descriptor = "Lclient!kh;")
	public static Class60 aClass60_418 = aClass60_416;

	@OriginalMember(owner = "client!f", name = "Gc", descriptor = "[I")
	public static int[] anIntArray165 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Z")
	public static boolean method1013(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)Lclient!k;")
	public static Class1_Sub1_Sub9 method1014(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub9 local10 = (Class1_Sub1_Sub9) Static152.aClass39_17.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30 = Static206.aClass7_39.method3242(Static204.method3166(arg0), Static141.method2418(arg0));
		local10 = new Class1_Sub1_Sub9();
		local10.anInt2305 = arg0;
		if (local30 != null) {
			local10.method1745(new Class1_Sub9(local30));
		}
		local10.method1749();
		Static152.aClass39_17.method1152((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!ai;)Lclient!ag;")
	public static Class1_Sub3 method1016(@OriginalArg(0) int arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(4) byte[] local4 = arg1.method3226(arg0);
		return local4 == null ? null : new Class1_Sub3(local4);
	}
}
