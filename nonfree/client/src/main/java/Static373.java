import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.eo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!oe", name = "Ag", descriptor = "[I")
	public static final int[] anIntArray396 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!oe", name = "Gg", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[16];

	@OriginalMember(owner = "client!oe", name = "Lg", descriptor = "[I")
	public static final int[] anIntArray397 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!tn;B)I")
	public static int method5788(@OriginalArg(0) Class318 arg0) {
		if (arg0 == Static132.aClass318_4) {
			return 2;
		} else if (arg0 == Static47.aClass318_3) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ct;Z)I")
	public static int method5789(@OriginalArg(0) Class61 arg0) {
		if (arg0 == Static411.aClass61_5) {
			return 2;
		} else if (arg0 == Static308.aClass61_4) {
			return 0;
		} else if (Static410.aClass61_6 == arg0) {
			return 1;
		} else if (arg0 == Static18.aClass61_1) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!qda;ZLclient!jb;)I")
	public static int method5791(@OriginalArg(0) Class273 arg0, @OriginalArg(2) Class161 arg1) {
		if (Static424.aClass273_12 == arg0) {
			if (arg1 == Static72.aClass161_4) {
				return 22;
			}
			if (arg1 == Static151.aClass161_6) {
				return 21;
			}
			if (arg1 == Static129.aClass161_5) {
				return 28;
			}
			if (arg1 == Static206.aClass161_20) {
				return 50;
			}
			if (arg1 == Static470.aClass161_16) {
				return 51;
			}
			if (arg1 == Static1.aClass161_12) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!tw;B)I")
	public static int method5792(@OriginalArg(0) Class322 arg0) {
		if (arg0 == Static72.aClass322_1) {
			return 1;
		} else if (arg0 == Static85.aClass322_2) {
			return 2;
		} else if (Static581.aClass322_6 == arg0) {
			return 3;
		} else if (Static560.aClass322_5 == arg0) {
			return 4;
		} else if (Class85.aClass322_3 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/IDirect3D;ZII)Z")
	public static boolean method5794(@OriginalArg(0) int arg0, @OriginalArg(1) D3DPRESENT_PARAMETERS arg1, @OriginalArg(2) IDirect3D arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (eo.b(arg2.a(arg0, local9), -1)) {
				return false;
			}
			label80: while (arg3 >= 0) {
				if (arg3 != 1) {
					local5 = arg3;
					for (@Pc(30) int local30 = 0; local30 < anIntArray396.length; local30++) {
						if (arg2.CheckDeviceType(arg0, arg4, local9.Format, anIntArray396[local30], true) == 0 && arg2.CheckDeviceFormat(arg0, arg4, local9.Format, 1, 1, anIntArray396[local30]) == 0 && (arg3 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg4, anIntArray396[local30], true, local5) == 0)) {
							for (@Pc(84) int local84 = 0; local84 < anIntArray397.length; local84++) {
								if (arg2.CheckDeviceFormat(arg0, arg4, local9.Format, 2, 1, anIntArray397[local84]) == 0 && arg2.CheckDepthStencilMatch(arg0, arg4, local9.Format, anIntArray396[local30], anIntArray397[local84]) == 0 && (arg3 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg4, anIntArray397[local30], true, local5) == 0)) {
									local3 = anIntArray396[local30];
									local1 = anIntArray397[local84];
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
			arg1.MultiSampleType = local5;
			arg1.MultiSampleQuality = 0;
			arg1.BackBufferFormat = local3;
			arg1.AutoDepthStencilFormat = local1;
			return true;
		} catch (@Pc(190) Throwable local190) {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!gca;I)I")
	public static int method5796(@OriginalArg(0) Class119 arg0) {
		if (Static236.aClass119_2 == arg0) {
			return 2;
		} else if (arg0 == Static324.aClass119_4) {
			return 3;
		} else if (Static381.aClass119_5 == arg0) {
			return 1;
		} else if (arg0 == Static409.aClass119_6) {
			return 4;
		} else if (arg0 == Static162.aClass119_1) {
			return 6;
		} else if (arg0 == Static273.aClass119_3) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!el;I)I")
	public static int method5797(@OriginalArg(0) Class95 arg0) {
		if (Static563.aClass95_5 == arg0) {
			return 2;
		} else if (arg0 == Static468.aClass95_3) {
			return 4;
		} else if (arg0 == Static509.aClass95_4) {
			return 26;
		} else if (Static371.aClass95_1 == arg0) {
			return 7;
		} else if (Static433.aClass95_2 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
