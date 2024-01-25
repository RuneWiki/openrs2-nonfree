import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class31 {

	@OriginalMember(owner = "client!br", name = "c", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "[Lclient!wg;")
	public Class212[] aClass212Array1;

	@OriginalMember(owner = "client!br", name = "h", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!br", name = "o", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!br", name = "x", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!br", name = "C", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!br", name = "D", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!br", name = "E", descriptor = "[Lclient!rf;")
	public Class174[] aClass174Array1;

	@OriginalMember(owner = "client!br", name = "G", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!br", name = "H", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!br", name = "I", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!br", name = "K", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!br", name = "L", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!br", name = "M", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!br", name = "N", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!br", name = "Q", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!br", name = "R", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!br", name = "S", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!br", name = "T", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!br", name = "U", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!br", name = "V", descriptor = "[I")
	public int[] anIntArray40;

	@OriginalMember(owner = "client!br", name = "W", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "I")
	public int anInt549 = 0;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "I")
	public int anInt554 = 0;

	@OriginalMember(owner = "client!br", name = "O", descriptor = "B")
	public byte aByte5 = 0;

	@OriginalMember(owner = "client!br", name = "F", descriptor = "I")
	public int anInt562 = 0;

	@OriginalMember(owner = "client!br", name = "Z", descriptor = "I")
	public int anInt567 = 0;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "([B)V")
	public Class31(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method442(arg0);
		} else {
			this.method439(arg0);
		}
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(III)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray36 = new int[arg0];
		this.anIntArray40 = new int[arg0];
		this.anIntArray39 = new int[arg0];
		this.aShortArray27 = new short[arg1];
		this.aShortArray32 = new short[arg1];
		this.anIntArray37 = new int[arg1];
		this.aShortArray24 = new short[arg1];
		if (arg2 > 0) {
			this.aShortArray31 = new short[arg2];
			this.aByteArray15 = new byte[arg2];
			this.aByteArray14 = new byte[arg2];
			this.aShortArray33 = new short[arg2];
			this.aShortArray21 = new short[arg2];
			this.aByteArray7 = new byte[arg2];
			this.aByteArray12 = new byte[arg2];
			this.aShortArray30 = new short[arg2];
			this.aByteArray16 = new byte[arg2];
			this.aByteArray9 = new byte[arg2];
			this.aShortArray28 = new short[arg2];
			this.aShortArray29 = new short[arg2];
		}
		this.aByteArray13 = new byte[arg1];
		this.aShortArray25 = new short[arg1];
		this.aByteArray8 = new byte[arg1];
		this.aByteArray10 = new byte[arg1];
		this.aShortArray23 = new short[arg1];
		this.anIntArray38 = new int[arg0];
		this.aByteArray11 = new byte[arg1];
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "([Lclient!br;I)V")
	public Class31(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) int arg1) {
		this.anInt549 = 0;
		this.anInt567 = 0;
		this.anInt562 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte5 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class31 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt549 += local54.anInt549;
				this.anInt567 += local54.anInt567;
				this.anInt562 += local54.anInt562;
				if (local54.aClass212Array1 != null) {
					local31 += local54.aClass212Array1.length;
				}
				local33 |= local54.aByteArray11 != null;
				if (local54.aClass174Array1 != null) {
					local29 += local54.aClass174Array1.length;
				}
				local39 |= local54.aByteArray13 != null;
				local46 |= local54.anIntArray37 != null;
				local41 |= local54.aShortArray25 != null;
				if (local54.aByteArray10 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local54.aByte5;
					}
					if (this.aByte5 != local54.aByte5) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local37 |= local54.aByteArray8 != null;
			}
		}
		if (local37) {
			this.aByteArray8 = new byte[this.anInt567];
		}
		this.anIntArray38 = new int[this.anInt562];
		this.aShortArray32 = new short[this.anInt567];
		this.aShortArray27 = new short[this.anInt567];
		if (local46) {
			this.anIntArray37 = new int[this.anInt567];
		}
		this.aShortArray22 = new short[this.anInt562];
		this.aShortArray23 = new short[this.anInt567];
		this.aShortArray24 = new short[this.anInt567];
		if (local35) {
			this.aByteArray10 = new byte[this.anInt567];
		}
		this.anIntArray36 = new int[this.anInt562];
		if (local33) {
			this.aByteArray11 = new byte[this.anInt567];
		}
		if (this.anInt549 > 0) {
			this.aByteArray14 = new byte[this.anInt549];
			this.aShortArray29 = new short[this.anInt549];
			this.aShortArray31 = new short[this.anInt549];
			this.aShortArray28 = new short[this.anInt549];
			this.aByteArray15 = new byte[this.anInt549];
			this.aByteArray12 = new byte[this.anInt549];
			this.aShortArray21 = new short[this.anInt549];
			this.aByteArray9 = new byte[this.anInt549];
			this.aShortArray33 = new short[this.anInt549];
			this.aByteArray7 = new byte[this.anInt549];
			this.aShortArray30 = new short[this.anInt549];
			this.aByteArray16 = new byte[this.anInt549];
		}
		if (local29 > 0) {
			this.aClass174Array1 = new Class174[local29];
		}
		if (local31 > 0) {
			this.aClass212Array1 = new Class212[local31];
		}
		this.anIntArray40 = new int[this.anInt562];
		this.anIntArray39 = new int[this.anInt562];
		this.aShortArray26 = new short[this.anInt567];
		if (local41) {
			this.aShortArray25 = new short[this.anInt567];
		}
		if (local39) {
			this.aByteArray13 = new byte[this.anInt567];
		}
		local31 = 0;
		this.anInt567 = 0;
		this.anInt562 = 0;
		this.anInt549 = 0;
		local29 = 0;
		@Pc(560) int local560;
		@Pc(571) int local571;
		for (@Pc(359) int local359 = 0; local359 < arg1; local359++) {
			@Pc(366) short local366 = (short) (0x1 << local359);
			@Pc(370) Class31 local370 = arg0[local359];
			if (local370 != null) {
				for (@Pc(374) int local374 = 0; local374 < local370.anInt567; local374++) {
					if (local33 && local370.aByteArray11 != null) {
						this.aByteArray11[this.anInt567] = local370.aByteArray11[local374];
					}
					if (local35) {
						if (local370.aByteArray10 == null) {
							this.aByteArray10[this.anInt567] = local370.aByte5;
						} else {
							this.aByteArray10[this.anInt567] = local370.aByteArray10[local374];
						}
					}
					if (local37 && local370.aByteArray8 != null) {
						this.aByteArray8[this.anInt567] = local370.aByteArray8[local374];
					}
					if (local41) {
						if (local370.aShortArray25 == null) {
							this.aShortArray25[this.anInt567] = -1;
						} else {
							this.aShortArray25[this.anInt567] = local370.aShortArray25[local374];
						}
					}
					if (local46) {
						if (local370.anIntArray37 == null) {
							this.anIntArray37[this.anInt567] = -1;
						} else {
							this.anIntArray37[this.anInt567] = local370.anIntArray37[local374];
						}
					}
					this.aShortArray27[this.anInt567] = (short) this.method444(local366, local370, local370.aShortArray27[local374]);
					this.aShortArray23[this.anInt567] = (short) this.method444(local366, local370, local370.aShortArray23[local374]);
					this.aShortArray32[this.anInt567] = (short) this.method444(local366, local370, local370.aShortArray32[local374]);
					this.aShortArray26[this.anInt567] = local366;
					this.aShortArray24[this.anInt567] = local370.aShortArray24[local374];
					this.anInt567++;
				}
				@Pc(547) int local547;
				if (local370.aClass174Array1 != null) {
					for (local547 = 0; local547 < local370.aClass174Array1.length; local547++) {
						local560 = this.method444(local366, local370, local370.aClass174Array1[local547].anInt5460);
						local571 = this.method444(local366, local370, local370.aClass174Array1[local547].anInt5472);
						@Pc(582) int local582 = this.method444(local366, local370, local370.aClass174Array1[local547].anInt5461);
						this.aClass174Array1[local29] = new Class174(local370.aClass174Array1[local547].anInt5459, local560, local571, local582, local370.aClass174Array1[local547].aByte69);
						local29++;
					}
				}
				if (local370.aClass212Array1 != null) {
					for (local547 = 0; local547 < local370.aClass212Array1.length; local547++) {
						local560 = this.method444(local366, local370, local370.aClass212Array1[local547].anInt6648);
						this.aClass212Array1[local31] = new Class212(local370.aClass212Array1[local547].anInt6645, local560);
						local31++;
					}
				}
			}
		}
		@Pc(657) int local657 = 0;
		this.anInt554 = this.anInt562;
		for (@Pc(663) int local663 = 0; local663 < arg1; local663++) {
			@Pc(670) short local670 = (short) (0x1 << local663);
			@Pc(674) Class31 local674 = arg0[local663];
			if (local674 != null) {
				for (local560 = 0; local560 < local674.anInt567; local560++) {
					if (local39) {
						this.aByteArray13[local657++] = (byte) (local674.aByteArray13 == null || local674.aByteArray13[local560] == -1 ? -1 : this.anInt549 + local674.aByteArray13[local560]);
					}
				}
				for (local571 = 0; local571 < local674.anInt549; local571++) {
					@Pc(726) byte local726 = this.aByteArray12[this.anInt549] = local674.aByteArray12[local571];
					if (local726 == 0) {
						this.aShortArray28[this.anInt549] = (short) this.method444(local670, local674, local674.aShortArray28[local571]);
						this.aShortArray29[this.anInt549] = (short) this.method444(local670, local674, local674.aShortArray29[local571]);
						this.aShortArray21[this.anInt549] = (short) this.method444(local670, local674, local674.aShortArray21[local571]);
					}
					if (local726 >= 1 && local726 <= 3) {
						this.aShortArray28[this.anInt549] = local674.aShortArray28[local571];
						this.aShortArray29[this.anInt549] = local674.aShortArray29[local571];
						this.aShortArray21[this.anInt549] = local674.aShortArray21[local571];
						this.aShortArray30[this.anInt549] = local674.aShortArray30[local571];
						this.aShortArray33[this.anInt549] = local674.aShortArray33[local571];
						this.aShortArray31[this.anInt549] = local674.aShortArray31[local571];
						this.aByteArray9[this.anInt549] = local674.aByteArray9[local571];
						this.aByteArray15[this.anInt549] = local674.aByteArray15[local571];
						this.aByteArray7[this.anInt549] = local674.aByteArray7[local571];
					}
					if (local726 == 2) {
						this.aByteArray16[this.anInt549] = local674.aByteArray16[local571];
						this.aByteArray14[this.anInt549] = local674.aByteArray14[local571];
					}
					this.anInt549++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(SSBSSBISBS)B")
	public byte method431() {
		if (this.anInt549 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray12[this.anInt549] = 3;
		this.aShortArray28[this.anInt549] = 0;
		this.aShortArray29[this.anInt549] = 32767;
		this.aShortArray21[this.anInt549] = 0;
		this.aShortArray30[this.anInt549] = 1024;
		this.aShortArray33[this.anInt549] = 1024;
		this.aShortArray31[this.anInt549] = 1024;
		this.aByteArray9[this.anInt549] = 0;
		this.aByteArray15[this.anInt549] = 0;
		this.aByteArray7[this.anInt549] = 0;
		return (byte) this.anInt549++;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)[[I")
	public int[][] method433() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt554; local12++) {
			@Pc(19) int local19 = this.anIntArray39[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(33) int local33 = local8[local19]++;
			}
		}
		@Pc(53) int[][] local53 = new int[local10 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local10; local55++) {
			local53[local55] = new int[local8[local55]];
			local8[local55] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt554; local74++) {
			@Pc(81) int local81 = this.anIntArray39[local74];
			if (local81 >= 0) {
				local53[local81][local8[local81]++] = local74;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(SIS)V")
	public void method434(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray25 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt567; local17++) {
			if (this.aShortArray25[local17] == arg0) {
				this.aShortArray25[local17] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIII)V")
	public void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt562; local7++) {
			this.anIntArray36[local7] += arg2;
			this.anIntArray40[local7] += arg0;
			this.anIntArray38[local7] += arg1;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IBII)V")
	public void method437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg2 != 0) {
			local10 = Class140.anIntArray330[arg2];
			local14 = Class140.anIntArray329[arg2];
			for (local16 = 0; local16 < this.anInt562; local16++) {
				local34 = local14 * this.anIntArray36[local16] + this.anIntArray40[local16] * local10 >> 15;
				this.anIntArray40[local16] = this.anIntArray40[local16] * local14 - this.anIntArray36[local16] * local10 >> 15;
				this.anIntArray36[local16] = local34;
			}
		}
		if (arg1 != 0) {
			local10 = Class140.anIntArray330[arg1];
			local14 = Class140.anIntArray329[arg1];
			for (local16 = 0; local16 < this.anInt562; local16++) {
				local34 = this.anIntArray40[local16] * local14 - this.anIntArray38[local16] * local10 >> 15;
				this.anIntArray38[local16] = this.anIntArray40[local16] * local10 + local14 * this.anIntArray38[local16] >> 15;
				this.anIntArray40[local16] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class140.anIntArray330[arg0];
		local14 = Class140.anIntArray329[arg0];
		for (local16 = 0; local16 < this.anInt562; local16++) {
			local34 = this.anIntArray36[local16] * local14 + local10 * this.anIntArray38[local16] >> 15;
			this.anIntArray38[local16] = local14 * this.anIntArray38[local16] - local10 * this.anIntArray36[local16] >> 15;
			this.anIntArray36[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BIII)I")
	public int method438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt562; local7++) {
			if (this.anIntArray36[local7] == arg0 && arg1 == this.anIntArray40[local7] && arg2 == this.anIntArray38[local7]) {
				return local7;
			}
		}
		this.anIntArray36[this.anInt562] = arg0;
		this.anIntArray40[this.anInt562] = arg1;
		this.anIntArray38[this.anInt562] = arg2;
		this.anInt554 = this.anInt562 + 1;
		return this.anInt562++;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "([BI)V")
	private void method439(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class11_Sub25 local14 = new Class11_Sub25(arg0);
		@Pc(19) Class11_Sub25 local19 = new Class11_Sub25(arg0);
		@Pc(24) Class11_Sub25 local24 = new Class11_Sub25(arg0);
		@Pc(29) Class11_Sub25 local29 = new Class11_Sub25(arg0);
		@Pc(34) Class11_Sub25 local34 = new Class11_Sub25(arg0);
		local14.anInt6076 = arg0.length - 18;
		this.anInt562 = local14.method5187();
		this.anInt567 = local14.method5187();
		this.anInt549 = local14.method5185();
		@Pc(59) int local59 = local14.method5185();
		@Pc(63) int local63 = local14.method5185();
		@Pc(67) int local67 = local14.method5185();
		@Pc(71) int local71 = local14.method5185();
		@Pc(75) int local75 = local14.method5185();
		@Pc(79) int local79 = local14.method5187();
		@Pc(83) int local83 = local14.method5187();
		@Pc(87) int local87 = local14.method5187();
		@Pc(91) int local91 = local14.method5187();
		@Pc(100) int local100 = this.anInt562;
		@Pc(102) int local102 = local100;
		local100 += this.anInt567;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt567;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt567;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt567;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt562;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt567;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt567 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt549 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		if (local71 == 1) {
			this.anIntArray37 = new int[this.anInt567];
		}
		if (local63 == 255) {
			this.aByteArray10 = new byte[this.anInt567];
		} else {
			this.aByte5 = (byte) local63;
		}
		if (local75 == 1) {
			this.anIntArray39 = new int[this.anInt562];
		}
		this.aShortArray27 = new short[this.anInt567];
		if (this.anInt549 > 0) {
			this.aShortArray28 = new short[this.anInt549];
			this.aShortArray21 = new short[this.anInt549];
			this.aByteArray12 = new byte[this.anInt549];
			this.aShortArray29 = new short[this.anInt549];
		}
		this.aShortArray32 = new short[this.anInt567];
		this.anIntArray40 = new int[this.anInt562];
		this.anIntArray36 = new int[this.anInt562];
		this.aShortArray24 = new short[this.anInt567];
		if (local59 == 1) {
			this.aByteArray11 = new byte[this.anInt567];
			this.aShortArray25 = new short[this.anInt567];
			this.aByteArray13 = new byte[this.anInt567];
		}
		if (local67 == 1) {
			this.aByteArray8 = new byte[this.anInt567];
		}
		local14.anInt6076 = 0;
		this.aShortArray23 = new short[this.anInt567];
		this.anIntArray38 = new int[this.anInt562];
		local19.anInt6076 = local189;
		local24.anInt6076 = local195;
		local29.anInt6076 = local100;
		local34.anInt6076 = local143;
		@Pc(343) int local343 = 0;
		@Pc(345) int local345 = 0;
		@Pc(347) int local347 = 0;
		@Pc(355) int local355;
		@Pc(357) int local357;
		for (@Pc(349) int local349 = 0; local349 < this.anInt562; local349++) {
			local355 = local14.method5185();
			local357 = 0;
			if ((local355 & 0x1) != 0) {
				local357 = local19.method5212();
			}
			@Pc(370) int local370 = 0;
			if ((local355 & 0x2) != 0) {
				local370 = local24.method5212();
			}
			@Pc(383) int local383 = 0;
			if ((local355 & 0x4) != 0) {
				local383 = local29.method5212();
			}
			this.anIntArray36[local349] = local343 + local357;
			this.anIntArray40[local349] = local345 + local370;
			this.anIntArray38[local349] = local347 + local383;
			local345 = this.anIntArray40[local349];
			local347 = this.anIntArray38[local349];
			local343 = this.anIntArray36[local349];
			if (local75 == 1) {
				this.anIntArray39[local349] = local34.method5185();
			}
		}
		local14.anInt6076 = local171;
		local19.anInt6076 = local133;
		local24.anInt6076 = local109;
		local29.anInt6076 = local153;
		local34.anInt6076 = local121;
		for (local355 = 0; local355 < this.anInt567; local355++) {
			this.aShortArray24[local355] = (short) local14.method5187();
			if (local59 == 1) {
				local357 = local19.method5185();
				if ((local357 & 0x1) == 1) {
					local7 = true;
					this.aByteArray11[local355] = 1;
				} else {
					this.aByteArray11[local355] = 0;
				}
				if ((local357 & 0x2) == 2) {
					this.aByteArray13[local355] = (byte) (local357 >> 2);
					this.aShortArray25[local355] = this.aShortArray24[local355];
					this.aShortArray24[local355] = 127;
					if (this.aShortArray25[local355] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray13[local355] = -1;
					this.aShortArray25[local355] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray10[local355] = local24.method5175();
			}
			if (local67 == 1) {
				this.aByteArray8[local355] = local29.method5175();
			}
			if (local71 == 1) {
				this.anIntArray37[local355] = local34.method5185();
			}
		}
		local14.anInt6076 = local165;
		this.anInt554 = -1;
		local19.anInt6076 = local102;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(618) int local618;
		for (@Pc(612) int local612 = 0; local612 < this.anInt567; local612++) {
			local618 = local19.method5185();
			if (local618 == 1) {
				local604 = (short) (local610 + local14.method5212());
				local606 = (short) (local14.method5212() + local604);
				local608 = (short) (local606 + local14.method5212());
				local610 = local608;
				this.aShortArray27[local612] = local604;
				this.aShortArray23[local612] = local606;
				this.aShortArray32[local612] = local608;
				if (this.anInt554 < local604) {
					this.anInt554 = local604;
				}
				if (this.anInt554 < local606) {
					this.anInt554 = local606;
				}
				if (this.anInt554 < local608) {
					this.anInt554 = local608;
				}
			}
			if (local618 == 2) {
				local606 = local608;
				local608 = (short) (local610 + local14.method5212());
				local610 = local608;
				this.aShortArray27[local612] = local604;
				this.aShortArray23[local612] = local606;
				this.aShortArray32[local612] = local608;
				if (local608 > this.anInt554) {
					this.anInt554 = local608;
				}
			}
			if (local618 == 3) {
				local604 = local608;
				local608 = (short) (local14.method5212() + local610);
				local610 = local608;
				this.aShortArray27[local612] = local604;
				this.aShortArray23[local612] = local606;
				this.aShortArray32[local612] = local608;
				if (this.anInt554 < local608) {
					this.anInt554 = local608;
				}
			}
			if (local618 == 4) {
				@Pc(769) short local769 = local604;
				local604 = local606;
				local608 = (short) (local14.method5212() + local610);
				local606 = local769;
				local610 = local608;
				this.aShortArray27[local612] = local604;
				this.aShortArray23[local612] = local769;
				this.aShortArray32[local612] = local608;
				if (this.anInt554 < local608) {
					this.anInt554 = local608;
				}
			}
		}
		local14.anInt6076 = local180;
		this.anInt554++;
		for (local618 = 0; local618 < this.anInt549; local618++) {
			this.aByteArray12[local618] = 0;
			this.aShortArray28[local618] = (short) local14.method5187();
			this.aShortArray29[local618] = (short) local14.method5187();
			this.aShortArray21[local618] = (short) local14.method5187();
		}
		if (this.aByteArray13 != null) {
			@Pc(869) boolean local869 = false;
			for (@Pc(871) int local871 = 0; local871 < this.anInt567; local871++) {
				@Pc(880) int local880 = this.aByteArray13[local871] & 0xFF;
				if (local880 != 255) {
					if (this.aShortArray27[local871] == (this.aShortArray28[local880] & 0xFFFF) && this.aShortArray23[local871] == (this.aShortArray29[local880] & 0xFFFF) && (this.aShortArray21[local880] & 0xFFFF) == this.aShortArray32[local871]) {
						this.aByteArray13[local871] = -1;
					} else {
						local869 = true;
					}
				}
			}
			if (!local869) {
				this.aByteArray13 = null;
			}
		}
		if (!local7) {
			this.aByteArray11 = null;
		}
		if (!local9) {
			this.aShortArray25 = null;
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)[[I")
	public int[][] method440() {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt567; local18++) {
			@Pc(25) int local25 = this.anIntArray37[local18];
			if (local25 >= 0) {
				if (local16 < local25) {
					local16 = local25;
				}
				@Pc(36) int local36 = local14[local25]++;
			}
		}
		@Pc(49) int[][] local49 = new int[local16 + 1][];
		for (@Pc(51) int local51 = 0; local51 <= local16; local51++) {
			local49[local51] = new int[local14[local51]];
			local14[local51] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt567; local74++) {
			@Pc(81) int local81 = this.anIntArray37[local74];
			if (local81 >= 0) {
				local49[local81][local14[local81]++] = local74;
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "([BZ)V")
	private void method442(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class11_Sub25 local10 = new Class11_Sub25(arg0);
		@Pc(15) Class11_Sub25 local15 = new Class11_Sub25(arg0);
		@Pc(20) Class11_Sub25 local20 = new Class11_Sub25(arg0);
		@Pc(25) Class11_Sub25 local25 = new Class11_Sub25(arg0);
		@Pc(30) Class11_Sub25 local30 = new Class11_Sub25(arg0);
		@Pc(39) Class11_Sub25 local39 = new Class11_Sub25(arg0);
		@Pc(44) Class11_Sub25 local44 = new Class11_Sub25(arg0);
		local10.anInt6076 = arg0.length - 23;
		this.anInt562 = local10.method5187();
		this.anInt567 = local10.method5187();
		this.anInt549 = local10.method5185();
		@Pc(69) int local69 = local10.method5185();
		@Pc(78) boolean local78 = (local69 & 0x1) == 1;
		@Pc(87) boolean local87 = (local69 & 0x2) == 2;
		@Pc(91) int local91 = local10.method5185();
		@Pc(95) int local95 = local10.method5185();
		@Pc(99) int local99 = local10.method5185();
		@Pc(103) int local103 = local10.method5185();
		@Pc(107) int local107 = local10.method5185();
		@Pc(111) int local111 = local10.method5187();
		@Pc(115) int local115 = local10.method5187();
		@Pc(119) int local119 = local10.method5187();
		@Pc(123) int local123 = local10.method5187();
		@Pc(127) int local127 = local10.method5187();
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(133) int local133 = 0;
		@Pc(146) int local146;
		if (this.anInt549 > 0) {
			this.aByteArray12 = new byte[this.anInt549];
			local10.anInt6076 = 0;
			for (local146 = 0; local146 < this.anInt549; local146++) {
				@Pc(157) byte local157 = this.aByteArray12[local146] = local10.method5175();
				if (local157 == 0) {
					local129++;
				}
				if (local157 >= 1 && local157 <= 3) {
					local131++;
				}
				if (local157 == 2) {
					local133++;
				}
			}
		}
		local146 = this.anInt549;
		@Pc(186) int local186 = local146;
		local146 += this.anInt562;
		@Pc(193) int local193 = local146;
		if (local78) {
			local146 += this.anInt567;
		}
		@Pc(202) int local202 = local146;
		local146 += this.anInt567;
		@Pc(209) int local209 = local146;
		if (local91 == 255) {
			local146 += this.anInt567;
		}
		@Pc(221) int local221 = local146;
		if (local99 == 1) {
			local146 += this.anInt567;
		}
		@Pc(233) int local233 = local146;
		if (local107 == 1) {
			local146 += this.anInt562;
		}
		@Pc(243) int local243 = local146;
		if (local95 == 1) {
			local146 += this.anInt567;
		}
		@Pc(255) int local255 = local146;
		local146 += local123;
		@Pc(261) int local261 = local146;
		if (local103 == 1) {
			local146 += this.anInt567 * 2;
		}
		@Pc(273) int local273 = local146;
		local146 += local127;
		@Pc(279) int local279 = local146;
		local146 += this.anInt567 * 2;
		@Pc(288) int local288 = local146;
		local146 += local111;
		@Pc(294) int local294 = local146;
		local146 += local115;
		@Pc(300) int local300 = local146;
		local146 += local119;
		@Pc(306) int local306 = local146;
		local146 += local129 * 6;
		@Pc(314) int local314 = local146;
		local146 += local131 * 6;
		@Pc(322) int local322 = local146;
		local146 += local131 * 6;
		@Pc(330) int local330 = local146;
		local146 += local131;
		@Pc(336) int local336 = local146;
		local146 += local131;
		@Pc(342) int local342 = local146;
		local146 += local131 + local133 * 2;
		this.aShortArray32 = new short[this.anInt567];
		this.anIntArray38 = new int[this.anInt562];
		if (this.anInt549 > 0) {
			if (local133 > 0) {
				this.aByteArray16 = new byte[local133];
				this.aByteArray14 = new byte[local133];
			}
			this.aShortArray21 = new short[this.anInt549];
			if (local131 > 0) {
				this.aShortArray30 = new short[local131];
				this.aByteArray15 = new byte[local131];
				this.aShortArray31 = new short[local131];
				this.aShortArray33 = new short[local131];
				this.aByteArray7 = new byte[local131];
				this.aByteArray9 = new byte[local131];
			}
			this.aShortArray28 = new short[this.anInt549];
			this.aShortArray29 = new short[this.anInt549];
		}
		if (local78) {
			this.aByteArray11 = new byte[this.anInt567];
		}
		if (local107 == 1) {
			this.anIntArray39 = new int[this.anInt562];
		}
		this.aShortArray27 = new short[this.anInt567];
		if (local103 == 1) {
			this.aShortArray25 = new short[this.anInt567];
		}
		if (local99 == 1) {
			this.anIntArray37 = new int[this.anInt567];
		}
		local10.anInt6076 = local186;
		if (local103 == 1 && this.anInt549 > 0) {
			this.aByteArray13 = new byte[this.anInt567];
		}
		this.anIntArray40 = new int[this.anInt562];
		this.aShortArray24 = new short[this.anInt567];
		this.anIntArray36 = new int[this.anInt562];
		this.aShortArray23 = new short[this.anInt567];
		if (local95 == 1) {
			this.aByteArray8 = new byte[this.anInt567];
		}
		if (local91 == 255) {
			this.aByteArray10 = new byte[this.anInt567];
		} else {
			this.aByte5 = (byte) local91;
		}
		local15.anInt6076 = local288;
		local20.anInt6076 = local294;
		local25.anInt6076 = local300;
		local30.anInt6076 = local233;
		@Pc(532) int local532 = 0;
		@Pc(534) int local534 = 0;
		@Pc(536) int local536 = 0;
		@Pc(544) int local544;
		for (@Pc(538) int local538 = 0; local538 < this.anInt562; local538++) {
			local544 = local10.method5185();
			@Pc(546) int local546 = 0;
			if ((local544 & 0x1) != 0) {
				local546 = local15.method5212();
			}
			@Pc(559) int local559 = 0;
			if ((local544 & 0x2) != 0) {
				local559 = local20.method5212();
			}
			@Pc(572) int local572 = 0;
			if ((local544 & 0x4) != 0) {
				local572 = local25.method5212();
			}
			this.anIntArray36[local538] = local532 + local546;
			this.anIntArray40[local538] = local559 + local534;
			this.anIntArray38[local538] = local536 + local572;
			local532 = this.anIntArray36[local538];
			local534 = this.anIntArray40[local538];
			local536 = this.anIntArray38[local538];
			if (local107 == 1) {
				this.anIntArray39[local538] = local30.method5185();
			}
		}
		local10.anInt6076 = local279;
		local15.anInt6076 = local193;
		local20.anInt6076 = local209;
		local25.anInt6076 = local243;
		local30.anInt6076 = local221;
		local39.anInt6076 = local261;
		local44.anInt6076 = local273;
		for (local544 = 0; local544 < this.anInt567; local544++) {
			this.aShortArray24[local544] = (short) local10.method5187();
			if (local78) {
				this.aByteArray11[local544] = local15.method5175();
			}
			if (local91 == 255) {
				this.aByteArray10[local544] = local20.method5175();
			}
			if (local95 == 1) {
				this.aByteArray8[local544] = local25.method5175();
			}
			if (local99 == 1) {
				this.anIntArray37[local544] = local30.method5185();
			}
			if (local103 == 1) {
				this.aShortArray25[local544] = (short) (local39.method5187() - 1);
			}
			if (this.aByteArray13 != null) {
				if (this.aShortArray25[local544] == -1) {
					this.aByteArray13[local544] = -1;
				} else {
					this.aByteArray13[local544] = (byte) (local44.method5185() - 1);
				}
			}
		}
		local10.anInt6076 = local255;
		this.anInt554 = -1;
		local15.anInt6076 = local202;
		@Pc(770) short local770 = 0;
		@Pc(772) short local772 = 0;
		@Pc(774) short local774 = 0;
		@Pc(776) short local776 = 0;
		@Pc(784) int local784;
		for (@Pc(778) int local778 = 0; local778 < this.anInt567; local778++) {
			local784 = local15.method5185();
			if (local784 == 1) {
				local770 = (short) (local776 + local10.method5212());
				local772 = (short) (local10.method5212() + local770);
				local774 = (short) (local772 + local10.method5212());
				local776 = local774;
				this.aShortArray27[local778] = local770;
				this.aShortArray23[local778] = local772;
				this.aShortArray32[local778] = local774;
				if (this.anInt554 < local770) {
					this.anInt554 = local770;
				}
				if (local772 > this.anInt554) {
					this.anInt554 = local772;
				}
				if (this.anInt554 < local774) {
					this.anInt554 = local774;
				}
			}
			if (local784 == 2) {
				local772 = local774;
				local774 = (short) (local10.method5212() + local776);
				local776 = local774;
				this.aShortArray27[local778] = local770;
				this.aShortArray23[local778] = local772;
				this.aShortArray32[local778] = local774;
				if (this.anInt554 < local774) {
					this.anInt554 = local774;
				}
			}
			if (local784 == 3) {
				local770 = local774;
				local774 = (short) (local10.method5212() + local776);
				this.aShortArray27[local778] = local770;
				local776 = local774;
				this.aShortArray23[local778] = local772;
				this.aShortArray32[local778] = local774;
				if (this.anInt554 < local774) {
					this.anInt554 = local774;
				}
			}
			if (local784 == 4) {
				@Pc(943) short local943 = local770;
				local770 = local772;
				local772 = local943;
				local774 = (short) (local776 + local10.method5212());
				local776 = local774;
				this.aShortArray27[local778] = local770;
				this.aShortArray23[local778] = local943;
				this.aShortArray32[local778] = local774;
				if (local774 > this.anInt554) {
					this.anInt554 = local774;
				}
			}
		}
		this.anInt554++;
		local10.anInt6076 = local306;
		local15.anInt6076 = local314;
		local20.anInt6076 = local322;
		local25.anInt6076 = local330;
		local30.anInt6076 = local336;
		local39.anInt6076 = local342;
		@Pc(1022) int local1022;
		for (local784 = 0; local784 < this.anInt549; local784++) {
			local1022 = this.aByteArray12[local784] & 0xFF;
			if (local1022 == 0) {
				this.aShortArray28[local784] = (short) local10.method5187();
				this.aShortArray29[local784] = (short) local10.method5187();
				this.aShortArray21[local784] = (short) local10.method5187();
			}
			if (local1022 == 1) {
				this.aShortArray28[local784] = (short) local15.method5187();
				this.aShortArray29[local784] = (short) local15.method5187();
				this.aShortArray21[local784] = (short) local15.method5187();
				this.aShortArray30[local784] = (short) local20.method5187();
				this.aShortArray33[local784] = (short) local20.method5187();
				this.aShortArray31[local784] = (short) local20.method5187();
				this.aByteArray9[local784] = local25.method5175();
				this.aByteArray15[local784] = local30.method5175();
				this.aByteArray7[local784] = local39.method5175();
			}
			if (local1022 == 2) {
				this.aShortArray28[local784] = (short) local15.method5187();
				this.aShortArray29[local784] = (short) local15.method5187();
				this.aShortArray21[local784] = (short) local15.method5187();
				this.aShortArray30[local784] = (short) local20.method5187();
				this.aShortArray33[local784] = (short) local20.method5187();
				this.aShortArray31[local784] = (short) local20.method5187();
				this.aByteArray9[local784] = local25.method5175();
				this.aByteArray15[local784] = local30.method5175();
				this.aByteArray7[local784] = local39.method5175();
				this.aByteArray16[local784] = local39.method5175();
				this.aByteArray14[local784] = local39.method5175();
			}
			if (local1022 == 3) {
				this.aShortArray28[local784] = (short) local15.method5187();
				this.aShortArray29[local784] = (short) local15.method5187();
				this.aShortArray21[local784] = (short) local15.method5187();
				this.aShortArray30[local784] = (short) local20.method5187();
				this.aShortArray33[local784] = (short) local20.method5187();
				this.aShortArray31[local784] = (short) local20.method5187();
				this.aByteArray9[local784] = local25.method5175();
				this.aByteArray15[local784] = local30.method5175();
				this.aByteArray7[local784] = local39.method5175();
			}
		}
		if (!local87) {
			return;
		}
		local10.anInt6076 = local146;
		local1022 = local10.method5185();
		@Pc(1310) int local1310;
		@Pc(1316) int local1316;
		if (local1022 > 0) {
			this.aClass174Array1 = new Class174[local1022];
			for (local1310 = 0; local1310 < local1022; local1310++) {
				local1316 = local10.method5187();
				@Pc(1320) int local1320 = local10.method5187();
				@Pc(1328) byte local1328;
				if (local91 == 255) {
					local1328 = this.aByteArray10[local1320];
				} else {
					local1328 = (byte) local91;
				}
				this.aClass174Array1[local1310] = new Class174(local1316, this.aShortArray27[local1320], this.aShortArray23[local1320], this.aShortArray32[local1320], local1328);
			}
		}
		local1310 = local10.method5185();
		if (local1310 <= 0) {
			return;
		}
		this.aClass212Array1 = new Class212[local1310];
		for (local1316 = 0; local1316 < local1310; local1316++) {
			this.aClass212Array1[local1316] = new Class212(local10.method5187(), local10.method5187());
		}
		return;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ISS)V")
	public void method443(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt567; local3++) {
			if (this.aShortArray24[local3] == arg0) {
				this.aShortArray24[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BSLclient!br;I)I")
	private int method444(@OriginalArg(1) short arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray36[arg2];
		@Pc(15) int local15 = arg1.anIntArray40[arg2];
		@Pc(20) int local20 = arg1.anIntArray38[arg2];
		for (@Pc(27) int local27 = 0; local27 < this.anInt562; local27++) {
			if (this.anIntArray36[local27] == local10 && local15 == this.anIntArray40[local27] && this.anIntArray38[local27] == local20) {
				this.aShortArray22[local27] |= arg0;
				return local27;
			}
		}
		this.anIntArray36[this.anInt562] = local10;
		this.anIntArray40[this.anInt562] = local15;
		this.anIntArray38[this.anInt562] = local20;
		this.aShortArray22[this.anInt562] = arg0;
		this.anIntArray39[this.anInt562] = arg1.anIntArray39 == null ? -1 : arg1.anIntArray39[arg2];
		return this.anInt562++;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(SBIBIBSBI)I")
	public int method445(@OriginalArg(0) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray27[this.anInt567] = (short) arg1;
		this.aShortArray23[this.anInt567] = (short) arg7;
		this.aShortArray32[this.anInt567] = (short) arg3;
		this.aByteArray11[this.anInt567] = arg2;
		this.aByteArray13[this.anInt567] = arg4;
		this.aShortArray24[this.anInt567] = arg5;
		this.aByteArray8[this.anInt567] = arg6;
		this.aShortArray25[this.anInt567] = arg0;
		return this.anInt567++;
	}
}
