import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.ud;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!rja", name = "Yg", descriptor = "[I")
	private static final int[] anIntArray736 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!rja", name = "ah", descriptor = "[F")
	public static final float[] aFloatArray74 = new float[16];

	@OriginalMember(owner = "client!rja", name = "ch", descriptor = "[I")
	private static final int[] anIntArray737 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILclient!wga;)I")
	public static int method7544(@OriginalArg(1) Class385 arg0) {
		if (Static198.aClass385_42 == arg0) {
			return 2;
		} else if (arg0 == Static672.aClass385_43) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILclient!ln;)I")
	public static int method7547(@OriginalArg(1) Class203 arg0) {
		if (arg0 == Static265.aClass203_3) {
			return 2;
		} else if (Static580.aClass203_4 == arg0) {
			return 4;
		} else if (arg0 == Static582.aClass203_5) {
			return 26;
		} else if (arg0 == Static191.aClass203_2) {
			return 7;
		} else if (Static152.aClass203_1 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!eo;Z)I")
	public static int method7548(@OriginalArg(0) Class94 arg0) {
		if (arg0 == Static215.aClass94_5) {
			return 1;
		} else if (Static178.aClass94_4 == arg0) {
			return 2;
		} else if (Static293.aClass94_6 == arg0) {
			return 3;
		} else if (arg0 == Static76.aClass94_2) {
			return 4;
		} else if (Static66.aClass94_1 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILclient!ss;)I")
	public static int method7549(@OriginalArg(1) Class326 arg0) {
		if (Static523.aClass326_5 == arg0) {
			return 2;
		} else if (Static206.aClass326_3 == arg0) {
			return 0;
		} else if (arg0 == Static348.aClass326_4) {
			return 1;
		} else if (Static125.aClass326_1 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!wt;I)I")
	public static int method7552(@OriginalArg(0) Class393 arg0) {
		if (Static318.aClass393_2 == arg0) {
			return 2;
		} else if (Static406.aClass393_3 == arg0) {
			return 3;
		} else if (Static144.aClass393_1 == arg0) {
			return 1;
		} else if (arg0 == Static413.aClass393_4) {
			return 4;
		} else if (arg0 == Static668.aClass393_6) {
			return 6;
		} else if (arg0 == Static492.aClass393_5) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!sw;Lclient!ig;B)I")
	public static int method7553(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class152 arg1) {
		if (Static246.aClass152_10 == arg1) {
			if (arg0 == Static357.aClass327_14) {
				return 22;
			}
			if (arg0 == Static419.aClass327_2) {
				return 21;
			}
			if (arg0 == Static337.aClass327_12) {
				return 28;
			}
			if (Static276.aClass327_10 == arg0) {
				return 50;
			}
			if (arg0 == Static338.aClass327_13) {
				return 51;
			}
			if (Static181.aClass327_5 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!jagdx/D3DPRESENT_PARAMETERS;IBLclient!jagdx/IDirect3D;II)Z")
	public static boolean method7554(@OriginalArg(0) D3DPRESENT_PARAMETERS arg0, @OriginalArg(1) int arg1, @OriginalArg(3) IDirect3D arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		try {
			@Pc(15) D3DDISPLAYMODE local15 = new D3DDISPLAYMODE();
			if (ud.a(arg2.a(arg3, local15), (byte) -100)) {
				return false;
			}
			label79: while (arg4 >= 0) {
				if (arg4 != 1) {
					local11 = arg4;
					for (@Pc(41) int local41 = 0; local41 < anIntArray736.length; local41++) {
						if (arg2.CheckDeviceType(arg3, arg1, local15.Format, anIntArray736[local41], true) == 0 && arg2.CheckDeviceFormat(arg3, arg1, local15.Format, 1, 1, anIntArray736[local41]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg3, arg1, anIntArray736[local41], true, local11) == 0)) {
							for (@Pc(93) int local93 = 0; local93 < anIntArray737.length; local93++) {
								if (arg2.CheckDeviceFormat(arg3, arg1, local15.Format, 2, 1, anIntArray737[local93]) == 0 && arg2.CheckDepthStencilMatch(arg3, arg1, local15.Format, anIntArray736[local41], anIntArray737[local93]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg3, arg1, anIntArray737[local41], true, local11) == 0)) {
									local9 = anIntArray736[local41];
									local7 = anIntArray737[local93];
									break label79;
								}
							}
						}
					}
				}
				arg4--;
			}
			if (arg4 < 0 || local9 == 0 || local7 == 0) {
				return false;
			}
			arg0.MultiSampleQuality = 0;
			arg0.BackBufferFormat = local9;
			arg0.MultiSampleType = local11;
			arg0.AutoDepthStencilFormat = local7;
			return true;
		} catch (@Pc(185) Throwable local185) {
			return false;
		}
	}
}
