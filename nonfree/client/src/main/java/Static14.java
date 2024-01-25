import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
	public static int anInt7435;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_51 = new Class330(200);

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "[I")
	public static final int[] anIntArray508 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "Lclient!dd;")
	public static final Class68 aClass68_6 = new Class68("stellardawn", 1);

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
	public static final int anInt7434 = 1339;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILclient!lt;I)V")
	public static void method5933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class192 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class6_Sub34 local14 = (Class6_Sub34) Static315.aClass298_124.method6809(); local14 != null; local14 = (Class6_Sub34) Static315.aClass298_124.method6821()) {
			if (arg3 == local14.anInt6887 && arg0 << 9 == local14.anInt6879 && local14.anInt6886 == arg1 << 9 && local14.aClass192_1.anInt5600 == arg2.anInt5600) {
				if (local14.aClass6_Sub15_Sub2_3 != null) {
					Static204.aClass6_Sub15_Sub1_1.method2421(local14.aClass6_Sub15_Sub2_3);
					local14.aClass6_Sub15_Sub2_3 = null;
				}
				if (local14.aClass6_Sub15_Sub2_4 != null) {
					Static204.aClass6_Sub15_Sub1_1.method2421(local14.aClass6_Sub15_Sub2_4);
					local14.aClass6_Sub15_Sub2_4 = null;
				}
				local14.method7948();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I")
	public static int method5936(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(42) int local42 = local28 | local28 >>> 16;
		return local42 + 1;
	}
}
