import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class57 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[Lclient!bo;")
	public Class22[] aClass22Array1;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "[Lclient!oo;")
	public Class157[] aClass157Array1;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "[I")
	public int[] anIntArray134;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!eb", name = "R", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!eb", name = "Y", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!eb", name = "Z", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	public int anInt1243 = 0;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "B")
	public byte aByte16 = 0;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	public int anInt1247 = 0;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	public int anInt1250 = 0;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public int anInt1239 = 0;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
	public Class57(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1139(arg0);
		} else {
			this.method1130(arg0);
		}
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray26 = new byte[arg1];
		this.aByteArray29 = new byte[arg1];
		this.aByteArray21 = new byte[arg1];
		this.aShortArray24 = new short[arg1];
		this.anIntArray136 = new int[arg1];
		this.aShortArray20 = new short[arg1];
		this.anIntArray134 = new int[arg0];
		if (arg2 > 0) {
			this.aShortArray22 = new short[arg2];
			this.aByteArray24 = new byte[arg2];
			this.aByteArray25 = new byte[arg2];
			this.aByteArray30 = new byte[arg2];
			this.aShortArray28 = new short[arg2];
			this.aShortArray21 = new short[arg2];
			this.aShortArray25 = new short[arg2];
			this.aByteArray23 = new byte[arg2];
			this.aByteArray22 = new byte[arg2];
			this.aShortArray26 = new short[arg2];
			this.aByteArray27 = new byte[arg2];
			this.aShortArray27 = new short[arg2];
		}
		this.aShortArray31 = new short[arg1];
		this.aShortArray29 = new short[arg1];
		this.aShortArray30 = new short[arg1];
		this.anIntArray133 = new int[arg0];
		this.anIntArray135 = new int[arg0];
		this.anIntArray137 = new int[arg0];
		this.aByteArray28 = new byte[arg1];
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([Lclient!eb;I)V")
	public Class57(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1239 = 0;
		this.anInt1247 = 0;
		this.anInt1250 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) boolean local43 = false;
		this.aByte16 = -1;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class57 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt1239 += local54.anInt1239;
				this.anInt1247 += local54.anInt1247;
				this.anInt1250 += local54.anInt1250;
				if (local54.aClass157Array1 != null) {
					local29 += local54.aClass157Array1.length;
				}
				local33 |= local54.aByteArray29 != null;
				if (local54.aClass22Array1 != null) {
					local31 += local54.aClass22Array1.length;
				}
				local43 |= local54.anIntArray136 != null;
				local37 |= local54.aByteArray26 != null;
				local41 |= local54.aShortArray29 != null;
				if (local54.aByteArray28 == null) {
					if (this.aByte16 == -1) {
						this.aByte16 = local54.aByte16;
					}
					if (local54.aByte16 != this.aByte16) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local39 |= local54.aByteArray21 != null;
			}
		}
		this.aShortArray30 = new short[this.anInt1247];
		if (local37) {
			this.aByteArray26 = new byte[this.anInt1247];
		}
		if (local33) {
			this.aByteArray29 = new byte[this.anInt1247];
		}
		this.aShortArray31 = new short[this.anInt1247];
		if (local41) {
			this.aShortArray29 = new short[this.anInt1247];
		}
		if (local39) {
			this.aByteArray21 = new byte[this.anInt1247];
		}
		this.aShortArray19 = new short[this.anInt1247];
		if (local35) {
			this.aByteArray28 = new byte[this.anInt1247];
		}
		this.anIntArray137 = new int[this.anInt1239];
		this.aShortArray23 = new short[this.anInt1239];
		if (local31 > 0) {
			this.aClass22Array1 = new Class22[local31];
		}
		this.aShortArray24 = new short[this.anInt1247];
		this.aShortArray20 = new short[this.anInt1247];
		if (this.anInt1250 > 0) {
			this.aByteArray22 = new byte[this.anInt1250];
			this.aByteArray24 = new byte[this.anInt1250];
			this.aShortArray26 = new short[this.anInt1250];
			this.aShortArray22 = new short[this.anInt1250];
			this.aByteArray27 = new byte[this.anInt1250];
			this.aShortArray27 = new short[this.anInt1250];
			this.aShortArray21 = new short[this.anInt1250];
			this.aByteArray25 = new byte[this.anInt1250];
			this.aShortArray25 = new short[this.anInt1250];
			this.aByteArray23 = new byte[this.anInt1250];
			this.aByteArray30 = new byte[this.anInt1250];
			this.aShortArray28 = new short[this.anInt1250];
		}
		this.anIntArray133 = new int[this.anInt1239];
		this.anIntArray134 = new int[this.anInt1239];
		if (local43) {
			this.anIntArray136 = new int[this.anInt1247];
		}
		if (local29 > 0) {
			this.aClass157Array1 = new Class157[local29];
		}
		this.anIntArray135 = new int[this.anInt1239];
		local31 = 0;
		this.anInt1239 = 0;
		this.anInt1250 = 0;
		this.anInt1247 = 0;
		local29 = 0;
		@Pc(561) int local561;
		@Pc(572) int local572;
		for (@Pc(360) int local360 = 0; local360 < arg1; local360++) {
			@Pc(367) short local367 = (short) (0x1 << local360);
			@Pc(371) Class57 local371 = arg0[local360];
			if (local371 != null) {
				for (@Pc(375) int local375 = 0; local375 < local371.anInt1247; local375++) {
					if (local33 && local371.aByteArray29 != null) {
						this.aByteArray29[this.anInt1247] = local371.aByteArray29[local375];
					}
					if (local35) {
						if (local371.aByteArray28 == null) {
							this.aByteArray28[this.anInt1247] = local371.aByte16;
						} else {
							this.aByteArray28[this.anInt1247] = local371.aByteArray28[local375];
						}
					}
					if (local37 && local371.aByteArray26 != null) {
						this.aByteArray26[this.anInt1247] = local371.aByteArray26[local375];
					}
					if (local41) {
						if (local371.aShortArray29 == null) {
							this.aShortArray29[this.anInt1247] = -1;
						} else {
							this.aShortArray29[this.anInt1247] = local371.aShortArray29[local375];
						}
					}
					if (local43) {
						if (local371.anIntArray136 == null) {
							this.anIntArray136[this.anInt1247] = -1;
						} else {
							this.anIntArray136[this.anInt1247] = local371.anIntArray136[local375];
						}
					}
					this.aShortArray31[this.anInt1247] = (short) this.method1134(local371.aShortArray31[local375], local371, local367);
					this.aShortArray20[this.anInt1247] = (short) this.method1134(local371.aShortArray20[local375], local371, local367);
					this.aShortArray30[this.anInt1247] = (short) this.method1134(local371.aShortArray30[local375], local371, local367);
					this.aShortArray19[this.anInt1247] = local367;
					this.aShortArray24[this.anInt1247] = local371.aShortArray24[local375];
					this.anInt1247++;
				}
				@Pc(548) int local548;
				if (local371.aClass157Array1 != null) {
					for (local548 = 0; local548 < local371.aClass157Array1.length; local548++) {
						local561 = this.method1134(local371.aClass157Array1[local548].anInt4299, local371, local367);
						local572 = this.method1134(local371.aClass157Array1[local548].anInt4295, local371, local367);
						@Pc(583) int local583 = this.method1134(local371.aClass157Array1[local548].anInt4306, local371, local367);
						this.aClass157Array1[local29] = new Class157(local371.aClass157Array1[local548].anInt4290, local561, local572, local583, local371.aClass157Array1[local548].aByte58);
						local29++;
					}
				}
				if (local371.aClass22Array1 != null) {
					for (local548 = 0; local548 < local371.aClass22Array1.length; local548++) {
						local561 = this.method1134(local371.aClass22Array1[local548].anInt555, local371, local367);
						this.aClass22Array1[local31] = new Class22(local371.aClass22Array1[local548].anInt560, local561);
						local31++;
					}
				}
			}
		}
		@Pc(654) int local654 = 0;
		this.anInt1243 = this.anInt1239;
		for (@Pc(660) int local660 = 0; local660 < arg1; local660++) {
			@Pc(667) short local667 = (short) (0x1 << local660);
			@Pc(671) Class57 local671 = arg0[local660];
			if (local671 != null) {
				for (local561 = 0; local561 < local671.anInt1247; local561++) {
					if (local39) {
						this.aByteArray21[local654++] = (byte) (local671.aByteArray21 == null || local671.aByteArray21[local561] == -1 ? -1 : this.anInt1250 + local671.aByteArray21[local561]);
					}
				}
				for (local572 = 0; local572 < local671.anInt1250; local572++) {
					@Pc(723) byte local723 = this.aByteArray24[this.anInt1250] = local671.aByteArray24[local572];
					if (local723 == 0) {
						this.aShortArray25[this.anInt1250] = (short) this.method1134(local671.aShortArray25[local572], local671, local667);
						this.aShortArray26[this.anInt1250] = (short) this.method1134(local671.aShortArray26[local572], local671, local667);
						this.aShortArray28[this.anInt1250] = (short) this.method1134(local671.aShortArray28[local572], local671, local667);
					}
					if (local723 >= 1 && local723 <= 3) {
						this.aShortArray25[this.anInt1250] = local671.aShortArray25[local572];
						this.aShortArray26[this.anInt1250] = local671.aShortArray26[local572];
						this.aShortArray28[this.anInt1250] = local671.aShortArray28[local572];
						this.aShortArray21[this.anInt1250] = local671.aShortArray21[local572];
						this.aShortArray27[this.anInt1250] = local671.aShortArray27[local572];
						this.aShortArray22[this.anInt1250] = local671.aShortArray22[local572];
						this.aByteArray30[this.anInt1250] = local671.aByteArray30[local572];
						this.aByteArray22[this.anInt1250] = local671.aByteArray22[local572];
						this.aByteArray27[this.anInt1250] = local671.aByteArray27[local572];
					}
					if (local723 == 2) {
						this.aByteArray23[this.anInt1250] = local671.aByteArray23[local572];
						this.aByteArray25[this.anInt1250] = local671.aByteArray25[local572];
					}
					this.anInt1250++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z[B)V")
	private void method1130(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub10 local14 = new Class6_Sub10(arg0);
		@Pc(19) Class6_Sub10 local19 = new Class6_Sub10(arg0);
		@Pc(24) Class6_Sub10 local24 = new Class6_Sub10(arg0);
		@Pc(29) Class6_Sub10 local29 = new Class6_Sub10(arg0);
		@Pc(34) Class6_Sub10 local34 = new Class6_Sub10(arg0);
		local14.anInt4188 = arg0.length - 18;
		this.anInt1239 = local14.method4021();
		this.anInt1247 = local14.method4021();
		this.anInt1250 = local14.method3972();
		@Pc(59) int local59 = local14.method3972();
		@Pc(63) int local63 = local14.method3972();
		@Pc(67) int local67 = local14.method3972();
		@Pc(71) int local71 = local14.method3972();
		@Pc(75) int local75 = local14.method3972();
		@Pc(79) int local79 = local14.method4021();
		@Pc(83) int local83 = local14.method4021();
		@Pc(87) int local87 = local14.method4021();
		@Pc(91) int local91 = local14.method4021();
		@Pc(100) int local100 = this.anInt1239;
		@Pc(102) int local102 = local100;
		local100 += this.anInt1247;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt1247;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt1247;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt1247;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt1239;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt1247;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt1247 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt1250 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		this.aShortArray30 = new short[this.anInt1247];
		if (local71 == 1) {
			this.anIntArray136 = new int[this.anInt1247];
		}
		this.aShortArray31 = new short[this.anInt1247];
		local14.anInt4188 = 0;
		this.anIntArray137 = new int[this.anInt1239];
		if (local59 == 1) {
			this.aByteArray29 = new byte[this.anInt1247];
			this.aShortArray29 = new short[this.anInt1247];
			this.aByteArray21 = new byte[this.anInt1247];
		}
		this.aShortArray24 = new short[this.anInt1247];
		this.anIntArray133 = new int[this.anInt1239];
		if (local63 == 255) {
			this.aByteArray28 = new byte[this.anInt1247];
		} else {
			this.aByte16 = (byte) local63;
		}
		if (local75 == 1) {
			this.anIntArray134 = new int[this.anInt1239];
		}
		this.aShortArray20 = new short[this.anInt1247];
		this.anIntArray135 = new int[this.anInt1239];
		if (this.anInt1250 > 0) {
			this.aShortArray25 = new short[this.anInt1250];
			this.aShortArray28 = new short[this.anInt1250];
			this.aByteArray24 = new byte[this.anInt1250];
			this.aShortArray26 = new short[this.anInt1250];
		}
		if (local67 == 1) {
			this.aByteArray26 = new byte[this.anInt1247];
		}
		local19.anInt4188 = local189;
		local24.anInt4188 = local195;
		local29.anInt4188 = local100;
		local34.anInt4188 = local143;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(359) int local359;
		@Pc(361) int local361;
		for (@Pc(353) int local353 = 0; local353 < this.anInt1239; local353++) {
			local359 = local14.method3972();
			local361 = 0;
			if ((local359 & 0x1) != 0) {
				local361 = local19.method3964();
			}
			@Pc(374) int local374 = 0;
			if ((local359 & 0x2) != 0) {
				local374 = local24.method3964();
			}
			@Pc(387) int local387 = 0;
			if ((local359 & 0x4) != 0) {
				local387 = local29.method3964();
			}
			this.anIntArray137[local353] = local361 + local347;
			this.anIntArray135[local353] = local374 + local349;
			this.anIntArray133[local353] = local351 + local387;
			local351 = this.anIntArray133[local353];
			local347 = this.anIntArray137[local353];
			local349 = this.anIntArray135[local353];
			if (local75 == 1) {
				this.anIntArray134[local353] = local34.method3972();
			}
		}
		local14.anInt4188 = local171;
		local19.anInt4188 = local131;
		local24.anInt4188 = local109;
		local29.anInt4188 = local153;
		local34.anInt4188 = local119;
		for (local359 = 0; local359 < this.anInt1247; local359++) {
			this.aShortArray24[local359] = (short) local14.method4021();
			if (local59 == 1) {
				local361 = local19.method3972();
				if ((local361 & 0x1) == 1) {
					local7 = true;
					this.aByteArray29[local359] = 1;
				} else {
					this.aByteArray29[local359] = 0;
				}
				if ((local361 & 0x2) == 2) {
					this.aByteArray21[local359] = (byte) (local361 >> 2);
					this.aShortArray29[local359] = this.aShortArray24[local359];
					this.aShortArray24[local359] = 127;
					if (this.aShortArray29[local359] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray21[local359] = -1;
					this.aShortArray29[local359] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray28[local359] = local24.method3992();
			}
			if (local67 == 1) {
				this.aByteArray26[local359] = local29.method3992();
			}
			if (local71 == 1) {
				this.anIntArray136[local359] = local34.method3972();
			}
		}
		this.anInt1243 = -1;
		local14.anInt4188 = local165;
		local19.anInt4188 = local102;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(620) int local620;
		for (@Pc(614) int local614 = 0; local614 < this.anInt1247; local614++) {
			local620 = local19.method3972();
			if (local620 == 1) {
				local606 = (short) (local14.method3964() + local612);
				local608 = (short) (local14.method3964() + local606);
				local610 = (short) (local14.method3964() + local608);
				this.aShortArray31[local614] = local606;
				local612 = local610;
				this.aShortArray20[local614] = local608;
				this.aShortArray30[local614] = local610;
				if (local606 > this.anInt1243) {
					this.anInt1243 = local606;
				}
				if (this.anInt1243 < local608) {
					this.anInt1243 = local608;
				}
				if (this.anInt1243 < local610) {
					this.anInt1243 = local610;
				}
			}
			if (local620 == 2) {
				local608 = local610;
				local610 = (short) (local14.method3964() + local612);
				this.aShortArray31[local614] = local606;
				local612 = local610;
				this.aShortArray20[local614] = local608;
				this.aShortArray30[local614] = local610;
				if (local610 > this.anInt1243) {
					this.anInt1243 = local610;
				}
			}
			if (local620 == 3) {
				local606 = local610;
				local610 = (short) (local14.method3964() + local612);
				this.aShortArray31[local614] = local606;
				local612 = local610;
				this.aShortArray20[local614] = local608;
				this.aShortArray30[local614] = local610;
				if (local610 > this.anInt1243) {
					this.anInt1243 = local610;
				}
			}
			if (local620 == 4) {
				@Pc(773) short local773 = local606;
				local606 = local608;
				local610 = (short) (local14.method3964() + local612);
				local608 = local773;
				this.aShortArray31[local614] = local606;
				local612 = local610;
				this.aShortArray20[local614] = local773;
				this.aShortArray30[local614] = local610;
				if (local610 > this.anInt1243) {
					this.anInt1243 = local610;
				}
			}
		}
		this.anInt1243++;
		local14.anInt4188 = local180;
		for (local620 = 0; local620 < this.anInt1250; local620++) {
			this.aByteArray24[local620] = 0;
			this.aShortArray25[local620] = (short) local14.method4021();
			this.aShortArray26[local620] = (short) local14.method4021();
			this.aShortArray28[local620] = (short) local14.method4021();
		}
		if (this.aByteArray21 != null) {
			@Pc(877) boolean local877 = false;
			for (@Pc(879) int local879 = 0; local879 < this.anInt1247; local879++) {
				@Pc(888) int local888 = this.aByteArray21[local879] & 0xFF;
				if (local888 != 255) {
					if ((this.aShortArray25[local888] & 0xFFFF) == this.aShortArray31[local879] && (this.aShortArray26[local888] & 0xFFFF) == this.aShortArray20[local879] && this.aShortArray30[local879] == (this.aShortArray28[local888] & 0xFFFF)) {
						this.aByteArray21[local879] = -1;
					} else {
						local877 = true;
					}
				}
			}
			if (!local877) {
				this.aByteArray21 = null;
			}
		}
		if (!local7) {
			this.aByteArray29 = null;
		}
		if (!local9) {
			this.aShortArray29 = null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIB)V")
	public void method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt1239; local13++) {
			this.anIntArray137[local13] += arg2;
			this.anIntArray135[local13] += arg0;
			this.anIntArray133[local13] += arg1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!eb;IS)I")
	private int method1134(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray137[arg0];
		@Pc(15) int local15 = arg1.anIntArray135[arg0];
		@Pc(20) int local20 = arg1.anIntArray133[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1239; local22++) {
			if (this.anIntArray137[local22] == local10 && local15 == this.anIntArray135[local22] && local20 == this.anIntArray133[local22]) {
				this.aShortArray23[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray137[this.anInt1239] = local10;
		this.anIntArray135[this.anInt1239] = local15;
		this.anIntArray133[this.anInt1239] = local20;
		this.aShortArray23[this.anInt1239] = arg2;
		this.anIntArray134[this.anInt1239] = arg1.anIntArray134 == null ? -1 : arg1.anIntArray134[arg0];
		return this.anInt1239++;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)[[I")
	public int[][] method1135() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1247; local12++) {
			@Pc(19) int local19 = this.anIntArray136[local12];
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
		for (@Pc(84) int local84 = 0; local84 < this.anInt1247; local84++) {
			@Pc(91) int local91 = this.anIntArray136[local84];
			if (local91 >= 0) {
				local51[local91][local8[local91]++] = local84;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)[[I")
	public int[][] method1136() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1243; local12++) {
			@Pc(19) int local19 = this.anIntArray134[local12];
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
		for (@Pc(82) int local82 = 0; local82 < this.anInt1243; local82++) {
			@Pc(89) int local89 = this.anIntArray134[local82];
			if (local89 >= 0) {
				local51[local89][local8[local89]++] = local82;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ISSSBBSSSB)B")
	public byte method1137() {
		if (this.anInt1250 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray24[this.anInt1250] = 3;
		this.aShortArray25[this.anInt1250] = 0;
		this.aShortArray26[this.anInt1250] = 32767;
		this.aShortArray28[this.anInt1250] = 0;
		this.aShortArray21[this.anInt1250] = 1024;
		this.aShortArray27[this.anInt1250] = 1024;
		this.aShortArray22[this.anInt1250] = 1024;
		this.aByteArray30[this.anInt1250] = 0;
		this.aByteArray22[this.anInt1250] = 0;
		this.aByteArray27[this.anInt1250] = 0;
		return (byte) this.anInt1250++;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IIIB)I")
	public int method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1239; local7++) {
			if (this.anIntArray137[local7] == arg1 && arg2 == this.anIntArray135[local7] && this.anIntArray133[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray137[this.anInt1239] = arg1;
		this.anIntArray135[this.anInt1239] = arg2;
		this.anIntArray133[this.anInt1239] = arg0;
		this.anInt1243 = this.anInt1239 + 1;
		return this.anInt1239++;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BI)V")
	private void method1139(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub10 local10 = new Class6_Sub10(arg0);
		@Pc(15) Class6_Sub10 local15 = new Class6_Sub10(arg0);
		@Pc(20) Class6_Sub10 local20 = new Class6_Sub10(arg0);
		@Pc(25) Class6_Sub10 local25 = new Class6_Sub10(arg0);
		@Pc(30) Class6_Sub10 local30 = new Class6_Sub10(arg0);
		@Pc(35) Class6_Sub10 local35 = new Class6_Sub10(arg0);
		@Pc(40) Class6_Sub10 local40 = new Class6_Sub10(arg0);
		local10.anInt4188 = arg0.length - 23;
		this.anInt1239 = local10.method4021();
		this.anInt1247 = local10.method4021();
		this.anInt1250 = local10.method3972();
		@Pc(65) int local65 = local10.method3972();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(91) int local91 = local10.method3972();
		@Pc(95) int local95 = local10.method3972();
		@Pc(99) int local99 = local10.method3972();
		@Pc(103) int local103 = local10.method3972();
		@Pc(107) int local107 = local10.method3972();
		@Pc(111) int local111 = local10.method4021();
		@Pc(115) int local115 = local10.method4021();
		@Pc(119) int local119 = local10.method4021();
		@Pc(123) int local123 = local10.method4021();
		@Pc(127) int local127 = local10.method4021();
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(133) int local133 = 0;
		@Pc(146) int local146;
		if (this.anInt1250 > 0) {
			local10.anInt4188 = 0;
			this.aByteArray24 = new byte[this.anInt1250];
			for (local146 = 0; local146 < this.anInt1250; local146++) {
				@Pc(157) byte local157 = this.aByteArray24[local146] = local10.method3992();
				if (local157 >= 1 && local157 <= 3) {
					local131++;
				}
				if (local157 == 2) {
					local133++;
				}
				if (local157 == 0) {
					local129++;
				}
			}
		}
		local146 = this.anInt1250;
		@Pc(188) int local188 = local146;
		local146 += this.anInt1239;
		@Pc(195) int local195 = local146;
		if (local76) {
			local146 += this.anInt1247;
		}
		@Pc(204) int local204 = local146;
		local146 += this.anInt1247;
		@Pc(211) int local211 = local146;
		if (local91 == 255) {
			local146 += this.anInt1247;
		}
		@Pc(223) int local223 = local146;
		if (local99 == 1) {
			local146 += this.anInt1247;
		}
		@Pc(235) int local235 = local146;
		if (local107 == 1) {
			local146 += this.anInt1239;
		}
		@Pc(247) int local247 = local146;
		if (local95 == 1) {
			local146 += this.anInt1247;
		}
		@Pc(259) int local259 = local146;
		local146 += local123;
		@Pc(265) int local265 = local146;
		if (local103 == 1) {
			local146 += this.anInt1247 * 2;
		}
		@Pc(277) int local277 = local146;
		local146 += local127;
		@Pc(283) int local283 = local146;
		local146 += this.anInt1247 * 2;
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
		local10.anInt4188 = local188;
		if (local107 == 1) {
			this.anIntArray134 = new int[this.anInt1239];
		}
		this.anIntArray133 = new int[this.anInt1239];
		this.aShortArray20 = new short[this.anInt1247];
		if (local95 == 1) {
			this.aByteArray26 = new byte[this.anInt1247];
		}
		if (local91 == 255) {
			this.aByteArray28 = new byte[this.anInt1247];
		} else {
			this.aByte16 = (byte) local91;
		}
		if (local99 == 1) {
			this.anIntArray136 = new int[this.anInt1247];
		}
		this.anIntArray135 = new int[this.anInt1239];
		if (local103 == 1) {
			this.aShortArray29 = new short[this.anInt1247];
		}
		if (local103 == 1 && this.anInt1250 > 0) {
			this.aByteArray21 = new byte[this.anInt1247];
		}
		this.aShortArray24 = new short[this.anInt1247];
		this.aShortArray31 = new short[this.anInt1247];
		this.anIntArray137 = new int[this.anInt1239];
		if (local76) {
			this.aByteArray29 = new byte[this.anInt1247];
		}
		if (this.anInt1250 > 0) {
			this.aShortArray26 = new short[this.anInt1250];
			if (local131 > 0) {
				this.aByteArray27 = new byte[local131];
				this.aShortArray27 = new short[local131];
				this.aByteArray30 = new byte[local131];
				this.aShortArray22 = new short[local131];
				this.aShortArray21 = new short[local131];
				this.aByteArray22 = new byte[local131];
			}
			this.aShortArray25 = new short[this.anInt1250];
			this.aShortArray28 = new short[this.anInt1250];
			if (local133 > 0) {
				this.aByteArray23 = new byte[local133];
				this.aByteArray25 = new byte[local133];
			}
		}
		this.aShortArray30 = new short[this.anInt1247];
		local15.anInt4188 = local292;
		local20.anInt4188 = local298;
		local25.anInt4188 = local304;
		local30.anInt4188 = local235;
		@Pc(539) int local539 = 0;
		@Pc(541) int local541 = 0;
		@Pc(543) int local543 = 0;
		@Pc(551) int local551;
		for (@Pc(545) int local545 = 0; local545 < this.anInt1239; local545++) {
			local551 = local10.method3972();
			@Pc(553) int local553 = 0;
			if ((local551 & 0x1) != 0) {
				local553 = local15.method3964();
			}
			@Pc(563) int local563 = 0;
			if ((local551 & 0x2) != 0) {
				local563 = local20.method3964();
			}
			@Pc(573) int local573 = 0;
			if ((local551 & 0x4) != 0) {
				local573 = local25.method3964();
			}
			this.anIntArray137[local545] = local539 + local553;
			this.anIntArray135[local545] = local563 + local541;
			this.anIntArray133[local545] = local543 + local573;
			local541 = this.anIntArray135[local545];
			local539 = this.anIntArray137[local545];
			local543 = this.anIntArray133[local545];
			if (local107 == 1) {
				this.anIntArray134[local545] = local30.method3972();
			}
		}
		local10.anInt4188 = local283;
		local15.anInt4188 = local195;
		local20.anInt4188 = local211;
		local25.anInt4188 = local247;
		local30.anInt4188 = local223;
		local35.anInt4188 = local265;
		local40.anInt4188 = local277;
		for (local551 = 0; local551 < this.anInt1247; local551++) {
			this.aShortArray24[local551] = (short) local10.method4021();
			if (local76) {
				this.aByteArray29[local551] = local15.method3992();
			}
			if (local91 == 255) {
				this.aByteArray28[local551] = local20.method3992();
			}
			if (local95 == 1) {
				this.aByteArray26[local551] = local25.method3992();
			}
			if (local99 == 1) {
				this.anIntArray136[local551] = local30.method3972();
			}
			if (local103 == 1) {
				this.aShortArray29[local551] = (short) (local35.method4021() - 1);
			}
			if (this.aByteArray21 != null) {
				if (this.aShortArray29[local551] == -1) {
					this.aByteArray21[local551] = -1;
				} else {
					this.aByteArray21[local551] = (byte) (local40.method3972() - 1);
				}
			}
		}
		this.anInt1243 = -1;
		local10.anInt4188 = local259;
		local15.anInt4188 = local204;
		@Pc(771) short local771 = 0;
		@Pc(773) short local773 = 0;
		@Pc(775) short local775 = 0;
		@Pc(777) short local777 = 0;
		@Pc(785) int local785;
		for (@Pc(779) int local779 = 0; local779 < this.anInt1247; local779++) {
			local785 = local15.method3972();
			if (local785 == 1) {
				local771 = (short) (local777 + local10.method3964());
				local773 = (short) (local10.method3964() + local771);
				local775 = (short) (local773 + local10.method3964());
				this.aShortArray31[local779] = local771;
				local777 = local775;
				this.aShortArray20[local779] = local773;
				this.aShortArray30[local779] = local775;
				if (this.anInt1243 < local771) {
					this.anInt1243 = local771;
				}
				if (local773 > this.anInt1243) {
					this.anInt1243 = local773;
				}
				if (this.anInt1243 < local775) {
					this.anInt1243 = local775;
				}
			}
			if (local785 == 2) {
				local773 = local775;
				local775 = (short) (local777 + local10.method3964());
				local777 = local775;
				this.aShortArray31[local779] = local771;
				this.aShortArray20[local779] = local773;
				this.aShortArray30[local779] = local775;
				if (local775 > this.anInt1243) {
					this.anInt1243 = local775;
				}
			}
			if (local785 == 3) {
				local771 = local775;
				local775 = (short) (local10.method3964() + local777);
				local777 = local775;
				this.aShortArray31[local779] = local771;
				this.aShortArray20[local779] = local773;
				this.aShortArray30[local779] = local775;
				if (local775 > this.anInt1243) {
					this.anInt1243 = local775;
				}
			}
			if (local785 == 4) {
				@Pc(942) short local942 = local771;
				local771 = local773;
				local775 = (short) (local777 + local10.method3964());
				local773 = local942;
				local777 = local775;
				this.aShortArray31[local779] = local771;
				this.aShortArray20[local779] = local942;
				this.aShortArray30[local779] = local775;
				if (this.anInt1243 < local775) {
					this.anInt1243 = local775;
				}
			}
		}
		this.anInt1243++;
		local10.anInt4188 = local310;
		local15.anInt4188 = local318;
		local20.anInt4188 = local326;
		local25.anInt4188 = local334;
		local30.anInt4188 = local340;
		local35.anInt4188 = local346;
		@Pc(1017) int local1017;
		for (local785 = 0; local785 < this.anInt1250; local785++) {
			local1017 = this.aByteArray24[local785] & 0xFF;
			if (local1017 == 0) {
				this.aShortArray25[local785] = (short) local10.method4021();
				this.aShortArray26[local785] = (short) local10.method4021();
				this.aShortArray28[local785] = (short) local10.method4021();
			}
			if (local1017 == 1) {
				this.aShortArray25[local785] = (short) local15.method4021();
				this.aShortArray26[local785] = (short) local15.method4021();
				this.aShortArray28[local785] = (short) local15.method4021();
				this.aShortArray21[local785] = (short) local20.method4021();
				this.aShortArray27[local785] = (short) local20.method4021();
				this.aShortArray22[local785] = (short) local20.method4021();
				this.aByteArray30[local785] = local25.method3992();
				this.aByteArray22[local785] = local30.method3992();
				this.aByteArray27[local785] = local35.method3992();
			}
			if (local1017 == 2) {
				this.aShortArray25[local785] = (short) local15.method4021();
				this.aShortArray26[local785] = (short) local15.method4021();
				this.aShortArray28[local785] = (short) local15.method4021();
				this.aShortArray21[local785] = (short) local20.method4021();
				this.aShortArray27[local785] = (short) local20.method4021();
				this.aShortArray22[local785] = (short) local20.method4021();
				this.aByteArray30[local785] = local25.method3992();
				this.aByteArray22[local785] = local30.method3992();
				this.aByteArray27[local785] = local35.method3992();
				this.aByteArray23[local785] = local35.method3992();
				this.aByteArray25[local785] = local35.method3992();
			}
			if (local1017 == 3) {
				this.aShortArray25[local785] = (short) local15.method4021();
				this.aShortArray26[local785] = (short) local15.method4021();
				this.aShortArray28[local785] = (short) local15.method4021();
				this.aShortArray21[local785] = (short) local20.method4021();
				this.aShortArray27[local785] = (short) local20.method4021();
				this.aShortArray22[local785] = (short) local20.method4021();
				this.aByteArray30[local785] = local25.method3992();
				this.aByteArray22[local785] = local30.method3992();
				this.aByteArray27[local785] = local35.method3992();
			}
		}
		if (!local87) {
			return;
		}
		local10.anInt4188 = local146;
		local1017 = local10.method3972();
		@Pc(1312) int local1312;
		@Pc(1318) int local1318;
		if (local1017 > 0) {
			this.aClass157Array1 = new Class157[local1017];
			for (local1312 = 0; local1312 < local1017; local1312++) {
				local1318 = local10.method4021();
				@Pc(1322) int local1322 = local10.method4021();
				@Pc(1330) byte local1330;
				if (local91 == 255) {
					local1330 = this.aByteArray28[local1322];
				} else {
					local1330 = (byte) local91;
				}
				this.aClass157Array1[local1312] = new Class157(local1318, this.aShortArray31[local1322], this.aShortArray20[local1322], this.aShortArray30[local1322], local1330);
			}
		}
		local1312 = local10.method3972();
		if (local1312 <= 0) {
			return;
		}
		this.aClass22Array1 = new Class22[local1312];
		for (local1318 = 0; local1318 < local1312; local1318++) {
			this.aClass22Array1[local1318] = new Class22(local10.method4021(), local10.method4021());
		}
		return;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)V")
	public void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(21) int local21;
		@Pc(39) int local39;
		if (arg0 != 0) {
			local15 = Class207.anIntArray697[arg0];
			local19 = Class207.anIntArray698[arg0];
			for (local21 = 0; local21 < this.anInt1239; local21++) {
				local39 = this.anIntArray137[local21] * local19 + this.anIntArray135[local21] * local15 >> 15;
				this.anIntArray135[local21] = local19 * this.anIntArray135[local21] - this.anIntArray137[local21] * local15 >> 15;
				this.anIntArray137[local21] = local39;
			}
		}
		if (arg2 != 0) {
			local15 = Class207.anIntArray697[arg2];
			local19 = Class207.anIntArray698[arg2];
			for (local21 = 0; local21 < this.anInt1239; local21++) {
				local39 = this.anIntArray135[local21] * local19 - local15 * this.anIntArray133[local21] >> 15;
				this.anIntArray133[local21] = this.anIntArray135[local21] * local15 + local19 * this.anIntArray133[local21] >> 15;
				this.anIntArray135[local21] = local39;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local15 = Class207.anIntArray697[arg1];
		local19 = Class207.anIntArray698[arg1];
		for (local21 = 0; local21 < this.anInt1239; local21++) {
			local39 = this.anIntArray137[local21] * local19 + this.anIntArray133[local21] * local15 >> 15;
			this.anIntArray133[local21] = this.anIntArray133[local21] * local19 - this.anIntArray137[local21] * local15 >> 15;
			this.anIntArray137[local21] = local39;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIIBIIBSS)I")
	public int method1141(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) short arg6, @OriginalArg(8) short arg7) {
		this.aShortArray31[this.anInt1247] = (short) arg4;
		this.aShortArray20[this.anInt1247] = (short) arg3;
		this.aShortArray30[this.anInt1247] = (short) arg1;
		this.aByteArray29[this.anInt1247] = arg0;
		this.aByteArray21[this.anInt1247] = arg5;
		this.aShortArray24[this.anInt1247] = arg6;
		this.aByteArray26[this.anInt1247] = arg2;
		this.aShortArray29[this.anInt1247] = arg7;
		return this.anInt1247++;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(SIS)V")
	public void method1142(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt1247; local12++) {
			if (arg0 == this.aShortArray24[local12]) {
				this.aShortArray24[local12] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(SIS)V")
	public void method1143(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray29 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt1247; local11++) {
			if (arg1 == this.aShortArray29[local11]) {
				this.aShortArray29[local11] = arg0;
			}
		}
	}
}
