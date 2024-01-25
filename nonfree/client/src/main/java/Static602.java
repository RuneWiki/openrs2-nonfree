import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public static int anInt9931;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZILjava/lang/String;I)V")
	public static void method8507(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		Static73.method1218();
		if (arg1 == 0) {
			Static103.aClass144_3 = Static11.method237(Static626.aCanvas12, Static181.aClass14_Sub26_9.aClass43_Sub17_2.method4949() * 2, Static160.anInterface4_3, Static75.aClass310_17, 0);
			if (arg2 != null) {
				Static103.aClass144_3.GA(0);
				@Pc(36) Class350 local36 = Static584.method8114(Static564.anInt9377, Static130.aClass310_31);
				@Pc(45) Class68 local45 = Static103.aClass144_3.method6958(local36, Static697.method6470(Static99.aClass310_23, Static564.anInt9377), true);
				Static118.method1852();
				Static478.method7167(local36, local45, true, arg2, Static103.aClass144_3);
			}
		} else {
			@Pc(59) Class144 local59 = null;
			@Pc(87) Class68 local87;
			if (arg2 != null) {
				local59 = Static11.method237(Static626.aCanvas12, 0, Static160.anInterface4_3, Static75.aClass310_17, 0);
				local59.GA(0);
				@Pc(78) Class350 local78 = Static584.method8114(Static564.anInt9377, Static130.aClass310_31);
				local87 = local59.method6958(local78, Static697.method6470(Static99.aClass310_23, Static564.anInt9377), true);
				Static118.method1852();
				Static478.method7167(local78, local87, true, arg2, local59);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static103.aClass144_3 = Static11.method237(Static626.aCanvas12, Static181.aClass14_Sub26_9.aClass43_Sub17_2.method4949() * 2, Static160.anInterface4_3, Static75.aClass310_17, arg1);
					if (arg2 != null) {
						local59.GA(0);
						@Pc(120) Class350 local120 = Static584.method8114(Static564.anInt9377, Static130.aClass310_31);
						@Pc(129) Class68 local129 = local59.method6958(local120, Static697.method6470(Static99.aClass310_23, Static564.anInt9377), true);
						Static118.method1852();
						Static478.method7167(local120, local129, true, arg2, local59);
					}
					if (Static103.aClass144_3.method6966()) {
						@Pc(143) boolean local143 = true;
						try {
							local143 = Static526.aClass14_Sub12_1.anInt1226 > 256;
						} catch (@Pc(154) Throwable local154) {
						}
						@Pc(160) Class14_Sub16 local160;
						if (local143) {
							local160 = Static103.aClass144_3.method6961(146800640);
						} else {
							local160 = Static103.aClass144_3.method6961(104857600);
						}
						Static103.aClass144_3.method6945(local160);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(170) Throwable local170) {
					@Pc(175) int local175 = Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801();
					if (local175 == 2) {
						Static162.aBoolean173 = true;
					}
					Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub1_1);
					method8507(arg0, local175, arg2);
					@Pc(194) Object local194 = null;
					var14 = false;
				} finally {
					if (var14) {
						local87 = null;
						if (local59 != null) {
							try {
								local59.method6932();
							} catch (@Pc(352) Throwable local352) {
							}
						}
					}
				}
				if (local59 != null) {
					try {
						local59.method6932();
					} catch (@Pc(332) Throwable local332) {
					}
				}
				return;
			}
			local87 = null;
			if (local59 != null) {
				try {
					local59.method6932();
				} catch (@Pc(342) Throwable local342) {
				}
			}
		}
		Static181.aClass14_Sub26_9.aClass43_Sub1_1.method804(!arg0);
		Static181.aClass14_Sub26_9.method5270(arg1, Static181.aClass14_Sub26_9.aClass43_Sub1_1);
		Static457.method6749();
		Static103.aClass144_3.method6931();
		Static103.aClass144_3.X(32);
		Static281.aClass263_4 = Static103.aClass144_3.method6914();
		Static467.aClass263_9 = Static103.aClass144_3.method6914();
		Static365.method5498();
		Static103.aClass144_3.method6968(Static181.aClass14_Sub26_9.aClass43_Sub30_1.method8896() == 1);
		if (Static103.aClass144_3.method6904()) {
			Static282.method4746(Static181.aClass14_Sub26_9.aClass43_Sub23_1.method7067() == 1);
		}
		Static226.method5054(Static380.anInt6689 >> 3, Static542.anInt9214 >> 3, Static103.aClass144_3);
		Static452.method6681();
		Static60.aClass386Array1 = null;
		Static411.aBoolean499 = false;
		Static178.aBoolean203 = true;
		Static350.method5351();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method8508(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static591.aClass347_3 = Static277.aClass347_1;
		Static686.anInt11152 = 1;
		Static426.anInt7228 = -1;
		Static56.method1003(arg1, false, arg0, false);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
	public static void method8509(@OriginalArg(0) int arg0) {
		Static686.anInt11152 = 2;
		Static591.aClass347_3 = Static277.aClass347_2;
		Static426.anInt7228 = arg0;
		@Pc(21) String local21 = null;
		if (Static624.aByteArray106 != null) {
			@Pc(28) Class14_Sub21 local28 = new Class14_Sub21(Static624.aByteArray106);
			local21 = Static580.method8268(local28.method7729());
			Static210.aLong121 = local28.method7729();
		}
		if (local21 == null) {
			Static612.method8634(35);
		} else {
			Static56.method1003("", false, local21, true);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
	public static int method8510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static200.anIntArrayArray59 == null ? 0 : Static200.anIntArrayArray59[arg0][arg1] & 0xFFFFFF;
	}
}
