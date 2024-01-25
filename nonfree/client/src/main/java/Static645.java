import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_77 = new Class293(4);

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
	public static int anInt10431 = -1;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "Lclient!qt;")
	public static final Class294 aClass294_5 = new Class294();

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public static void method8845() {
		@Pc(9) int local9 = Static167.aClass5_Sub12_Sub2_1.method8633();
		Static466.anInt7862 = Static167.aClass5_Sub12_Sub2_1.method8615();
		@Pc(22) boolean local22 = Static167.aClass5_Sub12_Sub2_1.method8615() == 1;
		@Pc(26) int local26 = Static167.aClass5_Sub12_Sub2_1.method8633();
		@Pc(30) int local30 = Static167.aClass5_Sub12_Sub2_1.method8607();
		Static246.method3762();
		Static565.method7926(local30);
		Static167.aClass5_Sub12_Sub2_1.method8667();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static111.anInt1752 >> 3; local44++) {
				for (local48 = 0; local48 < Static279.anInt4567 >> 3; local48++) {
					local55 = Static167.aClass5_Sub12_Sub2_1.method8670(1);
					if (local55 == 1) {
						Static414.anIntArrayArrayArray10[local40][local44][local48] = Static167.aClass5_Sub12_Sub2_1.method8670(26);
					} else {
						Static414.anIntArrayArrayArray10[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static167.aClass5_Sub12_Sub2_1.method8666();
		local44 = (Static60.anInt3115 - Static167.aClass5_Sub12_Sub2_1.anInt10154) / 16;
		Static141.anIntArrayArray12 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static141.anIntArrayArray12[local48][local55] = Static167.aClass5_Sub12_Sub2_1.method8623();
			}
		}
		Static343.aByteArrayArray10 = new byte[local44][];
		Static112.aByteArrayArray4 = new byte[local44][];
		Static462.anIntArray542 = new int[local44];
		Static379.anIntArray680 = new int[local44];
		Static503.aByteArrayArray8 = null;
		Static610.aByteArrayArray26 = new byte[local44][];
		Static322.anIntArray403 = new int[local44];
		Static28.anIntArray43 = new int[local44];
		Static310.aByteArrayArray9 = new byte[local44][];
		Static594.anIntArray784 = new int[local44];
		Static587.anIntArray777 = null;
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(185) int local185 = 0; local185 < Static111.anInt1752 >> 3; local185++) {
				for (@Pc(189) int local189 = 0; local189 < Static279.anInt4567 >> 3; local189++) {
					@Pc(199) int local199 = Static414.anIntArrayArrayArray10[local55][local185][local189];
					if (local199 != -1) {
						@Pc(208) int local208 = local199 >> 14 & 0x3FF;
						@Pc(214) int local214 = local199 >> 3 & 0x7FF;
						@Pc(225) int local225 = (local208 / 8 << 8) + (local214 / 8);
						for (@Pc(227) int local227 = 0; local227 < local44; local227++) {
							if (Static594.anIntArray784[local227] == local225) {
								local225 = -1;
								break;
							}
						}
						if (local225 != -1) {
							Static594.anIntArray784[local44] = local225;
							@Pc(255) int local255 = local225 >> 8 & 0xFF;
							@Pc(259) int local259 = local225 & 0xFF;
							Static462.anIntArray542[local44] = Static342.aClass384_86.method8890("m" + local255 + "_" + local259);
							Static379.anIntArray680[local44] = Static342.aClass384_86.method8890("l" + local255 + "_" + local259);
							Static28.anIntArray43[local44] = Static342.aClass384_86.method8890("um" + local255 + "_" + local259);
							Static322.anIntArray403[local44] = Static342.aClass384_86.method8890("ul" + local255 + "_" + local259);
							local44++;
						}
					}
				}
			}
		}
		Static349.method5303(local9, local22, 11, local26);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8846(@OriginalArg(1) String arg0) {
		Static604.aString143 = arg0;
		if (Static270.anApplet5 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static270.anApplet5.getParameter("cookieprefix");
			@Pc(16) String local16 = Static270.anApplet5.getParameter("cookiehost");
			@Pc(31) String local31 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Static353.method5594(Static205.method3179() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static652.method1917(Static270.anApplet5, "document.cookie=\"" + local31 + "\"");
		} catch (@Pc(84) Throwable local84) {
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8847(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static227.anInt3948;
		@Pc(13) int[] local13 = Static467.anIntArray632;
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(25) Class14_Sub1_Sub1_Sub3_Sub1 local25 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local13[local17]];
			if (local25 != null && local25 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 && local25.aString42 != null && local25.aString42.equalsIgnoreCase(arg1)) {
				@Pc(50) Class5_Sub40 local50;
				if (arg0 == 1) {
					local50 = Static25.method507(Static98.aClass208_2, Static237.aClass181_38);
					local50.aClass5_Sub12_Sub2_2.method8655(local13[local17]);
					local50.aClass5_Sub12_Sub2_2.method8638(0);
					Static612.method8496(local50);
				} else if (arg0 == 4) {
					local50 = Static25.method507(Static98.aClass208_2, Static582.aClass181_89);
					local50.aClass5_Sub12_Sub2_2.method8604(local13[local17]);
					local50.aClass5_Sub12_Sub2_2.method8609(0);
					Static612.method8496(local50);
				} else if (arg0 == 5) {
					local50 = Static25.method507(Static98.aClass208_2, Static647.aClass181_99);
					local50.aClass5_Sub12_Sub2_2.method8655(local13[local17]);
					local50.aClass5_Sub12_Sub2_2.method8609(0);
					Static612.method8496(local50);
				} else if (arg0 == 6) {
					local50 = Static25.method507(Static98.aClass208_2, Static21.aClass181_7);
					local50.aClass5_Sub12_Sub2_2.method8604(local13[local17]);
					local50.aClass5_Sub12_Sub2_2.method8612(0);
					Static612.method8496(local50);
				} else if (arg0 == 7) {
					local50 = Static25.method507(Static98.aClass208_2, Static551.aClass181_77);
					local50.aClass5_Sub12_Sub2_2.method8604(local13[local17]);
					local50.aClass5_Sub12_Sub2_2.method8609(0);
					Static612.method8496(local50);
				}
				local15 = true;
				break;
			}
		}
		if (!local15) {
			Static88.method1388(Static76.aClass58_22.method1237(Static321.anInt5554) + arg1);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!kn;I)V")
	public static void method8848(@OriginalArg(0) Class14_Sub1_Sub1_Sub3 arg0) {
		if (arg0 instanceof Class14_Sub1_Sub1_Sub3_Sub2) {
			@Pc(9) Class14_Sub1_Sub1_Sub3_Sub2 local9 = (Class14_Sub1_Sub1_Sub3_Sub2) arg0;
			if (local9.aClass271_1 != null) {
				Static287.method4288(local9, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 != local9.aByte125);
			}
		} else if (arg0 instanceof Class14_Sub1_Sub1_Sub3_Sub1) {
			@Pc(31) Class14_Sub1_Sub1_Sub3_Sub1 local31 = (Class14_Sub1_Sub1_Sub3_Sub1) arg0;
			Static468.method6877(local31, local31.aByte125 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125);
		}
	}
}
