import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!kr;")
	public static Class171 aClass171_126;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	public static int anInt7258 = -50;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	public static void method6078() {
		Static487.aClass122_8.E(Static24.anInt539, Static544.aClass1_Sub22_Sub1_1.aBoolean391 ? Static184.anInt7343 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method6079(@OriginalArg(0) Class122 arg0) {
		for (@Pc(1) int local1 = Static227.anInt4494; local1 < Static388.anInt7032; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static93.anInt1898; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static382.anInt6965; local7++) {
					@Pc(16) Class255 local16 = Static242.aClass255ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class49_Sub1 local21 = local16.aClass49_Sub1_3;
						@Pc(24) Class49_Sub1 local24 = local16.aClass49_Sub1_2;
						if (local21 != null && local21.method7451()) {
							Static117.method1985(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7451()) {
								Static117.method1985(arg0, local24, local1, local4, local7, 1, 1);
								local24.method7456(0, 0, arg0, 0, false, local21);
								local24.method7457();
							}
							local21.method7457();
						}
						for (@Pc(70) Class63 local70 = local16.aClass63_3; local70 != null; local70 = local70.aClass63_1) {
							@Pc(74) Class49_Sub2 local74 = local70.aClass49_Sub2_1;
							if (local74 != null && local74.method7451()) {
								Static117.method1985(arg0, local74, local1, local4, local7, local74.aShort115 + 1 - local74.aShort117, local74.aShort118 - local74.aShort116 + 1);
								local74.method7457();
							}
						}
						@Pc(111) Class49_Sub5 local111 = local16.aClass49_Sub5_2;
						if (local111 != null && local111.method7451()) {
							Static333.method7514(arg0, local111, local1, local4, local7);
							local111.method7457();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!qa;J)V")
	public static void method6080(@OriginalArg(1) Class122 arg0, @OriginalArg(2) long arg1) {
		Static56.anInt1113 = 0;
		Static132.anInt2629 = Static382.anInt6971;
		Static382.anInt6971 = 0;
		@Pc(22) long local22 = Static60.method1119();
		for (@Pc(27) Class72_Sub4 local27 = (Class72_Sub4) Static214.aClass299_2.method7030(); local27 != null; local27 = (Class72_Sub4) Static214.aClass299_2.method7031()) {
			if (local27.method4536(arg0, arg1)) {
				Static56.anInt1113++;
			}
		}
		if (Static443.aBoolean550 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static214.aClass299_2.method7032() + ", running: " + Static56.anInt1113 + ". Particles: " + Static382.anInt6971 + ". Time taken: " + (Static60.method1119() - local22) + "ms");
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method6081(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static438.anInt7729 = 1;
		Static418.anInt7355 = -1;
		Static524.method7186(arg1, false, arg0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public static void method6082() {
		Static429.aClass171_146.anInt4998 = 1;
		Static246.method4198();
		Static390.aBoolean422 = true;
		Static297.aBoolean404 = true;
		Static335.method5110();
		for (@Pc(7032) int local7032 = 0; local7032 < Static384.aClass268Array1.length; local7032++) {
			Static384.aClass268Array1[local7032] = null;
		}
		Static431.aBoolean542 = false;
		Static533.method7376();
		Static330.anInt6001 = (int) (Math.random() * 100.0D) - 50;
		Static316.anInt5814 = (int) (Math.random() * 30.0D) - 20;
		Static265.anInt5084 = (int) (Math.random() * 120.0D) - 60;
		Static232.anInt4618 = (int) (Math.random() * 80.0D) - 40;
		Static220.anInt4348 = (int) (Math.random() * 110.0D) - 55;
		Static404.aFloat156 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static461.method6515();
		for (@Pc(7103) int local7103 = 0; local7103 < 2048; local7103++) {
			Static349.aClass49_Sub2_Sub2_Sub1Array1[local7103] = null;
		}
		Static350.anInt6254 = 0;
		Static157.anInt4503 = 0;
		Static380.aClass17_29.method734();
		Static522.aClass37_104.method967();
		Static266.aClass37_105.method967();
		Static265.aClass299_4.method7028();
		Static255.aClass17_20.method734();
		Static191.aClass37_41 = new Class37();
		Static251.aClass119_1.method2649();
		Static542.method7530();
		Static410.anInt7289 = 0;
		Static263.anInt5055 = 0;
		Static521.anInt8752 = 0;
		Static488.anInt8138 = 0;
		Static385.anInt6976 = 0;
		Static127.anInt4399 = 0;
		Static282.anInt7759 = 0;
		Static46.anInt933 = 0;
		Static119.anInt2374 = 0;
		Static539.anInt9126 = 0;
		for (@Pc(7169) int local7169 = 0; local7169 < Static42.anIntArray119.length; local7169++) {
			if (!Static303.aBooleanArray39[local7169]) {
				Static42.anIntArray119[local7169] = -1;
			}
		}
		if (Static170.anInt3050 != -1) {
			Static210.method3584(Static170.anInt3050);
		}
		for (@Pc(7195) Class1_Sub35 local7195 = (Class1_Sub35) Static468.aClass17_36.method735(); local7195 != null; local7195 = (Class1_Sub35) Static468.aClass17_36.method740()) {
			if (!local7195.method7527()) {
				local7195 = (Class1_Sub35) Static468.aClass17_36.method735();
				if (local7195 == null) {
					break;
				}
			}
			Static217.method7162(false, local7195, true);
		}
		Static170.anInt3050 = -1;
		Static468.aClass17_36 = new Class17(8);
		Static141.method2294();
		Static64.aClass156_3 = null;
		for (@Pc(7239) int local7239 = 0; local7239 < 8; local7239++) {
			Static457.aStringArray41[local7239] = null;
			Static284.aBooleanArray35[local7239] = false;
			Static108.anIntArray216[local7239] = -1;
		}
		Static288.method4640();
		Static81.aBoolean92 = true;
		for (@Pc(7267) int local7267 = 0; local7267 < 100; local7267++) {
			Static3.aBooleanArray1[local7267] = true;
		}
		for (@Pc(7281) int local7281 = 0; local7281 < 6; local7281++) {
			Static313.aClass142Array1[local7281] = new Class142();
		}
		for (@Pc(7297) int local7297 = 0; local7297 < 25; local7297++) {
			Static532.anIntArray828[local7297] = 0;
			Static3.anIntArray16[local7297] = 0;
			Static533.anIntArray830[local7297] = 0;
		}
		Static283.method4575();
		Static282.aBoolean555 = true;
		Static283.aShortArray93 = Static344.aShortArray115 = Static308.aShortArray111 = Static5.aShortArray2 = new short[256];
		Static485.aString75 = Static384.aClass306_95.method7165(Static179.anInt3168);
		Static544.aClass1_Sub22_Sub1_1.aBoolean401 = false;
		Static544.aClass1_Sub22_Sub1_1.aBoolean399 = false;
		Static475.anInt6155 = 0;
		Static14.method427();
		Static176.method2654();
		Static211.aLong173 = 0L;
		Static38.aClass1_Sub44_1 = null;
		Static429.aClass171_146.anInt4998 = 2;
	}
}
