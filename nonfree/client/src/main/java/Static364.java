import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
	public static int anInt3532;

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
	public static int anInt3533;

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "S")
	public static short aShort51 = 32767;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public static void method2859() {
		if (Static38.anInt681 <= 0) {
			Static335.aString64 = "";
			return;
		}
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static54.aStringArray8.length; local16++) {
			if (Static54.aStringArray8[local16].startsWith("--> ")) {
				local14++;
				if (local14 == Static38.anInt681) {
					Static335.aString64 = Static54.aStringArray8[local16].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
	public static void method2861() {
		if (Static117.aString29.toLowerCase().indexOf("microsoft") != -1) {
			Static133.anIntArray159[188] = 71;
			Static133.anIntArray159[221] = 43;
			Static133.anIntArray159[219] = 42;
			Static133.anIntArray159[220] = 74;
			Static133.anIntArray159[222] = 59;
			Static133.anIntArray159[186] = 57;
			Static133.anIntArray159[192] = 58;
			Static133.anIntArray159[189] = 26;
			Static133.anIntArray159[223] = 28;
			Static133.anIntArray159[190] = 72;
			Static133.anIntArray159[187] = 27;
			Static133.anIntArray159[191] = 73;
			return;
		}
		Static133.anIntArray159[61] = 27;
		Static133.anIntArray159[91] = 42;
		if (Static117.aMethod1 == null) {
			Static133.anIntArray159[192] = 58;
			Static133.anIntArray159[222] = 59;
		} else {
			Static133.anIntArray159[520] = 59;
			Static133.anIntArray159[192] = 28;
			Static133.anIntArray159[222] = 58;
		}
		Static133.anIntArray159[44] = 71;
		Static133.anIntArray159[92] = 74;
		Static133.anIntArray159[47] = 73;
		Static133.anIntArray159[93] = 43;
		Static133.anIntArray159[59] = 57;
		Static133.anIntArray159[46] = 72;
		Static133.anIntArray159[45] = 26;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!ns;")
	public static Class25_Sub5 method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class27 local14 = local7.aClass27_3; local14 != null; local14 = local14.aClass27_1) {
			@Pc(18) Class25_Sub5 local18 = local14.aClass25_Sub5_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort97 == arg1 && local18.aShort94 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	public static void method2863() {
		@Pc(7) Class98 local7 = null;
		try {
			@Pc(18) Class232 local18 = Static183.aClass83_2.method1877("2", true);
			while (local18.anInt6402 == 0) {
				Static223.method4582(1L);
			}
			if (local18.anInt6402 == 1) {
				local7 = (Class98) local18.anObject8;
				@Pc(43) Class1_Sub28 local43 = new Class1_Sub28(Static391.anInt6530 * 6 + 3);
				local43.method5398(1);
				local43.method5393(Static391.anInt6530);
				for (@Pc(53) int local53 = 0; local53 < Static352.anIntArray414.length; local53++) {
					if (Static148.aBooleanArray9[local53]) {
						local43.method5393(local53);
						local43.method5347(Static352.anIntArray414[local53]);
					}
				}
				local7.method2221(0, local43.anInt6812, local43.aByteArray86);
			}
		} catch (@Pc(84) Exception local84) {
		}
		try {
			if (local7 != null) {
				local7.method2224();
			}
		} catch (@Pc(91) Exception local91) {
		}
		Static216.aLong125 = Static27.method359();
		Static433.aBoolean797 = false;
	}
}
