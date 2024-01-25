import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!pu", name = "J", descriptor = "[F")
	public static final float[] aFloatArray43 = new float[4];

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBI)Z")
	public static boolean method5678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static482.method6524(arg0, arg1) & Static483.method6535(arg0, arg1);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZIIII)V")
	public static void method5700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static176.method2504(arg0, Static451.anInt7775, Static514.anInt8722);
		@Pc(17) int local17 = Static176.method2504(arg2, Static451.anInt7775, Static514.anInt8722);
		@Pc(23) int local23 = Static176.method2504(arg3, Static162.anInt2935, Static270.anInt4759);
		@Pc(29) int local29 = Static176.method2504(arg5, Static162.anInt2935, Static270.anInt4759);
		@Pc(37) int local37 = Static176.method2504(arg0 + arg1, Static451.anInt7775, Static514.anInt8722);
		@Pc(46) int local46 = Static176.method2504(arg2 - arg1, Static451.anInt7775, Static514.anInt8722);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static433.method6039(arg4, local29, Static171.anIntArrayArray79[local48], local23);
		}
		for (@Pc(69) int local69 = local17; local69 > local46; local69--) {
			Static433.method6039(arg4, local29, Static171.anIntArrayArray79[local69], local23);
		}
		@Pc(91) int local91 = Static176.method2504(arg3 + arg1, Static162.anInt2935, Static270.anInt4759);
		@Pc(99) int local99 = Static176.method2504(arg5 - arg1, Static162.anInt2935, Static270.anInt4759);
		for (@Pc(101) int local101 = local37; local101 <= local46; local101++) {
			@Pc(107) int[] local107 = Static171.anIntArrayArray79[local101];
			Static433.method6039(arg4, local91, local107, local23);
			Static433.method6039(arg4, local29, local107, local99);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLclient!fr;Lclient!fr;)V")
	public static void method5702(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0.aClass1_Sub6_62 != null) {
			arg0.method7811();
		}
		arg0.aClass1_Sub6_62 = arg1;
		arg0.aClass1_Sub6_61 = arg1.aClass1_Sub6_61;
		arg0.aClass1_Sub6_62.aClass1_Sub6_61 = arg0;
		arg0.aClass1_Sub6_61.aClass1_Sub6_62 = arg0;
	}
}
