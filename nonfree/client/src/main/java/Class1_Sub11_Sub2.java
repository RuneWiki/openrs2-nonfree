import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class1_Sub11_Sub2 extends Class1_Sub11 {

	@OriginalMember(owner = "client!me", name = "Qb", descriptor = "Z")
	private boolean aBoolean130;

	@OriginalMember(owner = "client!me", name = "Rb", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!me", name = "Sb", descriptor = "I")
	private int anInt2648;

	@OriginalMember(owner = "client!me", name = "Ub", descriptor = "I")
	private int anInt2649;

	@OriginalMember(owner = "client!me", name = "Vb", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "[I")
	private final int[] anIntArray332 = new int[16];

	@OriginalMember(owner = "client!me", name = "B", descriptor = "[I")
	private final int[] anIntArray331 = new int[16];

	@OriginalMember(owner = "client!me", name = "P", descriptor = "[I")
	public final int[] anIntArray335 = new int[16];

	@OriginalMember(owner = "client!me", name = "J", descriptor = "[I")
	private final int[] anIntArray333 = new int[16];

	@OriginalMember(owner = "client!me", name = "G", descriptor = "[[Lclient!sd;")
	private final Class1_Sub19[][] aClass1_Sub19ArrayArray1 = new Class1_Sub19[16][128];

	@OriginalMember(owner = "client!me", name = "R", descriptor = "[I")
	private final int[] anIntArray336 = new int[16];

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "[I")
	private final int[] anIntArray339 = new int[16];

	@OriginalMember(owner = "client!me", name = "sb", descriptor = "[I")
	public final int[] anIntArray341 = new int[16];

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "[I")
	private final int[] anIntArray338 = new int[16];

	@OriginalMember(owner = "client!me", name = "N", descriptor = "I")
	private final int anInt2612 = 1000000;

	@OriginalMember(owner = "client!me", name = "xb", descriptor = "[I")
	private final int[] anIntArray342 = new int[16];

	@OriginalMember(owner = "client!me", name = "T", descriptor = "[I")
	private final int[] anIntArray337 = new int[16];

	@OriginalMember(owner = "client!me", name = "rb", descriptor = "[I")
	public final int[] anIntArray340 = new int[16];

	@OriginalMember(owner = "client!me", name = "Eb", descriptor = "[I")
	private final int[] anIntArray344 = new int[16];

	@OriginalMember(owner = "client!me", name = "yb", descriptor = "[I")
	private final int[] anIntArray343 = new int[16];

	@OriginalMember(owner = "client!me", name = "tb", descriptor = "[[Lclient!sd;")
	private final Class1_Sub19[][] aClass1_Sub19ArrayArray2 = new Class1_Sub19[16][128];

	@OriginalMember(owner = "client!me", name = "K", descriptor = "I")
	private int anInt2610 = 256;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "[I")
	private final int[] anIntArray334 = new int[16];

	@OriginalMember(owner = "client!me", name = "Pb", descriptor = "[I")
	private final int[] anIntArray347 = new int[16];

	@OriginalMember(owner = "client!me", name = "kb", descriptor = "Lclient!da;")
	private final Class15 aClass15_1 = new Class15();

	@OriginalMember(owner = "client!me", name = "Tb", descriptor = "Lclient!le;")
	private final Class1_Sub11_Sub1 aClass1_Sub11_Sub1_1 = new Class1_Sub11_Sub1(this);

	@OriginalMember(owner = "client!me", name = "eb", descriptor = "Lclient!bf;")
	private final Class10 aClass10_8 = new Class10(128);

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class1_Sub11_Sub2() {
		this.method1769();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(BII)V")
	private void method1749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "()Lclient!og;")
	@Override
	public synchronized Class1_Sub11 method2932() {
		return this.aClass1_Sub11_Sub1_1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!sd;)I")
	private int method1750(@OriginalArg(1) Class1_Sub19 arg0) {
		@Pc(14) Class20 local14 = arg0.aClass20_1;
		@Pc(30) int local30 = this.anIntArray344[arg0.anInt3736] * this.anIntArray334[arg0.anInt3736] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt3744 + 16384 >> 15;
		local30 = local47 * this.anInt2610 + 128 >> 8;
		if (local14.anInt975 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) local14.anInt975 * 1.953125E-5D * (double) arg0.anInt3728) + 0.5D);
		}
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(109) int local109;
		@Pc(121) int local121;
		if (local14.aByteArray7 != null) {
			local83 = arg0.anInt3745;
			local91 = local14.aByteArray7[arg0.anInt3746 + 1];
			if (arg0.anInt3746 < local14.aByteArray7.length - 2) {
				local109 = (local14.aByteArray7[arg0.anInt3746] & 0xFF) << 8;
				local121 = (local14.aByteArray7[arg0.anInt3746 + 2] & 0xFF) << 8;
				local91 += (local14.aByteArray7[arg0.anInt3746 + 3] - local91) * (local83 - local109) / (local121 - local109);
			}
			local30 = local30 * local91 + 32 >> 6;
		}
		if (arg0.anInt3748 > 0 && local14.aByteArray6 != null) {
			local83 = arg0.anInt3748;
			local91 = local14.aByteArray6[arg0.anInt3734 + 1];
			if (local14.aByteArray6.length - 2 > arg0.anInt3734) {
				local109 = (local14.aByteArray6[arg0.anInt3734] & 0xFF) << 8;
				local121 = (local14.aByteArray6[arg0.anInt3734 + 2] & 0xFF) << 8;
				local91 += (local14.aByteArray6[arg0.anInt3734 + 3] - local91) * (local83 - local109) / (local121 - local109);
			}
			local30 = local91 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	private void method1751(@OriginalArg(0) int arg0) {
		for (@Pc(20) Class1_Sub19 local20 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1853(); local20 != null; local20 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1855()) {
			if ((arg0 < 0 || local20.anInt3736 == arg0) && local20.anInt3748 < 0) {
				this.aClass1_Sub19ArrayArray2[local20.anInt3736][local20.anInt3732] = null;
				local20.anInt3748 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	private void method1752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray337[arg0] = arg1;
		this.anIntArray341[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * (double) 2097152 + 0.5D);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2935(@OriginalArg(0) int arg0) {
		if (this.aClass15_1.method501()) {
			@Pc(18) int local18 = this.anInt2612 * this.aClass15_1.anInt865 / Static35.anInt974;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong82;
				if (this.aLong83 - local27 >= 0L) {
					this.aLong82 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong83 + (long) local18 - this.aLong82 - 1L) / (long) local18);
				this.aLong82 += (long) local58 * (long) local18;
				arg0 -= local58;
				this.aClass1_Sub11_Sub1_1.method2935(local58);
				this.method1761();
			} while (this.aClass15_1.method501());
		}
		this.aClass1_Sub11_Sub1_1.method2935(arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass15_1.method501()) {
			@Pc(14) int local14 = this.anInt2612 * this.aClass15_1.anInt865 / Static35.anInt974;
			do {
				@Pc(24) long local24 = this.aLong82 + (long) arg2 * (long) local14;
				if (this.aLong83 - local24 >= 0L) {
					this.aLong82 = local24;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong83 + (long) local14 - this.aLong82 - 1L) / (long) local14);
				arg2 -= local56;
				this.aLong82 += (long) local56 * (long) local14;
				this.aClass1_Sub11_Sub1_1.method2933(arg0, arg1, local56);
				arg1 += local56;
				this.method1761();
			} while (this.aClass15_1.method501());
		}
		this.aClass1_Sub11_Sub1_1.method2933(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!md;IZ)V")
	public synchronized void method1753(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(2) boolean arg1) {
		this.method1782();
		this.aClass15_1.method507(arg0.aByteArray20);
		this.aBoolean130 = arg1;
		this.aLong82 = 0L;
		@Pc(31) int local31 = this.aClass15_1.method508();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			this.aClass15_1.method506(local33);
			this.aClass15_1.method505(local33);
			this.aClass15_1.method502(local33);
		}
		this.anInt2649 = this.aClass15_1.method513();
		this.anInt2648 = this.aClass15_1.anIntArray113[this.anInt2649];
		this.aLong83 = this.aClass15_1.method499(this.anInt2648);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
	private void method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub19 local12 = this.aClass1_Sub19ArrayArray2[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub19ArrayArray2[arg1][arg0] = null;
		if ((this.anIntArray340[arg1] & 0x2) == 0) {
			local12.anInt3748 = 0;
			return;
		}
		for (@Pc(37) Class1_Sub19 local37 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1853(); local37 != null; local37 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1855()) {
			if (local37.anInt3736 == local12.anInt3736 && local37.anInt3748 < 0 && local12 != local37) {
				local12.anInt3748 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLclient!sd;)I")
	private int method1755(@OriginalArg(1) Class1_Sub19 arg0) {
		@Pc(10) int local10 = (arg0.anInt3738 * arg0.anInt3740 >> 12) + arg0.anInt3733;
		local10 += this.anIntArray336[arg0.anInt3736] * (this.anIntArray333[arg0.anInt3736] - 8192) >> 12;
		@Pc(36) Class20 local36 = arg0.aClass20_1;
		@Pc(57) int local57;
		if (local36.anInt981 > 0 && (local36.anInt980 > 0 || this.anIntArray332[arg0.anInt3736] > 0)) {
			local57 = local36.anInt980 << 2;
			@Pc(62) int local62 = local36.anInt983 << 1;
			if (arg0.anInt3737 < local62) {
				local57 = local57 * arg0.anInt3737 / local62;
			}
			local57 += this.anIntArray332[arg0.anInt3736] >> 7;
			@Pc(92) double local92 = Math.sin((double) (arg0.anInt3750 & 0x1FF) * 0.01227184630308513D);
			local10 += (int) ((double) local57 * local92);
		}
		local57 = (int) ((double) (arg0.aClass1_Sub9_Sub1_1.anInt1574 * 256) * Math.pow(2.0D, (double) local10 * 3.255208333333333E-4D) / (double) Static35.anInt974 + 0.5D);
		return local57 >= 1 ? local57 : 1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!ga;Lclient!md;ILclient!gd;)Z")
	public synchronized boolean method1756(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class1_Sub12 arg1, @OriginalArg(4) Class31 arg2) {
		arg1.method1734();
		@Pc(9) boolean local9 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(29) Class1_Sub20 local29 = (Class1_Sub20) arg1.aClass10_7.method257(); local29 != null; local29 = (Class1_Sub20) arg1.aClass10_7.method260()) {
			@Pc(35) int local35 = (int) local29.aLong140;
			@Pc(43) Class1_Sub5 local43 = (Class1_Sub5) this.aClass10_8.method256((long) local35);
			if (local43 == null) {
				local43 = Static100.method1711(arg0, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass10_8.method263(local43, (long) local35);
			}
			if (!local43.method279(local29.aByteArray43, arg2, local21)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method1733();
		}
		return local9;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()I")
	@Override
	public synchronized int method2930() {
		return 0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIB)V")
	private void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1754(arg2, arg0, 64);
		if ((this.anIntArray340[arg0] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub19 local25 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1849(); local25 != null; local25 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1847()) {
				if (local25.anInt3736 == arg0 && local25.anInt3748 < 0) {
					this.aClass1_Sub19ArrayArray2[arg0][local25.anInt3732] = null;
					this.aClass1_Sub19ArrayArray2[arg0][arg2] = local25;
					@Pc(65) int local65 = local25.anInt3733 + (local25.anInt3740 * local25.anInt3738 >> 12);
					local25.anInt3738 = 4096;
					local25.anInt3733 += arg2 - local25.anInt3732 << 8;
					local25.anInt3740 = local65 - local25.anInt3733;
					local25.anInt3732 = arg2;
					return;
				}
			}
		}
		@Pc(111) Class1_Sub5 local111 = (Class1_Sub5) this.aClass10_8.method256((long) this.anIntArray331[arg0]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class1_Sub9_Sub1 local119 = local111.aClass1_Sub9_Sub1Array1[arg2];
		if (local119 == null) {
			return;
		}
		@Pc(126) Class1_Sub19 local126 = new Class1_Sub19();
		local126.aClass1_Sub5_1 = local111;
		local126.anInt3736 = arg0;
		local126.aClass1_Sub9_Sub1_1 = local119;
		local126.aClass20_1 = local111.aClass20Array1[arg2];
		local126.anInt3742 = local111.aByteArray2[arg2];
		local126.anInt3732 = arg2;
		local126.anInt3744 = local111.aByteArray3[arg2] * local111.anInt495 * arg1 * arg1 + 1024 >> 11;
		local126.anInt3747 = local111.aByteArray1[arg2] & 0xFF;
		local126.anInt3733 = (arg2 << 8) - (local111.aShortArray4[arg2] & 0x7FFF);
		local126.anInt3746 = 0;
		local126.anInt3748 = -1;
		local126.anInt3734 = 0;
		local126.anInt3745 = 0;
		local126.anInt3728 = 0;
		if (this.anIntArray335[arg0] == 0) {
			local126.aClass1_Sub11_Sub4_3 = Static189.method2948(local119, this.method1755(local126), this.method1750(local126), this.method1766(local126));
		} else {
			local126.aClass1_Sub11_Sub4_3 = Static189.method2948(local119, this.method1755(local126), 0, this.method1766(local126));
			this.method1771(local126, local111.aShortArray4[arg2] < 0);
		}
		if (local111.aShortArray4[arg2] < 0) {
			local126.aClass1_Sub11_Sub4_3.method2961(-1);
		}
		if (local126.anInt3742 >= 0) {
			@Pc(288) Class1_Sub19 local288 = this.aClass1_Sub19ArrayArray1[arg0][local126.anInt3742];
			if (local288 != null && local288.anInt3748 < 0) {
				this.aClass1_Sub19ArrayArray2[arg0][local288.anInt3732] = null;
				local288.anInt3748 = 0;
			}
			this.aClass1_Sub19ArrayArray1[arg0][local126.anInt3742] = local126;
		}
		this.aClass1_Sub11_Sub1_1.aClass56_8.method1856(local126);
		this.aClass1_Sub19ArrayArray2[arg0][arg2] = local126;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(III)V")
	private void method1759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray333[arg1] = arg0;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
	private void method1760(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(28) int local28;
		@Pc(22) int local22;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			local28 = arg0 >> 8 & 0x7F;
			this.method1754(local28, local16, local22);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 >> 16 & 0x7F;
			if (local22 <= 0) {
				this.method1754(local28, local16, 64);
			} else {
				this.method1758(local16, local22, local28);
			}
		} else if (local9 == 160) {
			local28 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			this.method1778(local22, local16, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 >> 16 & 0x7F;
			if (local28 == 0) {
				this.anIntArray339[local16] = (local22 << 14) + (this.anIntArray339[local16] & 0xFFE03FFF);
			}
			if (local28 == 32) {
				this.anIntArray339[local16] = (this.anIntArray339[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 1) {
				this.anIntArray332[local16] = (this.anIntArray332[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 33) {
				this.anIntArray332[local16] = (this.anIntArray332[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 5) {
				this.anIntArray338[local16] = (this.anIntArray338[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 37) {
				this.anIntArray338[local16] = (this.anIntArray338[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 7) {
				this.anIntArray344[local16] = (local22 << 7) + (this.anIntArray344[local16] & 0xFFFFC07F);
			}
			if (local28 == 39) {
				this.anIntArray344[local16] = local22 + (this.anIntArray344[local16] & 0xFFFFFF80);
			}
			if (local28 == 10) {
				this.anIntArray343[local16] = (this.anIntArray343[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 42) {
				this.anIntArray343[local16] = (this.anIntArray343[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 11) {
				this.anIntArray334[local16] = (local22 << 7) + (this.anIntArray334[local16] & 0xFFFFC07F);
			}
			if (local28 == 43) {
				this.anIntArray334[local16] = (this.anIntArray334[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 64) {
				if (local22 >= 64) {
					this.anIntArray340[local16] |= 0x1;
				} else {
					this.anIntArray340[local16] &= 0xFFFFFFFE;
				}
			}
			if (local28 == 65) {
				if (local22 >= 64) {
					this.anIntArray340[local16] |= 0x2;
				} else {
					this.method1765(local16);
					this.anIntArray340[local16] &= 0xFFFFFFFD;
				}
			}
			if (local28 == 99) {
				this.anIntArray342[local16] = (this.anIntArray342[local16] & 0x7F) + (local22 << 7);
			}
			if (local28 == 98) {
				this.anIntArray342[local16] = local22 + (this.anIntArray342[local16] & 0x3F80);
			}
			if (local28 == 101) {
				this.anIntArray342[local16] = (local22 << 7) + (this.anIntArray342[local16] & 0x7F) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray342[local16] = local22 + (this.anIntArray342[local16] & 0x3F80) + 16384;
			}
			if (local28 == 120) {
				this.method1763(local16);
			}
			if (local28 == 121) {
				this.method1772(local16);
			}
			if (local28 == 123) {
				this.method1751(local16);
			}
			@Pc(510) int local510;
			if (local28 == 6) {
				local510 = this.anIntArray342[local16];
				if (local510 == 16384) {
					this.anIntArray336[local16] = (local22 << 7) + (this.anIntArray336[local16] & 0xFFFFC07F);
				}
			}
			if (local28 == 38) {
				local510 = this.anIntArray342[local16];
				if (local510 == 16384) {
					this.anIntArray336[local16] = (this.anIntArray336[local16] & 0xFFFFFF80) + local22;
				}
			}
			if (local28 == 16) {
				this.anIntArray335[local16] = (this.anIntArray335[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 48) {
				this.anIntArray335[local16] = local22 + (this.anIntArray335[local16] & 0xFFFFFF80);
			}
			if (local28 == 81) {
				if (local22 < 64) {
					this.method1780(local16);
					this.anIntArray340[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray340[local16] |= 0x4;
				}
			}
			if (local28 == 17) {
				this.method1752(local16, (local22 << 7) + (this.anIntArray337[local16] & 0xFFFFC07F));
			}
			if (local28 == 49) {
				this.method1752(local16, (this.anIntArray337[local16] & 0xFFFFFF80) + local22);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method1783(local28 + this.anIntArray339[local16], local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method1749(local28, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local28 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F16) >> 8);
			this.method1759(local28, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1769();
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	private void method1761() {
		@Pc(8) int local8 = this.anInt2649;
		@Pc(11) int local11 = this.anInt2648;
		@Pc(22) long local22 = this.aLong83;
		while (this.anInt2648 == local11) {
			while (local11 == this.aClass15_1.anIntArray113[local8]) {
				this.aClass15_1.method506(local8);
				@Pc(33) int local33 = this.aClass15_1.method504(local8);
				if (local33 == 1) {
					this.aClass15_1.method500();
					this.aClass15_1.method502(local8);
					if (this.aClass15_1.method509()) {
						if (!this.aBoolean130 || local11 == 0) {
							this.method1769();
							this.aClass15_1.method503();
							return;
						}
						this.aClass15_1.method512(local22);
					}
					break;
				}
				if ((local33 & 0x80) != 0) {
					this.method1760(local33);
				}
				this.aClass15_1.method505(local8);
				this.aClass15_1.method502(local8);
			}
			local8 = this.aClass15_1.method513();
			local11 = this.aClass15_1.anIntArray113[local8];
			local22 = this.aClass15_1.method499(local11);
		}
		this.anInt2648 = local11;
		this.anInt2649 = local8;
		this.aLong83 = local22;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)V")
	private void method1763(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub19 local12 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1853(); local12 != null; local12 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1855()) {
			if (arg0 < 0 || local12.anInt3736 == arg0) {
				if (local12.aClass1_Sub11_Sub4_3 != null) {
					local12.aClass1_Sub11_Sub4_3.method2937(Static35.anInt974 / 100);
					if (local12.aClass1_Sub11_Sub4_3.method2966()) {
						this.aClass1_Sub11_Sub1_1.aClass1_Sub11_Sub3_1.method2820(local12.aClass1_Sub11_Sub4_3);
					}
					local12.method2569();
				}
				if (local12.anInt3748 < 0) {
					this.aClass1_Sub19ArrayArray2[local12.anInt3736][local12.anInt3732] = null;
				}
				local12.method3141();
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Z")
	public synchronized boolean method1764() {
		return this.aClass15_1.method501();
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(II)V")
	private void method1765(@OriginalArg(1) int arg0) {
		if ((this.anIntArray340[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(26) Class1_Sub19 local26 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1853(); local26 != null; local26 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1855()) {
			if (arg0 == local26.anInt3736 && this.aClass1_Sub19ArrayArray2[arg0][local26.anInt3732] == null && local26.anInt3748 < 0) {
				local26.anInt3748 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()Lclient!og;")
	@Override
	public synchronized Class1_Sub11 method2936() {
		return null;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(BLclient!sd;)I")
	private int method1766(@OriginalArg(1) Class1_Sub19 arg0) {
		@Pc(5) int local5 = this.anIntArray343[arg0.anInt3736];
		return local5 < 8192 ? local5 * arg0.anInt3747 + 32 >> 6 : 16384 - ((16384 - local5) * (-arg0.anInt3747 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
	public synchronized void method1768() {
		for (@Pc(7) Class1_Sub5 local7 = (Class1_Sub5) this.aClass10_8.method257(); local7 != null; local7 = (Class1_Sub5) this.aClass10_8.method260()) {
			local7.method280();
		}
	}

	@OriginalMember(owner = "client!me", name = "h", descriptor = "(I)V")
	private void method1769() {
		this.method1763(-1);
		this.method1772(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray331[local15] = this.anIntArray347[local15];
		}
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray339[local31] = this.anIntArray347[local31] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!sd;BZ)V")
	public void method1771(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass1_Sub9_Sub1_1.aByteArray13.length;
		@Pc(39) int local39;
		if (arg1 && arg0.aClass1_Sub9_Sub1_1.aBoolean70) {
			@Pc(26) int local26 = local12 + local12 - arg0.aClass1_Sub9_Sub1_1.anInt1576;
			local39 = (int) ((long) local26 * (long) this.anIntArray335[arg0.anInt3736] >> 6);
			local12 <<= 0x8;
			if (local39 >= local12) {
				local39 = local12 + local12 - local39 - 1;
				arg0.aClass1_Sub11_Sub4_3.method2947();
			}
		} else {
			local39 = (int) ((long) this.anIntArray335[arg0.anInt3736] * (long) local12 >> 6);
		}
		arg0.aClass1_Sub11_Sub4_3.method2974(local39);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(II)V")
	private void method1772(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1772(local9);
			}
			return;
		}
		this.anIntArray344[arg0] = 12800;
		this.anIntArray343[arg0] = 8192;
		this.anIntArray334[arg0] = 16383;
		this.anIntArray333[arg0] = 8192;
		this.anIntArray332[arg0] = 0;
		this.anIntArray338[arg0] = 8192;
		this.method1765(arg0);
		this.method1780(arg0);
		this.anIntArray340[arg0] = 0;
		this.anIntArray342[arg0] = 32767;
		this.anIntArray336[arg0] = 256;
		this.anIntArray335[arg0] = 0;
		this.method1752(arg0, 8192);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!sd;I)Z")
	public boolean method1774(@OriginalArg(0) Class1_Sub19 arg0) {
		if (arg0.aClass1_Sub11_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt3748 >= 0) {
			arg0.method3141();
			if (arg0.anInt3742 > 0 && arg0 == this.aClass1_Sub19ArrayArray1[arg0.anInt3736][arg0.anInt3742]) {
				this.aClass1_Sub19ArrayArray1[arg0.anInt3736][arg0.anInt3742] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(II)V")
	public synchronized void method1775(@OriginalArg(0) int arg0) {
		this.anInt2610 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(Z)V")
	public synchronized void method1776() {
		for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) this.aClass10_8.method257(); local15 != null; local15 = (Class1_Sub5) this.aClass10_8.method260()) {
			local15.method3141();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III[ILclient!sd;)Z")
	public boolean method1777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub19 arg3) {
		arg3.anInt3751 = Static35.anInt974 / 100;
		if (arg3.anInt3748 >= 0 && (arg3.aClass1_Sub11_Sub4_3 == null || arg3.aClass1_Sub11_Sub4_3.method2945())) {
			arg3.method2569();
			arg3.method3141();
			if (arg3.anInt3742 > 0 && arg3 == this.aClass1_Sub19ArrayArray1[arg3.anInt3736][arg3.anInt3742]) {
				this.aClass1_Sub19ArrayArray1[arg3.anInt3736][arg3.anInt3742] = null;
			}
			return true;
		}
		@Pc(61) int local61 = arg3.anInt3738;
		@Pc(63) boolean local63 = false;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray338[arg3.anInt3736] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg3.anInt3738 = local61;
		}
		arg3.aClass1_Sub11_Sub4_3.method2941(this.method1755(arg3));
		arg3.anInt3737++;
		@Pc(124) double local124 = (double) ((arg3.anInt3740 * arg3.anInt3738 >> 12) + (arg3.anInt3732 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(127) Class20 local127 = arg3.aClass20_1;
		arg3.anInt3750 += local127.anInt981;
		if (local127.anInt975 > 0) {
			if (local127.anInt978 <= 0) {
				arg3.anInt3728 += 128;
			} else {
				arg3.anInt3728 += (int) (Math.pow(2.0D, (double) local127.anInt978 * local124) * 128.0D + 0.5D);
			}
			if (arg3.anInt3728 * local127.anInt975 >= 819200) {
				local63 = true;
			}
		}
		if (local127.aByteArray7 != null) {
			if (local127.anInt977 <= 0) {
				arg3.anInt3745 += 128;
			} else {
				arg3.anInt3745 += (int) (Math.pow(2.0D, local124 * (double) local127.anInt977) * 128.0D + 0.5D);
			}
			while (arg3.anInt3746 < local127.aByteArray7.length - 2 && arg3.anInt3745 > (local127.aByteArray7[arg3.anInt3746 + 2] & 0xFF) << 8) {
				arg3.anInt3746 += 2;
			}
			if (local127.aByteArray7.length - 2 == arg3.anInt3746 && local127.aByteArray7[arg3.anInt3746 + 1] == 0) {
				local63 = true;
			}
		}
		if (arg3.anInt3748 >= 0 && local127.aByteArray6 != null && (this.anIntArray340[arg3.anInt3736] & 0x1) == 0 && (arg3.anInt3742 < 0 || this.aClass1_Sub19ArrayArray1[arg3.anInt3736][arg3.anInt3742] != arg3)) {
			if (local127.anInt986 > 0) {
				arg3.anInt3748 += (int) (Math.pow(2.0D, (double) local127.anInt986 * local124) * 128.0D + 0.5D);
			} else {
				arg3.anInt3748 += 128;
			}
			while (arg3.anInt3734 < local127.aByteArray6.length - 2 && arg3.anInt3748 > (local127.aByteArray6[arg3.anInt3734 + 2] & 0xFF) << 8) {
				arg3.anInt3734 += 2;
			}
			if (local127.aByteArray6.length - 2 == arg3.anInt3734) {
				local63 = true;
			}
		}
		if (!local63) {
			arg3.aClass1_Sub11_Sub4_3.method2971(arg3.anInt3751, this.method1750(arg3), this.method1766(arg3));
			return false;
		}
		arg3.aClass1_Sub11_Sub4_3.method2937(arg3.anInt3751);
		if (arg2 == null) {
			arg3.aClass1_Sub11_Sub4_3.method2935(arg1);
		} else {
			arg3.aClass1_Sub11_Sub4_3.method2933(arg2, arg0, arg1);
		}
		if (arg3.aClass1_Sub11_Sub4_3.method2966()) {
			this.aClass1_Sub11_Sub1_1.aClass1_Sub11_Sub3_1.method2820(arg3.aClass1_Sub11_Sub4_3);
		}
		arg3.method2569();
		if (arg3.anInt3748 >= 0) {
			arg3.method3141();
			if (arg3.anInt3742 > 0 && arg3 == this.aClass1_Sub19ArrayArray1[arg3.anInt3736][arg3.anInt3742]) {
				this.aClass1_Sub19ArrayArray1[arg3.anInt3736][arg3.anInt3742] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBII)V")
	private void method1778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(BII)V")
	public synchronized void method1779() {
		this.method1784();
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(II)V")
	private void method1780(@OriginalArg(0) int arg0) {
		if ((this.anIntArray340[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class1_Sub19 local16 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1853(); local16 != null; local16 = (Class1_Sub19) this.aClass1_Sub11_Sub1_1.aClass56_8.method1855()) {
			if (arg0 == local16.anInt3736) {
				local16.anInt3727 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "i", descriptor = "(I)I")
	public int method1781() {
		return this.anInt2610;
	}

	@OriginalMember(owner = "client!me", name = "j", descriptor = "(I)V")
	public synchronized void method1782() {
		this.aClass15_1.method503();
		this.method1769();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBI)V")
	private void method1783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray331[arg1] != arg0) {
			this.anIntArray331[arg1] = arg0;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass1_Sub19ArrayArray1[arg1][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IBI)V")
	private void method1784() {
		this.anIntArray347[9] = 128;
		this.anIntArray339[9] = 128;
		this.method1783(128, 9);
	}
}
