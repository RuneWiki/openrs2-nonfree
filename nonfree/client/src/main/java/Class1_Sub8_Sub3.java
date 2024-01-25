import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class1_Sub8_Sub3 extends Class1_Sub8 {

	@OriginalMember(owner = "client!lfa", name = "Ab", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "client!lfa", name = "Bb", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "client!lfa", name = "Cb", descriptor = "I")
	private int anInt5467;

	@OriginalMember(owner = "client!lfa", name = "Db", descriptor = "Z")
	private boolean aBoolean409;

	@OriginalMember(owner = "client!lfa", name = "Eb", descriptor = "I")
	private int anInt5468;

	@OriginalMember(owner = "client!lfa", name = "Fb", descriptor = "I")
	private int anInt5469;

	@OriginalMember(owner = "client!lfa", name = "Gb", descriptor = "Lclient!ub;")
	private Class1_Sub49 aClass1_Sub49_2;

	@OriginalMember(owner = "client!lfa", name = "Hb", descriptor = "Z")
	private boolean aBoolean410;

	@OriginalMember(owner = "client!lfa", name = "u", descriptor = "I")
	private int anInt5431 = 256;

	@OriginalMember(owner = "client!lfa", name = "p", descriptor = "[I")
	private final int[] anIntArray332 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "w", descriptor = "[[Lclient!li;")
	private final Class1_Sub25[][] aClass1_Sub25ArrayArray1 = new Class1_Sub25[16][128];

	@OriginalMember(owner = "client!lfa", name = "z", descriptor = "[I")
	public final int[] anIntArray334 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "O", descriptor = "[I")
	private final int[] anIntArray339 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "D", descriptor = "[I")
	private final int[] anIntArray336 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "Q", descriptor = "[I")
	private final int[] anIntArray340 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "V", descriptor = "[I")
	private final int[] anIntArray341 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "cb", descriptor = "[I")
	private final int[] anIntArray343 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "E", descriptor = "[I")
	private final int[] anIntArray337 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "r", descriptor = "[I")
	private final int[] anIntArray333 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "eb", descriptor = "[I")
	public final int[] anIntArray344 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "bb", descriptor = "[I")
	private final int[] anIntArray342 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "M", descriptor = "[I")
	private final int[] anIntArray338 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "B", descriptor = "[I")
	public final int[] anIntArray335 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "nb", descriptor = "[I")
	private final int[] anIntArray345 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "sb", descriptor = "[I")
	private final int[] anIntArray346 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "xb", descriptor = "[I")
	private final int[] anIntArray347 = new int[16];

	@OriginalMember(owner = "client!lfa", name = "ub", descriptor = "[[Lclient!li;")
	private final Class1_Sub25[][] aClass1_Sub25ArrayArray2 = new Class1_Sub25[16][128];

	@OriginalMember(owner = "client!lfa", name = "hb", descriptor = "I")
	private final int anInt5458 = 1000000;

	@OriginalMember(owner = "client!lfa", name = "jb", descriptor = "Lclient!ro;")
	private final Class287 aClass287_1 = new Class287();

	@OriginalMember(owner = "client!lfa", name = "zb", descriptor = "Lclient!fu;")
	private final Class1_Sub8_Sub2 aClass1_Sub8_Sub2_1 = new Class1_Sub8_Sub2(this);

	@OriginalMember(owner = "client!lfa", name = "mb", descriptor = "Lclient!wh;")
	private final Class356 aClass356_26 = new Class356(128);

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub3() {
		this.method4660();
		this.method4670(true);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6022(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass287_1.method6560()) {
			@Pc(14) int local14 = this.aClass287_1.anInt7887 * this.anInt5458 / Static426.anInt7216;
			do {
				@Pc(24) long local24 = this.aLong232 + (long) arg2 * (long) local14;
				if (this.aLong231 - local24 >= 0L) {
					this.aLong232 = local24;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong231 + (long) local14 - this.aLong232 - 1L) / (long) local14);
				this.aLong232 += (long) local14 * (long) local53;
				this.aClass1_Sub8_Sub2_1.method6022(arg0, arg1, local53);
				arg2 -= local53;
				this.method4639();
				arg1 += local53;
			} while (this.aClass287_1.method6560());
		}
		this.aClass1_Sub8_Sub2_1.method6022(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)V")
	private void method4635(@OriginalArg(0) int arg0) {
		if ((this.anIntArray335[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class1_Sub25 local22 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7854(); local22 != null; local22 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7853()) {
			if (arg0 == local22.anInt5500 && this.aClass1_Sub25ArrayArray1[arg0][local22.anInt5513] == null && local22.anInt5508 < 0) {
				local22.anInt5508 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(II)V")
	private void method4636(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4664(local30, local18, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method4653(local18, local24, local30);
			} else {
				this.method4664(64, local18, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4649(local18, local24, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray340[local18] = (local30 << 14) + (this.anIntArray340[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray340[local18] = (local30 << 7) + (this.anIntArray340[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray346[local18] = (local30 << 7) + (this.anIntArray346[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray346[local18] = (this.anIntArray346[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray342[local18] = (local30 << 7) + (this.anIntArray342[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray342[local18] = (this.anIntArray342[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray332[local18] = (local30 << 7) + (this.anIntArray332[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray332[local18] = (this.anIntArray332[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray343[local18] = (this.anIntArray343[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray343[local18] = (this.anIntArray343[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray347[local18] = (local30 << 7) + (this.anIntArray347[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray347[local18] = (this.anIntArray347[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray335[local18] |= 0x1;
				} else {
					this.anIntArray335[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method4635(local18);
					this.anIntArray335[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray335[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray333[local18] = (local30 << 7) + (this.anIntArray333[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray333[local18] = local30 + (this.anIntArray333[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray333[local18] = (this.anIntArray333[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray333[local18] = (this.anIntArray333[local18] & 0x3F80) + (local30 + 16384);
			}
			if (local24 == 120) {
				this.method4656(local18);
			}
			if (local24 == 121) {
				this.method4647(local18);
			}
			if (local24 == 123) {
				this.method4663(local18);
			}
			@Pc(504) int local504;
			if (local24 == 6) {
				local504 = this.anIntArray333[local18];
				if (local504 == 16384) {
					this.anIntArray345[local18] = (local30 << 7) + (this.anIntArray345[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local504 = this.anIntArray333[local18];
				if (local504 == 16384) {
					this.anIntArray345[local18] = (this.anIntArray345[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray344[local18] = (this.anIntArray344[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray344[local18] = (this.anIntArray344[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method4662(local18);
					this.anIntArray335[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray335[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method4668(local18, (local30 << 7) + (this.anIntArray337[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method4668(local18, (this.anIntArray337[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4655(local24 + this.anIntArray340[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4642(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method4665(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4670(true);
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)I")
	public int method4637() {
		return this.anInt5431;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)V")
	private void method4638() {
		this.anIntArray339[9] = 128;
		this.anIntArray340[9] = 128;
		this.method4655(128, 9);
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
	private void method4639() {
		@Pc(8) int local8 = this.anInt5468;
		@Pc(17) int local17 = this.anInt5467;
		@Pc(20) long local20 = this.aLong231;
		if (this.aClass1_Sub49_2 != null && local17 == this.anInt5469) {
			this.method4645(this.aBoolean410, this.aClass1_Sub49_2, this.aBoolean409);
			this.method4639();
			return;
		}
		while (this.anInt5467 == local17) {
			while (this.aClass287_1.anIntArray525[local8] == local17) {
				this.aClass287_1.method6562(local8);
				@Pc(55) int local55 = this.aClass287_1.method6566(local8);
				if (local55 == 1) {
					this.aClass287_1.method6572();
					this.aClass287_1.method6569(local8);
					if (this.aClass287_1.method6563()) {
						if (this.aClass1_Sub49_2 != null) {
							this.method4659(this.aClass1_Sub49_2, this.aBoolean409);
							this.method4639();
							return;
						}
						if (!this.aBoolean409 || local17 == 0) {
							this.method4670(true);
							this.aClass287_1.method6574();
							return;
						}
						this.aClass287_1.method6568(local20);
					}
					break;
				}
				if ((local55 & 0x80) != 0) {
					this.method4636(local55);
				}
				this.aClass287_1.method6573(local8);
				this.aClass287_1.method6569(local8);
			}
			local8 = this.aClass287_1.method6561();
			local17 = this.aClass287_1.anIntArray525[local8];
			local20 = this.aClass287_1.method6570(local17);
		}
		this.anInt5467 = local17;
		this.aLong231 = local20;
		this.anInt5468 = local8;
		if (this.aClass1_Sub49_2 != null && this.anInt5469 < local17) {
			this.anInt5467 = this.anInt5469;
			this.anInt5468 = -1;
			this.aLong231 = this.aClass287_1.method6570(this.anInt5467);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)V")
	public synchronized void method4640() {
		for (@Pc(7) Class1_Sub19 local7 = (Class1_Sub19) this.aClass356_26.method7792(); local7 != null; local7 = (Class1_Sub19) this.aClass356_26.method7795()) {
			local7.method3593();
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!li;I)Z")
	public boolean method4641(@OriginalArg(0) Class1_Sub25 arg0) {
		if (arg0.aClass1_Sub8_Sub1_2 != null) {
			return false;
		}
		if (arg0.anInt5508 >= 0) {
			arg0.method7878();
			if (arg0.anInt5504 > 0 && arg0 == this.aClass1_Sub25ArrayArray2[arg0.anInt5500][arg0.anInt5504]) {
				this.aClass1_Sub25ArrayArray2[arg0.anInt5500][arg0.anInt5504] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "()I")
	@Override
	public synchronized int method6021() {
		return 0;
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(III)V")
	private void method4642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!li;B)I")
	private int method4643(@OriginalArg(0) Class1_Sub25 arg0) {
		@Pc(19) int local19 = arg0.anInt5507 + (arg0.anInt5502 * arg0.anInt5509 >> 12);
		local19 += (this.anIntArray336[arg0.anInt5500] - 8192) * this.anIntArray345[arg0.anInt5500] >> 12;
		@Pc(40) Class238 local40 = arg0.aClass238_1;
		@Pc(66) int local66;
		if (local40.anInt6711 > 0 && (local40.anInt6714 > 0 || this.anIntArray346[arg0.anInt5500] > 0)) {
			local66 = local40.anInt6714 << 2;
			@Pc(71) int local71 = local40.anInt6715 << 1;
			if (arg0.anInt5506 < local71) {
				local66 = local66 * arg0.anInt5506 / local71;
			}
			local66 += this.anIntArray346[arg0.anInt5500] >> 7;
			@Pc(101) double local101 = Math.sin((double) (arg0.anInt5498 & 0x1FF) * 0.01227184630308513D);
			local19 += (int) ((double) local66 * local101);
		}
		local66 = (int) ((double) (arg0.aClass1_Sub40_Sub1_2.anInt7667 * 256) * Math.pow(2.0D, (double) local19 * 3.255208333333333E-4D) / (double) Static426.anInt7216 + 0.5D);
		return local66 >= 1 ? local66 : 1;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BLclient!li;)I")
	private int method4644(@OriginalArg(1) Class1_Sub25 arg0) {
		if (this.anIntArray341[arg0.anInt5500] == 0) {
			return 0;
		}
		@Pc(14) Class238 local14 = arg0.aClass238_1;
		@Pc(30) int local30 = this.anIntArray332[arg0.anInt5500] * this.anIntArray347[arg0.anInt5500] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(52) int local52 = arg0.anInt5512 * local38 + 16384 >> 15;
		@Pc(61) int local61 = local52 * this.anInt5431 + 128 >> 8;
		local30 = this.anIntArray341[arg0.anInt5500] * local61 + 128 >> 8;
		if (local14.anInt6709 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) arg0.anInt5510 * 1.953125E-5D * (double) local14.anInt6709) + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local14.aByteArray73 != null) {
			local103 = arg0.anInt5511;
			local111 = local14.aByteArray73[arg0.anInt5499 + 1];
			if (arg0.anInt5499 < local14.aByteArray73.length - 2) {
				local133 = (local14.aByteArray73[arg0.anInt5499] & 0xFF) << 8;
				local145 = (local14.aByteArray73[arg0.anInt5499 + 2] & 0xFF) << 8;
				local111 += (local14.aByteArray73[arg0.anInt5499 + 3] - local111) * (-local133 + local103) / (local145 - local133);
			}
			local30 = local30 * local111 + 32 >> 6;
		}
		if (arg0.anInt5508 > 0 && local14.aByteArray72 != null) {
			local103 = arg0.anInt5508;
			local111 = local14.aByteArray72[arg0.anInt5503 + 1];
			if (arg0.anInt5503 < local14.aByteArray72.length - 2) {
				local133 = (local14.aByteArray72[arg0.anInt5503] & 0xFF) << 8;
				local145 = (local14.aByteArray72[arg0.anInt5503 + 2] & 0xFF) << 8;
				local111 += (local14.aByteArray72[arg0.anInt5503 + 3] - local111) * (local103 - local133) / (local145 - local133);
			}
			local30 = local30 * local111 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZLclient!ub;Z)V")
	private synchronized void method4645(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub49 arg1, @OriginalArg(3) boolean arg2) {
		this.method4652(arg0);
		this.aClass287_1.method6564(arg1.aByteArray96);
		this.aBoolean409 = arg2;
		this.aLong232 = 0L;
		@Pc(24) int local24 = this.aClass287_1.method6567();
		for (@Pc(33) int local33 = 0; local33 < local24; local33++) {
			this.aClass287_1.method6562(local33);
			this.aClass287_1.method6573(local33);
			this.aClass287_1.method6569(local33);
		}
		this.anInt5468 = this.aClass287_1.method6561();
		this.anInt5467 = this.aClass287_1.anIntArray525[this.anInt5468];
		this.aLong231 = this.aClass287_1.method6570(this.anInt5467);
	}

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "()Lclient!eg;")
	@Override
	public synchronized Class1_Sub8 method6026() {
		return this.aClass1_Sub8_Sub2_1;
	}

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)V")
	public synchronized void method4646() {
		for (@Pc(7) Class1_Sub19 local7 = (Class1_Sub19) this.aClass356_26.method7792(); local7 != null; local7 = (Class1_Sub19) this.aClass356_26.method7795()) {
			local7.method7878();
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IB)V")
	private void method4647(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4647(local12);
			}
			return;
		}
		this.anIntArray332[arg0] = 12800;
		this.anIntArray343[arg0] = 8192;
		this.anIntArray347[arg0] = 16383;
		this.anIntArray336[arg0] = 8192;
		this.anIntArray346[arg0] = 0;
		this.anIntArray342[arg0] = 8192;
		this.method4635(arg0);
		this.method4662(arg0);
		this.anIntArray335[arg0] = 0;
		this.anIntArray333[arg0] = 32767;
		this.anIntArray345[arg0] = 256;
		this.anIntArray344[arg0] = 0;
		this.method4668(arg0, 8192);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "([IIBILclient!li;)Z")
	public boolean method4648(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub25 arg3) {
		arg3.anInt5497 = Static426.anInt7216 / 100;
		if (arg3.anInt5508 >= 0 && (arg3.aClass1_Sub8_Sub1_2 == null || arg3.aClass1_Sub8_Sub1_2.method964())) {
			arg3.method4699();
			arg3.method7878();
			if (arg3.anInt5504 > 0 && arg3 == this.aClass1_Sub25ArrayArray2[arg3.anInt5500][arg3.anInt5504]) {
				this.aClass1_Sub25ArrayArray2[arg3.anInt5500][arg3.anInt5504] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg3.anInt5502;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray342[arg3.anInt5500] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg3.anInt5502 = local53;
		}
		arg3.aClass1_Sub8_Sub1_2.method937(this.method4643(arg3));
		@Pc(93) Class238 local93 = arg3.aClass238_1;
		@Pc(100) boolean local100 = false;
		arg3.anInt5506++;
		arg3.anInt5498 += local93.anInt6711;
		@Pc(131) double local131 = (double) ((arg3.anInt5509 * arg3.anInt5502 >> 12) + (arg3.anInt5513 - 60 << 8)) * 5.086263020833333E-6D;
		if (local93.anInt6709 > 0) {
			if (local93.anInt6713 <= 0) {
				arg3.anInt5510 += 128;
			} else {
				arg3.anInt5510 += (int) (Math.pow(2.0D, (double) local93.anInt6713 * local131) * 128.0D + 0.5D);
			}
			if (arg3.anInt5510 * local93.anInt6709 >= 819200) {
				local100 = true;
			}
		}
		if (local93.aByteArray73 != null) {
			if (local93.anInt6712 <= 0) {
				arg3.anInt5511 += 128;
			} else {
				arg3.anInt5511 += (int) (Math.pow(2.0D, local131 * (double) local93.anInt6712) * 128.0D + 0.5D);
			}
			while (arg3.anInt5499 < local93.aByteArray73.length - 2 && arg3.anInt5511 > (local93.aByteArray73[arg3.anInt5499 + 2] & 0xFF) << 8) {
				arg3.anInt5499 += 2;
			}
			if (arg3.anInt5499 == local93.aByteArray73.length - 2 && local93.aByteArray73[arg3.anInt5499 + 1] == 0) {
				local100 = true;
			}
		}
		if (arg3.anInt5508 >= 0 && local93.aByteArray72 != null && (this.anIntArray335[arg3.anInt5500] & 0x1) == 0 && (arg3.anInt5504 < 0 || arg3 != this.aClass1_Sub25ArrayArray2[arg3.anInt5500][arg3.anInt5504])) {
			if (local93.anInt6708 > 0) {
				arg3.anInt5508 += (int) (Math.pow(2.0D, (double) local93.anInt6708 * local131) * 128.0D + 0.5D);
			} else {
				arg3.anInt5508 += 128;
			}
			while (local93.aByteArray72.length - 2 > arg3.anInt5503 && arg3.anInt5508 > (local93.aByteArray72[arg3.anInt5503 + 2] & 0xFF) << 8) {
				arg3.anInt5503 += 2;
			}
			if (arg3.anInt5503 == local93.aByteArray72.length - 2) {
				local100 = true;
			}
		}
		if (!local100) {
			arg3.aClass1_Sub8_Sub1_2.method958(arg3.anInt5497, this.method4644(arg3), this.method4657(arg3));
			return false;
		}
		arg3.aClass1_Sub8_Sub1_2.method932(arg3.anInt5497);
		if (arg0 == null) {
			arg3.aClass1_Sub8_Sub1_2.method6024(arg2);
		} else {
			arg3.aClass1_Sub8_Sub1_2.method6022(arg0, arg1, arg2);
		}
		if (arg3.aClass1_Sub8_Sub1_2.method944()) {
			this.aClass1_Sub8_Sub2_1.aClass1_Sub8_Sub4_1.method6029(arg3.aClass1_Sub8_Sub1_2);
		}
		arg3.method4699();
		if (arg3.anInt5508 >= 0) {
			arg3.method7878();
			if (arg3.anInt5504 > 0 && this.aClass1_Sub25ArrayArray2[arg3.anInt5500][arg3.anInt5504] == arg3) {
				this.aClass1_Sub25ArrayArray2[arg3.anInt5500][arg3.anInt5504] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIII)V")
	private void method4649(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(JI)V")
	private void method4650(@OriginalArg(0) long arg0) {
		while (this.aLong231 <= arg0) {
			@Pc(14) int local14 = this.anInt5468;
			@Pc(17) int local17 = this.anInt5467;
			@Pc(20) long local20 = this.aLong231;
			while (this.anInt5467 == local17) {
				while (this.aClass287_1.anIntArray525[local14] == local17) {
					this.aClass287_1.method6562(local14);
					@Pc(31) int local31 = this.aClass287_1.method6566(local14);
					if (local31 == 1) {
						this.aClass287_1.method6572();
						this.aClass287_1.method6569(local14);
						if (this.aClass287_1.method6563()) {
							if (!this.aBoolean409 || local17 == 0) {
								this.method4670(true);
								this.aClass287_1.method6574();
								return;
							}
							this.aClass287_1.method6568(local20);
						}
						break;
					}
					if ((local31 & 0x80) != 0 && (local31 & 0xF0) != 144) {
						this.method4636(local31);
					}
					this.aClass287_1.method6573(local14);
					this.aClass287_1.method6569(local14);
				}
				this.aLong232 = local20;
				local14 = this.aClass287_1.method6561();
				local17 = this.aClass287_1.anIntArray525[local14];
				local20 = this.aClass287_1.method6570(local17);
			}
			this.aLong231 = local20;
			this.anInt5467 = local17;
			this.anInt5468 = local14;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(II)V")
	public synchronized void method4651(@OriginalArg(1) int arg0) {
		this.anInt5431 = arg0;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZI)V")
	private synchronized void method4652(@OriginalArg(0) boolean arg0) {
		this.aClass287_1.method6574();
		this.aClass1_Sub49_2 = null;
		this.method4670(arg0);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BIII)V")
	private void method4653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4664(64, arg0, arg1);
		if ((this.anIntArray335[arg0] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub25 local25 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7848(); local25 != null; local25 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7859()) {
				if (arg0 == local25.anInt5500 && local25.anInt5508 < 0) {
					this.aClass1_Sub25ArrayArray1[arg0][local25.anInt5513] = null;
					this.aClass1_Sub25ArrayArray1[arg0][arg1] = local25;
					@Pc(63) int local63 = (local25.anInt5502 * local25.anInt5509 >> 12) + local25.anInt5507;
					local25.anInt5507 += arg1 - local25.anInt5513 << 8;
					local25.anInt5509 = local63 - local25.anInt5507;
					local25.anInt5513 = arg1;
					local25.anInt5502 = 4096;
					return;
				}
			}
		}
		@Pc(109) Class1_Sub19 local109 = (Class1_Sub19) this.aClass356_26.method7796((long) this.anIntArray338[arg0]);
		if (local109 == null) {
			return;
		}
		@Pc(117) Class1_Sub40_Sub1 local117 = local109.aClass1_Sub40_Sub1Array1[arg1];
		if (local117 == null) {
			return;
		}
		@Pc(124) Class1_Sub25 local124 = new Class1_Sub25();
		local124.aClass1_Sub40_Sub1_2 = local117;
		local124.anInt5500 = arg0;
		local124.aClass1_Sub19_1 = local109;
		local124.aClass238_1 = local109.aClass238Array1[arg1];
		local124.anInt5504 = local109.aByteArray43[arg1];
		local124.anInt5513 = arg1;
		local124.anInt5512 = local109.aByteArray41[arg1] * local109.anInt4200 * arg2 * arg2 + 1024 >> 11;
		local124.anInt5514 = local109.aByteArray42[arg1] & 0xFF;
		local124.anInt5507 = (arg1 << 8) - (local109.aShortArray59[arg1] & 0x7FFF);
		local124.anInt5511 = 0;
		local124.anInt5508 = -1;
		local124.anInt5503 = 0;
		local124.anInt5510 = 0;
		local124.anInt5499 = 0;
		if (this.anIntArray344[arg0] == 0) {
			local124.aClass1_Sub8_Sub1_2 = Static597.method959(local117, this.method4643(local124), this.method4644(local124), this.method4657(local124));
		} else {
			local124.aClass1_Sub8_Sub1_2 = Static597.method959(local117, this.method4643(local124), 0, this.method4657(local124));
			this.method4669(local124, local109.aShortArray59[arg1] < 0);
		}
		if (local109.aShortArray59[arg1] < 0) {
			local124.aClass1_Sub8_Sub1_2.method956(-1);
		}
		if (local124.anInt5504 >= 0) {
			@Pc(276) Class1_Sub25 local276 = this.aClass1_Sub25ArrayArray2[arg0][local124.anInt5504];
			if (local276 != null && local276.anInt5508 < 0) {
				this.aClass1_Sub25ArrayArray1[arg0][local276.anInt5513] = null;
				local276.anInt5508 = 0;
			}
			this.aClass1_Sub25ArrayArray2[arg0][local124.anInt5504] = local124;
		}
		this.aClass1_Sub8_Sub2_1.aClass361_35.method7855(local124);
		this.aClass1_Sub25ArrayArray1[arg0][arg1] = local124;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!pb;ILclient!ub;ILclient!ga;)Z")
	public synchronized boolean method4654(@OriginalArg(0) Class249 arg0, @OriginalArg(2) Class1_Sub49 arg1, @OriginalArg(4) Class111 arg2) {
		arg1.method7135();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class1_Sub29 local29 = (Class1_Sub29) arg1.aClass356_39.method7792(); local29 != null; local29 = (Class1_Sub29) arg1.aClass356_39.method7795()) {
			@Pc(35) int local35 = (int) local29.aLong425;
			@Pc(43) Class1_Sub19 local43 = (Class1_Sub19) this.aClass356_26.method7796((long) local35);
			if (local43 == null) {
				local43 = Static459.method6514(arg2, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass356_26.method7800((long) local35, local43);
			}
			if (!local43.method3591(arg0, local29.aByteArray64, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method7136();
		}
		return local9;
	}

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(III)V")
	private void method4655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray338[arg1] != arg0) {
			this.anIntArray338[arg1] = arg0;
			for (@Pc(30) int local30 = 0; local30 < 128; local30++) {
				this.aClass1_Sub25ArrayArray2[arg1][local30] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6024(@OriginalArg(0) int arg0) {
		if (this.aClass287_1.method6560()) {
			@Pc(18) int local18 = this.anInt5458 * this.aClass287_1.anInt7887 / Static426.anInt7216;
			do {
				@Pc(27) long local27 = this.aLong232 + (long) local18 * (long) arg0;
				if (this.aLong231 - local27 >= 0L) {
					this.aLong232 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong231 - this.aLong232 - 1L) / (long) local18);
				this.aLong232 += (long) local18 * (long) local56;
				arg0 -= local56;
				this.aClass1_Sub8_Sub2_1.method6024(local56);
				this.method4639();
			} while (this.aClass287_1.method6560());
		}
		this.aClass1_Sub8_Sub2_1.method6024(arg0);
	}

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "(II)V")
	private void method4656(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub25 local12 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7854(); local12 != null; local12 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7853()) {
			if (arg0 < 0 || arg0 == local12.anInt5500) {
				if (local12.aClass1_Sub8_Sub1_2 != null) {
					local12.aClass1_Sub8_Sub1_2.method932(Static426.anInt7216 / 100);
					if (local12.aClass1_Sub8_Sub1_2.method944()) {
						this.aClass1_Sub8_Sub2_1.aClass1_Sub8_Sub4_1.method6029(local12.aClass1_Sub8_Sub1_2);
					}
					local12.method4699();
				}
				if (local12.anInt5508 < 0) {
					this.aClass1_Sub25ArrayArray1[local12.anInt5500][local12.anInt5513] = null;
				}
				local12.method7878();
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "()Lclient!eg;")
	@Override
	public synchronized Class1_Sub8 method6023() {
		return null;
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(Lclient!li;I)I")
	private int method4657(@OriginalArg(0) Class1_Sub25 arg0) {
		@Pc(9) int local9 = this.anIntArray343[arg0.anInt5500];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt5514) * (16384 - local9) + 32 >> 6) : local9 * arg0.anInt5514 + 32 >> 6;
	}

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "(I)Z")
	public synchronized boolean method4658() {
		return this.aClass287_1.method6560();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!ub;IZ)V")
	public synchronized void method4659(@OriginalArg(0) Class1_Sub49 arg0, @OriginalArg(2) boolean arg1) {
		this.method4645(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "(III)V")
	private synchronized void method4660() {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			this.anIntArray341[local12] = 256;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "(III)V")
	public synchronized void method4661() {
		this.method4638();
	}

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "(II)V")
	private void method4662(@OriginalArg(0) int arg0) {
		if ((this.anIntArray335[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub25 local15 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7854(); local15 != null; local15 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7853()) {
			if (local15.anInt5500 == arg0) {
				local15.anInt5501 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "(II)V")
	private void method4663(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub25 local8 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7854(); local8 != null; local8 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7853()) {
			if ((arg0 < 0 || local8.anInt5500 == arg0) && local8.anInt5508 < 0) {
				this.aClass1_Sub25ArrayArray1[local8.anInt5500][local8.anInt5513] = null;
				local8.anInt5508 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(BIII)V")
	private void method4664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub25 local12 = this.aClass1_Sub25ArrayArray1[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub25ArrayArray1[arg1][arg2] = null;
		if ((this.anIntArray335[arg1] & 0x2) == 0) {
			local12.anInt5508 = 0;
			return;
		}
		for (@Pc(41) Class1_Sub25 local41 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7854(); local41 != null; local41 = (Class1_Sub25) this.aClass1_Sub8_Sub2_1.aClass361_35.method7853()) {
			if (local12.anInt5500 == local41.anInt5500 && local41.anInt5508 < 0 && local12 != local41) {
				local12.anInt5508 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "(III)V")
	private void method4665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray336[arg1] = arg0;
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(B)V")
	public synchronized void method4666() {
		this.method4652(true);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZJZLclient!ub;Z)V")
	public synchronized void method4667(@OriginalArg(1) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class1_Sub49 arg2) {
		this.method4645(true, arg2, arg1);
		this.method4650((long) this.aClass287_1.anInt7887 * arg0);
	}

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "(III)V")
	private void method4668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray337[arg0] = arg1;
		this.anIntArray334[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!li;ZI)V")
	public void method4669(@OriginalArg(0) Class1_Sub25 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass1_Sub40_Sub1_2.aByteArray79.length;
		@Pc(40) int local40;
		if (arg1 && arg0.aClass1_Sub40_Sub1_2.aBoolean560) {
			@Pc(23) int local23 = local8 + local8 - arg0.aClass1_Sub40_Sub1_2.anInt7666;
			local8 <<= 0x8;
			local40 = (int) ((long) local23 * (long) this.anIntArray344[arg0.anInt5500] >> 6);
			if (local40 >= local8) {
				arg0.aClass1_Sub8_Sub1_2.method945();
				local40 = local8 + local8 - local40 - 1;
			}
		} else {
			local40 = (int) ((long) this.anIntArray344[arg0.anInt5500] * (long) local8 >> 6);
		}
		arg0.aClass1_Sub8_Sub1_2.method952(local40);
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(ZI)V")
	private void method4670(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4656(-1);
		} else {
			this.method4663(-1);
		}
		this.method4647(-1);
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray338[local27] = this.anIntArray339[local27];
		}
		for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
			this.anIntArray340[local43] = this.anIntArray339[local43] & 0xFFFFFF80;
		}
	}
}
