import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class6_Sub17_Sub4 extends Class6_Sub17 {

	@OriginalMember(owner = "client!ng", name = "ab", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "client!ng", name = "Ib", descriptor = "J")
	private long aLong229;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	private int anInt6859;

	@OriginalMember(owner = "client!ng", name = "ub", descriptor = "Z")
	private boolean aBoolean510;

	@OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
	private int anInt6860;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "Lclient!jk;")
	private Class6_Sub27 aClass6_Sub27_2;

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "Z")
	private boolean aBoolean511;

	@OriginalMember(owner = "client!ng", name = "sb", descriptor = "I")
	private int anInt6861;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "[I")
	private final int[] anIntArray411 = new int[16];

	@OriginalMember(owner = "client!ng", name = "cb", descriptor = "I")
	private int anInt6818 = 256;

	@OriginalMember(owner = "client!ng", name = "Db", descriptor = "[I")
	private final int[] anIntArray412 = new int[16];

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "[I")
	private final int[] anIntArray413 = new int[16];

	@OriginalMember(owner = "client!ng", name = "Cb", descriptor = "[I")
	private final int[] anIntArray410 = new int[16];

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "[[Lclient!tia;")
	private final Class6_Sub49[][] aClass6_Sub49ArrayArray2 = new Class6_Sub49[16][128];

	@OriginalMember(owner = "client!ng", name = "db", descriptor = "[I")
	private final int[] anIntArray415 = new int[16];

	@OriginalMember(owner = "client!ng", name = "Bb", descriptor = "[I")
	private final int[] anIntArray417 = new int[16];

	@OriginalMember(owner = "client!ng", name = "R", descriptor = "[I")
	private final int[] anIntArray418 = new int[16];

	@OriginalMember(owner = "client!ng", name = "gb", descriptor = "[I")
	private final int[] anIntArray422 = new int[16];

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "[I")
	private final int[] anIntArray416 = new int[16];

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "[I")
	public final int[] anIntArray420 = new int[16];

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "[I")
	private final int[] anIntArray414 = new int[16];

	@OriginalMember(owner = "client!ng", name = "T", descriptor = "[I")
	public final int[] anIntArray419 = new int[16];

	@OriginalMember(owner = "client!ng", name = "Gb", descriptor = "I")
	private final int anInt6828 = 1000000;

	@OriginalMember(owner = "client!ng", name = "zb", descriptor = "[[Lclient!tia;")
	private final Class6_Sub49[][] aClass6_Sub49ArrayArray1 = new Class6_Sub49[16][128];

	@OriginalMember(owner = "client!ng", name = "H", descriptor = "[I")
	private final int[] anIntArray424 = new int[16];

	@OriginalMember(owner = "client!ng", name = "ob", descriptor = "[I")
	public final int[] anIntArray421 = new int[16];

	@OriginalMember(owner = "client!ng", name = "eb", descriptor = "[I")
	private final int[] anIntArray425 = new int[16];

	@OriginalMember(owner = "client!ng", name = "qb", descriptor = "[I")
	private final int[] anIntArray423 = new int[16];

	@OriginalMember(owner = "client!ng", name = "Eb", descriptor = "Lclient!ve;")
	private final Class375 aClass375_1 = new Class375();

	@OriginalMember(owner = "client!ng", name = "W", descriptor = "Lclient!ek;")
	private final Class6_Sub17_Sub1 aClass6_Sub17_Sub1_1 = new Class6_Sub17_Sub1(this);

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "Lclient!dfa;")
	private final Class74 aClass74_42;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class6_Sub17_Sub4() {
		this.aClass74_42 = new Class74(128);
		this.method6063(256, -1);
		this.method6087(true);
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!ng;)V")
	public Class6_Sub17_Sub4(@OriginalArg(0) Class6_Sub17_Sub4 arg0) {
		this.aClass74_42 = arg0.aClass74_42;
		this.method6063(256, -1);
		this.method6087(true);
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)V")
	public synchronized void method6059() {
		for (@Pc(7) Class6_Sub22 local7 = (Class6_Sub22) this.aClass74_42.method1404(); local7 != null; local7 = (Class6_Sub22) this.aClass74_42.method1405()) {
			local7.method4006();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)V")
	private synchronized void method6060(@OriginalArg(0) boolean arg0) {
		this.aClass375_1.method8657();
		this.aClass6_Sub27_2 = null;
		this.method6087(arg0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)V")
	private void method6061(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method6061(local12);
			}
			return;
		}
		this.anIntArray411[arg0] = 12800;
		this.anIntArray417[arg0] = 8192;
		this.anIntArray418[arg0] = 16383;
		this.anIntArray410[arg0] = 8192;
		this.anIntArray424[arg0] = 0;
		this.anIntArray423[arg0] = 8192;
		this.method6086(arg0);
		this.method6074(arg0);
		this.anIntArray421[arg0] = 0;
		this.anIntArray415[arg0] = 32767;
		this.anIntArray422[arg0] = 256;
		this.anIntArray420[arg0] = 0;
		this.method6071(arg0, 8192);
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(IIII)V")
	private void method6062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class6_Sub49 local12 = this.aClass6_Sub49ArrayArray1[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass6_Sub49ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray421[arg1] & 0x2) == 0) {
			local12.anInt9355 = 0;
			return;
		}
		for (@Pc(49) Class6_Sub49 local49 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8124(); local49 != null; local49 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8134()) {
			if (local49.anInt9358 == local12.anInt9358 && local49.anInt9355 < 0 && local49 != local12) {
				local12.anInt9355 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)V")
	public synchronized void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
				this.anIntArray412[local5] = arg0;
			}
		} else {
			this.anIntArray412[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IB)V")
	public synchronized void method6064(@OriginalArg(0) int arg0) {
		this.anInt6818 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIB)V")
	private void method6066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray410[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZJLclient!jk;BZ)V")
	public synchronized void method6067(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class6_Sub27 arg2) {
		this.method6094(arg2, arg0, true);
		this.method6068(arg1 * (long) this.aClass375_1.anInt9967);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IJ)V")
	private void method6068(@OriginalArg(1) long arg0) {
		while (this.aLong228 <= arg0) {
			@Pc(18) int local18 = this.anInt6860;
			@Pc(21) int local21 = this.anInt6859;
			@Pc(24) long local24 = this.aLong228;
			while (local21 == this.anInt6859) {
				while (this.aClass375_1.anIntArray657[local18] == local21) {
					this.aClass375_1.method8651(local18);
					@Pc(37) int local37 = this.aClass375_1.method8661(local18);
					if (local37 == 1) {
						this.aClass375_1.method8656();
						this.aClass375_1.method8655(local18);
						if (this.aClass375_1.method8658()) {
							if (!this.aBoolean510 || local21 == 0) {
								this.method6087(true);
								this.aClass375_1.method8657();
								return;
							}
							this.aClass375_1.method8647(local24);
						}
						break;
					}
					if ((local37 & 0x80) != 0 && (local37 & 0xF0) != 144) {
						this.method6085(local37);
					}
					this.aClass375_1.method8646(local18);
					this.aClass375_1.method8655(local18);
				}
				this.aLong229 = local24;
				local18 = this.aClass375_1.method8652();
				local21 = this.aClass375_1.anIntArray657[local18];
				local24 = this.aClass375_1.method8659(local21);
			}
			this.anInt6860 = local18;
			this.aLong228 = local24;
			this.anInt6859 = local21;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	private void method6069(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class6_Sub49 local12 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8124(); local12 != null; local12 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8134()) {
			if ((arg0 < 0 || arg0 == local12.anInt9358) && local12.anInt9355 < 0) {
				this.aClass6_Sub49ArrayArray1[local12.anInt9358][local12.anInt9359] = null;
				local12.anInt9355 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	private void method6070() {
		this.anIntArray413[9] = 128;
		this.anIntArray414[9] = 128;
		this.method6092(9, 128);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI)V")
	private void method6071(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray425[arg0] = arg1;
		this.anIntArray419[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)I")
	public int method6072() {
		return this.anInt6818;
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(B)V")
	public synchronized void method6073() {
		for (@Pc(11) Class6_Sub22 local11 = (Class6_Sub22) this.aClass74_42.method1404(); local11 != null; local11 = (Class6_Sub22) this.aClass74_42.method1405()) {
			local11.method9051();
		}
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(II)V")
	private void method6074(@OriginalArg(0) int arg0) {
		if ((this.anIntArray421[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class6_Sub49 local22 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8124(); local22 != null; local22 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8134()) {
			if (arg0 == local22.anInt9358) {
				local22.anInt9361 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "()Lclient!jn;")
	@Override
	public synchronized Class6_Sub17 method8140() {
		return this.aClass6_Sub17_Sub1_1;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)V")
	private void method6075(@OriginalArg(0) int arg0) {
		for (@Pc(17) Class6_Sub49 local17 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8124(); local17 != null; local17 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8134()) {
			if (arg0 < 0 || local17.anInt9358 == arg0) {
				if (local17.aClass6_Sub17_Sub2_4 != null) {
					local17.aClass6_Sub17_Sub2_4.method3917(Static90.anInt9479 / 100);
					if (local17.aClass6_Sub17_Sub2_4.method3928()) {
						this.aClass6_Sub17_Sub1_1.aClass6_Sub17_Sub3_1.method4661(local17.aClass6_Sub17_Sub2_4);
					}
					local17.method8178();
				}
				if (local17.anInt9355 < 0) {
					this.aClass6_Sub49ArrayArray1[local17.anInt9358][local17.anInt9359] = null;
				}
				local17.method9051();
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!tia;Z)Z")
	public boolean method6076(@OriginalArg(0) Class6_Sub49 arg0) {
		if (arg0.aClass6_Sub17_Sub2_4 != null) {
			return false;
		}
		if (arg0.anInt9355 >= 0) {
			arg0.method9051();
			if (arg0.anInt9352 > 0 && this.aClass6_Sub49ArrayArray2[arg0.anInt9358][arg0.anInt9352] == arg0) {
				this.aClass6_Sub49ArrayArray2[arg0.anInt9358][arg0.anInt9352] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)Z")
	public synchronized boolean method6077() {
		return this.aClass375_1.method8654();
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIII)V")
	private void method6078(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!jk;Lclient!lga;IILclient!iv;)Z")
	public synchronized boolean method6079(@OriginalArg(0) Class6_Sub27 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(4) Class181 arg2) {
		arg0.method4714();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class6_Sub51 local29 = (Class6_Sub51) arg0.aClass74_33.method1404(); local29 != null; local29 = (Class6_Sub51) arg0.aClass74_33.method1405()) {
			@Pc(37) int local37 = (int) local29.aLong346;
			@Pc(45) Class6_Sub22 local45 = (Class6_Sub22) this.aClass74_42.method1401((long) local37);
			if (local45 == null) {
				local45 = Static155.method3081(local37, arg1);
				if (local45 == null) {
					local9 = false;
					continue;
				}
				this.aClass74_42.method1399(local45, (long) local37);
			}
			if (!local45.method4008(local23, local29.aByteArray103, arg2)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method4715();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "()I")
	@Override
	public synchronized int method8141() {
		return 0;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(III)V")
	public synchronized void method6080() {
		this.method6070();
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)V")
	private void method6081(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8144(@OriginalArg(0) int arg0) {
		if (this.aClass375_1.method8654()) {
			@Pc(18) int local18 = this.aClass375_1.anInt9967 * this.anInt6828 / Static90.anInt9479;
			do {
				@Pc(27) long local27 = this.aLong229 + (long) local18 * (long) arg0;
				if (this.aLong228 - local27 >= 0L) {
					this.aLong229 = local27;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong228 - this.aLong229 - 1L) / (long) local18);
				this.aLong229 += (long) local57 * (long) local18;
				arg0 -= local57;
				this.aClass6_Sub17_Sub1_1.method8144(local57);
				this.method6089();
			} while (this.aClass375_1.method8654());
		}
		this.aClass6_Sub17_Sub1_1.method8144(arg0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZZLclient!jk;)V")
	public synchronized void method6083(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6_Sub27 arg1) {
		this.method6094(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(II)V")
	private void method6085(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6062(local22, local16, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method6062(local22, local16, 64);
			} else {
				this.method6088(local28, local22, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6078(local16, local28, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray414[local16] = (this.anIntArray414[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray414[local16] = (this.anIntArray414[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray424[local16] = (this.anIntArray424[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray424[local16] = local28 + (this.anIntArray424[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray423[local16] = (local28 << 7) + (this.anIntArray423[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray423[local16] = local28 + (this.anIntArray423[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray411[local16] = (local28 << 7) + (this.anIntArray411[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray411[local16] = (this.anIntArray411[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray417[local16] = (this.anIntArray417[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray417[local16] = (this.anIntArray417[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray418[local16] = (this.anIntArray418[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray418[local16] = (this.anIntArray418[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray421[local16] |= 0x1;
				} else {
					this.anIntArray421[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray421[local16] |= 0x2;
				} else {
					this.method6086(local16);
					this.anIntArray421[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray415[local16] = (local28 << 7) + (this.anIntArray415[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray415[local16] = (this.anIntArray415[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray415[local16] = (this.anIntArray415[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray415[local16] = local28 + (this.anIntArray415[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method6075(local16);
			}
			if (local22 == 121) {
				this.method6061(local16);
			}
			if (local22 == 123) {
				this.method6069(local16);
			}
			@Pc(552) int local552;
			if (local22 == 6) {
				local552 = this.anIntArray415[local16];
				if (local552 == 16384) {
					this.anIntArray422[local16] = (this.anIntArray422[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local552 = this.anIntArray415[local16];
				if (local552 == 16384) {
					this.anIntArray422[local16] = (this.anIntArray422[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray420[local16] = (this.anIntArray420[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray420[local16] = local28 + (this.anIntArray420[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method6074(local16);
					this.anIntArray421[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray421[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method6071(local16, (local28 << 7) + (this.anIntArray425[local16] & 0xFFFFC07F));
			}
			if (local22 == 49) {
				this.method6071(local16, local28 + (this.anIntArray425[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6092(local16, local22 + this.anIntArray414[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6081(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method6066(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method6087(true);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(IB)V")
	private void method6086(@OriginalArg(0) int arg0) {
		if ((this.anIntArray421[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(27) Class6_Sub49 local27 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8124(); local27 != null; local27 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8134()) {
			if (local27.anInt9358 == arg0 && this.aClass6_Sub49ArrayArray1[arg0][local27.anInt9359] == null && local27.anInt9355 < 0) {
				local27.anInt9355 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "()Lclient!jn;")
	@Override
	public synchronized Class6_Sub17 method8143() {
		return null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BZ)V")
	private void method6087(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method6075(-1);
		} else {
			this.method6069(-1);
		}
		this.method6061(-1);
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray416[local35] = this.anIntArray413[local35];
		}
		for (@Pc(55) int local55 = 0; local55 < 16; local55++) {
			this.anIntArray414[local55] = this.anIntArray413[local55] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
	private void method6088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6062(arg1, arg2, 64);
		if ((this.anIntArray421[arg2] & 0x2) != 0) {
			for (@Pc(36) Class6_Sub49 local36 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8133(); local36 != null; local36 = (Class6_Sub49) this.aClass6_Sub17_Sub1_1.aClass340_21.method8125()) {
				if (local36.anInt9358 == arg2 && local36.anInt9355 < 0) {
					this.aClass6_Sub49ArrayArray1[arg2][local36.anInt9359] = null;
					this.aClass6_Sub49ArrayArray1[arg2][arg1] = local36;
					@Pc(82) int local82 = (local36.anInt9366 * local36.anInt9347 >> 12) + local36.anInt9357;
					local36.anInt9357 += arg1 - local36.anInt9359 << 8;
					local36.anInt9366 = 4096;
					local36.anInt9359 = arg1;
					local36.anInt9347 = local82 - local36.anInt9357;
					return;
				}
			}
		}
		@Pc(128) Class6_Sub22 local128 = (Class6_Sub22) this.aClass74_42.method1401((long) this.anIntArray416[arg2]);
		if (local128 == null) {
			return;
		}
		@Pc(137) Class6_Sub54_Sub1 local137 = local128.aClass6_Sub54_Sub1Array1[arg1];
		if (local137 == null) {
			return;
		}
		@Pc(145) Class6_Sub49 local145 = new Class6_Sub49();
		local145.aClass6_Sub54_Sub1_4 = local137;
		local145.aClass6_Sub22_1 = local128;
		local145.anInt9358 = arg2;
		local145.aClass293_1 = local128.aClass293Array1[arg1];
		local145.anInt9352 = local128.aByteArray32[arg1];
		local145.anInt9359 = arg1;
		local145.anInt9350 = local128.anInt4347 * arg0 * arg0 * local128.aByteArray30[arg1] + 1024 >> 11;
		local145.anInt9354 = local128.aByteArray31[arg1] & 0xFF;
		local145.anInt9357 = (arg1 << 8) - (local128.aShortArray47[arg1] & 0x7FFF);
		local145.anInt9349 = 0;
		local145.anInt9355 = -1;
		local145.anInt9363 = 0;
		local145.anInt9356 = 0;
		local145.anInt9360 = 0;
		if (this.anIntArray420[arg2] == 0) {
			local145.aClass6_Sub17_Sub2_4 = Static693.method3920(local137, this.method6097(local145), this.method6090(local145), this.method6096(local145));
		} else {
			local145.aClass6_Sub17_Sub2_4 = Static693.method3920(local137, this.method6097(local145), 0, this.method6096(local145));
			this.method6093(local128.aShortArray47[arg1] < 0, local145);
		}
		if (local128.aShortArray47[arg1] < 0) {
			local145.aClass6_Sub17_Sub2_4.method3937(-1);
		}
		if (local145.anInt9352 >= 0) {
			@Pc(307) Class6_Sub49 local307 = this.aClass6_Sub49ArrayArray2[arg2][local145.anInt9352];
			if (local307 != null && local307.anInt9355 < 0) {
				this.aClass6_Sub49ArrayArray1[arg2][local307.anInt9359] = null;
				local307.anInt9355 = 0;
			}
			this.aClass6_Sub49ArrayArray2[arg2][local145.anInt9352] = local145;
		}
		this.aClass6_Sub17_Sub1_1.aClass340_21.method8131(local145);
		this.aClass6_Sub49ArrayArray1[arg2][arg1] = local145;
	}

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "(B)V")
	private void method6089() {
		@Pc(8) int local8 = this.anInt6860;
		@Pc(19) int local19 = this.anInt6859;
		@Pc(22) long local22 = this.aLong228;
		if (this.aClass6_Sub27_2 != null && local19 == this.anInt6861) {
			this.method6094(this.aClass6_Sub27_2, this.aBoolean510, this.aBoolean511);
			this.method6089();
			return;
		}
		while (local19 == this.anInt6859) {
			while (local19 == this.aClass375_1.anIntArray657[local8]) {
				this.aClass375_1.method8651(local8);
				@Pc(58) int local58 = this.aClass375_1.method8661(local8);
				if (local58 == 1) {
					this.aClass375_1.method8656();
					this.aClass375_1.method8655(local8);
					if (this.aClass375_1.method8658()) {
						if (this.aClass6_Sub27_2 != null) {
							this.method6083(this.aBoolean510, this.aClass6_Sub27_2);
							this.method6089();
							return;
						}
						if (!this.aBoolean510 || local19 == 0) {
							this.method6087(true);
							this.aClass375_1.method8657();
							return;
						}
						this.aClass375_1.method8647(local22);
					}
					break;
				}
				if ((local58 & 0x80) != 0) {
					this.method6085(local58);
				}
				this.aClass375_1.method8646(local8);
				this.aClass375_1.method8655(local8);
			}
			local8 = this.aClass375_1.method8652();
			local19 = this.aClass375_1.anIntArray657[local8];
			local22 = this.aClass375_1.method8659(local19);
		}
		this.aLong228 = local22;
		this.anInt6859 = local19;
		this.anInt6860 = local8;
		if (this.aClass6_Sub27_2 != null && this.anInt6861 < local19) {
			this.anInt6860 = -1;
			this.anInt6859 = this.anInt6861;
			this.aLong228 = this.aClass375_1.method8659(this.anInt6859);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!tia;)I")
	private int method6090(@OriginalArg(1) Class6_Sub49 arg0) {
		if (this.anIntArray412[arg0.anInt9358] == 0) {
			return 0;
		}
		@Pc(18) Class293 local18 = arg0.aClass293_1;
		@Pc(34) int local34 = this.anIntArray418[arg0.anInt9358] * this.anIntArray411[arg0.anInt9358] + 4096 >> 13;
		@Pc(42) int local42 = local34 * local34 + 16384 >> 15;
		@Pc(51) int local51 = arg0.anInt9350 * local42 + 16384 >> 15;
		@Pc(60) int local60 = local51 * this.anInt6818 + 128 >> 8;
		local34 = this.anIntArray412[arg0.anInt9358] * local60 + 128 >> 8;
		if (local18.anInt8098 > 0) {
			local34 = (int) (Math.pow(0.5D, (double) arg0.anInt9356 * 1.953125E-5D * (double) local18.anInt8098) * (double) local34 + 0.5D);
		}
		@Pc(99) int local99;
		@Pc(107) int local107;
		@Pc(129) int local129;
		@Pc(141) int local141;
		if (local18.aByteArray83 != null) {
			local99 = arg0.anInt9360;
			local107 = local18.aByteArray83[arg0.anInt9363 + 1];
			if (local18.aByteArray83.length - 2 > arg0.anInt9363) {
				local129 = (local18.aByteArray83[arg0.anInt9363] & 0xFF) << 8;
				local141 = (local18.aByteArray83[arg0.anInt9363 + 2] & 0xFF) << 8;
				local107 += (local18.aByteArray83[arg0.anInt9363 + 3] - local107) * (local99 + -local129) / (local141 - local129);
			}
			local34 = local107 * local34 + 32 >> 6;
		}
		if (arg0.anInt9355 > 0 && local18.aByteArray82 != null) {
			local99 = arg0.anInt9355;
			local107 = local18.aByteArray82[arg0.anInt9349 + 1];
			if (local18.aByteArray82.length - 2 > arg0.anInt9349) {
				local129 = (local18.aByteArray82[arg0.anInt9349] & 0xFF) << 8;
				local141 = (local18.aByteArray82[arg0.anInt9349 + 2] & 0xFF) << 8;
				local107 += (local99 - local129) * (local18.aByteArray82[arg0.anInt9349 + 3] + -local107) / (local141 - local129);
			}
			local34 = local107 * local34 + 32 >> 6;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([IIIBLclient!tia;)Z")
	public boolean method6091(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class6_Sub49 arg3) {
		arg3.anInt9362 = Static90.anInt9479 / 100;
		if (arg3.anInt9355 >= 0 && (arg3.aClass6_Sub17_Sub2_4 == null || arg3.aClass6_Sub17_Sub2_4.method3938())) {
			arg3.method8178();
			arg3.method9051();
			if (arg3.anInt9352 > 0 && this.aClass6_Sub49ArrayArray2[arg3.anInt9358][arg3.anInt9352] == arg3) {
				this.aClass6_Sub49ArrayArray2[arg3.anInt9358][arg3.anInt9352] = null;
			}
			return true;
		}
		@Pc(68) int local68 = arg3.anInt9366;
		if (local68 > 0) {
			local68 -= (int) (Math.pow(2.0D, (double) this.anIntArray423[arg3.anInt9358] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local68 < 0) {
				local68 = 0;
			}
			arg3.anInt9366 = local68;
		}
		arg3.aClass6_Sub17_Sub2_4.method3927(this.method6097(arg3));
		@Pc(116) Class293 local116 = arg3.aClass293_1;
		arg3.anInt9351++;
		@Pc(124) boolean local124 = false;
		arg3.anInt9364 += local116.anInt8099;
		@Pc(149) double local149 = (double) ((arg3.anInt9359 - 60 << 8) + (arg3.anInt9366 * arg3.anInt9347 >> 12)) * 5.086263020833333E-6D;
		if (local116.anInt8098 > 0) {
			if (local116.anInt8102 <= 0) {
				arg3.anInt9356 += 128;
			} else {
				arg3.anInt9356 += (int) (Math.pow(2.0D, (double) local116.anInt8102 * local149) * 128.0D + 0.5D);
			}
			if (arg3.anInt9356 * local116.anInt8098 >= 819200) {
				local124 = true;
			}
		}
		if (local116.aByteArray83 != null) {
			if (local116.anInt8096 > 0) {
				arg3.anInt9360 += (int) (Math.pow(2.0D, local149 * (double) local116.anInt8096) * 128.0D + 0.5D);
			} else {
				arg3.anInt9360 += 128;
			}
			while (local116.aByteArray83.length - 2 > arg3.anInt9363 && arg3.anInt9360 > (local116.aByteArray83[arg3.anInt9363 + 2] & 0xFF) << 8) {
				arg3.anInt9363 += 2;
			}
			if (local116.aByteArray83.length - 2 == arg3.anInt9363 && local116.aByteArray83[arg3.anInt9363 + 1] == 0) {
				local124 = true;
			}
		}
		if (arg3.anInt9355 >= 0 && local116.aByteArray82 != null && (this.anIntArray421[arg3.anInt9358] & 0x1) == 0 && (arg3.anInt9352 < 0 || arg3 != this.aClass6_Sub49ArrayArray2[arg3.anInt9358][arg3.anInt9352])) {
			if (local116.anInt8100 <= 0) {
				arg3.anInt9355 += 128;
			} else {
				arg3.anInt9355 += (int) (Math.pow(2.0D, (double) local116.anInt8100 * local149) * 128.0D + 0.5D);
			}
			while (arg3.anInt9349 < local116.aByteArray82.length - 2 && (local116.aByteArray82[arg3.anInt9349 + 2] & 0xFF) << 8 < arg3.anInt9355) {
				arg3.anInt9349 += 2;
			}
			if (local116.aByteArray82.length - 2 == arg3.anInt9349) {
				local124 = true;
			}
		}
		if (!local124) {
			arg3.aClass6_Sub17_Sub2_4.method3904(arg3.anInt9362, this.method6090(arg3), this.method6096(arg3));
			return false;
		}
		arg3.aClass6_Sub17_Sub2_4.method3917(arg3.anInt9362);
		if (arg0 == null) {
			arg3.aClass6_Sub17_Sub2_4.method8144(arg1);
		} else {
			arg3.aClass6_Sub17_Sub2_4.method8139(arg0, arg2, arg1);
		}
		if (arg3.aClass6_Sub17_Sub2_4.method3928()) {
			this.aClass6_Sub17_Sub1_1.aClass6_Sub17_Sub3_1.method4661(arg3.aClass6_Sub17_Sub2_4);
		}
		arg3.method8178();
		if (arg3.anInt9355 >= 0) {
			arg3.method9051();
			if (arg3.anInt9352 > 0 && this.aClass6_Sub49ArrayArray2[arg3.anInt9358][arg3.anInt9352] == arg3) {
				this.aClass6_Sub49ArrayArray2[arg3.anInt9358][arg3.anInt9352] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBI)V")
	private void method6092(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray416[arg0]) {
			this.anIntArray416[arg0] = arg1;
			for (@Pc(28) int local28 = 0; local28 < 128; local28++) {
				this.aClass6_Sub49ArrayArray2[arg0][local28] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8139(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass375_1.method8654()) {
			@Pc(18) int local18 = this.anInt6828 * this.aClass375_1.anInt9967 / Static90.anInt9479;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong229;
				if (this.aLong228 - local27 >= 0L) {
					this.aLong229 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong228 - this.aLong229 - 1L) / (long) local18);
				this.aLong229 += (long) local56 * (long) local18;
				this.aClass6_Sub17_Sub1_1.method8139(arg0, arg1, local56);
				arg1 += local56;
				this.method6089();
				arg2 -= local56;
			} while (this.aClass375_1.method8654());
		}
		this.aClass6_Sub17_Sub1_1.method8139(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLclient!tia;I)V")
	public void method6093(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub49 arg1) {
		@Pc(8) int local8 = arg1.aClass6_Sub54_Sub1_4.aByteArray107.length;
		@Pc(37) int local37;
		if (arg0 && arg1.aClass6_Sub54_Sub1_4.aBoolean735) {
			@Pc(24) int local24 = local8 + local8 - arg1.aClass6_Sub54_Sub1_4.anInt9979;
			local37 = (int) ((long) local24 * (long) this.anIntArray420[arg1.anInt9358] >> 6);
			local8 <<= 0x8;
			if (local37 >= local8) {
				local37 = local8 + local8 - local37 - 1;
				arg1.aClass6_Sub17_Sub2_4.method3908();
			}
		} else {
			local37 = (int) ((long) this.anIntArray420[arg1.anInt9358] * (long) local8 >> 6);
		}
		arg1.aClass6_Sub17_Sub2_4.method3933(local37);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!jk;ZIZ)V")
	private synchronized void method6094(@OriginalArg(0) Class6_Sub27 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method6060(arg2);
		this.aClass375_1.method8660(arg0.aByteArray42);
		this.aLong229 = 0L;
		this.aBoolean510 = arg1;
		@Pc(24) int local24 = this.aClass375_1.method8649();
		for (@Pc(31) int local31 = 0; local31 < local24; local31++) {
			this.aClass375_1.method8651(local31);
			this.aClass375_1.method8646(local31);
			this.aClass375_1.method8655(local31);
		}
		this.anInt6860 = this.aClass375_1.method8652();
		this.anInt6859 = this.aClass375_1.anIntArray657[this.anInt6860];
		this.aLong228 = this.aClass375_1.method8659(this.anInt6859);
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
	public synchronized void method6095() {
		this.method6060(true);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(ILclient!tia;)I")
	private int method6096(@OriginalArg(1) Class6_Sub49 arg0) {
		@Pc(17) int local17 = this.anIntArray417[arg0.anInt9358];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt9354) * (-local17 + 16384) + 32 >> 6) : local17 * arg0.anInt9354 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Lclient!tia;Z)I")
	private int method6097(@OriginalArg(0) Class6_Sub49 arg0) {
		@Pc(14) int local14 = (arg0.anInt9366 * arg0.anInt9347 >> 12) + arg0.anInt9357;
		local14 += this.anIntArray422[arg0.anInt9358] * (this.anIntArray410[arg0.anInt9358] - 8192) >> 12;
		@Pc(44) Class293 local44 = arg0.aClass293_1;
		@Pc(65) int local65;
		if (local44.anInt8099 > 0 && (local44.anInt8094 > 0 || this.anIntArray424[arg0.anInt9358] > 0)) {
			local65 = local44.anInt8094 << 2;
			@Pc(70) int local70 = local44.anInt8101 << 1;
			if (local70 > arg0.anInt9351) {
				local65 = local65 * arg0.anInt9351 / local70;
			}
			local65 += this.anIntArray424[arg0.anInt9358] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt9364 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local100 * (double) local65);
		}
		local65 = (int) ((double) (arg0.aClass6_Sub54_Sub1_4.anInt9981 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static90.anInt9479 + 0.5D);
		return local65 < 1 ? 1 : local65;
	}
}
