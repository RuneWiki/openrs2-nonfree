import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "Lclient!of;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lclient!dp;")
	public static Class53 aClass53_29;

	@OriginalMember(owner = "client!ch", name = "eb", descriptor = "[[[Lclient!sk;")
	public static Class187[][][] aClass187ArrayArrayArray1;

	@OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
	public static final int anInt756 = 50;

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "[I")
	public static final int[] anIntArray90 = new int[anInt756];

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "[I")
	public static final int[] anIntArray91 = new int[anInt756];

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "[I")
	public static final int[] anIntArray92 = new int[anInt756];

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "[I")
	public static final int[] anIntArray93 = new int[anInt756];

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "[I")
	public static final int[] anIntArray94 = new int[32];

	@OriginalMember(owner = "client!ch", name = "V", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[anInt756];

	@OriginalMember(owner = "client!ch", name = "Z", descriptor = "[I")
	public static final int[] anIntArray95 = new int[anInt756];

	@OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
	public static int anInt755 = 0;

	@OriginalMember(owner = "client!ch", name = "cb", descriptor = "[I")
	public static final int[] anIntArray96 = new int[anInt756];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[B)[B")
	public static byte[] method683(@OriginalArg(1) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static358.method954(arg0, 0, local17, 0, local14);
		return local17;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Lclient!cg;")
	public static Class6_Sub2_Sub3 method685(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub2_Sub3 local10 = (Class6_Sub2_Sub3) Static109.aClass31_5.method634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static119.aClass53_67.method1033(Static281.method4841(arg0), Static271.method4601(arg0));
		local10 = new Class6_Sub2_Sub3();
		if (local29 != null) {
			local10.method654(new Class6_Sub10(local29));
		}
		Static109.aClass31_5.method632((long) arg0, local10);
		return local10;
	}
}
