import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4016(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static259.method3902(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static46.anInt861; local31++) {
			@Pc(37) String local37 = Static284.aStringArray35[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static259.method3902(local37);
			if (local37 != null && local37.equals(local20)) {
				Static46.anInt861--;
				for (@Pc(61) int local61 = local31; local61 < Static46.anInt861; local61++) {
					Static284.aStringArray35[local61] = Static284.aStringArray35[local61 + 1];
					Static297.aStringArray36[local61] = Static297.aStringArray36[local61 + 1];
					Static376.anIntArray544[local61] = Static376.anIntArray544[local61 + 1];
					Static200.aStringArray37[local61] = Static200.aStringArray37[local61 + 1];
					Static362.anIntArray526[local61] = Static362.anIntArray526[local61 + 1];
					Static275.aBooleanArray20[local61] = Static275.aBooleanArray20[local61 + 1];
				}
				Static118.anInt2673 = Static37.anInt715;
				Static159.method2586(Static228.aClass54_63);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static287.method4138(arg0));
				Static424.aClass2_Sub23_Sub2_1.method5496(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!gg;)V")
	public static void method4019(@OriginalArg(0) Class3_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort85; local2 <= arg0.aShort87; local2++) {
			for (@Pc(6) int local6 = arg0.aShort86; local6 <= arg0.aShort88; local6++) {
				@Pc(16) Class106 local16 = Static440.aClass106ArrayArrayArray3[arg0.aByte89][local2][local6];
				if (local16 != null) {
					@Pc(21) Class4 local21 = local16.aClass4_3;
					@Pc(23) Class4 local23 = null;
					while (local21 != null) {
						if (local21.aClass3_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass4_3 = local21.aClass4_1;
							} else {
								local23.aClass4_1 = local21.aClass4_1;
							}
							local21.method140();
							break;
						}
						local23 = local21;
						local21 = local21.aClass4_1;
					}
					local16.aByte42 = 0;
					for (@Pc(56) Class4 local56 = local16.aClass4_3; local56 != null; local56 = local56.aClass4_1) {
						local16.aByte42 = (byte) (local16.aByte42 | local56.anInt123);
					}
				}
			}
		}
	}
}
