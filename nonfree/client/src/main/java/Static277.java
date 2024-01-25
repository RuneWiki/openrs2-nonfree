import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_163 = new Class189("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "[I")
	public static final int[] anIntArray344 = new int[1];

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "[I")
	public static final int[] anIntArray345 = new int[100];

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_78 = new Class217(49, 4);

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "Lclient!iv;")
	public static Class119 aClass119_110 = null;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!ob;II)V")
	public static void method3923(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub2_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class1 local16 = arg1.method3514();
		@Pc(26) int local26 = arg1.anInt4396 - arg1.aClass91_7.anInt2732 & 0x3FFF;
		if (arg0 == -1) {
			if (local26 != 0 || arg1.anInt4354 > 25) {
				arg1.aBoolean378 = false;
				if (arg2 < 0 && local16.anInt16 != -1) {
					arg1.anInt4389 = local16.anInt16;
				} else if (arg2 <= 0 || local16.anInt36 == -1) {
					arg1.anInt4389 = local16.anInt40;
				} else {
					arg1.anInt4389 = local16.anInt36;
				}
			} else if (!arg1.aBoolean378 || !local16.method8(arg1.anInt4389)) {
				arg1.anInt4389 = local16.method2();
				arg1.aBoolean378 = arg1.anInt4389 != -1;
			}
		} else if (arg1.anInt4332 != -1 && (local26 >= 10240 || local26 <= 2048)) {
			@Pc(53) int local53 = Static274.anIntArray342[arg3] - arg1.aClass91_7.anInt2732 & 0x3FFF;
			arg1.aBoolean378 = false;
			if (arg0 == 2 && local16.anInt14 != -1) {
				if (local53 > 2048 && local53 <= 6144 && local16.anInt45 != -1) {
					arg1.anInt4389 = local16.anInt45;
				} else if (local53 >= 10240 && local53 < 14336 && local16.anInt43 != -1) {
					arg1.anInt4389 = local16.anInt43;
				} else if (local53 <= 6144 || local53 >= 10240 || local16.anInt48 == -1) {
					arg1.anInt4389 = local16.anInt14;
				} else {
					arg1.anInt4389 = local16.anInt48;
				}
			} else if (arg0 == 0 && local16.anInt11 != -1) {
				if (local53 > 2048 && local53 <= 6144 && local16.anInt32 != -1) {
					arg1.anInt4389 = local16.anInt32;
				} else if (local53 >= 10240 && local53 < 14336 && local16.anInt20 != -1) {
					arg1.anInt4389 = local16.anInt20;
				} else if (local53 <= 6144 || local53 >= 10240 || local16.anInt9 == -1) {
					arg1.anInt4389 = local16.anInt11;
				} else {
					arg1.anInt4389 = local16.anInt9;
				}
			} else if (local53 > 2048 && local53 <= 6144 && local16.anInt5 != -1) {
				arg1.anInt4389 = local16.anInt5;
			} else if (local53 >= 10240 && local53 < 14336 && local16.anInt6 != -1) {
				arg1.anInt4389 = local16.anInt6;
			} else if (local53 <= 6144 || local53 >= 10240 || local16.anInt44 == -1) {
				arg1.anInt4389 = local16.anInt40;
			} else {
				arg1.anInt4389 = local16.anInt44;
			}
		} else if (local26 == 0 && arg1.anInt4354 <= 25) {
			arg1.aBoolean378 = false;
			if (arg0 == 2 && local16.anInt14 != -1) {
				arg1.anInt4389 = local16.anInt14;
			} else if (arg0 == 0 && local16.anInt11 != -1) {
				arg1.anInt4389 = local16.anInt11;
			} else {
				arg1.anInt4389 = local16.anInt40;
			}
		} else {
			arg1.aBoolean378 = false;
			if (arg0 == 2 && local16.anInt14 != -1) {
				if (arg2 < 0 && local16.anInt28 != -1) {
					arg1.anInt4389 = local16.anInt28;
				} else if (arg2 <= 0 || local16.anInt1 == -1) {
					arg1.anInt4389 = local16.anInt14;
				} else {
					arg1.anInt4389 = local16.anInt1;
				}
			} else if (arg0 == 0 && local16.anInt11 != -1) {
				if (arg2 < 0 && local16.anInt18 != -1) {
					arg1.anInt4389 = local16.anInt18;
				} else if (arg2 <= 0 || local16.anInt31 == -1) {
					arg1.anInt4389 = local16.anInt11;
				} else {
					arg1.anInt4389 = local16.anInt31;
				}
			} else if (arg2 < 0 && local16.anInt12 != -1) {
				arg1.anInt4389 = local16.anInt12;
			} else if (arg2 <= 0 || local16.anInt4 == -1) {
				arg1.anInt4389 = local16.anInt40;
			} else {
				arg1.anInt4389 = local16.anInt4;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public static void method3925() {
		Static418.method304();
		Static257.method3784(Static374.aClass20_Sub1_1.aBoolean196);
		Static47.aClass16_2 = Static76.method1507(22050, Static66.aClass143_2, 0, Static392.aCanvas6);
		Static47.aClass16_2.method4113(Static388.aClass3_Sub5_Sub4_1);
		Static42.aClass16_1 = Static76.method1507(2048, Static66.aClass143_2, 1, Static392.aCanvas6);
		Static42.aClass16_1.method4113(Static331.aClass3_Sub5_Sub1_42);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLclient!mq;)V")
	public static void method3926(@OriginalArg(1) Class156 arg0) {
		if (!Static446.aBoolean648) {
			return;
		}
		if (arg0.anObjectArray13 != null) {
			@Pc(14) Class156 local14 = Static109.method1853(Static129.anInt2687, Static213.anInt4082);
			if (local14 != null) {
				@Pc(20) Class3_Sub31 local20 = new Class3_Sub31();
				local20.aClass156_11 = arg0;
				local20.aClass156_12 = local14;
				local20.anObjectArray36 = arg0.anObjectArray13;
				Static285.method4059(local20);
			}
		}
		Static30.method641(Static32.aClass217_11);
		Static302.aClass3_Sub7_Sub1_2.method2636(arg0.anInt4850);
		Static302.aClass3_Sub7_Sub1_2.method2587(Static213.anInt4082);
		Static302.aClass3_Sub7_Sub1_2.method2613(arg0.anInt4868);
		Static302.aClass3_Sub7_Sub1_2.method2614(arg0.anInt4826);
		Static302.aClass3_Sub7_Sub1_2.method2587(Static338.anInt5764);
		Static302.aClass3_Sub7_Sub1_2.method2636(Static129.anInt2687);
	}
}
