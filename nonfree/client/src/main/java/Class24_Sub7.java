import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class24_Sub7 extends Class24 {

	@OriginalMember(owner = "client!v", name = "o", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "S")
	public short aShort13;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "[I")
	public int[] anIntArray383;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "[I")
	private int[] anIntArray384;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!v", name = "J", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!v", name = "L", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!v", name = "M", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!v", name = "N", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!v", name = "O", descriptor = "[Lclient!k;")
	public Class53[] aClass53Array1;

	@OriginalMember(owner = "client!v", name = "P", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "S")
	public short aShort17;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!v", name = "T", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!v", name = "U", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!v", name = "V", descriptor = "[Lclient!ni;")
	public Class66[] aClass66Array1;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
	public int anInt3937;

	@OriginalMember(owner = "client!v", name = "bb", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!v", name = "db", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!v", name = "eb", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "[Lclient!ni;")
	public Class66[] aClass66Array2;

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "I")
	public int anInt3935 = 0;

	@OriginalMember(owner = "client!v", name = "S", descriptor = "I")
	public int anInt3936 = 0;

	@OriginalMember(owner = "client!v", name = "G", descriptor = "B")
	public byte aByte12 = 0;

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	private Class24_Sub7() {
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B)V")
	public Class24_Sub7(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2993(arg0);
		} else {
			this.method2987(arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([Lclient!v;I)V")
	public Class24_Sub7(@OriginalArg(0) Class24_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt3936 = 0;
		this.anInt3935 = 0;
		this.anInt3937 = 0;
		this.aByte12 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class24_Sub7 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt3936 += local44.anInt3936;
				this.anInt3935 += local44.anInt3935;
				this.anInt3937 += local44.anInt3937;
				if (local44.aByteArray48 == null) {
					if (this.aByte12 == -1) {
						this.aByte12 = local44.aByte12;
					}
					if (this.aByte12 != local44.aByte12) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray47 != null;
				local19 |= local44.aByteArray50 != null;
				local21 |= local44.anIntArray389 != null;
				local23 |= local44.aShortArray52 != null;
				local25 |= local44.aByteArray55 != null;
			}
		}
		this.anIntArray381 = new int[this.anInt3936];
		this.anIntArray382 = new int[this.anInt3936];
		this.anIntArray386 = new int[this.anInt3936];
		this.anIntArray384 = new int[this.anInt3936];
		this.anIntArray383 = new int[this.anInt3935];
		this.anIntArray385 = new int[this.anInt3935];
		this.anIntArray378 = new int[this.anInt3935];
		if (local15) {
			this.aByteArray47 = new byte[this.anInt3935];
		}
		if (local17) {
			this.aByteArray48 = new byte[this.anInt3935];
		}
		if (local19) {
			this.aByteArray50 = new byte[this.anInt3935];
		}
		if (local21) {
			this.anIntArray389 = new int[this.anInt3935];
		}
		if (local23) {
			this.aShortArray52 = new short[this.anInt3935];
		}
		if (local25) {
			this.aByteArray55 = new byte[this.anInt3935];
		}
		this.aShortArray51 = new short[this.anInt3935];
		if (this.anInt3937 > 0) {
			this.aByteArray51 = new byte[this.anInt3937];
			this.aShortArray56 = new short[this.anInt3937];
			this.aShortArray53 = new short[this.anInt3937];
			this.aShortArray57 = new short[this.anInt3937];
			this.aShortArray55 = new short[this.anInt3937];
			this.aShortArray54 = new short[this.anInt3937];
			this.aShortArray58 = new short[this.anInt3937];
			this.aByteArray46 = new byte[this.anInt3937];
			this.aByteArray49 = new byte[this.anInt3937];
			this.aByteArray52 = new byte[this.anInt3937];
			this.aByteArray53 = new byte[this.anInt3937];
			this.aByteArray54 = new byte[this.anInt3937];
		}
		this.anInt3936 = 0;
		this.anInt3935 = 0;
		this.anInt3937 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class24_Sub7 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt3935; local302++) {
					if (local15 && local298.aByteArray47 != null) {
						this.aByteArray47[this.anInt3935] = local298.aByteArray47[local302];
					}
					if (local17) {
						if (local298.aByteArray48 == null) {
							this.aByteArray48[this.anInt3935] = local298.aByte12;
						} else {
							this.aByteArray48[this.anInt3935] = local298.aByteArray48[local302];
						}
					}
					if (local19 && local298.aByteArray50 != null) {
						this.aByteArray50[this.anInt3935] = local298.aByteArray50[local302];
					}
					if (local21 && local298.anIntArray389 != null) {
						this.anIntArray389[this.anInt3935] = local298.anIntArray389[local302];
					}
					if (local23) {
						if (local298.aShortArray52 == null) {
							this.aShortArray52[this.anInt3935] = -1;
						} else {
							this.aShortArray52[this.anInt3935] = local298.aShortArray52[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray55 == null || local298.aByteArray55[local302] == -1) {
							this.aByteArray55[this.anInt3935] = -1;
						} else {
							this.aByteArray55[this.anInt3935] = (byte) (local298.aByteArray55[local302] + this.anInt3937);
						}
					}
					this.aShortArray51[this.anInt3935] = local298.aShortArray51[local302];
					this.anIntArray383[this.anInt3935] = this.method3000(local298, local298.anIntArray383[local302]);
					this.anIntArray385[this.anInt3935] = this.method3000(local298, local298.anIntArray385[local302]);
					this.anIntArray378[this.anInt3935] = this.method3000(local298, local298.anIntArray378[local302]);
					this.anInt3935++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt3937; local477++) {
					@Pc(489) byte local489 = this.aByteArray51[this.anInt3937] = local298.aByteArray51[local477];
					if (local489 == 0) {
						this.aShortArray56[this.anInt3937] = (short) this.method3000(local298, local298.aShortArray56[local477]);
						this.aShortArray53[this.anInt3937] = (short) this.method3000(local298, local298.aShortArray53[local477]);
						this.aShortArray57[this.anInt3937] = (short) this.method3000(local298, local298.aShortArray57[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray56[this.anInt3937] = local298.aShortArray56[local477];
						this.aShortArray53[this.anInt3937] = local298.aShortArray53[local477];
						this.aShortArray57[this.anInt3937] = local298.aShortArray57[local477];
						this.aShortArray55[this.anInt3937] = local298.aShortArray55[local477];
						this.aShortArray54[this.anInt3937] = local298.aShortArray54[local477];
						this.aShortArray58[this.anInt3937] = local298.aShortArray58[local477];
						this.aByteArray46[this.anInt3937] = local298.aByteArray46[local477];
						this.aByteArray49[this.anInt3937] = local298.aByteArray49[local477];
						this.aByteArray52[this.anInt3937] = local298.aByteArray52[local477];
					}
					if (local489 == 2) {
						this.aByteArray53[this.anInt3937] = local298.aByteArray53[local477];
						this.aByteArray54[this.anInt3937] = local298.aByteArray54[local477];
					}
					this.anInt3937++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!v;ZZZZ)V")
	public Class24_Sub7(@OriginalArg(0) Class24_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3936 = arg0.anInt3936;
		this.anInt3935 = arg0.anInt3935;
		this.anInt3937 = arg0.anInt3937;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray381 = arg0.anIntArray381;
			this.anIntArray382 = arg0.anIntArray382;
			this.anIntArray386 = arg0.anIntArray386;
		} else {
			this.anIntArray381 = new int[this.anInt3936];
			this.anIntArray382 = new int[this.anInt3936];
			this.anIntArray386 = new int[this.anInt3936];
			for (local57 = 0; local57 < this.anInt3936; local57++) {
				this.anIntArray381[local57] = arg0.anIntArray381[local57];
				this.anIntArray382[local57] = arg0.anIntArray382[local57];
				this.anIntArray386[local57] = arg0.anIntArray386[local57];
			}
		}
		if (arg2) {
			this.aShortArray51 = arg0.aShortArray51;
		} else {
			this.aShortArray51 = new short[this.anInt3935];
			for (local57 = 0; local57 < this.anInt3935; local57++) {
				this.aShortArray51[local57] = arg0.aShortArray51[local57];
			}
		}
		if (arg3 || arg0.aShortArray52 == null) {
			this.aShortArray52 = arg0.aShortArray52;
		} else {
			this.aShortArray52 = new short[this.anInt3935];
			for (local57 = 0; local57 < this.anInt3935; local57++) {
				this.aShortArray52[local57] = arg0.aShortArray52[local57];
			}
		}
		this.aByteArray50 = arg0.aByteArray50;
		this.anIntArray383 = arg0.anIntArray383;
		this.anIntArray385 = arg0.anIntArray385;
		this.anIntArray378 = arg0.anIntArray378;
		this.aByteArray47 = arg0.aByteArray47;
		this.aByteArray48 = arg0.aByteArray48;
		this.aByteArray55 = arg0.aByteArray55;
		this.aByte12 = arg0.aByte12;
		this.aByteArray51 = arg0.aByteArray51;
		this.aShortArray56 = arg0.aShortArray56;
		this.aShortArray53 = arg0.aShortArray53;
		this.aShortArray57 = arg0.aShortArray57;
		this.aShortArray55 = arg0.aShortArray55;
		this.aShortArray54 = arg0.aShortArray54;
		this.aShortArray58 = arg0.aShortArray58;
		this.aByteArray46 = arg0.aByteArray46;
		this.aByteArray49 = arg0.aByteArray49;
		this.aByteArray52 = arg0.aByteArray52;
		this.aByteArray53 = arg0.aByteArray53;
		this.aByteArray54 = arg0.aByteArray54;
		this.anIntArray384 = arg0.anIntArray384;
		this.anIntArray389 = arg0.anIntArray389;
		this.anIntArrayArray36 = arg0.anIntArrayArray36;
		this.anIntArrayArray35 = arg0.anIntArrayArray35;
		this.aClass66Array2 = arg0.aClass66Array2;
		this.aClass53Array1 = arg0.aClass53Array1;
		this.aClass66Array1 = arg0.aClass66Array1;
		this.aShort17 = arg0.aShort17;
		this.aShort13 = arg0.aShort13;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([[IIIIZIZ)Lclient!v;")
	public Class24_Sub7 method2980(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2992();
		@Pc(6) int local6 = arg1 + this.aShort15;
		@Pc(11) int local11 = arg1 + this.aShort18;
		@Pc(16) int local16 = arg3 + this.aShort19;
		@Pc(21) int local21 = arg3 + this.aShort16;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class24_Sub7 local101 = new Class24_Sub7();
		local101.anInt3936 = this.anInt3936;
		local101.anInt3935 = this.anInt3935;
		local101.anInt3937 = this.anInt3937;
		local101.anIntArray381 = this.anIntArray381;
		local101.anIntArray386 = this.anIntArray386;
		local101.anIntArray383 = this.anIntArray383;
		local101.anIntArray385 = this.anIntArray385;
		local101.anIntArray378 = this.anIntArray378;
		local101.aByteArray47 = this.aByteArray47;
		local101.aByteArray48 = this.aByteArray48;
		local101.aByteArray50 = this.aByteArray50;
		local101.aByteArray55 = this.aByteArray55;
		local101.aShortArray51 = this.aShortArray51;
		local101.aShortArray52 = this.aShortArray52;
		local101.aByte12 = this.aByte12;
		local101.aByteArray51 = this.aByteArray51;
		local101.aShortArray56 = this.aShortArray56;
		local101.aShortArray53 = this.aShortArray53;
		local101.aShortArray57 = this.aShortArray57;
		local101.aShortArray55 = this.aShortArray55;
		local101.aShortArray54 = this.aShortArray54;
		local101.aShortArray58 = this.aShortArray58;
		local101.aByteArray46 = this.aByteArray46;
		local101.aByteArray49 = this.aByteArray49;
		local101.aByteArray52 = this.aByteArray52;
		local101.aByteArray53 = this.aByteArray53;
		local101.aByteArray54 = this.aByteArray54;
		local101.anIntArray384 = this.anIntArray384;
		local101.anIntArray389 = this.anIntArray389;
		local101.anIntArrayArray36 = this.anIntArrayArray36;
		local101.anIntArrayArray35 = this.anIntArrayArray35;
		local101.aShort17 = this.aShort17;
		local101.aShort13 = this.aShort13;
		local101.aClass66Array2 = this.aClass66Array2;
		local101.aClass53Array1 = this.aClass53Array1;
		local101.aClass66Array1 = this.aClass66Array1;
		local101.anIntArray382 = new int[local101.anInt3936];
		@Pc(257) int local257;
		@Pc(265) int local265;
		@Pc(272) int local272;
		@Pc(276) int local276;
		@Pc(280) int local280;
		@Pc(284) int local284;
		@Pc(288) int local288;
		@Pc(310) int local310;
		@Pc(336) int local336;
		@Pc(348) int local348;
		if (arg4 == 0) {
			for (local257 = 0; local257 < local101.anInt3936; local257++) {
				local265 = this.anIntArray381[local257] + arg1;
				local272 = this.anIntArray386[local257] + arg3;
				local276 = local265 & 0x7F;
				local280 = local272 & 0x7F;
				local284 = local265 >> 7;
				local288 = local272 >> 7;
				local310 = arg0[local284][local288] * (128 - local276) + arg0[local284 + 1][local288] * local276 >> 7;
				local336 = arg0[local284][local288 + 1] * (128 - local276) + arg0[local284 + 1][local288 + 1] * local276 >> 7;
				local348 = local310 * (128 - local280) + local336 * local280 >> 7;
				local101.anIntArray382[local257] = this.anIntArray382[local257] + local348 - arg2;
			}
		} else {
			for (local257 = 0; local257 < local101.anInt3936; local257++) {
				local265 = (this.anIntArray382[local257] << 16) / this.aShort20;
				if (local265 < arg4) {
					local272 = this.anIntArray381[local257] + arg1;
					local276 = this.anIntArray386[local257] + arg3;
					local280 = local272 & 0x7F;
					local284 = local276 & 0x7F;
					local288 = local272 >> 7;
					local310 = local276 >> 7;
					local336 = arg0[local288][local310] * (128 - local280) + arg0[local288 + 1][local310] * local280 >> 7;
					local348 = arg0[local288][local310 + 1] * (128 - local280) + arg0[local288 + 1][local310 + 1] * local280 >> 7;
					@Pc(472) int local472 = local336 * (128 - local284) + local348 * local284 >> 7;
					local101.anIntArray382[local257] = this.anIntArray382[local257] + (local472 - arg2) * (arg4 - local265) / arg4;
				} else {
					local101.anIntArray382[local257] = this.anIntArray382[local257];
				}
			}
		}
		this.aBoolean183 = false;
		return local101;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
	public void method2981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3936; local1++) {
			this.anIntArray381[local1] += arg0;
			this.anIntArray382[local1] += arg1;
			this.anIntArray386[local1] += arg2;
		}
		this.method2985();
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
	public void method2982() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3936; local1++) {
			@Pc(7) int local7 = this.anIntArray386[local1];
			this.anIntArray386[local1] = this.anIntArray381[local1];
			this.anIntArray381[local1] = -local7;
		}
		this.method2985();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)Lclient!si;")
	public Class24_Sub3_Sub1 method2983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class24_Sub3_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()Lclient!v;")
	public Class24_Sub7 method2984() {
		@Pc(3) Class24_Sub7 local3 = new Class24_Sub7();
		if (this.aByteArray47 != null) {
			local3.aByteArray47 = new byte[this.anInt3935];
			for (@Pc(13) int local13 = 0; local13 < this.anInt3935; local13++) {
				local3.aByteArray47[local13] = this.aByteArray47[local13];
			}
		}
		local3.anInt3936 = this.anInt3936;
		local3.anInt3935 = this.anInt3935;
		local3.anInt3937 = this.anInt3937;
		local3.anIntArray381 = this.anIntArray381;
		local3.anIntArray382 = this.anIntArray382;
		local3.anIntArray386 = this.anIntArray386;
		local3.anIntArray383 = this.anIntArray383;
		local3.anIntArray385 = this.anIntArray385;
		local3.anIntArray378 = this.anIntArray378;
		local3.aByteArray48 = this.aByteArray48;
		local3.aByteArray50 = this.aByteArray50;
		local3.aByteArray55 = this.aByteArray55;
		local3.aShortArray51 = this.aShortArray51;
		local3.aShortArray52 = this.aShortArray52;
		local3.aByte12 = this.aByte12;
		local3.aByteArray51 = this.aByteArray51;
		local3.aShortArray56 = this.aShortArray56;
		local3.aShortArray53 = this.aShortArray53;
		local3.aShortArray57 = this.aShortArray57;
		local3.aShortArray55 = this.aShortArray55;
		local3.aShortArray54 = this.aShortArray54;
		local3.aShortArray58 = this.aShortArray58;
		local3.aByteArray46 = this.aByteArray46;
		local3.aByteArray49 = this.aByteArray49;
		local3.aByteArray52 = this.aByteArray52;
		local3.aByteArray53 = this.aByteArray53;
		local3.aByteArray54 = this.aByteArray54;
		local3.anIntArray384 = this.anIntArray384;
		local3.anIntArray389 = this.anIntArray389;
		local3.anIntArrayArray36 = this.anIntArrayArray36;
		local3.anIntArrayArray35 = this.anIntArrayArray35;
		local3.aClass66Array2 = this.aClass66Array2;
		local3.aClass53Array1 = this.aClass53Array1;
		local3.aShort17 = this.aShort17;
		local3.aShort13 = this.aShort13;
		return local3;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
	private void method2985() {
		this.aClass66Array2 = null;
		this.aClass66Array1 = null;
		this.aClass53Array1 = null;
		this.aBoolean183 = false;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()Z")
	@Override
	public boolean method2979() {
		return true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(SS)V")
	public void method2986(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3935; local1++) {
			if (this.aShortArray51[local1] == arg0) {
				this.aShortArray51[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([B)V")
	private void method2987(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub3 local8 = new Class2_Sub3(arg0);
		@Pc(13) Class2_Sub3 local13 = new Class2_Sub3(arg0);
		@Pc(18) Class2_Sub3 local18 = new Class2_Sub3(arg0);
		@Pc(23) Class2_Sub3 local23 = new Class2_Sub3(arg0);
		@Pc(28) Class2_Sub3 local28 = new Class2_Sub3(arg0);
		local8.anInt340 = arg0.length - 18;
		@Pc(38) int local38 = local8.method269();
		@Pc(42) int local42 = local8.method269();
		@Pc(46) int local46 = local8.method260();
		@Pc(50) int local50 = local8.method260();
		@Pc(54) int local54 = local8.method260();
		@Pc(58) int local58 = local8.method260();
		@Pc(62) int local62 = local8.method260();
		@Pc(66) int local66 = local8.method260();
		@Pc(70) int local70 = local8.method269();
		@Pc(74) int local74 = local8.method269();
		@Pc(78) int local78 = local8.method269();
		@Pc(82) int local82 = local8.method269();
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
		this.anInt3936 = local38;
		this.anInt3935 = local42;
		this.anInt3937 = local46;
		this.anIntArray381 = new int[local38];
		this.anIntArray382 = new int[local38];
		this.anIntArray386 = new int[local38];
		this.anIntArray383 = new int[local42];
		this.anIntArray385 = new int[local42];
		this.anIntArray378 = new int[local42];
		if (local46 > 0) {
			this.aByteArray51 = new byte[local46];
			this.aShortArray56 = new short[local46];
			this.aShortArray53 = new short[local46];
			this.aShortArray57 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray384 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray47 = new byte[local42];
			this.aByteArray55 = new byte[local42];
			this.aShortArray52 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray48 = new byte[local42];
		} else {
			this.aByte12 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray50 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray389 = new int[local42];
		}
		this.aShortArray51 = new short[local42];
		local8.anInt340 = 0;
		local13.anInt340 = local165;
		local18.anInt340 = local171;
		local23.anInt340 = local90;
		local28.anInt340 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method260();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method241();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method241();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method241();
			}
			this.anIntArray381[local307] = local301 + local314;
			this.anIntArray382[local307] = local303 + local324;
			this.anIntArray386[local307] = local305 + local334;
			local301 = this.anIntArray381[local307];
			local303 = this.anIntArray382[local307];
			local305 = this.anIntArray386[local307];
			if (local66 == 1) {
				this.anIntArray384[local307] = local28.method260();
			}
		}
		local8.anInt340 = local149;
		local13.anInt340 = local116;
		local18.anInt340 = local98;
		local23.anInt340 = local134;
		local28.anInt340 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray51[local312] = (short) local8.method269();
			if (local50 == 1) {
				local314 = local13.method260();
				if ((local314 & 0x1) == 1) {
					this.aByteArray47[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray47[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray55[local312] = (byte) (local314 >> 2);
					this.aShortArray52[local312] = this.aShortArray51[local312];
					this.aShortArray51[local312] = 127;
					if (this.aShortArray52[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray55[local312] = -1;
					this.aShortArray52[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray48[local312] = local18.method221();
			}
			if (local58 == 1) {
				this.aByteArray50[local312] = local23.method221();
			}
			if (local62 == 1) {
				this.anIntArray389[local312] = local28.method260();
			}
		}
		local8.anInt340 = local143;
		local13.anInt340 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method260();
			if (local543 == 1) {
				local314 = local8.method241() + local536;
				local324 = local8.method241() + local314;
				local334 = local8.method241() + local324;
				local536 = local334;
				this.anIntArray383[local538] = local314;
				this.anIntArray385[local538] = local324;
				this.anIntArray378[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method241() + local536;
				local536 = local334;
				this.anIntArray383[local538] = local314;
				this.anIntArray385[local538] = local324;
				this.anIntArray378[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method241() + local536;
				local536 = local334;
				this.anIntArray383[local538] = local314;
				this.anIntArray385[local538] = local324;
				this.anIntArray378[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method241() + local536;
				local536 = local334;
				this.anIntArray383[local538] = local314;
				this.anIntArray385[local538] = local646;
				this.anIntArray378[local538] = local334;
			}
		}
		local8.anInt340 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray51[local543] = 0;
			this.aShortArray56[local543] = (short) local8.method269();
			this.aShortArray53[local543] = (short) local8.method269();
			this.aShortArray57[local543] = (short) local8.method269();
		}
		if (this.aByteArray55 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray55[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray56[local731] & 0xFFFF) == this.anIntArray383[local723] && (this.aShortArray53[local731] & 0xFFFF) == this.anIntArray385[local723] && (this.aShortArray57[local731] & 0xFFFF) == this.anIntArray378[local723]) {
						this.aByteArray55[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray55 = null;
			}
		}
		if (!local3) {
			this.aShortArray52 = null;
		}
		if (!local1) {
			this.aByteArray47 = null;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!rb;IIIZ)V")
	@Override
	public void method2976(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class24_Sub7 local2 = (Class24_Sub7) arg0;
		local2.method2992();
		local2.method2996();
		Static198.anInt3934++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray381;
		@Pc(18) int local18 = local2.anInt3936;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3936; local20++) {
			@Pc(26) Class66 local26 = this.aClass66Array2[local20];
			if (local26.anInt2842 != 0) {
				local36 = this.anIntArray382[local20] - arg2;
				if (local36 >= local2.aShort20 && local36 <= local2.aShort14) {
					@Pc(52) int local52 = this.anIntArray381[local20] - arg1;
					if (local52 >= local2.aShort15 && local52 <= local2.aShort18) {
						@Pc(68) int local68 = this.anIntArray386[local20] - arg3;
						if (local68 >= local2.aShort19 && local68 <= local2.aShort16) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class66 local85 = local2.aClass66Array2[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray386[local79] && local36 == local2.anIntArray382[local79] && local85.anInt2842 != 0) {
									if (this.aClass66Array1 == null) {
										this.aClass66Array1 = new Class66[this.anInt3936];
									}
									if (local2.aClass66Array1 == null) {
										local2.aClass66Array1 = new Class66[local18];
									}
									@Pc(125) Class66 local125 = this.aClass66Array1[local20];
									if (local125 == null) {
										local125 = this.aClass66Array1[local20] = new Class66(local26);
									}
									@Pc(142) Class66 local142 = local2.aClass66Array1[local79];
									if (local142 == null) {
										local142 = local2.aClass66Array1[local79] = new Class66(local85);
									}
									local125.anInt2837 += local85.anInt2837;
									local125.anInt2841 += local85.anInt2841;
									local125.anInt2846 += local85.anInt2846;
									local125.anInt2842 += local85.anInt2842;
									local142.anInt2837 += local26.anInt2837;
									local142.anInt2841 += local26.anInt2841;
									local142.anInt2846 += local26.anInt2846;
									local142.anInt2842 += local26.anInt2842;
									local12++;
									Static198.anIntArray388[local20] = Static198.anInt3934;
									Static198.anIntArray387[local79] = Static198.anInt3934;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt3935; local236++) {
			if (Static198.anIntArray388[this.anIntArray383[local236]] == Static198.anInt3934 && Static198.anIntArray388[this.anIntArray385[local236]] == Static198.anInt3934 && Static198.anIntArray388[this.anIntArray378[local236]] == Static198.anInt3934) {
				if (this.aByteArray47 == null) {
					this.aByteArray47 = new byte[this.anInt3935];
				}
				this.aByteArray47[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt3935; local36++) {
			if (Static198.anIntArray387[local2.anIntArray383[local36]] == Static198.anInt3934 && Static198.anIntArray387[local2.anIntArray385[local36]] == Static198.anInt3934 && Static198.anIntArray387[local2.anIntArray378[local36]] == Static198.anInt3934) {
				if (local2.aByteArray47 == null) {
					local2.aByteArray47 = new byte[local2.anInt3935];
				}
				local2.aByteArray47[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V")
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3936; local1++) {
			this.anIntArray381[local1] = this.anIntArray381[local1] * arg0 / 128;
			this.anIntArray382[local1] = this.anIntArray382[local1] * arg1 / 128;
			this.anIntArray386[local1] = this.anIntArray386[local1] * arg2 / 128;
		}
		this.method2985();
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "()V")
	public void method2990() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3936; local1++) {
			this.anIntArray386[local1] = -this.anIntArray386[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt3935; local18++) {
			@Pc(24) int local24 = this.anIntArray383[local18];
			this.anIntArray383[local18] = this.anIntArray378[local18];
			this.anIntArray378[local18] = local24;
		}
		this.method2985();
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(IIIII)Lclient!gj;")
	public Class24_Sub3 method2991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class24_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Lclient!rb;")
	@Override
	public Class24 method2977() {
		return this.method2991(this.aShort17, this.aShort13, -50, -10, -50);
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "()V")
	private void method2992() {
		if (this.aBoolean183) {
			return;
		}
		this.aBoolean183 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3936; local20++) {
			@Pc(26) int local26 = this.anIntArray381[local20];
			@Pc(31) int local31 = this.anIntArray382[local20];
			@Pc(36) int local36 = this.anIntArray386[local20];
			if (local26 < local8) {
				local8 = local26;
			}
			if (local26 > local14) {
				local14 = local26;
			}
			if (local31 < local10) {
				local10 = local31;
			}
			if (local31 > local16) {
				local16 = local31;
			}
			if (local36 < local12) {
				local12 = local36;
			}
			if (local36 > local18) {
				local18 = local36;
			}
		}
		this.aShort15 = (short) local8;
		this.aShort18 = (short) local14;
		this.aShort20 = (short) local10;
		this.aShort14 = (short) local16;
		this.aShort19 = (short) local12;
		this.aShort16 = (short) local18;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "([B)V")
	private void method2993(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub3 local4 = new Class2_Sub3(arg0);
		@Pc(9) Class2_Sub3 local9 = new Class2_Sub3(arg0);
		@Pc(14) Class2_Sub3 local14 = new Class2_Sub3(arg0);
		@Pc(19) Class2_Sub3 local19 = new Class2_Sub3(arg0);
		@Pc(24) Class2_Sub3 local24 = new Class2_Sub3(arg0);
		@Pc(29) Class2_Sub3 local29 = new Class2_Sub3(arg0);
		@Pc(34) Class2_Sub3 local34 = new Class2_Sub3(arg0);
		local4.anInt340 = arg0.length - 23;
		@Pc(44) int local44 = local4.method269();
		@Pc(48) int local48 = local4.method269();
		@Pc(52) int local52 = local4.method260();
		@Pc(56) int local56 = local4.method260();
		@Pc(60) int local60 = local4.method260();
		@Pc(64) int local64 = local4.method260();
		@Pc(68) int local68 = local4.method260();
		@Pc(72) int local72 = local4.method260();
		@Pc(76) int local76 = local4.method260();
		@Pc(80) int local80 = local4.method269();
		@Pc(84) int local84 = local4.method269();
		@Pc(88) int local88 = local4.method269();
		@Pc(92) int local92 = local4.method269();
		@Pc(96) int local96 = local4.method269();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray51 = new byte[local52];
			local4.anInt340 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray51[local113] = local4.method221();
				if (local123 == 0) {
					local98++;
				}
				if (local123 >= 1 && local123 <= 3) {
					local100++;
				}
				if (local123 == 2) {
					local102++;
				}
			}
		}
		local113 = local52 + local44;
		@Pc(151) int local151 = local113;
		if (local56 == 1) {
			local113 += local48;
		}
		@Pc(160) int local160 = local113;
		local113 += local48;
		@Pc(166) int local166 = local113;
		if (local60 == 255) {
			local113 += local48;
		}
		@Pc(175) int local175 = local113;
		if (local68 == 1) {
			local113 += local48;
		}
		@Pc(184) int local184 = local113;
		if (local76 == 1) {
			local113 += local44;
		}
		@Pc(193) int local193 = local113;
		if (local64 == 1) {
			local113 += local48;
		}
		@Pc(202) int local202 = local113;
		local113 += local92;
		@Pc(208) int local208 = local113;
		if (local72 == 1) {
			local113 += local48 * 2;
		}
		@Pc(219) int local219 = local113;
		local113 += local96;
		@Pc(225) int local225 = local113;
		local113 += local48 * 2;
		@Pc(233) int local233 = local113;
		local113 += local80;
		@Pc(239) int local239 = local113;
		local113 += local84;
		@Pc(245) int local245 = local113;
		local113 += local88;
		@Pc(251) int local251 = local113;
		local113 += local98 * 6;
		@Pc(259) int local259 = local113;
		local113 += local100 * 6;
		@Pc(267) int local267 = local113;
		local113 += local100 * 6;
		@Pc(275) int local275 = local113;
		local113 += local100;
		@Pc(281) int local281 = local113;
		local113 += local100;
		this.anInt3936 = local44;
		this.anInt3935 = local48;
		this.anInt3937 = local52;
		this.anIntArray381 = new int[local44];
		this.anIntArray382 = new int[local44];
		this.anIntArray386 = new int[local44];
		this.anIntArray383 = new int[local48];
		this.anIntArray385 = new int[local48];
		this.anIntArray378 = new int[local48];
		if (local76 == 1) {
			this.anIntArray384 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray47 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray48 = new byte[local48];
		} else {
			this.aByte12 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray50 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray389 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray52 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray55 = new byte[local48];
		}
		this.aShortArray51 = new short[local48];
		if (local52 > 0) {
			this.aShortArray56 = new short[local52];
			this.aShortArray53 = new short[local52];
			this.aShortArray57 = new short[local52];
			if (local100 > 0) {
				this.aShortArray55 = new short[local100];
				this.aShortArray54 = new short[local100];
				this.aShortArray58 = new short[local100];
				this.aByteArray46 = new byte[local100];
				this.aByteArray49 = new byte[local100];
				this.aByteArray52 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray53 = new byte[local102];
				this.aByteArray54 = new byte[local102];
			}
		}
		local4.anInt340 = local52;
		local9.anInt340 = local233;
		local14.anInt340 = local239;
		local19.anInt340 = local245;
		local24.anInt340 = local184;
		@Pc(455) int local455 = 0;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(466) int local466;
		@Pc(468) int local468;
		@Pc(478) int local478;
		@Pc(488) int local488;
		for (@Pc(461) int local461 = 0; local461 < local44; local461++) {
			local466 = local4.method260();
			local468 = 0;
			if ((local466 & 0x1) != 0) {
				local468 = local9.method241();
			}
			local478 = 0;
			if ((local466 & 0x2) != 0) {
				local478 = local14.method241();
			}
			local488 = 0;
			if ((local466 & 0x4) != 0) {
				local488 = local19.method241();
			}
			this.anIntArray381[local461] = local455 + local468;
			this.anIntArray382[local461] = local457 + local478;
			this.anIntArray386[local461] = local459 + local488;
			local455 = this.anIntArray381[local461];
			local457 = this.anIntArray382[local461];
			local459 = this.anIntArray386[local461];
			if (local76 == 1) {
				this.anIntArray384[local461] = local24.method260();
			}
		}
		local4.anInt340 = local225;
		local9.anInt340 = local151;
		local14.anInt340 = local166;
		local19.anInt340 = local193;
		local24.anInt340 = local175;
		local29.anInt340 = local208;
		local34.anInt340 = local219;
		for (local466 = 0; local466 < local48; local466++) {
			this.aShortArray51[local466] = (short) local4.method269();
			if (local56 == 1) {
				this.aByteArray47[local466] = local9.method221();
			}
			if (local60 == 255) {
				this.aByteArray48[local466] = local14.method221();
			}
			if (local64 == 1) {
				this.aByteArray50[local466] = local19.method221();
			}
			if (local68 == 1) {
				this.anIntArray389[local466] = local24.method260();
			}
			if (local72 == 1) {
				this.aShortArray52[local466] = (short) (local29.method269() - 1);
			}
			if (this.aByteArray55 != null) {
				if (this.aShortArray52[local466] == -1) {
					this.aByteArray55[local466] = -1;
				} else {
					this.aByteArray55[local466] = (byte) (local34.method260() - 1);
				}
			}
		}
		local4.anInt340 = local202;
		local9.anInt340 = local160;
		local468 = 0;
		local478 = 0;
		local488 = 0;
		@Pc(674) int local674 = 0;
		@Pc(681) int local681;
		@Pc(784) int local784;
		for (@Pc(676) int local676 = 0; local676 < local48; local676++) {
			local681 = local9.method260();
			if (local681 == 1) {
				local468 = local4.method241() + local674;
				local478 = local4.method241() + local468;
				local488 = local4.method241() + local478;
				local674 = local488;
				this.anIntArray383[local676] = local468;
				this.anIntArray385[local676] = local478;
				this.anIntArray378[local676] = local488;
			}
			if (local681 == 2) {
				local478 = local488;
				local488 = local4.method241() + local674;
				local674 = local488;
				this.anIntArray383[local676] = local468;
				this.anIntArray385[local676] = local478;
				this.anIntArray378[local676] = local488;
			}
			if (local681 == 3) {
				local468 = local488;
				local488 = local4.method241() + local674;
				local674 = local488;
				this.anIntArray383[local676] = local468;
				this.anIntArray385[local676] = local478;
				this.anIntArray378[local676] = local488;
			}
			if (local681 == 4) {
				local784 = local468;
				local468 = local478;
				local478 = local784;
				local488 = local4.method241() + local674;
				local674 = local488;
				this.anIntArray383[local676] = local468;
				this.anIntArray385[local676] = local784;
				this.anIntArray378[local676] = local488;
			}
		}
		local4.anInt340 = local251;
		local9.anInt340 = local259;
		local14.anInt340 = local267;
		local19.anInt340 = local275;
		local24.anInt340 = local281;
		local29.anInt340 = local113;
		for (local681 = 0; local681 < local52; local681++) {
			local784 = this.aByteArray51[local681] & 0xFF;
			if (local784 == 0) {
				this.aShortArray56[local681] = (short) local4.method269();
				this.aShortArray53[local681] = (short) local4.method269();
				this.aShortArray57[local681] = (short) local4.method269();
			}
			if (local784 == 1) {
				this.aShortArray56[local681] = (short) local9.method269();
				this.aShortArray53[local681] = (short) local9.method269();
				this.aShortArray57[local681] = (short) local9.method269();
				this.aShortArray55[local681] = (short) local14.method269();
				this.aShortArray54[local681] = (short) local14.method269();
				this.aShortArray58[local681] = (short) local14.method269();
				this.aByteArray46[local681] = local19.method221();
				this.aByteArray49[local681] = local24.method221();
				this.aByteArray52[local681] = local29.method221();
			}
			if (local784 == 2) {
				this.aShortArray56[local681] = (short) local9.method269();
				this.aShortArray53[local681] = (short) local9.method269();
				this.aShortArray57[local681] = (short) local9.method269();
				this.aShortArray55[local681] = (short) local14.method269();
				this.aShortArray54[local681] = (short) local14.method269();
				this.aShortArray58[local681] = (short) local14.method269();
				this.aByteArray46[local681] = local19.method221();
				this.aByteArray49[local681] = local24.method221();
				this.aByteArray52[local681] = local29.method221();
				this.aByteArray53[local681] = local29.method221();
				this.aByteArray54[local681] = local29.method221();
			}
			if (local784 == 3) {
				this.aShortArray56[local681] = (short) local9.method269();
				this.aShortArray53[local681] = (short) local9.method269();
				this.aShortArray57[local681] = (short) local9.method269();
				this.aShortArray55[local681] = (short) local14.method269();
				this.aShortArray54[local681] = (short) local14.method269();
				this.aShortArray58[local681] = (short) local14.method269();
				this.aByteArray46[local681] = local19.method221();
				this.aByteArray49[local681] = local24.method221();
				this.aByteArray52[local681] = local29.method221();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "()V")
	public void method2994() {
		this.anIntArray384 = null;
		this.anIntArray389 = null;
		this.anIntArrayArray36 = null;
		this.anIntArrayArray35 = null;
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "()V")
	public void method2996() {
		if (this.aClass66Array2 != null) {
			return;
		}
		this.aClass66Array2 = new Class66[this.anInt3936];
		for (@Pc(10) int local10 = 0; local10 < this.anInt3936; local10++) {
			this.aClass66Array2[local10] = new Class66();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3935; local25++) {
			@Pc(31) int local31 = this.anIntArray383[local25];
			@Pc(36) int local36 = this.anIntArray385[local25];
			@Pc(41) int local41 = this.anIntArray378[local25];
			@Pc(51) int local51 = this.anIntArray381[local36] - this.anIntArray381[local31];
			@Pc(61) int local61 = this.anIntArray382[local36] - this.anIntArray382[local31];
			@Pc(71) int local71 = this.anIntArray386[local36] - this.anIntArray386[local31];
			@Pc(81) int local81 = this.anIntArray381[local41] - this.anIntArray381[local31];
			@Pc(91) int local91 = this.anIntArray382[local41] - this.anIntArray382[local31];
			@Pc(101) int local101 = this.anIntArray386[local41] - this.anIntArray386[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray47 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray47[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class66 local211 = this.aClass66Array2[local31];
				local211.anInt2837 += local109;
				local211.anInt2841 += local117;
				local211.anInt2846 += local125;
				local211.anInt2842++;
				@Pc(240) Class66 local240 = this.aClass66Array2[local36];
				local240.anInt2837 += local109;
				local240.anInt2841 += local117;
				local240.anInt2846 += local125;
				local240.anInt2842++;
				@Pc(269) Class66 local269 = this.aClass66Array2[local41];
				local269.anInt2837 += local109;
				local269.anInt2841 += local117;
				local269.anInt2846 += local125;
				local269.anInt2842++;
			} else if (local198 == 1) {
				if (this.aClass53Array1 == null) {
					this.aClass53Array1 = new Class53[this.anInt3935];
				}
				@Pc(314) Class53 local314 = this.aClass53Array1[local25] = new Class53();
				local314.anInt1975 = local109;
				local314.anInt1972 = local117;
				local314.anInt1974 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "k", descriptor = "()V")
	public void method2997() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3936; local1++) {
			@Pc(7) int local7 = this.anIntArray381[local1];
			this.anIntArray381[local1] = this.anIntArray386[local1];
			this.anIntArray386[local1] = -local7;
		}
		this.method2985();
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(SS)V")
	public void method2998(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray52 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt3935; local5++) {
			if (this.aShortArray52[local5] == arg0) {
				this.aShortArray52[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "l", descriptor = "()V")
	public void method2999() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3936; local1++) {
			this.anIntArray381[local1] = -this.anIntArray381[local1];
			this.anIntArray386[local1] = -this.anIntArray386[local1];
		}
		this.method2985();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()I")
	@Override
	public int method2978() {
		if (!this.aBoolean183) {
			this.method2992();
		}
		return this.aShort20;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;I)I")
	private int method3000(@OriginalArg(0) Class24_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray381[arg1];
		@Pc(11) int local11 = arg0.anIntArray382[arg1];
		@Pc(16) int local16 = arg0.anIntArray386[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3936; local18++) {
			if (local6 == this.anIntArray381[local18] && local11 == this.anIntArray382[local18] && local16 == this.anIntArray386[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray381[this.anInt3936] = local6;
			this.anIntArray382[this.anInt3936] = local11;
			this.anIntArray386[this.anInt3936] = local16;
			if (arg0.anIntArray384 != null) {
				this.anIntArray384[this.anInt3936] = arg0.anIntArray384[arg1];
			}
			local1 = this.anInt3936++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!v", name = "m", descriptor = "()V")
	public void method3001() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray384 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3936; local9++) {
				local15 = this.anIntArray384[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray36 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray36[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt3936) {
				local65 = this.anIntArray384[local59];
				this.anIntArrayArray36[local65][local5[local65]++] = local59++;
			}
			this.anIntArray384 = null;
		}
		if (this.anIntArray389 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3935; local9++) {
			local15 = this.anIntArray389[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray35 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray35[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt3935) {
			local65 = this.anIntArray389[local59];
			this.anIntArrayArray35[local65][local5[local65]++] = local59++;
		}
		this.anIntArray389 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public void method3002() {
		@Pc(3) int local3 = Static198.anIntArray380[256];
		@Pc(7) int local7 = Static198.anIntArray379[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3936; local9++) {
			@Pc(26) int local26 = this.anIntArray386[local9] * local3 + this.anIntArray381[local9] * local7 >> 16;
			this.anIntArray386[local9] = this.anIntArray386[local9] * local7 - this.anIntArray381[local9] * local3 >> 16;
			this.anIntArray381[local9] = local26;
		}
		this.method2985();
	}
}
