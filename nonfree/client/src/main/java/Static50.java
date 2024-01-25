import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bv", name = "Ag", descriptor = "[I")
	public static final int[] anIntArray125 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!bv", name = "Tg", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[16];

	@OriginalMember(owner = "client!bv", name = "Vg", descriptor = "[I")
	public static final int[] anIntArray127 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!fj;)I")
	public static int method1340(@OriginalArg(1) Class101 arg0) {
		if (Static342.aClass101_4 == arg0) {
			return 2;
		} else if (arg0 == Static227.aClass101_5) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!hf;)I")
	public static int method1342(@OriginalArg(1) Class129 arg0) {
		if (Static191.aClass129_3 == arg0) {
			return 2;
		} else if (Static506.aClass129_5 == arg0) {
			return 4;
		} else if (arg0 == Static159.aClass129_2) {
			return 26;
		} else if (arg0 == Static88.aClass129_1) {
			return 7;
		} else if (Static463.aClass129_4 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!io;Z)I")
	public static int method1344(@OriginalArg(0) Class147 arg0) {
		if (Static325.aClass147_7 == arg0) {
			return 2;
		} else if (Static194.aClass147_4 == arg0) {
			return 3;
		} else if (arg0 == Static228.aClass147_6) {
			return 1;
		} else if (arg0 == Static480.aClass147_8) {
			return 4;
		} else if (arg0 == Static338.aClass147_3) {
			return 6;
		} else if (Static205.aClass147_5 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!vaa;B)I")
	public static int method1345(@OriginalArg(0) Class299 arg0) {
		if (arg0 == Static43.aClass299_1) {
			return 1;
		} else if (Static261.aClass299_2 == arg0) {
			return 2;
		} else if (Static436.aClass299_6 == arg0) {
			return 3;
		} else if (arg0 == Static365.aClass299_4) {
			return 4;
		} else if (Static414.aClass299_5 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ge;Lclient!dk;B)I")
	public static int method1347(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class72 arg1) {
		if (arg0 == Static155.aClass114_6) {
			if (Static332.aClass72_8 == arg1) {
				return 22;
			}
			if (Static306.aClass72_5 == arg1) {
				return 21;
			}
			if (Static61.aClass72_1 == arg1) {
				return 28;
			}
			if (arg1 == Static173.aClass72_4) {
				return 50;
			}
			if (Static473.aClass72_15 == arg1) {
				return 51;
			}
			if (arg1 == Static392.aClass72_11) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IBLclient!jagdx/D3DPRESENT_PARAMETERS;ILclient!jagdx/IDirect3D;I)Z")
	public static boolean method1348(@OriginalArg(0) int arg0, @OriginalArg(2) D3DPRESENT_PARAMETERS arg1, @OriginalArg(3) int arg2, @OriginalArg(4) IDirect3D arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(9) D3DDISPLAYMODE local9 = arg3.b(arg4);
		label69: while (arg2 >= 0) {
			if (arg2 != 1) {
				local5 = arg2;
				for (@Pc(20) int local20 = 0; local20 < anIntArray125.length; local20++) {
					if (arg3.CheckDeviceType(arg4, arg0, local9.Format, anIntArray125[local20], true) == 0 && arg3.CheckDeviceFormat(arg4, arg0, local9.Format, 1, 1, anIntArray125[local20]) == 0 && (arg2 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg0, anIntArray125[local20], true, local5) == 0)) {
						for (@Pc(66) int local66 = 0; local66 < anIntArray127.length; local66++) {
							if (arg3.CheckDeviceFormat(arg4, arg0, local9.Format, 2, 1, anIntArray127[local66]) == 0 && arg3.CheckDepthStencilMatch(arg4, arg0, local9.Format, anIntArray125[local20], anIntArray127[local66]) == 0 && (arg2 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg0, anIntArray127[local20], true, local5) == 0)) {
								local3 = anIntArray125[local20];
								local1 = anIntArray127[local66];
								break label69;
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
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!vf;B)I")
	public static int method1349(@OriginalArg(0) Class302 arg0) {
		if (Static159.aClass302_1 == arg0) {
			return 2;
		} else if (arg0 == Static388.aClass302_3) {
			return 0;
		} else if (arg0 == Static499.aClass302_4) {
			return 1;
		} else if (Static371.aClass302_2 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
