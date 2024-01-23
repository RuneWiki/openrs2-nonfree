import java.awt.Container;
import java.awt.Insets;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "Lclient!nm;")
	public static Class119 aClass119_96;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "[Lclient!af;")
	public static Class4_Sub1[] aClass4_Sub1Array4;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
	public static int anInt5630 = -1;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method4670(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(26) char local26 = arg0.charAt(local15);
			if (local13 == 0) {
				local26 = Character.toLowerCase(local26);
			} else if (local13 == 2 || Character.isUpperCase(local26)) {
				local26 = Static302.method4515(local26);
			}
			if (Character.isLetter(local26)) {
				local13 = 0;
			} else if (local26 == '.' || local26 == '?' || local26 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local26)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local15] = local26;
		}
		return new String(local11);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method4671(@OriginalArg(1) Class1_Sub13 arg0) {
		if (arg0.aByteArray63.length - arg0.anInt2018 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method1853();
		if (local21 < 0 || local21 > 11) {
			return;
		}
		@Pc(42) byte local42;
		if (local21 == 11) {
			local42 = 33;
		} else if (local21 == 10) {
			local42 = 32;
		} else if (local21 == 9) {
			local42 = 31;
		} else if (local21 == 8) {
			local42 = 30;
		} else if (local21 == 7) {
			local42 = 29;
		} else if (local21 == 6) {
			local42 = 28;
		} else if (local21 == 5) {
			local42 = 28;
		} else if (local21 == 4) {
			local42 = 24;
		} else if (local21 == 3) {
			local42 = 23;
		} else if (local21 == 2) {
			local42 = 22;
		} else if (local21 == 1) {
			local42 = 23;
		} else {
			local42 = 19;
		}
		if (arg0.aByteArray63.length - arg0.anInt2018 < local42) {
			return;
		}
		Static153.anInt2340 = arg0.method1853();
		if (Static153.anInt2340 < 1) {
			Static153.anInt2340 = 1;
		} else if (Static153.anInt2340 > 4) {
			Static153.anInt2340 = 4;
		}
		Static280.method4271(arg0.method1853() == 1);
		Static128.aBoolean223 = arg0.method1853() == 1;
		Static41.aBoolean79 = arg0.method1853() == 1;
		Static286.aBoolean488 = arg0.method1853() == 1;
		Static271.aBoolean476 = arg0.method1853() == 1;
		Static174.aBoolean528 = arg0.method1853() == 1;
		Static142.aBoolean243 = arg0.method1853() == 1;
		Static294.aBoolean109 = arg0.method1853() == 1;
		Static147.anInt5168 = arg0.method1853();
		if (Static147.anInt5168 > 2) {
			Static147.anInt5168 = 2;
		}
		if (local21 < 2) {
			Static69.aBoolean146 = arg0.method1853() == 1;
			arg0.method1853();
		} else {
			Static69.aBoolean146 = arg0.method1853() == 1;
		}
		Static43.aBoolean88 = arg0.method1853() == 1;
		Static222.aBoolean379 = arg0.method1853() == 1;
		Static296.anInt842 = arg0.method1853();
		if (Static296.anInt842 > 2) {
			Static296.anInt842 = 2;
		}
		Static40.anInt844 = Static296.anInt842;
		Static230.aBoolean388 = arg0.method1853() == 1;
		Static253.anInt4650 = arg0.method1853();
		if (Static253.anInt4650 > 127) {
			Static253.anInt4650 = 127;
		}
		Static172.anInt3363 = arg0.method1853();
		Static167.anInt638 = arg0.method1853();
		if (Static167.anInt638 > 127) {
			Static167.anInt638 = 127;
		}
		if (local21 >= 1) {
			Static299.anInt5384 = arg0.method1879();
			Static80.anInt1772 = arg0.method1879();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method1853();
		}
		if (local21 >= 4) {
			@Pc(382) int local382 = arg0.method1853();
			if (Static73.anInt1579 < 96) {
				local382 = 0;
			}
			Static52.method969(local382);
		}
		if (local21 >= 5) {
			Static205.anInt3963 = arg0.method1860();
		}
		if (local21 >= 6) {
			Static271.anInt4996 = arg0.method1853();
		}
		if (local21 >= 7) {
			Static286.aBoolean489 = arg0.method1853() == 1;
		}
		if (local21 >= 8) {
			Static240.aBoolean404 = arg0.method1853() == 1;
		}
		if (local21 >= 9) {
			Static19.anInt422 = arg0.method1853();
		}
		if (local21 >= 10) {
			Static5.aBoolean18 = arg0.method1853() != 0;
		}
		if (local21 >= 11) {
			Static81.aBoolean176 = arg0.method1853() != 0;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
	public static void method4672() {
		@Pc(10) Container local10;
		if (Static196.aFrame1 != null) {
			local10 = Static196.aFrame1;
		} else if (Static311.aFrame2 == null) {
			local10 = Static222.aClass176_3.anApplet1;
		} else {
			local10 = Static311.aFrame2;
		}
		Static187.anInt3577 = local10.getSize().width;
		Static253.anInt4653 = local10.getSize().height;
		@Pc(36) Insets local36;
		if (Static311.aFrame2 == local10) {
			local36 = Static311.aFrame2.getInsets();
			Static187.anInt3577 -= local36.left + local36.right;
			Static253.anInt4653 -= local36.top + local36.bottom;
		}
		if (Static269.method4147() >= 2) {
			Static194.anInt3876 = Static187.anInt3577;
			Static310.anInt5534 = 0;
			Static288.anInt5232 = Static253.anInt4653;
			Static24.anInt500 = 0;
		} else {
			Static194.anInt3876 = 765;
			Static288.anInt5232 = 503;
			Static24.anInt500 = 0;
			Static310.anInt5534 = (Static187.anInt3577 - 765) / 2;
		}
		if (Static71.aBoolean165) {
			Static71.method1410(Static194.anInt3876, Static288.anInt5232);
		}
		Static229.aCanvas2.setSize(Static194.anInt3876, Static288.anInt5232);
		if (Static311.aFrame2 == local10) {
			local36 = Static311.aFrame2.getInsets();
			Static229.aCanvas2.setLocation(Static310.anInt5534 + local36.left, local36.top + Static24.anInt500);
		} else {
			Static229.aCanvas2.setLocation(Static310.anInt5534, Static24.anInt500);
		}
		if (Static315.anInt5636 != -1) {
			Static270.method4170(true);
		}
		Static51.method940();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIB)V")
	public static void method4673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > arg1) {
			Static103.method1978(arg3, arg2, arg1, Static40.anIntArrayArray6[arg0]);
		} else {
			Static103.method1978(arg3, arg1, arg2, Static40.anIntArrayArray6[arg0]);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!lk;I)V")
	public static void method4674(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5_Sub13 arg1) {
		Static37.anInt687 = 0;
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(24) int[] local24 = arg1.anIntArray273;
		@Pc(26) byte local26 = -1;
		@Pc(29) int[] local29 = arg1.anIntArray272;
		@Pc(628) int local628;
		try {
			@Pc(31) int local31 = 0;
			label4490: while (true) {
				local31++;
				if (local31 > arg0) {
					throw new RuntimeException("slow");
				}
				local21++;
				@Pc(46) int local46 = local24[local21];
				@Pc(633) int local633;
				@Pc(476) int local476;
				@Pc(435) String local435;
				if (local46 < 100) {
					if (local46 == 0) {
						Static253.anIntArray519[local13++] = local29[local21];
						continue;
					}
					@Pc(70) int local70;
					if (local46 == 1) {
						local70 = local29[local21];
						Static253.anIntArray519[local13++] = Static99.anIntArray148[local70];
						continue;
					}
					if (local46 == 2) {
						local70 = local29[local21];
						local13--;
						Static213.method4575(Static253.anIntArray519[local13], local70);
						continue;
					}
					if (local46 == 3) {
						Static136.aStringArray16[local19++] = arg1.aStringArray20[local21];
						continue;
					}
					if (local46 == 6) {
						local21 += local29[local21];
						continue;
					}
					if (local46 == 7) {
						local13 -= 2;
						if (Static253.anIntArray519[local13] != Static253.anIntArray519[local13 + 1]) {
							local21 += local29[local21];
						}
						continue;
					}
					if (local46 == 8) {
						local13 -= 2;
						if (Static253.anIntArray519[local13] == Static253.anIntArray519[local13 + 1]) {
							local21 += local29[local21];
						}
						continue;
					}
					if (local46 == 9) {
						local13 -= 2;
						if (Static253.anIntArray519[local13 + 1] > Static253.anIntArray519[local13]) {
							local21 += local29[local21];
						}
						continue;
					}
					if (local46 == 10) {
						local13 -= 2;
						if (Static253.anIntArray519[local13 + 1] < Static253.anIntArray519[local13]) {
							local21 += local29[local21];
						}
						continue;
					}
					if (local46 == 21) {
						if (Static37.anInt687 == 0) {
							return;
						}
						@Pc(244) Class83 local244 = Static261.aClass83Array1[--Static37.anInt687];
						Static212.anIntArray452 = local244.anIntArray159;
						Static254.aStringArray31 = local244.aStringArray13;
						arg1 = local244.aClass1_Sub5_Sub13_1;
						local24 = arg1.anIntArray273;
						local21 = local244.anInt2284;
						local29 = arg1.anIntArray272;
						continue;
					}
					if (local46 == 25) {
						local70 = local29[local21];
						Static253.anIntArray519[local13++] = Static11.method173(local70);
						continue;
					}
					if (local46 == 27) {
						local70 = local29[local21];
						local13--;
						Static212.method3491(Static253.anIntArray519[local13], local70);
						continue;
					}
					if (local46 == 31) {
						local13 -= 2;
						if (Static253.anIntArray519[local13 + 1] >= Static253.anIntArray519[local13]) {
							local21 += local29[local21];
						}
						continue;
					}
					if (local46 == 32) {
						local13 -= 2;
						if (Static253.anIntArray519[local13] >= Static253.anIntArray519[local13 + 1]) {
							local21 += local29[local21];
						}
						continue;
					}
					if (local46 == 33) {
						Static253.anIntArray519[local13++] = Static212.anIntArray452[local29[local21]];
						continue;
					}
					@Pc(376) int local376;
					if (local46 == 34) {
						local376 = local29[local21];
						local13--;
						Static212.anIntArray452[local376] = Static253.anIntArray519[local13];
						continue;
					}
					if (local46 == 35) {
						Static136.aStringArray16[local19++] = Static254.aStringArray31[local29[local21]];
						continue;
					}
					if (local46 == 36) {
						local376 = local29[local21];
						local19--;
						Static254.aStringArray31[local376] = Static136.aStringArray16[local19];
						continue;
					}
					if (local46 == 37) {
						local70 = local29[local21];
						local19 -= local70;
						local435 = Static199.method3411(Static136.aStringArray16, local19, local70);
						Static136.aStringArray16[local19++] = local435;
						continue;
					}
					if (local46 == 38) {
						local13--;
						continue;
					}
					if (local46 == 39) {
						local19--;
						continue;
					}
					if (local46 == 40) {
						local70 = local29[local21];
						@Pc(466) Class1_Sub5_Sub13 local466 = Static140.method2470(local70);
						@Pc(470) String[] local470 = new String[local466.anInt3155];
						@Pc(474) int[] local474 = new int[local466.anInt3162];
						for (local476 = 0; local476 < local466.anInt3154; local476++) {
							local474[local476] = Static253.anIntArray519[local476 + local13 - local466.anInt3154];
						}
						for (local476 = 0; local476 < local466.anInt3159; local476++) {
							local470[local476] = Static136.aStringArray16[local476 + local19 - local466.anInt3159];
						}
						local13 -= local466.anInt3154;
						local19 -= local466.anInt3159;
						@Pc(533) Class83 local533 = new Class83();
						local533.aStringArray13 = Static254.aStringArray31;
						local533.aClass1_Sub5_Sub13_1 = arg1;
						local533.anInt2284 = local21;
						local533.anIntArray159 = Static212.anIntArray452;
						if (Static37.anInt687 >= Static261.aClass83Array1.length) {
							throw new RuntimeException();
						}
						local21 = -1;
						arg1 = local466;
						Static261.aClass83Array1[Static37.anInt687++] = local533;
						Static212.anIntArray452 = local474;
						local29 = local466.anIntArray272;
						Static254.aStringArray31 = local470;
						local24 = local466.anIntArray273;
						continue;
					}
					if (local46 == 42) {
						Static253.anIntArray519[local13++] = Static126.anIntArray124[local29[local21]];
						continue;
					}
					if (local46 == 43) {
						local70 = local29[local21];
						local13--;
						Static126.anIntArray124[local70] = Static253.anIntArray519[local13];
						Static276.method4233(local70);
						continue;
					}
					if (local46 == 44) {
						local628 = local29[local21] & 0xFFFF;
						local13--;
						local633 = Static253.anIntArray519[local13];
						local70 = local29[local21] >> 16;
						if (local633 >= 0 && local633 <= 5000) {
							Static140.anIntArray240[local70] = local633;
							@Pc(655) byte local655 = -1;
							if (local628 == 105) {
								local655 = 0;
							}
							local476 = 0;
							while (true) {
								if (local476 >= local633) {
									continue label4490;
								}
								Static253.anIntArrayArray36[local70][local476] = local655;
								local476++;
							}
						}
						throw new RuntimeException();
					}
					if (local46 == 45) {
						local70 = local29[local21];
						local13--;
						local628 = Static253.anIntArray519[local13];
						if (local628 >= 0 && Static140.anIntArray240[local70] > local628) {
							Static253.anIntArray519[local13++] = Static253.anIntArrayArray36[local70][local628];
							continue;
						}
						throw new RuntimeException();
					}
					if (local46 == 46) {
						local13 -= 2;
						local628 = Static253.anIntArray519[local13];
						local70 = local29[local21];
						if (local628 >= 0 && Static140.anIntArray240[local70] > local628) {
							Static253.anIntArrayArray36[local70][local628] = Static253.anIntArray519[local13 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local46 == 47) {
						@Pc(771) String local771 = Static78.aStringArray10[local29[local21]];
						if (local771 == null) {
							local771 = "null";
						}
						Static136.aStringArray16[local19++] = local771;
						continue;
					}
					if (local46 == 48) {
						local70 = local29[local21];
						local19--;
						Static78.aStringArray10[local70] = Static136.aStringArray16[local19];
						Static277.method4240(local70);
						continue;
					}
					if (local46 == 51) {
						@Pc(816) Class86 local816 = arg1.aClass86Array1[local29[local21]];
						local13--;
						@Pc(826) Class1_Sub22 local826 = (Class1_Sub22) local816.method2136((long) Static253.anIntArray519[local13]);
						if (local826 != null) {
							local21 += local826.anInt3973;
						}
						continue;
					}
				}
				@Pc(845) boolean local845;
				if (local29[local21] == 1) {
					local845 = true;
				} else {
					local845 = false;
				}
				@Pc(1088) Class157 local1088;
				@Pc(886) Class157 local886;
				@Pc(914) int local914;
				@Pc(1013) Class157 local1013;
				@Pc(873) int local873;
				if (local46 < 300) {
					if (local46 == 100) {
						local13 -= 3;
						local633 = Static253.anIntArray519[local13 + 1];
						local628 = Static253.anIntArray519[local13];
						local873 = Static253.anIntArray519[local13 + 2];
						if (local633 == 0) {
							throw new RuntimeException();
						}
						local886 = Static206.method3444(local628);
						if (local886.aClass157Array2 == null) {
							local886.aClass157Array2 = new Class157[local873 + 1];
						}
						if (local886.aClass157Array2.length <= local873) {
							@Pc(912) Class157[] local912 = new Class157[local873 + 1];
							for (local914 = 0; local914 < local886.aClass157Array2.length; local914++) {
								local912[local914] = local886.aClass157Array2[local914];
							}
							local886.aClass157Array2 = local912;
						}
						if (local873 > 0 && local886.aClass157Array2[local873 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local873 - 1));
						}
						@Pc(967) Class157 local967 = new Class157();
						local967.aBoolean445 = true;
						local967.anInt4748 = local633;
						local967.anInt4692 = local873;
						local967.anInt4671 = local967.anInt4672 = local886.anInt4672;
						local886.aClass157Array2[local873] = local967;
						if (local845) {
							Static44.aClass157_4 = local967;
						} else {
							Static28.aClass157_3 = local967;
						}
						Static224.method3621(local886);
						continue;
					}
					@Pc(1036) Class157 local1036;
					if (local46 == 101) {
						local1013 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
						if (local1013.anInt4692 == -1) {
							if (!local845) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1036 = Static206.method3444(local1013.anInt4672);
						local1036.aClass157Array2[local1013.anInt4692] = null;
						Static224.method3621(local1036);
						continue;
					}
					if (local46 == 102) {
						local13--;
						local1013 = Static206.method3444(Static253.anIntArray519[local13]);
						local1013.aClass157Array2 = null;
						Static224.method3621(local1013);
						continue;
					}
					if (local46 == 200) {
						local13 -= 2;
						local633 = Static253.anIntArray519[local13 + 1];
						local628 = Static253.anIntArray519[local13];
						local1088 = Static209.method3469(local628, local633);
						if (local1088 != null && local633 != -1) {
							Static253.anIntArray519[local13++] = 1;
							if (local845) {
								Static44.aClass157_4 = local1088;
							} else {
								Static28.aClass157_3 = local1088;
							}
							continue;
						}
						Static253.anIntArray519[local13++] = 0;
						continue;
					}
					if (local46 == 201) {
						local13--;
						local628 = Static253.anIntArray519[local13];
						local1036 = Static206.method3444(local628);
						if (local1036 == null) {
							Static253.anIntArray519[local13++] = 0;
						} else {
							Static253.anIntArray519[local13++] = 1;
							if (local845) {
								Static44.aClass157_4 = local1036;
							} else {
								Static28.aClass157_3 = local1036;
							}
						}
						continue;
					}
				} else {
					@Pc(1283) boolean local1283;
					if (local46 < 500) {
						if (local46 == 403) {
							local13 -= 2;
							local628 = Static253.anIntArray519[local13];
							local633 = Static253.anIntArray519[local13 + 1];
							for (local873 = 0; local873 < Static107.anIntArray158.length; local873++) {
								if (local628 == Static107.anIntArray158[local873]) {
									Static138.aClass11_Sub4_Sub1_3.aClass61_2.method1705(local873, local633);
									continue label4490;
								}
							}
							local873 = 0;
							while (true) {
								if (local873 >= Static1.anIntArray4.length) {
									continue label4490;
								}
								if (Static1.anIntArray4[local873] == local628) {
									Static138.aClass11_Sub4_Sub1_3.aClass61_2.method1705(local873, local633);
									continue label4490;
								}
								local873++;
							}
						}
						if (local46 == 404) {
							local13 -= 2;
							local628 = Static253.anIntArray519[local13];
							local633 = Static253.anIntArray519[local13 + 1];
							Static138.aClass11_Sub4_Sub1_3.aClass61_2.method1703(local633, local628);
							continue;
						}
						if (local46 == 410) {
							local13--;
							local1283 = Static253.anIntArray519[local13] != 0;
							Static138.aClass11_Sub4_Sub1_3.aClass61_2.method1704(local1283);
							continue;
						}
					} else {
						@Pc(1511) boolean local1511;
						if ((local46 < 1000 || local46 >= 1100) && (local46 < 2000 || local46 >= 2100)) {
							@Pc(2898) String local2898;
							if (local46 >= 1100 && local46 < 1200 || !(local46 < 2100 || local46 >= 2200)) {
								if (local46 >= 2000) {
									local13--;
									local1013 = Static206.method3444(Static253.anIntArray519[local13]);
									local46 -= 1000;
								} else {
									local1013 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
								}
								if (local46 == 1100) {
									local13 -= 2;
									local1013.anInt4679 = Static253.anIntArray519[local13];
									if (local1013.anInt4727 - local1013.anInt4680 < local1013.anInt4679) {
										local1013.anInt4679 = local1013.anInt4727 - local1013.anInt4680;
									}
									if (local1013.anInt4679 < 0) {
										local1013.anInt4679 = 0;
									}
									local1013.anInt4693 = Static253.anIntArray519[local13 + 1];
									if (local1013.anInt4683 - local1013.anInt4689 < local1013.anInt4693) {
										local1013.anInt4693 = local1013.anInt4683 - local1013.anInt4689;
									}
									if (local1013.anInt4693 < 0) {
										local1013.anInt4693 = 0;
									}
									Static224.method3621(local1013);
									if (local1013.anInt4692 == -1) {
										Static67.method1157(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1101) {
									local13--;
									local1013.anInt4703 = Static253.anIntArray519[local13];
									Static224.method3621(local1013);
									if (local1013.anInt4692 == -1) {
										Static295.method4412(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1102) {
									local13--;
									local1013.aBoolean443 = Static253.anIntArray519[local13] == 1;
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1103) {
									local13--;
									local1013.anInt4713 = Static253.anIntArray519[local13];
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1104) {
									local13--;
									local1013.anInt4711 = Static253.anIntArray519[local13];
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1105) {
									local13--;
									local1013.anInt4673 = Static253.anIntArray519[local13];
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1106) {
									local13--;
									local1013.anInt4663 = Static253.anIntArray519[local13];
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1107) {
									local13--;
									local1013.aBoolean440 = Static253.anIntArray519[local13] == 1;
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1108) {
									local1013.anInt4669 = 1;
									local13--;
									local1013.anInt4668 = Static253.anIntArray519[local13];
									Static224.method3621(local1013);
									if (local1013.anInt4692 == -1) {
										Static155.method2677(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1109) {
									local13 -= 6;
									local1013.anInt4696 = Static253.anIntArray519[local13];
									local1013.anInt4736 = Static253.anIntArray519[local13 + 1];
									local1013.anInt4666 = Static253.anIntArray519[local13 + 2];
									local1013.anInt4745 = Static253.anIntArray519[local13 + 3];
									local1013.anInt4722 = Static253.anIntArray519[local13 + 4];
									local1013.anInt4706 = Static253.anIntArray519[local13 + 5];
									Static224.method3621(local1013);
									if (local1013.anInt4692 == -1) {
										Static94.method1802(local1013.anInt4672);
										Static288.method4343(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1110) {
									local13--;
									local633 = Static253.anIntArray519[local13];
									if (local633 != local1013.anInt4721) {
										local1013.anInt4721 = local633;
										local1013.anInt4732 = 0;
										local1013.anInt4724 = 1;
										local1013.anInt4714 = 0;
										Static224.method3621(local1013);
									}
									if (local1013.anInt4692 == -1) {
										Static69.method1329(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1111) {
									local13--;
									local1013.aBoolean446 = Static253.anIntArray519[local13] == 1;
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1112) {
									local19--;
									local2898 = Static136.aStringArray16[local19];
									if (!local2898.equals(local1013.aString169)) {
										local1013.aString169 = local2898;
										Static224.method3621(local1013);
									}
									if (local1013.anInt4692 == -1) {
										Static138.method3841(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1113) {
									local13--;
									local1013.anInt4688 = Static253.anIntArray519[local13];
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1114) {
									local13 -= 3;
									local1013.anInt4687 = Static253.anIntArray519[local13];
									local1013.anInt4677 = Static253.anIntArray519[local13 + 1];
									local1013.anInt4728 = Static253.anIntArray519[local13 + 2];
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1115) {
									local13--;
									local1013.aBoolean441 = Static253.anIntArray519[local13] == 1;
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1116) {
									local13--;
									local1013.anInt4701 = Static253.anIntArray519[local13];
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1117) {
									local13--;
									local1013.anInt4675 = Static253.anIntArray519[local13];
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1118) {
									local13--;
									local1013.aBoolean439 = Static253.anIntArray519[local13] == 1;
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1119) {
									local13--;
									local1013.aBoolean438 = Static253.anIntArray519[local13] == 1;
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1120) {
									local13 -= 2;
									local1013.anInt4727 = Static253.anIntArray519[local13];
									local1013.anInt4683 = Static253.anIntArray519[local13 + 1];
									Static224.method3621(local1013);
									if (local1013.anInt4748 == 0) {
										Static39.method676(local1013, false);
									}
									continue;
								}
								if (local46 == 1121) {
									local13 -= 2;
									local1013.aShort46 = (short) Static253.anIntArray519[local13];
									local1013.aShort47 = (short) Static253.anIntArray519[local13 + 1];
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1122) {
									local13--;
									local1013.aBoolean434 = Static253.anIntArray519[local13] == 1;
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1123) {
									local13--;
									local1013.anInt4706 = Static253.anIntArray519[local13];
									Static224.method3621(local1013);
									if (local1013.anInt4692 == -1) {
										Static94.method1802(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1124) {
									local13--;
									local633 = Static253.anIntArray519[local13];
									local1013.aBoolean437 = local633 == 1;
									Static224.method3621(local1013);
									continue;
								}
							} else if (local46 >= 1200 && local46 < 1300 || local46 >= 2200 && local46 < 2300) {
								if (local46 >= 2000) {
									local46 -= 1000;
									local13--;
									local1013 = Static206.method3444(Static253.anIntArray519[local13]);
								} else {
									local1013 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
								}
								Static224.method3621(local1013);
								if (local46 == 1200 || local46 == 1205 || local46 == 1208 || local46 == 1209) {
									local13 -= 2;
									local633 = Static253.anIntArray519[local13];
									local873 = Static253.anIntArray519[local13 + 1];
									if (local1013.anInt4692 == -1) {
										Static106.method3319(local1013.anInt4672);
										Static94.method1802(local1013.anInt4672);
										Static288.method4343(local1013.anInt4672);
									}
									if (local633 == -1) {
										local1013.anInt4720 = -1;
										local1013.anInt4668 = -1;
										local1013.anInt4669 = 1;
									} else {
										if (local46 == 1208 || local46 == 1209) {
											local1013.aBoolean444 = true;
										} else {
											local1013.aBoolean444 = false;
										}
										local1013.anInt4735 = local873;
										local1013.anInt4720 = local633;
										@Pc(1734) Class3 local1734 = Static69.method1330(local633);
										local1013.anInt4722 = local1734.anInt120;
										local1013.anInt4745 = local1734.anInt147;
										local1013.anInt4706 = local1734.anInt169;
										local1013.anInt4666 = local1734.anInt132;
										local1013.anInt4736 = local1734.anInt146;
										if (local1013.anInt4718 > 0) {
											local1013.anInt4706 = local1013.anInt4706 * 32 / local1013.anInt4718;
										} else if (local1013.anInt4665 > 0) {
											local1013.anInt4706 = local1013.anInt4706 * 32 / local1013.anInt4665;
										}
										if (local46 == 1205) {
											local1013.aBoolean451 = false;
										} else {
											local1013.aBoolean451 = true;
										}
										local1013.anInt4696 = local1734.anInt129;
									}
									continue;
								}
								if (local46 == 1201) {
									local1013.anInt4669 = 2;
									local13--;
									local1013.anInt4668 = Static253.anIntArray519[local13];
									if (local1013.anInt4692 == -1) {
										Static155.method2677(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1202) {
									local1013.anInt4669 = 3;
									local1013.anInt4668 = Static138.aClass11_Sub4_Sub1_3.aClass61_2.method1710();
									if (local1013.anInt4692 == -1) {
										Static155.method2677(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1203) {
									local1013.anInt4669 = 6;
									local13--;
									local1013.anInt4668 = Static253.anIntArray519[local13];
									if (local1013.anInt4692 == -1) {
										Static155.method2677(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1204) {
									local1013.anInt4669 = 5;
									local13--;
									local1013.anInt4668 = Static253.anIntArray519[local13];
									if (local1013.anInt4692 == -1) {
										Static155.method2677(local1013.anInt4672);
									}
									continue;
								}
								if (local46 == 1206) {
									local13 -= 4;
									local1013.anInt4716 = Static253.anIntArray519[local13];
									local1013.anInt4682 = Static253.anIntArray519[local13 + 1];
									local1013.anInt4710 = Static253.anIntArray519[local13 + 2];
									local1013.anInt4737 = Static253.anIntArray519[local13 + 3];
									Static224.method3621(local1013);
									continue;
								}
								if (local46 == 1207) {
									local13 -= 2;
									local1013.anInt4676 = Static253.anIntArray519[local13];
									local1013.anInt4684 = Static253.anIntArray519[local13 + 1];
									Static224.method3621(local1013);
									continue;
								}
							} else if (local46 >= 1300 && local46 < 1400 || local46 >= 2300 && local46 < 2400) {
								if (local46 >= 2000) {
									local46 -= 1000;
									local13--;
									local1013 = Static206.method3444(Static253.anIntArray519[local13]);
								} else {
									local1013 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
								}
								if (local46 == 1300) {
									local13--;
									local633 = Static253.anIntArray519[local13] - 1;
									if (local633 >= 0 && local633 <= 9) {
										local19--;
										local1013.method3977(local633, Static136.aStringArray16[local19]);
										continue;
									}
									local19--;
									continue;
								}
								if (local46 == 1301) {
									local13 -= 2;
									local633 = Static253.anIntArray519[local13];
									local873 = Static253.anIntArray519[local13 + 1];
									local1013.aClass157_16 = Static209.method3469(local633, local873);
									continue;
								}
								if (local46 == 1302) {
									local13--;
									local1013.aBoolean449 = Static253.anIntArray519[local13] == 1;
									continue;
								}
								if (local46 == 1303) {
									local13--;
									local1013.anInt4667 = Static253.anIntArray519[local13];
									continue;
								}
								if (local46 == 1304) {
									local13--;
									local1013.anInt4670 = Static253.anIntArray519[local13];
									continue;
								}
								if (local46 == 1305) {
									local19--;
									local1013.aString170 = Static136.aStringArray16[local19];
									continue;
								}
								if (local46 == 1306) {
									local19--;
									local1013.aString168 = Static136.aStringArray16[local19];
									continue;
								}
								if (local46 == 1307) {
									local1013.aStringArray32 = null;
									continue;
								}
								if (local46 == 1308) {
									local13--;
									local1013.anInt4742 = Static253.anIntArray519[local13];
									local13--;
									local1013.anInt4661 = Static253.anIntArray519[local13];
									continue;
								}
								if (local46 == 1309) {
									local13--;
									local633 = Static253.anIntArray519[local13];
									local13--;
									local873 = Static253.anIntArray519[local13];
									if (local873 >= 1 && local873 <= 10) {
										local1013.method3970(local873 - 1, local633);
									}
									continue;
								}
								if (local46 == 1310) {
									local19--;
									local1013.aString172 = Static136.aStringArray16[local19];
									continue;
								}
							} else {
								@Pc(4366) int local4366;
								if (local46 >= 1400 && local46 < 1500 || local46 >= 2400 && local46 < 2500) {
									if (local46 < 2000) {
										local1013 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
									} else {
										local13--;
										local1013 = Static206.method3444(Static253.anIntArray519[local13]);
										local46 -= 1000;
									}
									local19--;
									local2898 = Static136.aStringArray16[local19];
									@Pc(13892) int[] local13892 = null;
									if (local2898.length() > 0 && local2898.charAt(local2898.length() - 1) == 'Y') {
										local13--;
										local476 = Static253.anIntArray519[local13];
										if (local476 > 0) {
											local13892 = new int[local476];
											while (local476-- > 0) {
												local13--;
												local13892[local476] = Static253.anIntArray519[local13];
											}
										}
										local2898 = local2898.substring(0, local2898.length() - 1);
									}
									@Pc(13944) Object[] local13944 = new Object[local2898.length() + 1];
									for (local4366 = local13944.length - 1; local4366 >= 1; local4366--) {
										if (local2898.charAt(local4366 - 1) == 's') {
											local19--;
											local13944[local4366] = Static136.aStringArray16[local19];
										} else {
											local13--;
											local13944[local4366] = Integer.valueOf(Static253.anIntArray519[local13]);
										}
									}
									local13--;
									local4366 = Static253.anIntArray519[local13];
									if (local4366 == -1) {
										local13944 = null;
									} else {
										local13944[0] = Integer.valueOf(local4366);
									}
									if (local46 == 1400) {
										local1013.anObjectArray6 = local13944;
									} else if (local46 == 1401) {
										local1013.anObjectArray23 = local13944;
									} else if (local46 == 1402) {
										local1013.anObjectArray5 = local13944;
									} else if (local46 == 1403) {
										local1013.anObjectArray32 = local13944;
									} else if (local46 == 1404) {
										local1013.anObjectArray11 = local13944;
									} else if (local46 == 1405) {
										local1013.anObjectArray16 = local13944;
									} else if (local46 == 1406) {
										local1013.anObjectArray8 = local13944;
									} else if (local46 == 1407) {
										local1013.anIntArray535 = local13892;
										local1013.anObjectArray18 = local13944;
									} else if (local46 == 1408) {
										local1013.anObjectArray9 = local13944;
									} else if (local46 == 1409) {
										local1013.anObjectArray29 = local13944;
									} else if (local46 == 1410) {
										local1013.anObjectArray17 = local13944;
									} else if (local46 == 1411) {
										local1013.anObjectArray15 = local13944;
									} else if (local46 == 1412) {
										local1013.anObjectArray24 = local13944;
									} else if (local46 == 1414) {
										local1013.anObjectArray10 = local13944;
										local1013.anIntArray540 = local13892;
									} else if (local46 == 1415) {
										local1013.anIntArray523 = local13892;
										local1013.anObjectArray27 = local13944;
									} else if (local46 == 1416) {
										local1013.anObjectArray12 = local13944;
									} else if (local46 == 1417) {
										local1013.anObjectArray25 = local13944;
									} else if (local46 == 1418) {
										local1013.anObjectArray20 = local13944;
									} else if (local46 == 1419) {
										local1013.anObjectArray4 = local13944;
									} else if (local46 == 1420) {
										local1013.anObjectArray26 = local13944;
									} else if (local46 == 1421) {
										local1013.anObjectArray14 = local13944;
									} else if (local46 == 1422) {
										local1013.anObjectArray21 = local13944;
									} else if (local46 == 1423) {
										local1013.anObjectArray22 = local13944;
									} else if (local46 == 1424) {
										local1013.anObjectArray28 = local13944;
									} else if (local46 == 1425) {
										local1013.anObjectArray30 = local13944;
									} else if (local46 == 1426) {
										local1013.anObjectArray13 = local13944;
									} else if (local46 == 1427) {
										local1013.anObjectArray3 = local13944;
									} else if (local46 == 1428) {
										local1013.anIntArray531 = local13892;
										local1013.anObjectArray19 = local13944;
									} else if (local46 == 1429) {
										local1013.anIntArray525 = local13892;
										local1013.anObjectArray31 = local13944;
									}
									local1013.aBoolean442 = true;
									continue;
								}
								if (local46 < 1600) {
									local1013 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
									if (local46 == 1500) {
										Static253.anIntArray519[local13++] = local1013.anInt4729;
										continue;
									}
									if (local46 == 1501) {
										Static253.anIntArray519[local13++] = local1013.anInt4715;
										continue;
									}
									if (local46 == 1502) {
										Static253.anIntArray519[local13++] = local1013.anInt4680;
										continue;
									}
									if (local46 == 1503) {
										Static253.anIntArray519[local13++] = local1013.anInt4689;
										continue;
									}
									if (local46 == 1504) {
										Static253.anIntArray519[local13++] = local1013.aBoolean435 ? 1 : 0;
										continue;
									}
									if (local46 == 1505) {
										Static253.anIntArray519[local13++] = local1013.anInt4671;
										continue;
									}
								} else if (local46 < 1700) {
									local1013 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
									if (local46 == 1600) {
										Static253.anIntArray519[local13++] = local1013.anInt4679;
										continue;
									}
									if (local46 == 1601) {
										Static253.anIntArray519[local13++] = local1013.anInt4693;
										continue;
									}
									if (local46 == 1602) {
										Static136.aStringArray16[local19++] = local1013.aString169;
										continue;
									}
									if (local46 == 1603) {
										Static253.anIntArray519[local13++] = local1013.anInt4727;
										continue;
									}
									if (local46 == 1604) {
										Static253.anIntArray519[local13++] = local1013.anInt4683;
										continue;
									}
									if (local46 == 1605) {
										Static253.anIntArray519[local13++] = local1013.anInt4706;
										continue;
									}
									if (local46 == 1606) {
										Static253.anIntArray519[local13++] = local1013.anInt4666;
										continue;
									}
									if (local46 == 1607) {
										Static253.anIntArray519[local13++] = local1013.anInt4722;
										continue;
									}
									if (local46 == 1608) {
										Static253.anIntArray519[local13++] = local1013.anInt4745;
										continue;
									}
									if (local46 == 1609) {
										Static253.anIntArray519[local13++] = local1013.anInt4713;
										continue;
									}
									if (local46 == 1610) {
										Static253.anIntArray519[local13++] = local1013.anInt4696;
										continue;
									}
									if (local46 == 1611) {
										Static253.anIntArray519[local13++] = local1013.anInt4736;
										continue;
									}
									if (local46 == 1612) {
										Static253.anIntArray519[local13++] = local1013.anInt4673;
										continue;
									}
								} else if (local46 < 1800) {
									local1013 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
									if (local46 == 1700) {
										Static253.anIntArray519[local13++] = local1013.anInt4720;
										continue;
									}
									if (local46 == 1701) {
										if (local1013.anInt4720 == -1) {
											Static253.anIntArray519[local13++] = 0;
										} else {
											Static253.anIntArray519[local13++] = local1013.anInt4735;
										}
										continue;
									}
									if (local46 == 1702) {
										Static253.anIntArray519[local13++] = local1013.anInt4692;
										continue;
									}
								} else if (local46 < 1900) {
									local1013 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
									if (local46 == 1800) {
										Static253.anIntArray519[local13++] = Static42.method777(local1013).method1126();
										continue;
									}
									if (local46 == 1801) {
										local13--;
										local633 = Static253.anIntArray519[local13];
										local633--;
										if (local1013.aStringArray32 != null && local1013.aStringArray32.length > local633 && local1013.aStringArray32[local633] != null) {
											Static136.aStringArray16[local19++] = local1013.aStringArray32[local633];
											continue;
										}
										Static136.aStringArray16[local19++] = "";
										continue;
									}
									if (local46 == 1802) {
										if (local1013.aString170 == null) {
											Static136.aStringArray16[local19++] = "";
										} else {
											Static136.aStringArray16[local19++] = local1013.aString170;
										}
										continue;
									}
								} else if (local46 < 2600) {
									local13--;
									local1013 = Static206.method3444(Static253.anIntArray519[local13]);
									if (local46 == 2500) {
										Static253.anIntArray519[local13++] = local1013.anInt4729;
										continue;
									}
									if (local46 == 2501) {
										Static253.anIntArray519[local13++] = local1013.anInt4715;
										continue;
									}
									if (local46 == 2502) {
										Static253.anIntArray519[local13++] = local1013.anInt4680;
										continue;
									}
									if (local46 == 2503) {
										Static253.anIntArray519[local13++] = local1013.anInt4689;
										continue;
									}
									if (local46 == 2504) {
										Static253.anIntArray519[local13++] = local1013.aBoolean435 ? 1 : 0;
										continue;
									}
									if (local46 == 2505) {
										Static253.anIntArray519[local13++] = local1013.anInt4671;
										continue;
									}
								} else if (local46 < 2700) {
									local13--;
									local1013 = Static206.method3444(Static253.anIntArray519[local13]);
									if (local46 == 2600) {
										Static253.anIntArray519[local13++] = local1013.anInt4679;
										continue;
									}
									if (local46 == 2601) {
										Static253.anIntArray519[local13++] = local1013.anInt4693;
										continue;
									}
									if (local46 == 2602) {
										Static136.aStringArray16[local19++] = local1013.aString169;
										continue;
									}
									if (local46 == 2603) {
										Static253.anIntArray519[local13++] = local1013.anInt4727;
										continue;
									}
									if (local46 == 2604) {
										Static253.anIntArray519[local13++] = local1013.anInt4683;
										continue;
									}
									if (local46 == 2605) {
										Static253.anIntArray519[local13++] = local1013.anInt4706;
										continue;
									}
									if (local46 == 2606) {
										Static253.anIntArray519[local13++] = local1013.anInt4666;
										continue;
									}
									if (local46 == 2607) {
										Static253.anIntArray519[local13++] = local1013.anInt4722;
										continue;
									}
									if (local46 == 2608) {
										Static253.anIntArray519[local13++] = local1013.anInt4745;
										continue;
									}
									if (local46 == 2609) {
										Static253.anIntArray519[local13++] = local1013.anInt4713;
										continue;
									}
									if (local46 == 2610) {
										Static253.anIntArray519[local13++] = local1013.anInt4696;
										continue;
									}
									if (local46 == 2611) {
										Static253.anIntArray519[local13++] = local1013.anInt4736;
										continue;
									}
									if (local46 == 2612) {
										Static253.anIntArray519[local13++] = local1013.anInt4673;
										continue;
									}
								} else if (local46 < 2800) {
									if (local46 == 2700) {
										local13--;
										local1013 = Static206.method3444(Static253.anIntArray519[local13]);
										Static253.anIntArray519[local13++] = local1013.anInt4720;
										continue;
									}
									if (local46 == 2701) {
										local13--;
										local1013 = Static206.method3444(Static253.anIntArray519[local13]);
										if (local1013.anInt4720 == -1) {
											Static253.anIntArray519[local13++] = 0;
										} else {
											Static253.anIntArray519[local13++] = local1013.anInt4735;
										}
										continue;
									}
									if (local46 == 2702) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										@Pc(13489) Class1_Sub20 local13489 = (Class1_Sub20) Static224.aClass86_27.method2136((long) local628);
										if (local13489 == null) {
											Static253.anIntArray519[local13++] = 0;
										} else {
											Static253.anIntArray519[local13++] = 1;
										}
										continue;
									}
									if (local46 == 2703) {
										local13--;
										local1013 = Static206.method3444(Static253.anIntArray519[local13]);
										if (local1013.aClass157Array2 == null) {
											Static253.anIntArray519[local13++] = 0;
											continue;
										}
										local633 = local1013.aClass157Array2.length;
										for (local873 = 0; local873 < local1013.aClass157Array2.length; local873++) {
											if (local1013.aClass157Array2[local873] == null) {
												local633 = local873;
												break;
											}
										}
										Static253.anIntArray519[local13++] = local633;
										continue;
									}
									if (local46 == 2704 || local46 == 2705) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										@Pc(13586) Class1_Sub20 local13586 = (Class1_Sub20) Static224.aClass86_27.method2136((long) local628);
										if (local13586 != null && local13586.anInt3422 == local633) {
											Static253.anIntArray519[local13++] = 1;
											continue;
										}
										Static253.anIntArray519[local13++] = 0;
										continue;
									}
								} else if (local46 < 2900) {
									local13--;
									local1013 = Static206.method3444(Static253.anIntArray519[local13]);
									if (local46 == 2800) {
										Static253.anIntArray519[local13++] = Static42.method777(local1013).method1126();
										continue;
									}
									if (local46 == 2801) {
										local13--;
										local633 = Static253.anIntArray519[local13];
										local633--;
										if (local1013.aStringArray32 != null && local1013.aStringArray32.length > local633 && local1013.aStringArray32[local633] != null) {
											Static136.aStringArray16[local19++] = local1013.aStringArray32[local633];
											continue;
										}
										Static136.aStringArray16[local19++] = "";
										continue;
									}
									if (local46 == 2802) {
										if (local1013.aString170 == null) {
											Static136.aStringArray16[local19++] = "";
										} else {
											Static136.aStringArray16[local19++] = local1013.aString170;
										}
										continue;
									}
								} else if (local46 < 3200) {
									if (local46 == 3100) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static305.method4555(local435, "", 0);
										continue;
									}
									if (local46 == 3101) {
										local13 -= 2;
										Static23.method466(Static253.anIntArray519[local13], Static138.aClass11_Sub4_Sub1_3, Static253.anIntArray519[local13 + 1]);
										continue;
									}
									if (local46 == 3103) {
										Static256.method4004();
										continue;
									}
									if (local46 == 3104) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										local633 = 0;
										if (Static53.method979(local435)) {
											local633 = Static194.method3363(local435);
										}
										Static116.aClass1_Sub13_Sub1_48.method1887(242);
										Static116.aClass1_Sub13_Sub1_48.method1851(local633);
										continue;
									}
									if (local46 == 3105) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static116.aClass1_Sub13_Sub1_48.method1887(67);
										Static116.aClass1_Sub13_Sub1_48.method1857(Static282.method4276(local435));
										continue;
									}
									if (local46 == 3106) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static116.aClass1_Sub13_Sub1_48.method1887(25);
										Static116.aClass1_Sub13_Sub1_48.method1822(local435.length() + 1);
										Static116.aClass1_Sub13_Sub1_48.method1852(local435);
										continue;
									}
									if (local46 == 3107) {
										local19--;
										local2898 = Static136.aStringArray16[local19];
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static267.method4133(local2898, local628);
										continue;
									}
									if (local46 == 3108) {
										local13 -= 3;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										local873 = Static253.anIntArray519[local13 + 2];
										local886 = Static206.method3444(local873);
										Static302.method4520(local628, local633, local886);
										continue;
									}
									if (local46 == 3109) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local1088 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
										local633 = Static253.anIntArray519[local13 + 1];
										Static302.method4520(local628, local633, local1088);
										continue;
									}
									if (local46 == 3110) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static116.aClass1_Sub13_Sub1_48.method1887(98);
										Static116.aClass1_Sub13_Sub1_48.method1835(local628);
										continue;
									}
								} else if (local46 < 3300) {
									if (local46 == 3200) {
										local13 -= 3;
										Static39.method680(Static253.anIntArray519[local13], Static253.anIntArray519[local13 + 1], 255, Static253.anIntArray519[local13 + 2]);
										continue;
									}
									if (local46 == 3201) {
										local13--;
										Static27.method505(Static253.anIntArray519[local13], 255);
										continue;
									}
									if (local46 == 3202) {
										local13 -= 2;
										Static247.method1453(Static253.anIntArray519[local13], Static253.anIntArray519[local13 + 1], 255);
										continue;
									}
								} else if (local46 < 3400) {
									if (local46 == 3300) {
										Static253.anIntArray519[local13++] = Static167.anInt637;
										continue;
									}
									if (local46 == 3301) {
										local13 -= 2;
										local633 = Static253.anIntArray519[local13 + 1];
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static264.method4068(local628, local633);
										continue;
									}
									if (local46 == 3302) {
										local13 -= 2;
										local633 = Static253.anIntArray519[local13 + 1];
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static204.method3572(local633, local628);
										continue;
									}
									if (local46 == 3303) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = Static160.method2743(local633, local628);
										continue;
									}
									if (local46 == 3304) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static179.method3040(local628).anInt5408;
										continue;
									}
									if (local46 == 3305) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static117.anIntArray170[local628];
										continue;
									}
									if (local46 == 3306) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static141.anIntArray242[local628];
										continue;
									}
									if (local46 == 3307) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static301.anIntArray594[local628];
										continue;
									}
									if (local46 == 3308) {
										local633 = (Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7) + Static38.anInt714;
										local628 = Static132.anInt2608;
										local873 = (Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7) + Static135.anInt2659;
										Static253.anIntArray519[local13++] = (local633 << 14) + ((local628 << 28) + local873);
										continue;
									}
									if (local46 == 3309) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = local628 >> 14 & 0x3FFF;
										continue;
									}
									if (local46 == 3310) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = local628 >> 28;
										continue;
									}
									if (local46 == 3311) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = local628 & 0x3FFF;
										continue;
									}
									if (local46 == 3312) {
										Static253.anIntArray519[local13++] = Static217.aBoolean369 ? 1 : 0;
										continue;
									}
									if (local46 == 3313) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13] + 32768;
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = Static264.method4068(local628, local633);
										continue;
									}
									if (local46 == 3314) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13] + 32768;
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = Static204.method3572(local633, local628);
										continue;
									}
									if (local46 == 3315) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13] + 32768;
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = Static160.method2743(local633, local628);
										continue;
									}
									if (local46 == 3316) {
										if (Static142.anInt2785 >= 2) {
											Static253.anIntArray519[local13++] = Static142.anInt2785;
										} else {
											Static253.anIntArray519[local13++] = 0;
										}
										continue;
									}
									if (local46 == 3317) {
										Static253.anIntArray519[local13++] = Static263.anInt4869;
										continue;
									}
									if (local46 == 3318) {
										Static253.anIntArray519[local13++] = Static124.anInt596;
										continue;
									}
									if (local46 == 3321) {
										Static253.anIntArray519[local13++] = Static39.anInt742;
										continue;
									}
									if (local46 == 3322) {
										Static253.anIntArray519[local13++] = Static189.anInt3635;
										continue;
									}
									if (local46 == 3323) {
										if (Static143.anInt2794 >= 5 && Static143.anInt2794 <= 9) {
											Static253.anIntArray519[local13++] = 1;
											continue;
										}
										Static253.anIntArray519[local13++] = 0;
										continue;
									}
									if (local46 == 3324) {
										if (Static143.anInt2794 >= 5 && Static143.anInt2794 <= 9) {
											Static253.anIntArray519[local13++] = Static143.anInt2794;
											continue;
										}
										Static253.anIntArray519[local13++] = 0;
										continue;
									}
									if (local46 == 3325) {
										Static253.anIntArray519[local13++] = Static309.aBoolean525 ? 1 : 0;
										continue;
									}
									if (local46 == 3326) {
										Static253.anIntArray519[local13++] = Static138.aClass11_Sub4_Sub1_3.anInt3015;
										continue;
									}
									if (local46 == 3327) {
										Static253.anIntArray519[local13++] = Static138.aClass11_Sub4_Sub1_3.aClass61_2.aBoolean180 ? 1 : 0;
										continue;
									}
									if (local46 == 3328) {
										Static253.anIntArray519[local13++] = Static287.aBoolean492 && !Static294.aBoolean110 ? 1 : 0;
										continue;
									}
									if (local46 == 3329) {
										Static253.anIntArray519[local13++] = Static220.aBoolean372 ? 1 : 0;
										continue;
									}
									if (local46 == 3330) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static165.method4613(local628);
										continue;
									}
									if (local46 == 3331) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = Static133.method2326(local628, false, local633);
										continue;
									}
									if (local46 == 3332) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = Static133.method2326(local628, true, local633);
										continue;
									}
									if (local46 == 3333) {
										Static253.anIntArray519[local13++] = Static261.anInt4828;
										continue;
									}
									if (local46 == 3335) {
										Static253.anIntArray519[local13++] = Static114.anInt2343;
										continue;
									}
									if (local46 == 3336) {
										local13 -= 4;
										local873 = Static253.anIntArray519[local13 + 2];
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										local628 += local633 << 14;
										local628 += local873 << 28;
										local476 = Static253.anIntArray519[local13 + 3];
										local628 += local476;
										Static253.anIntArray519[local13++] = local628;
										continue;
									}
									if (local46 == 3337) {
										Static253.anIntArray519[local13++] = Static158.anInt3622;
										continue;
									}
								} else if (local46 < 3500) {
									@Pc(3735) Class1_Sub5_Sub15 local3735;
									if (local46 == 3400) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										local3735 = Static114.method2082(local628);
										if (local3735.aChar3 != 's') {
										}
										Static136.aStringArray16[local19++] = local3735.method3182(local633);
										continue;
									}
									if (local46 == 3408) {
										local13 -= 4;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										local873 = Static253.anIntArray519[local13 + 2];
										local476 = Static253.anIntArray519[local13 + 3];
										@Pc(3780) Class1_Sub5_Sub15 local3780 = Static114.method2082(local873);
										if (local628 == local3780.aChar2 && local633 == local3780.aChar3) {
											if (local633 == 115) {
												Static136.aStringArray16[local19++] = local3780.method3182(local476);
											} else {
												Static253.anIntArray519[local13++] = local3780.method3179(local476);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local46 == 3409) {
										local13 -= 3;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										local873 = Static253.anIntArray519[local13 + 2];
										if (local633 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(3861) Class1_Sub5_Sub15 local3861 = Static114.method2082(local633);
										if (local3861.aChar3 != local628) {
											throw new RuntimeException("C3409-1");
										}
										Static253.anIntArray519[local13++] = local3861.method3177(local873) ? 1 : 0;
										continue;
									}
									if (local46 == 3410) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										local19--;
										local2898 = Static136.aStringArray16[local19];
										if (local628 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local3735 = Static114.method2082(local628);
										if (local3735.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static253.anIntArray519[local13++] = local3735.method3175(local2898) ? 1 : 0;
										continue;
									}
									if (local46 == 3411) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										@Pc(3948) Class1_Sub5_Sub15 local3948 = Static114.method2082(local628);
										Static253.anIntArray519[local13++] = local3948.aClass86_22.method2135();
										continue;
									}
								} else if (local46 < 3700) {
									if (local46 == 3600) {
										if (Static118.anInt2406 == 0) {
											Static253.anIntArray519[local13++] = -2;
										} else if (Static118.anInt2406 == 1) {
											Static253.anIntArray519[local13++] = -1;
										} else {
											Static253.anIntArray519[local13++] = Static144.anInt2798;
										}
										continue;
									}
									if (local46 == 3601) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static118.anInt2406 == 2 && Static144.anInt2798 > local628) {
											Static136.aStringArray16[local19++] = Static19.aStringArray4[local628];
											continue;
										}
										Static136.aStringArray16[local19++] = "";
										continue;
									}
									if (local46 == 3602) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static118.anInt2406 == 2 && Static144.anInt2798 > local628) {
											Static253.anIntArray519[local13++] = Static58.anIntArray96[local628];
											continue;
										}
										Static253.anIntArray519[local13++] = 0;
										continue;
									}
									if (local46 == 3603) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static118.anInt2406 == 2 && Static144.anInt2798 > local628) {
											Static253.anIntArray519[local13++] = Static23.anIntArray53[local628];
											continue;
										}
										Static253.anIntArray519[local13++] = 0;
										continue;
									}
									if (local46 == 3604) {
										local13--;
										local633 = Static253.anIntArray519[local13];
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static159.method2715(local633, local435);
										continue;
									}
									if (local46 == 3605) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static173.method2972(Static282.method4276(local435));
										continue;
									}
									if (local46 == 3606) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static133.method2331(Static282.method4276(local435));
										continue;
									}
									if (local46 == 3607) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static97.method1895(false, Static282.method4276(local435));
										continue;
									}
									if (local46 == 3608) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static263.method4059(Static282.method4276(local435));
										continue;
									}
									if (local46 == 3609) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										if (local435.startsWith("<img=0>") || local435.startsWith("<img=1>")) {
											local435 = local435.substring(7);
										}
										Static253.anIntArray519[local13++] = Static294.method943(local435) ? 1 : 0;
										continue;
									}
									if (local46 == 3610) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static118.anInt2406 == 2 && local628 < Static144.anInt2798) {
											Static136.aStringArray16[local19++] = Static54.aStringArray5[local628];
											continue;
										}
										Static136.aStringArray16[local19++] = "";
										continue;
									}
									if (local46 == 3611) {
										if (Static205.aString136 == null) {
											Static136.aStringArray16[local19++] = "";
										} else {
											Static136.aStringArray16[local19++] = Static132.method2308(Static205.aString136);
										}
										continue;
									}
									if (local46 == 3612) {
										if (Static205.aString136 == null) {
											Static253.anIntArray519[local13++] = 0;
										} else {
											Static253.anIntArray519[local13++] = Static5.anInt201;
										}
										continue;
									}
									if (local46 == 3613) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static205.aString136 != null && local628 < Static5.anInt201) {
											Static136.aStringArray16[local19++] = Static132.method2308(Static18.aClass1_Sub8Array1[local628].aString43);
											continue;
										}
										Static136.aStringArray16[local19++] = "";
										continue;
									}
									if (local46 == 3614) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static205.aString136 != null && Static5.anInt201 > local628) {
											Static253.anIntArray519[local13++] = Static18.aClass1_Sub8Array1[local628].anInt1163;
											continue;
										}
										Static253.anIntArray519[local13++] = 0;
										continue;
									}
									if (local46 == 3615) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static205.aString136 != null && local628 < Static5.anInt201) {
											Static253.anIntArray519[local13++] = Static18.aClass1_Sub8Array1[local628].aByte5;
											continue;
										}
										Static253.anIntArray519[local13++] = 0;
										continue;
									}
									if (local46 == 3616) {
										Static253.anIntArray519[local13++] = Static3.aByte1;
										continue;
									}
									if (local46 == 3617) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static206.method3440(local435);
										continue;
									}
									if (local46 == 3618) {
										Static253.anIntArray519[local13++] = Static41.aByte4;
										continue;
									}
									if (local46 == 3619) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static129.method2271(Static282.method4276(local435));
										continue;
									}
									if (local46 == 3620) {
										Static315.method4681();
										continue;
									}
									if (local46 == 3621) {
										if (Static118.anInt2406 == 0) {
											Static253.anIntArray519[local13++] = -1;
										} else {
											Static253.anIntArray519[local13++] = Static282.anInt5138;
										}
										continue;
									}
									if (local46 == 3622) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static118.anInt2406 != 0 && local628 < Static282.anInt5138) {
											Static136.aStringArray16[local19++] = Static69.method1333(Static86.aLongArray6[local628]);
											continue;
										}
										Static136.aStringArray16[local19++] = "";
										continue;
									}
									if (local46 == 3623) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										if (local435.startsWith("<img=0>") || local435.startsWith("<img=1>")) {
											local435 = local435.substring(7);
										}
										Static253.anIntArray519[local13++] = Static247.method1456(local435) ? 1 : 0;
										continue;
									}
									if (local46 == 3624) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static18.aClass1_Sub8Array1 != null && Static5.anInt201 > local628 && Static18.aClass1_Sub8Array1[local628].aString43.equalsIgnoreCase(Static138.aClass11_Sub4_Sub1_3.aString99)) {
											Static253.anIntArray519[local13++] = 1;
											continue;
										}
										Static253.anIntArray519[local13++] = 0;
										continue;
									}
									if (local46 == 3625) {
										if (Static276.aString195 == null) {
											Static136.aStringArray16[local19++] = "";
										} else {
											Static136.aStringArray16[local19++] = Static132.method2308(Static276.aString195);
										}
										continue;
									}
									if (local46 == 3626) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static205.aString136 != null && local628 < Static5.anInt201) {
											Static136.aStringArray16[local19++] = Static18.aClass1_Sub8Array1[local628].aString42;
											continue;
										}
										Static136.aStringArray16[local19++] = "";
										continue;
									}
									if (local46 == 3627) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										if (Static118.anInt2406 == 2 && local628 >= 0 && local628 < Static144.anInt2798) {
											Static253.anIntArray519[local13++] = Static196.aBooleanArray15[local628] ? 1 : 0;
											continue;
										}
										Static253.anIntArray519[local13++] = 0;
										continue;
									}
									if (local46 == 3628) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										if (local435.startsWith("<img=0>") || local435.startsWith("<img=1>")) {
											local435 = local435.substring(7);
										}
										Static253.anIntArray519[local13++] = Static299.method4473(local435);
										continue;
									}
									if (local46 == 3629) {
										Static253.anIntArray519[local13++] = Static18.anInt391;
										continue;
									}
									if (local46 == 3630) {
										local19--;
										local435 = Static136.aStringArray16[local19];
										Static97.method1895(true, Static282.method4276(local435));
										continue;
									}
									if (local46 == 3631) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static114.aBooleanArray6[local628] ? 1 : 0;
										continue;
									}
								} else if (local46 < 4000) {
									if (local46 == 3903) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static105.aClass77Array1[local628].method1988();
										continue;
									}
									if (local46 == 3904) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static105.aClass77Array1[local628].anInt2224;
										continue;
									}
									if (local46 == 3905) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static105.aClass77Array1[local628].anInt2216;
										continue;
									}
									if (local46 == 3906) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static105.aClass77Array1[local628].anInt2220;
										continue;
									}
									if (local46 == 3907) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static105.aClass77Array1[local628].anInt2223;
										continue;
									}
									if (local46 == 3908) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = Static105.aClass77Array1[local628].anInt2219;
										continue;
									}
									if (local46 == 3910) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										local633 = Static105.aClass77Array1[local628].method1992();
										Static253.anIntArray519[local13++] = local633 == 0 ? 1 : 0;
										continue;
									}
									if (local46 == 3911) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										local633 = Static105.aClass77Array1[local628].method1992();
										Static253.anIntArray519[local13++] = local633 == 2 ? 1 : 0;
										continue;
									}
									if (local46 == 3912) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										local633 = Static105.aClass77Array1[local628].method1992();
										Static253.anIntArray519[local13++] = local633 == 5 ? 1 : 0;
										continue;
									}
									if (local46 == 3913) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										local633 = Static105.aClass77Array1[local628].method1992();
										Static253.anIntArray519[local13++] = local633 == 1 ? 1 : 0;
										continue;
									}
								} else if (local46 < 4100) {
									if (local46 == 4000) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = local633 + local628;
										continue;
									}
									if (local46 == 4001) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = local628 - local633;
										continue;
									}
									if (local46 == 4002) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = local628 * local633;
										continue;
									}
									if (local46 == 4003) {
										local13 -= 2;
										local633 = Static253.anIntArray519[local13 + 1];
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = local628 / local633;
										continue;
									}
									if (local46 == 4004) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = (int) ((double) local628 * Math.random());
										continue;
									}
									if (local46 == 4005) {
										local13--;
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = (int) (Math.random() * (double) (local628 + 1));
										continue;
									}
									if (local46 == 4006) {
										local13 -= 5;
										local628 = Static253.anIntArray519[local13];
										local476 = Static253.anIntArray519[local13 + 3];
										local873 = Static253.anIntArray519[local13 + 2];
										local4366 = Static253.anIntArray519[local13 + 4];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = local628 + (local633 - local628) * (local4366 - local873) / (local476 - local873);
										continue;
									}
									@Pc(4411) long local4411;
									@Pc(4404) long local4404;
									if (local46 == 4007) {
										local13 -= 2;
										local4404 = Static253.anIntArray519[local13];
										local4411 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = (int) (local4404 + local4411 * local4404 / 100L);
										continue;
									}
									if (local46 == 4008) {
										local13 -= 2;
										local633 = Static253.anIntArray519[local13 + 1];
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = 0x1 << local633 | local628;
										continue;
									}
									if (local46 == 4009) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = -(0x1 << local633) - 1 & local628;
										continue;
									}
									if (local46 == 4010) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = (local628 & 0x1 << local633) == 0 ? 0 : 1;
										continue;
									}
									if (local46 == 4011) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = local628 % local633;
										continue;
									}
									if (local46 == 4012) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										if (local628 == 0) {
											Static253.anIntArray519[local13++] = 0;
										} else {
											Static253.anIntArray519[local13++] = (int) Math.pow((double) local628, (double) local633);
										}
										continue;
									}
									if (local46 == 4013) {
										local13 -= 2;
										local633 = Static253.anIntArray519[local13 + 1];
										local628 = Static253.anIntArray519[local13];
										if (local628 == 0) {
											Static253.anIntArray519[local13++] = 0;
										} else if (local633 == 0) {
											Static253.anIntArray519[local13++] = Integer.MAX_VALUE;
										} else {
											Static253.anIntArray519[local13++] = (int) Math.pow((double) local628, 1.0D / (double) local633);
										}
										continue;
									}
									if (local46 == 4014) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = local628 & local633;
										continue;
									}
									if (local46 == 4015) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = local628 | local633;
										continue;
									}
									if (local46 == 4016) {
										local13 -= 2;
										local633 = Static253.anIntArray519[local13 + 1];
										local628 = Static253.anIntArray519[local13];
										Static253.anIntArray519[local13++] = local628 < local633 ? local628 : local633;
										continue;
									}
									if (local46 == 4017) {
										local13 -= 2;
										local628 = Static253.anIntArray519[local13];
										local633 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = local633 < local628 ? local628 : local633;
										continue;
									}
									if (local46 == 4018) {
										local13 -= 3;
										local4404 = Static253.anIntArray519[local13];
										@Pc(4749) long local4749 = (long) Static253.anIntArray519[local13 + 2];
										local4411 = Static253.anIntArray519[local13 + 1];
										Static253.anIntArray519[local13++] = (int) (local4404 * local4749 / local4411);
										continue;
									}
								} else {
									@Pc(5336) boolean local5336;
									if (local46 < 4200) {
										if (local46 == 4100) {
											local19--;
											local435 = Static136.aStringArray16[local19];
											local13--;
											local633 = Static253.anIntArray519[local13];
											Static136.aStringArray16[local19++] = local435 + local633;
											continue;
										}
										if (local46 == 4101) {
											local19 -= 2;
											local435 = Static136.aStringArray16[local19];
											local2898 = Static136.aStringArray16[local19 + 1];
											Static136.aStringArray16[local19++] = local435 + local2898;
											continue;
										}
										if (local46 == 4102) {
											local19--;
											local435 = Static136.aStringArray16[local19];
											local13--;
											local633 = Static253.anIntArray519[local13];
											Static136.aStringArray16[local19++] = local435 + Static64.method1138(local633);
											continue;
										}
										if (local46 == 4103) {
											local19--;
											local435 = Static136.aStringArray16[local19];
											Static136.aStringArray16[local19++] = local435.toLowerCase();
											continue;
										}
										if (local46 == 4104) {
											local13--;
											local628 = Static253.anIntArray519[local13];
											@Pc(4900) long local4900 = (long) local628 * 86400000L + 1014768000000L;
											Static304.aCalendar2.setTime(new Date(local4900));
											local476 = Static304.aCalendar2.get(5);
											local4366 = Static304.aCalendar2.get(2);
											local914 = Static304.aCalendar2.get(1);
											Static136.aStringArray16[local19++] = local476 + "-" + Static75.aStringArray12[local4366] + "-" + local914;
											continue;
										}
										if (local46 == 4105) {
											local19 -= 2;
											local435 = Static136.aStringArray16[local19];
											local2898 = Static136.aStringArray16[local19 + 1];
											if (Static138.aClass11_Sub4_Sub1_3.aClass61_2 != null && Static138.aClass11_Sub4_Sub1_3.aClass61_2.aBoolean180) {
												Static136.aStringArray16[local19++] = local2898;
												continue;
											}
											Static136.aStringArray16[local19++] = local435;
											continue;
										}
										if (local46 == 4106) {
											local13--;
											local628 = Static253.anIntArray519[local13];
											Static136.aStringArray16[local19++] = Integer.toString(local628);
											continue;
										}
										if (local46 == 4107) {
											local19 -= 2;
											Static253.anIntArray519[local13++] = Static34.method604(Static27.method501(Static136.aStringArray16[local19 + 1], Static136.aStringArray16[local19], Static114.anInt2343));
											continue;
										}
										if (local46 == 4108) {
											local13 -= 2;
											local873 = Static253.anIntArray519[local13 + 1];
											local19--;
											local435 = Static136.aStringArray16[local19];
											local633 = Static253.anIntArray519[local13];
											Static253.anIntArray519[local13++] = Static267.method4134(local873).method2851(local435, local633);
											continue;
										}
										if (local46 == 4109) {
											local13 -= 2;
											local19--;
											local435 = Static136.aStringArray16[local19];
											local873 = Static253.anIntArray519[local13 + 1];
											local633 = Static253.anIntArray519[local13];
											Static253.anIntArray519[local13++] = Static267.method4134(local873).method2867(local435, local633);
											continue;
										}
										if (local46 == 4110) {
											local19 -= 2;
											local435 = Static136.aStringArray16[local19];
											local2898 = Static136.aStringArray16[local19 + 1];
											local13--;
											if (Static253.anIntArray519[local13] == 1) {
												Static136.aStringArray16[local19++] = local435;
											} else {
												Static136.aStringArray16[local19++] = local2898;
											}
											continue;
										}
										if (local46 == 4111) {
											local19--;
											local435 = Static136.aStringArray16[local19];
											Static136.aStringArray16[local19++] = Static285.method2872(local435);
											continue;
										}
										if (local46 == 4112) {
											local19--;
											local435 = Static136.aStringArray16[local19];
											local13--;
											local633 = Static253.anIntArray519[local13];
											if (local633 == -1) {
												throw new RuntimeException("null char");
											}
											Static136.aStringArray16[local19++] = local435 + (char) local633;
											continue;
										}
										if (local46 == 4113) {
											local13--;
											local628 = Static253.anIntArray519[local13];
											Static253.anIntArray519[local13++] = Static236.method3802((char) local628) ? 1 : 0;
											continue;
										}
										if (local46 == 4114) {
											local13--;
											local628 = Static253.anIntArray519[local13];
											Static253.anIntArray519[local13++] = Static86.method1716((char) local628) ? 1 : 0;
											continue;
										}
										if (local46 == 4115) {
											local13--;
											local628 = Static253.anIntArray519[local13];
											Static253.anIntArray519[local13++] = Static45.method872((char) local628) ? 1 : 0;
											continue;
										}
										if (local46 == 4116) {
											local13--;
											local628 = Static253.anIntArray519[local13];
											Static253.anIntArray519[local13++] = Static214.method1168((char) local628) ? 1 : 0;
											continue;
										}
										if (local46 == 4117) {
											local19--;
											local435 = Static136.aStringArray16[local19];
											if (local435 == null) {
												Static253.anIntArray519[local13++] = 0;
											} else {
												Static253.anIntArray519[local13++] = local435.length();
											}
											continue;
										}
										if (local46 == 4118) {
											local19--;
											local435 = Static136.aStringArray16[local19];
											local13 -= 2;
											local873 = Static253.anIntArray519[local13 + 1];
											local633 = Static253.anIntArray519[local13];
											Static136.aStringArray16[local19++] = local435.substring(local633, local873);
											continue;
										}
										if (local46 == 4119) {
											local19--;
											local435 = Static136.aStringArray16[local19];
											@Pc(5334) StringBuffer local5334 = new StringBuffer(local435.length());
											local5336 = false;
											for (local476 = 0; local435.length() > local476; local476++) {
												@Pc(5346) char local5346 = local435.charAt(local476);
												if (local5346 == '<') {
													local5336 = true;
												} else if (local5346 == '>') {
													local5336 = false;
												} else if (!local5336) {
													local5334.append(local5346);
												}
											}
											Static136.aStringArray16[local19++] = local5334.toString();
											continue;
										}
										if (local46 == 4120) {
											local13 -= 2;
											local19--;
											local435 = Static136.aStringArray16[local19];
											local873 = Static253.anIntArray519[local13 + 1];
											local633 = Static253.anIntArray519[local13];
											Static253.anIntArray519[local13++] = local435.indexOf(local633, local873);
											continue;
										}
										if (local46 == 4121) {
											local13--;
											local873 = Static253.anIntArray519[local13];
											local19 -= 2;
											local435 = Static136.aStringArray16[local19];
											local2898 = Static136.aStringArray16[local19 + 1];
											Static253.anIntArray519[local13++] = local435.indexOf(local2898, local873);
											continue;
										}
										if (local46 == 4122) {
											local13--;
											local628 = Static253.anIntArray519[local13];
											Static253.anIntArray519[local13++] = Character.toLowerCase((char) local628);
											continue;
										}
										if (local46 == 4123) {
											local13--;
											local628 = Static253.anIntArray519[local13];
											Static253.anIntArray519[local13++] = Character.toUpperCase((char) local628);
											continue;
										}
										if (local46 == 4124) {
											local13--;
											local1283 = Static253.anIntArray519[local13] != 0;
											local13--;
											local633 = Static253.anIntArray519[local13];
											Static136.aStringArray16[local19++] = Static170.method2949((long) local633, 0, local1283, Static114.anInt2343);
											continue;
										}
									} else {
										@Pc(5544) Class1_Sub5_Sub2 local5544;
										if (local46 < 4300) {
											if (local46 == 4200) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												Static136.aStringArray16[local19++] = Static69.method1330(local628).aString3;
												continue;
											}
											@Pc(12182) Class3 local12182;
											if (local46 == 4201) {
												local13 -= 2;
												local633 = Static253.anIntArray519[local13 + 1];
												local628 = Static253.anIntArray519[local13];
												local12182 = Static69.method1330(local628);
												if (local633 >= 1 && local633 <= 5 && local12182.aStringArray2[local633 - 1] != null) {
													Static136.aStringArray16[local19++] = local12182.aStringArray2[local633 - 1];
													continue;
												}
												Static136.aStringArray16[local19++] = "";
												continue;
											}
											if (local46 == 4202) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												local12182 = Static69.method1330(local628);
												if (local633 >= 1 && local633 <= 5 && local12182.aStringArray1[local633 - 1] != null) {
													Static136.aStringArray16[local19++] = local12182.aStringArray1[local633 - 1];
													continue;
												}
												Static136.aStringArray16[local19++] = "";
												continue;
											}
											if (local46 == 4203) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												Static253.anIntArray519[local13++] = Static69.method1330(local628).anInt128;
												continue;
											}
											if (local46 == 4204) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												Static253.anIntArray519[local13++] = Static69.method1330(local628).anInt135 == 1 ? 1 : 0;
												continue;
											}
											@Pc(12329) Class3 local12329;
											if (local46 == 4205) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												local12329 = Static69.method1330(local628);
												if (local12329.anInt125 == -1 && local12329.anInt148 >= 0) {
													Static253.anIntArray519[local13++] = local12329.anInt148;
													continue;
												}
												Static253.anIntArray519[local13++] = local628;
												continue;
											}
											if (local46 == 4206) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												local12329 = Static69.method1330(local628);
												if (local12329.anInt125 >= 0 && local12329.anInt148 >= 0) {
													Static253.anIntArray519[local13++] = local12329.anInt148;
													continue;
												}
												Static253.anIntArray519[local13++] = local628;
												continue;
											}
											if (local46 == 4207) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												Static253.anIntArray519[local13++] = Static69.method1330(local628).aBoolean14 ? 1 : 0;
												continue;
											}
											if (local46 == 4208) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												local5544 = Static283.method4279(local633);
												if (local5544.method461()) {
													Static136.aStringArray16[local19++] = Static69.method1330(local628).method69(local5544.aString15, local633);
												} else {
													Static253.anIntArray519[local13++] = Static69.method1330(local628).method76(local633, local5544.anInt484);
												}
												continue;
											}
											if (local46 == 4210) {
												local19--;
												local435 = Static136.aStringArray16[local19];
												local13--;
												local633 = Static253.anIntArray519[local13];
												Static250.method3918(local633 == 1, local435);
												Static253.anIntArray519[local13++] = Static46.anInt1052;
												continue;
											}
											if (local46 == 4211) {
												if (Static85.aShortArray45 != null && Static46.anInt1052 > Static114.anInt2344) {
													Static253.anIntArray519[local13++] = Static85.aShortArray45[Static114.anInt2344++] & 0xFFFF;
													continue;
												}
												Static253.anIntArray519[local13++] = -1;
												continue;
											}
											if (local46 == 4212) {
												Static114.anInt2344 = 0;
												continue;
											}
										} else if (local46 < 4400) {
											if (local46 == 4300) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												local5544 = Static283.method4279(local633);
												if (local5544.method461()) {
													Static136.aStringArray16[local19++] = Static275.method4210(local628).method4528(local5544.aString15, local633);
												} else {
													Static253.anIntArray519[local13++] = Static275.method4210(local628).method4518(local5544.anInt484, local633);
												}
												continue;
											}
										} else if (local46 < 4500) {
											if (local46 == 4400) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												local5544 = Static283.method4279(local633);
												if (local5544.method461()) {
													Static136.aStringArray16[local19++] = Static160.method2744(local628).method3887(local5544.aString15, local633);
												} else {
													Static253.anIntArray519[local13++] = Static160.method2744(local628).method3882(local633, local5544.anInt484);
												}
												continue;
											}
										} else if (local46 < 4600) {
											if (local46 == 4500) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												local5544 = Static283.method4279(local633);
												if (local5544.method461()) {
													Static136.aStringArray16[local19++] = Static136.method2355(local628).method3384(local633, local5544.aString15);
												} else {
													Static253.anIntArray519[local13++] = Static136.method2355(local628).method3383(local633, local5544.anInt484);
												}
												continue;
											}
										} else if (local46 < 5100) {
											if (local46 == 5000) {
												Static253.anIntArray519[local13++] = Static259.anInt4811;
												continue;
											}
											if (local46 == 5001) {
												local13 -= 3;
												Static259.anInt4811 = Static253.anIntArray519[local13];
												Static256.anInt4783 = Static253.anIntArray519[local13 + 1];
												Static59.anInt1257 = Static253.anIntArray519[local13 + 2];
												Static116.aClass1_Sub13_Sub1_48.method1887(209);
												Static116.aClass1_Sub13_Sub1_48.method1822(Static259.anInt4811);
												Static116.aClass1_Sub13_Sub1_48.method1822(Static256.anInt4783);
												Static116.aClass1_Sub13_Sub1_48.method1822(Static59.anInt1257);
												continue;
											}
											if (local46 == 5002) {
												local13 -= 2;
												local19--;
												local435 = Static136.aStringArray16[local19];
												local633 = Static253.anIntArray519[local13];
												local873 = Static253.anIntArray519[local13 + 1];
												Static116.aClass1_Sub13_Sub1_48.method1887(199);
												Static116.aClass1_Sub13_Sub1_48.method1857(Static282.method4276(local435));
												Static116.aClass1_Sub13_Sub1_48.method1822(local633 - 1);
												Static116.aClass1_Sub13_Sub1_48.method1822(local873);
												continue;
											}
											if (local46 == 5003) {
												local2898 = null;
												local13--;
												local628 = Static253.anIntArray519[local13];
												if (local628 < 100) {
													local2898 = Static269.aStringArray33[local628];
												}
												if (local2898 == null) {
													local2898 = "";
												}
												Static136.aStringArray16[local19++] = local2898;
												continue;
											}
											if (local46 == 5004) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												local633 = -1;
												if (local628 < 100 && Static269.aStringArray33[local628] != null) {
													local633 = Static18.anIntArray38[local628];
												}
												Static253.anIntArray519[local13++] = local633;
												continue;
											}
											if (local46 == 5005) {
												Static253.anIntArray519[local13++] = Static256.anInt4783;
												continue;
											}
											if (local46 == 5008) {
												local19--;
												local435 = Static136.aStringArray16[local19];
												if (!local435.startsWith("::")) {
													if (Static142.anInt2785 == 0 && (Static287.aBoolean492 && !Static294.aBoolean110 || Static220.aBoolean372)) {
														continue;
													}
													@Pc(10711) byte local10711 = 0;
													@Pc(10713) byte local10713 = 0;
													local2898 = local435.toLowerCase();
													if (local2898.startsWith(Static27.aString20)) {
														local435 = local435.substring(Static27.aString20.length());
														local10711 = 0;
													} else if (local2898.startsWith(Static104.aString74)) {
														local435 = local435.substring(Static104.aString74.length());
														local10711 = 1;
													} else if (local2898.startsWith(Static199.aString134)) {
														local10711 = 2;
														local435 = local435.substring(Static199.aString134.length());
													} else if (local2898.startsWith(Static153.aString79)) {
														local10711 = 3;
														local435 = local435.substring(Static153.aString79.length());
													} else if (local2898.startsWith(Static228.aString148)) {
														local435 = local435.substring(Static228.aString148.length());
														local10711 = 4;
													} else if (local2898.startsWith(Static259.aString179)) {
														local10711 = 5;
														local435 = local435.substring(Static259.aString179.length());
													} else if (local2898.startsWith(Static167.aString25)) {
														local435 = local435.substring(Static167.aString25.length());
														local10711 = 6;
													} else if (local2898.startsWith(Static126.aString55)) {
														local10711 = 7;
														local435 = local435.substring(Static126.aString55.length());
													} else if (local2898.startsWith(Static16.aString8)) {
														local435 = local435.substring(Static16.aString8.length());
														local10711 = 8;
													} else if (local2898.startsWith(Static114.aString80)) {
														local10711 = 9;
														local435 = local435.substring(Static114.aString80.length());
													} else if (local2898.startsWith(Static269.aString191)) {
														local10711 = 10;
														local435 = local435.substring(Static269.aString191.length());
													} else if (local2898.startsWith(Static212.aString139)) {
														local435 = local435.substring(Static212.aString139.length());
														local10711 = 11;
													} else if (Static114.anInt2343 != 0) {
														if (local2898.startsWith(Static24.aString16)) {
															local435 = local435.substring(Static24.aString16.length());
															local10711 = 0;
														} else if (local2898.startsWith(Static143.aString96)) {
															local435 = local435.substring(Static143.aString96.length());
															local10711 = 1;
														} else if (local2898.startsWith(Static301.aString214)) {
															local10711 = 2;
															local435 = local435.substring(Static301.aString214.length());
														} else if (local2898.startsWith(Static6.aString189)) {
															local435 = local435.substring(Static6.aString189.length());
															local10711 = 3;
														} else if (local2898.startsWith(Static262.aString183)) {
															local10711 = 4;
															local435 = local435.substring(Static262.aString183.length());
														} else if (local2898.startsWith(Static82.aString63)) {
															local435 = local435.substring(Static82.aString63.length());
															local10711 = 5;
														} else if (local2898.startsWith(Static261.aString182)) {
															local10711 = 6;
															local435 = local435.substring(Static261.aString182.length());
														} else if (local2898.startsWith(Static306.aString217)) {
															local10711 = 7;
															local435 = local435.substring(Static306.aString217.length());
														} else if (local2898.startsWith(Static297.aString212)) {
															local10711 = 8;
															local435 = local435.substring(Static297.aString212.length());
														} else if (local2898.startsWith(Static259.aString180)) {
															local435 = local435.substring(Static259.aString180.length());
															local10711 = 9;
														} else if (local2898.startsWith(Static306.aString216)) {
															local10711 = 10;
															local435 = local435.substring(Static306.aString216.length());
														} else if (local2898.startsWith(Static175.aString111)) {
															local10711 = 11;
															local435 = local435.substring(Static175.aString111.length());
														}
													}
													local2898 = local435.toLowerCase();
													if (local2898.startsWith(Static3.aString2)) {
														local10713 = 1;
														local435 = local435.substring(Static3.aString2.length());
													} else if (local2898.startsWith(Static184.aString119)) {
														local10713 = 2;
														local435 = local435.substring(Static184.aString119.length());
													} else if (local2898.startsWith(Static283.aString198)) {
														local10713 = 3;
														local435 = local435.substring(Static283.aString198.length());
													} else if (local2898.startsWith(Static63.aString48)) {
														local10713 = 4;
														local435 = local435.substring(Static63.aString48.length());
													} else if (local2898.startsWith(Static21.aString13)) {
														local435 = local435.substring(Static21.aString13.length());
														local10713 = 5;
													} else if (Static114.anInt2343 != 0) {
														if (local2898.startsWith(Static64.aString49)) {
															local10713 = 1;
															local435 = local435.substring(Static64.aString49.length());
														} else if (local2898.startsWith(Static27.aString21)) {
															local10713 = 2;
															local435 = local435.substring(Static27.aString21.length());
														} else if (local2898.startsWith(Static176.aString112)) {
															local10713 = 3;
															local435 = local435.substring(Static176.aString112.length());
														} else if (local2898.startsWith(Static235.aString155)) {
															local10713 = 4;
															local435 = local435.substring(Static235.aString155.length());
														} else if (local2898.startsWith(Static181.aString115)) {
															local435 = local435.substring(Static181.aString115.length());
															local10713 = 5;
														}
													}
													Static116.aClass1_Sub13_Sub1_48.method1887(106);
													Static116.aClass1_Sub13_Sub1_48.method1822(0);
													local4366 = Static116.aClass1_Sub13_Sub1_48.anInt2018;
													Static116.aClass1_Sub13_Sub1_48.method1822(local10711);
													Static116.aClass1_Sub13_Sub1_48.method1822(local10713);
													Static76.method3989(local435, Static116.aClass1_Sub13_Sub1_48);
													Static116.aClass1_Sub13_Sub1_48.method1869(Static116.aClass1_Sub13_Sub1_48.anInt2018 - local4366);
													continue;
												}
												Static274.method4203(local435);
												continue;
											}
											if (local46 == 5009) {
												local19 -= 2;
												local435 = Static136.aStringArray16[local19];
												local2898 = Static136.aStringArray16[local19 + 1];
												if (Static142.anInt2785 != 0 || (!Static287.aBoolean492 || Static294.aBoolean110) && !Static220.aBoolean372) {
													Static116.aClass1_Sub13_Sub1_48.method1887(164);
													Static116.aClass1_Sub13_Sub1_48.method1822(0);
													local873 = Static116.aClass1_Sub13_Sub1_48.anInt2018;
													Static116.aClass1_Sub13_Sub1_48.method1857(Static282.method4276(local435));
													Static76.method3989(local2898, Static116.aClass1_Sub13_Sub1_48);
													Static116.aClass1_Sub13_Sub1_48.method1869(Static116.aClass1_Sub13_Sub1_48.anInt2018 - local873);
												}
												continue;
											}
											if (local46 == 5010) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												local2898 = null;
												if (local628 < 100) {
													local2898 = Static247.aStringArray8[local628];
												}
												if (local2898 == null) {
													local2898 = "";
												}
												Static136.aStringArray16[local19++] = local2898;
												continue;
											}
											if (local46 == 5011) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												local2898 = null;
												if (local628 < 100) {
													local2898 = Static234.aStringArray27[local628];
												}
												if (local2898 == null) {
													local2898 = "";
												}
												Static136.aStringArray16[local19++] = local2898;
												continue;
											}
											if (local46 == 5012) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												local633 = -1;
												if (local628 < 100) {
													local633 = Static302.anIntArray595[local628];
												}
												Static253.anIntArray519[local13++] = local633;
												continue;
											}
											if (local46 == 5015) {
												if (Static138.aClass11_Sub4_Sub1_3 == null || Static138.aClass11_Sub4_Sub1_3.aString99 == null) {
													local435 = Static124.aString23;
												} else {
													local435 = Static138.aClass11_Sub4_Sub1_3.method2583();
												}
												Static136.aStringArray16[local19++] = local435;
												continue;
											}
											if (local46 == 5016) {
												Static253.anIntArray519[local13++] = Static59.anInt1257;
												continue;
											}
											if (local46 == 5017) {
												Static253.anIntArray519[local13++] = Static121.anInt2465;
												continue;
											}
											if (local46 == 5050) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												Static136.aStringArray16[local19++] = Static171.method2953(local628).aString90;
												continue;
											}
											@Pc(11429) Class1_Sub5_Sub8 local11429;
											if (local46 == 5051) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												local11429 = Static171.method2953(local628);
												if (local11429.anIntArray205 == null) {
													Static253.anIntArray519[local13++] = 0;
												} else {
													Static253.anIntArray519[local13++] = local11429.anIntArray205.length;
												}
												continue;
											}
											if (local46 == 5052) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												@Pc(11466) Class1_Sub5_Sub8 local11466 = Static171.method2953(local628);
												local476 = local11466.anIntArray205[local633];
												Static253.anIntArray519[local13++] = local476;
												continue;
											}
											if (local46 == 5053) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												local11429 = Static171.method2953(local628);
												if (local11429.anIntArray207 == null) {
													Static253.anIntArray519[local13++] = 0;
												} else {
													Static253.anIntArray519[local13++] = local11429.anIntArray207.length;
												}
												continue;
											}
											if (local46 == 5054) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												Static253.anIntArray519[local13++] = Static171.method2953(local628).anIntArray207[local633];
												continue;
											}
											if (local46 == 5055) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												Static136.aStringArray16[local19++] = Static271.method4175(local628).method3708();
												continue;
											}
											if (local46 == 5056) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												@Pc(11574) Class1_Sub5_Sub19 local11574 = Static271.method4175(local628);
												if (local11574.anIntArray485 == null) {
													Static253.anIntArray519[local13++] = 0;
												} else {
													Static253.anIntArray519[local13++] = local11574.anIntArray485.length;
												}
												continue;
											}
											if (local46 == 5057) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												Static253.anIntArray519[local13++] = Static271.method4175(local628).anIntArray485[local633];
												continue;
											}
											if (local46 == 5058) {
												Static204.aClass67_3 = new Class67();
												local13--;
												Static204.aClass67_3.anInt1904 = Static253.anIntArray519[local13];
												Static204.aClass67_3.aClass1_Sub5_Sub19_1 = Static271.method4175(Static204.aClass67_3.anInt1904);
												Static204.aClass67_3.anIntArray142 = new int[Static204.aClass67_3.aClass1_Sub5_Sub19_1.method3711()];
												continue;
											}
											if (local46 == 5059) {
												Static116.aClass1_Sub13_Sub1_48.method1887(61);
												Static116.aClass1_Sub13_Sub1_48.method1822(0);
												local628 = Static116.aClass1_Sub13_Sub1_48.anInt2018;
												Static116.aClass1_Sub13_Sub1_48.method1822(0);
												Static116.aClass1_Sub13_Sub1_48.method1835(Static204.aClass67_3.anInt1904);
												Static204.aClass67_3.aClass1_Sub5_Sub19_1.method3705(Static116.aClass1_Sub13_Sub1_48, Static204.aClass67_3.anIntArray142);
												Static116.aClass1_Sub13_Sub1_48.method1869(Static116.aClass1_Sub13_Sub1_48.anInt2018 - local628);
												continue;
											}
											if (local46 == 5060) {
												local19--;
												local435 = Static136.aStringArray16[local19];
												Static116.aClass1_Sub13_Sub1_48.method1887(142);
												Static116.aClass1_Sub13_Sub1_48.method1822(0);
												local633 = Static116.aClass1_Sub13_Sub1_48.anInt2018;
												Static116.aClass1_Sub13_Sub1_48.method1857(Static282.method4276(local435));
												Static116.aClass1_Sub13_Sub1_48.method1835(Static204.aClass67_3.anInt1904);
												Static204.aClass67_3.aClass1_Sub5_Sub19_1.method3705(Static116.aClass1_Sub13_Sub1_48, Static204.aClass67_3.anIntArray142);
												Static116.aClass1_Sub13_Sub1_48.method1869(Static116.aClass1_Sub13_Sub1_48.anInt2018 - local633);
												continue;
											}
											if (local46 == 5061) {
												Static116.aClass1_Sub13_Sub1_48.method1887(61);
												Static116.aClass1_Sub13_Sub1_48.method1822(0);
												local628 = Static116.aClass1_Sub13_Sub1_48.anInt2018;
												Static116.aClass1_Sub13_Sub1_48.method1822(1);
												Static116.aClass1_Sub13_Sub1_48.method1835(Static204.aClass67_3.anInt1904);
												Static204.aClass67_3.aClass1_Sub5_Sub19_1.method3705(Static116.aClass1_Sub13_Sub1_48, Static204.aClass67_3.anIntArray142);
												Static116.aClass1_Sub13_Sub1_48.method1869(Static116.aClass1_Sub13_Sub1_48.anInt2018 - local628);
												continue;
											}
											if (local46 == 5062) {
												local13 -= 2;
												local633 = Static253.anIntArray519[local13 + 1];
												local628 = Static253.anIntArray519[local13];
												Static253.anIntArray519[local13++] = Static171.method2953(local628).aCharArray3[local633];
												continue;
											}
											if (local46 == 5063) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												Static253.anIntArray519[local13++] = Static171.method2953(local628).aCharArray2[local633];
												continue;
											}
											if (local46 == 5064) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												if (local633 == -1) {
													Static253.anIntArray519[local13++] = -1;
												} else {
													Static253.anIntArray519[local13++] = Static171.method2953(local628).method2323((char) local633);
												}
												continue;
											}
											if (local46 == 5065) {
												local13 -= 2;
												local633 = Static253.anIntArray519[local13 + 1];
												local628 = Static253.anIntArray519[local13];
												if (local633 == -1) {
													Static253.anIntArray519[local13++] = -1;
												} else {
													Static253.anIntArray519[local13++] = Static171.method2953(local628).method2324((char) local633);
												}
												continue;
											}
											if (local46 == 5066) {
												local13--;
												local628 = Static253.anIntArray519[local13];
												Static253.anIntArray519[local13++] = Static271.method4175(local628).method3711();
												continue;
											}
											if (local46 == 5067) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												local873 = Static271.method4175(local628).method3701(local633);
												Static253.anIntArray519[local13++] = local873;
												continue;
											}
											if (local46 == 5068) {
												local13 -= 2;
												local628 = Static253.anIntArray519[local13];
												local633 = Static253.anIntArray519[local13 + 1];
												Static204.aClass67_3.anIntArray142[local628] = local633;
												continue;
											}
											if (local46 == 5069) {
												local13 -= 2;
												local633 = Static253.anIntArray519[local13 + 1];
												local628 = Static253.anIntArray519[local13];
												Static204.aClass67_3.anIntArray142[local628] = local633;
												continue;
											}
											if (local46 == 5070) {
												local13 -= 3;
												local633 = Static253.anIntArray519[local13 + 1];
												local873 = Static253.anIntArray519[local13 + 2];
												local628 = Static253.anIntArray519[local13];
												@Pc(12048) Class1_Sub5_Sub19 local12048 = Static271.method4175(local628);
												if (local12048.method3701(local633) != 0) {
													throw new RuntimeException("bad command");
												}
												Static253.anIntArray519[local13++] = local12048.method3712(local633, local873);
												continue;
											}
											if (local46 == 5071) {
												local13--;
												local1511 = Static253.anIntArray519[local13] == 1;
												local19--;
												local435 = Static136.aStringArray16[local19];
												Static259.method4028(local435, local1511);
												Static253.anIntArray519[local13++] = Static46.anInt1052;
												continue;
											}
											if (local46 == 5072) {
												if (Static85.aShortArray45 != null && Static114.anInt2344 < Static46.anInt1052) {
													Static253.anIntArray519[local13++] = Static85.aShortArray45[Static114.anInt2344++] & 0xFFFF;
													continue;
												}
												Static253.anIntArray519[local13++] = -1;
												continue;
											}
											if (local46 == 5073) {
												Static114.anInt2344 = 0;
												continue;
											}
										} else if (local46 < 5200) {
											if (local46 == 5100) {
												if (Static1.aBooleanArray1[86]) {
													Static253.anIntArray519[local13++] = 1;
												} else {
													Static253.anIntArray519[local13++] = 0;
												}
												continue;
											}
											if (local46 == 5101) {
												if (Static1.aBooleanArray1[82]) {
													Static253.anIntArray519[local13++] = 1;
												} else {
													Static253.anIntArray519[local13++] = 0;
												}
												continue;
											}
											if (local46 == 5102) {
												if (Static1.aBooleanArray1[81]) {
													Static253.anIntArray519[local13++] = 1;
												} else {
													Static253.anIntArray519[local13++] = 0;
												}
												continue;
											}
										} else {
											@Pc(7193) boolean local7193;
											if (local46 < 5300) {
												if (local46 == 5200) {
													local13--;
													Static106.method3317(Static253.anIntArray519[local13]);
													continue;
												}
												if (local46 == 5201) {
													Static253.anIntArray519[local13++] = Static63.method1119();
													continue;
												}
												if (local46 == 5205) {
													local13--;
													Static219.method3544(-1, false, -1, Static253.anIntArray519[local13]);
													continue;
												}
												@Pc(9472) Class1_Sub5_Sub14 local9472;
												if (local46 == 5206) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local9472 = Static249.method4634(local628 >> 14 & 0x3FFF, local628 & 0x3FFF);
													if (local9472 == null) {
														Static253.anIntArray519[local13++] = -1;
													} else {
														Static253.anIntArray519[local13++] = local9472.anInt3525;
													}
													continue;
												}
												@Pc(9500) Class1_Sub5_Sub14 local9500;
												if (local46 == 5207) {
													local13--;
													local9500 = Static249.method4640(Static253.anIntArray519[local13]);
													if (local9500 != null && local9500.aString121 != null) {
														Static136.aStringArray16[local19++] = local9500.aString121;
														continue;
													}
													Static136.aStringArray16[local19++] = "";
													continue;
												}
												if (local46 == 5208) {
													Static253.anIntArray519[local13++] = Static2.anInt54;
													Static253.anIntArray519[local13++] = Static95.anInt1985;
													continue;
												}
												if (local46 == 5209) {
													Static253.anIntArray519[local13++] = Static54.anInt1167 + Static249.anInt5573;
													Static253.anIntArray519[local13++] = Static249.anInt5574 + Static249.anInt5571 - Static175.anInt3415 - 1;
													continue;
												}
												if (local46 == 5210) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local9472 = Static249.method4640(local628);
													if (local9472 == null) {
														Static253.anIntArray519[local13++] = 0;
														Static253.anIntArray519[local13++] = 0;
													} else {
														Static253.anIntArray519[local13++] = local9472.anInt3528 >> 14 & 0x3FFF;
														Static253.anIntArray519[local13++] = local9472.anInt3528 & 0x3FFF;
													}
													continue;
												}
												if (local46 == 5211) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local9472 = Static249.method4640(local628);
													if (local9472 == null) {
														Static253.anIntArray519[local13++] = 0;
														Static253.anIntArray519[local13++] = 0;
													} else {
														Static253.anIntArray519[local13++] = local9472.anInt3526 - local9472.anInt3535;
														Static253.anIntArray519[local13++] = local9472.anInt3536 - local9472.anInt3534;
													}
													continue;
												}
												@Pc(9666) Class1_Sub5_Sub1 local9666;
												if (local46 == 5212) {
													local9666 = Static141.method2486();
													if (local9666 == null) {
														Static253.anIntArray519[local13++] = -1;
														Static253.anIntArray519[local13++] = -1;
													} else {
														Static253.anIntArray519[local13++] = local9666.anInt359;
														local633 = Static249.anInt5574 + Static249.anInt5571 - local9666.anInt361 - 1 | local9666.anInt369 - -Static249.anInt5573 << 14 | local9666.anInt365 << 28;
														Static253.anIntArray519[local13++] = local633;
													}
													continue;
												}
												if (local46 == 5213) {
													local9666 = Static292.method4398();
													if (local9666 == null) {
														Static253.anIntArray519[local13++] = -1;
														Static253.anIntArray519[local13++] = -1;
													} else {
														Static253.anIntArray519[local13++] = local9666.anInt359;
														local633 = Static249.anInt5573 + local9666.anInt369 << 14 | local9666.anInt365 << 28 | Static249.anInt5574 + Static249.anInt5571 - local9666.anInt361 - 1;
														Static253.anIntArray519[local13++] = local633;
													}
													continue;
												}
												if (local46 == 5214) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local9472 = Static273.method4200();
													if (local9472 != null) {
														local5336 = local9472.method3125(Static24.anIntArray55, local628 & 0x3FFF, local628 >> 14 & 0x3FFF, local628 >> 28 & 0x3);
														if (local5336) {
															Static26.method500(Static24.anIntArray55[1], Static24.anIntArray55[2]);
														}
													}
													continue;
												}
												if (local46 == 5215) {
													local13 -= 2;
													local628 = Static253.anIntArray519[local13];
													local633 = Static253.anIntArray519[local13 + 1];
													local7193 = false;
													@Pc(9847) Class189 local9847 = Static249.method4623(local628 >> 14 & 0x3FFF, local628 & 0x3FFF);
													for (@Pc(9852) Class1_Sub5_Sub14 local9852 = (Class1_Sub5_Sub14) local9847.method4600(); local9852 != null; local9852 = (Class1_Sub5_Sub14) local9847.method4601()) {
														if (local633 == local9852.anInt3525) {
															local7193 = true;
															break;
														}
													}
													if (local7193) {
														Static253.anIntArray519[local13++] = 1;
													} else {
														Static253.anIntArray519[local13++] = 0;
													}
													continue;
												}
												if (local46 == 5218) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local9472 = Static249.method4640(local628);
													if (local9472 == null) {
														Static253.anIntArray519[local13++] = -1;
													} else {
														Static253.anIntArray519[local13++] = local9472.anInt3533;
													}
													continue;
												}
												if (local46 == 5220) {
													Static253.anIntArray519[local13++] = Static114.anInt2348 == 100 ? 1 : 0;
													continue;
												}
												if (local46 == 5221) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													Static26.method500(local628 >> 14 & 0x3FFF, local628 & 0x3FFF);
													continue;
												}
												if (local46 == 5222) {
													local9500 = Static273.method4200();
													if (local9500 == null) {
														Static253.anIntArray519[local13++] = -1;
														Static253.anIntArray519[local13++] = -1;
													} else {
														local1511 = local9500.method3124(Static54.anInt1167 + Static249.anInt5573, Static24.anIntArray55, Static249.anInt5571 + Static249.anInt5574 - Static175.anInt3415 - 1);
														if (local1511) {
															Static253.anIntArray519[local13++] = Static24.anIntArray55[1];
															Static253.anIntArray519[local13++] = Static24.anIntArray55[2];
														} else {
															Static253.anIntArray519[local13++] = -1;
															Static253.anIntArray519[local13++] = -1;
														}
													}
													continue;
												}
												if (local46 == 5223) {
													local13 -= 2;
													local628 = Static253.anIntArray519[local13];
													local633 = Static253.anIntArray519[local13 + 1];
													Static219.method3544(local633 >> 14 & 0x3FFF, false, local633 & 0x3FFF, local628);
													continue;
												}
												if (local46 == 5224) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local9472 = Static273.method4200();
													if (local9472 == null) {
														Static253.anIntArray519[local13++] = -1;
														Static253.anIntArray519[local13++] = -1;
													} else {
														local5336 = local9472.method3125(Static24.anIntArray55, local628 & 0x3FFF, local628 >> 14 & 0x3FFF, local628 >> 28 & 0x3);
														if (local5336) {
															Static253.anIntArray519[local13++] = Static24.anIntArray55[1];
															Static253.anIntArray519[local13++] = Static24.anIntArray55[2];
														} else {
															Static253.anIntArray519[local13++] = -1;
															Static253.anIntArray519[local13++] = -1;
														}
													}
													continue;
												}
												if (local46 == 5225) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local9472 = Static273.method4200();
													if (local9472 == null) {
														Static253.anIntArray519[local13++] = -1;
														Static253.anIntArray519[local13++] = -1;
													} else {
														local5336 = local9472.method3124(local628 >> 14 & 0x3FFF, Static24.anIntArray55, local628 & 0x3FFF);
														if (local5336) {
															Static253.anIntArray519[local13++] = Static24.anIntArray55[1];
															Static253.anIntArray519[local13++] = Static24.anIntArray55[2];
														} else {
															Static253.anIntArray519[local13++] = -1;
															Static253.anIntArray519[local13++] = -1;
														}
													}
													continue;
												}
												if (local46 == 5226) {
													local13--;
													Static148.method2588(Static253.anIntArray519[local13]);
													continue;
												}
												if (local46 == 5227) {
													local13 -= 2;
													local628 = Static253.anIntArray519[local13];
													local633 = Static253.anIntArray519[local13 + 1];
													Static219.method3544(local633 >> 14 & 0x3FFF, true, local633 & 0x3FFF, local628);
													continue;
												}
												if (local46 == 5228) {
													local13--;
													Static265.aBoolean468 = Static253.anIntArray519[local13] == 1;
													continue;
												}
												if (local46 == 5229) {
													Static253.anIntArray519[local13++] = Static265.aBoolean468 ? 1 : 0;
													continue;
												}
												if (local46 == 5230) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													Static218.method3533(local628);
													continue;
												}
												@Pc(10326) Class1 local10326;
												if (local46 == 5231) {
													local13 -= 2;
													local628 = Static253.anIntArray519[local13];
													local1511 = Static253.anIntArray519[local13 + 1] == 1;
													if (Static260.aClass86_34 == null) {
														continue;
													}
													local10326 = Static260.aClass86_34.method2136((long) local628);
													if (local10326 != null && !local1511) {
														local10326.method4573();
														continue;
													}
													if (local10326 == null && local1511) {
														local10326 = new Class1();
														Static260.aClass86_34.method2144(local10326, (long) local628);
													}
													continue;
												}
												@Pc(10368) Class1 local10368;
												if (local46 == 5232) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (Static260.aClass86_34 == null) {
														Static253.anIntArray519[local13++] = 0;
													} else {
														local10368 = Static260.aClass86_34.method2136((long) local628);
														Static253.anIntArray519[local13++] = local10368 == null ? 0 : 1;
													}
													continue;
												}
												if (local46 == 5233) {
													local13 -= 2;
													local628 = Static253.anIntArray519[local13];
													local1511 = Static253.anIntArray519[local13 + 1] == 1;
													if (Static242.aClass86_29 == null) {
														continue;
													}
													local10326 = Static242.aClass86_29.method2136((long) local628);
													if (local10326 != null && !local1511) {
														local10326.method4573();
														continue;
													}
													if (local10326 == null && local1511) {
														local10326 = new Class1();
														Static242.aClass86_29.method2144(local10326, (long) local628);
													}
													continue;
												}
												if (local46 == 5234) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (Static242.aClass86_29 == null) {
														Static253.anIntArray519[local13++] = 0;
													} else {
														local10368 = Static242.aClass86_29.method2136((long) local628);
														Static253.anIntArray519[local13++] = local10368 == null ? 0 : 1;
													}
													continue;
												}
												if (local46 == 5235) {
													Static253.anIntArray519[local13++] = Static249.aClass1_Sub5_Sub14_3 == null ? -1 : Static249.aClass1_Sub5_Sub14_3.anInt3525;
													continue;
												}
											} else if (local46 < 5400) {
												if (local46 == 5300) {
													local13 -= 2;
													local633 = Static253.anIntArray519[local13 + 1];
													local628 = Static253.anIntArray519[local13];
													Static122.method2210(local633, false, local628, 3);
													Static253.anIntArray519[local13++] = Static196.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local46 == 5301) {
													if (Static196.aFrame1 != null) {
														Static122.method2210(-1, false, -1, Static271.anInt4996);
													}
													continue;
												}
												if (local46 == 5302) {
													@Pc(9238) Class115[] local9238 = Static13.method186();
													Static253.anIntArray519[local13++] = local9238.length;
													continue;
												}
												if (local46 == 5303) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													@Pc(9258) Class115[] local9258 = Static13.method186();
													Static253.anIntArray519[local13++] = local9258[local628].anInt3479;
													Static253.anIntArray519[local13++] = local9258[local628].anInt3482;
													continue;
												}
												if (local46 == 5305) {
													local628 = Static299.anInt5384;
													local633 = Static80.anInt1772;
													local873 = -1;
													@Pc(9291) Class115[] local9291 = Static13.method186();
													for (local4366 = 0; local4366 < local9291.length; local4366++) {
														@Pc(9301) Class115 local9301 = local9291[local4366];
														if (local628 == local9301.anInt3479 && local9301.anInt3482 == local633) {
															local873 = local4366;
															break;
														}
													}
													Static253.anIntArray519[local13++] = local873;
													continue;
												}
												if (local46 == 5306) {
													Static253.anIntArray519[local13++] = Static269.method4147();
													continue;
												}
												if (local46 == 5307) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (local628 < 0 || local628 > 2) {
														local628 = 0;
													}
													Static122.method2210(-1, false, -1, local628);
													continue;
												}
												if (local46 == 5308) {
													Static253.anIntArray519[local13++] = Static271.anInt4996;
													continue;
												}
												if (local46 == 5309) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (local628 < 0 || local628 > 2) {
														local628 = 0;
													}
													Static271.anInt4996 = local628;
													Static304.method4550(Static222.aClass176_3);
													continue;
												}
											} else if (local46 < 5500) {
												if (local46 == 5400) {
													local19 -= 2;
													local435 = Static136.aStringArray16[local19];
													local13--;
													local873 = Static253.anIntArray519[local13];
													local2898 = Static136.aStringArray16[local19 + 1];
													Static116.aClass1_Sub13_Sub1_48.method1887(148);
													Static116.aClass1_Sub13_Sub1_48.method1822(Static56.method1012(local435) + Static56.method1012(local2898) + 1);
													Static116.aClass1_Sub13_Sub1_48.method1852(local435);
													Static116.aClass1_Sub13_Sub1_48.method1852(local2898);
													Static116.aClass1_Sub13_Sub1_48.method1822(local873);
													continue;
												}
												if (local46 == 5401) {
													local13 -= 2;
													Static135.aShortArray54[Static253.anIntArray519[local13]] = (short) Static274.method4207(Static253.anIntArray519[local13 + 1]);
													Static117.method2130();
													Static181.method3084();
													Static163.method2820();
													Static78.method1611();
													Static141.method2485();
													continue;
												}
												if (local46 == 5405) {
													local13 -= 2;
													local628 = Static253.anIntArray519[local13];
													local633 = Static253.anIntArray519[local13 + 1];
													if (local628 >= 0 && local628 < 2) {
														Static41.anIntArrayArrayArray6[local628] = new int[local633 << 1][4];
													}
													continue;
												}
												if (local46 == 5406) {
													local13 -= 7;
													local628 = Static253.anIntArray519[local13];
													local476 = Static253.anIntArray519[local13 + 3];
													local633 = Static253.anIntArray519[local13 + 1] << 1;
													local873 = Static253.anIntArray519[local13 + 2];
													local4366 = Static253.anIntArray519[local13 + 4];
													@Pc(5935) int local5935 = Static253.anIntArray519[local13 + 6];
													local914 = Static253.anIntArray519[local13 + 5];
													if (local628 >= 0 && local628 < 2 && Static41.anIntArrayArrayArray6[local628] != null && local633 >= 0 && Static41.anIntArrayArrayArray6[local628].length > local633) {
														Static41.anIntArrayArrayArray6[local628][local633] = new int[] { (local873 >> 14 & 0x3FFF) * 128, local476, (local873 & 0x3FFF) * 128, local5935 };
														Static41.anIntArrayArrayArray6[local628][local633 + 1] = new int[] { (local4366 >> 14 & 0x3FFF) * 128, local914, (local4366 & 0x3FFF) * 128 };
													}
													continue;
												}
												if (local46 == 5407) {
													local13--;
													local628 = Static41.anIntArrayArrayArray6[Static253.anIntArray519[local13]].length >> 1;
													Static253.anIntArray519[local13++] = local628;
													continue;
												}
												if (local46 == 5411) {
													if (Static196.aFrame1 != null) {
														Static122.method2210(-1, false, -1, Static271.anInt4996);
													}
													if (Static311.aFrame2 == null) {
														Static245.method3860(false, Static144.method2513());
													} else {
														System.exit(0);
													}
													continue;
												}
												if (local46 == 5419) {
													local435 = "";
													if (Static21.aClass153_2 != null) {
														if (Static21.aClass153_2.anObject6 == null) {
															local435 = Static268.method4139(Static21.aClass153_2.anInt4613);
														} else {
															local435 = (String) Static21.aClass153_2.anObject6;
														}
													}
													Static136.aStringArray16[local19++] = local435;
													continue;
												}
												if (local46 == 5420) {
													Static253.anIntArray519[local13++] = Static290.anInt5261 == 3 ? 1 : 0;
													continue;
												}
												if (local46 == 5421) {
													if (Static196.aFrame1 != null) {
														Static122.method2210(-1, false, -1, Static271.anInt4996);
													}
													local13--;
													local1511 = Static253.anIntArray519[local13] == 1;
													local19--;
													local435 = Static136.aStringArray16[local19];
													@Pc(6164) String local6164 = Static144.method2513() + local435;
													if (Static311.aFrame2 == null && (!local1511 || Static290.anInt5261 == 3 || !Static290.aString209.startsWith("win") || Static66.aBoolean134)) {
														Static245.method3860(local1511, local6164);
														continue;
													}
													Static37.aString31 = local6164;
													Static284.aBoolean487 = local1511;
													Static44.aClass153_3 = Static222.aClass176_3.method4363(local6164);
													continue;
												}
												if (local46 == 5422) {
													local19 -= 2;
													local435 = Static136.aStringArray16[local19];
													local2898 = Static136.aStringArray16[local19 + 1];
													local13--;
													local873 = Static253.anIntArray519[local13];
													if (local435.length() > 0) {
														if (Static193.aStringArray23 == null) {
															Static193.aStringArray23 = new String[Static133.anIntArray206[Static272.anInt5005]];
														}
														Static193.aStringArray23[local873] = local435;
													}
													if (local2898.length() > 0) {
														if (Static315.aStringArray38 == null) {
															Static315.aStringArray38 = new String[Static133.anIntArray206[Static272.anInt5005]];
														}
														Static315.aStringArray38[local873] = local2898;
													}
													continue;
												}
												if (local46 == 5423) {
													local19--;
													System.out.println(Static136.aStringArray16[local19]);
													continue;
												}
												if (local46 == 5424) {
													local13 -= 11;
													Static296.anInt841 = Static253.anIntArray519[local13];
													Static186.anInt3550 = Static253.anIntArray519[local13 + 1];
													Static175.anInt3410 = Static253.anIntArray519[local13 + 2];
													Static236.anInt4435 = Static253.anIntArray519[local13 + 3];
													Static43.anInt978 = Static253.anIntArray519[local13 + 4];
													Static66.anInt1367 = Static253.anIntArray519[local13 + 5];
													Static184.anInt3539 = Static253.anIntArray519[local13 + 6];
													Static262.anInt4840 = Static253.anIntArray519[local13 + 7];
													Static73.anInt1574 = Static253.anIntArray519[local13 + 8];
													Static146.anInt3023 = Static253.anIntArray519[local13 + 9];
													Static120.anInt2453 = Static253.anIntArray519[local13 + 10];
													Static45.aClass119_15.method3250(Static43.anInt978);
													Static45.aClass119_15.method3250(Static66.anInt1367);
													Static45.aClass119_15.method3250(Static184.anInt3539);
													Static45.aClass119_15.method3250(Static262.anInt4840);
													Static45.aClass119_15.method3250(Static73.anInt1574);
													Static284.aBoolean486 = true;
													continue;
												}
												if (local46 == 5425) {
													Static158.method3207();
													Static284.aBoolean486 = false;
													continue;
												}
												if (local46 == 5426) {
													local13--;
													Static256.anInt4782 = Static253.anIntArray519[local13];
													continue;
												}
												if (local46 == 5427) {
													local13 -= 2;
													Static150.anInt3066 = Static253.anIntArray519[local13];
													anInt5630 = Static253.anIntArray519[local13 + 1];
													continue;
												}
												if (local46 == 5428) {
													local13 -= 2;
													local628 = Static253.anIntArray519[local13];
													local633 = Static253.anIntArray519[local13 + 1];
													Static253.anIntArray519[local13++] = Static163.method2821(local633, local628) ? 1 : 0;
													continue;
												}
											} else if (local46 < 5600) {
												if (local46 == 5500) {
													local13 -= 4;
													local628 = Static253.anIntArray519[local13];
													local633 = Static253.anIntArray519[local13 + 1];
													local873 = Static253.anIntArray519[local13 + 2];
													local476 = Static253.anIntArray519[local13 + 3];
													Static215.method3495(false, local476, (local628 >> 14 & 0x3FFF) - Static38.anInt714, local873, (local628 & 0x3FFF) - Static135.anInt2659, local633);
													continue;
												}
												if (local46 == 5501) {
													local13 -= 4;
													local628 = Static253.anIntArray519[local13];
													local633 = Static253.anIntArray519[local13 + 1];
													local873 = Static253.anIntArray519[local13 + 2];
													local476 = Static253.anIntArray519[local13 + 3];
													Static294.method944(local476, local633, (local628 & 0x3FFF) - Static135.anInt2659, local873, (local628 >> 14 & 0x3FFF) - Static38.anInt714);
													continue;
												}
												if (local46 == 5502) {
													local13 -= 6;
													local628 = Static253.anIntArray519[local13];
													if (local628 >= 2) {
														throw new RuntimeException();
													}
													Static103.anInt2203 = local628;
													local633 = Static253.anIntArray519[local13 + 1];
													if (Static41.anIntArrayArrayArray6[Static103.anInt2203].length >> 1 <= local633 + 1) {
														throw new RuntimeException();
													}
													Static23.anInt476 = 0;
													Static140.anInt2744 = local633;
													Static59.anInt1254 = Static253.anIntArray519[local13 + 2];
													Static99.anInt2121 = Static253.anIntArray519[local13 + 3];
													local873 = Static253.anIntArray519[local13 + 4];
													if (local873 >= 2) {
														throw new RuntimeException();
													}
													Static236.anInt4437 = local873;
													local476 = Static253.anIntArray519[local13 + 5];
													if (Static41.anIntArrayArrayArray6[Static236.anInt4437].length >> 1 <= local476 + 1) {
														throw new RuntimeException();
													}
													Static228.anInt4270 = 3;
													Static102.anInt2179 = local476;
													continue;
												}
												if (local46 == 5503) {
													Static296.method716();
													continue;
												}
												if (local46 == 5504) {
													local13 -= 2;
													Static138.method3840(Static253.anIntArray519[local13], Static253.anIntArray519[local13 + 1]);
													continue;
												}
												if (local46 == 5505) {
													Static253.anIntArray519[local13++] = (int) Static8.aFloat4;
													continue;
												}
												if (local46 == 5506) {
													Static253.anIntArray519[local13++] = (int) Static148.aFloat64;
													continue;
												}
												if (local46 == 5507) {
													Static76.method3984();
													continue;
												}
												if (local46 == 5508) {
													Static272.method4178();
													continue;
												}
												if (local46 == 5509) {
													Static115.method2106();
													continue;
												}
												if (local46 == 5510) {
													Static277.method4242();
													continue;
												}
												if (local46 == 5512) {
													Static236.method3799();
													continue;
												}
											} else if (local46 < 5700) {
												if (local46 == 5600) {
													local19 -= 2;
													local435 = Static136.aStringArray16[local19];
													local2898 = Static136.aStringArray16[local19 + 1];
													local13--;
													local873 = Static253.anIntArray519[local13];
													if (Static97.anInt2087 == 10 && Static189.anInt3669 == 0 && Static129.anInt2552 == 0 && Static74.anInt1611 == 0 && Static189.anInt3640 == 0) {
														Static224.method3620(local873, local2898, local435);
													}
													continue;
												}
												if (local46 == 5601) {
													Static176.method3006();
													continue;
												}
												if (local46 == 5602) {
													if (Static129.anInt2552 == 0) {
														Static13.anInt282 = -2;
													}
													continue;
												}
												if (local46 == 5603) {
													local13 -= 4;
													if (Static97.anInt2087 == 10 && Static189.anInt3669 == 0 && Static129.anInt2552 == 0 && Static74.anInt1611 == 0 && Static189.anInt3640 == 0) {
														Static38.method661(Static253.anIntArray519[local13 + 1], Static253.anIntArray519[local13 + 3], Static253.anIntArray519[local13 + 2], Static253.anIntArray519[local13]);
													}
													continue;
												}
												if (local46 == 5604) {
													local19--;
													if (Static97.anInt2087 == 10 && Static189.anInt3669 == 0 && Static129.anInt2552 == 0 && Static74.anInt1611 == 0 && Static189.anInt3640 == 0) {
														Static110.method2028(Static282.method4276(Static136.aStringArray16[local19]));
													}
													continue;
												}
												if (local46 == 5605) {
													local19 -= 3;
													local13 -= 7;
													if (Static97.anInt2087 == 10 && Static189.anInt3669 == 0 && Static129.anInt2552 == 0 && Static74.anInt1611 == 0 && Static189.anInt3640 == 0) {
														Static75.method1855(Static253.anIntArray519[local13 + 3], Static253.anIntArray519[local13 + 4] == 1, Static253.anIntArray519[local13 + 2], Static253.anIntArray519[local13 + 5] == 1, Static136.aStringArray16[local19 + 1], Static253.anIntArray519[local13 + 6] == 1, Static136.aStringArray16[local19 + 2], Static282.method4276(Static136.aStringArray16[local19]), Static253.anIntArray519[local13 + 1], Static253.anIntArray519[local13]);
													}
													continue;
												}
												if (local46 == 5606) {
													if (Static74.anInt1611 == 0) {
														Static104.anInt2212 = -2;
													}
													continue;
												}
												if (local46 == 5607) {
													Static253.anIntArray519[local13++] = Static13.anInt282;
													continue;
												}
												if (local46 == 5608) {
													Static253.anIntArray519[local13++] = Static120.anInt2454;
													continue;
												}
												if (local46 == 5609) {
													Static253.anIntArray519[local13++] = Static104.anInt2212;
													continue;
												}
												if (local46 == 5610) {
													for (local628 = 0; local628 < 5; local628++) {
														Static136.aStringArray16[local19++] = Static79.aStringArray11.length <= local628 ? "" : Static132.method2308(Static79.aStringArray11[local628]);
													}
													Static79.aStringArray11 = null;
													continue;
												}
												if (local46 == 5611) {
													Static253.anIntArray519[local13++] = Static212.anInt4028;
													continue;
												}
											} else if (local46 < 6100) {
												if (local46 == 6001) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (local628 < 1) {
														local628 = 1;
													}
													if (local628 > 4) {
														local628 = 4;
													}
													Static153.anInt2340 = local628;
													if (!Static71.aBoolean165 || !Static69.aBoolean146) {
														if (Static153.anInt2340 == 1) {
															Static119.method2167(0.9F);
														}
														if (Static153.anInt2340 == 2) {
															Static119.method2167(0.8F);
														}
														if (Static153.anInt2340 == 3) {
															Static119.method2167(0.7F);
														}
														if (Static153.anInt2340 == 4) {
															Static119.method2167(0.6F);
														}
													}
													if (Static71.aBoolean165) {
														Static47.method893();
														if (!Static69.aBoolean146) {
															Static183.method3108();
														}
													}
													Static181.method3084();
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6002) {
													local13--;
													Static280.method4271(Static253.anIntArray519[local13] == 1);
													Static145.method2519();
													Static183.method3108();
													Static28.method513();
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6003) {
													local13--;
													Static128.aBoolean223 = Static253.anIntArray519[local13] == 1;
													Static28.method513();
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6005) {
													local13--;
													Static41.aBoolean79 = Static253.anIntArray519[local13] == 1;
													Static183.method3108();
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6006) {
													local13--;
													Static286.aBoolean488 = Static253.anIntArray519[local13] == 1;
													((Class52_Sub1) Static119.anInterface5_1).method1494(!Static286.aBoolean488);
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6007) {
													local13--;
													Static271.aBoolean476 = Static253.anIntArray519[local13] == 1;
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6008) {
													local13--;
													Static174.aBoolean528 = Static253.anIntArray519[local13] == 1;
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6009) {
													local13--;
													Static142.aBoolean243 = Static253.anIntArray519[local13] == 1;
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6010) {
													local13--;
													Static294.aBoolean109 = Static253.anIntArray519[local13] == 1;
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6011) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (local628 < 0 || local628 > 2) {
														local628 = 0;
													}
													Static147.anInt5168 = local628;
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6012) {
													if (Static71.aBoolean165) {
														Static165.method4612(0, 0);
													}
													local13--;
													Static69.aBoolean146 = Static253.anIntArray519[local13] == 1;
													if (Static71.aBoolean165 && Static69.aBoolean146) {
														Static119.method2167(0.7F);
													} else {
														if (Static153.anInt2340 == 1) {
															Static119.method2167(0.9F);
														}
														if (Static153.anInt2340 == 2) {
															Static119.method2167(0.8F);
														}
														if (Static153.anInt2340 == 3) {
															Static119.method2167(0.7F);
														}
														if (Static153.anInt2340 == 4) {
															Static119.method2167(0.6F);
														}
													}
													Static183.method3108();
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6014) {
													local13--;
													Static43.aBoolean88 = Static253.anIntArray519[local13] == 1;
													if (Static71.aBoolean165) {
														Static183.method3108();
													}
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6015) {
													local13--;
													Static222.aBoolean379 = Static253.anIntArray519[local13] == 1;
													if (Static71.aBoolean165) {
														Static47.method893();
													}
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6016) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (Static71.aBoolean165) {
														Static300.aBoolean509 = true;
													}
													if (local628 < 0 || local628 > 2) {
														local628 = 0;
													}
													Static40.anInt844 = local628;
													continue;
												}
												if (local46 == 6017) {
													local13--;
													Static230.aBoolean388 = Static253.anIntArray519[local13] == 1;
													Static23.method465();
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6018) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (local628 < 0) {
														local628 = 0;
													}
													if (local628 > 127) {
														local628 = 127;
													}
													Static253.anInt4650 = local628;
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6019) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (local628 < 0) {
														local628 = 0;
													}
													if (local628 > 255) {
														local628 = 255;
													}
													if (Static172.anInt3363 != local628) {
														if (Static172.anInt3363 == 0 && Static226.anInt4236 != -1) {
															Static130.method2283(Static197.aClass119_68, local628, Static226.anInt4236);
															Static197.aBoolean347 = false;
														} else if (local628 == 0) {
															Static179.method3039();
															Static197.aBoolean347 = false;
														} else {
															Static64.method1134(local628);
														}
														Static172.anInt3363 = local628;
													}
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6020) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (local628 < 0) {
														local628 = 0;
													}
													if (local628 > 127) {
														local628 = 127;
													}
													Static167.anInt638 = local628;
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													continue;
												}
												if (local46 == 6021) {
													local13--;
													Static48.aBoolean103 = Static253.anIntArray519[local13] == 1;
													Static28.method513();
													continue;
												}
												if (local46 == 6023) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local1511 = false;
													if (local628 < 0) {
														local628 = 0;
													}
													if (local628 > 2) {
														local628 = 2;
													}
													if (Static73.anInt1579 < 96) {
														local1511 = true;
														local628 = 0;
													}
													Static52.method969(local628);
													Static304.method4550(Static222.aClass176_3);
													Static164.aBoolean283 = false;
													Static253.anIntArray519[local13++] = local1511 ? 0 : 1;
													continue;
												}
												if (local46 == 6024) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (local628 < 0 || local628 > 2) {
														local628 = 0;
													}
													Static296.anInt842 = local628;
													Static304.method4550(Static222.aClass176_3);
													continue;
												}
												if (local46 == 6027) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (!Static71.aBoolean165) {
														continue;
													}
													if (local628 < 0 || local628 > 1) {
														local628 = 0;
													}
													Static260.method4031(local628 == 1);
													continue;
												}
												if (local46 == 6028) {
													local13--;
													Static81.aBoolean176 = Static253.anIntArray519[local13] != 0;
													Static304.method4550(Static222.aClass176_3);
													continue;
												}
											} else if (local46 < 6200) {
												if (local46 == 6101) {
													Static253.anIntArray519[local13++] = Static153.anInt2340;
													continue;
												}
												if (local46 == 6102) {
													Static253.anIntArray519[local13++] = Static115.method2108() ? 1 : 0;
													continue;
												}
												if (local46 == 6103) {
													Static253.anIntArray519[local13++] = Static128.aBoolean223 ? 1 : 0;
													continue;
												}
												if (local46 == 6105) {
													Static253.anIntArray519[local13++] = Static41.aBoolean79 ? 1 : 0;
													continue;
												}
												if (local46 == 6106) {
													Static253.anIntArray519[local13++] = Static286.aBoolean488 ? 1 : 0;
													continue;
												}
												if (local46 == 6107) {
													Static253.anIntArray519[local13++] = Static271.aBoolean476 ? 1 : 0;
													continue;
												}
												if (local46 == 6108) {
													Static253.anIntArray519[local13++] = Static174.aBoolean528 ? 1 : 0;
													continue;
												}
												if (local46 == 6109) {
													Static253.anIntArray519[local13++] = Static142.aBoolean243 ? 1 : 0;
													continue;
												}
												if (local46 == 6110) {
													Static253.anIntArray519[local13++] = Static294.aBoolean109 ? 1 : 0;
													continue;
												}
												if (local46 == 6111) {
													Static253.anIntArray519[local13++] = Static147.anInt5168;
													continue;
												}
												if (local46 == 6112) {
													Static253.anIntArray519[local13++] = Static69.aBoolean146 ? 1 : 0;
													continue;
												}
												if (local46 == 6114) {
													Static253.anIntArray519[local13++] = Static43.aBoolean88 ? 1 : 0;
													continue;
												}
												if (local46 == 6115) {
													Static253.anIntArray519[local13++] = Static222.aBoolean379 ? 1 : 0;
													continue;
												}
												if (local46 == 6116) {
													Static253.anIntArray519[local13++] = Static40.anInt844;
													continue;
												}
												if (local46 == 6117) {
													Static253.anIntArray519[local13++] = Static230.aBoolean388 ? 1 : 0;
													continue;
												}
												if (local46 == 6118) {
													Static253.anIntArray519[local13++] = Static253.anInt4650;
													continue;
												}
												if (local46 == 6119) {
													Static253.anIntArray519[local13++] = Static172.anInt3363;
													continue;
												}
												if (local46 == 6120) {
													Static253.anIntArray519[local13++] = Static167.anInt638;
													continue;
												}
												if (local46 == 6121) {
													if (Static71.aBoolean165) {
														Static253.anIntArray519[local13++] = Static71.aBoolean154 ? 1 : 0;
													} else {
														Static253.anIntArray519[local13++] = 0;
													}
													continue;
												}
												if (local46 == 6123) {
													Static253.anIntArray519[local13++] = Static52.method967();
													continue;
												}
												if (local46 == 6124) {
													Static253.anIntArray519[local13++] = Static296.anInt842;
													continue;
												}
												if (local46 == 6126) {
													if (Static71.aBoolean165) {
														Static253.anIntArray519[local13++] = Static152.method2652() ? 1 : 0;
													} else {
														Static253.anIntArray519[local13++] = 0;
													}
													continue;
												}
												if (local46 == 6127) {
													Static253.anIntArray519[local13++] = Static5.aBoolean18 ? 1 : 0;
													continue;
												}
												if (local46 == 6128) {
													Static253.anIntArray519[local13++] = Static81.aBoolean176 ? 1 : 0;
													continue;
												}
											} else if (local46 < 6300) {
												if (local46 == 6200) {
													local13 -= 2;
													Static189.aShort41 = (short) Static253.anIntArray519[local13];
													if (Static189.aShort41 <= 0) {
														Static189.aShort41 = 256;
													}
													Static189.aShort42 = (short) Static253.anIntArray519[local13 + 1];
													if (Static189.aShort42 <= 0) {
														Static189.aShort42 = 205;
													}
													continue;
												}
												if (local46 == 6201) {
													local13 -= 2;
													Static199.aShort44 = (short) Static253.anIntArray519[local13];
													if (Static199.aShort44 <= 0) {
														Static199.aShort44 = 256;
													}
													Static34.aShort14 = (short) Static253.anIntArray519[local13 + 1];
													if (Static34.aShort14 <= 0) {
														Static34.aShort14 = 320;
													}
													continue;
												}
												if (local46 == 6202) {
													local13 -= 4;
													Static28.aShort7 = (short) Static253.anIntArray519[local13];
													if (Static28.aShort7 <= 0) {
														Static28.aShort7 = 1;
													}
													Static238.aShort43 = (short) Static253.anIntArray519[local13 + 1];
													if (Static238.aShort43 <= 0) {
														Static238.aShort43 = 32767;
													} else if (Static28.aShort7 > Static238.aShort43) {
														Static238.aShort43 = Static28.aShort7;
													}
													Static143.aShort22 = (short) Static253.anIntArray519[local13 + 2];
													if (Static143.aShort22 <= 0) {
														Static143.aShort22 = 1;
													}
													Static271.aShort48 = (short) Static253.anIntArray519[local13 + 3];
													if (Static271.aShort48 <= 0) {
														Static271.aShort48 = 32767;
													} else if (Static271.aShort48 < Static143.aShort22) {
														Static271.aShort48 = Static143.aShort22;
													}
													continue;
												}
												if (local46 == 6203) {
													Static56.method1015(Static273.aClass157_18.anInt4689, Static273.aClass157_18.anInt4680, 0, false, 0);
													Static253.anIntArray519[local13++] = Static172.anInt3358;
													Static253.anIntArray519[local13++] = Static214.anInt1383;
													continue;
												}
												if (local46 == 6204) {
													Static253.anIntArray519[local13++] = Static199.aShort44;
													Static253.anIntArray519[local13++] = Static34.aShort14;
													continue;
												}
												if (local46 == 6205) {
													Static253.anIntArray519[local13++] = Static189.aShort41;
													Static253.anIntArray519[local13++] = Static189.aShort42;
													continue;
												}
											} else if (local46 < 6400) {
												if (local46 == 6300) {
													Static253.anIntArray519[local13++] = (int) (Static244.method3859() / 60000L);
													continue;
												}
												if (local46 == 6301) {
													Static253.anIntArray519[local13++] = (int) (Static244.method3859() / 86400000L) - 11745;
													continue;
												}
												if (local46 == 6302) {
													local13 -= 3;
													local633 = Static253.anIntArray519[local13 + 1];
													local628 = Static253.anIntArray519[local13];
													local873 = Static253.anIntArray519[local13 + 2];
													Static304.aCalendar2.clear();
													Static304.aCalendar2.set(11, 12);
													Static304.aCalendar2.set(local873, local633, local628);
													Static253.anIntArray519[local13++] = (int) (Static304.aCalendar2.getTime().getTime() / 86400000L) - 11745;
													continue;
												}
												if (local46 == 6303) {
													Static304.aCalendar2.clear();
													Static304.aCalendar2.setTime(new Date(Static244.method3859()));
													Static253.anIntArray519[local13++] = Static304.aCalendar2.get(1);
													continue;
												}
												if (local46 == 6304) {
													local1511 = true;
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (local628 < 0) {
														local1511 = (local628 + 1) % 4 == 0;
													} else if (local628 < 1582) {
														local1511 = local628 % 4 == 0;
													} else if (local628 % 4 != 0) {
														local1511 = false;
													} else if (local628 % 100 != 0) {
														local1511 = true;
													} else if (local628 % 400 != 0) {
														local1511 = false;
													}
													Static253.anIntArray519[local13++] = local1511 ? 1 : 0;
													continue;
												}
											} else if (local46 < 6500) {
												if (local46 == 6405) {
													Static253.anIntArray519[local13++] = Static23.method463() ? 1 : 0;
													continue;
												}
												if (local46 == 6406) {
													Static253.anIntArray519[local13++] = Static173.method2975() ? 1 : 0;
													continue;
												}
											} else if (local46 < 6600) {
												if (local46 == 6500) {
													if (Static97.anInt2087 == 10 && Static189.anInt3669 == 0 && Static129.anInt2552 == 0 && Static74.anInt1611 == 0) {
														Static253.anIntArray519[local13++] = Static117.method2131() == -1 ? 0 : 1;
														continue;
													}
													Static253.anIntArray519[local13++] = 1;
													continue;
												}
												@Pc(6866) Class145 local6866;
												@Pc(6842) Class4_Sub1 local6842;
												if (local46 == 6501) {
													local6842 = Static130.method2282();
													if (local6842 == null) {
														Static253.anIntArray519[local13++] = -1;
														Static253.anIntArray519[local13++] = 0;
														Static136.aStringArray16[local19++] = "";
														Static253.anIntArray519[local13++] = 0;
														Static136.aStringArray16[local19++] = "";
														Static253.anIntArray519[local13++] = 0;
													} else {
														Static253.anIntArray519[local13++] = local6842.anInt208;
														Static253.anIntArray519[local13++] = local6842.anInt193;
														Static136.aStringArray16[local19++] = local6842.aString5;
														local6866 = local6842.method108();
														Static253.anIntArray519[local13++] = local6866.anInt4466;
														Static136.aStringArray16[local19++] = local6866.aString158;
														Static253.anIntArray519[local13++] = local6842.anInt197;
													}
													continue;
												}
												if (local46 == 6502) {
													local6842 = Static172.method2961();
													if (local6842 == null) {
														Static253.anIntArray519[local13++] = -1;
														Static253.anIntArray519[local13++] = 0;
														Static136.aStringArray16[local19++] = "";
														Static253.anIntArray519[local13++] = 0;
														Static136.aStringArray16[local19++] = "";
														Static253.anIntArray519[local13++] = 0;
													} else {
														Static253.anIntArray519[local13++] = local6842.anInt208;
														Static253.anIntArray519[local13++] = local6842.anInt193;
														Static136.aStringArray16[local19++] = local6842.aString5;
														local6866 = local6842.method108();
														Static253.anIntArray519[local13++] = local6866.anInt4466;
														Static136.aStringArray16[local19++] = local6866.aString158;
														Static253.anIntArray519[local13++] = local6842.anInt197;
													}
													continue;
												}
												if (local46 == 6503) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													if (Static97.anInt2087 == 10 && Static189.anInt3669 == 0 && Static129.anInt2552 == 0 && Static74.anInt1611 == 0) {
														Static253.anIntArray519[local13++] = Static312.method4646(local628) ? 1 : 0;
														continue;
													}
													Static253.anIntArray519[local13++] = 0;
													continue;
												}
												if (local46 == 6504) {
													local13--;
													Static205.anInt3963 = Static253.anIntArray519[local13];
													Static304.method4550(Static222.aClass176_3);
													continue;
												}
												if (local46 == 6505) {
													Static253.anIntArray519[local13++] = Static205.anInt3963;
													continue;
												}
												if (local46 == 6506) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													@Pc(7086) Class4_Sub1 local7086 = Static235.method3787(local628);
													if (local7086 == null) {
														Static253.anIntArray519[local13++] = -1;
														Static136.aStringArray16[local19++] = "";
														Static253.anIntArray519[local13++] = 0;
														Static136.aStringArray16[local19++] = "";
														Static253.anIntArray519[local13++] = 0;
													} else {
														Static253.anIntArray519[local13++] = local7086.anInt193;
														Static136.aStringArray16[local19++] = local7086.aString5;
														@Pc(7104) Class145 local7104 = local7086.method108();
														Static253.anIntArray519[local13++] = local7104.anInt4466;
														Static136.aStringArray16[local19++] = local7104.aString158;
														Static253.anIntArray519[local13++] = local7086.anInt197;
													}
													continue;
												}
												if (local46 == 6507) {
													local13 -= 4;
													local628 = Static253.anIntArray519[local13];
													local1511 = Static253.anIntArray519[local13 + 1] == 1;
													local873 = Static253.anIntArray519[local13 + 2];
													local7193 = Static253.anIntArray519[local13 + 3] == 1;
													Static183.method3111(local873, local1511, local7193, local628);
													continue;
												}
											} else if (local46 < 6700) {
												if (local46 == 6600) {
													local13--;
													Static240.aBoolean404 = Static253.anIntArray519[local13] == 1;
													Static304.method4550(Static222.aClass176_3);
													continue;
												}
												if (local46 == 6601) {
													Static253.anIntArray519[local13++] = Static240.aBoolean404 ? 1 : 0;
													continue;
												}
											} else if (local46 < 6900) {
												@Pc(6670) Class136 local6670;
												if (local46 == 6800) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local6670 = Static160.method2739(local628);
													if (local6670.aString142 == null) {
														Static136.aStringArray16[local19++] = "";
													} else {
														Static136.aStringArray16[local19++] = local6670.aString142;
													}
													continue;
												}
												if (local46 == 6801) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local6670 = Static160.method2739(local628);
													Static253.anIntArray519[local13++] = local6670.anInt4062;
													continue;
												}
												if (local46 == 6802) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local6670 = Static160.method2739(local628);
													Static253.anIntArray519[local13++] = local6670.anInt4058;
													continue;
												}
												if (local46 == 6803) {
													local13--;
													local628 = Static253.anIntArray519[local13];
													local6670 = Static160.method2739(local628);
													Static253.anIntArray519[local13++] = local6670.anInt4073;
													continue;
												}
											}
										}
									}
								}
							}
						} else {
							if (local46 >= 2000) {
								local13--;
								local1013 = Static206.method3444(Static253.anIntArray519[local13]);
								local46 -= 1000;
							} else {
								local1013 = local845 ? Static44.aClass157_4 : Static28.aClass157_3;
							}
							if (local46 == 1000) {
								local13 -= 4;
								local1013.anInt4738 = Static253.anIntArray519[local13];
								local1013.anInt4744 = Static253.anIntArray519[local13 + 1];
								local633 = Static253.anIntArray519[local13 + 2];
								if (local633 < 0) {
									local633 = 0;
								} else if (local633 > 5) {
									local633 = 5;
								}
								local873 = Static253.anIntArray519[local13 + 3];
								if (local873 < 0) {
									local873 = 0;
								} else if (local873 > 5) {
									local873 = 5;
								}
								local1013.aByte15 = (byte) local633;
								local1013.aByte16 = (byte) local873;
								Static224.method3621(local1013);
								Static150.method2627(local1013);
								if (local1013.anInt4692 == -1) {
									Static106.method3320(local1013.anInt4672);
								}
								continue;
							}
							if (local46 == 1001) {
								local13 -= 4;
								local1013.anInt4665 = Static253.anIntArray519[local13];
								local1013.anInt4704 = Static253.anIntArray519[local13 + 1];
								local1013.anInt4718 = 0;
								local1013.anInt4747 = 0;
								local633 = Static253.anIntArray519[local13 + 2];
								local873 = Static253.anIntArray519[local13 + 3];
								if (local633 < 0) {
									local633 = 0;
								} else if (local633 > 4) {
									local633 = 4;
								}
								local1013.aByte17 = (byte) local633;
								if (local873 < 0) {
									local873 = 0;
								} else if (local873 > 4) {
									local873 = 4;
								}
								local1013.aByte14 = (byte) local873;
								Static224.method3621(local1013);
								Static150.method2627(local1013);
								if (local1013.anInt4748 == 0) {
									Static39.method676(local1013, false);
								}
								continue;
							}
							if (local46 == 1003) {
								local13--;
								local1511 = Static253.anIntArray519[local13] == 1;
								if (local1511 != local1013.aBoolean435) {
									local1013.aBoolean435 = local1511;
									Static224.method3621(local1013);
								}
								if (local1013.anInt4692 == -1) {
									Static203.method2969(local1013.anInt4672);
								}
								continue;
							}
							if (local46 == 1004) {
								local13 -= 2;
								local1013.anInt4719 = Static253.anIntArray519[local13];
								local1013.anInt4685 = Static253.anIntArray519[local13 + 1];
								Static224.method3621(local1013);
								Static150.method2627(local1013);
								if (local1013.anInt4748 == 0) {
									Static39.method676(local1013, false);
								}
								continue;
							}
							if (local46 == 1005) {
								local13--;
								local1013.aBoolean450 = Static253.anIntArray519[local13] == 1;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14985) Exception local14985) {
			if (arg1.aString105 == null) {
				if (Static210.anInt4011 != 0) {
					Static305.method4555("Clientscript error - check log for details", "", 0);
				}
				Static6.method4140(local14985, "CS2 - scr:" + arg1.aLong210 + " op:" + local26);
			} else {
				@Pc(14994) StringBuffer local14994 = new StringBuffer(30);
				local14994.append("%0a - in: ").append(arg1.aString105);
				for (local628 = Static37.anInt687 - 1; local628 >= 0; local628--) {
					local14994.append("%0a - via: ").append(Static261.aClass83Array1[local628].aClass1_Sub5_Sub13_1.aString105);
				}
				if (local26 == 40) {
					local628 = local29[local21];
					local14994.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local628));
				}
				if (Static210.anInt4011 != 0) {
					Static305.method4555("Clientscript error in: " + arg1.aString105, "", 0);
				}
				Static6.method4140(local14985, "CS2 - scr:" + arg1.aLong210 + " op:" + local26 + local14994.toString());
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)I")
	public static int method4676(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
