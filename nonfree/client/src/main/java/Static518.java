import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.js;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!to", name = "xg", descriptor = "[I")
	public static final int[] anIntArray531 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!to", name = "Kg", descriptor = "[I")
	public static final int[] anIntArray532 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!to", name = "Sg", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[16];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!pw;I)I")
	public static int method7188(@OriginalArg(0) Class265 arg0) {
		if (arg0 == Static226.aClass265_7) {
			return 2;
		} else if (Static569.aClass265_11 == arg0) {
			return 3;
		} else if (arg0 == Static27.aClass265_1) {
			return 1;
		} else if (arg0 == Static486.aClass265_10) {
			return 4;
		} else if (Static87.aClass265_9 == arg0) {
			return 6;
		} else if (Static468.aClass265_8 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZLclient!qaa;)I")
	public static int method7189(@OriginalArg(1) Class266 arg0) {
		if (Static514.aClass266_6 == arg0) {
			return 2;
		} else if (Static486.aClass266_5 == arg0) {
			return 4;
		} else if (Static336.aClass266_4 == arg0) {
			return 26;
		} else if (arg0 == Static438.aClass266_2) {
			return 7;
		} else if (arg0 == Static245.aClass266_3) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!jagdx/IDirect3D;ZIILclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	public static boolean method7191(@OriginalArg(0) int arg0, @OriginalArg(1) IDirect3D arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) D3DPRESENT_PARAMETERS arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = new D3DDISPLAYMODE();
			if (js.a(arg1.a(arg2, local14), 0)) {
				return false;
			}
			label79: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(34) int local34 = 0; local34 < anIntArray532.length; local34++) {
						if (arg1.CheckDeviceType(arg2, arg0, local14.Format, anIntArray532[local34], true) == 0 && arg1.CheckDeviceFormat(arg2, arg0, local14.Format, 1, 1, anIntArray532[local34]) == 0 && (arg3 == 0 || arg1.CheckDeviceMultiSampleType(arg2, arg0, anIntArray532[local34], true, local5) == 0)) {
							for (@Pc(84) int local84 = 0; local84 < anIntArray531.length; local84++) {
								if (arg1.CheckDeviceFormat(arg2, arg0, local14.Format, 2, 1, anIntArray531[local84]) == 0 && arg1.CheckDepthStencilMatch(arg2, arg0, local14.Format, anIntArray532[local34], anIntArray531[local84]) == 0 && (arg3 == 0 || arg1.CheckDeviceMultiSampleType(arg2, arg0, anIntArray531[local34], true, local5) == 0)) {
									local1 = anIntArray531[local84];
									local3 = anIntArray532[local34];
									break label79;
								}
							}
						}
					}
				}
				arg3--;
			}
			if (arg3 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg4.MultiSampleType = local5;
			arg4.BackBufferFormat = local3;
			arg4.AutoDepthStencilFormat = local1;
			arg4.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(171) Throwable local171) {
			return false;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!dca;B)I")
	public static int method7192(@OriginalArg(0) Class65 arg0) {
		if (Static93.aClass65_7 == arg0) {
			return 2;
		} else if (arg0 == Static64.aClass65_5) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ko;B)I")
	public static int method7193(@OriginalArg(0) Class179 arg0) {
		if (arg0 == Static402.aClass179_23) {
			return 2;
		} else if (arg0 == Static138.aClass179_11) {
			return 0;
		} else if (Static415.aClass179_24 == arg0) {
			return 1;
		} else if (Static438.aClass179_14 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!mg;Lclient!os;)I")
	public static int method7194(@OriginalArg(1) Class204 arg0, @OriginalArg(2) Class245 arg1) {
		if (Static331.aClass204_13 == arg0) {
			if (Static475.aClass245_14 == arg1) {
				return 22;
			}
			if (Static18.aClass245_3 == arg1) {
				return 21;
			}
			if (Static199.aClass245_11 == arg1) {
				return 28;
			}
			if (Static21.aClass245_6 == arg1) {
				return 50;
			}
			if (Static201.aClass245_12 == arg1) {
				return 51;
			}
			if (Static323.aClass245_13 == arg1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!cf;)I")
	public static int method7196(@OriginalArg(1) Class51 arg0) {
		if (Static13.aClass51_1 == arg0) {
			return 1;
		} else if (Static130.aClass51_15 == arg0) {
			return 2;
		} else if (arg0 == Static82.aClass51_18) {
			return 3;
		} else if (arg0 == Static496.aClass51_17) {
			return 4;
		} else if (arg0 == Static76.aClass51_10) {
			return 256;
		} else {
			return 0;
		}
	}
}
