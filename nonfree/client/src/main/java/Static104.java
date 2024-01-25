import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
	public static int anInt2631;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "Lclient!d;")
	public static final Class4_Sub12 aClass4_Sub12_2 = new Class4_Sub12(0, -1);

	@OriginalMember(owner = "client!gi", name = "S", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_85 = new Class198(64);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)V")
	public static void method2322() {
		@Pc(1) Class198 local1 = Static288.aClass198_207;
		synchronized (Static288.aClass198_207) {
			Static288.aClass198_207.method5202(5);
		}
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V")
	public static void method2323() {
		for (@Pc(11) int local11 = 0; local11 < Static244.anInt4894; local11++) {
			@Pc(17) int local17 = Static311.anIntArray474[local11];
			@Pc(21) Class8_Sub1_Sub2_Sub2 local21 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local17];
			@Pc(25) int local25 = Static127.aClass4_Sub11_Sub1_3.method3440();
			if ((local25 & 0x20) != 0) {
				local25 += Static127.aClass4_Sub11_Sub1_3.method3440() << 8;
			}
			@Pc(45) int local45;
			if ((local25 & 0x100) != 0) {
				local45 = Static127.aClass4_Sub11_Sub1_3.method3460();
				local21.anInt4965 = Static127.aClass4_Sub11_Sub1_3.method3453();
				local21.anInt4977 = Static127.aClass4_Sub11_Sub1_3.method3453();
				local21.lb = local45 & 0x7FFF;
				local21.aBoolean370 = (local45 & 0x8000) != 0;
				local21.anInt4970 = local21.lb + Static199.anInt4137 + local21.anInt4965;
			}
			if ((local25 & 0x4) != 0) {
				if (local21.aClass141_1.method3909()) {
					Static118.method2493(local21);
				}
				local21.method4356(Static36.method744(Static127.aClass4_Sub11_Sub1_3.method3415()));
				local21.method4350(local21.aClass141_1.anInt4382);
				local21.anInt4963 = local21.aClass141_1.anInt4398 << 3;
				if (local21.aClass141_1.method3909()) {
					Static312.method5146(local21.anIntArray416[0], local21, Static12.anInt267, null, null, 0, local21.anIntArray415[0]);
				}
			}
			@Pc(158) int local158;
			if ((local25 & 0x200) != 0) {
				local45 = Static127.aClass4_Sub11_Sub1_3.method3413();
				@Pc(144) int[] local144 = new int[local45];
				@Pc(147) int[] local147 = new int[local45];
				@Pc(150) int[] local150 = new int[local45];
				for (@Pc(152) int local152 = 0; local152 < local45; local152++) {
					local158 = Static127.aClass4_Sub11_Sub1_3.method3460();
					if (local158 == 65535) {
						local158 = -1;
					}
					local144[local152] = local158;
					local147[local152] = Static127.aClass4_Sub11_Sub1_3.method3451();
					local150[local152] = Static127.aClass4_Sub11_Sub1_3.method3401();
				}
				Static74.method1741(local144, local147, local21, local150);
			}
			@Pc(208) int local208;
			if ((local25 & 0x8) != 0) {
				local45 = Static127.aClass4_Sub11_Sub1_3.method3412();
				if (local45 == 65535) {
					local45 = -1;
				}
				local208 = Static127.aClass4_Sub11_Sub1_3.method3413();
				Static293.method3942(local45, local208, local21);
			}
			if ((local25 & 0x80) != 0) {
				local21.aString55 = Static127.aClass4_Sub11_Sub1_3.method3446();
				local21.anInt4931 = 100;
			}
			if ((local25 & 0x40) != 0) {
				local45 = Static127.aClass4_Sub11_Sub1_3.method3401();
				local208 = Static127.aClass4_Sub11_Sub1_3.method3417();
				if (local45 == 65535) {
					local45 = -1;
				}
				@Pc(249) boolean local249 = true;
				@Pc(277) Class14 local277;
				if (local45 != -1 && local21.anInt4972 != -1) {
					@Pc(265) Class5 local265;
					if (local21.anInt4972 == local45) {
						local265 = Static116.method2427(local45);
						if (local265.aBoolean11 && local265.anInt101 != -1) {
							local277 = Static225.method4042(local265.anInt101);
							local158 = local277.anInt351;
							if (local158 == 0) {
								local249 = false;
							} else if (local158 == 1) {
								local249 = true;
							} else if (local158 == 2) {
								local21.anInt4959 = 0;
								local249 = false;
							}
						}
					} else {
						local265 = Static116.method2427(local45);
						@Pc(317) Class5 local317 = Static116.method2427(local21.anInt4972);
						if (local265.anInt101 != -1 && local317.anInt101 != -1) {
							@Pc(331) Class14 local331 = Static225.method4042(local265.anInt101);
							@Pc(336) Class14 local336 = Static225.method4042(local317.anInt101);
							if (local336.anInt344 > local331.anInt344) {
								local249 = false;
							}
						}
					}
				}
				if (local249) {
					local21.anInt4949 = 0;
					local21.anInt4943 = local208 >> 16;
					local21.anInt4980 = 1;
					local21.anInt4971 = 0;
					local21.anInt4972 = local45;
					local21.anInt4919 = (local208 & 0xFFFF) + Static199.anInt4137;
					if (Static199.anInt4137 < local21.anInt4919) {
						local21.anInt4971 = -1;
					}
					if (local21.anInt4972 != -1 && local21.anInt4919 == Static199.anInt4137) {
						@Pc(403) int local403 = Static116.method2427(local21.anInt4972).anInt101;
						if (local403 != -1) {
							local277 = Static225.method4042(local403);
							if (local277 != null && local277.anIntArray12 != null) {
								Static167.method3265(local21.anInt6701, local21.anInt6702, 0, false, local277);
							}
						}
					}
				}
			}
			if ((local25 & 0x1) != 0) {
				local45 = Static127.aClass4_Sub11_Sub1_3.method3457();
				local208 = Static127.aClass4_Sub11_Sub1_3.method3451();
				local21.method4342(local208, Static199.anInt4137, local45);
			}
			if ((local25 & 0x10) != 0) {
				local21.anInt4964 = Static127.aClass4_Sub11_Sub1_3.method3412();
				if (local21.anInt4964 == 65535) {
					local21.anInt4964 = -1;
				}
			}
			if ((local25 & 0x2) != 0) {
				local45 = Static127.aClass4_Sub11_Sub1_3.method3457();
				local208 = Static127.aClass4_Sub11_Sub1_3.method3440();
				local21.method4342(local208, Static199.anInt4137, local45);
				local21.anInt4973 = Static199.anInt4137 + 300;
				local21.anInt4960 = Static127.aClass4_Sub11_Sub1_3.method3451();
			}
			if ((local25 & 0x400) != 0) {
				local21.anInt4942 = Static127.aClass4_Sub11_Sub1_3.method3412();
				local21.anInt4915 = Static127.aClass4_Sub11_Sub1_3.method3412();
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!sp;)V")
	public static void method2325(@OriginalArg(1) Class4_Sub39 arg0) {
		if (!Static272.aBoolean393) {
			arg0.method5687();
			Static105.anInt2645--;
		}
	}
}
