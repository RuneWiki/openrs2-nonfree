import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bea", name = "E", descriptor = "Lclient!wq;")
	public static final Class381 aClass381_1 = new Class381();

	@OriginalMember(owner = "client!bea", name = "H", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_3 = new Class244(3, 4);

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method753(@OriginalArg(1) String arg0) {
		Static162.aString32 = arg0;
		if (Static42.anApplet1 == null) {
			return;
		}
		try {
			@Pc(16) String local16 = Static42.anApplet1.getParameter("cookieprefix");
			@Pc(20) String local20 = Static42.anApplet1.getParameter("cookiehost");
			@Pc(35) String local35 = local16 + "settings=" + arg0 + "; version=1; path=/; domain=" + local20;
			if (arg0.length() == 0) {
				local35 = local35 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local35 = local35 + "; Expires=" + Static588.method8289(Static32.method595() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static654.method5163("document.cookie=\"" + local35 + "\"", Static42.anApplet1);
		} catch (@Pc(85) Throwable local85) {
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(III)V")
	public static void method755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static630.aClass271_17 == Static646.aClass271_15) {
			if (Static522.method7786(0, false, 0, -2, arg1, 1, arg0, 1)) {
				return;
			}
			Static522.method7786(0, false, 0, -3, arg1, 1, arg0, 1);
		} else if (Static522.method7786(0, false, 0, -3, arg1, 1, arg0, 1)) {
			return;
		} else {
			Static522.method7786(0, false, 0, -2, arg1, 1, arg0, 1);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIIBIIII)V")
	public static void method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(22) int local22 = arg0 - arg1;
		@Pc(26) int local26 = arg4 - arg1;
		@Pc(30) int local30 = arg0 * arg0;
		@Pc(34) int local34 = arg4 * arg4;
		@Pc(38) int local38 = local22 * local22;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg4 << 1;
		@Pc(66) int local66 = local26 << 1;
		@Pc(76) int local76 = local30 * (1 - local62) + local46;
		@Pc(84) int local84 = local34 - (local62 - 1) * local50;
		@Pc(94) int local94 = local38 * (1 - local66) + local54;
		@Pc(102) int local102 = local42 - local58 * (local66 - 1);
		@Pc(106) int local106 = local30 << 2;
		@Pc(110) int local110 = local34 << 2;
		@Pc(114) int local114 = local38 << 2;
		@Pc(118) int local118 = local42 << 2;
		@Pc(122) int local122 = local46 * 3;
		@Pc(128) int local128 = local50 * (local62 - 3);
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = (local66 - 3) * local58;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (arg4 - 1);
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = local114 * (local26 - 1);
		@Pc(158) int[] local158 = Static484.anIntArrayArray41[arg3];
		Static312.method5228(arg6, local158, arg2 - local22, arg2 + -arg0);
		Static312.method5228(arg5, local158, local22 + arg2, -local22 + arg2);
		Static312.method5228(arg6, local158, arg2 + arg0, local22 + arg2);
		while (local9 > 0) {
			@Pc(201) boolean local201 = local9 <= local26;
			if (local76 < 0) {
				while (local76 < 0) {
					local76 += local122;
					local84 += local140;
					local7++;
					local122 += local110;
					local140 += local110;
				}
			}
			if (local201) {
				if (local94 < 0) {
					while (local94 < 0) {
						local102 += local148;
						local94 += local132;
						local11++;
						local132 += local118;
						local148 += local118;
					}
				}
				if (local102 < 0) {
					local102 += local148;
					local94 += local132;
					local11++;
					local132 += local118;
					local148 += local118;
				}
				local94 += -local154;
				local102 += -local138;
				local138 -= local114;
				local154 -= local114;
			}
			if (local84 < 0) {
				local76 += local122;
				local84 += local140;
				local140 += local110;
				local122 += local110;
				local7++;
			}
			local76 += -local146;
			local84 += -local128;
			local128 -= local106;
			local9--;
			local146 -= local106;
			@Pc(340) int local340 = arg3 - local9;
			@Pc(344) int local344 = local9 + arg3;
			@Pc(348) int local348 = arg2 + local7;
			@Pc(353) int local353 = arg2 - local7;
			if (local201) {
				@Pc(377) int local377 = arg2 + local11;
				@Pc(381) int local381 = arg2 - local11;
				Static312.method5228(arg6, Static484.anIntArrayArray41[local340], local381, local353);
				Static312.method5228(arg5, Static484.anIntArrayArray41[local340], local377, local381);
				Static312.method5228(arg6, Static484.anIntArrayArray41[local340], local348, local377);
				Static312.method5228(arg6, Static484.anIntArrayArray41[local344], local381, local353);
				Static312.method5228(arg5, Static484.anIntArrayArray41[local344], local377, local381);
				Static312.method5228(arg6, Static484.anIntArrayArray41[local344], local348, local377);
			} else {
				Static312.method5228(arg6, Static484.anIntArrayArray41[local340], local348, local353);
				Static312.method5228(arg6, Static484.anIntArrayArray41[local344], local348, local353);
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method757(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class6_Sub9 local12 = Static560.method8089(Static391.aClass126_1, Static588.aClass208_89);
		local12.aClass6_Sub40_Sub2_1.method8589(Static583.method8194(arg1) + 1);
		local12.aClass6_Sub40_Sub2_1.method8563(arg0);
		local12.aClass6_Sub40_Sub2_1.method8551(arg1);
		Static263.method4681(local12);
	}
}
