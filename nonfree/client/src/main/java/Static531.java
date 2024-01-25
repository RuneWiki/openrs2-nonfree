import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.hc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!sd", name = "ah", descriptor = "[I")
	public static final int[] anIntArray517 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!sd", name = "Kg", descriptor = "[I")
	public static final int[] anIntArray519 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!sd", name = "Yg", descriptor = "[F")
	public static final float[] aFloatArray101 = new float[16];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!dea;I)I")
	public static int method7869(@OriginalArg(0) Class85 arg0) {
		if (arg0 == Static184.aClass85_2) {
			return 2;
		} else if (Static230.aClass85_3 == arg0) {
			return 3;
		} else if (arg0 == Static452.aClass85_6) {
			return 1;
		} else if (Static175.aClass85_1 == arg0) {
			return 4;
		} else if (arg0 == Static271.aClass85_4) {
			return 6;
		} else if (arg0 == Static571.aClass85_7) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!rt;)I")
	public static int method7870(@OriginalArg(1) Class312 arg0) {
		if (arg0 == Static57.aClass312_1) {
			return 2;
		} else if (Static625.aClass312_4 == arg0) {
			return 0;
		} else if (Static79.aClass312_2 == arg0) {
			return 1;
		} else if (arg0 == Static291.aClass312_3) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!li;)I")
	public static int method7871(@OriginalArg(1) Class216 arg0) {
		if (Static2.aClass216_1 == arg0) {
			return 2;
		} else if (Static551.aClass216_10 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!pj;Lclient!eu;B)I")
	public static int method7874(@OriginalArg(0) Class278 arg0, @OriginalArg(1) Class114 arg1) {
		if (Static453.aClass278_13 == arg0) {
			if (Static396.aClass114_13 == arg1) {
				return 22;
			}
			if (Static412.aClass114_17 == arg1) {
				return 21;
			}
			if (arg1 == Static78.aClass114_19) {
				return 28;
			}
			if (Static402.aClass114_14 == arg1) {
				return 50;
			}
			if (arg1 == Static560.aClass114_18) {
				return 51;
			}
			if (arg1 == Static104.aClass114_6) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLclient!up;)I")
	public static int method7875(@OriginalArg(1) Class357 arg0) {
		if (Static646.aClass357_6 == arg0) {
			return 1;
		} else if (arg0 == Static169.aClass357_3) {
			return 2;
		} else if (arg0 == Static310.aClass357_4) {
			return 3;
		} else if (arg0 == Static103.aClass357_2) {
			return 4;
		} else if (Static617.aClass357_7 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!bda;I)I")
	public static int method7876(@OriginalArg(0) Class34 arg0) {
		if (arg0 == Static362.aClass34_172) {
			return 2;
		} else if (arg0 == Static313.aClass34_88) {
			return 4;
		} else if (Static141.aClass34_77 == arg0) {
			return 26;
		} else if (arg0 == Static11.aClass34_6) {
			return 7;
		} else if (Static414.aClass34_113 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBILclient!jagdx/D3DPRESENT_PARAMETERS;ILclient!jagdx/IDirect3D;)Z")
	public static boolean method7881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) D3DPRESENT_PARAMETERS arg2, @OriginalArg(4) int arg3, @OriginalArg(5) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (hc.a((byte) 127, arg4.a(arg1, local9))) {
				return false;
			}
			label80: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(36) int local36 = 0; local36 < anIntArray517.length; local36++) {
						if (arg4.CheckDeviceType(arg1, arg0, local9.Format, anIntArray517[local36], true) == 0 && arg4.CheckDeviceFormat(arg1, arg0, local9.Format, 1, 1, anIntArray517[local36]) == 0 && (arg3 == 0 || arg4.CheckDeviceMultiSampleType(arg1, arg0, anIntArray517[local36], true, local5) == 0)) {
							for (@Pc(93) int local93 = 0; local93 < anIntArray519.length; local93++) {
								if (arg4.CheckDeviceFormat(arg1, arg0, local9.Format, 2, 1, anIntArray519[local93]) == 0 && arg4.CheckDepthStencilMatch(arg1, arg0, local9.Format, anIntArray517[local36], anIntArray519[local93]) == 0 && (arg3 == 0 || arg4.CheckDeviceMultiSampleType(arg1, arg0, anIntArray519[local36], true, local5) == 0)) {
									local3 = anIntArray517[local36];
									local1 = anIntArray519[local93];
									break label80;
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
			arg2.AutoDepthStencilFormat = local1;
			arg2.BackBufferFormat = local3;
			arg2.MultiSampleType = local5;
			arg2.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(211) Throwable local211) {
			return false;
		}
	}
}
