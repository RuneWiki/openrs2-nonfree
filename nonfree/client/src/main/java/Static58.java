import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
	public static int anInt1450 = 0;

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString15 = null;

	@OriginalMember(owner = "client!bu", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[6][];

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!lda;ILclient!lda;)V")
	public static void method1431(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(2) Class3_Sub6 arg1) {
		if (arg1.aClass3_Sub6_66 != null) {
			arg1.method8342();
		}
		arg1.aClass3_Sub6_67 = arg0.aClass3_Sub6_67;
		arg1.aClass3_Sub6_66 = arg0;
		arg1.aClass3_Sub6_66.aClass3_Sub6_67 = arg1;
		arg1.aClass3_Sub6_67.aClass3_Sub6_66 = arg1;
	}
}
