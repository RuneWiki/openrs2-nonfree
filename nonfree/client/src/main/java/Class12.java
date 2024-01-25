import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class12 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "[S")
	public short[] aShortArray2;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "[I")
	public int[] anIntArray41;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "[I")
	public int[] anIntArray42;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "[S")
	public short[] aShortArray3;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "[I")
	public int[] anIntArray44;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "[S")
	public short[] aShortArray4;

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "[S")
	public short[] aShortArray5;

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "[I")
	public int[] anIntArray45;

	@OriginalMember(owner = "client!ap", name = "A", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!ap", name = "B", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!ap", name = "E", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!ap", name = "G", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!ap", name = "H", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!ap", name = "J", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!ap", name = "M", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!ap", name = "N", descriptor = "[I")
	public int[] anIntArray46;

	@OriginalMember(owner = "client!ap", name = "Q", descriptor = "[Lclient!pd;")
	public Class154[] aClass154Array1;

	@OriginalMember(owner = "client!ap", name = "R", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!ap", name = "V", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!ap", name = "Y", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!ap", name = "Z", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ap", name = "cb", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!ap", name = "db", descriptor = "[Lclient!hp;")
	public Class85[] aClass85Array1;

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "I")
	public int anInt321 = 0;

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!ap", name = "W", descriptor = "I")
	public int anInt330 = 0;

	@OriginalMember(owner = "client!ap", name = "bb", descriptor = "I")
	public int anInt333 = 0;

	@OriginalMember(owner = "client!ap", name = "ab", descriptor = "I")
	public int anInt332 = 0;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "([B)V")
	public Class12(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method378(arg0);
		} else {
			this.method376(arg0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(III)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray8 = new byte[arg1];
		this.aShortArray6 = new short[arg1];
		this.anIntArray41 = new int[arg0];
		this.aByteArray11 = new byte[arg1];
		this.aByteArray14 = new byte[arg1];
		this.anIntArray45 = new int[arg0];
		this.anIntArray42 = new int[arg0];
		this.aShortArray11 = new short[arg1];
		this.aShortArray2 = new short[arg1];
		this.aShortArray12 = new short[arg1];
		this.aByteArray10 = new byte[arg1];
		this.anIntArray46 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray12 = new byte[arg2];
			this.aShortArray8 = new short[arg2];
			this.aByteArray13 = new byte[arg2];
			this.aShortArray10 = new short[arg2];
			this.aShortArray9 = new short[arg2];
			this.aShortArray3 = new short[arg2];
			this.aByteArray7 = new byte[arg2];
			this.aByteArray9 = new byte[arg2];
			this.aShortArray14 = new short[arg2];
			this.aByteArray5 = new byte[arg2];
			this.aByteArray6 = new byte[arg2];
			this.aShortArray13 = new short[arg2];
		}
		this.aShortArray5 = new short[arg1];
		this.anIntArray44 = new int[arg1];
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "([Lclient!ap;I)V")
	public Class12(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) int arg1) {
		this.anInt333 = 0;
		this.anInt332 = 0;
		this.anInt330 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) boolean local43 = false;
		this.aByte4 = -1;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class12 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt333 += local54.anInt333;
				this.anInt330 += local54.anInt330;
				this.anInt332 += local54.anInt332;
				if (local54.aClass85Array1 != null) {
					local31 += local54.aClass85Array1.length;
				}
				if (local54.aClass154Array1 != null) {
					local29 += local54.aClass154Array1.length;
				}
				local33 |= local54.aByteArray10 != null;
				local43 |= local54.anIntArray44 != null;
				local39 |= local54.aByteArray8 != null;
				local37 |= local54.aByteArray11 != null;
				if (local54.aByteArray14 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local54.aByte4;
					}
					if (local54.aByte4 != this.aByte4) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local41 |= local54.aShortArray6 != null;
			}
		}
		this.anIntArray46 = new int[this.anInt332];
		if (local41) {
			this.aShortArray6 = new short[this.anInt330];
		}
		if (local33) {
			this.aByteArray10 = new byte[this.anInt330];
		}
		this.aShortArray12 = new short[this.anInt330];
		this.anIntArray41 = new int[this.anInt332];
		this.aShortArray5 = new short[this.anInt330];
		if (local43) {
			this.anIntArray44 = new int[this.anInt330];
		}
		this.aShortArray7 = new short[this.anInt332];
		this.aShortArray4 = new short[this.anInt330];
		this.aShortArray2 = new short[this.anInt330];
		if (this.anInt333 > 0) {
			this.aShortArray8 = new short[this.anInt333];
			this.aShortArray3 = new short[this.anInt333];
			this.aByteArray12 = new byte[this.anInt333];
			this.aShortArray10 = new short[this.anInt333];
			this.aByteArray13 = new byte[this.anInt333];
			this.aByteArray9 = new byte[this.anInt333];
			this.aShortArray13 = new short[this.anInt333];
			this.aByteArray5 = new byte[this.anInt333];
			this.aShortArray14 = new short[this.anInt333];
			this.aByteArray6 = new byte[this.anInt333];
			this.aShortArray9 = new short[this.anInt333];
			this.aByteArray7 = new byte[this.anInt333];
		}
		if (local29 > 0) {
			this.aClass154Array1 = new Class154[local29];
		}
		if (local31 > 0) {
			this.aClass85Array1 = new Class85[local31];
		}
		this.aShortArray11 = new short[this.anInt330];
		this.anIntArray45 = new int[this.anInt332];
		this.anIntArray42 = new int[this.anInt332];
		if (local35) {
			this.aByteArray14 = new byte[this.anInt330];
		}
		if (local39) {
			this.aByteArray8 = new byte[this.anInt330];
		}
		if (local37) {
			this.aByteArray11 = new byte[this.anInt330];
		}
		this.anInt333 = 0;
		this.anInt332 = 0;
		this.anInt330 = 0;
		local29 = 0;
		local31 = 0;
		@Pc(559) int local559;
		@Pc(570) int local570;
		for (@Pc(354) int local354 = 0; local354 < arg1; local354++) {
			@Pc(361) short local361 = (short) (0x1 << local354);
			@Pc(365) Class12 local365 = arg0[local354];
			if (local365 != null) {
				for (@Pc(369) int local369 = 0; local369 < local365.anInt330; local369++) {
					if (local33 && local365.aByteArray10 != null) {
						this.aByteArray10[this.anInt330] = local365.aByteArray10[local369];
					}
					if (local35) {
						if (local365.aByteArray14 == null) {
							this.aByteArray14[this.anInt330] = local365.aByte4;
						} else {
							this.aByteArray14[this.anInt330] = local365.aByteArray14[local369];
						}
					}
					if (local37 && local365.aByteArray11 != null) {
						this.aByteArray11[this.anInt330] = local365.aByteArray11[local369];
					}
					if (local41) {
						if (local365.aShortArray6 == null) {
							this.aShortArray6[this.anInt330] = -1;
						} else {
							this.aShortArray6[this.anInt330] = local365.aShortArray6[local369];
						}
					}
					if (local43) {
						if (local365.anIntArray44 == null) {
							this.anIntArray44[this.anInt330] = -1;
						} else {
							this.anIntArray44[this.anInt330] = local365.anIntArray44[local369];
						}
					}
					this.aShortArray5[this.anInt330] = (short) this.method377(local365.aShortArray5[local369], local365, local361);
					this.aShortArray11[this.anInt330] = (short) this.method377(local365.aShortArray11[local369], local365, local361);
					this.aShortArray12[this.anInt330] = (short) this.method377(local365.aShortArray12[local369], local365, local361);
					this.aShortArray4[this.anInt330] = local361;
					this.aShortArray2[this.anInt330] = local365.aShortArray2[local369];
					this.anInt330++;
				}
				@Pc(546) int local546;
				if (local365.aClass154Array1 != null) {
					for (local546 = 0; local546 < local365.aClass154Array1.length; local546++) {
						local559 = this.method377(local365.aClass154Array1[local546].anInt4578, local365, local361);
						local570 = this.method377(local365.aClass154Array1[local546].anInt4573, local365, local361);
						@Pc(581) int local581 = this.method377(local365.aClass154Array1[local546].anInt4580, local365, local361);
						this.aClass154Array1[local29] = new Class154(local365.aClass154Array1[local546].anInt4572, local559, local570, local581, local365.aClass154Array1[local546].aByte47);
						local29++;
					}
				}
				if (local365.aClass85Array1 != null) {
					for (local546 = 0; local546 < local365.aClass85Array1.length; local546++) {
						local559 = this.method377(local365.aClass85Array1[local546].anInt2514, local365, local361);
						this.aClass85Array1[local31] = new Class85(local365.aClass85Array1[local546].anInt2518, local559);
						local31++;
					}
				}
			}
		}
		this.anInt321 = this.anInt332;
		@Pc(664) int local664 = 0;
		for (@Pc(666) int local666 = 0; local666 < arg1; local666++) {
			@Pc(673) short local673 = (short) (0x1 << local666);
			@Pc(677) Class12 local677 = arg0[local666];
			if (local677 != null) {
				for (local559 = 0; local559 < local677.anInt330; local559++) {
					if (local39) {
						this.aByteArray8[local664++] = (byte) (local677.aByteArray8 == null || local677.aByteArray8[local559] == -1 ? -1 : this.anInt333 + local677.aByteArray8[local559]);
					}
				}
				for (local570 = 0; local570 < local677.anInt333; local570++) {
					@Pc(729) byte local729 = this.aByteArray13[this.anInt333] = local677.aByteArray13[local570];
					if (local729 == 0) {
						this.aShortArray8[this.anInt333] = (short) this.method377(local677.aShortArray8[local570], local677, local673);
						this.aShortArray10[this.anInt333] = (short) this.method377(local677.aShortArray10[local570], local677, local673);
						this.aShortArray13[this.anInt333] = (short) this.method377(local677.aShortArray13[local570], local677, local673);
					}
					if (local729 >= 1 && local729 <= 3) {
						this.aShortArray8[this.anInt333] = local677.aShortArray8[local570];
						this.aShortArray10[this.anInt333] = local677.aShortArray10[local570];
						this.aShortArray13[this.anInt333] = local677.aShortArray13[local570];
						this.aShortArray3[this.anInt333] = local677.aShortArray3[local570];
						this.aShortArray9[this.anInt333] = local677.aShortArray9[local570];
						this.aShortArray14[this.anInt333] = local677.aShortArray14[local570];
						this.aByteArray7[this.anInt333] = local677.aByteArray7[local570];
						this.aByteArray6[this.anInt333] = local677.aByteArray6[local570];
						this.aByteArray5[this.anInt333] = local677.aByteArray5[local570];
					}
					if (local729 == 2) {
						this.aByteArray9[this.anInt333] = local677.aByteArray9[local570];
						this.aByteArray12[this.anInt333] = local677.aByteArray12[local570];
					}
					this.anInt333++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)I")
	public int method365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt332; local7++) {
			if (this.anIntArray46[local7] == arg2 && arg1 == this.anIntArray41[local7] && this.anIntArray42[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray46[this.anInt332] = arg2;
		this.anIntArray41[this.anInt332] = arg1;
		this.anIntArray42[this.anInt332] = arg0;
		this.anInt321 = this.anInt332 + 1;
		return this.anInt332++;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)[[I")
	public int[][] method367() {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt330; local18++) {
			@Pc(25) int local25 = this.anIntArray44[local18];
			if (local25 >= 0) {
				@Pc(34) int local34 = local14[local25]++;
				if (local16 < local25) {
					local16 = local25;
				}
			}
		}
		@Pc(56) int[][] local56 = new int[local16 + 1][];
		for (@Pc(58) int local58 = 0; local58 <= local16; local58++) {
			local56[local58] = new int[local14[local58]];
			local14[local58] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt330; local81++) {
			@Pc(88) int local88 = this.anIntArray44[local81];
			if (local88 >= 0) {
				local56[local88][local14[local88]++] = local81;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(SBBSSSSSBI)B")
	public byte method368() {
		if (this.anInt333 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray13[this.anInt333] = 3;
		this.aShortArray8[this.anInt333] = 0;
		this.aShortArray10[this.anInt333] = 32767;
		this.aShortArray13[this.anInt333] = 0;
		this.aShortArray3[this.anInt333] = 1024;
		this.aShortArray9[this.anInt333] = 1024;
		this.aShortArray14[this.anInt333] = 1024;
		this.aByteArray7[this.anInt333] = 0;
		this.aByteArray6[this.anInt333] = 0;
		this.aByteArray5[this.anInt333] = 0;
		return (byte) this.anInt333++;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)[[I")
	public int[][] method369() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt321; local12++) {
			@Pc(19) int local19 = this.anIntArray45[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(48) int[][] local48 = new int[local10 + 1][];
		for (@Pc(50) int local50 = 0; local50 <= local10; local50++) {
			local48[local50] = new int[local8[local50]];
			local8[local50] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt321; local73++) {
			@Pc(80) int local80 = this.anIntArray45[local73];
			if (local80 >= 0) {
				local48[local80][local8[local80]++] = local73;
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBII)V")
	public void method371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt332; local3++) {
			this.anIntArray46[local3] += arg1;
			this.anIntArray41[local3] += arg0;
			this.anIntArray42[local3] += arg2;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(SBS)V")
	public void method372(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(17) int local17 = 0; local17 < this.anInt330; local17++) {
			if (this.aShortArray2[local17] == arg0) {
				this.aShortArray2[local17] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIBBSIBIS)I")
	public int method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) short arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(8) short arg7) {
		this.aShortArray5[this.anInt330] = (short) arg0;
		this.aShortArray11[this.anInt330] = (short) arg5;
		this.aShortArray12[this.anInt330] = (short) arg1;
		this.aByteArray10[this.anInt330] = arg3;
		this.aByteArray8[this.anInt330] = arg6;
		this.aShortArray2[this.anInt330] = arg7;
		this.aByteArray11[this.anInt330] = arg2;
		this.aShortArray6[this.anInt330] = arg4;
		return this.anInt330++;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BSS)V")
	public void method374(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray6 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt330; local11++) {
			if (arg0 == this.aShortArray6[local11]) {
				this.aShortArray6[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[B)V")
	private void method376(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub7 local14 = new Class1_Sub7(arg0);
		@Pc(19) Class1_Sub7 local19 = new Class1_Sub7(arg0);
		@Pc(24) Class1_Sub7 local24 = new Class1_Sub7(arg0);
		@Pc(29) Class1_Sub7 local29 = new Class1_Sub7(arg0);
		@Pc(34) Class1_Sub7 local34 = new Class1_Sub7(arg0);
		local14.anInt3368 = arg0.length - 18;
		this.anInt332 = local14.method3115();
		this.anInt330 = local14.method3115();
		this.anInt333 = local14.method3141();
		@Pc(59) int local59 = local14.method3141();
		@Pc(63) int local63 = local14.method3141();
		@Pc(67) int local67 = local14.method3141();
		@Pc(71) int local71 = local14.method3141();
		@Pc(75) int local75 = local14.method3141();
		@Pc(79) int local79 = local14.method3115();
		@Pc(83) int local83 = local14.method3115();
		@Pc(87) int local87 = local14.method3115();
		@Pc(91) int local91 = local14.method3115();
		@Pc(100) int local100 = this.anInt332;
		@Pc(102) int local102 = local100;
		local100 += this.anInt330;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt330;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt330;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt330;
		}
		@Pc(139) int local139 = local100;
		if (local75 == 1) {
			local100 += this.anInt332;
		}
		@Pc(149) int local149 = local100;
		if (local67 == 1) {
			local100 += this.anInt330;
		}
		@Pc(159) int local159 = local100;
		local100 += local91;
		@Pc(165) int local165 = local100;
		local100 += this.anInt330 * 2;
		@Pc(174) int local174 = local100;
		local100 += this.anInt333 * 6;
		@Pc(183) int local183 = local100;
		local100 += local79;
		@Pc(189) int local189 = local100;
		local100 += local83;
		this.anIntArray41 = new int[this.anInt332];
		this.aShortArray12 = new short[this.anInt330];
		this.anIntArray46 = new int[this.anInt332];
		if (local63 == 255) {
			this.aByteArray14 = new byte[this.anInt330];
		} else {
			this.aByte4 = (byte) local63;
		}
		if (this.anInt333 > 0) {
			this.aByteArray13 = new byte[this.anInt333];
			this.aShortArray10 = new short[this.anInt333];
			this.aShortArray8 = new short[this.anInt333];
			this.aShortArray13 = new short[this.anInt333];
		}
		local14.anInt3368 = 0;
		this.aShortArray5 = new short[this.anInt330];
		if (local71 == 1) {
			this.anIntArray44 = new int[this.anInt330];
		}
		this.aShortArray11 = new short[this.anInt330];
		this.anIntArray42 = new int[this.anInt332];
		if (local75 == 1) {
			this.anIntArray45 = new int[this.anInt332];
		}
		if (local59 == 1) {
			this.aShortArray6 = new short[this.anInt330];
			this.aByteArray10 = new byte[this.anInt330];
			this.aByteArray8 = new byte[this.anInt330];
		}
		this.aShortArray2 = new short[this.anInt330];
		if (local67 == 1) {
			this.aByteArray11 = new byte[this.anInt330];
		}
		local19.anInt3368 = local183;
		local24.anInt3368 = local189;
		local29.anInt3368 = local100;
		local34.anInt3368 = local139;
		@Pc(338) int local338 = 0;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		@Pc(350) int local350;
		@Pc(352) int local352;
		for (@Pc(344) int local344 = 0; local344 < this.anInt332; local344++) {
			local350 = local14.method3141();
			local352 = 0;
			if ((local350 & 0x1) != 0) {
				local352 = local19.method3135();
			}
			@Pc(365) int local365 = 0;
			if ((local350 & 0x2) != 0) {
				local365 = local24.method3135();
			}
			@Pc(375) int local375 = 0;
			if ((local350 & 0x4) != 0) {
				local375 = local29.method3135();
			}
			this.anIntArray46[local344] = local352 + local338;
			this.anIntArray41[local344] = local340 + local365;
			this.anIntArray42[local344] = local375 + local342;
			local342 = this.anIntArray42[local344];
			local340 = this.anIntArray41[local344];
			local338 = this.anIntArray46[local344];
			if (local75 == 1) {
				this.anIntArray45[local344] = local34.method3141();
			}
		}
		local14.anInt3368 = local165;
		local19.anInt3368 = local129;
		local24.anInt3368 = local109;
		local29.anInt3368 = local149;
		local34.anInt3368 = local119;
		for (local350 = 0; local350 < this.anInt330; local350++) {
			this.aShortArray2[local350] = (short) local14.method3115();
			if (local59 == 1) {
				local352 = local19.method3141();
				if ((local352 & 0x1) == 1) {
					local7 = true;
					this.aByteArray10[local350] = 1;
				} else {
					this.aByteArray10[local350] = 0;
				}
				if ((local352 & 0x2) == 2) {
					this.aByteArray8[local350] = (byte) (local352 >> 2);
					this.aShortArray6[local350] = this.aShortArray2[local350];
					this.aShortArray2[local350] = 127;
					if (this.aShortArray6[local350] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray8[local350] = -1;
					this.aShortArray6[local350] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray14[local350] = local24.method3130();
			}
			if (local67 == 1) {
				this.aByteArray11[local350] = local29.method3130();
			}
			if (local71 == 1) {
				this.anIntArray44[local350] = local34.method3141();
			}
		}
		local14.anInt3368 = local159;
		this.anInt321 = -1;
		local19.anInt3368 = local102;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(614) int local614;
		for (@Pc(608) int local608 = 0; local608 < this.anInt330; local608++) {
			local614 = local19.method3141();
			if (local614 == 1) {
				local600 = (short) (local14.method3135() + local606);
				local602 = (short) (local14.method3135() + local600);
				local604 = (short) (local14.method3135() + local602);
				this.aShortArray5[local608] = local600;
				local606 = local604;
				this.aShortArray11[local608] = local602;
				this.aShortArray12[local608] = local604;
				if (this.anInt321 < local600) {
					this.anInt321 = local600;
				}
				if (this.anInt321 < local602) {
					this.anInt321 = local602;
				}
				if (this.anInt321 < local604) {
					this.anInt321 = local604;
				}
			}
			if (local614 == 2) {
				local602 = local604;
				local604 = (short) (local606 + local14.method3135());
				local606 = local604;
				this.aShortArray5[local608] = local600;
				this.aShortArray11[local608] = local602;
				this.aShortArray12[local608] = local604;
				if (this.anInt321 < local604) {
					this.anInt321 = local604;
				}
			}
			if (local614 == 3) {
				local600 = local604;
				local604 = (short) (local14.method3135() + local606);
				this.aShortArray5[local608] = local600;
				local606 = local604;
				this.aShortArray11[local608] = local602;
				this.aShortArray12[local608] = local604;
				if (this.anInt321 < local604) {
					this.anInt321 = local604;
				}
			}
			if (local614 == 4) {
				@Pc(771) short local771 = local600;
				local600 = local602;
				local604 = (short) (local14.method3135() + local606);
				local602 = local771;
				local606 = local604;
				this.aShortArray5[local608] = local600;
				this.aShortArray11[local608] = local771;
				this.aShortArray12[local608] = local604;
				if (this.anInt321 < local604) {
					this.anInt321 = local604;
				}
			}
		}
		this.anInt321++;
		local14.anInt3368 = local174;
		for (local614 = 0; local614 < this.anInt333; local614++) {
			this.aByteArray13[local614] = 0;
			this.aShortArray8[local614] = (short) local14.method3115();
			this.aShortArray10[local614] = (short) local14.method3115();
			this.aShortArray13[local614] = (short) local14.method3115();
		}
		if (this.aByteArray8 != null) {
			@Pc(863) boolean local863 = false;
			for (@Pc(865) int local865 = 0; local865 < this.anInt330; local865++) {
				@Pc(874) int local874 = this.aByteArray8[local865] & 0xFF;
				if (local874 != 255) {
					if ((this.aShortArray8[local874] & 0xFFFF) == this.aShortArray5[local865] && this.aShortArray11[local865] == (this.aShortArray10[local874] & 0xFFFF) && (this.aShortArray13[local874] & 0xFFFF) == this.aShortArray12[local865]) {
						this.aByteArray8[local865] = -1;
					} else {
						local863 = true;
					}
				}
			}
			if (!local863) {
				this.aByteArray8 = null;
			}
		}
		if (!local9) {
			this.aShortArray6 = null;
		}
		if (!local7) {
			this.aByteArray10 = null;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!ap;IS)I")
	private int method377(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray46[arg0];
		@Pc(20) int local20 = arg1.anIntArray41[arg0];
		@Pc(25) int local25 = arg1.anIntArray42[arg0];
		for (@Pc(27) int local27 = 0; local27 < this.anInt332; local27++) {
			if (this.anIntArray46[local27] == local10 && this.anIntArray41[local27] == local20 && local25 == this.anIntArray42[local27]) {
				this.aShortArray7[local27] |= arg2;
				return local27;
			}
		}
		this.anIntArray46[this.anInt332] = local10;
		this.anIntArray41[this.anInt332] = local20;
		this.anIntArray42[this.anInt332] = local25;
		this.aShortArray7[this.anInt332] = arg2;
		this.anIntArray45[this.anInt332] = arg1.anIntArray45 == null ? -1 : arg1.anIntArray45[arg0];
		return this.anInt332++;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([BI)V")
	private void method378(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub7 local10 = new Class1_Sub7(arg0);
		@Pc(15) Class1_Sub7 local15 = new Class1_Sub7(arg0);
		@Pc(20) Class1_Sub7 local20 = new Class1_Sub7(arg0);
		@Pc(25) Class1_Sub7 local25 = new Class1_Sub7(arg0);
		@Pc(30) Class1_Sub7 local30 = new Class1_Sub7(arg0);
		@Pc(35) Class1_Sub7 local35 = new Class1_Sub7(arg0);
		@Pc(40) Class1_Sub7 local40 = new Class1_Sub7(arg0);
		local10.anInt3368 = arg0.length - 23;
		this.anInt332 = local10.method3115();
		this.anInt330 = local10.method3115();
		this.anInt333 = local10.method3141();
		@Pc(65) int local65 = local10.method3141();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(89) int local89 = local10.method3141();
		@Pc(93) int local93 = local10.method3141();
		@Pc(97) int local97 = local10.method3141();
		@Pc(101) int local101 = local10.method3141();
		@Pc(105) int local105 = local10.method3141();
		@Pc(109) int local109 = local10.method3115();
		@Pc(113) int local113 = local10.method3115();
		@Pc(117) int local117 = local10.method3115();
		@Pc(121) int local121 = local10.method3115();
		@Pc(125) int local125 = local10.method3115();
		@Pc(127) int local127 = 0;
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(144) int local144;
		if (this.anInt333 > 0) {
			local10.anInt3368 = 0;
			this.aByteArray13 = new byte[this.anInt333];
			for (local144 = 0; local144 < this.anInt333; local144++) {
				@Pc(155) byte local155 = this.aByteArray13[local144] = local10.method3130();
				if (local155 >= 1 && local155 <= 3) {
					local129++;
				}
				if (local155 == 0) {
					local127++;
				}
				if (local155 == 2) {
					local131++;
				}
			}
		}
		local144 = this.anInt333;
		@Pc(183) int local183 = local144;
		local144 += this.anInt332;
		@Pc(190) int local190 = local144;
		if (local76) {
			local144 += this.anInt330;
		}
		@Pc(199) int local199 = local144;
		local144 += this.anInt330;
		@Pc(206) int local206 = local144;
		if (local89 == 255) {
			local144 += this.anInt330;
		}
		@Pc(216) int local216 = local144;
		if (local97 == 1) {
			local144 += this.anInt330;
		}
		@Pc(226) int local226 = local144;
		if (local105 == 1) {
			local144 += this.anInt332;
		}
		@Pc(236) int local236 = local144;
		if (local93 == 1) {
			local144 += this.anInt330;
		}
		@Pc(248) int local248 = local144;
		local144 += local121;
		@Pc(254) int local254 = local144;
		if (local101 == 1) {
			local144 += this.anInt330 * 2;
		}
		@Pc(268) int local268 = local144;
		local144 += local125;
		@Pc(274) int local274 = local144;
		local144 += this.anInt330 * 2;
		@Pc(283) int local283 = local144;
		local144 += local109;
		@Pc(289) int local289 = local144;
		local144 += local113;
		@Pc(295) int local295 = local144;
		local144 += local117;
		@Pc(301) int local301 = local144;
		local144 += local127 * 6;
		@Pc(309) int local309 = local144;
		local144 += local129 * 6;
		@Pc(317) int local317 = local144;
		local144 += local129 * 6;
		@Pc(325) int local325 = local144;
		local144 += local129;
		@Pc(331) int local331 = local144;
		local144 += local129;
		@Pc(337) int local337 = local144;
		local144 += local131 * 2 + local129;
		if (local89 == 255) {
			this.aByteArray14 = new byte[this.anInt330];
		} else {
			this.aByte4 = (byte) local89;
		}
		if (local105 == 1) {
			this.anIntArray45 = new int[this.anInt332];
		}
		this.aShortArray5 = new short[this.anInt330];
		this.anIntArray46 = new int[this.anInt332];
		if (local101 == 1 && this.anInt333 > 0) {
			this.aByteArray8 = new byte[this.anInt330];
		}
		this.aShortArray11 = new short[this.anInt330];
		if (local76) {
			this.aByteArray10 = new byte[this.anInt330];
		}
		this.anIntArray42 = new int[this.anInt332];
		if (local97 == 1) {
			this.anIntArray44 = new int[this.anInt330];
		}
		if (local93 == 1) {
			this.aByteArray11 = new byte[this.anInt330];
		}
		this.aShortArray12 = new short[this.anInt330];
		local10.anInt3368 = local183;
		if (local101 == 1) {
			this.aShortArray6 = new short[this.anInt330];
		}
		if (this.anInt333 > 0) {
			this.aShortArray13 = new short[this.anInt333];
			this.aShortArray8 = new short[this.anInt333];
			if (local129 > 0) {
				this.aByteArray7 = new byte[local129];
				this.aByteArray5 = new byte[local129];
				this.aShortArray14 = new short[local129];
				this.aShortArray3 = new short[local129];
				this.aByteArray6 = new byte[local129];
				this.aShortArray9 = new short[local129];
			}
			this.aShortArray10 = new short[this.anInt333];
			if (local131 > 0) {
				this.aByteArray9 = new byte[local131];
				this.aByteArray12 = new byte[local131];
			}
		}
		this.aShortArray2 = new short[this.anInt330];
		this.anIntArray41 = new int[this.anInt332];
		local15.anInt3368 = local283;
		local20.anInt3368 = local289;
		local25.anInt3368 = local295;
		local30.anInt3368 = local226;
		@Pc(527) int local527 = 0;
		@Pc(529) int local529 = 0;
		@Pc(531) int local531 = 0;
		@Pc(539) int local539;
		for (@Pc(533) int local533 = 0; local533 < this.anInt332; local533++) {
			local539 = local10.method3141();
			@Pc(541) int local541 = 0;
			if ((local539 & 0x1) != 0) {
				local541 = local15.method3135();
			}
			@Pc(551) int local551 = 0;
			if ((local539 & 0x2) != 0) {
				local551 = local20.method3135();
			}
			@Pc(561) int local561 = 0;
			if ((local539 & 0x4) != 0) {
				local561 = local25.method3135();
			}
			this.anIntArray46[local533] = local541 + local527;
			this.anIntArray41[local533] = local551 + local529;
			this.anIntArray42[local533] = local561 + local531;
			local529 = this.anIntArray41[local533];
			local527 = this.anIntArray46[local533];
			local531 = this.anIntArray42[local533];
			if (local105 == 1) {
				this.anIntArray45[local533] = local30.method3141();
			}
		}
		local10.anInt3368 = local274;
		local15.anInt3368 = local190;
		local20.anInt3368 = local206;
		local25.anInt3368 = local236;
		local30.anInt3368 = local216;
		local35.anInt3368 = local254;
		local40.anInt3368 = local268;
		for (local539 = 0; local539 < this.anInt330; local539++) {
			this.aShortArray2[local539] = (short) local10.method3115();
			if (local76) {
				this.aByteArray10[local539] = local15.method3130();
			}
			if (local89 == 255) {
				this.aByteArray14[local539] = local20.method3130();
			}
			if (local93 == 1) {
				this.aByteArray11[local539] = local25.method3130();
			}
			if (local97 == 1) {
				this.anIntArray44[local539] = local30.method3141();
			}
			if (local101 == 1) {
				this.aShortArray6[local539] = (short) (local35.method3115() - 1);
			}
			if (this.aByteArray8 != null) {
				if (this.aShortArray6[local539] == -1) {
					this.aByteArray8[local539] = -1;
				} else {
					this.aByteArray8[local539] = (byte) (local40.method3141() - 1);
				}
			}
		}
		this.anInt321 = -1;
		local10.anInt3368 = local248;
		local15.anInt3368 = local199;
		@Pc(759) short local759 = 0;
		@Pc(761) short local761 = 0;
		@Pc(763) short local763 = 0;
		@Pc(765) short local765 = 0;
		@Pc(773) int local773;
		for (@Pc(767) int local767 = 0; local767 < this.anInt330; local767++) {
			local773 = local15.method3141();
			if (local773 == 1) {
				local759 = (short) (local10.method3135() + local765);
				local761 = (short) (local759 + local10.method3135());
				local763 = (short) (local761 + local10.method3135());
				local765 = local763;
				this.aShortArray5[local767] = local759;
				this.aShortArray11[local767] = local761;
				this.aShortArray12[local767] = local763;
				if (this.anInt321 < local759) {
					this.anInt321 = local759;
				}
				if (local761 > this.anInt321) {
					this.anInt321 = local761;
				}
				if (this.anInt321 < local763) {
					this.anInt321 = local763;
				}
			}
			if (local773 == 2) {
				local761 = local763;
				local763 = (short) (local765 + local10.method3135());
				local765 = local763;
				this.aShortArray5[local767] = local759;
				this.aShortArray11[local767] = local761;
				this.aShortArray12[local767] = local763;
				if (this.anInt321 < local763) {
					this.anInt321 = local763;
				}
			}
			if (local773 == 3) {
				local759 = local763;
				local763 = (short) (local765 + local10.method3135());
				this.aShortArray5[local767] = local759;
				local765 = local763;
				this.aShortArray11[local767] = local761;
				this.aShortArray12[local767] = local763;
				if (local763 > this.anInt321) {
					this.anInt321 = local763;
				}
			}
			if (local773 == 4) {
				@Pc(934) short local934 = local759;
				local759 = local761;
				local763 = (short) (local765 + local10.method3135());
				local761 = local934;
				this.aShortArray5[local767] = local759;
				local765 = local763;
				this.aShortArray11[local767] = local934;
				this.aShortArray12[local767] = local763;
				if (this.anInt321 < local763) {
					this.anInt321 = local763;
				}
			}
		}
		local10.anInt3368 = local301;
		this.anInt321++;
		local15.anInt3368 = local309;
		local20.anInt3368 = local317;
		local25.anInt3368 = local325;
		local30.anInt3368 = local331;
		local35.anInt3368 = local337;
		@Pc(1009) int local1009;
		for (local773 = 0; local773 < this.anInt333; local773++) {
			local1009 = this.aByteArray13[local773] & 0xFF;
			if (local1009 == 0) {
				this.aShortArray8[local773] = (short) local10.method3115();
				this.aShortArray10[local773] = (short) local10.method3115();
				this.aShortArray13[local773] = (short) local10.method3115();
			}
			if (local1009 == 1) {
				this.aShortArray8[local773] = (short) local15.method3115();
				this.aShortArray10[local773] = (short) local15.method3115();
				this.aShortArray13[local773] = (short) local15.method3115();
				this.aShortArray3[local773] = (short) local20.method3115();
				this.aShortArray9[local773] = (short) local20.method3115();
				this.aShortArray14[local773] = (short) local20.method3115();
				this.aByteArray7[local773] = local25.method3130();
				this.aByteArray6[local773] = local30.method3130();
				this.aByteArray5[local773] = local35.method3130();
			}
			if (local1009 == 2) {
				this.aShortArray8[local773] = (short) local15.method3115();
				this.aShortArray10[local773] = (short) local15.method3115();
				this.aShortArray13[local773] = (short) local15.method3115();
				this.aShortArray3[local773] = (short) local20.method3115();
				this.aShortArray9[local773] = (short) local20.method3115();
				this.aShortArray14[local773] = (short) local20.method3115();
				this.aByteArray7[local773] = local25.method3130();
				this.aByteArray6[local773] = local30.method3130();
				this.aByteArray5[local773] = local35.method3130();
				this.aByteArray9[local773] = local35.method3130();
				this.aByteArray12[local773] = local35.method3130();
			}
			if (local1009 == 3) {
				this.aShortArray8[local773] = (short) local15.method3115();
				this.aShortArray10[local773] = (short) local15.method3115();
				this.aShortArray13[local773] = (short) local15.method3115();
				this.aShortArray3[local773] = (short) local20.method3115();
				this.aShortArray9[local773] = (short) local20.method3115();
				this.aShortArray14[local773] = (short) local20.method3115();
				this.aByteArray7[local773] = local25.method3130();
				this.aByteArray6[local773] = local30.method3130();
				this.aByteArray5[local773] = local35.method3130();
			}
		}
		if (!local85) {
			return;
		}
		local10.anInt3368 = local144;
		local1009 = local10.method3141();
		@Pc(1296) int local1296;
		@Pc(1302) int local1302;
		if (local1009 > 0) {
			this.aClass154Array1 = new Class154[local1009];
			for (local1296 = 0; local1296 < local1009; local1296++) {
				local1302 = local10.method3115();
				@Pc(1306) int local1306 = local10.method3115();
				@Pc(1316) byte local1316;
				if (local89 == 255) {
					local1316 = this.aByteArray14[local1306];
				} else {
					local1316 = (byte) local89;
				}
				this.aClass154Array1[local1296] = new Class154(local1302, this.aShortArray5[local1306], this.aShortArray11[local1306], this.aShortArray12[local1306], local1316);
			}
		}
		local1296 = local10.method3141();
		if (local1296 <= 0) {
			return;
		}
		this.aClass85Array1 = new Class85[local1296];
		for (local1302 = 0; local1302 < local1296; local1302++) {
			this.aClass85Array1[local1302] = new Class85(local10.method3115(), local10.method3115());
		}
		return;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIBI)V")
	public void method379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(35) int local35;
		if (arg0 != 0) {
			local11 = Class1_Sub1_Sub16.anIntArray587[arg0];
			local15 = Class1_Sub1_Sub16.anIntArray586[arg0];
			for (local17 = 0; local17 < this.anInt332; local17++) {
				local35 = this.anIntArray46[local17] * local15 + this.anIntArray41[local17] * local11 >> 15;
				this.anIntArray41[local17] = local15 * this.anIntArray41[local17] - this.anIntArray46[local17] * local11 >> 15;
				this.anIntArray46[local17] = local35;
			}
		}
		if (arg2 != 0) {
			local11 = Class1_Sub1_Sub16.anIntArray587[arg2];
			local15 = Class1_Sub1_Sub16.anIntArray586[arg2];
			for (local17 = 0; local17 < this.anInt332; local17++) {
				local35 = local15 * this.anIntArray41[local17] - this.anIntArray42[local17] * local11 >> 15;
				this.anIntArray42[local17] = this.anIntArray41[local17] * local11 + local15 * this.anIntArray42[local17] >> 15;
				this.anIntArray41[local17] = local35;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local11 = Class1_Sub1_Sub16.anIntArray587[arg1];
		local15 = Class1_Sub1_Sub16.anIntArray586[arg1];
		for (local17 = 0; local17 < this.anInt332; local17++) {
			local35 = this.anIntArray42[local17] * local11 + this.anIntArray46[local17] * local15 >> 15;
			this.anIntArray42[local17] = this.anIntArray42[local17] * local15 - local11 * this.anIntArray46[local17] >> 15;
			this.anIntArray46[local17] = local35;
		}
	}
}
