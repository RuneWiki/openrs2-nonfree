import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class3_Sub7_Sub2 extends Class3_Sub7 {

	@OriginalMember(owner = "client!eg", name = "wb", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!eg", name = "xb", descriptor = "I")
	private int anInt2638;

	@OriginalMember(owner = "client!eg", name = "yb", descriptor = "I")
	private int anInt2639;

	@OriginalMember(owner = "client!eg", name = "zb", descriptor = "Z")
	private boolean aBoolean177;

	@OriginalMember(owner = "client!eg", name = "Bb", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!eg", name = "Cb", descriptor = "Lclient!oba;")
	private Class3_Sub39 aClass3_Sub39_1;

	@OriginalMember(owner = "client!eg", name = "Db", descriptor = "I")
	private int anInt2640;

	@OriginalMember(owner = "client!eg", name = "Eb", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "[I")
	public final int[] anIntArray113 = new int[16];

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "[I")
	private final int[] anIntArray112 = new int[16];

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "[I")
	public final int[] anIntArray119 = new int[16];

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "[I")
	private final int[] anIntArray118 = new int[16];

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "[I")
	private final int[] anIntArray115 = new int[16];

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "[[Lclient!md;")
	private final Class3_Sub36[][] aClass3_Sub36ArrayArray1 = new Class3_Sub36[16][128];

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	private final int anInt2595 = 1000000;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "[I")
	private final int[] anIntArray117 = new int[16];

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "[I")
	private final int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "[I")
	public final int[] anIntArray116 = new int[16];

	@OriginalMember(owner = "client!eg", name = "E", descriptor = "[[Lclient!md;")
	private final Class3_Sub36[][] aClass3_Sub36ArrayArray2 = new Class3_Sub36[16][128];

	@OriginalMember(owner = "client!eg", name = "db", descriptor = "[I")
	private final int[] anIntArray124 = new int[16];

	@OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
	private int anInt2612 = 256;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "[I")
	private final int[] anIntArray114 = new int[16];

	@OriginalMember(owner = "client!eg", name = "nb", descriptor = "[I")
	private final int[] anIntArray125 = new int[16];

	@OriginalMember(owner = "client!eg", name = "ob", descriptor = "[I")
	private final int[] anIntArray126 = new int[16];

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "[I")
	private final int[] anIntArray123 = new int[16];

	@OriginalMember(owner = "client!eg", name = "M", descriptor = "[I")
	private final int[] anIntArray121 = new int[16];

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "[I")
	private final int[] anIntArray120 = new int[16];

	@OriginalMember(owner = "client!eg", name = "ub", descriptor = "[I")
	private final int[] anIntArray127 = new int[16];

	@OriginalMember(owner = "client!eg", name = "C", descriptor = "Lclient!qha;")
	private final Class278 aClass278_1 = new Class278();

	@OriginalMember(owner = "client!eg", name = "Ab", descriptor = "Lclient!ww;")
	private final Class3_Sub7_Sub5 aClass3_Sub7_Sub5_1 = new Class3_Sub7_Sub5(this);

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "Lclient!qp;")
	private final Class280 aClass280_11;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class3_Sub7_Sub2() {
		this.aClass280_11 = new Class280(128);
		this.method2474(256, -1);
		this.method2451(true);
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!eg;)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) Class3_Sub7_Sub2 arg0) {
		this.aClass280_11 = arg0.aClass280_11;
		this.method2474(256, -1);
		this.method2451(true);
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "()Lclient!os;")
	@Override
	public synchronized Class3_Sub7 method8761() {
		return this.aClass3_Sub7_Sub5_1;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)V")
	private void method2440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2466(arg0, arg1, 64);
		if ((this.anIntArray119[arg1] & 0x2) != 0) {
			for (@Pc(36) Class3_Sub36 local36 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5873(); local36 != null; local36 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5871()) {
				if (arg1 == local36.anInt6663 && local36.anInt6673 < 0) {
					this.aClass3_Sub36ArrayArray2[arg1][local36.anInt6666] = null;
					this.aClass3_Sub36ArrayArray2[arg1][arg0] = local36;
					@Pc(78) int local78 = local36.anInt6667 + (local36.anInt6669 * local36.anInt6674 >> 12);
					local36.anInt6667 += arg0 - local36.anInt6666 << 8;
					local36.anInt6669 = local78 - local36.anInt6667;
					local36.anInt6666 = arg0;
					local36.anInt6674 = 4096;
					return;
				}
			}
		}
		@Pc(124) Class3_Sub44 local124 = (Class3_Sub44) this.aClass280_11.method7107((long) this.anIntArray112[arg1]);
		if (local124 == null) {
			return;
		}
		@Pc(132) Class3_Sub30_Sub1 local132 = local124.aClass3_Sub30_Sub1Array1[arg0];
		if (local132 == null) {
			return;
		}
		@Pc(139) Class3_Sub36 local139 = new Class3_Sub36();
		local139.anInt6663 = arg1;
		local139.aClass3_Sub44_1 = local124;
		local139.aClass3_Sub30_Sub1_3 = local132;
		local139.aClass197_1 = local124.aClass197Array1[arg0];
		local139.anInt6676 = local124.aByteArray86[arg0];
		local139.anInt6666 = arg0;
		local139.anInt6677 = local124.aByteArray87[arg0] * arg2 * arg2 * local124.anInt7999 + 1024 >> 11;
		local139.anInt6668 = local124.aByteArray85[arg0] & 0xFF;
		local139.anInt6667 = (arg0 << 8) - (local124.aShortArray117[arg0] & 0x7FFF);
		local139.anInt6673 = -1;
		local139.anInt6680 = 0;
		local139.anInt6671 = 0;
		local139.anInt6665 = 0;
		local139.anInt6664 = 0;
		if (this.anIntArray113[arg1] == 0) {
			local139.aClass3_Sub7_Sub3_3 = Static647.method4058(local132, this.method2450(local139), this.method2442(local139), this.method2470(local139));
		} else {
			local139.aClass3_Sub7_Sub3_3 = Static647.method4058(local132, this.method2450(local139), 0, this.method2470(local139));
			this.method2458(local139, local124.aShortArray117[arg0] < 0);
		}
		if (local124.aShortArray117[arg0] < 0) {
			local139.aClass3_Sub7_Sub3_3.method4068(-1);
		}
		if (local139.anInt6676 >= 0) {
			@Pc(284) Class3_Sub36 local284 = this.aClass3_Sub36ArrayArray1[arg1][local139.anInt6676];
			if (local284 != null && local284.anInt6673 < 0) {
				this.aClass3_Sub36ArrayArray2[arg1][local284.anInt6666] = null;
				local284.anInt6673 = 0;
			}
			this.aClass3_Sub36ArrayArray1[arg1][local139.anInt6676] = local139;
		}
		this.aClass3_Sub7_Sub5_1.aClass223_63.method5868(local139);
		this.aClass3_Sub36ArrayArray2[arg1][arg0] = local139;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)V")
	public synchronized void method2441(@OriginalArg(1) int arg0) {
		this.anInt2612 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!md;)I")
	private int method2442(@OriginalArg(1) Class3_Sub36 arg0) {
		if (this.anIntArray120[arg0.anInt6663] == 0) {
			return 0;
		}
		@Pc(14) Class197 local14 = arg0.aClass197_1;
		@Pc(30) int local30 = this.anIntArray124[arg0.anInt6663] * this.anIntArray121[arg0.anInt6663] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(53) int local53 = local38 * arg0.anInt6677 + 16384 >> 15;
		@Pc(62) int local62 = this.anInt2612 * local53 + 128 >> 8;
		local30 = local62 * this.anIntArray120[arg0.anInt6663] + 128 >> 8;
		if (local14.anInt5877 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) arg0.anInt6671 * 1.953125E-5D * (double) local14.anInt5877) * (double) local30 + 0.5D);
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (local14.aByteArray62 != null) {
			local101 = arg0.anInt6680;
			local109 = local14.aByteArray62[arg0.anInt6664 + 1];
			if (local14.aByteArray62.length - 2 > arg0.anInt6664) {
				local131 = (local14.aByteArray62[arg0.anInt6664] & 0xFF) << 8;
				local143 = (local14.aByteArray62[arg0.anInt6664 + 2] & 0xFF) << 8;
				local109 += (local14.aByteArray62[arg0.anInt6664 + 3] - local109) * (local101 + -local131) / (local143 - local131);
			}
			local30 = local109 * local30 + 32 >> 6;
		}
		if (arg0.anInt6673 > 0 && local14.aByteArray63 != null) {
			local101 = arg0.anInt6673;
			local109 = local14.aByteArray63[arg0.anInt6665 + 1];
			if (local14.aByteArray63.length - 2 > arg0.anInt6665) {
				local131 = (local14.aByteArray63[arg0.anInt6665] & 0xFF) << 8;
				local143 = (local14.aByteArray63[arg0.anInt6665 + 2] & 0xFF) << 8;
				local109 += (local14.aByteArray63[arg0.anInt6665 + 3] - local109) * (local101 - local131) / (local143 - local131);
			}
			local30 = local30 * local109 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
	private void method2443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray112[arg1] != arg0) {
			this.anIntArray112[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass3_Sub36ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(JI)V")
	private void method2444(@OriginalArg(0) long arg0) {
		while (arg0 >= this.aLong56) {
			@Pc(10) int local10 = this.anInt2638;
			@Pc(13) int local13 = this.anInt2639;
			@Pc(16) long local16 = this.aLong56;
			while (this.anInt2639 == local13) {
				while (local13 == this.aClass278_1.anIntArray505[local10]) {
					this.aClass278_1.method7024(local10);
					@Pc(27) int local27 = this.aClass278_1.method7029(local10);
					if (local27 == 1) {
						this.aClass278_1.method7025();
						this.aClass278_1.method7020(local10);
						if (this.aClass278_1.method7030()) {
							if (!this.aBoolean177 || local13 == 0) {
								this.method2451(true);
								this.aClass278_1.method7018();
								return;
							}
							this.aClass278_1.method7026(local16);
						}
						break;
					}
					if ((local27 & 0x80) != 0 && (local27 & 0xF0) != 144) {
						this.method2453(local27);
					}
					this.aClass278_1.method7019(local10);
					this.aClass278_1.method7020(local10);
				}
				this.aLong55 = local16;
				local10 = this.aClass278_1.method7022();
				local13 = this.aClass278_1.anIntArray505[local10];
				local16 = this.aClass278_1.method7032(local13);
			}
			this.aLong56 = local16;
			this.anInt2638 = local10;
			this.anInt2639 = local13;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)Z")
	public synchronized boolean method2445() {
		return this.aClass278_1.method7031();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!la;Lclient!oba;Lclient!ck;I)Z")
	public synchronized boolean method2446(@OriginalArg(1) Class196 arg0, @OriginalArg(2) Class3_Sub39 arg1, @OriginalArg(3) Class52 arg2) {
		arg1.method6336();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(37) Class3_Sub52 local37 = (Class3_Sub52) arg1.aClass280_32.method7110(); local37 != null; local37 = (Class3_Sub52) arg1.aClass280_32.method7108()) {
			@Pc(43) int local43 = (int) local37.aLong276;
			@Pc(51) Class3_Sub44 local51 = (Class3_Sub44) this.aClass280_11.method7107((long) local43);
			if (local51 == null) {
				local51 = Static625.method8734(local43, arg0);
				if (local51 == null) {
					local9 = false;
					continue;
				}
				this.aClass280_11.method7109(local51, (long) local43);
			}
			if (!local51.method6953(local23, local37.aByteArray106, arg2)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method6335();
		}
		return local9;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)V")
	private void method2447(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class3_Sub36 local12 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5874(); local12 != null; local12 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5870()) {
			if ((arg0 < 0 || local12.anInt6663 == arg0) && local12.anInt6673 < 0) {
				this.aClass3_Sub36ArrayArray2[local12.anInt6663][local12.anInt6666] = null;
				local12.anInt6673 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
	public synchronized void method2448() {
		for (@Pc(11) Class3_Sub44 local11 = (Class3_Sub44) this.aClass280_11.method7110(); local11 != null; local11 = (Class3_Sub44) this.aClass280_11.method7108()) {
			local11.method8769();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8757(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass278_1.method7031()) {
			@Pc(18) int local18 = this.aClass278_1.anInt8096 * this.anInt2595 / Static276.anInt4980;
			do {
				@Pc(28) long local28 = this.aLong55 + (long) local18 * (long) arg2;
				if (this.aLong56 - local28 >= 0L) {
					this.aLong55 = local28;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong56 + (long) local18 - this.aLong55 - 1L) / (long) local18);
				this.aLong55 += (long) local18 * (long) local57;
				this.aClass3_Sub7_Sub5_1.method8757(arg0, arg1, local57);
				arg1 += local57;
				arg2 -= local57;
				this.method2454();
			} while (this.aClass278_1.method7031());
		}
		this.aClass3_Sub7_Sub5_1.method8757(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)I")
	public int method2449() {
		return this.anInt2612;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!md;Z)I")
	private int method2450(@OriginalArg(0) Class3_Sub36 arg0) {
		@Pc(15) int local15 = arg0.anInt6667 + (arg0.anInt6669 * arg0.anInt6674 >> 12);
		local15 += this.anIntArray123[arg0.anInt6663] * (this.anIntArray126[arg0.anInt6663] - 8192) >> 12;
		@Pc(42) Class197 local42 = arg0.aClass197_1;
		@Pc(59) int local59;
		if (local42.anInt5879 > 0 && (local42.anInt5876 > 0 || this.anIntArray125[arg0.anInt6663] > 0)) {
			local59 = local42.anInt5876 << 2;
			@Pc(64) int local64 = local42.anInt5880 << 1;
			if (local64 > arg0.anInt6670) {
				local59 = arg0.anInt6670 * local59 / local64;
			}
			local59 += this.anIntArray125[arg0.anInt6663] >> 7;
			@Pc(98) double local98 = Math.sin((double) (arg0.anInt6678 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local98 * (double) local59);
		}
		local59 = (int) ((double) (arg0.aClass3_Sub30_Sub1_3.anInt4763 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static276.anInt4980 + 0.5D);
		return local59 >= 1 ? local59 : 1;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)V")
	private void method2451(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method2465(-1);
		} else {
			this.method2447(-1);
		}
		this.method2456(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray112[local29] = this.anIntArray117[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray122[local45] = this.anIntArray117[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!md;B)Z")
	public boolean method2452(@OriginalArg(0) Class3_Sub36 arg0) {
		if (arg0.aClass3_Sub7_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt6673 >= 0) {
			arg0.method8769();
			if (arg0.anInt6676 > 0 && arg0 == this.aClass3_Sub36ArrayArray1[arg0.anInt6663][arg0.anInt6676]) {
				this.aClass3_Sub36ArrayArray1[arg0.anInt6663][arg0.anInt6676] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)V")
	private void method2453(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (local13 == 128) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method2466(local26, local20, local32);
		} else if (local13 == 144) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local32 <= 0) {
				this.method2466(local26, local20, 64);
			} else {
				this.method2440(local26, local20, local32);
			}
		} else if (local13 == 160) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method2455(local26, local20, local32);
		} else if (local13 == 176) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local26 == 0) {
				this.anIntArray122[local20] = (local32 << 14) + (this.anIntArray122[local20] & 0xFFE03FFF);
			}
			if (local26 == 32) {
				this.anIntArray122[local20] = (this.anIntArray122[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 1) {
				this.anIntArray125[local20] = (local32 << 7) + (this.anIntArray125[local20] & 0xFFFFC07F);
			}
			if (local26 == 33) {
				this.anIntArray125[local20] = (this.anIntArray125[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 5) {
				this.anIntArray114[local20] = (this.anIntArray114[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 37) {
				this.anIntArray114[local20] = (this.anIntArray114[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 7) {
				this.anIntArray121[local20] = (this.anIntArray121[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 39) {
				this.anIntArray121[local20] = local32 + (this.anIntArray121[local20] & 0xFFFFFF80);
			}
			if (local26 == 10) {
				this.anIntArray127[local20] = (this.anIntArray127[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 42) {
				this.anIntArray127[local20] = local32 + (this.anIntArray127[local20] & 0xFFFFFF80);
			}
			if (local26 == 11) {
				this.anIntArray124[local20] = (this.anIntArray124[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 43) {
				this.anIntArray124[local20] = local32 + (this.anIntArray124[local20] & 0xFFFFFF80);
			}
			if (local26 == 64) {
				if (local32 >= 64) {
					this.anIntArray119[local20] |= 0x1;
				} else {
					this.anIntArray119[local20] &= 0xFFFFFFFE;
				}
			}
			if (local26 == 65) {
				if (local32 >= 64) {
					this.anIntArray119[local20] |= 0x2;
				} else {
					this.method2462(local20);
					this.anIntArray119[local20] &= 0xFFFFFFFD;
				}
			}
			if (local26 == 99) {
				this.anIntArray118[local20] = (local32 << 7) + (this.anIntArray118[local20] & 0x7F);
			}
			if (local26 == 98) {
				this.anIntArray118[local20] = (this.anIntArray118[local20] & 0x3F80) + local32;
			}
			if (local26 == 101) {
				this.anIntArray118[local20] = (local32 << 7) + (this.anIntArray118[local20] & 0x7F) + 16384;
			}
			if (local26 == 100) {
				this.anIntArray118[local20] = local32 + (this.anIntArray118[local20] & 0x3F80) + 16384;
			}
			if (local26 == 120) {
				this.method2465(local20);
			}
			if (local26 == 121) {
				this.method2456(local20);
			}
			if (local26 == 123) {
				this.method2447(local20);
			}
			@Pc(508) int local508;
			if (local26 == 6) {
				local508 = this.anIntArray118[local20];
				if (local508 == 16384) {
					this.anIntArray123[local20] = (this.anIntArray123[local20] & 0xFFFFC07F) + (local32 << 7);
				}
			}
			if (local26 == 38) {
				local508 = this.anIntArray118[local20];
				if (local508 == 16384) {
					this.anIntArray123[local20] = (this.anIntArray123[local20] & 0xFFFFFF80) + local32;
				}
			}
			if (local26 == 16) {
				this.anIntArray113[local20] = (this.anIntArray113[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 48) {
				this.anIntArray113[local20] = local32 + (this.anIntArray113[local20] & 0xFFFFFF80);
			}
			if (local26 == 81) {
				if (local32 < 64) {
					this.method2475(local20);
					this.anIntArray119[local20] &= 0xFFFFFFFB;
				} else {
					this.anIntArray119[local20] |= 0x4;
				}
			}
			if (local26 == 17) {
				this.method2457(local20, (local32 << 7) + (this.anIntArray115[local20] & 0xFFFFC07F));
			}
			if (local26 == 49) {
				this.method2457(local20, local32 + (this.anIntArray115[local20] & 0xFFFFFF80));
			}
		} else if (local13 == 192) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method2443(this.anIntArray122[local20] + local26, local20);
		} else if (local13 == 208) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method2464(local26, local20);
		} else if (local13 == 224) {
			local20 = arg0 & 0xF;
			local26 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method2467(local26, local20);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method2451(true);
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "()I")
	@Override
	public synchronized int method8763() {
		return 0;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(Z)V")
	private void method2454() {
		@Pc(17) int local17 = this.anInt2638;
		@Pc(20) int local20 = this.anInt2639;
		@Pc(23) long local23 = this.aLong56;
		if (this.aClass3_Sub39_1 != null && local20 == this.anInt2640) {
			this.method2473(this.aBoolean177, this.aBoolean178, this.aClass3_Sub39_1);
			this.method2454();
			return;
		}
		while (local20 == this.anInt2639) {
			while (local20 == this.aClass278_1.anIntArray505[local17]) {
				this.aClass278_1.method7024(local17);
				@Pc(52) int local52 = this.aClass278_1.method7029(local17);
				if (local52 == 1) {
					this.aClass278_1.method7025();
					this.aClass278_1.method7020(local17);
					if (this.aClass278_1.method7030()) {
						if (this.aClass3_Sub39_1 != null) {
							this.method2460(this.aClass3_Sub39_1, this.aBoolean177);
							this.method2454();
							return;
						}
						if (!this.aBoolean177 || local20 == 0) {
							this.method2451(true);
							this.aClass278_1.method7018();
							return;
						}
						this.aClass278_1.method7026(local23);
					}
					break;
				}
				if ((local52 & 0x80) != 0) {
					this.method2453(local52);
				}
				this.aClass278_1.method7019(local17);
				this.aClass278_1.method7020(local17);
			}
			local17 = this.aClass278_1.method7022();
			local20 = this.aClass278_1.anIntArray505[local17];
			local23 = this.aClass278_1.method7032(local20);
		}
		this.aLong56 = local23;
		this.anInt2639 = local20;
		this.anInt2638 = local17;
		if (this.aClass3_Sub39_1 != null && local20 > this.anInt2640) {
			this.anInt2638 = -1;
			this.anInt2639 = this.anInt2640;
			this.aLong56 = this.aClass278_1.method7032(this.anInt2639);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIBI)V")
	private void method2455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(II)V")
	private void method2456(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
				this.method2456(local20);
			}
			return;
		}
		this.anIntArray121[arg0] = 12800;
		this.anIntArray127[arg0] = 8192;
		this.anIntArray124[arg0] = 16383;
		this.anIntArray126[arg0] = 8192;
		this.anIntArray125[arg0] = 0;
		this.anIntArray114[arg0] = 8192;
		this.method2462(arg0);
		this.method2475(arg0);
		this.anIntArray119[arg0] = 0;
		this.anIntArray118[arg0] = 32767;
		this.anIntArray123[arg0] = 256;
		this.anIntArray113[arg0] = 0;
		this.method2457(arg0, 8192);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)V")
	private void method2457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray115[arg0] = arg1;
		this.anIntArray116[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!md;Z)V")
	public void method2458(@OriginalArg(1) Class3_Sub36 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass3_Sub30_Sub1_3.aByteArray55.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass3_Sub30_Sub1_3.aBoolean313) {
			@Pc(38) int local38 = local8 + local8 - arg0.aClass3_Sub30_Sub1_3.anInt4762;
			local8 <<= 0x8;
			local27 = (int) ((long) this.anIntArray113[arg0.anInt6663] * (long) local38 >> 6);
			if (local8 <= local27) {
				local27 = local8 + local8 - local27 - 1;
				arg0.aClass3_Sub7_Sub3_3.method4073();
			}
		} else {
			local27 = (int) ((long) this.anIntArray113[arg0.anInt6663] * (long) local8 >> 6);
		}
		arg0.aClass3_Sub7_Sub3_3.method4044(local27);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(JZZLclient!oba;B)V")
	public synchronized void method2459(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class3_Sub39 arg2) {
		this.method2473(arg1, true, arg2);
		this.method2444((long) this.aClass278_1.anInt8096 * arg0);
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "()Lclient!os;")
	@Override
	public synchronized Class3_Sub7 method8760() {
		return null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!oba;ZB)V")
	public synchronized void method2460(@OriginalArg(0) Class3_Sub39 arg0, @OriginalArg(1) boolean arg1) {
		this.method2473(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(Z)V")
	public synchronized void method2461() {
		this.method2469(true);
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(II)V")
	private void method2462(@OriginalArg(1) int arg0) {
		if ((this.anIntArray119[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(21) Class3_Sub36 local21 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5874(); local21 != null; local21 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5870()) {
			if (local21.anInt6663 == arg0 && this.aClass3_Sub36ArrayArray2[arg0][local21.anInt6666] == null && local21.anInt6673 < 0) {
				local21.anInt6673 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public synchronized void method2463() {
		for (@Pc(7) Class3_Sub44 local7 = (Class3_Sub44) this.aClass280_11.method7110(); local7 != null; local7 = (Class3_Sub44) this.aClass280_11.method7108()) {
			local7.method6955();
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V")
	private void method2464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V")
	private void method2465(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3_Sub36 local12 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5874(); local12 != null; local12 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5870()) {
			if (arg0 < 0 || arg0 == local12.anInt6663) {
				if (local12.aClass3_Sub7_Sub3_3 != null) {
					local12.aClass3_Sub7_Sub3_3.method4064(Static276.anInt4980 / 100);
					if (local12.aClass3_Sub7_Sub3_3.method4067()) {
						this.aClass3_Sub7_Sub5_1.aClass3_Sub7_Sub1_2.method1626(local12.aClass3_Sub7_Sub3_3);
					}
					local12.method5729();
				}
				if (local12.anInt6673 < 0) {
					this.aClass3_Sub36ArrayArray2[local12.anInt6663][local12.anInt6666] = null;
				}
				local12.method8769();
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(IIII)V")
	private void method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub36 local12 = this.aClass3_Sub36ArrayArray2[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub36ArrayArray2[arg1][arg0] = null;
		if ((this.anIntArray119[arg1] & 0x2) == 0) {
			local12.anInt6673 = 0;
			return;
		}
		for (@Pc(39) Class3_Sub36 local39 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5874(); local39 != null; local39 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5870()) {
			if (local12.anInt6663 == local39.anInt6663 && local39.anInt6673 < 0 && local12 != local39) {
				local12.anInt6673 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(III)V")
	private void method2467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray126[arg1] = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!md;II[I)Z")
	public boolean method2468(@OriginalArg(1) Class3_Sub36 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0.anInt6672 = Static276.anInt4980 / 100;
		if (arg0.anInt6673 >= 0 && (arg0.aClass3_Sub7_Sub3_3 == null || arg0.aClass3_Sub7_Sub3_3.method4050())) {
			arg0.method5729();
			arg0.method8769();
			if (arg0.anInt6676 > 0 && this.aClass3_Sub36ArrayArray1[arg0.anInt6663][arg0.anInt6676] == arg0) {
				this.aClass3_Sub36ArrayArray1[arg0.anInt6663][arg0.anInt6676] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg0.anInt6674;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray114[arg0.anInt6663] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg0.anInt6674 = local59;
		}
		arg0.aClass3_Sub7_Sub3_3.method4070(this.method2450(arg0));
		@Pc(102) Class197 local102 = arg0.aClass197_1;
		arg0.anInt6670++;
		arg0.anInt6678 += local102.anInt5879;
		@Pc(125) boolean local125 = false;
		@Pc(143) double local143 = (double) ((arg0.anInt6674 * arg0.anInt6669 >> 12) + (arg0.anInt6666 - 60 << 8)) * 5.086263020833333E-6D;
		if (local102.anInt5877 > 0) {
			if (local102.anInt5883 <= 0) {
				arg0.anInt6671 += 128;
			} else {
				arg0.anInt6671 += (int) (Math.pow(2.0D, local143 * (double) local102.anInt5883) * 128.0D + 0.5D);
			}
			if (arg0.anInt6671 * local102.anInt5877 >= 819200) {
				local125 = true;
			}
		}
		if (local102.aByteArray62 != null) {
			if (local102.anInt5884 > 0) {
				arg0.anInt6680 += (int) (Math.pow(2.0D, local143 * (double) local102.anInt5884) * 128.0D + 0.5D);
			} else {
				arg0.anInt6680 += 128;
			}
			while (arg0.anInt6664 < local102.aByteArray62.length - 2 && arg0.anInt6680 > (local102.aByteArray62[arg0.anInt6664 + 2] & 0xFF) << 8) {
				arg0.anInt6664 += 2;
			}
			if (local102.aByteArray62.length - 2 == arg0.anInt6664 && local102.aByteArray62[arg0.anInt6664 + 1] == 0) {
				local125 = true;
			}
		}
		if (arg0.anInt6673 >= 0 && local102.aByteArray63 != null && (this.anIntArray119[arg0.anInt6663] & 0x1) == 0 && (arg0.anInt6676 < 0 || this.aClass3_Sub36ArrayArray1[arg0.anInt6663][arg0.anInt6676] != arg0)) {
			if (local102.anInt5878 <= 0) {
				arg0.anInt6673 += 128;
			} else {
				arg0.anInt6673 += (int) (Math.pow(2.0D, local143 * (double) local102.anInt5878) * 128.0D + 0.5D);
			}
			while (local102.aByteArray63.length - 2 > arg0.anInt6665 && (local102.aByteArray63[arg0.anInt6665 + 2] & 0xFF) << 8 < arg0.anInt6673) {
				arg0.anInt6665 += 2;
			}
			if (local102.aByteArray63.length - 2 == arg0.anInt6665) {
				local125 = true;
			}
		}
		if (!local125) {
			arg0.aClass3_Sub7_Sub3_3.method4065(arg0.anInt6672, this.method2442(arg0), this.method2470(arg0));
			return false;
		}
		arg0.aClass3_Sub7_Sub3_3.method4064(arg0.anInt6672);
		if (arg3 == null) {
			arg0.aClass3_Sub7_Sub3_3.method8758(arg2);
		} else {
			arg0.aClass3_Sub7_Sub3_3.method8757(arg3, arg1, arg2);
		}
		if (arg0.aClass3_Sub7_Sub3_3.method4067()) {
			this.aClass3_Sub7_Sub5_1.aClass3_Sub7_Sub1_2.method1626(arg0.aClass3_Sub7_Sub3_3);
		}
		arg0.method5729();
		if (arg0.anInt6673 >= 0) {
			arg0.method8769();
			if (arg0.anInt6676 > 0 && this.aClass3_Sub36ArrayArray1[arg0.anInt6663][arg0.anInt6676] == arg0) {
				this.aClass3_Sub36ArrayArray1[arg0.anInt6663][arg0.anInt6676] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)V")
	private synchronized void method2469(@OriginalArg(0) boolean arg0) {
		this.aClass278_1.method7018();
		this.aClass3_Sub39_1 = null;
		this.method2451(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(ILclient!md;)I")
	private int method2470(@OriginalArg(1) Class3_Sub36 arg0) {
		@Pc(15) int local15 = this.anIntArray127[arg0.anInt6663];
		return local15 >= 8192 ? 16384 - ((16384 - local15) * (-arg0.anInt6668 + 128) + 32 >> 6) : local15 * arg0.anInt6668 - -32 >> 6;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(IIB)V")
	public synchronized void method2471() {
		this.method2472();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8758(@OriginalArg(0) int arg0) {
		if (this.aClass278_1.method7031()) {
			@Pc(14) int local14 = this.aClass278_1.anInt8096 * this.anInt2595 / Static276.anInt4980;
			do {
				@Pc(24) long local24 = this.aLong55 + (long) arg0 * (long) local14;
				if (this.aLong56 - local24 >= 0L) {
					this.aLong55 = local24;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong56 + (long) local14 - this.aLong55 - 1L) / (long) local14);
				this.aLong55 += (long) local52 * (long) local14;
				this.aClass3_Sub7_Sub5_1.method8758(local52);
				arg0 -= local52;
				this.method2454();
			} while (this.aClass278_1.method7031());
		}
		this.aClass3_Sub7_Sub5_1.method8758(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(IIB)V")
	private void method2472() {
		this.anIntArray117[9] = 128;
		this.anIntArray122[9] = 128;
		this.method2443(128, 9);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZLclient!oba;I)V")
	private synchronized void method2473(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub39 arg2) {
		this.method2469(arg1);
		this.aClass278_1.method7027(arg2.aByteArray75);
		this.aLong55 = 0L;
		this.aBoolean177 = arg0;
		@Pc(24) int local24 = this.aClass278_1.method7028();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass278_1.method7024(local26);
			this.aClass278_1.method7019(local26);
			this.aClass278_1.method7020(local26);
		}
		this.anInt2638 = this.aClass278_1.method7022();
		this.anInt2639 = this.aClass278_1.anIntArray505[this.anInt2638];
		this.aLong56 = this.aClass278_1.method7032(this.anInt2639);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI)V")
	public synchronized void method2474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0) {
			for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
				this.anIntArray120[local11] = arg0;
			}
		} else {
			this.anIntArray120[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(ZI)V")
	private void method2475(@OriginalArg(1) int arg0) {
		if ((this.anIntArray119[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(25) Class3_Sub36 local25 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5874(); local25 != null; local25 = (Class3_Sub36) this.aClass3_Sub7_Sub5_1.aClass223_63.method5870()) {
			if (local25.anInt6663 == arg0) {
				local25.anInt6675 = 0;
			}
		}
	}
}
