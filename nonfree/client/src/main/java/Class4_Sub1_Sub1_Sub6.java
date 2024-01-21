import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class4_Sub1_Sub1_Sub6 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "S")
	public short aShort15;

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "[Lclient!af;")
	public Class6[] aClass6Array1;

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "[Lclient!cf;")
	public Class16[] aClass16Array1;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
	public int anInt1308;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!ff", name = "ab", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!ff", name = "fb", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ff", name = "gb", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "S")
	public short aShort16;

	@OriginalMember(owner = "client!ff", name = "kb", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!ff", name = "lb", descriptor = "S")
	public short aShort17;

	@OriginalMember(owner = "client!ff", name = "mb", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ff", name = "nb", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!ff", name = "qb", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!ff", name = "rb", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!ff", name = "sb", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!ff", name = "tb", descriptor = "[Lclient!af;")
	public Class6[] aClass6Array2;

	@OriginalMember(owner = "client!ff", name = "ub", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!ff", name = "wb", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!ff", name = "xb", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!ff", name = "zb", descriptor = "S")
	public short aShort18;

	@OriginalMember(owner = "client!ff", name = "Ab", descriptor = "S")
	public short aShort19;

	@OriginalMember(owner = "client!ff", name = "Bb", descriptor = "[I")
	public int[] anIntArray135;

	@OriginalMember(owner = "client!ff", name = "Cb", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!ff", name = "Db", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!ff", name = "Eb", descriptor = "S")
	public short aShort20;

	@OriginalMember(owner = "client!ff", name = "Fb", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!ff", name = "Gb", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!ff", name = "Hb", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!ff", name = "Ib", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!ff", name = "hb", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!ff", name = "pb", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
	public int anInt1307 = 0;

	@OriginalMember(owner = "client!ff", name = "vb", descriptor = "I")
	public int anInt1309 = 0;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	private Class4_Sub1_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
	public Class4_Sub1_Sub1_Sub6(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1012(arg0);
		} else {
			this.method1006(arg0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([Lclient!ff;I)V")
	public Class4_Sub1_Sub1_Sub6(@OriginalArg(0) Class4_Sub1_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt1307 = 0;
		this.anInt1309 = 0;
		this.anInt1308 = 0;
		this.aByte4 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class4_Sub1_Sub1_Sub6 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt1307 += local44.anInt1307;
				this.anInt1309 += local44.anInt1309;
				this.anInt1308 += local44.anInt1308;
				if (local44.aByteArray16 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local44.aByte4;
					}
					if (this.aByte4 != local44.aByte4) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray14 != null;
				local19 |= local44.aByteArray12 != null;
				local21 |= local44.anIntArray136 != null;
				local23 |= local44.aShortArray10 != null;
				local25 |= local44.aByteArray13 != null;
			}
		}
		this.anIntArray130 = new int[this.anInt1307];
		this.anIntArray135 = new int[this.anInt1307];
		this.anIntArray133 = new int[this.anInt1307];
		this.anIntArray137 = new int[this.anInt1307];
		this.anIntArray129 = new int[this.anInt1309];
		this.anIntArray132 = new int[this.anInt1309];
		this.anIntArray127 = new int[this.anInt1309];
		if (local15) {
			this.aByteArray14 = new byte[this.anInt1309];
		}
		if (local17) {
			this.aByteArray16 = new byte[this.anInt1309];
		}
		if (local19) {
			this.aByteArray12 = new byte[this.anInt1309];
		}
		if (local21) {
			this.anIntArray136 = new int[this.anInt1309];
		}
		if (local23) {
			this.aShortArray10 = new short[this.anInt1309];
		}
		if (local25) {
			this.aByteArray13 = new byte[this.anInt1309];
		}
		this.aShortArray12 = new short[this.anInt1309];
		if (this.anInt1308 > 0) {
			this.aByteArray10 = new byte[this.anInt1308];
			this.aShortArray13 = new short[this.anInt1308];
			this.aShortArray8 = new short[this.anInt1308];
			this.aShortArray15 = new short[this.anInt1308];
			this.aShortArray9 = new short[this.anInt1308];
			this.aShortArray11 = new short[this.anInt1308];
			this.aShortArray14 = new short[this.anInt1308];
			this.aByteArray8 = new byte[this.anInt1308];
			this.aByteArray15 = new byte[this.anInt1308];
			this.aByteArray7 = new byte[this.anInt1308];
			this.aByteArray9 = new byte[this.anInt1308];
			this.aByteArray11 = new byte[this.anInt1308];
		}
		this.anInt1307 = 0;
		this.anInt1309 = 0;
		this.anInt1308 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class4_Sub1_Sub1_Sub6 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt1309; local302++) {
					if (local15 && local298.aByteArray14 != null) {
						this.aByteArray14[this.anInt1309] = local298.aByteArray14[local302];
					}
					if (local17) {
						if (local298.aByteArray16 == null) {
							this.aByteArray16[this.anInt1309] = local298.aByte4;
						} else {
							this.aByteArray16[this.anInt1309] = local298.aByteArray16[local302];
						}
					}
					if (local19 && local298.aByteArray12 != null) {
						this.aByteArray12[this.anInt1309] = local298.aByteArray12[local302];
					}
					if (local21 && local298.anIntArray136 != null) {
						this.anIntArray136[this.anInt1309] = local298.anIntArray136[local302];
					}
					if (local23) {
						if (local298.aShortArray10 == null) {
							this.aShortArray10[this.anInt1309] = -1;
						} else {
							this.aShortArray10[this.anInt1309] = local298.aShortArray10[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray13 == null || local298.aByteArray13[local302] == -1) {
							this.aByteArray13[this.anInt1309] = -1;
						} else {
							this.aByteArray13[this.anInt1309] = (byte) (local298.aByteArray13[local302] + this.anInt1308);
						}
					}
					this.aShortArray12[this.anInt1309] = local298.aShortArray12[local302];
					this.anIntArray129[this.anInt1309] = this.method1005(local298, local298.anIntArray129[local302]);
					this.anIntArray132[this.anInt1309] = this.method1005(local298, local298.anIntArray132[local302]);
					this.anIntArray127[this.anInt1309] = this.method1005(local298, local298.anIntArray127[local302]);
					this.anInt1309++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt1308; local477++) {
					@Pc(489) byte local489 = this.aByteArray10[this.anInt1308] = local298.aByteArray10[local477];
					if (local489 == 0) {
						this.aShortArray13[this.anInt1308] = (short) this.method1005(local298, local298.aShortArray13[local477]);
						this.aShortArray8[this.anInt1308] = (short) this.method1005(local298, local298.aShortArray8[local477]);
						this.aShortArray15[this.anInt1308] = (short) this.method1005(local298, local298.aShortArray15[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray13[this.anInt1308] = local298.aShortArray13[local477];
						this.aShortArray8[this.anInt1308] = local298.aShortArray8[local477];
						this.aShortArray15[this.anInt1308] = local298.aShortArray15[local477];
						this.aShortArray9[this.anInt1308] = local298.aShortArray9[local477];
						this.aShortArray11[this.anInt1308] = local298.aShortArray11[local477];
						this.aShortArray14[this.anInt1308] = local298.aShortArray14[local477];
						this.aByteArray8[this.anInt1308] = local298.aByteArray8[local477];
						this.aByteArray15[this.anInt1308] = local298.aByteArray15[local477];
						this.aByteArray7[this.anInt1308] = local298.aByteArray7[local477];
					}
					if (local489 == 2) {
						this.aByteArray9[this.anInt1308] = local298.aByteArray9[local477];
						this.aByteArray11[this.anInt1308] = local298.aByteArray11[local477];
					}
					this.anInt1308++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!ff;ZZZZ)V")
	public Class4_Sub1_Sub1_Sub6(@OriginalArg(0) Class4_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1307 = arg0.anInt1307;
		this.anInt1309 = arg0.anInt1309;
		this.anInt1308 = arg0.anInt1308;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray130 = arg0.anIntArray130;
			this.anIntArray135 = arg0.anIntArray135;
			this.anIntArray133 = arg0.anIntArray133;
		} else {
			this.anIntArray130 = new int[this.anInt1307];
			this.anIntArray135 = new int[this.anInt1307];
			this.anIntArray133 = new int[this.anInt1307];
			for (local57 = 0; local57 < this.anInt1307; local57++) {
				this.anIntArray130[local57] = arg0.anIntArray130[local57];
				this.anIntArray135[local57] = arg0.anIntArray135[local57];
				this.anIntArray133[local57] = arg0.anIntArray133[local57];
			}
		}
		if (arg2) {
			this.aShortArray12 = arg0.aShortArray12;
		} else {
			this.aShortArray12 = new short[this.anInt1309];
			for (local57 = 0; local57 < this.anInt1309; local57++) {
				this.aShortArray12[local57] = arg0.aShortArray12[local57];
			}
		}
		if (arg3 || arg0.aShortArray10 == null) {
			this.aShortArray10 = arg0.aShortArray10;
		} else {
			this.aShortArray10 = new short[this.anInt1309];
			for (local57 = 0; local57 < this.anInt1309; local57++) {
				this.aShortArray10[local57] = arg0.aShortArray10[local57];
			}
		}
		this.aByteArray12 = arg0.aByteArray12;
		this.anIntArray129 = arg0.anIntArray129;
		this.anIntArray132 = arg0.anIntArray132;
		this.anIntArray127 = arg0.anIntArray127;
		this.aByteArray14 = arg0.aByteArray14;
		this.aByteArray16 = arg0.aByteArray16;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByte4 = arg0.aByte4;
		this.aByteArray10 = arg0.aByteArray10;
		this.aShortArray13 = arg0.aShortArray13;
		this.aShortArray8 = arg0.aShortArray8;
		this.aShortArray15 = arg0.aShortArray15;
		this.aShortArray9 = arg0.aShortArray9;
		this.aShortArray11 = arg0.aShortArray11;
		this.aShortArray14 = arg0.aShortArray14;
		this.aByteArray8 = arg0.aByteArray8;
		this.aByteArray15 = arg0.aByteArray15;
		this.aByteArray7 = arg0.aByteArray7;
		this.aByteArray9 = arg0.aByteArray9;
		this.aByteArray11 = arg0.aByteArray11;
		this.anIntArray137 = arg0.anIntArray137;
		this.anIntArray136 = arg0.anIntArray136;
		this.anIntArrayArray10 = arg0.anIntArrayArray10;
		this.anIntArrayArray11 = arg0.anIntArrayArray11;
		this.aClass6Array2 = arg0.aClass6Array2;
		this.aClass16Array1 = arg0.aClass16Array1;
		this.aClass6Array1 = arg0.aClass6Array1;
		this.aShort21 = arg0.aShort21;
		this.aShort15 = arg0.aShort15;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
	public void method992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1307; local1++) {
			this.anIntArray130[local1] += arg0;
			this.anIntArray135[local1] += arg1;
			this.anIntArray133[local1] += arg2;
		}
		this.method1002();
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "()V")
	public void method994() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1307; local1++) {
			this.anIntArray130[local1] = -this.anIntArray130[local1];
			this.anIntArray133[local1] = -this.anIntArray133[local1];
		}
		this.method1002();
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
	public void method995() {
		if (this.aClass6Array2 != null) {
			return;
		}
		this.aClass6Array2 = new Class6[this.anInt1307];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1307; local10++) {
			this.aClass6Array2[local10] = new Class6();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1309; local25++) {
			@Pc(31) int local31 = this.anIntArray129[local25];
			@Pc(36) int local36 = this.anIntArray132[local25];
			@Pc(41) int local41 = this.anIntArray127[local25];
			@Pc(51) int local51 = this.anIntArray130[local36] - this.anIntArray130[local31];
			@Pc(61) int local61 = this.anIntArray135[local36] - this.anIntArray135[local31];
			@Pc(71) int local71 = this.anIntArray133[local36] - this.anIntArray133[local31];
			@Pc(81) int local81 = this.anIntArray130[local41] - this.anIntArray130[local31];
			@Pc(91) int local91 = this.anIntArray135[local41] - this.anIntArray135[local31];
			@Pc(101) int local101 = this.anIntArray133[local41] - this.anIntArray133[local31];
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
			if (this.aByteArray14 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray14[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class6 local211 = this.aClass6Array2[local31];
				local211.anInt235 += local109;
				local211.anInt228 += local117;
				local211.anInt229 += local125;
				local211.anInt234++;
				@Pc(240) Class6 local240 = this.aClass6Array2[local36];
				local240.anInt235 += local109;
				local240.anInt228 += local117;
				local240.anInt229 += local125;
				local240.anInt234++;
				@Pc(269) Class6 local269 = this.aClass6Array2[local41];
				local269.anInt235 += local109;
				local269.anInt228 += local117;
				local269.anInt229 += local125;
				local269.anInt234++;
			} else if (local198 == 1) {
				if (this.aClass16Array1 == null) {
					this.aClass16Array1 = new Class16[this.anInt1309];
				}
				@Pc(314) Class16 local314 = this.aClass16Array1[local25] = new Class16();
				local314.anInt591 = local109;
				local314.anInt592 = local117;
				local314.anInt589 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
	public void method996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1307; local1++) {
			this.anIntArray130[local1] = this.anIntArray130[local1] * arg0 / 128;
			this.anIntArray135[local1] = this.anIntArray135[local1] * arg1 / 128;
			this.anIntArray133[local1] = this.anIntArray133[local1] * arg2 / 128;
		}
		this.method1002();
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "()V")
	public void method997() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray137 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1307; local9++) {
				local15 = this.anIntArray137[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray10 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray10[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1307) {
				local65 = this.anIntArray137[local59];
				this.anIntArrayArray10[local65][local5[local65]++] = local59++;
			}
			this.anIntArray137 = null;
		}
		if (this.anIntArray136 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1309; local9++) {
			local15 = this.anIntArray136[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray11 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray11[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1309) {
			local65 = this.anIntArray136[local59];
			this.anIntArrayArray11[local65][local5[local65]++] = local59++;
		}
		this.anIntArray136 = null;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "()V")
	public void method998() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1307; local1++) {
			@Pc(7) int local7 = this.anIntArray133[local1];
			this.anIntArray133[local1] = this.anIntArray130[local1];
			this.anIntArray130[local1] = -local7;
		}
		this.method1002();
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "()V")
	public void method1000() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1309; local1++) {
			@Pc(7) int local7 = this.anIntArray129[local1];
			this.anIntArray129[local1] = this.anIntArray127[local1];
			this.anIntArray127[local1] = local7;
		}
		this.method1002();
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "()V")
	public void method1001() {
		if (this.aBoolean63) {
			return;
		}
		this.aBoolean63 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1307; local20++) {
			@Pc(26) int local26 = this.anIntArray130[local20];
			@Pc(31) int local31 = this.anIntArray135[local20];
			@Pc(36) int local36 = this.anIntArray133[local20];
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
		this.aShort20 = (short) local8;
		this.aShort16 = (short) local14;
		super.aShort29 = (short) local10;
		this.aShort18 = (short) local16;
		this.aShort17 = (short) local12;
		this.aShort19 = (short) local18;
	}

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "()V")
	private void method1002() {
		this.aClass6Array2 = null;
		this.aClass6Array1 = null;
		this.aClass16Array1 = null;
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([[IIIIZI)Lclient!ff;")
	public Class4_Sub1_Sub1_Sub6 method1004(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1001();
		@Pc(6) int local6 = arg1 + this.aShort20;
		@Pc(11) int local11 = arg1 + this.aShort16;
		@Pc(16) int local16 = arg3 + this.aShort17;
		@Pc(21) int local21 = arg3 + this.aShort19;
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
		@Pc(101) Class4_Sub1_Sub1_Sub6 local101 = new Class4_Sub1_Sub1_Sub6();
		local101.anInt1307 = this.anInt1307;
		local101.anInt1309 = this.anInt1309;
		local101.anInt1308 = this.anInt1308;
		local101.anIntArray130 = this.anIntArray130;
		local101.anIntArray133 = this.anIntArray133;
		local101.anIntArray129 = this.anIntArray129;
		local101.anIntArray132 = this.anIntArray132;
		local101.anIntArray127 = this.anIntArray127;
		local101.aByteArray14 = this.aByteArray14;
		local101.aByteArray16 = this.aByteArray16;
		local101.aByteArray12 = this.aByteArray12;
		local101.aByteArray13 = this.aByteArray13;
		local101.aShortArray12 = this.aShortArray12;
		local101.aShortArray10 = this.aShortArray10;
		local101.aByte4 = this.aByte4;
		local101.aByteArray10 = this.aByteArray10;
		local101.aShortArray13 = this.aShortArray13;
		local101.aShortArray8 = this.aShortArray8;
		local101.aShortArray15 = this.aShortArray15;
		local101.aShortArray9 = this.aShortArray9;
		local101.aShortArray11 = this.aShortArray11;
		local101.aShortArray14 = this.aShortArray14;
		local101.aByteArray8 = this.aByteArray8;
		local101.aByteArray15 = this.aByteArray15;
		local101.aByteArray7 = this.aByteArray7;
		local101.aByteArray9 = this.aByteArray9;
		local101.aByteArray11 = this.aByteArray11;
		local101.anIntArray137 = this.anIntArray137;
		local101.anIntArray136 = this.anIntArray136;
		local101.anIntArrayArray10 = this.anIntArrayArray10;
		local101.anIntArrayArray11 = this.anIntArrayArray11;
		local101.aShort21 = this.aShort21;
		local101.aShort15 = this.aShort15;
		local101.anIntArray135 = new int[local101.anInt1307];
		@Pc(245) int local245;
		@Pc(253) int local253;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(268) int local268;
		@Pc(272) int local272;
		@Pc(276) int local276;
		@Pc(298) int local298;
		@Pc(324) int local324;
		@Pc(336) int local336;
		if (arg4 == 0) {
			for (local245 = 0; local245 < local101.anInt1307; local245++) {
				local253 = this.anIntArray130[local245] + arg1;
				local260 = this.anIntArray133[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray135[local245] = this.anIntArray135[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt1307; local245++) {
				local253 = (this.anIntArray135[local245] << 16) / super.aShort29;
				if (local253 < arg4) {
					local260 = this.anIntArray130[local245] + arg1;
					local264 = this.anIntArray133[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray135[local245] = this.anIntArray135[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray135[local245] = this.anIntArray135[local245];
				}
			}
		}
		local101.method1002();
		return local101;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ff;I)I")
	private int method1005(@OriginalArg(0) Class4_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray130[arg1];
		@Pc(11) int local11 = arg0.anIntArray135[arg1];
		@Pc(16) int local16 = arg0.anIntArray133[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1307; local18++) {
			if (local6 == this.anIntArray130[local18] && local11 == this.anIntArray135[local18] && local16 == this.anIntArray133[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray130[this.anInt1307] = local6;
			this.anIntArray135[this.anInt1307] = local11;
			this.anIntArray133[this.anInt1307] = local16;
			if (arg0.anIntArray137 != null) {
				this.anIntArray137[this.anInt1307] = arg0.anIntArray137[arg1];
			}
			local1 = this.anInt1307++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([B)V")
	private void method1006(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		@Pc(13) Class4_Sub11 local13 = new Class4_Sub11(arg0);
		@Pc(18) Class4_Sub11 local18 = new Class4_Sub11(arg0);
		@Pc(23) Class4_Sub11 local23 = new Class4_Sub11(arg0);
		@Pc(28) Class4_Sub11 local28 = new Class4_Sub11(arg0);
		local8.anInt1597 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1252();
		@Pc(42) int local42 = local8.method1252();
		@Pc(46) int local46 = local8.method1253();
		@Pc(50) int local50 = local8.method1253();
		@Pc(54) int local54 = local8.method1253();
		@Pc(58) int local58 = local8.method1253();
		@Pc(62) int local62 = local8.method1253();
		@Pc(66) int local66 = local8.method1253();
		@Pc(70) int local70 = local8.method1252();
		@Pc(74) int local74 = local8.method1252();
		@Pc(78) int local78 = local8.method1252();
		@Pc(82) int local82 = local8.method1252();
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
		this.anInt1307 = local38;
		this.anInt1309 = local42;
		this.anInt1308 = local46;
		this.anIntArray130 = new int[local38];
		this.anIntArray135 = new int[local38];
		this.anIntArray133 = new int[local38];
		this.anIntArray129 = new int[local42];
		this.anIntArray132 = new int[local42];
		this.anIntArray127 = new int[local42];
		if (local46 > 0) {
			this.aByteArray10 = new byte[local46];
			this.aShortArray13 = new short[local46];
			this.aShortArray8 = new short[local46];
			this.aShortArray15 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray137 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray14 = new byte[local42];
			this.aByteArray13 = new byte[local42];
			this.aShortArray10 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray16 = new byte[local42];
		} else {
			this.aByte4 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray12 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray136 = new int[local42];
		}
		this.aShortArray12 = new short[local42];
		local8.anInt1597 = 0;
		local13.anInt1597 = local165;
		local18.anInt1597 = local171;
		local23.anInt1597 = local90;
		local28.anInt1597 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1253();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1255();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1255();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1255();
			}
			this.anIntArray130[local307] = local301 + local314;
			this.anIntArray135[local307] = local303 + local324;
			this.anIntArray133[local307] = local305 + local334;
			local301 = this.anIntArray130[local307];
			local303 = this.anIntArray135[local307];
			local305 = this.anIntArray133[local307];
			if (local66 == 1) {
				this.anIntArray137[local307] = local28.method1253();
			}
		}
		local8.anInt1597 = local149;
		local13.anInt1597 = local116;
		local18.anInt1597 = local98;
		local23.anInt1597 = local134;
		local28.anInt1597 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray12[local312] = (short) local8.method1252();
			if (local50 == 1) {
				local314 = local13.method1253();
				if ((local314 & 0x1) == 1) {
					this.aByteArray14[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray14[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray13[local312] = (byte) (local314 >> 2);
					this.aShortArray10[local312] = this.aShortArray12[local312];
					this.aShortArray12[local312] = 127;
					if (this.aShortArray10[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray13[local312] = -1;
					this.aShortArray10[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray16[local312] = local18.method1241();
			}
			if (local58 == 1) {
				this.aByteArray12[local312] = local23.method1241();
			}
			if (local62 == 1) {
				this.anIntArray136[local312] = local28.method1253();
			}
		}
		local8.anInt1597 = local143;
		local13.anInt1597 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1253();
			if (local543 == 1) {
				local314 = local8.method1255() + local536;
				local324 = local8.method1255() + local314;
				local334 = local8.method1255() + local324;
				local536 = local334;
				this.anIntArray129[local538] = local314;
				this.anIntArray132[local538] = local324;
				this.anIntArray127[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1255() + local536;
				local536 = local334;
				this.anIntArray129[local538] = local314;
				this.anIntArray132[local538] = local324;
				this.anIntArray127[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1255() + local536;
				local536 = local334;
				this.anIntArray129[local538] = local314;
				this.anIntArray132[local538] = local324;
				this.anIntArray127[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1255() + local536;
				local536 = local334;
				this.anIntArray129[local538] = local314;
				this.anIntArray132[local538] = local646;
				this.anIntArray127[local538] = local334;
			}
		}
		local8.anInt1597 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray10[local543] = 0;
			this.aShortArray13[local543] = (short) local8.method1252();
			this.aShortArray8[local543] = (short) local8.method1252();
			this.aShortArray15[local543] = (short) local8.method1252();
		}
		if (this.aByteArray13 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray13[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray13[local731] & 0xFFFF) == this.anIntArray129[local723] && (this.aShortArray8[local731] & 0xFFFF) == this.anIntArray132[local723] && (this.aShortArray15[local731] & 0xFFFF) == this.anIntArray127[local723]) {
						this.aByteArray13[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray13 = null;
			}
		}
		if (!local3) {
			this.aShortArray10 = null;
		}
		if (!local1) {
			this.aByteArray14 = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIZZ)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method1007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class4_Sub1_Sub1_Sub4_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)Lclient!uc;")
	public Class4_Sub1_Sub1_Sub4_Sub1 method1008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class4_Sub1_Sub1_Sub4_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "()V")
	public void method1009() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1307; local1++) {
			@Pc(7) int local7 = this.anIntArray130[local1];
			this.anIntArray130[local1] = this.anIntArray133[local1];
			this.anIntArray133[local1] = -local7;
		}
		this.method1002();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(SS)V")
	public void method1010(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray10 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt1309; local5++) {
			if (this.aShortArray10[local5] == arg0) {
				this.aShortArray10[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(SS)V")
	public void method1011(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1309; local1++) {
			if (this.aShortArray12[local1] == arg0) {
				this.aShortArray12[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "([B)V")
	private void method1012(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class4_Sub11 local4 = new Class4_Sub11(arg0);
		@Pc(9) Class4_Sub11 local9 = new Class4_Sub11(arg0);
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg0);
		@Pc(19) Class4_Sub11 local19 = new Class4_Sub11(arg0);
		@Pc(24) Class4_Sub11 local24 = new Class4_Sub11(arg0);
		@Pc(29) Class4_Sub11 local29 = new Class4_Sub11(arg0);
		@Pc(34) Class4_Sub11 local34 = new Class4_Sub11(arg0);
		local4.anInt1597 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1252();
		@Pc(48) int local48 = local4.method1252();
		@Pc(52) int local52 = local4.method1253();
		@Pc(56) int local56 = local4.method1253();
		@Pc(60) int local60 = local4.method1253();
		@Pc(64) int local64 = local4.method1253();
		@Pc(68) int local68 = local4.method1253();
		@Pc(72) int local72 = local4.method1253();
		@Pc(76) int local76 = local4.method1253();
		@Pc(80) int local80 = local4.method1252();
		@Pc(84) int local84 = local4.method1252();
		@Pc(88) int local88 = local4.method1252();
		@Pc(92) int local92 = local4.method1252();
		@Pc(96) int local96 = local4.method1252();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray10 = new byte[local52];
			local4.anInt1597 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray10[local113] = local4.method1241();
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
		@Pc(287) int local287 = local113;
		local113 += local100 + local102 * 2;
		this.anInt1307 = local44;
		this.anInt1309 = local48;
		this.anInt1308 = local52;
		this.anIntArray130 = new int[local44];
		this.anIntArray135 = new int[local44];
		this.anIntArray133 = new int[local44];
		this.anIntArray129 = new int[local48];
		this.anIntArray132 = new int[local48];
		this.anIntArray127 = new int[local48];
		if (local76 == 1) {
			this.anIntArray137 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray14 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray16 = new byte[local48];
		} else {
			this.aByte4 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray12 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray136 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray10 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray13 = new byte[local48];
		}
		this.aShortArray12 = new short[local48];
		if (local52 > 0) {
			this.aShortArray13 = new short[local52];
			this.aShortArray8 = new short[local52];
			this.aShortArray15 = new short[local52];
			if (local100 > 0) {
				this.aShortArray9 = new short[local100];
				this.aShortArray11 = new short[local100];
				this.aShortArray14 = new short[local100];
				this.aByteArray8 = new byte[local100];
				this.aByteArray15 = new byte[local100];
				this.aByteArray7 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray9 = new byte[local102];
				this.aByteArray11 = new byte[local102];
			}
		}
		local4.anInt1597 = local52;
		local9.anInt1597 = local233;
		local14.anInt1597 = local239;
		local19.anInt1597 = local245;
		local24.anInt1597 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1253();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1255();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1255();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1255();
			}
			this.anIntArray130[local463] = local457 + local470;
			this.anIntArray135[local463] = local459 + local480;
			this.anIntArray133[local463] = local461 + local490;
			local457 = this.anIntArray130[local463];
			local459 = this.anIntArray135[local463];
			local461 = this.anIntArray133[local463];
			if (local76 == 1) {
				this.anIntArray137[local463] = local24.method1253();
			}
		}
		local4.anInt1597 = local225;
		local9.anInt1597 = local151;
		local14.anInt1597 = local166;
		local19.anInt1597 = local193;
		local24.anInt1597 = local175;
		local29.anInt1597 = local208;
		local34.anInt1597 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray12[local468] = (short) local4.method1252();
			if (local56 == 1) {
				this.aByteArray14[local468] = local9.method1241();
			}
			if (local60 == 255) {
				this.aByteArray16[local468] = local14.method1241();
			}
			if (local64 == 1) {
				this.aByteArray12[local468] = local19.method1241();
			}
			if (local68 == 1) {
				this.anIntArray136[local468] = local24.method1253();
			}
			if (local72 == 1) {
				this.aShortArray10[local468] = (short) (local29.method1252() - 1);
			}
			if (this.aByteArray13 != null) {
				if (this.aShortArray10[local468] == -1) {
					this.aByteArray13[local468] = -1;
				} else {
					this.aByteArray13[local468] = (byte) (local34.method1253() - 1);
				}
			}
		}
		local4.anInt1597 = local202;
		local9.anInt1597 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1253();
			if (local683 == 1) {
				local470 = local4.method1255() + local676;
				local480 = local4.method1255() + local470;
				local490 = local4.method1255() + local480;
				local676 = local490;
				this.anIntArray129[local678] = local470;
				this.anIntArray132[local678] = local480;
				this.anIntArray127[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1255() + local676;
				local676 = local490;
				this.anIntArray129[local678] = local470;
				this.anIntArray132[local678] = local480;
				this.anIntArray127[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1255() + local676;
				local676 = local490;
				this.anIntArray129[local678] = local470;
				this.anIntArray132[local678] = local480;
				this.anIntArray127[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1255() + local676;
				local676 = local490;
				this.anIntArray129[local678] = local470;
				this.anIntArray132[local678] = local786;
				this.anIntArray127[local678] = local490;
			}
		}
		local4.anInt1597 = local251;
		local9.anInt1597 = local259;
		local14.anInt1597 = local267;
		local19.anInt1597 = local275;
		local24.anInt1597 = local281;
		local29.anInt1597 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray10[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray13[local683] = (short) local4.method1252();
				this.aShortArray8[local683] = (short) local4.method1252();
				this.aShortArray15[local683] = (short) local4.method1252();
			}
			if (local786 == 1) {
				this.aShortArray13[local683] = (short) local9.method1252();
				this.aShortArray8[local683] = (short) local9.method1252();
				this.aShortArray15[local683] = (short) local9.method1252();
				this.aShortArray9[local683] = (short) local14.method1252();
				this.aShortArray11[local683] = (short) local14.method1252();
				this.aShortArray14[local683] = (short) local14.method1252();
				this.aByteArray8[local683] = local19.method1241();
				this.aByteArray15[local683] = local24.method1241();
				this.aByteArray7[local683] = local29.method1241();
			}
			if (local786 == 2) {
				this.aShortArray13[local683] = (short) local9.method1252();
				this.aShortArray8[local683] = (short) local9.method1252();
				this.aShortArray15[local683] = (short) local9.method1252();
				this.aShortArray9[local683] = (short) local14.method1252();
				this.aShortArray11[local683] = (short) local14.method1252();
				this.aShortArray14[local683] = (short) local14.method1252();
				this.aByteArray8[local683] = local19.method1241();
				this.aByteArray15[local683] = local24.method1241();
				this.aByteArray7[local683] = local29.method1241();
				this.aByteArray9[local683] = local29.method1241();
				this.aByteArray11[local683] = local29.method1241();
			}
			if (local786 == 3) {
				this.aShortArray13[local683] = (short) local9.method1252();
				this.aShortArray8[local683] = (short) local9.method1252();
				this.aShortArray15[local683] = (short) local9.method1252();
				this.aShortArray9[local683] = (short) local14.method1252();
				this.aShortArray11[local683] = (short) local14.method1252();
				this.aShortArray14[local683] = (short) local14.method1252();
				this.aByteArray8[local683] = local19.method1241();
				this.aByteArray15[local683] = local24.method1241();
				this.aByteArray7[local683] = local29.method1241();
			}
		}
		local4.anInt1597 = local113;
		local786 = local4.method1253();
		if (local786 == 0) {
			return;
		}
		new Class22();
		local4.method1252();
		local4.method1252();
		local4.method1252();
		local4.method1263();
	}

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "()Lclient!ff;")
	public Class4_Sub1_Sub1_Sub6 method1013() {
		@Pc(3) Class4_Sub1_Sub1_Sub6 local3 = new Class4_Sub1_Sub1_Sub6();
		if (this.aByteArray14 != null) {
			local3.aByteArray14 = new byte[this.anInt1309];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1309; local13++) {
				local3.aByteArray14[local13] = this.aByteArray14[local13];
			}
		}
		local3.anInt1307 = this.anInt1307;
		local3.anInt1309 = this.anInt1309;
		local3.anInt1308 = this.anInt1308;
		local3.anIntArray130 = this.anIntArray130;
		local3.anIntArray135 = this.anIntArray135;
		local3.anIntArray133 = this.anIntArray133;
		local3.anIntArray129 = this.anIntArray129;
		local3.anIntArray132 = this.anIntArray132;
		local3.anIntArray127 = this.anIntArray127;
		local3.aByteArray16 = this.aByteArray16;
		local3.aByteArray12 = this.aByteArray12;
		local3.aByteArray13 = this.aByteArray13;
		local3.aShortArray12 = this.aShortArray12;
		local3.aShortArray10 = this.aShortArray10;
		local3.aByte4 = this.aByte4;
		local3.aByteArray10 = this.aByteArray10;
		local3.aShortArray13 = this.aShortArray13;
		local3.aShortArray8 = this.aShortArray8;
		local3.aShortArray15 = this.aShortArray15;
		local3.aShortArray9 = this.aShortArray9;
		local3.aShortArray11 = this.aShortArray11;
		local3.aShortArray14 = this.aShortArray14;
		local3.aByteArray8 = this.aByteArray8;
		local3.aByteArray15 = this.aByteArray15;
		local3.aByteArray7 = this.aByteArray7;
		local3.aByteArray9 = this.aByteArray9;
		local3.aByteArray11 = this.aByteArray11;
		local3.anIntArray137 = this.anIntArray137;
		local3.anIntArray136 = this.anIntArray136;
		local3.anIntArrayArray10 = this.anIntArrayArray10;
		local3.anIntArrayArray11 = this.anIntArrayArray11;
		local3.aClass6Array2 = this.aClass6Array2;
		local3.aClass16Array1 = this.aClass16Array1;
		local3.aShort21 = this.aShort21;
		local3.aShort15 = this.aShort15;
		return local3;
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
	public void method1014() {
		@Pc(3) int local3 = Static51.anIntArray134[256];
		@Pc(7) int local7 = Static51.anIntArray131[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1307; local9++) {
			@Pc(26) int local26 = this.anIntArray133[local9] * local3 + this.anIntArray130[local9] * local7 >> 16;
			this.anIntArray133[local9] = this.anIntArray133[local9] * local7 - this.anIntArray130[local9] * local3 >> 16;
			this.anIntArray130[local9] = local26;
		}
		this.method1002();
	}

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "()V")
	public void method1015() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1307; local1++) {
			this.anIntArray133[local1] = -this.anIntArray133[local1];
		}
		this.method1002();
	}
}
