import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class5_Sub2_Sub2_Sub1 extends Class5_Sub2_Sub2 {

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "[Lclient!sf;")
	public Class67[] aClass67Array1;

	@OriginalMember(owner = "client!cb", name = "gb", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!cb", name = "ib", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!cb", name = "kb", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!cb", name = "ob", descriptor = "[I")
	public int[] anIntArray91;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!cb", name = "qb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
	public int anInt430;

	@OriginalMember(owner = "client!cb", name = "sb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!cb", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cb", name = "vb", descriptor = "I")
	public int anInt431;

	@OriginalMember(owner = "client!cb", name = "wb", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!cb", name = "xb", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!cb", name = "Ab", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!cb", name = "Bb", descriptor = "I")
	public int anInt432;

	@OriginalMember(owner = "client!cb", name = "Eb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!cb", name = "Fb", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!cb", name = "Gb", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!cb", name = "Hb", descriptor = "I")
	private int anInt434;

	@OriginalMember(owner = "client!cb", name = "Ib", descriptor = "I")
	public int anInt435;

	@OriginalMember(owner = "client!cb", name = "Jb", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cb", name = "Kb", descriptor = "[Lclient!sf;")
	public Class67[] aClass67Array2;

	@OriginalMember(owner = "client!cb", name = "Lb", descriptor = "I")
	public int anInt436;

	@OriginalMember(owner = "client!cb", name = "Mb", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!cb", name = "Nb", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!cb", name = "Ob", descriptor = "[I")
	public int[] anIntArray99;

	@OriginalMember(owner = "client!cb", name = "Pb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!cb", name = "Rb", descriptor = "[Lclient!ja;")
	private Class38[] aClass38Array1;

	@OriginalMember(owner = "client!cb", name = "Tb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
	public int anInt429 = 0;

	@OriginalMember(owner = "client!cb", name = "yb", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!cb", name = "zb", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!cb", name = "Sb", descriptor = "I")
	public int anInt437 = 0;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	private Class5_Sub2_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub2_Sub1(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method327(arg0);
		} else {
			this.method334(arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([Lclient!cb;I)V")
	public Class5_Sub2_Sub2_Sub1(@OriginalArg(0) Class5_Sub2_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt437 = 0;
		this.anInt429 = 0;
		this.anInt434 = 0;
		this.aByte1 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class5_Sub2_Sub2_Sub1 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt437 += local44.anInt437;
				this.anInt429 += local44.anInt429;
				this.anInt434 += local44.anInt434;
				if (local44.aByteArray13 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local44.aByte1;
					}
					if (this.aByte1 != local44.aByte1) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray9 != null;
				local19 |= local44.aByteArray11 != null;
				local21 |= local44.anIntArray98 != null;
				local23 |= local44.aShortArray1 != null;
				local25 |= local44.aByteArray10 != null;
			}
		}
		this.anIntArray97 = new int[this.anInt437];
		this.anIntArray96 = new int[this.anInt437];
		this.anIntArray91 = new int[this.anInt437];
		this.anIntArray90 = new int[this.anInt437];
		this.anIntArray99 = new int[this.anInt429];
		this.anIntArray95 = new int[this.anInt429];
		this.anIntArray93 = new int[this.anInt429];
		if (local15) {
			this.aByteArray9 = new byte[this.anInt429];
		}
		if (local17) {
			this.aByteArray13 = new byte[this.anInt429];
		}
		if (local19) {
			this.aByteArray11 = new byte[this.anInt429];
		}
		if (local21) {
			this.anIntArray98 = new int[this.anInt429];
		}
		if (local23) {
			this.aShortArray1 = new short[this.anInt429];
		}
		if (local25) {
			this.aByteArray10 = new byte[this.anInt429];
		}
		this.aShortArray6 = new short[this.anInt429];
		if (this.anInt434 > 0) {
			this.aByteArray12 = new byte[this.anInt434];
			this.aShortArray10 = new short[this.anInt434];
			this.aShortArray2 = new short[this.anInt434];
			this.aShortArray5 = new short[this.anInt434];
			this.aShortArray4 = new short[this.anInt434];
			this.aShortArray9 = new short[this.anInt434];
			this.aShortArray8 = new short[this.anInt434];
			this.aShortArray7 = new short[this.anInt434];
			this.aByteArray8 = new byte[this.anInt434];
			this.aShortArray3 = new short[this.anInt434];
			this.aShortArray11 = new short[this.anInt434];
		}
		this.anInt437 = 0;
		this.anInt429 = 0;
		this.anInt434 = 0;
		for (@Pc(288) int local288 = 0; local288 < arg1; local288++) {
			@Pc(293) Class5_Sub2_Sub2_Sub1 local293 = arg0[local288];
			if (local293 != null) {
				for (@Pc(297) int local297 = 0; local297 < local293.anInt429; local297++) {
					if (local15 && local293.aByteArray9 != null) {
						this.aByteArray9[this.anInt429] = local293.aByteArray9[local297];
					}
					if (local17) {
						if (local293.aByteArray13 == null) {
							this.aByteArray13[this.anInt429] = local293.aByte1;
						} else {
							this.aByteArray13[this.anInt429] = local293.aByteArray13[local297];
						}
					}
					if (local19 && local293.aByteArray11 != null) {
						this.aByteArray11[this.anInt429] = local293.aByteArray11[local297];
					}
					if (local21 && local293.anIntArray98 != null) {
						this.anIntArray98[this.anInt429] = local293.anIntArray98[local297];
					}
					if (local23) {
						if (local293.aShortArray1 == null) {
							this.aShortArray1[this.anInt429] = -1;
						} else {
							this.aShortArray1[this.anInt429] = local293.aShortArray1[local297];
						}
					}
					if (local25) {
						if (local293.aByteArray10 == null || local293.aByteArray10[local297] == -1) {
							this.aByteArray10[this.anInt429] = -1;
						} else {
							this.aByteArray10[this.anInt429] = (byte) (local293.aByteArray10[local297] + this.anInt434);
						}
					}
					this.aShortArray6[this.anInt429] = local293.aShortArray6[local297];
					this.anIntArray99[this.anInt429] = this.method335(local293, local293.anIntArray99[local297]);
					this.anIntArray95[this.anInt429] = this.method335(local293, local293.anIntArray95[local297]);
					this.anIntArray93[this.anInt429] = this.method335(local293, local293.anIntArray93[local297]);
					this.anInt429++;
				}
				for (@Pc(472) int local472 = 0; local472 < local293.anInt434; local472++) {
					@Pc(484) byte local484 = this.aByteArray12[this.anInt434] = local293.aByteArray12[local472];
					if (local484 == 0) {
						this.aShortArray10[this.anInt434] = (short) this.method335(local293, local293.aShortArray10[local472]);
						this.aShortArray2[this.anInt434] = (short) this.method335(local293, local293.aShortArray2[local472]);
						this.aShortArray5[this.anInt434] = (short) this.method335(local293, local293.aShortArray5[local472]);
					}
					if (local484 >= 1 && local484 <= 3) {
						this.aShortArray10[this.anInt434] = local293.aShortArray10[local472];
						this.aShortArray2[this.anInt434] = local293.aShortArray2[local472];
						this.aShortArray5[this.anInt434] = local293.aShortArray5[local472];
						this.aShortArray4[this.anInt434] = local293.aShortArray4[local472];
						this.aShortArray9[this.anInt434] = local293.aShortArray9[local472];
						this.aShortArray8[this.anInt434] = local293.aShortArray8[local472];
						this.aShortArray7[this.anInt434] = local293.aShortArray7[local472];
						this.aByteArray8[this.anInt434] = local293.aByteArray8[local472];
						this.aShortArray3[this.anInt434] = local293.aShortArray3[local472];
					}
					if (local484 == 2) {
						this.aShortArray11[this.anInt434] = local293.aShortArray11[local472];
					}
					this.anInt434++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!cb;ZZZZ)V")
	public Class5_Sub2_Sub2_Sub1(@OriginalArg(0) Class5_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt437 = arg0.anInt437;
		this.anInt429 = arg0.anInt429;
		this.anInt434 = arg0.anInt434;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray97 = arg0.anIntArray97;
			this.anIntArray96 = arg0.anIntArray96;
			this.anIntArray91 = arg0.anIntArray91;
		} else {
			this.anIntArray97 = new int[this.anInt437];
			this.anIntArray96 = new int[this.anInt437];
			this.anIntArray91 = new int[this.anInt437];
			for (local57 = 0; local57 < this.anInt437; local57++) {
				this.anIntArray97[local57] = arg0.anIntArray97[local57];
				this.anIntArray96[local57] = arg0.anIntArray96[local57];
				this.anIntArray91[local57] = arg0.anIntArray91[local57];
			}
		}
		if (arg2) {
			this.aShortArray6 = arg0.aShortArray6;
		} else {
			this.aShortArray6 = new short[this.anInt429];
			for (local57 = 0; local57 < this.anInt429; local57++) {
				this.aShortArray6[local57] = arg0.aShortArray6[local57];
			}
		}
		if (arg3 || arg0.aShortArray1 == null) {
			this.aShortArray1 = arg0.aShortArray1;
		} else {
			this.aShortArray1 = new short[this.anInt429];
			for (local57 = 0; local57 < this.anInt429; local57++) {
				this.aShortArray1[local57] = arg0.aShortArray1[local57];
			}
		}
		this.aByteArray11 = arg0.aByteArray11;
		this.anIntArray99 = arg0.anIntArray99;
		this.anIntArray95 = arg0.anIntArray95;
		this.anIntArray93 = arg0.anIntArray93;
		this.aByteArray9 = arg0.aByteArray9;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByteArray10 = arg0.aByteArray10;
		this.aByte1 = arg0.aByte1;
		this.aByteArray12 = arg0.aByteArray12;
		this.aShortArray10 = arg0.aShortArray10;
		this.aShortArray2 = arg0.aShortArray2;
		this.aShortArray5 = arg0.aShortArray5;
		this.aShortArray4 = arg0.aShortArray4;
		this.aShortArray9 = arg0.aShortArray9;
		this.aShortArray8 = arg0.aShortArray8;
		this.aShortArray7 = arg0.aShortArray7;
		this.aByteArray8 = arg0.aByteArray8;
		this.aShortArray3 = arg0.aShortArray3;
		this.aShortArray11 = arg0.aShortArray11;
		this.anIntArray90 = arg0.anIntArray90;
		this.anIntArray98 = arg0.anIntArray98;
		this.anIntArrayArray6 = arg0.anIntArrayArray6;
		this.anIntArrayArray5 = arg0.anIntArrayArray5;
		this.aClass67Array2 = arg0.aClass67Array2;
		this.aClass38Array1 = arg0.aClass38Array1;
		this.aClass67Array1 = arg0.aClass67Array1;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	private void method320() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray90 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt437; local9++) {
				local15 = this.anIntArray90[local9];
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
			while (local59 < this.anInt437) {
				local65 = this.anIntArray90[local59];
				this.anIntArrayArray6[local65][local5[local65]++] = local59++;
			}
			this.anIntArray90 = null;
		}
		if (this.anIntArray98 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt429; local9++) {
			local15 = this.anIntArray98[local9];
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
		while (local59 < this.anInt429) {
			local65 = this.anIntArray98[local59];
			this.anIntArrayArray5[local65][local5[local65]++] = local59++;
		}
		this.anIntArray98 = null;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
	public void method321() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt437; local1++) {
			@Pc(7) int local7 = this.anIntArray91[local1];
			this.anIntArray91[local1] = this.anIntArray97[local1];
			this.anIntArray97[local1] = -local7;
		}
		this.method330();
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()V")
	public void method322() {
		if (this.aBoolean10) {
			return;
		}
		super.anInt3358 = 0;
		this.anInt431 = 0;
		this.anInt430 = 999999;
		this.anInt435 = -999999;
		this.anInt432 = -99999;
		this.anInt436 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt437; local23++) {
			@Pc(29) int local29 = this.anIntArray97[local23];
			@Pc(34) int local34 = this.anIntArray96[local23];
			@Pc(39) int local39 = this.anIntArray91[local23];
			if (local29 < this.anInt430) {
				this.anInt430 = local29;
			}
			if (local29 > this.anInt435) {
				this.anInt435 = local29;
			}
			if (local39 < this.anInt436) {
				this.anInt436 = local39;
			}
			if (local39 > this.anInt432) {
				this.anInt432 = local39;
			}
			if (-local34 > super.anInt3358) {
				super.anInt3358 = -local34;
			}
			if (local34 > this.anInt431) {
				this.anInt431 = local34;
			}
		}
		this.aBoolean10 = true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	public void method323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt437; local1++) {
			this.anIntArray97[local1] = this.anIntArray97[local1] * arg0 / 128;
			this.anIntArray96[local1] = this.anIntArray96[local1] * arg1 / 128;
			this.anIntArray91[local1] = this.anIntArray91[local1] * arg2 / 128;
		}
		this.method330();
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
	public void method324() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt437; local1++) {
			this.anIntArray91[local1] = -this.anIntArray91[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt429; local18++) {
			@Pc(24) int local24 = this.anIntArray99[local18];
			this.anIntArray99[local18] = this.anIntArray93[local18];
			this.anIntArray93[local18] = local24;
		}
		this.method330();
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "()V")
	public void method325() {
		if (this.aClass67Array2 != null) {
			return;
		}
		this.aClass67Array2 = new Class67[this.anInt437];
		for (@Pc(10) int local10 = 0; local10 < this.anInt437; local10++) {
			this.aClass67Array2[local10] = new Class67();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt429; local25++) {
			@Pc(31) int local31 = this.anIntArray99[local25];
			@Pc(36) int local36 = this.anIntArray95[local25];
			@Pc(41) int local41 = this.anIntArray93[local25];
			@Pc(51) int local51 = this.anIntArray97[local36] - this.anIntArray97[local31];
			@Pc(61) int local61 = this.anIntArray96[local36] - this.anIntArray96[local31];
			@Pc(71) int local71 = this.anIntArray91[local36] - this.anIntArray91[local31];
			@Pc(81) int local81 = this.anIntArray97[local41] - this.anIntArray97[local31];
			@Pc(91) int local91 = this.anIntArray96[local41] - this.anIntArray96[local31];
			@Pc(101) int local101 = this.anIntArray91[local41] - this.anIntArray91[local31];
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
			if (this.aByteArray9 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray9[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class67 local211 = this.aClass67Array2[local31];
				local211.anInt2841 += local109;
				local211.anInt2838 += local117;
				local211.anInt2837 += local125;
				local211.anInt2843++;
				@Pc(240) Class67 local240 = this.aClass67Array2[local36];
				local240.anInt2841 += local109;
				local240.anInt2838 += local117;
				local240.anInt2837 += local125;
				local240.anInt2843++;
				@Pc(269) Class67 local269 = this.aClass67Array2[local41];
				local269.anInt2841 += local109;
				local269.anInt2838 += local117;
				local269.anInt2837 += local125;
				local269.anInt2843++;
			} else if (local198 == 1) {
				if (this.aClass38Array1 == null) {
					this.aClass38Array1 = new Class38[this.anInt429];
				}
				@Pc(314) Class38 local314 = this.aClass38Array1[local25] = new Class38();
				local314.anInt1408 = local109;
				local314.anInt1407 = local117;
				local314.anInt1404 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([B)V")
	private void method327(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class5_Sub14 local4 = new Class5_Sub14(arg0);
		@Pc(9) Class5_Sub14 local9 = new Class5_Sub14(arg0);
		@Pc(14) Class5_Sub14 local14 = new Class5_Sub14(arg0);
		@Pc(19) Class5_Sub14 local19 = new Class5_Sub14(arg0);
		@Pc(24) Class5_Sub14 local24 = new Class5_Sub14(arg0);
		@Pc(29) Class5_Sub14 local29 = new Class5_Sub14(arg0);
		@Pc(34) Class5_Sub14 local34 = new Class5_Sub14(arg0);
		local4.anInt2199 = arg0.length - 23;
		@Pc(44) int local44 = local4.method1478();
		@Pc(48) int local48 = local4.method1478();
		@Pc(52) int local52 = local4.method1471();
		@Pc(56) int local56 = local4.method1471();
		@Pc(60) int local60 = local4.method1471();
		@Pc(64) int local64 = local4.method1471();
		@Pc(68) int local68 = local4.method1471();
		@Pc(72) int local72 = local4.method1471();
		@Pc(76) int local76 = local4.method1471();
		@Pc(80) int local80 = local4.method1478();
		@Pc(84) int local84 = local4.method1478();
		@Pc(88) int local88 = local4.method1478();
		@Pc(92) int local92 = local4.method1478();
		@Pc(96) int local96 = local4.method1478();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray12 = new byte[local52];
			local4.anInt2199 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray12[local113] = local4.method1447();
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
		local113 += local100 * 2;
		@Pc(283) int local283 = local113;
		local113 += local100;
		@Pc(289) int local289 = local113;
		local113 += local100 * 2 + local102 * 2;
		this.anInt437 = local44;
		this.anInt429 = local48;
		this.anInt434 = local52;
		this.anIntArray97 = new int[local44];
		this.anIntArray96 = new int[local44];
		this.anIntArray91 = new int[local44];
		this.anIntArray99 = new int[local48];
		this.anIntArray95 = new int[local48];
		this.anIntArray93 = new int[local48];
		if (local76 == 1) {
			this.anIntArray90 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray9 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray13 = new byte[local48];
		} else {
			this.aByte1 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray11 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray98 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray1 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray10 = new byte[local48];
		}
		this.aShortArray6 = new short[local48];
		if (local52 > 0) {
			this.aShortArray10 = new short[local52];
			this.aShortArray2 = new short[local52];
			this.aShortArray5 = new short[local52];
			if (local100 > 0) {
				this.aShortArray4 = new short[local100];
				this.aShortArray9 = new short[local100];
				this.aShortArray8 = new short[local100];
				this.aShortArray7 = new short[local100];
				this.aByteArray8 = new byte[local100];
				this.aShortArray3 = new short[local100];
			}
			if (local102 > 0) {
				this.aShortArray11 = new short[local102];
			}
		}
		local4.anInt2199 = local52;
		local9.anInt2199 = local233;
		local14.anInt2199 = local239;
		local19.anInt2199 = local245;
		local24.anInt2199 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method1471();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method1428();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method1428();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method1428();
			}
			this.anIntArray97[local463] = local457 + local470;
			this.anIntArray96[local463] = local459 + local480;
			this.anIntArray91[local463] = local461 + local490;
			local457 = this.anIntArray97[local463];
			local459 = this.anIntArray96[local463];
			local461 = this.anIntArray91[local463];
			if (local76 == 1) {
				this.anIntArray90[local463] = local24.method1471();
			}
		}
		local4.anInt2199 = local225;
		local9.anInt2199 = local151;
		local14.anInt2199 = local166;
		local19.anInt2199 = local193;
		local24.anInt2199 = local175;
		local29.anInt2199 = local208;
		local34.anInt2199 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray6[local468] = (short) local4.method1478();
			if (local56 == 1) {
				this.aByteArray9[local468] = local9.method1447();
			}
			if (local60 == 255) {
				this.aByteArray13[local468] = local14.method1447();
			}
			if (local64 == 1) {
				this.aByteArray11[local468] = local19.method1447();
			}
			if (local68 == 1) {
				this.anIntArray98[local468] = local24.method1471();
			}
			if (local72 == 1) {
				this.aShortArray1[local468] = (short) (local29.method1478() - 1);
			}
			if (this.aByteArray10 != null) {
				if (this.aShortArray1[local468] == -1) {
					this.aByteArray10[local468] = -1;
				} else {
					this.aByteArray10[local468] = (byte) (local34.method1471() - 1);
				}
			}
		}
		local4.anInt2199 = local202;
		local9.anInt2199 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method1471();
			if (local683 == 1) {
				local470 = local4.method1428() + local676;
				local480 = local4.method1428() + local470;
				local490 = local4.method1428() + local480;
				local676 = local490;
				this.anIntArray99[local678] = local470;
				this.anIntArray95[local678] = local480;
				this.anIntArray93[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method1428() + local676;
				local676 = local490;
				this.anIntArray99[local678] = local470;
				this.anIntArray95[local678] = local480;
				this.anIntArray93[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method1428() + local676;
				local676 = local490;
				this.anIntArray99[local678] = local470;
				this.anIntArray95[local678] = local480;
				this.anIntArray93[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method1428() + local676;
				local676 = local490;
				this.anIntArray99[local678] = local470;
				this.anIntArray95[local678] = local786;
				this.anIntArray93[local678] = local490;
			}
		}
		local4.anInt2199 = local251;
		local9.anInt2199 = local259;
		local14.anInt2199 = local267;
		local19.anInt2199 = local275;
		local24.anInt2199 = local283;
		local29.anInt2199 = local289;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray12[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray10[local683] = (short) local4.method1478();
				this.aShortArray2[local683] = (short) local4.method1478();
				this.aShortArray5[local683] = (short) local4.method1478();
			}
			if (local786 == 1) {
				this.aShortArray10[local683] = (short) local9.method1478();
				this.aShortArray2[local683] = (short) local9.method1478();
				this.aShortArray5[local683] = (short) local9.method1478();
				this.aShortArray4[local683] = (short) local14.method1478();
				this.aShortArray9[local683] = (short) local14.method1478();
				this.aShortArray8[local683] = (short) local14.method1478();
				this.aShortArray7[local683] = (short) local19.method1478();
				this.aByteArray8[local683] = local24.method1447();
				this.aShortArray3[local683] = (short) local29.method1478();
			}
			if (local786 == 2) {
				this.aShortArray10[local683] = (short) local9.method1478();
				this.aShortArray2[local683] = (short) local9.method1478();
				this.aShortArray5[local683] = (short) local9.method1478();
				this.aShortArray4[local683] = (short) local14.method1478();
				this.aShortArray9[local683] = (short) local14.method1478();
				this.aShortArray8[local683] = (short) local14.method1478();
				this.aShortArray7[local683] = (short) local19.method1478();
				this.aByteArray8[local683] = local24.method1447();
				this.aShortArray3[local683] = (short) local29.method1478();
				this.aShortArray11[local683] = (short) local29.method1478();
			}
			if (local786 == 3) {
				this.aShortArray10[local683] = (short) local9.method1478();
				this.aShortArray2[local683] = (short) local9.method1478();
				this.aShortArray5[local683] = (short) local9.method1478();
				this.aShortArray4[local683] = (short) local14.method1478();
				this.aShortArray9[local683] = (short) local14.method1478();
				this.aShortArray8[local683] = (short) local14.method1478();
				this.aShortArray7[local683] = (short) local19.method1478();
				this.aByteArray8[local683] = local24.method1447();
				this.aShortArray3[local683] = (short) local29.method1478();
			}
		}
		local4.anInt2199 = local113;
		local786 = local4.method1471();
		if (local786 == 0) {
			return;
		}
		new Class79();
		local4.method1478();
		local4.method1478();
		local4.method1478();
		local4.method1461();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
	public void method328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt437; local1++) {
			this.anIntArray97[local1] += arg0;
			this.anIntArray96[local1] += arg1;
			this.anIntArray91[local1] += arg2;
		}
		this.method330();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(SS)V")
	public void method329(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt429; local1++) {
			if (this.aShortArray6[local1] == arg0) {
				this.aShortArray6[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "()V")
	private void method330() {
		this.aClass67Array2 = null;
		this.aClass67Array1 = null;
		this.aClass38Array1 = null;
		this.aBoolean10 = false;
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "()V")
	public void method332() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt437; local1++) {
			this.anIntArray97[local1] = -this.anIntArray97[local1];
			this.anIntArray91[local1] = -this.anIntArray91[local1];
		}
		this.method330();
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "()V")
	public void method333() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt437; local1++) {
			@Pc(7) int local7 = this.anIntArray97[local1];
			this.anIntArray97[local1] = this.anIntArray91[local1];
			this.anIntArray91[local1] = -local7;
		}
		this.method330();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "([B)V")
	private void method334(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class5_Sub14 local8 = new Class5_Sub14(arg0);
		@Pc(13) Class5_Sub14 local13 = new Class5_Sub14(arg0);
		@Pc(18) Class5_Sub14 local18 = new Class5_Sub14(arg0);
		@Pc(23) Class5_Sub14 local23 = new Class5_Sub14(arg0);
		@Pc(28) Class5_Sub14 local28 = new Class5_Sub14(arg0);
		local8.anInt2199 = arg0.length - 18;
		@Pc(38) int local38 = local8.method1478();
		@Pc(42) int local42 = local8.method1478();
		@Pc(46) int local46 = local8.method1471();
		@Pc(50) int local50 = local8.method1471();
		@Pc(54) int local54 = local8.method1471();
		@Pc(58) int local58 = local8.method1471();
		@Pc(62) int local62 = local8.method1471();
		@Pc(66) int local66 = local8.method1471();
		@Pc(70) int local70 = local8.method1478();
		@Pc(74) int local74 = local8.method1478();
		@Pc(78) int local78 = local8.method1478();
		@Pc(82) int local82 = local8.method1478();
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
		this.anInt437 = local38;
		this.anInt429 = local42;
		this.anInt434 = local46;
		this.anIntArray97 = new int[local38];
		this.anIntArray96 = new int[local38];
		this.anIntArray91 = new int[local38];
		this.anIntArray99 = new int[local42];
		this.anIntArray95 = new int[local42];
		this.anIntArray93 = new int[local42];
		if (local46 > 0) {
			this.aByteArray12 = new byte[local46];
			this.aShortArray10 = new short[local46];
			this.aShortArray2 = new short[local46];
			this.aShortArray5 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray90 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray9 = new byte[local42];
			this.aByteArray10 = new byte[local42];
			this.aShortArray1 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray13 = new byte[local42];
		} else {
			this.aByte1 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray11 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray98 = new int[local42];
		}
		this.aShortArray6 = new short[local42];
		local8.anInt2199 = 0;
		local13.anInt2199 = local165;
		local18.anInt2199 = local171;
		local23.anInt2199 = local90;
		local28.anInt2199 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method1471();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method1428();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method1428();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method1428();
			}
			this.anIntArray97[local307] = local301 + local314;
			this.anIntArray96[local307] = local303 + local324;
			this.anIntArray91[local307] = local305 + local334;
			local301 = this.anIntArray97[local307];
			local303 = this.anIntArray96[local307];
			local305 = this.anIntArray91[local307];
			if (local66 == 1) {
				this.anIntArray90[local307] = local28.method1471();
			}
		}
		local8.anInt2199 = local149;
		local13.anInt2199 = local116;
		local18.anInt2199 = local98;
		local23.anInt2199 = local134;
		local28.anInt2199 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray6[local312] = (short) local8.method1478();
			if (local50 == 1) {
				local314 = local13.method1471();
				if ((local314 & 0x1) == 1) {
					this.aByteArray9[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray9[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray10[local312] = (byte) (local314 >> 2);
					this.aShortArray1[local312] = this.aShortArray6[local312];
					this.aShortArray6[local312] = 127;
					if (this.aShortArray1[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray10[local312] = -1;
					this.aShortArray1[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray13[local312] = local18.method1447();
			}
			if (local58 == 1) {
				this.aByteArray11[local312] = local23.method1447();
			}
			if (local62 == 1) {
				this.anIntArray98[local312] = local28.method1471();
			}
		}
		local8.anInt2199 = local143;
		local13.anInt2199 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method1471();
			if (local543 == 1) {
				local314 = local8.method1428() + local536;
				local324 = local8.method1428() + local314;
				local334 = local8.method1428() + local324;
				local536 = local334;
				this.anIntArray99[local538] = local314;
				this.anIntArray95[local538] = local324;
				this.anIntArray93[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method1428() + local536;
				local536 = local334;
				this.anIntArray99[local538] = local314;
				this.anIntArray95[local538] = local324;
				this.anIntArray93[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method1428() + local536;
				local536 = local334;
				this.anIntArray99[local538] = local314;
				this.anIntArray95[local538] = local324;
				this.anIntArray93[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method1428() + local536;
				local536 = local334;
				this.anIntArray99[local538] = local314;
				this.anIntArray95[local538] = local646;
				this.anIntArray93[local538] = local334;
			}
		}
		local8.anInt2199 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray12[local543] = 0;
			this.aShortArray10[local543] = (short) local8.method1478();
			this.aShortArray2[local543] = (short) local8.method1478();
			this.aShortArray5[local543] = (short) local8.method1478();
		}
		if (this.aByteArray10 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray10[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray10[local731] & 0xFFFF) == this.anIntArray99[local723] && (this.aShortArray2[local731] & 0xFFFF) == this.anIntArray95[local723] && (this.aShortArray5[local731] & 0xFFFF) == this.anIntArray93[local723]) {
						this.aByteArray10[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray10 = null;
			}
		}
		if (!local3) {
			this.aShortArray1 = null;
		}
		if (!local1) {
			this.aByteArray9 = null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!cb;I)I")
	private int method335(@OriginalArg(0) Class5_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray97[arg1];
		@Pc(11) int local11 = arg0.anIntArray96[arg1];
		@Pc(16) int local16 = arg0.anIntArray91[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt437; local18++) {
			if (local6 == this.anIntArray97[local18] && local11 == this.anIntArray96[local18] && local16 == this.anIntArray91[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray97[this.anInt437] = local6;
			this.anIntArray96[this.anInt437] = local11;
			this.anIntArray91[this.anInt437] = local16;
			if (arg0.anIntArray90 != null) {
				this.anIntArray90[this.anInt437] = arg0.anIntArray90[arg1];
			}
			local1 = this.anInt437++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([[IIIIZI)Lclient!cb;")
	public Class5_Sub2_Sub2_Sub1 method336(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method322();
		@Pc(6) int local6 = arg1 + this.anInt430;
		@Pc(11) int local11 = arg1 + this.anInt435;
		@Pc(16) int local16 = arg3 + this.anInt436;
		@Pc(21) int local21 = arg3 + this.anInt432;
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
		@Pc(101) Class5_Sub2_Sub2_Sub1 local101 = new Class5_Sub2_Sub2_Sub1();
		local101.anInt437 = this.anInt437;
		local101.anInt429 = this.anInt429;
		local101.anInt434 = this.anInt434;
		local101.anIntArray97 = this.anIntArray97;
		local101.anIntArray91 = this.anIntArray91;
		local101.anIntArray99 = this.anIntArray99;
		local101.anIntArray95 = this.anIntArray95;
		local101.anIntArray93 = this.anIntArray93;
		local101.aByteArray9 = this.aByteArray9;
		local101.aByteArray13 = this.aByteArray13;
		local101.aByteArray11 = this.aByteArray11;
		local101.aByteArray10 = this.aByteArray10;
		local101.aShortArray6 = this.aShortArray6;
		local101.aShortArray1 = this.aShortArray1;
		local101.aByte1 = this.aByte1;
		local101.aByteArray12 = this.aByteArray12;
		local101.aShortArray10 = this.aShortArray10;
		local101.aShortArray2 = this.aShortArray2;
		local101.aShortArray5 = this.aShortArray5;
		local101.aShortArray4 = this.aShortArray4;
		local101.aShortArray9 = this.aShortArray9;
		local101.aShortArray8 = this.aShortArray8;
		local101.aShortArray7 = this.aShortArray7;
		local101.aByteArray8 = this.aByteArray8;
		local101.aShortArray3 = this.aShortArray3;
		local101.aShortArray11 = this.aShortArray11;
		local101.anIntArray90 = this.anIntArray90;
		local101.anIntArray98 = this.anIntArray98;
		local101.anIntArrayArray6 = this.anIntArrayArray6;
		local101.anIntArrayArray5 = this.anIntArrayArray5;
		local101.aShort1 = this.aShort1;
		local101.aShort2 = this.aShort2;
		local101.anIntArray96 = new int[local101.anInt437];
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(268) int local268;
		@Pc(272) int local272;
		@Pc(294) int local294;
		@Pc(320) int local320;
		@Pc(332) int local332;
		if (arg4 == 0) {
			for (local241 = 0; local241 < local101.anInt437; local241++) {
				local249 = this.anIntArray97[local241] + arg1;
				local256 = this.anIntArray91[local241] + arg3;
				local260 = local249 & 0x7F;
				local264 = local256 & 0x7F;
				local268 = local249 >> 7;
				local272 = local256 >> 7;
				local294 = arg0[local268][local272] * (128 - local260) + arg0[local268 + 1][local272] * local260 >> 7;
				local320 = arg0[local268][local272 + 1] * (128 - local260) + arg0[local268 + 1][local272 + 1] * local260 >> 7;
				local332 = local294 * (128 - local264) + local320 * local264 >> 7;
				local101.anIntArray96[local241] = this.anIntArray96[local241] + local332 - arg2;
			}
		} else {
			for (local241 = 0; local241 < local101.anInt437; local241++) {
				local249 = (-this.anIntArray96[local241] << 16) / super.anInt3358;
				if (local249 < arg4) {
					local256 = this.anIntArray97[local241] + arg1;
					local260 = this.anIntArray91[local241] + arg3;
					local264 = local256 & 0x7F;
					local268 = local260 & 0x7F;
					local272 = local256 >> 7;
					local294 = local260 >> 7;
					local320 = arg0[local272][local294] * (128 - local264) + arg0[local272 + 1][local294] * local264 >> 7;
					local332 = arg0[local272][local294 + 1] * (128 - local264) + arg0[local272 + 1][local294 + 1] * local264 >> 7;
					@Pc(457) int local457 = local320 * (128 - local268) + local332 * local268 >> 7;
					local101.anIntArray96[local241] = this.anIntArray96[local241] + (local457 - arg2) * (arg4 - local249) / arg4;
				}
			}
		}
		local101.method330();
		return local101;
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "()Lclient!cb;")
	public Class5_Sub2_Sub2_Sub1 method338() {
		@Pc(3) Class5_Sub2_Sub2_Sub1 local3 = new Class5_Sub2_Sub2_Sub1();
		if (this.aByteArray9 != null) {
			local3.aByteArray9 = new byte[this.anInt429];
			for (@Pc(13) int local13 = 0; local13 < this.anInt429; local13++) {
				local3.aByteArray9[local13] = this.aByteArray9[local13];
			}
		}
		local3.anInt437 = this.anInt437;
		local3.anInt429 = this.anInt429;
		local3.anInt434 = this.anInt434;
		local3.anIntArray97 = this.anIntArray97;
		local3.anIntArray96 = this.anIntArray96;
		local3.anIntArray91 = this.anIntArray91;
		local3.anIntArray99 = this.anIntArray99;
		local3.anIntArray95 = this.anIntArray95;
		local3.anIntArray93 = this.anIntArray93;
		local3.aByteArray13 = this.aByteArray13;
		local3.aByteArray11 = this.aByteArray11;
		local3.aByteArray10 = this.aByteArray10;
		local3.aShortArray6 = this.aShortArray6;
		local3.aShortArray1 = this.aShortArray1;
		local3.aByte1 = this.aByte1;
		local3.aByteArray12 = this.aByteArray12;
		local3.aShortArray10 = this.aShortArray10;
		local3.aShortArray2 = this.aShortArray2;
		local3.aShortArray5 = this.aShortArray5;
		local3.aShortArray4 = this.aShortArray4;
		local3.aShortArray9 = this.aShortArray9;
		local3.aShortArray8 = this.aShortArray8;
		local3.aShortArray7 = this.aShortArray7;
		local3.aByteArray8 = this.aByteArray8;
		local3.aShortArray3 = this.aShortArray3;
		local3.aShortArray11 = this.aShortArray11;
		local3.anIntArray90 = this.anIntArray90;
		local3.anIntArray98 = this.anIntArray98;
		local3.anIntArrayArray6 = this.anIntArrayArray6;
		local3.anIntArrayArray5 = this.anIntArrayArray5;
		local3.aClass67Array2 = this.aClass67Array2;
		local3.aClass38Array1 = this.aClass38Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V")
	public void method340() {
		@Pc(3) int local3 = Static15.anIntArray100[256];
		@Pc(7) int local7 = Static15.anIntArray94[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt437; local9++) {
			@Pc(26) int local26 = this.anIntArray91[local9] * local3 + this.anIntArray97[local9] * local7 >> 16;
			this.anIntArray91[local9] = this.anIntArray91[local9] * local7 - this.anIntArray97[local9] * local3 >> 16;
			this.anIntArray97[local9] = local26;
		}
		this.method330();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method325();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class5_Sub2_Sub2_Sub6 local26 = new Class5_Sub2_Sub2_Sub6();
		local26.anIntArray408 = new int[this.anInt429];
		local26.anIntArray413 = new int[this.anInt429];
		local26.anIntArray414 = new int[this.anInt429];
		@Pc(51) int local51;
		if (this.aShortArray1 == null) {
			local26.aShortArray39 = null;
		} else {
			local26.aShortArray39 = new short[this.anInt429];
			for (local51 = 0; local51 < this.anInt429; local51++) {
				@Pc(57) short local57 = this.aShortArray1[local51];
				if (local57 != -1 && Static51.anInterface1_1.method1150(local57)) {
					local26.aShortArray39[local51] = local57;
				} else {
					local26.aShortArray39[local51] = -1;
				}
			}
		}
		@Pc(228) int local228;
		if (this.anInt434 > 0 && this.aByteArray10 != null) {
			@Pc(95) int[] local95 = new int[this.anInt434];
			for (@Pc(97) int local97 = 0; local97 < this.anInt429; local97++) {
				if (this.aByteArray10[local97] != -1) {
					local95[this.aByteArray10[local97] & 0xFF]++;
				}
			}
			local26.anInt3319 = 0;
			for (@Pc(126) int local126 = 0; local126 < this.anInt434; local126++) {
				if (local95[local126] > 0 && this.aByteArray12[local126] == 0) {
					local26.anInt3319++;
				}
			}
			local26.anIntArray412 = new int[local26.anInt3319];
			local26.anIntArray410 = new int[local26.anInt3319];
			local26.anIntArray419 = new int[local26.anInt3319];
			@Pc(164) int local164 = 0;
			for (@Pc(166) int local166 = 0; local166 < this.anInt434; local166++) {
				if (local95[local166] > 0 && this.aByteArray12[local166] == 0) {
					local26.anIntArray412[local164] = this.aShortArray10[local166] & 0xFFFF;
					local26.anIntArray410[local164] = this.aShortArray2[local166] & 0xFFFF;
					local26.anIntArray419[local164] = this.aShortArray5[local166] & 0xFFFF;
					local95[local166] = local164++;
				} else {
					local95[local166] = -1;
				}
			}
			local26.aByteArray42 = new byte[this.anInt429];
			for (local228 = 0; local228 < this.anInt429; local228++) {
				if (this.aByteArray10[local228] == -1) {
					local26.aByteArray42[local228] = -1;
				} else {
					local26.aByteArray42[local228] = (byte) local95[this.aByteArray10[local228] & 0xFF];
					if (local26.aByteArray42[local228] == -1 && local26.aShortArray39 != null) {
						local26.aShortArray39[local228] = -1;
					}
				}
			}
		}
		for (local51 = 0; local51 < this.anInt429; local51++) {
			@Pc(281) byte local281;
			if (this.aByteArray9 == null) {
				local281 = 0;
			} else {
				local281 = this.aByteArray9[local51];
			}
			@Pc(292) byte local292;
			if (this.aByteArray11 == null) {
				local292 = 0;
			} else {
				local292 = this.aByteArray11[local51];
			}
			@Pc(303) short local303;
			if (local26.aShortArray39 == null) {
				local303 = -1;
			} else {
				local303 = local26.aShortArray39[local51];
			}
			if (local292 == -2) {
				local281 = 3;
			}
			if (local292 == -1) {
				local281 = 2;
			}
			@Pc(350) Class67 local350;
			@Pc(511) Class38 local511;
			if (local303 == -1) {
				if (local281 == 0) {
					@Pc(331) int local331 = this.aShortArray6[local51] & 0xFFFF;
					if (this.aClass67Array1 == null || this.aClass67Array1[this.anIntArray99[local51]] == null) {
						local350 = this.aClass67Array2[this.anIntArray99[local51]];
					} else {
						local350 = this.aClass67Array1[this.anIntArray99[local51]];
					}
					local228 = arg0 + (arg2 * local350.anInt2841 + arg3 * local350.anInt2838 + arg4 * local350.anInt2837) / (local22 * local350.anInt2843);
					local26.anIntArray408[local51] = Static15.method339(local331, local228);
					if (this.aClass67Array1 == null || this.aClass67Array1[this.anIntArray95[local51]] == null) {
						local350 = this.aClass67Array2[this.anIntArray95[local51]];
					} else {
						local350 = this.aClass67Array1[this.anIntArray95[local51]];
					}
					local228 = arg0 + (arg2 * local350.anInt2841 + arg3 * local350.anInt2838 + arg4 * local350.anInt2837) / (local22 * local350.anInt2843);
					local26.anIntArray413[local51] = Static15.method339(local331, local228);
					if (this.aClass67Array1 == null || this.aClass67Array1[this.anIntArray93[local51]] == null) {
						local350 = this.aClass67Array2[this.anIntArray93[local51]];
					} else {
						local350 = this.aClass67Array1[this.anIntArray93[local51]];
					}
					local228 = arg0 + (arg2 * local350.anInt2841 + arg3 * local350.anInt2838 + arg4 * local350.anInt2837) / (local22 * local350.anInt2843);
					local26.anIntArray414[local51] = Static15.method339(local331, local228);
				} else if (local281 == 1) {
					local511 = this.aClass38Array1[local51];
					local228 = arg0 + (arg2 * local511.anInt1408 + arg3 * local511.anInt1407 + arg4 * local511.anInt1404) / (local22 + local22 / 2);
					local26.anIntArray408[local51] = Static15.method339(this.aShortArray6[local51] & 0xFFFF, local228);
					local26.anIntArray414[local51] = -1;
				} else if (local281 == 3) {
					local26.anIntArray408[local51] = 128;
					local26.anIntArray414[local51] = -1;
				} else {
					local26.anIntArray414[local51] = -2;
				}
			} else if (local281 == 0) {
				if (this.aClass67Array1 == null || this.aClass67Array1[this.anIntArray99[local51]] == null) {
					local350 = this.aClass67Array2[this.anIntArray99[local51]];
				} else {
					local350 = this.aClass67Array1[this.anIntArray99[local51]];
				}
				local228 = arg0 + (arg2 * local350.anInt2841 + arg3 * local350.anInt2838 + arg4 * local350.anInt2837) / (local22 * local350.anInt2843);
				local26.anIntArray408[local51] = Static15.method326(local228);
				if (this.aClass67Array1 == null || this.aClass67Array1[this.anIntArray95[local51]] == null) {
					local350 = this.aClass67Array2[this.anIntArray95[local51]];
				} else {
					local350 = this.aClass67Array1[this.anIntArray95[local51]];
				}
				local228 = arg0 + (arg2 * local350.anInt2841 + arg3 * local350.anInt2838 + arg4 * local350.anInt2837) / (local22 * local350.anInt2843);
				local26.anIntArray413[local51] = Static15.method326(local228);
				if (this.aClass67Array1 == null || this.aClass67Array1[this.anIntArray93[local51]] == null) {
					local350 = this.aClass67Array2[this.anIntArray93[local51]];
				} else {
					local350 = this.aClass67Array1[this.anIntArray93[local51]];
				}
				local228 = arg0 + (arg2 * local350.anInt2841 + arg3 * local350.anInt2838 + arg4 * local350.anInt2837) / (local22 * local350.anInt2843);
				local26.anIntArray414[local51] = Static15.method326(local228);
			} else if (local281 == 1) {
				local511 = this.aClass38Array1[local51];
				local228 = arg0 + (arg2 * local511.anInt1408 + arg3 * local511.anInt1407 + arg4 * local511.anInt1404) / (local22 + local22 / 2);
				local26.anIntArray408[local51] = Static15.method326(local228);
				local26.anIntArray414[local51] = -1;
			} else {
				local26.anIntArray414[local51] = -2;
			}
		}
		this.method320();
		local26.anInt3321 = this.anInt437;
		local26.anIntArray417 = this.anIntArray97;
		local26.anIntArray415 = this.anIntArray96;
		local26.anIntArray411 = this.anIntArray91;
		local26.anInt3323 = this.anInt429;
		local26.anIntArray416 = this.anIntArray99;
		local26.anIntArray409 = this.anIntArray95;
		local26.anIntArray418 = this.anIntArray93;
		local26.aByteArray40 = this.aByteArray13;
		local26.aByteArray41 = this.aByteArray11;
		local26.aByte7 = this.aByte1;
		local26.anIntArrayArray26 = this.anIntArrayArray6;
		local26.anIntArrayArray27 = this.anIntArrayArray5;
		return local26;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(SS)V")
	public void method343(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray1 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt429; local5++) {
			if (this.aShortArray1[local5] == arg0) {
				this.aShortArray1[local5] = arg1;
			}
		}
	}
}
