import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public static int anInt6937;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "Lclient!ct;")
	public static Class30 aClass30_107;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_213 = new Class217(15, -1);

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
	public static boolean aBoolean508 = true;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_234 = new Class106(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public static void method5983() {
		for (@Pc(3) int local3 = 0; local3 < Static342.anInt6506; local3++) {
			@Pc(9) int local9 = Static42.anIntArray72[local3];
			@Pc(13) Class11_Sub2_Sub6_Sub2 local13 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local9];
			@Pc(17) int local17 = Static180.aClass1_Sub7_Sub2_2.method2132();
			if ((local17 & 0x10) != 0) {
				local17 += Static180.aClass1_Sub7_Sub2_2.method2132() << 8;
			}
			@Pc(45) int local45;
			if ((local17 & 0x200) != 0) {
				local45 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local13.anInt6744 = Static180.aClass1_Sub7_Sub2_2.method2156();
				local13.anInt6771 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local13.anInt6757 = local45 & 0x7FFF;
				local13.aBoolean500 = (local45 & 0x8000) != 0;
				local13.anInt6750 = local13.anInt6757 + Static51.anInt1301 + local13.anInt6744;
			}
			if ((local17 & 0x80) != 0) {
				if (local13.aClass208_1.method5542()) {
					Static195.method3641(local13);
				}
				local13.method5906(Static139.method2817(Static180.aClass1_Sub7_Sub2_2.method2139()));
				local13.method5893(local13.aClass208_1.anInt6162);
				local13.anInt6786 = local13.aClass208_1.anInt6180 << 3;
				if (local13.aClass208_1.method5542()) {
					Static286.method5275(0, null, local13, local13.anIntArray504[0], local13.aByte79, null, local13.anIntArray505[0]);
				}
			}
			@Pc(160) int local160;
			if ((local17 & 0x1) != 0) {
				local45 = Static180.aClass1_Sub7_Sub2_2.method2161();
				if (local45 == 65535) {
					local45 = -1;
				}
				local160 = Static180.aClass1_Sub7_Sub2_2.method2113();
				Static315.method5401(local13, local160, local45);
			}
			if ((local17 & 0x40) != 0) {
				local45 = Static180.aClass1_Sub7_Sub2_2.method2134();
				local160 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local13.method5895(local45, local160, Static51.anInt1301);
				local13.anInt6769 = Static51.anInt1301 + 300;
				local13.anInt6780 = Static180.aClass1_Sub7_Sub2_2.method2113();
			}
			if ((local17 & 0x2) != 0) {
				local45 = Static180.aClass1_Sub7_Sub2_2.method2134();
				local160 = Static180.aClass1_Sub7_Sub2_2.method2135();
				local13.method5895(local45, local160, Static51.anInt1301);
			}
			@Pc(247) int local247;
			if ((local17 & 0x100) != 0) {
				local45 = Static180.aClass1_Sub7_Sub2_2.method2132();
				@Pc(233) int[] local233 = new int[local45];
				@Pc(236) int[] local236 = new int[local45];
				@Pc(239) int[] local239 = new int[local45];
				for (@Pc(241) int local241 = 0; local241 < local45; local241++) {
					local247 = Static180.aClass1_Sub7_Sub2_2.method2139();
					if (local247 == 65535) {
						local247 = -1;
					}
					local233[local241] = local247;
					local236[local241] = Static180.aClass1_Sub7_Sub2_2.method2156();
					local239[local241] = Static180.aClass1_Sub7_Sub2_2.method2130();
				}
				Static321.method5504(local236, local239, local233, local13);
			}
			if ((local17 & 0x8) != 0) {
				local45 = Static180.aClass1_Sub7_Sub2_2.method2139();
				local160 = Static180.aClass1_Sub7_Sub2_2.method2112();
				if (local45 == 65535) {
					local45 = -1;
				}
				@Pc(308) boolean local308 = true;
				@Pc(340) Class199 local340;
				if (local45 != -1 && local13.anInt6795 != -1) {
					@Pc(327) Class109 local327;
					if (local13.anInt6795 == local45) {
						local327 = Static345.method5752(local45);
						if (local327.aBoolean221 && local327.anInt3267 != -1) {
							local340 = Static161.method3066(local327.anInt3267);
							local247 = local340.anInt6015;
							if (local247 == 0) {
								local308 = false;
							} else if (local247 == 1) {
								local308 = true;
							} else if (local247 == 2) {
								local13.anInt6781 = 0;
								local308 = false;
							}
						}
					} else {
						local327 = Static345.method5752(local45);
						@Pc(382) Class109 local382 = Static345.method5752(local13.anInt6795);
						if (local327.anInt3267 != -1 && local382.anInt3267 != -1) {
							@Pc(397) Class199 local397 = Static161.method3066(local327.anInt3267);
							@Pc(402) Class199 local402 = Static161.method3066(local382.anInt3267);
							if (local402.anInt6020 > local397.anInt6020) {
								local308 = false;
							}
						}
					}
				}
				if (local308) {
					local13.anInt6774 = (local160 & 0xFFFF) + Static51.anInt1301;
					local13.anInt6782 = 1;
					local13.anInt6734 = local160 >> 16;
					local13.anInt6778 = 0;
					local13.anInt6748 = 0;
					local13.anInt6795 = local45;
					if (local13.anInt6774 > Static51.anInt1301) {
						local13.anInt6778 = -1;
					}
					if (local13.anInt6795 != -1 && Static51.anInt1301 == local13.anInt6774) {
						@Pc(469) int local469 = Static345.method5752(local13.anInt6795).anInt3267;
						if (local469 != -1) {
							local340 = Static161.method3066(local469);
							if (local340 != null && local340.anIntArray467 != null) {
								Static96.method2060(local340, false, local13.aByte79, 0, local13.anInt6729, local13.anInt6726);
							}
						}
					}
				}
			}
			if ((local17 & 0x400) != 0) {
				local13.anInt6813 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local13.anInt6812 = Static180.aClass1_Sub7_Sub2_2.method2161();
			}
			if ((local17 & 0x20) != 0) {
				local13.aString64 = Static180.aClass1_Sub7_Sub2_2.method2109();
				local13.anInt6753 = 100;
			}
			if ((local17 & 0x4) != 0) {
				local13.anInt6736 = Static180.aClass1_Sub7_Sub2_2.method2139();
				if (local13.anInt6736 == 65535) {
					local13.anInt6736 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!fp;IILclient!m;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method5985(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class129 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static368.aClass63_9 = arg0;
		Static272.anInt5290 = arg1;
		Static197.aClass129_3 = arg3;
		Static314.aBoolean451 = Static368.aClass63_9.method4592() > 0;
		Static79.anInt1760 = arg4 >> Static153.anInt3177;
		Static42.anInt1018 = arg6 >> Static153.anInt3177;
		Static134.anInt2901 = arg4;
		Static320.anInt4358 = arg6;
		Static102.anInt6997 = arg5;
		Static144.anInt3085 = Static79.anInt1760 - Static87.anInt1923;
		if (Static144.anInt3085 < 0) {
			Static46.anInt1179 = -Static144.anInt3085;
			Static144.anInt3085 = 0;
		} else {
			Static46.anInt1179 = 0;
		}
		Static192.anInt3871 = Static42.anInt1018 - Static87.anInt1923;
		if (Static192.anInt3871 < 0) {
			Static310.anInt5976 = -Static192.anInt3871;
			Static192.anInt3871 = 0;
		} else {
			Static310.anInt5976 = 0;
		}
		Static330.anInt6234 = Static79.anInt1760 + Static87.anInt1923;
		if (Static330.anInt6234 > Static300.anInt5778) {
			Static330.anInt6234 = Static300.anInt5778;
		}
		Static21.anInt519 = Static42.anInt1018 + Static87.anInt1923;
		if (Static21.anInt519 > Static354.anInt6714) {
			Static21.anInt519 = Static354.anInt6714;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static87.anInt1923 + Static87.anInt1923 + 2; local74++) {
			for (local77 = 0; local77 < Static87.anInt1923 + Static87.anInt1923 + 2; local77++) {
				local84 = Static79.anInt1760 + local74 - Static87.anInt1923;
				local90 = Static42.anInt1018 + local77 - Static87.anInt1923;
				if (local84 >= 0 && local90 >= 0 && local84 < Static300.anInt5778 && local90 < Static354.anInt6714) {
					@Pc(104) int local104 = local84 << Static153.anInt3177;
					@Pc(108) int local108 = local90 << Static153.anInt3177;
					@Pc(120) int local120 = Static50.aClass36Array3[Static50.aClass36Array3.length - 1].method4431(local84, local90) - 1000;
					@Pc(140) int local140 = Static200.aClass36Array4 == null ? Static50.aClass36Array3[0].method4431(local84, local90) + Static66.anInt1552 : Static200.aClass36Array4[0].method4431(local84, local90) + Static66.anInt1552;
					Static75.aBooleanArrayArray5[local74][local77] = Static368.aClass63_9.method4605(local104, local120, local108, local104, local140, local108);
				} else {
					Static75.aBooleanArrayArray5[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static87.anInt1923 + Static87.anInt1923 + 1; local77++) {
			for (local84 = 0; local84 < Static87.anInt1923 + Static87.anInt1923 + 1; local84++) {
				Static28.aBooleanArrayArray1[local77][local84] = Static75.aBooleanArrayArray5[local77][local84] || Static75.aBooleanArrayArray5[local77 + 1][local84] || Static75.aBooleanArrayArray5[local77][local84 + 1] || Static75.aBooleanArrayArray5[local77 + 1][local84 + 1];
			}
		}
		Static277.anIntArray419 = arg8;
		Static41.anIntArray71 = arg9;
		Static226.anIntArray373 = arg10;
		Static306.anIntArray456 = arg11;
		Static359.anIntArray507 = arg12;
		Static363.method6017();
		Static126.method2632();
		for (@Pc(256) Class32_Sub7 local256 = (Class32_Sub7) Static40.aClass195_2.method5302(); local256 != null; local256 = (Class32_Sub7) Static40.aClass195_2.method5298()) {
			local256.method5725();
			Static123.method2596(local256);
		}
		if (Static314.aBoolean451) {
			for (local90 = 0; local90 < Static92.anInt2063; local90++) {
				Static13.aClass1_Sub5_Sub1Array1[local90].method4539(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static368.aClass63_9.method4618(0);
			if (Static286.aClass118_4 == null || Static286.aClass118_4 instanceof Class118_Sub2) {
				Static286.aClass118_4 = new Class118_Sub1();
			}
		} else if (Static286.aClass118_4 == null || Static286.aClass118_4 instanceof Class118_Sub1) {
			Static286.aClass118_4 = new Class118_Sub2();
		}
		Static286.aClass118_4.method5664(arg2);
		Static286.aClass118_4.method5665();
		if (Static46.aClass155ArrayArrayArray1 != null) {
			Static263.method4798(true);
			Static286.aClass118_4.method5668(22);
			Static48.method2776(arg2, null, 0, (byte) 0, arg15, arg16);
			Static286.aClass118_4.method5665();
			Static286.aClass118_4.method5668(23);
			Static263.method4798(false);
		}
		Static48.method2776(arg2, arg7, arg13, arg14, arg15, arg16);
		Static286.aClass118_4.method5665();
		Static286.aClass118_4.method5669();
		Static286.aClass118_4.method5665();
		if (arg2 > 1) {
			Static368.aClass63_9.method4600(0);
		}
		Static368.aClass63_9.method4557(0, null);
	}
}
