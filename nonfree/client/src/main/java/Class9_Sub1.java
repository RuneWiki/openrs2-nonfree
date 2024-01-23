import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "[Lclient!kc;")
	public Class56[] aClass56Array1;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "S")
	private short aShort1;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "[Lclient!rh;")
	public Class85[] aClass85Array1;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "[S")
	public short[] aShortArray5;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "[I")
	public int[] anIntArray54;

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
	public int anInt401;

	@OriginalMember(owner = "client!bc", name = "Q", descriptor = "[I")
	public int[] anIntArray56;

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "[Lclient!rh;")
	public Class85[] aClass85Array2;

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "S")
	public short aShort4;

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "[I")
	public int[] anIntArray57;

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "[I")
	public int[] anIntArray58;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!bc", name = "bb", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!bc", name = "cb", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!bc", name = "fb", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!bc", name = "gb", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!bc", name = "ib", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!bc", name = "jb", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!bc", name = "lb", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!bc", name = "mb", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!bc", name = "nb", descriptor = "[I")
	public int[] anIntArray61;

	@OriginalMember(owner = "client!bc", name = "ob", descriptor = "[I")
	public int[] anIntArray62;

	@OriginalMember(owner = "client!bc", name = "pb", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!bc", name = "qb", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
	public int anInt400 = 0;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
	public int anInt403 = 0;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	private Class9_Sub1() {
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([B)V")
	public Class9_Sub1(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method270(arg0);
		} else {
			this.method281(arg0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([Lclient!bc;I)V")
	public Class9_Sub1(@OriginalArg(0) Class9_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt400 = 0;
		this.anInt403 = 0;
		this.anInt401 = 0;
		this.aByte7 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class9_Sub1 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt400 += local44.anInt400;
				this.anInt403 += local44.anInt403;
				this.anInt401 += local44.anInt401;
				if (local44.aByteArray13 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local44.aByte7;
					}
					if (this.aByte7 != local44.aByte7) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray11 != null;
				local19 |= local44.aByteArray8 != null;
				local21 |= local44.anIntArray53 != null;
				local23 |= local44.aShortArray5 != null;
				local25 |= local44.aByteArray5 != null;
			}
		}
		this.anIntArray61 = new int[this.anInt400];
		this.anIntArray58 = new int[this.anInt400];
		this.anIntArray57 = new int[this.anInt400];
		this.anIntArray59 = new int[this.anInt400];
		this.anIntArray54 = new int[this.anInt403];
		this.anIntArray62 = new int[this.anInt403];
		this.anIntArray56 = new int[this.anInt403];
		if (local15) {
			this.aByteArray11 = new byte[this.anInt403];
		}
		if (local17) {
			this.aByteArray13 = new byte[this.anInt403];
		}
		if (local19) {
			this.aByteArray8 = new byte[this.anInt403];
		}
		if (local21) {
			this.anIntArray53 = new int[this.anInt403];
		}
		if (local23) {
			this.aShortArray5 = new short[this.anInt403];
		}
		if (local25) {
			this.aByteArray5 = new byte[this.anInt403];
		}
		this.aShortArray11 = new short[this.anInt403];
		if (this.anInt401 > 0) {
			this.aByteArray9 = new byte[this.anInt401];
			this.aShortArray7 = new short[this.anInt401];
			this.aShortArray8 = new short[this.anInt401];
			this.aShortArray10 = new short[this.anInt401];
			this.aShortArray9 = new short[this.anInt401];
			this.aShortArray6 = new short[this.anInt401];
			this.aShortArray4 = new short[this.anInt401];
			this.aByteArray12 = new byte[this.anInt401];
			this.aByteArray14 = new byte[this.anInt401];
			this.aByteArray6 = new byte[this.anInt401];
			this.aByteArray10 = new byte[this.anInt401];
			this.aByteArray7 = new byte[this.anInt401];
		}
		this.anInt400 = 0;
		this.anInt403 = 0;
		this.anInt401 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class9_Sub1 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt403; local302++) {
					if (local15 && local298.aByteArray11 != null) {
						this.aByteArray11[this.anInt403] = local298.aByteArray11[local302];
					}
					if (local17) {
						if (local298.aByteArray13 == null) {
							this.aByteArray13[this.anInt403] = local298.aByte7;
						} else {
							this.aByteArray13[this.anInt403] = local298.aByteArray13[local302];
						}
					}
					if (local19 && local298.aByteArray8 != null) {
						this.aByteArray8[this.anInt403] = local298.aByteArray8[local302];
					}
					if (local21 && local298.anIntArray53 != null) {
						this.anIntArray53[this.anInt403] = local298.anIntArray53[local302];
					}
					if (local23) {
						if (local298.aShortArray5 == null) {
							this.aShortArray5[this.anInt403] = -1;
						} else {
							this.aShortArray5[this.anInt403] = local298.aShortArray5[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray5 == null || local298.aByteArray5[local302] == -1) {
							this.aByteArray5[this.anInt403] = -1;
						} else {
							this.aByteArray5[this.anInt403] = (byte) (local298.aByteArray5[local302] + this.anInt401);
						}
					}
					this.aShortArray11[this.anInt403] = local298.aShortArray11[local302];
					this.anIntArray54[this.anInt403] = this.method289(local298, local298.anIntArray54[local302]);
					this.anIntArray62[this.anInt403] = this.method289(local298, local298.anIntArray62[local302]);
					this.anIntArray56[this.anInt403] = this.method289(local298, local298.anIntArray56[local302]);
					this.anInt403++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt401; local477++) {
					@Pc(489) byte local489 = this.aByteArray9[this.anInt401] = local298.aByteArray9[local477];
					if (local489 == 0) {
						this.aShortArray7[this.anInt401] = (short) this.method289(local298, local298.aShortArray7[local477]);
						this.aShortArray8[this.anInt401] = (short) this.method289(local298, local298.aShortArray8[local477]);
						this.aShortArray10[this.anInt401] = (short) this.method289(local298, local298.aShortArray10[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray7[this.anInt401] = local298.aShortArray7[local477];
						this.aShortArray8[this.anInt401] = local298.aShortArray8[local477];
						this.aShortArray10[this.anInt401] = local298.aShortArray10[local477];
						this.aShortArray9[this.anInt401] = local298.aShortArray9[local477];
						this.aShortArray6[this.anInt401] = local298.aShortArray6[local477];
						this.aShortArray4[this.anInt401] = local298.aShortArray4[local477];
						this.aByteArray12[this.anInt401] = local298.aByteArray12[local477];
						this.aByteArray14[this.anInt401] = local298.aByteArray14[local477];
						this.aByteArray6[this.anInt401] = local298.aByteArray6[local477];
					}
					if (local489 == 2) {
						this.aByteArray10[this.anInt401] = local298.aByteArray10[local477];
						this.aByteArray7[this.anInt401] = local298.aByteArray7[local477];
					}
					this.anInt401++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!bc;ZZZZ)V")
	public Class9_Sub1(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt400 = arg0.anInt400;
		this.anInt403 = arg0.anInt403;
		this.anInt401 = arg0.anInt401;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray61 = arg0.anIntArray61;
			this.anIntArray58 = arg0.anIntArray58;
			this.anIntArray57 = arg0.anIntArray57;
		} else {
			this.anIntArray61 = new int[this.anInt400];
			this.anIntArray58 = new int[this.anInt400];
			this.anIntArray57 = new int[this.anInt400];
			for (local57 = 0; local57 < this.anInt400; local57++) {
				this.anIntArray61[local57] = arg0.anIntArray61[local57];
				this.anIntArray58[local57] = arg0.anIntArray58[local57];
				this.anIntArray57[local57] = arg0.anIntArray57[local57];
			}
		}
		if (arg2) {
			this.aShortArray11 = arg0.aShortArray11;
		} else {
			this.aShortArray11 = new short[this.anInt403];
			for (local57 = 0; local57 < this.anInt403; local57++) {
				this.aShortArray11[local57] = arg0.aShortArray11[local57];
			}
		}
		if (arg3 || arg0.aShortArray5 == null) {
			this.aShortArray5 = arg0.aShortArray5;
		} else {
			this.aShortArray5 = new short[this.anInt403];
			for (local57 = 0; local57 < this.anInt403; local57++) {
				this.aShortArray5[local57] = arg0.aShortArray5[local57];
			}
		}
		this.aByteArray8 = arg0.aByteArray8;
		this.anIntArray54 = arg0.anIntArray54;
		this.anIntArray62 = arg0.anIntArray62;
		this.anIntArray56 = arg0.anIntArray56;
		this.aByteArray11 = arg0.aByteArray11;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByteArray5 = arg0.aByteArray5;
		this.aByte7 = arg0.aByte7;
		this.aByteArray9 = arg0.aByteArray9;
		this.aShortArray7 = arg0.aShortArray7;
		this.aShortArray8 = arg0.aShortArray8;
		this.aShortArray10 = arg0.aShortArray10;
		this.aShortArray9 = arg0.aShortArray9;
		this.aShortArray6 = arg0.aShortArray6;
		this.aShortArray4 = arg0.aShortArray4;
		this.aByteArray12 = arg0.aByteArray12;
		this.aByteArray14 = arg0.aByteArray14;
		this.aByteArray6 = arg0.aByteArray6;
		this.aByteArray10 = arg0.aByteArray10;
		this.aByteArray7 = arg0.aByteArray7;
		this.anIntArray59 = arg0.anIntArray59;
		this.anIntArray53 = arg0.anIntArray53;
		this.anIntArrayArray11 = arg0.anIntArrayArray11;
		this.anIntArrayArray10 = arg0.anIntArrayArray10;
		this.aClass85Array1 = arg0.aClass85Array1;
		this.aClass56Array1 = arg0.aClass56Array1;
		this.aClass85Array2 = arg0.aClass85Array2;
		this.aShort4 = arg0.aShort4;
		this.aShort6 = arg0.aShort6;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)V")
	public void method266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt400; local1++) {
			this.anIntArray61[local1] = this.anIntArray61[local1] * arg0 / 128;
			this.anIntArray58[local1] = this.anIntArray58[local1] * arg1 / 128;
			this.anIntArray57[local1] = this.anIntArray57[local1] * arg2 / 128;
		}
		this.method292();
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(III)V")
	public void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(28) int local28;
		if (arg2 != 0) {
			local5 = Static14.anIntArray63[arg2];
			local9 = Static14.anIntArray55[arg2];
			for (local11 = 0; local11 < this.anInt400; local11++) {
				local28 = this.anIntArray58[local11] * local5 + this.anIntArray61[local11] * local9 >> 16;
				this.anIntArray58[local11] = this.anIntArray58[local11] * local9 - this.anIntArray61[local11] * local5 >> 16;
				this.anIntArray61[local11] = local28;
			}
		}
		if (arg0 != 0) {
			local5 = Static14.anIntArray63[arg0];
			local9 = Static14.anIntArray55[arg0];
			for (local11 = 0; local11 < this.anInt400; local11++) {
				local28 = this.anIntArray58[local11] * local9 - this.anIntArray57[local11] * local5 >> 16;
				this.anIntArray57[local11] = this.anIntArray58[local11] * local5 + this.anIntArray57[local11] * local9 >> 16;
				this.anIntArray58[local11] = local28;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static14.anIntArray63[arg1];
		local9 = Static14.anIntArray55[arg1];
		for (local11 = 0; local11 < this.anInt400; local11++) {
			local28 = this.anIntArray57[local11] * local5 + this.anIntArray61[local11] * local9 >> 16;
			this.anIntArray57[local11] = this.anIntArray57[local11] * local9 - this.anIntArray61[local11] * local5 >> 16;
			this.anIntArray61[local11] = local28;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()I")
	@Override
	public int method2902() {
		if (!this.aBoolean30) {
			this.method273();
		}
		return this.aShort3;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
	public void method268() {
		if (this.aClass85Array1 != null) {
			return;
		}
		this.aClass85Array1 = new Class85[this.anInt400];
		for (@Pc(10) int local10 = 0; local10 < this.anInt400; local10++) {
			this.aClass85Array1[local10] = new Class85();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt403; local25++) {
			@Pc(31) int local31 = this.anIntArray54[local25];
			@Pc(36) int local36 = this.anIntArray62[local25];
			@Pc(41) int local41 = this.anIntArray56[local25];
			@Pc(51) int local51 = this.anIntArray61[local36] - this.anIntArray61[local31];
			@Pc(61) int local61 = this.anIntArray58[local36] - this.anIntArray58[local31];
			@Pc(71) int local71 = this.anIntArray57[local36] - this.anIntArray57[local31];
			@Pc(81) int local81 = this.anIntArray61[local41] - this.anIntArray61[local31];
			@Pc(91) int local91 = this.anIntArray58[local41] - this.anIntArray58[local31];
			@Pc(101) int local101 = this.anIntArray57[local41] - this.anIntArray57[local31];
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
			if (this.aByteArray11 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray11[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class85 local211 = this.aClass85Array1[local31];
				local211.anInt3704 += local109;
				local211.anInt3702 += local117;
				local211.anInt3705 += local125;
				local211.anInt3708++;
				@Pc(240) Class85 local240 = this.aClass85Array1[local36];
				local240.anInt3704 += local109;
				local240.anInt3702 += local117;
				local240.anInt3705 += local125;
				local240.anInt3708++;
				@Pc(269) Class85 local269 = this.aClass85Array1[local41];
				local269.anInt3704 += local109;
				local269.anInt3702 += local117;
				local269.anInt3705 += local125;
				local269.anInt3708++;
			} else if (local198 == 1) {
				if (this.aClass56Array1 == null) {
					this.aClass56Array1 = new Class56[this.anInt403];
				}
				@Pc(314) Class56 local314 = this.aClass56Array1[local25] = new Class56();
				local314.anInt2350 = local109;
				local314.anInt2353 = local117;
				local314.anInt2349 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Lclient!dd;")
	@Override
	public Class9 method2898() {
		return this.method288(this.aShort4, this.aShort6, -50, -10, -50);
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "()Lclient!bc;")
	public Class9_Sub1 method269() {
		@Pc(3) Class9_Sub1 local3 = new Class9_Sub1();
		if (this.aByteArray11 != null) {
			local3.aByteArray11 = new byte[this.anInt403];
			for (@Pc(13) int local13 = 0; local13 < this.anInt403; local13++) {
				local3.aByteArray11[local13] = this.aByteArray11[local13];
			}
		}
		local3.anInt400 = this.anInt400;
		local3.anInt403 = this.anInt403;
		local3.anInt401 = this.anInt401;
		local3.anIntArray61 = this.anIntArray61;
		local3.anIntArray58 = this.anIntArray58;
		local3.anIntArray57 = this.anIntArray57;
		local3.anIntArray54 = this.anIntArray54;
		local3.anIntArray62 = this.anIntArray62;
		local3.anIntArray56 = this.anIntArray56;
		local3.aByteArray13 = this.aByteArray13;
		local3.aByteArray8 = this.aByteArray8;
		local3.aByteArray5 = this.aByteArray5;
		local3.aShortArray11 = this.aShortArray11;
		local3.aShortArray5 = this.aShortArray5;
		local3.aByte7 = this.aByte7;
		local3.aByteArray9 = this.aByteArray9;
		local3.aShortArray7 = this.aShortArray7;
		local3.aShortArray8 = this.aShortArray8;
		local3.aShortArray10 = this.aShortArray10;
		local3.aShortArray9 = this.aShortArray9;
		local3.aShortArray6 = this.aShortArray6;
		local3.aShortArray4 = this.aShortArray4;
		local3.aByteArray12 = this.aByteArray12;
		local3.aByteArray14 = this.aByteArray14;
		local3.aByteArray6 = this.aByteArray6;
		local3.aByteArray10 = this.aByteArray10;
		local3.aByteArray7 = this.aByteArray7;
		local3.anIntArray59 = this.anIntArray59;
		local3.anIntArray53 = this.anIntArray53;
		local3.anIntArrayArray11 = this.anIntArrayArray11;
		local3.anIntArrayArray10 = this.anIntArrayArray10;
		local3.aClass85Array1 = this.aClass85Array1;
		local3.aClass56Array1 = this.aClass56Array1;
		local3.aShort4 = this.aShort4;
		local3.aShort6 = this.aShort6;
		return local3;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([B)V")
	private void method270(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub9 local4 = new Class1_Sub9(arg0);
		@Pc(9) Class1_Sub9 local9 = new Class1_Sub9(arg0);
		@Pc(14) Class1_Sub9 local14 = new Class1_Sub9(arg0);
		@Pc(19) Class1_Sub9 local19 = new Class1_Sub9(arg0);
		@Pc(24) Class1_Sub9 local24 = new Class1_Sub9(arg0);
		@Pc(29) Class1_Sub9 local29 = new Class1_Sub9(arg0);
		@Pc(34) Class1_Sub9 local34 = new Class1_Sub9(arg0);
		local4.anInt1192 = arg0.length - 23;
		@Pc(44) int local44 = local4.method946();
		@Pc(48) int local48 = local4.method946();
		@Pc(52) int local52 = local4.method895();
		@Pc(56) int local56 = local4.method895();
		@Pc(60) int local60 = local4.method895();
		@Pc(64) int local64 = local4.method895();
		@Pc(68) int local68 = local4.method895();
		@Pc(72) int local72 = local4.method895();
		@Pc(76) int local76 = local4.method895();
		@Pc(80) int local80 = local4.method946();
		@Pc(84) int local84 = local4.method946();
		@Pc(88) int local88 = local4.method946();
		@Pc(92) int local92 = local4.method946();
		@Pc(96) int local96 = local4.method946();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray9 = new byte[local52];
			local4.anInt1192 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray9[local113] = local4.method891();
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
		this.anInt400 = local44;
		this.anInt403 = local48;
		this.anInt401 = local52;
		this.anIntArray61 = new int[local44];
		this.anIntArray58 = new int[local44];
		this.anIntArray57 = new int[local44];
		this.anIntArray54 = new int[local48];
		this.anIntArray62 = new int[local48];
		this.anIntArray56 = new int[local48];
		if (local76 == 1) {
			this.anIntArray59 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray11 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray13 = new byte[local48];
		} else {
			this.aByte7 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray8 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray53 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray5 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray5 = new byte[local48];
		}
		this.aShortArray11 = new short[local48];
		if (local52 > 0) {
			this.aShortArray7 = new short[local52];
			this.aShortArray8 = new short[local52];
			this.aShortArray10 = new short[local52];
			if (local100 > 0) {
				this.aShortArray9 = new short[local100];
				this.aShortArray6 = new short[local100];
				this.aShortArray4 = new short[local100];
				this.aByteArray12 = new byte[local100];
				this.aByteArray14 = new byte[local100];
				this.aByteArray6 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray10 = new byte[local102];
				this.aByteArray7 = new byte[local102];
			}
		}
		local4.anInt1192 = local52;
		local9.anInt1192 = local233;
		local14.anInt1192 = local239;
		local19.anInt1192 = local245;
		local24.anInt1192 = local184;
		@Pc(455) int local455 = 0;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(466) int local466;
		@Pc(468) int local468;
		@Pc(478) int local478;
		@Pc(488) int local488;
		for (@Pc(461) int local461 = 0; local461 < local44; local461++) {
			local466 = local4.method895();
			local468 = 0;
			if ((local466 & 0x1) != 0) {
				local468 = local9.method926();
			}
			local478 = 0;
			if ((local466 & 0x2) != 0) {
				local478 = local14.method926();
			}
			local488 = 0;
			if ((local466 & 0x4) != 0) {
				local488 = local19.method926();
			}
			this.anIntArray61[local461] = local455 + local468;
			this.anIntArray58[local461] = local457 + local478;
			this.anIntArray57[local461] = local459 + local488;
			local455 = this.anIntArray61[local461];
			local457 = this.anIntArray58[local461];
			local459 = this.anIntArray57[local461];
			if (local76 == 1) {
				this.anIntArray59[local461] = local24.method895();
			}
		}
		local4.anInt1192 = local225;
		local9.anInt1192 = local151;
		local14.anInt1192 = local166;
		local19.anInt1192 = local193;
		local24.anInt1192 = local175;
		local29.anInt1192 = local208;
		local34.anInt1192 = local219;
		for (local466 = 0; local466 < local48; local466++) {
			this.aShortArray11[local466] = (short) local4.method946();
			if (local56 == 1) {
				this.aByteArray11[local466] = local9.method891();
			}
			if (local60 == 255) {
				this.aByteArray13[local466] = local14.method891();
			}
			if (local64 == 1) {
				this.aByteArray8[local466] = local19.method891();
			}
			if (local68 == 1) {
				this.anIntArray53[local466] = local24.method895();
			}
			if (local72 == 1) {
				this.aShortArray5[local466] = (short) (local29.method946() - 1);
			}
			if (this.aByteArray5 != null) {
				if (this.aShortArray5[local466] == -1) {
					this.aByteArray5[local466] = -1;
				} else {
					this.aByteArray5[local466] = (byte) (local34.method895() - 1);
				}
			}
		}
		local4.anInt1192 = local202;
		local9.anInt1192 = local160;
		local468 = 0;
		local478 = 0;
		local488 = 0;
		@Pc(674) int local674 = 0;
		@Pc(681) int local681;
		@Pc(784) int local784;
		for (@Pc(676) int local676 = 0; local676 < local48; local676++) {
			local681 = local9.method895();
			if (local681 == 1) {
				local468 = local4.method926() + local674;
				local478 = local4.method926() + local468;
				local488 = local4.method926() + local478;
				local674 = local488;
				this.anIntArray54[local676] = local468;
				this.anIntArray62[local676] = local478;
				this.anIntArray56[local676] = local488;
			}
			if (local681 == 2) {
				local478 = local488;
				local488 = local4.method926() + local674;
				local674 = local488;
				this.anIntArray54[local676] = local468;
				this.anIntArray62[local676] = local478;
				this.anIntArray56[local676] = local488;
			}
			if (local681 == 3) {
				local468 = local488;
				local488 = local4.method926() + local674;
				local674 = local488;
				this.anIntArray54[local676] = local468;
				this.anIntArray62[local676] = local478;
				this.anIntArray56[local676] = local488;
			}
			if (local681 == 4) {
				local784 = local468;
				local468 = local478;
				local478 = local784;
				local488 = local4.method926() + local674;
				local674 = local488;
				this.anIntArray54[local676] = local468;
				this.anIntArray62[local676] = local784;
				this.anIntArray56[local676] = local488;
			}
		}
		local4.anInt1192 = local251;
		local9.anInt1192 = local259;
		local14.anInt1192 = local267;
		local19.anInt1192 = local275;
		local24.anInt1192 = local281;
		local29.anInt1192 = local113;
		for (local681 = 0; local681 < local52; local681++) {
			local784 = this.aByteArray9[local681] & 0xFF;
			if (local784 == 0) {
				this.aShortArray7[local681] = (short) local4.method946();
				this.aShortArray8[local681] = (short) local4.method946();
				this.aShortArray10[local681] = (short) local4.method946();
			}
			if (local784 == 1) {
				this.aShortArray7[local681] = (short) local9.method946();
				this.aShortArray8[local681] = (short) local9.method946();
				this.aShortArray10[local681] = (short) local9.method946();
				this.aShortArray9[local681] = (short) local14.method946();
				this.aShortArray6[local681] = (short) local14.method946();
				this.aShortArray4[local681] = (short) local14.method946();
				this.aByteArray12[local681] = local19.method891();
				this.aByteArray14[local681] = local24.method891();
				this.aByteArray6[local681] = local29.method891();
			}
			if (local784 == 2) {
				this.aShortArray7[local681] = (short) local9.method946();
				this.aShortArray8[local681] = (short) local9.method946();
				this.aShortArray10[local681] = (short) local9.method946();
				this.aShortArray9[local681] = (short) local14.method946();
				this.aShortArray6[local681] = (short) local14.method946();
				this.aShortArray4[local681] = (short) local14.method946();
				this.aByteArray12[local681] = local19.method891();
				this.aByteArray14[local681] = local24.method891();
				this.aByteArray6[local681] = local29.method891();
				this.aByteArray10[local681] = local29.method891();
				this.aByteArray7[local681] = local29.method891();
			}
			if (local784 == 3) {
				this.aShortArray7[local681] = (short) local9.method946();
				this.aShortArray8[local681] = (short) local9.method946();
				this.aShortArray10[local681] = (short) local9.method946();
				this.aShortArray9[local681] = (short) local14.method946();
				this.aShortArray6[local681] = (short) local14.method946();
				this.aShortArray4[local681] = (short) local14.method946();
				this.aByteArray12[local681] = local19.method891();
				this.aByteArray14[local681] = local24.method891();
				this.aByteArray6[local681] = local29.method891();
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	private void method271(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static14.anIntArray63[arg0];
		@Pc(7) int local7 = Static14.anIntArray55[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt400; local9++) {
			@Pc(26) int local26 = this.anIntArray58[local9] * local3 + this.anIntArray61[local9] * local7 >> 16;
			this.anIntArray58[local9] = this.anIntArray58[local9] * local7 - this.anIntArray61[local9] * local3 >> 16;
			this.anIntArray61[local9] = local26;
		}
		this.method292();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!bc;")
	public Class9_Sub1 method272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method273();
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
		@Pc(147) Class9_Sub1 local147 = new Class9_Sub1();
		local147.anInt400 = this.anInt400;
		local147.anInt403 = this.anInt403;
		local147.anInt401 = this.anInt401;
		local147.anIntArray54 = this.anIntArray54;
		local147.anIntArray62 = this.anIntArray62;
		local147.anIntArray56 = this.anIntArray56;
		local147.aByteArray11 = this.aByteArray11;
		local147.aByteArray13 = this.aByteArray13;
		local147.aByteArray8 = this.aByteArray8;
		local147.aByteArray5 = this.aByteArray5;
		local147.aShortArray11 = this.aShortArray11;
		local147.aShortArray5 = this.aShortArray5;
		local147.aByte7 = this.aByte7;
		local147.aByteArray9 = this.aByteArray9;
		local147.aShortArray7 = this.aShortArray7;
		local147.aShortArray8 = this.aShortArray8;
		local147.aShortArray10 = this.aShortArray10;
		local147.aShortArray9 = this.aShortArray9;
		local147.aShortArray6 = this.aShortArray6;
		local147.aShortArray4 = this.aShortArray4;
		local147.aByteArray12 = this.aByteArray12;
		local147.aByteArray14 = this.aByteArray14;
		local147.aByteArray6 = this.aByteArray6;
		local147.aByteArray10 = this.aByteArray10;
		local147.aByteArray7 = this.aByteArray7;
		local147.anIntArray59 = this.anIntArray59;
		local147.anIntArray53 = this.anIntArray53;
		local147.anIntArrayArray11 = this.anIntArrayArray11;
		local147.anIntArrayArray10 = this.anIntArrayArray10;
		local147.aShort4 = this.aShort4;
		local147.aShort6 = this.aShort6;
		local147.aClass85Array1 = this.aClass85Array1;
		local147.aClass56Array1 = this.aClass56Array1;
		local147.aClass85Array2 = this.aClass85Array2;
		if (arg0 == 3) {
			local147.anIntArray61 = Static66.method1179(this.anIntArray61);
			local147.anIntArray58 = Static66.method1179(this.anIntArray58);
			local147.anIntArray57 = Static66.method1179(this.anIntArray57);
		} else {
			local147.anIntArray61 = this.anIntArray61;
			local147.anIntArray58 = new int[local147.anInt400];
			local147.anIntArray57 = this.anIntArray57;
		}
		@Pc(326) int local326;
		@Pc(334) int local334;
		@Pc(341) int local341;
		@Pc(345) int local345;
		@Pc(349) int local349;
		@Pc(353) int local353;
		@Pc(357) int local357;
		@Pc(379) int local379;
		@Pc(405) int local405;
		@Pc(417) int local417;
		if (arg0 == 1) {
			for (local326 = 0; local326 < local147.anInt400; local326++) {
				local334 = this.anIntArray61[local326] + arg4;
				local341 = this.anIntArray57[local326] + arg6;
				local345 = local334 & 0x7F;
				local349 = local341 & 0x7F;
				local353 = local334 >> 7;
				local357 = local341 >> 7;
				local379 = arg2[local353][local357] * (128 - local345) + arg2[local353 + 1][local357] * local345 >> 7;
				local405 = arg2[local353][local357 + 1] * (128 - local345) + arg2[local353 + 1][local357 + 1] * local345 >> 7;
				local417 = local379 * (128 - local349) + local405 * local349 >> 7;
				local147.anIntArray58[local326] = this.anIntArray58[local326] + local417 - arg5;
			}
		} else {
			@Pc(544) int local544;
			if (arg0 == 2) {
				for (local326 = 0; local326 < local147.anInt400; local326++) {
					local334 = (this.anIntArray58[local326] << 16) / this.aShort3;
					if (local334 < arg1) {
						local341 = this.anIntArray61[local326] + arg4;
						local345 = this.anIntArray57[local326] + arg6;
						local349 = local341 & 0x7F;
						local353 = local345 & 0x7F;
						local357 = local341 >> 7;
						local379 = local345 >> 7;
						local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
						local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
						local544 = local405 * (128 - local353) + local417 * local353 >> 7;
						local147.anIntArray58[local326] = this.anIntArray58[local326] + (local544 - arg5) * (arg1 - local334) / arg1;
					} else {
						local147.anIntArray58[local326] = this.anIntArray58[local326];
					}
				}
			} else if (arg0 == 3) {
				local326 = (arg1 & 0xFF) * 4;
				local334 = (arg1 >> 8 & 0xFF) * 4;
				this.method291(arg2, arg4, arg5, arg6, local326, local334);
			} else if (arg0 == 4) {
				local326 = this.aShort8 - this.aShort3;
				for (local334 = 0; local334 < this.anInt400; local334++) {
					local341 = this.anIntArray61[local334] + arg4;
					local345 = this.anIntArray57[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local147.anIntArray58[local334] = this.anIntArray58[local334] + local544 + local326 - arg5;
				}
			} else if (arg0 == 5) {
				local326 = this.aShort8 - this.aShort3;
				for (local334 = 0; local334 < this.anInt400; local334++) {
					local341 = this.anIntArray61[local334] + arg4;
					local345 = this.anIntArray57[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
					local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					@Pc(887) int local887 = local405 * (128 - local353) + local417 * local353 >> 7;
					@Pc(891) int local891 = local544 - local887;
					local147.anIntArray58[local334] = ((this.anIntArray58[local334] << 8) / local326 * local891 >> 8) - (arg5 - local544);
				}
			}
		}
		this.aBoolean30 = false;
		return local147;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "()V")
	private void method273() {
		if (this.aBoolean30) {
			return;
		}
		this.aBoolean30 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt400; local20++) {
			@Pc(26) int local26 = this.anIntArray61[local20];
			@Pc(31) int local31 = this.anIntArray58[local20];
			@Pc(36) int local36 = this.anIntArray57[local20];
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
		this.aShort7 = (short) local8;
		this.aShort5 = (short) local14;
		this.aShort3 = (short) local10;
		this.aShort8 = (short) local16;
		this.aShort2 = (short) local12;
		this.aShort1 = (short) local18;
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "()V")
	public void method274() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt400; local1++) {
			@Pc(7) int local7 = this.anIntArray61[local1];
			this.anIntArray61[local1] = this.anIntArray57[local1];
			this.anIntArray57[local1] = -local7;
		}
		this.method292();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(SS)V")
	public void method276(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt403; local1++) {
			if (this.aShortArray11[local1] == arg0) {
				this.aShortArray11[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public void method277() {
		@Pc(3) int local3 = Static14.anIntArray63[256];
		@Pc(7) int local7 = Static14.anIntArray55[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt400; local9++) {
			@Pc(26) int local26 = this.anIntArray57[local9] * local3 + this.anIntArray61[local9] * local7 >> 16;
			this.anIntArray57[local9] = this.anIntArray57[local9] * local7 - this.anIntArray61[local9] * local3 >> 16;
			this.anIntArray61[local9] = local26;
		}
		this.method292();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()Z")
	@Override
	public boolean method2896() {
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "()V")
	public void method278() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt400; local1++) {
			this.anIntArray61[local1] = -this.anIntArray61[local1];
			this.anIntArray57[local1] = -this.anIntArray57[local1];
		}
		this.method292();
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
	private void method279(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static14.anIntArray63[arg0];
		@Pc(7) int local7 = Static14.anIntArray55[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt400; local9++) {
			@Pc(26) int local26 = this.anIntArray58[local9] * local7 - this.anIntArray57[local9] * local3 >> 16;
			this.anIntArray57[local9] = this.anIntArray58[local9] * local3 + this.anIntArray57[local9] * local7 >> 16;
			this.anIntArray58[local9] = local26;
		}
		this.method292();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)Lclient!ji;")
	public Class9_Sub2_Sub1 method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class9_Sub2_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "([B)V")
	private void method281(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub9 local8 = new Class1_Sub9(arg0);
		@Pc(13) Class1_Sub9 local13 = new Class1_Sub9(arg0);
		@Pc(18) Class1_Sub9 local18 = new Class1_Sub9(arg0);
		@Pc(23) Class1_Sub9 local23 = new Class1_Sub9(arg0);
		@Pc(28) Class1_Sub9 local28 = new Class1_Sub9(arg0);
		local8.anInt1192 = arg0.length - 18;
		@Pc(38) int local38 = local8.method946();
		@Pc(42) int local42 = local8.method946();
		@Pc(46) int local46 = local8.method895();
		@Pc(50) int local50 = local8.method895();
		@Pc(54) int local54 = local8.method895();
		@Pc(58) int local58 = local8.method895();
		@Pc(62) int local62 = local8.method895();
		@Pc(66) int local66 = local8.method895();
		@Pc(70) int local70 = local8.method946();
		@Pc(74) int local74 = local8.method946();
		@Pc(78) int local78 = local8.method946();
		@Pc(82) int local82 = local8.method946();
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
		this.anInt400 = local38;
		this.anInt403 = local42;
		this.anInt401 = local46;
		this.anIntArray61 = new int[local38];
		this.anIntArray58 = new int[local38];
		this.anIntArray57 = new int[local38];
		this.anIntArray54 = new int[local42];
		this.anIntArray62 = new int[local42];
		this.anIntArray56 = new int[local42];
		if (local46 > 0) {
			this.aByteArray9 = new byte[local46];
			this.aShortArray7 = new short[local46];
			this.aShortArray8 = new short[local46];
			this.aShortArray10 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray59 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray11 = new byte[local42];
			this.aByteArray5 = new byte[local42];
			this.aShortArray5 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray13 = new byte[local42];
		} else {
			this.aByte7 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray8 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray53 = new int[local42];
		}
		this.aShortArray11 = new short[local42];
		local8.anInt1192 = 0;
		local13.anInt1192 = local165;
		local18.anInt1192 = local171;
		local23.anInt1192 = local90;
		local28.anInt1192 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method895();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method926();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method926();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method926();
			}
			this.anIntArray61[local307] = local301 + local314;
			this.anIntArray58[local307] = local303 + local324;
			this.anIntArray57[local307] = local305 + local334;
			local301 = this.anIntArray61[local307];
			local303 = this.anIntArray58[local307];
			local305 = this.anIntArray57[local307];
			if (local66 == 1) {
				this.anIntArray59[local307] = local28.method895();
			}
		}
		local8.anInt1192 = local149;
		local13.anInt1192 = local116;
		local18.anInt1192 = local98;
		local23.anInt1192 = local134;
		local28.anInt1192 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray11[local312] = (short) local8.method946();
			if (local50 == 1) {
				local314 = local13.method895();
				if ((local314 & 0x1) == 1) {
					this.aByteArray11[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray11[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray5[local312] = (byte) (local314 >> 2);
					this.aShortArray5[local312] = this.aShortArray11[local312];
					this.aShortArray11[local312] = 127;
					if (this.aShortArray5[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray5[local312] = -1;
					this.aShortArray5[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray13[local312] = local18.method891();
			}
			if (local58 == 1) {
				this.aByteArray8[local312] = local23.method891();
			}
			if (local62 == 1) {
				this.anIntArray53[local312] = local28.method895();
			}
		}
		local8.anInt1192 = local143;
		local13.anInt1192 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method895();
			if (local543 == 1) {
				local314 = local8.method926() + local536;
				local324 = local8.method926() + local314;
				local334 = local8.method926() + local324;
				local536 = local334;
				this.anIntArray54[local538] = local314;
				this.anIntArray62[local538] = local324;
				this.anIntArray56[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method926() + local536;
				local536 = local334;
				this.anIntArray54[local538] = local314;
				this.anIntArray62[local538] = local324;
				this.anIntArray56[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method926() + local536;
				local536 = local334;
				this.anIntArray54[local538] = local314;
				this.anIntArray62[local538] = local324;
				this.anIntArray56[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method926() + local536;
				local536 = local334;
				this.anIntArray54[local538] = local314;
				this.anIntArray62[local538] = local646;
				this.anIntArray56[local538] = local334;
			}
		}
		local8.anInt1192 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray9[local543] = 0;
			this.aShortArray7[local543] = (short) local8.method946();
			this.aShortArray8[local543] = (short) local8.method946();
			this.aShortArray10[local543] = (short) local8.method946();
		}
		if (this.aByteArray5 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray5[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray7[local731] & 0xFFFF) == this.anIntArray54[local723] && (this.aShortArray8[local731] & 0xFFFF) == this.anIntArray62[local723] && (this.aShortArray10[local731] & 0xFFFF) == this.anIntArray56[local723]) {
						this.aByteArray5[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray5 = null;
			}
		}
		if (!local3) {
			this.aShortArray5 = null;
		}
		if (!local1) {
			this.aByteArray11 = null;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(SS)V")
	public void method282(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray5 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt403; local5++) {
			if (this.aShortArray5[local5] == arg0) {
				this.aShortArray5[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!dd;IIIZ)V")
	@Override
	public void method2900(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class9_Sub1 local2 = (Class9_Sub1) arg0;
		local2.method273();
		local2.method268();
		Static14.anInt402++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray61;
		@Pc(18) int local18 = local2.anInt400;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt400; local20++) {
			@Pc(26) Class85 local26 = this.aClass85Array1[local20];
			if (local26.anInt3708 != 0) {
				local36 = this.anIntArray58[local20] - arg2;
				if (local36 >= local2.aShort3 && local36 <= local2.aShort8) {
					@Pc(52) int local52 = this.anIntArray61[local20] - arg1;
					if (local52 >= local2.aShort7 && local52 <= local2.aShort5) {
						@Pc(68) int local68 = this.anIntArray57[local20] - arg3;
						if (local68 >= local2.aShort2 && local68 <= local2.aShort1) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class85 local85 = local2.aClass85Array1[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray57[local79] && local36 == local2.anIntArray58[local79] && local85.anInt3708 != 0) {
									if (this.aClass85Array2 == null) {
										this.aClass85Array2 = new Class85[this.anInt400];
									}
									if (local2.aClass85Array2 == null) {
										local2.aClass85Array2 = new Class85[local18];
									}
									@Pc(125) Class85 local125 = this.aClass85Array2[local20];
									if (local125 == null) {
										local125 = this.aClass85Array2[local20] = new Class85(local26);
									}
									@Pc(142) Class85 local142 = local2.aClass85Array2[local79];
									if (local142 == null) {
										local142 = local2.aClass85Array2[local79] = new Class85(local85);
									}
									local125.anInt3704 += local85.anInt3704;
									local125.anInt3702 += local85.anInt3702;
									local125.anInt3705 += local85.anInt3705;
									local125.anInt3708 += local85.anInt3708;
									local142.anInt3704 += local26.anInt3704;
									local142.anInt3702 += local26.anInt3702;
									local142.anInt3705 += local26.anInt3705;
									local142.anInt3708 += local26.anInt3708;
									local12++;
									Static14.anIntArray60[local20] = Static14.anInt402;
									Static14.anIntArray52[local79] = Static14.anInt402;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt403; local236++) {
			if (Static14.anIntArray60[this.anIntArray54[local236]] == Static14.anInt402 && Static14.anIntArray60[this.anIntArray62[local236]] == Static14.anInt402 && Static14.anIntArray60[this.anIntArray56[local236]] == Static14.anInt402) {
				if (this.aByteArray11 == null) {
					this.aByteArray11 = new byte[this.anInt403];
				}
				this.aByteArray11[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt403; local36++) {
			if (Static14.anIntArray52[local2.anIntArray54[local36]] == Static14.anInt402 && Static14.anIntArray52[local2.anIntArray62[local36]] == Static14.anInt402 && Static14.anIntArray52[local2.anIntArray56[local36]] == Static14.anInt402) {
				if (local2.aByteArray11 == null) {
					local2.aByteArray11 = new byte[local2.anInt403];
				}
				local2.aByteArray11[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "()V")
	public void method283() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt400; local1++) {
			this.anIntArray57[local1] = -this.anIntArray57[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt403; local18++) {
			@Pc(24) int local24 = this.anIntArray54[local18];
			this.anIntArray54[local18] = this.anIntArray56[local18];
			this.anIntArray56[local18] = local24;
		}
		this.method292();
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(III)V")
	public void method284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt400; local1++) {
			this.anIntArray61[local1] += arg0;
			this.anIntArray58[local1] += arg1;
			this.anIntArray57[local1] += arg2;
		}
		this.method292();
	}

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "()V")
	public void method285() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt400; local1++) {
			@Pc(7) int local7 = this.anIntArray57[local1];
			this.anIntArray57[local1] = this.anIntArray61[local1];
			this.anIntArray61[local1] = -local7;
		}
		this.method292();
	}

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "()V")
	public void method286() {
		this.anIntArray59 = null;
		this.anIntArray53 = null;
		this.anIntArrayArray11 = null;
		this.anIntArrayArray10 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIIII)Lclient!cf;")
	public Class9_Sub2 method288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class9_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!bc;I)I")
	private int method289(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray61[arg1];
		@Pc(11) int local11 = arg0.anIntArray58[arg1];
		@Pc(16) int local16 = arg0.anIntArray57[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt400; local18++) {
			if (local6 == this.anIntArray61[local18] && local11 == this.anIntArray58[local18] && local16 == this.anIntArray57[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray61[this.anInt400] = local6;
			this.anIntArray58[this.anInt400] = local11;
			this.anIntArray57[this.anInt400] = local16;
			if (arg0.anIntArray59 != null) {
				this.anIntArray59[this.anInt400] = arg0.anIntArray59[arg1];
			}
			local1 = this.anInt400++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([[IIIIII)V")
	private void method291(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static14.method290(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static14.method290(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static14.method290(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static14.method290(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method279(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method271(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method284(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "()V")
	private void method292() {
		this.aClass85Array1 = null;
		this.aClass85Array2 = null;
		this.aClass56Array1 = null;
		this.aBoolean30 = false;
	}

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "()V")
	public void method293() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray59 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt400; local9++) {
				local15 = this.anIntArray59[local9];
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
			while (local59 < this.anInt400) {
				local65 = this.anIntArray59[local59];
				this.anIntArrayArray11[local65][local5[local65]++] = local59++;
			}
			this.anIntArray59 = null;
		}
		if (this.anIntArray53 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt403; local9++) {
			local15 = this.anIntArray53[local9];
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
		while (local59 < this.anInt403) {
			local65 = this.anIntArray53[local59];
			this.anIntArrayArray10[local65][local5[local65]++] = local59++;
		}
		this.anIntArray53 = null;
	}
}
