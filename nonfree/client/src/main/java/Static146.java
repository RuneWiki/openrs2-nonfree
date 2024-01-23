import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!nk", name = "Fb", descriptor = "[Lclient!vf;")
	public static Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array6;

	@OriginalMember(owner = "client!nk", name = "Ib", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!nk", name = "Jb", descriptor = "I")
	public static int anInt3070;

	@OriginalMember(owner = "client!nk", name = "Lb", descriptor = "Lclient!qh;")
	public static Class93 aClass93_90;

	@OriginalMember(owner = "client!nk", name = "Pb", descriptor = "I")
	public static int anInt3072;

	@OriginalMember(owner = "client!nk", name = "Db", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1014 = Static186.method3527(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!nk", name = "Kb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1015 = Static186.method3527(" )2>");

	@OriginalMember(owner = "client!nk", name = "Nb", descriptor = "[I")
	public static int[] anIntArray316 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!nk", name = "Tb", descriptor = "I")
	public static int anInt3076 = 127;

	@OriginalMember(owner = "client!nk", name = "Vb", descriptor = "Z")
	public static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!pa;)Lclient!vf;")
	public static Class1_Sub1_Sub8 method2474(@OriginalArg(0) int arg0, @OriginalArg(2) Class86 arg1) {
		return Static116.method1858(arg0, arg1) ? Static114.method1851() : null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!pg;B)Lclient!hh;")
	public static Class50 method2476(@OriginalArg(0) Class1_Sub17 arg0) {
		return Static164.method2729(arg0);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(JI)V")
	public static void method2477(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static21.anInt420; local12++) {
			if (arg0 == Static129.aLongArray6[local12]) {
				Static21.anInt420--;
				for (@Pc(30) int local30 = local12; local30 < Static21.anInt420; local30++) {
					Static149.aClass50Array58[local30] = Static149.aClass50Array58[local30 + 1];
					Static206.anIntArray467[local30] = Static206.anIntArray467[local30 + 1];
					Static131.aClass50Array50[local30] = Static131.aClass50Array50[local30 + 1];
					Static129.aLongArray6[local30] = Static129.aLongArray6[local30 + 1];
					Static113.anIntArray254[local30] = Static113.anIntArray254[local30 + 1];
					Static11.aBooleanArray1[local30] = Static11.aBooleanArray1[local30 + 1];
				}
				Static205.anInt4112 = Static31.anInt594;
				Static32.aClass1_Sub17_Sub1_1.method2182(214);
				Static32.aClass1_Sub17_Sub1_1.method2171(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V")
	public static void method2478() {
		@Pc(14) int local14 = Static97.aClass1_Sub17_Sub1_2.method2181(8);
		@Pc(19) int local19;
		if (Static13.anInt250 > local14) {
			for (local19 = local14; local19 < Static13.anInt250; local19++) {
				Static101.anIntArray190[Static13.anInt249++] = Static52.anIntArray356[local19];
			}
		}
		if (Static13.anInt250 < local14) {
			throw new RuntimeException("gppov1");
		}
		Static13.anInt250 = 0;
		for (local19 = 0; local19 < local14; local19++) {
			@Pc(57) int local57 = Static52.anIntArray356[local19];
			@Pc(61) Class20_Sub3_Sub1 local61 = Static232.aClass20_Sub3_Sub1Array1[local57];
			@Pc(66) int local66 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
			if (local66 == 0) {
				Static52.anIntArray356[Static13.anInt250++] = local57;
				local61.anInt3018 = Static107.anInt2132;
			} else {
				@Pc(86) int local86 = Static97.aClass1_Sub17_Sub1_2.method2181(2);
				if (local86 == 0) {
					Static52.anIntArray356[Static13.anInt250++] = local57;
					local61.anInt3018 = Static107.anInt2132;
					Static164.anIntArray360[Static80.anInt1584++] = local57;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local86 == 1) {
						Static52.anIntArray356[Static13.anInt250++] = local57;
						local61.anInt3018 = Static107.anInt2132;
						local133 = Static97.aClass1_Sub17_Sub1_2.method2181(3);
						local61.method2472(false, local133);
						local143 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
						if (local143 == 1) {
							Static164.anIntArray360[Static80.anInt1584++] = local57;
						}
					} else if (local86 == 2) {
						Static52.anIntArray356[Static13.anInt250++] = local57;
						local61.anInt3018 = Static107.anInt2132;
						local133 = Static97.aClass1_Sub17_Sub1_2.method2181(3);
						local61.method2472(true, local133);
						local143 = Static97.aClass1_Sub17_Sub1_2.method2181(3);
						local61.method2472(true, local143);
						@Pc(197) int local197 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
						if (local197 == 1) {
							Static164.anIntArray360[Static80.anInt1584++] = local57;
						}
					} else if (local86 == 3) {
						Static101.anIntArray190[Static13.anInt249++] = local57;
					}
				}
			}
		}
	}
}
