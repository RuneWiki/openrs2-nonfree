import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class64 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "[Lclient!wr;")
	public Class382[] aClass382Array2;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "[I")
	public int[] anIntArray134;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!dh", name = "C", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!dh", name = "D", descriptor = "[Lclient!ac;")
	public Class5[] aClass5Array1;

	@OriginalMember(owner = "client!dh", name = "F", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!dh", name = "H", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "[Lclient!ol;")
	public Class243[] aClass243Array2;

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!dh", name = "O", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!dh", name = "Q", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!dh", name = "T", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!dh", name = "U", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "[I")
	public int[] anIntArray139;

	@OriginalMember(owner = "client!dh", name = "W", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!dh", name = "X", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!dh", name = "Y", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!dh", name = "ab", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "B")
	public byte aByte44 = 0;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
	public int anInt1991 = 12;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public int anInt1989 = 0;

	@OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
	public int anInt2001 = 0;

	@OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
	public int anInt2002 = 0;

	@OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
	public int anInt1998 = 0;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	private Class64() {
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([B)V")
	public Class64(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1652(arg0);
		} else {
			this.method1645(arg0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(III)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray34 = new byte[arg1];
		this.aByteArray32 = new byte[arg1];
		this.aByteArray29 = new byte[arg1];
		this.aShortArray38 = new short[arg1];
		this.anIntArray136 = new int[arg1];
		this.aShortArray37 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray134 = new int[arg2];
			this.aByteArray31 = new byte[arg2];
			this.aShortArray40 = new short[arg2];
			this.anIntArray139 = new int[arg2];
			this.anIntArray135 = new int[arg2];
			this.anIntArray138 = new int[arg2];
			this.aShortArray43 = new short[arg2];
			this.aShortArray45 = new short[arg2];
			this.anIntArray131 = new int[arg2];
			this.aByteArray30 = new byte[arg2];
			this.aByteArray35 = new byte[arg2];
			this.anIntArray140 = new int[arg2];
		}
		this.anIntArray137 = new int[arg0];
		this.anIntArray133 = new int[arg0];
		this.anIntArray132 = new int[arg0];
		this.aShortArray42 = new short[arg1];
		this.aShortArray46 = new short[arg1];
		this.aShortArray39 = new short[arg1];
		this.aByteArray33 = new byte[arg1];
		this.anIntArray130 = new int[arg0];
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([Lclient!dh;I)V")
	public Class64(@OriginalArg(0) Class64[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2002 = 0;
		this.anInt1998 = 0;
		this.anInt2001 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte44 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class64 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt1998 += local59.anInt1998;
				this.anInt2001 += local59.anInt2001;
				this.anInt2002 += local59.anInt2002;
				if (local59.aClass243Array2 != null) {
					local34 += local59.aClass243Array2.length;
				}
				if (local59.aClass5Array1 != null) {
					local36 += local59.aClass5Array1.length;
				}
				if (local59.aClass382Array2 != null) {
					local32 += local59.aClass382Array2.length;
				}
				local38 |= local59.aByteArray32 != null;
				local51 |= local59.anIntArray136 != null;
				local42 |= local59.aByteArray29 != null;
				local44 |= local59.aByteArray34 != null;
				if (local59.aByteArray33 == null) {
					if (this.aByte44 == -1) {
						this.aByte44 = local59.aByte44;
					}
					if (this.aByte44 != local59.aByte44) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray42 != null;
			}
		}
		if (this.anInt1998 > 0) {
			this.anIntArray138 = new int[this.anInt1998];
			this.aByteArray30 = new byte[this.anInt1998];
			this.aShortArray43 = new short[this.anInt1998];
			this.aShortArray40 = new short[this.anInt1998];
			this.aByteArray31 = new byte[this.anInt1998];
			this.anIntArray140 = new int[this.anInt1998];
			this.aByteArray35 = new byte[this.anInt1998];
			this.anIntArray135 = new int[this.anInt1998];
			this.aShortArray45 = new short[this.anInt1998];
			this.anIntArray139 = new int[this.anInt1998];
			this.anIntArray131 = new int[this.anInt1998];
			this.anIntArray134 = new int[this.anInt1998];
		}
		if (local36 > 0) {
			this.aClass5Array1 = new Class5[local36];
		}
		if (local38) {
			this.aByteArray32 = new byte[this.anInt2002];
		}
		if (local42) {
			this.aByteArray29 = new byte[this.anInt2002];
		}
		if (local46) {
			this.aShortArray42 = new short[this.anInt2002];
		}
		if (local32 > 0) {
			this.aClass382Array2 = new Class382[local32];
		}
		this.aShortArray38 = new short[this.anInt2002];
		if (local40) {
			this.aByteArray33 = new byte[this.anInt2002];
		}
		if (local34 > 0) {
			this.aClass243Array2 = new Class243[local34];
		}
		this.aShortArray44 = new short[this.anInt2002];
		this.anIntArray133 = new int[this.anInt2001];
		if (local44) {
			this.aByteArray34 = new byte[this.anInt2002];
		}
		this.aShortArray46 = new short[this.anInt2002];
		this.aShortArray41 = new short[this.anInt2001];
		if (local51) {
			this.anIntArray136 = new int[this.anInt2002];
		}
		this.anIntArray130 = new int[this.anInt2001];
		this.anIntArray137 = new int[this.anInt2001];
		this.aShortArray39 = new short[this.anInt2002];
		this.aShortArray37 = new short[this.anInt2002];
		this.anIntArray132 = new int[this.anInt2001];
		local32 = 0;
		local34 = 0;
		local36 = 0;
		this.anInt2002 = 0;
		this.anInt2001 = 0;
		this.anInt1998 = 0;
		@Pc(617) int local617;
		@Pc(628) int local628;
		for (@Pc(381) int local381 = 0; local381 < arg1; local381++) {
			@Pc(388) short local388 = (short) (0x1 << local381);
			@Pc(392) Class64 local392 = arg0[local381];
			if (local392 != null) {
				@Pc(399) int local399;
				if (local392.aClass5Array1 != null) {
					for (local399 = 0; local399 < local392.aClass5Array1.length; local399++) {
						@Pc(406) Class5 local406 = local392.aClass5Array1[local399];
						this.aClass5Array1[local36++] = local406.method68(this.anInt2002 + local406.anInt67);
					}
				}
				for (local399 = 0; local399 < local392.anInt2002; local399++) {
					if (local38 && local392.aByteArray32 != null) {
						this.aByteArray32[this.anInt2002] = local392.aByteArray32[local399];
					}
					if (local40) {
						if (local392.aByteArray33 == null) {
							this.aByteArray33[this.anInt2002] = local392.aByte44;
						} else {
							this.aByteArray33[this.anInt2002] = local392.aByteArray33[local399];
						}
					}
					if (local42 && local392.aByteArray29 != null) {
						this.aByteArray29[this.anInt2002] = local392.aByteArray29[local399];
					}
					if (local46) {
						if (local392.aShortArray42 == null) {
							this.aShortArray42[this.anInt2002] = -1;
						} else {
							this.aShortArray42[this.anInt2002] = local392.aShortArray42[local399];
						}
					}
					if (local51) {
						if (local392.anIntArray136 == null) {
							this.anIntArray136[this.anInt2002] = -1;
						} else {
							this.anIntArray136[this.anInt2002] = local392.anIntArray136[local399];
						}
					}
					this.aShortArray38[this.anInt2002] = (short) this.method1648(local388, local392.aShortArray38[local399], local392);
					this.aShortArray37[this.anInt2002] = (short) this.method1648(local388, local392.aShortArray37[local399], local392);
					this.aShortArray39[this.anInt2002] = (short) this.method1648(local388, local392.aShortArray39[local399], local392);
					this.aShortArray44[this.anInt2002] = local388;
					this.aShortArray46[this.anInt2002] = local392.aShortArray46[local399];
					this.anInt2002++;
				}
				@Pc(604) int local604;
				if (local392.aClass382Array2 != null) {
					for (local604 = 0; local604 < local392.aClass382Array2.length; local604++) {
						local617 = this.method1648(local388, local392.aClass382Array2[local604].anInt10680, local392);
						local628 = this.method1648(local388, local392.aClass382Array2[local604].anInt10683, local392);
						@Pc(639) int local639 = this.method1648(local388, local392.aClass382Array2[local604].anInt10673, local392);
						this.aClass382Array2[local32] = local392.aClass382Array2[local604].method8974(local617, local628, local639);
						local32++;
					}
				}
				if (local392.aClass243Array2 != null) {
					for (local604 = 0; local604 < local392.aClass243Array2.length; local604++) {
						local617 = this.method1648(local388, local392.aClass243Array2[local604].anInt7539, local392);
						this.aClass243Array2[local34] = local392.aClass243Array2[local604].method6507(local617);
						local34++;
					}
				}
			}
		}
		@Pc(713) int local713 = 0;
		this.anInt1989 = this.anInt2001;
		for (@Pc(719) int local719 = 0; local719 < arg1; local719++) {
			@Pc(726) short local726 = (short) (0x1 << local719);
			@Pc(730) Class64 local730 = arg0[local719];
			if (local730 != null) {
				for (local617 = 0; local617 < local730.anInt2002; local617++) {
					if (local44) {
						this.aByteArray34[local713++] = (byte) (local730.aByteArray34 == null || local730.aByteArray34[local617] == -1 ? -1 : local730.aByteArray34[local617] + this.anInt1998);
					}
				}
				for (local628 = 0; local628 < local730.anInt1998; local628++) {
					@Pc(782) byte local782 = this.aByteArray31[this.anInt1998] = local730.aByteArray31[local628];
					if (local782 == 0) {
						this.aShortArray40[this.anInt1998] = (short) this.method1648(local726, local730.aShortArray40[local628], local730);
						this.aShortArray45[this.anInt1998] = (short) this.method1648(local726, local730.aShortArray45[local628], local730);
						this.aShortArray43[this.anInt1998] = (short) this.method1648(local726, local730.aShortArray43[local628], local730);
					}
					if (local782 >= 1 && local782 <= 3) {
						this.aShortArray40[this.anInt1998] = local730.aShortArray40[local628];
						this.aShortArray45[this.anInt1998] = local730.aShortArray45[local628];
						this.aShortArray43[this.anInt1998] = local730.aShortArray43[local628];
						this.anIntArray131[this.anInt1998] = local730.anIntArray131[local628];
						this.anIntArray134[this.anInt1998] = local730.anIntArray134[local628];
						this.anIntArray138[this.anInt1998] = local730.anIntArray138[local628];
						this.aByteArray30[this.anInt1998] = local730.aByteArray30[local628];
						this.aByteArray35[this.anInt1998] = local730.aByteArray35[local628];
						this.anIntArray140[this.anInt1998] = local730.anIntArray140[local628];
					}
					if (local782 == 2) {
						this.anIntArray139[this.anInt1998] = local730.anIntArray139[local628];
						this.anIntArray135[this.anInt1998] = local730.anIntArray135[local628];
					}
					this.anInt1998++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(SSSSBBSBSI)B")
	public byte method1644() {
		if (this.anInt1998 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray31[this.anInt1998] = 3;
		this.aShortArray40[this.anInt1998] = 0;
		this.aShortArray45[this.anInt1998] = 32767;
		this.aShortArray43[this.anInt1998] = 0;
		this.anIntArray131[this.anInt1998] = 1024;
		this.anIntArray134[this.anInt1998] = 1024;
		this.anIntArray138[this.anInt1998] = 1024;
		this.aByteArray30[this.anInt1998] = 0;
		this.aByteArray35[this.anInt1998] = 0;
		this.anIntArray140[this.anInt1998] = 0;
		return (byte) this.anInt1998++;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([BI)V")
	private void method1645(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub40 local14 = new Class6_Sub40(arg0);
		@Pc(19) Class6_Sub40 local19 = new Class6_Sub40(arg0);
		@Pc(24) Class6_Sub40 local24 = new Class6_Sub40(arg0);
		@Pc(29) Class6_Sub40 local29 = new Class6_Sub40(arg0);
		@Pc(34) Class6_Sub40 local34 = new Class6_Sub40(arg0);
		local14.anInt10169 = arg0.length - 18;
		this.anInt2001 = local14.method8571();
		this.anInt2002 = local14.method8571();
		this.anInt1998 = local14.method8604();
		@Pc(59) int local59 = local14.method8604();
		@Pc(63) int local63 = local14.method8604();
		@Pc(67) int local67 = local14.method8604();
		@Pc(71) int local71 = local14.method8604();
		@Pc(75) int local75 = local14.method8604();
		@Pc(79) int local79 = local14.method8571();
		@Pc(83) int local83 = local14.method8571();
		@Pc(87) int local87 = local14.method8571();
		@Pc(91) int local91 = local14.method8571();
		@Pc(100) int local100 = this.anInt2001;
		@Pc(102) int local102 = local100;
		local100 += this.anInt2002;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt2002;
		}
		@Pc(125) int local125 = local100;
		if (local71 == 1) {
			local100 += this.anInt2002;
		}
		@Pc(135) int local135 = local100;
		if (local59 == 1) {
			local100 += this.anInt2002;
		}
		@Pc(147) int local147 = local100;
		if (local75 == 1) {
			local100 += this.anInt2001;
		}
		@Pc(159) int local159 = local100;
		if (local67 == 1) {
			local100 += this.anInt2002;
		}
		@Pc(169) int local169 = local100;
		local100 += local91;
		@Pc(175) int local175 = local100;
		local100 += this.anInt2002 * 2;
		@Pc(184) int local184 = local100;
		local100 += this.anInt1998 * 6;
		@Pc(193) int local193 = local100;
		local100 += local79;
		@Pc(199) int local199 = local100;
		local100 += local83;
		this.anIntArray133 = new int[this.anInt2001];
		this.aShortArray39 = new short[this.anInt2002];
		this.aShortArray37 = new short[this.anInt2002];
		if (local67 == 1) {
			this.aByteArray29 = new byte[this.anInt2002];
		}
		if (local71 == 1) {
			this.anIntArray136 = new int[this.anInt2002];
		}
		if (this.anInt1998 > 0) {
			this.aByteArray31 = new byte[this.anInt1998];
			this.aShortArray40 = new short[this.anInt1998];
			this.aShortArray43 = new short[this.anInt1998];
			this.aShortArray45 = new short[this.anInt1998];
		}
		this.anIntArray130 = new int[this.anInt2001];
		this.anIntArray132 = new int[this.anInt2001];
		if (local63 == 255) {
			this.aByteArray33 = new byte[this.anInt2002];
		} else {
			this.aByte44 = (byte) local63;
		}
		if (local59 == 1) {
			this.aByteArray32 = new byte[this.anInt2002];
			this.aShortArray42 = new short[this.anInt2002];
			this.aByteArray34 = new byte[this.anInt2002];
		}
		if (local75 == 1) {
			this.anIntArray137 = new int[this.anInt2001];
		}
		this.aShortArray38 = new short[this.anInt2002];
		local14.anInt10169 = 0;
		this.aShortArray46 = new short[this.anInt2002];
		local19.anInt10169 = local193;
		local24.anInt10169 = local199;
		local29.anInt10169 = local100;
		local34.anInt10169 = local147;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(359) int local359;
		@Pc(361) int local361;
		for (@Pc(353) int local353 = 0; local353 < this.anInt2001; local353++) {
			local359 = local14.method8604();
			local361 = 0;
			if ((local359 & 0x1) != 0) {
				local361 = local19.method8600();
			}
			@Pc(371) int local371 = 0;
			if ((local359 & 0x2) != 0) {
				local371 = local24.method8600();
			}
			@Pc(381) int local381 = 0;
			if ((local359 & 0x4) != 0) {
				local381 = local29.method8600();
			}
			this.anIntArray132[local353] = local361 + local347;
			this.anIntArray133[local353] = local371 + local349;
			this.anIntArray130[local353] = local381 + local351;
			local351 = this.anIntArray130[local353];
			local347 = this.anIntArray132[local353];
			local349 = this.anIntArray133[local353];
			if (local75 == 1) {
				this.anIntArray137[local353] = local34.method8604();
			}
		}
		local14.anInt10169 = local175;
		local19.anInt10169 = local135;
		local24.anInt10169 = local109;
		local29.anInt10169 = local159;
		local34.anInt10169 = local125;
		for (local359 = 0; local359 < this.anInt2002; local359++) {
			this.aShortArray46[local359] = (short) local14.method8571();
			if (local59 == 1) {
				local361 = local19.method8604();
				if ((local361 & 0x1) == 1) {
					local7 = true;
					this.aByteArray32[local359] = 1;
				} else {
					this.aByteArray32[local359] = 0;
				}
				if ((local361 & 0x2) == 2) {
					this.aByteArray34[local359] = (byte) (local361 >> 2);
					this.aShortArray42[local359] = this.aShortArray46[local359];
					this.aShortArray46[local359] = 127;
					if (this.aShortArray42[local359] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray34[local359] = -1;
					this.aShortArray42[local359] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray33[local359] = local24.method8602();
			}
			if (local67 == 1) {
				this.aByteArray29[local359] = local29.method8602();
			}
			if (local71 == 1) {
				this.anIntArray136[local359] = local34.method8604();
			}
		}
		this.anInt1989 = -1;
		local14.anInt10169 = local169;
		local19.anInt10169 = local102;
		@Pc(597) short local597 = 0;
		@Pc(599) short local599 = 0;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(611) int local611;
		for (@Pc(605) int local605 = 0; local605 < this.anInt2002; local605++) {
			local611 = local19.method8604();
			if (local611 == 1) {
				local597 = (short) (local14.method8600() + local603);
				local599 = (short) (local597 + local14.method8600());
				local601 = (short) (local599 + local14.method8600());
				this.aShortArray38[local605] = local597;
				local603 = local601;
				this.aShortArray37[local605] = local599;
				this.aShortArray39[local605] = local601;
				if (this.anInt1989 < local597) {
					this.anInt1989 = local597;
				}
				if (local599 > this.anInt1989) {
					this.anInt1989 = local599;
				}
				if (this.anInt1989 < local601) {
					this.anInt1989 = local601;
				}
			}
			if (local611 == 2) {
				local599 = local601;
				local601 = (short) (local603 + local14.method8600());
				local603 = local601;
				this.aShortArray38[local605] = local597;
				this.aShortArray37[local605] = local599;
				this.aShortArray39[local605] = local601;
				if (this.anInt1989 < local601) {
					this.anInt1989 = local601;
				}
			}
			if (local611 == 3) {
				local597 = local601;
				local601 = (short) (local603 + local14.method8600());
				local603 = local601;
				this.aShortArray38[local605] = local597;
				this.aShortArray37[local605] = local599;
				this.aShortArray39[local605] = local601;
				if (this.anInt1989 < local601) {
					this.anInt1989 = local601;
				}
			}
			if (local611 == 4) {
				@Pc(768) short local768 = local597;
				local597 = local599;
				local599 = local768;
				local601 = (short) (local14.method8600() + local603);
				local603 = local601;
				this.aShortArray38[local605] = local597;
				this.aShortArray37[local605] = local768;
				this.aShortArray39[local605] = local601;
				if (local601 > this.anInt1989) {
					this.anInt1989 = local601;
				}
			}
		}
		local14.anInt10169 = local184;
		this.anInt1989++;
		for (local611 = 0; local611 < this.anInt1998; local611++) {
			this.aByteArray31[local611] = 0;
			this.aShortArray40[local611] = (short) local14.method8571();
			this.aShortArray45[local611] = (short) local14.method8571();
			this.aShortArray43[local611] = (short) local14.method8571();
		}
		if (this.aByteArray34 != null) {
			@Pc(868) boolean local868 = false;
			for (@Pc(870) int local870 = 0; local870 < this.anInt2002; local870++) {
				@Pc(879) int local879 = this.aByteArray34[local870] & 0xFF;
				if (local879 != 255) {
					if (this.aShortArray38[local870] == (this.aShortArray40[local879] & 0xFFFF) && this.aShortArray37[local870] == (this.aShortArray45[local879] & 0xFFFF) && this.aShortArray39[local870] == (this.aShortArray43[local879] & 0xFFFF)) {
						this.aByteArray34[local870] = -1;
					} else {
						local868 = true;
					}
				}
			}
			if (!local868) {
				this.aByteArray34 = null;
			}
		}
		if (!local9) {
			this.aShortArray42 = null;
		}
		if (!local7) {
			this.aByteArray32 = null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZ)[[I")
	public int[][] method1646(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt2001 : this.anInt1989;
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
			@Pc(33) int local33 = this.anIntArray137[local26];
			if (local33 >= 0) {
				if (local10 < local33) {
					local10 = local33;
				}
				@Pc(44) int local44 = local8[local33]++;
			}
		}
		@Pc(60) int[][] local60 = new int[local10 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local10; local62++) {
			local60[local62] = new int[local8[local62]];
			local8[local62] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < local18; local81++) {
			@Pc(88) int local88 = this.anIntArray137[local81];
			if (local88 >= 0) {
				local60[local88][local8[local88]++] = local81;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V")
	public void method1647() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2001; local11++) {
			this.anIntArray132[local11] <<= 0x2;
			this.anIntArray133[local11] <<= 0x2;
			this.anIntArray130[local11] <<= 0x2;
		}
		if (this.anInt1998 <= 0 || this.anIntArray131 == null) {
			return;
		}
		for (@Pc(50) int local50 = 0; local50 < this.anIntArray131.length; local50++) {
			this.anIntArray131[local50] <<= 0x2;
			this.anIntArray134[local50] <<= 0x2;
			if (this.aByteArray31[local50] != 1) {
				this.anIntArray138[local50] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(SILclient!dh;Z)I")
	private int method1648(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2) {
		@Pc(10) int local10 = arg2.anIntArray132[arg1];
		@Pc(15) int local15 = arg2.anIntArray133[arg1];
		@Pc(20) int local20 = arg2.anIntArray130[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2001; local22++) {
			if (this.anIntArray132[local22] == local10 && this.anIntArray133[local22] == local15 && local20 == this.anIntArray130[local22]) {
				this.aShortArray41[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray132[this.anInt2001] = local10;
		this.anIntArray133[this.anInt2001] = local15;
		this.anIntArray130[this.anInt2001] = local20;
		this.aShortArray41[this.anInt2001] = arg0;
		this.anIntArray137[this.anInt2001] = arg2.anIntArray137 == null ? -1 : arg2.anIntArray137[arg1];
		return this.anInt2001++;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBII)V")
	public void method1650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt2001; local9++) {
			this.anIntArray132[local9] += arg1;
			this.anIntArray133[local9] += arg0;
			this.anIntArray130[local9] += arg2;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)[[I")
	public int[][] method1651() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.aClass5Array1.length; local17++) {
			@Pc(25) int local25 = this.aClass5Array1[local17].anInt64;
			if (local25 >= 0) {
				if (local25 > local15) {
					local15 = local25;
				}
				@Pc(40) int local40 = local13[local25]++;
			}
		}
		@Pc(58) int[][] local58 = new int[local15 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local15; local60++) {
			local58[local60] = new int[local13[local60]];
			local13[local60] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.aClass5Array1.length; local83++) {
			@Pc(91) int local91 = this.aClass5Array1[local83].anInt64;
			if (local91 >= 0) {
				local58[local91][local13[local91]++] = local83;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B[B)V")
	private void method1652(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class6_Sub40 local10 = new Class6_Sub40(arg0);
		@Pc(15) Class6_Sub40 local15 = new Class6_Sub40(arg0);
		@Pc(20) Class6_Sub40 local20 = new Class6_Sub40(arg0);
		@Pc(25) Class6_Sub40 local25 = new Class6_Sub40(arg0);
		@Pc(30) Class6_Sub40 local30 = new Class6_Sub40(arg0);
		@Pc(39) Class6_Sub40 local39 = new Class6_Sub40(arg0);
		@Pc(44) Class6_Sub40 local44 = new Class6_Sub40(arg0);
		local10.anInt10169 = arg0.length - 23;
		this.anInt2001 = local10.method8571();
		this.anInt2002 = local10.method8571();
		this.anInt1998 = local10.method8604();
		@Pc(69) int local69 = local10.method8604();
		@Pc(78) boolean local78 = (local69 & 0x1) == 1;
		@Pc(89) boolean local89 = (local69 & 0x2) == 2;
		@Pc(100) boolean local100 = (local69 & 0x4) == 4;
		@Pc(111) boolean local111 = (local69 & 0x8) == 8;
		if (local111) {
			local10.anInt10169 -= 7;
			this.anInt1991 = local10.method8604();
			local10.anInt10169 += 6;
		}
		@Pc(134) int local134 = local10.method8604();
		@Pc(138) int local138 = local10.method8604();
		@Pc(142) int local142 = local10.method8604();
		@Pc(146) int local146 = local10.method8604();
		@Pc(150) int local150 = local10.method8604();
		@Pc(154) int local154 = local10.method8571();
		@Pc(158) int local158 = local10.method8571();
		@Pc(162) int local162 = local10.method8571();
		@Pc(166) int local166 = local10.method8571();
		@Pc(170) int local170 = local10.method8571();
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(189) int local189;
		if (this.anInt1998 > 0) {
			this.aByteArray31 = new byte[this.anInt1998];
			local10.anInt10169 = 0;
			for (local189 = 0; local189 < this.anInt1998; local189++) {
				@Pc(200) byte local200 = this.aByteArray31[local189] = local10.method8602();
				if (local200 >= 1 && local200 <= 3) {
					local174++;
				}
				if (local200 == 0) {
					local172++;
				}
				if (local200 == 2) {
					local176++;
				}
			}
		}
		local189 = this.anInt1998;
		@Pc(235) int local235 = local189;
		local189 += this.anInt2001;
		@Pc(242) int local242 = local189;
		if (local78) {
			local189 += this.anInt2002;
		}
		@Pc(251) int local251 = local189;
		local189 += this.anInt2002;
		@Pc(258) int local258 = local189;
		if (local134 == 255) {
			local189 += this.anInt2002;
		}
		@Pc(270) int local270 = local189;
		if (local142 == 1) {
			local189 += this.anInt2002;
		}
		@Pc(282) int local282 = local189;
		if (local150 == 1) {
			local189 += this.anInt2001;
		}
		@Pc(292) int local292 = local189;
		if (local138 == 1) {
			local189 += this.anInt2002;
		}
		@Pc(302) int local302 = local189;
		local189 += local166;
		@Pc(308) int local308 = local189;
		if (local146 == 1) {
			local189 += this.anInt2002 * 2;
		}
		@Pc(322) int local322 = local189;
		local189 += local170;
		@Pc(328) int local328 = local189;
		local189 += this.anInt2002 * 2;
		@Pc(337) int local337 = local189;
		local189 += local154;
		@Pc(343) int local343 = local189;
		local189 += local158;
		@Pc(349) int local349 = local189;
		local189 += local162;
		@Pc(355) int local355 = local189;
		local189 += local172 * 6;
		@Pc(363) int local363 = local189;
		local189 += local174 * 6;
		@Pc(371) byte local371 = 6;
		if (this.anInt1991 == 14) {
			local371 = 7;
		} else if (this.anInt1991 >= 15) {
			local371 = 9;
		}
		@Pc(389) int local389 = local189;
		local189 += local371 * local174;
		@Pc(397) int local397 = local189;
		local189 += local174;
		@Pc(403) int local403 = local189;
		local189 += local174;
		@Pc(409) int local409 = local189;
		local189 += local176 * 2 + local174;
		if (local146 == 1) {
			this.aShortArray42 = new short[this.anInt2002];
		}
		if (local146 == 1 && this.anInt1998 > 0) {
			this.aByteArray34 = new byte[this.anInt2002];
		}
		this.aShortArray38 = new short[this.anInt2002];
		if (local150 == 1) {
			this.anIntArray137 = new int[this.anInt2001];
		}
		if (local78) {
			this.aByteArray32 = new byte[this.anInt2002];
		}
		this.aShortArray39 = new short[this.anInt2002];
		local10.anInt10169 = local235;
		if (this.anInt1998 > 0) {
			this.aShortArray43 = new short[this.anInt1998];
			if (local174 > 0) {
				this.aByteArray35 = new byte[local174];
				this.anIntArray134 = new int[local174];
				this.aByteArray30 = new byte[local174];
				this.anIntArray140 = new int[local174];
				this.anIntArray138 = new int[local174];
				this.anIntArray131 = new int[local174];
			}
			if (local176 > 0) {
				this.anIntArray139 = new int[local176];
				this.anIntArray135 = new int[local176];
			}
			this.aShortArray45 = new short[this.anInt1998];
			this.aShortArray40 = new short[this.anInt1998];
		}
		this.anIntArray132 = new int[this.anInt2001];
		this.aShortArray37 = new short[this.anInt2002];
		if (local134 == 255) {
			this.aByteArray33 = new byte[this.anInt2002];
		} else {
			this.aByte44 = (byte) local134;
		}
		this.anIntArray130 = new int[this.anInt2001];
		this.aShortArray46 = new short[this.anInt2002];
		if (local138 == 1) {
			this.aByteArray29 = new byte[this.anInt2002];
		}
		if (local142 == 1) {
			this.anIntArray136 = new int[this.anInt2002];
		}
		this.anIntArray133 = new int[this.anInt2001];
		local15.anInt10169 = local337;
		local20.anInt10169 = local343;
		local25.anInt10169 = local349;
		local30.anInt10169 = local282;
		@Pc(597) int local597 = 0;
		@Pc(599) int local599 = 0;
		@Pc(601) int local601 = 0;
		@Pc(609) int local609;
		for (@Pc(603) int local603 = 0; local603 < this.anInt2001; local603++) {
			local609 = local10.method8604();
			@Pc(611) int local611 = 0;
			if ((local609 & 0x1) != 0) {
				local611 = local15.method8600();
			}
			@Pc(624) int local624 = 0;
			if ((local609 & 0x2) != 0) {
				local624 = local20.method8600();
			}
			@Pc(637) int local637 = 0;
			if ((local609 & 0x4) != 0) {
				local637 = local25.method8600();
			}
			this.anIntArray132[local603] = local611 + local597;
			this.anIntArray133[local603] = local599 + local624;
			this.anIntArray130[local603] = local601 + local637;
			local599 = this.anIntArray133[local603];
			local597 = this.anIntArray132[local603];
			local601 = this.anIntArray130[local603];
			if (local150 == 1) {
				this.anIntArray137[local603] = local30.method8604();
			}
		}
		local10.anInt10169 = local328;
		local15.anInt10169 = local242;
		local20.anInt10169 = local258;
		local25.anInt10169 = local292;
		local30.anInt10169 = local270;
		local39.anInt10169 = local308;
		local44.anInt10169 = local322;
		for (local609 = 0; local609 < this.anInt2002; local609++) {
			this.aShortArray46[local609] = (short) local10.method8571();
			if (local78) {
				this.aByteArray32[local609] = local15.method8602();
			}
			if (local134 == 255) {
				this.aByteArray33[local609] = local20.method8602();
			}
			if (local138 == 1) {
				this.aByteArray29[local609] = local25.method8602();
			}
			if (local142 == 1) {
				this.anIntArray136[local609] = local30.method8604();
			}
			if (local146 == 1) {
				this.aShortArray42[local609] = (short) (local39.method8571() - 1);
			}
			if (this.aByteArray34 != null) {
				if (this.aShortArray42[local609] == -1) {
					this.aByteArray34[local609] = -1;
				} else {
					this.aByteArray34[local609] = (byte) (local44.method8604() - 1);
				}
			}
		}
		this.anInt1989 = -1;
		local10.anInt10169 = local302;
		local15.anInt10169 = local251;
		@Pc(834) short local834 = 0;
		@Pc(836) short local836 = 0;
		@Pc(838) short local838 = 0;
		@Pc(840) short local840 = 0;
		@Pc(848) int local848;
		for (@Pc(842) int local842 = 0; local842 < this.anInt2002; local842++) {
			local848 = local15.method8604();
			if (local848 == 1) {
				local834 = (short) (local840 + local10.method8600());
				local836 = (short) (local834 + local10.method8600());
				local838 = (short) (local10.method8600() + local836);
				local840 = local838;
				this.aShortArray38[local842] = local834;
				this.aShortArray37[local842] = local836;
				this.aShortArray39[local842] = local838;
				if (local834 > this.anInt1989) {
					this.anInt1989 = local834;
				}
				if (local836 > this.anInt1989) {
					this.anInt1989 = local836;
				}
				if (local838 > this.anInt1989) {
					this.anInt1989 = local838;
				}
			}
			if (local848 == 2) {
				local836 = local838;
				local838 = (short) (local840 + local10.method8600());
				this.aShortArray38[local842] = local834;
				local840 = local838;
				this.aShortArray37[local842] = local836;
				this.aShortArray39[local842] = local838;
				if (local838 > this.anInt1989) {
					this.anInt1989 = local838;
				}
			}
			if (local848 == 3) {
				local834 = local838;
				local838 = (short) (local10.method8600() + local840);
				local840 = local838;
				this.aShortArray38[local842] = local834;
				this.aShortArray37[local842] = local836;
				this.aShortArray39[local842] = local838;
				if (this.anInt1989 < local838) {
					this.anInt1989 = local838;
				}
			}
			if (local848 == 4) {
				@Pc(1005) short local1005 = local834;
				local834 = local836;
				local836 = local1005;
				local838 = (short) (local10.method8600() + local840);
				this.aShortArray38[local842] = local834;
				local840 = local838;
				this.aShortArray37[local842] = local1005;
				this.aShortArray39[local842] = local838;
				if (local838 > this.anInt1989) {
					this.anInt1989 = local838;
				}
			}
		}
		this.anInt1989++;
		local10.anInt10169 = local355;
		local15.anInt10169 = local363;
		local20.anInt10169 = local389;
		local25.anInt10169 = local397;
		local30.anInt10169 = local403;
		local39.anInt10169 = local409;
		@Pc(1080) int local1080;
		for (local848 = 0; local848 < this.anInt1998; local848++) {
			local1080 = this.aByteArray31[local848] & 0xFF;
			if (local1080 == 0) {
				this.aShortArray40[local848] = (short) local10.method8571();
				this.aShortArray45[local848] = (short) local10.method8571();
				this.aShortArray43[local848] = (short) local10.method8571();
			}
			if (local1080 == 1) {
				this.aShortArray40[local848] = (short) local15.method8571();
				this.aShortArray45[local848] = (short) local15.method8571();
				this.aShortArray43[local848] = (short) local15.method8571();
				if (this.anInt1991 < 15) {
					this.anIntArray131[local848] = local20.method8571();
					if (this.anInt1991 < 14) {
						this.anIntArray134[local848] = local20.method8571();
					} else {
						this.anIntArray134[local848] = local20.method8606();
					}
					this.anIntArray138[local848] = local20.method8571();
				} else {
					this.anIntArray131[local848] = local20.method8606();
					this.anIntArray134[local848] = local20.method8606();
					this.anIntArray138[local848] = local20.method8606();
				}
				this.aByteArray30[local848] = local25.method8602();
				this.aByteArray35[local848] = local30.method8602();
				this.anIntArray140[local848] = local39.method8602();
			}
			if (local1080 == 2) {
				this.aShortArray40[local848] = (short) local15.method8571();
				this.aShortArray45[local848] = (short) local15.method8571();
				this.aShortArray43[local848] = (short) local15.method8571();
				if (this.anInt1991 < 15) {
					this.anIntArray131[local848] = local20.method8571();
					if (this.anInt1991 < 14) {
						this.anIntArray134[local848] = local20.method8571();
					} else {
						this.anIntArray134[local848] = local20.method8606();
					}
					this.anIntArray138[local848] = local20.method8571();
				} else {
					this.anIntArray131[local848] = local20.method8606();
					this.anIntArray134[local848] = local20.method8606();
					this.anIntArray138[local848] = local20.method8606();
				}
				this.aByteArray30[local848] = local25.method8602();
				this.aByteArray35[local848] = local30.method8602();
				this.anIntArray140[local848] = local39.method8602();
				this.anIntArray139[local848] = local39.method8602();
				this.anIntArray135[local848] = local39.method8602();
			}
			if (local1080 == 3) {
				this.aShortArray40[local848] = (short) local15.method8571();
				this.aShortArray45[local848] = (short) local15.method8571();
				this.aShortArray43[local848] = (short) local15.method8571();
				if (this.anInt1991 >= 15) {
					this.anIntArray131[local848] = local20.method8606();
					this.anIntArray134[local848] = local20.method8606();
					this.anIntArray138[local848] = local20.method8606();
				} else {
					this.anIntArray131[local848] = local20.method8571();
					if (this.anInt1991 < 14) {
						this.anIntArray134[local848] = local20.method8571();
					} else {
						this.anIntArray134[local848] = local20.method8606();
					}
					this.anIntArray138[local848] = local20.method8571();
				}
				this.aByteArray30[local848] = local25.method8602();
				this.aByteArray35[local848] = local30.method8602();
				this.anIntArray140[local848] = local39.method8602();
			}
		}
		local10.anInt10169 = local189;
		@Pc(1483) int local1483;
		@Pc(1489) int local1489;
		@Pc(1493) int local1493;
		@Pc(1557) int local1557;
		if (local89) {
			local1080 = local10.method8604();
			if (local1080 > 0) {
				this.aClass382Array2 = new Class382[local1080];
				for (local1483 = 0; local1483 < local1080; local1483++) {
					local1489 = local10.method8571();
					local1493 = local10.method8571();
					@Pc(1499) byte local1499;
					if (local134 == 255) {
						local1499 = this.aByteArray33[local1493];
					} else {
						local1499 = (byte) local134;
					}
					this.aClass382Array2[local1483] = new Class382(local1489, this.aShortArray38[local1493], this.aShortArray37[local1493], this.aShortArray39[local1493], local1499);
				}
			}
			local1483 = local10.method8604();
			if (local1483 > 0) {
				this.aClass243Array2 = new Class243[local1483];
				for (local1489 = 0; local1489 < local1483; local1489++) {
					local1493 = local10.method8571();
					local1557 = local10.method8571();
					this.aClass243Array2[local1489] = new Class243(local1493, local1557);
				}
			}
		}
		if (!local100) {
			return;
		}
		local1080 = local10.method8604();
		if (local1080 <= 0) {
			return;
		}
		this.aClass5Array1 = new Class5[local1080];
		for (local1483 = 0; local1483 < local1080; local1483++) {
			local1489 = local10.method8571();
			local1493 = local10.method8571();
			local1557 = local10.method8604();
			@Pc(1605) byte local1605 = local10.method8602();
			this.aClass5Array1[local1483] = new Class5(local1489, local1493, local1557, local1605);
		}
		return;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(SSZ)V")
	public void method1653(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(14) int local14 = 0; local14 < this.anInt2002; local14++) {
			if (arg1 == this.aShortArray46[local14]) {
				this.aShortArray46[local14] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(SSI)V")
	public void method1654(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray42 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2002; local18++) {
			if (this.aShortArray42[local18] == arg0) {
				this.aShortArray42[local18] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)[[I")
	public int[][] method1656() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2002; local12++) {
			@Pc(27) int local27 = this.anIntArray136[local12];
			if (local27 >= 0) {
				if (local27 > local10) {
					local10 = local27;
				}
				@Pc(38) int local38 = local8[local27]++;
			}
		}
		@Pc(51) int[][] local51 = new int[local10 + 1][];
		for (@Pc(53) int local53 = 0; local53 <= local10; local53++) {
			local51[local53] = new int[local8[local53]];
			local8[local53] = 0;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt2002; local76++) {
			@Pc(83) int local83 = this.anIntArray136[local76];
			if (local83 >= 0) {
				local51[local83][local8[local83]++] = local76;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V")
	public void method1657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg0 != 0) {
			local14 = Class100_Sub1.anIntArray428[arg0];
			local18 = Class100_Sub1.anIntArray429[arg0];
			for (local20 = 0; local20 < this.anInt2001; local20++) {
				local38 = local14 * this.anIntArray133[local20] + local18 * this.anIntArray132[local20] >> 14;
				this.anIntArray133[local20] = local18 * this.anIntArray133[local20] - this.anIntArray132[local20] * local14 >> 14;
				this.anIntArray132[local20] = local38;
			}
		}
		if (arg1 != 0) {
			local14 = Class100_Sub1.anIntArray428[arg1];
			local18 = Class100_Sub1.anIntArray429[arg1];
			for (local20 = 0; local20 < this.anInt2001; local20++) {
				local38 = this.anIntArray133[local20] * local18 - local14 * this.anIntArray130[local20] >> 14;
				this.anIntArray130[local20] = this.anIntArray133[local20] * local14 + this.anIntArray130[local20] * local18 >> 14;
				this.anIntArray133[local20] = local38;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local14 = Class100_Sub1.anIntArray428[arg2];
		local18 = Class100_Sub1.anIntArray429[arg2];
		for (local20 = 0; local20 < this.anInt2001; local20++) {
			local38 = local14 * this.anIntArray130[local20] + this.anIntArray132[local20] * local18 >> 14;
			this.anIntArray130[local20] = local18 * this.anIntArray130[local20] - this.anIntArray132[local20] * local14 >> 14;
			this.anIntArray132[local20] = local38;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBBSIBIIS)I")
	public int method1658(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) short arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) short arg7) {
		this.aShortArray38[this.anInt2002] = (short) arg6;
		this.aShortArray37[this.anInt2002] = (short) arg5;
		this.aShortArray39[this.anInt2002] = (short) arg0;
		this.aByteArray32[this.anInt2002] = arg2;
		this.aByteArray34[this.anInt2002] = arg1;
		this.aShortArray46[this.anInt2002] = arg3;
		this.aByteArray29[this.anInt2002] = arg4;
		this.aShortArray42[this.anInt2002] = arg7;
		return this.anInt2002++;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIBI)I")
	public int method1659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2001; local7++) {
			if (this.anIntArray132[local7] == arg2 && this.anIntArray133[local7] == arg0 && arg1 == this.anIntArray130[local7]) {
				return local7;
			}
		}
		this.anIntArray132[this.anInt2001] = arg2;
		this.anIntArray133[this.anInt2001] = arg0;
		this.anIntArray130[this.anInt2001] = arg1;
		this.anInt1989 = this.anInt2001 + 1;
		return this.anInt2001++;
	}
}
