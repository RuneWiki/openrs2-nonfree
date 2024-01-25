import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.gh;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!er", name = "Tg", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16];

	@OriginalMember(owner = "client!er", name = "Jg", descriptor = "[I")
	private static final int[] anIntArray127 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!er", name = "Wg", descriptor = "[I")
	public static final int[] anIntArray128 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!ega;)I")
	public static int method2528(@OriginalArg(1) Class93 arg0) {
		if (Static94.aClass93_2 == arg0) {
			return 2;
		} else if (arg0 == Static89.aClass93_1) {
			return 0;
		} else if (arg0 == Static237.aClass93_3) {
			return 1;
		} else if (arg0 == Static520.aClass93_4) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIILclient!jagdx/IDirect3D;Lclient!jagdx/D3DPRESENT_PARAMETERS;I)Z")
	public static boolean method2530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) IDirect3D arg2, @OriginalArg(4) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		try {
			@Pc(19) D3DDISPLAYMODE local19 = new D3DDISPLAYMODE();
			if (gh.a((byte) 110, arg2.a(arg1, local19))) {
				return false;
			}
			label80: while (arg4 >= 0) {
				if (arg4 != 1) {
					local15 = arg4;
					for (@Pc(48) int local48 = 0; local48 < anIntArray127.length; local48++) {
						if (arg2.CheckDeviceType(arg1, arg0, local19.Format, anIntArray127[local48], true) == 0 && arg2.CheckDeviceFormat(arg1, arg0, local19.Format, 1, 1, anIntArray127[local48]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg0, anIntArray127[local48], true, local15) == 0)) {
							for (@Pc(113) int local113 = 0; local113 < anIntArray128.length; local113++) {
								if (arg2.CheckDeviceFormat(arg1, arg0, local19.Format, 2, 1, anIntArray128[local113]) == 0 && arg2.CheckDepthStencilMatch(arg1, arg0, local19.Format, anIntArray127[local48], anIntArray128[local113]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg0, anIntArray128[local48], true, local15) == 0)) {
									local13 = anIntArray127[local48];
									local11 = anIntArray128[local113];
									break label80;
								}
							}
						}
					}
				}
				arg4--;
			}
			if (arg4 < 0 || local13 == 0 || local11 == 0) {
				return false;
			}
			arg3.MultiSampleQuality = 0;
			arg3.MultiSampleType = local15;
			arg3.AutoDepthStencilFormat = local11;
			arg3.BackBufferFormat = local13;
			return true;
		} catch (@Pc(218) Throwable local218) {
			return false;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!ak;)I")
	public static int method2531(@OriginalArg(1) Class16 arg0) {
		if (Static231.aClass16_18 == arg0) {
			return 1;
		} else if (Static475.aClass16_46 == arg0) {
			return 2;
		} else if (Static141.aClass16_11 == arg0) {
			return 3;
		} else if (arg0 == Static527.aClass16_39) {
			return 4;
		} else if (Static507.aClass16_47 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!se;)I")
	public static int method2532(@OriginalArg(1) Class328 arg0) {
		if (Static464.aClass328_10 == arg0) {
			return 2;
		} else if (Static78.aClass328_4 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!eh;)I")
	public static int method2534(@OriginalArg(1) Class94 arg0) {
		if (Static164.aClass94_1 == arg0) {
			return 2;
		} else if (arg0 == Static653.aClass94_5) {
			return 4;
		} else if (Static280.aClass94_2 == arg0) {
			return 26;
		} else if (Static618.aClass94_4 == arg0) {
			return 7;
		} else if (Static461.aClass94_3 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!jj;Z)I")
	public static int method2535(@OriginalArg(0) Class187 arg0) {
		if (Static664.aClass187_7 == arg0) {
			return 2;
		} else if (arg0 == Static262.aClass187_3) {
			return 3;
		} else if (arg0 == Static673.aClass187_8) {
			return 1;
		} else if (Static649.aClass187_6 == arg0) {
			return 4;
		} else if (arg0 == Static37.aClass187_5) {
			return 6;
		} else if (Static582.aClass187_4 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(ILclient!dn;Lclient!ua;)I")
	public static int method2539(@OriginalArg(1) Class86 arg0, @OriginalArg(2) Class358 arg1) {
		if (Static104.aClass86_8 == arg0) {
			if (Static221.aClass358_8 == arg1) {
				return 22;
			}
			if (arg1 == Static171.aClass358_12) {
				return 21;
			}
			if (arg1 == Static624.aClass358_16) {
				return 28;
			}
			if (Static338.aClass358_13 == arg1) {
				return 50;
			}
			if (Static266.aClass358_10 == arg1) {
				return 51;
			}
			if (arg1 == Static205.aClass358_7) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}
}
