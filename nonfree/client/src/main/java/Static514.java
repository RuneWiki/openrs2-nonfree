import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!tp", name = "J", descriptor = "I")
	public static int anInt8329;

	@OriginalMember(owner = "client!tp", name = "O", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_92 = new Class303(33, 7);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!np;)V")
	public static void method6920(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static527.aClass226_5 != null) {
			@Pc(24) int local24;
			try {
				Static527.aClass226_5.method5275(0L);
				Static527.aClass226_5.method5276(local8);
				for (local24 = 0; local24 < 24 && local8[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(51) Exception local51) {
				for (local24 = 0; local24 < 24; local24++) {
					local8[local24] = -1;
				}
			}
		}
		arg0.method5184(local8, 24);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBIIIIII)V")
	public static void method6922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg4;
		@Pc(21) int local21 = arg1 - arg4;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = arg1 * arg1;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local21 * local21;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg1 << 1;
		@Pc(65) int local65 = local21 << 1;
		@Pc(74) int local74 = local45 + local29 * (1 - local61);
		@Pc(82) int local82 = local33 - local49 * (local61 - 1);
		@Pc(92) int local92 = local37 * (1 - local65) + local53;
		@Pc(101) int local101 = local41 - local57 * (local65 - 1);
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 << 2;
		@Pc(121) int local121 = local45 * 3;
		@Pc(127) int local127 = (local61 - 3) * local49;
		@Pc(131) int local131 = local53 * 3;
		@Pc(137) int local137 = local57 * (local65 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local105 * (arg1 - 1);
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = local113 * (local21 - 1);
		@Pc(157) int[] local157 = Static158.anIntArrayArray66[arg5];
		Static583.method7816(local157, arg2, arg6 - arg3, -local16 + arg6);
		Static583.method7816(local157, arg0, arg6 - local16, local16 + arg6);
		Static583.method7816(local157, arg2, arg6 + local16, arg3 + arg6);
		while (local9 > 0) {
			@Pc(202) boolean local202 = local21 >= local9;
			if (local74 < 0) {
				while (local74 < 0) {
					local74 += local121;
					local82 += local139;
					local139 += local109;
					local7++;
					local121 += local109;
				}
			}
			if (local202) {
				if (local92 < 0) {
					while (local92 < 0) {
						local101 += local147;
						local92 += local131;
						local131 += local117;
						local11++;
						local147 += local117;
					}
				}
				if (local101 < 0) {
					local101 += local147;
					local92 += local131;
					local147 += local117;
					local11++;
					local131 += local117;
				}
				local101 += -local137;
				local92 += -local153;
				local137 -= local113;
				local153 -= local113;
			}
			if (local82 < 0) {
				local74 += local121;
				local82 += local139;
				local139 += local109;
				local121 += local109;
				local7++;
			}
			local82 += -local127;
			local74 += -local145;
			local145 -= local105;
			local9--;
			local127 -= local105;
			@Pc(339) int local339 = arg5 - local9;
			@Pc(343) int local343 = arg5 + local9;
			@Pc(348) int local348 = arg6 + local7;
			@Pc(353) int local353 = arg6 - local7;
			if (local202) {
				@Pc(377) int local377 = local11 + arg6;
				@Pc(382) int local382 = arg6 - local11;
				Static583.method7816(Static158.anIntArrayArray66[local339], arg2, local353, local382);
				Static583.method7816(Static158.anIntArrayArray66[local339], arg0, local382, local377);
				Static583.method7816(Static158.anIntArrayArray66[local339], arg2, local377, local348);
				Static583.method7816(Static158.anIntArrayArray66[local343], arg2, local353, local382);
				Static583.method7816(Static158.anIntArrayArray66[local343], arg0, local382, local377);
				Static583.method7816(Static158.anIntArrayArray66[local343], arg2, local377, local348);
			} else {
				Static583.method7816(Static158.anIntArrayArray66[local339], arg2, local353, local348);
				Static583.method7816(Static158.anIntArrayArray66[local343], arg2, local353, local348);
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!vj;BII)Lclient!br;")
	public static Class24_Sub1_Sub1 method6923(@OriginalArg(0) int arg0, @OriginalArg(1) Class45_Sub3 arg1, @OriginalArg(4) int arg2) {
		if (arg1.aBoolean707 || Static259.method3984(arg2) && Static259.method3984(arg0)) {
			return new Class24_Sub1_Sub1(arg1, 3553, 6408, arg2, arg0);
		} else if (arg1.aBoolean698) {
			return new Class24_Sub1_Sub1(arg1, 34037, 6408, arg2, arg0);
		} else {
			return new Class24_Sub1_Sub1(arg1, 6408, arg2, arg0, Static371.method5424(arg2), Static371.method5424(arg0));
		}
	}
}
