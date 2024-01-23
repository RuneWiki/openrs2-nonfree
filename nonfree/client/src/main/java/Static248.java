import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!rm", name = "A", descriptor = "Lclient!tj;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "Lclient!qj;")
	public static Class148 aClass148_9 = new Class148(64);

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(IB)V")
	public static void method3926(@OriginalArg(0) int arg0) {
		if (Static85.method1597(arg0)) {
			method3931(Static274.aClass66ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	public static void method3927() {
		Static53.aClass187_33.method4530();
		Static182.aClass187_93.method4530();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([ILclient!wf;[I[IZ)V")
	public static void method3929(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class15_Sub5_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(9) int local9 = 0; local9 < arg3.length; local9++) {
			@Pc(21) int local21 = arg3[local9];
			@Pc(25) int local25 = arg0[local9];
			@Pc(29) int local29 = arg2[local9];
			for (@Pc(31) int local31 = 0; local29 != 0 && arg1.aClass14Array3.length > local31; local31++) {
				if ((local29 & 0x1) != 0) {
					if (local21 == -1) {
						arg1.aClass14Array3[local31] = null;
					} else {
						@Pc(64) Class157 local64 = Static80.method1561(local21);
						@Pc(69) Class14 local69 = arg1.aClass14Array3[local31];
						@Pc(72) int local72 = local64.anInt4524;
						if (local69 != null) {
							if (local69.anInt236 == local21) {
								if (local72 == 0) {
									local69 = arg1.aClass14Array3[local31] = null;
								} else if (local72 == 1) {
									local69.anInt234 = 1;
									local69.anInt227 = 0;
									local69.anInt226 = local25;
									local69.anInt232 = 0;
									local69.anInt229 = 0;
									Static31.method503(local64, 0, arg1.anInt5557, arg1 == Static90.aClass15_Sub5_Sub2_2, arg1.anInt5559);
								} else if (local72 == 2) {
									local69.anInt227 = 0;
								}
							} else if (local64.anInt4512 >= Static80.method1561(local69.anInt236).anInt4512) {
								local69 = arg1.aClass14Array3[local31] = null;
							}
						}
						if (local69 == null) {
							local69 = arg1.aClass14Array3[local31] = new Class14();
							local69.anInt232 = 0;
							local69.anInt226 = local25;
							local69.anInt229 = 0;
							local69.anInt227 = 0;
							local69.anInt236 = local21;
							local69.anInt234 = 1;
							Static31.method503(local64, 0, arg1.anInt5557, Static90.aClass15_Sub5_Sub2_2 == arg1, arg1.anInt5559);
						}
					}
				}
				local29 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([BI)Lclient!jh;")
	public static Class1_Sub2_Sub6_Sub1 method3930(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class1_Sub2_Sub6_Sub1 local23 = new Class1_Sub2_Sub6_Sub1(arg0, Static244.anIntArray389, Static254.anIntArray412, Static160.anIntArray267, Static235.anIntArray468, Static69.aByteArrayArray15);
			Static117.method2101();
			return local23;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[Lclient!hi;I)V")
	private static void method3931(@OriginalArg(1) Class66[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(20) Class66 local20 = arg0[local8];
			if (local20 != null && arg1 == local20.anInt2221 && (!local20.aBoolean132 || !Static37.method681(local20))) {
				if (local20.anInt2176 == 0) {
					if (!local20.aBoolean132 && Static37.method681(local20) && local20 != Static7.aClass66_6) {
						continue;
					}
					method3931(arg0, local20.anInt2157);
					if (local20.aClass66Array3 != null) {
						method3931(local20.aClass66Array3, local20.anInt2157);
					}
					@Pc(80) Class1_Sub25 local80 = (Class1_Sub25) Static302.aClass142_26.method3543((long) local20.anInt2157);
					if (local80 != null) {
						method3926(local80.anInt4289);
					}
				}
				if (local20.anInt2176 == 6) {
					@Pc(108) int local108;
					if (local20.anInt2134 != -1 || local20.anInt2206 != -1) {
						@Pc(103) boolean local103 = Static180.method2981(local20);
						if (local103) {
							local108 = local20.anInt2206;
						} else {
							local108 = local20.anInt2134;
						}
						if (local108 != -1) {
							@Pc(120) Class157 local120 = Static80.method1561(local108);
							if (local120 != null) {
								local20.anInt2131 += Static81.anInt1635;
								while (local120.anIntArray395[local20.anInt2149] < local20.anInt2131) {
									local20.anInt2131 -= local120.anIntArray395[local20.anInt2149];
									local20.anInt2149++;
									if (local20.anInt2149 >= local120.anIntArray396.length) {
										local20.anInt2149 -= local120.anInt4530;
										if (local20.anInt2149 < 0 || local120.anIntArray396.length <= local20.anInt2149) {
											local20.anInt2149 = 0;
										}
									}
									local20.anInt2182 = local20.anInt2149 + 1;
									if (local120.anIntArray396.length <= local20.anInt2182) {
										local20.anInt2182 -= local120.anInt4530;
										if (local20.anInt2182 < 0 || local20.anInt2182 >= local120.anIntArray396.length) {
											local20.anInt2182 = -1;
										}
									}
									Static103.method1865(local20);
								}
							}
						}
					}
					if (local20.anInt2183 != 0 && !local20.aBoolean132) {
						@Pc(249) int local249 = local20.anInt2183 >> 16;
						local108 = local20.anInt2183 << 16 >> 16;
						local108 *= Static81.anInt1635;
						@Pc(264) int local264 = local249 * Static81.anInt1635;
						local20.anInt2136 = local264 + local20.anInt2136 & 0x7FF;
						local20.anInt2156 = local108 + local20.anInt2156 & 0x7FF;
						Static103.method1865(local20);
					}
				}
			}
		}
	}
}
