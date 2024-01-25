import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!ov", name = "F", descriptor = "Lclient!vb;")
	public static Class371 aClass371_9;

	@OriginalMember(owner = "client!ov", name = "L", descriptor = "I")
	public static int anInt7273 = 0;

	@OriginalMember(owner = "client!ov", name = "K", descriptor = "Lclient!wh;")
	public static final Class392 aClass392_6 = new Class392(2, 2);

	@OriginalMember(owner = "client!ov", name = "I", descriptor = "I")
	public static int anInt7276 = -1;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "(I)V")
	public static void method6328() {
		if (Static205.anInt3674 == 0 || Static205.anInt3674 == 10) {
			return;
		}
		try {
			@Pc(26) short local26;
			if (Static321.anInt5481 == 0) {
				local26 = 250;
			} else {
				local26 = 2000;
			}
			if (Static306.aBoolean341 && Static205.anInt3674 >= 6) {
				local26 = 6000;
			}
			if (Static120.anInt1966 != 2 || Static205.anInt3674 != 20 && Static438.anInt7237 != 42) {
				Static493.anInt7981++;
			}
			if (Static493.anInt7981 > local26) {
				Static365.aClass389_9.method9073();
				if (Static321.anInt5481 >= 3) {
					Static205.anInt3674 = 0;
					Static126.method1895(-5);
					return;
				}
				if (Static120.anInt1966 == 2) {
					Static68.aClass258_6.method5843();
				} else {
					Static291.aClass258_4.method5843();
				}
				Static205.anInt3674 = 1;
				Static321.anInt5481++;
				Static493.anInt7981 = 0;
			}
			if (Static205.anInt3674 == 1) {
				if (Static120.anInt1966 == 2) {
					Static365.aClass389_9.aClass361_9 = Static68.aClass258_6.method5846(Static681.aClass349_6);
				} else {
					Static365.aClass389_9.aClass361_9 = Static291.aClass258_4.method5846(Static681.aClass349_6);
				}
				Static205.anInt3674 = 2;
			}
			@Pc(189) Class5_Sub41 local189;
			@Pc(206) int local206;
			@Pc(253) int local253;
			if (Static205.anInt3674 == 2) {
				if (Static365.aClass389_9.aClass361_9.anInt9720 == 2) {
					throw new IOException();
				}
				if (Static365.aClass389_9.aClass361_9.anInt9720 != 1) {
					return;
				}
				Static365.aClass389_9.aClass50_2 = Static363.method5291((Socket) Static365.aClass389_9.aClass361_9.anObject20);
				Static365.aClass389_9.aClass361_9 = null;
				Static365.aClass389_9.method9077();
				local189 = Static338.method5082();
				if (Static306.aBoolean341) {
					local189.aClass5_Sub36_Sub2_1.method7324(Static115.aClass157_12.anInt3847);
					local189.aClass5_Sub36_Sub2_1.method7296(0);
					local206 = local189.aClass5_Sub36_Sub2_1.anInt8456;
					local189.aClass5_Sub36_Sub2_1.method7287(656);
					if (Static120.anInt1966 == 2) {
						local189.aClass5_Sub36_Sub2_1.method7324(Static652.anInt10664 == 14 ? 1 : 0);
					}
					@Pc(230) Class5_Sub36 local230 = Static346.method4443();
					local230.method7324(Static564.anInt8912);
					local230.method7296((int) (Math.random() * 9.9999999E7D));
					local230.method7324(Static375.anInt7800);
					local230.method7287(Static653.anInt10666);
					for (local253 = 0; local253 < 6; local253++) {
						local230.method7287((int) (Math.random() * 9.9999999E7D));
					}
					local230.method7329(Static584.aLong270);
					local230.method7324(Static536.aClass290_6.anInt7535);
					local230.method7324((int) (Math.random() * 9.9999999E7D));
					local230.method7305(Static283.aBigInteger1, Static489.aBigInteger5);
					local189.aClass5_Sub36_Sub2_1.method7313(0, local230.anInt8456, local230.aByteArray89);
					local189.aClass5_Sub36_Sub2_1.method7308(local189.aClass5_Sub36_Sub2_1.anInt8456 - local206);
				} else {
					local189.aClass5_Sub36_Sub2_1.method7324(Static115.aClass157_1.anInt3847);
				}
				Static365.aClass389_9.method9079(local189);
				Static365.aClass389_9.method9078(86);
				Static205.anInt3674 = 3;
			}
			@Pc(370) int local370;
			if (Static205.anInt3674 == 3) {
				if (!Static365.aClass389_9.aClass50_2.method6169(1)) {
					return;
				}
				Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 1, 0);
				local370 = Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89[0] & 0xFF;
				if (local370 != 0) {
					Static205.anInt3674 = 0;
					Static126.method1895(local370);
					Static365.aClass389_9.method9073();
					Static372.method5545();
					return;
				}
				if (Static306.aBoolean341) {
					Static205.anInt3674 = 4;
				} else {
					Static205.anInt3674 = 8;
				}
			}
			if (Static205.anInt3674 == 4) {
				if (!Static365.aClass389_9.aClass50_2.method6169(2)) {
					return;
				}
				Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 2, 0);
				Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = 0;
				Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = Static365.aClass389_9.aClass5_Sub36_Sub2_2.method7333();
				Static205.anInt3674 = 5;
			}
			if (Static205.anInt3674 == 5) {
				if (!Static365.aClass389_9.aClass50_2.method6169(Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456)) {
					return;
				}
				Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456, 0);
				Static365.aClass389_9.aClass5_Sub36_Sub2_2.method7270(Static642.anIntArray596);
				Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = 0;
				@Pc(479) String local479 = Static365.aClass389_9.aClass5_Sub36_Sub2_2.method7275();
				Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = 0;
				@Pc(487) String local487 = "opensn";
				if (!Static460.aBoolean507 || Static388.method5739(local479, local487, 1, Static681.aClass349_6).anInt9720 == 2) {
					Static504.method6986(local479, Static681.aClass349_6, Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 1, true, local487);
				}
				Static205.anInt3674 = 6;
			}
			if (Static205.anInt3674 == 6) {
				if (!Static365.aClass389_9.aClass50_2.method6169(1)) {
					return;
				}
				Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 1, 0);
				if ((Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89[0] & 0xFF) == 1) {
					Static205.anInt3674 = 7;
				}
			}
			if (Static205.anInt3674 == 7) {
				if (!Static365.aClass389_9.aClass50_2.method6169(16)) {
					return;
				}
				Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 16, 0);
				Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = 16;
				Static365.aClass389_9.aClass5_Sub36_Sub2_2.method7270(Static642.anIntArray596);
				Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = 0;
				Static514.aString92 = Static446.aString85 = Static508.method7013(Static365.aClass389_9.aClass5_Sub36_Sub2_2.method7304());
				Static446.aLong213 = Static365.aClass389_9.aClass5_Sub36_Sub2_2.method7304();
				Static205.anInt3674 = 8;
			}
			@Pc(632) Class5_Sub36_Sub2 local632;
			if (Static205.anInt3674 == 8) {
				Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = 0;
				Static365.aClass389_9.method9077();
				local189 = Static338.method5082();
				local632 = local189.aClass5_Sub36_Sub2_1;
				@Pc(662) int local662;
				@Pc(688) Class5_Sub36 local688;
				@Pc(643) Class157 local643;
				if (Static120.anInt1966 == 2) {
					if (Static306.aBoolean341) {
						local643 = Static115.aClass157_13;
					} else {
						local643 = Static115.aClass157_3;
					}
					local632.method7324(local643.anInt3847);
					local632.method7296(0);
					local253 = local632.anInt8456;
					local662 = local632.anInt8456;
					if (!Static306.aBoolean341) {
						local632.method7287(656);
						local632.method7324(Static652.anInt10664 == 14 ? 1 : 0);
						local662 = local632.anInt8456;
						local688 = Static446.method6374();
						local632.method7313(0, local688.anInt8456, local688.aByteArray89);
						local662 = local632.anInt8456;
						local632.method7327(Static514.aString92);
					}
					local632.method7324(Static623.anInt9970);
					local632.method7324(Static260.method4249());
					local632.method7296(Static85.anInt9921);
					local632.method7296(Static256.anInt4629);
					local632.method7324(Static577.aClass5_Sub19_25.aClass17_Sub29_1.method9175());
					Static368.method5498(local632);
					local632.method7327(Static565.aString101);
					local632.method7287(Static653.anInt10666);
					local688 = Static577.aClass5_Sub19_25.method2547();
					local632.method7324(local688.anInt8456);
					local632.method7313(0, local688.anInt8456, local688.aByteArray89);
					Static386.aBoolean427 = true;
					@Pc(774) Class5_Sub36 local774 = new Class5_Sub36(Static506.aClass5_Sub32_2.method5053());
					Static506.aClass5_Sub32_2.method5050(local774);
					local632.method7313(0, local774.aByteArray89.length, local774.aByteArray89);
					local632.method7287(Static682.anInt10922);
					local632.method7329(Static218.aLong113);
					local632.method7324(Static83.aString12 == null ? 0 : 1);
					if (Static83.aString12 != null) {
						local632.method7327(Static83.aString12);
					}
					local632.method7324(Static36.method620("jagtheora") ? 1 : 0);
					local632.method7324(Static460.aBoolean507 ? 1 : 0);
					Static249.method3982(local632);
					local632.method7325(Static642.anIntArray596, local662, local632.anInt8456);
					local632.method7308(local632.anInt8456 - local253);
				} else {
					if (Static306.aBoolean341) {
						local643 = Static115.aClass157_13;
					} else {
						local643 = Static115.aClass157_5;
					}
					local632.method7324(local643.anInt3847);
					local632.method7296(0);
					local253 = local632.anInt8456;
					local662 = local632.anInt8456;
					if (!Static306.aBoolean341) {
						local632.method7287(656);
						local688 = Static446.method6374();
						local632.method7313(0, local688.anInt8456, local688.aByteArray89);
						local662 = local632.anInt8456;
						local632.method7327(Static514.aString92);
					}
					local632.method7324(Static536.aClass290_6.anInt7535);
					local632.method7324(Static375.anInt7800);
					Static368.method5498(local632);
					local632.method7327(Static565.aString101);
					local632.method7287(Static653.anInt10666);
					Static249.method3982(local632);
					local632.method7325(Static642.anIntArray596, local662, local632.anInt8456);
					local632.method7308(local632.anInt8456 - local253);
				}
				Static365.aClass389_9.method9079(local189);
				Static365.aClass389_9.method9078(87);
				Static365.aClass389_9.aClass393_2 = new Class393(Static642.anIntArray596);
				for (@Pc(958) int local958 = 0; local958 < 4; local958++) {
					Static642.anIntArray596[local958] += 50;
				}
				Static365.aClass389_9.aClass5_Sub36_Sub2_2.method7345(Static642.anIntArray596);
				Static642.anIntArray596 = null;
				Static205.anInt3674 = 9;
			}
			if (Static205.anInt3674 == 9) {
				if (!Static365.aClass389_9.aClass50_2.method6169(1)) {
					return;
				}
				Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 1, 0);
				local370 = Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89[0] & 0xFF;
				if (local370 == 21) {
					Static205.anInt3674 = 12;
				} else if (local370 == 29 || local370 == 45) {
					Static122.anInt2022 = local370;
					Static205.anInt3674 = 18;
				} else if (local370 == 1) {
					Static205.anInt3674 = 10;
					Static126.method1895(local370);
					return;
				} else if (local370 == 2) {
					Static205.anInt3674 = 13;
				} else if (local370 == 15) {
					Static205.anInt3674 = 19;
					Static365.aClass389_9.anInt10756 = -2;
				} else if (local370 == 23 && Static321.anInt5481 < 3) {
					Static205.anInt3674 = 1;
					Static321.anInt5481++;
					Static493.anInt7981 = 0;
					Static365.aClass389_9.aClass50_2.method6168();
					Static365.aClass389_9.aClass50_2 = null;
					return;
				} else if (local370 == 42) {
					Static205.anInt3674 = 20;
					Static126.method1895(local370);
					return;
				} else if (!Static279.aBoolean324 || Static306.aBoolean341 || Static564.anInt8912 == -1 || local370 != 35) {
					Static205.anInt3674 = 0;
					Static126.method1895(local370);
					Static365.aClass389_9.aClass50_2.method6168();
					Static365.aClass389_9.aClass50_2 = null;
					Static372.method5545();
					return;
				} else {
					Static205.anInt3674 = 1;
					Static493.anInt7981 = 0;
					Static306.aBoolean341 = true;
					Static365.aClass389_9.aClass50_2.method6168();
					Static365.aClass389_9.aClass50_2 = null;
					return;
				}
			}
			if (Static205.anInt3674 == 11) {
				Static365.aClass389_9.method9077();
				local189 = Static338.method5082();
				local632 = local189.aClass5_Sub36_Sub2_1;
				local632.method7335(Static365.aClass389_9.aClass393_2);
				local632.method7334(Static115.aClass157_9.anInt3847);
				Static365.aClass389_9.method9079(local189);
				Static365.aClass389_9.method9078(96);
				Static205.anInt3674 = 9;
			} else if (Static205.anInt3674 == 12) {
				if (Static365.aClass389_9.aClass50_2.method6169(1)) {
					Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 1, 0);
					local370 = Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89[0] & 0xFF;
					Static205.anInt3674 = 0;
					Static533.anInt8884 = local370 * 50;
					Static126.method1895(21);
					Static365.aClass389_9.aClass50_2.method6168();
					Static365.aClass389_9.aClass50_2 = null;
					Static372.method5545();
				}
			} else if (Static205.anInt3674 == 20) {
				if (Static365.aClass389_9.aClass50_2.method6169(2)) {
					Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 2, 0);
					Static144.anInt2848 = ((Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89[0] & 0xFF) << 8) + (Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89[1] & 0xFF);
					Static205.anInt3674 = 9;
				}
			} else if (Static205.anInt3674 == 18) {
				if (Static365.aClass389_9.aClass50_2.method6169(1)) {
					Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 1, 0);
					Static280.anInt4976 = Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89[0] & 0xFF;
					Static205.anInt3674 = 0;
					Static126.method1895(Static122.anInt2022);
					Static365.aClass389_9.aClass50_2.method6168();
					Static365.aClass389_9.aClass50_2 = null;
					Static372.method5545();
				}
			} else if (Static205.anInt3674 != 13) {
				@Pc(1400) Class5_Sub36_Sub2 local1400;
				if (Static205.anInt3674 == 14) {
					local1400 = Static365.aClass389_9.aClass5_Sub36_Sub2_2;
					if (Static120.anInt1966 == 2) {
						if (!Static365.aClass389_9.aClass50_2.method6169(Static17.anInt236)) {
							return;
						}
						Static365.aClass389_9.aClass50_2.method6170(local1400.aByteArray89, Static17.anInt236, 0);
						local1400.anInt8456 = 0;
						Static296.anInt5190 = local1400.method7291();
						Static198.anInt3601 = local1400.method7291();
						Static163.aBoolean238 = local1400.method7291() == 1;
						Static490.aBoolean537 = local1400.method7291() == 1;
						Static664.aBoolean762 = local1400.method7291() == 1;
						Static76.aBoolean116 = local1400.method7291() == 1;
						Static649.anInt10621 = local1400.method7333();
						Static82.aBoolean119 = local1400.method7291() == 1;
						Static54.anInt949 = local1400.method7269();
						Static504.aBoolean543 = local1400.method7291() == 1;
						Static528.aClass243_3.method5558(Static504.aBoolean543);
						Static82.aClass134_1.method3190(Static504.aBoolean543);
						Static378.aClass369_2.method8463(Static504.aBoolean543);
					} else if (Static365.aClass389_9.aClass50_2.method6169(Static17.anInt236)) {
						Static365.aClass389_9.aClass50_2.method6170(local1400.aByteArray89, Static17.anInt236, 0);
						local1400.anInt8456 = 0;
						Static296.anInt5190 = local1400.method7291();
						Static198.anInt3601 = local1400.method7291();
						Static163.aBoolean238 = local1400.method7291() == 1;
						Static490.aBoolean537 = local1400.method7291() == 1;
						Static664.aBoolean762 = local1400.method7291() == 1;
						Static540.aLong248 = local1400.method7304();
						Static191.aLong293 = Static540.aLong248 - Static480.method6763() - local1400.method7311();
						local206 = local1400.method7291();
						Static82.aBoolean119 = (local206 & 0x1) != 0;
						Static98.aBoolean132 = (local206 & 0x2) != 0;
						Static66.anInt1114 = local1400.method7268();
						Static186.aBoolean248 = local1400.method7291() == 1;
						Static242.anInt5008 = local1400.method7268();
						Static588.anInt9520 = local1400.method7333();
						Static437.anInt7221 = local1400.method7333();
						Static638.anInt10397 = local1400.method7333();
						Static302.anInt5246 = local1400.method7268();
						Static77.aClass361_1 = Static681.aClass349_6.method7747(Static302.anInt5246);
						Static485.anInt10639 = local1400.method7291();
						Static444.anInt7304 = local1400.method7333();
						Static593.anInt9563 = local1400.method7333();
						Static223.aBoolean268 = local1400.method7291() == 1;
						Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString44 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString43 = Static177.aString31 = local1400.method7275();
						Static507.anInt10610 = local1400.method7291();
						Static337.anInt5651 = local1400.method7268();
						Static368.aBoolean415 = local1400.method7291() == 1;
						Static253.aClass258_3 = new Class258();
						Static253.aClass258_3.anInt6748 = local1400.method7333();
						if (Static253.aClass258_3.anInt6748 == 65535) {
							Static253.aClass258_3.anInt6748 = -1;
						}
						Static253.aClass258_3.aString78 = local1400.method7275();
						if (Static670.aClass242_7 != Static387.aClass242_8) {
							Static253.aClass258_3.anInt6747 = Static253.aClass258_3.anInt6748 + 40000;
							Static253.aClass258_3.anInt6746 = Static253.aClass258_3.anInt6748 + 50000;
						}
						if (Static670.aClass242_7 != Static478.aClass242_9 && (Static670.aClass242_7 != Static161.aClass242_4 || Static296.anInt5190 < 2) && (Static68.aClass258_6.method5845(Static641.aClass258_7) || Static68.aClass258_6.method5845(Static130.aClass258_2))) {
							Static510.method7022();
						}
					} else {
						return;
					}
					if (Static163.aBoolean238 && !Static664.aBoolean762 || Static82.aBoolean119) {
						try {
							Static684.method782(Static265.anApplet2, "zap");
						} catch (@Pc(1820) Throwable local1820) {
							if (Static160.aBoolean588) {
								try {
									Static265.anApplet2.getAppletContext().showDocument(new URL(Static265.anApplet2.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1838) Exception local1838) {
								}
							}
						}
					} else {
						try {
							Static684.method782(Static265.anApplet2, "unzap");
						} catch (@Pc(1849) Throwable local1849) {
						}
					}
					if (Static387.aClass242_8 == Static670.aClass242_7) {
						try {
							Static684.method782(Static265.anApplet2, "loggedin");
						} catch (@Pc(1862) Throwable local1862) {
						}
					}
					if (Static120.anInt1966 != 2) {
						Static205.anInt3674 = 0;
						Static126.method1895(2);
						Static522.method7116();
						Static411.method6060(7, -3);
						Static365.aClass389_9.aClass156_220 = null;
						return;
					}
					Static205.anInt3674 = 16;
				}
				if (Static205.anInt3674 == 16) {
					if (!Static365.aClass389_9.aClass50_2.method6169(3)) {
						return;
					}
					Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 3, 0);
					Static205.anInt3674 = 17;
				}
				if (Static205.anInt3674 == 17) {
					local1400 = Static365.aClass389_9.aClass5_Sub36_Sub2_2;
					local1400.anInt8456 = 0;
					if (local1400.method7337()) {
						if (!Static365.aClass389_9.aClass50_2.method6169(1)) {
							return;
						}
						Static365.aClass389_9.aClass50_2.method6170(local1400.aByteArray89, 1, 3);
					}
					Static365.aClass389_9.aClass156_220 = Static342.method5117()[local1400.method7338()];
					Static365.aClass389_9.anInt10756 = local1400.method7333();
					Static205.anInt3674 = 15;
				}
				if (Static205.anInt3674 == 15) {
					if (Static365.aClass389_9.aClass50_2.method6169(Static365.aClass389_9.anInt10756)) {
						Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, Static365.aClass389_9.anInt10756, 0);
						Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = 0;
						local370 = Static365.aClass389_9.anInt10756;
						Static205.anInt3674 = 0;
						Static126.method1895(2);
						Static584.method8035();
						Static261.method4255(Static365.aClass389_9.aClass5_Sub36_Sub2_2);
						Static549.anInt8709 = -1;
						if (Static365.aClass389_9.aClass156_220 == Static569.aClass156_184) {
							Static160.method7592();
						} else {
							Static524.method7142();
						}
						if (Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 != local370) {
							throw new RuntimeException("lswp pos:" + Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 + " psize:" + local370);
						}
						Static365.aClass389_9.aClass156_220 = null;
					}
				} else if (Static205.anInt3674 == 19) {
					if (Static365.aClass389_9.anInt10756 == -2) {
						if (!Static365.aClass389_9.aClass50_2.method6169(2)) {
							return;
						}
						Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 2, 0);
						Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = 0;
						Static365.aClass389_9.anInt10756 = Static365.aClass389_9.aClass5_Sub36_Sub2_2.method7333();
					}
					if (Static365.aClass389_9.aClass50_2.method6169(Static365.aClass389_9.anInt10756)) {
						Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, Static365.aClass389_9.anInt10756, 0);
						Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = 0;
						local370 = Static365.aClass389_9.anInt10756;
						Static205.anInt3674 = 0;
						Static126.method1895(15);
						Static467.method6571();
						Static261.method4255(Static365.aClass389_9.aClass5_Sub36_Sub2_2);
						if (Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 != local370) {
							throw new RuntimeException("lswpr pos:" + Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 + " psize:" + local370);
						}
						Static365.aClass389_9.aClass156_220 = null;
					}
				}
			} else if (Static365.aClass389_9.aClass50_2.method6169(1)) {
				Static365.aClass389_9.aClass50_2.method6170(Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89, 1, 0);
				Static205.anInt3674 = 14;
				Static17.anInt236 = Static365.aClass389_9.aClass5_Sub36_Sub2_2.aByteArray89[0] & 0xFF;
			}
		} catch (@Pc(2174) IOException local2174) {
			Static365.aClass389_9.method9073();
			if (Static321.anInt5481 < 3) {
				if (Static120.anInt1966 == 2) {
					Static68.aClass258_6.method5843();
				} else {
					Static291.aClass258_4.method5843();
				}
				Static321.anInt5481++;
				Static205.anInt3674 = 1;
				Static493.anInt7981 = 0;
			} else {
				Static205.anInt3674 = 0;
				Static126.method1895(-4);
				Static372.method5545();
			}
		}
	}
}
