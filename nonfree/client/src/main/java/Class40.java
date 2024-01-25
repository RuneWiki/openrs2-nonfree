import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class40 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "[Lclient!jq;")
	public Class112[] aClass112Array1;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "[Lclient!ti;")
	public Class191[] aClass191Array1;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!d", name = "V", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!d", name = "X", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public int anInt1151 = 0;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "I")
	public int anInt1170 = 0;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "I")
	public int anInt1169 = 0;

	@OriginalMember(owner = "client!d", name = "H", descriptor = "I")
	public int anInt1163 = 0;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "([B)V")
	public Class40(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method914(arg0);
		} else {
			this.method917(arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray36 = new short[arg1];
		this.anIntArray72 = new int[arg0];
		this.aShortArray37 = new short[arg1];
		this.anIntArray73 = new int[arg0];
		this.anIntArray77 = new int[arg1];
		this.anIntArray74 = new int[arg0];
		this.aByteArray24 = new byte[arg1];
		this.aByteArray16 = new byte[arg1];
		this.anIntArray75 = new int[arg0];
		this.aByteArray23 = new byte[arg1];
		this.aShortArray30 = new short[arg1];
		this.aShortArray40 = new short[arg1];
		this.aShortArray32 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray18 = new byte[arg2];
			this.aShortArray38 = new short[arg2];
			this.aShortArray29 = new short[arg2];
			this.aByteArray17 = new byte[arg2];
			this.aShortArray31 = new short[arg2];
			this.aShortArray28 = new short[arg2];
			this.aByteArray22 = new byte[arg2];
			this.aByteArray25 = new byte[arg2];
			this.aShortArray39 = new short[arg2];
			this.aByteArray21 = new byte[arg2];
			this.aByteArray20 = new byte[arg2];
			this.aShortArray33 = new short[arg2];
		}
		this.aByteArray19 = new byte[arg1];
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "([Lclient!d;I)V")
	public Class40(@OriginalArg(0) Class40[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1163 = 0;
		this.anInt1170 = 0;
		this.anInt1151 = 0;
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
			@Pc(54) Class40 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt1151 += local54.anInt1151;
				this.anInt1170 += local54.anInt1170;
				this.anInt1163 += local54.anInt1163;
				if (local54.aClass191Array1 != null) {
					local31 += local54.aClass191Array1.length;
				}
				local33 |= local54.aByteArray16 != null;
				if (local54.aClass112Array1 != null) {
					local29 += local54.aClass112Array1.length;
				}
				if (local54.aByteArray23 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local54.aByte4;
					}
					if (this.aByte4 != local54.aByte4) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local41 |= local54.aShortArray37 != null;
				local39 |= local54.aByteArray19 != null;
				local37 |= local54.aByteArray24 != null;
				local43 |= local54.anIntArray77 != null;
			}
		}
		this.aShortArray34 = new short[this.anInt1151];
		this.anIntArray74 = new int[this.anInt1163];
		if (local43) {
			this.anIntArray77 = new int[this.anInt1151];
		}
		this.anIntArray73 = new int[this.anInt1163];
		this.aShortArray40 = new short[this.anInt1151];
		if (this.anInt1170 > 0) {
			this.aByteArray21 = new byte[this.anInt1170];
			this.aByteArray18 = new byte[this.anInt1170];
			this.aByteArray25 = new byte[this.anInt1170];
			this.aByteArray20 = new byte[this.anInt1170];
			this.aShortArray31 = new short[this.anInt1170];
			this.aShortArray29 = new short[this.anInt1170];
			this.aShortArray38 = new short[this.anInt1170];
			this.aShortArray39 = new short[this.anInt1170];
			this.aShortArray28 = new short[this.anInt1170];
			this.aByteArray22 = new byte[this.anInt1170];
			this.aByteArray17 = new byte[this.anInt1170];
			this.aShortArray33 = new short[this.anInt1170];
		}
		this.aShortArray32 = new short[this.anInt1151];
		this.aShortArray30 = new short[this.anInt1151];
		if (local37) {
			this.aByteArray24 = new byte[this.anInt1151];
		}
		if (local39) {
			this.aByteArray19 = new byte[this.anInt1151];
		}
		if (local31 > 0) {
			this.aClass191Array1 = new Class191[local31];
		}
		if (local41) {
			this.aShortArray37 = new short[this.anInt1151];
		}
		this.aShortArray36 = new short[this.anInt1151];
		if (local35) {
			this.aByteArray23 = new byte[this.anInt1151];
		}
		this.aShortArray35 = new short[this.anInt1163];
		if (local33) {
			this.aByteArray16 = new byte[this.anInt1151];
		}
		if (local29 > 0) {
			this.aClass112Array1 = new Class112[local29];
		}
		this.anIntArray75 = new int[this.anInt1163];
		this.anIntArray72 = new int[this.anInt1163];
		this.anInt1151 = 0;
		this.anInt1163 = 0;
		this.anInt1170 = 0;
		local29 = 0;
		local31 = 0;
		@Pc(561) int local561;
		@Pc(572) int local572;
		for (@Pc(356) int local356 = 0; local356 < arg1; local356++) {
			@Pc(363) short local363 = (short) (0x1 << local356);
			@Pc(367) Class40 local367 = arg0[local356];
			if (local367 != null) {
				for (@Pc(371) int local371 = 0; local371 < local367.anInt1151; local371++) {
					if (local33 && local367.aByteArray16 != null) {
						this.aByteArray16[this.anInt1151] = local367.aByteArray16[local371];
					}
					if (local35) {
						if (local367.aByteArray23 == null) {
							this.aByteArray23[this.anInt1151] = local367.aByte4;
						} else {
							this.aByteArray23[this.anInt1151] = local367.aByteArray23[local371];
						}
					}
					if (local37 && local367.aByteArray24 != null) {
						this.aByteArray24[this.anInt1151] = local367.aByteArray24[local371];
					}
					if (local41) {
						if (local367.aShortArray37 == null) {
							this.aShortArray37[this.anInt1151] = -1;
						} else {
							this.aShortArray37[this.anInt1151] = local367.aShortArray37[local371];
						}
					}
					if (local43) {
						if (local367.anIntArray77 == null) {
							this.anIntArray77[this.anInt1151] = -1;
						} else {
							this.anIntArray77[this.anInt1151] = local367.anIntArray77[local371];
						}
					}
					this.aShortArray32[this.anInt1151] = (short) this.method912(local363, local367.aShortArray32[local371], local367);
					this.aShortArray40[this.anInt1151] = (short) this.method912(local363, local367.aShortArray40[local371], local367);
					this.aShortArray36[this.anInt1151] = (short) this.method912(local363, local367.aShortArray36[local371], local367);
					this.aShortArray34[this.anInt1151] = local363;
					this.aShortArray30[this.anInt1151] = local367.aShortArray30[local371];
					this.anInt1151++;
				}
				@Pc(548) int local548;
				if (local367.aClass112Array1 != null) {
					for (local548 = 0; local548 < local367.aClass112Array1.length; local548++) {
						local561 = this.method912(local363, local367.aClass112Array1[local548].anInt3024, local367);
						local572 = this.method912(local363, local367.aClass112Array1[local548].anInt3033, local367);
						@Pc(583) int local583 = this.method912(local363, local367.aClass112Array1[local548].anInt3028, local367);
						this.aClass112Array1[local29] = new Class112(local367.aClass112Array1[local548].anInt3038, local561, local572, local583, local367.aClass112Array1[local548].aByte26);
						local29++;
					}
				}
				if (local367.aClass191Array1 != null) {
					for (local548 = 0; local548 < local367.aClass191Array1.length; local548++) {
						local561 = this.method912(local363, local367.aClass191Array1[local548].anInt5987, local367);
						this.aClass191Array1[local31] = new Class191(local367.aClass191Array1[local548].anInt5988, local561);
						local31++;
					}
				}
			}
		}
		@Pc(654) int local654 = 0;
		this.anInt1169 = this.anInt1163;
		for (@Pc(660) int local660 = 0; local660 < arg1; local660++) {
			@Pc(667) short local667 = (short) (0x1 << local660);
			@Pc(671) Class40 local671 = arg0[local660];
			if (local671 != null) {
				for (local561 = 0; local561 < local671.anInt1151; local561++) {
					if (local39) {
						this.aByteArray19[local654++] = (byte) (local671.aByteArray19 == null || local671.aByteArray19[local561] == -1 ? -1 : local671.aByteArray19[local561] + this.anInt1170);
					}
				}
				for (local572 = 0; local572 < local671.anInt1170; local572++) {
					@Pc(723) byte local723 = this.aByteArray20[this.anInt1170] = local671.aByteArray20[local572];
					if (local723 == 0) {
						this.aShortArray39[this.anInt1170] = (short) this.method912(local667, local671.aShortArray39[local572], local671);
						this.aShortArray28[this.anInt1170] = (short) this.method912(local667, local671.aShortArray28[local572], local671);
						this.aShortArray33[this.anInt1170] = (short) this.method912(local667, local671.aShortArray33[local572], local671);
					}
					if (local723 >= 1 && local723 <= 3) {
						this.aShortArray39[this.anInt1170] = local671.aShortArray39[local572];
						this.aShortArray28[this.anInt1170] = local671.aShortArray28[local572];
						this.aShortArray33[this.anInt1170] = local671.aShortArray33[local572];
						this.aShortArray38[this.anInt1170] = local671.aShortArray38[local572];
						this.aShortArray29[this.anInt1170] = local671.aShortArray29[local572];
						this.aShortArray31[this.anInt1170] = local671.aShortArray31[local572];
						this.aByteArray21[this.anInt1170] = local671.aByteArray21[local572];
						this.aByteArray17[this.anInt1170] = local671.aByteArray17[local572];
						this.aByteArray22[this.anInt1170] = local671.aByteArray22[local572];
					}
					if (local723 == 2) {
						this.aByteArray25[this.anInt1170] = local671.aByteArray25[local572];
						this.aByteArray18[this.anInt1170] = local671.aByteArray18[local572];
					}
					this.anInt1170++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(SSSBSSBBSB)B")
	public byte method905() {
		if (this.anInt1170 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray20[this.anInt1170] = 3;
		this.aShortArray39[this.anInt1170] = 0;
		this.aShortArray28[this.anInt1170] = 32767;
		this.aShortArray33[this.anInt1170] = 0;
		this.aShortArray38[this.anInt1170] = 1024;
		this.aShortArray29[this.anInt1170] = 1024;
		this.aShortArray31[this.anInt1170] = 1024;
		this.aByteArray21[this.anInt1170] = 0;
		this.aByteArray17[this.anInt1170] = 0;
		this.aByteArray22[this.anInt1170] = 0;
		return (byte) this.anInt1170++;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIII)V")
	public void method906(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1163; local3++) {
			this.anIntArray73[local3] += arg1;
			this.anIntArray74[local3] += arg2;
			this.anIntArray72[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(BIII)I")
	public int method908(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt1163; local12++) {
			if (arg2 == this.anIntArray73[local12] && this.anIntArray74[local12] == arg0 && this.anIntArray72[local12] == arg1) {
				return local12;
			}
		}
		this.anIntArray73[this.anInt1163] = arg2;
		this.anIntArray74[this.anInt1163] = arg0;
		this.anIntArray72[this.anInt1163] = arg1;
		this.anInt1169 = this.anInt1163 + 1;
		return this.anInt1163++;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(SSI)V")
	public void method910(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray37 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt1151; local17++) {
			if (this.aShortArray37[local17] == arg0) {
				this.aShortArray37[local17] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(SIILclient!d;)I")
	private int method912(@OriginalArg(0) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(10) int local10 = arg2.anIntArray73[arg1];
		@Pc(15) int local15 = arg2.anIntArray74[arg1];
		@Pc(20) int local20 = arg2.anIntArray72[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1163; local22++) {
			if (this.anIntArray73[local22] == local10 && local15 == this.anIntArray74[local22] && this.anIntArray72[local22] == local20) {
				this.aShortArray35[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray73[this.anInt1163] = local10;
		this.anIntArray74[this.anInt1163] = local15;
		this.anIntArray72[this.anInt1163] = local20;
		this.aShortArray35[this.anInt1163] = arg0;
		this.anIntArray75[this.anInt1163] = arg2.anIntArray75 == null ? -1 : arg2.anIntArray75[arg1];
		return this.anInt1163++;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(SZS)V")
	public void method913(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(8) int local8 = 0; local8 < this.anInt1151; local8++) {
			if (arg1 == this.aShortArray30[local8]) {
				this.aShortArray30[local8] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BB)V")
	private void method914(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub4 local10 = new Class3_Sub4(arg0);
		@Pc(15) Class3_Sub4 local15 = new Class3_Sub4(arg0);
		@Pc(20) Class3_Sub4 local20 = new Class3_Sub4(arg0);
		@Pc(25) Class3_Sub4 local25 = new Class3_Sub4(arg0);
		@Pc(30) Class3_Sub4 local30 = new Class3_Sub4(arg0);
		@Pc(35) Class3_Sub4 local35 = new Class3_Sub4(arg0);
		@Pc(40) Class3_Sub4 local40 = new Class3_Sub4(arg0);
		local10.anInt4268 = arg0.length - 23;
		this.anInt1163 = local10.method3649();
		this.anInt1151 = local10.method3649();
		this.anInt1170 = local10.method3643();
		@Pc(65) int local65 = local10.method3643();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(89) int local89 = local10.method3643();
		@Pc(93) int local93 = local10.method3643();
		@Pc(97) int local97 = local10.method3643();
		@Pc(101) int local101 = local10.method3643();
		@Pc(105) int local105 = local10.method3643();
		@Pc(109) int local109 = local10.method3649();
		@Pc(113) int local113 = local10.method3649();
		@Pc(117) int local117 = local10.method3649();
		@Pc(121) int local121 = local10.method3649();
		@Pc(125) int local125 = local10.method3649();
		@Pc(127) int local127 = 0;
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(144) int local144;
		if (this.anInt1170 > 0) {
			this.aByteArray20 = new byte[this.anInt1170];
			local10.anInt4268 = 0;
			for (local144 = 0; local144 < this.anInt1170; local144++) {
				@Pc(155) byte local155 = this.aByteArray20[local144] = local10.method3621();
				if (local155 == 0) {
					local127++;
				}
				if (local155 == 2) {
					local131++;
				}
				if (local155 >= 1 && local155 <= 3) {
					local129++;
				}
			}
		}
		local144 = this.anInt1170;
		@Pc(184) int local184 = local144;
		local144 += this.anInt1163;
		@Pc(191) int local191 = local144;
		if (local76) {
			local144 += this.anInt1151;
		}
		@Pc(200) int local200 = local144;
		local144 += this.anInt1151;
		@Pc(207) int local207 = local144;
		if (local89 == 255) {
			local144 += this.anInt1151;
		}
		@Pc(219) int local219 = local144;
		if (local97 == 1) {
			local144 += this.anInt1151;
		}
		@Pc(229) int local229 = local144;
		if (local105 == 1) {
			local144 += this.anInt1163;
		}
		@Pc(241) int local241 = local144;
		if (local93 == 1) {
			local144 += this.anInt1151;
		}
		@Pc(253) int local253 = local144;
		local144 += local121;
		@Pc(259) int local259 = local144;
		if (local101 == 1) {
			local144 += this.anInt1151 * 2;
		}
		@Pc(273) int local273 = local144;
		local144 += local125;
		@Pc(279) int local279 = local144;
		local144 += this.anInt1151 * 2;
		@Pc(288) int local288 = local144;
		local144 += local109;
		@Pc(294) int local294 = local144;
		local144 += local113;
		@Pc(300) int local300 = local144;
		local144 += local117;
		@Pc(312) int local312 = local144;
		local144 += local127 * 6;
		@Pc(320) int local320 = local144;
		local144 += local129 * 6;
		@Pc(328) int local328 = local144;
		local144 += local129 * 6;
		@Pc(336) int local336 = local144;
		local144 += local129;
		@Pc(342) int local342 = local144;
		local144 += local129;
		@Pc(348) int local348 = local144;
		local144 += local131 * 2 + local129;
		if (local76) {
			this.aByteArray16 = new byte[this.anInt1151];
		}
		if (local101 == 1) {
			this.aShortArray37 = new short[this.anInt1151];
		}
		this.anIntArray72 = new int[this.anInt1163];
		if (local101 == 1 && this.anInt1170 > 0) {
			this.aByteArray19 = new byte[this.anInt1151];
		}
		local10.anInt4268 = local184;
		if (local93 == 1) {
			this.aByteArray24 = new byte[this.anInt1151];
		}
		if (local97 == 1) {
			this.anIntArray77 = new int[this.anInt1151];
		}
		if (this.anInt1170 > 0) {
			this.aShortArray39 = new short[this.anInt1170];
			if (local129 > 0) {
				this.aByteArray17 = new byte[local129];
				this.aShortArray29 = new short[local129];
				this.aByteArray21 = new byte[local129];
				this.aShortArray31 = new short[local129];
				this.aByteArray22 = new byte[local129];
				this.aShortArray38 = new short[local129];
			}
			this.aShortArray33 = new short[this.anInt1170];
			this.aShortArray28 = new short[this.anInt1170];
			if (local131 > 0) {
				this.aByteArray18 = new byte[local131];
				this.aByteArray25 = new byte[local131];
			}
		}
		this.aShortArray36 = new short[this.anInt1151];
		this.aShortArray32 = new short[this.anInt1151];
		this.anIntArray73 = new int[this.anInt1163];
		if (local105 == 1) {
			this.anIntArray75 = new int[this.anInt1163];
		}
		if (local89 == 255) {
			this.aByteArray23 = new byte[this.anInt1151];
		} else {
			this.aByte4 = (byte) local89;
		}
		this.anIntArray74 = new int[this.anInt1163];
		this.aShortArray30 = new short[this.anInt1151];
		this.aShortArray40 = new short[this.anInt1151];
		local15.anInt4268 = local288;
		local20.anInt4268 = local294;
		local25.anInt4268 = local300;
		local30.anInt4268 = local229;
		@Pc(540) int local540 = 0;
		@Pc(542) int local542 = 0;
		@Pc(544) int local544 = 0;
		@Pc(552) int local552;
		for (@Pc(546) int local546 = 0; local546 < this.anInt1163; local546++) {
			local552 = local10.method3643();
			@Pc(554) int local554 = 0;
			if ((local552 & 0x1) != 0) {
				local554 = local15.method3657();
			}
			@Pc(567) int local567 = 0;
			if ((local552 & 0x2) != 0) {
				local567 = local20.method3657();
			}
			@Pc(577) int local577 = 0;
			if ((local552 & 0x4) != 0) {
				local577 = local25.method3657();
			}
			this.anIntArray73[local546] = local540 + local554;
			this.anIntArray74[local546] = local542 + local567;
			this.anIntArray72[local546] = local577 + local544;
			local540 = this.anIntArray73[local546];
			local544 = this.anIntArray72[local546];
			local542 = this.anIntArray74[local546];
			if (local105 == 1) {
				this.anIntArray75[local546] = local30.method3643();
			}
		}
		local10.anInt4268 = local279;
		local15.anInt4268 = local191;
		local20.anInt4268 = local207;
		local25.anInt4268 = local241;
		local30.anInt4268 = local219;
		local35.anInt4268 = local259;
		local40.anInt4268 = local273;
		for (local552 = 0; local552 < this.anInt1151; local552++) {
			this.aShortArray30[local552] = (short) local10.method3649();
			if (local76) {
				this.aByteArray16[local552] = local15.method3621();
			}
			if (local89 == 255) {
				this.aByteArray23[local552] = local20.method3621();
			}
			if (local93 == 1) {
				this.aByteArray24[local552] = local25.method3621();
			}
			if (local97 == 1) {
				this.anIntArray77[local552] = local30.method3643();
			}
			if (local101 == 1) {
				this.aShortArray37[local552] = (short) (local35.method3649() - 1);
			}
			if (this.aByteArray19 != null) {
				if (this.aShortArray37[local552] == -1) {
					this.aByteArray19[local552] = -1;
				} else {
					this.aByteArray19[local552] = (byte) (local40.method3643() - 1);
				}
			}
		}
		local10.anInt4268 = local253;
		this.anInt1169 = -1;
		local15.anInt4268 = local200;
		@Pc(776) short local776 = 0;
		@Pc(778) short local778 = 0;
		@Pc(780) short local780 = 0;
		@Pc(782) short local782 = 0;
		@Pc(790) int local790;
		for (@Pc(784) int local784 = 0; local784 < this.anInt1151; local784++) {
			local790 = local15.method3643();
			if (local790 == 1) {
				local776 = (short) (local10.method3657() + local782);
				local778 = (short) (local776 + local10.method3657());
				local780 = (short) (local778 + local10.method3657());
				this.aShortArray32[local784] = local776;
				local782 = local780;
				this.aShortArray40[local784] = local778;
				this.aShortArray36[local784] = local780;
				if (local776 > this.anInt1169) {
					this.anInt1169 = local776;
				}
				if (local778 > this.anInt1169) {
					this.anInt1169 = local778;
				}
				if (this.anInt1169 < local780) {
					this.anInt1169 = local780;
				}
			}
			if (local790 == 2) {
				local778 = local780;
				local780 = (short) (local782 + local10.method3657());
				this.aShortArray32[local784] = local776;
				local782 = local780;
				this.aShortArray40[local784] = local778;
				this.aShortArray36[local784] = local780;
				if (this.anInt1169 < local780) {
					this.anInt1169 = local780;
				}
			}
			if (local790 == 3) {
				local776 = local780;
				local780 = (short) (local782 + local10.method3657());
				this.aShortArray32[local784] = local776;
				local782 = local780;
				this.aShortArray40[local784] = local778;
				this.aShortArray36[local784] = local780;
				if (this.anInt1169 < local780) {
					this.anInt1169 = local780;
				}
			}
			if (local790 == 4) {
				@Pc(951) short local951 = local776;
				local776 = local778;
				local778 = local951;
				local780 = (short) (local10.method3657() + local782);
				local782 = local780;
				this.aShortArray32[local784] = local776;
				this.aShortArray40[local784] = local951;
				this.aShortArray36[local784] = local780;
				if (this.anInt1169 < local780) {
					this.anInt1169 = local780;
				}
			}
		}
		local10.anInt4268 = local312;
		this.anInt1169++;
		local15.anInt4268 = local320;
		local20.anInt4268 = local328;
		local25.anInt4268 = local336;
		local30.anInt4268 = local342;
		local35.anInt4268 = local348;
		@Pc(1030) int local1030;
		for (local790 = 0; local790 < this.anInt1170; local790++) {
			local1030 = this.aByteArray20[local790] & 0xFF;
			if (local1030 == 0) {
				this.aShortArray39[local790] = (short) local10.method3649();
				this.aShortArray28[local790] = (short) local10.method3649();
				this.aShortArray33[local790] = (short) local10.method3649();
			}
			if (local1030 == 1) {
				this.aShortArray39[local790] = (short) local15.method3649();
				this.aShortArray28[local790] = (short) local15.method3649();
				this.aShortArray33[local790] = (short) local15.method3649();
				this.aShortArray38[local790] = (short) local20.method3649();
				this.aShortArray29[local790] = (short) local20.method3649();
				this.aShortArray31[local790] = (short) local20.method3649();
				this.aByteArray21[local790] = local25.method3621();
				this.aByteArray17[local790] = local30.method3621();
				this.aByteArray22[local790] = local35.method3621();
			}
			if (local1030 == 2) {
				this.aShortArray39[local790] = (short) local15.method3649();
				this.aShortArray28[local790] = (short) local15.method3649();
				this.aShortArray33[local790] = (short) local15.method3649();
				this.aShortArray38[local790] = (short) local20.method3649();
				this.aShortArray29[local790] = (short) local20.method3649();
				this.aShortArray31[local790] = (short) local20.method3649();
				this.aByteArray21[local790] = local25.method3621();
				this.aByteArray17[local790] = local30.method3621();
				this.aByteArray22[local790] = local35.method3621();
				this.aByteArray25[local790] = local35.method3621();
				this.aByteArray18[local790] = local35.method3621();
			}
			if (local1030 == 3) {
				this.aShortArray39[local790] = (short) local15.method3649();
				this.aShortArray28[local790] = (short) local15.method3649();
				this.aShortArray33[local790] = (short) local15.method3649();
				this.aShortArray38[local790] = (short) local20.method3649();
				this.aShortArray29[local790] = (short) local20.method3649();
				this.aShortArray31[local790] = (short) local20.method3649();
				this.aByteArray21[local790] = local25.method3621();
				this.aByteArray17[local790] = local30.method3621();
				this.aByteArray22[local790] = local35.method3621();
			}
		}
		if (!local85) {
			return;
		}
		local10.anInt4268 = local144;
		local1030 = local10.method3643();
		@Pc(1320) int local1320;
		@Pc(1326) int local1326;
		if (local1030 > 0) {
			this.aClass112Array1 = new Class112[local1030];
			for (local1320 = 0; local1320 < local1030; local1320++) {
				local1326 = local10.method3649();
				@Pc(1330) int local1330 = local10.method3649();
				@Pc(1340) byte local1340;
				if (local89 == 255) {
					local1340 = this.aByteArray23[local1330];
				} else {
					local1340 = (byte) local89;
				}
				this.aClass112Array1[local1320] = new Class112(local1326, this.aShortArray32[local1330], this.aShortArray40[local1330], this.aShortArray36[local1330], local1340);
			}
		}
		local1320 = local10.method3643();
		if (local1320 <= 0) {
			return;
		}
		this.aClass191Array1 = new Class191[local1320];
		for (local1326 = 0; local1326 < local1320; local1326++) {
			this.aClass191Array1[local1326] = new Class191(local10.method3649(), local10.method3649());
		}
		return;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBII)V")
	public void method916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg0 != 0) {
			local14 = Class19.anIntArray20[arg0];
			local18 = Class19.anIntArray21[arg0];
			for (local20 = 0; local20 < this.anInt1163; local20++) {
				local38 = local18 * this.anIntArray73[local20] + local14 * this.anIntArray74[local20] >> 15;
				this.anIntArray74[local20] = local18 * this.anIntArray74[local20] - this.anIntArray73[local20] * local14 >> 15;
				this.anIntArray73[local20] = local38;
			}
		}
		if (arg2 != 0) {
			local14 = Class19.anIntArray20[arg2];
			local18 = Class19.anIntArray21[arg2];
			for (local20 = 0; local20 < this.anInt1163; local20++) {
				local38 = local18 * this.anIntArray74[local20] - local14 * this.anIntArray72[local20] >> 15;
				this.anIntArray72[local20] = local14 * this.anIntArray74[local20] + local18 * this.anIntArray72[local20] >> 15;
				this.anIntArray74[local20] = local38;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local14 = Class19.anIntArray20[arg1];
		local18 = Class19.anIntArray21[arg1];
		for (local20 = 0; local20 < this.anInt1163; local20++) {
			local38 = this.anIntArray72[local20] * local14 + this.anIntArray73[local20] * local18 >> 15;
			this.anIntArray72[local20] = this.anIntArray72[local20] * local18 - local14 * this.anIntArray73[local20] >> 15;
			this.anIntArray73[local20] = local38;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BI)V")
	private void method917(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub4 local14 = new Class3_Sub4(arg0);
		@Pc(19) Class3_Sub4 local19 = new Class3_Sub4(arg0);
		@Pc(24) Class3_Sub4 local24 = new Class3_Sub4(arg0);
		@Pc(29) Class3_Sub4 local29 = new Class3_Sub4(arg0);
		@Pc(34) Class3_Sub4 local34 = new Class3_Sub4(arg0);
		local14.anInt4268 = arg0.length - 18;
		this.anInt1163 = local14.method3649();
		this.anInt1151 = local14.method3649();
		this.anInt1170 = local14.method3643();
		@Pc(61) int local61 = local14.method3643();
		@Pc(65) int local65 = local14.method3643();
		@Pc(69) int local69 = local14.method3643();
		@Pc(73) int local73 = local14.method3643();
		@Pc(77) int local77 = local14.method3643();
		@Pc(81) int local81 = local14.method3649();
		@Pc(87) int local87 = local14.method3649();
		@Pc(93) int local93 = local14.method3649();
		@Pc(97) int local97 = local14.method3649();
		@Pc(106) int local106 = this.anInt1163;
		@Pc(108) int local108 = local106;
		local106 += this.anInt1151;
		@Pc(115) int local115 = local106;
		if (local65 == 255) {
			local106 += this.anInt1151;
		}
		@Pc(125) int local125 = local106;
		if (local73 == 1) {
			local106 += this.anInt1151;
		}
		@Pc(135) int local135 = local106;
		if (local61 == 1) {
			local106 += this.anInt1151;
		}
		@Pc(147) int local147 = local106;
		if (local77 == 1) {
			local106 += this.anInt1163;
		}
		@Pc(159) int local159 = local106;
		if (local69 == 1) {
			local106 += this.anInt1151;
		}
		@Pc(169) int local169 = local106;
		local106 += local97;
		@Pc(175) int local175 = local106;
		local106 += this.anInt1151 * 2;
		@Pc(184) int local184 = local106;
		local106 += this.anInt1170 * 6;
		@Pc(193) int local193 = local106;
		local106 += local81;
		@Pc(199) int local199 = local106;
		local106 += local87;
		local14.anInt4268 = 0;
		if (local73 == 1) {
			this.anIntArray77 = new int[this.anInt1151];
		}
		this.anIntArray72 = new int[this.anInt1163];
		if (local65 == 255) {
			this.aByteArray23 = new byte[this.anInt1151];
		} else {
			this.aByte4 = (byte) local65;
		}
		this.aShortArray30 = new short[this.anInt1151];
		this.aShortArray40 = new short[this.anInt1151];
		this.anIntArray73 = new int[this.anInt1163];
		if (this.anInt1170 > 0) {
			this.aShortArray33 = new short[this.anInt1170];
			this.aShortArray39 = new short[this.anInt1170];
			this.aShortArray28 = new short[this.anInt1170];
			this.aByteArray20 = new byte[this.anInt1170];
		}
		this.aShortArray36 = new short[this.anInt1151];
		this.anIntArray74 = new int[this.anInt1163];
		if (local77 == 1) {
			this.anIntArray75 = new int[this.anInt1163];
		}
		if (local61 == 1) {
			this.aShortArray37 = new short[this.anInt1151];
			this.aByteArray16 = new byte[this.anInt1151];
			this.aByteArray19 = new byte[this.anInt1151];
		}
		this.aShortArray32 = new short[this.anInt1151];
		if (local69 == 1) {
			this.aByteArray24 = new byte[this.anInt1151];
		}
		local19.anInt4268 = local193;
		local24.anInt4268 = local199;
		local29.anInt4268 = local106;
		local34.anInt4268 = local147;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(356) int local356;
		@Pc(358) int local358;
		for (@Pc(350) int local350 = 0; local350 < this.anInt1163; local350++) {
			local356 = local14.method3643();
			local358 = 0;
			if ((local356 & 0x1) != 0) {
				local358 = local19.method3657();
			}
			@Pc(368) int local368 = 0;
			if ((local356 & 0x2) != 0) {
				local368 = local24.method3657();
			}
			@Pc(381) int local381 = 0;
			if ((local356 & 0x4) != 0) {
				local381 = local29.method3657();
			}
			this.anIntArray73[local350] = local344 + local358;
			this.anIntArray74[local350] = local368 + local346;
			this.anIntArray72[local350] = local348 + local381;
			local344 = this.anIntArray73[local350];
			local346 = this.anIntArray74[local350];
			local348 = this.anIntArray72[local350];
			if (local77 == 1) {
				this.anIntArray75[local350] = local34.method3643();
			}
		}
		local14.anInt4268 = local175;
		local19.anInt4268 = local135;
		local24.anInt4268 = local115;
		local29.anInt4268 = local159;
		local34.anInt4268 = local125;
		for (local356 = 0; local356 < this.anInt1151; local356++) {
			this.aShortArray30[local356] = (short) local14.method3649();
			if (local61 == 1) {
				local358 = local19.method3643();
				if ((local358 & 0x1) == 1) {
					this.aByteArray16[local356] = 1;
					local7 = true;
				} else {
					this.aByteArray16[local356] = 0;
				}
				if ((local358 & 0x2) == 2) {
					this.aByteArray19[local356] = (byte) (local358 >> 2);
					this.aShortArray37[local356] = this.aShortArray30[local356];
					this.aShortArray30[local356] = 127;
					if (this.aShortArray37[local356] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray19[local356] = -1;
					this.aShortArray37[local356] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray23[local356] = local24.method3621();
			}
			if (local69 == 1) {
				this.aByteArray24[local356] = local29.method3621();
			}
			if (local73 == 1) {
				this.anIntArray77[local356] = local34.method3643();
			}
		}
		local14.anInt4268 = local169;
		this.anInt1169 = -1;
		local19.anInt4268 = local108;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(619) int local619;
		for (@Pc(613) int local613 = 0; local613 < this.anInt1151; local613++) {
			local619 = local19.method3643();
			if (local619 == 1) {
				local601 = (short) (local14.method3657() + local607);
				local603 = (short) (local601 + local14.method3657());
				local605 = (short) (local603 + local14.method3657());
				this.aShortArray32[local613] = local601;
				local607 = local605;
				this.aShortArray40[local613] = local603;
				this.aShortArray36[local613] = local605;
				if (this.anInt1169 < local601) {
					this.anInt1169 = local601;
				}
				if (this.anInt1169 < local603) {
					this.anInt1169 = local603;
				}
				if (this.anInt1169 < local605) {
					this.anInt1169 = local605;
				}
			}
			if (local619 == 2) {
				local603 = local605;
				local605 = (short) (local607 + local14.method3657());
				local607 = local605;
				this.aShortArray32[local613] = local601;
				this.aShortArray40[local613] = local603;
				this.aShortArray36[local613] = local605;
				if (this.anInt1169 < local605) {
					this.anInt1169 = local605;
				}
			}
			if (local619 == 3) {
				local601 = local605;
				local605 = (short) (local14.method3657() + local607);
				local607 = local605;
				this.aShortArray32[local613] = local601;
				this.aShortArray40[local613] = local603;
				this.aShortArray36[local613] = local605;
				if (local605 > this.anInt1169) {
					this.anInt1169 = local605;
				}
			}
			if (local619 == 4) {
				@Pc(778) short local778 = local601;
				local601 = local603;
				local605 = (short) (local14.method3657() + local607);
				local603 = local778;
				local607 = local605;
				this.aShortArray32[local613] = local601;
				this.aShortArray40[local613] = local778;
				this.aShortArray36[local613] = local605;
				if (this.anInt1169 < local605) {
					this.anInt1169 = local605;
				}
			}
		}
		this.anInt1169++;
		local14.anInt4268 = local184;
		for (local619 = 0; local619 < this.anInt1170; local619++) {
			this.aByteArray20[local619] = 0;
			this.aShortArray39[local619] = (short) local14.method3649();
			this.aShortArray28[local619] = (short) local14.method3649();
			this.aShortArray33[local619] = (short) local14.method3649();
		}
		if (this.aByteArray19 != null) {
			@Pc(874) boolean local874 = false;
			for (@Pc(876) int local876 = 0; local876 < this.anInt1151; local876++) {
				@Pc(885) int local885 = this.aByteArray19[local876] & 0xFF;
				if (local885 != 255) {
					if (this.aShortArray32[local876] == (this.aShortArray39[local885] & 0xFFFF) && (this.aShortArray28[local885] & 0xFFFF) == this.aShortArray40[local876] && this.aShortArray36[local876] == (this.aShortArray33[local885] & 0xFFFF)) {
						this.aByteArray19[local876] = -1;
					} else {
						local874 = true;
					}
				}
			}
			if (!local874) {
				this.aByteArray19 = null;
			}
		}
		if (!local9) {
			this.aShortArray37 = null;
		}
		if (!local7) {
			this.aByteArray16 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)[[I")
	public int[][] method919() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1169; local12++) {
			@Pc(19) int local19 = this.anIntArray75[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local54[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt1169; local80++) {
			@Pc(87) int local87 = this.anIntArray75[local80];
			if (local87 >= 0) {
				local54[local87][local8[local87]++] = local80;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)[[I")
	public int[][] method921() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1151; local12++) {
			@Pc(25) int local25 = this.anIntArray77[local12];
			if (local25 >= 0) {
				@Pc(34) int local34 = local8[local25]++;
				if (local10 < local25) {
					local10 = local25;
				}
			}
		}
		@Pc(60) int[][] local60 = new int[local10 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local10; local62++) {
			local60[local62] = new int[local8[local62]];
			local8[local62] = 0;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt1151; local85++) {
			@Pc(92) int local92 = this.anIntArray77[local85];
			if (local92 >= 0) {
				local60[local92][local8[local92]++] = local85;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ISIBISBBB)I")
	public int method922(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) short arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray32[this.anInt1151] = (short) arg0;
		this.aShortArray40[this.anInt1151] = (short) arg3;
		this.aShortArray36[this.anInt1151] = (short) arg2;
		this.aByteArray16[this.anInt1151] = arg6;
		this.aByteArray19[this.anInt1151] = arg5;
		this.aShortArray30[this.anInt1151] = arg1;
		this.aByteArray24[this.anInt1151] = arg7;
		this.aShortArray37[this.anInt1151] = arg4;
		return this.anInt1151++;
	}
}
