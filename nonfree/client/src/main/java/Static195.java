import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hv", name = "V", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[16];

	@OriginalMember(owner = "client!hv", name = "Dg", descriptor = "[I")
	private static final int[] anIntArray319 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!hv", name = "Eg", descriptor = "[I")
	public static final int[] anIntArray320 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!sm;)I")
	public static int method3400(@OriginalArg(1) Class271 arg0) {
		if (Static486.aClass271_5 == arg0) {
			return 2;
		} else if (arg0 == Static449.aClass271_4) {
			return 4;
		} else if (Static343.aClass271_2 == arg0) {
			return 26;
		} else if (Static39.aClass271_1 == arg0) {
			return 7;
		} else if (Static433.aClass271_3 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZLclient!lg;)I")
	public static int method3401(@OriginalArg(1) Class181 arg0) {
		if (Static162.aClass181_2 == arg0) {
			return 2;
		} else if (Static30.aClass181_1 == arg0) {
			return 0;
		} else if (Static295.aClass181_3 == arg0) {
			return 1;
		} else if (arg0 == Static312.aClass181_4) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/IDirect3D;I)Z")
	public static boolean method3402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) D3DPRESENT_PARAMETERS arg3, @OriginalArg(4) IDirect3D arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = arg4.a(arg0);
			label75: while (arg2 >= 0) {
				if (arg2 != 1) {
					local5 = arg2;
					for (@Pc(23) int local23 = 0; local23 < anIntArray319.length; local23++) {
						if (arg4.CheckDeviceType(arg0, arg1, local9.Format, anIntArray319[local23], true) == 0 && arg4.CheckDeviceFormat(arg0, arg1, local9.Format, 1, 1, anIntArray319[local23]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg1, anIntArray319[local23], true, local5) == 0)) {
							for (@Pc(77) int local77 = 0; local77 < anIntArray320.length; local77++) {
								if (arg4.CheckDeviceFormat(arg0, arg1, local9.Format, 2, 1, anIntArray320[local77]) == 0 && arg4.CheckDepthStencilMatch(arg0, arg1, local9.Format, anIntArray319[local23], anIntArray320[local77]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg1, anIntArray320[local23], true, local5) == 0)) {
									local1 = anIntArray320[local77];
									local3 = anIntArray319[local23];
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
			arg3.BackBufferFormat = local3;
			arg3.MultiSampleType = local5;
			arg3.MultiSampleQuality = 0;
			arg3.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(182) Throwable local182) {
			return false;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!gu;)I")
	public static int method3404(@OriginalArg(1) Class113 arg0) {
		if (arg0 == Static402.aClass113_9) {
			return 2;
		} else if (Static119.aClass113_4 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!gn;)I")
	public static int method3405(@OriginalArg(1) Class110 arg0) {
		if (Static91.aClass110_1 == arg0) {
			return 1;
		} else if (Static272.aClass110_4 == arg0) {
			return 2;
		} else if (arg0 == Static455.aClass110_6) {
			return 3;
		} else if (arg0 == Static132.aClass110_3) {
			return 4;
		} else if (arg0 == Static111.aClass110_2) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!be;)I")
	public static int method3406(@OriginalArg(1) Class22 arg0) {
		if (Static389.aClass22_5 == arg0) {
			return 2;
		} else if (Static287.aClass22_3 == arg0) {
			return 3;
		} else if (Static171.aClass22_2 == arg0) {
			return 1;
		} else if (Static354.aClass22_4 == arg0) {
			return 4;
		} else if (Static137.aClass22_1 == arg0) {
			return 6;
		} else if (arg0 == Static527.aClass22_6) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!uda;Lclient!sb;I)I")
	public static int method3407(@OriginalArg(0) Class292 arg0, @OriginalArg(1) Class264 arg1) {
		if (arg1 == Static431.aClass264_15) {
			if (Static252.aClass292_9 == arg0) {
				return 22;
			}
			if (Static542.aClass292_17 == arg0) {
				return 21;
			}
			if (Static526.aClass292_15 == arg0) {
				return 28;
			}
			if (arg0 == Static299.aClass292_10) {
				return 50;
			}
			if (Static184.aClass292_13 == arg0) {
				return 51;
			}
			if (Static521.aClass292_14 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}
}
