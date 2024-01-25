import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!h", name = "L", descriptor = "B")
	public static byte aByte22;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "I")
	public static int anInt2486;

	@OriginalMember(owner = "client!h", name = "R", descriptor = "Lclient!pe;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	public static int anInt2485 = 100;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!h", name = "S", descriptor = "Ljava/lang/String;")
	public static final String aString91 = "green:";

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!tm;III)V")
	public static void method2400(@OriginalArg(0) Class10_Sub3_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(24) int local24;
		if ((arg2 & 0x200) != 0) {
			@Pc(13) int local13 = Static30.aClass14_Sub4_Sub2_1.method2513();
			@Pc(16) int[] local16 = new int[local13];
			@Pc(19) int[] local19 = new int[local13];
			@Pc(22) int[] local22 = new int[local13];
			for (local24 = 0; local24 < local13; local24++) {
				@Pc(30) int local30 = Static30.aClass14_Sub4_Sub2_1.method2540();
				if (local30 == 65535) {
					local30 = -1;
				}
				local16[local24] = local30;
				local19[local24] = Static30.aClass14_Sub4_Sub2_1.method2548();
				local22[local24] = Static30.aClass14_Sub4_Sub2_1.method2498();
			}
			Static27.method688(arg0, local22, local16, local19);
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		if ((arg2 & 0x4) != 0) {
			local83 = Static30.aClass14_Sub4_Sub2_1.method2525();
			local87 = Static30.aClass14_Sub4_Sub2_1.method2513();
			arg0.method5365(local87, Static153.anInt3257, local83);
			arg0.anInt5949 = Static153.anInt3257 + 300;
			arg0.anInt5967 = Static30.aClass14_Sub4_Sub2_1.method2511();
		}
		if ((arg2 & 0x800) != 0) {
			local83 = Static30.aClass14_Sub4_Sub2_1.method2498();
			arg0.anInt5914 = Static30.aClass14_Sub4_Sub2_1.method2511();
			arg0.anInt5943 = Static30.aClass14_Sub4_Sub2_1.method2539();
			arg0.aBoolean416 = (local83 & 0x8000) != 0;
			arg0.anInt5970 = local83 & 0x7FFF;
			arg0.anInt5912 = arg0.anInt5970 + Static153.anInt3257 + arg0.anInt5914;
		}
		if ((arg2 & 0x20) != 0) {
			local83 = Static30.aClass14_Sub4_Sub2_1.method2511();
			@Pc(162) byte[] local162 = new byte[local83];
			@Pc(167) Class14_Sub4 local167 = new Class14_Sub4(local162);
			Static30.aClass14_Sub4_Sub2_1.method2518(local162, local83);
			Static46.aClass14_Sub4Array1[arg1] = local167;
			arg0.method5373(local167);
		}
		if ((arg2 & 0x8) != 0) {
			arg0.anInt5921 = Static30.aClass14_Sub4_Sub2_1.method2505();
			if (arg0.anInt5921 == 65535) {
				arg0.anInt5921 = -1;
			}
		}
		if ((arg2 & 0x1) != 0) {
			arg0.aString223 = Static30.aClass14_Sub4_Sub2_1.method2496();
			if (arg0.aString223.charAt(0) == '~') {
				arg0.aString223 = arg0.aString223.substring(1);
				Static352.method5922(2, 0, arg0.method5375(), arg0.aString223, arg0.method5379());
			} else if (Static173.aClass10_Sub3_Sub3_Sub2_1 == arg0) {
				Static352.method5922(2, 0, arg0.method5375(), arg0.aString223, arg0.method5379());
			}
			arg0.anInt5946 = 0;
			arg0.anInt5942 = 0;
			arg0.anInt5934 = 150;
		}
		if ((arg2 & 0x1000) != 0) {
			local83 = Static30.aClass14_Sub4_Sub2_1.method2505();
			local87 = Static30.aClass14_Sub4_Sub2_1.method2510();
			if (local83 == 65535) {
				local83 = -1;
			}
			@Pc(287) boolean local287 = true;
			@Pc(352) Class79 local352;
			if (local83 != -1 && arg0.anInt5957 != -1) {
				@Pc(302) Class78 local302;
				if (local83 == arg0.anInt5957) {
					local302 = Static76.method1908(local83);
					if (local302.aBoolean161 && local302.anInt2302 != -1) {
						local352 = Static233.method4080(local302.anInt2302);
						@Pc(355) int local355 = local352.anInt2361;
						if (local355 == 0) {
							local287 = false;
						} else if (local355 == 1) {
							local287 = true;
						} else if (local355 == 2) {
							arg0.anInt5945 = 0;
							local287 = false;
						}
					}
				} else {
					local302 = Static76.method1908(local83);
					@Pc(307) Class78 local307 = Static76.method1908(arg0.anInt5957);
					if (local302.anInt2302 != -1 && local307.anInt2302 != -1) {
						@Pc(322) Class79 local322 = Static233.method4080(local302.anInt2302);
						@Pc(327) Class79 local327 = Static233.method4080(local307.anInt2302);
						if (local327.anInt2357 > local322.anInt2357) {
							local287 = false;
						}
					}
				}
			}
			if (local287) {
				arg0.anInt5917 = local87 >> 16;
				arg0.anInt5953 = 1;
				arg0.anInt5962 = 0;
				arg0.anInt5952 = 0;
				arg0.anInt5957 = local83;
				arg0.anInt5969 = (local87 & 0xFFFF) + Static153.anInt3257;
				if (Static153.anInt3257 < arg0.anInt5969) {
					arg0.anInt5962 = -1;
				}
				if (arg0.anInt5957 != -1 && Static153.anInt3257 == arg0.anInt5969) {
					local24 = Static76.method1908(arg0.anInt5957).anInt2302;
					if (local24 != -1) {
						local352 = Static233.method4080(local24);
						if (local352 != null && local352.anIntArray217 != null) {
							Static273.method4631(arg0.anInt5908, 0, arg0.anInt5910, arg0 == Static173.aClass10_Sub3_Sub3_Sub2_1, local352);
						}
					}
				}
			}
		}
		if ((arg2 & 0x10) != 0) {
			local83 = Static30.aClass14_Sub4_Sub2_1.method2540();
			if (local83 == 65535) {
				local83 = -1;
			}
			local87 = Static30.aClass14_Sub4_Sub2_1.method2511();
			Static181.method3498(arg0, local87, local83);
		}
		if ((arg2 & 0x400) != 0) {
			local83 = Static30.aClass14_Sub4_Sub2_1.method2525();
			local87 = Static30.aClass14_Sub4_Sub2_1.method2511();
			arg0.method5365(local87, Static153.anInt3257, local83);
		}
		if ((arg2 & 0x100) != 0) {
			arg0.anInt5930 = Static30.aClass14_Sub4_Sub2_1.method2513();
			arg0.anInt5974 = Static30.aClass14_Sub4_Sub2_1.method2548();
			arg0.anInt5972 = Static30.aClass14_Sub4_Sub2_1.method2548();
			arg0.anInt5965 = Static30.aClass14_Sub4_Sub2_1.method2511();
			arg0.anInt5928 = Static30.aClass14_Sub4_Sub2_1.method2505() + Static153.anInt3257;
			arg0.anInt5971 = Static30.aClass14_Sub4_Sub2_1.method2499() + Static153.anInt3257;
			arg0.anInt5977 = Static30.aClass14_Sub4_Sub2_1.method2539();
			arg0.anInt5986 = 1;
			arg0.anInt5988 = 0;
		}
		if ((arg2 & 0x80) != 0) {
			arg0.anInt5936 = Static30.aClass14_Sub4_Sub2_1.method2499();
			arg0.anInt5932 = Static30.aClass14_Sub4_Sub2_1.method2540();
		}
		if ((arg2 & 0x40) == 0) {
			return;
		}
		local83 = Static30.aClass14_Sub4_Sub2_1.method2499();
		local87 = Static30.aClass14_Sub4_Sub2_1.method2548();
		@Pc(586) int local586 = Static30.aClass14_Sub4_Sub2_1.method2539();
		local24 = Static30.aClass14_Sub4_Sub2_1.anInt2637;
		@Pc(600) boolean local600 = (local83 & 0x8000) != 0;
		if (arg0.aString224 != null && arg0.aClass83_4 != null) {
			@Pc(608) boolean local608 = false;
			if (local87 <= 1) {
				if (!local600 && (Static8.aBoolean9 && !Static104.aBoolean162 || Static318.aBoolean423)) {
					local608 = true;
				} else if (Static82.method2033(arg0.aString224)) {
					local608 = true;
				}
			}
			if (!local608 && Static223.anInt5821 == 0) {
				Static160.aClass14_Sub4_5.anInt2637 = 0;
				Static30.aClass14_Sub4_Sub2_1.method2517(Static160.aClass14_Sub4_5.aByteArray74, local586);
				Static160.aClass14_Sub4_5.anInt2637 = 0;
				@Pc(652) int local652 = -1;
				@Pc(662) String local662;
				if (local600) {
					local83 &= 0x7FFF;
					@Pc(672) Class202 local672 = Static265.method4530(Static160.aClass14_Sub4_5);
					local652 = local672.anInt6257;
					local662 = local672.aClass14_Sub2_Sub11_1.method3078(Static160.aClass14_Sub4_5);
				} else {
					local662 = Static131.method1810(Static323.method977(Static70.method1721(Static160.aClass14_Sub4_5)));
				}
				arg0.aString223 = local662.trim();
				arg0.anInt5946 = local83 >> 8;
				arg0.anInt5942 = local83 & 0xFF;
				arg0.anInt5934 = 150;
				@Pc(712) int local712;
				if (local87 == 1 || local87 == 2) {
					local712 = local600 ? 17 : 1;
				} else {
					local712 = local600 ? 17 : 2;
				}
				if (local87 == 2) {
					Static167.method4774(local712, null, "<img=1>" + arg0.method5375(), 0, "<img=1>" + arg0.method5379(), local652, local662);
				} else if (local87 == 1) {
					Static167.method4774(local712, null, "<img=0>" + arg0.method5375(), 0, "<img=0>" + arg0.method5379(), local652, local662);
				} else {
					Static167.method4774(local712, null, arg0.method5375(), 0, arg0.method5379(), local652, local662);
				}
			}
		}
		Static30.aClass14_Sub4_Sub2_1.anInt2637 = local586 + local24;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IBIII)Z")
	public static boolean method2401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static108.aByteArrayArrayArray5[0][arg0][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static108.aByteArrayArrayArray5[arg2][arg0][arg3] & 0x10) == 0) {
			return arg1 == Static205.method3782(arg2, arg3, arg0);
		} else {
			return false;
		}
	}
}
