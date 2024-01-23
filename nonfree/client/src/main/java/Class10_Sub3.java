import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!d", name = "r", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "[Lclient!jh;")
	public Class86[] aClass86Array1;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "[Lclient!jh;")
	public Class86[] aClass86Array2;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "S")
	public short aShort4;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!d", name = "I", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!d", name = "J", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "I")
	public int anInt858;

	@OriginalMember(owner = "client!d", name = "L", descriptor = "[Lclient!gg;")
	public Class64[] aClass64Array1;

	@OriginalMember(owner = "client!d", name = "M", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "[Lclient!go;")
	public Class67[] aClass67Array1;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!d", name = "T", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!d", name = "X", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!d", name = "kb", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!d", name = "lb", descriptor = "[I")
	public int[] anIntArray80;

	@OriginalMember(owner = "client!d", name = "mb", descriptor = "[Lclient!wb;")
	public Class190[] aClass190Array1;

	@OriginalMember(owner = "client!d", name = "nb", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!d", name = "ob", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!d", name = "pb", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!d", name = "qb", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!d", name = "rb", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "I")
	public int anInt857 = 0;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	public int anInt856 = 0;

	@OriginalMember(owner = "client!d", name = "V", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "B")
	public byte aByte2 = 0;

	@OriginalMember(owner = "client!d", name = "sb", descriptor = "I")
	public int anInt860 = 0;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
	private Class10_Sub3() {
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "([B)V")
	public Class10_Sub3(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method707(arg0);
		} else {
			this.method715(arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V")
	public Class10_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray71 = new int[arg0];
		this.anIntArray79 = new int[arg0];
		this.anIntArray74 = new int[arg0];
		this.anIntArray80 = new int[arg0];
		this.anIntArray81 = new int[arg1];
		this.anIntArray77 = new int[arg1];
		this.anIntArray75 = new int[arg1];
		this.aByteArray12 = new byte[arg1];
		this.aByteArray9 = new byte[arg1];
		this.aByteArray5 = new byte[arg1];
		this.aShortArray15 = new short[arg1];
		this.aShortArray22 = new short[arg1];
		this.aByteArray4 = new byte[arg1];
		this.anIntArray72 = new int[arg1];
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "([Lclient!d;I)V")
	public Class10_Sub3(@OriginalArg(0) Class10_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		this.anInt856 = 0;
		this.anInt857 = 0;
		this.anInt858 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		this.aByte2 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(53) Class10_Sub3 local53 = arg0[local46];
			if (local53 != null) {
				this.anInt856 += local53.anInt856;
				this.anInt857 += local53.anInt857;
				this.anInt858 += local53.anInt858;
				if (local53.aByteArray9 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local53.aByte2;
					}
					if (this.aByte2 != local53.aByte2) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local53.aByteArray12 != null;
				local22 |= local53.aByteArray5 != null;
				local24 |= local53.anIntArray72 != null;
				local26 |= local53.aShortArray22 != null;
				local28 |= local53.aByteArray4 != null;
				if (local53.aClass190Array1 != null) {
					local39 += local53.aClass190Array1.length;
				}
				if (local53.aClass67Array1 != null) {
					local41 += local53.aClass67Array1.length;
				}
			}
		}
		this.anIntArray71 = new int[this.anInt856];
		this.anIntArray79 = new int[this.anInt856];
		this.anIntArray74 = new int[this.anInt856];
		this.anIntArray80 = new int[this.anInt856];
		this.aShortArray21 = new short[this.anInt856];
		this.anIntArray81 = new int[this.anInt857];
		this.anIntArray77 = new int[this.anInt857];
		this.anIntArray75 = new int[this.anInt857];
		if (local18) {
			this.aByteArray12 = new byte[this.anInt857];
		}
		if (local20) {
			this.aByteArray9 = new byte[this.anInt857];
		}
		if (local22) {
			this.aByteArray5 = new byte[this.anInt857];
		}
		if (local24) {
			this.anIntArray72 = new int[this.anInt857];
		}
		if (local26) {
			this.aShortArray22 = new short[this.anInt857];
		}
		if (local28) {
			this.aByteArray4 = new byte[this.anInt857];
		}
		if (local39 > 0) {
			this.aClass190Array1 = new Class190[local39];
		}
		if (local41 > 0) {
			this.aClass67Array1 = new Class67[local41];
		}
		this.aShortArray15 = new short[this.anInt857];
		this.aShortArray17 = new short[this.anInt857];
		if (this.anInt858 > 0) {
			this.aByteArray8 = new byte[this.anInt858];
			this.aShortArray19 = new short[this.anInt858];
			this.aShortArray14 = new short[this.anInt858];
			this.aShortArray18 = new short[this.anInt858];
			this.aShortArray20 = new short[this.anInt858];
			this.aShortArray16 = new short[this.anInt858];
			this.aShortArray23 = new short[this.anInt858];
			this.aByteArray7 = new byte[this.anInt858];
			this.aByteArray11 = new byte[this.anInt858];
			this.aByteArray6 = new byte[this.anInt858];
			this.aByteArray13 = new byte[this.anInt858];
			this.aByteArray10 = new byte[this.anInt858];
		}
		this.anInt856 = 0;
		this.anInt857 = 0;
		this.anInt858 = 0;
		local39 = 0;
		local41 = 0;
		@Pc(356) Class10_Sub3 local356;
		@Pc(531) int local531;
		for (local46 = 0; local46 < arg1; local46++) {
			@Pc(352) short local352 = (short) (0x1 << local46);
			local356 = arg0[local46];
			if (local356 != null) {
				@Pc(360) int local360;
				for (local360 = 0; local360 < local356.anInt857; local360++) {
					if (local18 && local356.aByteArray12 != null) {
						this.aByteArray12[this.anInt857] = local356.aByteArray12[local360];
					}
					if (local20) {
						if (local356.aByteArray9 == null) {
							this.aByteArray9[this.anInt857] = local356.aByte2;
						} else {
							this.aByteArray9[this.anInt857] = local356.aByteArray9[local360];
						}
					}
					if (local22 && local356.aByteArray5 != null) {
						this.aByteArray5[this.anInt857] = local356.aByteArray5[local360];
					}
					if (local24 && local356.anIntArray72 != null) {
						this.anIntArray72[this.anInt857] = local356.anIntArray72[local360];
					}
					if (local26) {
						if (local356.aShortArray22 == null) {
							this.aShortArray22[this.anInt857] = -1;
						} else {
							this.aShortArray22[this.anInt857] = local356.aShortArray22[local360];
						}
					}
					this.aShortArray15[this.anInt857] = local356.aShortArray15[local360];
					this.aShortArray17[this.anInt857] = local352;
					this.anIntArray81[this.anInt857] = this.method706(local356, local356.anIntArray81[local360], local352);
					this.anIntArray77[this.anInt857] = this.method706(local356, local356.anIntArray77[local360], local352);
					this.anIntArray75[this.anInt857] = this.method706(local356, local356.anIntArray75[local360], local352);
					this.anInt857++;
				}
				if (local356.aClass190Array1 != null) {
					for (local360 = 0; local360 < local356.aClass190Array1.length; local360++) {
						local531 = this.method706(local356, local356.aClass190Array1[local360].anInt6005, local352);
						@Pc(541) int local541 = this.method706(local356, local356.aClass190Array1[local360].anInt6000, local352);
						@Pc(551) int local551 = this.method706(local356, local356.aClass190Array1[local360].anInt6001, local352);
						this.aClass190Array1[local39] = new Class190(local356.aClass190Array1[local360].aClass164_2, local531, local541, local551);
						local39++;
					}
				}
				if (local356.aClass67Array1 != null) {
					for (local360 = 0; local360 < local356.aClass67Array1.length; local360++) {
						local531 = this.method706(local356, local356.aClass67Array1[local360].anInt1836, local352);
						this.aClass67Array1[local41] = new Class67(local356.aClass67Array1[local360].aClass181_1, local531);
						local41++;
					}
				}
			}
		}
		local46 = 0;
		this.anInt860 = this.anInt856;
		for (@Pc(615) int local615 = 0; local615 < arg1; local615++) {
			local356 = arg0[local615];
			@Pc(627) short local627 = (short) (0x1 << local615);
			if (local356 != null) {
				for (local531 = 0; local531 < local356.anInt857; local531++) {
					if (local28) {
						this.aByteArray4[local46++] = (byte) (local356.aByteArray4 == null || local356.aByteArray4[local531] == -1 ? -1 : local356.aByteArray4[local531] + this.anInt858);
					}
				}
				for (local531 = 0; local531 < local356.anInt858; local531++) {
					@Pc(680) byte local680 = this.aByteArray8[this.anInt858] = local356.aByteArray8[local531];
					if (local680 == 0) {
						this.aShortArray19[this.anInt858] = (short) this.method706(local356, local356.aShortArray19[local531], local627);
						this.aShortArray14[this.anInt858] = (short) this.method706(local356, local356.aShortArray14[local531], local627);
						this.aShortArray18[this.anInt858] = (short) this.method706(local356, local356.aShortArray18[local531], local627);
					}
					if (local680 >= 1 && local680 <= 3) {
						this.aShortArray19[this.anInt858] = local356.aShortArray19[local531];
						this.aShortArray14[this.anInt858] = local356.aShortArray14[local531];
						this.aShortArray18[this.anInt858] = local356.aShortArray18[local531];
						this.aShortArray20[this.anInt858] = local356.aShortArray20[local531];
						this.aShortArray16[this.anInt858] = local356.aShortArray16[local531];
						this.aShortArray23[this.anInt858] = local356.aShortArray23[local531];
						this.aByteArray7[this.anInt858] = local356.aByteArray7[local531];
						this.aByteArray11[this.anInt858] = local356.aByteArray11[local531];
						this.aByteArray6[this.anInt858] = local356.aByteArray6[local531];
					}
					if (local680 == 2) {
						this.aByteArray13[this.anInt858] = local356.aByteArray13[local531];
						this.aByteArray10[this.anInt858] = local356.aByteArray10[local531];
					}
					this.anInt858++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!d;ZZZZ)V")
	public Class10_Sub3(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt856 = arg0.anInt856;
		this.anInt860 = arg0.anInt860;
		this.anInt857 = arg0.anInt857;
		this.anInt858 = arg0.anInt858;
		@Pc(64) int local64;
		if (arg1) {
			this.anIntArray71 = arg0.anIntArray71;
			this.anIntArray79 = arg0.anIntArray79;
			this.anIntArray74 = arg0.anIntArray74;
		} else {
			this.anIntArray71 = new int[this.anInt856];
			this.anIntArray79 = new int[this.anInt856];
			this.anIntArray74 = new int[this.anInt856];
			for (local64 = 0; local64 < this.anInt856; local64++) {
				this.anIntArray71[local64] = arg0.anIntArray71[local64];
				this.anIntArray79[local64] = arg0.anIntArray79[local64];
				this.anIntArray74[local64] = arg0.anIntArray74[local64];
			}
		}
		if (arg2) {
			this.aShortArray15 = arg0.aShortArray15;
		} else {
			this.aShortArray15 = new short[this.anInt857];
			for (local64 = 0; local64 < this.anInt857; local64++) {
				this.aShortArray15[local64] = arg0.aShortArray15[local64];
			}
		}
		if (arg3 || arg0.aShortArray22 == null) {
			this.aShortArray22 = arg0.aShortArray22;
		} else {
			this.aShortArray22 = new short[this.anInt857];
			for (local64 = 0; local64 < this.anInt857; local64++) {
				this.aShortArray22[local64] = arg0.aShortArray22[local64];
			}
		}
		this.aByteArray5 = arg0.aByteArray5;
		this.anIntArray81 = arg0.anIntArray81;
		this.anIntArray77 = arg0.anIntArray77;
		this.anIntArray75 = arg0.anIntArray75;
		this.aByteArray12 = arg0.aByteArray12;
		this.aByteArray9 = arg0.aByteArray9;
		this.aByteArray4 = arg0.aByteArray4;
		this.aByte2 = arg0.aByte2;
		this.aByteArray8 = arg0.aByteArray8;
		this.aShortArray19 = arg0.aShortArray19;
		this.aShortArray14 = arg0.aShortArray14;
		this.aShortArray18 = arg0.aShortArray18;
		this.aShortArray20 = arg0.aShortArray20;
		this.aShortArray16 = arg0.aShortArray16;
		this.aShortArray23 = arg0.aShortArray23;
		this.aByteArray7 = arg0.aByteArray7;
		this.aByteArray11 = arg0.aByteArray11;
		this.aByteArray6 = arg0.aByteArray6;
		this.aByteArray13 = arg0.aByteArray13;
		this.aByteArray10 = arg0.aByteArray10;
		this.anIntArray80 = arg0.anIntArray80;
		this.anIntArray72 = arg0.anIntArray72;
		this.anIntArrayArray9 = arg0.anIntArrayArray9;
		this.anIntArrayArray8 = arg0.anIntArrayArray8;
		this.aClass86Array2 = arg0.aClass86Array2;
		this.aClass64Array1 = arg0.aClass64Array1;
		this.aClass86Array1 = arg0.aClass86Array1;
		this.aShort7 = arg0.aShort7;
		this.aShort4 = arg0.aShort4;
		this.aClass190Array1 = arg0.aClass190Array1;
		this.aClass67Array1 = arg0.aClass67Array1;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()Z")
	@Override
	public boolean method4976() {
		return true;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
	public void method700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt856; local1++) {
			this.anIntArray71[local1] = this.anIntArray71[local1] * arg0 / 128;
			this.anIntArray79[local1] = this.anIntArray79[local1] * arg1 / 128;
			this.anIntArray74[local1] = this.anIntArray74[local1] * arg2 / 128;
		}
		this.method726();
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()V")
	public void method701() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt856; local1++) {
			@Pc(10) int local10 = this.anIntArray71[local1];
			this.anIntArray71[local1] = this.anIntArray74[local1];
			this.anIntArray74[local1] = -local10;
		}
		this.method726();
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIII)Lclient!ii;")
	public Class10_Sub4_Sub2 method702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class10_Sub4_Sub2(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!qf;IIIZ)V")
	@Override
	public void method4983(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class10_Sub3 local2 = (Class10_Sub3) arg0;
		local2.method710();
		local2.method723();
		Static46.anInt859++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray71;
		@Pc(18) int local18 = local2.anInt860;
		@Pc(20) int local20;
		for (local20 = 0; local20 < this.anInt860; local20++) {
			@Pc(29) Class86 local29 = this.aClass86Array2[local20];
			if (local29.anInt2486 != 0) {
				@Pc(40) int local40 = this.anIntArray79[local20] - arg2;
				if (local40 >= local2.aShort5 && local40 <= local2.aShort2) {
					@Pc(56) int local56 = this.anIntArray71[local20] - arg1;
					if (local56 >= local2.aShort9 && local56 <= local2.aShort8) {
						@Pc(72) int local72 = this.anIntArray74[local20] - arg3;
						if (local72 >= local2.aShort3 && local72 <= local2.aShort6) {
							for (@Pc(83) int local83 = 0; local83 < local18; local83++) {
								@Pc(91) Class86 local91 = local2.aClass86Array2[local83];
								if (local56 == local15[local83] && local72 == local2.anIntArray74[local83] && local40 == local2.anIntArray79[local83] && local91.anInt2486 != 0) {
									if (this.aClass86Array1 == null) {
										this.aClass86Array1 = new Class86[this.anInt860];
									}
									if (local2.aClass86Array1 == null) {
										local2.aClass86Array1 = new Class86[local18];
									}
									@Pc(131) Class86 local131 = this.aClass86Array1[local20];
									if (local131 == null) {
										local131 = this.aClass86Array1[local20] = new Class86(local29);
									}
									@Pc(148) Class86 local148 = local2.aClass86Array1[local83];
									if (local148 == null) {
										local148 = local2.aClass86Array1[local83] = new Class86(local91);
									}
									local131.anInt2489 += local91.anInt2489;
									local131.anInt2490 += local91.anInt2490;
									local131.anInt2485 += local91.anInt2485;
									local131.anInt2486 += local91.anInt2486;
									local148.anInt2489 += local29.anInt2489;
									local148.anInt2490 += local29.anInt2490;
									local148.anInt2485 += local29.anInt2485;
									local148.anInt2486 += local29.anInt2486;
									local12++;
									Static46.anIntArray73[local20] = Static46.anInt859;
									Static46.anIntArray70[local83] = Static46.anInt859;
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
		for (local20 = 0; local20 < this.anInt857; local20++) {
			if (Static46.anIntArray73[this.anIntArray81[local20]] == Static46.anInt859 && Static46.anIntArray73[this.anIntArray77[local20]] == Static46.anInt859 && Static46.anIntArray73[this.anIntArray75[local20]] == Static46.anInt859) {
				if (this.aByteArray12 == null) {
					this.aByteArray12 = new byte[this.anInt857];
				}
				this.aByteArray12[local20] = 2;
			}
		}
		for (local20 = 0; local20 < local2.anInt857; local20++) {
			if (Static46.anIntArray70[local2.anIntArray81[local20]] == Static46.anInt859 && Static46.anIntArray70[local2.anIntArray77[local20]] == Static46.anInt859 && Static46.anIntArray70[local2.anIntArray75[local20]] == Static46.anInt859) {
				if (local2.aByteArray12 == null) {
					local2.aByteArray12 = new byte[local2.anInt857];
				}
				local2.aByteArray12[local20] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
	public void method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt856; local1++) {
			this.anIntArray71[local1] += arg0;
			this.anIntArray79[local1] += arg1;
			this.anIntArray74[local1] += arg2;
		}
		this.method726();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIBSB)I")
	public int method705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray81[this.anInt857] = arg0;
		this.anIntArray77[this.anInt857] = arg1;
		this.anIntArray75[this.anInt857] = arg2;
		this.aByteArray12[this.anInt857] = 1;
		this.aByteArray4[this.anInt857] = -1;
		this.aShortArray15[this.anInt857] = arg3;
		this.aShortArray22[this.anInt857] = -1;
		this.aByteArray5[this.anInt857] = arg4;
		return this.anInt857++;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!d;IS)I")
	private int method706(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(4) int local4 = arg0.anIntArray71[arg1];
		@Pc(9) int local9 = arg0.anIntArray79[arg1];
		@Pc(14) int local14 = arg0.anIntArray74[arg1];
		for (@Pc(16) int local16 = 0; local16 < this.anInt856; local16++) {
			if (local4 == this.anIntArray71[local16] && local9 == this.anIntArray79[local16] && local14 == this.anIntArray74[local16]) {
				this.aShortArray21[local16] |= arg2;
				return local16;
			}
		}
		this.anIntArray71[this.anInt856] = local4;
		this.anIntArray79[this.anInt856] = local9;
		this.anIntArray74[this.anInt856] = local14;
		this.aShortArray21[this.anInt856] = arg2;
		if (arg0.anIntArray80 != null) {
			this.anIntArray80[this.anInt856] = arg0.anIntArray80[arg1];
		}
		return this.anInt856++;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([B)V")
	private void method707(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub26 local4 = new Class3_Sub26(arg0);
		@Pc(9) Class3_Sub26 local9 = new Class3_Sub26(arg0);
		@Pc(14) Class3_Sub26 local14 = new Class3_Sub26(arg0);
		@Pc(19) Class3_Sub26 local19 = new Class3_Sub26(arg0);
		@Pc(24) Class3_Sub26 local24 = new Class3_Sub26(arg0);
		@Pc(29) Class3_Sub26 local29 = new Class3_Sub26(arg0);
		@Pc(34) Class3_Sub26 local34 = new Class3_Sub26(arg0);
		local4.anInt4615 = arg0.length - 23;
		@Pc(44) int local44 = local4.method3948();
		@Pc(48) int local48 = local4.method3948();
		@Pc(52) int local52 = local4.method3915();
		@Pc(56) int local56 = local4.method3915();
		@Pc(65) boolean local65 = (local56 & 0x1) == 1;
		@Pc(74) boolean local74 = (local56 & 0x2) == 2;
		@Pc(78) int local78 = local4.method3915();
		@Pc(82) int local82 = local4.method3915();
		@Pc(86) int local86 = local4.method3915();
		@Pc(90) int local90 = local4.method3915();
		@Pc(94) int local94 = local4.method3915();
		@Pc(98) int local98 = local4.method3948();
		@Pc(102) int local102 = local4.method3948();
		@Pc(106) int local106 = local4.method3948();
		@Pc(110) int local110 = local4.method3948();
		@Pc(114) int local114 = local4.method3948();
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(131) int local131;
		if (local52 > 0) {
			this.aByteArray8 = new byte[local52];
			local4.anInt4615 = 0;
			for (local131 = 0; local131 < local52; local131++) {
				@Pc(143) byte local143 = this.aByteArray8[local131] = local4.method3920();
				if (local143 == 0) {
					local116++;
				}
				if (local143 >= 1 && local143 <= 3) {
					local118++;
				}
				if (local143 == 2) {
					local120++;
				}
			}
		}
		local131 = local52 + local44;
		@Pc(169) int local169 = local131;
		if (local65) {
			local131 += local48;
		}
		@Pc(177) int local177 = local131;
		local131 += local48;
		@Pc(183) int local183 = local131;
		if (local78 == 255) {
			local131 += local48;
		}
		@Pc(192) int local192 = local131;
		if (local86 == 1) {
			local131 += local48;
		}
		@Pc(201) int local201 = local131;
		if (local94 == 1) {
			local131 += local44;
		}
		@Pc(210) int local210 = local131;
		if (local82 == 1) {
			local131 += local48;
		}
		@Pc(219) int local219 = local131;
		local131 += local110;
		@Pc(225) int local225 = local131;
		if (local90 == 1) {
			local131 += local48 * 2;
		}
		@Pc(236) int local236 = local131;
		local131 += local114;
		@Pc(242) int local242 = local131;
		local131 += local48 * 2;
		@Pc(250) int local250 = local131;
		local131 += local98;
		@Pc(256) int local256 = local131;
		local131 += local102;
		@Pc(262) int local262 = local131;
		local131 += local106;
		@Pc(268) int local268 = local131;
		local131 += local116 * 6;
		@Pc(276) int local276 = local131;
		local131 += local118 * 6;
		@Pc(284) int local284 = local131;
		local131 += local118 * 6;
		@Pc(292) int local292 = local131;
		local131 += local118;
		@Pc(298) int local298 = local131;
		local131 += local118;
		@Pc(304) int local304 = local131;
		local131 += local118 + local120 * 2;
		this.anInt856 = local44;
		this.anInt857 = local48;
		this.anInt858 = local52;
		this.anIntArray71 = new int[local44];
		this.anIntArray79 = new int[local44];
		this.anIntArray74 = new int[local44];
		this.anIntArray81 = new int[local48];
		this.anIntArray77 = new int[local48];
		this.anIntArray75 = new int[local48];
		if (local94 == 1) {
			this.anIntArray80 = new int[local44];
		}
		if (local65) {
			this.aByteArray12 = new byte[local48];
		}
		if (local78 == 255) {
			this.aByteArray9 = new byte[local48];
		} else {
			this.aByte2 = (byte) local78;
		}
		if (local82 == 1) {
			this.aByteArray5 = new byte[local48];
		}
		if (local86 == 1) {
			this.anIntArray72 = new int[local48];
		}
		if (local90 == 1) {
			this.aShortArray22 = new short[local48];
		}
		if (local90 == 1 && local52 > 0) {
			this.aByteArray4 = new byte[local48];
		}
		this.aShortArray15 = new short[local48];
		if (local52 > 0) {
			this.aShortArray19 = new short[local52];
			this.aShortArray14 = new short[local52];
			this.aShortArray18 = new short[local52];
			if (local118 > 0) {
				this.aShortArray20 = new short[local118];
				this.aShortArray16 = new short[local118];
				this.aShortArray23 = new short[local118];
				this.aByteArray7 = new byte[local118];
				this.aByteArray11 = new byte[local118];
				this.aByteArray6 = new byte[local118];
			}
			if (local120 > 0) {
				this.aByteArray13 = new byte[local120];
				this.aByteArray10 = new byte[local120];
			}
		}
		local4.anInt4615 = local52;
		local9.anInt4615 = local250;
		local14.anInt4615 = local256;
		local19.anInt4615 = local262;
		local24.anInt4615 = local201;
		@Pc(473) int local473 = 0;
		@Pc(475) int local475 = 0;
		@Pc(477) int local477 = 0;
		@Pc(479) int local479;
		@Pc(486) int local486;
		@Pc(488) int local488;
		@Pc(498) int local498;
		@Pc(508) int local508;
		for (local479 = 0; local479 < local44; local479++) {
			local486 = local4.method3915();
			local488 = 0;
			if ((local486 & 0x1) != 0) {
				local488 = local9.method3937();
			}
			local498 = 0;
			if ((local486 & 0x2) != 0) {
				local498 = local14.method3937();
			}
			local508 = 0;
			if ((local486 & 0x4) != 0) {
				local508 = local19.method3937();
			}
			this.anIntArray71[local479] = local473 + local488;
			this.anIntArray79[local479] = local475 + local498;
			this.anIntArray74[local479] = local477 + local508;
			local473 = this.anIntArray71[local479];
			local475 = this.anIntArray79[local479];
			local477 = this.anIntArray74[local479];
			if (local94 == 1) {
				this.anIntArray80[local479] = local24.method3915();
			}
		}
		local4.anInt4615 = local242;
		local9.anInt4615 = local169;
		local14.anInt4615 = local183;
		local19.anInt4615 = local210;
		local24.anInt4615 = local192;
		local29.anInt4615 = local225;
		local34.anInt4615 = local236;
		for (local479 = 0; local479 < local48; local479++) {
			this.aShortArray15[local479] = (short) local4.method3948();
			if (local65) {
				this.aByteArray12[local479] = local9.method3920();
			}
			if (local78 == 255) {
				this.aByteArray9[local479] = local14.method3920();
			}
			if (local82 == 1) {
				this.aByteArray5[local479] = local19.method3920();
			}
			if (local86 == 1) {
				this.anIntArray72[local479] = local24.method3915();
			}
			if (local90 == 1) {
				this.aShortArray22[local479] = (short) (local29.method3948() - 1);
			}
			if (this.aByteArray4 != null) {
				if (this.aShortArray22[local479] == -1) {
					this.aByteArray4[local479] = -1;
				} else {
					this.aByteArray4[local479] = (byte) (local34.method3915() - 1);
				}
			}
		}
		this.anInt860 = -1;
		local4.anInt4615 = local219;
		local9.anInt4615 = local177;
		local479 = 0;
		local486 = 0;
		local488 = 0;
		local498 = 0;
		@Pc(703) int local703;
		@Pc(841) int local841;
		for (local508 = 0; local508 < local48; local508++) {
			local703 = local9.method3915();
			if (local703 == 1) {
				local479 = local4.method3937() + local498;
				local486 = local4.method3937() + local479;
				local488 = local4.method3937() + local486;
				local498 = local488;
				this.anIntArray81[local508] = local479;
				this.anIntArray77[local508] = local486;
				this.anIntArray75[local508] = local488;
				if (local479 > this.anInt860) {
					this.anInt860 = local479;
				}
				if (local486 > this.anInt860) {
					this.anInt860 = local486;
				}
				if (local488 > this.anInt860) {
					this.anInt860 = local488;
				}
			}
			if (local703 == 2) {
				local486 = local488;
				local488 = local4.method3937() + local498;
				local498 = local488;
				this.anIntArray81[local508] = local479;
				this.anIntArray77[local508] = local486;
				this.anIntArray75[local508] = local488;
				if (local488 > this.anInt860) {
					this.anInt860 = local488;
				}
			}
			if (local703 == 3) {
				local479 = local488;
				local488 = local4.method3937() + local498;
				local498 = local488;
				this.anIntArray81[local508] = local479;
				this.anIntArray77[local508] = local486;
				this.anIntArray75[local508] = local488;
				if (local488 > this.anInt860) {
					this.anInt860 = local488;
				}
			}
			if (local703 == 4) {
				local841 = local479;
				local479 = local486;
				local486 = local841;
				local488 = local4.method3937() + local498;
				local498 = local488;
				this.anIntArray81[local508] = local479;
				this.anIntArray77[local508] = local841;
				this.anIntArray75[local508] = local488;
				if (local488 > this.anInt860) {
					this.anInt860 = local488;
				}
			}
		}
		this.anInt860++;
		local4.anInt4615 = local268;
		local9.anInt4615 = local276;
		local14.anInt4615 = local284;
		local19.anInt4615 = local292;
		local24.anInt4615 = local298;
		local29.anInt4615 = local304;
		for (local508 = 0; local508 < local52; local508++) {
			local703 = this.aByteArray8[local508] & 0xFF;
			if (local703 == 0) {
				this.aShortArray19[local508] = (short) local4.method3948();
				this.aShortArray14[local508] = (short) local4.method3948();
				this.aShortArray18[local508] = (short) local4.method3948();
			}
			if (local703 == 1) {
				this.aShortArray19[local508] = (short) local9.method3948();
				this.aShortArray14[local508] = (short) local9.method3948();
				this.aShortArray18[local508] = (short) local9.method3948();
				this.aShortArray20[local508] = (short) local14.method3948();
				this.aShortArray16[local508] = (short) local14.method3948();
				this.aShortArray23[local508] = (short) local14.method3948();
				this.aByteArray7[local508] = local19.method3920();
				this.aByteArray11[local508] = local24.method3920();
				this.aByteArray6[local508] = local29.method3920();
			}
			if (local703 == 2) {
				this.aShortArray19[local508] = (short) local9.method3948();
				this.aShortArray14[local508] = (short) local9.method3948();
				this.aShortArray18[local508] = (short) local9.method3948();
				this.aShortArray20[local508] = (short) local14.method3948();
				this.aShortArray16[local508] = (short) local14.method3948();
				this.aShortArray23[local508] = (short) local14.method3948();
				this.aByteArray7[local508] = local19.method3920();
				this.aByteArray11[local508] = local24.method3920();
				this.aByteArray6[local508] = local29.method3920();
				this.aByteArray13[local508] = local29.method3920();
				this.aByteArray10[local508] = local29.method3920();
			}
			if (local703 == 3) {
				this.aShortArray19[local508] = (short) local9.method3948();
				this.aShortArray14[local508] = (short) local9.method3948();
				this.aShortArray18[local508] = (short) local9.method3948();
				this.aShortArray20[local508] = (short) local14.method3948();
				this.aShortArray16[local508] = (short) local14.method3948();
				this.aShortArray23[local508] = (short) local14.method3948();
				this.aByteArray7[local508] = local19.method3920();
				this.aByteArray11[local508] = local24.method3920();
				this.aByteArray6[local508] = local29.method3920();
			}
		}
		if (!local74) {
			return;
		}
		local4.anInt4615 = local131;
		local508 = local4.method3915();
		if (local508 > 0) {
			this.aClass190Array1 = new Class190[local508];
			for (local703 = 0; local703 < local508; local703++) {
				local841 = local4.method3948();
				@Pc(1199) int local1199 = local4.method3948();
				this.aClass190Array1[local703] = new Class190(local841, this.anIntArray81[local1199], this.anIntArray77[local1199], this.anIntArray75[local1199]);
			}
		}
		local703 = local4.method3915();
		if (local703 > 0) {
			this.aClass67Array1 = new Class67[local703];
			for (local841 = 0; local841 < local703; local841++) {
				this.aClass67Array1[local841] = new Class67(local4.method3948(), local4.method3948());
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Lclient!qf;")
	@Override
	public Class10 method4972() {
		return this.method717(this.aShort7, this.aShort4, -50, -10, -50);
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "()Lclient!d;")
	public Class10_Sub3 method708() {
		@Pc(3) Class10_Sub3 local3 = new Class10_Sub3();
		if (this.aByteArray12 != null) {
			local3.aByteArray12 = new byte[this.anInt857];
			for (@Pc(13) int local13 = 0; local13 < this.anInt857; local13++) {
				local3.aByteArray12[local13] = this.aByteArray12[local13];
			}
		}
		local3.anInt856 = this.anInt856;
		local3.anInt860 = this.anInt860;
		local3.anInt857 = this.anInt857;
		local3.anInt858 = this.anInt858;
		local3.anIntArray71 = this.anIntArray71;
		local3.anIntArray79 = this.anIntArray79;
		local3.anIntArray74 = this.anIntArray74;
		local3.anIntArray81 = this.anIntArray81;
		local3.anIntArray77 = this.anIntArray77;
		local3.anIntArray75 = this.anIntArray75;
		local3.aByteArray9 = this.aByteArray9;
		local3.aByteArray5 = this.aByteArray5;
		local3.aByteArray4 = this.aByteArray4;
		local3.aShortArray15 = this.aShortArray15;
		local3.aShortArray22 = this.aShortArray22;
		local3.aByte2 = this.aByte2;
		local3.aByteArray8 = this.aByteArray8;
		local3.aShortArray19 = this.aShortArray19;
		local3.aShortArray14 = this.aShortArray14;
		local3.aShortArray18 = this.aShortArray18;
		local3.aShortArray20 = this.aShortArray20;
		local3.aShortArray16 = this.aShortArray16;
		local3.aShortArray23 = this.aShortArray23;
		local3.aByteArray7 = this.aByteArray7;
		local3.aByteArray11 = this.aByteArray11;
		local3.aByteArray6 = this.aByteArray6;
		local3.aByteArray13 = this.aByteArray13;
		local3.aByteArray10 = this.aByteArray10;
		local3.anIntArray80 = this.anIntArray80;
		local3.anIntArray72 = this.anIntArray72;
		local3.anIntArrayArray9 = this.anIntArrayArray9;
		local3.anIntArrayArray8 = this.anIntArrayArray8;
		local3.aClass86Array2 = this.aClass86Array2;
		local3.aClass64Array1 = this.aClass64Array1;
		local3.aShort7 = this.aShort7;
		local3.aShort4 = this.aShort4;
		local3.aClass190Array1 = this.aClass190Array1;
		local3.aClass67Array1 = this.aClass67Array1;
		return local3;
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "()V")
	public void method709() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt856; local1++) {
			@Pc(10) int local10 = this.anIntArray74[local1];
			this.anIntArray74[local1] = this.anIntArray71[local1];
			this.anIntArray71[local1] = -local10;
		}
		this.method726();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()I")
	@Override
	public int method4973() {
		if (!this.aBoolean73) {
			this.method710();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "()V")
	private void method710() {
		if (this.aBoolean73) {
			return;
		}
		this.aBoolean73 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt860; local20++) {
			@Pc(29) int local29 = this.anIntArray71[local20];
			@Pc(34) int local34 = this.anIntArray79[local20];
			@Pc(39) int local39 = this.anIntArray74[local20];
			if (local29 < local8) {
				local8 = local29;
			}
			if (local29 > local14) {
				local14 = local29;
			}
			if (local34 < local10) {
				local10 = local34;
			}
			if (local34 > local16) {
				local16 = local34;
			}
			if (local39 < local12) {
				local12 = local39;
			}
			if (local39 > local18) {
				local18 = local39;
			}
		}
		this.aShort9 = (short) local8;
		this.aShort8 = (short) local14;
		this.aShort5 = (short) local10;
		this.aShort2 = (short) local16;
		this.aShort3 = (short) local12;
		this.aShort6 = (short) local18;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(III)V")
	public void method711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local5 = Static46.anIntArray76[arg2];
			local9 = Static46.anIntArray78[arg2];
			for (local11 = 0; local11 < this.anInt856; local11++) {
				local31 = this.anIntArray79[local11] * local5 + this.anIntArray71[local11] * local9 >> 16;
				this.anIntArray79[local11] = this.anIntArray79[local11] * local9 - this.anIntArray71[local11] * local5 >> 16;
				this.anIntArray71[local11] = local31;
			}
		}
		if (arg0 != 0) {
			local5 = Static46.anIntArray76[arg0];
			local9 = Static46.anIntArray78[arg0];
			for (local11 = 0; local11 < this.anInt856; local11++) {
				local31 = this.anIntArray79[local11] * local9 - this.anIntArray74[local11] * local5 >> 16;
				this.anIntArray74[local11] = this.anIntArray79[local11] * local5 + this.anIntArray74[local11] * local9 >> 16;
				this.anIntArray79[local11] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static46.anIntArray76[arg1];
		local9 = Static46.anIntArray78[arg1];
		for (local11 = 0; local11 < this.anInt856; local11++) {
			local31 = this.anIntArray74[local11] * local5 + this.anIntArray71[local11] * local9 >> 16;
			this.anIntArray74[local11] = this.anIntArray74[local11] * local9 - this.anIntArray71[local11] * local5 >> 16;
			this.anIntArray71[local11] = local31;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([[IIIIII)V")
	private void method712(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static46.method714(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static46.method714(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static46.method714(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static46.method714(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		if (arg5 != 0) {
			@Pc(120) int local120 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
			if (local120 != 0) {
				this.method720(local120);
			}
		}
		if (arg4 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
			if (local140 != 0) {
				this.method713(local140);
			}
		}
		@Pc(149) int local149 = local24 + local77;
		if (local42 + local60 < local149) {
			local149 = local42 + local60;
		}
		local149 = (local149 >> 1) - arg2;
		if (local149 != 0) {
			this.method703(0, local149, 0);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	private void method713(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static46.anIntArray76[arg0];
		@Pc(7) int local7 = Static46.anIntArray78[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt856; local9++) {
			@Pc(29) int local29 = this.anIntArray79[local9] * local3 + this.anIntArray71[local9] * local7 >> 16;
			this.anIntArray79[local9] = this.anIntArray79[local9] * local7 - this.anIntArray71[local9] * local3 >> 16;
			this.anIntArray71[local9] = local29;
		}
		this.method726();
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "([B)V")
	private void method715(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class3_Sub26 local8 = new Class3_Sub26(arg0);
		@Pc(13) Class3_Sub26 local13 = new Class3_Sub26(arg0);
		@Pc(18) Class3_Sub26 local18 = new Class3_Sub26(arg0);
		@Pc(23) Class3_Sub26 local23 = new Class3_Sub26(arg0);
		@Pc(28) Class3_Sub26 local28 = new Class3_Sub26(arg0);
		local8.anInt4615 = arg0.length - 18;
		@Pc(38) int local38 = local8.method3948();
		@Pc(42) int local42 = local8.method3948();
		@Pc(46) int local46 = local8.method3915();
		@Pc(50) int local50 = local8.method3915();
		@Pc(54) int local54 = local8.method3915();
		@Pc(58) int local58 = local8.method3915();
		@Pc(62) int local62 = local8.method3915();
		@Pc(66) int local66 = local8.method3915();
		@Pc(70) int local70 = local8.method3948();
		@Pc(74) int local74 = local8.method3948();
		@Pc(78) int local78 = local8.method3948();
		@Pc(82) int local82 = local8.method3948();
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
		this.anInt856 = local38;
		this.anInt857 = local42;
		this.anInt858 = local46;
		this.anIntArray71 = new int[local38];
		this.anIntArray79 = new int[local38];
		this.anIntArray74 = new int[local38];
		this.anIntArray81 = new int[local42];
		this.anIntArray77 = new int[local42];
		this.anIntArray75 = new int[local42];
		if (local46 > 0) {
			this.aByteArray8 = new byte[local46];
			this.aShortArray19 = new short[local46];
			this.aShortArray14 = new short[local46];
			this.aShortArray18 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray80 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray12 = new byte[local42];
			this.aByteArray4 = new byte[local42];
			this.aShortArray22 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray9 = new byte[local42];
		} else {
			this.aByte2 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray5 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray72 = new int[local42];
		}
		this.aShortArray15 = new short[local42];
		local8.anInt4615 = 0;
		local13.anInt4615 = local165;
		local18.anInt4615 = local171;
		local23.anInt4615 = local90;
		local28.anInt4615 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(316) int local316;
		@Pc(326) int local326;
		@Pc(336) int local336;
		for (local307 = 0; local307 < local38; local307++) {
			local314 = local8.method3915();
			local316 = 0;
			if ((local314 & 0x1) != 0) {
				local316 = local13.method3937();
			}
			local326 = 0;
			if ((local314 & 0x2) != 0) {
				local326 = local18.method3937();
			}
			local336 = 0;
			if ((local314 & 0x4) != 0) {
				local336 = local23.method3937();
			}
			this.anIntArray71[local307] = local301 + local316;
			this.anIntArray79[local307] = local303 + local326;
			this.anIntArray74[local307] = local305 + local336;
			local301 = this.anIntArray71[local307];
			local303 = this.anIntArray79[local307];
			local305 = this.anIntArray74[local307];
			if (local66 == 1) {
				this.anIntArray80[local307] = local28.method3915();
			}
		}
		local8.anInt4615 = local149;
		local13.anInt4615 = local116;
		local18.anInt4615 = local98;
		local23.anInt4615 = local134;
		local28.anInt4615 = local107;
		for (local307 = 0; local307 < local42; local307++) {
			this.aShortArray15[local307] = (short) local8.method3948();
			if (local50 == 1) {
				local314 = local13.method3915();
				if ((local314 & 0x1) == 1) {
					this.aByteArray12[local307] = 1;
					local1 = true;
				} else {
					this.aByteArray12[local307] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray4[local307] = (byte) (local314 >> 2);
					this.aShortArray22[local307] = this.aShortArray15[local307];
					this.aShortArray15[local307] = 127;
					if (this.aShortArray22[local307] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray4[local307] = -1;
					this.aShortArray22[local307] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray9[local307] = local18.method3920();
			}
			if (local58 == 1) {
				this.aByteArray5[local307] = local23.method3920();
			}
			if (local62 == 1) {
				this.anIntArray72[local307] = local28.method3915();
			}
		}
		this.anInt860 = -1;
		local8.anInt4615 = local143;
		local13.anInt4615 = local92;
		local307 = 0;
		local314 = 0;
		local316 = 0;
		local326 = 0;
		@Pc(548) int local548;
		@Pc(686) int local686;
		for (local336 = 0; local336 < local42; local336++) {
			local548 = local13.method3915();
			if (local548 == 1) {
				local307 = local8.method3937() + local326;
				local314 = local8.method3937() + local307;
				local316 = local8.method3937() + local314;
				local326 = local316;
				this.anIntArray81[local336] = local307;
				this.anIntArray77[local336] = local314;
				this.anIntArray75[local336] = local316;
				if (local307 > this.anInt860) {
					this.anInt860 = local307;
				}
				if (local314 > this.anInt860) {
					this.anInt860 = local314;
				}
				if (local316 > this.anInt860) {
					this.anInt860 = local316;
				}
			}
			if (local548 == 2) {
				local314 = local316;
				local316 = local8.method3937() + local326;
				local326 = local316;
				this.anIntArray81[local336] = local307;
				this.anIntArray77[local336] = local314;
				this.anIntArray75[local336] = local316;
				if (local316 > this.anInt860) {
					this.anInt860 = local316;
				}
			}
			if (local548 == 3) {
				local307 = local316;
				local316 = local8.method3937() + local326;
				local326 = local316;
				this.anIntArray81[local336] = local307;
				this.anIntArray77[local336] = local314;
				this.anIntArray75[local336] = local316;
				if (local316 > this.anInt860) {
					this.anInt860 = local316;
				}
			}
			if (local548 == 4) {
				local686 = local307;
				local307 = local314;
				local314 = local686;
				local316 = local8.method3937() + local326;
				local326 = local316;
				this.anIntArray81[local336] = local307;
				this.anIntArray77[local336] = local686;
				this.anIntArray75[local336] = local316;
				if (local316 > this.anInt860) {
					this.anInt860 = local316;
				}
			}
		}
		this.anInt860++;
		local8.anInt4615 = local157;
		for (local336 = 0; local336 < local46; local336++) {
			this.aByteArray8[local336] = 0;
			this.aShortArray19[local336] = (short) local8.method3948();
			this.aShortArray14[local336] = (short) local8.method3948();
			this.aShortArray18[local336] = (short) local8.method3948();
		}
		if (this.aByteArray4 != null) {
			@Pc(772) boolean local772 = false;
			for (local548 = 0; local548 < local42; local548++) {
				local686 = this.aByteArray4[local548] & 0xFF;
				if (local686 != 255) {
					if ((this.aShortArray19[local686] & 0xFFFF) == this.anIntArray81[local548] && (this.aShortArray14[local686] & 0xFFFF) == this.anIntArray77[local548] && (this.aShortArray18[local686] & 0xFFFF) == this.anIntArray75[local548]) {
						this.aByteArray4[local548] = -1;
					} else {
						local772 = true;
					}
				}
			}
			if (!local772) {
				this.aByteArray4 = null;
			}
		}
		if (!local3) {
			this.aShortArray22 = null;
		}
		if (!local1) {
			this.aByteArray12 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(III)I")
	public int method716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt856; local1++) {
			if (this.anIntArray71[local1] == arg0 && this.anIntArray79[local1] == 0 && this.anIntArray74[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray71[this.anInt856] = arg0;
		this.anIntArray79[this.anInt856] = 0;
		this.anIntArray74[this.anInt856] = arg1;
		this.anInt860 = ++this.anInt856;
		return this.anInt856 - 1;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(IIIII)Lclient!hm;")
	public Class10_Sub4 method717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static283.aBoolean393) {
			@Pc(9) Class10_Sub4_Sub1 local9 = new Class10_Sub4_Sub1(this, arg0, arg1, true);
			local9.method1552();
			return local9;
		} else {
			return new Class10_Sub4_Sub2(this, arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!d", name = "h", descriptor = "()V")
	public void method718() {
		this.anIntArray80 = null;
		this.anIntArray72 = null;
		this.anIntArrayArray9 = null;
		this.anIntArrayArray8 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(SS)V")
	public void method719(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray22 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt857; local5++) {
			if (this.aShortArray22[local5] == arg0) {
				this.aShortArray22[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	private void method720(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static46.anIntArray76[arg0];
		@Pc(7) int local7 = Static46.anIntArray78[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt856; local9++) {
			@Pc(29) int local29 = this.anIntArray79[local9] * local7 - this.anIntArray74[local9] * local3 >> 16;
			this.anIntArray74[local9] = this.anIntArray79[local9] * local3 + this.anIntArray74[local9] * local7 >> 16;
			this.anIntArray79[local9] = local29;
		}
		this.method726();
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	public void method721() {
		@Pc(3) int local3 = Static46.anIntArray76[256];
		@Pc(7) int local7 = Static46.anIntArray78[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt856; local9++) {
			@Pc(29) int local29 = this.anIntArray74[local9] * local3 + this.anIntArray71[local9] * local7 >> 16;
			this.anIntArray74[local9] = this.anIntArray74[local9] * local7 - this.anIntArray71[local9] * local3 >> 16;
			this.anIntArray71[local9] = local29;
		}
		this.method726();
	}

	@OriginalMember(owner = "client!d", name = "i", descriptor = "()V")
	public void method723() {
		if (this.aClass86Array2 != null) {
			return;
		}
		this.aClass86Array2 = new Class86[this.anInt860];
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt860; local10++) {
			this.aClass86Array2[local10] = new Class86();
		}
		for (local10 = 0; local10 < this.anInt857; local10++) {
			@Pc(34) int local34 = this.anIntArray81[local10];
			@Pc(39) int local39 = this.anIntArray77[local10];
			@Pc(44) int local44 = this.anIntArray75[local10];
			@Pc(54) int local54 = this.anIntArray71[local39] - this.anIntArray71[local34];
			@Pc(64) int local64 = this.anIntArray79[local39] - this.anIntArray79[local34];
			@Pc(74) int local74 = this.anIntArray74[local39] - this.anIntArray74[local34];
			@Pc(84) int local84 = this.anIntArray71[local44] - this.anIntArray71[local34];
			@Pc(94) int local94 = this.anIntArray79[local44] - this.anIntArray79[local34];
			@Pc(104) int local104 = this.anIntArray74[local44] - this.anIntArray74[local34];
			@Pc(112) int local112 = local64 * local104 - local94 * local74;
			@Pc(120) int local120 = local74 * local84 - local104 * local54;
			@Pc(128) int local128;
			for (local128 = local54 * local94 - local84 * local64; local112 > 8192 || local120 > 8192 || local128 > 8192 || local112 < -8192 || local120 < -8192 || local128 < -8192; local128 >>= 0x1) {
				local112 >>= 0x1;
				local120 >>= 0x1;
			}
			@Pc(174) int local174 = (int) Math.sqrt((double) (local112 * local112 + local120 * local120 + local128 * local128));
			if (local174 <= 0) {
				local174 = 1;
			}
			local112 = local112 * 256 / local174;
			local120 = local120 * 256 / local174;
			local128 = local128 * 256 / local174;
			@Pc(201) byte local201;
			if (this.aByteArray12 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray12[local10];
			}
			if (local201 == 0) {
				@Pc(214) Class86 local214 = this.aClass86Array2[local34];
				local214.anInt2489 += local112;
				local214.anInt2490 += local120;
				local214.anInt2485 += local128;
				local214.anInt2486++;
				@Pc(243) Class86 local243 = this.aClass86Array2[local39];
				local243.anInt2489 += local112;
				local243.anInt2490 += local120;
				local243.anInt2485 += local128;
				local243.anInt2486++;
				@Pc(272) Class86 local272 = this.aClass86Array2[local44];
				local272.anInt2489 += local112;
				local272.anInt2490 += local120;
				local272.anInt2485 += local128;
				local272.anInt2486++;
			} else if (local201 == 1) {
				if (this.aClass64Array1 == null) {
					this.aClass64Array1 = new Class64[this.anInt857];
				}
				@Pc(317) Class64 local317 = this.aClass64Array1[local10] = new Class64();
				local317.anInt1709 = local112;
				local317.anInt1716 = local120;
				local317.anInt1710 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIIJILclient!em;)V")
	@Override
	public void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub1 arg10) {
	}

	@OriginalMember(owner = "client!d", name = "j", descriptor = "()V")
	public void method724() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt856; local1++) {
			this.anIntArray71[local1] = -this.anIntArray71[local1];
			this.anIntArray74[local1] = -this.anIntArray74[local1];
		}
		this.method726();
	}

	@OriginalMember(owner = "client!d", name = "k", descriptor = "()V")
	public void method725() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt856; local1++) {
			this.anIntArray74[local1] = -this.anIntArray74[local1];
		}
		for (local1 = 0; local1 < this.anInt857; local1++) {
			@Pc(27) int local27 = this.anIntArray81[local1];
			this.anIntArray81[local1] = this.anIntArray75[local1];
			this.anIntArray75[local1] = local27;
		}
		this.method726();
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "()V")
	private void method726() {
		this.aClass86Array2 = null;
		this.aClass86Array1 = null;
		this.aClass64Array1 = null;
		this.aBoolean73 = false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!d;")
	public Class10_Sub3 method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method710();
		@Pc(6) int local6 = arg4 + this.aShort9;
		@Pc(11) int local11 = arg4 + this.aShort8;
		@Pc(16) int local16 = arg6 + this.aShort3;
		@Pc(21) int local21 = arg6 + this.aShort6;
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
		@Pc(147) Class10_Sub3 local147 = new Class10_Sub3();
		local147.anInt856 = this.anInt856;
		local147.anInt860 = this.anInt860;
		local147.anInt857 = this.anInt857;
		local147.anInt858 = this.anInt858;
		local147.anIntArray81 = this.anIntArray81;
		local147.anIntArray77 = this.anIntArray77;
		local147.anIntArray75 = this.anIntArray75;
		local147.aByteArray12 = this.aByteArray12;
		local147.aByteArray9 = this.aByteArray9;
		local147.aByteArray5 = this.aByteArray5;
		local147.aByteArray4 = this.aByteArray4;
		local147.aShortArray15 = this.aShortArray15;
		local147.aShortArray22 = this.aShortArray22;
		local147.aByte2 = this.aByte2;
		local147.aByteArray8 = this.aByteArray8;
		local147.aShortArray19 = this.aShortArray19;
		local147.aShortArray14 = this.aShortArray14;
		local147.aShortArray18 = this.aShortArray18;
		local147.aShortArray20 = this.aShortArray20;
		local147.aShortArray16 = this.aShortArray16;
		local147.aShortArray23 = this.aShortArray23;
		local147.aByteArray7 = this.aByteArray7;
		local147.aByteArray11 = this.aByteArray11;
		local147.aByteArray6 = this.aByteArray6;
		local147.aByteArray13 = this.aByteArray13;
		local147.aByteArray10 = this.aByteArray10;
		local147.anIntArray80 = this.anIntArray80;
		local147.anIntArray72 = this.anIntArray72;
		local147.anIntArrayArray9 = this.anIntArrayArray9;
		local147.anIntArrayArray8 = this.anIntArrayArray8;
		local147.aShort7 = this.aShort7;
		local147.aShort4 = this.aShort4;
		local147.aClass86Array2 = this.aClass86Array2;
		local147.aClass64Array1 = this.aClass64Array1;
		local147.aClass86Array1 = this.aClass86Array1;
		local147.aClass190Array1 = this.aClass190Array1;
		local147.aClass67Array1 = this.aClass67Array1;
		if (arg0 == 3) {
			local147.anIntArray71 = Static296.method4813(this.anIntArray71);
			local147.anIntArray79 = Static296.method4813(this.anIntArray79);
			local147.anIntArray74 = Static296.method4813(this.anIntArray74);
		} else {
			local147.anIntArray71 = this.anIntArray71;
			local147.anIntArray79 = new int[local147.anInt856];
			local147.anIntArray74 = this.anIntArray74;
		}
		@Pc(338) int local338;
		@Pc(349) int local349;
		@Pc(356) int local356;
		@Pc(360) int local360;
		@Pc(364) int local364;
		@Pc(368) int local368;
		@Pc(372) int local372;
		@Pc(394) int local394;
		@Pc(420) int local420;
		@Pc(432) int local432;
		if (arg0 == 1) {
			for (local338 = 0; local338 < local147.anInt860; local338++) {
				local349 = this.anIntArray71[local338] + arg4;
				local356 = this.anIntArray74[local338] + arg6;
				local360 = local349 & 0x7F;
				local364 = local356 & 0x7F;
				local368 = local349 >> 7;
				local372 = local356 >> 7;
				local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
				local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
				local432 = local394 * (128 - local364) + local420 * local364 >> 7;
				local147.anIntArray79[local338] = this.anIntArray79[local338] + local432 - arg5;
			}
			for (local338 = local147.anInt860; local338 < local147.anInt856; local338++) {
				local349 = this.anIntArray71[local338] + arg4;
				local356 = this.anIntArray74[local338] + arg6;
				local360 = local349 & 0x7F;
				local364 = local356 & 0x7F;
				local368 = local349 >> 7;
				local372 = local356 >> 7;
				if (local368 >= 0 && local368 < arg2.length - 1 && local372 >= 0 && local372 < arg2[0].length - 1) {
					local394 = arg2[local368][local372] * (128 - local360) + arg2[local368 + 1][local372] * local360 >> 7;
					local420 = arg2[local368][local372 + 1] * (128 - local360) + arg2[local368 + 1][local372 + 1] * local360 >> 7;
					local432 = local394 * (128 - local364) + local420 * local364 >> 7;
					local147.anIntArray79[local338] = this.anIntArray79[local338] + local432 - arg5;
				}
			}
		} else {
			@Pc(689) int local689;
			if (arg0 == 2) {
				for (local338 = 0; local338 < local147.anInt860; local338++) {
					local349 = (this.anIntArray79[local338] << 16) / this.aShort5;
					if (local349 < arg1) {
						local356 = this.anIntArray71[local338] + arg4;
						local360 = this.anIntArray74[local338] + arg6;
						local364 = local356 & 0x7F;
						local368 = local360 & 0x7F;
						local372 = local356 >> 7;
						local394 = local360 >> 7;
						local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
						local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local147.anIntArray79[local338] = this.anIntArray79[local338] + (local689 - arg5) * (arg1 - local349) / arg1;
					} else {
						local147.anIntArray79[local338] = this.anIntArray79[local338];
					}
				}
				for (local338 = local147.anInt860; local338 < local147.anInt856; local338++) {
					local349 = (this.anIntArray79[local338] << 16) / this.aShort5;
					if (local349 < arg1) {
						local356 = this.anIntArray71[local338] + arg4;
						local360 = this.anIntArray74[local338] + arg6;
						local364 = local356 & 0x7F;
						local368 = local360 & 0x7F;
						local372 = local356 >> 7;
						local394 = local360 >> 7;
						if (local372 >= 0 && local372 < arg2.length - 1 && local394 >= 0 && local394 < arg2[0].length - 1) {
							local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
							local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
							local689 = local420 * (128 - local368) + local432 * local368 >> 7;
							local147.anIntArray79[local338] = this.anIntArray79[local338] + (local689 - arg5) * (arg1 - local349) / arg1;
						}
					} else {
						local147.anIntArray79[local338] = this.anIntArray79[local338];
					}
				}
			} else if (arg0 == 3) {
				local338 = (arg1 & 0xFF) * 4;
				local349 = (arg1 >> 8 & 0xFF) * 4;
				local147.method712(arg2, arg4, arg5, arg6, local338, local349);
			} else if (arg0 == 4) {
				local338 = this.aShort2 - this.aShort5;
				for (local349 = 0; local349 < this.anInt860; local349++) {
					local356 = this.anIntArray71[local349] + arg4;
					local360 = this.anIntArray74[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
					local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
					local689 = local420 * (128 - local368) + local432 * local368 >> 7;
					local147.anIntArray79[local349] = this.anIntArray79[local349] + local689 + local338 - arg5;
				}
				for (local349 = local147.anInt860; local349 < local147.anInt856; local349++) {
					local356 = this.anIntArray71[local349] + arg4;
					local360 = this.anIntArray74[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					if (local372 >= 0 && local372 < arg3.length - 1 && local394 >= 0 && local394 < arg3[0].length - 1) {
						local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
						local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local147.anIntArray79[local349] = this.anIntArray79[local349] + local689 + local338 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local338 = this.aShort2 - this.aShort5;
				@Pc(1322) int local1322;
				@Pc(1326) int local1326;
				for (local349 = 0; local349 < this.anInt860; local349++) {
					local356 = this.anIntArray71[local349] + arg4;
					local360 = this.anIntArray74[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
					local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
					local689 = local420 * (128 - local368) + local432 * local368 >> 7;
					local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
					local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
					local1322 = local420 * (128 - local368) + local432 * local368 >> 7;
					local1326 = local689 - local1322;
					local147.anIntArray79[local349] = ((this.anIntArray79[local349] << 8) / local338 * local1326 >> 8) - (arg5 - local689);
				}
				for (local349 = local147.anInt860; local349 < local147.anInt856; local349++) {
					local356 = this.anIntArray71[local349] + arg4;
					local360 = this.anIntArray74[local349] + arg6;
					local364 = local356 & 0x7F;
					local368 = local360 & 0x7F;
					local372 = local356 >> 7;
					local394 = local360 >> 7;
					if (local372 >= 0 && local372 < arg2.length - 1 && local372 < arg3.length - 1 && local394 >= 0 && local394 < arg2[0].length - 1 && local394 < arg3[0].length - 1) {
						local420 = arg2[local372][local394] * (128 - local364) + arg2[local372 + 1][local394] * local364 >> 7;
						local432 = arg2[local372][local394 + 1] * (128 - local364) + arg2[local372 + 1][local394 + 1] * local364 >> 7;
						local689 = local420 * (128 - local368) + local432 * local368 >> 7;
						local420 = arg3[local372][local394] * (128 - local364) + arg3[local372 + 1][local394] * local364 >> 7;
						local432 = arg3[local372][local394 + 1] * (128 - local364) + arg3[local372 + 1][local394 + 1] * local364 >> 7;
						local1322 = local420 * (128 - local368) + local432 * local368 >> 7;
						local1326 = local689 - local1322;
						local147.anIntArray79[local349] = ((this.anIntArray79[local349] << 8) / local338 * local1326 >> 8) - (arg5 - local689);
					}
				}
			}
		}
		this.aBoolean73 = false;
		return local147;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(SS)V")
	public void method728(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt857; local1++) {
			if (this.aShortArray15[local1] == arg0) {
				this.aShortArray15[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "m", descriptor = "()V")
	public void method729() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(22) int local22;
		@Pc(9) int local9;
		@Pc(18) int local18;
		if (this.anIntArray80 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt856; local9++) {
				local18 = this.anIntArray80[local9];
				local22 = local5[local18]++;
				if (local18 > local7) {
					local7 = local18;
				}
			}
			this.anIntArrayArray9 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray9[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt856) {
				local18 = this.anIntArray80[local9];
				this.anIntArrayArray9[local18][local5[local18]++] = local9++;
			}
			this.anIntArray80 = null;
		}
		if (this.anIntArray72 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt857; local9++) {
			local18 = this.anIntArray72[local9];
			local22 = local5[local18]++;
			if (local18 > local7) {
				local7 = local18;
			}
		}
		this.anIntArrayArray8 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray8[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt857) {
			local18 = this.anIntArray72[local9];
			this.anIntArrayArray8[local18][local5[local18]++] = local9++;
		}
		this.anIntArray72 = null;
	}
}
