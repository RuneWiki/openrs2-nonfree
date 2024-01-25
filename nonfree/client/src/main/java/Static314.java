import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!u", name = "R", descriptor = "Z")
	public static boolean aBoolean451;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_332 = new Class159(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	public static void method5183() {
		Static15.aClass4_Sub11_Sub1_2.method706(116);
		Static15.aClass4_Sub11_Sub1_2.method3402(Static286.anInt6705);
	}

	@OriginalMember(owner = "client!u", name = "i", descriptor = "(B)V")
	public static void method5185() {
		if (Static76.method1750() || Static263.anInt6816 == Static12.anInt267) {
			Static86.method2105(Static274.aClass47_9);
			if (Static354.anInt6742 != Static12.anInt267) {
				Static98.method2235();
			}
		} else {
			Static120.method2528(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], false, Static36.anInt1007, Static103.anInt2592, false, Static12.anInt267, Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0]);
		}
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	public static void method5186() {
		@Pc(5) Class198 local5 = Static288.aClass198_207;
		synchronized (Static288.aClass198_207) {
			Static288.aClass198_207.method5213();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!vq;BLclient!bk;)V")
	public static void method5187(@OriginalArg(0) Class47 arg0, @OriginalArg(2) Interface3 arg1) {
		if (Static54.aClass4_Sub4_Sub11_3 == null) {
			return;
		}
		if (Static72.anInt1882 < 10) {
			if (!Static54.aClass193_80.method5040(Static54.aClass4_Sub4_Sub11_3.aString49)) {
				Static72.anInt1882 = Static72.aClass193_20.method5044(Static54.aClass4_Sub4_Sub11_3.aString49) / 10;
				return;
			}
			Static258.method4498();
			Static72.anInt1882 = 10;
		}
		if (Static72.anInt1882 == 10) {
			Static54.anInt4745 = Static54.aClass4_Sub4_Sub11_3.anInt4359 >> 6 << 6;
			Static54.anInt4748 = Static54.aClass4_Sub4_Sub11_3.anInt4348 >> 6 << 6;
			Static54.anInt4749 = (Static54.aClass4_Sub4_Sub11_3.anInt4354 >> 6 << 6) + 64 - Static54.anInt4745;
			Static54.anInt4747 = (Static54.aClass4_Sub4_Sub11_3.anInt4360 >> 6 << 6) + 64 - Static54.anInt4748;
			@Pc(83) int[] local83 = new int[3];
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = -1;
			if (Static54.aClass4_Sub4_Sub11_3.method3892(local83, Static286.anInt6699 + (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 >> 7), Static12.anInt267, Static136.anInt3193 + (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 >> 7))) {
				local85 = local83[1] - Static54.anInt4745;
				local87 = local83[2] - Static54.anInt4748;
			}
			if (!Static254.aBoolean195 && local85 >= 0 && local85 < Static54.anInt4749 && local87 >= 0 && local87 < Static54.anInt4747) {
				local85 += (int) (Math.random() * 10.0D) - 5;
				local87 += (int) (Math.random() * 10.0D) - 5;
				Static8.anInt200 = local85;
				Static60.anInt1574 = local87;
			} else if (Static101.anInt6799 == -1 || Static101.anInt6798 == -1) {
				Static54.aClass4_Sub4_Sub11_3.method3899(Static54.aClass4_Sub4_Sub11_3.anInt4357 & 0x3FFF, Static54.aClass4_Sub4_Sub11_3.anInt4357 >> 14 & 0x3FFF, local83);
				Static60.anInt1574 = local83[2] - Static54.anInt4748;
				Static8.anInt200 = local83[1] - Static54.anInt4745;
			} else {
				Static54.aClass4_Sub4_Sub11_3.method3899(Static101.anInt6798, Static101.anInt6799, local83);
				Static254.aBoolean195 = false;
				Static101.anInt6798 = -1;
				Static101.anInt6799 = -1;
				if (local83 != null) {
					Static60.anInt1574 = local83[2] - Static54.anInt4748;
					Static8.anInt200 = local83[1] - Static54.anInt4745;
				}
			}
			if (Static54.aClass4_Sub4_Sub11_3.anInt4355 == 37) {
				Static54.aFloat69 = 3.0F;
				Static54.aFloat70 = 3.0F;
			} else if (Static54.aClass4_Sub4_Sub11_3.anInt4355 == 50) {
				Static54.aFloat69 = 4.0F;
				Static54.aFloat70 = 4.0F;
			} else if (Static54.aClass4_Sub4_Sub11_3.anInt4355 == 75) {
				Static54.aFloat69 = 6.0F;
				Static54.aFloat70 = 6.0F;
			} else if (Static54.aClass4_Sub4_Sub11_3.anInt4355 == 100) {
				Static54.aFloat69 = 8.0F;
				Static54.aFloat70 = 8.0F;
			} else if (Static54.aClass4_Sub4_Sub11_3.anInt4355 == 200) {
				Static54.aFloat69 = 16.0F;
				Static54.aFloat70 = 16.0F;
			} else {
				Static54.aFloat69 = 8.0F;
				Static54.aFloat70 = 8.0F;
			}
			Static54.anInt4735 = (int) Static54.aFloat69 >> 1;
			Static54.aByteArrayArrayArray11 = Static101.method5688(Static54.anInt4735);
			Static95.method2223();
			Static54.method4164();
			Static46.aClass116_4 = new Class116();
			Static54.anInt4736 += (int) (Math.random() * 5.0D) - 2;
			if (Static54.anInt4736 < -8) {
				Static54.anInt4736 = -8;
			}
			Static54.anInt4737 += (int) (Math.random() * 5.0D) - 2;
			if (Static54.anInt4736 > 8) {
				Static54.anInt4736 = 8;
			}
			if (Static54.anInt4737 < -16) {
				Static54.anInt4737 = -16;
			}
			if (Static54.anInt4737 > 16) {
				Static54.anInt4737 = 16;
			}
			Static54.method4173(arg1, Static54.anInt4736 >> 2 << 10, Static54.anInt4737 >> 1);
			Static277.method4743(1024, 256);
			Static213.method3912(256, 256);
			Static58.method1230(4096);
			Static45.method918(256);
			Static72.anInt1882 = 20;
		} else if (Static72.anInt1882 == 20) {
			Static310.method5118(true);
			Static54.method4177(arg0, Static54.anInt4736, Static54.anInt4737);
			Static72.anInt1882 = 60;
			Static310.method5118(true);
			Static150.method3016();
		} else if (Static72.anInt1882 == 60) {
			if (Static54.aClass193_80.method5045(Static54.aClass4_Sub4_Sub11_3.aString49 + "_staticelements")) {
				if (!Static54.aClass193_80.method5040(Static54.aClass4_Sub4_Sub11_3.aString49 + "_staticelements")) {
					return;
				}
				Static54.aClass137_3 = Static44.method881(Static121.aBoolean369, Static54.aClass4_Sub4_Sub11_3.aString49 + "_staticelements", Static54.aClass193_80);
			} else {
				Static54.aClass137_3 = new Class137(0);
			}
			Static54.method4161();
			Static72.anInt1882 = 70;
			Static310.method5118(true);
			Static150.method3016();
		} else if (Static72.anInt1882 == 70) {
			Static197.aClass189_8 = new Class189(arg0, 11, true, Static300.aCanvas5);
			Static72.anInt1882 = 73;
			Static310.method5118(true);
			Static150.method3016();
		} else if (Static72.anInt1882 == 73) {
			Static75.aClass189_1 = new Class189(arg0, 12, true, Static300.aCanvas5);
			Static72.anInt1882 = 76;
			Static310.method5118(true);
			Static150.method3016();
		} else if (Static72.anInt1882 == 76) {
			Static202.aClass189_9 = new Class189(arg0, 14, true, Static300.aCanvas5);
			Static72.anInt1882 = 79;
			Static310.method5118(true);
			Static150.method3016();
		} else if (Static72.anInt1882 == 79) {
			Static117.aClass189_4 = new Class189(arg0, 17, true, Static300.aCanvas5);
			Static72.anInt1882 = 82;
			Static310.method5118(true);
			Static150.method3016();
		} else if (Static72.anInt1882 == 82) {
			Static86.aClass189_3 = new Class189(arg0, 19, true, Static300.aCanvas5);
			Static72.anInt1882 = 85;
			Static310.method5118(true);
			Static150.method3016();
		} else if (Static72.anInt1882 == 85) {
			Static151.aClass189_6 = new Class189(arg0, 22, true, Static300.aCanvas5);
			Static72.anInt1882 = 88;
			Static310.method5118(true);
			Static150.method3016();
		} else if (Static72.anInt1882 == 88) {
			Static165.aClass189_7 = new Class189(arg0, 26, true, Static300.aCanvas5);
			Static72.anInt1882 = 91;
			Static310.method5118(true);
			Static150.method3016();
		} else {
			Static80.aClass189_2 = new Class189(arg0, 30, true, Static300.aCanvas5);
			Static72.anInt1882 = 100;
			Static310.method5118(true);
			Static150.method3016();
			System.gc();
		}
	}
}
