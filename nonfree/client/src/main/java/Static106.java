import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "Lclient!wv;")
	public static final Class393 aClass393_3 = new Class393();

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIF[FIIFFIB[F)V")
	public static void method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) int arg11, @OriginalArg(13) float[] arg12) {
		@Pc(5) int local5 = arg4 - arg0;
		@Pc(14) int local14 = arg8 - arg11;
		@Pc(22) int local22 = arg1 - arg2;
		@Pc(43) float local43 = arg6[2] * (float) local14 + arg6[1] * (float) local5 + arg6[0] * (float) local22;
		@Pc(64) float local64 = (float) local22 * arg6[3] + (float) local5 * arg6[4] + (float) local14 * arg6[5];
		@Pc(85) float local85 = (float) local22 * arg6[6] + (float) local5 * arg6[7] + arg6[8] * (float) local14;
		@Pc(93) float local93;
		@Pc(100) float local100;
		if (arg3 == 0) {
			local93 = local43 + arg10 + 0.5F;
			local100 = arg5 + 0.5F - local85;
		} else if (arg3 == 1) {
			local100 = local85 + arg5 + 0.5F;
			local93 = local43 + arg10 + 0.5F;
		} else if (arg3 == 2) {
			local93 = arg10 + 0.5F - local43;
			local100 = arg9 + 0.5F - local64;
		} else if (arg3 == 3) {
			local100 = arg9 + 0.5F - local64;
			local93 = local43 + arg10 + 0.5F;
		} else if (arg3 == 4) {
			local100 = arg9 + 0.5F - local64;
			local93 = arg5 + local85 + 0.5F;
		} else {
			local100 = arg9 + 0.5F - local64;
			local93 = arg5 + 0.5F - local85;
		}
		@Pc(201) float local201;
		if (arg7 == 1) {
			local201 = local93;
			local93 = -local100;
			local100 = local201;
		} else if (arg7 == 2) {
			local100 = -local100;
			local93 = -local93;
		} else if (arg7 == 3) {
			local201 = local93;
			local93 = local100;
			local100 = -local201;
		}
		arg12[1] = local100;
		arg12[0] = local93;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIILclient!lp;ILclient!ha;)V")
	public static void method1695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class216 arg3, @OriginalArg(5) Class95 arg4) {
		@Pc(9) Class245 local9 = Static33.aClass208_11.method4945(arg3.anInt5957);
		if (local9.anInt6544 == -1) {
			return;
		}
		if (arg3.aBoolean409) {
			@Pc(23) int local23 = arg0 + arg3.anInt5982;
			arg0 = local23 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(44) Class6 local44 = local9.method5496(arg4, arg0, arg3.aBoolean410);
		if (local44 == null) {
			return;
		}
		@Pc(50) int local50 = arg3.anInt5947;
		@Pc(53) int local53 = arg3.anInt5949;
		if ((arg0 & 0x1) == 1) {
			local50 = arg3.anInt5949;
			local53 = arg3.anInt5947;
		}
		@Pc(67) int local67 = local44.method5130();
		@Pc(70) int local70 = local44.method5134();
		if (local9.aBoolean453) {
			local70 = local53 * 4;
			local67 = local50 * 4;
		}
		if (local9.anInt6541 == 0) {
			local44.method5121(arg2, arg1 - (local53 - 1) * 4, local67, local70);
		} else {
			local44.method5135(arg2, arg1 + 4 - local53 * 4, local67, local70, 0, local9.anInt6541 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;")
	public static String method1696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg0 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg0 == 2) {
			local9 = ' ';
		}
		@Pc(32) boolean local32 = false;
		if (arg2 < 0L) {
			local32 = true;
			arg2 = -arg2;
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(26);
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (arg1 > 0) {
			for (local53 = 0; local53 < arg1; local53++) {
				local58 = (int) arg2;
				arg2 /= 10L;
				local46.append((char) (local58 + 48 - (int) arg2 * 10));
			}
			local46.append(local7);
		}
		local53 = 0;
		while (true) {
			local58 = (int) arg2;
			arg2 /= 10L;
			local46.append((char) (local58 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local32) {
					local46.append('-');
				}
				return local46.reverse().toString();
			}
			if (arg3) {
				local53++;
				if (local53 % 3 == 0) {
					local46.append(local9);
				}
			}
		}
	}
}
