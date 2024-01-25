import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "Lclient!pc;")
	public static Class188 aClass188_90;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "[Lclient!vv;")
	public static final Class260[] aClass260Array1 = new Class260[2048];

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "[I")
	public static final int[] anIntArray382 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[BLclient!bo;IIIIZ)Lclient!gk;")
	public static Class65_Sub3_Sub1 method4700(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class26_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		if (arg1.aBoolean78 || Static74.method1330(arg2) && Static74.method1330(arg3)) {
			return new Class65_Sub3_Sub1(arg1, 3553, 6406, arg2, arg3, false, arg0, 6406);
		} else if (arg1.aBoolean72) {
			return new Class65_Sub3_Sub1(arg1, 34037, 6406, arg2, arg3, false, arg0, 6406);
		} else {
			return new Class65_Sub3_Sub1(arg1, 6406, arg2, arg3, Static316.method4530(arg2), Static316.method4530(arg3), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	public static void method4702() {
		for (@Pc(10) Class38_Sub7 local10 = (Class38_Sub7) Static334.aClass184_5.method4208(); local10 != null; local10 = (Class38_Sub7) Static334.aClass184_5.method4208()) {
			Static128.method1859(local10);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (Static399.aClass167_Sub1_1.method4528(Static281.anInt5126)) {
			local30 = 3;
			local31 = 0;
		} else {
			local30 = Static179.anInt6503;
			local31 = Static179.anInt6503;
		}
		Static56.method1111();
		for (@Pc(43) int local43 = local31; local43 <= local30; local43++) {
			Static56.method1117();
			Static56.method1123(local43);
			Static56.method1125(local43);
		}
		Static56.method1113();
		Static56.method1128();
	}
}
