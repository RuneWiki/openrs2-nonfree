import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(21) String local21 = arg2[arg1];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg1 + arg0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg1; local36 < local32; local36++) {
				@Pc(42) String local42 = arg2[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(61) StringBuffer local61 = new StringBuffer(local34);
			for (@Pc(69) int local69 = arg1; local69 < local32; local69++) {
				@Pc(75) String local75 = arg2[local69];
				if (local75 == null) {
					local61.append("null");
				} else {
					local61.append(local75);
				}
			}
			return local61.toString();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!re;)V")
	public static void method1810(@OriginalArg(1) Class1_Sub33 arg0) {
		if (arg0.aByteArray86.length - arg0.lb < 1) {
			return;
		}
		@Pc(18) int local18 = arg0.method5174();
		if (local18 < 0 || local18 > 1 || arg0.aByteArray86.length - arg0.lb < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.method5177();
		if (local43 * 6 != arg0.aByteArray86.length - arg0.lb) {
			return;
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(62) int local62;
			do {
				do {
					do {
						if (arg0.lb >= arg0.aByteArray86.length) {
							return;
						}
						local58 = arg0.method5177();
						local62 = arg0.method5150();
					} while (Static158.anIntArray322.length <= local58);
				} while (!Static105.aBooleanArray10[local58]);
			} while (Static351.aClass101_1.method2167(local58).aChar1 == '1' && (local62 < -1 || local62 > 1));
			Static158.anIntArray322[local58] = local62;
		}
	}
}
