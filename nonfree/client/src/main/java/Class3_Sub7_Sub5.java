import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class3_Sub7_Sub5 extends Class3_Sub7 {

	@OriginalMember(owner = "client!nl", name = "Gb", descriptor = "I")
	private int anInt7238;

	@OriginalMember(owner = "client!nl", name = "Hb", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!nl", name = "Ib", descriptor = "Z")
	private boolean aBoolean627;

	@OriginalMember(owner = "client!nl", name = "Jb", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!nl", name = "Kb", descriptor = "I")
	private int anInt7239;

	@OriginalMember(owner = "client!nl", name = "Lb", descriptor = "Z")
	private boolean aBoolean628;

	@OriginalMember(owner = "client!nl", name = "Mb", descriptor = "Lclient!paa;")
	private Class3_Sub33 aClass3_Sub33_1;

	@OriginalMember(owner = "client!nl", name = "Nb", descriptor = "I")
	private int anInt7240;

	@OriginalMember(owner = "client!nl", name = "B", descriptor = "[I")
	private final int[] anIntArray421 = new int[16];

	@OriginalMember(owner = "client!nl", name = "E", descriptor = "[I")
	private final int[] anIntArray422 = new int[16];

	@OriginalMember(owner = "client!nl", name = "R", descriptor = "[I")
	public final int[] anIntArray425 = new int[16];

	@OriginalMember(owner = "client!nl", name = "G", descriptor = "[[Lclient!dg;")
	private final Class3_Sub16[][] aClass3_Sub16ArrayArray1 = new Class3_Sub16[16][128];

	@OriginalMember(owner = "client!nl", name = "W", descriptor = "[I")
	private final int[] anIntArray428 = new int[16];

	@OriginalMember(owner = "client!nl", name = "V", descriptor = "[I")
	private final int[] anIntArray427 = new int[16];

	@OriginalMember(owner = "client!nl", name = "X", descriptor = "[I")
	public final int[] anIntArray429 = new int[16];

	@OriginalMember(owner = "client!nl", name = "cb", descriptor = "[I")
	private final int[] anIntArray431 = new int[16];

	@OriginalMember(owner = "client!nl", name = "jb", descriptor = "[I")
	private final int[] anIntArray432 = new int[16];

	@OriginalMember(owner = "client!nl", name = "Y", descriptor = "[I")
	private final int[] anIntArray430 = new int[16];

	@OriginalMember(owner = "client!nl", name = "ob", descriptor = "[I")
	private final int[] anIntArray433 = new int[16];

	@OriginalMember(owner = "client!nl", name = "U", descriptor = "[I")
	private final int[] anIntArray426 = new int[16];

	@OriginalMember(owner = "client!nl", name = "M", descriptor = "[I")
	private final int[] anIntArray424 = new int[16];

	@OriginalMember(owner = "client!nl", name = "t", descriptor = "[I")
	private final int[] anIntArray420 = new int[16];

	@OriginalMember(owner = "client!nl", name = "tb", descriptor = "[I")
	private final int[] anIntArray434 = new int[16];

	@OriginalMember(owner = "client!nl", name = "hb", descriptor = "I")
	private final int anInt7223 = 1000000;

	@OriginalMember(owner = "client!nl", name = "J", descriptor = "[I")
	public final int[] anIntArray423 = new int[16];

	@OriginalMember(owner = "client!nl", name = "yb", descriptor = "[I")
	private final int[] anIntArray435 = new int[16];

	@OriginalMember(owner = "client!nl", name = "vb", descriptor = "[[Lclient!dg;")
	private final Class3_Sub16[][] aClass3_Sub16ArrayArray2 = new Class3_Sub16[16][128];

	@OriginalMember(owner = "client!nl", name = "Db", descriptor = "I")
	private int anInt7237 = 256;

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "Lclient!hha;")
	private final Class131 aClass131_1 = new Class131();

	@OriginalMember(owner = "client!nl", name = "Fb", descriptor = "Lclient!iha;")
	private final Class3_Sub7_Sub4 aClass3_Sub7_Sub4_1 = new Class3_Sub7_Sub4(this);

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "Lclient!sga;")
	private final Class307 aClass307_35;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class3_Sub7_Sub5() {
		this.aClass307_35 = new Class307(128);
		this.method6021(-1, 256);
		this.method6011(true);
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!nl;)V")
	public Class3_Sub7_Sub5(@OriginalArg(0) Class3_Sub7_Sub5 arg0) {
		this.aClass307_35 = arg0.aClass307_35;
		this.method6021(-1, 256);
		this.method6011(true);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "()I")
	@Override
	public synchronized int method6000() {
		return 0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	private void method6007() {
		@Pc(14) int local14 = this.anInt7238;
		@Pc(17) int local17 = this.anInt7239;
		@Pc(20) long local20 = this.aLong170;
		if (this.aClass3_Sub33_1 != null && local17 == this.anInt7240) {
			this.method6022(this.aBoolean628, this.aClass3_Sub33_1, this.aBoolean627);
			this.method6007();
			return;
		}
		while (local17 == this.anInt7239) {
			while (this.aClass131_1.anIntArray277[local14] == local17) {
				this.aClass131_1.method4096(local14);
				@Pc(53) int local53 = this.aClass131_1.method4085(local14);
				if (local53 == 1) {
					this.aClass131_1.method4097();
					this.aClass131_1.method4095(local14);
					if (this.aClass131_1.method4089()) {
						if (this.aClass3_Sub33_1 != null) {
							this.method6031(this.aClass3_Sub33_1, this.aBoolean627);
							this.method6007();
							return;
						}
						if (!this.aBoolean627 || local17 == 0) {
							this.method6011(true);
							this.aClass131_1.method4090();
							return;
						}
						this.aClass131_1.method4092(local20);
					}
					break;
				}
				if ((local53 & 0x80) != 0) {
					this.method6040(local53);
				}
				this.aClass131_1.method4087(local14);
				this.aClass131_1.method4095(local14);
			}
			local14 = this.aClass131_1.method4086();
			local17 = this.aClass131_1.anIntArray277[local14];
			local20 = this.aClass131_1.method4099(local17);
		}
		this.anInt7239 = local17;
		this.aLong170 = local20;
		this.anInt7238 = local14;
		if (this.aClass3_Sub33_1 != null && this.anInt7240 < local17) {
			this.anInt7239 = this.anInt7240;
			this.anInt7238 = -1;
			this.aLong170 = this.aClass131_1.method4099(this.anInt7239);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6002(@OriginalArg(0) int arg0) {
		if (this.aClass131_1.method4091()) {
			@Pc(14) int local14 = this.anInt7223 * this.aClass131_1.anInt4818 / Static590.anInt9843;
			do {
				@Pc(23) long local23 = this.aLong171 + (long) arg0 * (long) local14;
				if (this.aLong170 - local23 >= 0L) {
					this.aLong171 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong170 + (long) local14 - this.aLong171 - 1L) / (long) local14);
				this.aLong171 += (long) local14 * (long) local53;
				arg0 -= local53;
				this.aClass3_Sub7_Sub4_1.method6002(local53);
				this.method6007();
			} while (this.aClass131_1.method4091());
		}
		this.aClass3_Sub7_Sub4_1.method6002(arg0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
	private void method6008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray435[arg1] = arg0;
		this.anIntArray429[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(JI)V")
	private void method6009(@OriginalArg(0) long arg0) {
		while (this.aLong170 <= arg0) {
			@Pc(16) int local16 = this.anInt7238;
			@Pc(19) int local19 = this.anInt7239;
			@Pc(22) long local22 = this.aLong170;
			while (local19 == this.anInt7239) {
				while (this.aClass131_1.anIntArray277[local16] == local19) {
					this.aClass131_1.method4096(local16);
					@Pc(33) int local33 = this.aClass131_1.method4085(local16);
					if (local33 == 1) {
						this.aClass131_1.method4097();
						this.aClass131_1.method4095(local16);
						if (this.aClass131_1.method4089()) {
							if (!this.aBoolean627 || local19 == 0) {
								this.method6011(true);
								this.aClass131_1.method4090();
								return;
							}
							this.aClass131_1.method4092(local22);
						}
						break;
					}
					if ((local33 & 0x80) != 0 && (local33 & 0xF0) != 144) {
						this.method6040(local33);
					}
					this.aClass131_1.method4087(local16);
					this.aClass131_1.method4095(local16);
				}
				this.aLong171 = local22;
				local16 = this.aClass131_1.method4086();
				local19 = this.aClass131_1.anIntArray277[local16];
				local22 = this.aClass131_1.method4099(local19);
			}
			this.anInt7238 = local16;
			this.anInt7239 = local19;
			this.aLong170 = local22;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!dg;)Z")
	public boolean method6010(@OriginalArg(1) Class3_Sub16 arg0) {
		if (arg0.aClass3_Sub7_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt2483 >= 0) {
			arg0.method8671();
			if (arg0.anInt2478 > 0 && arg0 == this.aClass3_Sub16ArrayArray2[arg0.anInt2491][arg0.anInt2478]) {
				this.aClass3_Sub16ArrayArray2[arg0.anInt2491][arg0.anInt2478] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "()Lclient!rn;")
	@Override
	public synchronized Class3_Sub7 method6005() {
		return this.aClass3_Sub7_Sub4_1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V")
	private void method6011(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6025(-1);
		} else {
			this.method6013(-1);
		}
		this.method6024(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray430[local23] = this.anIntArray420[local23];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray431[local39] = this.anIntArray420[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V")
	public synchronized void method6012() {
		this.method6016();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V")
	private void method6013(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class3_Sub16 local8 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6907(); local8 != null; local8 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6912()) {
			if ((arg0 < 0 || local8.anInt2491 == arg0) && local8.anInt2483 < 0) {
				this.aClass3_Sub16ArrayArray1[local8.anInt2491][local8.anInt2496] = null;
				local8.anInt2483 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(ZI)V")
	private void method6014(@OriginalArg(1) int arg0) {
		if ((this.anIntArray423[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class3_Sub16 local18 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6907(); local18 != null; local18 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6912()) {
			if (arg0 == local18.anInt2491 && this.aClass3_Sub16ArrayArray1[arg0][local18.anInt2496] == null && local18.anInt2483 < 0) {
				local18.anInt2483 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)V")
	private void method6015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)V")
	private void method6016() {
		this.anIntArray420[9] = 128;
		this.anIntArray431[9] = 128;
		this.method6044(128, 9);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V")
	private void method6017(@OriginalArg(0) int arg0) {
		if ((this.anIntArray423[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(23) Class3_Sub16 local23 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6907(); local23 != null; local23 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6912()) {
			if (local23.anInt2491 == arg0) {
				local23.anInt2499 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass131_1.method4091()) {
			@Pc(14) int local14 = this.anInt7223 * this.aClass131_1.anInt4818 / Static590.anInt9843;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong171;
				if (this.aLong170 - local23 >= 0L) {
					this.aLong171 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong170 - this.aLong171 - 1L) / (long) local14);
				this.aLong171 += (long) local14 * (long) local52;
				this.aClass3_Sub7_Sub4_1.method6004(arg0, arg1, local52);
				arg1 += local52;
				this.method6007();
				arg2 -= local52;
			} while (this.aClass131_1.method4091());
		}
		this.aClass3_Sub7_Sub4_1.method6004(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZZ)V")
	private synchronized void method6018(@OriginalArg(1) boolean arg0) {
		this.aClass131_1.method4090();
		this.aClass3_Sub33_1 = null;
		this.method6011(arg0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!dg;B)I")
	private int method6020(@OriginalArg(0) Class3_Sub16 arg0) {
		if (this.anIntArray421[arg0.anInt2491] == 0) {
			return 0;
		}
		@Pc(17) Class242 local17 = arg0.aClass242_1;
		@Pc(33) int local33 = this.anIntArray428[arg0.anInt2491] * this.anIntArray427[arg0.anInt2491] + 4096 >> 13;
		@Pc(47) int local47 = local33 * local33 + 16384 >> 15;
		@Pc(56) int local56 = local47 * arg0.anInt2486 + 16384 >> 15;
		@Pc(65) int local65 = local56 * this.anInt7237 + 128 >> 8;
		local33 = local65 * this.anIntArray421[arg0.anInt2491] + 128 >> 8;
		if (local17.anInt7555 > 0) {
			local33 = (int) ((double) local33 * Math.pow(0.5D, (double) arg0.anInt2492 * 1.953125E-5D * (double) local17.anInt7555) + 0.5D);
		}
		@Pc(107) int local107;
		@Pc(115) int local115;
		@Pc(137) int local137;
		@Pc(149) int local149;
		if (local17.aByteArray78 != null) {
			local107 = arg0.anInt2494;
			local115 = local17.aByteArray78[arg0.anInt2497 + 1];
			if (local17.aByteArray78.length - 2 > arg0.anInt2497) {
				local137 = (local17.aByteArray78[arg0.anInt2497] & 0xFF) << 8;
				local149 = (local17.aByteArray78[arg0.anInt2497 + 2] & 0xFF) << 8;
				local115 += (local17.aByteArray78[arg0.anInt2497 + 3] - local115) * (local107 + -local137) / (local149 - local137);
			}
			local33 = local115 * local33 + 32 >> 6;
		}
		if (arg0.anInt2483 > 0 && local17.aByteArray79 != null) {
			local107 = arg0.anInt2483;
			local115 = local17.aByteArray79[arg0.anInt2479 + 1];
			if (local17.aByteArray79.length - 2 > arg0.anInt2479) {
				local137 = (local17.aByteArray79[arg0.anInt2479] & 0xFF) << 8;
				local149 = (local17.aByteArray79[arg0.anInt2479 + 2] & 0xFF) << 8;
				local115 += (local107 - local137) * (-local115 + local17.aByteArray79[arg0.anInt2479 - -3]) / (local149 - local137);
			}
			local33 = local115 * local33 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBI)V")
	public synchronized void method6021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.anIntArray421[local12] = arg1;
			}
		} else {
			this.anIntArray421[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZILclient!paa;Z)V")
	private synchronized void method6022(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub33 arg1, @OriginalArg(3) boolean arg2) {
		this.method6018(arg0);
		this.aClass131_1.method4094(arg1.aByteArray81);
		this.aBoolean627 = arg2;
		this.aLong171 = 0L;
		@Pc(24) int local24 = this.aClass131_1.method4088();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass131_1.method4096(local26);
			this.aClass131_1.method4087(local26);
			this.aClass131_1.method4095(local26);
		}
		this.anInt7238 = this.aClass131_1.method4086();
		this.anInt7239 = this.aClass131_1.anIntArray277[this.anInt7238];
		this.aLong170 = this.aClass131_1.method4099(this.anInt7239);
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
	public synchronized void method6023() {
		this.method6018(true);
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V")
	private void method6024(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method6024(local12);
			}
			return;
		}
		this.anIntArray428[arg0] = 12800;
		this.anIntArray426[arg0] = 8192;
		this.anIntArray427[arg0] = 16383;
		this.anIntArray424[arg0] = 8192;
		this.anIntArray422[arg0] = 0;
		this.anIntArray432[arg0] = 8192;
		this.method6014(arg0);
		this.method6017(arg0);
		this.anIntArray423[arg0] = 0;
		this.anIntArray434[arg0] = 32767;
		this.anIntArray433[arg0] = 256;
		this.anIntArray425[arg0] = 0;
		this.method6008(8192, arg0);
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "()Lclient!rn;")
	@Override
	public synchronized Class3_Sub7 method6006() {
		return null;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V")
	private void method6025(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class3_Sub16 local6 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6907(); local6 != null; local6 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6912()) {
			if (arg0 < 0 || arg0 == local6.anInt2491) {
				if (local6.aClass3_Sub7_Sub1_1 != null) {
					local6.aClass3_Sub7_Sub1_1.method677(Static590.anInt9843 / 100);
					if (local6.aClass3_Sub7_Sub1_1.method673()) {
						this.aClass3_Sub7_Sub4_1.aClass3_Sub7_Sub3_1.method2209(local6.aClass3_Sub7_Sub1_1);
					}
					local6.method2445();
				}
				if (local6.anInt2483 < 0) {
					this.aClass3_Sub16ArrayArray1[local6.anInt2491][local6.anInt2496] = null;
				}
				local6.method8671();
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)Z")
	public synchronized boolean method6026() {
		return this.aClass131_1.method4091();
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(Lclient!dg;B)I")
	private int method6027(@OriginalArg(0) Class3_Sub16 arg0) {
		@Pc(15) int local15 = arg0.anInt2487 + (arg0.anInt2495 * arg0.anInt2485 >> 12);
		local15 += this.anIntArray433[arg0.anInt2491] * (this.anIntArray424[arg0.anInt2491] - 8192) >> 12;
		@Pc(44) Class242 local44 = arg0.aClass242_1;
		@Pc(67) int local67;
		if (local44.anInt7548 > 0 && (local44.anInt7554 > 0 || this.anIntArray422[arg0.anInt2491] > 0)) {
			local67 = local44.anInt7554 << 2;
			@Pc(72) int local72 = local44.anInt7549 << 1;
			if (local72 > arg0.anInt2493) {
				local67 = local67 * arg0.anInt2493 / local72;
			}
			local67 += this.anIntArray422[arg0.anInt2491] >> 7;
			@Pc(106) double local106 = Math.sin((double) (arg0.anInt2481 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local106 * (double) local67);
		}
		local67 = (int) ((double) (arg0.aClass3_Sub12_Sub1_1.anInt6625 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static590.anInt9843 + 0.5D);
		return local67 < 1 ? 1 : local67;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIB)V")
	private void method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class3_Sub16 local12 = this.aClass3_Sub16ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub16ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray423[arg0] & 0x2) == 0) {
			local12.anInt2483 = 0;
			return;
		}
		for (@Pc(39) Class3_Sub16 local39 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6907(); local39 != null; local39 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6912()) {
			if (local12.anInt2491 == local39.anInt2491 && local39.anInt2483 < 0 && local12 != local39) {
				local12.anInt2483 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V")
	private void method6029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method6028(arg2, arg0, 64);
		if ((this.anIntArray423[arg2] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub16 local25 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6915(); local25 != null; local25 = (Class3_Sub16) this.aClass3_Sub7_Sub4_1.aClass276_34.method6916()) {
				if (arg2 == local25.anInt2491 && local25.anInt2483 < 0) {
					this.aClass3_Sub16ArrayArray1[arg2][local25.anInt2496] = null;
					this.aClass3_Sub16ArrayArray1[arg2][arg0] = local25;
					@Pc(64) int local64 = (local25.anInt2495 * local25.anInt2485 >> 12) + local25.anInt2487;
					local25.anInt2487 += arg0 - local25.anInt2496 << 8;
					local25.anInt2496 = arg0;
					local25.anInt2485 = local64 - local25.anInt2487;
					local25.anInt2495 = 4096;
					return;
				}
			}
		}
		@Pc(110) Class3_Sub6 local110 = (Class3_Sub6) this.aClass307_35.method7424((long) this.anIntArray430[arg2]);
		if (local110 == null) {
			return;
		}
		@Pc(118) Class3_Sub12_Sub1 local118 = local110.aClass3_Sub12_Sub1Array1[arg0];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class3_Sub16 local125 = new Class3_Sub16();
		local125.aClass3_Sub6_1 = local110;
		local125.aClass3_Sub12_Sub1_1 = local118;
		local125.anInt2491 = arg2;
		local125.aClass242_1 = local110.aClass242Array1[arg0];
		local125.anInt2478 = local110.aByteArray6[arg0];
		local125.anInt2496 = arg0;
		local125.anInt2486 = local110.aByteArray5[arg0] * local110.anInt630 * arg1 * arg1 + 1024 >> 11;
		local125.anInt2490 = local110.aByteArray4[arg0] & 0xFF;
		local125.anInt2487 = (arg0 << 8) - (local110.aShortArray7[arg0] & 0x7FFF);
		local125.anInt2494 = 0;
		local125.anInt2492 = 0;
		local125.anInt2497 = 0;
		local125.anInt2479 = 0;
		local125.anInt2483 = -1;
		if (this.anIntArray425[arg2] == 0) {
			local125.aClass3_Sub7_Sub1_1 = Static650.method680(local118, this.method6027(local125), this.method6020(local125), this.method6041(local125));
		} else {
			local125.aClass3_Sub7_Sub1_1 = Static650.method680(local118, this.method6027(local125), 0, this.method6041(local125));
			this.method6034(local125, local110.aShortArray7[arg0] < 0);
		}
		if (local110.aShortArray7[arg0] < 0) {
			local125.aClass3_Sub7_Sub1_1.method650(-1);
		}
		if (local125.anInt2478 >= 0) {
			@Pc(281) Class3_Sub16 local281 = this.aClass3_Sub16ArrayArray2[arg2][local125.anInt2478];
			if (local281 != null && local281.anInt2483 < 0) {
				this.aClass3_Sub16ArrayArray1[arg2][local281.anInt2496] = null;
				local281.anInt2483 = 0;
			}
			this.aClass3_Sub16ArrayArray2[arg2][local125.anInt2478] = local125;
		}
		this.aClass3_Sub7_Sub4_1.aClass276_34.method6906(local125);
		this.aClass3_Sub16ArrayArray1[arg2][arg0] = local125;
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(III)V")
	private void method6030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray424[arg1] = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!paa;ZB)V")
	public synchronized void method6031(@OriginalArg(0) Class3_Sub33 arg0, @OriginalArg(1) boolean arg1) {
		this.method6022(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLclient!paa;ZJI)V")
	public synchronized void method6032(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub33 arg1, @OriginalArg(3) long arg2) {
		this.method6022(true, arg1, arg0);
		this.method6009(arg2 * (long) this.aClass131_1.anInt4818);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)I")
	public int method6033() {
		return this.anInt7237;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!dg;ZB)V")
	public void method6034(@OriginalArg(0) Class3_Sub16 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass3_Sub12_Sub1_1.aByteArray70.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass3_Sub12_Sub1_1.aBoolean564) {
			@Pc(37) int local37 = local8 + local8 - arg0.aClass3_Sub12_Sub1_1.anInt6623;
			local8 <<= 0x8;
			local27 = (int) ((long) this.anIntArray425[arg0.anInt2491] * (long) local37 >> 6);
			if (local27 >= local8) {
				arg0.aClass3_Sub7_Sub1_1.method647();
				local27 = local8 + local8 - local27 - 1;
			}
		} else {
			local27 = (int) ((long) this.anIntArray425[arg0.anInt2491] * (long) local8 >> 6);
		}
		arg0.aClass3_Sub7_Sub1_1.method672(local27);
	}

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "(B)V")
	public synchronized void method6036() {
		for (@Pc(7) Class3_Sub6 local7 = (Class3_Sub6) this.aClass307_35.method7421(); local7 != null; local7 = (Class3_Sub6) this.aClass307_35.method7428()) {
			local7.method8671();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
	public synchronized void method6037() {
		for (@Pc(7) Class3_Sub6 local7 = (Class3_Sub6) this.aClass307_35.method7421(); local7 != null; local7 = (Class3_Sub6) this.aClass307_35.method7428()) {
			local7.method623();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!kha;Lclient!dd;ILclient!paa;)Z")
	public synchronized boolean method6038(@OriginalArg(1) Class181 arg0, @OriginalArg(2) Class58 arg1, @OriginalArg(4) Class3_Sub33 arg2) {
		arg2.method6547();
		@Pc(9) boolean local9 = true;
		@Pc(25) int[] local25 = new int[] { 22050 };
		for (@Pc(31) Class3_Sub35 local31 = (Class3_Sub35) arg2.aClass307_38.method7421(); local31 != null; local31 = (Class3_Sub35) arg2.aClass307_38.method7428()) {
			@Pc(37) int local37 = (int) local31.aLong277;
			@Pc(45) Class3_Sub6 local45 = (Class3_Sub6) this.aClass307_35.method7424((long) local37);
			if (local45 == null) {
				local45 = Static387.method6099(local37, arg0);
				if (local45 == null) {
					local9 = false;
					continue;
				}
				this.aClass307_35.method7425((long) local37, local45);
			}
			if (!local45.method621(local25, arg1, local31.aByteArray83)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method6549();
		}
		return local9;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([IIILclient!dg;B)Z")
	public boolean method6039(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub16 arg3) {
		arg3.anInt2482 = Static590.anInt9843 / 100;
		if (arg3.anInt2483 >= 0 && (arg3.aClass3_Sub7_Sub1_1 == null || arg3.aClass3_Sub7_Sub1_1.method655())) {
			arg3.method2445();
			arg3.method8671();
			if (arg3.anInt2478 > 0 && this.aClass3_Sub16ArrayArray2[arg3.anInt2491][arg3.anInt2478] == arg3) {
				this.aClass3_Sub16ArrayArray2[arg3.anInt2491][arg3.anInt2478] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg3.anInt2495;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray432[arg3.anInt2491] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg3.anInt2495 = local59;
		}
		arg3.aClass3_Sub7_Sub1_1.method685(this.method6027(arg3));
		@Pc(99) Class242 local99 = arg3.aClass242_1;
		@Pc(101) boolean local101 = false;
		arg3.anInt2481 += local99.anInt7548;
		arg3.anInt2493++;
		@Pc(132) double local132 = (double) ((arg3.anInt2496 - 60 << 8) + (arg3.anInt2495 * arg3.anInt2485 >> 12)) * 5.086263020833333E-6D;
		if (local99.anInt7555 > 0) {
			if (local99.anInt7551 <= 0) {
				arg3.anInt2492 += 128;
			} else {
				arg3.anInt2492 += (int) (Math.pow(2.0D, (double) local99.anInt7551 * local132) * 128.0D + 0.5D);
			}
			if (arg3.anInt2492 * local99.anInt7555 >= 819200) {
				local101 = true;
			}
		}
		if (local99.aByteArray78 != null) {
			if (local99.anInt7552 > 0) {
				arg3.anInt2494 += (int) (Math.pow(2.0D, (double) local99.anInt7552 * local132) * 128.0D + 0.5D);
			} else {
				arg3.anInt2494 += 128;
			}
			while (local99.aByteArray78.length - 2 > arg3.anInt2497 && (local99.aByteArray78[arg3.anInt2497 + 2] & 0xFF) << 8 < arg3.anInt2494) {
				arg3.anInt2497 += 2;
			}
			if (local99.aByteArray78.length - 2 == arg3.anInt2497 && local99.aByteArray78[arg3.anInt2497 + 1] == 0) {
				local101 = true;
			}
		}
		if (arg3.anInt2483 >= 0 && local99.aByteArray79 != null && (this.anIntArray423[arg3.anInt2491] & 0x1) == 0 && (arg3.anInt2478 < 0 || this.aClass3_Sub16ArrayArray2[arg3.anInt2491][arg3.anInt2478] != arg3)) {
			if (local99.anInt7546 > 0) {
				arg3.anInt2483 += (int) (Math.pow(2.0D, (double) local99.anInt7546 * local132) * 128.0D + 0.5D);
			} else {
				arg3.anInt2483 += 128;
			}
			while (arg3.anInt2479 < local99.aByteArray79.length - 2 && arg3.anInt2483 > (local99.aByteArray79[arg3.anInt2479 + 2] & 0xFF) << 8) {
				arg3.anInt2479 += 2;
			}
			if (local99.aByteArray79.length - 2 == arg3.anInt2479) {
				local101 = true;
			}
		}
		if (!local101) {
			arg3.aClass3_Sub7_Sub1_1.method678(arg3.anInt2482, this.method6020(arg3), this.method6041(arg3));
			return false;
		}
		arg3.aClass3_Sub7_Sub1_1.method677(arg3.anInt2482);
		if (arg0 == null) {
			arg3.aClass3_Sub7_Sub1_1.method6002(arg1);
		} else {
			arg3.aClass3_Sub7_Sub1_1.method6004(arg0, arg2, arg1);
		}
		if (arg3.aClass3_Sub7_Sub1_1.method673()) {
			this.aClass3_Sub7_Sub4_1.aClass3_Sub7_Sub3_1.method2209(arg3.aClass3_Sub7_Sub1_1);
		}
		arg3.method2445();
		if (arg3.anInt2483 >= 0) {
			arg3.method8671();
			if (arg3.anInt2478 > 0 && this.aClass3_Sub16ArrayArray2[arg3.anInt2491][arg3.anInt2478] == arg3) {
				this.aClass3_Sub16ArrayArray2[arg3.anInt2491][arg3.anInt2478] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(II)V")
	private void method6040(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6028(local16, local22, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method6029(local22, local28, local16);
			} else {
				this.method6028(local16, local22, 64);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6042(local28, local16, local22);
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
				this.anIntArray422[local16] = (this.anIntArray422[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray422[local16] = local28 + (this.anIntArray422[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray432[local16] = (local28 << 7) + (this.anIntArray432[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray432[local16] = local28 + (this.anIntArray432[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray428[local16] = (local28 << 7) + (this.anIntArray428[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray428[local16] = local28 + (this.anIntArray428[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray426[local16] = (local28 << 7) + (this.anIntArray426[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray426[local16] = local28 + (this.anIntArray426[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray427[local16] = (local28 << 7) + (this.anIntArray427[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray427[local16] = local28 + (this.anIntArray427[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray423[local16] |= 0x1;
				} else {
					this.anIntArray423[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method6014(local16);
					this.anIntArray423[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray423[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray434[local16] = (this.anIntArray434[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray434[local16] = (this.anIntArray434[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray434[local16] = (local28 << 7) + (this.anIntArray434[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray434[local16] = (this.anIntArray434[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method6025(local16);
			}
			if (local22 == 121) {
				this.method6024(local16);
			}
			if (local22 == 123) {
				this.method6013(local16);
			}
			@Pc(495) int local495;
			if (local22 == 6) {
				local495 = this.anIntArray434[local16];
				if (local495 == 16384) {
					this.anIntArray433[local16] = (this.anIntArray433[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local495 = this.anIntArray434[local16];
				if (local495 == 16384) {
					this.anIntArray433[local16] = (this.anIntArray433[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray425[local16] = (this.anIntArray425[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray425[local16] = (this.anIntArray425[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray423[local16] |= 0x4;
				} else {
					this.method6017(local16);
					this.anIntArray423[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method6008((this.anIntArray435[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method6008(local28 + (this.anIntArray435[local16] & 0xFFFFFF80), local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6044(this.anIntArray431[local16] + local22, local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6015(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F0A) >> 8);
			this.method6030(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method6011(true);
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!dg;I)I")
	private int method6041(@OriginalArg(0) Class3_Sub16 arg0) {
		@Pc(9) int local9 = this.anIntArray426[arg0.anInt2491];
		return local9 < 8192 ? local9 * arg0.anInt2490 + 32 >> 6 : 16384 - ((16384 - local9) * (128 - arg0.anInt2490) + 32 >> 6);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIII)V")
	private void method6042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "(II)V")
	public synchronized void method6043(@OriginalArg(0) int arg0) {
		this.anInt7237 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(III)V")
	private void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray430[arg1] != arg0) {
			this.anIntArray430[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass3_Sub16ArrayArray2[arg1][local26] = null;
			}
		}
	}
}
