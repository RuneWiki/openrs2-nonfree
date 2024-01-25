import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.op;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lt", name = "Tg", descriptor = "[I")
	private static final int[] anIntArray405 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!lt", name = "fh", descriptor = "[F")
	public static final float[] aFloatArray53 = new float[16];

	@OriginalMember(owner = "client!lt", name = "oh", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!qt;Z)I")
	public static int method5158(@OriginalArg(0) Class283 arg0) {
		if (arg0 == Static494.aClass283_8) {
			return 2;
		} else if (Static159.aClass283_2 == arg0) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!taa;I)I")
	public static int method5159(@OriginalArg(0) Class315 arg0) {
		if (Static516.aClass315_3 == arg0) {
			return 2;
		} else if (arg0 == Static572.aClass315_4) {
			return 0;
		} else if (Static508.aClass315_2 == arg0) {
			return 1;
		} else if (Static358.aClass315_1 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(BLclient!ti;Lclient!kca;)I")
	public static int method5160(@OriginalArg(1) Class324 arg0, @OriginalArg(2) Class187 arg1) {
		if (Static545.aClass324_12 == arg0) {
			if (arg1 == Static419.aClass187_11) {
				return 22;
			}
			if (Static524.aClass187_15 == arg1) {
				return 21;
			}
			if (Static249.aClass187_7 == arg1) {
				return 28;
			}
			if (Static232.aClass187_10 == arg1) {
				return 50;
			}
			if (arg1 == Static457.aClass187_13) {
				return 51;
			}
			if (arg1 == Static215.aClass187_4) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLclient!uf;)I")
	public static int method5162(@OriginalArg(1) Class334 arg0) {
		if (arg0 == Static64.aClass334_1) {
			return 2;
		} else if (arg0 == Static107.aClass334_2) {
			return 3;
		} else if (Static187.aClass334_3 == arg0) {
			return 1;
		} else if (arg0 == Static562.aClass334_7) {
			return 4;
		} else if (arg0 == Static334.aClass334_6) {
			return 6;
		} else if (arg0 == Static335.aClass334_5) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!jagdx/IDirect3D;IIBLclient!jagdx/D3DPRESENT_PARAMETERS;I)Z")
	public static boolean method5163(@OriginalArg(0) IDirect3D arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (op.a((byte) -47, arg0.a(arg4, local9))) {
				return false;
			}
			label83: while (arg2 >= 0) {
				if (arg2 != 1) {
					local5 = arg2;
					for (@Pc(36) int local36 = 0; local36 < anIntArray406.length; local36++) {
						if (arg0.CheckDeviceType(arg4, arg1, local9.Format, anIntArray406[local36], true) == 0 && arg0.CheckDeviceFormat(arg4, arg1, local9.Format, 1, 1, anIntArray406[local36]) == 0 && (arg2 == 0 || arg0.CheckDeviceMultiSampleType(arg4, arg1, anIntArray406[local36], true, local5) == 0)) {
							for (@Pc(86) int local86 = 0; local86 < anIntArray405.length; local86++) {
								if (arg0.CheckDeviceFormat(arg4, arg1, local9.Format, 2, 1, anIntArray405[local86]) == 0 && arg0.CheckDepthStencilMatch(arg4, arg1, local9.Format, anIntArray406[local36], anIntArray405[local86]) == 0 && (arg2 == 0 || arg0.CheckDeviceMultiSampleType(arg4, arg1, anIntArray405[local36], true, local5) == 0)) {
									local1 = anIntArray405[local86];
									local3 = anIntArray406[local36];
									break label83;
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
			arg3.AutoDepthStencilFormat = local1;
			arg3.BackBufferFormat = local3;
			arg3.MultiSampleType = local5;
			arg3.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(201) Throwable local201) {
			return false;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(Lclient!fga;I)I")
	public static int method5165(@OriginalArg(0) Class108 arg0) {
		if (Static11.aClass108_4 == arg0) {
			return 1;
		} else if (arg0 == Static542.aClass108_23) {
			return 2;
		} else if (Static552.aClass108_24 == arg0) {
			return 3;
		} else if (Static446.aClass108_21 == arg0) {
			return 4;
		} else if (Static376.aClass108_19 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLclient!rr;)I")
	public static int method5166(@OriginalArg(1) Class300 arg0) {
		if (Static148.aClass300_3 == arg0) {
			return 2;
		} else if (arg0 == Static40.aClass300_1) {
			return 4;
		} else if (arg0 == Static215.aClass300_4) {
			return 26;
		} else if (Static591.aClass300_5 == arg0) {
			return 7;
		} else if (arg0 == Static52.aClass300_6) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
