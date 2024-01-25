import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!um", name = "u", descriptor = "Lclient!we;")
	public static final Class373 aClass373_2 = new Class373();

	@OriginalMember(owner = "client!um", name = "B", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_32 = new Class46(25, 7);

	@OriginalMember(owner = "client!um", name = "C", descriptor = "Z")
	public static final boolean aBoolean200 = false;

	@OriginalMember(owner = "client!um", name = "D", descriptor = "Lclient!raa;")
	public static Class295 aClass295_9 = null;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
	public static void method2148() {
		Static19.aClass289_1.method6819();
		Static533.aClass23_5.method317();
		Static387.aClass252_2.method5619();
		Static61.aClass246_7.method5496();
		Static439.aClass92_2.method1909();
		Static643.aClass275_2.method6642();
		Static435.aClass298_1.method7032();
		Static52.aClass10_1.method210();
		Static475.aClass370_1.method8789();
		Static299.aClass110_1.method2248();
		Static147.aClass238_1.method5280();
		Static586.aClass333_4.method7933();
		Static325.aClass42_1.method943();
		Static508.aClass139_1.method3548();
		Static302.aClass291_1.method6831();
		Static513.aClass260_2.method6304();
		Static55.aClass191_1.method4433();
		Static124.aClass84_1.method1738();
		Static232.aClass189_2.method4424();
		Static275.aClass2_1.method21();
		Static634.aClass372_2.method8808();
		Static106.method1668();
		Static466.method6902();
		Static418.method6378();
		Static593.method8547();
		if (Static517.aClass15_8 != Static211.aClass15_2) {
			for (@Pc(81) int local81 = 0; local81 < Static44.aByteArrayArray1.length; local81++) {
				Static44.aByteArrayArray1[local81] = null;
			}
			Static550.anInt9295 = 0;
		}
		Static295.method4600();
		Static485.method7193();
		Static263.method4283();
		Static6.method118();
		Static560.method8134();
		Static370.aClass87_149.method1801();
		Static213.aClass133_5.method7298();
		Static149.method2210();
		Static196.method3499();
		Static246.aClass207_55.method4668();
		Static493.aClass207_104.method4668();
		Static141.aClass207_30.method4668();
		Static146.aClass207_31.method4668();
		Static503.aClass207_106.method4668();
		Static17.aClass207_6.method4668();
		Static151.aClass207_34.method4668();
		Static348.aClass207_69.method4668();
		Static441.aClass207_89.method4668();
		Static505.aClass207_107.method4668();
		Static602.aClass207_119.method4668();
		Static621.aClass207_130.method4668();
		Static436.aClass207_88.method4668();
		Static40.aClass207_73.method4668();
		Static610.aClass207_123.method4668();
		Static616.aClass207_125.method4668();
		Static101.aClass207_23.method4668();
		Static168.aClass207_36.method4668();
		Static509.aClass207_108.method4668();
		Static108.aClass207_25.method4668();
		Static452.aClass207_92.method4668();
		Static460.aClass207_96.method4668();
		Static189.aClass207_121.method4668();
		Static56.aClass207_16.method4668();
		Static548.aClass207_115.method4668();
		Static338.aClass207_68.method4668();
		Static102.aClass207_24.method4668();
		Static134.aClass207_29.method4668();
		Static373.aClass207_76.method4668();
		Static68.aClass207_20.method4668();
		Static262.aClass207_57.method4668();
		Static5.aClass207_2.method4668();
		Static59.aClass207_17.method4668();
		Static579.aClass87_234.method1801();
		Static167.aClass87_91.method1801();
		Static107.aClass87_254.method1801();
		Static122.aClass87_69.method1801();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIILclient!mo;)V")
	public static void method2153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub2_Sub5 arg4) {
		@Pc(4) Class217 local4 = Static411.method6333(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10231 = (arg1 << Static115.anInt2156) + Static147.anInt2575;
		arg4.anInt10228 = arg3;
		arg4.anInt10229 = (arg2 << Static115.anInt2156) + Static147.anInt2575;
		local4.aClass4_Sub2_Sub5_1 = arg4;
		@Pc(33) int local33 = Static11.aClass61Array1 == Static456.aClass61Array3 ? 1 : 0;
		if (arg4.method8733()) {
			if (arg4.method8727()) {
				arg4.aClass4_Sub2_23 = Static457.aClass4_Sub2Array4[local33];
				Static457.aClass4_Sub2Array4[local33] = arg4;
				return;
			}
			arg4.aClass4_Sub2_23 = Static79.aClass4_Sub2Array1[local33];
			Static79.aClass4_Sub2Array1[local33] = arg4;
			Static28.aBoolean15 = true;
			return;
		}
		arg4.aClass4_Sub2_23 = Static243.aClass4_Sub2Array2[local33];
		Static243.aClass4_Sub2Array2[local33] = arg4;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIB)V")
	public static void method2154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static72.anInt1497 != 0) {
			if (arg1 < 0) {
				for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
					Static462.anIntArray439[local17] = arg0;
				}
			} else {
				Static462.anIntArray439[arg1] = arg0;
			}
		}
		Static404.aClass5_Sub1_Sub5_2.method8314(arg0, arg1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BC)B")
	public static byte method2156(@OriginalArg(1) char arg0) {
		@Pc(32) byte local32;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local32 = (byte) arg0;
		} else if (arg0 == '€') {
			local32 = -128;
		} else if (arg0 == '‚') {
			local32 = -126;
		} else if (arg0 == 'ƒ') {
			local32 = -125;
		} else if (arg0 == '„') {
			local32 = -124;
		} else if (arg0 == '…') {
			local32 = -123;
		} else if (arg0 == '†') {
			local32 = -122;
		} else if (arg0 == '‡') {
			local32 = -121;
		} else if (arg0 == 'ˆ') {
			local32 = -120;
		} else if (arg0 == '‰') {
			local32 = -119;
		} else if (arg0 == 'Š') {
			local32 = -118;
		} else if (arg0 == '‹') {
			local32 = -117;
		} else if (arg0 == 'Œ') {
			local32 = -116;
		} else if (arg0 == 'Ž') {
			local32 = -114;
		} else if (arg0 == '‘') {
			local32 = -111;
		} else if (arg0 == '’') {
			local32 = -110;
		} else if (arg0 == '“') {
			local32 = -109;
		} else if (arg0 == '”') {
			local32 = -108;
		} else if (arg0 == '•') {
			local32 = -107;
		} else if (arg0 == '–') {
			local32 = -106;
		} else if (arg0 == '—') {
			local32 = -105;
		} else if (arg0 == '˜') {
			local32 = -104;
		} else if (arg0 == '™') {
			local32 = -103;
		} else if (arg0 == 'š') {
			local32 = -102;
		} else if (arg0 == '›') {
			local32 = -101;
		} else if (arg0 == 'œ') {
			local32 = -100;
		} else if (arg0 == 'ž') {
			local32 = -98;
		} else if (arg0 == 'Ÿ') {
			local32 = -97;
		} else {
			local32 = 63;
		}
		return local32;
	}
}
