import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!rs", name = "jc", descriptor = "Lclient!jaa;")
	public static Class170 aClass170_2;

	@OriginalMember(owner = "client!rs", name = "ab", descriptor = "[I")
	public static final int[] anIntArray477 = new int[8];

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "(II)V")
	public static void method7327(@OriginalArg(0) int arg0) {
		Static196.anInt3883 = arg0;
		Static181.anInt3236 = -1;
		Static523.anInt8995 = -1;
		Static494.method7232();
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(B)V")
	public static void method7328() {
		@Pc(12) Class5_Sub48 local12 = Static16.method232(Static39.aClass46_10, Static276.aClass251_2);
		local12.aClass5_Sub22_Sub1_2.method5918(Static621.anInt10361);
		Static277.method4436(local12);
	}

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "(I)Ljava/lang/String;")
	public static String method7336() {
		if (Static142.aBoolean190 || Static12.aClass5_Sub5_Sub15_1 == null) {
			return "";
		} else if ((Static12.aClass5_Sub5_Sub15_1.aString75 == null || Static12.aClass5_Sub5_Sub15_1.aString75.length() == 0) && Static12.aClass5_Sub5_Sub15_1.aString74 != null && Static12.aClass5_Sub5_Sub15_1.aString74.length() > 0) {
			return Static12.aClass5_Sub5_Sub15_1.aString74;
		} else {
			return Static12.aClass5_Sub5_Sub15_1.aString75;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7354(@OriginalArg(0) String arg0) {
		return Static319.method4866(arg0);
	}
}
