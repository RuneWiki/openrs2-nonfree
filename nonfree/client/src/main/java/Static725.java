import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.uo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static725 {

	@OriginalMember(owner = "client!wu", name = "Bg", descriptor = "[F")
	public static final float[] aFloatArray77 = new float[16];

	@OriginalMember(owner = "client!wu", name = "Dg", descriptor = "[I")
	private static final int[] anIntArray762 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!wu", name = "Fg", descriptor = "[I")
	private static final int[] anIntArray763 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!tfa;)I")
	public static int method9855(@OriginalArg(1) Class352 arg0) {
		if (Static231.aClass352_5 == arg0) {
			return 2;
		} else if (Static150.aClass352_4 == arg0) {
			return 0;
		} else if (Static240.aClass352_6 == arg0) {
			return 1;
		} else if (arg0 == Static45.aClass352_1) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!wh;I)I")
	public static int method9857(@OriginalArg(0) Class400 arg0) {
		if (Static610.aClass400_36 == arg0) {
			return 2;
		} else if (Static517.aClass400_29 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IILclient!jagdx/D3DPRESENT_PARAMETERS;ILclient!jagdx/IDirect3D;I)Z")
	public static boolean method9860(@OriginalArg(1) int arg0, @OriginalArg(2) D3DPRESENT_PARAMETERS arg1, @OriginalArg(3) int arg2, @OriginalArg(4) IDirect3D arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (uo.a(arg3.a(arg0, local9), (byte) 116)) {
				return false;
			}
			label84: while (arg4 >= 0) {
				if (arg4 != 1) {
					local5 = arg4;
					for (@Pc(44) int local44 = 0; local44 < anIntArray763.length; local44++) {
						if (arg3.CheckDeviceType(arg0, arg2, local9.Format, anIntArray763[local44], true) == 0 && arg3.CheckDeviceFormat(arg0, arg2, local9.Format, 1, 1, anIntArray763[local44]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg2, anIntArray763[local44], true, local5) == 0)) {
							for (@Pc(102) int local102 = 0; local102 < anIntArray762.length; local102++) {
								if (arg3.CheckDeviceFormat(arg0, arg2, local9.Format, 2, 1, anIntArray762[local102]) == 0 && arg3.CheckDepthStencilMatch(arg0, arg2, local9.Format, anIntArray763[local44], anIntArray762[local102]) == 0 && (arg4 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg2, anIntArray762[local44], true, local5) == 0)) {
									local1 = anIntArray762[local102];
									local3 = anIntArray763[local44];
									break label84;
								}
							}
						}
					}
				}
				arg4--;
			}
			if (arg4 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg1.AutoDepthStencilFormat = local1;
			arg1.BackBufferFormat = local3;
			arg1.MultiSampleQuality = 0;
			arg1.MultiSampleType = local5;
			return true;
		} catch (@Pc(215) Throwable local215) {
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!ra;)I")
	public static int method9861(@OriginalArg(1) Class317 arg0) {
		if (Static708.aClass317_9 == arg0) {
			return 2;
		} else if (Static296.aClass317_5 == arg0) {
			return 3;
		} else if (Static613.aClass317_6 == arg0) {
			return 1;
		} else if (arg0 == Static601.aClass317_8) {
			return 4;
		} else if (arg0 == Static289.aClass317_4) {
			return 6;
		} else if (Static513.aClass317_7 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLclient!hb;)I")
	public static int method9862(@OriginalArg(1) Class146 arg0) {
		if (Static348.aClass146_5 == arg0) {
			return 1;
		} else if (Static145.aClass146_2 == arg0) {
			return 2;
		} else if (Static576.aClass146_9 == arg0) {
			return 3;
		} else if (arg0 == Static14.aClass146_1) {
			return 4;
		} else if (Static175.aClass146_10 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!pk;I)I")
	public static int method9863(@OriginalArg(0) Class293 arg0) {
		if (arg0 == Static162.aClass293_4) {
			return 2;
		} else if (arg0 == Static105.aClass293_3) {
			return 4;
		} else if (arg0 == Static62.aClass293_1) {
			return 26;
		} else if (arg0 == Static679.aClass293_5) {
			return 7;
		} else if (Static64.aClass293_2 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!hk;Lclient!pm;B)I")
	public static int method9866(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class295 arg1) {
		if (Static243.aClass158_10 == arg0) {
			if (arg1 == Static261.aClass295_16) {
				return 22;
			}
			if (Static165.aClass295_6 == arg1) {
				return 21;
			}
			if (Static408.aClass295_11 == arg1) {
				return 28;
			}
			if (Static341.aClass295_9 == arg1) {
				return 50;
			}
			if (Static307.aClass295_8 == arg1) {
				return 51;
			}
			if (arg1 == Static161.aClass295_5) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}
}
