import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_109 = new Class306("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "J")
	public static long aLong319 = 0L;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!ge;)Lclient!vg;")
	public static Class300 method6249(@OriginalArg(1) Class1_Sub6 arg0) {
		@Pc(7) Class300 local7 = new Class300();
		local7.anInt8615 = arg0.method3967();
		local7.aClass1_Sub1_Sub10_1 = Static480.aClass32_2.method922(local7.anInt8615);
		return local7;
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
	public static void method6250() {
		Static271.anInt5150 = 0;
		@Pc(18) boolean local18 = Static97.aClass1_Sub6_Sub2_1.method3922() == 1;
		@Pc(22) int local22 = Static97.aClass1_Sub6_Sub2_1.method3943();
		@Pc(26) int local26 = Static97.aClass1_Sub6_Sub2_1.method3943();
		@Pc(30) int local30 = Static97.aClass1_Sub6_Sub2_1.method3918();
		Static176.method2651();
		Static491.method6722(local30);
		@Pc(44) int local44 = (Static405.anInt9105 - Static97.aClass1_Sub6_Sub2_1.anInt4555) / 16;
		Static13.anIntArrayArray4 = new int[local44][4];
		@Pc(54) int local54;
		for (@Pc(50) int local50 = 0; local50 < local44; local50++) {
			for (local54 = 0; local54 < 4; local54++) {
				Static13.anIntArrayArray4[local50][local54] = Static97.aClass1_Sub6_Sub2_1.method3925();
			}
		}
		Static9.anIntArray23 = new int[local44];
		Static356.anIntArray641 = new int[local44];
		Static529.aByteArrayArray32 = new byte[local44][];
		Static226.anIntArray440 = null;
		Static381.aByteArrayArray20 = null;
		Static453.anIntArray725 = new int[local44];
		Static388.anIntArray681 = new int[local44];
		Static449.aByteArrayArray27 = new byte[local44][];
		Static433.anIntArray716 = new int[local44];
		Static324.aByteArrayArray16 = new byte[local44][];
		Static227.aByteArrayArray10 = new byte[local44][];
		local44 = 0;
		for (local54 = (local22 - (Static459.anInt7799 >> 4)) / 8; local54 <= ((Static459.anInt7799 >> 4) + local22) / 8; local54++) {
			for (@Pc(131) int local131 = (local26 - (Static482.anInt7990 >> 4)) / 8; local131 <= (local26 + (Static482.anInt7990 >> 4)) / 8; local131++) {
				Static9.anIntArray23[local44] = (local54 << 8) + local131;
				Static433.anIntArray716[local44] = Static223.aClass171_77.method4338("m" + local54 + "_" + local131);
				Static388.anIntArray681[local44] = Static223.aClass171_77.method4338("l" + local54 + "_" + local131);
				Static453.anIntArray725[local44] = Static223.aClass171_77.method4338("um" + local54 + "_" + local131);
				Static356.anIntArray641[local44] = Static223.aClass171_77.method4338("ul" + local54 + "_" + local131);
				local44++;
			}
		}
		Static329.method5062(local22, local26, 10, local18);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static334.method5103(arg0, arg1) || Static399.method6031(arg0, arg1);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
	public static String method6253(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local22 = true;
		}
		@Pc(36) StringBuffer local36 = new StringBuffer(26);
		@Pc(41) int local41;
		@Pc(46) int local46;
		if (arg3 > 0) {
			for (local41 = 0; local41 < arg3; local41++) {
				local46 = (int) arg1;
				arg1 /= 10L;
				local36.append((char) (local46 + 48 - (int) arg1 * 10));
			}
			local36.append(local7);
		}
		local41 = 0;
		while (true) {
			local46 = (int) arg1;
			arg1 /= 10L;
			local36.append((char) (local46 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local22) {
					local36.append('-');
				}
				return local36.reverse().toString();
			}
			if (arg0) {
				local41++;
				if (local41 % 3 == 0) {
					local36.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZII)Z")
	public static boolean method6254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static328.method5046(arg0, arg1) || Static499.method6935(arg0, arg1);
	}
}
