import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.qr;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gaa", name = "xg", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16];

	@OriginalMember(owner = "client!gaa", name = "Dg", descriptor = "[I")
	public static final int[] anIntArray192 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!gaa", name = "Sg", descriptor = "[I")
	public static final int[] anIntArray194 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!mv;)I")
	public static int method2846(@OriginalArg(1) Class227 arg0) {
		if (Static85.aClass227_1 == arg0) {
			return 2;
		} else if (Static118.aClass227_2 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLclient!gb;)I")
	public static int method2848(@OriginalArg(1) Class119 arg0) {
		if (arg0 == Static325.aClass119_44) {
			return 2;
		} else if (arg0 == Static113.aClass119_11) {
			return 0;
		} else if (Static48.aClass119_5 == arg0) {
			return 1;
		} else if (arg0 == Static224.aClass119_18) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!lt;B)I")
	public static int method2850(@OriginalArg(0) Class213 arg0) {
		if (arg0 == Static380.aClass213_6) {
			return 2;
		} else if (arg0 == Static275.aClass213_4) {
			return 3;
		} else if (Static511.aClass213_7 == arg0) {
			return 1;
		} else if (Static341.aClass213_5 == arg0) {
			return 4;
		} else if (Static339.aClass213_3 == arg0) {
			return 6;
		} else if (Static50.aClass213_1 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!nw;)I")
	public static int method2851(@OriginalArg(1) Class236 arg0) {
		if (arg0 == Static291.aClass236_2) {
			return 2;
		} else if (Static458.aClass236_4 == arg0) {
			return 4;
		} else if (Static583.aClass236_5 == arg0) {
			return 26;
		} else if (arg0 == Static202.aClass236_1) {
			return 7;
		} else if (arg0 == Static395.aClass236_3) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIILclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/IDirect3D;)Z")
	public static boolean method2852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) IDirect3D arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		try {
			@Pc(15) D3DDISPLAYMODE local15 = new D3DDISPLAYMODE();
			if (qr.a(true, arg4.a(arg0, local15))) {
				return false;
			}
			label77: while (arg1 >= 0) {
				if (arg1 != 1) {
					local11 = arg1;
					for (@Pc(36) int local36 = 0; local36 < anIntArray192.length; local36++) {
						if (arg4.CheckDeviceType(arg0, arg2, local15.Format, anIntArray192[local36], true) == 0 && arg4.CheckDeviceFormat(arg0, arg2, local15.Format, 1, 1, anIntArray192[local36]) == 0 && (arg1 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg2, anIntArray192[local36], true, local11) == 0)) {
							for (@Pc(85) int local85 = 0; local85 < anIntArray194.length; local85++) {
								if (arg4.CheckDeviceFormat(arg0, arg2, local15.Format, 2, 1, anIntArray194[local85]) == 0 && arg4.CheckDepthStencilMatch(arg0, arg2, local15.Format, anIntArray192[local36], anIntArray194[local85]) == 0 && (arg1 == 0 || arg4.CheckDeviceMultiSampleType(arg0, arg2, anIntArray194[local36], true, local11) == 0)) {
									local9 = anIntArray192[local36];
									local7 = anIntArray194[local85];
									break label77;
								}
							}
						}
					}
				}
				arg1--;
			}
			if (arg1 < 0 || local9 == 0 || local7 == 0) {
				return false;
			}
			arg3.AutoDepthStencilFormat = local7;
			arg3.BackBufferFormat = local9;
			arg3.MultiSampleType = local11;
			arg3.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(183) Throwable local183) {
			return false;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!ec;Lclient!bt;Z)I")
	public static int method2855(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class42 arg1) {
		if (arg1 == Static47.aClass42_4) {
			if (arg0 == Static530.aClass88_15) {
				return 22;
			}
			if (arg0 == Static356.aClass88_11) {
				return 21;
			}
			if (arg0 == Static104.aClass88_3) {
				return 28;
			}
			if (Static242.aClass88_10 == arg0) {
				return 50;
			}
			if (Static5.aClass88_1 == arg0) {
				return 51;
			}
			if (arg0 == Static103.aClass88_2) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(ILclient!ki;)I")
	public static int method2856(@OriginalArg(1) Class190 arg0) {
		if (arg0 == Static426.aClass190_6) {
			return 1;
		} else if (Static21.aClass190_1 == arg0) {
			return 2;
		} else if (Static356.aClass190_5 == arg0) {
			return 3;
		} else if (Static65.aClass190_2 == arg0) {
			return 4;
		} else if (arg0 == Static329.aClass190_4) {
			return 256;
		} else {
			return 0;
		}
	}
}
