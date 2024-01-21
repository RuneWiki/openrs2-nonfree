import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class3_Sub2_Sub1_Sub6 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "S")
	public short aShort27;

	@OriginalMember(owner = "client!oe", name = "O", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!oe", name = "R", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!oe", name = "U", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!oe", name = "W", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "S")
	public short aShort30;

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "[Lclient!th;")
	public Class79[] aClass79Array1;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "[Lclient!ie;")
	public Class37[] aClass37Array1;

	@OriginalMember(owner = "client!oe", name = "eb", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!oe", name = "gb", descriptor = "[Lclient!th;")
	public Class79[] aClass79Array2;

	@OriginalMember(owner = "client!oe", name = "hb", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!oe", name = "ib", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!oe", name = "lb", descriptor = "S")
	public short aShort31;

	@OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
	public int anInt2748;

	@OriginalMember(owner = "client!oe", name = "nb", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!oe", name = "ob", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!oe", name = "pb", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!oe", name = "qb", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!oe", name = "rb", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!oe", name = "tb", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!oe", name = "ub", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!oe", name = "vb", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!oe", name = "wb", descriptor = "[[I")
	public int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!oe", name = "xb", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!oe", name = "yb", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!oe", name = "zb", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!oe", name = "Bb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!oe", name = "Cb", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!oe", name = "Db", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!oe", name = "Eb", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!oe", name = "Fb", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!oe", name = "Gb", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!oe", name = "Hb", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!oe", name = "Ib", descriptor = "S")
	public short aShort33;

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
	public int anInt2746 = 0;

	@OriginalMember(owner = "client!oe", name = "db", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!oe", name = "kb", descriptor = "B")
	public byte aByte5 = 0;

	@OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
	public int anInt2747 = 0;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	private Class3_Sub2_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
	public Class3_Sub2_Sub1_Sub6(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1953(arg0);
		} else {
			this.method1948(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([Lclient!oe;I)V")
	public Class3_Sub2_Sub1_Sub6(@OriginalArg(0) Class3_Sub2_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2746 = 0;
		this.anInt2747 = 0;
		this.anInt2748 = 0;
		this.aByte5 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class3_Sub2_Sub1_Sub6 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2746 += local44.anInt2746;
				this.anInt2747 += local44.anInt2747;
				this.anInt2748 += local44.anInt2748;
				if (local44.aByteArray34 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local44.aByte5;
					}
					if (this.aByte5 != local44.aByte5) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray30 != null;
				local19 |= local44.aByteArray26 != null;
				local21 |= local44.anIntArray315 != null;
				local23 |= local44.aShortArray22 != null;
				local25 |= local44.aByteArray27 != null;
			}
		}
		this.anIntArray304 = new int[this.anInt2746];
		this.anIntArray308 = new int[this.anInt2746];
		this.anIntArray312 = new int[this.anInt2746];
		this.anIntArray314 = new int[this.anInt2746];
		this.anIntArray305 = new int[this.anInt2747];
		this.anIntArray306 = new int[this.anInt2747];
		this.anIntArray307 = new int[this.anInt2747];
		if (local15) {
			this.aByteArray30 = new byte[this.anInt2747];
		}
		if (local17) {
			this.aByteArray34 = new byte[this.anInt2747];
		}
		if (local19) {
			this.aByteArray26 = new byte[this.anInt2747];
		}
		if (local21) {
			this.anIntArray315 = new int[this.anInt2747];
		}
		if (local23) {
			this.aShortArray22 = new short[this.anInt2747];
		}
		if (local25) {
			this.aByteArray27 = new byte[this.anInt2747];
		}
		this.aShortArray19 = new short[this.anInt2747];
		if (this.anInt2748 > 0) {
			this.aByteArray28 = new byte[this.anInt2748];
			this.aShortArray20 = new short[this.anInt2748];
			this.aShortArray18 = new short[this.anInt2748];
			this.aShortArray21 = new short[this.anInt2748];
			this.aShortArray24 = new short[this.anInt2748];
			this.aShortArray23 = new short[this.anInt2748];
			this.aShortArray17 = new short[this.anInt2748];
			this.aByteArray33 = new byte[this.anInt2748];
			this.aByteArray29 = new byte[this.anInt2748];
			this.aByteArray31 = new byte[this.anInt2748];
			this.aByteArray35 = new byte[this.anInt2748];
			this.aByteArray32 = new byte[this.anInt2748];
		}
		this.anInt2746 = 0;
		this.anInt2747 = 0;
		this.anInt2748 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class3_Sub2_Sub1_Sub6 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt2747; local302++) {
					if (local15 && local298.aByteArray30 != null) {
						this.aByteArray30[this.anInt2747] = local298.aByteArray30[local302];
					}
					if (local17) {
						if (local298.aByteArray34 == null) {
							this.aByteArray34[this.anInt2747] = local298.aByte5;
						} else {
							this.aByteArray34[this.anInt2747] = local298.aByteArray34[local302];
						}
					}
					if (local19 && local298.aByteArray26 != null) {
						this.aByteArray26[this.anInt2747] = local298.aByteArray26[local302];
					}
					if (local21 && local298.anIntArray315 != null) {
						this.anIntArray315[this.anInt2747] = local298.anIntArray315[local302];
					}
					if (local23) {
						if (local298.aShortArray22 == null) {
							this.aShortArray22[this.anInt2747] = -1;
						} else {
							this.aShortArray22[this.anInt2747] = local298.aShortArray22[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray27 == null || local298.aByteArray27[local302] == -1) {
							this.aByteArray27[this.anInt2747] = -1;
						} else {
							this.aByteArray27[this.anInt2747] = (byte) (local298.aByteArray27[local302] + this.anInt2748);
						}
					}
					this.aShortArray19[this.anInt2747] = local298.aShortArray19[local302];
					this.anIntArray305[this.anInt2747] = this.method1950(local298, local298.anIntArray305[local302]);
					this.anIntArray306[this.anInt2747] = this.method1950(local298, local298.anIntArray306[local302]);
					this.anIntArray307[this.anInt2747] = this.method1950(local298, local298.anIntArray307[local302]);
					this.anInt2747++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt2748; local477++) {
					@Pc(489) byte local489 = this.aByteArray28[this.anInt2748] = local298.aByteArray28[local477];
					if (local489 == 0) {
						this.aShortArray20[this.anInt2748] = (short) this.method1950(local298, local298.aShortArray20[local477]);
						this.aShortArray18[this.anInt2748] = (short) this.method1950(local298, local298.aShortArray18[local477]);
						this.aShortArray21[this.anInt2748] = (short) this.method1950(local298, local298.aShortArray21[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray20[this.anInt2748] = local298.aShortArray20[local477];
						this.aShortArray18[this.anInt2748] = local298.aShortArray18[local477];
						this.aShortArray21[this.anInt2748] = local298.aShortArray21[local477];
						this.aShortArray24[this.anInt2748] = local298.aShortArray24[local477];
						this.aShortArray23[this.anInt2748] = local298.aShortArray23[local477];
						this.aShortArray17[this.anInt2748] = local298.aShortArray17[local477];
						this.aByteArray33[this.anInt2748] = local298.aByteArray33[local477];
						this.aByteArray29[this.anInt2748] = local298.aByteArray29[local477];
						this.aByteArray31[this.anInt2748] = local298.aByteArray31[local477];
					}
					if (local489 == 2) {
						this.aByteArray35[this.anInt2748] = local298.aByteArray35[local477];
						this.aByteArray32[this.anInt2748] = local298.aByteArray32[local477];
					}
					this.anInt2748++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!oe;ZZZZ)V")
	public Class3_Sub2_Sub1_Sub6(@OriginalArg(0) Class3_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2746 = arg0.anInt2746;
		this.anInt2747 = arg0.anInt2747;
		this.anInt2748 = arg0.anInt2748;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray304 = arg0.anIntArray304;
			this.anIntArray308 = arg0.anIntArray308;
			this.anIntArray312 = arg0.anIntArray312;
		} else {
			this.anIntArray304 = new int[this.anInt2746];
			this.anIntArray308 = new int[this.anInt2746];
			this.anIntArray312 = new int[this.anInt2746];
			for (local57 = 0; local57 < this.anInt2746; local57++) {
				this.anIntArray304[local57] = arg0.anIntArray304[local57];
				this.anIntArray308[local57] = arg0.anIntArray308[local57];
				this.anIntArray312[local57] = arg0.anIntArray312[local57];
			}
		}
		if (arg2) {
			this.aShortArray19 = arg0.aShortArray19;
		} else {
			this.aShortArray19 = new short[this.anInt2747];
			for (local57 = 0; local57 < this.anInt2747; local57++) {
				this.aShortArray19[local57] = arg0.aShortArray19[local57];
			}
		}
		if (arg3 || arg0.aShortArray22 == null) {
			this.aShortArray22 = arg0.aShortArray22;
		} else {
			this.aShortArray22 = new short[this.anInt2747];
			for (local57 = 0; local57 < this.anInt2747; local57++) {
				this.aShortArray22[local57] = arg0.aShortArray22[local57];
			}
		}
		this.aByteArray26 = arg0.aByteArray26;
		this.anIntArray305 = arg0.anIntArray305;
		this.anIntArray306 = arg0.anIntArray306;
		this.anIntArray307 = arg0.anIntArray307;
		this.aByteArray30 = arg0.aByteArray30;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray27 = arg0.aByteArray27;
		this.aByte5 = arg0.aByte5;
		this.aByteArray28 = arg0.aByteArray28;
		this.aShortArray20 = arg0.aShortArray20;
		this.aShortArray18 = arg0.aShortArray18;
		this.aShortArray21 = arg0.aShortArray21;
		this.aShortArray24 = arg0.aShortArray24;
		this.aShortArray23 = arg0.aShortArray23;
		this.aShortArray17 = arg0.aShortArray17;
		this.aByteArray33 = arg0.aByteArray33;
		this.aByteArray29 = arg0.aByteArray29;
		this.aByteArray31 = arg0.aByteArray31;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByteArray32 = arg0.aByteArray32;
		this.anIntArray314 = arg0.anIntArray314;
		this.anIntArray315 = arg0.anIntArray315;
		this.anIntArrayArray29 = arg0.anIntArrayArray29;
		this.anIntArrayArray28 = arg0.anIntArrayArray28;
		this.aClass79Array2 = arg0.aClass79Array2;
		this.aClass37Array1 = arg0.aClass37Array1;
		this.aClass79Array1 = arg0.aClass79Array1;
		this.aShort31 = arg0.aShort31;
		this.aShort27 = arg0.aShort27;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(SS)V")
	public void method1933(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray22 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2747; local5++) {
			if (this.aShortArray22[local5] == arg0) {
				this.aShortArray22[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
	public void method1934() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2746; local1++) {
			@Pc(7) int local7 = this.anIntArray312[local1];
			this.anIntArray312[local1] = this.anIntArray304[local1];
			this.anIntArray304[local1] = -local7;
		}
		this.method1935();
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "()V")
	private void method1935() {
		this.aClass79Array2 = null;
		this.aClass79Array1 = null;
		this.aClass37Array1 = null;
		this.aBoolean115 = false;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()Lclient!oe;")
	public Class3_Sub2_Sub1_Sub6 method1936() {
		@Pc(3) Class3_Sub2_Sub1_Sub6 local3 = new Class3_Sub2_Sub1_Sub6();
		if (this.aByteArray30 != null) {
			local3.aByteArray30 = new byte[this.anInt2747];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2747; local13++) {
				local3.aByteArray30[local13] = this.aByteArray30[local13];
			}
		}
		local3.anInt2746 = this.anInt2746;
		local3.anInt2747 = this.anInt2747;
		local3.anInt2748 = this.anInt2748;
		local3.anIntArray304 = this.anIntArray304;
		local3.anIntArray308 = this.anIntArray308;
		local3.anIntArray312 = this.anIntArray312;
		local3.anIntArray305 = this.anIntArray305;
		local3.anIntArray306 = this.anIntArray306;
		local3.anIntArray307 = this.anIntArray307;
		local3.aByteArray34 = this.aByteArray34;
		local3.aByteArray26 = this.aByteArray26;
		local3.aByteArray27 = this.aByteArray27;
		local3.aShortArray19 = this.aShortArray19;
		local3.aShortArray22 = this.aShortArray22;
		local3.aByte5 = this.aByte5;
		local3.aByteArray28 = this.aByteArray28;
		local3.aShortArray20 = this.aShortArray20;
		local3.aShortArray18 = this.aShortArray18;
		local3.aShortArray21 = this.aShortArray21;
		local3.aShortArray24 = this.aShortArray24;
		local3.aShortArray23 = this.aShortArray23;
		local3.aShortArray17 = this.aShortArray17;
		local3.aByteArray33 = this.aByteArray33;
		local3.aByteArray29 = this.aByteArray29;
		local3.aByteArray31 = this.aByteArray31;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray32 = this.aByteArray32;
		local3.anIntArray314 = this.anIntArray314;
		local3.anIntArray315 = this.anIntArray315;
		local3.anIntArrayArray29 = this.anIntArrayArray29;
		local3.anIntArrayArray28 = this.anIntArrayArray28;
		local3.aClass79Array2 = this.aClass79Array2;
		local3.aClass37Array1 = this.aClass37Array1;
		local3.aShort31 = this.aShort31;
		local3.aShort27 = this.aShort27;
		return local3;
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "()V")
	public void method1937() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2746; local1++) {
			@Pc(7) int local7 = this.anIntArray304[local1];
			this.anIntArray304[local1] = this.anIntArray312[local1];
			this.anIntArray312[local1] = -local7;
		}
		this.method1935();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIZZ)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class3_Sub2_Sub1_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public void method1939() {
		@Pc(3) int local3 = Static115.anIntArray310[256];
		@Pc(7) int local7 = Static115.anIntArray313[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2746; local9++) {
			@Pc(26) int local26 = this.anIntArray312[local9] * local3 + this.anIntArray304[local9] * local7 >> 16;
			this.anIntArray312[local9] = this.anIntArray312[local9] * local7 - this.anIntArray304[local9] * local3 >> 16;
			this.anIntArray304[local9] = local26;
		}
		this.method1935();
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "()V")
	public void method1940() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray314 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2746; local9++) {
				local15 = this.anIntArray314[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray29 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray29[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2746) {
				local65 = this.anIntArray314[local59];
				this.anIntArrayArray29[local65][local5[local65]++] = local59++;
			}
			this.anIntArray314 = null;
		}
		if (this.anIntArray315 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2747; local9++) {
			local15 = this.anIntArray315[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray28 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray28[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2747) {
			local65 = this.anIntArray315[local59];
			this.anIntArrayArray28[local65][local5[local65]++] = local59++;
		}
		this.anIntArray315 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([[IIIIZI)Lclient!oe;")
	public Class3_Sub2_Sub1_Sub6 method1941(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1947();
		@Pc(6) int local6 = arg1 + this.aShort29;
		@Pc(11) int local11 = arg1 + this.aShort28;
		@Pc(16) int local16 = arg3 + this.aShort33;
		@Pc(21) int local21 = arg3 + this.aShort30;
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
		@Pc(101) Class3_Sub2_Sub1_Sub6 local101 = new Class3_Sub2_Sub1_Sub6();
		local101.anInt2746 = this.anInt2746;
		local101.anInt2747 = this.anInt2747;
		local101.anInt2748 = this.anInt2748;
		local101.anIntArray304 = this.anIntArray304;
		local101.anIntArray312 = this.anIntArray312;
		local101.anIntArray305 = this.anIntArray305;
		local101.anIntArray306 = this.anIntArray306;
		local101.anIntArray307 = this.anIntArray307;
		local101.aByteArray30 = this.aByteArray30;
		local101.aByteArray34 = this.aByteArray34;
		local101.aByteArray26 = this.aByteArray26;
		local101.aByteArray27 = this.aByteArray27;
		local101.aShortArray19 = this.aShortArray19;
		local101.aShortArray22 = this.aShortArray22;
		local101.aByte5 = this.aByte5;
		local101.aByteArray28 = this.aByteArray28;
		local101.aShortArray20 = this.aShortArray20;
		local101.aShortArray18 = this.aShortArray18;
		local101.aShortArray21 = this.aShortArray21;
		local101.aShortArray24 = this.aShortArray24;
		local101.aShortArray23 = this.aShortArray23;
		local101.aShortArray17 = this.aShortArray17;
		local101.aByteArray33 = this.aByteArray33;
		local101.aByteArray29 = this.aByteArray29;
		local101.aByteArray31 = this.aByteArray31;
		local101.aByteArray35 = this.aByteArray35;
		local101.aByteArray32 = this.aByteArray32;
		local101.anIntArray314 = this.anIntArray314;
		local101.anIntArray315 = this.anIntArray315;
		local101.anIntArrayArray29 = this.anIntArrayArray29;
		local101.anIntArrayArray28 = this.anIntArrayArray28;
		local101.aShort31 = this.aShort31;
		local101.aShort27 = this.aShort27;
		local101.anIntArray308 = new int[local101.anInt2746];
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
			for (local245 = 0; local245 < local101.anInt2746; local245++) {
				local253 = this.anIntArray304[local245] + arg1;
				local260 = this.anIntArray312[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray308[local245] = this.anIntArray308[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt2746; local245++) {
				local253 = (this.anIntArray308[local245] << 16) / super.aShort34;
				if (local253 < arg4) {
					local260 = this.anIntArray304[local245] + arg1;
					local264 = this.anIntArray312[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray308[local245] = this.anIntArray308[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray308[local245] = this.anIntArray308[local245];
				}
			}
		}
		local101.method1935();
		return local101;
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "()V")
	public void method1942() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2746; local1++) {
			this.anIntArray304[local1] = -this.anIntArray304[local1];
			this.anIntArray312[local1] = -this.anIntArray312[local1];
		}
		this.method1935();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public void method1943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2746; local1++) {
			this.anIntArray304[local1] = this.anIntArray304[local1] * arg0 / 128;
			this.anIntArray308[local1] = this.anIntArray308[local1] * arg1 / 128;
			this.anIntArray312[local1] = this.anIntArray312[local1] * arg2 / 128;
		}
		this.method1935();
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "()V")
	public void method1946() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2746; local1++) {
			this.anIntArray312[local1] = -this.anIntArray312[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2747; local18++) {
			@Pc(24) int local24 = this.anIntArray305[local18];
			this.anIntArray305[local18] = this.anIntArray307[local18];
			this.anIntArray307[local18] = local24;
		}
		this.method1935();
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "()V")
	public void method1947() {
		if (this.aBoolean115) {
			return;
		}
		this.aBoolean115 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2746; local20++) {
			@Pc(26) int local26 = this.anIntArray304[local20];
			@Pc(31) int local31 = this.anIntArray308[local20];
			@Pc(36) int local36 = this.anIntArray312[local20];
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
		this.aShort29 = (short) local8;
		this.aShort28 = (short) local14;
		super.aShort34 = (short) local10;
		this.aShort32 = (short) local16;
		this.aShort33 = (short) local12;
		this.aShort30 = (short) local18;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([B)V")
	private void method1948(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg0);
		@Pc(13) Class3_Sub4 local13 = new Class3_Sub4(arg0);
		@Pc(18) Class3_Sub4 local18 = new Class3_Sub4(arg0);
		@Pc(23) Class3_Sub4 local23 = new Class3_Sub4(arg0);
		@Pc(28) Class3_Sub4 local28 = new Class3_Sub4(arg0);
		local8.anInt232 = arg0.length - 18;
		@Pc(38) int local38 = local8.method208();
		@Pc(42) int local42 = local8.method208();
		@Pc(46) int local46 = local8.method191();
		@Pc(50) int local50 = local8.method191();
		@Pc(54) int local54 = local8.method191();
		@Pc(58) int local58 = local8.method191();
		@Pc(62) int local62 = local8.method191();
		@Pc(66) int local66 = local8.method191();
		@Pc(70) int local70 = local8.method208();
		@Pc(74) int local74 = local8.method208();
		@Pc(78) int local78 = local8.method208();
		@Pc(82) int local82 = local8.method208();
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
		this.anInt2746 = local38;
		this.anInt2747 = local42;
		this.anInt2748 = local46;
		this.anIntArray304 = new int[local38];
		this.anIntArray308 = new int[local38];
		this.anIntArray312 = new int[local38];
		this.anIntArray305 = new int[local42];
		this.anIntArray306 = new int[local42];
		this.anIntArray307 = new int[local42];
		if (local46 > 0) {
			this.aByteArray28 = new byte[local46];
			this.aShortArray20 = new short[local46];
			this.aShortArray18 = new short[local46];
			this.aShortArray21 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray314 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray30 = new byte[local42];
			this.aByteArray27 = new byte[local42];
			this.aShortArray22 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray34 = new byte[local42];
		} else {
			this.aByte5 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray26 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray315 = new int[local42];
		}
		this.aShortArray19 = new short[local42];
		local8.anInt232 = 0;
		local13.anInt232 = local165;
		local18.anInt232 = local171;
		local23.anInt232 = local90;
		local28.anInt232 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method191();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method216();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method216();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method216();
			}
			this.anIntArray304[local307] = local301 + local314;
			this.anIntArray308[local307] = local303 + local324;
			this.anIntArray312[local307] = local305 + local334;
			local301 = this.anIntArray304[local307];
			local303 = this.anIntArray308[local307];
			local305 = this.anIntArray312[local307];
			if (local66 == 1) {
				this.anIntArray314[local307] = local28.method191();
			}
		}
		local8.anInt232 = local149;
		local13.anInt232 = local116;
		local18.anInt232 = local98;
		local23.anInt232 = local134;
		local28.anInt232 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray19[local312] = (short) local8.method208();
			if (local50 == 1) {
				local314 = local13.method191();
				if ((local314 & 0x1) == 1) {
					this.aByteArray30[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray30[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray27[local312] = (byte) (local314 >> 2);
					this.aShortArray22[local312] = this.aShortArray19[local312];
					this.aShortArray19[local312] = 127;
					if (this.aShortArray22[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray27[local312] = -1;
					this.aShortArray22[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray34[local312] = local18.method203();
			}
			if (local58 == 1) {
				this.aByteArray26[local312] = local23.method203();
			}
			if (local62 == 1) {
				this.anIntArray315[local312] = local28.method191();
			}
		}
		local8.anInt232 = local143;
		local13.anInt232 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method191();
			if (local543 == 1) {
				local314 = local8.method216() + local536;
				local324 = local8.method216() + local314;
				local334 = local8.method216() + local324;
				local536 = local334;
				this.anIntArray305[local538] = local314;
				this.anIntArray306[local538] = local324;
				this.anIntArray307[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method216() + local536;
				local536 = local334;
				this.anIntArray305[local538] = local314;
				this.anIntArray306[local538] = local324;
				this.anIntArray307[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method216() + local536;
				local536 = local334;
				this.anIntArray305[local538] = local314;
				this.anIntArray306[local538] = local324;
				this.anIntArray307[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method216() + local536;
				local536 = local334;
				this.anIntArray305[local538] = local314;
				this.anIntArray306[local538] = local646;
				this.anIntArray307[local538] = local334;
			}
		}
		local8.anInt232 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray28[local543] = 0;
			this.aShortArray20[local543] = (short) local8.method208();
			this.aShortArray18[local543] = (short) local8.method208();
			this.aShortArray21[local543] = (short) local8.method208();
		}
		if (this.aByteArray27 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray27[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray20[local731] & 0xFFFF) == this.anIntArray305[local723] && (this.aShortArray18[local731] & 0xFFFF) == this.anIntArray306[local723] && (this.aShortArray21[local731] & 0xFFFF) == this.anIntArray307[local723]) {
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
			this.aShortArray22 = null;
		}
		if (!local1) {
			this.aByteArray30 = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)Lclient!ng;")
	public Class3_Sub2_Sub1_Sub2_Sub1 method1949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class3_Sub2_Sub1_Sub2_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oe;I)I")
	private int method1950(@OriginalArg(0) Class3_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray304[arg1];
		@Pc(11) int local11 = arg0.anIntArray308[arg1];
		@Pc(16) int local16 = arg0.anIntArray312[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2746; local18++) {
			if (local6 == this.anIntArray304[local18] && local11 == this.anIntArray308[local18] && local16 == this.anIntArray312[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray304[this.anInt2746] = local6;
			this.anIntArray308[this.anInt2746] = local11;
			this.anIntArray312[this.anInt2746] = local16;
			if (arg0.anIntArray314 != null) {
				this.anIntArray314[this.anInt2746] = arg0.anIntArray314[arg1];
			}
			local1 = this.anInt2746++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "()V")
	public void method1951() {
		if (this.aClass79Array2 != null) {
			return;
		}
		this.aClass79Array2 = new Class79[this.anInt2746];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2746; local10++) {
			this.aClass79Array2[local10] = new Class79();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2747; local25++) {
			@Pc(31) int local31 = this.anIntArray305[local25];
			@Pc(36) int local36 = this.anIntArray306[local25];
			@Pc(41) int local41 = this.anIntArray307[local25];
			@Pc(51) int local51 = this.anIntArray304[local36] - this.anIntArray304[local31];
			@Pc(61) int local61 = this.anIntArray308[local36] - this.anIntArray308[local31];
			@Pc(71) int local71 = this.anIntArray312[local36] - this.anIntArray312[local31];
			@Pc(81) int local81 = this.anIntArray304[local41] - this.anIntArray304[local31];
			@Pc(91) int local91 = this.anIntArray308[local41] - this.anIntArray308[local31];
			@Pc(101) int local101 = this.anIntArray312[local41] - this.anIntArray312[local31];
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
			if (this.aByteArray30 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray30[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class79 local211 = this.aClass79Array2[local31];
				local211.anInt3528 += local109;
				local211.anInt3527 += local117;
				local211.anInt3529 += local125;
				local211.anInt3526++;
				@Pc(240) Class79 local240 = this.aClass79Array2[local36];
				local240.anInt3528 += local109;
				local240.anInt3527 += local117;
				local240.anInt3529 += local125;
				local240.anInt3526++;
				@Pc(269) Class79 local269 = this.aClass79Array2[local41];
				local269.anInt3528 += local109;
				local269.anInt3527 += local117;
				local269.anInt3529 += local125;
				local269.anInt3526++;
			} else if (local198 == 1) {
				if (this.aClass37Array1 == null) {
					this.aClass37Array1 = new Class37[this.anInt2747];
				}
				@Pc(314) Class37 local314 = this.aClass37Array1[local25] = new Class37();
				local314.anInt1767 = local109;
				local314.anInt1771 = local117;
				local314.anInt1770 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)V")
	public void method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2746; local1++) {
			this.anIntArray304[local1] += arg0;
			this.anIntArray308[local1] += arg1;
			this.anIntArray312[local1] += arg2;
		}
		this.method1935();
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "([B)V")
	private void method1953(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub4 local4 = new Class3_Sub4(arg0);
		@Pc(9) Class3_Sub4 local9 = new Class3_Sub4(arg0);
		@Pc(14) Class3_Sub4 local14 = new Class3_Sub4(arg0);
		@Pc(19) Class3_Sub4 local19 = new Class3_Sub4(arg0);
		@Pc(24) Class3_Sub4 local24 = new Class3_Sub4(arg0);
		@Pc(29) Class3_Sub4 local29 = new Class3_Sub4(arg0);
		@Pc(34) Class3_Sub4 local34 = new Class3_Sub4(arg0);
		local4.anInt232 = arg0.length - 23;
		@Pc(44) int local44 = local4.method208();
		@Pc(48) int local48 = local4.method208();
		@Pc(52) int local52 = local4.method191();
		@Pc(56) int local56 = local4.method191();
		@Pc(60) int local60 = local4.method191();
		@Pc(64) int local64 = local4.method191();
		@Pc(68) int local68 = local4.method191();
		@Pc(72) int local72 = local4.method191();
		@Pc(76) int local76 = local4.method191();
		@Pc(80) int local80 = local4.method208();
		@Pc(84) int local84 = local4.method208();
		@Pc(88) int local88 = local4.method208();
		@Pc(92) int local92 = local4.method208();
		@Pc(96) int local96 = local4.method208();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray28 = new byte[local52];
			local4.anInt232 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray28[local113] = local4.method203();
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
		this.anInt2746 = local44;
		this.anInt2747 = local48;
		this.anInt2748 = local52;
		this.anIntArray304 = new int[local44];
		this.anIntArray308 = new int[local44];
		this.anIntArray312 = new int[local44];
		this.anIntArray305 = new int[local48];
		this.anIntArray306 = new int[local48];
		this.anIntArray307 = new int[local48];
		if (local76 == 1) {
			this.anIntArray314 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray30 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray34 = new byte[local48];
		} else {
			this.aByte5 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray26 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray315 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray22 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray27 = new byte[local48];
		}
		this.aShortArray19 = new short[local48];
		if (local52 > 0) {
			this.aShortArray20 = new short[local52];
			this.aShortArray18 = new short[local52];
			this.aShortArray21 = new short[local52];
			if (local100 > 0) {
				this.aShortArray24 = new short[local100];
				this.aShortArray23 = new short[local100];
				this.aShortArray17 = new short[local100];
				this.aByteArray33 = new byte[local100];
				this.aByteArray29 = new byte[local100];
				this.aByteArray31 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray35 = new byte[local102];
				this.aByteArray32 = new byte[local102];
			}
		}
		local4.anInt232 = local52;
		local9.anInt232 = local233;
		local14.anInt232 = local239;
		local19.anInt232 = local245;
		local24.anInt232 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method191();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method216();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method216();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method216();
			}
			this.anIntArray304[local463] = local457 + local470;
			this.anIntArray308[local463] = local459 + local480;
			this.anIntArray312[local463] = local461 + local490;
			local457 = this.anIntArray304[local463];
			local459 = this.anIntArray308[local463];
			local461 = this.anIntArray312[local463];
			if (local76 == 1) {
				this.anIntArray314[local463] = local24.method191();
			}
		}
		local4.anInt232 = local225;
		local9.anInt232 = local151;
		local14.anInt232 = local166;
		local19.anInt232 = local193;
		local24.anInt232 = local175;
		local29.anInt232 = local208;
		local34.anInt232 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray19[local468] = (short) local4.method208();
			if (local56 == 1) {
				this.aByteArray30[local468] = local9.method203();
			}
			if (local60 == 255) {
				this.aByteArray34[local468] = local14.method203();
			}
			if (local64 == 1) {
				this.aByteArray26[local468] = local19.method203();
			}
			if (local68 == 1) {
				this.anIntArray315[local468] = local24.method191();
			}
			if (local72 == 1) {
				this.aShortArray22[local468] = (short) (local29.method208() - 1);
			}
			if (this.aByteArray27 != null) {
				if (this.aShortArray22[local468] == -1) {
					this.aByteArray27[local468] = -1;
				} else {
					this.aByteArray27[local468] = (byte) (local34.method191() - 1);
				}
			}
		}
		local4.anInt232 = local202;
		local9.anInt232 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method191();
			if (local683 == 1) {
				local470 = local4.method216() + local676;
				local480 = local4.method216() + local470;
				local490 = local4.method216() + local480;
				local676 = local490;
				this.anIntArray305[local678] = local470;
				this.anIntArray306[local678] = local480;
				this.anIntArray307[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method216() + local676;
				local676 = local490;
				this.anIntArray305[local678] = local470;
				this.anIntArray306[local678] = local480;
				this.anIntArray307[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method216() + local676;
				local676 = local490;
				this.anIntArray305[local678] = local470;
				this.anIntArray306[local678] = local480;
				this.anIntArray307[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method216() + local676;
				local676 = local490;
				this.anIntArray305[local678] = local470;
				this.anIntArray306[local678] = local786;
				this.anIntArray307[local678] = local490;
			}
		}
		local4.anInt232 = local251;
		local9.anInt232 = local259;
		local14.anInt232 = local267;
		local19.anInt232 = local275;
		local24.anInt232 = local281;
		local29.anInt232 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray28[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray20[local683] = (short) local4.method208();
				this.aShortArray18[local683] = (short) local4.method208();
				this.aShortArray21[local683] = (short) local4.method208();
			}
			if (local786 == 1) {
				this.aShortArray20[local683] = (short) local9.method208();
				this.aShortArray18[local683] = (short) local9.method208();
				this.aShortArray21[local683] = (short) local9.method208();
				this.aShortArray24[local683] = (short) local14.method208();
				this.aShortArray23[local683] = (short) local14.method208();
				this.aShortArray17[local683] = (short) local14.method208();
				this.aByteArray33[local683] = local19.method203();
				this.aByteArray29[local683] = local24.method203();
				this.aByteArray31[local683] = local29.method203();
			}
			if (local786 == 2) {
				this.aShortArray20[local683] = (short) local9.method208();
				this.aShortArray18[local683] = (short) local9.method208();
				this.aShortArray21[local683] = (short) local9.method208();
				this.aShortArray24[local683] = (short) local14.method208();
				this.aShortArray23[local683] = (short) local14.method208();
				this.aShortArray17[local683] = (short) local14.method208();
				this.aByteArray33[local683] = local19.method203();
				this.aByteArray29[local683] = local24.method203();
				this.aByteArray31[local683] = local29.method203();
				this.aByteArray35[local683] = local29.method203();
				this.aByteArray32[local683] = local29.method203();
			}
			if (local786 == 3) {
				this.aShortArray20[local683] = (short) local9.method208();
				this.aShortArray18[local683] = (short) local9.method208();
				this.aShortArray21[local683] = (short) local9.method208();
				this.aShortArray24[local683] = (short) local14.method208();
				this.aShortArray23[local683] = (short) local14.method208();
				this.aShortArray17[local683] = (short) local14.method208();
				this.aByteArray33[local683] = local19.method203();
				this.aByteArray29[local683] = local24.method203();
				this.aByteArray31[local683] = local29.method203();
			}
		}
		local4.anInt232 = local113;
		local786 = local4.method191();
		if (local786 == 0) {
			return;
		}
		new Class4();
		local4.method208();
		local4.method208();
		local4.method208();
		local4.method213();
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(SS)V")
	public void method1954(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2747; local1++) {
			if (this.aShortArray19[local1] == arg0) {
				this.aShortArray19[local1] = arg1;
			}
		}
	}
}
