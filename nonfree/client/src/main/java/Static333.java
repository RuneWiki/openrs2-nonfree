import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	public static int anInt5628;

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
	public static int anInt5635;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
	public static int anInt5631 = -1;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!pf;ILclient!nf;II)V")
	public static void method4455(@OriginalArg(0) Class3_Sub4_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg1 & 0x8000) != 0) {
			local7 = arg2.method3601();
		}
		if ((arg1 & 0x40000) != 0) {
			arg0.aByte62 = arg2.method3545();
			arg0.aByte61 = arg2.method3573();
			arg0.aByte63 = arg2.method3605();
			arg0.aByte60 = (byte) arg2.method3556();
			arg0.anInt4968 = Static266.anInt4392 + arg2.method3548();
			arg0.anInt4921 = Static266.anInt4392 + arg2.method3548();
		}
		@Pc(73) int local73;
		if ((arg1 & 0x100) != 0) {
			local73 = arg2.method3555();
			arg0.anInt4941 = arg2.method3600();
			arg0.anInt4956 = arg2.method3587();
			arg0.anInt4931 = local73 & 0x7FFF;
			arg0.aBoolean352 = (local73 & 0x8000) != 0;
			arg0.anInt4971 = arg0.anInt4941 + arg0.anInt4931 + Static266.anInt4392;
		}
		if ((arg1 & 0x200) != 0) {
			arg0.aString146 = arg2.method3582();
			if (arg0.aString146.charAt(0) == '~') {
				arg0.aString146 = arg0.aString146.substring(1);
				Static166.method2340(arg0.method4017(), 0, 2, arg0.aString146, arg0.method4015());
			} else if (Static60.aClass3_Sub4_Sub1_Sub2_1 == arg0) {
				Static166.method2340(arg0.method4017(), 0, 2, arg0.aString146, arg0.method4015());
			}
			arg0.anInt4896 = 0;
			arg0.anInt4961 = 150;
			arg0.anInt4914 = 0;
		}
		if ((arg1 & 0x400) != 0) {
			arg0.aBoolean358 = arg2.method3600() == 1;
		}
		if ((arg1 & 0x2000) != 0) {
			arg0.anInt4907 = arg2.method3601();
			arg0.anInt4920 = arg2.method3573();
			arg0.anInt4919 = arg2.method3605();
			arg0.anInt4949 = arg2.method3605();
			arg0.anInt4898 = arg2.method3548() + Static266.anInt4392;
			arg0.anInt4917 = arg2.method3555() + Static266.anInt4392;
			arg0.anInt4926 = arg2.method3600();
			if (arg0.aBoolean357) {
				arg0.anInt4907 += arg0.anInt4999;
				arg0.anInt4977 = 0;
				arg0.anInt4949 += arg0.anInt4994;
				arg0.anInt4919 += arg0.anInt4999;
				arg0.anInt4920 += arg0.anInt4994;
			} else {
				arg0.anInt4907 += arg0.anIntArray425[0];
				arg0.anInt4977 = 1;
				arg0.anInt4920 += arg0.anIntArray424[0];
				arg0.anInt4919 += arg0.anIntArray425[0];
				arg0.anInt4949 += arg0.anIntArray424[0];
			}
			arg0.anInt4976 = 0;
		}
		if ((arg1 & 0x80) != 0) {
			arg0.anInt4980 = arg2.method3548();
			if (arg0.anInt4977 == 0) {
				arg0.method4003(arg0.anInt4980);
				arg0.anInt4980 = -1;
			}
		}
		if ((arg1 & 0x20) != 0) {
			local73 = arg2.method3555();
			if (local73 == 65535) {
				local73 = -1;
			}
			arg0.anInt4936 = local73;
		}
		if ((arg1 & 0x2) != 0) {
			local73 = arg2.method3600();
			@Pc(373) byte[] local373 = new byte[local73];
			@Pc(378) Class2_Sub13 local378 = new Class2_Sub13(local373);
			arg2.method3564(local373, local73);
			Static357.aClass2_Sub13Array3[arg3] = local378;
			arg0.method4024(local378);
		}
		@Pc(404) int local404;
		if ((arg1 & 0x10) != 0) {
			local73 = arg2.method3588();
			local404 = arg2.method3600();
			arg0.method4013(Static266.anInt4392, local73, local404);
			arg0.anInt4965 = Static266.anInt4392 + 300;
			arg0.anInt4925 = arg2.method3580();
		}
		if ((arg1 & 0x1) != 0) {
			local73 = arg2.method3555();
			if (local73 == 65535) {
				local73 = -1;
			}
			local404 = arg2.method3580();
			Static376.method4879(local404, arg0, local73);
		}
		if ((arg1 & 0x40) != 0) {
			Static288.aByteArray59[arg3] = arg2.method3573();
		}
		@Pc(484) int local484;
		if ((arg1 & 0x10000) != 0) {
			local73 = arg2.method3593();
			local404 = arg2.method3559();
			if (local73 == 65535) {
				local73 = -1;
			}
			local484 = arg2.method3580();
			arg0.method3996(true, local484, local73, local404);
		}
		if ((arg1 & 0x4) != 0) {
			local73 = arg2.method3555();
			local404 = arg2.method3587();
			local484 = arg2.method3587();
			@Pc(515) int local515 = arg2.anInt4347;
			@Pc(523) boolean local523 = (local73 & 0x8000) != 0;
			if (arg0.aString148 != null && arg0.aClass249_1 != null) {
				@Pc(531) boolean local531 = false;
				if (local404 <= 1) {
					if (!local523 && (Static409.aBoolean471 && !Static399.aBoolean464 || Static298.aBoolean16)) {
						local531 = true;
					} else if (Static214.method2831(arg0.aString148)) {
						local531 = true;
					}
				}
				if (!local531 && Static330.anInt5583 == 0) {
					Static420.aClass2_Sub13_8.anInt4347 = 0;
					arg2.method3598(Static420.aClass2_Sub13_8.aByteArray52, local484);
					Static420.aClass2_Sub13_8.anInt4347 = 0;
					@Pc(575) int local575 = -1;
					@Pc(594) String local594;
					if (local523) {
						local73 &= 0x7FFF;
						@Pc(585) Class231 local585 = Static297.method3934(Static420.aClass2_Sub13_8);
						local575 = local585.anInt6249;
						local594 = local585.aClass2_Sub5_Sub17_1.method5275(Static420.aClass2_Sub13_8);
					} else {
						local594 = Static249.method3171(Static114.method1736(Static420.aClass2_Sub13_8));
					}
					arg0.aString146 = local594.trim();
					arg0.anInt4961 = 150;
					arg0.anInt4914 = local73 >> 8;
					arg0.anInt4896 = local73 & 0xFF;
					@Pc(633) int local633;
					if (local404 == 1 || local404 == 2) {
						local633 = local523 ? 17 : 1;
					} else {
						local633 = local523 ? 17 : 2;
					}
					if (local404 == 2) {
						Static234.method3027(0, local594, null, local633, local575, "<img=1>" + arg0.method4017(), "<img=1>" + arg0.method4015());
					} else if (local404 == 1) {
						Static234.method3027(0, local594, null, local633, local575, "<img=0>" + arg0.method4017(), "<img=0>" + arg0.method4015());
					} else {
						Static234.method3027(0, local594, null, local633, local575, arg0.method4017(), arg0.method4015());
					}
				}
			}
			arg2.anInt4347 = local515 + local484;
		}
		if ((arg1 & 0x20000) != 0) {
			local73 = arg2.method3556();
			@Pc(744) int[] local744 = new int[local73];
			@Pc(747) int[] local747 = new int[local73];
			@Pc(750) int[] local750 = new int[local73];
			for (@Pc(752) int local752 = 0; local752 < local73; local752++) {
				@Pc(760) int local760 = arg2.method3593();
				if (local760 == 65535) {
					local760 = -1;
				}
				local744[local752] = local760;
				local747[local752] = arg2.method3580();
				local750[local752] = arg2.method3576();
			}
			Static426.method5368(local744, local747, local750, arg0);
		}
		if ((arg1 & 0x1000) != 0) {
			local73 = arg2.method3576();
			if (local73 == 65535) {
				local73 = -1;
			}
			local404 = arg2.method3547();
			local484 = arg2.method3587();
			arg0.method3996(false, local484, local73, local404);
		}
		if ((arg1 & 0x4000) != 0) {
			local73 = Static266.anInt4392;
			local404 = arg2.method3588();
			local484 = arg2.method3600();
			arg0.method4013(local73, local404, local484);
		}
		if (!arg0.aBoolean357) {
			return;
		}
		if (local7 == 127) {
			arg0.method4020(arg0.anInt4994, arg0.anInt4999);
			return;
		}
		@Pc(872) byte local872;
		if (local7 == -1) {
			local872 = Static288.aByteArray59[arg3];
		} else {
			local872 = local7;
		}
		arg0.method4021(arg0.anInt4999, arg0.anInt4994, local872);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;BZI)Z")
	public static boolean method4458(@OriginalArg(0) String arg0) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local31 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(86) int local86;
			if (local46 >= '0' && local46 <= '9') {
				local86 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local86 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local86 = local46 - 'W';
			} else {
				return false;
			}
			if (local86 >= 10) {
				return false;
			}
			if (local31) {
				local86 = -local86;
			}
			@Pc(122) int local122 = local35 * 10 + local86;
			if (local35 != local122 / 10) {
				return false;
			}
			local35 = local122;
			local33 = true;
		}
		return local33;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Lclient!bp;")
	public static Class3_Sub3 method4460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub3_2;
	}
}
