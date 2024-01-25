import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!wda", name = "yg", descriptor = "[I")
	public static final int[] anIntArray779 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!wda", name = "Eg", descriptor = "[I")
	private static final int[] anIntArray780 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!wda", name = "Hg", descriptor = "[F")
	public static final float[] aFloatArray82 = new float[16];

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZLclient!pw;)I")
	public static int method7779(@OriginalArg(1) Class234 arg0) {
		if (Static66.aClass234_3 == arg0) {
			return 2;
		} else if (Static111.aClass234_4 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!ui;BLclient!aq;)I")
	public static int method7780(@OriginalArg(0) Class289 arg0, @OriginalArg(2) Class16 arg1) {
		if (arg0 == Static489.aClass289_13) {
			if (arg1 == Static470.aClass16_16) {
				return 22;
			}
			if (arg1 == Static72.aClass16_3) {
				return 21;
			}
			if (arg1 == Static97.aClass16_17) {
				return 28;
			}
			if (arg1 == Static155.aClass16_10) {
				return 50;
			}
			if (arg1 == Static300.aClass16_14) {
				return 51;
			}
			if (arg1 == Static524.aClass16_20) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!gf;B)I")
	public static int method7781(@OriginalArg(0) Class102 arg0) {
		if (Static335.aClass102_3 == arg0) {
			return 2;
		} else if (Static247.aClass102_2 == arg0) {
			return 3;
		} else if (Static379.aClass102_4 == arg0) {
			return 1;
		} else if (Static29.aClass102_1 == arg0) {
			return 4;
		} else if (arg0 == Static531.aClass102_6) {
			return 6;
		} else if (arg0 == Static526.aClass102_5) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!hm;)I")
	public static int method7784(@OriginalArg(1) Class122 arg0) {
		if (Static197.aClass122_2 == arg0) {
			return 2;
		} else if (Static43.aClass122_1 == arg0) {
			return 0;
		} else if (arg0 == Static426.aClass122_4) {
			return 1;
		} else if (arg0 == Static349.aClass122_3) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLclient!us;)I")
	public static int method7785(@OriginalArg(1) Class295 arg0) {
		if (Static453.aClass295_5 == arg0) {
			return 2;
		} else if (Static74.aClass295_2 == arg0) {
			return 4;
		} else if (arg0 == Static269.aClass295_3) {
			return 26;
		} else if (Static361.aClass295_4 == arg0) {
			return 7;
		} else if (Static38.aClass295_1 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!kv;B)I")
	public static int method7786(@OriginalArg(0) Class171 arg0) {
		if (arg0 == Static209.aClass171_4) {
			return 1;
		} else if (arg0 == Static152.aClass171_3) {
			return 2;
		} else if (Static19.aClass171_1 == arg0) {
			return 3;
		} else if (Static218.aClass171_5 == arg0) {
			return 4;
		} else if (arg0 == Static96.aClass171_2) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIILclient!jagdx/D3DPRESENT_PARAMETERS;BLclient!jagdx/IDirect3D;)Z")
	public static boolean method7789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = arg4.b(arg1);
			label75: while (arg2 >= 0) {
				if (arg2 != 1) {
					local5 = arg2;
					for (@Pc(28) int local28 = 0; local28 < anIntArray780.length; local28++) {
						if (arg4.CheckDeviceType(arg1, arg0, local14.Format, anIntArray780[local28], true) == 0 && arg4.CheckDeviceFormat(arg1, arg0, local14.Format, 1, 1, anIntArray780[local28]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg1, arg0, anIntArray780[local28], true, local5) == 0)) {
							for (@Pc(83) int local83 = 0; local83 < anIntArray779.length; local83++) {
								if (arg4.CheckDeviceFormat(arg1, arg0, local14.Format, 2, 1, anIntArray779[local83]) == 0 && arg4.CheckDepthStencilMatch(arg1, arg0, local14.Format, anIntArray780[local28], anIntArray779[local83]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg1, arg0, anIntArray779[local28], true, local5) == 0)) {
									local3 = anIntArray780[local28];
									local1 = anIntArray779[local83];
									break label75;
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
			arg3.AutoDepthStencilFormat = local1;
			arg3.MultiSampleType = local5;
			arg3.MultiSampleQuality = 0;
			arg3.BackBufferFormat = local3;
			return true;
		} catch (@Pc(186) Throwable local186) {
			return false;
		}
	}
}
