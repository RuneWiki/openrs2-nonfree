import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!rda", name = "Bb", descriptor = "I")
	private int anInt7646;

	@OriginalMember(owner = "client!rda", name = "Db", descriptor = "I")
	private int anInt7647;

	@OriginalMember(owner = "client!rda", name = "Fb", descriptor = "Z")
	private boolean aBoolean601;

	@OriginalMember(owner = "client!rda", name = "Gb", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!rda", name = "Hb", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!rda", name = "Ib", descriptor = "Z")
	private boolean aBoolean602;

	@OriginalMember(owner = "client!rda", name = "Jb", descriptor = "Lclient!hc;")
	private Class3_Sub24 aClass3_Sub24_2;

	@OriginalMember(owner = "client!rda", name = "Kb", descriptor = "I")
	private int anInt7649;

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
	private int anInt7604 = 256;

	@OriginalMember(owner = "client!rda", name = "u", descriptor = "[I")
	private final int[] anIntArray477 = new int[16];

	@OriginalMember(owner = "client!rda", name = "F", descriptor = "[I")
	private final int[] anIntArray482 = new int[16];

	@OriginalMember(owner = "client!rda", name = "E", descriptor = "[I")
	public final int[] anIntArray481 = new int[16];

	@OriginalMember(owner = "client!rda", name = "T", descriptor = "[I")
	private final int[] anIntArray484 = new int[16];

	@OriginalMember(owner = "client!rda", name = "ab", descriptor = "[I")
	private final int[] anIntArray485 = new int[16];

	@OriginalMember(owner = "client!rda", name = "kb", descriptor = "[I")
	private final int[] anIntArray489 = new int[16];

	@OriginalMember(owner = "client!rda", name = "y", descriptor = "[I")
	public final int[] anIntArray478 = new int[16];

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "[I")
	private final int[] anIntArray480 = new int[16];

	@OriginalMember(owner = "client!rda", name = "mb", descriptor = "[I")
	private final int[] anIntArray490 = new int[16];

	@OriginalMember(owner = "client!rda", name = "pb", descriptor = "[[Lclient!bk;")
	private final Class3_Sub8[][] aClass3_Sub8ArrayArray2 = new Class3_Sub8[16][128];

	@OriginalMember(owner = "client!rda", name = "z", descriptor = "[I")
	private final int[] anIntArray479 = new int[16];

	@OriginalMember(owner = "client!rda", name = "cb", descriptor = "[I")
	private final int[] anIntArray486 = new int[16];

	@OriginalMember(owner = "client!rda", name = "V", descriptor = "[[Lclient!bk;")
	private final Class3_Sub8[][] aClass3_Sub8ArrayArray1 = new Class3_Sub8[16][128];

	@OriginalMember(owner = "client!rda", name = "wb", descriptor = "I")
	private final int anInt7642 = 1000000;

	@OriginalMember(owner = "client!rda", name = "sb", descriptor = "[I")
	private final int[] anIntArray492 = new int[16];

	@OriginalMember(owner = "client!rda", name = "rb", descriptor = "[I")
	private final int[] anIntArray491 = new int[16];

	@OriginalMember(owner = "client!rda", name = "db", descriptor = "[I")
	public final int[] anIntArray487 = new int[16];

	@OriginalMember(owner = "client!rda", name = "jb", descriptor = "[I")
	private final int[] anIntArray488 = new int[16];

	@OriginalMember(owner = "client!rda", name = "Ab", descriptor = "[I")
	private final int[] anIntArray493 = new int[16];

	@OriginalMember(owner = "client!rda", name = "vb", descriptor = "Lclient!kl;")
	private final Class181 aClass181_1 = new Class181();

	@OriginalMember(owner = "client!rda", name = "Cb", descriptor = "Lclient!sn;")
	private final Class3_Sub4_Sub4 aClass3_Sub4_Sub4_1 = new Class3_Sub4_Sub4(this);

	@OriginalMember(owner = "client!rda", name = "B", descriptor = "Lclient!wa;")
	private final Class354 aClass354_36 = new Class354(128);

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub3() {
		this.method6348();
		this.method6360(true);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6658(@OriginalArg(0) int arg0) {
		if (this.aClass181_1.method4194()) {
			@Pc(14) int local14 = this.anInt7642 * this.aClass181_1.anInt4855 / Static404.anInt6999;
			do {
				@Pc(23) long local23 = this.aLong215 + (long) local14 * (long) arg0;
				if (this.aLong214 - local23 >= 0L) {
					this.aLong215 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong214 - this.aLong215 - 1L) / (long) local14);
				this.aLong215 += (long) local14 * (long) local54;
				this.aClass3_Sub4_Sub4_1.method6658(local54);
				arg0 -= local54;
				this.method6356();
			} while (this.aClass181_1.method4194());
		}
		this.aClass3_Sub4_Sub4_1.method6658(arg0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZI)V")
	private synchronized void method6334(@OriginalArg(0) boolean arg0) {
		this.aClass181_1.method4190();
		this.aClass3_Sub24_2 = null;
		this.method6360(arg0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V")
	public synchronized void method6335() {
		this.method6334(true);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!hc;ZI)V")
	public synchronized void method6336(@OriginalArg(0) Class3_Sub24 arg0, @OriginalArg(1) boolean arg1) {
		this.method6341(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(JZZBLclient!hc;)V")
	public synchronized void method6337(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) Class3_Sub24 arg2) {
		this.method6341(arg2, true, arg1);
		this.method6355(arg0 * (long) this.aClass181_1.anInt4855);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6654(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass181_1.method4194()) {
			@Pc(14) int local14 = this.anInt7642 * this.aClass181_1.anInt4855 / Static404.anInt6999;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong215;
				if (this.aLong214 - local23 >= 0L) {
					this.aLong215 = local23;
					break;
				}
				@Pc(51) int local51 = (int) ((this.aLong214 + (long) local14 - this.aLong215 - 1L) / (long) local14);
				this.aLong215 += (long) local14 * (long) local51;
				this.aClass3_Sub4_Sub4_1.method6654(arg0, arg1, local51);
				arg2 -= local51;
				this.method6356();
				arg1 += local51;
			} while (this.aClass181_1.method4194());
		}
		this.aClass3_Sub4_Sub4_1.method6654(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIB)V")
	private void method6338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray479[arg1] = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "()I")
	@Override
	public synchronized int method6655() {
		return 0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)V")
	private void method6339(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 & 0xF0;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(34) int local34;
		if (local15 == 128) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			this.method6369(local28, local34, local22);
		} else if (local15 == 144) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			if (local34 <= 0) {
				this.method6369(local28, 64, local22);
			} else {
				this.method6370(local28, local34, local22);
			}
		} else if (local15 == 160) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			this.method6350(local22, local34, local28);
		} else if (local15 == 176) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			if (local28 == 0) {
				this.anIntArray491[local22] = (local34 << 14) + (this.anIntArray491[local22] & 0xFFE03FFF);
			}
			if (local28 == 32) {
				this.anIntArray491[local22] = (this.anIntArray491[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 1) {
				this.anIntArray485[local22] = (local34 << 7) + (this.anIntArray485[local22] & 0xFFFFC07F);
			}
			if (local28 == 33) {
				this.anIntArray485[local22] = (this.anIntArray485[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 5) {
				this.anIntArray489[local22] = (this.anIntArray489[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 37) {
				this.anIntArray489[local22] = local34 + (this.anIntArray489[local22] & 0xFFFFFF80);
			}
			if (local28 == 7) {
				this.anIntArray490[local22] = (local34 << 7) + (this.anIntArray490[local22] & 0xFFFFC07F);
			}
			if (local28 == 39) {
				this.anIntArray490[local22] = (this.anIntArray490[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 10) {
				this.anIntArray480[local22] = (this.anIntArray480[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 42) {
				this.anIntArray480[local22] = (this.anIntArray480[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 11) {
				this.anIntArray492[local22] = (this.anIntArray492[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 43) {
				this.anIntArray492[local22] = (this.anIntArray492[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 64) {
				if (local34 >= 64) {
					this.anIntArray481[local22] |= 0x1;
				} else {
					this.anIntArray481[local22] &= 0xFFFFFFFE;
				}
			}
			if (local28 == 65) {
				if (local34 < 64) {
					this.method6342(local22);
					this.anIntArray481[local22] &= 0xFFFFFFFD;
				} else {
					this.anIntArray481[local22] |= 0x2;
				}
			}
			if (local28 == 99) {
				this.anIntArray477[local22] = (local34 << 7) + (this.anIntArray477[local22] & 0x7F);
			}
			if (local28 == 98) {
				this.anIntArray477[local22] = local34 + (this.anIntArray477[local22] & 0x3F80);
			}
			if (local28 == 101) {
				this.anIntArray477[local22] = (this.anIntArray477[local22] & 0x7F) + (local34 << 7) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray477[local22] = local34 + (this.anIntArray477[local22] & 0x3F80) + 16384;
			}
			if (local28 == 120) {
				this.method6366(local22);
			}
			if (local28 == 121) {
				this.method6365(local22);
			}
			if (local28 == 123) {
				this.method6358(local22);
			}
			@Pc(508) int local508;
			if (local28 == 6) {
				local508 = this.anIntArray477[local22];
				if (local508 == 16384) {
					this.anIntArray482[local22] = (local34 << 7) + (this.anIntArray482[local22] & 0xFFFFC07F);
				}
			}
			if (local28 == 38) {
				local508 = this.anIntArray477[local22];
				if (local508 == 16384) {
					this.anIntArray482[local22] = local34 + (this.anIntArray482[local22] & 0xFFFFFF80);
				}
			}
			if (local28 == 16) {
				this.anIntArray487[local22] = (local34 << 7) + (this.anIntArray487[local22] & 0xFFFFC07F);
			}
			if (local28 == 48) {
				this.anIntArray487[local22] = (this.anIntArray487[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 81) {
				if (local34 < 64) {
					this.method6343(local22);
					this.anIntArray481[local22] &= 0xFFFFFFFB;
				} else {
					this.anIntArray481[local22] |= 0x4;
				}
			}
			if (local28 == 17) {
				this.method6361(local22, (local34 << 7) + (this.anIntArray486[local22] & 0xFFFFC07F));
			}
			if (local28 == 49) {
				this.method6361(local22, local34 + (this.anIntArray486[local22] & 0xFFFFFF80));
			}
		} else if (local15 == 192) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method6364(local22, local28 + this.anIntArray491[local22]);
		} else if (local15 == 208) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method6351(local22, local28);
		} else if (local15 == 224) {
			local22 = arg0 & 0xF;
			local28 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method6338(local28, local22);
		} else {
			local15 = arg0 & 0xFF;
			if (local15 == 255) {
				this.method6360(true);
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)V")
	public synchronized void method6340() {
		this.method6357();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!hc;ZZZ)V")
	private synchronized void method6341(@OriginalArg(0) Class3_Sub24 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method6334(arg1);
		this.aClass181_1.method4188(arg0.aByteArray39);
		this.aBoolean601 = arg2;
		this.aLong215 = 0L;
		@Pc(24) int local24 = this.aClass181_1.method4199();
		for (@Pc(30) int local30 = 0; local30 < local24; local30++) {
			this.aClass181_1.method4200(local30);
			this.aClass181_1.method4193(local30);
			this.aClass181_1.method4192(local30);
		}
		this.anInt7647 = this.aClass181_1.method4195();
		this.anInt7646 = this.aClass181_1.anIntArray263[this.anInt7647];
		this.aLong214 = this.aClass181_1.method4198(this.anInt7646);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)V")
	private void method6342(@OriginalArg(1) int arg0) {
		if ((this.anIntArray481[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class3_Sub8 local22 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3088(); local22 != null; local22 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3084()) {
			if (arg0 == local22.anInt861 && this.aClass3_Sub8ArrayArray1[arg0][local22.anInt858] == null && local22.anInt866 < 0) {
				local22.anInt866 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(II)V")
	private void method6343(@OriginalArg(0) int arg0) {
		if ((this.anIntArray481[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class3_Sub8 local22 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3088(); local22 != null; local22 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3084()) {
			if (local22.anInt861 == arg0) {
				local22.anInt857 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)V")
	public synchronized void method6344() {
		for (@Pc(22) Class3_Sub9 local22 = (Class3_Sub9) this.aClass354_36.method7694(); local22 != null; local22 = (Class3_Sub9) this.aClass354_36.method7692()) {
			local22.method7825();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([ILclient!bk;III)Z")
	public boolean method6345(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class3_Sub8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.anInt853 = Static404.anInt6999 / 100;
		if (arg1.anInt866 >= 0 && (arg1.aClass3_Sub4_Sub1_1 == null || arg1.aClass3_Sub4_Sub1_1.method306())) {
			arg1.method735();
			arg1.method7825();
			if (arg1.anInt871 > 0 && this.aClass3_Sub8ArrayArray2[arg1.anInt861][arg1.anInt871] == arg1) {
				this.aClass3_Sub8ArrayArray2[arg1.anInt861][arg1.anInt871] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt856;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray489[arg1.anInt861] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt856 = local56;
		}
		arg1.aClass3_Sub4_Sub1_1.method298(this.method6368(arg1));
		@Pc(96) Class292 local96 = arg1.aClass292_1;
		arg1.anInt862++;
		arg1.anInt863 += local96.anInt7720;
		@Pc(111) boolean local111 = false;
		@Pc(129) double local129 = (double) ((arg1.anInt860 * arg1.anInt856 >> 12) + (arg1.anInt858 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt7724 > 0) {
			if (local96.anInt7722 <= 0) {
				arg1.anInt859 += 128;
			} else {
				arg1.anInt859 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt7722) * 128.0D + 0.5D);
			}
			if (local96.anInt7724 * arg1.anInt859 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray87 != null) {
			if (local96.anInt7718 <= 0) {
				arg1.anInt868 += 128;
			} else {
				arg1.anInt868 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt7718) * 128.0D + 0.5D);
			}
			while (local96.aByteArray87.length - 2 > arg1.anInt869 && arg1.anInt868 > (local96.aByteArray87[arg1.anInt869 + 2] & 0xFF) << 8) {
				arg1.anInt869 += 2;
			}
			if (arg1.anInt869 == local96.aByteArray87.length - 2 && local96.aByteArray87[arg1.anInt869 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg1.anInt866 >= 0 && local96.aByteArray86 != null && (this.anIntArray481[arg1.anInt861] & 0x1) == 0 && (arg1.anInt871 < 0 || this.aClass3_Sub8ArrayArray2[arg1.anInt861][arg1.anInt871] != arg1)) {
			if (local96.anInt7721 > 0) {
				arg1.anInt866 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt7721) * 128.0D + 0.5D);
			} else {
				arg1.anInt866 += 128;
			}
			while (arg1.anInt867 < local96.aByteArray86.length - 2 && arg1.anInt866 > (local96.aByteArray86[arg1.anInt867 + 2] & 0xFF) << 8) {
				arg1.anInt867 += 2;
			}
			if (arg1.anInt867 == local96.aByteArray86.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg1.aClass3_Sub4_Sub1_1.method301(arg1.anInt853, this.method6359(arg1), this.method6367(arg1));
			return false;
		}
		arg1.aClass3_Sub4_Sub1_1.method288(arg1.anInt853);
		if (arg0 == null) {
			arg1.aClass3_Sub4_Sub1_1.method6658(arg2);
		} else {
			arg1.aClass3_Sub4_Sub1_1.method6654(arg0, arg3, arg2);
		}
		if (arg1.aClass3_Sub4_Sub1_1.method274()) {
			this.aClass3_Sub4_Sub4_1.aClass3_Sub4_Sub2_2.method645(arg1.aClass3_Sub4_Sub1_1);
		}
		arg1.method735();
		if (arg1.anInt866 >= 0) {
			arg1.method7825();
			if (arg1.anInt871 > 0 && arg1 == this.aClass3_Sub8ArrayArray2[arg1.anInt861][arg1.anInt871]) {
				this.aClass3_Sub8ArrayArray2[arg1.anInt861][arg1.anInt871] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "()Lclient!nj;")
	@Override
	public synchronized Class3_Sub4 method6656() {
		return this.aClass3_Sub4_Sub4_1;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZLclient!bk;Z)V")
	public void method6346(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		@Pc(12) int local12 = arg1.aClass3_Sub48_Sub1_1.aByteArray91.length;
		@Pc(31) int local31;
		if (arg0 && arg1.aClass3_Sub48_Sub1_1.aBoolean659) {
			@Pc(41) int local41 = local12 + local12 - arg1.aClass3_Sub48_Sub1_1.anInt8530;
			local12 <<= 0x8;
			local31 = (int) ((long) local41 * (long) this.anIntArray487[arg1.anInt861] >> 6);
			if (local12 <= local31) {
				arg1.aClass3_Sub4_Sub1_1.method297();
				local31 = local12 + local12 - local31 - 1;
			}
		} else {
			local31 = (int) ((long) local12 * (long) this.anIntArray487[arg1.anInt861] >> 6);
		}
		arg1.aClass3_Sub4_Sub1_1.method281(local31);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!bk;)Z")
	public boolean method6347(@OriginalArg(1) Class3_Sub8 arg0) {
		if (arg0.aClass3_Sub4_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt866 >= 0) {
			arg0.method7825();
			if (arg0.anInt871 > 0 && this.aClass3_Sub8ArrayArray2[arg0.anInt861][arg0.anInt871] == arg0) {
				this.aClass3_Sub8ArrayArray2[arg0.anInt861][arg0.anInt871] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(III)V")
	private synchronized void method6348() {
		for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
			this.anIntArray493[local13] = 256;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!jea;ILclient!tf;Lclient!hc;I)Z")
	public synchronized boolean method6349(@OriginalArg(0) Class160 arg0, @OriginalArg(2) Class322 arg1, @OriginalArg(3) Class3_Sub24 arg2) {
		arg2.method3230();
		@Pc(9) boolean local9 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class3_Sub41 local27 = (Class3_Sub41) arg2.aClass354_16.method7694(); local27 != null; local27 = (Class3_Sub41) arg2.aClass354_16.method7692()) {
			@Pc(33) int local33 = (int) local27.aLong273;
			@Pc(41) Class3_Sub9 local41 = (Class3_Sub9) this.aClass354_36.method7689((long) local33);
			if (local41 == null) {
				local41 = Static75.method1577(local33, arg1);
				if (local41 == null) {
					local9 = false;
					continue;
				}
				this.aClass354_36.method7691(local41, (long) local33);
			}
			if (!local41.method754(local27.aByteArray76, arg0, local21)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method3229();
		}
		return local9;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIII)V")
	private void method6350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IIB)V")
	private void method6351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)Z")
	public synchronized boolean method6353() {
		return this.aClass181_1.method4194();
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(ZI)V")
	public synchronized void method6354(@OriginalArg(1) int arg0) {
		this.anInt7604 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IJ)V")
	private void method6355(@OriginalArg(1) long arg0) {
		while (this.aLong214 <= arg0) {
			@Pc(10) int local10 = this.anInt7647;
			@Pc(13) int local13 = this.anInt7646;
			@Pc(16) long local16 = this.aLong214;
			while (this.anInt7646 == local13) {
				while (this.aClass181_1.anIntArray263[local10] == local13) {
					this.aClass181_1.method4200(local10);
					@Pc(27) int local27 = this.aClass181_1.method4186(local10);
					if (local27 == 1) {
						this.aClass181_1.method4189();
						this.aClass181_1.method4192(local10);
						if (this.aClass181_1.method4187()) {
							if (!this.aBoolean601 || local13 == 0) {
								this.method6360(true);
								this.aClass181_1.method4190();
								return;
							}
							this.aClass181_1.method4201(local16);
						}
						break;
					}
					if ((local27 & 0x80) != 0 && (local27 & 0xF0) != 144) {
						this.method6339(local27);
					}
					this.aClass181_1.method4193(local10);
					this.aClass181_1.method4192(local10);
				}
				this.aLong215 = local16;
				local10 = this.aClass181_1.method4195();
				local13 = this.aClass181_1.anIntArray263[local10];
				local16 = this.aClass181_1.method4198(local13);
			}
			this.anInt7646 = local13;
			this.aLong214 = local16;
			this.anInt7647 = local10;
		}
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
	private void method6356() {
		@Pc(8) int local8 = this.anInt7647;
		@Pc(11) int local11 = this.anInt7646;
		@Pc(14) long local14 = this.aLong214;
		if (this.aClass3_Sub24_2 != null && this.anInt7649 == local11) {
			this.method6341(this.aClass3_Sub24_2, this.aBoolean602, this.aBoolean601);
			this.method6356();
			return;
		}
		while (this.anInt7646 == local11) {
			while (this.aClass181_1.anIntArray263[local8] == local11) {
				this.aClass181_1.method4200(local8);
				@Pc(47) int local47 = this.aClass181_1.method4186(local8);
				if (local47 == 1) {
					this.aClass181_1.method4189();
					this.aClass181_1.method4192(local8);
					if (this.aClass181_1.method4187()) {
						if (this.aClass3_Sub24_2 != null) {
							this.method6336(this.aClass3_Sub24_2, this.aBoolean601);
							this.method6356();
							return;
						}
						if (!this.aBoolean601 || local11 == 0) {
							this.method6360(true);
							this.aClass181_1.method4190();
							return;
						}
						this.aClass181_1.method4201(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method6339(local47);
				}
				this.aClass181_1.method4193(local8);
				this.aClass181_1.method4192(local8);
			}
			local8 = this.aClass181_1.method4195();
			local11 = this.aClass181_1.anIntArray263[local8];
			local14 = this.aClass181_1.method4198(local11);
		}
		this.anInt7647 = local8;
		this.anInt7646 = local11;
		this.aLong214 = local14;
		if (this.aClass3_Sub24_2 != null && this.anInt7649 < local11) {
			this.anInt7647 = -1;
			this.anInt7646 = this.anInt7649;
			this.aLong214 = this.aClass181_1.method4198(this.anInt7646);
		}
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(III)V")
	private void method6357() {
		this.anIntArray488[9] = 128;
		this.anIntArray491[9] = 128;
		this.method6364(9, 128);
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(II)V")
	private void method6358(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class3_Sub8 local16 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3088(); local16 != null; local16 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3084()) {
			if ((arg0 < 0 || arg0 == local16.anInt861) && local16.anInt866 < 0) {
				this.aClass3_Sub8ArrayArray1[local16.anInt861][local16.anInt858] = null;
				local16.anInt866 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!bk;I)I")
	private int method6359(@OriginalArg(0) Class3_Sub8 arg0) {
		if (this.anIntArray493[arg0.anInt861] == 0) {
			return 0;
		}
		@Pc(14) Class292 local14 = arg0.aClass292_1;
		@Pc(30) int local30 = this.anIntArray490[arg0.anInt861] * this.anIntArray492[arg0.anInt861] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt852 + 16384 >> 15;
		@Pc(56) int local56 = this.anInt7604 * local47 + 128 >> 8;
		local30 = local56 * this.anIntArray493[arg0.anInt861] + 128 >> 8;
		if (local14.anInt7724 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) arg0.anInt859 * 1.953125E-5D * (double) local14.anInt7724) + 0.5D);
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		@Pc(121) int local121;
		@Pc(133) int local133;
		if (local14.aByteArray87 != null) {
			local95 = arg0.anInt868;
			local103 = local14.aByteArray87[arg0.anInt869 + 1];
			if (local14.aByteArray87.length - 2 > arg0.anInt869) {
				local121 = (local14.aByteArray87[arg0.anInt869] & 0xFF) << 8;
				local133 = (local14.aByteArray87[arg0.anInt869 + 2] & 0xFF) << 8;
				local103 += (local14.aByteArray87[arg0.anInt869 + 3] - local103) * (-local121 + local95) / (local133 - local121);
			}
			local30 = local103 * local30 + 32 >> 6;
		}
		if (arg0.anInt866 > 0 && local14.aByteArray86 != null) {
			local95 = arg0.anInt866;
			local103 = local14.aByteArray86[arg0.anInt867 + 1];
			if (arg0.anInt867 < local14.aByteArray86.length - 2) {
				local121 = (local14.aByteArray86[arg0.anInt867] & 0xFF) << 8;
				local133 = (local14.aByteArray86[arg0.anInt867 + 2] & 0xFF) << 8;
				local103 += (local14.aByteArray86[arg0.anInt867 + 3] - local103) * (-local121 + local95) / (local133 - local121);
			}
			local30 = local103 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(ZI)V")
	private void method6360(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6366(-1);
		} else {
			this.method6358(-1);
		}
		this.method6365(-1);
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray484[local27] = this.anIntArray488[local27];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray491[local45] = this.anIntArray488[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "()Lclient!nj;")
	@Override
	public synchronized Class3_Sub4 method6660() {
		return null;
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(III)V")
	private void method6361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray486[arg0] = arg1;
		this.anIntArray478[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "(I)V")
	public synchronized void method6362() {
		for (@Pc(16) Class3_Sub9 local16 = (Class3_Sub9) this.aClass354_36.method7694(); local16 != null; local16 = (Class3_Sub9) this.aClass354_36.method7692()) {
			local16.method752();
		}
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)I")
	public int method6363() {
		return this.anInt7604;
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(III)V")
	private void method6364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray484[arg0]) {
			this.anIntArray484[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass3_Sub8ArrayArray2[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(II)V")
	private void method6365(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method6365(local9);
			}
			return;
		}
		this.anIntArray490[arg0] = 12800;
		this.anIntArray480[arg0] = 8192;
		this.anIntArray492[arg0] = 16383;
		this.anIntArray479[arg0] = 8192;
		this.anIntArray485[arg0] = 0;
		this.anIntArray489[arg0] = 8192;
		this.method6342(arg0);
		this.method6343(arg0);
		this.anIntArray481[arg0] = 0;
		this.anIntArray477[arg0] = 32767;
		this.anIntArray482[arg0] = 256;
		this.anIntArray487[arg0] = 0;
		this.method6361(arg0, 8192);
	}

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "(II)V")
	private void method6366(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class3_Sub8 local12 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3088(); local12 != null; local12 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3084()) {
			if (arg0 < 0 || local12.anInt861 == arg0) {
				if (local12.aClass3_Sub4_Sub1_1 != null) {
					local12.aClass3_Sub4_Sub1_1.method288(Static404.anInt6999 / 100);
					if (local12.aClass3_Sub4_Sub1_1.method274()) {
						this.aClass3_Sub4_Sub4_1.aClass3_Sub4_Sub2_2.method645(local12.aClass3_Sub4_Sub1_1);
					}
					local12.method735();
				}
				if (local12.anInt866 < 0) {
					this.aClass3_Sub8ArrayArray1[local12.anInt861][local12.anInt858] = null;
				}
				local12.method7825();
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLclient!bk;)I")
	private int method6367(@OriginalArg(1) Class3_Sub8 arg0) {
		@Pc(9) int local9 = this.anIntArray480[arg0.anInt861];
		return local9 >= 8192 ? 16384 - ((16384 - local9) * (-arg0.anInt854 + 128) + 32 >> 6) : arg0.anInt854 * local9 + 32 >> 6;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!bk;B)I")
	private int method6368(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(23) int local23 = arg0.anInt855 + (arg0.anInt860 * arg0.anInt856 >> 12);
		local23 += (this.anIntArray479[arg0.anInt861] - 8192) * this.anIntArray482[arg0.anInt861] >> 12;
		@Pc(44) Class292 local44 = arg0.aClass292_1;
		@Pc(64) int local64;
		if (local44.anInt7720 > 0 && (local44.anInt7717 > 0 || this.anIntArray485[arg0.anInt861] > 0)) {
			local64 = local44.anInt7717 << 2;
			@Pc(69) int local69 = local44.anInt7723 << 1;
			if (arg0.anInt862 < local69) {
				local64 = local64 * arg0.anInt862 / local69;
			}
			local64 += this.anIntArray485[arg0.anInt861] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt863 & 0x1FF) * 0.01227184630308513D);
			local23 += (int) ((double) local64 * local103);
		}
		local64 = (int) ((double) (arg0.aClass3_Sub48_Sub1_1.anInt8529 * 256) * Math.pow(2.0D, (double) local23 * 3.255208333333333E-4D) / (double) Static404.anInt6999 + 0.5D);
		return local64 >= 1 ? local64 : 1;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IIII)V")
	private void method6369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub8 local12 = this.aClass3_Sub8ArrayArray1[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub8ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray481[arg2] & 0x2) == 0) {
			local12.anInt866 = 0;
			return;
		}
		for (@Pc(44) Class3_Sub8 local44 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3088(); local44 != null; local44 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3084()) {
			if (local12.anInt861 == local44.anInt861 && local44.anInt866 < 0 && local12 != local44) {
				local12.anInt866 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(IIII)V")
	private void method6370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6369(arg0, 64, arg2);
		if ((this.anIntArray481[arg2] & 0x2) != 0) {
			for (@Pc(28) Class3_Sub8 local28 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3086(); local28 != null; local28 = (Class3_Sub8) this.aClass3_Sub4_Sub4_1.aClass112_59.method3080()) {
				if (arg2 == local28.anInt861 && local28.anInt866 < 0) {
					this.aClass3_Sub8ArrayArray1[arg2][local28.anInt858] = null;
					this.aClass3_Sub8ArrayArray1[arg2][arg0] = local28;
					@Pc(67) int local67 = (local28.anInt860 * local28.anInt856 >> 12) + local28.anInt855;
					local28.anInt855 += arg0 - local28.anInt858 << 8;
					local28.anInt858 = arg0;
					local28.anInt856 = 4096;
					local28.anInt860 = local67 - local28.anInt855;
					return;
				}
			}
		}
		@Pc(111) Class3_Sub9 local111 = (Class3_Sub9) this.aClass354_36.method7689((long) this.anIntArray484[arg2]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class3_Sub48_Sub1 local119 = local111.aClass3_Sub48_Sub1Array1[arg0];
		if (local119 == null) {
			return;
		}
		@Pc(126) Class3_Sub8 local126 = new Class3_Sub8();
		local126.aClass3_Sub9_1 = local111;
		local126.anInt861 = arg2;
		local126.aClass3_Sub48_Sub1_1 = local119;
		local126.aClass292_1 = local111.aClass292Array1[arg0];
		local126.anInt871 = local111.aByteArray16[arg0];
		local126.anInt858 = arg0;
		local126.anInt852 = local111.aByteArray18[arg0] * local111.anInt884 * arg1 * arg1 + 1024 >> 11;
		local126.anInt854 = local111.aByteArray17[arg0] & 0xFF;
		local126.anInt855 = (arg0 << 8) - (local111.aShortArray11[arg0] & 0x7FFF);
		local126.anInt869 = 0;
		local126.anInt868 = 0;
		local126.anInt866 = -1;
		local126.anInt867 = 0;
		local126.anInt859 = 0;
		if (this.anIntArray487[arg2] == 0) {
			local126.aClass3_Sub4_Sub1_1 = Static597.method277(local119, this.method6368(local126), this.method6359(local126), this.method6367(local126));
		} else {
			local126.aClass3_Sub4_Sub1_1 = Static597.method277(local119, this.method6368(local126), 0, this.method6367(local126));
			this.method6346(local111.aShortArray11[arg0] < 0, local126);
		}
		if (local111.aShortArray11[arg0] < 0) {
			local126.aClass3_Sub4_Sub1_1.method289(-1);
		}
		if (local126.anInt871 >= 0) {
			@Pc(283) Class3_Sub8 local283 = this.aClass3_Sub8ArrayArray2[arg2][local126.anInt871];
			if (local283 != null && local283.anInt866 < 0) {
				this.aClass3_Sub8ArrayArray1[arg2][local283.anInt858] = null;
				local283.anInt866 = 0;
			}
			this.aClass3_Sub8ArrayArray2[arg2][local126.anInt871] = local126;
		}
		this.aClass3_Sub4_Sub4_1.aClass112_59.method3079(local126);
		this.aClass3_Sub8ArrayArray1[arg2][arg0] = local126;
	}
}
