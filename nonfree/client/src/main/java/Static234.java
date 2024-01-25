import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "[I")
	public static final int[] anIntArray320 = new int[4];

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "[I")
	public static final int[] anIntArray322 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
	public static int anInt4073 = 0;

	@OriginalMember(owner = "client!lo", name = "D", descriptor = "[S")
	public static final short[] aShortArray65 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/String;Lclient!ti;)I")
	public static int method3390(@OriginalArg(1) String arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		@Pc(6) int local6 = arg1.anInt5695;
		@Pc(10) byte[] local10 = Static207.method3161(arg0);
		arg1.method4538(local10.length);
		arg1.anInt5695 += Static347.aClass217_1.method5121(local10, 0, local10.length, arg1.aByteArray65, arg1.anInt5695);
		return arg1.anInt5695 - local6;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLclient!ti;ILclient!ci;)V")
	public static void method3394(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(9) Class1_Sub39 local9 = new Class1_Sub39();
		local9.anInt6555 = arg0.method4548();
		local9.anInt6554 = arg0.method4500();
		local9.anIntArray481 = new int[local9.anInt6555];
		local9.aClass159Array1 = new Class159[local9.anInt6555];
		local9.aByteArrayArrayArray16 = new byte[local9.anInt6555][][];
		local9.aClass159Array2 = new Class159[local9.anInt6555];
		local9.anIntArray482 = new int[local9.anInt6555];
		local9.anIntArray480 = new int[local9.anInt6555];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt6555; local51++) {
			try {
				@Pc(57) int local57 = arg0.method4548();
				@Pc(74) String local74;
				@Pc(78) String local78;
				@Pc(80) int local80;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local74 = arg0.method4509();
					local78 = arg0.method4509();
					local80 = 0;
					if (local57 == 1) {
						local80 = arg0.method4500();
					}
					local9.anIntArray482[local51] = local57;
					local9.anIntArray480[local51] = local80;
					local9.aClass159Array2[local51] = arg2.method663(Static211.method3187(local74), local78);
				} else if (local57 == 3 || local57 == 4) {
					local74 = arg0.method4509();
					local78 = arg0.method4509();
					local80 = arg0.method4548();
					@Pc(133) String[] local133 = new String[local80];
					for (@Pc(135) int local135 = 0; local135 < local80; local135++) {
						local133[local135] = arg0.method4509();
					}
					@Pc(150) byte[][] local150 = new byte[local80][];
					@Pc(161) int local161;
					if (local57 == 3) {
						for (@Pc(155) int local155 = 0; local155 < local80; local155++) {
							local161 = arg0.method4500();
							local150[local155] = new byte[local161];
							arg0.method4511(local150[local155], local161);
						}
					}
					local9.anIntArray482[local51] = local57;
					@Pc(186) Class[] local186 = new Class[local80];
					for (local161 = 0; local161 < local80; local161++) {
						local186[local161] = Static211.method3187(local133[local161]);
					}
					local9.aClass159Array1[local51] = arg2.method645(local186, Static211.method3187(local74), local78);
					local9.aByteArrayArrayArray16[local51] = local150;
				}
			} catch (@Pc(225) ClassNotFoundException local225) {
				local9.anIntArray481[local51] = -1;
			} catch (@Pc(232) SecurityException local232) {
				local9.anIntArray481[local51] = -2;
			} catch (@Pc(239) NullPointerException local239) {
				local9.anIntArray481[local51] = -3;
			} catch (@Pc(246) Exception local246) {
				local9.anIntArray481[local51] = -4;
			} catch (@Pc(253) Throwable local253) {
				local9.anIntArray481[local51] = -5;
			}
		}
		Static50.aClass142_9.method3212(local9);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!qa;BLclient!hh;)V")
	public static void method3398(@OriginalArg(0) Class121 arg0, @OriginalArg(2) Class109 arg1) {
		if (Static248.aBoolean343) {
			return;
		}
		arg0.M(0);
		Static287.aClass78_17 = arg0.method4589(Static457.method1171(arg1, Static362.anInt6604));
		Static287.aClass78_17.method6003((Static403.anInt7142 - Static287.aClass78_17.ja()) / 2, (Static324.anInt5725 - Static287.aClass78_17.JA()) / 2);
		Static403.aClass78_21 = arg0.method4589(Static457.method1171(arg1, Static96.anInt1882));
		Static403.aClass78_21.method6003((Static403.anInt7142 - Static403.aClass78_21.ja()) / 2, 18);
		Static248.aBoolean343 = true;
	}
}
