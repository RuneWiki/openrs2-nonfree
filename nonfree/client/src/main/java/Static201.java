import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "Lclient!am;")
	public static Class9 aClass9_2;

	@OriginalMember(owner = "client!lq", name = "y", descriptor = "Lclient!nl;")
	public static Class171 aClass171_52;

	@OriginalMember(owner = "client!lq", name = "x", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_62 = new Class11(28, 6);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I[[BLclient!pg;)V")
	public static void method3375(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class56_Sub1 arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.anInt4586; local12++) {
			Static271.method4164();
			for (@Pc(18) int local18 = 0; local18 < Static246.anInt4374 >> 3; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static185.anInt3485 >> 3; local22++) {
					@Pc(32) int local32 = Static309.anIntArrayArrayArray13[local12][local18][local22];
					if (local32 != -1) {
						@Pc(42) int local42 = local32 >> 24 & 0x3;
						if (!arg1.aBoolean341 || local42 == 0) {
							@Pc(53) int local53 = local32 >> 1 & 0x3;
							@Pc(59) int local59 = local32 >> 14 & 0x3FF;
							@Pc(65) int local65 = local32 >> 3 & 0x7FF;
							@Pc(75) int local75 = (local59 / 8 << 8) + local65 / 8;
							for (@Pc(77) int local77 = 0; local77 < Static68.anIntArray284.length; local77++) {
								if (Static68.anIntArray284[local77] == local75 && arg0[local77] != null) {
									arg1.method4080(Static111.aClass63_3, local42, (local59 & 0x7) * 8, local53, Static58.aClass188Array1, local18 * 8, (local65 & 0x7) * 8, arg0[local77], local22 * 8, local12);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
	public static void method3376() {
		Static103.method2172();
		Static88.aClass21_1 = null;
		Static252.aClass119ArrayArray1 = null;
		Static315.aClass21_4 = null;
		Static215.aClass21_3 = null;
		Static140.aClass63_4 = null;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3377(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(22) String local22 = Static136.method2646(arg0);
		if (local22 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static121.anInt2600; local32++) {
			@Pc(38) String local38 = Static174.aStringArray82[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static136.method2646(local38);
			if (local38 != null && local38.equals(local22)) {
				Static121.anInt2600--;
				for (@Pc(64) int local64 = local32; local64 < Static121.anInt2600; local64++) {
					Static174.aStringArray82[local64] = Static174.aStringArray82[local64 + 1];
					Static21.aStringArray13[local64] = Static21.aStringArray13[local64 + 1];
					Static249.anIntArray1341[local64] = Static249.anIntArray1341[local64 + 1];
					Static250.aStringArray113[local64] = Static250.aStringArray113[local64 + 1];
					Static286.anIntArray981[local64] = Static286.anIntArray981[local64 + 1];
					Static189.aBooleanArray38[local64] = Static189.aBooleanArray38[local64 + 1];
				}
				Static257.anInt4520 = Static102.anInt2133;
				Static216.method3597(Static321.aClass11_81);
				Static372.aClass2_Sub16_Sub2_4.method5358(Static204.method3471(arg0));
				Static372.aClass2_Sub16_Sub2_4.method5362(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ae;II)Ljava/lang/String;")
	public static String method3378(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		if (!Static45.method784(arg0).method634(arg1) && arg0.anObjectArray27 == null) {
			return null;
		} else if (arg0.aStringArray6 == null || arg0.aStringArray6.length <= arg1 || arg0.aStringArray6[arg1] == null || arg0.aStringArray6[arg1].trim().length() == 0) {
			return Static226.aBoolean445 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray6[arg1];
		}
	}
}
