import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class4_Sub3_Sub4 extends Class4_Sub3 {

	@OriginalMember(owner = "client!qq", name = "Db", descriptor = "J")
	private long aLong233;

	@OriginalMember(owner = "client!qq", name = "Fb", descriptor = "I")
	private int anInt7819;

	@OriginalMember(owner = "client!qq", name = "Gb", descriptor = "Z")
	private boolean aBoolean609;

	@OriginalMember(owner = "client!qq", name = "Hb", descriptor = "J")
	private long aLong234;

	@OriginalMember(owner = "client!qq", name = "Jb", descriptor = "I")
	private int anInt7820;

	@OriginalMember(owner = "client!qq", name = "Kb", descriptor = "I")
	private int anInt7821;

	@OriginalMember(owner = "client!qq", name = "Lb", descriptor = "Z")
	private boolean aBoolean610;

	@OriginalMember(owner = "client!qq", name = "Mb", descriptor = "Lclient!qo;")
	private Class4_Sub43 aClass4_Sub43_3;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "[I")
	private final int[] anIntArray521 = new int[16];

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "[I")
	private final int[] anIntArray524 = new int[16];

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "[I")
	private final int[] anIntArray520 = new int[16];

	@OriginalMember(owner = "client!qq", name = "Y", descriptor = "[[Lclient!qm;")
	private final Class4_Sub42[][] aClass4_Sub42ArrayArray2 = new Class4_Sub42[16][128];

	@OriginalMember(owner = "client!qq", name = "C", descriptor = "[I")
	private final int[] anIntArray526 = new int[16];

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "[[Lclient!qm;")
	private final Class4_Sub42[][] aClass4_Sub42ArrayArray1 = new Class4_Sub42[16][128];

	@OriginalMember(owner = "client!qq", name = "Z", descriptor = "[I")
	private final int[] anIntArray530 = new int[16];

	@OriginalMember(owner = "client!qq", name = "ob", descriptor = "[I")
	private final int[] anIntArray531 = new int[16];

	@OriginalMember(owner = "client!qq", name = "pb", descriptor = "[I")
	private final int[] anIntArray532 = new int[16];

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "[I")
	public final int[] anIntArray525 = new int[16];

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "[I")
	private final int[] anIntArray529 = new int[16];

	@OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
	private int anInt7787 = 256;

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "[I")
	private final int[] anIntArray523 = new int[16];

	@OriginalMember(owner = "client!qq", name = "yb", descriptor = "[I")
	private final int[] anIntArray535 = new int[16];

	@OriginalMember(owner = "client!qq", name = "ub", descriptor = "[I")
	public final int[] anIntArray533 = new int[16];

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
	private final int anInt7786 = 1000000;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "[I")
	public final int[] anIntArray522 = new int[16];

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "[I")
	private final int[] anIntArray528 = new int[16];

	@OriginalMember(owner = "client!qq", name = "xb", descriptor = "[I")
	private final int[] anIntArray534 = new int[16];

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "[I")
	private final int[] anIntArray527 = new int[16];

	@OriginalMember(owner = "client!qq", name = "P", descriptor = "Lclient!fp;")
	private final Class122 aClass122_1 = new Class122();

	@OriginalMember(owner = "client!qq", name = "Ib", descriptor = "Lclient!ag;")
	private final Class4_Sub3_Sub1 aClass4_Sub3_Sub1_1 = new Class4_Sub3_Sub1(this);

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "Lclient!dj;")
	private final Class66 aClass66_37;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub4() {
		this.aClass66_37 = new Class66(128);
		this.method6780(256, -1);
		this.method6759(true);
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!qq;)V")
	public Class4_Sub3_Sub4(@OriginalArg(0) Class4_Sub3_Sub4 arg0) {
		this.aClass66_37 = arg0.aClass66_37;
		this.method6780(256, -1);
		this.method6759(true);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
	private void method6750(@OriginalArg(1) int arg0) {
		for (@Pc(17) Class4_Sub42 local17 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3639(); local17 != null; local17 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3640()) {
			if (arg0 < 0 || arg0 == local17.anInt7740) {
				if (local17.aClass4_Sub3_Sub3_4 != null) {
					local17.aClass4_Sub3_Sub3_4.method6018(Static434.anInt6851 / 100);
					if (local17.aClass4_Sub3_Sub3_4.method6019()) {
						this.aClass4_Sub3_Sub1_1.aClass4_Sub3_Sub5_1.method7724(local17.aClass4_Sub3_Sub3_4);
					}
					local17.method6710();
				}
				if (local17.anInt7734 < 0) {
					this.aClass4_Sub42ArrayArray1[local17.anInt7740][local17.anInt7730] = null;
				}
				local17.method9000();
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)Z")
	public synchronized boolean method6751() {
		return this.aClass122_1.method2821();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLclient!qm;)I")
	private int method6752(@OriginalArg(1) Class4_Sub42 arg0) {
		if (this.anIntArray520[arg0.anInt7740] == 0) {
			return 0;
		}
		@Pc(14) Class186 local14 = arg0.aClass186_1;
		@Pc(30) int local30 = this.anIntArray529[arg0.anInt7740] * this.anIntArray530[arg0.anInt7740] + 4096 >> 13;
		@Pc(46) int local46 = local30 * local30 + 16384 >> 15;
		@Pc(55) int local55 = arg0.anInt7737 * local46 + 16384 >> 15;
		@Pc(64) int local64 = this.anInt7787 * local55 + 128 >> 8;
		local30 = local64 * this.anIntArray520[arg0.anInt7740] + 128 >> 8;
		if (local14.anInt4593 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) local14.anInt4593 * 1.953125E-5D * (double) arg0.anInt7738) + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local14.aByteArray52 != null) {
			local106 = arg0.anInt7736;
			local114 = local14.aByteArray52[arg0.anInt7729 + 1];
			if (local14.aByteArray52.length - 2 > arg0.anInt7729) {
				local136 = (local14.aByteArray52[arg0.anInt7729] & 0xFF) << 8;
				local148 = (local14.aByteArray52[arg0.anInt7729 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (local14.aByteArray52[arg0.anInt7729 + 3] + -local114) / (local148 - local136);
			}
			local30 = local30 * local114 + 32 >> 6;
		}
		if (arg0.anInt7734 > 0 && local14.aByteArray51 != null) {
			local106 = arg0.anInt7734;
			local114 = local14.aByteArray51[arg0.anInt7725 + 1];
			if (arg0.anInt7725 < local14.aByteArray51.length - 2) {
				local136 = (local14.aByteArray51[arg0.anInt7725] & 0xFF) << 8;
				local148 = (local14.aByteArray51[arg0.anInt7725 + 2] & 0xFF) << 8;
				local114 += (local14.aByteArray51[arg0.anInt7725 + 3] - local114) * (local106 + -local136) / (local148 - local136);
			}
			local30 = local114 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7715(@OriginalArg(0) int arg0) {
		if (this.aClass122_1.method2821()) {
			@Pc(14) int local14 = this.aClass122_1.anInt3010 * this.anInt7786 / Static434.anInt6851;
			do {
				@Pc(24) long local24 = this.aLong234 + (long) arg0 * (long) local14;
				if (this.aLong233 - local24 >= 0L) {
					this.aLong234 = local24;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong233 - this.aLong234 - 1L) / (long) local14);
				this.aLong234 += (long) local14 * (long) local54;
				this.aClass4_Sub3_Sub1_1.method7715(local54);
				arg0 -= local54;
				this.method6760();
			} while (this.aClass122_1.method2821());
		}
		this.aClass4_Sub3_Sub1_1.method7715(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)V")
	private void method6753(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class4_Sub42 local16 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3639(); local16 != null; local16 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3640()) {
			if ((arg0 < 0 || arg0 == local16.anInt7740) && local16.anInt7734 < 0) {
				this.aClass4_Sub42ArrayArray1[local16.anInt7740][local16.anInt7730] = null;
				local16.anInt7734 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!qm;)I")
	private int method6754(@OriginalArg(1) Class4_Sub42 arg0) {
		@Pc(14) int local14 = (arg0.anInt7723 * arg0.anInt7732 >> 12) + arg0.anInt7722;
		local14 += (this.anIntArray524[arg0.anInt7740] - 8192) * this.anIntArray531[arg0.anInt7740] >> 12;
		@Pc(35) Class186 local35 = arg0.aClass186_1;
		@Pc(55) int local55;
		if (local35.anInt4592 > 0 && (local35.anInt4590 > 0 || this.anIntArray521[arg0.anInt7740] > 0)) {
			local55 = local35.anInt4590 << 2;
			@Pc(60) int local60 = local35.anInt4594 << 1;
			if (arg0.anInt7731 < local60) {
				local55 = arg0.anInt7731 * local55 / local60;
			}
			local55 += this.anIntArray521[arg0.anInt7740] >> 7;
			@Pc(90) double local90 = Math.sin((double) (arg0.anInt7735 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local90 * (double) local55);
		}
		local55 = (int) ((double) (arg0.aClass4_Sub4_Sub1_4.anInt193 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static434.anInt6851 + 0.5D);
		return local55 >= 1 ? local55 : 1;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZZLclient!qo;Z)V")
	private synchronized void method6755(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub43 arg1, @OriginalArg(3) boolean arg2) {
		this.method6771(arg2);
		this.aClass122_1.method2811(arg1.aByteArray73);
		this.aBoolean609 = arg0;
		this.aLong234 = 0L;
		@Pc(30) int local30 = this.aClass122_1.method2813();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			this.aClass122_1.method2810(local32);
			this.aClass122_1.method2820(local32);
			this.aClass122_1.method2822(local32);
		}
		this.anInt7820 = this.aClass122_1.method2815();
		this.anInt7819 = this.aClass122_1.anIntArray217[this.anInt7820];
		this.aLong233 = this.aClass122_1.method2817(this.anInt7819);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)V")
	private void method6756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray524[arg0] = arg1;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIII)V")
	private void method6757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub42 local12 = this.aClass4_Sub42ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass4_Sub42ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray525[arg0] & 0x2) == 0) {
			local12.anInt7734 = 0;
			return;
		}
		for (@Pc(47) Class4_Sub42 local47 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3639(); local47 != null; local47 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3640()) {
			if (local12.anInt7740 == local47.anInt7740 && local47.anInt7734 < 0 && local47 != local12) {
				local12.anInt7734 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIZ)V")
	private void method6758() {
		this.anIntArray527[9] = 128;
		this.anIntArray528[9] = 128;
		this.method6781(128, 9);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZ)V")
	private void method6759(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method6750(-1);
		} else {
			this.method6753(-1);
		}
		this.method6772(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray534[local29] = this.anIntArray527[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray528[local45] = this.anIntArray527[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
	private void method6760() {
		@Pc(8) int local8 = this.anInt7820;
		@Pc(11) int local11 = this.anInt7819;
		@Pc(14) long local14 = this.aLong233;
		if (this.aClass4_Sub43_3 != null && local11 == this.anInt7821) {
			this.method6755(this.aBoolean609, this.aClass4_Sub43_3, this.aBoolean610);
			this.method6760();
			return;
		}
		while (local11 == this.anInt7819) {
			while (local11 == this.aClass122_1.anIntArray217[local8]) {
				this.aClass122_1.method2810(local8);
				@Pc(50) int local50 = this.aClass122_1.method2809(local8);
				if (local50 == 1) {
					this.aClass122_1.method2823();
					this.aClass122_1.method2822(local8);
					if (this.aClass122_1.method2824()) {
						if (this.aClass4_Sub43_3 != null) {
							this.method6769(this.aBoolean609, this.aClass4_Sub43_3);
							this.method6760();
							return;
						}
						if (!this.aBoolean609 || local11 == 0) {
							this.method6759(true);
							this.aClass122_1.method2812();
							return;
						}
						this.aClass122_1.method2819(local14);
					}
					break;
				}
				if ((local50 & 0x80) != 0) {
					this.method6782(local50);
				}
				this.aClass122_1.method2820(local8);
				this.aClass122_1.method2822(local8);
			}
			local8 = this.aClass122_1.method2815();
			local11 = this.aClass122_1.anIntArray217[local8];
			local14 = this.aClass122_1.method2817(local11);
		}
		this.aLong233 = local14;
		this.anInt7819 = local11;
		this.anInt7820 = local8;
		if (this.aClass4_Sub43_3 != null && local11 > this.anInt7821) {
			this.anInt7820 = -1;
			this.anInt7819 = this.anInt7821;
			this.aLong233 = this.aClass122_1.method2817(this.anInt7819);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)V")
	private void method6761(@OriginalArg(0) int arg0) {
		if ((this.anIntArray525[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub42 local18 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3639(); local18 != null; local18 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3640()) {
			if (local18.anInt7740 == arg0) {
				local18.anInt7733 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(BLclient!qm;)Z")
	public boolean method6762(@OriginalArg(1) Class4_Sub42 arg0) {
		if (arg0.aClass4_Sub3_Sub3_4 != null) {
			return false;
		}
		if (arg0.anInt7734 >= 0) {
			arg0.method9000();
			if (arg0.anInt7724 > 0 && this.aClass4_Sub42ArrayArray2[arg0.anInt7740][arg0.anInt7724] == arg0) {
				this.aClass4_Sub42ArrayArray2[arg0.anInt7740][arg0.anInt7724] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!pl;Lclient!bt;BLclient!qo;I)Z")
	public synchronized boolean method6763(@OriginalArg(0) Class287 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) Class4_Sub43 arg2) {
		arg2.method6725();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class4_Sub47 local29 = (Class4_Sub47) arg2.aClass66_36.method1992(); local29 != null; local29 = (Class4_Sub47) arg2.aClass66_36.method1984()) {
			@Pc(35) int local35 = (int) local29.aLong307;
			@Pc(43) Class4_Sub49 local43 = (Class4_Sub49) this.aClass66_37.method1994((long) local35);
			if (local43 == null) {
				local43 = Static176.method2867(arg1, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass66_37.method1985(local43, (long) local35);
			}
			if (!local43.method7950(local23, arg0, local29.aByteArray96)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method6726();
		}
		return local9;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "()I")
	@Override
	public synchronized int method7714() {
		return 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)V")
	private void method6764(@OriginalArg(1) int arg0) {
		if ((this.anIntArray525[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class4_Sub42 local22 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3639(); local22 != null; local22 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3640()) {
			if (arg0 == local22.anInt7740 && this.aClass4_Sub42ArrayArray1[arg0][local22.anInt7730] == null && local22.anInt7734 < 0) {
				local22.anInt7734 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(JZBLclient!qo;Z)V")
	public synchronized void method6765(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class4_Sub43 arg2) {
		this.method6755(arg1, arg2, true);
		this.method6770(arg0 * (long) this.aClass122_1.anInt3010);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
	public int method6768() {
		return this.anInt7787;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZLclient!qo;I)V")
	public synchronized void method6769(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub43 arg1) {
		this.method6755(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7718(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass122_1.method2821()) {
			@Pc(18) int local18 = this.aClass122_1.anInt3010 * this.anInt7786 / Static434.anInt6851;
			do {
				@Pc(28) long local28 = this.aLong234 + (long) local18 * (long) arg2;
				if (this.aLong233 - local28 >= 0L) {
					this.aLong234 = local28;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong233 + (long) local18 - this.aLong234 - 1L) / (long) local18);
				this.aLong234 += (long) local58 * (long) local18;
				this.aClass4_Sub3_Sub1_1.method7718(arg0, arg1, local58);
				arg1 += local58;
				this.method6760();
				arg2 -= local58;
			} while (this.aClass122_1.method2821());
		}
		this.aClass4_Sub3_Sub1_1.method7718(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(JI)V")
	private void method6770(@OriginalArg(0) long arg0) {
		while (arg0 >= this.aLong233) {
			@Pc(18) int local18 = this.anInt7820;
			@Pc(21) int local21 = this.anInt7819;
			@Pc(24) long local24 = this.aLong233;
			while (local21 == this.anInt7819) {
				while (this.aClass122_1.anIntArray217[local18] == local21) {
					this.aClass122_1.method2810(local18);
					@Pc(35) int local35 = this.aClass122_1.method2809(local18);
					if (local35 == 1) {
						this.aClass122_1.method2823();
						this.aClass122_1.method2822(local18);
						if (this.aClass122_1.method2824()) {
							if (!this.aBoolean609 || local21 == 0) {
								this.method6759(true);
								this.aClass122_1.method2812();
								return;
							}
							this.aClass122_1.method2819(local24);
						}
						break;
					}
					if ((local35 & 0x80) != 0 && (local35 & 0xF0) != 144) {
						this.method6782(local35);
					}
					this.aClass122_1.method2820(local18);
					this.aClass122_1.method2822(local18);
				}
				this.aLong234 = local24;
				local18 = this.aClass122_1.method2815();
				local21 = this.aClass122_1.anIntArray217[local18];
				local24 = this.aClass122_1.method2817(local21);
			}
			this.aLong233 = local24;
			this.anInt7819 = local21;
			this.anInt7820 = local18;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BZ)V")
	private synchronized void method6771(@OriginalArg(1) boolean arg0) {
		this.aClass122_1.method2812();
		this.aClass4_Sub43_3 = null;
		this.method6759(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)V")
	private void method6772(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method6772(local9);
			}
			return;
		}
		this.anIntArray530[arg0] = 12800;
		this.anIntArray523[arg0] = 8192;
		this.anIntArray529[arg0] = 16383;
		this.anIntArray524[arg0] = 8192;
		this.anIntArray521[arg0] = 0;
		this.anIntArray526[arg0] = 8192;
		this.method6764(arg0);
		this.method6761(arg0);
		this.anIntArray525[arg0] = 0;
		this.anIntArray532[arg0] = 32767;
		this.anIntArray531[arg0] = 256;
		this.anIntArray533[arg0] = 0;
		this.method6788(arg0, 8192);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
	public synchronized void method6773() {
		for (@Pc(19) Class4_Sub49 local19 = (Class4_Sub49) this.aClass66_37.method1992(); local19 != null; local19 = (Class4_Sub49) this.aClass66_37.method1984()) {
			local19.method9000();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[ILclient!qm;)Z")
	public boolean method6775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class4_Sub42 arg3) {
		arg3.anInt7726 = Static434.anInt6851 / 100;
		if (arg3.anInt7734 >= 0 && (arg3.aClass4_Sub3_Sub3_4 == null || arg3.aClass4_Sub3_Sub3_4.method6017())) {
			arg3.method6710();
			arg3.method9000();
			if (arg3.anInt7724 > 0 && this.aClass4_Sub42ArrayArray2[arg3.anInt7740][arg3.anInt7724] == arg3) {
				this.aClass4_Sub42ArrayArray2[arg3.anInt7740][arg3.anInt7724] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt7723;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray526[arg3.anInt7740] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt7723 = local56;
		}
		arg3.aClass4_Sub3_Sub3_4.method6006(this.method6754(arg3));
		@Pc(96) Class186 local96 = arg3.aClass186_1;
		arg3.anInt7731++;
		arg3.anInt7735 += local96.anInt4592;
		@Pc(111) boolean local111 = false;
		@Pc(129) double local129 = (double) ((arg3.anInt7732 * arg3.anInt7723 >> 12) + (arg3.anInt7730 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt4593 > 0) {
			if (local96.anInt4591 > 0) {
				arg3.anInt7738 += (int) (Math.pow(2.0D, (double) local96.anInt4591 * local129) * 128.0D + 0.5D);
			} else {
				arg3.anInt7738 += 128;
			}
			if (arg3.anInt7738 * local96.anInt4593 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray52 != null) {
			if (local96.anInt4597 <= 0) {
				arg3.anInt7736 += 128;
			} else {
				arg3.anInt7736 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt4597) * 128.0D + 0.5D);
			}
			while (arg3.anInt7729 < local96.aByteArray52.length - 2 && (local96.aByteArray52[arg3.anInt7729 + 2] & 0xFF) << 8 < arg3.anInt7736) {
				arg3.anInt7729 += 2;
			}
			if (arg3.anInt7729 == local96.aByteArray52.length - 2 && local96.aByteArray52[arg3.anInt7729 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg3.anInt7734 >= 0 && local96.aByteArray51 != null && (this.anIntArray525[arg3.anInt7740] & 0x1) == 0 && (arg3.anInt7724 < 0 || arg3 != this.aClass4_Sub42ArrayArray2[arg3.anInt7740][arg3.anInt7724])) {
			if (local96.anInt4598 > 0) {
				arg3.anInt7734 += (int) (Math.pow(2.0D, (double) local96.anInt4598 * local129) * 128.0D + 0.5D);
			} else {
				arg3.anInt7734 += 128;
			}
			while (local96.aByteArray51.length - 2 > arg3.anInt7725 && arg3.anInt7734 > (local96.aByteArray51[arg3.anInt7725 + 2] & 0xFF) << 8) {
				arg3.anInt7725 += 2;
			}
			if (arg3.anInt7725 == local96.aByteArray51.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg3.aClass4_Sub3_Sub3_4.method5991(arg3.anInt7726, this.method6752(arg3), this.method6779(arg3));
			return false;
		}
		arg3.aClass4_Sub3_Sub3_4.method6018(arg3.anInt7726);
		if (arg2 == null) {
			arg3.aClass4_Sub3_Sub3_4.method7715(arg0);
		} else {
			arg3.aClass4_Sub3_Sub3_4.method7718(arg2, arg1, arg0);
		}
		if (arg3.aClass4_Sub3_Sub3_4.method6019()) {
			this.aClass4_Sub3_Sub1_1.aClass4_Sub3_Sub5_1.method7724(arg3.aClass4_Sub3_Sub3_4);
		}
		arg3.method6710();
		if (arg3.anInt7734 >= 0) {
			arg3.method9000();
			if (arg3.anInt7724 > 0 && arg3 == this.aClass4_Sub42ArrayArray2[arg3.anInt7740][arg3.anInt7724]) {
				this.aClass4_Sub42ArrayArray2[arg3.anInt7740][arg3.anInt7724] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(III)V")
	private void method6776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!qm;BZ)V")
	public void method6777(@OriginalArg(0) Class4_Sub42 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass4_Sub4_Sub1_4.aByteArray1.length;
		@Pc(31) int local31;
		if (arg1 && arg0.aClass4_Sub4_Sub1_4.aBoolean17) {
			@Pc(41) int local41 = local8 + local8 - arg0.aClass4_Sub4_Sub1_4.anInt194;
			local31 = (int) ((long) this.anIntArray533[arg0.anInt7740] * (long) local41 >> 6);
			local8 <<= 0x8;
			if (local8 <= local31) {
				local31 = local8 + local8 - local31 - 1;
				arg0.aClass4_Sub3_Sub3_4.method6008();
			}
		} else {
			local31 = (int) ((long) this.anIntArray533[arg0.anInt7740] * (long) local8 >> 6);
		}
		arg0.aClass4_Sub3_Sub3_4.method5989(local31);
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
	public synchronized void method6778() {
		for (@Pc(16) Class4_Sub49 local16 = (Class4_Sub49) this.aClass66_37.method1992(); local16 != null; local16 = (Class4_Sub49) this.aClass66_37.method1984()) {
			local16.method7954();
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(ILclient!qm;)I")
	private int method6779(@OriginalArg(1) Class4_Sub42 arg0) {
		@Pc(15) int local15 = this.anIntArray523[arg0.anInt7740];
		return local15 >= 8192 ? 16384 - ((16384 - local15) * (128 - arg0.anInt7739) + 32 >> 6) : local15 * arg0.anInt7739 + 32 >> 6;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(III)V")
	public synchronized void method6780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray520[arg1] = arg0;
		} else {
			for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
				this.anIntArray520[local15] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "()Lclient!oia;")
	@Override
	public synchronized Class4_Sub3 method7719() {
		return this.aClass4_Sub3_Sub1_1;
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(III)V")
	private void method6781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray534[arg1]) {
			this.anIntArray534[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass4_Sub42ArrayArray2[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(II)V")
	private void method6782(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method6757(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method6783(local18, local30, local24);
			} else {
				this.method6757(local18, local24, 64);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method6784(local24, local18, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray528[local18] = (local30 << 14) + (this.anIntArray528[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray528[local18] = (this.anIntArray528[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray521[local18] = (this.anIntArray521[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray521[local18] = local30 + (this.anIntArray521[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray526[local18] = (this.anIntArray526[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray526[local18] = local30 + (this.anIntArray526[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray530[local18] = (local30 << 7) + (this.anIntArray530[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray530[local18] = (this.anIntArray530[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray523[local18] = (local30 << 7) + (this.anIntArray523[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray523[local18] = (this.anIntArray523[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray529[local18] = (this.anIntArray529[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray529[local18] = (this.anIntArray529[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray525[local18] |= 0x1;
				} else {
					this.anIntArray525[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray525[local18] |= 0x2;
				} else {
					this.method6764(local18);
					this.anIntArray525[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray532[local18] = (local30 << 7) + (this.anIntArray532[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray532[local18] = (this.anIntArray532[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray532[local18] = (local30 << 7) + (this.anIntArray532[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray532[local18] = local30 + (this.anIntArray532[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method6750(local18);
			}
			if (local24 == 121) {
				this.method6772(local18);
			}
			if (local24 == 123) {
				this.method6753(local18);
			}
			@Pc(497) int local497;
			if (local24 == 6) {
				local497 = this.anIntArray532[local18];
				if (local497 == 16384) {
					this.anIntArray531[local18] = (this.anIntArray531[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local497 = this.anIntArray532[local18];
				if (local497 == 16384) {
					this.anIntArray531[local18] = local30 + (this.anIntArray531[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray533[local18] = (local30 << 7) + (this.anIntArray533[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray533[local18] = local30 + (this.anIntArray533[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method6761(local18);
					this.anIntArray525[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray525[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method6788(local18, (local30 << 7) + (this.anIntArray535[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method6788(local18, (this.anIntArray535[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method6781(this.anIntArray528[local18] + local24, local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method6776(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method6756(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method6759(true);
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZII)V")
	private void method6783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6757(arg0, arg2, 64);
		if ((this.anIntArray525[arg0] & 0x2) != 0) {
			for (@Pc(28) Class4_Sub42 local28 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3648(); local28 != null; local28 = (Class4_Sub42) this.aClass4_Sub3_Sub1_1.aClass163_3.method3651()) {
				if (local28.anInt7740 == arg0 && local28.anInt7734 < 0) {
					this.aClass4_Sub42ArrayArray1[arg0][local28.anInt7730] = null;
					this.aClass4_Sub42ArrayArray1[arg0][arg2] = local28;
					@Pc(66) int local66 = (local28.anInt7732 * local28.anInt7723 >> 12) + local28.anInt7722;
					local28.anInt7722 += arg2 - local28.anInt7730 << 8;
					local28.anInt7730 = arg2;
					local28.anInt7723 = 4096;
					local28.anInt7732 = local66 - local28.anInt7722;
					return;
				}
			}
		}
		@Pc(111) Class4_Sub49 local111 = (Class4_Sub49) this.aClass66_37.method1994((long) this.anIntArray534[arg0]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class4_Sub4_Sub1 local119 = local111.aClass4_Sub4_Sub1Array1[arg2];
		if (local119 == null) {
			return;
		}
		@Pc(126) Class4_Sub42 local126 = new Class4_Sub42();
		local126.aClass4_Sub49_1 = local111;
		local126.aClass4_Sub4_Sub1_4 = local119;
		local126.anInt7740 = arg0;
		local126.aClass186_1 = local111.aClass186Array1[arg2];
		local126.anInt7724 = local111.aByteArray99[arg2];
		local126.anInt7730 = arg2;
		local126.anInt7737 = local111.aByteArray100[arg2] * local111.anInt9313 * arg1 * arg1 + 1024 >> 11;
		local126.anInt7739 = local111.aByteArray98[arg2] & 0xFF;
		local126.anInt7722 = (arg2 << 8) - (local111.aShortArray154[arg2] & 0x7FFF);
		local126.anInt7734 = -1;
		local126.anInt7729 = 0;
		local126.anInt7738 = 0;
		local126.anInt7725 = 0;
		local126.anInt7736 = 0;
		if (this.anIntArray533[arg0] == 0) {
			local126.aClass4_Sub3_Sub3_4 = Static683.method5994(local119, this.method6754(local126), this.method6752(local126), this.method6779(local126));
		} else {
			local126.aClass4_Sub3_Sub3_4 = Static683.method5994(local119, this.method6754(local126), 0, this.method6779(local126));
			this.method6777(local126, local111.aShortArray154[arg2] < 0);
		}
		if (local111.aShortArray154[arg2] < 0) {
			local126.aClass4_Sub3_Sub3_4.method6015(-1);
		}
		if (local126.anInt7724 >= 0) {
			@Pc(278) Class4_Sub42 local278 = this.aClass4_Sub42ArrayArray2[arg0][local126.anInt7724];
			if (local278 != null && local278.anInt7734 < 0) {
				this.aClass4_Sub42ArrayArray1[arg0][local278.anInt7730] = null;
				local278.anInt7734 = 0;
			}
			this.aClass4_Sub42ArrayArray2[arg0][local126.anInt7724] = local126;
		}
		this.aClass4_Sub3_Sub1_1.aClass163_3.method3646(local126);
		this.aClass4_Sub42ArrayArray1[arg0][arg2] = local126;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII)V")
	private void method6784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V")
	public synchronized void method6785() {
		this.method6771(true);
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(III)V")
	public synchronized void method6786() {
		this.method6758();
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(II)V")
	public synchronized void method6787(@OriginalArg(0) int arg0) {
		this.anInt7787 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "()Lclient!oia;")
	@Override
	public synchronized Class4_Sub3 method7720() {
		return null;
	}

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(III)V")
	private void method6788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray535[arg0] = arg1;
		this.anIntArray522[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}
}
