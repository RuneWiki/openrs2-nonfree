import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!co", name = "k", descriptor = "I")
	public static int anInt923;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public static void method816() {
		@Pc(15) Class1_Sub22 local15 = (Class1_Sub22) Static378.aClass14_45.method203();
		@Pc(26) boolean local26 = Static364.aClass107_13 != null || Static302.anInt5060 > 0;
		if (local26) {
			Static264.anInt4588 = 1;
		}
		if (Static53.aBoolean106 && Static269.aClass53_1.method3910(81) && Static76.anInt1078 > 2) {
			if (local26) {
				Static150.aClass1_Sub10_6 = (Class1_Sub10) Static57.aClass14_3.aClass1_5.aClass1_268.aClass1_268;
			} else {
				Static331.method4349((Class1_Sub10) Static57.aClass14_3.aClass1_5.aClass1_268.aClass1_268, local15.method4161(), local15.method4162());
			}
		} else if (local26) {
			Static150.aClass1_Sub10_6 = (Class1_Sub10) Static57.aClass14_3.aClass1_5.aClass1_268;
		} else {
			Static331.method4349((Class1_Sub10) Static57.aClass14_3.aClass1_5.aClass1_268, local15.method4161(), local15.method4162());
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[Ljava/lang/String;[SBI)V")
	public static void method817(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg3) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) String local25 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local25;
		@Pc(39) short local39 = arg2[local19];
		arg2[local19] = arg2[arg3];
		arg2[arg3] = local39;
		for (@Pc(51) int local51 = arg0; local51 < arg3; local51++) {
			if (local25 == null || arg1[local51] != null && arg1[local51].compareTo(local25) < (local51 & 0x1)) {
				@Pc(72) String local72 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21] = local72;
				@Pc(86) short local86 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21++] = local86;
			}
		}
		arg1[arg3] = arg1[local21];
		arg1[local21] = local25;
		arg2[arg3] = arg2[local21];
		arg2[local21] = local39;
		method817(arg0, arg1, arg2, local21 - 1);
		method817(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)Z")
	public static boolean method818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static329.method4322(arg1, arg0) || Static70.method3912(arg1, arg0);
	}
}
