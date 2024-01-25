import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tm", name = "Hb", descriptor = "Z")
	private boolean aBoolean414;

	@OriginalMember(owner = "client!tm", name = "Ib", descriptor = "I")
	private int anInt6060;

	@OriginalMember(owner = "client!tm", name = "Jb", descriptor = "I")
	private int anInt6061;

	@OriginalMember(owner = "client!tm", name = "Kb", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!tm", name = "Lb", descriptor = "J")
	private long aLong189;

	@OriginalMember(owner = "client!tm", name = "Nb", descriptor = "I")
	private int anInt6062;

	@OriginalMember(owner = "client!tm", name = "Ob", descriptor = "Lclient!hg;")
	private Class3_Sub23 aClass3_Sub23_1;

	@OriginalMember(owner = "client!tm", name = "Pb", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!tm", name = "z", descriptor = "[[Lclient!ko;")
	private final Class3_Sub28[][] aClass3_Sub28ArrayArray1 = new Class3_Sub28[16][128];

	@OriginalMember(owner = "client!tm", name = "I", descriptor = "[I")
	private final int[] anIntArray491 = new int[16];

	@OriginalMember(owner = "client!tm", name = "eb", descriptor = "[I")
	private final int[] anIntArray495 = new int[16];

	@OriginalMember(owner = "client!tm", name = "jb", descriptor = "[I")
	public final int[] anIntArray498 = new int[16];

	@OriginalMember(owner = "client!tm", name = "T", descriptor = "I")
	private final int anInt6036 = 1000000;

	@OriginalMember(owner = "client!tm", name = "D", descriptor = "[[Lclient!ko;")
	private final Class3_Sub28[][] aClass3_Sub28ArrayArray2 = new Class3_Sub28[16][128];

	@OriginalMember(owner = "client!tm", name = "ob", descriptor = "[I")
	private final int[] anIntArray500 = new int[16];

	@OriginalMember(owner = "client!tm", name = "pb", descriptor = "[I")
	private final int[] anIntArray501 = new int[16];

	@OriginalMember(owner = "client!tm", name = "Y", descriptor = "[I")
	private final int[] anIntArray494 = new int[16];

	@OriginalMember(owner = "client!tm", name = "S", descriptor = "[I")
	public final int[] anIntArray492 = new int[16];

	@OriginalMember(owner = "client!tm", name = "kb", descriptor = "[I")
	private final int[] anIntArray499 = new int[16];

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
	private int anInt6019 = 256;

	@OriginalMember(owner = "client!tm", name = "gb", descriptor = "[I")
	private final int[] anIntArray496 = new int[16];

	@OriginalMember(owner = "client!tm", name = "xb", descriptor = "[I")
	private final int[] anIntArray502 = new int[16];

	@OriginalMember(owner = "client!tm", name = "Bb", descriptor = "[I")
	private final int[] anIntArray503 = new int[16];

	@OriginalMember(owner = "client!tm", name = "ib", descriptor = "[I")
	private final int[] anIntArray497 = new int[16];

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "[I")
	private final int[] anIntArray490 = new int[16];

	@OriginalMember(owner = "client!tm", name = "Gb", descriptor = "[I")
	public final int[] anIntArray505 = new int[16];

	@OriginalMember(owner = "client!tm", name = "X", descriptor = "[I")
	private final int[] anIntArray493 = new int[16];

	@OriginalMember(owner = "client!tm", name = "Fb", descriptor = "[I")
	private final int[] anIntArray504 = new int[16];

	@OriginalMember(owner = "client!tm", name = "V", descriptor = "Lclient!e;")
	private final Class51 aClass51_1 = new Class51();

	@OriginalMember(owner = "client!tm", name = "Mb", descriptor = "Lclient!af;")
	private final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_1 = new Class3_Sub2_Sub1(this);

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "Lclient!bo;")
	private final Class24 aClass24_30 = new Class24(128);

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub4() {
		this.method5143();
		this.method5151(true);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZ)V")
	private void method5114(@OriginalArg(0) int arg0) {
		if ((this.anIntArray492[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class3_Sub28 local23 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3402(); local23 != null; local23 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3400()) {
			if (arg0 == local23.anInt3594 && this.aClass3_Sub28ArrayArray1[arg0][local23.anInt3613] == null && local23.anInt3595 < 0) {
				local23.anInt3595 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
	public synchronized void method5116() {
		this.method5118();
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V")
	public synchronized void method5117(@OriginalArg(1) int arg0) {
		this.anInt6019 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BII)V")
	private void method5118() {
		this.anIntArray500[9] = 128;
		this.anIntArray501[9] = 128;
		this.method5132(9, 128);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(III)V")
	private void method5119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray493[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZ)V")
	private synchronized void method5121(@OriginalArg(0) boolean arg0) {
		this.aClass51_1.method1105();
		this.aClass3_Sub23_1 = null;
		this.method5151(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "()I")
	@Override
	public synchronized int method5113() {
		return 0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!hg;ZZ)V")
	private synchronized void method5122(@OriginalArg(1) Class3_Sub23 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method5121(arg1);
		this.aClass51_1.method1099(arg0.aByteArray47);
		this.aBoolean414 = arg2;
		this.aLong189 = 0L;
		@Pc(24) int local24 = this.aClass51_1.method1096();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass51_1.method1100(local26);
			this.aClass51_1.method1104(local26);
			this.aClass51_1.method1106(local26);
		}
		this.anInt6060 = this.aClass51_1.method1109();
		this.anInt6061 = this.aClass51_1.anIntArray92[this.anInt6060];
		this.aLong188 = this.aClass51_1.method1108(this.anInt6061);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLclient!ko;)I")
	private int method5123(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(15) int local15 = arg0.anInt3609 + (arg0.anInt3602 * arg0.anInt3612 >> 12);
		local15 += this.anIntArray497[arg0.anInt3594] * (this.anIntArray493[arg0.anInt3594] - 8192) >> 12;
		@Pc(36) Class20 local36 = arg0.aClass20_1;
		@Pc(56) int local56;
		if (local36.anInt564 > 0 && (local36.anInt556 > 0 || this.anIntArray496[arg0.anInt3594] > 0)) {
			local56 = local36.anInt556 << 2;
			@Pc(61) int local61 = local36.anInt560 << 1;
			if (local61 > arg0.anInt3607) {
				local56 = local56 * arg0.anInt3607 / local61;
			}
			local56 += this.anIntArray496[arg0.anInt3594] >> 7;
			@Pc(91) double local91 = Math.sin((double) (arg0.anInt3603 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local56 * local91);
		}
		local56 = (int) ((double) (arg0.aClass3_Sub17_Sub1_1.anInt2523 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static244.anInt4835 + 0.5D);
		return local56 >= 1 ? local56 : 1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)I")
	public int method5124() {
		return this.anInt6019;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "()Lclient!mq;")
	@Override
	public synchronized Class3_Sub2 method5111() {
		return null;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZLclient!ko;)V")
	public void method5125(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		@Pc(8) int local8 = arg1.aClass3_Sub17_Sub1_1.aByteArray48.length;
		@Pc(40) int local40;
		if (arg0 && arg1.aClass3_Sub17_Sub1_1.aBoolean139) {
			@Pc(51) int local51 = local8 + local8 - arg1.aClass3_Sub17_Sub1_1.anInt2521;
			local40 = (int) ((long) local51 * (long) this.anIntArray498[arg1.anInt3594] >> 6);
			local8 <<= 0x8;
			if (local8 <= local40) {
				local40 = local8 + local8 - local40 - 1;
				arg1.aClass3_Sub2_Sub3_3.method2794();
			}
		} else {
			local40 = (int) ((long) this.anIntArray498[arg1.anInt3594] * (long) local8 >> 6);
		}
		arg1.aClass3_Sub2_Sub3_3.method2804(local40);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ko;I)I")
	private int method5126(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(9) int local9 = this.anIntArray499[arg0.anInt3594];
		return local9 >= 8192 ? 16384 - ((16384 - local9) * (128 - arg0.anInt3606) + 32 >> 6) : arg0.anInt3606 * local9 + 32 >> 6;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V")
	public synchronized void method5127() {
		for (@Pc(7) Class3_Sub8 local7 = (Class3_Sub8) this.aClass24_30.method595(); local7 != null; local7 = (Class3_Sub8) this.aClass24_30.method602()) {
			local7.method585();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!ko;)Z")
	public boolean method5128(@OriginalArg(1) Class3_Sub28 arg0) {
		if (arg0.aClass3_Sub2_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt3595 >= 0) {
			arg0.method5717();
			if (arg0.anInt3610 > 0 && this.aClass3_Sub28ArrayArray2[arg0.anInt3594][arg0.anInt3610] == arg0) {
				this.aClass3_Sub28ArrayArray2[arg0.anInt3594][arg0.anInt3610] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(III)V")
	private void method5129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)V")
	private void method5131(@OriginalArg(0) int arg0) {
		for (@Pc(20) Class3_Sub28 local20 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3402(); local20 != null; local20 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3400()) {
			if ((arg0 < 0 || arg0 == local20.anInt3594) && local20.anInt3595 < 0) {
				this.aClass3_Sub28ArrayArray1[local20.anInt3594][local20.anInt3613] = null;
				local20.anInt3595 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(III)V")
	private void method5132(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray491[arg0] != arg1) {
			this.anIntArray491[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass3_Sub28ArrayArray2[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5109(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass51_1.method1097()) {
			@Pc(14) int local14 = this.anInt6036 * this.aClass51_1.anInt1412 / Static244.anInt4835;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong189;
				if (this.aLong188 - local23 >= 0L) {
					this.aLong189 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong188 + (long) local14 - this.aLong189 - 1L) / (long) local14);
				this.aLong189 += (long) local14 * (long) local55;
				this.aClass3_Sub2_Sub1_1.method5109(arg0, arg1, local55);
				this.method5135();
				arg1 += local55;
				arg2 -= local55;
			} while (this.aClass51_1.method1097());
		}
		this.aClass3_Sub2_Sub1_1.method5109(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)Z")
	public synchronized boolean method5133() {
		return this.aClass51_1.method1097();
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)V")
	private void method5135() {
		@Pc(8) int local8 = this.anInt6060;
		@Pc(11) int local11 = this.anInt6061;
		@Pc(14) long local14 = this.aLong188;
		if (this.aClass3_Sub23_1 != null && local11 == this.anInt6062) {
			this.method5122(this.aClass3_Sub23_1, this.aBoolean415, this.aBoolean414);
			this.method5135();
			return;
		}
		while (this.anInt6061 == local11) {
			while (this.aClass51_1.anIntArray92[local8] == local11) {
				this.aClass51_1.method1100(local8);
				@Pc(47) int local47 = this.aClass51_1.method1101(local8);
				if (local47 == 1) {
					this.aClass51_1.method1103();
					this.aClass51_1.method1106(local8);
					if (this.aClass51_1.method1102()) {
						if (this.aClass3_Sub23_1 != null) {
							this.method5141(this.aClass3_Sub23_1, this.aBoolean414);
							this.method5135();
							return;
						}
						if (!this.aBoolean414 || local11 == 0) {
							this.method5151(true);
							this.aClass51_1.method1105();
							return;
						}
						this.aClass51_1.method1098(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method5149(local47);
				}
				this.aClass51_1.method1104(local8);
				this.aClass51_1.method1106(local8);
			}
			local8 = this.aClass51_1.method1109();
			local11 = this.aClass51_1.anIntArray92[local8];
			local14 = this.aClass51_1.method1108(local11);
		}
		this.anInt6061 = local11;
		this.aLong188 = local14;
		this.anInt6060 = local8;
		if (this.aClass3_Sub23_1 != null && local11 > this.anInt6062) {
			this.anInt6061 = this.anInt6062;
			this.anInt6060 = -1;
			this.aLong188 = this.aClass51_1.method1108(this.anInt6061);
		}
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(II)V")
	private void method5136(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class3_Sub28 local16 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3402(); local16 != null; local16 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3400()) {
			if (arg0 < 0 || local16.anInt3594 == arg0) {
				if (local16.aClass3_Sub2_Sub3_3 != null) {
					local16.aClass3_Sub2_Sub3_3.method2797(Static244.anInt4835 / 100);
					if (local16.aClass3_Sub2_Sub3_3.method2791()) {
						this.aClass3_Sub2_Sub1_1.aClass3_Sub2_Sub2_1.method1366(local16.aClass3_Sub2_Sub3_3);
					}
					local16.method2851();
				}
				if (local16.anInt3595 < 0) {
					this.aClass3_Sub28ArrayArray1[local16.anInt3594][local16.anInt3613] = null;
				}
				local16.method5717();
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)V")
	private void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)V")
	public synchronized void method5138() {
		for (@Pc(11) Class3_Sub8 local11 = (Class3_Sub8) this.aClass24_30.method595(); local11 != null; local11 = (Class3_Sub8) this.aClass24_30.method602()) {
			local11.method5717();
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(IIII)V")
	private void method5139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub28 local12 = this.aClass3_Sub28ArrayArray1[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub28ArrayArray1[arg0][arg2] = null;
		if ((this.anIntArray492[arg0] & 0x2) == 0) {
			local12.anInt3595 = 0;
			return;
		}
		for (@Pc(51) Class3_Sub28 local51 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3402(); local51 != null; local51 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3400()) {
			if (local51.anInt3594 == local12.anInt3594 && local51.anInt3595 < 0 && local12 != local51) {
				local12.anInt3595 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(BII)V")
	private void method5140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray495[arg0] = arg1;
		this.anIntArray505[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!hg;BZ)V")
	public synchronized void method5141(@OriginalArg(0) Class3_Sub23 arg0, @OriginalArg(2) boolean arg1) {
		this.method5122(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(IIII)V")
	private void method5142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5139(arg1, 64, arg2);
		if ((this.anIntArray492[arg1] & 0x2) != 0) {
			for (@Pc(28) Class3_Sub28 local28 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3391(); local28 != null; local28 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3389()) {
				if (arg1 == local28.anInt3594 && local28.anInt3595 < 0) {
					this.aClass3_Sub28ArrayArray1[arg1][local28.anInt3613] = null;
					this.aClass3_Sub28ArrayArray1[arg1][arg2] = local28;
					@Pc(67) int local67 = (local28.anInt3602 * local28.anInt3612 >> 12) + local28.anInt3609;
					local28.anInt3609 += arg2 - local28.anInt3613 << 8;
					local28.anInt3602 = local67 - local28.anInt3609;
					local28.anInt3613 = arg2;
					local28.anInt3612 = 4096;
					return;
				}
			}
		}
		@Pc(113) Class3_Sub8 local113 = (Class3_Sub8) this.aClass24_30.method609((long) this.anIntArray491[arg1]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class3_Sub17_Sub1 local121 = local113.aClass3_Sub17_Sub1Array1[arg2];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class3_Sub28 local128 = new Class3_Sub28();
		local128.aClass3_Sub8_1 = local113;
		local128.aClass3_Sub17_Sub1_1 = local121;
		local128.anInt3594 = arg1;
		local128.aClass20_1 = local113.aClass20Array1[arg2];
		local128.anInt3610 = local113.aByteArray9[arg2];
		local128.anInt3613 = arg2;
		local128.anInt3596 = local113.anInt721 * arg0 * arg0 * local113.aByteArray8[arg2] + 1024 >> 11;
		local128.anInt3606 = local113.aByteArray10[arg2] & 0xFF;
		local128.anInt3609 = (arg2 << 8) - (local113.aShortArray16[arg2] & 0x7FFF);
		local128.anInt3615 = 0;
		local128.anInt3611 = 0;
		local128.anInt3605 = 0;
		local128.anInt3595 = -1;
		local128.anInt3616 = 0;
		if (this.anIntArray498[arg1] == 0) {
			local128.aClass3_Sub2_Sub3_3 = Static364.method2800(local121, this.method5123(local128), this.method5150(local128), this.method5126(local128));
		} else {
			local128.aClass3_Sub2_Sub3_3 = Static364.method2800(local121, this.method5123(local128), 0, this.method5126(local128));
			this.method5125(local113.aShortArray16[arg2] < 0, local128);
		}
		if (local113.aShortArray16[arg2] < 0) {
			local128.aClass3_Sub2_Sub3_3.method2811(-1);
		}
		if (local128.anInt3610 >= 0) {
			@Pc(290) Class3_Sub28 local290 = this.aClass3_Sub28ArrayArray2[arg1][local128.anInt3610];
			if (local290 != null && local290.anInt3595 < 0) {
				this.aClass3_Sub28ArrayArray1[arg1][local290.anInt3613] = null;
				local290.anInt3595 = 0;
			}
			this.aClass3_Sub28ArrayArray2[arg1][local128.anInt3610] = local128;
		}
		this.aClass3_Sub2_Sub1_1.aClass127_1.method3387(local128);
		this.aClass3_Sub28ArrayArray1[arg1][arg2] = local128;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZII)V")
	private synchronized void method5143() {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray490[local15] = 256;
		}
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(B)V")
	public synchronized void method5144() {
		this.method5121(true);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(IZ)V")
	private void method5145(@OriginalArg(0) int arg0) {
		if ((this.anIntArray492[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(21) Class3_Sub28 local21 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3402(); local21 != null; local21 = (Class3_Sub28) this.aClass3_Sub2_Sub1_1.aClass127_1.method3400()) {
			if (local21.anInt3594 == arg0) {
				local21.anInt3597 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ko;II[II)Z")
	public boolean method5147(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg0.anInt3599 = Static244.anInt4835 / 100;
		if (arg0.anInt3595 >= 0 && (arg0.aClass3_Sub2_Sub3_3 == null || arg0.aClass3_Sub2_Sub3_3.method2819())) {
			arg0.method2851();
			arg0.method5717();
			if (arg0.anInt3610 > 0 && this.aClass3_Sub28ArrayArray2[arg0.anInt3594][arg0.anInt3610] == arg0) {
				this.aClass3_Sub28ArrayArray2[arg0.anInt3594][arg0.anInt3610] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg0.anInt3612;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray503[arg0.anInt3594] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg0.anInt3612 = local53;
		}
		arg0.aClass3_Sub2_Sub3_3.method2801(this.method5123(arg0));
		@Pc(96) Class20 local96 = arg0.aClass20_1;
		arg0.anInt3607++;
		arg0.anInt3603 += local96.anInt564;
		@Pc(117) boolean local117 = false;
		@Pc(135) double local135 = (double) ((arg0.anInt3612 * arg0.anInt3602 >> 12) + (arg0.anInt3613 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt566 > 0) {
			if (local96.anInt559 > 0) {
				arg0.anInt3616 += (int) (Math.pow(2.0D, local135 * (double) local96.anInt559) * 128.0D + 0.5D);
			} else {
				arg0.anInt3616 += 128;
			}
			if (local96.anInt566 * arg0.anInt3616 >= 819200) {
				local117 = true;
			}
		}
		if (local96.aByteArray6 != null) {
			if (local96.anInt565 <= 0) {
				arg0.anInt3611 += 128;
			} else {
				arg0.anInt3611 += (int) (Math.pow(2.0D, (double) local96.anInt565 * local135) * 128.0D + 0.5D);
			}
			while (arg0.anInt3615 < local96.aByteArray6.length - 2 && arg0.anInt3611 > (local96.aByteArray6[arg0.anInt3615 + 2] & 0xFF) << 8) {
				arg0.anInt3615 += 2;
			}
			if (arg0.anInt3615 == local96.aByteArray6.length - 2 && local96.aByteArray6[arg0.anInt3615 + 1] == 0) {
				local117 = true;
			}
		}
		if (arg0.anInt3595 >= 0 && local96.aByteArray7 != null && (this.anIntArray492[arg0.anInt3594] & 0x1) == 0 && (arg0.anInt3610 < 0 || this.aClass3_Sub28ArrayArray2[arg0.anInt3594][arg0.anInt3610] != arg0)) {
			if (local96.anInt563 <= 0) {
				arg0.anInt3595 += 128;
			} else {
				arg0.anInt3595 += (int) (Math.pow(2.0D, local135 * (double) local96.anInt563) * 128.0D + 0.5D);
			}
			while (local96.aByteArray7.length - 2 > arg0.anInt3605 && arg0.anInt3595 > (local96.aByteArray7[arg0.anInt3605 + 2] & 0xFF) << 8) {
				arg0.anInt3605 += 2;
			}
			if (arg0.anInt3605 == local96.aByteArray7.length - 2) {
				local117 = true;
			}
		}
		if (!local117) {
			arg0.aClass3_Sub2_Sub3_3.method2783(arg0.anInt3599, this.method5150(arg0), this.method5126(arg0));
			return false;
		}
		arg0.aClass3_Sub2_Sub3_3.method2797(arg0.anInt3599);
		if (arg3 == null) {
			arg0.aClass3_Sub2_Sub3_3.method5108(arg2);
		} else {
			arg0.aClass3_Sub2_Sub3_3.method5109(arg3, arg1, arg2);
		}
		if (arg0.aClass3_Sub2_Sub3_3.method2791()) {
			this.aClass3_Sub2_Sub1_1.aClass3_Sub2_Sub2_1.method1366(arg0.aClass3_Sub2_Sub3_3);
		}
		arg0.method2851();
		if (arg0.anInt3595 >= 0) {
			arg0.method5717();
			if (arg0.anInt3610 > 0 && this.aClass3_Sub28ArrayArray2[arg0.anInt3594][arg0.anInt3610] == arg0) {
				this.aClass3_Sub28ArrayArray2[arg0.anInt3594][arg0.anInt3610] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(II)V")
	private void method5149(@OriginalArg(1) int arg0) {
		@Pc(20) int local20 = arg0 & 0xF0;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(39) int local39;
		if (local20 == 128) {
			local27 = arg0 & 0xF;
			local33 = arg0 >> 8 & 0x7F;
			local39 = arg0 >> 16 & 0x7F;
			this.method5139(local27, local39, local33);
		} else if (local20 == 144) {
			local27 = arg0 & 0xF;
			local33 = arg0 >> 8 & 0x7F;
			local39 = arg0 >> 16 & 0x7F;
			if (local39 <= 0) {
				this.method5139(local27, 64, local33);
			} else {
				this.method5142(local39, local27, local33);
			}
		} else if (local20 == 160) {
			local27 = arg0 & 0xF;
			local33 = arg0 >> 8 & 0x7F;
			local39 = arg0 >> 16 & 0x7F;
			this.method5137(local33, local27, local39);
		} else if (local20 == 176) {
			local27 = arg0 & 0xF;
			local33 = arg0 >> 8 & 0x7F;
			local39 = arg0 >> 16 & 0x7F;
			if (local33 == 0) {
				this.anIntArray501[local27] = (local39 << 14) + (this.anIntArray501[local27] & 0xFFE03FFF);
			}
			if (local33 == 32) {
				this.anIntArray501[local27] = (local39 << 7) + (this.anIntArray501[local27] & 0xFFFFC07F);
			}
			if (local33 == 1) {
				this.anIntArray496[local27] = (local39 << 7) + (this.anIntArray496[local27] & 0xFFFFC07F);
			}
			if (local33 == 33) {
				this.anIntArray496[local27] = (this.anIntArray496[local27] & 0xFFFFFF80) + local39;
			}
			if (local33 == 5) {
				this.anIntArray503[local27] = (this.anIntArray503[local27] & 0xFFFFC07F) + (local39 << 7);
			}
			if (local33 == 37) {
				this.anIntArray503[local27] = local39 + (this.anIntArray503[local27] & 0xFFFFFF80);
			}
			if (local33 == 7) {
				this.anIntArray502[local27] = (this.anIntArray502[local27] & 0xFFFFC07F) + (local39 << 7);
			}
			if (local33 == 39) {
				this.anIntArray502[local27] = (this.anIntArray502[local27] & 0xFFFFFF80) + local39;
			}
			if (local33 == 10) {
				this.anIntArray499[local27] = (local39 << 7) + (this.anIntArray499[local27] & 0xFFFFC07F);
			}
			if (local33 == 42) {
				this.anIntArray499[local27] = (this.anIntArray499[local27] & 0xFFFFFF80) + local39;
			}
			if (local33 == 11) {
				this.anIntArray504[local27] = (this.anIntArray504[local27] & 0xFFFFC07F) + (local39 << 7);
			}
			if (local33 == 43) {
				this.anIntArray504[local27] = (this.anIntArray504[local27] & 0xFFFFFF80) + local39;
			}
			if (local33 == 64) {
				if (local39 < 64) {
					this.anIntArray492[local27] &= 0xFFFFFFFE;
				} else {
					this.anIntArray492[local27] |= 0x1;
				}
			}
			if (local33 == 65) {
				if (local39 < 64) {
					this.method5114(local27);
					this.anIntArray492[local27] &= 0xFFFFFFFD;
				} else {
					this.anIntArray492[local27] |= 0x2;
				}
			}
			if (local33 == 99) {
				this.anIntArray494[local27] = (this.anIntArray494[local27] & 0x7F) + (local39 << 7);
			}
			if (local33 == 98) {
				this.anIntArray494[local27] = (this.anIntArray494[local27] & 0x3F80) + local39;
			}
			if (local33 == 101) {
				this.anIntArray494[local27] = (local39 << 7) + (this.anIntArray494[local27] & 0x7F) + 16384;
			}
			if (local33 == 100) {
				this.anIntArray494[local27] = local39 + (this.anIntArray494[local27] & 0x3F80) + 16384;
			}
			if (local33 == 120) {
				this.method5136(local27);
			}
			if (local33 == 121) {
				this.method5152(local27);
			}
			if (local33 == 123) {
				this.method5131(local27);
			}
			@Pc(512) int local512;
			if (local33 == 6) {
				local512 = this.anIntArray494[local27];
				if (local512 == 16384) {
					this.anIntArray497[local27] = (local39 << 7) + (this.anIntArray497[local27] & 0xFFFFC07F);
				}
			}
			if (local33 == 38) {
				local512 = this.anIntArray494[local27];
				if (local512 == 16384) {
					this.anIntArray497[local27] = local39 + (this.anIntArray497[local27] & 0xFFFFFF80);
				}
			}
			if (local33 == 16) {
				this.anIntArray498[local27] = (local39 << 7) + (this.anIntArray498[local27] & 0xFFFFC07F);
			}
			if (local33 == 48) {
				this.anIntArray498[local27] = (this.anIntArray498[local27] & 0xFFFFFF80) + local39;
			}
			if (local33 == 81) {
				if (local39 >= 64) {
					this.anIntArray492[local27] |= 0x4;
				} else {
					this.method5145(local27);
					this.anIntArray492[local27] &= 0xFFFFFFFB;
				}
			}
			if (local33 == 17) {
				this.method5140(local27, (this.anIntArray495[local27] & 0xFFFFC07F) + (local39 << 7));
			}
			if (local33 == 49) {
				this.method5140(local27, local39 + (this.anIntArray495[local27] & 0xFFFFFF80));
			}
		} else if (local20 == 192) {
			local27 = arg0 & 0xF;
			local33 = arg0 >> 8 & 0x7F;
			this.method5132(local27, this.anIntArray501[local27] + local33);
		} else if (local20 == 208) {
			local27 = arg0 & 0xF;
			local33 = arg0 >> 8 & 0x7F;
			this.method5129(local33, local27);
		} else if (local20 == 224) {
			local27 = arg0 & 0xF;
			local33 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method5119(local27, local33);
		} else {
			local20 = arg0 & 0xFF;
			if (local20 == 255) {
				this.method5151(true);
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Lclient!ko;I)I")
	private int method5150(@OriginalArg(0) Class3_Sub28 arg0) {
		if (this.anIntArray490[arg0.anInt3594] == 0) {
			return 0;
		}
		@Pc(17) Class20 local17 = arg0.aClass20_1;
		@Pc(33) int local33 = this.anIntArray502[arg0.anInt3594] * this.anIntArray504[arg0.anInt3594] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = arg0.anInt3596 * local41 + 16384 >> 15;
		@Pc(59) int local59 = this.anInt6019 * local50 + 128 >> 8;
		local33 = this.anIntArray490[arg0.anInt3594] * local59 + 128 >> 8;
		if (local17.anInt566 > 0) {
			local33 = (int) ((double) local33 * Math.pow(0.5D, (double) arg0.anInt3616 * 1.953125E-5D * (double) local17.anInt566) + 0.5D);
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(127) int local127;
		@Pc(139) int local139;
		if (local17.aByteArray6 != null) {
			local101 = arg0.anInt3611;
			local109 = local17.aByteArray6[arg0.anInt3615 + 1];
			if (arg0.anInt3615 < local17.aByteArray6.length - 2) {
				local127 = (local17.aByteArray6[arg0.anInt3615] & 0xFF) << 8;
				local139 = (local17.aByteArray6[arg0.anInt3615 + 2] & 0xFF) << 8;
				local109 += (local17.aByteArray6[arg0.anInt3615 + 3] - local109) * (local101 - local127) / (local139 - local127);
			}
			local33 = local33 * local109 + 32 >> 6;
		}
		if (arg0.anInt3595 > 0 && local17.aByteArray7 != null) {
			local101 = arg0.anInt3595;
			local109 = local17.aByteArray7[arg0.anInt3605 + 1];
			if (arg0.anInt3605 < local17.aByteArray7.length - 2) {
				local127 = (local17.aByteArray7[arg0.anInt3605] & 0xFF) << 8;
				local139 = (local17.aByteArray7[arg0.anInt3605 + 2] & 0xFF) << 8;
				local109 += (local17.aByteArray7[arg0.anInt3605 + 3] - local109) * (local101 - local127) / (local139 - local127);
			}
			local33 = local109 * local33 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(IZ)V")
	private void method5151(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method5136(-1);
		} else {
			this.method5131(-1);
		}
		this.method5152(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray491[local31] = this.anIntArray500[local31];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray501[local47] = this.anIntArray500[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(II)V")
	private void method5152(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method5152(local9);
			}
			return;
		}
		this.anIntArray502[arg0] = 12800;
		this.anIntArray499[arg0] = 8192;
		this.anIntArray504[arg0] = 16383;
		this.anIntArray493[arg0] = 8192;
		this.anIntArray496[arg0] = 0;
		this.anIntArray503[arg0] = 8192;
		this.method5114(arg0);
		this.method5145(arg0);
		this.anIntArray492[arg0] = 0;
		this.anIntArray494[arg0] = 32767;
		this.anIntArray497[arg0] = 256;
		this.anIntArray498[arg0] = 0;
		this.method5140(arg0, 8192);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!eb;Lclient!hg;ILclient!ir;)Z")
	public synchronized boolean method5153(@OriginalArg(1) Class52 arg0, @OriginalArg(2) Class3_Sub23 arg1, @OriginalArg(4) Class100 arg2) {
		arg1.method2044();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class3_Sub10 local26 = (Class3_Sub10) arg1.aClass24_16.method595(); local26 != null; local26 = (Class3_Sub10) arg1.aClass24_16.method602()) {
			@Pc(32) int local32 = (int) local26.aLong211;
			@Pc(40) Class3_Sub8 local40 = (Class3_Sub8) this.aClass24_30.method609((long) local32);
			if (local40 == null) {
				local40 = Static57.method949(arg2, local32);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass24_30.method598((long) local32, local40);
			}
			if (!local40.method587(local26.aByteArray15, local20, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method2043();
		}
		return local9;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5108(@OriginalArg(0) int arg0) {
		if (this.aClass51_1.method1097()) {
			@Pc(14) int local14 = this.anInt6036 * this.aClass51_1.anInt1412 / Static244.anInt4835;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong189;
				if (this.aLong188 - local23 >= 0L) {
					this.aLong189 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong188 + (long) local14 - this.aLong189 - 1L) / (long) local14);
				this.aLong189 += (long) local53 * (long) local14;
				arg0 -= local53;
				this.aClass3_Sub2_Sub1_1.method5108(local53);
				this.method5135();
			} while (this.aClass51_1.method1097());
		}
		this.aClass3_Sub2_Sub1_1.method5108(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "()Lclient!mq;")
	@Override
	public synchronized Class3_Sub2 method5110() {
		return this.aClass3_Sub2_Sub1_1;
	}
}
