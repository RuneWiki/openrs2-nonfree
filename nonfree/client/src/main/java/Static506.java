import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.ica;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!tga", name = "Bg", descriptor = "[I")
	public static final int[] anIntArray638 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!tga", name = "Fg", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[16];

	@OriginalMember(owner = "client!tga", name = "Gg", descriptor = "[I")
	private static final int[] anIntArray639 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIILclient!jagdx/IDirect3D;Lclient!jagdx/D3DPRESENT_PARAMETERS;I)Z")
	public static boolean method7041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) IDirect3D arg3, @OriginalArg(4) D3DPRESENT_PARAMETERS arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(10) int local10 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = new D3DDISPLAYMODE();
			if (ica.a(-2147467259, arg3.a(arg1, local14))) {
				return false;
			}
			label79: while (arg0 >= 0) {
				if (arg0 != 1) {
					local10 = arg0;
					for (@Pc(37) int local37 = 0; local37 < anIntArray639.length; local37++) {
						if (arg3.CheckDeviceType(arg1, arg2, local14.Format, anIntArray639[local37], true) == 0 && arg3.CheckDeviceFormat(arg1, arg2, local14.Format, 1, 1, anIntArray639[local37]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg2, anIntArray639[local37], true, local10) == 0)) {
							for (@Pc(87) int local87 = 0; local87 < anIntArray638.length; local87++) {
								if (arg3.CheckDeviceFormat(arg1, arg2, local14.Format, 2, 1, anIntArray638[local87]) == 0 && arg3.CheckDepthStencilMatch(arg1, arg2, local14.Format, anIntArray639[local37], anIntArray638[local87]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg1, arg2, anIntArray638[local37], true, local10) == 0)) {
									local3 = anIntArray639[local37];
									local1 = anIntArray638[local87];
									break label79;
								}
							}
						}
					}
				}
				arg0--;
			}
			if (arg0 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg4.BackBufferFormat = local3;
			arg4.MultiSampleQuality = 0;
			arg4.AutoDepthStencilFormat = local1;
			arg4.MultiSampleType = local10;
			return true;
		} catch (@Pc(176) Throwable local176) {
			return false;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BLclient!ra;)I")
	public static int method7043(@OriginalArg(1) Class280 arg0) {
		if (Static220.aClass280_5 == arg0) {
			return 1;
		} else if (arg0 == Static206.aClass280_4) {
			return 2;
		} else if (arg0 == Static249.aClass280_6) {
			return 3;
		} else if (Static483.aClass280_8 == arg0) {
			return 4;
		} else if (arg0 == Static6.aClass280_3) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!ns;B)I")
	public static int method7045(@OriginalArg(0) Class228 arg0) {
		if (arg0 == Static568.aClass228_14) {
			return 2;
		} else if (arg0 == Static41.aClass228_10) {
			return 4;
		} else if (Static581.aClass228_15 == arg0) {
			return 26;
		} else if (Static350.aClass228_12 == arg0) {
			return 7;
		} else if (Static164.aClass228_9 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(ILclient!jr;Lclient!nh;)I")
	public static int method7048(@OriginalArg(1) Class161 arg0, @OriginalArg(2) Class219 arg1) {
		if (arg0 == Static239.aClass161_12) {
			if (Static156.aClass219_11 == arg1) {
				return 22;
			}
			if (Static122.aClass219_7 == arg1) {
				return 21;
			}
			if (Static145.aClass219_10 == arg1) {
				return 28;
			}
			if (Static544.aClass219_14 == arg1) {
				return 50;
			}
			if (arg1 == Static132.aClass219_8) {
				return 51;
			}
			if (Static34.aClass219_3 == arg1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!sv;)I")
	public static int method7049(@OriginalArg(1) Class311 arg0) {
		if (arg0 == Static98.aClass311_1) {
			return 2;
		} else if (Static572.aClass311_8 == arg0) {
			return 3;
		} else if (Static447.aClass311_7 == arg0) {
			return 1;
		} else if (arg0 == Static181.aClass311_4) {
			return 4;
		} else if (arg0 == Static232.aClass311_6) {
			return 6;
		} else if (arg0 == Static281.aClass311_5) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!hs;B)I")
	public static int method7050(@OriginalArg(0) Class138 arg0) {
		if (Static185.aClass138_3 == arg0) {
			return 2;
		} else if (arg0 == Static89.aClass138_1) {
			return 0;
		} else if (arg0 == Static457.aClass138_4) {
			return 1;
		} else if (arg0 == Static113.aClass138_2) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!ju;B)I")
	public static int method7051(@OriginalArg(0) Class164 arg0) {
		if (arg0 == Static411.aClass164_15) {
			return 2;
		} else if (arg0 == Static176.aClass164_9) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
