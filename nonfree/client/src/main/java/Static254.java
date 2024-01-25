import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
	public static int anInt4897 = -1;

	@OriginalMember(owner = "client!iia", name = "f", descriptor = "[I")
	public static final int[] anIntArray248 = new int[14];

	@OriginalMember(owner = "client!iia", name = "k", descriptor = "[I")
	public static final int[] anIntArray249 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!iia", name = "l", descriptor = "I")
	public static final int anInt4900 = 1339;

	@OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
	public static int anInt4901 = 0;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V")
	public static void method4439() {
		@Pc(7) int local7 = Static383.anInt7249;
		@Pc(9) int[] local9 = Static404.anIntArray362;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class15_Sub3_Sub3_Sub1_Sub1 local24 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local9[local16]];
			if (local24 != null) {
				Static216.method4032(local24, local24.method3690());
			}
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Ljava/lang/String;ZII)Z")
	public static boolean method4440(@OriginalArg(0) String arg0) {
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local29 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(69) int local69;
			if (local44 >= '0' && local44 <= '9') {
				local69 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local69 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local69 = local44 - 'W';
			} else {
				return false;
			}
			if (local69 >= 10) {
				return false;
			}
			if (local29) {
				local69 = -local69;
			}
			@Pc(110) int local110 = local33 * 10 + local69;
			if (local33 != local110 / 10) {
				return false;
			}
			local33 = local110;
			local31 = true;
		}
		return local31;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZI)V")
	public static void method4443(@OriginalArg(1) int arg0) {
		if (Static39.method9317(arg0)) {
			Static438.method7129(Static111.aClass357ArrayArray1[arg0], -1);
		}
	}
}
