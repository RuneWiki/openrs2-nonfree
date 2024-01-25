import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.pda;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!uda", name = "Sg", descriptor = "[I")
	private static final int[] anIntArray533 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!uda", name = "Vg", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[16];

	@OriginalMember(owner = "client!uda", name = "Xg", descriptor = "[I")
	private static final int[] anIntArray534 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!jagdx/IDirect3D;IILclient!jagdx/D3DPRESENT_PARAMETERS;ZI)Z")
	public static boolean method8212(@OriginalArg(0) IDirect3D arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		try {
			@Pc(13) D3DDISPLAYMODE local13 = new D3DDISPLAYMODE();
			if (pda.b(0, arg0.a(arg1, local13))) {
				return false;
			}
			label78: while (arg4 >= 0) {
				if (arg4 != 1) {
					local9 = arg4;
					for (@Pc(39) int local39 = 0; local39 < anIntArray534.length; local39++) {
						if (arg0.CheckDeviceType(arg1, arg2, local13.Format, anIntArray534[local39], true) == 0 && arg0.CheckDeviceFormat(arg1, arg2, local13.Format, 1, 1, anIntArray534[local39]) == 0 && (arg4 == 0 || arg0.CheckDeviceMultiSampleType(arg1, arg2, anIntArray534[local39], true, local9) == 0)) {
							for (@Pc(86) int local86 = 0; local86 < anIntArray533.length; local86++) {
								if (arg0.CheckDeviceFormat(arg1, arg2, local13.Format, 2, 1, anIntArray533[local86]) == 0 && arg0.CheckDepthStencilMatch(arg1, arg2, local13.Format, anIntArray534[local39], anIntArray533[local86]) == 0 && (arg4 == 0 || arg0.CheckDeviceMultiSampleType(arg1, arg2, anIntArray533[local39], true, local9) == 0)) {
									local7 = anIntArray534[local39];
									local1 = anIntArray533[local86];
									break label78;
								}
							}
						}
					}
				}
				arg4--;
			}
			if (arg4 < 0 || local7 == 0 || local1 == 0) {
				return false;
			}
			arg3.AutoDepthStencilFormat = local1;
			arg3.MultiSampleQuality = 0;
			arg3.MultiSampleType = local9;
			arg3.BackBufferFormat = local7;
			return true;
		} catch (@Pc(177) Throwable local177) {
			return false;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!fga;I)I")
	public static int method8214(@OriginalArg(0) Class115 arg0) {
		if (Static285.aClass115_3 == arg0) {
			return 2;
		} else if (arg0 == Static506.aClass115_4) {
			return 3;
		} else if (arg0 == Static532.aClass115_5) {
			return 1;
		} else if (arg0 == Static649.aClass115_6) {
			return 4;
		} else if (arg0 == Static163.aClass115_2) {
			return 6;
		} else if (Static160.aClass115_1 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!wj;BLclient!g;)I")
	public static int method8215(@OriginalArg(0) Class389 arg0, @OriginalArg(2) Class122 arg1) {
		if (arg0 == Static666.aClass389_16) {
			if (arg1 == Static147.aClass122_6) {
				return 22;
			}
			if (Static21.aClass122_14 == arg1) {
				return 21;
			}
			if (Static111.aClass122_5 == arg1) {
				return 28;
			}
			if (arg1 == Static618.aClass122_19) {
				return 50;
			}
			if (Static511.aClass122_15 == arg1) {
				return 51;
			}
			if (Static80.aClass122_4 == arg1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!fea;I)I")
	public static int method8216(@OriginalArg(0) Class112 arg0) {
		if (Static134.aClass112_9 == arg0) {
			return 2;
		} else if (Static617.aClass112_28 == arg0) {
			return 4;
		} else if (Static315.aClass112_22 == arg0) {
			return 26;
		} else if (arg0 == Static461.aClass112_52) {
			return 7;
		} else if (arg0 == Static214.aClass112_46) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!vba;B)I")
	public static int method8218(@OriginalArg(0) Class366 arg0) {
		if (Static218.aClass366_4 == arg0) {
			return 1;
		} else if (arg0 == Static345.aClass366_6) {
			return 2;
		} else if (Static210.aClass366_3 == arg0) {
			return 3;
		} else if (Static256.aClass366_5 == arg0) {
			return 4;
		} else if (arg0 == Static123.aClass366_2) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!ag;Z)I")
	public static int method8219(@OriginalArg(0) Class8 arg0) {
		if (Static608.aClass8_11 == arg0) {
			return 2;
		} else if (Static241.aClass8_5 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!mq;I)I")
	public static int method8220(@OriginalArg(0) Class235 arg0) {
		if (Static665.aClass235_4 == arg0) {
			return 2;
		} else if (Static189.aClass235_1 == arg0) {
			return 0;
		} else if (Static383.aClass235_2 == arg0) {
			return 1;
		} else if (Static576.aClass235_3 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
