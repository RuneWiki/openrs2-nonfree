import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!on", name = "f", descriptor = "Lclient!fia;")
	public static final Class117 aClass117_10 = new Class117(7, 0, 1, 1);

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_154 = new Class200(92, -2);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(JI)V")
	public static void method6093(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method6094(@OriginalArg(1) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static482.anInt7782;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(23) Class138 local23 = Static542.aClass210_1.method4908(arg0[local11]);
			if (local23.anInt3921 != -1) {
				@Pc(35) Class31 local35 = (Class31) Static166.aClass69_18.method1919((long) local23.anInt3921);
				if (local35 == null) {
					@Pc(43) Class139 local43 = Static654.method3455(Static497.aClass238_223, local23.anInt3921, 0);
					if (local43 != null) {
						local35 = Static141.aClass13_27.method8141(local43, true);
						Static166.aClass69_18.method1917((long) local23.anInt3921, local35);
					}
				}
				if (local35 != null) {
					Static402.aClass31Array11[local9] = local35;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIII)V")
	public static void method6096(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(44) int local44 = (1 - local29) * local13 + local21;
		@Pc(53) int local53 = local17 - (local29 - 1) * local25;
		@Pc(57) int local57 = local13 << 2;
		@Pc(61) int local61 = local17 << 2;
		@Pc(69) int local69 = local21 * 3;
		@Pc(77) int local77 = ((arg4 << 1) - 3) * local25;
		@Pc(83) int local83 = local61;
		@Pc(105) int local105;
		@Pc(116) int local116;
		if (arg0 >= Static346.anInt5494 && Static640.anInt10333 >= arg0) {
			local105 = Static117.method5173(Static566.anInt9279, arg3 + arg2, Static392.anInt6753);
			local116 = Static117.method5173(Static566.anInt9279, arg3 - arg2, Static392.anInt6753);
			Static188.method3208(local105, arg1, local116, Static349.anIntArrayArray71[arg0]);
		}
		@Pc(130) int local130 = local57 * (arg4 - 1);
		while (local9 > 0) {
			if (local44 < 0) {
				while (local44 < 0) {
					local44 += local69;
					local53 += local83;
					local69 += local61;
					local7++;
					local83 += local61;
				}
			}
			if (local53 < 0) {
				local53 += local83;
				local44 += local69;
				local69 += local61;
				local7++;
				local83 += local61;
			}
			local53 += -local77;
			local44 += -local130;
			local77 -= local57;
			local9--;
			local130 -= local57;
			local105 = arg0 - local9;
			local116 = local9 + arg0;
			if (Static346.anInt5494 <= local116 && local105 <= Static640.anInt10333) {
				@Pc(230) int local230 = Static117.method5173(Static566.anInt9279, arg3 + local7, Static392.anInt6753);
				@Pc(238) int local238 = Static117.method5173(Static566.anInt9279, arg3 - local7, Static392.anInt6753);
				if (local105 >= Static346.anInt5494) {
					Static188.method3208(local230, arg1, local238, Static349.anIntArrayArray71[local105]);
				}
				if (Static640.anInt10333 >= local116) {
					Static188.method3208(local230, arg1, local238, Static349.anIntArrayArray71[local116]);
				}
			}
		}
	}
}
