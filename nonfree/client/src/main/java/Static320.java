import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	public static int anInt5205;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_13 = new Class245(8, 0, 4, 1);

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	public static int anInt5204 = 0;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "[I")
	public static final int[] anIntArray426 = new int[4];

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	public static int anInt5206 = -1;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_71 = new Class146(53, 7);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)Z")
	public static boolean method4232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!kv;)V")
	public static void method4235(@OriginalArg(0) Class154 arg0) {
		if (Static440.anInt7325 >= 65535) {
			return;
		}
		@Pc(6) Class4_Sub7 local6 = arg0.aClass4_Sub7_1;
		Static367.aClass154Array1[Static440.anInt7325] = arg0;
		Static371.aBooleanArray28[Static440.anInt7325] = false;
		Static440.anInt7325++;
		@Pc(21) int local21 = arg0.anInt3704;
		if (arg0.aBoolean277) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt3704;
		if (arg0.aBoolean276) {
			local29 = anInt5205 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4449() + Static390.anInt7654 - local6.method4446() >> Static145.anInt2581;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4449() + local6.method4446() - Static390.anInt7654 >> Static145.anInt2581;
			if (local73 >= Static18.anInt297) {
				local73 = Static18.anInt297 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray57[local41++];
				@Pc(105) int local105 = (local6.method4451() + Static390.anInt7654 - local6.method4446() >> Static145.anInt2581) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static81.anInt1606) {
					local113 = Static81.anInt1606 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static81.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static81.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static440.anInt7325;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static81.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static440.anInt7325 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static81.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static440.anInt7325 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static81.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static440.anInt7325 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[Lclient!hd;)V")
	public static void method4236(@OriginalArg(1) int arg0, @OriginalArg(2) Class110[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class110 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt2649 && !Static55.method760(local9)) {
				if (local9.anInt2627 == 0) {
					method4236(local9.anInt2675, arg1);
					if (local9.aClass110Array1 != null) {
						method4236(local9.anInt2675, local9.aClass110Array1);
					}
					@Pc(50) Class4_Sub8 local50 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local9.anInt2675);
					if (local50 != null) {
						Static44.method584(local50.anInt861);
					}
				}
				if (local9.anInt2627 == 6 && local9.anInt2667 != -1) {
					@Pc(73) Class119 local73 = Static170.aClass125_3.method2389(local9.anInt2667);
					if (local73 != null) {
						local9.anInt2624 += Static298.anInt4895;
						while (local73.anIntArray242[local9.anInt2664] < local9.anInt2624) {
							local9.anInt2624 -= local73.anIntArray242[local9.anInt2664];
							local9.anInt2664++;
							if (local9.anInt2664 >= local73.anIntArray244.length) {
								local9.anInt2664 -= local73.anInt2995;
								if (local9.anInt2664 < 0 || local9.anInt2664 >= local73.anIntArray244.length) {
									local9.anInt2664 = 0;
								}
							}
							local9.anInt2660 = local9.anInt2664 + 1;
							if (local9.anInt2660 >= local73.anIntArray244.length) {
								local9.anInt2660 -= local73.anInt2995;
								if (local9.anInt2660 < 0 || local9.anInt2660 >= local73.anIntArray244.length) {
									local9.anInt2660 = -1;
								}
							}
							Static118.method1693(local9);
						}
					}
				}
			}
		}
	}
}
