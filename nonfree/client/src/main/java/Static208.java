import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.ec;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hl", name = "Ig", descriptor = "[I")
	public static final int[] anIntArray261 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!hl", name = "Pg", descriptor = "[F")
	public static final float[] aFloatArray53 = new float[16];

	@OriginalMember(owner = "client!hl", name = "eh", descriptor = "[I")
	public static final int[] anIntArray263 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!uh;I)I")
	public static int method4010(@OriginalArg(0) Class342 arg0) {
		if (Static449.aClass342_2 == arg0) {
			return 2;
		} else if (arg0 == Static546.aClass342_4) {
			return 3;
		} else if (Static618.aClass342_6 == arg0) {
			return 1;
		} else if (Static525.aClass342_3 == arg0) {
			return 4;
		} else if (arg0 == Static573.aClass342_5) {
			return 6;
		} else if (arg0 == Static16.aClass342_1) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!mk;B)I")
	public static int method4011(@OriginalArg(0) Class207 arg0) {
		if (arg0 == Static117.aClass207_2) {
			return 1;
		} else if (Static465.aClass207_6 == arg0) {
			return 2;
		} else if (arg0 == Static222.aClass207_5) {
			return 3;
		} else if (Static167.aClass207_3 == arg0) {
			return 4;
		} else if (Static170.aClass207_4 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!bga;I)I")
	public static int method4012(@OriginalArg(0) Class34 arg0) {
		if (Static428.aClass34_5 == arg0) {
			return 2;
		} else if (arg0 == Static402.aClass34_4) {
			return 4;
		} else if (Static584.aClass34_6 == arg0) {
			return 26;
		} else if (arg0 == Static125.aClass34_3) {
			return 7;
		} else if (arg0 == Static588.aClass34_7) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!jagdx/IDirect3D;ILclient!jagdx/D3DPRESENT_PARAMETERS;II)Z")
	public static boolean method4014(@OriginalArg(0) int arg0, @OriginalArg(1) IDirect3D arg1, @OriginalArg(2) int arg2, @OriginalArg(3) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(10) int local10 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = new D3DDISPLAYMODE();
			if (ec.b(arg1.a(arg0, local14), -15560)) {
				return false;
			}
			label78: while (arg4 >= 0) {
				if (arg4 != 1) {
					local10 = arg4;
					for (@Pc(38) int local38 = 0; local38 < anIntArray261.length; local38++) {
						if (arg1.CheckDeviceType(arg0, arg2, local14.Format, anIntArray261[local38], true) == 0 && arg1.CheckDeviceFormat(arg0, arg2, local14.Format, 1, 1, anIntArray261[local38]) == 0 && (arg4 == 0 || arg1.CheckDeviceMultiSampleType(arg0, arg2, anIntArray261[local38], true, local10) == 0)) {
							for (@Pc(88) int local88 = 0; local88 < anIntArray263.length; local88++) {
								if (arg1.CheckDeviceFormat(arg0, arg2, local14.Format, 2, 1, anIntArray263[local88]) == 0 && arg1.CheckDepthStencilMatch(arg0, arg2, local14.Format, anIntArray261[local38], anIntArray263[local88]) == 0 && (arg4 == 0 || arg1.CheckDeviceMultiSampleType(arg0, arg2, anIntArray263[local38], true, local10) == 0)) {
									local1 = anIntArray263[local88];
									local3 = anIntArray261[local38];
									break label78;
								}
							}
						}
					}
				}
				arg4--;
			}
			if (arg4 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg3.BackBufferFormat = local3;
			arg3.MultiSampleQuality = 0;
			arg3.MultiSampleType = local10;
			arg3.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(177) Throwable local177) {
			return false;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!pt;I)I")
	public static int method4017(@OriginalArg(0) Class265 arg0) {
		if (arg0 == Static625.aClass265_10) {
			return 2;
		} else if (arg0 == Static303.aClass265_5) {
			return 0;
		} else if (arg0 == Static613.aClass265_9) {
			return 1;
		} else if (arg0 == Static190.aClass265_8) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!wd;Lclient!jm;I)I")
	public static int method4018(@OriginalArg(0) Class366 arg0, @OriginalArg(1) Class160 arg1) {
		if (arg1 == Static258.aClass160_9) {
			if (arg0 == Static527.aClass366_12) {
				return 22;
			}
			if (arg0 == Static456.aClass366_9) {
				return 21;
			}
			if (Static526.aClass366_11 == arg0) {
				return 28;
			}
			if (Static20.aClass366_1 == arg0) {
				return 50;
			}
			if (arg0 == Static627.aClass366_15) {
				return 51;
			}
			if (arg0 == Static95.aClass366_3) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!qo;)I")
	public static int method4019(@OriginalArg(1) Class277 arg0) {
		if (arg0 == Static579.aClass277_10) {
			return 2;
		} else if (Static116.aClass277_4 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
