import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.mk;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!ta", name = "Kg", descriptor = "[I")
	public static final int[] anIntArray700 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!ta", name = "Qg", descriptor = "[I")
	public static final int[] anIntArray701 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!ta", name = "bh", descriptor = "[F")
	public static final float[] aFloatArray80 = new float[16];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!tda;I)I")
	public static int method8090(@OriginalArg(0) Class334 arg0) {
		if (Static159.aClass334_8 == arg0) {
			return 2;
		} else if (arg0 == Static361.aClass334_7) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!ef;)I")
	public static int method8091(@OriginalArg(1) Class87 arg0) {
		if (arg0 == Static461.aClass87_5) {
			return 2;
		} else if (Static575.aClass87_7 == arg0) {
			return 4;
		} else if (Static129.aClass87_4 == arg0) {
			return 26;
		} else if (Static15.aClass87_1 == arg0) {
			return 7;
		} else if (arg0 == Static543.aClass87_6) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!cfa;)I")
	public static int method8092(@OriginalArg(1) Class54 arg0) {
		if (arg0 == Static41.aClass54_1) {
			return 2;
		} else if (Static360.aClass54_5 == arg0) {
			return 3;
		} else if (arg0 == Static238.aClass54_2) {
			return 1;
		} else if (Static620.aClass54_6 == arg0) {
			return 4;
		} else if (Static337.aClass54_4 == arg0) {
			return 6;
		} else if (Static305.aClass54_3 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!vea;Lclient!bja;)I")
	public static int method8093(@OriginalArg(1) Class363 arg0, @OriginalArg(2) Class36 arg1) {
		if (Static47.aClass36_5 == arg1) {
			if (Static532.aClass363_13 == arg0) {
				return 22;
			}
			if (arg0 == Static238.aClass363_4) {
				return 21;
			}
			if (arg0 == Static202.aClass363_3) {
				return 28;
			}
			if (arg0 == Static487.aClass363_14) {
				return 50;
			}
			if (arg0 == Static649.aClass363_17) {
				return 51;
			}
			if (Static195.aClass363_2 == arg0) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILclient!jagdx/IDirect3D;Lclient!jagdx/D3DPRESENT_PARAMETERS;BI)Z")
	public static boolean method8095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) IDirect3D arg2, @OriginalArg(3) D3DPRESENT_PARAMETERS arg3, @OriginalArg(5) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = new D3DDISPLAYMODE();
			if (mk.a(arg2.a(arg0, local14), 95)) {
				return false;
			}
			label80: while (arg1 >= 0) {
				if (arg1 != 1) {
					local5 = arg1;
					for (@Pc(35) int local35 = 0; local35 < anIntArray701.length; local35++) {
						if (arg2.CheckDeviceType(arg0, arg4, local14.Format, anIntArray701[local35], true) == 0 && arg2.CheckDeviceFormat(arg0, arg4, local14.Format, 1, 1, anIntArray701[local35]) == 0 && (arg1 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg4, anIntArray701[local35], true, local5) == 0)) {
							for (@Pc(91) int local91 = 0; local91 < anIntArray700.length; local91++) {
								if (arg2.CheckDeviceFormat(arg0, arg4, local14.Format, 2, 1, anIntArray700[local91]) == 0 && arg2.CheckDepthStencilMatch(arg0, arg4, local14.Format, anIntArray701[local35], anIntArray700[local91]) == 0 && (arg1 == 0 || arg2.CheckDeviceMultiSampleType(arg0, arg4, anIntArray700[local35], true, local5) == 0)) {
									local1 = anIntArray700[local91];
									local3 = anIntArray701[local35];
									break label80;
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
			arg3.MultiSampleQuality = 0;
			arg3.MultiSampleType = local5;
			arg3.AutoDepthStencilFormat = local1;
			arg3.BackBufferFormat = local3;
			return true;
		} catch (@Pc(187) Throwable local187) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!de;B)I")
	public static int method8096(@OriginalArg(0) Class70 arg0) {
		if (arg0 == Static112.aClass70_1) {
			return 1;
		} else if (Static658.aClass70_6 == arg0) {
			return 2;
		} else if (Static639.aClass70_5 == arg0) {
			return 3;
		} else if (Static615.aClass70_4 == arg0) {
			return 4;
		} else if (Static142.aClass70_2 == arg0) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ip;Z)I")
	public static int method8101(@OriginalArg(0) Class169 arg0) {
		if (arg0 == Static201.aClass169_3) {
			return 2;
		} else if (arg0 == Static370.aClass169_8) {
			return 0;
		} else if (arg0 == Static567.aClass169_7) {
			return 1;
		} else if (Static490.aClass169_6 == arg0) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
