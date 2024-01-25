import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	public static int anInt932;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Lclient!gba;")
	public static Class125 aClass125_4;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BIIIZ)V")
	public static void method828(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 0) {
			Static328.method4913(false);
		} else {
			Static583.anInt9579 = Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329();
			Static352.method5455(true, 0);
		}
		Static180.anInt4001 = arg2;
		Static424.aBoolean576 = arg3;
		Static362.anInt6542 = arg0;
		Static292.method7036(arg1);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "()V")
	public static void method829() {
		for (@Pc(1) int local1 = 0; local1 < Static140.anInt3097; local1++) {
			if (!Static190.aBooleanArray49[local1]) {
				@Pc(10) Class93 local10 = Static302.aClass93Array1[local1];
				@Pc(13) Class2_Sub4 local13 = local10.aClass2_Sub4_3;
				@Pc(16) int local16 = local10.anInt2922;
				@Pc(22) int local22 = local13.method8154() - Static290.anInt5464;
				@Pc(30) int local30 = (local22 * 2 >> Static415.anInt7579) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8150() - local22 >> Static415.anInt7579;
				@Pc(53) int local53 = local13.method8151() - local22 >> Static415.anInt7579;
				@Pc(61) int local61 = local13.method8151() + local22 >> Static415.anInt7579;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static191.anInt6006) {
					local61 = Static191.anInt6006 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray37[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static347.anInt6411) {
						local108 = Static347.anInt6411 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class11_Sub1_Sub1 local141 = Static383.method5768(local16, local125, local78, bba.class);
						if (local141 != null && local141.aByte94 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte94 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray37[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray37[local32 - 1];
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
									local182 = local10.aShortArray37[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray37[local32 + 1];
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
				Static190.aBooleanArray49[local1] = true;
				Static331.aClass112Array3[local16].method7820(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)I")
	public static int method830() {
		if (Static77.anInt1689 == 0) {
			Static575.aClass341_2.method7999(new Class113("jaclib"));
			if (Static575.aClass341_2.method8001().method5454() != 100) {
				return 1;
			}
			if (!((Class113) Static575.aClass341_2.method8001()).method3006()) {
				Static181.aClient1.method1317();
			}
			Static77.anInt1689 = 1;
		}
		@Pc(244) int local244;
		@Pc(266) int local266;
		@Pc(279) int local279;
		@Pc(285) int local285;
		if (Static77.anInt1689 == 1) {
			Static87.aClass341Array1 = Static575.method8000();
			Static575.aClass341_1.method7999(new Class219(Static150.aClass97_37));
			Static575.aClass341_3.method7999(new Class113("jaggl"));
			Static575.aClass341_4.method7999(new Class113("jagdx"));
			Static575.aClass341_5.method7999(new Class113("jagmisc"));
			Static575.aClass341_6.method7999(new Class113("sw3d"));
			Static575.aClass341_7.method7999(new Class113("hw3d"));
			Static575.aClass341_8.method7999(new Class113("jagtheora"));
			Static575.aClass341_9.method7999(new Class219(Static181.aClass97_52));
			Static575.aClass341_10.method7999(new Class219(Static442.aClass97_110));
			Static575.aClass341_11.method7999(new Class219(Static104.aClass97_26));
			Static575.aClass341_12.method7999(new Class219(Static95.aClass97_21));
			Static575.aClass341_13.method7999(new Class219(Static410.aClass97_101));
			Static575.aClass341_14.method7999(new Class219(Static377.aClass97_96));
			Static575.aClass341_15.method7999(new Class219(Static64.aClass97_12));
			Static575.aClass341_16.method7999(new Class219(Static328.aClass97_84));
			Static575.aClass341_17.method7999(new Class219(Static282.aClass97_70));
			Static575.aClass341_18.method7999(new Class219(Static544.aClass97_135));
			Static575.aClass341_19.method7999(new Class219(Static253.aClass97_65));
			Static575.aClass341_20.method7999(new Class219(Static551.aClass97_136));
			Static575.aClass341_21.method7999(new Class219(Static372.aClass97_95));
			Static575.aClass341_22.method7999(new Class219(Static644.aClass97_154));
			Static575.aClass341_23.method7999(new Class46(Static345.aClass97_91, "huffman"));
			Static575.aClass341_24.method7999(new Class219(Static100.aClass97_25));
			Static575.aClass341_25.method7999(new Class219(Static224.aClass97_59));
			Static575.aClass341_26.method7999(new Class219(Static428.aClass97_107));
			Static575.aClass341_27.method7999(new Class35(Static612.aClass97_149, "details"));
			for (local244 = 0; local244 < Static87.aClass341Array1.length; local244++) {
				if (Static87.aClass341Array1[local244].method8001() == null) {
					throw new RuntimeException();
				}
			}
			local266 = 0;
			@Pc(268) Class341[] local268 = Static87.aClass341Array1;
			for (@Pc(270) int local270 = 0; local270 < local268.length; local270++) {
				@Pc(275) Class341 local275 = local268[local270];
				local279 = local275.method7998();
				local285 = local275.method8001().method5454();
				local266 += local279 * local285 / 100;
			}
			Static77.anInt1689 = 2;
			Static217.anInt4531 = local266;
		}
		if (Static87.aClass341Array1 == null) {
			return 100;
		}
		local244 = 0;
		local266 = 0;
		@Pc(316) boolean local316 = true;
		@Pc(318) Class341[] local318 = Static87.aClass341Array1;
		for (@Pc(320) int local320 = 0; local320 < local318.length; local320++) {
			@Pc(325) Class341 local325 = local318[local320];
			local285 = local325.method7998();
			@Pc(335) int local335 = local325.method8001().method5454();
			local266 += local285 * local335 / 100;
			local244 += local285;
			if (local335 < 100) {
				local316 = false;
			}
		}
		if (local316) {
			if (!((Class113) Static575.aClass341_5.method8001()).method3006()) {
				Static181.aClient1.method1321();
			}
			if (!((Class113) Static575.aClass341_8.method8001()).method3006()) {
				Static67.aBoolean116 = Static181.aClient1.method1319();
			}
			Static87.aClass341Array1 = null;
		}
		local244 -= Static217.anInt4531;
		local266 -= Static217.anInt4531;
		local279 = local244 > 0 ? local266 * 100 / local244 : 100;
		if (!local316 && local279 > 99) {
			local279 = 99;
		}
		return local279;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!vk;Lclient!eq;B)V")
	public static void method831(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class97 arg1) {
		Static362.aString62 = "";
		Static564.aClass97_121 = arg1;
		Static129.aClass359_3 = arg0;
		if (Class45_Sub1.aString108.startsWith("win")) {
			Static362.aString62 = Static362.aString62 + "windows/";
		} else if (Class45_Sub1.aString108.startsWith("linux")) {
			Static362.aString62 = Static362.aString62 + "linux/";
		} else if (Class45_Sub1.aString108.startsWith("mac")) {
			Static362.aString62 = Static362.aString62 + "macos/";
		}
		if (Static129.aClass359_3.aBoolean728) {
			Static362.aString62 = Static362.aString62 + "msjava/";
		} else if (Class45_Sub1.aString109.startsWith("amd64") || Class45_Sub1.aString109.startsWith("x86_64")) {
			Static362.aString62 = Static362.aString62 + "x86_64/";
		} else if (Class45_Sub1.aString109.startsWith("i386") || Class45_Sub1.aString109.startsWith("i486") || Class45_Sub1.aString109.startsWith("i586") || Class45_Sub1.aString109.startsWith("x86")) {
			Static362.aString62 = Static362.aString62 + "x86/";
		} else if (Class45_Sub1.aString109.startsWith("ppc")) {
			Static362.aString62 = Static362.aString62 + "ppc/";
		} else {
			Static362.aString62 = Static362.aString62 + "universal/";
		}
	}
}
