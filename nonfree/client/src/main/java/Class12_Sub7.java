import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class12_Sub7 extends Class12 {

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "[I")
	public int[] anIntArray361;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!pn", name = "w", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "S")
	public short aShort23;

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!pn", name = "C", descriptor = "[Lclient!dn;")
	public Class36[] aClass36Array1;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "[Lclient!oi;")
	public Class124[] aClass124Array1;

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "[[I")
	public int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!pn", name = "J", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!pn", name = "K", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!pn", name = "L", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!pn", name = "N", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!pn", name = "O", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!pn", name = "Q", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!pn", name = "R", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!pn", name = "S", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!pn", name = "U", descriptor = "[I")
	public int[] anIntArray368;

	@OriginalMember(owner = "client!pn", name = "V", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!pn", name = "W", descriptor = "I")
	public int anInt4095;

	@OriginalMember(owner = "client!pn", name = "Y", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!pn", name = "Z", descriptor = "[I")
	public int[] anIntArray369;

	@OriginalMember(owner = "client!pn", name = "ab", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!pn", name = "db", descriptor = "[Lclient!oi;")
	public Class124[] aClass124Array2;

	@OriginalMember(owner = "client!pn", name = "eb", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!pn", name = "fb", descriptor = "[I")
	public int[] anIntArray371;

	@OriginalMember(owner = "client!pn", name = "gb", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!pn", name = "hb", descriptor = "[I")
	public int[] anIntArray372;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!pn", name = "X", descriptor = "B")
	public byte aByte17 = 0;

	@OriginalMember(owner = "client!pn", name = "T", descriptor = "I")
	public int anInt4094 = 0;

	@OriginalMember(owner = "client!pn", name = "cb", descriptor = "I")
	public int anInt4096 = 0;

	@OriginalMember(owner = "client!pn", name = "ib", descriptor = "I")
	public int anInt4097 = 0;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	private Class12_Sub7() {
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "([B)V")
	public Class12_Sub7(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3324(arg0);
		} else {
			this.method3339(arg0);
		}
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(III)V")
	public Class12_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray371 = new int[arg0];
		this.anIntArray369 = new int[arg0];
		this.anIntArray363 = new int[arg0];
		this.anIntArray361 = new int[arg0];
		this.anIntArray372 = new int[arg1];
		this.anIntArray365 = new int[arg1];
		this.anIntArray367 = new int[arg1];
		this.aByteArray50 = new byte[arg1];
		this.aByteArray53 = new byte[arg1];
		this.aByteArray52 = new byte[arg1];
		this.aShortArray63 = new short[arg1];
		this.aShortArray68 = new short[arg1];
		this.aByteArray55 = new byte[arg1];
		this.anIntArray368 = new int[arg1];
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "([Lclient!pn;I)V")
	public Class12_Sub7(@OriginalArg(0) Class12_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt4094 = 0;
		this.anInt4096 = 0;
		this.anInt4095 = 0;
		this.aByte17 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class12_Sub7 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt4094 += local53.anInt4094;
				this.anInt4096 += local53.anInt4096;
				this.anInt4095 += local53.anInt4095;
				if (local53.aByteArray53 == null) {
					if (this.aByte17 == -1) {
						this.aByte17 = local53.aByte17;
					}
					if (this.aByte17 != local53.aByte17) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray50 != null;
				local22 |= local53.aByteArray52 != null;
				local24 |= local53.anIntArray368 != null;
				local26 |= local53.aShortArray68 != null;
				local28 |= local53.aByteArray55 != null;
			}
		}
		this.anIntArray371 = new int[this.anInt4094];
		this.anIntArray369 = new int[this.anInt4094];
		this.anIntArray363 = new int[this.anInt4094];
		this.anIntArray361 = new int[this.anInt4094];
		this.aShortArray65 = new short[this.anInt4094];
		this.anIntArray372 = new int[this.anInt4096];
		this.anIntArray365 = new int[this.anInt4096];
		this.anIntArray367 = new int[this.anInt4096];
		if (local18) {
			this.aByteArray50 = new byte[this.anInt4096];
		}
		if (local20) {
			this.aByteArray53 = new byte[this.anInt4096];
		}
		if (local22) {
			this.aByteArray52 = new byte[this.anInt4096];
		}
		if (local24) {
			this.anIntArray368 = new int[this.anInt4096];
		}
		if (local26) {
			this.aShortArray68 = new short[this.anInt4096];
		}
		if (local28) {
			this.aByteArray55 = new byte[this.anInt4096];
		}
		this.aShortArray63 = new short[this.anInt4096];
		this.aShortArray69 = new short[this.anInt4096];
		if (this.anInt4095 > 0) {
			this.aByteArray57 = new byte[this.anInt4095];
			this.aShortArray67 = new short[this.anInt4095];
			this.aShortArray64 = new short[this.anInt4095];
			this.aShortArray71 = new short[this.anInt4095];
			this.aShortArray66 = new short[this.anInt4095];
			this.aShortArray72 = new short[this.anInt4095];
			this.aShortArray70 = new short[this.anInt4095];
			this.aByteArray58 = new byte[this.anInt4095];
			this.aByteArray56 = new byte[this.anInt4095];
			this.aByteArray49 = new byte[this.anInt4095];
			this.aByteArray54 = new byte[this.anInt4095];
			this.aByteArray51 = new byte[this.anInt4095];
		}
		this.anInt4094 = 0;
		this.anInt4096 = 0;
		this.anInt4095 = 0;
		@Pc(330) Class12_Sub7 local330;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(326) short local326 = (short) (0x1 << local46);
			local330 = arg0[local46];
			if (local330 != null) {
				for (@Pc(334) int local334 = 0; local334 < local330.anInt4096; local334++) {
					if (local18 && local330.aByteArray50 != null) {
						this.aByteArray50[this.anInt4096] = local330.aByteArray50[local334];
					}
					if (local20) {
						if (local330.aByteArray53 == null) {
							this.aByteArray53[this.anInt4096] = local330.aByte17;
						} else {
							this.aByteArray53[this.anInt4096] = local330.aByteArray53[local334];
						}
					}
					if (local22 && local330.aByteArray52 != null) {
						this.aByteArray52[this.anInt4096] = local330.aByteArray52[local334];
					}
					if (local24 && local330.anIntArray368 != null) {
						this.anIntArray368[this.anInt4096] = local330.anIntArray368[local334];
					}
					if (local26) {
						if (local330.aShortArray68 == null) {
							this.aShortArray68[this.anInt4096] = -1;
						} else {
							this.aShortArray68[this.anInt4096] = local330.aShortArray68[local334];
						}
					}
					this.aShortArray63[this.anInt4096] = local330.aShortArray63[local334];
					this.aShortArray69[this.anInt4096] = local326;
					this.anIntArray372[this.anInt4096] = this.method3323(local330, local330.anIntArray372[local334], local326);
					this.anIntArray365[this.anInt4096] = this.method3323(local330, local330.anIntArray365[local334], local326);
					this.anIntArray367[this.anInt4096] = this.method3323(local330, local330.anIntArray367[local334], local326);
					this.anInt4096++;
				}
			}
		}
		local46 = 0;
		this.anInt4097 = this.anInt4094;
		for (@Pc(495) int local495 = 0; local495 < arg1; local495++) {
			local330 = arg0[local495];
			@Pc(507) short local507 = (short) (0x1 << local495);
			if (local330 != null) {
				@Pc(511) int local511;
				for (local511 = 0; local511 < local330.anInt4096; local511++) {
					if (local28) {
						this.aByteArray55[local46++] = (byte) (local330.aByteArray55 == null || local330.aByteArray55[local511] == -1 ? -1 : local330.aByteArray55[local511] + this.anInt4095);
					}
				}
				for (local511 = 0; local511 < local330.anInt4095; local511++) {
					@Pc(560) byte local560 = this.aByteArray57[this.anInt4095] = local330.aByteArray57[local511];
					if (local560 == 0) {
						this.aShortArray67[this.anInt4095] = (short) this.method3323(local330, local330.aShortArray67[local511], local507);
						this.aShortArray64[this.anInt4095] = (short) this.method3323(local330, local330.aShortArray64[local511], local507);
						this.aShortArray71[this.anInt4095] = (short) this.method3323(local330, local330.aShortArray71[local511], local507);
					}
					if (local560 >= 1 && local560 <= 3) {
						this.aShortArray67[this.anInt4095] = local330.aShortArray67[local511];
						this.aShortArray64[this.anInt4095] = local330.aShortArray64[local511];
						this.aShortArray71[this.anInt4095] = local330.aShortArray71[local511];
						this.aShortArray66[this.anInt4095] = local330.aShortArray66[local511];
						this.aShortArray72[this.anInt4095] = local330.aShortArray72[local511];
						this.aShortArray70[this.anInt4095] = local330.aShortArray70[local511];
						this.aByteArray58[this.anInt4095] = local330.aByteArray58[local511];
						this.aByteArray56[this.anInt4095] = local330.aByteArray56[local511];
						this.aByteArray49[this.anInt4095] = local330.aByteArray49[local511];
					}
					if (local560 == 2) {
						this.aByteArray54[this.anInt4095] = local330.aByteArray54[local511];
						this.aByteArray51[this.anInt4095] = local330.aByteArray51[local511];
					}
					this.anInt4095++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!pn;ZZZZ)V")
	public Class12_Sub7(@OriginalArg(0) Class12_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4094 = arg0.anInt4094;
		this.anInt4097 = arg0.anInt4097;
		this.anInt4096 = arg0.anInt4096;
		this.anInt4095 = arg0.anInt4095;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray371 = arg0.anIntArray371;
			this.anIntArray369 = arg0.anIntArray369;
			this.anIntArray363 = arg0.anIntArray363;
		} else {
			this.anIntArray371 = new int[this.anInt4094];
			this.anIntArray369 = new int[this.anInt4094];
			this.anIntArray363 = new int[this.anInt4094];
			for (local64 = 0; local64 < this.anInt4094; local64++) {
				this.anIntArray371[local64] = arg0.anIntArray371[local64];
				this.anIntArray369[local64] = arg0.anIntArray369[local64];
				this.anIntArray363[local64] = arg0.anIntArray363[local64];
			}
		}
		if (arg2) {
			this.aShortArray63 = arg0.aShortArray63;
		} else {
			this.aShortArray63 = new short[this.anInt4096];
			for (local64 = 0; local64 < this.anInt4096; local64++) {
				this.aShortArray63[local64] = arg0.aShortArray63[local64];
			}
		}
		if (arg3 || arg0.aShortArray68 == null) {
			this.aShortArray68 = arg0.aShortArray68;
		} else {
			this.aShortArray68 = new short[this.anInt4096];
			for (local64 = 0; local64 < this.anInt4096; local64++) {
				this.aShortArray68[local64] = arg0.aShortArray68[local64];
			}
		}
		this.aByteArray52 = arg0.aByteArray52;
		this.anIntArray372 = arg0.anIntArray372;
		this.anIntArray365 = arg0.anIntArray365;
		this.anIntArray367 = arg0.anIntArray367;
		this.aByteArray50 = arg0.aByteArray50;
		this.aByteArray53 = arg0.aByteArray53;
		this.aByteArray55 = arg0.aByteArray55;
		this.aByte17 = arg0.aByte17;
		this.aByteArray57 = arg0.aByteArray57;
		this.aShortArray67 = arg0.aShortArray67;
		this.aShortArray64 = arg0.aShortArray64;
		this.aShortArray71 = arg0.aShortArray71;
		this.aShortArray66 = arg0.aShortArray66;
		this.aShortArray72 = arg0.aShortArray72;
		this.aShortArray70 = arg0.aShortArray70;
		this.aByteArray58 = arg0.aByteArray58;
		this.aByteArray56 = arg0.aByteArray56;
		this.aByteArray49 = arg0.aByteArray49;
		this.aByteArray54 = arg0.aByteArray54;
		this.aByteArray51 = arg0.aByteArray51;
		this.anIntArray361 = arg0.anIntArray361;
		this.anIntArray368 = arg0.anIntArray368;
		this.anIntArrayArray32 = arg0.anIntArrayArray32;
		this.anIntArrayArray33 = arg0.anIntArrayArray33;
		this.aClass124Array2 = arg0.aClass124Array2;
		this.aClass36Array1 = arg0.aClass36Array1;
		this.aClass124Array1 = arg0.aClass124Array1;
		this.aShort21 = arg0.aShort21;
		this.aShort23 = arg0.aShort23;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "()V")
	public void method3318() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4094; local1++) {
			this.anIntArray363[local1] = -this.anIntArray363[local1];
		}
		for (local1 = 0; local1 < this.anInt4096; local1++) {
			@Pc(27) int local27 = this.anIntArray372[local1];
			this.anIntArray372[local1] = this.anIntArray367[local1];
			this.anIntArray367[local1] = local27;
		}
		this.method3322();
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "()Lclient!pn;")
	public Class12_Sub7 method3319() {
		@Pc(3) Class12_Sub7 local3 = new Class12_Sub7();
		if (this.aByteArray50 != null) {
			local3.aByteArray50 = new byte[this.anInt4096];
			for (@Pc(13) int local13 = 0; local13 < this.anInt4096; local13++) {
				local3.aByteArray50[local13] = this.aByteArray50[local13];
			}
		}
		local3.anInt4094 = this.anInt4094;
		local3.anInt4097 = this.anInt4097;
		local3.anInt4096 = this.anInt4096;
		local3.anInt4095 = this.anInt4095;
		local3.anIntArray371 = this.anIntArray371;
		local3.anIntArray369 = this.anIntArray369;
		local3.anIntArray363 = this.anIntArray363;
		local3.anIntArray372 = this.anIntArray372;
		local3.anIntArray365 = this.anIntArray365;
		local3.anIntArray367 = this.anIntArray367;
		local3.aByteArray53 = this.aByteArray53;
		local3.aByteArray52 = this.aByteArray52;
		local3.aByteArray55 = this.aByteArray55;
		local3.aShortArray63 = this.aShortArray63;
		local3.aShortArray68 = this.aShortArray68;
		local3.aByte17 = this.aByte17;
		local3.aByteArray57 = this.aByteArray57;
		local3.aShortArray67 = this.aShortArray67;
		local3.aShortArray64 = this.aShortArray64;
		local3.aShortArray71 = this.aShortArray71;
		local3.aShortArray66 = this.aShortArray66;
		local3.aShortArray72 = this.aShortArray72;
		local3.aShortArray70 = this.aShortArray70;
		local3.aByteArray58 = this.aByteArray58;
		local3.aByteArray56 = this.aByteArray56;
		local3.aByteArray49 = this.aByteArray49;
		local3.aByteArray54 = this.aByteArray54;
		local3.aByteArray51 = this.aByteArray51;
		local3.anIntArray361 = this.anIntArray361;
		local3.anIntArray368 = this.anIntArray368;
		local3.anIntArrayArray32 = this.anIntArrayArray32;
		local3.anIntArrayArray33 = this.anIntArrayArray33;
		local3.aClass124Array2 = this.aClass124Array2;
		local3.aClass36Array1 = this.aClass36Array1;
		local3.aShort21 = this.aShort21;
		local3.aShort23 = this.aShort23;
		return local3;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([[IIIIII)V")
	private void method3320(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static208.method3337(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static208.method3337(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static208.method3337(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static208.method3337(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method3329(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method3344(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method3330(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "()V")
	public void method3321() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray361 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt4094; local9++) {
				local18 = this.anIntArray361[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray32 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray32[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt4094) {
				local18 = this.anIntArray361[local9];
				this.anIntArrayArray32[local18][local5[local18]++] = local9++;
			}
			this.anIntArray361 = null;
		}
		if (this.anIntArray368 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt4096; local9++) {
			local18 = this.anIntArray368[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray33 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray33[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt4096) {
			local18 = this.anIntArray368[local9];
			this.anIntArrayArray33[local18][local5[local18]++] = local9++;
		}
		this.anIntArray368 = null;
	}

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "()V")
	private void method3322() {
		this.aClass124Array2 = null;
		this.aClass124Array1 = null;
		this.aClass36Array1 = null;
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!pn;IS)I")
	private int method3323(@OriginalArg(0) Class12_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray371[arg1];
		@Pc(9) int local9 = arg0.anIntArray369[arg1];
		@Pc(14) int local14 = arg0.anIntArray363[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4094; local16++) {
			if (local4 == this.anIntArray371[local16] && local9 == this.anIntArray369[local16] && local14 == this.anIntArray363[local16]) {
				this.aShortArray65[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray371[this.anInt4094] = local4;
		this.anIntArray369[this.anInt4094] = local9;
		this.anIntArray363[this.anInt4094] = local14;
		this.aShortArray65[this.anInt4094] = arg2;
		if (arg0.anIntArray361 != null) {
			this.anIntArray361[this.anInt4094] = arg0.anIntArray361[arg1];
		}
		return this.anInt4094++;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([B)V")
	private void method3324(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class4_Sub17 local4 = new Class4_Sub17(arg0);
		@Pc(9) Class4_Sub17 local9 = new Class4_Sub17(arg0);
		@Pc(14) Class4_Sub17 local14 = new Class4_Sub17(arg0);
		@Pc(19) Class4_Sub17 local19 = new Class4_Sub17(arg0);
		@Pc(24) Class4_Sub17 local24 = new Class4_Sub17(arg0);
		@Pc(29) Class4_Sub17 local29 = new Class4_Sub17(arg0);
		@Pc(34) Class4_Sub17 local34 = new Class4_Sub17(arg0);
		local4.anInt2400 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1837();
		@Pc(48) int local48 = local4.method1837();
		@Pc(52) int local52 = local4.method1874();
		@Pc(56) int local56 = local4.method1874();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method1874();
		@Pc(82) int local82 = local4.method1874();
		@Pc(86) int local86 = local4.method1874();
		@Pc(90) int local90 = local4.method1874();
		@Pc(94) int local94 = local4.method1874();
		@Pc(98) int local98 = local4.method1837();
		@Pc(102) int local102 = local4.method1837();
		@Pc(106) int local106 = local4.method1837();
		@Pc(110) int local110 = local4.method1837();
		@Pc(114) int local114 = local4.method1837();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray57 = new byte[local52];
			local4.anInt2400 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray57[local131] = local4.method1892();
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
		this.anInt4094 = local44;
		this.anInt4096 = local48;
		this.anInt4095 = local52;
		this.anIntArray371 = new int[local44];
		this.anIntArray369 = new int[local44];
		this.anIntArray363 = new int[local44];
		this.anIntArray372 = new int[local48];
		this.anIntArray365 = new int[local48];
		this.anIntArray367 = new int[local48];
		if (local94 == 1) {
			this.anIntArray361 = new int[local44];
		}
		if (local65) {
			this.aByteArray50 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray53 = new byte[local48];
		} else {
			this.aByte17 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray52 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray368 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray68 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray55 = new byte[local48];
		}
		this.aShortArray63 = new short[local48];
		if (local52 > 0) {
			this.aShortArray67 = new short[local52];
			this.aShortArray64 = new short[local52];
			this.aShortArray71 = new short[local52];
			if (local118 > 0) {
				this.aShortArray66 = new short[local118];
				this.aShortArray72 = new short[local118];
				this.aShortArray70 = new short[local118];
				this.aByteArray58 = new byte[local118];
				this.aByteArray56 = new byte[local118];
				this.aByteArray49 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray54 = new byte[local120];
				this.aByteArray51 = new byte[local120];
			}
		}
		local4.anInt2400 = local52;
		local9.anInt2400 = local250;
		local14.anInt2400 = local256;
		local19.anInt2400 = local262;
		local24.anInt2400 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method1874();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method1863();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method1863();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method1863();
			}
			this.anIntArray371[local479] = local473 + local488;
			this.anIntArray369[local479] = local475 + local498;
			this.anIntArray363[local479] = local477 + local508;
			local473 = this.anIntArray371[local479];
			local475 = this.anIntArray369[local479];
			local477 = this.anIntArray363[local479];
			if (local94 == 1) {
				this.anIntArray361[local479] = local24.method1874();
			}
		}
		local4.anInt2400 = local242;
		local9.anInt2400 = local169;
		local14.anInt2400 = local183;
		local19.anInt2400 = local210;
		local24.anInt2400 = local192;
		local29.anInt2400 = local225;
		local34.anInt2400 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray63[local479] = (short) local4.method1837();
			if (local65) {
				this.aByteArray50[local479] = local9.method1892();
			}
			if (local78 == 255) {
				this.aByteArray53[local479] = local14.method1892();
			}
			if (local82 == 1) {
				this.aByteArray52[local479] = local19.method1892();
			}
			if (local86 == 1) {
				this.anIntArray368[local479] = local24.method1874();
			}
			if (local90 == 1) {
				this.aShortArray68[local479] = (short) (local29.method1837() - 1);
			}
			if (this.aByteArray55 != null) {
				if (this.aShortArray68[local479] == -1) {
					this.aByteArray55[local479] = -1;
				} else {
					this.aByteArray55[local479] = (byte) (local34.method1874() - 1);
				}
			}
		}
		this.anInt4097 = -1;
		local4.anInt2400 = local219;
		local9.anInt2400 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method1874();
			if (local703 == 1) {
				local479 = local4.method1863() + local498;
				local486 = local4.method1863() + local479;
				local488 = local4.method1863() + local486;
				local498 = local488;
				this.anIntArray372[local508] = local479;
				this.anIntArray365[local508] = local486;
				this.anIntArray367[local508] = local488;
				if (local479 > this.anInt4097) {
					this.anInt4097 = local479;
				}
				if (local486 > this.anInt4097) {
					this.anInt4097 = local486;
				}
				if (local488 > this.anInt4097) {
					this.anInt4097 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method1863() + local498;
				local498 = local488;
				this.anIntArray372[local508] = local479;
				this.anIntArray365[local508] = local486;
				this.anIntArray367[local508] = local488;
				if (local488 > this.anInt4097) {
					this.anInt4097 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method1863() + local498;
				local498 = local488;
				this.anIntArray372[local508] = local479;
				this.anIntArray365[local508] = local486;
				this.anIntArray367[local508] = local488;
				if (local488 > this.anInt4097) {
					this.anInt4097 = local488;
				}
			}
			if (local703 == 4) {
				@Pc(841) int local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method1863() + local498;
				local498 = local488;
				this.anIntArray372[local508] = local479;
				this.anIntArray365[local508] = local841;
				this.anIntArray367[local508] = local488;
				if (local488 > this.anInt4097) {
					this.anInt4097 = local488;
				}
			}
		}
		this.anInt4097++;
		local4.anInt2400 = local268;
		local9.anInt2400 = local276;
		local14.anInt2400 = local284;
		local19.anInt2400 = local292;
		local24.anInt2400 = local298;
		local29.anInt2400 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray57[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray67[local508] = (short) local4.method1837();
				this.aShortArray64[local508] = (short) local4.method1837();
				this.aShortArray71[local508] = (short) local4.method1837();
			}
			if (local703 == 1) {
				this.aShortArray67[local508] = (short) local9.method1837();
				this.aShortArray64[local508] = (short) local9.method1837();
				this.aShortArray71[local508] = (short) local9.method1837();
				this.aShortArray66[local508] = (short) local14.method1837();
				this.aShortArray72[local508] = (short) local14.method1837();
				this.aShortArray70[local508] = (short) local14.method1837();
				this.aByteArray58[local508] = local19.method1892();
				this.aByteArray56[local508] = local24.method1892();
				this.aByteArray49[local508] = local29.method1892();
			}
			if (local703 == 2) {
				this.aShortArray67[local508] = (short) local9.method1837();
				this.aShortArray64[local508] = (short) local9.method1837();
				this.aShortArray71[local508] = (short) local9.method1837();
				this.aShortArray66[local508] = (short) local14.method1837();
				this.aShortArray72[local508] = (short) local14.method1837();
				this.aShortArray70[local508] = (short) local14.method1837();
				this.aByteArray58[local508] = local19.method1892();
				this.aByteArray56[local508] = local24.method1892();
				this.aByteArray49[local508] = local29.method1892();
				this.aByteArray54[local508] = local29.method1892();
				this.aByteArray51[local508] = local29.method1892();
			}
			if (local703 == 3) {
				this.aShortArray67[local508] = (short) local9.method1837();
				this.aShortArray64[local508] = (short) local9.method1837();
				this.aShortArray71[local508] = (short) local9.method1837();
				this.aShortArray66[local508] = (short) local14.method1837();
				this.aShortArray72[local508] = (short) local14.method1837();
				this.aShortArray70[local508] = (short) local14.method1837();
				this.aByteArray58[local508] = local19.method1892();
				this.aByteArray56[local508] = local24.method1892();
				this.aByteArray49[local508] = local29.method1892();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt2400 = local131;
		local508 = local4.method1874();
		if (local508 > 0) {
			local4.anInt2400 += local508 * 4;
		}
		local703 = local4.method1874();
		if (local703 > 0) {
			local4.anInt2400 += local703 * 4;
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIIII)Lclient!uc;")
	public Class12_Sub2 method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static178.aBoolean216) {
			@Pc(9) Class12_Sub2_Sub2 local9 = new Class12_Sub2_Sub2(this, arg0, arg1, true);
			local9.method3172();
			return local9;
		} else {
			return new Class12_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "()I")
	@Override
	public int method3355() {
		if (!this.aBoolean270) {
			this.method3343();
		}
		return this.aShort24;
	}

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "()V")
	public void method3326() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4094; local1++) {
			@Pc(10) int local10 = this.anIntArray371[local1];
			this.anIntArray371[local1] = this.anIntArray363[local1];
			this.anIntArray363[local1] = -local10;
		}
		this.method3322();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(SS)V")
	public void method3327(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4096; local1++) {
			if (this.aShortArray63[local1] == arg0) {
				this.aShortArray63[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIBSB)I")
	public int method3328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray372[this.anInt4096] = arg0;
		this.anIntArray365[this.anInt4096] = arg1;
		this.anIntArray367[this.anInt4096] = arg2;
		this.aByteArray50[this.anInt4096] = 1;
		this.aByteArray55[this.anInt4096] = -1;
		this.aShortArray63[this.anInt4096] = arg3;
		this.aShortArray68[this.anInt4096] = -1;
		this.aByteArray52[this.anInt4096] = arg4;
		return this.anInt4096++;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	private void method3329(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static208.anIntArray364[arg0];
		@Pc(7) int local7 = Static208.anIntArray366[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4094; local9++) {
			@Pc(29) int local29 = this.anIntArray369[local9] * local7 - this.anIntArray363[local9] * local3 >> 16;
			this.anIntArray363[local9] = this.anIntArray369[local9] * local3 + this.anIntArray363[local9] * local7 >> 16;
			this.anIntArray369[local9] = local29;
		}
		this.method3322();
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)V")
	public void method3330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4094; local1++) {
			this.anIntArray371[local1] += arg0;
			this.anIntArray369[local1] += arg1;
			this.anIntArray363[local1] += arg2;
		}
		this.method3322();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10) {
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(III)V")
	public void method3331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static208.anIntArray364[arg2];
			local9 = Static208.anIntArray366[arg2];
			for (local11 = 0; local11 < this.anInt4094; local11++) {
				local31 = this.anIntArray369[local11] * local5 + this.anIntArray371[local11] * local9 >> 16;
				this.anIntArray369[local11] = this.anIntArray369[local11] * local9 - this.anIntArray371[local11] * local5 >> 16;
				this.anIntArray371[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static208.anIntArray364[arg0];
			local9 = Static208.anIntArray366[arg0];
			for (local11 = 0; local11 < this.anInt4094; local11++) {
				local31 = this.anIntArray369[local11] * local9 - this.anIntArray363[local11] * local5 >> 16;
				this.anIntArray363[local11] = this.anIntArray369[local11] * local5 + this.anIntArray363[local11] * local9 >> 16;
				this.anIntArray369[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static208.anIntArray364[arg1];
		local9 = Static208.anIntArray366[arg1];
		for (local11 = 0; local11 < this.anInt4094; local11++) {
			local31 = this.anIntArray363[local11] * local5 + this.anIntArray371[local11] * local9 >> 16;
			this.anIntArray363[local11] = this.anIntArray363[local11] * local9 - this.anIntArray371[local11] * local5 >> 16;
			this.anIntArray371[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(III)I")
	public int method3333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4094; local1++) {
			if (this.anIntArray371[local1] == arg0 && this.anIntArray369[local1] == 0 && this.anIntArray363[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray371[this.anInt4094] = arg0;
		this.anIntArray369[this.anInt4094] = 0;
		this.anIntArray363[this.anInt4094] = arg1;
		this.anInt4097 = ++this.anInt4094;
		return this.anInt4094 - 1;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(SS)V")
	public void method3334(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray68 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt4096; local5++) {
			if (this.aShortArray68[local5] == arg0) {
				this.aShortArray68[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!en;IIIZ)V")
	@Override
	public void method3356(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class12_Sub7 local2 = (Class12_Sub7) arg0;
		local2.method3343();
		local2.method3336();
		Static208.anInt4093++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray371;
		@Pc(18) int local18 = local2.anInt4097;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt4097; local20++) {
			@Pc(29) Class124 local29 = this.aClass124Array2[local20];
			if (local29.anInt3797 != 0) {
				@Pc(40) int local40 = this.anIntArray369[local20] - arg2;
				if (local40 >= local2.aShort24 && local40 <= local2.aShort27) {
					@Pc(56) int local56 = this.anIntArray371[local20] - arg1;
					if (local56 >= local2.aShort26 && local56 <= local2.aShort22) {
						@Pc(72) int local72 = this.anIntArray363[local20] - arg3;
						if (local72 >= local2.aShort28 && local72 <= local2.aShort25) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class124 local91 = local2.aClass124Array2[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray363[local83] && local40 == local2.anIntArray369[local83] && local91.anInt3797 != 0) {
									if (this.aClass124Array1 == null) {
										this.aClass124Array1 = new Class124[this.anInt4097];
									}
									if (local2.aClass124Array1 == null) {
										local2.aClass124Array1 = new Class124[local18];
									}
									@Pc(131) Class124 local131 = this.aClass124Array1[local20];
									if (local131 == null) {
										local131 = this.aClass124Array1[local20] = new Class124(local29);
									}
									@Pc(148) Class124 local148 = local2.aClass124Array1[local83];
									if (local148 == null) {
										local148 = local2.aClass124Array1[local83] = new Class124(local91);
									}
									local131.anInt3795 += local91.anInt3795;
									local131.anInt3798 += local91.anInt3798;
									local131.anInt3799 += local91.anInt3799;
									local131.anInt3797 += local91.anInt3797;
									local148.anInt3795 += local29.anInt3795;
									local148.anInt3798 += local29.anInt3798;
									local148.anInt3799 += local29.anInt3799;
									local148.anInt3797 += local29.anInt3797;
									local12++;
									Static208.anIntArray362[local20] = Static208.anInt4093;
									Static208.anIntArray370[local83] = Static208.anInt4093;
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
		for (local20 = 0; local20 < this.anInt4096; local20++) {
			if (Static208.anIntArray362[this.anIntArray372[local20]] == Static208.anInt4093 && Static208.anIntArray362[this.anIntArray365[local20]] == Static208.anInt4093 && Static208.anIntArray362[this.anIntArray367[local20]] == Static208.anInt4093) {
				if (this.aByteArray50 == null) {
					this.aByteArray50 = new byte[this.anInt4096];
				}
				this.aByteArray50[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt4096; local20++) {
			if (Static208.anIntArray370[local2.anIntArray372[local20]] == Static208.anInt4093 && Static208.anIntArray370[local2.anIntArray365[local20]] == Static208.anInt4093 && Static208.anIntArray370[local2.anIntArray367[local20]] == Static208.anInt4093) {
				if (local2.aByteArray50 == null) {
					local2.aByteArray50 = new byte[local2.anInt4096];
				}
				local2.aByteArray50[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "()V")
	public void method3335() {
		this.anIntArray361 = null;
		this.anIntArray368 = null;
		this.anIntArrayArray32 = null;
		this.anIntArrayArray33 = null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "()Z")
	@Override
	public boolean method3351() {
		return true;
	}

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "()V")
	public void method3336() {
		if (this.aClass124Array2 != null) {
			return;
		}
		this.aClass124Array2 = new Class124[this.anInt4097];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt4097; local10++) {
			this.aClass124Array2[local10] = new Class124();
		}
		for (local10 = 0; local10 < this.anInt4096; local10++) {
			@Pc(34) int local34 = this.anIntArray372[local10];
			@Pc(39) int local39 = this.anIntArray365[local10];
			@Pc(44) int local44 = this.anIntArray367[local10];
			@Pc(54) int local54 = this.anIntArray371[local39] - this.anIntArray371[local34];
			@Pc(64) int local64 = this.anIntArray369[local39] - this.anIntArray369[local34];
			@Pc(74) int local74 = this.anIntArray363[local39] - this.anIntArray363[local34];
			@Pc(84) int local84 = this.anIntArray371[local44] - this.anIntArray371[local34];
			@Pc(94) int local94 = this.anIntArray369[local44] - this.anIntArray369[local34];
			@Pc(104) int local104 = this.anIntArray363[local44] - this.anIntArray363[local34];
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
			if (this.aByteArray50 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray50[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class124 local214 = this.aClass124Array2[local34];
				local214.anInt3795 += local112;
				local214.anInt3798 += local120;
				local214.anInt3799 += local128;
				local214.anInt3797++;
				@Pc(243) Class124 local243 = this.aClass124Array2[local39];
				local243.anInt3795 += local112;
				local243.anInt3798 += local120;
				local243.anInt3799 += local128;
				local243.anInt3797++;
				@Pc(272) Class124 local272 = this.aClass124Array2[local44];
				local272.anInt3795 += local112;
				local272.anInt3798 += local120;
				local272.anInt3799 += local128;
				local272.anInt3797++;
			} else if (local201 == 1) {
				if (this.aClass36Array1 == null) {
					this.aClass36Array1 = new Class36[this.anInt4096];
				}
				@Pc(317) Class36 local317 = this.aClass36Array1[local10] = new Class36();
				local317.anInt1080 = local112;
				local317.anInt1081 = local120;
				local317.anInt1086 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(III)V")
	public void method3338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4094; local1++) {
			this.anIntArray371[local1] = this.anIntArray371[local1] * arg0 / 128;
			this.anIntArray369[local1] = this.anIntArray369[local1] * arg1 / 128;
			this.anIntArray363[local1] = this.anIntArray363[local1] * arg2 / 128;
		}
		this.method3322();
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "([B)V")
	private void method3339(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class4_Sub17 local8 = new Class4_Sub17(arg0);
		@Pc(13) Class4_Sub17 local13 = new Class4_Sub17(arg0);
		@Pc(18) Class4_Sub17 local18 = new Class4_Sub17(arg0);
		@Pc(23) Class4_Sub17 local23 = new Class4_Sub17(arg0);
		@Pc(28) Class4_Sub17 local28 = new Class4_Sub17(arg0);
		local8.anInt2400 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1837();
		@Pc(42) int local42 = local8.method1837();
		@Pc(46) int local46 = local8.method1874();
		@Pc(50) int local50 = local8.method1874();
		@Pc(54) int local54 = local8.method1874();
		@Pc(58) int local58 = local8.method1874();
		@Pc(62) int local62 = local8.method1874();
		@Pc(66) int local66 = local8.method1874();
		@Pc(70) int local70 = local8.method1837();
		@Pc(74) int local74 = local8.method1837();
		@Pc(78) int local78 = local8.method1837();
		@Pc(82) int local82 = local8.method1837();
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
		this.anInt4094 = local38;
		this.anInt4096 = local42;
		this.anInt4095 = local46;
		this.anIntArray371 = new int[local38];
		this.anIntArray369 = new int[local38];
		this.anIntArray363 = new int[local38];
		this.anIntArray372 = new int[local42];
		this.anIntArray365 = new int[local42];
		this.anIntArray367 = new int[local42];
		if (local46 > 0) {
			this.aByteArray57 = new byte[local46];
			this.aShortArray67 = new short[local46];
			this.aShortArray64 = new short[local46];
			this.aShortArray71 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray361 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray50 = new byte[local42];
			this.aByteArray55 = new byte[local42];
			this.aShortArray68 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray53 = new byte[local42];
		} else {
			this.aByte17 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray52 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray368 = new int[local42];
		}
		this.aShortArray63 = new short[local42];
		local8.anInt2400 = 0;
		local13.anInt2400 = local165;
		local18.anInt2400 = local171;
		local23.anInt2400 = local90;
		local28.anInt2400 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method1874();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method1863();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method1863();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method1863();
			}
			this.anIntArray371[local307] = local301 + local316;
			this.anIntArray369[local307] = local303 + local326;
			this.anIntArray363[local307] = local305 + local336;
			local301 = this.anIntArray371[local307];
			local303 = this.anIntArray369[local307];
			local305 = this.anIntArray363[local307];
			if (local66 == 1) {
				this.anIntArray361[local307] = local28.method1874();
			}
		}
		local8.anInt2400 = local149;
		local13.anInt2400 = local116;
		local18.anInt2400 = local98;
		local23.anInt2400 = local134;
		local28.anInt2400 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray63[local307] = (short) local8.method1837();
			if (local50 == 1) {
				local314 = local13.method1874();
				if ((local314 & 0x1) == 1) {
					this.aByteArray50[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray50[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray55[local307] = (byte) (local314 >> 2);
					this.aShortArray68[local307] = this.aShortArray63[local307];
					this.aShortArray63[local307] = 127;
					if (this.aShortArray68[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray55[local307] = -1;
					this.aShortArray68[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray53[local307] = local18.method1892();
			}
			if (local58 == 1) {
				this.aByteArray52[local307] = local23.method1892();
			}
			if (local62 == 1) {
				this.anIntArray368[local307] = local28.method1874();
			}
		}
		this.anInt4097 = -1;
		local8.anInt2400 = local143;
		local13.anInt2400 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method1874();
			if (local548 == 1) {
				local307 = local8.method1863() + local326;
				local314 = local8.method1863() + local307;
				local316 = local8.method1863() + local314;
				local326 = local316;
				this.anIntArray372[local336] = local307;
				this.anIntArray365[local336] = local314;
				this.anIntArray367[local336] = local316;
				if (local307 > this.anInt4097) {
					this.anInt4097 = local307;
				}
				if (local314 > this.anInt4097) {
					this.anInt4097 = local314;
				}
				if (local316 > this.anInt4097) {
					this.anInt4097 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method1863() + local326;
				local326 = local316;
				this.anIntArray372[local336] = local307;
				this.anIntArray365[local336] = local314;
				this.anIntArray367[local336] = local316;
				if (local316 > this.anInt4097) {
					this.anInt4097 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method1863() + local326;
				local326 = local316;
				this.anIntArray372[local336] = local307;
				this.anIntArray365[local336] = local314;
				this.anIntArray367[local336] = local316;
				if (local316 > this.anInt4097) {
					this.anInt4097 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method1863() + local326;
				local326 = local316;
				this.anIntArray372[local336] = local307;
				this.anIntArray365[local336] = local686;
				this.anIntArray367[local336] = local316;
				if (local316 > this.anInt4097) {
					this.anInt4097 = local316;
				}
			}
		}
		this.anInt4097++;
		local8.anInt2400 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray57[local336] = 0;
			this.aShortArray67[local336] = (short) local8.method1837();
			this.aShortArray64[local336] = (short) local8.method1837();
			this.aShortArray71[local336] = (short) local8.method1837();
		}
		if (this.aByteArray55 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray55[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray67[local686] & 0xFFFF) == this.anIntArray372[local548] && (this.aShortArray64[local686] & 0xFFFF) == this.anIntArray365[local548] && (this.aShortArray71[local686] & 0xFFFF) == this.anIntArray367[local548]) {
						this.aByteArray55[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray55 = null;
			}
		}
		if (!local3) {
			this.aShortArray68 = null;
		}
		if (!local1) {
			this.aByteArray50 = null;
		}
	}

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "()V")
	public void method3340() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4094; local1++) {
			@Pc(10) int local10 = this.anIntArray363[local1];
			this.anIntArray363[local1] = this.anIntArray371[local1];
			this.anIntArray371[local1] = -local10;
		}
		this.method3322();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Lclient!en;")
	@Override
	public Class12 method3359() {
		return this.method3325(this.aShort21, this.aShort23, -50, -10, -50);
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(IIIII)Lclient!cj;")
	public Class12_Sub2_Sub1 method3341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class12_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "()V")
	private void method3343() {
		if (this.aBoolean270) {
			return;
		}
		this.aBoolean270 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt4097; local20++) {
			@Pc(29) int local29 = this.anIntArray371[local20];
			@Pc(34) int local34 = this.anIntArray369[local20];
			@Pc(39) int local39 = this.anIntArray363[local20];
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
		this.aShort26 = (short) local8;
		this.aShort22 = (short) local14;
		this.aShort24 = (short) local10;
		this.aShort27 = (short) local16;
		this.aShort28 = (short) local12;
		this.aShort25 = (short) local18;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	private void method3344(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static208.anIntArray364[arg0];
		@Pc(7) int local7 = Static208.anIntArray366[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4094; local9++) {
			@Pc(29) int local29 = this.anIntArray369[local9] * local3 + this.anIntArray371[local9] * local7 >> 16;
			this.anIntArray369[local9] = this.anIntArray369[local9] * local7 - this.anIntArray371[local9] * local3 >> 16;
			this.anIntArray371[local9] = local29;
		}
		this.method3322();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!pn;")
	public Class12_Sub7 method3345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method3343();
		@Pc(6) int local6 = arg4 + this.aShort26;
		@Pc(11) int local11 = arg4 + this.aShort22;
		@Pc(16) int local16 = arg6 + this.aShort28;
		@Pc(21) int local21 = arg6 + this.aShort25;
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
		@Pc(147) Class12_Sub7 local147 = new Class12_Sub7();
		local147.anInt4094 = this.anInt4094;
		local147.anInt4097 = this.anInt4097;
		local147.anInt4096 = this.anInt4096;
		local147.anInt4095 = this.anInt4095;
		local147.anIntArray372 = this.anIntArray372;
		local147.anIntArray365 = this.anIntArray365;
		local147.anIntArray367 = this.anIntArray367;
		local147.aByteArray50 = this.aByteArray50;
		local147.aByteArray53 = this.aByteArray53;
		local147.aByteArray52 = this.aByteArray52;
		local147.aByteArray55 = this.aByteArray55;
		local147.aShortArray63 = this.aShortArray63;
		local147.aShortArray68 = this.aShortArray68;
		local147.aByte17 = this.aByte17;
		local147.aByteArray57 = this.aByteArray57;
		local147.aShortArray67 = this.aShortArray67;
		local147.aShortArray64 = this.aShortArray64;
		local147.aShortArray71 = this.aShortArray71;
		local147.aShortArray66 = this.aShortArray66;
		local147.aShortArray72 = this.aShortArray72;
		local147.aShortArray70 = this.aShortArray70;
		local147.aByteArray58 = this.aByteArray58;
		local147.aByteArray56 = this.aByteArray56;
		local147.aByteArray49 = this.aByteArray49;
		local147.aByteArray54 = this.aByteArray54;
		local147.aByteArray51 = this.aByteArray51;
		local147.anIntArray361 = this.anIntArray361;
		local147.anIntArray368 = this.anIntArray368;
		local147.anIntArrayArray32 = this.anIntArrayArray32;
		local147.anIntArrayArray33 = this.anIntArrayArray33;
		local147.aShort21 = this.aShort21;
		local147.aShort23 = this.aShort23;
		local147.aClass124Array2 = this.aClass124Array2;
		local147.aClass36Array1 = this.aClass36Array1;
		local147.aClass124Array1 = this.aClass124Array1;
		if (arg0 == 3) {
			local147.anIntArray371 = Static10.method176(this.anIntArray371);
			local147.anIntArray369 = Static10.method176(this.anIntArray369);
			local147.anIntArray363 = Static10.method176(this.anIntArray363);
		} else {
			local147.anIntArray371 = this.anIntArray371;
			local147.anIntArray369 = new int[local147.anInt4094];
			local147.anIntArray363 = this.anIntArray363;
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
			for (local330 = 0; local330 < local147.anInt4097; local330++) {
				local341 = this.anIntArray371[local330] + arg4;
				local348 = this.anIntArray363[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
				local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
				local424 = local386 * (128 - local356) + local412 * local356 >> 7;
				local147.anIntArray369[local330] = this.anIntArray369[local330] + local424 - arg5;
			}
			for (local330 = local147.anInt4097; local330 < local147.anInt4094; local330++) {
				local341 = this.anIntArray371[local330] + arg4;
				local348 = this.anIntArray363[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				if (local360 >= 0 && local360 < arg2.length - 1 && local364 >= 0 && local364 < arg2[0].length - 1) {
					local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
					local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
					local424 = local386 * (128 - local356) + local412 * local356 >> 7;
					local147.anIntArray369[local330] = this.anIntArray369[local330] + local424 - arg5;
				}
			}
		} else {
			@Pc(681) int local681;
			if (arg0 == 2) {
				for (local330 = 0; local330 < local147.anInt4097; local330++) {
					local341 = (this.anIntArray369[local330] << 16) / this.aShort24;
					if (local341 < arg1) {
						local348 = this.anIntArray371[local330] + arg4;
						local352 = this.anIntArray363[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
						local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray369[local330] = this.anIntArray369[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
					} else {
						local147.anIntArray369[local330] = this.anIntArray369[local330];
					}
				}
				for (local330 = local147.anInt4097; local330 < local147.anInt4094; local330++) {
					local341 = (this.anIntArray369[local330] << 16) / this.aShort24;
					if (local341 < arg1) {
						local348 = this.anIntArray371[local330] + arg4;
						local352 = this.anIntArray363[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						if (local364 >= 0 && local364 < arg2.length - 1 && local386 >= 0 && local386 < arg2[0].length - 1) {
							local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
							local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
							local681 = local412 * (128 - local360) + local424 * local360 >> 7;
							local147.anIntArray369[local330] = this.anIntArray369[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
						}
					} else {
						local147.anIntArray369[local330] = this.anIntArray369[local330];
					}
				}
			} else if (arg0 == 3) {
				local330 = (arg1 & 0xFF) * 4;
				local341 = (arg1 >> 8 & 0xFF) * 4;
				local147.method3320(arg2, arg4, arg5, arg6, local330, local341);
			} else if (arg0 == 4) {
				local330 = this.aShort27 - this.aShort24;
				for (local341 = 0; local341 < this.anInt4097; local341++) {
					local348 = this.anIntArray371[local341] + arg4;
					local352 = this.anIntArray363[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
					local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
					local681 = local412 * (128 - local360) + local424 * local360 >> 7;
					local147.anIntArray369[local341] = this.anIntArray369[local341] + local681 + local330 - arg5;
				}
				for (local341 = local147.anInt4097; local341 < local147.anInt4094; local341++) {
					local348 = this.anIntArray371[local341] + arg4;
					local352 = this.anIntArray363[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					if (local364 >= 0 && local364 < arg3.length - 1 && local386 >= 0 && local386 < arg3[0].length - 1) {
						local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
						local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray369[local341] = this.anIntArray369[local341] + local681 + local330 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local330 = this.aShort27 - this.aShort24;
				@Pc(1314) int local1314;
				@Pc(1318) int local1318;
				for (local341 = 0; local341 < this.anInt4097; local341++) {
					local348 = this.anIntArray371[local341] + arg4;
					local352 = this.anIntArray363[local341] + arg6;
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
					local147.anIntArray369[local341] = ((this.anIntArray369[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
				}
				for (local341 = local147.anInt4097; local341 < local147.anInt4094; local341++) {
					local348 = this.anIntArray371[local341] + arg4;
					local352 = this.anIntArray363[local341] + arg6;
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
						local147.anIntArray369[local341] = ((this.anIntArray369[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
					}
				}
			}
		}
		this.aBoolean270 = false;
		return local147;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V")
	public void method3346() {
		@Pc(3) int local3 = Static208.anIntArray364[256];
		@Pc(7) int local7 = Static208.anIntArray366[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4094; local9++) {
			@Pc(29) int local29 = this.anIntArray363[local9] * local3 + this.anIntArray371[local9] * local7 >> 16;
			this.anIntArray363[local9] = this.anIntArray363[local9] * local7 - this.anIntArray371[local9] * local3 >> 16;
			this.anIntArray371[local9] = local29;
		}
		this.method3322();
	}

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "()V")
	public void method3347() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4094; local1++) {
			this.anIntArray371[local1] = -this.anIntArray371[local1];
			this.anIntArray363[local1] = -this.anIntArray363[local1];
		}
		this.method3322();
	}
}
