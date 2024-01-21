import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!h", name = "Yb", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!h", name = "Zb", descriptor = "Z")
	private boolean aBoolean40;

	@OriginalMember(owner = "client!h", name = "bc", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!h", name = "cc", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!h", name = "dc", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!h", name = "V", descriptor = "[I")
	private final int[] anIntArray148 = new int[16];

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "[I")
	private final int[] anIntArray146 = new int[16];

	@OriginalMember(owner = "client!h", name = "W", descriptor = "[I")
	private final int[] anIntArray149 = new int[16];

	@OriginalMember(owner = "client!h", name = "rb", descriptor = "[I")
	private final int[] anIntArray155 = new int[16];

	@OriginalMember(owner = "client!h", name = "J", descriptor = "I")
	private final int anInt983 = 1000000;

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "[I")
	private final int[] anIntArray151 = new int[16];

	@OriginalMember(owner = "client!h", name = "qb", descriptor = "[I")
	public final int[] anIntArray154 = new int[16];

	@OriginalMember(owner = "client!h", name = "Z", descriptor = "[I")
	private final int[] anIntArray150 = new int[16];

	@OriginalMember(owner = "client!h", name = "wb", descriptor = "[I")
	private final int[] anIntArray156 = new int[16];

	@OriginalMember(owner = "client!h", name = "ib", descriptor = "[I")
	private final int[] anIntArray152 = new int[16];

	@OriginalMember(owner = "client!h", name = "mb", descriptor = "I")
	private int anInt1000 = 256;

	@OriginalMember(owner = "client!h", name = "Eb", descriptor = "[I")
	private final int[] anIntArray157 = new int[16];

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "[I")
	private final int[] anIntArray158 = new int[16];

	@OriginalMember(owner = "client!h", name = "O", descriptor = "[[Lclient!lf;")
	private final Class1_Sub15[][] aClass1_Sub15ArrayArray1 = new Class1_Sub15[16][128];

	@OriginalMember(owner = "client!h", name = "lb", descriptor = "[I")
	public final int[] anIntArray153 = new int[16];

	@OriginalMember(owner = "client!h", name = "Jb", descriptor = "[I")
	private final int[] anIntArray159 = new int[16];

	@OriginalMember(owner = "client!h", name = "Ub", descriptor = "[[Lclient!lf;")
	private final Class1_Sub15[][] aClass1_Sub15ArrayArray2 = new Class1_Sub15[16][128];

	@OriginalMember(owner = "client!h", name = "Nb", descriptor = "[I")
	public final int[] anIntArray160 = new int[16];

	@OriginalMember(owner = "client!h", name = "U", descriptor = "[I")
	private final int[] anIntArray147 = new int[16];

	@OriginalMember(owner = "client!h", name = "Tb", descriptor = "Lclient!gb;")
	private final Class27 aClass27_1 = new Class27();

	@OriginalMember(owner = "client!h", name = "ac", descriptor = "Lclient!pa;")
	private final Class1_Sub9_Sub3 aClass1_Sub9_Sub3_1 = new Class1_Sub9_Sub3(this);

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "Lclient!sb;")
	private final Class65 aClass65_14 = new Class65(128);

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class1_Sub9_Sub1() {
		this.method837();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!lf;I)I")
	private int method816(@OriginalArg(0) Class1_Sub15 arg0) {
		@Pc(14) int local14 = this.anIntArray159[arg0.anInt1964];
		return local14 < 8192 ? arg0.anInt1959 * local14 + 32 >> 6 : 16384 - ((16384 - local14) * (-arg0.anInt1959 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLclient!lf;I)V")
	public void method817(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub15 arg1) {
		@Pc(12) int local12 = arg1.aClass1_Sub14_Sub1_1.aByteArray36.length;
		@Pc(44) int local44;
		if (arg0 && arg1.aClass1_Sub14_Sub1_1.aBoolean115) {
			@Pc(27) int local27 = local12 + local12 - arg1.aClass1_Sub14_Sub1_1.anInt2721;
			local12 <<= 0x8;
			local44 = (int) ((long) this.anIntArray153[arg1.anInt1964] * (long) local27 >> 6);
			if (local44 >= local12) {
				local44 = local12 + local12 - local44 - 1;
				arg1.aClass1_Sub9_Sub4_3.method1583();
			}
		} else {
			local44 = (int) ((long) this.anIntArray153[arg1.anInt1964] * (long) local12 >> 6);
		}
		arg1.aClass1_Sub9_Sub4_3.method1567(local44);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	public synchronized void method818() {
		for (@Pc(17) Class1_Sub6 local17 = (Class1_Sub6) this.aClass65_14.method1803(); local17 != null; local17 = (Class1_Sub6) this.aClass65_14.method1801()) {
			local17.method407();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
	private void method820(@OriginalArg(0) int arg0) {
		if ((this.anIntArray160[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class1_Sub15 local26 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1748(); local26 != null; local26 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1760()) {
			if (local26.anInt1964 == arg0) {
				local26.anInt1958 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)I")
	public int method821() {
		return this.anInt1000;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()Lclient!m;")
	@Override
	public synchronized Class1_Sub9 method1549() {
		return this.aClass1_Sub9_Sub3_1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V")
	private void method822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
	private void method823(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method827(local22, local16, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			if (local28 > 0) {
				this.method845(local22, local16, local28);
			} else {
				this.method827(local22, local16, 64);
			}
		} else if (local9 == 160) {
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			this.method838(local28, local16, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray152[local16] = (local28 << 14) + (this.anIntArray152[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray152[local16] = (this.anIntArray152[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray157[local16] = (this.anIntArray157[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray157[local16] = local28 + (this.anIntArray157[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray158[local16] = (local28 << 7) + (this.anIntArray158[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray158[local16] = (this.anIntArray158[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray151[local16] = (local28 << 7) + (this.anIntArray151[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray151[local16] = (this.anIntArray151[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray159[local16] = (this.anIntArray159[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray159[local16] = (this.anIntArray159[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray156[local16] = (local28 << 7) + (this.anIntArray156[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray156[local16] = (this.anIntArray156[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray160[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray160[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray160[local16] |= 0x2;
				} else {
					this.method836(local16);
					this.anIntArray160[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray155[local16] = (local28 << 7) + (this.anIntArray155[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray155[local16] = (this.anIntArray155[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray155[local16] = (local28 << 7) + ((this.anIntArray155[local16] & 0x7F) + 16384);
			}
			if (local22 == 100) {
				this.anIntArray155[local16] = (this.anIntArray155[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method826(local16);
			}
			if (local22 == 121) {
				this.method844(local16);
			}
			if (local22 == 123) {
				this.method839(local16);
			}
			@Pc(502) int local502;
			if (local22 == 6) {
				local502 = this.anIntArray155[local16];
				if (local502 == 16384) {
					this.anIntArray146[local16] = (local28 << 7) + (this.anIntArray146[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local502 = this.anIntArray155[local16];
				if (local502 == 16384) {
					this.anIntArray146[local16] = (this.anIntArray146[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray153[local16] = (local28 << 7) + (this.anIntArray153[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray153[local16] = (this.anIntArray153[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray160[local16] |= 0x4;
				} else {
					this.method820(local16);
					this.anIntArray160[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method824(local16, (local28 << 7) + (this.anIntArray150[local16] & 0xFFFFC07F));
			}
			if (local22 == 49) {
				this.method824(local16, local28 + (this.anIntArray150[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method842(local16, local22 + this.anIntArray152[local16]);
		} else if (local9 == 208) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			this.method822(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F10) >> 8);
			this.method835(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method837();
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IBI)V")
	private void method824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray150[arg0] = arg1;
		this.anIntArray154[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()I")
	@Override
	public synchronized int method1551() {
		return 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)V")
	private void method825() {
		this.anIntArray149[9] = 128;
		this.anIntArray152[9] = 128;
		this.method842(9, 128);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
	private void method826(@OriginalArg(1) int arg0) {
		for (@Pc(19) Class1_Sub15 local19 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1748(); local19 != null; local19 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1760()) {
			if (arg0 < 0 || local19.anInt1964 == arg0) {
				if (local19.aClass1_Sub9_Sub4_3 != null) {
					local19.aClass1_Sub9_Sub4_3.method1558(Static39.anInt1014 / 100);
					if (local19.aClass1_Sub9_Sub4_3.method1579()) {
						this.aClass1_Sub9_Sub3_1.aClass1_Sub9_Sub2_4.method1016(local19.aClass1_Sub9_Sub4_3);
					}
					local19.method1369();
				}
				if (local19.anInt1951 < 0) {
					this.aClass1_Sub15ArrayArray1[local19.anInt1964][local19.anInt1952] = null;
				}
				local19.method2050();
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1553(@OriginalArg(0) int arg0) {
		if (this.aClass27_1.method672()) {
			@Pc(18) int local18 = this.anInt983 * this.aClass27_1.anInt895 / Static39.anInt1014;
			do {
				@Pc(27) long local27 = this.aLong46 + (long) arg0 * (long) local18;
				if (this.aLong45 - local27 >= 0L) {
					this.aLong46 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong45 - this.aLong46 - 1L) / (long) local18);
				this.aLong46 += (long) local18 * (long) local58;
				this.aClass1_Sub9_Sub3_1.method1553(local58);
				this.method833();
				arg0 -= local58;
			} while (this.aClass27_1.method672());
		}
		this.aClass1_Sub9_Sub3_1.method1553(arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIBI)V")
	private void method827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class1_Sub15 local16 = this.aClass1_Sub15ArrayArray1[arg1][arg0];
		if (local16 == null) {
			return;
		}
		this.aClass1_Sub15ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray160[arg1] & 0x2) == 0) {
			local16.anInt1951 = 0;
			return;
		}
		for (@Pc(44) Class1_Sub15 local44 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1748(); local44 != null; local44 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1760()) {
			if (local44.anInt1964 == local16.anInt1964 && local44.anInt1951 < 0 && local16 != local44) {
				local16.anInt1951 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	public synchronized void method828() {
		for (@Pc(16) Class1_Sub6 local16 = (Class1_Sub6) this.aClass65_14.method1803(); local16 != null; local16 = (Class1_Sub6) this.aClass65_14.method1801()) {
			local16.method2050();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)V")
	public synchronized void method829(@OriginalArg(1) int arg0) {
		this.anInt1000 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!lf;)I")
	private int method830(@OriginalArg(1) Class1_Sub15 arg0) {
		@Pc(20) int local20 = (arg0.anInt1970 * arg0.anInt1971 >> 12) + arg0.anInt1972;
		local20 += (this.anIntArray147[arg0.anInt1964] - 8192) * this.anIntArray146[arg0.anInt1964] >> 12;
		@Pc(41) Class77 local41 = arg0.aClass77_1;
		@Pc(66) int local66;
		if (local41.anInt2881 > 0 && (local41.anInt2883 > 0 || this.anIntArray157[arg0.anInt1964] > 0)) {
			@Pc(61) int local61 = local41.anInt2885 << 1;
			local66 = local41.anInt2883 << 2;
			if (local61 > arg0.anInt1967) {
				local66 = arg0.anInt1967 * local66 / local61;
			}
			local66 += this.anIntArray157[arg0.anInt1964] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt1955 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) ((double) local66 * local100);
		}
		local66 = (int) ((double) (arg0.aClass1_Sub14_Sub1_1.anInt2723 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static39.anInt1014 + 0.5D);
		return local66 < 1 ? 1 : local66;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Lclient!lf;I)Z")
	public boolean method831(@OriginalArg(0) Class1_Sub15 arg0) {
		if (arg0.aClass1_Sub9_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt1951 >= 0) {
			arg0.method2050();
			if (arg0.anInt1960 > 0 && this.aClass1_Sub15ArrayArray2[arg0.anInt1964][arg0.anInt1960] == arg0) {
				this.aClass1_Sub15ArrayArray2[arg0.anInt1964][arg0.anInt1960] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[ILclient!lf;II)Z")
	public boolean method832(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.anInt1963 = Static39.anInt1014 / 100;
		if (arg1.anInt1951 >= 0 && (arg1.aClass1_Sub9_Sub4_3 == null || arg1.aClass1_Sub9_Sub4_3.method1594())) {
			arg1.method1369();
			arg1.method2050();
			if (arg1.anInt1960 > 0 && arg1 == this.aClass1_Sub15ArrayArray2[arg1.anInt1964][arg1.anInt1960]) {
				this.aClass1_Sub15ArrayArray2[arg1.anInt1964][arg1.anInt1960] = null;
			}
			return true;
		}
		@Pc(55) boolean local55 = false;
		@Pc(58) int local58 = arg1.anInt1970;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray158[arg1.anInt1964] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg1.anInt1970 = local58;
		}
		arg1.aClass1_Sub9_Sub4_3.method1566(this.method830(arg1));
		arg1.anInt1967++;
		@Pc(116) double local116 = (double) ((arg1.anInt1970 * arg1.anInt1971 >> 12) + (arg1.anInt1952 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(119) Class77 local119 = arg1.aClass77_1;
		arg1.anInt1955 += local119.anInt2881;
		if (local119.anInt2889 > 0) {
			if (local119.anInt2884 <= 0) {
				arg1.anInt1956 += 128;
			} else {
				arg1.anInt1956 += (int) (Math.pow(2.0D, local116 * (double) local119.anInt2884) * 128.0D + 0.5D);
			}
			if (arg1.anInt1956 * local119.anInt2889 >= 819200) {
				local55 = true;
			}
		}
		if (local119.aByteArray42 != null) {
			if (local119.anInt2876 > 0) {
				arg1.anInt1953 += (int) (Math.pow(2.0D, (double) local119.anInt2876 * local116) * 128.0D + 0.5D);
			} else {
				arg1.anInt1953 += 128;
			}
			while (local119.aByteArray42.length - 2 > arg1.anInt1969 && (local119.aByteArray42[arg1.anInt1969 + 2] & 0xFF) << 8 < arg1.anInt1953) {
				arg1.anInt1969 += 2;
			}
			if (arg1.anInt1969 == local119.aByteArray42.length - 2 && local119.aByteArray42[arg1.anInt1969 + 1] == 0) {
				local55 = true;
			}
		}
		if (arg1.anInt1951 >= 0 && local119.aByteArray41 != null && (this.anIntArray160[arg1.anInt1964] & 0x1) == 0 && (arg1.anInt1960 < 0 || this.aClass1_Sub15ArrayArray2[arg1.anInt1964][arg1.anInt1960] != arg1)) {
			if (local119.anInt2879 > 0) {
				arg1.anInt1951 += (int) (Math.pow(2.0D, local116 * (double) local119.anInt2879) * 128.0D + 0.5D);
			} else {
				arg1.anInt1951 += 128;
			}
			while (arg1.anInt1968 < local119.aByteArray41.length - 2 && (local119.aByteArray41[arg1.anInt1968 + 2] & 0xFF) << 8 < arg1.anInt1951) {
				arg1.anInt1968 += 2;
			}
			if (arg1.anInt1968 == local119.aByteArray41.length - 2) {
				local55 = true;
			}
		}
		if (!local55) {
			arg1.aClass1_Sub9_Sub4_3.method1576(arg1.anInt1963, this.method834(arg1), this.method816(arg1));
			return false;
		}
		arg1.aClass1_Sub9_Sub4_3.method1558(arg1.anInt1963);
		if (arg0 == null) {
			arg1.aClass1_Sub9_Sub4_3.method1553(arg2);
		} else {
			arg1.aClass1_Sub9_Sub4_3.method1554(arg0, arg3, arg2);
		}
		if (arg1.aClass1_Sub9_Sub4_3.method1579()) {
			this.aClass1_Sub9_Sub3_1.aClass1_Sub9_Sub2_4.method1016(arg1.aClass1_Sub9_Sub4_3);
		}
		arg1.method1369();
		if (arg1.anInt1951 >= 0) {
			arg1.method2050();
			if (arg1.anInt1960 > 0 && arg1 == this.aClass1_Sub15ArrayArray2[arg1.anInt1964][arg1.anInt1960]) {
				this.aClass1_Sub15ArrayArray2[arg1.anInt1964][arg1.anInt1960] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	private void method833() {
		@Pc(8) int local8 = this.anInt1026;
		@Pc(11) int local11 = this.anInt1025;
		@Pc(14) long local14 = this.aLong45;
		while (local11 == this.anInt1025) {
			while (this.aClass27_1.anIntArray121[local8] == local11) {
				this.aClass27_1.method667(local8);
				@Pc(25) int local25 = this.aClass27_1.method670(local8);
				if (local25 == 1) {
					this.aClass27_1.method668();
					this.aClass27_1.method671(local8);
					if (this.aClass27_1.method659()) {
						if (!this.aBoolean40 || local11 == 0) {
							this.method837();
							this.aClass27_1.method662();
							return;
						}
						this.aClass27_1.method660(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method823(local25);
				}
				this.aClass27_1.method665(local8);
				this.aClass27_1.method671(local8);
			}
			local8 = this.aClass27_1.method661();
			local11 = this.aClass27_1.anIntArray121[local8];
			local14 = this.aClass27_1.method673(local11);
		}
		this.anInt1025 = local11;
		this.aLong45 = local14;
		this.anInt1026 = local8;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(BLclient!lf;)I")
	private int method834(@OriginalArg(1) Class1_Sub15 arg0) {
		@Pc(6) Class77 local6 = arg0.aClass77_1;
		@Pc(22) int local22 = this.anIntArray151[arg0.anInt1964] * this.anIntArray156[arg0.anInt1964] + 4096 >> 13;
		@Pc(35) int local35 = local22 * local22 + 16384 >> 15;
		@Pc(44) int local44 = arg0.anInt1957 * local35 + 16384 >> 15;
		local22 = local44 * this.anInt1000 + 128 >> 8;
		if (local6.anInt2889 > 0) {
			local22 = (int) (Math.pow(0.5D, (double) arg0.anInt1956 * 1.953125E-5D * (double) local6.anInt2889) * (double) local22 + 0.5D);
		}
		@Pc(80) int local80;
		@Pc(88) int local88;
		@Pc(118) int local118;
		@Pc(108) int local108;
		if (local6.aByteArray42 != null) {
			local80 = arg0.anInt1953;
			local88 = local6.aByteArray42[arg0.anInt1969 + 1];
			if (arg0.anInt1969 < local6.aByteArray42.length - 2) {
				local108 = (local6.aByteArray42[arg0.anInt1969 + 2] & 0xFF) << 8;
				local118 = (local6.aByteArray42[arg0.anInt1969] & 0xFF) << 8;
				local88 += (local80 - local118) * (local6.aByteArray42[arg0.anInt1969 + 3] - local88) / (local108 - local118);
			}
			local22 = local22 * local88 + 32 >> 6;
		}
		if (arg0.anInt1951 > 0 && local6.aByteArray41 != null) {
			local80 = arg0.anInt1951;
			local88 = local6.aByteArray41[arg0.anInt1968 + 1];
			if (local6.aByteArray41.length - 2 > arg0.anInt1968) {
				local118 = (local6.aByteArray41[arg0.anInt1968] & 0xFF) << 8;
				local108 = (local6.aByteArray41[arg0.anInt1968 + 2] & 0xFF) << 8;
				local88 += (local6.aByteArray41[arg0.anInt1968 + 3] - local88) * (local80 - local118) / (local108 - local118);
			}
			local22 = local22 * local88 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)V")
	private void method835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray147[arg0] = arg1;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(ZI)V")
	private void method836(@OriginalArg(1) int arg0) {
		if ((this.anIntArray160[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class1_Sub15 local22 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1748(); local22 != null; local22 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1760()) {
			if (arg0 == local22.anInt1964 && this.aClass1_Sub15ArrayArray1[arg0][local22.anInt1952] == null && local22.anInt1951 < 0) {
				local22.anInt1951 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	private void method837() {
		this.method826(-1);
		this.method844(-1);
		for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
			this.anIntArray148[local17] = this.anIntArray149[local17];
		}
		for (@Pc(40) int local40 = 0; local40 < 16; local40++) {
			this.anIntArray152[local40] = this.anIntArray149[local40] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1554(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass27_1.method672()) {
			@Pc(14) int local14 = this.aClass27_1.anInt895 * this.anInt983 / Static39.anInt1014;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong46;
				if (this.aLong45 - local23 >= 0L) {
					this.aLong46 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong45 - this.aLong46 - 1L) / (long) local14);
				arg2 -= local52;
				this.aLong46 += (long) local52 * (long) local14;
				this.aClass1_Sub9_Sub3_1.method1554(arg0, arg1, local52);
				arg1 += local52;
				this.method833();
			} while (this.aClass27_1.method672());
		}
		this.aClass1_Sub9_Sub3_1.method1554(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
	private void method838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(ZI)V")
	private void method839(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub15 local8 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1748(); local8 != null; local8 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1760()) {
			if ((arg0 < 0 || local8.anInt1964 == arg0) && local8.anInt1951 < 0) {
				this.aClass1_Sub15ArrayArray1[local8.anInt1964][local8.anInt1952] = null;
				local8.anInt1951 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIB)V")
	public synchronized void method841() {
		this.method825();
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()Lclient!m;")
	@Override
	public synchronized Class1_Sub9 method1552() {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IBI)V")
	private void method842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray148[arg0] != arg1) {
			this.anIntArray148[arg0] = arg1;
			for (@Pc(23) int local23 = 0; local23 < 128; local23++) {
				this.aClass1_Sub15ArrayArray2[arg0][local23] = null;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)Z")
	public synchronized boolean method843() {
		return this.aClass27_1.method672();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(II)V")
	private void method844(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method844(local9);
			}
			return;
		}
		this.anIntArray151[arg0] = 12800;
		this.anIntArray159[arg0] = 8192;
		this.anIntArray156[arg0] = 16383;
		this.anIntArray147[arg0] = 8192;
		this.anIntArray157[arg0] = 0;
		this.anIntArray158[arg0] = 8192;
		this.method836(arg0);
		this.method820(arg0);
		this.anIntArray160[arg0] = 0;
		this.anIntArray155[arg0] = 32767;
		this.anIntArray146[arg0] = 256;
		this.anIntArray153[arg0] = 0;
		this.method824(arg0, 8192);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IIII)V")
	private void method845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method827(arg0, arg1, 64);
		if ((this.anIntArray160[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub15 local28 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1753(); local28 != null; local28 = (Class1_Sub15) this.aClass1_Sub9_Sub3_1.aClass61_13.method1750()) {
				if (arg1 == local28.anInt1964 && local28.anInt1951 < 0) {
					this.aClass1_Sub15ArrayArray1[arg1][local28.anInt1952] = null;
					this.aClass1_Sub15ArrayArray1[arg1][arg0] = local28;
					@Pc(67) int local67 = (local28.anInt1970 * local28.anInt1971 >> 12) + local28.anInt1972;
					local28.anInt1970 = 4096;
					local28.anInt1972 += arg0 - local28.anInt1952 << 8;
					local28.anInt1952 = arg0;
					local28.anInt1971 = local67 - local28.anInt1972;
					return;
				}
			}
		}
		@Pc(114) Class1_Sub6 local114 = (Class1_Sub6) this.aClass65_14.method1802((long) this.anIntArray148[arg1]);
		if (local114 == null) {
			return;
		}
		@Pc(122) Class1_Sub14_Sub1 local122 = local114.aClass1_Sub14_Sub1Array1[arg0];
		if (local122 == null) {
			return;
		}
		@Pc(129) Class1_Sub15 local129 = new Class1_Sub15();
		local129.aClass1_Sub6_1 = local114;
		local129.anInt1964 = arg1;
		local129.aClass1_Sub14_Sub1_1 = local122;
		local129.aClass77_1 = local114.aClass77Array1[arg0];
		local129.anInt1960 = local114.aByteArray3[arg0];
		local129.anInt1952 = arg0;
		local129.anInt1957 = local114.aByteArray2[arg0] * arg2 * arg2 * local114.anInt478 + 1024 >> 11;
		local129.anInt1959 = local114.aByteArray4[arg0] & 0xFF;
		local129.anInt1972 = (arg0 << 8) - (local114.aShortArray17[arg0] & 0x7FFF);
		local129.anInt1969 = 0;
		local129.anInt1968 = 0;
		local129.anInt1951 = -1;
		local129.anInt1956 = 0;
		local129.anInt1953 = 0;
		if (this.anIntArray153[arg1] == 0) {
			local129.aClass1_Sub9_Sub4_3 = Static140.method1577(local122, this.method830(local129), this.method834(local129), this.method816(local129));
		} else {
			local129.aClass1_Sub9_Sub4_3 = Static140.method1577(local122, this.method830(local129), 0, this.method816(local129));
			this.method817(local114.aShortArray17[arg0] < 0, local129);
		}
		if (local114.aShortArray17[arg0] < 0) {
			local129.aClass1_Sub9_Sub4_3.method1575(-1);
		}
		if (local129.anInt1960 >= 0) {
			@Pc(287) Class1_Sub15 local287 = this.aClass1_Sub15ArrayArray2[arg1][local129.anInt1960];
			if (local287 != null && local287.anInt1951 < 0) {
				this.aClass1_Sub15ArrayArray1[arg1][local287.anInt1952] = null;
				local287.anInt1951 = 0;
			}
			this.aClass1_Sub15ArrayArray2[arg1][local129.anInt1960] = local129;
		}
		this.aClass1_Sub9_Sub3_1.aClass61_13.method1754(local129);
		this.aClass1_Sub15ArrayArray1[arg1][arg0] = local129;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!uf;Lclient!sf;Lclient!p;I)Z")
	public synchronized boolean method846(@OriginalArg(1) Class1_Sub23 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class54 arg2) {
		arg0.method1974();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class1_Sub2 local26 = (Class1_Sub2) arg0.aClass65_41.method1803(); local26 != null; local26 = (Class1_Sub2) arg0.aClass65_41.method1801()) {
			@Pc(32) int local32 = (int) local26.aLong130;
			@Pc(40) Class1_Sub6 local40 = (Class1_Sub6) this.aClass65_14.method1802((long) local32);
			if (local40 == null) {
				local40 = Static119.method1962(local32, arg1);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass65_14.method1797(local40, (long) local32);
			}
			if (!local40.method406(local20, arg2, local26.aByteArray1)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method1973();
		}
		return local9;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!uf;Z)V")
	public synchronized void method847(@OriginalArg(1) Class1_Sub23 arg0, @OriginalArg(2) boolean arg1) {
		this.method848();
		this.aClass27_1.method664(arg0.aByteArray39);
		this.aBoolean40 = arg1;
		this.aLong46 = 0L;
		@Pc(31) int local31 = this.aClass27_1.method666();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			this.aClass27_1.method667(local33);
			this.aClass27_1.method665(local33);
			this.aClass27_1.method671(local33);
		}
		this.anInt1026 = this.aClass27_1.method661();
		this.anInt1025 = this.aClass27_1.anIntArray121[this.anInt1026];
		this.aLong45 = this.aClass27_1.method673(this.anInt1025);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V")
	public synchronized void method848() {
		this.aClass27_1.method662();
		this.method837();
	}
}
