import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class242 {

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "[Lclient!ot;")
	public Class178[] aClass178Array3;

	@OriginalMember(owner = "client!uu", name = "l", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!uu", name = "m", descriptor = "[I")
	public int[] anIntArray500;

	@OriginalMember(owner = "client!uu", name = "n", descriptor = "[I")
	public int[] anIntArray501;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!uu", name = "q", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "[I")
	public int[] anIntArray503;

	@OriginalMember(owner = "client!uu", name = "s", descriptor = "[I")
	public int[] anIntArray504;

	@OriginalMember(owner = "client!uu", name = "t", descriptor = "[I")
	public int[] anIntArray505;

	@OriginalMember(owner = "client!uu", name = "u", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!uu", name = "v", descriptor = "[I")
	public int[] anIntArray506;

	@OriginalMember(owner = "client!uu", name = "w", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!uu", name = "x", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!uu", name = "y", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!uu", name = "z", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!uu", name = "B", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!uu", name = "D", descriptor = "[B")
	public byte[] aByteArray78;

	@OriginalMember(owner = "client!uu", name = "F", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!uu", name = "G", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!uu", name = "H", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!uu", name = "I", descriptor = "[Lclient!wo;")
	public Class266[] aClass266Array1;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "[I")
	public int[] anIntArray508;

	@OriginalMember(owner = "client!uu", name = "L", descriptor = "[Lclient!sm;")
	public Class209[] aClass209Array3;

	@OriginalMember(owner = "client!uu", name = "O", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!uu", name = "U", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!uu", name = "W", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!uu", name = "X", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!uu", name = "bb", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!uu", name = "db", descriptor = "[I")
	public int[] anIntArray510;

	@OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
	public int anInt7158 = 0;

	@OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
	public int anInt7157 = 0;

	@OriginalMember(owner = "client!uu", name = "S", descriptor = "B")
	public byte aByte104 = 0;

	@OriginalMember(owner = "client!uu", name = "T", descriptor = "I")
	public int anInt7164 = 0;

	@OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
	public int anInt7154 = 12;

	@OriginalMember(owner = "client!uu", name = "ab", descriptor = "I")
	public int anInt7167 = 0;

	static {
		new Class175("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
		new Class175(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "([B)V")
	public Class242(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5558(arg0);
		} else {
			this.method5559(arg0);
		}
	}

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(III)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 0) {
			this.anIntArray506 = new int[arg2];
			this.anIntArray503 = new int[arg2];
			this.aByteArray81 = new byte[arg2];
			this.aShortArray92 = new short[arg2];
			this.anIntArray504 = new int[arg2];
			this.aByteArray77 = new byte[arg2];
			this.anIntArray502 = new int[arg2];
			this.aShortArray96 = new short[arg2];
			this.anIntArray509 = new int[arg2];
			this.aByteArray82 = new byte[arg2];
			this.aShortArray89 = new short[arg2];
			this.anIntArray505 = new int[arg2];
		}
		this.anIntArray510 = new int[arg0];
		this.aByteArray80 = new byte[arg1];
		this.aByteArray76 = new byte[arg1];
		this.anIntArray508 = new int[arg0];
		this.anIntArray500 = new int[arg0];
		this.aShortArray98 = new short[arg1];
		this.anIntArray501 = new int[arg0];
		this.aShortArray95 = new short[arg1];
		this.aShortArray91 = new short[arg1];
		this.aByteArray78 = new byte[arg1];
		this.aShortArray90 = new short[arg1];
		this.aByteArray79 = new byte[arg1];
		this.anIntArray507 = new int[arg1];
		this.aShortArray97 = new short[arg1];
	}

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "([Lclient!uu;I)V")
	public Class242(@OriginalArg(0) Class242[] arg0, @OriginalArg(1) int arg1) {
		this.anInt7167 = 0;
		this.anInt7157 = 0;
		this.anInt7164 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte104 = -1;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class242 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt7167 += local56.anInt7167;
				this.anInt7164 += local56.anInt7164;
				this.anInt7157 += local56.anInt7157;
				local36 |= local56.aByteArray79 != null;
				if (local56.aClass178Array3 != null) {
					local32 += local56.aClass178Array3.length;
				}
				if (local56.aClass266Array1 != null) {
					local34 += local56.aClass266Array1.length;
				}
				if (local56.aClass209Array3 != null) {
					local30 += local56.aClass209Array3.length;
				}
				local44 |= local56.aShortArray90 != null;
				local40 |= local56.aByteArray80 != null;
				local42 |= local56.aByteArray78 != null;
				local46 |= local56.anIntArray507 != null;
				if (local56.aByteArray76 == null) {
					if (this.aByte104 == -1) {
						this.aByte104 = local56.aByte104;
					}
					if (this.aByte104 != local56.aByte104) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
			}
		}
		this.anIntArray510 = new int[this.anInt7167];
		if (local32 > 0) {
			this.aClass178Array3 = new Class178[local32];
		}
		if (local42) {
			this.aByteArray78 = new byte[this.anInt7157];
		}
		if (this.anInt7164 > 0) {
			this.anIntArray503 = new int[this.anInt7164];
			this.anIntArray506 = new int[this.anInt7164];
			this.aShortArray96 = new short[this.anInt7164];
			this.aByteArray77 = new byte[this.anInt7164];
			this.aShortArray89 = new short[this.anInt7164];
			this.anIntArray502 = new int[this.anInt7164];
			this.aShortArray92 = new short[this.anInt7164];
			this.aByteArray81 = new byte[this.anInt7164];
			this.anIntArray504 = new int[this.anInt7164];
			this.aByteArray82 = new byte[this.anInt7164];
			this.anIntArray509 = new int[this.anInt7164];
			this.anIntArray505 = new int[this.anInt7164];
		}
		this.anIntArray501 = new int[this.anInt7167];
		this.aShortArray93 = new short[this.anInt7157];
		this.aShortArray95 = new short[this.anInt7157];
		if (local34 > 0) {
			this.aClass266Array1 = new Class266[local34];
		}
		this.aShortArray98 = new short[this.anInt7157];
		if (local38) {
			this.aByteArray76 = new byte[this.anInt7157];
		}
		this.aShortArray94 = new short[this.anInt7167];
		if (local40) {
			this.aByteArray80 = new byte[this.anInt7157];
		}
		if (local30 > 0) {
			this.aClass209Array3 = new Class209[local30];
		}
		if (local44) {
			this.aShortArray90 = new short[this.anInt7157];
		}
		this.aShortArray97 = new short[this.anInt7157];
		this.anIntArray500 = new int[this.anInt7167];
		this.aShortArray91 = new short[this.anInt7157];
		this.anIntArray508 = new int[this.anInt7167];
		if (local36) {
			this.aByteArray79 = new byte[this.anInt7157];
		}
		if (local46) {
			this.anIntArray507 = new int[this.anInt7157];
		}
		this.anInt7167 = 0;
		this.anInt7157 = 0;
		local30 = 0;
		this.anInt7164 = 0;
		local34 = 0;
		local32 = 0;
		@Pc(607) int local607;
		@Pc(618) int local618;
		for (@Pc(377) int local377 = 0; local377 < arg1; local377++) {
			@Pc(383) short local383 = (short) (0x1 << local377);
			@Pc(387) Class242 local387 = arg0[local377];
			if (local387 != null) {
				@Pc(394) int local394;
				if (local387.aClass266Array1 != null) {
					for (local394 = 0; local394 < local387.aClass266Array1.length; local394++) {
						@Pc(400) Class266 local400 = local387.aClass266Array1[local394];
						this.aClass266Array1[local34++] = local400.method5931(local400.anInt7551 + this.anInt7157);
					}
				}
				for (local394 = 0; local394 < local387.anInt7157; local394++) {
					if (local36 && local387.aByteArray79 != null) {
						this.aByteArray79[this.anInt7157] = local387.aByteArray79[local394];
					}
					if (local38) {
						if (local387.aByteArray76 == null) {
							this.aByteArray76[this.anInt7157] = local387.aByte104;
						} else {
							this.aByteArray76[this.anInt7157] = local387.aByteArray76[local394];
						}
					}
					if (local40 && local387.aByteArray80 != null) {
						this.aByteArray80[this.anInt7157] = local387.aByteArray80[local394];
					}
					if (local44) {
						if (local387.aShortArray90 == null) {
							this.aShortArray90[this.anInt7157] = -1;
						} else {
							this.aShortArray90[this.anInt7157] = local387.aShortArray90[local394];
						}
					}
					if (local46) {
						if (local387.anIntArray507 == null) {
							this.anIntArray507[this.anInt7157] = -1;
						} else {
							this.anIntArray507[this.anInt7157] = local387.anIntArray507[local394];
						}
					}
					this.aShortArray91[this.anInt7157] = (short) this.method5560(local383, local387.aShortArray91[local394], local387);
					this.aShortArray97[this.anInt7157] = (short) this.method5560(local383, local387.aShortArray97[local394], local387);
					this.aShortArray98[this.anInt7157] = (short) this.method5560(local383, local387.aShortArray98[local394], local387);
					this.aShortArray93[this.anInt7157] = local383;
					this.aShortArray95[this.anInt7157] = local387.aShortArray95[local394];
					this.anInt7157++;
				}
				@Pc(595) int local595;
				if (local387.aClass209Array3 != null) {
					for (local595 = 0; local595 < local387.aClass209Array3.length; local595++) {
						local607 = this.method5560(local383, local387.aClass209Array3[local595].anInt6545, local387);
						local618 = this.method5560(local383, local387.aClass209Array3[local595].anInt6557, local387);
						@Pc(629) int local629 = this.method5560(local383, local387.aClass209Array3[local595].anInt6544, local387);
						this.aClass209Array3[local30] = local387.aClass209Array3[local595].method5148(local607, local629, local618);
						local30++;
					}
				}
				if (local387.aClass178Array3 != null) {
					for (local595 = 0; local595 < local387.aClass178Array3.length; local595++) {
						local607 = this.method5560(local383, local387.aClass178Array3[local595].anInt5411, local387);
						this.aClass178Array3[local32] = local387.aClass178Array3[local595].method4371(local607);
						local32++;
					}
				}
			}
		}
		this.anInt7158 = this.anInt7167;
		@Pc(694) int local694 = 0;
		for (@Pc(696) int local696 = 0; local696 < arg1; local696++) {
			@Pc(702) short local702 = (short) (0x1 << local696);
			@Pc(706) Class242 local706 = arg0[local696];
			if (local706 != null) {
				for (local607 = 0; local607 < local706.anInt7157; local607++) {
					if (local42) {
						this.aByteArray78[local694++] = (byte) (local706.aByteArray78 == null || local706.aByteArray78[local607] == -1 ? -1 : local706.aByteArray78[local607] + this.anInt7164);
					}
				}
				for (local618 = 0; local618 < local706.anInt7164; local618++) {
					@Pc(760) byte local760 = this.aByteArray82[this.anInt7164] = local706.aByteArray82[local618];
					if (local760 == 0) {
						this.aShortArray92[this.anInt7164] = (short) this.method5560(local702, local706.aShortArray92[local618], local706);
						this.aShortArray89[this.anInt7164] = (short) this.method5560(local702, local706.aShortArray89[local618], local706);
						this.aShortArray96[this.anInt7164] = (short) this.method5560(local702, local706.aShortArray96[local618], local706);
					}
					if (local760 >= 1 && local760 <= 3) {
						this.aShortArray92[this.anInt7164] = local706.aShortArray92[local618];
						this.aShortArray89[this.anInt7164] = local706.aShortArray89[local618];
						this.aShortArray96[this.anInt7164] = local706.aShortArray96[local618];
						this.anIntArray505[this.anInt7164] = local706.anIntArray505[local618];
						this.anIntArray502[this.anInt7164] = local706.anIntArray502[local618];
						this.anIntArray503[this.anInt7164] = local706.anIntArray503[local618];
						this.aByteArray81[this.anInt7164] = local706.aByteArray81[local618];
						this.aByteArray77[this.anInt7164] = local706.aByteArray77[local618];
						this.anIntArray504[this.anInt7164] = local706.anIntArray504[local618];
					}
					if (local760 == 2) {
						this.anIntArray506[this.anInt7164] = local706.anIntArray506[local618];
						this.anIntArray509[this.anInt7164] = local706.anIntArray509[local618];
					}
					this.anInt7164++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)[[I")
	public int[][] method5545() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt7158; local17++) {
			@Pc(24) int local24 = this.anIntArray508[local17];
			if (local24 >= 0) {
				if (local15 < local24) {
					local15 = local24;
				}
				@Pc(39) int local39 = local8[local24]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local15 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local15; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt7158; local73++) {
			@Pc(80) int local80 = this.anIntArray508[local73];
			if (local80 >= 0) {
				local52[local80][local8[local80]++] = local73;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)V")
	public void method5546() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7167; local1++) {
			this.anIntArray510[local1] <<= 0x0;
			this.anIntArray501[local1] <<= 0x0;
			this.anIntArray500[local1] <<= 0x0;
		}
		if (this.anInt7164 <= 0 || this.anIntArray505 == null) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray505.length; local53++) {
			this.anIntArray505[local53] <<= 0x0;
			this.anIntArray502[local53] <<= 0x0;
			if (this.aByteArray82[local53] != 1) {
				this.anIntArray503[local53] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZSS)V")
	public void method5547(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray90 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt7157; local9++) {
			if (this.aShortArray90[local9] == arg1) {
				this.aShortArray90[local9] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ISS)V")
	public void method5548(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt7157; local5++) {
			if (arg0 == this.aShortArray95[local5]) {
				this.aShortArray95[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(SSBBSBSSSI)B")
	public byte method5549() {
		if (this.anInt7164 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray82[this.anInt7164] = 3;
		this.aShortArray92[this.anInt7164] = 0;
		this.aShortArray89[this.anInt7164] = 32767;
		this.aShortArray96[this.anInt7164] = 0;
		this.anIntArray505[this.anInt7164] = 1024;
		this.anIntArray502[this.anInt7164] = 1024;
		this.anIntArray503[this.anInt7164] = 1024;
		this.aByteArray81[this.anInt7164] = 0;
		this.aByteArray77[this.anInt7164] = 0;
		this.anIntArray504[this.anInt7164] = 0;
		return (byte) this.anInt7164++;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)[[I")
	public int[][] method5550() {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.aClass266Array1.length; local18++) {
			@Pc(26) int local26 = this.aClass266Array1[local18].anInt7553;
			if (local26 >= 0) {
				@Pc(32) int local32 = local14[local26]++;
				if (local16 < local26) {
					local16 = local26;
				}
			}
		}
		@Pc(55) int[][] local55 = new int[local16 + 1][];
		for (@Pc(57) int local57 = 0; local57 <= local16; local57++) {
			local55[local57] = new int[local14[local57]];
			local14[local57] = 0;
		}
		for (@Pc(76) int local76 = 0; local76 < this.aClass266Array1.length; local76++) {
			@Pc(84) int local84 = this.aClass266Array1[local76].anInt7553;
			if (local84 >= 0) {
				local55[local84][local14[local84]++] = local76;
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBII)V")
	public void method5551(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(44) int local44;
		if (arg2 != 0) {
			local19 = Applet_Sub1.anIntArray85[arg2];
			local23 = Applet_Sub1.anIntArray87[arg2];
			for (local25 = 0; local25 < this.anInt7167; local25++) {
				local44 = local19 * this.anIntArray501[local25] + local23 * this.anIntArray510[local25] >> 15;
				this.anIntArray501[local25] = local23 * this.anIntArray501[local25] - local19 * this.anIntArray510[local25] >> 15;
				this.anIntArray510[local25] = local44;
			}
		}
		if (arg0 != 0) {
			local19 = Applet_Sub1.anIntArray85[arg0];
			local23 = Applet_Sub1.anIntArray87[arg0];
			for (local25 = 0; local25 < this.anInt7167; local25++) {
				local44 = local23 * this.anIntArray501[local25] - local19 * this.anIntArray500[local25] >> 15;
				this.anIntArray500[local25] = local23 * this.anIntArray500[local25] + local19 * this.anIntArray501[local25] >> 15;
				this.anIntArray501[local25] = local44;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local19 = Applet_Sub1.anIntArray85[arg1];
		local23 = Applet_Sub1.anIntArray87[arg1];
		for (local25 = 0; local25 < this.anInt7167; local25++) {
			local44 = local19 * this.anIntArray500[local25] + this.anIntArray510[local25] * local23 >> 15;
			this.anIntArray500[local25] = this.anIntArray500[local25] * local23 - this.anIntArray510[local25] * local19 >> 15;
			this.anIntArray510[local25] = local44;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIZI)V")
	public void method5554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt7167; local9++) {
			this.anIntArray510[local9] += arg1;
			this.anIntArray501[local9] += arg0;
			this.anIntArray500[local9] += arg2;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BSBIISIBI)I")
	public int method5555(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray91[this.anInt7157] = (short) arg4;
		this.aShortArray97[this.anInt7157] = (short) arg3;
		this.aShortArray98[this.anInt7157] = (short) arg7;
		this.aByteArray79[this.anInt7157] = arg2;
		this.aByteArray78[this.anInt7157] = arg0;
		this.aShortArray95[this.anInt7157] = arg1;
		this.aByteArray80[this.anInt7157] = arg6;
		this.aShortArray90[this.anInt7157] = arg5;
		return this.anInt7157++;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BIII)I")
	public int method5557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt7167; local13++) {
			if (arg1 == this.anIntArray510[local13] && arg2 == this.anIntArray501[local13] && arg0 == this.anIntArray500[local13]) {
				return local13;
			}
		}
		this.anIntArray510[this.anInt7167] = arg1;
		this.anIntArray501[this.anInt7167] = arg2;
		this.anIntArray500[this.anInt7167] = arg0;
		this.anInt7158 = this.anInt7167 + 1;
		return this.anInt7167++;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "([BB)V")
	private void method5558(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub2 local8 = new Class3_Sub2(arg0);
		@Pc(13) Class3_Sub2 local13 = new Class3_Sub2(arg0);
		@Pc(18) Class3_Sub2 local18 = new Class3_Sub2(arg0);
		@Pc(23) Class3_Sub2 local23 = new Class3_Sub2(arg0);
		@Pc(28) Class3_Sub2 local28 = new Class3_Sub2(arg0);
		@Pc(33) Class3_Sub2 local33 = new Class3_Sub2(arg0);
		@Pc(38) Class3_Sub2 local38 = new Class3_Sub2(arg0);
		local8.anInt7620 = arg0.length - 23;
		this.anInt7167 = local8.method6004();
		this.anInt7157 = local8.method6004();
		this.anInt7164 = local8.method6053();
		@Pc(69) int local69 = local8.method6053();
		@Pc(80) boolean local80 = (local69 & 0x1) == 1;
		@Pc(89) boolean local89 = (local69 & 0x2) == 2;
		@Pc(98) boolean local98 = (local69 & 0x4) == 4;
		@Pc(109) boolean local109 = (local69 & 0x8) == 8;
		if (local109) {
			local8.anInt7620 -= 7;
			this.anInt7154 = local8.method6053();
			local8.anInt7620 += 6;
		}
		@Pc(132) int local132 = local8.method6053();
		@Pc(136) int local136 = local8.method6053();
		@Pc(140) int local140 = local8.method6053();
		@Pc(144) int local144 = local8.method6053();
		@Pc(148) int local148 = local8.method6053();
		@Pc(152) int local152 = local8.method6004();
		@Pc(156) int local156 = local8.method6004();
		@Pc(160) int local160 = local8.method6004();
		@Pc(164) int local164 = local8.method6004();
		@Pc(168) int local168 = local8.method6004();
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(190) int local190;
		if (this.anInt7164 > 0) {
			this.aByteArray82 = new byte[this.anInt7164];
			local8.anInt7620 = 0;
			for (local190 = 0; local190 < this.anInt7164; local190++) {
				@Pc(200) byte local200 = this.aByteArray82[local190] = local8.method6011();
				if (local200 >= 1 && local200 <= 3) {
					local172++;
				}
				if (local200 == 2) {
					local174++;
				}
				if (local200 == 0) {
					local170++;
				}
			}
		}
		local190 = this.anInt7164;
		@Pc(235) int local235 = local190;
		local190 += this.anInt7167;
		@Pc(242) int local242 = local190;
		if (local80) {
			local190 += this.anInt7157;
		}
		@Pc(251) int local251 = local190;
		local190 += this.anInt7157;
		@Pc(258) int local258 = local190;
		if (local132 == 255) {
			local190 += this.anInt7157;
		}
		@Pc(270) int local270 = local190;
		if (local140 == 1) {
			local190 += this.anInt7157;
		}
		@Pc(280) int local280 = local190;
		if (local148 == 1) {
			local190 += this.anInt7167;
		}
		@Pc(292) int local292 = local190;
		if (local136 == 1) {
			local190 += this.anInt7157;
		}
		@Pc(302) int local302 = local190;
		local190 += local164;
		@Pc(308) int local308 = local190;
		if (local144 == 1) {
			local190 += this.anInt7157 * 2;
		}
		@Pc(320) int local320 = local190;
		local190 += local168;
		@Pc(326) int local326 = local190;
		local190 += this.anInt7157 * 2;
		@Pc(335) int local335 = local190;
		local190 += local152;
		@Pc(341) int local341 = local190;
		local190 += local156;
		@Pc(347) int local347 = local190;
		local190 += local160;
		@Pc(353) int local353 = local190;
		local190 += local170 * 6;
		@Pc(361) int local361 = local190;
		local190 += local172 * 6;
		@Pc(375) int local375 = this.anInt7154 >= 14 ? 7 : 6;
		@Pc(377) int local377 = local190;
		local190 += local172 * local375;
		@Pc(385) int local385 = local190;
		local190 += local172;
		@Pc(391) int local391 = local190;
		local190 += local172;
		@Pc(397) int local397 = local190;
		local190 += local172 + local174 * 2;
		if (local148 == 1) {
			this.anIntArray508 = new int[this.anInt7167];
		}
		local8.anInt7620 = local235;
		if (this.anInt7164 > 0) {
			if (local172 > 0) {
				this.aByteArray77 = new byte[local172];
				this.anIntArray505 = new int[local172];
				this.anIntArray503 = new int[local172];
				this.aByteArray81 = new byte[local172];
				this.anIntArray502 = new int[local172];
				this.anIntArray504 = new int[local172];
			}
			this.aShortArray89 = new short[this.anInt7164];
			if (local174 > 0) {
				this.anIntArray509 = new int[local174];
				this.anIntArray506 = new int[local174];
			}
			this.aShortArray96 = new short[this.anInt7164];
			this.aShortArray92 = new short[this.anInt7164];
		}
		this.aShortArray97 = new short[this.anInt7157];
		if (local80) {
			this.aByteArray79 = new byte[this.anInt7157];
		}
		if (local136 == 1) {
			this.aByteArray80 = new byte[this.anInt7157];
		}
		this.aShortArray91 = new short[this.anInt7157];
		if (local140 == 1) {
			this.anIntArray507 = new int[this.anInt7157];
		}
		this.anIntArray500 = new int[this.anInt7167];
		if (local144 == 1 && this.anInt7164 > 0) {
			this.aByteArray78 = new byte[this.anInt7157];
		}
		this.anIntArray501 = new int[this.anInt7167];
		if (local144 == 1) {
			this.aShortArray90 = new short[this.anInt7157];
		}
		this.aShortArray95 = new short[this.anInt7157];
		if (local132 == 255) {
			this.aByteArray76 = new byte[this.anInt7157];
		} else {
			this.aByte104 = (byte) local132;
		}
		this.aShortArray98 = new short[this.anInt7157];
		this.anIntArray510 = new int[this.anInt7167];
		local13.anInt7620 = local335;
		local18.anInt7620 = local341;
		local23.anInt7620 = local347;
		local28.anInt7620 = local280;
		@Pc(584) int local584 = 0;
		@Pc(586) int local586 = 0;
		@Pc(588) int local588 = 0;
		@Pc(597) int local597;
		for (@Pc(590) int local590 = 0; local590 < this.anInt7167; local590++) {
			local597 = local8.method6053();
			@Pc(599) int local599 = 0;
			if ((local597 & 0x1) != 0) {
				local599 = local13.method6038();
			}
			@Pc(612) int local612 = 0;
			if ((local597 & 0x2) != 0) {
				local612 = local18.method6038();
			}
			@Pc(622) int local622 = 0;
			if ((local597 & 0x4) != 0) {
				local622 = local23.method6038();
			}
			this.anIntArray510[local590] = local584 + local599;
			this.anIntArray501[local590] = local612 + local586;
			this.anIntArray500[local590] = local588 + local622;
			local586 = this.anIntArray501[local590];
			local584 = this.anIntArray510[local590];
			local588 = this.anIntArray500[local590];
			if (local148 == 1) {
				this.anIntArray508[local590] = local28.method6053();
			}
		}
		local8.anInt7620 = local326;
		local13.anInt7620 = local242;
		local18.anInt7620 = local258;
		local23.anInt7620 = local292;
		local28.anInt7620 = local270;
		local33.anInt7620 = local308;
		local38.anInt7620 = local320;
		for (local597 = 0; local597 < this.anInt7157; local597++) {
			this.aShortArray95[local597] = (short) local8.method6004();
			if (local80) {
				this.aByteArray79[local597] = local13.method6011();
			}
			if (local132 == 255) {
				this.aByteArray76[local597] = local18.method6011();
			}
			if (local136 == 1) {
				this.aByteArray80[local597] = local23.method6011();
			}
			if (local140 == 1) {
				this.anIntArray507[local597] = local28.method6053();
			}
			if (local144 == 1) {
				this.aShortArray90[local597] = (short) (local33.method6004() - 1);
			}
			if (this.aByteArray78 != null) {
				if (this.aShortArray90[local597] == -1) {
					this.aByteArray78[local597] = -1;
				} else {
					this.aByteArray78[local597] = (byte) (local38.method6053() - 1);
				}
			}
		}
		local8.anInt7620 = local302;
		this.anInt7158 = -1;
		local13.anInt7620 = local251;
		@Pc(827) short local827 = 0;
		@Pc(829) short local829 = 0;
		@Pc(831) short local831 = 0;
		@Pc(833) short local833 = 0;
		@Pc(842) int local842;
		for (@Pc(835) int local835 = 0; local835 < this.anInt7157; local835++) {
			local842 = local13.method6053();
			if (local842 == 1) {
				local827 = (short) (local8.method6038() + local833);
				local829 = (short) (local827 + local8.method6038());
				local831 = (short) (local829 + local8.method6038());
				this.aShortArray91[local835] = local827;
				local833 = local831;
				this.aShortArray97[local835] = local829;
				this.aShortArray98[local835] = local831;
				if (this.anInt7158 < local827) {
					this.anInt7158 = local827;
				}
				if (this.anInt7158 < local829) {
					this.anInt7158 = local829;
				}
				if (local831 > this.anInt7158) {
					this.anInt7158 = local831;
				}
			}
			if (local842 == 2) {
				local829 = local831;
				local831 = (short) (local8.method6038() + local833);
				this.aShortArray91[local835] = local827;
				local833 = local831;
				this.aShortArray97[local835] = local829;
				this.aShortArray98[local835] = local831;
				if (local831 > this.anInt7158) {
					this.anInt7158 = local831;
				}
			}
			if (local842 == 3) {
				local827 = local831;
				local831 = (short) (local833 + local8.method6038());
				this.aShortArray91[local835] = local827;
				local833 = local831;
				this.aShortArray97[local835] = local829;
				this.aShortArray98[local835] = local831;
				if (this.anInt7158 < local831) {
					this.anInt7158 = local831;
				}
			}
			if (local842 == 4) {
				@Pc(1001) short local1001 = local827;
				local827 = local829;
				local829 = local1001;
				local831 = (short) (local833 + local8.method6038());
				local833 = local831;
				this.aShortArray91[local835] = local827;
				this.aShortArray97[local835] = local1001;
				this.aShortArray98[local835] = local831;
				if (this.anInt7158 < local831) {
					this.anInt7158 = local831;
				}
			}
		}
		this.anInt7158++;
		local8.anInt7620 = local353;
		local13.anInt7620 = local361;
		local18.anInt7620 = local377;
		local23.anInt7620 = local385;
		local28.anInt7620 = local391;
		local33.anInt7620 = local397;
		@Pc(1079) int local1079;
		for (local842 = 0; local842 < this.anInt7164; local842++) {
			local1079 = this.aByteArray82[local842] & 0xFF;
			if (local1079 == 0) {
				this.aShortArray92[local842] = (short) local8.method6004();
				this.aShortArray89[local842] = (short) local8.method6004();
				this.aShortArray96[local842] = (short) local8.method6004();
			}
			if (local1079 == 1) {
				this.aShortArray92[local842] = (short) local13.method6004();
				this.aShortArray89[local842] = (short) local13.method6004();
				this.aShortArray96[local842] = (short) local13.method6004();
				this.anIntArray505[local842] = local18.method6004();
				if (this.anInt7154 < 14) {
					this.anIntArray502[local842] = local18.method6004();
				} else {
					this.anIntArray502[local842] = local18.method6020();
				}
				this.anIntArray503[local842] = local18.method6004();
				this.aByteArray81[local842] = local23.method6011();
				this.aByteArray77[local842] = local28.method6011();
				this.anIntArray504[local842] = local33.method6011();
			}
			if (local1079 == 2) {
				this.aShortArray92[local842] = (short) local13.method6004();
				this.aShortArray89[local842] = (short) local13.method6004();
				this.aShortArray96[local842] = (short) local13.method6004();
				this.anIntArray505[local842] = local18.method6004();
				if (this.anInt7154 >= 14) {
					this.anIntArray502[local842] = local18.method6020();
				} else {
					this.anIntArray502[local842] = local18.method6004();
				}
				this.anIntArray503[local842] = local18.method6004();
				this.aByteArray81[local842] = local23.method6011();
				this.aByteArray77[local842] = local28.method6011();
				this.anIntArray504[local842] = local33.method6011();
				this.anIntArray506[local842] = local33.method6011();
				this.anIntArray509[local842] = local33.method6011();
			}
			if (local1079 == 3) {
				this.aShortArray92[local842] = (short) local13.method6004();
				this.aShortArray89[local842] = (short) local13.method6004();
				this.aShortArray96[local842] = (short) local13.method6004();
				this.anIntArray505[local842] = local18.method6004();
				if (this.anInt7154 >= 14) {
					this.anIntArray502[local842] = local18.method6020();
				} else {
					this.anIntArray502[local842] = local18.method6004();
				}
				this.anIntArray503[local842] = local18.method6004();
				this.aByteArray81[local842] = local23.method6011();
				this.aByteArray77[local842] = local28.method6011();
				this.anIntArray504[local842] = local33.method6011();
			}
		}
		local8.anInt7620 = local190;
		@Pc(1406) int local1406;
		@Pc(1411) int local1411;
		@Pc(1415) int local1415;
		@Pc(1473) int local1473;
		if (local89) {
			local1079 = local8.method6053();
			if (local1079 > 0) {
				this.aClass209Array3 = new Class209[local1079];
				for (local1406 = 0; local1406 < local1079; local1406++) {
					local1411 = local8.method6004();
					local1415 = local8.method6004();
					@Pc(1421) byte local1421;
					if (local132 == 255) {
						local1421 = this.aByteArray76[local1415];
					} else {
						local1421 = (byte) local132;
					}
					this.aClass209Array3[local1406] = new Class209(local1411, this.aShortArray91[local1415], this.aShortArray97[local1415], this.aShortArray98[local1415], local1421);
				}
			}
			local1406 = local8.method6053();
			if (local1406 > 0) {
				this.aClass178Array3 = new Class178[local1406];
				for (local1411 = 0; local1411 < local1406; local1411++) {
					local1415 = local8.method6004();
					local1473 = local8.method6004();
					this.aClass178Array3[local1411] = new Class178(local1415, local1473);
				}
			}
		}
		if (!local98) {
			return;
		}
		local1079 = local8.method6053();
		if (local1079 <= 0) {
			return;
		}
		this.aClass266Array1 = new Class266[local1079];
		for (local1406 = 0; local1406 < local1079; local1406++) {
			local1411 = local8.method6004();
			local1415 = local8.method6004();
			local1473 = local8.method6053();
			@Pc(1528) byte local1528 = local8.method6011();
			this.aClass266Array1[local1406] = new Class266(local1411, local1415, local1473, local1528);
		}
		return;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z[B)V")
	private void method5559(@OriginalArg(1) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(18) Class3_Sub2 local18 = new Class3_Sub2(arg0);
		@Pc(23) Class3_Sub2 local23 = new Class3_Sub2(arg0);
		@Pc(28) Class3_Sub2 local28 = new Class3_Sub2(arg0);
		@Pc(33) Class3_Sub2 local33 = new Class3_Sub2(arg0);
		@Pc(38) Class3_Sub2 local38 = new Class3_Sub2(arg0);
		local18.anInt7620 = arg0.length - 18;
		this.anInt7167 = local18.method6004();
		this.anInt7157 = local18.method6004();
		this.anInt7164 = local18.method6053();
		@Pc(63) int local63 = local18.method6053();
		@Pc(67) int local67 = local18.method6053();
		@Pc(71) int local71 = local18.method6053();
		@Pc(75) int local75 = local18.method6053();
		@Pc(79) int local79 = local18.method6053();
		@Pc(83) int local83 = local18.method6004();
		@Pc(87) int local87 = local18.method6004();
		@Pc(91) int local91 = local18.method6004();
		@Pc(95) int local95 = local18.method6004();
		@Pc(104) int local104 = this.anInt7167;
		@Pc(106) int local106 = local104;
		local104 += this.anInt7157;
		@Pc(113) int local113 = local104;
		if (local67 == 255) {
			local104 += this.anInt7157;
		}
		@Pc(125) int local125 = local104;
		if (local75 == 1) {
			local104 += this.anInt7157;
		}
		@Pc(137) int local137 = local104;
		if (local63 == 1) {
			local104 += this.anInt7157;
		}
		@Pc(147) int local147 = local104;
		if (local79 == 1) {
			local104 += this.anInt7167;
		}
		@Pc(159) int local159 = local104;
		if (local71 == 1) {
			local104 += this.anInt7157;
		}
		@Pc(171) int local171 = local104;
		local104 += local95;
		@Pc(177) int local177 = local104;
		local104 += this.anInt7157 * 2;
		@Pc(186) int local186 = local104;
		local104 += this.anInt7164 * 6;
		@Pc(195) int local195 = local104;
		local104 += local83;
		@Pc(201) int local201 = local104;
		local104 += local87;
		if (local67 == 255) {
			this.aByteArray76 = new byte[this.anInt7157];
		} else {
			this.aByte104 = (byte) local67;
		}
		if (local75 == 1) {
			this.anIntArray507 = new int[this.anInt7157];
		}
		this.aShortArray91 = new short[this.anInt7157];
		this.anIntArray500 = new int[this.anInt7167];
		this.aShortArray95 = new short[this.anInt7157];
		this.aShortArray98 = new short[this.anInt7157];
		this.anIntArray501 = new int[this.anInt7167];
		if (this.anInt7164 > 0) {
			this.aShortArray96 = new short[this.anInt7164];
			this.aShortArray89 = new short[this.anInt7164];
			this.aByteArray82 = new byte[this.anInt7164];
			this.aShortArray92 = new short[this.anInt7164];
		}
		this.aShortArray97 = new short[this.anInt7157];
		if (local71 == 1) {
			this.aByteArray80 = new byte[this.anInt7157];
		}
		this.anIntArray510 = new int[this.anInt7167];
		if (local79 == 1) {
			this.anIntArray508 = new int[this.anInt7167];
		}
		local18.anInt7620 = 0;
		if (local63 == 1) {
			this.aByteArray78 = new byte[this.anInt7157];
			this.aShortArray90 = new short[this.anInt7157];
			this.aByteArray79 = new byte[this.anInt7157];
		}
		local23.anInt7620 = local195;
		local28.anInt7620 = local201;
		local33.anInt7620 = local104;
		local38.anInt7620 = local147;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(353) int local353 = 0;
		@Pc(360) int local360;
		@Pc(362) int local362;
		for (@Pc(355) int local355 = 0; local355 < this.anInt7167; local355++) {
			local360 = local18.method6053();
			local362 = 0;
			if ((local360 & 0x1) != 0) {
				local362 = local23.method6038();
			}
			@Pc(376) int local376 = 0;
			if ((local360 & 0x2) != 0) {
				local376 = local28.method6038();
			}
			@Pc(389) int local389 = 0;
			if ((local360 & 0x4) != 0) {
				local389 = local33.method6038();
			}
			this.anIntArray510[local355] = local349 + local362;
			this.anIntArray501[local355] = local351 + local376;
			this.anIntArray500[local355] = local353 + local389;
			local349 = this.anIntArray510[local355];
			local351 = this.anIntArray501[local355];
			local353 = this.anIntArray500[local355];
			if (local79 == 1) {
				this.anIntArray508[local355] = local38.method6053();
			}
		}
		local18.anInt7620 = local177;
		local23.anInt7620 = local137;
		local28.anInt7620 = local113;
		local33.anInt7620 = local159;
		local38.anInt7620 = local125;
		for (local360 = 0; local360 < this.anInt7157; local360++) {
			this.aShortArray95[local360] = (short) local18.method6004();
			if (local63 == 1) {
				local362 = local23.method6053();
				if ((local362 & 0x1) == 1) {
					this.aByteArray79[local360] = 1;
					local5 = true;
				} else {
					this.aByteArray79[local360] = 0;
				}
				if ((local362 & 0x2) == 2) {
					this.aByteArray78[local360] = (byte) (local362 >> 2);
					this.aShortArray90[local360] = this.aShortArray95[local360];
					this.aShortArray95[local360] = 127;
					if (this.aShortArray90[local360] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray78[local360] = -1;
					this.aShortArray90[local360] = -1;
				}
			}
			if (local67 == 255) {
				this.aByteArray76[local360] = local28.method6011();
			}
			if (local71 == 1) {
				this.aByteArray80[local360] = local33.method6011();
			}
			if (local75 == 1) {
				this.anIntArray507[local360] = local38.method6053();
			}
		}
		this.anInt7158 = -1;
		local18.anInt7620 = local171;
		local23.anInt7620 = local106;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(618) int local618;
		for (@Pc(613) int local613 = 0; local613 < this.anInt7157; local613++) {
			local618 = local23.method6053();
			if (local618 == 1) {
				local605 = (short) (local611 + local18.method6038());
				local607 = (short) (local18.method6038() + local605);
				local609 = (short) (local607 + local18.method6038());
				local611 = local609;
				this.aShortArray91[local613] = local605;
				this.aShortArray97[local613] = local607;
				this.aShortArray98[local613] = local609;
				if (local605 > this.anInt7158) {
					this.anInt7158 = local605;
				}
				if (local607 > this.anInt7158) {
					this.anInt7158 = local607;
				}
				if (local609 > this.anInt7158) {
					this.anInt7158 = local609;
				}
			}
			if (local618 == 2) {
				local607 = local609;
				local609 = (short) (local18.method6038() + local611);
				local611 = local609;
				this.aShortArray91[local613] = local605;
				this.aShortArray97[local613] = local607;
				this.aShortArray98[local613] = local609;
				if (this.anInt7158 < local609) {
					this.anInt7158 = local609;
				}
			}
			if (local618 == 3) {
				local605 = local609;
				local609 = (short) (local611 + local18.method6038());
				local611 = local609;
				this.aShortArray91[local613] = local605;
				this.aShortArray97[local613] = local607;
				this.aShortArray98[local613] = local609;
				if (this.anInt7158 < local609) {
					this.anInt7158 = local609;
				}
			}
			if (local618 == 4) {
				@Pc(773) short local773 = local605;
				local605 = local607;
				local609 = (short) (local18.method6038() + local611);
				local607 = local773;
				this.aShortArray91[local613] = local605;
				local611 = local609;
				this.aShortArray97[local613] = local773;
				this.aShortArray98[local613] = local609;
				if (local609 > this.anInt7158) {
					this.anInt7158 = local609;
				}
			}
		}
		this.anInt7158++;
		local18.anInt7620 = local186;
		for (local618 = 0; local618 < this.anInt7164; local618++) {
			this.aByteArray82[local618] = 0;
			this.aShortArray92[local618] = (short) local18.method6004();
			this.aShortArray89[local618] = (short) local18.method6004();
			this.aShortArray96[local618] = (short) local18.method6004();
		}
		if (this.aByteArray78 != null) {
			@Pc(876) boolean local876 = false;
			for (@Pc(878) int local878 = 0; local878 < this.anInt7157; local878++) {
				@Pc(886) int local886 = this.aByteArray78[local878] & 0xFF;
				if (local886 != 255) {
					if (this.aShortArray91[local878] == (this.aShortArray92[local886] & 0xFFFF) && (this.aShortArray89[local886] & 0xFFFF) == this.aShortArray97[local878] && (this.aShortArray96[local886] & 0xFFFF) == this.aShortArray98[local878]) {
						this.aByteArray78[local878] = -1;
					} else {
						local876 = true;
					}
				}
			}
			if (!local876) {
				this.aByteArray78 = null;
			}
		}
		if (!local5) {
			this.aByteArray79 = null;
		}
		if (!local7) {
			this.aShortArray90 = null;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(SIBLclient!uu;)I")
	private int method5560(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class242 arg2) {
		@Pc(8) int local8 = arg2.anIntArray510[arg1];
		@Pc(13) int local13 = arg2.anIntArray501[arg1];
		@Pc(18) int local18 = arg2.anIntArray500[arg1];
		for (@Pc(20) int local20 = 0; local20 < this.anInt7167; local20++) {
			if (this.anIntArray510[local20] == local8 && local13 == this.anIntArray501[local20] && this.anIntArray500[local20] == local18) {
				this.aShortArray94[local20] |= arg0;
				return local20;
			}
		}
		this.anIntArray510[this.anInt7167] = local8;
		this.anIntArray501[this.anInt7167] = local13;
		this.anIntArray500[this.anInt7167] = local18;
		this.aShortArray94[this.anInt7167] = arg0;
		this.anIntArray508[this.anInt7167] = arg2.anIntArray508 == null ? -1 : arg2.anIntArray508[arg1];
		return this.anInt7167++;
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)[[I")
	public int[][] method5562() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt7157; local12++) {
			@Pc(19) int local19 = this.anIntArray507[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(33) int local33 = local8[local19]++;
			}
		}
		@Pc(46) int[][] local46 = new int[local10 + 1][];
		for (@Pc(48) int local48 = 0; local48 <= local10; local48++) {
			local46[local48] = new int[local8[local48]];
			local8[local48] = 0;
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt7157; local67++) {
			@Pc(74) int local74 = this.anIntArray507[local67];
			if (local74 >= 0) {
				local46[local74][local8[local74]++] = local67;
			}
		}
		return local46;
	}
}
