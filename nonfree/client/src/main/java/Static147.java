import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public static int anInt3005;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt3006;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILclient!uda;)V")
	public static void method2554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub2_Sub4 arg3) {
		@Pc(4) Class351 local4 = Static175.method2895(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub2_Sub4_1 = arg3;
		@Pc(16) int local16 = Static637.aClass91Array4 == Static485.aClass91Array1 ? 1 : 0;
		if (arg3.method8597()) {
			if (arg3.method8607()) {
				arg3.aClass9_Sub2_23 = Static250.aClass9_Sub2Array5[local16];
				Static250.aClass9_Sub2Array5[local16] = arg3;
				return;
			}
			arg3.aClass9_Sub2_23 = Static463.aClass9_Sub2Array6[local16];
			Static463.aClass9_Sub2Array6[local16] = arg3;
			Static334.aBoolean462 = true;
			return;
		}
		arg3.aClass9_Sub2_23 = Static164.aClass9_Sub2Array1[local16];
		Static164.aClass9_Sub2Array1[local16] = arg3;
	}
}
