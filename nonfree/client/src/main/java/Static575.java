import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
	public static int anInt9880;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "Ljava/lang/Object;")
	public static Object anObject22;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_112 = new Class257(75, 8);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBLclient!fh;I)V")
	public static void method7980(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub5_Sub7 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static72.aClass43_17.aClass8_37) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt3780;
		@Pc(18) int local18 = arg1.anInt3782;
		@Pc(21) int local21 = arg1.anInt3779;
		@Pc(25) int local25 = (int) arg1.aLong93;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg1.aLong93;
		if (local21 == 9 && Static523.aClass331_16 == null) {
			Static335.method5423(local18, local15);
			Static523.aClass331_16 = Static201.method3722(local18, local15);
			Static86.method2113(Static523.aClass331_16);
		}
		if (local21 == 5 || local21 == 1002) {
			Static267.method4636(local18, local25, arg1.aString42, local15);
		}
		@Pc(94) Class8_Sub31 local94;
		if (local21 == 1010) {
			Static459.anInt8403 = 0;
			Static85.anInt8479 = 2;
			Static340.anInt6655 = arg0;
			Static108.anInt2818 = arg2;
			local94 = Static51.method1418(Static461.aClass257_89, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8548(local25);
			Static262.method4604(local94);
		}
		if (local21 == 10) {
			Static340.anInt6655 = arg0;
			Static108.anInt2818 = arg2;
			Static459.anInt8403 = 0;
			Static85.anInt8479 = 2;
			local94 = Static51.method1418(Static54.aClass257_15, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8558(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8546(Static594.anInt10160 + local18);
			local94.aClass8_Sub8_Sub2_1.method8551(local15 + Static628.anInt10493);
			local94.aClass8_Sub8_Sub2_1.method8546(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static262.method4604(local94);
			Static462.method6958(local32, local15, local18);
		}
		if (local21 == 48) {
			Static108.anInt2818 = arg2;
			Static459.anInt8403 = 0;
			Static340.anInt6655 = arg0;
			Static85.anInt8479 = 2;
			local94 = Static51.method1418(Static639.aClass257_125, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8572(Static628.anInt10493 + local15);
			local94.aClass8_Sub8_Sub2_1.method8548(local25);
			local94.aClass8_Sub8_Sub2_1.method8548(local18 + Static594.anInt10160);
			local94.aClass8_Sub8_Sub2_1.method8535(Static295.aClass209_1.method5482(82) ? 1 : 0);
			Static262.method4604(local94);
			Static178.method3434(local18, local15);
		}
		if (local21 == 22) {
			if (Static190.anInt7431 > 0 && Static295.aClass209_1.method5482(82) && Static295.aClass209_1.method5482(81)) {
				Static165.method3305(Static594.anInt10160 + local18, Static628.anInt10493 + local15, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124);
			} else {
				Static85.anInt8479 = 1;
				Static459.anInt8403 = 0;
				Static340.anInt6655 = arg0;
				Static108.anInt2818 = arg2;
				local94 = Static51.method1418(Static379.aClass257_71, Static608.aClass336_1);
				local94.aClass8_Sub8_Sub2_1.method8572(local18 + Static594.anInt10160);
				local94.aClass8_Sub8_Sub2_1.method8551(local15 + Static628.anInt10493);
				Static262.method4604(local94);
			}
		}
		@Pc(308) Class15_Sub1_Sub2_Sub2_Sub2 local308;
		@Pc(325) Class8_Sub31 local325;
		@Pc(303) Class8_Sub50 local303;
		if (local21 == 49) {
			local303 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local25);
			if (local303 != null) {
				local308 = local303.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				Static459.anInt8403 = 0;
				Static108.anInt2818 = arg2;
				Static85.anInt8479 = 2;
				Static340.anInt6655 = arg0;
				local325 = Static51.method1418(Static315.aClass257_98, Static608.aClass336_1);
				local325.aClass8_Sub8_Sub2_1.method8558(Static295.aClass209_1.method5482(82) ? 1 : 0);
				local325.aClass8_Sub8_Sub2_1.method8551(local25);
				Static262.method4604(local325);
				Static46.method1367(true, 0, -2, local308.anIntArray436[0], local308.method6692(), local308.method6692(), 0, local308.anIntArray435[0]);
			}
		}
		@Pc(396) Class8_Sub31 local396;
		@Pc(377) Class15_Sub1_Sub2_Sub2_Sub1 local377;
		if (local21 == 58) {
			local377 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local25];
			if (local377 != null) {
				Static340.anInt6655 = arg0;
				Static85.anInt8479 = 2;
				Static459.anInt8403 = 0;
				Static108.anInt2818 = arg2;
				local396 = Static51.method1418(Static360.aClass257_66, Static608.aClass336_1);
				local396.aClass8_Sub8_Sub2_1.method8573(Static295.aClass209_1.method5482(82) ? 1 : 0);
				local396.aClass8_Sub8_Sub2_1.method8548(local25);
				Static262.method4604(local396);
				Static46.method1367(true, 0, -2, local377.anIntArray436[0], local377.method6692(), local377.method6692(), 0, local377.anIntArray435[0]);
			}
		}
		if (local21 == 16) {
			local303 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local25);
			if (local303 != null) {
				Static108.anInt2818 = arg2;
				Static85.anInt8479 = 2;
				local308 = local303.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				Static459.anInt8403 = 0;
				Static340.anInt6655 = arg0;
				local325 = Static51.method1418(Static105.aClass257_21, Static608.aClass336_1);
				local325.aClass8_Sub8_Sub2_1.method8572(local25);
				local325.aClass8_Sub8_Sub2_1.method8573(Static295.aClass209_1.method5482(82) ? 1 : 0);
				Static262.method4604(local325);
				Static46.method1367(true, 0, -2, local308.anIntArray436[0], local308.method6692(), local308.method6692(), 0, local308.anIntArray435[0]);
			}
		}
		if (local21 == 6) {
			Static85.anInt8479 = 1;
			Static459.anInt8403 = 0;
			Static108.anInt2818 = arg2;
			Static340.anInt6655 = arg0;
			local94 = Static51.method1418(Static616.aClass257_123, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8548(local18 + Static594.anInt10160);
			local94.aClass8_Sub8_Sub2_1.method8551(local15 + Static628.anInt10493);
			local94.aClass8_Sub8_Sub2_1.method8543(Static401.anInt7697);
			local94.aClass8_Sub8_Sub2_1.method8546(Static391.anInt7576);
			local94.aClass8_Sub8_Sub2_1.method8551(Static230.anInt5229);
			Static262.method4604(local94);
			Static46.method1367(true, 0, -4, local18, 1, 1, 0, local15);
		}
		@Pc(598) Class331 local598;
		if (local21 == 13) {
			local598 = Static201.method3722(local18, local15);
			if (local598 != null) {
				Static196.method3670(local598);
			}
		}
		if (local21 == 47) {
			local377 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local25];
			if (local377 != null) {
				Static85.anInt8479 = 2;
				Static340.anInt6655 = arg0;
				Static108.anInt2818 = arg2;
				Static459.anInt8403 = 0;
				local396 = Static51.method1418(Static297.aClass257_57, Static608.aClass336_1);
				local396.aClass8_Sub8_Sub2_1.method8572(local25);
				local396.aClass8_Sub8_Sub2_1.method8573(Static295.aClass209_1.method5482(82) ? 1 : 0);
				Static262.method4604(local396);
				Static46.method1367(true, 0, -2, local377.anIntArray436[0], local377.method6692(), local377.method6692(), 0, local377.anIntArray435[0]);
			}
		}
		if (local21 == 44) {
			Static340.anInt6655 = arg0;
			Static85.anInt8479 = 2;
			Static459.anInt8403 = 0;
			Static108.anInt2818 = arg2;
			local94 = Static51.method1418(Static86.aClass257_19, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8551(local15 + Static628.anInt10493);
			local94.aClass8_Sub8_Sub2_1.method8572(local18 + Static594.anInt10160);
			local94.aClass8_Sub8_Sub2_1.method8535(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8548(local25);
			Static262.method4604(local94);
			Static178.method3434(local18, local15);
		}
		if (local21 == 4) {
			local303 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local25);
			if (local303 != null) {
				Static459.anInt8403 = 0;
				local308 = local303.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				Static85.anInt8479 = 2;
				Static108.anInt2818 = arg2;
				Static340.anInt6655 = arg0;
				local325 = Static51.method1418(Static437.aClass257_83, Static608.aClass336_1);
				local325.aClass8_Sub8_Sub2_1.method8535(Static295.aClass209_1.method5482(82) ? 1 : 0);
				local325.aClass8_Sub8_Sub2_1.method8546(local25);
				Static262.method4604(local325);
				Static46.method1367(true, 0, -2, local308.anIntArray436[0], local308.method6692(), local308.method6692(), 0, local308.anIntArray435[0]);
			}
		}
		if (local21 == 45) {
			Static108.anInt2818 = arg2;
			Static459.anInt8403 = 0;
			Static85.anInt8479 = 2;
			Static340.anInt6655 = arg0;
			local94 = Static51.method1418(Static454.aClass257_88, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8548(local18 + Static594.anInt10160);
			local94.aClass8_Sub8_Sub2_1.method8572(local25);
			local94.aClass8_Sub8_Sub2_1.method8558(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8572(Static391.anInt7576);
			local94.aClass8_Sub8_Sub2_1.method8551(Static230.anInt5229);
			local94.aClass8_Sub8_Sub2_1.method8567(Static401.anInt7697);
			local94.aClass8_Sub8_Sub2_1.method8548(Static628.anInt10493 + local15);
			Static262.method4604(local94);
			Static178.method3434(local18, local15);
		}
		if (local21 == 1009) {
			Static85.anInt8479 = 2;
			Static108.anInt2818 = arg2;
			Static340.anInt6655 = arg0;
			Static459.anInt8403 = 0;
			local94 = Static51.method1418(Static328.aClass257_109, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8573(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8572(local15 + Static628.anInt10493);
			local94.aClass8_Sub8_Sub2_1.method8546(local18 + Static594.anInt10160);
			local94.aClass8_Sub8_Sub2_1.method8551(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static262.method4604(local94);
			Static462.method6958(local32, local15, local18);
		}
		if (local21 == 51) {
			Static340.anInt6655 = arg0;
			Static459.anInt8403 = 0;
			Static108.anInt2818 = arg2;
			Static85.anInt8479 = 2;
			local94 = Static51.method1418(Static535.aClass257_100, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8548(local18 + Static594.anInt10160);
			local94.aClass8_Sub8_Sub2_1.method8562(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8546(local25);
			local94.aClass8_Sub8_Sub2_1.method8572(local15 + Static628.anInt10493);
			Static262.method4604(local94);
			Static178.method3434(local18, local15);
		}
		if (local21 == 46) {
			Static85.anInt8479 = 2;
			Static459.anInt8403 = 0;
			Static340.anInt6655 = arg0;
			Static108.anInt2818 = arg2;
			local94 = Static51.method1418(Static304.aClass257_58, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8551(Static628.anInt10493 + local15);
			local94.aClass8_Sub8_Sub2_1.method8546(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local94.aClass8_Sub8_Sub2_1.method8535(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8572(Static594.anInt10160 + local18);
			Static262.method4604(local94);
			Static462.method6958(local32, local15, local18);
		}
		if (local21 == 19) {
			Static108.anInt2818 = arg2;
			Static85.anInt8479 = 2;
			Static340.anInt6655 = arg0;
			Static459.anInt8403 = 0;
			local94 = Static51.method1418(Static444.aClass257_86, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8548(Static594.anInt10160 + local18);
			local94.aClass8_Sub8_Sub2_1.method8546(local15 + Static628.anInt10493);
			local94.aClass8_Sub8_Sub2_1.method8562(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8572((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static262.method4604(local94);
			Static462.method6958(local32, local15, local18);
		}
		if (local21 == 20) {
			Static459.anInt8403 = 0;
			Static85.anInt8479 = 2;
			Static340.anInt6655 = arg0;
			Static108.anInt2818 = arg2;
			local94 = Static51.method1418(Static408.aClass257_80, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8572(Static594.anInt10160 + local18);
			local94.aClass8_Sub8_Sub2_1.method8572(Static628.anInt10493 + local15);
			local94.aClass8_Sub8_Sub2_1.method8546(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local94.aClass8_Sub8_Sub2_1.method8573(Static295.aClass209_1.method5482(82) ? 1 : 0);
			Static262.method4604(local94);
			Static462.method6958(local32, local15, local18);
		}
		if (local21 == 25) {
			Static108.anInt2818 = arg2;
			Static340.anInt6655 = arg0;
			Static459.anInt8403 = 0;
			Static85.anInt8479 = 2;
			local94 = Static51.method1418(Static335.aClass257_63, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8573(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8546(Static628.anInt10493 + local15);
			local94.aClass8_Sub8_Sub2_1.method8548(Static594.anInt10160 + local18);
			local94.aClass8_Sub8_Sub2_1.method8551(local25);
			Static262.method4604(local94);
			Static178.method3434(local18, local15);
		}
		if (local21 == 1003) {
			Static340.anInt6655 = arg0;
			Static459.anInt8403 = 0;
			Static108.anInt2818 = arg2;
			Static85.anInt8479 = 2;
			local94 = Static51.method1418(Static635.aClass257_124, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8548(local25);
			Static262.method4604(local94);
		}
		if (local21 == 12) {
			local598 = Static201.method3722(local18, local15);
			if (local598 != null) {
				Static8.method91();
				@Pc(1338) Class8_Sub34 local1338 = Static73.method1921(local598);
				Static471.method7031(local598, local1338.anInt6429, local1338.method5219());
				Static598.aString17 = Static408.method6463(local598);
				Static4.aString2 = local598.aString101 + "<col=ffffff>";
				if (Static598.aString17 == null) {
					Static598.aString17 = "Null";
				}
			}
			return;
		}
		if (local21 == 2) {
			Static85.anInt8479 = 2;
			Static108.anInt2818 = arg2;
			Static340.anInt6655 = arg0;
			Static459.anInt8403 = 0;
			local94 = Static51.method1418(Static486.aClass257_93, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8572(Static594.anInt10160 + local18);
			local94.aClass8_Sub8_Sub2_1.method8572(local15 + Static628.anInt10493);
			local94.aClass8_Sub8_Sub2_1.method8562(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8546(local25);
			Static262.method4604(local94);
			Static178.method3434(local18, local15);
		}
		if (local21 == 15) {
			if (Static190.anInt7431 > 0 && Static295.aClass209_1.method5482(82) && Static295.aClass209_1.method5482(81)) {
				Static165.method3305(local18 + Static594.anInt10160, local15 + Static628.anInt10493, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124);
			} else {
				local94 = Static540.method7648(local25, local15, local18);
				if (local25 == 1) {
					local94.aClass8_Sub8_Sub2_1.method8562(-1);
					local94.aClass8_Sub8_Sub2_1.method8562(-1);
					local94.aClass8_Sub8_Sub2_1.method8548((int) Static499.aFloat185);
					local94.aClass8_Sub8_Sub2_1.method8562(57);
					local94.aClass8_Sub8_Sub2_1.method8562(Static642.anInt10689);
					local94.aClass8_Sub8_Sub2_1.method8562(Static423.anInt7961);
					local94.aClass8_Sub8_Sub2_1.method8562(89);
					local94.aClass8_Sub8_Sub2_1.method8548(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301);
					local94.aClass8_Sub8_Sub2_1.method8548(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298);
					local94.aClass8_Sub8_Sub2_1.method8562(63);
				} else {
					Static459.anInt8403 = 0;
					Static108.anInt2818 = arg2;
					Static85.anInt8479 = 1;
					Static340.anInt6655 = arg0;
				}
				Static262.method4604(local94);
				Static46.method1367(true, 0, -4, local18, 1, 1, 0, local15);
			}
		}
		if (local21 == 60) {
			local377 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local25];
			if (local377 != null) {
				Static459.anInt8403 = 0;
				Static85.anInt8479 = 2;
				Static108.anInt2818 = arg2;
				Static340.anInt6655 = arg0;
				local396 = Static51.method1418(Static507.aClass257_95, Static608.aClass336_1);
				local396.aClass8_Sub8_Sub2_1.method8558(Static295.aClass209_1.method5482(82) ? 1 : 0);
				local396.aClass8_Sub8_Sub2_1.method8546(local25);
				Static262.method4604(local396);
				Static46.method1367(true, 0, -2, local377.anIntArray436[0], local377.method6692(), local377.method6692(), 0, local377.anIntArray435[0]);
			}
		}
		if (local21 == 23) {
			local303 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local25);
			if (local303 != null) {
				local308 = local303.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				Static108.anInt2818 = arg2;
				Static459.anInt8403 = 0;
				Static340.anInt6655 = arg0;
				Static85.anInt8479 = 2;
				local325 = Static51.method1418(Static160.aClass257_36, Static608.aClass336_1);
				local325.aClass8_Sub8_Sub2_1.method8551(local25);
				local325.aClass8_Sub8_Sub2_1.method8535(Static295.aClass209_1.method5482(82) ? 1 : 0);
				Static262.method4604(local325);
				Static46.method1367(true, 0, -2, local308.anIntArray436[0], local308.method6692(), local308.method6692(), 0, local308.anIntArray435[0]);
			}
		}
		if (local21 == 21) {
			local377 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local25];
			if (local377 != null) {
				Static459.anInt8403 = 0;
				Static108.anInt2818 = arg2;
				Static85.anInt8479 = 2;
				Static340.anInt6655 = arg0;
				local396 = Static51.method1418(Static578.aClass257_113, Static608.aClass336_1);
				local396.aClass8_Sub8_Sub2_1.method8562(Static295.aClass209_1.method5482(82) ? 1 : 0);
				local396.aClass8_Sub8_Sub2_1.method8546(local25);
				Static262.method4604(local396);
				Static46.method1367(true, 0, -2, local377.anIntArray436[0], local377.method6692(), local377.method6692(), 0, local377.anIntArray435[0]);
			}
		}
		if (local21 == 50) {
			Static108.anInt2818 = arg2;
			Static85.anInt8479 = 2;
			Static340.anInt6655 = arg0;
			Static459.anInt8403 = 0;
			local94 = Static51.method1418(Static277.aClass257_49, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8558(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8548(local15 + Static628.anInt10493);
			local94.aClass8_Sub8_Sub2_1.method8567(Static401.anInt7697);
			local94.aClass8_Sub8_Sub2_1.method8551(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local94.aClass8_Sub8_Sub2_1.method8548(local18 + Static594.anInt10160);
			local94.aClass8_Sub8_Sub2_1.method8572(Static391.anInt7576);
			local94.aClass8_Sub8_Sub2_1.method8551(Static230.anInt5229);
			Static262.method4604(local94);
			Static462.method6958(local32, local15, local18);
		}
		if (local21 == 57) {
			local377 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local25];
			if (local377 != null) {
				Static340.anInt6655 = arg0;
				Static85.anInt8479 = 2;
				Static459.anInt8403 = 0;
				Static108.anInt2818 = arg2;
				local396 = Static51.method1418(Static278.aClass257_50, Static608.aClass336_1);
				local396.aClass8_Sub8_Sub2_1.method8546(local25);
				local396.aClass8_Sub8_Sub2_1.method8573(Static295.aClass209_1.method5482(82) ? 1 : 0);
				Static262.method4604(local396);
				Static46.method1367(true, 0, -2, local377.anIntArray436[0], local377.method6692(), local377.method6692(), 0, local377.anIntArray435[0]);
			}
		}
		if (local21 == 8) {
			local377 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local25];
			if (local377 != null) {
				Static108.anInt2818 = arg2;
				Static459.anInt8403 = 0;
				Static85.anInt8479 = 2;
				Static340.anInt6655 = arg0;
				local396 = Static51.method1418(Static291.aClass257_55, Static608.aClass336_1);
				local396.aClass8_Sub8_Sub2_1.method8535(Static295.aClass209_1.method5482(82) ? 1 : 0);
				local396.aClass8_Sub8_Sub2_1.method8548(local25);
				Static262.method4604(local396);
				Static46.method1367(true, 0, -2, local377.anIntArray436[0], local377.method6692(), local377.method6692(), 0, local377.anIntArray435[0]);
			}
		}
		if (local21 == 11) {
			Static340.anInt6655 = arg0;
			Static108.anInt2818 = arg2;
			Static459.anInt8403 = 0;
			Static85.anInt8479 = 2;
			local94 = Static51.method1418(Static38.aClass257_11, Static608.aClass336_1);
			local94.aClass8_Sub8_Sub2_1.method8543(Static401.anInt7697);
			local94.aClass8_Sub8_Sub2_1.method8572(Static391.anInt7576);
			local94.aClass8_Sub8_Sub2_1.method8572(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt8075);
			local94.aClass8_Sub8_Sub2_1.method8535(Static295.aClass209_1.method5482(82) ? 1 : 0);
			local94.aClass8_Sub8_Sub2_1.method8572(Static230.anInt5229);
			Static262.method4604(local94);
		}
		if (local21 == 30) {
			local303 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local25);
			if (local303 != null) {
				Static340.anInt6655 = arg0;
				Static85.anInt8479 = 2;
				local308 = local303.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				Static459.anInt8403 = 0;
				Static108.anInt2818 = arg2;
				local325 = Static51.method1418(Static360.aClass257_65, Static608.aClass336_1);
				local325.aClass8_Sub8_Sub2_1.method8572(local25);
				local325.aClass8_Sub8_Sub2_1.method8562(Static295.aClass209_1.method5482(82) ? 1 : 0);
				Static262.method4604(local325);
				Static46.method1367(true, 0, -2, local308.anIntArray436[0], local308.method6692(), local308.method6692(), 0, local308.anIntArray435[0]);
			}
		}
		if (local21 == 17) {
			local377 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local25];
			if (local377 != null) {
				Static459.anInt8403 = 0;
				Static108.anInt2818 = arg2;
				Static340.anInt6655 = arg0;
				Static85.anInt8479 = 2;
				local396 = Static51.method1418(Static394.aClass257_74, Static608.aClass336_1);
				local396.aClass8_Sub8_Sub2_1.method8562(Static295.aClass209_1.method5482(82) ? 1 : 0);
				local396.aClass8_Sub8_Sub2_1.method8548(local25);
				Static262.method4604(local396);
				Static46.method1367(true, 0, -2, local377.anIntArray436[0], local377.method6692(), local377.method6692(), 0, local377.anIntArray435[0]);
			}
		}
		if (local21 == 3) {
			local377 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local25];
			if (local377 != null) {
				Static340.anInt6655 = arg0;
				Static108.anInt2818 = arg2;
				Static85.anInt8479 = 2;
				Static459.anInt8403 = 0;
				local396 = Static51.method1418(Static376.aClass257_69, Static608.aClass336_1);
				local396.aClass8_Sub8_Sub2_1.method8551(local25);
				local396.aClass8_Sub8_Sub2_1.method8573(Static295.aClass209_1.method5482(82) ? 1 : 0);
				Static262.method4604(local396);
				Static46.method1367(true, 0, -2, local377.anIntArray436[0], local377.method6692(), local377.method6692(), 0, local377.anIntArray435[0]);
			}
		}
		if (local21 == 1011) {
			Static85.anInt8479 = 2;
			Static459.anInt8403 = 0;
			Static108.anInt2818 = arg2;
			Static340.anInt6655 = arg0;
			local303 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local25);
			if (local303 != null) {
				local308 = local303.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				@Pc(2288) Class300 local2288 = local308.aClass300_1;
				if (local2288.anIntArray498 != null) {
					local2288 = local2288.method7306(Static420.aClass77_1);
				}
				if (local2288 != null) {
					@Pc(2307) Class8_Sub31 local2307 = Static51.method1418(Static108.aClass257_23, Static608.aClass336_1);
					local2307.aClass8_Sub8_Sub2_1.method8548(local2288.anInt8898);
					Static262.method4604(local2307);
				}
			}
		}
		if (local21 == 59) {
			local303 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local25);
			if (local303 != null) {
				Static340.anInt6655 = arg0;
				local308 = local303.aClass15_Sub1_Sub2_Sub2_Sub2_2;
				Static459.anInt8403 = 0;
				Static85.anInt8479 = 2;
				Static108.anInt2818 = arg2;
				local325 = Static51.method1418(Static75.aClass257_16, Static608.aClass336_1);
				local325.aClass8_Sub8_Sub2_1.method8546(local25);
				local325.aClass8_Sub8_Sub2_1.method8547(Static401.anInt7697);
				local325.aClass8_Sub8_Sub2_1.method8551(Static230.anInt5229);
				local325.aClass8_Sub8_Sub2_1.method8535(Static295.aClass209_1.method5482(82) ? 1 : 0);
				local325.aClass8_Sub8_Sub2_1.method8572(Static391.anInt7576);
				Static262.method4604(local325);
				Static46.method1367(true, 0, -2, local308.anIntArray436[0], local308.method6692(), local308.method6692(), 0, local308.anIntArray435[0]);
			}
		}
		if (local21 == 18) {
			local377 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local25];
			if (local377 != null) {
				Static108.anInt2818 = arg2;
				Static85.anInt8479 = 2;
				Static340.anInt6655 = arg0;
				Static459.anInt8403 = 0;
				local396 = Static51.method1418(Static38.aClass257_11, Static608.aClass336_1);
				local396.aClass8_Sub8_Sub2_1.method8543(Static401.anInt7697);
				local396.aClass8_Sub8_Sub2_1.method8572(Static391.anInt7576);
				local396.aClass8_Sub8_Sub2_1.method8572(local25);
				local396.aClass8_Sub8_Sub2_1.method8535(Static295.aClass209_1.method5482(82) ? 1 : 0);
				local396.aClass8_Sub8_Sub2_1.method8572(Static230.anInt5229);
				Static262.method4604(local396);
				Static46.method1367(true, 0, -2, local377.anIntArray436[0], local377.method6692(), local377.method6692(), 0, local377.anIntArray435[0]);
			}
		}
		if (local21 == 1012 || local21 == 1001 || local21 == 1008 || local21 == 1007 || local21 == 1006) {
			Static277.method4713(local25, local15, local21);
		}
		if (Static147.aBoolean270) {
			Static8.method91();
		}
		if (Static69.aClass331_12 != null && Static398.anInt7663 == 0) {
			Static86.method2113(Static69.aClass331_12);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!cs;")
	public static Class15_Sub1_Sub2 method7984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class152 local14 = local7.aClass152_2; local14 != null; local14 = local14.aClass152_3) {
			@Pc(18) Class15_Sub1_Sub2 local18 = local14.aClass15_Sub1_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort105 == arg1 && local18.aShort103 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
