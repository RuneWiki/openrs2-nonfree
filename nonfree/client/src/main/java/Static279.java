import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread3;

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
	public static int anInt5259;

	@OriginalMember(owner = "client!vf", name = "O", descriptor = "[I")
	public static int[] anIntArray464 = new int[5];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([Lclient!cc;BI)V")
	public static void method4159(@OriginalArg(0) Class22[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(19) Class22 local19 = arg0[local11];
			if (local19 != null && arg1 == local19.anInt587 && (!local19.aBoolean33 || !Static40.method675(local19))) {
				if (local19.anInt542 == 0) {
					if (!local19.aBoolean33 && Static40.method675(local19) && local19 != Static126.aClass22_12) {
						continue;
					}
					method4159(arg0, local19.anInt596);
					if (local19.aClass22Array1 != null) {
						method4159(local19.aClass22Array1, local19.anInt596);
					}
					@Pc(81) Class4_Sub10 local81 = (Class4_Sub10) Static227.aClass97_16.method2360((long) local19.anInt596);
					if (local81 != null) {
						Static159.method2494(local81.anInt1032);
					}
				}
				if (local19.anInt542 == 6) {
					@Pc(115) int local115;
					if (local19.anInt622 != -1 || local19.anInt591 != -1) {
						@Pc(110) boolean local110 = Static254.method3834(local19);
						if (local110) {
							local115 = local19.anInt591;
						} else {
							local115 = local19.anInt622;
						}
						if (local115 != -1) {
							@Pc(129) Class141 local129 = Static296.method1376(local115);
							if (local129 != null) {
								local19.anInt578 += Static16.anInt307;
								while (local19.anInt578 > local129.anIntArray392[local19.anInt632]) {
									local19.anInt578 -= local129.anIntArray392[local19.anInt632];
									local19.anInt632++;
									if (local129.anIntArray390.length <= local19.anInt632) {
										local19.anInt632 -= local129.anInt4367;
										if (local19.anInt632 < 0 || local129.anIntArray390.length <= local19.anInt632) {
											local19.anInt632 = 0;
										}
									}
									local19.anInt576 = local19.anInt632 + 1;
									if (local129.anIntArray390.length <= local19.anInt576) {
										local19.anInt576 -= local129.anInt4367;
										if (local19.anInt576 < 0 || local19.anInt576 >= local129.anIntArray390.length) {
											local19.anInt576 = -1;
										}
									}
									Static81.method3274(local19);
								}
							}
						}
					}
					if (local19.anInt575 != 0 && !local19.aBoolean33) {
						local115 = local19.anInt575 << 16 >> 16;
						local115 *= Static16.anInt307;
						local19.anInt617 = local115 + local19.anInt617 & 0x7FF;
						@Pc(272) int local272 = local19.anInt575 >> 16;
						@Pc(276) int local276 = local272 * Static16.anInt307;
						local19.anInt621 = local276 + local19.anInt621 & 0x7FF;
						Static81.method3274(local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	public static void method4160(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static106.aString68 = arg2;
		Static268.aString184 = arg0;
		Static292.anInt5465 = arg1;
		if (Static106.aString68.equals("") || Static268.aString184.equals("")) {
			Static254.anInt4785 = 3;
		} else if (Static211.anInt4204 == -1) {
			Static192.anInt3794 = 0;
			Static184.anInt3615 = 1;
			Static177.anInt3486 = 0;
			Static254.anInt4785 = -3;
			@Pc(41) Class4_Sub17 local41 = new Class4_Sub17(128);
			local41.method1861(10);
			local41.method1854((int) (Math.random() * 9.9999999E7D));
			local41.method1891(Static34.method491(Static106.aString68));
			local41.method1854((int) (Math.random() * 9.9999999E7D));
			local41.method1849(Static268.aString184);
			local41.method1854((int) (Math.random() * 9.9999999E7D));
			local41.method1857(Static138.aBigInteger1, Static172.aBigInteger2);
			Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
			Static142.aClass4_Sub17_Sub1_3.method1861(24);
			Static142.aClass4_Sub17_Sub1_3.method1861(local41.anInt2400 + 2);
			Static142.aClass4_Sub17_Sub1_3.method1875(542);
			Static142.aClass4_Sub17_Sub1_3.method1878(local41.anInt2400, local41.aByteArray30);
		} else {
			Static47.method748();
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(BI)V")
	public static void method4161() {
		Static227.aClass33_30.method838(5);
		Static219.aClass33_32.method838(5);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V")
	public static void method4162(@OriginalArg(0) int arg0) {
		Static275.anInt5137 = arg0;
		Static6.method137(3);
		Static6.method137(4);
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
	public static void method4163() {
		anIntArray464 = null;
		aThread3 = null;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)Lclient!gi;")
	public static Class4_Sub2_Sub10 method4164(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub2_Sub10 local12 = (Class4_Sub2_Sub10) Static262.aClass69_12.method1930((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static10.aClass98_2.method2396(Static147.method2369(arg0), Static275.method4102(arg0));
		local12 = new Class4_Sub2_Sub10();
		if (local27 != null) {
			local12.method1435(new Class4_Sub17(local27));
		}
		Static262.aClass69_12.method1933((long) arg0, local12);
		return local12;
	}
}
