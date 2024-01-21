import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class2_Sub7_Sub1 extends Class2_Sub7 {

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "I")
	private int anInt2063;

	@OriginalMember(owner = "client!h", name = "Gb", descriptor = "I")
	private int anInt2064;

	@OriginalMember(owner = "client!h", name = "Hb", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!h", name = "Ib", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!h", name = "Jb", descriptor = "Z")
	private boolean aBoolean86;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "[I")
	public final int[] anIntArray193 = new int[16];

	@OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
	private final int[] anIntArray190 = new int[16];

	@OriginalMember(owner = "client!h", name = "H", descriptor = "[I")
	private final int[] anIntArray192 = new int[16];

	@OriginalMember(owner = "client!h", name = "P", descriptor = "[I")
	private final int[] anIntArray194 = new int[16];

	@OriginalMember(owner = "client!h", name = "C", descriptor = "[I")
	private final int[] anIntArray191 = new int[16];

	@OriginalMember(owner = "client!h", name = "X", descriptor = "[[Lclient!lf;")
	private final Class2_Sub14[][] aClass2_Sub14ArrayArray1 = new Class2_Sub14[16][128];

	@OriginalMember(owner = "client!h", name = "cb", descriptor = "[I")
	private final int[] anIntArray196 = new int[16];

	@OriginalMember(owner = "client!h", name = "R", descriptor = "I")
	private final int anInt2038 = 1000000;

	@OriginalMember(owner = "client!h", name = "U", descriptor = "[I")
	private final int[] anIntArray195 = new int[16];

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "[[Lclient!lf;")
	private final Class2_Sub14[][] aClass2_Sub14ArrayArray2 = new Class2_Sub14[16][128];

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "[I")
	private final int[] anIntArray200 = new int[16];

	@OriginalMember(owner = "client!h", name = "mb", descriptor = "[I")
	public final int[] anIntArray201 = new int[16];

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "[I")
	private final int[] anIntArray198 = new int[16];

	@OriginalMember(owner = "client!h", name = "sb", descriptor = "[I")
	private final int[] anIntArray202 = new int[16];

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "[I")
	private final int[] anIntArray197 = new int[16];

	@OriginalMember(owner = "client!h", name = "qb", descriptor = "I")
	private int anInt2052 = 256;

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "[I")
	private final int[] anIntArray199 = new int[16];

	@OriginalMember(owner = "client!h", name = "Ab", descriptor = "[I")
	public final int[] anIntArray203 = new int[16];

	@OriginalMember(owner = "client!h", name = "Db", descriptor = "[I")
	private final int[] anIntArray204 = new int[16];

	@OriginalMember(owner = "client!h", name = "V", descriptor = "Lclient!mb;")
	private final Class50 aClass50_1 = new Class50();

	@OriginalMember(owner = "client!h", name = "Kb", descriptor = "Lclient!ie;")
	private final Class2_Sub7_Sub2 aClass2_Sub7_Sub2_1 = new Class2_Sub7_Sub2(this);

	@OriginalMember(owner = "client!h", name = "G", descriptor = "Lclient!md;")
	private final Class51 aClass51_5 = new Class51(128);

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub1() {
		this.method1541();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
	private void method1520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1529(64, arg0, arg1);
		if ((this.anIntArray201[arg0] & 0x2) != 0) {
			for (@Pc(25) Class2_Sub14 local25 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2849(); local25 != null; local25 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2850()) {
				if (local25.anInt2992 == arg0 && local25.anInt2990 < 0) {
					this.aClass2_Sub14ArrayArray2[arg0][local25.anInt2991] = null;
					this.aClass2_Sub14ArrayArray2[arg0][arg1] = local25;
					@Pc(60) int local60 = (local25.anInt2989 * local25.anInt2993 >> 12) + local25.anInt3006;
					local25.anInt2989 = 4096;
					local25.anInt3006 += arg1 - local25.anInt2991 << 8;
					local25.anInt2993 = local60 - local25.anInt3006;
					local25.anInt2991 = arg1;
					return;
				}
			}
		}
		@Pc(106) Class2_Sub10 local106 = (Class2_Sub10) this.aClass51_5.method2458((long) this.anIntArray196[arg0]);
		if (local106 == null) {
			return;
		}
		@Pc(114) Class2_Sub16_Sub1 local114 = local106.aClass2_Sub16_Sub1Array1[arg1];
		if (local114 == null) {
			return;
		}
		@Pc(126) Class2_Sub14 local126 = new Class2_Sub14();
		local126.aClass2_Sub10_1 = local106;
		local126.aClass2_Sub16_Sub1_1 = local114;
		local126.anInt2992 = arg0;
		local126.aClass28_1 = local106.aClass28Array1[arg1];
		local126.anInt3000 = local106.aByteArray30[arg1];
		local126.anInt2991 = arg1;
		local126.anInt2997 = arg2 * arg2 * local106.anInt2339 * local106.aByteArray31[arg1] + 1024 >> 11;
		local126.anInt3005 = local106.aByteArray32[arg1] & 0xFF;
		local126.anInt3006 = (arg1 << 8) - (local106.aShortArray43[arg1] & 0x7FFF);
		local126.anInt3009 = 0;
		local126.anInt3003 = 0;
		local126.anInt3008 = 0;
		local126.anInt2990 = -1;
		local126.anInt2998 = 0;
		if (this.anIntArray193[arg0] == 0) {
			local126.aClass2_Sub7_Sub3_1 = Static205.method3244(local114, this.method1524(local126), this.method1542(local126), this.method1525(local126));
		} else {
			local126.aClass2_Sub7_Sub3_1 = Static205.method3244(local114, this.method1524(local126), 0, this.method1525(local126));
			this.method1546(local126, local106.aShortArray43[arg1] < 0);
		}
		if (local106.aShortArray43[arg1] < 0) {
			local126.aClass2_Sub7_Sub3_1.method3243(-1);
		}
		if (local126.anInt3000 >= 0) {
			@Pc(274) Class2_Sub14 local274 = this.aClass2_Sub14ArrayArray1[arg0][local126.anInt3000];
			if (local274 != null && local274.anInt2990 < 0) {
				this.aClass2_Sub14ArrayArray2[arg0][local274.anInt2991] = null;
				local274.anInt2990 = 0;
			}
			this.aClass2_Sub14ArrayArray1[arg0][local126.anInt3000] = local126;
		}
		this.aClass2_Sub7_Sub2_1.aClass67_4.method2843(local126);
		this.aClass2_Sub14ArrayArray2[arg0][arg1] = local126;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IBI)V")
	private void method1521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray194[arg1] = arg0;
		this.anIntArray203[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)Z")
	public synchronized boolean method1522() {
		return this.aClass50_1.method2443();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!lf;)I")
	private int method1524(@OriginalArg(1) Class2_Sub14 arg0) {
		@Pc(14) Class28 local14 = arg0.aClass28_1;
		@Pc(25) int local25 = arg0.anInt3006 + (arg0.anInt2989 * arg0.anInt2993 >> 12);
		local25 += this.anIntArray192[arg0.anInt2992] * (this.anIntArray202[arg0.anInt2992] - 8192) >> 12;
		@Pc(68) int local68;
		if (local14.anInt1794 > 0 && (local14.anInt1791 > 0 || this.anIntArray195[arg0.anInt2992] > 0)) {
			@Pc(63) int local63 = local14.anInt1792 << 1;
			local68 = local14.anInt1791 << 2;
			if (local63 > arg0.anInt2994) {
				local68 = arg0.anInt2994 * local68 / local63;
			}
			local68 += this.anIntArray195[arg0.anInt2992] >> 7;
			@Pc(98) double local98 = Math.sin((double) (arg0.anInt2999 & 0x1FF) * 0.01227184630308513D);
			local25 += (int) ((double) local68 * local98);
		}
		local68 = (int) ((double) (arg0.aClass2_Sub16_Sub1_1.anInt3446 * 256) * Math.pow(2.0D, (double) local25 * 3.255208333333333E-4D) / (double) Static98.anInt2858 + 0.5D);
		return local68 >= 1 ? local68 : 1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLclient!lf;)I")
	private int method1525(@OriginalArg(1) Class2_Sub14 arg0) {
		@Pc(17) int local17 = this.anIntArray190[arg0.anInt2992];
		return local17 < 8192 ? arg0.anInt3005 * local17 + 32 >> 6 : 16384 - ((16384 - local17) * (-arg0.anInt3005 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!lf;B)Z")
	public boolean method1526(@OriginalArg(0) Class2_Sub14 arg0) {
		if (arg0.aClass2_Sub7_Sub3_1 != null) {
			return false;
		}
		if (arg0.anInt2990 >= 0) {
			arg0.method3556();
			if (arg0.anInt3000 > 0 && this.aClass2_Sub14ArrayArray1[arg0.anInt2992][arg0.anInt3000] == arg0) {
				this.aClass2_Sub14ArrayArray1[arg0.anInt2992][arg0.anInt3000] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IZII)V")
	private void method1527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	public synchronized void method1528() {
		for (@Pc(15) Class2_Sub10 local15 = (Class2_Sub10) this.aClass51_5.method2465(); local15 != null; local15 = (Class2_Sub10) this.aClass51_5.method2462()) {
			local15.method3556();
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIII)V")
	private void method1529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub14 local13 = this.aClass2_Sub14ArrayArray2[arg1][arg2];
		if (local13 == null) {
			return;
		}
		this.aClass2_Sub14ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray201[arg1] & 0x2) == 0) {
			local13.anInt2990 = 0;
			return;
		}
		for (@Pc(48) Class2_Sub14 local48 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2848(); local48 != null; local48 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2851()) {
			if (local13.anInt2992 == local48.anInt2992 && local48.anInt2990 < 0 && local13 != local48) {
				local13.anInt2990 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3309(@OriginalArg(0) int arg0) {
		if (this.aClass50_1.method2443()) {
			@Pc(14) int local14 = this.aClass50_1.anInt3097 * this.anInt2038 / Static98.anInt2858;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong64;
				if (this.aLong65 - local23 >= 0L) {
					this.aLong64 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong65 - this.aLong64 - 1L) / (long) local14);
				arg0 -= local54;
				this.aLong64 += (long) local54 * (long) local14;
				this.aClass2_Sub7_Sub2_1.method3309(local54);
				this.method1532();
			} while (this.aClass50_1.method2443());
		}
		this.aClass2_Sub7_Sub2_1.method3309(arg0);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
	private void method1530(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1530(local9);
			}
			return;
		}
		this.anIntArray191[arg0] = 12800;
		this.anIntArray190[arg0] = 8192;
		this.anIntArray200[arg0] = 16383;
		this.anIntArray202[arg0] = 8192;
		this.anIntArray195[arg0] = 0;
		this.anIntArray199[arg0] = 8192;
		this.method1537(arg0);
		this.method1551(arg0);
		this.anIntArray201[arg0] = 0;
		this.anIntArray197[arg0] = 32767;
		this.anIntArray192[arg0] = 256;
		this.anIntArray193[arg0] = 0;
		this.method1521(8192, arg0);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(II)V")
	private void method1531(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(28) int local28;
		@Pc(22) int local22;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			local28 = arg0 >> 8 & 0x7F;
			this.method1529(local22, local16, local28);
		} else if (local9 == 144) {
			local22 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			if (local22 <= 0) {
				this.method1529(64, local16, local28);
			} else {
				this.method1520(local16, local28, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 >> 16 & 0x7F;
			this.method1527(local16, local22, local28);
		} else if (local9 == 176) {
			local28 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			if (local28 == 0) {
				this.anIntArray204[local16] = (this.anIntArray204[local16] & 0xFFE03FFF) + (local22 << 14);
			}
			if (local28 == 32) {
				this.anIntArray204[local16] = (this.anIntArray204[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 1) {
				this.anIntArray195[local16] = (local22 << 7) + (this.anIntArray195[local16] & 0xFFFFC07F);
			}
			if (local28 == 33) {
				this.anIntArray195[local16] = local22 + (this.anIntArray195[local16] & 0xFFFFFF80);
			}
			if (local28 == 5) {
				this.anIntArray199[local16] = (this.anIntArray199[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 37) {
				this.anIntArray199[local16] = (this.anIntArray199[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 7) {
				this.anIntArray191[local16] = (local22 << 7) + (this.anIntArray191[local16] & 0xFFFFC07F);
			}
			if (local28 == 39) {
				this.anIntArray191[local16] = (this.anIntArray191[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 10) {
				this.anIntArray190[local16] = (this.anIntArray190[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 42) {
				this.anIntArray190[local16] = (this.anIntArray190[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 11) {
				this.anIntArray200[local16] = (local22 << 7) + (this.anIntArray200[local16] & 0xFFFFC07F);
			}
			if (local28 == 43) {
				this.anIntArray200[local16] = (this.anIntArray200[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 64) {
				if (local22 >= 64) {
					this.anIntArray201[local16] |= 0x1;
				} else {
					this.anIntArray201[local16] &= 0xFFFFFFFE;
				}
			}
			if (local28 == 65) {
				if (local22 >= 64) {
					this.anIntArray201[local16] |= 0x2;
				} else {
					this.method1537(local16);
					this.anIntArray201[local16] &= 0xFFFFFFFD;
				}
			}
			if (local28 == 99) {
				this.anIntArray197[local16] = (this.anIntArray197[local16] & 0x7F) + (local22 << 7);
			}
			if (local28 == 98) {
				this.anIntArray197[local16] = local22 + (this.anIntArray197[local16] & 0x3F80);
			}
			if (local28 == 101) {
				this.anIntArray197[local16] = (local22 << 7) + (this.anIntArray197[local16] & 0x7F) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray197[local16] = local22 + (this.anIntArray197[local16] & 0x3F80) + 16384;
			}
			if (local28 == 120) {
				this.method1544(local16);
			}
			if (local28 == 121) {
				this.method1530(local16);
			}
			if (local28 == 123) {
				this.method1540(local16);
			}
			@Pc(510) int local510;
			if (local28 == 6) {
				local510 = this.anIntArray197[local16];
				if (local510 == 16384) {
					this.anIntArray192[local16] = (this.anIntArray192[local16] & 0xFFFFC07F) + (local22 << 7);
				}
			}
			if (local28 == 38) {
				local510 = this.anIntArray197[local16];
				if (local510 == 16384) {
					this.anIntArray192[local16] = (this.anIntArray192[local16] & 0xFFFFFF80) + local22;
				}
			}
			if (local28 == 16) {
				this.anIntArray193[local16] = (local22 << 7) + (this.anIntArray193[local16] & 0xFFFFC07F);
			}
			if (local28 == 48) {
				this.anIntArray193[local16] = local22 + (this.anIntArray193[local16] & 0xFFFFFF80);
			}
			if (local28 == 81) {
				if (local22 >= 64) {
					this.anIntArray201[local16] |= 0x4;
				} else {
					this.method1551(local16);
					this.anIntArray201[local16] &= 0xFFFFFFFB;
				}
			}
			if (local28 == 17) {
				this.method1521((this.anIntArray194[local16] & 0xFFFFC07F) + (local22 << 7), local16);
			}
			if (local28 == 49) {
				this.method1521((this.anIntArray194[local16] & 0xFFFFFF80) + local22, local16);
			}
		} else if (local9 == 192) {
			local28 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			this.method1539(local28 + this.anIntArray204[local16], local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method1552(local28, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local28 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1534(local28, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1541();
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	private void method1532() {
		@Pc(8) int local8 = this.anInt2064;
		@Pc(15) long local15 = this.aLong65;
		@Pc(18) int local18 = this.anInt2063;
		while (local18 == this.anInt2063) {
			while (this.aClass50_1.anIntArray353[local8] == local18) {
				this.aClass50_1.method2430(local8);
				@Pc(29) int local29 = this.aClass50_1.method2436(local8);
				if (local29 == 1) {
					this.aClass50_1.method2441();
					this.aClass50_1.method2440(local8);
					if (this.aClass50_1.method2433()) {
						if (!this.aBoolean86 || local18 == 0) {
							this.method1541();
							this.aClass50_1.method2431();
							return;
						}
						this.aClass50_1.method2434(local15);
					}
					break;
				}
				if ((local29 & 0x80) != 0) {
					this.method1531(local29);
				}
				this.aClass50_1.method2444(local8);
				this.aClass50_1.method2440(local8);
			}
			local8 = this.aClass50_1.method2437();
			local18 = this.aClass50_1.anIntArray353[local8];
			local15 = this.aClass50_1.method2442(local18);
		}
		this.anInt2064 = local8;
		this.aLong65 = local15;
		this.anInt2063 = local18;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public synchronized void method1533() {
		this.aClass50_1.method2431();
		this.method1541();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IBI)V")
	private void method1534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray202[arg1] = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3312(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass50_1.method2443()) {
			@Pc(18) int local18 = this.aClass50_1.anInt3097 * this.anInt2038 / Static98.anInt2858;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong64;
				if (this.aLong65 - local27 >= 0L) {
					this.aLong64 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong65 - this.aLong64 - 1L) / (long) local18);
				this.aLong64 += (long) local58 * (long) local18;
				this.aClass2_Sub7_Sub2_1.method3312(arg0, arg1, local58);
				arg2 -= local58;
				this.method1532();
				arg1 += local58;
			} while (this.aClass50_1.method2443());
		}
		this.aClass2_Sub7_Sub2_1.method3312(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public synchronized void method1535() {
		for (@Pc(7) Class2_Sub10 local7 = (Class2_Sub10) this.aClass51_5.method2465(); local7 != null; local7 = (Class2_Sub10) this.aClass51_5.method2462()) {
			local7.method1863();
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()Lclient!sg;")
	@Override
	public synchronized Class2_Sub7 method3313() {
		return this.aClass2_Sub7_Sub2_1;
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)I")
	public int method1536() {
		return this.anInt2052;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(II)V")
	private void method1537(@OriginalArg(1) int arg0) {
		if ((this.anIntArray201[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(25) Class2_Sub14 local25 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2848(); local25 != null; local25 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2851()) {
			if (local25.anInt2992 == arg0 && this.aClass2_Sub14ArrayArray2[arg0][local25.anInt2991] == null && local25.anInt2990 < 0) {
				local25.anInt2990 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!lf;I[II)Z")
	public boolean method1538(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub14 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt2995 = Static98.anInt2858 / 100;
		if (arg1.anInt2990 >= 0 && (arg1.aClass2_Sub7_Sub3_1 == null || arg1.aClass2_Sub7_Sub3_1.method3242())) {
			arg1.method2369();
			arg1.method3556();
			if (arg1.anInt3000 > 0 && this.aClass2_Sub14ArrayArray1[arg1.anInt2992][arg1.anInt3000] == arg1) {
				this.aClass2_Sub14ArrayArray1[arg1.anInt2992][arg1.anInt3000] = null;
			}
			return true;
		}
		@Pc(61) int local61 = arg1.anInt2989;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray199[arg1.anInt2992] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg1.anInt2989 = local61;
		}
		arg1.aClass2_Sub7_Sub3_1.method3256(this.method1524(arg1));
		arg1.anInt2994++;
		@Pc(106) boolean local106 = false;
		@Pc(109) Class28 local109 = arg1.aClass28_1;
		arg1.anInt2999 += local109.anInt1794;
		@Pc(135) double local135 = (double) ((arg1.anInt2991 - 60 << 8) + (arg1.anInt2993 * arg1.anInt2989 >> 12)) * 5.086263020833333E-6D;
		if (local109.anInt1785 > 0) {
			if (local109.anInt1789 > 0) {
				arg1.anInt3003 += (int) (Math.pow(2.0D, (double) local109.anInt1789 * local135) * 128.0D + 0.5D);
			} else {
				arg1.anInt3003 += 128;
			}
			if (arg1.anInt3003 * local109.anInt1785 >= 819200) {
				local106 = true;
			}
		}
		if (local109.aByteArray20 != null) {
			if (local109.anInt1796 > 0) {
				arg1.anInt3009 += (int) (Math.pow(2.0D, (double) local109.anInt1796 * local135) * 128.0D + 0.5D);
			} else {
				arg1.anInt3009 += 128;
			}
			while (arg1.anInt2998 < local109.aByteArray20.length - 2 && arg1.anInt3009 > (local109.aByteArray20[arg1.anInt2998 + 2] & 0xFF) << 8) {
				arg1.anInt2998 += 2;
			}
			if (arg1.anInt2998 == local109.aByteArray20.length - 2 && local109.aByteArray20[arg1.anInt2998 + 1] == 0) {
				local106 = true;
			}
		}
		if (arg1.anInt2990 >= 0 && local109.aByteArray21 != null && (this.anIntArray201[arg1.anInt2992] & 0x1) == 0 && (arg1.anInt3000 < 0 || arg1 != this.aClass2_Sub14ArrayArray1[arg1.anInt2992][arg1.anInt3000])) {
			if (local109.anInt1787 <= 0) {
				arg1.anInt2990 += 128;
			} else {
				arg1.anInt2990 += (int) (Math.pow(2.0D, local135 * (double) local109.anInt1787) * 128.0D + 0.5D);
			}
			while (local109.aByteArray21.length - 2 > arg1.anInt3008 && arg1.anInt2990 > (local109.aByteArray21[arg1.anInt3008 + 2] & 0xFF) << 8) {
				arg1.anInt3008 += 2;
			}
			if (arg1.anInt3008 == local109.aByteArray21.length - 2) {
				local106 = true;
			}
		}
		if (!local106) {
			arg1.aClass2_Sub7_Sub3_1.method3232(arg1.anInt2995, this.method1542(arg1), this.method1525(arg1));
			return false;
		}
		arg1.aClass2_Sub7_Sub3_1.method3254(arg1.anInt2995);
		if (arg2 == null) {
			arg1.aClass2_Sub7_Sub3_1.method3309(arg3);
		} else {
			arg1.aClass2_Sub7_Sub3_1.method3312(arg2, arg0, arg3);
		}
		if (arg1.aClass2_Sub7_Sub3_1.method3251()) {
			this.aClass2_Sub7_Sub2_1.aClass2_Sub7_Sub4_1.method3322(arg1.aClass2_Sub7_Sub3_1);
		}
		arg1.method2369();
		if (arg1.anInt2990 >= 0) {
			arg1.method3556();
			if (arg1.anInt3000 > 0 && this.aClass2_Sub14ArrayArray1[arg1.anInt2992][arg1.anInt3000] == arg1) {
				this.aClass2_Sub14ArrayArray1[arg1.anInt2992][arg1.anInt3000] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(III)V")
	private void method1539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray196[arg1] != arg0) {
			this.anIntArray196[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass2_Sub14ArrayArray1[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IB)V")
	private void method1540(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class2_Sub14 local18 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2848(); local18 != null; local18 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2851()) {
			if ((arg0 < 0 || arg0 == local18.anInt2992) && local18.anInt2990 < 0) {
				this.aClass2_Sub14ArrayArray2[local18.anInt2992][local18.anInt2991] = null;
				local18.anInt2990 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V")
	private void method1541() {
		this.method1544(-1);
		this.method1530(-1);
		for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
			this.anIntArray196[local11] = this.anIntArray198[local11];
		}
		for (@Pc(37) int local37 = 0; local37 < 16; local37++) {
			this.anIntArray204[local37] = this.anIntArray198[local37] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!lf;)I")
	private int method1542(@OriginalArg(1) Class2_Sub14 arg0) {
		@Pc(2) Class28 local2 = arg0.aClass28_1;
		@Pc(18) int local18 = this.anIntArray191[arg0.anInt2992] * this.anIntArray200[arg0.anInt2992] + 4096 >> 13;
		@Pc(26) int local26 = local18 * local18 + 16384 >> 15;
		@Pc(35) int local35 = local26 * arg0.anInt2997 + 16384 >> 15;
		local18 = this.anInt2052 * local35 + 128 >> 8;
		if (local2.anInt1785 > 0) {
			local18 = (int) ((double) local18 * Math.pow(0.5D, (double) arg0.anInt3003 * 1.953125E-5D * (double) local2.anInt1785) + 0.5D);
		}
		@Pc(84) int local84;
		@Pc(92) int local92;
		@Pc(114) int local114;
		@Pc(126) int local126;
		if (local2.aByteArray20 != null) {
			local84 = arg0.anInt3009;
			local92 = local2.aByteArray20[arg0.anInt2998 + 1];
			if (local2.aByteArray20.length - 2 > arg0.anInt2998) {
				local114 = (local2.aByteArray20[arg0.anInt2998] & 0xFF) << 8;
				local126 = (local2.aByteArray20[arg0.anInt2998 + 2] & 0xFF) << 8;
				local92 += (local2.aByteArray20[arg0.anInt2998 + 3] - local92) * (local84 - local114) / (local126 - local114);
			}
			local18 = local18 * local92 + 32 >> 6;
		}
		if (arg0.anInt2990 > 0 && local2.aByteArray21 != null) {
			local84 = arg0.anInt2990;
			local92 = local2.aByteArray21[arg0.anInt3008 + 1];
			if (local2.aByteArray21.length - 2 > arg0.anInt3008) {
				local114 = (local2.aByteArray21[arg0.anInt3008] & 0xFF) << 8;
				local126 = (local2.aByteArray21[arg0.anInt3008 + 2] & 0xFF) << 8;
				local92 += (local2.aByteArray21[arg0.anInt3008 + 3] - local92) * (local84 - local114) / (local126 - local114);
			}
			local18 = local18 * local92 + 32 >> 6;
		}
		return local18;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)V")
	public synchronized void method1543() {
		this.method1547();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
	@Override
	public synchronized int method3311() {
		return 0;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IB)V")
	private void method1544(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class2_Sub14 local16 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2848(); local16 != null; local16 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2851()) {
			if (arg0 < 0 || local16.anInt2992 == arg0) {
				if (local16.aClass2_Sub7_Sub3_1 != null) {
					local16.aClass2_Sub7_Sub3_1.method3254(Static98.anInt2858 / 100);
					if (local16.aClass2_Sub7_Sub3_1.method3251()) {
						this.aClass2_Sub7_Sub2_1.aClass2_Sub7_Sub4_1.method3322(local16.aClass2_Sub7_Sub3_1);
					}
					local16.method2369();
				}
				if (local16.anInt2990 < 0) {
					this.aClass2_Sub14ArrayArray2[local16.anInt2992][local16.anInt2991] = null;
				}
				local16.method3556();
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ui;Lclient!oe;ZILclient!pe;)Z")
	public synchronized boolean method1545(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(4) Class13 arg2) {
		arg0.method3405();
		@Pc(5) boolean local5 = true;
		@Pc(19) int[] local19 = new int[] { 22050 };
		for (@Pc(25) Class2_Sub5 local25 = (Class2_Sub5) arg0.aClass51_15.method2465(); local25 != null; local25 = (Class2_Sub5) arg0.aClass51_15.method2462()) {
			@Pc(31) int local31 = (int) local25.aLong151;
			@Pc(39) Class2_Sub10 local39 = (Class2_Sub10) this.aClass51_5.method2458((long) local31);
			if (local39 == null) {
				local39 = Static50.method1150(arg2, local31);
				if (local39 == null) {
					local5 = false;
					continue;
				}
				this.aClass51_5.method2463(local39, (long) local31);
			}
			if (!local39.method1865(local25.aByteArray17, arg1, local19)) {
				local5 = false;
			}
		}
		if (local5) {
			arg0.method3406();
		}
		return local5;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!lf;Z)V")
	public void method1546(@OriginalArg(1) Class2_Sub14 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) int local4 = arg0.aClass2_Sub16_Sub1_1.aByteArray38.length;
		@Pc(40) int local40;
		if (arg1 && arg0.aClass2_Sub16_Sub1_1.aBoolean128) {
			@Pc(27) int local27 = local4 + local4 - arg0.aClass2_Sub16_Sub1_1.anInt3445;
			local40 = (int) ((long) local27 * (long) this.anIntArray193[arg0.anInt2992] >> 6);
			local4 <<= 0x8;
			if (local4 <= local40) {
				local40 = local4 + local4 - local40 - 1;
				arg0.aClass2_Sub7_Sub3_1.method3257();
			}
		} else {
			local40 = (int) ((long) local4 * (long) this.anIntArray193[arg0.anInt2992] >> 6);
		}
		arg0.aClass2_Sub7_Sub3_1.method3237(local40);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)V")
	private void method1547() {
		this.anIntArray198[9] = 128;
		this.anIntArray204[9] = 128;
		this.method1539(128, 9);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ui;ZB)V")
	public synchronized void method1549(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) boolean arg1) {
		this.method1533();
		this.aClass50_1.method2435(arg0.aByteArray48);
		this.aLong64 = 0L;
		this.aBoolean86 = arg1;
		@Pc(23) int local23 = this.aClass50_1.method2439();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass50_1.method2430(local25);
			this.aClass50_1.method2444(local25);
			this.aClass50_1.method2440(local25);
		}
		this.anInt2064 = this.aClass50_1.method2437();
		this.anInt2063 = this.aClass50_1.anIntArray353[this.anInt2064];
		this.aLong65 = this.aClass50_1.method2442(this.anInt2063);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()Lclient!sg;")
	@Override
	public synchronized Class2_Sub7 method3314() {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(II)V")
	public synchronized void method1550(@OriginalArg(1) int arg0) {
		this.anInt2052 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(IB)V")
	private void method1551(@OriginalArg(0) int arg0) {
		if ((this.anIntArray201[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(27) Class2_Sub14 local27 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2848(); local27 != null; local27 = (Class2_Sub14) this.aClass2_Sub7_Sub2_1.aClass67_4.method2851()) {
			if (local27.anInt2992 == arg0) {
				local27.anInt3007 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(III)V")
	private void method1552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
