import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "Lclient!rj;")
	public static Class118 aClass118_2;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString31 = " ";

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "[I")
	public static int[] anIntArray57 = new int[2500];

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "[Lclient!ak;")
	public static Class9_Sub1_Sub2[] aClass9_Sub1_Sub2Array2 = new Class9_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[250][];

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!hc;I)Lclient!ge;")
	public static Class7_Sub1 method449(@OriginalArg(2) Class51 arg0, @OriginalArg(3) int arg1) {
		return Static96.method2050(arg0, 0, arg1) ? Static215.method3533() : null;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)Lclient!q;")
	public static Class1_Sub2_Sub4_Sub1 method451() {
		@Pc(18) int local18 = Static233.anIntArray438[0] * Static218.anIntArray382[0];
		@Pc(26) byte[] local26 = Static11.aByteArrayArray1[0];
		@Pc(29) int[] local29 = new int[local18];
		for (@Pc(31) int local31 = 0; local31 < local18; local31++) {
			local29[local31] = Static102.anIntArray201[local26[local31] & 0xFF];
		}
		@Pc(66) Class1_Sub2_Sub4_Sub1 local66 = new Class1_Sub2_Sub4_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[0], Static79.anIntArray165[0], Static218.anIntArray382[0], Static233.anIntArray438[0], local29);
		Static259.method4155();
		return local66;
	}
}
