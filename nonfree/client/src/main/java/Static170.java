import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "Z")
	public static boolean aBoolean264;

	@OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
	public static int anInt3583;

	@OriginalMember(owner = "client!gk", name = "gb", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(Z)V")
	public static void method2831() {
		for (@Pc(7) int local7 = 0; local7 < Static407.anInt7865; local7++) {
			@Pc(13) int local13 = Static470.anIntArray519[local7];
			@Pc(21) Class21_Sub1_Sub1_Sub1_Sub1 local21 = ((Class4_Sub29) Static144.aClass221_6.method5075((long) local13)).aClass21_Sub1_Sub1_Sub1_Sub1_1;
			@Pc(25) int local25 = Static549.aClass4_Sub13_Sub2_2.method7004();
			if ((local25 & 0x2) != 0) {
				local25 += Static549.aClass4_Sub13_Sub2_2.method7004() << 8;
			}
			@Pc(49) int local49;
			@Pc(76) int local76;
			if ((local25 & 0x1) != 0) {
				@Pc(47) int[] local47 = new int[4];
				for (local49 = 0; local49 < 4; local49++) {
					local47[local49] = Static549.aClass4_Sub13_Sub2_2.method7035();
					if (local47[local49] == 65535) {
						local47[local49] = -1;
					}
				}
				local76 = Static549.aClass4_Sub13_Sub2_2.method6987();
				Static541.method7578(local76, local47, local21);
			}
			@Pc(103) int local103;
			@Pc(114) int local114;
			@Pc(89) int local89;
			@Pc(92) int[] local92;
			@Pc(95) int[] local95;
			if ((local25 & 0x800) != 0) {
				local89 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local92 = new int[local89];
				local95 = new int[local89];
				for (@Pc(97) int local97 = 0; local97 < local89; local97++) {
					local103 = Static549.aClass4_Sub13_Sub2_2.method7010();
					if ((local103 & 0xC000) == 49152) {
						local114 = Static549.aClass4_Sub13_Sub2_2.method6995();
						local92[local97] = local114 | local103 << 16;
					} else {
						local92[local97] = local103;
					}
					local95[local97] = Static549.aClass4_Sub13_Sub2_2.method7054();
				}
				local21.method3332(local95, local92);
			}
			if ((local25 & 0x4000) != 0) {
				local89 = Static549.aClass4_Sub13_Sub2_2.method6987();
				local92 = new int[local89];
				local95 = new int[local89];
				@Pc(163) int[] local163 = new int[local89];
				for (local103 = 0; local103 < local89; local103++) {
					local114 = Static549.aClass4_Sub13_Sub2_2.method7010();
					if (local114 == 65535) {
						local114 = -1;
					}
					local92[local103] = local114;
					local95[local103] = Static549.aClass4_Sub13_Sub2_2.method7005();
					local163[local103] = Static549.aClass4_Sub13_Sub2_2.method7035();
				}
				Static80.method1708(local163, local21, local95, local92);
			}
			if ((local25 & 0x400) != 0) {
				local89 = Static549.aClass4_Sub13_Sub2_2.method7010();
				local21.anInt4238 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local21.anInt4208 = Static549.aClass4_Sub13_Sub2_2.method6987();
				local21.anInt4221 = local89 & 0x7FFF;
				local21.aBoolean296 = (local89 & 0x8000) != 0;
				local21.anInt4229 = Static306.anInt6122 + local21.anInt4221 + local21.anInt4238;
			}
			if ((local25 & 0x2000) != 0) {
				local89 = Static549.aClass4_Sub13_Sub2_2.method7019();
				local49 = Static549.aClass4_Sub13_Sub2_2.method6987();
				local21.method3331(Static306.anInt6122, local49, local89);
			}
			if ((local25 & 0x80) != 0) {
				local89 = Static549.aClass4_Sub13_Sub2_2.method7010();
				local49 = Static549.aClass4_Sub13_Sub2_2.method6993();
				if (local89 == 65535) {
					local89 = -1;
				}
				local76 = Static549.aClass4_Sub13_Sub2_2.method7009();
				local21.method3336(local76, false, local49, local89);
			}
			if ((local25 & 0x20) != 0) {
				local21.anInt4263 = Static549.aClass4_Sub13_Sub2_2.method7054();
				if (local21.anInt4263 == 65535) {
					local21.anInt4263 = -1;
				}
			}
			if ((local25 & 0x100) != 0) {
				local21.aByte62 = Static549.aClass4_Sub13_Sub2_2.method7007();
				local21.aByte65 = Static549.aClass4_Sub13_Sub2_2.method7007();
				local21.aByte63 = Static549.aClass4_Sub13_Sub2_2.method7007();
				local21.aByte64 = (byte) Static549.aClass4_Sub13_Sub2_2.method7005();
				local21.anInt4273 = Static306.anInt6122 + Static549.aClass4_Sub13_Sub2_2.method7035();
				local21.anInt4217 = Static306.anInt6122 + Static549.aClass4_Sub13_Sub2_2.method7054();
			}
			if ((local25 & 0x40) != 0) {
				local21.anInt2171 = Static549.aClass4_Sub13_Sub2_2.method7035();
				local21.anInt2168 = Static549.aClass4_Sub13_Sub2_2.method7035();
			}
			if ((local25 & 0x8) != 0) {
				if (local21.aClass51_1.method1374()) {
					Static408.method6171(local21);
				}
				local21.method1714(Class21_Sub1_Sub2_Sub1.lb.method4992(Static549.aClass4_Sub13_Sub2_2.method6995()));
				local21.method3334(local21.aClass51_1.anInt1581);
				local21.anInt4255 = local21.aClass51_1.anInt1608 << 3;
				if (local21.aClass51_1.method1374()) {
					Static394.method6038(local21, null, local21.aByte127, local21.anIntArray207[0], local21.anIntArray206[0], 0, null);
				}
			}
			if ((local25 & 0x1000) != 0) {
				local21.anInt4239 = Static549.aClass4_Sub13_Sub2_2.method7011();
				local21.anInt4274 = Static549.aClass4_Sub13_Sub2_2.method7045();
				local21.anInt4227 = Static549.aClass4_Sub13_Sub2_2.method7008();
				local21.anInt4259 = Static549.aClass4_Sub13_Sub2_2.method7011();
				local21.anInt4242 = Static549.aClass4_Sub13_Sub2_2.method7054() + Static306.anInt6122;
				local21.anInt4212 = Static549.aClass4_Sub13_Sub2_2.method7035() + Static306.anInt6122;
				local21.anInt4215 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local21.anInt4259 += local21.anIntArray207[0];
				local21.anInt4239 += local21.anIntArray206[0];
				local21.anInt4280 = 0;
				local21.anInt4277 = 1;
				local21.anInt4274 += local21.anIntArray207[0];
				local21.anInt4227 += local21.anIntArray206[0];
			}
			if ((local25 & 0x10) != 0) {
				local89 = Static549.aClass4_Sub13_Sub2_2.method7019();
				local49 = Static549.aClass4_Sub13_Sub2_2.method7005();
				local21.method3331(Static306.anInt6122, local49, local89);
				local21.anInt4264 = Static306.anInt6122 + 300;
				local21.anInt4276 = Static549.aClass4_Sub13_Sub2_2.method7005();
			}
			if ((local25 & 0x200) != 0) {
				local89 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local49 = Static549.aClass4_Sub13_Sub2_2.method7046();
				if (local89 == 65535) {
					local89 = -1;
				}
				local76 = Static549.aClass4_Sub13_Sub2_2.method7005();
				local21.method3336(local76, true, local49, local89);
			}
			if ((local25 & 0x4) != 0) {
				local21.aString86 = Static549.aClass4_Sub13_Sub2_2.method7016();
				local21.anInt4240 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIZII)V")
	public static void method2832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static455.aClass4_Sub35_Sub1_1.anInt9916 != 0 && arg3 != 0 && Static399.anInt7806 < 50 && arg4 != -1) {
			Static256.aClass185Array1[Static399.anInt7806++] = new Class185((byte) 1, arg4, arg3, arg2, arg1, 0, arg0, null);
		}
	}
}
