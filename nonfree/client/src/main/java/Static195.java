import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Lclient!jg;", line = 16)
	public static Class2_Sub20 method3714() {
		if (Class216.aClass135_36 == null || Class84.aClass75_1 == null) {
			return null;
		}
		Class84.aClass75_1.method2182(Class216.aClass135_36);
		@Pc(18) Class2_Sub20 local18 = (Class2_Sub20) Class84.aClass75_1.method2183();
		if (local18 == null) {
			return null;
		} else {
			@Pc(33) Class164 local33 = Static321.aClass125_4.method3380(local18.anInt2944);
			return local33 != null && local33.aBoolean302 && local33.method4181(Static321.anInterface11_2) ? local18 : Static108.method3830();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!wm;Lclient!ci;)V", line = 47)
	public static void method3715(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Interface2 arg1) {
		if (Static321.aClass2_Sub2_Sub17_3 == null) {
			return;
		}
		if (Class235.anInt6569 < 10) {
			if (!Static321.aClass197_85.method5073(Static321.aClass2_Sub2_Sub17_3.aString67)) {
				Class235.anInt6569 = Static363.aClass197_66.method5086(Static321.aClass2_Sub2_Sub17_3.aString67) / 10;
				return;
			}
			Static360.method6032();
			Class235.anInt6569 = 10;
		}
		if (Class235.anInt6569 == 10) {
			Static321.anInt6045 = Static321.aClass2_Sub2_Sub17_3.anInt6857 >> 6 << 6;
			Static321.anInt6043 = Static321.aClass2_Sub2_Sub17_3.anInt6850 >> 6 << 6;
			Static321.anInt6044 = (Static321.aClass2_Sub2_Sub17_3.anInt6855 >> 6 << 6) + 64 - Static321.anInt6045;
			Static321.anInt6040 = (Static321.aClass2_Sub2_Sub17_3.anInt6861 >> 6 << 6) + 64 - Static321.anInt6043;
			@Pc(80) int[] local80 = new int[3];
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = -1;
			if (Static321.aClass2_Sub2_Sub17_3.method6146(Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78, local80, Static154.anInt3136 + (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 >> 7), Static139.anInt2716 + (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 >> 7))) {
				local82 = local80[1] - Static321.anInt6045;
				local84 = local80[2] - Static321.anInt6043;
			}
			if (!Class2_Sub3_Sub29.aBoolean399 && local82 >= 0 && Static321.anInt6044 > local82 && local84 >= 0 && Static321.anInt6040 > local84) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static89.anInt2001 = local84;
				Static142.anInt2769 = local82;
			} else if (Class128.anInt3432 == -1 || Class15_Sub1.anInt519 == -1) {
				Static321.aClass2_Sub2_Sub17_3.method6152(Static321.aClass2_Sub2_Sub17_3.anInt6859 >> 14 & 0x3FFF, Static321.aClass2_Sub2_Sub17_3.anInt6859 & 0x3FFF, local80);
				Static89.anInt2001 = local80[2] - Static321.anInt6043;
				Static142.anInt2769 = local80[1] - Static321.anInt6045;
			} else {
				Static321.aClass2_Sub2_Sub17_3.method6152(Class128.anInt3432, Class15_Sub1.anInt519, local80);
				Class15_Sub1.anInt519 = -1;
				Class128.anInt3432 = -1;
				Class2_Sub3_Sub29.aBoolean399 = false;
				if (local80 != null) {
					Static89.anInt2001 = local80[2] - Static321.anInt6043;
					Static142.anInt2769 = local80[1] - Static321.anInt6045;
				}
			}
			if (Static321.aClass2_Sub2_Sub17_3.anInt6862 == 37) {
				Static321.aFloat71 = 3.0F;
				Static321.aFloat72 = 3.0F;
			} else if (Static321.aClass2_Sub2_Sub17_3.anInt6862 == 50) {
				Static321.aFloat71 = 4.0F;
				Static321.aFloat72 = 4.0F;
			} else if (Static321.aClass2_Sub2_Sub17_3.anInt6862 == 75) {
				Static321.aFloat71 = 6.0F;
				Static321.aFloat72 = 6.0F;
			} else if (Static321.aClass2_Sub2_Sub17_3.anInt6862 == 100) {
				Static321.aFloat71 = 8.0F;
				Static321.aFloat72 = 8.0F;
			} else if (Static321.aClass2_Sub2_Sub17_3.anInt6862 == 200) {
				Static321.aFloat71 = 16.0F;
				Static321.aFloat72 = 16.0F;
			} else {
				Static321.aFloat71 = 8.0F;
				Static321.aFloat72 = 8.0F;
			}
			Static321.anInt6035 = (int) Static321.aFloat71 >> 1;
			Static321.aByteArrayArrayArray15 = Static240.method6019(Static321.anInt6035);
			Static275.method2424();
			Static321.method5520();
			Static184.aClass135_24 = new Class135();
			Class216.anInt6036 += (int) (Math.random() * 5.0D) - 2;
			if (Class216.anInt6036 < -8) {
				Class216.anInt6036 = -8;
			}
			Class216.anInt6037 += (int) (Math.random() * 5.0D) - 2;
			if (Class216.anInt6036 > 8) {
				Class216.anInt6036 = 8;
			}
			if (Class216.anInt6037 < -16) {
				Class216.anInt6037 = -16;
			}
			if (Class216.anInt6037 > 16) {
				Class216.anInt6037 = 16;
			}
			Static321.method5529(arg1, Class216.anInt6036 >> 2 << 10, Class216.anInt6037 >> 1);
			Static321.aClass125_4.method3378(256, 1024);
			Static321.aClass104_4.method2704(256, 256);
			Static321.aClass202_3.method5162(4096);
			Static299.aClass128_1.method3393(256);
			Class235.anInt6569 = 20;
		} else if (Class235.anInt6569 == 20) {
			Static151.method2974(true);
			Static321.method5522(arg0, Class216.anInt6036, Class216.anInt6037);
			Class235.anInt6569 = 60;
			Static151.method2974(true);
			Static133.method2664();
		} else if (Class235.anInt6569 == 60) {
			if (Static321.aClass197_85.method5102(Static321.aClass2_Sub2_Sub17_3.aString67 + "_staticelements")) {
				if (!Static321.aClass197_85.method5073(Static321.aClass2_Sub2_Sub17_3.aString67 + "_staticelements")) {
					return;
				}
				Static321.aClass103_5 = Static294.method5553(Static321.aClass197_85, Static321.aClass2_Sub2_Sub17_3.aString67 + "_staticelements", Class144.aBoolean241);
			} else {
				Static321.aClass103_5 = new Class103(0);
			}
			Static321.method5512();
			Class235.anInt6569 = 70;
			Static151.method2974(true);
			Static133.method2664();
		} else if (Class235.anInt6569 == 70) {
			Static70.aClass113_4 = new Class113(arg0, 11, true, Static21.aCanvas1);
			Class235.anInt6569 = 73;
			Static151.method2974(true);
			Static133.method2664();
		} else if (Class235.anInt6569 == 73) {
			Static100.aClass113_5 = new Class113(arg0, 12, true, Static21.aCanvas1);
			Class235.anInt6569 = 76;
			Static151.method2974(true);
			Static133.method2664();
		} else if (Class235.anInt6569 == 76) {
			Static2.aClass113_1 = new Class113(arg0, 14, true, Static21.aCanvas1);
			Class235.anInt6569 = 79;
			Static151.method2974(true);
			Static133.method2664();
		} else if (Class235.anInt6569 == 79) {
			Static164.aClass113_6 = new Class113(arg0, 17, true, Static21.aCanvas1);
			Class235.anInt6569 = 82;
			Static151.method2974(true);
			Static133.method2664();
		} else if (Class235.anInt6569 == 82) {
			Static230.aClass113_8 = new Class113(arg0, 19, true, Static21.aCanvas1);
			Class235.anInt6569 = 85;
			Static151.method2974(true);
			Static133.method2664();
		} else if (Class235.anInt6569 == 85) {
			Static29.aClass113_3 = new Class113(arg0, 22, true, Static21.aCanvas1);
			Class235.anInt6569 = 88;
			Static151.method2974(true);
			Static133.method2664();
		} else if (Class235.anInt6569 == 88) {
			Static26.aClass113_2 = new Class113(arg0, 26, true, Static21.aCanvas1);
			Class235.anInt6569 = 91;
			Static151.method2974(true);
			Static133.method2664();
		} else {
			Static344.aClass113_9 = new Class113(arg0, 30, true, Static21.aCanvas1);
			Class235.anInt6569 = 100;
			Static151.method2974(true);
			Static133.method2664();
			System.gc();
		}
	}
}
