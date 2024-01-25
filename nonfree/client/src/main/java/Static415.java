import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_147 = new Class359(67, 0);

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt7346 = 2;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
	public static int anInt7348 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!mc;Ljava/lang/String;B)I")
	public static int method6168(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) String arg1) {
		@Pc(6) int local6 = arg0.anInt9230;
		@Pc(10) byte[] local10 = Static43.method601(arg1);
		arg0.method7846(local10.length);
		arg0.anInt9230 += Static465.aClass229_1.method5590(0, arg0.aByteArray93, local10.length, arg0.anInt9230, local10);
		return arg0.anInt9230 - local6;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZIIII)V")
	public static void method6169(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static635.aClass226ArrayArrayArray3 == null) {
			Static208.aClass65_7.method6900(arg4, arg2, arg3, -16777216, arg0);
		} else if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 >= 0 && Static201.anInt3834 * 512 > Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 >= 0 && Static626.anInt10238 * 512 > Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784) {
			Static349.anInt6360++;
			if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 != null && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 + 256 - Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599() * 256 >> 9 == Static680.anInt10897 && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 + 256 - Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599() * 256 >> 9 == Static54.anInt802) {
				Static680.anInt10897 = -1;
				Static54.anInt802 = -1;
				Static105.method2035();
			}
			Static491.method7049();
			if (!arg1) {
				Static524.method7414();
			}
			Static63.method890();
			Static63.method897(true, arg0, arg4, arg3, arg2);
			@Pc(112) int local112 = Static650.anInt10484;
			@Pc(114) int local114 = Static158.anInt3176;
			Static483.anInt8094 = Static483.anInt8098;
			@Pc(118) int local118 = Static273.anInt5016;
			@Pc(120) int local120 = Static177.anInt3437;
			@Pc(131) int local131;
			@Pc(170) int local170;
			if (Static660.anInt10605 == 1) {
				local131 = (int) Static298.aFloat116;
				if (Static543.anInt8933 >> 8 > local131) {
					local131 = Static543.anInt8933 >> 8;
				}
				if (Static95.aBooleanArray30[4] && Static223.anIntArray206[4] + 128 > local131) {
					local131 = Static223.anIntArray206[4] + 128;
				}
				local170 = (int) Static157.aFloat83 + Static430.anInt57 & 0x3FFF;
				Static588.method8083(local131, Static541.anInt8929, local114, (local131 >> 3) * 3 + 600 << 2, Static40.anInt662, local170, Static441.method6444(Static481.anInt8082, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784) - 200);
			} else if (Static660.anInt10605 == 4) {
				local131 = (int) Static298.aFloat116;
				if (local131 < Static543.anInt8933 >> 8) {
					local131 = Static543.anInt8933 >> 8;
				}
				if (Static95.aBooleanArray30[4] && local131 < Static223.anIntArray206[4] + 128) {
					local131 = Static223.anIntArray206[4] + 128;
				}
				local170 = (int) Static157.aFloat83 & 0x3FFF;
				Static588.method8083(local131, Static541.anInt8929, local114, (local131 >> 3) * 3 + 600 << 2, Static40.anInt662, local170, Static441.method6444(Static481.anInt8082, Static251.anInt4573, Static599.anInt9833) - 200);
			} else if (Static660.anInt10605 == 5) {
				Static501.method7152(local114);
			}
			local131 = Static332.anInt6132;
			local170 = Static200.anInt3808;
			@Pc(276) int local276 = Static407.anInt7215;
			@Pc(278) int local278 = Static79.anInt1141;
			@Pc(280) int local280 = Static207.anInt3885;
			@Pc(323) int local323;
			for (@Pc(282) int local282 = 0; local282 < 5; local282++) {
				if (Static95.aBooleanArray30[local282]) {
					local323 = (int) ((double) (Static309.anIntArray332[local282] * 2 + 1) * Math.random() - (double) Static309.anIntArray332[local282] + Math.sin((double) Static52.anIntArray41[local282] / 100.0D * (double) Static131.anIntArray95[local282]) * (double) Static223.anIntArray206[local282]);
					if (local282 == 1) {
						Static200.anInt3808 += local323 << 2;
					}
					if (local282 == 0) {
						Static332.anInt6132 += local323 << 2;
					}
					if (local282 == 2) {
						Static407.anInt7215 += local323 << 2;
					}
					if (local282 == 4) {
						Static79.anInt1141 += local323;
						if (Static79.anInt1141 < 1024) {
							Static79.anInt1141 = 1024;
						} else if (Static79.anInt1141 > 3072) {
							Static79.anInt1141 = 3072;
						}
					}
					if (local282 == 3) {
						Static207.anInt3885 = local323 + Static207.anInt3885 & 0x3FFF;
					}
				}
			}
			if (Static332.anInt6132 < 0) {
				Static332.anInt6132 = 0;
			}
			if (Static407.anInt7215 < 0) {
				Static407.anInt7215 = 0;
			}
			if ((Static216.anInt4042 << 9) - 1 < Static332.anInt6132) {
				Static332.anInt6132 = (Static216.anInt4042 << 9) - 1;
			}
			if (Static407.anInt7215 > (Static233.anInt4238 << 9) - 1) {
				Static407.anInt7215 = (Static233.anInt4238 << 9) - 1;
			}
			Static609.method8301();
			Static40.method583();
			Static208.aClass65_7.KA(local118, local120, local112 + local118, local120 - -local114);
			Static467.method6657(true);
			if (Static66.aBoolean570) {
				Static176.method2981(Static146.anInt2996);
				if (Static673.anInt10817 != Static483.anInt8094) {
					Static375.aBoolean591 = true;
				}
				Static673.anInt10817 = Static483.anInt8094;
			} else {
				Static208.aClass65_7.ya();
				local323 = Static146.anInt2996;
				if (Static424.aClass20_1 == null) {
					Static208.aClass65_7.GA(local323);
				} else {
					Static424.aClass20_1.method283(local323, Static208.aClass65_7, Static79.anInt1141, local120, local118, local114, local112, Static487.anInt8173 << 3, Static207.anInt3885);
				}
			}
			Static250.method3863();
			Static546.aClass254_8.method7360(Static332.anInt6132, Static200.anInt3808, Static407.anInt7215, -Static79.anInt1141 & 0x3FFF, -Static207.anInt3885 & 0x3FFF, -Static388.anInt6926 & 0x3FFF);
			Static208.aClass65_7.method6891(Static546.aClass254_8);
			Static208.aClass65_7.DA(local112 / 2 + local118, local120 + local114 / 2, Static122.anInt9902 << 1, Static122.anInt9902 << 1);
			Static309.method4872(Static122.anInt9902 << 1, local120 + local114 / 2, local118 + local112 / 2, Static122.anInt9902 << 1);
			Static631.method8508(Static332.anInt6132, -Static79.anInt1141 & 0x3FFF, Static200.anInt3808, Static407.anInt7215, -Static207.anInt3885 & 0x3FFF, -Static388.anInt6926 & 0x3FFF);
			@Pc(576) byte local576 = Static172.aClass5_Sub50_14.aClass12_Sub13_2.method3075() == 2 ? (byte) Static349.anInt6360 : 1;
			if (Static66.aBoolean570) {
				Static509.method7275(-Static79.anInt1141 & 0x3FFF, -Static388.anInt6926 & 0x3FFF, -Static207.anInt3885 & 0x3FFF);
				Static176.method2982(Static104.aByteArrayArrayArray5, Static172.aClass5_Sub50_14.aClass12_Sub19_1.method5315() == 0, Static26.anInt350, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 >> 9, Static483.anInt8094, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 + 1, Static621.anIntArray558, Static332.anInt6132, local576, Static595.anIntArray539, Static234.anIntArray216, Static678.anIntArray612, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 >> 9, Static200.anInt3808, Static416.anIntArray418, Static407.anInt7215);
			} else {
				Static641.method8652(Static26.anInt350, Static332.anInt6132, Static200.anInt3808, Static407.anInt7215, Static104.aByteArrayArrayArray5, Static416.anIntArray418, Static621.anIntArray558, Static678.anIntArray612, Static595.anIntArray539, Static234.anIntArray216, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 + 1, local576, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 >> 9, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 >> 9, Static172.aClass5_Sub50_14.aClass12_Sub19_1.method5315() == 0, Static632.aBoolean877 ? Static483.anInt8094 : -1, 0, false);
			}
			Static250.method3863();
			if (Static173.anInt3397 == 10) {
				Static311.method4901(local118, local112, local114, local120);
				Static591.method8113(local112, local118, local114, local120);
				Static212.method3372(local118, local120, local114, local112);
				Static48.method8196(local118, local114, local120, local112);
			}
			Static319.method4988();
			Static407.anInt7215 = local276;
			Static332.anInt6132 = local131;
			Static79.anInt1141 = local278;
			Static200.anInt3808 = local170;
			Static207.anInt3885 = local280;
			if (Static288.aBoolean485 && Static671.aClass296_3.method7088() == 0) {
				Static288.aBoolean485 = false;
			}
			if (Static288.aBoolean485) {
				Static208.aClass65_7.method6900(local118, local120, local112, -16777216, local114);
				Static270.method4168(Static64.aClass52_12.method907(Static544.anInt8937), Static208.aClass65_7, Static604.aClass73_15, false, Static247.aClass247_16);
			}
			Static467.method6657(false);
		} else {
			Static208.aClass65_7.method6900(arg4, arg2, arg3, -16777216, arg0);
		}
	}
}
