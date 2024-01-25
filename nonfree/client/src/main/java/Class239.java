import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class239 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "[Lclient!mm;")
	public Class158[] aClass158Array3;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "[I")
	public int[] anIntArray675;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "[S")
	public short[] aShortArray109;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "[I")
	public int[] anIntArray676;

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!vn", name = "F", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!vn", name = "G", descriptor = "[I")
	public int[] anIntArray677;

	@OriginalMember(owner = "client!vn", name = "K", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!vn", name = "L", descriptor = "[I")
	public int[] anIntArray678;

	@OriginalMember(owner = "client!vn", name = "M", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!vn", name = "N", descriptor = "[I")
	public int[] anIntArray679;

	@OriginalMember(owner = "client!vn", name = "P", descriptor = "[B")
	public byte[] aByteArray96;

	@OriginalMember(owner = "client!vn", name = "T", descriptor = "[B")
	public byte[] aByteArray97;

	@OriginalMember(owner = "client!vn", name = "U", descriptor = "[S")
	public short[] aShortArray114;

	@OriginalMember(owner = "client!vn", name = "V", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!vn", name = "Y", descriptor = "[S")
	public short[] aShortArray116;

	@OriginalMember(owner = "client!vn", name = "eb", descriptor = "[Lclient!vq;")
	public Class241[] aClass241Array3;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "B")
	public byte aByte77 = 0;

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
	public int anInt6217 = 0;

	@OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
	public int anInt6226 = 0;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
	public int anInt6215 = 0;

	@OriginalMember(owner = "client!vn", name = "bb", descriptor = "I")
	public int anInt6235 = 0;

	static {
		new Class57("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([B)V")
	public Class239(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5570(arg0);
		} else {
			this.method5571(arg0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(III)V")
	public Class239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray114 = new short[arg1];
		this.anIntArray676 = new int[arg0];
		this.anIntArray679 = new int[arg1];
		this.anIntArray675 = new int[arg0];
		this.aByteArray89 = new byte[arg1];
		this.aShortArray111 = new short[arg1];
		this.aShortArray107 = new short[arg1];
		this.aByteArray88 = new byte[arg1];
		this.aByteArray96 = new byte[arg1];
		this.aShortArray106 = new short[arg1];
		this.aShortArray113 = new short[arg1];
		this.anIntArray678 = new int[arg0];
		if (arg2 > 0) {
			this.aShortArray104 = new short[arg2];
			this.aByteArray97 = new byte[arg2];
			this.aByteArray93 = new byte[arg2];
			this.aShortArray116 = new short[arg2];
			this.aShortArray108 = new short[arg2];
			this.aByteArray92 = new byte[arg2];
			this.aShortArray109 = new short[arg2];
			this.aByteArray90 = new byte[arg2];
			this.aByteArray94 = new byte[arg2];
			this.aByteArray95 = new byte[arg2];
			this.aShortArray110 = new short[arg2];
			this.aShortArray112 = new short[arg2];
		}
		this.aByteArray91 = new byte[arg1];
		this.anIntArray677 = new int[arg0];
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([Lclient!vn;I)V")
	public Class239(@OriginalArg(0) Class239[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6217 = 0;
		this.anInt6215 = 0;
		this.anInt6226 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) boolean local43 = false;
		this.aByte77 = -1;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class239 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt6217 += local54.anInt6217;
				this.anInt6215 += local54.anInt6215;
				this.anInt6226 += local54.anInt6226;
				local33 |= local54.aByteArray91 != null;
				if (local54.aClass158Array3 != null) {
					local31 += local54.aClass158Array3.length;
				}
				if (local54.aClass241Array3 != null) {
					local29 += local54.aClass241Array3.length;
				}
				local43 |= local54.anIntArray679 != null;
				if (local54.aByteArray88 == null) {
					if (this.aByte77 == -1) {
						this.aByte77 = local54.aByte77;
					}
					if (local54.aByte77 != this.aByte77) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local37 |= local54.aByteArray89 != null;
				local39 |= local54.aByteArray96 != null;
				local41 |= local54.aShortArray113 != null;
			}
		}
		if (local33) {
			this.aByteArray91 = new byte[this.anInt6215];
		}
		if (local41) {
			this.aShortArray113 = new short[this.anInt6215];
		}
		this.aShortArray105 = new short[this.anInt6215];
		this.aShortArray115 = new short[this.anInt6226];
		this.aShortArray107 = new short[this.anInt6215];
		this.anIntArray676 = new int[this.anInt6226];
		this.aShortArray106 = new short[this.anInt6215];
		if (local31 > 0) {
			this.aClass158Array3 = new Class158[local31];
		}
		if (local39) {
			this.aByteArray96 = new byte[this.anInt6215];
		}
		this.anIntArray675 = new int[this.anInt6226];
		if (local29 > 0) {
			this.aClass241Array3 = new Class241[local29];
		}
		this.anIntArray678 = new int[this.anInt6226];
		if (local37) {
			this.aByteArray89 = new byte[this.anInt6215];
		}
		this.aShortArray114 = new short[this.anInt6215];
		if (local43) {
			this.anIntArray679 = new int[this.anInt6215];
		}
		this.anIntArray677 = new int[this.anInt6226];
		if (this.anInt6217 > 0) {
			this.aByteArray93 = new byte[this.anInt6217];
			this.aByteArray94 = new byte[this.anInt6217];
			this.aByteArray92 = new byte[this.anInt6217];
			this.aShortArray104 = new short[this.anInt6217];
			this.aShortArray108 = new short[this.anInt6217];
			this.aShortArray116 = new short[this.anInt6217];
			this.aShortArray109 = new short[this.anInt6217];
			this.aShortArray110 = new short[this.anInt6217];
			this.aByteArray97 = new byte[this.anInt6217];
			this.aShortArray112 = new short[this.anInt6217];
			this.aByteArray90 = new byte[this.anInt6217];
			this.aByteArray95 = new byte[this.anInt6217];
		}
		this.aShortArray111 = new short[this.anInt6215];
		if (local35) {
			this.aByteArray88 = new byte[this.anInt6215];
		}
		this.anInt6226 = 0;
		local31 = 0;
		this.anInt6217 = 0;
		local29 = 0;
		this.anInt6215 = 0;
		@Pc(564) int local564;
		@Pc(575) int local575;
		for (@Pc(359) int local359 = 0; local359 < arg1; local359++) {
			@Pc(366) short local366 = (short) (0x1 << local359);
			@Pc(370) Class239 local370 = arg0[local359];
			if (local370 != null) {
				for (@Pc(374) int local374 = 0; local374 < local370.anInt6215; local374++) {
					if (local33 && local370.aByteArray91 != null) {
						this.aByteArray91[this.anInt6215] = local370.aByteArray91[local374];
					}
					if (local35) {
						if (local370.aByteArray88 == null) {
							this.aByteArray88[this.anInt6215] = local370.aByte77;
						} else {
							this.aByteArray88[this.anInt6215] = local370.aByteArray88[local374];
						}
					}
					if (local37 && local370.aByteArray89 != null) {
						this.aByteArray89[this.anInt6215] = local370.aByteArray89[local374];
					}
					if (local41) {
						if (local370.aShortArray113 == null) {
							this.aShortArray113[this.anInt6215] = -1;
						} else {
							this.aShortArray113[this.anInt6215] = local370.aShortArray113[local374];
						}
					}
					if (local43) {
						if (local370.anIntArray679 == null) {
							this.anIntArray679[this.anInt6215] = -1;
						} else {
							this.anIntArray679[this.anInt6215] = local370.anIntArray679[local374];
						}
					}
					this.aShortArray114[this.anInt6215] = (short) this.method5567(local366, local370.aShortArray114[local374], local370);
					this.aShortArray111[this.anInt6215] = (short) this.method5567(local366, local370.aShortArray111[local374], local370);
					this.aShortArray107[this.anInt6215] = (short) this.method5567(local366, local370.aShortArray107[local374], local370);
					this.aShortArray105[this.anInt6215] = local366;
					this.aShortArray106[this.anInt6215] = local370.aShortArray106[local374];
					this.anInt6215++;
				}
				@Pc(551) int local551;
				if (local370.aClass241Array3 != null) {
					for (local551 = 0; local551 < local370.aClass241Array3.length; local551++) {
						local564 = this.method5567(local366, local370.aClass241Array3[local551].anInt6259, local370);
						local575 = this.method5567(local366, local370.aClass241Array3[local551].anInt6258, local370);
						@Pc(586) int local586 = this.method5567(local366, local370.aClass241Array3[local551].anInt6254, local370);
						this.aClass241Array3[local29] = new Class241(local370.aClass241Array3[local551].anInt6269, local564, local575, local586, local370.aClass241Array3[local551].aByte78);
						local29++;
					}
				}
				if (local370.aClass158Array3 != null) {
					for (local551 = 0; local551 < local370.aClass158Array3.length; local551++) {
						local564 = this.method5567(local366, local370.aClass158Array3[local551].anInt3925, local370);
						this.aClass158Array3[local31] = new Class158(local370.aClass158Array3[local551].anInt3921, local564);
						local31++;
					}
				}
			}
		}
		this.anInt6235 = this.anInt6226;
		@Pc(665) int local665 = 0;
		for (@Pc(667) int local667 = 0; local667 < arg1; local667++) {
			@Pc(674) short local674 = (short) (0x1 << local667);
			@Pc(678) Class239 local678 = arg0[local667];
			if (local678 != null) {
				for (local564 = 0; local564 < local678.anInt6215; local564++) {
					if (local39) {
						this.aByteArray96[local665++] = (byte) (local678.aByteArray96 == null || local678.aByteArray96[local564] == -1 ? -1 : this.anInt6217 + local678.aByteArray96[local564]);
					}
				}
				for (local575 = 0; local575 < local678.anInt6217; local575++) {
					@Pc(734) byte local734 = this.aByteArray90[this.anInt6217] = local678.aByteArray90[local575];
					if (local734 == 0) {
						this.aShortArray104[this.anInt6217] = (short) this.method5567(local674, local678.aShortArray104[local575], local678);
						this.aShortArray112[this.anInt6217] = (short) this.method5567(local674, local678.aShortArray112[local575], local678);
						this.aShortArray109[this.anInt6217] = (short) this.method5567(local674, local678.aShortArray109[local575], local678);
					}
					if (local734 >= 1 && local734 <= 3) {
						this.aShortArray104[this.anInt6217] = local678.aShortArray104[local575];
						this.aShortArray112[this.anInt6217] = local678.aShortArray112[local575];
						this.aShortArray109[this.anInt6217] = local678.aShortArray109[local575];
						this.aShortArray110[this.anInt6217] = local678.aShortArray110[local575];
						this.aShortArray108[this.anInt6217] = local678.aShortArray108[local575];
						this.aShortArray116[this.anInt6217] = local678.aShortArray116[local575];
						this.aByteArray95[this.anInt6217] = local678.aByteArray95[local575];
						this.aByteArray92[this.anInt6217] = local678.aByteArray92[local575];
						this.aByteArray93[this.anInt6217] = local678.aByteArray93[local575];
					}
					if (local734 == 2) {
						this.aByteArray97[this.anInt6217] = local678.aByteArray97[local575];
						this.aByteArray94[this.anInt6217] = local678.aByteArray94[local575];
					}
					this.anInt6217++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BSBSSBSSSB)B")
	public byte method5557() {
		if (this.anInt6217 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray90[this.anInt6217] = 3;
		this.aShortArray104[this.anInt6217] = 0;
		this.aShortArray112[this.anInt6217] = 32767;
		this.aShortArray109[this.anInt6217] = 0;
		this.aShortArray110[this.anInt6217] = 1024;
		this.aShortArray108[this.anInt6217] = 1024;
		this.aShortArray116[this.anInt6217] = 1024;
		this.aByteArray95[this.anInt6217] = 0;
		this.aByteArray92[this.anInt6217] = 0;
		this.aByteArray93[this.anInt6217] = 0;
		return (byte) this.anInt6217++;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIB)V")
	public void method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg2 != 0) {
			local10 = Class226.anIntArray614[arg2];
			local14 = Class226.anIntArray613[arg2];
			for (local16 = 0; local16 < this.anInt6226; local16++) {
				local34 = local10 * this.anIntArray678[local16] + this.anIntArray675[local16] * local14 >> 15;
				this.anIntArray678[local16] = local14 * this.anIntArray678[local16] - this.anIntArray675[local16] * local10 >> 15;
				this.anIntArray675[local16] = local34;
			}
		}
		if (arg0 != 0) {
			local10 = Class226.anIntArray614[arg0];
			local14 = Class226.anIntArray613[arg0];
			for (local16 = 0; local16 < this.anInt6226; local16++) {
				local34 = local14 * this.anIntArray678[local16] - this.anIntArray677[local16] * local10 >> 15;
				this.anIntArray677[local16] = this.anIntArray677[local16] * local14 + this.anIntArray678[local16] * local10 >> 15;
				this.anIntArray678[local16] = local34;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local10 = Class226.anIntArray614[arg1];
		local14 = Class226.anIntArray613[arg1];
		for (local16 = 0; local16 < this.anInt6226; local16++) {
			local34 = this.anIntArray677[local16] * local10 + this.anIntArray675[local16] * local14 >> 15;
			this.anIntArray677[local16] = local14 * this.anIntArray677[local16] - this.anIntArray675[local16] * local10 >> 15;
			this.anIntArray675[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)[[I")
	public int[][] method5561() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6235; local12++) {
			@Pc(19) int local19 = this.anIntArray676[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(34) int local34 = local8[local19]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(57) int local57 = 0; local57 <= local10; local57++) {
			local47[local57] = new int[local8[local57]];
			local8[local57] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt6235; local80++) {
			@Pc(87) int local87 = this.anIntArray676[local80];
			if (local87 >= 0) {
				local47[local87][local8[local87]++] = local80;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ISS)V")
	public void method5563(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6215; local7++) {
			if (this.aShortArray106[local7] == arg0) {
				this.aShortArray106[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII)V")
	public void method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt6226; local9++) {
			this.anIntArray675[local9] += arg1;
			this.anIntArray678[local9] += arg0;
			this.anIntArray677[local9] += arg2;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BIII)I")
	public int method5565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6226; local7++) {
			if (arg2 == this.anIntArray675[local7] && arg0 == this.anIntArray678[local7] && arg1 == this.anIntArray677[local7]) {
				return local7;
			}
		}
		this.anIntArray675[this.anInt6226] = arg2;
		this.anIntArray678[this.anInt6226] = arg0;
		this.anIntArray677[this.anInt6226] = arg1;
		this.anInt6235 = this.anInt6226 + 1;
		return this.anInt6226++;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(SIILclient!vn;)I")
	private int method5567(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class239 arg2) {
		@Pc(18) int local18 = arg2.anIntArray675[arg1];
		@Pc(23) int local23 = arg2.anIntArray678[arg1];
		@Pc(28) int local28 = arg2.anIntArray677[arg1];
		for (@Pc(30) int local30 = 0; local30 < this.anInt6226; local30++) {
			if (this.anIntArray675[local30] == local18 && local23 == this.anIntArray678[local30] && this.anIntArray677[local30] == local28) {
				this.aShortArray115[local30] |= arg0;
				return local30;
			}
		}
		this.anIntArray675[this.anInt6226] = local18;
		this.anIntArray678[this.anInt6226] = local23;
		this.anIntArray677[this.anInt6226] = local28;
		this.aShortArray115[this.anInt6226] = arg0;
		this.anIntArray676[this.anInt6226] = arg2.anIntArray676 == null ? -1 : arg2.anIntArray676[arg1];
		return this.anInt6226++;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)[[I")
	public int[][] method5569() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6215; local12++) {
			@Pc(19) int local19 = this.anIntArray679[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt6215; local72++) {
			@Pc(79) int local79 = this.anIntArray679[local72];
			if (local79 >= 0) {
				local47[local79][local8[local79]++] = local72;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([BB)V")
	private void method5570(@OriginalArg(0) byte[] arg0) {
		@Pc(16) Class3_Sub5 local16 = new Class3_Sub5(arg0);
		@Pc(21) Class3_Sub5 local21 = new Class3_Sub5(arg0);
		@Pc(26) Class3_Sub5 local26 = new Class3_Sub5(arg0);
		@Pc(31) Class3_Sub5 local31 = new Class3_Sub5(arg0);
		@Pc(36) Class3_Sub5 local36 = new Class3_Sub5(arg0);
		@Pc(41) Class3_Sub5 local41 = new Class3_Sub5(arg0);
		@Pc(46) Class3_Sub5 local46 = new Class3_Sub5(arg0);
		local16.anInt3121 = arg0.length - 23;
		this.anInt6226 = local16.method2767();
		this.anInt6215 = local16.method2767();
		this.anInt6217 = local16.method2739();
		@Pc(73) int local73 = local16.method2739();
		@Pc(84) boolean local84 = (local73 & 0x1) == 1;
		@Pc(93) boolean local93 = (local73 & 0x2) == 2;
		@Pc(97) int local97 = local16.method2739();
		@Pc(101) int local101 = local16.method2739();
		@Pc(107) int local107 = local16.method2739();
		@Pc(111) int local111 = local16.method2739();
		@Pc(115) int local115 = local16.method2739();
		@Pc(119) int local119 = local16.method2767();
		@Pc(123) int local123 = local16.method2767();
		@Pc(127) int local127 = local16.method2767();
		@Pc(131) int local131 = local16.method2767();
		@Pc(135) int local135 = local16.method2767();
		@Pc(137) int local137 = 0;
		@Pc(139) int local139 = 0;
		@Pc(141) int local141 = 0;
		@Pc(154) int local154;
		if (this.anInt6217 > 0) {
			local16.anInt3121 = 0;
			this.aByteArray90 = new byte[this.anInt6217];
			for (local154 = 0; local154 < this.anInt6217; local154++) {
				@Pc(165) byte local165 = this.aByteArray90[local154] = local16.method2753();
				if (local165 == 2) {
					local141++;
				}
				if (local165 == 0) {
					local137++;
				}
				if (local165 >= 1 && local165 <= 3) {
					local139++;
				}
			}
		}
		local154 = this.anInt6217;
		@Pc(192) int local192 = local154;
		local154 += this.anInt6226;
		@Pc(199) int local199 = local154;
		if (local84) {
			local154 += this.anInt6215;
		}
		@Pc(208) int local208 = local154;
		local154 += this.anInt6215;
		@Pc(215) int local215 = local154;
		if (local97 == 255) {
			local154 += this.anInt6215;
		}
		@Pc(225) int local225 = local154;
		if (local107 == 1) {
			local154 += this.anInt6215;
		}
		@Pc(237) int local237 = local154;
		if (local115 == 1) {
			local154 += this.anInt6226;
		}
		@Pc(247) int local247 = local154;
		if (local101 == 1) {
			local154 += this.anInt6215;
		}
		@Pc(257) int local257 = local154;
		local154 += local131;
		@Pc(263) int local263 = local154;
		if (local111 == 1) {
			local154 += this.anInt6215 * 2;
		}
		@Pc(275) int local275 = local154;
		local154 += local135;
		@Pc(281) int local281 = local154;
		local154 += this.anInt6215 * 2;
		@Pc(290) int local290 = local154;
		local154 += local119;
		@Pc(296) int local296 = local154;
		local154 += local123;
		@Pc(302) int local302 = local154;
		local154 += local127;
		@Pc(308) int local308 = local154;
		local154 += local137 * 6;
		@Pc(316) int local316 = local154;
		local154 += local139 * 6;
		@Pc(324) int local324 = local154;
		local154 += local139 * 6;
		@Pc(332) int local332 = local154;
		local154 += local139;
		@Pc(338) int local338 = local154;
		local154 += local139;
		@Pc(344) int local344 = local154;
		local154 += local141 * 2 + local139;
		local16.anInt3121 = local192;
		if (local97 == 255) {
			this.aByteArray88 = new byte[this.anInt6215];
		} else {
			this.aByte77 = (byte) local97;
		}
		this.anIntArray675 = new int[this.anInt6226];
		if (local84) {
			this.aByteArray91 = new byte[this.anInt6215];
		}
		if (local111 == 1) {
			this.aShortArray113 = new short[this.anInt6215];
		}
		this.aShortArray114 = new short[this.anInt6215];
		this.anIntArray678 = new int[this.anInt6226];
		this.aShortArray111 = new short[this.anInt6215];
		this.aShortArray107 = new short[this.anInt6215];
		if (this.anInt6217 > 0) {
			if (local139 > 0) {
				this.aByteArray95 = new byte[local139];
				this.aByteArray92 = new byte[local139];
				this.aShortArray108 = new short[local139];
				this.aByteArray93 = new byte[local139];
				this.aShortArray110 = new short[local139];
				this.aShortArray116 = new short[local139];
			}
			this.aShortArray109 = new short[this.anInt6217];
			if (local141 > 0) {
				this.aByteArray94 = new byte[local141];
				this.aByteArray97 = new byte[local141];
			}
			this.aShortArray104 = new short[this.anInt6217];
			this.aShortArray112 = new short[this.anInt6217];
		}
		if (local101 == 1) {
			this.aByteArray89 = new byte[this.anInt6215];
		}
		this.aShortArray106 = new short[this.anInt6215];
		this.anIntArray677 = new int[this.anInt6226];
		if (local115 == 1) {
			this.anIntArray676 = new int[this.anInt6226];
		}
		if (local107 == 1) {
			this.anIntArray679 = new int[this.anInt6215];
		}
		if (local111 == 1 && this.anInt6217 > 0) {
			this.aByteArray96 = new byte[this.anInt6215];
		}
		local21.anInt3121 = local290;
		local26.anInt3121 = local296;
		local31.anInt3121 = local302;
		local36.anInt3121 = local237;
		@Pc(536) int local536 = 0;
		@Pc(538) int local538 = 0;
		@Pc(540) int local540 = 0;
		@Pc(550) int local550;
		for (@Pc(542) int local542 = 0; local542 < this.anInt6226; local542++) {
			local550 = local16.method2739();
			@Pc(552) int local552 = 0;
			if ((local550 & 0x1) != 0) {
				local552 = local21.method2764();
			}
			@Pc(562) int local562 = 0;
			if ((local550 & 0x2) != 0) {
				local562 = local26.method2764();
			}
			@Pc(575) int local575 = 0;
			if ((local550 & 0x4) != 0) {
				local575 = local31.method2764();
			}
			this.anIntArray675[local542] = local536 + local552;
			this.anIntArray678[local542] = local562 + local538;
			this.anIntArray677[local542] = local540 + local575;
			local540 = this.anIntArray677[local542];
			local536 = this.anIntArray675[local542];
			local538 = this.anIntArray678[local542];
			if (local115 == 1) {
				this.anIntArray676[local542] = local36.method2739();
			}
		}
		local16.anInt3121 = local281;
		local21.anInt3121 = local199;
		local26.anInt3121 = local215;
		local31.anInt3121 = local247;
		local36.anInt3121 = local225;
		local41.anInt3121 = local263;
		local46.anInt3121 = local275;
		for (local550 = 0; local550 < this.anInt6215; local550++) {
			this.aShortArray106[local550] = (short) local16.method2767();
			if (local84) {
				this.aByteArray91[local550] = local21.method2753();
			}
			if (local97 == 255) {
				this.aByteArray88[local550] = local26.method2753();
			}
			if (local101 == 1) {
				this.aByteArray89[local550] = local31.method2753();
			}
			if (local107 == 1) {
				this.anIntArray679[local550] = local36.method2739();
			}
			if (local111 == 1) {
				this.aShortArray113[local550] = (short) (local41.method2767() - 1);
			}
			if (this.aByteArray96 != null) {
				if (this.aShortArray113[local550] == -1) {
					this.aByteArray96[local550] = -1;
				} else {
					this.aByteArray96[local550] = (byte) (local46.method2739() - 1);
				}
			}
		}
		this.anInt6235 = -1;
		local16.anInt3121 = local257;
		local21.anInt3121 = local208;
		@Pc(779) short local779 = 0;
		@Pc(781) short local781 = 0;
		@Pc(783) short local783 = 0;
		@Pc(785) short local785 = 0;
		@Pc(793) int local793;
		for (@Pc(787) int local787 = 0; local787 < this.anInt6215; local787++) {
			local793 = local21.method2739();
			if (local793 == 1) {
				local779 = (short) (local785 + local16.method2764());
				local781 = (short) (local16.method2764() + local779);
				local783 = (short) (local16.method2764() + local781);
				this.aShortArray114[local787] = local779;
				local785 = local783;
				this.aShortArray111[local787] = local781;
				this.aShortArray107[local787] = local783;
				if (local779 > this.anInt6235) {
					this.anInt6235 = local779;
				}
				if (this.anInt6235 < local781) {
					this.anInt6235 = local781;
				}
				if (local783 > this.anInt6235) {
					this.anInt6235 = local783;
				}
			}
			if (local793 == 2) {
				local781 = local783;
				local783 = (short) (local16.method2764() + local785);
				local785 = local783;
				this.aShortArray114[local787] = local779;
				this.aShortArray111[local787] = local781;
				this.aShortArray107[local787] = local783;
				if (this.anInt6235 < local783) {
					this.anInt6235 = local783;
				}
			}
			if (local793 == 3) {
				local779 = local783;
				local783 = (short) (local16.method2764() + local785);
				this.aShortArray114[local787] = local779;
				local785 = local783;
				this.aShortArray111[local787] = local781;
				this.aShortArray107[local787] = local783;
				if (this.anInt6235 < local783) {
					this.anInt6235 = local783;
				}
			}
			if (local793 == 4) {
				@Pc(948) short local948 = local779;
				local779 = local781;
				local781 = local948;
				local783 = (short) (local16.method2764() + local785);
				local785 = local783;
				this.aShortArray114[local787] = local779;
				this.aShortArray111[local787] = local948;
				this.aShortArray107[local787] = local783;
				if (local783 > this.anInt6235) {
					this.anInt6235 = local783;
				}
			}
		}
		local16.anInt3121 = local308;
		this.anInt6235++;
		local21.anInt3121 = local316;
		local26.anInt3121 = local324;
		local31.anInt3121 = local332;
		local36.anInt3121 = local338;
		local41.anInt3121 = local344;
		@Pc(1025) int local1025;
		for (local793 = 0; local793 < this.anInt6217; local793++) {
			local1025 = this.aByteArray90[local793] & 0xFF;
			if (local1025 == 0) {
				this.aShortArray104[local793] = (short) local16.method2767();
				this.aShortArray112[local793] = (short) local16.method2767();
				this.aShortArray109[local793] = (short) local16.method2767();
			}
			if (local1025 == 1) {
				this.aShortArray104[local793] = (short) local21.method2767();
				this.aShortArray112[local793] = (short) local21.method2767();
				this.aShortArray109[local793] = (short) local21.method2767();
				this.aShortArray110[local793] = (short) local26.method2767();
				this.aShortArray108[local793] = (short) local26.method2767();
				this.aShortArray116[local793] = (short) local26.method2767();
				this.aByteArray95[local793] = local31.method2753();
				this.aByteArray92[local793] = local36.method2753();
				this.aByteArray93[local793] = local41.method2753();
			}
			if (local1025 == 2) {
				this.aShortArray104[local793] = (short) local21.method2767();
				this.aShortArray112[local793] = (short) local21.method2767();
				this.aShortArray109[local793] = (short) local21.method2767();
				this.aShortArray110[local793] = (short) local26.method2767();
				this.aShortArray108[local793] = (short) local26.method2767();
				this.aShortArray116[local793] = (short) local26.method2767();
				this.aByteArray95[local793] = local31.method2753();
				this.aByteArray92[local793] = local36.method2753();
				this.aByteArray93[local793] = local41.method2753();
				this.aByteArray97[local793] = local41.method2753();
				this.aByteArray94[local793] = local41.method2753();
			}
			if (local1025 == 3) {
				this.aShortArray104[local793] = (short) local21.method2767();
				this.aShortArray112[local793] = (short) local21.method2767();
				this.aShortArray109[local793] = (short) local21.method2767();
				this.aShortArray110[local793] = (short) local26.method2767();
				this.aShortArray108[local793] = (short) local26.method2767();
				this.aShortArray116[local793] = (short) local26.method2767();
				this.aByteArray95[local793] = local31.method2753();
				this.aByteArray92[local793] = local36.method2753();
				this.aByteArray93[local793] = local41.method2753();
			}
		}
		if (!local93) {
			return;
		}
		local16.anInt3121 = local154;
		local1025 = local16.method2739();
		@Pc(1315) int local1315;
		@Pc(1321) int local1321;
		if (local1025 > 0) {
			this.aClass241Array3 = new Class241[local1025];
			for (local1315 = 0; local1315 < local1025; local1315++) {
				local1321 = local16.method2767();
				@Pc(1325) int local1325 = local16.method2767();
				@Pc(1333) byte local1333;
				if (local97 == 255) {
					local1333 = this.aByteArray88[local1325];
				} else {
					local1333 = (byte) local97;
				}
				this.aClass241Array3[local1315] = new Class241(local1321, this.aShortArray114[local1325], this.aShortArray111[local1325], this.aShortArray107[local1325], local1333);
			}
		}
		local1315 = local16.method2739();
		if (local1315 <= 0) {
			return;
		}
		this.aClass158Array3 = new Class158[local1315];
		for (local1321 = 0; local1321 < local1315; local1321++) {
			this.aClass158Array3[local1321] = new Class158(local16.method2767(), local16.method2767());
		}
		return;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[B)V")
	private void method5571(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub5 local14 = new Class3_Sub5(arg0);
		@Pc(19) Class3_Sub5 local19 = new Class3_Sub5(arg0);
		@Pc(24) Class3_Sub5 local24 = new Class3_Sub5(arg0);
		@Pc(29) Class3_Sub5 local29 = new Class3_Sub5(arg0);
		@Pc(34) Class3_Sub5 local34 = new Class3_Sub5(arg0);
		local14.anInt3121 = arg0.length - 18;
		this.anInt6226 = local14.method2767();
		this.anInt6215 = local14.method2767();
		this.anInt6217 = local14.method2739();
		@Pc(63) int local63 = local14.method2739();
		@Pc(67) int local67 = local14.method2739();
		@Pc(71) int local71 = local14.method2739();
		@Pc(75) int local75 = local14.method2739();
		@Pc(81) int local81 = local14.method2739();
		@Pc(85) int local85 = local14.method2767();
		@Pc(91) int local91 = local14.method2767();
		@Pc(97) int local97 = local14.method2767();
		@Pc(101) int local101 = local14.method2767();
		@Pc(110) int local110 = this.anInt6226;
		@Pc(112) int local112 = local110;
		local110 += this.anInt6215;
		@Pc(119) int local119 = local110;
		if (local67 == 255) {
			local110 += this.anInt6215;
		}
		@Pc(129) int local129 = local110;
		if (local75 == 1) {
			local110 += this.anInt6215;
		}
		@Pc(139) int local139 = local110;
		if (local63 == 1) {
			local110 += this.anInt6215;
		}
		@Pc(149) int local149 = local110;
		if (local81 == 1) {
			local110 += this.anInt6226;
		}
		@Pc(161) int local161 = local110;
		if (local71 == 1) {
			local110 += this.anInt6215;
		}
		@Pc(173) int local173 = local110;
		local110 += local101;
		@Pc(179) int local179 = local110;
		local110 += this.anInt6215 * 2;
		@Pc(188) int local188 = local110;
		local110 += this.anInt6217 * 6;
		@Pc(197) int local197 = local110;
		local110 += local85;
		@Pc(203) int local203 = local110;
		local110 += local91;
		local14.anInt3121 = 0;
		this.aShortArray114 = new short[this.anInt6215];
		if (local71 == 1) {
			this.aByteArray89 = new byte[this.anInt6215];
		}
		this.anIntArray678 = new int[this.anInt6226];
		if (local81 == 1) {
			this.anIntArray676 = new int[this.anInt6226];
		}
		this.anIntArray675 = new int[this.anInt6226];
		this.anIntArray677 = new int[this.anInt6226];
		if (this.anInt6217 > 0) {
			this.aShortArray104 = new short[this.anInt6217];
			this.aShortArray112 = new short[this.anInt6217];
			this.aShortArray109 = new short[this.anInt6217];
			this.aByteArray90 = new byte[this.anInt6217];
		}
		this.aShortArray111 = new short[this.anInt6215];
		if (local63 == 1) {
			this.aShortArray113 = new short[this.anInt6215];
			this.aByteArray91 = new byte[this.anInt6215];
			this.aByteArray96 = new byte[this.anInt6215];
		}
		if (local67 == 255) {
			this.aByteArray88 = new byte[this.anInt6215];
		} else {
			this.aByte77 = (byte) local67;
		}
		if (local75 == 1) {
			this.anIntArray679 = new int[this.anInt6215];
		}
		this.aShortArray106 = new short[this.anInt6215];
		this.aShortArray107 = new short[this.anInt6215];
		local19.anInt3121 = local197;
		local24.anInt3121 = local203;
		local29.anInt3121 = local110;
		local34.anInt3121 = local149;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(364) int local364;
		@Pc(366) int local366;
		for (@Pc(356) int local356 = 0; local356 < this.anInt6226; local356++) {
			local364 = local14.method2739();
			local366 = 0;
			if ((local364 & 0x1) != 0) {
				local366 = local19.method2764();
			}
			@Pc(376) int local376 = 0;
			if ((local364 & 0x2) != 0) {
				local376 = local24.method2764();
			}
			@Pc(389) int local389 = 0;
			if ((local364 & 0x4) != 0) {
				local389 = local29.method2764();
			}
			this.anIntArray675[local356] = local350 + local366;
			this.anIntArray678[local356] = local376 + local352;
			this.anIntArray677[local356] = local354 + local389;
			local350 = this.anIntArray675[local356];
			local354 = this.anIntArray677[local356];
			local352 = this.anIntArray678[local356];
			if (local81 == 1) {
				this.anIntArray676[local356] = local34.method2739();
			}
		}
		local14.anInt3121 = local179;
		local19.anInt3121 = local139;
		local24.anInt3121 = local119;
		local29.anInt3121 = local161;
		local34.anInt3121 = local129;
		for (local364 = 0; local364 < this.anInt6215; local364++) {
			this.aShortArray106[local364] = (short) local14.method2767();
			if (local63 == 1) {
				local366 = local19.method2739();
				if ((local366 & 0x1) == 1) {
					local7 = true;
					this.aByteArray91[local364] = 1;
				} else {
					this.aByteArray91[local364] = 0;
				}
				if ((local366 & 0x2) == 2) {
					this.aByteArray96[local364] = (byte) (local366 >> 2);
					this.aShortArray113[local364] = this.aShortArray106[local364];
					this.aShortArray106[local364] = 127;
					if (this.aShortArray113[local364] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray96[local364] = -1;
					this.aShortArray113[local364] = -1;
				}
			}
			if (local67 == 255) {
				this.aByteArray88[local364] = local24.method2753();
			}
			if (local71 == 1) {
				this.aByteArray89[local364] = local29.method2753();
			}
			if (local75 == 1) {
				this.anIntArray679[local364] = local34.method2739();
			}
		}
		local14.anInt3121 = local173;
		this.anInt6235 = -1;
		local19.anInt3121 = local112;
		@Pc(615) short local615 = 0;
		@Pc(617) short local617 = 0;
		@Pc(619) short local619 = 0;
		@Pc(622) short local622 = 0;
		@Pc(632) int local632;
		for (@Pc(624) int local624 = 0; local624 < this.anInt6215; local624++) {
			local632 = local19.method2739();
			if (local632 == 1) {
				local615 = (short) (local622 + local14.method2764());
				local617 = (short) (local14.method2764() + local615);
				local619 = (short) (local14.method2764() + local617);
				local622 = local619;
				this.aShortArray114[local624] = local615;
				this.aShortArray111[local624] = local617;
				this.aShortArray107[local624] = local619;
				if (local615 > this.anInt6235) {
					this.anInt6235 = local615;
				}
				if (this.anInt6235 < local617) {
					this.anInt6235 = local617;
				}
				if (this.anInt6235 < local619) {
					this.anInt6235 = local619;
				}
			}
			if (local632 == 2) {
				local617 = local619;
				local619 = (short) (local622 + local14.method2764());
				this.aShortArray114[local624] = local615;
				local622 = local619;
				this.aShortArray111[local624] = local617;
				this.aShortArray107[local624] = local619;
				if (this.anInt6235 < local619) {
					this.anInt6235 = local619;
				}
			}
			if (local632 == 3) {
				local615 = local619;
				local619 = (short) (local622 + local14.method2764());
				local622 = local619;
				this.aShortArray114[local624] = local615;
				this.aShortArray111[local624] = local617;
				this.aShortArray107[local624] = local619;
				if (this.anInt6235 < local619) {
					this.anInt6235 = local619;
				}
			}
			if (local632 == 4) {
				@Pc(797) short local797 = local615;
				local615 = local617;
				local617 = local797;
				local619 = (short) (local622 + local14.method2764());
				local622 = local619;
				this.aShortArray114[local624] = local615;
				this.aShortArray111[local624] = local797;
				this.aShortArray107[local624] = local619;
				if (this.anInt6235 < local619) {
					this.anInt6235 = local619;
				}
			}
		}
		local14.anInt3121 = local188;
		this.anInt6235++;
		for (local632 = 0; local632 < this.anInt6217; local632++) {
			this.aByteArray90[local632] = 0;
			this.aShortArray104[local632] = (short) local14.method2767();
			this.aShortArray112[local632] = (short) local14.method2767();
			this.aShortArray109[local632] = (short) local14.method2767();
		}
		if (this.aByteArray96 != null) {
			@Pc(903) boolean local903 = false;
			for (@Pc(905) int local905 = 0; local905 < this.anInt6215; local905++) {
				@Pc(914) int local914 = this.aByteArray96[local905] & 0xFF;
				if (local914 != 255) {
					if (this.aShortArray114[local905] == (this.aShortArray104[local914] & 0xFFFF) && this.aShortArray111[local905] == (this.aShortArray112[local914] & 0xFFFF) && this.aShortArray107[local905] == (this.aShortArray109[local914] & 0xFFFF)) {
						this.aByteArray96[local905] = -1;
					} else {
						local903 = true;
					}
				}
			}
			if (!local903) {
				this.aByteArray96 = null;
			}
		}
		if (!local9) {
			this.aShortArray113 = null;
		}
		if (!local7) {
			this.aByteArray91 = null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ISIBIBISB)I")
	public int method5572(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) short arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray114[this.anInt6215] = (short) arg1;
		this.aShortArray111[this.anInt6215] = (short) arg5;
		this.aShortArray107[this.anInt6215] = (short) arg3;
		this.aByteArray91[this.anInt6215] = arg2;
		this.aByteArray96[this.anInt6215] = arg7;
		this.aShortArray106[this.anInt6215] = arg0;
		this.aByteArray89[this.anInt6215] = arg4;
		this.aShortArray113[this.anInt6215] = arg6;
		return this.anInt6215++;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(SSI)V")
	public void method5573(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray113 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt6215; local11++) {
			if (arg0 == this.aShortArray113[local11]) {
				this.aShortArray113[local11] = arg1;
			}
		}
	}
}
