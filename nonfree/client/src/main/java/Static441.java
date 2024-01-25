import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
	public static int[] anIntArray571;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public static int anInt7510 = 0;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public static int anInt7511 = -1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method5894(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(11) int local11 = arg2.length();
		@Pc(14) int local14 = arg0.length();
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) char local20 = 0;
		@Pc(22) char local22 = 0;
		while (local11 > local16 - local20 || local14 > local18 - local22) {
			if (local16 - local20 >= local11) {
				return -1;
			}
			if (local14 <= local18 - local22) {
				return 1;
			}
			@Pc(64) char local64;
			if (local20 == '\u0000') {
				local64 = arg2.charAt(local16++);
			} else {
				local64 = local20;
			}
			@Pc(79) char local79;
			if (local22 == '\u0000') {
				local79 = arg0.charAt(local18++);
			} else {
				local79 = local22;
			}
			local20 = Static420.method5624(local64);
			local22 = Static420.method5624(local79);
			local64 = Static24.method688(arg1, local64);
			local79 = Static24.method688(arg1, local79);
			if (local79 != local64 && Character.toUpperCase(local64) != Character.toUpperCase(local79)) {
				local64 = Character.toLowerCase(local64);
				local79 = Character.toLowerCase(local79);
				if (local64 != local79) {
					return Static332.method4805(local64, arg1) - Static332.method4805(local79, arg1);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local11, local14);
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			if (arg1 == 2) {
				local18 = local14 - local140 - 1;
				local16 = local11 - local140 - 1;
			} else {
				local18 = local140;
				local16 = local140;
			}
			@Pc(169) char local169 = arg2.charAt(local16);
			@Pc(173) char local173 = arg0.charAt(local18);
			if (local173 != local169 && Character.toUpperCase(local169) != Character.toUpperCase(local173)) {
				local169 = Character.toLowerCase(local169);
				local173 = Character.toLowerCase(local173);
				if (local173 != local169) {
					return Static332.method4805(local169, arg1) - Static332.method4805(local173, arg1);
				}
			}
		}
		@Pc(218) int local218 = local11 - local14;
		if (local218 != 0) {
			return local218;
		}
		for (@Pc(227) int local227 = 0; local227 < local138; local227++) {
			@Pc(232) char local232 = arg2.charAt(local227);
			@Pc(236) char local236 = arg0.charAt(local227);
			if (local232 != local236) {
				return Static332.method4805(local232, arg1) - Static332.method4805(local236, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method5896() {
		if (Static161.aBoolean265) {
			return;
		}
		if (Static123.aClass21_Sub1_1.aBoolean72) {
			Static265.aFloat64 = (int) Static265.aFloat64 + 47 & 0xFFFFFFF0;
		} else {
			Static15.aFloat3 += (12.0F - Static15.aFloat3) / 2.0F;
		}
		Static161.aBoolean265 = true;
		Static189.aBoolean300 = true;
	}
}
