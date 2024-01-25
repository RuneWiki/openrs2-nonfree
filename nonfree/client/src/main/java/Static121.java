import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!dw", name = "D", descriptor = "Lclient!hr;")
	public static Class3_Sub26 aClass3_Sub26_1;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_8 = new Class295(8);

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "[B")
	public static final byte[] aByteArray13 = new byte[2048];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZLclient!qba;B)V")
	public static void method1827(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class34_Sub1_Sub1_Sub2 arg1) {
		@Pc(9) Class286 local9 = arg1.method7878();
		if (arg1.anInt9703 == 0) {
			Static521.anInt8227 = -1;
			arg1.anInt9704 = 0;
			Static211.anInt3663 = 0;
			return;
		}
		if (arg1.anInt9664 != -1 && arg1.anInt9698 == 0) {
			@Pc(37) Class239 local37 = Static13.aClass213_1.method5008(arg1.anInt9664);
			if (arg1.anInt9705 > 0 && local37.anInt6412 == 0) {
				arg1.anInt9704++;
				Static211.anInt3663 = 0;
				Static521.anInt8227 = -1;
				return;
			}
			if (arg1.anInt9705 <= 0 && local37.anInt6418 == 0) {
				Static521.anInt8227 = -1;
				Static211.anInt3663 = 0;
				arg1.anInt9704++;
				return;
			}
		}
		for (@Pc(76) int local76 = 0; local76 < arg1.aClass190Array3.length; local76++) {
			if (arg1.aClass190Array3[local76].anInt5051 != -1 && Static122.anInt2190 >= arg1.aClass190Array3[local76].anInt5054) {
				@Pc(102) Class106 local102 = Static366.aClass182_2.method4107(arg1.aClass190Array3[local76].anInt5051);
				if (local102.aBoolean203 && local102.anInt2680 != -1) {
					@Pc(116) Class239 local116 = Static13.aClass213_1.method5008(local102.anInt2680);
					if (arg1.anInt9705 > 0 && local116.anInt6412 == 0) {
						arg1.anInt9704++;
						Static211.anInt3663 = 0;
						Static521.anInt8227 = -1;
						return;
					}
					if (arg1.anInt9705 <= 0 && local116.anInt6418 == 0) {
						Static211.anInt3663 = 0;
						Static521.anInt8227 = -1;
						arg1.anInt9704++;
						return;
					}
				}
			}
		}
		@Pc(165) int local165 = arg1.anInt9614;
		@Pc(168) int local168 = arg1.anInt9619;
		@Pc(184) int local184 = arg1.anIntArray529[arg1.anInt9703 - 1] * 512 + arg1.method7866() * 256;
		@Pc(201) int local201 = arg1.anIntArray528[arg1.anInt9703 - 1] * 512 + arg1.method7866() * 256;
		if (local184 > local165) {
			if (local168 < local201) {
				arg1.method7860(10240);
			} else if (local168 <= local201) {
				arg1.method7860(12288);
			} else {
				arg1.method7860(14336);
			}
		} else if (local184 < local165) {
			if (local168 < local201) {
				arg1.method7860(6144);
			} else if (local201 >= local168) {
				arg1.method7860(4096);
			} else {
				arg1.method7860(2048);
			}
		} else if (local168 < local201) {
			arg1.method7860(8192);
		} else if (local201 < local168) {
			arg1.method7860(0);
		}
		@Pc(299) byte local299 = arg1.aByteArray89[arg1.anInt9703 - 1];
		if (!arg0 && (local184 - local165 > 1024 || local184 - local165 < -1024 || local201 - local168 > 1024 || local201 - local168 < -1024)) {
			arg1.anInt9619 = local201;
			arg1.anInt9614 = local184;
			arg1.method7864(false, arg1.anInt9636);
			if (arg1.anInt9705 > 0) {
				arg1.anInt9705--;
			}
			arg1.anInt9703--;
			Static521.anInt8227 = -1;
			Static211.anInt3663 = 0;
			return;
		}
		@Pc(363) int local363 = 16;
		@Pc(369) boolean local369 = true;
		if (arg1 instanceof Class34_Sub1_Sub1_Sub2_Sub2) {
			local369 = ((Class34_Sub1_Sub1_Sub2_Sub2) arg1).aClass261_1.aBoolean483;
		}
		@Pc(406) int local406;
		if (local369) {
			local406 = arg1.anInt9636 - arg1.aClass292_7.anInt7699;
			if (local406 != 0 && arg1.anInt9673 == -1 && arg1.anInt9639 != 0) {
				local363 = 8;
			}
			if (!arg0 && arg1.anInt9703 > 2) {
				local363 = 24;
			}
			if (!arg0 && arg1.anInt9703 > 3) {
				local363 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt9703 > 1) {
				local363 = 24;
			}
			if (!arg0 && arg1.anInt9703 > 2) {
				local363 = 32;
			}
		}
		if (arg1.anInt9704 > 0 && arg1.anInt9703 > 1) {
			local363 = 32;
			arg1.anInt9704--;
		}
		if (local299 == 2) {
			local363 <<= 0x1;
		} else if (local299 == 0) {
			local363 >>= 0x1;
		}
		if (local9.anInt7519 != -1) {
			local363 <<= 0x9;
			if (arg1.anInt9703 == 1) {
				local406 = arg1.anInt9702 * arg1.anInt9702;
				@Pc(565) int local565 = (arg1.anInt9614 <= local184 ? local184 - arg1.anInt9614 : -local184 + arg1.anInt9614) << 9;
				@Pc(582) int local582 = (arg1.anInt9619 <= local201 ? local201 - arg1.anInt9619 : arg1.anInt9619 - local201) << 9;
				@Pc(589) int local589 = local582 < local565 ? local565 : local582;
				@Pc(596) int local596 = local9.anInt7519 * 2 * local589;
				if (local406 > local596) {
					arg1.anInt9702 /= 2;
				} else if (local406 / 2 > local589) {
					arg1.anInt9702 -= local9.anInt7519;
					if (arg1.anInt9702 < 0) {
						arg1.anInt9702 = 0;
					}
				} else if (arg1.anInt9702 < local363) {
					arg1.anInt9702 += local9.anInt7519;
					if (arg1.anInt9702 > local363) {
						arg1.anInt9702 = local363;
					}
				}
			} else if (arg1.anInt9702 < local363) {
				arg1.anInt9702 += local9.anInt7519;
				if (local363 < arg1.anInt9702) {
					arg1.anInt9702 = local363;
				}
			} else if (arg1.anInt9702 > 0) {
				arg1.anInt9702 -= local9.anInt7519;
				if (arg1.anInt9702 < 0) {
					arg1.anInt9702 = 0;
				}
			}
			local363 = arg1.anInt9702 >> 9;
			if (local363 < 1) {
				local363 = 1;
			}
		}
		Static211.anInt3663 = 0;
		if (local165 == local184 && local201 == local168) {
			Static521.anInt8227 = -1;
		} else {
			if (local184 > local165) {
				Static211.anInt3663 |= 0x4;
				arg1.anInt9614 += local363;
				if (local184 < arg1.anInt9614) {
					arg1.anInt9614 = local184;
				}
			} else if (local184 < local165) {
				Static211.anInt3663 |= 0x8;
				arg1.anInt9614 -= local363;
				if (local184 > arg1.anInt9614) {
					arg1.anInt9614 = local184;
				}
			}
			if (local363 >= 32) {
				Static521.anInt8227 = 2;
			} else {
				Static521.anInt8227 = local299;
			}
			if (local201 > local168) {
				arg1.anInt9619 += local363;
				Static211.anInt3663 |= 0x1;
				if (arg1.anInt9619 > local201) {
					arg1.anInt9619 = local201;
				}
			} else if (local168 > local201) {
				arg1.anInt9619 -= local363;
				Static211.anInt3663 |= 0x2;
				if (arg1.anInt9619 < local201) {
					arg1.anInt9619 = local201;
				}
			}
		}
		if (local184 != arg1.anInt9614 || local201 != arg1.anInt9619) {
			return;
		}
		arg1.anInt9703--;
		if (arg1.anInt9705 > 0) {
			arg1.anInt9705--;
			return;
		}
	}
}
