import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	public static int anInt9012;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7410(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static142.method2303(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static234.anInt4709; local30++) {
			@Pc(36) String local36 = Static528.aStringArray43[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static142.method2303(local36);
			if (local36 != null && local36.equals(local25)) {
				Static234.anInt4709--;
				for (@Pc(60) int local60 = local30; local60 < Static234.anInt4709; local60++) {
					Static528.aStringArray43[local60] = Static528.aStringArray43[local60 + 1];
					Static373.aStringArray7[local60] = Static373.aStringArray7[local60 + 1];
					Static122.anIntArray240[local60] = Static122.anIntArray240[local60 + 1];
					Static384.aStringArray37[local60] = Static384.aStringArray37[local60 + 1];
					Static217.anIntArray787[local60] = Static217.anIntArray787[local60 + 1];
					Static326.aBooleanArray41[local60] = Static326.aBooleanArray41[local60 + 1];
				}
				Static223.anInt4462 = Static164.anInt2967;
				Static144.method2331(Static385.aClass296_298);
				Static455.aClass1_Sub6_Sub2_2.method3937(Static282.method6464(arg0));
				Static455.aClass1_Sub6_Sub2_2.method3917(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
	public static boolean method7411(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIII)I")
	public static int method7412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return 7 - arg1;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(CI)Z")
	public static boolean method7413(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
