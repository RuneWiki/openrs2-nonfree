import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "[I")
	public static int[] anIntArray416;

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "[I")
	public static final int[] anIntArray415 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_181 = new Class18(61, 3);

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "Z")
	public static boolean aBoolean416 = false;

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "[Lclient!wc;")
	public static final Class11_Sub2_Sub6_Sub1[] aClass11_Sub2_Sub6_Sub1Array1 = new Class11_Sub2_Sub6_Sub1[2048];

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[200];

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
	public static int anInt5356 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([BI)[B")
	public static byte[] method4903(@OriginalArg(0) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static374.method2826(arg0, 0, local17, 0, local14);
		return local17;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIILclient!cl;)V")
	public static void method4904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1 arg3) {
		@Pc(4) Class155 local4 = Static94.method2043(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub1_2 = arg3;
		}
	}
}
