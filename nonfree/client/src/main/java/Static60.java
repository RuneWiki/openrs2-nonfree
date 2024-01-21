import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "J")
	public static long aLong67;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
	public static int anInt1454 = 0;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
	public static int anInt1457 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ab;II)Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5 method994(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		return Static163.method2693(arg0, arg1) ? Static10.method192() : null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ab;ZZLclient!ab;Lclient!r;)V")
	public static void method995(@OriginalArg(0) Class3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) Class1_Sub3_Sub1_Sub3_Sub1 arg3) {
		Static108.aClass3_20 = arg0;
		Static73.aClass3_12 = arg2;
		Static202.aBoolean240 = arg1;
		@Pc(19) int local19 = Static73.aClass3_12.method3266() - 1;
		Static153.anInt3182 = local19 * 256 + Static73.aClass3_12.method3270(local19);
		Static22.aClass1_Sub3_Sub1_Sub3_Sub1_1 = arg3;
	}
}
