import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class36_Sub6 extends Class36 {

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "[I")
	public int[] anIntArray450;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "[Lclient!nn;")
	public Class120[] aClass120Array1;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "[I")
	public int[] anIntArray452;

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "[I")
	public int[] anIntArray454;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "[I")
	public int[] anIntArray455;

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "[I")
	public int[] anIntArray457;

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
	public int anInt5035;

	@OriginalMember(owner = "client!tf", name = "S", descriptor = "S")
	public short aShort36;

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "[Lclient!ic;")
	public Class76[] aClass76Array1;

	@OriginalMember(owner = "client!tf", name = "V", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!tf", name = "W", descriptor = "[I")
	public int[] anIntArray458;

	@OriginalMember(owner = "client!tf", name = "Y", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!tf", name = "Z", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!tf", name = "ab", descriptor = "[I")
	public int[] anIntArray459;

	@OriginalMember(owner = "client!tf", name = "bb", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!tf", name = "cb", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!tf", name = "db", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!tf", name = "eb", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!tf", name = "gb", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!tf", name = "hb", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!tf", name = "ib", descriptor = "[Lclient!ic;")
	public Class76[] aClass76Array2;

	@OriginalMember(owner = "client!tf", name = "jb", descriptor = "[[I")
	public int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!tf", name = "lb", descriptor = "S")
	public short aShort40;

	@OriginalMember(owner = "client!tf", name = "mb", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!tf", name = "nb", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!tf", name = "ob", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!tf", name = "pb", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
	public int anInt5033 = 0;

	@OriginalMember(owner = "client!tf", name = "A", descriptor = "Z")
	private boolean aBoolean419 = false;

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "B")
	public byte aByte22 = 0;

	@OriginalMember(owner = "client!tf", name = "X", descriptor = "I")
	public int anInt5036 = 0;

	@OriginalMember(owner = "client!tf", name = "kb", descriptor = "I")
	public int anInt5037 = 0;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	private Class36_Sub6() {
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([B)V")
	public Class36_Sub6(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4040(arg0);
		} else {
			this.method4056(arg0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(III)V")
	public Class36_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray454 = new int[arg0];
		this.anIntArray450 = new int[arg0];
		this.anIntArray455 = new int[arg0];
		this.anIntArray457 = new int[arg0];
		this.anIntArray452 = new int[arg1];
		this.anIntArray461 = new int[arg1];
		this.anIntArray459 = new int[arg1];
		this.aByteArray63 = new byte[arg1];
		this.aByteArray64 = new byte[arg1];
		this.aByteArray69 = new byte[arg1];
		this.aShortArray81 = new short[arg1];
		this.aShortArray72 = new short[arg1];
		this.aByteArray65 = new byte[arg1];
		this.anIntArray458 = new int[arg1];
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([Lclient!tf;I)V")
	public Class36_Sub6(@OriginalArg(0) Class36_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt5036 = 0;
		this.anInt5033 = 0;
		this.anInt5035 = 0;
		this.aByte22 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class36_Sub6 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt5036 += local53.anInt5036;
				this.anInt5033 += local53.anInt5033;
				this.anInt5035 += local53.anInt5035;
				if (local53.aByteArray64 == null) {
					if (this.aByte22 == -1) {
						this.aByte22 = local53.aByte22;
					}
					if (this.aByte22 != local53.aByte22) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray63 != null;
				local22 |= local53.aByteArray69 != null;
				local24 |= local53.anIntArray458 != null;
				local26 |= local53.aShortArray72 != null;
				local28 |= local53.aByteArray65 != null;
			}
		}
		this.anIntArray454 = new int[this.anInt5036];
		this.anIntArray450 = new int[this.anInt5036];
		this.anIntArray455 = new int[this.anInt5036];
		this.anIntArray457 = new int[this.anInt5036];
		this.aShortArray78 = new short[this.anInt5036];
		this.anIntArray452 = new int[this.anInt5033];
		this.anIntArray461 = new int[this.anInt5033];
		this.anIntArray459 = new int[this.anInt5033];
		if (local18) {
			this.aByteArray63 = new byte[this.anInt5033];
		}
		if (local20) {
			this.aByteArray64 = new byte[this.anInt5033];
		}
		if (local22) {
			this.aByteArray69 = new byte[this.anInt5033];
		}
		if (local24) {
			this.anIntArray458 = new int[this.anInt5033];
		}
		if (local26) {
			this.aShortArray72 = new short[this.anInt5033];
		}
		if (local28) {
			this.aByteArray65 = new byte[this.anInt5033];
		}
		this.aShortArray81 = new short[this.anInt5033];
		this.aShortArray80 = new short[this.anInt5033];
		if (this.anInt5035 > 0) {
			this.aByteArray60 = new byte[this.anInt5035];
			this.aShortArray74 = new short[this.anInt5035];
			this.aShortArray76 = new short[this.anInt5035];
			this.aShortArray77 = new short[this.anInt5035];
			this.aShortArray73 = new short[this.anInt5035];
			this.aShortArray79 = new short[this.anInt5035];
			this.aShortArray75 = new short[this.anInt5035];
			this.aByteArray68 = new byte[this.anInt5035];
			this.aByteArray67 = new byte[this.anInt5035];
			this.aByteArray66 = new byte[this.anInt5035];
			this.aByteArray61 = new byte[this.anInt5035];
			this.aByteArray62 = new byte[this.anInt5035];
		}
		this.anInt5036 = 0;
		this.anInt5033 = 0;
		this.anInt5035 = 0;
		@Pc(330) Class36_Sub6 local330;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(326) short local326 = (short) (0x1 << local46);
			local330 = arg0[local46];
			if (local330 != null) {
				for (@Pc(334) int local334 = 0; local334 < local330.anInt5033; local334++) {
					if (local18 && local330.aByteArray63 != null) {
						this.aByteArray63[this.anInt5033] = local330.aByteArray63[local334];
					}
					if (local20) {
						if (local330.aByteArray64 == null) {
							this.aByteArray64[this.anInt5033] = local330.aByte22;
						} else {
							this.aByteArray64[this.anInt5033] = local330.aByteArray64[local334];
						}
					}
					if (local22 && local330.aByteArray69 != null) {
						this.aByteArray69[this.anInt5033] = local330.aByteArray69[local334];
					}
					if (local24 && local330.anIntArray458 != null) {
						this.anIntArray458[this.anInt5033] = local330.anIntArray458[local334];
					}
					if (local26) {
						if (local330.aShortArray72 == null) {
							this.aShortArray72[this.anInt5033] = -1;
						} else {
							this.aShortArray72[this.anInt5033] = local330.aShortArray72[local334];
						}
					}
					this.aShortArray81[this.anInt5033] = local330.aShortArray81[local334];
					this.aShortArray80[this.anInt5033] = local326;
					this.anIntArray452[this.anInt5033] = this.method4048(local330, local330.anIntArray452[local334], local326);
					this.anIntArray461[this.anInt5033] = this.method4048(local330, local330.anIntArray461[local334], local326);
					this.anIntArray459[this.anInt5033] = this.method4048(local330, local330.anIntArray459[local334], local326);
					this.anInt5033++;
				}
			}
		}
		local46 = 0;
		this.anInt5037 = this.anInt5036;
		for (@Pc(495) int local495 = 0; local495 < arg1; local495++) {
			local330 = arg0[local495];
			@Pc(507) short local507 = (short) (0x1 << local495);
			if (local330 != null) {
				@Pc(511) int local511;
				for (local511 = 0; local511 < local330.anInt5033; local511++) {
					if (local28) {
						this.aByteArray65[local46++] = (byte) (local330.aByteArray65 == null || local330.aByteArray65[local511] == -1 ? -1 : local330.aByteArray65[local511] + this.anInt5035);
					}
				}
				for (local511 = 0; local511 < local330.anInt5035; local511++) {
					@Pc(560) byte local560 = this.aByteArray60[this.anInt5035] = local330.aByteArray60[local511];
					if (local560 == 0) {
						this.aShortArray74[this.anInt5035] = (short) this.method4048(local330, local330.aShortArray74[local511], local507);
						this.aShortArray76[this.anInt5035] = (short) this.method4048(local330, local330.aShortArray76[local511], local507);
						this.aShortArray77[this.anInt5035] = (short) this.method4048(local330, local330.aShortArray77[local511], local507);
					}
					if (local560 >= 1 && local560 <= 3) {
						this.aShortArray74[this.anInt5035] = local330.aShortArray74[local511];
						this.aShortArray76[this.anInt5035] = local330.aShortArray76[local511];
						this.aShortArray77[this.anInt5035] = local330.aShortArray77[local511];
						this.aShortArray73[this.anInt5035] = local330.aShortArray73[local511];
						this.aShortArray79[this.anInt5035] = local330.aShortArray79[local511];
						this.aShortArray75[this.anInt5035] = local330.aShortArray75[local511];
						this.aByteArray68[this.anInt5035] = local330.aByteArray68[local511];
						this.aByteArray67[this.anInt5035] = local330.aByteArray67[local511];
						this.aByteArray66[this.anInt5035] = local330.aByteArray66[local511];
					}
					if (local560 == 2) {
						this.aByteArray61[this.anInt5035] = local330.aByteArray61[local511];
						this.aByteArray62[this.anInt5035] = local330.aByteArray62[local511];
					}
					this.anInt5035++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!tf;ZZZZ)V")
	public Class36_Sub6(@OriginalArg(0) Class36_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5036 = arg0.anInt5036;
		this.anInt5037 = arg0.anInt5037;
		this.anInt5033 = arg0.anInt5033;
		this.anInt5035 = arg0.anInt5035;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray454 = arg0.anIntArray454;
			this.anIntArray450 = arg0.anIntArray450;
			this.anIntArray455 = arg0.anIntArray455;
		} else {
			this.anIntArray454 = new int[this.anInt5036];
			this.anIntArray450 = new int[this.anInt5036];
			this.anIntArray455 = new int[this.anInt5036];
			for (local64 = 0; local64 < this.anInt5036; local64++) {
				this.anIntArray454[local64] = arg0.anIntArray454[local64];
				this.anIntArray450[local64] = arg0.anIntArray450[local64];
				this.anIntArray455[local64] = arg0.anIntArray455[local64];
			}
		}
		if (arg2) {
			this.aShortArray81 = arg0.aShortArray81;
		} else {
			this.aShortArray81 = new short[this.anInt5033];
			for (local64 = 0; local64 < this.anInt5033; local64++) {
				this.aShortArray81[local64] = arg0.aShortArray81[local64];
			}
		}
		if (arg3 || arg0.aShortArray72 == null) {
			this.aShortArray72 = arg0.aShortArray72;
		} else {
			this.aShortArray72 = new short[this.anInt5033];
			for (local64 = 0; local64 < this.anInt5033; local64++) {
				this.aShortArray72[local64] = arg0.aShortArray72[local64];
			}
		}
		this.aByteArray69 = arg0.aByteArray69;
		this.anIntArray452 = arg0.anIntArray452;
		this.anIntArray461 = arg0.anIntArray461;
		this.anIntArray459 = arg0.anIntArray459;
		this.aByteArray63 = arg0.aByteArray63;
		this.aByteArray64 = arg0.aByteArray64;
		this.aByteArray65 = arg0.aByteArray65;
		this.aByte22 = arg0.aByte22;
		this.aByteArray60 = arg0.aByteArray60;
		this.aShortArray74 = arg0.aShortArray74;
		this.aShortArray76 = arg0.aShortArray76;
		this.aShortArray77 = arg0.aShortArray77;
		this.aShortArray73 = arg0.aShortArray73;
		this.aShortArray79 = arg0.aShortArray79;
		this.aShortArray75 = arg0.aShortArray75;
		this.aByteArray68 = arg0.aByteArray68;
		this.aByteArray67 = arg0.aByteArray67;
		this.aByteArray66 = arg0.aByteArray66;
		this.aByteArray61 = arg0.aByteArray61;
		this.aByteArray62 = arg0.aByteArray62;
		this.anIntArray457 = arg0.anIntArray457;
		this.anIntArray458 = arg0.anIntArray458;
		this.anIntArrayArray47 = arg0.anIntArrayArray47;
		this.anIntArrayArray48 = arg0.anIntArrayArray48;
		this.aClass76Array2 = arg0.aClass76Array2;
		this.aClass120Array1 = arg0.aClass120Array1;
		this.aClass76Array1 = arg0.aClass76Array1;
		this.aShort36 = arg0.aShort36;
		this.aShort40 = arg0.aShort40;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!tf;")
	public Class36_Sub6 method4035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4054();
		@Pc(6) int local6 = arg4 + this.aShort42;
		@Pc(11) int local11 = arg4 + this.aShort38;
		@Pc(16) int local16 = arg6 + this.aShort39;
		@Pc(21) int local21 = arg6 + this.aShort35;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local6 < 0 || local11 + 128 >> 7 >= arg2.length || local16 < 0 || local21 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local6 < 0 || local11 + 128 >> 7 >= arg3.length || local16 < 0 || local21 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local6 >>= 0x7;
			local11 = local11 + 127 >> 7;
			local16 >>= 0x7;
			local21 = local21 + 127 >> 7;
			if (arg2[local6][local16] == arg5 && arg2[local11][local16] == arg5 && arg2[local6][local21] == arg5 && arg2[local11][local21] == arg5) {
				return this;
			}
		}
		@Pc(147) Class36_Sub6 local147 = new Class36_Sub6();
		local147.anInt5036 = this.anInt5036;
		local147.anInt5037 = this.anInt5037;
		local147.anInt5033 = this.anInt5033;
		local147.anInt5035 = this.anInt5035;
		local147.anIntArray452 = this.anIntArray452;
		local147.anIntArray461 = this.anIntArray461;
		local147.anIntArray459 = this.anIntArray459;
		local147.aByteArray63 = this.aByteArray63;
		local147.aByteArray64 = this.aByteArray64;
		local147.aByteArray69 = this.aByteArray69;
		local147.aByteArray65 = this.aByteArray65;
		local147.aShortArray81 = this.aShortArray81;
		local147.aShortArray72 = this.aShortArray72;
		local147.aByte22 = this.aByte22;
		local147.aByteArray60 = this.aByteArray60;
		local147.aShortArray74 = this.aShortArray74;
		local147.aShortArray76 = this.aShortArray76;
		local147.aShortArray77 = this.aShortArray77;
		local147.aShortArray73 = this.aShortArray73;
		local147.aShortArray79 = this.aShortArray79;
		local147.aShortArray75 = this.aShortArray75;
		local147.aByteArray68 = this.aByteArray68;
		local147.aByteArray67 = this.aByteArray67;
		local147.aByteArray66 = this.aByteArray66;
		local147.aByteArray61 = this.aByteArray61;
		local147.aByteArray62 = this.aByteArray62;
		local147.anIntArray457 = this.anIntArray457;
		local147.anIntArray458 = this.anIntArray458;
		local147.anIntArrayArray47 = this.anIntArrayArray47;
		local147.anIntArrayArray48 = this.anIntArrayArray48;
		local147.aShort36 = this.aShort36;
		local147.aShort40 = this.aShort40;
		local147.aClass76Array2 = this.aClass76Array2;
		local147.aClass120Array1 = this.aClass120Array1;
		local147.aClass76Array1 = this.aClass76Array1;
		if (arg0 == 3) {
			local147.anIntArray454 = Static268.method4462(this.anIntArray454);
			local147.anIntArray450 = Static268.method4462(this.anIntArray450);
			local147.anIntArray455 = Static268.method4462(this.anIntArray455);
		} else {
			local147.anIntArray454 = this.anIntArray454;
			local147.anIntArray450 = new int[local147.anInt5036];
			local147.anIntArray455 = this.anIntArray455;
		}
		@Pc(330) int local330;
		@Pc(341) int local341;
		@Pc(348) int local348;
		@Pc(352) int local352;
		@Pc(356) int local356;
		@Pc(360) int local360;
		@Pc(364) int local364;
		@Pc(386) int local386;
		@Pc(412) int local412;
		@Pc(424) int local424;
		if (arg0 == 1) {
			for (local330 = 0; local330 < local147.anInt5037; local330++) {
				local341 = this.anIntArray454[local330] + arg4;
				local348 = this.anIntArray455[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
				local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
				local424 = local386 * (128 - local356) + local412 * local356 >> 7;
				local147.anIntArray450[local330] = this.anIntArray450[local330] + local424 - arg5;
			}
			for (local330 = local147.anInt5037; local330 < local147.anInt5036; local330++) {
				local341 = this.anIntArray454[local330] + arg4;
				local348 = this.anIntArray455[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				if (local360 >= 0 && local360 < arg2.length - 1 && local364 >= 0 && local364 < arg2[0].length - 1) {
					local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
					local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
					local424 = local386 * (128 - local356) + local412 * local356 >> 7;
					local147.anIntArray450[local330] = this.anIntArray450[local330] + local424 - arg5;
				}
			}
		} else {
			@Pc(681) int local681;
			if (arg0 == 2) {
				for (local330 = 0; local330 < local147.anInt5037; local330++) {
					local341 = (this.anIntArray450[local330] << 16) / this.aShort41;
					if (local341 < arg1) {
						local348 = this.anIntArray454[local330] + arg4;
						local352 = this.anIntArray455[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
						local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray450[local330] = this.anIntArray450[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
					} else {
						local147.anIntArray450[local330] = this.anIntArray450[local330];
					}
				}
				for (local330 = local147.anInt5037; local330 < local147.anInt5036; local330++) {
					local341 = (this.anIntArray450[local330] << 16) / this.aShort41;
					if (local341 < arg1) {
						local348 = this.anIntArray454[local330] + arg4;
						local352 = this.anIntArray455[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						if (local364 >= 0 && local364 < arg2.length - 1 && local386 >= 0 && local386 < arg2[0].length - 1) {
							local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
							local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
							local681 = local412 * (128 - local360) + local424 * local360 >> 7;
							local147.anIntArray450[local330] = this.anIntArray450[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
						}
					} else {
						local147.anIntArray450[local330] = this.anIntArray450[local330];
					}
				}
			} else if (arg0 == 3) {
				local330 = (arg1 & 0xFF) * 4;
				local341 = (arg1 >> 8 & 0xFF) * 4;
				local147.method4044(arg2, arg4, arg5, arg6, local330, local341);
			} else if (arg0 == 4) {
				local330 = this.aShort37 - this.aShort41;
				for (local341 = 0; local341 < this.anInt5037; local341++) {
					local348 = this.anIntArray454[local341] + arg4;
					local352 = this.anIntArray455[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
					local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
					local681 = local412 * (128 - local360) + local424 * local360 >> 7;
					local147.anIntArray450[local341] = this.anIntArray450[local341] + local681 + local330 - arg5;
				}
				for (local341 = local147.anInt5037; local341 < local147.anInt5036; local341++) {
					local348 = this.anIntArray454[local341] + arg4;
					local352 = this.anIntArray455[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					if (local364 >= 0 && local364 < arg3.length - 1 && local386 >= 0 && local386 < arg3[0].length - 1) {
						local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
						local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray450[local341] = this.anIntArray450[local341] + local681 + local330 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local330 = this.aShort37 - this.aShort41;
				@Pc(1314) int local1314;
				@Pc(1318) int local1318;
				for (local341 = 0; local341 < this.anInt5037; local341++) {
					local348 = this.anIntArray454[local341] + arg4;
					local352 = this.anIntArray455[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
					local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
					local681 = local412 * (128 - local360) + local424 * local360 >> 7;
					local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
					local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
					local1314 = local412 * (128 - local360) + local424 * local360 >> 7;
					local1318 = local681 - local1314;
					local147.anIntArray450[local341] = ((this.anIntArray450[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
				}
				for (local341 = local147.anInt5037; local341 < local147.anInt5036; local341++) {
					local348 = this.anIntArray454[local341] + arg4;
					local352 = this.anIntArray455[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					if (local364 >= 0 && local364 < arg2.length - 1 && local364 < arg3.length - 1 && local386 >= 0 && local386 < arg2[0].length - 1 && local386 < arg3[0].length - 1) {
						local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
						local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
						local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
						local1314 = local412 * (128 - local360) + local424 * local360 >> 7;
						local1318 = local681 - local1314;
						local147.anIntArray450[local341] = ((this.anIntArray450[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
					}
				}
			}
		}
		this.aBoolean419 = false;
		return local147;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()V")
	public void method4036() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5036; local1++) {
			@Pc(10) int local10 = this.anIntArray455[local1];
			this.anIntArray455[local1] = this.anIntArray454[local1];
			this.anIntArray454[local1] = -local10;
		}
		this.method4053();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	private void method4037(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static252.anIntArray451[arg0];
		@Pc(7) int local7 = Static252.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5036; local9++) {
			@Pc(29) int local29 = this.anIntArray450[local9] * local7 - this.anIntArray455[local9] * local3 >> 16;
			this.anIntArray455[local9] = this.anIntArray450[local9] * local3 + this.anIntArray455[local9] * local7 >> 16;
			this.anIntArray450[local9] = local29;
		}
		this.method4053();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()I")
	@Override
	public int method4881() {
		if (!this.aBoolean419) {
			this.method4054();
		}
		return this.aShort41;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "()V")
	public void method4039() {
		this.anIntArray457 = null;
		this.anIntArray458 = null;
		this.anIntArrayArray47 = null;
		this.anIntArrayArray48 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([B)V")
	private void method4040(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub26 local4 = new Class2_Sub26(arg0);
		@Pc(9) Class2_Sub26 local9 = new Class2_Sub26(arg0);
		@Pc(14) Class2_Sub26 local14 = new Class2_Sub26(arg0);
		@Pc(19) Class2_Sub26 local19 = new Class2_Sub26(arg0);
		@Pc(24) Class2_Sub26 local24 = new Class2_Sub26(arg0);
		@Pc(29) Class2_Sub26 local29 = new Class2_Sub26(arg0);
		@Pc(34) Class2_Sub26 local34 = new Class2_Sub26(arg0);
		local4.anInt5328 = arg0.length - 23;
		@Pc(44) int local44 = local4.method4242();
		@Pc(48) int local48 = local4.method4242();
		@Pc(52) int local52 = local4.method4261();
		@Pc(56) int local56 = local4.method4261();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method4261();
		@Pc(82) int local82 = local4.method4261();
		@Pc(86) int local86 = local4.method4261();
		@Pc(90) int local90 = local4.method4261();
		@Pc(94) int local94 = local4.method4261();
		@Pc(98) int local98 = local4.method4242();
		@Pc(102) int local102 = local4.method4242();
		@Pc(106) int local106 = local4.method4242();
		@Pc(110) int local110 = local4.method4242();
		@Pc(114) int local114 = local4.method4242();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray60 = new byte[local52];
			local4.anInt5328 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray60[local131] = local4.method4220();
				if (local143 == 0) {
					local116++;
				}
				if (local143 >= 1 && local143 <= 3) {
					local118++;
				}
				if (local143 == 2) {
					local120++;
				}
			}
		}
		local131 = local52 + local44;
		@Pc(169) int local169 = local131;
		if (local65) {
			local131 += local48;
		}
		@Pc(177) int local177 = local131;
		local131 += local48;
		@Pc(183) int local183 = local131;
		if (local78 == 255) {
			local131 += local48;
		}
		@Pc(192) int local192 = local131;
		if (local86 == 1) {
			local131 += local48;
		}
		@Pc(201) int local201 = local131;
		if (local94 == 1) {
			local131 += local44;
		}
		@Pc(210) int local210 = local131;
		if (local82 == 1) {
			local131 += local48;
		}
		@Pc(219) int local219 = local131;
		local131 += local110;
		@Pc(225) int local225 = local131;
		if (local90 == 1) {
			local131 += local48 * 2;
		}
		@Pc(236) int local236 = local131;
		local131 += local114;
		@Pc(242) int local242 = local131;
		local131 += local48 * 2;
		@Pc(250) int local250 = local131;
		local131 += local98;
		@Pc(256) int local256 = local131;
		local131 += local102;
		@Pc(262) int local262 = local131;
		local131 += local106;
		@Pc(268) int local268 = local131;
		local131 += local116 * 6;
		@Pc(276) int local276 = local131;
		local131 += local118 * 6;
		@Pc(284) int local284 = local131;
		local131 += local118 * 6;
		@Pc(292) int local292 = local131;
		local131 += local118;
		@Pc(298) int local298 = local131;
		local131 += local118;
		@Pc(304) int local304 = local131;
		local131 += local118 + local120 * 2;
		this.anInt5036 = local44;
		this.anInt5033 = local48;
		this.anInt5035 = local52;
		this.anIntArray454 = new int[local44];
		this.anIntArray450 = new int[local44];
		this.anIntArray455 = new int[local44];
		this.anIntArray452 = new int[local48];
		this.anIntArray461 = new int[local48];
		this.anIntArray459 = new int[local48];
		if (local94 == 1) {
			this.anIntArray457 = new int[local44];
		}
		if (local65) {
			this.aByteArray63 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray64 = new byte[local48];
		} else {
			this.aByte22 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray69 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray458 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray72 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray65 = new byte[local48];
		}
		this.aShortArray81 = new short[local48];
		if (local52 > 0) {
			this.aShortArray74 = new short[local52];
			this.aShortArray76 = new short[local52];
			this.aShortArray77 = new short[local52];
			if (local118 > 0) {
				this.aShortArray73 = new short[local118];
				this.aShortArray79 = new short[local118];
				this.aShortArray75 = new short[local118];
				this.aByteArray68 = new byte[local118];
				this.aByteArray67 = new byte[local118];
				this.aByteArray66 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray61 = new byte[local120];
				this.aByteArray62 = new byte[local120];
			}
		}
		local4.anInt5328 = local52;
		local9.anInt5328 = local250;
		local14.anInt5328 = local256;
		local19.anInt5328 = local262;
		local24.anInt5328 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method4261();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method4250();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method4250();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method4250();
			}
			this.anIntArray454[local479] = local473 + local488;
			this.anIntArray450[local479] = local475 + local498;
			this.anIntArray455[local479] = local477 + local508;
			local473 = this.anIntArray454[local479];
			local475 = this.anIntArray450[local479];
			local477 = this.anIntArray455[local479];
			if (local94 == 1) {
				this.anIntArray457[local479] = local24.method4261();
			}
		}
		local4.anInt5328 = local242;
		local9.anInt5328 = local169;
		local14.anInt5328 = local183;
		local19.anInt5328 = local210;
		local24.anInt5328 = local192;
		local29.anInt5328 = local225;
		local34.anInt5328 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray81[local479] = (short) local4.method4242();
			if (local65) {
				this.aByteArray63[local479] = local9.method4220();
			}
			if (local78 == 255) {
				this.aByteArray64[local479] = local14.method4220();
			}
			if (local82 == 1) {
				this.aByteArray69[local479] = local19.method4220();
			}
			if (local86 == 1) {
				this.anIntArray458[local479] = local24.method4261();
			}
			if (local90 == 1) {
				this.aShortArray72[local479] = (short) (local29.method4242() - 1);
			}
			if (this.aByteArray65 != null) {
				if (this.aShortArray72[local479] == -1) {
					this.aByteArray65[local479] = -1;
				} else {
					this.aByteArray65[local479] = (byte) (local34.method4261() - 1);
				}
			}
		}
		this.anInt5037 = -1;
		local4.anInt5328 = local219;
		local9.anInt5328 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method4261();
			if (local703 == 1) {
				local479 = local4.method4250() + local498;
				local486 = local4.method4250() + local479;
				local488 = local4.method4250() + local486;
				local498 = local488;
				this.anIntArray452[local508] = local479;
				this.anIntArray461[local508] = local486;
				this.anIntArray459[local508] = local488;
				if (local479 > this.anInt5037) {
					this.anInt5037 = local479;
				}
				if (local486 > this.anInt5037) {
					this.anInt5037 = local486;
				}
				if (local488 > this.anInt5037) {
					this.anInt5037 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method4250() + local498;
				local498 = local488;
				this.anIntArray452[local508] = local479;
				this.anIntArray461[local508] = local486;
				this.anIntArray459[local508] = local488;
				if (local488 > this.anInt5037) {
					this.anInt5037 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method4250() + local498;
				local498 = local488;
				this.anIntArray452[local508] = local479;
				this.anIntArray461[local508] = local486;
				this.anIntArray459[local508] = local488;
				if (local488 > this.anInt5037) {
					this.anInt5037 = local488;
				}
			}
			if (local703 == 4) {
				@Pc(841) int local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method4250() + local498;
				local498 = local488;
				this.anIntArray452[local508] = local479;
				this.anIntArray461[local508] = local841;
				this.anIntArray459[local508] = local488;
				if (local488 > this.anInt5037) {
					this.anInt5037 = local488;
				}
			}
		}
		this.anInt5037++;
		local4.anInt5328 = local268;
		local9.anInt5328 = local276;
		local14.anInt5328 = local284;
		local19.anInt5328 = local292;
		local24.anInt5328 = local298;
		local29.anInt5328 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray60[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray74[local508] = (short) local4.method4242();
				this.aShortArray76[local508] = (short) local4.method4242();
				this.aShortArray77[local508] = (short) local4.method4242();
			}
			if (local703 == 1) {
				this.aShortArray74[local508] = (short) local9.method4242();
				this.aShortArray76[local508] = (short) local9.method4242();
				this.aShortArray77[local508] = (short) local9.method4242();
				this.aShortArray73[local508] = (short) local14.method4242();
				this.aShortArray79[local508] = (short) local14.method4242();
				this.aShortArray75[local508] = (short) local14.method4242();
				this.aByteArray68[local508] = local19.method4220();
				this.aByteArray67[local508] = local24.method4220();
				this.aByteArray66[local508] = local29.method4220();
			}
			if (local703 == 2) {
				this.aShortArray74[local508] = (short) local9.method4242();
				this.aShortArray76[local508] = (short) local9.method4242();
				this.aShortArray77[local508] = (short) local9.method4242();
				this.aShortArray73[local508] = (short) local14.method4242();
				this.aShortArray79[local508] = (short) local14.method4242();
				this.aShortArray75[local508] = (short) local14.method4242();
				this.aByteArray68[local508] = local19.method4220();
				this.aByteArray67[local508] = local24.method4220();
				this.aByteArray66[local508] = local29.method4220();
				this.aByteArray61[local508] = local29.method4220();
				this.aByteArray62[local508] = local29.method4220();
			}
			if (local703 == 3) {
				this.aShortArray74[local508] = (short) local9.method4242();
				this.aShortArray76[local508] = (short) local9.method4242();
				this.aShortArray77[local508] = (short) local9.method4242();
				this.aShortArray73[local508] = (short) local14.method4242();
				this.aShortArray79[local508] = (short) local14.method4242();
				this.aShortArray75[local508] = (short) local14.method4242();
				this.aByteArray68[local508] = local19.method4220();
				this.aByteArray67[local508] = local24.method4220();
				this.aByteArray66[local508] = local29.method4220();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt5328 = local131;
		local508 = local4.method4261();
		if (local508 > 0) {
			local4.anInt5328 += local508 * 4;
		}
		local703 = local4.method4261();
		if (local703 > 0) {
			local4.anInt5328 += local703 * 4;
		}
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "()V")
	public void method4041() {
		if (this.aClass76Array2 != null) {
			return;
		}
		this.aClass76Array2 = new Class76[this.anInt5037];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt5037; local10++) {
			this.aClass76Array2[local10] = new Class76();
		}
		for (local10 = 0; local10 < this.anInt5033; local10++) {
			@Pc(34) int local34 = this.anIntArray452[local10];
			@Pc(39) int local39 = this.anIntArray461[local10];
			@Pc(44) int local44 = this.anIntArray459[local10];
			@Pc(54) int local54 = this.anIntArray454[local39] - this.anIntArray454[local34];
			@Pc(64) int local64 = this.anIntArray450[local39] - this.anIntArray450[local34];
			@Pc(74) int local74 = this.anIntArray455[local39] - this.anIntArray455[local34];
			@Pc(84) int local84 = this.anIntArray454[local44] - this.anIntArray454[local34];
			@Pc(94) int local94 = this.anIntArray450[local44] - this.anIntArray450[local34];
			@Pc(104) int local104 = this.anIntArray455[local44] - this.anIntArray455[local34];
			@Pc(112) int local112 = local64 * local104 - local94 * local74;
			@Pc(120) int local120 = local74 * local84 - local104 * local54;
			@Pc(128) int local128;
			for (local128 = local54 * local94 - local84 * local64; local112 > 8192 || local120 > 8192 || local128 > 8192 || local112 < -8192 || local120 < -8192 || local128 < -8192; local128 >>= 0x1) {
				local112 >>= 0x1;
				local120 >>= 0x1;
			}
			@Pc(174) int local174 = (int) Math.sqrt((double) (local112 * local112 + local120 * local120 + local128 * local128));
			if (local174 <= 0) {
				local174 = 1;
			}
			local112 = local112 * 256 / local174;
			local120 = local120 * 256 / local174;
			local128 = local128 * 256 / local174;
			@Pc(201) byte local201;
			if (this.aByteArray63 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray63[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class76 local214 = this.aClass76Array2[local34];
				local214.anInt2242 += local112;
				local214.anInt2240 += local120;
				local214.anInt2238 += local128;
				local214.anInt2237++;
				@Pc(243) Class76 local243 = this.aClass76Array2[local39];
				local243.anInt2242 += local112;
				local243.anInt2240 += local120;
				local243.anInt2238 += local128;
				local243.anInt2237++;
				@Pc(272) Class76 local272 = this.aClass76Array2[local44];
				local272.anInt2242 += local112;
				local272.anInt2240 += local120;
				local272.anInt2238 += local128;
				local272.anInt2237++;
			} else if (local201 == 1) {
				if (this.aClass120Array1 == null) {
					this.aClass120Array1 = new Class120[this.anInt5033];
				}
				@Pc(317) Class120 local317 = this.aClass120Array1[local10] = new Class120();
				local317.anInt3882 = local112;
				local317.anInt3883 = local120;
				local317.anInt3881 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIBSB)I")
	public int method4042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray452[this.anInt5033] = arg0;
		this.anIntArray461[this.anInt5033] = arg1;
		this.anIntArray459[this.anInt5033] = arg2;
		this.aByteArray63[this.anInt5033] = 1;
		this.aByteArray65[this.anInt5033] = -1;
		this.aShortArray81[this.anInt5033] = arg3;
		this.aShortArray72[this.anInt5033] = -1;
		this.aByteArray69[this.anInt5033] = arg4;
		return this.anInt5033++;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([[IIIIII)V")
	private void method4044(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static252.method4059(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static252.method4059(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static252.method4059(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static252.method4059(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method4037(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method4058(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method4055(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public void method4045() {
		@Pc(3) int local3 = Static252.anIntArray451[256];
		@Pc(7) int local7 = Static252.anIntArray453[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5036; local9++) {
			@Pc(29) int local29 = this.anIntArray455[local9] * local3 + this.anIntArray454[local9] * local7 >> 16;
			this.anIntArray455[local9] = this.anIntArray455[local9] * local7 - this.anIntArray454[local9] * local3 >> 16;
			this.anIntArray454[local9] = local29;
		}
		this.method4053();
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "()V")
	public void method4046() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5036; local1++) {
			this.anIntArray454[local1] = -this.anIntArray454[local1];
			this.anIntArray455[local1] = -this.anIntArray455[local1];
		}
		this.method4053();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()Z")
	@Override
	public boolean method4891() {
		return true;
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "()V")
	public void method4047() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5036; local1++) {
			this.anIntArray455[local1] = -this.anIntArray455[local1];
		}
		for (local1 = 0; local1 < this.anInt5033; local1++) {
			@Pc(27) int local27 = this.anIntArray452[local1];
			this.anIntArray452[local1] = this.anIntArray459[local1];
			this.anIntArray459[local1] = local27;
		}
		this.method4053();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!tf;IS)I")
	private int method4048(@OriginalArg(0) Class36_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray454[arg1];
		@Pc(9) int local9 = arg0.anIntArray450[arg1];
		@Pc(14) int local14 = arg0.anIntArray455[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5036; local16++) {
			if (local4 == this.anIntArray454[local16] && local9 == this.anIntArray450[local16] && local14 == this.anIntArray455[local16]) {
				this.aShortArray78[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray454[this.anInt5036] = local4;
		this.anIntArray450[this.anInt5036] = local9;
		this.anIntArray455[this.anInt5036] = local14;
		this.aShortArray78[this.anInt5036] = arg2;
		if (arg0.anIntArray457 != null) {
			this.anIntArray457[this.anInt5036] = arg0.anIntArray457[arg1];
		}
		return this.anInt5036++;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIIII)Lclient!r;")
	public Class36_Sub2 method4049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static60.aBoolean106) {
			@Pc(9) Class36_Sub2_Sub1 local9 = new Class36_Sub2_Sub1(this, arg0, arg1, true);
			local9.method954();
			return local9;
		} else {
			return new Class36_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "()Lclient!tf;")
	public Class36_Sub6 method4050() {
		@Pc(3) Class36_Sub6 local3 = new Class36_Sub6();
		if (this.aByteArray63 != null) {
			local3.aByteArray63 = new byte[this.anInt5033];
			for (@Pc(13) int local13 = 0; local13 < this.anInt5033; local13++) {
				local3.aByteArray63[local13] = this.aByteArray63[local13];
			}
		}
		local3.anInt5036 = this.anInt5036;
		local3.anInt5037 = this.anInt5037;
		local3.anInt5033 = this.anInt5033;
		local3.anInt5035 = this.anInt5035;
		local3.anIntArray454 = this.anIntArray454;
		local3.anIntArray450 = this.anIntArray450;
		local3.anIntArray455 = this.anIntArray455;
		local3.anIntArray452 = this.anIntArray452;
		local3.anIntArray461 = this.anIntArray461;
		local3.anIntArray459 = this.anIntArray459;
		local3.aByteArray64 = this.aByteArray64;
		local3.aByteArray69 = this.aByteArray69;
		local3.aByteArray65 = this.aByteArray65;
		local3.aShortArray81 = this.aShortArray81;
		local3.aShortArray72 = this.aShortArray72;
		local3.aByte22 = this.aByte22;
		local3.aByteArray60 = this.aByteArray60;
		local3.aShortArray74 = this.aShortArray74;
		local3.aShortArray76 = this.aShortArray76;
		local3.aShortArray77 = this.aShortArray77;
		local3.aShortArray73 = this.aShortArray73;
		local3.aShortArray79 = this.aShortArray79;
		local3.aShortArray75 = this.aShortArray75;
		local3.aByteArray68 = this.aByteArray68;
		local3.aByteArray67 = this.aByteArray67;
		local3.aByteArray66 = this.aByteArray66;
		local3.aByteArray61 = this.aByteArray61;
		local3.aByteArray62 = this.aByteArray62;
		local3.anIntArray457 = this.anIntArray457;
		local3.anIntArray458 = this.anIntArray458;
		local3.anIntArrayArray47 = this.anIntArrayArray47;
		local3.anIntArrayArray48 = this.anIntArrayArray48;
		local3.aClass76Array2 = this.aClass76Array2;
		local3.aClass120Array1 = this.aClass120Array1;
		local3.aShort36 = this.aShort36;
		local3.aShort40 = this.aShort40;
		return local3;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(IIIII)Lclient!rh;")
	public Class36_Sub2_Sub2 method4051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class36_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method4878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class119_Sub1 arg10) {
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(SS)V")
	public void method4052(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray72 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt5033; local5++) {
			if (this.aShortArray72[local5] == arg0) {
				this.aShortArray72[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!fc;IIIZ)V")
	@Override
	public void method4877(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class36_Sub6 local2 = (Class36_Sub6) arg0;
		local2.method4054();
		local2.method4041();
		Static252.anInt5034++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray454;
		@Pc(18) int local18 = local2.anInt5037;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt5037; local20++) {
			@Pc(29) Class76 local29 = this.aClass76Array2[local20];
			if (local29.anInt2237 != 0) {
				@Pc(40) int local40 = this.anIntArray450[local20] - arg2;
				if (local40 >= local2.aShort41 && local40 <= local2.aShort37) {
					@Pc(56) int local56 = this.anIntArray454[local20] - arg1;
					if (local56 >= local2.aShort42 && local56 <= local2.aShort38) {
						@Pc(72) int local72 = this.anIntArray455[local20] - arg3;
						if (local72 >= local2.aShort39 && local72 <= local2.aShort35) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class76 local91 = local2.aClass76Array2[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray455[local83] && local40 == local2.anIntArray450[local83] && local91.anInt2237 != 0) {
									if (this.aClass76Array1 == null) {
										this.aClass76Array1 = new Class76[this.anInt5037];
									}
									if (local2.aClass76Array1 == null) {
										local2.aClass76Array1 = new Class76[local18];
									}
									@Pc(131) Class76 local131 = this.aClass76Array1[local20];
									if (local131 == null) {
										local131 = this.aClass76Array1[local20] = new Class76(local29);
									}
									@Pc(148) Class76 local148 = local2.aClass76Array1[local83];
									if (local148 == null) {
										local148 = local2.aClass76Array1[local83] = new Class76(local91);
									}
									local131.anInt2242 += local91.anInt2242;
									local131.anInt2240 += local91.anInt2240;
									local131.anInt2238 += local91.anInt2238;
									local131.anInt2237 += local91.anInt2237;
									local148.anInt2242 += local29.anInt2242;
									local148.anInt2240 += local29.anInt2240;
									local148.anInt2238 += local29.anInt2238;
									local148.anInt2237 += local29.anInt2237;
									local12++;
									Static252.anIntArray460[local20] = Static252.anInt5034;
									Static252.anIntArray456[local83] = Static252.anInt5034;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (local20 = 0; local20 < this.anInt5033; local20++) {
			if (Static252.anIntArray460[this.anIntArray452[local20]] == Static252.anInt5034 && Static252.anIntArray460[this.anIntArray461[local20]] == Static252.anInt5034 && Static252.anIntArray460[this.anIntArray459[local20]] == Static252.anInt5034) {
				if (this.aByteArray63 == null) {
					this.aByteArray63 = new byte[this.anInt5033];
				}
				this.aByteArray63[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt5033; local20++) {
			if (Static252.anIntArray456[local2.anIntArray452[local20]] == Static252.anInt5034 && Static252.anIntArray456[local2.anIntArray461[local20]] == Static252.anInt5034 && Static252.anIntArray456[local2.anIntArray459[local20]] == Static252.anInt5034) {
				if (local2.aByteArray63 == null) {
					local2.aByteArray63 = new byte[local2.anInt5033];
				}
				local2.aByteArray63[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "()V")
	private void method4053() {
		this.aClass76Array2 = null;
		this.aClass76Array1 = null;
		this.aClass120Array1 = null;
		this.aBoolean419 = false;
	}

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "()V")
	private void method4054() {
		if (this.aBoolean419) {
			return;
		}
		this.aBoolean419 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5037; local20++) {
			@Pc(29) int local29 = this.anIntArray454[local20];
			@Pc(34) int local34 = this.anIntArray450[local20];
			@Pc(39) int local39 = this.anIntArray455[local20];
			if (local29 < local8) {
				local8 = local29;
			}
			if (local29 > local14) {
				local14 = local29;
			}
			if (local34 < local10) {
				local10 = local34;
			}
			if (local34 > local16) {
				local16 = local34;
			}
			if (local39 < local12) {
				local12 = local39;
			}
			if (local39 > local18) {
				local18 = local39;
			}
		}
		this.aShort42 = (short) local8;
		this.aShort38 = (short) local14;
		this.aShort41 = (short) local10;
		this.aShort37 = (short) local16;
		this.aShort39 = (short) local12;
		this.aShort35 = (short) local18;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)V")
	public void method4055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5036; local1++) {
			this.anIntArray454[local1] += arg0;
			this.anIntArray450[local1] += arg1;
			this.anIntArray455[local1] += arg2;
		}
		this.method4053();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "([B)V")
	private void method4056(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub26 local8 = new Class2_Sub26(arg0);
		@Pc(13) Class2_Sub26 local13 = new Class2_Sub26(arg0);
		@Pc(18) Class2_Sub26 local18 = new Class2_Sub26(arg0);
		@Pc(23) Class2_Sub26 local23 = new Class2_Sub26(arg0);
		@Pc(28) Class2_Sub26 local28 = new Class2_Sub26(arg0);
		local8.anInt5328 = arg0.length - 18;
		@Pc(38) int local38 = local8.method4242();
		@Pc(42) int local42 = local8.method4242();
		@Pc(46) int local46 = local8.method4261();
		@Pc(50) int local50 = local8.method4261();
		@Pc(54) int local54 = local8.method4261();
		@Pc(58) int local58 = local8.method4261();
		@Pc(62) int local62 = local8.method4261();
		@Pc(66) int local66 = local8.method4261();
		@Pc(70) int local70 = local8.method4242();
		@Pc(74) int local74 = local8.method4242();
		@Pc(78) int local78 = local8.method4242();
		@Pc(82) int local82 = local8.method4242();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.anInt5036 = local38;
		this.anInt5033 = local42;
		this.anInt5035 = local46;
		this.anIntArray454 = new int[local38];
		this.anIntArray450 = new int[local38];
		this.anIntArray455 = new int[local38];
		this.anIntArray452 = new int[local42];
		this.anIntArray461 = new int[local42];
		this.anIntArray459 = new int[local42];
		if (local46 > 0) {
			this.aByteArray60 = new byte[local46];
			this.aShortArray74 = new short[local46];
			this.aShortArray76 = new short[local46];
			this.aShortArray77 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray457 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray63 = new byte[local42];
			this.aByteArray65 = new byte[local42];
			this.aShortArray72 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray64 = new byte[local42];
		} else {
			this.aByte22 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray69 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray458 = new int[local42];
		}
		this.aShortArray81 = new short[local42];
		local8.anInt5328 = 0;
		local13.anInt5328 = local165;
		local18.anInt5328 = local171;
		local23.anInt5328 = local90;
		local28.anInt5328 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method4261();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method4250();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method4250();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method4250();
			}
			this.anIntArray454[local307] = local301 + local316;
			this.anIntArray450[local307] = local303 + local326;
			this.anIntArray455[local307] = local305 + local336;
			local301 = this.anIntArray454[local307];
			local303 = this.anIntArray450[local307];
			local305 = this.anIntArray455[local307];
			if (local66 == 1) {
				this.anIntArray457[local307] = local28.method4261();
			}
		}
		local8.anInt5328 = local149;
		local13.anInt5328 = local116;
		local18.anInt5328 = local98;
		local23.anInt5328 = local134;
		local28.anInt5328 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray81[local307] = (short) local8.method4242();
			if (local50 == 1) {
				local314 = local13.method4261();
				if ((local314 & 0x1) == 1) {
					this.aByteArray63[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray63[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray65[local307] = (byte) (local314 >> 2);
					this.aShortArray72[local307] = this.aShortArray81[local307];
					this.aShortArray81[local307] = 127;
					if (this.aShortArray72[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray65[local307] = -1;
					this.aShortArray72[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray64[local307] = local18.method4220();
			}
			if (local58 == 1) {
				this.aByteArray69[local307] = local23.method4220();
			}
			if (local62 == 1) {
				this.anIntArray458[local307] = local28.method4261();
			}
		}
		this.anInt5037 = -1;
		local8.anInt5328 = local143;
		local13.anInt5328 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method4261();
			if (local548 == 1) {
				local307 = local8.method4250() + local326;
				local314 = local8.method4250() + local307;
				local316 = local8.method4250() + local314;
				local326 = local316;
				this.anIntArray452[local336] = local307;
				this.anIntArray461[local336] = local314;
				this.anIntArray459[local336] = local316;
				if (local307 > this.anInt5037) {
					this.anInt5037 = local307;
				}
				if (local314 > this.anInt5037) {
					this.anInt5037 = local314;
				}
				if (local316 > this.anInt5037) {
					this.anInt5037 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method4250() + local326;
				local326 = local316;
				this.anIntArray452[local336] = local307;
				this.anIntArray461[local336] = local314;
				this.anIntArray459[local336] = local316;
				if (local316 > this.anInt5037) {
					this.anInt5037 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method4250() + local326;
				local326 = local316;
				this.anIntArray452[local336] = local307;
				this.anIntArray461[local336] = local314;
				this.anIntArray459[local336] = local316;
				if (local316 > this.anInt5037) {
					this.anInt5037 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method4250() + local326;
				local326 = local316;
				this.anIntArray452[local336] = local307;
				this.anIntArray461[local336] = local686;
				this.anIntArray459[local336] = local316;
				if (local316 > this.anInt5037) {
					this.anInt5037 = local316;
				}
			}
		}
		this.anInt5037++;
		local8.anInt5328 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray60[local336] = 0;
			this.aShortArray74[local336] = (short) local8.method4242();
			this.aShortArray76[local336] = (short) local8.method4242();
			this.aShortArray77[local336] = (short) local8.method4242();
		}
		if (this.aByteArray65 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray65[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray74[local686] & 0xFFFF) == this.anIntArray452[local548] && (this.aShortArray76[local686] & 0xFFFF) == this.anIntArray461[local548] && (this.aShortArray77[local686] & 0xFFFF) == this.anIntArray459[local548]) {
						this.aByteArray65[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray65 = null;
			}
		}
		if (!local3) {
			this.aShortArray72 = null;
		}
		if (!local1) {
			this.aByteArray63 = null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)I")
	public int method4057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5036; local1++) {
			if (this.anIntArray454[local1] == arg0 && this.anIntArray450[local1] == 0 && this.anIntArray455[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray454[this.anInt5036] = arg0;
		this.anIntArray450[this.anInt5036] = 0;
		this.anIntArray455[this.anInt5036] = arg1;
		this.anInt5037 = ++this.anInt5036;
		return this.anInt5036 - 1;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
	private void method4058(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static252.anIntArray451[arg0];
		@Pc(7) int local7 = Static252.anIntArray453[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5036; local9++) {
			@Pc(29) int local29 = this.anIntArray450[local9] * local3 + this.anIntArray454[local9] * local7 >> 16;
			this.anIntArray450[local9] = this.anIntArray450[local9] * local7 - this.anIntArray454[local9] * local3 >> 16;
			this.anIntArray454[local9] = local29;
		}
		this.method4053();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)Lclient!fc;")
	@Override
	public Class36 method4889() {
		return this.method4049(this.aShort36, this.aShort40, -50, -10, -50);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(SS)V")
	public void method4060(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5033; local1++) {
			if (this.aShortArray81[local1] == arg0) {
				this.aShortArray81[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(III)V")
	public void method4061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5036; local1++) {
			this.anIntArray454[local1] = this.anIntArray454[local1] * arg0 / 128;
			this.anIntArray450[local1] = this.anIntArray450[local1] * arg1 / 128;
			this.anIntArray455[local1] = this.anIntArray455[local1] * arg2 / 128;
		}
		this.method4053();
	}

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "()V")
	public void method4062() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray457 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt5036; local9++) {
				local18 = this.anIntArray457[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray47 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray47[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt5036) {
				local18 = this.anIntArray457[local9];
				this.anIntArrayArray47[local18][local5[local18]++] = local9++;
			}
			this.anIntArray457 = null;
		}
		if (this.anIntArray458 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt5033; local9++) {
			local18 = this.anIntArray458[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray48 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray48[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt5033) {
			local18 = this.anIntArray458[local9];
			this.anIntArrayArray48[local18][local5[local18]++] = local9++;
		}
		this.anIntArray458 = null;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(III)V")
	public void method4063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static252.anIntArray451[arg2];
			local9 = Static252.anIntArray453[arg2];
			for (local11 = 0; local11 < this.anInt5036; local11++) {
				local31 = this.anIntArray450[local11] * local5 + this.anIntArray454[local11] * local9 >> 16;
				this.anIntArray450[local11] = this.anIntArray450[local11] * local9 - this.anIntArray454[local11] * local5 >> 16;
				this.anIntArray454[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static252.anIntArray451[arg0];
			local9 = Static252.anIntArray453[arg0];
			for (local11 = 0; local11 < this.anInt5036; local11++) {
				local31 = this.anIntArray450[local11] * local9 - this.anIntArray455[local11] * local5 >> 16;
				this.anIntArray455[local11] = this.anIntArray450[local11] * local5 + this.anIntArray455[local11] * local9 >> 16;
				this.anIntArray450[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static252.anIntArray451[arg1];
		local9 = Static252.anIntArray453[arg1];
		for (local11 = 0; local11 < this.anInt5036; local11++) {
			local31 = this.anIntArray455[local11] * local5 + this.anIntArray454[local11] * local9 >> 16;
			this.anIntArray455[local11] = this.anIntArray455[local11] * local9 - this.anIntArray454[local11] * local5 >> 16;
			this.anIntArray454[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "()V")
	public void method4064() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5036; local1++) {
			@Pc(10) int local10 = this.anIntArray454[local1];
			this.anIntArray454[local1] = this.anIntArray455[local1];
			this.anIntArray455[local1] = -local10;
		}
		this.method4053();
	}
}
