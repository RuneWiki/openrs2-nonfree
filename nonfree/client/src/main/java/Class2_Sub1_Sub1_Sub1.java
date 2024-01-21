import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "[S")
	public short[] aShortArray9;

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!cb", name = "kb", descriptor = "S")
	public short aShort8;

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "[Lclient!ba;")
	public Class7[] aClass7Array1;

	@OriginalMember(owner = "client!cb", name = "qb", descriptor = "[Lclient!va;")
	public Class87[] aClass87Array1;

	@OriginalMember(owner = "client!cb", name = "rb", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!cb", name = "tb", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!cb", name = "ub", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!cb", name = "vb", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!cb", name = "wb", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!cb", name = "xb", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!cb", name = "yb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!cb", name = "zb", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cb", name = "Ab", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!cb", name = "Bb", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!cb", name = "Cb", descriptor = "[Lclient!ba;")
	public Class7[] aClass7Array2;

	@OriginalMember(owner = "client!cb", name = "Db", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!cb", name = "Eb", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!cb", name = "Gb", descriptor = "I")
	public int anInt733;

	@OriginalMember(owner = "client!cb", name = "Hb", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!cb", name = "Jb", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
	public int anInt731 = 0;

	@OriginalMember(owner = "client!cb", name = "ob", descriptor = "I")
	public int anInt732 = 0;

	@OriginalMember(owner = "client!cb", name = "Ib", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!cb", name = "Fb", descriptor = "B")
	public byte aByte1 = 0;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	private Class2_Sub1_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method573(arg0);
		} else {
			this.method590(arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([Lclient!cb;I)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) Class2_Sub1_Sub1_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt732 = 0;
		this.anInt731 = 0;
		this.anInt733 = 0;
		this.aByte1 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class2_Sub1_Sub1_Sub1 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt732 += local44.anInt732;
				this.anInt731 += local44.anInt731;
				this.anInt733 += local44.anInt733;
				if (local44.aByteArray12 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local44.aByte1;
					}
					if (this.aByte1 != local44.aByte1) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray8 != null;
				local19 |= local44.aByteArray14 != null;
				local21 |= local44.anIntArray77 != null;
				local23 |= local44.aShortArray8 != null;
				local25 |= local44.aByteArray9 != null;
			}
		}
		this.anIntArray69 = new int[this.anInt732];
		this.anIntArray71 = new int[this.anInt732];
		this.anIntArray66 = new int[this.anInt732];
		this.anIntArray68 = new int[this.anInt732];
		this.anIntArray72 = new int[this.anInt731];
		this.anIntArray76 = new int[this.anInt731];
		this.anIntArray75 = new int[this.anInt731];
		if (local15) {
			this.aByteArray8 = new byte[this.anInt731];
		}
		if (local17) {
			this.aByteArray12 = new byte[this.anInt731];
		}
		if (local19) {
			this.aByteArray14 = new byte[this.anInt731];
		}
		if (local21) {
			this.anIntArray77 = new int[this.anInt731];
		}
		if (local23) {
			this.aShortArray8 = new short[this.anInt731];
		}
		if (local25) {
			this.aByteArray9 = new byte[this.anInt731];
		}
		this.aShortArray11 = new short[this.anInt731];
		if (this.anInt733 > 0) {
			this.aByteArray5 = new byte[this.anInt733];
			this.aShortArray12 = new short[this.anInt733];
			this.aShortArray10 = new short[this.anInt733];
			this.aShortArray9 = new short[this.anInt733];
			this.aShortArray7 = new short[this.anInt733];
			this.aShortArray13 = new short[this.anInt733];
			this.aShortArray6 = new short[this.anInt733];
			this.aByteArray11 = new byte[this.anInt733];
			this.aByteArray13 = new byte[this.anInt733];
			this.aByteArray7 = new byte[this.anInt733];
			this.aByteArray10 = new byte[this.anInt733];
			this.aByteArray6 = new byte[this.anInt733];
		}
		this.anInt732 = 0;
		this.anInt731 = 0;
		this.anInt733 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class2_Sub1_Sub1_Sub1 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt731; local302++) {
					if (local15 && local298.aByteArray8 != null) {
						this.aByteArray8[this.anInt731] = local298.aByteArray8[local302];
					}
					if (local17) {
						if (local298.aByteArray12 == null) {
							this.aByteArray12[this.anInt731] = local298.aByte1;
						} else {
							this.aByteArray12[this.anInt731] = local298.aByteArray12[local302];
						}
					}
					if (local19 && local298.aByteArray14 != null) {
						this.aByteArray14[this.anInt731] = local298.aByteArray14[local302];
					}
					if (local21 && local298.anIntArray77 != null) {
						this.anIntArray77[this.anInt731] = local298.anIntArray77[local302];
					}
					if (local23) {
						if (local298.aShortArray8 == null) {
							this.aShortArray8[this.anInt731] = -1;
						} else {
							this.aShortArray8[this.anInt731] = local298.aShortArray8[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray9 == null || local298.aByteArray9[local302] == -1) {
							this.aByteArray9[this.anInt731] = -1;
						} else {
							this.aByteArray9[this.anInt731] = (byte) (local298.aByteArray9[local302] + this.anInt733);
						}
					}
					this.aShortArray11[this.anInt731] = local298.aShortArray11[local302];
					this.anIntArray72[this.anInt731] = this.method580(local298, local298.anIntArray72[local302]);
					this.anIntArray76[this.anInt731] = this.method580(local298, local298.anIntArray76[local302]);
					this.anIntArray75[this.anInt731] = this.method580(local298, local298.anIntArray75[local302]);
					this.anInt731++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt733; local477++) {
					@Pc(489) byte local489 = this.aByteArray5[this.anInt733] = local298.aByteArray5[local477];
					if (local489 == 0) {
						this.aShortArray12[this.anInt733] = (short) this.method580(local298, local298.aShortArray12[local477]);
						this.aShortArray10[this.anInt733] = (short) this.method580(local298, local298.aShortArray10[local477]);
						this.aShortArray9[this.anInt733] = (short) this.method580(local298, local298.aShortArray9[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray12[this.anInt733] = local298.aShortArray12[local477];
						this.aShortArray10[this.anInt733] = local298.aShortArray10[local477];
						this.aShortArray9[this.anInt733] = local298.aShortArray9[local477];
						this.aShortArray7[this.anInt733] = local298.aShortArray7[local477];
						this.aShortArray13[this.anInt733] = local298.aShortArray13[local477];
						this.aShortArray6[this.anInt733] = local298.aShortArray6[local477];
						this.aByteArray11[this.anInt733] = local298.aByteArray11[local477];
						this.aByteArray13[this.anInt733] = local298.aByteArray13[local477];
						this.aByteArray7[this.anInt733] = local298.aByteArray7[local477];
					}
					if (local489 == 2) {
						this.aByteArray10[this.anInt733] = local298.aByteArray10[local477];
						this.aByteArray6[this.anInt733] = local298.aByteArray6[local477];
					}
					this.anInt733++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!cb;ZZZZ)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) Class2_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt732 = arg0.anInt732;
		this.anInt731 = arg0.anInt731;
		this.anInt733 = arg0.anInt733;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray69 = arg0.anIntArray69;
			this.anIntArray71 = arg0.anIntArray71;
			this.anIntArray66 = arg0.anIntArray66;
		} else {
			this.anIntArray69 = new int[this.anInt732];
			this.anIntArray71 = new int[this.anInt732];
			this.anIntArray66 = new int[this.anInt732];
			for (local57 = 0; local57 < this.anInt732; local57++) {
				this.anIntArray69[local57] = arg0.anIntArray69[local57];
				this.anIntArray71[local57] = arg0.anIntArray71[local57];
				this.anIntArray66[local57] = arg0.anIntArray66[local57];
			}
		}
		if (arg2) {
			this.aShortArray11 = arg0.aShortArray11;
		} else {
			this.aShortArray11 = new short[this.anInt731];
			for (local57 = 0; local57 < this.anInt731; local57++) {
				this.aShortArray11[local57] = arg0.aShortArray11[local57];
			}
		}
		if (arg3 || arg0.aShortArray8 == null) {
			this.aShortArray8 = arg0.aShortArray8;
		} else {
			this.aShortArray8 = new short[this.anInt731];
			for (local57 = 0; local57 < this.anInt731; local57++) {
				this.aShortArray8[local57] = arg0.aShortArray8[local57];
			}
		}
		this.aByteArray14 = arg0.aByteArray14;
		this.anIntArray72 = arg0.anIntArray72;
		this.anIntArray76 = arg0.anIntArray76;
		this.anIntArray75 = arg0.anIntArray75;
		this.aByteArray8 = arg0.aByteArray8;
		this.aByteArray12 = arg0.aByteArray12;
		this.aByteArray9 = arg0.aByteArray9;
		this.aByte1 = arg0.aByte1;
		this.aByteArray5 = arg0.aByteArray5;
		this.aShortArray12 = arg0.aShortArray12;
		this.aShortArray10 = arg0.aShortArray10;
		this.aShortArray9 = arg0.aShortArray9;
		this.aShortArray7 = arg0.aShortArray7;
		this.aShortArray13 = arg0.aShortArray13;
		this.aShortArray6 = arg0.aShortArray6;
		this.aByteArray11 = arg0.aByteArray11;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByteArray7 = arg0.aByteArray7;
		this.aByteArray10 = arg0.aByteArray10;
		this.aByteArray6 = arg0.aByteArray6;
		this.anIntArray68 = arg0.anIntArray68;
		this.anIntArray77 = arg0.anIntArray77;
		this.anIntArrayArray5 = arg0.anIntArrayArray5;
		this.anIntArrayArray6 = arg0.anIntArrayArray6;
		this.aClass7Array1 = arg0.aClass7Array1;
		this.aClass87Array1 = arg0.aClass87Array1;
		this.aClass7Array2 = arg0.aClass7Array2;
		this.aShort6 = arg0.aShort6;
		this.aShort8 = arg0.aShort8;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([B)V")
	private void method573(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub3 local4 = new Class2_Sub3(arg0);
		@Pc(9) Class2_Sub3 local9 = new Class2_Sub3(arg0);
		@Pc(14) Class2_Sub3 local14 = new Class2_Sub3(arg0);
		@Pc(19) Class2_Sub3 local19 = new Class2_Sub3(arg0);
		@Pc(24) Class2_Sub3 local24 = new Class2_Sub3(arg0);
		@Pc(29) Class2_Sub3 local29 = new Class2_Sub3(arg0);
		@Pc(34) Class2_Sub3 local34 = new Class2_Sub3(arg0);
		local4.anInt273 = arg0.length - 23;
		@Pc(44) int local44 = local4.method234();
		@Pc(48) int local48 = local4.method234();
		@Pc(52) int local52 = local4.method218();
		@Pc(56) int local56 = local4.method218();
		@Pc(60) int local60 = local4.method218();
		@Pc(64) int local64 = local4.method218();
		@Pc(68) int local68 = local4.method218();
		@Pc(72) int local72 = local4.method218();
		@Pc(76) int local76 = local4.method218();
		@Pc(80) int local80 = local4.method234();
		@Pc(84) int local84 = local4.method234();
		@Pc(88) int local88 = local4.method234();
		@Pc(92) int local92 = local4.method234();
		@Pc(96) int local96 = local4.method234();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray5 = new byte[local52];
			local4.anInt273 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray5[local113] = local4.method227();
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
		this.anInt732 = local44;
		this.anInt731 = local48;
		this.anInt733 = local52;
		this.anIntArray69 = new int[local44];
		this.anIntArray71 = new int[local44];
		this.anIntArray66 = new int[local44];
		this.anIntArray72 = new int[local48];
		this.anIntArray76 = new int[local48];
		this.anIntArray75 = new int[local48];
		if (local76 == 1) {
			this.anIntArray68 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray8 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray12 = new byte[local48];
		} else {
			this.aByte1 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray14 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray77 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray8 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray9 = new byte[local48];
		}
		this.aShortArray11 = new short[local48];
		if (local52 > 0) {
			this.aShortArray12 = new short[local52];
			this.aShortArray10 = new short[local52];
			this.aShortArray9 = new short[local52];
			if (local100 > 0) {
				this.aShortArray7 = new short[local100];
				this.aShortArray13 = new short[local100];
				this.aShortArray6 = new short[local100];
				this.aByteArray11 = new byte[local100];
				this.aByteArray13 = new byte[local100];
				this.aByteArray7 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray10 = new byte[local102];
				this.aByteArray6 = new byte[local102];
			}
		}
		local4.anInt273 = local52;
		local9.anInt273 = local233;
		local14.anInt273 = local239;
		local19.anInt273 = local245;
		local24.anInt273 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method218();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method217();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method217();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method217();
			}
			this.anIntArray69[local463] = local457 + local470;
			this.anIntArray71[local463] = local459 + local480;
			this.anIntArray66[local463] = local461 + local490;
			local457 = this.anIntArray69[local463];
			local459 = this.anIntArray71[local463];
			local461 = this.anIntArray66[local463];
			if (local76 == 1) {
				this.anIntArray68[local463] = local24.method218();
			}
		}
		local4.anInt273 = local225;
		local9.anInt273 = local151;
		local14.anInt273 = local166;
		local19.anInt273 = local193;
		local24.anInt273 = local175;
		local29.anInt273 = local208;
		local34.anInt273 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray11[local468] = (short) local4.method234();
			if (local56 == 1) {
				this.aByteArray8[local468] = local9.method227();
			}
			if (local60 == 255) {
				this.aByteArray12[local468] = local14.method227();
			}
			if (local64 == 1) {
				this.aByteArray14[local468] = local19.method227();
			}
			if (local68 == 1) {
				this.anIntArray77[local468] = local24.method218();
			}
			if (local72 == 1) {
				this.aShortArray8[local468] = (short) (local29.method234() - 1);
			}
			if (this.aByteArray9 != null) {
				if (this.aShortArray8[local468] == -1) {
					this.aByteArray9[local468] = -1;
				} else {
					this.aByteArray9[local468] = (byte) (local34.method218() - 1);
				}
			}
		}
		local4.anInt273 = local202;
		local9.anInt273 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method218();
			if (local683 == 1) {
				local470 = local4.method217() + local676;
				local480 = local4.method217() + local470;
				local490 = local4.method217() + local480;
				local676 = local490;
				this.anIntArray72[local678] = local470;
				this.anIntArray76[local678] = local480;
				this.anIntArray75[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method217() + local676;
				local676 = local490;
				this.anIntArray72[local678] = local470;
				this.anIntArray76[local678] = local480;
				this.anIntArray75[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method217() + local676;
				local676 = local490;
				this.anIntArray72[local678] = local470;
				this.anIntArray76[local678] = local480;
				this.anIntArray75[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method217() + local676;
				local676 = local490;
				this.anIntArray72[local678] = local470;
				this.anIntArray76[local678] = local786;
				this.anIntArray75[local678] = local490;
			}
		}
		local4.anInt273 = local251;
		local9.anInt273 = local259;
		local14.anInt273 = local267;
		local19.anInt273 = local275;
		local24.anInt273 = local281;
		local29.anInt273 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray5[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray12[local683] = (short) local4.method234();
				this.aShortArray10[local683] = (short) local4.method234();
				this.aShortArray9[local683] = (short) local4.method234();
			}
			if (local786 == 1) {
				this.aShortArray12[local683] = (short) local9.method234();
				this.aShortArray10[local683] = (short) local9.method234();
				this.aShortArray9[local683] = (short) local9.method234();
				this.aShortArray7[local683] = (short) local14.method234();
				this.aShortArray13[local683] = (short) local14.method234();
				this.aShortArray6[local683] = (short) local14.method234();
				this.aByteArray11[local683] = local19.method227();
				this.aByteArray13[local683] = local24.method227();
				this.aByteArray7[local683] = local29.method227();
			}
			if (local786 == 2) {
				this.aShortArray12[local683] = (short) local9.method234();
				this.aShortArray10[local683] = (short) local9.method234();
				this.aShortArray9[local683] = (short) local9.method234();
				this.aShortArray7[local683] = (short) local14.method234();
				this.aShortArray13[local683] = (short) local14.method234();
				this.aShortArray6[local683] = (short) local14.method234();
				this.aByteArray11[local683] = local19.method227();
				this.aByteArray13[local683] = local24.method227();
				this.aByteArray7[local683] = local29.method227();
				this.aByteArray10[local683] = local29.method227();
				this.aByteArray6[local683] = local29.method227();
			}
			if (local786 == 3) {
				this.aShortArray12[local683] = (short) local9.method234();
				this.aShortArray10[local683] = (short) local9.method234();
				this.aShortArray9[local683] = (short) local9.method234();
				this.aShortArray7[local683] = (short) local14.method234();
				this.aShortArray13[local683] = (short) local14.method234();
				this.aShortArray6[local683] = (short) local14.method234();
				this.aByteArray11[local683] = local19.method227();
				this.aByteArray13[local683] = local24.method227();
				this.aByteArray7[local683] = local29.method227();
			}
		}
		local4.anInt273 = local113;
		local786 = local4.method218();
		if (local786 == 0) {
			return;
		}
		new Class75();
		local4.method234();
		local4.method234();
		local4.method234();
		local4.method206();
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
	public void method574() {
		@Pc(3) int local3 = Static23.anIntArray73[256];
		@Pc(7) int local7 = Static23.anIntArray67[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt732; local9++) {
			@Pc(26) int local26 = this.anIntArray66[local9] * local3 + this.anIntArray69[local9] * local7 >> 16;
			this.anIntArray66[local9] = this.anIntArray66[local9] * local7 - this.anIntArray69[local9] * local3 >> 16;
			this.anIntArray69[local9] = local26;
		}
		this.method589();
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()V")
	private void method575() {
		if (this.aBoolean25) {
			return;
		}
		this.aBoolean25 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt732; local20++) {
			@Pc(26) int local26 = this.anIntArray69[local20];
			@Pc(31) int local31 = this.anIntArray71[local20];
			@Pc(36) int local36 = this.anIntArray66[local20];
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
		this.aShort10 = (short) local8;
		this.aShort3 = (short) local14;
		this.aShort9 = (short) local10;
		this.aShort4 = (short) local16;
		this.aShort7 = (short) local12;
		this.aShort5 = (short) local18;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(SS)V")
	public void method576(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray8 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt731; local5++) {
			if (this.aShortArray8[local5] == arg0) {
				this.aShortArray8[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
	public void method577() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			@Pc(7) int local7 = this.anIntArray69[local1];
			this.anIntArray69[local1] = this.anIntArray66[local1];
			this.anIntArray66[local1] = -local7;
		}
		this.method589();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([[IIIIZIZ)Lclient!cb;")
	public Class2_Sub1_Sub1_Sub1 method579(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method575();
		@Pc(6) int local6 = arg1 + this.aShort10;
		@Pc(11) int local11 = arg1 + this.aShort3;
		@Pc(16) int local16 = arg3 + this.aShort7;
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
		@Pc(101) Class2_Sub1_Sub1_Sub1 local101 = new Class2_Sub1_Sub1_Sub1();
		local101.anInt732 = this.anInt732;
		local101.anInt731 = this.anInt731;
		local101.anInt733 = this.anInt733;
		local101.anIntArray69 = this.anIntArray69;
		local101.anIntArray66 = this.anIntArray66;
		local101.anIntArray72 = this.anIntArray72;
		local101.anIntArray76 = this.anIntArray76;
		local101.anIntArray75 = this.anIntArray75;
		local101.aByteArray8 = this.aByteArray8;
		local101.aByteArray12 = this.aByteArray12;
		local101.aByteArray14 = this.aByteArray14;
		local101.aByteArray9 = this.aByteArray9;
		local101.aShortArray11 = this.aShortArray11;
		local101.aShortArray8 = this.aShortArray8;
		local101.aByte1 = this.aByte1;
		local101.aByteArray5 = this.aByteArray5;
		local101.aShortArray12 = this.aShortArray12;
		local101.aShortArray10 = this.aShortArray10;
		local101.aShortArray9 = this.aShortArray9;
		local101.aShortArray7 = this.aShortArray7;
		local101.aShortArray13 = this.aShortArray13;
		local101.aShortArray6 = this.aShortArray6;
		local101.aByteArray11 = this.aByteArray11;
		local101.aByteArray13 = this.aByteArray13;
		local101.aByteArray7 = this.aByteArray7;
		local101.aByteArray10 = this.aByteArray10;
		local101.aByteArray6 = this.aByteArray6;
		local101.anIntArray68 = this.anIntArray68;
		local101.anIntArray77 = this.anIntArray77;
		local101.anIntArrayArray5 = this.anIntArrayArray5;
		local101.anIntArrayArray6 = this.anIntArrayArray6;
		local101.aShort6 = this.aShort6;
		local101.aShort8 = this.aShort8;
		local101.aClass7Array1 = this.aClass7Array1;
		local101.aClass87Array1 = this.aClass87Array1;
		local101.aClass7Array2 = this.aClass7Array2;
		local101.anIntArray71 = new int[local101.anInt732];
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
			for (local257 = 0; local257 < local101.anInt732; local257++) {
				local265 = this.anIntArray69[local257] + arg1;
				local272 = this.anIntArray66[local257] + arg3;
				local276 = local265 & 0x7F;
				local280 = local272 & 0x7F;
				local284 = local265 >> 7;
				local288 = local272 >> 7;
				local310 = arg0[local284][local288] * (128 - local276) + arg0[local284 + 1][local288] * local276 >> 7;
				local336 = arg0[local284][local288 + 1] * (128 - local276) + arg0[local284 + 1][local288 + 1] * local276 >> 7;
				local348 = local310 * (128 - local280) + local336 * local280 >> 7;
				local101.anIntArray71[local257] = this.anIntArray71[local257] + local348 - arg2;
			}
		} else {
			for (local257 = 0; local257 < local101.anInt732; local257++) {
				local265 = (this.anIntArray71[local257] << 16) / this.aShort9;
				if (local265 < arg4) {
					local272 = this.anIntArray69[local257] + arg1;
					local276 = this.anIntArray66[local257] + arg3;
					local280 = local272 & 0x7F;
					local284 = local276 & 0x7F;
					local288 = local272 >> 7;
					local310 = local276 >> 7;
					local336 = arg0[local288][local310] * (128 - local280) + arg0[local288 + 1][local310] * local280 >> 7;
					local348 = arg0[local288][local310 + 1] * (128 - local280) + arg0[local288 + 1][local310 + 1] * local280 >> 7;
					@Pc(472) int local472 = local336 * (128 - local284) + local348 * local284 >> 7;
					local101.anIntArray71[local257] = this.anIntArray71[local257] + (local472 - arg2) * (arg4 - local265) / arg4;
				} else {
					local101.anIntArray71[local257] = this.anIntArray71[local257];
				}
			}
		}
		this.aBoolean25 = false;
		return local101;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)Lclient!aa;")
	@Override
	public Class2_Sub1_Sub1 method3177() {
		return this.method595(this.aShort6, this.aShort8, -50, -10, -50);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()Z")
	@Override
	public boolean method3178() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!cb;I)I")
	private int method580(@OriginalArg(0) Class2_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray69[arg1];
		@Pc(11) int local11 = arg0.anIntArray71[arg1];
		@Pc(16) int local16 = arg0.anIntArray66[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt732; local18++) {
			if (local6 == this.anIntArray69[local18] && local11 == this.anIntArray71[local18] && local16 == this.anIntArray66[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray69[this.anInt732] = local6;
			this.anIntArray71[this.anInt732] = local11;
			this.anIntArray66[this.anInt732] = local16;
			if (arg0.anIntArray68 != null) {
				this.anIntArray68[this.anInt732] = arg0.anIntArray68[arg1];
			}
			local1 = this.anInt732++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)Lclient!he;")
	public Class2_Sub1_Sub1_Sub4_Sub1 method581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class2_Sub1_Sub1_Sub4_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(III)V")
	public void method582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			this.anIntArray69[local1] += arg0;
			this.anIntArray71[local1] += arg1;
			this.anIntArray66[local1] += arg2;
		}
		this.method589();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "()V")
	public void method583() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			@Pc(7) int local7 = this.anIntArray66[local1];
			this.anIntArray66[local1] = this.anIntArray69[local1];
			this.anIntArray69[local1] = -local7;
		}
		this.method589();
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "()Lclient!cb;")
	public Class2_Sub1_Sub1_Sub1 method584() {
		@Pc(3) Class2_Sub1_Sub1_Sub1 local3 = new Class2_Sub1_Sub1_Sub1();
		if (this.aByteArray8 != null) {
			local3.aByteArray8 = new byte[this.anInt731];
			for (@Pc(13) int local13 = 0; local13 < this.anInt731; local13++) {
				local3.aByteArray8[local13] = this.aByteArray8[local13];
			}
		}
		local3.anInt732 = this.anInt732;
		local3.anInt731 = this.anInt731;
		local3.anInt733 = this.anInt733;
		local3.anIntArray69 = this.anIntArray69;
		local3.anIntArray71 = this.anIntArray71;
		local3.anIntArray66 = this.anIntArray66;
		local3.anIntArray72 = this.anIntArray72;
		local3.anIntArray76 = this.anIntArray76;
		local3.anIntArray75 = this.anIntArray75;
		local3.aByteArray12 = this.aByteArray12;
		local3.aByteArray14 = this.aByteArray14;
		local3.aByteArray9 = this.aByteArray9;
		local3.aShortArray11 = this.aShortArray11;
		local3.aShortArray8 = this.aShortArray8;
		local3.aByte1 = this.aByte1;
		local3.aByteArray5 = this.aByteArray5;
		local3.aShortArray12 = this.aShortArray12;
		local3.aShortArray10 = this.aShortArray10;
		local3.aShortArray9 = this.aShortArray9;
		local3.aShortArray7 = this.aShortArray7;
		local3.aShortArray13 = this.aShortArray13;
		local3.aShortArray6 = this.aShortArray6;
		local3.aByteArray11 = this.aByteArray11;
		local3.aByteArray13 = this.aByteArray13;
		local3.aByteArray7 = this.aByteArray7;
		local3.aByteArray10 = this.aByteArray10;
		local3.aByteArray6 = this.aByteArray6;
		local3.anIntArray68 = this.anIntArray68;
		local3.anIntArray77 = this.anIntArray77;
		local3.anIntArrayArray5 = this.anIntArrayArray5;
		local3.anIntArrayArray6 = this.anIntArrayArray6;
		local3.aClass7Array1 = this.aClass7Array1;
		local3.aClass87Array1 = this.aClass87Array1;
		local3.aShort6 = this.aShort6;
		local3.aShort8 = this.aShort8;
		return local3;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()I")
	@Override
	public int method3179() {
		if (!this.aBoolean25) {
			this.method575();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "()V")
	public void method585() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray68 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt732; local9++) {
				local15 = this.anIntArray68[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray5 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray5[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt732) {
				local65 = this.anIntArray68[local59];
				this.anIntArrayArray5[local65][local5[local65]++] = local59++;
			}
			this.anIntArray68 = null;
		}
		if (this.anIntArray77 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt731; local9++) {
			local15 = this.anIntArray77[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray6 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray6[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt731) {
			local65 = this.anIntArray77[local59];
			this.anIntArrayArray6[local65][local5[local65]++] = local59++;
		}
		this.anIntArray77 = null;
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "()V")
	public void method586() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			this.anIntArray66[local1] = -this.anIntArray66[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt731; local18++) {
			@Pc(24) int local24 = this.anIntArray72[local18];
			this.anIntArray72[local18] = this.anIntArray75[local18];
			this.anIntArray75[local18] = local24;
		}
		this.method589();
	}

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "()V")
	public void method587() {
		if (this.aClass7Array1 != null) {
			return;
		}
		this.aClass7Array1 = new Class7[this.anInt732];
		for (@Pc(10) int local10 = 0; local10 < this.anInt732; local10++) {
			this.aClass7Array1[local10] = new Class7();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt731; local25++) {
			@Pc(31) int local31 = this.anIntArray72[local25];
			@Pc(36) int local36 = this.anIntArray76[local25];
			@Pc(41) int local41 = this.anIntArray75[local25];
			@Pc(51) int local51 = this.anIntArray69[local36] - this.anIntArray69[local31];
			@Pc(61) int local61 = this.anIntArray71[local36] - this.anIntArray71[local31];
			@Pc(71) int local71 = this.anIntArray66[local36] - this.anIntArray66[local31];
			@Pc(81) int local81 = this.anIntArray69[local41] - this.anIntArray69[local31];
			@Pc(91) int local91 = this.anIntArray71[local41] - this.anIntArray71[local31];
			@Pc(101) int local101 = this.anIntArray66[local41] - this.anIntArray66[local31];
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
			if (this.aByteArray8 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray8[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class7 local211 = this.aClass7Array1[local31];
				local211.anInt390 += local109;
				local211.anInt391 += local117;
				local211.anInt388 += local125;
				local211.anInt389++;
				@Pc(240) Class7 local240 = this.aClass7Array1[local36];
				local240.anInt390 += local109;
				local240.anInt391 += local117;
				local240.anInt388 += local125;
				local240.anInt389++;
				@Pc(269) Class7 local269 = this.aClass7Array1[local41];
				local269.anInt390 += local109;
				local269.anInt391 += local117;
				local269.anInt388 += local125;
				local269.anInt389++;
			} else if (local198 == 1) {
				if (this.aClass87Array1 == null) {
					this.aClass87Array1 = new Class87[this.anInt731];
				}
				@Pc(314) Class87 local314 = this.aClass87Array1[local25] = new Class87();
				local314.anInt4445 = local109;
				local314.anInt4443 = local117;
				local314.anInt4442 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(SS)V")
	public void method588(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt731; local1++) {
			if (this.aShortArray11[local1] == arg0) {
				this.aShortArray11[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "()V")
	private void method589() {
		this.aClass7Array1 = null;
		this.aClass7Array2 = null;
		this.aClass87Array1 = null;
		this.aBoolean25 = false;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "([B)V")
	private void method590(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub3 local8 = new Class2_Sub3(arg0);
		@Pc(13) Class2_Sub3 local13 = new Class2_Sub3(arg0);
		@Pc(18) Class2_Sub3 local18 = new Class2_Sub3(arg0);
		@Pc(23) Class2_Sub3 local23 = new Class2_Sub3(arg0);
		@Pc(28) Class2_Sub3 local28 = new Class2_Sub3(arg0);
		local8.anInt273 = arg0.length - 18;
		@Pc(38) int local38 = local8.method234();
		@Pc(42) int local42 = local8.method234();
		@Pc(46) int local46 = local8.method218();
		@Pc(50) int local50 = local8.method218();
		@Pc(54) int local54 = local8.method218();
		@Pc(58) int local58 = local8.method218();
		@Pc(62) int local62 = local8.method218();
		@Pc(66) int local66 = local8.method218();
		@Pc(70) int local70 = local8.method234();
		@Pc(74) int local74 = local8.method234();
		@Pc(78) int local78 = local8.method234();
		@Pc(82) int local82 = local8.method234();
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
		this.anInt732 = local38;
		this.anInt731 = local42;
		this.anInt733 = local46;
		this.anIntArray69 = new int[local38];
		this.anIntArray71 = new int[local38];
		this.anIntArray66 = new int[local38];
		this.anIntArray72 = new int[local42];
		this.anIntArray76 = new int[local42];
		this.anIntArray75 = new int[local42];
		if (local46 > 0) {
			this.aByteArray5 = new byte[local46];
			this.aShortArray12 = new short[local46];
			this.aShortArray10 = new short[local46];
			this.aShortArray9 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray68 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray8 = new byte[local42];
			this.aByteArray9 = new byte[local42];
			this.aShortArray8 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray12 = new byte[local42];
		} else {
			this.aByte1 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray14 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray77 = new int[local42];
		}
		this.aShortArray11 = new short[local42];
		local8.anInt273 = 0;
		local13.anInt273 = local165;
		local18.anInt273 = local171;
		local23.anInt273 = local90;
		local28.anInt273 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method218();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method217();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method217();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method217();
			}
			this.anIntArray69[local307] = local301 + local314;
			this.anIntArray71[local307] = local303 + local324;
			this.anIntArray66[local307] = local305 + local334;
			local301 = this.anIntArray69[local307];
			local303 = this.anIntArray71[local307];
			local305 = this.anIntArray66[local307];
			if (local66 == 1) {
				this.anIntArray68[local307] = local28.method218();
			}
		}
		local8.anInt273 = local149;
		local13.anInt273 = local116;
		local18.anInt273 = local98;
		local23.anInt273 = local134;
		local28.anInt273 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray11[local312] = (short) local8.method234();
			if (local50 == 1) {
				local314 = local13.method218();
				if ((local314 & 0x1) == 1) {
					this.aByteArray8[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray8[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray9[local312] = (byte) (local314 >> 2);
					this.aShortArray8[local312] = this.aShortArray11[local312];
					this.aShortArray11[local312] = 127;
					if (this.aShortArray8[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray9[local312] = -1;
					this.aShortArray8[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray12[local312] = local18.method227();
			}
			if (local58 == 1) {
				this.aByteArray14[local312] = local23.method227();
			}
			if (local62 == 1) {
				this.anIntArray77[local312] = local28.method218();
			}
		}
		local8.anInt273 = local143;
		local13.anInt273 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method218();
			if (local543 == 1) {
				local314 = local8.method217() + local536;
				local324 = local8.method217() + local314;
				local334 = local8.method217() + local324;
				local536 = local334;
				this.anIntArray72[local538] = local314;
				this.anIntArray76[local538] = local324;
				this.anIntArray75[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method217() + local536;
				local536 = local334;
				this.anIntArray72[local538] = local314;
				this.anIntArray76[local538] = local324;
				this.anIntArray75[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method217() + local536;
				local536 = local334;
				this.anIntArray72[local538] = local314;
				this.anIntArray76[local538] = local324;
				this.anIntArray75[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method217() + local536;
				local536 = local334;
				this.anIntArray72[local538] = local314;
				this.anIntArray76[local538] = local646;
				this.anIntArray75[local538] = local334;
			}
		}
		local8.anInt273 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray5[local543] = 0;
			this.aShortArray12[local543] = (short) local8.method234();
			this.aShortArray10[local543] = (short) local8.method234();
			this.aShortArray9[local543] = (short) local8.method234();
		}
		if (this.aByteArray9 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray9[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray12[local731] & 0xFFFF) == this.anIntArray72[local723] && (this.aShortArray10[local731] & 0xFFFF) == this.anIntArray76[local723] && (this.aShortArray9[local731] & 0xFFFF) == this.anIntArray75[local723]) {
						this.aByteArray9[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray9 = null;
			}
		}
		if (!local3) {
			this.aShortArray8 = null;
		}
		if (!local1) {
			this.aByteArray8 = null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "()V")
	public void method591() {
		this.anIntArray68 = null;
		this.anIntArray77 = null;
		this.anIntArrayArray5 = null;
		this.anIntArrayArray6 = null;
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "()V")
	public void method592() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			this.anIntArray69[local1] = -this.anIntArray69[local1];
			this.anIntArray66[local1] = -this.anIntArray66[local1];
		}
		this.method589();
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(III)V")
	public void method593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt732; local1++) {
			this.anIntArray69[local1] = this.anIntArray69[local1] * arg0 / 128;
			this.anIntArray71[local1] = this.anIntArray71[local1] * arg1 / 128;
			this.anIntArray66[local1] = this.anIntArray66[local1] * arg2 / 128;
		}
		this.method589();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIII)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class2_Sub1_Sub1_Sub4_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!aa;IIIZ)V")
	@Override
	public void method3176(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class2_Sub1_Sub1_Sub1 local2 = (Class2_Sub1_Sub1_Sub1) arg0;
		local2.method575();
		local2.method587();
		Static23.anInt734++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray69;
		@Pc(18) int local18 = local2.anInt732;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt732; local20++) {
			@Pc(26) Class7 local26 = this.aClass7Array1[local20];
			if (local26.anInt389 != 0) {
				local36 = this.anIntArray71[local20] - arg2;
				if (local36 >= local2.aShort9 && local36 <= local2.aShort4) {
					@Pc(52) int local52 = this.anIntArray69[local20] - arg1;
					if (local52 >= local2.aShort10 && local52 <= local2.aShort3) {
						@Pc(68) int local68 = this.anIntArray66[local20] - arg3;
						if (local68 >= local2.aShort7 && local68 <= local2.aShort5) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class7 local85 = local2.aClass7Array1[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray66[local79] && local36 == local2.anIntArray71[local79] && local85.anInt389 != 0) {
									if (this.aClass7Array2 == null) {
										this.aClass7Array2 = new Class7[this.anInt732];
									}
									if (local2.aClass7Array2 == null) {
										local2.aClass7Array2 = new Class7[local18];
									}
									@Pc(125) Class7 local125 = this.aClass7Array2[local20];
									if (local125 == null) {
										local125 = this.aClass7Array2[local20] = new Class7(local26);
									}
									@Pc(142) Class7 local142 = local2.aClass7Array2[local79];
									if (local142 == null) {
										local142 = local2.aClass7Array2[local79] = new Class7(local85);
									}
									local125.anInt390 += local85.anInt390;
									local125.anInt391 += local85.anInt391;
									local125.anInt388 += local85.anInt388;
									local125.anInt389 += local85.anInt389;
									local142.anInt390 += local26.anInt390;
									local142.anInt391 += local26.anInt391;
									local142.anInt388 += local26.anInt388;
									local142.anInt389 += local26.anInt389;
									local12++;
									Static23.anIntArray70[local20] = Static23.anInt734;
									Static23.anIntArray74[local79] = Static23.anInt734;
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
		for (@Pc(236) int local236 = 0; local236 < this.anInt731; local236++) {
			if (Static23.anIntArray70[this.anIntArray72[local236]] == Static23.anInt734 && Static23.anIntArray70[this.anIntArray76[local236]] == Static23.anInt734 && Static23.anIntArray70[this.anIntArray75[local236]] == Static23.anInt734) {
				if (this.aByteArray8 == null) {
					this.aByteArray8 = new byte[this.anInt731];
				}
				this.aByteArray8[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt731; local36++) {
			if (Static23.anIntArray74[local2.anIntArray72[local36]] == Static23.anInt734 && Static23.anIntArray74[local2.anIntArray76[local36]] == Static23.anInt734 && Static23.anIntArray74[local2.anIntArray75[local36]] == Static23.anInt734) {
				if (local2.aByteArray8 == null) {
					local2.aByteArray8 = new byte[local2.anInt731];
				}
				local2.aByteArray8[local36] = 2;
			}
		}
	}
}
