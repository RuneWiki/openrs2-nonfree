import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public static int anInt1420;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	public static int anInt1423 = 0;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	public static int anInt1424 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILclient!lj;)V")
	public static void method1245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9_Sub2_Sub2 arg4) {
		@Pc(4) Class351 local4 = Static175.method2895(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10152 = (arg1 << Static485.anInt8241) + Static493.anInt8365;
		arg4.anInt10154 = arg3;
		arg4.anInt10158 = (arg2 << Static485.anInt8241) + Static493.anInt8365;
		local4.aClass9_Sub2_Sub2_1 = arg4;
		@Pc(33) int local33 = Static637.aClass91Array4 == Static485.aClass91Array1 ? 1 : 0;
		if (arg4.method8597()) {
			if (arg4.method8607()) {
				arg4.aClass9_Sub2_23 = Static250.aClass9_Sub2Array5[local33];
				Static250.aClass9_Sub2Array5[local33] = arg4;
				return;
			}
			arg4.aClass9_Sub2_23 = Static463.aClass9_Sub2Array6[local33];
			Static463.aClass9_Sub2Array6[local33] = arg4;
			Static334.aBoolean462 = true;
			return;
		}
		arg4.aClass9_Sub2_23 = Static164.aClass9_Sub2Array1[local33];
		Static164.aClass9_Sub2Array1[local33] = arg4;
	}
}
