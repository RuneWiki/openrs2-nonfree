import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class36_Sub7 extends Class36 {

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
	public int anInt5546;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "[I")
	public int[] anIntArray477;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "[I")
	public int[] anIntArray479;

	@OriginalMember(owner = "client!vi", name = "E", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!vi", name = "F", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!vi", name = "J", descriptor = "[I")
	public int[] anIntArray481;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "[I")
	public int[] anIntArray482;

	@OriginalMember(owner = "client!vi", name = "M", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!vi", name = "N", descriptor = "[I")
	public int[] anIntArray483;

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!vi", name = "S", descriptor = "[Lclient!qf;")
	public Class137[] aClass137Array1;

	@OriginalMember(owner = "client!vi", name = "T", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!vi", name = "V", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!vi", name = "X", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!vi", name = "Y", descriptor = "[I")
	public int[] anIntArray486;

	@OriginalMember(owner = "client!vi", name = "ab", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!vi", name = "bb", descriptor = "[Lclient!qf;")
	public Class137[] aClass137Array2;

	@OriginalMember(owner = "client!vi", name = "cb", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!vi", name = "db", descriptor = "[I")
	public int[] anIntArray487;

	@OriginalMember(owner = "client!vi", name = "eb", descriptor = "S")
	public short aShort36;

	@OriginalMember(owner = "client!vi", name = "fb", descriptor = "[Lclient!wj;")
	public Class180[] aClass180Array1;

	@OriginalMember(owner = "client!vi", name = "hb", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!vi", name = "ib", descriptor = "[[I")
	public int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!vi", name = "jb", descriptor = "[I")
	public int[] anIntArray488;

	@OriginalMember(owner = "client!vi", name = "kb", descriptor = "S")
	public short aShort37;

	@OriginalMember(owner = "client!vi", name = "lb", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!vi", name = "mb", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
	public int anInt5545 = 0;

	@OriginalMember(owner = "client!vi", name = "R", descriptor = "B")
	public byte aByte21 = 0;

	@OriginalMember(owner = "client!vi", name = "U", descriptor = "Z")
	private boolean aBoolean467 = false;

	@OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
	public int anInt5547 = 0;

	@OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
	public int anInt5548 = 0;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	private Class36_Sub7() {
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
	public Class36_Sub7(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4186(arg0);
		} else {
			this.method4205(arg0);
		}
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(III)V")
	public Class36_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray486 = new int[arg0];
		this.anIntArray483 = new int[arg0];
		this.anIntArray482 = new int[arg0];
		this.anIntArray481 = new int[arg0];
		this.anIntArray479 = new int[arg1];
		this.anIntArray488 = new int[arg1];
		this.anIntArray477 = new int[arg1];
		this.aByteArray64 = new byte[arg1];
		this.aByteArray69 = new byte[arg1];
		this.aByteArray71 = new byte[arg1];
		this.aShortArray75 = new short[arg1];
		this.aShortArray78 = new short[arg1];
		this.aByteArray72 = new byte[arg1];
		this.anIntArray487 = new int[arg1];
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([Lclient!vi;I)V")
	public Class36_Sub7(@OriginalArg(0) Class36_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt5548 = 0;
		this.anInt5547 = 0;
		this.anInt5546 = 0;
		this.aByte21 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class36_Sub7 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt5548 += local53.anInt5548;
				this.anInt5547 += local53.anInt5547;
				this.anInt5546 += local53.anInt5546;
				if (local53.aByteArray69 == null) {
					if (this.aByte21 == -1) {
						this.aByte21 = local53.aByte21;
					}
					if (this.aByte21 != local53.aByte21) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray64 != null;
				local22 |= local53.aByteArray71 != null;
				local24 |= local53.anIntArray487 != null;
				local26 |= local53.aShortArray78 != null;
				local28 |= local53.aByteArray72 != null;
			}
		}
		this.anIntArray486 = new int[this.anInt5548];
		this.anIntArray483 = new int[this.anInt5548];
		this.anIntArray482 = new int[this.anInt5548];
		this.anIntArray481 = new int[this.anInt5548];
		this.aShortArray76 = new short[this.anInt5548];
		this.anIntArray479 = new int[this.anInt5547];
		this.anIntArray488 = new int[this.anInt5547];
		this.anIntArray477 = new int[this.anInt5547];
		if (local18) {
			this.aByteArray64 = new byte[this.anInt5547];
		}
		if (local20) {
			this.aByteArray69 = new byte[this.anInt5547];
		}
		if (local22) {
			this.aByteArray71 = new byte[this.anInt5547];
		}
		if (local24) {
			this.anIntArray487 = new int[this.anInt5547];
		}
		if (local26) {
			this.aShortArray78 = new short[this.anInt5547];
		}
		if (local28) {
			this.aByteArray72 = new byte[this.anInt5547];
		}
		this.aShortArray75 = new short[this.anInt5547];
		this.aShortArray74 = new short[this.anInt5547];
		if (this.anInt5546 > 0) {
			this.aByteArray67 = new byte[this.anInt5546];
			this.aShortArray72 = new short[this.anInt5546];
			this.aShortArray77 = new short[this.anInt5546];
			this.aShortArray79 = new short[this.anInt5546];
			this.aShortArray71 = new short[this.anInt5546];
			this.aShortArray80 = new short[this.anInt5546];
			this.aShortArray73 = new short[this.anInt5546];
			this.aByteArray68 = new byte[this.anInt5546];
			this.aByteArray65 = new byte[this.anInt5546];
			this.aByteArray70 = new byte[this.anInt5546];
			this.aByteArray73 = new byte[this.anInt5546];
			this.aByteArray66 = new byte[this.anInt5546];
		}
		this.anInt5548 = 0;
		this.anInt5547 = 0;
		this.anInt5546 = 0;
		@Pc(330) Class36_Sub7 local330;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(326) short local326 = (short) (0x1 << local46);
			local330 = arg0[local46];
			if (local330 != null) {
				for (@Pc(334) int local334 = 0; local334 < local330.anInt5547; local334++) {
					if (local18 && local330.aByteArray64 != null) {
						this.aByteArray64[this.anInt5547] = local330.aByteArray64[local334];
					}
					if (local20) {
						if (local330.aByteArray69 == null) {
							this.aByteArray69[this.anInt5547] = local330.aByte21;
						} else {
							this.aByteArray69[this.anInt5547] = local330.aByteArray69[local334];
						}
					}
					if (local22 && local330.aByteArray71 != null) {
						this.aByteArray71[this.anInt5547] = local330.aByteArray71[local334];
					}
					if (local24 && local330.anIntArray487 != null) {
						this.anIntArray487[this.anInt5547] = local330.anIntArray487[local334];
					}
					if (local26) {
						if (local330.aShortArray78 == null) {
							this.aShortArray78[this.anInt5547] = -1;
						} else {
							this.aShortArray78[this.anInt5547] = local330.aShortArray78[local334];
						}
					}
					this.aShortArray75[this.anInt5547] = local330.aShortArray75[local334];
					this.aShortArray74[this.anInt5547] = local326;
					this.anIntArray479[this.anInt5547] = this.method4184(local330, local330.anIntArray479[local334], local326);
					this.anIntArray488[this.anInt5547] = this.method4184(local330, local330.anIntArray488[local334], local326);
					this.anIntArray477[this.anInt5547] = this.method4184(local330, local330.anIntArray477[local334], local326);
					this.anInt5547++;
				}
			}
		}
		local46 = 0;
		this.anInt5545 = this.anInt5548;
		for (@Pc(495) int local495 = 0; local495 < arg1; local495++) {
			local330 = arg0[local495];
			@Pc(507) short local507 = (short) (0x1 << local495);
			if (local330 != null) {
				@Pc(511) int local511;
				for (local511 = 0; local511 < local330.anInt5547; local511++) {
					if (local28) {
						this.aByteArray72[local46++] = (byte) (local330.aByteArray72 == null || local330.aByteArray72[local511] == -1 ? -1 : local330.aByteArray72[local511] + this.anInt5546);
					}
				}
				for (local511 = 0; local511 < local330.anInt5546; local511++) {
					@Pc(560) byte local560 = this.aByteArray67[this.anInt5546] = local330.aByteArray67[local511];
					if (local560 == 0) {
						this.aShortArray72[this.anInt5546] = (short) this.method4184(local330, local330.aShortArray72[local511], local507);
						this.aShortArray77[this.anInt5546] = (short) this.method4184(local330, local330.aShortArray77[local511], local507);
						this.aShortArray79[this.anInt5546] = (short) this.method4184(local330, local330.aShortArray79[local511], local507);
					}
					if (local560 >= 1 && local560 <= 3) {
						this.aShortArray72[this.anInt5546] = local330.aShortArray72[local511];
						this.aShortArray77[this.anInt5546] = local330.aShortArray77[local511];
						this.aShortArray79[this.anInt5546] = local330.aShortArray79[local511];
						this.aShortArray71[this.anInt5546] = local330.aShortArray71[local511];
						this.aShortArray80[this.anInt5546] = local330.aShortArray80[local511];
						this.aShortArray73[this.anInt5546] = local330.aShortArray73[local511];
						this.aByteArray68[this.anInt5546] = local330.aByteArray68[local511];
						this.aByteArray65[this.anInt5546] = local330.aByteArray65[local511];
						this.aByteArray70[this.anInt5546] = local330.aByteArray70[local511];
					}
					if (local560 == 2) {
						this.aByteArray73[this.anInt5546] = local330.aByteArray73[local511];
						this.aByteArray66[this.anInt5546] = local330.aByteArray66[local511];
					}
					this.anInt5546++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!vi;ZZZZ)V")
	public Class36_Sub7(@OriginalArg(0) Class36_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5548 = arg0.anInt5548;
		this.anInt5545 = arg0.anInt5545;
		this.anInt5547 = arg0.anInt5547;
		this.anInt5546 = arg0.anInt5546;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray486 = arg0.anIntArray486;
			this.anIntArray483 = arg0.anIntArray483;
			this.anIntArray482 = arg0.anIntArray482;
		} else {
			this.anIntArray486 = new int[this.anInt5548];
			this.anIntArray483 = new int[this.anInt5548];
			this.anIntArray482 = new int[this.anInt5548];
			for (local64 = 0; local64 < this.anInt5548; local64++) {
				this.anIntArray486[local64] = arg0.anIntArray486[local64];
				this.anIntArray483[local64] = arg0.anIntArray483[local64];
				this.anIntArray482[local64] = arg0.anIntArray482[local64];
			}
		}
		if (arg2) {
			this.aShortArray75 = arg0.aShortArray75;
		} else {
			this.aShortArray75 = new short[this.anInt5547];
			for (local64 = 0; local64 < this.anInt5547; local64++) {
				this.aShortArray75[local64] = arg0.aShortArray75[local64];
			}
		}
		if (arg3 || arg0.aShortArray78 == null) {
			this.aShortArray78 = arg0.aShortArray78;
		} else {
			this.aShortArray78 = new short[this.anInt5547];
			for (local64 = 0; local64 < this.anInt5547; local64++) {
				this.aShortArray78[local64] = arg0.aShortArray78[local64];
			}
		}
		this.aByteArray71 = arg0.aByteArray71;
		this.anIntArray479 = arg0.anIntArray479;
		this.anIntArray488 = arg0.anIntArray488;
		this.anIntArray477 = arg0.anIntArray477;
		this.aByteArray64 = arg0.aByteArray64;
		this.aByteArray69 = arg0.aByteArray69;
		this.aByteArray72 = arg0.aByteArray72;
		this.aByte21 = arg0.aByte21;
		this.aByteArray67 = arg0.aByteArray67;
		this.aShortArray72 = arg0.aShortArray72;
		this.aShortArray77 = arg0.aShortArray77;
		this.aShortArray79 = arg0.aShortArray79;
		this.aShortArray71 = arg0.aShortArray71;
		this.aShortArray80 = arg0.aShortArray80;
		this.aShortArray73 = arg0.aShortArray73;
		this.aByteArray68 = arg0.aByteArray68;
		this.aByteArray65 = arg0.aByteArray65;
		this.aByteArray70 = arg0.aByteArray70;
		this.aByteArray73 = arg0.aByteArray73;
		this.aByteArray66 = arg0.aByteArray66;
		this.anIntArray481 = arg0.anIntArray481;
		this.anIntArray487 = arg0.anIntArray487;
		this.anIntArrayArray42 = arg0.anIntArrayArray42;
		this.anIntArrayArray43 = arg0.anIntArrayArray43;
		this.aClass137Array2 = arg0.aClass137Array2;
		this.aClass180Array1 = arg0.aClass180Array1;
		this.aClass137Array1 = arg0.aClass137Array1;
		this.aShort37 = arg0.aShort37;
		this.aShort36 = arg0.aShort36;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!eh;IIIZ)V")
	@Override
	public void method4179(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class36_Sub7 local2 = (Class36_Sub7) arg0;
		local2.method4203();
		local2.method4207();
		Static281.anInt5549++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray486;
		@Pc(18) int local18 = local2.anInt5545;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt5545; local20++) {
			@Pc(29) Class137 local29 = this.aClass137Array2[local20];
			if (local29.anInt4383 != 0) {
				@Pc(40) int local40 = this.anIntArray483[local20] - arg2;
				if (local40 >= local2.aShort35 && local40 <= local2.aShort30) {
					@Pc(56) int local56 = this.anIntArray486[local20] - arg1;
					if (local56 >= local2.aShort31 && local56 <= local2.aShort34) {
						@Pc(72) int local72 = this.anIntArray482[local20] - arg3;
						if (local72 >= local2.aShort32 && local72 <= local2.aShort33) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class137 local91 = local2.aClass137Array2[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray482[local83] && local40 == local2.anIntArray483[local83] && local91.anInt4383 != 0) {
									if (this.aClass137Array1 == null) {
										this.aClass137Array1 = new Class137[this.anInt5545];
									}
									if (local2.aClass137Array1 == null) {
										local2.aClass137Array1 = new Class137[local18];
									}
									@Pc(131) Class137 local131 = this.aClass137Array1[local20];
									if (local131 == null) {
										local131 = this.aClass137Array1[local20] = new Class137(local29);
									}
									@Pc(148) Class137 local148 = local2.aClass137Array1[local83];
									if (local148 == null) {
										local148 = local2.aClass137Array1[local83] = new Class137(local91);
									}
									local131.anInt4382 += local91.anInt4382;
									local131.anInt4384 += local91.anInt4384;
									local131.anInt4385 += local91.anInt4385;
									local131.anInt4383 += local91.anInt4383;
									local148.anInt4382 += local29.anInt4382;
									local148.anInt4384 += local29.anInt4384;
									local148.anInt4385 += local29.anInt4385;
									local148.anInt4383 += local29.anInt4383;
									local12++;
									Static281.anIntArray485[local20] = Static281.anInt5549;
									Static281.anIntArray484[local83] = Static281.anInt5549;
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
		for (local20 = 0; local20 < this.anInt5547; local20++) {
			if (Static281.anIntArray485[this.anIntArray479[local20]] == Static281.anInt5549 && Static281.anIntArray485[this.anIntArray488[local20]] == Static281.anInt5549 && Static281.anIntArray485[this.anIntArray477[local20]] == Static281.anInt5549) {
				if (this.aByteArray64 == null) {
					this.aByteArray64 = new byte[this.anInt5547];
				}
				this.aByteArray64[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt5547; local20++) {
			if (Static281.anIntArray484[local2.anIntArray479[local20]] == Static281.anInt5549 && Static281.anIntArray484[local2.anIntArray488[local20]] == Static281.anInt5549 && Static281.anIntArray484[local2.anIntArray477[local20]] == Static281.anInt5549) {
				if (local2.aByteArray64 == null) {
					local2.aByteArray64 = new byte[local2.anInt5547];
				}
				local2.aByteArray64[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "()V")
	public void method4181() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5548; local1++) {
			this.anIntArray486[local1] = -this.anIntArray486[local1];
			this.anIntArray482[local1] = -this.anIntArray482[local1];
		}
		this.method4187();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!vi;")
	public Class36_Sub7 method4182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4203();
		@Pc(6) int local6 = arg4 + this.aShort31;
		@Pc(11) int local11 = arg4 + this.aShort34;
		@Pc(16) int local16 = arg6 + this.aShort32;
		@Pc(21) int local21 = arg6 + this.aShort33;
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
		@Pc(147) Class36_Sub7 local147 = new Class36_Sub7();
		local147.anInt5548 = this.anInt5548;
		local147.anInt5545 = this.anInt5545;
		local147.anInt5547 = this.anInt5547;
		local147.anInt5546 = this.anInt5546;
		local147.anIntArray479 = this.anIntArray479;
		local147.anIntArray488 = this.anIntArray488;
		local147.anIntArray477 = this.anIntArray477;
		local147.aByteArray64 = this.aByteArray64;
		local147.aByteArray69 = this.aByteArray69;
		local147.aByteArray71 = this.aByteArray71;
		local147.aByteArray72 = this.aByteArray72;
		local147.aShortArray75 = this.aShortArray75;
		local147.aShortArray78 = this.aShortArray78;
		local147.aByte21 = this.aByte21;
		local147.aByteArray67 = this.aByteArray67;
		local147.aShortArray72 = this.aShortArray72;
		local147.aShortArray77 = this.aShortArray77;
		local147.aShortArray79 = this.aShortArray79;
		local147.aShortArray71 = this.aShortArray71;
		local147.aShortArray80 = this.aShortArray80;
		local147.aShortArray73 = this.aShortArray73;
		local147.aByteArray68 = this.aByteArray68;
		local147.aByteArray65 = this.aByteArray65;
		local147.aByteArray70 = this.aByteArray70;
		local147.aByteArray73 = this.aByteArray73;
		local147.aByteArray66 = this.aByteArray66;
		local147.anIntArray481 = this.anIntArray481;
		local147.anIntArray487 = this.anIntArray487;
		local147.anIntArrayArray42 = this.anIntArrayArray42;
		local147.anIntArrayArray43 = this.anIntArrayArray43;
		local147.aShort37 = this.aShort37;
		local147.aShort36 = this.aShort36;
		local147.aClass137Array2 = this.aClass137Array2;
		local147.aClass180Array1 = this.aClass180Array1;
		local147.aClass137Array1 = this.aClass137Array1;
		if (arg0 == 3) {
			local147.anIntArray486 = Static98.method1570(this.anIntArray486);
			local147.anIntArray483 = Static98.method1570(this.anIntArray483);
			local147.anIntArray482 = Static98.method1570(this.anIntArray482);
		} else {
			local147.anIntArray486 = this.anIntArray486;
			local147.anIntArray483 = new int[local147.anInt5548];
			local147.anIntArray482 = this.anIntArray482;
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
			for (local330 = 0; local330 < local147.anInt5545; local330++) {
				local341 = this.anIntArray486[local330] + arg4;
				local348 = this.anIntArray482[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
				local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
				local424 = local386 * (128 - local356) + local412 * local356 >> 7;
				local147.anIntArray483[local330] = this.anIntArray483[local330] + local424 - arg5;
			}
			for (local330 = local147.anInt5545; local330 < local147.anInt5548; local330++) {
				local341 = this.anIntArray486[local330] + arg4;
				local348 = this.anIntArray482[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				if (local360 >= 0 && local360 < arg2.length - 1 && local364 >= 0 && local364 < arg2[0].length - 1) {
					local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
					local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
					local424 = local386 * (128 - local356) + local412 * local356 >> 7;
					local147.anIntArray483[local330] = this.anIntArray483[local330] + local424 - arg5;
				}
			}
		} else {
			@Pc(681) int local681;
			if (arg0 == 2) {
				for (local330 = 0; local330 < local147.anInt5545; local330++) {
					local341 = (this.anIntArray483[local330] << 16) / this.aShort35;
					if (local341 < arg1) {
						local348 = this.anIntArray486[local330] + arg4;
						local352 = this.anIntArray482[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
						local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray483[local330] = this.anIntArray483[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
					} else {
						local147.anIntArray483[local330] = this.anIntArray483[local330];
					}
				}
				for (local330 = local147.anInt5545; local330 < local147.anInt5548; local330++) {
					local341 = (this.anIntArray483[local330] << 16) / this.aShort35;
					if (local341 < arg1) {
						local348 = this.anIntArray486[local330] + arg4;
						local352 = this.anIntArray482[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						if (local364 >= 0 && local364 < arg2.length - 1 && local386 >= 0 && local386 < arg2[0].length - 1) {
							local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
							local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
							local681 = local412 * (128 - local360) + local424 * local360 >> 7;
							local147.anIntArray483[local330] = this.anIntArray483[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
						}
					} else {
						local147.anIntArray483[local330] = this.anIntArray483[local330];
					}
				}
			} else if (arg0 == 3) {
				local330 = (arg1 & 0xFF) * 4;
				local341 = (arg1 >> 8 & 0xFF) * 4;
				local147.method4191(arg2, arg4, arg5, arg6, local330, local341);
			} else if (arg0 == 4) {
				local330 = this.aShort30 - this.aShort35;
				for (local341 = 0; local341 < this.anInt5545; local341++) {
					local348 = this.anIntArray486[local341] + arg4;
					local352 = this.anIntArray482[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
					local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
					local681 = local412 * (128 - local360) + local424 * local360 >> 7;
					local147.anIntArray483[local341] = this.anIntArray483[local341] + local681 + local330 - arg5;
				}
				for (local341 = local147.anInt5545; local341 < local147.anInt5548; local341++) {
					local348 = this.anIntArray486[local341] + arg4;
					local352 = this.anIntArray482[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					if (local364 >= 0 && local364 < arg3.length - 1 && local386 >= 0 && local386 < arg3[0].length - 1) {
						local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
						local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray483[local341] = this.anIntArray483[local341] + local681 + local330 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local330 = this.aShort30 - this.aShort35;
				@Pc(1314) int local1314;
				@Pc(1318) int local1318;
				for (local341 = 0; local341 < this.anInt5545; local341++) {
					local348 = this.anIntArray486[local341] + arg4;
					local352 = this.anIntArray482[local341] + arg6;
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
					local147.anIntArray483[local341] = ((this.anIntArray483[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
				}
				for (local341 = local147.anInt5545; local341 < local147.anInt5548; local341++) {
					local348 = this.anIntArray486[local341] + arg4;
					local352 = this.anIntArray482[local341] + arg6;
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
						local147.anIntArray483[local341] = ((this.anIntArray483[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
					}
				}
			}
		}
		this.aBoolean467 = false;
		return local147;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(SS)V")
	public void method4183(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray78 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt5547; local5++) {
			if (this.aShortArray78[local5] == arg0) {
				this.aShortArray78[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!vi;IS)I")
	private int method4184(@OriginalArg(0) Class36_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray486[arg1];
		@Pc(9) int local9 = arg0.anIntArray483[arg1];
		@Pc(14) int local14 = arg0.anIntArray482[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5548; local16++) {
			if (local4 == this.anIntArray486[local16] && local9 == this.anIntArray483[local16] && local14 == this.anIntArray482[local16]) {
				this.aShortArray76[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray486[this.anInt5548] = local4;
		this.anIntArray483[this.anInt5548] = local9;
		this.anIntArray482[this.anInt5548] = local14;
		this.aShortArray76[this.anInt5548] = arg2;
		if (arg0.anIntArray481 != null) {
			this.anIntArray481[this.anInt5548] = arg0.anIntArray481[arg1];
		}
		return this.anInt5548++;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "()V")
	public void method4185() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5548; local1++) {
			@Pc(10) int local10 = this.anIntArray486[local1];
			this.anIntArray486[local1] = this.anIntArray482[local1];
			this.anIntArray482[local1] = -local10;
		}
		this.method4187();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([B)V")
	private void method4186(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class8_Sub2 local4 = new Class8_Sub2(arg0);
		@Pc(9) Class8_Sub2 local9 = new Class8_Sub2(arg0);
		@Pc(14) Class8_Sub2 local14 = new Class8_Sub2(arg0);
		@Pc(19) Class8_Sub2 local19 = new Class8_Sub2(arg0);
		@Pc(24) Class8_Sub2 local24 = new Class8_Sub2(arg0);
		@Pc(29) Class8_Sub2 local29 = new Class8_Sub2(arg0);
		@Pc(34) Class8_Sub2 local34 = new Class8_Sub2(arg0);
		local4.anInt2955 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2375();
		@Pc(48) int local48 = local4.method2375();
		@Pc(52) int local52 = local4.method2334();
		@Pc(56) int local56 = local4.method2334();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method2334();
		@Pc(82) int local82 = local4.method2334();
		@Pc(86) int local86 = local4.method2334();
		@Pc(90) int local90 = local4.method2334();
		@Pc(94) int local94 = local4.method2334();
		@Pc(98) int local98 = local4.method2375();
		@Pc(102) int local102 = local4.method2375();
		@Pc(106) int local106 = local4.method2375();
		@Pc(110) int local110 = local4.method2375();
		@Pc(114) int local114 = local4.method2375();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray67 = new byte[local52];
			local4.anInt2955 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray67[local131] = local4.method2374();
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
		this.anInt5548 = local44;
		this.anInt5547 = local48;
		this.anInt5546 = local52;
		this.anIntArray486 = new int[local44];
		this.anIntArray483 = new int[local44];
		this.anIntArray482 = new int[local44];
		this.anIntArray479 = new int[local48];
		this.anIntArray488 = new int[local48];
		this.anIntArray477 = new int[local48];
		if (local94 == 1) {
			this.anIntArray481 = new int[local44];
		}
		if (local65) {
			this.aByteArray64 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray69 = new byte[local48];
		} else {
			this.aByte21 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray71 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray487 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray78 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray72 = new byte[local48];
		}
		this.aShortArray75 = new short[local48];
		if (local52 > 0) {
			this.aShortArray72 = new short[local52];
			this.aShortArray77 = new short[local52];
			this.aShortArray79 = new short[local52];
			if (local118 > 0) {
				this.aShortArray71 = new short[local118];
				this.aShortArray80 = new short[local118];
				this.aShortArray73 = new short[local118];
				this.aByteArray68 = new byte[local118];
				this.aByteArray65 = new byte[local118];
				this.aByteArray70 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray73 = new byte[local120];
				this.aByteArray66 = new byte[local120];
			}
		}
		local4.anInt2955 = local52;
		local9.anInt2955 = local250;
		local14.anInt2955 = local256;
		local19.anInt2955 = local262;
		local24.anInt2955 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method2334();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method2325();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method2325();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method2325();
			}
			this.anIntArray486[local479] = local473 + local488;
			this.anIntArray483[local479] = local475 + local498;
			this.anIntArray482[local479] = local477 + local508;
			local473 = this.anIntArray486[local479];
			local475 = this.anIntArray483[local479];
			local477 = this.anIntArray482[local479];
			if (local94 == 1) {
				this.anIntArray481[local479] = local24.method2334();
			}
		}
		local4.anInt2955 = local242;
		local9.anInt2955 = local169;
		local14.anInt2955 = local183;
		local19.anInt2955 = local210;
		local24.anInt2955 = local192;
		local29.anInt2955 = local225;
		local34.anInt2955 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray75[local479] = (short) local4.method2375();
			if (local65) {
				this.aByteArray64[local479] = local9.method2374();
			}
			if (local78 == 255) {
				this.aByteArray69[local479] = local14.method2374();
			}
			if (local82 == 1) {
				this.aByteArray71[local479] = local19.method2374();
			}
			if (local86 == 1) {
				this.anIntArray487[local479] = local24.method2334();
			}
			if (local90 == 1) {
				this.aShortArray78[local479] = (short) (local29.method2375() - 1);
			}
			if (this.aByteArray72 != null) {
				if (this.aShortArray78[local479] == -1) {
					this.aByteArray72[local479] = -1;
				} else {
					this.aByteArray72[local479] = (byte) (local34.method2334() - 1);
				}
			}
		}
		this.anInt5545 = -1;
		local4.anInt2955 = local219;
		local9.anInt2955 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method2334();
			if (local703 == 1) {
				local479 = local4.method2325() + local498;
				local486 = local4.method2325() + local479;
				local488 = local4.method2325() + local486;
				local498 = local488;
				this.anIntArray479[local508] = local479;
				this.anIntArray488[local508] = local486;
				this.anIntArray477[local508] = local488;
				if (local479 > this.anInt5545) {
					this.anInt5545 = local479;
				}
				if (local486 > this.anInt5545) {
					this.anInt5545 = local486;
				}
				if (local488 > this.anInt5545) {
					this.anInt5545 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method2325() + local498;
				local498 = local488;
				this.anIntArray479[local508] = local479;
				this.anIntArray488[local508] = local486;
				this.anIntArray477[local508] = local488;
				if (local488 > this.anInt5545) {
					this.anInt5545 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method2325() + local498;
				local498 = local488;
				this.anIntArray479[local508] = local479;
				this.anIntArray488[local508] = local486;
				this.anIntArray477[local508] = local488;
				if (local488 > this.anInt5545) {
					this.anInt5545 = local488;
				}
			}
			if (local703 == 4) {
				@Pc(841) int local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method2325() + local498;
				local498 = local488;
				this.anIntArray479[local508] = local479;
				this.anIntArray488[local508] = local841;
				this.anIntArray477[local508] = local488;
				if (local488 > this.anInt5545) {
					this.anInt5545 = local488;
				}
			}
		}
		this.anInt5545++;
		local4.anInt2955 = local268;
		local9.anInt2955 = local276;
		local14.anInt2955 = local284;
		local19.anInt2955 = local292;
		local24.anInt2955 = local298;
		local29.anInt2955 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray67[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray72[local508] = (short) local4.method2375();
				this.aShortArray77[local508] = (short) local4.method2375();
				this.aShortArray79[local508] = (short) local4.method2375();
			}
			if (local703 == 1) {
				this.aShortArray72[local508] = (short) local9.method2375();
				this.aShortArray77[local508] = (short) local9.method2375();
				this.aShortArray79[local508] = (short) local9.method2375();
				this.aShortArray71[local508] = (short) local14.method2375();
				this.aShortArray80[local508] = (short) local14.method2375();
				this.aShortArray73[local508] = (short) local14.method2375();
				this.aByteArray68[local508] = local19.method2374();
				this.aByteArray65[local508] = local24.method2374();
				this.aByteArray70[local508] = local29.method2374();
			}
			if (local703 == 2) {
				this.aShortArray72[local508] = (short) local9.method2375();
				this.aShortArray77[local508] = (short) local9.method2375();
				this.aShortArray79[local508] = (short) local9.method2375();
				this.aShortArray71[local508] = (short) local14.method2375();
				this.aShortArray80[local508] = (short) local14.method2375();
				this.aShortArray73[local508] = (short) local14.method2375();
				this.aByteArray68[local508] = local19.method2374();
				this.aByteArray65[local508] = local24.method2374();
				this.aByteArray70[local508] = local29.method2374();
				this.aByteArray73[local508] = local29.method2374();
				this.aByteArray66[local508] = local29.method2374();
			}
			if (local703 == 3) {
				this.aShortArray72[local508] = (short) local9.method2375();
				this.aShortArray77[local508] = (short) local9.method2375();
				this.aShortArray79[local508] = (short) local9.method2375();
				this.aShortArray71[local508] = (short) local14.method2375();
				this.aShortArray80[local508] = (short) local14.method2375();
				this.aShortArray73[local508] = (short) local14.method2375();
				this.aByteArray68[local508] = local19.method2374();
				this.aByteArray65[local508] = local24.method2374();
				this.aByteArray70[local508] = local29.method2374();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt2955 = local131;
		local508 = local4.method2334();
		if (local508 > 0) {
			local4.anInt2955 += local508 * 4;
		}
		local703 = local4.method2334();
		if (local703 > 0) {
			local4.anInt2955 += local703 * 4;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "()V")
	private void method4187() {
		this.aClass137Array2 = null;
		this.aClass137Array1 = null;
		this.aClass180Array1 = null;
		this.aBoolean467 = false;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	private void method4188(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static281.anIntArray480[arg0];
		@Pc(7) int local7 = Static281.anIntArray478[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5548; local9++) {
			@Pc(29) int local29 = this.anIntArray483[local9] * local3 + this.anIntArray486[local9] * local7 >> 16;
			this.anIntArray483[local9] = this.anIntArray483[local9] * local7 - this.anIntArray486[local9] * local3 >> 16;
			this.anIntArray486[local9] = local29;
		}
		this.method4187();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Lclient!eh;")
	@Override
	public Class36 method4178() {
		return this.method4193(this.aShort37, this.aShort36, -50, -10, -50);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()Z")
	@Override
	public boolean method4174() {
		return true;
	}

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "()V")
	public void method4189() {
		this.anIntArray481 = null;
		this.anIntArray487 = null;
		this.anIntArrayArray42 = null;
		this.anIntArrayArray43 = null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIIJILclient!rb;)V")
	@Override
	public void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class105_Sub1 arg10) {
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	private void method4190(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static281.anIntArray480[arg0];
		@Pc(7) int local7 = Static281.anIntArray478[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5548; local9++) {
			@Pc(29) int local29 = this.anIntArray483[local9] * local7 - this.anIntArray482[local9] * local3 >> 16;
			this.anIntArray482[local9] = this.anIntArray483[local9] * local3 + this.anIntArray482[local9] * local7 >> 16;
			this.anIntArray483[local9] = local29;
		}
		this.method4187();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([[IIIIII)V")
	private void method4191(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static281.method4210(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static281.method4210(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static281.method4210(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static281.method4210(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method4190(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method4188(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method4197(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)I")
	public int method4192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5548; local1++) {
			if (this.anIntArray486[local1] == arg0 && this.anIntArray483[local1] == 0 && this.anIntArray482[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray486[this.anInt5548] = arg0;
		this.anIntArray483[this.anInt5548] = 0;
		this.anIntArray482[this.anInt5548] = arg1;
		this.anInt5545 = ++this.anInt5548;
		return this.anInt5548 - 1;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IIIII)Lclient!ie;")
	public Class36_Sub2 method4193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static116.aBoolean188) {
			@Pc(9) Class36_Sub2_Sub1 local9 = new Class36_Sub2_Sub1(this, arg0, arg1, true);
			local9.method3260();
			return local9;
		} else {
			return new Class36_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIBSB)I")
	public int method4194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray479[this.anInt5547] = arg0;
		this.anIntArray488[this.anInt5547] = arg1;
		this.anIntArray477[this.anInt5547] = arg2;
		this.aByteArray64[this.anInt5547] = 1;
		this.aByteArray72[this.anInt5547] = -1;
		this.aShortArray75[this.anInt5547] = arg3;
		this.aShortArray78[this.anInt5547] = -1;
		this.aByteArray71[this.anInt5547] = arg4;
		return this.anInt5547++;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(III)V")
	public void method4196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5548; local1++) {
			this.anIntArray486[local1] = this.anIntArray486[local1] * arg0 / 128;
			this.anIntArray483[local1] = this.anIntArray483[local1] * arg1 / 128;
			this.anIntArray482[local1] = this.anIntArray482[local1] * arg2 / 128;
		}
		this.method4187();
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(III)V")
	public void method4197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5548; local1++) {
			this.anIntArray486[local1] += arg0;
			this.anIntArray483[local1] += arg1;
			this.anIntArray482[local1] += arg2;
		}
		this.method4187();
	}

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "()V")
	public void method4198() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray481 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt5548; local9++) {
				local18 = this.anIntArray481[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray42 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray42[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt5548) {
				local18 = this.anIntArray481[local9];
				this.anIntArrayArray42[local18][local5[local18]++] = local9++;
			}
			this.anIntArray481 = null;
		}
		if (this.anIntArray487 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt5547; local9++) {
			local18 = this.anIntArray487[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray43 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray43[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt5547) {
			local18 = this.anIntArray487[local9];
			this.anIntArrayArray43[local18][local5[local18]++] = local9++;
		}
		this.anIntArray487 = null;
	}

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "()V")
	public void method4199() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5548; local1++) {
			@Pc(10) int local10 = this.anIntArray482[local1];
			this.anIntArray482[local1] = this.anIntArray486[local1];
			this.anIntArray486[local1] = -local10;
		}
		this.method4187();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(SS)V")
	public void method4200(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5547; local1++) {
			if (this.aShortArray75[local1] == arg0) {
				this.aShortArray75[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "()V")
	public void method4201() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5548; local1++) {
			this.anIntArray482[local1] = -this.anIntArray482[local1];
		}
		for (local1 = 0; local1 < this.anInt5547; local1++) {
			@Pc(27) int local27 = this.anIntArray479[local1];
			this.anIntArray479[local1] = this.anIntArray477[local1];
			this.anIntArray477[local1] = local27;
		}
		this.method4187();
	}

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "()V")
	private void method4203() {
		if (this.aBoolean467) {
			return;
		}
		this.aBoolean467 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5545; local20++) {
			@Pc(29) int local29 = this.anIntArray486[local20];
			@Pc(34) int local34 = this.anIntArray483[local20];
			@Pc(39) int local39 = this.anIntArray482[local20];
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
		this.aShort31 = (short) local8;
		this.aShort34 = (short) local14;
		this.aShort35 = (short) local10;
		this.aShort30 = (short) local16;
		this.aShort32 = (short) local12;
		this.aShort33 = (short) local18;
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(III)V")
	public void method4204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static281.anIntArray480[arg2];
			local9 = Static281.anIntArray478[arg2];
			for (local11 = 0; local11 < this.anInt5548; local11++) {
				local31 = this.anIntArray483[local11] * local5 + this.anIntArray486[local11] * local9 >> 16;
				this.anIntArray483[local11] = this.anIntArray483[local11] * local9 - this.anIntArray486[local11] * local5 >> 16;
				this.anIntArray486[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static281.anIntArray480[arg0];
			local9 = Static281.anIntArray478[arg0];
			for (local11 = 0; local11 < this.anInt5548; local11++) {
				local31 = this.anIntArray483[local11] * local9 - this.anIntArray482[local11] * local5 >> 16;
				this.anIntArray482[local11] = this.anIntArray483[local11] * local5 + this.anIntArray482[local11] * local9 >> 16;
				this.anIntArray483[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static281.anIntArray480[arg1];
		local9 = Static281.anIntArray478[arg1];
		for (local11 = 0; local11 < this.anInt5548; local11++) {
			local31 = this.anIntArray482[local11] * local5 + this.anIntArray486[local11] * local9 >> 16;
			this.anIntArray482[local11] = this.anIntArray482[local11] * local9 - this.anIntArray486[local11] * local5 >> 16;
			this.anIntArray486[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "([B)V")
	private void method4205(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class8_Sub2 local8 = new Class8_Sub2(arg0);
		@Pc(13) Class8_Sub2 local13 = new Class8_Sub2(arg0);
		@Pc(18) Class8_Sub2 local18 = new Class8_Sub2(arg0);
		@Pc(23) Class8_Sub2 local23 = new Class8_Sub2(arg0);
		@Pc(28) Class8_Sub2 local28 = new Class8_Sub2(arg0);
		local8.anInt2955 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2375();
		@Pc(42) int local42 = local8.method2375();
		@Pc(46) int local46 = local8.method2334();
		@Pc(50) int local50 = local8.method2334();
		@Pc(54) int local54 = local8.method2334();
		@Pc(58) int local58 = local8.method2334();
		@Pc(62) int local62 = local8.method2334();
		@Pc(66) int local66 = local8.method2334();
		@Pc(70) int local70 = local8.method2375();
		@Pc(74) int local74 = local8.method2375();
		@Pc(78) int local78 = local8.method2375();
		@Pc(82) int local82 = local8.method2375();
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
		this.anInt5548 = local38;
		this.anInt5547 = local42;
		this.anInt5546 = local46;
		this.anIntArray486 = new int[local38];
		this.anIntArray483 = new int[local38];
		this.anIntArray482 = new int[local38];
		this.anIntArray479 = new int[local42];
		this.anIntArray488 = new int[local42];
		this.anIntArray477 = new int[local42];
		if (local46 > 0) {
			this.aByteArray67 = new byte[local46];
			this.aShortArray72 = new short[local46];
			this.aShortArray77 = new short[local46];
			this.aShortArray79 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray481 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray64 = new byte[local42];
			this.aByteArray72 = new byte[local42];
			this.aShortArray78 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray69 = new byte[local42];
		} else {
			this.aByte21 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray71 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray487 = new int[local42];
		}
		this.aShortArray75 = new short[local42];
		local8.anInt2955 = 0;
		local13.anInt2955 = local165;
		local18.anInt2955 = local171;
		local23.anInt2955 = local90;
		local28.anInt2955 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method2334();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method2325();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method2325();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method2325();
			}
			this.anIntArray486[local307] = local301 + local316;
			this.anIntArray483[local307] = local303 + local326;
			this.anIntArray482[local307] = local305 + local336;
			local301 = this.anIntArray486[local307];
			local303 = this.anIntArray483[local307];
			local305 = this.anIntArray482[local307];
			if (local66 == 1) {
				this.anIntArray481[local307] = local28.method2334();
			}
		}
		local8.anInt2955 = local149;
		local13.anInt2955 = local116;
		local18.anInt2955 = local98;
		local23.anInt2955 = local134;
		local28.anInt2955 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray75[local307] = (short) local8.method2375();
			if (local50 == 1) {
				local314 = local13.method2334();
				if ((local314 & 0x1) == 1) {
					this.aByteArray64[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray64[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray72[local307] = (byte) (local314 >> 2);
					this.aShortArray78[local307] = this.aShortArray75[local307];
					this.aShortArray75[local307] = 127;
					if (this.aShortArray78[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray72[local307] = -1;
					this.aShortArray78[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray69[local307] = local18.method2374();
			}
			if (local58 == 1) {
				this.aByteArray71[local307] = local23.method2374();
			}
			if (local62 == 1) {
				this.anIntArray487[local307] = local28.method2334();
			}
		}
		this.anInt5545 = -1;
		local8.anInt2955 = local143;
		local13.anInt2955 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method2334();
			if (local548 == 1) {
				local307 = local8.method2325() + local326;
				local314 = local8.method2325() + local307;
				local316 = local8.method2325() + local314;
				local326 = local316;
				this.anIntArray479[local336] = local307;
				this.anIntArray488[local336] = local314;
				this.anIntArray477[local336] = local316;
				if (local307 > this.anInt5545) {
					this.anInt5545 = local307;
				}
				if (local314 > this.anInt5545) {
					this.anInt5545 = local314;
				}
				if (local316 > this.anInt5545) {
					this.anInt5545 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method2325() + local326;
				local326 = local316;
				this.anIntArray479[local336] = local307;
				this.anIntArray488[local336] = local314;
				this.anIntArray477[local336] = local316;
				if (local316 > this.anInt5545) {
					this.anInt5545 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method2325() + local326;
				local326 = local316;
				this.anIntArray479[local336] = local307;
				this.anIntArray488[local336] = local314;
				this.anIntArray477[local336] = local316;
				if (local316 > this.anInt5545) {
					this.anInt5545 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method2325() + local326;
				local326 = local316;
				this.anIntArray479[local336] = local307;
				this.anIntArray488[local336] = local686;
				this.anIntArray477[local336] = local316;
				if (local316 > this.anInt5545) {
					this.anInt5545 = local316;
				}
			}
		}
		this.anInt5545++;
		local8.anInt2955 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray67[local336] = 0;
			this.aShortArray72[local336] = (short) local8.method2375();
			this.aShortArray77[local336] = (short) local8.method2375();
			this.aShortArray79[local336] = (short) local8.method2375();
		}
		if (this.aByteArray72 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray72[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray72[local686] & 0xFFFF) == this.anIntArray479[local548] && (this.aShortArray77[local686] & 0xFFFF) == this.anIntArray488[local548] && (this.aShortArray79[local686] & 0xFFFF) == this.anIntArray477[local548]) {
						this.aByteArray72[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray72 = null;
			}
		}
		if (!local3) {
			this.aShortArray78 = null;
		}
		if (!local1) {
			this.aByteArray64 = null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
	public void method4206() {
		@Pc(3) int local3 = Static281.anIntArray480[256];
		@Pc(7) int local7 = Static281.anIntArray478[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5548; local9++) {
			@Pc(29) int local29 = this.anIntArray482[local9] * local3 + this.anIntArray486[local9] * local7 >> 16;
			this.anIntArray482[local9] = this.anIntArray482[local9] * local7 - this.anIntArray486[local9] * local3 >> 16;
			this.anIntArray486[local9] = local29;
		}
		this.method4187();
	}

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "()V")
	public void method4207() {
		if (this.aClass137Array2 != null) {
			return;
		}
		this.aClass137Array2 = new Class137[this.anInt5545];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt5545; local10++) {
			this.aClass137Array2[local10] = new Class137();
		}
		for (local10 = 0; local10 < this.anInt5547; local10++) {
			@Pc(34) int local34 = this.anIntArray479[local10];
			@Pc(39) int local39 = this.anIntArray488[local10];
			@Pc(44) int local44 = this.anIntArray477[local10];
			@Pc(54) int local54 = this.anIntArray486[local39] - this.anIntArray486[local34];
			@Pc(64) int local64 = this.anIntArray483[local39] - this.anIntArray483[local34];
			@Pc(74) int local74 = this.anIntArray482[local39] - this.anIntArray482[local34];
			@Pc(84) int local84 = this.anIntArray486[local44] - this.anIntArray486[local34];
			@Pc(94) int local94 = this.anIntArray483[local44] - this.anIntArray483[local34];
			@Pc(104) int local104 = this.anIntArray482[local44] - this.anIntArray482[local34];
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
			if (this.aByteArray64 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray64[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class137 local214 = this.aClass137Array2[local34];
				local214.anInt4382 += local112;
				local214.anInt4384 += local120;
				local214.anInt4385 += local128;
				local214.anInt4383++;
				@Pc(243) Class137 local243 = this.aClass137Array2[local39];
				local243.anInt4382 += local112;
				local243.anInt4384 += local120;
				local243.anInt4385 += local128;
				local243.anInt4383++;
				@Pc(272) Class137 local272 = this.aClass137Array2[local44];
				local272.anInt4382 += local112;
				local272.anInt4384 += local120;
				local272.anInt4385 += local128;
				local272.anInt4383++;
			} else if (local201 == 1) {
				if (this.aClass180Array1 == null) {
					this.aClass180Array1 = new Class180[this.anInt5547];
				}
				@Pc(317) Class180 local317 = this.aClass180Array1[local10] = new Class180();
				local317.anInt5702 = local112;
				local317.anInt5703 = local120;
				local317.anInt5698 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(IIIII)Lclient!u;")
	public Class36_Sub2_Sub2 method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class36_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()I")
	@Override
	public int method4175() {
		if (!this.aBoolean467) {
			this.method4203();
		}
		return this.aShort35;
	}

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "()Lclient!vi;")
	public Class36_Sub7 method4209() {
		@Pc(3) Class36_Sub7 local3 = new Class36_Sub7();
		if (this.aByteArray64 != null) {
			local3.aByteArray64 = new byte[this.anInt5547];
			for (@Pc(13) int local13 = 0; local13 < this.anInt5547; local13++) {
				local3.aByteArray64[local13] = this.aByteArray64[local13];
			}
		}
		local3.anInt5548 = this.anInt5548;
		local3.anInt5545 = this.anInt5545;
		local3.anInt5547 = this.anInt5547;
		local3.anInt5546 = this.anInt5546;
		local3.anIntArray486 = this.anIntArray486;
		local3.anIntArray483 = this.anIntArray483;
		local3.anIntArray482 = this.anIntArray482;
		local3.anIntArray479 = this.anIntArray479;
		local3.anIntArray488 = this.anIntArray488;
		local3.anIntArray477 = this.anIntArray477;
		local3.aByteArray69 = this.aByteArray69;
		local3.aByteArray71 = this.aByteArray71;
		local3.aByteArray72 = this.aByteArray72;
		local3.aShortArray75 = this.aShortArray75;
		local3.aShortArray78 = this.aShortArray78;
		local3.aByte21 = this.aByte21;
		local3.aByteArray67 = this.aByteArray67;
		local3.aShortArray72 = this.aShortArray72;
		local3.aShortArray77 = this.aShortArray77;
		local3.aShortArray79 = this.aShortArray79;
		local3.aShortArray71 = this.aShortArray71;
		local3.aShortArray80 = this.aShortArray80;
		local3.aShortArray73 = this.aShortArray73;
		local3.aByteArray68 = this.aByteArray68;
		local3.aByteArray65 = this.aByteArray65;
		local3.aByteArray70 = this.aByteArray70;
		local3.aByteArray73 = this.aByteArray73;
		local3.aByteArray66 = this.aByteArray66;
		local3.anIntArray481 = this.anIntArray481;
		local3.anIntArray487 = this.anIntArray487;
		local3.anIntArrayArray42 = this.anIntArrayArray42;
		local3.anIntArrayArray43 = this.anIntArrayArray43;
		local3.aClass137Array2 = this.aClass137Array2;
		local3.aClass180Array1 = this.aClass180Array1;
		local3.aShort37 = this.aShort37;
		local3.aShort36 = this.aShort36;
		return local3;
	}
}
