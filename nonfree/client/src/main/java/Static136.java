import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!kk", name = "wc", descriptor = "Lclient!rj;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_5;

	@OriginalMember(owner = "client!kk", name = "Oc", descriptor = "Lclient!jd;")
	public static Class84 aClass84_55;

	@OriginalMember(owner = "client!kk", name = "Ec", descriptor = "I")
	public static int anInt2973 = 0;

	@OriginalMember(owner = "client!kk", name = "Hc", descriptor = "S")
	public static short aShort15 = 1;

	@OriginalMember(owner = "client!kk", name = "Ic", descriptor = "I")
	public static int anInt2976 = 0;

	@OriginalMember(owner = "client!kk", name = "Lc", descriptor = "Ljava/lang/String;")
	public static String aString138 = "Select";

	@OriginalMember(owner = "client!kk", name = "Mc", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLclient!t;)V")
	public static void method2416(@OriginalArg(1) Class36_Sub3 arg0) {
		@Pc(5) Class70 local5 = arg0.method4104();
		arg0.anInt5138 = local5.anInt2124;
		if (arg0.anInt5096 == 0) {
			arg0.anInt5137 = 0;
			return;
		}
		if (arg0.anInt5087 != -1 && arg0.anInt5070 == 0) {
			@Pc(41) Class15 local41 = Static35.method706(arg0.anInt5087);
			if (arg0.anInt5077 > 0 && local41.anInt432 == 0) {
				arg0.anInt5137++;
				return;
			}
			if (arg0.anInt5077 <= 0 && local41.anInt417 == 0) {
				arg0.anInt5137++;
				return;
			}
		}
		if (arg0.anInt5125 != -1 && Static148.anInt3168 >= arg0.anInt5112) {
			@Pc(91) Class167 local91 = Static208.method3532(arg0.anInt5125);
			if (local91.aBoolean436 && local91.anInt5405 != -1) {
				@Pc(105) Class15 local105 = Static35.method706(local91.anInt5405);
				if (arg0.anInt5077 > 0 && local105.anInt432 == 0) {
					arg0.anInt5137++;
					return;
				}
				if (arg0.anInt5077 <= 0 && local105.anInt417 == 0) {
					arg0.anInt5137++;
					return;
				}
			}
		}
		@Pc(139) int local139 = arg0.anInt5093;
		@Pc(142) int local142 = arg0.anInt5109;
		@Pc(159) int local159 = arg0.anIntArray465[arg0.anInt5096 - 1] * 128 + arg0.method4097() * 64;
		@Pc(175) int local175 = arg0.anIntArray468[arg0.anInt5096 - 1] * 128 + arg0.method4097() * 64;
		if (local159 - local139 > 256 || local159 - local139 < -256 || local175 - local142 > 256 || local175 - local142 < -256) {
			arg0.anInt5109 = local175;
			arg0.anInt5093 = local159;
			return;
		}
		if (local139 < local159) {
			if (local142 < local175) {
				arg0.anInt5063 = 1280;
			} else if (local142 > local175) {
				arg0.anInt5063 = 1792;
			} else {
				arg0.anInt5063 = 1536;
			}
		} else if (local139 > local159) {
			if (local142 < local175) {
				arg0.anInt5063 = 768;
			} else if (local175 < local142) {
				arg0.anInt5063 = 256;
			} else {
				arg0.anInt5063 = 512;
			}
		} else if (local142 < local175) {
			arg0.anInt5063 = 1024;
		} else if (local142 > local175) {
			arg0.anInt5063 = 0;
		}
		@Pc(300) int local300 = arg0.anInt5063 - arg0.anInt5069 & 0x7FF;
		if (local300 > 1024) {
			local300 -= 2048;
		}
		@Pc(309) int local309 = local5.anInt2103;
		if (local300 >= -256 && local300 <= 256) {
			local309 = local5.anInt2098;
		} else if (local300 >= 256 && local300 < 768) {
			local309 = local5.anInt2111;
		} else if (local300 >= -768 && local300 <= -256) {
			local309 = local5.anInt2123;
		}
		@Pc(347) int local347 = 4;
		@Pc(349) boolean local349 = true;
		@Pc(351) byte local351 = 1;
		if (local309 == -1) {
			local309 = local5.anInt2098;
		}
		arg0.anInt5138 = local309;
		if (arg0 instanceof Class36_Sub3_Sub1) {
			local349 = ((Class36_Sub3_Sub1) arg0).aClass33_1.aBoolean63;
		}
		if (local349) {
			if (arg0.anInt5063 != arg0.anInt5069 && arg0.anInt5061 == -1 && arg0.anInt5132 != 0) {
				local347 = 2;
			}
			if (arg0.anInt5096 > 2) {
				local347 = 6;
			}
			if (arg0.anInt5096 > 3) {
				local347 = 8;
			}
			if (arg0.anInt5137 > 0 && arg0.anInt5096 > 1) {
				arg0.anInt5137--;
				local347 = 8;
			}
		} else {
			if (arg0.anInt5096 > 1) {
				local347 = 6;
			}
			if (arg0.anInt5096 > 2) {
				local347 = 8;
			}
			if (arg0.anInt5137 > 0 && arg0.anInt5096 > 1) {
				arg0.anInt5137--;
				local347 = 8;
			}
		}
		if (arg0.aByteArray70[arg0.anInt5096 - 1] == 2) {
			local347 <<= 0x1;
			local351 = 2;
		} else if (arg0.aByteArray70[arg0.anInt5096 - 1] == 0) {
			local347 >>= 0x1;
			local351 = 0;
		}
		if (local347 < 8 || local5.anInt2096 == -1) {
			if (local5.anInt2097 != -1 && local351 == 0) {
				if (local5.anInt2103 == arg0.anInt5138 && local5.anInt2113 != -1) {
					arg0.anInt5138 = local5.anInt2113;
				} else if (local5.anInt2123 == arg0.anInt5138 && local5.anInt2122 != -1) {
					arg0.anInt5138 = local5.anInt2122;
				} else if (arg0.anInt5138 == local5.anInt2111 && local5.anInt2093 != -1) {
					arg0.anInt5138 = local5.anInt2093;
				} else {
					arg0.anInt5138 = local5.anInt2097;
				}
			}
		} else if (arg0.anInt5138 == local5.anInt2103 && local5.anInt2116 != -1) {
			arg0.anInt5138 = local5.anInt2116;
		} else if (local5.anInt2123 == arg0.anInt5138 && local5.anInt2106 != -1) {
			arg0.anInt5138 = local5.anInt2106;
		} else if (arg0.anInt5138 == local5.anInt2111 && local5.anInt2092 != -1) {
			arg0.anInt5138 = local5.anInt2092;
		} else {
			arg0.anInt5138 = local5.anInt2096;
		}
		if (local5.anInt2090 != -1) {
			local347 <<= 0x7;
			if (arg0.anInt5096 == 1) {
				@Pc(704) int local704 = arg0.anInt5088 * arg0.anInt5088;
				@Pc(722) int local722 = (arg0.anInt5093 <= local159 ? local159 - arg0.anInt5093 : -local159 + arg0.anInt5093) << 7;
				@Pc(740) int local740 = (local175 < arg0.anInt5109 ? arg0.anInt5109 - local175 : -arg0.anInt5109 + local175) << 7;
				@Pc(751) int local751 = local740 >= local722 ? local740 : local722;
				@Pc(758) int local758 = local751 * local5.anInt2090 * 2;
				if (local758 < local704) {
					arg0.anInt5088 /= 2;
				} else if (local751 < local704 / 2) {
					arg0.anInt5088 -= local5.anInt2090;
					if (arg0.anInt5088 < 0) {
						arg0.anInt5088 = 0;
					}
				} else if (local347 > arg0.anInt5088) {
					arg0.anInt5088 += local5.anInt2090;
					if (arg0.anInt5088 > local347) {
						arg0.anInt5088 = local347;
					}
				}
			} else if (arg0.anInt5088 < local347) {
				arg0.anInt5088 += local5.anInt2090;
				if (local347 < arg0.anInt5088) {
					arg0.anInt5088 = local347;
				}
			} else if (arg0.anInt5088 > 0) {
				arg0.anInt5088 -= local5.anInt2090;
				if (arg0.anInt5088 < 0) {
					arg0.anInt5088 = 0;
				}
			}
			local347 = arg0.anInt5088 >> 7;
			if (local347 < 1) {
				local347 = 1;
			}
		}
		if (local175 > local142) {
			arg0.anInt5109 += local347;
			if (local175 < arg0.anInt5109) {
				arg0.anInt5109 = local175;
			}
		} else if (local142 > local175) {
			arg0.anInt5109 -= local347;
			if (local175 > arg0.anInt5109) {
				arg0.anInt5109 = local175;
			}
		}
		if (local139 < local159) {
			arg0.anInt5093 += local347;
			if (local159 < arg0.anInt5093) {
				arg0.anInt5093 = local159;
			}
		} else if (local139 > local159) {
			arg0.anInt5093 -= local347;
			if (local159 > arg0.anInt5093) {
				arg0.anInt5093 = local159;
			}
		}
		if (local159 == arg0.anInt5093 && local175 == arg0.anInt5109) {
			arg0.anInt5096--;
			if (arg0.anInt5077 > 0) {
				arg0.anInt5077--;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public static boolean method2419(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		@Pc(4) int local4 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		if (local11 > local4) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < local11; local22++) {
			@Pc(33) char local33 = arg0.charAt(local22);
			@Pc(37) char local37 = arg1.charAt(local22);
			if (local37 != local33 && Character.toLowerCase(local33) != Character.toLowerCase(local37) && Character.toUpperCase(local33) != Character.toUpperCase(local37)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(II)Lclient!g;")
	public static Class2_Sub3_Sub5_Sub1 method2420(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub3_Sub5_Sub1 local10 = (Class2_Sub3_Sub5_Sub1) Static97.aClass46_12.method1074((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static107.aClass84_46.method2127(0, arg0);
		local10 = new Class2_Sub3_Sub5_Sub1(local21);
		local10.method3320(Static4.aClass71Array1, null);
		Static97.aClass46_12.method1071(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(III)I")
	public static int method2421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub18 local8 = (Class2_Sub18) Static50.aClass79_4.method2002((long) arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < local8.anIntArray290.length; local26++) {
				if (arg0 == local8.anIntArray289[local26]) {
					local24 += local8.anIntArray290[local26];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method2422(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(40) int local40 = 2;
		for (@Pc(44) int local44 = arg0 / 10; local44 != 0; local44 /= 10) {
			local40++;
		}
		@Pc(59) char[] local59 = new char[local40];
		local59[0] = '+';
		for (@Pc(75) int local75 = local40 - 1; local75 > 0; local75--) {
			@Pc(80) int local80 = arg0;
			arg0 /= 10;
			@Pc(91) int local91 = local80 - arg0 * 10;
			if (local91 < 10) {
				local59[local75] = (char) (local91 + 48);
			} else {
				local59[local75] = (char) (local91 + 87);
			}
		}
		return new String(local59);
	}
}
