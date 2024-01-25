import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!uha", name = "H", descriptor = "[Lclient!nfa;")
	public static Class15_Sub3[] aClass15_Sub3Array5;

	@OriginalMember(owner = "client!uha", name = "C", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_63 = new Class22(4);

	@OriginalMember(owner = "client!uha", name = "G", descriptor = "Lclient!ss;")
	public static final Class340 aClass340_12 = new Class340("", 14);

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(III)V")
	public static void method9044(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(14, (long) arg1);
		local9.method2486();
		local9.anInt2680 = arg0;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ILclient!km;)Lclient!bc;")
	public static Class27 method9045(@OriginalArg(1) Class15_Sub3_Sub3 arg0) {
		@Pc(14) Class27 local14;
		if (Static360.aClass27_2 == null) {
			local14 = new Class27();
		} else {
			local14 = Static360.aClass27_2;
			Static360.aClass27_2 = Static360.aClass27_2.aClass27_1;
			Static448.anInt8139--;
			local14.aClass27_1 = null;
		}
		local14.aClass15_Sub3_Sub3_1 = arg0;
		return local14;
	}
}
