import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class26_Sub5 extends Class26 {

	@OriginalMember(owner = "client!md", name = "o", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!md", name = "t", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!md", name = "H", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!md", name = "I", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!md", name = "J", descriptor = "S")
	public short aShort8;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!md", name = "M", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!md", name = "O", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!md", name = "S", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!md", name = "T", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!md", name = "U", descriptor = "I")
	public int anInt2511;

	@OriginalMember(owner = "client!md", name = "V", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!md", name = "W", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!md", name = "X", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!md", name = "Y", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!md", name = "Z", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!md", name = "ab", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!md", name = "bb", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!md", name = "cb", descriptor = "[I")
	public int[] anIntArray175;

	@OriginalMember(owner = "client!md", name = "db", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!md", name = "eb", descriptor = "[Lclient!db;")
	public Class21[] aClass21Array1;

	@OriginalMember(owner = "client!md", name = "fb", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!md", name = "gb", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!md", name = "jb", descriptor = "[Lclient!kj;")
	public Class54[] aClass54Array1;

	@OriginalMember(owner = "client!md", name = "kb", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!md", name = "mb", descriptor = "[Lclient!db;")
	public Class21[] aClass21Array2;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	public int anInt2509 = 0;

	@OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
	public int anInt2512 = 0;

	@OriginalMember(owner = "client!md", name = "lb", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!md", name = "P", descriptor = "B")
	public byte aByte11 = 0;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	private Class26_Sub5() {
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "([B)V")
	public Class26_Sub5(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1791(arg0);
		} else {
			this.method1787(arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "([Lclient!md;I)V")
	public Class26_Sub5(@OriginalArg(0) Class26_Sub5[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2512 = 0;
		this.anInt2509 = 0;
		this.anInt2511 = 0;
		this.aByte11 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class26_Sub5 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2512 += local44.anInt2512;
				this.anInt2509 += local44.anInt2509;
				this.anInt2511 += local44.anInt2511;
				if (local44.aByteArray21 == null) {
					if (this.aByte11 == -1) {
						this.aByte11 = local44.aByte11;
					}
					if (this.aByte11 != local44.aByte11) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray26 != null;
				local19 |= local44.aByteArray25 != null;
				local21 |= local44.anIntArray167 != null;
				local23 |= local44.aShortArray32 != null;
				local25 |= local44.aByteArray23 != null;
			}
		}
		this.anIntArray165 = new int[this.anInt2512];
		this.anIntArray170 = new int[this.anInt2512];
		this.anIntArray175 = new int[this.anInt2512];
		this.anIntArray168 = new int[this.anInt2512];
		this.anIntArray173 = new int[this.anInt2509];
		this.anIntArray174 = new int[this.anInt2509];
		this.anIntArray172 = new int[this.anInt2509];
		if (local15) {
			this.aByteArray26 = new byte[this.anInt2509];
		}
		if (local17) {
			this.aByteArray21 = new byte[this.anInt2509];
		}
		if (local19) {
			this.aByteArray25 = new byte[this.anInt2509];
		}
		if (local21) {
			this.anIntArray167 = new int[this.anInt2509];
		}
		if (local23) {
			this.aShortArray32 = new short[this.anInt2509];
		}
		if (local25) {
			this.aByteArray23 = new byte[this.anInt2509];
		}
		this.aShortArray35 = new short[this.anInt2509];
		if (this.anInt2511 > 0) {
			this.aByteArray27 = new byte[this.anInt2511];
			this.aShortArray34 = new short[this.anInt2511];
			this.aShortArray39 = new short[this.anInt2511];
			this.aShortArray36 = new short[this.anInt2511];
			this.aShortArray33 = new short[this.anInt2511];
			this.aShortArray37 = new short[this.anInt2511];
			this.aShortArray38 = new short[this.anInt2511];
			this.aByteArray24 = new byte[this.anInt2511];
			this.aByteArray28 = new byte[this.anInt2511];
			this.aByteArray22 = new byte[this.anInt2511];
			this.aByteArray20 = new byte[this.anInt2511];
			this.aByteArray19 = new byte[this.anInt2511];
		}
		this.anInt2512 = 0;
		this.anInt2509 = 0;
		this.anInt2511 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class26_Sub5 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt2509; local302++) {
					if (local15 && local298.aByteArray26 != null) {
						this.aByteArray26[this.anInt2509] = local298.aByteArray26[local302];
					}
					if (local17) {
						if (local298.aByteArray21 == null) {
							this.aByteArray21[this.anInt2509] = local298.aByte11;
						} else {
							this.aByteArray21[this.anInt2509] = local298.aByteArray21[local302];
						}
					}
					if (local19 && local298.aByteArray25 != null) {
						this.aByteArray25[this.anInt2509] = local298.aByteArray25[local302];
					}
					if (local21 && local298.anIntArray167 != null) {
						this.anIntArray167[this.anInt2509] = local298.anIntArray167[local302];
					}
					if (local23) {
						if (local298.aShortArray32 == null) {
							this.aShortArray32[this.anInt2509] = -1;
						} else {
							this.aShortArray32[this.anInt2509] = local298.aShortArray32[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray23 == null || local298.aByteArray23[local302] == -1) {
							this.aByteArray23[this.anInt2509] = -1;
						} else {
							this.aByteArray23[this.anInt2509] = (byte) (local298.aByteArray23[local302] + this.anInt2511);
						}
					}
					this.aShortArray35[this.anInt2509] = local298.aShortArray35[local302];
					this.anIntArray173[this.anInt2509] = this.method1796(local298, local298.anIntArray173[local302]);
					this.anIntArray174[this.anInt2509] = this.method1796(local298, local298.anIntArray174[local302]);
					this.anIntArray172[this.anInt2509] = this.method1796(local298, local298.anIntArray172[local302]);
					this.anInt2509++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt2511; local477++) {
					@Pc(489) byte local489 = this.aByteArray27[this.anInt2511] = local298.aByteArray27[local477];
					if (local489 == 0) {
						this.aShortArray34[this.anInt2511] = (short) this.method1796(local298, local298.aShortArray34[local477]);
						this.aShortArray39[this.anInt2511] = (short) this.method1796(local298, local298.aShortArray39[local477]);
						this.aShortArray36[this.anInt2511] = (short) this.method1796(local298, local298.aShortArray36[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray34[this.anInt2511] = local298.aShortArray34[local477];
						this.aShortArray39[this.anInt2511] = local298.aShortArray39[local477];
						this.aShortArray36[this.anInt2511] = local298.aShortArray36[local477];
						this.aShortArray33[this.anInt2511] = local298.aShortArray33[local477];
						this.aShortArray37[this.anInt2511] = local298.aShortArray37[local477];
						this.aShortArray38[this.anInt2511] = local298.aShortArray38[local477];
						this.aByteArray24[this.anInt2511] = local298.aByteArray24[local477];
						this.aByteArray28[this.anInt2511] = local298.aByteArray28[local477];
						this.aByteArray22[this.anInt2511] = local298.aByteArray22[local477];
					}
					if (local489 == 2) {
						this.aByteArray20[this.anInt2511] = local298.aByteArray20[local477];
						this.aByteArray19[this.anInt2511] = local298.aByteArray19[local477];
					}
					this.anInt2511++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!md;ZZZZ)V")
	public Class26_Sub5(@OriginalArg(0) Class26_Sub5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2512 = arg0.anInt2512;
		this.anInt2509 = arg0.anInt2509;
		this.anInt2511 = arg0.anInt2511;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray165 = arg0.anIntArray165;
			this.anIntArray170 = arg0.anIntArray170;
			this.anIntArray175 = arg0.anIntArray175;
		} else {
			this.anIntArray165 = new int[this.anInt2512];
			this.anIntArray170 = new int[this.anInt2512];
			this.anIntArray175 = new int[this.anInt2512];
			for (local57 = 0; local57 < this.anInt2512; local57++) {
				this.anIntArray165[local57] = arg0.anIntArray165[local57];
				this.anIntArray170[local57] = arg0.anIntArray170[local57];
				this.anIntArray175[local57] = arg0.anIntArray175[local57];
			}
		}
		if (arg2) {
			this.aShortArray35 = arg0.aShortArray35;
		} else {
			this.aShortArray35 = new short[this.anInt2509];
			for (local57 = 0; local57 < this.anInt2509; local57++) {
				this.aShortArray35[local57] = arg0.aShortArray35[local57];
			}
		}
		if (arg3 || arg0.aShortArray32 == null) {
			this.aShortArray32 = arg0.aShortArray32;
		} else {
			this.aShortArray32 = new short[this.anInt2509];
			for (local57 = 0; local57 < this.anInt2509; local57++) {
				this.aShortArray32[local57] = arg0.aShortArray32[local57];
			}
		}
		this.aByteArray25 = arg0.aByteArray25;
		this.anIntArray173 = arg0.anIntArray173;
		this.anIntArray174 = arg0.anIntArray174;
		this.anIntArray172 = arg0.anIntArray172;
		this.aByteArray26 = arg0.aByteArray26;
		this.aByteArray21 = arg0.aByteArray21;
		this.aByteArray23 = arg0.aByteArray23;
		this.aByte11 = arg0.aByte11;
		this.aByteArray27 = arg0.aByteArray27;
		this.aShortArray34 = arg0.aShortArray34;
		this.aShortArray39 = arg0.aShortArray39;
		this.aShortArray36 = arg0.aShortArray36;
		this.aShortArray33 = arg0.aShortArray33;
		this.aShortArray37 = arg0.aShortArray37;
		this.aShortArray38 = arg0.aShortArray38;
		this.aByteArray24 = arg0.aByteArray24;
		this.aByteArray28 = arg0.aByteArray28;
		this.aByteArray22 = arg0.aByteArray22;
		this.aByteArray20 = arg0.aByteArray20;
		this.aByteArray19 = arg0.aByteArray19;
		this.anIntArray168 = arg0.anIntArray168;
		this.anIntArray167 = arg0.anIntArray167;
		this.anIntArrayArray20 = arg0.anIntArrayArray20;
		this.anIntArrayArray19 = arg0.anIntArrayArray19;
		this.aClass21Array2 = arg0.aClass21Array2;
		this.aClass54Array1 = arg0.aClass54Array1;
		this.aClass21Array1 = arg0.aClass21Array1;
		this.aShort8 = arg0.aShort8;
		this.aShort7 = arg0.aShort7;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(SS)V")
	public void method1779(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2509; local1++) {
			if (this.aShortArray35[local1] == arg0) {
				this.aShortArray35[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([[IIIIZIZ)Lclient!md;")
	public Class26_Sub5 method1780(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1800();
		@Pc(6) int local6 = arg1 + this.aShort6;
		@Pc(11) int local11 = arg1 + this.aShort4;
		@Pc(16) int local16 = arg3 + this.aShort9;
		@Pc(21) int local21 = arg3 + this.aShort5;
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
		@Pc(101) Class26_Sub5 local101 = new Class26_Sub5();
		local101.anInt2512 = this.anInt2512;
		local101.anInt2509 = this.anInt2509;
		local101.anInt2511 = this.anInt2511;
		local101.anIntArray165 = this.anIntArray165;
		local101.anIntArray175 = this.anIntArray175;
		local101.anIntArray173 = this.anIntArray173;
		local101.anIntArray174 = this.anIntArray174;
		local101.anIntArray172 = this.anIntArray172;
		local101.aByteArray26 = this.aByteArray26;
		local101.aByteArray21 = this.aByteArray21;
		local101.aByteArray25 = this.aByteArray25;
		local101.aByteArray23 = this.aByteArray23;
		local101.aShortArray35 = this.aShortArray35;
		local101.aShortArray32 = this.aShortArray32;
		local101.aByte11 = this.aByte11;
		local101.aByteArray27 = this.aByteArray27;
		local101.aShortArray34 = this.aShortArray34;
		local101.aShortArray39 = this.aShortArray39;
		local101.aShortArray36 = this.aShortArray36;
		local101.aShortArray33 = this.aShortArray33;
		local101.aShortArray37 = this.aShortArray37;
		local101.aShortArray38 = this.aShortArray38;
		local101.aByteArray24 = this.aByteArray24;
		local101.aByteArray28 = this.aByteArray28;
		local101.aByteArray22 = this.aByteArray22;
		local101.aByteArray20 = this.aByteArray20;
		local101.aByteArray19 = this.aByteArray19;
		local101.anIntArray168 = this.anIntArray168;
		local101.anIntArray167 = this.anIntArray167;
		local101.anIntArrayArray20 = this.anIntArrayArray20;
		local101.anIntArrayArray19 = this.anIntArrayArray19;
		local101.aShort8 = this.aShort8;
		local101.aShort7 = this.aShort7;
		local101.aClass21Array2 = this.aClass21Array2;
		local101.aClass54Array1 = this.aClass54Array1;
		local101.aClass21Array1 = this.aClass21Array1;
		local101.anIntArray170 = new int[local101.anInt2512];
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
			for (local257 = 0; local257 < local101.anInt2512; local257++) {
				local265 = this.anIntArray165[local257] + arg1;
				local272 = this.anIntArray175[local257] + arg3;
				local276 = local265 & 0x7F;
				local280 = local272 & 0x7F;
				local284 = local265 >> 7;
				local288 = local272 >> 7;
				local310 = arg0[local284][local288] * (128 - local276) + arg0[local284 + 1][local288] * local276 >> 7;
				local336 = arg0[local284][local288 + 1] * (128 - local276) + arg0[local284 + 1][local288 + 1] * local276 >> 7;
				local348 = local310 * (128 - local280) + local336 * local280 >> 7;
				local101.anIntArray170[local257] = this.anIntArray170[local257] + local348 - arg2;
			}
		} else {
			for (local257 = 0; local257 < local101.anInt2512; local257++) {
				local265 = (this.anIntArray170[local257] << 16) / this.aShort3;
				if (local265 < arg4) {
					local272 = this.anIntArray165[local257] + arg1;
					local276 = this.anIntArray175[local257] + arg3;
					local280 = local272 & 0x7F;
					local284 = local276 & 0x7F;
					local288 = local272 >> 7;
					local310 = local276 >> 7;
					local336 = arg0[local288][local310] * (128 - local280) + arg0[local288 + 1][local310] * local280 >> 7;
					local348 = arg0[local288][local310 + 1] * (128 - local280) + arg0[local288 + 1][local310 + 1] * local280 >> 7;
					@Pc(472) int local472 = local336 * (128 - local284) + local348 * local284 >> 7;
					local101.anIntArray170[local257] = this.anIntArray170[local257] + (local472 - arg2) * (arg4 - local265) / arg4;
				} else {
					local101.anIntArray170[local257] = this.anIntArray170[local257];
				}
			}
		}
		this.aBoolean126 = false;
		return local101;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!m;IIIZ)V")
	@Override
	public void method2996(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class26_Sub5 local2 = (Class26_Sub5) arg0;
		local2.method1800();
		local2.method1801();
		Static128.anInt2510++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray165;
		@Pc(18) int local18 = local2.anInt2512;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2512; local20++) {
			@Pc(26) Class21 local26 = this.aClass21Array2[local20];
			if (local26.anInt720 != 0) {
				local36 = this.anIntArray170[local20] - arg2;
				if (local36 >= local2.aShort3 && local36 <= local2.aShort10) {
					@Pc(52) int local52 = this.anIntArray165[local20] - arg1;
					if (local52 >= local2.aShort6 && local52 <= local2.aShort4) {
						@Pc(68) int local68 = this.anIntArray175[local20] - arg3;
						if (local68 >= local2.aShort9 && local68 <= local2.aShort5) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class21 local85 = local2.aClass21Array2[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray175[local79] && local36 == local2.anIntArray170[local79] && local85.anInt720 != 0) {
									if (this.aClass21Array1 == null) {
										this.aClass21Array1 = new Class21[this.anInt2512];
									}
									if (local2.aClass21Array1 == null) {
										local2.aClass21Array1 = new Class21[local18];
									}
									@Pc(125) Class21 local125 = this.aClass21Array1[local20];
									if (local125 == null) {
										local125 = this.aClass21Array1[local20] = new Class21(local26);
									}
									@Pc(142) Class21 local142 = local2.aClass21Array1[local79];
									if (local142 == null) {
										local142 = local2.aClass21Array1[local79] = new Class21(local85);
									}
									local125.anInt717 += local85.anInt717;
									local125.anInt716 += local85.anInt716;
									local125.anInt723 += local85.anInt723;
									local125.anInt720 += local85.anInt720;
									local142.anInt717 += local26.anInt717;
									local142.anInt716 += local26.anInt716;
									local142.anInt723 += local26.anInt723;
									local142.anInt720 += local26.anInt720;
									local12++;
									Static128.anIntArray169[local20] = Static128.anInt2510;
									Static128.anIntArray176[local79] = Static128.anInt2510;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt2509; local236++) {
			if (Static128.anIntArray169[this.anIntArray173[local236]] == Static128.anInt2510 && Static128.anIntArray169[this.anIntArray174[local236]] == Static128.anInt2510 && Static128.anIntArray169[this.anIntArray172[local236]] == Static128.anInt2510) {
				if (this.aByteArray26 == null) {
					this.aByteArray26 = new byte[this.anInt2509];
				}
				this.aByteArray26[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt2509; local36++) {
			if (Static128.anIntArray176[local2.anIntArray173[local36]] == Static128.anInt2510 && Static128.anIntArray176[local2.anIntArray174[local36]] == Static128.anInt2510 && Static128.anIntArray176[local2.anIntArray172[local36]] == Static128.anInt2510) {
				if (local2.aByteArray26 == null) {
					local2.aByteArray26 = new byte[local2.anInt2509];
				}
				local2.aByteArray26[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "()V")
	public void method1781() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2512; local1++) {
			@Pc(7) int local7 = this.anIntArray165[local1];
			this.anIntArray165[local1] = this.anIntArray175[local1];
			this.anIntArray175[local1] = -local7;
		}
		this.method1786();
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
	@Override
	public int method2995() {
		if (!this.aBoolean126) {
			this.method1800();
		}
		return this.aShort3;
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "()V")
	public void method1782() {
		this.anIntArray168 = null;
		this.anIntArray167 = null;
		this.anIntArrayArray20 = null;
		this.anIntArrayArray19 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)Lclient!rh;")
	public Class26_Sub6_Sub1 method1783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class26_Sub6_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "()V")
	public void method1784() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2512; local1++) {
			@Pc(7) int local7 = this.anIntArray175[local1];
			this.anIntArray175[local1] = this.anIntArray165[local1];
			this.anIntArray165[local1] = -local7;
		}
		this.method1786();
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public void method1785() {
		@Pc(3) int local3 = Static128.anIntArray171[256];
		@Pc(7) int local7 = Static128.anIntArray166[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2512; local9++) {
			@Pc(26) int local26 = this.anIntArray175[local9] * local3 + this.anIntArray165[local9] * local7 >> 16;
			this.anIntArray175[local9] = this.anIntArray175[local9] * local7 - this.anIntArray165[local9] * local3 >> 16;
			this.anIntArray165[local9] = local26;
		}
		this.method1786();
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "()V")
	private void method1786() {
		this.aClass21Array2 = null;
		this.aClass21Array1 = null;
		this.aClass54Array1 = null;
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([B)V")
	private void method1787(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg0);
		@Pc(13) Class3_Sub4 local13 = new Class3_Sub4(arg0);
		@Pc(18) Class3_Sub4 local18 = new Class3_Sub4(arg0);
		@Pc(23) Class3_Sub4 local23 = new Class3_Sub4(arg0);
		@Pc(28) Class3_Sub4 local28 = new Class3_Sub4(arg0);
		local8.anInt1758 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1270();
		@Pc(42) int local42 = local8.method1270();
		@Pc(46) int local46 = local8.method1278();
		@Pc(50) int local50 = local8.method1278();
		@Pc(54) int local54 = local8.method1278();
		@Pc(58) int local58 = local8.method1278();
		@Pc(62) int local62 = local8.method1278();
		@Pc(66) int local66 = local8.method1278();
		@Pc(70) int local70 = local8.method1270();
		@Pc(74) int local74 = local8.method1270();
		@Pc(78) int local78 = local8.method1270();
		@Pc(82) int local82 = local8.method1270();
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
		this.anInt2512 = local38;
		this.anInt2509 = local42;
		this.anInt2511 = local46;
		this.anIntArray165 = new int[local38];
		this.anIntArray170 = new int[local38];
		this.anIntArray175 = new int[local38];
		this.anIntArray173 = new int[local42];
		this.anIntArray174 = new int[local42];
		this.anIntArray172 = new int[local42];
		if (local46 > 0) {
			this.aByteArray27 = new byte[local46];
			this.aShortArray34 = new short[local46];
			this.aShortArray39 = new short[local46];
			this.aShortArray36 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray168 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray26 = new byte[local42];
			this.aByteArray23 = new byte[local42];
			this.aShortArray32 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray21 = new byte[local42];
		} else {
			this.aByte11 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray25 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray167 = new int[local42];
		}
		this.aShortArray35 = new short[local42];
		local8.anInt1758 = 0;
		local13.anInt1758 = local165;
		local18.anInt1758 = local171;
		local23.anInt1758 = local90;
		local28.anInt1758 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1278();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1291();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1291();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1291();
			}
			this.anIntArray165[local307] = local301 + local314;
			this.anIntArray170[local307] = local303 + local324;
			this.anIntArray175[local307] = local305 + local334;
			local301 = this.anIntArray165[local307];
			local303 = this.anIntArray170[local307];
			local305 = this.anIntArray175[local307];
			if (local66 == 1) {
				this.anIntArray168[local307] = local28.method1278();
			}
		}
		local8.anInt1758 = local149;
		local13.anInt1758 = local116;
		local18.anInt1758 = local98;
		local23.anInt1758 = local134;
		local28.anInt1758 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray35[local312] = (short) local8.method1270();
			if (local50 == 1) {
				local314 = local13.method1278();
				if ((local314 & 0x1) == 1) {
					this.aByteArray26[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray26[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray23[local312] = (byte) (local314 >> 2);
					this.aShortArray32[local312] = this.aShortArray35[local312];
					this.aShortArray35[local312] = 127;
					if (this.aShortArray32[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray23[local312] = -1;
					this.aShortArray32[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray21[local312] = local18.method1248();
			}
			if (local58 == 1) {
				this.aByteArray25[local312] = local23.method1248();
			}
			if (local62 == 1) {
				this.anIntArray167[local312] = local28.method1278();
			}
		}
		local8.anInt1758 = local143;
		local13.anInt1758 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1278();
			if (local543 == 1) {
				local314 = local8.method1291() + local536;
				local324 = local8.method1291() + local314;
				local334 = local8.method1291() + local324;
				local536 = local334;
				this.anIntArray173[local538] = local314;
				this.anIntArray174[local538] = local324;
				this.anIntArray172[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1291() + local536;
				local536 = local334;
				this.anIntArray173[local538] = local314;
				this.anIntArray174[local538] = local324;
				this.anIntArray172[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1291() + local536;
				local536 = local334;
				this.anIntArray173[local538] = local314;
				this.anIntArray174[local538] = local324;
				this.anIntArray172[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1291() + local536;
				local536 = local334;
				this.anIntArray173[local538] = local314;
				this.anIntArray174[local538] = local646;
				this.anIntArray172[local538] = local334;
			}
		}
		local8.anInt1758 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray27[local543] = 0;
			this.aShortArray34[local543] = (short) local8.method1270();
			this.aShortArray39[local543] = (short) local8.method1270();
			this.aShortArray36[local543] = (short) local8.method1270();
		}
		if (this.aByteArray23 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray23[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray34[local731] & 0xFFFF) == this.anIntArray173[local723] && (this.aShortArray39[local731] & 0xFFFF) == this.anIntArray174[local723] && (this.aShortArray36[local731] & 0xFFFF) == this.anIntArray172[local723]) {
						this.aByteArray23[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray23 = null;
			}
		}
		if (!local3) {
			this.aShortArray32 = null;
		}
		if (!local1) {
			this.aByteArray26 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "()Lclient!md;")
	public Class26_Sub5 method1789() {
		@Pc(3) Class26_Sub5 local3 = new Class26_Sub5();
		if (this.aByteArray26 != null) {
			local3.aByteArray26 = new byte[this.anInt2509];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2509; local13++) {
				local3.aByteArray26[local13] = this.aByteArray26[local13];
			}
		}
		local3.anInt2512 = this.anInt2512;
		local3.anInt2509 = this.anInt2509;
		local3.anInt2511 = this.anInt2511;
		local3.anIntArray165 = this.anIntArray165;
		local3.anIntArray170 = this.anIntArray170;
		local3.anIntArray175 = this.anIntArray175;
		local3.anIntArray173 = this.anIntArray173;
		local3.anIntArray174 = this.anIntArray174;
		local3.anIntArray172 = this.anIntArray172;
		local3.aByteArray21 = this.aByteArray21;
		local3.aByteArray25 = this.aByteArray25;
		local3.aByteArray23 = this.aByteArray23;
		local3.aShortArray35 = this.aShortArray35;
		local3.aShortArray32 = this.aShortArray32;
		local3.aByte11 = this.aByte11;
		local3.aByteArray27 = this.aByteArray27;
		local3.aShortArray34 = this.aShortArray34;
		local3.aShortArray39 = this.aShortArray39;
		local3.aShortArray36 = this.aShortArray36;
		local3.aShortArray33 = this.aShortArray33;
		local3.aShortArray37 = this.aShortArray37;
		local3.aShortArray38 = this.aShortArray38;
		local3.aByteArray24 = this.aByteArray24;
		local3.aByteArray28 = this.aByteArray28;
		local3.aByteArray22 = this.aByteArray22;
		local3.aByteArray20 = this.aByteArray20;
		local3.aByteArray19 = this.aByteArray19;
		local3.anIntArray168 = this.anIntArray168;
		local3.anIntArray167 = this.anIntArray167;
		local3.anIntArrayArray20 = this.anIntArrayArray20;
		local3.anIntArrayArray19 = this.anIntArrayArray19;
		local3.aClass21Array2 = this.aClass21Array2;
		local3.aClass54Array1 = this.aClass54Array1;
		local3.aShort8 = this.aShort8;
		local3.aShort7 = this.aShort7;
		return local3;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(III)V")
	public void method1790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2512; local1++) {
			this.anIntArray165[local1] = this.anIntArray165[local1] * arg0 / 128;
			this.anIntArray170[local1] = this.anIntArray170[local1] * arg1 / 128;
			this.anIntArray175[local1] = this.anIntArray175[local1] * arg2 / 128;
		}
		this.method1786();
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "([B)V")
	private void method1791(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub4 local4 = new Class3_Sub4(arg0);
		@Pc(9) Class3_Sub4 local9 = new Class3_Sub4(arg0);
		@Pc(14) Class3_Sub4 local14 = new Class3_Sub4(arg0);
		@Pc(19) Class3_Sub4 local19 = new Class3_Sub4(arg0);
		@Pc(24) Class3_Sub4 local24 = new Class3_Sub4(arg0);
		@Pc(29) Class3_Sub4 local29 = new Class3_Sub4(arg0);
		@Pc(34) Class3_Sub4 local34 = new Class3_Sub4(arg0);
		local4.anInt1758 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1270();
		@Pc(48) int local48 = local4.method1270();
		@Pc(52) int local52 = local4.method1278();
		@Pc(56) int local56 = local4.method1278();
		@Pc(60) int local60 = local4.method1278();
		@Pc(64) int local64 = local4.method1278();
		@Pc(68) int local68 = local4.method1278();
		@Pc(72) int local72 = local4.method1278();
		@Pc(76) int local76 = local4.method1278();
		@Pc(80) int local80 = local4.method1270();
		@Pc(84) int local84 = local4.method1270();
		@Pc(88) int local88 = local4.method1270();
		@Pc(92) int local92 = local4.method1270();
		@Pc(96) int local96 = local4.method1270();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray27 = new byte[local52];
			local4.anInt1758 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray27[local113] = local4.method1248();
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
		this.anInt2512 = local44;
		this.anInt2509 = local48;
		this.anInt2511 = local52;
		this.anIntArray165 = new int[local44];
		this.anIntArray170 = new int[local44];
		this.anIntArray175 = new int[local44];
		this.anIntArray173 = new int[local48];
		this.anIntArray174 = new int[local48];
		this.anIntArray172 = new int[local48];
		if (local76 == 1) {
			this.anIntArray168 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray26 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray21 = new byte[local48];
		} else {
			this.aByte11 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray25 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray167 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray32 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray23 = new byte[local48];
		}
		this.aShortArray35 = new short[local48];
		if (local52 > 0) {
			this.aShortArray34 = new short[local52];
			this.aShortArray39 = new short[local52];
			this.aShortArray36 = new short[local52];
			if (local100 > 0) {
				this.aShortArray33 = new short[local100];
				this.aShortArray37 = new short[local100];
				this.aShortArray38 = new short[local100];
				this.aByteArray24 = new byte[local100];
				this.aByteArray28 = new byte[local100];
				this.aByteArray22 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray20 = new byte[local102];
				this.aByteArray19 = new byte[local102];
			}
		}
		local4.anInt1758 = local52;
		local9.anInt1758 = local233;
		local14.anInt1758 = local239;
		local19.anInt1758 = local245;
		local24.anInt1758 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1278();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1291();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1291();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1291();
			}
			this.anIntArray165[local463] = local457 + local470;
			this.anIntArray170[local463] = local459 + local480;
			this.anIntArray175[local463] = local461 + local490;
			local457 = this.anIntArray165[local463];
			local459 = this.anIntArray170[local463];
			local461 = this.anIntArray175[local463];
			if (local76 == 1) {
				this.anIntArray168[local463] = local24.method1278();
			}
		}
		local4.anInt1758 = local225;
		local9.anInt1758 = local151;
		local14.anInt1758 = local166;
		local19.anInt1758 = local193;
		local24.anInt1758 = local175;
		local29.anInt1758 = local208;
		local34.anInt1758 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray35[local468] = (short) local4.method1270();
			if (local56 == 1) {
				this.aByteArray26[local468] = local9.method1248();
			}
			if (local60 == 255) {
				this.aByteArray21[local468] = local14.method1248();
			}
			if (local64 == 1) {
				this.aByteArray25[local468] = local19.method1248();
			}
			if (local68 == 1) {
				this.anIntArray167[local468] = local24.method1278();
			}
			if (local72 == 1) {
				this.aShortArray32[local468] = (short) (local29.method1270() - 1);
			}
			if (this.aByteArray23 != null) {
				if (this.aShortArray32[local468] == -1) {
					this.aByteArray23[local468] = -1;
				} else {
					this.aByteArray23[local468] = (byte) (local34.method1278() - 1);
				}
			}
		}
		local4.anInt1758 = local202;
		local9.anInt1758 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1278();
			if (local683 == 1) {
				local470 = local4.method1291() + local676;
				local480 = local4.method1291() + local470;
				local490 = local4.method1291() + local480;
				local676 = local490;
				this.anIntArray173[local678] = local470;
				this.anIntArray174[local678] = local480;
				this.anIntArray172[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1291() + local676;
				local676 = local490;
				this.anIntArray173[local678] = local470;
				this.anIntArray174[local678] = local480;
				this.anIntArray172[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1291() + local676;
				local676 = local490;
				this.anIntArray173[local678] = local470;
				this.anIntArray174[local678] = local480;
				this.anIntArray172[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1291() + local676;
				local676 = local490;
				this.anIntArray173[local678] = local470;
				this.anIntArray174[local678] = local786;
				this.anIntArray172[local678] = local490;
			}
		}
		local4.anInt1758 = local251;
		local9.anInt1758 = local259;
		local14.anInt1758 = local267;
		local19.anInt1758 = local275;
		local24.anInt1758 = local281;
		local29.anInt1758 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray27[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray34[local683] = (short) local4.method1270();
				this.aShortArray39[local683] = (short) local4.method1270();
				this.aShortArray36[local683] = (short) local4.method1270();
			}
			if (local786 == 1) {
				this.aShortArray34[local683] = (short) local9.method1270();
				this.aShortArray39[local683] = (short) local9.method1270();
				this.aShortArray36[local683] = (short) local9.method1270();
				this.aShortArray33[local683] = (short) local14.method1270();
				this.aShortArray37[local683] = (short) local14.method1270();
				this.aShortArray38[local683] = (short) local14.method1270();
				this.aByteArray24[local683] = local19.method1248();
				this.aByteArray28[local683] = local24.method1248();
				this.aByteArray22[local683] = local29.method1248();
			}
			if (local786 == 2) {
				this.aShortArray34[local683] = (short) local9.method1270();
				this.aShortArray39[local683] = (short) local9.method1270();
				this.aShortArray36[local683] = (short) local9.method1270();
				this.aShortArray33[local683] = (short) local14.method1270();
				this.aShortArray37[local683] = (short) local14.method1270();
				this.aShortArray38[local683] = (short) local14.method1270();
				this.aByteArray24[local683] = local19.method1248();
				this.aByteArray28[local683] = local24.method1248();
				this.aByteArray22[local683] = local29.method1248();
				this.aByteArray20[local683] = local29.method1248();
				this.aByteArray19[local683] = local29.method1248();
			}
			if (local786 == 3) {
				this.aShortArray34[local683] = (short) local9.method1270();
				this.aShortArray39[local683] = (short) local9.method1270();
				this.aShortArray36[local683] = (short) local9.method1270();
				this.aShortArray33[local683] = (short) local14.method1270();
				this.aShortArray37[local683] = (short) local14.method1270();
				this.aShortArray38[local683] = (short) local14.method1270();
				this.aByteArray24[local683] = local19.method1248();
				this.aByteArray28[local683] = local24.method1248();
				this.aByteArray22[local683] = local29.method1248();
			}
		}
		local4.anInt1758 = local113;
		local786 = local4.method1278();
		if (local786 != 0) {
			local4.method1270();
			local4.method1270();
			local4.method1270();
			local4.method1245();
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(SS)V")
	public void method1793(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray32 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2509; local5++) {
			if (this.aShortArray32[local5] == arg0) {
				this.aShortArray32[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "i", descriptor = "()V")
	public void method1794() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2512; local1++) {
			this.anIntArray165[local1] = -this.anIntArray165[local1];
			this.anIntArray175[local1] = -this.anIntArray175[local1];
		}
		this.method1786();
	}

	@OriginalMember(owner = "client!md", name = "j", descriptor = "()V")
	public void method1795() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray168 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2512; local9++) {
				local15 = this.anIntArray168[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray20 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray20[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2512) {
				local65 = this.anIntArray168[local59];
				this.anIntArrayArray20[local65][local5[local65]++] = local59++;
			}
			this.anIntArray168 = null;
		}
		if (this.anIntArray167 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2509; local9++) {
			local15 = this.anIntArray167[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray19 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray19[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2509) {
			local65 = this.anIntArray167[local59];
			this.anIntArrayArray19[local65][local5[local65]++] = local59++;
		}
		this.anIntArray167 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!md;I)I")
	private int method1796(@OriginalArg(0) Class26_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray165[arg1];
		@Pc(11) int local11 = arg0.anIntArray170[arg1];
		@Pc(16) int local16 = arg0.anIntArray175[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2512; local18++) {
			if (local6 == this.anIntArray165[local18] && local11 == this.anIntArray170[local18] && local16 == this.anIntArray175[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray165[this.anInt2512] = local6;
			this.anIntArray170[this.anInt2512] = local11;
			this.anIntArray175[this.anInt2512] = local16;
			if (arg0.anIntArray168 != null) {
				this.anIntArray168[this.anInt2512] = arg0.anIntArray168[arg1];
			}
			local1 = this.anInt2512++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(III)V")
	public void method1797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2512; local1++) {
			this.anIntArray165[local1] += arg0;
			this.anIntArray170[local1] += arg1;
			this.anIntArray175[local1] += arg2;
		}
		this.method1786();
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IIIII)Lclient!wa;")
	public Class26_Sub6 method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class26_Sub6_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!md", name = "k", descriptor = "()V")
	public void method1799() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2512; local1++) {
			this.anIntArray175[local1] = -this.anIntArray175[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2509; local18++) {
			@Pc(24) int local24 = this.anIntArray173[local18];
			this.anIntArray173[local18] = this.anIntArray172[local18];
			this.anIntArray172[local18] = local24;
		}
		this.method1786();
	}

	@OriginalMember(owner = "client!md", name = "l", descriptor = "()V")
	private void method1800() {
		if (this.aBoolean126) {
			return;
		}
		this.aBoolean126 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2512; local20++) {
			@Pc(26) int local26 = this.anIntArray165[local20];
			@Pc(31) int local31 = this.anIntArray170[local20];
			@Pc(36) int local36 = this.anIntArray175[local20];
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
		this.aShort6 = (short) local8;
		this.aShort4 = (short) local14;
		this.aShort3 = (short) local10;
		this.aShort10 = (short) local16;
		this.aShort9 = (short) local12;
		this.aShort5 = (short) local18;
	}

	@OriginalMember(owner = "client!md", name = "m", descriptor = "()V")
	public void method1801() {
		if (this.aClass21Array2 != null) {
			return;
		}
		this.aClass21Array2 = new Class21[this.anInt2512];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2512; local10++) {
			this.aClass21Array2[local10] = new Class21();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2509; local25++) {
			@Pc(31) int local31 = this.anIntArray173[local25];
			@Pc(36) int local36 = this.anIntArray174[local25];
			@Pc(41) int local41 = this.anIntArray172[local25];
			@Pc(51) int local51 = this.anIntArray165[local36] - this.anIntArray165[local31];
			@Pc(61) int local61 = this.anIntArray170[local36] - this.anIntArray170[local31];
			@Pc(71) int local71 = this.anIntArray175[local36] - this.anIntArray175[local31];
			@Pc(81) int local81 = this.anIntArray165[local41] - this.anIntArray165[local31];
			@Pc(91) int local91 = this.anIntArray170[local41] - this.anIntArray170[local31];
			@Pc(101) int local101 = this.anIntArray175[local41] - this.anIntArray175[local31];
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
			if (this.aByteArray26 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray26[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class21 local211 = this.aClass21Array2[local31];
				local211.anInt717 += local109;
				local211.anInt716 += local117;
				local211.anInt723 += local125;
				local211.anInt720++;
				@Pc(240) Class21 local240 = this.aClass21Array2[local36];
				local240.anInt717 += local109;
				local240.anInt716 += local117;
				local240.anInt723 += local125;
				local240.anInt720++;
				@Pc(269) Class21 local269 = this.aClass21Array2[local41];
				local269.anInt717 += local109;
				local269.anInt716 += local117;
				local269.anInt723 += local125;
				local269.anInt720++;
			} else if (local198 == 1) {
				if (this.aClass54Array1 == null) {
					this.aClass54Array1 = new Class54[this.anInt2509];
				}
				@Pc(314) Class54 local314 = this.aClass54Array1[local25] = new Class54();
				local314.anInt2258 = local109;
				local314.anInt2260 = local117;
				local314.anInt2259 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "()Z")
	@Override
	public boolean method2994() {
		return true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)Lclient!m;")
	@Override
	public Class26 method2992() {
		return this.method1798(this.aShort8, this.aShort7, -50, -10, -50);
	}
}
