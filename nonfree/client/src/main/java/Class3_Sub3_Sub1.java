import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!aea", name = "Gb", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!aea", name = "Hb", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!aea", name = "Ib", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!aea", name = "Jb", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!aea", name = "Kb", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!aea", name = "Lb", descriptor = "Lclient!aha;")
	private Class3_Sub6 aClass3_Sub6_2;

	@OriginalMember(owner = "client!aea", name = "Mb", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!aea", name = "Nb", descriptor = "Z")
	private boolean aBoolean12;

	@OriginalMember(owner = "client!aea", name = "G", descriptor = "[I")
	private final int[] anIntArray9 = new int[16];

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "[I")
	private final int[] anIntArray7 = new int[16];

	@OriginalMember(owner = "client!aea", name = "I", descriptor = "[I")
	private final int[] anIntArray11 = new int[16];

	@OriginalMember(owner = "client!aea", name = "M", descriptor = "[I")
	private final int[] anIntArray13 = new int[16];

	@OriginalMember(owner = "client!aea", name = "B", descriptor = "I")
	private final int anInt124 = 1000000;

	@OriginalMember(owner = "client!aea", name = "p", descriptor = "[I")
	private final int[] anIntArray6 = new int[16];

	@OriginalMember(owner = "client!aea", name = "A", descriptor = "[I")
	private final int[] anIntArray8 = new int[16];

	@OriginalMember(owner = "client!aea", name = "bb", descriptor = "[I")
	public final int[] anIntArray16 = new int[16];

	@OriginalMember(owner = "client!aea", name = "V", descriptor = "[I")
	private final int[] anIntArray15 = new int[16];

	@OriginalMember(owner = "client!aea", name = "T", descriptor = "[I")
	private final int[] anIntArray14 = new int[16];

	@OriginalMember(owner = "client!aea", name = "pb", descriptor = "[I")
	public final int[] anIntArray18 = new int[16];

	@OriginalMember(owner = "client!aea", name = "db", descriptor = "[I")
	private final int[] anIntArray17 = new int[16];

	@OriginalMember(owner = "client!aea", name = "jb", descriptor = "I")
	private int anInt146 = 256;

	@OriginalMember(owner = "client!aea", name = "fb", descriptor = "[[Lclient!afa;")
	private final Class3_Sub4[][] aClass3_Sub4ArrayArray1 = new Class3_Sub4[16][128];

	@OriginalMember(owner = "client!aea", name = "tb", descriptor = "[I")
	private final int[] anIntArray19 = new int[16];

	@OriginalMember(owner = "client!aea", name = "J", descriptor = "[I")
	private final int[] anIntArray12 = new int[16];

	@OriginalMember(owner = "client!aea", name = "H", descriptor = "[I")
	private final int[] anIntArray10 = new int[16];

	@OriginalMember(owner = "client!aea", name = "Db", descriptor = "[[Lclient!afa;")
	private final Class3_Sub4[][] aClass3_Sub4ArrayArray2 = new Class3_Sub4[16][128];

	@OriginalMember(owner = "client!aea", name = "yb", descriptor = "[I")
	public final int[] anIntArray21 = new int[16];

	@OriginalMember(owner = "client!aea", name = "Bb", descriptor = "[I")
	private final int[] anIntArray22 = new int[16];

	@OriginalMember(owner = "client!aea", name = "mb", descriptor = "Lclient!uaa;")
	private final Class333 aClass333_1 = new Class333();

	@OriginalMember(owner = "client!aea", name = "Fb", descriptor = "Lclient!hda;")
	private final Class3_Sub3_Sub4 aClass3_Sub3_Sub4_1 = new Class3_Sub3_Sub4(this);

	@OriginalMember(owner = "client!aea", name = "S", descriptor = "Lclient!baa;")
	private final Class25 aClass25_1;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub1() {
		this.aClass25_1 = new Class25(128);
		this.method163(256, -1);
		this.method146(true);
	}

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!aea;)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) Class3_Sub3_Sub1 arg0) {
		this.aClass25_1 = arg0.aClass25_1;
		this.method163(256, -1);
		this.method146(true);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IBI)V")
	private void method135() {
		this.anIntArray17[9] = 128;
		this.anIntArray11[9] = 128;
		this.method143(128, 9);
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V")
	public synchronized void method136() {
		this.method150(true);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
	public synchronized void method137() {
		this.method135();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BII)V")
	private void method138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIB)V")
	private void method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray8[arg1] = arg0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
	private void method140() {
		@Pc(16) int local16 = this.anInt159;
		@Pc(19) int local19 = this.anInt160;
		@Pc(22) long local22 = this.aLong10;
		if (this.aClass3_Sub6_2 != null && this.anInt161 == local19) {
			this.method151(this.aBoolean12, this.aClass3_Sub6_2, this.aBoolean11);
			this.method140();
			return;
		}
		while (local19 == this.anInt160) {
			while (this.aClass333_1.anIntArray585[local16] == local19) {
				this.aClass333_1.method7975(local16);
				@Pc(51) int local51 = this.aClass333_1.method7986(local16);
				if (local51 == 1) {
					this.aClass333_1.method7984();
					this.aClass333_1.method7981(local16);
					if (this.aClass333_1.method7978()) {
						if (this.aClass3_Sub6_2 != null) {
							this.method141(this.aBoolean11, this.aClass3_Sub6_2);
							this.method140();
							return;
						}
						if (!this.aBoolean11 || local19 == 0) {
							this.method146(true);
							this.aClass333_1.method7983();
							return;
						}
						this.aClass333_1.method7982(local22);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method159(local51);
				}
				this.aClass333_1.method7973(local16);
				this.aClass333_1.method7981(local16);
			}
			local16 = this.aClass333_1.method7980();
			local19 = this.aClass333_1.anIntArray585[local16];
			local22 = this.aClass333_1.method7976(local19);
		}
		this.anInt160 = local19;
		this.aLong10 = local22;
		this.anInt159 = local16;
		if (this.aClass3_Sub6_2 != null && this.anInt161 < local19) {
			this.anInt160 = this.anInt161;
			this.anInt159 = -1;
			this.aLong10 = this.aClass333_1.method7976(this.anInt160);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZZLclient!aha;)V")
	public synchronized void method141(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub6 arg1) {
		this.method151(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)V")
	private void method142(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class3_Sub4 local6 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5457(); local6 != null; local6 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5458()) {
			if (arg0 < 0 || local6.anInt190 == arg0) {
				if (local6.aClass3_Sub3_Sub5_1 != null) {
					local6.aClass3_Sub3_Sub5_1.method4693(Static168.anInt3272 / 100);
					if (local6.aClass3_Sub3_Sub5_1.method4706()) {
						this.aClass3_Sub3_Sub4_1.aClass3_Sub3_Sub3_1.method2975(local6.aClass3_Sub3_Sub5_1);
					}
					local6.method195();
				}
				if (local6.anInt186 < 0) {
					this.aClass3_Sub4ArrayArray2[local6.anInt190][local6.anInt178] = null;
				}
				local6.method8682();
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(III)V")
	private void method143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray9[arg1] != arg0) {
			this.anIntArray9[arg1] = arg0;
			for (@Pc(30) int local30 = 0; local30 < 128; local30++) {
				this.aClass3_Sub4ArrayArray1[arg1][local30] = null;
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4678(@OriginalArg(0) int arg0) {
		if (this.aClass333_1.method7979()) {
			@Pc(18) int local18 = this.anInt124 * this.aClass333_1.anInt9329 / Static168.anInt3272;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong9;
				if (this.aLong10 - local27 >= 0L) {
					this.aLong9 = local27;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong10 + (long) local18 - this.aLong9 - 1L) / (long) local18);
				this.aLong9 += (long) local59 * (long) local18;
				arg0 -= local59;
				this.aClass3_Sub3_Sub4_1.method4678(local59);
				this.method140();
			} while (this.aClass333_1.method7979());
		}
		this.aClass3_Sub3_Sub4_1.method4678(arg0);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)V")
	private void method144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method170(arg2, arg1, 64);
		if ((this.anIntArray21[arg2] & 0x2) != 0) {
			for (@Pc(28) Class3_Sub4 local28 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5456(); local28 != null; local28 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5459()) {
				if (local28.anInt190 == arg2 && local28.anInt186 < 0) {
					this.aClass3_Sub4ArrayArray2[arg2][local28.anInt178] = null;
					this.aClass3_Sub4ArrayArray2[arg2][arg1] = local28;
					@Pc(66) int local66 = local28.anInt196 + (local28.anInt192 * local28.anInt183 >> 12);
					local28.anInt196 += arg1 - local28.anInt178 << 8;
					local28.anInt178 = arg1;
					local28.anInt183 = 4096;
					local28.anInt192 = local66 - local28.anInt196;
					return;
				}
			}
		}
		@Pc(114) Class3_Sub10 local114 = (Class3_Sub10) this.aClass25_1.method426((long) this.anIntArray9[arg2]);
		if (local114 == null) {
			return;
		}
		@Pc(122) Class3_Sub18_Sub1 local122 = local114.aClass3_Sub18_Sub1Array1[arg1];
		if (local122 == null) {
			return;
		}
		@Pc(129) Class3_Sub4 local129 = new Class3_Sub4();
		local129.aClass3_Sub18_Sub1_1 = local122;
		local129.anInt190 = arg2;
		local129.aClass3_Sub10_1 = local114;
		local129.aClass81_1 = local114.aClass81Array1[arg1];
		local129.anInt191 = local114.aByteArray8[arg1];
		local129.anInt178 = arg1;
		local129.anInt180 = arg0 * arg0 * local114.anInt767 * local114.aByteArray10[arg1] + 1024 >> 11;
		local129.anInt185 = local114.aByteArray9[arg1] & 0xFF;
		local129.anInt196 = (arg1 << 8) - (local114.aShortArray6[arg1] & 0x7FFF);
		local129.anInt188 = 0;
		local129.anInt189 = 0;
		local129.anInt195 = 0;
		local129.anInt179 = 0;
		local129.anInt186 = -1;
		if (this.anIntArray18[arg2] == 0) {
			local129.aClass3_Sub3_Sub5_1 = Static655.method4686(local122, this.method154(local129), this.method172(local129), this.method148(local129));
		} else {
			local129.aClass3_Sub3_Sub5_1 = Static655.method4686(local122, this.method154(local129), 0, this.method148(local129));
			this.method158(local129, local114.aShortArray6[arg1] < 0);
		}
		if (local114.aShortArray6[arg1] < 0) {
			local129.aClass3_Sub3_Sub5_1.method4716(-1);
		}
		if (local129.anInt191 >= 0) {
			@Pc(284) Class3_Sub4 local284 = this.aClass3_Sub4ArrayArray1[arg2][local129.anInt191];
			if (local284 != null && local284.anInt186 < 0) {
				this.aClass3_Sub4ArrayArray2[arg2][local284.anInt178] = null;
				local284.anInt186 = 0;
			}
			this.aClass3_Sub4ArrayArray1[arg2][local129.anInt191] = local129;
		}
		this.aClass3_Sub3_Sub4_1.aClass216_33.method5449(local129);
		this.aClass3_Sub4ArrayArray2[arg2][arg1] = local129;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIILclient!afa;[I)Z")
	public boolean method145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub4 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt193 = Static168.anInt3272 / 100;
		if (arg2.anInt186 >= 0 && (arg2.aClass3_Sub3_Sub5_1 == null || arg2.aClass3_Sub3_Sub5_1.method4723())) {
			arg2.method195();
			arg2.method8682();
			if (arg2.anInt191 > 0 && this.aClass3_Sub4ArrayArray1[arg2.anInt190][arg2.anInt191] == arg2) {
				this.aClass3_Sub4ArrayArray1[arg2.anInt190][arg2.anInt191] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg2.anInt183;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray19[arg2.anInt190] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg2.anInt183 = local56;
		}
		arg2.aClass3_Sub3_Sub5_1.method4705(this.method154(arg2));
		@Pc(96) Class81 local96 = arg2.aClass81_1;
		arg2.anInt181 += local96.anInt2229;
		arg2.anInt187++;
		@Pc(111) boolean local111 = false;
		@Pc(129) double local129 = (double) ((arg2.anInt192 * arg2.anInt183 >> 12) + (arg2.anInt178 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt2228 > 0) {
			if (local96.anInt2231 <= 0) {
				arg2.anInt189 += 128;
			} else {
				arg2.anInt189 += (int) (Math.pow(2.0D, (double) local96.anInt2231 * local129) * 128.0D + 0.5D);
			}
			if (local96.anInt2228 * arg2.anInt189 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray21 != null) {
			if (local96.anInt2225 > 0) {
				arg2.anInt179 += (int) (Math.pow(2.0D, (double) local96.anInt2225 * local129) * 128.0D + 0.5D);
			} else {
				arg2.anInt179 += 128;
			}
			while (local96.aByteArray21.length - 2 > arg2.anInt188 && arg2.anInt179 > (local96.aByteArray21[arg2.anInt188 + 2] & 0xFF) << 8) {
				arg2.anInt188 += 2;
			}
			if (arg2.anInt188 == local96.aByteArray21.length - 2 && local96.aByteArray21[arg2.anInt188 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg2.anInt186 >= 0 && local96.aByteArray20 != null && (this.anIntArray21[arg2.anInt190] & 0x1) == 0 && (arg2.anInt191 < 0 || arg2 != this.aClass3_Sub4ArrayArray1[arg2.anInt190][arg2.anInt191])) {
			if (local96.anInt2230 <= 0) {
				arg2.anInt186 += 128;
			} else {
				arg2.anInt186 += (int) (Math.pow(2.0D, (double) local96.anInt2230 * local129) * 128.0D + 0.5D);
			}
			while (local96.aByteArray20.length - 2 > arg2.anInt195 && arg2.anInt186 > (local96.aByteArray20[arg2.anInt195 + 2] & 0xFF) << 8) {
				arg2.anInt195 += 2;
			}
			if (local96.aByteArray20.length - 2 == arg2.anInt195) {
				local111 = true;
			}
		}
		if (!local111) {
			arg2.aClass3_Sub3_Sub5_1.method4703(arg2.anInt193, this.method172(arg2), this.method148(arg2));
			return false;
		}
		arg2.aClass3_Sub3_Sub5_1.method4693(arg2.anInt193);
		if (arg3 == null) {
			arg2.aClass3_Sub3_Sub5_1.method4678(arg0);
		} else {
			arg2.aClass3_Sub3_Sub5_1.method4677(arg3, arg1, arg0);
		}
		if (arg2.aClass3_Sub3_Sub5_1.method4706()) {
			this.aClass3_Sub3_Sub4_1.aClass3_Sub3_Sub3_1.method2975(arg2.aClass3_Sub3_Sub5_1);
		}
		arg2.method195();
		if (arg2.anInt186 >= 0) {
			arg2.method8682();
			if (arg2.anInt191 > 0 && this.aClass3_Sub4ArrayArray1[arg2.anInt190][arg2.anInt191] == arg2) {
				this.aClass3_Sub4ArrayArray1[arg2.anInt190][arg2.anInt191] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZI)V")
	private void method146(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method142(-1);
		} else {
			this.method171(-1);
		}
		this.method162(-1);
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			this.anIntArray9[local25] = this.anIntArray17[local25];
		}
		for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
			this.anIntArray11[local43] = this.anIntArray17[local43] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!afa;Z)I")
	private int method148(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(15) int local15 = this.anIntArray15[arg0.anInt190];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt185) * (-local15 + 16384) + 32 >> 6) : arg0.anInt185 * local15 + 32 >> 6;
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "()I")
	@Override
	public synchronized int method4681() {
		return 0;
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)V")
	public synchronized void method149() {
		for (@Pc(5) Class3_Sub10 local5 = (Class3_Sub10) this.aClass25_1.method435(); local5 != null; local5 = (Class3_Sub10) this.aClass25_1.method432()) {
			local5.method8682();
		}
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(ZI)V")
	private synchronized void method150(@OriginalArg(0) boolean arg0) {
		this.aClass333_1.method7983();
		this.aClass3_Sub6_2 = null;
		this.method146(arg0);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BZLclient!aha;Z)V")
	private synchronized void method151(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub6 arg1, @OriginalArg(3) boolean arg2) {
		this.method150(arg0);
		this.aClass333_1.method7974(arg1.aByteArray3);
		this.aBoolean11 = arg2;
		this.aLong9 = 0L;
		@Pc(24) int local24 = this.aClass333_1.method7985();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass333_1.method7975(local26);
			this.aClass333_1.method7973(local26);
			this.aClass333_1.method7981(local26);
		}
		this.anInt159 = this.aClass333_1.method7980();
		this.anInt160 = this.aClass333_1.anIntArray585[this.anInt159];
		this.aLong10 = this.aClass333_1.method7976(this.anInt160);
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)I")
	public int method153() {
		return this.anInt146;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!afa;I)I")
	private int method154(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(15) int local15 = arg0.anInt196 + (arg0.anInt183 * arg0.anInt192 >> 12);
		local15 += this.anIntArray14[arg0.anInt190] * (this.anIntArray8[arg0.anInt190] - 8192) >> 12;
		@Pc(44) Class81 local44 = arg0.aClass81_1;
		@Pc(70) int local70;
		if (local44.anInt2229 > 0 && (local44.anInt2224 > 0 || this.anIntArray12[arg0.anInt190] > 0)) {
			local70 = local44.anInt2224 << 2;
			@Pc(75) int local75 = local44.anInt2226 << 1;
			if (arg0.anInt187 < local75) {
				local70 = arg0.anInt187 * local70 / local75;
			}
			local70 += this.anIntArray12[arg0.anInt190] >> 7;
			@Pc(105) double local105 = Math.sin((double) (arg0.anInt181 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local105 * (double) local70);
		}
		local70 = (int) ((double) (arg0.aClass3_Sub18_Sub1_1.anInt10133 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static168.anInt3272 + 0.5D);
		return local70 < 1 ? 1 : local70;
	}

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)V")
	public synchronized void method155() {
		for (@Pc(11) Class3_Sub10 local11 = (Class3_Sub10) this.aClass25_1.method435(); local11 != null; local11 = (Class3_Sub10) this.aClass25_1.method432()) {
			local11.method734();
		}
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "()Lclient!co;")
	@Override
	public synchronized Class3_Sub3 method4680() {
		return this.aClass3_Sub3_Sub4_1;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(II)V")
	private void method156(@OriginalArg(1) int arg0) {
		if ((this.anIntArray21[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class3_Sub4 local15 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5457(); local15 != null; local15 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5458()) {
			if (local15.anInt190 == arg0) {
				local15.anInt182 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(III)V")
	private void method157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray7[arg1] = arg0;
		this.anIntArray16[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * (double) 2097152 + 0.5D);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!afa;Z)V")
	public void method158(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) int local13 = arg0.aClass3_Sub18_Sub1_1.aByteArray106.length;
		@Pc(42) int local42;
		if (arg1 && arg0.aClass3_Sub18_Sub1_1.aBoolean767) {
			@Pc(29) int local29 = local13 + local13 - arg0.aClass3_Sub18_Sub1_1.anInt10134;
			local42 = (int) ((long) this.anIntArray18[arg0.anInt190] * (long) local29 >> 6);
			local13 <<= 0x8;
			if (local42 >= local13) {
				local42 = local13 + local13 - local42 - 1;
				arg0.aClass3_Sub3_Sub5_1.method4685();
			}
		} else {
			local42 = (int) ((long) this.anIntArray18[arg0.anInt190] * (long) local13 >> 6);
		}
		arg0.aClass3_Sub3_Sub5_1.method4712(local42);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4677(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass333_1.method7979()) {
			@Pc(18) int local18 = this.anInt124 * this.aClass333_1.anInt9329 / Static168.anInt3272;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong9;
				if (this.aLong10 - local27 >= 0L) {
					this.aLong9 = local27;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong10 + (long) local18 - this.aLong9 - 1L) / (long) local18);
				this.aLong9 += (long) local18 * (long) local56;
				this.aClass3_Sub3_Sub4_1.method4677(arg0, arg1, local56);
				arg2 -= local56;
				arg1 += local56;
				this.method140();
			} while (this.aClass333_1.method7979());
		}
		this.aClass3_Sub3_Sub4_1.method4677(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BI)V")
	private void method159(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 & 0xF0;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(33) int local33;
		if (local14 == 128) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			local33 = arg0 >> 16 & 0x7F;
			this.method170(local21, local27, local33);
		} else if (local14 == 144) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			local33 = arg0 >> 16 & 0x7F;
			if (local33 > 0) {
				this.method144(local33, local27, local21);
			} else {
				this.method170(local21, local27, 64);
			}
		} else if (local14 == 160) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			local33 = arg0 >> 16 & 0x7F;
			this.method168(local27, local33, local21);
		} else if (local14 == 176) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			local33 = arg0 >> 16 & 0x7F;
			if (local27 == 0) {
				this.anIntArray11[local21] = (local33 << 14) + (this.anIntArray11[local21] & 0xFFE03FFF);
			}
			if (local27 == 32) {
				this.anIntArray11[local21] = (this.anIntArray11[local21] & 0xFFFFC07F) + (local33 << 7);
			}
			if (local27 == 1) {
				this.anIntArray12[local21] = (this.anIntArray12[local21] & 0xFFFFC07F) + (local33 << 7);
			}
			if (local27 == 33) {
				this.anIntArray12[local21] = local33 + (this.anIntArray12[local21] & 0xFFFFFF80);
			}
			if (local27 == 5) {
				this.anIntArray19[local21] = (local33 << 7) + (this.anIntArray19[local21] & 0xFFFFC07F);
			}
			if (local27 == 37) {
				this.anIntArray19[local21] = local33 + (this.anIntArray19[local21] & 0xFFFFFF80);
			}
			if (local27 == 7) {
				this.anIntArray22[local21] = (this.anIntArray22[local21] & 0xFFFFC07F) + (local33 << 7);
			}
			if (local27 == 39) {
				this.anIntArray22[local21] = (this.anIntArray22[local21] & 0xFFFFFF80) + local33;
			}
			if (local27 == 10) {
				this.anIntArray15[local21] = (this.anIntArray15[local21] & 0xFFFFC07F) + (local33 << 7);
			}
			if (local27 == 42) {
				this.anIntArray15[local21] = local33 + (this.anIntArray15[local21] & 0xFFFFFF80);
			}
			if (local27 == 11) {
				this.anIntArray10[local21] = (this.anIntArray10[local21] & 0xFFFFC07F) + (local33 << 7);
			}
			if (local27 == 43) {
				this.anIntArray10[local21] = (this.anIntArray10[local21] & 0xFFFFFF80) + local33;
			}
			if (local27 == 64) {
				if (local33 >= 64) {
					this.anIntArray21[local21] |= 0x1;
				} else {
					this.anIntArray21[local21] &= 0xFFFFFFFE;
				}
			}
			if (local27 == 65) {
				if (local33 >= 64) {
					this.anIntArray21[local21] |= 0x2;
				} else {
					this.method167(local21);
					this.anIntArray21[local21] &= 0xFFFFFFFD;
				}
			}
			if (local27 == 99) {
				this.anIntArray6[local21] = (local33 << 7) + (this.anIntArray6[local21] & 0x7F);
			}
			if (local27 == 98) {
				this.anIntArray6[local21] = local33 + (this.anIntArray6[local21] & 0x3F80);
			}
			if (local27 == 101) {
				this.anIntArray6[local21] = (local33 << 7) + (this.anIntArray6[local21] & 0x7F) + 16384;
			}
			if (local27 == 100) {
				this.anIntArray6[local21] = local33 + (this.anIntArray6[local21] & 0x3F80) + 16384;
			}
			if (local27 == 120) {
				this.method142(local21);
			}
			if (local27 == 121) {
				this.method162(local21);
			}
			if (local27 == 123) {
				this.method171(local21);
			}
			@Pc(508) int local508;
			if (local27 == 6) {
				local508 = this.anIntArray6[local21];
				if (local508 == 16384) {
					this.anIntArray14[local21] = (this.anIntArray14[local21] & 0xFFFFC07F) + (local33 << 7);
				}
			}
			if (local27 == 38) {
				local508 = this.anIntArray6[local21];
				if (local508 == 16384) {
					this.anIntArray14[local21] = (this.anIntArray14[local21] & 0xFFFFFF80) + local33;
				}
			}
			if (local27 == 16) {
				this.anIntArray18[local21] = (this.anIntArray18[local21] & 0xFFFFC07F) + (local33 << 7);
			}
			if (local27 == 48) {
				this.anIntArray18[local21] = local33 + (this.anIntArray18[local21] & 0xFFFFFF80);
			}
			if (local27 == 81) {
				if (local33 >= 64) {
					this.anIntArray21[local21] |= 0x4;
				} else {
					this.method156(local21);
					this.anIntArray21[local21] &= 0xFFFFFFFB;
				}
			}
			if (local27 == 17) {
				this.method157((this.anIntArray7[local21] & 0xFFFFC07F) + (local33 << 7), local21);
			}
			if (local27 == 49) {
				this.method157((this.anIntArray7[local21] & 0xFFFFFF80) + local33, local21);
			}
		} else if (local14 == 192) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			this.method143(local27 + this.anIntArray11[local21], local21);
		} else if (local14 == 208) {
			local21 = arg0 & 0xF;
			local27 = arg0 >> 8 & 0x7F;
			this.method138(local27, local21);
		} else if (local14 == 224) {
			local21 = arg0 & 0xF;
			local27 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method139(local27, local21);
		} else {
			local14 = arg0 & 0xFF;
			if (local14 == 255) {
				this.method146(true);
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZLclient!aha;JZB)V")
	public synchronized void method160(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub6 arg1, @OriginalArg(2) long arg2) {
		this.method151(true, arg1, arg0);
		this.method173((long) this.aClass333_1.anInt9329 * arg2);
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(II)V")
	public synchronized void method161(@OriginalArg(0) int arg0) {
		this.anInt146 = arg0;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(BI)V")
	private void method162(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method162(local12);
			}
			return;
		}
		this.anIntArray22[arg0] = 12800;
		this.anIntArray15[arg0] = 8192;
		this.anIntArray10[arg0] = 16383;
		this.anIntArray8[arg0] = 8192;
		this.anIntArray12[arg0] = 0;
		this.anIntArray19[arg0] = 8192;
		this.method167(arg0);
		this.method156(arg0);
		this.anIntArray21[arg0] = 0;
		this.anIntArray6[arg0] = 32767;
		this.anIntArray14[arg0] = 256;
		this.anIntArray18[arg0] = 0;
		this.method157(8192, arg0);
	}

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "(III)V")
	public synchronized void method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray13[arg1] = arg0;
		} else {
			for (@Pc(22) int local22 = 0; local22 < 16; local22++) {
				this.anIntArray13[local22] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!aha;Lclient!uu;BLclient!eia;I)Z")
	public synchronized boolean method164(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(3) Class92 arg2) {
		arg0.method236();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class3_Sub11 local26 = (Class3_Sub11) arg0.aClass25_2.method435(); local26 != null; local26 = (Class3_Sub11) arg0.aClass25_2.method432()) {
			@Pc(32) int local32 = (int) local26.aLong277;
			@Pc(40) Class3_Sub10 local40 = (Class3_Sub10) this.aClass25_1.method426((long) local32);
			if (local40 == null) {
				local40 = Static52.method966(arg1, local32);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass25_1.method434((long) local32, local40);
			}
			if (!local40.method732(arg2, local26.aByteArray11, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method235();
		}
		return local9;
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(B)Z")
	public synchronized boolean method165() {
		return this.aClass333_1.method7979();
	}

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "(II)V")
	private void method167(@OriginalArg(0) int arg0) {
		if ((this.anIntArray21[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class3_Sub4 local15 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5457(); local15 != null; local15 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5458()) {
			if (local15.anInt190 == arg0 && this.aClass3_Sub4ArrayArray2[arg0][local15.anInt178] == null && local15.anInt186 < 0) {
				local15.anInt186 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(IIII)V")
	private void method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "()Lclient!co;")
	@Override
	public synchronized Class3_Sub3 method4679() {
		return null;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(Lclient!afa;I)Z")
	public boolean method169(@OriginalArg(0) Class3_Sub4 arg0) {
		if (arg0.aClass3_Sub3_Sub5_1 != null) {
			return false;
		}
		if (arg0.anInt186 >= 0) {
			arg0.method8682();
			if (arg0.anInt191 > 0 && this.aClass3_Sub4ArrayArray1[arg0.anInt190][arg0.anInt191] == arg0) {
				this.aClass3_Sub4ArrayArray1[arg0.anInt190][arg0.anInt191] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BIII)V")
	private void method170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub4 local12 = this.aClass3_Sub4ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub4ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray21[arg0] & 0x2) == 0) {
			local12.anInt186 = 0;
			return;
		}
		for (@Pc(39) Class3_Sub4 local39 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5457(); local39 != null; local39 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5458()) {
			if (local39.anInt190 == local12.anInt190 && local39.anInt186 < 0 && local39 != local12) {
				local12.anInt186 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "(II)V")
	private void method171(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class3_Sub4 local8 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5457(); local8 != null; local8 = (Class3_Sub4) this.aClass3_Sub3_Sub4_1.aClass216_33.method5458()) {
			if ((arg0 < 0 || local8.anInt190 == arg0) && local8.anInt186 < 0) {
				this.aClass3_Sub4ArrayArray2[local8.anInt190][local8.anInt178] = null;
				local8.anInt186 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!afa;)I")
	private int method172(@OriginalArg(1) Class3_Sub4 arg0) {
		if (this.anIntArray13[arg0.anInt190] == 0) {
			return 0;
		}
		@Pc(17) Class81 local17 = arg0.aClass81_1;
		@Pc(33) int local33 = this.anIntArray22[arg0.anInt190] * this.anIntArray10[arg0.anInt190] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt180 + 16384 >> 15;
		@Pc(59) int local59 = local50 * this.anInt146 + 128 >> 8;
		local33 = this.anIntArray13[arg0.anInt190] * local59 + 128 >> 8;
		if (local17.anInt2228 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) arg0.anInt189 * 1.953125E-5D * (double) local17.anInt2228) * (double) local33 + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(134) int local134;
		@Pc(146) int local146;
		if (local17.aByteArray21 != null) {
			local104 = arg0.anInt179;
			local112 = local17.aByteArray21[arg0.anInt188 + 1];
			if (arg0.anInt188 < local17.aByteArray21.length - 2) {
				local134 = (local17.aByteArray21[arg0.anInt188] & 0xFF) << 8;
				local146 = (local17.aByteArray21[arg0.anInt188 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (local17.aByteArray21[arg0.anInt188 + 3] + -local112) / (local146 - local134);
			}
			local33 = local33 * local112 + 32 >> 6;
		}
		if (arg0.anInt186 > 0 && local17.aByteArray20 != null) {
			local104 = arg0.anInt186;
			local112 = local17.aByteArray20[arg0.anInt195 + 1];
			if (local17.aByteArray20.length - 2 > arg0.anInt195) {
				local134 = (local17.aByteArray20[arg0.anInt195] & 0xFF) << 8;
				local146 = (local17.aByteArray20[arg0.anInt195 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (-local112 + local17.aByteArray20[arg0.anInt195 - -3]) / (local146 - local134);
			}
			local33 = local112 * local33 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IJ)V")
	private void method173(@OriginalArg(1) long arg0) {
		while (this.aLong10 <= arg0) {
			@Pc(18) int local18 = this.anInt159;
			@Pc(21) int local21 = this.anInt160;
			@Pc(24) long local24 = this.aLong10;
			while (this.anInt160 == local21) {
				while (local21 == this.aClass333_1.anIntArray585[local18]) {
					this.aClass333_1.method7975(local18);
					@Pc(35) int local35 = this.aClass333_1.method7986(local18);
					if (local35 == 1) {
						this.aClass333_1.method7984();
						this.aClass333_1.method7981(local18);
						if (this.aClass333_1.method7978()) {
							if (!this.aBoolean11 || local21 == 0) {
								this.method146(true);
								this.aClass333_1.method7983();
								return;
							}
							this.aClass333_1.method7982(local24);
						}
						break;
					}
					if ((local35 & 0x80) != 0 && (local35 & 0xF0) != 144) {
						this.method159(local35);
					}
					this.aClass333_1.method7973(local18);
					this.aClass333_1.method7981(local18);
				}
				this.aLong9 = local24;
				local18 = this.aClass333_1.method7980();
				local21 = this.aClass333_1.anIntArray585[local18];
				local24 = this.aClass333_1.method7976(local21);
			}
			this.anInt160 = local21;
			this.aLong10 = local24;
			this.anInt159 = local18;
		}
	}
}
