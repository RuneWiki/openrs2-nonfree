import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class1_Sub1_Sub4_Sub3 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "[Lclient!oc;")
	public Class60[] aClass60Array1;

	@OriginalMember(owner = "client!ei", name = "U", descriptor = "S")
	public short aShort23;

	@OriginalMember(owner = "client!ei", name = "V", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ei", name = "Y", descriptor = "S")
	public short aShort24;

	@OriginalMember(owner = "client!ei", name = "Z", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!ei", name = "ab", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!ei", name = "bb", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!ei", name = "db", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!ei", name = "eb", descriptor = "S")
	public short aShort25;

	@OriginalMember(owner = "client!ei", name = "fb", descriptor = "S")
	public short aShort26;

	@OriginalMember(owner = "client!ei", name = "gb", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!ei", name = "hb", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!ei", name = "jb", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!ei", name = "kb", descriptor = "[[I")
	public int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!ei", name = "mb", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!ei", name = "pb", descriptor = "S")
	public short aShort27;

	@OriginalMember(owner = "client!ei", name = "qb", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!ei", name = "rb", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!ei", name = "sb", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!ei", name = "ub", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!ei", name = "vb", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!ei", name = "wb", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!ei", name = "xb", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!ei", name = "yb", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!ei", name = "zb", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!ei", name = "Ab", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ei", name = "Bb", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!ei", name = "Cb", descriptor = "I")
	public int anInt1509;

	@OriginalMember(owner = "client!ei", name = "Db", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!ei", name = "Eb", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!ei", name = "Fb", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!ei", name = "Gb", descriptor = "[Lclient!cf;")
	public Class13[] aClass13Array1;

	@OriginalMember(owner = "client!ei", name = "Hb", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!ei", name = "Ib", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!ei", name = "Jb", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!ei", name = "Kb", descriptor = "[Lclient!cf;")
	public Class13[] aClass13Array2;

	@OriginalMember(owner = "client!ei", name = "Mb", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!ei", name = "Nb", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
	public int anInt1506 = 0;

	@OriginalMember(owner = "client!ei", name = "ib", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!ei", name = "tb", descriptor = "I")
	public int anInt1508 = 0;

	@OriginalMember(owner = "client!ei", name = "Ob", descriptor = "B")
	public byte aByte3 = 0;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub4_Sub3() {
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub4_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1141(arg0);
		} else {
			this.method1134(arg0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([Lclient!ei;I)V")
	public Class1_Sub1_Sub4_Sub3(@OriginalArg(0) Class1_Sub1_Sub4_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt1506 = 0;
		this.anInt1508 = 0;
		this.anInt1509 = 0;
		this.aByte3 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class1_Sub1_Sub4_Sub3 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt1506 += local44.anInt1506;
				this.anInt1508 += local44.anInt1508;
				this.anInt1509 += local44.anInt1509;
				if (local44.aByteArray23 == null) {
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
				local19 |= local44.aByteArray18 != null;
				local21 |= local44.anIntArray164 != null;
				local23 |= local44.aShortArray17 != null;
				local25 |= local44.aByteArray19 != null;
			}
		}
		this.anIntArray162 = new int[this.anInt1506];
		this.anIntArray158 = new int[this.anInt1506];
		this.anIntArray161 = new int[this.anInt1506];
		this.anIntArray154 = new int[this.anInt1506];
		this.anIntArray153 = new int[this.anInt1508];
		this.anIntArray159 = new int[this.anInt1508];
		this.anIntArray160 = new int[this.anInt1508];
		if (local15) {
			this.aByteArray17 = new byte[this.anInt1508];
		}
		if (local17) {
			this.aByteArray23 = new byte[this.anInt1508];
		}
		if (local19) {
			this.aByteArray18 = new byte[this.anInt1508];
		}
		if (local21) {
			this.anIntArray164 = new int[this.anInt1508];
		}
		if (local23) {
			this.aShortArray17 = new short[this.anInt1508];
		}
		if (local25) {
			this.aByteArray19 = new byte[this.anInt1508];
		}
		this.aShortArray16 = new short[this.anInt1508];
		if (this.anInt1509 > 0) {
			this.aByteArray21 = new byte[this.anInt1509];
			this.aShortArray15 = new short[this.anInt1509];
			this.aShortArray14 = new short[this.anInt1509];
			this.aShortArray18 = new short[this.anInt1509];
			this.aShortArray12 = new short[this.anInt1509];
			this.aShortArray11 = new short[this.anInt1509];
			this.aShortArray13 = new short[this.anInt1509];
			this.aByteArray20 = new byte[this.anInt1509];
			this.aByteArray22 = new byte[this.anInt1509];
			this.aByteArray14 = new byte[this.anInt1509];
			this.aByteArray15 = new byte[this.anInt1509];
			this.aByteArray16 = new byte[this.anInt1509];
		}
		this.anInt1506 = 0;
		this.anInt1508 = 0;
		this.anInt1509 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class1_Sub1_Sub4_Sub3 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt1508; local302++) {
					if (local15 && local298.aByteArray17 != null) {
						this.aByteArray17[this.anInt1508] = local298.aByteArray17[local302];
					}
					if (local17) {
						if (local298.aByteArray23 == null) {
							this.aByteArray23[this.anInt1508] = local298.aByte3;
						} else {
							this.aByteArray23[this.anInt1508] = local298.aByteArray23[local302];
						}
					}
					if (local19 && local298.aByteArray18 != null) {
						this.aByteArray18[this.anInt1508] = local298.aByteArray18[local302];
					}
					if (local21 && local298.anIntArray164 != null) {
						this.anIntArray164[this.anInt1508] = local298.anIntArray164[local302];
					}
					if (local23) {
						if (local298.aShortArray17 == null) {
							this.aShortArray17[this.anInt1508] = -1;
						} else {
							this.aShortArray17[this.anInt1508] = local298.aShortArray17[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray19 == null || local298.aByteArray19[local302] == -1) {
							this.aByteArray19[this.anInt1508] = -1;
						} else {
							this.aByteArray19[this.anInt1508] = (byte) (local298.aByteArray19[local302] + this.anInt1509);
						}
					}
					this.aShortArray16[this.anInt1508] = local298.aShortArray16[local302];
					this.anIntArray153[this.anInt1508] = this.method1148(local298, local298.anIntArray153[local302]);
					this.anIntArray159[this.anInt1508] = this.method1148(local298, local298.anIntArray159[local302]);
					this.anIntArray160[this.anInt1508] = this.method1148(local298, local298.anIntArray160[local302]);
					this.anInt1508++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt1509; local477++) {
					@Pc(489) byte local489 = this.aByteArray21[this.anInt1509] = local298.aByteArray21[local477];
					if (local489 == 0) {
						this.aShortArray15[this.anInt1509] = (short) this.method1148(local298, local298.aShortArray15[local477]);
						this.aShortArray14[this.anInt1509] = (short) this.method1148(local298, local298.aShortArray14[local477]);
						this.aShortArray18[this.anInt1509] = (short) this.method1148(local298, local298.aShortArray18[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray15[this.anInt1509] = local298.aShortArray15[local477];
						this.aShortArray14[this.anInt1509] = local298.aShortArray14[local477];
						this.aShortArray18[this.anInt1509] = local298.aShortArray18[local477];
						this.aShortArray12[this.anInt1509] = local298.aShortArray12[local477];
						this.aShortArray11[this.anInt1509] = local298.aShortArray11[local477];
						this.aShortArray13[this.anInt1509] = local298.aShortArray13[local477];
						this.aByteArray20[this.anInt1509] = local298.aByteArray20[local477];
						this.aByteArray22[this.anInt1509] = local298.aByteArray22[local477];
						this.aByteArray14[this.anInt1509] = local298.aByteArray14[local477];
					}
					if (local489 == 2) {
						this.aByteArray15[this.anInt1509] = local298.aByteArray15[local477];
						this.aByteArray16[this.anInt1509] = local298.aByteArray16[local477];
					}
					this.anInt1509++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!ei;ZZZZ)V")
	public Class1_Sub1_Sub4_Sub3(@OriginalArg(0) Class1_Sub1_Sub4_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1506 = arg0.anInt1506;
		this.anInt1508 = arg0.anInt1508;
		this.anInt1509 = arg0.anInt1509;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray162 = arg0.anIntArray162;
			this.anIntArray158 = arg0.anIntArray158;
			this.anIntArray161 = arg0.anIntArray161;
		} else {
			this.anIntArray162 = new int[this.anInt1506];
			this.anIntArray158 = new int[this.anInt1506];
			this.anIntArray161 = new int[this.anInt1506];
			for (local57 = 0; local57 < this.anInt1506; local57++) {
				this.anIntArray162[local57] = arg0.anIntArray162[local57];
				this.anIntArray158[local57] = arg0.anIntArray158[local57];
				this.anIntArray161[local57] = arg0.anIntArray161[local57];
			}
		}
		if (arg2) {
			this.aShortArray16 = arg0.aShortArray16;
		} else {
			this.aShortArray16 = new short[this.anInt1508];
			for (local57 = 0; local57 < this.anInt1508; local57++) {
				this.aShortArray16[local57] = arg0.aShortArray16[local57];
			}
		}
		if (arg3 || arg0.aShortArray17 == null) {
			this.aShortArray17 = arg0.aShortArray17;
		} else {
			this.aShortArray17 = new short[this.anInt1508];
			for (local57 = 0; local57 < this.anInt1508; local57++) {
				this.aShortArray17[local57] = arg0.aShortArray17[local57];
			}
		}
		this.aByteArray18 = arg0.aByteArray18;
		this.anIntArray153 = arg0.anIntArray153;
		this.anIntArray159 = arg0.anIntArray159;
		this.anIntArray160 = arg0.anIntArray160;
		this.aByteArray17 = arg0.aByteArray17;
		this.aByteArray23 = arg0.aByteArray23;
		this.aByteArray19 = arg0.aByteArray19;
		this.aByte3 = arg0.aByte3;
		this.aByteArray21 = arg0.aByteArray21;
		this.aShortArray15 = arg0.aShortArray15;
		this.aShortArray14 = arg0.aShortArray14;
		this.aShortArray18 = arg0.aShortArray18;
		this.aShortArray12 = arg0.aShortArray12;
		this.aShortArray11 = arg0.aShortArray11;
		this.aShortArray13 = arg0.aShortArray13;
		this.aByteArray20 = arg0.aByteArray20;
		this.aByteArray22 = arg0.aByteArray22;
		this.aByteArray14 = arg0.aByteArray14;
		this.aByteArray15 = arg0.aByteArray15;
		this.aByteArray16 = arg0.aByteArray16;
		this.anIntArray154 = arg0.anIntArray154;
		this.anIntArray164 = arg0.anIntArray164;
		this.anIntArrayArray13 = arg0.anIntArrayArray13;
		this.anIntArrayArray14 = arg0.anIntArrayArray14;
		this.aClass13Array1 = arg0.aClass13Array1;
		this.aClass60Array1 = arg0.aClass60Array1;
		this.aClass13Array2 = arg0.aClass13Array2;
		this.aShort24 = arg0.aShort24;
		this.aShort25 = arg0.aShort25;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
	public void method1128() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1506; local1++) {
			@Pc(7) int local7 = this.anIntArray161[local1];
			this.anIntArray161[local1] = this.anIntArray162[local1];
			this.anIntArray162[local1] = -local7;
		}
		this.method1138();
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()V")
	public void method1129() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1506; local1++) {
			@Pc(7) int local7 = this.anIntArray162[local1];
			this.anIntArray162[local1] = this.anIntArray161[local1];
			this.anIntArray161[local1] = -local7;
		}
		this.method1138();
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "()V")
	public void method1131() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1508; local1++) {
			@Pc(7) int local7 = this.anIntArray153[local1];
			this.anIntArray153[local1] = this.anIntArray160[local1];
			this.anIntArray160[local1] = local7;
		}
		this.method1138();
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "()V")
	public void method1132() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray154 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1506; local9++) {
				local15 = this.anIntArray154[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray13 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray13[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt1506) {
				local65 = this.anIntArray154[local59];
				this.anIntArrayArray13[local65][local5[local65]++] = local59++;
			}
			this.anIntArray154 = null;
		}
		if (this.anIntArray164 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1508; local9++) {
			local15 = this.anIntArray164[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray14 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray14[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1508) {
			local65 = this.anIntArray164[local59];
			this.anIntArrayArray14[local65][local5[local65]++] = local59++;
		}
		this.anIntArray164 = null;
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "()Lclient!ei;")
	public Class1_Sub1_Sub4_Sub3 method1133() {
		@Pc(3) Class1_Sub1_Sub4_Sub3 local3 = new Class1_Sub1_Sub4_Sub3();
		if (this.aByteArray17 != null) {
			local3.aByteArray17 = new byte[this.anInt1508];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1508; local13++) {
				local3.aByteArray17[local13] = this.aByteArray17[local13];
			}
		}
		local3.anInt1506 = this.anInt1506;
		local3.anInt1508 = this.anInt1508;
		local3.anInt1509 = this.anInt1509;
		local3.anIntArray162 = this.anIntArray162;
		local3.anIntArray158 = this.anIntArray158;
		local3.anIntArray161 = this.anIntArray161;
		local3.anIntArray153 = this.anIntArray153;
		local3.anIntArray159 = this.anIntArray159;
		local3.anIntArray160 = this.anIntArray160;
		local3.aByteArray23 = this.aByteArray23;
		local3.aByteArray18 = this.aByteArray18;
		local3.aByteArray19 = this.aByteArray19;
		local3.aShortArray16 = this.aShortArray16;
		local3.aShortArray17 = this.aShortArray17;
		local3.aByte3 = this.aByte3;
		local3.aByteArray21 = this.aByteArray21;
		local3.aShortArray15 = this.aShortArray15;
		local3.aShortArray14 = this.aShortArray14;
		local3.aShortArray18 = this.aShortArray18;
		local3.aShortArray12 = this.aShortArray12;
		local3.aShortArray11 = this.aShortArray11;
		local3.aShortArray13 = this.aShortArray13;
		local3.aByteArray20 = this.aByteArray20;
		local3.aByteArray22 = this.aByteArray22;
		local3.aByteArray14 = this.aByteArray14;
		local3.aByteArray15 = this.aByteArray15;
		local3.aByteArray16 = this.aByteArray16;
		local3.anIntArray154 = this.anIntArray154;
		local3.anIntArray164 = this.anIntArray164;
		local3.anIntArrayArray13 = this.anIntArrayArray13;
		local3.anIntArrayArray14 = this.anIntArrayArray14;
		local3.aClass13Array1 = this.aClass13Array1;
		local3.aClass60Array1 = this.aClass60Array1;
		local3.aShort24 = this.aShort24;
		local3.aShort25 = this.aShort25;
		return local3;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([B)V")
	private void method1134(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub9 local8 = new Class1_Sub9(arg0);
		@Pc(13) Class1_Sub9 local13 = new Class1_Sub9(arg0);
		@Pc(18) Class1_Sub9 local18 = new Class1_Sub9(arg0);
		@Pc(23) Class1_Sub9 local23 = new Class1_Sub9(arg0);
		@Pc(28) Class1_Sub9 local28 = new Class1_Sub9(arg0);
		local8.anInt1592 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1280();
		@Pc(42) int local42 = local8.method1280();
		@Pc(46) int local46 = local8.method1234();
		@Pc(50) int local50 = local8.method1234();
		@Pc(54) int local54 = local8.method1234();
		@Pc(58) int local58 = local8.method1234();
		@Pc(62) int local62 = local8.method1234();
		@Pc(66) int local66 = local8.method1234();
		@Pc(70) int local70 = local8.method1280();
		@Pc(74) int local74 = local8.method1280();
		@Pc(78) int local78 = local8.method1280();
		@Pc(82) int local82 = local8.method1280();
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
		this.anInt1506 = local38;
		this.anInt1508 = local42;
		this.anInt1509 = local46;
		this.anIntArray162 = new int[local38];
		this.anIntArray158 = new int[local38];
		this.anIntArray161 = new int[local38];
		this.anIntArray153 = new int[local42];
		this.anIntArray159 = new int[local42];
		this.anIntArray160 = new int[local42];
		if (local46 > 0) {
			this.aByteArray21 = new byte[local46];
			this.aShortArray15 = new short[local46];
			this.aShortArray14 = new short[local46];
			this.aShortArray18 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray154 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray17 = new byte[local42];
			this.aByteArray19 = new byte[local42];
			this.aShortArray17 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray23 = new byte[local42];
		} else {
			this.aByte3 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray18 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray164 = new int[local42];
		}
		this.aShortArray16 = new short[local42];
		local8.anInt1592 = 0;
		local13.anInt1592 = local165;
		local18.anInt1592 = local171;
		local23.anInt1592 = local90;
		local28.anInt1592 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1234();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1247();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1247();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1247();
			}
			this.anIntArray162[local307] = local301 + local314;
			this.anIntArray158[local307] = local303 + local324;
			this.anIntArray161[local307] = local305 + local334;
			local301 = this.anIntArray162[local307];
			local303 = this.anIntArray158[local307];
			local305 = this.anIntArray161[local307];
			if (local66 == 1) {
				this.anIntArray154[local307] = local28.method1234();
			}
		}
		local8.anInt1592 = local149;
		local13.anInt1592 = local116;
		local18.anInt1592 = local98;
		local23.anInt1592 = local134;
		local28.anInt1592 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray16[local312] = (short) local8.method1280();
			if (local50 == 1) {
				local314 = local13.method1234();
				if ((local314 & 0x1) == 1) {
					this.aByteArray17[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray17[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray19[local312] = (byte) (local314 >> 2);
					this.aShortArray17[local312] = this.aShortArray16[local312];
					this.aShortArray16[local312] = 127;
					if (this.aShortArray17[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray19[local312] = -1;
					this.aShortArray17[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray23[local312] = local18.method1243();
			}
			if (local58 == 1) {
				this.aByteArray18[local312] = local23.method1243();
			}
			if (local62 == 1) {
				this.anIntArray164[local312] = local28.method1234();
			}
		}
		local8.anInt1592 = local143;
		local13.anInt1592 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1234();
			if (local543 == 1) {
				local314 = local8.method1247() + local536;
				local324 = local8.method1247() + local314;
				local334 = local8.method1247() + local324;
				local536 = local334;
				this.anIntArray153[local538] = local314;
				this.anIntArray159[local538] = local324;
				this.anIntArray160[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1247() + local536;
				local536 = local334;
				this.anIntArray153[local538] = local314;
				this.anIntArray159[local538] = local324;
				this.anIntArray160[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1247() + local536;
				local536 = local334;
				this.anIntArray153[local538] = local314;
				this.anIntArray159[local538] = local324;
				this.anIntArray160[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1247() + local536;
				local536 = local334;
				this.anIntArray153[local538] = local314;
				this.anIntArray159[local538] = local646;
				this.anIntArray160[local538] = local334;
			}
		}
		local8.anInt1592 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray21[local543] = 0;
			this.aShortArray15[local543] = (short) local8.method1280();
			this.aShortArray14[local543] = (short) local8.method1280();
			this.aShortArray18[local543] = (short) local8.method1280();
		}
		if (this.aByteArray19 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray19[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray15[local731] & 0xFFFF) == this.anIntArray153[local723] && (this.aShortArray14[local731] & 0xFFFF) == this.anIntArray159[local723] && (this.aShortArray18[local731] & 0xFFFF) == this.anIntArray160[local723]) {
						this.aByteArray19[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray19 = null;
			}
		}
		if (!local3) {
			this.aShortArray17 = null;
		}
		if (!local1) {
			this.aByteArray17 = null;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIZZ)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class1_Sub1_Sub4_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
	public void method1136() {
		@Pc(3) int local3 = Static46.anIntArray156[256];
		@Pc(7) int local7 = Static46.anIntArray157[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1506; local9++) {
			@Pc(26) int local26 = this.anIntArray161[local9] * local3 + this.anIntArray162[local9] * local7 >> 16;
			this.anIntArray161[local9] = this.anIntArray161[local9] * local7 - this.anIntArray162[local9] * local3 >> 16;
			this.anIntArray162[local9] = local26;
		}
		this.method1138();
	}

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "()V")
	public void method1137() {
		if (this.aBoolean59) {
			return;
		}
		this.aBoolean59 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1506; local20++) {
			@Pc(26) int local26 = this.anIntArray162[local20];
			@Pc(31) int local31 = this.anIntArray158[local20];
			@Pc(36) int local36 = this.anIntArray161[local20];
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
		this.aShort23 = (short) local8;
		this.aShort29 = (short) local14;
		super.aShort36 = (short) local10;
		this.aShort28 = (short) local16;
		this.aShort26 = (short) local12;
		this.aShort27 = (short) local18;
	}

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "()V")
	private void method1138() {
		this.aClass13Array1 = null;
		this.aClass13Array2 = null;
		this.aClass60Array1 = null;
		this.aBoolean59 = false;
	}

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "()V")
	public void method1139() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1506; local1++) {
			this.anIntArray162[local1] = -this.anIntArray162[local1];
			this.anIntArray161[local1] = -this.anIntArray161[local1];
		}
		this.method1138();
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)V")
	public void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1506; local1++) {
			this.anIntArray162[local1] = this.anIntArray162[local1] * arg0 / 128;
			this.anIntArray158[local1] = this.anIntArray158[local1] * arg1 / 128;
			this.anIntArray161[local1] = this.anIntArray161[local1] * arg2 / 128;
		}
		this.method1138();
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "([B)V")
	private void method1141(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub9 local4 = new Class1_Sub9(arg0);
		@Pc(9) Class1_Sub9 local9 = new Class1_Sub9(arg0);
		@Pc(14) Class1_Sub9 local14 = new Class1_Sub9(arg0);
		@Pc(19) Class1_Sub9 local19 = new Class1_Sub9(arg0);
		@Pc(24) Class1_Sub9 local24 = new Class1_Sub9(arg0);
		@Pc(29) Class1_Sub9 local29 = new Class1_Sub9(arg0);
		@Pc(34) Class1_Sub9 local34 = new Class1_Sub9(arg0);
		local4.anInt1592 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1280();
		@Pc(48) int local48 = local4.method1280();
		@Pc(52) int local52 = local4.method1234();
		@Pc(56) int local56 = local4.method1234();
		@Pc(60) int local60 = local4.method1234();
		@Pc(64) int local64 = local4.method1234();
		@Pc(68) int local68 = local4.method1234();
		@Pc(72) int local72 = local4.method1234();
		@Pc(76) int local76 = local4.method1234();
		@Pc(80) int local80 = local4.method1280();
		@Pc(84) int local84 = local4.method1280();
		@Pc(88) int local88 = local4.method1280();
		@Pc(92) int local92 = local4.method1280();
		@Pc(96) int local96 = local4.method1280();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray21 = new byte[local52];
			local4.anInt1592 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray21[local113] = local4.method1243();
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
		this.anInt1506 = local44;
		this.anInt1508 = local48;
		this.anInt1509 = local52;
		this.anIntArray162 = new int[local44];
		this.anIntArray158 = new int[local44];
		this.anIntArray161 = new int[local44];
		this.anIntArray153 = new int[local48];
		this.anIntArray159 = new int[local48];
		this.anIntArray160 = new int[local48];
		if (local76 == 1) {
			this.anIntArray154 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray17 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray23 = new byte[local48];
		} else {
			this.aByte3 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray18 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray164 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray17 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray19 = new byte[local48];
		}
		this.aShortArray16 = new short[local48];
		if (local52 > 0) {
			this.aShortArray15 = new short[local52];
			this.aShortArray14 = new short[local52];
			this.aShortArray18 = new short[local52];
			if (local100 > 0) {
				this.aShortArray12 = new short[local100];
				this.aShortArray11 = new short[local100];
				this.aShortArray13 = new short[local100];
				this.aByteArray20 = new byte[local100];
				this.aByteArray22 = new byte[local100];
				this.aByteArray14 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray15 = new byte[local102];
				this.aByteArray16 = new byte[local102];
			}
		}
		local4.anInt1592 = local52;
		local9.anInt1592 = local233;
		local14.anInt1592 = local239;
		local19.anInt1592 = local245;
		local24.anInt1592 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1234();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1247();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1247();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1247();
			}
			this.anIntArray162[local463] = local457 + local470;
			this.anIntArray158[local463] = local459 + local480;
			this.anIntArray161[local463] = local461 + local490;
			local457 = this.anIntArray162[local463];
			local459 = this.anIntArray158[local463];
			local461 = this.anIntArray161[local463];
			if (local76 == 1) {
				this.anIntArray154[local463] = local24.method1234();
			}
		}
		local4.anInt1592 = local225;
		local9.anInt1592 = local151;
		local14.anInt1592 = local166;
		local19.anInt1592 = local193;
		local24.anInt1592 = local175;
		local29.anInt1592 = local208;
		local34.anInt1592 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray16[local468] = (short) local4.method1280();
			if (local56 == 1) {
				this.aByteArray17[local468] = local9.method1243();
			}
			if (local60 == 255) {
				this.aByteArray23[local468] = local14.method1243();
			}
			if (local64 == 1) {
				this.aByteArray18[local468] = local19.method1243();
			}
			if (local68 == 1) {
				this.anIntArray164[local468] = local24.method1234();
			}
			if (local72 == 1) {
				this.aShortArray17[local468] = (short) (local29.method1280() - 1);
			}
			if (this.aByteArray19 != null) {
				if (this.aShortArray17[local468] == -1) {
					this.aByteArray19[local468] = -1;
				} else {
					this.aByteArray19[local468] = (byte) (local34.method1234() - 1);
				}
			}
		}
		local4.anInt1592 = local202;
		local9.anInt1592 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1234();
			if (local683 == 1) {
				local470 = local4.method1247() + local676;
				local480 = local4.method1247() + local470;
				local490 = local4.method1247() + local480;
				local676 = local490;
				this.anIntArray153[local678] = local470;
				this.anIntArray159[local678] = local480;
				this.anIntArray160[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1247() + local676;
				local676 = local490;
				this.anIntArray153[local678] = local470;
				this.anIntArray159[local678] = local480;
				this.anIntArray160[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1247() + local676;
				local676 = local490;
				this.anIntArray153[local678] = local470;
				this.anIntArray159[local678] = local480;
				this.anIntArray160[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1247() + local676;
				local676 = local490;
				this.anIntArray153[local678] = local470;
				this.anIntArray159[local678] = local786;
				this.anIntArray160[local678] = local490;
			}
		}
		local4.anInt1592 = local251;
		local9.anInt1592 = local259;
		local14.anInt1592 = local267;
		local19.anInt1592 = local275;
		local24.anInt1592 = local281;
		local29.anInt1592 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray21[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray15[local683] = (short) local4.method1280();
				this.aShortArray14[local683] = (short) local4.method1280();
				this.aShortArray18[local683] = (short) local4.method1280();
			}
			if (local786 == 1) {
				this.aShortArray15[local683] = (short) local9.method1280();
				this.aShortArray14[local683] = (short) local9.method1280();
				this.aShortArray18[local683] = (short) local9.method1280();
				this.aShortArray12[local683] = (short) local14.method1280();
				this.aShortArray11[local683] = (short) local14.method1280();
				this.aShortArray13[local683] = (short) local14.method1280();
				this.aByteArray20[local683] = local19.method1243();
				this.aByteArray22[local683] = local24.method1243();
				this.aByteArray14[local683] = local29.method1243();
			}
			if (local786 == 2) {
				this.aShortArray15[local683] = (short) local9.method1280();
				this.aShortArray14[local683] = (short) local9.method1280();
				this.aShortArray18[local683] = (short) local9.method1280();
				this.aShortArray12[local683] = (short) local14.method1280();
				this.aShortArray11[local683] = (short) local14.method1280();
				this.aShortArray13[local683] = (short) local14.method1280();
				this.aByteArray20[local683] = local19.method1243();
				this.aByteArray22[local683] = local24.method1243();
				this.aByteArray14[local683] = local29.method1243();
				this.aByteArray15[local683] = local29.method1243();
				this.aByteArray16[local683] = local29.method1243();
			}
			if (local786 == 3) {
				this.aShortArray15[local683] = (short) local9.method1280();
				this.aShortArray14[local683] = (short) local9.method1280();
				this.aShortArray18[local683] = (short) local9.method1280();
				this.aShortArray12[local683] = (short) local14.method1280();
				this.aShortArray11[local683] = (short) local14.method1280();
				this.aShortArray13[local683] = (short) local14.method1280();
				this.aByteArray20[local683] = local19.method1243();
				this.aByteArray22[local683] = local24.method1243();
				this.aByteArray14[local683] = local29.method1243();
			}
		}
		local4.anInt1592 = local113;
		local786 = local4.method1234();
		if (local786 == 0) {
			return;
		}
		new Class24();
		local4.method1280();
		local4.method1280();
		local4.method1280();
		local4.method1273();
	}

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "()V")
	public void method1143() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1506; local1++) {
			this.anIntArray161[local1] = -this.anIntArray161[local1];
		}
		this.method1138();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([[IIIIZI)Lclient!ei;")
	public Class1_Sub1_Sub4_Sub3 method1145(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1137();
		@Pc(6) int local6 = arg1 + this.aShort23;
		@Pc(11) int local11 = arg1 + this.aShort29;
		@Pc(16) int local16 = arg3 + this.aShort26;
		@Pc(21) int local21 = arg3 + this.aShort27;
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
		@Pc(101) Class1_Sub1_Sub4_Sub3 local101 = new Class1_Sub1_Sub4_Sub3();
		local101.anInt1506 = this.anInt1506;
		local101.anInt1508 = this.anInt1508;
		local101.anInt1509 = this.anInt1509;
		local101.anIntArray162 = this.anIntArray162;
		local101.anIntArray161 = this.anIntArray161;
		local101.anIntArray153 = this.anIntArray153;
		local101.anIntArray159 = this.anIntArray159;
		local101.anIntArray160 = this.anIntArray160;
		local101.aByteArray17 = this.aByteArray17;
		local101.aByteArray23 = this.aByteArray23;
		local101.aByteArray18 = this.aByteArray18;
		local101.aByteArray19 = this.aByteArray19;
		local101.aShortArray16 = this.aShortArray16;
		local101.aShortArray17 = this.aShortArray17;
		local101.aByte3 = this.aByte3;
		local101.aByteArray21 = this.aByteArray21;
		local101.aShortArray15 = this.aShortArray15;
		local101.aShortArray14 = this.aShortArray14;
		local101.aShortArray18 = this.aShortArray18;
		local101.aShortArray12 = this.aShortArray12;
		local101.aShortArray11 = this.aShortArray11;
		local101.aShortArray13 = this.aShortArray13;
		local101.aByteArray20 = this.aByteArray20;
		local101.aByteArray22 = this.aByteArray22;
		local101.aByteArray14 = this.aByteArray14;
		local101.aByteArray15 = this.aByteArray15;
		local101.aByteArray16 = this.aByteArray16;
		local101.anIntArray154 = this.anIntArray154;
		local101.anIntArray164 = this.anIntArray164;
		local101.anIntArrayArray13 = this.anIntArrayArray13;
		local101.anIntArrayArray14 = this.anIntArrayArray14;
		local101.aShort24 = this.aShort24;
		local101.aShort25 = this.aShort25;
		local101.anIntArray158 = new int[local101.anInt1506];
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
			for (local245 = 0; local245 < local101.anInt1506; local245++) {
				local253 = this.anIntArray162[local245] + arg1;
				local260 = this.anIntArray161[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray158[local245] = this.anIntArray158[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt1506; local245++) {
				local253 = (this.anIntArray158[local245] << 16) / super.aShort36;
				if (local253 < arg4) {
					local260 = this.anIntArray162[local245] + arg1;
					local264 = this.anIntArray161[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray158[local245] = this.anIntArray158[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray158[local245] = this.anIntArray158[local245];
				}
			}
		}
		local101.method1138();
		return local101;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(SS)V")
	public void method1146(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1508; local1++) {
			if (this.aShortArray16[local1] == arg0) {
				this.aShortArray16[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(III)V")
	public void method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1506; local1++) {
			this.anIntArray162[local1] += arg0;
			this.anIntArray158[local1] += arg1;
			this.anIntArray161[local1] += arg2;
		}
		this.method1138();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ei;I)I")
	private int method1148(@OriginalArg(0) Class1_Sub1_Sub4_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray162[arg1];
		@Pc(11) int local11 = arg0.anIntArray158[arg1];
		@Pc(16) int local16 = arg0.anIntArray161[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1506; local18++) {
			if (local6 == this.anIntArray162[local18] && local11 == this.anIntArray158[local18] && local16 == this.anIntArray161[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray162[this.anInt1506] = local6;
			this.anIntArray158[this.anInt1506] = local11;
			this.anIntArray161[this.anInt1506] = local16;
			if (arg0.anIntArray154 != null) {
				this.anIntArray154[this.anInt1506] = arg0.anIntArray154[arg1];
			}
			local1 = this.anInt1506++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(SS)V")
	public void method1149(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray17 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt1508; local5++) {
			if (this.aShortArray17[local5] == arg0) {
				this.aShortArray17[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "()V")
	public void method1150() {
		if (this.aClass13Array1 != null) {
			return;
		}
		this.aClass13Array1 = new Class13[this.anInt1506];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1506; local10++) {
			this.aClass13Array1[local10] = new Class13();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1508; local25++) {
			@Pc(31) int local31 = this.anIntArray153[local25];
			@Pc(36) int local36 = this.anIntArray159[local25];
			@Pc(41) int local41 = this.anIntArray160[local25];
			@Pc(51) int local51 = this.anIntArray162[local36] - this.anIntArray162[local31];
			@Pc(61) int local61 = this.anIntArray158[local36] - this.anIntArray158[local31];
			@Pc(71) int local71 = this.anIntArray161[local36] - this.anIntArray161[local31];
			@Pc(81) int local81 = this.anIntArray162[local41] - this.anIntArray162[local31];
			@Pc(91) int local91 = this.anIntArray158[local41] - this.anIntArray158[local31];
			@Pc(101) int local101 = this.anIntArray161[local41] - this.anIntArray161[local31];
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
				@Pc(211) Class13 local211 = this.aClass13Array1[local31];
				local211.anInt702 += local109;
				local211.anInt700 += local117;
				local211.anInt705 += local125;
				local211.anInt703++;
				@Pc(240) Class13 local240 = this.aClass13Array1[local36];
				local240.anInt702 += local109;
				local240.anInt700 += local117;
				local240.anInt705 += local125;
				local240.anInt703++;
				@Pc(269) Class13 local269 = this.aClass13Array1[local41];
				local269.anInt702 += local109;
				local269.anInt700 += local117;
				local269.anInt705 += local125;
				local269.anInt703++;
			} else if (local198 == 1) {
				if (this.aClass60Array1 == null) {
					this.aClass60Array1 = new Class60[this.anInt1508];
				}
				@Pc(314) Class60 local314 = this.aClass60Array1[local25] = new Class60();
				local314.anInt3343 = local109;
				local314.anInt3342 = local117;
				local314.anInt3346 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)Lclient!ci;")
	public Class1_Sub1_Sub4_Sub1_Sub1 method1151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class1_Sub1_Sub4_Sub1_Sub1(this, arg0, arg1, -50, -10, -50);
	}
}
