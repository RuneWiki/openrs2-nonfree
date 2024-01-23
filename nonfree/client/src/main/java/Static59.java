import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([I[IIII)V")
	public static void method1129(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(6) int local6 = arg2;
		@Pc(13) int local13 = (arg2 + arg3) / 2;
		@Pc(17) int local17 = arg1[local13];
		arg1[local13] = arg1[arg3];
		arg1[arg3] = local17;
		@Pc(31) int local31 = arg0[local13];
		arg0[local13] = arg0[arg3];
		arg0[arg3] = local31;
		for (@Pc(43) int local43 = arg2; local43 < arg3; local43++) {
			if (arg1[local43] > (local43 & 0x1) + local17) {
				@Pc(63) int local63 = arg1[local43];
				arg1[local43] = arg1[local6];
				arg1[local6] = local63;
				@Pc(77) int local77 = arg0[local43];
				arg0[local43] = arg0[local6];
				arg0[local6++] = local77;
			}
		}
		arg1[arg3] = arg1[local6];
		arg1[local6] = local17;
		arg0[arg3] = arg0[local6];
		arg0[local6] = local31;
		method1129(arg0, arg1, arg2, local6 - 1);
		method1129(arg0, arg1, local6 + 1, arg3);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZC)Z")
	public static boolean method1131(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(31) char[] local31 = Static190.aCharArray6;
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				@Pc(45) char local45 = local31[local33];
				if (local45 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)I")
	public static int method1132(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Lclient!rj;")
	public static Class2_Sub3_Sub1 method1133() {
		@Pc(13) int local13 = Static30.anIntArray46[0] * Static19.anIntArray30[0];
		@Pc(17) byte[] local17 = Static273.aByteArrayArray115[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static187.anIntArray314[local17[local22] & 0xFF];
		}
		@Pc(63) Class2_Sub3_Sub1 local63;
		if (Static60.aBoolean106) {
			local63 = new Class2_Sub3_Sub1_Sub2(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[0], Static40.anIntArray59[0], Static30.anIntArray46[0], Static19.anIntArray30[0], local20);
		} else {
			local63 = new Class2_Sub3_Sub1_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[0], Static40.anIntArray59[0], Static30.anIntArray46[0], Static19.anIntArray30[0], local20);
		}
		Static171.method2953();
		return local63;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
	public static void method1134() {
		if (Static236.anInt4804 == 10 && Static60.aBoolean106) {
			Static21.method453(28);
		}
		if (Static236.anInt4804 == 30) {
			Static21.method453(25);
		}
	}
}
