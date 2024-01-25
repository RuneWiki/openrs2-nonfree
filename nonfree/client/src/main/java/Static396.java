import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
	public static int anInt6600 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
	public static void method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub3_3 != null) {
			local7.aClass1_Sub3_3 = null;
		}
		if (local7.aClass1_Sub3_2 != null) {
			local7.aClass1_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)Z")
	public static boolean method5462(@OriginalArg(1) int arg0) {
		if (arg0 == 51 || arg0 == 12 || arg0 == 18 || arg0 == 13 || arg0 == 1012) {
			return true;
		} else {
			return arg0 == 25 || arg0 == 1007;
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(III)V")
	public static void method5463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub1_1 != null) {
			local7.aClass1_Sub1_1 = null;
		}
		if (local7.aClass1_Sub1_2 != null) {
			local7.aClass1_Sub1_2 = null;
		}
	}
}
