import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "[I")
	public static int[] anIntArray162 = new int[32];

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "Lclient!ec;")
	public static Class46 aClass46_16 = new Class46(64);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2003(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(18) int local18 = arg1.indexOf(arg0); local18 != -1; local18 = arg1.indexOf(arg0, arg2.length() + local18)) {
			arg1 = arg1.substring(0, local18) + arg2 + arg1.substring(arg0.length() + local18);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLjava/lang/String;IZBIJZILjava/lang/String;I)V")
	public static void method2007(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9) {
		@Pc(4) int[] local4 = new int[4];
		for (@Pc(6) int local6 = 0; local6 < 3; local6++) {
			local4[local6] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(36) Class2_Sub26 local36 = new Class2_Sub26(128);
		local36.method4239(10);
		local36.method4231((arg3 ? 1 : 0) | (arg6 ? 2 : 0) | (arg0 ? 4 : 0));
		local36.method4225(arg5);
		local36.method4260(local4[0]);
		local36.method4253(arg1);
		local36.method4260(local4[1]);
		local36.method4231(Static136.anInt2976);
		local36.method4239(arg9);
		local36.method4239(arg2);
		local36.method4260(local4[2]);
		local36.method4231(arg4);
		local36.method4231(arg7);
		local36.method4260(local4[3]);
		local36.method4268(Static248.aBigInteger3, Static125.aBigInteger4);
		@Pc(122) Class2_Sub26 local122 = new Class2_Sub26(350);
		local122.method4253(arg8);
		@Pc(135) int local135 = 8 - Static66.method1280(arg8) % 8;
		for (@Pc(137) int local137 = 0; local137 < local135; local137++) {
			local122.method4239((int) (Math.random() * 255.0D));
		}
		local122.method4273(local4);
		Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
		Static95.aClass2_Sub26_Sub1_1.method4239(22);
		Static95.aClass2_Sub26_Sub1_1.method4231(local36.anInt5328 + local122.anInt5328 + 2);
		Static95.aClass2_Sub26_Sub1_1.method4231(543);
		Static95.aClass2_Sub26_Sub1_1.method4246(local36.aByteArray72, local36.anInt5328);
		Static95.aClass2_Sub26_Sub1_1.method4246(local122.aByteArray72, local122.anInt5328);
		Static134.anInt2735 = 0;
		Static184.anInt3908 = -3;
		Static217.anInt4539 = 0;
		Static260.anInt5416 = 1;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
	public static void method2008(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static68.anInt1507;
		if (arg0 == 0) {
			local7 = 1;
		}
		@Pc(14) int local14;
		@Pc(24) Class36_Sub3_Sub2 local24;
		@Pc(106) int local106;
		@Pc(125) int local125;
		@Pc(131) int local131;
		@Pc(154) int local154;
		@Pc(159) int local159;
		@Pc(172) int local172;
		for (local14 = 0; local14 < local7; local14++) {
			if (arg0 == 0) {
				local24 = Static111.aClass36_Sub3_Sub2_1;
			} else {
				local24 = Static212.aClass36_Sub3_Sub2Array1[Static33.anIntArray50[local14]];
			}
			if (local24 != null && local24.method4099()) {
				@Pc(43) int local43 = local24.method4097();
				if (arg0 == 0 || local43 == arg0) {
					@Pc(116) int local116;
					if (local43 == 1) {
						if ((local24.anInt5093 & 0x7F) == 64 && (local24.anInt5109 & 0x7F) == 64) {
							local116 = local24.anInt5093 >> 7;
							local106 = local24.anInt5109 >> 7;
							if (local116 >= 0 && local116 < 104 && local106 >= 0 && local106 < 104) {
								local172 = Static156.anIntArrayArray49[local116][local106]++;
							}
						}
					} else if (((local43 & 0x1) != 0 || (local24.anInt5093 & 0x7F) == 0 && (local24.anInt5109 & 0x7F) == 0) && ((local43 & 0x1) != 1 || (local24.anInt5093 & 0x7F) == 64 && (local24.anInt5109 & 0x7F) == 64)) {
						local106 = local24.anInt5109 - local43 * 64 >> 7;
						local116 = local24.anInt5093 - local43 * 64 >> 7;
						local125 = local116 + local24.method4097();
						local131 = local24.method4097() + local106;
						if (local116 < 0) {
							local116 = 0;
						}
						if (local125 > 104) {
							local125 = 104;
						}
						if (local106 < 0) {
							local106 = 0;
						}
						if (local131 > 104) {
							local131 = 104;
						}
						for (local154 = local116; local154 < local125; local154++) {
							for (local159 = local106; local159 < local131; local159++) {
								local172 = Static156.anIntArrayArray49[local154][local159]++;
							}
						}
					}
				}
			}
		}
		label220: for (local14 = 0; local14 < local7; local14++) {
			@Pc(248) long local248;
			if (arg0 == 0) {
				local24 = Static111.aClass36_Sub3_Sub2_1;
				local248 = 8791798054912L;
			} else {
				local248 = (long) Static33.anIntArray50[local14] << 32;
				local24 = Static212.aClass36_Sub3_Sub2Array1[Static33.anIntArray50[local14]];
			}
			if (local24 != null && local24.method4099()) {
				local106 = local24.method4097();
				if (arg0 == 0 || arg0 == local106) {
					local24.aBoolean427 = false;
					local24.aBoolean420 = true;
					if ((Static150.aBoolean262 && Static68.anInt1507 > 200 || Static68.anInt1507 > 50) && arg0 != 0 && local24.anInt5138 == local24.method4104().anInt2124) {
						local24.aBoolean427 = true;
					}
					if (local106 == 1) {
						if ((local24.anInt5093 & 0x7F) == 64 && (local24.anInt5109 & 0x7F) == 64) {
							local125 = local24.anInt5093 >> 7;
							local131 = local24.anInt5109 >> 7;
							if (local125 < 0 || local125 >= 104 || local131 < 0 || local131 >= 104) {
								continue;
							}
							if (Static156.anIntArrayArray49[local125][local131] > 1) {
								local172 = Static156.anIntArrayArray49[local125][local131]--;
								continue;
							}
						}
					} else if ((local106 & 0x1) == 0 && (local24.anInt5093 & 0x7F) == 0 && (local24.anInt5109 & 0x7F) == 0 || (local106 & 0x1) == 1 && (local24.anInt5093 & 0x7F) == 64 && (local24.anInt5109 & 0x7F) == 0) {
						local125 = local24.anInt5093 - local106 * 64 >> 7;
						local131 = local24.anInt5109 - local106 * 64 >> 7;
						local154 = local125 + local106;
						if (local154 > 104) {
							local154 = 104;
						}
						if (local125 < 0) {
							local125 = 0;
						}
						local159 = local131 + local106;
						@Pc(470) boolean local470 = true;
						if (local159 > 104) {
							local159 = 104;
						}
						if (local131 < 0) {
							local131 = 0;
						}
						@Pc(482) int local482;
						@Pc(491) int local491;
						for (local482 = local125; local482 < local154; local482++) {
							for (local491 = local131; local491 < local159; local491++) {
								if (Static156.anIntArrayArray49[local482][local491] <= 1) {
									local470 = false;
									break;
								}
							}
						}
						if (local470) {
							local482 = local125;
							while (true) {
								if (local154 <= local482) {
									continue label220;
								}
								for (local491 = local131; local491 < local159; local491++) {
									local172 = Static156.anIntArrayArray49[local482][local491]--;
								}
								local482++;
							}
						}
					}
					if (local24.anObject6 == null || local24.anInt5072 > Static148.anInt3168 || local24.anInt5074 <= Static148.anInt3168) {
						local24.aBoolean420 = false;
						local24.anInt5110 = Static99.method1894(Static208.anInt4335, local24.anInt5109, local24.anInt5093);
						Static34.method1661(Static208.anInt4335, local24.anInt5093, local24.anInt5109, local24.anInt5110, local106 * 64 + 60 - 64, local24, local24.anInt5069, local248, local24.aBoolean421);
					} else {
						local24.aBoolean427 = false;
						local24.aBoolean420 = false;
						local24.anInt5110 = Static99.method1894(Static208.anInt4335, local24.anInt5109, local24.anInt5093);
						Static249.method3998(Static208.anInt4335, local24.anInt5093, local24.anInt5109, local24.anInt5110, local24, local24.anInt5069, local248, local24.anInt5084, local24.anInt5094, local24.anInt5101, local24.anInt5141);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method2009(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static157.method2696(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static113.method2085(local7);
			local7 = method2003(":", local7, "%3a");
			local7 = method2003("@", local7, "%40");
			local7 = method2003("&", local7, "%26");
			local7 = method2003("#", local7, "%23");
			if (Static47.aClass177_3.anApplet1 == null) {
				return;
			}
			@Pc(113) Class28 local113 = Static47.aClass177_3.method4675(new URL(Static47.aClass177_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static14.anInt349 + "&u=" + Static88.aLong249 + "&v1=" + Static282.aString282 + "&v2=" + Static282.aString284 + "&e=" + local7));
			while (local113.anInt726 == 0) {
				Static134.method2329(1L);
			}
			if (local113.anInt726 == 1) {
				@Pc(133) DataInputStream local133 = (DataInputStream) local113.anObject2;
				local133.read();
				local133.close();
			}
		} catch (@Pc(140) Exception local140) {
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIILclient!fc;IJ)Z")
	public static boolean method2010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class36 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static286.method4734(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}
}
