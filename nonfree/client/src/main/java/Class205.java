import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class205 {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "[I")
	public int[] anIntArray484;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "[I")
	public int[] anIntArray485;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "[Lclient!mf;")
	public Class155[] aClass155Array2;

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "[I")
	public int[] anIntArray486;

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "[I")
	public int[] anIntArray487;

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "[I")
	public int[] anIntArray488;

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!qq", name = "C", descriptor = "[Lclient!dl;")
	public Class55[] aClass55Array1;

	@OriginalMember(owner = "client!qq", name = "D", descriptor = "[I")
	public int[] anIntArray489;

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!qq", name = "I", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!qq", name = "M", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "[I")
	public int[] anIntArray490;

	@OriginalMember(owner = "client!qq", name = "P", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!qq", name = "T", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!qq", name = "U", descriptor = "[I")
	public int[] anIntArray491;

	@OriginalMember(owner = "client!qq", name = "V", descriptor = "[I")
	public int[] anIntArray492;

	@OriginalMember(owner = "client!qq", name = "X", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!qq", name = "ab", descriptor = "[Lclient!qe;")
	public Class199[] aClass199Array2;

	@OriginalMember(owner = "client!qq", name = "cb", descriptor = "[I")
	public int[] anIntArray493;

	@OriginalMember(owner = "client!qq", name = "db", descriptor = "[I")
	public int[] anIntArray494;

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "I")
	public int anInt5609 = 0;

	@OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
	public int anInt5608 = 0;

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
	public int anInt5607 = 0;

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
	public int anInt5610 = 0;

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "B")
	public byte aByte73 = 0;

	@OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
	public int anInt5616 = 12;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "([B)V")
	public Class205(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4440(arg0);
		} else {
			this.method4448(arg0);
		}
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(III)V")
	public Class205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray74 = new byte[arg1];
		this.anIntArray484 = new int[arg1];
		this.anIntArray492 = new int[arg0];
		this.aShortArray65 = new short[arg1];
		this.aShortArray60 = new short[arg1];
		this.aShortArray68 = new short[arg1];
		this.anIntArray493 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray71 = new byte[arg2];
			this.anIntArray486 = new int[arg2];
			this.aByteArray69 = new byte[arg2];
			this.anIntArray490 = new int[arg2];
			this.anIntArray491 = new int[arg2];
			this.anIntArray485 = new int[arg2];
			this.aByteArray70 = new byte[arg2];
			this.aShortArray63 = new short[arg2];
			this.anIntArray488 = new int[arg2];
			this.anIntArray487 = new int[arg2];
			this.aShortArray69 = new short[arg2];
			this.aShortArray64 = new short[arg2];
		}
		this.anIntArray489 = new int[arg0];
		this.aShortArray67 = new short[arg1];
		this.aByteArray72 = new byte[arg1];
		this.aByteArray73 = new byte[arg1];
		this.aShortArray61 = new short[arg1];
		this.anIntArray494 = new int[arg0];
		this.aByteArray75 = new byte[arg1];
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "([Lclient!qq;I)V")
	public Class205(@OriginalArg(0) Class205[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5609 = 0;
		this.anInt5610 = 0;
		this.anInt5608 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte73 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class205 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5609 += local59.anInt5609;
				this.anInt5610 += local59.anInt5610;
				this.anInt5608 += local59.anInt5608;
				if (local59.aClass199Array2 != null) {
					local34 += local59.aClass199Array2.length;
				}
				if (local59.aClass55Array1 != null) {
					local36 += local59.aClass55Array1.length;
				}
				local38 |= local59.aByteArray73 != null;
				if (local59.aClass155Array2 != null) {
					local32 += local59.aClass155Array2.length;
				}
				if (local59.aByteArray75 == null) {
					if (this.aByte73 == -1) {
						this.aByte73 = local59.aByte73;
					}
					if (local59.aByte73 != this.aByte73) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray65 != null;
				local44 |= local59.aByteArray72 != null;
				local51 |= local59.anIntArray484 != null;
				local42 |= local59.aByteArray74 != null;
			}
		}
		if (local46) {
			this.aShortArray65 = new short[this.anInt5608];
		}
		if (local36 > 0) {
			this.aClass55Array1 = new Class55[local36];
		}
		this.anIntArray494 = new int[this.anInt5609];
		if (local38) {
			this.aByteArray73 = new byte[this.anInt5608];
		}
		if (local40) {
			this.aByteArray75 = new byte[this.anInt5608];
		}
		this.anIntArray492 = new int[this.anInt5609];
		if (local42) {
			this.aByteArray74 = new byte[this.anInt5608];
		}
		this.aShortArray67 = new short[this.anInt5608];
		if (local44) {
			this.aByteArray72 = new byte[this.anInt5608];
		}
		this.aShortArray61 = new short[this.anInt5608];
		if (local32 > 0) {
			this.aClass155Array2 = new Class155[local32];
		}
		if (local51) {
			this.anIntArray484 = new int[this.anInt5608];
		}
		this.aShortArray62 = new short[this.anInt5609];
		this.aShortArray60 = new short[this.anInt5608];
		this.aShortArray66 = new short[this.anInt5608];
		this.anIntArray493 = new int[this.anInt5609];
		if (local34 > 0) {
			this.aClass199Array2 = new Class199[local34];
		}
		this.aShortArray68 = new short[this.anInt5608];
		this.anIntArray489 = new int[this.anInt5609];
		if (this.anInt5610 > 0) {
			this.anIntArray488 = new int[this.anInt5610];
			this.aShortArray64 = new short[this.anInt5610];
			this.aShortArray69 = new short[this.anInt5610];
			this.aByteArray71 = new byte[this.anInt5610];
			this.anIntArray490 = new int[this.anInt5610];
			this.aByteArray69 = new byte[this.anInt5610];
			this.aByteArray70 = new byte[this.anInt5610];
			this.aShortArray63 = new short[this.anInt5610];
			this.anIntArray485 = new int[this.anInt5610];
			this.anIntArray486 = new int[this.anInt5610];
			this.anIntArray491 = new int[this.anInt5610];
			this.anIntArray487 = new int[this.anInt5610];
		}
		local32 = 0;
		local36 = 0;
		this.anInt5608 = 0;
		local34 = 0;
		this.anInt5609 = 0;
		this.anInt5610 = 0;
		@Pc(610) int local610;
		@Pc(621) int local621;
		for (@Pc(378) int local378 = 0; local378 < arg1; local378++) {
			@Pc(385) short local385 = (short) (0x1 << local378);
			@Pc(389) Class205 local389 = arg0[local378];
			if (local389 != null) {
				@Pc(396) int local396;
				if (local389.aClass55Array1 != null) {
					for (local396 = 0; local396 < local389.aClass55Array1.length; local396++) {
						@Pc(403) Class55 local403 = local389.aClass55Array1[local396];
						this.aClass55Array1[local36++] = local403.method1137(local403.anInt1462 + this.anInt5608);
					}
				}
				for (local396 = 0; local396 < local389.anInt5608; local396++) {
					if (local38 && local389.aByteArray73 != null) {
						this.aByteArray73[this.anInt5608] = local389.aByteArray73[local396];
					}
					if (local40) {
						if (local389.aByteArray75 == null) {
							this.aByteArray75[this.anInt5608] = local389.aByte73;
						} else {
							this.aByteArray75[this.anInt5608] = local389.aByteArray75[local396];
						}
					}
					if (local42 && local389.aByteArray74 != null) {
						this.aByteArray74[this.anInt5608] = local389.aByteArray74[local396];
					}
					if (local46) {
						if (local389.aShortArray65 == null) {
							this.aShortArray65[this.anInt5608] = -1;
						} else {
							this.aShortArray65[this.anInt5608] = local389.aShortArray65[local396];
						}
					}
					if (local51) {
						if (local389.anIntArray484 == null) {
							this.anIntArray484[this.anInt5608] = -1;
						} else {
							this.anIntArray484[this.anInt5608] = local389.anIntArray484[local396];
						}
					}
					this.aShortArray67[this.anInt5608] = (short) this.method4447(local385, local389.aShortArray67[local396], local389);
					this.aShortArray60[this.anInt5608] = (short) this.method4447(local385, local389.aShortArray60[local396], local389);
					this.aShortArray61[this.anInt5608] = (short) this.method4447(local385, local389.aShortArray61[local396], local389);
					this.aShortArray66[this.anInt5608] = local385;
					this.aShortArray68[this.anInt5608] = local389.aShortArray68[local396];
					this.anInt5608++;
				}
				@Pc(597) int local597;
				if (local389.aClass155Array2 != null) {
					for (local597 = 0; local597 < local389.aClass155Array2.length; local597++) {
						local610 = this.method4447(local385, local389.aClass155Array2[local597].anInt3981, local389);
						local621 = this.method4447(local385, local389.aClass155Array2[local597].anInt3982, local389);
						@Pc(632) int local632 = this.method4447(local385, local389.aClass155Array2[local597].anInt3983, local389);
						this.aClass155Array2[local32] = local389.aClass155Array2[local597].method3146(local621, local632, local610);
						local32++;
					}
				}
				if (local389.aClass199Array2 != null) {
					for (local597 = 0; local597 < local389.aClass199Array2.length; local597++) {
						local610 = this.method4447(local385, local389.aClass199Array2[local597].anInt5505, local389);
						this.aClass199Array2[local34] = local389.aClass199Array2[local597].method4354(local610);
						local34++;
					}
				}
			}
		}
		@Pc(702) int local702 = 0;
		this.anInt5607 = this.anInt5609;
		for (@Pc(708) int local708 = 0; local708 < arg1; local708++) {
			@Pc(715) short local715 = (short) (0x1 << local708);
			@Pc(719) Class205 local719 = arg0[local708];
			if (local719 != null) {
				for (local610 = 0; local610 < local719.anInt5608; local610++) {
					if (local44) {
						this.aByteArray72[local702++] = (byte) (local719.aByteArray72 == null || local719.aByteArray72[local610] == -1 ? -1 : local719.aByteArray72[local610] + this.anInt5610);
					}
				}
				for (local621 = 0; local621 < local719.anInt5610; local621++) {
					@Pc(775) byte local775 = this.aByteArray70[this.anInt5610] = local719.aByteArray70[local621];
					if (local775 == 0) {
						this.aShortArray64[this.anInt5610] = (short) this.method4447(local715, local719.aShortArray64[local621], local719);
						this.aShortArray69[this.anInt5610] = (short) this.method4447(local715, local719.aShortArray69[local621], local719);
						this.aShortArray63[this.anInt5610] = (short) this.method4447(local715, local719.aShortArray63[local621], local719);
					}
					if (local775 >= 1 && local775 <= 3) {
						this.aShortArray64[this.anInt5610] = local719.aShortArray64[local621];
						this.aShortArray69[this.anInt5610] = local719.aShortArray69[local621];
						this.aShortArray63[this.anInt5610] = local719.aShortArray63[local621];
						this.anIntArray485[this.anInt5610] = local719.anIntArray485[local621];
						this.anIntArray486[this.anInt5610] = local719.anIntArray486[local621];
						this.anIntArray488[this.anInt5610] = local719.anIntArray488[local621];
						this.aByteArray71[this.anInt5610] = local719.aByteArray71[local621];
						this.aByteArray69[this.anInt5610] = local719.aByteArray69[local621];
						this.anIntArray487[this.anInt5610] = local719.anIntArray487[local621];
					}
					if (local775 == 2) {
						this.anIntArray490[this.anInt5610] = local719.anIntArray490[local621];
						this.anIntArray491[this.anInt5610] = local719.anIntArray491[local621];
					}
					this.anInt5610++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)[[I")
	public int[][] method4438() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass55Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass55Array1[local12].anInt1461;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local10 < local20) {
					local10 = local20;
				}
			}
		}
		@Pc(64) int[][] local64 = new int[local10 + 1][];
		for (@Pc(66) int local66 = 0; local66 <= local10; local66++) {
			local64[local66] = new int[local8[local66]];
			local8[local66] = 0;
		}
		for (@Pc(89) int local89 = 0; local89 < this.aClass55Array1.length; local89++) {
			@Pc(97) int local97 = this.aClass55Array1[local89].anInt1461;
			if (local97 >= 0) {
				local64[local97][local8[local97]++] = local89;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BSIBBIISI)I")
	public int method4439(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) short arg6, @OriginalArg(8) int arg7) {
		this.aShortArray67[this.anInt5608] = (short) arg4;
		this.aShortArray60[this.anInt5608] = (short) arg5;
		this.aShortArray61[this.anInt5608] = (short) arg7;
		this.aByteArray73[this.anInt5608] = arg0;
		this.aByteArray72[this.anInt5608] = arg3;
		this.aShortArray68[this.anInt5608] = arg1;
		this.aByteArray74[this.anInt5608] = arg2;
		this.aShortArray65[this.anInt5608] = arg6;
		return this.anInt5608++;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([BI)V")
	private void method4440(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub13 local10 = new Class2_Sub13(arg0);
		@Pc(15) Class2_Sub13 local15 = new Class2_Sub13(arg0);
		@Pc(20) Class2_Sub13 local20 = new Class2_Sub13(arg0);
		@Pc(25) Class2_Sub13 local25 = new Class2_Sub13(arg0);
		@Pc(30) Class2_Sub13 local30 = new Class2_Sub13(arg0);
		@Pc(35) Class2_Sub13 local35 = new Class2_Sub13(arg0);
		@Pc(40) Class2_Sub13 local40 = new Class2_Sub13(arg0);
		local10.anInt4347 = arg0.length - 23;
		this.anInt5609 = local10.method3555();
		this.anInt5608 = local10.method3555();
		this.anInt5610 = local10.method3580();
		@Pc(65) int local65 = local10.method3580();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt4347 -= 7;
			this.anInt5616 = local10.method3580();
			local10.anInt4347 += 6;
		}
		@Pc(128) int local128 = local10.method3580();
		@Pc(132) int local132 = local10.method3580();
		@Pc(136) int local136 = local10.method3580();
		@Pc(140) int local140 = local10.method3580();
		@Pc(144) int local144 = local10.method3580();
		@Pc(148) int local148 = local10.method3555();
		@Pc(152) int local152 = local10.method3555();
		@Pc(156) int local156 = local10.method3555();
		@Pc(160) int local160 = local10.method3555();
		@Pc(164) int local164 = local10.method3555();
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(186) int local186;
		if (this.anInt5610 > 0) {
			local10.anInt4347 = 0;
			this.aByteArray70 = new byte[this.anInt5610];
			for (local186 = 0; local186 < this.anInt5610; local186++) {
				@Pc(197) byte local197 = this.aByteArray70[local186] = local10.method3605();
				if (local197 == 2) {
					local170++;
				}
				if (local197 >= 1 && local197 <= 3) {
					local168++;
				}
				if (local197 == 0) {
					local166++;
				}
			}
		}
		local186 = this.anInt5610;
		@Pc(229) int local229 = local186;
		local186 += this.anInt5609;
		@Pc(236) int local236 = local186;
		if (local76) {
			local186 += this.anInt5608;
		}
		@Pc(245) int local245 = local186;
		local186 += this.anInt5608;
		@Pc(252) int local252 = local186;
		if (local128 == 255) {
			local186 += this.anInt5608;
		}
		@Pc(268) int local268 = local186;
		if (local136 == 1) {
			local186 += this.anInt5608;
		}
		@Pc(280) int local280 = local186;
		if (local144 == 1) {
			local186 += this.anInt5609;
		}
		@Pc(290) int local290 = local186;
		if (local132 == 1) {
			local186 += this.anInt5608;
		}
		@Pc(302) int local302 = local186;
		local186 += local160;
		@Pc(308) int local308 = local186;
		if (local140 == 1) {
			local186 += this.anInt5608 * 2;
		}
		@Pc(320) int local320 = local186;
		local186 += local164;
		@Pc(326) int local326 = local186;
		local186 += this.anInt5608 * 2;
		@Pc(335) int local335 = local186;
		local186 += local148;
		@Pc(341) int local341 = local186;
		local186 += local152;
		@Pc(347) int local347 = local186;
		local186 += local156;
		@Pc(353) int local353 = local186;
		local186 += local166 * 6;
		@Pc(361) int local361 = local186;
		local186 += local168 * 6;
		@Pc(377) int local377 = this.anInt5616 >= 14 ? 7 : 6;
		@Pc(379) int local379 = local186;
		local186 += local168 * local377;
		@Pc(387) int local387 = local186;
		local186 += local168;
		@Pc(393) int local393 = local186;
		local186 += local168;
		@Pc(399) int local399 = local186;
		local186 += local170 * 2 + local168;
		if (local140 == 1 && this.anInt5610 > 0) {
			this.aByteArray72 = new byte[this.anInt5608];
		}
		if (local128 == 255) {
			this.aByteArray75 = new byte[this.anInt5608];
		} else {
			this.aByte73 = (byte) local128;
		}
		if (local144 == 1) {
			this.anIntArray493 = new int[this.anInt5609];
		}
		if (this.anInt5610 > 0) {
			if (local168 > 0) {
				this.anIntArray488 = new int[local168];
				this.anIntArray487 = new int[local168];
				this.aByteArray71 = new byte[local168];
				this.anIntArray486 = new int[local168];
				this.anIntArray485 = new int[local168];
				this.aByteArray69 = new byte[local168];
			}
			if (local170 > 0) {
				this.anIntArray490 = new int[local170];
				this.anIntArray491 = new int[local170];
			}
			this.aShortArray63 = new short[this.anInt5610];
			this.aShortArray69 = new short[this.anInt5610];
			this.aShortArray64 = new short[this.anInt5610];
		}
		this.anIntArray494 = new int[this.anInt5609];
		if (local140 == 1) {
			this.aShortArray65 = new short[this.anInt5608];
		}
		this.aShortArray68 = new short[this.anInt5608];
		this.aShortArray67 = new short[this.anInt5608];
		local10.anInt4347 = local229;
		if (local132 == 1) {
			this.aByteArray74 = new byte[this.anInt5608];
		}
		if (local136 == 1) {
			this.anIntArray484 = new int[this.anInt5608];
		}
		this.aShortArray61 = new short[this.anInt5608];
		if (local76) {
			this.aByteArray73 = new byte[this.anInt5608];
		}
		this.anIntArray489 = new int[this.anInt5609];
		this.anIntArray492 = new int[this.anInt5609];
		this.aShortArray60 = new short[this.anInt5608];
		local15.anInt4347 = local335;
		local20.anInt4347 = local341;
		local25.anInt4347 = local347;
		local30.anInt4347 = local280;
		@Pc(593) int local593 = 0;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(605) int local605;
		for (@Pc(599) int local599 = 0; local599 < this.anInt5609; local599++) {
			local605 = local10.method3580();
			@Pc(607) int local607 = 0;
			if ((local605 & 0x1) != 0) {
				local607 = local15.method3581();
			}
			@Pc(617) int local617 = 0;
			if ((local605 & 0x2) != 0) {
				local617 = local20.method3581();
			}
			@Pc(627) int local627 = 0;
			if ((local605 & 0x4) != 0) {
				local627 = local25.method3581();
			}
			this.anIntArray494[local599] = local607 + local593;
			this.anIntArray489[local599] = local617 + local595;
			this.anIntArray492[local599] = local627 + local597;
			local597 = this.anIntArray492[local599];
			local593 = this.anIntArray494[local599];
			local595 = this.anIntArray489[local599];
			if (local144 == 1) {
				this.anIntArray493[local599] = local30.method3580();
			}
		}
		local10.anInt4347 = local326;
		local15.anInt4347 = local236;
		local20.anInt4347 = local252;
		local25.anInt4347 = local290;
		local30.anInt4347 = local268;
		local35.anInt4347 = local308;
		local40.anInt4347 = local320;
		for (local605 = 0; local605 < this.anInt5608; local605++) {
			this.aShortArray68[local605] = (short) local10.method3555();
			if (local76) {
				this.aByteArray73[local605] = local15.method3605();
			}
			if (local128 == 255) {
				this.aByteArray75[local605] = local20.method3605();
			}
			if (local132 == 1) {
				this.aByteArray74[local605] = local25.method3605();
			}
			if (local136 == 1) {
				this.anIntArray484[local605] = local30.method3580();
			}
			if (local140 == 1) {
				this.aShortArray65[local605] = (short) (local35.method3555() - 1);
			}
			if (this.aByteArray72 != null) {
				if (this.aShortArray65[local605] == -1) {
					this.aByteArray72[local605] = -1;
				} else {
					this.aByteArray72[local605] = (byte) (local40.method3580() - 1);
				}
			}
		}
		local10.anInt4347 = local302;
		this.anInt5607 = -1;
		local15.anInt4347 = local245;
		@Pc(817) short local817 = 0;
		@Pc(819) short local819 = 0;
		@Pc(821) short local821 = 0;
		@Pc(823) short local823 = 0;
		@Pc(831) int local831;
		for (@Pc(825) int local825 = 0; local825 < this.anInt5608; local825++) {
			local831 = local15.method3580();
			if (local831 == 1) {
				local817 = (short) (local823 + local10.method3581());
				local819 = (short) (local10.method3581() + local817);
				local821 = (short) (local10.method3581() + local819);
				local823 = local821;
				this.aShortArray67[local825] = local817;
				this.aShortArray60[local825] = local819;
				this.aShortArray61[local825] = local821;
				if (this.anInt5607 < local817) {
					this.anInt5607 = local817;
				}
				if (local819 > this.anInt5607) {
					this.anInt5607 = local819;
				}
				if (local821 > this.anInt5607) {
					this.anInt5607 = local821;
				}
			}
			if (local831 == 2) {
				local819 = local821;
				local821 = (short) (local10.method3581() + local823);
				this.aShortArray67[local825] = local817;
				local823 = local821;
				this.aShortArray60[local825] = local819;
				this.aShortArray61[local825] = local821;
				if (local821 > this.anInt5607) {
					this.anInt5607 = local821;
				}
			}
			if (local831 == 3) {
				local817 = local821;
				local821 = (short) (local823 + local10.method3581());
				local823 = local821;
				this.aShortArray67[local825] = local817;
				this.aShortArray60[local825] = local819;
				this.aShortArray61[local825] = local821;
				if (local821 > this.anInt5607) {
					this.anInt5607 = local821;
				}
			}
			if (local831 == 4) {
				@Pc(988) short local988 = local817;
				local817 = local819;
				local821 = (short) (local823 + local10.method3581());
				local819 = local988;
				local823 = local821;
				this.aShortArray67[local825] = local817;
				this.aShortArray60[local825] = local988;
				this.aShortArray61[local825] = local821;
				if (local821 > this.anInt5607) {
					this.anInt5607 = local821;
				}
			}
		}
		local10.anInt4347 = local353;
		this.anInt5607++;
		local15.anInt4347 = local361;
		local20.anInt4347 = local379;
		local25.anInt4347 = local387;
		local30.anInt4347 = local393;
		local35.anInt4347 = local399;
		@Pc(1067) int local1067;
		for (local831 = 0; local831 < this.anInt5610; local831++) {
			local1067 = this.aByteArray70[local831] & 0xFF;
			if (local1067 == 0) {
				this.aShortArray64[local831] = (short) local10.method3555();
				this.aShortArray69[local831] = (short) local10.method3555();
				this.aShortArray63[local831] = (short) local10.method3555();
			}
			if (local1067 == 1) {
				this.aShortArray64[local831] = (short) local15.method3555();
				this.aShortArray69[local831] = (short) local15.method3555();
				this.aShortArray63[local831] = (short) local15.method3555();
				this.anIntArray485[local831] = local20.method3555();
				if (this.anInt5616 >= 14) {
					this.anIntArray486[local831] = local20.method3563();
				} else {
					this.anIntArray486[local831] = local20.method3555();
				}
				this.anIntArray488[local831] = local20.method3555();
				this.aByteArray71[local831] = local25.method3605();
				this.aByteArray69[local831] = local30.method3605();
				this.anIntArray487[local831] = local35.method3605();
			}
			if (local1067 == 2) {
				this.aShortArray64[local831] = (short) local15.method3555();
				this.aShortArray69[local831] = (short) local15.method3555();
				this.aShortArray63[local831] = (short) local15.method3555();
				this.anIntArray485[local831] = local20.method3555();
				if (this.anInt5616 < 14) {
					this.anIntArray486[local831] = local20.method3555();
				} else {
					this.anIntArray486[local831] = local20.method3563();
				}
				this.anIntArray488[local831] = local20.method3555();
				this.aByteArray71[local831] = local25.method3605();
				this.aByteArray69[local831] = local30.method3605();
				this.anIntArray487[local831] = local35.method3605();
				this.anIntArray490[local831] = local35.method3605();
				this.anIntArray491[local831] = local35.method3605();
			}
			if (local1067 == 3) {
				this.aShortArray64[local831] = (short) local15.method3555();
				this.aShortArray69[local831] = (short) local15.method3555();
				this.aShortArray63[local831] = (short) local15.method3555();
				this.anIntArray485[local831] = local20.method3555();
				if (this.anInt5616 >= 14) {
					this.anIntArray486[local831] = local20.method3563();
				} else {
					this.anIntArray486[local831] = local20.method3555();
				}
				this.anIntArray488[local831] = local20.method3555();
				this.aByteArray71[local831] = local25.method3605();
				this.aByteArray69[local831] = local30.method3605();
				this.anIntArray487[local831] = local35.method3605();
			}
		}
		local10.anInt4347 = local186;
		@Pc(1386) int local1386;
		@Pc(1392) int local1392;
		@Pc(1396) int local1396;
		@Pc(1459) int local1459;
		if (local85) {
			local1067 = local10.method3580();
			if (local1067 > 0) {
				this.aClass155Array2 = new Class155[local1067];
				for (local1386 = 0; local1386 < local1067; local1386++) {
					local1392 = local10.method3555();
					local1396 = local10.method3555();
					@Pc(1402) byte local1402;
					if (local128 == 255) {
						local1402 = this.aByteArray75[local1396];
					} else {
						local1402 = (byte) local128;
					}
					this.aClass155Array2[local1386] = new Class155(local1392, this.aShortArray67[local1396], this.aShortArray60[local1396], this.aShortArray61[local1396], local1402);
				}
			}
			local1386 = local10.method3580();
			if (local1386 > 0) {
				this.aClass199Array2 = new Class199[local1386];
				for (local1392 = 0; local1392 < local1386; local1392++) {
					local1396 = local10.method3555();
					local1459 = local10.method3555();
					this.aClass199Array2[local1392] = new Class199(local1396, local1459);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1067 = local10.method3580();
		if (local1067 <= 0) {
			return;
		}
		this.aClass55Array1 = new Class55[local1067];
		for (local1386 = 0; local1386 < local1067; local1386++) {
			local1392 = local10.method3555();
			local1396 = local10.method3555();
			local1459 = local10.method3580();
			@Pc(1508) byte local1508 = local10.method3605();
			this.aClass55Array1[local1386] = new Class55(local1392, local1396, local1459, local1508);
		}
		return;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)[[I")
	public int[][] method4441() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5608; local12++) {
			@Pc(19) int local19 = this.anIntArray484[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(43) int[][] local43 = new int[local10 + 1][];
		for (@Pc(45) int local45 = 0; local45 <= local10; local45++) {
			local43[local45] = new int[local8[local45]];
			local8[local45] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt5608; local74++) {
			@Pc(81) int local81 = this.anIntArray484[local74];
			if (local81 >= 0) {
				local43[local81][local8[local81]++] = local74;
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)[[I")
	public int[][] method4442() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5607; local12++) {
			@Pc(19) int local19 = this.anIntArray493[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(34) int local34 = local8[local19]++;
			}
		}
		@Pc(51) int[][] local51 = new int[local10 + 1][];
		for (@Pc(58) int local58 = 0; local58 <= local10; local58++) {
			local51[local58] = new int[local8[local58]];
			local8[local58] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt5607; local77++) {
			@Pc(84) int local84 = this.anIntArray493[local77];
			if (local84 >= 0) {
				local51[local84][local8[local84]++] = local77;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)V")
	public void method4443() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt5609; local13++) {
			this.anIntArray494[local13] <<= 0x0;
			this.anIntArray489[local13] <<= 0x0;
			this.anIntArray492[local13] <<= 0x0;
		}
		if (this.anInt5610 <= 0 || this.anIntArray485 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray485.length; local52++) {
			this.anIntArray485[local52] <<= 0x0;
			this.anIntArray486[local52] <<= 0x0;
			if (this.aByteArray70[local52] != 1) {
				this.anIntArray488[local52] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII)V")
	public void method4445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5609; local3++) {
			this.anIntArray494[local3] += arg0;
			this.anIntArray489[local3] += arg2;
			this.anIntArray492[local3] += arg1;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(SSZ)V")
	public void method4446(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5608; local7++) {
			if (this.aShortArray68[local7] == arg1) {
				this.aShortArray68[local7] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZSILclient!qq;)I")
	private int method4447(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class205 arg2) {
		@Pc(10) int local10 = arg2.anIntArray494[arg1];
		@Pc(15) int local15 = arg2.anIntArray489[arg1];
		@Pc(20) int local20 = arg2.anIntArray492[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5609; local22++) {
			if (this.anIntArray494[local22] == local10 && local15 == this.anIntArray489[local22] && this.anIntArray492[local22] == local20) {
				this.aShortArray62[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray494[this.anInt5609] = local10;
		this.anIntArray489[this.anInt5609] = local15;
		this.anIntArray492[this.anInt5609] = local20;
		this.aShortArray62[this.anInt5609] = arg0;
		this.anIntArray493[this.anInt5609] = arg2.anIntArray493 == null ? -1 : arg2.anIntArray493[arg1];
		return this.anInt5609++;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B[B)V")
	private void method4448(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub13 local14 = new Class2_Sub13(arg0);
		@Pc(19) Class2_Sub13 local19 = new Class2_Sub13(arg0);
		@Pc(24) Class2_Sub13 local24 = new Class2_Sub13(arg0);
		@Pc(29) Class2_Sub13 local29 = new Class2_Sub13(arg0);
		@Pc(34) Class2_Sub13 local34 = new Class2_Sub13(arg0);
		local14.anInt4347 = arg0.length - 18;
		this.anInt5609 = local14.method3555();
		this.anInt5608 = local14.method3555();
		this.anInt5610 = local14.method3580();
		@Pc(61) int local61 = local14.method3580();
		@Pc(65) int local65 = local14.method3580();
		@Pc(69) int local69 = local14.method3580();
		@Pc(73) int local73 = local14.method3580();
		@Pc(77) int local77 = local14.method3580();
		@Pc(83) int local83 = local14.method3555();
		@Pc(89) int local89 = local14.method3555();
		@Pc(95) int local95 = local14.method3555();
		@Pc(101) int local101 = local14.method3555();
		@Pc(110) int local110 = this.anInt5609;
		@Pc(112) int local112 = local110;
		local110 += this.anInt5608;
		@Pc(119) int local119 = local110;
		if (local65 == 255) {
			local110 += this.anInt5608;
		}
		@Pc(129) int local129 = local110;
		if (local73 == 1) {
			local110 += this.anInt5608;
		}
		@Pc(141) int local141 = local110;
		if (local61 == 1) {
			local110 += this.anInt5608;
		}
		@Pc(153) int local153 = local110;
		if (local77 == 1) {
			local110 += this.anInt5609;
		}
		@Pc(165) int local165 = local110;
		if (local69 == 1) {
			local110 += this.anInt5608;
		}
		@Pc(175) int local175 = local110;
		local110 += local101;
		@Pc(181) int local181 = local110;
		local110 += this.anInt5608 * 2;
		@Pc(190) int local190 = local110;
		local110 += this.anInt5610 * 6;
		@Pc(199) int local199 = local110;
		local110 += local83;
		@Pc(205) int local205 = local110;
		local110 += local89;
		local14.anInt4347 = 0;
		if (local61 == 1) {
			this.aByteArray72 = new byte[this.anInt5608];
			this.aShortArray65 = new short[this.anInt5608];
			this.aByteArray73 = new byte[this.anInt5608];
		}
		if (this.anInt5610 > 0) {
			this.aShortArray64 = new short[this.anInt5610];
			this.aShortArray69 = new short[this.anInt5610];
			this.aShortArray63 = new short[this.anInt5610];
			this.aByteArray70 = new byte[this.anInt5610];
		}
		if (local73 == 1) {
			this.anIntArray484 = new int[this.anInt5608];
		}
		this.aShortArray60 = new short[this.anInt5608];
		if (local65 == 255) {
			this.aByteArray75 = new byte[this.anInt5608];
		} else {
			this.aByte73 = (byte) local65;
		}
		this.aShortArray61 = new short[this.anInt5608];
		this.anIntArray492 = new int[this.anInt5609];
		this.aShortArray67 = new short[this.anInt5608];
		if (local69 == 1) {
			this.aByteArray74 = new byte[this.anInt5608];
		}
		if (local77 == 1) {
			this.anIntArray493 = new int[this.anInt5609];
		}
		this.anIntArray494 = new int[this.anInt5609];
		this.anIntArray489 = new int[this.anInt5609];
		this.aShortArray68 = new short[this.anInt5608];
		local19.anInt4347 = local199;
		local24.anInt4347 = local205;
		local29.anInt4347 = local110;
		local34.anInt4347 = local153;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(356) int local356 = 0;
		@Pc(364) int local364;
		@Pc(366) int local366;
		for (@Pc(358) int local358 = 0; local358 < this.anInt5609; local358++) {
			local364 = local14.method3580();
			local366 = 0;
			if ((local364 & 0x1) != 0) {
				local366 = local19.method3581();
			}
			@Pc(379) int local379 = 0;
			if ((local364 & 0x2) != 0) {
				local379 = local24.method3581();
			}
			@Pc(392) int local392 = 0;
			if ((local364 & 0x4) != 0) {
				local392 = local29.method3581();
			}
			this.anIntArray494[local358] = local366 + local352;
			this.anIntArray489[local358] = local379 + local354;
			this.anIntArray492[local358] = local392 + local356;
			local352 = this.anIntArray494[local358];
			local354 = this.anIntArray489[local358];
			local356 = this.anIntArray492[local358];
			if (local77 == 1) {
				this.anIntArray493[local358] = local34.method3580();
			}
		}
		local14.anInt4347 = local181;
		local19.anInt4347 = local141;
		local24.anInt4347 = local119;
		local29.anInt4347 = local165;
		local34.anInt4347 = local129;
		for (local364 = 0; local364 < this.anInt5608; local364++) {
			this.aShortArray68[local364] = (short) local14.method3555();
			if (local61 == 1) {
				local366 = local19.method3580();
				if ((local366 & 0x1) == 1) {
					this.aByteArray73[local364] = 1;
					local7 = true;
				} else {
					this.aByteArray73[local364] = 0;
				}
				if ((local366 & 0x2) == 2) {
					this.aByteArray72[local364] = (byte) (local366 >> 2);
					this.aShortArray65[local364] = this.aShortArray68[local364];
					this.aShortArray68[local364] = 127;
					if (this.aShortArray65[local364] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray72[local364] = -1;
					this.aShortArray65[local364] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray75[local364] = local24.method3605();
			}
			if (local69 == 1) {
				this.aByteArray74[local364] = local29.method3605();
			}
			if (local73 == 1) {
				this.anIntArray484[local364] = local34.method3580();
			}
		}
		this.anInt5607 = -1;
		local14.anInt4347 = local175;
		local19.anInt4347 = local112;
		@Pc(613) short local613 = 0;
		@Pc(615) short local615 = 0;
		@Pc(617) short local617 = 0;
		@Pc(619) short local619 = 0;
		@Pc(627) int local627;
		for (@Pc(621) int local621 = 0; local621 < this.anInt5608; local621++) {
			local627 = local19.method3580();
			if (local627 == 1) {
				local613 = (short) (local619 + local14.method3581());
				local615 = (short) (local14.method3581() + local613);
				local617 = (short) (local14.method3581() + local615);
				this.aShortArray67[local621] = local613;
				local619 = local617;
				this.aShortArray60[local621] = local615;
				this.aShortArray61[local621] = local617;
				if (this.anInt5607 < local613) {
					this.anInt5607 = local613;
				}
				if (local615 > this.anInt5607) {
					this.anInt5607 = local615;
				}
				if (this.anInt5607 < local617) {
					this.anInt5607 = local617;
				}
			}
			if (local627 == 2) {
				local615 = local617;
				local617 = (short) (local619 + local14.method3581());
				local619 = local617;
				this.aShortArray67[local621] = local613;
				this.aShortArray60[local621] = local615;
				this.aShortArray61[local621] = local617;
				if (local617 > this.anInt5607) {
					this.anInt5607 = local617;
				}
			}
			if (local627 == 3) {
				local613 = local617;
				local617 = (short) (local14.method3581() + local619);
				this.aShortArray67[local621] = local613;
				local619 = local617;
				this.aShortArray60[local621] = local615;
				this.aShortArray61[local621] = local617;
				if (this.anInt5607 < local617) {
					this.anInt5607 = local617;
				}
			}
			if (local627 == 4) {
				@Pc(782) short local782 = local613;
				local613 = local615;
				local617 = (short) (local619 + local14.method3581());
				local615 = local782;
				this.aShortArray67[local621] = local613;
				local619 = local617;
				this.aShortArray60[local621] = local782;
				this.aShortArray61[local621] = local617;
				if (this.anInt5607 < local617) {
					this.anInt5607 = local617;
				}
			}
		}
		this.anInt5607++;
		local14.anInt4347 = local190;
		for (local627 = 0; local627 < this.anInt5610; local627++) {
			this.aByteArray70[local627] = 0;
			this.aShortArray64[local627] = (short) local14.method3555();
			this.aShortArray69[local627] = (short) local14.method3555();
			this.aShortArray63[local627] = (short) local14.method3555();
		}
		if (this.aByteArray72 != null) {
			@Pc(876) boolean local876 = false;
			for (@Pc(878) int local878 = 0; local878 < this.anInt5608; local878++) {
				@Pc(887) int local887 = this.aByteArray72[local878] & 0xFF;
				if (local887 != 255) {
					if ((this.aShortArray64[local887] & 0xFFFF) == this.aShortArray67[local878] && (this.aShortArray69[local887] & 0xFFFF) == this.aShortArray60[local878] && (this.aShortArray63[local887] & 0xFFFF) == this.aShortArray61[local878]) {
						this.aByteArray72[local878] = -1;
					} else {
						local876 = true;
					}
				}
			}
			if (!local876) {
				this.aByteArray72 = null;
			}
		}
		if (!local7) {
			this.aByteArray73 = null;
		}
		if (!local9) {
			this.aShortArray65 = null;
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(IIII)I")
	public int method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(23) int local23 = 0; local23 < this.anInt5609; local23++) {
			if (arg1 == this.anIntArray494[local23] && this.anIntArray489[local23] == arg2 && this.anIntArray492[local23] == arg0) {
				return local23;
			}
		}
		this.anIntArray494[this.anInt5609] = arg1;
		this.anIntArray489[this.anInt5609] = arg2;
		this.anIntArray492[this.anInt5609] = arg0;
		this.anInt5607 = this.anInt5609 + 1;
		return this.anInt5609++;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(SIS)V")
	public void method4451(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray65 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt5608; local20++) {
			if (arg1 == this.aShortArray65[local20]) {
				this.aShortArray65[local20] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBII)V")
	public void method4452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(43) int local43;
		if (arg1 != 0) {
			local19 = Class155.anIntArray342[arg1];
			local23 = Class155.anIntArray341[arg1];
			for (local25 = 0; local25 < this.anInt5609; local25++) {
				local43 = local19 * this.anIntArray489[local25] + this.anIntArray494[local25] * local23 >> 15;
				this.anIntArray489[local25] = local23 * this.anIntArray489[local25] - local19 * this.anIntArray494[local25] >> 15;
				this.anIntArray494[local25] = local43;
			}
		}
		if (arg0 != 0) {
			local19 = Class155.anIntArray342[arg0];
			local23 = Class155.anIntArray341[arg0];
			for (local25 = 0; local25 < this.anInt5609; local25++) {
				local43 = local23 * this.anIntArray489[local25] - local19 * this.anIntArray492[local25] >> 15;
				this.anIntArray492[local25] = local19 * this.anIntArray489[local25] + local23 * this.anIntArray492[local25] >> 15;
				this.anIntArray489[local25] = local43;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local19 = Class155.anIntArray342[arg2];
		local23 = Class155.anIntArray341[arg2];
		for (local25 = 0; local25 < this.anInt5609; local25++) {
			local43 = local19 * this.anIntArray492[local25] + this.anIntArray494[local25] * local23 >> 15;
			this.anIntArray492[local25] = this.anIntArray492[local25] * local23 - local19 * this.anIntArray494[local25] >> 15;
			this.anIntArray494[local25] = local43;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(SSBSSBBBSS)B")
	public byte method4454() {
		if (this.anInt5610 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray70[this.anInt5610] = 3;
		this.aShortArray64[this.anInt5610] = 0;
		this.aShortArray69[this.anInt5610] = 32767;
		this.aShortArray63[this.anInt5610] = 0;
		this.anIntArray485[this.anInt5610] = 1024;
		this.anIntArray486[this.anInt5610] = 1024;
		this.anIntArray488[this.anInt5610] = 1024;
		this.aByteArray71[this.anInt5610] = 0;
		this.aByteArray69[this.anInt5610] = 0;
		this.anIntArray487[this.anInt5610] = 0;
		return (byte) this.anInt5610++;
	}
}
