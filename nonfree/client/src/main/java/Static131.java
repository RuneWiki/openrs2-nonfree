import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public static int anInt2511;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
	public static int anInt2513;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString86 = "Loading config - ";

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString87 = "Opened title screen";

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public static int anInt2514 = 0;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Z")
	public static boolean aBoolean175 = false;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZZJ)V")
	public static void method2055(@OriginalArg(1) boolean arg0, @OriginalArg(2) long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (Static150.anInt2784 >= 100) {
			Static48.method843(Static100.aString56, 0, "");
			return;
		}
		@Pc(25) String local25 = Static266.method4096(arg1);
		@Pc(27) int local27;
		for (local27 = 0; local27 < Static150.anInt2784; local27++) {
			if (arg1 == Static65.aLongArray5[local27]) {
				Static48.method843(local25 + Static167.aString105, 0, "");
				return;
			}
		}
		for (local27 = 0; local27 < Static147.anInt2712; local27++) {
			if (Static207.aLongArray9[local27] == arg1) {
				Static48.method843(Static290.aString188 + local25 + Static100.aString57, 0, "");
				return;
			}
		}
		if (local25.equals(Static28.aClass6_Sub6_Sub2_1.aString147)) {
			Static48.method843(Static125.aString75, 0, "");
			return;
		}
		Static65.aLongArray5[Static150.anInt2784] = arg1;
		Static259.aStringArray29[Static150.anInt2784] = Static128.method1971(arg1);
		Static74.aBooleanArray7[Static150.anInt2784++] = arg0;
		Static145.anInt2688 = Static56.anInt1175;
		Static270.aClass1_Sub18_Sub1_3.method3130(29);
		Static270.aClass1_Sub18_Sub1_3.method3091(arg1);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!jj;)V")
	public static void method2057(@OriginalArg(1) Class1_Sub18 arg0) {
		@Pc(13) int local13 = arg0.method3117();
		Static18.aClass132Array1 = new Class132[local13];
		@Pc(18) int local18;
		for (local18 = 0; local18 < local13; local18++) {
			Static18.aClass132Array1[local18] = new Class132();
			Static18.aClass132Array1[local18].anInt3858 = arg0.method3117();
			Static18.aClass132Array1[local18].aString135 = arg0.method3111();
		}
		Static4.anInt162 = arg0.method3117();
		Static249.anInt5052 = arg0.method3117();
		Static110.anInt2065 = arg0.method3117();
		Static46.aClass152_Sub1Array2 = new Class152_Sub1[Static249.anInt5052 + 1 - Static4.anInt162];
		for (local18 = 0; local18 < Static110.anInt2065; local18++) {
			@Pc(79) int local79 = arg0.method3117();
			@Pc(87) Class152_Sub1 local87 = Static46.aClass152_Sub1Array2[local79] = new Class152_Sub1();
			local87.anInt5077 = arg0.method3122();
			local87.anInt5072 = arg0.method3074();
			local87.anInt5090 = Static4.anInt162 + local79;
			local87.aString172 = arg0.method3111();
			local87.aString171 = arg0.method3111();
		}
		Static166.anInt3065 = arg0.method3074();
		Static103.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)V")
	public static void method2058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class1_Sub2_Sub11 local4 = Static163.method3579(5, arg0);
		local4.method1859();
		local4.anInt2282 = arg1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILclient!qm;B)V")
	public static void method2059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub6_Sub2 arg2) {
		@Pc(12) int local12;
		if ((arg1 & 0x40) != 0) {
			local12 = Static63.aClass1_Sub18_Sub1_1.method3057();
			@Pc(15) byte[] local15 = new byte[local12];
			@Pc(20) Class1_Sub18 local20 = new Class1_Sub18(local15);
			Static63.aClass1_Sub18_Sub1_1.method3095(local15, local12);
			Static130.aClass1_Sub18Array1[arg0] = local20;
			arg2.method3516(local20);
		}
		@Pc(140) int local140;
		@Pc(53) int local53;
		if ((arg1 & 0x100) != 0) {
			local12 = Static63.aClass1_Sub18_Sub1_1.method3118();
			if (local12 == 65535) {
				local12 = -1;
			}
			local53 = Static63.aClass1_Sub18_Sub1_1.method3074();
			@Pc(55) boolean local55 = true;
			if (local12 != -1 && arg2.anInt4580 != -1 && Static262.method4031(Static280.method4295(local12).anInt838).anInt4013 < Static262.method4031(Static280.method4295(arg2.anInt4580).anInt838).anInt4013) {
				local55 = false;
			}
			if (local55) {
				arg2.anInt4525 = 0;
				arg2.anInt4571 = 1;
				arg2.anInt4548 = (local53 & 0xFFFF) + Static261.anInt5259;
				arg2.anInt4578 = 0;
				if (arg2.anInt4548 > Static261.anInt5259) {
					arg2.anInt4578 = -1;
				}
				arg2.anInt4580 = local12;
				arg2.anInt4520 = local53 >> 16;
				if (arg2.anInt4580 != -1 && arg2.anInt4548 == Static261.anInt5259) {
					local140 = Static280.method4295(arg2.anInt4580).anInt838;
					if (local140 != -1) {
						@Pc(148) Class133 local148 = Static262.method4031(local140);
						if (local148 != null && local148.anIntArray461 != null) {
							Static128.method1976(arg2 == Static28.aClass6_Sub6_Sub2_1, local148, arg2.anInt4569, 0, arg2.anInt4562);
						}
					}
				}
			}
		}
		if ((arg1 & 0x400) != 0) {
			local12 = Static63.aClass1_Sub18_Sub1_1.method3057();
			@Pc(180) int[] local180 = new int[local12];
			@Pc(183) int[] local183 = new int[local12];
			@Pc(186) int[] local186 = new int[local12];
			for (@Pc(188) int local188 = 0; local188 < local12; local188++) {
				@Pc(199) int local199 = Static63.aClass1_Sub18_Sub1_1.method3062();
				if (local199 == 65535) {
					local199 = -1;
				}
				local186[local188] = local199;
				local180[local188] = Static63.aClass1_Sub18_Sub1_1.method3122();
				local183[local188] = Static63.aClass1_Sub18_Sub1_1.method3062();
			}
			Static143.method2251(arg2, local183, local180, local186);
		}
		if ((arg1 & 0x2) != 0) {
			local12 = Static63.aClass1_Sub18_Sub1_1.method3103();
			local53 = Static63.aClass1_Sub18_Sub1_1.method3084();
			@Pc(253) boolean local253 = (local12 & 0x8000) != 0;
			@Pc(257) int local257 = Static63.aClass1_Sub18_Sub1_1.method3084();
			local140 = Static63.aClass1_Sub18_Sub1_1.anInt3911;
			if (arg2.aString147 != null && arg2.aClass149_2 != null) {
				@Pc(273) long local273 = Static136.method2158(arg2.aString147);
				@Pc(275) boolean local275 = false;
				if (local53 <= 1) {
					if (!local253 && (Static146.aBoolean190 && !Static155.aBoolean216 || Static49.aBoolean89)) {
						local275 = true;
					} else {
						for (@Pc(292) int local292 = 0; local292 < Static150.anInt2784; local292++) {
							if (Static65.aLongArray5[local292] == local273) {
								local275 = true;
								break;
							}
						}
					}
				}
				if (!local275 && Static56.anInt1180 == 0) {
					Static260.aClass1_Sub18_7.anInt3911 = 0;
					Static63.aClass1_Sub18_Sub1_1.method3090(Static260.aClass1_Sub18_7.aByteArray71, local257);
					Static260.aClass1_Sub18_7.anInt3911 = 0;
					@Pc(331) int local331 = -1;
					@Pc(350) String local350;
					if (local253) {
						local12 &= 0x7FFF;
						@Pc(341) Class82 local341 = Static130.method2053(Static260.aClass1_Sub18_7);
						local331 = local341.anInt2376;
						local350 = local341.aClass1_Sub2_Sub18_1.method3997(Static260.aClass1_Sub18_7);
					} else {
						local350 = Static142.method4376(Static199.method3038(Static134.method2138(Static260.aClass1_Sub18_7)));
					}
					arg2.aString145 = local350.trim();
					arg2.anInt4521 = local12 & 0xFF;
					arg2.anInt4529 = local12 >> 8;
					arg2.anInt4563 = 150;
					if (local53 == 2) {
						Static92.method1524(local350, local253 ? 17 : 1, "<img=1>" + arg2.method3517(), null, local331);
					} else if (local53 == 1) {
						Static92.method1524(local350, local253 ? 17 : 1, "<img=0>" + arg2.method3517(), null, local331);
					} else {
						Static92.method1524(local350, local253 ? 17 : 2, arg2.method3517(), null, local331);
					}
				}
			}
			Static63.aClass1_Sub18_Sub1_1.anInt3911 = local140 + local257;
		}
		if ((arg1 & 0x10) != 0) {
			local12 = Static63.aClass1_Sub18_Sub1_1.method3117();
			local53 = Static63.aClass1_Sub18_Sub1_1.method3057();
			arg2.method3507(local53, local12, Static261.anInt5259);
			arg2.anInt4502 = Static261.anInt5259 + 300;
			arg2.anInt4536 = Static63.aClass1_Sub18_Sub1_1.method3057();
		}
		if ((arg1 & 0x80) != 0) {
			arg2.anInt4552 = Static63.aClass1_Sub18_Sub1_1.method3103();
			arg2.anInt4517 = Static63.aClass1_Sub18_Sub1_1.method3103();
		}
		if ((arg1 & 0x200) != 0) {
			local12 = Static63.aClass1_Sub18_Sub1_1.method3117();
			local53 = Static63.aClass1_Sub18_Sub1_1.method3057();
			arg2.method3507(local53, local12, Static261.anInt5259);
		}
		if ((arg1 & 0x20) != 0) {
			local12 = Static63.aClass1_Sub18_Sub1_1.method3103();
			local53 = Static63.aClass1_Sub18_Sub1_1.method3084();
			if (local12 == 65535) {
				local12 = -1;
			}
			Static164.method2494(local12, local53, arg2);
		}
		if ((arg1 & 0x800) != 0) {
			arg2.anInt4553 = Static63.aClass1_Sub18_Sub1_1.method3057();
			arg2.anInt4537 = Static63.aClass1_Sub18_Sub1_1.method3122();
			arg2.anInt4566 = Static63.aClass1_Sub18_Sub1_1.method3099();
			arg2.anInt4501 = Static63.aClass1_Sub18_Sub1_1.method3122();
			arg2.anInt4515 = Static63.aClass1_Sub18_Sub1_1.method3118() + Static261.anInt5259;
			arg2.anInt4559 = Static63.aClass1_Sub18_Sub1_1.method3118() + Static261.anInt5259;
			arg2.anInt4524 = Static63.aClass1_Sub18_Sub1_1.method3122();
			arg2.anInt4558 = 1;
			arg2.anInt4581 = 0;
		}
		if ((arg1 & 0x1) != 0) {
			arg2.anInt4513 = Static63.aClass1_Sub18_Sub1_1.method3062();
			if (arg2.anInt4513 == 65535) {
				arg2.anInt4513 = -1;
			}
		}
		if ((arg1 & 0x8) == 0) {
			return;
		}
		arg2.aString145 = Static63.aClass1_Sub18_Sub1_1.method3101();
		if (arg2.aString145.charAt(0) == '~') {
			arg2.aString145 = arg2.aString145.substring(1);
			Static48.method843(arg2.aString145, 2, arg2.method3517());
		} else if (arg2 == Static28.aClass6_Sub6_Sub2_1) {
			Static48.method843(arg2.aString145, 2, arg2.method3517());
		}
		arg2.anInt4521 = 0;
		arg2.anInt4563 = 150;
		arg2.anInt4529 = 0;
	}
}
