import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([IIII[I)V")
	public static void method7323(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(17) int local17 = (arg2 + arg1) / 2;
		@Pc(19) int local19 = arg1;
		@Pc(23) int local23 = arg3[local17];
		arg3[local17] = arg3[arg2];
		arg3[arg2] = local23;
		@Pc(37) int local37 = arg0[local17];
		arg0[local17] = arg0[arg2];
		arg0[arg2] = local37;
		@Pc(54) int local54 = local23 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg1; local56 < arg2; local56++) {
			if (arg3[local56] < local23 + (local56 & local54)) {
				@Pc(76) int local76 = arg3[local56];
				arg3[local56] = arg3[local19];
				arg3[local19] = local76;
				@Pc(90) int local90 = arg0[local56];
				arg0[local56] = arg0[local19];
				arg0[local19++] = local90;
			}
		}
		arg3[arg2] = arg3[local19];
		arg3[local19] = local23;
		arg0[arg2] = arg0[local19];
		arg0[local19] = local37;
		method7323(arg0, arg1, local19 - 1, arg3);
		method7323(arg0, local19 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ig;I)Lclient!uca;")
	public static Class6_Sub2 method7324(@OriginalArg(0) Class8_Sub8 arg0) {
		@Pc(9) Class6 local9 = Static121.method2709(arg0);
		@Pc(15) int local15 = arg0.method8578();
		@Pc(19) int local19 = arg0.method8578();
		@Pc(23) int local23 = arg0.method8578();
		@Pc(27) int local27 = arg0.method8578();
		@Pc(31) int local31 = arg0.method8578();
		@Pc(37) int local37 = arg0.method8578();
		return new Class6_Sub2(local9.aClass173_14, local9.aClass60_13, local9.anInt10332, local9.anInt10334, local9.anInt10335, local9.anInt10336, local9.anInt10339, local9.anInt10342, local9.anInt10337, local15, local19, local23, local27, local31, local37);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBZJ)Ljava/lang/String;")
	public static String method7325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg0 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg0 == 2) {
			local9 = ' ';
		}
		@Pc(24) boolean local24 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local24 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(55) int local55;
		if (arg1 > 0) {
			for (local50 = 0; local50 < arg1; local50++) {
				local55 = (int) arg3;
				arg3 /= 10L;
				local43.append((char) (local55 + 48 - (int) arg3 * 10));
			}
			local43.append(local7);
		}
		local50 = 0;
		while (true) {
			local55 = (int) arg3;
			arg3 /= 10L;
			local43.append((char) (local55 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local24) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg2) {
				local50++;
				if (local50 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}
}
