import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString188 = "Loaded fonts";

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "[F")
	public static float[] aFloatArray30 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "[I")
	public static int[] anIntArray551 = new int[500];

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Lclient!ui;")
	public static Class175 aClass175_39 = new Class175(64);

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	public static int anInt4922 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLclient!re;)V")
	public static void method4111(@OriginalArg(1) Class11_Sub4 arg0) {
		@Pc(5) Class28 local5 = arg0.method3348();
		arg0.anInt3828 = local5.anInt869;
		if (arg0.anInt3863 == 0) {
			arg0.anInt3806 = 0;
			return;
		}
		if (arg0.anInt3864 != -1 && arg0.anInt3798 == 0) {
			@Pc(43) Class152 local43 = Static107.method2016(arg0.anInt3864);
			if (arg0.anInt3783 > 0 && local43.anInt4600 == 0) {
				arg0.anInt3806++;
				return;
			}
			if (arg0.anInt3783 <= 0 && local43.anInt4611 == 0) {
				arg0.anInt3806++;
				return;
			}
		}
		if (arg0.anInt3857 != -1 && arg0.anInt3851 <= Static167.anInt637) {
			@Pc(93) Class15 local93 = Static226.method3632(arg0.anInt3857);
			if (local93.aBoolean53 && local93.anInt518 != -1) {
				@Pc(106) Class152 local106 = Static107.method2016(local93.anInt518);
				if (arg0.anInt3783 > 0 && local106.anInt4600 == 0) {
					arg0.anInt3806++;
					return;
				}
				if (arg0.anInt3783 <= 0 && local106.anInt4611 == 0) {
					arg0.anInt3806++;
					return;
				}
			}
		}
		@Pc(140) int local140 = arg0.anInt3865;
		@Pc(143) int local143 = arg0.anInt3856;
		@Pc(160) int local160 = arg0.anIntArray407[arg0.anInt3863 - 1] * 128 + arg0.method3347() * 64;
		@Pc(177) int local177 = arg0.anIntArray406[arg0.anInt3863 - 1] * 128 + arg0.method3347() * 64;
		if (local160 - local140 > 256 || local160 - local140 < -256 || local177 - local143 > 256 || local177 - local143 < -256) {
			arg0.anInt3856 = local177;
			arg0.anInt3865 = local160;
			return;
		}
		if (local160 <= local140) {
			if (local160 >= local140) {
				if (local143 < local177) {
					arg0.anInt3853 = 1024;
				} else if (local143 > local177) {
					arg0.anInt3853 = 0;
				}
			} else if (local177 > local143) {
				arg0.anInt3853 = 768;
			} else if (local177 >= local143) {
				arg0.anInt3853 = 512;
			} else {
				arg0.anInt3853 = 256;
			}
		} else if (local143 < local177) {
			arg0.anInt3853 = 1280;
		} else if (local177 >= local143) {
			arg0.anInt3853 = 1536;
		} else {
			arg0.anInt3853 = 1792;
		}
		@Pc(291) int local291 = local5.anInt852;
		@Pc(300) int local300 = arg0.anInt3853 - arg0.anInt3852 & 0x7FF;
		@Pc(302) byte local302 = 1;
		@Pc(304) boolean local304 = true;
		@Pc(306) int local306 = 4;
		if (local300 > 1024) {
			local300 -= 2048;
		}
		if (local300 >= -256 && local300 <= 256) {
			local291 = local5.anInt872;
		} else if (local300 >= 256 && local300 < 768) {
			local291 = local5.anInt878;
		} else if (local300 >= -768 && local300 <= -256) {
			local291 = local5.anInt853;
		}
		if (local291 == -1) {
			local291 = local5.anInt872;
		}
		arg0.anInt3828 = local291;
		if (arg0 instanceof Class11_Sub4_Sub2) {
			local304 = ((Class11_Sub4_Sub2) arg0).aClass183_1.aBoolean510;
		}
		if (local304) {
			if (arg0.anInt3852 != arg0.anInt3853 && arg0.anInt3784 == -1 && arg0.anInt3813 != 0) {
				local306 = 2;
			}
			if (arg0.anInt3863 > 2) {
				local306 = 6;
			}
			if (arg0.anInt3863 > 3) {
				local306 = 8;
			}
			if (arg0.anInt3806 > 0 && arg0.anInt3863 > 1) {
				local306 = 8;
				arg0.anInt3806--;
			}
		} else {
			if (arg0.anInt3863 > 1) {
				local306 = 6;
			}
			if (arg0.anInt3863 > 2) {
				local306 = 8;
			}
			if (arg0.anInt3806 > 0 && arg0.anInt3863 > 1) {
				local306 = 8;
				arg0.anInt3806--;
			}
		}
		if (arg0.aByteArray127[arg0.anInt3863 - 1] == 2) {
			local302 = 2;
			local306 <<= 0x1;
		} else if (arg0.aByteArray127[arg0.anInt3863 - 1] == 0) {
			local302 = 0;
			local306 >>= 0x1;
		}
		if (local306 < 8 || local5.anInt868 == -1) {
			if (local5.anInt871 != -1 && local302 == 0) {
				if (local5.anInt852 == arg0.anInt3828 && local5.anInt881 != -1) {
					arg0.anInt3828 = local5.anInt881;
				} else if (local5.anInt853 == arg0.anInt3828 && local5.anInt882 != -1) {
					arg0.anInt3828 = local5.anInt882;
				} else if (local5.anInt878 == arg0.anInt3828 && local5.anInt858 != -1) {
					arg0.anInt3828 = local5.anInt858;
				} else {
					arg0.anInt3828 = local5.anInt871;
				}
			}
		} else if (local5.anInt852 == arg0.anInt3828 && local5.anInt879 != -1) {
			arg0.anInt3828 = local5.anInt879;
		} else if (arg0.anInt3828 == local5.anInt853 && local5.anInt849 != -1) {
			arg0.anInt3828 = local5.anInt849;
		} else if (local5.anInt878 == arg0.anInt3828 && local5.anInt847 != -1) {
			arg0.anInt3828 = local5.anInt847;
		} else {
			arg0.anInt3828 = local5.anInt868;
		}
		if (local5.anInt861 != -1) {
			local306 <<= 0x7;
			if (arg0.anInt3863 == 1) {
				@Pc(689) int local689 = arg0.anInt3830 * arg0.anInt3830;
				@Pc(706) int local706 = (local160 >= arg0.anInt3865 ? local160 - arg0.anInt3865 : -local160 + arg0.anInt3865) << 7;
				@Pc(724) int local724 = (local177 >= arg0.anInt3856 ? local177 - arg0.anInt3856 : -local177 + arg0.anInt3856) << 7;
				@Pc(735) int local735 = local724 < local706 ? local706 : local724;
				@Pc(742) int local742 = local735 * local5.anInt861 * 2;
				if (local689 > local742) {
					arg0.anInt3830 /= 2;
				} else if (local689 / 2 > local735) {
					arg0.anInt3830 -= local5.anInt861;
					if (arg0.anInt3830 < 0) {
						arg0.anInt3830 = 0;
					}
				} else if (arg0.anInt3830 < local306) {
					arg0.anInt3830 += local5.anInt861;
					if (local306 < arg0.anInt3830) {
						arg0.anInt3830 = local306;
					}
				}
			} else if (arg0.anInt3830 < local306) {
				arg0.anInt3830 += local5.anInt861;
				if (arg0.anInt3830 > local306) {
					arg0.anInt3830 = local306;
				}
			} else if (arg0.anInt3830 > 0) {
				arg0.anInt3830 -= local5.anInt861;
				if (arg0.anInt3830 < 0) {
					arg0.anInt3830 = 0;
				}
			}
			local306 = arg0.anInt3830 >> 7;
			if (local306 < 1) {
				local306 = 1;
			}
		}
		if (local140 < local160) {
			arg0.anInt3865 += local306;
			if (arg0.anInt3865 > local160) {
				arg0.anInt3865 = local160;
			}
		} else if (local140 > local160) {
			arg0.anInt3865 -= local306;
			if (local160 > arg0.anInt3865) {
				arg0.anInt3865 = local160;
			}
		}
		if (local143 < local177) {
			arg0.anInt3856 += local306;
			if (arg0.anInt3856 > local177) {
				arg0.anInt3856 = local177;
			}
		} else if (local143 > local177) {
			arg0.anInt3856 -= local306;
			if (local177 > arg0.anInt3856) {
				arg0.anInt3856 = local177;
			}
		}
		if (local160 == arg0.anInt3865 && arg0.anInt3856 == local177) {
			if (arg0.anInt3783 > 0) {
				arg0.anInt3783--;
			}
			arg0.anInt3863--;
		}
	}
}
