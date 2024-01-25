import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class161 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "[Lclient!ou;")
	public Class185[] aClass185Array1;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "[S")
	public short[] aShortArray83;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "[I")
	public int[] anIntArray336;

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "[Lclient!wv;")
	public Class269[] aClass269Array2;

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!nd", name = "R", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "[Lclient!nk;")
	public Class165[] aClass165Array2;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public int anInt4982 = 0;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public int anInt4979 = 12;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
	public int anInt4977 = 0;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	public int anInt4975 = 0;

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "B")
	public byte aByte91 = 0;

	@OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
	public int anInt4993 = 0;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
	public Class161(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3831(arg0);
		} else {
			this.method3828(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray61 = new byte[arg1];
		this.aByteArray65 = new byte[arg1];
		this.aByteArray64 = new byte[arg1];
		this.aShortArray86 = new short[arg1];
		this.anIntArray336 = new int[arg1];
		this.aByteArray62 = new byte[arg1];
		this.anIntArray334 = new int[arg0];
		this.anIntArray333 = new int[arg0];
		this.anIntArray329 = new int[arg0];
		this.aShortArray90 = new short[arg1];
		this.aShortArray82 = new short[arg1];
		this.anIntArray337 = new int[arg0];
		this.aShortArray89 = new short[arg1];
		this.aShortArray83 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray330 = new int[arg2];
			this.anIntArray338 = new int[arg2];
			this.anIntArray331 = new int[arg2];
			this.aShortArray85 = new short[arg2];
			this.anIntArray328 = new int[arg2];
			this.anIntArray332 = new int[arg2];
			this.aShortArray84 = new short[arg2];
			this.aShortArray88 = new short[arg2];
			this.anIntArray335 = new int[arg2];
			this.aByteArray63 = new byte[arg2];
			this.aByteArray60 = new byte[arg2];
			this.aByteArray59 = new byte[arg2];
		}
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([Lclient!nd;I)V")
	public Class161(@OriginalArg(0) Class161[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4993 = 0;
		this.anInt4975 = 0;
		this.anInt4977 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte91 = -1;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class161 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt4975 += local56.anInt4975;
				this.anInt4993 += local56.anInt4993;
				this.anInt4977 += local56.anInt4977;
				if (local56.aClass185Array1 != null) {
					local34 += local56.aClass185Array1.length;
				}
				if (local56.aClass165Array2 != null) {
					local32 += local56.aClass165Array2.length;
				}
				if (local56.aClass269Array2 != null) {
					local30 += local56.aClass269Array2.length;
				}
				local36 |= local56.aByteArray65 != null;
				local44 |= local56.aShortArray89 != null;
				local42 |= local56.aByteArray64 != null;
				if (local56.aByteArray61 == null) {
					if (this.aByte91 == -1) {
						this.aByte91 = local56.aByte91;
					}
					if (local56.aByte91 != this.aByte91) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
				local40 |= local56.aByteArray62 != null;
				local46 |= local56.anIntArray336 != null;
			}
		}
		this.aShortArray81 = new short[this.anInt4975];
		this.aShortArray83 = new short[this.anInt4975];
		this.anIntArray334 = new int[this.anInt4993];
		if (local40) {
			this.aByteArray62 = new byte[this.anInt4975];
		}
		if (local30 > 0) {
			this.aClass269Array2 = new Class269[local30];
		}
		if (local46) {
			this.anIntArray336 = new int[this.anInt4975];
		}
		if (local34 > 0) {
			this.aClass185Array1 = new Class185[local34];
		}
		if (local38) {
			this.aByteArray61 = new byte[this.anInt4975];
		}
		this.aShortArray82 = new short[this.anInt4975];
		this.anIntArray329 = new int[this.anInt4993];
		if (local44) {
			this.aShortArray89 = new short[this.anInt4975];
		}
		this.anIntArray337 = new int[this.anInt4993];
		this.aShortArray87 = new short[this.anInt4993];
		this.aShortArray86 = new short[this.anInt4975];
		if (this.anInt4977 > 0) {
			this.anIntArray331 = new int[this.anInt4977];
			this.aShortArray84 = new short[this.anInt4977];
			this.anIntArray332 = new int[this.anInt4977];
			this.anIntArray338 = new int[this.anInt4977];
			this.aShortArray88 = new short[this.anInt4977];
			this.anIntArray335 = new int[this.anInt4977];
			this.aShortArray85 = new short[this.anInt4977];
			this.anIntArray328 = new int[this.anInt4977];
			this.aByteArray63 = new byte[this.anInt4977];
			this.aByteArray59 = new byte[this.anInt4977];
			this.aByteArray60 = new byte[this.anInt4977];
			this.anIntArray330 = new int[this.anInt4977];
		}
		if (local32 > 0) {
			this.aClass165Array2 = new Class165[local32];
		}
		if (local42) {
			this.aByteArray64 = new byte[this.anInt4975];
		}
		if (local36) {
			this.aByteArray65 = new byte[this.anInt4975];
		}
		this.anIntArray333 = new int[this.anInt4993];
		this.aShortArray90 = new short[this.anInt4975];
		local32 = 0;
		this.anInt4977 = 0;
		this.anInt4993 = 0;
		local30 = 0;
		this.anInt4975 = 0;
		local34 = 0;
		@Pc(592) int local592;
		@Pc(603) int local603;
		for (@Pc(367) int local367 = 0; local367 < arg1; local367++) {
			@Pc(373) short local373 = (short) (0x1 << local367);
			@Pc(377) Class161 local377 = arg0[local367];
			if (local377 != null) {
				@Pc(384) int local384;
				if (local377.aClass185Array1 != null) {
					for (local384 = 0; local384 < local377.aClass185Array1.length; local384++) {
						@Pc(390) Class185 local390 = local377.aClass185Array1[local384];
						this.aClass185Array1[local34++] = local390.method4165(local390.anInt5324 + this.anInt4975);
					}
				}
				for (local384 = 0; local384 < local377.anInt4975; local384++) {
					if (local36 && local377.aByteArray65 != null) {
						this.aByteArray65[this.anInt4975] = local377.aByteArray65[local384];
					}
					if (local38) {
						if (local377.aByteArray61 == null) {
							this.aByteArray61[this.anInt4975] = local377.aByte91;
						} else {
							this.aByteArray61[this.anInt4975] = local377.aByteArray61[local384];
						}
					}
					if (local40 && local377.aByteArray62 != null) {
						this.aByteArray62[this.anInt4975] = local377.aByteArray62[local384];
					}
					if (local44) {
						if (local377.aShortArray89 == null) {
							this.aShortArray89[this.anInt4975] = -1;
						} else {
							this.aShortArray89[this.anInt4975] = local377.aShortArray89[local384];
						}
					}
					if (local46) {
						if (local377.anIntArray336 == null) {
							this.anIntArray336[this.anInt4975] = -1;
						} else {
							this.anIntArray336[this.anInt4975] = local377.anIntArray336[local384];
						}
					}
					this.aShortArray82[this.anInt4975] = (short) this.method3834(local377.aShortArray82[local384], local373, local377);
					this.aShortArray90[this.anInt4975] = (short) this.method3834(local377.aShortArray90[local384], local373, local377);
					this.aShortArray83[this.anInt4975] = (short) this.method3834(local377.aShortArray83[local384], local373, local377);
					this.aShortArray81[this.anInt4975] = local373;
					this.aShortArray86[this.anInt4975] = local377.aShortArray86[local384];
					this.anInt4975++;
				}
				@Pc(580) int local580;
				if (local377.aClass269Array2 != null) {
					for (local580 = 0; local580 < local377.aClass269Array2.length; local580++) {
						local592 = this.method3834(local377.aClass269Array2[local580].anInt7675, local373, local377);
						local603 = this.method3834(local377.aClass269Array2[local580].anInt7671, local373, local377);
						@Pc(614) int local614 = this.method3834(local377.aClass269Array2[local580].anInt7670, local373, local377);
						this.aClass269Array2[local30] = local377.aClass269Array2[local580].method5990(local592, local603, local614);
						local30++;
					}
				}
				if (local377.aClass165Array2 != null) {
					for (local580 = 0; local580 < local377.aClass165Array2.length; local580++) {
						local592 = this.method3834(local377.aClass165Array2[local580].anInt5052, local373, local377);
						this.aClass165Array2[local32] = local377.aClass165Array2[local580].method3871(local592);
						local32++;
					}
				}
			}
		}
		@Pc(683) int local683 = 0;
		this.anInt4982 = this.anInt4993;
		for (@Pc(689) int local689 = 0; local689 < arg1; local689++) {
			@Pc(695) short local695 = (short) (0x1 << local689);
			@Pc(699) Class161 local699 = arg0[local689];
			if (local699 != null) {
				for (local592 = 0; local592 < local699.anInt4975; local592++) {
					if (local42) {
						this.aByteArray64[local683++] = (byte) (local699.aByteArray64 == null || local699.aByteArray64[local592] == -1 ? -1 : this.anInt4977 + local699.aByteArray64[local592]);
					}
				}
				for (local603 = 0; local603 < local699.anInt4977; local603++) {
					@Pc(754) byte local754 = this.aByteArray60[this.anInt4977] = local699.aByteArray60[local603];
					if (local754 == 0) {
						this.aShortArray85[this.anInt4977] = (short) this.method3834(local699.aShortArray85[local603], local695, local699);
						this.aShortArray88[this.anInt4977] = (short) this.method3834(local699.aShortArray88[local603], local695, local699);
						this.aShortArray84[this.anInt4977] = (short) this.method3834(local699.aShortArray84[local603], local695, local699);
					}
					if (local754 >= 1 && local754 <= 3) {
						this.aShortArray85[this.anInt4977] = local699.aShortArray85[local603];
						this.aShortArray88[this.anInt4977] = local699.aShortArray88[local603];
						this.aShortArray84[this.anInt4977] = local699.aShortArray84[local603];
						this.anIntArray330[this.anInt4977] = local699.anIntArray330[local603];
						this.anIntArray335[this.anInt4977] = local699.anIntArray335[local603];
						this.anIntArray332[this.anInt4977] = local699.anIntArray332[local603];
						this.aByteArray59[this.anInt4977] = local699.aByteArray59[local603];
						this.aByteArray63[this.anInt4977] = local699.aByteArray63[local603];
						this.anIntArray331[this.anInt4977] = local699.anIntArray331[local603];
					}
					if (local754 == 2) {
						this.anIntArray338[this.anInt4977] = local699.anIntArray338[local603];
						this.anIntArray328[this.anInt4977] = local699.anIntArray328[local603];
					}
					this.anInt4977++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BSS)V")
	public void method3819(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray89 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt4975; local18++) {
			if (this.aShortArray89[local18] == arg1) {
				this.aShortArray89[local18] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)V")
	public void method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local8 = Class3_Sub2_Sub17.anIntArray289[arg2];
			local12 = Class3_Sub2_Sub17.anIntArray290[arg2];
			for (local14 = 0; local14 < this.anInt4993; local14++) {
				local31 = this.anIntArray329[local14] * local8 + local12 * this.anIntArray334[local14] >> 15;
				this.anIntArray329[local14] = local12 * this.anIntArray329[local14] - local8 * this.anIntArray334[local14] >> 15;
				this.anIntArray334[local14] = local31;
			}
		}
		if (arg0 != 0) {
			local8 = Class3_Sub2_Sub17.anIntArray289[arg0];
			local12 = Class3_Sub2_Sub17.anIntArray290[arg0];
			for (local14 = 0; local14 < this.anInt4993; local14++) {
				local31 = this.anIntArray329[local14] * local12 - this.anIntArray337[local14] * local8 >> 15;
				this.anIntArray337[local14] = this.anIntArray329[local14] * local8 + this.anIntArray337[local14] * local12 >> 15;
				this.anIntArray329[local14] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local8 = Class3_Sub2_Sub17.anIntArray289[arg1];
		local12 = Class3_Sub2_Sub17.anIntArray290[arg1];
		for (local14 = 0; local14 < this.anInt4993; local14++) {
			local31 = local8 * this.anIntArray337[local14] + local12 * this.anIntArray334[local14] >> 15;
			this.anIntArray337[local14] = this.anIntArray337[local14] * local12 - this.anIntArray334[local14] * local8 >> 15;
			this.anIntArray334[local14] = local31;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBSBIISIB)I")
	public int method3821(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray82[this.anInt4975] = (short) arg4;
		this.aShortArray90[this.anInt4975] = (short) arg6;
		this.aShortArray83[this.anInt4975] = (short) arg0;
		this.aByteArray65[this.anInt4975] = arg3;
		this.aByteArray64[this.anInt4975] = arg7;
		this.aShortArray86[this.anInt4975] = arg2;
		this.aByteArray62[this.anInt4975] = arg1;
		this.aShortArray89[this.anInt4975] = arg5;
		return this.anInt4975++;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)[[I")
	public int[][] method3823() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4975; local12++) {
			@Pc(19) int local19 = this.anIntArray336[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt4975; local73++) {
			@Pc(80) int local80 = this.anIntArray336[local73];
			if (local80 >= 0) {
				local52[local80][local8[local80]++] = local73;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)[[I")
	public int[][] method3824() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4982; local12++) {
			@Pc(19) int local19 = this.anIntArray333[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(51) int[][] local51 = new int[local10 + 1][];
		for (@Pc(53) int local53 = 0; local53 <= local10; local53++) {
			local51[local53] = new int[local8[local53]];
			local8[local53] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt4982; local72++) {
			@Pc(79) int local79 = this.anIntArray333[local72];
			if (local79 >= 0) {
				local51[local79][local8[local79]++] = local72;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)[[I")
	public int[][] method3825() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass185Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass185Array1[local12].anInt5326;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local10 < local20) {
					local10 = local20;
				}
			}
		}
		@Pc(49) int[][] local49 = new int[local10 + 1][];
		for (@Pc(51) int local51 = 0; local51 <= local10; local51++) {
			local49[local51] = new int[local8[local51]];
			local8[local51] = 0;
		}
		for (@Pc(70) int local70 = 0; local70 < this.aClass185Array1.length; local70++) {
			@Pc(78) int local78 = this.aClass185Array1[local70].anInt5326;
			if (local78 >= 0) {
				local49[local78][local8[local78]++] = local70;
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(SSB)V")
	public void method3826(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4975; local11++) {
			if (arg0 == this.aShortArray86[local11]) {
				this.aShortArray86[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIII)I")
	public int method3827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt4993; local5++) {
			if (arg0 == this.anIntArray334[local5] && this.anIntArray329[local5] == arg1 && this.anIntArray337[local5] == arg2) {
				return local5;
			}
		}
		this.anIntArray334[this.anInt4993] = arg0;
		this.anIntArray329[this.anInt4993] = arg1;
		this.anIntArray337[this.anInt4993] = arg2;
		this.anInt4982 = this.anInt4993 + 1;
		return this.anInt4993++;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([BI)V")
	private void method3828(@OriginalArg(0) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class3_Sub7 local12 = new Class3_Sub7(arg0);
		@Pc(17) Class3_Sub7 local17 = new Class3_Sub7(arg0);
		@Pc(22) Class3_Sub7 local22 = new Class3_Sub7(arg0);
		@Pc(27) Class3_Sub7 local27 = new Class3_Sub7(arg0);
		@Pc(32) Class3_Sub7 local32 = new Class3_Sub7(arg0);
		local12.anInt3235 = arg0.length - 18;
		this.anInt4993 = local12.method2588();
		this.anInt4975 = local12.method2588();
		this.anInt4977 = local12.method2582();
		@Pc(57) int local57 = local12.method2582();
		@Pc(61) int local61 = local12.method2582();
		@Pc(65) int local65 = local12.method2582();
		@Pc(69) int local69 = local12.method2582();
		@Pc(73) int local73 = local12.method2582();
		@Pc(77) int local77 = local12.method2588();
		@Pc(81) int local81 = local12.method2588();
		@Pc(85) int local85 = local12.method2588();
		@Pc(89) int local89 = local12.method2588();
		@Pc(98) int local98 = this.anInt4993;
		@Pc(100) int local100 = local98;
		local98 += this.anInt4975;
		@Pc(107) int local107 = local98;
		if (local61 == 255) {
			local98 += this.anInt4975;
		}
		@Pc(117) int local117 = local98;
		if (local69 == 1) {
			local98 += this.anInt4975;
		}
		@Pc(127) int local127 = local98;
		if (local57 == 1) {
			local98 += this.anInt4975;
		}
		@Pc(139) int local139 = local98;
		if (local73 == 1) {
			local98 += this.anInt4993;
		}
		@Pc(151) int local151 = local98;
		if (local65 == 1) {
			local98 += this.anInt4975;
		}
		@Pc(163) int local163 = local98;
		local98 += local89;
		@Pc(173) int local173 = local98;
		local98 += this.anInt4975 * 2;
		@Pc(182) int local182 = local98;
		local98 += this.anInt4977 * 6;
		@Pc(191) int local191 = local98;
		local98 += local77;
		@Pc(197) int local197 = local98;
		local98 += local81;
		if (local61 == 255) {
			this.aByteArray61 = new byte[this.anInt4975];
		} else {
			this.aByte91 = (byte) local61;
		}
		this.anIntArray337 = new int[this.anInt4993];
		this.aShortArray82 = new short[this.anInt4975];
		this.anIntArray334 = new int[this.anInt4993];
		if (local65 == 1) {
			this.aByteArray62 = new byte[this.anInt4975];
		}
		if (local69 == 1) {
			this.anIntArray336 = new int[this.anInt4975];
		}
		this.aShortArray83 = new short[this.anInt4975];
		if (local73 == 1) {
			this.anIntArray333 = new int[this.anInt4993];
		}
		if (local57 == 1) {
			this.aByteArray64 = new byte[this.anInt4975];
			this.aShortArray89 = new short[this.anInt4975];
			this.aByteArray65 = new byte[this.anInt4975];
		}
		this.aShortArray90 = new short[this.anInt4975];
		local12.anInt3235 = 0;
		if (this.anInt4977 > 0) {
			this.aShortArray88 = new short[this.anInt4977];
			this.aShortArray85 = new short[this.anInt4977];
			this.aShortArray84 = new short[this.anInt4977];
			this.aByteArray60 = new byte[this.anInt4977];
		}
		this.aShortArray86 = new short[this.anInt4975];
		this.anIntArray329 = new int[this.anInt4993];
		local17.anInt3235 = local191;
		local22.anInt3235 = local197;
		local27.anInt3235 = local98;
		local32.anInt3235 = local139;
		@Pc(343) int local343 = 0;
		@Pc(345) int local345 = 0;
		@Pc(347) int local347 = 0;
		@Pc(354) int local354;
		@Pc(356) int local356;
		for (@Pc(349) int local349 = 0; local349 < this.anInt4993; local349++) {
			local354 = local12.method2582();
			local356 = 0;
			if ((local354 & 0x1) != 0) {
				local356 = local17.method2626();
			}
			@Pc(366) int local366 = 0;
			if ((local354 & 0x2) != 0) {
				local366 = local22.method2626();
			}
			@Pc(379) int local379 = 0;
			if ((local354 & 0x4) != 0) {
				local379 = local27.method2626();
			}
			this.anIntArray334[local349] = local356 + local343;
			this.anIntArray329[local349] = local345 + local366;
			this.anIntArray337[local349] = local379 + local347;
			local345 = this.anIntArray329[local349];
			local343 = this.anIntArray334[local349];
			local347 = this.anIntArray337[local349];
			if (local73 == 1) {
				this.anIntArray333[local349] = local32.method2582();
			}
		}
		local12.anInt3235 = local173;
		local17.anInt3235 = local127;
		local22.anInt3235 = local107;
		local27.anInt3235 = local151;
		local32.anInt3235 = local117;
		for (local354 = 0; local354 < this.anInt4975; local354++) {
			this.aShortArray86[local354] = (short) local12.method2588();
			if (local57 == 1) {
				local356 = local17.method2582();
				if ((local356 & 0x1) == 1) {
					this.aByteArray65[local354] = 1;
					local5 = true;
				} else {
					this.aByteArray65[local354] = 0;
				}
				if ((local356 & 0x2) == 2) {
					this.aByteArray64[local354] = (byte) (local356 >> 2);
					this.aShortArray89[local354] = this.aShortArray86[local354];
					this.aShortArray86[local354] = 127;
					if (this.aShortArray89[local354] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray64[local354] = -1;
					this.aShortArray89[local354] = -1;
				}
			}
			if (local61 == 255) {
				this.aByteArray61[local354] = local22.method2612();
			}
			if (local65 == 1) {
				this.aByteArray62[local354] = local27.method2612();
			}
			if (local69 == 1) {
				this.anIntArray336[local354] = local32.method2582();
			}
		}
		local12.anInt3235 = local163;
		this.anInt4982 = -1;
		local17.anInt3235 = local100;
		@Pc(592) short local592 = 0;
		@Pc(594) short local594 = 0;
		@Pc(596) short local596 = 0;
		@Pc(598) short local598 = 0;
		@Pc(605) int local605;
		for (@Pc(600) int local600 = 0; local600 < this.anInt4975; local600++) {
			local605 = local17.method2582();
			if (local605 == 1) {
				local592 = (short) (local598 + local12.method2626());
				local594 = (short) (local592 + local12.method2626());
				local596 = (short) (local594 + local12.method2626());
				this.aShortArray82[local600] = local592;
				local598 = local596;
				this.aShortArray90[local600] = local594;
				this.aShortArray83[local600] = local596;
				if (local592 > this.anInt4982) {
					this.anInt4982 = local592;
				}
				if (this.anInt4982 < local594) {
					this.anInt4982 = local594;
				}
				if (this.anInt4982 < local596) {
					this.anInt4982 = local596;
				}
			}
			if (local605 == 2) {
				local594 = local596;
				local596 = (short) (local598 + local12.method2626());
				local598 = local596;
				this.aShortArray82[local600] = local592;
				this.aShortArray90[local600] = local594;
				this.aShortArray83[local600] = local596;
				if (this.anInt4982 < local596) {
					this.anInt4982 = local596;
				}
			}
			if (local605 == 3) {
				local592 = local596;
				local596 = (short) (local598 + local12.method2626());
				this.aShortArray82[local600] = local592;
				local598 = local596;
				this.aShortArray90[local600] = local594;
				this.aShortArray83[local600] = local596;
				if (local596 > this.anInt4982) {
					this.anInt4982 = local596;
				}
			}
			if (local605 == 4) {
				@Pc(766) short local766 = local592;
				local592 = local594;
				local596 = (short) (local598 + local12.method2626());
				local594 = local766;
				this.aShortArray82[local600] = local592;
				local598 = local596;
				this.aShortArray90[local600] = local766;
				this.aShortArray83[local600] = local596;
				if (this.anInt4982 < local596) {
					this.anInt4982 = local596;
				}
			}
		}
		this.anInt4982++;
		local12.anInt3235 = local182;
		for (local605 = 0; local605 < this.anInt4977; local605++) {
			this.aByteArray60[local605] = 0;
			this.aShortArray85[local605] = (short) local12.method2588();
			this.aShortArray88[local605] = (short) local12.method2588();
			this.aShortArray84[local605] = (short) local12.method2588();
		}
		if (this.aByteArray64 != null) {
			@Pc(861) boolean local861 = false;
			for (@Pc(863) int local863 = 0; local863 < this.anInt4975; local863++) {
				@Pc(871) int local871 = this.aByteArray64[local863] & 0xFF;
				if (local871 != 255) {
					if ((this.aShortArray85[local871] & 0xFFFF) == this.aShortArray82[local863] && (this.aShortArray88[local871] & 0xFFFF) == this.aShortArray90[local863] && this.aShortArray83[local863] == (this.aShortArray84[local871] & 0xFFFF)) {
						this.aByteArray64[local863] = -1;
					} else {
						local861 = true;
					}
				}
			}
			if (!local861) {
				this.aByteArray64 = null;
			}
		}
		if (!local5) {
			this.aByteArray65 = null;
		}
		if (!local7) {
			this.aShortArray89 = null;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(IIII)V")
	public void method3829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt4993; local5++) {
			this.anIntArray334[local5] += arg0;
			this.anIntArray329[local5] += arg2;
			this.anIntArray337[local5] += arg1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B[B)V")
	private void method3831(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub7 local8 = new Class3_Sub7(arg0);
		@Pc(13) Class3_Sub7 local13 = new Class3_Sub7(arg0);
		@Pc(18) Class3_Sub7 local18 = new Class3_Sub7(arg0);
		@Pc(23) Class3_Sub7 local23 = new Class3_Sub7(arg0);
		@Pc(28) Class3_Sub7 local28 = new Class3_Sub7(arg0);
		@Pc(33) Class3_Sub7 local33 = new Class3_Sub7(arg0);
		@Pc(38) Class3_Sub7 local38 = new Class3_Sub7(arg0);
		local8.anInt3235 = arg0.length - 23;
		this.anInt4993 = local8.method2588();
		this.anInt4975 = local8.method2588();
		this.anInt4977 = local8.method2582();
		@Pc(73) int local73 = local8.method2582();
		@Pc(82) boolean local82 = (local73 & 0x1) == 1;
		@Pc(93) boolean local93 = (local73 & 0x2) == 2;
		@Pc(102) boolean local102 = (local73 & 0x4) == 4;
		@Pc(111) boolean local111 = (local73 & 0x8) == 8;
		if (local111) {
			local8.anInt3235 -= 7;
			this.anInt4979 = local8.method2582();
			local8.anInt3235 += 6;
		}
		@Pc(134) int local134 = local8.method2582();
		@Pc(138) int local138 = local8.method2582();
		@Pc(142) int local142 = local8.method2582();
		@Pc(146) int local146 = local8.method2582();
		@Pc(150) int local150 = local8.method2582();
		@Pc(154) int local154 = local8.method2588();
		@Pc(158) int local158 = local8.method2588();
		@Pc(162) int local162 = local8.method2588();
		@Pc(166) int local166 = local8.method2588();
		@Pc(170) int local170 = local8.method2588();
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(192) int local192;
		if (this.anInt4977 > 0) {
			this.aByteArray60 = new byte[this.anInt4977];
			local8.anInt3235 = 0;
			for (local192 = 0; local192 < this.anInt4977; local192++) {
				@Pc(202) byte local202 = this.aByteArray60[local192] = local8.method2612();
				if (local202 >= 1 && local202 <= 3) {
					local174++;
				}
				if (local202 == 0) {
					local172++;
				}
				if (local202 == 2) {
					local176++;
				}
			}
		}
		local192 = this.anInt4977;
		@Pc(232) int local232 = local192;
		local192 += this.anInt4993;
		@Pc(239) int local239 = local192;
		if (local82) {
			local192 += this.anInt4975;
		}
		@Pc(248) int local248 = local192;
		local192 += this.anInt4975;
		@Pc(255) int local255 = local192;
		if (local134 == 255) {
			local192 += this.anInt4975;
		}
		@Pc(265) int local265 = local192;
		if (local142 == 1) {
			local192 += this.anInt4975;
		}
		@Pc(275) int local275 = local192;
		if (local150 == 1) {
			local192 += this.anInt4993;
		}
		@Pc(287) int local287 = local192;
		if (local138 == 1) {
			local192 += this.anInt4975;
		}
		@Pc(297) int local297 = local192;
		local192 += local166;
		@Pc(303) int local303 = local192;
		if (local146 == 1) {
			local192 += this.anInt4975 * 2;
		}
		@Pc(317) int local317 = local192;
		local192 += local170;
		@Pc(323) int local323 = local192;
		local192 += this.anInt4975 * 2;
		@Pc(332) int local332 = local192;
		local192 += local154;
		@Pc(338) int local338 = local192;
		local192 += local158;
		@Pc(344) int local344 = local192;
		local192 += local162;
		@Pc(350) int local350 = local192;
		local192 += local172 * 6;
		@Pc(358) int local358 = local192;
		local192 += local174 * 6;
		@Pc(374) int local374 = this.anInt4979 >= 14 ? 7 : 6;
		@Pc(376) int local376 = local192;
		local192 += local374 * local174;
		@Pc(384) int local384 = local192;
		local192 += local174;
		@Pc(390) int local390 = local192;
		local192 += local174;
		@Pc(396) int local396 = local192;
		local192 += local176 * 2 + local174;
		this.aShortArray82 = new short[this.anInt4975];
		this.aShortArray83 = new short[this.anInt4975];
		if (local138 == 1) {
			this.aByteArray62 = new byte[this.anInt4975];
		}
		if (local142 == 1) {
			this.anIntArray336 = new int[this.anInt4975];
		}
		local8.anInt3235 = local232;
		if (local82) {
			this.aByteArray65 = new byte[this.anInt4975];
		}
		this.anIntArray337 = new int[this.anInt4993];
		this.anIntArray329 = new int[this.anInt4993];
		if (this.anInt4977 > 0) {
			this.aShortArray84 = new short[this.anInt4977];
			if (local174 > 0) {
				this.anIntArray335 = new int[local174];
				this.aByteArray59 = new byte[local174];
				this.anIntArray331 = new int[local174];
				this.aByteArray63 = new byte[local174];
				this.anIntArray332 = new int[local174];
				this.anIntArray330 = new int[local174];
			}
			if (local176 > 0) {
				this.anIntArray338 = new int[local176];
				this.anIntArray328 = new int[local176];
			}
			this.aShortArray85 = new short[this.anInt4977];
			this.aShortArray88 = new short[this.anInt4977];
		}
		this.aShortArray90 = new short[this.anInt4975];
		this.anIntArray334 = new int[this.anInt4993];
		if (local150 == 1) {
			this.anIntArray333 = new int[this.anInt4993];
		}
		if (local134 == 255) {
			this.aByteArray61 = new byte[this.anInt4975];
		} else {
			this.aByte91 = (byte) local134;
		}
		this.aShortArray86 = new short[this.anInt4975];
		if (local146 == 1) {
			this.aShortArray89 = new short[this.anInt4975];
		}
		if (local146 == 1 && this.anInt4977 > 0) {
			this.aByteArray64 = new byte[this.anInt4975];
		}
		local13.anInt3235 = local332;
		local18.anInt3235 = local338;
		local23.anInt3235 = local344;
		local28.anInt3235 = local275;
		@Pc(591) int local591 = 0;
		@Pc(593) int local593 = 0;
		@Pc(595) int local595 = 0;
		@Pc(602) int local602;
		for (@Pc(597) int local597 = 0; local597 < this.anInt4993; local597++) {
			local602 = local8.method2582();
			@Pc(604) int local604 = 0;
			if ((local602 & 0x1) != 0) {
				local604 = local13.method2626();
			}
			@Pc(614) int local614 = 0;
			if ((local602 & 0x2) != 0) {
				local614 = local18.method2626();
			}
			@Pc(627) int local627 = 0;
			if ((local602 & 0x4) != 0) {
				local627 = local23.method2626();
			}
			this.anIntArray334[local597] = local604 + local591;
			this.anIntArray329[local597] = local593 + local614;
			this.anIntArray337[local597] = local595 + local627;
			local591 = this.anIntArray334[local597];
			local595 = this.anIntArray337[local597];
			local593 = this.anIntArray329[local597];
			if (local150 == 1) {
				this.anIntArray333[local597] = local28.method2582();
			}
		}
		local8.anInt3235 = local323;
		local13.anInt3235 = local239;
		local18.anInt3235 = local255;
		local23.anInt3235 = local287;
		local28.anInt3235 = local265;
		local33.anInt3235 = local303;
		local38.anInt3235 = local317;
		for (local602 = 0; local602 < this.anInt4975; local602++) {
			this.aShortArray86[local602] = (short) local8.method2588();
			if (local82) {
				this.aByteArray65[local602] = local13.method2612();
			}
			if (local134 == 255) {
				this.aByteArray61[local602] = local18.method2612();
			}
			if (local138 == 1) {
				this.aByteArray62[local602] = local23.method2612();
			}
			if (local142 == 1) {
				this.anIntArray336[local602] = local28.method2582();
			}
			if (local146 == 1) {
				this.aShortArray89[local602] = (short) (local33.method2588() - 1);
			}
			if (this.aByteArray64 != null) {
				if (this.aShortArray89[local602] == -1) {
					this.aByteArray64[local602] = -1;
				} else {
					this.aByteArray64[local602] = (byte) (local38.method2582() - 1);
				}
			}
		}
		this.anInt4982 = -1;
		local8.anInt3235 = local297;
		local13.anInt3235 = local248;
		@Pc(825) short local825 = 0;
		@Pc(827) short local827 = 0;
		@Pc(829) short local829 = 0;
		@Pc(831) short local831 = 0;
		@Pc(838) int local838;
		for (@Pc(833) int local833 = 0; local833 < this.anInt4975; local833++) {
			local838 = local13.method2582();
			if (local838 == 1) {
				local825 = (short) (local8.method2626() + local831);
				local827 = (short) (local8.method2626() + local825);
				local829 = (short) (local8.method2626() + local827);
				this.aShortArray82[local833] = local825;
				local831 = local829;
				this.aShortArray90[local833] = local827;
				this.aShortArray83[local833] = local829;
				if (local825 > this.anInt4982) {
					this.anInt4982 = local825;
				}
				if (this.anInt4982 < local827) {
					this.anInt4982 = local827;
				}
				if (local829 > this.anInt4982) {
					this.anInt4982 = local829;
				}
			}
			if (local838 == 2) {
				local827 = local829;
				local829 = (short) (local8.method2626() + local831);
				local831 = local829;
				this.aShortArray82[local833] = local825;
				this.aShortArray90[local833] = local827;
				this.aShortArray83[local833] = local829;
				if (local829 > this.anInt4982) {
					this.anInt4982 = local829;
				}
			}
			if (local838 == 3) {
				local825 = local829;
				local829 = (short) (local8.method2626() + local831);
				local831 = local829;
				this.aShortArray82[local833] = local825;
				this.aShortArray90[local833] = local827;
				this.aShortArray83[local833] = local829;
				if (local829 > this.anInt4982) {
					this.anInt4982 = local829;
				}
			}
			if (local838 == 4) {
				@Pc(993) short local993 = local825;
				local825 = local827;
				local829 = (short) (local831 + local8.method2626());
				local827 = local993;
				this.aShortArray82[local833] = local825;
				local831 = local829;
				this.aShortArray90[local833] = local993;
				this.aShortArray83[local833] = local829;
				if (this.anInt4982 < local829) {
					this.anInt4982 = local829;
				}
			}
		}
		local8.anInt3235 = local350;
		this.anInt4982++;
		local13.anInt3235 = local358;
		local18.anInt3235 = local376;
		local23.anInt3235 = local384;
		local28.anInt3235 = local390;
		local33.anInt3235 = local396;
		@Pc(1075) int local1075;
		for (local838 = 0; local838 < this.anInt4977; local838++) {
			local1075 = this.aByteArray60[local838] & 0xFF;
			if (local1075 == 0) {
				this.aShortArray85[local838] = (short) local8.method2588();
				this.aShortArray88[local838] = (short) local8.method2588();
				this.aShortArray84[local838] = (short) local8.method2588();
			}
			if (local1075 == 1) {
				this.aShortArray85[local838] = (short) local13.method2588();
				this.aShortArray88[local838] = (short) local13.method2588();
				this.aShortArray84[local838] = (short) local13.method2588();
				this.anIntArray330[local838] = local18.method2588();
				if (this.anInt4979 < 14) {
					this.anIntArray335[local838] = local18.method2588();
				} else {
					this.anIntArray335[local838] = local18.method2604();
				}
				this.anIntArray332[local838] = local18.method2588();
				this.aByteArray59[local838] = local23.method2612();
				this.aByteArray63[local838] = local28.method2612();
				this.anIntArray331[local838] = local33.method2612();
			}
			if (local1075 == 2) {
				this.aShortArray85[local838] = (short) local13.method2588();
				this.aShortArray88[local838] = (short) local13.method2588();
				this.aShortArray84[local838] = (short) local13.method2588();
				this.anIntArray330[local838] = local18.method2588();
				if (this.anInt4979 < 14) {
					this.anIntArray335[local838] = local18.method2588();
				} else {
					this.anIntArray335[local838] = local18.method2604();
				}
				this.anIntArray332[local838] = local18.method2588();
				this.aByteArray59[local838] = local23.method2612();
				this.aByteArray63[local838] = local28.method2612();
				this.anIntArray331[local838] = local33.method2612();
				this.anIntArray338[local838] = local33.method2612();
				this.anIntArray328[local838] = local33.method2612();
			}
			if (local1075 == 3) {
				this.aShortArray85[local838] = (short) local13.method2588();
				this.aShortArray88[local838] = (short) local13.method2588();
				this.aShortArray84[local838] = (short) local13.method2588();
				this.anIntArray330[local838] = local18.method2588();
				if (this.anInt4979 < 14) {
					this.anIntArray335[local838] = local18.method2588();
				} else {
					this.anIntArray335[local838] = local18.method2604();
				}
				this.anIntArray332[local838] = local18.method2588();
				this.aByteArray59[local838] = local23.method2612();
				this.aByteArray63[local838] = local28.method2612();
				this.anIntArray331[local838] = local33.method2612();
			}
		}
		local8.anInt3235 = local192;
		@Pc(1398) int local1398;
		@Pc(1403) int local1403;
		@Pc(1407) int local1407;
		@Pc(1471) int local1471;
		if (local93) {
			local1075 = local8.method2582();
			if (local1075 > 0) {
				this.aClass269Array2 = new Class269[local1075];
				for (local1398 = 0; local1398 < local1075; local1398++) {
					local1403 = local8.method2588();
					local1407 = local8.method2588();
					@Pc(1415) byte local1415;
					if (local134 == 255) {
						local1415 = this.aByteArray61[local1407];
					} else {
						local1415 = (byte) local134;
					}
					this.aClass269Array2[local1398] = new Class269(local1403, this.aShortArray82[local1407], this.aShortArray90[local1407], this.aShortArray83[local1407], local1415);
				}
			}
			local1398 = local8.method2582();
			if (local1398 > 0) {
				this.aClass165Array2 = new Class165[local1398];
				for (local1403 = 0; local1403 < local1398; local1403++) {
					local1407 = local8.method2588();
					local1471 = local8.method2588();
					this.aClass165Array2[local1403] = new Class165(local1407, local1471);
				}
			}
		}
		if (!local102) {
			return;
		}
		local1075 = local8.method2582();
		if (local1075 <= 0) {
			return;
		}
		this.aClass185Array1 = new Class185[local1075];
		for (local1398 = 0; local1398 < local1075; local1398++) {
			local1403 = local8.method2588();
			local1407 = local8.method2588();
			local1471 = local8.method2582();
			@Pc(1522) byte local1522 = local8.method2612();
			this.aClass185Array1[local1398] = new Class185(local1403, local1407, local1471, local1522);
		}
		return;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
	public void method3832() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4993; local1++) {
			this.anIntArray334[local1] <<= 0x0;
			this.anIntArray329[local1] <<= 0x0;
			this.anIntArray337[local1] <<= 0x0;
		}
		if (this.anInt4977 <= 0 || this.anIntArray330 == null) {
			return;
		}
		for (@Pc(51) int local51 = 0; local51 < this.anIntArray330.length; local51++) {
			this.anIntArray330[local51] <<= 0x0;
			this.anIntArray335[local51] <<= 0x0;
			if (this.aByteArray60[local51] != 1) {
				this.anIntArray332[local51] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(SSSBBSBSIS)B")
	public byte method3833() {
		if (this.anInt4977 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray60[this.anInt4977] = 3;
		this.aShortArray85[this.anInt4977] = 0;
		this.aShortArray88[this.anInt4977] = 32767;
		this.aShortArray84[this.anInt4977] = 0;
		this.anIntArray330[this.anInt4977] = 1024;
		this.anIntArray335[this.anInt4977] = 1024;
		this.anIntArray332[this.anInt4977] = 1024;
		this.aByteArray59[this.anInt4977] = 0;
		this.aByteArray63[this.anInt4977] = 0;
		this.anIntArray331[this.anInt4977] = 0;
		return (byte) this.anInt4977++;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBSLclient!nd;)I")
	private int method3834(@OriginalArg(0) int arg0, @OriginalArg(2) short arg1, @OriginalArg(3) Class161 arg2) {
		@Pc(16) int local16 = arg2.anIntArray334[arg0];
		@Pc(21) int local21 = arg2.anIntArray329[arg0];
		@Pc(26) int local26 = arg2.anIntArray337[arg0];
		for (@Pc(28) int local28 = 0; local28 < this.anInt4993; local28++) {
			if (this.anIntArray334[local28] == local16 && local21 == this.anIntArray329[local28] && this.anIntArray337[local28] == local26) {
				this.aShortArray87[local28] |= arg1;
				return local28;
			}
		}
		this.anIntArray334[this.anInt4993] = local16;
		this.anIntArray329[this.anInt4993] = local21;
		this.anIntArray337[this.anInt4993] = local26;
		this.aShortArray87[this.anInt4993] = arg1;
		this.anIntArray333[this.anInt4993] = arg2.anIntArray333 == null ? -1 : arg2.anIntArray333[arg0];
		return this.anInt4993++;
	}
}
