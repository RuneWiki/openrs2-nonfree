import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class1_Sub9_Sub4 extends Class1_Sub9 {

	@OriginalMember(owner = "client!s", name = "Gb", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!s", name = "Hb", descriptor = "I")
	private int anInt5940;

	@OriginalMember(owner = "client!s", name = "Jb", descriptor = "J")
	private long aLong184;

	@OriginalMember(owner = "client!s", name = "Kb", descriptor = "I")
	private int anInt5941;

	@OriginalMember(owner = "client!s", name = "Lb", descriptor = "Z")
	private boolean aBoolean493;

	@OriginalMember(owner = "client!s", name = "Mb", descriptor = "Lclient!ur;")
	private Class1_Sub43 aClass1_Sub43_4;

	@OriginalMember(owner = "client!s", name = "Nb", descriptor = "Z")
	private boolean aBoolean494;

	@OriginalMember(owner = "client!s", name = "Ob", descriptor = "I")
	private int anInt5942;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "[I")
	public final int[] anIntArray352 = new int[16];

	@OriginalMember(owner = "client!s", name = "K", descriptor = "[[Lclient!sd;")
	private final Class1_Sub36[][] aClass1_Sub36ArrayArray1 = new Class1_Sub36[16][128];

	@OriginalMember(owner = "client!s", name = "F", descriptor = "[I")
	private final int[] anIntArray354 = new int[16];

	@OriginalMember(owner = "client!s", name = "w", descriptor = "[I")
	private final int[] anIntArray351 = new int[16];

	@OriginalMember(owner = "client!s", name = "P", descriptor = "[I")
	private final int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!s", name = "X", descriptor = "[[Lclient!sd;")
	private final Class1_Sub36[][] aClass1_Sub36ArrayArray2 = new Class1_Sub36[16][128];

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "[I")
	private final int[] anIntArray358 = new int[16];

	@OriginalMember(owner = "client!s", name = "E", descriptor = "[I")
	private final int[] anIntArray353 = new int[16];

	@OriginalMember(owner = "client!s", name = "s", descriptor = "[I")
	private final int[] anIntArray350 = new int[16];

	@OriginalMember(owner = "client!s", name = "tb", descriptor = "[I")
	public final int[] anIntArray361 = new int[16];

	@OriginalMember(owner = "client!s", name = "B", descriptor = "I")
	private final int anInt5903 = 1000000;

	@OriginalMember(owner = "client!s", name = "pb", descriptor = "[I")
	private final int[] anIntArray360 = new int[16];

	@OriginalMember(owner = "client!s", name = "G", descriptor = "[I")
	private final int[] anIntArray355 = new int[16];

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "[I")
	private final int[] anIntArray359 = new int[16];

	@OriginalMember(owner = "client!s", name = "Bb", descriptor = "[I")
	private final int[] anIntArray364 = new int[16];

	@OriginalMember(owner = "client!s", name = "yb", descriptor = "[I")
	public final int[] anIntArray362 = new int[16];

	@OriginalMember(owner = "client!s", name = "xb", descriptor = "I")
	private int anInt5935 = 256;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "[I")
	private final int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!s", name = "Ab", descriptor = "[I")
	private final int[] anIntArray363 = new int[16];

	@OriginalMember(owner = "client!s", name = "Db", descriptor = "[I")
	private final int[] anIntArray365 = new int[16];

	@OriginalMember(owner = "client!s", name = "t", descriptor = "Lclient!sp;")
	private final Class225 aClass225_1 = new Class225();

	@OriginalMember(owner = "client!s", name = "Ib", descriptor = "Lclient!jb;")
	private final Class1_Sub9_Sub3 aClass1_Sub9_Sub3_1 = new Class1_Sub9_Sub3(this);

	@OriginalMember(owner = "client!s", name = "ob", descriptor = "Lclient!wa;")
	private final Class257 aClass257_27 = new Class257(128);

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class1_Sub9_Sub4() {
		this.method4608();
		this.method4627(true);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLclient!sd;)I")
	private int method4598(@OriginalArg(1) Class1_Sub36 arg0) {
		@Pc(14) int local14 = (arg0.anInt5981 * arg0.anInt5977 >> 12) + arg0.anInt5995;
		local14 += this.anIntArray353[arg0.anInt5975] * (this.anIntArray351[arg0.anInt5975] - 8192) >> 12;
		@Pc(35) Class155 local35 = arg0.aClass155_1;
		@Pc(60) int local60;
		if (local35.anInt3868 > 0 && (local35.anInt3867 > 0 || this.anIntArray356[arg0.anInt5975] > 0)) {
			@Pc(55) int local55 = local35.anInt3867 << 2;
			local60 = local35.anInt3864 << 1;
			if (local60 > arg0.anInt5974) {
				local55 = local55 * arg0.anInt5974 / local60;
			}
			local55 += this.anIntArray356[arg0.anInt5975] >> 7;
			@Pc(90) double local90 = Math.sin((double) (arg0.anInt5978 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local90 * (double) local55);
		}
		local60 = (int) ((double) (arg0.aClass1_Sub28_Sub1_2.anInt4314 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static155.anInt2607 + 0.5D);
		return local60 >= 1 ? local60 : 1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBI)V")
	private void method4599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!ur;Z)V")
	public synchronized void method4600(@OriginalArg(1) Class1_Sub43 arg0, @OriginalArg(2) boolean arg1) {
		this.method4628(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V")
	private void method4601(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub36 local16 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5437(); local16 != null; local16 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5433()) {
			if (arg0 < 0 || arg0 == local16.anInt5975) {
				if (local16.aClass1_Sub9_Sub1_2 != null) {
					local16.aClass1_Sub9_Sub1_2.method941(Static155.anInt2607 / 100);
					if (local16.aClass1_Sub9_Sub1_2.method914()) {
						this.aClass1_Sub9_Sub3_1.aClass1_Sub9_Sub2_2.method1036(local16.aClass1_Sub9_Sub1_2);
					}
					local16.method4661();
				}
				if (local16.anInt5984 < 0) {
					this.aClass1_Sub36ArrayArray2[local16.anInt5975][local16.anInt5983] = null;
				}
				local16.method5617();
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!sd;Z)I")
	private int method4602(@OriginalArg(0) Class1_Sub36 arg0) {
		@Pc(14) int local14 = this.anIntArray350[arg0.anInt5975];
		return local14 >= 8192 ? 16384 - ((128 - arg0.anInt5980) * (-local14 + 16384) + 32 >> 6) : local14 * arg0.anInt5980 + 32 >> 6;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Z")
	public synchronized boolean method4603() {
		return this.aClass225_1.method4804();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)V")
	private void method4604(@OriginalArg(1) int arg0) {
		if ((this.anIntArray361[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub36 local18 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5437(); local18 != null; local18 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5433()) {
			if (arg0 == local18.anInt5975 && this.aClass1_Sub36ArrayArray2[arg0][local18.anInt5983] == null && local18.anInt5984 < 0) {
				local18.anInt5984 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(BI)V")
	public synchronized void method4605(@OriginalArg(1) int arg0) {
		this.anInt5935 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	private void method4606(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4606(local12);
			}
			return;
		}
		this.anIntArray359[arg0] = 12800;
		this.anIntArray350[arg0] = 8192;
		this.anIntArray358[arg0] = 16383;
		this.anIntArray351[arg0] = 8192;
		this.anIntArray356[arg0] = 0;
		this.anIntArray364[arg0] = 8192;
		this.method4604(arg0);
		this.method4612(arg0);
		this.anIntArray361[arg0] = 0;
		this.anIntArray365[arg0] = 32767;
		this.anIntArray353[arg0] = 256;
		this.anIntArray362[arg0] = 0;
		this.method4618(8192, arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()Lclient!hf;")
	@Override
	public synchronized Class1_Sub9 method4591() {
		return null;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public synchronized void method4607() {
		this.method4621(true);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
	private synchronized void method4608() {
		for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
			this.anIntArray355[local21] = 256;
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "()I")
	@Override
	public synchronized int method4596() {
		return 0;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	public synchronized void method4610() {
		this.method4613();
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V")
	private void method4611(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub36 local8 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5437(); local8 != null; local8 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5433()) {
			if ((arg0 < 0 || arg0 == local8.anInt5975) && local8.anInt5984 < 0) {
				this.aClass1_Sub36ArrayArray2[local8.anInt5975][local8.anInt5983] = null;
				local8.anInt5984 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4592(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass225_1.method4804()) {
			@Pc(14) int local14 = this.aClass225_1.anInt6257 * this.anInt5903 / Static155.anInt2607;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong184;
				if (this.aLong183 - local23 >= 0L) {
					this.aLong184 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong183 + (long) local14 - this.aLong184 - 1L) / (long) local14);
				this.aLong184 += (long) local52 * (long) local14;
				this.aClass1_Sub9_Sub3_1.method4592(arg0, arg1, local52);
				arg1 += local52;
				arg2 -= local52;
				this.method4630();
			} while (this.aClass225_1.method4804());
		}
		this.aClass1_Sub9_Sub3_1.method4592(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4597(@OriginalArg(0) int arg0) {
		if (this.aClass225_1.method4804()) {
			@Pc(18) int local18 = this.aClass225_1.anInt6257 * this.anInt5903 / Static155.anInt2607;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong184;
				if (this.aLong183 - local27 >= 0L) {
					this.aLong184 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong183 + (long) local18 - this.aLong184 - 1L) / (long) local18);
				this.aLong184 += (long) local18 * (long) local58;
				this.aClass1_Sub9_Sub3_1.method4597(local58);
				arg0 -= local58;
				this.method4630();
			} while (this.aClass225_1.method4804());
		}
		this.aClass1_Sub9_Sub3_1.method4597(arg0);
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(II)V")
	private void method4612(@OriginalArg(0) int arg0) {
		if ((this.anIntArray361[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub36 local15 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5437(); local15 != null; local15 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5433()) {
			if (arg0 == local15.anInt5975) {
				local15.anInt5985 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(III)V")
	private void method4613() {
		this.anIntArray354[9] = 128;
		this.anIntArray357[9] = 128;
		this.method4634(9, 128);
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "()Lclient!hf;")
	@Override
	public synchronized Class1_Sub9 method4595() {
		return this.aClass1_Sub9_Sub3_1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)V")
	private void method4614(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4623(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method4622(local24, local18, local30);
			} else {
				this.method4623(local18, local24, 64);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4599(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray357[local18] = (local30 << 14) + (this.anIntArray357[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray357[local18] = (this.anIntArray357[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray356[local18] = (this.anIntArray356[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray356[local18] = local30 + (this.anIntArray356[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray364[local18] = (local30 << 7) + (this.anIntArray364[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray364[local18] = local30 + (this.anIntArray364[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray359[local18] = (local30 << 7) + (this.anIntArray359[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray359[local18] = local30 + (this.anIntArray359[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray350[local18] = (local30 << 7) + (this.anIntArray350[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray350[local18] = (this.anIntArray350[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray358[local18] = (local30 << 7) + (this.anIntArray358[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray358[local18] = (this.anIntArray358[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray361[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray361[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method4604(local18);
					this.anIntArray361[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray361[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray365[local18] = (this.anIntArray365[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray365[local18] = (this.anIntArray365[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray365[local18] = (this.anIntArray365[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray365[local18] = local30 + (this.anIntArray365[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method4601(local18);
			}
			if (local24 == 121) {
				this.method4606(local18);
			}
			if (local24 == 123) {
				this.method4611(local18);
			}
			@Pc(505) int local505;
			if (local24 == 6) {
				local505 = this.anIntArray365[local18];
				if (local505 == 16384) {
					this.anIntArray353[local18] = (local30 << 7) + (this.anIntArray353[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local505 = this.anIntArray365[local18];
				if (local505 == 16384) {
					this.anIntArray353[local18] = (this.anIntArray353[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray362[local18] = (this.anIntArray362[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray362[local18] = (this.anIntArray362[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray361[local18] |= 0x4;
				} else {
					this.method4612(local18);
					this.anIntArray361[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method4618((this.anIntArray363[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method4618((this.anIntArray363[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4634(local18, local24 + this.anIntArray357[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4625(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method4632(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4627(true);
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(BLclient!sd;)Z")
	public boolean method4615(@OriginalArg(1) Class1_Sub36 arg0) {
		if (arg0.aClass1_Sub9_Sub1_2 != null) {
			return false;
		}
		if (arg0.anInt5984 >= 0) {
			arg0.method5617();
			if (arg0.anInt5982 > 0 && this.aClass1_Sub36ArrayArray1[arg0.anInt5975][arg0.anInt5982] == arg0) {
				this.aClass1_Sub36ArrayArray1[arg0.anInt5975][arg0.anInt5982] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!rt;Lclient!ic;IILclient!ur;)Z")
	public synchronized boolean method4616(@OriginalArg(0) Class219 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(4) Class1_Sub43 arg2) {
		arg2.method5184();
		@Pc(15) boolean local15 = true;
		@Pc(29) int[] local29 = new int[] { 22050 };
		for (@Pc(35) Class1_Sub35 local35 = (Class1_Sub35) arg2.aClass257_32.method5506(); local35 != null; local35 = (Class1_Sub35) arg2.aClass257_32.method5501()) {
			@Pc(41) int local41 = (int) local35.aLong226;
			@Pc(49) Class1_Sub37 local49 = (Class1_Sub37) this.aClass257_27.method5503((long) local41);
			if (local49 == null) {
				local49 = Static5.method96(local41, arg1);
				if (local49 == null) {
					local15 = false;
					continue;
				}
				this.aClass257_27.method5504(local49, (long) local41);
			}
			if (!local49.method4732(local35.aByteArray66, arg0, local29)) {
				local15 = false;
			}
		}
		if (local15) {
			arg2.method5185();
		}
		return local15;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!sd;I[IBI)Z")
	public boolean method4617(@OriginalArg(0) Class1_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg0.anInt5989 = Static155.anInt2607 / 100;
		if (arg0.anInt5984 >= 0 && (arg0.aClass1_Sub9_Sub1_2 == null || arg0.aClass1_Sub9_Sub1_2.method922())) {
			arg0.method4661();
			arg0.method5617();
			if (arg0.anInt5982 > 0 && arg0 == this.aClass1_Sub36ArrayArray1[arg0.anInt5975][arg0.anInt5982]) {
				this.aClass1_Sub36ArrayArray1[arg0.anInt5975][arg0.anInt5982] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg0.anInt5981;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray364[arg0.anInt5975] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg0.anInt5981 = local59;
		}
		arg0.aClass1_Sub9_Sub1_2.method924(this.method4598(arg0));
		@Pc(102) Class155 local102 = arg0.aClass155_1;
		@Pc(104) boolean local104 = false;
		arg0.anInt5974++;
		arg0.anInt5978 += local102.anInt3868;
		@Pc(140) double local140 = (double) ((arg0.anInt5981 * arg0.anInt5977 >> 12) + (arg0.anInt5983 - 60 << 8)) * 5.086263020833333E-6D;
		if (local102.anInt3863 > 0) {
			if (local102.anInt3869 <= 0) {
				arg0.anInt5988 += 128;
			} else {
				arg0.anInt5988 += (int) (Math.pow(2.0D, local140 * (double) local102.anInt3869) * 128.0D + 0.5D);
			}
			if (local102.anInt3863 * arg0.anInt5988 >= 819200) {
				local104 = true;
			}
		}
		if (local102.aByteArray40 != null) {
			if (local102.anInt3865 > 0) {
				arg0.anInt5996 += (int) (Math.pow(2.0D, local140 * (double) local102.anInt3865) * 128.0D + 0.5D);
			} else {
				arg0.anInt5996 += 128;
			}
			while (local102.aByteArray40.length - 2 > arg0.anInt5986 && arg0.anInt5996 > (local102.aByteArray40[arg0.anInt5986 + 2] & 0xFF) << 8) {
				arg0.anInt5986 += 2;
			}
			if (local102.aByteArray40.length - 2 == arg0.anInt5986 && local102.aByteArray40[arg0.anInt5986 + 1] == 0) {
				local104 = true;
			}
		}
		if (arg0.anInt5984 >= 0 && local102.aByteArray41 != null && (this.anIntArray361[arg0.anInt5975] & 0x1) == 0 && (arg0.anInt5982 < 0 || this.aClass1_Sub36ArrayArray1[arg0.anInt5975][arg0.anInt5982] != arg0)) {
			if (local102.anInt3866 > 0) {
				arg0.anInt5984 += (int) (Math.pow(2.0D, local140 * (double) local102.anInt3866) * 128.0D + 0.5D);
			} else {
				arg0.anInt5984 += 128;
			}
			while (local102.aByteArray41.length - 2 > arg0.anInt5976 && (local102.aByteArray41[arg0.anInt5976 + 2] & 0xFF) << 8 < arg0.anInt5984) {
				arg0.anInt5976 += 2;
			}
			if (local102.aByteArray41.length - 2 == arg0.anInt5976) {
				local104 = true;
			}
		}
		if (!local104) {
			arg0.aClass1_Sub9_Sub1_2.method947(arg0.anInt5989, this.method4629(arg0), this.method4602(arg0));
			return false;
		}
		arg0.aClass1_Sub9_Sub1_2.method941(arg0.anInt5989);
		if (arg2 == null) {
			arg0.aClass1_Sub9_Sub1_2.method4597(arg3);
		} else {
			arg0.aClass1_Sub9_Sub1_2.method4592(arg2, arg1, arg3);
		}
		if (arg0.aClass1_Sub9_Sub1_2.method914()) {
			this.aClass1_Sub9_Sub3_1.aClass1_Sub9_Sub2_2.method1036(arg0.aClass1_Sub9_Sub1_2);
		}
		arg0.method4661();
		if (arg0.anInt5984 >= 0) {
			arg0.method5617();
			if (arg0.anInt5982 > 0 && this.aClass1_Sub36ArrayArray1[arg0.anInt5975][arg0.anInt5982] == arg0) {
				this.aClass1_Sub36ArrayArray1[arg0.anInt5975][arg0.anInt5982] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(III)V")
	private void method4618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray363[arg1] = arg0;
		this.anIntArray352[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	public synchronized void method4620() {
		for (@Pc(17) Class1_Sub37 local17 = (Class1_Sub37) this.aClass257_27.method5506(); local17 != null; local17 = (Class1_Sub37) this.aClass257_27.method5501()) {
			local17.method4728();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZB)V")
	private synchronized void method4621(@OriginalArg(0) boolean arg0) {
		this.aClass225_1.method4809();
		this.aClass1_Sub43_4 = null;
		this.method4627(arg0);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBII)V")
	private void method4622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4623(arg1, arg0, 64);
		if ((this.anIntArray361[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub36 local28 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5439(); local28 != null; local28 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5435()) {
				if (arg1 == local28.anInt5975 && local28.anInt5984 < 0) {
					this.aClass1_Sub36ArrayArray2[arg1][local28.anInt5983] = null;
					this.aClass1_Sub36ArrayArray2[arg1][arg0] = local28;
					@Pc(63) int local63 = (local28.anInt5977 * local28.anInt5981 >> 12) + local28.anInt5995;
					local28.anInt5995 += arg0 - local28.anInt5983 << 8;
					local28.anInt5983 = arg0;
					local28.anInt5977 = local63 - local28.anInt5995;
					local28.anInt5981 = 4096;
					return;
				}
			}
		}
		@Pc(108) Class1_Sub37 local108 = (Class1_Sub37) this.aClass257_27.method5503((long) this.anIntArray360[arg1]);
		if (local108 == null) {
			return;
		}
		@Pc(116) Class1_Sub28_Sub1 local116 = local108.aClass1_Sub28_Sub1Array1[arg0];
		if (local116 == null) {
			return;
		}
		@Pc(123) Class1_Sub36 local123 = new Class1_Sub36();
		local123.aClass1_Sub37_1 = local108;
		local123.anInt5975 = arg1;
		local123.aClass1_Sub28_Sub1_2 = local116;
		local123.aClass155_1 = local108.aClass155Array1[arg0];
		local123.anInt5982 = local108.aByteArray69[arg0];
		local123.anInt5983 = arg0;
		local123.anInt5994 = local108.anInt6145 * arg2 * arg2 * local108.aByteArray70[arg0] + 1024 >> 11;
		local123.anInt5980 = local108.aByteArray68[arg0] & 0xFF;
		local123.anInt5995 = (arg0 << 8) - (local108.aShortArray77[arg0] & 0x7FFF);
		local123.anInt5986 = 0;
		local123.anInt5988 = 0;
		local123.anInt5984 = -1;
		local123.anInt5996 = 0;
		local123.anInt5976 = 0;
		if (this.anIntArray362[arg1] == 0) {
			local123.aClass1_Sub9_Sub1_2 = Static457.method911(local116, this.method4598(local123), this.method4629(local123), this.method4602(local123));
		} else {
			local123.aClass1_Sub9_Sub1_2 = Static457.method911(local116, this.method4598(local123), 0, this.method4602(local123));
			this.method4626(local123, local108.aShortArray77[arg0] < 0);
		}
		if (local108.aShortArray77[arg0] < 0) {
			local123.aClass1_Sub9_Sub1_2.method934(-1);
		}
		if (local123.anInt5982 >= 0) {
			@Pc(278) Class1_Sub36 local278 = this.aClass1_Sub36ArrayArray1[arg1][local123.anInt5982];
			if (local278 != null && local278.anInt5984 < 0) {
				this.aClass1_Sub36ArrayArray2[arg1][local278.anInt5983] = null;
				local278.anInt5984 = 0;
			}
			this.aClass1_Sub36ArrayArray1[arg1][local123.anInt5982] = local123;
		}
		this.aClass1_Sub9_Sub3_1.aClass254_19.method5430(local123);
		this.aClass1_Sub36ArrayArray2[arg1][arg0] = local123;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
	private void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class1_Sub36 local12 = this.aClass1_Sub36ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub36ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray361[arg0] & 0x2) == 0) {
			local12.anInt5984 = 0;
			return;
		}
		for (@Pc(51) Class1_Sub36 local51 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5437(); local51 != null; local51 = (Class1_Sub36) this.aClass1_Sub9_Sub3_1.aClass254_19.method5433()) {
			if (local12.anInt5975 == local51.anInt5975 && local51.anInt5984 < 0 && local51 != local12) {
				local12.anInt5984 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)I")
	public int method4624() {
		return this.anInt5935;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(III)V")
	private void method4625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!sd;Z)V")
	public void method4626(@OriginalArg(1) Class1_Sub36 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass1_Sub28_Sub1_2.aByteArray48.length;
		@Pc(33) int local33;
		if (arg1 && arg0.aClass1_Sub28_Sub1_2.aBoolean341) {
			@Pc(44) int local44 = local8 + local8 - arg0.aClass1_Sub28_Sub1_2.anInt4315;
			local8 <<= 0x8;
			local33 = (int) ((long) this.anIntArray362[arg0.anInt5975] * (long) local44 >> 6);
			if (local33 >= local8) {
				local33 = local8 + local8 - local33 - 1;
				arg0.aClass1_Sub9_Sub1_2.method944();
			}
		} else {
			local33 = (int) ((long) this.anIntArray362[arg0.anInt5975] * (long) local8 >> 6);
		}
		arg0.aClass1_Sub9_Sub1_2.method913(local33);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(ZB)V")
	private void method4627(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4601(-1);
		} else {
			this.method4611(-1);
		}
		this.method4606(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray360[local23] = this.anIntArray354[local23];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray357[local49] = this.anIntArray354[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZBLclient!ur;)V")
	private synchronized void method4628(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class1_Sub43 arg2) {
		this.method4621(arg0);
		this.aClass225_1.method4808(arg2.aByteArray81);
		this.aLong184 = 0L;
		this.aBoolean493 = arg1;
		@Pc(24) int local24 = this.aClass225_1.method4810();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass225_1.method4816(local26);
			this.aClass225_1.method4806(local26);
			this.aClass225_1.method4814(local26);
		}
		this.anInt5940 = this.aClass225_1.method4803();
		this.anInt5941 = this.aClass225_1.anIntArray381[this.anInt5940];
		this.aLong183 = this.aClass225_1.method4805(this.anInt5941);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!sd;)I")
	private int method4629(@OriginalArg(1) Class1_Sub36 arg0) {
		if (this.anIntArray355[arg0.anInt5975] == 0) {
			return 0;
		}
		@Pc(14) Class155 local14 = arg0.aClass155_1;
		@Pc(30) int local30 = this.anIntArray359[arg0.anInt5975] * this.anIntArray358[arg0.anInt5975] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt5994 + 16384 >> 15;
		@Pc(56) int local56 = this.anInt5935 * local47 + 128 >> 8;
		local30 = this.anIntArray355[arg0.anInt5975] * local56 + 128 >> 8;
		if (local14.anInt3863 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) arg0.anInt5988 * 1.953125E-5D * (double) local14.anInt3863) + 0.5D);
		}
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(124) int local124;
		@Pc(136) int local136;
		if (local14.aByteArray40 != null) {
			local98 = arg0.anInt5996;
			local106 = local14.aByteArray40[arg0.anInt5986 + 1];
			if (arg0.anInt5986 < local14.aByteArray40.length - 2) {
				local124 = (local14.aByteArray40[arg0.anInt5986] & 0xFF) << 8;
				local136 = (local14.aByteArray40[arg0.anInt5986 + 2] & 0xFF) << 8;
				local106 += (local98 - local124) * (-local106 + local14.aByteArray40[arg0.anInt5986 + 3]) / (local136 - local124);
			}
			local30 = local30 * local106 + 32 >> 6;
		}
		if (arg0.anInt5984 > 0 && local14.aByteArray41 != null) {
			local98 = arg0.anInt5984;
			local106 = local14.aByteArray41[arg0.anInt5976 + 1];
			if (arg0.anInt5976 < local14.aByteArray41.length - 2) {
				local124 = (local14.aByteArray41[arg0.anInt5976] & 0xFF) << 8;
				local136 = (local14.aByteArray41[arg0.anInt5976 + 2] & 0xFF) << 8;
				local106 += (local98 - local124) * (-local106 + local14.aByteArray41[arg0.anInt5976 + 3]) / (local136 - local124);
			}
			local30 = local30 * local106 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
	private void method4630() {
		@Pc(8) int local8 = this.anInt5940;
		@Pc(11) int local11 = this.anInt5941;
		@Pc(14) long local14 = this.aLong183;
		if (this.aClass1_Sub43_4 != null && local11 == this.anInt5942) {
			this.method4628(this.aBoolean494, this.aBoolean493, this.aClass1_Sub43_4);
			this.method4630();
			return;
		}
		while (local11 == this.anInt5941) {
			while (local11 == this.aClass225_1.anIntArray381[local8]) {
				this.aClass225_1.method4816(local8);
				@Pc(51) int local51 = this.aClass225_1.method4811(local8);
				if (local51 == 1) {
					this.aClass225_1.method4815();
					this.aClass225_1.method4814(local8);
					if (this.aClass225_1.method4807()) {
						if (this.aClass1_Sub43_4 != null) {
							this.method4600(this.aClass1_Sub43_4, this.aBoolean493);
							this.method4630();
							return;
						}
						if (!this.aBoolean493 || local11 == 0) {
							this.method4627(true);
							this.aClass225_1.method4809();
							return;
						}
						this.aClass225_1.method4818(local14);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method4614(local51);
				}
				this.aClass225_1.method4806(local8);
				this.aClass225_1.method4814(local8);
			}
			local8 = this.aClass225_1.method4803();
			local11 = this.aClass225_1.anIntArray381[local8];
			local14 = this.aClass225_1.method4805(local11);
		}
		this.anInt5940 = local8;
		this.anInt5941 = local11;
		this.aLong183 = local14;
		if (this.aClass1_Sub43_4 != null && local11 > this.anInt5942) {
			this.anInt5941 = this.anInt5942;
			this.anInt5940 = -1;
			this.aLong183 = this.aClass225_1.method4805(this.anInt5941);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	public synchronized void method4631() {
		for (@Pc(11) Class1_Sub37 local11 = (Class1_Sub37) this.aClass257_27.method5506(); local11 != null; local11 = (Class1_Sub37) this.aClass257_27.method5501()) {
			local11.method5617();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)V")
	private void method4632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray351[arg0] = arg1;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(III)V")
	private void method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray360[arg0]) {
			this.anIntArray360[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass1_Sub36ArrayArray1[arg0][local24] = null;
			}
		}
	}
}
