import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!in", name = "u", descriptor = "Lclient!tp;")
	public static Class229 aClass229_3;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "I")
	public static int anInt2658;

	@OriginalMember(owner = "client!in", name = "x", descriptor = "[I")
	public static int[] anIntArray322;

	@OriginalMember(owner = "client!in", name = "C", descriptor = "Lclient!dp;")
	public static Class51 aClass51_6;

	@OriginalMember(owner = "client!in", name = "D", descriptor = "[Lclient!v;")
	public static Class234[] aClass234Array3;

	@OriginalMember(owner = "client!in", name = "z", descriptor = "I")
	public static final int anInt2660 = 1405;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!bk;Lclient!bk;)V")
	public static void method2158(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg1.aClass1_Sub6_53 != null) {
			arg1.method5580();
		}
		arg1.aClass1_Sub6_53 = arg0;
		arg1.aClass1_Sub6_54 = arg0.aClass1_Sub6_54;
		arg1.aClass1_Sub6_53.aClass1_Sub6_54 = arg1;
		arg1.aClass1_Sub6_54.aClass1_Sub6_53 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZZ)V")
	public static void method2159(@OriginalArg(1) boolean arg0) {
		Static367.anInt5917 = 0;
		Static382.anInt6197 = 0;
		Static286.method4345();
		Static134.method1979(arg0);
		Static108.method1519();
		@Pc(31) int local31;
		for (@Pc(25) int local25 = 0; local25 < Static367.anInt5917; local25++) {
			local31 = Static88.anIntArray214[local25];
			if (Static366.anInt5883 != Static171.aClass25_Sub1_Sub1_Sub2Array1[local31].anInt2319) {
				if (Static171.aClass25_Sub1_Sub1_Sub2Array1[local31].aClass59_1.method1148()) {
					Static135.method2029(Static171.aClass25_Sub1_Sub1_Sub2Array1[local31]);
				}
				Static171.aClass25_Sub1_Sub1_Sub2Array1[local31].method1899(null);
				Static171.aClass25_Sub1_Sub1_Sub2Array1[local31] = null;
			}
		}
		if (Static139.aClass1_Sub33_Sub2_1.lb != Static121.anInt2167) {
			throw new RuntimeException("gnp1 pos:" + Static139.aClass1_Sub33_Sub2_1.lb + " psize:" + Static121.anInt2167);
		}
		for (local31 = 0; local31 < Static309.anInt5243; local31++) {
			if (Static171.aClass25_Sub1_Sub1_Sub2Array1[Static131.anIntArray302[local31]] == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static309.anInt5243);
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BC)B")
	public static byte method2162(@OriginalArg(1) char arg0) {
		@Pc(33) byte local33;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local33 = (byte) arg0;
		} else if (arg0 == '€') {
			local33 = -128;
		} else if (arg0 == '‚') {
			local33 = -126;
		} else if (arg0 == 'ƒ') {
			local33 = -125;
		} else if (arg0 == '„') {
			local33 = -124;
		} else if (arg0 == '…') {
			local33 = -123;
		} else if (arg0 == '†') {
			local33 = -122;
		} else if (arg0 == '‡') {
			local33 = -121;
		} else if (arg0 == 'ˆ') {
			local33 = -120;
		} else if (arg0 == '‰') {
			local33 = -119;
		} else if (arg0 == 'Š') {
			local33 = -118;
		} else if (arg0 == '‹') {
			local33 = -117;
		} else if (arg0 == 'Œ') {
			local33 = -116;
		} else if (arg0 == 'Ž') {
			local33 = -114;
		} else if (arg0 == '‘') {
			local33 = -111;
		} else if (arg0 == '’') {
			local33 = -110;
		} else if (arg0 == '“') {
			local33 = -109;
		} else if (arg0 == '”') {
			local33 = -108;
		} else if (arg0 == '•') {
			local33 = -107;
		} else if (arg0 == '–') {
			local33 = -106;
		} else if (arg0 == '—') {
			local33 = -105;
		} else if (arg0 == '˜') {
			local33 = -104;
		} else if (arg0 == '™') {
			local33 = -103;
		} else if (arg0 == 'š') {
			local33 = -102;
		} else if (arg0 == '›') {
			local33 = -101;
		} else if (arg0 == 'œ') {
			local33 = -100;
		} else if (arg0 == 'ž') {
			local33 = -98;
		} else if (arg0 == 'Ÿ') {
			local33 = -97;
		} else {
			local33 = 63;
		}
		return local33;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!ui;Lclient!ui;)V")
	public static void method2163(@OriginalArg(1) Class230 arg0, @OriginalArg(2) Class230 arg1) {
		Static37.aClass230_12 = arg0;
		Static25.aClass230_6 = arg1;
	}
}
