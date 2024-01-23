import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
	public static int anInt3473;

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
	public static int anInt3493;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "[Lclient!jh;")
	public static Class2_Sub4_Sub2[] aClass2_Sub4_Sub2Array1 = new Class2_Sub4_Sub2[2048];

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString211 = "skill: ";

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString212 = "glow3:";

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ[[I[[F[[F[[FI[[IBIZIIILclient!ua;ZI[ZB[IZI)V")
	public static void method2519(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class1_Sub28 arg13, @OriginalArg(15) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) boolean[] arg16, @OriginalArg(18) byte arg17, @OriginalArg(19) int[] arg18, @OriginalArg(20) boolean arg19, @OriginalArg(21) int arg20) {
		@Pc(15) int local15 = (arg12 << 8) + (arg9 ? 255 : 0);
		@Pc(25) int local25 = (arg19 ? 255 : 0) + (arg15 << 8);
		@Pc(36) int local36 = (arg8 << 8) + (arg1 ? 255 : 0);
		@Pc(52) int local52 = (arg14 ? 255 : 0) + (arg20 << 8);
		@Pc(58) int[] local58 = new int[arg18.length / 2];
		for (@Pc(60) int local60 = 0; local60 < local58.length; local60++) {
			@Pc(75) int local75 = arg18[local60 + local60];
			@Pc(83) int local83 = arg18[local60 + local60 + 1];
			@Pc(95) int[][] local95 = arg2 == null || arg16 == null || !arg16[local60] ? arg7 : arg2;
			local58[local60] = Static292.method4469(arg4, arg13, local36, arg3, local25, arg5, local75, arg10, local52, arg17, (float) arg0, false, arg2, local83, local15, arg11, local95);
		}
		arg13.method4174(arg6, arg11, arg10, local58, null, false);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIIII)V")
	public static void method2520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static203.anInt5700; local3++) {
			if (Static197.anIntArray379[local3] + Static117.anIntArray424[local3] > arg0 && Static117.anIntArray424[local3] < arg2 + arg0 && arg1 < Static128.anIntArray278[local3] + Static103.anIntArray231[local3] && Static103.anIntArray231[local3] < arg3 + arg1) {
				Static29.aBooleanArray6[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)[Lclient!lb;")
	public static Class46_Sub1[] method2525() {
		@Pc(8) Class46_Sub1[] local8 = new Class46_Sub1[Static165.anInt3668];
		for (@Pc(15) int local15 = 0; local15 < Static165.anInt3668; local15++) {
			local8[local15] = new Class46_Sub1(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[local15], Static137.anIntArray227[local15], Static95.anIntArray212[local15], Static50.anIntArray22[local15], Static34.aByteArrayArray5[local15], Static234.anIntArray454);
		}
		Static20.method432();
		return local8;
	}
}
