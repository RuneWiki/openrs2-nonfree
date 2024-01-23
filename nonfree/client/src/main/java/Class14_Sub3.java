import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
	public int anInt1153;

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "[Lclient!sg;")
	public Class151[] aClass151Array1;

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "[I")
	public int[] anIntArray111;

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!dl", name = "u", descriptor = "[Lclient!ok;")
	public Class123[] aClass123Array1;

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!dl", name = "y", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!dl", name = "z", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!dl", name = "A", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!dl", name = "D", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!dl", name = "E", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!dl", name = "F", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!dl", name = "G", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!dl", name = "H", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!dl", name = "J", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!dl", name = "K", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!dl", name = "L", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!dl", name = "M", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!dl", name = "N", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!dl", name = "Q", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!dl", name = "S", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!dl", name = "U", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!dl", name = "V", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!dl", name = "W", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!dl", name = "Y", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!dl", name = "Z", descriptor = "[Lclient!sg;")
	public Class151[] aClass151Array2;

	@OriginalMember(owner = "client!dl", name = "ab", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!dl", name = "bb", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!dl", name = "cb", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!dl", name = "db", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!dl", name = "eb", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!dl", name = "fb", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!dl", name = "gb", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!dl", name = "hb", descriptor = "[I")
	public int[] anIntArray122;

	@OriginalMember(owner = "client!dl", name = "ib", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!dl", name = "kb", descriptor = "S")
	public short aShort8;

	@OriginalMember(owner = "client!dl", name = "lb", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!dl", name = "nb", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!dl", name = "ob", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
	public int anInt1154 = 0;

	@OriginalMember(owner = "client!dl", name = "x", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
	public int anInt1156 = 0;

	@OriginalMember(owner = "client!dl", name = "jb", descriptor = "I")
	public int anInt1157 = 0;

	@OriginalMember(owner = "client!dl", name = "mb", descriptor = "B")
	public byte aByte2 = 0;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	private Class14_Sub3() {
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([B)V")
	public Class14_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1001(arg0);
		} else {
			this.method994(arg0);
		}
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(III)V")
	public Class14_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray116 = new int[arg0];
		this.anIntArray115 = new int[arg0];
		this.anIntArray121 = new int[arg0];
		this.anIntArray122 = new int[arg0];
		this.anIntArray111 = new int[arg1];
		this.anIntArray112 = new int[arg1];
		this.anIntArray113 = new int[arg1];
		this.aByteArray21 = new byte[arg1];
		this.aByteArray17 = new byte[arg1];
		this.aByteArray26 = new byte[arg1];
		this.aShortArray18 = new short[arg1];
		this.aShortArray19 = new short[arg1];
		this.aByteArray22 = new byte[arg1];
		this.anIntArray114 = new int[arg1];
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([Lclient!dl;I)V")
	public Class14_Sub3(@OriginalArg(0) Class14_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt1156 = 0;
		this.anInt1154 = 0;
		this.anInt1153 = 0;
		this.aByte2 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class14_Sub3 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt1156 += local53.anInt1156;
				this.anInt1154 += local53.anInt1154;
				this.anInt1153 += local53.anInt1153;
				if (local53.aByteArray17 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local53.aByte2;
					}
					if (this.aByte2 != local53.aByte2) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray21 != null;
				local22 |= local53.aByteArray26 != null;
				local24 |= local53.anIntArray114 != null;
				local26 |= local53.aShortArray19 != null;
				local28 |= local53.aByteArray22 != null;
			}
		}
		this.anIntArray116 = new int[this.anInt1156];
		this.anIntArray115 = new int[this.anInt1156];
		this.anIntArray121 = new int[this.anInt1156];
		this.anIntArray122 = new int[this.anInt1156];
		this.aShortArray20 = new short[this.anInt1156];
		this.anIntArray111 = new int[this.anInt1154];
		this.anIntArray112 = new int[this.anInt1154];
		this.anIntArray113 = new int[this.anInt1154];
		if (local18) {
			this.aByteArray21 = new byte[this.anInt1154];
		}
		if (local20) {
			this.aByteArray17 = new byte[this.anInt1154];
		}
		if (local22) {
			this.aByteArray26 = new byte[this.anInt1154];
		}
		if (local24) {
			this.anIntArray114 = new int[this.anInt1154];
		}
		if (local26) {
			this.aShortArray19 = new short[this.anInt1154];
		}
		if (local28) {
			this.aByteArray22 = new byte[this.anInt1154];
		}
		this.aShortArray18 = new short[this.anInt1154];
		this.aShortArray15 = new short[this.anInt1154];
		if (this.anInt1153 > 0) {
			this.aByteArray24 = new byte[this.anInt1153];
			this.aShortArray16 = new short[this.anInt1153];
			this.aShortArray21 = new short[this.anInt1153];
			this.aShortArray22 = new short[this.anInt1153];
			this.aShortArray13 = new short[this.anInt1153];
			this.aShortArray14 = new short[this.anInt1153];
			this.aShortArray17 = new short[this.anInt1153];
			this.aByteArray18 = new byte[this.anInt1153];
			this.aByteArray23 = new byte[this.anInt1153];
			this.aByteArray25 = new byte[this.anInt1153];
			this.aByteArray19 = new byte[this.anInt1153];
			this.aByteArray20 = new byte[this.anInt1153];
		}
		this.anInt1156 = 0;
		this.anInt1154 = 0;
		this.anInt1153 = 0;
		@Pc(330) Class14_Sub3 local330;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(326) short local326 = (short) (0x1 << local46);
			local330 = arg0[local46];
			if (local330 != null) {
				for (@Pc(334) int local334 = 0; local334 < local330.anInt1154; local334++) {
					if (local18 && local330.aByteArray21 != null) {
						this.aByteArray21[this.anInt1154] = local330.aByteArray21[local334];
					}
					if (local20) {
						if (local330.aByteArray17 == null) {
							this.aByteArray17[this.anInt1154] = local330.aByte2;
						} else {
							this.aByteArray17[this.anInt1154] = local330.aByteArray17[local334];
						}
					}
					if (local22 && local330.aByteArray26 != null) {
						this.aByteArray26[this.anInt1154] = local330.aByteArray26[local334];
					}
					if (local24 && local330.anIntArray114 != null) {
						this.anIntArray114[this.anInt1154] = local330.anIntArray114[local334];
					}
					if (local26) {
						if (local330.aShortArray19 == null) {
							this.aShortArray19[this.anInt1154] = -1;
						} else {
							this.aShortArray19[this.anInt1154] = local330.aShortArray19[local334];
						}
					}
					this.aShortArray18[this.anInt1154] = local330.aShortArray18[local334];
					this.aShortArray15[this.anInt1154] = local326;
					this.anIntArray111[this.anInt1154] = this.method988(local330, local330.anIntArray111[local334], local326);
					this.anIntArray112[this.anInt1154] = this.method988(local330, local330.anIntArray112[local334], local326);
					this.anIntArray113[this.anInt1154] = this.method988(local330, local330.anIntArray113[local334], local326);
					this.anInt1154++;
				}
			}
		}
		local46 = 0;
		this.anInt1157 = this.anInt1156;
		for (@Pc(495) int local495 = 0; local495 < arg1; local495++) {
			local330 = arg0[local495];
			@Pc(507) short local507 = (short) (0x1 << local495);
			if (local330 != null) {
				@Pc(511) int local511;
				for (local511 = 0; local511 < local330.anInt1154; local511++) {
					if (local28) {
						this.aByteArray22[local46++] = (byte) (local330.aByteArray22 == null || local330.aByteArray22[local511] == -1 ? -1 : local330.aByteArray22[local511] + this.anInt1153);
					}
				}
				for (local511 = 0; local511 < local330.anInt1153; local511++) {
					@Pc(560) byte local560 = this.aByteArray24[this.anInt1153] = local330.aByteArray24[local511];
					if (local560 == 0) {
						this.aShortArray16[this.anInt1153] = (short) this.method988(local330, local330.aShortArray16[local511], local507);
						this.aShortArray21[this.anInt1153] = (short) this.method988(local330, local330.aShortArray21[local511], local507);
						this.aShortArray22[this.anInt1153] = (short) this.method988(local330, local330.aShortArray22[local511], local507);
					}
					if (local560 >= 1 && local560 <= 3) {
						this.aShortArray16[this.anInt1153] = local330.aShortArray16[local511];
						this.aShortArray21[this.anInt1153] = local330.aShortArray21[local511];
						this.aShortArray22[this.anInt1153] = local330.aShortArray22[local511];
						this.aShortArray13[this.anInt1153] = local330.aShortArray13[local511];
						this.aShortArray14[this.anInt1153] = local330.aShortArray14[local511];
						this.aShortArray17[this.anInt1153] = local330.aShortArray17[local511];
						this.aByteArray18[this.anInt1153] = local330.aByteArray18[local511];
						this.aByteArray23[this.anInt1153] = local330.aByteArray23[local511];
						this.aByteArray25[this.anInt1153] = local330.aByteArray25[local511];
					}
					if (local560 == 2) {
						this.aByteArray19[this.anInt1153] = local330.aByteArray19[local511];
						this.aByteArray20[this.anInt1153] = local330.aByteArray20[local511];
					}
					this.anInt1153++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!dl;ZZZZ)V")
	public Class14_Sub3(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1156 = arg0.anInt1156;
		this.anInt1157 = arg0.anInt1157;
		this.anInt1154 = arg0.anInt1154;
		this.anInt1153 = arg0.anInt1153;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray116 = arg0.anIntArray116;
			this.anIntArray115 = arg0.anIntArray115;
			this.anIntArray121 = arg0.anIntArray121;
		} else {
			this.anIntArray116 = new int[this.anInt1156];
			this.anIntArray115 = new int[this.anInt1156];
			this.anIntArray121 = new int[this.anInt1156];
			for (local64 = 0; local64 < this.anInt1156; local64++) {
				this.anIntArray116[local64] = arg0.anIntArray116[local64];
				this.anIntArray115[local64] = arg0.anIntArray115[local64];
				this.anIntArray121[local64] = arg0.anIntArray121[local64];
			}
		}
		if (arg2) {
			this.aShortArray18 = arg0.aShortArray18;
		} else {
			this.aShortArray18 = new short[this.anInt1154];
			for (local64 = 0; local64 < this.anInt1154; local64++) {
				this.aShortArray18[local64] = arg0.aShortArray18[local64];
			}
		}
		if (arg3 || arg0.aShortArray19 == null) {
			this.aShortArray19 = arg0.aShortArray19;
		} else {
			this.aShortArray19 = new short[this.anInt1154];
			for (local64 = 0; local64 < this.anInt1154; local64++) {
				this.aShortArray19[local64] = arg0.aShortArray19[local64];
			}
		}
		this.aByteArray26 = arg0.aByteArray26;
		this.anIntArray111 = arg0.anIntArray111;
		this.anIntArray112 = arg0.anIntArray112;
		this.anIntArray113 = arg0.anIntArray113;
		this.aByteArray21 = arg0.aByteArray21;
		this.aByteArray17 = arg0.aByteArray17;
		this.aByteArray22 = arg0.aByteArray22;
		this.aByte2 = arg0.aByte2;
		this.aByteArray24 = arg0.aByteArray24;
		this.aShortArray16 = arg0.aShortArray16;
		this.aShortArray21 = arg0.aShortArray21;
		this.aShortArray22 = arg0.aShortArray22;
		this.aShortArray13 = arg0.aShortArray13;
		this.aShortArray14 = arg0.aShortArray14;
		this.aShortArray17 = arg0.aShortArray17;
		this.aByteArray18 = arg0.aByteArray18;
		this.aByteArray23 = arg0.aByteArray23;
		this.aByteArray25 = arg0.aByteArray25;
		this.aByteArray19 = arg0.aByteArray19;
		this.aByteArray20 = arg0.aByteArray20;
		this.anIntArray122 = arg0.anIntArray122;
		this.anIntArray114 = arg0.anIntArray114;
		this.anIntArrayArray4 = arg0.anIntArrayArray4;
		this.anIntArrayArray5 = arg0.anIntArrayArray5;
		this.aClass151Array1 = arg0.aClass151Array1;
		this.aClass123Array1 = arg0.aClass123Array1;
		this.aClass151Array2 = arg0.aClass151Array2;
		this.aShort8 = arg0.aShort8;
		this.aShort6 = arg0.aShort6;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "()V")
	public void method975() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray122 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1156; local9++) {
				local18 = this.anIntArray122[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray4 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray4[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt1156) {
				local18 = this.anIntArray122[local9];
				this.anIntArrayArray4[local18][local5[local18]++] = local9++;
			}
			this.anIntArray122 = null;
		}
		if (this.anIntArray114 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1154; local9++) {
			local18 = this.anIntArray114[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray5 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray5[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt1154) {
			local18 = this.anIntArray114[local9];
			this.anIntArrayArray5[local18][local5[local18]++] = local9++;
		}
		this.anIntArray114 = null;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)V")
	public void method977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1156; local1++) {
			this.anIntArray116[local1] = this.anIntArray116[local1] * arg0 / 128;
			this.anIntArray115[local1] = this.anIntArray115[local1] * arg1 / 128;
			this.anIntArray121[local1] = this.anIntArray121[local1] * arg2 / 128;
		}
		this.method980();
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "()Z")
	@Override
	public boolean method4093() {
		return true;
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "()V")
	public void method978() {
		this.anIntArray122 = null;
		this.anIntArray114 = null;
		this.anIntArrayArray4 = null;
		this.anIntArrayArray5 = null;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(SS)V")
	public void method979(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray19 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt1154; local5++) {
			if (this.aShortArray19[local5] == arg0) {
				this.aShortArray19[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "()V")
	private void method980() {
		this.aClass151Array1 = null;
		this.aClass151Array2 = null;
		this.aClass123Array1 = null;
		this.aBoolean81 = false;
	}

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "()V")
	public void method981() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1156; local1++) {
			@Pc(10) int local10 = this.anIntArray121[local1];
			this.anIntArray121[local1] = this.anIntArray116[local1];
			this.anIntArray116[local1] = -local10;
		}
		this.method980();
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(SS)V")
	public void method982(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1154; local1++) {
			if (this.aShortArray18[local1] == arg0) {
				this.aShortArray18[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(III)I")
	public int method983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1156; local1++) {
			if (this.anIntArray116[local1] == arg0 && this.anIntArray115[local1] == 0 && this.anIntArray121[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray116[this.anInt1156] = arg0;
		this.anIntArray115[this.anInt1156] = 0;
		this.anIntArray121[this.anInt1156] = arg1;
		this.anInt1157 = ++this.anInt1156;
		return this.anInt1156 - 1;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!dn;IIIZ)V")
	@Override
	public void method4090(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class14_Sub3 local2 = (Class14_Sub3) arg0;
		local2.method999();
		local2.method1002();
		Static51.anInt1155++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray116;
		@Pc(18) int local18 = local2.anInt1157;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt1157; local20++) {
			@Pc(29) Class151 local29 = this.aClass151Array1[local20];
			if (local29.anInt4774 != 0) {
				@Pc(40) int local40 = this.anIntArray115[local20] - arg2;
				if (local40 >= local2.aShort3 && local40 <= local2.aShort4) {
					@Pc(56) int local56 = this.anIntArray116[local20] - arg1;
					if (local56 >= local2.aShort7 && local56 <= local2.aShort5) {
						@Pc(72) int local72 = this.anIntArray121[local20] - arg3;
						if (local72 >= local2.aShort2 && local72 <= local2.aShort1) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class151 local91 = local2.aClass151Array1[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray121[local83] && local40 == local2.anIntArray115[local83] && local91.anInt4774 != 0) {
									if (this.aClass151Array2 == null) {
										this.aClass151Array2 = new Class151[this.anInt1157];
									}
									if (local2.aClass151Array2 == null) {
										local2.aClass151Array2 = new Class151[local18];
									}
									@Pc(131) Class151 local131 = this.aClass151Array2[local20];
									if (local131 == null) {
										local131 = this.aClass151Array2[local20] = new Class151(local29);
									}
									@Pc(148) Class151 local148 = local2.aClass151Array2[local83];
									if (local148 == null) {
										local148 = local2.aClass151Array2[local83] = new Class151(local91);
									}
									local131.anInt4775 += local91.anInt4775;
									local131.anInt4776 += local91.anInt4776;
									local131.anInt4770 += local91.anInt4770;
									local131.anInt4774 += local91.anInt4774;
									local148.anInt4775 += local29.anInt4775;
									local148.anInt4776 += local29.anInt4776;
									local148.anInt4770 += local29.anInt4770;
									local148.anInt4774 += local29.anInt4774;
									local12++;
									Static51.anIntArray118[local20] = Static51.anInt1155;
									Static51.anIntArray119[local83] = Static51.anInt1155;
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
		for (local20 = 0; local20 < this.anInt1154; local20++) {
			if (Static51.anIntArray118[this.anIntArray111[local20]] == Static51.anInt1155 && Static51.anIntArray118[this.anIntArray112[local20]] == Static51.anInt1155 && Static51.anIntArray118[this.anIntArray113[local20]] == Static51.anInt1155) {
				if (this.aByteArray21 == null) {
					this.aByteArray21 = new byte[this.anInt1154];
				}
				this.aByteArray21[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt1154; local20++) {
			if (Static51.anIntArray119[local2.anIntArray111[local20]] == Static51.anInt1155 && Static51.anIntArray119[local2.anIntArray112[local20]] == Static51.anInt1155 && Static51.anIntArray119[local2.anIntArray113[local20]] == Static51.anInt1155) {
				if (local2.aByteArray21 == null) {
					local2.aByteArray21 = new byte[local2.anInt1154];
				}
				local2.aByteArray21[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(IIIII)Lclient!q;")
	public Class14_Sub6 method984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static277.aBoolean412) {
			@Pc(9) Class14_Sub6_Sub1 local9 = new Class14_Sub6_Sub1(this, arg0, arg1, true);
			local9.method2465();
			return local9;
		} else {
			return new Class14_Sub6_Sub2(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "()V")
	public void method986() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt1156; local1++) {
			this.anIntArray121[local1] = -this.anIntArray121[local1];
		}
		for (local1 = 0; local1 < this.anInt1154; local1++) {
			@Pc(27) int local27 = this.anIntArray111[local1];
			this.anIntArray111[local1] = this.anIntArray113[local1];
			this.anIntArray113[local1] = local27;
		}
		this.method980();
	}

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "()V")
	public void method987() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1156; local1++) {
			this.anIntArray116[local1] = -this.anIntArray116[local1];
			this.anIntArray121[local1] = -this.anIntArray121[local1];
		}
		this.method980();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!dl;IS)I")
	private int method988(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray116[arg1];
		@Pc(9) int local9 = arg0.anIntArray115[arg1];
		@Pc(14) int local14 = arg0.anIntArray121[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1156; local16++) {
			if (local4 == this.anIntArray116[local16] && local9 == this.anIntArray115[local16] && local14 == this.anIntArray121[local16]) {
				this.aShortArray20[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray116[this.anInt1156] = local4;
		this.anIntArray115[this.anInt1156] = local9;
		this.anIntArray121[this.anInt1156] = local14;
		this.aShortArray20[this.anInt1156] = arg2;
		if (arg0.anIntArray122 != null) {
			this.anIntArray122[this.anInt1156] = arg0.anIntArray122[arg1];
		}
		return this.anInt1156++;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIBSB)I")
	public int method990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray111[this.anInt1154] = arg0;
		this.anIntArray112[this.anInt1154] = arg1;
		this.anIntArray113[this.anInt1154] = arg2;
		this.aByteArray21[this.anInt1154] = 1;
		this.aByteArray22[this.anInt1154] = -1;
		this.aShortArray18[this.anInt1154] = arg3;
		this.aShortArray19[this.anInt1154] = -1;
		this.aByteArray26[this.anInt1154] = arg4;
		return this.anInt1154++;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "()I")
	@Override
	public int method4091() {
		if (!this.aBoolean81) {
			this.method999();
		}
		return this.aShort3;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([[IIIIII)V")
	private void method991(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static51.method989(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static51.method989(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static51.method989(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static51.method989(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method993(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method1003(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method995(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!dl;")
	public Class14_Sub3 method992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method999();
		@Pc(6) int local6 = arg4 + this.aShort7;
		@Pc(11) int local11 = arg4 + this.aShort5;
		@Pc(16) int local16 = arg6 + this.aShort2;
		@Pc(21) int local21 = arg6 + this.aShort1;
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
		@Pc(147) Class14_Sub3 local147 = new Class14_Sub3();
		local147.anInt1156 = this.anInt1156;
		local147.anInt1157 = this.anInt1157;
		local147.anInt1154 = this.anInt1154;
		local147.anInt1153 = this.anInt1153;
		local147.anIntArray111 = this.anIntArray111;
		local147.anIntArray112 = this.anIntArray112;
		local147.anIntArray113 = this.anIntArray113;
		local147.aByteArray21 = this.aByteArray21;
		local147.aByteArray17 = this.aByteArray17;
		local147.aByteArray26 = this.aByteArray26;
		local147.aByteArray22 = this.aByteArray22;
		local147.aShortArray18 = this.aShortArray18;
		local147.aShortArray19 = this.aShortArray19;
		local147.aByte2 = this.aByte2;
		local147.aByteArray24 = this.aByteArray24;
		local147.aShortArray16 = this.aShortArray16;
		local147.aShortArray21 = this.aShortArray21;
		local147.aShortArray22 = this.aShortArray22;
		local147.aShortArray13 = this.aShortArray13;
		local147.aShortArray14 = this.aShortArray14;
		local147.aShortArray17 = this.aShortArray17;
		local147.aByteArray18 = this.aByteArray18;
		local147.aByteArray23 = this.aByteArray23;
		local147.aByteArray25 = this.aByteArray25;
		local147.aByteArray19 = this.aByteArray19;
		local147.aByteArray20 = this.aByteArray20;
		local147.anIntArray122 = this.anIntArray122;
		local147.anIntArray114 = this.anIntArray114;
		local147.anIntArrayArray4 = this.anIntArrayArray4;
		local147.anIntArrayArray5 = this.anIntArrayArray5;
		local147.aShort8 = this.aShort8;
		local147.aShort6 = this.aShort6;
		local147.aClass151Array1 = this.aClass151Array1;
		local147.aClass123Array1 = this.aClass123Array1;
		local147.aClass151Array2 = this.aClass151Array2;
		if (arg0 == 3) {
			local147.anIntArray116 = Static139.method2337(this.anIntArray116);
			local147.anIntArray115 = Static139.method2337(this.anIntArray115);
			local147.anIntArray121 = Static139.method2337(this.anIntArray121);
		} else {
			local147.anIntArray116 = this.anIntArray116;
			local147.anIntArray115 = new int[local147.anInt1156];
			local147.anIntArray121 = this.anIntArray121;
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
			for (local330 = 0; local330 < local147.anInt1157; local330++) {
				local341 = this.anIntArray116[local330] + arg4;
				local348 = this.anIntArray121[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
				local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
				local424 = local386 * (128 - local356) + local412 * local356 >> 7;
				local147.anIntArray115[local330] = this.anIntArray115[local330] + local424 - arg5;
			}
			for (local330 = local147.anInt1157; local330 < local147.anInt1156; local330++) {
				local341 = this.anIntArray116[local330] + arg4;
				local348 = this.anIntArray121[local330] + arg6;
				local352 = local341 & 0x7F;
				local356 = local348 & 0x7F;
				local360 = local341 >> 7;
				local364 = local348 >> 7;
				if (local360 >= 0 && local360 < arg2.length - 1 && local364 >= 0 && local364 < arg2[0].length - 1) {
					local386 = arg2[local360][local364] * (128 - local352) + arg2[local360 + 1][local364] * local352 >> 7;
					local412 = arg2[local360][local364 + 1] * (128 - local352) + arg2[local360 + 1][local364 + 1] * local352 >> 7;
					local424 = local386 * (128 - local356) + local412 * local356 >> 7;
					local147.anIntArray115[local330] = this.anIntArray115[local330] + local424 - arg5;
				}
			}
		} else {
			@Pc(681) int local681;
			if (arg0 == 2) {
				for (local330 = 0; local330 < local147.anInt1157; local330++) {
					local341 = (this.anIntArray115[local330] << 16) / this.aShort3;
					if (local341 < arg1) {
						local348 = this.anIntArray116[local330] + arg4;
						local352 = this.anIntArray121[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
						local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray115[local330] = this.anIntArray115[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
					} else {
						local147.anIntArray115[local330] = this.anIntArray115[local330];
					}
				}
				for (local330 = local147.anInt1157; local330 < local147.anInt1156; local330++) {
					local341 = (this.anIntArray115[local330] << 16) / this.aShort3;
					if (local341 < arg1) {
						local348 = this.anIntArray116[local330] + arg4;
						local352 = this.anIntArray121[local330] + arg6;
						local356 = local348 & 0x7F;
						local360 = local352 & 0x7F;
						local364 = local348 >> 7;
						local386 = local352 >> 7;
						if (local364 >= 0 && local364 < arg2.length - 1 && local386 >= 0 && local386 < arg2[0].length - 1) {
							local412 = arg2[local364][local386] * (128 - local356) + arg2[local364 + 1][local386] * local356 >> 7;
							local424 = arg2[local364][local386 + 1] * (128 - local356) + arg2[local364 + 1][local386 + 1] * local356 >> 7;
							local681 = local412 * (128 - local360) + local424 * local360 >> 7;
							local147.anIntArray115[local330] = this.anIntArray115[local330] + (local681 - arg5) * (arg1 - local341) / arg1;
						}
					} else {
						local147.anIntArray115[local330] = this.anIntArray115[local330];
					}
				}
			} else if (arg0 == 3) {
				local330 = (arg1 & 0xFF) * 4;
				local341 = (arg1 >> 8 & 0xFF) * 4;
				local147.method991(arg2, arg4, arg5, arg6, local330, local341);
			} else if (arg0 == 4) {
				local330 = this.aShort4 - this.aShort3;
				for (local341 = 0; local341 < this.anInt1157; local341++) {
					local348 = this.anIntArray116[local341] + arg4;
					local352 = this.anIntArray121[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
					local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
					local681 = local412 * (128 - local360) + local424 * local360 >> 7;
					local147.anIntArray115[local341] = this.anIntArray115[local341] + local681 + local330 - arg5;
				}
				for (local341 = local147.anInt1157; local341 < local147.anInt1156; local341++) {
					local348 = this.anIntArray116[local341] + arg4;
					local352 = this.anIntArray121[local341] + arg6;
					local356 = local348 & 0x7F;
					local360 = local352 & 0x7F;
					local364 = local348 >> 7;
					local386 = local352 >> 7;
					if (local364 >= 0 && local364 < arg3.length - 1 && local386 >= 0 && local386 < arg3[0].length - 1) {
						local412 = arg3[local364][local386] * (128 - local356) + arg3[local364 + 1][local386] * local356 >> 7;
						local424 = arg3[local364][local386 + 1] * (128 - local356) + arg3[local364 + 1][local386 + 1] * local356 >> 7;
						local681 = local412 * (128 - local360) + local424 * local360 >> 7;
						local147.anIntArray115[local341] = this.anIntArray115[local341] + local681 + local330 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local330 = this.aShort4 - this.aShort3;
				@Pc(1314) int local1314;
				@Pc(1318) int local1318;
				for (local341 = 0; local341 < this.anInt1157; local341++) {
					local348 = this.anIntArray116[local341] + arg4;
					local352 = this.anIntArray121[local341] + arg6;
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
					local147.anIntArray115[local341] = ((this.anIntArray115[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
				}
				for (local341 = local147.anInt1157; local341 < local147.anInt1156; local341++) {
					local348 = this.anIntArray116[local341] + arg4;
					local352 = this.anIntArray121[local341] + arg6;
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
						local147.anIntArray115[local341] = ((this.anIntArray115[local341] << 8) / local330 * local1318 >> 8) - (arg5 - local681);
					}
				}
			}
		}
		this.aBoolean81 = false;
		return local147;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
	private void method993(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static51.anIntArray117[arg0];
		@Pc(7) int local7 = Static51.anIntArray120[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1156; local9++) {
			@Pc(29) int local29 = this.anIntArray115[local9] * local7 - this.anIntArray121[local9] * local3 >> 16;
			this.anIntArray121[local9] = this.anIntArray115[local9] * local3 + this.anIntArray121[local9] * local7 >> 16;
			this.anIntArray115[local9] = local29;
		}
		this.method980();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([B)V")
	private void method994(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub11 local8 = new Class1_Sub11(arg0);
		@Pc(13) Class1_Sub11 local13 = new Class1_Sub11(arg0);
		@Pc(18) Class1_Sub11 local18 = new Class1_Sub11(arg0);
		@Pc(23) Class1_Sub11 local23 = new Class1_Sub11(arg0);
		@Pc(28) Class1_Sub11 local28 = new Class1_Sub11(arg0);
		local8.anInt3264 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2691();
		@Pc(42) int local42 = local8.method2691();
		@Pc(46) int local46 = local8.method2690();
		@Pc(50) int local50 = local8.method2690();
		@Pc(54) int local54 = local8.method2690();
		@Pc(58) int local58 = local8.method2690();
		@Pc(62) int local62 = local8.method2690();
		@Pc(66) int local66 = local8.method2690();
		@Pc(70) int local70 = local8.method2691();
		@Pc(74) int local74 = local8.method2691();
		@Pc(78) int local78 = local8.method2691();
		@Pc(82) int local82 = local8.method2691();
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
		this.anInt1156 = local38;
		this.anInt1154 = local42;
		this.anInt1153 = local46;
		this.anIntArray116 = new int[local38];
		this.anIntArray115 = new int[local38];
		this.anIntArray121 = new int[local38];
		this.anIntArray111 = new int[local42];
		this.anIntArray112 = new int[local42];
		this.anIntArray113 = new int[local42];
		if (local46 > 0) {
			this.aByteArray24 = new byte[local46];
			this.aShortArray16 = new short[local46];
			this.aShortArray21 = new short[local46];
			this.aShortArray22 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray122 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray21 = new byte[local42];
			this.aByteArray22 = new byte[local42];
			this.aShortArray19 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray17 = new byte[local42];
		} else {
			this.aByte2 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray26 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray114 = new int[local42];
		}
		this.aShortArray18 = new short[local42];
		local8.anInt3264 = 0;
		local13.anInt3264 = local165;
		local18.anInt3264 = local171;
		local23.anInt3264 = local90;
		local28.anInt3264 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method2690();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method2644();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method2644();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method2644();
			}
			this.anIntArray116[local307] = local301 + local316;
			this.anIntArray115[local307] = local303 + local326;
			this.anIntArray121[local307] = local305 + local336;
			local301 = this.anIntArray116[local307];
			local303 = this.anIntArray115[local307];
			local305 = this.anIntArray121[local307];
			if (local66 == 1) {
				this.anIntArray122[local307] = local28.method2690();
			}
		}
		local8.anInt3264 = local149;
		local13.anInt3264 = local116;
		local18.anInt3264 = local98;
		local23.anInt3264 = local134;
		local28.anInt3264 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray18[local307] = (short) local8.method2691();
			if (local50 == 1) {
				local314 = local13.method2690();
				if ((local314 & 0x1) == 1) {
					this.aByteArray21[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray21[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray22[local307] = (byte) (local314 >> 2);
					this.aShortArray19[local307] = this.aShortArray18[local307];
					this.aShortArray18[local307] = 127;
					if (this.aShortArray19[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray22[local307] = -1;
					this.aShortArray19[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray17[local307] = local18.method2663();
			}
			if (local58 == 1) {
				this.aByteArray26[local307] = local23.method2663();
			}
			if (local62 == 1) {
				this.anIntArray114[local307] = local28.method2690();
			}
		}
		this.anInt1157 = -1;
		local8.anInt3264 = local143;
		local13.anInt3264 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method2690();
			if (local548 == 1) {
				local307 = local8.method2644() + local326;
				local314 = local8.method2644() + local307;
				local316 = local8.method2644() + local314;
				local326 = local316;
				this.anIntArray111[local336] = local307;
				this.anIntArray112[local336] = local314;
				this.anIntArray113[local336] = local316;
				if (local307 > this.anInt1157) {
					this.anInt1157 = local307;
				}
				if (local314 > this.anInt1157) {
					this.anInt1157 = local314;
				}
				if (local316 > this.anInt1157) {
					this.anInt1157 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method2644() + local326;
				local326 = local316;
				this.anIntArray111[local336] = local307;
				this.anIntArray112[local336] = local314;
				this.anIntArray113[local336] = local316;
				if (local316 > this.anInt1157) {
					this.anInt1157 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method2644() + local326;
				local326 = local316;
				this.anIntArray111[local336] = local307;
				this.anIntArray112[local336] = local314;
				this.anIntArray113[local336] = local316;
				if (local316 > this.anInt1157) {
					this.anInt1157 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method2644() + local326;
				local326 = local316;
				this.anIntArray111[local336] = local307;
				this.anIntArray112[local336] = local686;
				this.anIntArray113[local336] = local316;
				if (local316 > this.anInt1157) {
					this.anInt1157 = local316;
				}
			}
		}
		this.anInt1157++;
		local8.anInt3264 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray24[local336] = 0;
			this.aShortArray16[local336] = (short) local8.method2691();
			this.aShortArray21[local336] = (short) local8.method2691();
			this.aShortArray22[local336] = (short) local8.method2691();
		}
		if (this.aByteArray22 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray22[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray16[local686] & 0xFFFF) == this.anIntArray111[local548] && (this.aShortArray21[local686] & 0xFFFF) == this.anIntArray112[local548] && (this.aShortArray22[local686] & 0xFFFF) == this.anIntArray113[local548]) {
						this.aByteArray22[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray22 = null;
			}
		}
		if (!local3) {
			this.aShortArray19 = null;
		}
		if (!local1) {
			this.aByteArray21 = null;
		}
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(III)V")
	public void method995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1156; local1++) {
			this.anIntArray116[local1] += arg0;
			this.anIntArray115[local1] += arg1;
			this.anIntArray121[local1] += arg2;
		}
		this.method980();
	}

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "()V")
	public void method996() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1156; local1++) {
			@Pc(10) int local10 = this.anIntArray116[local1];
			this.anIntArray116[local1] = this.anIntArray121[local1];
			this.anIntArray121[local1] = -local10;
		}
		this.method980();
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(III)V")
	public void method997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static51.anIntArray117[arg2];
			local9 = Static51.anIntArray120[arg2];
			for (local11 = 0; local11 < this.anInt1156; local11++) {
				local31 = this.anIntArray115[local11] * local5 + this.anIntArray116[local11] * local9 >> 16;
				this.anIntArray115[local11] = this.anIntArray115[local11] * local9 - this.anIntArray116[local11] * local5 >> 16;
				this.anIntArray116[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static51.anIntArray117[arg0];
			local9 = Static51.anIntArray120[arg0];
			for (local11 = 0; local11 < this.anInt1156; local11++) {
				local31 = this.anIntArray115[local11] * local9 - this.anIntArray121[local11] * local5 >> 16;
				this.anIntArray121[local11] = this.anIntArray115[local11] * local5 + this.anIntArray121[local11] * local9 >> 16;
				this.anIntArray115[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static51.anIntArray117[arg1];
		local9 = Static51.anIntArray120[arg1];
		for (local11 = 0; local11 < this.anInt1156; local11++) {
			local31 = this.anIntArray121[local11] * local5 + this.anIntArray116[local11] * local9 >> 16;
			this.anIntArray121[local11] = this.anIntArray121[local11] * local9 - this.anIntArray116[local11] * local5 >> 16;
			this.anIntArray116[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
	public void method998() {
		@Pc(3) int local3 = Static51.anIntArray117[256];
		@Pc(7) int local7 = Static51.anIntArray120[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1156; local9++) {
			@Pc(29) int local29 = this.anIntArray121[local9] * local3 + this.anIntArray116[local9] * local7 >> 16;
			this.anIntArray121[local9] = this.anIntArray121[local9] * local7 - this.anIntArray116[local9] * local3 >> 16;
			this.anIntArray116[local9] = local29;
		}
		this.method980();
	}

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "()V")
	private void method999() {
		if (this.aBoolean81) {
			return;
		}
		this.aBoolean81 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1157; local20++) {
			@Pc(29) int local29 = this.anIntArray116[local20];
			@Pc(34) int local34 = this.anIntArray115[local20];
			@Pc(39) int local39 = this.anIntArray121[local20];
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
		this.aShort7 = (short) local8;
		this.aShort5 = (short) local14;
		this.aShort3 = (short) local10;
		this.aShort4 = (short) local16;
		this.aShort2 = (short) local12;
		this.aShort1 = (short) local18;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Lclient!dn;")
	@Override
	public Class14 method4088() {
		return this.method984(this.aShort8, this.aShort6, -50, -10, -50);
	}

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "()Lclient!dl;")
	public Class14_Sub3 method1000() {
		@Pc(3) Class14_Sub3 local3 = new Class14_Sub3();
		if (this.aByteArray21 != null) {
			local3.aByteArray21 = new byte[this.anInt1154];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1154; local13++) {
				local3.aByteArray21[local13] = this.aByteArray21[local13];
			}
		}
		local3.anInt1156 = this.anInt1156;
		local3.anInt1157 = this.anInt1157;
		local3.anInt1154 = this.anInt1154;
		local3.anInt1153 = this.anInt1153;
		local3.anIntArray116 = this.anIntArray116;
		local3.anIntArray115 = this.anIntArray115;
		local3.anIntArray121 = this.anIntArray121;
		local3.anIntArray111 = this.anIntArray111;
		local3.anIntArray112 = this.anIntArray112;
		local3.anIntArray113 = this.anIntArray113;
		local3.aByteArray17 = this.aByteArray17;
		local3.aByteArray26 = this.aByteArray26;
		local3.aByteArray22 = this.aByteArray22;
		local3.aShortArray18 = this.aShortArray18;
		local3.aShortArray19 = this.aShortArray19;
		local3.aByte2 = this.aByte2;
		local3.aByteArray24 = this.aByteArray24;
		local3.aShortArray16 = this.aShortArray16;
		local3.aShortArray21 = this.aShortArray21;
		local3.aShortArray22 = this.aShortArray22;
		local3.aShortArray13 = this.aShortArray13;
		local3.aShortArray14 = this.aShortArray14;
		local3.aShortArray17 = this.aShortArray17;
		local3.aByteArray18 = this.aByteArray18;
		local3.aByteArray23 = this.aByteArray23;
		local3.aByteArray25 = this.aByteArray25;
		local3.aByteArray19 = this.aByteArray19;
		local3.aByteArray20 = this.aByteArray20;
		local3.anIntArray122 = this.anIntArray122;
		local3.anIntArray114 = this.anIntArray114;
		local3.anIntArrayArray4 = this.anIntArrayArray4;
		local3.anIntArrayArray5 = this.anIntArrayArray5;
		local3.aClass151Array1 = this.aClass151Array1;
		local3.aClass123Array1 = this.aClass123Array1;
		local3.aShort8 = this.aShort8;
		local3.aShort6 = this.aShort6;
		return local3;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIIIJILclient!sa;)V")
	@Override
	public void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class86_Sub1 arg10) {
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "([B)V")
	private void method1001(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub11 local4 = new Class1_Sub11(arg0);
		@Pc(9) Class1_Sub11 local9 = new Class1_Sub11(arg0);
		@Pc(14) Class1_Sub11 local14 = new Class1_Sub11(arg0);
		@Pc(19) Class1_Sub11 local19 = new Class1_Sub11(arg0);
		@Pc(24) Class1_Sub11 local24 = new Class1_Sub11(arg0);
		@Pc(29) Class1_Sub11 local29 = new Class1_Sub11(arg0);
		@Pc(34) Class1_Sub11 local34 = new Class1_Sub11(arg0);
		local4.anInt3264 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2691();
		@Pc(48) int local48 = local4.method2691();
		@Pc(52) int local52 = local4.method2690();
		@Pc(56) int local56 = local4.method2690();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method2690();
		@Pc(82) int local82 = local4.method2690();
		@Pc(86) int local86 = local4.method2690();
		@Pc(90) int local90 = local4.method2690();
		@Pc(94) int local94 = local4.method2690();
		@Pc(98) int local98 = local4.method2691();
		@Pc(102) int local102 = local4.method2691();
		@Pc(106) int local106 = local4.method2691();
		@Pc(110) int local110 = local4.method2691();
		@Pc(114) int local114 = local4.method2691();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray24 = new byte[local52];
			local4.anInt3264 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray24[local131] = local4.method2663();
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
		this.anInt1156 = local44;
		this.anInt1154 = local48;
		this.anInt1153 = local52;
		this.anIntArray116 = new int[local44];
		this.anIntArray115 = new int[local44];
		this.anIntArray121 = new int[local44];
		this.anIntArray111 = new int[local48];
		this.anIntArray112 = new int[local48];
		this.anIntArray113 = new int[local48];
		if (local94 == 1) {
			this.anIntArray122 = new int[local44];
		}
		if (local65) {
			this.aByteArray21 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray17 = new byte[local48];
		} else {
			this.aByte2 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray26 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray114 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray19 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray22 = new byte[local48];
		}
		this.aShortArray18 = new short[local48];
		if (local52 > 0) {
			this.aShortArray16 = new short[local52];
			this.aShortArray21 = new short[local52];
			this.aShortArray22 = new short[local52];
			if (local118 > 0) {
				this.aShortArray13 = new short[local118];
				this.aShortArray14 = new short[local118];
				this.aShortArray17 = new short[local118];
				this.aByteArray18 = new byte[local118];
				this.aByteArray23 = new byte[local118];
				this.aByteArray25 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray19 = new byte[local120];
				this.aByteArray20 = new byte[local120];
			}
		}
		local4.anInt3264 = local52;
		local9.anInt3264 = local250;
		local14.anInt3264 = local256;
		local19.anInt3264 = local262;
		local24.anInt3264 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method2690();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method2644();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method2644();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method2644();
			}
			this.anIntArray116[local479] = local473 + local488;
			this.anIntArray115[local479] = local475 + local498;
			this.anIntArray121[local479] = local477 + local508;
			local473 = this.anIntArray116[local479];
			local475 = this.anIntArray115[local479];
			local477 = this.anIntArray121[local479];
			if (local94 == 1) {
				this.anIntArray122[local479] = local24.method2690();
			}
		}
		local4.anInt3264 = local242;
		local9.anInt3264 = local169;
		local14.anInt3264 = local183;
		local19.anInt3264 = local210;
		local24.anInt3264 = local192;
		local29.anInt3264 = local225;
		local34.anInt3264 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray18[local479] = (short) local4.method2691();
			if (local65) {
				this.aByteArray21[local479] = local9.method2663();
			}
			if (local78 == 255) {
				this.aByteArray17[local479] = local14.method2663();
			}
			if (local82 == 1) {
				this.aByteArray26[local479] = local19.method2663();
			}
			if (local86 == 1) {
				this.anIntArray114[local479] = local24.method2690();
			}
			if (local90 == 1) {
				this.aShortArray19[local479] = (short) (local29.method2691() - 1);
			}
			if (this.aByteArray22 != null) {
				if (this.aShortArray19[local479] == -1) {
					this.aByteArray22[local479] = -1;
				} else {
					this.aByteArray22[local479] = (byte) (local34.method2690() - 1);
				}
			}
		}
		this.anInt1157 = -1;
		local4.anInt3264 = local219;
		local9.anInt3264 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method2690();
			if (local703 == 1) {
				local479 = local4.method2644() + local498;
				local486 = local4.method2644() + local479;
				local488 = local4.method2644() + local486;
				local498 = local488;
				this.anIntArray111[local508] = local479;
				this.anIntArray112[local508] = local486;
				this.anIntArray113[local508] = local488;
				if (local479 > this.anInt1157) {
					this.anInt1157 = local479;
				}
				if (local486 > this.anInt1157) {
					this.anInt1157 = local486;
				}
				if (local488 > this.anInt1157) {
					this.anInt1157 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method2644() + local498;
				local498 = local488;
				this.anIntArray111[local508] = local479;
				this.anIntArray112[local508] = local486;
				this.anIntArray113[local508] = local488;
				if (local488 > this.anInt1157) {
					this.anInt1157 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method2644() + local498;
				local498 = local488;
				this.anIntArray111[local508] = local479;
				this.anIntArray112[local508] = local486;
				this.anIntArray113[local508] = local488;
				if (local488 > this.anInt1157) {
					this.anInt1157 = local488;
				}
			}
			if (local703 == 4) {
				@Pc(841) int local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method2644() + local498;
				local498 = local488;
				this.anIntArray111[local508] = local479;
				this.anIntArray112[local508] = local841;
				this.anIntArray113[local508] = local488;
				if (local488 > this.anInt1157) {
					this.anInt1157 = local488;
				}
			}
		}
		this.anInt1157++;
		local4.anInt3264 = local268;
		local9.anInt3264 = local276;
		local14.anInt3264 = local284;
		local19.anInt3264 = local292;
		local24.anInt3264 = local298;
		local29.anInt3264 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray24[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray16[local508] = (short) local4.method2691();
				this.aShortArray21[local508] = (short) local4.method2691();
				this.aShortArray22[local508] = (short) local4.method2691();
			}
			if (local703 == 1) {
				this.aShortArray16[local508] = (short) local9.method2691();
				this.aShortArray21[local508] = (short) local9.method2691();
				this.aShortArray22[local508] = (short) local9.method2691();
				this.aShortArray13[local508] = (short) local14.method2691();
				this.aShortArray14[local508] = (short) local14.method2691();
				this.aShortArray17[local508] = (short) local14.method2691();
				this.aByteArray18[local508] = local19.method2663();
				this.aByteArray23[local508] = local24.method2663();
				this.aByteArray25[local508] = local29.method2663();
			}
			if (local703 == 2) {
				this.aShortArray16[local508] = (short) local9.method2691();
				this.aShortArray21[local508] = (short) local9.method2691();
				this.aShortArray22[local508] = (short) local9.method2691();
				this.aShortArray13[local508] = (short) local14.method2691();
				this.aShortArray14[local508] = (short) local14.method2691();
				this.aShortArray17[local508] = (short) local14.method2691();
				this.aByteArray18[local508] = local19.method2663();
				this.aByteArray23[local508] = local24.method2663();
				this.aByteArray25[local508] = local29.method2663();
				this.aByteArray19[local508] = local29.method2663();
				this.aByteArray20[local508] = local29.method2663();
			}
			if (local703 == 3) {
				this.aShortArray16[local508] = (short) local9.method2691();
				this.aShortArray21[local508] = (short) local9.method2691();
				this.aShortArray22[local508] = (short) local9.method2691();
				this.aShortArray13[local508] = (short) local14.method2691();
				this.aShortArray14[local508] = (short) local14.method2691();
				this.aShortArray17[local508] = (short) local14.method2691();
				this.aByteArray18[local508] = local19.method2663();
				this.aByteArray23[local508] = local24.method2663();
				this.aByteArray25[local508] = local29.method2663();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt3264 = local131;
		local508 = local4.method2690();
		if (local508 > 0) {
			local4.anInt3264 += local508 * 4;
		}
		local703 = local4.method2690();
		if (local703 > 0) {
			local4.anInt3264 += local703 * 4;
		}
	}

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "()V")
	public void method1002() {
		if (this.aClass151Array1 != null) {
			return;
		}
		this.aClass151Array1 = new Class151[this.anInt1157];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt1157; local10++) {
			this.aClass151Array1[local10] = new Class151();
		}
		for (local10 = 0; local10 < this.anInt1154; local10++) {
			@Pc(34) int local34 = this.anIntArray111[local10];
			@Pc(39) int local39 = this.anIntArray112[local10];
			@Pc(44) int local44 = this.anIntArray113[local10];
			@Pc(54) int local54 = this.anIntArray116[local39] - this.anIntArray116[local34];
			@Pc(64) int local64 = this.anIntArray115[local39] - this.anIntArray115[local34];
			@Pc(74) int local74 = this.anIntArray121[local39] - this.anIntArray121[local34];
			@Pc(84) int local84 = this.anIntArray116[local44] - this.anIntArray116[local34];
			@Pc(94) int local94 = this.anIntArray115[local44] - this.anIntArray115[local34];
			@Pc(104) int local104 = this.anIntArray121[local44] - this.anIntArray121[local34];
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
			if (this.aByteArray21 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray21[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class151 local214 = this.aClass151Array1[local34];
				local214.anInt4775 += local112;
				local214.anInt4776 += local120;
				local214.anInt4770 += local128;
				local214.anInt4774++;
				@Pc(243) Class151 local243 = this.aClass151Array1[local39];
				local243.anInt4775 += local112;
				local243.anInt4776 += local120;
				local243.anInt4770 += local128;
				local243.anInt4774++;
				@Pc(272) Class151 local272 = this.aClass151Array1[local44];
				local272.anInt4775 += local112;
				local272.anInt4776 += local120;
				local272.anInt4770 += local128;
				local272.anInt4774++;
			} else if (local201 == 1) {
				if (this.aClass123Array1 == null) {
					this.aClass123Array1 = new Class123[this.anInt1154];
				}
				@Pc(317) Class123 local317 = this.aClass123Array1[local10] = new Class123();
				local317.anInt3930 = local112;
				local317.anInt3928 = local120;
				local317.anInt3926 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
	private void method1003(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static51.anIntArray117[arg0];
		@Pc(7) int local7 = Static51.anIntArray120[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1156; local9++) {
			@Pc(29) int local29 = this.anIntArray115[local9] * local3 + this.anIntArray116[local9] * local7 >> 16;
			this.anIntArray115[local9] = this.anIntArray115[local9] * local7 - this.anIntArray116[local9] * local3 >> 16;
			this.anIntArray116[local9] = local29;
		}
		this.method980();
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(IIIII)Lclient!um;")
	public Class14_Sub6_Sub2 method1004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class14_Sub6_Sub2(this, arg0, arg1, arg2, arg3, arg4);
	}
}
