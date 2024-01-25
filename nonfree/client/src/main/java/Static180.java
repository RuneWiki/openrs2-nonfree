import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!it", name = "p", descriptor = "Lclient!m;")
	public static Interface5 anInterface5_4;

	@OriginalMember(owner = "client!it", name = "y", descriptor = "I")
	public static int anInt3574;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "Z")
	public static volatile boolean aBoolean307 = true;

	@OriginalMember(owner = "client!it", name = "o", descriptor = "F")
	public static float aFloat27 = 1024.0F;

	@OriginalMember(owner = "client!it", name = "s", descriptor = "I")
	public static int anInt3570 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIII[FII)V")
	public static void method2863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static137.method2172(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static137.method2172(arg2)) {
			@Pc(32) int local32 = Static392.method5077(6408);
			@Pc(34) int local34 = 0;
			@Pc(41) int local41 = arg2 > arg0 ? arg0 : arg2;
			@Pc(45) int local45 = arg0 >> 1;
			@Pc(49) int local49 = arg2 >> 1;
			@Pc(51) float[] local51 = arg3;
			@Pc(58) float[] local58 = new float[local49 * local45 * local32];
			while (true) {
				OpenGL.glTexImage2Df(3553, local34, 34842, arg0, arg2, 0, 6408, 5126, local51, 0);
				if (local41 <= 1) {
					return;
				}
				@Pc(76) int local76 = local32 * arg0;
				@Pc(78) float[] local78 = local58;
				for (@Pc(80) int local80 = 0; local80 < local32; local80++) {
					@Pc(83) int local83 = local80;
					@Pc(85) int local85 = local80;
					@Pc(89) int local89 = local80 + local76;
					for (@Pc(91) int local91 = 0; local91 < local49; local91++) {
						for (@Pc(94) int local94 = 0; local94 < local45; local94++) {
							@Pc(99) float local99 = local51[local85];
							local85 += local32;
							@Pc(109) float local109 = local99 + local51[local85];
							local85 += local32;
							@Pc(119) float local119 = local109 + local51[local89];
							local89 += local32;
							@Pc(129) float local129 = local119 + local51[local89];
							local58[local83] = local129 * 0.25F;
							local89 += local32;
							local83 += local32;
						}
						local89 += local76;
						local85 += local76;
					}
				}
				local58 = local51;
				local51 = local78;
				arg0 = local45;
				arg2 = local49;
				local34++;
				local49 >>= 0x1;
				local45 >>= 0x1;
				local41 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method2864(@OriginalArg(1) Class172 arg0) {
		@Pc(5) int local5 = Static124.anInt7631;
		@Pc(7) int local7 = Static442.anInt7488;
		@Pc(9) int local9 = Static126.anInt2657;
		@Pc(13) int local13 = Static242.anInt4631 - 3;
		if (Static355.aClass8_24 == null || Static302.aClass8_22 == null) {
			if (Static405.aClass32_82.method800(Static377.anInt6349) && Static405.aClass32_82.method800(Static409.anInt6740)) {
				Static355.aClass8_24 = arg0.method5542(Static464.method5847(Static405.aClass32_82, Static377.anInt6349, 0));
				@Pc(58) Class264 local58 = Static464.method5847(Static405.aClass32_82, Static409.anInt6740, 0);
				Static302.aClass8_22 = arg0.method5542(local58);
				local58.method5842();
				Static335.aClass8_10 = arg0.method5542(local58);
			} else {
				arg0.NA(local5, local7, local9, 20, 255 - Static447.anInt7574 << 24 | Static388.anInt6485, 1);
			}
		}
		@Pc(87) int local87;
		@Pc(85) int local85;
		if (Static355.aClass8_24 != null && Static302.aClass8_22 != null) {
			local85 = (local9 - Static302.aClass8_22.UA() * 2) / Static355.aClass8_24.UA();
			for (local87 = 0; local87 < local85; local87++) {
				Static355.aClass8_24.method6001(Static302.aClass8_22.UA() + local5 + local87 * Static355.aClass8_24.UA(), local7);
			}
			Static302.aClass8_22.method6001(local5, local7);
			Static335.aClass8_10.method6001(local9 + local5 - Static335.aClass8_10.UA(), local7);
		}
		Static321.aClass59_4.method5788(-1, Static7.aClass189_5.method4262(Static53.anInt1454), Static421.anInt6878 | 0xFF000000, local5 + 3, local7 + 14);
		arg0.NA(local5, local7 + 20, local9, local13 - 20, -Static447.anInt7574 + 255 << 24 | Static388.anInt6485, 1);
		local85 = Static290.aClass100_1.method3218();
		local87 = Static290.aClass100_1.method3213();
		@Pc(166) int local166 = 0;
		@Pc(188) int local188;
		for (@Pc(171) Class3_Sub14 local171 = (Class3_Sub14) Static184.aClass243_21.method5208(); local171 != null; local171 = (Class3_Sub14) Static184.aClass243_21.method5203()) {
			local188 = (Static158.anInt3162 - local166 - 1) * 16 + local7 + 20 + 13;
			if (local85 > local5 && local85 < local9 + local5 && local188 - 13 < local87 && local188 + 4 > local87 && local171.aBoolean173) {
				arg0.NA(local5, local188 - 12, local9, 16, 255 - Static122.anInt2613 << 24 | Static284.anInt5187, 1);
			}
			local166++;
		}
		if ((Static258.aClass8_19 == null || Static8.aClass8_23 == null || Static405.aClass8_26 == null) && Static405.aClass32_82.method800(Static272.anInt6023) && Static405.aClass32_82.method800(Static280.anInt5132) && Static405.aClass32_82.method800(Static178.anInt3546)) {
			@Pc(268) Class264 local268 = Static464.method5847(Static405.aClass32_82, Static280.anInt5132, 0);
			Static8.aClass8_23 = arg0.method5542(local268);
			local268.method5842();
			Static64.aClass8_4 = arg0.method5542(local268);
			Static258.aClass8_19 = arg0.method5542(Static464.method5847(Static405.aClass32_82, Static272.anInt6023, 0));
			@Pc(293) Class264 local293 = Static464.method5847(Static405.aClass32_82, Static178.anInt3546, 0);
			Static405.aClass8_26 = arg0.method5542(local293);
			local293.method5842();
			Static156.aClass8_11 = arg0.method5542(local293);
		}
		local166 = 0;
		@Pc(361) int local361;
		@Pc(326) int local326;
		if (Static258.aClass8_19 != null && Static8.aClass8_23 != null && Static405.aClass8_26 != null) {
			local188 = (local9 - Static405.aClass8_26.UA() * 2) / Static258.aClass8_19.UA();
			for (local326 = 0; local326 < local188; local326++) {
				Static258.aClass8_19.method6001(Static405.aClass8_26.UA() + local5 + Static258.aClass8_19.UA() * local326, -Static258.aClass8_19.qa() + local7 + local13);
			}
			local361 = (local13 - Static405.aClass8_26.qa() - 20) / Static8.aClass8_23.qa();
			for (@Pc(363) int local363 = 0; local363 < local361; local363++) {
				Static8.aClass8_23.method6001(local5, local7 + Static8.aClass8_23.qa() * local363 + 20);
				Static64.aClass8_4.method6001(local5 + local9 - Static64.aClass8_4.UA(), local7 - (-20 - Static8.aClass8_23.qa() * local363));
			}
			Static405.aClass8_26.method6001(local5, local13 + local7 - Static405.aClass8_26.qa());
			Static156.aClass8_11.method6001(local5 + local9 - Static405.aClass8_26.UA(), -Static405.aClass8_26.qa() + local7 - -local13);
		}
		for (@Pc(429) Class3_Sub14 local429 = (Class3_Sub14) Static184.aClass243_21.method5208(); local429 != null; local429 = (Class3_Sub14) Static184.aClass243_21.method5203()) {
			local326 = local7 + (Static158.anInt3162 - local166 - 1) * 16 + 20 + 13;
			local361 = Static421.anInt6878 | 0xFF000000;
			if (local5 < local85 && local85 < local9 + local5 && local326 - 13 < local87 && local326 + 4 > local87 && local429.aBoolean173) {
				local361 = Static43.anInt1145 | 0xFF000000;
			}
			@Pc(478) int[] local478 = null;
			if (Static353.method4700(local429.anInt2182)) {
				local478 = Static314.aClass12_2.method327((int) local429.aLong76).anIntArray144;
			} else if (local429.anInt2183 != -1) {
				local478 = Static314.aClass12_2.method327(local429.anInt2183).anIntArray144;
			} else if (Static376.method4928(local429.anInt2182)) {
				@Pc(545) Class7_Sub2_Sub3_Sub1 local545 = Static139.aClass7_Sub2_Sub3_Sub1Array11[(int) local429.aLong76];
				if (local545 != null) {
					@Pc(550) Class47 local550 = local545.aClass47_1;
					if (local550.anIntArray94 != null) {
						local550 = local550.method1251(Static85.aClass49_1);
					}
					if (local550 != null) {
						local478 = local550.anIntArray95;
					}
				}
			} else if (Static102.method1794(local429.anInt2182)) {
				@Pc(517) Class93 local517;
				if (local429.anInt2182 == 1011) {
					local517 = Static435.aClass30_4.method769((int) local429.aLong76);
				} else {
					local517 = Static435.aClass30_4.method769((int) (local429.aLong76 >>> 32 & 0x7FFFFFFFL));
				}
				if (local517.anIntArray171 != null) {
					local517 = local517.method2066(Static85.aClass49_1);
				}
				if (local517 != null) {
					local478 = local517.lb;
				}
			}
			@Pc(584) String local584 = Static407.method5245(local429);
			if (local478 != null) {
				local584 = local584 + Static390.method5066(local478);
			}
			Static321.aClass59_4.method5789(local5 + 3, Static430.aClass8Array88, local361, Static221.anIntArray276, local584, local326);
			local166++;
			if (local429.aBoolean174) {
				Static183.aClass8_14.method6001(Static269.aClass70_27.method1759(local584) + local5 + 5, local326 - 12);
			}
		}
		Static406.method5233(Static242.anInt4631, Static442.anInt7488, Static124.anInt7631, Static126.anInt2657);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method2865(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static137.method2172(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(42) int local42;
			do {
				local42 = arg0.nextInt();
			} while (local42 >= local34);
			return Static21.method467(arg1, local42);
		}
	}
}
