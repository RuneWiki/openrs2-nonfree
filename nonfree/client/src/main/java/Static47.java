import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "[Lclient!d;")
	public static Class62[] aClass62Array1;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "Lclient!qv;")
	public static final Class271 aClass271_1 = new Class271(3, 1);

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public static int anInt1291 = 0;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "Lclient!rk;")
	public static final Class6_Sub40 aClass6_Sub40_1 = new Class6_Sub40(0, 0);

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
	public static void method1151() {
		for (@Pc(11) int local11 = 0; local11 < Static561.anInt2408; local11++) {
			@Pc(17) int local17 = Static388.anIntArray510[local11];
			@Pc(25) Class11_Sub1_Sub1_Sub1 local25 = ((Class6_Sub33) Static506.aClass305_36.method7447((long) local17)).aClass11_Sub1_Sub1_Sub1_2;
			@Pc(29) int local29 = Static345.aClass6_Sub26_Sub2_1.method4966();
			if ((local29 & 0x40) != 0) {
				local29 += Static345.aClass6_Sub26_Sub2_1.method4966() << 8;
			}
			if ((local29 & 0x10) != 0) {
				if (local25.aClass222_1.method5321()) {
					Static548.method7833(local25);
				}
				local25.method611(Static504.aClass343_2.method7994(Static345.aClass6_Sub26_Sub2_1.method4983()));
				local25.method6220(local25.aClass222_1.anInt6248);
				local25.anInt7397 = local25.aClass222_1.anInt6247 << 3;
				if (local25.aClass222_1.method5321()) {
					Static503.method7509(0, local25.anIntArray527[0], null, local25.anIntArray526[0], local25.aByte77, null, local25);
				}
			}
			@Pc(110) int local110;
			@Pc(114) int local114;
			if ((local29 & 0x8) != 0) {
				local110 = Static345.aClass6_Sub26_Sub2_1.method4973();
				local114 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local25.method6221(local114, local110, Static508.anInt8998);
				local25.anInt7375 = Static508.anInt8998 + 300;
				local25.anInt7388 = Static345.aClass6_Sub26_Sub2_1.method4988();
			}
			if ((local29 & 0x1000) != 0) {
				local110 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local25.anInt7395 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local25.anInt7370 = Static345.aClass6_Sub26_Sub2_1.method4988();
				local25.aBoolean544 = (local110 & 0x8000) != 0;
				local25.anInt7403 = local110 & 0x7FFF;
				local25.anInt7410 = local25.anInt7403 + Static508.anInt8998 + local25.anInt7395;
			}
			if ((local29 & 0x200) != 0) {
				local110 = Static345.aClass6_Sub26_Sub2_1.method4973();
				local114 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local25.method6221(local114, local110, Static508.anInt8998);
			}
			if ((local29 & 0x2000) != 0) {
				local25.anInt7372 = Static345.aClass6_Sub26_Sub2_1.method4942();
				local25.anInt7367 = Static345.aClass6_Sub26_Sub2_1.method4972();
				local25.anInt7412 = Static345.aClass6_Sub26_Sub2_1.method4972();
				local25.anInt7429 = Static345.aClass6_Sub26_Sub2_1.method4964();
				local25.anInt7391 = Static345.aClass6_Sub26_Sub2_1.method4983() + Static508.anInt8998;
				local25.anInt7428 = Static345.aClass6_Sub26_Sub2_1.method4957() + Static508.anInt8998;
				local25.anInt7431 = Static345.aClass6_Sub26_Sub2_1.method4978();
				local25.anInt7432 = 1;
				local25.anInt7435 = 0;
				local25.anInt7429 += local25.anIntArray527[0];
				local25.anInt7412 += local25.anIntArray526[0];
				local25.anInt7367 += local25.anIntArray527[0];
				local25.anInt7372 += local25.anIntArray526[0];
			}
			if ((local29 & 0x800) != 0) {
				local110 = Static345.aClass6_Sub26_Sub2_1.method4954();
				@Pc(290) int[] local290 = new int[local110];
				@Pc(293) int[] local293 = new int[local110];
				@Pc(296) int[] local296 = new int[local110];
				for (@Pc(298) int local298 = 0; local298 < local110; local298++) {
					@Pc(304) int local304 = Static345.aClass6_Sub26_Sub2_1.method4999();
					if (local304 == 65535) {
						local304 = -1;
					}
					local290[local298] = local304;
					local293[local298] = Static345.aClass6_Sub26_Sub2_1.method4988();
					local296[local298] = Static345.aClass6_Sub26_Sub2_1.method4999();
				}
				Static464.method7160(local25, local296, local293, local290);
			}
			if ((local29 & 0x1) != 0) {
				local25.aString94 = Static345.aClass6_Sub26_Sub2_1.method4941();
				local25.anInt7419 = 100;
			}
			if ((local29 & 0x4) != 0) {
				local110 = Static345.aClass6_Sub26_Sub2_1.method4967();
				if (local110 == 65535) {
					local110 = -1;
				}
				local114 = Static345.aClass6_Sub26_Sub2_1.method4966();
				Static60.method1328(local25, local114, local110);
			}
			@Pc(393) int local393;
			if ((local29 & 0x2) != 0) {
				local110 = Static345.aClass6_Sub26_Sub2_1.method4957();
				local114 = Static345.aClass6_Sub26_Sub2_1.method4958();
				if (local110 == 65535) {
					local110 = -1;
				}
				local393 = Static345.aClass6_Sub26_Sub2_1.method4978();
				local25.method6217(local110, local114, false, local393);
			}
			if ((local29 & 0x20) != 0) {
				local25.anInt509 = Static345.aClass6_Sub26_Sub2_1.method4983();
				local25.anInt515 = Static345.aClass6_Sub26_Sub2_1.method4983();
			}
			if ((local29 & 0x400) != 0) {
				local110 = Static345.aClass6_Sub26_Sub2_1.method4967();
				if (local110 == 65535) {
					local110 = -1;
				}
				local114 = Static345.aClass6_Sub26_Sub2_1.method4969();
				local393 = Static345.aClass6_Sub26_Sub2_1.method4978();
				local25.method6217(local110, local114, true, local393);
			}
			if ((local29 & 0x80) != 0) {
				local25.anInt7407 = Static345.aClass6_Sub26_Sub2_1.method4957();
				if (local25.anInt7407 == 65535) {
					local25.anInt7407 = -1;
				}
			}
			if ((local29 & 0x100) != 0) {
				local25.aByte81 = Static345.aClass6_Sub26_Sub2_1.method4980();
				local25.aByte80 = Static345.aClass6_Sub26_Sub2_1.method4942();
				local25.aByte79 = Static345.aClass6_Sub26_Sub2_1.method4980();
				local25.aByte82 = (byte) Static345.aClass6_Sub26_Sub2_1.method4978();
				local25.anInt7413 = Static508.anInt8998 + Static345.aClass6_Sub26_Sub2_1.method4957();
				local25.anInt7359 = Static508.anInt8998 + Static345.aClass6_Sub26_Sub2_1.method4967();
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([I[I[IILclient!pi;)V")
	public static void method1152(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class11_Sub1_Sub1_Sub2 arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) int local18 = arg0[local12];
			@Pc(22) int local22 = arg1[local12];
			@Pc(26) int local26 = arg2[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && local28 < arg3.aClass324Array3.length; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg3.aClass324Array3[local28] = null;
					} else {
						@Pc(50) Class16 local50 = Static114.aClass156_2.method4101(local18);
						@Pc(53) int local53 = local50.anInt581;
						@Pc(58) Class324 local58 = arg3.aClass324Array3[local28];
						if (local58 != null) {
							if (local18 == local58.anInt9238) {
								if (local53 == 0) {
									local58 = arg3.aClass324Array3[local28] = null;
								} else if (local53 == 1) {
									local58.anInt9237 = 0;
									local58.anInt9242 = 0;
									local58.anInt9240 = 0;
									local58.anInt9239 = 1;
									local58.anInt9241 = local26;
									Static360.method5794(arg3.anInt7347, local50, arg3.anInt7351, arg3.aByte77, 0, Static350.aClass11_Sub1_Sub1_Sub2_4 == arg3);
								} else if (local53 == 2) {
									local58.anInt9240 = 0;
								}
							} else if (local50.anInt582 >= Static114.aClass156_2.method4101(local58.anInt9238).anInt582) {
								local58 = arg3.aClass324Array3[local28] = null;
							}
						}
						if (local58 == null) {
							local58 = arg3.aClass324Array3[local28] = new Class324();
							local58.anInt9242 = 0;
							local58.anInt9240 = 0;
							local58.anInt9238 = local18;
							local58.anInt9237 = 0;
							local58.anInt9239 = 1;
							local58.anInt9241 = local26;
							Static360.method5794(arg3.anInt7347, local50, arg3.anInt7351, arg3.aByte77, 0, Static350.aClass11_Sub1_Sub1_Sub2_4 == arg3);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}
}
