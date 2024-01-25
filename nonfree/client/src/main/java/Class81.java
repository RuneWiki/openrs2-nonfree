import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class81 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "[Lclient!fr;")
	public Class106[] aClass106Array1;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!ei", name = "x", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!ei", name = "z", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "[Lclient!dl;")
	public Class68[] aClass68Array1;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "[Lclient!rm;")
	public Class256[] aClass256Array1;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!ei", name = "R", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!ei", name = "U", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!ei", name = "V", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!ei", name = "Y", descriptor = "[I")
	public int[] anIntArray175;

	@OriginalMember(owner = "client!ei", name = "bb", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!ei", name = "cb", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public int anInt2240 = 0;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	public int anInt2239 = 0;

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
	public int anInt2249 = 0;

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
	public int anInt2251 = 0;

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "B")
	public byte aByte36 = 0;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	public int anInt2236 = 12;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([B)V")
	public Class81(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2164(arg0);
		} else {
			this.method2162(arg0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(III)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray43 = new short[arg1];
		this.aByteArray27 = new byte[arg1];
		this.aShortArray39 = new short[arg1];
		this.aShortArray45 = new short[arg1];
		this.aShortArray42 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray30 = new byte[arg2];
			this.aShortArray48 = new short[arg2];
			this.anIntArray175 = new int[arg2];
			this.anIntArray166 = new int[arg2];
			this.anIntArray169 = new int[arg2];
			this.aByteArray26 = new byte[arg2];
			this.anIntArray167 = new int[arg2];
			this.aByteArray24 = new byte[arg2];
			this.anIntArray171 = new int[arg2];
			this.aShortArray47 = new short[arg2];
			this.aShortArray40 = new short[arg2];
			this.anIntArray168 = new int[arg2];
		}
		this.anIntArray172 = new int[arg0];
		this.anIntArray170 = new int[arg0];
		this.aByteArray28 = new byte[arg1];
		this.anIntArray173 = new int[arg1];
		this.aByteArray25 = new byte[arg1];
		this.anIntArray174 = new int[arg0];
		this.aByteArray29 = new byte[arg1];
		this.anIntArray165 = new int[arg0];
		this.aShortArray41 = new short[arg1];
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([Lclient!ei;I)V")
	public Class81(@OriginalArg(0) Class81[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2251 = 0;
		this.anInt2249 = 0;
		this.anInt2239 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte36 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class81 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt2249 += local59.anInt2249;
				this.anInt2239 += local59.anInt2239;
				this.anInt2251 += local59.anInt2251;
				if (local59.aClass256Array1 != null) {
					local36 += local59.aClass256Array1.length;
				}
				if (local59.aClass106Array1 != null) {
					local34 += local59.aClass106Array1.length;
				}
				local38 |= local59.aByteArray29 != null;
				if (local59.aClass68Array1 != null) {
					local32 += local59.aClass68Array1.length;
				}
				local51 |= local59.anIntArray173 != null;
				local42 |= local59.aByteArray25 != null;
				local46 |= local59.aShortArray43 != null;
				local44 |= local59.aByteArray27 != null;
				if (local59.aByteArray28 == null) {
					if (this.aByte36 == -1) {
						this.aByte36 = local59.aByte36;
					}
					if (local59.aByte36 != this.aByte36) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		this.aShortArray41 = new short[this.anInt2239];
		this.aShortArray42 = new short[this.anInt2239];
		this.aShortArray46 = new short[this.anInt2239];
		this.anIntArray165 = new int[this.anInt2251];
		this.aShortArray44 = new short[this.anInt2251];
		if (local51) {
			this.anIntArray173 = new int[this.anInt2239];
		}
		if (local44) {
			this.aByteArray27 = new byte[this.anInt2239];
		}
		if (local40) {
			this.aByteArray28 = new byte[this.anInt2239];
		}
		if (local46) {
			this.aShortArray43 = new short[this.anInt2239];
		}
		this.aShortArray39 = new short[this.anInt2239];
		if (this.anInt2249 > 0) {
			this.anIntArray166 = new int[this.anInt2249];
			this.aShortArray48 = new short[this.anInt2249];
			this.anIntArray168 = new int[this.anInt2249];
			this.anIntArray167 = new int[this.anInt2249];
			this.anIntArray175 = new int[this.anInt2249];
			this.aByteArray26 = new byte[this.anInt2249];
			this.anIntArray171 = new int[this.anInt2249];
			this.anIntArray169 = new int[this.anInt2249];
			this.aShortArray47 = new short[this.anInt2249];
			this.aShortArray40 = new short[this.anInt2249];
			this.aByteArray24 = new byte[this.anInt2249];
			this.aByteArray30 = new byte[this.anInt2249];
		}
		if (local42) {
			this.aByteArray25 = new byte[this.anInt2239];
		}
		if (local36 > 0) {
			this.aClass256Array1 = new Class256[local36];
		}
		if (local38) {
			this.aByteArray29 = new byte[this.anInt2239];
		}
		this.anIntArray174 = new int[this.anInt2251];
		this.anIntArray170 = new int[this.anInt2251];
		if (local32 > 0) {
			this.aClass68Array1 = new Class68[local32];
		}
		this.aShortArray45 = new short[this.anInt2239];
		if (local34 > 0) {
			this.aClass106Array1 = new Class106[local34];
		}
		this.anIntArray172 = new int[this.anInt2251];
		local34 = 0;
		this.anInt2239 = 0;
		local36 = 0;
		this.anInt2249 = 0;
		local32 = 0;
		this.anInt2251 = 0;
		@Pc(618) int local618;
		@Pc(629) int local629;
		for (@Pc(386) int local386 = 0; local386 < arg1; local386++) {
			@Pc(393) short local393 = (short) (0x1 << local386);
			@Pc(397) Class81 local397 = arg0[local386];
			if (local397 != null) {
				@Pc(404) int local404;
				if (local397.aClass256Array1 != null) {
					for (local404 = 0; local404 < local397.aClass256Array1.length; local404++) {
						@Pc(411) Class256 local411 = local397.aClass256Array1[local404];
						this.aClass256Array1[local36++] = local411.method6640(this.anInt2239 + local411.anInt7426);
					}
				}
				for (local404 = 0; local404 < local397.anInt2239; local404++) {
					if (local38 && local397.aByteArray29 != null) {
						this.aByteArray29[this.anInt2239] = local397.aByteArray29[local404];
					}
					if (local40) {
						if (local397.aByteArray28 == null) {
							this.aByteArray28[this.anInt2239] = local397.aByte36;
						} else {
							this.aByteArray28[this.anInt2239] = local397.aByteArray28[local404];
						}
					}
					if (local42 && local397.aByteArray25 != null) {
						this.aByteArray25[this.anInt2239] = local397.aByteArray25[local404];
					}
					if (local46) {
						if (local397.aShortArray43 == null) {
							this.aShortArray43[this.anInt2239] = -1;
						} else {
							this.aShortArray43[this.anInt2239] = local397.aShortArray43[local404];
						}
					}
					if (local51) {
						if (local397.anIntArray173 == null) {
							this.anIntArray173[this.anInt2239] = -1;
						} else {
							this.anIntArray173[this.anInt2239] = local397.anIntArray173[local404];
						}
					}
					this.aShortArray39[this.anInt2239] = (short) this.method2167(local393, local397.aShortArray39[local404], local397);
					this.aShortArray45[this.anInt2239] = (short) this.method2167(local393, local397.aShortArray45[local404], local397);
					this.aShortArray41[this.anInt2239] = (short) this.method2167(local393, local397.aShortArray41[local404], local397);
					this.aShortArray46[this.anInt2239] = local393;
					this.aShortArray42[this.anInt2239] = local397.aShortArray42[local404];
					this.anInt2239++;
				}
				@Pc(605) int local605;
				if (local397.aClass68Array1 != null) {
					for (local605 = 0; local605 < local397.aClass68Array1.length; local605++) {
						local618 = this.method2167(local393, local397.aClass68Array1[local605].anInt1933, local397);
						local629 = this.method2167(local393, local397.aClass68Array1[local605].anInt1944, local397);
						@Pc(640) int local640 = this.method2167(local393, local397.aClass68Array1[local605].anInt1938, local397);
						this.aClass68Array1[local32] = local397.aClass68Array1[local605].method1840(local618, local640, local629);
						local32++;
					}
				}
				if (local397.aClass106Array1 != null) {
					for (local605 = 0; local605 < local397.aClass106Array1.length; local605++) {
						local618 = this.method2167(local393, local397.aClass106Array1[local605].anInt2810, local397);
						this.aClass106Array1[local34] = local397.aClass106Array1[local605].method2618(local618);
						local34++;
					}
				}
			}
		}
		@Pc(702) int local702 = 0;
		this.anInt2240 = this.anInt2251;
		for (@Pc(708) int local708 = 0; local708 < arg1; local708++) {
			@Pc(715) short local715 = (short) (0x1 << local708);
			@Pc(719) Class81 local719 = arg0[local708];
			if (local719 != null) {
				for (local618 = 0; local618 < local719.anInt2239; local618++) {
					if (local44) {
						this.aByteArray27[local702++] = (byte) (local719.aByteArray27 == null || local719.aByteArray27[local618] == -1 ? -1 : this.anInt2249 + local719.aByteArray27[local618]);
					}
				}
				for (local629 = 0; local629 < local719.anInt2249; local629++) {
					@Pc(772) byte local772 = this.aByteArray26[this.anInt2249] = local719.aByteArray26[local629];
					if (local772 == 0) {
						this.aShortArray48[this.anInt2249] = (short) this.method2167(local715, local719.aShortArray48[local629], local719);
						this.aShortArray40[this.anInt2249] = (short) this.method2167(local715, local719.aShortArray40[local629], local719);
						this.aShortArray47[this.anInt2249] = (short) this.method2167(local715, local719.aShortArray47[local629], local719);
					}
					if (local772 >= 1 && local772 <= 3) {
						this.aShortArray48[this.anInt2249] = local719.aShortArray48[local629];
						this.aShortArray40[this.anInt2249] = local719.aShortArray40[local629];
						this.aShortArray47[this.anInt2249] = local719.aShortArray47[local629];
						this.anIntArray166[this.anInt2249] = local719.anIntArray166[local629];
						this.anIntArray168[this.anInt2249] = local719.anIntArray168[local629];
						this.anIntArray171[this.anInt2249] = local719.anIntArray171[local629];
						this.aByteArray24[this.anInt2249] = local719.aByteArray24[local629];
						this.aByteArray30[this.anInt2249] = local719.aByteArray30[local629];
						this.anIntArray169[this.anInt2249] = local719.anIntArray169[local629];
					}
					if (local772 == 2) {
						this.anIntArray175[this.anInt2249] = local719.anIntArray175[local629];
						this.anIntArray167[this.anInt2249] = local719.anIntArray167[local629];
					}
					this.anInt2249++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	public void method2155() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2251; local3++) {
			this.anIntArray174[local3] <<= 0x0;
			this.anIntArray165[local3] <<= 0x0;
			this.anIntArray170[local3] <<= 0x0;
		}
		if (this.anInt2249 <= 0 || this.anIntArray166 == null) {
			return;
		}
		for (@Pc(55) int local55 = 0; local55 < this.anIntArray166.length; local55++) {
			this.anIntArray166[local55] <<= 0x0;
			this.anIntArray168[local55] <<= 0x0;
			if (this.aByteArray26[local55] != 1) {
				this.anIntArray171[local55] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ISS)V")
	public void method2156(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray43 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2239; local17++) {
			if (this.aShortArray43[local17] == arg0) {
				this.aShortArray43[local17] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(SBS)V")
	public void method2157(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2239; local7++) {
			if (arg0 == this.aShortArray42[local7]) {
				this.aShortArray42[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)V")
	public void method2158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2251; local15++) {
			this.anIntArray174[local15] += arg1;
			this.anIntArray165[local15] += arg2;
			this.anIntArray170[local15] += arg0;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BZ)[[I")
	public int[][] method2159(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt2251 : this.anInt2240;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray172[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < local18; local75++) {
			@Pc(85) int local85 = this.anIntArray172[local75];
			if (local85 >= 0) {
				local50[local85][local8[local85]++] = local75;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBBBSBSII)I")
	public int method2160(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray39[this.anInt2239] = (short) arg0;
		this.aShortArray45[this.anInt2239] = (short) arg6;
		this.aShortArray41[this.anInt2239] = (short) arg7;
		this.aByteArray29[this.anInt2239] = arg4;
		this.aByteArray27[this.anInt2239] = arg2;
		this.aShortArray42[this.anInt2239] = arg5;
		this.aByteArray25[this.anInt2239] = arg1;
		this.aShortArray43[this.anInt2239] = arg3;
		return this.anInt2239++;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZIII)I")
	public int method2161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2251; local7++) {
			if (arg2 == this.anIntArray174[local7] && this.anIntArray165[local7] == arg0 && this.anIntArray170[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray174[this.anInt2251] = arg2;
		this.anIntArray165[this.anInt2251] = arg0;
		this.anIntArray170[this.anInt2251] = arg1;
		this.anInt2240 = this.anInt2251 + 1;
		return this.anInt2251++;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([BI)V")
	private void method2162(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub17 local14 = new Class1_Sub17(arg0);
		@Pc(19) Class1_Sub17 local19 = new Class1_Sub17(arg0);
		@Pc(24) Class1_Sub17 local24 = new Class1_Sub17(arg0);
		@Pc(29) Class1_Sub17 local29 = new Class1_Sub17(arg0);
		@Pc(34) Class1_Sub17 local34 = new Class1_Sub17(arg0);
		local14.anInt4872 = arg0.length - 18;
		this.anInt2251 = local14.method4494();
		this.anInt2239 = local14.method4494();
		this.anInt2249 = local14.method4487();
		@Pc(59) int local59 = local14.method4487();
		@Pc(63) int local63 = local14.method4487();
		@Pc(67) int local67 = local14.method4487();
		@Pc(73) int local73 = local14.method4487();
		@Pc(77) int local77 = local14.method4487();
		@Pc(81) int local81 = local14.method4494();
		@Pc(85) int local85 = local14.method4494();
		@Pc(89) int local89 = local14.method4494();
		@Pc(93) int local93 = local14.method4494();
		@Pc(102) int local102 = this.anInt2251;
		@Pc(104) int local104 = local102;
		local102 += this.anInt2239;
		@Pc(111) int local111 = local102;
		if (local63 == 255) {
			local102 += this.anInt2239;
		}
		@Pc(123) int local123 = local102;
		if (local73 == 1) {
			local102 += this.anInt2239;
		}
		@Pc(135) int local135 = local102;
		if (local59 == 1) {
			local102 += this.anInt2239;
		}
		@Pc(145) int local145 = local102;
		if (local77 == 1) {
			local102 += this.anInt2251;
		}
		@Pc(155) int local155 = local102;
		if (local67 == 1) {
			local102 += this.anInt2239;
		}
		@Pc(167) int local167 = local102;
		local102 += local93;
		@Pc(173) int local173 = local102;
		local102 += this.anInt2239 * 2;
		@Pc(182) int local182 = local102;
		local102 += this.anInt2249 * 6;
		@Pc(191) int local191 = local102;
		local102 += local81;
		@Pc(197) int local197 = local102;
		local102 += local85;
		if (local77 == 1) {
			this.anIntArray172 = new int[this.anInt2251];
		}
		local14.anInt4872 = 0;
		this.anIntArray165 = new int[this.anInt2251];
		if (local73 == 1) {
			this.anIntArray173 = new int[this.anInt2239];
		}
		if (local59 == 1) {
			this.aShortArray43 = new short[this.anInt2239];
			this.aByteArray27 = new byte[this.anInt2239];
			this.aByteArray29 = new byte[this.anInt2239];
		}
		this.aShortArray39 = new short[this.anInt2239];
		this.anIntArray174 = new int[this.anInt2251];
		if (local63 == 255) {
			this.aByteArray28 = new byte[this.anInt2239];
		} else {
			this.aByte36 = (byte) local63;
		}
		if (local67 == 1) {
			this.aByteArray25 = new byte[this.anInt2239];
		}
		this.anIntArray170 = new int[this.anInt2251];
		this.aShortArray42 = new short[this.anInt2239];
		this.aShortArray41 = new short[this.anInt2239];
		this.aShortArray45 = new short[this.anInt2239];
		if (this.anInt2249 > 0) {
			this.aShortArray48 = new short[this.anInt2249];
			this.aByteArray26 = new byte[this.anInt2249];
			this.aShortArray47 = new short[this.anInt2249];
			this.aShortArray40 = new short[this.anInt2249];
		}
		local19.anInt4872 = local191;
		local24.anInt4872 = local197;
		local29.anInt4872 = local102;
		local34.anInt4872 = local145;
		@Pc(345) int local345 = 0;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(359) int local359;
		@Pc(361) int local361;
		for (@Pc(351) int local351 = 0; local351 < this.anInt2251; local351++) {
			local359 = local14.method4487();
			local361 = 0;
			if ((local359 & 0x1) != 0) {
				local361 = local19.method4477();
			}
			@Pc(371) int local371 = 0;
			if ((local359 & 0x2) != 0) {
				local371 = local24.method4477();
			}
			@Pc(381) int local381 = 0;
			if ((local359 & 0x4) != 0) {
				local381 = local29.method4477();
			}
			this.anIntArray174[local351] = local345 + local361;
			this.anIntArray165[local351] = local371 + local347;
			this.anIntArray170[local351] = local349 + local381;
			local345 = this.anIntArray174[local351];
			local347 = this.anIntArray165[local351];
			local349 = this.anIntArray170[local351];
			if (local77 == 1) {
				this.anIntArray172[local351] = local34.method4487();
			}
		}
		local14.anInt4872 = local173;
		local19.anInt4872 = local135;
		local24.anInt4872 = local111;
		local29.anInt4872 = local155;
		local34.anInt4872 = local123;
		for (local359 = 0; local359 < this.anInt2239; local359++) {
			this.aShortArray42[local359] = (short) local14.method4494();
			if (local59 == 1) {
				local361 = local19.method4487();
				if ((local361 & 0x1) == 1) {
					local7 = true;
					this.aByteArray29[local359] = 1;
				} else {
					this.aByteArray29[local359] = 0;
				}
				if ((local361 & 0x2) == 2) {
					this.aByteArray27[local359] = (byte) (local361 >> 2);
					this.aShortArray43[local359] = this.aShortArray42[local359];
					this.aShortArray42[local359] = 127;
					if (this.aShortArray43[local359] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray27[local359] = -1;
					this.aShortArray43[local359] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray28[local359] = local24.method4482();
			}
			if (local67 == 1) {
				this.aByteArray25[local359] = local29.method4482();
			}
			if (local73 == 1) {
				this.anIntArray173[local359] = local34.method4487();
			}
		}
		local14.anInt4872 = local167;
		this.anInt2240 = -1;
		local19.anInt4872 = local104;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(617) int local617;
		for (@Pc(611) int local611 = 0; local611 < this.anInt2239; local611++) {
			local617 = local19.method4487();
			if (local617 == 1) {
				local603 = (short) (local14.method4477() + local609);
				local605 = (short) (local14.method4477() + local603);
				local607 = (short) (local14.method4477() + local605);
				local609 = local607;
				this.aShortArray39[local611] = local603;
				this.aShortArray45[local611] = local605;
				this.aShortArray41[local611] = local607;
				if (local603 > this.anInt2240) {
					this.anInt2240 = local603;
				}
				if (this.anInt2240 < local605) {
					this.anInt2240 = local605;
				}
				if (local607 > this.anInt2240) {
					this.anInt2240 = local607;
				}
			}
			if (local617 == 2) {
				local605 = local607;
				local607 = (short) (local609 + local14.method4477());
				local609 = local607;
				this.aShortArray39[local611] = local603;
				this.aShortArray45[local611] = local605;
				this.aShortArray41[local611] = local607;
				if (local607 > this.anInt2240) {
					this.anInt2240 = local607;
				}
			}
			if (local617 == 3) {
				local603 = local607;
				local607 = (short) (local609 + local14.method4477());
				local609 = local607;
				this.aShortArray39[local611] = local603;
				this.aShortArray45[local611] = local605;
				this.aShortArray41[local611] = local607;
				if (this.anInt2240 < local607) {
					this.anInt2240 = local607;
				}
			}
			if (local617 == 4) {
				@Pc(766) short local766 = local603;
				local603 = local605;
				local607 = (short) (local14.method4477() + local609);
				local605 = local766;
				local609 = local607;
				this.aShortArray39[local611] = local603;
				this.aShortArray45[local611] = local766;
				this.aShortArray41[local611] = local607;
				if (this.anInt2240 < local607) {
					this.anInt2240 = local607;
				}
			}
		}
		local14.anInt4872 = local182;
		this.anInt2240++;
		for (local617 = 0; local617 < this.anInt2249; local617++) {
			this.aByteArray26[local617] = 0;
			this.aShortArray48[local617] = (short) local14.method4494();
			this.aShortArray40[local617] = (short) local14.method4494();
			this.aShortArray47[local617] = (short) local14.method4494();
		}
		if (this.aByteArray27 != null) {
			@Pc(862) boolean local862 = false;
			for (@Pc(864) int local864 = 0; local864 < this.anInt2239; local864++) {
				@Pc(873) int local873 = this.aByteArray27[local864] & 0xFF;
				if (local873 != 255) {
					if (this.aShortArray39[local864] == (this.aShortArray48[local873] & 0xFFFF) && (this.aShortArray40[local873] & 0xFFFF) == this.aShortArray45[local864] && (this.aShortArray47[local873] & 0xFFFF) == this.aShortArray41[local864]) {
						this.aByteArray27[local864] = -1;
					} else {
						local862 = true;
					}
				}
			}
			if (!local862) {
				this.aByteArray27 = null;
			}
		}
		if (!local9) {
			this.aShortArray43 = null;
		}
		if (!local7) {
			this.aByteArray29 = null;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(SSBSSIBSBS)B")
	public byte method2163() {
		if (this.anInt2249 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray26[this.anInt2249] = 3;
		this.aShortArray48[this.anInt2249] = 0;
		this.aShortArray40[this.anInt2249] = 32767;
		this.aShortArray47[this.anInt2249] = 0;
		this.anIntArray166[this.anInt2249] = 1024;
		this.anIntArray168[this.anInt2249] = 1024;
		this.anIntArray171[this.anInt2249] = 1024;
		this.aByteArray24[this.anInt2249] = 0;
		this.aByteArray30[this.anInt2249] = 0;
		this.anIntArray169[this.anInt2249] = 0;
		return (byte) this.anInt2249++;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "([BI)V")
	private void method2164(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub17 local10 = new Class1_Sub17(arg0);
		@Pc(15) Class1_Sub17 local15 = new Class1_Sub17(arg0);
		@Pc(20) Class1_Sub17 local20 = new Class1_Sub17(arg0);
		@Pc(25) Class1_Sub17 local25 = new Class1_Sub17(arg0);
		@Pc(30) Class1_Sub17 local30 = new Class1_Sub17(arg0);
		@Pc(35) Class1_Sub17 local35 = new Class1_Sub17(arg0);
		@Pc(40) Class1_Sub17 local40 = new Class1_Sub17(arg0);
		local10.anInt4872 = arg0.length - 23;
		this.anInt2251 = local10.method4494();
		this.anInt2239 = local10.method4494();
		this.anInt2249 = local10.method4487();
		@Pc(65) int local65 = local10.method4487();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(95) boolean local95 = (local65 & 0x2) == 2;
		@Pc(106) boolean local106 = (local65 & 0x4) == 4;
		@Pc(115) boolean local115 = (local65 & 0x8) == 8;
		if (local115) {
			local10.anInt4872 -= 7;
			this.anInt2236 = local10.method4487();
			local10.anInt4872 += 6;
		}
		@Pc(138) int local138 = local10.method4487();
		@Pc(142) int local142 = local10.method4487();
		@Pc(146) int local146 = local10.method4487();
		@Pc(150) int local150 = local10.method4487();
		@Pc(154) int local154 = local10.method4487();
		@Pc(158) int local158 = local10.method4494();
		@Pc(162) int local162 = local10.method4494();
		@Pc(166) int local166 = local10.method4494();
		@Pc(170) int local170 = local10.method4494();
		@Pc(174) int local174 = local10.method4494();
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(180) int local180 = 0;
		@Pc(196) int local196;
		if (this.anInt2249 > 0) {
			local10.anInt4872 = 0;
			this.aByteArray26 = new byte[this.anInt2249];
			for (local196 = 0; local196 < this.anInt2249; local196++) {
				@Pc(207) byte local207 = this.aByteArray26[local196] = local10.method4482();
				if (local207 == 2) {
					local180++;
				}
				if (local207 >= 1 && local207 <= 3) {
					local178++;
				}
				if (local207 == 0) {
					local176++;
				}
			}
		}
		local196 = this.anInt2249;
		@Pc(242) int local242 = local196;
		local196 += this.anInt2251;
		@Pc(249) int local249 = local196;
		if (local76) {
			local196 += this.anInt2239;
		}
		@Pc(258) int local258 = local196;
		local196 += this.anInt2239;
		@Pc(265) int local265 = local196;
		if (local138 == 255) {
			local196 += this.anInt2239;
		}
		@Pc(277) int local277 = local196;
		if (local146 == 1) {
			local196 += this.anInt2239;
		}
		@Pc(287) int local287 = local196;
		if (local154 == 1) {
			local196 += this.anInt2251;
		}
		@Pc(299) int local299 = local196;
		if (local142 == 1) {
			local196 += this.anInt2239;
		}
		@Pc(311) int local311 = local196;
		local196 += local170;
		@Pc(317) int local317 = local196;
		if (local150 == 1) {
			local196 += this.anInt2239 * 2;
		}
		@Pc(329) int local329 = local196;
		local196 += local174;
		@Pc(335) int local335 = local196;
		local196 += this.anInt2239 * 2;
		@Pc(344) int local344 = local196;
		local196 += local158;
		@Pc(350) int local350 = local196;
		local196 += local162;
		@Pc(356) int local356 = local196;
		local196 += local166;
		@Pc(362) int local362 = local196;
		local196 += local176 * 6;
		@Pc(370) int local370 = local196;
		local196 += local178 * 6;
		@Pc(384) int local384 = this.anInt2236 >= 14 ? 7 : 6;
		@Pc(386) int local386 = local196;
		local196 += local178 * local384;
		@Pc(394) int local394 = local196;
		local196 += local178;
		@Pc(400) int local400 = local196;
		local196 += local178;
		@Pc(406) int local406 = local196;
		local196 += local178 + local180 * 2;
		this.aShortArray39 = new short[this.anInt2239];
		this.aShortArray41 = new short[this.anInt2239];
		if (local142 == 1) {
			this.aByteArray25 = new byte[this.anInt2239];
		}
		local10.anInt4872 = local242;
		this.anIntArray170 = new int[this.anInt2251];
		if (this.anInt2249 > 0) {
			this.aShortArray48 = new short[this.anInt2249];
			if (local180 > 0) {
				this.anIntArray175 = new int[local180];
				this.anIntArray167 = new int[local180];
			}
			if (local178 > 0) {
				this.anIntArray166 = new int[local178];
				this.anIntArray169 = new int[local178];
				this.aByteArray24 = new byte[local178];
				this.aByteArray30 = new byte[local178];
				this.anIntArray171 = new int[local178];
				this.anIntArray168 = new int[local178];
			}
			this.aShortArray40 = new short[this.anInt2249];
			this.aShortArray47 = new short[this.anInt2249];
		}
		this.aShortArray45 = new short[this.anInt2239];
		if (local76) {
			this.aByteArray29 = new byte[this.anInt2239];
		}
		if (local138 == 255) {
			this.aByteArray28 = new byte[this.anInt2239];
		} else {
			this.aByte36 = (byte) local138;
		}
		this.aShortArray42 = new short[this.anInt2239];
		if (local154 == 1) {
			this.anIntArray172 = new int[this.anInt2251];
		}
		this.anIntArray174 = new int[this.anInt2251];
		this.anIntArray165 = new int[this.anInt2251];
		if (local146 == 1) {
			this.anIntArray173 = new int[this.anInt2239];
		}
		if (local150 == 1) {
			this.aShortArray43 = new short[this.anInt2239];
		}
		if (local150 == 1 && this.anInt2249 > 0) {
			this.aByteArray27 = new byte[this.anInt2239];
		}
		local15.anInt4872 = local344;
		local20.anInt4872 = local350;
		local25.anInt4872 = local356;
		local30.anInt4872 = local287;
		@Pc(593) int local593 = 0;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(605) int local605;
		for (@Pc(599) int local599 = 0; local599 < this.anInt2251; local599++) {
			local605 = local10.method4487();
			@Pc(607) int local607 = 0;
			if ((local605 & 0x1) != 0) {
				local607 = local15.method4477();
			}
			@Pc(620) int local620 = 0;
			if ((local605 & 0x2) != 0) {
				local620 = local20.method4477();
			}
			@Pc(633) int local633 = 0;
			if ((local605 & 0x4) != 0) {
				local633 = local25.method4477();
			}
			this.anIntArray174[local599] = local607 + local593;
			this.anIntArray165[local599] = local595 + local620;
			this.anIntArray170[local599] = local633 + local597;
			local595 = this.anIntArray165[local599];
			local593 = this.anIntArray174[local599];
			local597 = this.anIntArray170[local599];
			if (local154 == 1) {
				this.anIntArray172[local599] = local30.method4487();
			}
		}
		local10.anInt4872 = local335;
		local15.anInt4872 = local249;
		local20.anInt4872 = local265;
		local25.anInt4872 = local299;
		local30.anInt4872 = local277;
		local35.anInt4872 = local317;
		local40.anInt4872 = local329;
		for (local605 = 0; local605 < this.anInt2239; local605++) {
			this.aShortArray42[local605] = (short) local10.method4494();
			if (local76) {
				this.aByteArray29[local605] = local15.method4482();
			}
			if (local138 == 255) {
				this.aByteArray28[local605] = local20.method4482();
			}
			if (local142 == 1) {
				this.aByteArray25[local605] = local25.method4482();
			}
			if (local146 == 1) {
				this.anIntArray173[local605] = local30.method4487();
			}
			if (local150 == 1) {
				this.aShortArray43[local605] = (short) (local35.method4494() - 1);
			}
			if (this.aByteArray27 != null) {
				if (this.aShortArray43[local605] == -1) {
					this.aByteArray27[local605] = -1;
				} else {
					this.aByteArray27[local605] = (byte) (local40.method4487() - 1);
				}
			}
		}
		this.anInt2240 = -1;
		local10.anInt4872 = local311;
		local15.anInt4872 = local258;
		@Pc(830) short local830 = 0;
		@Pc(832) short local832 = 0;
		@Pc(834) short local834 = 0;
		@Pc(836) short local836 = 0;
		@Pc(844) int local844;
		for (@Pc(838) int local838 = 0; local838 < this.anInt2239; local838++) {
			local844 = local15.method4487();
			if (local844 == 1) {
				local830 = (short) (local10.method4477() + local836);
				local832 = (short) (local830 + local10.method4477());
				local834 = (short) (local10.method4477() + local832);
				this.aShortArray39[local838] = local830;
				local836 = local834;
				this.aShortArray45[local838] = local832;
				this.aShortArray41[local838] = local834;
				if (this.anInt2240 < local830) {
					this.anInt2240 = local830;
				}
				if (this.anInt2240 < local832) {
					this.anInt2240 = local832;
				}
				if (local834 > this.anInt2240) {
					this.anInt2240 = local834;
				}
			}
			if (local844 == 2) {
				local832 = local834;
				local834 = (short) (local10.method4477() + local836);
				local836 = local834;
				this.aShortArray39[local838] = local830;
				this.aShortArray45[local838] = local832;
				this.aShortArray41[local838] = local834;
				if (this.anInt2240 < local834) {
					this.anInt2240 = local834;
				}
			}
			if (local844 == 3) {
				local830 = local834;
				local834 = (short) (local836 + local10.method4477());
				this.aShortArray39[local838] = local830;
				local836 = local834;
				this.aShortArray45[local838] = local832;
				this.aShortArray41[local838] = local834;
				if (local834 > this.anInt2240) {
					this.anInt2240 = local834;
				}
			}
			if (local844 == 4) {
				@Pc(993) short local993 = local830;
				local830 = local832;
				local832 = local993;
				local834 = (short) (local836 + local10.method4477());
				local836 = local834;
				this.aShortArray39[local838] = local830;
				this.aShortArray45[local838] = local993;
				this.aShortArray41[local838] = local834;
				if (local834 > this.anInt2240) {
					this.anInt2240 = local834;
				}
			}
		}
		this.anInt2240++;
		local10.anInt4872 = local362;
		local15.anInt4872 = local370;
		local20.anInt4872 = local386;
		local25.anInt4872 = local394;
		local30.anInt4872 = local400;
		local35.anInt4872 = local406;
		@Pc(1072) int local1072;
		for (local844 = 0; local844 < this.anInt2249; local844++) {
			local1072 = this.aByteArray26[local844] & 0xFF;
			if (local1072 == 0) {
				this.aShortArray48[local844] = (short) local10.method4494();
				this.aShortArray40[local844] = (short) local10.method4494();
				this.aShortArray47[local844] = (short) local10.method4494();
			}
			if (local1072 == 1) {
				this.aShortArray48[local844] = (short) local15.method4494();
				this.aShortArray40[local844] = (short) local15.method4494();
				this.aShortArray47[local844] = (short) local15.method4494();
				this.anIntArray166[local844] = local20.method4494();
				if (this.anInt2236 >= 14) {
					this.anIntArray168[local844] = local20.method4486();
				} else {
					this.anIntArray168[local844] = local20.method4494();
				}
				this.anIntArray171[local844] = local20.method4494();
				this.aByteArray24[local844] = local25.method4482();
				this.aByteArray30[local844] = local30.method4482();
				this.anIntArray169[local844] = local35.method4482();
			}
			if (local1072 == 2) {
				this.aShortArray48[local844] = (short) local15.method4494();
				this.aShortArray40[local844] = (short) local15.method4494();
				this.aShortArray47[local844] = (short) local15.method4494();
				this.anIntArray166[local844] = local20.method4494();
				if (this.anInt2236 >= 14) {
					this.anIntArray168[local844] = local20.method4486();
				} else {
					this.anIntArray168[local844] = local20.method4494();
				}
				this.anIntArray171[local844] = local20.method4494();
				this.aByteArray24[local844] = local25.method4482();
				this.aByteArray30[local844] = local30.method4482();
				this.anIntArray169[local844] = local35.method4482();
				this.anIntArray175[local844] = local35.method4482();
				this.anIntArray167[local844] = local35.method4482();
			}
			if (local1072 == 3) {
				this.aShortArray48[local844] = (short) local15.method4494();
				this.aShortArray40[local844] = (short) local15.method4494();
				this.aShortArray47[local844] = (short) local15.method4494();
				this.anIntArray166[local844] = local20.method4494();
				if (this.anInt2236 < 14) {
					this.anIntArray168[local844] = local20.method4494();
				} else {
					this.anIntArray168[local844] = local20.method4486();
				}
				this.anIntArray171[local844] = local20.method4494();
				this.aByteArray24[local844] = local25.method4482();
				this.aByteArray30[local844] = local30.method4482();
				this.anIntArray169[local844] = local35.method4482();
			}
		}
		local10.anInt4872 = local196;
		@Pc(1388) int local1388;
		@Pc(1394) int local1394;
		@Pc(1398) int local1398;
		@Pc(1462) int local1462;
		if (local95) {
			local1072 = local10.method4487();
			if (local1072 > 0) {
				this.aClass68Array1 = new Class68[local1072];
				for (local1388 = 0; local1388 < local1072; local1388++) {
					local1394 = local10.method4494();
					local1398 = local10.method4494();
					@Pc(1404) byte local1404;
					if (local138 == 255) {
						local1404 = this.aByteArray28[local1398];
					} else {
						local1404 = (byte) local138;
					}
					this.aClass68Array1[local1388] = new Class68(local1394, this.aShortArray39[local1398], this.aShortArray45[local1398], this.aShortArray41[local1398], local1404);
				}
			}
			local1388 = local10.method4487();
			if (local1388 > 0) {
				this.aClass106Array1 = new Class106[local1388];
				for (local1394 = 0; local1394 < local1388; local1394++) {
					local1398 = local10.method4494();
					local1462 = local10.method4494();
					this.aClass106Array1[local1394] = new Class106(local1398, local1462);
				}
			}
		}
		if (!local106) {
			return;
		}
		local1072 = local10.method4487();
		if (local1072 <= 0) {
			return;
		}
		this.aClass256Array1 = new Class256[local1072];
		for (local1388 = 0; local1388 < local1072; local1388++) {
			local1394 = local10.method4494();
			local1398 = local10.method4494();
			local1462 = local10.method4487();
			@Pc(1511) byte local1511 = local10.method4482();
			this.aClass256Array1[local1388] = new Class256(local1394, local1398, local1462, local1511);
		}
		return;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)[[I")
	public int[][] method2165() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2239; local12++) {
			@Pc(19) int local19 = this.anIntArray173[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt2239; local75++) {
			@Pc(82) int local82 = this.anIntArray173[local75];
			if (local82 >= 0) {
				local54[local82][local8[local82]++] = local75;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)[[I")
	public int[][] method2166() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.aClass256Array1.length; local17++) {
			@Pc(25) int local25 = this.aClass256Array1[local17].anInt7422;
			if (local25 >= 0) {
				if (local10 < local25) {
					local10 = local25;
				}
				@Pc(40) int local40 = local8[local25]++;
			}
		}
		@Pc(58) int[][] local58 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local58[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.aClass256Array1.length; local83++) {
			@Pc(91) int local91 = this.aClass256Array1[local83].anInt7422;
			if (local91 >= 0) {
				local58[local91][local8[local91]++] = local83;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(SILclient!ei;I)I")
	private int method2167(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2) {
		@Pc(10) int local10 = arg2.anIntArray174[arg1];
		@Pc(30) int local30 = arg2.anIntArray165[arg1];
		@Pc(35) int local35 = arg2.anIntArray170[arg1];
		for (@Pc(37) int local37 = 0; local37 < this.anInt2251; local37++) {
			if (this.anIntArray174[local37] == local10 && local30 == this.anIntArray165[local37] && this.anIntArray170[local37] == local35) {
				this.aShortArray44[local37] |= arg0;
				return local37;
			}
		}
		this.anIntArray174[this.anInt2251] = local10;
		this.anIntArray165[this.anInt2251] = local30;
		this.anIntArray170[this.anInt2251] = local35;
		this.aShortArray44[this.anInt2251] = arg0;
		this.anIntArray172[this.anInt2251] = arg2.anIntArray172 == null ? -1 : arg2.anIntArray172[arg1];
		return this.anInt2251++;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBII)V")
	public void method2168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(31) int local31;
		if (arg1 != 0) {
			local7 = Class200_Sub1.lb[arg1];
			local11 = Class200_Sub1.anIntArray576[arg1];
			for (local13 = 0; local13 < this.anInt2251; local13++) {
				local31 = this.anIntArray165[local13] * local7 + local11 * this.anIntArray174[local13] >> 15;
				this.anIntArray165[local13] = local11 * this.anIntArray165[local13] - this.anIntArray174[local13] * local7 >> 15;
				this.anIntArray174[local13] = local31;
			}
		}
		if (arg2 != 0) {
			local7 = Class200_Sub1.lb[arg2];
			local11 = Class200_Sub1.anIntArray576[arg2];
			for (local13 = 0; local13 < this.anInt2251; local13++) {
				local31 = this.anIntArray165[local13] * local11 - local7 * this.anIntArray170[local13] >> 15;
				this.anIntArray170[local13] = local11 * this.anIntArray170[local13] + local7 * this.anIntArray165[local13] >> 15;
				this.anIntArray165[local13] = local31;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local7 = Class200_Sub1.lb[arg0];
		local11 = Class200_Sub1.anIntArray576[arg0];
		for (local13 = 0; local13 < this.anInt2251; local13++) {
			local31 = this.anIntArray174[local13] * local11 + this.anIntArray170[local13] * local7 >> 15;
			this.anIntArray170[local13] = this.anIntArray170[local13] * local11 - local7 * this.anIntArray174[local13] >> 15;
			this.anIntArray174[local13] = local31;
		}
	}
}
