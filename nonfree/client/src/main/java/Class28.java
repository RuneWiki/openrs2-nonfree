import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class28 {

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "[I")
	public static final int[] anIntArray83 = new int[256];

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Z")
	public boolean aBoolean46;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "J")
	private long aLong44;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(9) int local9 = local6;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray83[local6] = local9;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
	public void method716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static6.anIntArray16[arg0];
		if (0 != this.anIntArray81[local7] && Static2.method57(arg1) != null) {
			this.anIntArray81[local7] = Integer.MIN_VALUE | arg1;
			this.method720();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BILclient!wb;)Lclient!ug;")
	public Class7_Sub7 method717(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub25 arg1) {
		if (this.anInt1021 != -1) {
			return Static170.method2500(this.anInt1021).method2448(arg0, arg1);
		}
		@Pc(30) Class7_Sub7 local30 = (Class7_Sub7) Static214.aClass79_12.method2352(this.aLong44);
		if (local30 == null) {
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < 12; local36++) {
				@Pc(43) int local43 = this.anIntArray81[local36];
				if ((local43 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local43) != 0 && !Static2.method57(local43 & 0x3FFFFFFF).method905()) {
						local34 = true;
					}
				} else if (!Static52.method774(local43 & 0x3FFFFFFF).method3192(this.aBoolean46)) {
					local34 = true;
				}
			}
			if (local34) {
				return null;
			}
			@Pc(92) Class7_Sub3[] local92 = new Class7_Sub3[12];
			@Pc(94) int local94 = 0;
			for (@Pc(96) int local96 = 0; local96 < 12; local96++) {
				@Pc(103) int local103 = this.anIntArray81[local96];
				@Pc(120) Class7_Sub3 local120;
				if ((local103 & 0x40000000) != 0) {
					local120 = Static52.method774(local103 & 0x3FFFFFFF).method3191(this.aBoolean46);
					if (local120 != null) {
						local92[local94++] = local120;
					}
				} else if ((Integer.MIN_VALUE & local103) != 0) {
					local120 = Static2.method57(local103 & 0x3FFFFFFF).method898();
					if (local120 != null) {
						local92[local94++] = local120;
					}
				}
			}
			@Pc(161) Class7_Sub3 local161 = new Class7_Sub3(local92, local94);
			for (@Pc(163) int local163 = 0; local163 < 5; local163++) {
				if (Static140.aShortArrayArray3[local163].length > this.anIntArray82[local163]) {
					local161.method974(Static136.aShortArray160[local163], Static140.aShortArrayArray3[local163][this.anIntArray82[local163]]);
				}
				if (this.anIntArray82[local163] < Static151.aShortArrayArray4[local163].length) {
					local161.method974(Static163.aShortArray118[local163], Static151.aShortArrayArray4[local163][this.anIntArray82[local163]]);
				}
			}
			local30 = local161.method979(64, 768, -50, -10, -50);
			Static214.aClass79_12.method2349(this.aLong44, local30);
		}
		if (arg1 != null) {
			local30 = arg1.method3057(local30, arg0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILclient!wb;Lclient!wb;)Lclient!ug;")
	public Class7_Sub7 method718(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub25 arg2, @OriginalArg(4) Class2_Sub1_Sub25 arg3) {
		if (this.anInt1021 != -1) {
			return Static170.method2500(this.anInt1021).method2445(arg1, arg2, arg0, arg3);
		}
		@Pc(24) int[] local24 = this.anIntArray81;
		@Pc(27) long local27 = this.aLong44;
		if (arg2 != null && (arg2.anInt4364 >= 0 || arg2.anInt4366 >= 0)) {
			local24 = new int[12];
			for (@Pc(46) int local46 = 0; local46 < 12; local46++) {
				local24[local46] = this.anIntArray81[local46];
			}
			if (arg2.anInt4364 >= 0) {
				if (arg2.anInt4364 == 65535) {
					local27 ^= 0xFFFFFFFF00000000L;
					local24[5] = 0;
				} else {
					local24[5] = arg2.anInt4364 | 0x40000000;
					local27 ^= (long) local24[5] << 32;
				}
			}
			if (arg2.anInt4366 >= 0) {
				if (arg2.anInt4366 == 65535) {
					local27 ^= 0xFFFFFFFFL;
					local24[3] = 0;
				} else {
					local24[3] = arg2.anInt4366 | 0x40000000;
					local27 ^= local24[3];
				}
			}
		}
		@Pc(137) Class7_Sub7 local137 = (Class7_Sub7) Static32.aClass79_2.method2352(local27);
		if (local137 == null) {
			@Pc(141) boolean local141 = false;
			for (@Pc(143) int local143 = 0; local143 < 12; local143++) {
				@Pc(149) int local149 = local24[local143];
				if ((local149 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local149) != 0 && !Static2.method57(local149 & 0x3FFFFFFF).method897()) {
						local141 = true;
					}
				} else if (!Static52.method774(local149 & 0x3FFFFFFF).method3197(this.aBoolean46)) {
					local141 = true;
				}
			}
			if (local141) {
				if (this.aLong43 != -1L) {
					local137 = (Class7_Sub7) Static32.aClass79_2.method2352(this.aLong43);
				}
				if (local137 == null) {
					return null;
				}
			}
			if (local137 == null) {
				@Pc(212) int local212 = 0;
				@Pc(215) Class7_Sub3[] local215 = new Class7_Sub3[12];
				for (@Pc(217) int local217 = 0; local217 < 12; local217++) {
					@Pc(223) int local223 = local24[local217];
					@Pc(242) Class7_Sub3 local242;
					if ((local223 & 0x40000000) != 0) {
						local242 = Static52.method774(local223 & 0x3FFFFFFF).method3203(this.aBoolean46);
						if (local242 != null) {
							local215[local212++] = local242;
						}
					} else if ((local223 & Integer.MIN_VALUE) != 0) {
						local242 = Static2.method57(local223 & 0x3FFFFFFF).method904();
						if (local242 != null) {
							local215[local212++] = local242;
						}
					}
				}
				@Pc(278) Class7_Sub3 local278 = new Class7_Sub3(local215, local212);
				for (@Pc(280) int local280 = 0; local280 < 5; local280++) {
					if (this.anIntArray82[local280] < Static140.aShortArrayArray3[local280].length) {
						local278.method974(Static136.aShortArray160[local280], Static140.aShortArrayArray3[local280][this.anIntArray82[local280]]);
					}
					if (this.anIntArray82[local280] < Static151.aShortArrayArray4[local280].length) {
						local278.method974(Static163.aShortArray118[local280], Static151.aShortArrayArray4[local280][this.anIntArray82[local280]]);
					}
				}
				local137 = local278.method979(64, 850, -30, -50, -30);
				Static32.aClass79_2.method2349(local27, local137);
				this.aLong43 = local27;
			}
		}
		if (arg2 == null && arg3 == null) {
			return local137;
		}
		@Pc(372) Class7_Sub7 local372;
		if (arg2 != null && arg3 != null) {
			local372 = arg2.method3050(arg0, local137, arg3, arg1);
		} else if (arg2 == null) {
			local372 = arg3.method3048(local137, arg1);
		} else {
			local372 = arg2.method3048(local137, arg0);
		}
		return local372;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)I")
	public int method719() {
		return this.anInt1021 == -1 ? (this.anIntArray81[11] << 5) + (this.anIntArray81[0] << 15) + (this.anIntArray82[0] << 25) + (this.anIntArray82[4] << 20) + (this.anIntArray81[8] << 10) + this.anIntArray81[1] : Static170.method2500(this.anInt1021).anInt3565 + 305419896;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	private void method720() {
		@Pc(7) long[] local7 = Class20.aLongArray11;
		@Pc(10) long local10 = this.aLong44;
		this.aLong44 = -1L;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			this.aLong44 = this.aLong44 >>> 8 ^ local7[(int) ((this.aLong44 ^ (long) (this.anIntArray81[local20] >> 24)) & 0xFFL)];
			this.aLong44 = this.aLong44 >>> 8 ^ local7[(int) (((long) (this.anIntArray81[local20] >> 16) ^ this.aLong44) & 0xFFL)];
			this.aLong44 = local7[(int) (((long) (this.anIntArray81[local20] >> 8) ^ this.aLong44) & 0xFFL)] ^ this.aLong44 >>> 8;
			this.aLong44 = local7[(int) ((this.aLong44 ^ (long) this.anIntArray81[local20]) & 0xFFL)] ^ this.aLong44 >>> 8;
		}
		for (@Pc(114) int local114 = 0; local114 < 5; local114++) {
			this.aLong44 = this.aLong44 >>> 8 ^ local7[(int) (((long) this.anIntArray82[local114] ^ this.aLong44) & 0xFFL)];
		}
		this.aLong44 = this.aLong44 >>> 8 ^ local7[(int) (((long) (this.aBoolean46 ? 1 : 0) ^ this.aLong44) & 0xFFL)];
		if (local10 != 0L && this.aLong44 != local10) {
			Static32.aClass79_2.method2348(local10);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([IZ[IIB)V")
	public void method721(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static182.anInt3825; local12++) {
					@Pc(18) Class2_Sub1_Sub9 local18 = Static2.method57(local12);
					if (local18 != null && !local18.aBoolean57 && local8 + (arg1 ? 7 : 0) == local18.anInt1362) {
						arg2[Static6.anIntArray16[local8]] = Integer.MIN_VALUE | local12;
						break;
					}
				}
			}
		}
		this.anIntArray81 = arg2;
		this.anIntArray82 = arg0;
		this.anInt1021 = arg3;
		this.aBoolean46 = arg1;
		this.method720();
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V")
	public void method724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray82[arg0] = arg1;
		this.method720();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)V")
	public void method725(@OriginalArg(1) boolean arg0) {
		this.aBoolean46 = arg0;
		this.method720();
	}
}
