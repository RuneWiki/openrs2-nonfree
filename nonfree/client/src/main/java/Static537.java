import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.saa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!sga", name = "Sg", descriptor = "[I")
	private static final int[] anIntArray604 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!sga", name = "Ug", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[16];

	@OriginalMember(owner = "client!sga", name = "dh", descriptor = "[I")
	public static final int[] anIntArray605 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!pb;ZLclient!oea;)I")
	public static int method7654(@OriginalArg(0) Class265 arg0, @OriginalArg(2) Class250 arg1) {
		if (Static417.aClass250_14 == arg1) {
			if (Static289.aClass265_13 == arg0) {
				return 22;
			}
			if (arg0 == Static169.aClass265_9) {
				return 21;
			}
			if (Static447.aClass265_15 == arg0) {
				return 28;
			}
			if (Static356.aClass265_14 == arg0) {
				return 50;
			}
			if (arg0 == Static98.aClass265_16) {
				return 51;
			}
			if (arg0 == Static662.aClass265_19) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!vq;I)I")
	public static int method7655(@OriginalArg(0) Class378 arg0) {
		if (arg0 == Static368.aClass378_1) {
			return 2;
		} else if (Static568.aClass378_2 == arg0) {
			return 0;
		} else if (arg0 == Static648.aClass378_4) {
			return 1;
		} else if (Static583.aClass378_3 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILclient!jagdx/D3DPRESENT_PARAMETERS;BILclient!jagdx/IDirect3D;I)Z")
	public static boolean method7657(@OriginalArg(0) int arg0, @OriginalArg(1) D3DPRESENT_PARAMETERS arg1, @OriginalArg(3) int arg2, @OriginalArg(4) IDirect3D arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(15) D3DDISPLAYMODE local15 = new D3DDISPLAYMODE();
			if (saa.a(arg3.a(arg2, local15), (byte) 84)) {
				return false;
			}
			label78: while (arg0 >= 0) {
				if (arg0 != 1) {
					local5 = arg0;
					for (@Pc(37) int local37 = 0; local37 < anIntArray605.length; local37++) {
						if (arg3.CheckDeviceType(arg2, arg4, local15.Format, anIntArray605[local37], true) == 0 && arg3.CheckDeviceFormat(arg2, arg4, local15.Format, 1, 1, anIntArray605[local37]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg2, arg4, anIntArray605[local37], true, local5) == 0)) {
							for (@Pc(86) int local86 = 0; local86 < anIntArray604.length; local86++) {
								if (arg3.CheckDeviceFormat(arg2, arg4, local15.Format, 2, 1, anIntArray604[local86]) == 0 && arg3.CheckDepthStencilMatch(arg2, arg4, local15.Format, anIntArray605[local37], anIntArray604[local86]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg2, arg4, anIntArray604[local37], true, local5) == 0)) {
									local3 = anIntArray605[local37];
									local1 = anIntArray604[local86];
									break label78;
								}
							}
						}
					}
				}
				arg0--;
			}
			if (arg0 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg1.MultiSampleType = local5;
			arg1.MultiSampleQuality = 0;
			arg1.AutoDepthStencilFormat = local1;
			arg1.BackBufferFormat = local3;
			return true;
		} catch (@Pc(176) Throwable local176) {
			return false;
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!si;B)I")
	public static int method7658(@OriginalArg(0) Class322 arg0) {
		if (Static320.aClass322_5 == arg0) {
			return 2;
		} else if (arg0 == Static131.aClass322_3) {
			return 4;
		} else if (arg0 == Static296.aClass322_4) {
			return 26;
		} else if (Static116.aClass322_2 == arg0) {
			return 7;
		} else if (arg0 == Static30.aClass322_1) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!cw;B)I")
	public static int method7660(@OriginalArg(0) Class59 arg0) {
		if (arg0 == Static70.aClass59_5) {
			return 2;
		} else if (Static403.aClass59_9 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BLclient!daa;)I")
	public static int method7663(@OriginalArg(1) Class60 arg0) {
		if (Static550.aClass60_5 == arg0) {
			return 2;
		} else if (arg0 == Static252.aClass60_2) {
			return 3;
		} else if (Static285.aClass60_4 == arg0) {
			return 1;
		} else if (arg0 == Static122.aClass60_1) {
			return 4;
		} else if (arg0 == Static648.aClass60_6) {
			return 6;
		} else if (Static265.aClass60_3 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!oja;I)I")
	public static int method7665(@OriginalArg(0) Class257 arg0) {
		if (arg0 == Static130.aClass257_3) {
			return 1;
		} else if (arg0 == Static87.aClass257_2) {
			return 2;
		} else if (arg0 == Static336.aClass257_5) {
			return 3;
		} else if (arg0 == Static17.aClass257_1) {
			return 4;
		} else if (Static280.aClass257_4 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}
}
