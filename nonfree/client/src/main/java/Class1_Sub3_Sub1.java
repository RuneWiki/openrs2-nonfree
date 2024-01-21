import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!c", name = "Rb", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!c", name = "Sb", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!c", name = "Ub", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!c", name = "Vb", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!c", name = "Wb", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!c", name = "G", descriptor = "[I")
	private final int[] anIntArray61 = new int[16];

	@OriginalMember(owner = "client!c", name = "J", descriptor = "[I")
	private final int[] anIntArray62 = new int[16];

	@OriginalMember(owner = "client!c", name = "R", descriptor = "I")
	private int anInt365 = 256;

	@OriginalMember(owner = "client!c", name = "T", descriptor = "[I")
	public final int[] anIntArray64 = new int[16];

	@OriginalMember(owner = "client!c", name = "fb", descriptor = "[I")
	private final int[] anIntArray67 = new int[16];

	@OriginalMember(owner = "client!c", name = "ob", descriptor = "[I")
	private final int[] anIntArray68 = new int[16];

	@OriginalMember(owner = "client!c", name = "eb", descriptor = "[I")
	private final int[] anIntArray66 = new int[16];

	@OriginalMember(owner = "client!c", name = "qb", descriptor = "[I")
	private final int[] anIntArray69 = new int[16];

	@OriginalMember(owner = "client!c", name = "sb", descriptor = "[I")
	private final int[] anIntArray70 = new int[16];

	@OriginalMember(owner = "client!c", name = "F", descriptor = "[I")
	public final int[] anIntArray60 = new int[16];

	@OriginalMember(owner = "client!c", name = "Ab", descriptor = "[I")
	private final int[] anIntArray72 = new int[16];

	@OriginalMember(owner = "client!c", name = "Fb", descriptor = "[[Lclient!hd;")
	private final Class1_Sub9[][] aClass1_Sub9ArrayArray1 = new Class1_Sub9[16][128];

	@OriginalMember(owner = "client!c", name = "Eb", descriptor = "[I")
	private final int[] anIntArray73 = new int[16];

	@OriginalMember(owner = "client!c", name = "zb", descriptor = "[I")
	private final int[] anIntArray71 = new int[16];

	@OriginalMember(owner = "client!c", name = "Ib", descriptor = "[I")
	private final int[] anIntArray74 = new int[16];

	@OriginalMember(owner = "client!c", name = "P", descriptor = "[I")
	public final int[] anIntArray63 = new int[16];

	@OriginalMember(owner = "client!c", name = "Hb", descriptor = "[[Lclient!hd;")
	private final Class1_Sub9[][] aClass1_Sub9ArrayArray2 = new Class1_Sub9[16][128];

	@OriginalMember(owner = "client!c", name = "Pb", descriptor = "[I")
	private final int[] anIntArray75 = new int[16];

	@OriginalMember(owner = "client!c", name = "kb", descriptor = "Lclient!ec;")
	private final Class23 aClass23_1 = new Class23();

	@OriginalMember(owner = "client!c", name = "Tb", descriptor = "Lclient!wb;")
	private final Class1_Sub3_Sub4 aClass1_Sub3_Sub4_1 = new Class1_Sub3_Sub4(this);

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "Lclient!qc;")
	private final Class66 aClass66_3 = new Class66(128);

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub1() {
		this.method346();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V")
	private void method314(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class1_Sub9 local18 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method22(); local18 != null; local18 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method23()) {
			if ((arg0 < 0 || arg0 == local18.anInt1176) && local18.anInt1184 < 0) {
				this.aClass1_Sub9ArrayArray1[local18.anInt1176][local18.anInt1182] = null;
				local18.anInt1184 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
	private void method315(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class1_Sub9 local12 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method22(); local12 != null; local12 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method23()) {
			if (arg0 < 0 || arg0 == local12.anInt1176) {
				if (local12.aClass1_Sub3_Sub3_3 != null) {
					local12.aClass1_Sub3_Sub3_3.method1483(Static81.anInt1802 / 100);
					if (local12.aClass1_Sub3_Sub3_3.method1498()) {
						this.aClass1_Sub3_Sub4_1.aClass1_Sub3_Sub2_2.method925(local12.aClass1_Sub3_Sub3_3);
					}
					local12.method965();
				}
				if (local12.anInt1184 < 0) {
					this.aClass1_Sub9ArrayArray1[local12.anInt1176][local12.anInt1182] = null;
				}
				local12.method2024();
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()Lclient!h;")
	@Override
	public synchronized Class1_Sub3 method2026() {
		return this.aClass1_Sub3_Sub4_1;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	public synchronized void method317() {
		this.aClass23_1.method617();
		this.method346();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
	private void method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray66[arg1] = arg0;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2028(@OriginalArg(0) int arg0) {
		if (this.aClass23_1.method608()) {
			@Pc(13) int local13 = this.aClass23_1.anInt748 * 1000000 / Static81.anInt1802;
			do {
				@Pc(22) long local22 = this.aLong33 + (long) arg0 * (long) local13;
				if (this.aLong32 - local22 >= 0L) {
					this.aLong33 = local22;
					break;
				}
				@Pc(50) int local50 = (int) (((long) local13 + this.aLong32 - this.aLong33 - 1L) / (long) local13);
				this.aLong33 += (long) local50 * (long) local13;
				arg0 -= local50;
				this.aClass1_Sub3_Sub4_1.method2028(local50);
				this.method329();
			} while (this.aClass23_1.method608());
		}
		this.aClass1_Sub3_Sub4_1.method2028(arg0);
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()I")
	@Override
	public synchronized int method2029() {
		return 0;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
	public synchronized void method319() {
		for (@Pc(12) Class1_Sub17 local12 = (Class1_Sub17) this.aClass66_3.method1647(); local12 != null; local12 = (Class1_Sub17) this.aClass66_3.method1648()) {
			local12.method1834();
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
	private void method320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(III)V")
	public synchronized void method321() {
		this.method333();
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(III)V")
	private void method322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray74[arg0] != arg1) {
			this.anIntArray74[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass1_Sub9ArrayArray2[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!hd;B)Z")
	public boolean method323(@OriginalArg(0) Class1_Sub9 arg0) {
		if (arg0.aClass1_Sub3_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt1184 >= 0) {
			arg0.method2024();
			if (arg0.anInt1187 > 0 && this.aClass1_Sub9ArrayArray2[arg0.anInt1176][arg0.anInt1187] == arg0) {
				this.aClass1_Sub9ArrayArray2[arg0.anInt1176][arg0.anInt1187] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!hd;ZI)V")
	public void method324(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass1_Sub14_Sub1_1.aByteArray21.length;
		@Pc(31) int local31;
		if (arg1 && arg0.aClass1_Sub14_Sub1_1.aBoolean99) {
			@Pc(42) int local42 = local12 + local12 - arg0.aClass1_Sub14_Sub1_1.anInt2052;
			local31 = (int) ((long) this.anIntArray60[arg0.anInt1176] * (long) local42 >> 6);
			local12 <<= 0x8;
			if (local12 <= local31) {
				arg0.aClass1_Sub3_Sub3_3.method1503();
				local31 = local12 + local12 - local31 - 1;
			}
		} else {
			local31 = (int) ((long) this.anIntArray60[arg0.anInt1176] * (long) local12 >> 6);
		}
		arg0.aClass1_Sub3_Sub3_3.method1479(local31);
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()Lclient!h;")
	@Override
	public synchronized Class1_Sub3 method2032() {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!oc;ZILclient!dd;Lclient!jb;)Z")
	public synchronized boolean method326(@OriginalArg(0) Class56 arg0, @OriginalArg(3) Class18 arg1, @OriginalArg(4) Class1_Sub10 arg2) {
		arg2.method1043();
		@Pc(18) int[] local18 = new int[] { 22050 };
		@Pc(20) boolean local20 = true;
		for (@Pc(26) Class1_Sub13 local26 = (Class1_Sub13) arg2.aClass66_8.method1647(); local26 != null; local26 = (Class1_Sub13) arg2.aClass66_8.method1648()) {
			@Pc(32) int local32 = (int) local26.aLong184;
			@Pc(40) Class1_Sub17 local40 = (Class1_Sub17) this.aClass66_3.method1650((long) local32);
			if (local40 == null) {
				local40 = Static63.method1108(local32, arg0);
				if (local40 == null) {
					local20 = false;
					continue;
				}
				this.aClass66_3.method1653(local40, (long) local32);
			}
			if (!local40.method1835(local18, arg1, local26.aByteArray20)) {
				local20 = false;
			}
		}
		if (local20) {
			arg2.method1042();
		}
		return local20;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!hd;I)I")
	private int method327(@OriginalArg(0) Class1_Sub9 arg0) {
		@Pc(15) int local15 = arg0.anInt1170 + (arg0.anInt1188 * arg0.anInt1180 >> 12);
		@Pc(18) Class47 local18 = arg0.aClass47_1;
		local15 += (this.anIntArray66[arg0.anInt1176] - 8192) * this.anIntArray75[arg0.anInt1176] >> 12;
		@Pc(59) int local59;
		if (local18.anInt1464 > 0 && (local18.anInt1456 > 0 || this.anIntArray69[arg0.anInt1176] > 0)) {
			local59 = local18.anInt1456 << 2;
			@Pc(64) int local64 = local18.anInt1455 << 1;
			if (arg0.anInt1186 < local64) {
				local59 = arg0.anInt1186 * local59 / local64;
			}
			local59 += this.anIntArray69[arg0.anInt1176] >> 7;
			@Pc(94) double local94 = Math.sin((double) (arg0.anInt1169 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local59 * local94);
		}
		local59 = (int) ((double) (arg0.aClass1_Sub14_Sub1_1.anInt2051 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static81.anInt1802 + 0.5D);
		return local59 < 1 ? 1 : local59;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!hd;)I")
	private int method328(@OriginalArg(1) Class1_Sub9 arg0) {
		@Pc(6) Class47 local6 = arg0.aClass47_1;
		@Pc(30) int local30 = this.anIntArray67[arg0.anInt1176] * this.anIntArray72[arg0.anInt1176] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt1172 + 16384 >> 15;
		local30 = this.anInt365 * local47 + 128 >> 8;
		if (local6.anInt1462 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) arg0.anInt1175 * 1.953125E-5D * (double) local6.anInt1462) + 0.5D);
		}
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(109) int local109;
		@Pc(121) int local121;
		if (local6.aByteArray17 != null) {
			local83 = arg0.anInt1181;
			local91 = local6.aByteArray17[arg0.anInt1168 + 1];
			if (arg0.anInt1168 < local6.aByteArray17.length - 2) {
				local109 = (local6.aByteArray17[arg0.anInt1168] & 0xFF) << 8;
				local121 = (local6.aByteArray17[arg0.anInt1168 + 2] & 0xFF) << 8;
				local91 += (local83 - local109) * (local6.aByteArray17[arg0.anInt1168 + 3] - local91) / (local121 - local109);
			}
			local30 = local91 * local30 + 32 >> 6;
		}
		if (arg0.anInt1184 > 0 && local6.aByteArray18 != null) {
			local83 = arg0.anInt1184;
			local91 = local6.aByteArray18[arg0.anInt1179 + 1];
			if (local6.aByteArray18.length - 2 > arg0.anInt1179) {
				local109 = (local6.aByteArray18[arg0.anInt1179] & 0xFF) << 8;
				local121 = (local6.aByteArray18[arg0.anInt1179 + 2] & 0xFF) << 8;
				local91 += (local83 - local109) * (local6.aByteArray18[arg0.anInt1179 + 3] - local91) / (local121 - local109);
			}
			local30 = local91 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
	private void method329() {
		@Pc(16) int local16 = this.anInt397;
		@Pc(19) int local19 = this.anInt396;
		@Pc(22) long local22 = this.aLong32;
		while (this.anInt396 == local19) {
			while (this.aClass23_1.anIntArray154[local16] == local19) {
				this.aClass23_1.method607(local16);
				@Pc(33) int local33 = this.aClass23_1.method612(local16);
				if (local33 == 1) {
					this.aClass23_1.method614();
					this.aClass23_1.method616(local16);
					if (this.aClass23_1.method613()) {
						if (!this.aBoolean11 || local19 == 0) {
							this.method346();
							this.aClass23_1.method617();
							return;
						}
						this.aClass23_1.method615(local22);
					}
					break;
				}
				if ((local33 & 0x80) != 0) {
					this.method331(local33);
				}
				this.aClass23_1.method609(local16);
				this.aClass23_1.method616(local16);
			}
			local16 = this.aClass23_1.method611();
			local19 = this.aClass23_1.anIntArray154[local16];
			local22 = this.aClass23_1.method610(local19);
		}
		this.aLong32 = local22;
		this.anInt396 = local19;
		this.anInt397 = local16;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZII)V")
	private void method330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray61[arg0] = arg1;
		this.anIntArray63[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
	private void method331(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(34) int local34;
		if (local5 == 128) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			this.method339(local28, local22, local34);
		} else if (local5 == 144) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			if (local34 <= 0) {
				this.method339(local28, local22, 64);
			} else {
				this.method337(local34, local22, local28);
			}
		} else if (local5 == 160) {
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 & 0xF;
			local34 = arg0 >> 16 & 0x7F;
			this.method341(local34, local22, local28);
		} else if (local5 == 176) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			if (local28 == 0) {
				this.anIntArray68[local22] = (local34 << 14) + (this.anIntArray68[local22] & 0xFFE03FFF);
			}
			if (local28 == 32) {
				this.anIntArray68[local22] = (local34 << 7) + (this.anIntArray68[local22] & 0xFFFFC07F);
			}
			if (local28 == 1) {
				this.anIntArray69[local22] = (this.anIntArray69[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 33) {
				this.anIntArray69[local22] = (this.anIntArray69[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 5) {
				this.anIntArray62[local22] = (this.anIntArray62[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 37) {
				this.anIntArray62[local22] = (this.anIntArray62[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 7) {
				this.anIntArray67[local22] = (local34 << 7) + (this.anIntArray67[local22] & 0xFFFFC07F);
			}
			if (local28 == 39) {
				this.anIntArray67[local22] = (this.anIntArray67[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 10) {
				this.anIntArray71[local22] = (this.anIntArray71[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 42) {
				this.anIntArray71[local22] = (this.anIntArray71[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 11) {
				this.anIntArray72[local22] = (this.anIntArray72[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 43) {
				this.anIntArray72[local22] = local34 + (this.anIntArray72[local22] & 0xFFFFFF80);
			}
			if (local28 == 64) {
				if (local34 >= 64) {
					this.anIntArray64[local22] |= 0x1;
				} else {
					this.anIntArray64[local22] &= 0xFFFFFFFE;
				}
			}
			if (local28 == 65) {
				if (local34 >= 64) {
					this.anIntArray64[local22] |= 0x2;
				} else {
					this.method334(local22);
					this.anIntArray64[local22] &= 0xFFFFFFFD;
				}
			}
			if (local28 == 99) {
				this.anIntArray70[local22] = (this.anIntArray70[local22] & 0x7F) + (local34 << 7);
			}
			if (local28 == 98) {
				this.anIntArray70[local22] = (this.anIntArray70[local22] & 0x3F80) + local34;
			}
			if (local28 == 101) {
				this.anIntArray70[local22] = (local34 << 7) + (this.anIntArray70[local22] & 0x7F) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray70[local22] = (this.anIntArray70[local22] & 0x3F80) + local34 + 16384;
			}
			if (local28 == 120) {
				this.method315(local22);
			}
			if (local28 == 121) {
				this.method332(local22);
			}
			if (local28 == 123) {
				this.method314(local22);
			}
			@Pc(514) int local514;
			if (local28 == 6) {
				local514 = this.anIntArray70[local22];
				if (local514 == 16384) {
					this.anIntArray75[local22] = (local34 << 7) + (this.anIntArray75[local22] & 0xFFFFC07F);
				}
			}
			if (local28 == 38) {
				local514 = this.anIntArray70[local22];
				if (local514 == 16384) {
					this.anIntArray75[local22] = (this.anIntArray75[local22] & 0xFFFFFF80) + local34;
				}
			}
			if (local28 == 16) {
				this.anIntArray60[local22] = (local34 << 7) + (this.anIntArray60[local22] & 0xFFFFC07F);
			}
			if (local28 == 48) {
				this.anIntArray60[local22] = (this.anIntArray60[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 81) {
				if (local34 < 64) {
					this.method347(local22);
					this.anIntArray64[local22] &= 0xFFFFFFFB;
				} else {
					this.anIntArray64[local22] |= 0x4;
				}
			}
			if (local28 == 17) {
				this.method330(local22, (local34 << 7) + (this.anIntArray61[local22] & 0xFFFFC07F));
			}
			if (local28 == 49) {
				this.method330(local22, local34 + (this.anIntArray61[local22] & 0xFFFFFF80));
			}
		} else if (local5 == 192) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method322(local22, local28 + this.anIntArray68[local22]);
		} else if (local5 == 208) {
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 & 0xF;
			this.method320(local22, local28);
		} else if (local5 == 224) {
			local22 = arg0 & 0xF;
			local28 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00D8) >> 9);
			this.method318(local28, local22);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method346();
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)V")
	private void method332(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method332(local12);
			}
			return;
		}
		this.anIntArray67[arg0] = 12800;
		this.anIntArray71[arg0] = 8192;
		this.anIntArray72[arg0] = 16383;
		this.anIntArray66[arg0] = 8192;
		this.anIntArray69[arg0] = 0;
		this.anIntArray62[arg0] = 8192;
		this.method334(arg0);
		this.method347(arg0);
		this.anIntArray64[arg0] = 0;
		this.anIntArray70[arg0] = 32767;
		this.anIntArray75[arg0] = 256;
		this.anIntArray60[arg0] = 0;
		this.method330(arg0, 8192);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(ZII)V")
	private void method333() {
		this.anIntArray73[9] = 128;
		this.anIntArray68[9] = 128;
		this.method322(9, 128);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
	private void method334(@OriginalArg(1) int arg0) {
		if ((this.anIntArray64[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub9 local15 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method22(); local15 != null; local15 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method23()) {
			if (arg0 == local15.anInt1176 && this.aClass1_Sub9ArrayArray1[arg0][local15.anInt1182] == null && local15.anInt1184 < 0) {
				local15.anInt1184 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(I)V")
	public synchronized void method335() {
		for (@Pc(7) Class1_Sub17 local7 = (Class1_Sub17) this.aClass66_3.method1647(); local7 != null; local7 = (Class1_Sub17) this.aClass66_3.method1648()) {
			local7.method2024();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method336() {
		return this.aClass23_1.method608();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBII)V")
	private void method337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method339(arg2, arg1, 64);
		if ((this.anIntArray64[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub9 local28 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method29(); local28 != null; local28 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method28()) {
				if (arg1 == local28.anInt1176 && local28.anInt1184 < 0) {
					this.aClass1_Sub9ArrayArray1[arg1][local28.anInt1182] = null;
					this.aClass1_Sub9ArrayArray1[arg1][arg2] = local28;
					@Pc(63) int local63 = (local28.anInt1180 * local28.anInt1188 >> 12) + local28.anInt1170;
					local28.anInt1170 += arg2 - local28.anInt1182 << 8;
					local28.anInt1188 = 4096;
					local28.anInt1182 = arg2;
					local28.anInt1180 = local63 - local28.anInt1170;
					return;
				}
			}
		}
		@Pc(108) Class1_Sub17 local108 = (Class1_Sub17) this.aClass66_3.method1650((long) this.anIntArray74[arg1]);
		if (local108 == null) {
			return;
		}
		@Pc(116) Class1_Sub14_Sub1 local116 = local108.aClass1_Sub14_Sub1Array1[arg2];
		if (local116 == null) {
			return;
		}
		@Pc(123) Class1_Sub9 local123 = new Class1_Sub9();
		local123.aClass1_Sub17_1 = local108;
		local123.anInt1176 = arg1;
		local123.aClass1_Sub14_Sub1_1 = local116;
		local123.aClass47_1 = local108.aClass47Array1[arg2];
		local123.anInt1187 = local108.aByteArray29[arg2];
		local123.anInt1182 = arg2;
		local123.anInt1172 = arg0 * arg0 * local108.anInt2639 * local108.aByteArray31[arg2] + 1024 >> 11;
		local123.anInt1171 = local108.aByteArray30[arg2] & 0xFF;
		local123.anInt1170 = (arg2 << 8) - (local108.aShortArray13[arg2] & 0x7FFF);
		local123.anInt1181 = 0;
		local123.anInt1184 = -1;
		local123.anInt1168 = 0;
		local123.anInt1179 = 0;
		local123.anInt1175 = 0;
		if (this.anIntArray60[arg1] == 0) {
			local123.aClass1_Sub3_Sub3_3 = Static135.method1482(local116, this.method327(local123), this.method328(local123), this.method338(local123));
		} else {
			local123.aClass1_Sub3_Sub3_3 = Static135.method1482(local116, this.method327(local123), 0, this.method338(local123));
			this.method324(local123, local108.aShortArray13[arg2] < 0);
		}
		if (local108.aShortArray13[arg2] < 0) {
			local123.aClass1_Sub3_Sub3_3.method1474(-1);
		}
		if (local123.anInt1187 >= 0) {
			@Pc(278) Class1_Sub9 local278 = this.aClass1_Sub9ArrayArray2[arg1][local123.anInt1187];
			if (local278 != null && local278.anInt1184 < 0) {
				this.aClass1_Sub9ArrayArray1[arg1][local278.anInt1182] = null;
				local278.anInt1184 = 0;
			}
			this.aClass1_Sub9ArrayArray2[arg1][local123.anInt1187] = local123;
		}
		this.aClass1_Sub3_Sub4_1.aClass2_12.method33(local123);
		this.aClass1_Sub9ArrayArray1[arg1][arg2] = local123;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(ILclient!hd;)I")
	private int method338(@OriginalArg(1) Class1_Sub9 arg0) {
		@Pc(10) int local10 = this.anIntArray71[arg0.anInt1176];
		return local10 >= 8192 ? 16384 - ((16384 - local10) * (-arg0.anInt1171 + 128) + 32 >> 6) : arg0.anInt1171 * local10 + 32 >> 6;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZII)V")
	private void method339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub9 local8 = this.aClass1_Sub9ArrayArray1[arg1][arg0];
		if (local8 == null) {
			return;
		}
		this.aClass1_Sub9ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray64[arg1] & 0x2) == 0) {
			local8.anInt1184 = 0;
			return;
		}
		for (@Pc(49) Class1_Sub9 local49 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method22(); local49 != null; local49 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method23()) {
			if (local8.anInt1176 == local49.anInt1176 && local49.anInt1184 < 0 && local49 != local8) {
				local8.anInt1184 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(BI)V")
	public synchronized void method340(@OriginalArg(1) int arg0) {
		this.anInt365 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	private void method341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "(I)I")
	public int method344() {
		return this.anInt365;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!jb;ZI)V")
	public synchronized void method345(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(1) boolean arg1) {
		this.method317();
		this.aClass23_1.method618(arg0.aByteArray16);
		this.aLong33 = 0L;
		this.aBoolean11 = arg1;
		@Pc(29) int local29 = this.aClass23_1.method620();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass23_1.method607(local31);
			this.aClass23_1.method609(local31);
			this.aClass23_1.method616(local31);
		}
		this.anInt397 = this.aClass23_1.method611();
		this.anInt396 = this.aClass23_1.anIntArray154[this.anInt397];
		this.aLong32 = this.aClass23_1.method610(this.anInt396);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2030(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass23_1.method608()) {
			@Pc(13) int local13 = this.aClass23_1.anInt748 * 1000000 / Static81.anInt1802;
			do {
				@Pc(22) long local22 = (long) local13 * (long) arg2 + this.aLong33;
				if (this.aLong32 - local22 >= 0L) {
					this.aLong33 = local22;
					break;
				}
				@Pc(50) int local50 = (int) ((this.aLong32 + (long) local13 - this.aLong33 - 1L) / (long) local13);
				this.aLong33 += (long) local13 * (long) local50;
				arg2 -= local50;
				this.aClass1_Sub3_Sub4_1.method2030(arg0, arg1, local50);
				this.method329();
				arg1 += local50;
			} while (this.aClass23_1.method608());
		}
		this.aClass1_Sub3_Sub4_1.method2030(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
	private void method346() {
		this.method315(-1);
		this.method332(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray74[local15] = this.anIntArray73[local15];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray68[local41] = this.anIntArray73[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(IB)V")
	private void method347(@OriginalArg(0) int arg0) {
		if ((this.anIntArray64[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(27) Class1_Sub9 local27 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method22(); local27 != null; local27 = (Class1_Sub9) this.aClass1_Sub3_Sub4_1.aClass2_12.method23()) {
			if (arg0 == local27.anInt1176) {
				local27.anInt1167 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!hd;[III)Z")
	public boolean method348(@OriginalArg(1) Class1_Sub9 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt1173 = Static81.anInt1802 / 100;
		if (arg0.anInt1184 >= 0 && (arg0.aClass1_Sub3_Sub3_3 == null || arg0.aClass1_Sub3_Sub3_3.method1496())) {
			arg0.method965();
			arg0.method2024();
			if (arg0.anInt1187 > 0 && this.aClass1_Sub9ArrayArray2[arg0.anInt1176][arg0.anInt1187] == arg0) {
				this.aClass1_Sub9ArrayArray2[arg0.anInt1176][arg0.anInt1187] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg0.anInt1188;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray62[arg0.anInt1176] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg0.anInt1188 = local59;
		}
		arg0.aClass1_Sub3_Sub3_3.method1507(this.method327(arg0));
		@Pc(96) Class47 local96 = arg0.aClass47_1;
		arg0.anInt1169 += local96.anInt1464;
		@Pc(126) double local126 = (double) ((arg0.anInt1188 * arg0.anInt1180 >> 12) + (arg0.anInt1182 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(128) boolean local128 = false;
		arg0.anInt1186++;
		if (local96.anInt1462 > 0) {
			if (local96.anInt1463 <= 0) {
				arg0.anInt1175 += 128;
			} else {
				arg0.anInt1175 += (int) (Math.pow(2.0D, local126 * (double) local96.anInt1463) * 128.0D + 0.5D);
			}
		}
		if (local96.aByteArray17 != null) {
			if (local96.anInt1457 > 0) {
				arg0.anInt1181 += (int) (Math.pow(2.0D, local126 * (double) local96.anInt1457) * 128.0D + 0.5D);
			} else {
				arg0.anInt1181 += 128;
			}
			while (local96.aByteArray17.length - 2 > arg0.anInt1168 && (local96.aByteArray17[arg0.anInt1168 + 2] & 0xFF) << 8 < arg0.anInt1181) {
				arg0.anInt1168 += 2;
			}
			if (local96.aByteArray17.length - 2 == arg0.anInt1168 && local96.aByteArray17[arg0.anInt1168 + 1] == 0) {
				local128 = true;
			}
		}
		if (arg0.anInt1184 >= 0 && local96.aByteArray18 != null && (this.anIntArray64[arg0.anInt1176] & 0x1) == 0 && (arg0.anInt1187 < 0 || this.aClass1_Sub9ArrayArray2[arg0.anInt1176][arg0.anInt1187] != arg0)) {
			if (local96.anInt1465 <= 0) {
				arg0.anInt1184 += 128;
			} else {
				arg0.anInt1184 += (int) (Math.pow(2.0D, local126 * (double) local96.anInt1465) * 128.0D + 0.5D);
			}
			while (local96.aByteArray18.length - 2 > arg0.anInt1179 && (local96.aByteArray18[arg0.anInt1179 + 2] & 0xFF) << 8 < arg0.anInt1184) {
				arg0.anInt1179 += 2;
			}
			if (local96.aByteArray18.length - 2 == arg0.anInt1179) {
				local128 = true;
			}
		}
		if (!local128) {
			arg0.aClass1_Sub3_Sub3_3.method1494(arg0.anInt1173, this.method328(arg0), this.method338(arg0));
			return false;
		}
		arg0.aClass1_Sub3_Sub3_3.method1483(arg0.anInt1173);
		if (arg1 == null) {
			arg0.aClass1_Sub3_Sub3_3.method2028(arg2);
		} else {
			arg0.aClass1_Sub3_Sub3_3.method2030(arg1, arg3, arg2);
		}
		if (arg0.aClass1_Sub3_Sub3_3.method1498()) {
			this.aClass1_Sub3_Sub4_1.aClass1_Sub3_Sub2_2.method925(arg0.aClass1_Sub3_Sub3_3);
		}
		arg0.method965();
		if (arg0.anInt1184 >= 0) {
			arg0.method2024();
			if (arg0.anInt1187 > 0 && arg0 == this.aClass1_Sub9ArrayArray2[arg0.anInt1176][arg0.anInt1187]) {
				this.aClass1_Sub9ArrayArray2[arg0.anInt1176][arg0.anInt1187] = null;
			}
		}
		return true;
	}
}
