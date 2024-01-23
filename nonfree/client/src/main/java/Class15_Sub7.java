import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class15_Sub7 extends Class15 {

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "[Lclient!vf;")
	public Class185[] aClass185Array3;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "[Lclient!fn;")
	public Class54[] aClass54Array1;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "[Lclient!ad;")
	public Class4[] aClass4Array1;

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "[Lclient!fn;")
	public Class54[] aClass54Array2;

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "S")
	public short aShort78;

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "[I")
	public int[] anIntArray500;

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "[I")
	public int[] anIntArray501;

	@OriginalMember(owner = "client!tc", name = "S", descriptor = "S")
	public short aShort81;

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!tc", name = "X", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "[S")
	public short[] aShortArray83;

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
	public int anInt5224;

	@OriginalMember(owner = "client!tc", name = "bb", descriptor = "[Lclient!ue;")
	public Class176[] aClass176Array3;

	@OriginalMember(owner = "client!tc", name = "db", descriptor = "[I")
	public int[] anIntArray503;

	@OriginalMember(owner = "client!tc", name = "eb", descriptor = "[I")
	public int[] anIntArray504;

	@OriginalMember(owner = "client!tc", name = "fb", descriptor = "[I")
	public int[] anIntArray505;

	@OriginalMember(owner = "client!tc", name = "gb", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!tc", name = "ib", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!tc", name = "jb", descriptor = "[I")
	public int[] anIntArray508;

	@OriginalMember(owner = "client!tc", name = "kb", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!tc", name = "lb", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Z")
	private boolean aBoolean349 = false;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public int anInt5221 = 0;

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
	public int anInt5223 = 0;

	@OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
	public int anInt5225 = 0;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "B")
	public byte aByte23 = 0;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	private Class15_Sub7() {
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V")
	public Class15_Sub7(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4224(arg0);
		} else {
			this.method4221(arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(III)V")
	public Class15_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray504 = new int[arg0];
		this.anIntArray500 = new int[arg0];
		this.anIntArray501 = new int[arg0];
		this.anIntArray508 = new int[arg0];
		this.anIntArray507 = new int[arg1];
		this.anIntArray505 = new int[arg1];
		this.anIntArray503 = new int[arg1];
		this.aByteArray56 = new byte[arg1];
		this.aByteArray62 = new byte[arg1];
		this.aByteArray61 = new byte[arg1];
		this.aShortArray77 = new short[arg1];
		this.aShortArray81 = new short[arg1];
		this.aByteArray57 = new byte[arg1];
		this.anIntArray509 = new int[arg1];
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([Lclient!tc;I)V")
	public Class15_Sub7(@OriginalArg(0) Class15_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt5221 = 0;
		this.anInt5225 = 0;
		this.anInt5224 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		this.aByte23 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class15_Sub7 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt5221 += local53.anInt5221;
				this.anInt5225 += local53.anInt5225;
				this.anInt5224 += local53.anInt5224;
				if (local53.aByteArray62 == null) {
					if (this.aByte23 == -1) {
						this.aByte23 = local53.aByte23;
					}
					if (this.aByte23 != local53.aByte23) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray56 != null;
				local22 |= local53.aByteArray61 != null;
				local24 |= local53.anIntArray509 != null;
				local26 |= local53.aShortArray81 != null;
				local28 |= local53.aByteArray57 != null;
				if (local53.aClass185Array3 != null) {
					local39 += local53.aClass185Array3.length;
				}
				if (local53.aClass176Array3 != null) {
					local41 += local53.aClass176Array3.length;
				}
			}
		}
		this.anIntArray504 = new int[this.anInt5221];
		this.anIntArray500 = new int[this.anInt5221];
		this.anIntArray501 = new int[this.anInt5221];
		this.anIntArray508 = new int[this.anInt5221];
		this.aShortArray75 = new short[this.anInt5221];
		this.anIntArray507 = new int[this.anInt5225];
		this.anIntArray505 = new int[this.anInt5225];
		this.anIntArray503 = new int[this.anInt5225];
		if (local18) {
			this.aByteArray56 = new byte[this.anInt5225];
		}
		if (local20) {
			this.aByteArray62 = new byte[this.anInt5225];
		}
		if (local22) {
			this.aByteArray61 = new byte[this.anInt5225];
		}
		if (local24) {
			this.anIntArray509 = new int[this.anInt5225];
		}
		if (local26) {
			this.aShortArray81 = new short[this.anInt5225];
		}
		if (local28) {
			this.aByteArray57 = new byte[this.anInt5225];
		}
		if (local39 > 0) {
			this.aClass185Array3 = new Class185[local39];
		}
		if (local41 > 0) {
			this.aClass176Array3 = new Class176[local41];
		}
		this.aShortArray77 = new short[this.anInt5225];
		this.aShortArray78 = new short[this.anInt5225];
		if (this.anInt5224 > 0) {
			this.aByteArray65 = new byte[this.anInt5224];
			this.aShortArray76 = new short[this.anInt5224];
			this.aShortArray80 = new short[this.anInt5224];
			this.aShortArray79 = new short[this.anInt5224];
			this.aShortArray82 = new short[this.anInt5224];
			this.aShortArray83 = new short[this.anInt5224];
			this.aShortArray74 = new short[this.anInt5224];
			this.aByteArray59 = new byte[this.anInt5224];
			this.aByteArray58 = new byte[this.anInt5224];
			this.aByteArray64 = new byte[this.anInt5224];
			this.aByteArray60 = new byte[this.anInt5224];
			this.aByteArray63 = new byte[this.anInt5224];
		}
		this.anInt5221 = 0;
		this.anInt5225 = 0;
		this.anInt5224 = 0;
		local39 = 0;
		local41 = 0;
		@Pc(356) Class15_Sub7 local356;
		@Pc(531) int local531;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(352) short local352 = (short) (0x1 << local46);
			local356 = arg0[local46];
			if (local356 != null) {
				@Pc(360) int local360;
				for (local360 = 0; local360 < local356.anInt5225; local360++) {
					if (local18 && local356.aByteArray56 != null) {
						this.aByteArray56[this.anInt5225] = local356.aByteArray56[local360];
					}
					if (local20) {
						if (local356.aByteArray62 == null) {
							this.aByteArray62[this.anInt5225] = local356.aByte23;
						} else {
							this.aByteArray62[this.anInt5225] = local356.aByteArray62[local360];
						}
					}
					if (local22 && local356.aByteArray61 != null) {
						this.aByteArray61[this.anInt5225] = local356.aByteArray61[local360];
					}
					if (local24 && local356.anIntArray509 != null) {
						this.anIntArray509[this.anInt5225] = local356.anIntArray509[local360];
					}
					if (local26) {
						if (local356.aShortArray81 == null) {
							this.aShortArray81[this.anInt5225] = -1;
						} else {
							this.aShortArray81[this.anInt5225] = local356.aShortArray81[local360];
						}
					}
					this.aShortArray77[this.anInt5225] = local356.aShortArray77[local360];
					this.aShortArray78[this.anInt5225] = local352;
					this.anIntArray507[this.anInt5225] = this.method4222(local356, local356.anIntArray507[local360], local352);
					this.anIntArray505[this.anInt5225] = this.method4222(local356, local356.anIntArray505[local360], local352);
					this.anIntArray503[this.anInt5225] = this.method4222(local356, local356.anIntArray503[local360], local352);
					this.anInt5225++;
				}
				if (local356.aClass185Array3 != null) {
					for (local360 = 0; local360 < local356.aClass185Array3.length; local360++) {
						local531 = this.method4222(local356, local356.aClass185Array3[local360].anInt5745, local352);
						@Pc(541) int local541 = this.method4222(local356, local356.aClass185Array3[local360].anInt5743, local352);
						@Pc(551) int local551 = this.method4222(local356, local356.aClass185Array3[local360].anInt5740, local352);
						this.aClass185Array3[local39] = new Class185(local356.aClass185Array3[local360].aClass75_1, local531, local541, local551);
						local39++;
					}
				}
				if (local356.aClass176Array3 != null) {
					for (local360 = 0; local360 < local356.aClass176Array3.length; local360++) {
						local531 = this.method4222(local356, local356.aClass176Array3[local360].anInt5534, local352);
						this.aClass176Array3[local41] = new Class176(local356.aClass176Array3[local360].aClass121_1, local531);
						local41++;
					}
				}
			}
		}
		local46 = 0;
		this.anInt5223 = this.anInt5221;
		for (@Pc(615) int local615 = 0; local615 < arg1; local615++) {
			local356 = arg0[local615];
			@Pc(627) short local627 = (short) (0x1 << local615);
			if (local356 != null) {
				for (local531 = 0; local531 < local356.anInt5225; local531++) {
					if (local28) {
						this.aByteArray57[local46++] = (byte) (local356.aByteArray57 == null || local356.aByteArray57[local531] == -1 ? -1 : local356.aByteArray57[local531] + this.anInt5224);
					}
				}
				for (local531 = 0; local531 < local356.anInt5224; local531++) {
					@Pc(680) byte local680 = this.aByteArray65[this.anInt5224] = local356.aByteArray65[local531];
					if (local680 == 0) {
						this.aShortArray76[this.anInt5224] = (short) this.method4222(local356, local356.aShortArray76[local531], local627);
						this.aShortArray80[this.anInt5224] = (short) this.method4222(local356, local356.aShortArray80[local531], local627);
						this.aShortArray79[this.anInt5224] = (short) this.method4222(local356, local356.aShortArray79[local531], local627);
					}
					if (local680 >= 1 && local680 <= 3) {
						this.aShortArray76[this.anInt5224] = local356.aShortArray76[local531];
						this.aShortArray80[this.anInt5224] = local356.aShortArray80[local531];
						this.aShortArray79[this.anInt5224] = local356.aShortArray79[local531];
						this.aShortArray82[this.anInt5224] = local356.aShortArray82[local531];
						this.aShortArray83[this.anInt5224] = local356.aShortArray83[local531];
						this.aShortArray74[this.anInt5224] = local356.aShortArray74[local531];
						this.aByteArray59[this.anInt5224] = local356.aByteArray59[local531];
						this.aByteArray58[this.anInt5224] = local356.aByteArray58[local531];
						this.aByteArray64[this.anInt5224] = local356.aByteArray64[local531];
					}
					if (local680 == 2) {
						this.aByteArray60[this.anInt5224] = local356.aByteArray60[local531];
						this.aByteArray63[this.anInt5224] = local356.aByteArray63[local531];
					}
					this.anInt5224++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!tc;ZZZZ)V")
	public Class15_Sub7(@OriginalArg(0) Class15_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5221 = arg0.anInt5221;
		this.anInt5223 = arg0.anInt5223;
		this.anInt5225 = arg0.anInt5225;
		this.anInt5224 = arg0.anInt5224;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray504 = arg0.anIntArray504;
			this.anIntArray500 = arg0.anIntArray500;
			this.anIntArray501 = arg0.anIntArray501;
		} else {
			this.anIntArray504 = new int[this.anInt5221];
			this.anIntArray500 = new int[this.anInt5221];
			this.anIntArray501 = new int[this.anInt5221];
			for (local64 = 0; local64 < this.anInt5221; local64++) {
				this.anIntArray504[local64] = arg0.anIntArray504[local64];
				this.anIntArray500[local64] = arg0.anIntArray500[local64];
				this.anIntArray501[local64] = arg0.anIntArray501[local64];
			}
		}
		if (arg2) {
			this.aShortArray77 = arg0.aShortArray77;
		} else {
			this.aShortArray77 = new short[this.anInt5225];
			for (local64 = 0; local64 < this.anInt5225; local64++) {
				this.aShortArray77[local64] = arg0.aShortArray77[local64];
			}
		}
		if (arg3 || arg0.aShortArray81 == null) {
			this.aShortArray81 = arg0.aShortArray81;
		} else {
			this.aShortArray81 = new short[this.anInt5225];
			for (local64 = 0; local64 < this.anInt5225; local64++) {
				this.aShortArray81[local64] = arg0.aShortArray81[local64];
			}
		}
		this.aByteArray61 = arg0.aByteArray61;
		this.anIntArray507 = arg0.anIntArray507;
		this.anIntArray505 = arg0.anIntArray505;
		this.anIntArray503 = arg0.anIntArray503;
		this.aByteArray56 = arg0.aByteArray56;
		this.aByteArray62 = arg0.aByteArray62;
		this.aByteArray57 = arg0.aByteArray57;
		this.aByte23 = arg0.aByte23;
		this.aByteArray65 = arg0.aByteArray65;
		this.aShortArray76 = arg0.aShortArray76;
		this.aShortArray80 = arg0.aShortArray80;
		this.aShortArray79 = arg0.aShortArray79;
		this.aShortArray82 = arg0.aShortArray82;
		this.aShortArray83 = arg0.aShortArray83;
		this.aShortArray74 = arg0.aShortArray74;
		this.aByteArray59 = arg0.aByteArray59;
		this.aByteArray58 = arg0.aByteArray58;
		this.aByteArray64 = arg0.aByteArray64;
		this.aByteArray60 = arg0.aByteArray60;
		this.aByteArray63 = arg0.aByteArray63;
		this.anIntArray508 = arg0.anIntArray508;
		this.anIntArray509 = arg0.anIntArray509;
		this.anIntArrayArray34 = arg0.anIntArrayArray34;
		this.anIntArrayArray35 = arg0.anIntArrayArray35;
		this.aClass54Array2 = arg0.aClass54Array2;
		this.aClass4Array1 = arg0.aClass4Array1;
		this.aClass54Array1 = arg0.aClass54Array1;
		this.aShort78 = arg0.aShort78;
		this.aShort81 = arg0.aShort81;
		this.aClass185Array3 = arg0.aClass185Array3;
		this.aClass176Array3 = arg0.aClass176Array3;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "()V")
	private void method4199() {
		if (this.aBoolean349) {
			return;
		}
		this.aBoolean349 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5223; local20++) {
			@Pc(29) int local29 = this.anIntArray504[local20];
			@Pc(34) int local34 = this.anIntArray500[local20];
			@Pc(39) int local39 = this.anIntArray501[local20];
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
		this.aShort80 = (short) local8;
		this.aShort82 = (short) local14;
		this.aShort77 = (short) local10;
		this.aShort76 = (short) local16;
		this.aShort83 = (short) local12;
		this.aShort79 = (short) local18;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Lclient!ml;")
	@Override
	public Class15 method4280() {
		return this.method4225(this.aShort78, this.aShort81, -50, -10, -50);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V")
	public void method4200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static267.anIntArray498[arg2];
			local9 = Static267.anIntArray499[arg2];
			for (local11 = 0; local11 < this.anInt5221; local11++) {
				local31 = this.anIntArray500[local11] * local5 + this.anIntArray504[local11] * local9 >> 16;
				this.anIntArray500[local11] = this.anIntArray500[local11] * local9 - this.anIntArray504[local11] * local5 >> 16;
				this.anIntArray504[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static267.anIntArray498[arg0];
			local9 = Static267.anIntArray499[arg0];
			for (local11 = 0; local11 < this.anInt5221; local11++) {
				local31 = this.anIntArray500[local11] * local9 - this.anIntArray501[local11] * local5 >> 16;
				this.anIntArray501[local11] = this.anIntArray500[local11] * local5 + this.anIntArray501[local11] * local9 >> 16;
				this.anIntArray500[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static267.anIntArray498[arg1];
		local9 = Static267.anIntArray499[arg1];
		for (local11 = 0; local11 < this.anInt5221; local11++) {
			local31 = this.anIntArray501[local11] * local5 + this.anIntArray504[local11] * local9 >> 16;
			this.anIntArray501[local11] = this.anIntArray501[local11] * local9 - this.anIntArray504[local11] * local5 >> 16;
			this.anIntArray504[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "()V")
	public void method4201() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5221; local1++) {
			@Pc(10) int local10 = this.anIntArray504[local1];
			this.anIntArray504[local1] = this.anIntArray501[local1];
			this.anIntArray501[local1] = -local10;
		}
		this.method4228();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(SS)V")
	public void method4202(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray81 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt5225; local5++) {
			if (this.aShortArray81[local5] == arg0) {
				this.aShortArray81[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(III)I")
	public int method4205(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5221; local1++) {
			if (this.anIntArray504[local1] == arg0 && this.anIntArray500[local1] == 0 && this.anIntArray501[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray504[this.anInt5221] = arg0;
		this.anIntArray500[this.anInt5221] = 0;
		this.anIntArray501[this.anInt5221] = arg1;
		this.anInt5223 = ++this.anInt5221;
		return this.anInt5221 - 1;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(III)V")
	public void method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5221; local1++) {
			this.anIntArray504[local1] += arg0;
			this.anIntArray500[local1] += arg1;
			this.anIntArray501[local1] += arg2;
		}
		this.method4228();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
	@Override
	public int method4274() {
		if (!this.aBoolean349) {
			this.method4199();
		}
		return this.aShort77;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIBSB)I")
	public int method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray507[this.anInt5225] = arg0;
		this.anIntArray505[this.anInt5225] = arg1;
		this.anIntArray503[this.anInt5225] = arg2;
		this.aByteArray56[this.anInt5225] = 1;
		this.aByteArray57[this.anInt5225] = -1;
		this.aShortArray77[this.anInt5225] = arg3;
		this.aShortArray81[this.anInt5225] = -1;
		this.aByteArray61[this.anInt5225] = arg4;
		return this.anInt5225++;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	public void method4209() {
		@Pc(3) int local3 = Static267.anIntArray498[256];
		@Pc(7) int local7 = Static267.anIntArray499[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5221; local9++) {
			@Pc(29) int local29 = this.anIntArray501[local9] * local3 + this.anIntArray504[local9] * local7 >> 16;
			this.anIntArray501[local9] = this.anIntArray501[local9] * local7 - this.anIntArray504[local9] * local3 >> 16;
			this.anIntArray504[local9] = local29;
		}
		this.method4228();
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "()V")
	public void method4210() {
		if (this.aClass54Array2 != null) {
			return;
		}
		this.aClass54Array2 = new Class54[this.anInt5223];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt5223; local10++) {
			this.aClass54Array2[local10] = new Class54();
		}
		for (local10 = 0; local10 < this.anInt5225; local10++) {
			@Pc(34) int local34 = this.anIntArray507[local10];
			@Pc(39) int local39 = this.anIntArray505[local10];
			@Pc(44) int local44 = this.anIntArray503[local10];
			@Pc(54) int local54 = this.anIntArray504[local39] - this.anIntArray504[local34];
			@Pc(64) int local64 = this.anIntArray500[local39] - this.anIntArray500[local34];
			@Pc(74) int local74 = this.anIntArray501[local39] - this.anIntArray501[local34];
			@Pc(84) int local84 = this.anIntArray504[local44] - this.anIntArray504[local34];
			@Pc(94) int local94 = this.anIntArray500[local44] - this.anIntArray500[local34];
			@Pc(104) int local104 = this.anIntArray501[local44] - this.anIntArray501[local34];
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
			if (this.aByteArray56 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray56[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class54 local214 = this.aClass54Array2[local34];
				local214.anInt2011 += local112;
				local214.anInt2013 += local120;
				local214.anInt2016 += local128;
				local214.anInt2015++;
				@Pc(243) Class54 local243 = this.aClass54Array2[local39];
				local243.anInt2011 += local112;
				local243.anInt2013 += local120;
				local243.anInt2016 += local128;
				local243.anInt2015++;
				@Pc(272) Class54 local272 = this.aClass54Array2[local44];
				local272.anInt2011 += local112;
				local272.anInt2013 += local120;
				local272.anInt2016 += local128;
				local272.anInt2015++;
			} else if (local201 == 1) {
				if (this.aClass4Array1 == null) {
					this.aClass4Array1 = new Class4[this.anInt5225];
				}
				@Pc(317) Class4 local317 = this.aClass4Array1[local10] = new Class4();
				local317.anInt98 = local112;
				local317.anInt97 = local120;
				local317.anInt100 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	private void method4211(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static267.anIntArray498[arg0];
		@Pc(7) int local7 = Static267.anIntArray499[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5221; local9++) {
			@Pc(29) int local29 = this.anIntArray500[local9] * local7 - this.anIntArray501[local9] * local3 >> 16;
			this.anIntArray501[local9] = this.anIntArray500[local9] * local3 + this.anIntArray501[local9] * local7 >> 16;
			this.anIntArray500[local9] = local29;
		}
		this.method4228();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(SS)V")
	public void method4212(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5225; local1++) {
			if (this.aShortArray77[local1] == arg0) {
				this.aShortArray77[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!tc;")
	public Class15_Sub7 method4213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4199();
		@Pc(6) int local6 = arg4 + this.aShort80;
		@Pc(11) int local11 = arg4 + this.aShort82;
		@Pc(16) int local16 = arg6 + this.aShort83;
		@Pc(21) int local21 = arg6 + this.aShort79;
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
		@Pc(147) Class15_Sub7 local147 = new Class15_Sub7();
		local147.anInt5221 = this.anInt5221;
		local147.anInt5223 = this.anInt5223;
		local147.anInt5225 = this.anInt5225;
		local147.anInt5224 = this.anInt5224;
		local147.anIntArray507 = this.anIntArray507;
		local147.anIntArray505 = this.anIntArray505;
		local147.anIntArray503 = this.anIntArray503;
		local147.aByteArray56 = this.aByteArray56;
		local147.aByteArray62 = this.aByteArray62;
		local147.aByteArray61 = this.aByteArray61;
		local147.aByteArray57 = this.aByteArray57;
		local147.aShortArray77 = this.aShortArray77;
		local147.aShortArray81 = this.aShortArray81;
		local147.aByte23 = this.aByte23;
		local147.aByteArray65 = this.aByteArray65;
		local147.aShortArray76 = this.aShortArray76;
		local147.aShortArray80 = this.aShortArray80;
		local147.aShortArray79 = this.aShortArray79;
		local147.aShortArray82 = this.aShortArray82;
		local147.aShortArray83 = this.aShortArray83;
		local147.aShortArray74 = this.aShortArray74;
		local147.aByteArray59 = this.aByteArray59;
		local147.aByteArray58 = this.aByteArray58;
		local147.aByteArray64 = this.aByteArray64;
		local147.aByteArray60 = this.aByteArray60;
		local147.aByteArray63 = this.aByteArray63;
		local147.anIntArray508 = this.anIntArray508;
		local147.anIntArray509 = this.anIntArray509;
		local147.anIntArrayArray34 = this.anIntArrayArray34;
		local147.anIntArrayArray35 = this.anIntArrayArray35;
		local147.aShort78 = this.aShort78;
		local147.aShort81 = this.aShort81;
		local147.aClass54Array2 = this.aClass54Array2;
		local147.aClass4Array1 = this.aClass4Array1;
		local147.aClass54Array1 = this.aClass54Array1;
		local147.aClass185Array3 = this.aClass185Array3;
		local147.aClass176Array3 = this.aClass176Array3;
		if (arg0 == 3) {
			local147.anIntArray504 = Static279.method4344(this.anIntArray504);
			local147.anIntArray500 = Static279.method4344(this.anIntArray500);
			local147.anIntArray501 = Static279.method4344(this.anIntArray501);
		} else {
			local147.anIntArray504 = this.anIntArray504;
			local147.anIntArray500 = new int[local147.anInt5221];
			local147.anIntArray501 = this.anIntArray501;
		}
		@Pc(338) int local338;
		@Pc(349) int local349;
		@Pc(356) int local356;
		@Pc(360) int local360;
		@Pc(364) int local364;
		@Pc(368) int local368;
		@Pc(372) int local372;
		@Pc(394) int local394;
		@Pc(420) int local420;
		@Pc(432) int local432;
		if (arg0 == 1) {
			for (local338 = 0; local338 < local147.anInt5223; local338++) {
				local349 = this.anIntArray504[local338] + arg4;
				local356 = this.anIntArray501[local338] + arg6;
				local360 = local349 & 0x7F;
				local364 = local356 & 0x7F;
				local368 = local349 >> 7;
				local372 = local356 >> 7;
				local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
				local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
				local432 = local394 * (128 - local364) + local420 * local364 >> 7;
				local147.anIntArray500[local338] = this.anIntArray500[local338] + local432 - arg5;
			}
			for (local338 = local147.anInt5223; local338 < local147.anInt5221; local338++) {
				local349 = this.anIntArray504[local338] + arg4;
				local356 = this.anIntArray501[local338] + arg6;
				local360 = local349 & 0x7F;
				local364 = local356 & 0x7F;
				local368 = local349 >> 7;
				local372 = local356 >> 7;
				if (local368 >= 0 && local368 < arg2.length - 1 && local372 >= 0 && local372 < arg2[0].length - 1) {
					local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
					local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
					local432 = local394 * (128 - local364) + local420 * local364 >> 7;
					local147.anIntArray500[local338] = this.anIntArray500[local338] + local432 - arg5;
				}
			}
		} else {
			@Pc(689) int local689;
			if (arg0 == 2) {
				for (local338 = 0; local338 < local147.anInt5223; local338++) {
					local349 = (this.anIntArray500[local338] << 16) / this.aShort77;
					if (local349 < arg1) {
						local356 = this.anIntArray504[local338] + arg4;
						local360 = this.anIntArray501[local338] + arg6;
						local364 = local356 & 0x7F;
						local368 = local360 & 0x7F;
						local372 = local356 >> 7;
						local394 = local360 >> 7;
						local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
						local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local147.anIntArray500[local338] = this.anIntArray500[local338] + (local689 - arg5) * (arg1 - local349) / arg1;
					} else {
						local147.anIntArray500[local338] = this.anIntArray500[local338];
					}
				}
				for (local338 = local147.anInt5223; local338 < local147.anInt5221; local338++) {
					local349 = (this.anIntArray500[local338] << 16) / this.aShort77;
					if (local349 < arg1) {
						local356 = this.anIntArray504[local338] + arg4;
						local360 = this.anIntArray501[local338] + arg6;
						local364 = local356 & 0x7F;
						local368 = local360 & 0x7F;
						local372 = local356 >> 7;
						local394 = local360 >> 7;
						if (local372 >= 0 && local372 < arg2.length - 1 && local394 >= 0 && local394 < arg2[0].length - 1) {
							local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
							local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
							local689 = local420 * (128 - local368) + local432 * local368 >> 7;
							local147.anIntArray500[local338] = this.anIntArray500[local338] + (local689 - arg5) * (arg1 - local349) / arg1;
						}
					} else {
						local147.anIntArray500[local338] = this.anIntArray500[local338];
					}
				}
			} else if (arg0 == 3) {
				local338 = (arg1 & 0xFF) * 4;
				local349 = (arg1 >> 8 & 0xFF) * 4;
				local147.method4215(arg2, arg4, arg5, arg6, local338, local349);
			} else if (arg0 == 4) {
				local338 = this.aShort76 - this.aShort77;
				for (local349 = 0; local349 < this.anInt5223; local349++) {
					local356 = this.anIntArray504[local349] + arg4;
					local360 = this.anIntArray501[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
					local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
					local689 = local420 * (128 - local368) + local432 * local368 >> 7;
					local147.anIntArray500[local349] = this.anIntArray500[local349] + local689 + local338 - arg5;
				}
				for (local349 = local147.anInt5223; local349 < local147.anInt5221; local349++) {
					local356 = this.anIntArray504[local349] + arg4;
					local360 = this.anIntArray501[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					if (local372 >= 0 && local372 < arg3.length - 1 && local394 >= 0 && local394 < arg3[0].length - 1) {
						local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
						local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local147.anIntArray500[local349] = this.anIntArray500[local349] + local689 + local338 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local338 = this.aShort76 - this.aShort77;
				@Pc(1322) int local1322;
				@Pc(1326) int local1326;
				for (local349 = 0; local349 < this.anInt5223; local349++) {
					local356 = this.anIntArray504[local349] + arg4;
					local360 = this.anIntArray501[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
					local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
					local689 = local420 * (128 - local368) + local432 * local368 >> 7;
					local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
					local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
					local1322 = local420 * (128 - local368) + local432 * local368 >> 7;
					local1326 = local689 - local1322;
					local147.anIntArray500[local349] = ((this.anIntArray500[local349] << 8) / local338 * local1326 >> 8) - (arg5 - local689);
				}
				for (local349 = local147.anInt5223; local349 < local147.anInt5221; local349++) {
					local356 = this.anIntArray504[local349] + arg4;
					local360 = this.anIntArray501[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					if (local372 >= 0 && local372 < arg2.length - 1 && local372 < arg3.length - 1 && local394 >= 0 && local394 < arg2[0].length - 1 && local394 < arg3[0].length - 1) {
						local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
						local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
						local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
						local1322 = local420 * (128 - local368) + local432 * local368 >> 7;
						local1326 = local689 - local1322;
						local147.anIntArray500[local349] = ((this.anIntArray500[local349] << 8) / local338 * local1326 >> 8) - (arg5 - local689);
					}
				}
			}
		}
		this.aBoolean349 = false;
		return local147;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(III)V")
	public void method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5221; local1++) {
			this.anIntArray504[local1] = this.anIntArray504[local1] * arg0 / 128;
			this.anIntArray500[local1] = this.anIntArray500[local1] * arg1 / 128;
			this.anIntArray501[local1] = this.anIntArray501[local1] * arg2 / 128;
		}
		this.method4228();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([[IIIIII)V")
	private void method4215(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static267.method4207(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static267.method4207(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static267.method4207(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static267.method4207(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method4211(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method4226(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method4206(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIIII)Lclient!ij;")
	public Class15_Sub5_Sub1 method4216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class15_Sub5_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "()V")
	public void method4217() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray508 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt5221; local9++) {
				local18 = this.anIntArray508[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray34 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray34[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt5221) {
				local18 = this.anIntArray508[local9];
				this.anIntArrayArray34[local18][local5[local18]++] = local9++;
			}
			this.anIntArray508 = null;
		}
		if (this.anIntArray509 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt5225; local9++) {
			local18 = this.anIntArray509[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray35 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray35[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt5225) {
			local18 = this.anIntArray509[local9];
			this.anIntArrayArray35[local18][local5[local18]++] = local9++;
		}
		this.anIntArray509 = null;
	}

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "()Lclient!tc;")
	public Class15_Sub7 method4218() {
		@Pc(3) Class15_Sub7 local3 = new Class15_Sub7();
		if (this.aByteArray56 != null) {
			local3.aByteArray56 = new byte[this.anInt5225];
			for (@Pc(13) int local13 = 0; local13 < this.anInt5225; local13++) {
				local3.aByteArray56[local13] = this.aByteArray56[local13];
			}
		}
		local3.anInt5221 = this.anInt5221;
		local3.anInt5223 = this.anInt5223;
		local3.anInt5225 = this.anInt5225;
		local3.anInt5224 = this.anInt5224;
		local3.anIntArray504 = this.anIntArray504;
		local3.anIntArray500 = this.anIntArray500;
		local3.anIntArray501 = this.anIntArray501;
		local3.anIntArray507 = this.anIntArray507;
		local3.anIntArray505 = this.anIntArray505;
		local3.anIntArray503 = this.anIntArray503;
		local3.aByteArray62 = this.aByteArray62;
		local3.aByteArray61 = this.aByteArray61;
		local3.aByteArray57 = this.aByteArray57;
		local3.aShortArray77 = this.aShortArray77;
		local3.aShortArray81 = this.aShortArray81;
		local3.aByte23 = this.aByte23;
		local3.aByteArray65 = this.aByteArray65;
		local3.aShortArray76 = this.aShortArray76;
		local3.aShortArray80 = this.aShortArray80;
		local3.aShortArray79 = this.aShortArray79;
		local3.aShortArray82 = this.aShortArray82;
		local3.aShortArray83 = this.aShortArray83;
		local3.aShortArray74 = this.aShortArray74;
		local3.aByteArray59 = this.aByteArray59;
		local3.aByteArray58 = this.aByteArray58;
		local3.aByteArray64 = this.aByteArray64;
		local3.aByteArray60 = this.aByteArray60;
		local3.aByteArray63 = this.aByteArray63;
		local3.anIntArray508 = this.anIntArray508;
		local3.anIntArray509 = this.anIntArray509;
		local3.anIntArrayArray34 = this.anIntArrayArray34;
		local3.anIntArrayArray35 = this.anIntArrayArray35;
		local3.aClass54Array2 = this.aClass54Array2;
		local3.aClass4Array1 = this.aClass4Array1;
		local3.aShort78 = this.aShort78;
		local3.aShort81 = this.aShort81;
		local3.aClass185Array3 = this.aClass185Array3;
		local3.aClass176Array3 = this.aClass176Array3;
		return local3;
	}

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "()V")
	public void method4219() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5221; local1++) {
			this.anIntArray501[local1] = -this.anIntArray501[local1];
		}
		for (local1 = 0; local1 < this.anInt5225; local1++) {
			@Pc(27) int local27 = this.anIntArray507[local1];
			this.anIntArray507[local1] = this.anIntArray503[local1];
			this.anIntArray503[local1] = local27;
		}
		this.method4228();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "()Z")
	@Override
	public boolean method4278() {
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "()V")
	public void method4220() {
		this.anIntArray508 = null;
		this.anIntArray509 = null;
		this.anIntArrayArray34 = null;
		this.anIntArrayArray35 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([B)V")
	private void method4221(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub16 local8 = new Class2_Sub16(arg0);
		@Pc(13) Class2_Sub16 local13 = new Class2_Sub16(arg0);
		@Pc(18) Class2_Sub16 local18 = new Class2_Sub16(arg0);
		@Pc(23) Class2_Sub16 local23 = new Class2_Sub16(arg0);
		@Pc(28) Class2_Sub16 local28 = new Class2_Sub16(arg0);
		local8.anInt2789 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2130();
		@Pc(42) int local42 = local8.method2130();
		@Pc(46) int local46 = local8.method2146();
		@Pc(50) int local50 = local8.method2146();
		@Pc(54) int local54 = local8.method2146();
		@Pc(58) int local58 = local8.method2146();
		@Pc(62) int local62 = local8.method2146();
		@Pc(66) int local66 = local8.method2146();
		@Pc(70) int local70 = local8.method2130();
		@Pc(74) int local74 = local8.method2130();
		@Pc(78) int local78 = local8.method2130();
		@Pc(82) int local82 = local8.method2130();
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
		this.anInt5221 = local38;
		this.anInt5225 = local42;
		this.anInt5224 = local46;
		this.anIntArray504 = new int[local38];
		this.anIntArray500 = new int[local38];
		this.anIntArray501 = new int[local38];
		this.anIntArray507 = new int[local42];
		this.anIntArray505 = new int[local42];
		this.anIntArray503 = new int[local42];
		if (local46 > 0) {
			this.aByteArray65 = new byte[local46];
			this.aShortArray76 = new short[local46];
			this.aShortArray80 = new short[local46];
			this.aShortArray79 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray508 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray56 = new byte[local42];
			this.aByteArray57 = new byte[local42];
			this.aShortArray81 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray62 = new byte[local42];
		} else {
			this.aByte23 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray61 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray509 = new int[local42];
		}
		this.aShortArray77 = new short[local42];
		local8.anInt2789 = 0;
		local13.anInt2789 = local165;
		local18.anInt2789 = local171;
		local23.anInt2789 = local90;
		local28.anInt2789 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method2146();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method2174();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method2174();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method2174();
			}
			this.anIntArray504[local307] = local301 + local316;
			this.anIntArray500[local307] = local303 + local326;
			this.anIntArray501[local307] = local305 + local336;
			local301 = this.anIntArray504[local307];
			local303 = this.anIntArray500[local307];
			local305 = this.anIntArray501[local307];
			if (local66 == 1) {
				this.anIntArray508[local307] = local28.method2146();
			}
		}
		local8.anInt2789 = local149;
		local13.anInt2789 = local116;
		local18.anInt2789 = local98;
		local23.anInt2789 = local134;
		local28.anInt2789 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray77[local307] = (short) local8.method2130();
			if (local50 == 1) {
				local314 = local13.method2146();
				if ((local314 & 0x1) == 1) {
					this.aByteArray56[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray56[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray57[local307] = (byte) (local314 >> 2);
					this.aShortArray81[local307] = this.aShortArray77[local307];
					this.aShortArray77[local307] = 127;
					if (this.aShortArray81[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray57[local307] = -1;
					this.aShortArray81[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray62[local307] = local18.method2170();
			}
			if (local58 == 1) {
				this.aByteArray61[local307] = local23.method2170();
			}
			if (local62 == 1) {
				this.anIntArray509[local307] = local28.method2146();
			}
		}
		this.anInt5223 = -1;
		local8.anInt2789 = local143;
		local13.anInt2789 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method2146();
			if (local548 == 1) {
				local307 = local8.method2174() + local326;
				local314 = local8.method2174() + local307;
				local316 = local8.method2174() + local314;
				local326 = local316;
				this.anIntArray507[local336] = local307;
				this.anIntArray505[local336] = local314;
				this.anIntArray503[local336] = local316;
				if (local307 > this.anInt5223) {
					this.anInt5223 = local307;
				}
				if (local314 > this.anInt5223) {
					this.anInt5223 = local314;
				}
				if (local316 > this.anInt5223) {
					this.anInt5223 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method2174() + local326;
				local326 = local316;
				this.anIntArray507[local336] = local307;
				this.anIntArray505[local336] = local314;
				this.anIntArray503[local336] = local316;
				if (local316 > this.anInt5223) {
					this.anInt5223 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method2174() + local326;
				local326 = local316;
				this.anIntArray507[local336] = local307;
				this.anIntArray505[local336] = local314;
				this.anIntArray503[local336] = local316;
				if (local316 > this.anInt5223) {
					this.anInt5223 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method2174() + local326;
				local326 = local316;
				this.anIntArray507[local336] = local307;
				this.anIntArray505[local336] = local686;
				this.anIntArray503[local336] = local316;
				if (local316 > this.anInt5223) {
					this.anInt5223 = local316;
				}
			}
		}
		this.anInt5223++;
		local8.anInt2789 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray65[local336] = 0;
			this.aShortArray76[local336] = (short) local8.method2130();
			this.aShortArray80[local336] = (short) local8.method2130();
			this.aShortArray79[local336] = (short) local8.method2130();
		}
		if (this.aByteArray57 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray57[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray76[local686] & 0xFFFF) == this.anIntArray507[local548] && (this.aShortArray80[local686] & 0xFFFF) == this.anIntArray505[local548] && (this.aShortArray79[local686] & 0xFFFF) == this.anIntArray503[local548]) {
						this.aByteArray57[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray57 = null;
			}
		}
		if (!local3) {
			this.aShortArray81 = null;
		}
		if (!local1) {
			this.aByteArray56 = null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!tc;IS)I")
	private int method4222(@OriginalArg(0) Class15_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray504[arg1];
		@Pc(9) int local9 = arg0.anIntArray500[arg1];
		@Pc(14) int local14 = arg0.anIntArray501[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5221; local16++) {
			if (local4 == this.anIntArray504[local16] && local9 == this.anIntArray500[local16] && local14 == this.anIntArray501[local16]) {
				this.aShortArray75[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray504[this.anInt5221] = local4;
		this.anIntArray500[this.anInt5221] = local9;
		this.anIntArray501[this.anInt5221] = local14;
		this.aShortArray75[this.anInt5221] = arg2;
		if (arg0.anIntArray508 != null) {
			this.anIntArray508[this.anInt5221] = arg0.anIntArray508[arg1];
		}
		return this.anInt5221++;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIJILclient!gl;)V")
	@Override
	public void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub2 arg10) {
	}

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "()V")
	public void method4223() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5221; local1++) {
			@Pc(10) int local10 = this.anIntArray501[local1];
			this.anIntArray501[local1] = this.anIntArray504[local1];
			this.anIntArray504[local1] = -local10;
		}
		this.method4228();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "([B)V")
	private void method4224(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub16 local4 = new Class2_Sub16(arg0);
		@Pc(9) Class2_Sub16 local9 = new Class2_Sub16(arg0);
		@Pc(14) Class2_Sub16 local14 = new Class2_Sub16(arg0);
		@Pc(19) Class2_Sub16 local19 = new Class2_Sub16(arg0);
		@Pc(24) Class2_Sub16 local24 = new Class2_Sub16(arg0);
		@Pc(29) Class2_Sub16 local29 = new Class2_Sub16(arg0);
		@Pc(34) Class2_Sub16 local34 = new Class2_Sub16(arg0);
		local4.anInt2789 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2130();
		@Pc(48) int local48 = local4.method2130();
		@Pc(52) int local52 = local4.method2146();
		@Pc(56) int local56 = local4.method2146();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method2146();
		@Pc(82) int local82 = local4.method2146();
		@Pc(86) int local86 = local4.method2146();
		@Pc(90) int local90 = local4.method2146();
		@Pc(94) int local94 = local4.method2146();
		@Pc(98) int local98 = local4.method2130();
		@Pc(102) int local102 = local4.method2130();
		@Pc(106) int local106 = local4.method2130();
		@Pc(110) int local110 = local4.method2130();
		@Pc(114) int local114 = local4.method2130();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray65 = new byte[local52];
			local4.anInt2789 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray65[local131] = local4.method2170();
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
		this.anInt5221 = local44;
		this.anInt5225 = local48;
		this.anInt5224 = local52;
		this.anIntArray504 = new int[local44];
		this.anIntArray500 = new int[local44];
		this.anIntArray501 = new int[local44];
		this.anIntArray507 = new int[local48];
		this.anIntArray505 = new int[local48];
		this.anIntArray503 = new int[local48];
		if (local94 == 1) {
			this.anIntArray508 = new int[local44];
		}
		if (local65) {
			this.aByteArray56 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray62 = new byte[local48];
		} else {
			this.aByte23 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray61 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray509 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray81 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray57 = new byte[local48];
		}
		this.aShortArray77 = new short[local48];
		if (local52 > 0) {
			this.aShortArray76 = new short[local52];
			this.aShortArray80 = new short[local52];
			this.aShortArray79 = new short[local52];
			if (local118 > 0) {
				this.aShortArray82 = new short[local118];
				this.aShortArray83 = new short[local118];
				this.aShortArray74 = new short[local118];
				this.aByteArray59 = new byte[local118];
				this.aByteArray58 = new byte[local118];
				this.aByteArray64 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray60 = new byte[local120];
				this.aByteArray63 = new byte[local120];
			}
		}
		local4.anInt2789 = local52;
		local9.anInt2789 = local250;
		local14.anInt2789 = local256;
		local19.anInt2789 = local262;
		local24.anInt2789 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method2146();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method2174();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method2174();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method2174();
			}
			this.anIntArray504[local479] = local473 + local488;
			this.anIntArray500[local479] = local475 + local498;
			this.anIntArray501[local479] = local477 + local508;
			local473 = this.anIntArray504[local479];
			local475 = this.anIntArray500[local479];
			local477 = this.anIntArray501[local479];
			if (local94 == 1) {
				this.anIntArray508[local479] = local24.method2146();
			}
		}
		local4.anInt2789 = local242;
		local9.anInt2789 = local169;
		local14.anInt2789 = local183;
		local19.anInt2789 = local210;
		local24.anInt2789 = local192;
		local29.anInt2789 = local225;
		local34.anInt2789 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray77[local479] = (short) local4.method2130();
			if (local65) {
				this.aByteArray56[local479] = local9.method2170();
			}
			if (local78 == 255) {
				this.aByteArray62[local479] = local14.method2170();
			}
			if (local82 == 1) {
				this.aByteArray61[local479] = local19.method2170();
			}
			if (local86 == 1) {
				this.anIntArray509[local479] = local24.method2146();
			}
			if (local90 == 1) {
				this.aShortArray81[local479] = (short) (local29.method2130() - 1);
			}
			if (this.aByteArray57 != null) {
				if (this.aShortArray81[local479] == -1) {
					this.aByteArray57[local479] = -1;
				} else {
					this.aByteArray57[local479] = (byte) (local34.method2146() - 1);
				}
			}
		}
		this.anInt5223 = -1;
		local4.anInt2789 = local219;
		local9.anInt2789 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		@Pc(841) int local841;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method2146();
			if (local703 == 1) {
				local479 = local4.method2174() + local498;
				local486 = local4.method2174() + local479;
				local488 = local4.method2174() + local486;
				local498 = local488;
				this.anIntArray507[local508] = local479;
				this.anIntArray505[local508] = local486;
				this.anIntArray503[local508] = local488;
				if (local479 > this.anInt5223) {
					this.anInt5223 = local479;
				}
				if (local486 > this.anInt5223) {
					this.anInt5223 = local486;
				}
				if (local488 > this.anInt5223) {
					this.anInt5223 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method2174() + local498;
				local498 = local488;
				this.anIntArray507[local508] = local479;
				this.anIntArray505[local508] = local486;
				this.anIntArray503[local508] = local488;
				if (local488 > this.anInt5223) {
					this.anInt5223 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method2174() + local498;
				local498 = local488;
				this.anIntArray507[local508] = local479;
				this.anIntArray505[local508] = local486;
				this.anIntArray503[local508] = local488;
				if (local488 > this.anInt5223) {
					this.anInt5223 = local488;
				}
			}
			if (local703 == 4) {
				local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method2174() + local498;
				local498 = local488;
				this.anIntArray507[local508] = local479;
				this.anIntArray505[local508] = local841;
				this.anIntArray503[local508] = local488;
				if (local488 > this.anInt5223) {
					this.anInt5223 = local488;
				}
			}
		}
		this.anInt5223++;
		local4.anInt2789 = local268;
		local9.anInt2789 = local276;
		local14.anInt2789 = local284;
		local19.anInt2789 = local292;
		local24.anInt2789 = local298;
		local29.anInt2789 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray65[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray76[local508] = (short) local4.method2130();
				this.aShortArray80[local508] = (short) local4.method2130();
				this.aShortArray79[local508] = (short) local4.method2130();
			}
			if (local703 == 1) {
				this.aShortArray76[local508] = (short) local9.method2130();
				this.aShortArray80[local508] = (short) local9.method2130();
				this.aShortArray79[local508] = (short) local9.method2130();
				this.aShortArray82[local508] = (short) local14.method2130();
				this.aShortArray83[local508] = (short) local14.method2130();
				this.aShortArray74[local508] = (short) local14.method2130();
				this.aByteArray59[local508] = local19.method2170();
				this.aByteArray58[local508] = local24.method2170();
				this.aByteArray64[local508] = local29.method2170();
			}
			if (local703 == 2) {
				this.aShortArray76[local508] = (short) local9.method2130();
				this.aShortArray80[local508] = (short) local9.method2130();
				this.aShortArray79[local508] = (short) local9.method2130();
				this.aShortArray82[local508] = (short) local14.method2130();
				this.aShortArray83[local508] = (short) local14.method2130();
				this.aShortArray74[local508] = (short) local14.method2130();
				this.aByteArray59[local508] = local19.method2170();
				this.aByteArray58[local508] = local24.method2170();
				this.aByteArray64[local508] = local29.method2170();
				this.aByteArray60[local508] = local29.method2170();
				this.aByteArray63[local508] = local29.method2170();
			}
			if (local703 == 3) {
				this.aShortArray76[local508] = (short) local9.method2130();
				this.aShortArray80[local508] = (short) local9.method2130();
				this.aShortArray79[local508] = (short) local9.method2130();
				this.aShortArray82[local508] = (short) local14.method2130();
				this.aShortArray83[local508] = (short) local14.method2130();
				this.aShortArray74[local508] = (short) local14.method2130();
				this.aByteArray59[local508] = local19.method2170();
				this.aByteArray58[local508] = local24.method2170();
				this.aByteArray64[local508] = local29.method2170();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt2789 = local131;
		local508 = local4.method2146();
		if (local508 > 0) {
			this.aClass185Array3 = new Class185[local508];
			for (local703 = 0; local703 < local508; local703++) {
				local841 = local4.method2130();
				@Pc(1199) int local1199 = local4.method2130();
				this.aClass185Array3[local703] = new Class185(local841, this.anIntArray507[local1199], this.anIntArray505[local1199], this.anIntArray503[local1199]);
			}
		}
		local703 = local4.method2146();
		if (local703 > 0) {
			this.aClass176Array3 = new Class176[local703];
			for (local841 = 0; local841 < local703; local841++) {
				this.aClass176Array3[local841] = new Class176(local4.method2130(), local4.method2130());
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(IIIII)Lclient!hb;")
	public Class15_Sub5 method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static116.aBoolean184) {
			@Pc(9) Class15_Sub5_Sub2 local9 = new Class15_Sub5_Sub2(this, arg0, arg1, true);
			local9.method2385();
			return local9;
		} else {
			return new Class15_Sub5_Sub1(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	private void method4226(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static267.anIntArray498[arg0];
		@Pc(7) int local7 = Static267.anIntArray499[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5221; local9++) {
			@Pc(29) int local29 = this.anIntArray500[local9] * local3 + this.anIntArray504[local9] * local7 >> 16;
			this.anIntArray500[local9] = this.anIntArray500[local9] * local7 - this.anIntArray504[local9] * local3 >> 16;
			this.anIntArray504[local9] = local29;
		}
		this.method4228();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ml;IIIZ)V")
	@Override
	public void method4279(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class15_Sub7 local2 = (Class15_Sub7) arg0;
		local2.method4199();
		local2.method4210();
		Static267.anInt5222++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray504;
		@Pc(18) int local18 = local2.anInt5223;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt5223; local20++) {
			@Pc(29) Class54 local29 = this.aClass54Array2[local20];
			if (local29.anInt2015 != 0) {
				@Pc(40) int local40 = this.anIntArray500[local20] - arg2;
				if (local40 >= local2.aShort77 && local40 <= local2.aShort76) {
					@Pc(56) int local56 = this.anIntArray504[local20] - arg1;
					if (local56 >= local2.aShort80 && local56 <= local2.aShort82) {
						@Pc(72) int local72 = this.anIntArray501[local20] - arg3;
						if (local72 >= local2.aShort83 && local72 <= local2.aShort79) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class54 local91 = local2.aClass54Array2[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray501[local83] && local40 == local2.anIntArray500[local83] && local91.anInt2015 != 0) {
									if (this.aClass54Array1 == null) {
										this.aClass54Array1 = new Class54[this.anInt5223];
									}
									if (local2.aClass54Array1 == null) {
										local2.aClass54Array1 = new Class54[local18];
									}
									@Pc(131) Class54 local131 = this.aClass54Array1[local20];
									if (local131 == null) {
										local131 = this.aClass54Array1[local20] = new Class54(local29);
									}
									@Pc(148) Class54 local148 = local2.aClass54Array1[local83];
									if (local148 == null) {
										local148 = local2.aClass54Array1[local83] = new Class54(local91);
									}
									local131.anInt2011 += local91.anInt2011;
									local131.anInt2013 += local91.anInt2013;
									local131.anInt2016 += local91.anInt2016;
									local131.anInt2015 += local91.anInt2015;
									local148.anInt2011 += local29.anInt2011;
									local148.anInt2013 += local29.anInt2013;
									local148.anInt2016 += local29.anInt2016;
									local148.anInt2015 += local29.anInt2015;
									local12++;
									Static267.anIntArray506[local20] = Static267.anInt5222;
									Static267.anIntArray502[local83] = Static267.anInt5222;
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
		for (local20 = 0; local20 < this.anInt5225; local20++) {
			if (Static267.anIntArray506[this.anIntArray507[local20]] == Static267.anInt5222 && Static267.anIntArray506[this.anIntArray505[local20]] == Static267.anInt5222 && Static267.anIntArray506[this.anIntArray503[local20]] == Static267.anInt5222) {
				if (this.aByteArray56 == null) {
					this.aByteArray56 = new byte[this.anInt5225];
				}
				this.aByteArray56[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt5225; local20++) {
			if (Static267.anIntArray502[local2.anIntArray507[local20]] == Static267.anInt5222 && Static267.anIntArray502[local2.anIntArray505[local20]] == Static267.anInt5222 && Static267.anIntArray502[local2.anIntArray503[local20]] == Static267.anInt5222) {
				if (local2.aByteArray56 == null) {
					local2.aByteArray56 = new byte[local2.anInt5225];
				}
				local2.aByteArray56[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "()V")
	public void method4227() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5221; local1++) {
			this.anIntArray504[local1] = -this.anIntArray504[local1];
			this.anIntArray501[local1] = -this.anIntArray501[local1];
		}
		this.method4228();
	}

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "()V")
	private void method4228() {
		this.aClass54Array2 = null;
		this.aClass54Array1 = null;
		this.aClass4Array1 = null;
		this.aBoolean349 = false;
	}
}
