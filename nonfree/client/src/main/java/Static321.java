import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!dca;")
	public static Class76 aClass76_6;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lclient!eg;")
	public static Class4_Sub2_Sub3 method4454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub2_Sub3_1;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public static void method4455(@OriginalArg(0) int arg0) {
		if (arg0 != 3712) {
			method4457(91, true, -2, -15);
		}
		Static11.method200(255, -1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZII)I")
	public static int method4457(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub3 local12 = Static549.method7662(arg3 + 18040, arg1, arg0);
		if (local12 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < local12.anIntArray29.length; local27++) {
				if (local12.anIntArray28[local27] == arg2) {
					local25 += local12.anIntArray29[local27];
				}
			}
			if (arg3 != -18163) {
				method4455(84);
			}
			return local25;
		}
	}
}
