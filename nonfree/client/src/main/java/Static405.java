import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
	public static final int[] anIntArray466 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method4102(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static206.anInt3640 >= 100) {
			Static90.method1616(Static151.aClass55_62.method1205(Static5.anInt20));
			return;
		}
		@Pc(22) String local22 = Static345.method4461(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(70) String local70;
		for (@Pc(32) int local32 = 0; local32 < Static206.anInt3640; local32++) {
			@Pc(40) String local40 = Static345.method4461(Static84.aStringArray37[local32]);
			if (local40 != null && local40.equals(local22)) {
				Static90.method1616(arg0 + Static417.aClass55_134.method1205(Static5.anInt20));
				return;
			}
			if (Static332.aStringArray46[local32] != null) {
				local70 = Static345.method4461(Static332.aStringArray46[local32]);
				if (local70 != null && local70.equals(local22)) {
					Static90.method1616(arg0 + Static417.aClass55_134.method1205(Static5.anInt20));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static184.anInt3296; local100++) {
			local70 = Static345.method4461(Static193.aStringArray30[local100]);
			if (local70 != null && local70.equals(local22)) {
				Static90.method1616(Static70.aClass55_34.method1205(Static5.anInt20) + arg0 + Static5.aClass55_3.method1205(Static5.anInt20));
				return;
			}
			if (Static448.aStringArray53[local100] != null) {
				@Pc(143) String local143 = Static345.method4461(Static448.aStringArray53[local100]);
				if (local143 != null && local143.equals(local22)) {
					Static90.method1616(Static70.aClass55_34.method1205(Static5.anInt20) + arg0 + Static5.aClass55_3.method1205(Static5.anInt20));
					return;
				}
			}
		}
		if (Static345.method4461(Static104.aClass26_Sub2_Sub4_Sub2_2.aString69).equals(local22)) {
			Static90.method1616(Static23.aClass55_8.method1205(Static5.anInt20));
		} else {
			Static81.method1414(Static172.aClass2_54);
			Static255.aClass7_Sub14_Sub1_2.method3970(Static268.method3593(arg0) + 1);
			Static255.aClass7_Sub14_Sub1_2.method3947(arg0);
			Static255.aClass7_Sub14_Sub1_2.method3970(arg1 ? 1 : 0);
		}
	}
}
