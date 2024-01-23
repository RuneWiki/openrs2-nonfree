import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!le", name = "x", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!le", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!le", name = "A", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!le", name = "C", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!le", name = "D", descriptor = "[Lclient!ng;")
	public Class106[] aClass106Array1;

	@OriginalMember(owner = "client!le", name = "E", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!le", name = "H", descriptor = "S")
	public short aShort17;

	@OriginalMember(owner = "client!le", name = "I", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!le", name = "J", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!le", name = "K", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!le", name = "M", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!le", name = "N", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!le", name = "Q", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!le", name = "R", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!le", name = "S", descriptor = "I")
	public int anInt3518;

	@OriginalMember(owner = "client!le", name = "T", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!le", name = "V", descriptor = "S")
	public short aShort20;

	@OriginalMember(owner = "client!le", name = "Y", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!le", name = "Z", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!le", name = "ab", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!le", name = "bb", descriptor = "[Lclient!ng;")
	public Class106[] aClass106Array2;

	@OriginalMember(owner = "client!le", name = "cb", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!le", name = "db", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!le", name = "eb", descriptor = "[Lclient!nn;")
	public Class110[] aClass110Array1;

	@OriginalMember(owner = "client!le", name = "gb", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!le", name = "hb", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!le", name = "ib", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!le", name = "jb", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!le", name = "kb", descriptor = "[I")
	public int[] anIntArray317;

	@OriginalMember(owner = "client!le", name = "mb", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!le", name = "B", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	public int anInt3517 = 0;

	@OriginalMember(owner = "client!le", name = "W", descriptor = "I")
	public int anInt3520 = 0;

	@OriginalMember(owner = "client!le", name = "fb", descriptor = "I")
	public int anInt3521 = 0;

	@OriginalMember(owner = "client!le", name = "L", descriptor = "B")
	public byte aByte11 = 0;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	private Class25_Sub3() {
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "([B)V")
	public Class25_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2824(arg0);
		} else {
			this.method2822(arg0);
		}
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(III)V")
	public Class25_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray308 = new int[arg0];
		this.anIntArray307 = new int[arg0];
		this.anIntArray314 = new int[arg0];
		this.anIntArray317 = new int[arg0];
		this.anIntArray316 = new int[arg1];
		this.anIntArray313 = new int[arg1];
		this.anIntArray312 = new int[arg1];
		this.aByteArray40 = new byte[arg1];
		this.aByteArray42 = new byte[arg1];
		this.aByteArray43 = new byte[arg1];
		this.aShortArray60 = new short[arg1];
		this.aShortArray58 = new short[arg1];
		this.aByteArray45 = new byte[arg1];
		this.anIntArray315 = new int[arg1];
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "([Lclient!le;I)V")
	public Class25_Sub3(@OriginalArg(0) Class25_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt3517 = 0;
		this.anInt3521 = 0;
		this.anInt3518 = 0;
		this.aByte11 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class25_Sub3 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt3517 += local53.anInt3517;
				this.anInt3521 += local53.anInt3521;
				this.anInt3518 += local53.anInt3518;
				if (local53.aByteArray42 == null) {
					if (this.aByte11 == -1) {
						this.aByte11 = local53.aByte11;
					}
					if (this.aByte11 != local53.aByte11) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray40 != null;
				local22 |= local53.aByteArray43 != null;
				local24 |= local53.anIntArray315 != null;
				local26 |= local53.aShortArray58 != null;
				local28 |= local53.aByteArray45 != null;
			}
		}
		this.anIntArray308 = new int[this.anInt3517];
		this.anIntArray307 = new int[this.anInt3517];
		this.anIntArray314 = new int[this.anInt3517];
		this.anIntArray317 = new int[this.anInt3517];
		this.aShortArray53 = new short[this.anInt3517];
		this.anIntArray316 = new int[this.anInt3521];
		this.anIntArray313 = new int[this.anInt3521];
		this.anIntArray312 = new int[this.anInt3521];
		if (local18) {
			this.aByteArray40 = new byte[this.anInt3521];
		}
		if (local20) {
			this.aByteArray42 = new byte[this.anInt3521];
		}
		if (local22) {
			this.aByteArray43 = new byte[this.anInt3521];
		}
		if (local24) {
			this.anIntArray315 = new int[this.anInt3521];
		}
		if (local26) {
			this.aShortArray58 = new short[this.anInt3521];
		}
		if (local28) {
			this.aByteArray45 = new byte[this.anInt3521];
		}
		this.aShortArray60 = new short[this.anInt3521];
		this.aShortArray55 = new short[this.anInt3521];
		if (this.anInt3518 > 0) {
			this.aByteArray49 = new byte[this.anInt3518];
			this.aShortArray57 = new short[this.anInt3518];
			this.aShortArray59 = new short[this.anInt3518];
			this.aShortArray56 = new short[this.anInt3518];
			this.aShortArray51 = new short[this.anInt3518];
			this.aShortArray54 = new short[this.anInt3518];
			this.aShortArray52 = new short[this.anInt3518];
			this.aByteArray41 = new byte[this.anInt3518];
			this.aByteArray46 = new byte[this.anInt3518];
			this.aByteArray48 = new byte[this.anInt3518];
			this.aByteArray47 = new byte[this.anInt3518];
			this.aByteArray44 = new byte[this.anInt3518];
		}
		this.anInt3517 = 0;
		this.anInt3521 = 0;
		this.anInt3518 = 0;
		@Pc(330) Class25_Sub3 local330;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(326) short local326 = (short) (0x1 << local46);
			local330 = arg0[local46];
			if (local330 != null) {
				for (@Pc(334) int local334 = 0; local334 < local330.anInt3521; local334++) {
					if (local18 && local330.aByteArray40 != null) {
						this.aByteArray40[this.anInt3521] = local330.aByteArray40[local334];
					}
					if (local20) {
						if (local330.aByteArray42 == null) {
							this.aByteArray42[this.anInt3521] = local330.aByte11;
						} else {
							this.aByteArray42[this.anInt3521] = local330.aByteArray42[local334];
						}
					}
					if (local22 && local330.aByteArray43 != null) {
						this.aByteArray43[this.anInt3521] = local330.aByteArray43[local334];
					}
					if (local24 && local330.anIntArray315 != null) {
						this.anIntArray315[this.anInt3521] = local330.anIntArray315[local334];
					}
					if (local26) {
						if (local330.aShortArray58 == null) {
							this.aShortArray58[this.anInt3521] = -1;
						} else {
							this.aShortArray58[this.anInt3521] = local330.aShortArray58[local334];
						}
					}
					this.aShortArray60[this.anInt3521] = local330.aShortArray60[local334];
					this.aShortArray55[this.anInt3521] = local326;
					this.anIntArray316[this.anInt3521] = this.method2800(local330, local330.anIntArray316[local334], local326);
					this.anIntArray313[this.anInt3521] = this.method2800(local330, local330.anIntArray313[local334], local326);
					this.anIntArray312[this.anInt3521] = this.method2800(local330, local330.anIntArray312[local334], local326);
					this.anInt3521++;
				}
			}
		}
		local46 = 0;
		this.anInt3520 = this.anInt3517;
		for (@Pc(495) int local495 = 0; local495 < arg1; local495++) {
			local330 = arg0[local495];
			@Pc(507) short local507 = (short) (0x1 << local495);
			if (local330 != null) {
				@Pc(511) int local511;
				for (local511 = 0; local511 < local330.anInt3521; local511++) {
					if (local28) {
						this.aByteArray45[local46++] = (byte) (local330.aByteArray45 == null || local330.aByteArray45[local511] == -1 ? -1 : local330.aByteArray45[local511] + this.anInt3518);
					}
				}
				for (local511 = 0; local511 < local330.anInt3518; local511++) {
					@Pc(560) byte local560 = this.aByteArray49[this.anInt3518] = local330.aByteArray49[local511];
					if (local560 == 0) {
						this.aShortArray57[this.anInt3518] = (short) this.method2800(local330, local330.aShortArray57[local511], local507);
						this.aShortArray59[this.anInt3518] = (short) this.method2800(local330, local330.aShortArray59[local511], local507);
						this.aShortArray56[this.anInt3518] = (short) this.method2800(local330, local330.aShortArray56[local511], local507);
					}
					if (local560 >= 1 && local560 <= 3) {
						this.aShortArray57[this.anInt3518] = local330.aShortArray57[local511];
						this.aShortArray59[this.anInt3518] = local330.aShortArray59[local511];
						this.aShortArray56[this.anInt3518] = local330.aShortArray56[local511];
						this.aShortArray51[this.anInt3518] = local330.aShortArray51[local511];
						this.aShortArray54[this.anInt3518] = local330.aShortArray54[local511];
						this.aShortArray52[this.anInt3518] = local330.aShortArray52[local511];
						this.aByteArray41[this.anInt3518] = local330.aByteArray41[local511];
						this.aByteArray46[this.anInt3518] = local330.aByteArray46[local511];
						this.aByteArray48[this.anInt3518] = local330.aByteArray48[local511];
					}
					if (local560 == 2) {
						this.aByteArray47[this.anInt3518] = local330.aByteArray47[local511];
						this.aByteArray44[this.anInt3518] = local330.aByteArray44[local511];
					}
					this.anInt3518++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!le;ZZZZ)V")
	public Class25_Sub3(@OriginalArg(0) Class25_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3517 = arg0.anInt3517;
		this.anInt3520 = arg0.anInt3520;
		this.anInt3521 = arg0.anInt3521;
		this.anInt3518 = arg0.anInt3518;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray308 = arg0.anIntArray308;
			this.anIntArray307 = arg0.anIntArray307;
			this.anIntArray314 = arg0.anIntArray314;
		} else {
			this.anIntArray308 = new int[this.anInt3517];
			this.anIntArray307 = new int[this.anInt3517];
			this.anIntArray314 = new int[this.anInt3517];
			for (local64 = 0; local64 < this.anInt3517; local64++) {
				this.anIntArray308[local64] = arg0.anIntArray308[local64];
				this.anIntArray307[local64] = arg0.anIntArray307[local64];
				this.anIntArray314[local64] = arg0.anIntArray314[local64];
			}
		}
		if (arg2) {
			this.aShortArray60 = arg0.aShortArray60;
		} else {
			this.aShortArray60 = new short[this.anInt3521];
			for (local64 = 0; local64 < this.anInt3521; local64++) {
				this.aShortArray60[local64] = arg0.aShortArray60[local64];
			}
		}
		if (arg3 || arg0.aShortArray58 == null) {
			this.aShortArray58 = arg0.aShortArray58;
		} else {
			this.aShortArray58 = new short[this.anInt3521];
			for (local64 = 0; local64 < this.anInt3521; local64++) {
				this.aShortArray58[local64] = arg0.aShortArray58[local64];
			}
		}
		this.aByteArray43 = arg0.aByteArray43;
		this.anIntArray316 = arg0.anIntArray316;
		this.anIntArray313 = arg0.anIntArray313;
		this.anIntArray312 = arg0.anIntArray312;
		this.aByteArray40 = arg0.aByteArray40;
		this.aByteArray42 = arg0.aByteArray42;
		this.aByteArray45 = arg0.aByteArray45;
		this.aByte11 = arg0.aByte11;
		this.aByteArray49 = arg0.aByteArray49;
		this.aShortArray57 = arg0.aShortArray57;
		this.aShortArray59 = arg0.aShortArray59;
		this.aShortArray56 = arg0.aShortArray56;
		this.aShortArray51 = arg0.aShortArray51;
		this.aShortArray54 = arg0.aShortArray54;
		this.aShortArray52 = arg0.aShortArray52;
		this.aByteArray41 = arg0.aByteArray41;
		this.aByteArray46 = arg0.aByteArray46;
		this.aByteArray48 = arg0.aByteArray48;
		this.aByteArray47 = arg0.aByteArray47;
		this.aByteArray44 = arg0.aByteArray44;
		this.anIntArray317 = arg0.anIntArray317;
		this.anIntArray315 = arg0.anIntArray315;
		this.anIntArrayArray21 = arg0.anIntArrayArray21;
		this.anIntArrayArray22 = arg0.anIntArrayArray22;
		this.aClass106Array1 = arg0.aClass106Array1;
		this.aClass110Array1 = arg0.aClass110Array1;
		this.aClass106Array2 = arg0.aClass106Array2;
		this.aShort17 = arg0.aShort17;
		this.aShort20 = arg0.aShort20;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
	public void method2797() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt3517; local1++) {
			this.anIntArray314[local1] = -this.anIntArray314[local1];
		}
		for (local1 = 0; local1 < this.anInt3521; local1++) {
			@Pc(27) int local27 = this.anIntArray316[local1];
			this.anIntArray316[local1] = this.anIntArray312[local1];
			this.anIntArray312[local1] = local27;
		}
		this.method2814();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(SS)V")
	public void method2798(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray58 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt3521; local5++) {
			if (this.aShortArray58[local5] == arg0) {
				this.aShortArray58[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!le;IS)I")
	private int method2800(@OriginalArg(0) Class25_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray308[arg1];
		@Pc(9) int local9 = arg0.anIntArray307[arg1];
		@Pc(14) int local14 = arg0.anIntArray314[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3517; local16++) {
			if (local4 == this.anIntArray308[local16] && local9 == this.anIntArray307[local16] && local14 == this.anIntArray314[local16]) {
				this.aShortArray53[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray308[this.anInt3517] = local4;
		this.anIntArray307[this.anInt3517] = local9;
		this.anIntArray314[this.anInt3517] = local14;
		this.aShortArray53[this.anInt3517] = arg2;
		if (arg0.anIntArray317 != null) {
			this.anIntArray317[this.anInt3517] = arg0.anIntArray317[arg1];
		}
		return this.anInt3517++;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIBSB)I")
	public int method2802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray316[this.anInt3521] = arg0;
		this.anIntArray313[this.anInt3521] = arg1;
		this.anIntArray312[this.anInt3521] = arg2;
		this.aByteArray40[this.anInt3521] = 1;
		this.aByteArray45[this.anInt3521] = -1;
		this.aShortArray60[this.anInt3521] = arg3;
		this.aShortArray58[this.anInt3521] = -1;
		this.aByteArray43[this.anInt3521] = arg4;
		return this.anInt3521++;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)I")
	public int method2803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3517; local1++) {
			if (this.anIntArray308[local1] == arg0 && this.anIntArray307[local1] == 0 && this.anIntArray314[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray308[this.anInt3517] = arg0;
		this.anIntArray307[this.anInt3517] = 0;
		this.anIntArray314[this.anInt3517] = arg1;
		this.anInt3520 = ++this.anInt3517;
		return this.anInt3517 - 1;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)V")
	public void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static149.anIntArray311[arg2];
			local9 = Static149.anIntArray318[arg2];
			for (local11 = 0; local11 < this.anInt3517; local11++) {
				local31 = this.anIntArray307[local11] * local5 + this.anIntArray308[local11] * local9 >> 16;
				this.anIntArray307[local11] = this.anIntArray307[local11] * local9 - this.anIntArray308[local11] * local5 >> 16;
				this.anIntArray308[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static149.anIntArray311[arg0];
			local9 = Static149.anIntArray318[arg0];
			for (local11 = 0; local11 < this.anInt3517; local11++) {
				local31 = this.anIntArray307[local11] * local9 - this.anIntArray314[local11] * local5 >> 16;
				this.anIntArray314[local11] = this.anIntArray307[local11] * local5 + this.anIntArray314[local11] * local9 >> 16;
				this.anIntArray307[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static149.anIntArray311[arg1];
		local9 = Static149.anIntArray318[arg1];
		for (local11 = 0; local11 < this.anInt3517; local11++) {
			local31 = this.anIntArray314[local11] * local5 + this.anIntArray308[local11] * local9 >> 16;
			this.anIntArray314[local11] = this.anIntArray314[local11] * local9 - this.anIntArray308[local11] * local5 >> 16;
			this.anIntArray308[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Lclient!h;")
	@Override
	public Class25 method4771() {
		return this.method2821(this.aShort17, this.aShort20, -50, -10, -50);
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "()Lclient!le;")
	public Class25_Sub3 method2806() {
		@Pc(3) Class25_Sub3 local3 = new Class25_Sub3();
		if (this.aByteArray40 != null) {
			local3.aByteArray40 = new byte[this.anInt3521];
			for (@Pc(13) int local13 = 0; local13 < this.anInt3521; local13++) {
				local3.aByteArray40[local13] = this.aByteArray40[local13];
			}
		}
		local3.anInt3517 = this.anInt3517;
		local3.anInt3520 = this.anInt3520;
		local3.anInt3521 = this.anInt3521;
		local3.anInt3518 = this.anInt3518;
		local3.anIntArray308 = this.anIntArray308;
		local3.anIntArray307 = this.anIntArray307;
		local3.anIntArray314 = this.anIntArray314;
		local3.anIntArray316 = this.anIntArray316;
		local3.anIntArray313 = this.anIntArray313;
		local3.anIntArray312 = this.anIntArray312;
		local3.aByteArray42 = this.aByteArray42;
		local3.aByteArray43 = this.aByteArray43;
		local3.aByteArray45 = this.aByteArray45;
		local3.aShortArray60 = this.aShortArray60;
		local3.aShortArray58 = this.aShortArray58;
		local3.aByte11 = this.aByte11;
		local3.aByteArray49 = this.aByteArray49;
		local3.aShortArray57 = this.aShortArray57;
		local3.aShortArray59 = this.aShortArray59;
		local3.aShortArray56 = this.aShortArray56;
		local3.aShortArray51 = this.aShortArray51;
		local3.aShortArray54 = this.aShortArray54;
		local3.aShortArray52 = this.aShortArray52;
		local3.aByteArray41 = this.aByteArray41;
		local3.aByteArray46 = this.aByteArray46;
		local3.aByteArray48 = this.aByteArray48;
		local3.aByteArray47 = this.aByteArray47;
		local3.aByteArray44 = this.aByteArray44;
		local3.anIntArray317 = this.anIntArray317;
		local3.anIntArray315 = this.anIntArray315;
		local3.anIntArrayArray21 = this.anIntArrayArray21;
		local3.anIntArrayArray22 = this.anIntArrayArray22;
		local3.aClass106Array1 = this.aClass106Array1;
		local3.aClass110Array1 = this.aClass110Array1;
		local3.aShort17 = this.aShort17;
		local3.aShort20 = this.aShort20;
		return local3;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIJILclient!ll;)V")
	@Override
	public void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class95_Sub1 arg10) {
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "()V")
	public void method2807() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3517; local1++) {
			this.anIntArray308[local1] = -this.anIntArray308[local1];
			this.anIntArray314[local1] = -this.anIntArray314[local1];
		}
		this.method2814();
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "()V")
	public void method2808() {
		this.anIntArray317 = null;
		this.anIntArray315 = null;
		this.anIntArrayArray21 = null;
		this.anIntArrayArray22 = null;
	}

	@OriginalMember(owner = "client!le", name = "h", descriptor = "()V")
	public void method2809() {
		if (this.aClass106Array1 != null) {
			return;
		}
		this.aClass106Array1 = new Class106[this.anInt3520];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt3520; local10++) {
			this.aClass106Array1[local10] = new Class106();
		}
		for (local10 = 0; local10 < this.anInt3521; local10++) {
			@Pc(34) int local34 = this.anIntArray316[local10];
			@Pc(39) int local39 = this.anIntArray313[local10];
			@Pc(44) int local44 = this.anIntArray312[local10];
			@Pc(54) int local54 = this.anIntArray308[local39] - this.anIntArray308[local34];
			@Pc(64) int local64 = this.anIntArray307[local39] - this.anIntArray307[local34];
			@Pc(74) int local74 = this.anIntArray314[local39] - this.anIntArray314[local34];
			@Pc(84) int local84 = this.anIntArray308[local44] - this.anIntArray308[local34];
			@Pc(94) int local94 = this.anIntArray307[local44] - this.anIntArray307[local34];
			@Pc(104) int local104 = this.anIntArray314[local44] - this.anIntArray314[local34];
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
			if (this.aByteArray40 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray40[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class106 local214 = this.aClass106Array1[local34];
				local214.anInt3979 += local112;
				local214.anInt3980 += local120;
				local214.anInt3973 += local128;
				local214.anInt3977++;
				@Pc(243) Class106 local243 = this.aClass106Array1[local39];
				local243.anInt3979 += local112;
				local243.anInt3980 += local120;
				local243.anInt3973 += local128;
				local243.anInt3977++;
				@Pc(272) Class106 local272 = this.aClass106Array1[local44];
				local272.anInt3979 += local112;
				local272.anInt3980 += local120;
				local272.anInt3973 += local128;
				local272.anInt3977++;
			} else if (local201 == 1) {
				if (this.aClass110Array1 == null) {
					this.aClass110Array1 = new Class110[this.anInt3521];
				}
				@Pc(317) Class110 local317 = this.aClass110Array1[local10] = new Class110();
				local317.anInt4081 = local112;
				local317.anInt4082 = local120;
				local317.anInt4083 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIII)Lclient!om;")
	public Class25_Sub2_Sub2 method2810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class25_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()Z")
	@Override
	public boolean method4766() {
		return true;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!le;")
	public Class25_Sub3 method2811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2815();
		@Pc(6) int local6 = arg4 + this.aShort21;
		@Pc(11) int local11 = arg4 + this.aShort14;
		@Pc(16) int local16 = arg6 + this.aShort18;
		@Pc(21) int local21 = arg6 + this.aShort16;
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
		@Pc(147) Class25_Sub3 local147 = new Class25_Sub3();
		local147.anInt3517 = this.anInt3517;
		local147.anInt3520 = this.anInt3520;
		local147.anInt3521 = this.anInt3521;
		local147.anInt3518 = this.anInt3518;
		local147.anIntArray316 = this.anIntArray316;
		local147.anIntArray313 = this.anIntArray313;
		local147.anIntArray312 = this.anIntArray312;
		local147.aByteArray40 = this.aByteArray40;
		local147.aByteArray42 = this.aByteArray42;
		local147.aByteArray43 = this.aByteArray43;
		local147.aByteArray45 = this.aByteArray45;
		local147.aShortArray60 = this.aShortArray60;
		local147.aShortArray58 = this.aShortArray58;
		local147.aByte11 = this.aByte11;
		local147.aByteArray49 = this.aByteArray49;
		local147.aShortArray57 = this.aShortArray57;
		local147.aShortArray59 = this.aShortArray59;
		local147.aShortArray56 = this.aShortArray56;
		local147.aShortArray51 = this.aShortArray51;
		local147.aShortArray54 = this.aShortArray54;
		local147.aShortArray52 = this.aShortArray52;
		local147.aByteArray41 = this.aByteArray41;
		local147.aByteArray46 = this.aByteArray46;
		local147.aByteArray48 = this.aByteArray48;
		local147.aByteArray47 = this.aByteArray47;
		local147.aByteArray44 = this.aByteArray44;
		local147.anIntArray317 = this.anIntArray317;
		local147.anIntArray315 = this.anIntArray315;
		local147.anIntArrayArray21 = this.anIntArrayArray21;
		local147.anIntArrayArray22 = this.anIntArrayArray22;
		local147.aShort17 = this.aShort17;
		local147.aShort20 = this.aShort20;
		local147.aClass106Array1 = this.aClass106Array1;
		local147.aClass110Array1 = this.aClass110Array1;
		local147.aClass106Array2 = this.aClass106Array2;
		if (arg0 == 3) {
			local147.anIntArray308 = Static261.method4462(this.anIntArray308);
			local147.anIntArray307 = Static261.method4462(this.anIntArray307);
			local147.anIntArray314 = Static261.method4462(this.anIntArray314);
		} else {
			local147.anIntArray308 = this.anIntArray308;
			local147.anIntArray307 = new int[local147.anInt3517];
			local147.anIntArray314 = this.anIntArray314;
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
			for (local330 = 0; local330 < local147.anInt3520; local330++) {
				local341 = this.anIntArray308[local330] + arg4;
				local348 = this.anIntArray314[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
				local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
				local424 = local386 * (128 - local356) + local412 * local356 >> 7;
				local147.anIntArray307[local330] = this.anIntArray307[local330] + local424 - arg5;
			}
			for (local330 = local147.anInt3520; local330 < local147.anInt3517; local330++) {
				local341 = this.anIntArray308[local330] + arg4;
				local348 = this.anIntArray314[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				if (local360 >= 0 && local360 < arg2.length - 1 && local364 >= 0 && local364 < arg2[0].length - 1) {
					local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
					local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
					local424 = local386 * (128 - local356) + local412 * local356 >> 7;
					local147.anIntArray307[local330] = this.anIntArray307[local330] + local424 - arg5;
				}
			}
		} else {
			@Pc(681) int local681;
			if (arg0 == 2) {
				for (local330 = 0; local330 < local147.anInt3520; local330++) {
					local341 = (this.anIntArray307[local330] << 16) / this.aShort15;
					if (local341 < arg1) {
						local348 = this.anIntArray308[local330] + arg4;
						local352 = this.anIntArray314[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
						local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray307[local330] = this.anIntArray307[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
					} else {
						local147.anIntArray307[local330] = this.anIntArray307[local330];
					}
				}
				for (local330 = local147.anInt3520; local330 < local147.anInt3517; local330++) {
					local341 = (this.anIntArray307[local330] << 16) / this.aShort15;
					if (local341 < arg1) {
						local348 = this.anIntArray308[local330] + arg4;
						local352 = this.anIntArray314[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						if (local364 >= 0 && local364 < arg2.length - 1 && local386 >= 0 && local386 < arg2[0].length - 1) {
							local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
							local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
							local681 = local412 * (128 - local360) + local424 * local360 >> 7;
							local147.anIntArray307[local330] = this.anIntArray307[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
						}
					} else {
						local147.anIntArray307[local330] = this.anIntArray307[local330];
					}
				}
			} else if (arg0 == 3) {
				local330 = (arg1 & 0xFF) * 4;
				local341 = (arg1 >> 8 & 0xFF) * 4;
				local147.method2818(arg2, arg4, arg5, arg6, local330, local341);
			} else if (arg0 == 4) {
				local330 = this.aShort19 - this.aShort15;
				for (local341 = 0; local341 < this.anInt3520; local341++) {
					local348 = this.anIntArray308[local341] + arg4;
					local352 = this.anIntArray314[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
					local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
					local681 = local412 * (128 - local360) + local424 * local360 >> 7;
					local147.anIntArray307[local341] = this.anIntArray307[local341] + local681 + local330 - arg5;
				}
				for (local341 = local147.anInt3520; local341 < local147.anInt3517; local341++) {
					local348 = this.anIntArray308[local341] + arg4;
					local352 = this.anIntArray314[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					if (local364 >= 0 && local364 < arg3.length - 1 && local386 >= 0 && local386 < arg3[0].length - 1) {
						local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
						local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray307[local341] = this.anIntArray307[local341] + local681 + local330 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local330 = this.aShort19 - this.aShort15;
				@Pc(1314) int local1314;
				@Pc(1318) int local1318;
				for (local341 = 0; local341 < this.anInt3520; local341++) {
					local348 = this.anIntArray308[local341] + arg4;
					local352 = this.anIntArray314[local341] + arg6;
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
					local147.anIntArray307[local341] = ((this.anIntArray307[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
				}
				for (local341 = local147.anInt3520; local341 < local147.anInt3517; local341++) {
					local348 = this.anIntArray308[local341] + arg4;
					local352 = this.anIntArray314[local341] + arg6;
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
						local147.anIntArray307[local341] = ((this.anIntArray307[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
					}
				}
			}
		}
		this.aBoolean176 = false;
		return local147;
	}

	@OriginalMember(owner = "client!le", name = "i", descriptor = "()V")
	public void method2812() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray317 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3517; local9++) {
				local18 = this.anIntArray317[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray21 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray21[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt3517) {
				local18 = this.anIntArray317[local9];
				this.anIntArrayArray21[local18][local5[local18]++] = local9++;
			}
			this.anIntArray317 = null;
		}
		if (this.anIntArray315 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3521; local9++) {
			local18 = this.anIntArray315[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray22 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray22[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt3521) {
			local18 = this.anIntArray315[local9];
			this.anIntArrayArray22[local18][local5[local18]++] = local9++;
		}
		this.anIntArray315 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	private void method2813(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static149.anIntArray311[arg0];
		@Pc(7) int local7 = Static149.anIntArray318[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3517; local9++) {
			@Pc(29) int local29 = this.anIntArray307[local9] * local3 + this.anIntArray308[local9] * local7 >> 16;
			this.anIntArray307[local9] = this.anIntArray307[local9] * local7 - this.anIntArray308[local9] * local3 >> 16;
			this.anIntArray308[local9] = local29;
		}
		this.method2814();
	}

	@OriginalMember(owner = "client!le", name = "j", descriptor = "()V")
	private void method2814() {
		this.aClass106Array1 = null;
		this.aClass106Array2 = null;
		this.aClass110Array1 = null;
		this.aBoolean176 = false;
	}

	@OriginalMember(owner = "client!le", name = "k", descriptor = "()V")
	private void method2815() {
		if (this.aBoolean176) {
			return;
		}
		this.aBoolean176 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3520; local20++) {
			@Pc(29) int local29 = this.anIntArray308[local20];
			@Pc(34) int local34 = this.anIntArray307[local20];
			@Pc(39) int local39 = this.anIntArray314[local20];
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
		this.aShort21 = (short) local8;
		this.aShort14 = (short) local14;
		this.aShort15 = (short) local10;
		this.aShort19 = (short) local16;
		this.aShort18 = (short) local12;
		this.aShort16 = (short) local18;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
	@Override
	public int method4773() {
		if (!this.aBoolean176) {
			this.method2815();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!le", name = "l", descriptor = "()V")
	public void method2816() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3517; local1++) {
			@Pc(10) int local10 = this.anIntArray314[local1];
			this.anIntArray314[local1] = this.anIntArray308[local1];
			this.anIntArray308[local1] = -local10;
		}
		this.method2814();
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(III)V")
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3517; local1++) {
			this.anIntArray308[local1] = this.anIntArray308[local1] * arg0 / 128;
			this.anIntArray307[local1] = this.anIntArray307[local1] * arg1 / 128;
			this.anIntArray314[local1] = this.anIntArray314[local1] * arg2 / 128;
		}
		this.method2814();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([[IIIIII)V")
	private void method2818(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static149.method2804(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static149.method2804(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static149.method2804(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static149.method2804(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method2820(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method2813(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method2823(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!le", name = "m", descriptor = "()V")
	public void method2819() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3517; local1++) {
			@Pc(10) int local10 = this.anIntArray308[local1];
			this.anIntArray308[local1] = this.anIntArray314[local1];
			this.anIntArray314[local1] = -local10;
		}
		this.method2814();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	private void method2820(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static149.anIntArray311[arg0];
		@Pc(7) int local7 = Static149.anIntArray318[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3517; local9++) {
			@Pc(29) int local29 = this.anIntArray307[local9] * local7 - this.anIntArray314[local9] * local3 >> 16;
			this.anIntArray314[local9] = this.anIntArray307[local9] * local3 + this.anIntArray314[local9] * local7 >> 16;
			this.anIntArray307[local9] = local29;
		}
		this.method2814();
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(IIIII)Lclient!lf;")
	public Class25_Sub2 method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static296.aBoolean335) {
			@Pc(9) Class25_Sub2_Sub1 local9 = new Class25_Sub2_Sub1(this, arg0, arg1, true);
			local9.method634();
			return local9;
		} else {
			return new Class25_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!h;IIIZ)V")
	@Override
	public void method4770(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class25_Sub3 local2 = (Class25_Sub3) arg0;
		local2.method2815();
		local2.method2809();
		Static149.anInt3519++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray308;
		@Pc(18) int local18 = local2.anInt3520;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt3520; local20++) {
			@Pc(29) Class106 local29 = this.aClass106Array1[local20];
			if (local29.anInt3977 != 0) {
				@Pc(40) int local40 = this.anIntArray307[local20] - arg2;
				if (local40 >= local2.aShort15 && local40 <= local2.aShort19) {
					@Pc(56) int local56 = this.anIntArray308[local20] - arg1;
					if (local56 >= local2.aShort21 && local56 <= local2.aShort14) {
						@Pc(72) int local72 = this.anIntArray314[local20] - arg3;
						if (local72 >= local2.aShort18 && local72 <= local2.aShort16) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class106 local91 = local2.aClass106Array1[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray314[local83] && local40 == local2.anIntArray307[local83] && local91.anInt3977 != 0) {
									if (this.aClass106Array2 == null) {
										this.aClass106Array2 = new Class106[this.anInt3520];
									}
									if (local2.aClass106Array2 == null) {
										local2.aClass106Array2 = new Class106[local18];
									}
									@Pc(131) Class106 local131 = this.aClass106Array2[local20];
									if (local131 == null) {
										local131 = this.aClass106Array2[local20] = new Class106(local29);
									}
									@Pc(148) Class106 local148 = local2.aClass106Array2[local83];
									if (local148 == null) {
										local148 = local2.aClass106Array2[local83] = new Class106(local91);
									}
									local131.anInt3979 += local91.anInt3979;
									local131.anInt3980 += local91.anInt3980;
									local131.anInt3973 += local91.anInt3973;
									local131.anInt3977 += local91.anInt3977;
									local148.anInt3979 += local29.anInt3979;
									local148.anInt3980 += local29.anInt3980;
									local148.anInt3973 += local29.anInt3973;
									local148.anInt3977 += local29.anInt3977;
									local12++;
									Static149.anIntArray309[local20] = Static149.anInt3519;
									Static149.anIntArray310[local83] = Static149.anInt3519;
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
		for (local20 = 0; local20 < this.anInt3521; local20++) {
			if (Static149.anIntArray309[this.anIntArray316[local20]] == Static149.anInt3519 && Static149.anIntArray309[this.anIntArray313[local20]] == Static149.anInt3519 && Static149.anIntArray309[this.anIntArray312[local20]] == Static149.anInt3519) {
				if (this.aByteArray40 == null) {
					this.aByteArray40 = new byte[this.anInt3521];
				}
				this.aByteArray40[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt3521; local20++) {
			if (Static149.anIntArray310[local2.anIntArray316[local20]] == Static149.anInt3519 && Static149.anIntArray310[local2.anIntArray313[local20]] == Static149.anInt3519 && Static149.anIntArray310[local2.anIntArray312[local20]] == Static149.anInt3519) {
				if (local2.aByteArray40 == null) {
					local2.aByteArray40 = new byte[local2.anInt3521];
				}
				local2.aByteArray40[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([B)V")
	private void method2822(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(arg0);
		@Pc(13) Class1_Sub16 local13 = new Class1_Sub16(arg0);
		@Pc(18) Class1_Sub16 local18 = new Class1_Sub16(arg0);
		@Pc(23) Class1_Sub16 local23 = new Class1_Sub16(arg0);
		@Pc(28) Class1_Sub16 local28 = new Class1_Sub16(arg0);
		local8.anInt3328 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2652();
		@Pc(42) int local42 = local8.method2652();
		@Pc(46) int local46 = local8.method2655();
		@Pc(50) int local50 = local8.method2655();
		@Pc(54) int local54 = local8.method2655();
		@Pc(58) int local58 = local8.method2655();
		@Pc(62) int local62 = local8.method2655();
		@Pc(66) int local66 = local8.method2655();
		@Pc(70) int local70 = local8.method2652();
		@Pc(74) int local74 = local8.method2652();
		@Pc(78) int local78 = local8.method2652();
		@Pc(82) int local82 = local8.method2652();
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
		this.anInt3517 = local38;
		this.anInt3521 = local42;
		this.anInt3518 = local46;
		this.anIntArray308 = new int[local38];
		this.anIntArray307 = new int[local38];
		this.anIntArray314 = new int[local38];
		this.anIntArray316 = new int[local42];
		this.anIntArray313 = new int[local42];
		this.anIntArray312 = new int[local42];
		if (local46 > 0) {
			this.aByteArray49 = new byte[local46];
			this.aShortArray57 = new short[local46];
			this.aShortArray59 = new short[local46];
			this.aShortArray56 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray317 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray40 = new byte[local42];
			this.aByteArray45 = new byte[local42];
			this.aShortArray58 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray42 = new byte[local42];
		} else {
			this.aByte11 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray43 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray315 = new int[local42];
		}
		this.aShortArray60 = new short[local42];
		local8.anInt3328 = 0;
		local13.anInt3328 = local165;
		local18.anInt3328 = local171;
		local23.anInt3328 = local90;
		local28.anInt3328 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method2655();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method2658();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method2658();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method2658();
			}
			this.anIntArray308[local307] = local301 + local316;
			this.anIntArray307[local307] = local303 + local326;
			this.anIntArray314[local307] = local305 + local336;
			local301 = this.anIntArray308[local307];
			local303 = this.anIntArray307[local307];
			local305 = this.anIntArray314[local307];
			if (local66 == 1) {
				this.anIntArray317[local307] = local28.method2655();
			}
		}
		local8.anInt3328 = local149;
		local13.anInt3328 = local116;
		local18.anInt3328 = local98;
		local23.anInt3328 = local134;
		local28.anInt3328 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray60[local307] = (short) local8.method2652();
			if (local50 == 1) {
				local314 = local13.method2655();
				if ((local314 & 0x1) == 1) {
					this.aByteArray40[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray40[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray45[local307] = (byte) (local314 >> 2);
					this.aShortArray58[local307] = this.aShortArray60[local307];
					this.aShortArray60[local307] = 127;
					if (this.aShortArray58[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray45[local307] = -1;
					this.aShortArray58[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray42[local307] = local18.method2633();
			}
			if (local58 == 1) {
				this.aByteArray43[local307] = local23.method2633();
			}
			if (local62 == 1) {
				this.anIntArray315[local307] = local28.method2655();
			}
		}
		this.anInt3520 = -1;
		local8.anInt3328 = local143;
		local13.anInt3328 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method2655();
			if (local548 == 1) {
				local307 = local8.method2658() + local326;
				local314 = local8.method2658() + local307;
				local316 = local8.method2658() + local314;
				local326 = local316;
				this.anIntArray316[local336] = local307;
				this.anIntArray313[local336] = local314;
				this.anIntArray312[local336] = local316;
				if (local307 > this.anInt3520) {
					this.anInt3520 = local307;
				}
				if (local314 > this.anInt3520) {
					this.anInt3520 = local314;
				}
				if (local316 > this.anInt3520) {
					this.anInt3520 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method2658() + local326;
				local326 = local316;
				this.anIntArray316[local336] = local307;
				this.anIntArray313[local336] = local314;
				this.anIntArray312[local336] = local316;
				if (local316 > this.anInt3520) {
					this.anInt3520 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method2658() + local326;
				local326 = local316;
				this.anIntArray316[local336] = local307;
				this.anIntArray313[local336] = local314;
				this.anIntArray312[local336] = local316;
				if (local316 > this.anInt3520) {
					this.anInt3520 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method2658() + local326;
				local326 = local316;
				this.anIntArray316[local336] = local307;
				this.anIntArray313[local336] = local686;
				this.anIntArray312[local336] = local316;
				if (local316 > this.anInt3520) {
					this.anInt3520 = local316;
				}
			}
		}
		this.anInt3520++;
		local8.anInt3328 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray49[local336] = 0;
			this.aShortArray57[local336] = (short) local8.method2652();
			this.aShortArray59[local336] = (short) local8.method2652();
			this.aShortArray56[local336] = (short) local8.method2652();
		}
		if (this.aByteArray45 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray45[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray57[local686] & 0xFFFF) == this.anIntArray316[local548] && (this.aShortArray59[local686] & 0xFFFF) == this.anIntArray313[local548] && (this.aShortArray56[local686] & 0xFFFF) == this.anIntArray312[local548]) {
						this.aByteArray45[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray45 = null;
			}
		}
		if (!local3) {
			this.aShortArray58 = null;
		}
		if (!local1) {
			this.aByteArray40 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(III)V")
	public void method2823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3517; local1++) {
			this.anIntArray308[local1] += arg0;
			this.anIntArray307[local1] += arg1;
			this.anIntArray314[local1] += arg2;
		}
		this.method2814();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "([B)V")
	private void method2824(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub16 local4 = new Class1_Sub16(arg0);
		@Pc(9) Class1_Sub16 local9 = new Class1_Sub16(arg0);
		@Pc(14) Class1_Sub16 local14 = new Class1_Sub16(arg0);
		@Pc(19) Class1_Sub16 local19 = new Class1_Sub16(arg0);
		@Pc(24) Class1_Sub16 local24 = new Class1_Sub16(arg0);
		@Pc(29) Class1_Sub16 local29 = new Class1_Sub16(arg0);
		@Pc(34) Class1_Sub16 local34 = new Class1_Sub16(arg0);
		local4.anInt3328 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2652();
		@Pc(48) int local48 = local4.method2652();
		@Pc(52) int local52 = local4.method2655();
		@Pc(56) int local56 = local4.method2655();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method2655();
		@Pc(82) int local82 = local4.method2655();
		@Pc(86) int local86 = local4.method2655();
		@Pc(90) int local90 = local4.method2655();
		@Pc(94) int local94 = local4.method2655();
		@Pc(98) int local98 = local4.method2652();
		@Pc(102) int local102 = local4.method2652();
		@Pc(106) int local106 = local4.method2652();
		@Pc(110) int local110 = local4.method2652();
		@Pc(114) int local114 = local4.method2652();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray49 = new byte[local52];
			local4.anInt3328 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray49[local131] = local4.method2633();
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
		this.anInt3517 = local44;
		this.anInt3521 = local48;
		this.anInt3518 = local52;
		this.anIntArray308 = new int[local44];
		this.anIntArray307 = new int[local44];
		this.anIntArray314 = new int[local44];
		this.anIntArray316 = new int[local48];
		this.anIntArray313 = new int[local48];
		this.anIntArray312 = new int[local48];
		if (local94 == 1) {
			this.anIntArray317 = new int[local44];
		}
		if (local65) {
			this.aByteArray40 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray42 = new byte[local48];
		} else {
			this.aByte11 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray43 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray315 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray58 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray45 = new byte[local48];
		}
		this.aShortArray60 = new short[local48];
		if (local52 > 0) {
			this.aShortArray57 = new short[local52];
			this.aShortArray59 = new short[local52];
			this.aShortArray56 = new short[local52];
			if (local118 > 0) {
				this.aShortArray51 = new short[local118];
				this.aShortArray54 = new short[local118];
				this.aShortArray52 = new short[local118];
				this.aByteArray41 = new byte[local118];
				this.aByteArray46 = new byte[local118];
				this.aByteArray48 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray47 = new byte[local120];
				this.aByteArray44 = new byte[local120];
			}
		}
		local4.anInt3328 = local52;
		local9.anInt3328 = local250;
		local14.anInt3328 = local256;
		local19.anInt3328 = local262;
		local24.anInt3328 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method2655();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method2658();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method2658();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method2658();
			}
			this.anIntArray308[local479] = local473 + local488;
			this.anIntArray307[local479] = local475 + local498;
			this.anIntArray314[local479] = local477 + local508;
			local473 = this.anIntArray308[local479];
			local475 = this.anIntArray307[local479];
			local477 = this.anIntArray314[local479];
			if (local94 == 1) {
				this.anIntArray317[local479] = local24.method2655();
			}
		}
		local4.anInt3328 = local242;
		local9.anInt3328 = local169;
		local14.anInt3328 = local183;
		local19.anInt3328 = local210;
		local24.anInt3328 = local192;
		local29.anInt3328 = local225;
		local34.anInt3328 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray60[local479] = (short) local4.method2652();
			if (local65) {
				this.aByteArray40[local479] = local9.method2633();
			}
			if (local78 == 255) {
				this.aByteArray42[local479] = local14.method2633();
			}
			if (local82 == 1) {
				this.aByteArray43[local479] = local19.method2633();
			}
			if (local86 == 1) {
				this.anIntArray315[local479] = local24.method2655();
			}
			if (local90 == 1) {
				this.aShortArray58[local479] = (short) (local29.method2652() - 1);
			}
			if (this.aByteArray45 != null) {
				if (this.aShortArray58[local479] == -1) {
					this.aByteArray45[local479] = -1;
				} else {
					this.aByteArray45[local479] = (byte) (local34.method2655() - 1);
				}
			}
		}
		this.anInt3520 = -1;
		local4.anInt3328 = local219;
		local9.anInt3328 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method2655();
			if (local703 == 1) {
				local479 = local4.method2658() + local498;
				local486 = local4.method2658() + local479;
				local488 = local4.method2658() + local486;
				local498 = local488;
				this.anIntArray316[local508] = local479;
				this.anIntArray313[local508] = local486;
				this.anIntArray312[local508] = local488;
				if (local479 > this.anInt3520) {
					this.anInt3520 = local479;
				}
				if (local486 > this.anInt3520) {
					this.anInt3520 = local486;
				}
				if (local488 > this.anInt3520) {
					this.anInt3520 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method2658() + local498;
				local498 = local488;
				this.anIntArray316[local508] = local479;
				this.anIntArray313[local508] = local486;
				this.anIntArray312[local508] = local488;
				if (local488 > this.anInt3520) {
					this.anInt3520 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method2658() + local498;
				local498 = local488;
				this.anIntArray316[local508] = local479;
				this.anIntArray313[local508] = local486;
				this.anIntArray312[local508] = local488;
				if (local488 > this.anInt3520) {
					this.anInt3520 = local488;
				}
			}
			if (local703 == 4) {
				@Pc(841) int local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method2658() + local498;
				local498 = local488;
				this.anIntArray316[local508] = local479;
				this.anIntArray313[local508] = local841;
				this.anIntArray312[local508] = local488;
				if (local488 > this.anInt3520) {
					this.anInt3520 = local488;
				}
			}
		}
		this.anInt3520++;
		local4.anInt3328 = local268;
		local9.anInt3328 = local276;
		local14.anInt3328 = local284;
		local19.anInt3328 = local292;
		local24.anInt3328 = local298;
		local29.anInt3328 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray49[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray57[local508] = (short) local4.method2652();
				this.aShortArray59[local508] = (short) local4.method2652();
				this.aShortArray56[local508] = (short) local4.method2652();
			}
			if (local703 == 1) {
				this.aShortArray57[local508] = (short) local9.method2652();
				this.aShortArray59[local508] = (short) local9.method2652();
				this.aShortArray56[local508] = (short) local9.method2652();
				this.aShortArray51[local508] = (short) local14.method2652();
				this.aShortArray54[local508] = (short) local14.method2652();
				this.aShortArray52[local508] = (short) local14.method2652();
				this.aByteArray41[local508] = local19.method2633();
				this.aByteArray46[local508] = local24.method2633();
				this.aByteArray48[local508] = local29.method2633();
			}
			if (local703 == 2) {
				this.aShortArray57[local508] = (short) local9.method2652();
				this.aShortArray59[local508] = (short) local9.method2652();
				this.aShortArray56[local508] = (short) local9.method2652();
				this.aShortArray51[local508] = (short) local14.method2652();
				this.aShortArray54[local508] = (short) local14.method2652();
				this.aShortArray52[local508] = (short) local14.method2652();
				this.aByteArray41[local508] = local19.method2633();
				this.aByteArray46[local508] = local24.method2633();
				this.aByteArray48[local508] = local29.method2633();
				this.aByteArray47[local508] = local29.method2633();
				this.aByteArray44[local508] = local29.method2633();
			}
			if (local703 == 3) {
				this.aShortArray57[local508] = (short) local9.method2652();
				this.aShortArray59[local508] = (short) local9.method2652();
				this.aShortArray56[local508] = (short) local9.method2652();
				this.aShortArray51[local508] = (short) local14.method2652();
				this.aShortArray54[local508] = (short) local14.method2652();
				this.aShortArray52[local508] = (short) local14.method2652();
				this.aByteArray41[local508] = local19.method2633();
				this.aByteArray46[local508] = local24.method2633();
				this.aByteArray48[local508] = local29.method2633();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt3328 = local131;
		local508 = local4.method2655();
		if (local508 > 0) {
			local4.anInt3328 += local508 * 4;
		}
		local703 = local4.method2655();
		if (local703 > 0) {
			local4.anInt3328 += local703 * 4;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public void method2825() {
		@Pc(3) int local3 = Static149.anIntArray311[256];
		@Pc(7) int local7 = Static149.anIntArray318[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3517; local9++) {
			@Pc(29) int local29 = this.anIntArray314[local9] * local3 + this.anIntArray308[local9] * local7 >> 16;
			this.anIntArray314[local9] = this.anIntArray314[local9] * local7 - this.anIntArray308[local9] * local3 >> 16;
			this.anIntArray308[local9] = local29;
		}
		this.method2814();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(SS)V")
	public void method2826(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3521; local1++) {
			if (this.aShortArray60[local1] == arg0) {
				this.aShortArray60[local1] = arg1;
			}
		}
	}
}
