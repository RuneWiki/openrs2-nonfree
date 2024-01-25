import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Lclient!or;")
	public static Class244 aClass244_1;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7109(@OriginalArg(1) String arg0) {
		if (Static272.aStringArray17 == null) {
			Static438.method6240();
		}
		@Pc(14) String[] local14 = Static115.method2011('\n', arg0);
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			for (@Pc(25) int local25 = Static351.anInt9535; local25 > 0; local25--) {
				Static272.aStringArray17[local25] = Static272.aStringArray17[local25 - 1];
			}
			Static272.aStringArray17[0] = local14[local21];
			if (Static272.aStringArray17.length - 1 > Static351.anInt9535) {
				Static351.anInt9535++;
				if (Static259.anInt5052 > 0) {
					Static259.anInt5052++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z")
	public static boolean method7110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static185.method3397(arg0, arg1) | (arg1 & 0x40000) != 0 || Static515.method7130(arg0, arg1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(CI)C")
	public static char method7111(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIILclient!uo;Lclient!uo;)V")
	public static void method7113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub2 arg3, @OriginalArg(4) Class4_Sub2 arg4) {
		@Pc(4) Class276 local4 = Static417.method5977(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass4_Sub2_3 = arg3;
			local4.aClass4_Sub2_2 = arg4;
		}
	}
}
