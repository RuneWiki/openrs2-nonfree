import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class43 {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "[Lclient!mp;")
	public Class219[] aClass219Array1;

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "[Lclient!fk;")
	public Class101[] aClass101Array1;

	@OriginalMember(owner = "client!cca", name = "i", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!cca", name = "j", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!cca", name = "l", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!cca", name = "m", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!cca", name = "n", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!cca", name = "s", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!cca", name = "t", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!cca", name = "u", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!cca", name = "y", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!cca", name = "z", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!cca", name = "B", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!cca", name = "D", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!cca", name = "E", descriptor = "[Lclient!vr;")
	public Class347[] aClass347Array1;

	@OriginalMember(owner = "client!cca", name = "F", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!cca", name = "G", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!cca", name = "J", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!cca", name = "P", descriptor = "[I")
	public int[] anIntArray78;

	@OriginalMember(owner = "client!cca", name = "R", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!cca", name = "S", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!cca", name = "T", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!cca", name = "V", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!cca", name = "Y", descriptor = "[I")
	public int[] anIntArray80;

	@OriginalMember(owner = "client!cca", name = "Z", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!cca", name = "bb", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "B")
	public byte aByte21 = 0;

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "I")
	public int anInt1481 = 12;

	@OriginalMember(owner = "client!cca", name = "N", descriptor = "I")
	public int anInt1493 = 0;

	@OriginalMember(owner = "client!cca", name = "M", descriptor = "I")
	public int anInt1492 = 0;

	@OriginalMember(owner = "client!cca", name = "v", descriptor = "I")
	public int anInt1483 = 0;

	@OriginalMember(owner = "client!cca", name = "W", descriptor = "I")
	public int anInt1497 = 0;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
	private Class43() {
	}

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "([B)V")
	public Class43(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1375(arg0);
		} else {
			this.method1368(arg0);
		}
	}

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(III)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray10 = new byte[arg1];
		this.anIntArray77 = new int[arg0];
		this.aShortArray13 = new short[arg1];
		this.aShortArray16 = new short[arg1];
		this.aByteArray9 = new byte[arg1];
		if (arg2 > 0) {
			this.anIntArray71 = new int[arg2];
			this.aShortArray8 = new short[arg2];
			this.aShortArray11 = new short[arg2];
			this.aByteArray6 = new byte[arg2];
			this.anIntArray78 = new int[arg2];
			this.anIntArray80 = new int[arg2];
			this.aShortArray14 = new short[arg2];
			this.anIntArray81 = new int[arg2];
			this.anIntArray76 = new int[arg2];
			this.aByteArray7 = new byte[arg2];
			this.anIntArray73 = new int[arg2];
			this.aByteArray11 = new byte[arg2];
		}
		this.anIntArray75 = new int[arg1];
		this.aShortArray9 = new short[arg1];
		this.aShortArray7 = new short[arg1];
		this.aByteArray8 = new byte[arg1];
		this.anIntArray79 = new int[arg0];
		this.aByteArray5 = new byte[arg1];
		this.anIntArray74 = new int[arg0];
		this.aShortArray15 = new short[arg1];
		this.anIntArray72 = new int[arg0];
	}

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "([Lclient!cca;I)V")
	public Class43(@OriginalArg(0) Class43[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1492 = 0;
		this.anInt1493 = 0;
		this.anInt1483 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte21 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class43 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt1492 += local59.anInt1492;
				this.anInt1483 += local59.anInt1483;
				this.anInt1493 += local59.anInt1493;
				if (local59.aClass101Array1 != null) {
					local34 += local59.aClass101Array1.length;
				}
				if (local59.aClass219Array1 != null) {
					local32 += local59.aClass219Array1.length;
				}
				local38 |= local59.aByteArray8 != null;
				if (local59.aClass347Array1 != null) {
					local36 += local59.aClass347Array1.length;
				}
				local46 |= local59.aShortArray15 != null;
				local42 |= local59.aByteArray5 != null;
				local44 |= local59.aByteArray10 != null;
				local48 |= local59.anIntArray75 != null;
				if (local59.aByteArray9 == null) {
					if (this.aByte21 == -1) {
						this.aByte21 = local59.aByte21;
					}
					if (this.aByte21 != local59.aByte21) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		this.aShortArray16 = new short[this.anInt1492];
		if (local46) {
			this.aShortArray15 = new short[this.anInt1492];
		}
		if (local38) {
			this.aByteArray8 = new byte[this.anInt1492];
		}
		if (local48) {
			this.anIntArray75 = new int[this.anInt1492];
		}
		if (local36 > 0) {
			this.aClass347Array1 = new Class347[local36];
		}
		this.aShortArray7 = new short[this.anInt1492];
		if (local44) {
			this.aByteArray10 = new byte[this.anInt1492];
		}
		this.anIntArray79 = new int[this.anInt1493];
		this.aShortArray9 = new short[this.anInt1492];
		if (local32 > 0) {
			this.aClass219Array1 = new Class219[local32];
		}
		if (local40) {
			this.aByteArray9 = new byte[this.anInt1492];
		}
		if (local42) {
			this.aByteArray5 = new byte[this.anInt1492];
		}
		this.anIntArray74 = new int[this.anInt1493];
		this.aShortArray13 = new short[this.anInt1492];
		if (this.anInt1483 > 0) {
			this.anIntArray81 = new int[this.anInt1483];
			this.aShortArray11 = new short[this.anInt1483];
			this.anIntArray76 = new int[this.anInt1483];
			this.anIntArray80 = new int[this.anInt1483];
			this.aByteArray11 = new byte[this.anInt1483];
			this.anIntArray73 = new int[this.anInt1483];
			this.aShortArray8 = new short[this.anInt1483];
			this.anIntArray78 = new int[this.anInt1483];
			this.aShortArray14 = new short[this.anInt1483];
			this.aByteArray7 = new byte[this.anInt1483];
			this.aByteArray6 = new byte[this.anInt1483];
			this.anIntArray71 = new int[this.anInt1483];
		}
		this.anIntArray72 = new int[this.anInt1493];
		if (local34 > 0) {
			this.aClass101Array1 = new Class101[local34];
		}
		this.anIntArray77 = new int[this.anInt1493];
		this.aShortArray10 = new short[this.anInt1493];
		this.aShortArray12 = new short[this.anInt1492];
		this.anInt1483 = 0;
		this.anInt1492 = 0;
		local34 = 0;
		this.anInt1493 = 0;
		local36 = 0;
		local32 = 0;
		@Pc(617) int local617;
		@Pc(628) int local628;
		for (@Pc(385) int local385 = 0; local385 < arg1; local385++) {
			@Pc(392) short local392 = (short) (0x1 << local385);
			@Pc(396) Class43 local396 = arg0[local385];
			if (local396 != null) {
				@Pc(403) int local403;
				if (local396.aClass347Array1 != null) {
					for (local403 = 0; local403 < local396.aClass347Array1.length; local403++) {
						@Pc(410) Class347 local410 = local396.aClass347Array1[local403];
						this.aClass347Array1[local36++] = local410.method7640(local410.anInt9257 + this.anInt1492);
					}
				}
				for (local403 = 0; local403 < local396.anInt1492; local403++) {
					if (local38 && local396.aByteArray8 != null) {
						this.aByteArray8[this.anInt1492] = local396.aByteArray8[local403];
					}
					if (local40) {
						if (local396.aByteArray9 == null) {
							this.aByteArray9[this.anInt1492] = local396.aByte21;
						} else {
							this.aByteArray9[this.anInt1492] = local396.aByteArray9[local403];
						}
					}
					if (local42 && local396.aByteArray5 != null) {
						this.aByteArray5[this.anInt1492] = local396.aByteArray5[local403];
					}
					if (local46) {
						if (local396.aShortArray15 == null) {
							this.aShortArray15[this.anInt1492] = -1;
						} else {
							this.aShortArray15[this.anInt1492] = local396.aShortArray15[local403];
						}
					}
					if (local48) {
						if (local396.anIntArray75 == null) {
							this.anIntArray75[this.anInt1492] = -1;
						} else {
							this.anIntArray75[this.anInt1492] = local396.anIntArray75[local403];
						}
					}
					this.aShortArray16[this.anInt1492] = (short) this.method1377(local392, local396.aShortArray16[local403], local396);
					this.aShortArray7[this.anInt1492] = (short) this.method1377(local392, local396.aShortArray7[local403], local396);
					this.aShortArray9[this.anInt1492] = (short) this.method1377(local392, local396.aShortArray9[local403], local396);
					this.aShortArray12[this.anInt1492] = local392;
					this.aShortArray13[this.anInt1492] = local396.aShortArray13[local403];
					this.anInt1492++;
				}
				@Pc(604) int local604;
				if (local396.aClass219Array1 != null) {
					for (local604 = 0; local604 < local396.aClass219Array1.length; local604++) {
						local617 = this.method1377(local392, local396.aClass219Array1[local604].anInt5927, local396);
						local628 = this.method1377(local392, local396.aClass219Array1[local604].anInt5924, local396);
						@Pc(639) int local639 = this.method1377(local392, local396.aClass219Array1[local604].anInt5916, local396);
						this.aClass219Array1[local32] = local396.aClass219Array1[local604].method4983(local617, local628, local639);
						local32++;
					}
				}
				if (local396.aClass101Array1 != null) {
					for (local604 = 0; local604 < local396.aClass101Array1.length; local604++) {
						local617 = this.method1377(local392, local396.aClass101Array1[local604].anInt2803, local396);
						this.aClass101Array1[local34] = local396.aClass101Array1[local604].method2362(local617);
						local34++;
					}
				}
			}
		}
		@Pc(705) int local705 = 0;
		this.anInt1497 = this.anInt1493;
		for (@Pc(711) int local711 = 0; local711 < arg1; local711++) {
			@Pc(718) short local718 = (short) (0x1 << local711);
			@Pc(722) Class43 local722 = arg0[local711];
			if (local722 != null) {
				for (local617 = 0; local617 < local722.anInt1492; local617++) {
					if (local44) {
						this.aByteArray10[local705++] = (byte) (local722.aByteArray10 == null || local722.aByteArray10[local617] == -1 ? -1 : this.anInt1483 + local722.aByteArray10[local617]);
					}
				}
				for (local628 = 0; local628 < local722.anInt1483; local628++) {
					@Pc(775) byte local775 = this.aByteArray6[this.anInt1483] = local722.aByteArray6[local628];
					if (local775 == 0) {
						this.aShortArray11[this.anInt1483] = (short) this.method1377(local718, local722.aShortArray11[local628], local722);
						this.aShortArray14[this.anInt1483] = (short) this.method1377(local718, local722.aShortArray14[local628], local722);
						this.aShortArray8[this.anInt1483] = (short) this.method1377(local718, local722.aShortArray8[local628], local722);
					}
					if (local775 >= 1 && local775 <= 3) {
						this.aShortArray11[this.anInt1483] = local722.aShortArray11[local628];
						this.aShortArray14[this.anInt1483] = local722.aShortArray14[local628];
						this.aShortArray8[this.anInt1483] = local722.aShortArray8[local628];
						this.anIntArray78[this.anInt1483] = local722.anIntArray78[local628];
						this.anIntArray80[this.anInt1483] = local722.anIntArray80[local628];
						this.anIntArray71[this.anInt1483] = local722.anIntArray71[local628];
						this.aByteArray11[this.anInt1483] = local722.aByteArray11[local628];
						this.aByteArray7[this.anInt1483] = local722.aByteArray7[local628];
						this.anIntArray76[this.anInt1483] = local722.anIntArray76[local628];
					}
					if (local775 == 2) {
						this.anIntArray81[this.anInt1483] = local722.anIntArray81[local628];
						this.anIntArray73[this.anInt1483] = local722.anIntArray73[local628];
					}
					this.anInt1483++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZII)V")
	public void method1364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt1493; local9++) {
			this.anIntArray74[local9] += arg2;
			this.anIntArray72[local9] += arg0;
			this.anIntArray79[local9] += arg1;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IB)V")
	public void method1366() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1493; local11++) {
			this.anIntArray74[local11] <<= 0x2;
			this.anIntArray72[local11] <<= 0x2;
			this.anIntArray79[local11] <<= 0x2;
		}
		if (this.anInt1483 <= 0 || this.anIntArray78 == null) {
			return;
		}
		for (@Pc(58) int local58 = 0; local58 < this.anIntArray78.length; local58++) {
			this.anIntArray78[local58] <<= 0x2;
			this.anIntArray80[local58] <<= 0x2;
			if (this.aByteArray6[local58] != 1) {
				this.anIntArray71[local58] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)[[I")
	public int[][] method1367() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass347Array1.length; local12++) {
			@Pc(23) int local23 = this.aClass347Array1[local12].anInt9255;
			if (local23 >= 0) {
				if (local10 < local23) {
					local10 = local23;
				}
				@Pc(41) int local41 = local8[local23]++;
			}
		}
		@Pc(59) int[][] local59 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local59[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(84) int local84 = 0; local84 < this.aClass347Array1.length; local84++) {
			@Pc(92) int local92 = this.aClass347Array1[local84].anInt9255;
			if (local92 >= 0) {
				local59[local92][local8[local92]++] = local84;
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "([BB)V")
	private void method1368(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub20 local14 = new Class1_Sub20(arg0);
		@Pc(19) Class1_Sub20 local19 = new Class1_Sub20(arg0);
		@Pc(24) Class1_Sub20 local24 = new Class1_Sub20(arg0);
		@Pc(29) Class1_Sub20 local29 = new Class1_Sub20(arg0);
		@Pc(34) Class1_Sub20 local34 = new Class1_Sub20(arg0);
		local14.anInt5238 = arg0.length - 18;
		this.anInt1493 = local14.method4426();
		this.anInt1492 = local14.method4426();
		this.anInt1483 = local14.method4393();
		@Pc(59) int local59 = local14.method4393();
		@Pc(63) int local63 = local14.method4393();
		@Pc(67) int local67 = local14.method4393();
		@Pc(71) int local71 = local14.method4393();
		@Pc(75) int local75 = local14.method4393();
		@Pc(79) int local79 = local14.method4426();
		@Pc(83) int local83 = local14.method4426();
		@Pc(87) int local87 = local14.method4426();
		@Pc(91) int local91 = local14.method4426();
		@Pc(100) int local100 = this.anInt1493;
		@Pc(102) int local102 = local100;
		local100 += this.anInt1492;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt1492;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt1492;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt1492;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt1493;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt1492;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt1492 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt1483 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		if (local71 == 1) {
			this.anIntArray75 = new int[this.anInt1492];
		}
		local14.anInt5238 = 0;
		this.aShortArray7 = new short[this.anInt1492];
		if (local67 == 1) {
			this.aByteArray5 = new byte[this.anInt1492];
		}
		this.aShortArray16 = new short[this.anInt1492];
		this.anIntArray74 = new int[this.anInt1493];
		this.aShortArray9 = new short[this.anInt1492];
		if (local63 == 255) {
			this.aByteArray9 = new byte[this.anInt1492];
		} else {
			this.aByte21 = (byte) local63;
		}
		if (this.anInt1483 > 0) {
			this.aShortArray11 = new short[this.anInt1483];
			this.aShortArray8 = new short[this.anInt1483];
			this.aByteArray6 = new byte[this.anInt1483];
			this.aShortArray14 = new short[this.anInt1483];
		}
		this.anIntArray72 = new int[this.anInt1493];
		this.aShortArray13 = new short[this.anInt1492];
		if (local59 == 1) {
			this.aByteArray8 = new byte[this.anInt1492];
			this.aShortArray15 = new short[this.anInt1492];
			this.aByteArray10 = new byte[this.anInt1492];
		}
		this.anIntArray79 = new int[this.anInt1493];
		if (local75 == 1) {
			this.anIntArray77 = new int[this.anInt1493];
		}
		local19.anInt5238 = local187;
		local24.anInt5238 = local193;
		local29.anInt5238 = local100;
		local34.anInt5238 = local141;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(356) int local356;
		@Pc(358) int local358;
		for (@Pc(350) int local350 = 0; local350 < this.anInt1493; local350++) {
			local356 = local14.method4393();
			local358 = 0;
			if ((local356 & 0x1) != 0) {
				local358 = local19.method4434();
			}
			@Pc(368) int local368 = 0;
			if ((local356 & 0x2) != 0) {
				local368 = local24.method4434();
			}
			@Pc(378) int local378 = 0;
			if ((local356 & 0x4) != 0) {
				local378 = local29.method4434();
			}
			this.anIntArray74[local350] = local358 + local344;
			this.anIntArray72[local350] = local368 + local346;
			this.anIntArray79[local350] = local378 + local348;
			local346 = this.anIntArray72[local350];
			local344 = this.anIntArray74[local350];
			local348 = this.anIntArray79[local350];
			if (local75 == 1) {
				this.anIntArray77[local350] = local34.method4393();
			}
		}
		local14.anInt5238 = local169;
		local19.anInt5238 = local129;
		local24.anInt5238 = local109;
		local29.anInt5238 = local153;
		local34.anInt5238 = local119;
		for (local356 = 0; local356 < this.anInt1492; local356++) {
			this.aShortArray13[local356] = (short) local14.method4426();
			if (local59 == 1) {
				local358 = local19.method4393();
				if ((local358 & 0x1) == 1) {
					local7 = true;
					this.aByteArray8[local356] = 1;
				} else {
					this.aByteArray8[local356] = 0;
				}
				if ((local358 & 0x2) == 2) {
					this.aByteArray10[local356] = (byte) (local358 >> 2);
					this.aShortArray15[local356] = this.aShortArray13[local356];
					this.aShortArray13[local356] = 127;
					if (this.aShortArray15[local356] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray10[local356] = -1;
					this.aShortArray15[local356] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray9[local356] = local24.method4432();
			}
			if (local67 == 1) {
				this.aByteArray5[local356] = local29.method4432();
			}
			if (local71 == 1) {
				this.anIntArray75[local356] = local34.method4393();
			}
		}
		this.anInt1497 = -1;
		local14.anInt5238 = local163;
		local19.anInt5238 = local102;
		@Pc(589) short local589 = 0;
		@Pc(591) short local591 = 0;
		@Pc(593) short local593 = 0;
		@Pc(595) short local595 = 0;
		@Pc(603) int local603;
		for (@Pc(597) int local597 = 0; local597 < this.anInt1492; local597++) {
			local603 = local19.method4393();
			if (local603 == 1) {
				local589 = (short) (local14.method4434() + local595);
				local591 = (short) (local589 + local14.method4434());
				local593 = (short) (local14.method4434() + local591);
				local595 = local593;
				this.aShortArray16[local597] = local589;
				this.aShortArray7[local597] = local591;
				this.aShortArray9[local597] = local593;
				if (this.anInt1497 < local589) {
					this.anInt1497 = local589;
				}
				if (this.anInt1497 < local591) {
					this.anInt1497 = local591;
				}
				if (local593 > this.anInt1497) {
					this.anInt1497 = local593;
				}
			}
			if (local603 == 2) {
				local591 = local593;
				local593 = (short) (local595 + local14.method4434());
				local595 = local593;
				this.aShortArray16[local597] = local589;
				this.aShortArray7[local597] = local591;
				this.aShortArray9[local597] = local593;
				if (this.anInt1497 < local593) {
					this.anInt1497 = local593;
				}
			}
			if (local603 == 3) {
				local589 = local593;
				local593 = (short) (local14.method4434() + local595);
				this.aShortArray16[local597] = local589;
				local595 = local593;
				this.aShortArray7[local597] = local591;
				this.aShortArray9[local597] = local593;
				if (local593 > this.anInt1497) {
					this.anInt1497 = local593;
				}
			}
			if (local603 == 4) {
				@Pc(754) short local754 = local589;
				local589 = local591;
				local593 = (short) (local14.method4434() + local595);
				local591 = local754;
				local595 = local593;
				this.aShortArray16[local597] = local589;
				this.aShortArray7[local597] = local754;
				this.aShortArray9[local597] = local593;
				if (local593 > this.anInt1497) {
					this.anInt1497 = local593;
				}
			}
		}
		this.anInt1497++;
		local14.anInt5238 = local178;
		for (local603 = 0; local603 < this.anInt1483; local603++) {
			this.aByteArray6[local603] = 0;
			this.aShortArray11[local603] = (short) local14.method4426();
			this.aShortArray14[local603] = (short) local14.method4426();
			this.aShortArray8[local603] = (short) local14.method4426();
		}
		if (this.aByteArray10 != null) {
			@Pc(850) boolean local850 = false;
			for (@Pc(852) int local852 = 0; local852 < this.anInt1492; local852++) {
				@Pc(861) int local861 = this.aByteArray10[local852] & 0xFF;
				if (local861 != 255) {
					if (this.aShortArray16[local852] == (this.aShortArray11[local861] & 0xFFFF) && (this.aShortArray14[local861] & 0xFFFF) == this.aShortArray7[local852] && (this.aShortArray8[local861] & 0xFFFF) == this.aShortArray9[local852]) {
						this.aByteArray10[local852] = -1;
					} else {
						local850 = true;
					}
				}
			}
			if (!local850) {
				this.aByteArray10 = null;
			}
		}
		if (!local9) {
			this.aShortArray15 = null;
		}
		if (!local7) {
			this.aByteArray8 = null;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZZ)[[I")
	public int[][] method1369(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt1493 : this.anInt1497;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray77[local20];
			if (local27 >= 0) {
				@Pc(36) int local36 = local8[local27]++;
				if (local27 > local10) {
					local10 = local27;
				}
			}
		}
		@Pc(59) int[][] local59 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local59[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(84) int local84 = 0; local84 < local18; local84++) {
			@Pc(91) int local91 = this.anIntArray77[local84];
			if (local91 >= 0) {
				local59[local91][local8[local91]++] = local84;
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(SIS)V")
	public void method1370(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray15 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt1492; local11++) {
			if (arg1 == this.aShortArray15[local11]) {
				this.aShortArray15[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BSS)V")
	public void method1371(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1492; local3++) {
			if (arg0 == this.aShortArray13[local3]) {
				this.aShortArray13[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIZI)I")
	public int method1372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1493; local7++) {
			if (arg1 == this.anIntArray74[local7] && this.anIntArray72[local7] == arg2 && this.anIntArray79[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray74[this.anInt1493] = arg1;
		this.anIntArray72[this.anInt1493] = arg2;
		this.anIntArray79[this.anInt1493] = arg0;
		this.anInt1497 = this.anInt1493 + 1;
		return this.anInt1493++;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BISIBISBI)I")
	public int method1373(@OriginalArg(0) byte arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray16[this.anInt1492] = (short) arg4;
		this.aShortArray7[this.anInt1492] = (short) arg7;
		this.aShortArray9[this.anInt1492] = (short) arg2;
		this.aByteArray8[this.anInt1492] = arg6;
		this.aByteArray10[this.anInt1492] = arg3;
		this.aShortArray13[this.anInt1492] = arg1;
		this.aByteArray5[this.anInt1492] = arg0;
		this.aShortArray15[this.anInt1492] = arg5;
		return this.anInt1492++;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I[B)V")
	private void method1375(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub20 local10 = new Class1_Sub20(arg0);
		@Pc(15) Class1_Sub20 local15 = new Class1_Sub20(arg0);
		@Pc(20) Class1_Sub20 local20 = new Class1_Sub20(arg0);
		@Pc(25) Class1_Sub20 local25 = new Class1_Sub20(arg0);
		@Pc(30) Class1_Sub20 local30 = new Class1_Sub20(arg0);
		@Pc(35) Class1_Sub20 local35 = new Class1_Sub20(arg0);
		@Pc(40) Class1_Sub20 local40 = new Class1_Sub20(arg0);
		local10.anInt5238 = arg0.length - 23;
		this.anInt1493 = local10.method4426();
		this.anInt1492 = local10.method4426();
		this.anInt1483 = local10.method4393();
		@Pc(69) int local69 = local10.method4393();
		@Pc(78) boolean local78 = (local69 & 0x1) == 1;
		@Pc(89) boolean local89 = (local69 & 0x2) == 2;
		@Pc(100) boolean local100 = (local69 & 0x4) == 4;
		@Pc(111) boolean local111 = (local69 & 0x8) == 8;
		if (local111) {
			local10.anInt5238 -= 7;
			this.anInt1481 = local10.method4393();
			local10.anInt5238 += 6;
		}
		@Pc(138) int local138 = local10.method4393();
		@Pc(142) int local142 = local10.method4393();
		@Pc(146) int local146 = local10.method4393();
		@Pc(150) int local150 = local10.method4393();
		@Pc(156) int local156 = local10.method4393();
		@Pc(160) int local160 = local10.method4426();
		@Pc(164) int local164 = local10.method4426();
		@Pc(168) int local168 = local10.method4426();
		@Pc(172) int local172 = local10.method4426();
		@Pc(178) int local178 = local10.method4426();
		@Pc(180) int local180 = 0;
		@Pc(182) int local182 = 0;
		@Pc(184) int local184 = 0;
		@Pc(197) int local197;
		if (this.anInt1483 > 0) {
			local10.anInt5238 = 0;
			this.aByteArray6 = new byte[this.anInt1483];
			for (local197 = 0; local197 < this.anInt1483; local197++) {
				@Pc(208) byte local208 = this.aByteArray6[local197] = local10.method4432();
				if (local208 == 0) {
					local180++;
				}
				if (local208 >= 1 && local208 <= 3) {
					local182++;
				}
				if (local208 == 2) {
					local184++;
				}
			}
		}
		local197 = this.anInt1483;
		@Pc(240) int local240 = local197;
		local197 += this.anInt1493;
		@Pc(247) int local247 = local197;
		if (local78) {
			local197 += this.anInt1492;
		}
		@Pc(256) int local256 = local197;
		local197 += this.anInt1492;
		@Pc(263) int local263 = local197;
		if (local138 == 255) {
			local197 += this.anInt1492;
		}
		@Pc(273) int local273 = local197;
		if (local146 == 1) {
			local197 += this.anInt1492;
		}
		@Pc(283) int local283 = local197;
		if (local156 == 1) {
			local197 += this.anInt1493;
		}
		@Pc(293) int local293 = local197;
		if (local142 == 1) {
			local197 += this.anInt1492;
		}
		@Pc(305) int local305 = local197;
		local197 += local172;
		@Pc(311) int local311 = local197;
		if (local150 == 1) {
			local197 += this.anInt1492 * 2;
		}
		@Pc(323) int local323 = local197;
		local197 += local178;
		@Pc(329) int local329 = local197;
		local197 += this.anInt1492 * 2;
		@Pc(338) int local338 = local197;
		local197 += local160;
		@Pc(344) int local344 = local197;
		local197 += local164;
		@Pc(350) int local350 = local197;
		local197 += local168;
		@Pc(356) int local356 = local197;
		local197 += local180 * 6;
		@Pc(364) int local364 = local197;
		local197 += local182 * 6;
		@Pc(372) byte local372 = 6;
		if (this.anInt1481 == 14) {
			local372 = 7;
		} else if (this.anInt1481 >= 15) {
			local372 = 9;
		}
		@Pc(388) int local388 = local197;
		local197 += local372 * local182;
		@Pc(396) int local396 = local197;
		local197 += local182;
		@Pc(402) int local402 = local197;
		local197 += local182;
		@Pc(408) int local408 = local197;
		local197 += local184 * 2 + local182;
		if (local150 == 1) {
			this.aShortArray15 = new short[this.anInt1492];
		}
		if (local156 == 1) {
			this.anIntArray77 = new int[this.anInt1493];
		}
		this.anIntArray74 = new int[this.anInt1493];
		this.aShortArray16 = new short[this.anInt1492];
		this.aShortArray9 = new short[this.anInt1492];
		if (local146 == 1) {
			this.anIntArray75 = new int[this.anInt1492];
		}
		if (local150 == 1 && this.anInt1483 > 0) {
			this.aByteArray10 = new byte[this.anInt1492];
		}
		if (this.anInt1483 > 0) {
			this.aShortArray8 = new short[this.anInt1483];
			if (local184 > 0) {
				this.anIntArray73 = new int[local184];
				this.anIntArray81 = new int[local184];
			}
			this.aShortArray14 = new short[this.anInt1483];
			this.aShortArray11 = new short[this.anInt1483];
			if (local182 > 0) {
				this.anIntArray71 = new int[local182];
				this.anIntArray76 = new int[local182];
				this.anIntArray80 = new int[local182];
				this.anIntArray78 = new int[local182];
				this.aByteArray11 = new byte[local182];
				this.aByteArray7 = new byte[local182];
			}
		}
		if (local142 == 1) {
			this.aByteArray5 = new byte[this.anInt1492];
		}
		if (local78) {
			this.aByteArray8 = new byte[this.anInt1492];
		}
		if (local138 == 255) {
			this.aByteArray9 = new byte[this.anInt1492];
		} else {
			this.aByte21 = (byte) local138;
		}
		this.aShortArray7 = new short[this.anInt1492];
		this.anIntArray79 = new int[this.anInt1493];
		this.anIntArray72 = new int[this.anInt1493];
		this.aShortArray13 = new short[this.anInt1492];
		local10.anInt5238 = local240;
		local15.anInt5238 = local338;
		local20.anInt5238 = local344;
		local25.anInt5238 = local350;
		local30.anInt5238 = local283;
		@Pc(613) int local613 = 0;
		@Pc(615) int local615 = 0;
		@Pc(617) int local617 = 0;
		@Pc(625) int local625;
		for (@Pc(619) int local619 = 0; local619 < this.anInt1493; local619++) {
			local625 = local10.method4393();
			@Pc(627) int local627 = 0;
			if ((local625 & 0x1) != 0) {
				local627 = local15.method4434();
			}
			@Pc(640) int local640 = 0;
			if ((local625 & 0x2) != 0) {
				local640 = local20.method4434();
			}
			@Pc(652) int local652 = 0;
			if ((local625 & 0x4) != 0) {
				local652 = local25.method4434();
			}
			this.anIntArray74[local619] = local627 + local613;
			this.anIntArray72[local619] = local640 + local615;
			this.anIntArray79[local619] = local652 + local617;
			local615 = this.anIntArray72[local619];
			local617 = this.anIntArray79[local619];
			local613 = this.anIntArray74[local619];
			if (local156 == 1) {
				this.anIntArray77[local619] = local30.method4393();
			}
		}
		local10.anInt5238 = local329;
		local15.anInt5238 = local247;
		local20.anInt5238 = local263;
		local25.anInt5238 = local293;
		local30.anInt5238 = local273;
		local35.anInt5238 = local311;
		local40.anInt5238 = local323;
		for (local625 = 0; local625 < this.anInt1492; local625++) {
			this.aShortArray13[local625] = (short) local10.method4426();
			if (local78) {
				this.aByteArray8[local625] = local15.method4432();
			}
			if (local138 == 255) {
				this.aByteArray9[local625] = local20.method4432();
			}
			if (local142 == 1) {
				this.aByteArray5[local625] = local25.method4432();
			}
			if (local146 == 1) {
				this.anIntArray75[local625] = local30.method4393();
			}
			if (local150 == 1) {
				this.aShortArray15[local625] = (short) (local35.method4426() - 1);
			}
			if (this.aByteArray10 != null) {
				if (this.aShortArray15[local625] == -1) {
					this.aByteArray10[local625] = -1;
				} else {
					this.aByteArray10[local625] = (byte) (local40.method4393() - 1);
				}
			}
		}
		local10.anInt5238 = local305;
		this.anInt1497 = -1;
		local15.anInt5238 = local256;
		@Pc(857) short local857 = 0;
		@Pc(859) short local859 = 0;
		@Pc(861) short local861 = 0;
		@Pc(863) short local863 = 0;
		@Pc(873) int local873;
		for (@Pc(865) int local865 = 0; local865 < this.anInt1492; local865++) {
			local873 = local15.method4393();
			if (local873 == 1) {
				local857 = (short) (local863 + local10.method4434());
				local859 = (short) (local10.method4434() + local857);
				local861 = (short) (local10.method4434() + local859);
				this.aShortArray16[local865] = local857;
				local863 = local861;
				this.aShortArray7[local865] = local859;
				this.aShortArray9[local865] = local861;
				if (local857 > this.anInt1497) {
					this.anInt1497 = local857;
				}
				if (this.anInt1497 < local859) {
					this.anInt1497 = local859;
				}
				if (this.anInt1497 < local861) {
					this.anInt1497 = local861;
				}
			}
			if (local873 == 2) {
				local859 = local861;
				local861 = (short) (local10.method4434() + local863);
				local863 = local861;
				this.aShortArray16[local865] = local857;
				this.aShortArray7[local865] = local859;
				this.aShortArray9[local865] = local861;
				if (this.anInt1497 < local861) {
					this.anInt1497 = local861;
				}
			}
			if (local873 == 3) {
				local857 = local861;
				local861 = (short) (local863 + local10.method4434());
				this.aShortArray16[local865] = local857;
				local863 = local861;
				this.aShortArray7[local865] = local859;
				this.aShortArray9[local865] = local861;
				if (local861 > this.anInt1497) {
					this.anInt1497 = local861;
				}
			}
			if (local873 == 4) {
				@Pc(1036) short local1036 = local857;
				local857 = local859;
				local861 = (short) (local10.method4434() + local863);
				local859 = local1036;
				local863 = local861;
				this.aShortArray16[local865] = local857;
				this.aShortArray7[local865] = local1036;
				this.aShortArray9[local865] = local861;
				if (this.anInt1497 < local861) {
					this.anInt1497 = local861;
				}
			}
		}
		local10.anInt5238 = local356;
		this.anInt1497++;
		local15.anInt5238 = local364;
		local20.anInt5238 = local388;
		local25.anInt5238 = local396;
		local30.anInt5238 = local402;
		local35.anInt5238 = local408;
		@Pc(1115) int local1115;
		for (local873 = 0; local873 < this.anInt1483; local873++) {
			local1115 = this.aByteArray6[local873] & 0xFF;
			if (local1115 == 0) {
				this.aShortArray11[local873] = (short) local10.method4426();
				this.aShortArray14[local873] = (short) local10.method4426();
				this.aShortArray8[local873] = (short) local10.method4426();
			}
			if (local1115 == 1) {
				this.aShortArray11[local873] = (short) local15.method4426();
				this.aShortArray14[local873] = (short) local15.method4426();
				this.aShortArray8[local873] = (short) local15.method4426();
				if (this.anInt1481 >= 15) {
					this.anIntArray78[local873] = local20.method4396();
					this.anIntArray80[local873] = local20.method4396();
					this.anIntArray71[local873] = local20.method4396();
				} else {
					this.anIntArray78[local873] = local20.method4426();
					if (this.anInt1481 >= 14) {
						this.anIntArray80[local873] = local20.method4396();
					} else {
						this.anIntArray80[local873] = local20.method4426();
					}
					this.anIntArray71[local873] = local20.method4426();
				}
				this.aByteArray11[local873] = local25.method4432();
				this.aByteArray7[local873] = local30.method4432();
				this.anIntArray76[local873] = local35.method4432();
			}
			if (local1115 == 2) {
				this.aShortArray11[local873] = (short) local15.method4426();
				this.aShortArray14[local873] = (short) local15.method4426();
				this.aShortArray8[local873] = (short) local15.method4426();
				if (this.anInt1481 < 15) {
					this.anIntArray78[local873] = local20.method4426();
					if (this.anInt1481 >= 14) {
						this.anIntArray80[local873] = local20.method4396();
					} else {
						this.anIntArray80[local873] = local20.method4426();
					}
					this.anIntArray71[local873] = local20.method4426();
				} else {
					this.anIntArray78[local873] = local20.method4396();
					this.anIntArray80[local873] = local20.method4396();
					this.anIntArray71[local873] = local20.method4396();
				}
				this.aByteArray11[local873] = local25.method4432();
				this.aByteArray7[local873] = local30.method4432();
				this.anIntArray76[local873] = local35.method4432();
				this.anIntArray81[local873] = local35.method4432();
				this.anIntArray73[local873] = local35.method4432();
			}
			if (local1115 == 3) {
				this.aShortArray11[local873] = (short) local15.method4426();
				this.aShortArray14[local873] = (short) local15.method4426();
				this.aShortArray8[local873] = (short) local15.method4426();
				if (this.anInt1481 >= 15) {
					this.anIntArray78[local873] = local20.method4396();
					this.anIntArray80[local873] = local20.method4396();
					this.anIntArray71[local873] = local20.method4396();
				} else {
					this.anIntArray78[local873] = local20.method4426();
					if (this.anInt1481 >= 14) {
						this.anIntArray80[local873] = local20.method4396();
					} else {
						this.anIntArray80[local873] = local20.method4426();
					}
					this.anIntArray71[local873] = local20.method4426();
				}
				this.aByteArray11[local873] = local25.method4432();
				this.aByteArray7[local873] = local30.method4432();
				this.anIntArray76[local873] = local35.method4432();
			}
		}
		local10.anInt5238 = local197;
		@Pc(1532) int local1532;
		@Pc(1538) int local1538;
		@Pc(1542) int local1542;
		@Pc(1607) int local1607;
		if (local89) {
			local1115 = local10.method4393();
			if (local1115 > 0) {
				this.aClass219Array1 = new Class219[local1115];
				for (local1532 = 0; local1532 < local1115; local1532++) {
					local1538 = local10.method4426();
					local1542 = local10.method4426();
					@Pc(1552) byte local1552;
					if (local138 == 255) {
						local1552 = this.aByteArray9[local1542];
					} else {
						local1552 = (byte) local138;
					}
					this.aClass219Array1[local1532] = new Class219(local1538, this.aShortArray16[local1542], this.aShortArray7[local1542], this.aShortArray9[local1542], local1552);
				}
			}
			local1532 = local10.method4393();
			if (local1532 > 0) {
				this.aClass101Array1 = new Class101[local1532];
				for (local1538 = 0; local1538 < local1532; local1538++) {
					local1542 = local10.method4426();
					local1607 = local10.method4426();
					this.aClass101Array1[local1538] = new Class101(local1542, local1607);
				}
			}
		}
		if (!local100) {
			return;
		}
		local1115 = local10.method4393();
		if (local1115 <= 0) {
			return;
		}
		this.aClass347Array1 = new Class347[local1115];
		for (local1532 = 0; local1532 < local1115; local1532++) {
			local1538 = local10.method4426();
			local1542 = local10.method4426();
			local1607 = local10.method4393();
			@Pc(1661) byte local1661 = local10.method4432();
			this.aClass347Array1[local1532] = new Class347(local1538, local1542, local1607, local1661);
		}
		return;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BIII)V")
	public void method1376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(23) int local23;
		@Pc(41) int local41;
		if (arg1 != 0) {
			local17 = Class151.anIntArray244[arg1];
			local21 = Class151.anIntArray245[arg1];
			for (local23 = 0; local23 < this.anInt1493; local23++) {
				local41 = this.anIntArray74[local23] * local21 + local17 * this.anIntArray72[local23] >> 14;
				this.anIntArray72[local23] = local21 * this.anIntArray72[local23] - local17 * this.anIntArray74[local23] >> 14;
				this.anIntArray74[local23] = local41;
			}
		}
		if (arg2 != 0) {
			local17 = Class151.anIntArray244[arg2];
			local21 = Class151.anIntArray245[arg2];
			for (local23 = 0; local23 < this.anInt1493; local23++) {
				local41 = this.anIntArray72[local23] * local21 - this.anIntArray79[local23] * local17 >> 14;
				this.anIntArray79[local23] = this.anIntArray72[local23] * local17 + this.anIntArray79[local23] * local21 >> 14;
				this.anIntArray72[local23] = local41;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local17 = Class151.anIntArray244[arg0];
		local21 = Class151.anIntArray245[arg0];
		for (local23 = 0; local23 < this.anInt1493; local23++) {
			local41 = local17 * this.anIntArray79[local23] + local21 * this.anIntArray74[local23] >> 14;
			this.anIntArray79[local23] = local21 * this.anIntArray79[local23] - this.anIntArray74[local23] * local17 >> 14;
			this.anIntArray74[local23] = local41;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ISILclient!cca;)I")
	private int method1377(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class43 arg2) {
		@Pc(19) int local19 = arg2.anIntArray74[arg1];
		@Pc(24) int local24 = arg2.anIntArray72[arg1];
		@Pc(29) int local29 = arg2.anIntArray79[arg1];
		for (@Pc(31) int local31 = 0; local31 < this.anInt1493; local31++) {
			if (this.anIntArray74[local31] == local19 && local24 == this.anIntArray72[local31] && this.anIntArray79[local31] == local29) {
				this.aShortArray10[local31] |= arg0;
				return local31;
			}
		}
		this.anIntArray74[this.anInt1493] = local19;
		this.anIntArray72[this.anInt1493] = local24;
		this.anIntArray79[this.anInt1493] = local29;
		this.aShortArray10[this.anInt1493] = arg0;
		this.anIntArray77[this.anInt1493] = arg2.anIntArray77 == null ? -1 : arg2.anIntArray77[arg1];
		return this.anInt1493++;
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)[[I")
	public int[][] method1378() {
		@Pc(16) int[] local16 = new int[256];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1492; local20++) {
			@Pc(27) int local27 = this.anIntArray75[local20];
			if (local27 >= 0) {
				@Pc(36) int local36 = local16[local27]++;
				if (local18 < local27) {
					local18 = local27;
				}
			}
		}
		@Pc(62) int[][] local62 = new int[local18 + 1][];
		for (@Pc(64) int local64 = 0; local64 <= local18; local64++) {
			local62[local64] = new int[local16[local64]];
			local16[local64] = 0;
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt1492; local87++) {
			@Pc(94) int local94 = this.anIntArray75[local87];
			if (local94 >= 0) {
				local62[local94][local16[local94]++] = local87;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(SSBSSSBBBS)B")
	public byte method1379() {
		if (this.anInt1483 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray6[this.anInt1483] = 3;
		this.aShortArray11[this.anInt1483] = 0;
		this.aShortArray14[this.anInt1483] = 32767;
		this.aShortArray8[this.anInt1483] = 0;
		this.anIntArray78[this.anInt1483] = 1024;
		this.anIntArray80[this.anInt1483] = 1024;
		this.anIntArray71[this.anInt1483] = 1024;
		this.aByteArray11[this.anInt1483] = 0;
		this.aByteArray7[this.anInt1483] = 0;
		this.anIntArray76[this.anInt1483] = 0;
		return (byte) this.anInt1483++;
	}
}
