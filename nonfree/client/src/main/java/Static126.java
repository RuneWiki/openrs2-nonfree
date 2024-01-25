import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!ir;")
	public static Class78 aClass78_4;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!nq;")
	public static Class144 aClass144_61;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!kh;)Lclient!ls;")
	public static Class27_Sub3 method3654(@OriginalArg(1) Class11_Sub25 arg0) {
		return new Class27_Sub3(arg0.method5220(), arg0.method5220(), arg0.method5220(), arg0.method5220(), arg0.method5220(), arg0.method5220(), arg0.method5220(), arg0.method5220(), arg0.method5221(), arg0.method5185());
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!ij;[[IIZ[[BI[[B[[BILclient!ij;[[BLclient!uo;)V")
	public static void method3658(@OriginalArg(1) Class77 arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class77 arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class129 arg11) {
		if (Static74.anInt1413 == 0 && !Static55.aBoolean65) {
			Static77.method5669(arg11, arg6, arg10, arg9, arg8, arg3, arg1, arg2, arg5, arg7, arg0, arg4);
		} else {
			Static106.method1621(arg2, arg6, arg1, arg0, arg9, arg5, arg3, arg4, arg11, arg7, arg10, arg8);
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public static void method3660() {
		Static251.aClass16_40.method191();
		for (@Pc(13) Class11_Sub14 local13 = (Class11_Sub14) Static119.aClass16_21.method193(); local13 != null; local13 = (Class11_Sub14) Static119.aClass16_21.method188()) {
			if (local13.anInt1765 < 1000) {
				local13.method5701();
				Static251.aClass16_40.method190(local13);
			}
		}
		Static251.aClass16_40.method182(Static119.aClass16_21);
		if (Static45.aClass137_4 != null || Static235.anInt4730 > 0) {
			return;
		}
		@Pc(53) int local53 = -1;
		if (Static182.aClass11_Sub39_1 != null) {
			local53 = Static182.aClass11_Sub39_1.method5600();
		}
		if (!Static38.aBoolean40) {
			if (Static215.anInt4404 >= 0) {
				local53 = Static215.anInt4404;
			}
			Static215.anInt4404 = -1;
			if (local53 == 0 && (Static294.anInt5813 == 1 && Static13.anInt245 > 2 || Static117.method1782())) {
				local53 = 2;
			}
			if (local53 == 2 && Static13.anInt245 > 0) {
				if (Static182.aClass11_Sub39_1 == null) {
					Static73.method1121(Static37.anInt694, Static83.anInt1515);
				} else {
					Static73.method1121(Static182.aClass11_Sub39_1.method5598(), Static182.aClass11_Sub39_1.method5601());
				}
			}
			if (local53 != 0 || Static13.anInt245 <= 0) {
				return;
			}
			Static101.method1493();
			return;
		}
		@Pc(69) int local69;
		@Pc(73) int local73;
		if (local53 == -1) {
			local69 = Static214.aClass29_1.method384();
			local73 = Static214.aClass29_1.method381();
			if (local69 < Static204.anInt4174 - 10 || Static101.anInt1790 + Static204.anInt4174 + 10 < local69 || local73 < Static24.anInt452 - 10 || local73 > Static24.anInt452 + Static45.anInt880 + 10) {
				Static38.aBoolean40 = false;
				Static168.method2724(Static45.anInt880, Static24.anInt452, Static204.anInt4174, Static101.anInt1790);
			}
		}
		if (local53 != 0) {
			return;
		}
		local69 = Static204.anInt4174;
		local73 = Static24.anInt452;
		@Pc(124) int local124 = Static101.anInt1790;
		@Pc(128) int local128 = Static182.aClass11_Sub39_1.method5601();
		@Pc(132) int local132 = Static182.aClass11_Sub39_1.method5598();
		@Pc(134) int local134 = -1;
		@Pc(153) int local153;
		for (@Pc(136) int local136 = 0; local136 < Static13.anInt245; local136++) {
			if (Static206.aBoolean282) {
				local153 = local73 + (-local136 + -1 + Static13.anInt245) * 16 + 33;
				if (local128 > local69 && local128 < local124 + local69 && local153 - 13 < local132 && local153 + 4 > local132) {
					local134 = local136;
				}
			} else {
				local153 = (Static13.anInt245 - local136 - 1) * 16 + local73 + 31;
				if (local128 > local69 && local69 + local124 > local128 && local153 - 13 < local132 && local132 < local153 + 3) {
					local134 = local136;
				}
			}
		}
		if (local134 != -1) {
			local153 = 0;
			@Pc(236) Class41 local236 = new Class41(Static119.aClass16_21);
			for (@Pc(241) Class11_Sub14 local241 = (Class11_Sub14) local236.method655(); local241 != null; local241 = (Class11_Sub14) local236.method652()) {
				if (local153 == local134) {
					Static136.method5514(local241);
				}
				local153++;
			}
		}
		Static38.aBoolean40 = false;
		Static168.method2724(Static45.anInt880, Static24.anInt452, Static204.anInt4174, Static101.anInt1790);
		return;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!nq;BLclient!nq;)V")
	public static void method3669(@OriginalArg(0) Class144 arg0, @OriginalArg(2) Class144 arg1) {
		Static342.aClass144_111 = arg1;
		Static82.aClass144_29 = arg0;
		Static124.anInt2297 = Static342.aClass144_111.method3890(3);
	}
}
