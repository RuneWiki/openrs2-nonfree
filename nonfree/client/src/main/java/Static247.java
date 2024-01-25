import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "Lclient!nha;")
	public static final Class229 aClass229_5 = new Class229("", 17);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Lclient!on;")
	public static final Class185 aClass185_1 = Static289.method4999();

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I[Lclient!ac;)V")
	public static void method4661(@OriginalArg(1) Class5[] arg0) {
		Static205.anInt4770 = arg0.length;
		Static603.aClass5Array20 = new Class5[Static205.anInt4770 + 10];
		Static610.anIntArray611 = new int[Static205.anInt4770 + 10];
		Static655.method6407(arg0, 0, Static603.aClass5Array20, 0, Static205.anInt4770);
		for (@Pc(30) int local30 = 0; local30 < Static205.anInt4770; local30++) {
			Static610.anIntArray611[local30] = Static603.aClass5Array20[local30].method7585();
		}
		for (@Pc(49) int local49 = Static205.anInt4770; local49 < Static603.aClass5Array20.length; local49++) {
			Static610.anIntArray611[local49] = 12;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIZI)V")
	public static void method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 - arg4 >= Static472.anInt6105 && arg4 + arg2 <= Static202.anInt4720 && arg5 - arg4 >= Static246.anInt5506 && arg4 + arg5 <= Static583.anInt9761) {
			Static227.method4354(arg1, arg4, arg0, arg2, arg3, arg5);
		} else {
			Static348.method2697(arg3, arg0, arg4, arg1, arg5, arg2);
		}
	}
}
