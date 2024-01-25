import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.rl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hg", name = "Cg", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[16];

	@OriginalMember(owner = "client!hg", name = "Ng", descriptor = "[I")
	public static final int[] anIntArray318 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!hg", name = "Wg", descriptor = "[I")
	public static final int[] anIntArray319 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!gw;B)I")
	public static int method3529(@OriginalArg(0) Class123 arg0) {
		if (arg0 == Static40.aClass123_9) {
			return 2;
		} else if (arg0 == Static206.aClass123_7) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!cb;B)I")
	public static int method3530(@OriginalArg(0) Class37 arg0) {
		if (Static587.aClass37_5 == arg0) {
			return 2;
		} else if (arg0 == Static106.aClass37_2) {
			return 4;
		} else if (Static474.aClass37_3 == arg0) {
			return 26;
		} else if (arg0 == Static581.aClass37_4) {
			return 7;
		} else if (Static36.aClass37_1 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!jv;B)I")
	public static int method3532(@OriginalArg(0) Class174 arg0) {
		if (Static53.aClass174_10 == arg0) {
			return 1;
		} else if (Static325.aClass174_26 == arg0) {
			return 2;
		} else if (Static534.aClass174_31 == arg0) {
			return 3;
		} else if (Static233.aClass174_24 == arg0) {
			return 4;
		} else if (arg0 == Static70.aClass174_35) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!fda;Lclient!ro;)I")
	public static int method3533(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class292 arg1) {
		if (arg1 == Static461.aClass292_14) {
			if (arg0 == Static146.aClass93_6) {
				return 22;
			}
			if (Static581.aClass93_14 == arg0) {
				return 21;
			}
			if (Static563.aClass93_13 == arg0) {
				return 28;
			}
			if (arg0 == Static423.aClass93_9) {
				return 50;
			}
			if (arg0 == Static58.aClass93_4) {
				return 51;
			}
			if (Static586.aClass93_15 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!tf;)I")
	public static int method3534(@OriginalArg(1) Class319 arg0) {
		if (Static305.aClass319_5 == arg0) {
			return 2;
		} else if (Static380.aClass319_6 == arg0) {
			return 3;
		} else if (arg0 == Static577.aClass319_4) {
			return 1;
		} else if (Static534.aClass319_7 == arg0) {
			return 4;
		} else if (Static129.aClass319_2 == arg0) {
			return 6;
		} else if (Static94.aClass319_1 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!ow;)I")
	public static int method3535(@OriginalArg(1) Class252 arg0) {
		if (Static74.aClass252_1 == arg0) {
			return 2;
		} else if (Static525.aClass252_4 == arg0) {
			return 0;
		} else if (arg0 == Static165.aClass252_3) {
			return 1;
		} else if (Static88.aClass252_2 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!jagdx/IDirect3D;IIILclient!jagdx/D3DPRESENT_PARAMETERS;I)Z")
	public static boolean method3537(@OriginalArg(0) IDirect3D arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		try {
			@Pc(15) D3DDISPLAYMODE local15 = new D3DDISPLAYMODE();
			if (rl.a(arg0.a(arg2, local15), (byte) -114)) {
				return false;
			}
			label78: while (arg1 >= 0) {
				if (arg1 != 1) {
					local11 = arg1;
					for (@Pc(37) int local37 = 0; local37 < anIntArray318.length; local37++) {
						if (arg0.CheckDeviceType(arg2, arg4, local15.Format, anIntArray318[local37], true) == 0 && arg0.CheckDeviceFormat(arg2, arg4, local15.Format, 1, 1, anIntArray318[local37]) == 0 && (arg1 == 0 || arg0.CheckDeviceMultiSampleType(arg2, arg4, anIntArray318[local37], true, local11) == 0)) {
							for (@Pc(82) int local82 = 0; local82 < anIntArray319.length; local82++) {
								if (arg0.CheckDeviceFormat(arg2, arg4, local15.Format, 2, 1, anIntArray319[local82]) == 0 && arg0.CheckDepthStencilMatch(arg2, arg4, local15.Format, anIntArray318[local37], anIntArray319[local82]) == 0 && (arg1 == 0 || arg0.CheckDeviceMultiSampleType(arg2, arg4, anIntArray319[local37], true, local11) == 0)) {
									local1 = anIntArray319[local82];
									local9 = anIntArray318[local37];
									break label78;
								}
							}
						}
					}
				}
				arg1--;
			}
			if (arg1 < 0 || local9 == 0 || local1 == 0) {
				return false;
			}
			arg3.BackBufferFormat = local9;
			arg3.MultiSampleQuality = 0;
			arg3.AutoDepthStencilFormat = local1;
			arg3.MultiSampleType = local11;
			return true;
		} catch (@Pc(177) Throwable local177) {
			return false;
		}
	}
}
