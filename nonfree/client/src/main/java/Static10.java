import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "Lclient!im;")
	public static final Class140 aClass140_5 = new Class140(4, -1);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)V")
	public static void method368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub1_Sub11 local13 = Static541.method7520(5, arg0);
		local13.method4946();
		local13.anInt5822 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!jj;II)V")
	public static void method370(@OriginalArg(0) Class1_Sub6_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method3976(1) == 1;
		if (local15) {
			Static384.anIntArray679[Static103.anInt2066++] = arg1;
		}
		@Pc(30) int local30 = arg0.method3976(2);
		@Pc(34) Class49_Sub2_Sub2_Sub1 local34 = Static349.aClass49_Sub2_Sub2_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(147) int local147;
			@Pc(152) int local152;
			@Pc(157) int local157;
			if (local30 == 1) {
				local147 = arg0.method3976(3);
				local152 = local34.anIntArray428[0];
				local157 = local34.anIntArray427[0];
				if (local147 == 0) {
					local157--;
					local152--;
				} else if (local147 == 1) {
					local157--;
				} else if (local147 == 2) {
					local152++;
					local157--;
				} else if (local147 == 3) {
					local152--;
				} else if (local147 == 4) {
					local152++;
				} else if (local147 == 5) {
					local152--;
					local157++;
				} else if (local147 == 6) {
					local157++;
				} else if (local147 == 7) {
					local152++;
					local157++;
				}
				if (local15) {
					local34.aBoolean112 = true;
					local34.anInt1745 = local152;
					local34.anInt1761 = local157;
				} else {
					local34.method1538(local152, Static166.aByteArray44[arg1], local157);
				}
			} else if (local30 == 2) {
				local147 = arg0.method3976(4);
				local152 = local34.anIntArray428[0];
				local157 = local34.anIntArray427[0];
				if (local147 == 0) {
					local157 -= 2;
					local152 -= 2;
				} else if (local147 == 1) {
					local152--;
					local157 -= 2;
				} else if (local147 == 2) {
					local157 -= 2;
				} else if (local147 == 3) {
					local157 -= 2;
					local152++;
				} else if (local147 == 4) {
					local157 -= 2;
					local152 += 2;
				} else if (local147 == 5) {
					local152 -= 2;
					local157--;
				} else if (local147 == 6) {
					local152 += 2;
					local157--;
				} else if (local147 == 7) {
					local152 -= 2;
				} else if (local147 == 8) {
					local152 += 2;
				} else if (local147 == 9) {
					local157++;
					local152 -= 2;
				} else if (local147 == 10) {
					local152 += 2;
					local157++;
				} else if (local147 == 11) {
					local157 += 2;
					local152 -= 2;
				} else if (local147 == 12) {
					local157 += 2;
					local152--;
				} else if (local147 == 13) {
					local157 += 2;
				} else if (local147 == 14) {
					local152++;
					local157 += 2;
				} else if (local147 == 15) {
					local157 += 2;
					local152 += 2;
				}
				if (local15) {
					local34.aBoolean112 = true;
					local34.anInt1745 = local152;
					local34.anInt1761 = local157;
				} else {
					local34.method1538(local152, Static166.aByteArray44[arg1], local157);
				}
			} else {
				local147 = arg0.method3976(1);
				@Pc(428) int local428;
				@Pc(438) int local438;
				@Pc(449) int local449;
				@Pc(456) int local456;
				if (local147 == 0) {
					local152 = arg0.method3976(12);
					local157 = local152 >> 10;
					local428 = local152 >> 5 & 0x1F;
					if (local428 > 15) {
						local428 -= 32;
					}
					local438 = local152 & 0x1F;
					if (local438 > 15) {
						local438 -= 32;
					}
					local449 = local428 + local34.anIntArray428[0];
					local456 = local438 + local34.anIntArray427[0];
					if (local15) {
						local34.aBoolean112 = true;
						local34.anInt1745 = local449;
						local34.anInt1761 = local456;
					} else {
						local34.method1538(local449, Static166.aByteArray44[arg1], local456);
					}
					local34.aByte98 = (byte) (local157 + local34.aByte98 & 0x3);
					if (Static198.anInt3873 == arg1) {
						Static501.anInt8491 = local34.aByte98;
					}
				} else {
					local152 = arg0.method3976(30);
					local157 = local152 >> 28;
					local428 = local152 >> 14 & 0x3FFF;
					local438 = local152 & 0x3FFF;
					local449 = (Static470.anInt7897 + local34.anIntArray428[0] + local428 & 0x3FFF) - Static470.anInt7897;
					local456 = (local34.anIntArray427[0] + Static534.anInt9007 + local438 & 0x3FFF) - Static534.anInt9007;
					if (local15) {
						local34.anInt1761 = local456;
						local34.anInt1745 = local449;
						local34.aBoolean112 = true;
					} else {
						local34.method1538(local449, Static166.aByteArray44[arg1], local456);
					}
					local34.aByte98 = (byte) (local34.aByte98 + local157 & 0x3);
					if (Static198.anInt3873 == arg1) {
						Static501.anInt8491 = local34.aByte98;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean112 = false;
		} else if (Static198.anInt3873 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(62) Class210 local62 = Static534.aClass210Array1[arg1] = new Class210();
			local62.anInt6009 = (Static470.anInt7897 + local34.anIntArray428[0] >> 6 << 14) + ((local34.aByte98 << 28) + (Static534.anInt9007 + local34.anIntArray427[0] >> 6));
			if (local34.anInt1760 == -1) {
				local62.anInt6010 = local34.aClass143_7.method3599();
			} else {
				local62.anInt6010 = local34.anInt1760;
			}
			local62.anInt6012 = local34.anInt4323;
			local62.aBoolean433 = local34.aBoolean111;
			if (local34.anInt1763 > 0) {
				Static381.method5840(local34);
			}
			Static349.aClass49_Sub2_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method3976(1) != 0) {
				Static156.method2466(arg0, arg1);
			}
		}
	}
}
