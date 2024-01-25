import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class5_Sub17_Sub2 extends Class5_Sub17 {

	@OriginalMember(owner = "client!la", name = "lb", descriptor = "[I")
	public static final int[] lb = new int[Static169.anInt3467];

	@OriginalMember(owner = "client!la", name = "Mb", descriptor = "I")
	private int anInt3476;

	@OriginalMember(owner = "client!la", name = "Nb", descriptor = "J")
	private long aLong124;

	@OriginalMember(owner = "client!la", name = "Pb", descriptor = "I")
	private int anInt3477;

	@OriginalMember(owner = "client!la", name = "Qb", descriptor = "J")
	private long aLong125;

	@OriginalMember(owner = "client!la", name = "Rb", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!la", name = "Sb", descriptor = "I")
	private int anInt3478;

	@OriginalMember(owner = "client!la", name = "Tb", descriptor = "Lclient!ha;")
	private Class5_Sub20 aClass5_Sub20_2;

	@OriginalMember(owner = "client!la", name = "Ub", descriptor = "Z")
	private boolean aBoolean248;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "[I")
	public final int[] anIntArray239 = new int[16];

	@OriginalMember(owner = "client!la", name = "t", descriptor = "[I")
	private final int[] anIntArray240 = new int[16];

	@OriginalMember(owner = "client!la", name = "u", descriptor = "[I")
	private final int[] anIntArray241 = new int[16];

	@OriginalMember(owner = "client!la", name = "fb", descriptor = "[I")
	private final int[] anIntArray249 = new int[16];

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "[I")
	private final int[] anIntArray244 = new int[16];

	@OriginalMember(owner = "client!la", name = "bb", descriptor = "[I")
	private final int[] anIntArray248 = new int[16];

	@OriginalMember(owner = "client!la", name = "mb", descriptor = "[I")
	private final int[] anIntArray253 = new int[16];

	@OriginalMember(owner = "client!la", name = "V", descriptor = "[I")
	private final int[] anIntArray246 = new int[16];

	@OriginalMember(owner = "client!la", name = "pb", descriptor = "[I")
	private final int[] anIntArray254 = new int[16];

	@OriginalMember(owner = "client!la", name = "W", descriptor = "[I")
	public final int[] anIntArray247 = new int[16];

	@OriginalMember(owner = "client!la", name = "gb", descriptor = "[I")
	private final int[] anIntArray250 = new int[16];

	@OriginalMember(owner = "client!la", name = "hb", descriptor = "[I")
	private final int[] anIntArray251 = new int[16];

	@OriginalMember(owner = "client!la", name = "R", descriptor = "[[Lclient!mi;")
	private final Class5_Sub28[][] aClass5_Sub28ArrayArray2 = new Class5_Sub28[16][128];

	@OriginalMember(owner = "client!la", name = "J", descriptor = "[[Lclient!mi;")
	private final Class5_Sub28[][] aClass5_Sub28ArrayArray1 = new Class5_Sub28[16][128];

	@OriginalMember(owner = "client!la", name = "N", descriptor = "[I")
	private final int[] anIntArray243 = new int[16];

	@OriginalMember(owner = "client!la", name = "Fb", descriptor = "I")
	private int anInt3471 = 256;

	@OriginalMember(owner = "client!la", name = "xb", descriptor = "[I")
	public final int[] anIntArray255 = new int[16];

	@OriginalMember(owner = "client!la", name = "Eb", descriptor = "[I")
	private final int[] anIntArray258 = new int[16];

	@OriginalMember(owner = "client!la", name = "sb", descriptor = "I")
	private final int anInt3462 = 1000000;

	@OriginalMember(owner = "client!la", name = "Ib", descriptor = "[I")
	private final int[] anIntArray259 = new int[16];

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!jc;")
	private final Class95 aClass95_1 = new Class95();

	@OriginalMember(owner = "client!la", name = "Ob", descriptor = "Lclient!qh;")
	private final Class5_Sub17_Sub4 aClass5_Sub17_Sub4_1 = new Class5_Sub17_Sub4(this);

	@OriginalMember(owner = "client!la", name = "O", descriptor = "Lclient!cs;")
	private final Class42 aClass42_29 = new Class42(128);

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class5_Sub17_Sub2() {
		this.method3214();
		this.method3206(true);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBI)V")
	private void method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class5_Sub28 local12 = this.aClass5_Sub28ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass5_Sub28ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray247[arg0] & 0x2) == 0) {
			local12.anInt3783 = 0;
			return;
		}
		for (@Pc(43) Class5_Sub28 local43 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5608(); local43 != null; local43 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5603()) {
			if (local43.anInt3774 == local12.anInt3774 && local43.anInt3783 < 0 && local12 != local43) {
				local12.anInt3783 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	public synchronized void method3181() {
		this.method3199(true);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IZ)V")
	private void method3182(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class5_Sub28 local12 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5608(); local12 != null; local12 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5603()) {
			if ((arg0 < 0 || local12.anInt3774 == arg0) && local12.anInt3783 < 0) {
				this.aClass5_Sub28ArrayArray2[local12.anInt3774][local12.anInt3784] = null;
				local12.anInt3783 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!mi;I)Z")
	public boolean method3183(@OriginalArg(0) Class5_Sub28 arg0) {
		if (arg0.aClass5_Sub17_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt3783 >= 0) {
			arg0.method5803();
			if (arg0.anInt3775 > 0 && this.aClass5_Sub28ArrayArray1[arg0.anInt3774][arg0.anInt3775] == arg0) {
				this.aClass5_Sub28ArrayArray1[arg0.anInt3774][arg0.anInt3775] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI[ILclient!mi;I)Z")
	public boolean method3185(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class5_Sub28 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt3786 = Static344.anInt1063 / 100;
		if (arg2.anInt3783 >= 0 && (arg2.aClass5_Sub17_Sub1_3 == null || arg2.aClass5_Sub17_Sub1_3.method2098())) {
			arg2.method3480();
			arg2.method5803();
			if (arg2.anInt3775 > 0 && arg2 == this.aClass5_Sub28ArrayArray1[arg2.anInt3774][arg2.anInt3775]) {
				this.aClass5_Sub28ArrayArray1[arg2.anInt3774][arg2.anInt3775] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg2.anInt3779;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray244[arg2.anInt3774] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg2.anInt3779 = local53;
		}
		arg2.aClass5_Sub17_Sub1_3.method2116(this.method3187(arg2));
		@Pc(102) Class167 local102 = arg2.aClass167_1;
		arg2.anInt3789 += local102.anInt5041;
		@Pc(111) boolean local111 = false;
		arg2.anInt3780++;
		@Pc(135) double local135 = (double) ((arg2.anInt3779 * arg2.anInt3769 >> 12) + (arg2.anInt3784 - 60 << 8)) * 5.086263020833333E-6D;
		if (local102.anInt5045 > 0) {
			if (local102.anInt5042 > 0) {
				arg2.anInt3782 += (int) (Math.pow(2.0D, (double) local102.anInt5042 * local135) * 128.0D + 0.5D);
			} else {
				arg2.anInt3782 += 128;
			}
			if (arg2.anInt3782 * local102.anInt5045 >= 819200) {
				local111 = true;
			}
		}
		if (local102.aByteArray73 != null) {
			if (local102.anInt5046 <= 0) {
				arg2.anInt3773 += 128;
			} else {
				arg2.anInt3773 += (int) (Math.pow(2.0D, (double) local102.anInt5046 * local135) * 128.0D + 0.5D);
			}
			while (local102.aByteArray73.length - 2 > arg2.anInt3771 && arg2.anInt3773 > (local102.aByteArray73[arg2.anInt3771 + 2] & 0xFF) << 8) {
				arg2.anInt3771 += 2;
			}
			if (arg2.anInt3771 == local102.aByteArray73.length - 2 && local102.aByteArray73[arg2.anInt3771 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg2.anInt3783 >= 0 && local102.aByteArray72 != null && (this.anIntArray247[arg2.anInt3774] & 0x1) == 0 && (arg2.anInt3775 < 0 || arg2 != this.aClass5_Sub28ArrayArray1[arg2.anInt3774][arg2.anInt3775])) {
			if (local102.anInt5047 > 0) {
				arg2.anInt3783 += (int) (Math.pow(2.0D, (double) local102.anInt5047 * local135) * 128.0D + 0.5D);
			} else {
				arg2.anInt3783 += 128;
			}
			while (local102.aByteArray72.length - 2 > arg2.anInt3788 && (local102.aByteArray72[arg2.anInt3788 + 2] & 0xFF) << 8 < arg2.anInt3783) {
				arg2.anInt3788 += 2;
			}
			if (arg2.anInt3788 == local102.aByteArray72.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg2.aClass5_Sub17_Sub1_3.method2129(arg2.anInt3786, this.method3208(arg2), this.method3203(arg2));
			return false;
		}
		arg2.aClass5_Sub17_Sub1_3.method2093(arg2.anInt3786);
		if (arg1 == null) {
			arg2.aClass5_Sub17_Sub1_3.method4465(arg0);
		} else {
			arg2.aClass5_Sub17_Sub1_3.method4464(arg1, arg3, arg0);
		}
		if (arg2.aClass5_Sub17_Sub1_3.method2120()) {
			this.aClass5_Sub17_Sub4_1.aClass5_Sub17_Sub3_2.method3547(arg2.aClass5_Sub17_Sub1_3);
		}
		arg2.method3480();
		if (arg2.anInt3783 >= 0) {
			arg2.method5803();
			if (arg2.anInt3775 > 0 && arg2 == this.aClass5_Sub28ArrayArray1[arg2.anInt3774][arg2.anInt3775]) {
				this.aClass5_Sub28ArrayArray1[arg2.anInt3774][arg2.anInt3775] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method3186() {
		return this.aClass95_1.method2654();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!mi;)I")
	private int method3187(@OriginalArg(1) Class5_Sub28 arg0) {
		@Pc(14) int local14 = (arg0.anInt3779 * arg0.anInt3769 >> 12) + arg0.anInt3777;
		local14 += (this.anIntArray249[arg0.anInt3774] - 8192) * this.anIntArray246[arg0.anInt3774] >> 12;
		@Pc(35) Class167 local35 = arg0.aClass167_1;
		@Pc(58) int local58;
		if (local35.anInt5041 > 0 && (local35.anInt5043 > 0 || this.anIntArray251[arg0.anInt3774] > 0)) {
			local58 = local35.anInt5043 << 2;
			@Pc(63) int local63 = local35.anInt5035 << 1;
			if (arg0.anInt3780 < local63) {
				local58 = arg0.anInt3780 * local58 / local63;
			}
			local58 += this.anIntArray251[arg0.anInt3774] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt3789 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local97 * (double) local58);
		}
		local58 = (int) ((double) (arg0.aClass5_Sub15_Sub1_1.anInt2152 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static344.anInt1063 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI)V")
	private void method3188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
	@Override
	public synchronized int method4459() {
		return 0;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V")
	private void method3190() {
		@Pc(8) int local8 = this.anInt3476;
		@Pc(16) int local16 = this.anInt3477;
		@Pc(19) long local19 = this.aLong125;
		if (this.aClass5_Sub20_2 != null && local16 == this.anInt3478) {
			this.method3192(this.aClass5_Sub20_2, this.aBoolean247, this.aBoolean248);
			this.method3190();
			return;
		}
		while (local16 == this.anInt3477) {
			while (this.aClass95_1.anIntArray174[local8] == local16) {
				this.aClass95_1.method2648(local8);
				@Pc(52) int local52 = this.aClass95_1.method2646(local8);
				if (local52 == 1) {
					this.aClass95_1.method2641();
					this.aClass95_1.method2647(local8);
					if (this.aClass95_1.method2650()) {
						if (this.aClass5_Sub20_2 != null) {
							this.method3218(this.aBoolean247, this.aClass5_Sub20_2);
							this.method3190();
							return;
						}
						if (!this.aBoolean247 || local16 == 0) {
							this.method3206(true);
							this.aClass95_1.method2652();
							return;
						}
						this.aClass95_1.method2642(local19);
					}
					break;
				}
				if ((local52 & 0x80) != 0) {
					this.method3216(local52);
				}
				this.aClass95_1.method2644(local8);
				this.aClass95_1.method2647(local8);
			}
			local8 = this.aClass95_1.method2653();
			local16 = this.aClass95_1.anIntArray174[local8];
			local19 = this.aClass95_1.method2643(local16);
		}
		this.anInt3477 = local16;
		this.aLong125 = local19;
		this.anInt3476 = local8;
		if (this.aClass5_Sub20_2 != null && local16 > this.anInt3478) {
			this.anInt3476 = -1;
			this.anInt3477 = this.anInt3478;
			this.aLong125 = this.aClass95_1.method2643(this.anInt3477);
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(IZ)V")
	private void method3191(@OriginalArg(0) int arg0) {
		if ((this.anIntArray247[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(20) Class5_Sub28 local20 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5608(); local20 != null; local20 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5603()) {
			if (local20.anInt3774 == arg0) {
				local20.anInt3785 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!ha;ZZ)V")
	private synchronized void method3192(@OriginalArg(1) Class5_Sub20 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method3199(arg2);
		this.aClass95_1.method2649(arg0.aByteArray21);
		this.aLong124 = 0L;
		this.aBoolean247 = arg1;
		@Pc(28) int local28 = this.aClass95_1.method2655();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass95_1.method2648(local30);
			this.aClass95_1.method2644(local30);
			this.aClass95_1.method2647(local30);
		}
		this.anInt3476 = this.aClass95_1.method2653();
		this.anInt3477 = this.aClass95_1.anIntArray174[this.anInt3476];
		this.aLong125 = this.aClass95_1.method2643(this.anInt3477);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
	public synchronized void method3193() {
		this.method3204();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!ha;Lclient!ra;ILclient!dm;)Z")
	public synchronized boolean method3194(@OriginalArg(1) Class5_Sub20 arg0, @OriginalArg(2) Class170 arg1, @OriginalArg(4) Class50 arg2) {
		arg0.method2194();
		@Pc(9) boolean local9 = true;
		@Pc(30) int[] local30 = new int[] { 22050 };
		for (@Pc(36) Class5_Sub25 local36 = (Class5_Sub25) arg0.aClass42_20.method1060(); local36 != null; local36 = (Class5_Sub25) arg0.aClass42_20.method1055()) {
			@Pc(42) int local42 = (int) local36.aLong218;
			@Pc(50) Class5_Sub7 local50 = (Class5_Sub7) this.aClass42_29.method1052((long) local42);
			if (local50 == null) {
				local50 = Static204.method3635(arg1, local42);
				if (local50 == null) {
					local9 = false;
					continue;
				}
				this.aClass42_29.method1050((long) local42, local50);
			}
			if (!local50.method1033(local36.aByteArray42, arg2, local30)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method2195();
		}
		return local9;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(B)I")
	public int method3195() {
		return this.anInt3471;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	private void method3196(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class5_Sub28 local8 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5608(); local8 != null; local8 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5603()) {
			if (arg0 < 0 || local8.anInt3774 == arg0) {
				if (local8.aClass5_Sub17_Sub1_3 != null) {
					local8.aClass5_Sub17_Sub1_3.method2093(Static344.anInt1063 / 100);
					if (local8.aClass5_Sub17_Sub1_3.method2120()) {
						this.aClass5_Sub17_Sub4_1.aClass5_Sub17_Sub3_2.method3547(local8.aClass5_Sub17_Sub1_3);
					}
					local8.method3480();
				}
				if (local8.anInt3783 < 0) {
					this.aClass5_Sub28ArrayArray2[local8.anInt3774][local8.anInt3784] = null;
				}
				local8.method5803();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)V")
	private void method3197(@OriginalArg(1) int arg0) {
		if ((this.anIntArray247[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(25) Class5_Sub28 local25 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5608(); local25 != null; local25 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5603()) {
			if (local25.anInt3774 == arg0 && this.aClass5_Sub28ArrayArray2[arg0][local25.anInt3784] == null && local25.anInt3783 < 0) {
				local25.anInt3783 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4465(@OriginalArg(0) int arg0) {
		if (this.aClass95_1.method2654()) {
			@Pc(14) int local14 = this.anInt3462 * this.aClass95_1.anInt2823 / Static344.anInt1063;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong124;
				if (this.aLong125 - local23 >= 0L) {
					this.aLong124 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong125 + (long) local14 - this.aLong124 - 1L) / (long) local14);
				this.aLong124 += (long) local55 * (long) local14;
				arg0 -= local55;
				this.aClass5_Sub17_Sub4_1.method4465(local55);
				this.method3190();
			} while (this.aClass95_1.method2654());
		}
		this.aClass5_Sub17_Sub4_1.method4465(arg0);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
	private void method3198(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method3198(local12);
			}
			return;
		}
		this.anIntArray259[arg0] = 12800;
		this.anIntArray240[arg0] = 8192;
		this.anIntArray254[arg0] = 16383;
		this.anIntArray249[arg0] = 8192;
		this.anIntArray251[arg0] = 0;
		this.anIntArray244[arg0] = 8192;
		this.method3197(arg0);
		this.method3191(arg0);
		this.anIntArray247[arg0] = 0;
		this.anIntArray258[arg0] = 32767;
		this.anIntArray246[arg0] = 256;
		this.anIntArray239[arg0] = 0;
		this.method3201(8192, arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZB)V")
	private synchronized void method3199(@OriginalArg(0) boolean arg0) {
		this.aClass95_1.method2652();
		this.aClass5_Sub20_2 = null;
		this.method3206(arg0);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
	public synchronized void method3200() {
		for (@Pc(7) Class5_Sub7 local7 = (Class5_Sub7) this.aClass42_29.method1060(); local7 != null; local7 = (Class5_Sub7) this.aClass42_29.method1055()) {
			local7.method5803();
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(III)V")
	private void method3201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray253[arg1] = arg0;
		this.anIntArray255[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZILclient!mi;)V")
	public void method3202(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class5_Sub28 arg1) {
		@Pc(8) int local8 = arg1.aClass5_Sub15_Sub1_1.aByteArray19.length;
		@Pc(36) int local36;
		if (arg0 && arg1.aClass5_Sub15_Sub1_1.aBoolean137) {
			@Pc(47) int local47 = local8 + local8 - arg1.aClass5_Sub15_Sub1_1.anInt2151;
			local8 <<= 0x8;
			local36 = (int) ((long) local47 * (long) this.anIntArray239[arg1.anInt3774] >> 6);
			if (local36 >= local8) {
				arg1.aClass5_Sub17_Sub1_3.method2117();
				local36 = local8 + local8 - local36 - 1;
			}
		} else {
			local36 = (int) ((long) this.anIntArray239[arg1.anInt3774] * (long) local8 >> 6);
		}
		arg1.aClass5_Sub17_Sub1_3.method2102(local36);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "()Lclient!nf;")
	@Override
	public synchronized Class5_Sub17 method4463() {
		return this.aClass5_Sub17_Sub4_1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!mi;)I")
	private int method3203(@OriginalArg(1) Class5_Sub28 arg0) {
		@Pc(15) int local15 = this.anIntArray240[arg0.anInt3774];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt3781) * (-local15 + 16384) + 32 >> 6) : arg0.anInt3781 * local15 + 32 >> 6;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "()Lclient!nf;")
	@Override
	public synchronized Class5_Sub17 method4461() {
		return null;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4464(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass95_1.method2654()) {
			@Pc(18) int local18 = this.anInt3462 * this.aClass95_1.anInt2823 / Static344.anInt1063;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong124;
				if (this.aLong125 - local27 >= 0L) {
					this.aLong124 = local27;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong125 + (long) local18 - this.aLong124 - 1L) / (long) local18);
				this.aLong124 += (long) local56 * (long) local18;
				this.aClass5_Sub17_Sub4_1.method4464(arg0, arg1, local56);
				this.method3190();
				arg2 -= local56;
				arg1 += local56;
			} while (this.aClass95_1.method2654());
		}
		this.aClass5_Sub17_Sub4_1.method4464(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(III)V")
	private void method3204() {
		this.anIntArray250[9] = 128;
		this.anIntArray241[9] = 128;
		this.method3207(128, 9);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)V")
	public synchronized void method3205(@OriginalArg(1) int arg0) {
		this.anInt3471 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(IZ)V")
	private void method3206(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method3196(-1);
		} else {
			this.method3182(-1);
		}
		this.method3198(-1);
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray243[local27] = this.anIntArray250[local27];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray241[local45] = this.anIntArray250[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)V")
	private void method3207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray243[arg1]) {
			this.anIntArray243[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass5_Sub28ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Lclient!mi;I)I")
	private int method3208(@OriginalArg(0) Class5_Sub28 arg0) {
		if (this.anIntArray248[arg0.anInt3774] == 0) {
			return 0;
		}
		@Pc(15) Class167 local15 = arg0.aClass167_1;
		@Pc(31) int local31 = this.anIntArray254[arg0.anInt3774] * this.anIntArray259[arg0.anInt3774] + 4096 >> 13;
		@Pc(39) int local39 = local31 * local31 + 16384 >> 15;
		@Pc(48) int local48 = arg0.anInt3776 * local39 + 16384 >> 15;
		@Pc(57) int local57 = local48 * this.anInt3471 + 128 >> 8;
		local31 = this.anIntArray248[arg0.anInt3774] * local57 + 128 >> 8;
		if (local15.anInt5045 > 0) {
			local31 = (int) ((double) local31 * Math.pow(0.5D, (double) local15.anInt5045 * 1.953125E-5D * (double) arg0.anInt3782) + 0.5D);
		}
		@Pc(99) int local99;
		@Pc(107) int local107;
		@Pc(129) int local129;
		@Pc(141) int local141;
		if (local15.aByteArray73 != null) {
			local99 = arg0.anInt3773;
			local107 = local15.aByteArray73[arg0.anInt3771 + 1];
			if (local15.aByteArray73.length - 2 > arg0.anInt3771) {
				local129 = (local15.aByteArray73[arg0.anInt3771] & 0xFF) << 8;
				local141 = (local15.aByteArray73[arg0.anInt3771 + 2] & 0xFF) << 8;
				local107 += (local99 - local129) * (-local107 + local15.aByteArray73[arg0.anInt3771 + 3]) / (local141 - local129);
			}
			local31 = local31 * local107 + 32 >> 6;
		}
		if (arg0.anInt3783 > 0 && local15.aByteArray72 != null) {
			local99 = arg0.anInt3783;
			local107 = local15.aByteArray72[arg0.anInt3788 + 1];
			if (local15.aByteArray72.length - 2 > arg0.anInt3788) {
				local129 = (local15.aByteArray72[arg0.anInt3788] & 0xFF) << 8;
				local141 = (local15.aByteArray72[arg0.anInt3788 + 2] & 0xFF) << 8;
				local107 += (local99 - local129) * (-local107 + local15.aByteArray72[arg0.anInt3788 - -3]) / (local141 - local129);
			}
			local31 = local31 * local107 + 32 >> 6;
		}
		return local31;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V")
	private void method3211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IIII)V")
	private void method3213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3180(arg1, arg2, 64);
		if ((this.anIntArray247[arg1] & 0x2) != 0) {
			for (@Pc(33) Class5_Sub28 local33 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5601(); local33 != null; local33 = (Class5_Sub28) this.aClass5_Sub17_Sub4_1.aClass211_31.method5604()) {
				if (arg1 == local33.anInt3774 && local33.anInt3783 < 0) {
					this.aClass5_Sub28ArrayArray2[arg1][local33.anInt3784] = null;
					this.aClass5_Sub28ArrayArray2[arg1][arg2] = local33;
					@Pc(68) int local68 = (local33.anInt3769 * local33.anInt3779 >> 12) + local33.anInt3777;
					local33.anInt3777 += arg2 - local33.anInt3784 << 8;
					local33.anInt3779 = 4096;
					local33.anInt3784 = arg2;
					local33.anInt3769 = local68 - local33.anInt3777;
					return;
				}
			}
		}
		@Pc(116) Class5_Sub7 local116 = (Class5_Sub7) this.aClass42_29.method1052((long) this.anIntArray243[arg1]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class5_Sub15_Sub1 local124 = local116.aClass5_Sub15_Sub1Array1[arg2];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class5_Sub28 local131 = new Class5_Sub28();
		local131.aClass5_Sub15_Sub1_1 = local124;
		local131.anInt3774 = arg1;
		local131.aClass5_Sub7_1 = local116;
		local131.aClass167_1 = local116.aClass167Array1[arg2];
		local131.anInt3775 = local116.aByteArray14[arg2];
		local131.anInt3784 = arg2;
		local131.anInt3776 = local116.anInt1179 * arg0 * arg0 * local116.aByteArray13[arg2] + 1024 >> 11;
		local131.anInt3781 = local116.aByteArray15[arg2] & 0xFF;
		local131.anInt3777 = (arg2 << 8) - (local116.aShortArray11[arg2] & 0x7FFF);
		local131.anInt3771 = 0;
		local131.anInt3783 = -1;
		local131.anInt3773 = 0;
		local131.anInt3782 = 0;
		local131.anInt3788 = 0;
		if (this.anIntArray239[arg1] == 0) {
			local131.aClass5_Sub17_Sub1_3 = Static361.method2109(local124, this.method3187(local131), this.method3208(local131), this.method3203(local131));
		} else {
			local131.aClass5_Sub17_Sub1_3 = Static361.method2109(local124, this.method3187(local131), 0, this.method3203(local131));
			this.method3202(local116.aShortArray11[arg2] < 0, local131);
		}
		if (local116.aShortArray11[arg2] < 0) {
			local131.aClass5_Sub17_Sub1_3.method2121(-1);
		}
		if (local131.anInt3775 >= 0) {
			@Pc(285) Class5_Sub28 local285 = this.aClass5_Sub28ArrayArray1[arg1][local131.anInt3775];
			if (local285 != null && local285.anInt3783 < 0) {
				this.aClass5_Sub28ArrayArray2[arg1][local285.anInt3784] = null;
				local285.anInt3783 = 0;
			}
			this.aClass5_Sub28ArrayArray1[arg1][local131.anInt3775] = local131;
		}
		this.aClass5_Sub17_Sub4_1.aClass211_31.method5609(local131);
		this.aClass5_Sub28ArrayArray2[arg1][arg2] = local131;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BII)V")
	private synchronized void method3214() {
		for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
			this.anIntArray248[local16] = 256;
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(III)V")
	private void method3215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray249[arg0] = arg1;
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(II)V")
	private void method3216(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method3180(local16, local22, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method3213(local28, local16, local22);
			} else {
				this.method3180(local16, local22, 64);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method3211(local28, local16, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray241[local16] = (local28 << 14) + (this.anIntArray241[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray241[local16] = (local28 << 7) + (this.anIntArray241[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray251[local16] = (this.anIntArray251[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray251[local16] = (this.anIntArray251[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray244[local16] = (this.anIntArray244[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray244[local16] = local28 + (this.anIntArray244[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray259[local16] = (this.anIntArray259[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray259[local16] = (this.anIntArray259[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray240[local16] = (local28 << 7) + (this.anIntArray240[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray240[local16] = local28 + (this.anIntArray240[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray254[local16] = (this.anIntArray254[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray254[local16] = (this.anIntArray254[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray247[local16] |= 0x1;
				} else {
					this.anIntArray247[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method3197(local16);
					this.anIntArray247[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray247[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray258[local16] = (this.anIntArray258[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray258[local16] = (this.anIntArray258[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray258[local16] = (this.anIntArray258[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray258[local16] = (this.anIntArray258[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method3196(local16);
			}
			if (local22 == 121) {
				this.method3198(local16);
			}
			if (local22 == 123) {
				this.method3182(local16);
			}
			@Pc(505) int local505;
			if (local22 == 6) {
				local505 = this.anIntArray258[local16];
				if (local505 == 16384) {
					this.anIntArray246[local16] = (local28 << 7) + (this.anIntArray246[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local505 = this.anIntArray258[local16];
				if (local505 == 16384) {
					this.anIntArray246[local16] = local28 + (this.anIntArray246[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray239[local16] = (this.anIntArray239[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray239[local16] = local28 + (this.anIntArray239[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray247[local16] |= 0x4;
				} else {
					this.method3191(local16);
					this.anIntArray247[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method3201((this.anIntArray253[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method3201((this.anIntArray253[local16] & 0xFFFFFF80) + local28, local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method3207(local22 + this.anIntArray241[local16], local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method3188(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method3215(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method3206(true);
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(B)V")
	public synchronized void method3217() {
		for (@Pc(11) Class5_Sub7 local11 = (Class5_Sub7) this.aClass42_29.method1060(); local11 != null; local11 = (Class5_Sub7) this.aClass42_29.method1055()) {
			local11.method1031();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BZLclient!ha;)V")
	public synchronized void method3218(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub20 arg1) {
		this.method3192(arg1, arg0, true);
	}
}
