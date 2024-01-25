import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!no", name = "m", descriptor = "[Lclient!nb;")
	public static final Interface16[] anInterface16Array2 = new Interface16[75];

	@OriginalMember(owner = "client!no", name = "o", descriptor = "I")
	public static int anInt6004 = 1;

	@OriginalMember(owner = "client!no", name = "C", descriptor = "I")
	public static int anInt6017 = 0;

	@OriginalMember(owner = "client!no", name = "D", descriptor = "Z")
	public static boolean aBoolean395 = false;

	@OriginalMember(owner = "client!no", name = "K", descriptor = "[I")
	public static final int[] anIntArray527 = new int[32];

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZILjava/lang/String;B)I")
	public static int method5131(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(39) int local39 = arg1.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(47) char local47 = arg1.charAt(local41);
			if (local41 == 0) {
				if (local47 == '-') {
					local24 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(95) int local95;
			if (local47 >= '0' && local47 <= '9') {
				local95 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local95 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local95 = local47 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local95 >= arg0) {
				throw new NumberFormatException();
			}
			if (local24) {
				local95 = -local95;
			}
			@Pc(120) int local120 = arg0 * local28 + local95;
			if (local120 / arg0 != local28) {
				throw new NumberFormatException();
			}
			local28 = local120;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	public static void method5133() {
		if (Static355.aBoolean428) {
			return;
		}
		Static355.aBoolean428 = true;
		if (Static480.aClass6_Sub37_Sub1_1.aBoolean412) {
			Static399.aFloat167 = (int) Static399.aFloat167 - 65 & 0xFFFFFF80;
		} else {
			Static274.aFloat47 += (-24.0F - Static274.aFloat47) / 2.0F;
		}
		Static244.aBoolean263 = true;
	}
}
