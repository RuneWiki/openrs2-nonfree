import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.raa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!mh", name = "Ug", descriptor = "[I")
	public static final int[] anIntArray485 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!mh", name = "bh", descriptor = "[F")
	public static final float[] aFloatArray43 = new float[16];

	@OriginalMember(owner = "client!mh", name = "gh", descriptor = "[I")
	private static final int[] anIntArray486 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!jagdx/D3DPRESENT_PARAMETERS;ILclient!jagdx/IDirect3D;I)Z")
	public static boolean method5576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) D3DPRESENT_PARAMETERS arg2, @OriginalArg(4) IDirect3D arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (raa.a(arg3.a(arg4, local9), (int) -115)) {
				return false;
			}
			label80: while (arg0 >= 0) {
				if (arg0 != 1) {
					local5 = arg0;
					for (@Pc(35) int local35 = 0; local35 < anIntArray485.length; local35++) {
						if (arg3.CheckDeviceType(arg4, arg1, local9.Format, anIntArray485[local35], true) == 0 && arg3.CheckDeviceFormat(arg4, arg1, local9.Format, 1, 1, anIntArray485[local35]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg1, anIntArray485[local35], true, local5) == 0)) {
							for (@Pc(84) int local84 = 0; local84 < anIntArray486.length; local84++) {
								if (arg3.CheckDeviceFormat(arg4, arg1, local9.Format, 2, 1, anIntArray486[local84]) == 0 && arg3.CheckDepthStencilMatch(arg4, arg1, local9.Format, anIntArray485[local35], anIntArray486[local84]) == 0 && (arg0 == 0 || arg3.CheckDeviceMultiSampleType(arg4, arg1, anIntArray486[local35], true, local5) == 0)) {
									local1 = anIntArray486[local84];
									local3 = anIntArray485[local35];
									break label80;
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
			arg2.AutoDepthStencilFormat = local1;
			arg2.BackBufferFormat = local3;
			arg2.MultiSampleQuality = 0;
			arg2.MultiSampleType = local5;
			return true;
		} catch (@Pc(177) Throwable local177) {
			return false;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!cga;)I")
	public static int method5577(@OriginalArg(1) Class52 arg0) {
		if (arg0 == Static367.aClass52_4) {
			return 1;
		} else if (Static242.aClass52_2 == arg0) {
			return 2;
		} else if (arg0 == Static530.aClass52_5) {
			return 3;
		} else if (Static64.aClass52_1 == arg0) {
			return 4;
		} else if (arg0 == Static253.aClass52_3) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!ns;Lclient!qda;)I")
	public static int method5578(@OriginalArg(1) Class247 arg0, @OriginalArg(2) Class281 arg1) {
		if (Static385.aClass247_14 == arg0) {
			if (arg1 == Static507.aClass281_21) {
				return 22;
			}
			if (Static208.aClass281_10 == arg1) {
				return 21;
			}
			if (Static225.aClass281_13 == arg1) {
				return 28;
			}
			if (Static274.aClass281_22 == arg1) {
				return 50;
			}
			if (Static191.aClass281_9 == arg1) {
				return 51;
			}
			if (arg1 == Static582.aClass281_20) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!kha;I)I")
	public static int method5580(@OriginalArg(0) Class189 arg0) {
		if (arg0 == Static276.aClass189_15) {
			return 2;
		} else if (Static86.aClass189_6 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!qt;I)I")
	public static int method5584(@OriginalArg(0) Class294 arg0) {
		if (arg0 == Static256.aClass294_4) {
			return 2;
		} else if (arg0 == Static18.aClass294_1) {
			return 0;
		} else if (arg0 == Static131.aClass294_2) {
			return 1;
		} else if (Static645.aClass294_5 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!aw;B)I")
	public static int method5585(@OriginalArg(0) Class23 arg0) {
		if (Static179.aClass23_5 == arg0) {
			return 2;
		} else if (Static360.aClass23_6 == arg0) {
			return 3;
		} else if (arg0 == Static124.aClass23_8) {
			return 1;
		} else if (arg0 == Static370.aClass23_7) {
			return 4;
		} else if (Static28.aClass23_1 == arg0) {
			return 6;
		} else if (Static99.aClass23_2 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!aea;)I")
	public static int method5586(@OriginalArg(1) Class10 arg0) {
		if (Static247.aClass10_4 == arg0) {
			return 2;
		} else if (arg0 == Static101.aClass10_2) {
			return 4;
		} else if (Static646.aClass10_5 == arg0) {
			return 26;
		} else if (arg0 == Static140.aClass10_3) {
			return 7;
		} else if (Static81.aClass10_1 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
