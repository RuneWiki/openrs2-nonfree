import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class229 {

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "[I")
	public int[] anIntArray392;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "[I")
	public int[] anIntArray393;

	@OriginalMember(owner = "client!ln", name = "Y", descriptor = "[I")
	public int[] anIntArray394;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!ln", name = "Z", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "[Lclient!uc;")
	public Class363[] aClass363Array4;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "[I")
	public int[] anIntArray395;

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!ln", name = "N", descriptor = "[I")
	public int[] anIntArray397;

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "[Lclient!vs;")
	public Class390[] aClass390Array1;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "[B")
	public byte[] aByteArray78;

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "[I")
	public int[] anIntArray398;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "[Lclient!uda;")
	public Class364[] aClass364Array4;

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "[I")
	public int[] anIntArray399;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "[I")
	public int[] anIntArray400;

	@OriginalMember(owner = "client!ln", name = "X", descriptor = "[I")
	public int[] anIntArray401;

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!ln", name = "W", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!ln", name = "M", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "[I")
	public int[] anIntArray402;

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
	public int anInt5931 = 0;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "I")
	public int anInt5932 = 0;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	public int anInt5933 = 12;

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "B")
	public byte aByte79 = 0;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
	public int anInt5946 = 0;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "I")
	public int anInt5934 = 0;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	private Class229() {
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "([B)V")
	public Class229(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5313(arg0);
		} else {
			this.method5317(0, arg0);
		}
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(III)V")
	public Class229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray396 = new int[arg0];
		this.aShortArray98 = new short[arg1];
		this.aByteArray78 = new byte[arg1];
		if (arg2 > 0) {
			this.aShortArray94 = new short[arg2];
			this.anIntArray400 = new int[arg2];
			this.aShortArray96 = new short[arg2];
			this.anIntArray399 = new int[arg2];
			this.anIntArray401 = new int[arg2];
			this.anIntArray402 = new int[arg2];
			this.anIntArray393 = new int[arg2];
			this.aByteArray81 = new byte[arg2];
			this.aShortArray101 = new short[arg2];
			this.aByteArray82 = new byte[arg2];
			this.anIntArray398 = new int[arg2];
			this.aByteArray83 = new byte[arg2];
		}
		this.aShortArray100 = new short[arg1];
		this.anIntArray394 = new int[arg0];
		this.aByteArray79 = new byte[arg1];
		this.aShortArray95 = new short[arg1];
		this.aShortArray93 = new short[arg1];
		this.anIntArray392 = new int[arg0];
		this.aShortArray102 = new short[arg1];
		this.anIntArray395 = new int[arg1];
		this.anIntArray397 = new int[arg0];
		this.aByteArray80 = new byte[arg1];
		this.aByteArray77 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "([Lclient!ln;I)V")
	public Class229(@OriginalArg(0) Class229[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5931 = 0;
		this.anInt5946 = 0;
		this.anInt5934 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte79 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class229 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5946 += local59.anInt5946;
				this.anInt5931 += local59.anInt5931;
				this.anInt5934 += local59.anInt5934;
				if (local59.aClass390Array1 != null) {
					local36 += local59.aClass390Array1.length;
				}
				if (local59.aClass363Array4 != null) {
					local34 += local59.aClass363Array4.length;
				}
				local38 |= local59.aByteArray79 != null;
				if (local59.aClass364Array4 != null) {
					local32 += local59.aClass364Array4.length;
				}
				local46 |= local59.aShortArray93 != null;
				local44 |= local59.aByteArray77 != null;
				local42 |= local59.aByteArray80 != null;
				local51 |= local59.anIntArray395 != null;
				if (local59.aByteArray78 == null) {
					if (this.aByte79 == -1) {
						this.aByte79 = local59.aByte79;
					}
					if (this.aByte79 != local59.aByte79) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		if (local34 > 0) {
			this.aClass363Array4 = new Class363[local34];
		}
		this.aShortArray99 = new short[this.anInt5931];
		if (local46) {
			this.aShortArray93 = new short[this.anInt5934];
		}
		this.aShortArray98 = new short[this.anInt5934];
		if (this.anInt5946 > 0) {
			this.aShortArray94 = new short[this.anInt5946];
			this.anIntArray402 = new int[this.anInt5946];
			this.anIntArray401 = new int[this.anInt5946];
			this.anIntArray399 = new int[this.anInt5946];
			this.anIntArray393 = new int[this.anInt5946];
			this.anIntArray400 = new int[this.anInt5946];
			this.aByteArray82 = new byte[this.anInt5946];
			this.aByteArray81 = new byte[this.anInt5946];
			this.aShortArray96 = new short[this.anInt5946];
			this.aByteArray83 = new byte[this.anInt5946];
			this.anIntArray398 = new int[this.anInt5946];
			this.aShortArray101 = new short[this.anInt5946];
		}
		if (local40) {
			this.aByteArray78 = new byte[this.anInt5934];
		}
		if (local51) {
			this.anIntArray395 = new int[this.anInt5934];
		}
		this.aShortArray100 = new short[this.anInt5934];
		if (local38) {
			this.aByteArray79 = new byte[this.anInt5934];
		}
		if (local44) {
			this.aByteArray77 = new byte[this.anInt5934];
		}
		this.aShortArray95 = new short[this.anInt5934];
		this.aShortArray97 = new short[this.anInt5934];
		if (local32 > 0) {
			this.aClass364Array4 = new Class364[local32];
		}
		this.anIntArray396 = new int[this.anInt5931];
		this.aShortArray102 = new short[this.anInt5934];
		if (local36 > 0) {
			this.aClass390Array1 = new Class390[local36];
		}
		if (local42) {
			this.aByteArray80 = new byte[this.anInt5934];
		}
		this.anIntArray394 = new int[this.anInt5931];
		this.anIntArray397 = new int[this.anInt5931];
		this.anIntArray392 = new int[this.anInt5931];
		local34 = 0;
		local36 = 0;
		this.anInt5946 = 0;
		this.anInt5931 = 0;
		local32 = 0;
		this.anInt5934 = 0;
		@Pc(686) int local686;
		@Pc(697) int local697;
		for (@Pc(416) int local416 = 0; local416 < arg1; local416++) {
			@Pc(423) short local423 = (short) (0x1 << local416);
			@Pc(427) Class229 local427 = arg0[local416];
			if (local427 != null) {
				@Pc(436) int local436;
				if (local427.aClass390Array1 != null) {
					for (local436 = 0; local436 < local427.aClass390Array1.length; local436++) {
						@Pc(443) Class390 local443 = local427.aClass390Array1[local436];
						this.aClass390Array1[local36++] = local443.method9324(this.anInt5934 + local443.anInt10646);
					}
				}
				for (local436 = 0; local436 < local427.anInt5934; local436++) {
					if (local38 && local427.aByteArray79 != null) {
						this.aByteArray79[this.anInt5934] = local427.aByteArray79[local436];
					}
					if (local40) {
						if (local427.aByteArray78 == null) {
							this.aByteArray78[this.anInt5934] = local427.aByte79;
						} else {
							this.aByteArray78[this.anInt5934] = local427.aByteArray78[local436];
						}
					}
					if (local42 && local427.aByteArray80 != null) {
						this.aByteArray80[this.anInt5934] = local427.aByteArray80[local436];
					}
					if (local46) {
						if (local427.aShortArray93 == null) {
							this.aShortArray93[this.anInt5934] = -1;
						} else {
							this.aShortArray93[this.anInt5934] = local427.aShortArray93[local436];
						}
					}
					if (local51) {
						if (local427.anIntArray395 == null) {
							this.anIntArray395[this.anInt5934] = -1;
						} else {
							this.anIntArray395[this.anInt5934] = local427.anIntArray395[local436];
						}
					}
					this.aShortArray102[this.anInt5934] = (short) this.method5321(local427, local423, local427.aShortArray102[local436], -100);
					this.aShortArray95[this.anInt5934] = (short) this.method5321(local427, local423, local427.aShortArray95[local436], -118);
					this.aShortArray98[this.anInt5934] = (short) this.method5321(local427, local423, local427.aShortArray98[local436], -126);
					this.aShortArray97[this.anInt5934] = local423;
					this.aShortArray100[this.anInt5934] = local427.aShortArray100[local436];
					this.anInt5934++;
				}
				@Pc(673) int local673;
				if (local427.aClass364Array4 != null) {
					for (local673 = 0; local673 < local427.aClass364Array4.length; local673++) {
						local686 = this.method5321(local427, local423, local427.aClass364Array4[local673].anInt9816, -112);
						local697 = this.method5321(local427, local423, local427.aClass364Array4[local673].anInt9818, -127);
						@Pc(708) int local708 = this.method5321(local427, local423, local427.aClass364Array4[local673].anInt9822, -98);
						this.aClass364Array4[local32] = local427.aClass364Array4[local673].method8673(local697, local708, local686);
						local32++;
					}
				}
				if (local427.aClass363Array4 != null) {
					for (local673 = 0; local673 < local427.aClass363Array4.length; local673++) {
						local686 = this.method5321(local427, local423, local427.aClass363Array4[local673].anInt9789, -85);
						this.aClass363Array4[local34] = local427.aClass363Array4[local673].method8644(local686);
						local34++;
					}
				}
			}
		}
		this.anInt5932 = this.anInt5931;
		@Pc(790) int local790 = 0;
		for (@Pc(792) int local792 = 0; local792 < arg1; local792++) {
			@Pc(801) short local801 = (short) (0x1 << local792);
			@Pc(805) Class229 local805 = arg0[local792];
			if (local805 != null) {
				for (local686 = 0; local686 < local805.anInt5934; local686++) {
					if (local44) {
						this.aByteArray77[local790++] = (byte) (local805.aByteArray77 == null || local805.aByteArray77[local686] == -1 ? -1 : this.anInt5946 + local805.aByteArray77[local686]);
					}
				}
				for (local697 = 0; local697 < local805.anInt5946; local697++) {
					@Pc(867) byte local867 = this.aByteArray82[this.anInt5946] = local805.aByteArray82[local697];
					if (local867 == 0) {
						this.aShortArray94[this.anInt5946] = (short) this.method5321(local805, local801, local805.aShortArray94[local697], -95);
						this.aShortArray96[this.anInt5946] = (short) this.method5321(local805, local801, local805.aShortArray96[local697], -120);
						this.aShortArray101[this.anInt5946] = (short) this.method5321(local805, local801, local805.aShortArray101[local697], -105);
					}
					if (local867 >= 1 && local867 <= 3) {
						this.aShortArray94[this.anInt5946] = local805.aShortArray94[local697];
						this.aShortArray96[this.anInt5946] = local805.aShortArray96[local697];
						this.aShortArray101[this.anInt5946] = local805.aShortArray101[local697];
						this.anIntArray399[this.anInt5946] = local805.anIntArray399[local697];
						this.anIntArray402[this.anInt5946] = local805.anIntArray402[local697];
						this.anIntArray398[this.anInt5946] = local805.anIntArray398[local697];
						this.aByteArray81[this.anInt5946] = local805.aByteArray81[local697];
						this.aByteArray83[this.anInt5946] = local805.aByteArray83[local697];
						this.anIntArray400[this.anInt5946] = local805.anIntArray400[local697];
					}
					if (local867 == 2) {
						this.anIntArray401[this.anInt5946] = local805.anIntArray401[local697];
						this.anIntArray393[this.anInt5946] = local805.anIntArray393[local697];
					}
					this.anInt5946++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)[[I")
	public int[][] method5306() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass390Array1.length; local12++) {
			@Pc(22) int local22 = this.aClass390Array1[local12].anInt10645;
			if (local22 >= 0) {
				if (local22 > local10) {
					local10 = local22;
				}
				@Pc(42) int local42 = local8[local22]++;
			}
		}
		if (125 != 125) {
			this.method5321((Class229) null, (short) 100, 58, 10);
		}
		@Pc(76) int[][] local76 = new int[local10 + 1][];
		for (@Pc(78) int local78 = 0; local78 <= local10; local78++) {
			local76[local78] = new int[local8[local78]];
			local8[local78] = 0;
		}
		for (@Pc(99) int local99 = 0; local99 < this.aClass390Array1.length; local99++) {
			@Pc(109) int local109 = this.aClass390Array1[local99].anInt10645;
			if (local109 >= 0) {
				local76[local109][local8[local109]++] = local99;
			}
		}
		return local76;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(SIS)V")
	public void method5307(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray93 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt5934; local20++) {
			if (this.aShortArray93[local20] == arg1) {
				this.aShortArray93[local20] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)V")
	public void method5308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(24) int local24;
		@Pc(42) int local42;
		if (arg2 != 0) {
			local18 = Class145_Sub1.anIntArray761[arg2];
			local22 = Class145_Sub1.anIntArray760[arg2];
			for (local24 = 0; local24 < this.anInt5931; local24++) {
				local42 = local22 * this.anIntArray394[local24] + this.anIntArray392[local24] * local18 >> 14;
				this.anIntArray392[local24] = this.anIntArray392[local24] * local22 - this.anIntArray394[local24] * local18 >> 14;
				this.anIntArray394[local24] = local42;
			}
		}
		if (arg1 != 0) {
			local18 = Class145_Sub1.anIntArray761[arg1];
			local22 = Class145_Sub1.anIntArray760[arg1];
			for (local24 = 0; local24 < this.anInt5931; local24++) {
				local42 = this.anIntArray392[local24] * local22 - this.anIntArray396[local24] * local18 >> 14;
				this.anIntArray396[local24] = local18 * this.anIntArray392[local24] + this.anIntArray396[local24] * local22 >> 14;
				this.anIntArray392[local24] = local42;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local18 = Class145_Sub1.anIntArray761[arg0];
		local22 = Class145_Sub1.anIntArray760[arg0];
		for (local24 = 0; local24 < this.anInt5931; local24++) {
			local42 = local18 * this.anIntArray396[local24] + local22 * this.anIntArray394[local24] >> 14;
			this.anIntArray396[local24] = this.anIntArray396[local24] * local22 - this.anIntArray394[local24] * local18 >> 14;
			this.anIntArray394[local24] = local42;
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(IIII)V")
	public void method5309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5931; local3++) {
			this.anIntArray394[local3] += arg1;
			this.anIntArray392[local3] += arg0;
			this.anIntArray396[local3] += arg2;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BSSIBBIIB)I")
	public int method5310(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aShortArray102[this.anInt5934] = (short) arg3;
		this.aShortArray95[this.anInt5934] = (short) arg7;
		this.aShortArray98[this.anInt5934] = (short) arg6;
		this.aByteArray79[this.anInt5934] = arg4;
		this.aByteArray77[this.anInt5934] = arg0;
		this.aShortArray100[this.anInt5934] = arg1;
		this.aByteArray80[this.anInt5934] = arg5;
		this.aShortArray93[this.anInt5934] = arg2;
		return this.anInt5934++;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ISS)V")
	public void method5311(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5934; local15++) {
			if (arg1 == this.aShortArray100[local15]) {
				this.aShortArray100[local15] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([BI)V")
	private void method5313(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub20 local10 = new Class2_Sub20(arg0);
		@Pc(15) Class2_Sub20 local15 = new Class2_Sub20(arg0);
		@Pc(20) Class2_Sub20 local20 = new Class2_Sub20(arg0);
		@Pc(25) Class2_Sub20 local25 = new Class2_Sub20(arg0);
		@Pc(30) Class2_Sub20 local30 = new Class2_Sub20(arg0);
		@Pc(35) Class2_Sub20 local35 = new Class2_Sub20(arg0);
		@Pc(40) Class2_Sub20 local40 = new Class2_Sub20(arg0);
		local10.anInt9723 = arg0.length - 23;
		this.anInt5931 = local10.method8575();
		this.anInt5934 = local10.method8575();
		this.anInt5946 = local10.method8581(-17416);
		@Pc(65) int local65 = local10.method8581(-17416);
		@Pc(77) boolean local77 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(99) boolean local99 = (local65 & 0x4) == 4;
		@Pc(109) boolean local109 = (local65 & 0x8) == 8;
		if (local109) {
			local10.anInt9723 -= 7;
			this.anInt5933 = local10.method8581(-17416);
			local10.anInt9723 += 6;
		}
		@Pc(134) int local134 = local10.method8581(-17416);
		@Pc(138) int local138 = local10.method8581(-17416);
		@Pc(142) int local142 = local10.method8581(-17416);
		@Pc(146) int local146 = local10.method8581(-17416);
		@Pc(152) int local152 = local10.method8581(-17416);
		@Pc(156) int local156 = local10.method8575();
		@Pc(160) int local160 = local10.method8575();
		@Pc(164) int local164 = local10.method8575();
		@Pc(168) int local168 = local10.method8575();
		@Pc(172) int local172 = local10.method8575();
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(191) int local191;
		if (this.anInt5946 > 0) {
			this.aByteArray82 = new byte[this.anInt5946];
			local10.anInt9723 = 0;
			for (local191 = 0; local191 < this.anInt5946; local191++) {
				@Pc(202) byte local202 = this.aByteArray82[local191] = local10.method8536();
				if (local202 == 2) {
					local178++;
				}
				if (local202 == 0) {
					local174++;
				}
				if (local202 >= 1 && local202 <= 3) {
					local176++;
				}
			}
		}
		local191 = this.anInt5946;
		@Pc(236) int local236 = local191;
		local191 += this.anInt5931;
		@Pc(243) int local243 = local191;
		if (local77) {
			local191 += this.anInt5934;
		}
		@Pc(256) int local256 = local191;
		local191 += this.anInt5934;
		@Pc(263) int local263 = local191;
		if (local134 == 255) {
			local191 += this.anInt5934;
		}
		@Pc(275) int local275 = local191;
		if (local142 == 1) {
			local191 += this.anInt5934;
		}
		@Pc(292) int local292 = local191;
		if (local152 == 1) {
			local191 += this.anInt5931;
		}
		@Pc(302) int local302 = local191;
		if (local138 == 1) {
			local191 += this.anInt5934;
		}
		@Pc(312) int local312 = local191;
		local191 += local168;
		@Pc(318) int local318 = local191;
		if (local146 == 1) {
			local191 += this.anInt5934 * 2;
		}
		@Pc(332) int local332 = local191;
		local191 += local172;
		@Pc(338) int local338 = local191;
		local191 += this.anInt5934 * 2;
		@Pc(347) int local347 = local191;
		local191 += local156;
		@Pc(353) int local353 = local191;
		local191 += local160;
		@Pc(359) int local359 = local191;
		local191 += local164;
		@Pc(365) int local365 = local191;
		local191 += local174 * 6;
		@Pc(373) int local373 = local191;
		local191 += local176 * 6;
		@Pc(381) byte local381 = 6;
		if (this.anInt5933 == 14) {
			local381 = 7;
		} else if (this.anInt5933 >= 15) {
			local381 = 9;
		}
		@Pc(399) int local399 = local191;
		local191 += local176 * local381;
		@Pc(407) int local407 = local191;
		local191 += local176;
		@Pc(413) int local413 = local191;
		local191 += local176;
		@Pc(419) int local419 = local191;
		local191 += local178 * 2 + local176;
		if (local152 == 1) {
			this.anIntArray397 = new int[this.anInt5931];
		}
		this.aShortArray98 = new short[this.anInt5934];
		if (this.anInt5946 > 0) {
			this.aShortArray96 = new short[this.anInt5946];
			this.aShortArray101 = new short[this.anInt5946];
			if (local176 > 0) {
				this.anIntArray398 = new int[local176];
				this.aByteArray81 = new byte[local176];
				this.anIntArray402 = new int[local176];
				this.anIntArray399 = new int[local176];
				this.anIntArray400 = new int[local176];
				this.aByteArray83 = new byte[local176];
			}
			if (local178 > 0) {
				this.anIntArray401 = new int[local178];
				this.anIntArray393 = new int[local178];
			}
			this.aShortArray94 = new short[this.anInt5946];
		}
		if (local77) {
			this.aByteArray79 = new byte[this.anInt5934];
		}
		this.anIntArray394 = new int[this.anInt5931];
		this.anIntArray392 = new int[this.anInt5931];
		local10.anInt9723 = local236;
		if (local146 == 1) {
			this.aShortArray93 = new short[this.anInt5934];
		}
		if (local134 == 255) {
			this.aByteArray78 = new byte[this.anInt5934];
		} else {
			this.aByte79 = (byte) local134;
		}
		this.aShortArray95 = new short[this.anInt5934];
		if (local146 == 1 && this.anInt5946 > 0) {
			this.aByteArray77 = new byte[this.anInt5934];
		}
		this.anIntArray396 = new int[this.anInt5931];
		if (local138 == 1) {
			this.aByteArray80 = new byte[this.anInt5934];
		}
		this.aShortArray102 = new short[this.anInt5934];
		this.aShortArray100 = new short[this.anInt5934];
		if (local142 == 1) {
			this.anIntArray395 = new int[this.anInt5934];
		}
		local15.anInt9723 = local347;
		local20.anInt9723 = local353;
		local25.anInt9723 = local359;
		local30.anInt9723 = local292;
		@Pc(639) int local639 = 0;
		@Pc(641) int local641 = 0;
		@Pc(643) int local643 = 0;
		@Pc(653) int local653;
		for (@Pc(645) int local645 = 0; local645 < this.anInt5931; local645++) {
			local653 = local10.method8581(-17416);
			@Pc(655) int local655 = 0;
			if ((local653 & 0x1) != 0) {
				local655 = local15.method8560();
			}
			@Pc(665) int local665 = 0;
			if ((local653 & 0x2) != 0) {
				local665 = local20.method8560();
			}
			@Pc(675) int local675 = 0;
			if ((local653 & 0x4) != 0) {
				local675 = local25.method8560();
			}
			this.anIntArray394[local645] = local639 + local655;
			this.anIntArray392[local645] = local665 + local641;
			this.anIntArray396[local645] = local643 + local675;
			local641 = this.anIntArray392[local645];
			local643 = this.anIntArray396[local645];
			local639 = this.anIntArray394[local645];
			if (local152 == 1) {
				this.anIntArray397[local645] = local30.method8581(-17416);
			}
		}
		local10.anInt9723 = local338;
		local15.anInt9723 = local243;
		local20.anInt9723 = local263;
		local25.anInt9723 = local302;
		local30.anInt9723 = local275;
		local35.anInt9723 = local318;
		local40.anInt9723 = local332;
		for (local653 = 0; local653 < this.anInt5934; local653++) {
			this.aShortArray100[local653] = (short) local10.method8575();
			if (local77) {
				this.aByteArray79[local653] = local15.method8536();
			}
			if (local134 == 255) {
				this.aByteArray78[local653] = local20.method8536();
			}
			if (local138 == 1) {
				this.aByteArray80[local653] = local25.method8536();
			}
			if (local142 == 1) {
				this.anIntArray395[local653] = local30.method8581(-17416);
			}
			if (local146 == 1) {
				this.aShortArray93[local653] = (short) (local35.method8575() - 1);
			}
			if (this.aByteArray77 != null) {
				if (this.aShortArray93[local653] == -1) {
					this.aByteArray77[local653] = -1;
				} else {
					this.aByteArray77[local653] = (byte) (local40.method8581(-17416) - 1);
				}
			}
		}
		local10.anInt9723 = local312;
		this.anInt5932 = -1;
		local15.anInt9723 = local256;
		@Pc(892) short local892 = 0;
		@Pc(894) short local894 = 0;
		@Pc(896) short local896 = 0;
		@Pc(898) short local898 = 0;
		@Pc(908) int local908;
		for (@Pc(900) int local900 = 0; local900 < this.anInt5934; local900++) {
			local908 = local15.method8581(-17416);
			if (local908 == 1) {
				local892 = (short) (local10.method8560() + local898);
				local894 = (short) (local10.method8560() + local892);
				local896 = (short) (local894 + local10.method8560());
				local898 = local896;
				this.aShortArray102[local900] = local892;
				this.aShortArray95[local900] = local894;
				this.aShortArray98[local900] = local896;
				if (local892 > this.anInt5932) {
					this.anInt5932 = local892;
				}
				if (local894 > this.anInt5932) {
					this.anInt5932 = local894;
				}
				if (this.anInt5932 < local896) {
					this.anInt5932 = local896;
				}
			}
			if (local908 == 2) {
				local894 = local896;
				local896 = (short) (local898 + local10.method8560());
				this.aShortArray102[local900] = local892;
				local898 = local896;
				this.aShortArray95[local900] = local894;
				this.aShortArray98[local900] = local896;
				if (this.anInt5932 < local896) {
					this.anInt5932 = local896;
				}
			}
			if (local908 == 3) {
				local892 = local896;
				local896 = (short) (local898 + local10.method8560());
				local898 = local896;
				this.aShortArray102[local900] = local892;
				this.aShortArray95[local900] = local894;
				this.aShortArray98[local900] = local896;
				if (this.anInt5932 < local896) {
					this.anInt5932 = local896;
				}
			}
			if (local908 == 4) {
				@Pc(1077) short local1077 = local892;
				local892 = local894;
				local896 = (short) (local10.method8560() + local898);
				local894 = local1077;
				this.aShortArray102[local900] = local892;
				local898 = local896;
				this.aShortArray95[local900] = local1077;
				this.aShortArray98[local900] = local896;
				if (local896 > this.anInt5932) {
					this.anInt5932 = local896;
				}
			}
		}
		local10.anInt9723 = local365;
		this.anInt5932++;
		local15.anInt9723 = local373;
		local20.anInt9723 = local399;
		local25.anInt9723 = local407;
		local30.anInt9723 = local413;
		local35.anInt9723 = local419;
		@Pc(1166) int local1166;
		for (local908 = 0; local908 < this.anInt5946; local908++) {
			local1166 = this.aByteArray82[local908] & 0xFF;
			if (local1166 == 0) {
				this.aShortArray94[local908] = (short) local10.method8575();
				this.aShortArray96[local908] = (short) local10.method8575();
				this.aShortArray101[local908] = (short) local10.method8575();
			}
			if (local1166 == 1) {
				this.aShortArray94[local908] = (short) local15.method8575();
				this.aShortArray96[local908] = (short) local15.method8575();
				this.aShortArray101[local908] = (short) local15.method8575();
				if (this.anInt5933 >= 15) {
					this.anIntArray399[local908] = local20.method8583();
					this.anIntArray402[local908] = local20.method8583();
					this.anIntArray398[local908] = local20.method8583();
				} else {
					this.anIntArray399[local908] = local20.method8575();
					if (this.anInt5933 >= 14) {
						this.anIntArray402[local908] = local20.method8583();
					} else {
						this.anIntArray402[local908] = local20.method8575();
					}
					this.anIntArray398[local908] = local20.method8575();
				}
				this.aByteArray81[local908] = local25.method8536();
				this.aByteArray83[local908] = local30.method8536();
				this.anIntArray400[local908] = local35.method8536();
			}
			if (local1166 == 2) {
				this.aShortArray94[local908] = (short) local15.method8575();
				this.aShortArray96[local908] = (short) local15.method8575();
				this.aShortArray101[local908] = (short) local15.method8575();
				if (this.anInt5933 >= 15) {
					this.anIntArray399[local908] = local20.method8583();
					this.anIntArray402[local908] = local20.method8583();
					this.anIntArray398[local908] = local20.method8583();
				} else {
					this.anIntArray399[local908] = local20.method8575();
					if (this.anInt5933 < 14) {
						this.anIntArray402[local908] = local20.method8575();
					} else {
						this.anIntArray402[local908] = local20.method8583();
					}
					this.anIntArray398[local908] = local20.method8575();
				}
				this.aByteArray81[local908] = local25.method8536();
				this.aByteArray83[local908] = local30.method8536();
				this.anIntArray400[local908] = local35.method8536();
				this.anIntArray401[local908] = local35.method8536();
				this.anIntArray393[local908] = local35.method8536();
			}
			if (local1166 == 3) {
				this.aShortArray94[local908] = (short) local15.method8575();
				this.aShortArray96[local908] = (short) local15.method8575();
				this.aShortArray101[local908] = (short) local15.method8575();
				if (this.anInt5933 < 15) {
					this.anIntArray399[local908] = local20.method8575();
					if (this.anInt5933 >= 14) {
						this.anIntArray402[local908] = local20.method8583();
					} else {
						this.anIntArray402[local908] = local20.method8575();
					}
					this.anIntArray398[local908] = local20.method8575();
				} else {
					this.anIntArray399[local908] = local20.method8583();
					this.anIntArray402[local908] = local20.method8583();
					this.anIntArray398[local908] = local20.method8583();
				}
				this.aByteArray81[local908] = local25.method8536();
				this.aByteArray83[local908] = local30.method8536();
				this.anIntArray400[local908] = local35.method8536();
			}
		}
		local10.anInt9723 = local191;
		@Pc(1619) int local1619;
		@Pc(1627) int local1627;
		@Pc(1631) int local1631;
		@Pc(1704) int local1704;
		if (local87) {
			local1166 = local10.method8581(-17416);
			if (local1166 > 0) {
				this.aClass364Array4 = new Class364[local1166];
				for (local1619 = 0; local1619 < local1166; local1619++) {
					local1627 = local10.method8575();
					local1631 = local10.method8575();
					@Pc(1641) byte local1641;
					if (local134 == 255) {
						local1641 = this.aByteArray78[local1631];
					} else {
						local1641 = (byte) local134;
					}
					this.aClass364Array4[local1619] = new Class364(local1627, this.aShortArray102[local1631], this.aShortArray95[local1631], this.aShortArray98[local1631], local1641);
				}
			}
			local1619 = local10.method8581(-17416);
			if (local1619 > 0) {
				this.aClass363Array4 = new Class363[local1619];
				for (local1627 = 0; local1627 < local1619; local1627++) {
					local1631 = local10.method8575();
					local1704 = local10.method8575();
					this.aClass363Array4[local1627] = new Class363(local1631, local1704);
				}
			}
		}
		if (!local99) {
			return;
		}
		local1166 = local10.method8581(-17416);
		if (local1166 <= 0) {
			return;
		}
		this.aClass390Array1 = new Class390[local1166];
		for (local1619 = 0; local1619 < local1166; local1619++) {
			local1627 = local10.method8575();
			local1631 = local10.method8575();
			local1704 = local10.method8581(-17416);
			@Pc(1753) byte local1753 = local10.method8536();
			this.aClass390Array1[local1619] = new Class390(local1627, local1631, local1704, local1753);
		}
		return;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)[[I")
	public int[][] method5314() {
		@Pc(15) int[] local15 = new int[256];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anInt5934; local19++) {
			@Pc(28) int local28 = this.anIntArray395[local19];
			if (local28 >= 0) {
				@Pc(34) int local34 = local15[local28]++;
				if (local17 < local28) {
					local17 = local28;
				}
			}
		}
		@Pc(58) int[][] local58 = new int[local17 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local17; local62++) {
			local58[local62] = new int[local15[local62]];
			local15[local62] = 0;
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt5934; local87++) {
			@Pc(96) int local96 = this.anIntArray395[local87];
			if (local96 >= 0) {
				local58[local96][local15[local96]++] = local87;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	public void method5315() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5931; local3++) {
			this.anIntArray394[local3] <<= 0x2;
			this.anIntArray392[local3] <<= 0x2;
			this.anIntArray396[local3] <<= 0x2;
		}
		if (this.anInt5946 <= 0 || this.anIntArray399 == null) {
			return;
		}
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray399.length; local54++) {
			this.anIntArray399[local54] <<= 0x2;
			this.anIntArray402[local54] <<= 0x2;
			if (this.aByteArray82[local54] != 1) {
				this.anIntArray398[local54] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BSSSSSBBIS)B")
	public byte method5316() {
		if (this.anInt5946 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray82[this.anInt5946] = 3;
		this.aShortArray94[this.anInt5946] = 0;
		this.aShortArray96[this.anInt5946] = 32767;
		this.aShortArray101[this.anInt5946] = 0;
		this.anIntArray399[this.anInt5946] = 1024;
		this.anIntArray402[this.anInt5946] = 1024;
		this.anIntArray398[this.anInt5946] = 1024;
		this.aByteArray81[this.anInt5946] = 0;
		this.aByteArray83[this.anInt5946] = 0;
		this.anIntArray400[this.anInt5946] = 0;
		return (byte) this.anInt5946++;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[B)V")
	private void method5317(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub20 local14 = new Class2_Sub20(arg1);
		@Pc(19) Class2_Sub20 local19 = new Class2_Sub20(arg1);
		@Pc(24) Class2_Sub20 local24 = new Class2_Sub20(arg1);
		@Pc(29) Class2_Sub20 local29 = new Class2_Sub20(arg1);
		@Pc(34) Class2_Sub20 local34 = new Class2_Sub20(arg1);
		local14.anInt9723 = arg1.length - 18;
		this.anInt5931 = local14.method8575();
		this.anInt5934 = local14.method8575();
		this.anInt5946 = local14.method8581(-17416);
		@Pc(59) int local59 = local14.method8581(-17416);
		@Pc(65) int local65 = local14.method8581(arg0 - 17416);
		@Pc(71) int local71 = local14.method8581(arg0 ^ 0xFFFFBBF8);
		@Pc(75) int local75 = local14.method8581(-17416);
		@Pc(79) int local79 = local14.method8581(-17416);
		@Pc(83) int local83 = local14.method8575();
		@Pc(87) int local87 = local14.method8575();
		@Pc(91) int local91 = local14.method8575();
		@Pc(95) int local95 = local14.method8575();
		@Pc(104) int local104 = this.anInt5931;
		@Pc(106) int local106 = local104;
		local104 += this.anInt5934;
		@Pc(113) int local113 = local104;
		if (local65 == 255) {
			local104 += this.anInt5934;
		}
		@Pc(123) int local123 = local104;
		if (local75 == 1) {
			local104 += this.anInt5934;
		}
		@Pc(133) int local133 = local104;
		if (local59 == 1) {
			local104 += this.anInt5934;
		}
		@Pc(145) int local145 = local104;
		if (local79 == 1) {
			local104 += this.anInt5931;
		}
		@Pc(157) int local157 = local104;
		if (local71 == 1) {
			local104 += this.anInt5934;
		}
		@Pc(167) int local167 = local104;
		local104 += local95;
		@Pc(173) int local173 = local104;
		local104 += this.anInt5934 * 2;
		@Pc(182) int local182 = local104;
		local104 += this.anInt5946 * 6;
		@Pc(191) int local191 = local104;
		local104 += local83;
		@Pc(197) int local197 = local104;
		local104 += local87;
		this.aShortArray102 = new short[this.anInt5934];
		if (this.anInt5946 > 0) {
			this.aShortArray94 = new short[this.anInt5946];
			this.aByteArray82 = new byte[this.anInt5946];
			this.aShortArray96 = new short[this.anInt5946];
			this.aShortArray101 = new short[this.anInt5946];
		}
		if (local71 == 1) {
			this.aByteArray80 = new byte[this.anInt5934];
		}
		if (local65 == 255) {
			this.aByteArray78 = new byte[this.anInt5934];
		} else {
			this.aByte79 = (byte) local65;
		}
		this.anIntArray396 = new int[this.anInt5931];
		this.anIntArray394 = new int[this.anInt5931];
		this.anIntArray392 = new int[this.anInt5931];
		this.aShortArray100 = new short[this.anInt5934];
		this.aShortArray95 = new short[this.anInt5934];
		this.aShortArray98 = new short[this.anInt5934];
		if (local59 == 1) {
			this.aByteArray77 = new byte[this.anInt5934];
			this.aShortArray93 = new short[this.anInt5934];
			this.aByteArray79 = new byte[this.anInt5934];
		}
		if (local75 == 1) {
			this.anIntArray395 = new int[this.anInt5934];
		}
		if (local79 == 1) {
			this.anIntArray397 = new int[this.anInt5931];
		}
		local14.anInt9723 = 0;
		local19.anInt9723 = local191;
		local24.anInt9723 = local197;
		local29.anInt9723 = local104;
		local34.anInt9723 = local145;
		@Pc(363) int local363 = 0;
		@Pc(365) int local365 = arg0;
		@Pc(367) int local367 = 0;
		@Pc(375) int local375;
		@Pc(377) int local377;
		for (@Pc(369) int local369 = 0; local369 < this.anInt5931; local369++) {
			local375 = local14.method8581(-17416);
			local377 = 0;
			if ((local375 & 0x1) != 0) {
				local377 = local19.method8560();
			}
			@Pc(390) int local390 = 0;
			if ((local375 & 0x2) != 0) {
				local390 = local24.method8560();
			}
			@Pc(403) int local403 = 0;
			if ((local375 & 0x4) != 0) {
				local403 = local29.method8560();
			}
			this.anIntArray394[local369] = local377 + local363;
			this.anIntArray392[local369] = local390 + local365;
			this.anIntArray396[local369] = local403 + local367;
			local363 = this.anIntArray394[local369];
			local365 = this.anIntArray392[local369];
			local367 = this.anIntArray396[local369];
			if (local79 == 1) {
				this.anIntArray397[local369] = local34.method8581(-17416);
			}
		}
		local14.anInt9723 = local173;
		local19.anInt9723 = local133;
		local24.anInt9723 = local113;
		local29.anInt9723 = local157;
		local34.anInt9723 = local123;
		for (local375 = 0; local375 < this.anInt5934; local375++) {
			this.aShortArray100[local375] = (short) local14.method8575();
			if (local59 == 1) {
				local377 = local19.method8581(-17416);
				if ((local377 & 0x1) == 1) {
					this.aByteArray79[local375] = 1;
					local7 = true;
				} else {
					this.aByteArray79[local375] = 0;
				}
				if ((local377 & 0x2) == 2) {
					this.aByteArray77[local375] = (byte) (local377 >> 2);
					this.aShortArray93[local375] = this.aShortArray100[local375];
					this.aShortArray100[local375] = 127;
					if (this.aShortArray93[local375] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray77[local375] = -1;
					this.aShortArray93[local375] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray78[local375] = local24.method8536();
			}
			if (local71 == 1) {
				this.aByteArray80[local375] = local29.method8536();
			}
			if (local75 == 1) {
				this.anIntArray395[local375] = local34.method8581(-17416);
			}
		}
		this.anInt5932 = -1;
		local14.anInt9723 = local167;
		local19.anInt9723 = local106;
		@Pc(634) short local634 = 0;
		@Pc(636) short local636 = 0;
		@Pc(638) short local638 = 0;
		@Pc(640) short local640 = 0;
		@Pc(652) int local652;
		for (@Pc(642) int local642 = 0; local642 < this.anInt5934; local642++) {
			local652 = local19.method8581(arg0 - 17416);
			if (local652 == 1) {
				local634 = (short) (local640 + local14.method8560());
				local636 = (short) (local14.method8560() + local634);
				local638 = (short) (local636 + local14.method8560());
				local640 = local638;
				this.aShortArray102[local642] = local634;
				this.aShortArray95[local642] = local636;
				this.aShortArray98[local642] = local638;
				if (local634 > this.anInt5932) {
					this.anInt5932 = local634;
				}
				if (local636 > this.anInt5932) {
					this.anInt5932 = local636;
				}
				if (this.anInt5932 < local638) {
					this.anInt5932 = local638;
				}
			}
			if (local652 == 2) {
				local636 = local638;
				local638 = (short) (local14.method8560() + local640);
				local640 = local638;
				this.aShortArray102[local642] = local634;
				this.aShortArray95[local642] = local636;
				this.aShortArray98[local642] = local638;
				if (this.anInt5932 < local638) {
					this.anInt5932 = local638;
				}
			}
			if (local652 == 3) {
				local634 = local638;
				local638 = (short) (local14.method8560() + local640);
				local640 = local638;
				this.aShortArray102[local642] = local634;
				this.aShortArray95[local642] = local636;
				this.aShortArray98[local642] = local638;
				if (local638 > this.anInt5932) {
					this.anInt5932 = local638;
				}
			}
			if (local652 == 4) {
				@Pc(811) short local811 = local634;
				local634 = local636;
				local636 = local811;
				local638 = (short) (local14.method8560() + local640);
				this.aShortArray102[local642] = local634;
				local640 = local638;
				this.aShortArray95[local642] = local811;
				this.aShortArray98[local642] = local638;
				if (this.anInt5932 < local638) {
					this.anInt5932 = local638;
				}
			}
		}
		this.anInt5932++;
		local14.anInt9723 = local182;
		for (local652 = 0; local652 < this.anInt5946; local652++) {
			this.aByteArray82[local652] = 0;
			this.aShortArray94[local652] = (short) local14.method8575();
			this.aShortArray96[local652] = (short) local14.method8575();
			this.aShortArray101[local652] = (short) local14.method8575();
		}
		if (this.aByteArray77 != null) {
			@Pc(913) boolean local913 = false;
			for (@Pc(915) int local915 = 0; local915 < this.anInt5934; local915++) {
				@Pc(926) int local926 = this.aByteArray77[local915] & 0xFF;
				if (local926 != 255) {
					if ((this.aShortArray94[local926] & 0xFFFF) == this.aShortArray102[local915] && (this.aShortArray96[local926] & 0xFFFF) == this.aShortArray95[local915] && (this.aShortArray101[local926] & 0xFFFF) == this.aShortArray98[local915]) {
						this.aByteArray77[local915] = -1;
					} else {
						local913 = true;
					}
				}
			}
			if (!local913) {
				this.aByteArray77 = null;
			}
		}
		if (!local9) {
			this.aShortArray93 = null;
		}
		if (!local7) {
			this.aByteArray79 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIB)I")
	public int method5318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5931; local15++) {
			if (this.anIntArray394[local15] == arg2 && arg1 == this.anIntArray392[local15] && this.anIntArray396[local15] == arg0) {
				return local15;
			}
		}
		this.anIntArray394[this.anInt5931] = arg2;
		this.anIntArray392[this.anInt5931] = arg1;
		this.anIntArray396[this.anInt5931] = arg0;
		this.anInt5932 = this.anInt5931 + 1;
		return this.anInt5931++;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)[[I")
	public int[][] method5320(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -94) {
			this.method5317(108, (byte[]) null);
		}
		@Pc(17) int[] local17 = new int[256];
		@Pc(19) int local19 = 0;
		@Pc(28) int local28 = arg0 ? this.anInt5931 : this.anInt5932;
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(39) int local39 = this.anIntArray397[local30];
			if (local39 >= 0) {
				@Pc(48) int local48 = local17[local39]++;
				if (local19 < local39) {
					local19 = local39;
				}
			}
		}
		@Pc(71) int[][] local71 = new int[local19 + 1][];
		for (@Pc(75) int local75 = 0; local75 <= local19; local75++) {
			local71[local75] = new int[local17[local75]];
			local17[local75] = 0;
		}
		for (@Pc(96) int local96 = 0; local96 < local28; local96++) {
			@Pc(105) int local105 = this.anIntArray397[local96];
			if (local105 >= 0) {
				local71[local105][local17[local105]++] = local96;
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!ln;SII)I")
	private int method5321(@OriginalArg(0) Class229 arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int local10 = arg0.anIntArray394[arg2];
		@Pc(15) int local15 = arg0.anIntArray392[arg2];
		@Pc(20) int local20 = arg0.anIntArray396[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5931; local22++) {
			if (local10 == this.anIntArray394[local22] && local15 == this.anIntArray392[local22] && local20 == this.anIntArray396[local22]) {
				this.aShortArray99[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray394[this.anInt5931] = local10;
		this.anIntArray392[this.anInt5931] = local15;
		this.anIntArray396[this.anInt5931] = local20;
		if (arg3 > -82) {
			this.method5320(false, 89);
		}
		this.aShortArray99[this.anInt5931] = arg1;
		this.anIntArray397[this.anInt5931] = arg0.anIntArray397 == null ? -1 : arg0.anIntArray397[arg2];
		return this.anInt5931++;
	}
}
