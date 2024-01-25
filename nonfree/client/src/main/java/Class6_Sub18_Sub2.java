import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class6_Sub18_Sub2 extends Class6_Sub18 {

	@OriginalMember(owner = "client!he", name = "Bb", descriptor = "J")
	private long aLong96;

	@OriginalMember(owner = "client!he", name = "Cb", descriptor = "I")
	private int anInt3809;

	@OriginalMember(owner = "client!he", name = "Eb", descriptor = "I")
	private int anInt3810;

	@OriginalMember(owner = "client!he", name = "Fb", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!he", name = "Gb", descriptor = "Z")
	private boolean aBoolean257;

	@OriginalMember(owner = "client!he", name = "Hb", descriptor = "Lclient!ia;")
	private Class6_Sub24 aClass6_Sub24_1;

	@OriginalMember(owner = "client!he", name = "Ib", descriptor = "Z")
	private boolean aBoolean258;

	@OriginalMember(owner = "client!he", name = "Jb", descriptor = "I")
	private int anInt3811;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "[I")
	public final int[] anIntArray222 = new int[16];

	@OriginalMember(owner = "client!he", name = "m", descriptor = "[I")
	private final int[] anIntArray221 = new int[16];

	@OriginalMember(owner = "client!he", name = "A", descriptor = "[I")
	private final int[] anIntArray224 = new int[16];

	@OriginalMember(owner = "client!he", name = "s", descriptor = "[[Lclient!jh;")
	private final Class6_Sub27[][] aClass6_Sub27ArrayArray1 = new Class6_Sub27[16][128];

	@OriginalMember(owner = "client!he", name = "t", descriptor = "[I")
	private final int[] anIntArray223 = new int[16];

	@OriginalMember(owner = "client!he", name = "E", descriptor = "[I")
	private final int[] anIntArray226 = new int[16];

	@OriginalMember(owner = "client!he", name = "M", descriptor = "[I")
	private final int[] anIntArray228 = new int[16];

	@OriginalMember(owner = "client!he", name = "w", descriptor = "[[Lclient!jh;")
	private final Class6_Sub27[][] aClass6_Sub27ArrayArray2 = new Class6_Sub27[16][128];

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	private int anInt3767 = 256;

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "[I")
	private final int[] anIntArray233 = new int[16];

	@OriginalMember(owner = "client!he", name = "I", descriptor = "[I")
	private final int[] anIntArray227 = new int[16];

	@OriginalMember(owner = "client!he", name = "P", descriptor = "[I")
	private final int[] anIntArray229 = new int[16];

	@OriginalMember(owner = "client!he", name = "fb", descriptor = "[I")
	private final int[] anIntArray234 = new int[16];

	@OriginalMember(owner = "client!he", name = "W", descriptor = "[I")
	public final int[] anIntArray231 = new int[16];

	@OriginalMember(owner = "client!he", name = "D", descriptor = "[I")
	private final int[] anIntArray225 = new int[16];

	@OriginalMember(owner = "client!he", name = "db", descriptor = "[I")
	private final int[] anIntArray232 = new int[16];

	@OriginalMember(owner = "client!he", name = "sb", descriptor = "[I")
	private final int[] anIntArray235 = new int[16];

	@OriginalMember(owner = "client!he", name = "yb", descriptor = "[I")
	public final int[] anIntArray236 = new int[16];

	@OriginalMember(owner = "client!he", name = "R", descriptor = "[I")
	private final int[] anIntArray230 = new int[16];

	@OriginalMember(owner = "client!he", name = "Ab", descriptor = "I")
	private final int anInt3808 = 1000000;

	@OriginalMember(owner = "client!he", name = "y", descriptor = "Lclient!kt;")
	private final Class183 aClass183_1 = new Class183();

	@OriginalMember(owner = "client!he", name = "Db", descriptor = "Lclient!nga;")
	private final Class6_Sub18_Sub3 aClass6_Sub18_Sub3_1 = new Class6_Sub18_Sub3(this);

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "Lclient!hd;")
	private final Class128 aClass128_13 = new Class128(128);

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class6_Sub18_Sub2() {
		this.method3309();
		this.method3310(true);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	private void method3291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!jh;I[I)Z")
	public boolean method3292(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub27 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg1.anInt4719 = Static330.anInt6003 / 100;
		if (arg1.anInt4717 >= 0 && (arg1.aClass6_Sub18_Sub1_4 == null || arg1.aClass6_Sub18_Sub1_4.method2693())) {
			arg1.method4070();
			arg1.method7804();
			if (arg1.anInt4734 > 0 && arg1 == this.aClass6_Sub27ArrayArray1[arg1.anInt4732][arg1.anInt4734]) {
				this.aClass6_Sub27ArrayArray1[arg1.anInt4732][arg1.anInt4734] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg1.anInt4723;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray228[arg1.anInt4732] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg1.anInt4723 = local53;
		}
		arg1.aClass6_Sub18_Sub1_4.method2696(this.method3326(arg1));
		@Pc(95) Class162 local95 = arg1.aClass162_1;
		@Pc(97) boolean local97 = false;
		arg1.anInt4718++;
		arg1.anInt4720 += local95.anInt4860;
		@Pc(128) double local128 = (double) ((arg1.anInt4731 - 60 << 8) + (arg1.anInt4729 * arg1.anInt4723 >> 12)) * 5.086263020833333E-6D;
		if (local95.anInt4857 > 0) {
			if (local95.anInt4859 <= 0) {
				arg1.anInt4726 += 128;
			} else {
				arg1.anInt4726 += (int) (Math.pow(2.0D, (double) local95.anInt4859 * local128) * 128.0D + 0.5D);
			}
			if (local95.anInt4857 * arg1.anInt4726 >= 819200) {
				local97 = true;
			}
		}
		if (local95.aByteArray51 != null) {
			if (local95.anInt4855 <= 0) {
				arg1.anInt4721 += 128;
			} else {
				arg1.anInt4721 += (int) (Math.pow(2.0D, local128 * (double) local95.anInt4855) * 128.0D + 0.5D);
			}
			while (local95.aByteArray51.length - 2 > arg1.anInt4722 && arg1.anInt4721 > (local95.aByteArray51[arg1.anInt4722 + 2] & 0xFF) << 8) {
				arg1.anInt4722 += 2;
			}
			if (arg1.anInt4722 == local95.aByteArray51.length - 2 && local95.aByteArray51[arg1.anInt4722 + 1] == 0) {
				local97 = true;
			}
		}
		if (arg1.anInt4717 >= 0 && local95.aByteArray52 != null && (this.anIntArray236[arg1.anInt4732] & 0x1) == 0 && (arg1.anInt4734 < 0 || this.aClass6_Sub27ArrayArray1[arg1.anInt4732][arg1.anInt4734] != arg1)) {
			if (local95.anInt4856 <= 0) {
				arg1.anInt4717 += 128;
			} else {
				arg1.anInt4717 += (int) (Math.pow(2.0D, local128 * (double) local95.anInt4856) * 128.0D + 0.5D);
			}
			while (arg1.anInt4733 < local95.aByteArray52.length - 2 && arg1.anInt4717 > (local95.aByteArray52[arg1.anInt4733 + 2] & 0xFF) << 8) {
				arg1.anInt4733 += 2;
			}
			if (arg1.anInt4733 == local95.aByteArray52.length - 2) {
				local97 = true;
			}
		}
		if (!local97) {
			arg1.aClass6_Sub18_Sub1_4.method2694(arg1.anInt4719, this.method3313(arg1), this.method3302(arg1));
			return false;
		}
		arg1.aClass6_Sub18_Sub1_4.method2699(arg1.anInt4719);
		if (arg3 == null) {
			arg1.aClass6_Sub18_Sub1_4.method6377(arg2);
		} else {
			arg1.aClass6_Sub18_Sub1_4.method6372(arg3, arg0, arg2);
		}
		if (arg1.aClass6_Sub18_Sub1_4.method2688()) {
			this.aClass6_Sub18_Sub3_1.aClass6_Sub18_Sub4_1.method6378(arg1.aClass6_Sub18_Sub1_4);
		}
		arg1.method4070();
		if (arg1.anInt4717 >= 0) {
			arg1.method7804();
			if (arg1.anInt4734 > 0 && this.aClass6_Sub27ArrayArray1[arg1.anInt4732][arg1.anInt4734] == arg1) {
				this.aClass6_Sub27ArrayArray1[arg1.anInt4732][arg1.anInt4734] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public synchronized void method3293() {
		this.method3295(true);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)V")
	private void method3294() {
		this.anIntArray226[9] = 128;
		this.anIntArray234[9] = 128;
		this.method3306(9, 128);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BZ)V")
	private synchronized void method3295(@OriginalArg(1) boolean arg0) {
		this.aClass183_1.method4486();
		this.aClass6_Sub24_1 = null;
		this.method3310(arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6372(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass183_1.method4483()) {
			@Pc(18) int local18 = this.aClass183_1.anInt5205 * this.anInt3808 / Static330.anInt6003;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong96;
				if (this.aLong97 - local27 >= 0L) {
					this.aLong96 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong97 + (long) local18 - this.aLong96 - 1L) / (long) local18);
				this.aLong96 += (long) local18 * (long) local57;
				this.aClass6_Sub18_Sub3_1.method6372(arg0, arg1, local57);
				arg2 -= local57;
				this.method3327();
				arg1 += local57;
			} while (this.aClass183_1.method4483());
		}
		this.aClass6_Sub18_Sub3_1.method6372(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public synchronized void method3296() {
		for (@Pc(19) Class6_Sub28 local19 = (Class6_Sub28) this.aClass128_13.method3265(); local19 != null; local19 = (Class6_Sub28) this.aClass128_13.method3273()) {
			local19.method7804();
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(III)V")
	private void method3297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray225[arg1] = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZLclient!ia;B)V")
	private synchronized void method3298(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class6_Sub24 arg2) {
		this.method3295(arg0);
		this.aClass183_1.method4479(arg2.aByteArray37);
		this.aLong96 = 0L;
		this.aBoolean257 = arg1;
		@Pc(28) int local28 = this.aClass183_1.method4492();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass183_1.method4485(local30);
			this.aClass183_1.method4484(local30);
			this.aClass183_1.method4488(local30);
		}
		this.anInt3810 = this.aClass183_1.method4482();
		this.anInt3809 = this.aClass183_1.anIntArray388[this.anInt3810];
		this.aLong97 = this.aClass183_1.method4487(this.anInt3809);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()I")
	@Override
	public synchronized int method6376() {
		return 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLclient!jh;)Z")
	public boolean method3301(@OriginalArg(1) Class6_Sub27 arg0) {
		if (arg0.aClass6_Sub18_Sub1_4 != null) {
			return false;
		}
		if (arg0.anInt4717 >= 0) {
			arg0.method7804();
			if (arg0.anInt4734 > 0 && arg0 == this.aClass6_Sub27ArrayArray1[arg0.anInt4732][arg0.anInt4734]) {
				this.aClass6_Sub27ArrayArray1[arg0.anInt4732][arg0.anInt4734] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!jh;I)I")
	private int method3302(@OriginalArg(0) Class6_Sub27 arg0) {
		@Pc(15) int local15 = this.anIntArray223[arg0.anInt4732];
		return local15 < 8192 ? arg0.anInt4725 * local15 + 32 >> 6 : 16384 - ((128 - arg0.anInt4725) * (16384 - local15) + 32 >> 6);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()Lclient!mi;")
	@Override
	public synchronized Class6_Sub18 method6371() {
		return null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	private void method3303(@OriginalArg(1) int arg0) {
		for (@Pc(20) Class6_Sub27 local20 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7838(); local20 != null; local20 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7845()) {
			if ((arg0 < 0 || arg0 == local20.anInt4732) && local20.anInt4717 < 0) {
				this.aClass6_Sub27ArrayArray2[local20.anInt4732][local20.anInt4731] = null;
				local20.anInt4717 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)V")
	private void method3304(@OriginalArg(1) int arg0) {
		if ((this.anIntArray236[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class6_Sub27 local22 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7838(); local22 != null; local22 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7845()) {
			if (arg0 == local22.anInt4732) {
				local22.anInt4724 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)V")
	private void method3305(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method3315(local30, local18, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method3315(64, local18, local24);
			} else {
				this.method3321(local18, local30, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method3308(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray234[local18] = (local30 << 14) + (this.anIntArray234[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray234[local18] = (local30 << 7) + (this.anIntArray234[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray229[local18] = (local30 << 7) + (this.anIntArray229[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray229[local18] = local30 + (this.anIntArray229[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray228[local18] = (local30 << 7) + (this.anIntArray228[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray228[local18] = (this.anIntArray228[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray227[local18] = (this.anIntArray227[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray227[local18] = (this.anIntArray227[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray223[local18] = (this.anIntArray223[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray223[local18] = local30 + (this.anIntArray223[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray221[local18] = (local30 << 7) + (this.anIntArray221[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray221[local18] = local30 + (this.anIntArray221[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray236[local18] |= 0x1;
				} else {
					this.anIntArray236[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method3324(local18);
					this.anIntArray236[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray236[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray233[local18] = (local30 << 7) + (this.anIntArray233[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray233[local18] = local30 + (this.anIntArray233[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray233[local18] = (local30 << 7) + (this.anIntArray233[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray233[local18] = (this.anIntArray233[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method3311(local18);
			}
			if (local24 == 121) {
				this.method3307(local18);
			}
			if (local24 == 123) {
				this.method3303(local18);
			}
			@Pc(506) int local506;
			if (local24 == 6) {
				local506 = this.anIntArray233[local18];
				if (local506 == 16384) {
					this.anIntArray232[local18] = (this.anIntArray232[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local506 = this.anIntArray233[local18];
				if (local506 == 16384) {
					this.anIntArray232[local18] = (this.anIntArray232[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray222[local18] = (local30 << 7) + (this.anIntArray222[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray222[local18] = (this.anIntArray222[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray236[local18] |= 0x4;
				} else {
					this.method3304(local18);
					this.anIntArray236[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method3320(local18, (local30 << 7) + (this.anIntArray235[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method3320(local18, local30 + (this.anIntArray235[local18] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method3306(local18, local24 + this.anIntArray234[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method3291(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00C0) >> 9);
			this.method3297(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method3310(true);
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(III)V")
	private void method3306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray224[arg0]) {
			this.anIntArray224[arg0] = arg1;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass6_Sub27ArrayArray1[arg0][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(II)V")
	private void method3307(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method3307(local9);
			}
			return;
		}
		this.anIntArray227[arg0] = 12800;
		this.anIntArray223[arg0] = 8192;
		this.anIntArray221[arg0] = 16383;
		this.anIntArray225[arg0] = 8192;
		this.anIntArray229[arg0] = 0;
		this.anIntArray228[arg0] = 8192;
		this.method3324(arg0);
		this.method3304(arg0);
		this.anIntArray236[arg0] = 0;
		this.anIntArray233[arg0] = 32767;
		this.anIntArray232[arg0] = 256;
		this.anIntArray222[arg0] = 0;
		this.method3320(arg0, 8192);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)V")
	private void method3308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(BII)V")
	private synchronized void method3309() {
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			this.anIntArray230[local20] = 256;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZB)V")
	private void method3310(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method3311(-1);
		} else {
			this.method3303(-1);
		}
		this.method3307(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray224[local31] = this.anIntArray226[local31];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray234[local49] = this.anIntArray226[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public synchronized Class6_Sub18 method6374() {
		return this.aClass6_Sub18_Sub3_1;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(II)V")
	private void method3311(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class6_Sub27 local14 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7838(); local14 != null; local14 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7845()) {
			if (arg0 < 0 || arg0 == local14.anInt4732) {
				if (local14.aClass6_Sub18_Sub1_4 != null) {
					local14.aClass6_Sub18_Sub1_4.method2699(Static330.anInt6003 / 100);
					if (local14.aClass6_Sub18_Sub1_4.method2688()) {
						this.aClass6_Sub18_Sub3_1.aClass6_Sub18_Sub4_1.method6378(local14.aClass6_Sub18_Sub1_4);
					}
					local14.method4070();
				}
				if (local14.anInt4717 < 0) {
					this.aClass6_Sub27ArrayArray2[local14.anInt4732][local14.anInt4731] = null;
				}
				local14.method7804();
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Z")
	public synchronized boolean method3312() {
		return this.aClass183_1.method4483();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!jh;B)I")
	private int method3313(@OriginalArg(0) Class6_Sub27 arg0) {
		if (this.anIntArray230[arg0.anInt4732] == 0) {
			return 0;
		}
		@Pc(17) Class162 local17 = arg0.aClass162_1;
		@Pc(33) int local33 = this.anIntArray227[arg0.anInt4732] * this.anIntArray221[arg0.anInt4732] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt4730 + 16384 >> 15;
		@Pc(59) int local59 = this.anInt3767 * local50 + 128 >> 8;
		local33 = this.anIntArray230[arg0.anInt4732] * local59 + 128 >> 8;
		if (local17.anInt4857 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) local17.anInt4857 * (double) arg0.anInt4726 * 1.953125E-5D) * (double) local33 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(124) int local124;
		@Pc(136) int local136;
		if (local17.aByteArray51 != null) {
			@Pc(98) int local98 = arg0.anInt4721;
			local106 = local17.aByteArray51[arg0.anInt4722 + 1];
			if (arg0.anInt4722 < local17.aByteArray51.length - 2) {
				local124 = (local17.aByteArray51[arg0.anInt4722] & 0xFF) << 8;
				local136 = (local17.aByteArray51[arg0.anInt4722 + 2] & 0xFF) << 8;
				local106 += (local17.aByteArray51[arg0.anInt4722 + 3] - local106) * (local98 - local124) / (local136 - local124);
			}
			local33 = local106 * local33 + 32 >> 6;
		}
		if (arg0.anInt4717 > 0 && local17.aByteArray52 != null) {
			local106 = arg0.anInt4717;
			local124 = local17.aByteArray52[arg0.anInt4733 + 1];
			if (local17.aByteArray52.length - 2 > arg0.anInt4733) {
				local136 = (local17.aByteArray52[arg0.anInt4733] & 0xFF) << 8;
				@Pc(228) int local228 = (local17.aByteArray52[arg0.anInt4733 + 2] & 0xFF) << 8;
				local124 += (local17.aByteArray52[arg0.anInt4733 + 3] - local124) * (local106 + -local136) / (local228 - local136);
			}
			local33 = local33 * local124 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BZLclient!jh;)V")
	public void method3314(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6_Sub27 arg1) {
		@Pc(8) int local8 = arg1.aClass6_Sub19_Sub1_4.aByteArray13.length;
		@Pc(35) int local35;
		if (arg0 && arg1.aClass6_Sub19_Sub1_4.aBoolean237) {
			@Pc(46) int local46 = local8 + local8 - arg1.aClass6_Sub19_Sub1_4.anInt3209;
			local8 <<= 0x8;
			local35 = (int) ((long) this.anIntArray222[arg1.anInt4732] * (long) local46 >> 6);
			if (local35 >= local8) {
				arg1.aClass6_Sub18_Sub1_4.method2709();
				local35 = local8 + local8 - local35 - 1;
			}
		} else {
			local35 = (int) ((long) this.anIntArray222[arg1.anInt4732] * (long) local8 >> 6);
		}
		arg1.aClass6_Sub18_Sub1_4.method2686(local35);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBI)V")
	private void method3315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class6_Sub27 local12 = this.aClass6_Sub27ArrayArray2[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass6_Sub27ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray236[arg1] & 0x2) == 0) {
			local12.anInt4717 = 0;
			return;
		}
		for (@Pc(51) Class6_Sub27 local51 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7838(); local51 != null; local51 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7845()) {
			if (local51.anInt4732 == local12.anInt4732 && local51.anInt4717 < 0 && local51 != local12) {
				local12.anInt4717 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(II)V")
	public synchronized void method3316(@OriginalArg(1) int arg0) {
		this.anInt3767 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ia;ZB)V")
	public synchronized void method3317(@OriginalArg(0) Class6_Sub24 arg0, @OriginalArg(1) boolean arg1) {
		this.method3298(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(III)V")
	public synchronized void method3318() {
		this.method3294();
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)I")
	public int method3319() {
		return this.anInt3767;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)V")
	private void method3320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray235[arg0] = arg1;
		this.anIntArray231[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IIII)V")
	private void method3321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method3315(64, arg0, arg2);
		if ((this.anIntArray236[arg0] & 0x2) != 0) {
			for (@Pc(28) Class6_Sub27 local28 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7840(); local28 != null; local28 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7832()) {
				if (local28.anInt4732 == arg0 && local28.anInt4717 < 0) {
					this.aClass6_Sub27ArrayArray2[arg0][local28.anInt4731] = null;
					this.aClass6_Sub27ArrayArray2[arg0][arg2] = local28;
					@Pc(63) int local63 = (local28.anInt4729 * local28.anInt4723 >> 12) + local28.anInt4716;
					local28.anInt4716 += arg2 - local28.anInt4731 << 8;
					local28.anInt4729 = local63 - local28.anInt4716;
					local28.anInt4723 = 4096;
					local28.anInt4731 = arg2;
					return;
				}
			}
		}
		@Pc(108) Class6_Sub28 local108 = (Class6_Sub28) this.aClass128_13.method3263((long) this.anIntArray224[arg0]);
		if (local108 == null) {
			return;
		}
		@Pc(116) Class6_Sub19_Sub1 local116 = local108.aClass6_Sub19_Sub1Array1[arg2];
		if (local116 == null) {
			return;
		}
		@Pc(123) Class6_Sub27 local123 = new Class6_Sub27();
		local123.aClass6_Sub28_1 = local108;
		local123.anInt4732 = arg0;
		local123.aClass6_Sub19_Sub1_4 = local116;
		local123.aClass162_1 = local108.aClass162Array1[arg2];
		local123.anInt4734 = local108.aByteArray54[arg2];
		local123.anInt4731 = arg2;
		local123.anInt4730 = local108.anInt4886 * arg1 * arg1 * local108.aByteArray56[arg2] + 1024 >> 11;
		local123.anInt4725 = local108.aByteArray55[arg2] & 0xFF;
		local123.anInt4716 = (arg2 << 8) - (local108.aShortArray54[arg2] & 0x7FFF);
		local123.anInt4722 = 0;
		local123.anInt4726 = 0;
		local123.anInt4733 = 0;
		local123.anInt4721 = 0;
		local123.anInt4717 = -1;
		if (this.anIntArray222[arg0] == 0) {
			local123.aClass6_Sub18_Sub1_4 = Static600.method2677(local116, this.method3326(local123), this.method3313(local123), this.method3302(local123));
		} else {
			local123.aClass6_Sub18_Sub1_4 = Static600.method2677(local116, this.method3326(local123), 0, this.method3302(local123));
			this.method3314(local108.aShortArray54[arg2] < 0, local123);
		}
		if (local108.aShortArray54[arg2] < 0) {
			local123.aClass6_Sub18_Sub1_4.method2685(-1);
		}
		if (local123.anInt4734 >= 0) {
			@Pc(282) Class6_Sub27 local282 = this.aClass6_Sub27ArrayArray1[arg0][local123.anInt4734];
			if (local282 != null && local282.anInt4717 < 0) {
				this.aClass6_Sub27ArrayArray2[arg0][local282.anInt4731] = null;
				local282.anInt4717 = 0;
			}
			this.aClass6_Sub27ArrayArray1[arg0][local123.anInt4734] = local123;
		}
		this.aClass6_Sub18_Sub3_1.aClass361_50.method7833(local123);
		this.aClass6_Sub27ArrayArray2[arg0][arg2] = local123;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6377(@OriginalArg(0) int arg0) {
		if (this.aClass183_1.method4483()) {
			@Pc(18) int local18 = this.anInt3808 * this.aClass183_1.anInt5205 / Static330.anInt6003;
			do {
				@Pc(27) long local27 = this.aLong96 + (long) local18 * (long) arg0;
				if (this.aLong97 - local27 >= 0L) {
					this.aLong96 = local27;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong97 + (long) local18 - this.aLong96 - 1L) / (long) local18);
				this.aLong96 += (long) local18 * (long) local55;
				arg0 -= local55;
				this.aClass6_Sub18_Sub3_1.method6377(local55);
				this.method3327();
			} while (this.aClass183_1.method4483());
		}
		this.aClass6_Sub18_Sub3_1.method6377(arg0);
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "(I)V")
	public synchronized void method3322() {
		for (@Pc(5) Class6_Sub28 local5 = (Class6_Sub28) this.aClass128_13.method3265(); local5 != null; local5 = (Class6_Sub28) this.aClass128_13.method3273()) {
			local5.method4226();
		}
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(II)V")
	private void method3324(@OriginalArg(0) int arg0) {
		if ((this.anIntArray236[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class6_Sub27 local19 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7838(); local19 != null; local19 = (Class6_Sub27) this.aClass6_Sub18_Sub3_1.aClass361_50.method7845()) {
			if (arg0 == local19.anInt4732 && this.aClass6_Sub27ArrayArray2[arg0][local19.anInt4731] == null && local19.anInt4717 < 0) {
				local19.anInt4717 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!fea;Lclient!pfa;Lclient!ia;Z)Z")
	public synchronized boolean method3325(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) Class6_Sub24 arg2) {
		arg2.method3611();
		@Pc(14) boolean local14 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class6_Sub42 local34 = (Class6_Sub42) arg2.aClass128_19.method3265(); local34 != null; local34 = (Class6_Sub42) arg2.aClass128_19.method3273()) {
			@Pc(40) int local40 = (int) local34.aLong263;
			@Pc(48) Class6_Sub28 local48 = (Class6_Sub28) this.aClass128_13.method3263((long) local40);
			if (local48 == null) {
				local48 = Static282.method4635(local40, arg1);
				if (local48 == null) {
					local14 = false;
					continue;
				}
				this.aClass128_13.method3267(local48, (long) local40);
			}
			if (!local48.method4228(arg0, local34.aByteArray106, local28)) {
				local14 = false;
			}
		}
		if (local14) {
			arg2.method3610();
		}
		return local14;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!jh;I)I")
	private int method3326(@OriginalArg(0) Class6_Sub27 arg0) {
		@Pc(14) int local14 = (arg0.anInt4723 * arg0.anInt4729 >> 12) + arg0.anInt4716;
		local14 += (this.anIntArray225[arg0.anInt4732] - 8192) * this.anIntArray232[arg0.anInt4732] >> 12;
		@Pc(40) Class162 local40 = arg0.aClass162_1;
		@Pc(57) int local57;
		if (local40.anInt4860 > 0 && (local40.anInt4854 > 0 || this.anIntArray229[arg0.anInt4732] > 0)) {
			local57 = local40.anInt4854 << 2;
			@Pc(62) int local62 = local40.anInt4858 << 1;
			if (arg0.anInt4718 < local62) {
				local57 = arg0.anInt4718 * local57 / local62;
			}
			local57 += this.anIntArray229[arg0.anInt4732] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt4720 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local57 * local96);
		}
		local57 = (int) ((double) (arg0.aClass6_Sub19_Sub1_4.anInt3210 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static330.anInt6003 + 0.5D);
		return local57 < 1 ? 1 : local57;
	}

	@OriginalMember(owner = "client!he", name = "i", descriptor = "(I)V")
	private void method3327() {
		@Pc(8) int local8 = this.anInt3810;
		@Pc(22) int local22 = this.anInt3809;
		@Pc(25) long local25 = this.aLong97;
		if (this.aClass6_Sub24_1 != null && this.anInt3811 == local22) {
			this.method3298(this.aBoolean258, this.aBoolean257, this.aClass6_Sub24_1);
			this.method3327();
			return;
		}
		while (this.anInt3809 == local22) {
			while (this.aClass183_1.anIntArray388[local8] == local22) {
				this.aClass183_1.method4485(local8);
				@Pc(54) int local54 = this.aClass183_1.method4489(local8);
				if (local54 == 1) {
					this.aClass183_1.method4490();
					this.aClass183_1.method4488(local8);
					if (this.aClass183_1.method4480()) {
						if (this.aClass6_Sub24_1 != null) {
							this.method3317(this.aClass6_Sub24_1, this.aBoolean257);
							this.method3327();
							return;
						}
						if (!this.aBoolean257 || local22 == 0) {
							this.method3310(true);
							this.aClass183_1.method4486();
							return;
						}
						this.aClass183_1.method4477(local25);
					}
					break;
				}
				if ((local54 & 0x80) != 0) {
					this.method3305(local54);
				}
				this.aClass183_1.method4484(local8);
				this.aClass183_1.method4488(local8);
			}
			local8 = this.aClass183_1.method4482();
			local22 = this.aClass183_1.anIntArray388[local8];
			local25 = this.aClass183_1.method4487(local22);
		}
		this.anInt3810 = local8;
		this.aLong97 = local25;
		this.anInt3809 = local22;
		if (this.aClass6_Sub24_1 != null && this.anInt3811 < local22) {
			this.anInt3810 = -1;
			this.anInt3809 = this.anInt3811;
			this.aLong97 = this.aClass183_1.method4487(this.anInt3809);
		}
	}
}
