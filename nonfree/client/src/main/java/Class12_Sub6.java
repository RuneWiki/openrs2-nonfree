import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class12_Sub6 extends Class12 {

	@OriginalMember(owner = "client!he", name = "n", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!he", name = "w", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!he", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!he", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!he", name = "A", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!he", name = "C", descriptor = "[Lclient!ie;")
	public Class44[] aClass44Array1;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!he", name = "J", descriptor = "[Lclient!ie;")
	public Class44[] aClass44Array2;

	@OriginalMember(owner = "client!he", name = "K", descriptor = "S")
	public short aShort20;

	@OriginalMember(owner = "client!he", name = "L", descriptor = "I")
	public int anInt1893;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!he", name = "P", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!he", name = "R", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!he", name = "S", descriptor = "[I")
	public int[] anIntArray183;

	@OriginalMember(owner = "client!he", name = "U", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!he", name = "W", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!he", name = "X", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "[Lclient!sd;")
	public Class87[] aClass87Array1;

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!he", name = "cb", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!he", name = "db", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!he", name = "fb", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!he", name = "hb", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!he", name = "ib", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!he", name = "jb", descriptor = "S")
	public short aShort25;

	@OriginalMember(owner = "client!he", name = "x", descriptor = "I")
	public int anInt1891 = 0;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "I")
	public int anInt1892 = 0;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "B")
	public byte aByte3 = 0;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	private Class12_Sub6() {
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
	public Class12_Sub6(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1325(arg0);
		} else {
			this.method1338(arg0);
		}
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([Lclient!he;I)V")
	public Class12_Sub6(@OriginalArg(0) Class12_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt1892 = 0;
		this.anInt1891 = 0;
		this.anInt1893 = 0;
		this.aByte3 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class12_Sub6 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt1892 += local44.anInt1892;
				this.anInt1891 += local44.anInt1891;
				this.anInt1893 += local44.anInt1893;
				if (local44.aByteArray19 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local44.aByte3;
					}
					if (this.aByte3 != local44.aByte3) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray17 != null;
				local19 |= local44.aByteArray21 != null;
				local21 |= local44.anIntArray186 != null;
				local23 |= local44.aShortArray55 != null;
				local25 |= local44.aByteArray18 != null;
			}
		}
		this.anIntArray188 = new int[this.anInt1892];
		this.anIntArray177 = new int[this.anInt1892];
		this.anIntArray183 = new int[this.anInt1892];
		this.anIntArray179 = new int[this.anInt1892];
		this.anIntArray185 = new int[this.anInt1891];
		this.anIntArray187 = new int[this.anInt1891];
		this.anIntArray182 = new int[this.anInt1891];
		if (local15) {
			this.aByteArray17 = new byte[this.anInt1891];
		}
		if (local17) {
			this.aByteArray19 = new byte[this.anInt1891];
		}
		if (local19) {
			this.aByteArray21 = new byte[this.anInt1891];
		}
		if (local21) {
			this.anIntArray186 = new int[this.anInt1891];
		}
		if (local23) {
			this.aShortArray55 = new short[this.anInt1891];
		}
		if (local25) {
			this.aByteArray18 = new byte[this.anInt1891];
		}
		this.aShortArray51 = new short[this.anInt1891];
		if (this.anInt1893 > 0) {
			this.aByteArray25 = new byte[this.anInt1893];
			this.aShortArray54 = new short[this.anInt1893];
			this.aShortArray53 = new short[this.anInt1893];
			this.aShortArray50 = new short[this.anInt1893];
			this.aShortArray52 = new short[this.anInt1893];
			this.aShortArray56 = new short[this.anInt1893];
			this.aShortArray49 = new short[this.anInt1893];
			this.aByteArray16 = new byte[this.anInt1893];
			this.aByteArray24 = new byte[this.anInt1893];
			this.aByteArray23 = new byte[this.anInt1893];
			this.aByteArray22 = new byte[this.anInt1893];
			this.aByteArray20 = new byte[this.anInt1893];
		}
		this.anInt1892 = 0;
		this.anInt1891 = 0;
		this.anInt1893 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class12_Sub6 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt1891; local302++) {
					if (local15 && local298.aByteArray17 != null) {
						this.aByteArray17[this.anInt1891] = local298.aByteArray17[local302];
					}
					if (local17) {
						if (local298.aByteArray19 == null) {
							this.aByteArray19[this.anInt1891] = local298.aByte3;
						} else {
							this.aByteArray19[this.anInt1891] = local298.aByteArray19[local302];
						}
					}
					if (local19 && local298.aByteArray21 != null) {
						this.aByteArray21[this.anInt1891] = local298.aByteArray21[local302];
					}
					if (local21 && local298.anIntArray186 != null) {
						this.anIntArray186[this.anInt1891] = local298.anIntArray186[local302];
					}
					if (local23) {
						if (local298.aShortArray55 == null) {
							this.aShortArray55[this.anInt1891] = -1;
						} else {
							this.aShortArray55[this.anInt1891] = local298.aShortArray55[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray18 == null || local298.aByteArray18[local302] == -1) {
							this.aByteArray18[this.anInt1891] = -1;
						} else {
							this.aByteArray18[this.anInt1891] = (byte) (local298.aByteArray18[local302] + this.anInt1893);
						}
					}
					this.aShortArray51[this.anInt1891] = local298.aShortArray51[local302];
					this.anIntArray185[this.anInt1891] = this.method1335(local298, local298.anIntArray185[local302]);
					this.anIntArray187[this.anInt1891] = this.method1335(local298, local298.anIntArray187[local302]);
					this.anIntArray182[this.anInt1891] = this.method1335(local298, local298.anIntArray182[local302]);
					this.anInt1891++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt1893; local477++) {
					@Pc(489) byte local489 = this.aByteArray25[this.anInt1893] = local298.aByteArray25[local477];
					if (local489 == 0) {
						this.aShortArray54[this.anInt1893] = (short) this.method1335(local298, local298.aShortArray54[local477]);
						this.aShortArray53[this.anInt1893] = (short) this.method1335(local298, local298.aShortArray53[local477]);
						this.aShortArray50[this.anInt1893] = (short) this.method1335(local298, local298.aShortArray50[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray54[this.anInt1893] = local298.aShortArray54[local477];
						this.aShortArray53[this.anInt1893] = local298.aShortArray53[local477];
						this.aShortArray50[this.anInt1893] = local298.aShortArray50[local477];
						this.aShortArray52[this.anInt1893] = local298.aShortArray52[local477];
						this.aShortArray56[this.anInt1893] = local298.aShortArray56[local477];
						this.aShortArray49[this.anInt1893] = local298.aShortArray49[local477];
						this.aByteArray16[this.anInt1893] = local298.aByteArray16[local477];
						this.aByteArray24[this.anInt1893] = local298.aByteArray24[local477];
						this.aByteArray23[this.anInt1893] = local298.aByteArray23[local477];
					}
					if (local489 == 2) {
						this.aByteArray22[this.anInt1893] = local298.aByteArray22[local477];
						this.aByteArray20[this.anInt1893] = local298.aByteArray20[local477];
					}
					this.anInt1893++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!he;ZZZZ)V")
	public Class12_Sub6(@OriginalArg(0) Class12_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1892 = arg0.anInt1892;
		this.anInt1891 = arg0.anInt1891;
		this.anInt1893 = arg0.anInt1893;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray188 = arg0.anIntArray188;
			this.anIntArray177 = arg0.anIntArray177;
			this.anIntArray183 = arg0.anIntArray183;
		} else {
			this.anIntArray188 = new int[this.anInt1892];
			this.anIntArray177 = new int[this.anInt1892];
			this.anIntArray183 = new int[this.anInt1892];
			for (local57 = 0; local57 < this.anInt1892; local57++) {
				this.anIntArray188[local57] = arg0.anIntArray188[local57];
				this.anIntArray177[local57] = arg0.anIntArray177[local57];
				this.anIntArray183[local57] = arg0.anIntArray183[local57];
			}
		}
		if (arg2) {
			this.aShortArray51 = arg0.aShortArray51;
		} else {
			this.aShortArray51 = new short[this.anInt1891];
			for (local57 = 0; local57 < this.anInt1891; local57++) {
				this.aShortArray51[local57] = arg0.aShortArray51[local57];
			}
		}
		if (arg3 || arg0.aShortArray55 == null) {
			this.aShortArray55 = arg0.aShortArray55;
		} else {
			this.aShortArray55 = new short[this.anInt1891];
			for (local57 = 0; local57 < this.anInt1891; local57++) {
				this.aShortArray55[local57] = arg0.aShortArray55[local57];
			}
		}
		this.aByteArray21 = arg0.aByteArray21;
		this.anIntArray185 = arg0.anIntArray185;
		this.anIntArray187 = arg0.anIntArray187;
		this.anIntArray182 = arg0.anIntArray182;
		this.aByteArray17 = arg0.aByteArray17;
		this.aByteArray19 = arg0.aByteArray19;
		this.aByteArray18 = arg0.aByteArray18;
		this.aByte3 = arg0.aByte3;
		this.aByteArray25 = arg0.aByteArray25;
		this.aShortArray54 = arg0.aShortArray54;
		this.aShortArray53 = arg0.aShortArray53;
		this.aShortArray50 = arg0.aShortArray50;
		this.aShortArray52 = arg0.aShortArray52;
		this.aShortArray56 = arg0.aShortArray56;
		this.aShortArray49 = arg0.aShortArray49;
		this.aByteArray16 = arg0.aByteArray16;
		this.aByteArray24 = arg0.aByteArray24;
		this.aByteArray23 = arg0.aByteArray23;
		this.aByteArray22 = arg0.aByteArray22;
		this.aByteArray20 = arg0.aByteArray20;
		this.anIntArray179 = arg0.anIntArray179;
		this.anIntArray186 = arg0.anIntArray186;
		this.anIntArrayArray18 = arg0.anIntArrayArray18;
		this.anIntArrayArray17 = arg0.anIntArrayArray17;
		this.aClass44Array2 = arg0.aClass44Array2;
		this.aClass87Array1 = arg0.aClass87Array1;
		this.aClass44Array1 = arg0.aClass44Array1;
		this.aShort20 = arg0.aShort20;
		this.aShort25 = arg0.aShort25;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()Z")
	@Override
	public boolean method2716() {
		return true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!he;")
	public Class12_Sub6 method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1329();
		@Pc(6) int local6 = arg4 + this.aShort22;
		@Pc(11) int local11 = arg4 + this.aShort24;
		@Pc(16) int local16 = arg6 + this.aShort21;
		@Pc(21) int local21 = arg6 + this.aShort18;
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
		@Pc(147) Class12_Sub6 local147 = new Class12_Sub6();
		local147.anInt1892 = this.anInt1892;
		local147.anInt1891 = this.anInt1891;
		local147.anInt1893 = this.anInt1893;
		local147.anIntArray185 = this.anIntArray185;
		local147.anIntArray187 = this.anIntArray187;
		local147.anIntArray182 = this.anIntArray182;
		local147.aByteArray17 = this.aByteArray17;
		local147.aByteArray19 = this.aByteArray19;
		local147.aByteArray21 = this.aByteArray21;
		local147.aByteArray18 = this.aByteArray18;
		local147.aShortArray51 = this.aShortArray51;
		local147.aShortArray55 = this.aShortArray55;
		local147.aByte3 = this.aByte3;
		local147.aByteArray25 = this.aByteArray25;
		local147.aShortArray54 = this.aShortArray54;
		local147.aShortArray53 = this.aShortArray53;
		local147.aShortArray50 = this.aShortArray50;
		local147.aShortArray52 = this.aShortArray52;
		local147.aShortArray56 = this.aShortArray56;
		local147.aShortArray49 = this.aShortArray49;
		local147.aByteArray16 = this.aByteArray16;
		local147.aByteArray24 = this.aByteArray24;
		local147.aByteArray23 = this.aByteArray23;
		local147.aByteArray22 = this.aByteArray22;
		local147.aByteArray20 = this.aByteArray20;
		local147.anIntArray179 = this.anIntArray179;
		local147.anIntArray186 = this.anIntArray186;
		local147.anIntArrayArray18 = this.anIntArrayArray18;
		local147.anIntArrayArray17 = this.anIntArrayArray17;
		local147.aShort20 = this.aShort20;
		local147.aShort25 = this.aShort25;
		local147.aClass44Array2 = this.aClass44Array2;
		local147.aClass87Array1 = this.aClass87Array1;
		local147.aClass44Array1 = this.aClass44Array1;
		if (arg0 == 3) {
			local147.anIntArray188 = Static25.method3302(this.anIntArray188);
			local147.anIntArray177 = Static25.method3302(this.anIntArray177);
			local147.anIntArray183 = Static25.method3302(this.anIntArray183);
		} else {
			local147.anIntArray188 = this.anIntArray188;
			local147.anIntArray177 = new int[local147.anInt1892];
			local147.anIntArray183 = this.anIntArray183;
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
			for (local326 = 0; local326 < local147.anInt1892; local326++) {
				local334 = this.anIntArray188[local326] + arg4;
				local341 = this.anIntArray183[local326] + arg6;
				local345 = local334 & 0x7F;
				local349 = local341 & 0x7F;
				local353 = local334 >> 7;
				local357 = local341 >> 7;
				local379 = arg2[local353][local357] * (128 - local345) + arg2[local353 + 1][local357] * local345 >> 7;
				local405 = arg2[local353][local357 + 1] * (128 - local345) + arg2[local353 + 1][local357 + 1] * local345 >> 7;
				local417 = local379 * (128 - local349) + local405 * local349 >> 7;
				local147.anIntArray177[local326] = this.anIntArray177[local326] + local417 - arg5;
			}
		} else {
			@Pc(544) int local544;
			if (arg0 == 2) {
				for (local326 = 0; local326 < local147.anInt1892; local326++) {
					local334 = (this.anIntArray177[local326] << 16) / this.aShort23;
					if (local334 < arg1) {
						local341 = this.anIntArray188[local326] + arg4;
						local345 = this.anIntArray183[local326] + arg6;
						local349 = local341 & 0x7F;
						local353 = local345 & 0x7F;
						local357 = local341 >> 7;
						local379 = local345 >> 7;
						local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
						local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
						local544 = local405 * (128 - local353) + local417 * local353 >> 7;
						local147.anIntArray177[local326] = this.anIntArray177[local326] + (local544 - arg5) * (arg1 - local334) / arg1;
					} else {
						local147.anIntArray177[local326] = this.anIntArray177[local326];
					}
				}
			} else if (arg0 == 3) {
				local326 = (arg1 & 0xFF) * 4;
				local334 = (arg1 >> 8 & 0xFF) * 4;
				this.method1330(arg2, arg4, arg5, arg6, local326, local334);
			} else if (arg0 == 4) {
				local326 = this.aShort19 - this.aShort23;
				for (local334 = 0; local334 < this.anInt1892; local334++) {
					local341 = this.anIntArray188[local334] + arg4;
					local345 = this.anIntArray183[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local147.anIntArray177[local334] = this.anIntArray177[local334] + local544 + local326 - arg5;
				}
			} else if (arg0 == 5) {
				local326 = this.aShort19 - this.aShort23;
				for (local334 = 0; local334 < this.anInt1892; local334++) {
					local341 = this.anIntArray188[local334] + arg4;
					local345 = this.anIntArray183[local334] + arg6;
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
					local147.anIntArray177[local334] = ((this.anIntArray177[local334] << 8) / local326 * local891 >> 8) - (arg5 - local544);
				}
			}
		}
		this.aBoolean101 = false;
		return local147;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)Lclient!cg;")
	public Class12_Sub2 method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class12_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IIIII)Lclient!le;")
	public Class12_Sub2_Sub1 method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class12_Sub2_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
	public void method1317() {
		if (this.aClass44Array2 != null) {
			return;
		}
		this.aClass44Array2 = new Class44[this.anInt1892];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1892; local10++) {
			this.aClass44Array2[local10] = new Class44();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1891; local25++) {
			@Pc(31) int local31 = this.anIntArray185[local25];
			@Pc(36) int local36 = this.anIntArray187[local25];
			@Pc(41) int local41 = this.anIntArray182[local25];
			@Pc(51) int local51 = this.anIntArray188[local36] - this.anIntArray188[local31];
			@Pc(61) int local61 = this.anIntArray177[local36] - this.anIntArray177[local31];
			@Pc(71) int local71 = this.anIntArray183[local36] - this.anIntArray183[local31];
			@Pc(81) int local81 = this.anIntArray188[local41] - this.anIntArray188[local31];
			@Pc(91) int local91 = this.anIntArray177[local41] - this.anIntArray177[local31];
			@Pc(101) int local101 = this.anIntArray183[local41] - this.anIntArray183[local31];
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
			if (this.aByteArray17 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray17[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class44 local211 = this.aClass44Array2[local31];
				local211.anInt2074 += local109;
				local211.anInt2071 += local117;
				local211.anInt2072 += local125;
				local211.anInt2073++;
				@Pc(240) Class44 local240 = this.aClass44Array2[local36];
				local240.anInt2074 += local109;
				local240.anInt2071 += local117;
				local240.anInt2072 += local125;
				local240.anInt2073++;
				@Pc(269) Class44 local269 = this.aClass44Array2[local41];
				local269.anInt2074 += local109;
				local269.anInt2071 += local117;
				local269.anInt2072 += local125;
				local269.anInt2073++;
			} else if (local198 == 1) {
				if (this.aClass87Array1 == null) {
					this.aClass87Array1 = new Class87[this.anInt1891];
				}
				@Pc(314) Class87 local314 = this.aClass87Array1[local25] = new Class87();
				local314.anInt4122 = local109;
				local314.anInt4125 = local117;
				local314.anInt4124 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(III)V")
	public void method1318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1892; local1++) {
			this.anIntArray188[local1] += arg0;
			this.anIntArray177[local1] += arg1;
			this.anIntArray183[local1] += arg2;
		}
		this.method1323();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	private void method1319(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static72.anIntArray178[arg0];
		@Pc(7) int local7 = Static72.anIntArray184[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1892; local9++) {
			@Pc(26) int local26 = this.anIntArray177[local9] * local7 - this.anIntArray183[local9] * local3 >> 16;
			this.anIntArray183[local9] = this.anIntArray177[local9] * local3 + this.anIntArray183[local9] * local7 >> 16;
			this.anIntArray177[local9] = local26;
		}
		this.method1323();
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()V")
	public void method1320() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1892; local1++) {
			this.anIntArray183[local1] = -this.anIntArray183[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1891; local18++) {
			@Pc(24) int local24 = this.anIntArray185[local18];
			this.anIntArray185[local18] = this.anIntArray182[local18];
			this.anIntArray182[local18] = local24;
		}
		this.method1323();
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(III)V")
	public void method1321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1892; local1++) {
			this.anIntArray188[local1] = this.anIntArray188[local1] * arg0 / 128;
			this.anIntArray177[local1] = this.anIntArray177[local1] * arg1 / 128;
			this.anIntArray183[local1] = this.anIntArray183[local1] * arg2 / 128;
		}
		this.method1323();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(SS)V")
	public void method1322(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray55 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt1891; local5++) {
			if (this.aShortArray55[local5] == arg0) {
				this.aShortArray55[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "()V")
	private void method1323() {
		this.aClass44Array2 = null;
		this.aClass44Array1 = null;
		this.aClass87Array1 = null;
		this.aBoolean101 = false;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "()V")
	public void method1324() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1892; local1++) {
			@Pc(7) int local7 = this.anIntArray188[local1];
			this.anIntArray188[local1] = this.anIntArray183[local1];
			this.anIntArray183[local1] = -local7;
		}
		this.method1323();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([B)V")
	private void method1325(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub3 local4 = new Class2_Sub3(arg0);
		@Pc(9) Class2_Sub3 local9 = new Class2_Sub3(arg0);
		@Pc(14) Class2_Sub3 local14 = new Class2_Sub3(arg0);
		@Pc(19) Class2_Sub3 local19 = new Class2_Sub3(arg0);
		@Pc(24) Class2_Sub3 local24 = new Class2_Sub3(arg0);
		@Pc(29) Class2_Sub3 local29 = new Class2_Sub3(arg0);
		@Pc(34) Class2_Sub3 local34 = new Class2_Sub3(arg0);
		local4.anInt239 = arg0.length - 23;
		@Pc(44) int local44 = local4.method163();
		@Pc(48) int local48 = local4.method163();
		@Pc(52) int local52 = local4.method209();
		@Pc(56) int local56 = local4.method209();
		@Pc(60) int local60 = local4.method209();
		@Pc(64) int local64 = local4.method209();
		@Pc(68) int local68 = local4.method209();
		@Pc(72) int local72 = local4.method209();
		@Pc(76) int local76 = local4.method209();
		@Pc(80) int local80 = local4.method163();
		@Pc(84) int local84 = local4.method163();
		@Pc(88) int local88 = local4.method163();
		@Pc(92) int local92 = local4.method163();
		@Pc(96) int local96 = local4.method163();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray25 = new byte[local52];
			local4.anInt239 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray25[local113] = local4.method186();
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
		this.anInt1892 = local44;
		this.anInt1891 = local48;
		this.anInt1893 = local52;
		this.anIntArray188 = new int[local44];
		this.anIntArray177 = new int[local44];
		this.anIntArray183 = new int[local44];
		this.anIntArray185 = new int[local48];
		this.anIntArray187 = new int[local48];
		this.anIntArray182 = new int[local48];
		if (local76 == 1) {
			this.anIntArray179 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray17 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray19 = new byte[local48];
		} else {
			this.aByte3 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray21 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray186 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray55 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray18 = new byte[local48];
		}
		this.aShortArray51 = new short[local48];
		if (local52 > 0) {
			this.aShortArray54 = new short[local52];
			this.aShortArray53 = new short[local52];
			this.aShortArray50 = new short[local52];
			if (local100 > 0) {
				this.aShortArray52 = new short[local100];
				this.aShortArray56 = new short[local100];
				this.aShortArray49 = new short[local100];
				this.aByteArray16 = new byte[local100];
				this.aByteArray24 = new byte[local100];
				this.aByteArray23 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray22 = new byte[local102];
				this.aByteArray20 = new byte[local102];
			}
		}
		local4.anInt239 = local52;
		local9.anInt239 = local233;
		local14.anInt239 = local239;
		local19.anInt239 = local245;
		local24.anInt239 = local184;
		@Pc(455) int local455 = 0;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(466) int local466;
		@Pc(468) int local468;
		@Pc(478) int local478;
		@Pc(488) int local488;
		for (@Pc(461) int local461 = 0; local461 < local44; local461++) {
			local466 = local4.method209();
			local468 = 0;
			if ((local466 & 0x1) != 0) {
				local468 = local9.method204();
			}
			local478 = 0;
			if ((local466 & 0x2) != 0) {
				local478 = local14.method204();
			}
			local488 = 0;
			if ((local466 & 0x4) != 0) {
				local488 = local19.method204();
			}
			this.anIntArray188[local461] = local455 + local468;
			this.anIntArray177[local461] = local457 + local478;
			this.anIntArray183[local461] = local459 + local488;
			local455 = this.anIntArray188[local461];
			local457 = this.anIntArray177[local461];
			local459 = this.anIntArray183[local461];
			if (local76 == 1) {
				this.anIntArray179[local461] = local24.method209();
			}
		}
		local4.anInt239 = local225;
		local9.anInt239 = local151;
		local14.anInt239 = local166;
		local19.anInt239 = local193;
		local24.anInt239 = local175;
		local29.anInt239 = local208;
		local34.anInt239 = local219;
		for (local466 = 0; local466 < local48; local466++) {
			this.aShortArray51[local466] = (short) local4.method163();
			if (local56 == 1) {
				this.aByteArray17[local466] = local9.method186();
			}
			if (local60 == 255) {
				this.aByteArray19[local466] = local14.method186();
			}
			if (local64 == 1) {
				this.aByteArray21[local466] = local19.method186();
			}
			if (local68 == 1) {
				this.anIntArray186[local466] = local24.method209();
			}
			if (local72 == 1) {
				this.aShortArray55[local466] = (short) (local29.method163() - 1);
			}
			if (this.aByteArray18 != null) {
				if (this.aShortArray55[local466] == -1) {
					this.aByteArray18[local466] = -1;
				} else {
					this.aByteArray18[local466] = (byte) (local34.method209() - 1);
				}
			}
		}
		local4.anInt239 = local202;
		local9.anInt239 = local160;
		local468 = 0;
		local478 = 0;
		local488 = 0;
		@Pc(674) int local674 = 0;
		@Pc(681) int local681;
		@Pc(784) int local784;
		for (@Pc(676) int local676 = 0; local676 < local48; local676++) {
			local681 = local9.method209();
			if (local681 == 1) {
				local468 = local4.method204() + local674;
				local478 = local4.method204() + local468;
				local488 = local4.method204() + local478;
				local674 = local488;
				this.anIntArray185[local676] = local468;
				this.anIntArray187[local676] = local478;
				this.anIntArray182[local676] = local488;
			}
			if (local681 == 2) {
				local478 = local488;
				local488 = local4.method204() + local674;
				local674 = local488;
				this.anIntArray185[local676] = local468;
				this.anIntArray187[local676] = local478;
				this.anIntArray182[local676] = local488;
			}
			if (local681 == 3) {
				local468 = local488;
				local488 = local4.method204() + local674;
				local674 = local488;
				this.anIntArray185[local676] = local468;
				this.anIntArray187[local676] = local478;
				this.anIntArray182[local676] = local488;
			}
			if (local681 == 4) {
				local784 = local468;
				local468 = local478;
				local478 = local784;
				local488 = local4.method204() + local674;
				local674 = local488;
				this.anIntArray185[local676] = local468;
				this.anIntArray187[local676] = local784;
				this.anIntArray182[local676] = local488;
			}
		}
		local4.anInt239 = local251;
		local9.anInt239 = local259;
		local14.anInt239 = local267;
		local19.anInt239 = local275;
		local24.anInt239 = local281;
		local29.anInt239 = local113;
		for (local681 = 0; local681 < local52; local681++) {
			local784 = this.aByteArray25[local681] & 0xFF;
			if (local784 == 0) {
				this.aShortArray54[local681] = (short) local4.method163();
				this.aShortArray53[local681] = (short) local4.method163();
				this.aShortArray50[local681] = (short) local4.method163();
			}
			if (local784 == 1) {
				this.aShortArray54[local681] = (short) local9.method163();
				this.aShortArray53[local681] = (short) local9.method163();
				this.aShortArray50[local681] = (short) local9.method163();
				this.aShortArray52[local681] = (short) local14.method163();
				this.aShortArray56[local681] = (short) local14.method163();
				this.aShortArray49[local681] = (short) local14.method163();
				this.aByteArray16[local681] = local19.method186();
				this.aByteArray24[local681] = local24.method186();
				this.aByteArray23[local681] = local29.method186();
			}
			if (local784 == 2) {
				this.aShortArray54[local681] = (short) local9.method163();
				this.aShortArray53[local681] = (short) local9.method163();
				this.aShortArray50[local681] = (short) local9.method163();
				this.aShortArray52[local681] = (short) local14.method163();
				this.aShortArray56[local681] = (short) local14.method163();
				this.aShortArray49[local681] = (short) local14.method163();
				this.aByteArray16[local681] = local19.method186();
				this.aByteArray24[local681] = local24.method186();
				this.aByteArray23[local681] = local29.method186();
				this.aByteArray22[local681] = local29.method186();
				this.aByteArray20[local681] = local29.method186();
			}
			if (local784 == 3) {
				this.aShortArray54[local681] = (short) local9.method163();
				this.aShortArray53[local681] = (short) local9.method163();
				this.aShortArray50[local681] = (short) local9.method163();
				this.aShortArray52[local681] = (short) local14.method163();
				this.aShortArray56[local681] = (short) local14.method163();
				this.aShortArray49[local681] = (short) local14.method163();
				this.aByteArray16[local681] = local19.method186();
				this.aByteArray24[local681] = local24.method186();
				this.aByteArray23[local681] = local29.method186();
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "()Lclient!he;")
	public Class12_Sub6 method1327() {
		@Pc(3) Class12_Sub6 local3 = new Class12_Sub6();
		if (this.aByteArray17 != null) {
			local3.aByteArray17 = new byte[this.anInt1891];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1891; local13++) {
				local3.aByteArray17[local13] = this.aByteArray17[local13];
			}
		}
		local3.anInt1892 = this.anInt1892;
		local3.anInt1891 = this.anInt1891;
		local3.anInt1893 = this.anInt1893;
		local3.anIntArray188 = this.anIntArray188;
		local3.anIntArray177 = this.anIntArray177;
		local3.anIntArray183 = this.anIntArray183;
		local3.anIntArray185 = this.anIntArray185;
		local3.anIntArray187 = this.anIntArray187;
		local3.anIntArray182 = this.anIntArray182;
		local3.aByteArray19 = this.aByteArray19;
		local3.aByteArray21 = this.aByteArray21;
		local3.aByteArray18 = this.aByteArray18;
		local3.aShortArray51 = this.aShortArray51;
		local3.aShortArray55 = this.aShortArray55;
		local3.aByte3 = this.aByte3;
		local3.aByteArray25 = this.aByteArray25;
		local3.aShortArray54 = this.aShortArray54;
		local3.aShortArray53 = this.aShortArray53;
		local3.aShortArray50 = this.aShortArray50;
		local3.aShortArray52 = this.aShortArray52;
		local3.aShortArray56 = this.aShortArray56;
		local3.aShortArray49 = this.aShortArray49;
		local3.aByteArray16 = this.aByteArray16;
		local3.aByteArray24 = this.aByteArray24;
		local3.aByteArray23 = this.aByteArray23;
		local3.aByteArray22 = this.aByteArray22;
		local3.aByteArray20 = this.aByteArray20;
		local3.anIntArray179 = this.anIntArray179;
		local3.anIntArray186 = this.anIntArray186;
		local3.anIntArrayArray18 = this.anIntArrayArray18;
		local3.anIntArrayArray17 = this.anIntArrayArray17;
		local3.aClass44Array2 = this.aClass44Array2;
		local3.aClass87Array1 = this.aClass87Array1;
		local3.aShort20 = this.aShort20;
		local3.aShort25 = this.aShort25;
		return local3;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Lclient!nc;")
	@Override
	public Class12 method2713() {
		return this.method1315(this.aShort20, this.aShort25, -50, -10, -50);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()I")
	@Override
	public int method2718() {
		if (!this.aBoolean101) {
			this.method1329();
		}
		return this.aShort23;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	private void method1328(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static72.anIntArray178[arg0];
		@Pc(7) int local7 = Static72.anIntArray184[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1892; local9++) {
			@Pc(26) int local26 = this.anIntArray177[local9] * local3 + this.anIntArray188[local9] * local7 >> 16;
			this.anIntArray177[local9] = this.anIntArray177[local9] * local7 - this.anIntArray188[local9] * local3 >> 16;
			this.anIntArray188[local9] = local26;
		}
		this.method1323();
	}

	@OriginalMember(owner = "client!he", name = "i", descriptor = "()V")
	private void method1329() {
		if (this.aBoolean101) {
			return;
		}
		this.aBoolean101 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1892; local20++) {
			@Pc(26) int local26 = this.anIntArray188[local20];
			@Pc(31) int local31 = this.anIntArray177[local20];
			@Pc(36) int local36 = this.anIntArray183[local20];
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
		this.aShort22 = (short) local8;
		this.aShort24 = (short) local14;
		this.aShort23 = (short) local10;
		this.aShort19 = (short) local16;
		this.aShort21 = (short) local12;
		this.aShort18 = (short) local18;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([[IIIIII)V")
	private void method1330(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static72.method1313(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static72.method1313(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static72.method1313(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static72.method1313(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method1319(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method1328(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method1318(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!he", name = "j", descriptor = "()V")
	public void method1331() {
		this.anIntArray179 = null;
		this.anIntArray186 = null;
		this.anIntArrayArray18 = null;
		this.anIntArrayArray17 = null;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(SS)V")
	public void method1332(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1891; local1++) {
			if (this.aShortArray51[local1] == arg0) {
				this.aShortArray51[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(III)V")
	public void method1333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(28) int local28;
		if (arg2 != 0) {
			local5 = Static72.anIntArray178[arg2];
			local9 = Static72.anIntArray184[arg2];
			for (local11 = 0; local11 < this.anInt1892; local11++) {
				local28 = this.anIntArray177[local11] * local5 + this.anIntArray188[local11] * local9 >> 16;
				this.anIntArray177[local11] = this.anIntArray177[local11] * local9 - this.anIntArray188[local11] * local5 >> 16;
				this.anIntArray188[local11] = local28;
			}
		}
		if (arg0 != 0) {
			local5 = Static72.anIntArray178[arg0];
			local9 = Static72.anIntArray184[arg0];
			for (local11 = 0; local11 < this.anInt1892; local11++) {
				local28 = this.anIntArray177[local11] * local9 - this.anIntArray183[local11] * local5 >> 16;
				this.anIntArray183[local11] = this.anIntArray177[local11] * local5 + this.anIntArray183[local11] * local9 >> 16;
				this.anIntArray177[local11] = local28;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static72.anIntArray178[arg1];
		local9 = Static72.anIntArray184[arg1];
		for (local11 = 0; local11 < this.anInt1892; local11++) {
			local28 = this.anIntArray183[local11] * local5 + this.anIntArray188[local11] * local9 >> 16;
			this.anIntArray183[local11] = this.anIntArray183[local11] * local9 - this.anIntArray188[local11] * local5 >> 16;
			this.anIntArray188[local11] = local28;
		}
	}

	@OriginalMember(owner = "client!he", name = "k", descriptor = "()V")
	public void method1334() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1892; local1++) {
			@Pc(7) int local7 = this.anIntArray183[local1];
			this.anIntArray183[local1] = this.anIntArray188[local1];
			this.anIntArray188[local1] = -local7;
		}
		this.method1323();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!he;I)I")
	private int method1335(@OriginalArg(0) Class12_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray188[arg1];
		@Pc(11) int local11 = arg0.anIntArray177[arg1];
		@Pc(16) int local16 = arg0.anIntArray183[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1892; local18++) {
			if (local6 == this.anIntArray188[local18] && local11 == this.anIntArray177[local18] && local16 == this.anIntArray183[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray188[this.anInt1892] = local6;
			this.anIntArray177[this.anInt1892] = local11;
			this.anIntArray183[this.anInt1892] = local16;
			if (arg0.anIntArray179 != null) {
				this.anIntArray179[this.anInt1892] = arg0.anIntArray179[arg1];
			}
			local1 = this.anInt1892++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!he", name = "l", descriptor = "()V")
	public void method1337() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray179 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1892; local9++) {
				local15 = this.anIntArray179[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray18 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray18[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1892) {
				local65 = this.anIntArray179[local59];
				this.anIntArrayArray18[local65][local5[local65]++] = local59++;
			}
			this.anIntArray179 = null;
		}
		if (this.anIntArray186 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1891; local9++) {
			local15 = this.anIntArray186[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray17 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray17[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1891) {
			local65 = this.anIntArray186[local59];
			this.anIntArrayArray17[local65][local5[local65]++] = local59++;
		}
		this.anIntArray186 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!nc;IIIZ)V")
	@Override
	public void method2714(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class12_Sub6 local2 = (Class12_Sub6) arg0;
		local2.method1329();
		local2.method1317();
		Static72.anInt1894++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray188;
		@Pc(18) int local18 = local2.anInt1892;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1892; local20++) {
			@Pc(26) Class44 local26 = this.aClass44Array2[local20];
			if (local26.anInt2073 != 0) {
				local36 = this.anIntArray177[local20] - arg2;
				if (local36 >= local2.aShort23 && local36 <= local2.aShort19) {
					@Pc(52) int local52 = this.anIntArray188[local20] - arg1;
					if (local52 >= local2.aShort22 && local52 <= local2.aShort24) {
						@Pc(68) int local68 = this.anIntArray183[local20] - arg3;
						if (local68 >= local2.aShort21 && local68 <= local2.aShort18) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class44 local85 = local2.aClass44Array2[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray183[local79] && local36 == local2.anIntArray177[local79] && local85.anInt2073 != 0) {
									if (this.aClass44Array1 == null) {
										this.aClass44Array1 = new Class44[this.anInt1892];
									}
									if (local2.aClass44Array1 == null) {
										local2.aClass44Array1 = new Class44[local18];
									}
									@Pc(125) Class44 local125 = this.aClass44Array1[local20];
									if (local125 == null) {
										local125 = this.aClass44Array1[local20] = new Class44(local26);
									}
									@Pc(142) Class44 local142 = local2.aClass44Array1[local79];
									if (local142 == null) {
										local142 = local2.aClass44Array1[local79] = new Class44(local85);
									}
									local125.anInt2074 += local85.anInt2074;
									local125.anInt2071 += local85.anInt2071;
									local125.anInt2072 += local85.anInt2072;
									local125.anInt2073 += local85.anInt2073;
									local142.anInt2074 += local26.anInt2074;
									local142.anInt2071 += local26.anInt2071;
									local142.anInt2072 += local26.anInt2072;
									local142.anInt2073 += local26.anInt2073;
									local12++;
									Static72.anIntArray180[local20] = Static72.anInt1894;
									Static72.anIntArray181[local79] = Static72.anInt1894;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt1891; local236++) {
			if (Static72.anIntArray180[this.anIntArray185[local236]] == Static72.anInt1894 && Static72.anIntArray180[this.anIntArray187[local236]] == Static72.anInt1894 && Static72.anIntArray180[this.anIntArray182[local236]] == Static72.anInt1894) {
				if (this.aByteArray17 == null) {
					this.aByteArray17 = new byte[this.anInt1891];
				}
				this.aByteArray17[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt1891; local36++) {
			if (Static72.anIntArray181[local2.anIntArray185[local36]] == Static72.anInt1894 && Static72.anIntArray181[local2.anIntArray187[local36]] == Static72.anInt1894 && Static72.anIntArray181[local2.anIntArray182[local36]] == Static72.anInt1894) {
				if (local2.aByteArray17 == null) {
					local2.aByteArray17 = new byte[local2.anInt1891];
				}
				local2.aByteArray17[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "([B)V")
	private void method1338(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub3 local8 = new Class2_Sub3(arg0);
		@Pc(13) Class2_Sub3 local13 = new Class2_Sub3(arg0);
		@Pc(18) Class2_Sub3 local18 = new Class2_Sub3(arg0);
		@Pc(23) Class2_Sub3 local23 = new Class2_Sub3(arg0);
		@Pc(28) Class2_Sub3 local28 = new Class2_Sub3(arg0);
		local8.anInt239 = arg0.length - 18;
		@Pc(38) int local38 = local8.method163();
		@Pc(42) int local42 = local8.method163();
		@Pc(46) int local46 = local8.method209();
		@Pc(50) int local50 = local8.method209();
		@Pc(54) int local54 = local8.method209();
		@Pc(58) int local58 = local8.method209();
		@Pc(62) int local62 = local8.method209();
		@Pc(66) int local66 = local8.method209();
		@Pc(70) int local70 = local8.method163();
		@Pc(74) int local74 = local8.method163();
		@Pc(78) int local78 = local8.method163();
		@Pc(82) int local82 = local8.method163();
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
		this.anInt1892 = local38;
		this.anInt1891 = local42;
		this.anInt1893 = local46;
		this.anIntArray188 = new int[local38];
		this.anIntArray177 = new int[local38];
		this.anIntArray183 = new int[local38];
		this.anIntArray185 = new int[local42];
		this.anIntArray187 = new int[local42];
		this.anIntArray182 = new int[local42];
		if (local46 > 0) {
			this.aByteArray25 = new byte[local46];
			this.aShortArray54 = new short[local46];
			this.aShortArray53 = new short[local46];
			this.aShortArray50 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray179 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray17 = new byte[local42];
			this.aByteArray18 = new byte[local42];
			this.aShortArray55 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray19 = new byte[local42];
		} else {
			this.aByte3 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray21 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray186 = new int[local42];
		}
		this.aShortArray51 = new short[local42];
		local8.anInt239 = 0;
		local13.anInt239 = local165;
		local18.anInt239 = local171;
		local23.anInt239 = local90;
		local28.anInt239 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method209();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method204();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method204();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method204();
			}
			this.anIntArray188[local307] = local301 + local314;
			this.anIntArray177[local307] = local303 + local324;
			this.anIntArray183[local307] = local305 + local334;
			local301 = this.anIntArray188[local307];
			local303 = this.anIntArray177[local307];
			local305 = this.anIntArray183[local307];
			if (local66 == 1) {
				this.anIntArray179[local307] = local28.method209();
			}
		}
		local8.anInt239 = local149;
		local13.anInt239 = local116;
		local18.anInt239 = local98;
		local23.anInt239 = local134;
		local28.anInt239 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray51[local312] = (short) local8.method163();
			if (local50 == 1) {
				local314 = local13.method209();
				if ((local314 & 0x1) == 1) {
					this.aByteArray17[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray17[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray18[local312] = (byte) (local314 >> 2);
					this.aShortArray55[local312] = this.aShortArray51[local312];
					this.aShortArray51[local312] = 127;
					if (this.aShortArray55[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray18[local312] = -1;
					this.aShortArray55[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray19[local312] = local18.method186();
			}
			if (local58 == 1) {
				this.aByteArray21[local312] = local23.method186();
			}
			if (local62 == 1) {
				this.anIntArray186[local312] = local28.method209();
			}
		}
		local8.anInt239 = local143;
		local13.anInt239 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method209();
			if (local543 == 1) {
				local314 = local8.method204() + local536;
				local324 = local8.method204() + local314;
				local334 = local8.method204() + local324;
				local536 = local334;
				this.anIntArray185[local538] = local314;
				this.anIntArray187[local538] = local324;
				this.anIntArray182[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method204() + local536;
				local536 = local334;
				this.anIntArray185[local538] = local314;
				this.anIntArray187[local538] = local324;
				this.anIntArray182[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method204() + local536;
				local536 = local334;
				this.anIntArray185[local538] = local314;
				this.anIntArray187[local538] = local324;
				this.anIntArray182[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method204() + local536;
				local536 = local334;
				this.anIntArray185[local538] = local314;
				this.anIntArray187[local538] = local646;
				this.anIntArray182[local538] = local334;
			}
		}
		local8.anInt239 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray25[local543] = 0;
			this.aShortArray54[local543] = (short) local8.method163();
			this.aShortArray53[local543] = (short) local8.method163();
			this.aShortArray50[local543] = (short) local8.method163();
		}
		if (this.aByteArray18 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray18[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray54[local731] & 0xFFFF) == this.anIntArray185[local723] && (this.aShortArray53[local731] & 0xFFFF) == this.anIntArray187[local723] && (this.aShortArray50[local731] & 0xFFFF) == this.anIntArray182[local723]) {
						this.aByteArray18[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray18 = null;
			}
		}
		if (!local3) {
			this.aShortArray55 = null;
		}
		if (!local1) {
			this.aByteArray17 = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "m", descriptor = "()V")
	public void method1339() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1892; local1++) {
			this.anIntArray188[local1] = -this.anIntArray188[local1];
			this.anIntArray183[local1] = -this.anIntArray183[local1];
		}
		this.method1323();
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	public void method1340() {
		@Pc(3) int local3 = Static72.anIntArray178[256];
		@Pc(7) int local7 = Static72.anIntArray184[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1892; local9++) {
			@Pc(26) int local26 = this.anIntArray183[local9] * local3 + this.anIntArray188[local9] * local7 >> 16;
			this.anIntArray183[local9] = this.anIntArray183[local9] * local7 - this.anIntArray188[local9] * local3 >> 16;
			this.anIntArray188[local9] = local26;
		}
		this.method1323();
	}
}
