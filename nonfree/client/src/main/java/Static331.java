import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!fk;")
	public static Class71 aClass71_8;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "[Lclient!ma;")
	public static Class32_Sub3_Sub1_Sub1[] aClass32_Sub3_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Z")
	public static boolean aBoolean537 = false;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_60 = new Class109(64);

	@OriginalMember(owner = "client!va", name = "B", descriptor = "I")
	public static int anInt6418 = -1;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public static void method5731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) Class32_Sub6 local7 = new Class32_Sub6();
		local7.anInt5561 = arg0;
		local7.anInt5567 = arg5 + Static283.anInt5563;
		local7.anInt5560 = arg1;
		local7.anInt5565 = arg4;
		local7.aString54 = arg3;
		local7.anInt5568 = arg2;
		Static155.aClass39_4.method809(local7);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZIIIZJLjava/lang/String;ILjava/lang/String;Z)V")
	public static void method5732(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) long arg6, @OriginalArg(7) String arg7, @OriginalArg(9) String arg8, @OriginalArg(10) boolean arg9) {
		@Pc(11) int[] local11 = new int[4];
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			local11[local13] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(32) Class5_Sub12 local32 = new Class5_Sub12(128);
		local32.method5089(10);
		local32.method5084((arg1 ? 4 : 0) | (arg5 ? 1 : 0) | (arg9 ? 2 : 0));
		local32.method5065(arg6);
		local32.method5070(local11[0]);
		local32.method5094(arg7);
		local32.method5070(local11[1]);
		local32.method5084(Static16.anInt331);
		local32.method5089(arg4);
		local32.method5089(arg2);
		local32.method5070(local11[2]);
		local32.method5084(arg0);
		local32.method5084(arg3);
		local32.method5070(local11[3]);
		local32.method5078(Static304.aBigInteger5, Static292.aBigInteger4);
		@Pc(122) Class5_Sub12 local122 = new Class5_Sub12(350);
		local122.method5094(arg8);
		@Pc(134) int local134 = 8 - Static56.method878(arg8) % 8;
		for (@Pc(136) int local136 = 0; local136 < local134; local136++) {
			local122.method5089((int) (Math.random() * 255.0D));
		}
		local122.method5081(local11);
		Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
		Static125.aClass5_Sub12_Sub2_3.method5089(22);
		Static125.aClass5_Sub12_Sub2_3.method5084(local122.anInt5731 + local32.anInt5731 + 2);
		Static125.aClass5_Sub12_Sub2_3.method5084(565);
		Static125.aClass5_Sub12_Sub2_3.method5110(local32.anInt5731, local32.aByteArray90);
		Static125.aClass5_Sub12_Sub2_3.method5110(local122.anInt5731, local122.aByteArray90);
		Static350.anInt6718 = 1;
		Static41.anInt725 = 0;
		Static18.anInt359 = 0;
		Static8.anInt187 = -3;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!of;II)V")
	public static void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub5_Sub2_Sub1 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x4) != 0) {
			arg1.anInt5362 = Static187.aClass5_Sub12_Sub2_4.method5106();
			if (arg1.anInt5362 == 65535) {
				arg1.anInt5362 = -1;
			}
		}
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(73) int local73;
		@Pc(188) int local188;
		if ((arg2 & 0x1000) != 0) {
			local29 = Static187.aClass5_Sub12_Sub2_4.method5113();
			local33 = Static187.aClass5_Sub12_Sub2_4.method5097();
			if (local29 == 65535) {
				local29 = -1;
			}
			@Pc(42) boolean local42 = true;
			@Pc(70) Class89 local70;
			if (local29 != -1 && arg1.anInt5398 != -1) {
				@Pc(57) Class163 local57;
				if (local29 == arg1.anInt5398) {
					local57 = Static325.method5628(local29);
					if (local57.aBoolean418 && local57.anInt5031 != -1) {
						local70 = Static162.method2849(local57.anInt5031);
						local73 = local70.anInt2468;
						if (local73 == 0) {
							local42 = false;
						} else if (local73 == 1) {
							local42 = true;
						} else if (local73 == 2) {
							arg1.anInt5353 = 0;
							local42 = false;
						}
					}
				} else {
					local57 = Static325.method5628(local29);
					@Pc(110) Class163 local110 = Static325.method5628(arg1.anInt5398);
					if (local57.anInt5031 != -1 && local110.anInt5031 != -1) {
						@Pc(125) Class89 local125 = Static162.method2849(local57.anInt5031);
						@Pc(130) Class89 local130 = Static162.method2849(local110.anInt5031);
						if (local125.anInt2465 < local130.anInt2465) {
							local42 = false;
						}
					}
				}
			}
			if (local42) {
				arg1.anInt5395 = Static283.anInt5563 + (local33 & 0xFFFF);
				arg1.anInt5369 = 1;
				arg1.anInt5404 = 0;
				arg1.anInt5373 = local33 >> 16;
				arg1.anInt5358 = 0;
				arg1.anInt5398 = local29;
				if (arg1.anInt5395 > Static283.anInt5563) {
					arg1.anInt5404 = -1;
				}
				if (arg1.anInt5398 != -1 && Static283.anInt5563 == arg1.anInt5395) {
					local188 = Static325.method5628(arg1.anInt5398).anInt5031;
					if (local188 != -1) {
						local70 = Static162.method2849(local188);
						if (local70 != null && local70.anIntArray245 != null) {
							Static311.method3258(local70, arg1.anInt6631, arg1 == Static192.aClass4_Sub5_Sub2_Sub1_2, 0, arg1.anInt6632);
						}
					}
				}
			}
		}
		if ((arg2 & 0x1) != 0) {
			local29 = Static187.aClass5_Sub12_Sub2_4.method5060();
			local33 = Static187.aClass5_Sub12_Sub2_4.method5068();
			arg1.method4809(Static283.anInt5563, local33, local29);
			arg1.anInt5359 = Static283.anInt5563 + 300;
			arg1.anInt5376 = Static187.aClass5_Sub12_Sub2_4.method5068();
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt5387 = Static187.aClass5_Sub12_Sub2_4.method5068();
			arg1.anInt5403 = Static187.aClass5_Sub12_Sub2_4.method5115();
			arg1.anInt5391 = Static187.aClass5_Sub12_Sub2_4.method5101();
			arg1.anInt5407 = Static187.aClass5_Sub12_Sub2_4.method5115();
			arg1.anInt5390 = Static187.aClass5_Sub12_Sub2_4.method5106() + Static283.anInt5563;
			arg1.anInt5377 = Static187.aClass5_Sub12_Sub2_4.method5113() + Static283.anInt5563;
			arg1.anInt5397 = Static187.aClass5_Sub12_Sub2_4.method5068();
			arg1.anInt5413 = 1;
			arg1.anInt5419 = 0;
		}
		@Pc(311) int local311;
		if ((arg2 & 0x40) != 0) {
			local29 = Static187.aClass5_Sub12_Sub2_4.method5113();
			local33 = Static187.aClass5_Sub12_Sub2_4.method5086();
			local311 = Static187.aClass5_Sub12_Sub2_4.method5101();
			local188 = Static187.aClass5_Sub12_Sub2_4.anInt5731;
			@Pc(325) boolean local325 = (local29 & 0x8000) != 0;
			if (arg1.aString40 != null && arg1.aClass31_2 != null) {
				@Pc(333) boolean local333 = false;
				if (local33 <= 1) {
					if (!local325 && (Static230.aBoolean377 && !Static312.aBoolean510 || Static14.aBoolean26)) {
						local333 = true;
					} else if (Static241.method4300(arg1.aString40)) {
						local333 = true;
					}
				}
				if (!local333 && Static169.anInt6215 == 0) {
					Static78.aClass5_Sub12_2.anInt5731 = 0;
					Static187.aClass5_Sub12_Sub2_4.method5109(local311, Static78.aClass5_Sub12_2.aByteArray90);
					Static78.aClass5_Sub12_2.anInt5731 = 0;
					@Pc(374) int local374 = -1;
					@Pc(393) String local393;
					if (local325) {
						local29 &= 0x7FFF;
						@Pc(384) Class38 local384 = Static51.method832(Static78.aClass5_Sub12_2);
						local374 = local384.anInt746;
						local393 = local384.aClass5_Sub1_Sub18_1.method5349(Static78.aClass5_Sub12_2);
					} else {
						local393 = Static34.method568(Static230.method4147(Static166.method3024(Static78.aClass5_Sub12_2)));
					}
					arg1.aString53 = local393.trim();
					arg1.anInt5355 = local29 >> 8;
					arg1.anInt5394 = local29 & 0xFF;
					arg1.anInt5368 = 150;
					@Pc(434) int local434;
					if (local33 == 1 || local33 == 2) {
						local434 = local325 ? 17 : 1;
					} else {
						local434 = local325 ? 17 : 2;
					}
					if (local33 == 2) {
						Static7.method123("<img=1>" + arg1.method4121(), local374, 0, null, local434, local393, "<img=1>" + arg1.method4120());
					} else if (local33 == 1) {
						Static7.method123("<img=0>" + arg1.method4121(), local374, 0, null, local434, local393, "<img=0>" + arg1.method4120());
					} else {
						Static7.method123(arg1.method4121(), local374, 0, null, local434, local393, arg1.method4120());
					}
				}
			}
			Static187.aClass5_Sub12_Sub2_4.anInt5731 = local311 + local188;
		}
		if ((arg2 & 0x200) != 0) {
			local29 = Static187.aClass5_Sub12_Sub2_4.method5075();
			arg1.anInt5375 = Static187.aClass5_Sub12_Sub2_4.method5068();
			arg1.anInt5352 = Static187.aClass5_Sub12_Sub2_4.method5101();
			arg1.anInt5379 = local29 & 0x7FFF;
			arg1.aBoolean448 = (local29 & 0x8000) != 0;
			arg1.anInt5393 = arg1.anInt5379 + Static283.anInt5563 + arg1.anInt5375;
		}
		if ((arg2 & 0x100) != 0) {
			local33 = Static187.aClass5_Sub12_Sub2_4.method5060();
			local311 = Static187.aClass5_Sub12_Sub2_4.method5101();
			arg1.method4809(Static283.anInt5563, local311, local33);
		}
		if ((arg2 & 0x80) != 0) {
			local33 = Static187.aClass5_Sub12_Sub2_4.method5086();
			@Pc(616) byte[] local616 = new byte[local33];
			@Pc(621) Class5_Sub12 local621 = new Class5_Sub12(local616);
			Static187.aClass5_Sub12_Sub2_4.method5058(local33, local616);
			Static160.aClass5_Sub12Array1[arg0] = local621;
			arg1.method4124(local621);
		}
		if ((arg2 & 0x800) != 0) {
			local33 = Static187.aClass5_Sub12_Sub2_4.method5101();
			@Pc(646) int[] local646 = new int[local33];
			@Pc(649) int[] local649 = new int[local33];
			@Pc(652) int[] local652 = new int[local33];
			for (local73 = 0; local73 < local33; local73++) {
				@Pc(660) int local660 = Static187.aClass5_Sub12_Sub2_4.method5113();
				if (local660 == 65535) {
					local660 = -1;
				}
				local646[local73] = local660;
				local649[local73] = Static187.aClass5_Sub12_Sub2_4.method5068();
				local652[local73] = Static187.aClass5_Sub12_Sub2_4.method5113();
			}
			Static262.method4619(local649, arg1, local652, local646);
		}
		if ((arg2 & 0x2) != 0) {
			local33 = Static187.aClass5_Sub12_Sub2_4.method5106();
			if (local33 == 65535) {
				local33 = -1;
			}
			local311 = Static187.aClass5_Sub12_Sub2_4.method5068();
			Static77.method1413(local311, arg1, local33);
		}
		if ((arg2 & 0x20) != 0) {
			arg1.aString53 = Static187.aClass5_Sub12_Sub2_4.method5064();
			if (arg1.aString53.charAt(0) == '~') {
				arg1.aString53 = arg1.aString53.substring(1);
				Static63.method4635(arg1.method4121(), 2, arg1.aString53, arg1.method4120(), 0);
			} else if (arg1 == Static192.aClass4_Sub5_Sub2_Sub1_2) {
				Static63.method4635(arg1.method4121(), 2, arg1.aString53, arg1.method4120(), 0);
			}
			arg1.anInt5368 = 150;
			arg1.anInt5355 = 0;
			arg1.anInt5394 = 0;
		}
		if ((arg2 & 0x8) != 0) {
			arg1.anInt5378 = Static187.aClass5_Sub12_Sub2_4.method5106();
			arg1.anInt5380 = Static187.aClass5_Sub12_Sub2_4.method5075();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ij;Lclient!ij;B)V")
	public static void method5734(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		Static60.aClass93_39 = arg1;
		Static120.aClass93_48 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)I")
	public static int method5735(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
	public static int method5737(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
