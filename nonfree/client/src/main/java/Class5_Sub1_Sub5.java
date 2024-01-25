import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class5_Sub1_Sub5 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ul", name = "Bb", descriptor = "I")
	private int anInt9688;

	@OriginalMember(owner = "client!ul", name = "Cb", descriptor = "J")
	private long aLong245;

	@OriginalMember(owner = "client!ul", name = "Db", descriptor = "J")
	private long aLong246;

	@OriginalMember(owner = "client!ul", name = "Eb", descriptor = "Z")
	private boolean aBoolean694;

	@OriginalMember(owner = "client!ul", name = "Gb", descriptor = "I")
	private int anInt9689;

	@OriginalMember(owner = "client!ul", name = "Hb", descriptor = "Z")
	private boolean aBoolean695;

	@OriginalMember(owner = "client!ul", name = "Ib", descriptor = "I")
	private int anInt9690;

	@OriginalMember(owner = "client!ul", name = "Jb", descriptor = "Lclient!tp;")
	private Class5_Sub49 aClass5_Sub49_2;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "[I")
	private final int[] anIntArray537 = new int[16];

	@OriginalMember(owner = "client!ul", name = "M", descriptor = "[I")
	private final int[] anIntArray541 = new int[16];

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "[I")
	public final int[] anIntArray535 = new int[16];

	@OriginalMember(owner = "client!ul", name = "H", descriptor = "[I")
	private final int[] anIntArray540 = new int[16];

	@OriginalMember(owner = "client!ul", name = "ab", descriptor = "[I")
	private final int[] anIntArray543 = new int[16];

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "[I")
	public final int[] anIntArray539 = new int[16];

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "[I")
	private final int[] anIntArray536 = new int[16];

	@OriginalMember(owner = "client!ul", name = "ib", descriptor = "[I")
	public final int[] anIntArray544 = new int[16];

	@OriginalMember(owner = "client!ul", name = "jb", descriptor = "[I")
	private final int[] anIntArray545 = new int[16];

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "[I")
	private final int[] anIntArray538 = new int[16];

	@OriginalMember(owner = "client!ul", name = "eb", descriptor = "I")
	private final int anInt9675 = 1000000;

	@OriginalMember(owner = "client!ul", name = "U", descriptor = "[I")
	private final int[] anIntArray542 = new int[16];

	@OriginalMember(owner = "client!ul", name = "nb", descriptor = "[I")
	private final int[] anIntArray546 = new int[16];

	@OriginalMember(owner = "client!ul", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!ul", name = "rb", descriptor = "[I")
	private final int[] anIntArray548 = new int[16];

	@OriginalMember(owner = "client!ul", name = "tb", descriptor = "[I")
	private final int[] anIntArray549 = new int[16];

	@OriginalMember(owner = "client!ul", name = "ob", descriptor = "[I")
	private final int[] anIntArray547 = new int[16];

	@OriginalMember(owner = "client!ul", name = "yb", descriptor = "I")
	private int anInt9685 = 256;

	@OriginalMember(owner = "client!ul", name = "qb", descriptor = "[[Lclient!gfa;")
	private final Class5_Sub23[][] aClass5_Sub23ArrayArray1 = new Class5_Sub23[16][128];

	@OriginalMember(owner = "client!ul", name = "sb", descriptor = "[[Lclient!gfa;")
	private final Class5_Sub23[][] aClass5_Sub23ArrayArray2 = new Class5_Sub23[16][128];

	@OriginalMember(owner = "client!ul", name = "mb", descriptor = "Lclient!mb;")
	private final Class226 aClass226_1 = new Class226();

	@OriginalMember(owner = "client!ul", name = "Fb", descriptor = "Lclient!gm;")
	private final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_1 = new Class5_Sub1_Sub1(this);

	@OriginalMember(owner = "client!ul", name = "Y", descriptor = "Lclient!pl;")
	private final Class273 aClass273_43;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub5() {
		this.aClass273_43 = new Class273(128);
		this.method8314(256, -1);
		this.method8306(true);
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!ul;)V")
	public Class5_Sub1_Sub5(@OriginalArg(0) Class5_Sub1_Sub5 arg0) {
		this.aClass273_43 = arg0.aClass273_43;
		this.method8314(256, -1);
		this.method8306(true);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "()Lclient!aca;")
	@Override
	public synchronized Class5_Sub1 method8282() {
		return this.aClass5_Sub1_Sub1_1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(JZ)V")
	private void method8289(@OriginalArg(0) long arg0) {
		while (this.aLong245 <= arg0) {
			@Pc(19) int local19 = this.anInt9689;
			@Pc(22) int local22 = this.anInt9688;
			@Pc(25) long local25 = this.aLong245;
			while (local22 == this.anInt9688) {
				while (local22 == this.aClass226_1.anIntArray309[local19]) {
					this.aClass226_1.method5002(local19);
					@Pc(36) int local36 = this.aClass226_1.method5009(local19);
					if (local36 == 1) {
						this.aClass226_1.method5005();
						this.aClass226_1.method4999(local19);
						if (this.aClass226_1.method5008()) {
							if (!this.aBoolean694 || local22 == 0) {
								this.method8306(true);
								this.aClass226_1.method5004();
								return;
							}
							this.aClass226_1.method5001(local25);
						}
						break;
					}
					if ((local36 & 0x80) != 0 && (local36 & 0xF0) != 144) {
						this.method8300(local36);
					}
					this.aClass226_1.method5007(local19);
					this.aClass226_1.method4999(local19);
				}
				this.aLong246 = local25;
				local19 = this.aClass226_1.method4997();
				local22 = this.aClass226_1.anIntArray309[local19];
				local25 = this.aClass226_1.method4998(local22);
			}
			this.anInt9688 = local22;
			this.anInt9689 = local19;
			this.aLong245 = local25;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	public synchronized void method8290() {
		for (@Pc(15) Class5_Sub10 local15 = (Class5_Sub10) this.aClass273_43.method6577(); local15 != null; local15 = (Class5_Sub10) this.aClass273_43.method6589()) {
			local15.method976();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
	private void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray548[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!gfa;)I")
	private int method8292(@OriginalArg(1) Class5_Sub23 arg0) {
		if (this.anIntArray549[arg0.anInt3137] == 0) {
			return 0;
		}
		@Pc(17) Class346 local17 = arg0.aClass346_1;
		@Pc(33) int local33 = this.anIntArray546[arg0.anInt3137] * this.anIntArray543[arg0.anInt3137] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = arg0.anInt3147 * local41 + 16384 >> 15;
		@Pc(65) int local65 = local50 * this.anInt9685 + 128 >> 8;
		local33 = local65 * this.anIntArray549[arg0.anInt3137] + 128 >> 8;
		if (local17.anInt9569 > 0) {
			local33 = (int) ((double) local33 * Math.pow(0.5D, (double) arg0.anInt3142 * 1.953125E-5D * (double) local17.anInt9569) + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(130) int local130;
		@Pc(142) int local142;
		if (local17.aByteArray101 != null) {
			local104 = arg0.anInt3134;
			local112 = local17.aByteArray101[arg0.anInt3146 + 1];
			if (arg0.anInt3146 < local17.aByteArray101.length - 2) {
				local130 = (local17.aByteArray101[arg0.anInt3146] & 0xFF) << 8;
				local142 = (local17.aByteArray101[arg0.anInt3146 + 2] & 0xFF) << 8;
				local112 += (local17.aByteArray101[arg0.anInt3146 + 3] - local112) * (local104 - local130) / (local142 - local130);
			}
			local33 = local33 * local112 + 32 >> 6;
		}
		if (arg0.anInt3135 > 0 && local17.aByteArray100 != null) {
			local104 = arg0.anInt3135;
			local112 = local17.aByteArray100[arg0.anInt3126 + 1];
			if (local17.aByteArray100.length - 2 > arg0.anInt3126) {
				local130 = (local17.aByteArray100[arg0.anInt3126] & 0xFF) << 8;
				local142 = (local17.aByteArray100[arg0.anInt3126 + 2] & 0xFF) << 8;
				local112 += (local17.aByteArray100[arg0.anInt3126 + 3] - local112) * (-local130 + local104) / (local142 - local130);
			}
			local33 = local33 * local112 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!gfa;ZB)V")
	public void method8293(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(16) int local16 = arg0.aClass5_Sub37_Sub1_3.aByteArray94.length;
		@Pc(44) int local44;
		if (arg1 && arg0.aClass5_Sub37_Sub1_3.aBoolean655) {
			@Pc(31) int local31 = local16 + local16 - arg0.aClass5_Sub37_Sub1_3.anInt8936;
			local44 = (int) ((long) local31 * (long) this.anIntArray535[arg0.anInt3137] >> 6);
			local16 <<= 0x8;
			if (local44 >= local16) {
				arg0.aClass5_Sub1_Sub4_3.method7759();
				local44 = local16 + local16 - local44 - 1;
			}
		} else {
			local44 = (int) ((long) this.anIntArray535[arg0.anInt3137] * (long) local16 >> 6);
		}
		arg0.aClass5_Sub1_Sub4_3.method7779(local44);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIBI)V")
	private void method8294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)Z")
	public synchronized boolean method8295() {
		return this.aClass226_1.method4994();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
	private void method8296(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class5_Sub23 local16 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7908(); local16 != null; local16 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7914()) {
			if (arg0 < 0 || arg0 == local16.anInt3137) {
				if (local16.aClass5_Sub1_Sub4_3 != null) {
					local16.aClass5_Sub1_Sub4_3.method7760(Static491.anInt8290 / 100);
					if (local16.aClass5_Sub1_Sub4_3.method7768()) {
						this.aClass5_Sub1_Sub1_1.aClass5_Sub1_Sub2_2.method5055(local16.aClass5_Sub1_Sub4_3);
					}
					local16.method2705();
				}
				if (local16.anInt3135 < 0) {
					this.aClass5_Sub23ArrayArray2[local16.anInt3137][local16.anInt3139] = null;
				}
				local16.method9047();
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!gfa;)I")
	private int method8297(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(17) int local17 = this.anIntArray542[arg0.anInt3137];
		return local17 < 8192 ? local17 * arg0.anInt3149 + 32 >> 6 : 16384 - ((16384 - local17) * (-arg0.anInt3149 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZI)V")
	public synchronized void method8299() {
		this.method8326();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)V")
	private void method8300(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local9 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method8317(local36, local24, local30);
		} else if (local9 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 > 0) {
				this.method8319(local36, local30, local24);
			} else {
				this.method8317(64, local24, local30);
			}
		} else if (local9 == 160) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method8294(local24, local30, local36);
		} else if (local9 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray540[local24] = (this.anIntArray540[local24] & 0xFFE03FFF) + (local36 << 14);
			}
			if (local30 == 32) {
				this.anIntArray540[local24] = (local36 << 7) + (this.anIntArray540[local24] & 0xFFFFC07F);
			}
			if (local30 == 1) {
				this.anIntArray547[local24] = (this.anIntArray547[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 33) {
				this.anIntArray547[local24] = (this.anIntArray547[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 5) {
				this.anIntArray538[local24] = (local36 << 7) + (this.anIntArray538[local24] & 0xFFFFC07F);
			}
			if (local30 == 37) {
				this.anIntArray538[local24] = local36 + (this.anIntArray538[local24] & 0xFFFFFF80);
			}
			if (local30 == 7) {
				this.anIntArray543[local24] = (local36 << 7) + (this.anIntArray543[local24] & 0xFFFFC07F);
			}
			if (local30 == 39) {
				this.anIntArray543[local24] = (this.anIntArray543[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 10) {
				this.anIntArray542[local24] = (local36 << 7) + (this.anIntArray542[local24] & 0xFFFFC07F);
			}
			if (local30 == 42) {
				this.anIntArray542[local24] = local36 + (this.anIntArray542[local24] & 0xFFFFFF80);
			}
			if (local30 == 11) {
				this.anIntArray546[local24] = (local36 << 7) + (this.anIntArray546[local24] & 0xFFFFC07F);
			}
			if (local30 == 43) {
				this.anIntArray546[local24] = (this.anIntArray546[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 64) {
				if (local36 >= 64) {
					this.anIntArray544[local24] |= 0x1;
				} else {
					this.anIntArray544[local24] &= 0xFFFFFFFE;
				}
			}
			if (local30 == 65) {
				if (local36 < 64) {
					this.method8321(local24);
					this.anIntArray544[local24] &= 0xFFFFFFFD;
				} else {
					this.anIntArray544[local24] |= 0x2;
				}
			}
			if (local30 == 99) {
				this.anIntArray541[local24] = (local36 << 7) + (this.anIntArray541[local24] & 0x7F);
			}
			if (local30 == 98) {
				this.anIntArray541[local24] = local36 + (this.anIntArray541[local24] & 0x3F80);
			}
			if (local30 == 101) {
				this.anIntArray541[local24] = (local36 << 7) + (this.anIntArray541[local24] & 0x7F) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray541[local24] = (this.anIntArray541[local24] & 0x3F80) + local36 + 16384;
			}
			if (local30 == 120) {
				this.method8296(local24);
			}
			if (local30 == 121) {
				this.method8307(local24);
			}
			if (local30 == 123) {
				this.method8322(local24);
			}
			@Pc(496) int local496;
			if (local30 == 6) {
				local496 = this.anIntArray541[local24];
				if (local496 == 16384) {
					this.anIntArray537[local24] = (this.anIntArray537[local24] & 0xFFFFC07F) + (local36 << 7);
				}
			}
			if (local30 == 38) {
				local496 = this.anIntArray541[local24];
				if (local496 == 16384) {
					this.anIntArray537[local24] = (this.anIntArray537[local24] & 0xFFFFFF80) + local36;
				}
			}
			if (local30 == 16) {
				this.anIntArray535[local24] = (local36 << 7) + (this.anIntArray535[local24] & 0xFFFFC07F);
			}
			if (local30 == 48) {
				this.anIntArray535[local24] = local36 + (this.anIntArray535[local24] & 0xFFFFFF80);
			}
			if (local30 == 81) {
				if (local36 < 64) {
					this.method8323(local24);
					this.anIntArray544[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray544[local24] |= 0x4;
				}
			}
			if (local30 == 17) {
				this.method8325((this.anIntArray545[local24] & 0xFFFFC07F) + (local36 << 7), local24);
			}
			if (local30 == 49) {
				this.method8325((this.anIntArray545[local24] & 0xFFFFFF80) + local36, local24);
			}
		} else if (local9 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method8311(local30 + this.anIntArray540[local24], local24);
		} else if (local9 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method8301(local24, local30);
		} else if (local9 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FB8) >> 8);
			this.method8291(local30, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method8306(true);
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)V")
	private void method8301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZBZLclient!tp;)V")
	private synchronized void method8302(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class5_Sub49 arg2) {
		this.method8305(arg1);
		this.aClass226_1.method4995(arg2.aByteArray98);
		this.aLong246 = 0L;
		this.aBoolean694 = arg0;
		@Pc(30) int local30 = this.aClass226_1.method5006();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			this.aClass226_1.method5002(local32);
			this.aClass226_1.method5007(local32);
			this.aClass226_1.method4999(local32);
		}
		this.anInt9689 = this.aClass226_1.method4997();
		this.anInt9688 = this.aClass226_1.anIntArray309[this.anInt9689];
		this.aLong245 = this.aClass226_1.method4998(this.anInt9688);
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "()Lclient!aca;")
	@Override
	public synchronized Class5_Sub1 method8285() {
		return null;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIJZLclient!tp;)V")
	public synchronized void method8303(@OriginalArg(2) long arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) Class5_Sub49 arg2) {
		this.method8302(arg1, true, arg2);
		this.method8289((long) this.aClass226_1.anInt5651 * arg0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!tp;ZZ)V")
	public synchronized void method8304(@OriginalArg(0) Class5_Sub49 arg0, @OriginalArg(1) boolean arg1) {
		this.method8302(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
	private synchronized void method8305(@OriginalArg(1) boolean arg0) {
		this.aClass226_1.method5004();
		this.aClass5_Sub49_2 = null;
		this.method8306(arg0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZZ)V")
	private void method8306(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8296(-1);
		} else {
			this.method8322(-1);
		}
		this.method8307(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray536[local23] = this.lb[local23];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray540[local39] = this.lb[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8283(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass226_1.method4994()) {
			@Pc(18) int local18 = this.anInt9675 * this.aClass226_1.anInt5651 / Static491.anInt8290;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong246;
				if (this.aLong245 - local27 >= 0L) {
					this.aLong246 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong245 - this.aLong246 - 1L) / (long) local18);
				this.aLong246 += (long) local18 * (long) local58;
				this.aClass5_Sub1_Sub1_1.method8283(arg0, arg1, local58);
				this.method8313();
				arg1 += local58;
				arg2 -= local58;
			} while (this.aClass226_1.method4994());
		}
		this.aClass5_Sub1_Sub1_1.method8283(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(IB)V")
	private void method8307(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method8307(local12);
			}
			return;
		}
		this.anIntArray543[arg0] = 12800;
		this.anIntArray542[arg0] = 8192;
		this.anIntArray546[arg0] = 16383;
		this.anIntArray548[arg0] = 8192;
		this.anIntArray547[arg0] = 0;
		this.anIntArray538[arg0] = 8192;
		this.method8321(arg0);
		this.method8323(arg0);
		this.anIntArray544[arg0] = 0;
		this.anIntArray541[arg0] = 32767;
		this.anIntArray537[arg0] = 256;
		this.anIntArray535[arg0] = 0;
		this.method8325(8192, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "()I")
	@Override
	public synchronized int method8284() {
		return 0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!lr;ILclient!tp;Lclient!la;I)Z")
	public synchronized boolean method8308(@OriginalArg(0) Class219 arg0, @OriginalArg(2) Class5_Sub49 arg1, @OriginalArg(3) Class207 arg2) {
		arg1.method7997();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class5_Sub36 local26 = (Class5_Sub36) arg1.aClass273_42.method6577(); local26 != null; local26 = (Class5_Sub36) arg1.aClass273_42.method6589()) {
			@Pc(32) int local32 = (int) local26.aLong278;
			@Pc(40) Class5_Sub10 local40 = (Class5_Sub10) this.aClass273_43.method6581((long) local32);
			if (local40 == null) {
				local40 = Static150.method2217(local32, arg2);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass273_43.method6585((long) local32, local40);
			}
			if (!local40.method977(arg0, local20, local26.aByteArray63)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method7998();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public synchronized void method8309() {
		for (@Pc(7) Class5_Sub10 local7 = (Class5_Sub10) this.aClass273_43.method6577(); local7 != null; local7 = (Class5_Sub10) this.aClass273_43.method6589()) {
			local7.method9047();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!gfa;I)I")
	private int method8310(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(14) int local14 = (arg0.anInt3125 * arg0.anInt3148 >> 12) + arg0.anInt3130;
		local14 += this.anIntArray537[arg0.anInt3137] * (this.anIntArray548[arg0.anInt3137] - 8192) >> 12;
		@Pc(41) Class346 local41 = arg0.aClass346_1;
		@Pc(58) int local58;
		if (local41.anInt9573 > 0 && (local41.anInt9567 > 0 || this.anIntArray547[arg0.anInt3137] > 0)) {
			local58 = local41.anInt9567 << 2;
			@Pc(63) int local63 = local41.anInt9572 << 1;
			if (arg0.anInt3141 < local63) {
				local58 = local58 * arg0.anInt3141 / local63;
			}
			local58 += this.anIntArray547[arg0.anInt3137] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt3133 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local58 * local97);
		}
		local58 = (int) ((double) (arg0.aClass5_Sub37_Sub1_3.anInt8937 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static491.anInt8290 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBI)V")
	private void method8311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray536[arg1]) {
			this.anIntArray536[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass5_Sub23ArrayArray1[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8287(@OriginalArg(0) int arg0) {
		if (this.aClass226_1.method4994()) {
			@Pc(14) int local14 = this.aClass226_1.anInt5651 * this.anInt9675 / Static491.anInt8290;
			do {
				@Pc(23) long local23 = this.aLong246 + (long) local14 * (long) arg0;
				if (this.aLong245 - local23 >= 0L) {
					this.aLong246 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong245 + (long) local14 - this.aLong246 - 1L) / (long) local14);
				this.aLong246 += (long) local14 * (long) local53;
				this.aClass5_Sub1_Sub1_1.method8287(local53);
				arg0 -= local53;
				this.method8313();
			} while (this.aClass226_1.method4994());
		}
		this.aClass5_Sub1_Sub1_1.method8287(arg0);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V")
	private void method8313() {
		@Pc(8) int local8 = this.anInt9689;
		@Pc(11) int local11 = this.anInt9688;
		@Pc(14) long local14 = this.aLong245;
		if (this.aClass5_Sub49_2 != null && local11 == this.anInt9690) {
			this.method8302(this.aBoolean694, this.aBoolean695, this.aClass5_Sub49_2);
			this.method8313();
			return;
		}
		while (local11 == this.anInt9688) {
			while (local11 == this.aClass226_1.anIntArray309[local8]) {
				this.aClass226_1.method5002(local8);
				@Pc(43) int local43 = this.aClass226_1.method5009(local8);
				if (local43 == 1) {
					this.aClass226_1.method5005();
					this.aClass226_1.method4999(local8);
					if (this.aClass226_1.method5008()) {
						if (this.aClass5_Sub49_2 != null) {
							this.method8304(this.aClass5_Sub49_2, this.aBoolean694);
							this.method8313();
							return;
						}
						if (!this.aBoolean694 || local11 == 0) {
							this.method8306(true);
							this.aClass226_1.method5004();
							return;
						}
						this.aClass226_1.method5001(local14);
					}
					break;
				}
				if ((local43 & 0x80) != 0) {
					this.method8300(local43);
				}
				this.aClass226_1.method5007(local8);
				this.aClass226_1.method4999(local8);
			}
			local8 = this.aClass226_1.method4997();
			local11 = this.aClass226_1.anIntArray309[local8];
			local14 = this.aClass226_1.method4998(local11);
		}
		this.anInt9689 = local8;
		this.anInt9688 = local11;
		this.aLong245 = local14;
		if (this.aClass5_Sub49_2 != null && local11 > this.anInt9690) {
			this.anInt9688 = this.anInt9690;
			this.anInt9689 = -1;
			this.aLong245 = this.aClass226_1.method4998(this.anInt9688);
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(IBI)V")
	public synchronized void method8314(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray549[arg1] = arg0;
		} else {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.anIntArray549[local12] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIBLclient!gfa;[I)Z")
	public boolean method8315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub23 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt3144 = Static491.anInt8290 / 100;
		if (arg2.anInt3135 >= 0 && (arg2.aClass5_Sub1_Sub4_3 == null || arg2.aClass5_Sub1_Sub4_3.method7796())) {
			arg2.method2705();
			arg2.method9047();
			if (arg2.anInt3127 > 0 && arg2 == this.aClass5_Sub23ArrayArray1[arg2.anInt3137][arg2.anInt3127]) {
				this.aClass5_Sub23ArrayArray1[arg2.anInt3137][arg2.anInt3127] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg2.anInt3125;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray538[arg2.anInt3137] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg2.anInt3125 = local53;
		}
		arg2.aClass5_Sub1_Sub4_3.method7788(this.method8310(arg2));
		@Pc(93) Class346 local93 = arg2.aClass346_1;
		arg2.anInt3133 += local93.anInt9573;
		@Pc(102) boolean local102 = false;
		arg2.anInt3141++;
		@Pc(131) double local131 = (double) ((arg2.anInt3148 * arg2.anInt3125 >> 12) + (arg2.anInt3139 - 60 << 8)) * 5.086263020833333E-6D;
		if (local93.anInt9569 > 0) {
			if (local93.anInt9568 <= 0) {
				arg2.anInt3142 += 128;
			} else {
				arg2.anInt3142 += (int) (Math.pow(2.0D, (double) local93.anInt9568 * local131) * 128.0D + 0.5D);
			}
			if (local93.anInt9569 * arg2.anInt3142 >= 819200) {
				local102 = true;
			}
		}
		if (local93.aByteArray101 != null) {
			if (local93.anInt9570 <= 0) {
				arg2.anInt3134 += 128;
			} else {
				arg2.anInt3134 += (int) (Math.pow(2.0D, (double) local93.anInt9570 * local131) * 128.0D + 0.5D);
			}
			while (arg2.anInt3146 < local93.aByteArray101.length - 2 && (local93.aByteArray101[arg2.anInt3146 + 2] & 0xFF) << 8 < arg2.anInt3134) {
				arg2.anInt3146 += 2;
			}
			if (local93.aByteArray101.length - 2 == arg2.anInt3146 && local93.aByteArray101[arg2.anInt3146 + 1] == 0) {
				local102 = true;
			}
		}
		if (arg2.anInt3135 >= 0 && local93.aByteArray100 != null && (this.anIntArray544[arg2.anInt3137] & 0x1) == 0 && (arg2.anInt3127 < 0 || arg2 != this.aClass5_Sub23ArrayArray1[arg2.anInt3137][arg2.anInt3127])) {
			if (local93.anInt9566 <= 0) {
				arg2.anInt3135 += 128;
			} else {
				arg2.anInt3135 += (int) (Math.pow(2.0D, local131 * (double) local93.anInt9566) * 128.0D + 0.5D);
			}
			while (arg2.anInt3126 < local93.aByteArray100.length - 2 && arg2.anInt3135 > (local93.aByteArray100[arg2.anInt3126 + 2] & 0xFF) << 8) {
				arg2.anInt3126 += 2;
			}
			if (arg2.anInt3126 == local93.aByteArray100.length - 2) {
				local102 = true;
			}
		}
		if (!local102) {
			arg2.aClass5_Sub1_Sub4_3.method7787(arg2.anInt3144, this.method8292(arg2), this.method8297(arg2));
			return false;
		}
		arg2.aClass5_Sub1_Sub4_3.method7760(arg2.anInt3144);
		if (arg3 == null) {
			arg2.aClass5_Sub1_Sub4_3.method8287(arg1);
		} else {
			arg2.aClass5_Sub1_Sub4_3.method8283(arg3, arg0, arg1);
		}
		if (arg2.aClass5_Sub1_Sub4_3.method7768()) {
			this.aClass5_Sub1_Sub1_1.aClass5_Sub1_Sub2_2.method5055(arg2.aClass5_Sub1_Sub4_3);
		}
		arg2.method2705();
		if (arg2.anInt3135 >= 0) {
			arg2.method9047();
			if (arg2.anInt3127 > 0 && this.aClass5_Sub23ArrayArray1[arg2.anInt3137][arg2.anInt3127] == arg2) {
				this.aClass5_Sub23ArrayArray1[arg2.anInt3137][arg2.anInt3127] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(II)V")
	public synchronized void method8316(@OriginalArg(1) int arg0) {
		this.anInt9685 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIII)V")
	private void method8317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class5_Sub23 local12 = this.aClass5_Sub23ArrayArray2[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass5_Sub23ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray544[arg1] & 0x2) == 0) {
			local12.anInt3135 = 0;
			return;
		}
		for (@Pc(49) Class5_Sub23 local49 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7908(); local49 != null; local49 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7914()) {
			if (local12.anInt3137 == local49.anInt3137 && local49.anInt3135 < 0 && local49 != local12) {
				local12.anInt3135 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V")
	public synchronized void method8318() {
		this.method8305(true);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(IIII)V")
	private void method8319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method8317(64, arg2, arg1);
		if ((this.anIntArray544[arg2] & 0x2) != 0) {
			for (@Pc(25) Class5_Sub23 local25 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7913(); local25 != null; local25 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7915()) {
				if (local25.anInt3137 == arg2 && local25.anInt3135 < 0) {
					this.aClass5_Sub23ArrayArray2[arg2][local25.anInt3139] = null;
					this.aClass5_Sub23ArrayArray2[arg2][arg1] = local25;
					@Pc(67) int local67 = local25.anInt3130 + (local25.anInt3148 * local25.anInt3125 >> 12);
					local25.anInt3130 += arg1 - local25.anInt3139 << 8;
					local25.anInt3148 = local67 - local25.anInt3130;
					local25.anInt3125 = 4096;
					local25.anInt3139 = arg1;
					return;
				}
			}
		}
		@Pc(112) Class5_Sub10 local112 = (Class5_Sub10) this.aClass273_43.method6581((long) this.anIntArray536[arg2]);
		if (local112 == null) {
			return;
		}
		@Pc(120) Class5_Sub37_Sub1 local120 = local112.aClass5_Sub37_Sub1Array1[arg1];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class5_Sub23 local127 = new Class5_Sub23();
		local127.aClass5_Sub10_1 = local112;
		local127.aClass5_Sub37_Sub1_3 = local120;
		local127.anInt3137 = arg2;
		local127.aClass346_1 = local112.aClass346Array1[arg1];
		local127.anInt3127 = local112.aByteArray16[arg1];
		local127.anInt3139 = arg1;
		local127.anInt3147 = local112.aByteArray15[arg1] * arg0 * arg0 * local112.anInt1153 + 1024 >> 11;
		local127.anInt3149 = local112.aByteArray14[arg1] & 0xFF;
		local127.anInt3130 = (arg1 << 8) - (local112.aShortArray28[arg1] & 0x7FFF);
		local127.anInt3126 = 0;
		local127.anInt3135 = -1;
		local127.anInt3146 = 0;
		local127.anInt3142 = 0;
		local127.anInt3134 = 0;
		if (this.anIntArray535[arg2] == 0) {
			local127.aClass5_Sub1_Sub4_3 = Static654.method7784(local120, this.method8310(local127), this.method8292(local127), this.method8297(local127));
		} else {
			local127.aClass5_Sub1_Sub4_3 = Static654.method7784(local120, this.method8310(local127), 0, this.method8297(local127));
			this.method8293(local127, local112.aShortArray28[arg1] < 0);
		}
		if (local112.aShortArray28[arg1] < 0) {
			local127.aClass5_Sub1_Sub4_3.method7765(-1);
		}
		if (local127.anInt3127 >= 0) {
			@Pc(278) Class5_Sub23 local278 = this.aClass5_Sub23ArrayArray1[arg2][local127.anInt3127];
			if (local278 != null && local278.anInt3135 < 0) {
				this.aClass5_Sub23ArrayArray2[arg2][local278.anInt3139] = null;
				local278.anInt3135 = 0;
			}
			this.aClass5_Sub23ArrayArray1[arg2][local127.anInt3127] = local127;
		}
		this.aClass5_Sub1_Sub1_1.aClass330_15.method7917(local127);
		this.aClass5_Sub23ArrayArray2[arg2][arg1] = local127;
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)I")
	public int method8320() {
		return this.anInt9685;
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(II)V")
	private void method8321(@OriginalArg(1) int arg0) {
		if ((this.anIntArray544[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class5_Sub23 local15 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7908(); local15 != null; local15 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7914()) {
			if (local15.anInt3137 == arg0 && this.aClass5_Sub23ArrayArray2[arg0][local15.anInt3139] == null && local15.anInt3135 < 0) {
				local15.anInt3135 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)V")
	private void method8322(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class5_Sub23 local12 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7908(); local12 != null; local12 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7914()) {
			if ((arg0 < 0 || local12.anInt3137 == arg0) && local12.anInt3135 < 0) {
				this.aClass5_Sub23ArrayArray2[local12.anInt3137][local12.anInt3139] = null;
				local12.anInt3135 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(IB)V")
	private void method8323(@OriginalArg(0) int arg0) {
		if ((this.anIntArray544[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(28) Class5_Sub23 local28 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7908(); local28 != null; local28 = (Class5_Sub23) this.aClass5_Sub1_Sub1_1.aClass330_15.method7914()) {
			if (arg0 == local28.anInt3137) {
				local28.anInt3131 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!gfa;B)Z")
	public boolean method8324(@OriginalArg(0) Class5_Sub23 arg0) {
		if (arg0.aClass5_Sub1_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt3135 >= 0) {
			arg0.method9047();
			if (arg0.anInt3127 > 0 && arg0 == this.aClass5_Sub23ArrayArray1[arg0.anInt3137][arg0.anInt3127]) {
				this.aClass5_Sub23ArrayArray1[arg0.anInt3137][arg0.anInt3127] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)V")
	private void method8325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray545[arg1] = arg0;
		this.anIntArray539[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(III)V")
	private void method8326() {
		this.lb[9] = 128;
		this.anIntArray540[9] = 128;
		this.method8311(128, 9);
	}
}
