import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
	public static int anInt2195;

	@OriginalMember(owner = "client!lh", name = "O", descriptor = "Lclient!bc;")
	public static Class1 aClass1_16;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
	public static int anInt2186 = 0;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "[I")
	public static final int[] anIntArray302 = new int[5];

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_887 = Static120.method1824("<br>");

	@OriginalMember(owner = "client!lh", name = "G", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_889 = Static120.method1824("Hidden)2");

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_891 = Static120.method1824("No response from server)3");

	@OriginalMember(owner = "client!lh", name = "H", descriptor = "Lclient!rd;")
	public static Class80 aClass80_890 = aClass80_891;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
	public static void method1557() {
		@Pc(10) int local10 = Static63.aClass3_Sub17_Sub1_2.method2152(8);
		@Pc(15) int local15;
		if (local10 < Static15.anInt327) {
			for (local15 = local10; local15 < Static15.anInt327; local15++) {
				Static36.anIntArray109[Static41.anInt906++] = Static168.anIntArray460[local15];
			}
		}
		if (Static15.anInt327 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static15.anInt327 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(54) int local54 = Static168.anIntArray460[local15];
			@Pc(58) Class3_Sub1_Sub5_Sub4_Sub2 local58 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local54];
			@Pc(63) int local63 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
			if (local63 == 0) {
				Static168.anIntArray460[Static15.anInt327++] = local54;
				local58.anInt4314 = Static193.anInt4411;
			} else {
				@Pc(85) int local85 = Static63.aClass3_Sub17_Sub1_2.method2152(2);
				if (local85 == 0) {
					Static168.anIntArray460[Static15.anInt327++] = local54;
					local58.anInt4314 = Static193.anInt4411;
					Static3.anIntArray24[Static33.anInt779++] = local54;
				} else {
					@Pc(132) int local132;
					@Pc(142) int local142;
					if (local85 == 1) {
						Static168.anIntArray460[Static15.anInt327++] = local54;
						local58.anInt4314 = Static193.anInt4411;
						local132 = Static63.aClass3_Sub17_Sub1_2.method2152(3);
						local58.method3067(local132, false);
						local142 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
						if (local142 == 1) {
							Static3.anIntArray24[Static33.anInt779++] = local54;
						}
					} else if (local85 == 2) {
						Static168.anIntArray460[Static15.anInt327++] = local54;
						local58.anInt4314 = Static193.anInt4411;
						local132 = Static63.aClass3_Sub17_Sub1_2.method2152(3);
						local58.method3067(local132, true);
						local142 = Static63.aClass3_Sub17_Sub1_2.method2152(3);
						local58.method3067(local142, true);
						@Pc(198) int local198 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
						if (local198 == 1) {
							Static3.anIntArray24[Static33.anInt779++] = local54;
						}
					} else if (local85 == 3) {
						Static36.anIntArray109[Static41.anInt906++] = local54;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILclient!qf;)V")
	public static void method1558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class77 arg2) {
		if (Static58.anInt1284 != 0 && Static58.anInt1284 != 3) {
			return;
		}
		@Pc(18) int local18 = arg1 - arg2.anInt3221 / 2;
		@Pc(25) int local25 = arg0 - arg2.anInt3251 / 2;
		@Pc(31) int local31 = Static126.anInt2707 + Static126.anInt2704 & 0x7FF;
		@Pc(39) int local39 = Class3_Sub1_Sub4_Sub2.anIntArray188[local31];
		@Pc(43) int local43 = Class3_Sub1_Sub4_Sub2.anIntArray190[local31];
		@Pc(51) int local51 = local43 * (Static148.anInt3314 + 256) >> 8;
		@Pc(59) int local59 = (Static148.anInt3314 + 256) * local39 >> 8;
		@Pc(70) int local70 = local51 * local18 - local25 * local59 >> 11;
		@Pc(80) int local80 = local25 * local51 + local59 * local18 >> 11;
		@Pc(88) int local88 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 + local80 >> 7;
		@Pc(96) int local96 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 - local70 >> 7;
		@Pc(116) boolean local116 = Static27.method3147(0, local96, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local88, true, 1, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 0, 0);
		if (!local116) {
			return;
		}
		Static146.aClass3_Sub17_Sub1_3.method2108(local25);
		Static146.aClass3_Sub17_Sub1_3.method2108(local18);
		Static146.aClass3_Sub17_Sub1_3.method2092(Static126.anInt2704);
		Static146.aClass3_Sub17_Sub1_3.method2108(57);
		Static146.aClass3_Sub17_Sub1_3.method2108(Static126.anInt2707);
		Static146.aClass3_Sub17_Sub1_3.method2108(Static148.anInt3314);
		Static146.aClass3_Sub17_Sub1_3.method2108(89);
		Static146.aClass3_Sub17_Sub1_3.method2092(Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329);
		Static146.aClass3_Sub17_Sub1_3.method2092(Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315);
		Static146.aClass3_Sub17_Sub1_3.method2108(Static116.anInt4481);
		Static146.aClass3_Sub17_Sub1_3.method2108(63);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)Z")
	public static boolean method1559(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!bc;Lclient!rd;Lclient!rd;)Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 method1561(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) Class80 arg2) {
		@Pc(8) int local8 = arg0.method53(arg1);
		@Pc(14) int local14 = arg0.method33(arg2, local8);
		return Static50.method741(local14, local8, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)V")
	public static void method1562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg4) {
			Static16.method274(arg1, arg2, arg0, arg3);
		} else if (arg0 - arg1 >= Static172.anInt3861 && arg0 + arg1 <= Static85.anInt1779 && Static34.anInt790 <= arg2 - arg4 && arg4 + arg2 <= Static17.anInt440) {
			Static176.method2826(arg4, arg1, arg0, arg3, arg2);
		} else {
			Static183.method2932(arg3, arg0, arg2, arg4, arg1);
		}
	}
}
