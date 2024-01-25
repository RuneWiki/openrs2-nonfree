import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!qha", name = "l", descriptor = "[Lclient!ov;")
	public static Class4_Sub2[] aClass4_Sub2Array4;

	@OriginalMember(owner = "client!qha", name = "g", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_134 = new Class337(83, -1);

	@OriginalMember(owner = "client!qha", name = "m", descriptor = "I")
	public static int anInt7735 = 0;

	@OriginalMember(owner = "client!qha", name = "o", descriptor = "J")
	public static long aLong197 = 0L;

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IZII[IBZ[I[[[BII[II[IIZI[I)V")
	public static void method6816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) byte arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) byte[][][] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int[] arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int[] arg11, @OriginalArg(14) int arg12, @OriginalArg(15) boolean arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int[] arg15) {
		if (Static483.anInt8236 == -1) {
			return;
		}
		@Pc(12) int[] local12 = Static9.aClass133_1.Y();
		@Pc(16) int local16 = local12[0];
		@Pc(20) int local20 = local12[1];
		@Pc(24) int local24 = local12[2];
		@Pc(28) int local28 = local12[3];
		@Pc(30) int local30 = local24;
		@Pc(32) int local32 = local28;
		if (Static483.anInt8236 == 1) {
			local32 = (int) ((double) local28 * (double) Static517.anInt8880 / (double) Static447.anInt7618);
			local30 = (int) ((double) Static517.anInt8880 * (double) local24 / (double) Static447.anInt7618);
		}
		if (!Static28.aBoolean15) {
			if (Static483.anInt8236 == 1) {
				Static476.method7028();
			}
			@Pc(69) int local69 = arg12 - Static448.anInt7642;
			@Pc(73) int local73 = arg2 - Static290.anInt5060;
			@Pc(78) int local78 = arg14 - Static617.anInt10319;
			@Pc(100) int local100 = (int) ((double) local30 * ((double) local73 * Static292.aDouble12 + Static1.aDouble20 * (double) local69 + (double) local78 * Static242.aDouble10) / (double) arg7);
			@Pc(122) int local122 = (int) ((double) local32 * ((double) local73 * Static508.aDouble21 + (double) local69 * Static94.aDouble7 + (double) local78 * Static286.aDouble11) / (double) arg7);
			@Pc(137) double local137 = Static158.aDouble8 * (double) local69 + (double) local73 * Static611.aDouble23 + Static34.aDouble3 * (double) local78;
			@Pc(145) int local145 = Static443.anInt7572 + local100 - Static353.anInt5915;
			@Pc(152) int local152 = Static583.anInt9806 + local122 - Static189.anInt10182;
			@Pc(156) int local156 = Static111.anInt2087 + local145;
			@Pc(160) int local160 = Static517.anInt8880 + local152;
			if (local145 >= 0 && local152 >= 0 && Static404.anInt6761 >= local156 && local160 <= Static447.anInt7618 || Static483.anInt8236 == 2) {
				Static601.anInt10083 = local145;
				Static212.anInt4040 = local152;
				if (Static483.anInt8236 == 2) {
					Static497.aDouble19 = -local137;
				}
			} else if (local156 > 0 && local160 > 0 && local145 < Static404.anInt6761 && local152 < Static447.anInt7618) {
				@Pc(204) int local204 = local145 - Static443.anInt7572;
				@Pc(209) int local209 = local152 - Static583.anInt9806;
				@Pc(211) int local211 = 0;
				@Pc(213) int local213 = 0;
				@Pc(215) int local215 = 0;
				@Pc(217) int local217 = 0;
				@Pc(219) double local219 = 0.0D;
				if (Static483.anInt8236 == 0) {
					local211 = local204;
					local219 = Static497.aDouble19 + local137;
					local213 = local209;
				} else if (Static483.anInt8236 == 1) {
					local217 = local209 / Static252.anInt4593;
					local215 = local204 / Static408.anInt7120;
					local213 = local217 * Static252.anInt4593;
					local211 = local215 * Static408.anInt7120;
					local219 = (Static497.aDouble19 + local137) * (double) (local213 * local209 + local204 * local211) / (double) (local204 * local204 + local209 * local209);
				}
				local219 = -local219;
				@Pc(278) int local278 = 0;
				@Pc(280) int local280 = 0;
				@Pc(282) int local282 = 0;
				@Pc(284) int local284 = 0;
				@Pc(286) int local286 = 0;
				@Pc(288) int local288 = 0;
				@Pc(299) int local299;
				@Pc(297) int local297;
				@Pc(301) int local301;
				@Pc(303) int local303;
				if (local211 >= 0) {
					local297 = Static404.anInt6761 - local211;
					local299 = 0;
					local301 = local297;
					local303 = local211;
					if (Static483.anInt8236 == 1) {
						local286 = local215;
						local282 = Static6.anInt95 - local215;
					}
				} else {
					local297 = local211 + Static404.anInt6761;
					local299 = -local211;
					local301 = 0;
					if (Static483.anInt8236 == 1) {
						local286 = -local215;
						local282 = 0;
					}
					local303 = local299;
				}
				@Pc(342) int local342;
				@Pc(348) int local348;
				@Pc(344) int local344;
				@Pc(350) int local350;
				@Pc(368) int local368;
				if (local213 < 0) {
					local342 = -local213;
					local344 = 0;
					local348 = Static447.anInt7618 + local213;
					local350 = local342;
					if (Static483.anInt8236 == 1) {
						local280 = -local217;
						local278 = 0;
						local284 = local280;
						local288 = Static28.anInt358 + local217;
					}
					local368 = local342;
				} else {
					local342 = 0;
					local348 = Static447.anInt7618 - local213;
					local344 = local348;
					local350 = local213;
					if (Static483.anInt8236 == 1) {
						local284 = 0;
						local278 = Static28.anInt358 - local217;
						local280 = local217;
						local288 = local278;
					}
					local368 = 0;
				}
				@Pc(402) Class99 local402 = Static108.aClass155_1.aClass99_4;
				@Pc(416) int local416;
				for (@Pc(407) Class4_Sub6 local407 = (Class4_Sub6) local402.method2045(); local407 != null; local407 = (Class4_Sub6) local402.method2047()) {
					@Pc(412) Class4_Sub9[] local412 = local407.aClass4_Sub9Array1;
					@Pc(414) boolean local414 = true;
					for (local416 = 0; local416 < local412.length; local416++) {
						@Pc(422) Class4_Sub9 local422 = local412[local416];
						@Pc(425) int local425 = local422.anInt7890;
						@Pc(428) int local428 = local422.anInt7892;
						@Pc(431) int local431 = local422.anInt7893;
						@Pc(434) int local434 = local422.anInt7891;
						@Pc(441) int local441;
						local422.anInt7892 = local441 = local428 - local213;
						@Pc(445) int local445 = local422.anInt7894;
						@Pc(451) int local451;
						local422.anInt7891 = local451 = local434 - local213;
						@Pc(458) int local458;
						local422.anInt7893 = local458 = local431 - local211;
						@Pc(465) int local465;
						local422.anInt7890 = local465 = local425 - local211;
						if (local414) {
							@Pc(482) int local482 = (local465 < local458 ? local465 : local458) - local445;
							if (local482 <= Static404.anInt6761) {
								@Pc(498) int local498 = (local441 < local451 ? local441 : local451) - local445;
								if (local498 <= Static447.anInt7618) {
									@Pc(511) int local511 = (local458 > local465 ? local458 : local465) + local445;
									if (local511 >= 0) {
										@Pc(525) int local525 = local445 + (local451 > local441 ? local451 : local441);
										if (local525 >= 0) {
											local414 = false;
										}
									}
								}
							}
						}
					}
					if (local414) {
						local407.method8713();
						Static87.method1410(local407);
					}
				}
				if (Static483.anInt8236 == 0) {
					Static9.aClass133_1.method7322(Static477.anInterface16_1);
				}
				Static9.aClass133_1.F(-local211, -local213);
				Static9.aClass133_1.b(local299, local342, local297, local348, local219);
				Static96.method1591(local219 + Static497.aDouble19);
				Static460.aDouble16 = Static497.aDouble19 + local219;
				if (Static483.anInt8236 == 1) {
					Static570.anInt9619 = local32;
					Static555.anInt9377 = local30;
					Static603.anInt8787 = local20 - Static189.anInt10182 - local213;
					Static540.anInt9190 = local16 - Static353.anInt5915 - local211;
					Static9.aClass133_1.DA(Static540.anInt9190, Static603.anInt8787, Static555.anInt9377, Static570.anInt9619);
				} else {
					Static555.anInt9377 = local30;
					Static540.anInt9190 = Static443.anInt7572 + local16 - local211 - Static353.anInt5915;
					Static570.anInt9619 = local32;
					Static603.anInt8787 = local20 + Static583.anInt9806 - Static189.anInt10182 - local213;
					Static9.aClass133_1.DA(Static540.anInt9190, Static603.anInt8787, Static555.anInt9377, Static570.anInt9619);
				}
				Static232.method3877(Static108.aClass155_1);
				if (local350 > 0) {
					Static9.aClass133_1.KA(0, local344, Static404.anInt6761, local344 + local350);
					Static9.aClass133_1.ya();
					Static9.aClass133_1.GA(Static554.anInt9352);
					Static67.method1106(arg0, arg12, arg2, arg14, arg6, arg11, arg5, arg9, arg15, arg3, arg10, arg4, arg8, arg1, arg13, arg7, 1, false);
				}
				if (local303 > 0) {
					Static9.aClass133_1.KA(local301, local368, local301 + local303, local348 + local368);
					Static9.aClass133_1.ya();
					Static9.aClass133_1.GA(Static554.anInt9352);
					Static67.method1106(arg0, arg12, arg2, arg14, arg6, arg11, arg5, arg9, arg15, arg3, arg10, arg4, arg8, arg1, arg13, arg7, 1, false);
				}
				Static9.aClass133_1.la();
				Static263.method4274();
				if (Static483.anInt8236 == 0) {
					Static9.aClass133_1.method7267();
				}
				Static189.anInt10182 += local213;
				Static353.anInt5915 += local211;
				Static497.aDouble19 += local219;
				Static601.anInt10083 = local100 + Static443.anInt7572 - Static353.anInt5915;
				Static212.anInt4040 = local122 + Static583.anInt9806 - Static189.anInt10182;
				if (Static483.anInt8236 == 1) {
					Static110.anInt2062 += local215;
					Static444.anInt7581 += local217;
					for (@Pc(767) int local767 = 0; local767 < Static28.anInt358; local767++) {
						@Pc(778) int local778 = Static536.method7903(Static28.anInt358, local767 + Static444.anInt7581) * Static6.anInt95;
						for (local416 = 0; local416 < Static6.anInt95; local416++) {
							@Pc(791) int local791 = Static536.method7903(Static6.anInt95, Static110.anInt2062 + local416) + local778;
							@Pc(832) boolean local832 = local278 <= local767 && local767 < local280 + local278 || local284 <= local767 && local767 < local284 + local288 && local282 <= local416 && local416 < local282 + local286;
							Static197.anInterface16Array5[local791].method8782(Static408.anInt7120 * local416, local767 * Static252.anInt4593, Static408.anInt7120, Static252.anInt4593, local832);
						}
					}
				}
			} else {
				Static28.aBoolean15 = true;
			}
		}
		if (Static28.aBoolean15) {
			Static189.anInt10182 = 0;
			Static212.anInt4040 = Static583.anInt9806;
			Static290.anInt5060 = arg2;
			Static448.anInt7642 = arg12;
			Static353.anInt5915 = 0;
			Static497.aDouble19 = 0.0D;
			Static601.anInt10083 = Static443.anInt7572;
			Static617.anInt10319 = arg14;
			if (Static483.anInt8236 == 0) {
				Static9.aClass133_1.method7322(Static477.anInterface16_1);
			}
			Static9.aClass133_1.la();
			Static9.aClass133_1.ya();
			Static9.aClass133_1.GA(Static554.anInt9352);
			Static10.aClass113_1.method8451(Static448.anInt7642, Static290.anInt5060, Static617.anInt10319, Static244.anInt4473, Static517.anInt8885, Static468.anInt7871);
			Static9.aClass133_1.method7269(Static10.aClass113_1);
			if (Static483.anInt8236 == 1) {
				Static555.anInt9377 = local30;
				Static540.anInt9190 = local16;
				Static570.anInt9619 = local32;
				Static603.anInt8787 = local20;
				Static9.aClass133_1.DA(Static540.anInt9190, Static603.anInt8787, Static555.anInt9377, Static570.anInt9619);
			} else {
				Static555.anInt9377 = local30;
				Static603.anInt8787 = local20 + Static583.anInt9806;
				Static570.anInt9619 = local32;
				Static540.anInt9190 = Static443.anInt7572 + local16;
				Static9.aClass133_1.DA(Static540.anInt9190, Static603.anInt8787, Static555.anInt9377, Static570.anInt9619);
			}
			Static460.aDouble16 = 0.0D;
			Static108.aClass155_1.method3773();
			Static232.method3877(Static108.aClass155_1);
			Static67.method1106(arg0, arg12, arg2, arg14, arg6, arg11, arg5, arg9, arg15, arg3, arg10, arg4, arg8, arg1, arg13, arg7, 1, false);
			Static263.method4274();
			Static28.aBoolean15 = false;
			if (Static483.anInt8236 == 0) {
				Static9.aClass133_1.method7267();
			}
			if (Static483.anInt8236 == 1) {
				Static37.method571();
			}
		}
		if (Static483.anInt8236 == 0) {
			Static477.anInterface16_1.method8783(Static601.anInt10083, Static212.anInt4040, Static111.anInt2087, Static517.anInt8880, 0, 0);
		}
		Static182.anInt3238++;
		Static96.method1591(Static497.aDouble19);
		Static86.aDouble6 = Static497.aDouble19;
		if (Static483.anInt8236 == 0 || Static483.anInt8236 == 2) {
			if (Static483.anInt8236 == 2) {
				Static9.aClass133_1.GA(Static554.anInt9352);
				Static9.aClass133_1.ya();
			}
			Static633.anInt10532 = local30;
			Static591.anInt9904 = Static583.anInt9806 + local20 - Static212.anInt4040 - Static189.anInt10182;
			Static87.anInt1748 = local32;
			Static223.anInt4189 = local16 + Static443.anInt7572 - Static353.anInt5915 - Static601.anInt10083;
			Static9.aClass133_1.DA(Static223.anInt4189, Static591.anInt9904, Static633.anInt10532, Static87.anInt1748);
		} else if (Static483.anInt8236 == 1) {
			Static633.anInt10532 = local30;
			Static591.anInt9904 = local20 - Static189.anInt10182;
			Static223.anInt4189 = local16 - Static353.anInt5915;
			Static87.anInt1748 = local32;
			Static9.aClass133_1.DA(Static223.anInt4189, Static591.anInt9904, Static633.anInt10532, Static87.anInt1748);
			Static9.aClass133_1.KA(Static601.anInt10083, Static212.anInt4040, Static111.anInt2087 + Static601.anInt10083, Static517.anInt8880 + Static212.anInt4040);
		}
		Static67.method1106(arg0, arg12, arg2, arg14, arg6, arg11, arg5, arg9, arg15, arg3, arg10, arg4, arg8, arg1, arg13, arg7, Static483.anInt8236 == 2 ? 0 : 2, Static483.anInt8236 == 1);
		Static9.aClass133_1.la();
		Static9.aClass133_1.DA(local16, local20, local24, local28);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!fea;[[BI)V")
	public static void method6817(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt2524; local3++) {
			Static229.method3856();
			for (@Pc(9) int local9 = 0; local9 < Static326.anInt5541 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static448.anInt7637 >> 3; local13++) {
					@Pc(23) int local23 = Static269.anIntArrayArrayArray4[local3][local9][local13];
					if (local23 != -1) {
						@Pc(33) int local33 = local23 >> 24 & 0x3;
						if (!arg0.aBoolean199 || local33 == 0) {
							@Pc(44) int local44 = local23 >> 1 & 0x3;
							@Pc(50) int local50 = local23 >> 14 & 0x3FF;
							@Pc(56) int local56 = local23 >> 3 & 0x7FF;
							@Pc(66) int local66 = local56 / 8 + (local50 / 8 << 8);
							for (@Pc(68) int local68 = 0; local68 < Static312.anIntArray597.length; local68++) {
								if (Static312.anIntArray597[local68] == local66 && arg1[local68] != null) {
									arg0.method2171((local56 & 0x7) * 8, local33, local44, local3, arg1[local68], Static213.aClass133_5, (local50 & 0x7) * 8, local13 * 8, Static322.aClass352Array1, local9 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "([Lclient!waa;Lclient!rs;B)Lclient!un;")
	public static Class350 method6820(@OriginalArg(0) Class369[] arg0, @OriginalArg(1) Class133_Sub3 arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			if (arg0[local10] == null || arg0[local10].aLong269 <= 0L) {
				return null;
			}
		}
		@Pc(31) long local31 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
			OpenGL.glAttachObjectARB(local31, arg0[local33].aLong269);
		}
		OpenGL.glLinkProgramARB(local31);
		OpenGL.glGetObjectParameterivARB(local31, 35714, Static297.anIntArray279, 0);
		if (Static297.anIntArray279[0] == 0) {
			if (Static297.anIntArray279[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local31, 35716, Static297.anIntArray279, 1);
			if (Static297.anIntArray279[1] > 1) {
				@Pc(78) byte[] local78 = new byte[Static297.anIntArray279[1]];
				OpenGL.glGetInfoLogARB(local31, Static297.anIntArray279[1], Static297.anIntArray279, 0, local78, 0);
				System.out.println(new String(local78));
			}
			if (Static297.anIntArray279[0] == 0) {
				for (@Pc(102) int local102 = 0; local102 < arg0.length; local102++) {
					OpenGL.glDetachObjectARB(local31, arg0[local102].aLong269);
				}
				OpenGL.glDeleteObjectARB(local31);
				return null;
			}
		}
		return new Class350(arg1, local31, arg0);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)I")
	public static int method6823() {
		if (Static179.anInt3165 == 0) {
			Static584.aClass355_2.method8434(new Class311("jaclib"));
			if (Static584.aClass355_2.method8441().method8918() != 100) {
				return 1;
			}
			if (!((Class311) Static584.aClass355_2.method8441()).method7533()) {
				Static475.aClient1.method1263();
			}
			Static179.anInt3165 = 1;
		}
		@Pc(230) int local230;
		@Pc(249) int local249;
		@Pc(263) int local263;
		@Pc(269) int local269;
		if (Static179.anInt3165 == 1) {
			Static513.aClass355Array2 = Static584.method8433();
			Static584.aClass355_1.method8434(new Class375(Static373.aClass207_76));
			Static584.aClass355_3.method8434(new Class311("jaggl"));
			Static584.aClass355_4.method8434(new Class311("jagdx"));
			Static584.aClass355_5.method8434(new Class311("jagmisc"));
			Static584.aClass355_6.method8434(new Class311("sw3d"));
			Static584.aClass355_7.method8434(new Class311("hw3d"));
			Static584.aClass355_8.method8434(new Class311("jagtheora"));
			Static584.aClass355_9.method8434(new Class375(Static5.aClass207_2));
			Static584.aClass355_10.method8434(new Class375(Static102.aClass207_24));
			Static584.aClass355_11.method8434(new Class375(Static141.aClass207_30));
			Static584.aClass355_12.method8434(new Class375(Static101.aClass207_23));
			Static584.aClass355_13.method8434(new Class375(Static168.aClass207_36));
			Static584.aClass355_14.method8434(new Class375(Static509.aClass207_108));
			Static584.aClass355_15.method8434(new Class375(Static108.aClass207_25));
			Static584.aClass355_16.method8434(new Class375(Static452.aClass207_92));
			Static584.aClass355_17.method8434(new Class375(Static460.aClass207_96));
			Static584.aClass355_18.method8434(new Class375(Static189.aClass207_121));
			Static584.aClass355_19.method8434(new Class375(Static548.aClass207_115));
			Static584.aClass355_20.method8434(new Class375(Static338.aClass207_68));
			Static584.aClass355_21.method8434(new Class375(Static134.aClass207_29));
			Static584.aClass355_22.method8434(new Class375(Static68.aClass207_20));
			Static584.aClass355_23.method8434(new Class153(Static602.aClass207_119, "huffman"));
			Static584.aClass355_24.method8434(new Class375(Static146.aClass207_31));
			Static584.aClass355_25.method8434(new Class375(Static436.aClass207_88));
			Static584.aClass355_26.method8434(new Class375(Static40.aClass207_73));
			Static584.aClass355_27.method8434(new Class176(Static56.aClass207_16, "details"));
			for (local230 = 0; local230 < Static513.aClass355Array2.length; local230++) {
				if (Static513.aClass355Array2[local230].method8441() == null) {
					throw new RuntimeException();
				}
			}
			local249 = 0;
			@Pc(251) Class355[] local251 = Static513.aClass355Array2;
			for (@Pc(253) int local253 = 0; local253 < local251.length; local253++) {
				@Pc(259) Class355 local259 = local251[local253];
				local263 = local259.method8437();
				local269 = local259.method8441().method8918();
				local249 += local269 * local263 / 100;
			}
			Static437.anInt7510 = local249;
			Static179.anInt3165 = 2;
		}
		if (Static513.aClass355Array2 == null) {
			return 100;
		}
		local230 = 0;
		local249 = 0;
		@Pc(300) boolean local300 = true;
		@Pc(302) Class355[] local302 = Static513.aClass355Array2;
		for (@Pc(304) int local304 = 0; local304 < local302.length; local304++) {
			@Pc(310) Class355 local310 = local302[local304];
			local269 = local310.method8437();
			@Pc(320) int local320 = local310.method8441().method8918();
			if (local320 < 100) {
				local300 = false;
			}
			local230 += local269;
			local249 += local320 * local269 / 100;
		}
		if (local300) {
			if (!((Class311) Static584.aClass355_5.method8441()).method7533()) {
				Static475.aClient1.method1267();
			}
			if (!((Class311) Static584.aClass355_8.method8441()).method7533()) {
				Static213.aBoolean303 = Static475.aClient1.method1279();
			}
			Static513.aClass355Array2 = null;
		}
		local230 -= Static437.anInt7510;
		local249 -= Static437.anInt7510;
		local263 = local230 <= 0 ? 100 : local249 * 100 / local230;
		if (!local300 && local263 > 99) {
			local263 = 99;
		}
		return local263;
	}
}
