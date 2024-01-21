import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class2_Sub2_Sub3_Sub6 extends Class2_Sub2_Sub3 {

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!oe", name = "db", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!oe", name = "eb", descriptor = "S")
	public short aShort23;

	@OriginalMember(owner = "client!oe", name = "fb", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!oe", name = "gb", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!oe", name = "hb", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!oe", name = "ib", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!oe", name = "jb", descriptor = "S")
	public short aShort24;

	@OriginalMember(owner = "client!oe", name = "kb", descriptor = "S")
	public short aShort25;

	@OriginalMember(owner = "client!oe", name = "lb", descriptor = "I")
	public int anInt2498;

	@OriginalMember(owner = "client!oe", name = "mb", descriptor = "[Lclient!hg;")
	public Class38[] aClass38Array1;

	@OriginalMember(owner = "client!oe", name = "nb", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!oe", name = "ob", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!oe", name = "qb", descriptor = "[[I")
	public int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!oe", name = "tb", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!oe", name = "ub", descriptor = "S")
	public short aShort26;

	@OriginalMember(owner = "client!oe", name = "vb", descriptor = "[Lclient!ca;")
	public Class12[] aClass12Array1;

	@OriginalMember(owner = "client!oe", name = "wb", descriptor = "S")
	public short aShort27;

	@OriginalMember(owner = "client!oe", name = "yb", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!oe", name = "zb", descriptor = "[Lclient!hg;")
	public Class38[] aClass38Array2;

	@OriginalMember(owner = "client!oe", name = "Ab", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!oe", name = "Bb", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!oe", name = "Cb", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!oe", name = "Eb", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!oe", name = "Fb", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!oe", name = "Ib", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!oe", name = "Kb", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!oe", name = "Lb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!oe", name = "Mb", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!oe", name = "Nb", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!oe", name = "Ob", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!oe", name = "Pb", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!oe", name = "Qb", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!oe", name = "Rb", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!oe", name = "Sb", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!oe", name = "Tb", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!oe", name = "Ub", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!oe", name = "Vb", descriptor = "[[I")
	public int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!oe", name = "sb", descriptor = "I")
	public int anInt2500 = 0;

	@OriginalMember(owner = "client!oe", name = "Gb", descriptor = "I")
	public int anInt2501 = 0;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!oe", name = "Db", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	private Class2_Sub2_Sub3_Sub6() {
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub3_Sub6(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2032(arg0);
		} else {
			this.method2022(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([Lclient!oe;I)V")
	public Class2_Sub2_Sub3_Sub6(@OriginalArg(0) Class2_Sub2_Sub3_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2501 = 0;
		this.anInt2500 = 0;
		this.anInt2498 = 0;
		this.aByte7 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class2_Sub2_Sub3_Sub6 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2501 += local44.anInt2501;
				this.anInt2500 += local44.anInt2500;
				this.anInt2498 += local44.anInt2498;
				if (local44.aByteArray37 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local44.aByte7;
					}
					if (this.aByte7 != local44.aByte7) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray38 != null;
				local19 |= local44.aByteArray43 != null;
				local21 |= local44.anIntArray239 != null;
				local23 |= local44.aShortArray25 != null;
				local25 |= local44.aByteArray36 != null;
			}
		}
		this.anIntArray235 = new int[this.anInt2501];
		this.anIntArray228 = new int[this.anInt2501];
		this.anIntArray230 = new int[this.anInt2501];
		this.anIntArray238 = new int[this.anInt2501];
		this.anIntArray229 = new int[this.anInt2500];
		this.anIntArray233 = new int[this.anInt2500];
		this.anIntArray231 = new int[this.anInt2500];
		if (local15) {
			this.aByteArray38 = new byte[this.anInt2500];
		}
		if (local17) {
			this.aByteArray37 = new byte[this.anInt2500];
		}
		if (local19) {
			this.aByteArray43 = new byte[this.anInt2500];
		}
		if (local21) {
			this.anIntArray239 = new int[this.anInt2500];
		}
		if (local23) {
			this.aShortArray25 = new short[this.anInt2500];
		}
		if (local25) {
			this.aByteArray36 = new byte[this.anInt2500];
		}
		this.aShortArray30 = new short[this.anInt2500];
		if (this.anInt2498 > 0) {
			this.aByteArray44 = new byte[this.anInt2498];
			this.aShortArray28 = new short[this.anInt2498];
			this.aShortArray29 = new short[this.anInt2498];
			this.aShortArray24 = new short[this.anInt2498];
			this.aShortArray31 = new short[this.anInt2498];
			this.aShortArray26 = new short[this.anInt2498];
			this.aShortArray27 = new short[this.anInt2498];
			this.aByteArray35 = new byte[this.anInt2498];
			this.aByteArray42 = new byte[this.anInt2498];
			this.aByteArray40 = new byte[this.anInt2498];
			this.aByteArray39 = new byte[this.anInt2498];
			this.aByteArray41 = new byte[this.anInt2498];
		}
		this.anInt2501 = 0;
		this.anInt2500 = 0;
		this.anInt2498 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class2_Sub2_Sub3_Sub6 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt2500; local302++) {
					if (local15 && local298.aByteArray38 != null) {
						this.aByteArray38[this.anInt2500] = local298.aByteArray38[local302];
					}
					if (local17) {
						if (local298.aByteArray37 == null) {
							this.aByteArray37[this.anInt2500] = local298.aByte7;
						} else {
							this.aByteArray37[this.anInt2500] = local298.aByteArray37[local302];
						}
					}
					if (local19 && local298.aByteArray43 != null) {
						this.aByteArray43[this.anInt2500] = local298.aByteArray43[local302];
					}
					if (local21 && local298.anIntArray239 != null) {
						this.anIntArray239[this.anInt2500] = local298.anIntArray239[local302];
					}
					if (local23) {
						if (local298.aShortArray25 == null) {
							this.aShortArray25[this.anInt2500] = -1;
						} else {
							this.aShortArray25[this.anInt2500] = local298.aShortArray25[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray36 == null || local298.aByteArray36[local302] == -1) {
							this.aByteArray36[this.anInt2500] = -1;
						} else {
							this.aByteArray36[this.anInt2500] = (byte) (local298.aByteArray36[local302] + this.anInt2498);
						}
					}
					this.aShortArray30[this.anInt2500] = local298.aShortArray30[local302];
					this.anIntArray229[this.anInt2500] = this.method2023(local298, local298.anIntArray229[local302]);
					this.anIntArray233[this.anInt2500] = this.method2023(local298, local298.anIntArray233[local302]);
					this.anIntArray231[this.anInt2500] = this.method2023(local298, local298.anIntArray231[local302]);
					this.anInt2500++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt2498; local477++) {
					@Pc(489) byte local489 = this.aByteArray44[this.anInt2498] = local298.aByteArray44[local477];
					if (local489 == 0) {
						this.aShortArray28[this.anInt2498] = (short) this.method2023(local298, local298.aShortArray28[local477]);
						this.aShortArray29[this.anInt2498] = (short) this.method2023(local298, local298.aShortArray29[local477]);
						this.aShortArray24[this.anInt2498] = (short) this.method2023(local298, local298.aShortArray24[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray28[this.anInt2498] = local298.aShortArray28[local477];
						this.aShortArray29[this.anInt2498] = local298.aShortArray29[local477];
						this.aShortArray24[this.anInt2498] = local298.aShortArray24[local477];
						this.aShortArray31[this.anInt2498] = local298.aShortArray31[local477];
						this.aShortArray26[this.anInt2498] = local298.aShortArray26[local477];
						this.aShortArray27[this.anInt2498] = local298.aShortArray27[local477];
						this.aByteArray35[this.anInt2498] = local298.aByteArray35[local477];
						this.aByteArray42[this.anInt2498] = local298.aByteArray42[local477];
						this.aByteArray40[this.anInt2498] = local298.aByteArray40[local477];
					}
					if (local489 == 2) {
						this.aByteArray39[this.anInt2498] = local298.aByteArray39[local477];
						this.aByteArray41[this.anInt2498] = local298.aByteArray41[local477];
					}
					this.anInt2498++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!oe;ZZZZ)V")
	public Class2_Sub2_Sub3_Sub6(@OriginalArg(0) Class2_Sub2_Sub3_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2501 = arg0.anInt2501;
		this.anInt2500 = arg0.anInt2500;
		this.anInt2498 = arg0.anInt2498;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray235 = arg0.anIntArray235;
			this.anIntArray228 = arg0.anIntArray228;
			this.anIntArray230 = arg0.anIntArray230;
		} else {
			this.anIntArray235 = new int[this.anInt2501];
			this.anIntArray228 = new int[this.anInt2501];
			this.anIntArray230 = new int[this.anInt2501];
			for (local57 = 0; local57 < this.anInt2501; local57++) {
				this.anIntArray235[local57] = arg0.anIntArray235[local57];
				this.anIntArray228[local57] = arg0.anIntArray228[local57];
				this.anIntArray230[local57] = arg0.anIntArray230[local57];
			}
		}
		if (arg2) {
			this.aShortArray30 = arg0.aShortArray30;
		} else {
			this.aShortArray30 = new short[this.anInt2500];
			for (local57 = 0; local57 < this.anInt2500; local57++) {
				this.aShortArray30[local57] = arg0.aShortArray30[local57];
			}
		}
		if (arg3 || arg0.aShortArray25 == null) {
			this.aShortArray25 = arg0.aShortArray25;
		} else {
			this.aShortArray25 = new short[this.anInt2500];
			for (local57 = 0; local57 < this.anInt2500; local57++) {
				this.aShortArray25[local57] = arg0.aShortArray25[local57];
			}
		}
		this.aByteArray43 = arg0.aByteArray43;
		this.anIntArray229 = arg0.anIntArray229;
		this.anIntArray233 = arg0.anIntArray233;
		this.anIntArray231 = arg0.anIntArray231;
		this.aByteArray38 = arg0.aByteArray38;
		this.aByteArray37 = arg0.aByteArray37;
		this.aByteArray36 = arg0.aByteArray36;
		this.aByte7 = arg0.aByte7;
		this.aByteArray44 = arg0.aByteArray44;
		this.aShortArray28 = arg0.aShortArray28;
		this.aShortArray29 = arg0.aShortArray29;
		this.aShortArray24 = arg0.aShortArray24;
		this.aShortArray31 = arg0.aShortArray31;
		this.aShortArray26 = arg0.aShortArray26;
		this.aShortArray27 = arg0.aShortArray27;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByteArray42 = arg0.aByteArray42;
		this.aByteArray40 = arg0.aByteArray40;
		this.aByteArray39 = arg0.aByteArray39;
		this.aByteArray41 = arg0.aByteArray41;
		this.anIntArray238 = arg0.anIntArray238;
		this.anIntArray239 = arg0.anIntArray239;
		this.anIntArrayArray25 = arg0.anIntArrayArray25;
		this.anIntArrayArray26 = arg0.anIntArrayArray26;
		this.aClass38Array2 = arg0.aClass38Array2;
		this.aClass12Array1 = arg0.aClass12Array1;
		this.aClass38Array1 = arg0.aClass38Array1;
		this.aShort28 = arg0.aShort28;
		this.aShort27 = arg0.aShort27;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "()V")
	public void method2015() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2501; local1++) {
			@Pc(7) int local7 = this.anIntArray230[local1];
			this.anIntArray230[local1] = this.anIntArray235[local1];
			this.anIntArray235[local1] = -local7;
		}
		this.method2033();
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
	public void method2016() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2501; local1++) {
			this.anIntArray230[local1] = -this.anIntArray230[local1];
		}
		this.method2033();
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "()V")
	public void method2017() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2501; local1++) {
			this.anIntArray235[local1] = -this.anIntArray235[local1];
			this.anIntArray230[local1] = -this.anIntArray230[local1];
		}
		this.method2033();
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "()V")
	public void method2018() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2500; local1++) {
			@Pc(7) int local7 = this.anIntArray229[local1];
			this.anIntArray229[local1] = this.anIntArray231[local1];
			this.anIntArray231[local1] = local7;
		}
		this.method2033();
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "()Lclient!oe;")
	public Class2_Sub2_Sub3_Sub6 method2020() {
		@Pc(3) Class2_Sub2_Sub3_Sub6 local3 = new Class2_Sub2_Sub3_Sub6();
		if (this.aByteArray38 != null) {
			local3.aByteArray38 = new byte[this.anInt2500];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2500; local13++) {
				local3.aByteArray38[local13] = this.aByteArray38[local13];
			}
		}
		local3.anInt2501 = this.anInt2501;
		local3.anInt2500 = this.anInt2500;
		local3.anInt2498 = this.anInt2498;
		local3.anIntArray235 = this.anIntArray235;
		local3.anIntArray228 = this.anIntArray228;
		local3.anIntArray230 = this.anIntArray230;
		local3.anIntArray229 = this.anIntArray229;
		local3.anIntArray233 = this.anIntArray233;
		local3.anIntArray231 = this.anIntArray231;
		local3.aByteArray37 = this.aByteArray37;
		local3.aByteArray43 = this.aByteArray43;
		local3.aByteArray36 = this.aByteArray36;
		local3.aShortArray30 = this.aShortArray30;
		local3.aShortArray25 = this.aShortArray25;
		local3.aByte7 = this.aByte7;
		local3.aByteArray44 = this.aByteArray44;
		local3.aShortArray28 = this.aShortArray28;
		local3.aShortArray29 = this.aShortArray29;
		local3.aShortArray24 = this.aShortArray24;
		local3.aShortArray31 = this.aShortArray31;
		local3.aShortArray26 = this.aShortArray26;
		local3.aShortArray27 = this.aShortArray27;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray42 = this.aByteArray42;
		local3.aByteArray40 = this.aByteArray40;
		local3.aByteArray39 = this.aByteArray39;
		local3.aByteArray41 = this.aByteArray41;
		local3.anIntArray238 = this.anIntArray238;
		local3.anIntArray239 = this.anIntArray239;
		local3.anIntArrayArray25 = this.anIntArrayArray25;
		local3.anIntArrayArray26 = this.anIntArrayArray26;
		local3.aClass38Array2 = this.aClass38Array2;
		local3.aClass12Array1 = this.aClass12Array1;
		local3.aShort28 = this.aShort28;
		local3.aShort27 = this.aShort27;
		return local3;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([[IIIIZI)Lclient!oe;")
	public Class2_Sub2_Sub3_Sub6 method2021(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2037();
		@Pc(6) int local6 = arg1 + this.aShort25;
		@Pc(11) int local11 = arg1 + this.aShort29;
		@Pc(16) int local16 = arg3 + this.aShort24;
		@Pc(21) int local21 = arg3 + this.aShort26;
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
		@Pc(101) Class2_Sub2_Sub3_Sub6 local101 = new Class2_Sub2_Sub3_Sub6();
		local101.anInt2501 = this.anInt2501;
		local101.anInt2500 = this.anInt2500;
		local101.anInt2498 = this.anInt2498;
		local101.anIntArray235 = this.anIntArray235;
		local101.anIntArray230 = this.anIntArray230;
		local101.anIntArray229 = this.anIntArray229;
		local101.anIntArray233 = this.anIntArray233;
		local101.anIntArray231 = this.anIntArray231;
		local101.aByteArray38 = this.aByteArray38;
		local101.aByteArray37 = this.aByteArray37;
		local101.aByteArray43 = this.aByteArray43;
		local101.aByteArray36 = this.aByteArray36;
		local101.aShortArray30 = this.aShortArray30;
		local101.aShortArray25 = this.aShortArray25;
		local101.aByte7 = this.aByte7;
		local101.aByteArray44 = this.aByteArray44;
		local101.aShortArray28 = this.aShortArray28;
		local101.aShortArray29 = this.aShortArray29;
		local101.aShortArray24 = this.aShortArray24;
		local101.aShortArray31 = this.aShortArray31;
		local101.aShortArray26 = this.aShortArray26;
		local101.aShortArray27 = this.aShortArray27;
		local101.aByteArray35 = this.aByteArray35;
		local101.aByteArray42 = this.aByteArray42;
		local101.aByteArray40 = this.aByteArray40;
		local101.aByteArray39 = this.aByteArray39;
		local101.aByteArray41 = this.aByteArray41;
		local101.anIntArray238 = this.anIntArray238;
		local101.anIntArray239 = this.anIntArray239;
		local101.anIntArrayArray25 = this.anIntArrayArray25;
		local101.anIntArrayArray26 = this.anIntArrayArray26;
		local101.aShort28 = this.aShort28;
		local101.aShort27 = this.aShort27;
		local101.anIntArray228 = new int[local101.anInt2501];
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
			for (local245 = 0; local245 < local101.anInt2501; local245++) {
				local253 = this.anIntArray235[local245] + arg1;
				local260 = this.anIntArray230[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray228[local245] = this.anIntArray228[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt2501; local245++) {
				local253 = (this.anIntArray228[local245] << 16) / super.aShort34;
				if (local253 < arg4) {
					local260 = this.anIntArray235[local245] + arg1;
					local264 = this.anIntArray230[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray228[local245] = this.anIntArray228[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray228[local245] = this.anIntArray228[local245];
				}
			}
		}
		local101.method2033();
		return local101;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([B)V")
	private void method2022(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(arg0);
		@Pc(13) Class2_Sub13 local13 = new Class2_Sub13(arg0);
		@Pc(18) Class2_Sub13 local18 = new Class2_Sub13(arg0);
		@Pc(23) Class2_Sub13 local23 = new Class2_Sub13(arg0);
		@Pc(28) Class2_Sub13 local28 = new Class2_Sub13(arg0);
		local8.anInt3940 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2933();
		@Pc(42) int local42 = local8.method2933();
		@Pc(46) int local46 = local8.method2962();
		@Pc(50) int local50 = local8.method2962();
		@Pc(54) int local54 = local8.method2962();
		@Pc(58) int local58 = local8.method2962();
		@Pc(62) int local62 = local8.method2962();
		@Pc(66) int local66 = local8.method2962();
		@Pc(70) int local70 = local8.method2933();
		@Pc(74) int local74 = local8.method2933();
		@Pc(78) int local78 = local8.method2933();
		@Pc(82) int local82 = local8.method2933();
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
		this.anInt2501 = local38;
		this.anInt2500 = local42;
		this.anInt2498 = local46;
		this.anIntArray235 = new int[local38];
		this.anIntArray228 = new int[local38];
		this.anIntArray230 = new int[local38];
		this.anIntArray229 = new int[local42];
		this.anIntArray233 = new int[local42];
		this.anIntArray231 = new int[local42];
		if (local46 > 0) {
			this.aByteArray44 = new byte[local46];
			this.aShortArray28 = new short[local46];
			this.aShortArray29 = new short[local46];
			this.aShortArray24 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray238 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray38 = new byte[local42];
			this.aByteArray36 = new byte[local42];
			this.aShortArray25 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray37 = new byte[local42];
		} else {
			this.aByte7 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray43 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray239 = new int[local42];
		}
		this.aShortArray30 = new short[local42];
		local8.anInt3940 = 0;
		local13.anInt3940 = local165;
		local18.anInt3940 = local171;
		local23.anInt3940 = local90;
		local28.anInt3940 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method2962();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method2914();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method2914();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method2914();
			}
			this.anIntArray235[local307] = local301 + local314;
			this.anIntArray228[local307] = local303 + local324;
			this.anIntArray230[local307] = local305 + local334;
			local301 = this.anIntArray235[local307];
			local303 = this.anIntArray228[local307];
			local305 = this.anIntArray230[local307];
			if (local66 == 1) {
				this.anIntArray238[local307] = local28.method2962();
			}
		}
		local8.anInt3940 = local149;
		local13.anInt3940 = local116;
		local18.anInt3940 = local98;
		local23.anInt3940 = local134;
		local28.anInt3940 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray30[local312] = (short) local8.method2933();
			if (local50 == 1) {
				local314 = local13.method2962();
				if ((local314 & 0x1) == 1) {
					this.aByteArray38[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray38[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray36[local312] = (byte) (local314 >> 2);
					this.aShortArray25[local312] = this.aShortArray30[local312];
					this.aShortArray30[local312] = 127;
					if (this.aShortArray25[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray36[local312] = -1;
					this.aShortArray25[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray37[local312] = local18.method2948();
			}
			if (local58 == 1) {
				this.aByteArray43[local312] = local23.method2948();
			}
			if (local62 == 1) {
				this.anIntArray239[local312] = local28.method2962();
			}
		}
		local8.anInt3940 = local143;
		local13.anInt3940 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method2962();
			if (local543 == 1) {
				local314 = local8.method2914() + local536;
				local324 = local8.method2914() + local314;
				local334 = local8.method2914() + local324;
				local536 = local334;
				this.anIntArray229[local538] = local314;
				this.anIntArray233[local538] = local324;
				this.anIntArray231[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method2914() + local536;
				local536 = local334;
				this.anIntArray229[local538] = local314;
				this.anIntArray233[local538] = local324;
				this.anIntArray231[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method2914() + local536;
				local536 = local334;
				this.anIntArray229[local538] = local314;
				this.anIntArray233[local538] = local324;
				this.anIntArray231[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method2914() + local536;
				local536 = local334;
				this.anIntArray229[local538] = local314;
				this.anIntArray233[local538] = local646;
				this.anIntArray231[local538] = local334;
			}
		}
		local8.anInt3940 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray44[local543] = 0;
			this.aShortArray28[local543] = (short) local8.method2933();
			this.aShortArray29[local543] = (short) local8.method2933();
			this.aShortArray24[local543] = (short) local8.method2933();
		}
		if (this.aByteArray36 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray36[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray28[local731] & 0xFFFF) == this.anIntArray229[local723] && (this.aShortArray29[local731] & 0xFFFF) == this.anIntArray233[local723] && (this.aShortArray24[local731] & 0xFFFF) == this.anIntArray231[local723]) {
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
			this.aShortArray25 = null;
		}
		if (!local1) {
			this.aByteArray38 = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oe;I)I")
	private int method2023(@OriginalArg(0) Class2_Sub2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray235[arg1];
		@Pc(11) int local11 = arg0.anIntArray228[arg1];
		@Pc(16) int local16 = arg0.anIntArray230[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2501; local18++) {
			if (local6 == this.anIntArray235[local18] && local11 == this.anIntArray228[local18] && local16 == this.anIntArray230[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray235[this.anInt2501] = local6;
			this.anIntArray228[this.anInt2501] = local11;
			this.anIntArray230[this.anInt2501] = local16;
			if (arg0.anIntArray238 != null) {
				this.anIntArray238[this.anInt2501] = arg0.anIntArray238[arg1];
			}
			local1 = this.anInt2501++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "()V")
	public void method2024() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2501; local1++) {
			@Pc(7) int local7 = this.anIntArray235[local1];
			this.anIntArray235[local1] = this.anIntArray230[local1];
			this.anIntArray230[local1] = -local7;
		}
		this.method2033();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(SS)V")
	public void method2025(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2500; local1++) {
			if (this.aShortArray30[local1] == arg0) {
				this.aShortArray30[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(IIIII)Lclient!gf;")
	public Class2_Sub2_Sub3_Sub4_Sub1 method2026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class2_Sub2_Sub3_Sub4_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIZZ)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method2027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class2_Sub2_Sub3_Sub4_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
	public void method2028() {
		@Pc(3) int local3 = Static119.anIntArray232[256];
		@Pc(7) int local7 = Static119.anIntArray237[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2501; local9++) {
			@Pc(26) int local26 = this.anIntArray230[local9] * local3 + this.anIntArray235[local9] * local7 >> 16;
			this.anIntArray230[local9] = this.anIntArray230[local9] * local7 - this.anIntArray235[local9] * local3 >> 16;
			this.anIntArray235[local9] = local26;
		}
		this.method2033();
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "()V")
	public void method2030() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray238 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2501; local9++) {
				local15 = this.anIntArray238[local9];
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
			while (local59 < this.anInt2501) {
				local65 = this.anIntArray238[local59];
				this.anIntArrayArray25[local65][local5[local65]++] = local59++;
			}
			this.anIntArray238 = null;
		}
		if (this.anIntArray239 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2500; local9++) {
			local15 = this.anIntArray239[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray26 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray26[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2500) {
			local65 = this.anIntArray239[local59];
			this.anIntArrayArray26[local65][local5[local65]++] = local59++;
		}
		this.anIntArray239 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public void method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2501; local1++) {
			this.anIntArray235[local1] = this.anIntArray235[local1] * arg0 / 128;
			this.anIntArray228[local1] = this.anIntArray228[local1] * arg1 / 128;
			this.anIntArray230[local1] = this.anIntArray230[local1] * arg2 / 128;
		}
		this.method2033();
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "([B)V")
	private void method2032(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub13 local4 = new Class2_Sub13(arg0);
		@Pc(9) Class2_Sub13 local9 = new Class2_Sub13(arg0);
		@Pc(14) Class2_Sub13 local14 = new Class2_Sub13(arg0);
		@Pc(19) Class2_Sub13 local19 = new Class2_Sub13(arg0);
		@Pc(24) Class2_Sub13 local24 = new Class2_Sub13(arg0);
		@Pc(29) Class2_Sub13 local29 = new Class2_Sub13(arg0);
		@Pc(34) Class2_Sub13 local34 = new Class2_Sub13(arg0);
		local4.anInt3940 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2933();
		@Pc(48) int local48 = local4.method2933();
		@Pc(52) int local52 = local4.method2962();
		@Pc(56) int local56 = local4.method2962();
		@Pc(60) int local60 = local4.method2962();
		@Pc(64) int local64 = local4.method2962();
		@Pc(68) int local68 = local4.method2962();
		@Pc(72) int local72 = local4.method2962();
		@Pc(76) int local76 = local4.method2962();
		@Pc(80) int local80 = local4.method2933();
		@Pc(84) int local84 = local4.method2933();
		@Pc(88) int local88 = local4.method2933();
		@Pc(92) int local92 = local4.method2933();
		@Pc(96) int local96 = local4.method2933();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray44 = new byte[local52];
			local4.anInt3940 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray44[local113] = local4.method2948();
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
		this.anInt2501 = local44;
		this.anInt2500 = local48;
		this.anInt2498 = local52;
		this.anIntArray235 = new int[local44];
		this.anIntArray228 = new int[local44];
		this.anIntArray230 = new int[local44];
		this.anIntArray229 = new int[local48];
		this.anIntArray233 = new int[local48];
		this.anIntArray231 = new int[local48];
		if (local76 == 1) {
			this.anIntArray238 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray38 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray37 = new byte[local48];
		} else {
			this.aByte7 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray43 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray239 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray25 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray36 = new byte[local48];
		}
		this.aShortArray30 = new short[local48];
		if (local52 > 0) {
			this.aShortArray28 = new short[local52];
			this.aShortArray29 = new short[local52];
			this.aShortArray24 = new short[local52];
			if (local100 > 0) {
				this.aShortArray31 = new short[local100];
				this.aShortArray26 = new short[local100];
				this.aShortArray27 = new short[local100];
				this.aByteArray35 = new byte[local100];
				this.aByteArray42 = new byte[local100];
				this.aByteArray40 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray39 = new byte[local102];
				this.aByteArray41 = new byte[local102];
			}
		}
		local4.anInt3940 = local52;
		local9.anInt3940 = local233;
		local14.anInt3940 = local239;
		local19.anInt3940 = local245;
		local24.anInt3940 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method2962();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method2914();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method2914();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method2914();
			}
			this.anIntArray235[local463] = local457 + local470;
			this.anIntArray228[local463] = local459 + local480;
			this.anIntArray230[local463] = local461 + local490;
			local457 = this.anIntArray235[local463];
			local459 = this.anIntArray228[local463];
			local461 = this.anIntArray230[local463];
			if (local76 == 1) {
				this.anIntArray238[local463] = local24.method2962();
			}
		}
		local4.anInt3940 = local225;
		local9.anInt3940 = local151;
		local14.anInt3940 = local166;
		local19.anInt3940 = local193;
		local24.anInt3940 = local175;
		local29.anInt3940 = local208;
		local34.anInt3940 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray30[local468] = (short) local4.method2933();
			if (local56 == 1) {
				this.aByteArray38[local468] = local9.method2948();
			}
			if (local60 == 255) {
				this.aByteArray37[local468] = local14.method2948();
			}
			if (local64 == 1) {
				this.aByteArray43[local468] = local19.method2948();
			}
			if (local68 == 1) {
				this.anIntArray239[local468] = local24.method2962();
			}
			if (local72 == 1) {
				this.aShortArray25[local468] = (short) (local29.method2933() - 1);
			}
			if (this.aByteArray36 != null) {
				if (this.aShortArray25[local468] == -1) {
					this.aByteArray36[local468] = -1;
				} else {
					this.aByteArray36[local468] = (byte) (local34.method2962() - 1);
				}
			}
		}
		local4.anInt3940 = local202;
		local9.anInt3940 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method2962();
			if (local683 == 1) {
				local470 = local4.method2914() + local676;
				local480 = local4.method2914() + local470;
				local490 = local4.method2914() + local480;
				local676 = local490;
				this.anIntArray229[local678] = local470;
				this.anIntArray233[local678] = local480;
				this.anIntArray231[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method2914() + local676;
				local676 = local490;
				this.anIntArray229[local678] = local470;
				this.anIntArray233[local678] = local480;
				this.anIntArray231[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method2914() + local676;
				local676 = local490;
				this.anIntArray229[local678] = local470;
				this.anIntArray233[local678] = local480;
				this.anIntArray231[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method2914() + local676;
				local676 = local490;
				this.anIntArray229[local678] = local470;
				this.anIntArray233[local678] = local786;
				this.anIntArray231[local678] = local490;
			}
		}
		local4.anInt3940 = local251;
		local9.anInt3940 = local259;
		local14.anInt3940 = local267;
		local19.anInt3940 = local275;
		local24.anInt3940 = local281;
		local29.anInt3940 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray44[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray28[local683] = (short) local4.method2933();
				this.aShortArray29[local683] = (short) local4.method2933();
				this.aShortArray24[local683] = (short) local4.method2933();
			}
			if (local786 == 1) {
				this.aShortArray28[local683] = (short) local9.method2933();
				this.aShortArray29[local683] = (short) local9.method2933();
				this.aShortArray24[local683] = (short) local9.method2933();
				this.aShortArray31[local683] = (short) local14.method2933();
				this.aShortArray26[local683] = (short) local14.method2933();
				this.aShortArray27[local683] = (short) local14.method2933();
				this.aByteArray35[local683] = local19.method2948();
				this.aByteArray42[local683] = local24.method2948();
				this.aByteArray40[local683] = local29.method2948();
			}
			if (local786 == 2) {
				this.aShortArray28[local683] = (short) local9.method2933();
				this.aShortArray29[local683] = (short) local9.method2933();
				this.aShortArray24[local683] = (short) local9.method2933();
				this.aShortArray31[local683] = (short) local14.method2933();
				this.aShortArray26[local683] = (short) local14.method2933();
				this.aShortArray27[local683] = (short) local14.method2933();
				this.aByteArray35[local683] = local19.method2948();
				this.aByteArray42[local683] = local24.method2948();
				this.aByteArray40[local683] = local29.method2948();
				this.aByteArray39[local683] = local29.method2948();
				this.aByteArray41[local683] = local29.method2948();
			}
			if (local786 == 3) {
				this.aShortArray28[local683] = (short) local9.method2933();
				this.aShortArray29[local683] = (short) local9.method2933();
				this.aShortArray24[local683] = (short) local9.method2933();
				this.aShortArray31[local683] = (short) local14.method2933();
				this.aShortArray26[local683] = (short) local14.method2933();
				this.aShortArray27[local683] = (short) local14.method2933();
				this.aByteArray35[local683] = local19.method2948();
				this.aByteArray42[local683] = local24.method2948();
				this.aByteArray40[local683] = local29.method2948();
			}
		}
		local4.anInt3940 = local113;
		local786 = local4.method2962();
		if (local786 == 0) {
			return;
		}
		new Class20();
		local4.method2933();
		local4.method2933();
		local4.method2933();
		local4.method2946();
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "()V")
	private void method2033() {
		this.aClass38Array2 = null;
		this.aClass38Array1 = null;
		this.aClass12Array1 = null;
		this.aBoolean111 = false;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(SS)V")
	public void method2034(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray25 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2500; local5++) {
			if (this.aShortArray25[local5] == arg0) {
				this.aShortArray25[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "()V")
	public void method2035() {
		if (this.aClass38Array2 != null) {
			return;
		}
		this.aClass38Array2 = new Class38[this.anInt2501];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2501; local10++) {
			this.aClass38Array2[local10] = new Class38();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2500; local25++) {
			@Pc(31) int local31 = this.anIntArray229[local25];
			@Pc(36) int local36 = this.anIntArray233[local25];
			@Pc(41) int local41 = this.anIntArray231[local25];
			@Pc(51) int local51 = this.anIntArray235[local36] - this.anIntArray235[local31];
			@Pc(61) int local61 = this.anIntArray228[local36] - this.anIntArray228[local31];
			@Pc(71) int local71 = this.anIntArray230[local36] - this.anIntArray230[local31];
			@Pc(81) int local81 = this.anIntArray235[local41] - this.anIntArray235[local31];
			@Pc(91) int local91 = this.anIntArray228[local41] - this.anIntArray228[local31];
			@Pc(101) int local101 = this.anIntArray230[local41] - this.anIntArray230[local31];
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
			if (this.aByteArray38 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray38[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class38 local211 = this.aClass38Array2[local31];
				local211.anInt1442 += local109;
				local211.anInt1441 += local117;
				local211.anInt1444 += local125;
				local211.anInt1439++;
				@Pc(240) Class38 local240 = this.aClass38Array2[local36];
				local240.anInt1442 += local109;
				local240.anInt1441 += local117;
				local240.anInt1444 += local125;
				local240.anInt1439++;
				@Pc(269) Class38 local269 = this.aClass38Array2[local41];
				local269.anInt1442 += local109;
				local269.anInt1441 += local117;
				local269.anInt1444 += local125;
				local269.anInt1439++;
			} else if (local198 == 1) {
				if (this.aClass12Array1 == null) {
					this.aClass12Array1 = new Class12[this.anInt2500];
				}
				@Pc(314) Class12 local314 = this.aClass12Array1[local25] = new Class12();
				local314.anInt467 = local109;
				local314.anInt463 = local117;
				local314.anInt462 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)V")
	public void method2036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2501; local1++) {
			this.anIntArray235[local1] += arg0;
			this.anIntArray228[local1] += arg1;
			this.anIntArray230[local1] += arg2;
		}
		this.method2033();
	}

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "()V")
	public void method2037() {
		if (this.aBoolean111) {
			return;
		}
		this.aBoolean111 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2501; local20++) {
			@Pc(26) int local26 = this.anIntArray235[local20];
			@Pc(31) int local31 = this.anIntArray228[local20];
			@Pc(36) int local36 = this.anIntArray230[local20];
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
		this.aShort25 = (short) local8;
		this.aShort29 = (short) local14;
		super.aShort34 = (short) local10;
		this.aShort23 = (short) local16;
		this.aShort24 = (short) local12;
		this.aShort26 = (short) local18;
	}
}
