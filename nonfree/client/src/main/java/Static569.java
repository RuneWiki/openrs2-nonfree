import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array15;

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
	public static int anInt10059;

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
	public static int anInt10061;

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
	public static int anInt10058 = 0;

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString131 = null;

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
	public static int anInt10062 = -50;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!dg;)I")
	public static int method8163(@OriginalArg(1) Class2_Sub2_Sub1_Sub1 arg0) {
		@Pc(6) int local6 = arg0.anInt2203;
		@Pc(10) Class171 local10 = arg0.method6316();
		if (arg0.aBoolean645) {
			local6 = arg0.anInt2210;
		} else if (local10.anInt5079 == arg0.anInt7655 || arg0.anInt7655 == local10.anInt5082 || arg0.anInt7655 == local10.anInt5094 || local10.anInt5113 == arg0.anInt7655) {
			local6 = arg0.anInt2200;
		} else if (local10.anInt5115 == arg0.anInt7655 || local10.anInt5080 == arg0.anInt7655 || arg0.anInt7655 == local10.anInt5117 || arg0.anInt7655 == local10.anInt5104) {
			local6 = arg0.anInt2193;
		}
		return local6;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZLjava/lang/String;Lclient!oa;Lclient!ta;Lclient!sga;Z)V")
	public static void method8164(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Class111 arg3, @OriginalArg(4) Class297 arg4) {
		@Pc(15) int local15;
		@Pc(24) int local24;
		if (Static271.aBoolean497 && Static55.method1311()) {
			@Pc(121) Class297 local121 = Static54.aClass297_6;
			@Pc(127) Class111 local127 = arg2.method5346(local121, Static445.aClass20Array1);
			local15 = local121.method7312(null, 250, arg1);
			local24 = local121.method7318(local121.anInt8933, 250, arg1, null);
			@Pc(146) int local146 = Static374.aClass20_3.anInt707;
			@Pc(150) int local150 = local146 + 4;
			local15 += local150 * 2;
			local24 += local150 * 2;
			if (Static449.anInt8549 > local24) {
				local24 = Static449.anInt8549;
			}
			if (local15 < Static128.anInt7242) {
				local15 = Static128.anInt7242;
			}
			@Pc(181) int local181 = Static52.aClass100_1.method2801(Static507.anInt9382, local15) + Static117.anInt2658;
			@Pc(189) int local189 = Static223.aClass237_4.method6027(local24, Static227.anInt4616) + Static18.anInt596;
			arg2.method5275(Static366.aClass20_2, false).method7083(local181 + Static15.aClass20_1.anInt707, Static15.aClass20_1.anInt706 + local189, local15 - Static15.aClass20_1.anInt707 * 2, local24 + -(Static15.aClass20_1.anInt706 * 2));
			arg2.method5275(Static15.aClass20_1, true).method7076(local181, local189);
			Static15.aClass20_1.method815();
			arg2.method5275(Static15.aClass20_1, true).method7076(local181 + local15 - local146, local189);
			Static15.aClass20_1.method810();
			arg2.method5275(Static15.aClass20_1, true).method7076(local181 + local15 - local146, -local146 + local24 + local189);
			Static15.aClass20_1.method815();
			arg2.method5275(Static15.aClass20_1, true).method7076(local181, local24 + local189 - local146);
			Static15.aClass20_1.method810();
			arg2.method5275(Static374.aClass20_3, true).method7083(local181, local189 + Static15.aClass20_1.anInt706, local146, local24 - Static15.aClass20_1.anInt706 * 2);
			Static374.aClass20_3.method817();
			arg2.method5275(Static374.aClass20_3, true).method7083(Static15.aClass20_1.anInt707 + local181, local189, local15 - Static15.aClass20_1.anInt707 * 2, local146);
			Static374.aClass20_3.method817();
			arg2.method5275(Static374.aClass20_3, true).method7083(local15 + local181 - local146, local189 + Static15.aClass20_1.anInt706, local146, local24 - Static15.aClass20_1.anInt706 * 2);
			Static374.aClass20_3.method817();
			arg2.method5275(Static374.aClass20_3, true).method7083(local181 + Static15.aClass20_1.anInt707, -local146 + local24 + local189, local15 - Static15.aClass20_1.anInt707 * 2, local146);
			Static374.aClass20_3.method817();
			local127.method6688(0, Static551.anInt9903 | 0xFF000000, local24 - local150 * 2, local150 + local189, local181 + local150, 0, arg1, null, null, -1, null, 0, local15 - local150 * 2, 1, 1);
			Static30.method982(local181, local189, local15, local24);
		} else {
			local15 = arg4.method7312(null, 250, arg1);
			local24 = arg4.method7313(null, 250, arg1) * 13;
			arg2.C(6, 6, local15 + 4 + 4, 4 + 4 + local24, -16777216, 0);
			arg2.method5334(6, 6, local15 + 4 + 4, local24 + 4 - -4, -1, 0);
			arg3.method6688(0, -1, local24, 10, 10, 0, arg1, null, null, -1, null, 0, local15, 1, 1);
			Static30.method982(6, 6, local15 + 4 + 4, local24 + 8);
		}
		if (arg0) {
			try {
				arg2.method5355();
			} catch (@Pc(409) Exception_Sub1 local409) {
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "([BB)V")
	public static void method8165(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class3_Sub7 local15 = new Class3_Sub7(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method6538();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(29) int[] local29 = Static365.anIntArray462 = new int[6];
					local29[0] = local15.method6535();
					local29[1] = local15.method6535();
					local29[2] = local15.method6535();
					local29[3] = local15.method6535();
					local29[4] = local15.method6535();
					local29[5] = local15.method6535();
				} else {
					@Pc(85) int local85;
					@Pc(90) int local90;
					if (local19 == 4) {
						local85 = local15.method6538();
						Static565.anIntArray659 = new int[local85];
						for (local90 = 0; local90 < local85; local90++) {
							Static565.anIntArray659[local90] = local15.method6535();
							if (Static565.anIntArray659[local90] == 65535) {
								Static565.anIntArray659[local90] = -1;
							}
						}
					} else if (local19 == 5) {
						local85 = local15.method6538();
						Static130.anIntArray192 = new int[local85];
						for (local90 = 0; local90 < local85; local90++) {
							Static130.anIntArray192[local90] = local15.method6535();
							if (Static130.anIntArray192[local90] == 65535) {
								Static130.anIntArray192[local90] = -1;
							}
						}
					}
				}
			}
		}
	}
}
