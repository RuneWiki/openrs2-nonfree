import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.rn;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aia", name = "ah", descriptor = "[F")
	public static final float[] aFloatArray20 = new float[16];

	@OriginalMember(owner = "client!aia", name = "bh", descriptor = "[I")
	public static final int[] anIntArray11 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!aia", name = "eh", descriptor = "[I")
	public static final int[] anIntArray12 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIILclient!jagdx/IDirect3D;ILclient!jagdx/D3DPRESENT_PARAMETERS;)Z")
	public static boolean method683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) IDirect3D arg2, @OriginalArg(4) int arg3, @OriginalArg(5) D3DPRESENT_PARAMETERS arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(11) int local11 = 0;
		try {
			@Pc(15) D3DDISPLAYMODE local15 = new D3DDISPLAYMODE();
			if (rn.b(arg2.a(arg0, local15), -18558)) {
				return false;
			}
			label81: while (arg1 >= 0) {
				if (arg1 != 1) {
					local11 = arg1;
					for (@Pc(38) int local38 = 0; local38 < anIntArray11.length; local38++) {
						if (arg2.CheckDeviceType(arg0, arg3, local15.Format, anIntArray11[local38], true) == 0 && arg2.CheckDeviceFormat(arg0, arg3, local15.Format, 1, 1, anIntArray11[local38]) == 0 && (arg1 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg3, anIntArray11[local38], true, local11) == 0)) {
							for (@Pc(88) int local88 = 0; local88 < anIntArray12.length; local88++) {
								if (arg2.CheckDeviceFormat(arg0, arg3, local15.Format, 2, 1, anIntArray12[local88]) == 0 && arg2.CheckDepthStencilMatch(arg0, arg3, local15.Format, anIntArray11[local38], anIntArray12[local88]) == 0 && (arg1 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg3, anIntArray12[local38], true, local11) == 0)) {
									local3 = anIntArray11[local38];
									local1 = anIntArray12[local88];
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
			arg4.BackBufferFormat = local3;
			arg4.MultiSampleQuality = 0;
			arg4.AutoDepthStencilFormat = local1;
			arg4.MultiSampleType = local11;
			return true;
		} catch (@Pc(190) Throwable local190) {
			return false;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILclient!bo;)I")
	public static int method684(@OriginalArg(1) Class44 arg0) {
		if (Static43.aClass44_1 == arg0) {
			return 2;
		} else if (arg0 == Static576.aClass44_6) {
			return 3;
		} else if (arg0 == Static104.aClass44_2) {
			return 1;
		} else if (arg0 == Static425.aClass44_5) {
			return 4;
		} else if (arg0 == Static351.aClass44_3) {
			return 6;
		} else if (Static375.aClass44_4 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILclient!afa;)I")
	public static int method685(@OriginalArg(1) Class11 arg0) {
		if (arg0 == Static19.aClass11_1) {
			return 2;
		} else if (Static458.aClass11_4 == arg0) {
			return 4;
		} else if (arg0 == Static49.aClass11_2) {
			return 26;
		} else if (arg0 == Static333.aClass11_3) {
			return 7;
		} else if (arg0 == Static539.aClass11_5) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZLclient!jda;)I")
	public static int method686(@OriginalArg(1) Class188 arg0) {
		if (arg0 == Static70.aClass188_1) {
			return 2;
		} else if (Static317.aClass188_3 == arg0) {
			return 0;
		} else if (Static622.aClass188_4 == arg0) {
			return 1;
		} else if (arg0 == Static262.aClass188_2) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!ul;Lclient!so;I)I")
	public static int method688(@OriginalArg(0) Class361 arg0, @OriginalArg(1) Class330 arg1) {
		if (Static553.aClass330_14 == arg1) {
			if (arg0 == Static63.aClass361_14) {
				return 22;
			}
			if (Static264.aClass361_8 == arg0) {
				return 21;
			}
			if (arg0 == Static550.aClass361_15) {
				return 28;
			}
			if (arg0 == Static356.aClass361_9) {
				return 50;
			}
			if (arg0 == Static665.aClass361_16) {
				return 51;
			}
			if (Static196.aClass361_5 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLclient!am;)I")
	public static int method689(@OriginalArg(1) Class20 arg0) {
		if (arg0 == Static34.aClass20_2) {
			return 1;
		} else if (arg0 == Static523.aClass20_6) {
			return 2;
		} else if (Static6.aClass20_1 == arg0) {
			return 3;
		} else if (arg0 == Static280.aClass20_4) {
			return 4;
		} else if (arg0 == Static393.aClass20_8) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!ws;I)I")
	public static int method694(@OriginalArg(0) Class395 arg0) {
		if (Static193.aClass395_14 == arg0) {
			return 2;
		} else if (Static268.aClass395_9 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
