import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
	public static int anInt2480 = 503;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)Z")
	public static boolean method2222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(21) Class23 local21 = Static476.aClass69_5.method2181(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local21.method586(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!dp;Lclient!om;ZLclient!om;Lclient!om;)Z")
	public static boolean method2223(@OriginalArg(0) Class3_Sub6_Sub3 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(3) Class246 arg2, @OriginalArg(4) Class246 arg3) {
		Static142.aClass3_Sub6_Sub3_1 = arg0;
		Static305.aClass246_146 = arg2;
		Static203.aClass246_102 = arg1;
		Static143.aClass246_244 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public static String method2224() {
		return Static255.aBoolean352 || Static99.aClass3_Sub44_2 == null ? "" : Static99.aClass3_Sub44_2.aString105;
	}
}
