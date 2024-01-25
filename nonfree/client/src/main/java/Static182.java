import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.jc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!hb", name = "Og", descriptor = "[I")
	private static final int[] anIntArray200 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!hb", name = "Ug", descriptor = "[I")
	private static final int[] anIntArray201 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!hb", name = "Xg", descriptor = "[F")
	public static final float[] aFloatArray35 = new float[16];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ed;B)I")
	public static int method3205(@OriginalArg(0) Class84 arg0) {
		if (Static587.aClass84_6 == arg0) {
			return 2;
		} else if (arg0 == Static328.aClass84_3) {
			return 0;
		} else if (arg0 == Static266.aClass84_5) {
			return 1;
		} else if (Static135.aClass84_1 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!jagdx/D3DPRESENT_PARAMETERS;IIBLclient!jagdx/IDirect3D;)Z")
	public static boolean method3206(@OriginalArg(0) int arg0, @OriginalArg(1) D3DPRESENT_PARAMETERS arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(11) int local11 = 0;
		try {
			@Pc(15) D3DDISPLAYMODE local15 = new D3DDISPLAYMODE();
			if (jc.a(true, arg4.a(arg0, local15))) {
				return false;
			}
			label80: while (arg3 >= 0) {
				if (arg3 != 1) {
					local11 = arg3;
					for (@Pc(36) int local36 = 0; local36 < anIntArray201.length; local36++) {
						if (arg4.CheckDeviceType(arg0, arg2, local15.Format, anIntArray201[local36], true) == 0 && arg4.CheckDeviceFormat(arg0, arg2, local15.Format, 1, 1, anIntArray201[local36]) == 0 && (arg3 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg2, anIntArray201[local36], true, local11) == 0)) {
							for (@Pc(90) int local90 = 0; local90 < anIntArray200.length; local90++) {
								if (arg4.CheckDeviceFormat(arg0, arg2, local15.Format, 2, 1, anIntArray200[local90]) == 0 && arg4.CheckDepthStencilMatch(arg0, arg2, local15.Format, anIntArray201[local36], anIntArray200[local90]) == 0 && (arg3 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg2, anIntArray200[local36], true, local11) == 0)) {
									local1 = anIntArray200[local90];
									local3 = anIntArray201[local36];
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
			arg1.MultiSampleType = local11;
			arg1.BackBufferFormat = local3;
			arg1.MultiSampleQuality = 0;
			arg1.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(189) Throwable local189) {
			return false;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ng;)I")
	public static int method3207(@OriginalArg(1) Class225 arg0) {
		if (Static195.aClass225_3 == arg0) {
			return 2;
		} else if (Static324.aClass225_6 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lclient!sk;Lclient!vea;I)I")
	public static int method3208(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class340 arg1) {
		if (Static554.aClass340_14 == arg1) {
			if (arg0 == Static514.aClass297_13) {
				return 22;
			}
			if (Static253.aClass297_5 == arg0) {
				return 21;
			}
			if (Static257.aClass297_6 == arg0) {
				return 28;
			}
			if (Static66.aClass297_2 == arg0) {
				return 50;
			}
			if (arg0 == Static275.aClass297_8) {
				return 51;
			}
			if (arg0 == Static1.aClass297_1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!jb;B)I")
	public static int method3211(@OriginalArg(0) Class165 arg0) {
		if (Static236.aClass165_2 == arg0) {
			return 2;
		} else if (Static358.aClass165_4 == arg0) {
			return 3;
		} else if (Static118.aClass165_1 == arg0) {
			return 1;
		} else if (Static312.aClass165_3 == arg0) {
			return 4;
		} else if (arg0 == Static450.aClass165_5) {
			return 6;
		} else if (arg0 == Static567.aClass165_6) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!sj;)I")
	public static int method3214(@OriginalArg(1) Class296 arg0) {
		if (arg0 == Static507.aClass296_5) {
			return 1;
		} else if (arg0 == Static315.aClass296_3) {
			return 2;
		} else if (arg0 == Static261.aClass296_2) {
			return 3;
		} else if (Static566.aClass296_6 == arg0) {
			return 4;
		} else if (Static429.aClass296_4 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!fv;)I")
	public static int method3215(@OriginalArg(1) Class108 arg0) {
		if (arg0 == Static240.aClass108_5) {
			return 2;
		} else if (arg0 == Static9.aClass108_2) {
			return 4;
		} else if (arg0 == Static6.aClass108_7) {
			return 26;
		} else if (arg0 == Static466.aClass108_4) {
			return 7;
		} else if (Static379.aClass108_8 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
