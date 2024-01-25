import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class4_Sub15_Sub1 extends Class4_Sub15 {

	@OriginalMember(owner = "client!dv", name = "Eb", descriptor = "I")
	private int anInt1631;

	@OriginalMember(owner = "client!dv", name = "Fb", descriptor = "Z")
	private boolean aBoolean156;

	@OriginalMember(owner = "client!dv", name = "Gb", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!dv", name = "Hb", descriptor = "I")
	private int anInt1632;

	@OriginalMember(owner = "client!dv", name = "Jb", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!dv", name = "Kb", descriptor = "Lclient!nb;")
	private Class4_Sub30 aClass4_Sub30_1;

	@OriginalMember(owner = "client!dv", name = "Lb", descriptor = "Z")
	private boolean aBoolean157;

	@OriginalMember(owner = "client!dv", name = "Mb", descriptor = "I")
	private int anInt1633;

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "[I")
	private final int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!dv", name = "C", descriptor = "I")
	private final int anInt1596 = 1000000;

	@OriginalMember(owner = "client!dv", name = "H", descriptor = "[I")
	public final int[] anIntArray124 = new int[16];

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "[I")
	private final int[] anIntArray120 = new int[16];

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "[I")
	private final int[] anIntArray119 = new int[16];

	@OriginalMember(owner = "client!dv", name = "N", descriptor = "I")
	private int anInt1602 = 256;

	@OriginalMember(owner = "client!dv", name = "eb", descriptor = "[I")
	public final int[] anIntArray129 = new int[16];

	@OriginalMember(owner = "client!dv", name = "hb", descriptor = "[I")
	private final int[] anIntArray130 = new int[16];

	@OriginalMember(owner = "client!dv", name = "X", descriptor = "[I")
	private final int[] anIntArray128 = new int[16];

	@OriginalMember(owner = "client!dv", name = "Z", descriptor = "[[Lclient!lm;")
	private final Class4_Sub28[][] aClass4_Sub28ArrayArray1 = new Class4_Sub28[16][128];

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "[I")
	private final int[] anIntArray121 = new int[16];

	@OriginalMember(owner = "client!dv", name = "kb", descriptor = "[I")
	private final int[] anIntArray131 = new int[16];

	@OriginalMember(owner = "client!dv", name = "K", descriptor = "[I")
	private final int[] anIntArray125 = new int[16];

	@OriginalMember(owner = "client!dv", name = "mb", descriptor = "[I")
	private final int[] anIntArray132 = new int[16];

	@OriginalMember(owner = "client!dv", name = "Q", descriptor = "[I")
	private final int[] anIntArray126 = new int[16];

	@OriginalMember(owner = "client!dv", name = "ub", descriptor = "[[Lclient!lm;")
	private final Class4_Sub28[][] aClass4_Sub28ArrayArray2 = new Class4_Sub28[16][128];

	@OriginalMember(owner = "client!dv", name = "F", descriptor = "[I")
	private final int[] anIntArray123 = new int[16];

	@OriginalMember(owner = "client!dv", name = "Ab", descriptor = "[I")
	private final int[] anIntArray134 = new int[16];

	@OriginalMember(owner = "client!dv", name = "Db", descriptor = "[I")
	private final int[] anIntArray135 = new int[16];

	@OriginalMember(owner = "client!dv", name = "zb", descriptor = "[I")
	public final int[] anIntArray133 = new int[16];

	@OriginalMember(owner = "client!dv", name = "G", descriptor = "Lclient!ot;")
	private final Class175 aClass175_1 = new Class175();

	@OriginalMember(owner = "client!dv", name = "Ib", descriptor = "Lclient!se;")
	private final Class4_Sub15_Sub4 aClass4_Sub15_Sub4_1 = new Class4_Sub15_Sub4(this);

	@OriginalMember(owner = "client!dv", name = "J", descriptor = "Lclient!ib;")
	private final Class102 aClass102_8 = new Class102(128);

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
	public Class4_Sub15_Sub1() {
		this.method1447();
		this.method1445(true);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)V")
	private void method1421(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class4_Sub28 local8 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4140(); local8 != null; local8 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4144()) {
			if (arg0 < 0 || arg0 == local8.anInt4386) {
				if (local8.aClass4_Sub15_Sub3_3 != null) {
					local8.aClass4_Sub15_Sub3_3.method4490(Static261.anInt4928 / 100);
					if (local8.aClass4_Sub15_Sub3_3.method4487()) {
						this.aClass4_Sub15_Sub4_1.aClass4_Sub15_Sub2_1.method2954(local8.aClass4_Sub15_Sub3_3);
					}
					local8.method3453();
				}
				if (local8.anInt4394 < 0) {
					this.aClass4_Sub28ArrayArray1[local8.anInt4386][local8.anInt4384] = null;
				}
				local8.method5684();
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)V")
	private void method1422(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1452(local16, local28, local22);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method1424(local16, local22, local28);
			} else {
				this.method1452(local16, 64, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1425(local22, local28, local16);
		} else if (local9 == 176) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			@Pc(125) int local125 = arg0 >> 16 & 0x7F;
			if (local28 == 0) {
				this.anIntArray132[local22] = (local125 << 14) + (this.anIntArray132[local22] & 0xFFE03FFF);
			}
			if (local28 == 32) {
				this.anIntArray132[local22] = (this.anIntArray132[local22] & 0xFFFFC07F) + (local125 << 7);
			}
			if (local28 == 1) {
				this.anIntArray128[local22] = (this.anIntArray128[local22] & 0xFFFFC07F) + (local125 << 7);
			}
			if (local28 == 33) {
				this.anIntArray128[local22] = local125 + (this.anIntArray128[local22] & 0xFFFFFF80);
			}
			if (local28 == 5) {
				this.anIntArray123[local22] = (this.anIntArray123[local22] & 0xFFFFC07F) + (local125 << 7);
			}
			if (local28 == 37) {
				this.anIntArray123[local22] = local125 + (this.anIntArray123[local22] & 0xFFFFFF80);
			}
			if (local28 == 7) {
				this.anIntArray120[local22] = (this.anIntArray120[local22] & 0xFFFFC07F) + (local125 << 7);
			}
			if (local28 == 39) {
				this.anIntArray120[local22] = local125 + (this.anIntArray120[local22] & 0xFFFFFF80);
			}
			if (local28 == 10) {
				this.anIntArray131[local22] = (this.anIntArray131[local22] & 0xFFFFC07F) + (local125 << 7);
			}
			if (local28 == 42) {
				this.anIntArray131[local22] = (this.anIntArray131[local22] & 0xFFFFFF80) + local125;
			}
			if (local28 == 11) {
				this.anIntArray134[local22] = (local125 << 7) + (this.anIntArray134[local22] & 0xFFFFC07F);
			}
			if (local28 == 43) {
				this.anIntArray134[local22] = (this.anIntArray134[local22] & 0xFFFFFF80) + local125;
			}
			if (local28 == 64) {
				if (local125 < 64) {
					this.anIntArray133[local22] &= 0xFFFFFFFE;
				} else {
					this.anIntArray133[local22] |= 0x1;
				}
			}
			if (local28 == 65) {
				if (local125 >= 64) {
					this.anIntArray133[local22] |= 0x2;
				} else {
					this.method1451(local22);
					this.anIntArray133[local22] &= 0xFFFFFFFD;
				}
			}
			if (local28 == 99) {
				this.anIntArray121[local22] = (local125 << 7) + (this.anIntArray121[local22] & 0x7F);
			}
			if (local28 == 98) {
				this.anIntArray121[local22] = (this.anIntArray121[local22] & 0x3F80) + local125;
			}
			if (local28 == 101) {
				this.anIntArray121[local22] = (local125 << 7) + (this.anIntArray121[local22] & 0x7F) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray121[local22] = (this.anIntArray121[local22] & 0x3F80) + local125 + 16384;
			}
			if (local28 == 120) {
				this.method1421(local22);
			}
			if (local28 == 121) {
				this.method1444(local22);
			}
			if (local28 == 123) {
				this.method1429(local22);
			}
			@Pc(516) int local516;
			if (local28 == 6) {
				local516 = this.anIntArray121[local22];
				if (local516 == 16384) {
					this.anIntArray135[local22] = (local125 << 7) + (this.anIntArray135[local22] & 0xFFFFC07F);
				}
			}
			if (local28 == 38) {
				local516 = this.anIntArray121[local22];
				if (local516 == 16384) {
					this.anIntArray135[local22] = local125 + (this.anIntArray135[local22] & 0xFFFFFF80);
				}
			}
			if (local28 == 16) {
				this.anIntArray124[local22] = (local125 << 7) + (this.anIntArray124[local22] & 0xFFFFC07F);
			}
			if (local28 == 48) {
				this.anIntArray124[local22] = local125 + (this.anIntArray124[local22] & 0xFFFFFF80);
			}
			if (local28 == 81) {
				if (local125 >= 64) {
					this.anIntArray133[local22] |= 0x4;
				} else {
					this.method1446(local22);
					this.anIntArray133[local22] &= 0xFFFFFFFB;
				}
			}
			if (local28 == 17) {
				this.method1423(local22, (this.anIntArray130[local22] & 0xFFFFC07F) + (local125 << 7));
			}
			if (local28 == 49) {
				this.method1423(local22, (this.anIntArray130[local22] & 0xFFFFFF80) + local125);
			}
		} else if (local9 == 192) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method1448(local22, local28 + this.anIntArray132[local22]);
		} else if (local9 == 208) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method1455(local22, local28);
		} else if (local9 == 224) {
			local22 = arg0 & 0xF;
			local28 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1431(local28, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1445(true);
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)V")
	private void method1423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray130[arg0] = arg1;
		this.anIntArray129[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIII)V")
	private void method1424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1452(arg0, 64, arg1);
		if ((this.anIntArray133[arg0] & 0x2) != 0) {
			for (@Pc(28) Class4_Sub28 local28 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4139(); local28 != null; local28 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4145()) {
				if (arg0 == local28.anInt4386 && local28.anInt4394 < 0) {
					this.aClass4_Sub28ArrayArray1[arg0][local28.anInt4384] = null;
					this.aClass4_Sub28ArrayArray1[arg0][arg1] = local28;
					@Pc(71) int local71 = local28.anInt4399 + (local28.anInt4390 * local28.anInt4398 >> 12);
					local28.anInt4399 += arg1 - local28.anInt4384 << 8;
					local28.anInt4384 = arg1;
					local28.anInt4390 = local71 - local28.anInt4399;
					local28.anInt4398 = 4096;
					return;
				}
			}
		}
		@Pc(115) Class4_Sub38 local115 = (Class4_Sub38) this.aClass102_8.method2700((long) this.anIntArray122[arg0]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class4_Sub4_Sub1 local123 = local115.aClass4_Sub4_Sub1Array1[arg1];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class4_Sub28 local130 = new Class4_Sub28();
		local130.aClass4_Sub38_1 = local115;
		local130.anInt4386 = arg0;
		local130.aClass4_Sub4_Sub1_1 = local123;
		local130.aClass252_1 = local115.aClass252Array1[arg1];
		local130.anInt4385 = local115.aByteArray72[arg1];
		local130.anInt4384 = arg1;
		local130.anInt4388 = local115.anInt5637 * arg2 * arg2 * local115.aByteArray70[arg1] + 1024 >> 11;
		local130.anInt4392 = local115.aByteArray71[arg1] & 0xFF;
		local130.anInt4399 = (arg1 << 8) - (local115.aShortArray192[arg1] & 0x7FFF);
		local130.anInt4394 = -1;
		local130.anInt4396 = 0;
		local130.anInt4382 = 0;
		local130.anInt4395 = 0;
		local130.anInt4393 = 0;
		if (this.anIntArray124[arg0] == 0) {
			local130.aClass4_Sub15_Sub3_3 = Static462.method4486(local123, this.method1454(local130), this.method1435(local130), this.method1439(local130));
		} else {
			local130.aClass4_Sub15_Sub3_3 = Static462.method4486(local123, this.method1454(local130), 0, this.method1439(local130));
			this.method1436(local115.aShortArray192[arg1] < 0, local130);
		}
		if (local115.aShortArray192[arg1] < 0) {
			local130.aClass4_Sub15_Sub3_3.method4461(-1);
		}
		if (local130.anInt4385 >= 0) {
			@Pc(288) Class4_Sub28 local288 = this.aClass4_Sub28ArrayArray2[arg0][local130.anInt4385];
			if (local288 != null && local288.anInt4394 < 0) {
				this.aClass4_Sub28ArrayArray1[arg0][local288.anInt4384] = null;
				local288.anInt4394 = 0;
			}
			this.aClass4_Sub28ArrayArray2[arg0][local130.anInt4385] = local130;
		}
		this.aClass4_Sub15_Sub4_1.aClass183_44.method4137(local130);
		this.aClass4_Sub28ArrayArray1[arg0][arg1] = local130;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIBI)V")
	private void method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!nb;ZIZ)V")
	private synchronized void method1426(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method1443(arg1);
		this.aClass175_1.method4054(arg0.aByteArray58);
		this.aLong56 = 0L;
		this.aBoolean156 = arg2;
		@Pc(32) int local32 = this.aClass175_1.method4060();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			this.aClass175_1.method4056(local34);
			this.aClass175_1.method4050(local34);
			this.aClass175_1.method4047(local34);
		}
		this.anInt1631 = this.aClass175_1.method4055();
		this.anInt1632 = this.aClass175_1.anIntArray347[this.anInt1631];
		this.aLong57 = this.aClass175_1.method4048(this.anInt1632);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIB)V")
	private void method1427() {
		this.anIntArray119[9] = 128;
		this.anIntArray132[9] = 128;
		this.method1448(9, 128);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZI)V")
	public synchronized void method1428(@OriginalArg(1) int arg0) {
		this.anInt1602 = arg0;
	}

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "()Lclient!ti;")
	@Override
	public synchronized Class4_Sub15 method4860() {
		return this.aClass4_Sub15_Sub4_1;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(ZI)V")
	private void method1429(@OriginalArg(1) int arg0) {
		for (@Pc(19) Class4_Sub28 local19 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4140(); local19 != null; local19 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4144()) {
			if ((arg0 < 0 || local19.anInt4386 == arg0) && local19.anInt4394 < 0) {
				this.aClass4_Sub28ArrayArray1[local19.anInt4386][local19.anInt4384] = null;
				local19.anInt4394 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BLclient!lm;)Z")
	public boolean method1430(@OriginalArg(1) Class4_Sub28 arg0) {
		if (arg0.aClass4_Sub15_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt4394 >= 0) {
			arg0.method5684();
			if (arg0.anInt4385 > 0 && this.aClass4_Sub28ArrayArray2[arg0.anInt4386][arg0.anInt4385] == arg0) {
				this.aClass4_Sub28ArrayArray2[arg0.anInt4386][arg0.anInt4385] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BII)V")
	private void method1431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray126[arg1] = arg0;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4861(@OriginalArg(0) int arg0) {
		if (this.aClass175_1.method4057()) {
			@Pc(14) int local14 = this.aClass175_1.anInt5296 * this.anInt1596 / Static261.anInt4928;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong56;
				if (this.aLong57 - local23 >= 0L) {
					this.aLong56 = local23;
					break;
				}
				@Pc(51) int local51 = (int) ((this.aLong57 + (long) local14 - this.aLong56 - 1L) / (long) local14);
				this.aLong56 += (long) local14 * (long) local51;
				arg0 -= local51;
				this.aClass4_Sub15_Sub4_1.method4861(local51);
				this.method1432();
			} while (this.aClass175_1.method4057());
		}
		this.aClass4_Sub15_Sub4_1.method4861(arg0);
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)V")
	private void method1432() {
		@Pc(8) int local8 = this.anInt1631;
		@Pc(11) int local11 = this.anInt1632;
		@Pc(14) long local14 = this.aLong57;
		if (this.aClass4_Sub30_1 != null && this.anInt1633 == local11) {
			this.method1426(this.aClass4_Sub30_1, this.aBoolean157, this.aBoolean156);
			this.method1432();
			return;
		}
		while (local11 == this.anInt1632) {
			while (this.aClass175_1.anIntArray347[local8] == local11) {
				this.aClass175_1.method4056(local8);
				@Pc(47) int local47 = this.aClass175_1.method4058(local8);
				if (local47 == 1) {
					this.aClass175_1.method4045();
					this.aClass175_1.method4047(local8);
					if (this.aClass175_1.method4052()) {
						if (this.aClass4_Sub30_1 != null) {
							this.method1450(this.aBoolean156, this.aClass4_Sub30_1);
							this.method1432();
							return;
						}
						if (!this.aBoolean156 || local11 == 0) {
							this.method1445(true);
							this.aClass175_1.method4049();
							return;
						}
						this.aClass175_1.method4053(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method1422(local47);
				}
				this.aClass175_1.method4050(local8);
				this.aClass175_1.method4047(local8);
			}
			local8 = this.aClass175_1.method4055();
			local11 = this.aClass175_1.anIntArray347[local8];
			local14 = this.aClass175_1.method4048(local11);
		}
		this.anInt1632 = local11;
		this.anInt1631 = local8;
		this.aLong57 = local14;
		if (this.aClass4_Sub30_1 != null && this.anInt1633 < local11) {
			this.anInt1631 = -1;
			this.anInt1632 = this.anInt1633;
			this.aLong57 = this.aClass175_1.method4048(this.anInt1632);
		}
	}

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "(B)Z")
	public synchronized boolean method1434() {
		return this.aClass175_1.method4057();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!lm;B)I")
	private int method1435(@OriginalArg(0) Class4_Sub28 arg0) {
		if (this.anIntArray125[arg0.anInt4386] == 0) {
			return 0;
		}
		@Pc(14) Class252 local14 = arg0.aClass252_1;
		@Pc(30) int local30 = this.anIntArray120[arg0.anInt4386] * this.anIntArray134[arg0.anInt4386] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt4388 + 16384 >> 15;
		@Pc(56) int local56 = local47 * this.anInt1602 + 128 >> 8;
		local30 = this.anIntArray125[arg0.anInt4386] * local56 + 128 >> 8;
		if (local14.anInt6937 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) local14.anInt6937 * (double) arg0.anInt4396 * 1.953125E-5D) * (double) local30 + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local14.aByteArray100 != null) {
			local103 = arg0.anInt4393;
			local111 = local14.aByteArray100[arg0.anInt4395 + 1];
			if (arg0.anInt4395 < local14.aByteArray100.length - 2) {
				local133 = (local14.aByteArray100[arg0.anInt4395] & 0xFF) << 8;
				local145 = (local14.aByteArray100[arg0.anInt4395 + 2] & 0xFF) << 8;
				local111 += (local103 - local133) * (local14.aByteArray100[arg0.anInt4395 - -3] - local111) / (local145 - local133);
			}
			local30 = local30 * local111 + 32 >> 6;
		}
		if (arg0.anInt4394 > 0 && local14.aByteArray101 != null) {
			local103 = arg0.anInt4394;
			local111 = local14.aByteArray101[arg0.anInt4382 + 1];
			if (local14.aByteArray101.length - 2 > arg0.anInt4382) {
				local133 = (local14.aByteArray101[arg0.anInt4382] & 0xFF) << 8;
				local145 = (local14.aByteArray101[arg0.anInt4382 + 2] & 0xFF) << 8;
				local111 += (local14.aByteArray101[arg0.anInt4382 + 3] - local111) * (-local133 + local103) / (local145 - local133);
			}
			local30 = local30 * local111 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZILclient!lm;)V")
	public void method1436(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub28 arg1) {
		@Pc(17) int local17 = arg1.aClass4_Sub4_Sub1_1.aByteArray48.length;
		@Pc(36) int local36;
		if (arg0 && arg1.aClass4_Sub4_Sub1_1.aBoolean346) {
			@Pc(47) int local47 = local17 + local17 - arg1.aClass4_Sub4_Sub1_1.anInt3726;
			local36 = (int) ((long) local47 * (long) this.anIntArray124[arg1.anInt4386] >> 6);
			local17 <<= 0x8;
			if (local36 >= local17) {
				local36 = local17 + local17 - local36 - 1;
				arg1.aClass4_Sub15_Sub3_3.method4454();
			}
		} else {
			local36 = (int) ((long) local17 * (long) this.anIntArray124[arg1.anInt4386] >> 6);
		}
		arg1.aClass4_Sub15_Sub3_3.method4473(local36);
	}

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)I")
	public int method1437() {
		return this.anInt1602;
	}

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "(B)V")
	public synchronized void method1438() {
		for (@Pc(15) Class4_Sub38 local15 = (Class4_Sub38) this.aClass102_8.method2705(); local15 != null; local15 = (Class4_Sub38) this.aClass102_8.method2704()) {
			local15.method4393();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!lm;I)I")
	private int method1439(@OriginalArg(0) Class4_Sub28 arg0) {
		@Pc(20) int local20 = this.anIntArray131[arg0.anInt4386];
		return local20 >= 8192 ? 16384 - ((16384 - local20) * (-arg0.anInt4392 + 128) + 32 >> 6) : local20 * arg0.anInt4392 + 32 >> 6;
	}

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "(I)V")
	public synchronized void method1440() {
		this.method1443(true);
	}

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "(B)V")
	public synchronized void method1441() {
		for (@Pc(15) Class4_Sub38 local15 = (Class4_Sub38) this.aClass102_8.method2705(); local15 != null; local15 = (Class4_Sub38) this.aClass102_8.method2704()) {
			local15.method5684();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZZ)V")
	private synchronized void method1443(@OriginalArg(0) boolean arg0) {
		this.aClass175_1.method4049();
		this.aClass4_Sub30_1 = null;
		this.method1445(arg0);
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(ZI)V")
	private void method1444(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1444(local9);
			}
			return;
		}
		this.anIntArray120[arg0] = 12800;
		this.anIntArray131[arg0] = 8192;
		this.anIntArray134[arg0] = 16383;
		this.anIntArray126[arg0] = 8192;
		this.anIntArray128[arg0] = 0;
		this.anIntArray123[arg0] = 8192;
		this.method1451(arg0);
		this.method1446(arg0);
		this.anIntArray133[arg0] = 0;
		this.anIntArray121[arg0] = 32767;
		this.anIntArray135[arg0] = 256;
		this.anIntArray124[arg0] = 0;
		this.method1423(arg0, 8192);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZ)V")
	private void method1445(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1421(-1);
		} else {
			this.method1429(-1);
		}
		this.method1444(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray122[local29] = this.anIntArray119[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray132[local45] = this.anIntArray119[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BI)V")
	private void method1446(@OriginalArg(1) int arg0) {
		if ((this.anIntArray133[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class4_Sub28 local26 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4140(); local26 != null; local26 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4144()) {
			if (local26.anInt4386 == arg0) {
				local26.anInt4391 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(III)V")
	private synchronized void method1447() {
		for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
			this.anIntArray125[local16] = 256;
		}
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "()I")
	@Override
	public synchronized int method4859() {
		return 0;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IBI)V")
	private void method1448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray122[arg0] != arg1) {
			this.anIntArray122[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass4_Sub28ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "()Lclient!ti;")
	@Override
	public synchronized Class4_Sub15 method4857() {
		return null;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!lm;[IIZI)Z")
	public boolean method1449(@OriginalArg(0) Class4_Sub28 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt4380 = Static261.anInt4928 / 100;
		if (arg0.anInt4394 >= 0 && (arg0.aClass4_Sub15_Sub3_3 == null || arg0.aClass4_Sub15_Sub3_3.method4462())) {
			arg0.method3453();
			arg0.method5684();
			if (arg0.anInt4385 > 0 && this.aClass4_Sub28ArrayArray2[arg0.anInt4386][arg0.anInt4385] == arg0) {
				this.aClass4_Sub28ArrayArray2[arg0.anInt4386][arg0.anInt4385] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg0.anInt4398;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray123[arg0.anInt4386] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg0.anInt4398 = local56;
		}
		arg0.aClass4_Sub15_Sub3_3.method4467(this.method1454(arg0));
		@Pc(96) Class252 local96 = arg0.aClass252_1;
		arg0.anInt4397++;
		arg0.anInt4389 += local96.anInt6939;
		@Pc(120) boolean local120 = false;
		@Pc(138) double local138 = (double) ((arg0.anInt4390 * arg0.anInt4398 >> 12) + (arg0.anInt4384 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt6937 > 0) {
			if (local96.anInt6938 <= 0) {
				arg0.anInt4396 += 128;
			} else {
				arg0.anInt4396 += (int) (Math.pow(2.0D, (double) local96.anInt6938 * local138) * 128.0D + 0.5D);
			}
			if (arg0.anInt4396 * local96.anInt6937 >= 819200) {
				local120 = true;
			}
		}
		if (local96.aByteArray100 != null) {
			if (local96.anInt6943 <= 0) {
				arg0.anInt4393 += 128;
			} else {
				arg0.anInt4393 += (int) (Math.pow(2.0D, (double) local96.anInt6943 * local138) * 128.0D + 0.5D);
			}
			while (arg0.anInt4395 < local96.aByteArray100.length - 2 && arg0.anInt4393 > (local96.aByteArray100[arg0.anInt4395 + 2] & 0xFF) << 8) {
				arg0.anInt4395 += 2;
			}
			if (local96.aByteArray100.length - 2 == arg0.anInt4395 && local96.aByteArray100[arg0.anInt4395 + 1] == 0) {
				local120 = true;
			}
		}
		if (arg0.anInt4394 >= 0 && local96.aByteArray101 != null && (this.anIntArray133[arg0.anInt4386] & 0x1) == 0 && (arg0.anInt4385 < 0 || this.aClass4_Sub28ArrayArray2[arg0.anInt4386][arg0.anInt4385] != arg0)) {
			if (local96.anInt6941 > 0) {
				arg0.anInt4394 += (int) (Math.pow(2.0D, (double) local96.anInt6941 * local138) * 128.0D + 0.5D);
			} else {
				arg0.anInt4394 += 128;
			}
			while (local96.aByteArray101.length - 2 > arg0.anInt4382 && arg0.anInt4394 > (local96.aByteArray101[arg0.anInt4382 + 2] & 0xFF) << 8) {
				arg0.anInt4382 += 2;
			}
			if (arg0.anInt4382 == local96.aByteArray101.length - 2) {
				local120 = true;
			}
		}
		if (!local120) {
			arg0.aClass4_Sub15_Sub3_3.method4480(arg0.anInt4380, this.method1435(arg0), this.method1439(arg0));
			return false;
		}
		arg0.aClass4_Sub15_Sub3_3.method4490(arg0.anInt4380);
		if (arg1 == null) {
			arg0.aClass4_Sub15_Sub3_3.method4861(arg2);
		} else {
			arg0.aClass4_Sub15_Sub3_3.method4855(arg1, arg3, arg2);
		}
		if (arg0.aClass4_Sub15_Sub3_3.method4487()) {
			this.aClass4_Sub15_Sub4_1.aClass4_Sub15_Sub2_1.method2954(arg0.aClass4_Sub15_Sub3_3);
		}
		arg0.method3453();
		if (arg0.anInt4394 >= 0) {
			arg0.method5684();
			if (arg0.anInt4385 > 0 && arg0 == this.aClass4_Sub28ArrayArray2[arg0.anInt4386][arg0.anInt4385]) {
				this.aClass4_Sub28ArrayArray2[arg0.anInt4386][arg0.anInt4385] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZBLclient!nb;)V")
	public synchronized void method1450(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		this.method1426(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(BI)V")
	private void method1451(@OriginalArg(1) int arg0) {
		if ((this.anIntArray133[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub28 local18 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4140(); local18 != null; local18 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4144()) {
			if (local18.anInt4386 == arg0 && this.aClass4_Sub28ArrayArray1[arg0][local18.anInt4384] == null && local18.anInt4394 < 0) {
				local18.anInt4394 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4855(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass175_1.method4057()) {
			@Pc(14) int local14 = this.anInt1596 * this.aClass175_1.anInt5296 / Static261.anInt4928;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong56;
				if (this.aLong57 - local23 >= 0L) {
					this.aLong56 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong57 + (long) local14 - this.aLong56 - 1L) / (long) local14);
				this.aLong56 += (long) local14 * (long) local54;
				this.aClass4_Sub15_Sub4_1.method4855(arg0, arg1, local54);
				arg2 -= local54;
				arg1 += local54;
				this.method1432();
			} while (this.aClass175_1.method4057());
		}
		this.aClass4_Sub15_Sub4_1.method4855(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZIII)V")
	private void method1452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub28 local12 = this.aClass4_Sub28ArrayArray1[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass4_Sub28ArrayArray1[arg0][arg2] = null;
		if ((this.anIntArray133[arg0] & 0x2) == 0) {
			local12.anInt4394 = 0;
			return;
		}
		for (@Pc(49) Class4_Sub28 local49 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4140(); local49 != null; local49 = (Class4_Sub28) this.aClass4_Sub15_Sub4_1.aClass183_44.method4144()) {
			if (local12.anInt4386 == local49.anInt4386 && local49.anInt4394 < 0 && local49 != local12) {
				local12.anInt4394 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(III)V")
	public synchronized void method1453() {
		this.method1427();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZLclient!lm;)I")
	private int method1454(@OriginalArg(1) Class4_Sub28 arg0) {
		@Pc(14) int local14 = (arg0.anInt4398 * arg0.anInt4390 >> 12) + arg0.anInt4399;
		local14 += (this.anIntArray126[arg0.anInt4386] - 8192) * this.anIntArray135[arg0.anInt4386] >> 12;
		@Pc(41) Class252 local41 = arg0.aClass252_1;
		@Pc(64) int local64;
		if (local41.anInt6939 > 0 && (local41.anInt6940 > 0 || this.anIntArray128[arg0.anInt4386] > 0)) {
			local64 = local41.anInt6940 << 2;
			@Pc(69) int local69 = local41.anInt6944 << 1;
			if (local69 > arg0.anInt4397) {
				local64 = arg0.anInt4397 * local64 / local69;
			}
			local64 += this.anIntArray128[arg0.anInt4386] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt4389 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local99 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass4_Sub4_Sub1_1.anInt3727 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static261.anInt4928 + 0.5D);
		return local64 < 1 ? 1 : local64;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(IBI)V")
	private void method1455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!oj;ZLclient!fs;Lclient!nb;)Z")
	public synchronized boolean method1456(@OriginalArg(1) Class171 arg0, @OriginalArg(3) Class76 arg1, @OriginalArg(4) Class4_Sub30 arg2) {
		arg2.method3726();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class4_Sub19 local26 = (Class4_Sub19) arg2.aClass102_23.method2705(); local26 != null; local26 = (Class4_Sub19) arg2.aClass102_23.method2704()) {
			@Pc(32) int local32 = (int) local26.aLong224;
			@Pc(40) Class4_Sub38 local40 = (Class4_Sub38) this.aClass102_8.method2700((long) local32);
			if (local40 == null) {
				local40 = Static30.method577(local32, arg1);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass102_8.method2703((long) local32, local40);
			}
			if (!local40.method4398(arg0, local26.aByteArray24, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method3725();
		}
		return local9;
	}
}
