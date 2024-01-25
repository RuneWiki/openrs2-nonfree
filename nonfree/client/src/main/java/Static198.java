import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "Lclient!be;")
	public static Class17_Sub1_Sub1_Sub1 aClass17_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
	public static int anInt1218;

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
	public static int anInt1219;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_10 = new Class87(64);

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
	public static void method884() {
		for (@Pc(3) int local3 = 0; local3 < Static125.anInt2818; local3++) {
			@Pc(11) int local11 = Static191.anIntArray373[local3];
			@Pc(15) Class17_Sub1_Sub1_Sub2 local15 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local11];
			@Pc(19) int local19 = Static311.aClass1_Sub8_Sub1_8.method4532();
			if ((local19 & 0x4) != 0) {
				local19 += Static311.aClass1_Sub8_Sub1_8.method4532() << 8;
			}
			@Pc(39) int local39;
			@Pc(48) int local48;
			@Pc(126) int local126;
			if ((local19 & 0x8) != 0) {
				local39 = Static311.aClass1_Sub8_Sub1_8.method4538();
				if (local39 == 65535) {
					local39 = -1;
				}
				local48 = Static311.aClass1_Sub8_Sub1_8.method4518();
				@Pc(50) boolean local50 = true;
				@Pc(123) Class24 local123;
				if (local39 != -1 && local15.anInt4884 != -1) {
					@Pc(71) Class67 local71;
					if (local15.anInt4884 == local39) {
						local71 = Static265.method5633(local39);
						if (local71.aBoolean193 && local71.anInt2088 != -1) {
							local123 = Static110.method5411(local71.anInt2088);
							local126 = local123.anInt1037;
							if (local126 == 0) {
								local50 = false;
							} else if (local126 == 1) {
								local50 = true;
							} else if (local126 == 2) {
								local50 = false;
								local15.anInt4828 = 0;
							}
						}
					} else {
						local71 = Static265.method5633(local39);
						@Pc(76) Class67 local76 = Static265.method5633(local15.anInt4884);
						if (local71.anInt2088 != -1 && local76.anInt2088 != -1) {
							@Pc(89) Class24 local89 = Static110.method5411(local71.anInt2088);
							@Pc(94) Class24 local94 = Static110.method5411(local76.anInt2088);
							if (local89.anInt1051 < local94.anInt1051) {
								local50 = false;
							}
						}
					}
				}
				if (local50) {
					local15.anInt4845 = Static5.anInt208 + (local48 & 0xFFFF);
					local15.anInt4833 = 1;
					local15.anInt4881 = 0;
					local15.anInt4855 = 0;
					local15.anInt4844 = local48 >> 16;
					local15.anInt4884 = local39;
					if (local15.anInt4845 > Static5.anInt208) {
						local15.anInt4881 = -1;
					}
					if (local15.anInt4884 != -1 && local15.anInt4845 == Static5.anInt208) {
						@Pc(201) int local201 = Static265.method5633(local15.anInt4884).anInt2088;
						if (local201 != -1) {
							local123 = Static110.method5411(local201);
							if (local123 != null && local123.anIntArray90 != null) {
								Static318.method5216(local15.anInt5109, local15.anInt5108, false, local123, 0);
							}
						}
					}
				}
			}
			if ((local19 & 0x2) != 0) {
				local15.anInt4829 = Static311.aClass1_Sub8_Sub1_8.method4520();
				if (local15.anInt4829 == 65535) {
					local15.anInt4829 = -1;
				}
			}
			if ((local19 & 0x10) != 0) {
				local39 = Static311.aClass1_Sub8_Sub1_8.method4520();
				if (local39 == 65535) {
					local39 = -1;
				}
				local48 = Static311.aClass1_Sub8_Sub1_8.method4552();
				Static109.method2357(local39, local48, local15);
			}
			if ((local19 & 0x80) != 0) {
				if (local15.aClass213_1.method5491()) {
					Static82.method1816(local15);
				}
				local15.method4332(Static133.method2749(Static311.aClass1_Sub8_Sub1_8.method4538()));
				local15.method4321(local15.aClass213_1.anInt6509);
				local15.anInt4848 = local15.aClass213_1.anInt6522 << 3;
				if (local15.aClass213_1.method5491()) {
					Static209.method3980(0, null, null, local15, Static242.anInt6745, local15.anIntArray438[0], local15.anIntArray439[0]);
				}
			}
			if ((local19 & 0x200) != 0) {
				local39 = Static311.aClass1_Sub8_Sub1_8.method4520();
				local15.anInt4866 = Static311.aClass1_Sub8_Sub1_8.method4552();
				local15.anInt4879 = Static311.aClass1_Sub8_Sub1_8.method4532();
				local15.aBoolean470 = (local39 & 0x8000) != 0;
				local15.anInt4878 = local39 & 0x7FFF;
				local15.anInt4849 = local15.anInt4878 + Static5.anInt208 + local15.anInt4866;
			}
			if ((local19 & 0x400) != 0) {
				local39 = Static311.aClass1_Sub8_Sub1_8.method4541();
				@Pc(377) int[] local377 = new int[local39];
				@Pc(380) int[] local380 = new int[local39];
				@Pc(383) int[] local383 = new int[local39];
				for (@Pc(385) int local385 = 0; local385 < local39; local385++) {
					local126 = Static311.aClass1_Sub8_Sub1_8.method4538();
					if (local126 == 65535) {
						local126 = -1;
					}
					local377[local385] = local126;
					local380[local385] = Static311.aClass1_Sub8_Sub1_8.method4536();
					local383[local385] = Static311.aClass1_Sub8_Sub1_8.method4556();
				}
				Static109.method2352(local383, local377, local15, local380);
			}
			if ((local19 & 0x40) != 0) {
				local39 = Static311.aClass1_Sub8_Sub1_8.method4528();
				local48 = Static311.aClass1_Sub8_Sub1_8.method4536();
				local15.method4325(local39, Static5.anInt208, local48);
				local15.lb = Static5.anInt208 + 300;
				local15.anInt4831 = Static311.aClass1_Sub8_Sub1_8.method4532();
			}
			if ((local19 & 0x100) != 0) {
				local15.anInt4859 = Static311.aClass1_Sub8_Sub1_8.method4520();
				local15.anInt4820 = Static311.aClass1_Sub8_Sub1_8.method4538();
			}
			if ((local19 & 0x20) != 0) {
				local15.aString50 = Static311.aClass1_Sub8_Sub1_8.method4534();
				local15.anInt4880 = 100;
			}
			if ((local19 & 0x1) != 0) {
				local39 = Static311.aClass1_Sub8_Sub1_8.method4528();
				local48 = Static311.aClass1_Sub8_Sub1_8.method4532();
				local15.method4325(local39, Static5.anInt208, local48);
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
	public static void method886() {
		if (Static111.anInt2599 > 0) {
			Static24.method667();
		} else {
			Static234.aClass148_2 = Static7.aClass148_1;
			Static7.aClass148_1 = null;
			Static232.method4269(40);
		}
	}
}
