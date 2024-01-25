import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.lg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!ul", name = "Ng", descriptor = "[I")
	private static final int[] anIntArray688 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!ul", name = "Zg", descriptor = "[F")
	public static final float[] aFloatArray99 = new float[16];

	@OriginalMember(owner = "client!ul", name = "hh", descriptor = "[I")
	public static final int[] anIntArray690 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!wha;Lclient!et;Z)I")
	public static int method8309(@OriginalArg(0) Class381 arg0, @OriginalArg(1) Class104 arg1) {
		if (arg0 == Static638.aClass381_15) {
			if (Static509.aClass104_14 == arg1) {
				return 22;
			}
			if (arg1 == Static78.aClass104_3) {
				return 21;
			}
			if (Static210.aClass104_18 == arg1) {
				return 28;
			}
			if (Static133.aClass104_4 == arg1) {
				return 50;
			}
			if (arg1 == Static219.aClass104_7) {
				return 51;
			}
			if (arg1 == Static433.aClass104_12) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!jv;)I")
	public static int method8310(@OriginalArg(1) Class191 arg0) {
		if (Static184.aClass191_1 == arg0) {
			return 2;
		} else if (Static582.aClass191_6 == arg0) {
			return 3;
		} else if (Static340.aClass191_5 == arg0) {
			return 1;
		} else if (Static339.aClass191_4 == arg0) {
			return 4;
		} else if (Static206.aClass191_2 == arg0) {
			return 6;
		} else if (arg0 == Static228.aClass191_3) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIILclient!jagdx/IDirect3D;ILclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	public static boolean method8313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) IDirect3D arg2, @OriginalArg(4) int arg3, @OriginalArg(5) D3DPRESENT_PARAMETERS arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(17) D3DDISPLAYMODE local17 = new D3DDISPLAYMODE();
			if (lg.a(-2005530522, arg2.a(arg3, local17))) {
				return false;
			}
			label81: while (arg1 >= 0) {
				if (arg1 != 1) {
					local5 = arg1;
					for (@Pc(42) int local42 = 0; local42 < anIntArray690.length; local42++) {
						if (arg2.CheckDeviceType(arg3, arg0, local17.Format, anIntArray690[local42], true) == 0 && arg2.CheckDeviceFormat(arg3, arg0, local17.Format, 1, 1, anIntArray690[local42]) == 0 && (arg1 == 0 || arg2.CheckDeviceMultiSampleType(arg3, arg0, anIntArray690[local42], true, local5) == 0)) {
							for (@Pc(91) int local91 = 0; local91 < anIntArray688.length; local91++) {
								if (arg2.CheckDeviceFormat(arg3, arg0, local17.Format, 2, 1, anIntArray688[local91]) == 0 && arg2.CheckDepthStencilMatch(arg3, arg0, local17.Format, anIntArray690[local42], anIntArray688[local91]) == 0 && (arg1 == 0 || arg2.CheckDeviceMultiSampleType(arg3, arg0, anIntArray688[local42], true, local5) == 0)) {
									local3 = anIntArray690[local42];
									local1 = anIntArray688[local91];
									break label81;
								}
							}
						}
					}
				}
				arg1--;
			}
			if (arg1 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg4.AutoDepthStencilFormat = local1;
			arg4.MultiSampleQuality = 0;
			arg4.MultiSampleType = local5;
			arg4.BackBufferFormat = local3;
			return true;
		} catch (@Pc(193) Throwable local193) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!bp;)I")
	public static int method8314(@OriginalArg(1) Class43 arg0) {
		if (arg0 == Static338.aClass43_3) {
			return 2;
		} else if (Static23.aClass43_1 == arg0) {
			return 0;
		} else if (arg0 == Static287.aClass43_8) {
			return 1;
		} else if (arg0 == Static470.aClass43_5) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!pfa;Z)I")
	public static int method8315(@OriginalArg(0) Class269 arg0) {
		if (arg0 == Static408.aClass269_3) {
			return 2;
		} else if (Static259.aClass269_4 == arg0) {
			return 4;
		} else if (Static398.aClass269_5 == arg0) {
			return 26;
		} else if (arg0 == Static26.aClass269_1) {
			return 7;
		} else if (Static414.aClass269_6 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!cg;I)I")
	public static int method8316(@OriginalArg(0) Class54 arg0) {
		if (Static216.aClass54_3 == arg0) {
			return 2;
		} else if (arg0 == Static397.aClass54_6) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!en;)I")
	public static int method8321(@OriginalArg(1) Class100 arg0) {
		if (arg0 == Static557.aClass100_5) {
			return 1;
		} else if (arg0 == Static593.aClass100_6) {
			return 2;
		} else if (arg0 == Static377.aClass100_3) {
			return 3;
		} else if (arg0 == Static84.aClass100_1) {
			return 4;
		} else if (arg0 == Static108.aClass100_2) {
			return 256;
		} else {
			return 0;
		}
	}
}
