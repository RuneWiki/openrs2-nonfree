import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class199 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "[Lclient!u;")
	public Class239[] aClass239Array2;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "[I")
	public int[] anIntArray317;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "[Lclient!mf;")
	public Class156[] aClass156Array1;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!qc", name = "U", descriptor = "[I")
	public int[] anIntArray321;

	@OriginalMember(owner = "client!qc", name = "V", descriptor = "[Lclient!at;")
	public Class15[] aClass15Array2;

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!qc", name = "X", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!qc", name = "Y", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public int anInt5299 = 0;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	public int anInt5304 = 0;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
	public int anInt5308 = 0;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "B")
	public byte aByte58 = 0;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public int anInt5301 = 12;

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
	public int anInt5309 = 0;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B)V")
	public Class199(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4133(arg0);
		} else {
			this.method4131(arg0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(III)V")
	public Class199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray64 = new short[arg1];
		this.anIntArray319 = new int[arg0];
		this.aByteArray54 = new byte[arg1];
		this.anIntArray312 = new int[arg0];
		this.aShortArray65 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray320 = new int[arg2];
			this.anIntArray322 = new int[arg2];
			this.aShortArray58 = new short[arg2];
			this.aByteArray53 = new byte[arg2];
			this.aShortArray59 = new short[arg2];
			this.aByteArray59 = new byte[arg2];
			this.anIntArray321 = new int[arg2];
			this.anIntArray314 = new int[arg2];
			this.anIntArray317 = new int[arg2];
			this.aShortArray60 = new short[arg2];
			this.anIntArray315 = new int[arg2];
			this.aByteArray58 = new byte[arg2];
		}
		this.anIntArray316 = new int[arg1];
		this.anIntArray313 = new int[arg0];
		this.aByteArray57 = new byte[arg1];
		this.aByteArray56 = new byte[arg1];
		this.aShortArray56 = new short[arg1];
		this.anIntArray318 = new int[arg0];
		this.aByteArray55 = new byte[arg1];
		this.aShortArray57 = new short[arg1];
		this.aShortArray63 = new short[arg1];
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([Lclient!qc;I)V")
	public Class199(@OriginalArg(0) Class199[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5308 = 0;
		this.anInt5304 = 0;
		this.anInt5299 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte58 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class199 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5304 += local59.anInt5304;
				this.anInt5308 += local59.anInt5308;
				this.anInt5299 += local59.anInt5299;
				if (local59.aClass239Array2 != null) {
					local32 += local59.aClass239Array2.length;
				}
				if (local59.aClass156Array1 != null) {
					local36 += local59.aClass156Array1.length;
				}
				local38 |= local59.aByteArray57 != null;
				if (local59.aClass15Array2 != null) {
					local34 += local59.aClass15Array2.length;
				}
				local46 |= local59.aShortArray63 != null;
				local48 |= local59.anIntArray316 != null;
				local42 |= local59.aByteArray55 != null;
				if (local59.aByteArray56 == null) {
					if (this.aByte58 == -1) {
						this.aByte58 = local59.aByte58;
					}
					if (this.aByte58 != local59.aByte58) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray54 != null;
			}
		}
		if (local44) {
			this.aByteArray54 = new byte[this.anInt5299];
		}
		if (local40) {
			this.aByteArray56 = new byte[this.anInt5299];
		}
		if (this.anInt5304 > 0) {
			this.aShortArray60 = new short[this.anInt5304];
			this.anIntArray320 = new int[this.anInt5304];
			this.aShortArray58 = new short[this.anInt5304];
			this.anIntArray317 = new int[this.anInt5304];
			this.anIntArray314 = new int[this.anInt5304];
			this.anIntArray315 = new int[this.anInt5304];
			this.aByteArray58 = new byte[this.anInt5304];
			this.aShortArray59 = new short[this.anInt5304];
			this.aByteArray53 = new byte[this.anInt5304];
			this.aByteArray59 = new byte[this.anInt5304];
			this.anIntArray322 = new int[this.anInt5304];
			this.anIntArray321 = new int[this.anInt5304];
		}
		this.aShortArray57 = new short[this.anInt5299];
		if (local42) {
			this.aByteArray55 = new byte[this.anInt5299];
		}
		this.aShortArray61 = new short[this.anInt5308];
		if (local34 > 0) {
			this.aClass15Array2 = new Class15[local34];
		}
		if (local48) {
			this.anIntArray316 = new int[this.anInt5299];
		}
		this.anIntArray312 = new int[this.anInt5308];
		this.anIntArray319 = new int[this.anInt5308];
		this.anIntArray318 = new int[this.anInt5308];
		this.aShortArray62 = new short[this.anInt5299];
		this.aShortArray56 = new short[this.anInt5299];
		if (local36 > 0) {
			this.aClass156Array1 = new Class156[local36];
		}
		if (local32 > 0) {
			this.aClass239Array2 = new Class239[local32];
		}
		if (local46) {
			this.aShortArray63 = new short[this.anInt5299];
		}
		this.aShortArray65 = new short[this.anInt5299];
		if (local38) {
			this.aByteArray57 = new byte[this.anInt5299];
		}
		this.anIntArray313 = new int[this.anInt5308];
		this.aShortArray64 = new short[this.anInt5299];
		this.anInt5308 = 0;
		local36 = 0;
		local32 = 0;
		this.anInt5304 = 0;
		this.anInt5299 = 0;
		local34 = 0;
		@Pc(606) int local606;
		@Pc(617) int local617;
		for (@Pc(370) int local370 = 0; local370 < arg1; local370++) {
			@Pc(377) short local377 = (short) (0x1 << local370);
			@Pc(381) Class199 local381 = arg0[local370];
			if (local381 != null) {
				@Pc(388) int local388;
				if (local381.aClass156Array1 != null) {
					for (local388 = 0; local388 < local381.aClass156Array1.length; local388++) {
						@Pc(395) Class156 local395 = local381.aClass156Array1[local388];
						this.aClass156Array1[local36++] = local395.method3188(local395.anInt3988 + this.anInt5299);
					}
				}
				for (local388 = 0; local388 < local381.anInt5299; local388++) {
					if (local38 && local381.aByteArray57 != null) {
						this.aByteArray57[this.anInt5299] = local381.aByteArray57[local388];
					}
					if (local40) {
						if (local381.aByteArray56 == null) {
							this.aByteArray56[this.anInt5299] = local381.aByte58;
						} else {
							this.aByteArray56[this.anInt5299] = local381.aByteArray56[local388];
						}
					}
					if (local42 && local381.aByteArray55 != null) {
						this.aByteArray55[this.anInt5299] = local381.aByteArray55[local388];
					}
					if (local46) {
						if (local381.aShortArray63 == null) {
							this.aShortArray63[this.anInt5299] = -1;
						} else {
							this.aShortArray63[this.anInt5299] = local381.aShortArray63[local388];
						}
					}
					if (local48) {
						if (local381.anIntArray316 == null) {
							this.anIntArray316[this.anInt5299] = -1;
						} else {
							this.anIntArray316[this.anInt5299] = local381.anIntArray316[local388];
						}
					}
					this.aShortArray65[this.anInt5299] = (short) this.method4129(local381.aShortArray65[local388], local377, local381);
					this.aShortArray64[this.anInt5299] = (short) this.method4129(local381.aShortArray64[local388], local377, local381);
					this.aShortArray56[this.anInt5299] = (short) this.method4129(local381.aShortArray56[local388], local377, local381);
					this.aShortArray62[this.anInt5299] = local377;
					this.aShortArray57[this.anInt5299] = local381.aShortArray57[local388];
					this.anInt5299++;
				}
				@Pc(593) int local593;
				if (local381.aClass239Array2 != null) {
					for (local593 = 0; local593 < local381.aClass239Array2.length; local593++) {
						local606 = this.method4129(local381.aClass239Array2[local593].anInt6502, local377, local381);
						local617 = this.method4129(local381.aClass239Array2[local593].anInt6508, local377, local381);
						@Pc(628) int local628 = this.method4129(local381.aClass239Array2[local593].anInt6505, local377, local381);
						this.aClass239Array2[local32] = local381.aClass239Array2[local593].method5012(local606, local628, local617);
						local32++;
					}
				}
				if (local381.aClass15Array2 != null) {
					for (local593 = 0; local593 < local381.aClass15Array2.length; local593++) {
						local606 = this.method4129(local381.aClass15Array2[local593].anInt337, local377, local381);
						this.aClass15Array2[local34] = local381.aClass15Array2[local593].method280(local606);
						local34++;
					}
				}
			}
		}
		this.anInt5309 = this.anInt5308;
		@Pc(694) int local694 = 0;
		for (@Pc(696) int local696 = 0; local696 < arg1; local696++) {
			@Pc(703) short local703 = (short) (0x1 << local696);
			@Pc(707) Class199 local707 = arg0[local696];
			if (local707 != null) {
				for (local606 = 0; local606 < local707.anInt5299; local606++) {
					if (local44) {
						this.aByteArray54[local694++] = (byte) (local707.aByteArray54 == null || local707.aByteArray54[local606] == -1 ? -1 : local707.aByteArray54[local606] + this.anInt5304);
					}
				}
				for (local617 = 0; local617 < local707.anInt5304; local617++) {
					@Pc(764) byte local764 = this.aByteArray59[this.anInt5304] = local707.aByteArray59[local617];
					if (local764 == 0) {
						this.aShortArray60[this.anInt5304] = (short) this.method4129(local707.aShortArray60[local617], local703, local707);
						this.aShortArray58[this.anInt5304] = (short) this.method4129(local707.aShortArray58[local617], local703, local707);
						this.aShortArray59[this.anInt5304] = (short) this.method4129(local707.aShortArray59[local617], local703, local707);
					}
					if (local764 >= 1 && local764 <= 3) {
						this.aShortArray60[this.anInt5304] = local707.aShortArray60[local617];
						this.aShortArray58[this.anInt5304] = local707.aShortArray58[local617];
						this.aShortArray59[this.anInt5304] = local707.aShortArray59[local617];
						this.anIntArray322[this.anInt5304] = local707.anIntArray322[local617];
						this.anIntArray320[this.anInt5304] = local707.anIntArray320[local617];
						this.anIntArray317[this.anInt5304] = local707.anIntArray317[local617];
						this.aByteArray53[this.anInt5304] = local707.aByteArray53[local617];
						this.aByteArray58[this.anInt5304] = local707.aByteArray58[local617];
						this.anIntArray314[this.anInt5304] = local707.anIntArray314[local617];
					}
					if (local764 == 2) {
						this.anIntArray321[this.anInt5304] = local707.anIntArray321[local617];
						this.anIntArray315[this.anInt5304] = local707.anIntArray315[local617];
					}
					this.anInt5304++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BISBIIBIS)I")
	public int method4124(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(8) short arg7) {
		this.aShortArray65[this.anInt5299] = (short) arg4;
		this.aShortArray64[this.anInt5299] = (short) arg5;
		this.aShortArray56[this.anInt5299] = (short) arg1;
		this.aByteArray57[this.anInt5299] = arg6;
		this.aByteArray54[this.anInt5299] = arg3;
		this.aShortArray57[this.anInt5299] = arg7;
		this.aByteArray55[this.anInt5299] = arg0;
		this.aShortArray63[this.anInt5299] = arg2;
		return this.anInt5299++;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)[[I")
	public int[][] method4125() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5309; local20++) {
			@Pc(27) int local27 = this.anIntArray312[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(45) int local45 = local8[local27]++;
			}
		}
		@Pc(58) int[][] local58 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local58[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt5309; local83++) {
			@Pc(90) int local90 = this.anIntArray312[local83];
			if (local90 >= 0) {
				local58[local90][local8[local90]++] = local83;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ISLclient!qc;I)I")
	private int method4129(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) Class199 arg2) {
		@Pc(10) int local10 = arg2.anIntArray319[arg0];
		@Pc(15) int local15 = arg2.anIntArray318[arg0];
		@Pc(20) int local20 = arg2.anIntArray313[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5308; local22++) {
			if (local10 == this.anIntArray319[local22] && this.anIntArray318[local22] == local15 && this.anIntArray313[local22] == local20) {
				this.aShortArray61[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray319[this.anInt5308] = local10;
		this.anIntArray318[this.anInt5308] = local15;
		this.anIntArray313[this.anInt5308] = local20;
		this.aShortArray61[this.anInt5308] = arg1;
		this.anIntArray312[this.anInt5308] = arg2.anIntArray312 == null ? -1 : arg2.anIntArray312[arg0];
		return this.anInt5308++;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ISSSBSSBSB)B")
	public byte method4130() {
		if (this.anInt5304 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray59[this.anInt5304] = 3;
		this.aShortArray60[this.anInt5304] = 0;
		this.aShortArray58[this.anInt5304] = 32767;
		this.aShortArray59[this.anInt5304] = 0;
		this.anIntArray322[this.anInt5304] = 1024;
		this.anIntArray320[this.anInt5304] = 1024;
		this.anIntArray317[this.anInt5304] = 1024;
		this.aByteArray53[this.anInt5304] = 0;
		this.aByteArray58[this.anInt5304] = 0;
		this.anIntArray314[this.anInt5304] = 0;
		return (byte) this.anInt5304++;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([BI)V")
	private void method4131(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub11 local14 = new Class1_Sub11(arg0);
		@Pc(19) Class1_Sub11 local19 = new Class1_Sub11(arg0);
		@Pc(24) Class1_Sub11 local24 = new Class1_Sub11(arg0);
		@Pc(29) Class1_Sub11 local29 = new Class1_Sub11(arg0);
		@Pc(34) Class1_Sub11 local34 = new Class1_Sub11(arg0);
		local14.anInt5766 = arg0.length - 18;
		this.anInt5308 = local14.method4485();
		this.anInt5299 = local14.method4485();
		this.anInt5304 = local14.method4463();
		@Pc(63) int local63 = local14.method4463();
		@Pc(69) int local69 = local14.method4463();
		@Pc(75) int local75 = local14.method4463();
		@Pc(79) int local79 = local14.method4463();
		@Pc(83) int local83 = local14.method4463();
		@Pc(87) int local87 = local14.method4485();
		@Pc(91) int local91 = local14.method4485();
		@Pc(95) int local95 = local14.method4485();
		@Pc(99) int local99 = local14.method4485();
		@Pc(108) int local108 = this.anInt5308;
		@Pc(110) int local110 = local108;
		local108 += this.anInt5299;
		@Pc(117) int local117 = local108;
		if (local69 == 255) {
			local108 += this.anInt5299;
		}
		@Pc(129) int local129 = local108;
		if (local79 == 1) {
			local108 += this.anInt5299;
		}
		@Pc(141) int local141 = local108;
		if (local63 == 1) {
			local108 += this.anInt5299;
		}
		@Pc(151) int local151 = local108;
		if (local83 == 1) {
			local108 += this.anInt5308;
		}
		@Pc(163) int local163 = local108;
		if (local75 == 1) {
			local108 += this.anInt5299;
		}
		@Pc(175) int local175 = local108;
		local108 += local99;
		@Pc(181) int local181 = local108;
		local108 += this.anInt5299 * 2;
		@Pc(190) int local190 = local108;
		local108 += this.anInt5304 * 6;
		@Pc(199) int local199 = local108;
		local108 += local87;
		@Pc(205) int local205 = local108;
		local108 += local91;
		if (local69 == 255) {
			this.aByteArray56 = new byte[this.anInt5299];
		} else {
			this.aByte58 = (byte) local69;
		}
		if (local79 == 1) {
			this.anIntArray316 = new int[this.anInt5299];
		}
		this.aShortArray57 = new short[this.anInt5299];
		if (local75 == 1) {
			this.aByteArray55 = new byte[this.anInt5299];
		}
		this.anIntArray319 = new int[this.anInt5308];
		this.aShortArray56 = new short[this.anInt5299];
		local14.anInt5766 = 0;
		if (local83 == 1) {
			this.anIntArray312 = new int[this.anInt5308];
		}
		if (local63 == 1) {
			this.aByteArray54 = new byte[this.anInt5299];
			this.aByteArray57 = new byte[this.anInt5299];
			this.aShortArray63 = new short[this.anInt5299];
		}
		this.aShortArray64 = new short[this.anInt5299];
		if (this.anInt5304 > 0) {
			this.aByteArray59 = new byte[this.anInt5304];
			this.aShortArray59 = new short[this.anInt5304];
			this.aShortArray58 = new short[this.anInt5304];
			this.aShortArray60 = new short[this.anInt5304];
		}
		this.anIntArray313 = new int[this.anInt5308];
		this.anIntArray318 = new int[this.anInt5308];
		this.aShortArray65 = new short[this.anInt5299];
		local19.anInt5766 = local199;
		local24.anInt5766 = local205;
		local29.anInt5766 = local108;
		local34.anInt5766 = local151;
		@Pc(357) int local357 = 0;
		@Pc(359) int local359 = 0;
		@Pc(361) int local361 = 0;
		@Pc(371) int local371;
		@Pc(373) int local373;
		for (@Pc(363) int local363 = 0; local363 < this.anInt5308; local363++) {
			local371 = local14.method4463();
			local373 = 0;
			if ((local371 & 0x1) != 0) {
				local373 = local19.method4449();
			}
			@Pc(383) int local383 = 0;
			if ((local371 & 0x2) != 0) {
				local383 = local24.method4449();
			}
			@Pc(396) int local396 = 0;
			if ((local371 & 0x4) != 0) {
				local396 = local29.method4449();
			}
			this.anIntArray319[local363] = local357 + local373;
			this.anIntArray318[local363] = local359 + local383;
			this.anIntArray313[local363] = local396 + local361;
			local359 = this.anIntArray318[local363];
			local357 = this.anIntArray319[local363];
			local361 = this.anIntArray313[local363];
			if (local83 == 1) {
				this.anIntArray312[local363] = local34.method4463();
			}
		}
		local14.anInt5766 = local181;
		local19.anInt5766 = local141;
		local24.anInt5766 = local117;
		local29.anInt5766 = local163;
		local34.anInt5766 = local129;
		for (local371 = 0; local371 < this.anInt5299; local371++) {
			this.aShortArray57[local371] = (short) local14.method4485();
			if (local63 == 1) {
				local373 = local19.method4463();
				if ((local373 & 0x1) == 1) {
					local7 = true;
					this.aByteArray57[local371] = 1;
				} else {
					this.aByteArray57[local371] = 0;
				}
				if ((local373 & 0x2) == 2) {
					this.aByteArray54[local371] = (byte) (local373 >> 2);
					this.aShortArray63[local371] = this.aShortArray57[local371];
					this.aShortArray57[local371] = 127;
					if (this.aShortArray63[local371] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray54[local371] = -1;
					this.aShortArray63[local371] = -1;
				}
			}
			if (local69 == 255) {
				this.aByteArray56[local371] = local24.method4452();
			}
			if (local75 == 1) {
				this.aByteArray55[local371] = local29.method4452();
			}
			if (local79 == 1) {
				this.anIntArray316[local371] = local34.method4463();
			}
		}
		local14.anInt5766 = local175;
		this.anInt5309 = -1;
		local19.anInt5766 = local110;
		@Pc(622) short local622 = 0;
		@Pc(624) short local624 = 0;
		@Pc(626) short local626 = 0;
		@Pc(628) short local628 = 0;
		@Pc(636) int local636;
		for (@Pc(630) int local630 = 0; local630 < this.anInt5299; local630++) {
			local636 = local19.method4463();
			if (local636 == 1) {
				local622 = (short) (local14.method4449() + local628);
				local624 = (short) (local14.method4449() + local622);
				local626 = (short) (local624 + local14.method4449());
				local628 = local626;
				this.aShortArray65[local630] = local622;
				this.aShortArray64[local630] = local624;
				this.aShortArray56[local630] = local626;
				if (local622 > this.anInt5309) {
					this.anInt5309 = local622;
				}
				if (this.anInt5309 < local624) {
					this.anInt5309 = local624;
				}
				if (this.anInt5309 < local626) {
					this.anInt5309 = local626;
				}
			}
			if (local636 == 2) {
				local624 = local626;
				local626 = (short) (local628 + local14.method4449());
				local628 = local626;
				this.aShortArray65[local630] = local622;
				this.aShortArray64[local630] = local624;
				this.aShortArray56[local630] = local626;
				if (local626 > this.anInt5309) {
					this.anInt5309 = local626;
				}
			}
			if (local636 == 3) {
				local622 = local626;
				local626 = (short) (local14.method4449() + local628);
				local628 = local626;
				this.aShortArray65[local630] = local622;
				this.aShortArray64[local630] = local624;
				this.aShortArray56[local630] = local626;
				if (this.anInt5309 < local626) {
					this.anInt5309 = local626;
				}
			}
			if (local636 == 4) {
				@Pc(795) short local795 = local622;
				local622 = local624;
				local624 = local795;
				local626 = (short) (local14.method4449() + local628);
				this.aShortArray65[local630] = local622;
				local628 = local626;
				this.aShortArray64[local630] = local795;
				this.aShortArray56[local630] = local626;
				if (this.anInt5309 < local626) {
					this.anInt5309 = local626;
				}
			}
		}
		local14.anInt5766 = local190;
		this.anInt5309++;
		for (local636 = 0; local636 < this.anInt5304; local636++) {
			this.aByteArray59[local636] = 0;
			this.aShortArray60[local636] = (short) local14.method4485();
			this.aShortArray58[local636] = (short) local14.method4485();
			this.aShortArray59[local636] = (short) local14.method4485();
		}
		if (this.aByteArray54 != null) {
			@Pc(895) boolean local895 = false;
			for (@Pc(897) int local897 = 0; local897 < this.anInt5299; local897++) {
				@Pc(906) int local906 = this.aByteArray54[local897] & 0xFF;
				if (local906 != 255) {
					if (this.aShortArray65[local897] == (this.aShortArray60[local906] & 0xFFFF) && this.aShortArray64[local897] == (this.aShortArray58[local906] & 0xFFFF) && this.aShortArray56[local897] == (this.aShortArray59[local906] & 0xFFFF)) {
						this.aByteArray54[local897] = -1;
					} else {
						local895 = true;
					}
				}
			}
			if (!local895) {
				this.aByteArray54 = null;
			}
		}
		if (!local9) {
			this.aShortArray63 = null;
		}
		if (!local7) {
			this.aByteArray57 = null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(SSI)V")
	public void method4132(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray63 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt5299; local11++) {
			if (arg0 == this.aShortArray63[local11]) {
				this.aShortArray63[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[B)V")
	private void method4133(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub11 local10 = new Class1_Sub11(arg0);
		@Pc(15) Class1_Sub11 local15 = new Class1_Sub11(arg0);
		@Pc(20) Class1_Sub11 local20 = new Class1_Sub11(arg0);
		@Pc(25) Class1_Sub11 local25 = new Class1_Sub11(arg0);
		@Pc(30) Class1_Sub11 local30 = new Class1_Sub11(arg0);
		@Pc(35) Class1_Sub11 local35 = new Class1_Sub11(arg0);
		@Pc(40) Class1_Sub11 local40 = new Class1_Sub11(arg0);
		local10.anInt5766 = arg0.length - 23;
		this.anInt5308 = local10.method4485();
		this.anInt5299 = local10.method4485();
		this.anInt5304 = local10.method4463();
		@Pc(65) int local65 = local10.method4463();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(83) boolean local83 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(103) boolean local103 = (local65 & 0x8) == 8;
		if (local103) {
			local10.anInt5766 -= 7;
			this.anInt5301 = local10.method4463();
			local10.anInt5766 += 6;
		}
		@Pc(126) int local126 = local10.method4463();
		@Pc(130) int local130 = local10.method4463();
		@Pc(134) int local134 = local10.method4463();
		@Pc(138) int local138 = local10.method4463();
		@Pc(142) int local142 = local10.method4463();
		@Pc(146) int local146 = local10.method4485();
		@Pc(150) int local150 = local10.method4485();
		@Pc(154) int local154 = local10.method4485();
		@Pc(158) int local158 = local10.method4485();
		@Pc(162) int local162 = local10.method4485();
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(181) int local181;
		if (this.anInt5304 > 0) {
			this.aByteArray59 = new byte[this.anInt5304];
			local10.anInt5766 = 0;
			for (local181 = 0; local181 < this.anInt5304; local181++) {
				@Pc(192) byte local192 = this.aByteArray59[local181] = local10.method4452();
				if (local192 == 0) {
					local164++;
				}
				if (local192 >= 1 && local192 <= 3) {
					local166++;
				}
				if (local192 == 2) {
					local168++;
				}
			}
		}
		local181 = this.anInt5304;
		@Pc(227) int local227 = local181;
		local181 += this.anInt5308;
		@Pc(234) int local234 = local181;
		if (local74) {
			local181 += this.anInt5299;
		}
		@Pc(243) int local243 = local181;
		local181 += this.anInt5299;
		@Pc(250) int local250 = local181;
		if (local126 == 255) {
			local181 += this.anInt5299;
		}
		@Pc(260) int local260 = local181;
		if (local134 == 1) {
			local181 += this.anInt5299;
		}
		@Pc(272) int local272 = local181;
		if (local142 == 1) {
			local181 += this.anInt5308;
		}
		@Pc(282) int local282 = local181;
		if (local130 == 1) {
			local181 += this.anInt5299;
		}
		@Pc(292) int local292 = local181;
		local181 += local158;
		@Pc(298) int local298 = local181;
		if (local138 == 1) {
			local181 += this.anInt5299 * 2;
		}
		@Pc(310) int local310 = local181;
		local181 += local162;
		@Pc(316) int local316 = local181;
		local181 += this.anInt5299 * 2;
		@Pc(325) int local325 = local181;
		local181 += local146;
		@Pc(331) int local331 = local181;
		local181 += local150;
		@Pc(337) int local337 = local181;
		local181 += local154;
		@Pc(343) int local343 = local181;
		local181 += local164 * 6;
		@Pc(351) int local351 = local181;
		local181 += local166 * 6;
		@Pc(365) int local365 = this.anInt5301 >= 14 ? 7 : 6;
		@Pc(367) int local367 = local181;
		local181 += local365 * local166;
		@Pc(375) int local375 = local181;
		local181 += local166;
		@Pc(381) int local381 = local181;
		local181 += local166;
		@Pc(387) int local387 = local181;
		local181 += local166 + local168 * 2;
		this.anIntArray313 = new int[this.anInt5308];
		this.aShortArray56 = new short[this.anInt5299];
		local10.anInt5766 = local227;
		if (local138 == 1) {
			this.aShortArray63 = new short[this.anInt5299];
		}
		if (local142 == 1) {
			this.anIntArray312 = new int[this.anInt5308];
		}
		if (local134 == 1) {
			this.anIntArray316 = new int[this.anInt5299];
		}
		if (local130 == 1) {
			this.aByteArray55 = new byte[this.anInt5299];
		}
		if (local74) {
			this.aByteArray57 = new byte[this.anInt5299];
		}
		this.anIntArray318 = new int[this.anInt5308];
		if (this.anInt5304 > 0) {
			this.aShortArray58 = new short[this.anInt5304];
			this.aShortArray60 = new short[this.anInt5304];
			if (local168 > 0) {
				this.anIntArray315 = new int[local168];
				this.anIntArray321 = new int[local168];
			}
			this.aShortArray59 = new short[this.anInt5304];
			if (local166 > 0) {
				this.anIntArray314 = new int[local166];
				this.aByteArray53 = new byte[local166];
				this.anIntArray320 = new int[local166];
				this.anIntArray322 = new int[local166];
				this.anIntArray317 = new int[local166];
				this.aByteArray58 = new byte[local166];
			}
		}
		if (local138 == 1 && this.anInt5304 > 0) {
			this.aByteArray54 = new byte[this.anInt5299];
		}
		this.aShortArray64 = new short[this.anInt5299];
		this.aShortArray57 = new short[this.anInt5299];
		this.anIntArray319 = new int[this.anInt5308];
		this.aShortArray65 = new short[this.anInt5299];
		if (local126 == 255) {
			this.aByteArray56 = new byte[this.anInt5299];
		} else {
			this.aByte58 = (byte) local126;
		}
		local15.anInt5766 = local325;
		local20.anInt5766 = local331;
		local25.anInt5766 = local337;
		local30.anInt5766 = local272;
		@Pc(584) int local584 = 0;
		@Pc(586) int local586 = 0;
		@Pc(588) int local588 = 0;
		@Pc(596) int local596;
		for (@Pc(590) int local590 = 0; local590 < this.anInt5308; local590++) {
			local596 = local10.method4463();
			@Pc(598) int local598 = 0;
			if ((local596 & 0x1) != 0) {
				local598 = local15.method4449();
			}
			@Pc(611) int local611 = 0;
			if ((local596 & 0x2) != 0) {
				local611 = local20.method4449();
			}
			@Pc(621) int local621 = 0;
			if ((local596 & 0x4) != 0) {
				local621 = local25.method4449();
			}
			this.anIntArray319[local590] = local584 + local598;
			this.anIntArray318[local590] = local586 + local611;
			this.anIntArray313[local590] = local588 + local621;
			local584 = this.anIntArray319[local590];
			local586 = this.anIntArray318[local590];
			local588 = this.anIntArray313[local590];
			if (local142 == 1) {
				this.anIntArray312[local590] = local30.method4463();
			}
		}
		local10.anInt5766 = local316;
		local15.anInt5766 = local234;
		local20.anInt5766 = local250;
		local25.anInt5766 = local282;
		local30.anInt5766 = local260;
		local35.anInt5766 = local298;
		local40.anInt5766 = local310;
		for (local596 = 0; local596 < this.anInt5299; local596++) {
			this.aShortArray57[local596] = (short) local10.method4485();
			if (local74) {
				this.aByteArray57[local596] = local15.method4452();
			}
			if (local126 == 255) {
				this.aByteArray56[local596] = local20.method4452();
			}
			if (local130 == 1) {
				this.aByteArray55[local596] = local25.method4452();
			}
			if (local134 == 1) {
				this.anIntArray316[local596] = local30.method4463();
			}
			if (local138 == 1) {
				this.aShortArray63[local596] = (short) (local35.method4485() - 1);
			}
			if (this.aByteArray54 != null) {
				if (this.aShortArray63[local596] == -1) {
					this.aByteArray54[local596] = -1;
				} else {
					this.aByteArray54[local596] = (byte) (local40.method4463() - 1);
				}
			}
		}
		this.anInt5309 = -1;
		local10.anInt5766 = local292;
		local15.anInt5766 = local243;
		@Pc(814) short local814 = 0;
		@Pc(816) short local816 = 0;
		@Pc(818) short local818 = 0;
		@Pc(820) short local820 = 0;
		@Pc(828) int local828;
		for (@Pc(822) int local822 = 0; local822 < this.anInt5299; local822++) {
			local828 = local15.method4463();
			if (local828 == 1) {
				local814 = (short) (local820 + local10.method4449());
				local816 = (short) (local814 + local10.method4449());
				local818 = (short) (local10.method4449() + local816);
				this.aShortArray65[local822] = local814;
				local820 = local818;
				this.aShortArray64[local822] = local816;
				this.aShortArray56[local822] = local818;
				if (this.anInt5309 < local814) {
					this.anInt5309 = local814;
				}
				if (local816 > this.anInt5309) {
					this.anInt5309 = local816;
				}
				if (local818 > this.anInt5309) {
					this.anInt5309 = local818;
				}
			}
			if (local828 == 2) {
				local816 = local818;
				local818 = (short) (local820 + local10.method4449());
				this.aShortArray65[local822] = local814;
				local820 = local818;
				this.aShortArray64[local822] = local816;
				this.aShortArray56[local822] = local818;
				if (local818 > this.anInt5309) {
					this.anInt5309 = local818;
				}
			}
			if (local828 == 3) {
				local814 = local818;
				local818 = (short) (local820 + local10.method4449());
				this.aShortArray65[local822] = local814;
				local820 = local818;
				this.aShortArray64[local822] = local816;
				this.aShortArray56[local822] = local818;
				if (local818 > this.anInt5309) {
					this.anInt5309 = local818;
				}
			}
			if (local828 == 4) {
				@Pc(987) short local987 = local814;
				local814 = local816;
				local818 = (short) (local820 + local10.method4449());
				local816 = local987;
				this.aShortArray65[local822] = local814;
				local820 = local818;
				this.aShortArray64[local822] = local987;
				this.aShortArray56[local822] = local818;
				if (local818 > this.anInt5309) {
					this.anInt5309 = local818;
				}
			}
		}
		this.anInt5309++;
		local10.anInt5766 = local343;
		local15.anInt5766 = local351;
		local20.anInt5766 = local367;
		local25.anInt5766 = local375;
		local30.anInt5766 = local381;
		local35.anInt5766 = local387;
		@Pc(1066) int local1066;
		for (local828 = 0; local828 < this.anInt5304; local828++) {
			local1066 = this.aByteArray59[local828] & 0xFF;
			if (local1066 == 0) {
				this.aShortArray60[local828] = (short) local10.method4485();
				this.aShortArray58[local828] = (short) local10.method4485();
				this.aShortArray59[local828] = (short) local10.method4485();
			}
			if (local1066 == 1) {
				this.aShortArray60[local828] = (short) local15.method4485();
				this.aShortArray58[local828] = (short) local15.method4485();
				this.aShortArray59[local828] = (short) local15.method4485();
				this.anIntArray322[local828] = local20.method4485();
				if (this.anInt5301 < 14) {
					this.anIntArray320[local828] = local20.method4485();
				} else {
					this.anIntArray320[local828] = local20.method4493();
				}
				this.anIntArray317[local828] = local20.method4485();
				this.aByteArray53[local828] = local25.method4452();
				this.aByteArray58[local828] = local30.method4452();
				this.anIntArray314[local828] = local35.method4452();
			}
			if (local1066 == 2) {
				this.aShortArray60[local828] = (short) local15.method4485();
				this.aShortArray58[local828] = (short) local15.method4485();
				this.aShortArray59[local828] = (short) local15.method4485();
				this.anIntArray322[local828] = local20.method4485();
				if (this.anInt5301 >= 14) {
					this.anIntArray320[local828] = local20.method4493();
				} else {
					this.anIntArray320[local828] = local20.method4485();
				}
				this.anIntArray317[local828] = local20.method4485();
				this.aByteArray53[local828] = local25.method4452();
				this.aByteArray58[local828] = local30.method4452();
				this.anIntArray314[local828] = local35.method4452();
				this.anIntArray321[local828] = local35.method4452();
				this.anIntArray315[local828] = local35.method4452();
			}
			if (local1066 == 3) {
				this.aShortArray60[local828] = (short) local15.method4485();
				this.aShortArray58[local828] = (short) local15.method4485();
				this.aShortArray59[local828] = (short) local15.method4485();
				this.anIntArray322[local828] = local20.method4485();
				if (this.anInt5301 >= 14) {
					this.anIntArray320[local828] = local20.method4493();
				} else {
					this.anIntArray320[local828] = local20.method4485();
				}
				this.anIntArray317[local828] = local20.method4485();
				this.aByteArray53[local828] = local25.method4452();
				this.aByteArray58[local828] = local30.method4452();
				this.anIntArray314[local828] = local35.method4452();
			}
		}
		local10.anInt5766 = local181;
		@Pc(1392) int local1392;
		@Pc(1398) int local1398;
		@Pc(1402) int local1402;
		@Pc(1464) int local1464;
		if (local83) {
			local1066 = local10.method4463();
			if (local1066 > 0) {
				this.aClass239Array2 = new Class239[local1066];
				for (local1392 = 0; local1392 < local1066; local1392++) {
					local1398 = local10.method4485();
					local1402 = local10.method4485();
					@Pc(1410) byte local1410;
					if (local126 == 255) {
						local1410 = this.aByteArray56[local1402];
					} else {
						local1410 = (byte) local126;
					}
					this.aClass239Array2[local1392] = new Class239(local1398, this.aShortArray65[local1402], this.aShortArray64[local1402], this.aShortArray56[local1402], local1410);
				}
			}
			local1392 = local10.method4463();
			if (local1392 > 0) {
				this.aClass15Array2 = new Class15[local1392];
				for (local1398 = 0; local1398 < local1392; local1398++) {
					local1402 = local10.method4485();
					local1464 = local10.method4485();
					this.aClass15Array2[local1398] = new Class15(local1402, local1464);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1066 = local10.method4463();
		if (local1066 <= 0) {
			return;
		}
		this.aClass156Array1 = new Class156[local1066];
		for (local1392 = 0; local1392 < local1066; local1392++) {
			local1398 = local10.method4485();
			local1402 = local10.method4485();
			local1464 = local10.method4463();
			@Pc(1516) byte local1516 = local10.method4452();
			this.aClass156Array1[local1392] = new Class156(local1398, local1402, local1464, local1516);
		}
		return;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIZ)V")
	public void method4134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5308; local3++) {
			this.anIntArray319[local3] += arg0;
			this.anIntArray318[local3] += arg2;
			this.anIntArray313[local3] += arg1;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZSS)V")
	public void method4135(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(18) int local18 = 0; local18 < this.anInt5299; local18++) {
			if (arg1 == this.aShortArray57[local18]) {
				this.aShortArray57[local18] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)I")
	public int method4136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5308; local7++) {
			if (this.anIntArray319[local7] == arg2 && this.anIntArray318[local7] == arg1 && arg0 == this.anIntArray313[local7]) {
				return local7;
			}
		}
		this.anIntArray319[this.anInt5308] = arg2;
		this.anIntArray318[this.anInt5308] = arg1;
		this.anIntArray313[this.anInt5308] = arg0;
		this.anInt5309 = this.anInt5308 + 1;
		return this.anInt5308++;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	public void method4137() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5308; local3++) {
			this.anIntArray319[local3] <<= 0x0;
			this.anIntArray318[local3] <<= 0x0;
			this.anIntArray313[local3] <<= 0x0;
		}
		if (this.anInt5304 <= 0 || this.anIntArray322 == null) {
			return;
		}
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray322.length; local49++) {
			this.anIntArray322[local49] <<= 0x0;
			this.anIntArray320[local49] <<= 0x0;
			if (this.aByteArray59[local49] != 1) {
				this.anIntArray317[local49] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)[[I")
	public int[][] method4138() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass156Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass156Array1[local12].anInt3989;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(38) int local38 = local8[local20]++;
			}
		}
		@Pc(56) int[][] local56 = new int[local10 + 1][];
		for (@Pc(63) int local63 = 0; local63 <= local10; local63++) {
			local56[local63] = new int[local8[local63]];
			local8[local63] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.aClass156Array1.length; local82++) {
			@Pc(90) int local90 = this.aClass156Array1[local82].anInt3989;
			if (local90 >= 0) {
				local56[local90][local8[local90]++] = local82;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)[[I")
	public int[][] method4139() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5299; local12++) {
			@Pc(19) int local19 = this.anIntArray316[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
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
		for (@Pc(67) int local67 = 0; local67 < this.anInt5299; local67++) {
			@Pc(77) int local77 = this.anIntArray316[local67];
			if (local77 >= 0) {
				local46[local77][local8[local77]++] = local67;
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIII)V")
	public void method4140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg2 != 0) {
			local10 = Class1_Sub1_Sub25.anIntArray249[arg2];
			local14 = Class1_Sub1_Sub25.anIntArray248[arg2];
			for (local16 = 0; local16 < this.anInt5308; local16++) {
				local34 = this.anIntArray318[local16] * local10 + this.anIntArray319[local16] * local14 >> 15;
				this.anIntArray318[local16] = this.anIntArray318[local16] * local14 - this.anIntArray319[local16] * local10 >> 15;
				this.anIntArray319[local16] = local34;
			}
		}
		if (arg1 != 0) {
			local10 = Class1_Sub1_Sub25.anIntArray249[arg1];
			local14 = Class1_Sub1_Sub25.anIntArray248[arg1];
			for (local16 = 0; local16 < this.anInt5308; local16++) {
				local34 = local14 * this.anIntArray318[local16] - this.anIntArray313[local16] * local10 >> 15;
				this.anIntArray313[local16] = this.anIntArray313[local16] * local14 + local10 * this.anIntArray318[local16] >> 15;
				this.anIntArray318[local16] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class1_Sub1_Sub25.anIntArray249[arg0];
		local14 = Class1_Sub1_Sub25.anIntArray248[arg0];
		for (local16 = 0; local16 < this.anInt5308; local16++) {
			local34 = this.anIntArray313[local16] * local10 + this.anIntArray319[local16] * local14 >> 15;
			this.anIntArray313[local16] = this.anIntArray313[local16] * local14 - local10 * this.anIntArray319[local16] >> 15;
			this.anIntArray319[local16] = local34;
		}
	}
}
