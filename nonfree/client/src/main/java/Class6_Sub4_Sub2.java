import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class6_Sub4_Sub2 extends Class6_Sub4 {

	@OriginalMember(owner = "client!jga", name = "Hb", descriptor = "I")
	private int anInt5742;

	@OriginalMember(owner = "client!jga", name = "Jb", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!jga", name = "Kb", descriptor = "Z")
	private boolean aBoolean448;

	@OriginalMember(owner = "client!jga", name = "Lb", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!jga", name = "Mb", descriptor = "I")
	private int anInt5743;

	@OriginalMember(owner = "client!jga", name = "Nb", descriptor = "Lclient!cf;")
	private Class6_Sub12 aClass6_Sub12_2;

	@OriginalMember(owner = "client!jga", name = "Ob", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!jga", name = "Pb", descriptor = "I")
	private int anInt5744;

	@OriginalMember(owner = "client!jga", name = "x", descriptor = "[I")
	private final int[] anIntArray239 = new int[16];

	@OriginalMember(owner = "client!jga", name = "L", descriptor = "[[Lclient!hea;")
	private final Class6_Sub24[][] aClass6_Sub24ArrayArray1 = new Class6_Sub24[16][128];

	@OriginalMember(owner = "client!jga", name = "T", descriptor = "[[Lclient!hea;")
	private final Class6_Sub24[][] aClass6_Sub24ArrayArray2 = new Class6_Sub24[16][128];

	@OriginalMember(owner = "client!jga", name = "X", descriptor = "[I")
	private final int[] anIntArray242 = new int[16];

	@OriginalMember(owner = "client!jga", name = "N", descriptor = "[I")
	private final int[] anIntArray240 = new int[16];

	@OriginalMember(owner = "client!jga", name = "bb", descriptor = "[I")
	private final int[] anIntArray243 = new int[16];

	@OriginalMember(owner = "client!jga", name = "jb", descriptor = "[I")
	private final int[] anIntArray245 = new int[16];

	@OriginalMember(owner = "client!jga", name = "mb", descriptor = "[I")
	private final int[] anIntArray246 = new int[16];

	@OriginalMember(owner = "client!jga", name = "W", descriptor = "[I")
	private final int[] anIntArray241 = new int[16];

	@OriginalMember(owner = "client!jga", name = "rb", descriptor = "[I")
	private final int[] anIntArray248 = new int[16];

	@OriginalMember(owner = "client!jga", name = "O", descriptor = "I")
	private final int anInt5714 = 1000000;

	@OriginalMember(owner = "client!jga", name = "xb", descriptor = "[I")
	public final int[] anIntArray250 = new int[16];

	@OriginalMember(owner = "client!jga", name = "tb", descriptor = "[I")
	private final int[] anIntArray249 = new int[16];

	@OriginalMember(owner = "client!jga", name = "pb", descriptor = "I")
	private int anInt5732 = 256;

	@OriginalMember(owner = "client!jga", name = "zb", descriptor = "[I")
	public final int[] anIntArray252 = new int[16];

	@OriginalMember(owner = "client!jga", name = "yb", descriptor = "[I")
	private final int[] anIntArray251 = new int[16];

	@OriginalMember(owner = "client!jga", name = "Bb", descriptor = "[I")
	public final int[] anIntArray253 = new int[16];

	@OriginalMember(owner = "client!jga", name = "s", descriptor = "[I")
	private final int[] anIntArray238 = new int[16];

	@OriginalMember(owner = "client!jga", name = "Eb", descriptor = "[I")
	private final int[] anIntArray254 = new int[16];

	@OriginalMember(owner = "client!jga", name = "ob", descriptor = "[I")
	private final int[] anIntArray247 = new int[16];

	@OriginalMember(owner = "client!jga", name = "F", descriptor = "Lclient!lj;")
	private final Class187 aClass187_1 = new Class187();

	@OriginalMember(owner = "client!jga", name = "Ib", descriptor = "Lclient!ap;")
	private final Class6_Sub4_Sub1 aClass6_Sub4_Sub1_1 = new Class6_Sub4_Sub1(this);

	@OriginalMember(owner = "client!jga", name = "w", descriptor = "Lclient!wr;")
	private final Class380 aClass380_19;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub2() {
		this.aClass380_19 = new Class380(128);
		this.method4804(-1, 256);
		this.method4772(true);
	}

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!jga;)V")
	public Class6_Sub4_Sub2(@OriginalArg(0) Class6_Sub4_Sub2 arg0) {
		this.aClass380_19 = arg0.aClass380_19;
		this.method4804(-1, 256);
		this.method4772(true);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZI)V")
	private void method4772(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4796(-1);
		} else {
			this.method4776(-1);
		}
		this.method4783(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray246[local23] = this.anIntArray242[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray251[local41] = this.anIntArray242[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZLclient!cf;B)V")
	public synchronized void method4773(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		this.method4784(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILclient!hea;)I")
	private int method4775(@OriginalArg(1) Class6_Sub24 arg0) {
		if (this.anIntArray254[arg0.anInt4565] == 0) {
			return 0;
		}
		@Pc(14) Class105 local14 = arg0.aClass105_1;
		@Pc(30) int local30 = this.anIntArray243[arg0.anInt4565] * this.anIntArray240[arg0.anInt4565] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt4553 * local38 + 16384 >> 15;
		@Pc(56) int local56 = this.anInt5732 * local47 + 128 >> 8;
		local30 = local56 * this.anIntArray254[arg0.anInt4565] + 128 >> 8;
		if (local14.anInt3662 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) arg0.anInt4560 * 1.953125E-5D * (double) local14.anInt3662) * (double) local30 + 0.5D);
		}
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(124) int local124;
		@Pc(136) int local136;
		if (local14.aByteArray25 != null) {
			local98 = arg0.anInt4548;
			local106 = local14.aByteArray25[arg0.anInt4563 + 1];
			if (local14.aByteArray25.length - 2 > arg0.anInt4563) {
				local124 = (local14.aByteArray25[arg0.anInt4563] & 0xFF) << 8;
				local136 = (local14.aByteArray25[arg0.anInt4563 + 2] & 0xFF) << 8;
				local106 += (local14.aByteArray25[arg0.anInt4563 + 3] - local106) * (local98 - local124) / (local136 - local124);
			}
			local30 = local106 * local30 + 32 >> 6;
		}
		if (arg0.anInt4558 > 0 && local14.aByteArray24 != null) {
			local98 = arg0.anInt4558;
			local106 = local14.aByteArray24[arg0.anInt4550 + 1];
			if (arg0.anInt4550 < local14.aByteArray24.length - 2) {
				local124 = (local14.aByteArray24[arg0.anInt4550] & 0xFF) << 8;
				local136 = (local14.aByteArray24[arg0.anInt4550 + 2] & 0xFF) << 8;
				local106 += (local98 - local124) * (-local106 + local14.aByteArray24[arg0.anInt4550 - -3]) / (local136 - local124);
			}
			local30 = local106 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(II)V")
	private void method4776(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class6_Sub24 local18 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4966(); local18 != null; local18 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4965()) {
			if ((arg0 < 0 || local18.anInt4565 == arg0) && local18.anInt4558 < 0) {
				this.aClass6_Sub24ArrayArray1[local18.anInt4565][local18.anInt4562] = null;
				local18.anInt4558 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IB)V")
	private void method4778(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local17 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method4794(local30, local24, local36);
		} else if (local17 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 <= 0) {
				this.method4794(local30, local24, 64);
			} else {
				this.method4787(local30, local36, local24);
			}
		} else if (local17 == 160) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method4779(local30, local24, local36);
		} else if (local17 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray251[local24] = (local36 << 14) + (this.anIntArray251[local24] & 0xFFE03FFF);
			}
			if (local30 == 32) {
				this.anIntArray251[local24] = (local36 << 7) + (this.anIntArray251[local24] & 0xFFFFC07F);
			}
			if (local30 == 1) {
				this.anIntArray239[local24] = (this.anIntArray239[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 33) {
				this.anIntArray239[local24] = local36 + (this.anIntArray239[local24] & 0xFFFFFF80);
			}
			if (local30 == 5) {
				this.anIntArray247[local24] = (local36 << 7) + (this.anIntArray247[local24] & 0xFFFFC07F);
			}
			if (local30 == 37) {
				this.anIntArray247[local24] = (this.anIntArray247[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 7) {
				this.anIntArray243[local24] = (this.anIntArray243[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 39) {
				this.anIntArray243[local24] = (this.anIntArray243[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 10) {
				this.anIntArray249[local24] = (this.anIntArray249[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 42) {
				this.anIntArray249[local24] = (this.anIntArray249[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 11) {
				this.anIntArray240[local24] = (this.anIntArray240[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 43) {
				this.anIntArray240[local24] = (this.anIntArray240[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 64) {
				if (local36 < 64) {
					this.anIntArray250[local24] &= 0xFFFFFFFE;
				} else {
					this.anIntArray250[local24] |= 0x1;
				}
			}
			if (local30 == 65) {
				if (local36 < 64) {
					this.method4810(local24);
					this.anIntArray250[local24] &= 0xFFFFFFFD;
				} else {
					this.anIntArray250[local24] |= 0x2;
				}
			}
			if (local30 == 99) {
				this.anIntArray241[local24] = (this.anIntArray241[local24] & 0x7F) + (local36 << 7);
			}
			if (local30 == 98) {
				this.anIntArray241[local24] = local36 + (this.anIntArray241[local24] & 0x3F80);
			}
			if (local30 == 101) {
				this.anIntArray241[local24] = (this.anIntArray241[local24] & 0x7F) + (local36 << 7) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray241[local24] = local36 + (this.anIntArray241[local24] & 0x3F80) + 16384;
			}
			if (local30 == 120) {
				this.method4796(local24);
			}
			if (local30 == 121) {
				this.method4783(local24);
			}
			if (local30 == 123) {
				this.method4776(local24);
			}
			@Pc(513) int local513;
			if (local30 == 6) {
				local513 = this.anIntArray241[local24];
				if (local513 == 16384) {
					this.anIntArray238[local24] = (this.anIntArray238[local24] & 0xFFFFC07F) + (local36 << 7);
				}
			}
			if (local30 == 38) {
				local513 = this.anIntArray241[local24];
				if (local513 == 16384) {
					this.anIntArray238[local24] = (this.anIntArray238[local24] & 0xFFFFFF80) + local36;
				}
			}
			if (local30 == 16) {
				this.anIntArray252[local24] = (this.anIntArray252[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 48) {
				this.anIntArray252[local24] = local36 + (this.anIntArray252[local24] & 0xFFFFFF80);
			}
			if (local30 == 81) {
				if (local36 >= 64) {
					this.anIntArray250[local24] |= 0x4;
				} else {
					this.method4809(local24);
					this.anIntArray250[local24] &= 0xFFFFFFFB;
				}
			}
			if (local30 == 17) {
				this.method4789(local24, (this.anIntArray248[local24] & 0xFFFFC07F) + (local36 << 7));
			}
			if (local30 == 49) {
				this.method4789(local24, (this.anIntArray248[local24] & 0xFFFFFF80) + local36);
			}
		} else if (local17 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method4788(this.anIntArray251[local24] + local30, local24);
		} else if (local17 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method4806(local30, local24);
		} else if (local17 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0001) >> 9);
			this.method4803(local24, local30);
		} else {
			local17 = arg0 & 0xFF;
			if (local17 == 255) {
				this.method4772(true);
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIZI)V")
	private void method4779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I[IIILclient!hea;)Z")
	public boolean method4781(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub24 arg3) {
		arg3.anInt4551 = Static322.anInt6392 / 100;
		if (arg3.anInt4558 >= 0 && (arg3.aClass6_Sub4_Sub5_1 == null || arg3.aClass6_Sub4_Sub5_1.method8646())) {
			arg3.method3778();
			arg3.method8792();
			if (arg3.anInt4559 > 0 && this.aClass6_Sub24ArrayArray2[arg3.anInt4565][arg3.anInt4559] == arg3) {
				this.aClass6_Sub24ArrayArray2[arg3.anInt4565][arg3.anInt4559] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg3.anInt4557;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray247[arg3.anInt4565] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg3.anInt4557 = local53;
		}
		arg3.aClass6_Sub4_Sub5_1.method8652(this.method4791(arg3));
		@Pc(90) Class105 local90 = arg3.aClass105_1;
		arg3.anInt4549++;
		@Pc(98) boolean local98 = false;
		arg3.anInt4566 += local90.anInt3664;
		@Pc(123) double local123 = (double) ((arg3.anInt4562 - 60 << 8) + (arg3.anInt4564 * arg3.anInt4557 >> 12)) * 5.086263020833333E-6D;
		if (local90.anInt3662 > 0) {
			if (local90.anInt3666 <= 0) {
				arg3.anInt4560 += 128;
			} else {
				arg3.anInt4560 += (int) (Math.pow(2.0D, (double) local90.anInt3666 * local123) * 128.0D + 0.5D);
			}
			if (local90.anInt3662 * arg3.anInt4560 >= 819200) {
				local98 = true;
			}
		}
		if (local90.aByteArray25 != null) {
			if (local90.anInt3665 <= 0) {
				arg3.anInt4548 += 128;
			} else {
				arg3.anInt4548 += (int) (Math.pow(2.0D, local123 * (double) local90.anInt3665) * 128.0D + 0.5D);
			}
			while (local90.aByteArray25.length - 2 > arg3.anInt4563 && arg3.anInt4548 > (local90.aByteArray25[arg3.anInt4563 + 2] & 0xFF) << 8) {
				arg3.anInt4563 += 2;
			}
			if (arg3.anInt4563 == local90.aByteArray25.length - 2 && local90.aByteArray25[arg3.anInt4563 + 1] == 0) {
				local98 = true;
			}
		}
		if (arg3.anInt4558 >= 0 && local90.aByteArray24 != null && (this.anIntArray250[arg3.anInt4565] & 0x1) == 0 && (arg3.anInt4559 < 0 || arg3 != this.aClass6_Sub24ArrayArray2[arg3.anInt4565][arg3.anInt4559])) {
			if (local90.anInt3667 <= 0) {
				arg3.anInt4558 += 128;
			} else {
				arg3.anInt4558 += (int) (Math.pow(2.0D, local123 * (double) local90.anInt3667) * 128.0D + 0.5D);
			}
			while (local90.aByteArray24.length - 2 > arg3.anInt4550 && (local90.aByteArray24[arg3.anInt4550 + 2] & 0xFF) << 8 < arg3.anInt4558) {
				arg3.anInt4550 += 2;
			}
			if (local90.aByteArray24.length - 2 == arg3.anInt4550) {
				local98 = true;
			}
		}
		if (!local98) {
			arg3.aClass6_Sub4_Sub5_1.method8657(arg3.anInt4551, this.method4775(arg3), this.method4792(arg3));
			return false;
		}
		arg3.aClass6_Sub4_Sub5_1.method8668(arg3.anInt4551);
		if (arg1 == null) {
			arg3.aClass6_Sub4_Sub5_1.method8631(arg0);
		} else {
			arg3.aClass6_Sub4_Sub5_1.method8635(arg1, arg2, arg0);
		}
		if (arg3.aClass6_Sub4_Sub5_1.method8670()) {
			this.aClass6_Sub4_Sub1_1.aClass6_Sub4_Sub3_1.method5194(arg3.aClass6_Sub4_Sub5_1);
		}
		arg3.method3778();
		if (arg3.anInt4558 >= 0) {
			arg3.method8792();
			if (arg3.anInt4559 > 0 && arg3 == this.aClass6_Sub24ArrayArray2[arg3.anInt4565][arg3.anInt4559]) {
				this.aClass6_Sub24ArrayArray2[arg3.anInt4565][arg3.anInt4559] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZZLclient!cf;JI)V")
	public synchronized void method4782(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6_Sub12 arg1, @OriginalArg(3) long arg2) {
		this.method4784(arg1, true, arg0);
		this.method4800((long) this.aClass187_1.anInt6394 * arg2);
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(II)V")
	private void method4783(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4783(local12);
			}
			return;
		}
		this.anIntArray243[arg0] = 12800;
		this.anIntArray249[arg0] = 8192;
		this.anIntArray240[arg0] = 16383;
		this.anIntArray245[arg0] = 8192;
		this.anIntArray239[arg0] = 0;
		this.anIntArray247[arg0] = 8192;
		this.method4810(arg0);
		this.method4809(arg0);
		this.anIntArray250[arg0] = 0;
		this.anIntArray241[arg0] = 32767;
		this.anIntArray238[arg0] = 256;
		this.anIntArray252[arg0] = 0;
		this.method4789(arg0, 8192);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!cf;ZZI)V")
	private synchronized void method4784(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method4785(arg1);
		this.aClass187_1.method5365(arg0.aByteArray11);
		this.aBoolean448 = arg2;
		this.aLong158 = 0L;
		@Pc(33) int local33 = this.aClass187_1.method5366();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			this.aClass187_1.method5363(local35);
			this.aClass187_1.method5364(local35);
			this.aClass187_1.method5360(local35);
		}
		this.anInt5742 = this.aClass187_1.method5359();
		this.anInt5743 = this.aClass187_1.anIntArray297[this.anInt5742];
		this.aLong159 = this.aClass187_1.method5355(this.anInt5743);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IZ)V")
	private synchronized void method4785(@OriginalArg(1) boolean arg0) {
		this.aClass187_1.method5353();
		this.aClass6_Sub12_2 = null;
		this.method4772(arg0);
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(ILclient!hea;)Z")
	public boolean method4786(@OriginalArg(1) Class6_Sub24 arg0) {
		if (arg0.aClass6_Sub4_Sub5_1 != null) {
			return false;
		}
		if (arg0.anInt4558 >= 0) {
			arg0.method8792();
			if (arg0.anInt4559 > 0 && arg0 == this.aClass6_Sub24ArrayArray2[arg0.anInt4565][arg0.anInt4559]) {
				this.aClass6_Sub24ArrayArray2[arg0.anInt4565][arg0.anInt4559] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIII)V")
	private void method4787(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4794(arg0, arg2, 64);
		if ((this.anIntArray250[arg2] & 0x2) != 0) {
			for (@Pc(28) Class6_Sub24 local28 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4975(); local28 != null; local28 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4964()) {
				if (arg2 == local28.anInt4565 && local28.anInt4558 < 0) {
					this.aClass6_Sub24ArrayArray1[arg2][local28.anInt4562] = null;
					this.aClass6_Sub24ArrayArray1[arg2][arg0] = local28;
					@Pc(67) int local67 = local28.anInt4554 + (local28.anInt4564 * local28.anInt4557 >> 12);
					local28.anInt4554 += arg0 - local28.anInt4562 << 8;
					local28.anInt4564 = local67 - local28.anInt4554;
					local28.anInt4562 = arg0;
					local28.anInt4557 = 4096;
					return;
				}
			}
		}
		@Pc(121) Class6_Sub46 local121 = (Class6_Sub46) this.aClass380_19.method8747((long) this.anIntArray246[arg2]);
		if (local121 == null) {
			return;
		}
		@Pc(129) Class6_Sub27_Sub1 local129 = local121.aClass6_Sub27_Sub1Array1[arg0];
		if (local129 == null) {
			return;
		}
		@Pc(136) Class6_Sub24 local136 = new Class6_Sub24();
		local136.aClass6_Sub27_Sub1_1 = local129;
		local136.anInt4565 = arg2;
		local136.aClass6_Sub46_1 = local121;
		local136.aClass105_1 = local121.aClass105Array1[arg0];
		local136.anInt4559 = local121.aByteArray89[arg0];
		local136.anInt4562 = arg0;
		local136.anInt4553 = local121.anInt9359 * arg1 * arg1 * local121.aByteArray90[arg0] + 1024 >> 11;
		local136.anInt4552 = local121.aByteArray88[arg0] & 0xFF;
		local136.anInt4554 = (arg0 << 8) - (local121.aShortArray161[arg0] & 0x7FFF);
		local136.anInt4560 = 0;
		local136.anInt4563 = 0;
		local136.anInt4548 = 0;
		local136.anInt4550 = 0;
		local136.anInt4558 = -1;
		if (this.anIntArray252[arg2] == 0) {
			local136.aClass6_Sub4_Sub5_1 = Static656.method8647(local129, this.method4791(local136), this.method4775(local136), this.method4792(local136));
		} else {
			local136.aClass6_Sub4_Sub5_1 = Static656.method8647(local129, this.method4791(local136), 0, this.method4792(local136));
			this.method4802(local121.aShortArray161[arg0] < 0, local136);
		}
		if (local121.aShortArray161[arg0] < 0) {
			local136.aClass6_Sub4_Sub5_1.method8667(-1);
		}
		if (local136.anInt4559 >= 0) {
			@Pc(284) Class6_Sub24 local284 = this.aClass6_Sub24ArrayArray2[arg2][local136.anInt4559];
			if (local284 != null && local284.anInt4558 < 0) {
				this.aClass6_Sub24ArrayArray1[arg2][local284.anInt4562] = null;
				local284.anInt4558 = 0;
			}
			this.aClass6_Sub24ArrayArray2[arg2][local136.anInt4559] = local136;
		}
		this.aClass6_Sub4_Sub1_1.aClass163_9.method4967(local136);
		this.aClass6_Sub24ArrayArray1[arg2][arg0] = local136;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BII)V")
	private void method4788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray246[arg1] != arg0) {
			this.anIntArray246[arg1] = arg0;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass6_Sub24ArrayArray2[arg1][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(III)V")
	private void method4789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray248[arg0] = arg1;
		this.anIntArray253[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)V")
	public synchronized void method4790() {
		for (@Pc(17) Class6_Sub46 local17 = (Class6_Sub46) this.aClass380_19.method8755(); local17 != null; local17 = (Class6_Sub46) this.aClass380_19.method8752()) {
			local17.method8792();
		}
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(ILclient!hea;)I")
	private int method4791(@OriginalArg(1) Class6_Sub24 arg0) {
		@Pc(14) int local14 = (arg0.anInt4564 * arg0.anInt4557 >> 12) + arg0.anInt4554;
		local14 += (this.anIntArray245[arg0.anInt4565] - 8192) * this.anIntArray238[arg0.anInt4565] >> 12;
		@Pc(35) Class105 local35 = arg0.aClass105_1;
		@Pc(58) int local58;
		if (local35.anInt3664 > 0 && (local35.anInt3663 > 0 || this.anIntArray239[arg0.anInt4565] > 0)) {
			local58 = local35.anInt3663 << 2;
			@Pc(63) int local63 = local35.anInt3669 << 1;
			if (arg0.anInt4549 < local63) {
				local58 = arg0.anInt4549 * local58 / local63;
			}
			local58 += this.anIntArray239[arg0.anInt4565] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt4566 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local58 * local97);
		}
		local58 = (int) ((double) (arg0.aClass6_Sub27_Sub1_1.anInt5146 * 256) * Math.pow((double) 2, (double) local14 * 3.255208333333333E-4D) / (double) Static322.anInt6392 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!hea;I)I")
	private int method4792(@OriginalArg(0) Class6_Sub24 arg0) {
		@Pc(17) int local17 = this.anIntArray249[arg0.anInt4565];
		return local17 < 8192 ? arg0.anInt4552 * local17 + 32 >> 6 : 16384 - ((128 - arg0.anInt4552) * (-local17 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!cf;ILclient!sv;Lclient!ni;Z)Z")
	public synchronized boolean method4793(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(2) Class315 arg1, @OriginalArg(3) Class223 arg2) {
		arg0.method2001();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(34) Class6_Sub21 local34 = (Class6_Sub21) arg0.aClass380_4.method8755(); local34 != null; local34 = (Class6_Sub21) arg0.aClass380_4.method8752()) {
			@Pc(40) int local40 = (int) local34.aLong278;
			@Pc(48) Class6_Sub46 local48 = (Class6_Sub46) this.aClass380_19.method8747((long) local40);
			if (local48 == null) {
				local48 = Static607.method8354(local40, arg2);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass380_19.method8753(local48, (long) local40);
			}
			if (!local48.method7638(local34.aByteArray28, arg1, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method2000();
		}
		return local9;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(IIII)V")
	private void method4794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class6_Sub24 local18 = this.aClass6_Sub24ArrayArray1[arg1][arg0];
		if (local18 == null) {
			return;
		}
		this.aClass6_Sub24ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray250[arg1] & 0x2) == 0) {
			local18.anInt4558 = 0;
			return;
		}
		for (@Pc(49) Class6_Sub24 local49 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4966(); local49 != null; local49 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4965()) {
			if (local49.anInt4565 == local18.anInt4565 && local49.anInt4558 < 0 && local18 != local49) {
				local18.anInt4558 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8631(@OriginalArg(0) int arg0) {
		if (this.aClass187_1.method5354()) {
			@Pc(14) int local14 = this.anInt5714 * this.aClass187_1.anInt6394 / Static322.anInt6392;
			do {
				@Pc(24) long local24 = this.aLong158 + (long) local14 * (long) arg0;
				if (this.aLong159 - local24 >= 0L) {
					this.aLong158 = local24;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong159 - this.aLong158 - 1L) / (long) local14);
				this.aLong158 += (long) local14 * (long) local52;
				arg0 -= local52;
				this.aClass6_Sub4_Sub1_1.method8631(local52);
				this.method4811();
			} while (this.aClass187_1.method5354());
		}
		this.aClass6_Sub4_Sub1_1.method8631(arg0);
	}

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)Z")
	public synchronized boolean method4795() {
		return this.aClass187_1.method5354();
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(ZI)V")
	private void method4796(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class6_Sub24 local12 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4966(); local12 != null; local12 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4965()) {
			if (arg0 < 0 || local12.anInt4565 == arg0) {
				if (local12.aClass6_Sub4_Sub5_1 != null) {
					local12.aClass6_Sub4_Sub5_1.method8668(Static322.anInt6392 / 100);
					if (local12.aClass6_Sub4_Sub5_1.method8670()) {
						this.aClass6_Sub4_Sub1_1.aClass6_Sub4_Sub3_1.method5194(local12.aClass6_Sub4_Sub5_1);
					}
					local12.method3778();
				}
				if (local12.anInt4558 < 0) {
					this.aClass6_Sub24ArrayArray1[local12.anInt4565][local12.anInt4562] = null;
				}
				local12.method8792();
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "()Lclient!mha;")
	@Override
	public synchronized Class6_Sub4 method8637() {
		return null;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIZ)V")
	private void method4797() {
		this.anIntArray242[9] = 128;
		this.anIntArray251[9] = 128;
		this.method4788(128, 9);
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(III)V")
	public synchronized void method4798() {
		this.method4797();
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(B)V")
	public synchronized void method4799() {
		for (@Pc(17) Class6_Sub46 local17 = (Class6_Sub46) this.aClass380_19.method8755(); local17 != null; local17 = (Class6_Sub46) this.aClass380_19.method8752()) {
			local17.method7634();
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BJ)V")
	private void method4800(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong159) {
			@Pc(10) int local10 = this.anInt5742;
			@Pc(13) int local13 = this.anInt5743;
			@Pc(16) long local16 = this.aLong159;
			while (this.anInt5743 == local13) {
				while (local13 == this.aClass187_1.anIntArray297[local10]) {
					this.aClass187_1.method5363(local10);
					@Pc(27) int local27 = this.aClass187_1.method5367(local10);
					if (local27 == 1) {
						this.aClass187_1.method5361();
						this.aClass187_1.method5360(local10);
						if (this.aClass187_1.method5358()) {
							if (!this.aBoolean448 || local13 == 0) {
								this.method4772(true);
								this.aClass187_1.method5353();
								return;
							}
							this.aClass187_1.method5356(local16);
						}
						break;
					}
					if ((local27 & 0x80) != 0 && (local27 & 0xF0) != 144) {
						this.method4778(local27);
					}
					this.aClass187_1.method5364(local10);
					this.aClass187_1.method5360(local10);
				}
				this.aLong158 = local16;
				local10 = this.aClass187_1.method5359();
				local13 = this.aClass187_1.anIntArray297[local10];
				local16 = this.aClass187_1.method5355(local13);
			}
			this.aLong159 = local16;
			this.anInt5743 = local13;
			this.anInt5742 = local10;
		}
	}

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "(I)I")
	public int method4801() {
		return this.anInt5732;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IZLclient!hea;)V")
	public void method4802(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6_Sub24 arg1) {
		@Pc(8) int local8 = arg1.aClass6_Sub27_Sub1_1.aByteArray33.length;
		@Pc(36) int local36;
		if (arg0 && arg1.aClass6_Sub27_Sub1_1.aBoolean413) {
			@Pc(23) int local23 = local8 + local8 - arg1.aClass6_Sub27_Sub1_1.anInt5148;
			local36 = (int) ((long) this.anIntArray252[arg1.anInt4565] * (long) local23 >> 6);
			local8 <<= 0x8;
			if (local36 >= local8) {
				local36 = local8 + local8 - local36 - 1;
				arg1.aClass6_Sub4_Sub5_1.method8656();
			}
		} else {
			local36 = (int) ((long) this.anIntArray252[arg1.anInt4565] * (long) local8 >> 6);
		}
		arg1.aClass6_Sub4_Sub5_1.method8644(local36);
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(III)V")
	private void method4803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray245[arg0] = arg1;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "()Lclient!mha;")
	@Override
	public synchronized Class6_Sub4 method8632() {
		return this.aClass6_Sub4_Sub1_1;
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(III)V")
	public synchronized void method4804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0) {
			this.anIntArray254[arg0] = arg1;
		} else {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.anIntArray254[local12] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "(I)V")
	public synchronized void method4805() {
		this.method4785(true);
	}

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "(III)V")
	private void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(IB)V")
	public synchronized void method4807(@OriginalArg(0) int arg0) {
		this.anInt5732 = arg0;
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(II)V")
	private void method4809(@OriginalArg(1) int arg0) {
		if ((this.anIntArray250[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class6_Sub24 local26 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4966(); local26 != null; local26 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4965()) {
			if (arg0 == local26.anInt4565) {
				local26.anInt4546 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8635(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass187_1.method5354()) {
			@Pc(14) int local14 = this.anInt5714 * this.aClass187_1.anInt6394 / Static322.anInt6392;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong158;
				if (this.aLong159 - local23 >= 0L) {
					this.aLong158 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong159 + (long) local14 - this.aLong158 - 1L) / (long) local14);
				this.aLong158 += (long) local14 * (long) local55;
				this.aClass6_Sub4_Sub1_1.method8635(arg0, arg1, local55);
				arg1 += local55;
				arg2 -= local55;
				this.method4811();
			} while (this.aClass187_1.method5354());
		}
		this.aClass6_Sub4_Sub1_1.method8635(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "(II)V")
	private void method4810(@OriginalArg(0) int arg0) {
		if ((this.anIntArray250[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class6_Sub24 local15 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4966(); local15 != null; local15 = (Class6_Sub24) this.aClass6_Sub4_Sub1_1.aClass163_9.method4965()) {
			if (local15.anInt4565 == arg0 && this.aClass6_Sub24ArrayArray1[arg0][local15.anInt4562] == null && local15.anInt4558 < 0) {
				local15.anInt4558 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "(I)V")
	private void method4811() {
		@Pc(8) int local8 = this.anInt5742;
		@Pc(18) int local18 = this.anInt5743;
		@Pc(21) long local21 = this.aLong159;
		if (this.aClass6_Sub12_2 != null && local18 == this.anInt5744) {
			this.method4784(this.aClass6_Sub12_2, this.aBoolean449, this.aBoolean448);
			this.method4811();
			return;
		}
		while (local18 == this.anInt5743) {
			while (this.aClass187_1.anIntArray297[local8] == local18) {
				this.aClass187_1.method5363(local8);
				@Pc(54) int local54 = this.aClass187_1.method5367(local8);
				if (local54 == 1) {
					this.aClass187_1.method5361();
					this.aClass187_1.method5360(local8);
					if (this.aClass187_1.method5358()) {
						if (this.aClass6_Sub12_2 != null) {
							this.method4773(this.aBoolean448, this.aClass6_Sub12_2);
							this.method4811();
							return;
						}
						if (!this.aBoolean448 || local18 == 0) {
							this.method4772(true);
							this.aClass187_1.method5353();
							return;
						}
						this.aClass187_1.method5356(local21);
					}
					break;
				}
				if ((local54 & 0x80) != 0) {
					this.method4778(local54);
				}
				this.aClass187_1.method5364(local8);
				this.aClass187_1.method5360(local8);
			}
			local8 = this.aClass187_1.method5359();
			local18 = this.aClass187_1.anIntArray297[local8];
			local21 = this.aClass187_1.method5355(local18);
		}
		this.anInt5743 = local18;
		this.anInt5742 = local8;
		this.aLong159 = local21;
		if (this.aClass6_Sub12_2 != null && this.anInt5744 < local18) {
			this.anInt5742 = -1;
			this.anInt5743 = this.anInt5744;
			this.aLong159 = this.aClass187_1.method5355(this.anInt5743);
		}
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "()I")
	@Override
	public synchronized int method8636() {
		return 0;
	}
}
