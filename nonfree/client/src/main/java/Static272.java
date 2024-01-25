import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
	public static final int anInt5106 = 0;

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_230 = new Class22(93, 8);

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "[I")
	public static final int[] anIntArray333 = new int[8];

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
	public static int anInt5116 = 0;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method3907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ya;BLclient!aq;Lclient!nf;II)Z")
	public static boolean method3908(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Class4_Sub3 arg1, @OriginalArg(3) Class157 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray317 != null) {
			local9 = Static148.anInt5723 + (Static148.anInt5731 - Static148.anInt5723) * (-Static148.anInt5726 + arg2.anInt4933 + arg1.anInt233) / (Static148.anInt5728 - Static148.anInt5726);
			local13 = Static148.anInt5730 - (arg2.anInt4915 + arg1.anInt228 - Static148.anInt5725) * (-Static148.anInt5727 + Static148.anInt5730) / (Static148.anInt5722 - Static148.anInt5725);
			local7 = Static148.anInt5723 + (arg2.anInt4936 + arg1.anInt233 - Static148.anInt5726) * (Static148.anInt5731 - Static148.anInt5723) / (Static148.anInt5728 - Static148.anInt5726);
			local11 = Static148.anInt5730 - (Static148.anInt5730 - Static148.anInt5727) * (arg1.anInt228 + arg2.anInt4925 - Static148.anInt5725) / (Static148.anInt5722 - Static148.anInt5725);
		}
		@Pc(104) Class57 local104 = null;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		if (arg2.anInt4930 != -1) {
			if (arg1.aBoolean27 && arg2.anInt4913 != -1) {
				local104 = arg2.method3785(arg0, true);
			} else {
				local104 = arg2.method3785(arg0, false);
			}
			if (local104 != null) {
				local106 = arg1.anInt235 - (local104.j() + 1 >> 1);
				if (local106 < local7) {
					local7 = local106;
				}
				local108 = arg1.anInt235 + (local104.j() + 1 >> 1);
				local110 = arg1.anInt231 - (local104.T() + 1 >> 1);
				if (local108 > local9) {
					local9 = local108;
				}
				local112 = arg1.anInt231 + (local104.T() + 1 >> 1);
				if (local11 > local110) {
					local11 = local110;
				}
				if (local13 < local112) {
					local13 = local112;
				}
			}
		}
		@Pc(215) Class212 local215 = null;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(279) int local279;
		@Pc(306) int local306;
		if (arg2.aString47 != null) {
			local215 = Static212.method3208(arg2.anInt4904);
			if (local215 != null) {
				local217 = Static387.aClass89_10.method2339(null, null, Static381.aStringArray35, arg2.aString47);
				local219 = arg1.anInt231;
				if (local104 == null) {
					local219 -= local217 * local215.method4821() / 2;
				} else {
					local219 -= (local104.T() >> 1) + (local215.method4818() * local217);
				}
				for (local279 = 0; local279 < local217; local279++) {
					@Pc(285) String local285 = Static381.aStringArray35[local279];
					if (local217 - 1 > local279) {
						local285 = local285.substring(0, local285.length() - 4);
					}
					local306 = local215.method4820(local285);
					if (local306 > local221) {
						local221 = local306;
					}
				}
				local223 = arg1.anInt235 - local221 / 2;
				local225 = local221 / 2 + arg1.anInt235;
				if (local223 < local7) {
					local7 = local223;
				}
				local227 = local219;
				if (local225 > local9) {
					local9 = local225;
				}
				local229 = local219 + local217 * local215.method4818();
				if (local227 < local11) {
					local11 = local227;
				}
				if (local13 < local229) {
					local13 = local229;
				}
			}
		}
		if (Static148.anInt5723 > local9 || local7 > Static148.anInt5731 || Static148.anInt5727 > local13 || Static148.anInt5730 < local11) {
			return true;
		}
		@Pc(414) int local414;
		if (arg2.anIntArray317 != null) {
			@Pc(412) int[] local412 = new int[arg2.anIntArray317.length];
			for (local414 = 0; local414 < local412.length / 2; local414++) {
				local306 = arg2.anIntArray317[local414 * 2] + arg1.anInt233;
				@Pc(438) int local438 = arg2.anIntArray317[local414 * 2 + 1] + arg1.anInt228;
				local412[local414 * 2] = Static148.anInt5723 + (local306 - Static148.anInt5726) * (Static148.anInt5731 - Static148.anInt5723) / (Static148.anInt5728 - Static148.anInt5726);
				local412[local414 * 2 + 1] = Static148.anInt5730 - (local438 - Static148.anInt5725) * (-Static148.anInt5727 + Static148.anInt5730) / (Static148.anInt5722 - Static148.anInt5725);
			}
			Static144.method2432(arg0, local412, arg2.anInt4927);
			for (local306 = 0; local306 < local412.length / 2 - 1; local306++) {
				arg0.method4296(local412[local306 * 2 + 1], arg2.anInt4908, local412[local306 * 2], local412[(local306 + 1) * 2 + 1], local412[local306 * 2 + 2]);
			}
			arg0.method4296(local412[local412.length - 1], arg2.anInt4908, local412[local412.length - 2], local412[1], local412[0]);
		}
		if (local104 != null) {
			if (Static140.anInt2835 > 0 && (Static85.anInt1763 != -1 && arg1.anInt234 == Static85.anInt1763 || Static402.anInt6662 != -1 && arg2.anInt4919 == Static402.anInt6662)) {
				if (Static274.anInt5136 <= 50) {
					local279 = Static274.anInt5136 * 2;
				} else {
					local279 = (100 - Static274.anInt5136) * 2;
				}
				local414 = local279 << 24 | 0xFFFF00;
				arg0.method4304(arg1.anInt231, local104.la() / 2 + 7, arg1.anInt235, local414);
				arg0.method4304(arg1.anInt231, local104.la() / 2 + 5, arg1.anInt235, local414);
				arg0.method4304(arg1.anInt231, local104.la() / 2 + 3, arg1.anInt235, local414);
				arg0.method4304(arg1.anInt231, local104.la() / 2 + 1, arg1.anInt235, local414);
				arg0.method4304(arg1.anInt231, local104.la() / 2, arg1.anInt235, local414);
			}
			local104.method5534(arg1.anInt235 - (local104.j() >> 1), arg1.anInt231 - (local104.T() >> 1));
		}
		if (arg2.aString47 != null && local215 != null) {
			Static410.method5269(local217, arg1, local221, local219, local215, arg2, arg0);
		}
		if (arg2.anInt4930 != -1 || arg2.aString47 != null) {
			@Pc(731) Class4_Sub14 local731 = new Class4_Sub14(arg1);
			local731.anInt1542 = local112;
			local731.anInt1546 = local225;
			local731.anInt1539 = local108;
			local731.anInt1538 = local106;
			local731.anInt1540 = local229;
			local731.anInt1541 = local223;
			local731.anInt1544 = local110;
			local731.anInt1543 = local227;
			Static378.aClass183_29.method4137(local731);
		}
		return false;
	}
}
