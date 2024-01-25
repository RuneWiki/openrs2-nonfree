import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!il", name = "J", descriptor = "I")
	public static int anInt2791;

	@OriginalMember(owner = "client!il", name = "Q", descriptor = "Z")
	public static boolean aBoolean157;

	@OriginalMember(owner = "client!il", name = "F", descriptor = "Lclient!ls;")
	public static final Class3_Sub29 aClass3_Sub29_1 = new Class3_Sub29(0, 0);

	@OriginalMember(owner = "client!il", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString106 = "level: ";

	@OriginalMember(owner = "client!il", name = "L", descriptor = "I")
	public static int anInt2792 = 0;

	@OriginalMember(owner = "client!il", name = "O", descriptor = "[S")
	public static final short[] aShortArray70 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(B)V")
	public static void method2254() {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (Static92.anInt1818 == 167) {
			local16 = Static20.aClass3_Sub4_Sub2_1.method3649();
			local20 = Static20.aClass3_Sub4_Sub2_1.method3643();
			Static268.method4553(local16).method4404(local20);
			return;
		}
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(67) int local67;
		if (Static92.anInt1818 == 182) {
			Static20.aClass3_Sub4_Sub2_1.method3643();
			local16 = Static20.aClass3_Sub4_Sub2_1.method3643();
			local20 = (local16 >> 4 & 0x7) + Static290.anInt5806;
			local53 = Static191.anInt3980 + (local16 & 0x7);
			local57 = Static20.aClass3_Sub4_Sub2_1.method3649();
			local61 = Static20.aClass3_Sub4_Sub2_1.method3643();
			local67 = Static20.aClass3_Sub4_Sub2_1.method3659();
			@Pc(71) String local71 = Static20.aClass3_Sub4_Sub2_1.method3671();
			Static54.method920(local57, local53, local67, local20, local71, local61);
			return;
		}
		@Pc(132) int local132;
		@Pc(138) int local138;
		if (Static92.anInt1818 == 122) {
			local16 = Static20.aClass3_Sub4_Sub2_1.method3643();
			local20 = (local16 >> 4 & 0x7) + Static290.anInt5806;
			local53 = (local16 & 0x7) + Static191.anInt3980;
			local57 = Static20.aClass3_Sub4_Sub2_1.method3649();
			local61 = Static20.aClass3_Sub4_Sub2_1.method3643();
			local67 = Static20.aClass3_Sub4_Sub2_1.method3649();
			if (local20 >= 0 && local53 >= 0 && Static162.anInt2152 > local20 && Static122.anInt2632 > local53) {
				local132 = local20 * 128 + 64;
				local138 = local53 * 128 + 64;
				@Pc(160) Class5_Sub4_Sub1 local160 = new Class5_Sub4_Sub1(local57, local67, Static51.anInt1101, Static163.anInt3184, local132, Static286.method4919(local132, local138, Static163.anInt3184) - local61, local138, local20, local20, local53, local53);
				Static254.aClass127_27.method3387(new Class3_Sub7_Sub2(local160));
			}
		} else if (Static92.anInt1818 == 172) {
			local16 = Static20.aClass3_Sub4_Sub2_1.method3643();
			local20 = Static290.anInt5806 + (local16 >> 4 & 0x7);
			local53 = Static191.anInt3980 + (local16 & 0x7);
			local57 = Static20.aClass3_Sub4_Sub2_1.method3649();
			if (local20 >= 0 && local53 >= 0 && Static162.anInt2152 > local20 && local53 < Static122.anInt2632) {
				@Pc(223) Class3_Sub40 local223 = (Class3_Sub40) Static128.aClass24_18.method609((long) (local20 | Static163.anInt3184 << 28 | local53 << 14));
				if (local223 != null) {
					for (@Pc(231) Class3_Sub38 local231 = (Class3_Sub38) local223.aClass127_41.method3402(); local231 != null; local231 = (Class3_Sub38) local223.aClass127_41.method3400()) {
						if (local231.anInt5434 == (local57 & 0x7FFF)) {
							local231.method5717();
							break;
						}
					}
					if (local223.aClass127_41.method3390()) {
						local223.method5717();
					}
					Static301.method5085(Static163.anInt3184, local20, local53);
				}
			}
		} else if (Static92.anInt1818 == 196) {
			local16 = Static20.aClass3_Sub4_Sub2_1.method3672();
			local20 = local16 >> 2;
			local53 = local16 & 0x3;
			local57 = Static247.anIntArray402[local20];
			local61 = Static20.aClass3_Sub4_Sub2_1.method3672();
			local67 = (local61 >> 4 & 0x7) + Static290.anInt5806;
			local132 = Static191.anInt3980 + (local61 & 0x7);
			if (local67 >= 0 && local132 >= 0 && local67 < Static162.anInt2152 && local132 < Static122.anInt2632) {
				Static108.method4644(local20, local53, 0, -1, local67, local132, local57, Static163.anInt3184, -1);
			}
		} else {
			@Pc(384) int local384;
			@Pc(402) int local402;
			if (Static92.anInt1818 == 233) {
				local16 = Static20.aClass3_Sub4_Sub2_1.method3643();
				local20 = Static290.anInt5806 + (local16 >> 4 & 0x7);
				local53 = Static191.anInt3980 + (local16 & 0x7);
				local57 = Static20.aClass3_Sub4_Sub2_1.method3649();
				if (local57 == 65535) {
					local57 = -1;
				}
				local61 = Static20.aClass3_Sub4_Sub2_1.method3643();
				local67 = local61 >> 4 & 0xF;
				local132 = local61 & 0x7;
				local138 = Static20.aClass3_Sub4_Sub2_1.method3643();
				local384 = Static20.aClass3_Sub4_Sub2_1.method3643();
				if (local20 >= 0 && local53 >= 0 && local20 < Static162.anInt2152 && local53 < Static122.anInt2632) {
					local402 = local67 + 1;
					if (local20 - local402 <= Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0] && Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray405[0] <= local402 + local20 && local53 - local402 <= Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0] && local402 + local53 >= Static349.aClass5_Sub4_Sub4_Sub1_2.anIntArray404[0] && Static260.anInt5195 != 0 && local132 > 0 && Static186.anInt3102 < 50 && local57 != -1) {
						Static37.anIntArray538[Static186.anInt3102] = local57;
						Static244.anIntArray393[Static186.anInt3102] = local132;
						Static109.anIntArray136[Static186.anInt3102] = local138;
						Static334.aClass143Array1[Static186.anInt3102] = null;
						Static251.anIntArray406[Static186.anInt3102] = (local53 << 8) + (local20 << 16) + local67;
						Static230.anIntArray548[Static186.anInt3102] = local384;
						Static186.anInt3102++;
					}
				}
			} else if (Static92.anInt1818 == 200) {
				local16 = Static20.aClass3_Sub4_Sub2_1.method3648();
				local20 = local16 >> 2;
				local53 = local16 & 0x3;
				local57 = Static247.anIntArray402[local20];
				local61 = Static20.aClass3_Sub4_Sub2_1.method3643();
				local67 = Static290.anInt5806 + (local61 >> 4 & 0x7);
				local132 = (local61 & 0x7) + Static191.anInt3980;
				local138 = Static20.aClass3_Sub4_Sub2_1.method3640();
				if (local67 >= 0 && local132 >= 0 && local67 < Static162.anInt2152 && local132 < Static122.anInt2632) {
					Static108.method4644(local20, local53, 0, -1, local67, local132, local57, Static163.anInt3184, local138);
				}
			} else if (Static92.anInt1818 == 24) {
				local16 = Static20.aClass3_Sub4_Sub2_1.method3643();
				local20 = (local16 >> 4 & 0x7) + Static290.anInt5806;
				local53 = Static191.anInt3980 + (local16 & 0x7);
				local57 = Static20.aClass3_Sub4_Sub2_1.method3649();
				local61 = Static20.aClass3_Sub4_Sub2_1.method3649();
				local67 = Static20.aClass3_Sub4_Sub2_1.method3649();
				if (Static128.aClass24_18 != null && local20 >= 0 && local53 >= 0 && local20 < Static162.anInt2152 && Static122.anInt2632 > local53) {
					@Pc(647) Class3_Sub40 local647 = (Class3_Sub40) Static128.aClass24_18.method609((long) (local20 | local53 << 14 | Static163.anInt3184 << 28));
					if (local647 != null) {
						for (@Pc(655) Class3_Sub38 local655 = (Class3_Sub38) local647.aClass127_41.method3402(); local655 != null; local655 = (Class3_Sub38) local647.aClass127_41.method3400()) {
							if ((local57 & 0x7FFF) == local655.anInt5434 && local61 == local655.anInt5431) {
								local655.method5717();
								local655.anInt5431 = local67;
								Static165.method2613(local20, local53, Static163.anInt3184, local655);
								break;
							}
						}
						Static301.method5085(Static163.anInt3184, local20, local53);
					}
				}
			} else {
				@Pc(765) int local765;
				@Pc(769) int local769;
				@Pc(773) int local773;
				if (Static92.anInt1818 == 5) {
					local16 = Static20.aClass3_Sub4_Sub2_1.method3617();
					local20 = Static290.anInt5806 + (local16 >> 4 & 0x7);
					local53 = (local16 & 0x7) + Static191.anInt3980;
					@Pc(731) byte local731 = Static20.aClass3_Sub4_Sub2_1.method3619();
					local61 = Static20.aClass3_Sub4_Sub2_1.method3640();
					local67 = Static20.aClass3_Sub4_Sub2_1.method3638();
					@Pc(743) byte local743 = Static20.aClass3_Sub4_Sub2_1.method3619();
					@Pc(747) byte local747 = Static20.aClass3_Sub4_Sub2_1.method3639();
					local384 = Static20.aClass3_Sub4_Sub2_1.method3638();
					local402 = Static20.aClass3_Sub4_Sub2_1.method3622();
					@Pc(761) byte local761 = Static20.aClass3_Sub4_Sub2_1.method3625();
					local765 = Static20.aClass3_Sub4_Sub2_1.method3617();
					local769 = local765 >> 2;
					local773 = local765 & 0x3;
					if (!Static212.aClass122_2.method4747()) {
						Static212.method1613(local20, local67, local384, local747, local773, local402, local61, local761, local743, local769, local731, local53);
					}
				}
				@Pc(865) int local865;
				@Pc(959) Class5_Sub4_Sub3 local959;
				if (Static92.anInt1818 == 164) {
					local16 = Static20.aClass3_Sub4_Sub2_1.method3643();
					local20 = (local16 >> 4 & 0xF) + Static290.anInt5806 * 2;
					local53 = (local16 & 0xF) + Static191.anInt3980 * 2;
					local57 = local20 + Static20.aClass3_Sub4_Sub2_1.method3621();
					local61 = local53 + Static20.aClass3_Sub4_Sub2_1.method3621();
					local67 = Static20.aClass3_Sub4_Sub2_1.method3622();
					local132 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local138 = Static20.aClass3_Sub4_Sub2_1.method3643() * 4;
					local384 = Static20.aClass3_Sub4_Sub2_1.method3643() * 4;
					local402 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local865 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local765 = Static20.aClass3_Sub4_Sub2_1.method3643();
					local769 = Static20.aClass3_Sub4_Sub2_1.method3643();
					if (local765 == 255) {
						local765 = -1;
					}
					if (local20 >= 0 && local53 >= 0 && local20 < 208 && local53 < 208 && local57 >= 0 && local61 >= 0 && local57 < 208 && local61 < 208 && local132 != 65535) {
						local20 = local20 * 64;
						local61 = local61 * 64;
						local57 = local57 * 64;
						local53 = local53 * 64;
						local959 = new Class5_Sub4_Sub3(local132, Static163.anInt3184, local20, local53, Static286.method4919(local20, local53, Static163.anInt3184) - local138, Static51.anInt1101 + local402, Static51.anInt1101 + local865, local765, local769, local67, local384);
						local959.method2193(Static51.anInt1101 + local402, local61, local57, Static286.method4919(local57, local61, Static163.anInt3184) - local384);
						Static165.aClass127_18.method3387(new Class3_Sub7_Sub15(local959));
					}
				} else if (Static92.anInt1818 == 7) {
					local16 = Static20.aClass3_Sub4_Sub2_1.method3643();
					local20 = (local16 >> 4 & 0x7) + Static290.anInt5806;
					local53 = Static191.anInt3980 + (local16 & 0x7);
					local57 = Static20.aClass3_Sub4_Sub2_1.method3621() + local20;
					local61 = local53 + Static20.aClass3_Sub4_Sub2_1.method3621();
					local67 = Static20.aClass3_Sub4_Sub2_1.method3622();
					local132 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local138 = Static20.aClass3_Sub4_Sub2_1.method3643() * 4;
					local384 = Static20.aClass3_Sub4_Sub2_1.method3643() * 4;
					local402 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local865 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local765 = Static20.aClass3_Sub4_Sub2_1.method3643();
					if (local765 == 255) {
						local765 = -1;
					}
					local769 = Static20.aClass3_Sub4_Sub2_1.method3643();
					if (local20 >= 0 && local53 >= 0 && local20 < Static162.anInt2152 && Static122.anInt2632 > local53 && local57 >= 0 && local61 >= 0 && local57 < Static162.anInt2152 && local61 < Static122.anInt2632 && local132 != 65535) {
						local53 = local53 * 128 + 64;
						local57 = local57 * 128 + 64;
						local20 = local20 * 128 + 64;
						local61 = local61 * 128 + 64;
						local959 = new Class5_Sub4_Sub3(local132, Static163.anInt3184, local20, local53, Static286.method4919(local20, local53, Static163.anInt3184) - local138, Static51.anInt1101 + local402, local865 + Static51.anInt1101, local765, local769, local67, local384);
						local959.method2193(local402 + Static51.anInt1101, local61, local57, Static286.method4919(local57, local61, Static163.anInt3184) - local384);
						Static165.aClass127_18.method3387(new Class3_Sub7_Sub15(local959));
					}
				} else if (Static92.anInt1818 == 204) {
					local16 = Static20.aClass3_Sub4_Sub2_1.method3638();
					local20 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local53 = Static20.aClass3_Sub4_Sub2_1.method3617();
					local57 = Static290.anInt5806 + (local53 >> 4 & 0x7);
					local61 = Static191.anInt3980 + (local53 & 0x7);
					if (local57 >= 0 && local61 >= 0 && local57 < Static162.anInt2152 && local61 < Static122.anInt2632) {
						Static165.method2613(local57, local61, Static163.anInt3184, new Class3_Sub38(local20, local16));
						Static301.method5085(Static163.anInt3184, local57, local61);
					}
				} else if (Static92.anInt1818 == 227) {
					local16 = Static20.aClass3_Sub4_Sub2_1.method3648();
					local20 = (local16 >> 4 & 0x7) + Static290.anInt5806;
					local53 = Static191.anInt3980 + (local16 & 0x7);
					local57 = Static20.aClass3_Sub4_Sub2_1.method3672();
					local61 = local57 >> 2;
					local67 = local57 & 0x3;
					local132 = Static247.anIntArray402[local61];
					local138 = Static20.aClass3_Sub4_Sub2_1.method3638();
					if (local138 == 65535) {
						local138 = -1;
					}
					Static38.method677(local132, Static163.anInt3184, local67, local138, local20, local61, local53);
				} else if (Static92.anInt1818 == 184) {
					local16 = Static20.aClass3_Sub4_Sub2_1.method3643();
					local20 = (local16 >> 4 & 0xF) + Static290.anInt5806 * 2;
					local53 = (local16 & 0xF) + Static191.anInt3980 * 2;
					local57 = Static20.aClass3_Sub4_Sub2_1.method3621() + local20;
					local61 = local53 + Static20.aClass3_Sub4_Sub2_1.method3621();
					local67 = Static20.aClass3_Sub4_Sub2_1.method3622();
					local132 = Static20.aClass3_Sub4_Sub2_1.method3622();
					local138 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local384 = Static20.aClass3_Sub4_Sub2_1.method3621();
					local402 = Static20.aClass3_Sub4_Sub2_1.method3643() * 4;
					local865 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local765 = Static20.aClass3_Sub4_Sub2_1.method3649();
					local769 = Static20.aClass3_Sub4_Sub2_1.method3643();
					local773 = Static20.aClass3_Sub4_Sub2_1.method3643();
					if (local769 == 255) {
						local769 = -1;
					}
					if (local20 >= 0 && local53 >= 0 && local20 < 208 && local53 < 208 && local57 >= 0 && local61 >= 0 && local57 < 208 && local61 < 208 && local138 != 65535) {
						local57 = local57 * 64;
						local20 *= 64;
						local53 *= 64;
						local61 *= 64;
						if (local67 != 0) {
							@Pc(1476) int local1476;
							@Pc(1480) Class5_Sub4_Sub4 local1480;
							@Pc(1466) int local1466;
							@Pc(1470) int local1470;
							if (local67 >= 0) {
								local1466 = local67 - 1;
								local1470 = local1466 & 0x7FF;
								local1476 = local1466 >> 11 & 0xF;
								local1480 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local1470];
							} else {
								local1466 = -local67 - 1;
								local1470 = local1466 & 0x7FF;
								local1476 = local1466 >> 11 & 0xF;
								if (local1470 == Static312.anInt6280) {
									local1480 = Static349.aClass5_Sub4_Sub4_Sub1_2;
								} else {
									local1480 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local1470];
								}
							}
							if (local1480 != null) {
								@Pc(1514) Class54 local1514 = local1480.method4201();
								if (local1514.anIntArrayArray9 != null && local1514.anIntArrayArray9[local1476] != null) {
									local1470 = local1514.anIntArrayArray9[local1476][0];
									@Pc(1536) int local1536 = local1514.anIntArrayArray9[local1476][2];
									@Pc(1541) int local1541 = local1480.aClass193_7.method5174();
									@Pc(1545) int local1545 = Class19.anIntArray20[local1541];
									@Pc(1549) int local1549 = Class19.anIntArray21[local1541];
									@Pc(1559) int local1559 = local1549 * local1470 + local1536 * local1545 >> 15;
									@Pc(1570) int local1570 = local1536 * local1549 - local1545 * local1470 >> 15;
									local53 += local1570;
									local384 -= local1514.anIntArrayArray9[local1476][1];
									local20 += local1559;
								}
							}
						}
						@Pc(1615) Class5_Sub4_Sub3 local1615 = new Class5_Sub4_Sub3(local138, Static163.anInt3184, local20, local53, Static286.method4919(local20, local53, Static163.anInt3184) - local384, Static51.anInt1101 + local865, Static51.anInt1101 + local765, local769, local773, local132, local402);
						local1615.method2193(local865 + Static51.anInt1101, local61, local57, Static286.method4919(local57, local61, Static163.anInt3184) - local402);
						Static165.aClass127_18.method3387(new Class3_Sub7_Sub15(local1615));
					}
				} else if (Static92.anInt1818 == 81) {
					local16 = Static20.aClass3_Sub4_Sub2_1.method3672();
					local20 = (local16 >> 4 & 0x7) + Static290.anInt5806;
					local53 = (local16 & 0x7) + Static191.anInt3980;
					local57 = Static20.aClass3_Sub4_Sub2_1.method3638();
					local61 = Static20.aClass3_Sub4_Sub2_1.method3640();
					local67 = Static20.aClass3_Sub4_Sub2_1.method3638();
					if (local20 >= 0 && local53 >= 0 && local20 < Static162.anInt2152 && local53 < Static122.anInt2632 && Static312.anInt6280 != local61) {
						Static165.method2613(local20, local53, Static163.anInt3184, new Class3_Sub38(local57, local67));
						Static301.method5085(Static163.anInt3184, local20, local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!ps;I)V")
	public static void method2257(@OriginalArg(0) Class5_Sub4_Sub4 arg0) {
		@Pc(9) int local9 = arg0.anInt4936 - Static51.anInt1101;
		@Pc(20) int local20 = arg0.anInt4905 * 128 + arg0.method4208() * 64;
		@Pc(32) int local32 = arg0.anInt4943 * 128 + arg0.method4208() * 64;
		arg0.anInt5901 += (local20 - arg0.anInt5901) / local9;
		arg0.anInt4956 = 0;
		arg0.anInt5905 += (local32 - arg0.anInt5905) / local9;
		if (arg0.anInt4916 == 0) {
			arg0.method4200(8192);
		}
		if (arg0.anInt4916 == 1) {
			arg0.method4200(12288);
		}
		if (arg0.anInt4916 == 2) {
			arg0.method4200(0);
		}
		if (arg0.anInt4916 == 3) {
			arg0.method4200(4096);
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(III)Lclient!on;")
	public static Class5_Sub3 method2262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass5_Sub3_1 == null ? null : local7.aClass5_Sub3_1;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(Z)V")
	public static void method2265() {
		Static305.aBoolean412 = true;
	}
}
