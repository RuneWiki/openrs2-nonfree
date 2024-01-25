import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
	public static int anInt10190 = 0;

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "[Lclient!pt;")
	public static final Class278[] aClass278Array1 = new Class278[6];

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "F")
	public static float aFloat196 = 0.0F;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)I")
	public static int method8505() {
		if (Static423.aBoolean549) {
			return 6;
		} else if (Static529.aClass5_Sub2_Sub13_5 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static529.aClass5_Sub2_Sub13_5.anInt6711;
			if (Static77.method1114(local14)) {
				return 1;
			} else if (Static613.method8234(local14)) {
				return 2;
			} else if (Static63.method930(local14)) {
				return 3;
			} else if (Static152.method2244(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "([I[IIII)V")
	public static void method8506(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(16) int local16 = (arg2 + arg3) / 2;
		@Pc(18) int local18 = arg3;
		@Pc(22) int local22 = arg1[local16];
		arg1[local16] = arg1[arg2];
		arg1[arg2] = local22;
		@Pc(36) int local36 = arg0[local16];
		arg0[local16] = arg0[arg2];
		arg0[arg2] = local36;
		@Pc(55) int local55 = ~local22 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg3; local57 < arg2; local57++) {
			if (arg1[local57] < (local57 & local55) + local22) {
				@Pc(71) int local71 = arg1[local57];
				arg1[local57] = arg1[local18];
				arg1[local18] = local71;
				@Pc(85) int local85 = arg0[local57];
				arg0[local57] = arg0[local18];
				arg0[local18++] = local85;
			}
		}
		arg1[arg2] = arg1[local18];
		arg1[local18] = local22;
		arg0[arg2] = arg0[local18];
		arg0[local18] = local36;
		method8506(arg0, arg1, local18 - 1, arg3);
		method8506(arg0, arg1, arg2, local18 + 1);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method8507(@OriginalArg(0) String arg0) {
		@Pc(5) String local5 = null;
		@Pc(9) int local9 = arg0.indexOf("--> ");
		if (local9 >= 0) {
			local5 = arg0.substring(0, local9 + 4);
			arg0 = arg0.substring(local9 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(37) int local37 = arg0.indexOf(" ", "directlogin ".length());
			if (local37 >= 0) {
				@Pc(42) int local42 = arg0.length();
				arg0 = arg0.substring(0, local37) + " ";
				for (@Pc(58) int local58 = local37 + 1; local58 < local42; local58++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local5 == null ? arg0 : local5 + arg0;
	}
}
