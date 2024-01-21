import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Z")
	public static boolean aBoolean78;

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "Lclient!ge;")
	public static Class7 aClass7_31;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "J")
	public static long aLong41;

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_8;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	public static int anInt1583 = 0;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
	public static int anInt1586 = 1;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Lclient!rd;")
	public static Class63 aClass63_840 = Static80.method1463("Welt");

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "Lclient!rd;")
	public static Class63 aClass63_841 = Static80.method1463("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "Lclient!rd;")
	private static Class63 aClass63_842 = Static80.method1463("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "Lclient!rd;")
	public static Class63 aClass63_843 = aClass63_842;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
	public static int anInt1596 = 0;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "Lclient!rd;")
	public static Class63 aClass63_844 = Static80.method1463("_");

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	public static int anInt1599 = 0;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!rd;")
	public static Class63 aClass63_845 = Static80.method1463("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
	public static void method1070(@OriginalArg(1) boolean arg0) {
		if (Static18.aClass47_1 == null) {
			return;
		}
		try {
			@Pc(11) Class6_Sub4 local11 = new Class6_Sub4(4);
			local11.method1330(arg0 ? 2 : 3);
			local11.method1319(0);
			Static18.aClass47_1.method1377(4, local11.aByteArray27);
		} catch (@Pc(41) IOException local41) {
			try {
				Static18.aClass47_1.method1378();
			} catch (@Pc(48) Exception local48) {
			}
			Static67.anInt1854++;
			Static18.aClass47_1 = null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!bf;IBLclient!ba;)V")
	public static void method1071(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8 arg2) {
		@Pc(9) Class6_Sub12 local9 = new Class6_Sub12();
		local9.anInt2237 = arg0.method1321();
		local9.anInt2239 = arg0.method1289();
		local9.aClass20Array1 = new Class20[local9.anInt2237];
		local9.aByteArrayArrayArray63 = new byte[local9.anInt2237][][];
		local9.anIntArray254 = new int[local9.anInt2237];
		local9.anIntArray253 = new int[local9.anInt2237];
		local9.anIntArray252 = new int[local9.anInt2237];
		local9.aClass20Array2 = new Class20[local9.anInt2237];
		for (@Pc(59) int local59 = 0; local59 < local9.anInt2237; local59++) {
			try {
				@Pc(65) int local65 = arg0.method1321();
				@Pc(84) String local84;
				@Pc(95) String local95;
				@Pc(86) int local86;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local84 = new String(arg0.method1339().method1830());
					local86 = 0;
					local95 = new String(arg0.method1339().method1830());
					if (local65 == 1) {
						local86 = arg0.method1289();
					}
					local9.anIntArray254[local59] = local65;
					local9.anIntArray253[local59] = local86;
					local9.aClass20Array1[local59] = arg2.method147(local95, Static13.method344(local84));
				} else if (local65 == 3 || local65 == 4) {
					local84 = new String(arg0.method1339().method1830());
					local95 = new String(arg0.method1339().method1830());
					local86 = arg0.method1321();
					@Pc(160) String[] local160 = new String[local86];
					for (@Pc(162) int local162 = 0; local162 < local86; local162++) {
						local160[local162] = new String(arg0.method1339().method1830());
					}
					@Pc(186) byte[][] local186 = new byte[local86][];
					@Pc(199) int local199;
					if (local65 == 3) {
						for (@Pc(193) int local193 = 0; local193 < local86; local193++) {
							local199 = arg0.method1289();
							local186[local193] = new byte[local199];
							arg0.method1307(local186[local193], local199);
						}
					}
					local9.anIntArray254[local59] = local65;
					@Pc(224) Class[] local224 = new Class[local86];
					for (local199 = 0; local199 < local86; local199++) {
						local224[local199] = Static13.method344(local160[local199]);
					}
					local9.aClass20Array2[local59] = arg2.method148(Static13.method344(local84), local95, local224);
					local9.aByteArrayArrayArray63[local59] = local186;
				}
			} catch (@Pc(259) ClassNotFoundException local259) {
				local9.anIntArray252[local59] = -1;
			} catch (@Pc(266) SecurityException local266) {
				local9.anIntArray252[local59] = -2;
			} catch (@Pc(273) NullPointerException local273) {
				local9.anIntArray252[local59] = -3;
			} catch (@Pc(280) Exception local280) {
				local9.anIntArray252[local59] = -4;
			} catch (@Pc(287) Throwable local287) {
				local9.anIntArray252[local59] = -5;
			}
		}
		Static114.aClass1_11.method10(local9);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method1072() {
		aClass63_842 = null;
		aClass7_31 = null;
		aClass63_845 = null;
		aClass7_Sub1_8 = null;
		aClass63_841 = null;
		aClass63_843 = null;
		aClass63_840 = null;
		aClass63_844 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!rd;)Z")
	public static boolean method1073(@OriginalArg(1) Class63 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static5.anInt52; local16++) {
			if (arg0.method1822(Static65.aClass63Array16[local16])) {
				return true;
			}
		}
		return arg0.method1822(Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.aClass63_1237);
	}
}
