import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "[[Lclient!vg;")
	public static Class250[][] aClass250ArrayArray1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_11 = new Class214(32, 5);

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "[Lclient!lo;")
	public static final Class1_Sub3_Sub11[] aClass1_Sub3_Sub11Array10 = new Class1_Sub3_Sub11[14];

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_19 = new Class137(79, -1);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "()V")
	public static void method181() {
		Static109.method1525(Static97.anInt1709);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ic;ILclient!ic;)V")
	public static void method182(@OriginalArg(0) Class113 arg0, @OriginalArg(2) Class113 arg1) {
		Static80.aClass113_28 = arg1;
		Static349.aClass113_107 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIB)V")
	public static void method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = Static63.method971(Static74.anInt1413, arg0, Static149.anInt7384);
		@Pc(17) int local17 = Static63.method971(Static74.anInt1413, arg2, Static149.anInt7384);
		@Pc(23) int local23 = Static63.method971(Static271.anInt4271, arg3, Static13.anInt263);
		@Pc(29) int local29 = Static63.method971(Static271.anInt4271, arg1, Static13.anInt263);
		@Pc(37) int local37 = Static63.method971(Static74.anInt1413, arg5 + arg0, Static149.anInt7384);
		@Pc(46) int local46 = Static63.method971(Static74.anInt1413, arg2 - arg5, Static149.anInt7384);
		for (@Pc(53) int local53 = local11; local53 < local37; local53++) {
			Static298.method3891(local29, local23, Static106.anIntArrayArray46[local53], arg4);
		}
		for (@Pc(73) int local73 = local17; local73 > local46; local73--) {
			Static298.method3891(local29, local23, Static106.anIntArrayArray46[local73], arg4);
		}
		@Pc(95) int local95 = Static63.method971(Static271.anInt4271, arg5 + arg3, Static13.anInt263);
		@Pc(103) int local103 = Static63.method971(Static271.anInt4271, arg1 - arg5, Static13.anInt263);
		for (@Pc(105) int local105 = local37; local105 <= local46; local105++) {
			@Pc(111) int[] local111 = Static106.anIntArrayArray46[local105];
			Static298.method3891(local95, local23, local111, arg4);
			Static298.method3891(local29, local103, local111, arg4);
		}
	}
}
