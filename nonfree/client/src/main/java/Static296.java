import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!sm", name = "Kb", descriptor = "Lclient!ij;")
	public static Class93 aClass93_114;

	@OriginalMember(owner = "client!sm", name = "Vb", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_138 = new Class103();

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)I")
	public static int method5126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ij;Lclient!fl;ILclient!ij;Lclient!ij;)Z")
	public static boolean method5127(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class5_Sub16_Sub1 arg1, @OriginalArg(3) Class93 arg2, @OriginalArg(4) Class93 arg3) {
		Static109.aClass93_44 = arg2;
		Static26.aClass93_10 = arg3;
		Static346.aClass93_129 = arg0;
		Static188.aClass5_Sub16_Sub1_3 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "(B)V")
	public static void method5128() {
		for (@Pc(14) Class5_Sub1_Sub20 local14 = (Class5_Sub1_Sub20) Static85.aClass103_38.method2756(); local14 != null; local14 = (Class5_Sub1_Sub20) Static85.aClass103_38.method2748()) {
			@Pc(19) Class4_Sub5_Sub1 local19 = local14.aClass4_Sub5_Sub1_1;
			if (Static239.anInt4811 != local19.aByte75 || local19.aBoolean221) {
				local14.method6005();
				local19.method2662();
			} else if (Static283.anInt5563 >= local19.anInt2876) {
				local19.method2665(Static26.anInt519);
				if (local19.aBoolean221) {
					local14.method6005();
				} else {
					Static78.method1418(local19, true);
				}
			}
		}
	}
}
