import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.aha;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!us", name = "Mg", descriptor = "[I")
	private static final int[] anIntArray663 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!us", name = "Ng", descriptor = "[F")
	public static final float[] aFloatArray75 = new float[16];

	@OriginalMember(owner = "client!us", name = "ch", descriptor = "[I")
	public static final int[] anIntArray665 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIBLclient!jagdx/D3DPRESENT_PARAMETERS;Lclient!jagdx/IDirect3D;I)Z")
	public static boolean method8293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) D3DPRESENT_PARAMETERS arg2, @OriginalArg(4) IDirect3D arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(9) D3DDISPLAYMODE local9 = new D3DDISPLAYMODE();
			if (aha.b(-1, arg3.a(arg0, local9))) {
				return false;
			}
			label86: while (arg1 >= 0) {
				if (arg1 != 1) {
					local5 = arg1;
					for (@Pc(34) int local34 = 0; local34 < anIntArray663.length; local34++) {
						if (arg3.CheckDeviceType(arg0, arg4, local9.Format, anIntArray663[local34], true) == 0 && arg3.CheckDeviceFormat(arg0, arg4, local9.Format, 1, 1, anIntArray663[local34]) == 0 && (arg1 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg4, anIntArray663[local34], true, local5) == 0)) {
							for (@Pc(92) int local92 = 0; local92 < anIntArray665.length; local92++) {
								if (arg3.CheckDeviceFormat(arg0, arg4, local9.Format, 2, 1, anIntArray665[local92]) == 0 && arg3.CheckDepthStencilMatch(arg0, arg4, local9.Format, anIntArray663[local34], anIntArray665[local92]) == 0 && (arg1 == 0 || arg3.CheckDeviceMultiSampleType(arg0, arg4, anIntArray665[local34], true, local5) == 0)) {
									local3 = anIntArray663[local34];
									local1 = anIntArray665[local92];
									break label86;
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
			arg2.AutoDepthStencilFormat = local1;
			arg2.MultiSampleQuality = 0;
			arg2.MultiSampleType = local5;
			arg2.BackBufferFormat = local3;
			return true;
		} catch (@Pc(190) Throwable local190) {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!pe;Lclient!dw;I)I")
	public static int method8295(@OriginalArg(0) Class276 arg0, @OriginalArg(1) Class79 arg1) {
		if (Static111.aClass79_7 == arg1) {
			if (arg0 == Static133.aClass276_7) {
				return 22;
			}
			if (arg0 == Static220.aClass276_11) {
				return 21;
			}
			if (arg0 == Static360.aClass276_15) {
				return 28;
			}
			if (Static46.aClass276_4 == arg0) {
				return 50;
			}
			if (arg0 == Static592.aClass276_18) {
				return 51;
			}
			if (Static537.aClass276_17 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!mga;Z)I")
	public static int method8298(@OriginalArg(0) Class230 arg0) {
		if (arg0 == Static41.aClass230_1) {
			return 2;
		} else if (arg0 == Static621.aClass230_4) {
			return 0;
		} else if (Static238.aClass230_3 == arg0) {
			return 1;
		} else if (Static228.aClass230_2 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!si;I)I")
	public static int method8299(@OriginalArg(0) Class331 arg0) {
		if (arg0 == Static473.aClass331_5) {
			return 1;
		} else if (arg0 == Static100.aClass331_1) {
			return 2;
		} else if (arg0 == Static255.aClass331_2) {
			return 3;
		} else if (Static388.aClass331_3 == arg0) {
			return 4;
		} else if (arg0 == Static607.aClass331_6) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!ei;I)I")
	public static int method8301(@OriginalArg(0) Class91 arg0) {
		if (Static489.aClass91_4 == arg0) {
			return 2;
		} else if (Static435.aClass91_3 == arg0) {
			return 4;
		} else if (arg0 == Static586.aClass91_5) {
			return 26;
		} else if (arg0 == Static228.aClass91_2) {
			return 7;
		} else if (Static214.aClass91_1 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!ko;)I")
	public static int method8302(@OriginalArg(1) Class198 arg0) {
		if (Static156.aClass198_4 == arg0) {
			return 2;
		} else if (arg0 == Static248.aClass198_7) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!kja;I)I")
	public static int method8303(@OriginalArg(0) Class194 arg0) {
		if (Static266.aClass194_5 == arg0) {
			return 2;
		} else if (arg0 == Static230.aClass194_4) {
			return 3;
		} else if (arg0 == Static473.aClass194_10) {
			return 1;
		} else if (arg0 == Static83.aClass194_13) {
			return 4;
		} else if (arg0 == Static454.aClass194_9) {
			return 6;
		} else if (Static156.aClass194_2 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
