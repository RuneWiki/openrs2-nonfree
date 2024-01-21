import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class4_Sub12_Sub2 extends Class4_Sub12 {

	@OriginalMember(owner = "client!ke", name = "Nb", descriptor = "Z")
	private boolean aBoolean100;

	@OriginalMember(owner = "client!ke", name = "Pb", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!ke", name = "Qb", descriptor = "I")
	private int anInt1631;

	@OriginalMember(owner = "client!ke", name = "Rb", descriptor = "I")
	private int anInt1632;

	@OriginalMember(owner = "client!ke", name = "Sb", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "[I")
	private final int[] anIntArray209 = new int[16];

	@OriginalMember(owner = "client!ke", name = "W", descriptor = "[I")
	private final int[] anIntArray210 = new int[16];

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "[[Lclient!va;")
	private final Class4_Sub23[][] aClass4_Sub23ArrayArray1 = new Class4_Sub23[16][128];

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "[I")
	private final int[] anIntArray208 = new int[16];

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "[I")
	private final int[] anIntArray205 = new int[16];

	@OriginalMember(owner = "client!ke", name = "ab", descriptor = "[I")
	private final int[] anIntArray212 = new int[16];

	@OriginalMember(owner = "client!ke", name = "jb", descriptor = "[I")
	private final int[] anIntArray213 = new int[16];

	@OriginalMember(owner = "client!ke", name = "qb", descriptor = "I")
	private final int anInt1617 = 1000000;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "[I")
	public final int[] anIntArray207 = new int[16];

	@OriginalMember(owner = "client!ke", name = "M", descriptor = "[I")
	public final int[] anIntArray206 = new int[16];

	@OriginalMember(owner = "client!ke", name = "xb", descriptor = "[I")
	private final int[] anIntArray216 = new int[16];

	@OriginalMember(owner = "client!ke", name = "wb", descriptor = "[I")
	private final int[] anIntArray215 = new int[16];

	@OriginalMember(owner = "client!ke", name = "Z", descriptor = "[I")
	private final int[] anIntArray211 = new int[16];

	@OriginalMember(owner = "client!ke", name = "Bb", descriptor = "I")
	private int anInt1625 = 256;

	@OriginalMember(owner = "client!ke", name = "Fb", descriptor = "[I")
	private final int[] anIntArray218 = new int[16];

	@OriginalMember(owner = "client!ke", name = "Hb", descriptor = "[[Lclient!va;")
	private final Class4_Sub23[][] aClass4_Sub23ArrayArray2 = new Class4_Sub23[16][128];

	@OriginalMember(owner = "client!ke", name = "sb", descriptor = "[I")
	private final int[] anIntArray214 = new int[16];

	@OriginalMember(owner = "client!ke", name = "Eb", descriptor = "[I")
	private final int[] anIntArray217 = new int[16];

	@OriginalMember(owner = "client!ke", name = "Mb", descriptor = "[I")
	public final int[] anIntArray219 = new int[16];

	@OriginalMember(owner = "client!ke", name = "gb", descriptor = "Lclient!mc;")
	private final Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!ke", name = "Ob", descriptor = "Lclient!ge;")
	private final Class4_Sub12_Sub1 aClass4_Sub12_Sub1_1 = new Class4_Sub12_Sub1(this);

	@OriginalMember(owner = "client!ke", name = "V", descriptor = "Lclient!gf;")
	private final Class28 aClass28_5 = new Class28(128);

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class4_Sub12_Sub2() {
		this.method1083();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	public synchronized void method1055() {
		this.method1061();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	private void method1056(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class4_Sub23 local8 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1916(); local8 != null; local8 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1920()) {
			if ((arg0 < 0 || arg0 == local8.anInt2695) && local8.anInt2707 < 0) {
				this.aClass4_Sub23ArrayArray2[local8.anInt2695][local8.anInt2702] = null;
				local8.anInt2707 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
	private void method1057(@OriginalArg(1) int arg0) {
		if ((this.anIntArray219[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class4_Sub23 local16 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1916(); local16 != null; local16 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1920()) {
			if (arg0 == local16.anInt2695) {
				local16.anInt2706 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBI)V")
	private void method1058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub23 local8 = this.aClass4_Sub23ArrayArray2[arg2][arg0];
		if (local8 == null) {
			return;
		}
		this.aClass4_Sub23ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray219[arg2] & 0x2) == 0) {
			local8.anInt2707 = 0;
			return;
		}
		for (@Pc(44) Class4_Sub23 local44 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1916(); local44 != null; local44 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1920()) {
			if (local44.anInt2695 == local8.anInt2695 && local44.anInt2707 < 0 && local44 != local8) {
				local8.anInt2707 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)V")
	private void method1059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray218[arg0]) {
			this.anIntArray218[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass4_Sub23ArrayArray1[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZILclient!va;)V")
	public void method1060(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub23 arg1) {
		@Pc(8) int local8 = arg1.aClass4_Sub6_Sub1_1.aByteArray46.length;
		@Pc(35) int local35;
		if (arg0 && arg1.aClass4_Sub6_Sub1_1.aBoolean131) {
			@Pc(22) int local22 = local8 + local8 - arg1.aClass4_Sub6_Sub1_1.anInt2132;
			local35 = (int) ((long) this.anIntArray207[arg1.anInt2695] * (long) local22 >> 6);
			local8 <<= 0x8;
			if (local8 <= local35) {
				local35 = local8 + local8 - local35 - 1;
				arg1.aClass4_Sub12_Sub3_3.method1200();
			}
		} else {
			local35 = (int) ((long) local8 * (long) this.anIntArray207[arg1.anInt2695] >> 6);
		}
		arg1.aClass4_Sub12_Sub3_3.method1212(local35);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)V")
	private void method1061() {
		this.anIntArray211[9] = 128;
		this.anIntArray214[9] = 128;
		this.method1059(9, 128);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!va;I)I")
	private int method1062(@OriginalArg(0) Class4_Sub23 arg0) {
		@Pc(2) Class21 local2 = arg0.aClass21_1;
		@Pc(22) int local22 = this.anIntArray210[arg0.anInt2695] * this.anIntArray215[arg0.anInt2695] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = local30 * arg0.anInt2696 + 16384 >> 15;
		local22 = this.anInt1625 * local39 + 128 >> 8;
		if (local2.anInt574 > 0) {
			local22 = (int) ((double) local22 * Math.pow(0.5D, (double) local2.anInt574 * (double) arg0.anInt2700 * 1.953125E-5D) + 0.5D);
		}
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(109) int local109;
		@Pc(121) int local121;
		if (local2.aByteArray6 != null) {
			local83 = arg0.anInt2694;
			local91 = local2.aByteArray6[arg0.anInt2703 + 1];
			if (local2.aByteArray6.length - 2 > arg0.anInt2703) {
				local109 = (local2.aByteArray6[arg0.anInt2703] & 0xFF) << 8;
				local121 = (local2.aByteArray6[arg0.anInt2703 + 2] & 0xFF) << 8;
				local91 += (local2.aByteArray6[arg0.anInt2703 + 3] - local91) * (local83 - local109) / (local121 - local109);
			}
			local22 = local22 * local91 + 32 >> 6;
		}
		if (arg0.anInt2707 > 0 && local2.aByteArray5 != null) {
			local91 = local2.aByteArray5[arg0.anInt2709 + 1];
			local83 = arg0.anInt2707;
			if (arg0.anInt2709 < local2.aByteArray5.length - 2) {
				local121 = (local2.aByteArray5[arg0.anInt2709 + 2] & 0xFF) << 8;
				local109 = (local2.aByteArray5[arg0.anInt2709] & 0xFF) << 8;
				local91 += (local83 - local109) * (local2.aByteArray5[arg0.anInt2709 + 3] - local91) / (local121 - local109);
			}
			local22 = local91 * local22 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
	private void method1063(@OriginalArg(0) int arg0) {
		if ((this.anIntArray219[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub23 local18 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1916(); local18 != null; local18 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1920()) {
			if (arg0 == local18.anInt2695 && this.aClass4_Sub23ArrayArray2[arg0][local18.anInt2702] == null && local18.anInt2707 < 0) {
				local18.anInt2707 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	public synchronized void method1064(@OriginalArg(0) int arg0) {
		this.anInt1625 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!f;ZI)V")
	public synchronized void method1065(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) boolean arg1) {
		this.method1089();
		this.aClass45_1.method1339(arg0.aByteArray13);
		this.aBoolean100 = arg1;
		this.aLong55 = 0L;
		@Pc(29) int local29 = this.aClass45_1.method1343();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass45_1.method1340(local31);
			this.aClass45_1.method1341(local31);
			this.aClass45_1.method1349(local31);
		}
		this.anInt1632 = this.aClass45_1.method1338();
		this.anInt1631 = this.aClass45_1.anIntArray257[this.anInt1632];
		this.aLong54 = this.aClass45_1.method1336(this.anInt1631);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
	private void method1066(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class4_Sub23 local12 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1916(); local12 != null; local12 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1920()) {
			if (arg0 < 0 || arg0 == local12.anInt2695) {
				if (local12.aClass4_Sub12_Sub3_3 != null) {
					local12.aClass4_Sub12_Sub3_3.method1198(Static106.anInt2355 / 100);
					if (local12.aClass4_Sub12_Sub3_3.method1211()) {
						this.aClass4_Sub12_Sub1_1.aClass4_Sub12_Sub4_2.method1700(local12.aClass4_Sub12_Sub3_3);
					}
					local12.method1898();
				}
				if (local12.anInt2707 < 0) {
					this.aClass4_Sub23ArrayArray2[local12.anInt2695][local12.anInt2702] = null;
				}
				local12.method2004();
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "()Lclient!ld;")
	@Override
	public synchronized Class4_Sub12 method1696() {
		return this.aClass4_Sub12_Sub1_1;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)V")
	private void method1067(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local5 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1058(local22, local28, local16);
		} else if (local5 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method1076(local22, local28, local16);
			} else {
				this.method1058(local22, 64, local16);
			}
		} else if (local5 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1075(local16, local28, local22);
		} else if (local5 == 176) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			if (local22 == 0) {
				this.anIntArray214[local16] = (this.anIntArray214[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray214[local16] = (this.anIntArray214[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray212[local16] = (this.anIntArray212[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray212[local16] = local28 + (this.anIntArray212[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray209[local16] = (local28 << 7) + (this.anIntArray209[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray209[local16] = (this.anIntArray209[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray210[local16] = (this.anIntArray210[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray210[local16] = local28 + (this.anIntArray210[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray213[local16] = (local28 << 7) + (this.anIntArray213[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray213[local16] = local28 + (this.anIntArray213[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray215[local16] = (this.anIntArray215[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray215[local16] = local28 + (this.anIntArray215[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray219[local16] |= 0x1;
				} else {
					this.anIntArray219[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray219[local16] |= 0x2;
				} else {
					this.method1063(local16);
					this.anIntArray219[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray217[local16] = (local28 << 7) + (this.anIntArray217[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray217[local16] = (this.anIntArray217[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray217[local16] = (local28 << 7) + (this.anIntArray217[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray217[local16] = local28 + (this.anIntArray217[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method1066(local16);
			}
			if (local22 == 121) {
				this.method1069(local16);
			}
			if (local22 == 123) {
				this.method1056(local16);
			}
			@Pc(490) int local490;
			if (local22 == 6) {
				local490 = this.anIntArray217[local16];
				if (local490 == 16384) {
					this.anIntArray216[local16] = (local28 << 7) + (this.anIntArray216[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local490 = this.anIntArray217[local16];
				if (local490 == 16384) {
					this.anIntArray216[local16] = (this.anIntArray216[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray207[local16] = (this.anIntArray207[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray207[local16] = (this.anIntArray207[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray219[local16] |= 0x4;
				} else {
					this.method1057(local16);
					this.anIntArray219[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method1087((local28 << 7) + (this.anIntArray205[local16] & 0xFFFFC07F), local16);
			}
			if (local22 == 49) {
				this.method1087((this.anIntArray205[local16] & 0xFFFFFF80) + local28, local16);
			}
		} else if (local5 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1059(local16, local22 + this.anIntArray214[local16]);
		} else if (local5 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1084(local22, local16);
		} else if (local5 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method1082(local16, local22);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method1083();
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)Z")
	public synchronized boolean method1068() {
		return this.aClass45_1.method1350();
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)V")
	private void method1069(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1069(local9);
			}
			return;
		}
		this.anIntArray210[arg0] = 12800;
		this.anIntArray213[arg0] = 8192;
		this.anIntArray215[arg0] = 16383;
		this.anIntArray208[arg0] = 8192;
		this.anIntArray212[arg0] = 0;
		this.anIntArray209[arg0] = 8192;
		this.method1063(arg0);
		this.method1057(arg0);
		this.anIntArray219[arg0] = 0;
		this.anIntArray217[arg0] = 32767;
		this.anIntArray216[arg0] = 256;
		this.anIntArray207[arg0] = 0;
		this.method1087(8192, arg0);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Lclient!va;I)Z")
	public boolean method1070(@OriginalArg(0) Class4_Sub23 arg0) {
		if (arg0.aClass4_Sub12_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt2707 >= 0) {
			arg0.method2004();
			if (arg0.anInt2708 > 0 && this.aClass4_Sub23ArrayArray1[arg0.anInt2695][arg0.anInt2708] == arg0) {
				this.aClass4_Sub23ArrayArray1[arg0.anInt2695][arg0.anInt2708] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(Lclient!va;I)I")
	private int method1071(@OriginalArg(0) Class4_Sub23 arg0) {
		@Pc(11) Class21 local11 = arg0.aClass21_1;
		@Pc(22) int local22 = (arg0.anInt2693 * arg0.anInt2698 >> 12) + arg0.anInt2690;
		local22 += (this.anIntArray208[arg0.anInt2695] - 8192) * this.anIntArray216[arg0.anInt2695] >> 12;
		@Pc(65) int local65;
		if (local11.anInt566 > 0 && (local11.anInt567 > 0 || this.anIntArray212[arg0.anInt2695] > 0)) {
			@Pc(60) int local60 = local11.anInt570 << 1;
			local65 = local11.anInt567 << 2;
			if (arg0.anInt2699 < local60) {
				local65 = local65 * arg0.anInt2699 / local60;
			}
			local65 += this.anIntArray212[arg0.anInt2695] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt2692 & 0x1FF) * 0.01227184630308513D);
			local22 += (int) ((double) local65 * local99);
		}
		local65 = (int) ((double) (arg0.aClass4_Sub6_Sub1_1.anInt2133 * 256) * Math.pow(2.0D, (double) local22 * 3.255208333333333E-4D) / (double) Static106.anInt2355 + 0.5D);
		return local65 < 1 ? 1 : local65;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public synchronized void method1072() {
		for (@Pc(11) Class4_Sub24 local11 = (Class4_Sub24) this.aClass28_5.method775(); local11 != null; local11 = (Class4_Sub24) this.aClass28_5.method771()) {
			local11.method2010();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!md;Lclient!la;IBLclient!f;)Z")
	public synchronized boolean method1073(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(4) Class4_Sub9 arg2) {
		arg2.method432();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(35) Class4_Sub17 local35 = (Class4_Sub17) arg2.aClass28_1.method775(); local35 != null; local35 = (Class4_Sub17) arg2.aClass28_1.method771()) {
			@Pc(41) int local41 = (int) local35.aLong99;
			@Pc(49) Class4_Sub24 local49 = (Class4_Sub24) this.aClass28_5.method770((long) local41);
			if (local49 == null) {
				local49 = Static15.method181(local41, arg1);
				if (local49 == null) {
					local9 = false;
					continue;
				}
				this.aClass28_5.method774((long) local41, local49);
			}
			if (!local49.method2006(arg0, local23, local35.aByteArray45)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method434();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!va;)I")
	private int method1074(@OriginalArg(1) Class4_Sub23 arg0) {
		@Pc(13) int local13 = this.anIntArray213[arg0.anInt2695];
		return local13 >= 8192 ? 16384 - ((16384 - local13) * (128 - arg0.anInt2697) + 32 >> 6) : arg0.anInt2697 * local13 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIII)V")
	private void method1075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIII)V")
	private void method1076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method1058(arg0, 64, arg2);
		if ((this.anIntArray219[arg2] & 0x2) != 0) {
			for (@Pc(25) Class4_Sub23 local25 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1924(); local25 != null; local25 = (Class4_Sub23) this.aClass4_Sub12_Sub1_1.aClass78_4.method1927()) {
				if (local25.anInt2695 == arg2 && local25.anInt2707 < 0) {
					this.aClass4_Sub23ArrayArray2[arg2][local25.anInt2702] = null;
					this.aClass4_Sub23ArrayArray2[arg2][arg0] = local25;
					@Pc(64) int local64 = (local25.anInt2698 * local25.anInt2693 >> 12) + local25.anInt2690;
					local25.anInt2693 = 4096;
					local25.anInt2690 += arg0 - local25.anInt2702 << 8;
					local25.anInt2702 = arg0;
					local25.anInt2698 = local64 - local25.anInt2690;
					return;
				}
			}
		}
		@Pc(110) Class4_Sub24 local110 = (Class4_Sub24) this.aClass28_5.method770((long) this.anIntArray218[arg2]);
		if (local110 == null) {
			return;
		}
		@Pc(118) Class4_Sub6_Sub1 local118 = local110.aClass4_Sub6_Sub1Array1[arg0];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class4_Sub23 local125 = new Class4_Sub23();
		local125.anInt2695 = arg2;
		local125.aClass4_Sub24_1 = local110;
		local125.aClass4_Sub6_Sub1_1 = local118;
		local125.aClass21_1 = local110.aClass21Array1[arg0];
		local125.anInt2708 = local110.aByteArray74[arg0];
		local125.anInt2702 = arg0;
		local125.anInt2696 = local110.anInt2820 * arg1 * arg1 * local110.aByteArray73[arg0] + 1024 >> 11;
		local125.anInt2697 = local110.aByteArray75[arg0] & 0xFF;
		local125.anInt2690 = (arg0 << 8) - (local110.aShortArray39[arg0] & 0x7FFF);
		local125.anInt2700 = 0;
		local125.anInt2707 = -1;
		local125.anInt2709 = 0;
		local125.anInt2703 = 0;
		local125.anInt2694 = 0;
		if (this.anIntArray207[arg2] == 0) {
			local125.aClass4_Sub12_Sub3_3 = Static139.method1207(local118, this.method1071(local125), this.method1062(local125), this.method1074(local125));
		} else {
			local125.aClass4_Sub12_Sub3_3 = Static139.method1207(local118, this.method1071(local125), 0, this.method1074(local125));
			this.method1060(local110.aShortArray39[arg0] < 0, local125);
		}
		if (local110.aShortArray39[arg0] < 0) {
			local125.aClass4_Sub12_Sub3_3.method1197(-1);
		}
		if (local125.anInt2708 >= 0) {
			@Pc(284) Class4_Sub23 local284 = this.aClass4_Sub23ArrayArray1[arg2][local125.anInt2708];
			if (local284 != null && local284.anInt2707 < 0) {
				this.aClass4_Sub23ArrayArray2[arg2][local284.anInt2702] = null;
				local284.anInt2707 = 0;
			}
			this.aClass4_Sub23ArrayArray1[arg2][local125.anInt2708] = local125;
		}
		this.aClass4_Sub12_Sub1_1.aClass78_4.method1914(local125);
		this.aClass4_Sub23ArrayArray2[arg2][arg0] = local125;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "()I")
	@Override
	public synchronized int method1691() {
		return 0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public synchronized void method1080() {
		for (@Pc(11) Class4_Sub24 local11 = (Class4_Sub24) this.aClass28_5.method775(); local11 != null; local11 = (Class4_Sub24) this.aClass28_5.method771()) {
			local11.method2004();
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
	private void method1081() {
		@Pc(12) int local12 = this.anInt1632;
		@Pc(15) long local15 = this.aLong54;
		@Pc(18) int local18 = this.anInt1631;
		while (this.anInt1631 == local18) {
			while (this.aClass45_1.anIntArray257[local12] == local18) {
				this.aClass45_1.method1340(local12);
				@Pc(29) int local29 = this.aClass45_1.method1345(local12);
				if (local29 == 1) {
					this.aClass45_1.method1344();
					this.aClass45_1.method1349(local12);
					if (this.aClass45_1.method1342()) {
						if (!this.aBoolean100 || local18 == 0) {
							this.method1083();
							this.aClass45_1.method1347();
							return;
						}
						this.aClass45_1.method1351(local15);
					}
					break;
				}
				if ((local29 & 0x80) != 0) {
					this.method1067(local29);
				}
				this.aClass45_1.method1341(local12);
				this.aClass45_1.method1349(local12);
			}
			local12 = this.aClass45_1.method1338();
			local18 = this.aClass45_1.anIntArray257[local12];
			local15 = this.aClass45_1.method1336(local18);
		}
		this.aLong54 = local15;
		this.anInt1632 = local12;
		this.anInt1631 = local18;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(III)V")
	private void method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray208[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method1693(@OriginalArg(0) int arg0) {
		if (this.aClass45_1.method1350()) {
			@Pc(14) int local14 = this.aClass45_1.anInt1874 * this.anInt1617 / Static106.anInt2355;
			do {
				@Pc(23) long local23 = this.aLong55 + (long) local14 * (long) arg0;
				if (this.aLong54 - local23 >= 0L) {
					this.aLong55 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong54 - this.aLong55 - 1L) / (long) local14);
				arg0 -= local54;
				this.aLong55 += (long) local14 * (long) local54;
				this.aClass4_Sub12_Sub1_1.method1693(local54);
				this.method1081();
			} while (this.aClass45_1.method1350());
		}
		this.aClass4_Sub12_Sub1_1.method1693(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V")
	private void method1083() {
		this.method1066(-1);
		this.method1069(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray218[local15] = this.anIntArray211[local15];
		}
		for (@Pc(33) int local33 = 0; local33 < 16; local33++) {
			this.anIntArray214[local33] = this.anIntArray211[local33] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)V")
	private void method1084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "()Lclient!ld;")
	@Override
	public synchronized Class4_Sub12 method1694() {
		return null;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass45_1.method1350()) {
			@Pc(18) int local18 = this.anInt1617 * this.aClass45_1.anInt1874 / Static106.anInt2355;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong55;
				if (this.aLong54 - local27 >= 0L) {
					this.aLong55 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong54 + (long) local18 - this.aLong55 - 1L) / (long) local18);
				this.aLong55 += (long) local18 * (long) local57;
				this.aClass4_Sub12_Sub1_1.method1697(arg0, arg1, local57);
				arg2 -= local57;
				this.method1081();
				arg1 += local57;
			} while (this.aClass45_1.method1350());
		}
		this.aClass4_Sub12_Sub1_1.method1697(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!va;III[I)Z")
	public boolean method1085(@OriginalArg(0) Class4_Sub23 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0.anInt2710 = Static106.anInt2355 / 100;
		if (arg0.anInt2707 >= 0 && (arg0.aClass4_Sub12_Sub3_3 == null || arg0.aClass4_Sub12_Sub3_3.method1223())) {
			arg0.method1898();
			arg0.method2004();
			if (arg0.anInt2708 > 0 && this.aClass4_Sub23ArrayArray1[arg0.anInt2695][arg0.anInt2708] == arg0) {
				this.aClass4_Sub23ArrayArray1[arg0.anInt2695][arg0.anInt2708] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg0.anInt2693;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray209[arg0.anInt2695] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg0.anInt2693 = local56;
		}
		arg0.aClass4_Sub12_Sub3_3.method1220(this.method1071(arg0));
		arg0.anInt2699++;
		@Pc(122) double local122 = (double) ((arg0.anInt2693 * arg0.anInt2698 >> 12) + (arg0.anInt2702 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(125) Class21 local125 = arg0.aClass21_1;
		arg0.anInt2692 += local125.anInt566;
		if (local125.anInt574 > 0) {
			if (local125.anInt575 > 0) {
				arg0.anInt2700 += (int) (Math.pow(2.0D, local122 * (double) local125.anInt575) * 128.0D + 0.5D);
			} else {
				arg0.anInt2700 += 128;
			}
		}
		@Pc(168) boolean local168 = false;
		if (local125.aByteArray6 != null) {
			if (local125.anInt571 <= 0) {
				arg0.anInt2694 += 128;
			} else {
				arg0.anInt2694 += (int) (Math.pow(2.0D, local122 * (double) local125.anInt571) * 128.0D + 0.5D);
			}
			while (local125.aByteArray6.length - 2 > arg0.anInt2703 && (local125.aByteArray6[arg0.anInt2703 + 2] & 0xFF) << 8 < arg0.anInt2694) {
				arg0.anInt2703 += 2;
			}
			if (arg0.anInt2703 == local125.aByteArray6.length - 2 && local125.aByteArray6[arg0.anInt2703 + 1] == 0) {
				local168 = true;
			}
		}
		if (arg0.anInt2707 >= 0 && local125.aByteArray5 != null && (this.anIntArray219[arg0.anInt2695] & 0x1) == 0 && (arg0.anInt2708 < 0 || arg0 != this.aClass4_Sub23ArrayArray1[arg0.anInt2695][arg0.anInt2708])) {
			if (local125.anInt564 <= 0) {
				arg0.anInt2707 += 128;
			} else {
				arg0.anInt2707 += (int) (Math.pow(2.0D, (double) local125.anInt564 * local122) * 128.0D + 0.5D);
			}
			while (local125.aByteArray5.length - 2 > arg0.anInt2709 && arg0.anInt2707 > (local125.aByteArray5[arg0.anInt2709 + 2] & 0xFF) << 8) {
				arg0.anInt2709 += 2;
			}
			if (local125.aByteArray5.length - 2 == arg0.anInt2709) {
				local168 = true;
			}
		}
		if (!local168) {
			arg0.aClass4_Sub12_Sub3_3.method1204(arg0.anInt2710, this.method1062(arg0), this.method1074(arg0));
			return false;
		}
		arg0.aClass4_Sub12_Sub3_3.method1198(arg0.anInt2710);
		if (arg3 == null) {
			arg0.aClass4_Sub12_Sub3_3.method1693(arg2);
		} else {
			arg0.aClass4_Sub12_Sub3_3.method1697(arg3, arg1, arg2);
		}
		if (arg0.aClass4_Sub12_Sub3_3.method1211()) {
			this.aClass4_Sub12_Sub1_1.aClass4_Sub12_Sub4_2.method1700(arg0.aClass4_Sub12_Sub3_3);
		}
		arg0.method1898();
		if (arg0.anInt2707 >= 0) {
			arg0.method2004();
			if (arg0.anInt2708 > 0 && arg0 == this.aClass4_Sub23ArrayArray1[arg0.anInt2695][arg0.anInt2708]) {
				this.aClass4_Sub23ArrayArray1[arg0.anInt2695][arg0.anInt2708] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)I")
	public int method1086() {
		return this.anInt1625;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(III)V")
	private void method1087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray205[arg1] = arg0;
		this.anIntArray206[arg1] = (int) (Math.pow((double) 2, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V")
	public synchronized void method1089() {
		this.aClass45_1.method1347();
		this.method1083();
	}
}
