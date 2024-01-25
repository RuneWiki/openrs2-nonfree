import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class200 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "[I")
	public int[] anIntArray934;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "[Lclient!lh;")
	public Class145[] aClass145Array2;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!qi", name = "z", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!qi", name = "A", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!qi", name = "H", descriptor = "[Lclient!of;")
	public Class176[] aClass176Array2;

	@OriginalMember(owner = "client!qi", name = "K", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!qi", name = "L", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "[I")
	public int[] anIntArray935;

	@OriginalMember(owner = "client!qi", name = "N", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "[B")
	public byte[] aByteArray96;

	@OriginalMember(owner = "client!qi", name = "P", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "[I")
	public int[] anIntArray936;

	@OriginalMember(owner = "client!qi", name = "T", descriptor = "[I")
	public int[] anIntArray937;

	@OriginalMember(owner = "client!qi", name = "U", descriptor = "[B")
	public byte[] aByteArray97;

	@OriginalMember(owner = "client!qi", name = "V", descriptor = "[I")
	public int[] anIntArray938;

	@OriginalMember(owner = "client!qi", name = "ab", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	public int anInt4827 = 0;

	@OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
	public int anInt4836 = 0;

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "B")
	public byte aByte49 = 0;

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
	public int anInt4839 = 0;

	@OriginalMember(owner = "client!qi", name = "Z", descriptor = "I")
	public int anInt4844 = 0;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "([B)V")
	public Class200(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4256(arg0);
		} else {
			this.method4262(arg0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(III)V")
	public Class200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray88 = new byte[arg1];
		this.aByteArray93 = new byte[arg1];
		this.aByteArray92 = new byte[arg1];
		this.anIntArray935 = new int[arg0];
		this.aByteArray89 = new byte[arg1];
		if (arg2 > 0) {
			this.aByteArray90 = new byte[arg2];
			this.aByteArray91 = new byte[arg2];
			this.aByteArray94 = new byte[arg2];
			this.aShortArray91 = new short[arg2];
			this.aShortArray90 = new short[arg2];
			this.aShortArray88 = new short[arg2];
			this.aShortArray94 = new short[arg2];
			this.aShortArray96 = new short[arg2];
			this.aByteArray97 = new byte[arg2];
			this.aByteArray96 = new byte[arg2];
			this.aShortArray89 = new short[arg2];
			this.aByteArray95 = new byte[arg2];
		}
		this.aShortArray92 = new short[arg1];
		this.anIntArray936 = new int[arg0];
		this.anIntArray934 = new int[arg0];
		this.aShortArray93 = new short[arg1];
		this.aShortArray95 = new short[arg1];
		this.anIntArray938 = new int[arg0];
		this.aShortArray85 = new short[arg1];
		this.anIntArray937 = new int[arg1];
		this.aShortArray87 = new short[arg1];
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "([Lclient!qi;I)V")
	public Class200(@OriginalArg(0) Class200[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4844 = 0;
		this.anInt4839 = 0;
		this.anInt4827 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte49 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class200 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt4844 += local54.anInt4844;
				this.anInt4839 += local54.anInt4839;
				this.anInt4827 += local54.anInt4827;
				if (local54.aClass176Array2 != null) {
					local29 += local54.aClass176Array2.length;
				}
				if (local54.aClass145Array2 != null) {
					local31 += local54.aClass145Array2.length;
				}
				local33 |= local54.aByteArray88 != null;
				local37 |= local54.aByteArray93 != null;
				local39 |= local54.aByteArray92 != null;
				local46 |= local54.anIntArray937 != null;
				local41 |= local54.aShortArray85 != null;
				if (local54.aByteArray89 == null) {
					if (this.aByte49 == -1) {
						this.aByte49 = local54.aByte49;
					}
					if (local54.aByte49 != this.aByte49) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
			}
		}
		if (this.anInt4827 > 0) {
			this.aShortArray96 = new short[this.anInt4827];
			this.aShortArray91 = new short[this.anInt4827];
			this.aShortArray89 = new short[this.anInt4827];
			this.aShortArray94 = new short[this.anInt4827];
			this.aByteArray97 = new byte[this.anInt4827];
			this.aByteArray94 = new byte[this.anInt4827];
			this.aByteArray91 = new byte[this.anInt4827];
			this.aByteArray90 = new byte[this.anInt4827];
			this.aByteArray96 = new byte[this.anInt4827];
			this.aShortArray90 = new short[this.anInt4827];
			this.aShortArray88 = new short[this.anInt4827];
			this.aByteArray95 = new byte[this.anInt4827];
		}
		this.anIntArray934 = new int[this.anInt4844];
		if (local37) {
			this.aByteArray93 = new byte[this.anInt4839];
		}
		this.aShortArray95 = new short[this.anInt4839];
		if (local29 > 0) {
			this.aClass176Array2 = new Class176[local29];
		}
		this.aShortArray87 = new short[this.anInt4839];
		this.anIntArray935 = new int[this.anInt4844];
		if (local41) {
			this.aShortArray85 = new short[this.anInt4839];
		}
		if (local46) {
			this.anIntArray937 = new int[this.anInt4839];
		}
		this.anIntArray938 = new int[this.anInt4844];
		if (local31 > 0) {
			this.aClass145Array2 = new Class145[local31];
		}
		this.aShortArray97 = new short[this.anInt4844];
		this.anIntArray936 = new int[this.anInt4844];
		if (local39) {
			this.aByteArray92 = new byte[this.anInt4839];
		}
		this.aShortArray86 = new short[this.anInt4839];
		this.aShortArray93 = new short[this.anInt4839];
		if (local35) {
			this.aByteArray89 = new byte[this.anInt4839];
		}
		this.aShortArray92 = new short[this.anInt4839];
		if (local33) {
			this.aByteArray88 = new byte[this.anInt4839];
		}
		this.anInt4844 = 0;
		local31 = 0;
		this.anInt4827 = 0;
		local29 = 0;
		this.anInt4839 = 0;
		@Pc(559) int local559;
		@Pc(570) int local570;
		for (@Pc(358) int local358 = 0; local358 < arg1; local358++) {
			@Pc(365) short local365 = (short) (0x1 << local358);
			@Pc(369) Class200 local369 = arg0[local358];
			if (local369 != null) {
				for (@Pc(373) int local373 = 0; local373 < local369.anInt4839; local373++) {
					if (local33 && local369.aByteArray88 != null) {
						this.aByteArray88[this.anInt4839] = local369.aByteArray88[local373];
					}
					if (local35) {
						if (local369.aByteArray89 == null) {
							this.aByteArray89[this.anInt4839] = local369.aByte49;
						} else {
							this.aByteArray89[this.anInt4839] = local369.aByteArray89[local373];
						}
					}
					if (local37 && local369.aByteArray93 != null) {
						this.aByteArray93[this.anInt4839] = local369.aByteArray93[local373];
					}
					if (local41) {
						if (local369.aShortArray85 == null) {
							this.aShortArray85[this.anInt4839] = -1;
						} else {
							this.aShortArray85[this.anInt4839] = local369.aShortArray85[local373];
						}
					}
					if (local46) {
						if (local369.anIntArray937 == null) {
							this.anIntArray937[this.anInt4839] = -1;
						} else {
							this.anIntArray937[this.anInt4839] = local369.anIntArray937[local373];
						}
					}
					this.aShortArray92[this.anInt4839] = (short) this.method4258(local369.aShortArray92[local373], local369, local365);
					this.aShortArray95[this.anInt4839] = (short) this.method4258(local369.aShortArray95[local373], local369, local365);
					this.aShortArray93[this.anInt4839] = (short) this.method4258(local369.aShortArray93[local373], local369, local365);
					this.aShortArray86[this.anInt4839] = local365;
					this.aShortArray87[this.anInt4839] = local369.aShortArray87[local373];
					this.anInt4839++;
				}
				@Pc(546) int local546;
				if (local369.aClass176Array2 != null) {
					for (local546 = 0; local546 < local369.aClass176Array2.length; local546++) {
						local559 = this.method4258(local369.aClass176Array2[local546].anInt4336, local369, local365);
						local570 = this.method4258(local369.aClass176Array2[local546].anInt4335, local369, local365);
						@Pc(581) int local581 = this.method4258(local369.aClass176Array2[local546].anInt4330, local369, local365);
						this.aClass176Array2[local29] = new Class176(local369.aClass176Array2[local546].anInt4329, local559, local570, local581, local369.aClass176Array2[local546].aByte47);
						local29++;
					}
				}
				if (local369.aClass145Array2 != null) {
					for (local546 = 0; local546 < local369.aClass145Array2.length; local546++) {
						local559 = this.method4258(local369.aClass145Array2[local546].anInt3632, local369, local365);
						this.aClass145Array2[local31] = new Class145(local369.aClass145Array2[local546].anInt3634, local559);
						local31++;
					}
				}
			}
		}
		this.anInt4836 = this.anInt4844;
		@Pc(664) int local664 = 0;
		for (@Pc(666) int local666 = 0; local666 < arg1; local666++) {
			@Pc(673) short local673 = (short) (0x1 << local666);
			@Pc(677) Class200 local677 = arg0[local666];
			if (local677 != null) {
				for (local559 = 0; local559 < local677.anInt4839; local559++) {
					if (local39) {
						this.aByteArray92[local664++] = (byte) (local677.aByteArray92 == null || local677.aByteArray92[local559] == -1 ? -1 : local677.aByteArray92[local559] + this.anInt4827);
					}
				}
				for (local570 = 0; local570 < local677.anInt4827; local570++) {
					@Pc(729) byte local729 = this.aByteArray96[this.anInt4827] = local677.aByteArray96[local570];
					if (local729 == 0) {
						this.aShortArray94[this.anInt4827] = (short) this.method4258(local677.aShortArray94[local570], local677, local673);
						this.aShortArray89[this.anInt4827] = (short) this.method4258(local677.aShortArray89[local570], local677, local673);
						this.aShortArray88[this.anInt4827] = (short) this.method4258(local677.aShortArray88[local570], local677, local673);
					}
					if (local729 >= 1 && local729 <= 3) {
						this.aShortArray94[this.anInt4827] = local677.aShortArray94[local570];
						this.aShortArray89[this.anInt4827] = local677.aShortArray89[local570];
						this.aShortArray88[this.anInt4827] = local677.aShortArray88[local570];
						this.aShortArray90[this.anInt4827] = local677.aShortArray90[local570];
						this.aShortArray96[this.anInt4827] = local677.aShortArray96[local570];
						this.aShortArray91[this.anInt4827] = local677.aShortArray91[local570];
						this.aByteArray91[this.anInt4827] = local677.aByteArray91[local570];
						this.aByteArray95[this.anInt4827] = local677.aByteArray95[local570];
						this.aByteArray90[this.anInt4827] = local677.aByteArray90[local570];
					}
					if (local729 == 2) {
						this.aByteArray97[this.anInt4827] = local677.aByteArray97[local570];
						this.aByteArray94[this.anInt4827] = local677.aByteArray94[local570];
					}
					this.anInt4827++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)[[I")
	public int[][] method4251() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4836; local12++) {
			@Pc(29) int local29 = this.anIntArray936[local12];
			if (local29 >= 0) {
				if (local10 < local29) {
					local10 = local29;
				}
				@Pc(44) int local44 = local8[local29]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.anInt4836; local82++) {
			@Pc(89) int local89 = this.anIntArray936[local82];
			if (local89 >= 0) {
				local57[local89][local8[local89]++] = local82;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)I")
	public int method4253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4844; local7++) {
			if (this.anIntArray935[local7] == arg1 && arg0 == this.anIntArray938[local7] && arg2 == this.anIntArray934[local7]) {
				return local7;
			}
		}
		this.anIntArray935[this.anInt4844] = arg1;
		this.anIntArray938[this.anInt4844] = arg0;
		this.anIntArray934[this.anInt4844] = arg2;
		this.anInt4836 = this.anInt4844 + 1;
		return this.anInt4844++;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(SSBBSSBSIS)B")
	public byte method4254() {
		if (this.anInt4827 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray96[this.anInt4827] = 3;
		this.aShortArray94[this.anInt4827] = 0;
		this.aShortArray89[this.anInt4827] = 32767;
		this.aShortArray88[this.anInt4827] = 0;
		this.aShortArray90[this.anInt4827] = 1024;
		this.aShortArray96[this.anInt4827] = 1024;
		this.aShortArray91[this.anInt4827] = 1024;
		this.aByteArray91[this.anInt4827] = 0;
		this.aByteArray95[this.anInt4827] = 0;
		this.aByteArray90[this.anInt4827] = 0;
		return (byte) this.anInt4827++;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BISISBIIB)I")
	public int method4255(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) short arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray92[this.anInt4839] = (short) arg6;
		this.aShortArray95[this.anInt4839] = (short) arg1;
		this.aShortArray93[this.anInt4839] = (short) arg3;
		this.aByteArray88[this.anInt4839] = arg7;
		this.aByteArray92[this.anInt4839] = arg5;
		this.aShortArray87[this.anInt4839] = arg2;
		this.aByteArray93[this.anInt4839] = arg0;
		this.aShortArray85[this.anInt4839] = arg4;
		return this.anInt4839++;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[B)V")
	private void method4256(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub16 local10 = new Class2_Sub16(arg0);
		@Pc(15) Class2_Sub16 local15 = new Class2_Sub16(arg0);
		@Pc(20) Class2_Sub16 local20 = new Class2_Sub16(arg0);
		@Pc(25) Class2_Sub16 local25 = new Class2_Sub16(arg0);
		@Pc(30) Class2_Sub16 local30 = new Class2_Sub16(arg0);
		@Pc(35) Class2_Sub16 local35 = new Class2_Sub16(arg0);
		@Pc(40) Class2_Sub16 local40 = new Class2_Sub16(arg0);
		local10.anInt6145 = arg0.length - 23;
		this.anInt4844 = local10.method5312();
		this.anInt4839 = local10.method5312();
		this.anInt4827 = local10.method5350();
		@Pc(65) int local65 = local10.method5350();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(89) int local89 = local10.method5350();
		@Pc(93) int local93 = local10.method5350();
		@Pc(97) int local97 = local10.method5350();
		@Pc(101) int local101 = local10.method5350();
		@Pc(105) int local105 = local10.method5350();
		@Pc(111) int local111 = local10.method5312();
		@Pc(115) int local115 = local10.method5312();
		@Pc(119) int local119 = local10.method5312();
		@Pc(123) int local123 = local10.method5312();
		@Pc(127) int local127 = local10.method5312();
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(133) int local133 = 0;
		@Pc(146) int local146;
		if (this.anInt4827 > 0) {
			local10.anInt6145 = 0;
			this.aByteArray96 = new byte[this.anInt4827];
			for (local146 = 0; local146 < this.anInt4827; local146++) {
				@Pc(157) byte local157 = this.aByteArray96[local146] = local10.method5330();
				if (local157 == 2) {
					local133++;
				}
				if (local157 == 0) {
					local129++;
				}
				if (local157 >= 1 && local157 <= 3) {
					local131++;
				}
			}
		}
		local146 = this.anInt4827;
		@Pc(188) int local188 = local146;
		local146 += this.anInt4844;
		@Pc(195) int local195 = local146;
		if (local76) {
			local146 += this.anInt4839;
		}
		@Pc(204) int local204 = local146;
		local146 += this.anInt4839;
		@Pc(211) int local211 = local146;
		if (local89 == 255) {
			local146 += this.anInt4839;
		}
		@Pc(221) int local221 = local146;
		if (local97 == 1) {
			local146 += this.anInt4839;
		}
		@Pc(233) int local233 = local146;
		if (local105 == 1) {
			local146 += this.anInt4844;
		}
		@Pc(245) int local245 = local146;
		if (local93 == 1) {
			local146 += this.anInt4839;
		}
		@Pc(257) int local257 = local146;
		local146 += local123;
		@Pc(263) int local263 = local146;
		if (local101 == 1) {
			local146 += this.anInt4839 * 2;
		}
		@Pc(277) int local277 = local146;
		local146 += local127;
		@Pc(283) int local283 = local146;
		local146 += this.anInt4839 * 2;
		@Pc(292) int local292 = local146;
		local146 += local111;
		@Pc(298) int local298 = local146;
		local146 += local115;
		@Pc(304) int local304 = local146;
		local146 += local119;
		@Pc(310) int local310 = local146;
		local146 += local129 * 6;
		@Pc(318) int local318 = local146;
		local146 += local131 * 6;
		@Pc(326) int local326 = local146;
		local146 += local131 * 6;
		@Pc(334) int local334 = local146;
		local146 += local131;
		@Pc(340) int local340 = local146;
		local146 += local131;
		@Pc(346) int local346 = local146;
		local146 += local133 * 2 + local131;
		this.anIntArray938 = new int[this.anInt4844];
		this.anIntArray934 = new int[this.anInt4844];
		this.aShortArray95 = new short[this.anInt4839];
		if (local101 == 1) {
			this.aShortArray85 = new short[this.anInt4839];
		}
		this.anIntArray935 = new int[this.anInt4844];
		if (local105 == 1) {
			this.anIntArray936 = new int[this.anInt4844];
		}
		this.aShortArray87 = new short[this.anInt4839];
		if (local76) {
			this.aByteArray88 = new byte[this.anInt4839];
		}
		local10.anInt6145 = local188;
		if (local93 == 1) {
			this.aByteArray93 = new byte[this.anInt4839];
		}
		if (local97 == 1) {
			this.anIntArray937 = new int[this.anInt4839];
		}
		if (this.anInt4827 > 0) {
			if (local133 > 0) {
				this.aByteArray94 = new byte[local133];
				this.aByteArray97 = new byte[local133];
			}
			this.aShortArray94 = new short[this.anInt4827];
			this.aShortArray89 = new short[this.anInt4827];
			if (local131 > 0) {
				this.aShortArray96 = new short[local131];
				this.aByteArray91 = new byte[local131];
				this.aShortArray90 = new short[local131];
				this.aByteArray90 = new byte[local131];
				this.aByteArray95 = new byte[local131];
				this.aShortArray91 = new short[local131];
			}
			this.aShortArray88 = new short[this.anInt4827];
		}
		this.aShortArray92 = new short[this.anInt4839];
		this.aShortArray93 = new short[this.anInt4839];
		if (local89 == 255) {
			this.aByteArray89 = new byte[this.anInt4839];
		} else {
			this.aByte49 = (byte) local89;
		}
		if (local101 == 1 && this.anInt4827 > 0) {
			this.aByteArray92 = new byte[this.anInt4839];
		}
		local15.anInt6145 = local292;
		local20.anInt6145 = local298;
		local25.anInt6145 = local304;
		local30.anInt6145 = local233;
		@Pc(537) int local537 = 0;
		@Pc(539) int local539 = 0;
		@Pc(541) int local541 = 0;
		@Pc(549) int local549;
		for (@Pc(543) int local543 = 0; local543 < this.anInt4844; local543++) {
			local549 = local10.method5350();
			@Pc(551) int local551 = 0;
			if ((local549 & 0x1) != 0) {
				local551 = local15.method5342();
			}
			@Pc(563) int local563 = 0;
			if ((local549 & 0x2) != 0) {
				local563 = local20.method5342();
			}
			@Pc(573) int local573 = 0;
			if ((local549 & 0x4) != 0) {
				local573 = local25.method5342();
			}
			this.anIntArray935[local543] = local537 + local551;
			this.anIntArray938[local543] = local563 + local539;
			this.anIntArray934[local543] = local573 + local541;
			local537 = this.anIntArray935[local543];
			local541 = this.anIntArray934[local543];
			local539 = this.anIntArray938[local543];
			if (local105 == 1) {
				this.anIntArray936[local543] = local30.method5350();
			}
		}
		local10.anInt6145 = local283;
		local15.anInt6145 = local195;
		local20.anInt6145 = local211;
		local25.anInt6145 = local245;
		local30.anInt6145 = local221;
		local35.anInt6145 = local263;
		local40.anInt6145 = local277;
		for (local549 = 0; local549 < this.anInt4839; local549++) {
			this.aShortArray87[local549] = (short) local10.method5312();
			if (local76) {
				this.aByteArray88[local549] = local15.method5330();
			}
			if (local89 == 255) {
				this.aByteArray89[local549] = local20.method5330();
			}
			if (local93 == 1) {
				this.aByteArray93[local549] = local25.method5330();
			}
			if (local97 == 1) {
				this.anIntArray937[local549] = local30.method5350();
			}
			if (local101 == 1) {
				this.aShortArray85[local549] = (short) (local35.method5312() - 1);
			}
			if (this.aByteArray92 != null) {
				if (this.aShortArray85[local549] == -1) {
					this.aByteArray92[local549] = -1;
				} else {
					this.aByteArray92[local549] = (byte) (local40.method5350() - 1);
				}
			}
		}
		this.anInt4836 = -1;
		local10.anInt6145 = local257;
		local15.anInt6145 = local204;
		@Pc(774) short local774 = 0;
		@Pc(776) short local776 = 0;
		@Pc(778) short local778 = 0;
		@Pc(780) short local780 = 0;
		@Pc(792) int local792;
		for (@Pc(786) int local786 = 0; local786 < this.anInt4839; local786++) {
			local792 = local15.method5350();
			if (local792 == 1) {
				local774 = (short) (local780 + local10.method5342());
				local776 = (short) (local774 + local10.method5342());
				local778 = (short) (local10.method5342() + local776);
				local780 = local778;
				this.aShortArray92[local786] = local774;
				this.aShortArray95[local786] = local776;
				this.aShortArray93[local786] = local778;
				if (local774 > this.anInt4836) {
					this.anInt4836 = local774;
				}
				if (local776 > this.anInt4836) {
					this.anInt4836 = local776;
				}
				if (this.anInt4836 < local778) {
					this.anInt4836 = local778;
				}
			}
			if (local792 == 2) {
				local776 = local778;
				local778 = (short) (local10.method5342() + local780);
				this.aShortArray92[local786] = local774;
				local780 = local778;
				this.aShortArray95[local786] = local776;
				this.aShortArray93[local786] = local778;
				if (this.anInt4836 < local778) {
					this.anInt4836 = local778;
				}
			}
			if (local792 == 3) {
				local774 = local778;
				local778 = (short) (local10.method5342() + local780);
				local780 = local778;
				this.aShortArray92[local786] = local774;
				this.aShortArray95[local786] = local776;
				this.aShortArray93[local786] = local778;
				if (this.anInt4836 < local778) {
					this.anInt4836 = local778;
				}
			}
			if (local792 == 4) {
				@Pc(953) short local953 = local774;
				local774 = local776;
				local776 = local953;
				local778 = (short) (local10.method5342() + local780);
				this.aShortArray92[local786] = local774;
				local780 = local778;
				this.aShortArray95[local786] = local953;
				this.aShortArray93[local786] = local778;
				if (this.anInt4836 < local778) {
					this.anInt4836 = local778;
				}
			}
		}
		this.anInt4836++;
		local10.anInt6145 = local310;
		local15.anInt6145 = local318;
		local20.anInt6145 = local326;
		local25.anInt6145 = local334;
		local30.anInt6145 = local340;
		local35.anInt6145 = local346;
		@Pc(1028) int local1028;
		for (local792 = 0; local792 < this.anInt4827; local792++) {
			local1028 = this.aByteArray96[local792] & 0xFF;
			if (local1028 == 0) {
				this.aShortArray94[local792] = (short) local10.method5312();
				this.aShortArray89[local792] = (short) local10.method5312();
				this.aShortArray88[local792] = (short) local10.method5312();
			}
			if (local1028 == 1) {
				this.aShortArray94[local792] = (short) local15.method5312();
				this.aShortArray89[local792] = (short) local15.method5312();
				this.aShortArray88[local792] = (short) local15.method5312();
				this.aShortArray90[local792] = (short) local20.method5312();
				this.aShortArray96[local792] = (short) local20.method5312();
				this.aShortArray91[local792] = (short) local20.method5312();
				this.aByteArray91[local792] = local25.method5330();
				this.aByteArray95[local792] = local30.method5330();
				this.aByteArray90[local792] = local35.method5330();
			}
			if (local1028 == 2) {
				this.aShortArray94[local792] = (short) local15.method5312();
				this.aShortArray89[local792] = (short) local15.method5312();
				this.aShortArray88[local792] = (short) local15.method5312();
				this.aShortArray90[local792] = (short) local20.method5312();
				this.aShortArray96[local792] = (short) local20.method5312();
				this.aShortArray91[local792] = (short) local20.method5312();
				this.aByteArray91[local792] = local25.method5330();
				this.aByteArray95[local792] = local30.method5330();
				this.aByteArray90[local792] = local35.method5330();
				this.aByteArray97[local792] = local35.method5330();
				this.aByteArray94[local792] = local35.method5330();
			}
			if (local1028 == 3) {
				this.aShortArray94[local792] = (short) local15.method5312();
				this.aShortArray89[local792] = (short) local15.method5312();
				this.aShortArray88[local792] = (short) local15.method5312();
				this.aShortArray90[local792] = (short) local20.method5312();
				this.aShortArray96[local792] = (short) local20.method5312();
				this.aShortArray91[local792] = (short) local20.method5312();
				this.aByteArray91[local792] = local25.method5330();
				this.aByteArray95[local792] = local30.method5330();
				this.aByteArray90[local792] = local35.method5330();
			}
		}
		if (!local85) {
			return;
		}
		local10.anInt6145 = local146;
		local1028 = local10.method5350();
		@Pc(1326) int local1326;
		@Pc(1332) int local1332;
		if (local1028 > 0) {
			this.aClass176Array2 = new Class176[local1028];
			for (local1326 = 0; local1326 < local1028; local1326++) {
				local1332 = local10.method5312();
				@Pc(1336) int local1336 = local10.method5312();
				@Pc(1344) byte local1344;
				if (local89 == 255) {
					local1344 = this.aByteArray89[local1336];
				} else {
					local1344 = (byte) local89;
				}
				this.aClass176Array2[local1326] = new Class176(local1332, this.aShortArray92[local1336], this.aShortArray95[local1336], this.aShortArray93[local1336], local1344);
			}
		}
		local1326 = local10.method5350();
		if (local1326 <= 0) {
			return;
		}
		this.aClass145Array2 = new Class145[local1326];
		for (local1332 = 0; local1332 < local1326; local1332++) {
			this.aClass145Array2[local1332] = new Class145(local10.method5312(), local10.method5312());
		}
		return;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!qi;IS)I")
	private int method4258(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray935[arg0];
		@Pc(15) int local15 = arg1.anIntArray938[arg0];
		@Pc(25) int local25 = arg1.anIntArray934[arg0];
		for (@Pc(27) int local27 = 0; local27 < this.anInt4844; local27++) {
			if (this.anIntArray935[local27] == local10 && local15 == this.anIntArray938[local27] && this.anIntArray934[local27] == local25) {
				this.aShortArray97[local27] |= arg2;
				return local27;
			}
		}
		this.anIntArray935[this.anInt4844] = local10;
		this.anIntArray938[this.anInt4844] = local15;
		this.anIntArray934[this.anInt4844] = local25;
		this.aShortArray97[this.anInt4844] = arg2;
		this.anIntArray936[this.anInt4844] = arg1.anIntArray936 == null ? -1 : arg1.anIntArray936[arg0];
		return this.anInt4844++;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)[[I")
	public int[][] method4259() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anInt4839; local22++) {
			@Pc(29) int local29 = this.anIntArray937[local22];
			if (local29 >= 0) {
				if (local10 < local29) {
					local10 = local29;
				}
				@Pc(47) int local47 = local8[local29]++;
			}
		}
		@Pc(64) int[][] local64 = new int[local10 + 1][];
		for (@Pc(66) int local66 = 0; local66 <= local10; local66++) {
			local64[local66] = new int[local8[local66]];
			local8[local66] = 0;
		}
		for (@Pc(89) int local89 = 0; local89 < this.anInt4839; local89++) {
			@Pc(96) int local96 = this.anIntArray937[local89];
			if (local96 >= 0) {
				local64[local96][local8[local96]++] = local89;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(SIS)V")
	public void method4260(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray85 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt4839; local11++) {
			if (this.aShortArray85[local11] == arg0) {
				this.aShortArray85[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I[B)V")
	private void method4262(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub16 local14 = new Class2_Sub16(arg0);
		@Pc(19) Class2_Sub16 local19 = new Class2_Sub16(arg0);
		@Pc(24) Class2_Sub16 local24 = new Class2_Sub16(arg0);
		@Pc(29) Class2_Sub16 local29 = new Class2_Sub16(arg0);
		@Pc(34) Class2_Sub16 local34 = new Class2_Sub16(arg0);
		local14.anInt6145 = arg0.length - 18;
		this.anInt4844 = local14.method5312();
		this.anInt4839 = local14.method5312();
		this.anInt4827 = local14.method5350();
		@Pc(59) int local59 = local14.method5350();
		@Pc(67) int local67 = local14.method5350();
		@Pc(71) int local71 = local14.method5350();
		@Pc(75) int local75 = local14.method5350();
		@Pc(79) int local79 = local14.method5350();
		@Pc(83) int local83 = local14.method5312();
		@Pc(89) int local89 = local14.method5312();
		@Pc(95) int local95 = local14.method5312();
		@Pc(99) int local99 = local14.method5312();
		@Pc(108) int local108 = this.anInt4844;
		@Pc(110) int local110 = local108;
		local108 += this.anInt4839;
		@Pc(117) int local117 = local108;
		if (local67 == 255) {
			local108 += this.anInt4839;
		}
		@Pc(129) int local129 = local108;
		if (local75 == 1) {
			local108 += this.anInt4839;
		}
		@Pc(139) int local139 = local108;
		if (local59 == 1) {
			local108 += this.anInt4839;
		}
		@Pc(149) int local149 = local108;
		if (local79 == 1) {
			local108 += this.anInt4844;
		}
		@Pc(161) int local161 = local108;
		if (local71 == 1) {
			local108 += this.anInt4839;
		}
		@Pc(171) int local171 = local108;
		local108 += local99;
		@Pc(177) int local177 = local108;
		local108 += this.anInt4839 * 2;
		@Pc(186) int local186 = local108;
		local108 += this.anInt4827 * 6;
		@Pc(195) int local195 = local108;
		local108 += local83;
		@Pc(201) int local201 = local108;
		local108 += local89;
		this.anIntArray935 = new int[this.anInt4844];
		local14.anInt6145 = 0;
		this.aShortArray92 = new short[this.anInt4839];
		if (local67 == 255) {
			this.aByteArray89 = new byte[this.anInt4839];
		} else {
			this.aByte49 = (byte) local67;
		}
		if (this.anInt4827 > 0) {
			this.aShortArray88 = new short[this.anInt4827];
			this.aShortArray89 = new short[this.anInt4827];
			this.aShortArray94 = new short[this.anInt4827];
			this.aByteArray96 = new byte[this.anInt4827];
		}
		if (local71 == 1) {
			this.aByteArray93 = new byte[this.anInt4839];
		}
		this.aShortArray87 = new short[this.anInt4839];
		this.aShortArray95 = new short[this.anInt4839];
		if (local59 == 1) {
			this.aByteArray88 = new byte[this.anInt4839];
			this.aByteArray92 = new byte[this.anInt4839];
			this.aShortArray85 = new short[this.anInt4839];
		}
		if (local79 == 1) {
			this.anIntArray936 = new int[this.anInt4844];
		}
		this.aShortArray93 = new short[this.anInt4839];
		this.anIntArray934 = new int[this.anInt4844];
		this.anIntArray938 = new int[this.anInt4844];
		if (local75 == 1) {
			this.anIntArray937 = new int[this.anInt4839];
		}
		local19.anInt6145 = local195;
		local24.anInt6145 = local201;
		local29.anInt6145 = local108;
		local34.anInt6145 = local149;
		@Pc(351) int local351 = 0;
		@Pc(353) int local353 = 0;
		@Pc(355) int local355 = 0;
		@Pc(363) int local363;
		@Pc(365) int local365;
		for (@Pc(357) int local357 = 0; local357 < this.anInt4844; local357++) {
			local363 = local14.method5350();
			local365 = 0;
			if ((local363 & 0x1) != 0) {
				local365 = local19.method5342();
			}
			@Pc(375) int local375 = 0;
			if ((local363 & 0x2) != 0) {
				local375 = local24.method5342();
			}
			@Pc(385) int local385 = 0;
			if ((local363 & 0x4) != 0) {
				local385 = local29.method5342();
			}
			this.anIntArray935[local357] = local351 + local365;
			this.anIntArray938[local357] = local353 + local375;
			this.anIntArray934[local357] = local355 + local385;
			local355 = this.anIntArray934[local357];
			local351 = this.anIntArray935[local357];
			local353 = this.anIntArray938[local357];
			if (local79 == 1) {
				this.anIntArray936[local357] = local34.method5350();
			}
		}
		local14.anInt6145 = local177;
		local19.anInt6145 = local139;
		local24.anInt6145 = local117;
		local29.anInt6145 = local161;
		local34.anInt6145 = local129;
		for (local363 = 0; local363 < this.anInt4839; local363++) {
			this.aShortArray87[local363] = (short) local14.method5312();
			if (local59 == 1) {
				local365 = local19.method5350();
				if ((local365 & 0x1) == 1) {
					local7 = true;
					this.aByteArray88[local363] = 1;
				} else {
					this.aByteArray88[local363] = 0;
				}
				if ((local365 & 0x2) == 2) {
					this.aByteArray92[local363] = (byte) (local365 >> 2);
					this.aShortArray85[local363] = this.aShortArray87[local363];
					this.aShortArray87[local363] = 127;
					if (this.aShortArray85[local363] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray92[local363] = -1;
					this.aShortArray85[local363] = -1;
				}
			}
			if (local67 == 255) {
				this.aByteArray89[local363] = local24.method5330();
			}
			if (local71 == 1) {
				this.aByteArray93[local363] = local29.method5330();
			}
			if (local75 == 1) {
				this.anIntArray937[local363] = local34.method5350();
			}
		}
		local14.anInt6145 = local171;
		this.anInt4836 = -1;
		local19.anInt6145 = local110;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(616) int local616;
		for (@Pc(610) int local610 = 0; local610 < this.anInt4839; local610++) {
			local616 = local19.method5350();
			if (local616 == 1) {
				local602 = (short) (local608 + local14.method5342());
				local604 = (short) (local602 + local14.method5342());
				local606 = (short) (local14.method5342() + local604);
				this.aShortArray92[local610] = local602;
				local608 = local606;
				this.aShortArray95[local610] = local604;
				this.aShortArray93[local610] = local606;
				if (local602 > this.anInt4836) {
					this.anInt4836 = local602;
				}
				if (this.anInt4836 < local604) {
					this.anInt4836 = local604;
				}
				if (local606 > this.anInt4836) {
					this.anInt4836 = local606;
				}
			}
			if (local616 == 2) {
				local604 = local606;
				local606 = (short) (local14.method5342() + local608);
				this.aShortArray92[local610] = local602;
				local608 = local606;
				this.aShortArray95[local610] = local604;
				this.aShortArray93[local610] = local606;
				if (this.anInt4836 < local606) {
					this.anInt4836 = local606;
				}
			}
			if (local616 == 3) {
				local602 = local606;
				local606 = (short) (local14.method5342() + local608);
				this.aShortArray92[local610] = local602;
				local608 = local606;
				this.aShortArray95[local610] = local604;
				this.aShortArray93[local610] = local606;
				if (this.anInt4836 < local606) {
					this.anInt4836 = local606;
				}
			}
			if (local616 == 4) {
				@Pc(763) short local763 = local602;
				local602 = local604;
				local604 = local763;
				local606 = (short) (local608 + local14.method5342());
				local608 = local606;
				this.aShortArray92[local610] = local602;
				this.aShortArray95[local610] = local763;
				this.aShortArray93[local610] = local606;
				if (this.anInt4836 < local606) {
					this.anInt4836 = local606;
				}
			}
		}
		local14.anInt6145 = local186;
		this.anInt4836++;
		for (local616 = 0; local616 < this.anInt4827; local616++) {
			this.aByteArray96[local616] = 0;
			this.aShortArray94[local616] = (short) local14.method5312();
			this.aShortArray89[local616] = (short) local14.method5312();
			this.aShortArray88[local616] = (short) local14.method5312();
		}
		if (this.aByteArray92 != null) {
			@Pc(863) boolean local863 = false;
			for (@Pc(865) int local865 = 0; local865 < this.anInt4839; local865++) {
				@Pc(874) int local874 = this.aByteArray92[local865] & 0xFF;
				if (local874 != 255) {
					if ((this.aShortArray94[local874] & 0xFFFF) == this.aShortArray92[local865] && this.aShortArray95[local865] == (this.aShortArray89[local874] & 0xFFFF) && this.aShortArray93[local865] == (this.aShortArray88[local874] & 0xFFFF)) {
						this.aByteArray92[local865] = -1;
					} else {
						local863 = true;
					}
				}
			}
			if (!local863) {
				this.aByteArray92 = null;
			}
		}
		if (!local7) {
			this.aByteArray88 = null;
		}
		if (!local9) {
			this.aShortArray85 = null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBI)V")
	public void method4264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4844; local3++) {
			this.anIntArray935[local3] += arg2;
			this.anIntArray938[local3] += arg0;
			this.anIntArray934[local3] += arg1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(IIII)V")
	public void method4265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg0 != 0) {
			local10 = Class177.anIntArray843[arg0];
			local14 = Class177.anIntArray844[arg0];
			for (local16 = 0; local16 < this.anInt4844; local16++) {
				local34 = local14 * this.anIntArray935[local16] + this.anIntArray938[local16] * local10 >> 15;
				this.anIntArray938[local16] = local14 * this.anIntArray938[local16] - local10 * this.anIntArray935[local16] >> 15;
				this.anIntArray935[local16] = local34;
			}
		}
		if (arg2 != 0) {
			local10 = Class177.anIntArray843[arg2];
			local14 = Class177.anIntArray844[arg2];
			for (local16 = 0; local16 < this.anInt4844; local16++) {
				local34 = local14 * this.anIntArray938[local16] - this.anIntArray934[local16] * local10 >> 15;
				this.anIntArray934[local16] = this.anIntArray938[local16] * local10 + local14 * this.anIntArray934[local16] >> 15;
				this.anIntArray938[local16] = local34;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local10 = Class177.anIntArray843[arg1];
		local14 = Class177.anIntArray844[arg1];
		for (local16 = 0; local16 < this.anInt4844; local16++) {
			local34 = this.anIntArray935[local16] * local14 + local10 * this.anIntArray934[local16] >> 15;
			this.anIntArray934[local16] = this.anIntArray934[local16] * local14 - this.anIntArray935[local16] * local10 >> 15;
			this.anIntArray935[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(SSZ)V")
	public void method4266(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4839; local7++) {
			if (this.aShortArray87[local7] == arg1) {
				this.aShortArray87[local7] = arg0;
			}
		}
	}
}
