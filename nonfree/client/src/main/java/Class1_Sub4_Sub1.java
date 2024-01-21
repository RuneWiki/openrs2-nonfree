import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bf", name = "Xb", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!bf", name = "Yb", descriptor = "Z")
	private boolean aBoolean28;

	@OriginalMember(owner = "client!bf", name = "Zb", descriptor = "I")
	private int anInt556;

	@OriginalMember(owner = "client!bf", name = "ac", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!bf", name = "cc", descriptor = "I")
	private int anInt557;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "[I")
	private final int[] anIntArray38 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "[[Lclient!hc;")
	private final Class1_Sub11[][] aClass1_Sub11ArrayArray1 = new Class1_Sub11[16][128];

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "[I")
	public final int[] anIntArray40 = new int[16];

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
	private final int[] anIntArray35 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Bb", descriptor = "[I")
	private final int[] anIntArray43 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Ab", descriptor = "I")
	private final int anInt543 = 1000000;

	@OriginalMember(owner = "client!bf", name = "Jb", descriptor = "[I")
	private final int[] anIntArray46 = new int[16];

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "[I")
	private final int[] anIntArray36 = new int[16];

	@OriginalMember(owner = "client!bf", name = "tb", descriptor = "[I")
	private final int[] anIntArray42 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Eb", descriptor = "[I")
	public final int[] anIntArray44 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Kb", descriptor = "[I")
	public final int[] anIntArray47 = new int[16];

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "[I")
	private final int[] anIntArray37 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Tb", descriptor = "[I")
	private final int[] anIntArray49 = new int[16];

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "[[Lclient!hc;")
	private final Class1_Sub11[][] aClass1_Sub11ArrayArray2 = new Class1_Sub11[16][128];

	@OriginalMember(owner = "client!bf", name = "Nb", descriptor = "I")
	private int anInt550 = 256;

	@OriginalMember(owner = "client!bf", name = "Rb", descriptor = "[I")
	private final int[] anIntArray48 = new int[16];

	@OriginalMember(owner = "client!bf", name = "sb", descriptor = "[I")
	private final int[] anIntArray41 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Vb", descriptor = "[I")
	private final int[] anIntArray50 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Hb", descriptor = "[I")
	private final int[] anIntArray45 = new int[16];

	@OriginalMember(owner = "client!bf", name = "qb", descriptor = "Lclient!fa;")
	private final Class23 aClass23_1 = new Class23();

	@OriginalMember(owner = "client!bf", name = "bc", descriptor = "Lclient!dc;")
	private final Class1_Sub4_Sub2 aClass1_Sub4_Sub2_1 = new Class1_Sub4_Sub2(this);

	@OriginalMember(owner = "client!bf", name = "zb", descriptor = "Lclient!mc;")
	private final Class48 aClass48_1 = new Class48(128);

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub1() {
		this.method332();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	private void method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray45[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	private void method306(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class1_Sub11 local18 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1034(); local18 != null; local18 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1038()) {
			if ((arg0 < 0 || local18.anInt1350 == arg0) && local18.anInt1352 < 0) {
				this.aClass1_Sub11ArrayArray2[local18.anInt1350][local18.anInt1344] = null;
				local18.anInt1352 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()Lclient!kb;")
	@Override
	public synchronized Class1_Sub4 method1896() {
		return this.aClass1_Sub4_Sub2_1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZ)V")
	public synchronized void method307() {
		this.method320();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!hc;)I")
	private int method308(@OriginalArg(1) Class1_Sub11 arg0) {
		@Pc(19) int local19 = this.anIntArray42[arg0.anInt1350] * this.anIntArray37[arg0.anInt1350] + 4096 >> 13;
		@Pc(22) Class41 local22 = arg0.aClass41_1;
		@Pc(30) int local30 = local19 * local19 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt1351 * local30 + 16384 >> 15;
		local19 = local39 * this.anInt550 + 128 >> 8;
		if (local22.anInt1721 > 0) {
			local19 = (int) ((double) local19 * Math.pow(0.5D, (double) local22.anInt1721 * 1.953125E-5D * (double) arg0.anInt1358) + 0.5D);
		}
		@Pc(75) int local75;
		@Pc(83) int local83;
		@Pc(105) int local105;
		@Pc(117) int local117;
		if (local22.aByteArray28 != null) {
			local75 = arg0.anInt1353;
			local83 = local22.aByteArray28[arg0.anInt1359 + 1];
			if (local22.aByteArray28.length - 2 > arg0.anInt1359) {
				local105 = (local22.aByteArray28[arg0.anInt1359] & 0xFF) << 8;
				local117 = (local22.aByteArray28[arg0.anInt1359 + 2] & 0xFF) << 8;
				local83 += (local75 - local105) * (local22.aByteArray28[arg0.anInt1359 + 3] - local83) / (local117 - local105);
			}
			local19 = local83 * local19 + 32 >> 6;
		}
		if (arg0.anInt1352 > 0 && local22.aByteArray27 != null) {
			local75 = arg0.anInt1352;
			local83 = local22.aByteArray27[arg0.anInt1340 + 1];
			if (arg0.anInt1340 < local22.aByteArray27.length - 2) {
				local105 = (local22.aByteArray27[arg0.anInt1340] & 0xFF) << 8;
				local117 = (local22.aByteArray27[arg0.anInt1340 + 2] & 0xFF) << 8;
				local83 += (local75 - local105) * (local22.aByteArray27[arg0.anInt1340 + 3] - local83) / (local117 - local105);
			}
			local19 = local19 * local83 + 32 >> 6;
		}
		return local19;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
	private void method309(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method325(local28, local16, local22);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method325(64, local16, local22);
			} else {
				this.method314(local28, local16, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			this.method328(local16, local22, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			if (local22 == 0) {
				this.anIntArray48[local16] = (local28 << 14) + (this.anIntArray48[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray48[local16] = (local28 << 7) + (this.anIntArray48[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray41[local16] = (local28 << 7) + (this.anIntArray41[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray41[local16] = local28 + (this.anIntArray41[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray50[local16] = (this.anIntArray50[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray50[local16] = (this.anIntArray50[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray37[local16] = (local28 << 7) + (this.anIntArray37[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray37[local16] = local28 + (this.anIntArray37[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray35[local16] = (this.anIntArray35[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray35[local16] = (this.anIntArray35[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray42[local16] = (local28 << 7) + (this.anIntArray42[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray42[local16] = local28 + (this.anIntArray42[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray40[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray40[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray40[local16] |= 0x2;
				} else {
					this.method330(local16);
					this.anIntArray40[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray49[local16] = (local28 << 7) + (this.anIntArray49[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray49[local16] = local28 + (this.anIntArray49[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray49[local16] = (local28 << 7) + (this.anIntArray49[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray49[local16] = local28 + (this.anIntArray49[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method331(local16);
			}
			if (local22 == 121) {
				this.method310(local16);
			}
			if (local22 == 123) {
				this.method306(local16);
			}
			@Pc(502) int local502;
			if (local22 == 6) {
				local502 = this.anIntArray49[local16];
				if (local502 == 16384) {
					this.anIntArray46[local16] = (local28 << 7) + (this.anIntArray46[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local502 = this.anIntArray49[local16];
				if (local502 == 16384) {
					this.anIntArray46[local16] = (this.anIntArray46[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray44[local16] = (local28 << 7) + (this.anIntArray44[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray44[local16] = (this.anIntArray44[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray40[local16] |= 0x4;
				} else {
					this.method315(local16);
					this.anIntArray40[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method318(local16, (local28 << 7) + (this.anIntArray38[local16] & 0xFFFFC07F));
			}
			if (local22 == 49) {
				this.method318(local16, (this.anIntArray38[local16] & 0xFFFFFF80) + local28);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method326(local16, this.anIntArray48[local16] + local22);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method329(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0002) >> 9);
			this.method305(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method332();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
	private void method310(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method310(local12);
			}
			return;
		}
		this.anIntArray37[arg0] = 12800;
		this.anIntArray35[arg0] = 8192;
		this.anIntArray42[arg0] = 16383;
		this.anIntArray45[arg0] = 8192;
		this.anIntArray41[arg0] = 0;
		this.anIntArray50[arg0] = 8192;
		this.method330(arg0);
		this.method315(arg0);
		this.anIntArray40[arg0] = 0;
		this.anIntArray49[arg0] = 32767;
		this.anIntArray46[arg0] = 256;
		this.anIntArray44[arg0] = 0;
		this.method318(arg0, 8192);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLclient!hc;)Z")
	public boolean method311(@OriginalArg(1) Class1_Sub11 arg0) {
		if (arg0.aClass1_Sub4_Sub3_1 != null) {
			return false;
		}
		if (arg0.anInt1352 >= 0) {
			arg0.method2039();
			if (arg0.anInt1349 > 0 && this.aClass1_Sub11ArrayArray1[arg0.anInt1350][arg0.anInt1349] == arg0) {
				this.aClass1_Sub11ArrayArray1[arg0.anInt1350][arg0.anInt1349] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!hc;Z)I")
	private int method312(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(5) int local5 = this.anIntArray35[arg0.anInt1350];
		return local5 < 8192 ? arg0.anInt1346 * local5 + 32 >> 6 : 16384 - ((128 - arg0.anInt1346) * (-local5 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!hc;IZ)V")
	public void method313(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass1_Sub17_Sub1_1.aByteArray32.length;
		@Pc(40) int local40;
		if (arg1 && arg0.aClass1_Sub17_Sub1_1.aBoolean104) {
			@Pc(27) int local27 = local8 + local8 - arg0.aClass1_Sub17_Sub1_1.anInt1968;
			local40 = (int) ((long) this.anIntArray44[arg0.anInt1350] * (long) local27 >> 6);
			local8 <<= 0x8;
			if (local8 <= local40) {
				local40 = local8 + local8 - local40 - 1;
				arg0.aClass1_Sub4_Sub3_1.method1221();
			}
		} else {
			local40 = (int) ((long) this.anIntArray44[arg0.anInt1350] * (long) local8 >> 6);
		}
		arg0.aClass1_Sub4_Sub3_1.method1247(local40);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
	private void method314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method325(64, arg1, arg2);
		if ((this.anIntArray40[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub11 local28 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1048(); local28 != null; local28 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1033()) {
				if (local28.anInt1350 == arg1 && local28.anInt1352 < 0) {
					this.aClass1_Sub11ArrayArray2[arg1][local28.anInt1344] = null;
					this.aClass1_Sub11ArrayArray2[arg1][arg2] = local28;
					@Pc(71) int local71 = local28.anInt1341 + (local28.anInt1338 * local28.anInt1356 >> 12);
					local28.anInt1338 = 4096;
					local28.anInt1341 += arg2 - local28.anInt1344 << 8;
					local28.anInt1344 = arg2;
					local28.anInt1356 = local71 - local28.anInt1341;
					return;
				}
			}
		}
		@Pc(124) Class1_Sub8 local124 = (Class1_Sub8) this.aClass48_1.method1340((long) this.anIntArray43[arg1]);
		if (local124 == null) {
			return;
		}
		@Pc(132) Class1_Sub17_Sub1 local132 = local124.aClass1_Sub17_Sub1Array1[arg2];
		if (local132 == null) {
			return;
		}
		@Pc(139) Class1_Sub11 local139 = new Class1_Sub11();
		local139.anInt1350 = arg1;
		local139.aClass1_Sub17_Sub1_1 = local132;
		local139.aClass1_Sub8_1 = local124;
		local139.aClass41_1 = local124.aClass41Array1[arg2];
		local139.anInt1349 = local124.aByteArray9[arg2];
		local139.anInt1344 = arg2;
		local139.anInt1351 = local124.aByteArray8[arg2] * arg0 * arg0 * local124.anInt795 + 1024 >> 11;
		local139.anInt1346 = local124.aByteArray7[arg2] & 0xFF;
		local139.anInt1341 = (arg2 << 8) - (local124.aShortArray1[arg2] & 0x7FFF);
		local139.anInt1353 = 0;
		local139.anInt1352 = -1;
		local139.anInt1359 = 0;
		local139.anInt1358 = 0;
		local139.anInt1340 = 0;
		if (this.anIntArray44[arg1] == 0) {
			local139.aClass1_Sub4_Sub3_1 = Static137.method1225(local132, this.method336(local139), this.method308(local139), this.method312(local139));
		} else {
			local139.aClass1_Sub4_Sub3_1 = Static137.method1225(local132, this.method336(local139), 0, this.method312(local139));
			this.method313(local139, local124.aShortArray1[arg2] < 0);
		}
		if (local124.aShortArray1[arg2] < 0) {
			local139.aClass1_Sub4_Sub3_1.method1239(-1);
		}
		if (local139.anInt1349 >= 0) {
			@Pc(292) Class1_Sub11 local292 = this.aClass1_Sub11ArrayArray1[arg1][local139.anInt1349];
			if (local292 != null && local292.anInt1352 < 0) {
				this.aClass1_Sub11ArrayArray2[arg1][local292.anInt1344] = null;
				local292.anInt1352 = 0;
			}
			this.aClass1_Sub11ArrayArray1[arg1][local139.anInt1349] = local139;
		}
		this.aClass1_Sub4_Sub2_1.aClass38_6.method1046(local139);
		this.aClass1_Sub11ArrayArray2[arg1][arg2] = local139;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
	private void method315(@OriginalArg(1) int arg0) {
		if ((this.anIntArray40[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(32) Class1_Sub11 local32 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1034(); local32 != null; local32 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1038()) {
			if (arg0 == local32.anInt1350) {
				local32.anInt1354 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ie;ILclient!kd;ILclient!jf;)Z")
	public synchronized boolean method316(@OriginalArg(0) Class35 arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(4) Class1_Sub13 arg2) {
		@Pc(17) int[] local17 = new int[] { 22050 };
		arg2.method1056();
		@Pc(21) boolean local21 = true;
		for (@Pc(29) Class1_Sub15 local29 = (Class1_Sub15) arg2.aClass48_7.method1337(); local29 != null; local29 = (Class1_Sub15) arg2.aClass48_7.method1335()) {
			@Pc(35) int local35 = (int) local29.aLong162;
			@Pc(43) Class1_Sub8 local43 = (Class1_Sub8) this.aClass48_1.method1340((long) local35);
			if (local43 == null) {
				local43 = Static95.method1617(local35, arg0);
				if (local43 == null) {
					local21 = false;
					continue;
				}
				this.aClass48_1.method1336((long) local35, local43);
			}
			if (!local43.method464(arg1, local17, local29.aByteArray29)) {
				local21 = false;
			}
		}
		if (local21) {
			arg2.method1055();
		}
		return local21;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZLclient!jf;Z)V")
	public synchronized void method317(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) boolean arg1) {
		this.method334();
		this.aClass23_1.method608(arg0.aByteArray21);
		this.aBoolean28 = arg1;
		this.aLong32 = 0L;
		@Pc(23) int local23 = this.aClass23_1.method611();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass23_1.method619(local25);
			this.aClass23_1.method617(local25);
			this.aClass23_1.method609(local25);
		}
		this.anInt556 = this.aClass23_1.method607();
		this.anInt557 = this.aClass23_1.anIntArray96[this.anInt556];
		this.aLong31 = this.aClass23_1.method616(this.anInt557);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
	private void method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray38[arg0] = arg1;
		this.anIntArray47[arg0] = (int) (Math.pow((double) 2, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII)V")
	private void method320() {
		this.anIntArray36[9] = 128;
		this.anIntArray48[9] = 128;
		this.method326(9, 128);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public synchronized void method322() {
		for (@Pc(7) Class1_Sub8 local7 = (Class1_Sub8) this.aClass48_1.method1337(); local7 != null; local7 = (Class1_Sub8) this.aClass48_1.method1335()) {
			local7.method462();
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1895(@OriginalArg(0) int arg0) {
		if (this.aClass23_1.method614()) {
			@Pc(14) int local14 = this.aClass23_1.anInt985 * this.anInt543 / Static12.anInt553;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong32;
				if (this.aLong31 - local23 >= 0L) {
					this.aLong32 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong31 - this.aLong32 - 1L) / (long) local14);
				this.aLong32 += (long) local53 * (long) local14;
				this.aClass1_Sub4_Sub2_1.method1895(local53);
				arg0 -= local53;
				this.method333();
			} while (this.aClass23_1.method614());
		}
		this.aClass1_Sub4_Sub2_1.method1895(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!hc;I[III)Z")
	public boolean method323(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt1345 = Static12.anInt553 / 100;
		if (arg0.anInt1352 >= 0 && (arg0.aClass1_Sub4_Sub3_1 == null || arg0.aClass1_Sub4_Sub3_1.method1246())) {
			arg0.method877();
			arg0.method2039();
			if (arg0.anInt1349 > 0 && arg0 == this.aClass1_Sub11ArrayArray1[arg0.anInt1350][arg0.anInt1349]) {
				this.aClass1_Sub11ArrayArray1[arg0.anInt1350][arg0.anInt1349] = null;
			}
			return true;
		}
		@Pc(67) int local67 = arg0.anInt1338;
		if (local67 > 0) {
			local67 -= (int) (Math.pow(2.0D, (double) this.anIntArray50[arg0.anInt1350] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local67 < 0) {
				local67 = 0;
			}
			arg0.anInt1338 = local67;
		}
		arg0.aClass1_Sub4_Sub3_1.method1217(this.method336(arg0));
		@Pc(104) Class41 local104 = arg0.aClass41_1;
		arg0.anInt1342 += local104.anInt1727;
		@Pc(113) boolean local113 = false;
		arg0.anInt1355++;
		@Pc(138) double local138 = (double) ((arg0.anInt1344 - 60 << 8) + (arg0.anInt1356 * arg0.anInt1338 >> 12)) * 5.086263020833333E-6D;
		if (local104.anInt1721 > 0) {
			if (local104.anInt1728 > 0) {
				arg0.anInt1358 += (int) (Math.pow(2.0D, local138 * (double) local104.anInt1728) * 128.0D + 0.5D);
			} else {
				arg0.anInt1358 += 128;
			}
		}
		if (local104.aByteArray28 != null) {
			if (local104.anInt1726 <= 0) {
				arg0.anInt1353 += 128;
			} else {
				arg0.anInt1353 += (int) (Math.pow(2.0D, (double) local104.anInt1726 * local138) * 128.0D + 0.5D);
			}
			while (local104.aByteArray28.length - 2 > arg0.anInt1359 && (local104.aByteArray28[arg0.anInt1359 + 2] & 0xFF) << 8 < arg0.anInt1353) {
				arg0.anInt1359 += 2;
			}
			if (arg0.anInt1359 == local104.aByteArray28.length - 2 && local104.aByteArray28[arg0.anInt1359 + 1] == 0) {
				local113 = true;
			}
		}
		if (arg0.anInt1352 >= 0 && local104.aByteArray27 != null && (this.anIntArray40[arg0.anInt1350] & 0x1) == 0 && (arg0.anInt1349 < 0 || arg0 != this.aClass1_Sub11ArrayArray1[arg0.anInt1350][arg0.anInt1349])) {
			if (local104.anInt1732 <= 0) {
				arg0.anInt1352 += 128;
			} else {
				arg0.anInt1352 += (int) (Math.pow(2.0D, (double) local104.anInt1732 * local138) * 128.0D + 0.5D);
			}
			while (arg0.anInt1340 < local104.aByteArray27.length - 2 && (local104.aByteArray27[arg0.anInt1340 + 2] & 0xFF) << 8 < arg0.anInt1352) {
				arg0.anInt1340 += 2;
			}
			if (arg0.anInt1340 == local104.aByteArray27.length - 2) {
				local113 = true;
			}
		}
		if (!local113) {
			arg0.aClass1_Sub4_Sub3_1.method1218(arg0.anInt1345, this.method308(arg0), this.method312(arg0));
			return false;
		}
		arg0.aClass1_Sub4_Sub3_1.method1253(arg0.anInt1345);
		if (arg1 == null) {
			arg0.aClass1_Sub4_Sub3_1.method1895(arg3);
		} else {
			arg0.aClass1_Sub4_Sub3_1.method1897(arg1, arg2, arg3);
		}
		if (arg0.aClass1_Sub4_Sub3_1.method1241()) {
			this.aClass1_Sub4_Sub2_1.aClass1_Sub4_Sub4_1.method1905(arg0.aClass1_Sub4_Sub3_1);
		}
		arg0.method877();
		if (arg0.anInt1352 >= 0) {
			arg0.method2039();
			if (arg0.anInt1349 > 0 && arg0 == this.aClass1_Sub11ArrayArray1[arg0.anInt1350][arg0.anInt1349]) {
				this.aClass1_Sub11ArrayArray1[arg0.anInt1350][arg0.anInt1349] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)I")
	public int method324() {
		return this.anInt550;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZI)V")
	private void method325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub11 local12 = this.aClass1_Sub11ArrayArray2[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub11ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray40[arg1] & 0x2) == 0) {
			local12.anInt1352 = 0;
			return;
		}
		for (@Pc(36) Class1_Sub11 local36 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1034(); local36 != null; local36 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1038()) {
			if (local12.anInt1350 == local36.anInt1350 && local36.anInt1352 < 0 && local36 != local12) {
				local12.anInt1352 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
	private void method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray43[arg0] != arg1) {
			this.anIntArray43[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass1_Sub11ArrayArray1[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()Lclient!kb;")
	@Override
	public synchronized Class1_Sub4 method1894() {
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Z")
	public synchronized boolean method327() {
		return this.aClass23_1.method614();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIII)V")
	private void method328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(III)V")
	private void method329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()I")
	@Override
	public synchronized int method1898() {
		return 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
	private void method330(@OriginalArg(0) int arg0) {
		if ((this.anIntArray40[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class1_Sub11 local19 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1034(); local19 != null; local19 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1038()) {
			if (local19.anInt1350 == arg0 && this.aClass1_Sub11ArrayArray2[arg0][local19.anInt1344] == null && local19.anInt1352 < 0) {
				local19.anInt1352 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
	private void method331(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class1_Sub11 local16 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1034(); local16 != null; local16 = (Class1_Sub11) this.aClass1_Sub4_Sub2_1.aClass38_6.method1038()) {
			if (arg0 < 0 || arg0 == local16.anInt1350) {
				if (local16.aClass1_Sub4_Sub3_1 != null) {
					local16.aClass1_Sub4_Sub3_1.method1253(Static12.anInt553 / 100);
					if (local16.aClass1_Sub4_Sub3_1.method1241()) {
						this.aClass1_Sub4_Sub2_1.aClass1_Sub4_Sub4_1.method1905(local16.aClass1_Sub4_Sub3_1);
					}
					local16.method877();
				}
				if (local16.anInt1352 < 0) {
					this.aClass1_Sub11ArrayArray2[local16.anInt1350][local16.anInt1344] = null;
				}
				local16.method2039();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
	private void method332() {
		this.method331(-1);
		this.method310(-1);
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray43[local19] = this.anIntArray36[local19];
		}
		for (@Pc(37) int local37 = 0; local37 < 16; local37++) {
			this.anIntArray48[local37] = this.anIntArray36[local37] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
	private void method333() {
		@Pc(8) int local8 = this.anInt556;
		@Pc(11) long local11 = this.aLong31;
		@Pc(14) int local14 = this.anInt557;
		while (local14 == this.anInt557) {
			while (this.aClass23_1.anIntArray96[local8] == local14) {
				this.aClass23_1.method619(local8);
				@Pc(25) int local25 = this.aClass23_1.method605(local8);
				if (local25 == 1) {
					this.aClass23_1.method613();
					this.aClass23_1.method609(local8);
					if (this.aClass23_1.method610()) {
						if (!this.aBoolean28 || local14 == 0) {
							this.method332();
							this.aClass23_1.method612();
							return;
						}
						this.aClass23_1.method615(local11);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method309(local25);
				}
				this.aClass23_1.method617(local8);
				this.aClass23_1.method609(local8);
			}
			local8 = this.aClass23_1.method607();
			local14 = this.aClass23_1.anIntArray96[local8];
			local11 = this.aClass23_1.method616(local14);
		}
		this.anInt556 = local8;
		this.aLong31 = local11;
		this.anInt557 = local14;
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
	public synchronized void method334() {
		this.aClass23_1.method612();
		this.method332();
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V")
	public synchronized void method335() {
		for (@Pc(15) Class1_Sub8 local15 = (Class1_Sub8) this.aClass48_1.method1337(); local15 != null; local15 = (Class1_Sub8) this.aClass48_1.method1335()) {
			local15.method2039();
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1897(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass23_1.method614()) {
			@Pc(18) int local18 = this.anInt543 * this.aClass23_1.anInt985 / Static12.anInt553;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong32;
				if (this.aLong31 - local27 >= 0L) {
					this.aLong32 = local27;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong31 + (long) local18 - this.aLong32 - 1L) / (long) local18);
				this.aLong32 += (long) local59 * (long) local18;
				this.aClass1_Sub4_Sub2_1.method1897(arg0, arg1, local59);
				arg1 += local59;
				this.method333();
				arg2 -= local59;
			} while (this.aClass23_1.method614());
		}
		this.aClass1_Sub4_Sub2_1.method1897(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(ILclient!hc;)I")
	private int method336(@OriginalArg(1) Class1_Sub11 arg0) {
		@Pc(20) int local20 = (arg0.anInt1356 * arg0.anInt1338 >> 12) + arg0.anInt1341;
		local20 += (this.anIntArray45[arg0.anInt1350] - 8192) * this.anIntArray46[arg0.anInt1350] >> 12;
		@Pc(41) Class41 local41 = arg0.aClass41_1;
		@Pc(64) int local64;
		if (local41.anInt1727 > 0 && (local41.anInt1722 > 0 || this.anIntArray41[arg0.anInt1350] > 0)) {
			local64 = local41.anInt1722 << 2;
			@Pc(69) int local69 = local41.anInt1723 << 1;
			if (local69 > arg0.anInt1355) {
				local64 = local64 * arg0.anInt1355 / local69;
			}
			local64 += this.anIntArray41[arg0.anInt1350] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt1342 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) (local103 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass1_Sub17_Sub1_1.anInt1967 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static12.anInt553 + 0.5D);
		return local64 < 1 ? 1 : local64;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
	public synchronized void method337(@OriginalArg(0) int arg0) {
		this.anInt550 = arg0;
	}
}
