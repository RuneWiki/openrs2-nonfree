import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class29 {

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "[Lclient!kv;")
	public Class169[] aClass169Array1;

	@OriginalMember(owner = "client!bt", name = "x", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!bt", name = "y", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!bt", name = "z", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!bt", name = "A", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!bt", name = "C", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!bt", name = "D", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!bt", name = "E", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!bt", name = "K", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!bt", name = "M", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!bt", name = "N", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!bt", name = "P", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!bt", name = "R", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!bt", name = "S", descriptor = "[Lclient!hn;")
	public Class120[] aClass120Array1;

	@OriginalMember(owner = "client!bt", name = "T", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!bt", name = "V", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!bt", name = "X", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!bt", name = "Y", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!bt", name = "ab", descriptor = "[Lclient!mm;")
	public Class192[] aClass192Array1;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
	public int anInt849 = 12;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
	public int anInt850 = 0;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "B")
	public byte aByte18 = 0;

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
	public int anInt856 = 0;

	@OriginalMember(owner = "client!bt", name = "bb", descriptor = "I")
	public int anInt866 = 0;

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
	public int anInt861 = 0;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V")
	public Class29(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method859(arg0);
		} else {
			this.method866(arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(III)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 0) {
			this.aShortArray29 = new short[arg2];
			this.anIntArray74 = new int[arg2];
			this.anIntArray69 = new int[arg2];
			this.aByteArray29 = new byte[arg2];
			this.aByteArray27 = new byte[arg2];
			this.anIntArray73 = new int[arg2];
			this.aShortArray32 = new short[arg2];
			this.anIntArray70 = new int[arg2];
			this.aShortArray34 = new short[arg2];
			this.anIntArray64 = new int[arg2];
			this.aByteArray26 = new byte[arg2];
			this.anIntArray67 = new int[arg2];
		}
		this.aShortArray27 = new short[arg1];
		this.anIntArray66 = new int[arg1];
		this.anIntArray72 = new int[arg0];
		this.aByteArray31 = new byte[arg1];
		this.anIntArray71 = new int[arg0];
		this.anIntArray68 = new int[arg0];
		this.aShortArray35 = new short[arg1];
		this.aShortArray28 = new short[arg1];
		this.anIntArray65 = new int[arg0];
		this.aByteArray25 = new byte[arg1];
		this.aByteArray28 = new byte[arg1];
		this.aShortArray33 = new short[arg1];
		this.aByteArray30 = new byte[arg1];
		this.aShortArray30 = new short[arg1];
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([Lclient!bt;I)V")
	public Class29(@OriginalArg(0) Class29[] arg0, @OriginalArg(1) int arg1) {
		this.anInt866 = 0;
		this.anInt856 = 0;
		this.anInt850 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte18 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class29 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt856 += local59.anInt856;
				this.anInt866 += local59.anInt866;
				this.anInt850 += local59.anInt850;
				local38 |= local59.aByteArray25 != null;
				if (local59.aClass120Array1 != null) {
					local36 += local59.aClass120Array1.length;
				}
				if (local59.aClass192Array1 != null) {
					local32 += local59.aClass192Array1.length;
				}
				if (local59.aClass169Array1 != null) {
					local34 += local59.aClass169Array1.length;
				}
				local51 |= local59.anIntArray66 != null;
				local46 |= local59.aShortArray35 != null;
				local42 |= local59.aByteArray30 != null;
				if (local59.aByteArray31 == null) {
					if (this.aByte18 == -1) {
						this.aByte18 = local59.aByte18;
					}
					if (this.aByte18 != local59.aByte18) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray28 != null;
			}
		}
		if (local44) {
			this.aByteArray28 = new byte[this.anInt856];
		}
		this.anIntArray68 = new int[this.anInt866];
		this.aShortArray27 = new short[this.anInt856];
		this.anIntArray71 = new int[this.anInt866];
		this.aShortArray31 = new short[this.anInt856];
		this.aShortArray28 = new short[this.anInt856];
		if (local40) {
			this.aByteArray31 = new byte[this.anInt856];
		}
		this.anIntArray65 = new int[this.anInt866];
		if (local51) {
			this.anIntArray66 = new int[this.anInt856];
		}
		if (local34 > 0) {
			this.aClass169Array1 = new Class169[local34];
		}
		if (local36 > 0) {
			this.aClass120Array1 = new Class120[local36];
		}
		if (local46) {
			this.aShortArray35 = new short[this.anInt856];
		}
		this.aShortArray26 = new short[this.anInt866];
		this.anIntArray72 = new int[this.anInt866];
		if (local38) {
			this.aByteArray25 = new byte[this.anInt856];
		}
		this.aShortArray30 = new short[this.anInt856];
		this.aShortArray33 = new short[this.anInt856];
		if (local32 > 0) {
			this.aClass192Array1 = new Class192[local32];
		}
		if (local42) {
			this.aByteArray30 = new byte[this.anInt856];
		}
		if (this.anInt850 > 0) {
			this.aShortArray32 = new short[this.anInt850];
			this.anIntArray70 = new int[this.anInt850];
			this.anIntArray73 = new int[this.anInt850];
			this.aShortArray29 = new short[this.anInt850];
			this.aByteArray27 = new byte[this.anInt850];
			this.anIntArray69 = new int[this.anInt850];
			this.anIntArray67 = new int[this.anInt850];
			this.anIntArray74 = new int[this.anInt850];
			this.aShortArray34 = new short[this.anInt850];
			this.anIntArray64 = new int[this.anInt850];
			this.aByteArray26 = new byte[this.anInt850];
			this.aByteArray29 = new byte[this.anInt850];
		}
		this.anInt850 = 0;
		local36 = 0;
		this.anInt856 = 0;
		local34 = 0;
		this.anInt866 = 0;
		local32 = 0;
		@Pc(619) int local619;
		@Pc(630) int local630;
		for (@Pc(387) int local387 = 0; local387 < arg1; local387++) {
			@Pc(394) short local394 = (short) (0x1 << local387);
			@Pc(398) Class29 local398 = arg0[local387];
			if (local398 != null) {
				@Pc(405) int local405;
				if (local398.aClass120Array1 != null) {
					for (local405 = 0; local405 < local398.aClass120Array1.length; local405++) {
						@Pc(412) Class120 local412 = local398.aClass120Array1[local405];
						this.aClass120Array1[local36++] = local412.method3045(this.anInt856 + local412.anInt3402);
					}
				}
				for (local405 = 0; local405 < local398.anInt856; local405++) {
					if (local38 && local398.aByteArray25 != null) {
						this.aByteArray25[this.anInt856] = local398.aByteArray25[local405];
					}
					if (local40) {
						if (local398.aByteArray31 == null) {
							this.aByteArray31[this.anInt856] = local398.aByte18;
						} else {
							this.aByteArray31[this.anInt856] = local398.aByteArray31[local405];
						}
					}
					if (local42 && local398.aByteArray30 != null) {
						this.aByteArray30[this.anInt856] = local398.aByteArray30[local405];
					}
					if (local46) {
						if (local398.aShortArray35 == null) {
							this.aShortArray35[this.anInt856] = -1;
						} else {
							this.aShortArray35[this.anInt856] = local398.aShortArray35[local405];
						}
					}
					if (local51) {
						if (local398.anIntArray66 == null) {
							this.anIntArray66[this.anInt856] = -1;
						} else {
							this.anIntArray66[this.anInt856] = local398.anIntArray66[local405];
						}
					}
					this.aShortArray33[this.anInt856] = (short) this.method864(local394, local398, local398.aShortArray33[local405]);
					this.aShortArray27[this.anInt856] = (short) this.method864(local394, local398, local398.aShortArray27[local405]);
					this.aShortArray28[this.anInt856] = (short) this.method864(local394, local398, local398.aShortArray28[local405]);
					this.aShortArray31[this.anInt856] = local394;
					this.aShortArray30[this.anInt856] = local398.aShortArray30[local405];
					this.anInt856++;
				}
				@Pc(606) int local606;
				if (local398.aClass192Array1 != null) {
					for (local606 = 0; local606 < local398.aClass192Array1.length; local606++) {
						local619 = this.method864(local394, local398, local398.aClass192Array1[local606].anInt5532);
						local630 = this.method864(local394, local398, local398.aClass192Array1[local606].anInt5539);
						@Pc(641) int local641 = this.method864(local394, local398, local398.aClass192Array1[local606].anInt5543);
						this.aClass192Array1[local32] = local398.aClass192Array1[local606].method4748(local630, local619, local641);
						local32++;
					}
				}
				if (local398.aClass169Array1 != null) {
					for (local606 = 0; local606 < local398.aClass169Array1.length; local606++) {
						local619 = this.method864(local394, local398, local398.aClass169Array1[local606].anInt4667);
						this.aClass169Array1[local34] = local398.aClass169Array1[local606].method4059(local619);
						local34++;
					}
				}
			}
		}
		@Pc(703) int local703 = 0;
		this.anInt861 = this.anInt866;
		for (@Pc(709) int local709 = 0; local709 < arg1; local709++) {
			@Pc(716) short local716 = (short) (0x1 << local709);
			@Pc(720) Class29 local720 = arg0[local709];
			if (local720 != null) {
				for (local619 = 0; local619 < local720.anInt856; local619++) {
					if (local44) {
						this.aByteArray28[local703++] = (byte) (local720.aByteArray28 == null || local720.aByteArray28[local619] == -1 ? -1 : this.anInt850 + local720.aByteArray28[local619]);
					}
				}
				for (local630 = 0; local630 < local720.anInt850; local630++) {
					@Pc(772) byte local772 = this.aByteArray27[this.anInt850] = local720.aByteArray27[local630];
					if (local772 == 0) {
						this.aShortArray32[this.anInt850] = (short) this.method864(local716, local720, local720.aShortArray32[local630]);
						this.aShortArray29[this.anInt850] = (short) this.method864(local716, local720, local720.aShortArray29[local630]);
						this.aShortArray34[this.anInt850] = (short) this.method864(local716, local720, local720.aShortArray34[local630]);
					}
					if (local772 >= 1 && local772 <= 3) {
						this.aShortArray32[this.anInt850] = local720.aShortArray32[local630];
						this.aShortArray29[this.anInt850] = local720.aShortArray29[local630];
						this.aShortArray34[this.anInt850] = local720.aShortArray34[local630];
						this.anIntArray64[this.anInt850] = local720.anIntArray64[local630];
						this.anIntArray70[this.anInt850] = local720.anIntArray70[local630];
						this.anIntArray73[this.anInt850] = local720.anIntArray73[local630];
						this.aByteArray29[this.anInt850] = local720.aByteArray29[local630];
						this.aByteArray26[this.anInt850] = local720.aByteArray26[local630];
						this.anIntArray67[this.anInt850] = local720.anIntArray67[local630];
					}
					if (local772 == 2) {
						this.anIntArray69[this.anInt850] = local720.anIntArray69[local630];
						this.anIntArray74[this.anInt850] = local720.anIntArray74[local630];
					}
					this.anInt850++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBII)V")
	public void method858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt866; local11++) {
			this.anIntArray65[local11] += arg2;
			this.anIntArray71[local11] += arg1;
			this.anIntArray72[local11] += arg0;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BI)V")
	private void method859(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub29 local10 = new Class2_Sub29(arg0);
		@Pc(15) Class2_Sub29 local15 = new Class2_Sub29(arg0);
		@Pc(20) Class2_Sub29 local20 = new Class2_Sub29(arg0);
		@Pc(25) Class2_Sub29 local25 = new Class2_Sub29(arg0);
		@Pc(30) Class2_Sub29 local30 = new Class2_Sub29(arg0);
		@Pc(35) Class2_Sub29 local35 = new Class2_Sub29(arg0);
		@Pc(40) Class2_Sub29 local40 = new Class2_Sub29(arg0);
		local10.anInt6132 = arg0.length - 23;
		this.anInt866 = local10.method5229();
		this.anInt856 = local10.method5229();
		this.anInt850 = local10.method5170();
		@Pc(67) int local67 = local10.method5170();
		@Pc(76) boolean local76 = (local67 & 0x1) == 1;
		@Pc(85) boolean local85 = (local67 & 0x2) == 2;
		@Pc(96) boolean local96 = (local67 & 0x4) == 4;
		@Pc(107) boolean local107 = (local67 & 0x8) == 8;
		if (local107) {
			local10.anInt6132 -= 7;
			this.anInt849 = local10.method5170();
			local10.anInt6132 += 6;
		}
		@Pc(130) int local130 = local10.method5170();
		@Pc(134) int local134 = local10.method5170();
		@Pc(138) int local138 = local10.method5170();
		@Pc(142) int local142 = local10.method5170();
		@Pc(146) int local146 = local10.method5170();
		@Pc(150) int local150 = local10.method5229();
		@Pc(156) int local156 = local10.method5229();
		@Pc(160) int local160 = local10.method5229();
		@Pc(164) int local164 = local10.method5229();
		@Pc(168) int local168 = local10.method5229();
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(187) int local187;
		if (this.anInt850 > 0) {
			this.aByteArray27 = new byte[this.anInt850];
			local10.anInt6132 = 0;
			for (local187 = 0; local187 < this.anInt850; local187++) {
				@Pc(198) byte local198 = this.aByteArray27[local187] = local10.method5179();
				if (local198 >= 1 && local198 <= 3) {
					local172++;
				}
				if (local198 == 2) {
					local174++;
				}
				if (local198 == 0) {
					local170++;
				}
			}
		}
		local187 = this.anInt850;
		@Pc(231) int local231 = local187;
		local187 += this.anInt866;
		@Pc(238) int local238 = local187;
		if (local76) {
			local187 += this.anInt856;
		}
		@Pc(247) int local247 = local187;
		local187 += this.anInt856;
		@Pc(254) int local254 = local187;
		if (local130 == 255) {
			local187 += this.anInt856;
		}
		@Pc(264) int local264 = local187;
		if (local138 == 1) {
			local187 += this.anInt856;
		}
		@Pc(276) int local276 = local187;
		if (local146 == 1) {
			local187 += this.anInt866;
		}
		@Pc(288) int local288 = local187;
		if (local134 == 1) {
			local187 += this.anInt856;
		}
		@Pc(300) int local300 = local187;
		local187 += local164;
		@Pc(306) int local306 = local187;
		if (local142 == 1) {
			local187 += this.anInt856 * 2;
		}
		@Pc(320) int local320 = local187;
		local187 += local168;
		@Pc(326) int local326 = local187;
		local187 += this.anInt856 * 2;
		@Pc(335) int local335 = local187;
		local187 += local150;
		@Pc(341) int local341 = local187;
		local187 += local156;
		@Pc(347) int local347 = local187;
		local187 += local160;
		@Pc(353) int local353 = local187;
		local187 += local170 * 6;
		@Pc(361) int local361 = local187;
		local187 += local172 * 6;
		@Pc(377) int local377 = this.anInt849 < 14 ? 6 : 7;
		@Pc(379) int local379 = local187;
		local187 += local172 * local377;
		@Pc(393) int local393 = local187;
		local187 += local172;
		@Pc(399) int local399 = local187;
		local187 += local172;
		@Pc(405) int local405 = local187;
		local187 += local174 * 2 + local172;
		this.aShortArray33 = new short[this.anInt856];
		if (local76) {
			this.aByteArray25 = new byte[this.anInt856];
		}
		this.anIntArray65 = new int[this.anInt866];
		if (local142 == 1 && this.anInt850 > 0) {
			this.aByteArray28 = new byte[this.anInt856];
		}
		local10.anInt6132 = local231;
		this.aShortArray28 = new short[this.anInt856];
		this.aShortArray27 = new short[this.anInt856];
		if (this.anInt850 > 0) {
			this.aShortArray32 = new short[this.anInt850];
			if (local174 > 0) {
				this.anIntArray69 = new int[local174];
				this.anIntArray74 = new int[local174];
			}
			if (local172 > 0) {
				this.anIntArray70 = new int[local172];
				this.aByteArray29 = new byte[local172];
				this.anIntArray67 = new int[local172];
				this.aByteArray26 = new byte[local172];
				this.anIntArray73 = new int[local172];
				this.anIntArray64 = new int[local172];
			}
			this.aShortArray29 = new short[this.anInt850];
			this.aShortArray34 = new short[this.anInt850];
		}
		if (local134 == 1) {
			this.aByteArray30 = new byte[this.anInt856];
		}
		if (local130 == 255) {
			this.aByteArray31 = new byte[this.anInt856];
		} else {
			this.aByte18 = (byte) local130;
		}
		if (local146 == 1) {
			this.anIntArray68 = new int[this.anInt866];
		}
		this.anIntArray72 = new int[this.anInt866];
		this.anIntArray71 = new int[this.anInt866];
		this.aShortArray30 = new short[this.anInt856];
		if (local142 == 1) {
			this.aShortArray35 = new short[this.anInt856];
		}
		if (local138 == 1) {
			this.anIntArray66 = new int[this.anInt856];
		}
		local15.anInt6132 = local335;
		local20.anInt6132 = local341;
		local25.anInt6132 = local347;
		local30.anInt6132 = local276;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(599) int local599 = 0;
		@Pc(607) int local607;
		for (@Pc(601) int local601 = 0; local601 < this.anInt866; local601++) {
			local607 = local10.method5170();
			@Pc(609) int local609 = 0;
			if ((local607 & 0x1) != 0) {
				local609 = local15.method5203();
			}
			@Pc(622) int local622 = 0;
			if ((local607 & 0x2) != 0) {
				local622 = local20.method5203();
			}
			@Pc(632) int local632 = 0;
			if ((local607 & 0x4) != 0) {
				local632 = local25.method5203();
			}
			this.anIntArray65[local601] = local609 + local595;
			this.anIntArray71[local601] = local597 + local622;
			this.anIntArray72[local601] = local632 + local599;
			local599 = this.anIntArray72[local601];
			local597 = this.anIntArray71[local601];
			local595 = this.anIntArray65[local601];
			if (local146 == 1) {
				this.anIntArray68[local601] = local30.method5170();
			}
		}
		local10.anInt6132 = local326;
		local15.anInt6132 = local238;
		local20.anInt6132 = local254;
		local25.anInt6132 = local288;
		local30.anInt6132 = local264;
		local35.anInt6132 = local306;
		local40.anInt6132 = local320;
		for (local607 = 0; local607 < this.anInt856; local607++) {
			this.aShortArray30[local607] = (short) local10.method5229();
			if (local76) {
				this.aByteArray25[local607] = local15.method5179();
			}
			if (local130 == 255) {
				this.aByteArray31[local607] = local20.method5179();
			}
			if (local134 == 1) {
				this.aByteArray30[local607] = local25.method5179();
			}
			if (local138 == 1) {
				this.anIntArray66[local607] = local30.method5170();
			}
			if (local142 == 1) {
				this.aShortArray35[local607] = (short) (local35.method5229() - 1);
			}
			if (this.aByteArray28 != null) {
				if (this.aShortArray35[local607] == -1) {
					this.aByteArray28[local607] = -1;
				} else {
					this.aByteArray28[local607] = (byte) (local40.method5170() - 1);
				}
			}
		}
		this.anInt861 = -1;
		local10.anInt6132 = local300;
		local15.anInt6132 = local247;
		@Pc(835) short local835 = 0;
		@Pc(837) short local837 = 0;
		@Pc(839) short local839 = 0;
		@Pc(841) short local841 = 0;
		@Pc(849) int local849;
		for (@Pc(843) int local843 = 0; local843 < this.anInt856; local843++) {
			local849 = local15.method5170();
			if (local849 == 1) {
				local835 = (short) (local10.method5203() + local841);
				local837 = (short) (local835 + local10.method5203());
				local839 = (short) (local837 + local10.method5203());
				local841 = local839;
				this.aShortArray33[local843] = local835;
				this.aShortArray27[local843] = local837;
				this.aShortArray28[local843] = local839;
				if (this.anInt861 < local835) {
					this.anInt861 = local835;
				}
				if (this.anInt861 < local837) {
					this.anInt861 = local837;
				}
				if (this.anInt861 < local839) {
					this.anInt861 = local839;
				}
			}
			if (local849 == 2) {
				local837 = local839;
				local839 = (short) (local10.method5203() + local841);
				local841 = local839;
				this.aShortArray33[local843] = local835;
				this.aShortArray27[local843] = local837;
				this.aShortArray28[local843] = local839;
				if (local839 > this.anInt861) {
					this.anInt861 = local839;
				}
			}
			if (local849 == 3) {
				local835 = local839;
				local839 = (short) (local841 + local10.method5203());
				this.aShortArray33[local843] = local835;
				local841 = local839;
				this.aShortArray27[local843] = local837;
				this.aShortArray28[local843] = local839;
				if (local839 > this.anInt861) {
					this.anInt861 = local839;
				}
			}
			if (local849 == 4) {
				@Pc(1006) short local1006 = local835;
				local835 = local837;
				local839 = (short) (local841 + local10.method5203());
				local837 = local1006;
				local841 = local839;
				this.aShortArray33[local843] = local835;
				this.aShortArray27[local843] = local1006;
				this.aShortArray28[local843] = local839;
				if (local839 > this.anInt861) {
					this.anInt861 = local839;
				}
			}
		}
		this.anInt861++;
		local10.anInt6132 = local353;
		local15.anInt6132 = local361;
		local20.anInt6132 = local379;
		local25.anInt6132 = local393;
		local30.anInt6132 = local399;
		local35.anInt6132 = local405;
		@Pc(1085) int local1085;
		for (local849 = 0; local849 < this.anInt850; local849++) {
			local1085 = this.aByteArray27[local849] & 0xFF;
			if (local1085 == 0) {
				this.aShortArray32[local849] = (short) local10.method5229();
				this.aShortArray29[local849] = (short) local10.method5229();
				this.aShortArray34[local849] = (short) local10.method5229();
			}
			if (local1085 == 1) {
				this.aShortArray32[local849] = (short) local15.method5229();
				this.aShortArray29[local849] = (short) local15.method5229();
				this.aShortArray34[local849] = (short) local15.method5229();
				this.anIntArray64[local849] = local20.method5229();
				if (this.anInt849 >= 14) {
					this.anIntArray70[local849] = local20.method5210();
				} else {
					this.anIntArray70[local849] = local20.method5229();
				}
				this.anIntArray73[local849] = local20.method5229();
				this.aByteArray29[local849] = local25.method5179();
				this.aByteArray26[local849] = local30.method5179();
				this.anIntArray67[local849] = local35.method5179();
			}
			if (local1085 == 2) {
				this.aShortArray32[local849] = (short) local15.method5229();
				this.aShortArray29[local849] = (short) local15.method5229();
				this.aShortArray34[local849] = (short) local15.method5229();
				this.anIntArray64[local849] = local20.method5229();
				if (this.anInt849 >= 14) {
					this.anIntArray70[local849] = local20.method5210();
				} else {
					this.anIntArray70[local849] = local20.method5229();
				}
				this.anIntArray73[local849] = local20.method5229();
				this.aByteArray29[local849] = local25.method5179();
				this.aByteArray26[local849] = local30.method5179();
				this.anIntArray67[local849] = local35.method5179();
				this.anIntArray69[local849] = local35.method5179();
				this.anIntArray74[local849] = local35.method5179();
			}
			if (local1085 == 3) {
				this.aShortArray32[local849] = (short) local15.method5229();
				this.aShortArray29[local849] = (short) local15.method5229();
				this.aShortArray34[local849] = (short) local15.method5229();
				this.anIntArray64[local849] = local20.method5229();
				if (this.anInt849 >= 14) {
					this.anIntArray70[local849] = local20.method5210();
				} else {
					this.anIntArray70[local849] = local20.method5229();
				}
				this.anIntArray73[local849] = local20.method5229();
				this.aByteArray29[local849] = local25.method5179();
				this.aByteArray26[local849] = local30.method5179();
				this.anIntArray67[local849] = local35.method5179();
			}
		}
		local10.anInt6132 = local187;
		@Pc(1420) int local1420;
		@Pc(1428) int local1428;
		@Pc(1434) int local1434;
		@Pc(1496) int local1496;
		if (local85) {
			local1085 = local10.method5170();
			if (local1085 > 0) {
				this.aClass192Array1 = new Class192[local1085];
				for (local1420 = 0; local1420 < local1085; local1420++) {
					local1428 = local10.method5229();
					local1434 = local10.method5229();
					@Pc(1442) byte local1442;
					if (local130 == 255) {
						local1442 = this.aByteArray31[local1434];
					} else {
						local1442 = (byte) local130;
					}
					this.aClass192Array1[local1420] = new Class192(local1428, this.aShortArray33[local1434], this.aShortArray27[local1434], this.aShortArray28[local1434], local1442);
				}
			}
			local1420 = local10.method5170();
			if (local1420 > 0) {
				this.aClass169Array1 = new Class169[local1420];
				for (local1428 = 0; local1428 < local1420; local1428++) {
					local1434 = local10.method5229();
					local1496 = local10.method5229();
					this.aClass169Array1[local1428] = new Class169(local1434, local1496);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1085 = local10.method5170();
		if (local1085 <= 0) {
			return;
		}
		this.aClass120Array1 = new Class120[local1085];
		for (local1420 = 0; local1420 < local1085; local1420++) {
			local1428 = local10.method5229();
			local1434 = local10.method5229();
			local1496 = local10.method5170();
			@Pc(1547) byte local1547 = local10.method5179();
			this.aClass120Array1[local1420] = new Class120(local1428, local1434, local1496, local1547);
		}
		return;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)[[I")
	public int[][] method861() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass120Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass120Array1[local12].anInt3400;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local20 > local10) {
					local10 = local20;
				}
			}
		}
		@Pc(45) int[][] local45 = new int[local10 + 1][];
		for (@Pc(47) int local47 = 0; local47 <= local10; local47++) {
			local45[local47] = new int[local8[local47]];
			local8[local47] = 0;
		}
		for (@Pc(66) int local66 = 0; local66 < this.aClass120Array1.length; local66++) {
			@Pc(74) int local74 = this.aClass120Array1[local66].anInt3400;
			if (local74 >= 0) {
				local45[local74][local8[local74]++] = local66;
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBZBSSBII)I")
	public int method862(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3, @OriginalArg(5) short arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray33[this.anInt856] = (short) arg7;
		this.aShortArray27[this.anInt856] = (short) arg0;
		this.aShortArray28[this.anInt856] = (short) arg6;
		this.aByteArray25[this.anInt856] = arg1;
		this.aByteArray28[this.anInt856] = arg5;
		this.aShortArray30[this.anInt856] = arg3;
		this.aByteArray30[this.anInt856] = arg2;
		this.aShortArray35[this.anInt856] = arg4;
		return this.anInt856++;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIII)V")
	public void method863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(31) int local31;
		if (arg1 != 0) {
			local7 = Class125.anIntArray381[arg1];
			local11 = Class125.anIntArray382[arg1];
			for (local13 = 0; local13 < this.anInt866; local13++) {
				local31 = local11 * this.anIntArray65[local13] + this.anIntArray71[local13] * local7 >> 15;
				this.anIntArray71[local13] = this.anIntArray71[local13] * local11 - this.anIntArray65[local13] * local7 >> 15;
				this.anIntArray65[local13] = local31;
			}
		}
		if (arg0 != 0) {
			local7 = Class125.anIntArray381[arg0];
			local11 = Class125.anIntArray382[arg0];
			for (local13 = 0; local13 < this.anInt866; local13++) {
				local31 = local11 * this.anIntArray71[local13] - this.anIntArray72[local13] * local7 >> 15;
				this.anIntArray72[local13] = local7 * this.anIntArray71[local13] + this.anIntArray72[local13] * local11 >> 15;
				this.anIntArray71[local13] = local31;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local7 = Class125.anIntArray381[arg2];
		local11 = Class125.anIntArray382[arg2];
		for (local13 = 0; local13 < this.anInt866; local13++) {
			local31 = this.anIntArray72[local13] * local7 + local11 * this.anIntArray65[local13] >> 15;
			this.anIntArray72[local13] = local11 * this.anIntArray72[local13] - this.anIntArray65[local13] * local7 >> 15;
			this.anIntArray65[local13] = local31;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(SLclient!bt;II)I")
	private int method864(@OriginalArg(0) short arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray65[arg2];
		@Pc(15) int local15 = arg1.anIntArray71[arg2];
		@Pc(20) int local20 = arg1.anIntArray72[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt866; local22++) {
			if (local10 == this.anIntArray65[local22] && local15 == this.anIntArray71[local22] && local20 == this.anIntArray72[local22]) {
				this.aShortArray26[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray65[this.anInt866] = local10;
		this.anIntArray71[this.anInt866] = local15;
		this.anIntArray72[this.anInt866] = local20;
		this.aShortArray26[this.anInt866] = arg0;
		this.anIntArray68[this.anInt866] = arg1.anIntArray68 == null ? -1 : arg1.anIntArray68[arg2];
		return this.anInt866++;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BB)V")
	private void method866(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub29 local14 = new Class2_Sub29(arg0);
		@Pc(19) Class2_Sub29 local19 = new Class2_Sub29(arg0);
		@Pc(24) Class2_Sub29 local24 = new Class2_Sub29(arg0);
		@Pc(29) Class2_Sub29 local29 = new Class2_Sub29(arg0);
		@Pc(34) Class2_Sub29 local34 = new Class2_Sub29(arg0);
		local14.anInt6132 = arg0.length - 18;
		this.anInt866 = local14.method5229();
		this.anInt856 = local14.method5229();
		this.anInt850 = local14.method5170();
		@Pc(61) int local61 = local14.method5170();
		@Pc(65) int local65 = local14.method5170();
		@Pc(69) int local69 = local14.method5170();
		@Pc(73) int local73 = local14.method5170();
		@Pc(77) int local77 = local14.method5170();
		@Pc(81) int local81 = local14.method5229();
		@Pc(85) int local85 = local14.method5229();
		@Pc(89) int local89 = local14.method5229();
		@Pc(95) int local95 = local14.method5229();
		@Pc(104) int local104 = this.anInt866;
		@Pc(106) int local106 = local104;
		local104 += this.anInt856;
		@Pc(113) int local113 = local104;
		if (local65 == 255) {
			local104 += this.anInt856;
		}
		@Pc(123) int local123 = local104;
		if (local73 == 1) {
			local104 += this.anInt856;
		}
		@Pc(135) int local135 = local104;
		if (local61 == 1) {
			local104 += this.anInt856;
		}
		@Pc(147) int local147 = local104;
		if (local77 == 1) {
			local104 += this.anInt866;
		}
		@Pc(157) int local157 = local104;
		if (local69 == 1) {
			local104 += this.anInt856;
		}
		@Pc(167) int local167 = local104;
		local104 += local95;
		@Pc(173) int local173 = local104;
		local104 += this.anInt856 * 2;
		@Pc(182) int local182 = local104;
		local104 += this.anInt850 * 6;
		@Pc(191) int local191 = local104;
		local104 += local81;
		@Pc(197) int local197 = local104;
		local104 += local85;
		this.aShortArray28 = new short[this.anInt856];
		this.anIntArray72 = new int[this.anInt866];
		this.anIntArray71 = new int[this.anInt866];
		if (local73 == 1) {
			this.anIntArray66 = new int[this.anInt856];
		}
		this.aShortArray33 = new short[this.anInt856];
		this.aShortArray27 = new short[this.anInt856];
		if (local69 == 1) {
			this.aByteArray30 = new byte[this.anInt856];
		}
		local14.anInt6132 = 0;
		if (local77 == 1) {
			this.anIntArray68 = new int[this.anInt866];
		}
		if (local65 == 255) {
			this.aByteArray31 = new byte[this.anInt856];
		} else {
			this.aByte18 = (byte) local65;
		}
		if (local61 == 1) {
			this.aByteArray28 = new byte[this.anInt856];
			this.aByteArray25 = new byte[this.anInt856];
			this.aShortArray35 = new short[this.anInt856];
		}
		this.aShortArray30 = new short[this.anInt856];
		this.anIntArray65 = new int[this.anInt866];
		if (this.anInt850 > 0) {
			this.aShortArray34 = new short[this.anInt850];
			this.aShortArray29 = new short[this.anInt850];
			this.aShortArray32 = new short[this.anInt850];
			this.aByteArray27 = new byte[this.anInt850];
		}
		local19.anInt6132 = local191;
		local24.anInt6132 = local197;
		local29.anInt6132 = local104;
		local34.anInt6132 = local147;
		@Pc(347) int local347 = 0;
		@Pc(355) int local355 = 0;
		@Pc(357) int local357 = 0;
		@Pc(365) int local365;
		@Pc(367) int local367;
		for (@Pc(359) int local359 = 0; local359 < this.anInt866; local359++) {
			local365 = local14.method5170();
			local367 = 0;
			if ((local365 & 0x1) != 0) {
				local367 = local19.method5203();
			}
			@Pc(380) int local380 = 0;
			if ((local365 & 0x2) != 0) {
				local380 = local24.method5203();
			}
			@Pc(393) int local393 = 0;
			if ((local365 & 0x4) != 0) {
				local393 = local29.method5203();
			}
			this.anIntArray65[local359] = local347 + local367;
			this.anIntArray71[local359] = local355 + local380;
			this.anIntArray72[local359] = local357 + local393;
			local355 = this.anIntArray71[local359];
			local347 = this.anIntArray65[local359];
			local357 = this.anIntArray72[local359];
			if (local77 == 1) {
				this.anIntArray68[local359] = local34.method5170();
			}
		}
		local14.anInt6132 = local173;
		local19.anInt6132 = local135;
		local24.anInt6132 = local113;
		local29.anInt6132 = local157;
		local34.anInt6132 = local123;
		for (local365 = 0; local365 < this.anInt856; local365++) {
			this.aShortArray30[local365] = (short) local14.method5229();
			if (local61 == 1) {
				local367 = local19.method5170();
				if ((local367 & 0x1) == 1) {
					this.aByteArray25[local365] = 1;
					local7 = true;
				} else {
					this.aByteArray25[local365] = 0;
				}
				if ((local367 & 0x2) == 2) {
					this.aByteArray28[local365] = (byte) (local367 >> 2);
					this.aShortArray35[local365] = this.aShortArray30[local365];
					this.aShortArray30[local365] = 127;
					if (this.aShortArray35[local365] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray28[local365] = -1;
					this.aShortArray35[local365] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray31[local365] = local24.method5179();
			}
			if (local69 == 1) {
				this.aByteArray30[local365] = local29.method5179();
			}
			if (local73 == 1) {
				this.anIntArray66[local365] = local34.method5170();
			}
		}
		this.anInt861 = -1;
		local14.anInt6132 = local167;
		local19.anInt6132 = local106;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(622) int local622;
		for (@Pc(616) int local616 = 0; local616 < this.anInt856; local616++) {
			local622 = local19.method5170();
			if (local622 == 1) {
				local608 = (short) (local614 + local14.method5203());
				local610 = (short) (local608 + local14.method5203());
				local612 = (short) (local610 + local14.method5203());
				this.aShortArray33[local616] = local608;
				local614 = local612;
				this.aShortArray27[local616] = local610;
				this.aShortArray28[local616] = local612;
				if (this.anInt861 < local608) {
					this.anInt861 = local608;
				}
				if (this.anInt861 < local610) {
					this.anInt861 = local610;
				}
				if (this.anInt861 < local612) {
					this.anInt861 = local612;
				}
			}
			if (local622 == 2) {
				local610 = local612;
				local612 = (short) (local614 + local14.method5203());
				local614 = local612;
				this.aShortArray33[local616] = local608;
				this.aShortArray27[local616] = local610;
				this.aShortArray28[local616] = local612;
				if (this.anInt861 < local612) {
					this.anInt861 = local612;
				}
			}
			if (local622 == 3) {
				local608 = local612;
				local612 = (short) (local614 + local14.method5203());
				local614 = local612;
				this.aShortArray33[local616] = local608;
				this.aShortArray27[local616] = local610;
				this.aShortArray28[local616] = local612;
				if (this.anInt861 < local612) {
					this.anInt861 = local612;
				}
			}
			if (local622 == 4) {
				@Pc(783) short local783 = local608;
				local608 = local610;
				local610 = local783;
				local612 = (short) (local14.method5203() + local614);
				local614 = local612;
				this.aShortArray33[local616] = local608;
				this.aShortArray27[local616] = local783;
				this.aShortArray28[local616] = local612;
				if (local612 > this.anInt861) {
					this.anInt861 = local612;
				}
			}
		}
		this.anInt861++;
		local14.anInt6132 = local182;
		for (local622 = 0; local622 < this.anInt850; local622++) {
			this.aByteArray27[local622] = 0;
			this.aShortArray32[local622] = (short) local14.method5229();
			this.aShortArray29[local622] = (short) local14.method5229();
			this.aShortArray34[local622] = (short) local14.method5229();
		}
		if (this.aByteArray28 != null) {
			@Pc(883) boolean local883 = false;
			for (@Pc(885) int local885 = 0; local885 < this.anInt856; local885++) {
				@Pc(894) int local894 = this.aByteArray28[local885] & 0xFF;
				if (local894 != 255) {
					if ((this.aShortArray32[local894] & 0xFFFF) == this.aShortArray33[local885] && (this.aShortArray29[local894] & 0xFFFF) == this.aShortArray27[local885] && this.aShortArray28[local885] == (this.aShortArray34[local894] & 0xFFFF)) {
						this.aByteArray28[local885] = -1;
					} else {
						local883 = true;
					}
				}
			}
			if (!local883) {
				this.aByteArray28 = null;
			}
		}
		if (!local9) {
			this.aShortArray35 = null;
		}
		if (!local7) {
			this.aByteArray25 = null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(SSZ)V")
	public void method867(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt856; local3++) {
			if (this.aShortArray30[local3] == arg1) {
				this.aShortArray30[local3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI)V")
	public void method868() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt866; local3++) {
			this.anIntArray65[local3] <<= 0x0;
			this.anIntArray71[local3] <<= 0x0;
			this.anIntArray72[local3] <<= 0x0;
		}
		if (this.anInt850 <= 0 || this.anIntArray64 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray64.length; local56++) {
			this.anIntArray64[local56] <<= 0x0;
			this.anIntArray70[local56] <<= 0x0;
			if (this.aByteArray27[local56] != 1) {
				this.anIntArray73[local56] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BIII)I")
	public int method869(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt866; local12++) {
			if (arg2 == this.anIntArray65[local12] && this.anIntArray71[local12] == arg0 && this.anIntArray72[local12] == arg1) {
				return local12;
			}
		}
		this.anIntArray65[this.anInt866] = arg2;
		this.anIntArray71[this.anInt866] = arg0;
		this.anIntArray72[this.anInt866] = arg1;
		this.anInt861 = this.anInt866 + 1;
		return this.anInt866++;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)[[I")
	public int[][] method870() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt856; local12++) {
			@Pc(22) int local22 = this.anIntArray66[local12];
			if (local22 >= 0) {
				@Pc(28) int local28 = local8[local22]++;
				if (local22 > local10) {
					local10 = local22;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt856; local79++) {
			@Pc(86) int local86 = this.anIntArray66[local79];
			if (local86 >= 0) {
				local54[local86][local8[local86]++] = local79;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(SSSBISSBSB)B")
	public byte method871() {
		if (this.anInt850 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray27[this.anInt850] = 3;
		this.aShortArray32[this.anInt850] = 0;
		this.aShortArray29[this.anInt850] = 32767;
		this.aShortArray34[this.anInt850] = 0;
		this.anIntArray64[this.anInt850] = 1024;
		this.anIntArray70[this.anInt850] = 1024;
		this.anIntArray73[this.anInt850] = 1024;
		this.aByteArray29[this.anInt850] = 0;
		this.aByteArray26[this.anInt850] = 0;
		this.anIntArray67[this.anInt850] = 0;
		return (byte) this.anInt850++;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ISS)V")
	public void method872(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray35 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt856; local11++) {
			if (this.aShortArray35[local11] == arg1) {
				this.aShortArray35[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZ)[[I")
	public int[][] method873(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt866 : this.anInt861;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray68[local20];
			if (local27 >= 0) {
				if (local27 > local10) {
					local10 = local27;
				}
				@Pc(45) int local45 = local8[local27]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < local18; local82++) {
			@Pc(89) int local89 = this.anIntArray68[local82];
			if (local89 >= 0) {
				local57[local89][local8[local89]++] = local82;
			}
		}
		return local57;
	}
}
