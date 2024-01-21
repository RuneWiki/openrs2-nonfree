import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class2_Sub2_Sub1_Sub3 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!fe", name = "kb", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!fe", name = "lb", descriptor = "S")
	public short aShort20;

	@OriginalMember(owner = "client!fe", name = "mb", descriptor = "[Lclient!qc;")
	public Class65[] aClass65Array1;

	@OriginalMember(owner = "client!fe", name = "nb", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!fe", name = "ob", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!fe", name = "pb", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!fe", name = "qb", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!fe", name = "rb", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!fe", name = "ub", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!fe", name = "vb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!fe", name = "wb", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!fe", name = "xb", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!fe", name = "yb", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!fe", name = "zb", descriptor = "S")
	public short aShort22;

	@OriginalMember(owner = "client!fe", name = "Ab", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!fe", name = "Bb", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!fe", name = "Cb", descriptor = "S")
	public short aShort23;

	@OriginalMember(owner = "client!fe", name = "Db", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!fe", name = "Gb", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!fe", name = "Ib", descriptor = "S")
	public short aShort24;

	@OriginalMember(owner = "client!fe", name = "Kb", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!fe", name = "Lb", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!fe", name = "Mb", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!fe", name = "Nb", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!fe", name = "Ob", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!fe", name = "Pb", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!fe", name = "Qb", descriptor = "[Lclient!tf;")
	public Class80[] aClass80Array1;

	@OriginalMember(owner = "client!fe", name = "Sb", descriptor = "S")
	public short aShort25;

	@OriginalMember(owner = "client!fe", name = "Tb", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!fe", name = "Ub", descriptor = "[I")
	public int[] anIntArray202;

	@OriginalMember(owner = "client!fe", name = "Vb", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!fe", name = "Wb", descriptor = "I")
	public int anInt1246;

	@OriginalMember(owner = "client!fe", name = "Xb", descriptor = "[[I")
	public int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!fe", name = "Zb", descriptor = "[I")
	public int[] anIntArray204;

	@OriginalMember(owner = "client!fe", name = "ac", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!fe", name = "bc", descriptor = "[Lclient!qc;")
	public Class65[] aClass65Array2;

	@OriginalMember(owner = "client!fe", name = "cc", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!fe", name = "dc", descriptor = "S")
	public short aShort26;

	@OriginalMember(owner = "client!fe", name = "ec", descriptor = "[I")
	public int[] anIntArray206;

	@OriginalMember(owner = "client!fe", name = "Eb", descriptor = "I")
	public int anInt1244 = 0;

	@OriginalMember(owner = "client!fe", name = "tb", descriptor = "I")
	public int anInt1243 = 0;

	@OriginalMember(owner = "client!fe", name = "Rb", descriptor = "B")
	public byte aByte3 = 0;

	@OriginalMember(owner = "client!fe", name = "Jb", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	private Class2_Sub2_Sub1_Sub3() {
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub1_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method874(arg0);
		} else {
			this.method879(arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([Lclient!fe;I)V")
	public Class2_Sub2_Sub1_Sub3(@OriginalArg(0) Class2_Sub2_Sub1_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt1244 = 0;
		this.anInt1243 = 0;
		this.anInt1246 = 0;
		this.aByte3 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class2_Sub2_Sub1_Sub3 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt1244 += local44.anInt1244;
				this.anInt1243 += local44.anInt1243;
				this.anInt1246 += local44.anInt1246;
				if (local44.aByteArray16 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local44.aByte3;
					}
					if (this.aByte3 != local44.aByte3) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray18 != null;
				local19 |= local44.aByteArray14 != null;
				local21 |= local44.anIntArray197 != null;
				local23 |= local44.aShortArray39 != null;
				local25 |= local44.aByteArray13 != null;
			}
		}
		this.anIntArray199 = new int[this.anInt1244];
		this.anIntArray202 = new int[this.anInt1244];
		this.anIntArray200 = new int[this.anInt1244];
		this.anIntArray196 = new int[this.anInt1244];
		this.anIntArray204 = new int[this.anInt1243];
		this.anIntArray206 = new int[this.anInt1243];
		this.anIntArray205 = new int[this.anInt1243];
		if (local15) {
			this.aByteArray18 = new byte[this.anInt1243];
		}
		if (local17) {
			this.aByteArray16 = new byte[this.anInt1243];
		}
		if (local19) {
			this.aByteArray14 = new byte[this.anInt1243];
		}
		if (local21) {
			this.anIntArray197 = new int[this.anInt1243];
		}
		if (local23) {
			this.aShortArray39 = new short[this.anInt1243];
		}
		if (local25) {
			this.aByteArray13 = new byte[this.anInt1243];
		}
		this.aShortArray38 = new short[this.anInt1243];
		if (this.anInt1246 > 0) {
			this.aByteArray12 = new byte[this.anInt1246];
			this.aShortArray42 = new short[this.anInt1246];
			this.aShortArray36 = new short[this.anInt1246];
			this.aShortArray41 = new short[this.anInt1246];
			this.aShortArray40 = new short[this.anInt1246];
			this.aShortArray43 = new short[this.anInt1246];
			this.aShortArray37 = new short[this.anInt1246];
			this.aByteArray15 = new byte[this.anInt1246];
			this.aByteArray20 = new byte[this.anInt1246];
			this.aByteArray21 = new byte[this.anInt1246];
			this.aByteArray19 = new byte[this.anInt1246];
			this.aByteArray17 = new byte[this.anInt1246];
		}
		this.anInt1244 = 0;
		this.anInt1243 = 0;
		this.anInt1246 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class2_Sub2_Sub1_Sub3 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt1243; local302++) {
					if (local15 && local298.aByteArray18 != null) {
						this.aByteArray18[this.anInt1243] = local298.aByteArray18[local302];
					}
					if (local17) {
						if (local298.aByteArray16 == null) {
							this.aByteArray16[this.anInt1243] = local298.aByte3;
						} else {
							this.aByteArray16[this.anInt1243] = local298.aByteArray16[local302];
						}
					}
					if (local19 && local298.aByteArray14 != null) {
						this.aByteArray14[this.anInt1243] = local298.aByteArray14[local302];
					}
					if (local21 && local298.anIntArray197 != null) {
						this.anIntArray197[this.anInt1243] = local298.anIntArray197[local302];
					}
					if (local23) {
						if (local298.aShortArray39 == null) {
							this.aShortArray39[this.anInt1243] = -1;
						} else {
							this.aShortArray39[this.anInt1243] = local298.aShortArray39[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray13 == null || local298.aByteArray13[local302] == -1) {
							this.aByteArray13[this.anInt1243] = -1;
						} else {
							this.aByteArray13[this.anInt1243] = (byte) (local298.aByteArray13[local302] + this.anInt1246);
						}
					}
					this.aShortArray38[this.anInt1243] = local298.aShortArray38[local302];
					this.anIntArray204[this.anInt1243] = this.method861(local298, local298.anIntArray204[local302]);
					this.anIntArray206[this.anInt1243] = this.method861(local298, local298.anIntArray206[local302]);
					this.anIntArray205[this.anInt1243] = this.method861(local298, local298.anIntArray205[local302]);
					this.anInt1243++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt1246; local477++) {
					@Pc(489) byte local489 = this.aByteArray12[this.anInt1246] = local298.aByteArray12[local477];
					if (local489 == 0) {
						this.aShortArray42[this.anInt1246] = (short) this.method861(local298, local298.aShortArray42[local477]);
						this.aShortArray36[this.anInt1246] = (short) this.method861(local298, local298.aShortArray36[local477]);
						this.aShortArray41[this.anInt1246] = (short) this.method861(local298, local298.aShortArray41[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray42[this.anInt1246] = local298.aShortArray42[local477];
						this.aShortArray36[this.anInt1246] = local298.aShortArray36[local477];
						this.aShortArray41[this.anInt1246] = local298.aShortArray41[local477];
						this.aShortArray40[this.anInt1246] = local298.aShortArray40[local477];
						this.aShortArray43[this.anInt1246] = local298.aShortArray43[local477];
						this.aShortArray37[this.anInt1246] = local298.aShortArray37[local477];
						this.aByteArray15[this.anInt1246] = local298.aByteArray15[local477];
						this.aByteArray20[this.anInt1246] = local298.aByteArray20[local477];
						this.aByteArray21[this.anInt1246] = local298.aByteArray21[local477];
					}
					if (local489 == 2) {
						this.aByteArray19[this.anInt1246] = local298.aByteArray19[local477];
						this.aByteArray17[this.anInt1246] = local298.aByteArray17[local477];
					}
					this.anInt1246++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!fe;ZZZZ)V")
	public Class2_Sub2_Sub1_Sub3(@OriginalArg(0) Class2_Sub2_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1244 = arg0.anInt1244;
		this.anInt1243 = arg0.anInt1243;
		this.anInt1246 = arg0.anInt1246;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray199 = arg0.anIntArray199;
			this.anIntArray202 = arg0.anIntArray202;
			this.anIntArray200 = arg0.anIntArray200;
		} else {
			this.anIntArray199 = new int[this.anInt1244];
			this.anIntArray202 = new int[this.anInt1244];
			this.anIntArray200 = new int[this.anInt1244];
			for (local57 = 0; local57 < this.anInt1244; local57++) {
				this.anIntArray199[local57] = arg0.anIntArray199[local57];
				this.anIntArray202[local57] = arg0.anIntArray202[local57];
				this.anIntArray200[local57] = arg0.anIntArray200[local57];
			}
		}
		if (arg2) {
			this.aShortArray38 = arg0.aShortArray38;
		} else {
			this.aShortArray38 = new short[this.anInt1243];
			for (local57 = 0; local57 < this.anInt1243; local57++) {
				this.aShortArray38[local57] = arg0.aShortArray38[local57];
			}
		}
		if (arg3 || arg0.aShortArray39 == null) {
			this.aShortArray39 = arg0.aShortArray39;
		} else {
			this.aShortArray39 = new short[this.anInt1243];
			for (local57 = 0; local57 < this.anInt1243; local57++) {
				this.aShortArray39[local57] = arg0.aShortArray39[local57];
			}
		}
		this.aByteArray14 = arg0.aByteArray14;
		this.anIntArray204 = arg0.anIntArray204;
		this.anIntArray206 = arg0.anIntArray206;
		this.anIntArray205 = arg0.anIntArray205;
		this.aByteArray18 = arg0.aByteArray18;
		this.aByteArray16 = arg0.aByteArray16;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByte3 = arg0.aByte3;
		this.aByteArray12 = arg0.aByteArray12;
		this.aShortArray42 = arg0.aShortArray42;
		this.aShortArray36 = arg0.aShortArray36;
		this.aShortArray41 = arg0.aShortArray41;
		this.aShortArray40 = arg0.aShortArray40;
		this.aShortArray43 = arg0.aShortArray43;
		this.aShortArray37 = arg0.aShortArray37;
		this.aByteArray15 = arg0.aByteArray15;
		this.aByteArray20 = arg0.aByteArray20;
		this.aByteArray21 = arg0.aByteArray21;
		this.aByteArray19 = arg0.aByteArray19;
		this.aByteArray17 = arg0.aByteArray17;
		this.anIntArray196 = arg0.anIntArray196;
		this.anIntArray197 = arg0.anIntArray197;
		this.anIntArrayArray13 = arg0.anIntArrayArray13;
		this.anIntArrayArray12 = arg0.anIntArrayArray12;
		this.aClass65Array1 = arg0.aClass65Array1;
		this.aClass80Array1 = arg0.aClass80Array1;
		this.aClass65Array2 = arg0.aClass65Array2;
		this.aShort24 = arg0.aShort24;
		this.aShort21 = arg0.aShort21;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public void method859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1244; local1++) {
			this.anIntArray199[local1] = this.anIntArray199[local1] * arg0 / 128;
			this.anIntArray202[local1] = this.anIntArray202[local1] * arg1 / 128;
			this.anIntArray200[local1] = this.anIntArray200[local1] * arg2 / 128;
		}
		this.method866();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()Lclient!fe;")
	public Class2_Sub2_Sub1_Sub3 method860() {
		@Pc(3) Class2_Sub2_Sub1_Sub3 local3 = new Class2_Sub2_Sub1_Sub3();
		if (this.aByteArray18 != null) {
			local3.aByteArray18 = new byte[this.anInt1243];
			for (@Pc(13) int local13 = 0; local13 < this.anInt1243; local13++) {
				local3.aByteArray18[local13] = this.aByteArray18[local13];
			}
		}
		local3.anInt1244 = this.anInt1244;
		local3.anInt1243 = this.anInt1243;
		local3.anInt1246 = this.anInt1246;
		local3.anIntArray199 = this.anIntArray199;
		local3.anIntArray202 = this.anIntArray202;
		local3.anIntArray200 = this.anIntArray200;
		local3.anIntArray204 = this.anIntArray204;
		local3.anIntArray206 = this.anIntArray206;
		local3.anIntArray205 = this.anIntArray205;
		local3.aByteArray16 = this.aByteArray16;
		local3.aByteArray14 = this.aByteArray14;
		local3.aByteArray13 = this.aByteArray13;
		local3.aShortArray38 = this.aShortArray38;
		local3.aShortArray39 = this.aShortArray39;
		local3.aByte3 = this.aByte3;
		local3.aByteArray12 = this.aByteArray12;
		local3.aShortArray42 = this.aShortArray42;
		local3.aShortArray36 = this.aShortArray36;
		local3.aShortArray41 = this.aShortArray41;
		local3.aShortArray40 = this.aShortArray40;
		local3.aShortArray43 = this.aShortArray43;
		local3.aShortArray37 = this.aShortArray37;
		local3.aByteArray15 = this.aByteArray15;
		local3.aByteArray20 = this.aByteArray20;
		local3.aByteArray21 = this.aByteArray21;
		local3.aByteArray19 = this.aByteArray19;
		local3.aByteArray17 = this.aByteArray17;
		local3.anIntArray196 = this.anIntArray196;
		local3.anIntArray197 = this.anIntArray197;
		local3.anIntArrayArray13 = this.anIntArrayArray13;
		local3.anIntArrayArray12 = this.anIntArrayArray12;
		local3.aClass65Array1 = this.aClass65Array1;
		local3.aClass80Array1 = this.aClass80Array1;
		local3.aShort24 = this.aShort24;
		local3.aShort21 = this.aShort21;
		return local3;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!fe;I)I")
	private int method861(@OriginalArg(0) Class2_Sub2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray199[arg1];
		@Pc(11) int local11 = arg0.anIntArray202[arg1];
		@Pc(16) int local16 = arg0.anIntArray200[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1244; local18++) {
			if (local6 == this.anIntArray199[local18] && local11 == this.anIntArray202[local18] && local16 == this.anIntArray200[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray199[this.anInt1244] = local6;
			this.anIntArray202[this.anInt1244] = local11;
			this.anIntArray200[this.anInt1244] = local16;
			if (arg0.anIntArray196 != null) {
				this.anIntArray196[this.anInt1244] = arg0.anIntArray196[arg1];
			}
			local1 = this.anInt1244++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
	public void method863() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray196 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1244; local9++) {
				local15 = this.anIntArray196[local9];
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
			while (local59 < this.anInt1244) {
				local65 = this.anIntArray196[local59];
				this.anIntArrayArray13[local65][local5[local65]++] = local59++;
			}
			this.anIntArray196 = null;
		}
		if (this.anIntArray197 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1243; local9++) {
			local15 = this.anIntArray197[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray12 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray12[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt1243) {
			local65 = this.anIntArray197[local59];
			this.anIntArrayArray12[local65][local5[local65]++] = local59++;
		}
		this.anIntArray197 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(SS)V")
	public void method864(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1243; local1++) {
			if (this.aShortArray38[local1] == arg0) {
				this.aShortArray38[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIZZ)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class2_Sub2_Sub1_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
	private void method866() {
		this.aClass65Array1 = null;
		this.aClass65Array2 = null;
		this.aClass80Array1 = null;
		this.aBoolean64 = false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)Lclient!da;")
	public Class2_Sub2_Sub1_Sub2_Sub1 method867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class2_Sub2_Sub1_Sub2_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
	public void method868() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1244; local1++) {
			this.anIntArray199[local1] = -this.anIntArray199[local1];
			this.anIntArray200[local1] = -this.anIntArray200[local1];
		}
		this.method866();
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V")
	public void method869() {
		@Pc(3) int local3 = Static47.anIntArray195[256];
		@Pc(7) int local7 = Static47.anIntArray203[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1244; local9++) {
			@Pc(26) int local26 = this.anIntArray200[local9] * local3 + this.anIntArray199[local9] * local7 >> 16;
			this.anIntArray200[local9] = this.anIntArray200[local9] * local7 - this.anIntArray199[local9] * local3 >> 16;
			this.anIntArray199[local9] = local26;
		}
		this.method866();
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "()V")
	public void method870() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1244; local1++) {
			this.anIntArray200[local1] = -this.anIntArray200[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt1243; local18++) {
			@Pc(24) int local24 = this.anIntArray204[local18];
			this.anIntArray204[local18] = this.anIntArray205[local18];
			this.anIntArray205[local18] = local24;
		}
		this.method866();
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
	public void method871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1244; local1++) {
			this.anIntArray199[local1] += arg0;
			this.anIntArray202[local1] += arg1;
			this.anIntArray200[local1] += arg2;
		}
		this.method866();
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "()V")
	public void method872() {
		if (this.aBoolean64) {
			return;
		}
		this.aBoolean64 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1244; local20++) {
			@Pc(26) int local26 = this.anIntArray199[local20];
			@Pc(31) int local31 = this.anIntArray202[local20];
			@Pc(36) int local36 = this.anIntArray200[local20];
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
		this.aShort25 = (short) local14;
		super.aShort32 = (short) local10;
		this.aShort26 = (short) local16;
		this.aShort22 = (short) local12;
		this.aShort20 = (short) local18;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([[IIIIZI)Lclient!fe;")
	public Class2_Sub2_Sub1_Sub3 method873(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method872();
		@Pc(6) int local6 = arg1 + this.aShort23;
		@Pc(11) int local11 = arg1 + this.aShort25;
		@Pc(16) int local16 = arg3 + this.aShort22;
		@Pc(21) int local21 = arg3 + this.aShort20;
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
		@Pc(101) Class2_Sub2_Sub1_Sub3 local101 = new Class2_Sub2_Sub1_Sub3();
		local101.anInt1244 = this.anInt1244;
		local101.anInt1243 = this.anInt1243;
		local101.anInt1246 = this.anInt1246;
		local101.anIntArray199 = this.anIntArray199;
		local101.anIntArray200 = this.anIntArray200;
		local101.anIntArray204 = this.anIntArray204;
		local101.anIntArray206 = this.anIntArray206;
		local101.anIntArray205 = this.anIntArray205;
		local101.aByteArray18 = this.aByteArray18;
		local101.aByteArray16 = this.aByteArray16;
		local101.aByteArray14 = this.aByteArray14;
		local101.aByteArray13 = this.aByteArray13;
		local101.aShortArray38 = this.aShortArray38;
		local101.aShortArray39 = this.aShortArray39;
		local101.aByte3 = this.aByte3;
		local101.aByteArray12 = this.aByteArray12;
		local101.aShortArray42 = this.aShortArray42;
		local101.aShortArray36 = this.aShortArray36;
		local101.aShortArray41 = this.aShortArray41;
		local101.aShortArray40 = this.aShortArray40;
		local101.aShortArray43 = this.aShortArray43;
		local101.aShortArray37 = this.aShortArray37;
		local101.aByteArray15 = this.aByteArray15;
		local101.aByteArray20 = this.aByteArray20;
		local101.aByteArray21 = this.aByteArray21;
		local101.aByteArray19 = this.aByteArray19;
		local101.aByteArray17 = this.aByteArray17;
		local101.anIntArray196 = this.anIntArray196;
		local101.anIntArray197 = this.anIntArray197;
		local101.anIntArrayArray13 = this.anIntArrayArray13;
		local101.anIntArrayArray12 = this.anIntArrayArray12;
		local101.aShort24 = this.aShort24;
		local101.aShort21 = this.aShort21;
		local101.anIntArray202 = new int[local101.anInt1244];
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
			for (local245 = 0; local245 < local101.anInt1244; local245++) {
				local253 = this.anIntArray199[local245] + arg1;
				local260 = this.anIntArray200[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray202[local245] = this.anIntArray202[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt1244; local245++) {
				local253 = (this.anIntArray202[local245] << 16) / super.aShort32;
				if (local253 < arg4) {
					local260 = this.anIntArray199[local245] + arg1;
					local264 = this.anIntArray200[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray202[local245] = this.anIntArray202[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray202[local245] = this.anIntArray202[local245];
				}
			}
		}
		local101.method866();
		return local101;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([B)V")
	private void method874(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub18 local4 = new Class2_Sub18(arg0);
		@Pc(9) Class2_Sub18 local9 = new Class2_Sub18(arg0);
		@Pc(14) Class2_Sub18 local14 = new Class2_Sub18(arg0);
		@Pc(19) Class2_Sub18 local19 = new Class2_Sub18(arg0);
		@Pc(24) Class2_Sub18 local24 = new Class2_Sub18(arg0);
		@Pc(29) Class2_Sub18 local29 = new Class2_Sub18(arg0);
		@Pc(34) Class2_Sub18 local34 = new Class2_Sub18(arg0);
		local4.anInt3423 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2353();
		@Pc(48) int local48 = local4.method2353();
		@Pc(52) int local52 = local4.method2387();
		@Pc(56) int local56 = local4.method2387();
		@Pc(60) int local60 = local4.method2387();
		@Pc(64) int local64 = local4.method2387();
		@Pc(68) int local68 = local4.method2387();
		@Pc(72) int local72 = local4.method2387();
		@Pc(76) int local76 = local4.method2387();
		@Pc(80) int local80 = local4.method2353();
		@Pc(84) int local84 = local4.method2353();
		@Pc(88) int local88 = local4.method2353();
		@Pc(92) int local92 = local4.method2353();
		@Pc(96) int local96 = local4.method2353();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray12 = new byte[local52];
			local4.anInt3423 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray12[local113] = local4.method2392();
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
		this.anInt1244 = local44;
		this.anInt1243 = local48;
		this.anInt1246 = local52;
		this.anIntArray199 = new int[local44];
		this.anIntArray202 = new int[local44];
		this.anIntArray200 = new int[local44];
		this.anIntArray204 = new int[local48];
		this.anIntArray206 = new int[local48];
		this.anIntArray205 = new int[local48];
		if (local76 == 1) {
			this.anIntArray196 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray18 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray16 = new byte[local48];
		} else {
			this.aByte3 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray14 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray197 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray39 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray13 = new byte[local48];
		}
		this.aShortArray38 = new short[local48];
		if (local52 > 0) {
			this.aShortArray42 = new short[local52];
			this.aShortArray36 = new short[local52];
			this.aShortArray41 = new short[local52];
			if (local100 > 0) {
				this.aShortArray40 = new short[local100];
				this.aShortArray43 = new short[local100];
				this.aShortArray37 = new short[local100];
				this.aByteArray15 = new byte[local100];
				this.aByteArray20 = new byte[local100];
				this.aByteArray21 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray19 = new byte[local102];
				this.aByteArray17 = new byte[local102];
			}
		}
		local4.anInt3423 = local52;
		local9.anInt3423 = local233;
		local14.anInt3423 = local239;
		local19.anInt3423 = local245;
		local24.anInt3423 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method2387();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method2375();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method2375();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method2375();
			}
			this.anIntArray199[local463] = local457 + local470;
			this.anIntArray202[local463] = local459 + local480;
			this.anIntArray200[local463] = local461 + local490;
			local457 = this.anIntArray199[local463];
			local459 = this.anIntArray202[local463];
			local461 = this.anIntArray200[local463];
			if (local76 == 1) {
				this.anIntArray196[local463] = local24.method2387();
			}
		}
		local4.anInt3423 = local225;
		local9.anInt3423 = local151;
		local14.anInt3423 = local166;
		local19.anInt3423 = local193;
		local24.anInt3423 = local175;
		local29.anInt3423 = local208;
		local34.anInt3423 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray38[local468] = (short) local4.method2353();
			if (local56 == 1) {
				this.aByteArray18[local468] = local9.method2392();
			}
			if (local60 == 255) {
				this.aByteArray16[local468] = local14.method2392();
			}
			if (local64 == 1) {
				this.aByteArray14[local468] = local19.method2392();
			}
			if (local68 == 1) {
				this.anIntArray197[local468] = local24.method2387();
			}
			if (local72 == 1) {
				this.aShortArray39[local468] = (short) (local29.method2353() - 1);
			}
			if (this.aByteArray13 != null) {
				if (this.aShortArray39[local468] == -1) {
					this.aByteArray13[local468] = -1;
				} else {
					this.aByteArray13[local468] = (byte) (local34.method2387() - 1);
				}
			}
		}
		local4.anInt3423 = local202;
		local9.anInt3423 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method2387();
			if (local683 == 1) {
				local470 = local4.method2375() + local676;
				local480 = local4.method2375() + local470;
				local490 = local4.method2375() + local480;
				local676 = local490;
				this.anIntArray204[local678] = local470;
				this.anIntArray206[local678] = local480;
				this.anIntArray205[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method2375() + local676;
				local676 = local490;
				this.anIntArray204[local678] = local470;
				this.anIntArray206[local678] = local480;
				this.anIntArray205[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method2375() + local676;
				local676 = local490;
				this.anIntArray204[local678] = local470;
				this.anIntArray206[local678] = local480;
				this.anIntArray205[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method2375() + local676;
				local676 = local490;
				this.anIntArray204[local678] = local470;
				this.anIntArray206[local678] = local786;
				this.anIntArray205[local678] = local490;
			}
		}
		local4.anInt3423 = local251;
		local9.anInt3423 = local259;
		local14.anInt3423 = local267;
		local19.anInt3423 = local275;
		local24.anInt3423 = local281;
		local29.anInt3423 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray12[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray42[local683] = (short) local4.method2353();
				this.aShortArray36[local683] = (short) local4.method2353();
				this.aShortArray41[local683] = (short) local4.method2353();
			}
			if (local786 == 1) {
				this.aShortArray42[local683] = (short) local9.method2353();
				this.aShortArray36[local683] = (short) local9.method2353();
				this.aShortArray41[local683] = (short) local9.method2353();
				this.aShortArray40[local683] = (short) local14.method2353();
				this.aShortArray43[local683] = (short) local14.method2353();
				this.aShortArray37[local683] = (short) local14.method2353();
				this.aByteArray15[local683] = local19.method2392();
				this.aByteArray20[local683] = local24.method2392();
				this.aByteArray21[local683] = local29.method2392();
			}
			if (local786 == 2) {
				this.aShortArray42[local683] = (short) local9.method2353();
				this.aShortArray36[local683] = (short) local9.method2353();
				this.aShortArray41[local683] = (short) local9.method2353();
				this.aShortArray40[local683] = (short) local14.method2353();
				this.aShortArray43[local683] = (short) local14.method2353();
				this.aShortArray37[local683] = (short) local14.method2353();
				this.aByteArray15[local683] = local19.method2392();
				this.aByteArray20[local683] = local24.method2392();
				this.aByteArray21[local683] = local29.method2392();
				this.aByteArray19[local683] = local29.method2392();
				this.aByteArray17[local683] = local29.method2392();
			}
			if (local786 == 3) {
				this.aShortArray42[local683] = (short) local9.method2353();
				this.aShortArray36[local683] = (short) local9.method2353();
				this.aShortArray41[local683] = (short) local9.method2353();
				this.aShortArray40[local683] = (short) local14.method2353();
				this.aShortArray43[local683] = (short) local14.method2353();
				this.aShortArray37[local683] = (short) local14.method2353();
				this.aByteArray15[local683] = local19.method2392();
				this.aByteArray20[local683] = local24.method2392();
				this.aByteArray21[local683] = local29.method2392();
			}
		}
		local4.anInt3423 = local113;
		local786 = local4.method2387();
		if (local786 == 0) {
			return;
		}
		new Class42();
		local4.method2353();
		local4.method2353();
		local4.method2353();
		local4.method2382();
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "()V")
	public void method875() {
		if (this.aClass65Array1 != null) {
			return;
		}
		this.aClass65Array1 = new Class65[this.anInt1244];
		for (@Pc(10) int local10 = 0; local10 < this.anInt1244; local10++) {
			this.aClass65Array1[local10] = new Class65();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt1243; local25++) {
			@Pc(31) int local31 = this.anIntArray204[local25];
			@Pc(36) int local36 = this.anIntArray206[local25];
			@Pc(41) int local41 = this.anIntArray205[local25];
			@Pc(51) int local51 = this.anIntArray199[local36] - this.anIntArray199[local31];
			@Pc(61) int local61 = this.anIntArray202[local36] - this.anIntArray202[local31];
			@Pc(71) int local71 = this.anIntArray200[local36] - this.anIntArray200[local31];
			@Pc(81) int local81 = this.anIntArray199[local41] - this.anIntArray199[local31];
			@Pc(91) int local91 = this.anIntArray202[local41] - this.anIntArray202[local31];
			@Pc(101) int local101 = this.anIntArray200[local41] - this.anIntArray200[local31];
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
			if (this.aByteArray18 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray18[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class65 local211 = this.aClass65Array1[local31];
				local211.anInt3113 += local109;
				local211.anInt3115 += local117;
				local211.anInt3117 += local125;
				local211.anInt3114++;
				@Pc(240) Class65 local240 = this.aClass65Array1[local36];
				local240.anInt3113 += local109;
				local240.anInt3115 += local117;
				local240.anInt3117 += local125;
				local240.anInt3114++;
				@Pc(269) Class65 local269 = this.aClass65Array1[local41];
				local269.anInt3113 += local109;
				local269.anInt3115 += local117;
				local269.anInt3117 += local125;
				local269.anInt3114++;
			} else if (local198 == 1) {
				if (this.aClass80Array1 == null) {
					this.aClass80Array1 = new Class80[this.anInt1243];
				}
				@Pc(314) Class80 local314 = this.aClass80Array1[local25] = new Class80();
				local314.anInt3839 = local109;
				local314.anInt3838 = local117;
				local314.anInt3841 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "()V")
	public void method878() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1244; local1++) {
			@Pc(7) int local7 = this.anIntArray199[local1];
			this.anIntArray199[local1] = this.anIntArray200[local1];
			this.anIntArray200[local1] = -local7;
		}
		this.method866();
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "([B)V")
	private void method879(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub18 local8 = new Class2_Sub18(arg0);
		@Pc(13) Class2_Sub18 local13 = new Class2_Sub18(arg0);
		@Pc(18) Class2_Sub18 local18 = new Class2_Sub18(arg0);
		@Pc(23) Class2_Sub18 local23 = new Class2_Sub18(arg0);
		@Pc(28) Class2_Sub18 local28 = new Class2_Sub18(arg0);
		local8.anInt3423 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2353();
		@Pc(42) int local42 = local8.method2353();
		@Pc(46) int local46 = local8.method2387();
		@Pc(50) int local50 = local8.method2387();
		@Pc(54) int local54 = local8.method2387();
		@Pc(58) int local58 = local8.method2387();
		@Pc(62) int local62 = local8.method2387();
		@Pc(66) int local66 = local8.method2387();
		@Pc(70) int local70 = local8.method2353();
		@Pc(74) int local74 = local8.method2353();
		@Pc(78) int local78 = local8.method2353();
		@Pc(82) int local82 = local8.method2353();
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
		this.anInt1244 = local38;
		this.anInt1243 = local42;
		this.anInt1246 = local46;
		this.anIntArray199 = new int[local38];
		this.anIntArray202 = new int[local38];
		this.anIntArray200 = new int[local38];
		this.anIntArray204 = new int[local42];
		this.anIntArray206 = new int[local42];
		this.anIntArray205 = new int[local42];
		if (local46 > 0) {
			this.aByteArray12 = new byte[local46];
			this.aShortArray42 = new short[local46];
			this.aShortArray36 = new short[local46];
			this.aShortArray41 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray196 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray18 = new byte[local42];
			this.aByteArray13 = new byte[local42];
			this.aShortArray39 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray16 = new byte[local42];
		} else {
			this.aByte3 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray14 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray197 = new int[local42];
		}
		this.aShortArray38 = new short[local42];
		local8.anInt3423 = 0;
		local13.anInt3423 = local165;
		local18.anInt3423 = local171;
		local23.anInt3423 = local90;
		local28.anInt3423 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method2387();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method2375();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method2375();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method2375();
			}
			this.anIntArray199[local307] = local301 + local314;
			this.anIntArray202[local307] = local303 + local324;
			this.anIntArray200[local307] = local305 + local334;
			local301 = this.anIntArray199[local307];
			local303 = this.anIntArray202[local307];
			local305 = this.anIntArray200[local307];
			if (local66 == 1) {
				this.anIntArray196[local307] = local28.method2387();
			}
		}
		local8.anInt3423 = local149;
		local13.anInt3423 = local116;
		local18.anInt3423 = local98;
		local23.anInt3423 = local134;
		local28.anInt3423 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray38[local312] = (short) local8.method2353();
			if (local50 == 1) {
				local314 = local13.method2387();
				if ((local314 & 0x1) == 1) {
					this.aByteArray18[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray18[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray13[local312] = (byte) (local314 >> 2);
					this.aShortArray39[local312] = this.aShortArray38[local312];
					this.aShortArray38[local312] = 127;
					if (this.aShortArray39[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray13[local312] = -1;
					this.aShortArray39[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray16[local312] = local18.method2392();
			}
			if (local58 == 1) {
				this.aByteArray14[local312] = local23.method2392();
			}
			if (local62 == 1) {
				this.anIntArray197[local312] = local28.method2387();
			}
		}
		local8.anInt3423 = local143;
		local13.anInt3423 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method2387();
			if (local543 == 1) {
				local314 = local8.method2375() + local536;
				local324 = local8.method2375() + local314;
				local334 = local8.method2375() + local324;
				local536 = local334;
				this.anIntArray204[local538] = local314;
				this.anIntArray206[local538] = local324;
				this.anIntArray205[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method2375() + local536;
				local536 = local334;
				this.anIntArray204[local538] = local314;
				this.anIntArray206[local538] = local324;
				this.anIntArray205[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method2375() + local536;
				local536 = local334;
				this.anIntArray204[local538] = local314;
				this.anIntArray206[local538] = local324;
				this.anIntArray205[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method2375() + local536;
				local536 = local334;
				this.anIntArray204[local538] = local314;
				this.anIntArray206[local538] = local646;
				this.anIntArray205[local538] = local334;
			}
		}
		local8.anInt3423 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray12[local543] = 0;
			this.aShortArray42[local543] = (short) local8.method2353();
			this.aShortArray36[local543] = (short) local8.method2353();
			this.aShortArray41[local543] = (short) local8.method2353();
		}
		if (this.aByteArray13 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray13[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray42[local731] & 0xFFFF) == this.anIntArray204[local723] && (this.aShortArray36[local731] & 0xFFFF) == this.anIntArray206[local723] && (this.aShortArray41[local731] & 0xFFFF) == this.anIntArray205[local723]) {
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
			this.aShortArray39 = null;
		}
		if (!local1) {
			this.aByteArray18 = null;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(SS)V")
	public void method880(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray39 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt1243; local5++) {
			if (this.aShortArray39[local5] == arg0) {
				this.aShortArray39[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "()V")
	public void method881() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1244; local1++) {
			@Pc(7) int local7 = this.anIntArray200[local1];
			this.anIntArray200[local1] = this.anIntArray199[local1];
			this.anIntArray199[local1] = -local7;
		}
		this.method866();
	}
}
