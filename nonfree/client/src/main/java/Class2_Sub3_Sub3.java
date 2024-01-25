import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!eo", name = "Lb", descriptor = "I")
	private int anInt1704;

	@OriginalMember(owner = "client!eo", name = "Mb", descriptor = "I")
	private int anInt1705;

	@OriginalMember(owner = "client!eo", name = "Nb", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!eo", name = "Ob", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!eo", name = "Pb", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!eo", name = "Sb", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!eo", name = "Tb", descriptor = "I")
	private int anInt1707;

	@OriginalMember(owner = "client!eo", name = "Ub", descriptor = "Lclient!ic;")
	private Class2_Sub21 aClass2_Sub21_1;

	@OriginalMember(owner = "client!eo", name = "ab", descriptor = "[I")
	private final int[] anIntArray174 = new int[16];

	@OriginalMember(owner = "client!eo", name = "T", descriptor = "[I")
	private final int[] anIntArray171 = new int[16];

	@OriginalMember(owner = "client!eo", name = "I", descriptor = "[[Lclient!ge;")
	private final Class2_Sub18[][] aClass2_Sub18ArrayArray2 = new Class2_Sub18[16][128];

	@OriginalMember(owner = "client!eo", name = "kb", descriptor = "[I")
	private final int[] anIntArray176 = new int[16];

	@OriginalMember(owner = "client!eo", name = "H", descriptor = "[[Lclient!ge;")
	private final Class2_Sub18[][] aClass2_Sub18ArrayArray1 = new Class2_Sub18[16][128];

	@OriginalMember(owner = "client!eo", name = "J", descriptor = "[I")
	private final int[] anIntArray168 = new int[16];

	@OriginalMember(owner = "client!eo", name = "yb", descriptor = "I")
	private int anInt1696 = 256;

	@OriginalMember(owner = "client!eo", name = "vb", descriptor = "[I")
	private final int[] anIntArray179 = new int[16];

	@OriginalMember(owner = "client!eo", name = "X", descriptor = "[I")
	private final int[] anIntArray173 = new int[16];

	@OriginalMember(owner = "client!eo", name = "ob", descriptor = "[I")
	private final int[] anIntArray178 = new int[16];

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "[I")
	private final int[] anIntArray167 = new int[16];

	@OriginalMember(owner = "client!eo", name = "db", descriptor = "[I")
	public final int[] anIntArray175 = new int[16];

	@OriginalMember(owner = "client!eo", name = "mb", descriptor = "[I")
	public final int[] anIntArray177 = new int[16];

	@OriginalMember(owner = "client!eo", name = "U", descriptor = "[I")
	private final int[] anIntArray172 = new int[16];

	@OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
	private final int anInt1673 = 1000000;

	@OriginalMember(owner = "client!eo", name = "Fb", descriptor = "[I")
	private final int[] anIntArray180 = new int[16];

	@OriginalMember(owner = "client!eo", name = "Hb", descriptor = "[I")
	private final int[] anIntArray181 = new int[16];

	@OriginalMember(owner = "client!eo", name = "S", descriptor = "[I")
	public final int[] anIntArray170 = new int[16];

	@OriginalMember(owner = "client!eo", name = "Ib", descriptor = "[I")
	private final int[] anIntArray182 = new int[16];

	@OriginalMember(owner = "client!eo", name = "M", descriptor = "[I")
	private final int[] anIntArray169 = new int[16];

	@OriginalMember(owner = "client!eo", name = "eb", descriptor = "Lclient!eb;")
	private final Class48 aClass48_1 = new Class48();

	@OriginalMember(owner = "client!eo", name = "Rb", descriptor = "Lclient!pr;")
	private final Class2_Sub3_Sub4 aClass2_Sub3_Sub4_1 = new Class2_Sub3_Sub4(this);

	@OriginalMember(owner = "client!eo", name = "R", descriptor = "Lclient!va;")
	private final Class199 aClass199_8 = new Class199(128);

	static {
		new Class93("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub3() {
		this.method1756();
		this.method1770(true);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BII)V")
	private void method1747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray180[arg1] = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V")
	private void method1748() {
		@Pc(8) int local8 = this.anInt1705;
		@Pc(11) int local11 = this.anInt1704;
		@Pc(20) long local20 = this.aLong50;
		if (this.aClass2_Sub21_1 != null && local11 == this.anInt1707) {
			this.method1760(this.aBoolean154, this.aBoolean153, this.aClass2_Sub21_1);
			this.method1748();
			return;
		}
		while (this.anInt1704 == local11) {
			while (this.aClass48_1.anIntArray150[local8] == local11) {
				this.aClass48_1.method1513(local8);
				@Pc(49) int local49 = this.aClass48_1.method1505(local8);
				if (local49 == 1) {
					this.aClass48_1.method1518();
					this.aClass48_1.method1519(local8);
					if (this.aClass48_1.method1516()) {
						if (this.aClass2_Sub21_1 != null) {
							this.method1772(this.aClass2_Sub21_1, this.aBoolean153);
							this.method1748();
							return;
						}
						if (!this.aBoolean153 || local11 == 0) {
							this.method1770(true);
							this.aClass48_1.method1512();
							return;
						}
						this.aClass48_1.method1514(local20);
					}
					break;
				}
				if ((local49 & 0x80) != 0) {
					this.method1785(local49);
				}
				this.aClass48_1.method1517(local8);
				this.aClass48_1.method1519(local8);
			}
			local8 = this.aClass48_1.method1504();
			local11 = this.aClass48_1.anIntArray150[local8];
			local20 = this.aClass48_1.method1515(local11);
		}
		this.aLong50 = local20;
		this.anInt1704 = local11;
		this.anInt1705 = local8;
		if (this.aClass2_Sub21_1 != null && this.anInt1707 < local11) {
			this.anInt1704 = this.anInt1707;
			this.anInt1705 = -1;
			this.aLong50 = this.aClass48_1.method1515(this.anInt1704);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V")
	private void method1749(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class2_Sub18 local18 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method5992(); local18 != null; local18 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method6000()) {
			if ((arg0 < 0 || arg0 == local18.anInt2286) && local18.anInt2283 < 0) {
				this.aClass2_Sub18ArrayArray1[local18.anInt2286][local18.anInt2292] = null;
				local18.anInt2283 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)V")
	public synchronized void method1751(@OriginalArg(0) int arg0) {
		this.anInt1696 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
	public synchronized void method1752() {
		this.method1766(true);
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(II)V")
	private void method1753(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class2_Sub18 local8 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method5992(); local8 != null; local8 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method6000()) {
			if (arg0 < 0 || local8.anInt2286 == arg0) {
				if (local8.aClass2_Sub3_Sub2_3 != null) {
					local8.aClass2_Sub3_Sub2_3.method1711(Static65.anInt1429 / 100);
					if (local8.aClass2_Sub3_Sub2_3.method1701()) {
						this.aClass2_Sub3_Sub4_1.aClass2_Sub3_Sub1_1.method367(local8.aClass2_Sub3_Sub2_3);
					}
					local8.method2252();
				}
				if (local8.anInt2283 < 0) {
					this.aClass2_Sub18ArrayArray1[local8.anInt2286][local8.anInt2292] = null;
				}
				local8.method5945();
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIII)V")
	private void method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	private void method1755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray181[arg0] = arg1;
		this.anIntArray170[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(III)V")
	private synchronized void method1756() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray182[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZII)V")
	private void method1757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray167[arg0]) {
			this.anIntArray167[arg0] = arg1;
			for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
				this.aClass2_Sub18ArrayArray2[arg0][local20] = null;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(BII)V")
	public synchronized void method1758() {
		this.method1782();
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(II)V")
	private void method1759(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1759(local9);
			}
			return;
		}
		this.anIntArray179[arg0] = 12800;
		this.anIntArray173[arg0] = 8192;
		this.anIntArray178[arg0] = 16383;
		this.anIntArray180[arg0] = 8192;
		this.anIntArray169[arg0] = 0;
		this.anIntArray172[arg0] = 8192;
		this.method1774(arg0);
		this.method1771(arg0);
		this.anIntArray177[arg0] = 0;
		this.anIntArray176[arg0] = 32767;
		this.anIntArray168[arg0] = 256;
		this.anIntArray175[arg0] = 0;
		this.method1755(arg0, 8192);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZBZLclient!ic;)V")
	private synchronized void method1760(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub21 arg2) {
		this.method1766(arg0);
		this.aClass48_1.method1506(arg2.aByteArray42);
		this.aBoolean153 = arg1;
		this.aLong51 = 0L;
		@Pc(24) int local24 = this.aClass48_1.method1508();
		for (@Pc(30) int local30 = 0; local30 < local24; local30++) {
			this.aClass48_1.method1513(local30);
			this.aClass48_1.method1517(local30);
			this.aClass48_1.method1519(local30);
		}
		this.anInt1705 = this.aClass48_1.method1504();
		this.anInt1704 = this.aClass48_1.anIntArray150[this.anInt1705];
		this.aLong50 = this.aClass48_1.method1515(this.anInt1704);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(IIII)V")
	private void method1761(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub18 local12 = this.aClass2_Sub18ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub18ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray177[arg0] & 0x2) == 0) {
			local12.anInt2283 = 0;
			return;
		}
		for (@Pc(37) Class2_Sub18 local37 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method5992(); local37 != null; local37 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method6000()) {
			if (local12.anInt2286 == local37.anInt2286 && local37.anInt2283 < 0 && local37 != local12) {
				local12.anInt2283 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!ge;I[I)Z")
	public boolean method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub18 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt2279 = Static65.anInt1429 / 100;
		if (arg2.anInt2283 >= 0 && (arg2.aClass2_Sub3_Sub2_3 == null || arg2.aClass2_Sub3_Sub2_3.method1708())) {
			arg2.method2252();
			arg2.method5945();
			if (arg2.anInt2285 > 0 && this.aClass2_Sub18ArrayArray2[arg2.anInt2286][arg2.anInt2285] == arg2) {
				this.aClass2_Sub18ArrayArray2[arg2.anInt2286][arg2.anInt2285] = null;
			}
			return true;
		}
		@Pc(64) int local64 = arg2.anInt2281;
		if (local64 > 0) {
			local64 -= (int) (Math.pow(2.0D, (double) this.anIntArray172[arg2.anInt2286] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local64 < 0) {
				local64 = 0;
			}
			arg2.anInt2281 = local64;
		}
		arg2.aClass2_Sub3_Sub2_3.method1712(this.method1777(arg2));
		@Pc(104) Class209 local104 = arg2.aClass209_1;
		@Pc(106) boolean local106 = false;
		arg2.anInt2293 += local104.anInt6877;
		arg2.anInt2290++;
		@Pc(137) double local137 = (double) ((arg2.anInt2281 * arg2.anInt2284 >> 12) + (arg2.anInt2292 - 60 << 8)) * 5.086263020833333E-6D;
		if (local104.anInt6868 > 0) {
			if (local104.anInt6871 > 0) {
				arg2.anInt2294 += (int) (Math.pow(2.0D, local137 * (double) local104.anInt6871) * 128.0D + 0.5D);
			} else {
				arg2.anInt2294 += 128;
			}
			if (arg2.anInt2294 * local104.anInt6868 >= 819200) {
				local106 = true;
			}
		}
		if (local104.aByteArray92 != null) {
			if (local104.anInt6870 <= 0) {
				arg2.anInt2287 += 128;
			} else {
				arg2.anInt2287 += (int) (Math.pow(2.0D, local137 * (double) local104.anInt6870) * 128.0D + 0.5D);
			}
			while (arg2.anInt2296 < local104.aByteArray92.length - 2 && (local104.aByteArray92[arg2.anInt2296 + 2] & 0xFF) << 8 < arg2.anInt2287) {
				arg2.anInt2296 += 2;
			}
			if (local104.aByteArray92.length - 2 == arg2.anInt2296 && local104.aByteArray92[arg2.anInt2296 + 1] == 0) {
				local106 = true;
			}
		}
		if (arg2.anInt2283 >= 0 && local104.aByteArray93 != null && (this.anIntArray177[arg2.anInt2286] & 0x1) == 0 && (arg2.anInt2285 < 0 || this.aClass2_Sub18ArrayArray2[arg2.anInt2286][arg2.anInt2285] != arg2)) {
			if (local104.anInt6874 > 0) {
				arg2.anInt2283 += (int) (Math.pow(2.0D, local137 * (double) local104.anInt6874) * 128.0D + 0.5D);
			} else {
				arg2.anInt2283 += 128;
			}
			while (arg2.anInt2297 < local104.aByteArray93.length - 2 && arg2.anInt2283 > (local104.aByteArray93[arg2.anInt2297 + 2] & 0xFF) << 8) {
				arg2.anInt2297 += 2;
			}
			if (local104.aByteArray93.length - 2 == arg2.anInt2297) {
				local106 = true;
			}
		}
		if (!local106) {
			arg2.aClass2_Sub3_Sub2_3.method1723(arg2.anInt2279, this.method1783(arg2), this.method1781(arg2));
			return false;
		}
		arg2.aClass2_Sub3_Sub2_3.method1711(arg2.anInt2279);
		if (arg3 == null) {
			arg2.aClass2_Sub3_Sub2_3.method4473(arg0);
		} else {
			arg2.aClass2_Sub3_Sub2_3.method4479(arg3, arg1, arg0);
		}
		if (arg2.aClass2_Sub3_Sub2_3.method1701()) {
			this.aClass2_Sub3_Sub4_1.aClass2_Sub3_Sub1_1.method367(arg2.aClass2_Sub3_Sub2_3);
		}
		arg2.method2252();
		if (arg2.anInt2283 >= 0) {
			arg2.method5945();
			if (arg2.anInt2285 > 0 && arg2 == this.aClass2_Sub18ArrayArray2[arg2.anInt2286][arg2.anInt2285]) {
				this.aClass2_Sub18ArrayArray2[arg2.anInt2286][arg2.anInt2285] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)Z")
	public synchronized boolean method1763() {
		return this.aClass48_1.method1507();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZB)V")
	private synchronized void method1766(@OriginalArg(0) boolean arg0) {
		this.aClass48_1.method1512();
		this.aClass2_Sub21_1 = null;
		this.method1770(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4473(@OriginalArg(0) int arg0) {
		if (this.aClass48_1.method1507()) {
			@Pc(14) int local14 = this.anInt1673 * this.aClass48_1.anInt1443 / Static65.anInt1429;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg0 + this.aLong51;
				if (this.aLong50 - local23 >= 0L) {
					this.aLong51 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong50 - this.aLong51 - 1L) / (long) local14);
				this.aLong51 += (long) local14 * (long) local52;
				this.aClass2_Sub3_Sub4_1.method4473(local52);
				arg0 -= local52;
				this.method1748();
			} while (this.aClass48_1.method1507());
		}
		this.aClass2_Sub3_Sub4_1.method4473(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!ge;BZ)V")
	public void method1767(@OriginalArg(0) Class2_Sub18 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass2_Sub12_Sub1_1.aByteArray90.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass2_Sub12_Sub1_1.aBoolean592) {
			@Pc(38) int local38 = local8 + local8 - arg0.aClass2_Sub12_Sub1_1.anInt6729;
			local27 = (int) ((long) local38 * (long) this.anIntArray175[arg0.anInt2286] >> 6);
			local8 <<= 0x8;
			if (local8 <= local27) {
				local27 = local8 + local8 - local27 - 1;
				arg0.aClass2_Sub3_Sub2_3.method1705();
			}
		} else {
			local27 = (int) ((long) local8 * (long) this.anIntArray175[arg0.anInt2286] >> 6);
		}
		arg0.aClass2_Sub3_Sub2_3.method1700(local27);
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(III)V")
	private void method1769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "()Lclient!j;")
	@Override
	public synchronized Class2_Sub3 method4476() {
		return null;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V")
	private void method1770(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1753(-1);
		} else {
			this.method1749(-1);
		}
		this.method1759(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray167[local23] = this.anIntArray171[local23];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray174[local47] = this.anIntArray171[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(BI)V")
	private void method1771(@OriginalArg(1) int arg0) {
		if ((this.anIntArray177[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class2_Sub18 local15 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method5992(); local15 != null; local15 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method6000()) {
			if (local15.anInt2286 == arg0) {
				local15.anInt2288 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!ic;BZ)V")
	public synchronized void method1772(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(2) boolean arg1) {
		this.method1760(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)I")
	public int method1773() {
		return this.anInt1696;
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(II)V")
	private void method1774(@OriginalArg(0) int arg0) {
		if ((this.anIntArray177[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class2_Sub18 local15 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method5992(); local15 != null; local15 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method6000()) {
			if (local15.anInt2286 == arg0 && this.aClass2_Sub18ArrayArray1[arg0][local15.anInt2292] == null && local15.anInt2283 < 0) {
				local15.anInt2283 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBLclient!il;Lclient!tq;Lclient!ic;)Z")
	public synchronized boolean method1776(@OriginalArg(2) Class90 arg0, @OriginalArg(3) Class191 arg1, @OriginalArg(4) Class2_Sub21 arg2) {
		arg2.method2642();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(31) Class2_Sub9 local31 = (Class2_Sub9) arg2.aClass199_11.method5747(); local31 != null; local31 = (Class2_Sub9) arg2.aClass199_11.method5753()) {
			@Pc(37) int local37 = (int) local31.aLong213;
			@Pc(45) Class2_Sub14 local45 = (Class2_Sub14) this.aClass199_8.method5751((long) local37);
			if (local45 == null) {
				local45 = Static289.method5129(local37, arg1);
				if (local45 == null) {
					local9 = false;
					continue;
				}
				this.aClass199_8.method5749(local45, (long) local37);
			}
			if (!local45.method1481(arg0, local31.aByteArray13, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method2644();
		}
		return local9;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!ge;I)I")
	private int method1777(@OriginalArg(0) Class2_Sub18 arg0) {
		@Pc(19) int local19 = arg0.anInt2289 + (arg0.anInt2284 * arg0.anInt2281 >> 12);
		local19 += (this.anIntArray180[arg0.anInt2286] - 8192) * this.anIntArray168[arg0.anInt2286] >> 12;
		@Pc(40) Class209 local40 = arg0.aClass209_1;
		@Pc(60) int local60;
		if (local40.anInt6877 > 0 && (local40.anInt6873 > 0 || this.anIntArray169[arg0.anInt2286] > 0)) {
			local60 = local40.anInt6873 << 2;
			@Pc(65) int local65 = local40.anInt6878 << 1;
			if (local65 > arg0.anInt2290) {
				local60 = arg0.anInt2290 * local60 / local65;
			}
			local60 += this.anIntArray169[arg0.anInt2286] >> 7;
			@Pc(95) double local95 = Math.sin((double) (arg0.anInt2293 & 0x1FF) * 0.01227184630308513D);
			local19 += (int) ((double) local60 * local95);
		}
		local60 = (int) ((double) (arg0.aClass2_Sub12_Sub1_1.anInt6730 * 256) * Math.pow(2.0D, (double) local19 * 3.255208333333333E-4D) / (double) Static65.anInt1429 + 0.5D);
		return local60 >= 1 ? local60 : 1;
	}

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "(I)V")
	public synchronized void method1778() {
		for (@Pc(9) Class2_Sub14 local9 = (Class2_Sub14) this.aClass199_8.method5747(); local9 != null; local9 = (Class2_Sub14) this.aClass199_8.method5753()) {
			local9.method5945();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZLclient!ge;)Z")
	public boolean method1779(@OriginalArg(1) Class2_Sub18 arg0) {
		if (arg0.aClass2_Sub3_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt2283 >= 0) {
			arg0.method5945();
			if (arg0.anInt2285 > 0 && arg0 == this.aClass2_Sub18ArrayArray2[arg0.anInt2286][arg0.anInt2285]) {
				this.aClass2_Sub18ArrayArray2[arg0.anInt2286][arg0.anInt2285] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "(I)V")
	public synchronized void method1780() {
		for (@Pc(7) Class2_Sub14 local7 = (Class2_Sub14) this.aClass199_8.method5747(); local7 != null; local7 = (Class2_Sub14) this.aClass199_8.method5753()) {
			local7.method1482();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!ge;)I")
	private int method1781(@OriginalArg(1) Class2_Sub18 arg0) {
		@Pc(9) int local9 = this.anIntArray173[arg0.anInt2286];
		return local9 >= 8192 ? 16384 - ((16384 - local9) * (128 - arg0.anInt2291) + 32 >> 6) : local9 * arg0.anInt2291 - -32 >> 6;
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(III)V")
	private void method1782() {
		this.anIntArray171[9] = 128;
		this.anIntArray174[9] = 128;
		this.method1757(9, 128);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(Lclient!ge;I)I")
	private int method1783(@OriginalArg(0) Class2_Sub18 arg0) {
		if (this.anIntArray182[arg0.anInt2286] == 0) {
			return 0;
		}
		@Pc(17) Class209 local17 = arg0.aClass209_1;
		@Pc(33) int local33 = this.anIntArray179[arg0.anInt2286] * this.anIntArray178[arg0.anInt2286] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt2298 + 16384 >> 15;
		@Pc(59) int local59 = this.anInt1696 * local50 + 128 >> 8;
		local33 = local59 * this.anIntArray182[arg0.anInt2286] + 128 >> 8;
		if (local17.anInt6868 > 0) {
			local33 = (int) ((double) local33 * Math.pow(0.5D, (double) arg0.anInt2294 * 1.953125E-5D * (double) local17.anInt6868) + 0.5D);
		}
		@Pc(109) int local109;
		@Pc(117) int local117;
		@Pc(135) int local135;
		@Pc(147) int local147;
		if (local17.aByteArray92 != null) {
			local109 = arg0.anInt2287;
			local117 = local17.aByteArray92[arg0.anInt2296 + 1];
			if (arg0.anInt2296 < local17.aByteArray92.length - 2) {
				local135 = (local17.aByteArray92[arg0.anInt2296] & 0xFF) << 8;
				local147 = (local17.aByteArray92[arg0.anInt2296 + 2] & 0xFF) << 8;
				local117 += (local17.aByteArray92[arg0.anInt2296 + 3] - local117) * (local109 + -local135) / (local147 - local135);
			}
			local33 = local33 * local117 + 32 >> 6;
		}
		if (arg0.anInt2283 > 0 && local17.aByteArray93 != null) {
			local109 = arg0.anInt2283;
			local117 = local17.aByteArray93[arg0.anInt2297 + 1];
			if (arg0.anInt2297 < local17.aByteArray93.length - 2) {
				local135 = (local17.aByteArray93[arg0.anInt2297] & 0xFF) << 8;
				local147 = (local17.aByteArray93[arg0.anInt2297 + 2] & 0xFF) << 8;
				local117 += (local17.aByteArray93[arg0.anInt2297 + 3] - local117) * (-local135 + local109) / (local147 - local135);
			}
			local33 = local33 * local117 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIII)V")
	private void method1784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1761(arg1, arg0, 64);
		if ((this.anIntArray177[arg1] & 0x2) != 0) {
			for (@Pc(28) Class2_Sub18 local28 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method5996(); local28 != null; local28 = (Class2_Sub18) this.aClass2_Sub3_Sub4_1.aClass216_39.method5998()) {
				if (arg1 == local28.anInt2286 && local28.anInt2283 < 0) {
					this.aClass2_Sub18ArrayArray1[arg1][local28.anInt2292] = null;
					this.aClass2_Sub18ArrayArray1[arg1][arg0] = local28;
					@Pc(70) int local70 = (local28.anInt2281 * local28.anInt2284 >> 12) + local28.anInt2289;
					local28.anInt2289 += arg0 - local28.anInt2292 << 8;
					local28.anInt2281 = 4096;
					local28.anInt2284 = local70 - local28.anInt2289;
					local28.anInt2292 = arg0;
					return;
				}
			}
		}
		@Pc(116) Class2_Sub14 local116 = (Class2_Sub14) this.aClass199_8.method5751((long) this.anIntArray167[arg1]);
		if (local116 == null) {
			return;
		}
		@Pc(128) Class2_Sub12_Sub1 local128 = local116.aClass2_Sub12_Sub1Array1[arg0];
		if (local128 == null) {
			return;
		}
		@Pc(135) Class2_Sub18 local135 = new Class2_Sub18();
		local135.aClass2_Sub12_Sub1_1 = local128;
		local135.anInt2286 = arg1;
		local135.aClass2_Sub14_1 = local116;
		local135.aClass209_1 = local116.aClass209Array1[arg0];
		local135.anInt2285 = local116.aByteArray20[arg0];
		local135.anInt2292 = arg0;
		local135.anInt2298 = local116.aByteArray21[arg0] * local116.anInt1367 * arg2 * arg2 + 1024 >> 11;
		local135.anInt2291 = local116.aByteArray19[arg0] & 0xFF;
		local135.anInt2289 = (arg0 << 8) - (local116.aShortArray42[arg0] & 0x7FFF);
		local135.anInt2283 = -1;
		local135.anInt2297 = 0;
		local135.anInt2287 = 0;
		local135.anInt2294 = 0;
		local135.anInt2296 = 0;
		if (this.anIntArray175[arg1] == 0) {
			local135.aClass2_Sub3_Sub2_3 = Static360.method1725(local128, this.method1777(local135), this.method1783(local135), this.method1781(local135));
		} else {
			local135.aClass2_Sub3_Sub2_3 = Static360.method1725(local128, this.method1777(local135), 0, this.method1781(local135));
			this.method1767(local135, local116.aShortArray42[arg0] < 0);
		}
		if (local116.aShortArray42[arg0] < 0) {
			local135.aClass2_Sub3_Sub2_3.method1716(-1);
		}
		if (local135.anInt2285 >= 0) {
			@Pc(286) Class2_Sub18 local286 = this.aClass2_Sub18ArrayArray2[arg1][local135.anInt2285];
			if (local286 != null && local286.anInt2283 < 0) {
				this.aClass2_Sub18ArrayArray1[arg1][local286.anInt2292] = null;
				local286.anInt2283 = 0;
			}
			this.aClass2_Sub18ArrayArray2[arg1][local135.anInt2285] = local135;
		}
		this.aClass2_Sub3_Sub4_1.aClass216_39.method5995(local135);
		this.aClass2_Sub18ArrayArray1[arg1][arg0] = local135;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass48_1.method1507()) {
			@Pc(18) int local18 = this.anInt1673 * this.aClass48_1.anInt1443 / Static65.anInt1429;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong51;
				if (this.aLong50 - local27 >= 0L) {
					this.aLong51 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong50 + (long) local18 - this.aLong51 - 1L) / (long) local18);
				this.aLong51 += (long) local18 * (long) local57;
				this.aClass2_Sub3_Sub4_1.method4479(arg0, arg1, local57);
				arg1 += local57;
				arg2 -= local57;
				this.method1748();
			} while (this.aClass48_1.method1507());
		}
		this.aClass2_Sub3_Sub4_1.method4479(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)V")
	private void method1785(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1761(local16, local22, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method1784(local22, local16, local28);
			} else {
				this.method1761(local16, local22, 64);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1754(local16, local28, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray174[local16] = (local28 << 14) + (this.anIntArray174[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray174[local16] = (this.anIntArray174[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray169[local16] = (local28 << 7) + (this.anIntArray169[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray169[local16] = local28 + (this.anIntArray169[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray172[local16] = (local28 << 7) + (this.anIntArray172[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray172[local16] = local28 + (this.anIntArray172[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray179[local16] = (this.anIntArray179[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray179[local16] = local28 + (this.anIntArray179[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray173[local16] = (local28 << 7) + (this.anIntArray173[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray173[local16] = local28 + (this.anIntArray173[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray178[local16] = (this.anIntArray178[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray178[local16] = (this.anIntArray178[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray177[local16] |= 0x1;
				} else {
					this.anIntArray177[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray177[local16] |= 0x2;
				} else {
					this.method1774(local16);
					this.anIntArray177[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray176[local16] = (local28 << 7) + (this.anIntArray176[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray176[local16] = local28 + (this.anIntArray176[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray176[local16] = (this.anIntArray176[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray176[local16] = local28 + (this.anIntArray176[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method1753(local16);
			}
			if (local22 == 121) {
				this.method1759(local16);
			}
			if (local22 == 123) {
				this.method1749(local16);
			}
			@Pc(518) int local518;
			if (local22 == 6) {
				local518 = this.anIntArray176[local16];
				if (local518 == 16384) {
					this.anIntArray168[local16] = (local28 << 7) + (this.anIntArray168[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local518 = this.anIntArray176[local16];
				if (local518 == 16384) {
					this.anIntArray168[local16] = local28 + (this.anIntArray168[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray175[local16] = (this.anIntArray175[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray175[local16] = (this.anIntArray175[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray177[local16] |= 0x4;
				} else {
					this.method1771(local16);
					this.anIntArray177[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method1755(local16, (this.anIntArray181[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method1755(local16, local28 + (this.anIntArray181[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1757(local16, local22 + this.anIntArray174[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1769(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1747(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1770(true);
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "()Lclient!j;")
	@Override
	public synchronized Class2_Sub3 method4475() {
		return this.aClass2_Sub3_Sub4_1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "()I")
	@Override
	public synchronized int method4474() {
		return 0;
	}
}
