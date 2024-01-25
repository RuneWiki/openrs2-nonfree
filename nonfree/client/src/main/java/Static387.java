import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
	public static int anInt6972 = 0;

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
	public static int anInt6978 = -1;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "([Ljava/lang/String;[SIII)V")
	public static void method5829(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(16) int local16 = (arg2 + arg3) / 2;
		@Pc(18) int local18 = arg3;
		@Pc(22) String local22 = arg0[local16];
		arg0[local16] = arg0[arg2];
		arg0[arg2] = local22;
		@Pc(36) short local36 = arg1[local16];
		arg1[local16] = arg1[arg2];
		arg1[arg2] = local36;
		for (@Pc(48) int local48 = arg3; local48 < arg2; local48++) {
			if (local22 == null || arg0[local48] != null && arg0[local48].compareTo(local22) < (local48 & 0x1)) {
				@Pc(72) String local72 = arg0[local48];
				arg0[local48] = arg0[local18];
				arg0[local18] = local72;
				@Pc(86) short local86 = arg1[local48];
				arg1[local48] = arg1[local18];
				arg1[local18++] = local86;
			}
		}
		arg0[arg2] = arg0[local18];
		arg0[local18] = local22;
		arg1[arg2] = arg1[local18];
		arg1[local18] = local36;
		method5829(arg0, arg1, local18 - 1, arg3);
		method5829(arg0, arg1, arg2, local18 + 1);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ud;I)V")
	public static void method5830(@OriginalArg(0) Class2_Sub34 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static231.anInt4666; local5++) {
			@Pc(10) int local10 = arg0.method6863();
			@Pc(14) int local14 = arg0.method6884();
			if (local14 == 65535) {
				local14 = -1;
			}
			if (Static558.aClass202_Sub1Array2[local10] != null) {
				Static558.aClass202_Sub1Array2[local10].anInt5722 = local14;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public static void method5831() {
		if (Static375.aClass359_4.aBoolean729 && Static535.aClass322_5.anInt9045 != -1) {
			Static222.method7436(Static535.aClass322_5.aString83, Static535.aClass322_5.anInt9045);
		}
	}
}
