import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class6_Sub15_Sub3 extends Class6_Sub15 {

	@OriginalMember(owner = "client!so", name = "Eb", descriptor = "I")
	private int anInt8466;

	@OriginalMember(owner = "client!so", name = "Fb", descriptor = "J")
	private long aLong213;

	@OriginalMember(owner = "client!so", name = "Gb", descriptor = "Z")
	private boolean aBoolean545;

	@OriginalMember(owner = "client!so", name = "Hb", descriptor = "I")
	private int anInt8467;

	@OriginalMember(owner = "client!so", name = "Jb", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!so", name = "Kb", descriptor = "Z")
	private boolean aBoolean546;

	@OriginalMember(owner = "client!so", name = "Lb", descriptor = "Lclient!he;")
	private Class6_Sub19 aClass6_Sub19_1;

	@OriginalMember(owner = "client!so", name = "Mb", descriptor = "I")
	private int anInt8468;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "[I")
	private final int[] anIntArray586 = new int[16];

	@OriginalMember(owner = "client!so", name = "r", descriptor = "[I")
	private final int[] anIntArray584 = new int[16];

	@OriginalMember(owner = "client!so", name = "z", descriptor = "[I")
	private final int[] anIntArray588 = new int[16];

	@OriginalMember(owner = "client!so", name = "u", descriptor = "[[Lclient!gi;")
	private final Class6_Sub18[][] aClass6_Sub18ArrayArray1 = new Class6_Sub18[16][128];

	@OriginalMember(owner = "client!so", name = "D", descriptor = "[I")
	private final int[] anIntArray590 = new int[16];

	@OriginalMember(owner = "client!so", name = "Z", descriptor = "[I")
	private final int[] anIntArray594 = new int[16];

	@OriginalMember(owner = "client!so", name = "L", descriptor = "[I")
	private final int[] anIntArray592 = new int[16];

	@OriginalMember(owner = "client!so", name = "B", descriptor = "[I")
	public final int[] anIntArray589 = new int[16];

	@OriginalMember(owner = "client!so", name = "O", descriptor = "I")
	private int anInt8436 = 256;

	@OriginalMember(owner = "client!so", name = "S", descriptor = "[I")
	private final int[] anIntArray593 = new int[16];

	@OriginalMember(owner = "client!so", name = "hb", descriptor = "[I")
	private final int[] anIntArray597 = new int[16];

	@OriginalMember(owner = "client!so", name = "s", descriptor = "[I")
	public final int[] anIntArray585 = new int[16];

	@OriginalMember(owner = "client!so", name = "y", descriptor = "[I")
	private final int[] anIntArray587 = new int[16];

	@OriginalMember(owner = "client!so", name = "mb", descriptor = "[[Lclient!gi;")
	private final Class6_Sub18[][] aClass6_Sub18ArrayArray2 = new Class6_Sub18[16][128];

	@OriginalMember(owner = "client!so", name = "eb", descriptor = "[I")
	private final int[] anIntArray595 = new int[16];

	@OriginalMember(owner = "client!so", name = "fb", descriptor = "[I")
	private final int[] anIntArray596 = new int[16];

	@OriginalMember(owner = "client!so", name = "G", descriptor = "[I")
	private final int[] anIntArray591 = new int[16];

	@OriginalMember(owner = "client!so", name = "Ab", descriptor = "[I")
	public final int[] anIntArray598 = new int[16];

	@OriginalMember(owner = "client!so", name = "Cb", descriptor = "[I")
	private final int[] anIntArray599 = new int[16];

	@OriginalMember(owner = "client!so", name = "tb", descriptor = "I")
	private final int anInt8458 = 1000000;

	@OriginalMember(owner = "client!so", name = "X", descriptor = "Lclient!uda;")
	private final Class318 aClass318_1 = new Class318();

	@OriginalMember(owner = "client!so", name = "Ib", descriptor = "Lclient!wu;")
	private final Class6_Sub15_Sub4 aClass6_Sub15_Sub4_1 = new Class6_Sub15_Sub4(this);

	@OriginalMember(owner = "client!so", name = "Q", descriptor = "Lclient!oj;")
	private final Class234 aClass234_41 = new Class234(128);

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class6_Sub15_Sub3() {
		this.method6667();
		this.method6643(true);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	private void method6636(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6669(local16, local28, local22);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method6653(local16, local22, local28);
			} else {
				this.method6669(local16, 64, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6659(local28, local22, local16);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray591[local16] = (this.anIntArray591[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray591[local16] = (this.anIntArray591[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray595[local16] = (local28 << 7) + (this.anIntArray595[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray595[local16] = local28 + (this.anIntArray595[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray599[local16] = (local28 << 7) + (this.anIntArray599[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray599[local16] = (this.anIntArray599[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray593[local16] = (local28 << 7) + (this.anIntArray593[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray593[local16] = local28 + (this.anIntArray593[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray586[local16] = (this.anIntArray586[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray586[local16] = (this.anIntArray586[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray584[local16] = (local28 << 7) + (this.anIntArray584[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray584[local16] = (this.anIntArray584[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray598[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray598[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray598[local16] |= 0x2;
				} else {
					this.method6661(local16);
					this.anIntArray598[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray590[local16] = (local28 << 7) + (this.anIntArray590[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray590[local16] = (this.anIntArray590[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray590[local16] = (this.anIntArray590[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray590[local16] = local28 + (this.anIntArray590[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method6650(local16);
			}
			if (local22 == 121) {
				this.method6641(local16);
			}
			if (local22 == 123) {
				this.method6638(local16);
			}
			@Pc(500) int local500;
			if (local22 == 6) {
				local500 = this.anIntArray590[local16];
				if (local500 == 16384) {
					this.anIntArray597[local16] = (this.anIntArray597[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local500 = this.anIntArray590[local16];
				if (local500 == 16384) {
					this.anIntArray597[local16] = local28 + (this.anIntArray597[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray589[local16] = (local28 << 7) + (this.anIntArray589[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray589[local16] = (this.anIntArray589[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray598[local16] |= 0x4;
				} else {
					this.method6645(local16);
					this.anIntArray598[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method6649(local16, (this.anIntArray587[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method6649(local16, local28 + (this.anIntArray587[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6654(local16, this.anIntArray591[local16] + local22);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6657(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F1E) >> 8);
			this.method6662(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method6643(true);
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!pj;Lclient!me;BILclient!he;)Z")
	public synchronized boolean method6637(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(4) Class6_Sub19 arg2) {
		arg2.method3276();
		@Pc(9) boolean local9 = true;
		@Pc(29) int[] local29 = new int[] { 22050 };
		for (@Pc(35) Class6_Sub8 local35 = (Class6_Sub8) arg2.aClass234_27.method5469(); local35 != null; local35 = (Class6_Sub8) arg2.aClass234_27.method5465()) {
			@Pc(41) int local41 = (int) local35.aLong245;
			@Pc(49) Class6_Sub40 local49 = (Class6_Sub40) this.aClass234_41.method5464((long) local41);
			if (local49 == null) {
				local49 = Static297.method4511(local41, arg0);
				if (local49 == null) {
					local9 = false;
					continue;
				}
				this.aClass234_41.method5466((long) local41, local49);
			}
			if (!local49.method5898(local29, arg1, local35.aByteArray3)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method3275();
		}
		return local9;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(II)V")
	private void method6638(@OriginalArg(0) int arg0) {
		for (@Pc(17) Class6_Sub18 local17 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6809(); local17 != null; local17 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6821()) {
			if ((arg0 < 0 || local17.anInt3178 == arg0) && local17.anInt3164 < 0) {
				this.aClass6_Sub18ArrayArray1[local17.anInt3178][local17.anInt3166] = null;
				local17.anInt3164 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!gi;IZ)V")
	public void method6640(@OriginalArg(0) Class6_Sub18 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = arg0.aClass6_Sub6_Sub1_1.aByteArray99.length;
		@Pc(45) int local45;
		if (arg1 && arg0.aClass6_Sub6_Sub1_1.aBoolean507) {
			@Pc(32) int local32 = local17 + local17 - arg0.aClass6_Sub6_Sub1_1.anInt7693;
			local45 = (int) ((long) this.anIntArray589[arg0.anInt3178] * (long) local32 >> 6);
			local17 <<= 0x8;
			if (local17 <= local45) {
				local45 = local17 + local17 - local45 - 1;
				arg0.aClass6_Sub15_Sub2_1.method3861();
			}
		} else {
			local45 = (int) ((long) this.anIntArray589[arg0.anInt3178] * (long) local17 >> 6);
		}
		arg0.aClass6_Sub15_Sub2_1.method3864(local45);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)V")
	private void method6641(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method6641(local12);
			}
			return;
		}
		this.anIntArray593[arg0] = 12800;
		this.anIntArray586[arg0] = 8192;
		this.anIntArray584[arg0] = 16383;
		this.anIntArray596[arg0] = 8192;
		this.anIntArray595[arg0] = 0;
		this.anIntArray599[arg0] = 8192;
		this.method6661(arg0);
		this.method6645(arg0);
		this.anIntArray598[arg0] = 0;
		this.anIntArray590[arg0] = 32767;
		this.anIntArray597[arg0] = 256;
		this.anIntArray589[arg0] = 0;
		this.method6649(arg0, 8192);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZZZLclient!he;)V")
	private synchronized void method6642(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class6_Sub19 arg2) {
		this.method6655(arg1);
		this.aClass318_1.method7105(arg2.aByteArray43);
		this.aBoolean545 = arg0;
		this.aLong214 = 0L;
		@Pc(29) int local29 = this.aClass318_1.method7104();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass318_1.method7106(local31);
			this.aClass318_1.method7095(local31);
			this.aClass318_1.method7108(local31);
		}
		this.anInt8467 = this.aClass318_1.method7103();
		this.anInt8466 = this.aClass318_1.anIntArray633[this.anInt8467];
		this.aLong213 = this.aClass318_1.method7107(this.anInt8466);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZB)V")
	private void method6643(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6650(-1);
		} else {
			this.method6638(-1);
		}
		this.method6641(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray594[local23] = this.anIntArray588[local23];
		}
		for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
			this.anIntArray591[local48] = this.anIntArray588[local48] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(II)V")
	public synchronized void method6644(@OriginalArg(0) int arg0) {
		this.anInt8436 = arg0;
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(II)V")
	private void method6645(@OriginalArg(1) int arg0) {
		if ((this.anIntArray598[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class6_Sub18 local18 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6809(); local18 != null; local18 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6821()) {
			if (arg0 == local18.anInt3178) {
				local18.anInt3169 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
	public synchronized void method6646() {
		for (@Pc(9) Class6_Sub40 local9 = (Class6_Sub40) this.aClass234_41.method5469(); local9 != null; local9 = (Class6_Sub40) this.aClass234_41.method5465()) {
			local9.method7948();
		}
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "()Lclient!vw;")
	@Override
	public synchronized Class6_Sub15 method7937() {
		return null;
	}

	@OriginalMember(owner = "client!so", name = "f", descriptor = "(I)Z")
	public synchronized boolean method6647() {
		return this.aClass318_1.method7100();
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(III)V")
	public synchronized void method6648() {
		this.method6673();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZII)V")
	private void method6649(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray587[arg0] = arg1;
		this.anIntArray585[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7939(@OriginalArg(0) int arg0) {
		if (this.aClass318_1.method7100()) {
			@Pc(18) int local18 = this.anInt8458 * this.aClass318_1.anInt8901 / Static313.anInt6055;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong214;
				if (this.aLong213 - local27 >= 0L) {
					this.aLong214 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong213 + (long) local18 - this.aLong214 - 1L) / (long) local18);
				this.aLong214 += (long) local57 * (long) local18;
				this.aClass6_Sub15_Sub4_1.method7939(local57);
				arg0 -= local57;
				this.method6652();
			} while (this.aClass318_1.method7100());
		}
		this.aClass6_Sub15_Sub4_1.method7939(arg0);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(BI)V")
	private void method6650(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class6_Sub18 local12 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6809(); local12 != null; local12 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6821()) {
			if (arg0 < 0 || arg0 == local12.anInt3178) {
				if (local12.aClass6_Sub15_Sub2_1 != null) {
					local12.aClass6_Sub15_Sub2_1.method3850(Static313.anInt6055 / 100);
					if (local12.aClass6_Sub15_Sub2_1.method3859()) {
						this.aClass6_Sub15_Sub4_1.aClass6_Sub15_Sub1_2.method2422(local12.aClass6_Sub15_Sub2_1);
					}
					local12.method2722();
				}
				if (local12.anInt3164 < 0) {
					this.aClass6_Sub18ArrayArray1[local12.anInt3178][local12.anInt3166] = null;
				}
				local12.method7948();
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "h", descriptor = "(I)V")
	private void method6652() {
		@Pc(12) int local12 = this.anInt8467;
		@Pc(15) int local15 = this.anInt8466;
		@Pc(18) long local18 = this.aLong213;
		if (this.aClass6_Sub19_1 != null && this.anInt8468 == local15) {
			this.method6642(this.aBoolean545, this.aBoolean546, this.aClass6_Sub19_1);
			this.method6652();
			return;
		}
		while (this.anInt8466 == local15) {
			while (local15 == this.aClass318_1.anIntArray633[local12]) {
				this.aClass318_1.method7106(local12);
				@Pc(51) int local51 = this.aClass318_1.method7097(local12);
				if (local51 == 1) {
					this.aClass318_1.method7101();
					this.aClass318_1.method7108(local12);
					if (this.aClass318_1.method7098()) {
						if (this.aClass6_Sub19_1 != null) {
							this.method6665(this.aClass6_Sub19_1, this.aBoolean545);
							this.method6652();
							return;
						}
						if (!this.aBoolean545 || local15 == 0) {
							this.method6643(true);
							this.aClass318_1.method7102();
							return;
						}
						this.aClass318_1.method7096(local18);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method6636(local51);
				}
				this.aClass318_1.method7095(local12);
				this.aClass318_1.method7108(local12);
			}
			local12 = this.aClass318_1.method7103();
			local15 = this.aClass318_1.anIntArray633[local12];
			local18 = this.aClass318_1.method7107(local15);
		}
		this.anInt8467 = local12;
		this.aLong213 = local18;
		this.anInt8466 = local15;
		if (this.aClass6_Sub19_1 != null && this.anInt8468 < local15) {
			this.anInt8466 = this.anInt8468;
			this.anInt8467 = -1;
			this.aLong213 = this.aClass318_1.method7107(this.anInt8466);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIII)V")
	private void method6653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6669(arg0, 64, arg1);
		if ((this.anIntArray598[arg0] & 0x2) != 0) {
			for (@Pc(30) Class6_Sub18 local30 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6823(); local30 != null; local30 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6820()) {
				if (arg0 == local30.anInt3178 && local30.anInt3164 < 0) {
					this.aClass6_Sub18ArrayArray1[arg0][local30.anInt3166] = null;
					this.aClass6_Sub18ArrayArray1[arg0][arg1] = local30;
					@Pc(68) int local68 = (local30.anInt3182 * local30.anInt3171 >> 12) + local30.anInt3174;
					local30.anInt3174 += arg1 - local30.anInt3166 << 8;
					local30.anInt3166 = arg1;
					local30.anInt3171 = 4096;
					local30.anInt3182 = local68 - local30.anInt3174;
					return;
				}
			}
		}
		@Pc(114) Class6_Sub40 local114 = (Class6_Sub40) this.aClass234_41.method5464((long) this.anIntArray594[arg0]);
		if (local114 == null) {
			return;
		}
		@Pc(122) Class6_Sub6_Sub1 local122 = local114.aClass6_Sub6_Sub1Array1[arg1];
		if (local122 == null) {
			return;
		}
		@Pc(129) Class6_Sub18 local129 = new Class6_Sub18();
		local129.aClass6_Sub6_Sub1_1 = local122;
		local129.anInt3178 = arg0;
		local129.aClass6_Sub40_1 = local114;
		local129.aClass156_1 = local114.aClass156Array1[arg1];
		local129.anInt3175 = local114.aByteArray91[arg1];
		local129.anInt3166 = arg1;
		local129.anInt3173 = arg2 * arg2 * local114.anInt7386 * local114.aByteArray93[arg1] + 1024 >> 11;
		local129.anInt3165 = local114.aByteArray92[arg1] & 0xFF;
		local129.anInt3174 = (arg1 << 8) - (local114.aShortArray121[arg1] & 0x7FFF);
		local129.anInt3180 = 0;
		local129.anInt3163 = 0;
		local129.anInt3177 = 0;
		local129.anInt3164 = -1;
		local129.anInt3172 = 0;
		if (this.anIntArray589[arg0] == 0) {
			local129.aClass6_Sub15_Sub2_1 = Static591.method3860(local122, this.method6672(local129), this.method6663(local129), this.method6670(local129));
		} else {
			local129.aClass6_Sub15_Sub2_1 = Static591.method3860(local122, this.method6672(local129), 0, this.method6670(local129));
			this.method6640(local129, local114.aShortArray121[arg1] < 0);
		}
		if (local114.aShortArray121[arg1] < 0) {
			local129.aClass6_Sub15_Sub2_1.method3880(-1);
		}
		if (local129.anInt3175 >= 0) {
			@Pc(291) Class6_Sub18 local291 = this.aClass6_Sub18ArrayArray2[arg0][local129.anInt3175];
			if (local291 != null && local291.anInt3164 < 0) {
				this.aClass6_Sub18ArrayArray1[arg0][local291.anInt3166] = null;
				local291.anInt3164 = 0;
			}
			this.aClass6_Sub18ArrayArray2[arg0][local129.anInt3175] = local129;
		}
		this.aClass6_Sub15_Sub4_1.aClass298_206.method6812(local129);
		this.aClass6_Sub18ArrayArray1[arg0][arg1] = local129;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(III)V")
	private void method6654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray594[arg0] != arg1) {
			this.anIntArray594[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass6_Sub18ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)V")
	private synchronized void method6655(@OriginalArg(1) boolean arg0) {
		this.aClass318_1.method7102();
		this.aClass6_Sub19_1 = null;
		this.method6643(arg0);
	}

	@OriginalMember(owner = "client!so", name = "i", descriptor = "(I)V")
	public synchronized void method6656() {
		this.method6655(true);
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(III)V")
	private void method6657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!so", name = "j", descriptor = "(I)V")
	public synchronized void method6658() {
		for (@Pc(18) Class6_Sub40 local18 = (Class6_Sub40) this.aClass234_41.method5469(); local18 != null; local18 = (Class6_Sub40) this.aClass234_41.method5465()) {
			local18.method5899();
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IIII)V")
	private void method6659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!so", name = "k", descriptor = "(I)I")
	public int method6660() {
		return this.anInt8436;
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(II)V")
	private void method6661(@OriginalArg(1) int arg0) {
		if ((this.anIntArray598[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class6_Sub18 local19 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6809(); local19 != null; local19 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6821()) {
			if (arg0 == local19.anInt3178 && this.aClass6_Sub18ArrayArray1[arg0][local19.anInt3166] == null && local19.anInt3164 < 0) {
				local19.anInt3164 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(III)V")
	private void method6662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray596[arg1] = arg0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!gi;B)I")
	private int method6663(@OriginalArg(0) Class6_Sub18 arg0) {
		if (this.anIntArray592[arg0.anInt3178] == 0) {
			return 0;
		}
		@Pc(24) Class156 local24 = arg0.aClass156_1;
		@Pc(40) int local40 = this.anIntArray584[arg0.anInt3178] * this.anIntArray593[arg0.anInt3178] + 4096 >> 13;
		@Pc(48) int local48 = local40 * local40 + 16384 >> 15;
		@Pc(57) int local57 = local48 * arg0.anInt3173 + 16384 >> 15;
		@Pc(66) int local66 = local57 * this.anInt8436 + 128 >> 8;
		local40 = this.anIntArray592[arg0.anInt3178] * local66 + 128 >> 8;
		if (local24.anInt4563 > 0) {
			local40 = (int) (Math.pow(0.5D, (double) arg0.anInt3177 * 1.953125E-5D * (double) local24.anInt4563) * (double) local40 + 0.5D);
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		@Pc(135) int local135;
		@Pc(147) int local147;
		if (local24.aByteArray61 != null) {
			local105 = arg0.anInt3163;
			local113 = local24.aByteArray61[arg0.anInt3172 + 1];
			if (arg0.anInt3172 < local24.aByteArray61.length - 2) {
				local135 = (local24.aByteArray61[arg0.anInt3172] & 0xFF) << 8;
				local147 = (local24.aByteArray61[arg0.anInt3172 + 2] & 0xFF) << 8;
				local113 += (local105 - local135) * (-local113 + local24.aByteArray61[arg0.anInt3172 + 3]) / (local147 - local135);
			}
			local40 = local40 * local113 + 32 >> 6;
		}
		if (arg0.anInt3164 > 0 && local24.aByteArray60 != null) {
			local105 = arg0.anInt3164;
			local113 = local24.aByteArray60[arg0.anInt3180 + 1];
			if (local24.aByteArray60.length - 2 > arg0.anInt3180) {
				local135 = (local24.aByteArray60[arg0.anInt3180] & 0xFF) << 8;
				local147 = (local24.aByteArray60[arg0.anInt3180 + 2] & 0xFF) << 8;
				local113 += (local105 - local135) * (-local113 + local24.aByteArray60[arg0.anInt3180 - -3]) / (local147 - local135);
			}
			local40 = local40 * local113 + 32 >> 6;
		}
		return local40;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!he;ZB)V")
	public synchronized void method6665(@OriginalArg(0) Class6_Sub19 arg0, @OriginalArg(1) boolean arg1) {
		this.method6642(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass318_1.method7100()) {
			@Pc(18) int local18 = this.aClass318_1.anInt8901 * this.anInt8458 / Static313.anInt6055;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong214;
				if (this.aLong213 - local27 >= 0L) {
					this.aLong214 = local27;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local18 + this.aLong213 - this.aLong214 - 1L) / (long) local18);
				this.aLong214 += (long) local18 * (long) local55;
				this.aClass6_Sub15_Sub4_1.method7933(arg0, arg1, local55);
				this.method6652();
				arg2 -= local55;
				arg1 += local55;
			} while (this.aClass318_1.method7100());
		}
		this.aClass6_Sub15_Sub4_1.method7933(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIB)V")
	private synchronized void method6667() {
		for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
			this.anIntArray592[local14] = 256;
		}
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(IIII)V")
	private void method6669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class6_Sub18 local20 = this.aClass6_Sub18ArrayArray1[arg0][arg2];
		if (local20 == null) {
			return;
		}
		this.aClass6_Sub18ArrayArray1[arg0][arg2] = null;
		if ((this.anIntArray598[arg0] & 0x2) == 0) {
			local20.anInt3164 = 0;
			return;
		}
		for (@Pc(47) Class6_Sub18 local47 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6809(); local47 != null; local47 = (Class6_Sub18) this.aClass6_Sub15_Sub4_1.aClass298_206.method6821()) {
			if (local47.anInt3178 == local20.anInt3178 && local47.anInt3164 < 0 && local47 != local20) {
				local20.anInt3164 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLclient!gi;)I")
	private int method6670(@OriginalArg(1) Class6_Sub18 arg0) {
		@Pc(16) int local16 = this.anIntArray586[arg0.anInt3178];
		return local16 < 8192 ? local16 * arg0.anInt3165 + 32 >> 6 : 16384 - ((128 - arg0.anInt3165) * (16384 - local16) + 32 >> 6);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Lclient!gi;B)Z")
	public boolean method6671(@OriginalArg(0) Class6_Sub18 arg0) {
		if (arg0.aClass6_Sub15_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt3164 >= 0) {
			arg0.method7948();
			if (arg0.anInt3175 > 0 && arg0 == this.aClass6_Sub18ArrayArray2[arg0.anInt3178][arg0.anInt3175]) {
				this.aClass6_Sub18ArrayArray2[arg0.anInt3178][arg0.anInt3175] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!gi;)I")
	private int method6672(@OriginalArg(1) Class6_Sub18 arg0) {
		@Pc(22) int local22 = (arg0.anInt3171 * arg0.anInt3182 >> 12) + arg0.anInt3174;
		local22 += (this.anIntArray596[arg0.anInt3178] - 8192) * this.anIntArray597[arg0.anInt3178] >> 12;
		@Pc(43) Class156 local43 = arg0.aClass156_1;
		@Pc(63) int local63;
		if (local43.anInt4565 > 0 && (local43.anInt4564 > 0 || this.anIntArray595[arg0.anInt3178] > 0)) {
			local63 = local43.anInt4564 << 2;
			@Pc(68) int local68 = local43.anInt4567 << 1;
			if (local68 > arg0.anInt3183) {
				local63 = arg0.anInt3183 * local63 / local68;
			}
			local63 += this.anIntArray595[arg0.anInt3178] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt3167 & 0x1FF) * 0.01227184630308513D);
			local22 += (int) (local102 * (double) local63);
		}
		local63 = (int) ((double) (arg0.aClass6_Sub6_Sub1_1.anInt7691 * 256) * Math.pow(2.0D, (double) local22 * 3.255208333333333E-4D) / (double) Static313.anInt6055 + 0.5D);
		return local63 < 1 ? 1 : local63;
	}

	@OriginalMember(owner = "client!so", name = "f", descriptor = "(III)V")
	private void method6673() {
		this.anIntArray588[9] = 128;
		this.anIntArray591[9] = 128;
		this.method6654(9, 128);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!gi;I[IB)Z")
	public boolean method6674(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg1.anInt3170 = Static313.anInt6055 / 100;
		if (arg1.anInt3164 >= 0 && (arg1.aClass6_Sub15_Sub2_1 == null || arg1.aClass6_Sub15_Sub2_1.method3849())) {
			arg1.method2722();
			arg1.method7948();
			if (arg1.anInt3175 > 0 && this.aClass6_Sub18ArrayArray2[arg1.anInt3178][arg1.anInt3175] == arg1) {
				this.aClass6_Sub18ArrayArray2[arg1.anInt3178][arg1.anInt3175] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg1.anInt3171;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray599[arg1.anInt3178] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg1.anInt3171 = local59;
		}
		arg1.aClass6_Sub15_Sub2_1.method3856(this.method6672(arg1));
		@Pc(102) Class156 local102 = arg1.aClass156_1;
		@Pc(104) boolean local104 = false;
		arg1.anInt3167 += local102.anInt4565;
		arg1.anInt3183++;
		@Pc(135) double local135 = (double) ((arg1.anInt3166 - 60 << 8) + (arg1.anInt3182 * arg1.anInt3171 >> 12)) * 5.086263020833333E-6D;
		if (local102.anInt4563 > 0) {
			if (local102.anInt4569 <= 0) {
				arg1.anInt3177 += 128;
			} else {
				arg1.anInt3177 += (int) (Math.pow(2.0D, local135 * (double) local102.anInt4569) * 128.0D + 0.5D);
			}
			if (local102.anInt4563 * arg1.anInt3177 >= 819200) {
				local104 = true;
			}
		}
		if (local102.aByteArray61 != null) {
			if (local102.anInt4568 <= 0) {
				arg1.anInt3163 += 128;
			} else {
				arg1.anInt3163 += (int) (Math.pow(2.0D, (double) local102.anInt4568 * local135) * 128.0D + 0.5D);
			}
			while (arg1.anInt3172 < local102.aByteArray61.length - 2 && (local102.aByteArray61[arg1.anInt3172 + 2] & 0xFF) << 8 < arg1.anInt3163) {
				arg1.anInt3172 += 2;
			}
			if (local102.aByteArray61.length - 2 == arg1.anInt3172 && local102.aByteArray61[arg1.anInt3172 + 1] == 0) {
				local104 = true;
			}
		}
		if (arg1.anInt3164 >= 0 && local102.aByteArray60 != null && (this.anIntArray598[arg1.anInt3178] & 0x1) == 0 && (arg1.anInt3175 < 0 || arg1 != this.aClass6_Sub18ArrayArray2[arg1.anInt3178][arg1.anInt3175])) {
			if (local102.anInt4566 > 0) {
				arg1.anInt3164 += (int) (Math.pow(2.0D, local135 * (double) local102.anInt4566) * 128.0D + 0.5D);
			} else {
				arg1.anInt3164 += 128;
			}
			while (arg1.anInt3180 < local102.aByteArray60.length - 2 && (local102.aByteArray60[arg1.anInt3180 + 2] & 0xFF) << 8 < arg1.anInt3164) {
				arg1.anInt3180 += 2;
			}
			if (arg1.anInt3180 == local102.aByteArray60.length - 2) {
				local104 = true;
			}
		}
		if (!local104) {
			arg1.aClass6_Sub15_Sub2_1.method3865(arg1.anInt3170, this.method6663(arg1), this.method6670(arg1));
			return false;
		}
		arg1.aClass6_Sub15_Sub2_1.method3850(arg1.anInt3170);
		if (arg3 == null) {
			arg1.aClass6_Sub15_Sub2_1.method7939(arg2);
		} else {
			arg1.aClass6_Sub15_Sub2_1.method7933(arg3, arg0, arg2);
		}
		if (arg1.aClass6_Sub15_Sub2_1.method3859()) {
			this.aClass6_Sub15_Sub4_1.aClass6_Sub15_Sub1_2.method2422(arg1.aClass6_Sub15_Sub2_1);
		}
		arg1.method2722();
		if (arg1.anInt3164 >= 0) {
			arg1.method7948();
			if (arg1.anInt3175 > 0 && this.aClass6_Sub18ArrayArray2[arg1.anInt3178][arg1.anInt3175] == arg1) {
				this.aClass6_Sub18ArrayArray2[arg1.anInt3178][arg1.anInt3175] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "()I")
	@Override
	public synchronized int method7935() {
		return 0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "()Lclient!vw;")
	@Override
	public synchronized Class6_Sub15 method7934() {
		return this.aClass6_Sub15_Sub4_1;
	}
}
