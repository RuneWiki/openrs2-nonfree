import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class4_Sub6_Sub2 extends Class4_Sub6 {

	@OriginalMember(owner = "client!co", name = "Hb", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!co", name = "Ib", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!co", name = "Jb", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!co", name = "Kb", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!co", name = "Lb", descriptor = "Z")
	private boolean aBoolean60;

	@OriginalMember(owner = "client!co", name = "Nb", descriptor = "Z")
	private boolean aBoolean61;

	@OriginalMember(owner = "client!co", name = "Ob", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!co", name = "Pb", descriptor = "Lclient!gb;")
	private Class4_Sub14 aClass4_Sub14_1;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "[I")
	public int[] anIntArray96 = new int[16];

	@OriginalMember(owner = "client!co", name = "S", descriptor = "[I")
	public int[] anIntArray99 = new int[16];

	@OriginalMember(owner = "client!co", name = "v", descriptor = "[I")
	private int[] anIntArray95 = new int[16];

	@OriginalMember(owner = "client!co", name = "R", descriptor = "[I")
	private int[] anIntArray98 = new int[16];

	@OriginalMember(owner = "client!co", name = "z", descriptor = "I")
	private int anInt884 = 1000000;

	@OriginalMember(owner = "client!co", name = "u", descriptor = "[I")
	private int[] anIntArray94 = new int[16];

	@OriginalMember(owner = "client!co", name = "fb", descriptor = "[[Lclient!b;")
	private Class4_Sub3[][] aClass4_Sub3ArrayArray2 = new Class4_Sub3[16][128];

	@OriginalMember(owner = "client!co", name = "jb", descriptor = "[I")
	private int[] anIntArray105 = new int[16];

	@OriginalMember(owner = "client!co", name = "mb", descriptor = "[I")
	private int[] anIntArray107 = new int[16];

	@OriginalMember(owner = "client!co", name = "eb", descriptor = "[I")
	private int[] anIntArray104 = new int[16];

	@OriginalMember(owner = "client!co", name = "cb", descriptor = "[I")
	private int[] anIntArray103 = new int[16];

	@OriginalMember(owner = "client!co", name = "Z", descriptor = "[I")
	private int[] anIntArray102 = new int[16];

	@OriginalMember(owner = "client!co", name = "Y", descriptor = "[I")
	private int[] anIntArray101 = new int[16];

	@OriginalMember(owner = "client!co", name = "vb", descriptor = "I")
	private int anInt916 = 256;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "[I")
	private int[] anIntArray93 = new int[16];

	@OriginalMember(owner = "client!co", name = "G", descriptor = "[I")
	private int[] anIntArray97 = new int[16];

	@OriginalMember(owner = "client!co", name = "F", descriptor = "[[Lclient!b;")
	private Class4_Sub3[][] aClass4_Sub3ArrayArray1 = new Class4_Sub3[16][128];

	@OriginalMember(owner = "client!co", name = "lb", descriptor = "[I")
	private int[] anIntArray106 = new int[16];

	@OriginalMember(owner = "client!co", name = "V", descriptor = "[I")
	private int[] anIntArray100 = new int[16];

	@OriginalMember(owner = "client!co", name = "Gb", descriptor = "[I")
	public int[] anIntArray109 = new int[16];

	@OriginalMember(owner = "client!co", name = "X", descriptor = "Lclient!mb;")
	private Class104 aClass104_1 = new Class104();

	@OriginalMember(owner = "client!co", name = "Mb", descriptor = "Lclient!gn;")
	private Class4_Sub6_Sub3 aClass4_Sub6_Sub3_1 = new Class4_Sub6_Sub3(this);

	@OriginalMember(owner = "client!co", name = "yb", descriptor = "Lclient!tm;")
	private Class163 aClass163_13 = new Class163(128);

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub2() {
		this.method832();
		this.method835(true);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method3728(@OriginalArg(0) int arg0) {
		if (this.aClass104_1.method2625()) {
			@Pc(14) int local14 = this.aClass104_1.anInt3315 * this.anInt884 / Static75.anInt1523;
			do {
				@Pc(23) long local23 = this.aLong29 + (long) local14 * (long) arg0;
				if (this.aLong30 - local23 >= 0L) {
					this.aLong29 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong30 + (long) local14 - this.aLong29 - 1L) / (long) local14);
				arg0 -= local54;
				this.aLong29 += (long) local54 * (long) local14;
				this.aClass4_Sub6_Sub3_1.method3728(local54);
				this.method836();
			} while (this.aClass104_1.method2625());
		}
		this.aClass4_Sub6_Sub3_1.method3728(arg0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	private void method817(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(31) int local31;
		if (local5 == 128) {
			local21 = arg0 >> 8 & 0x7F;
			local25 = arg0 & 0xF;
			local31 = arg0 >> 16 & 0x7F;
			this.method837(local31, local21, local25);
		} else if (local5 == 144) {
			local31 = arg0 >> 16 & 0x7F;
			local25 = arg0 & 0xF;
			local21 = arg0 >> 8 & 0x7F;
			if (local31 <= 0) {
				this.method837(64, local21, local25);
			} else {
				this.method822(local25, local31, local21);
			}
		} else {
			@Pc(101) int local101;
			if (local5 == 160) {
				local31 = arg0 >> 8 & 0x7F;
				local101 = arg0 >> 16 & 0x7F;
				local21 = arg0 & 0xF;
				this.method841(local21, local31, local101);
			} else if (local5 == 176) {
				local21 = arg0 & 0xF;
				local31 = arg0 >> 8 & 0x7F;
				local101 = arg0 >> 16 & 0x7F;
				if (local31 == 0) {
					this.anIntArray103[local21] = (this.anIntArray103[local21] & 0xFFE03FFF) + (local101 << 14);
				}
				if (local31 == 32) {
					this.anIntArray103[local21] = (this.anIntArray103[local21] & 0xFFFFC07F) + (local101 << 7);
				}
				if (local31 == 1) {
					this.anIntArray107[local21] = (this.anIntArray107[local21] & 0xFFFFC07F) + (local101 << 7);
				}
				if (local31 == 33) {
					this.anIntArray107[local21] = local101 + (this.anIntArray107[local21] & 0xFFFFFF80);
				}
				if (local31 == 5) {
					this.anIntArray106[local21] = (local101 << 7) + (this.anIntArray106[local21] & 0xFFFFC07F);
				}
				if (local31 == 37) {
					this.anIntArray106[local21] = (this.anIntArray106[local21] & 0xFFFFFF80) + local101;
				}
				if (local31 == 7) {
					this.anIntArray101[local21] = (local101 << 7) + (this.anIntArray101[local21] & 0xFFFFC07F);
				}
				if (local31 == 39) {
					this.anIntArray101[local21] = (this.anIntArray101[local21] & 0xFFFFFF80) + local101;
				}
				if (local31 == 10) {
					this.anIntArray102[local21] = (local101 << 7) + (this.anIntArray102[local21] & 0xFFFFC07F);
				}
				if (local31 == 42) {
					this.anIntArray102[local21] = (this.anIntArray102[local21] & 0xFFFFFF80) + local101;
				}
				if (local31 == 11) {
					this.anIntArray105[local21] = (local101 << 7) + (this.anIntArray105[local21] & 0xFFFFC07F);
				}
				if (local31 == 43) {
					this.anIntArray105[local21] = (this.anIntArray105[local21] & 0xFFFFFF80) + local101;
				}
				if (local31 == 64) {
					if (local101 < 64) {
						this.anIntArray109[local21] &= 0xFFFFFFFE;
					} else {
						this.anIntArray109[local21] |= 0x1;
					}
				}
				if (local31 == 65) {
					if (local101 >= 64) {
						this.anIntArray109[local21] |= 0x2;
					} else {
						this.method821(local21);
						this.anIntArray109[local21] &= 0xFFFFFFFD;
					}
				}
				if (local31 == 99) {
					this.anIntArray93[local21] = (local101 << 7) + (this.anIntArray93[local21] & 0x7F);
				}
				if (local31 == 98) {
					this.anIntArray93[local21] = local101 + (this.anIntArray93[local21] & 0x3F80);
				}
				if (local31 == 101) {
					this.anIntArray93[local21] = (this.anIntArray93[local21] & 0x7F) + (local101 << 7) + 16384;
				}
				if (local31 == 100) {
					this.anIntArray93[local21] = (this.anIntArray93[local21] & 0x3F80) + local101 + 16384;
				}
				if (local31 == 120) {
					this.method823(local21);
				}
				if (local31 == 121) {
					this.method840(local21);
				}
				if (local31 == 123) {
					this.method819(local21);
				}
				@Pc(520) int local520;
				if (local31 == 6) {
					local520 = this.anIntArray93[local21];
					if (local520 == 16384) {
						this.anIntArray104[local21] = (this.anIntArray104[local21] & 0xFFFFC07F) + (local101 << 7);
					}
				}
				if (local31 == 38) {
					local520 = this.anIntArray93[local21];
					if (local520 == 16384) {
						this.anIntArray104[local21] = (this.anIntArray104[local21] & 0xFFFFFF80) + local101;
					}
				}
				if (local31 == 16) {
					this.anIntArray96[local21] = (local101 << 7) + (this.anIntArray96[local21] & 0xFFFFC07F);
				}
				if (local31 == 48) {
					this.anIntArray96[local21] = (this.anIntArray96[local21] & 0xFFFFFF80) + local101;
				}
				if (local31 == 81) {
					if (local101 >= 64) {
						this.anIntArray109[local21] |= 0x4;
					} else {
						this.method850(local21);
						this.anIntArray109[local21] &= 0xFFFFFFFB;
					}
				}
				if (local31 == 17) {
					this.method845(local21, (this.anIntArray95[local21] & 0xFFFFC07F) + (local101 << 7));
				}
				if (local31 == 49) {
					this.method845(local21, local101 + (this.anIntArray95[local21] & 0xFFFFFF80));
				}
			} else if (local5 == 192) {
				local21 = arg0 & 0xF;
				local31 = arg0 >> 8 & 0x7F;
				this.method854(this.anIntArray103[local21] + local31, local21);
			} else if (local5 == 208) {
				local21 = arg0 & 0xF;
				local31 = arg0 >> 8 & 0x7F;
				this.method851(local31, local21);
			} else if (local5 == 224) {
				local31 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0185) >> 9);
				local21 = arg0 & 0xF;
				this.method831(local21, local31);
			} else {
				local5 = arg0 & 0xFF;
				if (local5 == 255) {
					this.method835(true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!cd;Lclient!gb;Lclient!cg;)Z")
	public synchronized boolean method818(@OriginalArg(2) Class20 arg0, @OriginalArg(3) Class4_Sub14 arg1, @OriginalArg(4) Class22 arg2) {
		arg1.method1442();
		@Pc(14) boolean local14 = true;
		@Pc(25) int[] local25 = new int[] { 22050 };
		for (@Pc(31) Class4_Sub31 local31 = (Class4_Sub31) arg1.aClass163_19.method4192(); local31 != null; local31 = (Class4_Sub31) arg1.aClass163_19.method4183()) {
			@Pc(37) int local37 = (int) local31.aLong211;
			@Pc(45) Class4_Sub32 local45 = (Class4_Sub32) this.aClass163_13.method4188((long) local37);
			if (local45 == null) {
				local45 = Static248.method3799(local37, arg2);
				if (local45 == null) {
					local14 = false;
					continue;
				}
				this.aClass163_13.method4181((long) local37, local45);
			}
			if (!local45.method4561(local31.aByteArray72, arg0, local25)) {
				local14 = false;
			}
		}
		if (local14) {
			arg1.method1441();
		}
		return local14;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)V")
	private void method819(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class4_Sub3 local12 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method613(); local12 != null; local12 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method607()) {
			if ((arg0 < 0 || arg0 == local12.anInt344) && local12.anInt351 < 0) {
				this.aClass4_Sub3ArrayArray1[local12.anInt344][local12.anInt361] = null;
				local12.anInt351 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!b;I)Z")
	public boolean method820(@OriginalArg(0) Class4_Sub3 arg0) {
		if (arg0.aClass4_Sub6_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt351 >= 0) {
			arg0.method4690();
			if (arg0.anInt349 > 0 && this.aClass4_Sub3ArrayArray2[arg0.anInt344][arg0.anInt349] == arg0) {
				this.aClass4_Sub3ArrayArray2[arg0.anInt344][arg0.anInt349] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(II)V")
	private void method821(@OriginalArg(0) int arg0) {
		if ((this.anIntArray109[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub3 local18 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method613(); local18 != null; local18 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method607()) {
			if (arg0 == local18.anInt344 && this.aClass4_Sub3ArrayArray1[arg0][local18.anInt361] == null && local18.anInt351 < 0) {
				local18.anInt351 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBII)V")
	private void method822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method837(64, arg2, arg0);
		if ((this.anIntArray109[arg0] & 0x2) != 0) {
			for (@Pc(28) Class4_Sub3 local28 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method609(); local28 != null; local28 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method614()) {
				if (arg0 == local28.anInt344 && local28.anInt351 < 0) {
					this.aClass4_Sub3ArrayArray1[arg0][local28.anInt361] = null;
					this.aClass4_Sub3ArrayArray1[arg0][arg2] = local28;
					@Pc(64) int local64 = (local28.anInt357 * local28.anInt363 >> 12) + local28.anInt352;
					local28.anInt352 += arg2 - local28.anInt361 << 8;
					local28.anInt357 = local64 - local28.anInt352;
					local28.anInt363 = 4096;
					local28.anInt361 = arg2;
					return;
				}
			}
		}
		@Pc(110) Class4_Sub32 local110 = (Class4_Sub32) this.aClass163_13.method4188((long) this.anIntArray100[arg0]);
		if (local110 == null) {
			return;
		}
		@Pc(119) Class4_Sub5_Sub1 local119 = local110.aClass4_Sub5_Sub1Array1[arg2];
		if (local119 == null) {
			return;
		}
		@Pc(127) Class4_Sub3 local127 = new Class4_Sub3();
		local127.aClass4_Sub5_Sub1_1 = local119;
		local127.aClass4_Sub32_1 = local110;
		local127.anInt344 = arg0;
		local127.aClass36_1 = local110.aClass36Array1[arg2];
		local127.anInt349 = local110.aByteArray75[arg2];
		local127.anInt361 = arg2;
		local127.anInt355 = local110.anInt5687 * arg1 * arg1 * local110.aByteArray76[arg2] + 1024 >> 11;
		local127.anInt347 = local110.aByteArray74[arg2] & 0xFF;
		local127.anInt352 = (arg2 << 8) - (local110.aShortArray94[arg2] & 0x7FFF);
		local127.anInt366 = 0;
		local127.anInt353 = 0;
		local127.anInt351 = -1;
		local127.anInt354 = 0;
		local127.anInt365 = 0;
		if (this.anIntArray96[arg0] == 0) {
			local127.aClass4_Sub6_Sub1_1 = Static310.method520(local119, this.method853(local127), this.method834(local127), this.method838(local127));
		} else {
			local127.aClass4_Sub6_Sub1_1 = Static310.method520(local119, this.method853(local127), 0, this.method838(local127));
			this.method824(local127, local110.aShortArray94[arg2] < 0);
		}
		if (local110.aShortArray94[arg2] < 0) {
			local127.aClass4_Sub6_Sub1_1.method492(-1);
		}
		if (local127.anInt349 >= 0) {
			@Pc(284) Class4_Sub3 local284 = this.aClass4_Sub3ArrayArray2[arg0][local127.anInt349];
			if (local284 != null && local284.anInt351 < 0) {
				this.aClass4_Sub3ArrayArray1[arg0][local284.anInt361] = null;
				local284.anInt351 = 0;
			}
			this.aClass4_Sub3ArrayArray2[arg0][local127.anInt349] = local127;
		}
		this.aClass4_Sub6_Sub3_1.aClass17_14.method619(local127);
		this.aClass4_Sub3ArrayArray1[arg0][arg2] = local127;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "()Lclient!mj;")
	@Override
	public synchronized Class4_Sub6 method3727() {
		return this.aClass4_Sub6_Sub3_1;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(II)V")
	private void method823(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class4_Sub3 local15 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method613(); local15 != null; local15 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method607()) {
			if (arg0 < 0 || local15.anInt344 == arg0) {
				if (local15.aClass4_Sub6_Sub1_1 != null) {
					local15.aClass4_Sub6_Sub1_1.method514(Static75.anInt1523 / 100);
					if (local15.aClass4_Sub6_Sub1_1.method502()) {
						this.aClass4_Sub6_Sub3_1.aClass4_Sub6_Sub4_2.method3731(local15.aClass4_Sub6_Sub1_1);
					}
					local15.method287();
				}
				if (local15.anInt351 < 0) {
					this.aClass4_Sub3ArrayArray1[local15.anInt344][local15.anInt361] = null;
				}
				local15.method4690();
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!b;ZI)V")
	public void method824(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass4_Sub5_Sub1_1.aByteArray57.length;
		@Pc(49) int local49;
		if (arg1 && arg0.aClass4_Sub5_Sub1_1.aBoolean295) {
			@Pc(32) int local32 = local8 + local8 - arg0.aClass4_Sub5_Sub1_1.anInt4735;
			local8 <<= 0x8;
			local49 = (int) ((long) this.anIntArray96[arg0.anInt344] * (long) local32 >> 6);
			if (local8 <= local49) {
				local49 = local8 + local8 - local49 - 1;
				arg0.aClass4_Sub6_Sub1_1.method496();
			}
		} else {
			local49 = (int) ((long) local8 * (long) this.anIntArray96[arg0.anInt344] >> 6);
		}
		arg0.aClass4_Sub6_Sub1_1.method488(local49);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
	public synchronized void method825(@OriginalArg(0) int arg0) {
		this.anInt916 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!gb;IZ)V")
	public synchronized void method826(@OriginalArg(0) Class4_Sub14 arg0, @OriginalArg(2) boolean arg1) {
		this.method829(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
	public synchronized void method827() {
		this.method828();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBI)V")
	private void method828() {
		this.anIntArray98[9] = 128;
		this.anIntArray103[9] = 128;
		this.method854(128, 9);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLclient!gb;ZI)V")
	private synchronized void method829(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub14 arg1, @OriginalArg(2) boolean arg2) {
		this.method849(arg0);
		this.aClass104_1.method2620(arg1.aByteArray21);
		this.aLong29 = 0L;
		this.aBoolean60 = arg2;
		@Pc(26) int local26 = this.aClass104_1.method2628();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			this.aClass104_1.method2618(local28);
			this.aClass104_1.method2617(local28);
			this.aClass104_1.method2626(local28);
		}
		this.anInt924 = this.aClass104_1.method2614();
		this.anInt925 = this.aClass104_1.anIntArray276[this.anInt924];
		this.aLong30 = this.aClass104_1.method2624(this.anInt925);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(III)V")
	private void method831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray94[arg0] = arg1;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(III)V")
	private synchronized void method832() {
		for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
			this.anIntArray97[local24] = 256;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[IBILclient!b;)Z")
	public boolean method833(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub3 arg3) {
		arg3.anInt358 = Static75.anInt1523 / 100;
		if (arg3.anInt351 >= 0 && (arg3.aClass4_Sub6_Sub1_1 == null || arg3.aClass4_Sub6_Sub1_1.method497())) {
			arg3.method287();
			arg3.method4690();
			if (arg3.anInt349 > 0 && this.aClass4_Sub3ArrayArray2[arg3.anInt344][arg3.anInt349] == arg3) {
				this.aClass4_Sub3ArrayArray2[arg3.anInt344][arg3.anInt349] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg3.anInt363;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray106[arg3.anInt344] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg3.anInt363 = local59;
		}
		arg3.aClass4_Sub6_Sub1_1.method512(this.method853(arg3));
		arg3.anInt362++;
		@Pc(104) Class36 local104 = arg3.aClass36_1;
		@Pc(106) boolean local106 = false;
		@Pc(124) double local124 = (double) ((arg3.anInt357 * arg3.anInt363 >> 12) + (arg3.anInt361 - 60 << 8)) * 5.086263020833333E-6D;
		arg3.anInt346 += local104.anInt1261;
		if (local104.anInt1263 > 0) {
			if (local104.anInt1260 > 0) {
				arg3.anInt365 += (int) (Math.pow(2.0D, (double) local104.anInt1260 * local124) * 128.0D + 0.5D);
			} else {
				arg3.anInt365 += 128;
			}
			if (local104.anInt1263 * arg3.anInt365 >= 819200) {
				local106 = true;
			}
		}
		if (local104.aByteArray15 != null) {
			if (local104.anInt1256 > 0) {
				arg3.anInt354 += (int) (Math.pow(2.0D, (double) local104.anInt1256 * local124) * 128.0D + 0.5D);
			} else {
				arg3.anInt354 += 128;
			}
			while (arg3.anInt366 < local104.aByteArray15.length - 2 && arg3.anInt354 > (local104.aByteArray15[arg3.anInt366 + 2] & 0xFF) << 8) {
				arg3.anInt366 += 2;
			}
			if (arg3.anInt366 == local104.aByteArray15.length - 2 && local104.aByteArray15[arg3.anInt366 + 1] == 0) {
				local106 = true;
			}
		}
		if (arg3.anInt351 >= 0 && local104.aByteArray16 != null && (this.anIntArray109[arg3.anInt344] & 0x1) == 0 && (arg3.anInt349 < 0 || this.aClass4_Sub3ArrayArray2[arg3.anInt344][arg3.anInt349] != arg3)) {
			if (local104.anInt1257 <= 0) {
				arg3.anInt351 += 128;
			} else {
				arg3.anInt351 += (int) (Math.pow(2.0D, (double) local104.anInt1257 * local124) * 128.0D + 0.5D);
			}
			while (arg3.anInt353 < local104.aByteArray16.length - 2 && arg3.anInt351 > (local104.aByteArray16[arg3.anInt353 + 2] & 0xFF) << 8) {
				arg3.anInt353 += 2;
			}
			if (arg3.anInt353 == local104.aByteArray16.length - 2) {
				local106 = true;
			}
		}
		if (!local106) {
			arg3.aClass4_Sub6_Sub1_1.method504(arg3.anInt358, this.method834(arg3), this.method838(arg3));
			return false;
		}
		arg3.aClass4_Sub6_Sub1_1.method514(arg3.anInt358);
		if (arg1 == null) {
			arg3.aClass4_Sub6_Sub1_1.method3728(arg2);
		} else {
			arg3.aClass4_Sub6_Sub1_1.method3723(arg1, arg0, arg2);
		}
		if (arg3.aClass4_Sub6_Sub1_1.method502()) {
			this.aClass4_Sub6_Sub3_1.aClass4_Sub6_Sub4_2.method3731(arg3.aClass4_Sub6_Sub1_1);
		}
		arg3.method287();
		if (arg3.anInt351 >= 0) {
			arg3.method4690();
			if (arg3.anInt349 > 0 && this.aClass4_Sub3ArrayArray2[arg3.anInt344][arg3.anInt349] == arg3) {
				this.aClass4_Sub3ArrayArray2[arg3.anInt344][arg3.anInt349] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLclient!b;)I")
	private int method834(@OriginalArg(1) Class4_Sub3 arg0) {
		if (this.anIntArray97[arg0.anInt344] == 0) {
			return 0;
		}
		@Pc(31) int local31 = this.anIntArray101[arg0.anInt344] * this.anIntArray105[arg0.anInt344] + 4096 >> 13;
		@Pc(39) int local39 = local31 * local31 + 16384 >> 15;
		@Pc(55) int local55 = arg0.anInt355 * local39 + 16384 >> 15;
		@Pc(58) Class36 local58 = arg0.aClass36_1;
		@Pc(67) int local67 = local55 * this.anInt916 + 128 >> 8;
		local31 = local67 * this.anIntArray97[arg0.anInt344] + 128 >> 8;
		if (local58.anInt1263 > 0) {
			local31 = (int) (Math.pow(0.5D, (double) arg0.anInt365 * 1.953125E-5D * (double) local58.anInt1263) * (double) local31 + 0.5D);
		}
		@Pc(117) int local117;
		@Pc(114) int local114;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local58.aByteArray15 != null) {
			local114 = local58.aByteArray15[arg0.anInt366 + 1];
			local117 = arg0.anInt354;
			if (local58.aByteArray15.length - 2 > arg0.anInt366) {
				local136 = (local58.aByteArray15[arg0.anInt366] & 0xFF) << 8;
				local148 = (local58.aByteArray15[arg0.anInt366 + 2] & 0xFF) << 8;
				local114 += (local58.aByteArray15[arg0.anInt366 + 3] - local114) * (local117 + -local136) / (local148 - local136);
			}
			local31 = local31 * local114 + 32 >> 6;
		}
		if (arg0.anInt351 > 0 && local58.aByteArray16 != null) {
			local114 = local58.aByteArray16[arg0.anInt353 + 1];
			local117 = arg0.anInt351;
			if (local58.aByteArray16.length - 2 > arg0.anInt353) {
				local148 = (local58.aByteArray16[arg0.anInt353 + 2] & 0xFF) << 8;
				local136 = (local58.aByteArray16[arg0.anInt353] & 0xFF) << 8;
				local114 += (local58.aByteArray16[arg0.anInt353 + 3] - local114) * (-local136 + local117) / (local148 - local136);
			}
			local31 = local31 * local114 + 32 >> 6;
		}
		return local31;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)V")
	private void method835(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method823(-1);
		} else {
			this.method819(-1);
		}
		this.method840(-1);
		@Pc(25) int local25;
		for (local25 = 0; local25 < 16; local25++) {
			this.anIntArray100[local25] = this.anIntArray98[local25];
		}
		for (local25 = 0; local25 < 16; local25++) {
			this.anIntArray103[local25] = this.anIntArray98[local25] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3723(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass104_1.method2625()) {
			@Pc(14) int local14 = this.aClass104_1.anInt3315 * this.anInt884 / Static75.anInt1523;
			do {
				@Pc(24) long local24 = this.aLong29 + (long) arg2 * (long) local14;
				if (this.aLong30 - local24 >= 0L) {
					this.aLong29 = local24;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong30 - this.aLong29 - 1L) / (long) local14);
				arg2 -= local53;
				this.aLong29 += (long) local14 * (long) local53;
				this.aClass4_Sub6_Sub3_1.method3723(arg0, arg1, local53);
				this.method836();
				arg1 += local53;
			} while (this.aClass104_1.method2625());
		}
		this.aClass4_Sub6_Sub3_1.method3723(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
	private void method836() {
		@Pc(4) int local4 = this.anInt924;
		@Pc(11) long local11 = this.aLong30;
		@Pc(14) int local14 = this.anInt925;
		if (this.aClass4_Sub14_1 != null && local14 == this.anInt926) {
			this.method829(this.aBoolean61, this.aClass4_Sub14_1, this.aBoolean60);
			this.method836();
			return;
		}
		while (this.anInt925 == local14) {
			while (local14 == this.aClass104_1.anIntArray276[local4]) {
				this.aClass104_1.method2618(local4);
				@Pc(73) int local73 = this.aClass104_1.method2621(local4);
				if (local73 == 1) {
					this.aClass104_1.method2623();
					this.aClass104_1.method2626(local4);
					if (this.aClass104_1.method2627()) {
						if (this.aClass4_Sub14_1 != null) {
							this.method826(this.aClass4_Sub14_1, this.aBoolean60);
							this.method836();
							return;
						}
						if (!this.aBoolean60 || local14 == 0) {
							this.method835(true);
							this.aClass104_1.method2622();
							return;
						}
						this.aClass104_1.method2615(local11);
					}
					break;
				}
				if ((local73 & 0x80) != 0) {
					this.method817(local73);
				}
				this.aClass104_1.method2617(local4);
				this.aClass104_1.method2626(local4);
			}
			local4 = this.aClass104_1.method2614();
			local14 = this.aClass104_1.anIntArray276[local4];
			local11 = this.aClass104_1.method2624(local14);
		}
		this.aLong30 = local11;
		this.anInt924 = local4;
		this.anInt925 = local14;
		if (this.aClass4_Sub14_1 != null && local14 > this.anInt926) {
			this.anInt924 = -1;
			this.anInt925 = this.anInt926;
			this.aLong30 = this.aClass104_1.method2624(this.anInt925);
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "()I")
	@Override
	public synchronized int method3724() {
		return 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIB)V")
	private void method837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class4_Sub3 local12 = this.aClass4_Sub3ArrayArray1[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass4_Sub3ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray109[arg2] & 0x2) == 0) {
			local12.anInt351 = 0;
			return;
		}
		for (@Pc(52) Class4_Sub3 local52 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method613(); local52 != null; local52 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method607()) {
			if (local52.anInt344 == local12.anInt344 && local52.anInt351 < 0 && local52 != local12) {
				local12.anInt351 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!b;Z)I")
	private int method838(@OriginalArg(0) Class4_Sub3 arg0) {
		@Pc(9) int local9 = this.anIntArray102[arg0.anInt344];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt347) * (-local9 + 16384) + 32 >> 6) : arg0.anInt347 * local9 - -32 >> 6;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "()Lclient!mj;")
	@Override
	public synchronized Class4_Sub6 method3725() {
		return null;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(B)I")
	public int method839() {
		return this.anInt916;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(IB)V")
	private void method840(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
				this.method840(local18);
			}
			return;
		}
		this.anIntArray101[arg0] = 12800;
		this.anIntArray102[arg0] = 8192;
		this.anIntArray105[arg0] = 16383;
		this.anIntArray94[arg0] = 8192;
		this.anIntArray107[arg0] = 0;
		this.anIntArray106[arg0] = 8192;
		this.method821(arg0);
		this.method850(arg0);
		this.anIntArray109[arg0] = 0;
		this.anIntArray93[arg0] = 32767;
		this.anIntArray104[arg0] = 256;
		this.anIntArray96[arg0] = 0;
		this.method845(arg0, 8192);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(IIII)V")
	private void method841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(Z)V")
	public synchronized void method842() {
		for (@Pc(15) Class4_Sub32 local15 = (Class4_Sub32) this.aClass163_13.method4192(); local15 != null; local15 = (Class4_Sub32) this.aClass163_13.method4183()) {
			local15.method4690();
		}
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(I)Z")
	public synchronized boolean method843() {
		return this.aClass104_1.method2625();
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(I)V")
	public synchronized void method844() {
		for (@Pc(11) Class4_Sub32 local11 = (Class4_Sub32) this.aClass163_13.method4192(); local11 != null; local11 = (Class4_Sub32) this.aClass163_13.method4183()) {
			local11.method4564();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)V")
	private void method845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray95[arg0] = arg1;
		this.anIntArray99[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(ZI)V")
	private synchronized void method849(@OriginalArg(0) boolean arg0) {
		this.aClass104_1.method2622();
		this.aClass4_Sub14_1 = null;
		this.method835(arg0);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(IB)V")
	private void method850(@OriginalArg(0) int arg0) {
		if ((this.anIntArray109[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(17) Class4_Sub3 local17 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method613(); local17 != null; local17 = (Class4_Sub3) this.aClass4_Sub6_Sub3_1.aClass17_14.method607()) {
			if (arg0 == local17.anInt344) {
				local17.anInt345 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(III)V")
	private void method851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!co", name = "h", descriptor = "(I)V")
	public synchronized void method852() {
		this.method849(true);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!b;)I")
	private int method853(@OriginalArg(1) Class4_Sub3 arg0) {
		@Pc(6) Class36 local6 = arg0.aClass36_1;
		@Pc(18) int local18 = arg0.anInt352 + (arg0.anInt363 * arg0.anInt357 >> 12);
		local18 += this.anIntArray104[arg0.anInt344] * (this.anIntArray94[arg0.anInt344] - 8192) >> 12;
		@Pc(64) int local64;
		if (local6.anInt1261 > 0 && (local6.anInt1255 > 0 || this.anIntArray107[arg0.anInt344] > 0)) {
			@Pc(59) int local59 = local6.anInt1262 << 1;
			local64 = local6.anInt1255 << 2;
			if (arg0.anInt362 < local59) {
				local64 = local64 * arg0.anInt362 / local59;
			}
			local64 += this.anIntArray107[arg0.anInt344] >> 7;
			@Pc(98) double local98 = Math.sin((double) (arg0.anInt346 & 0x1FF) * 0.01227184630308513D);
			local18 += (int) (local98 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass4_Sub5_Sub1_1.anInt4737 * 256) * Math.pow(2.0D, (double) local18 * 3.255208333333333E-4D) / (double) Static75.anInt1523 + 0.5D);
		return local64 < 1 ? 1 : local64;
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(III)V")
	private void method854(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray100[arg1]) {
			this.anIntArray100[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass4_Sub3ArrayArray2[arg1][local18] = null;
			}
		}
	}
}
