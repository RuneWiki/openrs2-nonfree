import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
	public int anInt2368;

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "[I")
	public int[] anIntArray262;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "[I")
	public int[] anIntArray263;

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!lg", name = "B", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!lg", name = "C", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!lg", name = "J", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!lg", name = "L", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "[Lclient!te;")
	public Class94[] aClass94Array1;

	@OriginalMember(owner = "client!lg", name = "O", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!lg", name = "P", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!lg", name = "Q", descriptor = "[I")
	public int[] anIntArray265;

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "[[I")
	public int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!lg", name = "U", descriptor = "[Lclient!te;")
	public Class94[] aClass94Array2;

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "[Lclient!ij;")
	public Class44[] aClass44Array1;

	@OriginalMember(owner = "client!lg", name = "W", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!lg", name = "X", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!lg", name = "Y", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!lg", name = "Z", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!lg", name = "ab", descriptor = "S")
	public short aShort34;

	@OriginalMember(owner = "client!lg", name = "bb", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!lg", name = "cb", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!lg", name = "db", descriptor = "[[I")
	public int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!lg", name = "eb", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!lg", name = "fb", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!lg", name = "gb", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!lg", name = "hb", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!lg", name = "ib", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
	public int anInt2369 = 0;

	@OriginalMember(owner = "client!lg", name = "lb", descriptor = "I")
	public int anInt2371 = 0;

	@OriginalMember(owner = "client!lg", name = "mb", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	private Class1_Sub5() {
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub5(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1795(arg0);
		} else {
			this.method1821(arg0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([Lclient!lg;I)V")
	public Class1_Sub5(@OriginalArg(0) Class1_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2371 = 0;
		this.anInt2369 = 0;
		this.anInt2368 = 0;
		this.aByte4 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class1_Sub5 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2371 += local44.anInt2371;
				this.anInt2369 += local44.anInt2369;
				this.anInt2368 += local44.anInt2368;
				if (local44.aByteArray40 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local44.aByte4;
					}
					if (this.aByte4 != local44.aByte4) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray37 != null;
				local19 |= local44.aByteArray33 != null;
				local21 |= local44.anIntArray268 != null;
				local23 |= local44.aShortArray37 != null;
				local25 |= local44.aByteArray36 != null;
			}
		}
		this.anIntArray267 = new int[this.anInt2371];
		this.anIntArray265 = new int[this.anInt2371];
		this.anIntArray269 = new int[this.anInt2371];
		this.anIntArray270 = new int[this.anInt2371];
		this.anIntArray263 = new int[this.anInt2369];
		this.anIntArray266 = new int[this.anInt2369];
		this.anIntArray262 = new int[this.anInt2369];
		if (local15) {
			this.aByteArray37 = new byte[this.anInt2369];
		}
		if (local17) {
			this.aByteArray40 = new byte[this.anInt2369];
		}
		if (local19) {
			this.aByteArray33 = new byte[this.anInt2369];
		}
		if (local21) {
			this.anIntArray268 = new int[this.anInt2369];
		}
		if (local23) {
			this.aShortArray37 = new short[this.anInt2369];
		}
		if (local25) {
			this.aByteArray36 = new byte[this.anInt2369];
		}
		this.aShortArray32 = new short[this.anInt2369];
		if (this.anInt2368 > 0) {
			this.aByteArray39 = new byte[this.anInt2368];
			this.aShortArray31 = new short[this.anInt2368];
			this.aShortArray34 = new short[this.anInt2368];
			this.aShortArray36 = new short[this.anInt2368];
			this.aShortArray33 = new short[this.anInt2368];
			this.aShortArray30 = new short[this.anInt2368];
			this.aShortArray35 = new short[this.anInt2368];
			this.aByteArray35 = new byte[this.anInt2368];
			this.aByteArray31 = new byte[this.anInt2368];
			this.aByteArray34 = new byte[this.anInt2368];
			this.aByteArray32 = new byte[this.anInt2368];
			this.aByteArray38 = new byte[this.anInt2368];
		}
		this.anInt2371 = 0;
		this.anInt2369 = 0;
		this.anInt2368 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class1_Sub5 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt2369; local302++) {
					if (local15 && local298.aByteArray37 != null) {
						this.aByteArray37[this.anInt2369] = local298.aByteArray37[local302];
					}
					if (local17) {
						if (local298.aByteArray40 == null) {
							this.aByteArray40[this.anInt2369] = local298.aByte4;
						} else {
							this.aByteArray40[this.anInt2369] = local298.aByteArray40[local302];
						}
					}
					if (local19 && local298.aByteArray33 != null) {
						this.aByteArray33[this.anInt2369] = local298.aByteArray33[local302];
					}
					if (local21 && local298.anIntArray268 != null) {
						this.anIntArray268[this.anInt2369] = local298.anIntArray268[local302];
					}
					if (local23) {
						if (local298.aShortArray37 == null) {
							this.aShortArray37[this.anInt2369] = -1;
						} else {
							this.aShortArray37[this.anInt2369] = local298.aShortArray37[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray36 == null || local298.aByteArray36[local302] == -1) {
							this.aByteArray36[this.anInt2369] = -1;
						} else {
							this.aByteArray36[this.anInt2369] = (byte) (local298.aByteArray36[local302] + this.anInt2368);
						}
					}
					this.aShortArray32[this.anInt2369] = local298.aShortArray32[local302];
					this.anIntArray263[this.anInt2369] = this.method1816(local298, local298.anIntArray263[local302]);
					this.anIntArray266[this.anInt2369] = this.method1816(local298, local298.anIntArray266[local302]);
					this.anIntArray262[this.anInt2369] = this.method1816(local298, local298.anIntArray262[local302]);
					this.anInt2369++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt2368; local477++) {
					@Pc(489) byte local489 = this.aByteArray39[this.anInt2368] = local298.aByteArray39[local477];
					if (local489 == 0) {
						this.aShortArray31[this.anInt2368] = (short) this.method1816(local298, local298.aShortArray31[local477]);
						this.aShortArray34[this.anInt2368] = (short) this.method1816(local298, local298.aShortArray34[local477]);
						this.aShortArray36[this.anInt2368] = (short) this.method1816(local298, local298.aShortArray36[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray31[this.anInt2368] = local298.aShortArray31[local477];
						this.aShortArray34[this.anInt2368] = local298.aShortArray34[local477];
						this.aShortArray36[this.anInt2368] = local298.aShortArray36[local477];
						this.aShortArray33[this.anInt2368] = local298.aShortArray33[local477];
						this.aShortArray30[this.anInt2368] = local298.aShortArray30[local477];
						this.aShortArray35[this.anInt2368] = local298.aShortArray35[local477];
						this.aByteArray35[this.anInt2368] = local298.aByteArray35[local477];
						this.aByteArray31[this.anInt2368] = local298.aByteArray31[local477];
						this.aByteArray34[this.anInt2368] = local298.aByteArray34[local477];
					}
					if (local489 == 2) {
						this.aByteArray32[this.anInt2368] = local298.aByteArray32[local477];
						this.aByteArray38[this.anInt2368] = local298.aByteArray38[local477];
					}
					this.anInt2368++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!lg;ZZZZ)V")
	public Class1_Sub5(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2371 = arg0.anInt2371;
		this.anInt2369 = arg0.anInt2369;
		this.anInt2368 = arg0.anInt2368;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray267 = arg0.anIntArray267;
			this.anIntArray265 = arg0.anIntArray265;
			this.anIntArray269 = arg0.anIntArray269;
		} else {
			this.anIntArray267 = new int[this.anInt2371];
			this.anIntArray265 = new int[this.anInt2371];
			this.anIntArray269 = new int[this.anInt2371];
			for (local57 = 0; local57 < this.anInt2371; local57++) {
				this.anIntArray267[local57] = arg0.anIntArray267[local57];
				this.anIntArray265[local57] = arg0.anIntArray265[local57];
				this.anIntArray269[local57] = arg0.anIntArray269[local57];
			}
		}
		if (arg2) {
			this.aShortArray32 = arg0.aShortArray32;
		} else {
			this.aShortArray32 = new short[this.anInt2369];
			for (local57 = 0; local57 < this.anInt2369; local57++) {
				this.aShortArray32[local57] = arg0.aShortArray32[local57];
			}
		}
		if (arg3 || arg0.aShortArray37 == null) {
			this.aShortArray37 = arg0.aShortArray37;
		} else {
			this.aShortArray37 = new short[this.anInt2369];
			for (local57 = 0; local57 < this.anInt2369; local57++) {
				this.aShortArray37[local57] = arg0.aShortArray37[local57];
			}
		}
		this.aByteArray33 = arg0.aByteArray33;
		this.anIntArray263 = arg0.anIntArray263;
		this.anIntArray266 = arg0.anIntArray266;
		this.anIntArray262 = arg0.anIntArray262;
		this.aByteArray37 = arg0.aByteArray37;
		this.aByteArray40 = arg0.aByteArray40;
		this.aByteArray36 = arg0.aByteArray36;
		this.aByte4 = arg0.aByte4;
		this.aByteArray39 = arg0.aByteArray39;
		this.aShortArray31 = arg0.aShortArray31;
		this.aShortArray34 = arg0.aShortArray34;
		this.aShortArray36 = arg0.aShortArray36;
		this.aShortArray33 = arg0.aShortArray33;
		this.aShortArray30 = arg0.aShortArray30;
		this.aShortArray35 = arg0.aShortArray35;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByteArray31 = arg0.aByteArray31;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray32 = arg0.aByteArray32;
		this.aByteArray38 = arg0.aByteArray38;
		this.anIntArray270 = arg0.anIntArray270;
		this.anIntArray268 = arg0.anIntArray268;
		this.anIntArrayArray25 = arg0.anIntArrayArray25;
		this.anIntArrayArray24 = arg0.anIntArrayArray24;
		this.aClass94Array1 = arg0.aClass94Array1;
		this.aClass44Array1 = arg0.aClass44Array1;
		this.aClass94Array2 = arg0.aClass94Array2;
		this.aShort34 = arg0.aShort34;
		this.aShort28 = arg0.aShort28;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!lg;")
	public Class1_Sub5 method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1807();
		@Pc(6) int local6 = arg4 + this.aShort35;
		@Pc(11) int local11 = arg4 + this.aShort29;
		@Pc(16) int local16 = arg6 + this.aShort31;
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
		@Pc(147) Class1_Sub5 local147 = new Class1_Sub5();
		local147.anInt2371 = this.anInt2371;
		local147.anInt2369 = this.anInt2369;
		local147.anInt2368 = this.anInt2368;
		local147.anIntArray263 = this.anIntArray263;
		local147.anIntArray266 = this.anIntArray266;
		local147.anIntArray262 = this.anIntArray262;
		local147.aByteArray37 = this.aByteArray37;
		local147.aByteArray40 = this.aByteArray40;
		local147.aByteArray33 = this.aByteArray33;
		local147.aByteArray36 = this.aByteArray36;
		local147.aShortArray32 = this.aShortArray32;
		local147.aShortArray37 = this.aShortArray37;
		local147.aByte4 = this.aByte4;
		local147.aByteArray39 = this.aByteArray39;
		local147.aShortArray31 = this.aShortArray31;
		local147.aShortArray34 = this.aShortArray34;
		local147.aShortArray36 = this.aShortArray36;
		local147.aShortArray33 = this.aShortArray33;
		local147.aShortArray30 = this.aShortArray30;
		local147.aShortArray35 = this.aShortArray35;
		local147.aByteArray35 = this.aByteArray35;
		local147.aByteArray31 = this.aByteArray31;
		local147.aByteArray34 = this.aByteArray34;
		local147.aByteArray32 = this.aByteArray32;
		local147.aByteArray38 = this.aByteArray38;
		local147.anIntArray270 = this.anIntArray270;
		local147.anIntArray268 = this.anIntArray268;
		local147.anIntArrayArray25 = this.anIntArrayArray25;
		local147.anIntArrayArray24 = this.anIntArrayArray24;
		local147.aShort34 = this.aShort34;
		local147.aShort28 = this.aShort28;
		local147.aClass94Array1 = this.aClass94Array1;
		local147.aClass44Array1 = this.aClass44Array1;
		local147.aClass94Array2 = this.aClass94Array2;
		if (arg0 == 3) {
			local147.anIntArray267 = Static143.method2216(this.anIntArray267);
			local147.anIntArray265 = Static143.method2216(this.anIntArray265);
			local147.anIntArray269 = Static143.method2216(this.anIntArray269);
		} else {
			local147.anIntArray267 = this.anIntArray267;
			local147.anIntArray265 = new int[local147.anInt2371];
			local147.anIntArray269 = this.anIntArray269;
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
			for (local326 = 0; local326 < local147.anInt2371; local326++) {
				local334 = this.anIntArray267[local326] + arg4;
				local341 = this.anIntArray269[local326] + arg6;
				local345 = local334 & 0x7F;
				local349 = local341 & 0x7F;
				local353 = local334 >> 7;
				local357 = local341 >> 7;
				local379 = arg2[local353][local357] * (128 - local345) + arg2[local353 + 1][local357] * local345 >> 7;
				local405 = arg2[local353][local357 + 1] * (128 - local345) + arg2[local353 + 1][local357 + 1] * local345 >> 7;
				local417 = local379 * (128 - local349) + local405 * local349 >> 7;
				local147.anIntArray265[local326] = this.anIntArray265[local326] + local417 - arg5;
			}
		} else {
			@Pc(544) int local544;
			if (arg0 == 2) {
				for (local326 = 0; local326 < local147.anInt2371; local326++) {
					local334 = (this.anIntArray265[local326] << 16) / this.aShort30;
					if (local334 < arg1) {
						local341 = this.anIntArray267[local326] + arg4;
						local345 = this.anIntArray269[local326] + arg6;
						local349 = local341 & 0x7F;
						local353 = local345 & 0x7F;
						local357 = local341 >> 7;
						local379 = local345 >> 7;
						local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
						local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
						local544 = local405 * (128 - local353) + local417 * local353 >> 7;
						local147.anIntArray265[local326] = this.anIntArray265[local326] + (local544 - arg5) * (arg1 - local334) / arg1;
					} else {
						local147.anIntArray265[local326] = this.anIntArray265[local326];
					}
				}
			} else if (arg0 == 3) {
				local326 = (arg1 & 0xFF) * 4;
				local334 = (arg1 >> 8 & 0xFF) * 4;
				this.method1808(arg2, arg4, arg5, arg6, local326, local334);
			} else if (arg0 == 4) {
				local326 = this.aShort32 - this.aShort30;
				for (local334 = 0; local334 < this.anInt2371; local334++) {
					local341 = this.anIntArray267[local334] + arg4;
					local345 = this.anIntArray269[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local147.anIntArray265[local334] = this.anIntArray265[local334] + local544 + local326 - arg5;
				}
			} else if (arg0 == 5) {
				local326 = this.aShort32 - this.aShort30;
				for (local334 = 0; local334 < this.anInt2371; local334++) {
					local341 = this.anIntArray267[local334] + arg4;
					local345 = this.anIntArray269[local334] + arg6;
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
					local147.anIntArray265[local334] = ((this.anIntArray265[local334] << 8) / local326 * local891 >> 8) - (arg5 - local544);
				}
			}
		}
		this.aBoolean100 = false;
		return local147;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "()I")
	@Override
	public int method2449() {
		if (!this.aBoolean100) {
			this.method1807();
		}
		return this.aShort30;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([B)V")
	private void method1795(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class5_Sub6 local4 = new Class5_Sub6(arg0);
		@Pc(9) Class5_Sub6 local9 = new Class5_Sub6(arg0);
		@Pc(14) Class5_Sub6 local14 = new Class5_Sub6(arg0);
		@Pc(19) Class5_Sub6 local19 = new Class5_Sub6(arg0);
		@Pc(24) Class5_Sub6 local24 = new Class5_Sub6(arg0);
		@Pc(29) Class5_Sub6 local29 = new Class5_Sub6(arg0);
		@Pc(34) Class5_Sub6 local34 = new Class5_Sub6(arg0);
		local4.anInt4050 = arg0.length - 23;
		@Pc(44) int local44 = local4.method3077();
		@Pc(48) int local48 = local4.method3077();
		@Pc(52) int local52 = local4.method3062();
		@Pc(56) int local56 = local4.method3062();
		@Pc(60) int local60 = local4.method3062();
		@Pc(64) int local64 = local4.method3062();
		@Pc(68) int local68 = local4.method3062();
		@Pc(72) int local72 = local4.method3062();
		@Pc(76) int local76 = local4.method3062();
		@Pc(80) int local80 = local4.method3077();
		@Pc(84) int local84 = local4.method3077();
		@Pc(88) int local88 = local4.method3077();
		@Pc(92) int local92 = local4.method3077();
		@Pc(96) int local96 = local4.method3077();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray39 = new byte[local52];
			local4.anInt4050 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray39[local113] = local4.method3053();
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
		this.anInt2371 = local44;
		this.anInt2369 = local48;
		this.anInt2368 = local52;
		this.anIntArray267 = new int[local44];
		this.anIntArray265 = new int[local44];
		this.anIntArray269 = new int[local44];
		this.anIntArray263 = new int[local48];
		this.anIntArray266 = new int[local48];
		this.anIntArray262 = new int[local48];
		if (local76 == 1) {
			this.anIntArray270 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray37 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray40 = new byte[local48];
		} else {
			this.aByte4 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray33 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray268 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray37 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray36 = new byte[local48];
		}
		this.aShortArray32 = new short[local48];
		if (local52 > 0) {
			this.aShortArray31 = new short[local52];
			this.aShortArray34 = new short[local52];
			this.aShortArray36 = new short[local52];
			if (local100 > 0) {
				this.aShortArray33 = new short[local100];
				this.aShortArray30 = new short[local100];
				this.aShortArray35 = new short[local100];
				this.aByteArray35 = new byte[local100];
				this.aByteArray31 = new byte[local100];
				this.aByteArray34 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray32 = new byte[local102];
				this.aByteArray38 = new byte[local102];
			}
		}
		local4.anInt4050 = local52;
		local9.anInt4050 = local233;
		local14.anInt4050 = local239;
		local19.anInt4050 = local245;
		local24.anInt4050 = local184;
		@Pc(455) int local455 = 0;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(466) int local466;
		@Pc(468) int local468;
		@Pc(478) int local478;
		@Pc(488) int local488;
		for (@Pc(461) int local461 = 0; local461 < local44; local461++) {
			local466 = local4.method3062();
			local468 = 0;
			if ((local466 & 0x1) != 0) {
				local468 = local9.method3060();
			}
			local478 = 0;
			if ((local466 & 0x2) != 0) {
				local478 = local14.method3060();
			}
			local488 = 0;
			if ((local466 & 0x4) != 0) {
				local488 = local19.method3060();
			}
			this.anIntArray267[local461] = local455 + local468;
			this.anIntArray265[local461] = local457 + local478;
			this.anIntArray269[local461] = local459 + local488;
			local455 = this.anIntArray267[local461];
			local457 = this.anIntArray265[local461];
			local459 = this.anIntArray269[local461];
			if (local76 == 1) {
				this.anIntArray270[local461] = local24.method3062();
			}
		}
		local4.anInt4050 = local225;
		local9.anInt4050 = local151;
		local14.anInt4050 = local166;
		local19.anInt4050 = local193;
		local24.anInt4050 = local175;
		local29.anInt4050 = local208;
		local34.anInt4050 = local219;
		for (local466 = 0; local466 < local48; local466++) {
			this.aShortArray32[local466] = (short) local4.method3077();
			if (local56 == 1) {
				this.aByteArray37[local466] = local9.method3053();
			}
			if (local60 == 255) {
				this.aByteArray40[local466] = local14.method3053();
			}
			if (local64 == 1) {
				this.aByteArray33[local466] = local19.method3053();
			}
			if (local68 == 1) {
				this.anIntArray268[local466] = local24.method3062();
			}
			if (local72 == 1) {
				this.aShortArray37[local466] = (short) (local29.method3077() - 1);
			}
			if (this.aByteArray36 != null) {
				if (this.aShortArray37[local466] == -1) {
					this.aByteArray36[local466] = -1;
				} else {
					this.aByteArray36[local466] = (byte) (local34.method3062() - 1);
				}
			}
		}
		local4.anInt4050 = local202;
		local9.anInt4050 = local160;
		local468 = 0;
		local478 = 0;
		local488 = 0;
		@Pc(674) int local674 = 0;
		@Pc(681) int local681;
		@Pc(784) int local784;
		for (@Pc(676) int local676 = 0; local676 < local48; local676++) {
			local681 = local9.method3062();
			if (local681 == 1) {
				local468 = local4.method3060() + local674;
				local478 = local4.method3060() + local468;
				local488 = local4.method3060() + local478;
				local674 = local488;
				this.anIntArray263[local676] = local468;
				this.anIntArray266[local676] = local478;
				this.anIntArray262[local676] = local488;
			}
			if (local681 == 2) {
				local478 = local488;
				local488 = local4.method3060() + local674;
				local674 = local488;
				this.anIntArray263[local676] = local468;
				this.anIntArray266[local676] = local478;
				this.anIntArray262[local676] = local488;
			}
			if (local681 == 3) {
				local468 = local488;
				local488 = local4.method3060() + local674;
				local674 = local488;
				this.anIntArray263[local676] = local468;
				this.anIntArray266[local676] = local478;
				this.anIntArray262[local676] = local488;
			}
			if (local681 == 4) {
				local784 = local468;
				local468 = local478;
				local478 = local784;
				local488 = local4.method3060() + local674;
				local674 = local488;
				this.anIntArray263[local676] = local468;
				this.anIntArray266[local676] = local784;
				this.anIntArray262[local676] = local488;
			}
		}
		local4.anInt4050 = local251;
		local9.anInt4050 = local259;
		local14.anInt4050 = local267;
		local19.anInt4050 = local275;
		local24.anInt4050 = local281;
		local29.anInt4050 = local113;
		for (local681 = 0; local681 < local52; local681++) {
			local784 = this.aByteArray39[local681] & 0xFF;
			if (local784 == 0) {
				this.aShortArray31[local681] = (short) local4.method3077();
				this.aShortArray34[local681] = (short) local4.method3077();
				this.aShortArray36[local681] = (short) local4.method3077();
			}
			if (local784 == 1) {
				this.aShortArray31[local681] = (short) local9.method3077();
				this.aShortArray34[local681] = (short) local9.method3077();
				this.aShortArray36[local681] = (short) local9.method3077();
				this.aShortArray33[local681] = (short) local14.method3077();
				this.aShortArray30[local681] = (short) local14.method3077();
				this.aShortArray35[local681] = (short) local14.method3077();
				this.aByteArray35[local681] = local19.method3053();
				this.aByteArray31[local681] = local24.method3053();
				this.aByteArray34[local681] = local29.method3053();
			}
			if (local784 == 2) {
				this.aShortArray31[local681] = (short) local9.method3077();
				this.aShortArray34[local681] = (short) local9.method3077();
				this.aShortArray36[local681] = (short) local9.method3077();
				this.aShortArray33[local681] = (short) local14.method3077();
				this.aShortArray30[local681] = (short) local14.method3077();
				this.aShortArray35[local681] = (short) local14.method3077();
				this.aByteArray35[local681] = local19.method3053();
				this.aByteArray31[local681] = local24.method3053();
				this.aByteArray34[local681] = local29.method3053();
				this.aByteArray32[local681] = local29.method3053();
				this.aByteArray38[local681] = local29.method3053();
			}
			if (local784 == 3) {
				this.aShortArray31[local681] = (short) local9.method3077();
				this.aShortArray34[local681] = (short) local9.method3077();
				this.aShortArray36[local681] = (short) local9.method3077();
				this.aShortArray33[local681] = (short) local14.method3077();
				this.aShortArray30[local681] = (short) local14.method3077();
				this.aShortArray35[local681] = (short) local14.method3077();
				this.aByteArray35[local681] = local19.method3053();
				this.aByteArray31[local681] = local24.method3053();
				this.aByteArray34[local681] = local29.method3053();
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V")
	public void method1796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2371; local1++) {
			this.anIntArray267[local1] += arg0;
			this.anIntArray265[local1] += arg1;
			this.anIntArray269[local1] += arg2;
		}
		this.method1801();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(SS)V")
	public void method1797(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray37 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2369; local5++) {
			if (this.aShortArray37[local5] == arg0) {
				this.aShortArray37[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)Lclient!ia;")
	@Override
	public Class1 method2444() {
		return this.method1818(this.aShort34, this.aShort28, -50, -10, -50);
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "()V")
	public void method1799() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2371; local1++) {
			@Pc(7) int local7 = this.anIntArray269[local1];
			this.anIntArray269[local1] = this.anIntArray267[local1];
			this.anIntArray267[local1] = -local7;
		}
		this.method1801();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)Lclient!dh;")
	public Class1_Sub1_Sub1 method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class1_Sub1_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "()V")
	private void method1801() {
		this.aClass94Array1 = null;
		this.aClass94Array2 = null;
		this.aClass44Array1 = null;
		this.aBoolean100 = false;
	}

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "()V")
	public void method1802() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray270 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2371; local9++) {
				local15 = this.anIntArray270[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray25 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray25[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2371) {
				local65 = this.anIntArray270[local59];
				this.anIntArrayArray25[local65][local5[local65]++] = local59++;
			}
			this.anIntArray270 = null;
		}
		if (this.anIntArray268 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2369; local9++) {
			local15 = this.anIntArray268[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray24 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray24[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2369) {
			local65 = this.anIntArray268[local59];
			this.anIntArrayArray24[local65][local5[local65]++] = local59++;
		}
		this.anIntArray268 = null;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public void method1803() {
		@Pc(3) int local3 = Static112.anIntArray261[256];
		@Pc(7) int local7 = Static112.anIntArray272[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2371; local9++) {
			@Pc(26) int local26 = this.anIntArray269[local9] * local3 + this.anIntArray267[local9] * local7 >> 16;
			this.anIntArray269[local9] = this.anIntArray269[local9] * local7 - this.anIntArray267[local9] * local3 >> 16;
			this.anIntArray267[local9] = local26;
		}
		this.method1801();
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
	private void method1804(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static112.anIntArray261[arg0];
		@Pc(7) int local7 = Static112.anIntArray272[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2371; local9++) {
			@Pc(26) int local26 = this.anIntArray265[local9] * local3 + this.anIntArray267[local9] * local7 >> 16;
			this.anIntArray265[local9] = this.anIntArray265[local9] * local7 - this.anIntArray267[local9] * local3 >> 16;
			this.anIntArray267[local9] = local26;
		}
		this.method1801();
	}

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "()Lclient!lg;")
	public Class1_Sub5 method1805() {
		@Pc(3) Class1_Sub5 local3 = new Class1_Sub5();
		if (this.aByteArray37 != null) {
			local3.aByteArray37 = new byte[this.anInt2369];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2369; local13++) {
				local3.aByteArray37[local13] = this.aByteArray37[local13];
			}
		}
		local3.anInt2371 = this.anInt2371;
		local3.anInt2369 = this.anInt2369;
		local3.anInt2368 = this.anInt2368;
		local3.anIntArray267 = this.anIntArray267;
		local3.anIntArray265 = this.anIntArray265;
		local3.anIntArray269 = this.anIntArray269;
		local3.anIntArray263 = this.anIntArray263;
		local3.anIntArray266 = this.anIntArray266;
		local3.anIntArray262 = this.anIntArray262;
		local3.aByteArray40 = this.aByteArray40;
		local3.aByteArray33 = this.aByteArray33;
		local3.aByteArray36 = this.aByteArray36;
		local3.aShortArray32 = this.aShortArray32;
		local3.aShortArray37 = this.aShortArray37;
		local3.aByte4 = this.aByte4;
		local3.aByteArray39 = this.aByteArray39;
		local3.aShortArray31 = this.aShortArray31;
		local3.aShortArray34 = this.aShortArray34;
		local3.aShortArray36 = this.aShortArray36;
		local3.aShortArray33 = this.aShortArray33;
		local3.aShortArray30 = this.aShortArray30;
		local3.aShortArray35 = this.aShortArray35;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray31 = this.aByteArray31;
		local3.aByteArray34 = this.aByteArray34;
		local3.aByteArray32 = this.aByteArray32;
		local3.aByteArray38 = this.aByteArray38;
		local3.anIntArray270 = this.anIntArray270;
		local3.anIntArray268 = this.anIntArray268;
		local3.anIntArrayArray25 = this.anIntArrayArray25;
		local3.anIntArrayArray24 = this.anIntArrayArray24;
		local3.aClass94Array1 = this.aClass94Array1;
		local3.aClass44Array1 = this.aClass44Array1;
		local3.aShort34 = this.aShort34;
		local3.aShort28 = this.aShort28;
		return local3;
	}

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "()V")
	private void method1807() {
		if (this.aBoolean100) {
			return;
		}
		this.aBoolean100 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2371; local20++) {
			@Pc(26) int local26 = this.anIntArray267[local20];
			@Pc(31) int local31 = this.anIntArray265[local20];
			@Pc(36) int local36 = this.anIntArray269[local20];
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
		this.aShort35 = (short) local8;
		this.aShort29 = (short) local14;
		this.aShort30 = (short) local10;
		this.aShort32 = (short) local16;
		this.aShort31 = (short) local12;
		this.aShort33 = (short) local18;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([[IIIIII)V")
	private void method1808(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static112.method1806(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static112.method1806(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static112.method1806(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static112.method1806(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method1813(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method1804(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method1796(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(III)V")
	public void method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(28) int local28;
		if (arg2 != 0) {
			local5 = Static112.anIntArray261[arg2];
			local9 = Static112.anIntArray272[arg2];
			for (local11 = 0; local11 < this.anInt2371; local11++) {
				local28 = this.anIntArray265[local11] * local5 + this.anIntArray267[local11] * local9 >> 16;
				this.anIntArray265[local11] = this.anIntArray265[local11] * local9 - this.anIntArray267[local11] * local5 >> 16;
				this.anIntArray267[local11] = local28;
			}
		}
		if (arg0 != 0) {
			local5 = Static112.anIntArray261[arg0];
			local9 = Static112.anIntArray272[arg0];
			for (local11 = 0; local11 < this.anInt2371; local11++) {
				local28 = this.anIntArray265[local11] * local9 - this.anIntArray269[local11] * local5 >> 16;
				this.anIntArray269[local11] = this.anIntArray265[local11] * local5 + this.anIntArray269[local11] * local9 >> 16;
				this.anIntArray265[local11] = local28;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static112.anIntArray261[arg1];
		local9 = Static112.anIntArray272[arg1];
		for (local11 = 0; local11 < this.anInt2371; local11++) {
			local28 = this.anIntArray269[local11] * local5 + this.anIntArray267[local11] * local9 >> 16;
			this.anIntArray269[local11] = this.anIntArray269[local11] * local9 - this.anIntArray267[local11] * local5 >> 16;
			this.anIntArray267[local11] = local28;
		}
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(III)V")
	public void method1810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2371; local1++) {
			this.anIntArray267[local1] = this.anIntArray267[local1] * arg0 / 128;
			this.anIntArray265[local1] = this.anIntArray265[local1] * arg1 / 128;
			this.anIntArray269[local1] = this.anIntArray269[local1] * arg2 / 128;
		}
		this.method1801();
	}

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "()V")
	public void method1811() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2371; local1++) {
			this.anIntArray269[local1] = -this.anIntArray269[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2369; local18++) {
			@Pc(24) int local24 = this.anIntArray263[local18];
			this.anIntArray263[local18] = this.anIntArray262[local18];
			this.anIntArray262[local18] = local24;
		}
		this.method1801();
	}

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "()V")
	public void method1812() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2371; local1++) {
			@Pc(7) int local7 = this.anIntArray267[local1];
			this.anIntArray267[local1] = this.anIntArray269[local1];
			this.anIntArray269[local1] = -local7;
		}
		this.method1801();
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
	private void method1813(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static112.anIntArray261[arg0];
		@Pc(7) int local7 = Static112.anIntArray272[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2371; local9++) {
			@Pc(26) int local26 = this.anIntArray265[local9] * local7 - this.anIntArray269[local9] * local3 >> 16;
			this.anIntArray269[local9] = this.anIntArray265[local9] * local3 + this.anIntArray269[local9] * local7 >> 16;
			this.anIntArray265[local9] = local26;
		}
		this.method1801();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()Z")
	@Override
	public boolean method2448() {
		return true;
	}

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "()V")
	public void method1815() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2371; local1++) {
			this.anIntArray267[local1] = -this.anIntArray267[local1];
			this.anIntArray269[local1] = -this.anIntArray269[local1];
		}
		this.method1801();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!lg;I)I")
	private int method1816(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray267[arg1];
		@Pc(11) int local11 = arg0.anIntArray265[arg1];
		@Pc(16) int local16 = arg0.anIntArray269[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2371; local18++) {
			if (local6 == this.anIntArray267[local18] && local11 == this.anIntArray265[local18] && local16 == this.anIntArray269[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray267[this.anInt2371] = local6;
			this.anIntArray265[this.anInt2371] = local11;
			this.anIntArray269[this.anInt2371] = local16;
			if (arg0.anIntArray270 != null) {
				this.anIntArray270[this.anInt2371] = arg0.anIntArray270[arg1];
			}
			local1 = this.anInt2371++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ia;IIIZ)V")
	@Override
	public void method2442(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class1_Sub5 local2 = (Class1_Sub5) arg0;
		local2.method1807();
		local2.method1820();
		Static112.anInt2370++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray267;
		@Pc(18) int local18 = local2.anInt2371;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2371; local20++) {
			@Pc(26) Class94 local26 = this.aClass94Array1[local20];
			if (local26.anInt3742 != 0) {
				local36 = this.anIntArray265[local20] - arg2;
				if (local36 >= local2.aShort30 && local36 <= local2.aShort32) {
					@Pc(52) int local52 = this.anIntArray267[local20] - arg1;
					if (local52 >= local2.aShort35 && local52 <= local2.aShort29) {
						@Pc(68) int local68 = this.anIntArray269[local20] - arg3;
						if (local68 >= local2.aShort31 && local68 <= local2.aShort33) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class94 local85 = local2.aClass94Array1[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray269[local79] && local36 == local2.anIntArray265[local79] && local85.anInt3742 != 0) {
									if (this.aClass94Array2 == null) {
										this.aClass94Array2 = new Class94[this.anInt2371];
									}
									if (local2.aClass94Array2 == null) {
										local2.aClass94Array2 = new Class94[local18];
									}
									@Pc(125) Class94 local125 = this.aClass94Array2[local20];
									if (local125 == null) {
										local125 = this.aClass94Array2[local20] = new Class94(local26);
									}
									@Pc(142) Class94 local142 = local2.aClass94Array2[local79];
									if (local142 == null) {
										local142 = local2.aClass94Array2[local79] = new Class94(local85);
									}
									local125.anInt3738 += local85.anInt3738;
									local125.anInt3740 += local85.anInt3740;
									local125.anInt3746 += local85.anInt3746;
									local125.anInt3742 += local85.anInt3742;
									local142.anInt3738 += local26.anInt3738;
									local142.anInt3740 += local26.anInt3740;
									local142.anInt3746 += local26.anInt3746;
									local142.anInt3742 += local26.anInt3742;
									local12++;
									Static112.anIntArray264[local20] = Static112.anInt2370;
									Static112.anIntArray271[local79] = Static112.anInt2370;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt2369; local236++) {
			if (Static112.anIntArray264[this.anIntArray263[local236]] == Static112.anInt2370 && Static112.anIntArray264[this.anIntArray266[local236]] == Static112.anInt2370 && Static112.anIntArray264[this.anIntArray262[local236]] == Static112.anInt2370) {
				if (this.aByteArray37 == null) {
					this.aByteArray37 = new byte[this.anInt2369];
				}
				this.aByteArray37[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt2369; local36++) {
			if (Static112.anIntArray271[local2.anIntArray263[local36]] == Static112.anInt2370 && Static112.anIntArray271[local2.anIntArray266[local36]] == Static112.anInt2370 && Static112.anIntArray271[local2.anIntArray262[local36]] == Static112.anInt2370) {
				if (local2.aByteArray37 == null) {
					local2.aByteArray37 = new byte[local2.anInt2369];
				}
				local2.aByteArray37[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "()V")
	public void method1817() {
		this.anIntArray270 = null;
		this.anIntArray268 = null;
		this.anIntArrayArray25 = null;
		this.anIntArrayArray24 = null;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIII)Lclient!a;")
	public Class1_Sub1 method1818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class1_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(SS)V")
	public void method1819(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2369; local1++) {
			if (this.aShortArray32[local1] == arg0) {
				this.aShortArray32[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "()V")
	public void method1820() {
		if (this.aClass94Array1 != null) {
			return;
		}
		this.aClass94Array1 = new Class94[this.anInt2371];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2371; local10++) {
			this.aClass94Array1[local10] = new Class94();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2369; local25++) {
			@Pc(31) int local31 = this.anIntArray263[local25];
			@Pc(36) int local36 = this.anIntArray266[local25];
			@Pc(41) int local41 = this.anIntArray262[local25];
			@Pc(51) int local51 = this.anIntArray267[local36] - this.anIntArray267[local31];
			@Pc(61) int local61 = this.anIntArray265[local36] - this.anIntArray265[local31];
			@Pc(71) int local71 = this.anIntArray269[local36] - this.anIntArray269[local31];
			@Pc(81) int local81 = this.anIntArray267[local41] - this.anIntArray267[local31];
			@Pc(91) int local91 = this.anIntArray265[local41] - this.anIntArray265[local31];
			@Pc(101) int local101 = this.anIntArray269[local41] - this.anIntArray269[local31];
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
			if (this.aByteArray37 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray37[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class94 local211 = this.aClass94Array1[local31];
				local211.anInt3738 += local109;
				local211.anInt3740 += local117;
				local211.anInt3746 += local125;
				local211.anInt3742++;
				@Pc(240) Class94 local240 = this.aClass94Array1[local36];
				local240.anInt3738 += local109;
				local240.anInt3740 += local117;
				local240.anInt3746 += local125;
				local240.anInt3742++;
				@Pc(269) Class94 local269 = this.aClass94Array1[local41];
				local269.anInt3738 += local109;
				local269.anInt3740 += local117;
				local269.anInt3746 += local125;
				local269.anInt3742++;
			} else if (local198 == 1) {
				if (this.aClass44Array1 == null) {
					this.aClass44Array1 = new Class44[this.anInt2369];
				}
				@Pc(314) Class44 local314 = this.aClass44Array1[local25] = new Class44();
				local314.anInt1860 = local109;
				local314.anInt1855 = local117;
				local314.anInt1856 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "([B)V")
	private void method1821(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class5_Sub6 local8 = new Class5_Sub6(arg0);
		@Pc(13) Class5_Sub6 local13 = new Class5_Sub6(arg0);
		@Pc(18) Class5_Sub6 local18 = new Class5_Sub6(arg0);
		@Pc(23) Class5_Sub6 local23 = new Class5_Sub6(arg0);
		@Pc(28) Class5_Sub6 local28 = new Class5_Sub6(arg0);
		local8.anInt4050 = arg0.length - 18;
		@Pc(38) int local38 = local8.method3077();
		@Pc(42) int local42 = local8.method3077();
		@Pc(46) int local46 = local8.method3062();
		@Pc(50) int local50 = local8.method3062();
		@Pc(54) int local54 = local8.method3062();
		@Pc(58) int local58 = local8.method3062();
		@Pc(62) int local62 = local8.method3062();
		@Pc(66) int local66 = local8.method3062();
		@Pc(70) int local70 = local8.method3077();
		@Pc(74) int local74 = local8.method3077();
		@Pc(78) int local78 = local8.method3077();
		@Pc(82) int local82 = local8.method3077();
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
		this.anInt2371 = local38;
		this.anInt2369 = local42;
		this.anInt2368 = local46;
		this.anIntArray267 = new int[local38];
		this.anIntArray265 = new int[local38];
		this.anIntArray269 = new int[local38];
		this.anIntArray263 = new int[local42];
		this.anIntArray266 = new int[local42];
		this.anIntArray262 = new int[local42];
		if (local46 > 0) {
			this.aByteArray39 = new byte[local46];
			this.aShortArray31 = new short[local46];
			this.aShortArray34 = new short[local46];
			this.aShortArray36 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray270 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray37 = new byte[local42];
			this.aByteArray36 = new byte[local42];
			this.aShortArray37 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray40 = new byte[local42];
		} else {
			this.aByte4 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray33 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray268 = new int[local42];
		}
		this.aShortArray32 = new short[local42];
		local8.anInt4050 = 0;
		local13.anInt4050 = local165;
		local18.anInt4050 = local171;
		local23.anInt4050 = local90;
		local28.anInt4050 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method3062();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method3060();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method3060();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method3060();
			}
			this.anIntArray267[local307] = local301 + local314;
			this.anIntArray265[local307] = local303 + local324;
			this.anIntArray269[local307] = local305 + local334;
			local301 = this.anIntArray267[local307];
			local303 = this.anIntArray265[local307];
			local305 = this.anIntArray269[local307];
			if (local66 == 1) {
				this.anIntArray270[local307] = local28.method3062();
			}
		}
		local8.anInt4050 = local149;
		local13.anInt4050 = local116;
		local18.anInt4050 = local98;
		local23.anInt4050 = local134;
		local28.anInt4050 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray32[local312] = (short) local8.method3077();
			if (local50 == 1) {
				local314 = local13.method3062();
				if ((local314 & 0x1) == 1) {
					this.aByteArray37[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray37[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray36[local312] = (byte) (local314 >> 2);
					this.aShortArray37[local312] = this.aShortArray32[local312];
					this.aShortArray32[local312] = 127;
					if (this.aShortArray37[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray36[local312] = -1;
					this.aShortArray37[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray40[local312] = local18.method3053();
			}
			if (local58 == 1) {
				this.aByteArray33[local312] = local23.method3053();
			}
			if (local62 == 1) {
				this.anIntArray268[local312] = local28.method3062();
			}
		}
		local8.anInt4050 = local143;
		local13.anInt4050 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method3062();
			if (local543 == 1) {
				local314 = local8.method3060() + local536;
				local324 = local8.method3060() + local314;
				local334 = local8.method3060() + local324;
				local536 = local334;
				this.anIntArray263[local538] = local314;
				this.anIntArray266[local538] = local324;
				this.anIntArray262[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method3060() + local536;
				local536 = local334;
				this.anIntArray263[local538] = local314;
				this.anIntArray266[local538] = local324;
				this.anIntArray262[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method3060() + local536;
				local536 = local334;
				this.anIntArray263[local538] = local314;
				this.anIntArray266[local538] = local324;
				this.anIntArray262[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method3060() + local536;
				local536 = local334;
				this.anIntArray263[local538] = local314;
				this.anIntArray266[local538] = local646;
				this.anIntArray262[local538] = local334;
			}
		}
		local8.anInt4050 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray39[local543] = 0;
			this.aShortArray31[local543] = (short) local8.method3077();
			this.aShortArray34[local543] = (short) local8.method3077();
			this.aShortArray36[local543] = (short) local8.method3077();
		}
		if (this.aByteArray36 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray36[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray31[local731] & 0xFFFF) == this.anIntArray263[local723] && (this.aShortArray34[local731] & 0xFFFF) == this.anIntArray266[local723] && (this.aShortArray36[local731] & 0xFFFF) == this.anIntArray262[local723]) {
						this.aByteArray36[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray36 = null;
			}
		}
		if (!local3) {
			this.aShortArray37 = null;
		}
		if (!local1) {
			this.aByteArray37 = null;
		}
	}
}
