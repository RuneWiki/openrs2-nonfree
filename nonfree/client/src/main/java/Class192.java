import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class192 {

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "[B")
	public static final byte[] aByteArray64 = new byte[32896];

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "[Lclient!aaa;")
	public Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "[Lclient!rn;")
	public Class265[] aClass265Array5;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "[I")
	public int[] anIntArray389;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "[I")
	public int[] anIntArray391;

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "[I")
	public int[] anIntArray392;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "[Lclient!ig;")
	public Class142[] aClass142Array5;

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!ln", name = "G", descriptor = "[I")
	public int[] anIntArray393;

	@OriginalMember(owner = "client!ln", name = "H", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "[I")
	public int[] anIntArray394;

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!ln", name = "N", descriptor = "[S")
	public short[] aShortArray83;

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!ln", name = "U", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!ln", name = "V", descriptor = "[I")
	public int[] anIntArray395;

	@OriginalMember(owner = "client!ln", name = "W", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!ln", name = "X", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!ln", name = "ab", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "B")
	public byte aByte66 = 0;

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
	public int anInt5543 = 0;

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
	public int anInt5546 = 0;

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "I")
	public int anInt5557 = 0;

	@OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
	public int anInt5552 = 12;

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
	public int anInt5556 = 0;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray64[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "([B)V")
	public Class192(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4668(arg0);
		} else {
			this.method4659(arg0);
		}
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(III)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray386 = new int[arg0];
		this.aShortArray86 = new short[arg1];
		this.anIntArray387 = new int[arg0];
		this.aByteArray65 = new byte[arg1];
		this.aShortArray82 = new short[arg1];
		this.aShortArray80 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray392 = new int[arg2];
			this.aShortArray83 = new short[arg2];
			this.anIntArray395 = new int[arg2];
			this.aByteArray67 = new byte[arg2];
			this.aShortArray78 = new short[arg2];
			this.aShortArray81 = new short[arg2];
			this.aByteArray68 = new byte[arg2];
			this.aByteArray69 = new byte[arg2];
			this.anIntArray389 = new int[arg2];
			this.anIntArray385 = new int[arg2];
			this.anIntArray391 = new int[arg2];
			this.anIntArray393 = new int[arg2];
		}
		this.anIntArray394 = new int[arg0];
		this.aByteArray62 = new byte[arg1];
		this.aShortArray85 = new short[arg1];
		this.anIntArray390 = new int[arg0];
		this.anIntArray388 = new int[arg1];
		this.aByteArray66 = new byte[arg1];
		this.aByteArray63 = new byte[arg1];
		this.aShortArray84 = new short[arg1];
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "([Lclient!ln;I)V")
	public Class192(@OriginalArg(0) Class192[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5557 = 0;
		this.anInt5543 = 0;
		this.anInt5556 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte66 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class192 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5543 += local59.anInt5543;
				this.anInt5556 += local59.anInt5556;
				this.anInt5557 += local59.anInt5557;
				local38 |= local59.aByteArray65 != null;
				if (local59.aClass142Array5 != null) {
					local32 += local59.aClass142Array5.length;
				}
				if (local59.aClass2Array1 != null) {
					local36 += local59.aClass2Array1.length;
				}
				if (local59.aClass265Array5 != null) {
					local34 += local59.aClass265Array5.length;
				}
				local44 |= local59.aByteArray63 != null;
				local46 |= local59.aShortArray80 != null;
				local42 |= local59.aByteArray62 != null;
				local51 |= local59.anIntArray388 != null;
				if (local59.aByteArray66 == null) {
					if (this.aByte66 == -1) {
						this.aByte66 = local59.aByte66;
					}
					if (this.aByte66 != local59.aByte66) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		if (local51) {
			this.anIntArray388 = new int[this.anInt5556];
		}
		if (this.anInt5557 > 0) {
			this.anIntArray392 = new int[this.anInt5557];
			this.anIntArray395 = new int[this.anInt5557];
			this.aByteArray67 = new byte[this.anInt5557];
			this.aByteArray69 = new byte[this.anInt5557];
			this.aByteArray68 = new byte[this.anInt5557];
			this.anIntArray391 = new int[this.anInt5557];
			this.anIntArray389 = new int[this.anInt5557];
			this.aShortArray81 = new short[this.anInt5557];
			this.aShortArray83 = new short[this.anInt5557];
			this.anIntArray393 = new int[this.anInt5557];
			this.anIntArray385 = new int[this.anInt5557];
			this.aShortArray78 = new short[this.anInt5557];
		}
		this.anIntArray390 = new int[this.anInt5543];
		this.anIntArray394 = new int[this.anInt5543];
		if (local32 > 0) {
			this.aClass142Array5 = new Class142[local32];
		}
		this.aShortArray79 = new short[this.anInt5556];
		this.aShortArray82 = new short[this.anInt5556];
		this.aShortArray84 = new short[this.anInt5556];
		this.aShortArray86 = new short[this.anInt5556];
		if (local34 > 0) {
			this.aClass265Array5 = new Class265[local34];
		}
		if (local44) {
			this.aByteArray63 = new byte[this.anInt5556];
		}
		if (local40) {
			this.aByteArray66 = new byte[this.anInt5556];
		}
		if (local36 > 0) {
			this.aClass2Array1 = new Class2[local36];
		}
		this.anIntArray386 = new int[this.anInt5543];
		if (local46) {
			this.aShortArray80 = new short[this.anInt5556];
		}
		if (local42) {
			this.aByteArray62 = new byte[this.anInt5556];
		}
		if (local38) {
			this.aByteArray65 = new byte[this.anInt5556];
		}
		this.anIntArray387 = new int[this.anInt5543];
		this.aShortArray77 = new short[this.anInt5543];
		this.aShortArray85 = new short[this.anInt5556];
		local34 = 0;
		this.anInt5557 = 0;
		local32 = 0;
		this.anInt5556 = 0;
		local36 = 0;
		this.anInt5543 = 0;
		@Pc(616) int local616;
		@Pc(627) int local627;
		for (@Pc(384) int local384 = 0; local384 < arg1; local384++) {
			@Pc(391) short local391 = (short) (0x1 << local384);
			@Pc(395) Class192 local395 = arg0[local384];
			if (local395 != null) {
				@Pc(402) int local402;
				if (local395.aClass2Array1 != null) {
					for (local402 = 0; local402 < local395.aClass2Array1.length; local402++) {
						@Pc(409) Class2 local409 = local395.aClass2Array1[local402];
						this.aClass2Array1[local36++] = local409.method190(this.anInt5556 + local409.anInt52);
					}
				}
				for (local402 = 0; local402 < local395.anInt5556; local402++) {
					if (local38 && local395.aByteArray65 != null) {
						this.aByteArray65[this.anInt5556] = local395.aByteArray65[local402];
					}
					if (local40) {
						if (local395.aByteArray66 == null) {
							this.aByteArray66[this.anInt5556] = local395.aByte66;
						} else {
							this.aByteArray66[this.anInt5556] = local395.aByteArray66[local402];
						}
					}
					if (local42 && local395.aByteArray62 != null) {
						this.aByteArray62[this.anInt5556] = local395.aByteArray62[local402];
					}
					if (local46) {
						if (local395.aShortArray80 == null) {
							this.aShortArray80[this.anInt5556] = -1;
						} else {
							this.aShortArray80[this.anInt5556] = local395.aShortArray80[local402];
						}
					}
					if (local51) {
						if (local395.anIntArray388 == null) {
							this.anIntArray388[this.anInt5556] = -1;
						} else {
							this.anIntArray388[this.anInt5556] = local395.anIntArray388[local402];
						}
					}
					this.aShortArray84[this.anInt5556] = (short) this.method4658(local391, local395, local395.aShortArray84[local402]);
					this.aShortArray86[this.anInt5556] = (short) this.method4658(local391, local395, local395.aShortArray86[local402]);
					this.aShortArray82[this.anInt5556] = (short) this.method4658(local391, local395, local395.aShortArray82[local402]);
					this.aShortArray79[this.anInt5556] = local391;
					this.aShortArray85[this.anInt5556] = local395.aShortArray85[local402];
					this.anInt5556++;
				}
				@Pc(603) int local603;
				if (local395.aClass142Array5 != null) {
					for (local603 = 0; local603 < local395.aClass142Array5.length; local603++) {
						local616 = this.method4658(local391, local395, local395.aClass142Array5[local603].anInt4538);
						local627 = this.method4658(local391, local395, local395.aClass142Array5[local603].anInt4540);
						@Pc(638) int local638 = this.method4658(local391, local395, local395.aClass142Array5[local603].anInt4542);
						this.aClass142Array5[local32] = local395.aClass142Array5[local603].method3821(local627, local616, local638);
						local32++;
					}
				}
				if (local395.aClass265Array5 != null) {
					for (local603 = 0; local603 < local395.aClass265Array5.length; local603++) {
						local616 = this.method4658(local391, local395, local395.aClass265Array5[local603].anInt7977);
						this.aClass265Array5[local34] = local395.aClass265Array5[local603].method6598(local616);
						local34++;
					}
				}
			}
		}
		this.anInt5546 = this.anInt5543;
		@Pc(716) int local716 = 0;
		for (@Pc(718) int local718 = 0; local718 < arg1; local718++) {
			@Pc(725) short local725 = (short) (0x1 << local718);
			@Pc(729) Class192 local729 = arg0[local718];
			if (local729 != null) {
				for (local616 = 0; local616 < local729.anInt5556; local616++) {
					if (local44) {
						this.aByteArray63[local716++] = (byte) (local729.aByteArray63 == null || local729.aByteArray63[local616] == -1 ? -1 : local729.aByteArray63[local616] + this.anInt5557);
					}
				}
				for (local627 = 0; local627 < local729.anInt5557; local627++) {
					@Pc(786) byte local786 = this.aByteArray68[this.anInt5557] = local729.aByteArray68[local627];
					if (local786 == 0) {
						this.aShortArray78[this.anInt5557] = (short) this.method4658(local725, local729, local729.aShortArray78[local627]);
						this.aShortArray83[this.anInt5557] = (short) this.method4658(local725, local729, local729.aShortArray83[local627]);
						this.aShortArray81[this.anInt5557] = (short) this.method4658(local725, local729, local729.aShortArray81[local627]);
					}
					if (local786 >= 1 && local786 <= 3) {
						this.aShortArray78[this.anInt5557] = local729.aShortArray78[local627];
						this.aShortArray83[this.anInt5557] = local729.aShortArray83[local627];
						this.aShortArray81[this.anInt5557] = local729.aShortArray81[local627];
						this.anIntArray392[this.anInt5557] = local729.anIntArray392[local627];
						this.anIntArray385[this.anInt5557] = local729.anIntArray385[local627];
						this.anIntArray393[this.anInt5557] = local729.anIntArray393[local627];
						this.aByteArray67[this.anInt5557] = local729.aByteArray67[local627];
						this.aByteArray69[this.anInt5557] = local729.aByteArray69[local627];
						this.anIntArray395[this.anInt5557] = local729.anIntArray395[local627];
					}
					if (local786 == 2) {
						this.anIntArray389[this.anInt5557] = local729.anIntArray389[local627];
						this.anIntArray391[this.anInt5557] = local729.anIntArray391[local627];
					}
					this.anInt5557++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZB)[[I")
	public int[][] method4656(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt5543 : this.anInt5546;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray390[local20];
			if (local27 >= 0) {
				@Pc(36) int local36 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(53) int[][] local53 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local53[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
			@Pc(86) int local86 = this.anIntArray390[local79];
			if (local86 >= 0) {
				local53[local86][local8[local86]++] = local79;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	public void method4657() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5543; local3++) {
			this.anIntArray386[local3] <<= 0x0;
			this.anIntArray394[local3] <<= 0x0;
			this.anIntArray387[local3] <<= 0x0;
		}
		if (this.anInt5557 <= 0 || this.anIntArray392 == null) {
			return;
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray392.length; local61++) {
			this.anIntArray392[local61] <<= 0x0;
			this.anIntArray385[local61] <<= 0x0;
			if (this.aByteArray68[local61] != 1) {
				this.anIntArray393[local61] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(SBLclient!ln;I)I")
	private int method4658(@OriginalArg(0) short arg0, @OriginalArg(2) Class192 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg1.anIntArray386[arg2];
		@Pc(23) int local23 = arg1.anIntArray394[arg2];
		@Pc(28) int local28 = arg1.anIntArray387[arg2];
		for (@Pc(30) int local30 = 0; local30 < this.anInt5543; local30++) {
			if (this.anIntArray386[local30] == local18 && this.anIntArray394[local30] == local23 && local28 == this.anIntArray387[local30]) {
				this.aShortArray77[local30] |= arg0;
				return local30;
			}
		}
		this.anIntArray386[this.anInt5543] = local18;
		this.anIntArray394[this.anInt5543] = local23;
		this.anIntArray387[this.anInt5543] = local28;
		this.aShortArray77[this.anInt5543] = arg0;
		this.anIntArray390[this.anInt5543] = arg1.anIntArray390 == null ? -1 : arg1.anIntArray390[arg2];
		return this.anInt5543++;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[B)V")
	private void method4659(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class12_Sub8 local14 = new Class12_Sub8(arg0);
		@Pc(19) Class12_Sub8 local19 = new Class12_Sub8(arg0);
		@Pc(24) Class12_Sub8 local24 = new Class12_Sub8(arg0);
		@Pc(29) Class12_Sub8 local29 = new Class12_Sub8(arg0);
		@Pc(34) Class12_Sub8 local34 = new Class12_Sub8(arg0);
		local14.anInt6217 = arg0.length - 18;
		this.anInt5543 = local14.method5199();
		this.anInt5556 = local14.method5199();
		this.anInt5557 = local14.method5216();
		@Pc(59) int local59 = local14.method5216();
		@Pc(63) int local63 = local14.method5216();
		@Pc(67) int local67 = local14.method5216();
		@Pc(71) int local71 = local14.method5216();
		@Pc(75) int local75 = local14.method5216();
		@Pc(79) int local79 = local14.method5199();
		@Pc(83) int local83 = local14.method5199();
		@Pc(87) int local87 = local14.method5199();
		@Pc(91) int local91 = local14.method5199();
		@Pc(104) int local104 = this.anInt5543;
		@Pc(106) int local106 = local104;
		local104 += this.anInt5556;
		@Pc(113) int local113 = local104;
		if (local63 == 255) {
			local104 += this.anInt5556;
		}
		@Pc(125) int local125 = local104;
		if (local71 == 1) {
			local104 += this.anInt5556;
		}
		@Pc(135) int local135 = local104;
		if (local59 == 1) {
			local104 += this.anInt5556;
		}
		@Pc(145) int local145 = local104;
		if (local75 == 1) {
			local104 += this.anInt5543;
		}
		@Pc(155) int local155 = local104;
		if (local67 == 1) {
			local104 += this.anInt5556;
		}
		@Pc(167) int local167 = local104;
		local104 += local91;
		@Pc(173) int local173 = local104;
		local104 += this.anInt5556 * 2;
		@Pc(182) int local182 = local104;
		local104 += this.anInt5557 * 6;
		@Pc(191) int local191 = local104;
		local104 += local79;
		@Pc(197) int local197 = local104;
		local104 += local83;
		this.anIntArray387 = new int[this.anInt5543];
		this.anIntArray386 = new int[this.anInt5543];
		if (local63 == 255) {
			this.aByteArray66 = new byte[this.anInt5556];
		} else {
			this.aByte66 = (byte) local63;
		}
		this.anIntArray394 = new int[this.anInt5543];
		if (this.anInt5557 > 0) {
			this.aByteArray68 = new byte[this.anInt5557];
			this.aShortArray81 = new short[this.anInt5557];
			this.aShortArray83 = new short[this.anInt5557];
			this.aShortArray78 = new short[this.anInt5557];
		}
		local14.anInt6217 = 0;
		if (local67 == 1) {
			this.aByteArray62 = new byte[this.anInt5556];
		}
		if (local59 == 1) {
			this.aShortArray80 = new short[this.anInt5556];
			this.aByteArray65 = new byte[this.anInt5556];
			this.aByteArray63 = new byte[this.anInt5556];
		}
		this.aShortArray86 = new short[this.anInt5556];
		this.aShortArray82 = new short[this.anInt5556];
		this.aShortArray84 = new short[this.anInt5556];
		if (local71 == 1) {
			this.anIntArray388 = new int[this.anInt5556];
		}
		this.aShortArray85 = new short[this.anInt5556];
		if (local75 == 1) {
			this.anIntArray390 = new int[this.anInt5543];
		}
		local19.anInt6217 = local191;
		local24.anInt6217 = local197;
		local29.anInt6217 = local104;
		local34.anInt6217 = local145;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(359) int local359;
		@Pc(361) int local361;
		for (@Pc(353) int local353 = 0; local353 < this.anInt5543; local353++) {
			local359 = local14.method5216();
			local361 = 0;
			if ((local359 & 0x1) != 0) {
				local361 = local19.method5203();
			}
			@Pc(374) int local374 = 0;
			if ((local359 & 0x2) != 0) {
				local374 = local24.method5203();
			}
			@Pc(384) int local384 = 0;
			if ((local359 & 0x4) != 0) {
				local384 = local29.method5203();
			}
			this.anIntArray386[local353] = local347 + local361;
			this.anIntArray394[local353] = local349 + local374;
			this.anIntArray387[local353] = local351 + local384;
			local351 = this.anIntArray387[local353];
			local347 = this.anIntArray386[local353];
			local349 = this.anIntArray394[local353];
			if (local75 == 1) {
				this.anIntArray390[local353] = local34.method5216();
			}
		}
		local14.anInt6217 = local173;
		local19.anInt6217 = local135;
		local24.anInt6217 = local113;
		local29.anInt6217 = local155;
		local34.anInt6217 = local125;
		for (local359 = 0; local359 < this.anInt5556; local359++) {
			this.aShortArray85[local359] = (short) local14.method5199();
			if (local59 == 1) {
				local361 = local19.method5216();
				if ((local361 & 0x1) == 1) {
					this.aByteArray65[local359] = 1;
					local7 = true;
				} else {
					this.aByteArray65[local359] = 0;
				}
				if ((local361 & 0x2) == 2) {
					this.aByteArray63[local359] = (byte) (local361 >> 2);
					this.aShortArray80[local359] = this.aShortArray85[local359];
					this.aShortArray85[local359] = 127;
					if (this.aShortArray80[local359] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray63[local359] = -1;
					this.aShortArray80[local359] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray66[local359] = local24.method5173();
			}
			if (local67 == 1) {
				this.aByteArray62[local359] = local29.method5173();
			}
			if (local71 == 1) {
				this.anIntArray388[local359] = local34.method5216();
			}
		}
		this.anInt5546 = -1;
		local14.anInt6217 = local167;
		local19.anInt6217 = local106;
		@Pc(599) short local599 = 0;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(613) int local613;
		for (@Pc(607) int local607 = 0; local607 < this.anInt5556; local607++) {
			local613 = local19.method5216();
			if (local613 == 1) {
				local599 = (short) (local605 + local14.method5203());
				local601 = (short) (local14.method5203() + local599);
				local603 = (short) (local14.method5203() + local601);
				local605 = local603;
				this.aShortArray84[local607] = local599;
				this.aShortArray86[local607] = local601;
				this.aShortArray82[local607] = local603;
				if (local599 > this.anInt5546) {
					this.anInt5546 = local599;
				}
				if (this.anInt5546 < local601) {
					this.anInt5546 = local601;
				}
				if (local603 > this.anInt5546) {
					this.anInt5546 = local603;
				}
			}
			if (local613 == 2) {
				local601 = local603;
				local603 = (short) (local14.method5203() + local605);
				this.aShortArray84[local607] = local599;
				local605 = local603;
				this.aShortArray86[local607] = local601;
				this.aShortArray82[local607] = local603;
				if (this.anInt5546 < local603) {
					this.anInt5546 = local603;
				}
			}
			if (local613 == 3) {
				local599 = local603;
				local603 = (short) (local605 + local14.method5203());
				local605 = local603;
				this.aShortArray84[local607] = local599;
				this.aShortArray86[local607] = local601;
				this.aShortArray82[local607] = local603;
				if (local603 > this.anInt5546) {
					this.anInt5546 = local603;
				}
			}
			if (local613 == 4) {
				@Pc(772) short local772 = local599;
				local599 = local601;
				local601 = local772;
				local603 = (short) (local605 + local14.method5203());
				this.aShortArray84[local607] = local599;
				local605 = local603;
				this.aShortArray86[local607] = local772;
				this.aShortArray82[local607] = local603;
				if (local603 > this.anInt5546) {
					this.anInt5546 = local603;
				}
			}
		}
		this.anInt5546++;
		local14.anInt6217 = local182;
		for (local613 = 0; local613 < this.anInt5557; local613++) {
			this.aByteArray68[local613] = 0;
			this.aShortArray78[local613] = (short) local14.method5199();
			this.aShortArray83[local613] = (short) local14.method5199();
			this.aShortArray81[local613] = (short) local14.method5199();
		}
		if (this.aByteArray63 != null) {
			@Pc(870) boolean local870 = false;
			for (@Pc(872) int local872 = 0; local872 < this.anInt5556; local872++) {
				@Pc(881) int local881 = this.aByteArray63[local872] & 0xFF;
				if (local881 != 255) {
					if ((this.aShortArray78[local881] & 0xFFFF) == this.aShortArray84[local872] && this.aShortArray86[local872] == (this.aShortArray83[local881] & 0xFFFF) && this.aShortArray82[local872] == (this.aShortArray81[local881] & 0xFFFF)) {
						this.aByteArray63[local872] = -1;
					} else {
						local870 = true;
					}
				}
			}
			if (!local870) {
				this.aByteArray63 = null;
			}
		}
		if (!local7) {
			this.aByteArray65 = null;
		}
		if (!local9) {
			this.aShortArray80 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIBSSBIIB)I")
	public int method4660(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) short arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray84[this.anInt5556] = (short) arg5;
		this.aShortArray86[this.anInt5556] = (short) arg6;
		this.aShortArray82[this.anInt5556] = (short) arg0;
		this.aByteArray65[this.anInt5556] = arg4;
		this.aByteArray63[this.anInt5556] = arg7;
		this.aShortArray85[this.anInt5556] = arg3;
		this.aByteArray62[this.anInt5556] = arg1;
		this.aShortArray80[this.anInt5556] = arg2;
		return this.anInt5556++;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)[[I")
	public int[][] method4661() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass2Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass2Array1[local12].anInt57;
			if (local20 >= 0) {
				@Pc(29) int local29 = local8[local20]++;
				if (local10 < local20) {
					local10 = local20;
				}
			}
		}
		@Pc(60) int[][] local60 = new int[local10 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local10; local62++) {
			local60[local62] = new int[local8[local62]];
			local8[local62] = 0;
		}
		for (@Pc(85) int local85 = 0; local85 < this.aClass2Array1.length; local85++) {
			@Pc(93) int local93 = this.aClass2Array1[local85].anInt57;
			if (local93 >= 0) {
				local60[local93][local8[local93]++] = local85;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)V")
	public void method4662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5543; local3++) {
			this.anIntArray386[local3] += arg2;
			this.anIntArray394[local3] += arg1;
			this.anIntArray387[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BSSSSBSSBB)B")
	public byte method4663() {
		if (this.anInt5557 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray68[this.anInt5557] = 3;
		this.aShortArray78[this.anInt5557] = 0;
		this.aShortArray83[this.anInt5557] = 32767;
		this.aShortArray81[this.anInt5557] = 0;
		this.anIntArray392[this.anInt5557] = 1024;
		this.anIntArray385[this.anInt5557] = 1024;
		this.anIntArray393[this.anInt5557] = 1024;
		this.aByteArray67[this.anInt5557] = 0;
		this.aByteArray69[this.anInt5557] = 0;
		this.anIntArray395[this.anInt5557] = 0;
		return (byte) this.anInt5557++;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)[[I")
	public int[][] method4664() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5556; local12++) {
			@Pc(19) int local19 = this.anIntArray388[local12];
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
		for (@Pc(72) int local72 = 0; local72 < this.anInt5556; local72++) {
			@Pc(79) int local79 = this.anIntArray388[local72];
			if (local79 >= 0) {
				local51[local79][local8[local79]++] = local72;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(IIII)V")
	public void method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(36) int local36;
		if (arg0 != 0) {
			local11 = Class12_Sub1_Sub36.anIntArray667[arg0];
			local15 = Class12_Sub1_Sub36.anIntArray668[arg0];
			for (local17 = 0; local17 < this.anInt5543; local17++) {
				local36 = this.anIntArray394[local17] * local11 + local15 * this.anIntArray386[local17] >> 15;
				this.anIntArray394[local17] = local15 * this.anIntArray394[local17] - local11 * this.anIntArray386[local17] >> 15;
				this.anIntArray386[local17] = local36;
			}
		}
		if (arg2 != 0) {
			local11 = Class12_Sub1_Sub36.anIntArray667[arg2];
			local15 = Class12_Sub1_Sub36.anIntArray668[arg2];
			for (local17 = 0; local17 < this.anInt5543; local17++) {
				local36 = this.anIntArray394[local17] * local15 - local11 * this.anIntArray387[local17] >> 15;
				this.anIntArray387[local17] = local11 * this.anIntArray394[local17] + this.anIntArray387[local17] * local15 >> 15;
				this.anIntArray394[local17] = local36;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local11 = Class12_Sub1_Sub36.anIntArray667[arg1];
		local15 = Class12_Sub1_Sub36.anIntArray668[arg1];
		for (local17 = 0; local17 < this.anInt5543; local17++) {
			local36 = local11 * this.anIntArray387[local17] + local15 * this.anIntArray386[local17] >> 15;
			this.anIntArray387[local17] = this.anIntArray387[local17] * local15 - local11 * this.anIntArray386[local17] >> 15;
			this.anIntArray386[local17] = local36;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIBI)I")
	public int method4666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt5543; local13++) {
			if (arg0 == this.anIntArray386[local13] && arg2 == this.anIntArray394[local13] && arg1 == this.anIntArray387[local13]) {
				return local13;
			}
		}
		this.anIntArray386[this.anInt5543] = arg0;
		this.anIntArray394[this.anInt5543] = arg2;
		this.anIntArray387[this.anInt5543] = arg1;
		this.anInt5546 = this.anInt5543 + 1;
		return this.anInt5543++;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(SIS)V")
	public void method4667(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray80 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt5556; local11++) {
			if (arg1 == this.aShortArray80[local11]) {
				this.aShortArray80[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I[B)V")
	private void method4668(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class12_Sub8 local10 = new Class12_Sub8(arg0);
		@Pc(15) Class12_Sub8 local15 = new Class12_Sub8(arg0);
		@Pc(20) Class12_Sub8 local20 = new Class12_Sub8(arg0);
		@Pc(25) Class12_Sub8 local25 = new Class12_Sub8(arg0);
		@Pc(30) Class12_Sub8 local30 = new Class12_Sub8(arg0);
		@Pc(35) Class12_Sub8 local35 = new Class12_Sub8(arg0);
		@Pc(40) Class12_Sub8 local40 = new Class12_Sub8(arg0);
		local10.anInt6217 = arg0.length - 23;
		this.anInt5543 = local10.method5199();
		this.anInt5556 = local10.method5199();
		this.anInt5557 = local10.method5216();
		@Pc(65) int local65 = local10.method5216();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(98) boolean local98 = (local65 & 0x4) == 4;
		@Pc(107) boolean local107 = (local65 & 0x8) == 8;
		if (local107) {
			local10.anInt6217 -= 7;
			this.anInt5552 = local10.method5216();
			local10.anInt6217 += 6;
		}
		@Pc(130) int local130 = local10.method5216();
		@Pc(134) int local134 = local10.method5216();
		@Pc(138) int local138 = local10.method5216();
		@Pc(142) int local142 = local10.method5216();
		@Pc(146) int local146 = local10.method5216();
		@Pc(150) int local150 = local10.method5199();
		@Pc(154) int local154 = local10.method5199();
		@Pc(158) int local158 = local10.method5199();
		@Pc(162) int local162 = local10.method5199();
		@Pc(166) int local166 = local10.method5199();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(185) int local185;
		if (this.anInt5557 > 0) {
			local10.anInt6217 = 0;
			this.aByteArray68 = new byte[this.anInt5557];
			for (local185 = 0; local185 < this.anInt5557; local185++) {
				@Pc(196) byte local196 = this.aByteArray68[local185] = local10.method5173();
				if (local196 >= 1 && local196 <= 3) {
					local170++;
				}
				if (local196 == 2) {
					local172++;
				}
				if (local196 == 0) {
					local168++;
				}
			}
		}
		local185 = this.anInt5557;
		@Pc(227) int local227 = local185;
		local185 += this.anInt5543;
		@Pc(234) int local234 = local185;
		if (local76) {
			local185 += this.anInt5556;
		}
		@Pc(243) int local243 = local185;
		local185 += this.anInt5556;
		@Pc(250) int local250 = local185;
		if (local130 == 255) {
			local185 += this.anInt5556;
		}
		@Pc(262) int local262 = local185;
		if (local138 == 1) {
			local185 += this.anInt5556;
		}
		@Pc(272) int local272 = local185;
		if (local146 == 1) {
			local185 += this.anInt5543;
		}
		@Pc(284) int local284 = local185;
		if (local134 == 1) {
			local185 += this.anInt5556;
		}
		@Pc(296) int local296 = local185;
		local185 += local162;
		@Pc(302) int local302 = local185;
		if (local142 == 1) {
			local185 += this.anInt5556 * 2;
		}
		@Pc(316) int local316 = local185;
		local185 += local166;
		@Pc(322) int local322 = local185;
		local185 += this.anInt5556 * 2;
		@Pc(331) int local331 = local185;
		local185 += local150;
		@Pc(337) int local337 = local185;
		local185 += local154;
		@Pc(343) int local343 = local185;
		local185 += local158;
		@Pc(349) int local349 = local185;
		local185 += local168 * 6;
		@Pc(357) int local357 = local185;
		local185 += local170 * 6;
		@Pc(371) int local371 = this.anInt5552 < 14 ? 6 : 7;
		@Pc(373) int local373 = local185;
		local185 += local371 * local170;
		@Pc(381) int local381 = local185;
		local185 += local170;
		@Pc(387) int local387 = local185;
		local185 += local170;
		@Pc(393) int local393 = local185;
		local185 += local172 * 2 + local170;
		if (local76) {
			this.aByteArray65 = new byte[this.anInt5556];
		}
		this.aShortArray86 = new short[this.anInt5556];
		this.anIntArray387 = new int[this.anInt5543];
		this.anIntArray394 = new int[this.anInt5543];
		if (local142 == 1) {
			this.aShortArray80 = new short[this.anInt5556];
		}
		if (local146 == 1) {
			this.anIntArray390 = new int[this.anInt5543];
		}
		if (local138 == 1) {
			this.anIntArray388 = new int[this.anInt5556];
		}
		this.aShortArray84 = new short[this.anInt5556];
		if (local134 == 1) {
			this.aByteArray62 = new byte[this.anInt5556];
		}
		if (local142 == 1 && this.anInt5557 > 0) {
			this.aByteArray63 = new byte[this.anInt5556];
		}
		this.aShortArray85 = new short[this.anInt5556];
		if (local130 == 255) {
			this.aByteArray66 = new byte[this.anInt5556];
		} else {
			this.aByte66 = (byte) local130;
		}
		if (this.anInt5557 > 0) {
			if (local172 > 0) {
				this.anIntArray391 = new int[local172];
				this.anIntArray389 = new int[local172];
			}
			this.aShortArray81 = new short[this.anInt5557];
			if (local170 > 0) {
				this.anIntArray393 = new int[local170];
				this.aByteArray67 = new byte[local170];
				this.anIntArray385 = new int[local170];
				this.anIntArray392 = new int[local170];
				this.aByteArray69 = new byte[local170];
				this.anIntArray395 = new int[local170];
			}
			this.aShortArray78 = new short[this.anInt5557];
			this.aShortArray83 = new short[this.anInt5557];
		}
		this.anIntArray386 = new int[this.anInt5543];
		local10.anInt6217 = local227;
		this.aShortArray82 = new short[this.anInt5556];
		local15.anInt6217 = local331;
		local20.anInt6217 = local337;
		local25.anInt6217 = local343;
		local30.anInt6217 = local272;
		@Pc(589) int local589 = 0;
		@Pc(591) int local591 = 0;
		@Pc(593) int local593 = 0;
		@Pc(601) int local601;
		for (@Pc(595) int local595 = 0; local595 < this.anInt5543; local595++) {
			local601 = local10.method5216();
			@Pc(603) int local603 = 0;
			if ((local601 & 0x1) != 0) {
				local603 = local15.method5203();
			}
			@Pc(616) int local616 = 0;
			if ((local601 & 0x2) != 0) {
				local616 = local20.method5203();
			}
			@Pc(629) int local629 = 0;
			if ((local601 & 0x4) != 0) {
				local629 = local25.method5203();
			}
			this.anIntArray386[local595] = local589 + local603;
			this.anIntArray394[local595] = local616 + local591;
			this.anIntArray387[local595] = local629 + local593;
			local591 = this.anIntArray394[local595];
			local593 = this.anIntArray387[local595];
			local589 = this.anIntArray386[local595];
			if (local146 == 1) {
				this.anIntArray390[local595] = local30.method5216();
			}
		}
		local10.anInt6217 = local322;
		local15.anInt6217 = local234;
		local20.anInt6217 = local250;
		local25.anInt6217 = local284;
		local30.anInt6217 = local262;
		local35.anInt6217 = local302;
		local40.anInt6217 = local316;
		for (local601 = 0; local601 < this.anInt5556; local601++) {
			this.aShortArray85[local601] = (short) local10.method5199();
			if (local76) {
				this.aByteArray65[local601] = local15.method5173();
			}
			if (local130 == 255) {
				this.aByteArray66[local601] = local20.method5173();
			}
			if (local134 == 1) {
				this.aByteArray62[local601] = local25.method5173();
			}
			if (local138 == 1) {
				this.anIntArray388[local601] = local30.method5216();
			}
			if (local142 == 1) {
				this.aShortArray80[local601] = (short) (local35.method5199() - 1);
			}
			if (this.aByteArray63 != null) {
				if (this.aShortArray80[local601] == -1) {
					this.aByteArray63[local601] = -1;
				} else {
					this.aByteArray63[local601] = (byte) (local40.method5216() - 1);
				}
			}
		}
		local10.anInt6217 = local296;
		this.anInt5546 = -1;
		local15.anInt6217 = local243;
		@Pc(827) short local827 = 0;
		@Pc(829) short local829 = 0;
		@Pc(831) short local831 = 0;
		@Pc(833) short local833 = 0;
		@Pc(841) int local841;
		for (@Pc(835) int local835 = 0; local835 < this.anInt5556; local835++) {
			local841 = local15.method5216();
			if (local841 == 1) {
				local827 = (short) (local10.method5203() + local833);
				local829 = (short) (local827 + local10.method5203());
				local831 = (short) (local10.method5203() + local829);
				this.aShortArray84[local835] = local827;
				local833 = local831;
				this.aShortArray86[local835] = local829;
				this.aShortArray82[local835] = local831;
				if (this.anInt5546 < local827) {
					this.anInt5546 = local827;
				}
				if (this.anInt5546 < local829) {
					this.anInt5546 = local829;
				}
				if (local831 > this.anInt5546) {
					this.anInt5546 = local831;
				}
			}
			if (local841 == 2) {
				local829 = local831;
				local831 = (short) (local10.method5203() + local833);
				this.aShortArray84[local835] = local827;
				local833 = local831;
				this.aShortArray86[local835] = local829;
				this.aShortArray82[local835] = local831;
				if (local831 > this.anInt5546) {
					this.anInt5546 = local831;
				}
			}
			if (local841 == 3) {
				local827 = local831;
				local831 = (short) (local833 + local10.method5203());
				this.aShortArray84[local835] = local827;
				local833 = local831;
				this.aShortArray86[local835] = local829;
				this.aShortArray82[local835] = local831;
				if (this.anInt5546 < local831) {
					this.anInt5546 = local831;
				}
			}
			if (local841 == 4) {
				@Pc(1000) short local1000 = local827;
				local827 = local829;
				local831 = (short) (local833 + local10.method5203());
				local829 = local1000;
				local833 = local831;
				this.aShortArray84[local835] = local827;
				this.aShortArray86[local835] = local1000;
				this.aShortArray82[local835] = local831;
				if (local831 > this.anInt5546) {
					this.anInt5546 = local831;
				}
			}
		}
		this.anInt5546++;
		local10.anInt6217 = local349;
		local15.anInt6217 = local357;
		local20.anInt6217 = local373;
		local25.anInt6217 = local381;
		local30.anInt6217 = local387;
		local35.anInt6217 = local393;
		@Pc(1083) int local1083;
		for (local841 = 0; local841 < this.anInt5557; local841++) {
			local1083 = this.aByteArray68[local841] & 0xFF;
			if (local1083 == 0) {
				this.aShortArray78[local841] = (short) local10.method5199();
				this.aShortArray83[local841] = (short) local10.method5199();
				this.aShortArray81[local841] = (short) local10.method5199();
			}
			if (local1083 == 1) {
				this.aShortArray78[local841] = (short) local15.method5199();
				this.aShortArray83[local841] = (short) local15.method5199();
				this.aShortArray81[local841] = (short) local15.method5199();
				this.anIntArray392[local841] = local20.method5199();
				if (this.anInt5552 < 14) {
					this.anIntArray385[local841] = local20.method5199();
				} else {
					this.anIntArray385[local841] = local20.method5195();
				}
				this.anIntArray393[local841] = local20.method5199();
				this.aByteArray67[local841] = local25.method5173();
				this.aByteArray69[local841] = local30.method5173();
				this.anIntArray395[local841] = local35.method5173();
			}
			if (local1083 == 2) {
				this.aShortArray78[local841] = (short) local15.method5199();
				this.aShortArray83[local841] = (short) local15.method5199();
				this.aShortArray81[local841] = (short) local15.method5199();
				this.anIntArray392[local841] = local20.method5199();
				if (this.anInt5552 >= 14) {
					this.anIntArray385[local841] = local20.method5195();
				} else {
					this.anIntArray385[local841] = local20.method5199();
				}
				this.anIntArray393[local841] = local20.method5199();
				this.aByteArray67[local841] = local25.method5173();
				this.aByteArray69[local841] = local30.method5173();
				this.anIntArray395[local841] = local35.method5173();
				this.anIntArray389[local841] = local35.method5173();
				this.anIntArray391[local841] = local35.method5173();
			}
			if (local1083 == 3) {
				this.aShortArray78[local841] = (short) local15.method5199();
				this.aShortArray83[local841] = (short) local15.method5199();
				this.aShortArray81[local841] = (short) local15.method5199();
				this.anIntArray392[local841] = local20.method5199();
				if (this.anInt5552 < 14) {
					this.anIntArray385[local841] = local20.method5199();
				} else {
					this.anIntArray385[local841] = local20.method5195();
				}
				this.anIntArray393[local841] = local20.method5199();
				this.aByteArray67[local841] = local25.method5173();
				this.aByteArray69[local841] = local30.method5173();
				this.anIntArray395[local841] = local35.method5173();
			}
		}
		local10.anInt6217 = local185;
		@Pc(1401) int local1401;
		@Pc(1407) int local1407;
		@Pc(1411) int local1411;
		@Pc(1476) int local1476;
		if (local87) {
			local1083 = local10.method5216();
			if (local1083 > 0) {
				this.aClass142Array5 = new Class142[local1083];
				for (local1401 = 0; local1401 < local1083; local1401++) {
					local1407 = local10.method5199();
					local1411 = local10.method5199();
					@Pc(1421) byte local1421;
					if (local130 == 255) {
						local1421 = this.aByteArray66[local1411];
					} else {
						local1421 = (byte) local130;
					}
					this.aClass142Array5[local1401] = new Class142(local1407, this.aShortArray84[local1411], this.aShortArray86[local1411], this.aShortArray82[local1411], local1421);
				}
			}
			local1401 = local10.method5216();
			if (local1401 > 0) {
				this.aClass265Array5 = new Class265[local1401];
				for (local1407 = 0; local1407 < local1401; local1407++) {
					local1411 = local10.method5199();
					local1476 = local10.method5199();
					this.aClass265Array5[local1407] = new Class265(local1411, local1476);
				}
			}
		}
		if (!local98) {
			return;
		}
		local1083 = local10.method5216();
		if (local1083 <= 0) {
			return;
		}
		this.aClass2Array1 = new Class2[local1083];
		for (local1401 = 0; local1401 < local1083; local1401++) {
			local1407 = local10.method5199();
			local1411 = local10.method5199();
			local1476 = local10.method5216();
			@Pc(1524) byte local1524 = local10.method5173();
			this.aClass2Array1[local1401] = new Class2(local1407, local1411, local1476, local1524);
		}
		return;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(SIS)V")
	public void method4669(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5556; local15++) {
			if (this.aShortArray85[local15] == arg0) {
				this.aShortArray85[local15] = arg1;
			}
		}
	}
}
