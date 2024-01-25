import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "Lclient!dda;")
	public static Class53 aClass53_15;

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString22 = "";

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V")
	public static void method827() {
		Static4.aClass127_2.method3204();
		Static163.aClass185_8.method4624();
		Static178.aClass185_9.method4624();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)V")
	public static void method828(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 6);
		local8.method6974();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qa;Lclient!ob;BIIILclient!bj;Lclient!maa;)V")
	public static void method830(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class2_Sub35 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25 arg5, @OriginalArg(7) Class182 arg6) {
		@Pc(15) int local15 = arg1.anInt6265 - arg4 / 2 - 5;
		@Pc(19) int local19 = arg3 + 2;
		if (arg6.anInt5337 != 0) {
			arg0.method6052(local19, arg6.anInt5337, local15, arg3 + arg2 * arg5.method762() + 1 - local19, arg4 - -10);
		}
		if (arg6.anInt5329 != 0) {
			arg0.method6061(arg4 + 10, arg6.anInt5329, arg2 * arg5.method762() + arg3 + 1 - local19, local19, local15);
		}
		@Pc(72) int local72 = arg6.anInt5351;
		if (arg1.aBoolean471 && arg6.anInt5327 != -1) {
			local72 = arg6.anInt5327;
		}
		for (@Pc(84) int local84 = 0; local84 < arg2; local84++) {
			@Pc(90) String local90 = Static33.aStringArray4[local84];
			if (arg2 - 1 > local84) {
				local90 = local90.substring(0, local90.length() - 4);
			}
			arg5.method767(arg0, local90, arg1.anInt6265, arg3, local72);
			arg3 += arg5.method762();
		}
	}
}
