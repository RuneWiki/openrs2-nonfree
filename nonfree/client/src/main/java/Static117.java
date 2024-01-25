import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.ae;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ega", name = "xg", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[16];

	@OriginalMember(owner = "client!ega", name = "Gg", descriptor = "[I")
	public static final int[] anIntArray92 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!ega", name = "Lg", descriptor = "[I")
	public static final int[] anIntArray93 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILclient!pn;Lclient!jg;)I")
	public static int method2129(@OriginalArg(1) Class271 arg0, @OriginalArg(2) Class172 arg1) {
		if (Static243.aClass172_9 == arg1) {
			if (Static573.aClass271_15 == arg0) {
				return 22;
			}
			if (Static429.aClass271_12 == arg0) {
				return 21;
			}
			if (arg0 == Static268.aClass271_7) {
				return 28;
			}
			if (arg0 == Static253.aClass271_6) {
				return 50;
			}
			if (Static560.aClass271_14 == arg0) {
				return 51;
			}
			if (arg0 == Static243.aClass271_5) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!jagdx/IDirect3D;Lclient!jagdx/D3DPRESENT_PARAMETERS;IIIB)Z")
	public static boolean method2131(@OriginalArg(0) IDirect3D arg0, @OriginalArg(1) D3DPRESENT_PARAMETERS arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (ae.a(2005530584, arg0.a(arg3, local9))) {
				return false;
			}
			label79: while (arg2 >= 0) {
				if (arg2 != 1) {
					local5 = arg2;
					for (@Pc(33) int local33 = 0; local33 < anIntArray92.length; local33++) {
						if (arg0.CheckDeviceType(arg3, arg4, local9.Format, anIntArray92[local33], true) == 0 && arg0.CheckDeviceFormat(arg3, arg4, local9.Format, 1, 1, anIntArray92[local33]) == 0 && (arg2 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg4, anIntArray92[local33], true, local5) == 0)) {
							for (@Pc(79) int local79 = 0; local79 < anIntArray93.length; local79++) {
								if (arg0.CheckDeviceFormat(arg3, arg4, local9.Format, 2, 1, anIntArray93[local79]) == 0 && arg0.CheckDepthStencilMatch(arg3, arg4, local9.Format, anIntArray92[local33], anIntArray93[local79]) == 0 && (arg2 == 0 || arg0.CheckDeviceMultiSampleType(arg3, arg4, anIntArray93[local33], true, local5) == 0)) {
									local1 = anIntArray93[local79];
									local3 = anIntArray92[local33];
									break label79;
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
			arg1.MultiSampleType = local5;
			arg1.MultiSampleQuality = 0;
			arg1.AutoDepthStencilFormat = local1;
			arg1.BackBufferFormat = local3;
			return true;
		} catch (@Pc(182) Throwable local182) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!eg;I)I")
	public static int method2133(@OriginalArg(0) Class77 arg0) {
		if (Static578.aClass77_8 == arg0) {
			return 2;
		} else if (arg0 == Static308.aClass77_2) {
			return 3;
		} else if (Static547.aClass77_7 == arg0) {
			return 1;
		} else if (Static302.aClass77_5 == arg0) {
			return 4;
		} else if (arg0 == Static528.aClass77_6) {
			return 6;
		} else if (arg0 == Static312.aClass77_3) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!gi;B)I")
	public static int method2134(@OriginalArg(0) Class118 arg0) {
		if (Static569.aClass118_4 == arg0) {
			return 2;
		} else if (arg0 == Static31.aClass118_1) {
			return 4;
		} else if (arg0 == Static585.aClass118_5) {
			return 26;
		} else if (arg0 == Static327.aClass118_2) {
			return 7;
		} else if (Static528.aClass118_3 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BLclient!hw;)I")
	public static int method2135(@OriginalArg(1) Class148 arg0) {
		if (Static47.aClass148_1 == arg0) {
			return 2;
		} else if (arg0 == Static155.aClass148_2) {
			return 0;
		} else if (Static226.aClass148_3 == arg0) {
			return 1;
		} else if (Static276.aClass148_4 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!dca;B)I")
	public static int method2136(@OriginalArg(0) Class54 arg0) {
		if (arg0 == Static299.aClass54_6) {
			return 2;
		} else if (arg0 == Static267.aClass54_5) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILclient!tb;)I")
	public static int method2138(@OriginalArg(1) Class316 arg0) {
		if (Static561.aClass316_6 == arg0) {
			return 1;
		} else if (arg0 == Static175.aClass316_4) {
			return 2;
		} else if (Static169.aClass316_3 == arg0) {
			return 3;
		} else if (arg0 == Static34.aClass316_2) {
			return 4;
		} else if (Static422.aClass316_5 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}
}
