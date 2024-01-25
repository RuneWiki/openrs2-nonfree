import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!wt", name = "Eb", descriptor = "I")
	private int anInt7825;

	@OriginalMember(owner = "client!wt", name = "Fb", descriptor = "J")
	private long aLong249;

	@OriginalMember(owner = "client!wt", name = "Gb", descriptor = "Z")
	private boolean aBoolean520;

	@OriginalMember(owner = "client!wt", name = "Hb", descriptor = "I")
	private int anInt7826;

	@OriginalMember(owner = "client!wt", name = "Ib", descriptor = "J")
	private long aLong250;

	@OriginalMember(owner = "client!wt", name = "Jb", descriptor = "Lclient!pc;")
	private Class3_Sub37 aClass3_Sub37_2;

	@OriginalMember(owner = "client!wt", name = "Kb", descriptor = "Z")
	private boolean aBoolean521;

	@OriginalMember(owner = "client!wt", name = "Lb", descriptor = "I")
	private int anInt7827;

	@OriginalMember(owner = "client!wt", name = "A", descriptor = "[I")
	public final int[] anIntArray517 = new int[16];

	@OriginalMember(owner = "client!wt", name = "E", descriptor = "[I")
	private final int[] anIntArray518 = new int[16];

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "[I")
	private final int[] anIntArray513 = new int[16];

	@OriginalMember(owner = "client!wt", name = "R", descriptor = "[I")
	private final int[] anIntArray520 = new int[16];

	@OriginalMember(owner = "client!wt", name = "U", descriptor = "[I")
	private final int[] anIntArray521 = new int[16];

	@OriginalMember(owner = "client!wt", name = "fb", descriptor = "[I")
	private final int[] anIntArray522 = new int[16];

	@OriginalMember(owner = "client!wt", name = "gb", descriptor = "[I")
	private final int[] anIntArray523 = new int[16];

	@OriginalMember(owner = "client!wt", name = "K", descriptor = "[I")
	private final int[] anIntArray519 = new int[16];

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "[I")
	public final int[] anIntArray514 = new int[16];

	@OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
	private final int anInt7789 = 1000000;

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "[I")
	private final int[] anIntArray515 = new int[16];

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "[I")
	private final int[] anIntArray512 = new int[16];

	@OriginalMember(owner = "client!wt", name = "ob", descriptor = "[I")
	private final int[] anIntArray524 = new int[16];

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "[I")
	private final int[] anIntArray516 = new int[16];

	@OriginalMember(owner = "client!wt", name = "T", descriptor = "[[Lclient!lk;")
	private final Class3_Sub31[][] aClass3_Sub31ArrayArray1 = new Class3_Sub31[16][128];

	@OriginalMember(owner = "client!wt", name = "vb", descriptor = "[I")
	public final int[] anIntArray527 = new int[16];

	@OriginalMember(owner = "client!wt", name = "kb", descriptor = "[[Lclient!lk;")
	private final Class3_Sub31[][] aClass3_Sub31ArrayArray2 = new Class3_Sub31[16][128];

	@OriginalMember(owner = "client!wt", name = "sb", descriptor = "[I")
	private final int[] anIntArray525 = new int[16];

	@OriginalMember(owner = "client!wt", name = "ub", descriptor = "[I")
	private final int[] anIntArray526 = new int[16];

	@OriginalMember(owner = "client!wt", name = "Cb", descriptor = "I")
	private int anInt7824 = 256;

	@OriginalMember(owner = "client!wt", name = "C", descriptor = "Lclient!ue;")
	private final Class245 aClass245_1 = new Class245();

	@OriginalMember(owner = "client!wt", name = "Db", descriptor = "Lclient!ab;")
	private final Class3_Sub1_Sub1 aClass3_Sub1_Sub1_1 = new Class3_Sub1_Sub1(this);

	@OriginalMember(owner = "client!wt", name = "bb", descriptor = "Lclient!lp;")
	private final Class140 aClass140_44 = new Class140(128);

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4() {
		this.method6321();
		this.method6302(true);
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "()Lclient!wq;")
	@Override
	public synchronized Class3_Sub1 method6292() {
		return null;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BIII)V")
	private void method6298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIZ)V")
	private void method6299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!lk;)I")
	private int method6300(@OriginalArg(1) Class3_Sub31 arg0) {
		@Pc(17) int local17 = this.anIntArray525[arg0.anInt4041];
		return local17 >= 8192 ? 16384 - ((16384 - local17) * (-arg0.anInt4044 + 128) + 32 >> 6) : local17 * arg0.anInt4044 - -32 >> 6;
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
	private void method6301() {
		@Pc(14) int local14 = this.anInt7825;
		@Pc(17) int local17 = this.anInt7826;
		@Pc(20) long local20 = this.aLong250;
		if (this.aClass3_Sub37_2 != null && local17 == this.anInt7827) {
			this.method6304(this.aClass3_Sub37_2, this.aBoolean521, this.aBoolean520);
			this.method6301();
			return;
		}
		while (this.anInt7826 == local17) {
			while (local17 == this.aClass245_1.anIntArray438[local14]) {
				this.aClass245_1.method5665(local14);
				@Pc(53) int local53 = this.aClass245_1.method5661(local14);
				if (local53 == 1) {
					this.aClass245_1.method5658();
					this.aClass245_1.method5667(local14);
					if (this.aClass245_1.method5659()) {
						if (this.aClass3_Sub37_2 != null) {
							this.method6325(this.aBoolean520, this.aClass3_Sub37_2);
							this.method6301();
							return;
						}
						if (!this.aBoolean520 || local17 == 0) {
							this.method6302(true);
							this.aClass245_1.method5670();
							return;
						}
						this.aClass245_1.method5662(local20);
					}
					break;
				}
				if ((local53 & 0x80) != 0) {
					this.method6316(local53);
				}
				this.aClass245_1.method5663(local14);
				this.aClass245_1.method5667(local14);
			}
			local14 = this.aClass245_1.method5669();
			local17 = this.aClass245_1.anIntArray438[local14];
			local20 = this.aClass245_1.method5671(local17);
		}
		this.anInt7826 = local17;
		this.anInt7825 = local14;
		this.aLong250 = local20;
		if (this.aClass3_Sub37_2 != null && local17 > this.anInt7827) {
			this.anInt7826 = this.anInt7827;
			this.anInt7825 = -1;
			this.aLong250 = this.aClass245_1.method5671(this.anInt7826);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZ)V")
	private void method6302(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method6326(-1);
		} else {
			this.method6332(-1);
		}
		this.method6329(-1);
		for (@Pc(28) int local28 = 0; local28 < 16; local28++) {
			this.anIntArray523[local28] = this.anIntArray516[local28];
		}
		for (@Pc(46) int local46 = 0; local46 < 16; local46++) {
			this.anIntArray520[local46] = this.anIntArray516[local46] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!pc;ZIZ)V")
	private synchronized void method6304(@OriginalArg(0) Class3_Sub37 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method6320(arg1);
		this.aClass245_1.method5672(arg0.aByteArray93);
		this.aBoolean520 = arg2;
		this.aLong249 = 0L;
		@Pc(24) int local24 = this.aClass245_1.method5666();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass245_1.method5665(local26);
			this.aClass245_1.method5663(local26);
			this.aClass245_1.method5667(local26);
		}
		this.anInt7825 = this.aClass245_1.method5669();
		this.anInt7826 = this.aClass245_1.anIntArray438[this.anInt7825];
		this.aLong250 = this.aClass245_1.method5671(this.anInt7826);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)V")
	public synchronized void method6305(@OriginalArg(0) int arg0) {
		this.anInt7824 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILclient!pc;Lclient!uu;Lclient!f;)Z")
	public synchronized boolean method6306(@OriginalArg(2) Class3_Sub37 arg0, @OriginalArg(3) Class250 arg1, @OriginalArg(4) Class67 arg2) {
		arg0.method4385();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class3_Sub33 local29 = (Class3_Sub33) arg0.aClass140_31.method3486(); local29 != null; local29 = (Class3_Sub33) arg0.aClass140_31.method3485()) {
			@Pc(35) int local35 = (int) local29.aLong248;
			@Pc(43) Class3_Sub21 local43 = (Class3_Sub21) this.aClass140_44.method3490((long) local35);
			if (local43 == null) {
				local43 = Static168.method2588(local35, arg1);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass140_44.method3494((long) local35, local43);
			}
			if (!local43.method2032(local23, local29.aByteArray75, arg2)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method4384();
		}
		return local9;
	}

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)V")
	public synchronized void method6307() {
		for (@Pc(15) Class3_Sub21 local15 = (Class3_Sub21) this.aClass140_44.method3486(); local15 != null; local15 = (Class3_Sub21) this.aClass140_44.method3485()) {
			local15.method2029();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIB)V")
	private void method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray521[arg0] = arg1;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(ILclient!lk;)Z")
	public boolean method6309(@OriginalArg(1) Class3_Sub31 arg0) {
		if (arg0.aClass3_Sub1_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt4049 >= 0) {
			arg0.method6288();
			if (arg0.anInt4040 > 0 && arg0 == this.aClass3_Sub31ArrayArray2[arg0.anInt4041][arg0.anInt4040]) {
				this.aClass3_Sub31ArrayArray2[arg0.anInt4041][arg0.anInt4040] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6290(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass245_1.method5664()) {
			@Pc(14) int local14 = this.aClass245_1.anInt6947 * this.anInt7789 / Static203.anInt3626;
			do {
				@Pc(24) long local24 = this.aLong249 + (long) local14 * (long) arg2;
				if (this.aLong250 - local24 >= 0L) {
					this.aLong249 = local24;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong250 - this.aLong249 - 1L) / (long) local14);
				this.aLong249 += (long) local14 * (long) local54;
				this.aClass3_Sub1_Sub1_1.method6290(arg0, arg1, local54);
				this.method6301();
				arg1 += local54;
				arg2 -= local54;
			} while (this.aClass245_1.method5664());
		}
		this.aClass3_Sub1_Sub1_1.method6290(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "(I)V")
	public synchronized void method6310() {
		for (@Pc(11) Class3_Sub21 local11 = (Class3_Sub21) this.aClass140_44.method3486(); local11 != null; local11 = (Class3_Sub21) this.aClass140_44.method3485()) {
			local11.method6288();
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(IIZ)V")
	public synchronized void method6311() {
		this.method6334();
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)V")
	private void method6312(@OriginalArg(1) int arg0) {
		if ((this.anIntArray517[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(24) Class3_Sub31 local24 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4519(); local24 != null; local24 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4525()) {
			if (arg0 == local24.anInt4041 && this.aClass3_Sub31ArrayArray1[arg0][local24.anInt4055] == null && local24.anInt4049 < 0) {
				local24.anInt4049 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIII)V")
	private void method6313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method6315(arg0, arg1, 64);
		if ((this.anIntArray517[arg1] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub31 local25 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4531(); local25 != null; local25 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4532()) {
				if (arg1 == local25.anInt4041 && local25.anInt4049 < 0) {
					this.aClass3_Sub31ArrayArray1[arg1][local25.anInt4055] = null;
					this.aClass3_Sub31ArrayArray1[arg1][arg0] = local25;
					@Pc(60) int local60 = (local25.anInt4050 * local25.anInt4053 >> 12) + local25.anInt4051;
					local25.anInt4051 += arg0 - local25.anInt4055 << 8;
					local25.anInt4050 = local60 - local25.anInt4051;
					local25.anInt4053 = 4096;
					local25.anInt4055 = arg0;
					return;
				}
			}
		}
		@Pc(105) Class3_Sub21 local105 = (Class3_Sub21) this.aClass140_44.method3490((long) this.anIntArray523[arg1]);
		if (local105 == null) {
			return;
		}
		@Pc(113) Class3_Sub28_Sub1 local113 = local105.aClass3_Sub28_Sub1Array1[arg0];
		if (local113 == null) {
			return;
		}
		@Pc(120) Class3_Sub31 local120 = new Class3_Sub31();
		local120.aClass3_Sub21_1 = local105;
		local120.aClass3_Sub28_Sub1_1 = local113;
		local120.anInt4041 = arg1;
		local120.aClass73_1 = local105.aClass73Array1[arg0];
		local120.anInt4040 = local105.aByteArray45[arg0];
		local120.anInt4055 = arg0;
		local120.anInt4043 = local105.anInt2344 * arg2 * arg2 * local105.aByteArray44[arg0] + 1024 >> 11;
		local120.anInt4044 = local105.aByteArray46[arg0] & 0xFF;
		local120.anInt4051 = (arg0 << 8) - (local105.aShortArray36[arg0] & 0x7FFF);
		local120.anInt4046 = 0;
		local120.anInt4042 = 0;
		local120.anInt4052 = 0;
		local120.anInt4039 = 0;
		local120.anInt4049 = -1;
		if (this.anIntArray527[arg1] == 0) {
			local120.aClass3_Sub1_Sub3_3 = Static474.method5343(local113, this.method6318(local120), this.method6314(local120), this.method6300(local120));
		} else {
			local120.aClass3_Sub1_Sub3_3 = Static474.method5343(local113, this.method6318(local120), 0, this.method6300(local120));
			this.method6327(local105.aShortArray36[arg0] < 0, local120);
		}
		if (local105.aShortArray36[arg0] < 0) {
			local120.aClass3_Sub1_Sub3_3.method5358(-1);
		}
		if (local120.anInt4040 >= 0) {
			@Pc(275) Class3_Sub31 local275 = this.aClass3_Sub31ArrayArray2[arg1][local120.anInt4040];
			if (local275 != null && local275.anInt4049 < 0) {
				this.aClass3_Sub31ArrayArray1[arg1][local275.anInt4055] = null;
				local275.anInt4049 = 0;
			}
			this.aClass3_Sub31ArrayArray2[arg1][local120.anInt4040] = local120;
		}
		this.aClass3_Sub1_Sub1_1.aClass193_1.method4527(local120);
		this.aClass3_Sub31ArrayArray1[arg1][arg0] = local120;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!lk;I)I")
	private int method6314(@OriginalArg(0) Class3_Sub31 arg0) {
		if (this.anIntArray522[arg0.anInt4041] == 0) {
			return 0;
		}
		@Pc(23) Class73 local23 = arg0.aClass73_1;
		@Pc(39) int local39 = this.anIntArray524[arg0.anInt4041] * this.anIntArray518[arg0.anInt4041] + 4096 >> 13;
		@Pc(47) int local47 = local39 * local39 + 16384 >> 15;
		@Pc(56) int local56 = arg0.anInt4043 * local47 + 16384 >> 15;
		@Pc(65) int local65 = this.anInt7824 * local56 + 128 >> 8;
		local39 = this.anIntArray522[arg0.anInt4041] * local65 + 128 >> 8;
		if (local23.anInt1979 > 0) {
			local39 = (int) ((double) local39 * Math.pow(0.5D, (double) local23.anInt1979 * (double) arg0.anInt4046 * 1.953125E-5D) + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(130) int local130;
		@Pc(142) int local142;
		if (local23.aByteArray36 != null) {
			local104 = arg0.anInt4039;
			local112 = local23.aByteArray36[arg0.anInt4042 + 1];
			if (local23.aByteArray36.length - 2 > arg0.anInt4042) {
				local130 = (local23.aByteArray36[arg0.anInt4042] & 0xFF) << 8;
				local142 = (local23.aByteArray36[arg0.anInt4042 + 2] & 0xFF) << 8;
				local112 += (local23.aByteArray36[arg0.anInt4042 + 3] - local112) * (local104 + -local130) / (local142 - local130);
			}
			local39 = local39 * local112 + 32 >> 6;
		}
		if (arg0.anInt4049 > 0 && local23.aByteArray37 != null) {
			local104 = arg0.anInt4049;
			local112 = local23.aByteArray37[arg0.anInt4052 + 1];
			if (local23.aByteArray37.length - 2 > arg0.anInt4052) {
				local130 = (local23.aByteArray37[arg0.anInt4052] & 0xFF) << 8;
				local142 = (local23.aByteArray37[arg0.anInt4052 + 2] & 0xFF) << 8;
				local112 += (local104 - local130) * (local23.aByteArray37[arg0.anInt4052 + 3] - local112) / (local142 - local130);
			}
			local39 = local112 * local39 + 32 >> 6;
		}
		return local39;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(IIII)V")
	private void method6315(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub31 local12 = this.aClass3_Sub31ArrayArray1[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub31ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray517[arg1] & 0x2) == 0) {
			local12.anInt4049 = 0;
			return;
		}
		for (@Pc(46) Class3_Sub31 local46 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4519(); local46 != null; local46 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4525()) {
			if (local12.anInt4041 == local46.anInt4041 && local46.anInt4049 < 0 && local46 != local12) {
				local12.anInt4049 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB)V")
	private void method6316(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6315(local22, local16, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method6313(local22, local16, local28);
			} else {
				this.method6315(local22, local16, 64);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6298(local22, local28, local16);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray520[local16] = (local28 << 14) + (this.anIntArray520[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray520[local16] = (local28 << 7) + (this.anIntArray520[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray519[local16] = (this.anIntArray519[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray519[local16] = (this.anIntArray519[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray513[local16] = (this.anIntArray513[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray513[local16] = local28 + (this.anIntArray513[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray524[local16] = (this.anIntArray524[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray524[local16] = (this.anIntArray524[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray525[local16] = (local28 << 7) + (this.anIntArray525[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray525[local16] = local28 + (this.anIntArray525[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray518[local16] = (this.anIntArray518[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray518[local16] = local28 + (this.anIntArray518[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray517[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray517[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method6312(local16);
					this.anIntArray517[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray517[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray512[local16] = (this.anIntArray512[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray512[local16] = (this.anIntArray512[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray512[local16] = (local28 << 7) + (this.anIntArray512[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray512[local16] = (this.anIntArray512[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method6326(local16);
			}
			if (local22 == 121) {
				this.method6329(local16);
			}
			if (local22 == 123) {
				this.method6332(local16);
			}
			@Pc(504) int local504;
			if (local22 == 6) {
				local504 = this.anIntArray512[local16];
				if (local504 == 16384) {
					this.anIntArray526[local16] = (this.anIntArray526[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local504 = this.anIntArray512[local16];
				if (local504 == 16384) {
					this.anIntArray526[local16] = (this.anIntArray526[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray527[local16] = (local28 << 7) + (this.anIntArray527[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray527[local16] = (this.anIntArray527[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method6328(local16);
					this.anIntArray517[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray517[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method6331((local28 << 7) + (this.anIntArray515[local16] & 0xFFFFC07F), local16);
			}
			if (local22 == 49) {
				this.method6331(local28 + (this.anIntArray515[local16] & 0xFFFFFF80), local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6330(local16, local22 + this.anIntArray520[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6299(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method6308(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method6302(true);
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "(I)V")
	public synchronized void method6317() {
		this.method6320(true);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!lk;B)I")
	private int method6318(@OriginalArg(0) Class3_Sub31 arg0) {
		@Pc(20) int local20 = (arg0.anInt4050 * arg0.anInt4053 >> 12) + arg0.anInt4051;
		local20 += this.anIntArray526[arg0.anInt4041] * (this.anIntArray521[arg0.anInt4041] - 8192) >> 12;
		@Pc(41) Class73 local41 = arg0.aClass73_1;
		@Pc(61) int local61;
		if (local41.anInt1978 > 0 && (local41.anInt1980 > 0 || this.anIntArray519[arg0.anInt4041] > 0)) {
			local61 = local41.anInt1980 << 2;
			@Pc(66) int local66 = local41.anInt1976 << 1;
			if (arg0.anInt4047 < local66) {
				local61 = arg0.anInt4047 * local61 / local66;
			}
			local61 += this.anIntArray519[arg0.anInt4041] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt4048 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) (local100 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass3_Sub28_Sub1_1.anInt3569 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static203.anInt3626 + 0.5D);
		return local61 >= 1 ? local61 : 1;
	}

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "(I)Z")
	public synchronized boolean method6319() {
		return this.aClass245_1.method5664();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "()I")
	@Override
	public synchronized int method6291() {
		return 0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZZ)V")
	private synchronized void method6320(@OriginalArg(1) boolean arg0) {
		this.aClass245_1.method5670();
		this.aClass3_Sub37_2 = null;
		this.method6302(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)V")
	private synchronized void method6321() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray522[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "(I)I")
	public int method6323() {
		return this.anInt7824;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BZLclient!pc;)V")
	public synchronized void method6325(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub37 arg1) {
		this.method6304(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "()Lclient!wq;")
	@Override
	public synchronized Class3_Sub1 method6296() {
		return this.aClass3_Sub1_Sub1_1;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(IB)V")
	private void method6326(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3_Sub31 local12 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4519(); local12 != null; local12 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4525()) {
			if (arg0 < 0 || arg0 == local12.anInt4041) {
				if (local12.aClass3_Sub1_Sub3_3 != null) {
					local12.aClass3_Sub1_Sub3_3.method5366(Static203.anInt3626 / 100);
					if (local12.aClass3_Sub1_Sub3_3.method5357()) {
						this.aClass3_Sub1_Sub1_1.aClass3_Sub1_Sub2_1.method5094(local12.aClass3_Sub1_Sub3_3);
					}
					local12.method3442();
				}
				if (local12.anInt4049 < 0) {
					this.aClass3_Sub31ArrayArray1[local12.anInt4041][local12.anInt4055] = null;
				}
				local12.method6288();
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZILclient!lk;)V")
	public void method6327(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub31 arg1) {
		@Pc(8) int local8 = arg1.aClass3_Sub28_Sub1_1.aByteArray70.length;
		@Pc(35) int local35;
		if (arg0 && arg1.aClass3_Sub28_Sub1_1.aBoolean272) {
			@Pc(22) int local22 = local8 + local8 - arg1.aClass3_Sub28_Sub1_1.anInt3568;
			local35 = (int) ((long) local22 * (long) this.anIntArray527[arg1.anInt4041] >> 6);
			local8 <<= 0x8;
			if (local8 <= local35) {
				local35 = local8 + local8 - local35 - 1;
				arg1.aClass3_Sub1_Sub3_3.method5359();
			}
		} else {
			local35 = (int) ((long) local8 * (long) this.anIntArray527[arg1.anInt4041] >> 6);
		}
		arg1.aClass3_Sub1_Sub3_3.method5348(local35);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZI)V")
	private void method6328(@OriginalArg(1) int arg0) {
		if ((this.anIntArray517[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class3_Sub31 local26 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4519(); local26 != null; local26 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4525()) {
			if (arg0 == local26.anInt4041) {
				local26.anInt4054 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(IZ)V")
	private void method6329(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method6329(local9);
			}
			return;
		}
		this.anIntArray524[arg0] = 12800;
		this.anIntArray525[arg0] = 8192;
		this.anIntArray518[arg0] = 16383;
		this.anIntArray521[arg0] = 8192;
		this.anIntArray519[arg0] = 0;
		this.anIntArray513[arg0] = 8192;
		this.method6312(arg0);
		this.method6328(arg0);
		this.anIntArray517[arg0] = 0;
		this.anIntArray512[arg0] = 32767;
		this.anIntArray526[arg0] = 256;
		this.anIntArray527[arg0] = 0;
		this.method6331(8192, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(BII)V")
	private void method6330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray523[arg0] != arg1) {
			this.anIntArray523[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass3_Sub31ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBI)V")
	private void method6331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray515[arg1] = arg0;
		this.anIntArray514[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(IZ)V")
	private void method6332(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3_Sub31 local12 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4519(); local12 != null; local12 = (Class3_Sub31) this.aClass3_Sub1_Sub1_1.aClass193_1.method4525()) {
			if ((arg0 < 0 || arg0 == local12.anInt4041) && local12.anInt4049 < 0) {
				this.aClass3_Sub31ArrayArray1[local12.anInt4041][local12.anInt4055] = null;
				local12.anInt4049 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "([IBLclient!lk;II)Z")
	public boolean method6333(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class3_Sub31 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.anInt4045 = Static203.anInt3626 / 100;
		if (arg1.anInt4049 >= 0 && (arg1.aClass3_Sub1_Sub3_3 == null || arg1.aClass3_Sub1_Sub3_3.method5381())) {
			arg1.method3442();
			arg1.method6288();
			if (arg1.anInt4040 > 0 && arg1 == this.aClass3_Sub31ArrayArray2[arg1.anInt4041][arg1.anInt4040]) {
				this.aClass3_Sub31ArrayArray2[arg1.anInt4041][arg1.anInt4040] = null;
			}
			return true;
		}
		@Pc(67) int local67 = arg1.anInt4053;
		if (local67 > 0) {
			local67 -= (int) (Math.pow(2.0D, (double) this.anIntArray513[arg1.anInt4041] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local67 < 0) {
				local67 = 0;
			}
			arg1.anInt4053 = local67;
		}
		arg1.aClass3_Sub1_Sub3_3.method5352(this.method6318(arg1));
		@Pc(107) Class73 local107 = arg1.aClass73_1;
		arg1.anInt4047++;
		arg1.anInt4048 += local107.anInt1978;
		@Pc(122) boolean local122 = false;
		@Pc(140) double local140 = (double) ((arg1.anInt4055 - 60 << 8) + (arg1.anInt4053 * arg1.anInt4050 >> 12)) * 5.086263020833333E-6D;
		if (local107.anInt1979 > 0) {
			if (local107.anInt1974 > 0) {
				arg1.anInt4046 += (int) (Math.pow(2.0D, (double) local107.anInt1974 * local140) * 128.0D + 0.5D);
			} else {
				arg1.anInt4046 += 128;
			}
			if (arg1.anInt4046 * local107.anInt1979 >= 819200) {
				local122 = true;
			}
		}
		if (local107.aByteArray36 != null) {
			if (local107.anInt1975 > 0) {
				arg1.anInt4039 += (int) (Math.pow(2.0D, local140 * (double) local107.anInt1975) * 128.0D + 0.5D);
			} else {
				arg1.anInt4039 += 128;
			}
			while (arg1.anInt4042 < local107.aByteArray36.length - 2 && (local107.aByteArray36[arg1.anInt4042 + 2] & 0xFF) << 8 < arg1.anInt4039) {
				arg1.anInt4042 += 2;
			}
			if (arg1.anInt4042 == local107.aByteArray36.length - 2 && local107.aByteArray36[arg1.anInt4042 + 1] == 0) {
				local122 = true;
			}
		}
		if (arg1.anInt4049 >= 0 && local107.aByteArray37 != null && (this.anIntArray517[arg1.anInt4041] & 0x1) == 0 && (arg1.anInt4040 < 0 || this.aClass3_Sub31ArrayArray2[arg1.anInt4041][arg1.anInt4040] != arg1)) {
			if (local107.anInt1981 > 0) {
				arg1.anInt4049 += (int) (Math.pow(2.0D, local140 * (double) local107.anInt1981) * 128.0D + 0.5D);
			} else {
				arg1.anInt4049 += 128;
			}
			while (local107.aByteArray37.length - 2 > arg1.anInt4052 && (local107.aByteArray37[arg1.anInt4052 + 2] & 0xFF) << 8 < arg1.anInt4049) {
				arg1.anInt4052 += 2;
			}
			if (arg1.anInt4052 == local107.aByteArray37.length - 2) {
				local122 = true;
			}
		}
		if (!local122) {
			arg1.aClass3_Sub1_Sub3_3.method5377(arg1.anInt4045, this.method6314(arg1), this.method6300(arg1));
			return false;
		}
		arg1.aClass3_Sub1_Sub3_3.method5366(arg1.anInt4045);
		if (arg0 == null) {
			arg1.aClass3_Sub1_Sub3_3.method6294(arg3);
		} else {
			arg1.aClass3_Sub1_Sub3_3.method6290(arg0, arg2, arg3);
		}
		if (arg1.aClass3_Sub1_Sub3_3.method5357()) {
			this.aClass3_Sub1_Sub1_1.aClass3_Sub1_Sub2_1.method5094(arg1.aClass3_Sub1_Sub3_3);
		}
		arg1.method3442();
		if (arg1.anInt4049 >= 0) {
			arg1.method6288();
			if (arg1.anInt4040 > 0 && this.aClass3_Sub31ArrayArray2[arg1.anInt4041][arg1.anInt4040] == arg1) {
				this.aClass3_Sub31ArrayArray2[arg1.anInt4041][arg1.anInt4040] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6294(@OriginalArg(0) int arg0) {
		if (this.aClass245_1.method5664()) {
			@Pc(14) int local14 = this.aClass245_1.anInt6947 * this.anInt7789 / Static203.anInt3626;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg0 + this.aLong249;
				if (this.aLong250 - local23 >= 0L) {
					this.aLong249 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong250 + (long) local14 - this.aLong249 - 1L) / (long) local14);
				this.aLong249 += (long) local53 * (long) local14;
				arg0 -= local53;
				this.aClass3_Sub1_Sub1_1.method6294(local53);
				this.method6301();
			} while (this.aClass245_1.method5664());
		}
		this.aClass3_Sub1_Sub1_1.method6294(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(III)V")
	private void method6334() {
		this.anIntArray516[9] = 128;
		this.anIntArray520[9] = 128;
		this.method6330(9, 128);
	}
}
