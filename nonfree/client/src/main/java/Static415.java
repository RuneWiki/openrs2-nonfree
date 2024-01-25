import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!rca", name = "wg", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[16];

	@OriginalMember(owner = "client!rca", name = "Ag", descriptor = "[I")
	private static final int[] anIntArray663 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!rca", name = "Pg", descriptor = "[I")
	private static final int[] anIntArray665 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLclient!km;)I")
	public static int method6430(@OriginalArg(1) Class166 arg0) {
		if (Static213.aClass166_3 == arg0) {
			return 2;
		} else if (Static501.aClass166_4 == arg0) {
			return 0;
		} else if (Static28.aClass166_1 == arg0) {
			return 1;
		} else if (arg0 == Static144.aClass166_2) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!lba;I)I")
	public static int method6431(@OriginalArg(0) Class172 arg0) {
		if (Static50.aClass172_2 == arg0) {
			return 2;
		} else if (arg0 == Static302.aClass172_9) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!vt;ILclient!kp;)I")
	public static int method6432(@OriginalArg(0) Class310 arg0, @OriginalArg(2) Class167 arg1) {
		if (arg0 == Static524.aClass310_16) {
			if (arg1 == Static178.aClass167_6) {
				return 22;
			}
			if (Static468.aClass167_14 == arg1) {
				return 21;
			}
			if (arg1 == Static212.aClass167_7) {
				return 28;
			}
			if (Static217.aClass167_8 == arg1) {
				return 50;
			}
			if (Static521.aClass167_15 == arg1) {
				return 51;
			}
			if (arg1 == Static447.aClass167_13) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!qda;)I")
	public static int method6433(@OriginalArg(1) Class243 arg0) {
		if (Static409.aClass243_12 == arg0) {
			return 1;
		} else if (Static124.aClass243_13 == arg0) {
			return 2;
		} else if (arg0 == Static25.aClass243_5) {
			return 3;
		} else if (arg0 == Static124.aClass243_14) {
			return 4;
		} else if (arg0 == Static127.aClass243_9) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!jagdx/IDirect3D;IILclient!jagdx/D3DPRESENT_PARAMETERS;I)Z")
	public static boolean method6436(@OriginalArg(0) int arg0, @OriginalArg(1) IDirect3D arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) D3DPRESENT_PARAMETERS arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(10) int local10 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = arg1.b(arg3);
			label76: while (arg2 >= 0) {
				if (arg2 != 1) {
					local10 = arg2;
					for (@Pc(27) int local27 = 0; local27 < anIntArray665.length; local27++) {
						if (arg1.CheckDeviceType(arg3, arg0, local14.Format, anIntArray665[local27], true) == 0 && arg1.CheckDeviceFormat(arg3, arg0, local14.Format, 1, 1, anIntArray665[local27]) == 0 && (arg2 == 0 || arg1.CheckDeviceMultiSampleType(arg3, arg0, anIntArray665[local27], true, local10) == 0)) {
							for (@Pc(80) int local80 = 0; local80 < anIntArray663.length; local80++) {
								if (arg1.CheckDeviceFormat(arg3, arg0, local14.Format, 2, 1, anIntArray663[local80]) == 0 && arg1.CheckDepthStencilMatch(arg3, arg0, local14.Format, anIntArray665[local27], anIntArray663[local80]) == 0 && (arg2 == 0 || arg1.CheckDeviceMultiSampleType(arg3, arg0, anIntArray663[local27], true, local10) == 0)) {
									local3 = anIntArray665[local27];
									local1 = anIntArray663[local80];
									break label76;
								}
							}
						}
					}
				}
				arg2--;
			}
			if (arg2 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg4.BackBufferFormat = local3;
			arg4.MultiSampleQuality = 0;
			arg4.MultiSampleType = local10;
			arg4.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(174) Throwable local174) {
			return false;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!fea;)I")
	public static int method6439(@OriginalArg(1) Class87 arg0) {
		if (arg0 == Static94.aClass87_4) {
			return 2;
		} else if (arg0 == Static478.aClass87_6) {
			return 3;
		} else if (arg0 == Static16.aClass87_1) {
			return 1;
		} else if (Static524.aClass87_7 == arg0) {
			return 4;
		} else if (arg0 == Static328.aClass87_5) {
			return 6;
		} else if (arg0 == Static543.aClass87_8) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!ua;I)I")
	public static int method6440(@OriginalArg(0) Class289 arg0) {
		if (arg0 == Static526.aClass289_5) {
			return 2;
		} else if (arg0 == Static130.aClass289_1) {
			return 4;
		} else if (arg0 == Static306.aClass289_2) {
			return 26;
		} else if (arg0 == Static500.aClass289_4) {
			return 7;
		} else if (arg0 == Static355.aClass289_3) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
