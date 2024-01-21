import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub1_Sub3_Sub7 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!v", name = "P", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!v", name = "S", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!v", name = "T", descriptor = "I")
	public int anInt3617;

	@OriginalMember(owner = "client!v", name = "U", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!v", name = "V", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "[Lclient!nh;")
	public Class58[] aClass58Array1;

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "[I")
	public int[] anIntArray383;

	@OriginalMember(owner = "client!v", name = "Z", descriptor = "[I")
	public int[] anIntArray384;

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!v", name = "db", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!v", name = "eb", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "I")
	public int anInt3619;

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "[Lclient!k;")
	public Class44[] aClass44Array1;

	@OriginalMember(owner = "client!v", name = "nb", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!v", name = "ob", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!v", name = "qb", descriptor = "[Lclient!k;")
	public Class44[] aClass44Array2;

	@OriginalMember(owner = "client!v", name = "rb", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!v", name = "tb", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!v", name = "ub", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!v", name = "vb", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!v", name = "wb", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!v", name = "xb", descriptor = "I")
	public int anInt3620;

	@OriginalMember(owner = "client!v", name = "zb", descriptor = "[I")
	public int[] anIntArray389;

	@OriginalMember(owner = "client!v", name = "Bb", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!v", name = "Cb", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!v", name = "Db", descriptor = "I")
	public int anInt3622;

	@OriginalMember(owner = "client!v", name = "Eb", descriptor = "I")
	public int anInt3623;

	@OriginalMember(owner = "client!v", name = "Fb", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!v", name = "Gb", descriptor = "[I")
	public int[] anIntArray391;

	@OriginalMember(owner = "client!v", name = "Hb", descriptor = "I")
	public int anInt3624;

	@OriginalMember(owner = "client!v", name = "Ib", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!v", name = "Jb", descriptor = "[I")
	public int[] anIntArray392;

	@OriginalMember(owner = "client!v", name = "pb", descriptor = "B")
	public byte aByte8 = 0;

	@OriginalMember(owner = "client!v", name = "O", descriptor = "I")
	public int anInt3616 = 0;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
	public int anInt3618 = 0;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	private Class2_Sub1_Sub3_Sub7() {
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub3_Sub7(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2559(arg0);
		} else {
			this.method2554(arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([Lclient!v;I)V")
	public Class2_Sub1_Sub3_Sub7(@OriginalArg(0) Class2_Sub1_Sub3_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt3618 = 0;
		this.anInt3616 = 0;
		this.anInt3623 = 0;
		this.aByte8 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class2_Sub1_Sub3_Sub7 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt3618 += local44.anInt3618;
				this.anInt3616 += local44.anInt3616;
				this.anInt3623 += local44.anInt3623;
				if (local44.aByteArray45 == null) {
					if (this.aByte8 == -1) {
						this.aByte8 = local44.aByte8;
					}
					if (this.aByte8 != local44.aByte8) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray48 != null;
				local19 |= local44.aByteArray41 != null;
				local21 |= local44.anIntArray386 != null;
				local23 |= local44.aShortArray32 != null;
				local25 |= local44.aByteArray43 != null;
			}
		}
		this.anIntArray391 = new int[this.anInt3618];
		this.anIntArray384 = new int[this.anInt3618];
		this.anIntArray388 = new int[this.anInt3618];
		this.anIntArray381 = new int[this.anInt3618];
		this.anIntArray392 = new int[this.anInt3616];
		this.anIntArray389 = new int[this.anInt3616];
		this.anIntArray383 = new int[this.anInt3616];
		if (local15) {
			this.aByteArray48 = new byte[this.anInt3616];
		}
		if (local17) {
			this.aByteArray45 = new byte[this.anInt3616];
		}
		if (local19) {
			this.aByteArray41 = new byte[this.anInt3616];
		}
		if (local21) {
			this.anIntArray386 = new int[this.anInt3616];
		}
		if (local23) {
			this.aShortArray32 = new short[this.anInt3616];
		}
		if (local25) {
			this.aByteArray43 = new byte[this.anInt3616];
		}
		this.aShortArray36 = new short[this.anInt3616];
		if (this.anInt3623 > 0) {
			this.aByteArray39 = new byte[this.anInt3623];
			this.aShortArray35 = new short[this.anInt3623];
			this.aShortArray37 = new short[this.anInt3623];
			this.aShortArray34 = new short[this.anInt3623];
			this.aShortArray31 = new short[this.anInt3623];
			this.aShortArray30 = new short[this.anInt3623];
			this.aShortArray33 = new short[this.anInt3623];
			this.aByteArray40 = new byte[this.anInt3623];
			this.aByteArray42 = new byte[this.anInt3623];
			this.aByteArray46 = new byte[this.anInt3623];
			this.aByteArray47 = new byte[this.anInt3623];
			this.aByteArray44 = new byte[this.anInt3623];
		}
		this.anInt3618 = 0;
		this.anInt3616 = 0;
		this.anInt3623 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class2_Sub1_Sub3_Sub7 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt3616; local302++) {
					if (local15 && local298.aByteArray48 != null) {
						this.aByteArray48[this.anInt3616] = local298.aByteArray48[local302];
					}
					if (local17) {
						if (local298.aByteArray45 == null) {
							this.aByteArray45[this.anInt3616] = local298.aByte8;
						} else {
							this.aByteArray45[this.anInt3616] = local298.aByteArray45[local302];
						}
					}
					if (local19 && local298.aByteArray41 != null) {
						this.aByteArray41[this.anInt3616] = local298.aByteArray41[local302];
					}
					if (local21 && local298.anIntArray386 != null) {
						this.anIntArray386[this.anInt3616] = local298.anIntArray386[local302];
					}
					if (local23) {
						if (local298.aShortArray32 == null) {
							this.aShortArray32[this.anInt3616] = -1;
						} else {
							this.aShortArray32[this.anInt3616] = local298.aShortArray32[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray43 == null || local298.aByteArray43[local302] == -1) {
							this.aByteArray43[this.anInt3616] = -1;
						} else {
							this.aByteArray43[this.anInt3616] = (byte) (local298.aByteArray43[local302] + this.anInt3623);
						}
					}
					this.aShortArray36[this.anInt3616] = local298.aShortArray36[local302];
					this.anIntArray392[this.anInt3616] = this.method2561(local298, local298.anIntArray392[local302]);
					this.anIntArray389[this.anInt3616] = this.method2561(local298, local298.anIntArray389[local302]);
					this.anIntArray383[this.anInt3616] = this.method2561(local298, local298.anIntArray383[local302]);
					this.anInt3616++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt3623; local477++) {
					@Pc(489) byte local489 = this.aByteArray39[this.anInt3623] = local298.aByteArray39[local477];
					if (local489 == 0) {
						this.aShortArray35[this.anInt3623] = (short) this.method2561(local298, local298.aShortArray35[local477]);
						this.aShortArray37[this.anInt3623] = (short) this.method2561(local298, local298.aShortArray37[local477]);
						this.aShortArray34[this.anInt3623] = (short) this.method2561(local298, local298.aShortArray34[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray35[this.anInt3623] = local298.aShortArray35[local477];
						this.aShortArray37[this.anInt3623] = local298.aShortArray37[local477];
						this.aShortArray34[this.anInt3623] = local298.aShortArray34[local477];
						this.aShortArray31[this.anInt3623] = local298.aShortArray31[local477];
						this.aShortArray30[this.anInt3623] = local298.aShortArray30[local477];
						this.aShortArray33[this.anInt3623] = local298.aShortArray33[local477];
						this.aByteArray40[this.anInt3623] = local298.aByteArray40[local477];
						this.aByteArray42[this.anInt3623] = local298.aByteArray42[local477];
						this.aByteArray46[this.anInt3623] = local298.aByteArray46[local477];
					}
					if (local489 == 2) {
						this.aByteArray47[this.anInt3623] = local298.aByteArray47[local477];
						this.aByteArray44[this.anInt3623] = local298.aByteArray44[local477];
					}
					this.anInt3623++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!v;ZZZZ)V")
	public Class2_Sub1_Sub3_Sub7(@OriginalArg(0) Class2_Sub1_Sub3_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3618 = arg0.anInt3618;
		this.anInt3616 = arg0.anInt3616;
		this.anInt3623 = arg0.anInt3623;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray391 = arg0.anIntArray391;
			this.anIntArray384 = arg0.anIntArray384;
			this.anIntArray388 = arg0.anIntArray388;
		} else {
			this.anIntArray391 = new int[this.anInt3618];
			this.anIntArray384 = new int[this.anInt3618];
			this.anIntArray388 = new int[this.anInt3618];
			for (local57 = 0; local57 < this.anInt3618; local57++) {
				this.anIntArray391[local57] = arg0.anIntArray391[local57];
				this.anIntArray384[local57] = arg0.anIntArray384[local57];
				this.anIntArray388[local57] = arg0.anIntArray388[local57];
			}
		}
		if (arg2) {
			this.aShortArray36 = arg0.aShortArray36;
		} else {
			this.aShortArray36 = new short[this.anInt3616];
			for (local57 = 0; local57 < this.anInt3616; local57++) {
				this.aShortArray36[local57] = arg0.aShortArray36[local57];
			}
		}
		if (arg3 || arg0.aShortArray32 == null) {
			this.aShortArray32 = arg0.aShortArray32;
		} else {
			this.aShortArray32 = new short[this.anInt3616];
			for (local57 = 0; local57 < this.anInt3616; local57++) {
				this.aShortArray32[local57] = arg0.aShortArray32[local57];
			}
		}
		this.aByteArray41 = arg0.aByteArray41;
		this.anIntArray392 = arg0.anIntArray392;
		this.anIntArray389 = arg0.anIntArray389;
		this.anIntArray383 = arg0.anIntArray383;
		this.aByteArray48 = arg0.aByteArray48;
		this.aByteArray45 = arg0.aByteArray45;
		this.aByteArray43 = arg0.aByteArray43;
		this.aByte8 = arg0.aByte8;
		this.aByteArray39 = arg0.aByteArray39;
		this.aShortArray35 = arg0.aShortArray35;
		this.aShortArray37 = arg0.aShortArray37;
		this.aShortArray34 = arg0.aShortArray34;
		this.aShortArray31 = arg0.aShortArray31;
		this.aShortArray30 = arg0.aShortArray30;
		this.aShortArray33 = arg0.aShortArray33;
		this.aByteArray40 = arg0.aByteArray40;
		this.aByteArray42 = arg0.aByteArray42;
		this.aByteArray46 = arg0.aByteArray46;
		this.aByteArray47 = arg0.aByteArray47;
		this.aByteArray44 = arg0.aByteArray44;
		this.anIntArray381 = arg0.anIntArray381;
		this.anIntArray386 = arg0.anIntArray386;
		this.anIntArrayArray37 = arg0.anIntArrayArray37;
		this.anIntArrayArray38 = arg0.anIntArrayArray38;
		this.aClass44Array1 = arg0.aClass44Array1;
		this.aClass58Array1 = arg0.aClass58Array1;
		this.aClass44Array2 = arg0.aClass44Array2;
		this.aShort2 = arg0.aShort2;
		this.aShort1 = arg0.aShort1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
	public void method2547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			this.anIntArray391[local1] = this.anIntArray391[local1] * arg0 / 128;
			this.anIntArray384[local1] = this.anIntArray384[local1] * arg1 / 128;
			this.anIntArray388[local1] = this.anIntArray388[local1] * arg2 / 128;
		}
		this.method2560();
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
	public void method2549() {
		if (this.aClass44Array1 != null) {
			return;
		}
		this.aClass44Array1 = new Class44[this.anInt3618];
		for (@Pc(10) int local10 = 0; local10 < this.anInt3618; local10++) {
			this.aClass44Array1[local10] = new Class44();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3616; local25++) {
			@Pc(31) int local31 = this.anIntArray392[local25];
			@Pc(36) int local36 = this.anIntArray389[local25];
			@Pc(41) int local41 = this.anIntArray383[local25];
			@Pc(51) int local51 = this.anIntArray391[local36] - this.anIntArray391[local31];
			@Pc(61) int local61 = this.anIntArray384[local36] - this.anIntArray384[local31];
			@Pc(71) int local71 = this.anIntArray388[local36] - this.anIntArray388[local31];
			@Pc(81) int local81 = this.anIntArray391[local41] - this.anIntArray391[local31];
			@Pc(91) int local91 = this.anIntArray384[local41] - this.anIntArray384[local31];
			@Pc(101) int local101 = this.anIntArray388[local41] - this.anIntArray388[local31];
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
			if (this.aByteArray48 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray48[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class44 local211 = this.aClass44Array1[local31];
				local211.anInt1871 += local109;
				local211.anInt1872 += local117;
				local211.anInt1875 += local125;
				local211.anInt1869++;
				@Pc(240) Class44 local240 = this.aClass44Array1[local36];
				local240.anInt1871 += local109;
				local240.anInt1872 += local117;
				local240.anInt1875 += local125;
				local240.anInt1869++;
				@Pc(269) Class44 local269 = this.aClass44Array1[local41];
				local269.anInt1871 += local109;
				local269.anInt1872 += local117;
				local269.anInt1875 += local125;
				local269.anInt1869++;
			} else if (local198 == 1) {
				if (this.aClass58Array1 == null) {
					this.aClass58Array1 = new Class58[this.anInt3616];
				}
				@Pc(314) Class58 local314 = this.aClass58Array1[local25] = new Class58();
				local314.anInt2517 = local109;
				local314.anInt2516 = local117;
				local314.anInt2513 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
	public void method2550() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			this.anIntArray391[local1] = -this.anIntArray391[local1];
			this.anIntArray388[local1] = -this.anIntArray388[local1];
		}
		this.method2560();
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
	public void method2552() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray381 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3618; local9++) {
				local15 = this.anIntArray381[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray37 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray37[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt3618) {
				local65 = this.anIntArray381[local59];
				this.anIntArrayArray37[local65][local5[local65]++] = local59++;
			}
			this.anIntArray381 = null;
		}
		if (this.anIntArray386 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3616; local9++) {
			local15 = this.anIntArray386[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray38 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray38[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt3616) {
			local65 = this.anIntArray386[local59];
			this.anIntArrayArray38[local65][local5[local65]++] = local59++;
		}
		this.anIntArray386 = null;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
	public void method2553() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			@Pc(7) int local7 = this.anIntArray388[local1];
			this.anIntArray388[local1] = this.anIntArray391[local1];
			this.anIntArray391[local1] = -local7;
		}
		this.method2560();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([B)V")
	private void method2554(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub11 local8 = new Class2_Sub11(arg0);
		@Pc(13) Class2_Sub11 local13 = new Class2_Sub11(arg0);
		@Pc(18) Class2_Sub11 local18 = new Class2_Sub11(arg0);
		@Pc(23) Class2_Sub11 local23 = new Class2_Sub11(arg0);
		@Pc(28) Class2_Sub11 local28 = new Class2_Sub11(arg0);
		local8.anInt2077 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1456();
		@Pc(42) int local42 = local8.method1456();
		@Pc(46) int local46 = local8.method1461();
		@Pc(50) int local50 = local8.method1461();
		@Pc(54) int local54 = local8.method1461();
		@Pc(58) int local58 = local8.method1461();
		@Pc(62) int local62 = local8.method1461();
		@Pc(66) int local66 = local8.method1461();
		@Pc(70) int local70 = local8.method1456();
		@Pc(74) int local74 = local8.method1456();
		@Pc(78) int local78 = local8.method1456();
		@Pc(82) int local82 = local8.method1456();
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
		this.anInt3618 = local38;
		this.anInt3616 = local42;
		this.anInt3623 = local46;
		this.anIntArray391 = new int[local38];
		this.anIntArray384 = new int[local38];
		this.anIntArray388 = new int[local38];
		this.anIntArray392 = new int[local42];
		this.anIntArray389 = new int[local42];
		this.anIntArray383 = new int[local42];
		if (local46 > 0) {
			this.aByteArray39 = new byte[local46];
			this.aShortArray35 = new short[local46];
			this.aShortArray37 = new short[local46];
			this.aShortArray34 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray381 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray48 = new byte[local42];
			this.aByteArray43 = new byte[local42];
			this.aShortArray32 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray45 = new byte[local42];
		} else {
			this.aByte8 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray41 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray386 = new int[local42];
		}
		this.aShortArray36 = new short[local42];
		local8.anInt2077 = 0;
		local13.anInt2077 = local165;
		local18.anInt2077 = local171;
		local23.anInt2077 = local90;
		local28.anInt2077 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1461();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1464();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1464();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1464();
			}
			this.anIntArray391[local307] = local301 + local314;
			this.anIntArray384[local307] = local303 + local324;
			this.anIntArray388[local307] = local305 + local334;
			local301 = this.anIntArray391[local307];
			local303 = this.anIntArray384[local307];
			local305 = this.anIntArray388[local307];
			if (local66 == 1) {
				this.anIntArray381[local307] = local28.method1461();
			}
		}
		local8.anInt2077 = local149;
		local13.anInt2077 = local116;
		local18.anInt2077 = local98;
		local23.anInt2077 = local134;
		local28.anInt2077 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray36[local312] = (short) local8.method1456();
			if (local50 == 1) {
				local314 = local13.method1461();
				if ((local314 & 0x1) == 1) {
					this.aByteArray48[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray48[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray43[local312] = (byte) (local314 >> 2);
					this.aShortArray32[local312] = this.aShortArray36[local312];
					this.aShortArray36[local312] = 127;
					if (this.aShortArray32[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray43[local312] = -1;
					this.aShortArray32[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray45[local312] = local18.method1463();
			}
			if (local58 == 1) {
				this.aByteArray41[local312] = local23.method1463();
			}
			if (local62 == 1) {
				this.anIntArray386[local312] = local28.method1461();
			}
		}
		local8.anInt2077 = local143;
		local13.anInt2077 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1461();
			if (local543 == 1) {
				local314 = local8.method1464() + local536;
				local324 = local8.method1464() + local314;
				local334 = local8.method1464() + local324;
				local536 = local334;
				this.anIntArray392[local538] = local314;
				this.anIntArray389[local538] = local324;
				this.anIntArray383[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1464() + local536;
				local536 = local334;
				this.anIntArray392[local538] = local314;
				this.anIntArray389[local538] = local324;
				this.anIntArray383[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1464() + local536;
				local536 = local334;
				this.anIntArray392[local538] = local314;
				this.anIntArray389[local538] = local324;
				this.anIntArray383[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1464() + local536;
				local536 = local334;
				this.anIntArray392[local538] = local314;
				this.anIntArray389[local538] = local646;
				this.anIntArray383[local538] = local334;
			}
		}
		local8.anInt2077 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray39[local543] = 0;
			this.aShortArray35[local543] = (short) local8.method1456();
			this.aShortArray37[local543] = (short) local8.method1456();
			this.aShortArray34[local543] = (short) local8.method1456();
		}
		if (this.aByteArray43 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray43[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray35[local731] & 0xFFFF) == this.anIntArray392[local723] && (this.aShortArray37[local731] & 0xFFFF) == this.anIntArray389[local723] && (this.aShortArray34[local731] & 0xFFFF) == this.anIntArray383[local723]) {
						this.aByteArray43[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray43 = null;
			}
		}
		if (!local3) {
			this.aShortArray32 = null;
		}
		if (!local1) {
			this.aByteArray48 = null;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
	public void method2555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			this.anIntArray391[local1] += arg0;
			this.anIntArray384[local1] += arg1;
			this.anIntArray388[local1] += arg2;
		}
		this.method2560();
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
	public void method2556() {
		@Pc(3) int local3 = Static166.anIntArray390[256];
		@Pc(7) int local7 = Static166.anIntArray382[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3618; local9++) {
			@Pc(26) int local26 = this.anIntArray388[local9] * local3 + this.anIntArray391[local9] * local7 >> 16;
			this.anIntArray388[local9] = this.anIntArray388[local9] * local7 - this.anIntArray391[local9] * local3 >> 16;
			this.anIntArray391[local9] = local26;
		}
		this.method2560();
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "()V")
	public void method2557() {
		if (this.aBoolean159) {
			return;
		}
		super.anInt3614 = 0;
		this.anInt3619 = 0;
		this.anInt3622 = 999999;
		this.anInt3617 = -999999;
		this.anInt3624 = -99999;
		this.anInt3620 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3618; local23++) {
			@Pc(29) int local29 = this.anIntArray391[local23];
			@Pc(34) int local34 = this.anIntArray384[local23];
			@Pc(39) int local39 = this.anIntArray388[local23];
			if (local29 < this.anInt3622) {
				this.anInt3622 = local29;
			}
			if (local29 > this.anInt3617) {
				this.anInt3617 = local29;
			}
			if (local39 < this.anInt3620) {
				this.anInt3620 = local39;
			}
			if (local39 > this.anInt3624) {
				this.anInt3624 = local39;
			}
			if (-local34 > super.anInt3614) {
				super.anInt3614 = -local34;
			}
			if (local34 > this.anInt3619) {
				this.anInt3619 = local34;
			}
		}
		this.aBoolean159 = true;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "([B)V")
	private void method2559(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub11 local4 = new Class2_Sub11(arg0);
		@Pc(9) Class2_Sub11 local9 = new Class2_Sub11(arg0);
		@Pc(14) Class2_Sub11 local14 = new Class2_Sub11(arg0);
		@Pc(19) Class2_Sub11 local19 = new Class2_Sub11(arg0);
		@Pc(24) Class2_Sub11 local24 = new Class2_Sub11(arg0);
		@Pc(29) Class2_Sub11 local29 = new Class2_Sub11(arg0);
		@Pc(34) Class2_Sub11 local34 = new Class2_Sub11(arg0);
		local4.anInt2077 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1456();
		@Pc(48) int local48 = local4.method1456();
		@Pc(52) int local52 = local4.method1461();
		@Pc(56) int local56 = local4.method1461();
		@Pc(60) int local60 = local4.method1461();
		@Pc(64) int local64 = local4.method1461();
		@Pc(68) int local68 = local4.method1461();
		@Pc(72) int local72 = local4.method1461();
		@Pc(76) int local76 = local4.method1461();
		@Pc(80) int local80 = local4.method1456();
		@Pc(84) int local84 = local4.method1456();
		@Pc(88) int local88 = local4.method1456();
		@Pc(92) int local92 = local4.method1456();
		@Pc(96) int local96 = local4.method1456();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray39 = new byte[local52];
			local4.anInt2077 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray39[local113] = local4.method1463();
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
		this.anInt3618 = local44;
		this.anInt3616 = local48;
		this.anInt3623 = local52;
		this.anIntArray391 = new int[local44];
		this.anIntArray384 = new int[local44];
		this.anIntArray388 = new int[local44];
		this.anIntArray392 = new int[local48];
		this.anIntArray389 = new int[local48];
		this.anIntArray383 = new int[local48];
		if (local76 == 1) {
			this.anIntArray381 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray48 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray45 = new byte[local48];
		} else {
			this.aByte8 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray41 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray386 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray32 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray43 = new byte[local48];
		}
		this.aShortArray36 = new short[local48];
		if (local52 > 0) {
			this.aShortArray35 = new short[local52];
			this.aShortArray37 = new short[local52];
			this.aShortArray34 = new short[local52];
			if (local100 > 0) {
				this.aShortArray31 = new short[local100];
				this.aShortArray30 = new short[local100];
				this.aShortArray33 = new short[local100];
				this.aByteArray40 = new byte[local100];
				this.aByteArray42 = new byte[local100];
				this.aByteArray46 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray47 = new byte[local102];
				this.aByteArray44 = new byte[local102];
			}
		}
		local4.anInt2077 = local52;
		local9.anInt2077 = local233;
		local14.anInt2077 = local239;
		local19.anInt2077 = local245;
		local24.anInt2077 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1461();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1464();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1464();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1464();
			}
			this.anIntArray391[local463] = local457 + local470;
			this.anIntArray384[local463] = local459 + local480;
			this.anIntArray388[local463] = local461 + local490;
			local457 = this.anIntArray391[local463];
			local459 = this.anIntArray384[local463];
			local461 = this.anIntArray388[local463];
			if (local76 == 1) {
				this.anIntArray381[local463] = local24.method1461();
			}
		}
		local4.anInt2077 = local225;
		local9.anInt2077 = local151;
		local14.anInt2077 = local166;
		local19.anInt2077 = local193;
		local24.anInt2077 = local175;
		local29.anInt2077 = local208;
		local34.anInt2077 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray36[local468] = (short) local4.method1456();
			if (local56 == 1) {
				this.aByteArray48[local468] = local9.method1463();
			}
			if (local60 == 255) {
				this.aByteArray45[local468] = local14.method1463();
			}
			if (local64 == 1) {
				this.aByteArray41[local468] = local19.method1463();
			}
			if (local68 == 1) {
				this.anIntArray386[local468] = local24.method1461();
			}
			if (local72 == 1) {
				this.aShortArray32[local468] = (short) (local29.method1456() - 1);
			}
			if (this.aByteArray43 != null) {
				if (this.aShortArray32[local468] == -1) {
					this.aByteArray43[local468] = -1;
				} else {
					this.aByteArray43[local468] = (byte) (local34.method1461() - 1);
				}
			}
		}
		local4.anInt2077 = local202;
		local9.anInt2077 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1461();
			if (local683 == 1) {
				local470 = local4.method1464() + local676;
				local480 = local4.method1464() + local470;
				local490 = local4.method1464() + local480;
				local676 = local490;
				this.anIntArray392[local678] = local470;
				this.anIntArray389[local678] = local480;
				this.anIntArray383[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1464() + local676;
				local676 = local490;
				this.anIntArray392[local678] = local470;
				this.anIntArray389[local678] = local480;
				this.anIntArray383[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1464() + local676;
				local676 = local490;
				this.anIntArray392[local678] = local470;
				this.anIntArray389[local678] = local480;
				this.anIntArray383[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1464() + local676;
				local676 = local490;
				this.anIntArray392[local678] = local470;
				this.anIntArray389[local678] = local786;
				this.anIntArray383[local678] = local490;
			}
		}
		local4.anInt2077 = local251;
		local9.anInt2077 = local259;
		local14.anInt2077 = local267;
		local19.anInt2077 = local275;
		local24.anInt2077 = local281;
		local29.anInt2077 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray39[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray35[local683] = (short) local4.method1456();
				this.aShortArray37[local683] = (short) local4.method1456();
				this.aShortArray34[local683] = (short) local4.method1456();
			}
			if (local786 == 1) {
				this.aShortArray35[local683] = (short) local9.method1456();
				this.aShortArray37[local683] = (short) local9.method1456();
				this.aShortArray34[local683] = (short) local9.method1456();
				this.aShortArray31[local683] = (short) local14.method1456();
				this.aShortArray30[local683] = (short) local14.method1456();
				this.aShortArray33[local683] = (short) local14.method1456();
				this.aByteArray40[local683] = local19.method1463();
				this.aByteArray42[local683] = local24.method1463();
				this.aByteArray46[local683] = local29.method1463();
			}
			if (local786 == 2) {
				this.aShortArray35[local683] = (short) local9.method1456();
				this.aShortArray37[local683] = (short) local9.method1456();
				this.aShortArray34[local683] = (short) local9.method1456();
				this.aShortArray31[local683] = (short) local14.method1456();
				this.aShortArray30[local683] = (short) local14.method1456();
				this.aShortArray33[local683] = (short) local14.method1456();
				this.aByteArray40[local683] = local19.method1463();
				this.aByteArray42[local683] = local24.method1463();
				this.aByteArray46[local683] = local29.method1463();
				this.aByteArray47[local683] = local29.method1463();
				this.aByteArray44[local683] = local29.method1463();
			}
			if (local786 == 3) {
				this.aShortArray35[local683] = (short) local9.method1456();
				this.aShortArray37[local683] = (short) local9.method1456();
				this.aShortArray34[local683] = (short) local9.method1456();
				this.aShortArray31[local683] = (short) local14.method1456();
				this.aShortArray30[local683] = (short) local14.method1456();
				this.aShortArray33[local683] = (short) local14.method1456();
				this.aByteArray40[local683] = local19.method1463();
				this.aByteArray42[local683] = local24.method1463();
				this.aByteArray46[local683] = local29.method1463();
			}
		}
		local4.anInt2077 = local113;
		local786 = local4.method1461();
		if (local786 == 0) {
			return;
		}
		new Class6();
		local4.method1456();
		local4.method1456();
		local4.method1456();
		local4.method1449();
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "()V")
	private void method2560() {
		this.aClass44Array1 = null;
		this.aClass44Array2 = null;
		this.aClass58Array1 = null;
		this.aBoolean159 = false;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;I)I")
	private int method2561(@OriginalArg(0) Class2_Sub1_Sub3_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray391[arg1];
		@Pc(11) int local11 = arg0.anIntArray384[arg1];
		@Pc(16) int local16 = arg0.anIntArray388[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3618; local18++) {
			if (local6 == this.anIntArray391[local18] && local11 == this.anIntArray384[local18] && local16 == this.anIntArray388[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray391[this.anInt3618] = local6;
			this.anIntArray384[this.anInt3618] = local11;
			this.anIntArray388[this.anInt3618] = local16;
			if (arg0.anIntArray381 != null) {
				this.anIntArray381[this.anInt3618] = arg0.anIntArray381[arg1];
			}
			local1 = this.anInt3618++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "()Lclient!v;")
	public Class2_Sub1_Sub3_Sub7 method2562() {
		@Pc(3) Class2_Sub1_Sub3_Sub7 local3 = new Class2_Sub1_Sub3_Sub7();
		if (this.aByteArray48 != null) {
			local3.aByteArray48 = new byte[this.anInt3616];
			for (@Pc(13) int local13 = 0; local13 < this.anInt3616; local13++) {
				local3.aByteArray48[local13] = this.aByteArray48[local13];
			}
		}
		local3.anInt3618 = this.anInt3618;
		local3.anInt3616 = this.anInt3616;
		local3.anInt3623 = this.anInt3623;
		local3.anIntArray391 = this.anIntArray391;
		local3.anIntArray384 = this.anIntArray384;
		local3.anIntArray388 = this.anIntArray388;
		local3.anIntArray392 = this.anIntArray392;
		local3.anIntArray389 = this.anIntArray389;
		local3.anIntArray383 = this.anIntArray383;
		local3.aByteArray45 = this.aByteArray45;
		local3.aByteArray41 = this.aByteArray41;
		local3.aByteArray43 = this.aByteArray43;
		local3.aShortArray36 = this.aShortArray36;
		local3.aShortArray32 = this.aShortArray32;
		local3.aByte8 = this.aByte8;
		local3.aByteArray39 = this.aByteArray39;
		local3.aShortArray35 = this.aShortArray35;
		local3.aShortArray37 = this.aShortArray37;
		local3.aShortArray34 = this.aShortArray34;
		local3.aShortArray31 = this.aShortArray31;
		local3.aShortArray30 = this.aShortArray30;
		local3.aShortArray33 = this.aShortArray33;
		local3.aByteArray40 = this.aByteArray40;
		local3.aByteArray42 = this.aByteArray42;
		local3.aByteArray46 = this.aByteArray46;
		local3.aByteArray47 = this.aByteArray47;
		local3.aByteArray44 = this.aByteArray44;
		local3.anIntArray381 = this.anIntArray381;
		local3.anIntArray386 = this.anIntArray386;
		local3.anIntArrayArray37 = this.anIntArrayArray37;
		local3.anIntArrayArray38 = this.anIntArrayArray38;
		local3.aClass44Array1 = this.aClass44Array1;
		local3.aClass58Array1 = this.aClass58Array1;
		local3.aShort2 = this.aShort2;
		local3.aShort1 = this.aShort1;
		return local3;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([[IIIIZI)Lclient!v;")
	public Class2_Sub1_Sub3_Sub7 method2563(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2557();
		@Pc(6) int local6 = arg1 + this.anInt3622;
		@Pc(11) int local11 = arg1 + this.anInt3617;
		@Pc(16) int local16 = arg3 + this.anInt3620;
		@Pc(21) int local21 = arg3 + this.anInt3624;
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
		@Pc(101) Class2_Sub1_Sub3_Sub7 local101 = new Class2_Sub1_Sub3_Sub7();
		local101.anInt3618 = this.anInt3618;
		local101.anInt3616 = this.anInt3616;
		local101.anInt3623 = this.anInt3623;
		local101.anIntArray391 = this.anIntArray391;
		local101.anIntArray388 = this.anIntArray388;
		local101.anIntArray392 = this.anIntArray392;
		local101.anIntArray389 = this.anIntArray389;
		local101.anIntArray383 = this.anIntArray383;
		local101.aByteArray48 = this.aByteArray48;
		local101.aByteArray45 = this.aByteArray45;
		local101.aByteArray41 = this.aByteArray41;
		local101.aByteArray43 = this.aByteArray43;
		local101.aShortArray36 = this.aShortArray36;
		local101.aShortArray32 = this.aShortArray32;
		local101.aByte8 = this.aByte8;
		local101.aByteArray39 = this.aByteArray39;
		local101.aShortArray35 = this.aShortArray35;
		local101.aShortArray37 = this.aShortArray37;
		local101.aShortArray34 = this.aShortArray34;
		local101.aShortArray31 = this.aShortArray31;
		local101.aShortArray30 = this.aShortArray30;
		local101.aShortArray33 = this.aShortArray33;
		local101.aByteArray40 = this.aByteArray40;
		local101.aByteArray42 = this.aByteArray42;
		local101.aByteArray46 = this.aByteArray46;
		local101.aByteArray47 = this.aByteArray47;
		local101.aByteArray44 = this.aByteArray44;
		local101.anIntArray381 = this.anIntArray381;
		local101.anIntArray386 = this.anIntArray386;
		local101.anIntArrayArray37 = this.anIntArrayArray37;
		local101.anIntArrayArray38 = this.anIntArrayArray38;
		local101.aShort2 = this.aShort2;
		local101.aShort1 = this.aShort1;
		local101.anIntArray384 = new int[local101.anInt3618];
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
			for (local245 = 0; local245 < local101.anInt3618; local245++) {
				local253 = this.anIntArray391[local245] + arg1;
				local260 = this.anIntArray388[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray384[local245] = this.anIntArray384[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt3618; local245++) {
				local253 = (-this.anIntArray384[local245] << 16) / super.anInt3614;
				if (local253 < arg4) {
					local260 = this.anIntArray391[local245] + arg1;
					local264 = this.anIntArray388[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(461) int local461 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray384[local245] = this.anIntArray384[local245] + (local461 - arg2) * (arg4 - local253) / arg4;
				}
			}
		}
		local101.method2560();
		return local101;
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "()V")
	public void method2564() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			this.anIntArray388[local1] = -this.anIntArray388[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt3616; local18++) {
			@Pc(24) int local24 = this.anIntArray392[local18];
			this.anIntArray392[local18] = this.anIntArray383[local18];
			this.anIntArray383[local18] = local24;
		}
		this.method2560();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIZZ)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method2565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class2_Sub1_Sub3_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(SS)V")
	public void method2566(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3616; local1++) {
			if (this.aShortArray36[local1] == arg0) {
				this.aShortArray36[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(SS)V")
	public void method2567(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray32 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt3616; local5++) {
			if (this.aShortArray32[local5] == arg0) {
				this.aShortArray32[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "()V")
	public void method2568() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			@Pc(7) int local7 = this.anIntArray391[local1];
			this.anIntArray391[local1] = this.anIntArray388[local1];
			this.anIntArray388[local1] = -local7;
		}
		this.method2560();
	}
}
