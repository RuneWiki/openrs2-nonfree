import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!jn;")
	public static Class176 aClass176_6;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Lclient!jn;")
	public static Class176 aClass176_7;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_2 = new Class162(5, 3);

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	public static int anInt226 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
	public static void method176() {
		for (@Pc(1) int local1 = 0; local1 < Static523.anInt9351; local1++) {
			if (!Static54.aBooleanArray3[local1]) {
				@Pc(10) Class177 local10 = Static485.aClass177Array1[local1];
				@Pc(13) Class4_Sub24 local13 = local10.aClass4_Sub24_1;
				@Pc(16) int local16 = local10.anInt4590;
				@Pc(22) int local22 = local13.method7151() - Static96.anInt8036;
				@Pc(30) int local30 = (local22 * 2 >> Static145.anInt3093) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method7145() - local22 >> Static145.anInt3093;
				@Pc(53) int local53 = local13.method7142() - local22 >> Static145.anInt3093;
				@Pc(61) int local61 = local13.method7142() + local22 >> Static145.anInt3093;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static253.anInt4651) {
					local61 = Static253.anInt4651 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray57[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static182.anInt3633) {
						local108 = Static182.anInt3633 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class1_Sub4_Sub2 local141 = Static397.method6277(local16, local125, local78, na.class);
						if (local141 != null && local141.aByte128 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte128 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray57[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray57[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray57[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray57[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static54.aBooleanArray3[local1] = true;
				Static499.aClass83Array3[local16].method7211(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!n;IZ)V")
	public static void method177(@OriginalArg(0) int arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) int arg2) {
		if (Static418.aBoolean541) {
			@Pc(17) Class106 local17 = Static52.anInt768 == -1 ? null : Static484.aClass313_2.method7381(Static52.anInt768);
			if (Static69.method1180(arg1).method124() && (Static163.anInt3317 & 0x20) != 0 && (local17 == null || arg1.method5523(Static52.anInt768, local17.anInt3103) != local17.anInt3103)) {
				Static369.method5938(0L, 3, false, arg1.anInt6527, Static397.anInt7611, arg1.anInt6555, Static152.aString28, arg1.anInt6565, true, Static551.aString95 + " -> " + arg1.aString65);
			}
		}
		@Pc(75) String local75;
		for (@Pc(68) int local68 = 9; local68 >= 5; local68--) {
			local75 = Static468.method2271(local68, arg1);
			if (local75 != null) {
				Static369.method5938((long) (local68 + 1), 1007, false, arg1.anInt6527, Static155.method2875(local68, arg1), arg1.anInt6555, local75, arg1.anInt6565, true, arg1.aString65);
			}
		}
		local75 = Static327.method5372(arg1);
		if (local75 != null) {
			Static369.method5938(0L, 19, false, arg1.anInt6527, arg1.anInt6550, arg1.anInt6555, local75, arg1.anInt6565, true, arg1.aString65);
		}
		for (@Pc(138) int local138 = 4; local138 >= 0; local138--) {
			@Pc(150) String local150 = Static468.method2271(local138, arg1);
			if (local150 != null) {
				Static369.method5938((long) (local138 + 1), 59, false, arg1.anInt6527, Static155.method2875(local138, arg1), arg1.anInt6555, local150, arg1.anInt6565, true, arg1.aString65);
			}
		}
		if (!Static69.method1180(arg1).method125()) {
			return;
		}
		if (arg1.aString63 == null) {
			Static369.method5938(0L, 11, false, arg1.anInt6527, -1, arg1.anInt6555, Static590.aClass364_13.method8334(Static154.anInt3181), arg1.anInt6565, true, "");
		} else {
			Static369.method5938(0L, 11, false, arg1.anInt6527, -1, arg1.anInt6555, arg1.aString63, arg1.anInt6565, true, "");
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBLclient!vc;Lclient!r;Lclient!ff;I)Z")
	public static boolean method178(@OriginalArg(2) Class338 arg0, @OriginalArg(3) Class44 arg1, @OriginalArg(4) Class4_Sub17 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray522 != null) {
			local9 = (arg0.anInt9753 + arg2.anInt2870 - Static455.anInt3446) * (Static455.anInt3444 - Static455.anInt3441) / (Static455.anInt3451 - Static455.anInt3446) + Static455.anInt3441;
			local11 = Static455.anInt3449 - (arg0.anInt9763 + arg2.anInt2869 - Static455.anInt3443) * (Static455.anInt3449 - Static455.anInt3447) / (Static455.anInt3440 - Static455.anInt3443);
			local13 = Static455.anInt3449 - (Static455.anInt3449 - Static455.anInt3447) * (arg0.anInt9746 + arg2.anInt2869 - Static455.anInt3443) / (Static455.anInt3440 - Static455.anInt3443);
			local7 = (arg0.anInt9768 + arg2.anInt2870 - Static455.anInt3446) * (Static455.anInt3444 - Static455.anInt3441) / (Static455.anInt3451 - Static455.anInt3446) + Static455.anInt3441;
		}
		@Pc(100) Class78 local100 = null;
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		if (arg0.anInt9756 != -1) {
			if (arg2.aBoolean214 && arg0.anInt9771 != -1) {
				local100 = arg0.method7970(true, arg1);
			} else {
				local100 = arg0.method7970(false, arg1);
			}
			if (local100 != null) {
				local102 = arg2.anInt2871 - (local100.A() + 1 >> 1);
				local104 = arg2.anInt2871 + (local100.A() + 1 >> 1);
				if (local7 > local102) {
					local7 = local102;
				}
				local106 = arg2.anInt2868 - (local100.ca() + 1 >> 1);
				if (local9 < local104) {
					local9 = local104;
				}
				local108 = arg2.anInt2868 + (local100.ca() + 1 >> 1);
				if (local11 > local106) {
					local11 = local106;
				}
				if (local108 > local13) {
					local13 = local108;
				}
			}
		}
		@Pc(206) Class183 local206 = null;
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(278) int local278;
		@Pc(301) int local301;
		if (arg0.aString92 != null) {
			local206 = Static209.method3501(arg0.anInt9762);
			if (local206 != null) {
				local208 = Static211.aClass114_7.method2947(arg0.aString92, Static283.aStringArray73, null, null);
				local210 = arg2.anInt2868;
				if (local100 == null) {
					local210 -= local206.method4390() * local208 / 2;
				} else {
					local210 -= (local100.ca() >> 1) + (local206.method4386() * local208);
				}
				for (local278 = 0; local278 < local208; local278++) {
					@Pc(284) String local284 = Static283.aStringArray73[local278];
					if (local278 < local208 - 1) {
						local284 = local284.substring(0, local284.length() - 4);
					}
					local301 = local206.method4392(local284);
					if (local301 > local212) {
						local212 = local301;
					}
				}
				local214 = arg2.anInt2871 - local212 / 2;
				local216 = local212 / 2 + arg2.anInt2871;
				if (local7 > local214) {
					local7 = local214;
				}
				if (local216 > local9) {
					local9 = local216;
				}
				local226 = local210;
				local228 = local208 * local206.method4386() + local210;
				if (local226 < local11) {
					local11 = local226;
				}
				if (local228 > local13) {
					local13 = local228;
				}
			}
		}
		if (Static455.anInt3441 > local9 || Static455.anInt3444 < local7 || Static455.anInt3447 > local13 || Static455.anInt3449 < local11) {
			return true;
		}
		@Pc(415) int local415;
		if (arg0.anIntArray522 != null) {
			@Pc(413) int[] local413 = new int[arg0.anIntArray522.length];
			for (local415 = 0; local415 < local413.length / 2; local415++) {
				local301 = arg2.anInt2870 + arg0.anIntArray522[local415 * 2];
				@Pc(440) int local440 = arg0.anIntArray522[local415 * 2 + 1] + arg2.anInt2869;
				local413[local415 * 2] = Static455.anInt3441 + (Static455.anInt3444 - Static455.anInt3441) * (local301 + -Static455.anInt3446) / (Static455.anInt3451 - Static455.anInt3446);
				local413[local415 * 2 + 1] = Static455.anInt3449 - (Static455.anInt3449 - Static455.anInt3447) * (-Static455.anInt3443 + local440) / (Static455.anInt3440 - Static455.anInt3443);
			}
			Static64.method1028(arg1, local413, arg0.anInt9749);
			for (local301 = 0; local301 < local413.length / 2 - 1; local301++) {
				arg1.method5040(arg0.anInt9743, local413[(local301 + 1) * 2], local413[local301 * 2 + 1], local413[local301 * 2], local413[local301 * 2 + 3]);
			}
			arg1.method5040(arg0.anInt9743, local413[0], local413[local413.length - 1], local413[local413.length - 2], local413[1]);
		}
		if (local100 != null) {
			if (Static77.anInt1283 > 0 && (Static257.anInt4733 != -1 && arg2.anInt2866 == Static257.anInt4733 || Static387.anInt7402 != -1 && arg0.anInt9770 == Static387.anInt7402)) {
				if (Static425.anInt7984 > 50) {
					local278 = (100 - Static425.anInt7984) * 2;
				} else {
					local278 = Static425.anInt7984 * 2;
				}
				local415 = local278 << 24 | 0xFFFF00;
				arg1.method4971(arg2.anInt2868, arg2.anInt2871, local100.E() / 2 + 7, local415);
				arg1.method4971(arg2.anInt2868, arg2.anInt2871, local100.E() / 2 + 5, local415);
				arg1.method4971(arg2.anInt2868, arg2.anInt2871, local100.E() / 2 + 3, local415);
				arg1.method4971(arg2.anInt2868, arg2.anInt2871, local100.E() / 2 + 1, local415);
				arg1.method4971(arg2.anInt2868, arg2.anInt2871, local100.E() / 2, local415);
			}
			local100.method8185(arg2.anInt2871 - (local100.A() >> 1), arg2.anInt2868 + -(local100.ca() >> 1));
		}
		if (arg0.aString92 != null && local206 != null) {
			Static162.method2965(local212, local210, local208, local206, arg2, arg0, arg1);
		}
		if (arg0.anInt9756 != -1 || arg0.aString92 != null) {
			@Pc(732) Class4_Sub32 local732 = new Class4_Sub32(arg2);
			local732.anInt7363 = local104;
			local732.anInt7361 = local226;
			local732.anInt7364 = local108;
			local732.anInt7356 = local214;
			local732.anInt7362 = local216;
			local732.anInt7357 = local106;
			local732.anInt7359 = local102;
			local732.anInt7360 = local228;
			Static264.aClass244_39.method5960(local732);
		}
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method179() {
		Static518.method7586(Static214.aClass4_Sub19_Sub1_1.aBoolean254);
		Static43.aClass80_1 = Static295.method8179(Static406.aClass354_5, 22050, 0, Static475.aCanvas12);
		Static24.method317(Static265.method4455(null));
		Static269.aClass80_3 = Static295.method8179(Static406.aClass354_5, 2048, 1, Static475.aCanvas12);
		Static444.aClass4_Sub7_Sub1_2 = new Class4_Sub7_Sub1();
		Static269.aClass80_3.method5607(Static444.aClass4_Sub7_Sub1_2);
		Static46.aClass260_1 = new Class260(22050, Static262.anInt5047);
		Static532.anInt9483 = Static55.aClass176_104.method3998("scape main");
		Static115.method2466();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!r;III)V")
	public static void method181(@OriginalArg(1) int arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.da(arg3, arg4, arg3 + arg2, arg4 + arg0);
		arg1.method5006(arg3, arg2, arg4, -16777216, arg0);
		if (Static312.anInt6205 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static455.anInt3442 / (float) Static455.anInt3445;
		@Pc(37) int local37 = arg2;
		@Pc(39) int local39 = arg0;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg2 * local35);
		} else {
			local37 = (int) ((float) arg0 / local35);
		}
		@Pc(66) int local66 = arg4 + (arg0 - local39) / 2;
		@Pc(75) int local75 = arg3 + (arg2 - local37) / 2;
		if (Static159.aClass78_6 == null || arg2 != Static159.aClass78_6.E() || arg0 != Static159.aClass78_6.u()) {
			Static455.method3069(Static455.anInt3448, Static455.anInt3442 + Static455.anInt3450, Static455.anInt3445 + Static455.anInt3448, Static455.anInt3450, local75, local66, local37 + local75, local39 + local66);
			Static455.method3075(arg1);
			Static159.aClass78_6 = arg1.method4964(local75, local66, local37, local39, false);
		}
		Static159.aClass78_6.method8185(local75, local66);
		@Pc(137) int local137 = Static3.anInt140 * local37 / Static455.anInt3445;
		@Pc(143) int local143 = Static85.anInt1574 * local39 / Static455.anInt3442;
		@Pc(151) int local151 = local75 + local37 * Static47.anInt646 / Static455.anInt3445;
		@Pc(165) int local165 = local39 + local66 - local143 - local39 * Static34.anInt506 / Static455.anInt3442;
		@Pc(167) int local167 = -1996554240;
		if (Static438.aClass92_4 == Static264.aClass92_3) {
			local167 = -1996488705;
		}
		arg1.J(local151, local165, local137, local143, local167, 1);
		arg1.method4996(local151, local165, local137, local143, local167, 0);
		if (Static77.anInt1283 <= 0) {
			return;
		}
		@Pc(203) int local203;
		if (Static425.anInt7984 > 50) {
			local203 = 500 - Static425.anInt7984 * 5;
		} else {
			local203 = Static425.anInt7984 * 5;
		}
		for (@Pc(214) Class4_Sub17 local214 = (Class4_Sub17) Static455.aClass244_24.method5963(); local214 != null; local214 = (Class4_Sub17) Static455.aClass244_24.method5965()) {
			@Pc(224) Class338 local224 = Static455.aClass142_2.method3366(local214.anInt2866);
			if (Static333.method5935(local224)) {
				@Pc(247) int local247;
				@Pc(260) int local260;
				if (Static257.anInt4733 == local214.anInt2866) {
					local247 = local75 + local37 * local214.anInt2870 / Static455.anInt3445;
					local260 = local66 + (Static455.anInt3442 - local214.anInt2869) * local39 / Static455.anInt3442;
					arg1.method5006(local247 - 2, 4, local260 - 2, local203 << 24 | 0xFFFF00, 4);
				} else if (Static387.anInt7402 != -1 && Static387.anInt7402 == local224.anInt9770) {
					local247 = local75 + local214.anInt2870 * local37 / Static455.anInt3445;
					local260 = local39 * (Static455.anInt3442 - local214.anInt2869) / Static455.anInt3442 + local66;
					arg1.method5006(local247 - 2, 4, local260 - 2, local203 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZILjava/lang/String;)V")
	public static void method182(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			label701: {
				if (!arg2.equalsIgnoreCase("commands") && !arg2.equalsIgnoreCase("help")) {
					if (arg2.equalsIgnoreCase("cls")) {
						Static295.anInt10019 = 0;
						Static282.anInt4641 = 0;
						return;
					}
					if (arg2.equalsIgnoreCase("displayfps")) {
						Static397.aBoolean521 = !Static397.aBoolean521;
						if (!Static397.aBoolean521) {
							Static82.method1376("FPS off");
							return;
						}
						Static82.method1376("FPS on");
						return;
					}
					if (!arg2.equals("renderer")) {
						if (arg2.equals("heap")) {
							Static82.method1376("Heap: " + Static577.anInt10067 + "MB");
							return;
						}
						break label701;
					}
					@Pc(71) Class155 local71 = Static440.aClass44_12.method4985();
					Static82.method1376("Vendor: " + local71.anInt4016);
					Static82.method1376("Name: " + local71.aString43);
					Static82.method1376("Version: " + local71.anInt4015);
					Static82.method1376("Device: " + local71.aString42);
					Static82.method1376("Driver Version: " + local71.aLong119);
					return;
				}
				Static82.method1376("commands - This command");
				Static82.method1376("cls - Clear console");
				Static82.method1376("displayfps - Toggle FPS and other information");
				Static82.method1376("renderer - Print graphics renderer information");
				Static82.method1376("heap - Print java memory information");
				return;
			}
		} catch (@Pc(139) Exception local139) {
			Static82.method1376(Static590.aClass364_6.method8334(Static154.anInt3181));
			return;
		}
		if (Static565.aClass145_11 != Static296.aClass145_5 || Static204.anInt8827 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static82.method1376("FPS: " + Static382.anInt7358);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static368.aBoolean505 = !Static368.aBoolean505;
					if (Static368.aBoolean505) {
						Static82.method1376("Occlsion now on!");
						return;
					}
					Static82.method1376("Occlsion now off!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static397.aBoolean521 = true;
					Static82.method1376("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static397.aBoolean521 = false;
					Static82.method1376("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static82.method1376("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(248) Throwable local248) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static451.aClass136_7.method3290();
					Static82.method1376("Text coords cleared");
					return;
				}
				@Pc(289) int local289;
				@Pc(268) int local268;
				@Pc(279) Runtime local279;
				if (arg2.equalsIgnoreCase("gc")) {
					Static295.method8178();
					for (local268 = 0; local268 < 10; local268++) {
						System.gc();
					}
					local279 = Runtime.getRuntime();
					local289 = (int) ((local279.totalMemory() - local279.freeMemory()) / 1024L);
					Static82.method1376("mem=" + local289 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static295.method8178();
					for (local268 = 0; local268 < 10; local268++) {
						System.gc();
					}
					local279 = Runtime.getRuntime();
					local289 = (int) ((local279.totalMemory() - local279.freeMemory()) / 1024L);
					Static82.method1376("Memory before cleanup=" + local289 + "k");
					Static404.method6351();
					Static295.method8178();
					for (@Pc(345) int local345 = 0; local345 < 10; local345++) {
						System.gc();
					}
					local289 = (int) ((local279.totalMemory() - local279.freeMemory()) / 1024L);
					Static82.method1376("Memory after cleanup=" + local289 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static82.method1376(Static587.method8306() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static82.method1376("Dropped client connection");
					if (Static203.anInt3855 == 10) {
						Static501.method5640();
					} else if (Static203.anInt3855 == 11) {
						Static152.aBoolean276 = true;
						return;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static60.aClass342_1.method8062();
					Static82.method1376("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static528.aClass329_3.method7765();
					Static82.method1376("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static528.aClass329_3.method7771();
					Static82.method1376("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static406.aClass354_5.method8217();
					Static299.aClass241_3.method7090();
					Static528.aClass329_3.method7764();
					Static82.method1376("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static71.method1198();
					Static37.method484();
					Static82.method1376("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static487.aLong229 = Static574.method8210();
					Static216.aBoolean514 = true;
					Static71.method1198();
					Static37.method484();
					Static82.method1376("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static98.method2170(-1, 1, false, -1);
					if (Static4.method130() == 1) {
						Static82.method1376("wm1 succeeded");
						return;
					}
					Static82.method1376("wm1 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static98.method2170(-1, 2, false, -1);
					if (Static4.method130() != 2) {
						Static82.method1376("wm2 failed");
						return;
					}
					Static82.method1376("wm2 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static98.method2170(1024, 3, false, 768);
					if (Static4.method130() != 3) {
						Static82.method1376("wm3 failed");
						return;
					}
					Static82.method1376("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static547.method7956(0);
					if (Static495.anInt9000 != 0) {
						Static82.method1376("Failed to enter tk0");
						return;
					}
					Static82.method1376("Entered tk0");
					Static214.aClass4_Sub19_Sub1_1.anInt3063 = 0;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static547.method7956(1);
					if (Static495.anInt9000 == 1) {
						Static82.method1376("Entered tk1");
						Static214.aClass4_Sub19_Sub1_1.anInt3063 = 1;
						Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
						Static265.aBoolean367 = false;
						return;
					}
					Static82.method1376("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static547.method7956(2);
					if (Static495.anInt9000 == 2) {
						Static82.method1376("Entered tk2");
						Static214.aClass4_Sub19_Sub1_1.anInt3063 = 2;
						Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
						Static265.aBoolean367 = false;
						return;
					}
					Static82.method1376("Failed to enter tk2");
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static547.method7956(3);
					if (Static495.anInt9000 == 3) {
						Static82.method1376("Entered tk3");
						Static214.aClass4_Sub19_Sub1_1.anInt3063 = 3;
						Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
						Static265.aBoolean367 = false;
						return;
					}
					Static82.method1376("Failed to enter tk3");
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static547.method7956(5);
					if (Static495.anInt9000 != 5) {
						Static82.method1376("Failed to enter tk5");
						return;
					}
					Static82.method1376("Entered tk5");
					Static214.aClass4_Sub19_Sub1_1.anInt3063 = 5;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("ot")) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean252 = !Static214.aClass4_Sub19_Sub1_1.aBoolean252;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					Static71.method1198();
					Static82.method1376("ot=" + Static214.aClass4_Sub19_Sub1_1.aBoolean252);
					return;
				}
				if (arg2.equalsIgnoreCase("gb")) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean262 = !Static214.aClass4_Sub19_Sub1_1.aBoolean262;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					Static71.method1198();
					Static82.method1376("gb=" + Static214.aClass4_Sub19_Sub1_1.aBoolean262);
					return;
				}
				@Pc(783) int local783;
				if (arg2.startsWith("shadows")) {
					if (arg2.length() < 8) {
						Static82.method1376("Invalid shadows value");
						return;
					}
					@Pc(773) String local773 = arg2.substring(8);
					local783 = Static220.method3590(local773) ? Static82.method1379(local773) : -1;
					if (local783 >= 0 && local783 <= 2) {
						Static214.aClass4_Sub19_Sub1_1.method2772(local783, Static495.anInt9000);
						Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
						Static265.aBoolean367 = false;
						Static71.method1198();
						Static82.method1376("shadows=" + local783);
						return;
					}
					Static82.method1376("Invalid shadows value");
					return;
				}
				if (arg2.startsWith("textures")) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean256 = !Static214.aClass4_Sub19_Sub1_1.aBoolean256;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					Static379.method6045();
					Static71.method1198();
					Static82.method1376("textures=" + Static214.aClass4_Sub19_Sub1_1.aBoolean256);
					return;
				}
				if (arg2.startsWith("lighting")) {
					Static214.aClass4_Sub19_Sub1_1.method2777(!Static214.aClass4_Sub19_Sub1_1.method2771(Static495.anInt9000), Static495.anInt9000);
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					Static214.method3551();
					Static379.method6045();
					Static71.method1198();
					Static82.method1376("lighting=" + Static214.aClass4_Sub19_Sub1_1.method2771(Static495.anInt9000));
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static82.method1376("Invalid buildarea value");
						return;
					}
					local268 = Static82.method1379(arg2.substring(6));
					if (local268 >= 0 && local268 <= Static554.method8019(Static577.anInt10067)) {
						Static214.aClass4_Sub19_Sub1_1.anInt3074 = local268;
						Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
						Static265.aBoolean367 = false;
						Static82.method1376("maxbuildarea=" + Static214.aClass4_Sub19_Sub1_1.anInt3074);
						return;
					}
					Static82.method1376("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static82.method1376("Invalid rect_debug value");
						return;
					}
					Static534.anInt9511 = Static82.method1379(arg2.substring(10).trim());
					Static82.method1376("rect_debug=" + Static534.anInt9511);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static57.aBoolean43 = true;
					Static82.method1376("qa_op_test=" + Static57.aBoolean43);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static77.aBoolean82 = !Static77.aBoolean82;
					Static82.method1376("clipcomponents=" + Static77.aBoolean82);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(1022) boolean local1022 = Static440.aClass44_12.method5019();
					if (Static303.method5191(!local1022)) {
						if (local1022) {
							Static82.method1376("Bloom disabled");
							return;
						}
						Static82.method1376("Bloom enabled");
						return;
					}
					Static82.method1376("Failed to enable bloom");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (!Static115.aBoolean196) {
						Static115.aBoolean196 = true;
						Static82.method1376("Forced tweening ENABLED!");
						return;
					}
					Static115.aBoolean196 = false;
					Static82.method1376("Forced tweening disabled.");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static89.aBoolean156) {
						Static82.method1376("Shift-click disabled.");
						Static89.aBoolean156 = false;
						return;
					}
					Static82.method1376("Shift-click ENABLED!");
					Static89.aBoolean156 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static82.method1376("x:" + (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 >> 9) + " z:" + (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static82.method1376("Height: " + Static499.aClass83Array3[Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126].method7217(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 >> 9, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static281.aClass176_74.method3974();
					Static281.aClass176_74.method3979();
					Static447.aClass237_3.method5793();
					Static182.aClass142_3.method3368();
					Static37.method484();
					Static82.method1376("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static440.aClass44_12.method4976()) {
						local268 = Integer.parseInt(arg2.substring(3));
						if (local268 < 1) {
							local268 = 1;
						} else if (local268 > 4) {
							local268 = 4;
						}
						Static317.anInt10277 = local268;
						Static71.method1198();
						Static82.method1376("Render cores now: " + Static317.anInt10277);
						return;
					}
					Static82.method1376("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static82.method1376("I(s): " + Static377.aClass223_50.method5391() + "/" + Static377.aClass223_50.method5395());
					Static82.method1376("I(m): " + Static241.aClass223_32.method5391() + "/" + Static241.aClass223_32.method5395());
					Static82.method1376("O(s): " + Static521.aClass273_2.aClass275_1.method6774() + "/" + Static521.aClass273_2.aClass275_1.method6777());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static82.method1376("Pos: " + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 + "," + (Static552.anInt9805 + (Static24.anInt387 >> 9) >> 6) + "," + ((Static110.anInt2624 >> 9) + Static254.anInt4667 >> 6) + "," + ((Static24.anInt387 >> 9) + Static552.anInt9805 & 0x3F) + "," + ((Static110.anInt2624 >> 9) + Static254.anInt4667 & 0x3F) + " Height: " + (Static501.method5641(Static24.anInt387, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126, Static110.anInt2624) - Static209.anInt3913));
					Static82.method1376("Look: " + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 + "," + (Static465.anInt8650 + Static552.anInt9805 >> 6) + "," + (Static254.anInt4667 + Static58.anInt969 >> 6) + "," + (Static552.anInt9805 + Static465.anInt8650 & 0x3F) + "," + (Static254.anInt4667 + Static58.anInt969 & 0x3F) + " Height: " + (Static501.method5641(Static465.anInt8650, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126, Static58.anInt969) - Static238.anInt4330));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static589.aBoolean719 = !Static589.aBoolean719;
					Static440.aClass44_12.method5042(Static589.aBoolean719);
					Static102.method5288();
					Static82.method1376("showprofiling=" + Static589.aBoolean719);
					return;
				}
				@Pc(1426) String[] local1426;
				if (arg2.startsWith("performancetest")) {
					local268 = -1;
					local783 = 1000;
					if (arg2.length() > 15) {
						local1426 = Static175.method3185(' ', arg2);
						try {
							if (local1426.length > 1) {
								local783 = Integer.parseInt(local1426[1]);
							}
						} catch (@Pc(1437) Throwable local1437) {
						}
						try {
							if (local1426.length > 2) {
								local268 = Integer.parseInt(local1426[2]);
							}
						} catch (@Pc(1450) Throwable local1450) {
						}
					}
					if (local268 == -1) {
						Static82.method1376("Java toolkit: " + Static279.method4827(local783, 0));
						Static82.method1376("SSE toolkit:  " + Static279.method4827(local783, 2));
						Static82.method1376("D3D toolkit:  " + Static279.method4827(local783, 3));
						Static82.method1376("GL toolkit:   " + Static279.method4827(local783, 1));
						Static82.method1376("GLX toolkit:  " + Static279.method4827(local783, 5));
						return;
					}
					Static82.method1376("Performance: " + Static279.method4827(local783, Static495.anInt9000));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static417.aBoolean538 = !Static417.aBoolean538;
					Static82.method1376("nonpcs=" + Static417.aBoolean538);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static209.method3500();
					Static82.method1376("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local268 = Integer.parseInt(arg2.substring(12));
					Static480.method8253(local268, Static1.method62(local268).aString45);
					Static82.method1376("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static82.method1376("w: " + Static60.aClass342_1.anInt9881);
					return;
				}
				@Pc(1603) Class4_Sub14 local1603;
				if (arg2.startsWith("pc")) {
					local1603 = Static196.method3380(Static17.aClass159_1, Static415.aClass173_101);
					local1603.aClass4_Sub11_Sub1_3.method4957(0);
					local783 = local1603.aClass4_Sub11_Sub1_3.anInt5831;
					local289 = arg2.indexOf(" ", 4);
					local1603.aClass4_Sub11_Sub1_3.method4945(arg2.substring(3, local289));
					Static336.method5505(local1603.aClass4_Sub11_Sub1_3, arg2.substring(local289));
					local1603.aClass4_Sub11_Sub1_3.method4941(local1603.aClass4_Sub11_Sub1_3.anInt5831 - local783);
					Static353.method5712(local1603);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static355.method5748();
					Static82.method1376("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local268 = 0; local268 < Static419.anIntArray414.length; local268++) {
						if (Static225.aBooleanArray11[local268]) {
							Static419.anIntArray414[local268] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static419.anIntArray414[local268] *= -1;
							}
						}
					}
					Static355.method5748();
					Static82.method1376("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static201.aBoolean296 = true;
					Static37.method484();
					Static82.method1376("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static201.aBoolean296 = false;
					Static37.method484();
					Static82.method1376("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static28.method361();
					Static82.method1376("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static82.method1376(Static77.method1242() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local268 = Integer.parseInt(arg2.substring(17));
					Static82.method1376("varpbit=" + Static45.aClass148_1.method3448(local268));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local268 = Integer.parseInt(arg2.substring(14));
					Static82.method1376("varp=" + Static45.aClass148_1.method3447(local268));
					return;
				}
				if (arg2.startsWith("demologin")) {
					Static147.method2809(false, 0);
					return;
				}
				if (arg2.startsWith("newdemologin")) {
					Static147.method2809(true, 0);
					return;
				}
				if (arg2.startsWith("directlogin")) {
					@Pc(1824) String[] local1824 = Static175.method3185(' ', arg2.substring(12));
					if (local1824.length >= 2) {
						local783 = local1824.length <= 2 ? 0 : Integer.parseInt(local1824[2]);
						Static171.method3118(local1824[0], local783, local1824[1]);
						return;
					}
				}
				if (arg2.startsWith("csprofileclear")) {
					Static388.method6119();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static388.method6122();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static388.method6122();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local268 = Integer.parseInt(arg2.substring(8));
					Static440.aClass44_12.method5031(local268);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static82.method1376("Active streams: " + Static444.aClass4_Sub7_Sub1_2.method401());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static214.aClass4_Sub19_Sub1_1.method2793();
					Static82.method1376("Complete. Toolkit now: " + Static495.anInt9000);
					return;
				}
				if (arg2.equals("errormessage")) {
					Static82.method1376(Static430.aClient1.method1165());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static576.aString104.startsWith("win")) {
						Static3.method116(new File("C:\\Temp\\heap.dump"));
					} else {
						Static3.method116(new File("/tmp/heap.dump"));
					}
					Static82.method1376("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static82.method1376("Name: " + Static576.aString104);
					Static82.method1376("Arch: " + Static576.aString100);
					Static82.method1376("Ver: " + Static576.aString102);
					return;
				}
				if (arg2.equals("w2debug")) {
					Static478.aBoolean620 = !Static478.aBoolean620;
					Static71.method1198();
					Static82.method1376("Toggled!");
					return;
				}
				@Pc(2016) File local2016;
				if (arg2.startsWith("setoutput ")) {
					local2016 = new File(arg2.substring(10));
					if (local2016.exists()) {
						local2016 = new File(arg2.substring(10) + "." + Static574.method8210() + ".log");
						if (local2016.exists()) {
							Static82.method1376("file already exists!");
							return;
						}
					}
					if (Static414.aFileOutputStream1 != null) {
						Static414.aFileOutputStream1.close();
						Static414.aFileOutputStream1 = null;
					}
					try {
						Static414.aFileOutputStream1 = new FileOutputStream(local2016);
						return;
					} catch (@Pc(2058) FileNotFoundException local2058) {
						Static82.method1376("Could not create " + local2016.getName());
						return;
					} catch (@Pc(2070) SecurityException local2070) {
						Static82.method1376("Cannot write to " + local2016.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static414.aFileOutputStream1 != null) {
						Static414.aFileOutputStream1.close();
					}
					Static414.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local2016 = new File(arg2.substring(10));
					if (!local2016.exists()) {
						Static82.method1376("No such file");
						return;
					}
					@Pc(2114) byte[] local2114 = Static378.method5224(local2016);
					if (local2114 == null) {
						Static82.method1376("Failed to read file");
						return;
					}
					local1426 = Static175.method3185('\n', Static395.method6257("", Static446.method6886(local2114)));
					Static222.method3618(local1426);
					return;
				}
				if (Static203.anInt3855 == 10) {
					local1603 = Static196.method3380(Static17.aClass159_1, Static294.aClass173_68);
					local1603.aClass4_Sub11_Sub1_3.method4957(arg2.length() + 3);
					local1603.aClass4_Sub11_Sub1_3.method4957(arg0 ? 1 : 0);
					local1603.aClass4_Sub11_Sub1_3.method4957(arg1 ? 1 : 0);
					local1603.aClass4_Sub11_Sub1_3.method4945(arg2);
					Static353.method5712(local1603);
				}
				if (arg2.startsWith("fps ") && Static565.aClass145_11 != Static296.aClass145_5) {
					Static78.method1258(Static82.method1379(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2199) Exception local2199) {
				Static82.method1376(Static590.aClass364_6.method8334(Static154.anInt3181));
				return;
			}
		}
		if (Static203.anInt3855 != 10) {
			Static82.method1376(Static590.aClass364_7.method8334(Static154.anInt3181) + arg2);
		}
	}
}
