import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class4_Sub7_Sub3 extends Class4_Sub7 {

	@OriginalMember(owner = "client!mt", name = "Bb", descriptor = "I")
	private int anInt6438;

	@OriginalMember(owner = "client!mt", name = "Db", descriptor = "Z")
	private boolean aBoolean465;

	@OriginalMember(owner = "client!mt", name = "Eb", descriptor = "I")
	private int anInt6439;

	@OriginalMember(owner = "client!mt", name = "Fb", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!mt", name = "Hb", descriptor = "J")
	private long aLong164;

	@OriginalMember(owner = "client!mt", name = "Ib", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!mt", name = "Jb", descriptor = "Lclient!sfa;")
	private Class4_Sub41 aClass4_Sub41_2;

	@OriginalMember(owner = "client!mt", name = "Kb", descriptor = "I")
	private int anInt6440;

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "[I")
	private final int[] anIntArray306 = new int[16];

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "[I")
	private final int[] anIntArray307 = new int[16];

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "[I")
	private final int[] anIntArray311 = new int[16];

	@OriginalMember(owner = "client!mt", name = "ab", descriptor = "[I")
	private final int[] anIntArray315 = new int[16];

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "[I")
	private final int[] anIntArray309 = new int[16];

	@OriginalMember(owner = "client!mt", name = "Y", descriptor = "[I")
	private final int[] anIntArray314 = new int[16];

	@OriginalMember(owner = "client!mt", name = "q", descriptor = "[I")
	private final int[] anIntArray308 = new int[16];

	@OriginalMember(owner = "client!mt", name = "P", descriptor = "[I")
	public final int[] anIntArray313 = new int[16];

	@OriginalMember(owner = "client!mt", name = "bb", descriptor = "[I")
	private final int[] anIntArray316 = new int[16];

	@OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
	private int anInt6402 = 256;

	@OriginalMember(owner = "client!mt", name = "ib", descriptor = "I")
	private final int anInt6428 = 1000000;

	@OriginalMember(owner = "client!mt", name = "M", descriptor = "[I")
	private final int[] anIntArray312 = new int[16];

	@OriginalMember(owner = "client!mt", name = "kb", descriptor = "[I")
	public final int[] anIntArray317 = new int[16];

	@OriginalMember(owner = "client!mt", name = "ob", descriptor = "[I")
	private final int[] anIntArray319 = new int[16];

	@OriginalMember(owner = "client!mt", name = "z", descriptor = "[I")
	private final int[] anIntArray310 = new int[16];

	@OriginalMember(owner = "client!mt", name = "mb", descriptor = "[I")
	public final int[] anIntArray318 = new int[16];

	@OriginalMember(owner = "client!mt", name = "V", descriptor = "[[Lclient!sw;")
	private final Class4_Sub43[][] aClass4_Sub43ArrayArray1 = new Class4_Sub43[16][128];

	@OriginalMember(owner = "client!mt", name = "vb", descriptor = "[I")
	private final int[] anIntArray320 = new int[16];

	@OriginalMember(owner = "client!mt", name = "wb", descriptor = "[[Lclient!sw;")
	private final Class4_Sub43[][] aClass4_Sub43ArrayArray2 = new Class4_Sub43[16][128];

	@OriginalMember(owner = "client!mt", name = "yb", descriptor = "[I")
	private final int[] anIntArray321 = new int[16];

	@OriginalMember(owner = "client!mt", name = "G", descriptor = "Lclient!ns;")
	private final Class238 aClass238_1 = new Class238();

	@OriginalMember(owner = "client!mt", name = "Gb", descriptor = "Lclient!hm;")
	private final Class4_Sub7_Sub2 aClass4_Sub7_Sub2_1 = new Class4_Sub7_Sub2(this);

	@OriginalMember(owner = "client!mt", name = "Q", descriptor = "Lclient!waa;")
	private final Class350 aClass350_26;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class4_Sub7_Sub3() {
		this.aClass350_26 = new Class350(128);
		this.method5442(256, -1);
		this.method5446(true);
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!mt;)V")
	public Class4_Sub7_Sub3(@OriginalArg(0) Class4_Sub7_Sub3 arg0) {
		this.aClass350_26 = arg0.aClass350_26;
		this.method5442(256, -1);
		this.method5446(true);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
	private void method5436() {
		@Pc(8) int local8 = this.anInt6439;
		@Pc(11) int local11 = this.anInt6438;
		@Pc(14) long local14 = this.aLong163;
		if (this.aClass4_Sub41_2 != null && local11 == this.anInt6440) {
			this.method5452(this.aBoolean465, this.aClass4_Sub41_2, this.aBoolean466);
			this.method5436();
			return;
		}
		while (this.anInt6438 == local11) {
			while (local11 == this.aClass238_1.anIntArray361[local8]) {
				this.aClass238_1.method5808(local8);
				@Pc(45) int local45 = this.aClass238_1.method5802(local8);
				if (local45 == 1) {
					this.aClass238_1.method5799();
					this.aClass238_1.method5800(local8);
					if (this.aClass238_1.method5810()) {
						if (this.aClass4_Sub41_2 != null) {
							this.method5445(this.aBoolean465, this.aClass4_Sub41_2);
							this.method5436();
							return;
						}
						if (!this.aBoolean465 || local11 == 0) {
							this.method5446(true);
							this.aClass238_1.method5797();
							return;
						}
						this.aClass238_1.method5796(local14);
					}
					break;
				}
				if ((local45 & 0x80) != 0) {
					this.method5462(local45);
				}
				this.aClass238_1.method5803(local8);
				this.aClass238_1.method5800(local8);
			}
			local8 = this.aClass238_1.method5807();
			local11 = this.aClass238_1.anIntArray361[local8];
			local14 = this.aClass238_1.method5811(local11);
		}
		this.anInt6438 = local11;
		this.anInt6439 = local8;
		this.aLong163 = local14;
		if (this.aClass4_Sub41_2 != null && this.anInt6440 < local11) {
			this.anInt6438 = this.anInt6440;
			this.anInt6439 = -1;
			this.aLong163 = this.aClass238_1.method5811(this.anInt6438);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZI)V")
	private void method5437(@OriginalArg(1) int arg0) {
		if ((this.anIntArray318[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class4_Sub43 local15 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5963(); local15 != null; local15 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5965()) {
			if (local15.anInt8956 == arg0) {
				local15.anInt8970 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!sw;[IIZ)Z")
	public boolean method5438(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub43 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg1.anInt8965 = Static262.anInt5047 / 100;
		if (arg1.anInt8966 >= 0 && (arg1.aClass4_Sub7_Sub4_4 == null || arg1.aClass4_Sub7_Sub4_4.method6439())) {
			arg1.method7305();
			arg1.method8379();
			if (arg1.anInt8951 > 0 && this.aClass4_Sub43ArrayArray1[arg1.anInt8956][arg1.anInt8951] == arg1) {
				this.aClass4_Sub43ArrayArray1[arg1.anInt8956][arg1.anInt8951] = null;
			}
			return true;
		}
		@Pc(63) int local63 = arg1.anInt8957;
		if (local63 > 0) {
			local63 -= (int) (Math.pow(2.0D, (double) this.anIntArray307[arg1.anInt8956] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local63 < 0) {
				local63 = 0;
			}
			arg1.anInt8957 = local63;
		}
		arg1.aClass4_Sub7_Sub4_4.method6411(this.method5443(arg1));
		@Pc(103) Class133 local103 = arg1.aClass133_1;
		arg1.anInt8960++;
		arg1.anInt8962 += local103.anInt3625;
		@Pc(118) boolean local118 = false;
		@Pc(136) double local136 = (double) ((arg1.anInt8957 * arg1.anInt8968 >> 12) + (arg1.anInt8967 - 60 << 8)) * 5.086263020833333E-6D;
		if (local103.anInt3624 > 0) {
			if (local103.anInt3628 <= 0) {
				arg1.anInt8955 += 128;
			} else {
				arg1.anInt8955 += (int) (Math.pow(2.0D, (double) local103.anInt3628 * local136) * 128.0D + 0.5D);
			}
			if (arg1.anInt8955 * local103.anInt3624 >= 819200) {
				local118 = true;
			}
		}
		if (local103.aByteArray48 != null) {
			if (local103.anInt3629 <= 0) {
				arg1.anInt8969 += 128;
			} else {
				arg1.anInt8969 += (int) (Math.pow(2.0D, local136 * (double) local103.anInt3629) * 128.0D + 0.5D);
			}
			while (local103.aByteArray48.length - 2 > arg1.anInt8954 && arg1.anInt8969 > (local103.aByteArray48[arg1.anInt8954 + 2] & 0xFF) << 8) {
				arg1.anInt8954 += 2;
			}
			if (local103.aByteArray48.length - 2 == arg1.anInt8954 && local103.aByteArray48[arg1.anInt8954 + 1] == 0) {
				local118 = true;
			}
		}
		if (arg1.anInt8966 >= 0 && local103.aByteArray47 != null && (this.anIntArray318[arg1.anInt8956] & 0x1) == 0 && (arg1.anInt8951 < 0 || arg1 != this.aClass4_Sub43ArrayArray1[arg1.anInt8956][arg1.anInt8951])) {
			if (local103.anInt3630 <= 0) {
				arg1.anInt8966 += 128;
			} else {
				arg1.anInt8966 += (int) (Math.pow(2.0D, local136 * (double) local103.anInt3630) * 128.0D + 0.5D);
			}
			while (local103.aByteArray47.length - 2 > arg1.anInt8963 && arg1.anInt8966 > (local103.aByteArray47[arg1.anInt8963 + 2] & 0xFF) << 8) {
				arg1.anInt8963 += 2;
			}
			if (local103.aByteArray47.length - 2 == arg1.anInt8963) {
				local118 = true;
			}
		}
		if (!local118) {
			arg1.aClass4_Sub7_Sub4_4.method6443(arg1.anInt8965, this.method5469(arg1), this.method5439(arg1));
			return false;
		}
		arg1.aClass4_Sub7_Sub4_4.method6408(arg1.anInt8965);
		if (arg2 == null) {
			arg1.aClass4_Sub7_Sub4_4.method6402(arg3);
		} else {
			arg1.aClass4_Sub7_Sub4_4.method6400(arg2, arg0, arg3);
		}
		if (arg1.aClass4_Sub7_Sub4_4.method6413()) {
			this.aClass4_Sub7_Sub2_1.aClass4_Sub7_Sub1_1.method397(arg1.aClass4_Sub7_Sub4_4);
		}
		arg1.method7305();
		if (arg1.anInt8966 >= 0) {
			arg1.method8379();
			if (arg1.anInt8951 > 0 && arg1 == this.aClass4_Sub43ArrayArray1[arg1.anInt8956][arg1.anInt8951]) {
				this.aClass4_Sub43ArrayArray1[arg1.anInt8956][arg1.anInt8951] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLclient!sw;)I")
	private int method5439(@OriginalArg(1) Class4_Sub43 arg0) {
		@Pc(14) int local14 = this.anIntArray310[arg0.anInt8956];
		return local14 < 8192 ? local14 * arg0.anInt8953 + 32 >> 6 : 16384 - ((128 - arg0.anInt8953) * (-local14 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(III)V")
	private void method5440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray309[arg0] = arg1;
		this.anIntArray313[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public synchronized Class4_Sub7 method6404() {
		return null;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)V")
	private void method5441(@OriginalArg(1) int arg0) {
		if ((this.anIntArray318[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub43 local18 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5963(); local18 != null; local18 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5965()) {
			if (arg0 == local18.anInt8956 && this.aClass4_Sub43ArrayArray2[arg0][local18.anInt8967] == null && local18.anInt8966 < 0) {
				local18.anInt8966 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IBI)V")
	public synchronized void method5442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray316[arg1] = arg0;
		} else {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.anIntArray316[local12] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!sw;I)I")
	private int method5443(@OriginalArg(0) Class4_Sub43 arg0) {
		@Pc(19) int local19 = (arg0.anInt8957 * arg0.anInt8968 >> 12) + arg0.anInt8961;
		local19 += this.anIntArray308[arg0.anInt8956] * (this.anIntArray312[arg0.anInt8956] - 8192) >> 12;
		@Pc(40) Class133 local40 = arg0.aClass133_1;
		@Pc(60) int local60;
		if (local40.anInt3625 > 0 && (local40.anInt3626 > 0 || this.anIntArray311[arg0.anInt8956] > 0)) {
			local60 = local40.anInt3626 << 2;
			@Pc(65) int local65 = local40.anInt3631 << 1;
			if (local65 > arg0.anInt8960) {
				local60 = local60 * arg0.anInt8960 / local65;
			}
			local60 += this.anIntArray311[arg0.anInt8956] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt8962 & 0x1FF) * 0.01227184630308513D);
			local19 += (int) (local99 * (double) local60);
		}
		local60 = (int) ((double) (arg0.aClass4_Sub16_Sub1_4.anInt2744 * 256) * Math.pow(2.0D, (double) local19 * 3.255208333333333E-4D) / (double) Static262.anInt5047 + 0.5D);
		return local60 >= 1 ? local60 : 1;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)V")
	public synchronized void method5444(@OriginalArg(1) int arg0) {
		this.anInt6402 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZLclient!sfa;I)V")
	public synchronized void method5445(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub41 arg1) {
		this.method5452(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZB)V")
	private void method5446(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method5470(-1);
		} else {
			this.method5464(-1);
		}
		this.method5450(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray314[local23] = this.anIntArray306[local23];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray321[local49] = this.anIntArray306[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZLclient!sw;)V")
	public void method5447(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub43 arg1) {
		@Pc(15) int local15 = arg1.aClass4_Sub16_Sub1_4.aByteArray27.length;
		@Pc(42) int local42;
		if (arg0 && arg1.aClass4_Sub16_Sub1_4.aBoolean207) {
			@Pc(29) int local29 = local15 + local15 - arg1.aClass4_Sub16_Sub1_4.anInt2745;
			local42 = (int) ((long) this.anIntArray317[arg1.anInt8956] * (long) local29 >> 6);
			local15 <<= 0x8;
			if (local42 >= local15) {
				arg1.aClass4_Sub7_Sub4_4.method6427();
				local42 = local15 + local15 - local42 - 1;
			}
		} else {
			local42 = (int) ((long) local15 * (long) this.anIntArray317[arg1.anInt8956] >> 6);
		}
		arg1.aClass4_Sub7_Sub4_4.method6412(local42);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BII)V")
	private void method5448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)V")
	private void method5450(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method5450(local12);
			}
			return;
		}
		this.anIntArray315[arg0] = 12800;
		this.anIntArray310[arg0] = 8192;
		this.anIntArray319[arg0] = 16383;
		this.anIntArray312[arg0] = 8192;
		this.anIntArray311[arg0] = 0;
		this.anIntArray307[arg0] = 8192;
		this.method5441(arg0);
		this.method5437(arg0);
		this.anIntArray318[arg0] = 0;
		this.anIntArray320[arg0] = 32767;
		this.anIntArray308[arg0] = 256;
		this.anIntArray317[arg0] = 0;
		this.method5440(arg0, 8192);
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)V")
	public synchronized void method5451() {
		for (@Pc(19) Class4_Sub44 local19 = (Class4_Sub44) this.aClass350_26.method8198(); local19 != null; local19 = (Class4_Sub44) this.aClass350_26.method8205()) {
			local19.method7396();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZLclient!sfa;Z)V")
	private synchronized void method5452(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub41 arg1, @OriginalArg(3) boolean arg2) {
		this.method5471(arg2);
		this.aClass238_1.method5806(arg1.aByteArray97);
		this.aLong164 = 0L;
		this.aBoolean465 = arg0;
		@Pc(28) int local28 = this.aClass238_1.method5798();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass238_1.method5808(local30);
			this.aClass238_1.method5803(local30);
			this.aClass238_1.method5800(local30);
		}
		this.anInt6439 = this.aClass238_1.method5807();
		this.anInt6438 = this.aClass238_1.anIntArray361[this.anInt6439];
		this.aLong163 = this.aClass238_1.method5811(this.anInt6438);
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(III)V")
	private void method5453() {
		this.anIntArray306[9] = 128;
		this.anIntArray321[9] = 128;
		this.method5457(9, 128);
	}

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "(I)V")
	public synchronized void method5454() {
		for (@Pc(11) Class4_Sub44 local11 = (Class4_Sub44) this.aClass350_26.method8198(); local11 != null; local11 = (Class4_Sub44) this.aClass350_26.method8205()) {
			local11.method8379();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(JI)V")
	private void method5455(@OriginalArg(0) long arg0) {
		while (arg0 >= this.aLong163) {
			@Pc(16) int local16 = this.anInt6439;
			@Pc(19) int local19 = this.anInt6438;
			@Pc(22) long local22 = this.aLong163;
			while (local19 == this.anInt6438) {
				while (this.aClass238_1.anIntArray361[local16] == local19) {
					this.aClass238_1.method5808(local16);
					@Pc(33) int local33 = this.aClass238_1.method5802(local16);
					if (local33 == 1) {
						this.aClass238_1.method5799();
						this.aClass238_1.method5800(local16);
						if (this.aClass238_1.method5810()) {
							if (!this.aBoolean465 || local19 == 0) {
								this.method5446(true);
								this.aClass238_1.method5797();
								return;
							}
							this.aClass238_1.method5796(local22);
						}
						break;
					}
					if ((local33 & 0x80) != 0 && (local33 & 0xF0) != 144) {
						this.method5462(local33);
					}
					this.aClass238_1.method5803(local16);
					this.aClass238_1.method5800(local16);
				}
				this.aLong164 = local22;
				local16 = this.aClass238_1.method5807();
				local19 = this.aClass238_1.anIntArray361[local16];
				local22 = this.aClass238_1.method5811(local19);
			}
			this.anInt6438 = local19;
			this.aLong163 = local22;
			this.anInt6439 = local16;
		}
	}

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "(I)V")
	public synchronized void method5456() {
		this.method5471(true);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIB)V")
	private void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray314[arg0]) {
			this.anIntArray314[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass4_Sub43ArrayArray1[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "()Lclient!mi;")
	@Override
	public synchronized Class4_Sub7 method6401() {
		return this.aClass4_Sub7_Sub2_1;
	}

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "(I)Z")
	public synchronized boolean method5458() {
		return this.aClass238_1.method5801();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6402(@OriginalArg(0) int arg0) {
		if (this.aClass238_1.method5801()) {
			@Pc(14) int local14 = this.aClass238_1.anInt6982 * this.anInt6428 / Static262.anInt5047;
			do {
				@Pc(24) long local24 = this.aLong164 + (long) arg0 * (long) local14;
				if (this.aLong163 - local24 >= 0L) {
					this.aLong164 = local24;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong163 + (long) local14 - this.aLong164 - 1L) / (long) local14);
				this.aLong164 += (long) local14 * (long) local53;
				this.aClass4_Sub7_Sub2_1.method6402(local53);
				arg0 -= local53;
				this.method5436();
			} while (this.aClass238_1.method5801());
		}
		this.aClass4_Sub7_Sub2_1.method6402(arg0);
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(Lclient!sw;I)Z")
	public boolean method5459(@OriginalArg(0) Class4_Sub43 arg0) {
		if (arg0.aClass4_Sub7_Sub4_4 != null) {
			return false;
		}
		if (arg0.anInt8966 >= 0) {
			arg0.method8379();
			if (arg0.anInt8951 > 0 && arg0 == this.aClass4_Sub43ArrayArray1[arg0.anInt8956][arg0.anInt8951]) {
				this.aClass4_Sub43ArrayArray1[arg0.anInt8956][arg0.anInt8951] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIII)V")
	private void method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class4_Sub43 local16 = this.aClass4_Sub43ArrayArray2[arg2][arg0];
		if (local16 == null) {
			return;
		}
		this.aClass4_Sub43ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray318[arg2] & 0x2) == 0) {
			local16.anInt8966 = 0;
			return;
		}
		for (@Pc(44) Class4_Sub43 local44 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5963(); local44 != null; local44 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5965()) {
			if (local16.anInt8956 == local44.anInt8956 && local44.anInt8966 < 0 && local44 != local16) {
				local16.anInt8966 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!sfa;ZJZ)V")
	public synchronized void method5461(@OriginalArg(1) Class4_Sub41 arg0, @OriginalArg(3) long arg1, @OriginalArg(4) boolean arg2) {
		this.method5452(arg2, arg0, true);
		this.method5455((long) this.aClass238_1.anInt6982 * arg1);
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(II)V")
	private void method5462(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local15 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method5460(local30, local36, local24);
		} else if (local15 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 > 0) {
				this.method5468(local30, local36, local24);
			} else {
				this.method5460(local30, 64, local24);
			}
		} else if (local15 == 160) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method5465(local36, local24, local30);
		} else if (local15 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray321[local24] = (local36 << 14) + (this.anIntArray321[local24] & 0xFFE03FFF);
			}
			if (local30 == 32) {
				this.anIntArray321[local24] = (local36 << 7) + (this.anIntArray321[local24] & 0xFFFFC07F);
			}
			if (local30 == 1) {
				this.anIntArray311[local24] = (this.anIntArray311[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 33) {
				this.anIntArray311[local24] = local36 + (this.anIntArray311[local24] & 0xFFFFFF80);
			}
			if (local30 == 5) {
				this.anIntArray307[local24] = (local36 << 7) + (this.anIntArray307[local24] & 0xFFFFC07F);
			}
			if (local30 == 37) {
				this.anIntArray307[local24] = (this.anIntArray307[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 7) {
				this.anIntArray315[local24] = (this.anIntArray315[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 39) {
				this.anIntArray315[local24] = local36 + (this.anIntArray315[local24] & 0xFFFFFF80);
			}
			if (local30 == 10) {
				this.anIntArray310[local24] = (local36 << 7) + (this.anIntArray310[local24] & 0xFFFFC07F);
			}
			if (local30 == 42) {
				this.anIntArray310[local24] = local36 + (this.anIntArray310[local24] & 0xFFFFFF80);
			}
			if (local30 == 11) {
				this.anIntArray319[local24] = (this.anIntArray319[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 43) {
				this.anIntArray319[local24] = local36 + (this.anIntArray319[local24] & 0xFFFFFF80);
			}
			if (local30 == 64) {
				if (local36 >= 64) {
					this.anIntArray318[local24] |= 0x1;
				} else {
					this.anIntArray318[local24] &= 0xFFFFFFFE;
				}
			}
			if (local30 == 65) {
				if (local36 < 64) {
					this.method5441(local24);
					this.anIntArray318[local24] &= 0xFFFFFFFD;
				} else {
					this.anIntArray318[local24] |= 0x2;
				}
			}
			if (local30 == 99) {
				this.anIntArray320[local24] = (this.anIntArray320[local24] & 0x7F) + (local36 << 7);
			}
			if (local30 == 98) {
				this.anIntArray320[local24] = (this.anIntArray320[local24] & 0x3F80) + local36;
			}
			if (local30 == 101) {
				this.anIntArray320[local24] = (this.anIntArray320[local24] & 0x7F) + (local36 << 7) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray320[local24] = (this.anIntArray320[local24] & 0x3F80) + (local36 + 16384);
			}
			if (local30 == 120) {
				this.method5470(local24);
			}
			if (local30 == 121) {
				this.method5450(local24);
			}
			if (local30 == 123) {
				this.method5464(local24);
			}
			@Pc(517) int local517;
			if (local30 == 6) {
				local517 = this.anIntArray320[local24];
				if (local517 == 16384) {
					this.anIntArray308[local24] = (this.anIntArray308[local24] & 0xFFFFC07F) + (local36 << 7);
				}
			}
			if (local30 == 38) {
				local517 = this.anIntArray320[local24];
				if (local517 == 16384) {
					this.anIntArray308[local24] = (this.anIntArray308[local24] & 0xFFFFFF80) + local36;
				}
			}
			if (local30 == 16) {
				this.anIntArray317[local24] = (local36 << 7) + (this.anIntArray317[local24] & 0xFFFFC07F);
			}
			if (local30 == 48) {
				this.anIntArray317[local24] = (this.anIntArray317[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 81) {
				if (local36 < 64) {
					this.method5437(local24);
					this.anIntArray318[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray318[local24] |= 0x4;
				}
			}
			if (local30 == 17) {
				this.method5440(local24, (local36 << 7) + (this.anIntArray309[local24] & 0xFFFFC07F));
			}
			if (local30 == 49) {
				this.method5440(local24, (this.anIntArray309[local24] & 0xFFFFFF80) + local36);
			}
		} else if (local15 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method5457(local24, this.anIntArray321[local24] + local30);
		} else if (local15 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method5448(local24, local30);
		} else if (local15 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00EA) >> 9);
			this.method5463(local30, local24);
		} else {
			local15 = arg0 & 0xFF;
			if (local15 == 255) {
				this.method5446(true);
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "()I")
	@Override
	public synchronized int method6405() {
		return 0;
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "(III)V")
	private void method5463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray312[arg1] = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(II)V")
	private void method5464(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class4_Sub43 local12 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5963(); local12 != null; local12 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5965()) {
			if ((arg0 < 0 || arg0 == local12.anInt8956) && local12.anInt8966 < 0) {
				this.aClass4_Sub43ArrayArray2[local12.anInt8956][local12.anInt8967] = null;
				local12.anInt8966 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BIII)V")
	private void method5465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "(III)V")
	public synchronized void method5466() {
		this.method5453();
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "(B)I")
	public int method5467() {
		return this.anInt6402;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6400(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass238_1.method5801()) {
			@Pc(18) int local18 = this.aClass238_1.anInt6982 * this.anInt6428 / Static262.anInt5047;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong164;
				if (this.aLong163 - local27 >= 0L) {
					this.aLong164 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong163 - this.aLong164 - 1L) / (long) local18);
				this.aLong164 += (long) local18 * (long) local56;
				this.aClass4_Sub7_Sub2_1.method6400(arg0, arg1, local56);
				arg1 += local56;
				arg2 -= local56;
				this.method5436();
			} while (this.aClass238_1.method5801());
		}
		this.aClass4_Sub7_Sub2_1.method6400(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIB)V")
	private void method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method5460(arg0, 64, arg2);
		if ((this.anIntArray318[arg2] & 0x2) != 0) {
			for (@Pc(28) Class4_Sub43 local28 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5971(); local28 != null; local28 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5970()) {
				if (arg2 == local28.anInt8956 && local28.anInt8966 < 0) {
					this.aClass4_Sub43ArrayArray2[arg2][local28.anInt8967] = null;
					this.aClass4_Sub43ArrayArray2[arg2][arg0] = local28;
					@Pc(67) int local67 = local28.anInt8961 + (local28.anInt8968 * local28.anInt8957 >> 12);
					local28.anInt8961 += arg0 - local28.anInt8967 << 8;
					local28.anInt8968 = local67 - local28.anInt8961;
					local28.anInt8957 = 4096;
					local28.anInt8967 = arg0;
					return;
				}
			}
		}
		@Pc(112) Class4_Sub44 local112 = (Class4_Sub44) this.aClass350_26.method8207((long) this.anIntArray314[arg2]);
		if (local112 == null) {
			return;
		}
		@Pc(127) Class4_Sub16_Sub1 local127 = local112.aClass4_Sub16_Sub1Array1[arg0];
		if (local127 == null) {
			return;
		}
		@Pc(134) Class4_Sub43 local134 = new Class4_Sub43();
		local134.aClass4_Sub44_1 = local112;
		local134.aClass4_Sub16_Sub1_4 = local127;
		local134.anInt8956 = arg2;
		local134.aClass133_1 = local112.aClass133Array1[arg0];
		local134.anInt8951 = local112.aByteArray100[arg0];
		local134.anInt8967 = arg0;
		local134.anInt8958 = arg1 * arg1 * local112.anInt9052 * local112.aByteArray99[arg0] + 1024 >> 11;
		local134.anInt8953 = local112.aByteArray98[arg0] & 0xFF;
		local134.anInt8961 = (arg0 << 8) - (local112.aShortArray123[arg0] & 0x7FFF);
		local134.anInt8963 = 0;
		local134.anInt8955 = 0;
		local134.anInt8969 = 0;
		local134.anInt8954 = 0;
		local134.anInt8966 = -1;
		if (this.anIntArray317[arg2] == 0) {
			local134.aClass4_Sub7_Sub4_4 = Static600.method6430(local127, this.method5443(local134), this.method5469(local134), this.method5439(local134));
		} else {
			local134.aClass4_Sub7_Sub4_4 = Static600.method6430(local127, this.method5443(local134), 0, this.method5439(local134));
			this.method5447(local112.aShortArray123[arg0] < 0, local134);
		}
		if (local112.aShortArray123[arg0] < 0) {
			local134.aClass4_Sub7_Sub4_4.method6422(-1);
		}
		if (local134.anInt8951 >= 0) {
			@Pc(288) Class4_Sub43 local288 = this.aClass4_Sub43ArrayArray1[arg2][local134.anInt8951];
			if (local288 != null && local288.anInt8966 < 0) {
				this.aClass4_Sub43ArrayArray2[arg2][local288.anInt8967] = null;
				local288.anInt8966 = 0;
			}
			this.aClass4_Sub43ArrayArray1[arg2][local134.anInt8951] = local134;
		}
		this.aClass4_Sub7_Sub2_1.aClass244_26.method5960(local134);
		this.aClass4_Sub43ArrayArray2[arg2][arg0] = local134;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!sw;B)I")
	private int method5469(@OriginalArg(0) Class4_Sub43 arg0) {
		if (this.anIntArray316[arg0.anInt8956] == 0) {
			return 0;
		}
		@Pc(14) Class133 local14 = arg0.aClass133_1;
		@Pc(30) int local30 = this.anIntArray319[arg0.anInt8956] * this.anIntArray315[arg0.anInt8956] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt8958 * local38 + 16384 >> 15;
		@Pc(56) int local56 = local47 * this.anInt6402 + 128 >> 8;
		local30 = this.anIntArray316[arg0.anInt8956] * local56 + 128 >> 8;
		if (local14.anInt3624 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) local14.anInt3624 * 1.953125E-5D * (double) arg0.anInt8955) * (double) local30 + 0.5D);
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		@Pc(130) int local130;
		@Pc(142) int local142;
		if (local14.aByteArray48 != null) {
			local100 = arg0.anInt8969;
			local108 = local14.aByteArray48[arg0.anInt8954 + 1];
			if (arg0.anInt8954 < local14.aByteArray48.length - 2) {
				local130 = (local14.aByteArray48[arg0.anInt8954] & 0xFF) << 8;
				local142 = (local14.aByteArray48[arg0.anInt8954 + 2] & 0xFF) << 8;
				local108 += (local14.aByteArray48[arg0.anInt8954 + 3] - local108) * (local100 + -local130) / (local142 - local130);
			}
			local30 = local30 * local108 + 32 >> 6;
		}
		if (arg0.anInt8966 > 0 && local14.aByteArray47 != null) {
			local100 = arg0.anInt8966;
			local108 = local14.aByteArray47[arg0.anInt8963 + 1];
			if (local14.aByteArray47.length - 2 > arg0.anInt8963) {
				local130 = (local14.aByteArray47[arg0.anInt8963] & 0xFF) << 8;
				local142 = (local14.aByteArray47[arg0.anInt8963 + 2] & 0xFF) << 8;
				local108 += (local100 - local130) * (local14.aByteArray47[arg0.anInt8963 + 3] - local108) / (local142 - local130);
			}
			local30 = local108 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "(II)V")
	private void method5470(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class4_Sub43 local8 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5963(); local8 != null; local8 = (Class4_Sub43) this.aClass4_Sub7_Sub2_1.aClass244_26.method5965()) {
			if (arg0 < 0 || local8.anInt8956 == arg0) {
				if (local8.aClass4_Sub7_Sub4_4 != null) {
					local8.aClass4_Sub7_Sub4_4.method6408(Static262.anInt5047 / 100);
					if (local8.aClass4_Sub7_Sub4_4.method6413()) {
						this.aClass4_Sub7_Sub2_1.aClass4_Sub7_Sub1_1.method397(local8.aClass4_Sub7_Sub4_4);
					}
					local8.method7305();
				}
				if (local8.anInt8966 < 0) {
					this.aClass4_Sub43ArrayArray2[local8.anInt8956][local8.anInt8967] = null;
				}
				local8.method8379();
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(ZI)V")
	private synchronized void method5471(@OriginalArg(0) boolean arg0) {
		this.aClass238_1.method5797();
		this.aClass4_Sub41_2 = null;
		this.method5446(arg0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!gd;ILclient!sfa;ILclient!jn;)Z")
	public synchronized boolean method5472(@OriginalArg(0) Class113 arg0, @OriginalArg(2) Class4_Sub41 arg1, @OriginalArg(4) Class176 arg2) {
		arg1.method7162();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class4_Sub6 local29 = (Class4_Sub6) arg1.aClass350_37.method8198(); local29 != null; local29 = (Class4_Sub6) arg1.aClass350_37.method8205()) {
			@Pc(35) int local35 = (int) local29.aLong268;
			@Pc(45) Class4_Sub44 local45 = (Class4_Sub44) this.aClass350_26.method8207((long) local35);
			if (local45 == null) {
				local45 = Static135.method2683(local35, arg2);
				if (local45 == null) {
					local9 = false;
					continue;
				}
				this.aClass350_26.method8199((long) local35, local45);
			}
			if (!local45.method7394(local23, local29.aByteArray3, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method7160();
		}
		return local9;
	}
}
