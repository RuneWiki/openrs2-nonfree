import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "Lclient!ha;")
	public static Class87 aClass87_14;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Lclient!cu;")
	public static Class61 aClass61_3;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_14 = new Class266(1, 7);

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "Lclient!dm;")
	public static Class78 aClass78_10 = null;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)[B")
	public static byte[] method7689(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub5_Sub9 local15 = (Class2_Sub5_Sub9) Static195.aClass117_9.method3041((long) arg0);
		if (local15 == null) {
			@Pc(20) byte[] local20 = new byte[512];
			@Pc(26) Random local26 = new Random((long) arg0);
			for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
				local20[local28] = (byte) local28;
			}
			for (@Pc(42) int local42 = 0; local42 < 255; local42++) {
				@Pc(48) int local48 = 255 - local42;
				@Pc(53) int local53 = Static610.method8343(local26, local48);
				@Pc(57) byte local57 = local20[local53];
				local20[local53] = local20[local48];
				local20[local48] = local20[511 - local42] = local57;
			}
			local15 = new Class2_Sub5_Sub9(local20);
			Static195.aClass117_9.method3042((long) arg0, local15);
		}
		return local15.aByteArray39;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public static void method7690() {
		if (Static585.anInt9601 == 0 || Static585.anInt9601 == 6) {
			return;
		}
		try {
			@Pc(23) short local23;
			if (Static531.anInt8871 == 0) {
				local23 = 250;
			} else {
				local23 = 2000;
			}
			if (local23 < ++Static225.anInt4618) {
				if (Static439.aClass210_1 != null) {
					Static439.aClass210_1.method8030();
					Static439.aClass210_1 = null;
				}
				if (Static531.anInt8871 >= 3) {
					Static585.anInt9601 = 0;
					Static163.method3036(-5);
					return;
				}
				if (Static606.anInt9911 == 2) {
					Static460.aClass322_3.method7606();
				} else {
					Static139.aClass322_2.method7606();
				}
				Static531.anInt8871++;
				Static585.anInt9601 = 1;
				Static225.anInt4618 = 0;
			}
			if (Static585.anInt9601 == 1) {
				if (Static606.anInt9911 == 2) {
					Static84.aClass26_10 = Static460.aClass322_3.method7607(Static375.aClass359_4);
				} else {
					Static84.aClass26_10 = Static139.aClass322_2.method7607(Static375.aClass359_4);
				}
				Static585.anInt9601 = 2;
			}
			if (Static585.anInt9601 == 2) {
				if (Static84.aClass26_10.anInt762 == 2) {
					throw new IOException();
				}
				if (Static84.aClass26_10.anInt762 != 1) {
					return;
				}
				Static439.aClass210_1 = Static24.method593((Socket) Static84.aClass26_10.anObject3);
				Static84.aClass26_10 = null;
				@Pc(129) long local129 = Static318.aLong172 = Static582.method8037(Static187.aString46);
				@Pc(136) int local136 = (int) (local129 >> 16 & 0x1FL);
				Static44.method862();
				@Pc(143) Class2_Sub50 local143 = Static79.method7505();
				local143.aClass2_Sub34_Sub2_2.method6894(Static10.aClass295_1.anInt8334);
				local143.aClass2_Sub34_Sub2_2.method6894(local136);
				Static311.method4754(local143);
				Static73.method1380();
				Static585.anInt9601 = 3;
			}
			@Pc(189) int local189;
			if (Static585.anInt9601 == 3) {
				if (!Static439.aClass210_1.method8029(1)) {
					return;
				}
				Static439.aClass210_1.method8031(0, 1, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
				local189 = Static313.aClass2_Sub34_Sub2_1.aByteArray77[0] & 0xFF;
				if (local189 != 0) {
					Static585.anInt9601 = 0;
					Static163.method3036(local189);
					Static439.aClass210_1.method8030();
					Static439.aClass210_1 = null;
					Static33.method756();
					return;
				}
				Static585.anInt9601 = 4;
			}
			if (Static585.anInt9601 == 4) {
				if (!Static439.aClass210_1.method8029(8)) {
					return;
				}
				Static439.aClass210_1.method8031(0, 8, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
				Static313.aClass2_Sub34_Sub2_1.anInt8188 = 0;
				Static620.aLong279 = Static313.aClass2_Sub34_Sub2_1.method6877();
				@Pc(240) Class2_Sub34 local240 = new Class2_Sub34(518);
				@Pc(243) int[] local243 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static620.aLong279 >> 32), (int) Static620.aLong279 };
				local240.method6894(10);
				local240.method6864(local243[0]);
				local240.method6864(local243[1]);
				local240.method6864(local243[2]);
				local240.method6864(local243[3]);
				local240.method6871(0L);
				local240.method6918(Static213.aString15);
				local240.method6871(Static163.aLong100);
				local240.method6871(Static30.aLong191);
				local240.method6895(Static3.aBigInteger1, Static67.aBigInteger2);
				Static44.method862();
				@Pc(329) Class2_Sub50 local329 = Static79.method7505();
				@Pc(332) Class2_Sub34_Sub2 local332 = local329.aClass2_Sub34_Sub2_2;
				@Pc(349) int local349;
				@Pc(364) int local364;
				if (Static606.anInt9911 == 2) {
					if (Static538.anInt8985 == 13) {
						local332.method6894(Static10.aClass295_5.anInt8334);
					} else {
						local332.method6894(Static10.aClass295_3.anInt8334);
					}
					local332.method6854(0);
					local349 = local332.anInt8188;
					local332.method6864(629);
					local332.method6914(0, local240.aByteArray77, local240.anInt8188);
					local364 = local332.anInt8188;
					local332.method6918(Static187.aString46);
					local332.method6894(Static288.anInt5415);
					local332.method6894(Static501.method7132());
					local332.method6854(Static571.anInt9399);
					local332.method6854(Static585.anInt9606);
					local332.method6894(Static404.aClass2_Sub13_2.aClass33_Sub9_2.method3852());
					Static195.method7971(local332);
					local332.method6918(Static538.aString82);
					local332.method6864(Static619.anInt10076);
					@Pc(494) Class2_Sub34 local494 = Static404.aClass2_Sub13_2.method1376();
					local332.method6894(local494.anInt8188);
					local332.method6914(0, local494.aByteArray77, local494.anInt8188);
					Static141.aBoolean267 = true;
					@Pc(516) Class2_Sub34 local516 = new Class2_Sub34(Static620.aClass2_Sub23_1.method3054());
					Static620.aClass2_Sub23_1.method3051(local516);
					local332.method6914(0, local516.aByteArray77, local516.aByteArray77.length);
					local332.method6854(Static43.anInt967);
					local332.method6871(Static541.aLong249);
					local332.method6894(Static484.aString76 == null ? 0 : 1);
					if (Static484.aString76 != null) {
						local332.method6918(Static484.aString76);
					}
					local332.method6894(Static451.method6637("jagtheora") ? 1 : 0);
					Static305.method4710(local332);
					local332.method6892(local332.anInt8188, local243, local364);
					local332.method6862(local332.anInt8188 - local349);
				} else {
					local332.method6894(Static10.aClass295_6.anInt8334);
					local332.method6854(0);
					local349 = local332.anInt8188;
					local332.method6864(629);
					local332.method6914(0, local240.aByteArray77, local240.anInt8188);
					local364 = local332.anInt8188;
					local332.method6918(Static187.aString46);
					local332.method6894(Static499.aClass63_15.anInt1690);
					local332.method6894(Static377.anInt6756);
					Static195.method7971(local332);
					local332.method6918(Static538.aString82);
					local332.method6864(Static619.anInt10076);
					Static305.method4710(local332);
					local332.method6892(local332.anInt8188, local243, local364);
					local332.method6862(local332.anInt8188 - local349);
				}
				Static311.method4754(local329);
				Static73.method1380();
				Static610.aClass310_2 = new Class310(local243);
				for (local349 = 0; local349 < 4; local349++) {
					local243[local349] += 50;
				}
				Static313.aClass2_Sub34_Sub2_1.method6926(local243);
				Static585.anInt9601 = 5;
			}
			if (Static585.anInt9601 == 5) {
				if (!Static439.aClass210_1.method8029(1)) {
					return;
				}
				Static439.aClass210_1.method8031(0, 1, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
				local189 = Static313.aClass2_Sub34_Sub2_1.aByteArray77[0] & 0xFF;
				if (local189 == 21) {
					Static585.anInt9601 = 8;
				} else if (local189 == 29) {
					Static585.anInt9601 = 14;
				} else if (local189 == 1) {
					Static585.anInt9601 = 6;
					Static163.method3036(local189);
					return;
				} else if (local189 == 2) {
					Static585.anInt9601 = 9;
				} else if (local189 == 15) {
					Static44.anInt971 = -2;
					Static585.anInt9601 = 15;
				} else if (local189 == 23 && Static531.anInt8871 < 3) {
					Static585.anInt9601 = 1;
					Static531.anInt8871++;
					Static225.anInt4618 = 0;
					Static439.aClass210_1.method8030();
					Static439.aClass210_1 = null;
					return;
				} else {
					Static585.anInt9601 = 0;
					Static163.method3036(local189);
					Static439.aClass210_1.method8030();
					Static439.aClass210_1 = null;
					Static33.method756();
					return;
				}
			}
			if (Static585.anInt9601 == 7) {
				Static44.method862();
				@Pc(714) Class2_Sub50 local714 = Static79.method7505();
				@Pc(717) Class2_Sub34_Sub2 local717 = local714.aClass2_Sub34_Sub2_2;
				local717.method6928(Static610.aClass310_2);
				local717.method6921(Static10.aClass295_12.anInt8334);
				Static311.method4754(local714);
				Static73.method1380();
				Static585.anInt9601 = 5;
			} else if (Static585.anInt9601 == 8) {
				if (Static439.aClass210_1.method8029(1)) {
					Static439.aClass210_1.method8031(0, 1, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
					local189 = Static313.aClass2_Sub34_Sub2_1.aByteArray77[0] & 0xFF;
					Static585.anInt9601 = 0;
					Static287.anInt5405 = (local189 + 3) * 60;
					Static163.method3036(21);
					Static439.aClass210_1.method8030();
					Static439.aClass210_1 = null;
					Static33.method756();
				}
			} else if (Static585.anInt9601 == 14) {
				if (Static439.aClass210_1.method8029(1)) {
					Static439.aClass210_1.method8031(0, 1, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
					Static585.anInt9601 = 0;
					Static237.anInt4723 = Static313.aClass2_Sub34_Sub2_1.aByteArray77[0] & 0xFF;
					Static163.method3036(29);
					Static439.aClass210_1.method8030();
					Static439.aClass210_1 = null;
					Static33.method756();
				}
			} else if (Static585.anInt9601 != 9) {
				@Pc(858) Class2_Sub34_Sub2 local858;
				if (Static585.anInt9601 == 10) {
					local858 = Static313.aClass2_Sub34_Sub2_1;
					if (Static606.anInt9911 == 2) {
						if (!Static439.aClass210_1.method8029(Static642.anInt10271)) {
							return;
						}
						Static439.aClass210_1.method8031(0, Static642.anInt10271, local858.aByteArray77);
						local858.anInt8188 = 0;
						Static278.anInt5322 = local858.method6904();
						Static126.anInt2937 = local858.method6904();
						Static95.aBoolean160 = local858.method6904() == 1;
						Static392.aBoolean523 = local858.method6904() == 1;
						Static356.aBoolean484 = local858.method6904() == 1;
						Static408.aBoolean565 = local858.method6904() == 1;
						Static182.anInt4021 = local858.method6884();
						Static632.aBoolean751 = local858.method6904() == 1;
						Static85.anInt1779 = local858.method6875();
						Static259.aBoolean404 = local858.method6904() == 1;
						Static619.aClass281_4.method6737(Static259.aBoolean404);
						Static570.aClass267_2.method6601(Static259.aBoolean404);
						Static341.aClass76_1.method1677(Static259.aBoolean404);
					} else if (Static439.aClass210_1.method8029(Static642.anInt10271)) {
						Static439.aClass210_1.method8031(0, Static642.anInt10271, local858.aByteArray77);
						local858.anInt8188 = 0;
						Static278.anInt5322 = local858.method6904();
						Static126.anInt2937 = local858.method6904();
						Static95.aBoolean160 = local858.method6904() == 1;
						Static392.aBoolean523 = local858.method6904() == 1;
						Static356.aBoolean484 = local858.method6904() == 1;
						Static39.anInt9755 = local858.method6856();
						Static632.aBoolean751 = Static39.anInt9755 > 0;
						Static538.anInt8989 = local858.method6884();
						Static431.anInt7715 = local858.method6884();
						Static532.anInt8900 = local858.method6884();
						Static577.anInt9531 = local858.method6865();
						Static258.aClass26_38 = Static375.aClass359_4.method8268(Static577.anInt9531);
						Static506.anInt8524 = local858.method6904();
						Static630.anInt10137 = local858.method6884();
						Static451.anInt7931 = local858.method6884();
						Static204.aBoolean360 = local858.method6904() == 1;
						Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString4 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString3 = local858.method6910();
						Static134.anInt3048 = local858.method6904();
						Static553.anInt9139 = local858.method6865();
						Static535.aClass322_5 = new Class322();
						Static535.aClass322_5.anInt9045 = local858.method6884();
						if (Static535.aClass322_5.anInt9045 == 65535) {
							Static535.aClass322_5.anInt9045 = -1;
						}
						Static535.aClass322_5.aString83 = local858.method6910();
						if (Static267.aClass86_7 != Static95.aClass86_5) {
							Static535.aClass322_5.anInt9044 = Static535.aClass322_5.anInt9045 + 50000;
							Static535.aClass322_5.anInt9041 = Static535.aClass322_5.anInt9045 + 40000;
						}
						if (Static267.aClass86_7 != Static538.aClass86_8 && (Static460.aClass322_3.method7605(Static478.aClass322_4) || Static460.aClass322_3.method7605(Static589.aClass322_6))) {
							Static387.method5831();
						}
					} else {
						return;
					}
					if (Static95.aBoolean160 && !Static356.aBoolean484 || Static632.aBoolean751) {
						try {
							Static648.method3663("zap", Static234.anApplet2);
						} catch (@Pc(1179) Throwable local1179) {
							if (Static2.aBoolean3) {
								try {
									Static234.anApplet2.getAppletContext().showDocument(new URL(Static234.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1193) Exception local1193) {
								}
							}
						}
					} else {
						try {
							Static648.method3663("unzap", Static234.anApplet2);
						} catch (@Pc(1201) Throwable local1201) {
						}
					}
					if (Static267.aClass86_7 == Static95.aClass86_5) {
						try {
							Static648.method3663("loggedin", Static234.anApplet2);
						} catch (@Pc(1212) Throwable local1212) {
						}
					}
					if (Static606.anInt9911 != 2) {
						Static585.anInt9601 = 0;
						Static163.method3036(2);
						Static296.method4635();
						Static51.method997(7);
						Static398.aClass274_115 = null;
						return;
					}
					Static585.anInt9601 = 12;
				}
				if (Static585.anInt9601 == 12) {
					if (!Static439.aClass210_1.method8029(3)) {
						return;
					}
					Static439.aClass210_1.method8031(0, 3, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
					Static585.anInt9601 = 13;
				}
				if (Static585.anInt9601 == 13) {
					local858 = Static313.aClass2_Sub34_Sub2_1;
					local858.anInt8188 = 0;
					if (local858.method6924()) {
						if (!Static439.aClass210_1.method8029(1)) {
							return;
						}
						Static439.aClass210_1.method8031(3, 1, local858.aByteArray77);
					}
					Static398.aClass274_115 = Static336.method5209()[local858.method6934()];
					Static44.anInt971 = local858.method6884();
					Static585.anInt9601 = 11;
				}
				if (Static585.anInt9601 == 11) {
					if (Static439.aClass210_1.method8029(Static44.anInt971)) {
						Static439.aClass210_1.method8031(0, Static44.anInt971, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
						Static313.aClass2_Sub34_Sub2_1.anInt8188 = 0;
						Static585.anInt9601 = 0;
						local189 = Static44.anInt971;
						Static163.method3036(2);
						Static340.method5228();
						Static275.method4412(Static313.aClass2_Sub34_Sub2_1);
						Static415.anInt7580 = -1;
						if (Static218.aClass274_57 == Static398.aClass274_115) {
							Static257.method4231();
						} else {
							Static276.method4437();
						}
						if (local189 != Static313.aClass2_Sub34_Sub2_1.anInt8188) {
							throw new RuntimeException("lswp pos:" + Static313.aClass2_Sub34_Sub2_1.anInt8188 + " psize:" + local189);
						}
						Static398.aClass274_115 = null;
					}
				} else if (Static585.anInt9601 == 15) {
					if (Static44.anInt971 == -2) {
						if (!Static439.aClass210_1.method8029(2)) {
							return;
						}
						Static439.aClass210_1.method8031(0, 2, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
						Static313.aClass2_Sub34_Sub2_1.anInt8188 = 0;
						Static44.anInt971 = Static313.aClass2_Sub34_Sub2_1.method6884();
					}
					if (Static439.aClass210_1.method8029(Static44.anInt971)) {
						Static439.aClass210_1.method8031(0, Static44.anInt971, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
						Static313.aClass2_Sub34_Sub2_1.anInt8188 = 0;
						local189 = Static44.anInt971;
						Static585.anInt9601 = 0;
						Static163.method3036(15);
						Static300.method4663();
						Static275.method4412(Static313.aClass2_Sub34_Sub2_1);
						if (local189 != Static313.aClass2_Sub34_Sub2_1.anInt8188) {
							throw new RuntimeException("lswpr pos:" + Static313.aClass2_Sub34_Sub2_1.anInt8188 + " psize:" + local189);
						}
						Static398.aClass274_115 = null;
					}
				}
			} else if (Static439.aClass210_1.method8029(1)) {
				Static439.aClass210_1.method8031(0, 1, Static313.aClass2_Sub34_Sub2_1.aByteArray77);
				Static585.anInt9601 = 10;
				Static642.anInt10271 = Static313.aClass2_Sub34_Sub2_1.aByteArray77[0] & 0xFF;
			}
		} catch (@Pc(1467) IOException local1467) {
			if (Static439.aClass210_1 != null) {
				Static439.aClass210_1.method8030();
				Static439.aClass210_1 = null;
			}
			if (Static531.anInt8871 >= 3) {
				Static585.anInt9601 = 0;
				Static163.method3036(-4);
				Static33.method756();
			} else {
				if (Static606.anInt9911 == 2) {
					Static460.aClass322_3.method7606();
				} else {
					Static139.aClass322_2.method7606();
				}
				Static225.anInt4618 = 0;
				Static585.anInt9601 = 1;
				Static531.anInt8871++;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([BB)Lclient!kr;")
	public static Class20 method7694(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static181.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static181.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static181.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(58) int[] local58 = new int[local34 * local38];
					@Pc(70) PixelGrabber local70 = new PixelGrabber(local19, 0, 0, local34, local38, local58, 0, local34);
					local70.grabPixels();
					return Static600.aClass87_15.method7913(local34, local58, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(83) InterruptedException local83) {
			}
		}
	}
}
