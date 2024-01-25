import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class4_Sub14_Sub1 extends Class4_Sub14 {

	@OriginalMember(owner = "client!gj", name = "Gb", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!gj", name = "Hb", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!gj", name = "Ib", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!gj", name = "Kb", descriptor = "I")
	private int anInt2402;

	@OriginalMember(owner = "client!gj", name = "Lb", descriptor = "I")
	private int anInt2403;

	@OriginalMember(owner = "client!gj", name = "Mb", descriptor = "I")
	private int anInt2404;

	@OriginalMember(owner = "client!gj", name = "Nb", descriptor = "Z")
	private boolean aBoolean156;

	@OriginalMember(owner = "client!gj", name = "Ob", descriptor = "Lclient!hr;")
	private Class4_Sub17 aClass4_Sub17_1;

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "[I")
	private final int[] anIntArray190 = new int[16];

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "[I")
	private final int[] anIntArray196 = new int[16];

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "[I")
	public final int[] anIntArray191 = new int[16];

	@OriginalMember(owner = "client!gj", name = "Z", descriptor = "[[Lclient!rt;")
	private final Class4_Sub37[][] aClass4_Sub37ArrayArray1 = new Class4_Sub37[16][128];

	@OriginalMember(owner = "client!gj", name = "X", descriptor = "[I")
	private final int[] anIntArray198 = new int[16];

	@OriginalMember(owner = "client!gj", name = "ab", descriptor = "[I")
	private final int[] anIntArray199 = new int[16];

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
	private int anInt2372 = 256;

	@OriginalMember(owner = "client!gj", name = "lb", descriptor = "I")
	private final int lb = 1000000;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
	private final int[] anIntArray188 = new int[16];

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "[I")
	private final int[] anIntArray194 = new int[16];

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "[I")
	private final int[] anIntArray192 = new int[16];

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "[I")
	private final int[] anIntArray193 = new int[16];

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "[I")
	private final int[] anIntArray189 = new int[16];

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "[I")
	private final int[] anIntArray195 = new int[16];

	@OriginalMember(owner = "client!gj", name = "gb", descriptor = "[I")
	public final int[] anIntArray200 = new int[16];

	@OriginalMember(owner = "client!gj", name = "qb", descriptor = "[[Lclient!rt;")
	private final Class4_Sub37[][] aClass4_Sub37ArrayArray2 = new Class4_Sub37[16][128];

	@OriginalMember(owner = "client!gj", name = "W", descriptor = "[I")
	private final int[] anIntArray197 = new int[16];

	@OriginalMember(owner = "client!gj", name = "Ab", descriptor = "[I")
	private final int[] anIntArray203 = new int[16];

	@OriginalMember(owner = "client!gj", name = "zb", descriptor = "[I")
	private final int[] anIntArray202 = new int[16];

	@OriginalMember(owner = "client!gj", name = "xb", descriptor = "[I")
	public final int[] anIntArray201 = new int[16];

	@OriginalMember(owner = "client!gj", name = "kb", descriptor = "Lclient!kk;")
	private final Class149 aClass149_1 = new Class149();

	@OriginalMember(owner = "client!gj", name = "Jb", descriptor = "Lclient!qq;")
	private final Class4_Sub14_Sub3 aClass4_Sub14_Sub3_1 = new Class4_Sub14_Sub3(this);

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "Lclient!ek;")
	private final Class67 aClass67_11 = new Class67(128);

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class4_Sub14_Sub1() {
		this.method1911();
		this.method1908(true);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)V")
	public synchronized void method1882() {
		this.method1915();
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "()Lclient!hu;")
	@Override
	public synchronized Class4_Sub14 method4787() {
		return null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!jj;Lclient!qn;Lclient!hr;II)Z")
	public synchronized boolean method1883(@OriginalArg(0) Class136 arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class4_Sub17 arg2) {
		arg2.method2247();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class4_Sub33 local29 = (Class4_Sub33) arg2.aClass67_17.method1428(); local29 != null; local29 = (Class4_Sub33) arg2.aClass67_17.method1424()) {
			@Pc(35) int local35 = (int) local29.aLong227;
			@Pc(43) Class4_Sub26 local43 = (Class4_Sub26) this.aClass67_11.method1429((long) local35);
			if (local43 == null) {
				local43 = Static346.method4599(local35, arg1);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass67_11.method1426(local43, (long) local35);
			}
			if (!local43.method3328(local23, local29.aByteArray59, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method2249();
		}
		return local9;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)V")
	private synchronized void method1884(@OriginalArg(0) boolean arg0) {
		this.aClass149_1.method2882();
		this.aClass4_Sub17_1 = null;
		this.method1908(arg0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)V")
	private void method1885(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
				this.method1885(local20);
			}
			return;
		}
		this.anIntArray195[arg0] = 12800;
		this.anIntArray196[arg0] = 8192;
		this.anIntArray189[arg0] = 16383;
		this.anIntArray202[arg0] = 8192;
		this.anIntArray198[arg0] = 0;
		this.anIntArray190[arg0] = 8192;
		this.method1891(arg0);
		this.method1909(arg0);
		this.anIntArray200[arg0] = 0;
		this.anIntArray197[arg0] = 32767;
		this.anIntArray199[arg0] = 256;
		this.anIntArray191[arg0] = 0;
		this.method1894(arg0, 8192);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!rt;I)I")
	private int method1886(@OriginalArg(0) Class4_Sub37 arg0) {
		@Pc(9) int local9 = this.anIntArray196[arg0.anInt5879];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt5882) * (-local9 + 16384) + 32 >> 6) : arg0.anInt5882 * local9 + 32 >> 6;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Lclient!rt;I)I")
	private int method1887(@OriginalArg(0) Class4_Sub37 arg0) {
		if (this.anIntArray203[arg0.anInt5879] == 0) {
			return 0;
		}
		@Pc(21) Class144 local21 = arg0.aClass144_1;
		@Pc(37) int local37 = this.anIntArray195[arg0.anInt5879] * this.anIntArray189[arg0.anInt5879] + 4096 >> 13;
		@Pc(45) int local45 = local37 * local37 + 16384 >> 15;
		@Pc(54) int local54 = arg0.anInt5885 * local45 + 16384 >> 15;
		@Pc(63) int local63 = local54 * this.anInt2372 + 128 >> 8;
		local37 = local63 * this.anIntArray203[arg0.anInt5879] + 128 >> 8;
		if (local21.anInt3570 > 0) {
			local37 = (int) ((double) local37 * Math.pow(0.5D, (double) local21.anInt3570 * (double) arg0.anInt5873 * 1.953125E-5D) + 0.5D);
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (local21.aByteArray38 != null) {
			local105 = arg0.anInt5876;
			local113 = local21.aByteArray38[arg0.anInt5878 + 1];
			if (local21.aByteArray38.length - 2 > arg0.anInt5878) {
				local131 = (local21.aByteArray38[arg0.anInt5878] & 0xFF) << 8;
				local143 = (local21.aByteArray38[arg0.anInt5878 + 2] & 0xFF) << 8;
				local113 += (local105 - local131) * (local21.aByteArray38[arg0.anInt5878 + 3] + -local113) / (local143 - local131);
			}
			local37 = local37 * local113 + 32 >> 6;
		}
		if (arg0.anInt5877 > 0 && local21.aByteArray39 != null) {
			local105 = arg0.anInt5877;
			local113 = local21.aByteArray39[arg0.anInt5872 + 1];
			if (arg0.anInt5872 < local21.aByteArray39.length - 2) {
				local131 = (local21.aByteArray39[arg0.anInt5872] & 0xFF) << 8;
				local143 = (local21.aByteArray39[arg0.anInt5872 + 2] & 0xFF) << 8;
				local113 += (local105 - local131) * (-local113 + local21.aByteArray39[arg0.anInt5872 - -3]) / (local143 - local131);
			}
			local37 = local37 * local113 + 32 >> 6;
		}
		return local37;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)V")
	private void method1888(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class4_Sub37 local8 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5263(); local8 != null; local8 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5271()) {
			if ((arg0 < 0 || arg0 == local8.anInt5879) && local8.anInt5877 < 0) {
				this.aClass4_Sub37ArrayArray1[local8.anInt5879][local8.anInt5887] = null;
				local8.anInt5877 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BIII)V")
	private void method1889(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
	private void method1891(@OriginalArg(0) int arg0) {
		if ((this.anIntArray200[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub37 local18 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5263(); local18 != null; local18 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5271()) {
			if (local18.anInt5879 == arg0 && this.aClass4_Sub37ArrayArray1[arg0][local18.anInt5887] == null && local18.anInt5877 < 0) {
				local18.anInt5877 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
	private void method1892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray192[arg0]) {
			this.anIntArray192[arg0] = arg1;
			for (@Pc(25) int local25 = 0; local25 < 128; local25++) {
				this.aClass4_Sub37ArrayArray2[arg0][local25] = null;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBI)V")
	private void method1893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IBI)V")
	private void method1894(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray194[arg0] = arg1;
		this.anIntArray201[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(ZI)V")
	private void method1895(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1903(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1903(local18, local24, 64);
			} else {
				this.method1904(local18, local30, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1889(local24, local30, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray193[local18] = (this.anIntArray193[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray193[local18] = (local30 << 7) + (this.anIntArray193[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray198[local18] = (this.anIntArray198[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray198[local18] = local30 + (this.anIntArray198[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray190[local18] = (this.anIntArray190[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray190[local18] = local30 + (this.anIntArray190[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray195[local18] = (this.anIntArray195[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray195[local18] = (this.anIntArray195[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray196[local18] = (this.anIntArray196[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray196[local18] = local30 + (this.anIntArray196[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray189[local18] = (local30 << 7) + (this.anIntArray189[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray189[local18] = (this.anIntArray189[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray200[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray200[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method1891(local18);
					this.anIntArray200[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray200[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray197[local18] = (this.anIntArray197[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray197[local18] = local30 + (this.anIntArray197[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray197[local18] = (local30 << 7) + (this.anIntArray197[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray197[local18] = local30 + (this.anIntArray197[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method1906(local18);
			}
			if (local24 == 121) {
				this.method1885(local18);
			}
			if (local24 == 123) {
				this.method1888(local18);
			}
			@Pc(510) int local510;
			if (local24 == 6) {
				local510 = this.anIntArray197[local18];
				if (local510 == 16384) {
					this.anIntArray199[local18] = (this.anIntArray199[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local510 = this.anIntArray197[local18];
				if (local510 == 16384) {
					this.anIntArray199[local18] = (this.anIntArray199[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray191[local18] = (this.anIntArray191[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray191[local18] = local30 + (this.anIntArray191[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray200[local18] |= 0x4;
				} else {
					this.method1909(local18);
					this.anIntArray200[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1894(local18, (local30 << 7) + (this.anIntArray194[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method1894(local18, (this.anIntArray194[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1892(local18, this.anIntArray193[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1893(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method1916(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1908(true);
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()Lclient!hu;")
	@Override
	public synchronized Class4_Sub14 method4784() {
		return this.aClass4_Sub14_Sub3_1;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(BI)V")
	public synchronized void method1896(@OriginalArg(1) int arg0) {
		this.anInt2372 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!rt;[IIII)Z")
	public boolean method1897(@OriginalArg(0) Class4_Sub37 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt5881 = Static145.anInt2577 / 100;
		if (arg0.anInt5877 >= 0 && (arg0.aClass4_Sub14_Sub4_4 == null || arg0.aClass4_Sub14_Sub4_4.method4810())) {
			arg0.method4692();
			arg0.method6059();
			if (arg0.anInt5875 > 0 && this.aClass4_Sub37ArrayArray2[arg0.anInt5879][arg0.anInt5875] == arg0) {
				this.aClass4_Sub37ArrayArray2[arg0.anInt5879][arg0.anInt5875] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg0.anInt5880;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray190[arg0.anInt5879] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg0.anInt5880 = local59;
		}
		arg0.aClass4_Sub14_Sub4_4.method4797(this.method1899(arg0));
		@Pc(108) Class144 local108 = arg0.aClass144_1;
		@Pc(110) boolean local110 = false;
		arg0.anInt5874++;
		arg0.anInt5888 += local108.anInt3575;
		@Pc(141) double local141 = (double) ((arg0.anInt5887 - 60 << 8) + (arg0.anInt5883 * arg0.anInt5880 >> 12)) * 5.086263020833333E-6D;
		if (local108.anInt3570 > 0) {
			if (local108.anInt3569 > 0) {
				arg0.anInt5873 += (int) (Math.pow(2.0D, (double) local108.anInt3569 * local141) * 128.0D + 0.5D);
			} else {
				arg0.anInt5873 += 128;
			}
			if (local108.anInt3570 * arg0.anInt5873 >= 819200) {
				local110 = true;
			}
		}
		if (local108.aByteArray38 != null) {
			if (local108.anInt3579 > 0) {
				arg0.anInt5876 += (int) (Math.pow(2.0D, (double) local108.anInt3579 * local141) * 128.0D + 0.5D);
			} else {
				arg0.anInt5876 += 128;
			}
			while (local108.aByteArray38.length - 2 > arg0.anInt5878 && (local108.aByteArray38[arg0.anInt5878 + 2] & 0xFF) << 8 < arg0.anInt5876) {
				arg0.anInt5878 += 2;
			}
			if (arg0.anInt5878 == local108.aByteArray38.length - 2 && local108.aByteArray38[arg0.anInt5878 + 1] == 0) {
				local110 = true;
			}
		}
		if (arg0.anInt5877 >= 0 && local108.aByteArray39 != null && (this.anIntArray200[arg0.anInt5879] & 0x1) == 0 && (arg0.anInt5875 < 0 || arg0 != this.aClass4_Sub37ArrayArray2[arg0.anInt5879][arg0.anInt5875])) {
			if (local108.anInt3578 <= 0) {
				arg0.anInt5877 += 128;
			} else {
				arg0.anInt5877 += (int) (Math.pow(2.0D, (double) local108.anInt3578 * local141) * 128.0D + 0.5D);
			}
			while (local108.aByteArray39.length - 2 > arg0.anInt5872 && (local108.aByteArray39[arg0.anInt5872 + 2] & 0xFF) << 8 < arg0.anInt5877) {
				arg0.anInt5872 += 2;
			}
			if (arg0.anInt5872 == local108.aByteArray39.length - 2) {
				local110 = true;
			}
		}
		if (!local110) {
			arg0.aClass4_Sub14_Sub4_4.method4796(arg0.anInt5881, this.method1887(arg0), this.method1886(arg0));
			return false;
		}
		arg0.aClass4_Sub14_Sub4_4.method4805(arg0.anInt5881);
		if (arg1 == null) {
			arg0.aClass4_Sub14_Sub4_4.method4783(arg2);
		} else {
			arg0.aClass4_Sub14_Sub4_4.method4788(arg1, arg3, arg2);
		}
		if (arg0.aClass4_Sub14_Sub4_4.method4823()) {
			this.aClass4_Sub14_Sub3_1.aClass4_Sub14_Sub2_1.method2418(arg0.aClass4_Sub14_Sub4_4);
		}
		arg0.method4692();
		if (arg0.anInt5877 >= 0) {
			arg0.method6059();
			if (arg0.anInt5875 > 0 && this.aClass4_Sub37ArrayArray2[arg0.anInt5879][arg0.anInt5875] == arg0) {
				this.aClass4_Sub37ArrayArray2[arg0.anInt5879][arg0.anInt5875] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLclient!hr;)V")
	public synchronized void method1898(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub17 arg1) {
		this.method1917(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!rt;B)I")
	private int method1899(@OriginalArg(0) Class4_Sub37 arg0) {
		@Pc(14) int local14 = (arg0.anInt5883 * arg0.anInt5880 >> 12) + arg0.anInt5890;
		local14 += (this.anIntArray202[arg0.anInt5879] - 8192) * this.anIntArray199[arg0.anInt5879] >> 12;
		@Pc(35) Class144 local35 = arg0.aClass144_1;
		@Pc(58) int local58;
		if (local35.anInt3575 > 0 && (local35.anInt3580 > 0 || this.anIntArray198[arg0.anInt5879] > 0)) {
			local58 = local35.anInt3580 << 2;
			@Pc(63) int local63 = local35.anInt3581 << 1;
			if (local63 > arg0.anInt5874) {
				local58 = arg0.anInt5874 * local58 / local63;
			}
			local58 += this.anIntArray198[arg0.anInt5879] >> 7;
			@Pc(93) double local93 = Math.sin((double) (arg0.anInt5888 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local58 * local93);
		}
		local58 = (int) ((double) (arg0.aClass4_Sub15_Sub1_2.anInt3298 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static145.anInt2577 + 0.5D);
		return local58 < 1 ? 1 : local58;
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
	public synchronized void method1900() {
		for (@Pc(7) Class4_Sub26 local7 = (Class4_Sub26) this.aClass67_11.method1428(); local7 != null; local7 = (Class4_Sub26) this.aClass67_11.method1424()) {
			local7.method3329();
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4788(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass149_1.method2877()) {
			@Pc(18) int local18 = this.aClass149_1.anInt3618 * this.lb / Static145.anInt2577;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong72;
				if (this.aLong73 - local27 >= 0L) {
					this.aLong72 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong73 + (long) local18 - this.aLong72 - 1L) / (long) local18);
				this.aLong72 += (long) local58 * (long) local18;
				this.aClass4_Sub14_Sub3_1.method4788(arg0, arg1, local58);
				arg2 -= local58;
				arg1 += local58;
				this.method1907();
			} while (this.aClass149_1.method2877());
		}
		this.aClass4_Sub14_Sub3_1.method4788(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(Lclient!rt;I)Z")
	public boolean method1902(@OriginalArg(0) Class4_Sub37 arg0) {
		if (arg0.aClass4_Sub14_Sub4_4 != null) {
			return false;
		}
		if (arg0.anInt5877 >= 0) {
			arg0.method6059();
			if (arg0.anInt5875 > 0 && arg0 == this.aClass4_Sub37ArrayArray2[arg0.anInt5879][arg0.anInt5875]) {
				this.aClass4_Sub37ArrayArray2[arg0.anInt5879][arg0.anInt5875] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)V")
	private void method1903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub37 local12 = this.aClass4_Sub37ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass4_Sub37ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray200[arg0] & 0x2) == 0) {
			local12.anInt5877 = 0;
			return;
		}
		for (@Pc(47) Class4_Sub37 local47 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5263(); local47 != null; local47 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5271()) {
			if (local12.anInt5879 == local47.anInt5879 && local47.anInt5877 < 0 && local12 != local47) {
				local12.anInt5877 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIII)V")
	private void method1904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1903(arg0, arg2, 64);
		if ((this.anIntArray200[arg0] & 0x2) != 0) {
			for (@Pc(27) Class4_Sub37 local27 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5267(); local27 != null; local27 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5275()) {
				if (local27.anInt5879 == arg0 && local27.anInt5877 < 0) {
					this.aClass4_Sub37ArrayArray1[arg0][local27.anInt5887] = null;
					this.aClass4_Sub37ArrayArray1[arg0][arg2] = local27;
					@Pc(69) int local69 = (local27.anInt5880 * local27.anInt5883 >> 12) + local27.anInt5890;
					local27.anInt5890 += arg2 - local27.anInt5887 << 8;
					local27.anInt5880 = 4096;
					local27.anInt5887 = arg2;
					local27.anInt5883 = local69 - local27.anInt5890;
					return;
				}
			}
		}
		@Pc(114) Class4_Sub26 local114 = (Class4_Sub26) this.aClass67_11.method1429((long) this.anIntArray192[arg0]);
		if (local114 == null) {
			return;
		}
		@Pc(122) Class4_Sub15_Sub1 local122 = local114.aClass4_Sub15_Sub1Array1[arg2];
		if (local122 == null) {
			return;
		}
		@Pc(129) Class4_Sub37 local129 = new Class4_Sub37();
		local129.anInt5879 = arg0;
		local129.aClass4_Sub26_1 = local114;
		local129.aClass4_Sub15_Sub1_2 = local122;
		local129.aClass144_1 = local114.aClass144Array1[arg2];
		local129.anInt5875 = local114.aByteArray56[arg2];
		local129.anInt5887 = arg2;
		local129.anInt5885 = local114.aByteArray55[arg2] * local114.anInt4182 * arg1 * arg1 + 1024 >> 11;
		local129.anInt5882 = local114.aByteArray57[arg2] & 0xFF;
		local129.anInt5890 = (arg2 << 8) - (local114.aShortArray81[arg2] & 0x7FFF);
		local129.anInt5873 = 0;
		local129.anInt5878 = 0;
		local129.anInt5876 = 0;
		local129.anInt5872 = 0;
		local129.anInt5877 = -1;
		if (this.anIntArray191[arg0] == 0) {
			local129.aClass4_Sub14_Sub4_4 = Static466.method4811(local122, this.method1899(local129), this.method1887(local129), this.method1886(local129));
		} else {
			local129.aClass4_Sub14_Sub4_4 = Static466.method4811(local122, this.method1899(local129), 0, this.method1886(local129));
			this.method1912(local114.aShortArray81[arg2] < 0, local129);
		}
		if (local114.aShortArray81[arg2] < 0) {
			local129.aClass4_Sub14_Sub4_4.method4812(-1);
		}
		if (local129.anInt5875 >= 0) {
			@Pc(299) Class4_Sub37 local299 = this.aClass4_Sub37ArrayArray2[arg0][local129.anInt5875];
			if (local299 != null && local299.anInt5877 < 0) {
				this.aClass4_Sub37ArrayArray1[arg0][local299.anInt5887] = null;
				local299.anInt5877 = 0;
			}
			this.aClass4_Sub37ArrayArray2[arg0][local129.anInt5875] = local129;
		}
		this.aClass4_Sub14_Sub3_1.aClass244_32.method5273(local129);
		this.aClass4_Sub37ArrayArray1[arg0][arg2] = local129;
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)V")
	public synchronized void method1905() {
		for (@Pc(7) Class4_Sub26 local7 = (Class4_Sub26) this.aClass67_11.method1428(); local7 != null; local7 = (Class4_Sub26) this.aClass67_11.method1424()) {
			local7.method6059();
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)V")
	private void method1906(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class4_Sub37 local18 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5263(); local18 != null; local18 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5271()) {
			if (arg0 < 0 || local18.anInt5879 == arg0) {
				if (local18.aClass4_Sub14_Sub4_4 != null) {
					local18.aClass4_Sub14_Sub4_4.method4805(Static145.anInt2577 / 100);
					if (local18.aClass4_Sub14_Sub4_4.method4823()) {
						this.aClass4_Sub14_Sub3_1.aClass4_Sub14_Sub2_1.method2418(local18.aClass4_Sub14_Sub4_4);
					}
					local18.method4692();
				}
				if (local18.anInt5877 < 0) {
					this.aClass4_Sub37ArrayArray1[local18.anInt5879][local18.anInt5887] = null;
				}
				local18.method6059();
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "(I)V")
	private void method1907() {
		@Pc(8) int local8 = this.anInt2402;
		@Pc(11) int local11 = this.anInt2403;
		@Pc(14) long local14 = this.aLong73;
		if (this.aClass4_Sub17_1 != null && local11 == this.anInt2404) {
			this.method1917(this.aBoolean155, this.aClass4_Sub17_1, this.aBoolean156);
			this.method1907();
			return;
		}
		while (this.anInt2403 == local11) {
			while (this.aClass149_1.anIntArray270[local8] == local11) {
				this.aClass149_1.method2888(local8);
				@Pc(47) int local47 = this.aClass149_1.method2886(local8);
				if (local47 == 1) {
					this.aClass149_1.method2884();
					this.aClass149_1.method2876(local8);
					if (this.aClass149_1.method2883()) {
						if (this.aClass4_Sub17_1 != null) {
							this.method1898(this.aBoolean155, this.aClass4_Sub17_1);
							this.method1907();
							return;
						}
						if (!this.aBoolean155 || local11 == 0) {
							this.method1908(true);
							this.aClass149_1.method2882();
							return;
						}
						this.aClass149_1.method2878(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method1895(local47);
				}
				this.aClass149_1.method2891(local8);
				this.aClass149_1.method2876(local8);
			}
			local8 = this.aClass149_1.method2887();
			local11 = this.aClass149_1.anIntArray270[local8];
			local14 = this.aClass149_1.method2880(local11);
		}
		this.aLong73 = local14;
		this.anInt2402 = local8;
		this.anInt2403 = local11;
		if (this.aClass4_Sub17_1 != null && local11 > this.anInt2404) {
			this.anInt2403 = this.anInt2404;
			this.anInt2402 = -1;
			this.aLong73 = this.aClass149_1.method2880(this.anInt2403);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
	private void method1908(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1906(-1);
		} else {
			this.method1888(-1);
		}
		this.method1885(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray192[local29] = this.anIntArray188[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray193[local45] = this.anIntArray188[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V")
	private void method1909(@OriginalArg(0) int arg0) {
		if ((this.anIntArray200[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(23) Class4_Sub37 local23 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5263(); local23 != null; local23 = (Class4_Sub37) this.aClass4_Sub14_Sub3_1.aClass244_32.method5271()) {
			if (arg0 == local23.anInt5879) {
				local23.anInt5886 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Z")
	public synchronized boolean method1910() {
		return this.aClass149_1.method2877();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4783(@OriginalArg(0) int arg0) {
		if (this.aClass149_1.method2877()) {
			@Pc(18) int local18 = this.aClass149_1.anInt3618 * this.lb / Static145.anInt2577;
			do {
				@Pc(27) long local27 = this.aLong72 + (long) local18 * (long) arg0;
				if (this.aLong73 - local27 >= 0L) {
					this.aLong72 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong73 - this.aLong72 - 1L) / (long) local18);
				this.aLong72 += (long) local18 * (long) local58;
				this.aClass4_Sub14_Sub3_1.method4783(local58);
				arg0 -= local58;
				this.method1907();
			} while (this.aClass149_1.method2877());
		}
		this.aClass4_Sub14_Sub3_1.method4783(arg0);
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "()I")
	@Override
	public synchronized int method4786() {
		return 0;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(BII)V")
	private synchronized void method1911() {
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray203[local19] = 256;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZBLclient!rt;)V")
	public void method1912(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub37 arg1) {
		@Pc(8) int local8 = arg1.aClass4_Sub15_Sub1_2.aByteArray34.length;
		@Pc(27) int local27;
		if (arg0 && arg1.aClass4_Sub15_Sub1_2.aBoolean257) {
			@Pc(39) int local39 = local8 + local8 - arg1.aClass4_Sub15_Sub1_2.anInt3296;
			local27 = (int) ((long) local39 * (long) this.anIntArray191[arg1.anInt5879] >> 6);
			local8 <<= 0x8;
			if (local27 >= local8) {
				arg1.aClass4_Sub14_Sub4_4.method4813();
				local27 = local8 + local8 - local27 - 1;
			}
		} else {
			local27 = (int) ((long) this.anIntArray191[arg1.anInt5879] * (long) local8 >> 6);
		}
		arg1.aClass4_Sub14_Sub4_4.method4801(local27);
	}

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "(I)I")
	public int method1913() {
		return this.anInt2372;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(III)V")
	private void method1915() {
		this.anIntArray188[9] = 128;
		this.anIntArray193[9] = 128;
		this.method1892(9, 128);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZII)V")
	private void method1916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray202[arg1] = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZLclient!hr;Z)V")
	private synchronized void method1917(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub17 arg1, @OriginalArg(3) boolean arg2) {
		this.method1884(arg2);
		this.aClass149_1.method2879(arg1.aByteArray32);
		this.aLong72 = 0L;
		this.aBoolean155 = arg0;
		@Pc(26) int local26 = this.aClass149_1.method2881();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			this.aClass149_1.method2888(local28);
			this.aClass149_1.method2891(local28);
			this.aClass149_1.method2876(local28);
		}
		this.anInt2402 = this.aClass149_1.method2887();
		this.anInt2403 = this.aClass149_1.anIntArray270[this.anInt2402];
		this.aLong73 = this.aClass149_1.method2880(this.anInt2403);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
	public synchronized void method1918() {
		this.method1884(true);
	}
}
