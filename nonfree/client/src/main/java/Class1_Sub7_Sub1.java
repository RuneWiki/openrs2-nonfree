import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!di", name = "Db", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!di", name = "Eb", descriptor = "Z")
	private boolean aBoolean116;

	@OriginalMember(owner = "client!di", name = "Fb", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!di", name = "Gb", descriptor = "I")
	private int anInt1317;

	@OriginalMember(owner = "client!di", name = "Hb", descriptor = "I")
	private int anInt1318;

	@OriginalMember(owner = "client!di", name = "Jb", descriptor = "Z")
	private boolean aBoolean117;

	@OriginalMember(owner = "client!di", name = "Kb", descriptor = "I")
	private int anInt1319;

	@OriginalMember(owner = "client!di", name = "Lb", descriptor = "Lclient!hj;")
	private Class1_Sub15 aClass1_Sub15_1;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "[I")
	public final int[] anIntArray163 = new int[16];

	@OriginalMember(owner = "client!di", name = "W", descriptor = "[I")
	private final int[] anIntArray169 = new int[16];

	@OriginalMember(owner = "client!di", name = "v", descriptor = "[I")
	private final int[] anIntArray159 = new int[16];

	@OriginalMember(owner = "client!di", name = "fb", descriptor = "[I")
	private final int[] anIntArray171 = new int[16];

	@OriginalMember(owner = "client!di", name = "ib", descriptor = "I")
	private final int anInt1304 = 1000000;

	@OriginalMember(owner = "client!di", name = "ob", descriptor = "[I")
	private final int[] anIntArray173 = new int[16];

	@OriginalMember(owner = "client!di", name = "I", descriptor = "[I")
	private final int[] anIntArray162 = new int[16];

	@OriginalMember(owner = "client!di", name = "db", descriptor = "[I")
	private final int[] anIntArray170 = new int[16];

	@OriginalMember(owner = "client!di", name = "ab", descriptor = "I")
	private int anInt1298 = 256;

	@OriginalMember(owner = "client!di", name = "N", descriptor = "[I")
	private final int[] anIntArray164 = new int[16];

	@OriginalMember(owner = "client!di", name = "kb", descriptor = "[I")
	private final int[] anIntArray172 = new int[16];

	@OriginalMember(owner = "client!di", name = "sb", descriptor = "[[Lclient!ar;")
	private final Class1_Sub3[][] aClass1_Sub3ArrayArray2 = new Class1_Sub3[16][128];

	@OriginalMember(owner = "client!di", name = "V", descriptor = "[I")
	public final int[] anIntArray168 = new int[16];

	@OriginalMember(owner = "client!di", name = "T", descriptor = "[I")
	private final int[] anIntArray167 = new int[16];

	@OriginalMember(owner = "client!di", name = "nb", descriptor = "[[Lclient!ar;")
	private final Class1_Sub3[][] aClass1_Sub3ArrayArray1 = new Class1_Sub3[16][128];

	@OriginalMember(owner = "client!di", name = "wb", descriptor = "[I")
	private final int[] anIntArray174 = new int[16];

	@OriginalMember(owner = "client!di", name = "w", descriptor = "[I")
	private final int[] anIntArray160 = new int[16];

	@OriginalMember(owner = "client!di", name = "P", descriptor = "[I")
	private final int[] anIntArray165 = new int[16];

	@OriginalMember(owner = "client!di", name = "G", descriptor = "[I")
	private final int[] anIntArray161 = new int[16];

	@OriginalMember(owner = "client!di", name = "Ab", descriptor = "[I")
	public final int[] anIntArray175 = new int[16];

	@OriginalMember(owner = "client!di", name = "pb", descriptor = "Lclient!au;")
	private final Class18 aClass18_1 = new Class18();

	@OriginalMember(owner = "client!di", name = "Ib", descriptor = "Lclient!jf;")
	private final Class1_Sub7_Sub3 aClass1_Sub7_Sub3_1 = new Class1_Sub7_Sub3(this);

	@OriginalMember(owner = "client!di", name = "x", descriptor = "Lclient!fa;")
	private final Class77 aClass77_6 = new Class77(128);

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class1_Sub7_Sub1() {
		this.method1070();
		this.method1067(true);
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(I)Z")
	public synchronized boolean method1055() {
		return this.aClass18_1.method216();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZ)V")
	private void method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anIntArray169[arg1]) {
			this.anIntArray169[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass1_Sub3ArrayArray1[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4405(@OriginalArg(0) int arg0) {
		if (this.aClass18_1.method216()) {
			@Pc(18) int local18 = this.aClass18_1.anInt336 * this.anInt1304 / Static212.anInt3652;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong30;
				if (this.aLong31 - local27 >= 0L) {
					this.aLong30 = local27;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong31 - this.aLong30 - 1L) / (long) local18);
				this.aLong30 += (long) local57 * (long) local18;
				arg0 -= local57;
				this.aClass1_Sub7_Sub3_1.method4405(local57);
				this.method1058();
			} while (this.aClass18_1.method216());
		}
		this.aClass1_Sub7_Sub3_1.method4405(arg0);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V")
	private void method1057(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class1_Sub3 local12 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method202(); local12 != null; local12 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method207()) {
			if ((arg0 < 0 || local12.anInt293 == arg0) && local12.anInt303 < 0) {
				this.aClass1_Sub3ArrayArray2[local12.anInt293][local12.anInt292] = null;
				local12.anInt303 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
	private void method1058() {
		@Pc(8) int local8 = this.anInt1318;
		@Pc(11) int local11 = this.anInt1317;
		@Pc(14) long local14 = this.aLong31;
		if (this.aClass1_Sub15_1 != null && local11 == this.anInt1319) {
			this.method1074(this.aClass1_Sub15_1, this.aBoolean116, this.aBoolean117);
			this.method1058();
			return;
		}
		while (this.anInt1317 == local11) {
			while (local11 == this.aClass18_1.anIntArray33[local8]) {
				this.aClass18_1.method225(local8);
				@Pc(47) int local47 = this.aClass18_1.method222(local8);
				if (local47 == 1) {
					this.aClass18_1.method220();
					this.aClass18_1.method213(local8);
					if (this.aClass18_1.method219()) {
						if (this.aClass1_Sub15_1 != null) {
							this.method1076(this.aClass1_Sub15_1, this.aBoolean116);
							this.method1058();
							return;
						}
						if (!this.aBoolean116 || local11 == 0) {
							this.method1067(true);
							this.aClass18_1.method215();
							return;
						}
						this.aClass18_1.method218(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method1059(local47);
				}
				this.aClass18_1.method224(local8);
				this.aClass18_1.method213(local8);
			}
			local8 = this.aClass18_1.method214();
			local11 = this.aClass18_1.anIntArray33[local8];
			local14 = this.aClass18_1.method223(local11);
		}
		this.anInt1318 = local8;
		this.aLong31 = local14;
		this.anInt1317 = local11;
		if (this.aClass1_Sub15_1 != null && this.anInt1319 < local11) {
			this.anInt1317 = this.anInt1319;
			this.anInt1318 = -1;
			this.aLong31 = this.aClass18_1.method223(this.anInt1317);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
	private void method1059(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1064(local18, local30, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1064(local18, 64, local24);
			} else {
				this.method1075(local24, local18, local30);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1066(local18, local24, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray171[local18] = (this.anIntArray171[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray171[local18] = (this.anIntArray171[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray165[local18] = (local30 << 7) + (this.anIntArray165[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray165[local18] = (this.anIntArray165[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray164[local18] = (local30 << 7) + (this.anIntArray164[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray164[local18] = local30 + (this.anIntArray164[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray161[local18] = (local30 << 7) + (this.anIntArray161[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray161[local18] = (this.anIntArray161[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray172[local18] = (this.anIntArray172[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray172[local18] = (this.anIntArray172[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray167[local18] = (local30 << 7) + (this.anIntArray167[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray167[local18] = local30 + (this.anIntArray167[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray168[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray168[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method1083(local18);
					this.anIntArray168[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray168[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray174[local18] = (local30 << 7) + (this.anIntArray174[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray174[local18] = local30 + (this.anIntArray174[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray174[local18] = (this.anIntArray174[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray174[local18] = (this.anIntArray174[local18] & 0x3F80) + (local30 + 16384);
			}
			if (local24 == 120) {
				this.method1063(local18);
			}
			if (local24 == 121) {
				this.method1089(local18);
			}
			if (local24 == 123) {
				this.method1057(local18);
			}
			@Pc(510) int local510;
			if (local24 == 6) {
				local510 = this.anIntArray174[local18];
				if (local510 == 16384) {
					this.anIntArray162[local18] = (this.anIntArray162[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local510 = this.anIntArray174[local18];
				if (local510 == 16384) {
					this.anIntArray162[local18] = local30 + (this.anIntArray162[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray163[local18] = (local30 << 7) + (this.anIntArray163[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray163[local18] = (this.anIntArray163[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray168[local18] |= 0x4;
				} else {
					this.method1081(local18);
					this.anIntArray168[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1077(local18, (local30 << 7) + (this.anIntArray160[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method1077(local18, local30 + (this.anIntArray160[local18] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1056(this.anIntArray171[local18] + local24, local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1069(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FC3) >> 8);
			this.method1086(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1067(true);
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public synchronized void method1060() {
		this.method1068();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLclient!fj;Lclient!hj;Lclient!ui;I)Z")
	public synchronized boolean method1061(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class1_Sub15 arg1, @OriginalArg(3) Class230 arg2) {
		arg1.method2061();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(34) Class1_Sub1 local34 = (Class1_Sub1) arg1.aClass77_17.method1359(); local34 != null; local34 = (Class1_Sub1) arg1.aClass77_17.method1360()) {
			@Pc(40) int local40 = (int) local34.aLong207;
			@Pc(48) Class1_Sub29 local48 = (Class1_Sub29) this.aClass77_6.method1368((long) local40);
			if (local48 == null) {
				local48 = Static348.method5107(arg2, local40);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass77_6.method1370((long) local40, local48);
			}
			if (!local48.method3077(local20, arg0, local34.aByteArray1)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method2060();
		}
		return local9;
	}

	@OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V")
	public synchronized void method1062() {
		for (@Pc(15) Class1_Sub29 local15 = (Class1_Sub29) this.aClass77_6.method1359(); local15 != null; local15 = (Class1_Sub29) this.aClass77_6.method1360()) {
			local15.method3076();
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "()Lclient!uh;")
	@Override
	public synchronized Class1_Sub7 method4408() {
		return null;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(IB)V")
	private void method1063(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1_Sub3 local8 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method202(); local8 != null; local8 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method207()) {
			if (arg0 < 0 || arg0 == local8.anInt293) {
				if (local8.aClass1_Sub7_Sub2_1 != null) {
					local8.aClass1_Sub7_Sub2_1.method2251(Static212.anInt3652 / 100);
					if (local8.aClass1_Sub7_Sub2_1.method2227()) {
						this.aClass1_Sub7_Sub3_1.aClass1_Sub7_Sub4_1.method4413(local8.aClass1_Sub7_Sub2_1);
					}
					local8.method192();
				}
				if (local8.anInt303 < 0) {
					this.aClass1_Sub3ArrayArray2[local8.anInt293][local8.anInt292] = null;
				}
				local8.method5577();
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4404(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass18_1.method216()) {
			@Pc(14) int local14 = this.anInt1304 * this.aClass18_1.anInt336 / Static212.anInt3652;
			do {
				@Pc(23) long local23 = this.aLong30 + (long) arg2 * (long) local14;
				if (this.aLong31 - local23 >= 0L) {
					this.aLong30 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong31 - this.aLong30 - 1L) / (long) local14);
				this.aLong30 += (long) local14 * (long) local54;
				this.aClass1_Sub7_Sub3_1.method4404(arg0, arg1, local54);
				this.method1058();
				arg1 += local54;
				arg2 -= local54;
			} while (this.aClass18_1.method216());
		}
		this.aClass1_Sub7_Sub3_1.method4404(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)V")
	private void method1064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub3 local12 = this.aClass1_Sub3ArrayArray2[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub3ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray168[arg0] & 0x2) == 0) {
			local12.anInt303 = 0;
			return;
		}
		for (@Pc(44) Class1_Sub3 local44 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method202(); local44 != null; local44 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method207()) {
			if (local12.anInt293 == local44.anInt293 && local44.anInt303 < 0 && local12 != local44) {
				local12.anInt303 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
	public synchronized void method1065(@OriginalArg(1) int arg0) {
		this.anInt1298 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(IIII)V")
	private void method1066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BZ)V")
	private void method1067(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1063(-1);
		} else {
			this.method1057(-1);
		}
		this.method1089(-1);
		for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
			this.anIntArray169[local32] = this.anIntArray159[local32];
		}
		for (@Pc(50) int local50 = 0; local50 < 16; local50++) {
			this.anIntArray171[local50] = this.anIntArray159[local50] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)V")
	private void method1068() {
		this.anIntArray159[9] = 128;
		this.anIntArray171[9] = 128;
		this.method1056(128, 9);
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
	private void method1069(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)V")
	private synchronized void method1070() {
		for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
			this.anIntArray170[local11] = 256;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!ar;Z)V")
	public void method1071(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass1_Sub31_Sub1_1.aByteArray84.length;
		@Pc(31) int local31;
		if (arg1 && arg0.aClass1_Sub31_Sub1_1.aBoolean533) {
			@Pc(42) int local42 = local12 + local12 - arg0.aClass1_Sub31_Sub1_1.anInt5827;
			local12 <<= 0x8;
			local31 = (int) ((long) local42 * (long) this.anIntArray163[arg0.anInt293] >> 6);
			if (local31 >= local12) {
				arg0.aClass1_Sub7_Sub2_1.method2263();
				local31 = local12 + local12 - local31 - 1;
			}
		} else {
			local31 = (int) ((long) local12 * (long) this.anIntArray163[arg0.anInt293] >> 6);
		}
		arg0.aClass1_Sub7_Sub2_1.method2244(local31);
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(ZI)V")
	private synchronized void method1072(@OriginalArg(0) boolean arg0) {
		this.aClass18_1.method215();
		this.aClass1_Sub15_1 = null;
		this.method1067(arg0);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!hj;IZZ)V")
	private synchronized void method1074(@OriginalArg(0) Class1_Sub15 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method1072(arg2);
		this.aClass18_1.method226(arg0.aByteArray41);
		this.aBoolean116 = arg1;
		this.aLong30 = 0L;
		@Pc(33) int local33 = this.aClass18_1.method227();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			this.aClass18_1.method225(local35);
			this.aClass18_1.method224(local35);
			this.aClass18_1.method213(local35);
		}
		this.anInt1318 = this.aClass18_1.method214();
		this.anInt1317 = this.aClass18_1.anIntArray33[this.anInt1318];
		this.aLong31 = this.aClass18_1.method223(this.anInt1317);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIII)V")
	private void method1075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1064(arg1, 64, arg0);
		if ((this.anIntArray168[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub3 local28 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method200(); local28 != null; local28 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method197()) {
				if (local28.anInt293 == arg1 && local28.anInt303 < 0) {
					this.aClass1_Sub3ArrayArray2[arg1][local28.anInt292] = null;
					this.aClass1_Sub3ArrayArray2[arg1][arg0] = local28;
					@Pc(70) int local70 = (local28.anInt298 * local28.anInt313 >> 12) + local28.anInt310;
					local28.anInt310 += arg0 - local28.anInt292 << 8;
					local28.anInt313 = 4096;
					local28.anInt298 = local70 - local28.anInt310;
					local28.anInt292 = arg0;
					return;
				}
			}
		}
		@Pc(115) Class1_Sub29 local115 = (Class1_Sub29) this.aClass77_6.method1368((long) this.anIntArray169[arg1]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class1_Sub31_Sub1 local123 = local115.aClass1_Sub31_Sub1Array1[arg0];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class1_Sub3 local130 = new Class1_Sub3();
		local130.aClass1_Sub29_1 = local115;
		local130.anInt293 = arg1;
		local130.aClass1_Sub31_Sub1_1 = local123;
		local130.aClass218_1 = local115.aClass218Array1[arg0];
		local130.anInt311 = local115.aByteArray67[arg0];
		local130.anInt292 = arg0;
		local130.anInt312 = arg2 * arg2 * local115.anInt3770 * local115.aByteArray66[arg0] + 1024 >> 11;
		local130.anInt300 = local115.aByteArray65[arg0] & 0xFF;
		local130.anInt310 = (arg0 << 8) - (local115.aShortArray82[arg0] & 0x7FFF);
		local130.anInt299 = 0;
		local130.anInt295 = 0;
		local130.anInt302 = 0;
		local130.anInt291 = 0;
		local130.anInt303 = -1;
		if (this.anIntArray163[arg1] == 0) {
			local130.aClass1_Sub7_Sub2_1 = Static399.method2243(local123, this.method1082(local130), this.method1084(local130), this.method1088(local130));
		} else {
			local130.aClass1_Sub7_Sub2_1 = Static399.method2243(local123, this.method1082(local130), 0, this.method1088(local130));
			this.method1071(local130, local115.aShortArray82[arg0] < 0);
		}
		if (local115.aShortArray82[arg0] < 0) {
			local130.aClass1_Sub7_Sub2_1.method2238(-1);
		}
		if (local130.anInt311 >= 0) {
			@Pc(290) Class1_Sub3 local290 = this.aClass1_Sub3ArrayArray1[arg1][local130.anInt311];
			if (local290 != null && local290.anInt303 < 0) {
				this.aClass1_Sub3ArrayArray2[arg1][local290.anInt292] = null;
				local290.anInt303 = 0;
			}
			this.aClass1_Sub3ArrayArray1[arg1][local130.anInt311] = local130;
		}
		this.aClass1_Sub7_Sub3_1.aClass17_29.method199(local130);
		this.aClass1_Sub3ArrayArray2[arg1][arg0] = local130;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!hj;ZI)V")
	public synchronized void method1076(@OriginalArg(0) Class1_Sub15 arg0, @OriginalArg(1) boolean arg1) {
		this.method1074(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZII)V")
	private void method1077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray160[arg0] = arg1;
		this.anIntArray175[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I")
	public int method1078() {
		return this.anInt1298;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
	public synchronized void method1079() {
		this.method1072(true);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ar;B)Z")
	public boolean method1080(@OriginalArg(0) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub7_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt303 >= 0) {
			arg0.method5577();
			if (arg0.anInt311 > 0 && arg0 == this.aClass1_Sub3ArrayArray1[arg0.anInt293][arg0.anInt311]) {
				this.aClass1_Sub3ArrayArray1[arg0.anInt293][arg0.anInt311] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)V")
	private void method1081(@OriginalArg(1) int arg0) {
		if ((this.anIntArray168[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class1_Sub3 local22 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method202(); local22 != null; local22 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method207()) {
			if (arg0 == local22.anInt293) {
				local22.anInt305 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(Lclient!ar;B)I")
	private int method1082(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(14) int local14 = (arg0.anInt313 * arg0.anInt298 >> 12) + arg0.anInt310;
		local14 += this.anIntArray162[arg0.anInt293] * (this.anIntArray173[arg0.anInt293] - 8192) >> 12;
		@Pc(35) Class218 local35 = arg0.aClass218_1;
		@Pc(66) int local66;
		if (local35.anInt5570 > 0 && (local35.anInt5566 > 0 || this.anIntArray165[arg0.anInt293] > 0)) {
			local66 = local35.anInt5566 << 2;
			@Pc(71) int local71 = local35.anInt5575 << 1;
			if (local71 > arg0.anInt309) {
				local66 = arg0.anInt309 * local66 / local71;
			}
			local66 += this.anIntArray165[arg0.anInt293] >> 7;
			@Pc(105) double local105 = Math.sin((double) (arg0.anInt301 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local66 * local105);
		}
		local66 = (int) ((double) (arg0.aClass1_Sub31_Sub1_1.anInt5825 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static212.anInt3652 + 0.5D);
		return local66 >= 1 ? local66 : 1;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "()Lclient!uh;")
	@Override
	public synchronized Class1_Sub7 method4407() {
		return this.aClass1_Sub7_Sub3_1;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)V")
	private void method1083(@OriginalArg(1) int arg0) {
		if ((this.anIntArray168[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub3 local18 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method202(); local18 != null; local18 = (Class1_Sub3) this.aClass1_Sub7_Sub3_1.aClass17_29.method207()) {
			if (local18.anInt293 == arg0 && this.aClass1_Sub3ArrayArray2[arg0][local18.anInt292] == null && local18.anInt303 < 0) {
				local18.anInt303 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!ar;)I")
	private int method1084(@OriginalArg(1) Class1_Sub3 arg0) {
		if (this.anIntArray170[arg0.anInt293] == 0) {
			return 0;
		}
		@Pc(17) Class218 local17 = arg0.aClass218_1;
		@Pc(33) int local33 = this.anIntArray161[arg0.anInt293] * this.anIntArray167[arg0.anInt293] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(55) int local55 = local41 * arg0.anInt312 + 16384 >> 15;
		@Pc(64) int local64 = local55 * this.anInt1298 + 128 >> 8;
		local33 = this.anIntArray170[arg0.anInt293] * local64 + 128 >> 8;
		if (local17.anInt5574 > 0) {
			local33 = (int) ((double) local33 * Math.pow(0.5D, (double) local17.anInt5574 * (double) arg0.anInt299 * 1.953125E-5D) + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(129) int local129;
		@Pc(141) int local141;
		if (local17.aByteArray81 != null) {
			local103 = arg0.anInt302;
			local111 = local17.aByteArray81[arg0.anInt291 + 1];
			if (local17.aByteArray81.length - 2 > arg0.anInt291) {
				local129 = (local17.aByteArray81[arg0.anInt291] & 0xFF) << 8;
				local141 = (local17.aByteArray81[arg0.anInt291 + 2] & 0xFF) << 8;
				local111 += (local103 - local129) * (-local111 + local17.aByteArray81[arg0.anInt291 + 3]) / (local141 - local129);
			}
			local33 = local111 * local33 + 32 >> 6;
		}
		if (arg0.anInt303 > 0 && local17.aByteArray80 != null) {
			local103 = arg0.anInt303;
			local111 = local17.aByteArray80[arg0.anInt295 + 1];
			if (local17.aByteArray80.length - 2 > arg0.anInt295) {
				local129 = (local17.aByteArray80[arg0.anInt295] & 0xFF) << 8;
				local141 = (local17.aByteArray80[arg0.anInt295 + 2] & 0xFF) << 8;
				local111 += (local17.aByteArray80[arg0.anInt295 + 3] - local111) * (-local129 + local103) / (local141 - local129);
			}
			local33 = local33 * local111 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "()I")
	@Override
	public synchronized int method4409() {
		return 0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I[IIILclient!ar;)Z")
	public boolean method1085(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub3 arg3) {
		arg3.anInt308 = Static212.anInt3652 / 100;
		if (arg3.anInt303 >= 0 && (arg3.aClass1_Sub7_Sub2_1 == null || arg3.aClass1_Sub7_Sub2_1.method2253())) {
			arg3.method192();
			arg3.method5577();
			if (arg3.anInt311 > 0 && arg3 == this.aClass1_Sub3ArrayArray1[arg3.anInt293][arg3.anInt311]) {
				this.aClass1_Sub3ArrayArray1[arg3.anInt293][arg3.anInt311] = null;
			}
			return true;
		}
		@Pc(64) int local64 = arg3.anInt313;
		if (local64 > 0) {
			local64 -= (int) (Math.pow(2.0D, (double) this.anIntArray164[arg3.anInt293] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local64 < 0) {
				local64 = 0;
			}
			arg3.anInt313 = local64;
		}
		arg3.aClass1_Sub7_Sub2_1.method2264(this.method1082(arg3));
		@Pc(104) Class218 local104 = arg3.aClass218_1;
		arg3.anInt301 += local104.anInt5570;
		@Pc(113) boolean local113 = false;
		arg3.anInt309++;
		@Pc(138) double local138 = (double) ((arg3.anInt292 - 60 << 8) + (arg3.anInt298 * arg3.anInt313 >> 12)) * 5.086263020833333E-6D;
		if (local104.anInt5574 > 0) {
			if (local104.anInt5565 > 0) {
				arg3.anInt299 += (int) (Math.pow(2.0D, local138 * (double) local104.anInt5565) * 128.0D + 0.5D);
			} else {
				arg3.anInt299 += 128;
			}
			if (local104.anInt5574 * arg3.anInt299 >= 819200) {
				local113 = true;
			}
		}
		if (local104.aByteArray81 != null) {
			if (local104.anInt5564 <= 0) {
				arg3.anInt302 += 128;
			} else {
				arg3.anInt302 += (int) (Math.pow(2.0D, local138 * (double) local104.anInt5564) * 128.0D + 0.5D);
			}
			while (arg3.anInt291 < local104.aByteArray81.length - 2 && arg3.anInt302 > (local104.aByteArray81[arg3.anInt291 + 2] & 0xFF) << 8) {
				arg3.anInt291 += 2;
			}
			if (arg3.anInt291 == local104.aByteArray81.length - 2 && local104.aByteArray81[arg3.anInt291 + 1] == 0) {
				local113 = true;
			}
		}
		if (arg3.anInt303 >= 0 && local104.aByteArray80 != null && (this.anIntArray168[arg3.anInt293] & 0x1) == 0 && (arg3.anInt311 < 0 || this.aClass1_Sub3ArrayArray1[arg3.anInt293][arg3.anInt311] != arg3)) {
			if (local104.anInt5569 > 0) {
				arg3.anInt303 += (int) (Math.pow(2.0D, (double) local104.anInt5569 * local138) * 128.0D + 0.5D);
			} else {
				arg3.anInt303 += 128;
			}
			while (arg3.anInt295 < local104.aByteArray80.length - 2 && (local104.aByteArray80[arg3.anInt295 + 2] & 0xFF) << 8 < arg3.anInt303) {
				arg3.anInt295 += 2;
			}
			if (local104.aByteArray80.length - 2 == arg3.anInt295) {
				local113 = true;
			}
		}
		if (!local113) {
			arg3.aClass1_Sub7_Sub2_1.method2249(arg3.anInt308, this.method1084(arg3), this.method1088(arg3));
			return false;
		}
		arg3.aClass1_Sub7_Sub2_1.method2251(arg3.anInt308);
		if (arg0 == null) {
			arg3.aClass1_Sub7_Sub2_1.method4405(arg1);
		} else {
			arg3.aClass1_Sub7_Sub2_1.method4404(arg0, arg2, arg1);
		}
		if (arg3.aClass1_Sub7_Sub2_1.method2227()) {
			this.aClass1_Sub7_Sub3_1.aClass1_Sub7_Sub4_1.method4413(arg3.aClass1_Sub7_Sub2_1);
		}
		arg3.method192();
		if (arg3.anInt303 >= 0) {
			arg3.method5577();
			if (arg3.anInt311 > 0 && arg3 == this.aClass1_Sub3ArrayArray1[arg3.anInt293][arg3.anInt311]) {
				this.aClass1_Sub3ArrayArray1[arg3.anInt293][arg3.anInt311] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(IIZ)V")
	private void method1086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray173[arg0] = arg1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
	public synchronized void method1087() {
		for (@Pc(7) Class1_Sub29 local7 = (Class1_Sub29) this.aClass77_6.method1359(); local7 != null; local7 = (Class1_Sub29) this.aClass77_6.method1360()) {
			local7.method5577();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ar;I)I")
	private int method1088(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(14) int local14 = this.anIntArray172[arg0.anInt293];
		return local14 >= 8192 ? 16384 - ((128 - arg0.anInt300) * (16384 - local14) + 32 >> 6) : local14 * arg0.anInt300 + 32 >> 6;
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(II)V")
	private void method1089(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1089(local9);
			}
			return;
		}
		this.anIntArray161[arg0] = 12800;
		this.anIntArray172[arg0] = 8192;
		this.anIntArray167[arg0] = 16383;
		this.anIntArray173[arg0] = 8192;
		this.anIntArray165[arg0] = 0;
		this.anIntArray164[arg0] = 8192;
		this.method1083(arg0);
		this.method1081(arg0);
		this.anIntArray168[arg0] = 0;
		this.anIntArray174[arg0] = 32767;
		this.anIntArray162[arg0] = 256;
		this.anIntArray163[arg0] = 0;
		this.method1077(arg0, 8192);
	}
}
