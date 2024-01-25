import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
	public static int anInt2837;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)V")
	public static void method2369() {
		Static365.aClass136_42.method3132(50);
		Static552.aClass136_63.method3132(50);
		Static238.aClass136_65.method3132(50);
		Static84.aClass136_61.method3132(50);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!ht;")
	public static Class9_Sub2_Sub1 method2371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class105 local14 = local7.aClass105_3; local14 != null; local14 = local14.aClass105_1) {
			@Pc(18) Class9_Sub2_Sub1 local18 = local14.aClass9_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort126 == arg1 && local18.aShort124 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
