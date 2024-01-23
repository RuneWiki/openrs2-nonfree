import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V")
	public static void method4629() {
		if (!Static230.aBoolean290 && Static74.anInt1511 != 2) {
			try {
				Static311.method1064("tbrefresh", Static191.aClient1);
			} catch (@Pc(23) Throwable local23) {
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)I")
	public static int method4630(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local10;
		if (local10 > local23) {
			local32 = local23;
		}
		@Pc(41) double local41 = local10;
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(50) double local50 = 0.0D;
		@Pc(57) double local57 = 0.0D;
		if (local10 < local23) {
			local41 = local23;
		}
		if (local41 < local30) {
			local41 = local30;
		}
		@Pc(75) double local75 = (local41 + local32) / 2.0D;
		@Pc(80) int local80 = (int) (local75 * 256.0D);
		if (local32 != local41) {
			if (local75 < 0.5D) {
				local50 = (local41 - local32) / (local41 + local32);
			}
			if (local75 >= 0.5D) {
				local50 = (local41 - local32) / (2.0D - local32 - local41);
			}
			if (local10 == local41) {
				local57 = (local23 - local30) / (local41 - local32);
			} else if (local41 == local23) {
				local57 = (local30 - local10) / (-local32 + local41) + 2.0D;
			} else if (local30 == local41) {
				local57 = (local10 - local23) / (-local32 + local41) + 4.0D;
			}
		}
		if (local80 < 0) {
			local80 = 0;
		} else if (local80 > 255) {
			local80 = 255;
		}
		@Pc(183) int local183 = (int) (local50 * 256.0D);
		local57 /= 6.0D;
		@Pc(192) int local192 = (int) (local57 * 256.0D);
		if (local183 < 0) {
			local183 = 0;
		} else if (local183 > 255) {
			local183 = 255;
		}
		if (local80 > 243) {
			local183 >>= 0x4;
		} else if (local80 > 217) {
			local183 >>= 0x3;
		} else if (local80 > 192) {
			local183 >>= 0x2;
		} else if (local80 > 179) {
			local183 >>= 0x1;
		}
		return (local80 >> 1) + (local183 >> 5 << 7) + (local192 >> 2 << 10);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!cg;)V")
	public static void method4631(@OriginalArg(1) Class22 arg0) {
		if (Static173.aBoolean228) {
			return;
		}
		if (Static251.aBoolean330) {
			Static87.method1465();
		} else {
			Static258.method4024();
		}
		Static115.aClass4_Sub2_Sub4_4 = Static183.method2965(Static44.anInt922, arg0);
		@Pc(20) int local20 = Static292.anInt5674;
		@Pc(26) int local26 = local20 * 956 / 503;
		Static115.aClass4_Sub2_Sub4_4.method4136((Static189.anInt5672 - local26) / 2, 0, local26, local20);
		Static67.aClass58_1 = Static75.method1263(arg0, Static180.anInt3625);
		Static67.aClass58_1.method3972(Static189.anInt5672 / 2 - Static67.aClass58_1.anInt5028 / 2, 18);
		Static173.aBoolean228 = true;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!cg;B)V")
	public static void method4632(@OriginalArg(0) Class22 arg0) {
		Static42.aClass22_21 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)Lclient!pi;")
	public static Class4_Sub24 method4633() {
		@Pc(8) Class4_Sub24 local8 = new Class4_Sub24(34);
		local8.method3116(11);
		local8.method3116(Static248.anInt4872);
		local8.method3116(Static132.aBoolean168 ? 1 : 0);
		local8.method3116(Static59.aBoolean75 ? 1 : 0);
		local8.method3116(Static70.aBoolean83 ? 1 : 0);
		local8.method3116(Static226.aBoolean286 ? 1 : 0);
		local8.method3116(Static85.aBoolean102 ? 1 : 0);
		local8.method3116(Static127.aBoolean163 ? 1 : 0);
		local8.method3116(Static208.aBoolean248 ? 1 : 0);
		local8.method3116(Static114.aBoolean143 ? 1 : 0);
		local8.method3116(Static154.anInt3207);
		local8.method3116(Static253.aBoolean335 ? 1 : 0);
		local8.method3116(Static304.aBoolean404 ? 1 : 0);
		local8.method3116(Static50.aBoolean66 ? 1 : 0);
		local8.method3116(Static188.anInt5754);
		local8.method3116(Static159.aBoolean209 ? 1 : 0);
		local8.method3116(Static265.anInt5214);
		local8.method3116(Static279.anInt5471);
		local8.method3116(Static192.anInt815);
		local8.method3105(Static121.anInt2458);
		local8.method3105(Static104.anInt2103);
		local8.method3116(Static117.method1983());
		local8.method3066(Static102.anInt2018);
		local8.method3116(Static228.anInt4580);
		local8.method3116(Static209.aBoolean250 ? 1 : 0);
		local8.method3116(Static115.aBoolean148 ? 1 : 0);
		local8.method3116(Static230.anInt4613);
		local8.method3116(Static74.aBoolean87 ? 1 : 0);
		local8.method3116(Static106.aBoolean121 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!lg;IIZ)V")
	public static void method4635(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte10 == 0) {
			arg0.anInt3152 = arg0.anInt3116;
		} else if (arg0.aByte10 == 1) {
			arg0.anInt3152 = arg0.anInt3116 + (arg2 - arg0.anInt3190) / 2;
		} else if (arg0.aByte10 == 2) {
			arg0.anInt3152 = arg2 - arg0.anInt3116 - arg0.anInt3190;
		} else if (arg0.aByte10 == 3) {
			arg0.anInt3152 = arg2 * arg0.anInt3116 >> 14;
		} else if (arg0.aByte10 == 4) {
			arg0.anInt3152 = (arg2 - arg0.anInt3190) / 2 + (arg0.anInt3116 * arg2 >> 14);
		} else {
			arg0.anInt3152 = arg2 - arg0.anInt3190 - (arg0.anInt3116 * arg2 >> 14);
		}
		if (arg0.aByte9 == 0) {
			arg0.anInt3160 = arg0.anInt3117;
		} else if (arg0.aByte9 == 1) {
			arg0.anInt3160 = arg0.anInt3117 + (arg1 - arg0.anInt3201) / 2;
		} else if (arg0.aByte9 == 2) {
			arg0.anInt3160 = arg1 - arg0.anInt3201 - arg0.anInt3117;
		} else if (arg0.aByte9 == 3) {
			arg0.anInt3160 = arg0.anInt3117 * arg1 >> 14;
		} else if (arg0.aByte9 == 4) {
			arg0.anInt3160 = (arg0.anInt3117 * arg1 >> 14) + (arg1 - arg0.anInt3201) / 2;
		} else {
			arg0.anInt3160 = arg1 - (arg0.anInt3117 * arg1 >> 14) - arg0.anInt3201;
		}
		if (!Static14.aBoolean26 || Static41.method791(arg0).anInt3271 == 0 && arg0.anInt3177 != 0) {
			return;
		}
		if (arg0.anInt3160 < 0) {
			arg0.anInt3160 = 0;
		} else if (arg0.anInt3160 + arg0.anInt3201 > arg1) {
			arg0.anInt3160 = arg1 - arg0.anInt3201;
		}
		if (arg0.anInt3152 < 0) {
			arg0.anInt3152 = 0;
		} else if (arg2 < arg0.anInt3152 + arg0.anInt3190) {
			arg0.anInt3152 = arg2 - arg0.anInt3190;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!pi;)V")
	public static void method4636(@OriginalArg(1) Class4_Sub24 arg0) {
		@Pc(5) int local5 = Static273.anInt5435 >> 1;
		@Pc(19) int local19 = Static169.anInt3377 >> 2 << 10;
		@Pc(23) byte[][] local23 = new byte[Static207.anInt2141][Static158.anInt3242];
		@Pc(35) int local35;
		@Pc(129) int local129;
		@Pc(140) int local140;
		while (arg0.anInt3822 < arg0.aByteArray47.length) {
			local35 = 0;
			@Pc(37) boolean local37 = false;
			@Pc(39) int local39 = 0;
			if (arg0.method3110() == 1) {
				local35 = arg0.method3110();
				local37 = true;
				local39 = arg0.method3110();
			}
			@Pc(63) int local63 = arg0.method3110();
			@Pc(67) int local67 = arg0.method3110();
			@Pc(78) int local78 = Static133.anInt2663 + Static158.anInt3242 - local67 * 64 - 1;
			@Pc(85) int local85 = local63 * 64 - Static175.anInt3552;
			if (local85 >= 0 && local78 - 63 >= 0 && Static207.anInt2141 > local85 + 63 && Static158.anInt3242 > local78) {
				for (local129 = 0; local129 < 64; local129++) {
					@Pc(138) byte[] local138 = local23[local129 + local85];
					for (local140 = 0; local140 < 64; local140++) {
						if (!local37 || local129 >= local35 * 8 && local35 * 8 + 8 > local129 && local39 * 8 <= local140 && local39 * 8 + 8 > local140) {
							local138[local78 - local140] = arg0.method3069();
						}
					}
				}
			} else if (local37) {
				arg0.anInt3822 += 64;
			} else {
				arg0.anInt3822 += 4096;
			}
		}
		@Pc(204) int local204 = Static207.anInt2141;
		local35 = Static158.anInt3242;
		@Pc(209) int[] local209 = new int[local35];
		@Pc(212) int[] local212 = new int[local35];
		@Pc(215) int[] local215 = new int[local35];
		@Pc(218) int[] local218 = new int[local35];
		@Pc(221) int[] local221 = new int[local35];
		for (local129 = -5; local129 < local204; local129++) {
			@Pc(250) int local250;
			@Pc(318) int local318;
			for (@Pc(228) int local228 = 0; local228 < local35; local228++) {
				local140 = local129 + 5;
				@Pc(300) int local300;
				if (local140 < local204) {
					local250 = local23[local140][local228] & 0xFF;
					if (local250 > 0) {
						@Pc(264) Class118 local264 = Static151.method2396(local250 - 1);
						local209[local228] += local264.anInt3677;
						local212[local228] += local264.anInt3684;
						local215[local228] += local264.anInt3672;
						local221[local228] += local264.anInt3678;
						local300 = local218[local228]++;
					}
				}
				local250 = local129 - 5;
				if (local250 >= 0) {
					local318 = local23[local250][local228] & 0xFF;
					if (local318 > 0) {
						@Pc(328) Class118 local328 = Static151.method2396(local318 - 1);
						local209[local228] -= local328.anInt3677;
						local212[local228] -= local328.anInt3684;
						local215[local228] -= local328.anInt3672;
						local221[local228] -= local328.anInt3678;
						local300 = local218[local228]--;
					}
				}
			}
			if (local129 >= 0) {
				@Pc(381) int[][] local381 = Static280.anIntArrayArrayArray14[local129 >> 6];
				local140 = 0;
				local250 = 0;
				local318 = 0;
				@Pc(389) int local389 = 0;
				@Pc(391) int local391 = 0;
				for (@Pc(393) int local393 = -5; local393 < local35; local393++) {
					@Pc(404) int local404 = local393 - 5;
					@Pc(408) int local408 = local393 + 5;
					if (local408 < local35) {
						local140 += local209[local408];
						local391 += local218[local408];
						local318 += local215[local408];
						local389 += local221[local408];
						local250 += local212[local408];
					}
					if (local404 >= 0) {
						local250 -= local212[local404];
						local140 -= local209[local404];
						local318 -= local215[local404];
						local389 -= local221[local404];
						local391 -= local218[local404];
					}
					if (local393 >= 0 && local391 > 0) {
						@Pc(493) int[] local493 = local381[local393 >> 6];
						@Pc(514) int local514 = local389 == 0 ? 0 : Static208.method3283(local318 / local391, local140 * 256 / local389, local250 / local391);
						if (local23[local129][local393] != 0) {
							if (local493 == null) {
								local493 = local381[local393 >> 6] = new int[4096];
							}
							@Pc(559) int local559 = (local514 & 0x7F) + local5;
							if (local559 < 0) {
								local559 = 0;
							} else if (local559 > 127) {
								local559 = 127;
							}
							@Pc(588) int local588 = local559 + (local514 + local19 & 0xFC00) + (local514 & 0x380);
							local493[(local129 & 0x3F) + ((local393 & 0x3F) << 6)] = Static283.anIntArray441[Static51.method987(local588, 96)];
						} else if (local493 != null) {
							local493[(local129 & 0x3F) + ((local393 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}
}
