import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Lclient!haa;")
	public static final Class127 aClass127_15 = new Class127();

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
	public static int anInt9410 = -1;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "[I")
	public static final int[] anIntArray499 = new int[3];

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	public static int anInt9412 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I")
	public static int method7673(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method7675(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = Static6.anInt462;
		@Pc(9) int[] local9 = Static551.anIntArray503;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class9_Sub4_Sub2_Sub1_Sub2 local21 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local9[local13]];
			if (local21 != null && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 != local21 && local21.aString46 != null && local21.aString46.equalsIgnoreCase(arg1)) {
				local11 = true;
				@Pc(48) Class6_Sub17 local48;
				if (arg0 == 1) {
					local48 = Static330.method7824(Static127.aClass185_31, Static569.aClass134_2);
					local48.aClass6_Sub8_Sub1_2.method8212(local9[local13]);
					local48.aClass6_Sub8_Sub1_2.method8223(0);
					Static452.method6867(local48);
				} else if (arg0 == 4) {
					local48 = Static330.method7824(Static525.aClass185_100, Static569.aClass134_2);
					local48.aClass6_Sub8_Sub1_2.method8223(0);
					local48.aClass6_Sub8_Sub1_2.method8241(local9[local13]);
					Static452.method6867(local48);
				} else if (arg0 == 5) {
					local48 = Static330.method7824(Static228.aClass185_50, Static569.aClass134_2);
					local48.aClass6_Sub8_Sub1_2.method8255(local9[local13]);
					local48.aClass6_Sub8_Sub1_2.method8248(0);
					Static452.method6867(local48);
				} else if (arg0 == 6) {
					local48 = Static330.method7824(Static97.aClass185_25, Static569.aClass134_2);
					local48.aClass6_Sub8_Sub1_2.method8261(0);
					local48.aClass6_Sub8_Sub1_2.method8241(local9[local13]);
					Static452.method6867(local48);
				} else if (arg0 == 7) {
					local48 = Static330.method7824(Static490.aClass185_52, Static569.aClass134_2);
					local48.aClass6_Sub8_Sub1_2.method8223(0);
					local48.aClass6_Sub8_Sub1_2.method8241(local9[local13]);
					Static452.method6867(local48);
				}
				break;
			}
		}
		if (!local11) {
			Static238.method4329(Static536.aClass316_23.method7577(Static638.anInt10709) + arg1);
		}
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(II)V")
	public static void method7680(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub5_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class245 local8 = Static150.aClass245Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static142.anInt3372; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static623.anInt10485; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static606.anInt10280;
							@Pc(32) int local32 = local12 << Static606.anInt10280;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class245 local41 = Static150.aClass245Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7583(local12, local15) - local41.method7583(local12, local15);
									@Pc(71) int local71 = local8.method7583(local12, local15 + 1) - local41.method7583(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7583(local12 + 1, local15 + 1) - local41.method7583(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7583(local12 + 1, local15) - local41.method7583(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
