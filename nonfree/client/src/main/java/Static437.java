import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Lclient!cd;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "Lclient!gp;")
	public static Class117 aClass117_181;

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "[I")
	public static final int[] anIntArray579 = new int[8];

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)Z")
	public static boolean method6223(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method6224(@OriginalArg(1) Class62 arg0) {
		@Pc(7) int local7 = Static159.anInt3261;
		@Pc(9) int local9 = Static122.anInt2575;
		@Pc(11) int local11 = Static142.anInt2984;
		@Pc(13) int local13 = Static221.anInt4157;
		arg0.method7040(-10660793, local13, local9, local7, local11);
		arg0.method7040(-16777216, 16, local9 + 1, local7 + 1, local11 - 2);
		arg0.method7013(local9 + 18, local13 + -19, -16777216, local7 + 1, local11 - 2);
		Static130.aClass13_2.method7211(-1, local7 + 3, local9 + 14, Static400.aClass40_112.method1063(Static194.anInt3737), -10660793);
		@Pc(72) int local72 = Static280.aClass214_1.method6766();
		@Pc(76) int local76 = Static280.aClass214_1.method6770();
		@Pc(78) int local78 = 0;
		for (@Pc(83) Class5_Sub47 local83 = (Class5_Sub47) Static521.aClass99_78.method2526(); local83 != null; local83 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
			@Pc(98) int local98 = (Static257.anInt5147 - local78 - 1) * 16 + local9 + 31;
			@Pc(100) short local100 = -1;
			if (local7 < local72 && local7 + local11 > local72 && local76 > local98 - 13 && local76 < local98 + 3 && local83.aBoolean611) {
				local100 = -256;
			}
			@Pc(129) int[] local129 = null;
			if (Static225.method3574(local83.anInt8474)) {
				local129 = Static451.aClass67_2.method2006((int) local83.aLong237).anIntArray35;
			} else if (local83.anInt8478 != -1) {
				local129 = Static451.aClass67_2.method2006(local83.anInt8478).anIntArray35;
			} else if (Static448.method6334(local83.anInt8474)) {
				@Pc(161) Class5_Sub51 local161 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local83.aLong237);
				if (local161 != null) {
					@Pc(166) Class15_Sub2_Sub1_Sub2 local166 = local161.aClass15_Sub2_Sub1_Sub2_2;
					@Pc(169) Class305 local169 = local166.aClass305_1;
					if (local169.anIntArray679 != null) {
						local169 = local169.method7150(Static540.aClass242_1);
					}
					if (local169 != null) {
						local129 = local169.anIntArray681;
					}
				}
			} else if (Static311.method5044(local83.anInt8474)) {
				@Pc(205) Class283 local205;
				if (local83.anInt8474 == 1004) {
					local205 = Static453.aClass88_3.method2294((int) local83.aLong237);
				} else {
					local205 = Static453.aClass88_3.method2294((int) (local83.aLong237 >>> 32 & 0x7FFFFFFFL));
				}
				if (local205.anIntArray632 != null) {
					local205 = local205.method6604(Static540.aClass242_1);
				}
				if (local205 != null) {
					local129 = local205.anIntArray633;
				}
			}
			@Pc(239) String local239 = Static477.method6654(local83);
			if (local129 != null) {
				local239 = local239 + Static61.method1174(local129);
			}
			Static130.aClass13_2.method7206(Static372.aClass25Array8, Static208.anIntArray276, local239, local100, local7 + 3, local98);
			if (local83.aBoolean610) {
				Static300.aClass25_15.method6956(Static312.aClass256_7.method6113(local239) + local7 + 5, local98 - 12);
			}
			local78++;
		}
		Static274.method4497(Static159.anInt3261, Static122.anInt2575, Static221.anInt4157, Static142.anInt2984);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI[S)[S")
	public static short[] method6225(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(14) short[] local14 = new short[arg0];
		Static553.method2530(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
