import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class2_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ad", name = "kb", descriptor = "[I")
	public int[] anIntArray9;

	@OriginalMember(owner = "client!ad", name = "mb", descriptor = "[I")
	public int[] anIntArray10;

	@OriginalMember(owner = "client!ad", name = "nb", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!ad", name = "pb", descriptor = "[I")
	public int[] anIntArray12;

	@OriginalMember(owner = "client!ad", name = "qb", descriptor = "[I")
	public int[] anIntArray13;

	@OriginalMember(owner = "client!ad", name = "rb", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ad", name = "sb", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!ad", name = "tb", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ad", name = "vb", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!ad", name = "xb", descriptor = "[I")
	public int[] anIntArray14;

	@OriginalMember(owner = "client!ad", name = "yb", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!ad", name = "Ab", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ad", name = "Bb", descriptor = "[I")
	public int[] anIntArray16;

	@OriginalMember(owner = "client!ad", name = "Cb", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!ad", name = "Db", descriptor = "I")
	private int anInt145;

	@OriginalMember(owner = "client!ad", name = "Fb", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!ad", name = "Gb", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!ad", name = "Hb", descriptor = "[I")
	public int[] anIntArray18;

	@OriginalMember(owner = "client!ad", name = "Kb", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!ad", name = "Lb", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!ad", name = "Mb", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ad", name = "Nb", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!ad", name = "Rb", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!ad", name = "ub", descriptor = "B")
	public byte aByte1 = 0;

	@OriginalMember(owner = "client!ad", name = "wb", descriptor = "I")
	public int anInt142 = 0;

	@OriginalMember(owner = "client!ad", name = "Eb", descriptor = "I")
	public int anInt146 = 0;

	@OriginalMember(owner = "client!ad", name = "zb", descriptor = "I")
	public int anInt143 = 0;

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "Z")
	public boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([Lclient!ad;I)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) Class2_Sub1_Sub1_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt142 = 0;
		this.anInt146 = 0;
		this.anInt143 = 0;
		this.aByte1 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class2_Sub1_Sub1_Sub2 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt142 += local43.anInt142;
				this.anInt146 += local43.anInt146;
				this.anInt143 += local43.anInt143;
				if (local43.aByteArray2 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local43.aByte1;
					}
					if (this.aByte1 != local43.aByte1) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray1 != null;
				local22 |= local43.aShortArray1 != null;
				local24 |= local43.aByteArray4 != null;
			}
		}
		this.anIntArray17 = new int[this.anInt142];
		this.anIntArray14 = new int[this.anInt142];
		this.anIntArray13 = new int[this.anInt142];
		this.anIntArray15 = new int[this.anInt146];
		this.anIntArray11 = new int[this.anInt146];
		this.anIntArray22 = new int[this.anInt146];
		this.anIntArray19 = new int[this.anInt146];
		this.anIntArray18 = new int[this.anInt146];
		this.anIntArray12 = new int[this.anInt146];
		if (local18) {
			this.aByteArray2 = new byte[this.anInt146];
		}
		if (local20) {
			this.aByteArray1 = new byte[this.anInt146];
		}
		if (local22) {
			this.aShortArray1 = new short[this.anInt146];
		}
		if (local24) {
			this.aByteArray4 = new byte[this.anInt146];
		}
		if (this.anInt143 > 0) {
			this.anIntArray10 = new int[this.anInt143];
			this.anIntArray16 = new int[this.anInt143];
			this.anIntArray9 = new int[this.anInt143];
		}
		this.anInt142 = 0;
		this.anInt146 = 0;
		this.anInt143 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class2_Sub1_Sub1_Sub2 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt146; local229++) {
					this.anIntArray15[this.anInt146] = local225.anIntArray15[local229] + this.anInt142;
					this.anIntArray11[this.anInt146] = local225.anIntArray11[local229] + this.anInt142;
					this.anIntArray22[this.anInt146] = local225.anIntArray22[local229] + this.anInt142;
					this.anIntArray19[this.anInt146] = local225.anIntArray19[local229];
					this.anIntArray18[this.anInt146] = local225.anIntArray18[local229];
					this.anIntArray12[this.anInt146] = local225.anIntArray12[local229];
					if (local18) {
						if (local225.aByteArray2 == null) {
							this.aByteArray2[this.anInt146] = local225.aByte1;
						} else {
							this.aByteArray2[this.anInt146] = local225.aByteArray2[local229];
						}
					}
					if (local20 && local225.aByteArray1 != null) {
						this.aByteArray1[this.anInt146] = local225.aByteArray1[local229];
					}
					if (local22) {
						if (local225.aShortArray1 == null) {
							this.aShortArray1[this.anInt146] = -1;
						} else {
							this.aShortArray1[this.anInt146] = local225.aShortArray1[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray4 == null || local225.aByteArray4[local229] == -1) {
							this.aByteArray4[this.anInt146] = -1;
						} else {
							this.aByteArray4[this.anInt146] = (byte) (local225.aByteArray4[local229] + this.anInt143);
						}
					}
					this.anInt146++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt143; local394++) {
					this.anIntArray10[this.anInt143] = local225.anIntArray10[local394] + this.anInt142;
					this.anIntArray16[this.anInt143] = local225.anIntArray16[local394] + this.anInt142;
					this.anIntArray9[this.anInt143] = local225.anIntArray9[local394] + this.anInt142;
					this.anInt143++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt142; local444++) {
					this.anIntArray17[this.anInt142] = local225.anIntArray17[local444];
					this.anIntArray14[this.anInt142] = local225.anIntArray14[local444];
					this.anIntArray13[this.anInt142] = local225.anIntArray13[local444];
					this.anInt142++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[IIII)V")
	private void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static4.anInt154 = 0;
			Static4.anInt152 = 0;
			Static4.anInt151 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray2.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray2[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static4.anInt154 += this.anIntArray17[local36];
						Static4.anInt152 += this.anIntArray14[local36];
						Static4.anInt151 += this.anIntArray13[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static4.anInt154 = Static4.anInt154 / local6 + arg2;
				Static4.anInt152 = Static4.anInt152 / local6 + arg3;
				Static4.anInt151 = Static4.anInt151 / local6 + arg4;
			} else {
				Static4.anInt154 = arg2;
				Static4.anInt152 = arg3;
				Static4.anInt151 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray2.length) {
					local115 = this.anIntArrayArray2[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray17[local31] += arg2;
						this.anIntArray14[local31] += arg3;
						this.anIntArray13[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray2.length) {
					local115 = this.anIntArrayArray2[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray17[local31] -= Static4.anInt154;
						this.anIntArray14[local31] -= Static4.anInt152;
						this.anIntArray13[local31] -= Static4.anInt151;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static4.anIntArray28[local225];
							local235 = Static4.anIntArray24[local225];
							local251 = this.anIntArray14[local31] * local231 + this.anIntArray17[local31] * local235 >> 16;
							this.anIntArray14[local31] = this.anIntArray14[local31] * local235 - this.anIntArray17[local31] * local231 >> 16;
							this.anIntArray17[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static4.anIntArray28[local36];
							local235 = Static4.anIntArray24[local36];
							local251 = this.anIntArray14[local31] * local235 - this.anIntArray13[local31] * local231 >> 16;
							this.anIntArray13[local31] = this.anIntArray14[local31] * local231 + this.anIntArray13[local31] * local235 >> 16;
							this.anIntArray14[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static4.anIntArray28[local219];
							local235 = Static4.anIntArray24[local219];
							local251 = this.anIntArray13[local31] * local231 + this.anIntArray17[local31] * local235 >> 16;
							this.anIntArray13[local31] = this.anIntArray13[local31] * local235 - this.anIntArray17[local31] * local231 >> 16;
							this.anIntArray17[local31] = local251;
						}
						this.anIntArray17[local31] += Static4.anInt154;
						this.anIntArray14[local31] += Static4.anInt152;
						this.anIntArray13[local31] += Static4.anInt151;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray2.length) {
					local115 = this.anIntArrayArray2[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray17[local31] -= Static4.anInt154;
						this.anIntArray14[local31] -= Static4.anInt152;
						this.anIntArray13[local31] -= Static4.anInt151;
						this.anIntArray17[local31] = this.anIntArray17[local31] * arg2 / 128;
						this.anIntArray14[local31] = this.anIntArray14[local31] * arg3 / 128;
						this.anIntArray13[local31] = this.anIntArray13[local31] * arg4 / 128;
						this.anIntArray17[local31] += Static4.anInt154;
						this.anIntArray14[local31] += Static4.anInt152;
						this.anIntArray13[local31] += Static4.anInt151;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray1 != null && this.aByteArray1 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray1.length) {
					local115 = this.anIntArrayArray1[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray1[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray1[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method105(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray2 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class33 local12 = arg0.aClass33Array1[arg1];
		@Pc(15) Class2_Sub24 local15 = local12.aClass2_Sub24_1;
		Static4.anInt154 = 0;
		Static4.anInt152 = 0;
		Static4.anInt151 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1144; local23++) {
			@Pc(29) int local29 = local12.anIntArray120[local23];
			this.method104(local15.anIntArray345[local29], local15.anIntArrayArray28[local29], local12.anIntArray123[local23], local12.anIntArray121[local23], local12.anIntArray125[local23]);
		}
		this.anInt145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!mc;ILclient!mc;I[I)V")
	public void method106(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method105(arg0, arg1);
			return;
		}
		@Pc(18) Class33 local18 = arg0.aClass33Array1[arg1];
		@Pc(23) Class33 local23 = arg2.aClass33Array1[arg3];
		@Pc(26) Class2_Sub24 local26 = local18.aClass2_Sub24_1;
		Static4.anInt154 = 0;
		Static4.anInt152 = 0;
		Static4.anInt151 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1144; local41++) {
			local47 = local18.anIntArray120[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray345[local47] == 0) {
				this.method104(local26.anIntArray345[local47], local26.anIntArrayArray28[local47], local18.anIntArray123[local41], local18.anIntArray121[local41], local18.anIntArray125[local41]);
			}
		}
		Static4.anInt154 = 0;
		Static4.anInt152 = 0;
		Static4.anInt151 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1144; local47++) {
			@Pc(112) int local112 = local23.anIntArray120[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray345[local112] == 0) {
				this.method104(local26.anIntArray345[local112], local26.anIntArrayArray28[local112], local23.anIntArray123[local47], local23.anIntArray121[local47], local23.anIntArray125[local47]);
			}
		}
		this.anInt145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	public void method107(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static4.anIntArray28[arg0];
		@Pc(7) int local7 = Static4.anIntArray24[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt142; local9++) {
			@Pc(26) int local26 = this.anIntArray14[local9] * local7 - this.anIntArray13[local9] * local3 >> 16;
			this.anIntArray13[local9] = this.anIntArray14[local9] * local3 + this.anIntArray13[local9] * local7 >> 16;
			this.anIntArray14[local9] = local26;
		}
		this.anInt145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!ad;[B)Lclient!ad;")
	private Class2_Sub1_Sub1_Sub2 method108(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt142 = this.anInt142;
		arg1.anInt146 = this.anInt146;
		arg1.anInt143 = this.anInt143;
		if (arg1.anIntArray17 == null || arg1.anIntArray17.length < this.anInt142) {
			arg1.anIntArray17 = new int[this.anInt142 + 100];
			arg1.anIntArray14 = new int[this.anInt142 + 100];
			arg1.anIntArray13 = new int[this.anInt142 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt142; local43++) {
			arg1.anIntArray17[local43] = this.anIntArray17[local43];
			arg1.anIntArray14[local43] = this.anIntArray14[local43];
			arg1.anIntArray13[local43] = this.anIntArray13[local43];
		}
		if (arg0) {
			arg1.aByteArray1 = this.aByteArray1;
		} else {
			arg1.aByteArray1 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray1 == null) {
				for (local88 = 0; local88 < this.anInt146; local88++) {
					arg1.aByteArray1[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt146; local88++) {
					arg1.aByteArray1[local88] = this.aByteArray1[local88];
				}
			}
		}
		arg1.anIntArray15 = this.anIntArray15;
		arg1.anIntArray11 = this.anIntArray11;
		arg1.anIntArray22 = this.anIntArray22;
		arg1.anIntArray19 = this.anIntArray19;
		arg1.anIntArray18 = this.anIntArray18;
		arg1.anIntArray12 = this.anIntArray12;
		arg1.aByteArray2 = this.aByteArray2;
		arg1.aByteArray4 = this.aByteArray4;
		arg1.aShortArray1 = this.aShortArray1;
		arg1.aByte1 = this.aByte1;
		arg1.anIntArray10 = this.anIntArray10;
		arg1.anIntArray16 = this.anIntArray16;
		arg1.anIntArray9 = this.anIntArray9;
		arg1.anIntArrayArray2 = this.anIntArrayArray2;
		arg1.anIntArrayArray1 = this.anIntArrayArray1;
		arg1.aBoolean14 = this.aBoolean14;
		arg1.anInt145 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIII)V")
	public void method110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static4.anIntArray32[0] = -1;
		if (this.anInt145 != 2 && this.anInt145 != 1) {
			this.method123();
		}
		@Pc(15) int local15 = Static78.anInt2059;
		@Pc(17) int local17 = Static78.anInt2058;
		@Pc(21) int local21 = Static4.anIntArray28[0];
		@Pc(25) int local25 = Static4.anIntArray24[0];
		@Pc(29) int local29 = Static4.anIntArray28[arg0];
		@Pc(33) int local33 = Static4.anIntArray24[arg0];
		@Pc(37) int local37 = Static4.anIntArray28[arg1];
		@Pc(41) int local41 = Static4.anIntArray24[arg1];
		@Pc(45) int local45 = Static4.anIntArray28[arg2];
		@Pc(49) int local49 = Static4.anIntArray24[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt142; local61++) {
			@Pc(67) int local67 = this.anIntArray17[local61];
			@Pc(72) int local72 = this.anIntArray14[local61];
			@Pc(77) int local77 = this.anIntArray13[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static4.anIntArray25[local61] = local77 - local59;
			Static4.anIntArray20[local61] = local15 + (local67 << 9) / arg6;
			Static4.anIntArray39[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt143 > 0) {
				Static4.anIntArray31[local61] = local67;
				Static4.anIntArray36[local61] = local89;
				Static4.anIntArray38[local61] = local77;
			}
		}
		try {
			this.method115(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()V")
	public void method111() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt142; local1++) {
			@Pc(7) int local7 = this.anIntArray17[local1];
			this.anIntArray17[local1] = this.anIntArray13[local1];
			this.anIntArray13[local1] = -local7;
		}
		this.anInt145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)V")
	public void method112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt142; local1++) {
			this.anIntArray17[local1] = this.anIntArray17[local1] * arg0 / 128;
			this.anIntArray14[local1] = this.anIntArray14[local1] * arg1 / 128;
			this.anIntArray13[local1] = this.anIntArray13[local1] * arg2 / 128;
		}
		this.anInt145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
	private void method113(@OriginalArg(0) int arg0) {
		if (Static4.aBooleanArray4[arg0]) {
			this.method122(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray15[arg0];
		@Pc(17) int local17 = this.anIntArray11[arg0];
		@Pc(22) int local22 = this.anIntArray22[arg0];
		Static78.aBoolean157 = Static4.aBooleanArray5[arg0];
		if (this.aByteArray1 == null) {
			Static78.anInt2060 = 0;
		} else {
			Static78.anInt2060 = this.aByteArray1[arg0] & 0xFF;
		}
		if (this.aShortArray1 != null && this.aShortArray1[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray4 == null || this.aByteArray4[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray4[arg0] & 0xFF;
				local133 = this.anIntArray10[local128];
				local138 = this.anIntArray16[local128];
				local143 = this.anIntArray9[local128];
			}
			if (this.anIntArray12[arg0] == -1) {
				Static78.method1384(Static4.anIntArray39[local12], Static4.anIntArray39[local17], Static4.anIntArray39[local22], Static4.anIntArray20[local12], Static4.anIntArray20[local17], Static4.anIntArray20[local22], this.anIntArray19[arg0], this.anIntArray19[arg0], this.anIntArray19[arg0], Static4.anIntArray31[local133], Static4.anIntArray31[local138], Static4.anIntArray31[local143], Static4.anIntArray36[local133], Static4.anIntArray36[local138], Static4.anIntArray36[local143], Static4.anIntArray38[local133], Static4.anIntArray38[local138], Static4.anIntArray38[local143], this.aShortArray1[arg0]);
			} else {
				Static78.method1384(Static4.anIntArray39[local12], Static4.anIntArray39[local17], Static4.anIntArray39[local22], Static4.anIntArray20[local12], Static4.anIntArray20[local17], Static4.anIntArray20[local22], this.anIntArray19[arg0], this.anIntArray18[arg0], this.anIntArray12[arg0], Static4.anIntArray31[local133], Static4.anIntArray31[local138], Static4.anIntArray31[local143], Static4.anIntArray36[local133], Static4.anIntArray36[local138], Static4.anIntArray36[local143], Static4.anIntArray38[local133], Static4.anIntArray38[local138], Static4.anIntArray38[local143], this.aShortArray1[arg0]);
			}
		} else if (this.anIntArray12[arg0] == -1) {
			Static78.method1388(Static4.anIntArray39[local12], Static4.anIntArray39[local17], Static4.anIntArray39[local22], Static4.anIntArray20[local12], Static4.anIntArray20[local17], Static4.anIntArray20[local22], Static4.anIntArray37[this.anIntArray19[arg0]]);
		} else {
			Static78.method1382(Static4.anIntArray39[local12], Static4.anIntArray39[local17], Static4.anIntArray39[local22], Static4.anIntArray20[local12], Static4.anIntArray20[local17], Static4.anIntArray20[local22], this.anIntArray19[arg0], this.anIntArray18[arg0], this.anIntArray12[arg0]);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII)V")
	public void method114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static4.anIntArray32[0] = -1;
		if (this.anInt145 != 2 && this.anInt145 != 1) {
			this.method123();
		}
		@Pc(15) int local15 = Static78.anInt2059;
		@Pc(17) int local17 = Static78.anInt2058;
		@Pc(21) int local21 = Static4.anIntArray28[0];
		@Pc(25) int local25 = Static4.anIntArray24[0];
		@Pc(29) int local29 = Static4.anIntArray28[arg0];
		@Pc(33) int local33 = Static4.anIntArray24[arg0];
		@Pc(37) int local37 = Static4.anIntArray28[arg1];
		@Pc(41) int local41 = Static4.anIntArray24[arg1];
		@Pc(45) int local45 = Static4.anIntArray28[arg2];
		@Pc(49) int local49 = Static4.anIntArray24[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt142; local61++) {
			@Pc(67) int local67 = this.anIntArray17[local61];
			@Pc(72) int local72 = this.anIntArray14[local61];
			@Pc(77) int local77 = this.anIntArray13[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static4.anIntArray25[local61] = local77 - local59;
			Static4.anIntArray20[local61] = local15 + (local67 << 9) / local77;
			Static4.anIntArray39[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt143 > 0) {
				Static4.anIntArray31[local61] = local67;
				Static4.anIntArray36[local61] = local89;
				Static4.anIntArray38[local61] = local77;
			}
		}
		try {
			this.method115(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZI)V")
	private void method115(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt141 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt141; local6++) {
			Static4.anIntArray32[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < this.anInt146; local18++) {
			if (this.anIntArray12[local18] != -2) {
				local30 = this.anIntArray15[local18];
				local35 = this.anIntArray11[local18];
				local40 = this.anIntArray22[local18];
				local44 = Static4.anIntArray20[local30];
				local48 = Static4.anIntArray20[local35];
				local52 = Static4.anIntArray20[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static4.anIntArray31[local30];
					local71 = Static4.anIntArray31[local35];
					@Pc(75) int local75 = Static4.anIntArray31[local40];
					@Pc(79) int local79 = Static4.anIntArray36[local30];
					local83 = Static4.anIntArray36[local35];
					local87 = Static4.anIntArray36[local40];
					@Pc(91) int local91 = Static4.anIntArray38[local30];
					local95 = Static4.anIntArray38[local35];
					@Pc(99) int local99 = Static4.anIntArray38[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static4.aBooleanArray4[local18] = true;
						@Pc(180) int local180 = (Static4.anIntArray25[local30] + Static4.anIntArray25[local35] + Static4.anIntArray25[local40]) / 3 + this.anInt144;
						Static4.anIntArrayArray4[local180][Static4.anIntArray32[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method121(Static4.anInt150, Static4.anInt153, Static4.anIntArray39[local30], Static4.anIntArray39[local35], Static4.anIntArray39[local40], local44, local48, local52)) {
						Static4.anIntArray26[Static4.anInt149++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static4.anIntArray39[local40] - Static4.anIntArray39[local35]) - (Static4.anIntArray39[local30] - Static4.anIntArray39[local35]) * (local52 - local48) > 0) {
						Static4.aBooleanArray4[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static78.anInt2061 && local48 <= Static78.anInt2061 && local52 <= Static78.anInt2061) {
							Static4.aBooleanArray5[local18] = false;
						} else {
							Static4.aBooleanArray5[local18] = true;
						}
						local67 = (Static4.anIntArray25[local30] + Static4.anIntArray25[local35] + Static4.anIntArray25[local40]) / 3 + this.anInt144;
						Static4.anIntArrayArray4[local67][Static4.anIntArray32[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray2 == null) {
			for (local30 = this.anInt141 - 1; local30 >= 0; local30--) {
				local35 = Static4.anIntArray32[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static4.anIntArrayArray4[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method113(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static4.anIntArray35[local30] = 0;
			Static4.anIntArray23[local30] = 0;
		}
		for (local35 = this.anInt141 - 1; local35 >= 0; local35--) {
			local40 = Static4.anIntArray32[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static4.anIntArrayArray4[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray2[local52];
					local71 = Static4.anIntArray35[local388]++;
					Static4.anIntArrayArray3[local388][local71] = local52;
					if (local388 < 10) {
						Static4.anIntArray23[local388] += local35;
					} else if (local388 == 10) {
						Static4.anIntArray30[local71] = local35;
					} else {
						Static4.anIntArray34[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static4.anIntArray35[1] > 0 || Static4.anIntArray35[2] > 0) {
			local40 = (Static4.anIntArray23[1] + Static4.anIntArray23[2]) / (Static4.anIntArray35[1] + Static4.anIntArray35[2]);
		}
		local44 = 0;
		if (Static4.anIntArray35[3] > 0 || Static4.anIntArray35[4] > 0) {
			local44 = (Static4.anIntArray23[3] + Static4.anIntArray23[4]) / (Static4.anIntArray35[3] + Static4.anIntArray35[4]);
		}
		local48 = 0;
		if (Static4.anIntArray35[6] > 0 || Static4.anIntArray35[8] > 0) {
			local48 = (Static4.anIntArray23[6] + Static4.anIntArray23[8]) / (Static4.anIntArray35[6] + Static4.anIntArray35[8]);
		}
		local67 = 0;
		local71 = Static4.anIntArray35[10];
		@Pc(521) int[] local521 = Static4.anIntArrayArray3[10];
		@Pc(523) int[] local523 = Static4.anIntArray30;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static4.anIntArray35[11];
			local521 = Static4.anIntArrayArray3[11];
			local523 = Static4.anIntArray34;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method113(local521[local67++]);
				if (local67 == local71 && local521 != Static4.anIntArrayArray3[11]) {
					local67 = 0;
					local71 = Static4.anIntArray35[11];
					local521 = Static4.anIntArrayArray3[11];
					local523 = Static4.anIntArray34;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method113(local521[local67++]);
				if (local67 == local71 && local521 != Static4.anIntArrayArray3[11]) {
					local67 = 0;
					local71 = Static4.anIntArray35[11];
					local521 = Static4.anIntArrayArray3[11];
					local523 = Static4.anIntArray34;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method113(local521[local67++]);
				if (local67 == local71 && local521 != Static4.anIntArrayArray3[11]) {
					local67 = 0;
					local71 = Static4.anIntArray35[11];
					local521 = Static4.anIntArrayArray3[11];
					local523 = Static4.anIntArray34;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static4.anIntArray35[local83];
			@Pc(686) int[] local686 = Static4.anIntArrayArray3[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method113(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method113(local521[local67++]);
			if (local67 == local71 && local521 != Static4.anIntArrayArray3[11]) {
				local67 = 0;
				local521 = Static4.anIntArrayArray3[11];
				local71 = Static4.anIntArray35[11];
				local523 = Static4.anIntArray34;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method116(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static4.aByteArray3.length < this.anInt146) {
			Static4.aByteArray3 = new byte[this.anInt146 + 100];
		}
		return this.method108(arg0, Static4.aClass2_Sub1_Sub1_Sub2_1, Static4.aByteArray3);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "()V")
	public void method117() {
		if (this.anInt145 == 1) {
			return;
		}
		this.anInt145 = 1;
		super.anInt3029 = 0;
		this.anInt147 = 0;
		this.anInt148 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt142; local18++) {
			@Pc(24) int local24 = this.anIntArray17[local18];
			@Pc(29) int local29 = this.anIntArray14[local18];
			@Pc(34) int local34 = this.anIntArray13[local18];
			if (-local29 > super.anInt3029) {
				super.anInt3029 = -local29;
			}
			if (local29 > this.anInt147) {
				this.anInt147 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt148) {
				this.anInt148 = local58;
			}
		}
		this.anInt148 = (int) (Math.sqrt((double) this.anInt148) + 0.99D);
		this.anInt144 = (int) (Math.sqrt((double) (this.anInt148 * this.anInt148 + super.anInt3029 * super.anInt3029)) + 0.99D);
		this.anInt141 = this.anInt144 + (int) (Math.sqrt((double) (this.anInt148 * this.anInt148 + this.anInt147 * this.anInt147)) + 0.99D);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method118(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static4.aByteArray5.length < this.anInt146) {
			Static4.aByteArray5 = new byte[this.anInt146 + 100];
		}
		return this.method108(arg0, Static4.aClass2_Sub1_Sub1_Sub2_2, Static4.aByteArray5);
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "()V")
	public void method119() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt142; local1++) {
			this.anIntArray17[local1] = -this.anIntArray17[local1];
			this.anIntArray13[local1] = -this.anIntArray13[local1];
		}
		this.anInt145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "()I")
	public int method120() {
		this.method117();
		return this.anInt148;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V")
	private void method122(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static78.anInt2059;
		@Pc(3) int local3 = Static78.anInt2058;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray15[arg0];
		@Pc(15) int local15 = this.anIntArray11[arg0];
		@Pc(20) int local20 = this.anIntArray22[arg0];
		@Pc(24) int local24 = Static4.anIntArray38[local10];
		@Pc(28) int local28 = Static4.anIntArray38[local15];
		@Pc(32) int local32 = Static4.anIntArray38[local20];
		if (this.aByteArray1 == null) {
			Static78.anInt2060 = 0;
		} else {
			Static78.anInt2060 = this.aByteArray1[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static4.anIntArray29[0] = Static4.anIntArray20[local10];
			Static4.anIntArray33[0] = Static4.anIntArray39[local10];
			local5++;
			Static4.anIntArray27[0] = this.anIntArray19[arg0];
		} else {
			local73 = Static4.anIntArray31[local10];
			local77 = Static4.anIntArray36[local10];
			local82 = this.anIntArray19[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static4.anIntArray21[local32 - local24];
				Static4.anIntArray29[0] = local1 + (local73 + ((Static4.anIntArray31[local20] - local73) * local95 >> 16) << 9) / 50;
				Static4.anIntArray33[0] = local3 + (local77 + ((Static4.anIntArray36[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static4.anIntArray27[0] = local82 + ((this.anIntArray12[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static4.anIntArray21[local28 - local24];
				Static4.anIntArray29[local5] = local1 + (local73 + ((Static4.anIntArray31[local15] - local73) * local95 >> 16) << 9) / 50;
				Static4.anIntArray33[local5] = local3 + (local77 + ((Static4.anIntArray36[local15] - local77) * local95 >> 16) << 9) / 50;
				Static4.anIntArray27[local5++] = local82 + ((this.anIntArray18[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static4.anIntArray29[local5] = Static4.anIntArray20[local15];
			Static4.anIntArray33[local5] = Static4.anIntArray39[local15];
			Static4.anIntArray27[local5++] = this.anIntArray18[arg0];
		} else {
			local73 = Static4.anIntArray31[local15];
			local77 = Static4.anIntArray36[local15];
			local82 = this.anIntArray18[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static4.anIntArray21[local24 - local28];
				Static4.anIntArray29[local5] = local1 + (local73 + ((Static4.anIntArray31[local10] - local73) * local95 >> 16) << 9) / 50;
				Static4.anIntArray33[local5] = local3 + (local77 + ((Static4.anIntArray36[local10] - local77) * local95 >> 16) << 9) / 50;
				Static4.anIntArray27[local5++] = local82 + ((this.anIntArray19[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static4.anIntArray21[local32 - local28];
				Static4.anIntArray29[local5] = local1 + (local73 + ((Static4.anIntArray31[local20] - local73) * local95 >> 16) << 9) / 50;
				Static4.anIntArray33[local5] = local3 + (local77 + ((Static4.anIntArray36[local20] - local77) * local95 >> 16) << 9) / 50;
				Static4.anIntArray27[local5++] = local82 + ((this.anIntArray12[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static4.anIntArray29[local5] = Static4.anIntArray20[local20];
			Static4.anIntArray33[local5] = Static4.anIntArray39[local20];
			Static4.anIntArray27[local5++] = this.anIntArray12[arg0];
		} else {
			local73 = Static4.anIntArray31[local20];
			local77 = Static4.anIntArray36[local20];
			local82 = this.anIntArray12[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static4.anIntArray21[local28 - local32];
				Static4.anIntArray29[local5] = local1 + (local73 + ((Static4.anIntArray31[local15] - local73) * local95 >> 16) << 9) / 50;
				Static4.anIntArray33[local5] = local3 + (local77 + ((Static4.anIntArray36[local15] - local77) * local95 >> 16) << 9) / 50;
				Static4.anIntArray27[local5++] = local82 + ((this.anIntArray18[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static4.anIntArray21[local24 - local32];
				Static4.anIntArray29[local5] = local1 + (local73 + ((Static4.anIntArray31[local10] - local73) * local95 >> 16) << 9) / 50;
				Static4.anIntArray33[local5] = local3 + (local77 + ((Static4.anIntArray36[local10] - local77) * local95 >> 16) << 9) / 50;
				Static4.anIntArray27[local5++] = local82 + ((this.anIntArray19[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static4.anIntArray29[0];
		local77 = Static4.anIntArray29[1];
		local82 = Static4.anIntArray29[2];
		local95 = Static4.anIntArray33[0];
		@Pc(590) int local590 = Static4.anIntArray33[1];
		@Pc(594) int local594 = Static4.anIntArray33[2];
		Static78.aBoolean157 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static78.anInt2061 || local77 > Static78.anInt2061 || local82 > Static78.anInt2061) {
				Static78.aBoolean157 = true;
			}
			if (this.aShortArray1 != null && this.aShortArray1[arg0] != -1) {
				if (this.aByteArray4 == null || this.aByteArray4[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray4[arg0] & 0xFF;
					local683 = this.anIntArray10[local678];
					local688 = this.anIntArray16[local678];
					local693 = this.anIntArray9[local678];
				}
				if (this.anIntArray12[arg0] == -1) {
					Static78.method1384(local95, local590, local594, local73, local77, local82, this.anIntArray19[arg0], this.anIntArray19[arg0], this.anIntArray19[arg0], Static4.anIntArray31[local683], Static4.anIntArray31[local688], Static4.anIntArray31[local693], Static4.anIntArray36[local683], Static4.anIntArray36[local688], Static4.anIntArray36[local693], Static4.anIntArray38[local683], Static4.anIntArray38[local688], Static4.anIntArray38[local693], this.aShortArray1[arg0]);
				} else {
					Static78.method1384(local95, local590, local594, local73, local77, local82, Static4.anIntArray27[0], Static4.anIntArray27[1], Static4.anIntArray27[2], Static4.anIntArray31[local683], Static4.anIntArray31[local688], Static4.anIntArray31[local693], Static4.anIntArray36[local683], Static4.anIntArray36[local688], Static4.anIntArray36[local693], Static4.anIntArray38[local683], Static4.anIntArray38[local688], Static4.anIntArray38[local693], this.aShortArray1[arg0]);
				}
			} else if (this.anIntArray12[arg0] == -1) {
				Static78.method1388(local95, local590, local594, local73, local77, local82, Static4.anIntArray37[this.anIntArray19[arg0]]);
			} else {
				Static78.method1382(local95, local590, local594, local73, local77, local82, Static4.anIntArray27[0], Static4.anIntArray27[1], Static4.anIntArray27[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static78.anInt2061 || local77 > Static78.anInt2061 || local82 > Static78.anInt2061 || Static4.anIntArray29[3] < 0 || Static4.anIntArray29[3] > Static78.anInt2061) {
			Static78.aBoolean157 = true;
		}
		if (this.aShortArray1 == null || this.aShortArray1[arg0] == -1) {
			if (this.anIntArray12[arg0] == -1) {
				local683 = Static4.anIntArray37[this.anIntArray19[arg0]];
				Static78.method1388(local95, local590, local594, local73, local77, local82, local683);
				Static78.method1388(local95, local594, Static4.anIntArray33[3], local73, local82, Static4.anIntArray29[3], local683);
				return;
			}
			Static78.method1382(local95, local590, local594, local73, local77, local82, Static4.anIntArray27[0], Static4.anIntArray27[1], Static4.anIntArray27[2]);
			Static78.method1382(local95, local594, Static4.anIntArray33[3], local73, local82, Static4.anIntArray29[3], Static4.anIntArray27[0], Static4.anIntArray27[2], Static4.anIntArray27[3]);
			return;
		}
		if (this.aByteArray4 == null || this.aByteArray4[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray4[arg0] & 0xFF;
			local683 = this.anIntArray10[local678];
			local688 = this.anIntArray16[local678];
			local693 = this.anIntArray9[local678];
		}
		@Pc(956) short local956 = this.aShortArray1[arg0];
		if (this.anIntArray12[arg0] == -1) {
			Static78.method1384(local95, local590, local594, local73, local77, local82, this.anIntArray19[arg0], this.anIntArray19[arg0], this.anIntArray19[arg0], Static4.anIntArray31[local683], Static4.anIntArray31[local688], Static4.anIntArray31[local693], Static4.anIntArray36[local683], Static4.anIntArray36[local688], Static4.anIntArray36[local693], Static4.anIntArray38[local683], Static4.anIntArray38[local688], Static4.anIntArray38[local693], local956);
			Static78.method1384(local95, local594, Static4.anIntArray33[3], local73, local82, Static4.anIntArray29[3], this.anIntArray19[arg0], this.anIntArray19[arg0], this.anIntArray19[arg0], Static4.anIntArray31[local683], Static4.anIntArray31[local688], Static4.anIntArray31[local693], Static4.anIntArray36[local683], Static4.anIntArray36[local688], Static4.anIntArray36[local693], Static4.anIntArray38[local683], Static4.anIntArray38[local688], Static4.anIntArray38[local693], local956);
			return;
		}
		Static78.method1384(local95, local590, local594, local73, local77, local82, Static4.anIntArray27[0], Static4.anIntArray27[1], Static4.anIntArray27[2], Static4.anIntArray31[local683], Static4.anIntArray31[local688], Static4.anIntArray31[local693], Static4.anIntArray36[local683], Static4.anIntArray36[local688], Static4.anIntArray36[local693], Static4.anIntArray38[local683], Static4.anIntArray38[local688], Static4.anIntArray38[local693], local956);
		Static78.method1384(local95, local594, Static4.anIntArray33[3], local73, local82, Static4.anIntArray29[3], Static4.anIntArray27[0], Static4.anIntArray27[2], Static4.anIntArray27[3], Static4.anIntArray31[local683], Static4.anIntArray31[local688], Static4.anIntArray31[local693], Static4.anIntArray36[local683], Static4.anIntArray36[local688], Static4.anIntArray36[local693], Static4.anIntArray38[local683], Static4.anIntArray38[local688], Static4.anIntArray38[local693], local956);
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "()V")
	private void method123() {
		if (this.anInt145 == 2) {
			return;
		}
		this.anInt145 = 2;
		this.anInt148 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt142; local12++) {
			@Pc(18) int local18 = this.anIntArray17[local12];
			@Pc(23) int local23 = this.anIntArray14[local12];
			@Pc(28) int local28 = this.anIntArray13[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt148) {
				this.anInt148 = local40;
			}
		}
		this.anInt148 = (int) (Math.sqrt((double) this.anInt148) + 0.99D);
		this.anInt144 = this.anInt148;
		this.anInt141 = this.anInt148 + this.anInt148;
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "()V")
	public void method124() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt142; local1++) {
			@Pc(7) int local7 = this.anIntArray13[local1];
			this.anIntArray13[local1] = this.anIntArray17[local1];
			this.anIntArray17[local1] = -local7;
		}
		this.anInt145 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static4.anIntArray32[0] = -1;
		if (this.anInt145 != 1) {
			this.method117();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt148 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt148 << 9;
		if (local64 / local40 >= Static78.anInt2057) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt148 << 9;
		if (local77 / local40 <= Static78.anInt2056) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt148 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static78.anInt2062) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt3029 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static78.anInt2055) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt3029 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt143 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static4.aBoolean15) {
			local172 = local29 - local36;
			if (local172 <= 50) {
				local172 = 50;
			}
			if (local57 > 0) {
				local64 /= local40;
				local77 /= local172;
			} else {
				local77 /= local40;
				local64 /= local172;
			}
			if (local93 > 0) {
				local127 /= local40;
				local106 /= local172;
			} else {
				local106 /= local40;
				local127 /= local172;
			}
			local219 = Static4.anInt150 - Static78.anInt2059;
			local223 = Static4.anInt153 - Static78.anInt2058;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean14) {
					Static4.anIntArray26[Static4.anInt149++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static78.anInt2059;
		local219 = Static78.anInt2058;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static4.anIntArray28[arg0];
			local257 = Static4.anIntArray24[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt142; local269++) {
			@Pc(275) int local275 = this.anIntArray17[local269];
			@Pc(280) int local280 = this.anIntArray14[local269];
			@Pc(285) int local285 = this.anIntArray13[local269];
			@Pc(297) int local297;
			if (arg0 != 0) {
				local297 = local285 * local223 + local275 * local257 >> 16;
				local285 = local285 * local257 - local275 * local223 >> 16;
				local275 = local297;
			}
			local275 += arg5;
			local280 += arg6;
			local285 += arg7;
			local297 = local285 * arg3 + local275 * arg4 >> 16;
			local285 = local285 * arg4 - local275 * arg3 >> 16;
			local275 = local297;
			local297 = local280 * arg2 - local285 * arg1 >> 16;
			local285 = local280 * arg1 + local285 * arg2 >> 16;
			Static4.anIntArray25[local269] = local285 - local29;
			if (local285 >= 50) {
				Static4.anIntArray20[local269] = local172 + (local275 << 9) / local285;
				Static4.anIntArray39[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static4.anIntArray20[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static4.anIntArray31[local269] = local275;
				Static4.anIntArray36[local269] = local297;
				Static4.anIntArray38[local269] = local285;
			}
		}
		try {
			this.method115(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([[IIIIZI)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method125(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method117();
		@Pc(6) int local6 = arg1 - this.anInt148;
		@Pc(11) int local11 = arg1 + this.anInt148;
		@Pc(16) int local16 = arg3 - this.anInt148;
		@Pc(21) int local21 = arg3 + this.anInt148;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class2_Sub1_Sub1_Sub2 local101;
		if (arg4) {
			local101 = new Class2_Sub1_Sub1_Sub2();
			local101.anInt142 = this.anInt142;
			local101.anInt146 = this.anInt146;
			local101.anInt143 = this.anInt143;
			local101.anIntArray17 = this.anIntArray17;
			local101.anIntArray13 = this.anIntArray13;
			local101.anIntArray15 = this.anIntArray15;
			local101.anIntArray11 = this.anIntArray11;
			local101.anIntArray22 = this.anIntArray22;
			local101.anIntArray19 = this.anIntArray19;
			local101.anIntArray18 = this.anIntArray18;
			local101.anIntArray12 = this.anIntArray12;
			local101.aByteArray2 = this.aByteArray2;
			local101.aByteArray1 = this.aByteArray1;
			local101.aByteArray4 = this.aByteArray4;
			local101.aShortArray1 = this.aShortArray1;
			local101.aByte1 = this.aByte1;
			local101.anIntArray10 = this.anIntArray10;
			local101.anIntArray16 = this.anIntArray16;
			local101.anIntArray9 = this.anIntArray9;
			local101.anIntArrayArray2 = this.anIntArrayArray2;
			local101.anIntArrayArray1 = this.anIntArrayArray1;
			local101.aBoolean14 = this.aBoolean14;
			local101.anIntArray14 = new int[local101.anInt142];
		} else {
			local101 = this;
		}
		@Pc(201) int local201;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(232) int local232;
		@Pc(254) int local254;
		@Pc(280) int local280;
		@Pc(292) int local292;
		if (arg5 == 0) {
			for (local201 = 0; local201 < local101.anInt142; local201++) {
				local209 = this.anIntArray17[local201] + arg1;
				local216 = this.anIntArray13[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray14[local201] = this.anIntArray14[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt142; local201++) {
				local209 = (-this.anIntArray14[local201] << 16) / super.anInt3029;
				if (local209 < arg5) {
					local216 = this.anIntArray17[local201] + arg1;
					local220 = this.anIntArray13[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(417) int local417 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray14[local201] = this.anIntArray14[local201] + (local417 - arg2) * (arg5 - local209) / arg5;
				}
			}
		}
		local101.anInt145 = 0;
		return local101;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(III)V")
	public void method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt142; local1++) {
			this.anIntArray17[local1] += arg0;
			this.anIntArray14[local1] += arg1;
			this.anIntArray13[local1] += arg2;
		}
		this.anInt145 = 0;
	}
}
