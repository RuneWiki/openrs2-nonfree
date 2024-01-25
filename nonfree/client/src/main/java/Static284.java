import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!km", name = "g", descriptor = "I")
	public static int anInt4831;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_56 = new Class154(56, 3);

	@OriginalMember(owner = "client!km", name = "h", descriptor = "I")
	public static int anInt4832 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[Lclient!ps;I)V")
	public static void method4048(@OriginalArg(0) int arg0, @OriginalArg(1) Class273[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class273 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt6820 && !Static70.method1167(local9)) {
				if (local9.anInt6868 == 0) {
					method4048(local9.anInt6810, arg1);
					if (local9.aClass273Array2 != null) {
						method4048(local9.anInt6810, local9.aClass273Array2);
					}
					@Pc(43) Class2_Sub33 local43 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local9.anInt6810);
					if (local43 != null) {
						Static366.method5156(local43.anInt5981);
					}
				}
				if (local9.anInt6868 == 6 && local9.anInt6799 != -1) {
					@Pc(63) Class148 local63 = Static117.aClass18_1.method296(local9.anInt6799);
					if (local63 != null) {
						local9.anInt6811 += Static534.anInt8792;
						@Pc(74) int local74 = local9.anInt6802;
						while (local9.anInt6811 > local63.anIntArray253[local9.anInt6802]) {
							local9.anInt6811 -= local63.anIntArray253[local9.anInt6802];
							local9.anInt6802++;
							if (local63.anIntArray254.length <= local9.anInt6802) {
								local9.anInt6802 -= local63.anInt3045;
								if (local9.anInt6802 < 0 || local9.anInt6802 >= local63.anIntArray254.length) {
									local9.anInt6802 = 0;
								}
							}
							local9.anInt6833 = local9.anInt6802 + 1;
							if (local63.anIntArray254.length <= local9.anInt6833) {
								local9.anInt6833 -= local63.anInt3045;
								if (local9.anInt6833 < 0 || local9.anInt6833 >= local63.anIntArray254.length) {
									local9.anInt6833 = -1;
								}
							}
							Static155.method2111(local9);
						}
						if (local9.anInt6802 != local74) {
							Static28.method382(local63, local9.anInt6802);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)I")
	public static int method4050(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLclient!pb;)V")
	public static void method4051(@OriginalArg(1) Class262 arg0) {
		@Pc(12) int local12;
		@Pc(31) int local31;
		@Pc(37) int local37;
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(64) int local64;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(91) int local91;
		@Pc(189) Class12_Sub2_Sub1_Sub1 local189;
		@Pc(54) int local54;
		@Pc(58) int local58;
		if (Static251.aClass262_7 == arg0) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			@Pc(23) boolean local23 = (local12 & 0x80) != 0;
			local31 = (local12 >> 3 & 0x7) + Static199.anInt2913;
			local37 = Static262.anInt4306 + (local12 & 0x7);
			local43 = Static361.aClass2_Sub7_Sub2_1.method4477() + local31;
			local50 = local37 + Static361.aClass2_Sub7_Sub2_1.method4477();
			local54 = Static361.aClass2_Sub7_Sub2_1.method4478();
			local58 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local64 = Static361.aClass2_Sub7_Sub2_1.method4464() * 4;
			local70 = Static361.aClass2_Sub7_Sub2_1.method4464() * 4;
			local74 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local78 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local82 = Static361.aClass2_Sub7_Sub2_1.method4464();
			if (local82 == 255) {
				local82 = -1;
			}
			local91 = Static361.aClass2_Sub7_Sub2_1.method4518();
			if (local31 >= 0 && local37 >= 0 && local31 < Static281.anInt4822 && Static29.anInt491 > local37 && local43 >= 0 && local50 >= 0 && Static281.anInt4822 > local43 && local50 < Static29.anInt491 && local58 != 65535) {
				local50 = local50 * 512 + 256;
				local70 <<= 0x2;
				local64 <<= 0x2;
				local91 <<= 0x2;
				local43 = local43 * 512 + 256;
				local37 = local37 * 512 + 256;
				local31 = local31 * 512 + 256;
				local189 = new Class12_Sub2_Sub1_Sub1(local58, Static307.anInt5077, Static307.anInt5077, local31, local37, local64, local74 + Static532.anInt8757, local78 + Static532.anInt8757, local82, local91, local54, local70, local23);
				local189.method1010(Static24.method347(local50, local43, Static307.anInt5077) - local70, Static532.anInt8757 + local74, local43, local50);
				Static131.aClass70_5.method1269(new Class2_Sub2_Sub19(local189));
			}
			return;
		}
		@Pc(228) int local228;
		if (arg0 == Static371.aClass262_11) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = (local12 >> 4 & 0x7) + Static199.anInt2913;
			local31 = Static262.anInt4306 + (local12 & 0x7);
			local37 = Static361.aClass2_Sub7_Sub2_1.method4518();
			if (local37 == 65535) {
				local37 = -1;
			}
			local43 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local50 = local43 >> 4 & 0xF;
			local54 = local43 & 0x7;
			local58 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local64 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local70 = Static361.aClass2_Sub7_Sub2_1.method4518();
			if (local228 >= 0 && local31 >= 0 && Static281.anInt4822 > local228 && Static29.anInt491 > local31) {
				local74 = local50 + 1;
				if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0] >= local228 - local74 && local228 + local74 >= Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0] && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0] >= local31 - local74 && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0] <= local31 + local74) {
					Static241.method3438(local64, (local228 << 16) + (Static307.anInt5077 << 24) + (local31 << 8) + local50, local70, local58, local54, local37);
				}
			}
		} else if (arg0 == Static574.aClass262_15) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = Static199.anInt2913 + (local12 >> 4 & 0x7);
			local31 = (local12 & 0x7) + Static262.anInt4306;
			local37 = Static361.aClass2_Sub7_Sub2_1.method4518();
			if (local37 == 65535) {
				local37 = -1;
			}
			local43 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local50 = local43 >> 4 & 0xF;
			local54 = local43 & 0x7;
			local58 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local64 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local70 = Static361.aClass2_Sub7_Sub2_1.method4518();
			if (local228 >= 0 && local31 >= 0 && Static281.anInt4822 > local228 && Static29.anInt491 > local31) {
				local74 = local50 + 1;
				if (local228 - local74 <= Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0] && local228 + local74 >= Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0] && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0] >= local31 - local74 && local31 + local74 >= Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0]) {
					Static159.method2134(local37, local70, local54, local64, (local228 << 16) + (Static307.anInt5077 << 24) + (local31 << 8) + local50, local58);
				}
			}
		} else if (arg0 == Static84.aClass262_17) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = (local12 >> 4 & 0xF) + Static199.anInt2913 * 2;
			local31 = (local12 & 0xF) + Static262.anInt4306 * 2;
			local37 = Static361.aClass2_Sub7_Sub2_1.method4464();
			@Pc(550) boolean local550 = (local37 & 0x1) != 0;
			local50 = local37 >> 1;
			local54 = local228 + Static361.aClass2_Sub7_Sub2_1.method4477();
			local58 = local31 + Static361.aClass2_Sub7_Sub2_1.method4477();
			local64 = Static361.aClass2_Sub7_Sub2_1.method4478();
			local70 = Static361.aClass2_Sub7_Sub2_1.method4478();
			local74 = Static361.aClass2_Sub7_Sub2_1.method4518();
			@Pc(583) byte local583 = Static361.aClass2_Sub7_Sub2_1.method4477();
			local82 = Static361.aClass2_Sub7_Sub2_1.method4464() * 4;
			local91 = Static361.aClass2_Sub7_Sub2_1.method4518();
			@Pc(597) int local597 = Static361.aClass2_Sub7_Sub2_1.method4518();
			@Pc(601) int local601 = Static361.aClass2_Sub7_Sub2_1.method4464();
			if (local601 == 255) {
				local601 = -1;
			}
			@Pc(612) int local612 = Static361.aClass2_Sub7_Sub2_1.method4518();
			if (local228 >= 0 && local31 >= 0 && local228 < Static281.anInt4822 * 2 && Static281.anInt4822 * 2 > local31 && local54 >= 0 && local58 >= 0 && local54 < Static29.anInt491 * 2 && local58 < Static29.anInt491 * 2 && local74 != 65535) {
				local82 <<= 0x2;
				local54 = local54 * 256;
				local228 = local228 * 256;
				local78 = local583 << 2;
				local612 <<= 0x2;
				local31 *= 256;
				local58 = local58 * 256;
				if (local64 != 0) {
					@Pc(687) Class12_Sub2_Sub1_Sub4 local687 = null;
					@Pc(694) int local694;
					if (local64 < 0) {
						local694 = -local64 - 1;
						if (local694 == Static18.anInt4109) {
							local687 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30;
						} else {
							local687 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local694];
						}
					} else {
						local694 = local64 - 1;
						@Pc(720) Class2_Sub5 local720 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local694);
						if (local720 != null) {
							local687 = local720.aClass12_Sub2_Sub1_Sub4_Sub2_1;
						}
					}
					if (local687 != null) {
						@Pc(731) Class61 local731 = local687.method6767();
						if (local731.anIntArrayArray19 != null && local731.anIntArrayArray19[local50] != null) {
							@Pc(746) int local746 = local731.anIntArrayArray19[local50][0];
							@Pc(753) int local753 = local731.anIntArrayArray19[local50][2];
							@Pc(758) int local758 = local687.aClass352_7.method7410();
							@Pc(762) int local762 = Class285.anIntArray476[local758];
							@Pc(766) int local766 = Class285.anIntArray475[local758];
							@Pc(776) int local776 = local766 * local746 + local753 * local762 >> 14;
							@Pc(787) int local787 = local753 * local766 - local746 * local762 >> 14;
							local31 += local787;
							local228 += local776;
							local78 -= local731.anIntArrayArray19[local50][1];
						}
					}
				}
				@Pc(827) Class12_Sub2_Sub1_Sub1 local827 = new Class12_Sub2_Sub1_Sub1(local74, Static307.anInt5077, Static307.anInt5077, local228, local31, local78, Static532.anInt8757 + local91, Static532.anInt8757 + local597, local601, local612, local70, local82, local550);
				local827.method1010(Static24.method347(local58, local54, Static307.anInt5077) - local82, local91 + Static532.anInt8757, local54, local58);
				Static131.aClass70_5.method1269(new Class2_Sub2_Sub19(local827));
			}
		} else if (Static543.aClass262_14 == arg0) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = (local12 >> 4 & 0x7) + Static199.anInt2913;
			local31 = Static262.anInt4306 + (local12 & 0x7);
			local37 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local43 = local37 >> 2;
			local50 = local37 & 0x3;
			local54 = Static175.anIntArray358[local43];
			local58 = Static361.aClass2_Sub7_Sub2_1.method4517();
			if (Static184.method2358(Static386.anInt6384) || local228 >= 0 && local31 >= 0 && local228 < Static281.anInt4822 && local31 < Static29.anInt491) {
				Static422.method5653(local43, local54, local31, local228, local50, local58, Static307.anInt5077);
			}
		} else if (arg0 == Static90.aClass262_3) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = local12 >> 2;
			local31 = local12 & 0x3;
			local37 = Static175.anIntArray358[local228];
			local43 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local50 = (local43 >> 4 & 0x7) + Static199.anInt2913;
			local54 = (local43 & 0x7) + Static262.anInt4306;
			if (Static184.method2358(Static386.anInt6384) || local50 >= 0 && local54 >= 0 && Static281.anInt4822 > local50 && local54 < Static29.anInt491) {
				Static422.method5653(local228, local37, local54, local50, local31, -1, Static307.anInt5077);
			}
		} else if (Static220.aClass262_5 == arg0) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = (local12 >> 4 & 0x7) + Static199.anInt2913;
			local31 = Static262.anInt4306 + (local12 & 0x7);
			local37 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local43 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local50 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local54 = Static361.aClass2_Sub7_Sub2_1.method4464();
			if (local228 >= 0 && local31 >= 0 && Static281.anInt4822 > local228 && Static29.anInt491 > local31) {
				local58 = local228 * 512 + 256;
				local64 = local31 * 512 + 256;
				local70 = Static307.anInt5077;
				if (local70 < 3 && Static562.method7350(local228, local31)) {
					local70++;
				}
				@Pc(1095) Class12_Sub2_Sub1_Sub5 local1095 = new Class12_Sub2_Sub1_Sub5(local37, local50, Static532.anInt8757, Static307.anInt5077, local70, local58, Static24.method347(local64, local58, Static307.anInt5077) - local43, local64, local228, local228, local31, local31, local54);
				Static380.aClass70_51.method1269(new Class2_Sub2_Sub5(local1095));
			}
		} else if (Static591.aClass262_18 == arg0) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4521();
			local228 = Static361.aClass2_Sub7_Sub2_1.method4488();
			local31 = (local228 & 0x7) + Static262.anInt4306;
			local37 = local31 + Static310.anInt5129;
			local43 = Static199.anInt2913 + (local228 >> 4 & 0x7);
			local50 = Static485.anInt7725 + local43;
			local54 = Static361.aClass2_Sub7_Sub2_1.method4465();
			local58 = Static361.aClass2_Sub7_Sub2_1.method4521();
			if (Static18.anInt4109 != local58) {
				@Pc(1174) boolean local1174 = local43 >= 0 && local31 >= 0 && local43 < Static281.anInt4822 && Static29.anInt491 > local31;
				if (local1174 || Static184.method2358(Static386.anInt6384)) {
					Static421.method5636(local50, local37, new Class2_Sub32(local12, local54), Static307.anInt5077);
					if (local1174) {
						Static570.method7436(Static307.anInt5077, local31, local43);
					}
				}
			}
		} else if (Static422.aClass262_12 == arg0) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = (local12 & 0x7) + Static262.anInt4306;
			local31 = local228 + Static310.anInt5129;
			local37 = (local12 >> 4 & 0x7) + Static199.anInt2913;
			local43 = local37 + Static485.anInt7725;
			local50 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local54 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local58 = Static361.aClass2_Sub7_Sub2_1.method4518();
			if (Static531.aClass90_39 != null) {
				@Pc(1258) Class2_Sub6 local1258 = (Class2_Sub6) Static531.aClass90_39.method1685((long) (local31 << 14 | Static307.anInt5077 << 28 | local43));
				if (local1258 != null) {
					for (@Pc(1270) Class2_Sub32 local1270 = (Class2_Sub32) local1258.aClass70_1.method1264(); local1270 != null; local1270 = (Class2_Sub32) local1258.aClass70_1.method1261()) {
						if ((local50 & 0x7FFF) == local1270.anInt5953 && local1270.anInt5954 == local54) {
							local1270.method7657();
							local1270.anInt5954 = local58;
							Static421.method5636(local43, local31, local1270, Static307.anInt5077);
							break;
						}
					}
					if (local37 >= 0 && local228 >= 0 && local37 < Static281.anInt4822 && Static29.anInt491 > local228) {
						Static570.method7436(Static307.anInt5077, local228, local37);
					}
				}
			}
		} else if (Static157.aClass262_4 == arg0) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = Static262.anInt4306 + (local12 & 0x7);
			local31 = local228 + Static310.anInt5129;
			local37 = Static199.anInt2913 + (local12 >> 4 & 0x7);
			local43 = Static485.anInt7725 + local37;
			local50 = Static361.aClass2_Sub7_Sub2_1.method4465();
			local54 = Static361.aClass2_Sub7_Sub2_1.method4521();
			@Pc(1396) boolean local1396 = local37 >= 0 && local228 >= 0 && Static281.anInt4822 > local37 && local228 < Static29.anInt491;
			if (local1396 || Static184.method2358(Static386.anInt6384)) {
				Static421.method5636(local43, local31, new Class2_Sub32(local50, local54), Static307.anInt5077);
				if (local1396) {
					Static570.method7436(Static307.anInt5077, local228, local37);
				}
			}
		} else if (Static426.aClass262_13 == arg0) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local228 = Static361.aClass2_Sub7_Sub2_1.method4464();
			Static362.aClass290_2.method5799(local12).method4554(local228);
		} else if (Static575.aClass262_16 == arg0) {
			Static361.aClass2_Sub7_Sub2_1.method4464();
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = Static199.anInt2913 + (local12 >> 4 & 0x7);
			local31 = Static262.anInt4306 + (local12 & 0x7);
			local37 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local43 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local50 = Static361.aClass2_Sub7_Sub2_1.method4503();
			@Pc(1483) String local1483 = Static361.aClass2_Sub7_Sub2_1.method4494();
			Static432.method5694(Static307.anInt5077, local43, local31, local37, local1483, local50, local228);
		} else if (arg0 == Static275.aClass262_8) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = Static262.anInt4306 + (local12 & 0x7);
			local31 = Static310.anInt5129 + local228;
			local37 = Static199.anInt2913 + (local12 >> 4 & 0x7);
			local43 = local37 + Static485.anInt7725;
			local50 = Static361.aClass2_Sub7_Sub2_1.method4518();
			@Pc(1543) Class2_Sub6 local1543 = (Class2_Sub6) Static531.aClass90_39.method1685((long) (local31 << 14 | Static307.anInt5077 << 28 | local43));
			if (local1543 != null) {
				for (@Pc(1551) Class2_Sub32 local1551 = (Class2_Sub32) local1543.aClass70_1.method1264(); local1551 != null; local1551 = (Class2_Sub32) local1543.aClass70_1.method1261()) {
					if ((local50 & 0x7FFF) == local1551.anInt5953) {
						local1551.method7657();
						break;
					}
				}
				if (local1543.aClass70_1.method1263()) {
					local1543.method7657();
				}
				if (local37 >= 0 && local228 >= 0 && local37 < Static281.anInt4822 && Static29.anInt491 > local228) {
					Static570.method7436(Static307.anInt5077, local228, local37);
				}
			}
		} else if (arg0 == Static235.aClass262_6) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4488();
			local228 = Static199.anInt2913 + (local12 >> 4 & 0x7);
			local31 = (local12 & 0x7) + Static262.anInt4306;
			local37 = Static361.aClass2_Sub7_Sub2_1.method4517();
			if (local37 == 65535) {
				local37 = -1;
			}
			local43 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local50 = local43 >> 2;
			local54 = local43 & 0x3;
			local58 = Static175.anIntArray358[local50];
			Static576.method7468(Static307.anInt5077, local54, local31, local58, local37, local228, local50);
		} else if (arg0 == Static308.aClass262_9) {
			local12 = Static361.aClass2_Sub7_Sub2_1.method4464();
			local228 = (local12 >> 4 & 0xF) + Static199.anInt2913 * 2;
			local31 = Static262.anInt4306 * 2 + (local12 & 0xF);
			@Pc(1698) boolean local1698 = Static361.aClass2_Sub7_Sub2_1.method4464() != 0;
			local43 = local228 + Static361.aClass2_Sub7_Sub2_1.method4477();
			local50 = local31 + Static361.aClass2_Sub7_Sub2_1.method4477();
			local54 = Static361.aClass2_Sub7_Sub2_1.method4478();
			local58 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local64 = Static361.aClass2_Sub7_Sub2_1.method4464() * 4;
			local70 = Static361.aClass2_Sub7_Sub2_1.method4464() * 4;
			local74 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local78 = Static361.aClass2_Sub7_Sub2_1.method4518();
			local82 = Static361.aClass2_Sub7_Sub2_1.method4464();
			if (local82 == 255) {
				local82 = -1;
			}
			local91 = Static361.aClass2_Sub7_Sub2_1.method4518();
			if (local228 >= 0 && local31 >= 0 && local228 < Static281.anInt4822 * 2 && local31 < Static281.anInt4822 * 2 && local43 >= 0 && local50 >= 0 && local43 < Static29.anInt491 * 2 && local50 < Static29.anInt491 * 2 && local58 != 65535) {
				local43 = local43 * 256;
				local64 <<= 0x2;
				local70 <<= 0x2;
				local91 <<= 0x2;
				local50 = local50 * 256;
				local228 *= 256;
				local31 *= 256;
				local189 = new Class12_Sub2_Sub1_Sub1(local58, Static307.anInt5077, Static307.anInt5077, local228, local31, local64, local74 + Static532.anInt8757, Static532.anInt8757 + local78, local82, local91, local54, local70, local1698);
				local189.method1010(Static24.method347(local50, local43, Static307.anInt5077) - local70, Static532.anInt8757 + local74, local43, local50);
				Static131.aClass70_5.method1269(new Class2_Sub2_Sub19(local189));
			}
		} else {
			Static357.method5094(null, "T3 - " + arg0);
			Static449.method5858(false);
		}
	}
}
