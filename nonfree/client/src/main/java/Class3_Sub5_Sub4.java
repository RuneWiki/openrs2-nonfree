import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class3_Sub5_Sub4 extends Class3_Sub5 {

	@OriginalMember(owner = "client!ua", name = "Db", descriptor = "Z")
	private boolean aBoolean573;

	@OriginalMember(owner = "client!ua", name = "Eb", descriptor = "I")
	private int anInt6610;

	@OriginalMember(owner = "client!ua", name = "Gb", descriptor = "J")
	private long aLong200;

	@OriginalMember(owner = "client!ua", name = "Hb", descriptor = "I")
	private int anInt6611;

	@OriginalMember(owner = "client!ua", name = "Ib", descriptor = "J")
	private long aLong201;

	@OriginalMember(owner = "client!ua", name = "Jb", descriptor = "Z")
	private boolean aBoolean574;

	@OriginalMember(owner = "client!ua", name = "Kb", descriptor = "Lclient!tb;")
	private Class3_Sub40 aClass3_Sub40_2;

	@OriginalMember(owner = "client!ua", name = "Lb", descriptor = "I")
	private int anInt6612;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "[I")
	private final int[] anIntArray421 = new int[16];

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "[[Lclient!qk;")
	private final Class3_Sub36[][] aClass3_Sub36ArrayArray1 = new Class3_Sub36[16][128];

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
	private final int anInt6573 = 1000000;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "[I")
	private final int[] anIntArray422 = new int[16];

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "[I")
	private final int[] anIntArray426 = new int[16];

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "[[Lclient!qk;")
	private final Class3_Sub36[][] aClass3_Sub36ArrayArray2 = new Class3_Sub36[16][128];

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
	private int anInt6595 = 256;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "[I")
	private final int[] anIntArray424 = new int[16];

	@OriginalMember(owner = "client!ua", name = "qb", descriptor = "[I")
	private final int[] anIntArray434 = new int[16];

	@OriginalMember(owner = "client!ua", name = "jb", descriptor = "[I")
	private final int[] anIntArray429 = new int[16];

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "[I")
	public final int[] anIntArray427 = new int[16];

	@OriginalMember(owner = "client!ua", name = "rb", descriptor = "[I")
	private final int[] anIntArray435 = new int[16];

	@OriginalMember(owner = "client!ua", name = "pb", descriptor = "[I")
	private final int[] anIntArray433 = new int[16];

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "[I")
	public final int[] anIntArray425 = new int[16];

	@OriginalMember(owner = "client!ua", name = "kb", descriptor = "[I")
	private final int[] anIntArray430 = new int[16];

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "[I")
	private final int[] anIntArray428 = new int[16];

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "[I")
	private final int[] anIntArray423 = new int[16];

	@OriginalMember(owner = "client!ua", name = "mb", descriptor = "[I")
	private final int[] anIntArray431 = new int[16];

	@OriginalMember(owner = "client!ua", name = "wb", descriptor = "[I")
	public final int[] anIntArray436 = new int[16];

	@OriginalMember(owner = "client!ua", name = "ob", descriptor = "[I")
	private final int[] anIntArray432 = new int[16];

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "Lclient!vg;")
	private final Class258 aClass258_1 = new Class258();

	@OriginalMember(owner = "client!ua", name = "Fb", descriptor = "Lclient!tv;")
	private final Class3_Sub5_Sub3 aClass3_Sub5_Sub3_1 = new Class3_Sub5_Sub3(this);

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "Lclient!an;")
	private final Class11 aClass11_40 = new Class11(128);

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class3_Sub5_Sub4() {
		this.method5138();
		this.method5136(true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BII)V")
	public synchronized void method5124() {
		this.method5130();
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I")
	public int method5125() {
		return this.anInt6595;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!qk;Z)Z")
	public boolean method5126(@OriginalArg(0) Class3_Sub36 arg0) {
		if (arg0.aClass3_Sub5_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt5656 >= 0) {
			arg0.method5977();
			if (arg0.anInt5654 > 0 && arg0 == this.aClass3_Sub36ArrayArray2[arg0.anInt5655][arg0.anInt5654]) {
				this.aClass3_Sub36ArrayArray2[arg0.anInt5655][arg0.anInt5654] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!qk;IZ)V")
	public void method5128(@OriginalArg(0) Class3_Sub36 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass3_Sub6_Sub1_1.aByteArray16.length;
		@Pc(31) int local31;
		if (arg1 && arg0.aClass3_Sub6_Sub1_1.aBoolean95) {
			@Pc(42) int local42 = local12 + local12 - arg0.aClass3_Sub6_Sub1_1.anInt1041;
			local12 <<= 0x8;
			local31 = (int) ((long) local42 * (long) this.anIntArray425[arg0.anInt5655] >> 6);
			if (local12 <= local31) {
				arg0.aClass3_Sub5_Sub2_3.method2092();
				local31 = local12 + local12 - local31 - 1;
			}
		} else {
			local31 = (int) ((long) local12 * (long) this.anIntArray425[arg0.anInt5655] >> 6);
		}
		arg0.aClass3_Sub5_Sub2_3.method2097(local31);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public synchronized void method5129() {
		for (@Pc(17) Class3_Sub42 local17 = (Class3_Sub42) this.aClass11_40.method313(); local17 != null; local17 = (Class3_Sub42) this.aClass11_40.method316()) {
			local17.method5977();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5117(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass258_1.method5415()) {
			@Pc(14) int local14 = this.anInt6573 * this.aClass258_1.anInt6912 / Static232.anInt4442;
			do {
				@Pc(23) long local23 = this.aLong201 + (long) local14 * (long) arg2;
				if (this.aLong200 - local23 >= 0L) {
					this.aLong201 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong200 - this.aLong201 - 1L) / (long) local14);
				this.aLong201 += (long) local51 * (long) local14;
				this.aClass3_Sub5_Sub3_1.method5117(arg0, arg1, local51);
				arg1 += local51;
				arg2 -= local51;
				this.method5144();
			} while (this.aClass258_1.method5415());
		}
		this.aClass3_Sub5_Sub3_1.method5117(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
	private void method5130() {
		this.anIntArray424[9] = 128;
		this.anIntArray431[9] = 128;
		this.method5137(9, 128);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!tb;B)V")
	public synchronized void method5131(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub40 arg1) {
		this.method5134(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5119(@OriginalArg(0) int arg0) {
		if (this.aClass258_1.method5415()) {
			@Pc(14) int local14 = this.aClass258_1.anInt6912 * this.anInt6573 / Static232.anInt4442;
			do {
				@Pc(23) long local23 = this.aLong201 + (long) arg0 * (long) local14;
				if (this.aLong200 - local23 >= 0L) {
					this.aLong201 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong200 - this.aLong201 - 1L) / (long) local14);
				this.aLong201 += (long) local54 * (long) local14;
				this.aClass3_Sub5_Sub3_1.method5119(local54);
				arg0 -= local54;
				this.method5144();
			} while (this.aClass258_1.method5415());
		}
		this.aClass3_Sub5_Sub3_1.method5119(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)V")
	private void method5132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray435[arg0] = arg1;
		this.anIntArray427[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!tb;ILclient!bu;Lclient!ld;)Z")
	public synchronized boolean method5133(@OriginalArg(1) Class3_Sub40 arg0, @OriginalArg(3) Class32 arg1, @OriginalArg(4) Class140 arg2) {
		arg0.method4956();
		@Pc(7) boolean local7 = true;
		@Pc(19) int[] local19 = new int[] { 22050 };
		for (@Pc(25) Class3_Sub3 local25 = (Class3_Sub3) arg0.aClass11_38.method313(); local25 != null; local25 = (Class3_Sub3) arg0.aClass11_38.method316()) {
			@Pc(30) int local30 = (int) local25.aLong234;
			@Pc(38) Class3_Sub42 local38 = (Class3_Sub42) this.aClass11_40.method324((long) local30);
			if (local38 == null) {
				local38 = Static231.method3480(arg1, local30);
				if (local38 == null) {
					local7 = false;
					continue;
				}
				this.aClass11_40.method319(local38, (long) local30);
			}
			if (!local38.method5229(local25.aByteArray9, local19, arg2)) {
				local7 = false;
			}
		}
		if (local7) {
			arg0.method4957();
		}
		return local7;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!tb;ZZ)V")
	private synchronized void method5134(@OriginalArg(1) Class3_Sub40 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method5152(arg1);
		this.aClass258_1.method5423(arg0.aByteArray80);
		this.aBoolean573 = arg2;
		this.aLong201 = 0;
		@Pc(23) int local23 = this.aClass258_1.method5414();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass258_1.method5422(local25);
			this.aClass258_1.method5420(local25);
			this.aClass258_1.method5421(local25);
		}
		this.anInt6611 = this.aClass258_1.method5419();
		this.anInt6610 = this.aClass258_1.anIntArray503[this.anInt6611];
		this.aLong200 = this.aClass258_1.method5413(this.anInt6610);
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "()Lclient!bl;")
	@Override
	public synchronized Class3_Sub5 method5123() {
		return this.aClass3_Sub5_Sub3_1;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)V")
	private void method5135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BZ)V")
	private void method5136(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method5146(-1);
		} else {
			this.method5148(-1);
		}
		this.method5149(-1);
		for (@Pc(22) int local22 = 0; local22 < 16; local22++) {
			this.anIntArray434[local22] = this.anIntArray424[local22];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray431[local45] = this.anIntArray424[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZ)V")
	private void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray434[arg0]) {
			this.anIntArray434[arg0] = arg1;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass3_Sub36ArrayArray2[arg0][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(BII)V")
	private synchronized void method5138() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray429[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
	private void method5139(@OriginalArg(0) int arg0) {
		if ((this.anIntArray436[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(16) Class3_Sub36 local16 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5208(); local16 != null; local16 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5203()) {
			if (arg0 == local16.anInt5655 && this.aClass3_Sub36ArrayArray1[arg0][local16.anInt5640] == null && local16.anInt5656 < 0) {
				local16.anInt5656 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(III)V")
	private void method5140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray432[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!qk;)I")
	private int method5141(@OriginalArg(1) Class3_Sub36 arg0) {
		@Pc(15) int local15 = arg0.anInt5648 + (arg0.anInt5650 * arg0.anInt5658 >> 12);
		local15 += (this.anIntArray432[arg0.anInt5655] - 8192) * this.anIntArray423[arg0.anInt5655] >> 12;
		@Pc(36) Class114 local36 = arg0.aClass114_1;
		@Pc(53) int local53;
		if (local36.anInt3428 > 0 && (local36.anInt3429 > 0 || this.anIntArray430[arg0.anInt5655] > 0)) {
			local53 = local36.anInt3429 << 2;
			@Pc(58) int local58 = local36.anInt3423 << 1;
			if (local58 > arg0.anInt5641) {
				local53 = local53 * arg0.anInt5641 / local58;
			}
			local53 += this.anIntArray430[arg0.anInt5655] >> 7;
			@Pc(88) double local88 = Math.sin((double) (arg0.anInt5644 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local53 * local88);
		}
		local53 = (int) ((double) (arg0.aClass3_Sub6_Sub1_1.anInt1042 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static232.anInt4442 + 0.5D);
		return local53 >= 1 ? local53 : 1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)V")
	private void method5142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5153(arg0, 64, arg1);
		if ((this.anIntArray436[arg1] & 0x2) != 0) {
			for (@Pc(27) Class3_Sub36 local27 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5207(); local27 != null; local27 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5214()) {
				if (arg1 == local27.anInt5655 && local27.anInt5656 < 0) {
					this.aClass3_Sub36ArrayArray1[arg1][local27.anInt5640] = null;
					this.aClass3_Sub36ArrayArray1[arg1][arg0] = local27;
					@Pc(66) int local66 = (local27.anInt5658 * local27.anInt5650 >> 12) + local27.anInt5648;
					local27.anInt5648 += arg0 - local27.anInt5640 << 8;
					local27.anInt5650 = 4096;
					local27.anInt5640 = arg0;
					local27.anInt5658 = local66 - local27.anInt5648;
					return;
				}
			}
		}
		@Pc(112) Class3_Sub42 local112 = (Class3_Sub42) this.aClass11_40.method324((long) this.anIntArray434[arg1]);
		if (local112 == null) {
			return;
		}
		@Pc(120) Class3_Sub6_Sub1 local120 = local112.aClass3_Sub6_Sub1Array1[arg0];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class3_Sub36 local127 = new Class3_Sub36();
		local127.aClass3_Sub6_Sub1_1 = local120;
		local127.anInt5655 = arg1;
		local127.aClass3_Sub42_1 = local112;
		local127.aClass114_1 = local112.aClass114Array1[arg0];
		local127.anInt5654 = local112.aByteArray86[arg0];
		local127.anInt5640 = arg0;
		local127.anInt5652 = local112.aByteArray85[arg0] * arg2 * arg2 * local112.anInt6682 + 1024 >> 11;
		local127.anInt5657 = local112.aByteArray84[arg0] & 0xFF;
		local127.anInt5648 = (arg0 << 8) - (local112.aShortArray140[arg0] & 0x7FFF);
		local127.anInt5646 = 0;
		local127.anInt5656 = -1;
		local127.anInt5642 = 0;
		local127.anInt5643 = 0;
		local127.anInt5659 = 0;
		if (this.anIntArray425[arg1] == 0) {
			local127.aClass3_Sub5_Sub2_3 = Static458.method2104(local120, this.method5141(local127), this.method5160(local127), this.method5147(local127));
		} else {
			local127.aClass3_Sub5_Sub2_3 = Static458.method2104(local120, this.method5141(local127), 0, this.method5147(local127));
			this.method5128(local127, local112.aShortArray140[arg0] < 0);
		}
		if (local112.aShortArray140[arg0] < 0) {
			local127.aClass3_Sub5_Sub2_3.method2100(-1);
		}
		if (local127.anInt5654 >= 0) {
			@Pc(279) Class3_Sub36 local279 = this.aClass3_Sub36ArrayArray2[arg1][local127.anInt5654];
			if (local279 != null && local279.anInt5656 < 0) {
				this.aClass3_Sub36ArrayArray1[arg1][local279.anInt5640] = null;
				local279.anInt5656 = 0;
			}
			this.aClass3_Sub36ArrayArray2[arg1][local127.anInt5654] = local127;
		}
		this.aClass3_Sub5_Sub3_1.aClass243_42.method5198(local127);
		this.aClass3_Sub36ArrayArray1[arg1][arg0] = local127;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	private void method5143(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method5153(local22, local28, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method5142(local22, local16, local28);
			} else {
				this.method5153(local22, 64, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method5154(local28, local16, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray431[local16] = (this.anIntArray431[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray431[local16] = (this.anIntArray431[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray430[local16] = (this.anIntArray430[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray430[local16] = (this.anIntArray430[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray433[local16] = (local28 << 7) + (this.anIntArray433[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray433[local16] = local28 + (this.anIntArray433[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray428[local16] = (this.anIntArray428[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray428[local16] = local28 + (this.anIntArray428[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray422[local16] = (this.anIntArray422[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray422[local16] = local28 + (this.anIntArray422[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray421[local16] = (local28 << 7) + (this.anIntArray421[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray421[local16] = (this.anIntArray421[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray436[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray436[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray436[local16] |= 0x2;
				} else {
					this.method5139(local16);
					this.anIntArray436[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray426[local16] = (local28 << 7) + (this.anIntArray426[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray426[local16] = (this.anIntArray426[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray426[local16] = (this.anIntArray426[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray426[local16] = local28 + (this.anIntArray426[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method5146(local16);
			}
			if (local22 == 121) {
				this.method5149(local16);
			}
			if (local22 == 123) {
				this.method5148(local16);
			}
			@Pc(500) int local500;
			if (local22 == 6) {
				local500 = this.anIntArray426[local16];
				if (local500 == 16384) {
					this.anIntArray423[local16] = (this.anIntArray423[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local500 = this.anIntArray426[local16];
				if (local500 == 16384) {
					this.anIntArray423[local16] = local28 + (this.anIntArray423[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray425[local16] = (this.anIntArray425[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray425[local16] = (this.anIntArray425[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method5159(local16);
					this.anIntArray436[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray436[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method5132(local16, (local28 << 7) + (this.anIntArray435[local16] & 0xFFFFC07F));
			}
			if (local22 == 49) {
				this.method5132(local16, (this.anIntArray435[local16] & 0xFFFFFF80) + local28);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method5137(local16, local22 + this.anIntArray431[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method5135(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00B2) >> 9);
			this.method5140(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method5136(true);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()Lclient!bl;")
	@Override
	public synchronized Class3_Sub5 method5120() {
		return null;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V")
	private void method5144() {
		@Pc(8) int local8 = this.anInt6611;
		@Pc(11) int local11 = this.anInt6610;
		@Pc(14) long local14 = this.aLong200;
		if (this.aClass3_Sub40_2 != null && this.anInt6612 == local11) {
			this.method5134(this.aClass3_Sub40_2, this.aBoolean574, this.aBoolean573);
			this.method5144();
			return;
		}
		while (local11 == this.anInt6610) {
			while (local11 == this.aClass258_1.anIntArray503[local8]) {
				this.aClass258_1.method5422(local8);
				@Pc(43) int local43 = this.aClass258_1.method5408(local8);
				if (local43 == 1) {
					this.aClass258_1.method5416();
					this.aClass258_1.method5421(local8);
					if (this.aClass258_1.method5411()) {
						if (this.aClass3_Sub40_2 != null) {
							this.method5131(this.aBoolean573, this.aClass3_Sub40_2);
							this.method5144();
							return;
						}
						if (!this.aBoolean573 || local11 == 0) {
							this.method5136(true);
							this.aClass258_1.method5409();
							return;
						}
						this.aClass258_1.method5417(local14);
					}
					break;
				}
				if ((local43 & 0x80) != 0) {
					this.method5143(local43);
				}
				this.aClass258_1.method5420(local8);
				this.aClass258_1.method5421(local8);
			}
			local8 = this.aClass258_1.method5419();
			local11 = this.aClass258_1.anIntArray503[local8];
			local14 = this.aClass258_1.method5413(local11);
		}
		this.anInt6611 = local8;
		this.anInt6610 = local11;
		this.aLong200 = local14;
		if (this.aClass3_Sub40_2 != null && local11 > this.anInt6612) {
			this.anInt6611 = -1;
			this.anInt6610 = this.anInt6612;
			this.aLong200 = this.aClass258_1.method5413(this.anInt6610);
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()I")
	@Override
	public synchronized int method5122() {
		return 0;
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
	public synchronized void method5145() {
		for (@Pc(10) Class3_Sub42 local10 = (Class3_Sub42) this.aClass11_40.method313(); local10 != null; local10 = (Class3_Sub42) this.aClass11_40.method316()) {
			local10.method5228();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
	private void method5146(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class3_Sub36 local16 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5208(); local16 != null; local16 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5203()) {
			if (arg0 < 0 || arg0 == local16.anInt5655) {
				if (local16.aClass3_Sub5_Sub2_3 != null) {
					local16.aClass3_Sub5_Sub2_3.method2121(Static232.anInt4442 / 100);
					if (local16.aClass3_Sub5_Sub2_3.method2113()) {
						this.aClass3_Sub5_Sub3_1.aClass3_Sub5_Sub1_36.method889(local16.aClass3_Sub5_Sub2_3);
					}
					local16.method4429();
				}
				if (local16.anInt5656 < 0) {
					this.aClass3_Sub36ArrayArray1[local16.anInt5655][local16.anInt5640] = null;
				}
				local16.method5977();
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!qk;I)I")
	private int method5147(@OriginalArg(0) Class3_Sub36 arg0) {
		@Pc(17) int local17 = this.anIntArray422[arg0.anInt5655];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt5657) * (-local17 + 16384) + 32 >> 6) : arg0.anInt5657 * local17 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
	private void method5148(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class3_Sub36 local16 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5208(); local16 != null; local16 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5203()) {
			if ((arg0 < 0 || local16.anInt5655 == arg0) && local16.anInt5656 < 0) {
				this.aClass3_Sub36ArrayArray1[local16.anInt5655][local16.anInt5640] = null;
				local16.anInt5656 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V")
	private void method5149(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method5149(local7);
			}
			return;
		}
		this.anIntArray428[arg0] = 12800;
		this.anIntArray422[arg0] = 8192;
		this.anIntArray421[arg0] = 16383;
		this.anIntArray432[arg0] = 8192;
		this.anIntArray430[arg0] = 0;
		this.anIntArray433[arg0] = 8192;
		this.method5139(arg0);
		this.method5159(arg0);
		this.anIntArray436[arg0] = 0;
		this.anIntArray426[arg0] = 32767;
		this.anIntArray423[arg0] = 256;
		this.anIntArray425[arg0] = 0;
		this.method5132(arg0, 8192);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB[ILclient!qk;)Z")
	public boolean method5150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class3_Sub36 arg3) {
		arg3.anInt5653 = Static232.anInt4442 / 100;
		if (arg3.anInt5656 >= 0 && (arg3.aClass3_Sub5_Sub2_3 == null || arg3.aClass3_Sub5_Sub2_3.method2119())) {
			arg3.method4429();
			arg3.method5977();
			if (arg3.anInt5654 > 0 && arg3 == this.aClass3_Sub36ArrayArray2[arg3.anInt5655][arg3.anInt5654]) {
				this.aClass3_Sub36ArrayArray2[arg3.anInt5655][arg3.anInt5654] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt5650;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray433[arg3.anInt5655] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt5650 = local56;
		}
		arg3.aClass3_Sub5_Sub2_3.method2114(this.method5141(arg3));
		@Pc(96) Class114 local96 = arg3.aClass114_1;
		arg3.anInt5644 += local96.anInt3428;
		@Pc(105) boolean local105 = false;
		arg3.anInt5641++;
		@Pc(134) double local134 = (double) ((arg3.anInt5650 * arg3.anInt5658 >> 12) + (arg3.anInt5640 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt3425 > 0) {
			if (local96.anInt3426 > 0) {
				arg3.anInt5659 += (int) (Math.pow(2.0D, (double) local96.anInt3426 * local134) * 128.0D + 0.5D);
			} else {
				arg3.anInt5659 += 128;
			}
			if (local96.anInt3425 * arg3.anInt5659 >= 819200) {
				local105 = true;
			}
		}
		if (local96.aByteArray48 != null) {
			if (local96.anInt3430 <= 0) {
				arg3.anInt5646 += 128;
			} else {
				arg3.anInt5646 += (int) (Math.pow(2.0D, local134 * (double) local96.anInt3430) * 128.0D + 0.5D);
			}
			while (arg3.anInt5643 < local96.aByteArray48.length - 2 && arg3.anInt5646 > (local96.aByteArray48[arg3.anInt5643 + 2] & 0xFF) << 8) {
				arg3.anInt5643 += 2;
			}
			if (local96.aByteArray48.length - 2 == arg3.anInt5643 && local96.aByteArray48[arg3.anInt5643 + 1] == 0) {
				local105 = true;
			}
		}
		if (arg3.anInt5656 >= 0 && local96.aByteArray49 != null && (this.anIntArray436[arg3.anInt5655] & 0x1) == 0 && (arg3.anInt5654 < 0 || arg3 != this.aClass3_Sub36ArrayArray2[arg3.anInt5655][arg3.anInt5654])) {
			if (local96.anInt3424 <= 0) {
				arg3.anInt5656 += 128;
			} else {
				arg3.anInt5656 += (int) (Math.pow(2.0D, local134 * (double) local96.anInt3424) * 128.0D + 0.5D);
			}
			while (local96.aByteArray49.length - 2 > arg3.anInt5642 && arg3.anInt5656 > (local96.aByteArray49[arg3.anInt5642 + 2] & 0xFF) << 8) {
				arg3.anInt5642 += 2;
			}
			if (arg3.anInt5642 == local96.aByteArray49.length - 2) {
				local105 = true;
			}
		}
		if (!local105) {
			arg3.aClass3_Sub5_Sub2_3.method2109(arg3.anInt5653, this.method5160(arg3), this.method5147(arg3));
			return false;
		}
		arg3.aClass3_Sub5_Sub2_3.method2121(arg3.anInt5653);
		if (arg2 == null) {
			arg3.aClass3_Sub5_Sub2_3.method5119(arg0);
		} else {
			arg3.aClass3_Sub5_Sub2_3.method5117(arg2, arg1, arg0);
		}
		if (arg3.aClass3_Sub5_Sub2_3.method2113()) {
			this.aClass3_Sub5_Sub3_1.aClass3_Sub5_Sub1_36.method889(arg3.aClass3_Sub5_Sub2_3);
		}
		arg3.method4429();
		if (arg3.anInt5656 >= 0) {
			arg3.method5977();
			if (arg3.anInt5654 > 0 && arg3 == this.aClass3_Sub36ArrayArray2[arg3.anInt5655][arg3.anInt5654]) {
				this.aClass3_Sub36ArrayArray2[arg3.anInt5655][arg3.anInt5654] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)Z")
	public synchronized boolean method5151() {
		return this.aClass258_1.method5415();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
	private synchronized void method5152(@OriginalArg(1) boolean arg0) {
		this.aClass258_1.method5409();
		this.aClass3_Sub40_2 = null;
		this.method5136(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIII)V")
	private void method5153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class3_Sub36 local10 = this.aClass3_Sub36ArrayArray1[arg2][arg0];
		if (local10 == null) {
			return;
		}
		this.aClass3_Sub36ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray436[arg2] & 0x2) == 0) {
			local10.anInt5656 = 0;
			return;
		}
		for (@Pc(38) Class3_Sub36 local38 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5208(); local38 != null; local38 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5203()) {
			if (local10.anInt5655 == local38.anInt5655 && local38.anInt5656 < 0 && local10 != local38) {
				local10.anInt5656 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(IIII)V")
	private void method5154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(II)V")
	public synchronized void method5155(@OriginalArg(1) int arg0) {
		this.anInt6595 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
	public synchronized void method5157() {
		this.method5152(true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V")
	private void method5159(@OriginalArg(0) int arg0) {
		if ((this.anIntArray436[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(13) Class3_Sub36 local13 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5208(); local13 != null; local13 = (Class3_Sub36) this.aClass3_Sub5_Sub3_1.aClass243_42.method5203()) {
			if (arg0 == local13.anInt5655) {
				local13.anInt5645 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Lclient!qk;I)I")
	private int method5160(@OriginalArg(0) Class3_Sub36 arg0) {
		if (this.anIntArray429[arg0.anInt5655] == 0) {
			return 0;
		}
		@Pc(14) Class114 local14 = arg0.aClass114_1;
		@Pc(30) int local30 = this.anIntArray421[arg0.anInt5655] * this.anIntArray428[arg0.anInt5655] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt5652 + 16384 >> 15;
		@Pc(56) int local56 = local47 * this.anInt6595 + 128 >> 8;
		local30 = local56 * this.anIntArray429[arg0.anInt5655] + 128 >> 8;
		if (local14.anInt3425 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) local14.anInt3425 * (double) arg0.anInt5659 * 1.953125E-5D) + 0.5D);
		}
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(124) int local124;
		@Pc(136) int local136;
		if (local14.aByteArray48 != null) {
			local98 = arg0.anInt5646;
			local106 = local14.aByteArray48[arg0.anInt5643 + 1];
			if (local14.aByteArray48.length - 2 > arg0.anInt5643) {
				local124 = (local14.aByteArray48[arg0.anInt5643] & 0xFF) << 8;
				local136 = (local14.aByteArray48[arg0.anInt5643 + 2] & 0xFF) << 8;
				local106 += (local14.aByteArray48[arg0.anInt5643 + 3] - local106) * (-local124 + local98) / (local136 - local124);
			}
			local30 = local30 * local106 + 32 >> 6;
		}
		if (arg0.anInt5656 > 0 && local14.aByteArray49 != null) {
			local98 = arg0.anInt5656;
			local106 = local14.aByteArray49[arg0.anInt5642 + 1];
			if (local14.aByteArray49.length - 2 > arg0.anInt5642) {
				local124 = (local14.aByteArray49[arg0.anInt5642] & 0xFF) << 8;
				local136 = (local14.aByteArray49[arg0.anInt5642 + 2] & 0xFF) << 8;
				local106 += (local98 - local124) * (-local106 + local14.aByteArray49[arg0.anInt5642 + 3]) / (local136 - local124);
			}
			local30 = local30 * local106 + 32 >> 6;
		}
		return local30;
	}
}
