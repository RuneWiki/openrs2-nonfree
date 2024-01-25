import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
	public static int anInt7139;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Lclient!vea;")
	public static final Class352 aClass352_5 = new Class352(13, 0, 1, 0);

	@OriginalMember(owner = "client!ni", name = "Q", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_127 = new Class73(92, 16);

	@OriginalMember(owner = "client!ni", name = "U", descriptor = "Lclient!mu;")
	public static final Class212 aClass212_15 = new Class212("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!da;)V")
	public static void method5955(@OriginalArg(0) Class34 arg0) {
		Static177.aClass34_13 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIFFFFFF)F")
	public static float method5962(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(17) float local17 = arg2 - arg6;
		@Pc(22) float local22 = arg3 - arg4;
		@Pc(27) float local27 = arg5 - arg1;
		@Pc(29) float local29 = 0.0F;
		@Pc(31) float local31 = 0.0F;
		@Pc(33) float local33 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(41) float local41 = arg6 + local17 * local7;
			@Pc(47) float local47 = arg4 + local22 * local7;
			@Pc(53) float local53 = arg1 + local7 * local27;
			@Pc(58) int local58 = (int) local41 >> 9;
			@Pc(63) int local63 = (int) local53 >> 9;
			if (local58 > 0 && local63 > 0 && local58 < Static306.anInt6176 && local63 < Static108.anInt2930) {
				@Pc(76) int local76 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135;
				if (local76 < 3 && (Static495.aByteArrayArrayArray17[1][local58][local63] & 0x2) != 0) {
					local76++;
				}
				@Pc(105) int local105 = Static150.aClass245Array2[local76].method7580((int) local41, (int) local53);
				if (local47 > (float) local105) {
					if (arg0 >= 2) {
						return method5962(arg0 - 1, local33, local41, local47, local31, local53, local29) * 0.1F + local7 - 0.1F;
					}
					return local7;
				}
			}
			local7 += 0.1F;
			local33 = local53;
			local29 = local41;
			local31 = local47;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method5968(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(30) int local30 = local19 + (arg0 ? Static105.aClass291_1.anInt8601 : Static105.aClass291_1.anInt8600);
		for (@Pc(36) int local36 = local19; local36 < local30; local36++) {
			@Pc(43) Class6_Sub5_Sub14 local43 = Static105.aClass291_1.method7162(local36);
			if (local43.aBoolean335 && local43.method3490().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static40.anInt1429 = -1;
					Static347.aShortArray114 = null;
					return;
				}
				if (local11.length <= local13) {
					@Pc(79) short[] local79 = new short[local11.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local13; local81++) {
						local79[local81] = local11[local81];
					}
					local11 = local79;
				}
				local11[local13++] = (short) local36;
			}
		}
		Static40.anInt1429 = local13;
		Static156.anInt3571 = 0;
		Static347.aShortArray114 = local11;
		@Pc(118) String[] local118 = new String[Static40.anInt1429];
		for (@Pc(120) int local120 = 0; local120 < Static40.anInt1429; local120++) {
			local118[local120] = Static105.aClass291_1.method7162(local11[local120]).method3490();
		}
		Static122.method2608(Static347.aShortArray114, local118);
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(III)V")
	public static void method5973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static156.method3070(arg1)) {
			Static350.method5731(Static299.aClass302ArrayArray2[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "(B)V")
	public static void method5974() {
		Static293.aClass5_6.method6122(Static368.aClass115_4);
		Static293.aClass5_6.DA(Static599.anInt10169, Static107.anInt2889, Static171.anInt3808, Static633.anInt10643);
	}
}
