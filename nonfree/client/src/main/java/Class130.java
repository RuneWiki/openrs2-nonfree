import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class130 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "[I")
	public int[] anIntArray293;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "[Lclient!tn;")
	public Class218[] aClass218Array1;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "[Lclient!gp;")
	public Class88[] aClass88Array1;

	@OriginalMember(owner = "client!kp", name = "D", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!kp", name = "G", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!kp", name = "H", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!kp", name = "K", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!kp", name = "L", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!kp", name = "M", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!kp", name = "O", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!kp", name = "P", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!kp", name = "Q", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!kp", name = "R", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!kp", name = "S", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!kp", name = "T", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!kp", name = "V", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!kp", name = "X", descriptor = "[I")
	public int[] anIntArray296;

	@OriginalMember(owner = "client!kp", name = "ab", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
	public int anInt3908 = 0;

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
	public int anInt3909 = 0;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
	public int anInt3905 = 0;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "B")
	public byte aByte31 = 0;

	@OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
	public int anInt3913 = 0;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "([B)V")
	public Class130(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3409(arg0);
		} else {
			this.method3420(arg0);
		}
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(III)V")
	public Class130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray50 = new short[arg1];
		this.aShortArray52 = new short[arg1];
		this.anIntArray295 = new int[arg0];
		this.anIntArray297 = new int[arg0];
		this.aShortArray45 = new short[arg1];
		this.anIntArray296 = new int[arg1];
		this.aShortArray42 = new short[arg1];
		this.aByteArray50 = new byte[arg1];
		this.aByteArray48 = new byte[arg1];
		if (arg2 > 0) {
			this.aShortArray47 = new short[arg2];
			this.aByteArray54 = new byte[arg2];
			this.aByteArray53 = new byte[arg2];
			this.aShortArray51 = new short[arg2];
			this.aByteArray56 = new byte[arg2];
			this.aByteArray55 = new byte[arg2];
			this.aShortArray53 = new short[arg2];
			this.aShortArray49 = new short[arg2];
			this.aShortArray48 = new short[arg2];
			this.aByteArray47 = new byte[arg2];
			this.aShortArray44 = new short[arg2];
			this.aByteArray51 = new byte[arg2];
		}
		this.aShortArray41 = new short[arg1];
		this.anIntArray294 = new int[arg0];
		this.anIntArray293 = new int[arg0];
		this.aByteArray49 = new byte[arg1];
		this.aByteArray52 = new byte[arg1];
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "([Lclient!kp;I)V")
	public Class130(@OriginalArg(0) Class130[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3909 = 0;
		this.anInt3905 = 0;
		this.anInt3908 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) boolean local43 = false;
		this.aByte31 = -1;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class130 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt3909 += local54.anInt3909;
				this.anInt3905 += local54.anInt3905;
				this.anInt3908 += local54.anInt3908;
				local33 |= local54.aByteArray49 != null;
				if (local54.aClass88Array1 != null) {
					local31 += local54.aClass88Array1.length;
				}
				if (local54.aClass218Array1 != null) {
					local29 += local54.aClass218Array1.length;
				}
				local41 |= local54.aShortArray42 != null;
				local37 |= local54.aByteArray48 != null;
				if (local54.aByteArray50 == null) {
					if (this.aByte31 == -1) {
						this.aByte31 = local54.aByte31;
					}
					if (local54.aByte31 != this.aByte31) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local39 |= local54.aByteArray52 != null;
				local43 |= local54.anIntArray296 != null;
			}
		}
		if (local37) {
			this.aByteArray48 = new byte[this.anInt3909];
		}
		this.aShortArray46 = new short[this.anInt3909];
		if (local33) {
			this.aByteArray49 = new byte[this.anInt3909];
		}
		this.anIntArray295 = new int[this.anInt3905];
		if (local41) {
			this.aShortArray42 = new short[this.anInt3909];
		}
		if (local35) {
			this.aByteArray50 = new byte[this.anInt3909];
		}
		this.aShortArray50 = new short[this.anInt3909];
		this.aShortArray52 = new short[this.anInt3909];
		this.anIntArray293 = new int[this.anInt3905];
		this.anIntArray297 = new int[this.anInt3905];
		if (local31 > 0) {
			this.aClass88Array1 = new Class88[local31];
		}
		this.anIntArray294 = new int[this.anInt3905];
		this.aShortArray45 = new short[this.anInt3909];
		if (local39) {
			this.aByteArray52 = new byte[this.anInt3909];
		}
		if (local29 > 0) {
			this.aClass218Array1 = new Class218[local29];
		}
		this.aShortArray43 = new short[this.anInt3905];
		if (local43) {
			this.anIntArray296 = new int[this.anInt3909];
		}
		this.aShortArray41 = new short[this.anInt3909];
		if (this.anInt3908 > 0) {
			this.aByteArray47 = new byte[this.anInt3908];
			this.aShortArray53 = new short[this.anInt3908];
			this.aShortArray44 = new short[this.anInt3908];
			this.aShortArray51 = new short[this.anInt3908];
			this.aByteArray53 = new byte[this.anInt3908];
			this.aShortArray48 = new short[this.anInt3908];
			this.aByteArray54 = new byte[this.anInt3908];
			this.aByteArray55 = new byte[this.anInt3908];
			this.aByteArray51 = new byte[this.anInt3908];
			this.aShortArray49 = new short[this.anInt3908];
			this.aByteArray56 = new byte[this.anInt3908];
			this.aShortArray47 = new short[this.anInt3908];
		}
		local31 = 0;
		local29 = 0;
		this.anInt3905 = 0;
		this.anInt3909 = 0;
		this.anInt3908 = 0;
		@Pc(563) int local563;
		@Pc(574) int local574;
		for (@Pc(358) int local358 = 0; local358 < arg1; local358++) {
			@Pc(365) short local365 = (short) (0x1 << local358);
			@Pc(369) Class130 local369 = arg0[local358];
			if (local369 != null) {
				for (@Pc(373) int local373 = 0; local373 < local369.anInt3909; local373++) {
					if (local33 && local369.aByteArray49 != null) {
						this.aByteArray49[this.anInt3909] = local369.aByteArray49[local373];
					}
					if (local35) {
						if (local369.aByteArray50 == null) {
							this.aByteArray50[this.anInt3909] = local369.aByte31;
						} else {
							this.aByteArray50[this.anInt3909] = local369.aByteArray50[local373];
						}
					}
					if (local37 && local369.aByteArray48 != null) {
						this.aByteArray48[this.anInt3909] = local369.aByteArray48[local373];
					}
					if (local41) {
						if (local369.aShortArray42 == null) {
							this.aShortArray42[this.anInt3909] = -1;
						} else {
							this.aShortArray42[this.anInt3909] = local369.aShortArray42[local373];
						}
					}
					if (local43) {
						if (local369.anIntArray296 == null) {
							this.anIntArray296[this.anInt3909] = -1;
						} else {
							this.anIntArray296[this.anInt3909] = local369.anIntArray296[local373];
						}
					}
					this.aShortArray52[this.anInt3909] = (short) this.method3417(local369.aShortArray52[local373], local369, local365);
					this.aShortArray41[this.anInt3909] = (short) this.method3417(local369.aShortArray41[local373], local369, local365);
					this.aShortArray50[this.anInt3909] = (short) this.method3417(local369.aShortArray50[local373], local369, local365);
					this.aShortArray46[this.anInt3909] = local365;
					this.aShortArray45[this.anInt3909] = local369.aShortArray45[local373];
					this.anInt3909++;
				}
				@Pc(550) int local550;
				if (local369.aClass218Array1 != null) {
					for (local550 = 0; local550 < local369.aClass218Array1.length; local550++) {
						local563 = this.method3417(local369.aClass218Array1[local550].anInt6292, local369, local365);
						local574 = this.method3417(local369.aClass218Array1[local550].anInt6281, local369, local365);
						@Pc(585) int local585 = this.method3417(local369.aClass218Array1[local550].anInt6293, local369, local365);
						this.aClass218Array1[local29] = new Class218(local369.aClass218Array1[local550].anInt6291, local563, local574, local585, local369.aClass218Array1[local550].aByte67);
						local29++;
					}
				}
				if (local369.aClass88Array1 != null) {
					for (local550 = 0; local550 < local369.aClass88Array1.length; local550++) {
						local563 = this.method3417(local369.aClass88Array1[local550].anInt2639, local369, local365);
						this.aClass88Array1[local31] = new Class88(local369.aClass88Array1[local550].anInt2638, local563);
						local31++;
					}
				}
			}
		}
		@Pc(660) int local660 = 0;
		this.anInt3913 = this.anInt3905;
		for (@Pc(666) int local666 = 0; local666 < arg1; local666++) {
			@Pc(673) short local673 = (short) (0x1 << local666);
			@Pc(677) Class130 local677 = arg0[local666];
			if (local677 != null) {
				for (local563 = 0; local563 < local677.anInt3909; local563++) {
					if (local39) {
						this.aByteArray52[local660++] = (byte) (local677.aByteArray52 == null || local677.aByteArray52[local563] == -1 ? -1 : this.anInt3908 + local677.aByteArray52[local563]);
					}
				}
				for (local574 = 0; local574 < local677.anInt3908; local574++) {
					@Pc(733) byte local733 = this.aByteArray56[this.anInt3908] = local677.aByteArray56[local574];
					if (local733 == 0) {
						this.aShortArray53[this.anInt3908] = (short) this.method3417(local677.aShortArray53[local574], local677, local673);
						this.aShortArray47[this.anInt3908] = (short) this.method3417(local677.aShortArray47[local574], local677, local673);
						this.aShortArray44[this.anInt3908] = (short) this.method3417(local677.aShortArray44[local574], local677, local673);
					}
					if (local733 >= 1 && local733 <= 3) {
						this.aShortArray53[this.anInt3908] = local677.aShortArray53[local574];
						this.aShortArray47[this.anInt3908] = local677.aShortArray47[local574];
						this.aShortArray44[this.anInt3908] = local677.aShortArray44[local574];
						this.aShortArray48[this.anInt3908] = local677.aShortArray48[local574];
						this.aShortArray51[this.anInt3908] = local677.aShortArray51[local574];
						this.aShortArray49[this.anInt3908] = local677.aShortArray49[local574];
						this.aByteArray47[this.anInt3908] = local677.aByteArray47[local574];
						this.aByteArray53[this.anInt3908] = local677.aByteArray53[local574];
						this.aByteArray51[this.anInt3908] = local677.aByteArray51[local574];
					}
					if (local733 == 2) {
						this.aByteArray54[this.anInt3908] = local677.aByteArray54[local574];
						this.aByteArray55[this.anInt3908] = local677.aByteArray55[local574];
					}
					this.anInt3908++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)[[I")
	public int[][] method3407() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3913; local17++) {
			@Pc(24) int local24 = this.anIntArray297[local17];
			if (local24 >= 0) {
				@Pc(33) int local33 = local13[local24]++;
				if (local24 > local15) {
					local15 = local24;
				}
			}
		}
		@Pc(51) int[][] local51 = new int[local15 + 1][];
		for (@Pc(53) int local53 = 0; local53 <= local15; local53++) {
			local51[local53] = new int[local13[local53]];
			local13[local53] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt3913; local72++) {
			@Pc(79) int local79 = this.anIntArray297[local72];
			if (local79 >= 0) {
				local51[local79][local13[local79]++] = local72;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBIBSIISB)I")
	public int method3408(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) short arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray52[this.anInt3909] = (short) arg1;
		this.aShortArray41[this.anInt3909] = (short) arg4;
		this.aShortArray50[this.anInt3909] = (short) arg5;
		this.aByteArray49[this.anInt3909] = arg7;
		this.aByteArray52[this.anInt3909] = arg0;
		this.aShortArray45[this.anInt3909] = arg6;
		this.aByteArray48[this.anInt3909] = arg2;
		this.aShortArray42[this.anInt3909] = arg3;
		return this.anInt3909++;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[B)V")
	private void method3409(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub24 local10 = new Class2_Sub24(arg0);
		@Pc(15) Class2_Sub24 local15 = new Class2_Sub24(arg0);
		@Pc(20) Class2_Sub24 local20 = new Class2_Sub24(arg0);
		@Pc(25) Class2_Sub24 local25 = new Class2_Sub24(arg0);
		@Pc(30) Class2_Sub24 local30 = new Class2_Sub24(arg0);
		@Pc(35) Class2_Sub24 local35 = new Class2_Sub24(arg0);
		@Pc(40) Class2_Sub24 local40 = new Class2_Sub24(arg0);
		local10.anInt6669 = arg0.length - 23;
		this.anInt3905 = local10.method5753();
		this.anInt3909 = local10.method5753();
		this.anInt3908 = local10.method5732();
		@Pc(65) int local65 = local10.method5732();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(89) int local89 = local10.method5732();
		@Pc(93) int local93 = local10.method5732();
		@Pc(97) int local97 = local10.method5732();
		@Pc(101) int local101 = local10.method5732();
		@Pc(105) int local105 = local10.method5732();
		@Pc(109) int local109 = local10.method5753();
		@Pc(113) int local113 = local10.method5753();
		@Pc(117) int local117 = local10.method5753();
		@Pc(121) int local121 = local10.method5753();
		@Pc(125) int local125 = local10.method5753();
		@Pc(127) int local127 = 0;
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(147) int local147;
		if (this.anInt3908 > 0) {
			this.aByteArray56 = new byte[this.anInt3908];
			local10.anInt6669 = 0;
			for (local147 = 0; local147 < this.anInt3908; local147++) {
				@Pc(158) byte local158 = this.aByteArray56[local147] = local10.method5759();
				if (local158 >= 1 && local158 <= 3) {
					local129++;
				}
				if (local158 == 0) {
					local127++;
				}
				if (local158 == 2) {
					local131++;
				}
			}
		}
		local147 = this.anInt3908;
		@Pc(186) int local186 = local147;
		local147 += this.anInt3905;
		@Pc(193) int local193 = local147;
		if (local76) {
			local147 += this.anInt3909;
		}
		@Pc(202) int local202 = local147;
		local147 += this.anInt3909;
		@Pc(209) int local209 = local147;
		if (local89 == 255) {
			local147 += this.anInt3909;
		}
		@Pc(221) int local221 = local147;
		if (local97 == 1) {
			local147 += this.anInt3909;
		}
		@Pc(233) int local233 = local147;
		if (local105 == 1) {
			local147 += this.anInt3905;
		}
		@Pc(243) int local243 = local147;
		if (local93 == 1) {
			local147 += this.anInt3909;
		}
		@Pc(253) int local253 = local147;
		local147 += local121;
		@Pc(265) int local265 = local147;
		if (local101 == 1) {
			local147 += this.anInt3909 * 2;
		}
		@Pc(277) int local277 = local147;
		local147 += local125;
		@Pc(283) int local283 = local147;
		local147 += this.anInt3909 * 2;
		@Pc(292) int local292 = local147;
		local147 += local109;
		@Pc(298) int local298 = local147;
		local147 += local113;
		@Pc(304) int local304 = local147;
		local147 += local117;
		@Pc(310) int local310 = local147;
		local147 += local127 * 6;
		@Pc(318) int local318 = local147;
		local147 += local129 * 6;
		@Pc(326) int local326 = local147;
		local147 += local129 * 6;
		@Pc(334) int local334 = local147;
		local147 += local129;
		@Pc(340) int local340 = local147;
		local147 += local129;
		@Pc(346) int local346 = local147;
		local147 += local129 + local131 * 2;
		if (local101 == 1) {
			this.aShortArray42 = new short[this.anInt3909];
		}
		if (this.anInt3908 > 0) {
			this.aShortArray44 = new short[this.anInt3908];
			this.aShortArray47 = new short[this.anInt3908];
			if (local131 > 0) {
				this.aByteArray54 = new byte[local131];
				this.aByteArray55 = new byte[local131];
			}
			if (local129 > 0) {
				this.aShortArray51 = new short[local129];
				this.aShortArray48 = new short[local129];
				this.aShortArray49 = new short[local129];
				this.aByteArray53 = new byte[local129];
				this.aByteArray51 = new byte[local129];
				this.aByteArray47 = new byte[local129];
			}
			this.aShortArray53 = new short[this.anInt3908];
		}
		if (local93 == 1) {
			this.aByteArray48 = new byte[this.anInt3909];
		}
		this.aShortArray52 = new short[this.anInt3909];
		if (local76) {
			this.aByteArray49 = new byte[this.anInt3909];
		}
		this.anIntArray295 = new int[this.anInt3905];
		if (local97 == 1) {
			this.anIntArray296 = new int[this.anInt3909];
		}
		this.aShortArray45 = new short[this.anInt3909];
		if (local89 == 255) {
			this.aByteArray50 = new byte[this.anInt3909];
		} else {
			this.aByte31 = (byte) local89;
		}
		local10.anInt6669 = local186;
		if (local101 == 1 && this.anInt3908 > 0) {
			this.aByteArray52 = new byte[this.anInt3909];
		}
		if (local105 == 1) {
			this.anIntArray297 = new int[this.anInt3905];
		}
		this.aShortArray50 = new short[this.anInt3909];
		this.aShortArray41 = new short[this.anInt3909];
		this.anIntArray293 = new int[this.anInt3905];
		this.anIntArray294 = new int[this.anInt3905];
		local15.anInt6669 = local292;
		local20.anInt6669 = local298;
		local25.anInt6669 = local304;
		local30.anInt6669 = local233;
		@Pc(538) int local538 = 0;
		@Pc(540) int local540 = 0;
		@Pc(542) int local542 = 0;
		@Pc(550) int local550;
		for (@Pc(544) int local544 = 0; local544 < this.anInt3905; local544++) {
			local550 = local10.method5732();
			@Pc(552) int local552 = 0;
			if ((local550 & 0x1) != 0) {
				local552 = local15.method5768();
			}
			@Pc(567) int local567 = 0;
			if ((local550 & 0x2) != 0) {
				local567 = local20.method5768();
			}
			@Pc(577) int local577 = 0;
			if ((local550 & 0x4) != 0) {
				local577 = local25.method5768();
			}
			this.anIntArray294[local544] = local552 + local538;
			this.anIntArray295[local544] = local540 + local567;
			this.anIntArray293[local544] = local542 + local577;
			local540 = this.anIntArray295[local544];
			local542 = this.anIntArray293[local544];
			local538 = this.anIntArray294[local544];
			if (local105 == 1) {
				this.anIntArray297[local544] = local30.method5732();
			}
		}
		local10.anInt6669 = local283;
		local15.anInt6669 = local193;
		local20.anInt6669 = local209;
		local25.anInt6669 = local243;
		local30.anInt6669 = local221;
		local35.anInt6669 = local265;
		local40.anInt6669 = local277;
		for (local550 = 0; local550 < this.anInt3909; local550++) {
			this.aShortArray45[local550] = (short) local10.method5753();
			if (local76) {
				this.aByteArray49[local550] = local15.method5759();
			}
			if (local89 == 255) {
				this.aByteArray50[local550] = local20.method5759();
			}
			if (local93 == 1) {
				this.aByteArray48[local550] = local25.method5759();
			}
			if (local97 == 1) {
				this.anIntArray296[local550] = local30.method5732();
			}
			if (local101 == 1) {
				this.aShortArray42[local550] = (short) (local35.method5753() - 1);
			}
			if (this.aByteArray52 != null) {
				if (this.aShortArray42[local550] == -1) {
					this.aByteArray52[local550] = -1;
				} else {
					this.aByteArray52[local550] = (byte) (local40.method5732() - 1);
				}
			}
		}
		this.anInt3913 = -1;
		local10.anInt6669 = local253;
		local15.anInt6669 = local202;
		@Pc(782) short local782 = 0;
		@Pc(784) short local784 = 0;
		@Pc(786) short local786 = 0;
		@Pc(788) short local788 = 0;
		@Pc(796) int local796;
		for (@Pc(790) int local790 = 0; local790 < this.anInt3909; local790++) {
			local796 = local15.method5732();
			if (local796 == 1) {
				local782 = (short) (local10.method5768() + local788);
				local784 = (short) (local782 + local10.method5768());
				local786 = (short) (local784 + local10.method5768());
				local788 = local786;
				this.aShortArray52[local790] = local782;
				this.aShortArray41[local790] = local784;
				this.aShortArray50[local790] = local786;
				if (local782 > this.anInt3913) {
					this.anInt3913 = local782;
				}
				if (this.anInt3913 < local784) {
					this.anInt3913 = local784;
				}
				if (this.anInt3913 < local786) {
					this.anInt3913 = local786;
				}
			}
			if (local796 == 2) {
				local784 = local786;
				local786 = (short) (local10.method5768() + local788);
				local788 = local786;
				this.aShortArray52[local790] = local782;
				this.aShortArray41[local790] = local784;
				this.aShortArray50[local790] = local786;
				if (local786 > this.anInt3913) {
					this.anInt3913 = local786;
				}
			}
			if (local796 == 3) {
				local782 = local786;
				local786 = (short) (local788 + local10.method5768());
				local788 = local786;
				this.aShortArray52[local790] = local782;
				this.aShortArray41[local790] = local784;
				this.aShortArray50[local790] = local786;
				if (local786 > this.anInt3913) {
					this.anInt3913 = local786;
				}
			}
			if (local796 == 4) {
				@Pc(951) short local951 = local782;
				local782 = local784;
				local784 = local951;
				local786 = (short) (local788 + local10.method5768());
				local788 = local786;
				this.aShortArray52[local790] = local782;
				this.aShortArray41[local790] = local951;
				this.aShortArray50[local790] = local786;
				if (local786 > this.anInt3913) {
					this.anInt3913 = local786;
				}
			}
		}
		local10.anInt6669 = local310;
		this.anInt3913++;
		local15.anInt6669 = local318;
		local20.anInt6669 = local326;
		local25.anInt6669 = local334;
		local30.anInt6669 = local340;
		local35.anInt6669 = local346;
		@Pc(1030) int local1030;
		for (local796 = 0; local796 < this.anInt3908; local796++) {
			local1030 = this.aByteArray56[local796] & 0xFF;
			if (local1030 == 0) {
				this.aShortArray53[local796] = (short) local10.method5753();
				this.aShortArray47[local796] = (short) local10.method5753();
				this.aShortArray44[local796] = (short) local10.method5753();
			}
			if (local1030 == 1) {
				this.aShortArray53[local796] = (short) local15.method5753();
				this.aShortArray47[local796] = (short) local15.method5753();
				this.aShortArray44[local796] = (short) local15.method5753();
				this.aShortArray48[local796] = (short) local20.method5753();
				this.aShortArray51[local796] = (short) local20.method5753();
				this.aShortArray49[local796] = (short) local20.method5753();
				this.aByteArray47[local796] = local25.method5759();
				this.aByteArray53[local796] = local30.method5759();
				this.aByteArray51[local796] = local35.method5759();
			}
			if (local1030 == 2) {
				this.aShortArray53[local796] = (short) local15.method5753();
				this.aShortArray47[local796] = (short) local15.method5753();
				this.aShortArray44[local796] = (short) local15.method5753();
				this.aShortArray48[local796] = (short) local20.method5753();
				this.aShortArray51[local796] = (short) local20.method5753();
				this.aShortArray49[local796] = (short) local20.method5753();
				this.aByteArray47[local796] = local25.method5759();
				this.aByteArray53[local796] = local30.method5759();
				this.aByteArray51[local796] = local35.method5759();
				this.aByteArray54[local796] = local35.method5759();
				this.aByteArray55[local796] = local35.method5759();
			}
			if (local1030 == 3) {
				this.aShortArray53[local796] = (short) local15.method5753();
				this.aShortArray47[local796] = (short) local15.method5753();
				this.aShortArray44[local796] = (short) local15.method5753();
				this.aShortArray48[local796] = (short) local20.method5753();
				this.aShortArray51[local796] = (short) local20.method5753();
				this.aShortArray49[local796] = (short) local20.method5753();
				this.aByteArray47[local796] = local25.method5759();
				this.aByteArray53[local796] = local30.method5759();
				this.aByteArray51[local796] = local35.method5759();
			}
		}
		if (!local85) {
			return;
		}
		local10.anInt6669 = local147;
		local1030 = local10.method5732();
		@Pc(1324) int local1324;
		@Pc(1332) int local1332;
		if (local1030 > 0) {
			this.aClass218Array1 = new Class218[local1030];
			for (local1324 = 0; local1324 < local1030; local1324++) {
				local1332 = local10.method5753();
				@Pc(1336) int local1336 = local10.method5753();
				@Pc(1342) byte local1342;
				if (local89 == 255) {
					local1342 = this.aByteArray50[local1336];
				} else {
					local1342 = (byte) local89;
				}
				this.aClass218Array1[local1324] = new Class218(local1332, this.aShortArray52[local1336], this.aShortArray41[local1336], this.aShortArray50[local1336], local1342);
			}
		}
		local1324 = local10.method5732();
		if (local1324 <= 0) {
			return;
		}
		this.aClass88Array1 = new Class88[local1324];
		for (local1332 = 0; local1332 < local1324; local1332++) {
			this.aClass88Array1[local1332] = new Class88(local10.method5753(), local10.method5753());
		}
		return;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)I")
	public int method3410(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3905; local7++) {
			if (arg0 == this.anIntArray294[local7] && arg1 == this.anIntArray295[local7] && arg2 == this.anIntArray293[local7]) {
				return local7;
			}
		}
		this.anIntArray294[this.anInt3905] = arg0;
		this.anIntArray295[this.anInt3905] = arg1;
		this.anIntArray293[this.anInt3905] = arg2;
		this.anInt3913 = this.anInt3905 + 1;
		return this.anInt3905++;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(SIS)V")
	public void method3411(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt3909; local15++) {
			if (this.aShortArray45[local15] == arg0) {
				this.aShortArray45[local15] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZIII)V")
	public void method3412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3905; local7++) {
			this.anIntArray294[local7] += arg1;
			this.anIntArray295[local7] += arg2;
			this.anIntArray293[local7] += arg0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)[[I")
	public int[][] method3414() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3909; local12++) {
			@Pc(19) int local19 = this.anIntArray296[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(34) int local34 = local8[local19]++;
			}
		}
		@Pc(51) int[][] local51 = new int[local10 + 1][];
		for (@Pc(53) int local53 = 0; local53 <= local10; local53++) {
			local51[local53] = new int[local8[local53]];
			local8[local53] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt3909; local72++) {
			@Pc(79) int local79 = this.anIntArray296[local72];
			if (local79 >= 0) {
				local51[local79][local8[local79]++] = local72;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(IIII)V")
	public void method3415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg2 != 0) {
			local10 = Class106.anIntArray240[arg2];
			local14 = Class106.anIntArray242[arg2];
			for (local16 = 0; local16 < this.anInt3905; local16++) {
				local34 = local14 * this.anIntArray294[local16] + this.anIntArray295[local16] * local10 >> 15;
				this.anIntArray295[local16] = local14 * this.anIntArray295[local16] - this.anIntArray294[local16] * local10 >> 15;
				this.anIntArray294[local16] = local34;
			}
		}
		if (arg0 != 0) {
			local10 = Class106.anIntArray240[arg0];
			local14 = Class106.anIntArray242[arg0];
			for (local16 = 0; local16 < this.anInt3905; local16++) {
				local34 = this.anIntArray295[local16] * local14 - this.anIntArray293[local16] * local10 >> 15;
				this.anIntArray293[local16] = local14 * this.anIntArray293[local16] + local10 * this.anIntArray295[local16] >> 15;
				this.anIntArray295[local16] = local34;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local10 = Class106.anIntArray240[arg1];
		local14 = Class106.anIntArray242[arg1];
		for (local16 = 0; local16 < this.anInt3905; local16++) {
			local34 = local10 * this.anIntArray293[local16] + this.anIntArray294[local16] * local14 >> 15;
			this.anIntArray293[local16] = local14 * this.anIntArray293[local16] - local10 * this.anIntArray294[local16] >> 15;
			this.anIntArray294[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!kp;SI)I")
	private int method3417(@OriginalArg(0) int arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray294[arg0];
		@Pc(15) int local15 = arg1.anIntArray295[arg0];
		@Pc(20) int local20 = arg1.anIntArray293[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3905; local22++) {
			if (this.anIntArray294[local22] == local10 && local15 == this.anIntArray295[local22] && local20 == this.anIntArray293[local22]) {
				this.aShortArray43[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray294[this.anInt3905] = local10;
		this.anIntArray295[this.anInt3905] = local15;
		this.anIntArray293[this.anInt3905] = local20;
		this.aShortArray43[this.anInt3905] = arg2;
		this.anIntArray297[this.anInt3905] = arg1.anIntArray297 == null ? -1 : arg1.anIntArray297[arg0];
		return this.anInt3905++;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(SSBBBSSZSS)B")
	public byte method3418() {
		if (this.anInt3908 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray56[this.anInt3908] = 3;
		this.aShortArray53[this.anInt3908] = 0;
		this.aShortArray47[this.anInt3908] = 32767;
		this.aShortArray44[this.anInt3908] = 0;
		this.aShortArray48[this.anInt3908] = 1024;
		this.aShortArray51[this.anInt3908] = 1024;
		this.aShortArray49[this.anInt3908] = 1024;
		this.aByteArray47[this.anInt3908] = 0;
		this.aByteArray53[this.anInt3908] = 0;
		this.aByteArray51[this.anInt3908] = 0;
		return (byte) this.anInt3908++;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZSS)V")
	public void method3419(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray42 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt3909; local17++) {
			if (this.aShortArray42[local17] == arg0) {
				this.aShortArray42[local17] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I[B)V")
	private void method3420(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub24 local14 = new Class2_Sub24(arg0);
		@Pc(19) Class2_Sub24 local19 = new Class2_Sub24(arg0);
		@Pc(24) Class2_Sub24 local24 = new Class2_Sub24(arg0);
		@Pc(29) Class2_Sub24 local29 = new Class2_Sub24(arg0);
		@Pc(34) Class2_Sub24 local34 = new Class2_Sub24(arg0);
		local14.anInt6669 = arg0.length - 18;
		this.anInt3905 = local14.method5753();
		this.anInt3909 = local14.method5753();
		this.anInt3908 = local14.method5732();
		@Pc(59) int local59 = local14.method5732();
		@Pc(63) int local63 = local14.method5732();
		@Pc(67) int local67 = local14.method5732();
		@Pc(71) int local71 = local14.method5732();
		@Pc(75) int local75 = local14.method5732();
		@Pc(79) int local79 = local14.method5753();
		@Pc(83) int local83 = local14.method5753();
		@Pc(87) int local87 = local14.method5753();
		@Pc(91) int local91 = local14.method5753();
		@Pc(100) int local100 = this.anInt3905;
		@Pc(102) int local102 = local100;
		local100 += this.anInt3909;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt3909;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt3909;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt3909;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt3905;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt3909;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt3909 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt3908 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		this.aShortArray41 = new short[this.anInt3909];
		this.anIntArray295 = new int[this.anInt3905];
		this.aShortArray52 = new short[this.anInt3909];
		if (local71 == 1) {
			this.anIntArray296 = new int[this.anInt3909];
		}
		this.anIntArray293 = new int[this.anInt3905];
		local14.anInt6669 = 0;
		this.aShortArray45 = new short[this.anInt3909];
		if (local63 == 255) {
			this.aByteArray50 = new byte[this.anInt3909];
		} else {
			this.aByte31 = (byte) local63;
		}
		this.aShortArray50 = new short[this.anInt3909];
		if (local59 == 1) {
			this.aByteArray52 = new byte[this.anInt3909];
			this.aByteArray49 = new byte[this.anInt3909];
			this.aShortArray42 = new short[this.anInt3909];
		}
		if (local75 == 1) {
			this.anIntArray297 = new int[this.anInt3905];
		}
		if (this.anInt3908 > 0) {
			this.aShortArray44 = new short[this.anInt3908];
			this.aShortArray53 = new short[this.anInt3908];
			this.aShortArray47 = new short[this.anInt3908];
			this.aByteArray56 = new byte[this.anInt3908];
		}
		this.anIntArray294 = new int[this.anInt3905];
		if (local67 == 1) {
			this.aByteArray48 = new byte[this.anInt3909];
		}
		local19.anInt6669 = local189;
		local24.anInt6669 = local195;
		local29.anInt6669 = local100;
		local34.anInt6669 = local143;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		@Pc(344) int local344 = 0;
		@Pc(352) int local352;
		@Pc(354) int local354;
		for (@Pc(346) int local346 = 0; local346 < this.anInt3905; local346++) {
			local352 = local14.method5732();
			local354 = 0;
			if ((local352 & 0x1) != 0) {
				local354 = local19.method5768();
			}
			@Pc(364) int local364 = 0;
			if ((local352 & 0x2) != 0) {
				local364 = local24.method5768();
			}
			@Pc(374) int local374 = 0;
			if ((local352 & 0x4) != 0) {
				local374 = local29.method5768();
			}
			this.anIntArray294[local346] = local340 + local354;
			this.anIntArray295[local346] = local364 + local342;
			this.anIntArray293[local346] = local374 + local344;
			local342 = this.anIntArray295[local346];
			local344 = this.anIntArray293[local346];
			local340 = this.anIntArray294[local346];
			if (local75 == 1) {
				this.anIntArray297[local346] = local34.method5732();
			}
		}
		local14.anInt6669 = local171;
		local19.anInt6669 = local131;
		local24.anInt6669 = local109;
		local29.anInt6669 = local153;
		local34.anInt6669 = local119;
		for (local352 = 0; local352 < this.anInt3909; local352++) {
			this.aShortArray45[local352] = (short) local14.method5753();
			if (local59 == 1) {
				local354 = local19.method5732();
				if ((local354 & 0x1) == 1) {
					local7 = true;
					this.aByteArray49[local352] = 1;
				} else {
					this.aByteArray49[local352] = 0;
				}
				if ((local354 & 0x2) == 2) {
					this.aByteArray52[local352] = (byte) (local354 >> 2);
					this.aShortArray42[local352] = this.aShortArray45[local352];
					this.aShortArray45[local352] = 127;
					if (this.aShortArray42[local352] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray52[local352] = -1;
					this.aShortArray42[local352] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray50[local352] = local24.method5759();
			}
			if (local67 == 1) {
				this.aByteArray48[local352] = local29.method5759();
			}
			if (local71 == 1) {
				this.anIntArray296[local352] = local34.method5732();
			}
		}
		local14.anInt6669 = local165;
		this.anInt3913 = -1;
		local19.anInt6669 = local102;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(615) int local615;
		for (@Pc(609) int local609 = 0; local609 < this.anInt3909; local609++) {
			local615 = local19.method5732();
			if (local615 == 1) {
				local601 = (short) (local607 + local14.method5768());
				local603 = (short) (local14.method5768() + local601);
				local605 = (short) (local14.method5768() + local603);
				local607 = local605;
				this.aShortArray52[local609] = local601;
				this.aShortArray41[local609] = local603;
				this.aShortArray50[local609] = local605;
				if (this.anInt3913 < local601) {
					this.anInt3913 = local601;
				}
				if (local603 > this.anInt3913) {
					this.anInt3913 = local603;
				}
				if (this.anInt3913 < local605) {
					this.anInt3913 = local605;
				}
			}
			if (local615 == 2) {
				local603 = local605;
				local605 = (short) (local14.method5768() + local607);
				local607 = local605;
				this.aShortArray52[local609] = local601;
				this.aShortArray41[local609] = local603;
				this.aShortArray50[local609] = local605;
				if (this.anInt3913 < local605) {
					this.anInt3913 = local605;
				}
			}
			if (local615 == 3) {
				local601 = local605;
				local605 = (short) (local607 + local14.method5768());
				this.aShortArray52[local609] = local601;
				local607 = local605;
				this.aShortArray41[local609] = local603;
				this.aShortArray50[local609] = local605;
				if (local605 > this.anInt3913) {
					this.anInt3913 = local605;
				}
			}
			if (local615 == 4) {
				@Pc(776) short local776 = local601;
				local601 = local603;
				local605 = (short) (local607 + local14.method5768());
				local603 = local776;
				this.aShortArray52[local609] = local601;
				local607 = local605;
				this.aShortArray41[local609] = local776;
				this.aShortArray50[local609] = local605;
				if (local605 > this.anInt3913) {
					this.anInt3913 = local605;
				}
			}
		}
		local14.anInt6669 = local180;
		this.anInt3913++;
		for (local615 = 0; local615 < this.anInt3908; local615++) {
			this.aByteArray56[local615] = 0;
			this.aShortArray53[local615] = (short) local14.method5753();
			this.aShortArray47[local615] = (short) local14.method5753();
			this.aShortArray44[local615] = (short) local14.method5753();
		}
		if (this.aByteArray52 != null) {
			@Pc(886) boolean local886 = false;
			for (@Pc(888) int local888 = 0; local888 < this.anInt3909; local888++) {
				@Pc(897) int local897 = this.aByteArray52[local888] & 0xFF;
				if (local897 != 255) {
					if (this.aShortArray52[local888] == (this.aShortArray53[local897] & 0xFFFF) && this.aShortArray41[local888] == (this.aShortArray47[local897] & 0xFFFF) && (this.aShortArray44[local897] & 0xFFFF) == this.aShortArray50[local888]) {
						this.aByteArray52[local888] = -1;
					} else {
						local886 = true;
					}
				}
			}
			if (!local886) {
				this.aByteArray52 = null;
			}
		}
		if (!local9) {
			this.aShortArray42 = null;
		}
		if (!local7) {
			this.aByteArray49 = null;
		}
	}
}
