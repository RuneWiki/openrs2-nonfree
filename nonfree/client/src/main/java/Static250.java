import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
	public static int anInt4943;

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_154 = new Class119(50);

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
	public static void method4556() {
		@Pc(7) Class130 local7 = null;
		try {
			@Pc(11) Class193 local11 = Static177.aClass168_2.method4844();
			while (local11.anInt6293 == 0) {
				Static102.method2276(1L);
			}
			if (local11.anInt6293 == 1) {
				local7 = (Class130) local11.anObject7;
				@Pc(33) byte[] local33 = new byte[(int) local7.method3573()];
				@Pc(48) int local48;
				for (@Pc(35) int local35 = 0; local35 < local33.length; local35 += local48) {
					local48 = local7.method3572(local33.length - local35, local33, local35);
					if (local48 == -1) {
						throw new IOException("EOF");
					}
				}
				Static87.method1935(new Class2_Sub10(local33));
			}
		} catch (@Pc(77) Exception local77) {
		}
		try {
			if (local7 != null) {
				local7.method3574();
			}
		} catch (@Pc(86) Exception local86) {
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z[I[JII)V")
	public static void method4557(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg3 + arg2) / 2;
		@Pc(25) int local25 = arg3;
		@Pc(29) long local29 = arg1[local23];
		arg1[local23] = arg1[arg2];
		arg1[arg2] = local29;
		@Pc(43) int local43 = arg0[local23];
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local43;
		for (@Pc(55) int local55 = arg3; local55 < arg2; local55++) {
			if ((long) (local55 & 0x1) + local29 > arg1[local55]) {
				@Pc(76) long local76 = arg1[local55];
				arg1[local55] = arg1[local25];
				arg1[local25] = local76;
				@Pc(90) int local90 = arg0[local55];
				arg0[local55] = arg0[local25];
				arg0[local25++] = local90;
			}
		}
		arg1[arg2] = arg1[local25];
		arg1[local25] = local29;
		arg0[arg2] = arg0[local25];
		arg0[local25] = local43;
		method4557(arg0, arg1, local25 - 1, arg3);
		method4557(arg0, arg1, arg2, local25 + 1);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg1 && arg4 == arg0 && arg6 == arg5 && arg7 == arg8) {
			Static68.method1535(arg3, arg5, arg8, arg0, arg2);
			return;
		}
		@Pc(27) int local27 = arg2;
		@Pc(29) int local29 = arg0;
		@Pc(33) int local33 = arg2 * 3;
		@Pc(37) int local37 = arg0 * 3;
		@Pc(41) int local41 = arg1 * 3;
		@Pc(45) int local45 = arg4 * 3;
		@Pc(49) int local49 = arg6 * 3;
		@Pc(53) int local53 = arg7 * 3;
		@Pc(63) int local63 = local41 + arg5 - arg2 - local49;
		@Pc(72) int local72 = local45 + arg8 - arg0 - local53;
		@Pc(82) int local82 = local33 + local49 - local41 - local41;
		@Pc(92) int local92 = local37 + local53 - local45 - local45;
		@Pc(97) int local97 = local41 - local33;
		@Pc(102) int local102 = local45 - local37;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(112) int local112 = local104 * local104 >> 12;
			@Pc(118) int local118 = local112 * local104 >> 12;
			@Pc(122) int local122 = local118 * local63;
			@Pc(126) int local126 = local118 * local72;
			@Pc(130) int local130 = local112 * local82;
			@Pc(134) int local134 = local92 * local112;
			@Pc(138) int local138 = local97 * local104;
			@Pc(142) int local142 = local102 * local104;
			@Pc(153) int local153 = arg2 + (local138 + local130 + local122 >> 12);
			@Pc(163) int local163 = (local142 + local134 + local126 >> 12) + arg0;
			Static68.method1535(arg3, local153, local163, local29, local27);
			local27 = local153;
			local29 = local163;
		}
	}
}
