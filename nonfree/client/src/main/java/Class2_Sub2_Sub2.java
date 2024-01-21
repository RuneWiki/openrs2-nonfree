import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ie", name = "Ub", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!ie", name = "Wb", descriptor = "I")
	private int anInt1166;

	@OriginalMember(owner = "client!ie", name = "Xb", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!ie", name = "Yb", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!ie", name = "Zb", descriptor = "I")
	private int anInt1167;

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
	private int anInt1118 = 256;

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "[I")
	private final int[] anIntArray136 = new int[16];

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "[I")
	private final int[] anIntArray140 = new int[16];

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "[I")
	private final int[] anIntArray137 = new int[16];

	@OriginalMember(owner = "client!ie", name = "qb", descriptor = "I")
	private final int anInt1145 = 1000000;

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "[I")
	public final int[] anIntArray139 = new int[16];

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "[I")
	private final int[] anIntArray144 = new int[16];

	@OriginalMember(owner = "client!ie", name = "ob", descriptor = "[I")
	private final int[] anIntArray148 = new int[16];

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "[I")
	public final int[] anIntArray142 = new int[16];

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "[I")
	private final int[] anIntArray145 = new int[16];

	@OriginalMember(owner = "client!ie", name = "Bb", descriptor = "[I")
	private final int[] anIntArray149 = new int[16];

	@OriginalMember(owner = "client!ie", name = "mb", descriptor = "[[Lclient!wd;")
	private final Class2_Sub23[][] aClass2_Sub23ArrayArray1 = new Class2_Sub23[16][128];

	@OriginalMember(owner = "client!ie", name = "Db", descriptor = "[I")
	public final int[] anIntArray150 = new int[16];

	@OriginalMember(owner = "client!ie", name = "jb", descriptor = "[I")
	private final int[] anIntArray147 = new int[16];

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "[I")
	private final int[] anIntArray138 = new int[16];

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "[I")
	private final int[] anIntArray141 = new int[16];

	@OriginalMember(owner = "client!ie", name = "eb", descriptor = "[I")
	private final int[] anIntArray146 = new int[16];

	@OriginalMember(owner = "client!ie", name = "Nb", descriptor = "[I")
	private final int[] anIntArray151 = new int[16];

	@OriginalMember(owner = "client!ie", name = "wb", descriptor = "[[Lclient!wd;")
	private final Class2_Sub23[][] aClass2_Sub23ArrayArray2 = new Class2_Sub23[16][128];

	@OriginalMember(owner = "client!ie", name = "cb", descriptor = "Lclient!ld;")
	private final Class48 aClass48_1 = new Class48();

	@OriginalMember(owner = "client!ie", name = "Vb", descriptor = "Lclient!ra;")
	private final Class2_Sub2_Sub3 aClass2_Sub2_Sub3_1 = new Class2_Sub2_Sub3(this);

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "Lclient!jb;")
	private final Class40 aClass40_12 = new Class40(128);

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub2() {
		this.method816();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!na;IILclient!lb;Lclient!t;)Z")
	public synchronized boolean method792(@OriginalArg(0) Class56 arg0, @OriginalArg(3) Class47 arg1, @OriginalArg(4) Class2_Sub17 arg2) {
		arg2.method1802();
		@Pc(5) boolean local5 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class2_Sub11 local26 = (Class2_Sub11) arg2.aClass40_20.method854(); local26 != null; local26 = (Class2_Sub11) arg2.aClass40_20.method852()) {
			@Pc(40) int local40 = (int) local26.aLong100;
			@Pc(48) Class2_Sub15 local48 = (Class2_Sub15) this.aClass40_12.method851((long) local40);
			if (local48 == null) {
				local48 = Static82.method1934(local40, arg0);
				if (local48 == null) {
					local5 = false;
					continue;
				}
				this.aClass40_12.method849(local48, (long) local40);
			}
			if (!local48.method1729(local26.aByteArray24, arg1, local20)) {
				local5 = false;
			}
		}
		if (local5) {
			arg2.method1801();
		}
		return local5;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
	public synchronized void method793() {
		this.aClass48_1.method1143();
		this.method816();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
	private void method794() {
		this.anIntArray141[9] = 128;
		this.anIntArray147[9] = 128;
		this.method824(128, 9);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1765(@OriginalArg(0) int arg0) {
		if (this.aClass48_1.method1140()) {
			@Pc(14) int local14 = this.anInt1145 * this.aClass48_1.anInt1531 / Static107.anInt2405;
			do {
				@Pc(24) long local24 = this.aLong38 + (long) local14 * (long) arg0;
				if (this.aLong37 - local24 >= 0L) {
					this.aLong38 = local24;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong37 - this.aLong38 - 1L) / (long) local14);
				arg0 -= local52;
				this.aLong38 += (long) local52 * (long) local14;
				this.aClass2_Sub2_Sub3_1.method1765(local52);
				this.method809();
			} while (this.aClass48_1.method1140());
		}
		this.aClass2_Sub2_Sub3_1.method1765(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
	private void method795(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1764(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass48_1.method1140()) {
			@Pc(18) int local18 = this.aClass48_1.anInt1531 * this.anInt1145 / Static107.anInt2405;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong38;
				if (this.aLong37 - local27 >= 0L) {
					this.aLong38 = local27;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong37 + (long) local18 - this.aLong38 - 1L) / (long) local18);
				arg2 -= local55;
				this.aLong38 += (long) local55 * (long) local18;
				this.aClass2_Sub2_Sub3_1.method1764(arg0, arg1, local55);
				arg1 += local55;
				this.method809();
			} while (this.aClass48_1.method1140());
		}
		this.aClass2_Sub2_Sub3_1.method1764(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!wd;)I")
	private int method797(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(6) Class78 local6 = arg0.aClass78_1;
		@Pc(22) int local22 = this.anIntArray148[arg0.anInt2911] * this.anIntArray144[arg0.anInt2911] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt2920 * local30 + 16384 >> 15;
		local22 = local39 * this.anInt1118 + 128 >> 8;
		if (local6.anInt2597 > 0) {
			local22 = (int) ((double) local22 * Math.pow(0.5D, (double) arg0.anInt2914 * 1.953125E-5D * (double) local6.anInt2597) + 0.5D);
		}
		@Pc(89) int local89;
		@Pc(86) int local86;
		@Pc(107) int local107;
		@Pc(119) int local119;
		if (local6.aByteArray38 != null) {
			local86 = local6.aByteArray38[arg0.anInt2906 + 1];
			local89 = arg0.anInt2915;
			if (local6.aByteArray38.length - 2 > arg0.anInt2906) {
				local107 = (local6.aByteArray38[arg0.anInt2906] & 0xFF) << 8;
				local119 = (local6.aByteArray38[arg0.anInt2906 + 2] & 0xFF) << 8;
				local86 += (local89 - local107) * (local6.aByteArray38[arg0.anInt2906 + 3] - local86) / (local119 - local107);
			}
			local22 = local86 * local22 + 32 >> 6;
		}
		if (arg0.anInt2904 > 0 && local6.aByteArray37 != null) {
			local86 = local6.aByteArray37[arg0.anInt2921 + 1];
			local89 = arg0.anInt2904;
			if (arg0.anInt2921 < local6.aByteArray37.length - 2) {
				local107 = (local6.aByteArray37[arg0.anInt2921] & 0xFF) << 8;
				local119 = (local6.aByteArray37[arg0.anInt2921 + 2] & 0xFF) << 8;
				local86 += (local89 - local107) * (local6.aByteArray37[arg0.anInt2921 + 3] - local86) / (local119 - local107);
			}
			local22 = local22 * local86 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	private void method798(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method798(local12);
			}
			return;
		}
		this.anIntArray144[arg0] = 12800;
		this.anIntArray151[arg0] = 8192;
		this.anIntArray148[arg0] = 16383;
		this.anIntArray136[arg0] = 8192;
		this.anIntArray145[arg0] = 0;
		this.anIntArray137[arg0] = 8192;
		this.method820(arg0);
		this.method818(arg0);
		this.anIntArray139[arg0] = 0;
		this.anIntArray140[arg0] = 32767;
		this.anIntArray146[arg0] = 256;
		this.anIntArray142[arg0] = 0;
		this.method804(8192, arg0);
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "()Lclient!ad;")
	@Override
	public synchronized Class2_Sub2 method1769() {
		return this.aClass2_Sub2_Sub3_1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
	private void method799(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class2_Sub23 local8 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method270(); local8 != null; local8 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method273()) {
			if (arg0 < 0 || arg0 == local8.anInt2911) {
				if (local8.aClass2_Sub2_Sub1_3 != null) {
					local8.aClass2_Sub2_Sub1_3.method501(Static107.anInt2405 / 100);
					if (local8.aClass2_Sub2_Sub1_3.method507()) {
						this.aClass2_Sub2_Sub3_1.aClass2_Sub2_Sub4_25.method1770(local8.aClass2_Sub2_Sub1_3);
					}
					local8.method2038();
				}
				if (local8.anInt2904 < 0) {
					this.aClass2_Sub23ArrayArray2[local8.anInt2911][local8.anInt2908] = null;
				}
				local8.method2053();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBLclient!wd;[II)Z")
	public boolean method800(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt2923 = Static107.anInt2405 / 100;
		if (arg1.anInt2904 >= 0 && (arg1.aClass2_Sub2_Sub1_3 == null || arg1.aClass2_Sub2_Sub1_3.method505())) {
			arg1.method2038();
			arg1.method2053();
			if (arg1.anInt2913 > 0 && arg1 == this.aClass2_Sub23ArrayArray1[arg1.anInt2911][arg1.anInt2913]) {
				this.aClass2_Sub23ArrayArray1[arg1.anInt2911][arg1.anInt2913] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt2912;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray137[arg1.anInt2911] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt2912 = local56;
		}
		arg1.aClass2_Sub2_Sub1_3.method484(this.method814(arg1));
		@Pc(96) Class78 local96 = arg1.aClass78_1;
		arg1.anInt2909 += local96.anInt2593;
		arg1.anInt2924++;
		@Pc(111) boolean local111 = false;
		@Pc(130) double local130 = (double) ((arg1.anInt2908 - 60 << 8) + (arg1.anInt2912 * arg1.anInt2910 >> 12)) * 5.086263020833333E-6D;
		if (local96.anInt2597 > 0) {
			if (local96.anInt2590 > 0) {
				arg1.anInt2914 += (int) (Math.pow(2.0D, (double) local96.anInt2590 * local130) * 128.0D + 0.5D);
			} else {
				arg1.anInt2914 += 128;
			}
		}
		if (local96.aByteArray38 != null) {
			if (local96.anInt2594 <= 0) {
				arg1.anInt2915 += 128;
			} else {
				arg1.anInt2915 += (int) (Math.pow(2.0D, (double) local96.anInt2594 * local130) * 128.0D + 0.5D);
			}
			while (arg1.anInt2906 < local96.aByteArray38.length - 2 && (local96.aByteArray38[arg1.anInt2906 + 2] & 0xFF) << 8 < arg1.anInt2915) {
				arg1.anInt2906 += 2;
			}
			if (arg1.anInt2906 == local96.aByteArray38.length - 2 && local96.aByteArray38[arg1.anInt2906 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg1.anInt2904 >= 0 && local96.aByteArray37 != null && (this.anIntArray139[arg1.anInt2911] & 0x1) == 0 && (arg1.anInt2913 < 0 || this.aClass2_Sub23ArrayArray1[arg1.anInt2911][arg1.anInt2913] != arg1)) {
			if (local96.anInt2600 > 0) {
				arg1.anInt2904 += (int) (Math.pow(2.0D, (double) local96.anInt2600 * local130) * 128.0D + 0.5D);
			} else {
				arg1.anInt2904 += 128;
			}
			while (arg1.anInt2921 < local96.aByteArray37.length - 2 && arg1.anInt2904 > (local96.aByteArray37[arg1.anInt2921 + 2] & 0xFF) << 8) {
				arg1.anInt2921 += 2;
			}
			if (arg1.anInt2921 == local96.aByteArray37.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg1.aClass2_Sub2_Sub1_3.method480(arg1.anInt2923, this.method797(arg1), this.method828(arg1));
			return false;
		}
		arg1.aClass2_Sub2_Sub1_3.method501(arg1.anInt2923);
		if (arg2 == null) {
			arg1.aClass2_Sub2_Sub1_3.method1765(arg3);
		} else {
			arg1.aClass2_Sub2_Sub1_3.method1764(arg2, arg0, arg3);
		}
		if (arg1.aClass2_Sub2_Sub1_3.method507()) {
			this.aClass2_Sub2_Sub3_1.aClass2_Sub2_Sub4_25.method1770(arg1.aClass2_Sub2_Sub1_3);
		}
		arg1.method2038();
		if (arg1.anInt2904 >= 0) {
			arg1.method2053();
			if (arg1.anInt2913 > 0 && this.aClass2_Sub23ArrayArray1[arg1.anInt2911][arg1.anInt2913] == arg1) {
				this.aClass2_Sub23ArrayArray1[arg1.anInt2911][arg1.anInt2913] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!wd;)Z")
	public boolean method801(@OriginalArg(1) Class2_Sub23 arg0) {
		if (arg0.aClass2_Sub2_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt2904 >= 0) {
			arg0.method2053();
			if (arg0.anInt2913 > 0 && this.aClass2_Sub23ArrayArray1[arg0.anInt2911][arg0.anInt2913] == arg0) {
				this.aClass2_Sub23ArrayArray1[arg0.anInt2911][arg0.anInt2913] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
	public synchronized void method802(@OriginalArg(0) int arg0) {
		this.anInt1118 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)I")
	public int method803() {
		return this.anInt1118;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(III)V")
	private void method804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray149[arg1] = arg0;
		this.anIntArray150[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZII)V")
	private void method805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBII)V")
	private void method807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub23 local12 = this.aClass2_Sub23ArrayArray2[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub23ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray139[arg0] & 0x2) == 0) {
			local12.anInt2904 = 0;
			return;
		}
		for (@Pc(47) Class2_Sub23 local47 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method270(); local47 != null; local47 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method273()) {
			if (local12.anInt2911 == local47.anInt2911 && local47.anInt2904 < 0 && local47 != local12) {
				local12.anInt2904 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()Lclient!ad;")
	@Override
	public synchronized Class2_Sub2 method1766() {
		return null;
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)V")
	private void method809() {
		@Pc(8) int local8 = this.anInt1166;
		@Pc(11) int local11 = this.anInt1167;
		@Pc(22) long local22 = this.aLong37;
		while (local11 == this.anInt1167) {
			while (this.aClass48_1.anIntArray182[local8] == local11) {
				this.aClass48_1.method1146(local8);
				@Pc(33) int local33 = this.aClass48_1.method1138(local8);
				if (local33 == 1) {
					this.aClass48_1.method1145();
					this.aClass48_1.method1135(local8);
					if (this.aClass48_1.method1141()) {
						if (!this.aBoolean46 || local11 == 0) {
							this.method816();
							this.aClass48_1.method1143();
							return;
						}
						this.aClass48_1.method1150(local22);
					}
					break;
				}
				if ((local33 & 0x80) != 0) {
					this.method813(local33);
				}
				this.aClass48_1.method1139(local8);
				this.aClass48_1.method1135(local8);
			}
			local8 = this.aClass48_1.method1144();
			local11 = this.aClass48_1.anIntArray182[local8];
			local22 = this.aClass48_1.method1142(local11);
		}
		this.anInt1166 = local8;
		this.anInt1167 = local11;
		this.aLong37 = local22;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)Z")
	public synchronized boolean method811() {
		return this.aClass48_1.method1140();
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
	public synchronized void method812() {
		for (@Pc(19) Class2_Sub15 local19 = (Class2_Sub15) this.aClass40_12.method854(); local19 != null; local19 = (Class2_Sub15) this.aClass40_12.method852()) {
			local19.method2053();
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)V")
	private void method813(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(20) int local20;
		@Pc(30) int local30;
		if (local5 == 128) {
			local20 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			this.method807(local24, local30, local20);
		} else if (local5 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			local20 = arg0 >> 8 & 0x7F;
			if (local30 <= 0) {
				this.method807(local24, 64, local20);
			} else {
				this.method826(local24, local30, local20);
			}
		} else if (local5 == 160) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method795(local30, local24, local20);
		} else if (local5 == 176) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local20 == 0) {
				this.anIntArray147[local24] = (local30 << 14) + (this.anIntArray147[local24] & 0xFFE03FFF);
			}
			if (local20 == 32) {
				this.anIntArray147[local24] = (local30 << 7) + (this.anIntArray147[local24] & 0xFFFFC07F);
			}
			if (local20 == 1) {
				this.anIntArray145[local24] = (local30 << 7) + (this.anIntArray145[local24] & 0xFFFFC07F);
			}
			if (local20 == 33) {
				this.anIntArray145[local24] = (this.anIntArray145[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 5) {
				this.anIntArray137[local24] = (this.anIntArray137[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 37) {
				this.anIntArray137[local24] = (this.anIntArray137[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 7) {
				this.anIntArray144[local24] = (this.anIntArray144[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 39) {
				this.anIntArray144[local24] = local30 + (this.anIntArray144[local24] & 0xFFFFFF80);
			}
			if (local20 == 10) {
				this.anIntArray151[local24] = (this.anIntArray151[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 42) {
				this.anIntArray151[local24] = (this.anIntArray151[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 11) {
				this.anIntArray148[local24] = (this.anIntArray148[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 43) {
				this.anIntArray148[local24] = (this.anIntArray148[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 64) {
				if (local30 < 64) {
					this.anIntArray139[local24] &= 0xFFFFFFFE;
				} else {
					this.anIntArray139[local24] |= 0x1;
				}
			}
			if (local20 == 65) {
				if (local30 >= 64) {
					this.anIntArray139[local24] |= 0x2;
				} else {
					this.method820(local24);
					this.anIntArray139[local24] &= 0xFFFFFFFD;
				}
			}
			if (local20 == 99) {
				this.anIntArray140[local24] = (this.anIntArray140[local24] & 0x7F) + (local30 << 7);
			}
			if (local20 == 98) {
				this.anIntArray140[local24] = (this.anIntArray140[local24] & 0x3F80) + local30;
			}
			if (local20 == 101) {
				this.anIntArray140[local24] = (this.anIntArray140[local24] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local20 == 100) {
				this.anIntArray140[local24] = local30 + (this.anIntArray140[local24] & 0x3F80) + 16384;
			}
			if (local20 == 120) {
				this.method799(local24);
			}
			if (local20 == 121) {
				this.method798(local24);
			}
			if (local20 == 123) {
				this.method825(local24);
			}
			@Pc(504) int local504;
			if (local20 == 6) {
				local504 = this.anIntArray140[local24];
				if (local504 == 16384) {
					this.anIntArray146[local24] = (local30 << 7) + (this.anIntArray146[local24] & 0xFFFFC07F);
				}
			}
			if (local20 == 38) {
				local504 = this.anIntArray140[local24];
				if (local504 == 16384) {
					this.anIntArray146[local24] = (this.anIntArray146[local24] & 0xFFFFFF80) + local30;
				}
			}
			if (local20 == 16) {
				this.anIntArray142[local24] = (local30 << 7) + (this.anIntArray142[local24] & 0xFFFFC07F);
			}
			if (local20 == 48) {
				this.anIntArray142[local24] = (this.anIntArray142[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 81) {
				if (local30 < 64) {
					this.method818(local24);
					this.anIntArray139[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray139[local24] |= 0x4;
				}
			}
			if (local20 == 17) {
				this.method804((this.anIntArray149[local24] & 0xFFFFC07F) + (local30 << 7), local24);
			}
			if (local20 == 49) {
				this.method804(local30 + (this.anIntArray149[local24] & 0xFFFFFF80), local24);
			}
		} else if (local5 == 192) {
			local20 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			this.method824(this.anIntArray147[local24] + local20, local24);
		} else if (local5 == 208) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method805(local20, local24);
		} else if (local5 == 224) {
			local24 = arg0 & 0xF;
			local20 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F49) >> 8);
			this.method819(local20, local24);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method816();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(ILclient!wd;)I")
	private int method814(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(14) int local14 = (arg0.anInt2912 * arg0.anInt2910 >> 12) + arg0.anInt2922;
		local14 += this.anIntArray146[arg0.anInt2911] * (this.anIntArray136[arg0.anInt2911] - 8192) >> 12;
		@Pc(35) Class78 local35 = arg0.aClass78_1;
		@Pc(61) int local61;
		if (local35.anInt2593 > 0 && (local35.anInt2592 > 0 || this.anIntArray145[arg0.anInt2911] > 0)) {
			local61 = local35.anInt2592 << 2;
			@Pc(66) int local66 = local35.anInt2595 << 1;
			if (local66 > arg0.anInt2924) {
				local61 = local61 * arg0.anInt2924 / local66;
			}
			local61 += this.anIntArray145[arg0.anInt2911] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt2909 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local96 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass2_Sub5_Sub1_1.anInt1045 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static107.anInt2405 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!wd;Z)V")
	public void method815(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) int local14 = arg0.aClass2_Sub5_Sub1_1.aByteArray18.length;
		@Pc(47) int local47;
		if (arg1 && arg0.aClass2_Sub5_Sub1_1.aBoolean43) {
			@Pc(30) int local30 = local14 + local14 - arg0.aClass2_Sub5_Sub1_1.anInt1044;
			local14 <<= 0x8;
			local47 = (int) ((long) local30 * (long) this.anIntArray142[arg0.anInt2911] >> 6);
			if (local47 >= local14) {
				local47 = local14 + local14 - local47 - 1;
				arg0.aClass2_Sub2_Sub1_3.method504();
			}
		} else {
			local47 = (int) ((long) this.anIntArray142[arg0.anInt2911] * (long) local14 >> 6);
		}
		arg0.aClass2_Sub2_Sub1_3.method512(local47);
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
	private void method816() {
		this.method799(-1);
		this.method798(-1);
		for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
			this.anIntArray138[local21] = this.anIntArray141[local21];
		}
		for (@Pc(37) int local37 = 0; local37 < 16; local37++) {
			this.anIntArray147[local37] = this.anIntArray141[local37] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(II)V")
	private void method818(@OriginalArg(0) int arg0) {
		if ((this.anIntArray139[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class2_Sub23 local16 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method270(); local16 != null; local16 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method273()) {
			if (local16.anInt2911 == arg0) {
				local16.anInt2926 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V")
	private void method819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray136[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V")
	private void method820(@OriginalArg(0) int arg0) {
		if ((this.anIntArray139[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub23 local18 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method270(); local18 != null; local18 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method273()) {
			if (arg0 == local18.anInt2911 && this.aClass2_Sub23ArrayArray2[arg0][local18.anInt2908] == null && local18.anInt2904 < 0) {
				local18.anInt2904 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)V")
	public synchronized void method821() {
		for (@Pc(15) Class2_Sub15 local15 = (Class2_Sub15) this.aClass40_12.method854(); local15 != null; local15 = (Class2_Sub15) this.aClass40_12.method852()) {
			local15.method1733();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()I")
	@Override
	public synchronized int method1763() {
		return 0;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(III)V")
	public synchronized void method822() {
		this.method794();
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(III)V")
	private void method824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray138[arg1] != arg0) {
			this.anIntArray138[arg1] = arg0;
			for (@Pc(30) int local30 = 0; local30 < 128; local30++) {
				this.aClass2_Sub23ArrayArray1[arg1][local30] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(II)V")
	private void method825(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class2_Sub23 local18 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method270(); local18 != null; local18 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method273()) {
			if ((arg0 < 0 || arg0 == local18.anInt2911) && local18.anInt2904 < 0) {
				this.aClass2_Sub23ArrayArray2[local18.anInt2911][local18.anInt2908] = null;
				local18.anInt2904 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IBII)V")
	private void method826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method807(arg0, 64, arg2);
		if ((this.anIntArray139[arg0] & 0x2) != 0) {
			for (@Pc(31) Class2_Sub23 local31 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method265(); local31 != null; local31 = (Class2_Sub23) this.aClass2_Sub2_Sub3_1.aClass13_15.method268()) {
				if (local31.anInt2911 == arg0 && local31.anInt2904 < 0) {
					this.aClass2_Sub23ArrayArray2[arg0][local31.anInt2908] = null;
					this.aClass2_Sub23ArrayArray2[arg0][arg2] = local31;
					@Pc(70) int local70 = local31.anInt2922 + (local31.anInt2912 * local31.anInt2910 >> 12);
					local31.anInt2912 = 4096;
					local31.anInt2922 += arg2 - local31.anInt2908 << 8;
					local31.anInt2910 = local70 - local31.anInt2922;
					local31.anInt2908 = arg2;
					return;
				}
			}
		}
		@Pc(115) Class2_Sub15 local115 = (Class2_Sub15) this.aClass40_12.method851((long) this.anIntArray138[arg0]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class2_Sub5_Sub1 local123 = local115.aClass2_Sub5_Sub1Array1[arg2];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class2_Sub23 local130 = new Class2_Sub23();
		local130.aClass2_Sub5_Sub1_1 = local123;
		local130.aClass2_Sub15_1 = local115;
		local130.anInt2911 = arg0;
		local130.aClass78_1 = local115.aClass78Array1[arg2];
		local130.anInt2913 = local115.aByteArray34[arg2];
		local130.anInt2908 = arg2;
		local130.anInt2920 = arg1 * arg1 * local115.anInt2414 * local115.aByteArray33[arg2] + 1024 >> 11;
		local130.anInt2925 = local115.aByteArray32[arg2] & 0xFF;
		local130.anInt2922 = (arg2 << 8) - (local115.aShortArray33[arg2] & 0x7FFF);
		local130.anInt2914 = 0;
		local130.anInt2915 = 0;
		local130.anInt2906 = 0;
		local130.anInt2921 = 0;
		local130.anInt2904 = -1;
		if (this.anIntArray142[arg0] == 0) {
			local130.aClass2_Sub2_Sub1_3 = Static137.method493(local123, this.method814(local130), this.method797(local130), this.method828(local130));
		} else {
			local130.aClass2_Sub2_Sub1_3 = Static137.method493(local123, this.method814(local130), 0, this.method828(local130));
			this.method815(local130, local115.aShortArray33[arg2] < 0);
		}
		if (local115.aShortArray33[arg2] < 0) {
			local130.aClass2_Sub2_Sub1_3.method511(-1);
		}
		if (local130.anInt2913 >= 0) {
			@Pc(286) Class2_Sub23 local286 = this.aClass2_Sub23ArrayArray1[arg0][local130.anInt2913];
			if (local286 != null && local286.anInt2904 < 0) {
				this.aClass2_Sub23ArrayArray2[arg0][local286.anInt2908] = null;
				local286.anInt2904 = 0;
			}
			this.aClass2_Sub23ArrayArray1[arg0][local130.anInt2913] = local130;
		}
		this.aClass2_Sub2_Sub3_1.aClass13_15.method263(local130);
		this.aClass2_Sub23ArrayArray2[arg0][arg2] = local130;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!t;IZ)V")
	public synchronized void method827(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) boolean arg1) {
		this.method793();
		this.aClass48_1.method1136(arg0.aByteArray35);
		this.aBoolean46 = arg1;
		this.aLong38 = 0;
		@Pc(24) int local24 = this.aClass48_1.method1147();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass48_1.method1146(local26);
			this.aClass48_1.method1139(local26);
			this.aClass48_1.method1135(local26);
		}
		this.anInt1166 = this.aClass48_1.method1144();
		this.anInt1167 = this.aClass48_1.anIntArray182[this.anInt1166];
		this.aLong37 = this.aClass48_1.method1142(this.anInt1167);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLclient!wd;)I")
	private int method828(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(15) int local15 = this.anIntArray151[arg0.anInt2911];
		return local15 < 8192 ? local15 * arg0.anInt2925 + 32 >> 6 : 16384 - ((16384 - local15) * (-arg0.anInt2925 + 128) + 32 >> 6);
	}
}
