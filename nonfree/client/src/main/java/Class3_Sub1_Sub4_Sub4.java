import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class3_Sub1_Sub4_Sub4 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!lb", name = "bb", descriptor = "[Lclient!ch;")
	public Class15[] aClass15Array1;

	@OriginalMember(owner = "client!lb", name = "cb", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!lb", name = "db", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!lb", name = "gb", descriptor = "[I")
	public int[] anIntArray206;

	@OriginalMember(owner = "client!lb", name = "hb", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!lb", name = "jb", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!lb", name = "kb", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!lb", name = "lb", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!lb", name = "mb", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!lb", name = "ob", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!lb", name = "pb", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!lb", name = "rb", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!lb", name = "sb", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!lb", name = "ub", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!lb", name = "vb", descriptor = "I")
	public int anInt1999;

	@OriginalMember(owner = "client!lb", name = "xb", descriptor = "S")
	public short aShort8;

	@OriginalMember(owner = "client!lb", name = "yb", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!lb", name = "zb", descriptor = "[Lclient!ch;")
	public Class15[] aClass15Array2;

	@OriginalMember(owner = "client!lb", name = "Bb", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!lb", name = "Cb", descriptor = "S")
	public short aShort9;

	@OriginalMember(owner = "client!lb", name = "Db", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!lb", name = "Eb", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!lb", name = "Fb", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!lb", name = "Gb", descriptor = "S")
	public short aShort10;

	@OriginalMember(owner = "client!lb", name = "Hb", descriptor = "S")
	public short aShort11;

	@OriginalMember(owner = "client!lb", name = "Ib", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!lb", name = "Jb", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!lb", name = "Kb", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!lb", name = "Lb", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!lb", name = "Mb", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!lb", name = "Nb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!lb", name = "Ob", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!lb", name = "Pb", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!lb", name = "Qb", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!lb", name = "Rb", descriptor = "[Lclient!bc;")
	public Class9[] aClass9Array1;

	@OriginalMember(owner = "client!lb", name = "Sb", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!lb", name = "Ub", descriptor = "S")
	public short aShort12;

	@OriginalMember(owner = "client!lb", name = "Vb", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
	public int anInt1996 = 0;

	@OriginalMember(owner = "client!lb", name = "qb", descriptor = "I")
	public int anInt1998 = 0;

	@OriginalMember(owner = "client!lb", name = "tb", descriptor = "B")
	public byte aByte5 = 0;

	@OriginalMember(owner = "client!lb", name = "Tb", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	private Class3_Sub1_Sub4_Sub4() {
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub4_Sub4(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1561(arg0);
		} else {
			this.method1556(arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([Lclient!lb;I)V")
	public Class3_Sub1_Sub4_Sub4(@OriginalArg(0) Class3_Sub1_Sub4_Sub4[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt1998 = 0;
		this.anInt1996 = 0;
		this.anInt1999 = 0;
		this.aByte5 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class3_Sub1_Sub4_Sub4 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt1998 += local44.anInt1998;
				this.anInt1996 += local44.anInt1996;
				this.anInt1999 += local44.anInt1999;
				if (local44.aByteArray25 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local44.aByte5;
					}
					if (this.aByte5 != local44.aByte5) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray21 != null;
				local19 |= local44.aByteArray23 != null;
				local21 |= local44.anIntArray215 != null;
				local23 |= local44.aShortArray18 != null;
				local25 |= local44.aByteArray27 != null;
			}
		}
		this.anIntArray207 = new int[this.anInt1998];
		this.anIntArray214 = new int[this.anInt1998];
		this.anIntArray206 = new int[this.anInt1998];
		this.anIntArray211 = new int[this.anInt1998];
		this.anIntArray208 = new int[this.anInt1996];
		this.anIntArray212 = new int[this.anInt1996];
		this.anIntArray213 = new int[this.anInt1996];
		if (local15) {
			this.aByteArray21 = new byte[this.anInt1996];
		}
		if (local17) {
			this.aByteArray25 = new byte[this.anInt1996];
		}
		if (local19) {
			this.aByteArray23 = new byte[this.anInt1996];
		}
		if (local21) {
			this.anIntArray215 = new int[this.anInt1996];
		}
		if (local23) {
			this.aShortArray18 = new short[this.anInt1996];
		}
		if (local25) {
			this.aByteArray27 = new byte[this.anInt1996];
		}
		this.aShortArray23 = new short[this.anInt1996];
		if (this.anInt1999 > 0) {
			this.aByteArray26 = new byte[this.anInt1999];
			this.aShortArray24 = new short[this.anInt1999];
			this.aShortArray19 = new short[this.anInt1999];
			this.aShortArray22 = new short[this.anInt1999];
			this.aShortArray17 = new short[this.anInt1999];
			this.aShortArray21 = new short[this.anInt1999];
			this.aShortArray20 = new short[this.anInt1999];
			this.aByteArray20 = new byte[this.anInt1999];
			this.aByteArray19 = new byte[this.anInt1999];
			this.aByteArray22 = new byte[this.anInt1999];
			this.aByteArray24 = new byte[this.anInt1999];
			this.aByteArray18 = new byte[this.anInt1999];
		}
		this.anInt1998 = 0;
		this.anInt1996 = 0;
		this.anInt1999 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class3_Sub1_Sub4_Sub4 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt1996; local302++) {
					if (local15 && local298.aByteArray21 != null) {
						this.aByteArray21[this.anInt1996] = local298.aByteArray21[local302];
					}
					if (local17) {
						if (local298.aByteArray25 == null) {
							this.aByteArray25[this.anInt1996] = local298.aByte5;
						} else {
							this.aByteArray25[this.anInt1996] = local298.aByteArray25[local302];
						}
					}
					if (local19 && local298.aByteArray23 != null) {
						this.aByteArray23[this.anInt1996] = local298.aByteArray23[local302];
					}
					if (local21 && local298.anIntArray215 != null) {
						this.anIntArray215[this.anInt1996] = local298.anIntArray215[local302];
					}
					if (local23) {
						if (local298.aShortArray18 == null) {
							this.aShortArray18[this.anInt1996] = -1;
						} else {
							this.aShortArray18[this.anInt1996] = local298.aShortArray18[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray27 == null || local298.aByteArray27[local302] == -1) {
							this.aByteArray27[this.anInt1996] = -1;
						} else {
							this.aByteArray27[this.anInt1996] = (byte) (local298.aByteArray27[local302] + this.anInt1999);
						}
					}
					this.aShortArray23[this.anInt1996] = local298.aShortArray23[local302];
					this.anIntArray208[this.anInt1996] = this.method1572(local298, local298.anIntArray208[local302]);
					this.anIntArray212[this.anInt1996] = this.method1572(local298, local298.anIntArray212[local302]);
					this.anIntArray213[this.anInt1996] = this.method1572(local298, local298.anIntArray213[local302]);
					this.anInt1996++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt1999; local477++) {
					@Pc(489) byte local489 = this.aByteArray26[this.anInt1999] = local298.aByteArray26[local477];
					if (local489 == 0) {
						this.aShortArray24[this.anInt1999] = (short) this.method1572(local298, local298.aShortArray24[local477]);
						this.aShortArray19[this.anInt1999] = (short) this.method1572(local298, local298.aShortArray19[local477]);
						this.aShortArray22[this.anInt1999] = (short) this.method1572(local298, local298.aShortArray22[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray24[this.anInt1999] = local298.aShortArray24[local477];
						this.aShortArray19[this.anInt1999] = local298.aShortArray19[local477];
						this.aShortArray22[this.anInt1999] = local298.aShortArray22[local477];
						this.aShortArray17[this.anInt1999] = local298.aShortArray17[local477];
						this.aShortArray21[this.anInt1999] = local298.aShortArray21[local477];
						this.aShortArray20[this.anInt1999] = local298.aShortArray20[local477];
						this.aByteArray20[this.anInt1999] = local298.aByteArray20[local477];
						this.aByteArray19[this.anInt1999] = local298.aByteArray19[local477];
						this.aByteArray22[this.anInt1999] = local298.aByteArray22[local477];
					}
					if (local489 == 2) {
						this.aByteArray24[this.anInt1999] = local298.aByteArray24[local477];
						this.aByteArray18[this.anInt1999] = local298.aByteArray18[local477];
					}
					this.anInt1999++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!lb;ZZZZ)V")
	public Class3_Sub1_Sub4_Sub4(@OriginalArg(0) Class3_Sub1_Sub4_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1998 = arg0.anInt1998;
		this.anInt1996 = arg0.anInt1996;
		this.anInt1999 = arg0.anInt1999;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray207 = arg0.anIntArray207;
			this.anIntArray214 = arg0.anIntArray214;
			this.anIntArray206 = arg0.anIntArray206;
		} else {
			this.anIntArray207 = new int[this.anInt1998];
			this.anIntArray214 = new int[this.anInt1998];
			this.anIntArray206 = new int[this.anInt1998];
			for (local57 = 0; local57 < this.anInt1998; local57++) {
				this.anIntArray207[local57] = arg0.anIntArray207[local57];
				this.anIntArray214[local57] = arg0.anIntArray214[local57];
				this.anIntArray206[local57] = arg0.anIntArray206[local57];
			}
		}
		if (arg2) {
			this.aShortArray23 = arg0.aShortArray23;
		} else {
			this.aShortArray23 = new short[this.anInt1996];
			for (local57 = 0; local57 < this.anInt1996; local57++) {
				this.aShortArray23[local57] = arg0.aShortArray23[local57];
			}
		}
		if (arg3 || arg0.aShortArray18 == null) {
			this.aShortArray18 = arg0.aShortArray18;
		} else {
			this.aShortArray18 = new short[this.anInt1996];
			for (local57 = 0; local57 < this.anInt1996; local57++) {
				this.aShortArray18[local57] = arg0.aShortArray18[local57];
			}
		}
		this.aByteArray23 = arg0.aByteArray23;
		this.anIntArray208 = arg0.anIntArray208;
		this.anIntArray212 = arg0.anIntArray212;
		this.anIntArray213 = arg0.anIntArray213;
		this.aByteArray21 = arg0.aByteArray21;
		this.aByteArray25 = arg0.aByteArray25;
		this.aByteArray27 = arg0.aByteArray27;
		this.aByte5 = arg0.aByte5;
		this.aByteArray26 = arg0.aByteArray26;
		this.aShortArray24 = arg0.aShortArray24;
		this.aShortArray19 = arg0.aShortArray19;
		this.aShortArray22 = arg0.aShortArray22;
		this.aShortArray17 = arg0.aShortArray17;
		this.aShortArray21 = arg0.aShortArray21;
		this.aShortArray20 = arg0.aShortArray20;
		this.aByteArray20 = arg0.aByteArray20;
		this.aByteArray19 = arg0.aByteArray19;
		this.aByteArray22 = arg0.aByteArray22;
		this.aByteArray24 = arg0.aByteArray24;
		this.aByteArray18 = arg0.aByteArray18;
		this.anIntArray211 = arg0.anIntArray211;
		this.anIntArray215 = arg0.anIntArray215;
		this.anIntArrayArray19 = arg0.anIntArrayArray19;
		this.anIntArrayArray18 = arg0.anIntArrayArray18;
		this.aClass15Array2 = arg0.aClass15Array2;
		this.aClass9Array1 = arg0.aClass9Array1;
		this.aClass15Array1 = arg0.aClass15Array1;
		this.aShort12 = arg0.aShort12;
		this.aShort8 = arg0.aShort8;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(SS)V")
	public void method1552(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1996; local1++) {
			if (this.aShortArray23[local1] == arg0) {
				this.aShortArray23[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
	public void method1553() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1998; local1++) {
			this.anIntArray206[local1] = -this.anIntArray206[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1996; local18++) {
			@Pc(24) int local24 = this.anIntArray208[local18];
			this.anIntArray208[local18] = this.anIntArray213[local18];
			this.anIntArray213[local18] = local24;
		}
		this.method1568();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)Lclient!na;")
	public Class3_Sub1_Sub4_Sub5_Sub1 method1554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class3_Sub1_Sub4_Sub5_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()V")
	public void method1555() {
		if (this.aClass15Array2 != null) {
			return;
		}
		this.aClass15Array2 = new Class15[this.anInt1998];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1998; local10++) {
			this.aClass15Array2[local10] = new Class15();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1996; local25++) {
			@Pc(31) int local31 = this.anIntArray208[local25];
			@Pc(36) int local36 = this.anIntArray212[local25];
			@Pc(41) int local41 = this.anIntArray213[local25];
			@Pc(51) int local51 = this.anIntArray207[local36] - this.anIntArray207[local31];
			@Pc(61) int local61 = this.anIntArray214[local36] - this.anIntArray214[local31];
			@Pc(71) int local71 = this.anIntArray206[local36] - this.anIntArray206[local31];
			@Pc(81) int local81 = this.anIntArray207[local41] - this.anIntArray207[local31];
			@Pc(91) int local91 = this.anIntArray214[local41] - this.anIntArray214[local31];
			@Pc(101) int local101 = this.anIntArray206[local41] - this.anIntArray206[local31];
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
			if (this.aByteArray21 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray21[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class15 local211 = this.aClass15Array2[local31];
				local211.anInt633 += local109;
				local211.anInt631 += local117;
				local211.anInt632 += local125;
				local211.anInt629++;
				@Pc(240) Class15 local240 = this.aClass15Array2[local36];
				local240.anInt633 += local109;
				local240.anInt631 += local117;
				local240.anInt632 += local125;
				local240.anInt629++;
				@Pc(269) Class15 local269 = this.aClass15Array2[local41];
				local269.anInt633 += local109;
				local269.anInt631 += local117;
				local269.anInt632 += local125;
				local269.anInt629++;
			} else if (local198 == 1) {
				if (this.aClass9Array1 == null) {
					this.aClass9Array1 = new Class9[this.anInt1996];
				}
				@Pc(314) Class9 local314 = this.aClass9Array1[local25] = new Class9();
				local314.anInt314 = local109;
				local314.anInt315 = local117;
				local314.anInt310 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([B)V")
	private void method1556(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class3_Sub12 local8 = new Class3_Sub12(arg0);
		@Pc(13) Class3_Sub12 local13 = new Class3_Sub12(arg0);
		@Pc(18) Class3_Sub12 local18 = new Class3_Sub12(arg0);
		@Pc(23) Class3_Sub12 local23 = new Class3_Sub12(arg0);
		@Pc(28) Class3_Sub12 local28 = new Class3_Sub12(arg0);
		local8.anInt1793 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1359();
		@Pc(42) int local42 = local8.method1359();
		@Pc(46) int local46 = local8.method1354();
		@Pc(50) int local50 = local8.method1354();
		@Pc(54) int local54 = local8.method1354();
		@Pc(58) int local58 = local8.method1354();
		@Pc(62) int local62 = local8.method1354();
		@Pc(66) int local66 = local8.method1354();
		@Pc(70) int local70 = local8.method1359();
		@Pc(74) int local74 = local8.method1359();
		@Pc(78) int local78 = local8.method1359();
		@Pc(82) int local82 = local8.method1359();
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
		this.anInt1998 = local38;
		this.anInt1996 = local42;
		this.anInt1999 = local46;
		this.anIntArray207 = new int[local38];
		this.anIntArray214 = new int[local38];
		this.anIntArray206 = new int[local38];
		this.anIntArray208 = new int[local42];
		this.anIntArray212 = new int[local42];
		this.anIntArray213 = new int[local42];
		if (local46 > 0) {
			this.aByteArray26 = new byte[local46];
			this.aShortArray24 = new short[local46];
			this.aShortArray19 = new short[local46];
			this.aShortArray22 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray211 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray21 = new byte[local42];
			this.aByteArray27 = new byte[local42];
			this.aShortArray18 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray25 = new byte[local42];
		} else {
			this.aByte5 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray23 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray215 = new int[local42];
		}
		this.aShortArray23 = new short[local42];
		local8.anInt1793 = 0;
		local13.anInt1793 = local165;
		local18.anInt1793 = local171;
		local23.anInt1793 = local90;
		local28.anInt1793 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1354();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1366();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1366();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1366();
			}
			this.anIntArray207[local307] = local301 + local314;
			this.anIntArray214[local307] = local303 + local324;
			this.anIntArray206[local307] = local305 + local334;
			local301 = this.anIntArray207[local307];
			local303 = this.anIntArray214[local307];
			local305 = this.anIntArray206[local307];
			if (local66 == 1) {
				this.anIntArray211[local307] = local28.method1354();
			}
		}
		local8.anInt1793 = local149;
		local13.anInt1793 = local116;
		local18.anInt1793 = local98;
		local23.anInt1793 = local134;
		local28.anInt1793 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray23[local312] = (short) local8.method1359();
			if (local50 == 1) {
				local314 = local13.method1354();
				if ((local314 & 0x1) == 1) {
					this.aByteArray21[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray21[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray27[local312] = (byte) (local314 >> 2);
					this.aShortArray18[local312] = this.aShortArray23[local312];
					this.aShortArray23[local312] = 127;
					if (this.aShortArray18[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray27[local312] = -1;
					this.aShortArray18[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray25[local312] = local18.method1342();
			}
			if (local58 == 1) {
				this.aByteArray23[local312] = local23.method1342();
			}
			if (local62 == 1) {
				this.anIntArray215[local312] = local28.method1354();
			}
		}
		local8.anInt1793 = local143;
		local13.anInt1793 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1354();
			if (local543 == 1) {
				local314 = local8.method1366() + local536;
				local324 = local8.method1366() + local314;
				local334 = local8.method1366() + local324;
				local536 = local334;
				this.anIntArray208[local538] = local314;
				this.anIntArray212[local538] = local324;
				this.anIntArray213[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1366() + local536;
				local536 = local334;
				this.anIntArray208[local538] = local314;
				this.anIntArray212[local538] = local324;
				this.anIntArray213[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1366() + local536;
				local536 = local334;
				this.anIntArray208[local538] = local314;
				this.anIntArray212[local538] = local324;
				this.anIntArray213[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1366() + local536;
				local536 = local334;
				this.anIntArray208[local538] = local314;
				this.anIntArray212[local538] = local646;
				this.anIntArray213[local538] = local334;
			}
		}
		local8.anInt1793 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray26[local543] = 0;
			this.aShortArray24[local543] = (short) local8.method1359();
			this.aShortArray19[local543] = (short) local8.method1359();
			this.aShortArray22[local543] = (short) local8.method1359();
		}
		if (this.aByteArray27 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray27[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray24[local731] & 0xFFFF) == this.anIntArray208[local723] && (this.aShortArray19[local731] & 0xFFFF) == this.anIntArray212[local723] && (this.aShortArray22[local731] & 0xFFFF) == this.anIntArray213[local723]) {
						this.aByteArray27[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray27 = null;
			}
		}
		if (!local3) {
			this.aShortArray18 = null;
		}
		if (!local1) {
			this.aByteArray21 = null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIZZ)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method1558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class3_Sub1_Sub4_Sub5_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	public void method1559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1998; local1++) {
			this.anIntArray207[local1] = this.anIntArray207[local1] * arg0 / 128;
			this.anIntArray214[local1] = this.anIntArray214[local1] * arg1 / 128;
			this.anIntArray206[local1] = this.anIntArray206[local1] * arg2 / 128;
		}
		this.method1568();
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "()Lclient!lb;")
	public Class3_Sub1_Sub4_Sub4 method1560() {
		@Pc(3) Class3_Sub1_Sub4_Sub4 local3 = new Class3_Sub1_Sub4_Sub4();
		if (this.aByteArray21 != null) {
			local3.aByteArray21 = new byte[this.anInt1996];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1996; local13++) {
				local3.aByteArray21[local13] = this.aByteArray21[local13];
			}
		}
		local3.anInt1998 = this.anInt1998;
		local3.anInt1996 = this.anInt1996;
		local3.anInt1999 = this.anInt1999;
		local3.anIntArray207 = this.anIntArray207;
		local3.anIntArray214 = this.anIntArray214;
		local3.anIntArray206 = this.anIntArray206;
		local3.anIntArray208 = this.anIntArray208;
		local3.anIntArray212 = this.anIntArray212;
		local3.anIntArray213 = this.anIntArray213;
		local3.aByteArray25 = this.aByteArray25;
		local3.aByteArray23 = this.aByteArray23;
		local3.aByteArray27 = this.aByteArray27;
		local3.aShortArray23 = this.aShortArray23;
		local3.aShortArray18 = this.aShortArray18;
		local3.aByte5 = this.aByte5;
		local3.aByteArray26 = this.aByteArray26;
		local3.aShortArray24 = this.aShortArray24;
		local3.aShortArray19 = this.aShortArray19;
		local3.aShortArray22 = this.aShortArray22;
		local3.aShortArray17 = this.aShortArray17;
		local3.aShortArray21 = this.aShortArray21;
		local3.aShortArray20 = this.aShortArray20;
		local3.aByteArray20 = this.aByteArray20;
		local3.aByteArray19 = this.aByteArray19;
		local3.aByteArray22 = this.aByteArray22;
		local3.aByteArray24 = this.aByteArray24;
		local3.aByteArray18 = this.aByteArray18;
		local3.anIntArray211 = this.anIntArray211;
		local3.anIntArray215 = this.anIntArray215;
		local3.anIntArrayArray19 = this.anIntArrayArray19;
		local3.anIntArrayArray18 = this.anIntArrayArray18;
		local3.aClass15Array2 = this.aClass15Array2;
		local3.aClass9Array1 = this.aClass9Array1;
		local3.aShort12 = this.aShort12;
		local3.aShort8 = this.aShort8;
		return local3;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "([B)V")
	private void method1561(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub12 local4 = new Class3_Sub12(arg0);
		@Pc(9) Class3_Sub12 local9 = new Class3_Sub12(arg0);
		@Pc(14) Class3_Sub12 local14 = new Class3_Sub12(arg0);
		@Pc(19) Class3_Sub12 local19 = new Class3_Sub12(arg0);
		@Pc(24) Class3_Sub12 local24 = new Class3_Sub12(arg0);
		@Pc(29) Class3_Sub12 local29 = new Class3_Sub12(arg0);
		@Pc(34) Class3_Sub12 local34 = new Class3_Sub12(arg0);
		local4.anInt1793 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1359();
		@Pc(48) int local48 = local4.method1359();
		@Pc(52) int local52 = local4.method1354();
		@Pc(56) int local56 = local4.method1354();
		@Pc(60) int local60 = local4.method1354();
		@Pc(64) int local64 = local4.method1354();
		@Pc(68) int local68 = local4.method1354();
		@Pc(72) int local72 = local4.method1354();
		@Pc(76) int local76 = local4.method1354();
		@Pc(80) int local80 = local4.method1359();
		@Pc(84) int local84 = local4.method1359();
		@Pc(88) int local88 = local4.method1359();
		@Pc(92) int local92 = local4.method1359();
		@Pc(96) int local96 = local4.method1359();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray26 = new byte[local52];
			local4.anInt1793 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray26[local113] = local4.method1342();
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
		this.anInt1998 = local44;
		this.anInt1996 = local48;
		this.anInt1999 = local52;
		this.anIntArray207 = new int[local44];
		this.anIntArray214 = new int[local44];
		this.anIntArray206 = new int[local44];
		this.anIntArray208 = new int[local48];
		this.anIntArray212 = new int[local48];
		this.anIntArray213 = new int[local48];
		if (local76 == 1) {
			this.anIntArray211 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray21 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray25 = new byte[local48];
		} else {
			this.aByte5 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray23 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray215 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray18 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray27 = new byte[local48];
		}
		this.aShortArray23 = new short[local48];
		if (local52 > 0) {
			this.aShortArray24 = new short[local52];
			this.aShortArray19 = new short[local52];
			this.aShortArray22 = new short[local52];
			if (local100 > 0) {
				this.aShortArray17 = new short[local100];
				this.aShortArray21 = new short[local100];
				this.aShortArray20 = new short[local100];
				this.aByteArray20 = new byte[local100];
				this.aByteArray19 = new byte[local100];
				this.aByteArray22 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray24 = new byte[local102];
				this.aByteArray18 = new byte[local102];
			}
		}
		local4.anInt1793 = local52;
		local9.anInt1793 = local233;
		local14.anInt1793 = local239;
		local19.anInt1793 = local245;
		local24.anInt1793 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1354();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1366();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1366();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1366();
			}
			this.anIntArray207[local463] = local457 + local470;
			this.anIntArray214[local463] = local459 + local480;
			this.anIntArray206[local463] = local461 + local490;
			local457 = this.anIntArray207[local463];
			local459 = this.anIntArray214[local463];
			local461 = this.anIntArray206[local463];
			if (local76 == 1) {
				this.anIntArray211[local463] = local24.method1354();
			}
		}
		local4.anInt1793 = local225;
		local9.anInt1793 = local151;
		local14.anInt1793 = local166;
		local19.anInt1793 = local193;
		local24.anInt1793 = local175;
		local29.anInt1793 = local208;
		local34.anInt1793 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray23[local468] = (short) local4.method1359();
			if (local56 == 1) {
				this.aByteArray21[local468] = local9.method1342();
			}
			if (local60 == 255) {
				this.aByteArray25[local468] = local14.method1342();
			}
			if (local64 == 1) {
				this.aByteArray23[local468] = local19.method1342();
			}
			if (local68 == 1) {
				this.anIntArray215[local468] = local24.method1354();
			}
			if (local72 == 1) {
				this.aShortArray18[local468] = (short) (local29.method1359() - 1);
			}
			if (this.aByteArray27 != null) {
				if (this.aShortArray18[local468] == -1) {
					this.aByteArray27[local468] = -1;
				} else {
					this.aByteArray27[local468] = (byte) (local34.method1354() - 1);
				}
			}
		}
		local4.anInt1793 = local202;
		local9.anInt1793 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1354();
			if (local683 == 1) {
				local470 = local4.method1366() + local676;
				local480 = local4.method1366() + local470;
				local490 = local4.method1366() + local480;
				local676 = local490;
				this.anIntArray208[local678] = local470;
				this.anIntArray212[local678] = local480;
				this.anIntArray213[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1366() + local676;
				local676 = local490;
				this.anIntArray208[local678] = local470;
				this.anIntArray212[local678] = local480;
				this.anIntArray213[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1366() + local676;
				local676 = local490;
				this.anIntArray208[local678] = local470;
				this.anIntArray212[local678] = local480;
				this.anIntArray213[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1366() + local676;
				local676 = local490;
				this.anIntArray208[local678] = local470;
				this.anIntArray212[local678] = local786;
				this.anIntArray213[local678] = local490;
			}
		}
		local4.anInt1793 = local251;
		local9.anInt1793 = local259;
		local14.anInt1793 = local267;
		local19.anInt1793 = local275;
		local24.anInt1793 = local281;
		local29.anInt1793 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray26[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray24[local683] = (short) local4.method1359();
				this.aShortArray19[local683] = (short) local4.method1359();
				this.aShortArray22[local683] = (short) local4.method1359();
			}
			if (local786 == 1) {
				this.aShortArray24[local683] = (short) local9.method1359();
				this.aShortArray19[local683] = (short) local9.method1359();
				this.aShortArray22[local683] = (short) local9.method1359();
				this.aShortArray17[local683] = (short) local14.method1359();
				this.aShortArray21[local683] = (short) local14.method1359();
				this.aShortArray20[local683] = (short) local14.method1359();
				this.aByteArray20[local683] = local19.method1342();
				this.aByteArray19[local683] = local24.method1342();
				this.aByteArray22[local683] = local29.method1342();
			}
			if (local786 == 2) {
				this.aShortArray24[local683] = (short) local9.method1359();
				this.aShortArray19[local683] = (short) local9.method1359();
				this.aShortArray22[local683] = (short) local9.method1359();
				this.aShortArray17[local683] = (short) local14.method1359();
				this.aShortArray21[local683] = (short) local14.method1359();
				this.aShortArray20[local683] = (short) local14.method1359();
				this.aByteArray20[local683] = local19.method1342();
				this.aByteArray19[local683] = local24.method1342();
				this.aByteArray22[local683] = local29.method1342();
				this.aByteArray24[local683] = local29.method1342();
				this.aByteArray18[local683] = local29.method1342();
			}
			if (local786 == 3) {
				this.aShortArray24[local683] = (short) local9.method1359();
				this.aShortArray19[local683] = (short) local9.method1359();
				this.aShortArray22[local683] = (short) local9.method1359();
				this.aShortArray17[local683] = (short) local14.method1359();
				this.aShortArray21[local683] = (short) local14.method1359();
				this.aShortArray20[local683] = (short) local14.method1359();
				this.aByteArray20[local683] = local19.method1342();
				this.aByteArray19[local683] = local24.method1342();
				this.aByteArray22[local683] = local29.method1342();
			}
		}
		local4.anInt1793 = local113;
		local786 = local4.method1354();
		if (local786 == 0) {
			return;
		}
		new Class74();
		local4.method1359();
		local4.method1359();
		local4.method1359();
		local4.method1373();
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "(I)V")
	public void method1562() {
		@Pc(3) int local3 = Static89.anIntArray204[256];
		@Pc(7) int local7 = Static89.anIntArray209[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1998; local9++) {
			@Pc(26) int local26 = this.anIntArray206[local9] * local3 + this.anIntArray207[local9] * local7 >> 16;
			this.anIntArray206[local9] = this.anIntArray206[local9] * local7 - this.anIntArray207[local9] * local3 >> 16;
			this.anIntArray207[local9] = local26;
		}
		this.method1568();
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()V")
	public void method1563() {
		if (this.aBoolean132) {
			return;
		}
		this.aBoolean132 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1998; local20++) {
			@Pc(26) int local26 = this.anIntArray207[local20];
			@Pc(31) int local31 = this.anIntArray214[local20];
			@Pc(36) int local36 = this.anIntArray206[local20];
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
		this.aShort9 = (short) local8;
		this.aShort7 = (short) local14;
		super.aShort32 = (short) local10;
		this.aShort10 = (short) local16;
		this.aShort6 = (short) local12;
		this.aShort11 = (short) local18;
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "()V")
	public void method1564() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1998; local1++) {
			this.anIntArray207[local1] = -this.anIntArray207[local1];
			this.anIntArray206[local1] = -this.anIntArray206[local1];
		}
		this.method1568();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(SS)V")
	public void method1565(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray18 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt1996; local5++) {
			if (this.aShortArray18[local5] == arg0) {
				this.aShortArray18[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
	public void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1998; local1++) {
			this.anIntArray207[local1] += arg0;
			this.anIntArray214[local1] += arg1;
			this.anIntArray206[local1] += arg2;
		}
		this.method1568();
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()V")
	public void method1567() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1998; local1++) {
			@Pc(7) int local7 = this.anIntArray206[local1];
			this.anIntArray206[local1] = this.anIntArray207[local1];
			this.anIntArray207[local1] = -local7;
		}
		this.method1568();
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "()V")
	private void method1568() {
		this.aClass15Array2 = null;
		this.aClass15Array1 = null;
		this.aClass9Array1 = null;
		this.aBoolean132 = false;
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "()V")
	public void method1570() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray211 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1998; local9++) {
				local15 = this.anIntArray211[local9];
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
			while (local59 < this.anInt1998) {
				local65 = this.anIntArray211[local59];
				this.anIntArrayArray19[local65][local5[local65]++] = local59++;
			}
			this.anIntArray211 = null;
		}
		if (this.anIntArray215 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1996; local9++) {
			local15 = this.anIntArray215[local9];
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
		while (local59 < this.anInt1996) {
			local65 = this.anIntArray215[local59];
			this.anIntArrayArray18[local65][local5[local65]++] = local59++;
		}
		this.anIntArray215 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!lb;I)I")
	private int method1572(@OriginalArg(0) Class3_Sub1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray207[arg1];
		@Pc(11) int local11 = arg0.anIntArray214[arg1];
		@Pc(16) int local16 = arg0.anIntArray206[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1998; local18++) {
			if (local6 == this.anIntArray207[local18] && local11 == this.anIntArray214[local18] && local16 == this.anIntArray206[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray207[this.anInt1998] = local6;
			this.anIntArray214[this.anInt1998] = local11;
			this.anIntArray206[this.anInt1998] = local16;
			if (arg0.anIntArray211 != null) {
				this.anIntArray211[this.anInt1998] = arg0.anIntArray211[arg1];
			}
			local1 = this.anInt1998++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "()V")
	public void method1573() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1998; local1++) {
			@Pc(7) int local7 = this.anIntArray207[local1];
			this.anIntArray207[local1] = this.anIntArray206[local1];
			this.anIntArray206[local1] = -local7;
		}
		this.method1568();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([[IIIIZI)Lclient!lb;")
	public Class3_Sub1_Sub4_Sub4 method1574(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1563();
		@Pc(6) int local6 = arg1 + this.aShort9;
		@Pc(11) int local11 = arg1 + this.aShort7;
		@Pc(16) int local16 = arg3 + this.aShort6;
		@Pc(21) int local21 = arg3 + this.aShort11;
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
		@Pc(101) Class3_Sub1_Sub4_Sub4 local101 = new Class3_Sub1_Sub4_Sub4();
		local101.anInt1998 = this.anInt1998;
		local101.anInt1996 = this.anInt1996;
		local101.anInt1999 = this.anInt1999;
		local101.anIntArray207 = this.anIntArray207;
		local101.anIntArray206 = this.anIntArray206;
		local101.anIntArray208 = this.anIntArray208;
		local101.anIntArray212 = this.anIntArray212;
		local101.anIntArray213 = this.anIntArray213;
		local101.aByteArray21 = this.aByteArray21;
		local101.aByteArray25 = this.aByteArray25;
		local101.aByteArray23 = this.aByteArray23;
		local101.aByteArray27 = this.aByteArray27;
		local101.aShortArray23 = this.aShortArray23;
		local101.aShortArray18 = this.aShortArray18;
		local101.aByte5 = this.aByte5;
		local101.aByteArray26 = this.aByteArray26;
		local101.aShortArray24 = this.aShortArray24;
		local101.aShortArray19 = this.aShortArray19;
		local101.aShortArray22 = this.aShortArray22;
		local101.aShortArray17 = this.aShortArray17;
		local101.aShortArray21 = this.aShortArray21;
		local101.aShortArray20 = this.aShortArray20;
		local101.aByteArray20 = this.aByteArray20;
		local101.aByteArray19 = this.aByteArray19;
		local101.aByteArray22 = this.aByteArray22;
		local101.aByteArray24 = this.aByteArray24;
		local101.aByteArray18 = this.aByteArray18;
		local101.anIntArray211 = this.anIntArray211;
		local101.anIntArray215 = this.anIntArray215;
		local101.anIntArrayArray19 = this.anIntArrayArray19;
		local101.anIntArrayArray18 = this.anIntArrayArray18;
		local101.aShort12 = this.aShort12;
		local101.aShort8 = this.aShort8;
		local101.anIntArray214 = new int[local101.anInt1998];
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
			for (local245 = 0; local245 < local101.anInt1998; local245++) {
				local253 = this.anIntArray207[local245] + arg1;
				local260 = this.anIntArray206[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray214[local245] = this.anIntArray214[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt1998; local245++) {
				local253 = (this.anIntArray214[local245] << 16) / super.aShort32;
				if (local253 < arg4) {
					local260 = this.anIntArray207[local245] + arg1;
					local264 = this.anIntArray206[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray214[local245] = this.anIntArray214[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray214[local245] = this.anIntArray214[local245];
				}
			}
		}
		local101.method1568();
		return local101;
	}
}
