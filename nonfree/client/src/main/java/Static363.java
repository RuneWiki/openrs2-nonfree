import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "Lclient!jw;")
	public static final Class183 aClass183_26 = new Class183(8);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!cea;)V")
	public static void method5447(@OriginalArg(1) Class4_Sub9_Sub1 arg0) {
		arg0.method1039();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static272.anInt5182; local12++) {
			local18 = Static362.anIntArray519[local12];
			if ((Static41.aByteArray11[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static41.aByteArray11[local18] = (byte) (Static41.aByteArray11[local18] | 0x2);
					local10--;
				} else {
					local46 = arg0.method1046(1);
					if (local46 == 0) {
						local10 = Static540.method7507(arg0);
						Static41.aByteArray11[local18] = (byte) (Static41.aByteArray11[local18] | 0x2);
					} else {
						Static2.method49(local18, arg0);
					}
				}
			}
		}
		arg0.method1036();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method1039();
		@Pc(127) int local127;
		for (local18 = 0; local18 < Static272.anInt5182; local18++) {
			local46 = Static362.anIntArray519[local18];
			if ((Static41.aByteArray11[local46] & 0x1) != 0) {
				if (local10 > 0) {
					Static41.aByteArray11[local46] = (byte) (Static41.aByteArray11[local46] | 0x2);
					local10--;
				} else {
					local127 = arg0.method1046(1);
					if (local127 == 0) {
						local10 = Static540.method7507(arg0);
						Static41.aByteArray11[local46] = (byte) (Static41.aByteArray11[local46] | 0x2);
					} else {
						Static2.method49(local46, arg0);
					}
				}
			}
		}
		arg0.method1036();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method1039();
		@Pc(207) int local207;
		for (local46 = 0; local46 < Static135.anInt3093; local46++) {
			local127 = Static45.anIntArray134[local46];
			if ((Static41.aByteArray11[local127] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static41.aByteArray11[local127] = (byte) (Static41.aByteArray11[local127] | 0x2);
				} else {
					local207 = arg0.method1046(1);
					if (local207 == 0) {
						local10 = Static540.method7507(arg0);
						Static41.aByteArray11[local127] = (byte) (Static41.aByteArray11[local127] | 0x2);
					} else if (Static563.method7750(local127, arg0)) {
						Static41.aByteArray11[local127] = (byte) (Static41.aByteArray11[local127] | 0x2);
					}
				}
			}
		}
		arg0.method1036();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method1039();
		for (local127 = 0; local127 < Static135.anInt3093; local127++) {
			local207 = Static45.anIntArray134[local127];
			if ((Static41.aByteArray11[local207] & 0x1) == 0) {
				if (local10 > 0) {
					Static41.aByteArray11[local207] = (byte) (Static41.aByteArray11[local207] | 0x2);
					local10--;
				} else {
					@Pc(301) int local301 = arg0.method1046(1);
					if (local301 == 0) {
						local10 = Static540.method7507(arg0);
						Static41.aByteArray11[local207] = (byte) (Static41.aByteArray11[local207] | 0x2);
					} else if (Static563.method7750(local207, arg0)) {
						Static41.aByteArray11[local207] = (byte) (Static41.aByteArray11[local207] | 0x2);
					}
				}
			}
		}
		arg0.method1036();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static135.anInt3093 = 0;
		Static272.anInt5182 = 0;
		for (local207 = 1; local207 < 2048; local207++) {
			Static41.aByteArray11[local207] = (byte) (Static41.aByteArray11[local207] >> 1);
			@Pc(369) Class10_Sub1_Sub2_Sub2 local369 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local207];
			if (local369 == null) {
				Static45.anIntArray134[Static135.anInt3093++] = local207;
			} else {
				Static362.anIntArray519[Static272.anInt5182++] = local207;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BJ)V")
	public static void method5451(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 + Static50.anInt9380;
		@Pc(15) int local15 = Static592.anInt9725 + Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929;
		if (Static195.anInt4188 - local10 < -2000 || Static195.anInt4188 - local10 > 2000 || Static303.anInt5529 - local15 < -2000 || Static303.anInt5529 - local15 > 2000) {
			Static195.anInt4188 = local10;
			Static303.anInt5529 = local15;
		}
		@Pc(51) int local51;
		@Pc(59) int local59;
		if (Static195.anInt4188 != local10) {
			local51 = local10 - Static195.anInt4188;
			local59 = (int) ((long) local51 * arg0 / 320L);
			if (local51 > 0) {
				if (local59 == 0) {
					local59 = 1;
				} else if (local51 < local59) {
					local59 = local51;
				}
			} else if (local59 == 0) {
				local59 = -1;
			} else if (local59 < local51) {
				local59 = local51;
			}
			Static195.anInt4188 += local59;
		}
		if (!Static189.aClass4_Sub2_Sub1_1.aBoolean651) {
			Static330.aFloat102 += Static189.aFloat90 * (float) arg0 / 6.0F;
			Static477.aFloat164 += (float) arg0 * Static432.aFloat144 / 6.0F;
		}
		if (local15 != Static303.anInt5529) {
			local51 = local15 - Static303.anInt5529;
			local59 = (int) (arg0 * (long) local51 / 320L);
			if (local51 <= 0) {
				if (local59 == 0) {
					local59 = -1;
				} else if (local59 < local51) {
					local59 = local51;
				}
			} else if (local59 == 0) {
				local59 = 1;
			} else if (local59 > local51) {
				local59 = local51;
			}
			Static303.anInt5529 += local59;
		}
		Static404.method5838();
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public static void method5454() {
		if (Static598.anInt9831 == 9) {
			Static33.method600(5);
		} else if (Static598.anInt9831 == 5 || Static598.anInt9831 == 6) {
			Static33.method600(3);
		} else if (Static598.anInt9831 == 12) {
			Static33.method600(3);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;ZZ)V")
	public static void method5455(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (Static106.aClass315_4 == Static327.aClass315_8 && Static540.anInt9129 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg0.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static596.aBoolean689 = true;
				Static444.method6281("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static596.aBoolean689 = false;
				Static444.method6281("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static444.method6281("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(81) Throwable local81) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static335.anInt6552 = 0;
				Static174.anInt3757 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static385.aClass8_5.method106();
				Static444.method6281("Text coords cleared");
				return;
			}
			@Pc(129) int local129;
			@Pc(110) int local110;
			@Pc(119) Runtime local119;
			if (arg0.equalsIgnoreCase("gc")) {
				Static330.method4949();
				for (local110 = 0; local110 < 10; local110++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local129 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static444.method6281("mem=" + local129 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static330.method4949();
				for (local110 = 0; local110 < 10; local110++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local129 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static444.method6281("Memory before cleanup=" + local129 + "k");
				Static463.method6490();
				Static330.method4949();
				for (@Pc(185) int local185 = 0; local185 < 10; local185++) {
					System.gc();
				}
				local129 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static444.method6281("Memory after cleanup=" + local129 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("unloadnatives")) {
				Static444.method6281(Static477.method6637() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static444.method6281("Number of player models in cache:" + Static138.method7411());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static444.method6281("Dropped client connection");
				if (Static598.anInt9831 == 10) {
					Static25.method449();
					return;
				}
				if (Static598.anInt9831 == 11) {
					Static2.aBoolean2 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
				Static238.aClass300_10.method6607();
				Static444.method6281("Rotated connection methods");
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static160.aClass207_1.method4641();
				Static444.method6281("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static160.aClass207_1.method4637();
				Static444.method6281("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static147.aClass161_4.method3819();
				Static235.aClass45_1.method840();
				Static160.aClass207_1.method4629();
				Static444.method6281("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static589.method7934();
				Static180.method3365();
				Static444.method6281("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static469.method6545(1, -1, -1, false);
				if (Static420.method6044() == 1) {
					Static444.method6281("wm1 succeeded");
					return;
				}
				Static444.method6281("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static469.method6545(2, -1, -1, false);
				if (Static420.method6044() != 2) {
					Static444.method6281("wm2 failed");
					return;
				}
				Static444.method6281("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static469.method6545(3, 768, 1024, false);
				if (Static420.method6044() == 3) {
					Static444.method6281("wm3 succeeded");
					return;
				}
				Static444.method6281("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static8.method7640(0);
				if (Static403.anInt6994 != 0) {
					Static444.method6281("Failed to enter tk0");
					return;
				}
				Static444.method6281("Entered tk0");
				Static189.aClass4_Sub2_Sub1_1.anInt9285 = 0;
				Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
				Static47.aBoolean78 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static8.method7640(1);
				if (Static403.anInt6994 == 1) {
					Static444.method6281("Entered tk1");
					Static189.aClass4_Sub2_Sub1_1.anInt9285 = 1;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				Static444.method6281("Failed to enter tk1");
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static8.method7640(2);
				if (Static403.anInt6994 == 2) {
					Static444.method6281("Entered tk2");
					Static189.aClass4_Sub2_Sub1_1.anInt9285 = 2;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				Static444.method6281("Failed to enter tk2");
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static8.method7640(3);
				if (Static403.anInt6994 != 3) {
					Static444.method6281("Failed to enter tk3");
					return;
				}
				Static444.method6281("Entered tk3");
				Static189.aClass4_Sub2_Sub1_1.anInt9285 = 3;
				Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
				Static47.aBoolean78 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk4")) {
				Static8.method7640(4);
				if (Static403.anInt6994 == 4) {
					Static444.method6281("Entered tk4");
					Static189.aClass4_Sub2_Sub1_1.anInt9285 = 4;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					return;
				}
				Static444.method6281("Failed to enter tk4");
				return;
			}
			if (arg0.equalsIgnoreCase("tk5")) {
				Static8.method7640(5);
				if (Static403.anInt6994 != 5) {
					Static444.method6281("Failed to enter tk5");
					return;
				}
				Static444.method6281("Entered tk5");
				Static189.aClass4_Sub2_Sub1_1.anInt9285 = 5;
				Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
				Static47.aBoolean78 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static189.aClass4_Sub2_Sub1_1.aBoolean644 = !Static189.aClass4_Sub2_Sub1_1.aBoolean644;
				Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
				Static47.aBoolean78 = false;
				Static589.method7934();
				Static444.method6281("ot=" + Static189.aClass4_Sub2_Sub1_1.aBoolean644);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static189.aClass4_Sub2_Sub1_1.aBoolean653 = !Static189.aClass4_Sub2_Sub1_1.aBoolean653;
				Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
				Static47.aBoolean78 = false;
				Static589.method7934();
				Static444.method6281("gb=" + Static189.aClass4_Sub2_Sub1_1.aBoolean653);
				return;
			}
			@Pc(643) int local643;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static444.method6281("Invalid shadows value");
					return;
				}
				@Pc(633) String local633 = arg0.substring(8);
				local643 = Static241.method4087(local633) ? Static272.method4392(local633) : -1;
				if (local643 >= 0 && local643 <= 2) {
					Static189.aClass4_Sub2_Sub1_1.method7647(Static403.anInt6994, local643);
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					Static589.method7934();
					Static444.method6281("shadows=" + local643);
					return;
				}
				Static444.method6281("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static189.aClass4_Sub2_Sub1_1.aBoolean661 = !Static189.aClass4_Sub2_Sub1_1.aBoolean661;
				Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
				Static47.aBoolean78 = false;
				Static271.method4381();
				Static589.method7934();
				Static444.method6281("textures=" + Static189.aClass4_Sub2_Sub1_1.aBoolean661);
				return;
			}
			if (arg0.startsWith("lighting")) {
				Static189.aClass4_Sub2_Sub1_1.method7642(!Static189.aClass4_Sub2_Sub1_1.method7644(Static403.anInt6994), Static403.anInt6994);
				Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
				Static47.aBoolean78 = false;
				Static114.method2345();
				Static271.method4381();
				Static589.method7934();
				Static444.method6281("lighting=" + Static189.aClass4_Sub2_Sub1_1.method7644(Static403.anInt6994));
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static444.method6281("Invalid buildarea value");
					return;
				}
				local110 = Static272.method4392(arg0.substring(6));
				if (local110 >= 0 && Static437.method6209(Static87.anInt2262) >= local110) {
					Static189.aClass4_Sub2_Sub1_1.anInt9286 = local110;
					Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
					Static47.aBoolean78 = false;
					Static444.method6281("maxbuildarea=" + Static189.aClass4_Sub2_Sub1_1.anInt9286);
					return;
				}
				Static444.method6281("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static444.method6281("Invalid particles value");
					return;
				}
				Static46.method736(Static272.method4392(arg0.substring(13)));
				Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
				Static47.aBoolean78 = false;
				Static444.method6281("particles=" + Static170.method7580());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static444.method6281("Invalid rect_debug value");
					return;
				}
				Static435.anInt7463 = Static272.method4392(arg0.substring(10).trim());
				Static444.method6281("rect_debug=" + Static435.anInt7463);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static126.aBoolean235 = true;
				Static444.method6281("qa_op_test=" + Static126.aBoolean235);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static342.aBoolean447 = !Static342.aBoolean447;
				Static444.method6281("clipcomponents=" + Static342.aBoolean447);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(915) boolean local915 = Static185.aClass66_14.method6852();
				if (!Static200.method3593(!local915)) {
					Static444.method6281("Failed to enable bloom");
					return;
				}
				if (!local915) {
					Static444.method6281("Bloom enabled");
					return;
				}
				Static444.method6281("Bloom disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static244.aBoolean365) {
					Static244.aBoolean365 = true;
					Static444.method6281("Forced tweening ENABLED!");
					return;
				}
				Static244.aBoolean365 = false;
				Static444.method6281("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (!Static307.aBoolean423) {
					Static444.method6281("Shift-click ENABLED!");
					Static307.aBoolean423 = true;
					return;
				}
				Static444.method6281("Shift-click disabled.");
				Static307.aBoolean423 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static444.method6281("x:" + (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 >> 9) + " z:" + (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 >> 9));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static444.method6281("Height: " + Static112.aClass16Array3[Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101].JA(Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 >> 9, Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 >> 9));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static360.aClass31_78.method654();
				Static360.aClass31_78.method660();
				Static279.aClass190_2.method4350();
				Static152.aClass337_2.method7440();
				Static180.method3365();
				Static444.method6281("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static185.aClass66_14.method6848()) {
					Static444.method6281("Current toolkit doesn't support multiple cores");
					return;
				}
				local110 = Integer.parseInt(arg0.substring(3));
				if (local110 < 1) {
					local110 = 1;
				} else if (local110 > 4) {
					local110 = 4;
				}
				Static511.anInt940 = local110;
				Static185.aClass66_14.method6835(Static511.anInt940);
				Static185.aClass66_14.method6813(0);
				Static444.method6281("Render cores now: " + Static511.anInt940);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static444.method6281("I(s): " + Static529.aClass223_62.method4937() + "/" + Static529.aClass223_62.method4936());
				Static444.method6281("I(m): " + Static401.aClass223_47.method4937() + "/" + Static401.aClass223_47.method4936());
				Static444.method6281("O(s): " + Static195.aClass99_1.aClass175_1.method4096() + "/" + Static195.aClass99_1.aClass175_1.method4094());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static444.method6281("Pos: " + Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 + "," + (Static373.anInt6695 + (Static473.anInt7978 >> 9) >> 6) + "," + ((Static563.anInt9436 >> 9) + Static6.anInt97 >> 6) + "," + ((Static473.anInt7978 >> 9) + Static373.anInt6695 & 0x3F) + "," + ((Static563.anInt9436 >> 9) + Static6.anInt97 & 0x3F) + " Height: " + (Static160.method3164(Static473.anInt7978, Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101, Static563.anInt9436) - Static569.anInt4616));
				Static444.method6281("Look: " + Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 + "," + (Static548.anInt9202 + Static373.anInt6695 >> 6) + "," + (Static353.anInt6160 + Static6.anInt97 >> 6) + "," + (Static548.anInt9202 + Static373.anInt6695 & 0x3F) + "," + (Static353.anInt6160 + Static6.anInt97 & 0x3F) + " Height: " + (Static160.method3164(Static548.anInt9202, Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101, Static353.anInt6160) - Static23.anInt454));
				return;
			}
			if (arg0.equals("showocc")) {
				Static146.aBoolean258 = !Static146.aBoolean258;
				Static589.method7934();
				Static444.method6281("showocc=" + Static146.aBoolean258);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static106.aBoolean209 = !Static106.aBoolean209;
				Static589.method7934();
				Static444.method6281("forcewallocc=" + Static106.aBoolean209);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static85.aBoolean184 = !Static85.aBoolean184;
				Static185.aClass66_14.method6851(Static85.aBoolean184);
				Static389.method5713();
				Static444.method6281("showprofiling=" + Static85.aBoolean184);
				return;
			}
			if (arg0.startsWith("performancetest")) {
				local110 = -1;
				local643 = 1000;
				if (arg0.length() > 15) {
					@Pc(1369) String[] local1369 = Static246.method4172(arg0, ' ');
					try {
						if (local1369.length > 1) {
							local643 = Integer.parseInt(local1369[1]);
						}
					} catch (@Pc(1380) Throwable local1380) {
					}
					try {
						if (local1369.length > 2) {
							local110 = Integer.parseInt(local1369[2]);
						}
					} catch (@Pc(1391) Throwable local1391) {
					}
				}
				if (local110 != -1) {
					Static444.method6281("Performance: " + Static279.method4429(local643, Static403.anInt6994));
					return;
				}
				Static444.method6281("Java toolkit: " + Static279.method4429(local643, 0));
				Static444.method6281("SSE toolkit:  " + Static279.method4429(local643, 2));
				Static444.method6281("D3D toolkit:  " + Static279.method4429(local643, 3));
				Static444.method6281("GL toolkit:   " + Static279.method4429(local643, 1));
				Static444.method6281("GLX toolkit:  " + Static279.method4429(local643, 5));
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(1476) Class105 local1476 = Static185.aClass66_14.method6836();
				Static444.method6281("Vendor: " + local1476.anInt3145);
				Static444.method6281("Name: " + local1476.aString25);
				Static444.method6281("Version: " + local1476.anInt3151);
				Static444.method6281("Device: " + local1476.aString24);
				Static444.method6281("Driver Version: " + local1476.aLong72);
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static36.aBoolean64 = !Static36.aBoolean64;
				Static444.method6281("nonpcs=" + Static36.aBoolean64);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static22.method426();
				Static444.method6281("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local110 = Integer.parseInt(arg0.substring(12));
				Static132.method2774(Static502.method7167(local110).aString2, local110);
				Static444.method6281("switched");
				return;
			}
			if (arg0.equals("getworld")) {
				Static444.method6281("w: " + Static238.aClass300_10.anInt7993);
				return;
			}
			@Pc(1602) Class4_Sub41 local1602;
			if (arg0.startsWith("pc")) {
				local1602 = Static128.method2707(Static478.aClass61_110, Class16_Sub3.lb);
				local1602.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
				local643 = local1602.aClass4_Sub9_Sub1_3.anInt7219;
				local129 = arg0.indexOf(" ", 4);
				local1602.aClass4_Sub9_Sub1_3.method6000(arg0.substring(3, local129));
				Static185.method7126(local1602.aClass4_Sub9_Sub1_3, arg0.substring(local129));
				local1602.aClass4_Sub9_Sub1_3.method6028(local1602.aClass4_Sub9_Sub1_3.anInt7219 - local643);
				Static551.method7603(local1602);
				return;
			}
			if (arg0.equals("heap")) {
				Static444.method6281("Heap: " + Static87.anInt2262 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static388.method5705();
				Static444.method6281("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local110 = 0; local110 < Static435.anIntArray612.length; local110++) {
					if (Static23.aBooleanArray6[local110]) {
						Static435.anIntArray612[local110] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static435.anIntArray612[local110] *= -1;
						}
					}
				}
				Static388.method5705();
				Static444.method6281("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static465.aBoolean547 = true;
				Static180.method3365();
				Static444.method6281("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static465.aBoolean547 = false;
				Static180.method3365();
				Static444.method6281("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static409.method7475();
				Static444.method6281("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static444.method6281(Static437.method6210() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local110 = Integer.parseInt(arg0.substring(9));
				if (local110 >= 0 && local110 <= 4) {
					Static189.aClass4_Sub2_Sub1_1.anInt9300 = local110;
				}
				Static444.method6281("cpuusage=" + Static189.aClass4_Sub2_Sub1_1.anInt9300);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local110 = Integer.parseInt(arg0.substring(17));
				Static444.method6281("varpbit=" + Static511.aClass335_2.method7423(local110));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local110 = Integer.parseInt(arg0.substring(14));
				Static444.method6281("varp=" + Static511.aClass335_2.method7424(local110));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static146.method3009(false, 0);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static146.method3009(true, 0);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1863) String[] local1863 = Static246.method4172(arg0.substring(12), ' ');
				if (local1863.length >= 2) {
					local643 = local1863.length <= 2 ? 0 : Integer.parseInt(local1863[2]);
					Static102.method2243(local1863[1], local643, local1863[0]);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static205.method3634();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static205.method3639();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static205.method3639();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local110 = Integer.parseInt(arg0.substring(8));
				Static185.aClass66_14.method6840(local110);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static444.method6281("Active streams: " + Static430.aClass4_Sub13_Sub1_1.method2271());
				return;
			}
			if (arg0.equals("autosetup")) {
				Static189.aClass4_Sub2_Sub1_1.method7662();
				Static444.method6281("Complete. Toolkit now: " + Static403.anInt6994);
				return;
			}
			if (arg0.equals("errormessage")) {
				Static444.method6281(Static81.aClient7.method1214());
				return;
			}
			if (Static598.anInt9831 == 10) {
				local1602 = Static128.method2707(Static255.aClass61_57, Class16_Sub3.lb);
				local1602.aClass4_Sub9_Sub1_3.method5961(-345277664, arg0.length() + 3);
				local1602.aClass4_Sub9_Sub1_3.method5961(-345277664, arg2 ? 1 : 0);
				local1602.aClass4_Sub9_Sub1_3.method5961(-345277664, arg1 ? 1 : 0);
				local1602.aClass4_Sub9_Sub1_3.method6000(arg0);
				Static551.method7603(local1602);
			}
			if (arg0.startsWith("fps ") && Static106.aClass315_4 != Static327.aClass315_8) {
				Static577.method7855(Static272.method4392(arg0.substring(4)));
				return;
			}
			if (Static598.anInt9831 != 10) {
				Static444.method6281("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(2049) Exception local2049) {
			Static444.method6281("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!bi;Lclient!bi;I[I)V")
	public static void method5456(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(3) int[] arg2) {
		Static149.aClass31_32 = arg0;
		if (arg2 != null) {
			Static61.anIntArray145 = arg2;
		}
		Static433.aClass31_96 = arg1;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)I")
	public static int method5457() {
		@Pc(7) int local7 = Static118.aClass202_1.method4437();
		if (Static384.aClass202Array1.length - 1 > local7) {
			Static118.aClass202_1 = Static384.aClass202Array1[local7 + 1];
		}
		return 100;
	}
}
