import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class193_Sub1 extends Class193 {

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "Lclient!to;")
	private Class232 aClass232_2;

	@OriginalMember(owner = "client!qg", name = "J", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!qg", name = "N", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
	private int anInt5741 = 0;

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "Lclient!qo;")
	private final Class196 aClass196_33 = new Class196(16);

	@OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
	private int anInt5753 = 0;

	@OriginalMember(owner = "client!qg", name = "Q", descriptor = "Lclient!vr;")
	private final Class258 aClass258_39 = new Class258();

	@OriginalMember(owner = "client!qg", name = "S", descriptor = "J")
	private long aLong172 = 0L;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	private final int anInt5745;

	@OriginalMember(owner = "client!qg", name = "L", descriptor = "Lclient!ht;")
	private final Class113 aClass113_5;

	@OriginalMember(owner = "client!qg", name = "O", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!qg", name = "P", descriptor = "Lclient!vr;")
	private Class258 aClass258_38;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
	private final int anInt5738;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Lclient!tc;")
	private final Class227 aClass227_3;

	@OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
	private final int anInt5752;

	@OriginalMember(owner = "client!qg", name = "R", descriptor = "Z")
	private final boolean aBoolean384;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!iu;")
	private final Class125 aClass125_2;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Lclient!ht;")
	private final Class113 aClass113_4;

	@OriginalMember(owner = "client!qg", name = "I", descriptor = "Lclient!tt;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_1;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILclient!ht;Lclient!ht;Lclient!iu;Lclient!tc;IIZ)V")
	public Class193_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) Class125 arg3, @OriginalArg(4) Class227 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5745 = arg0;
		this.aClass113_5 = arg1;
		if (this.aClass113_5 == null) {
			this.aBoolean383 = false;
		} else {
			this.aBoolean383 = true;
			this.aClass258_38 = new Class258();
		}
		this.anInt5738 = arg6;
		this.aClass227_3 = arg4;
		this.anInt5752 = arg5;
		this.aBoolean384 = arg7;
		this.aClass125_2 = arg3;
		this.aClass113_4 = arg2;
		if (this.aClass113_4 != null) {
			this.aClass4_Sub1_Sub3_1 = this.aClass227_3.method5114(this.anInt5745, this.aClass113_4);
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)V")
	@Override
	public void method4424(@OriginalArg(0) int arg0) {
		if (this.aClass113_5 == null) {
			return;
		}
		for (@Pc(14) Class4 local14 = this.aClass258_39.method5538(); local14 != null; local14 = this.aClass258_39.method5528()) {
			if (local14.aLong225 == (long) arg0) {
				return;
			}
		}
		@Pc(34) Class4 local34 = new Class4();
		local34.aLong225 = arg0;
		this.aClass258_39.method5526(local34);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Lclient!to;")
	@Override
	public Class232 method4422() {
		if (this.aClass232_2 != null) {
			return this.aClass232_2;
		}
		if (this.aClass4_Sub1_Sub3_1 == null) {
			if (this.aClass125_2.method2613()) {
				return null;
			}
			this.aClass4_Sub1_Sub3_1 = this.aClass125_2.method2612(true, 255, (byte) 0, this.anInt5745);
		}
		if (this.aClass4_Sub1_Sub3_1.aBoolean330) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass4_Sub1_Sub3_1.method3403();
		if (this.aClass4_Sub1_Sub3_1 instanceof Class4_Sub1_Sub3_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass232_2 = new Class232(local43, this.anInt5752);
				if (this.aClass232_2.anInt6725 != this.anInt5738) {
					throw new RuntimeException();
				}
			} catch (@Pc(133) RuntimeException local133) {
				this.aClass232_2 = null;
				if (this.aClass125_2.method2613()) {
					this.aClass4_Sub1_Sub3_1 = null;
				} else {
					this.aClass4_Sub1_Sub3_1 = this.aClass125_2.method2612(true, 255, (byte) 0, this.anInt5745);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass232_2 = new Class232(local43, this.anInt5752);
			} catch (@Pc(63) RuntimeException local63) {
				this.aClass125_2.method2603();
				this.aClass232_2 = null;
				if (this.aClass125_2.method2613()) {
					this.aClass4_Sub1_Sub3_1 = null;
				} else {
					this.aClass4_Sub1_Sub3_1 = this.aClass125_2.method2612(true, 255, (byte) 0, this.anInt5745);
				}
				return null;
			}
			if (this.aClass113_4 != null) {
				this.aClass227_3.method5112(local43, this.aClass113_4, this.anInt5745);
			}
		}
		this.aClass4_Sub1_Sub3_1 = null;
		if (this.aClass113_5 != null) {
			this.aByteArray66 = new byte[this.aClass232_2.anInt6729];
			this.anInt5741 = 0;
		}
		return this.aClass232_2;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I")
	public int method4429() {
		if (this.aClass232_2 == null) {
			return 0;
		} else if (this.aBoolean383) {
			@Pc(28) Class4 local28 = this.aClass258_38.method5538();
			return local28 == null ? 0 : (int) local28.aLong225;
		} else {
			return this.aClass232_2.anInt6721;
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)I")
	public int method4430() {
		return this.anInt5741;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)I")
	public int method4431() {
		if (this.method4422() == null) {
			return this.aClass4_Sub1_Sub3_1 == null ? 0 : this.aClass4_Sub1_Sub3_1.method3404();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)[B")
	@Override
	public byte[] method4425(@OriginalArg(1) int arg0) {
		@Pc(18) Class4_Sub1_Sub3 local18 = this.method4435(0, arg0);
		if (local18 == null) {
			return null;
		} else {
			@Pc(26) byte[] local26 = local18.method3403();
			local18.method5854();
			return local26;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
	@Override
	public int method4419(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub1_Sub3 local11 = (Class4_Sub1_Sub3) this.aClass196_33.method4477((long) arg0);
		return local11 == null ? 0 : local11.method3404();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
	public void method4432() {
		if (this.aClass113_5 != null) {
			this.aBoolean382 = true;
			if (this.aClass258_38 == null) {
				this.aClass258_38 = new Class258();
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
	public void method4433() {
		if (this.aClass258_38 == null || this.method4422() == null) {
			return;
		}
		for (@Pc(19) Class4 local19 = this.aClass258_39.method5538(); local19 != null; local19 = this.aClass258_39.method5528()) {
			@Pc(25) int local25 = (int) local19.aLong225;
			if (local25 < 0 || local25 >= this.aClass232_2.anInt6729 || this.aClass232_2.anIntArray583[local25] == 0) {
				local19.method5854();
			} else {
				if (this.aByteArray66[local25] == 0) {
					this.method4435(1, local25);
				}
				if (this.aByteArray66[local25] == -1) {
					this.method4435(2, local25);
				}
				if (this.aByteArray66[local25] == 1) {
					local19.method5854();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
	public void method4434() {
		if (this.aClass258_38 != null) {
			if (this.method4422() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class4 local23;
			@Pc(29) int local29;
			@Pc(114) Class4 local114;
			if (this.aBoolean383) {
				local18 = true;
				for (local23 = this.aClass258_38.method5538(); local23 != null; local23 = this.aClass258_38.method5528()) {
					local29 = (int) local23.aLong225;
					if (this.aByteArray66[local29] == 0) {
						this.method4435(1, local29);
					}
					if (this.aByteArray66[local29] == 0) {
						local18 = false;
					} else {
						local23.method5854();
					}
				}
				while (this.aClass232_2.anIntArray583.length > this.anInt5753) {
					if (this.aClass232_2.anIntArray583[this.anInt5753] == 0) {
						this.anInt5753++;
					} else {
						if (this.aClass227_3.anInt6592 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray66[this.anInt5753] == 0) {
							this.method4435(1, this.anInt5753);
						}
						if (this.aByteArray66[this.anInt5753] == 0) {
							local114 = new Class4();
							local114.aLong225 = this.anInt5753;
							this.aClass258_38.method5526(local114);
							local18 = false;
						}
						this.anInt5753++;
					}
				}
				if (local18) {
					this.aBoolean383 = false;
					this.anInt5753 = 0;
				}
			} else if (this.aBoolean382) {
				local18 = true;
				for (local23 = this.aClass258_38.method5538(); local23 != null; local23 = this.aClass258_38.method5528()) {
					local29 = (int) local23.aLong225;
					if (this.aByteArray66[local29] != 1) {
						this.method4435(2, local29);
					}
					if (this.aByteArray66[local29] == 1) {
						local23.method5854();
					} else {
						local18 = false;
					}
				}
				while (this.anInt5753 < this.aClass232_2.anIntArray583.length) {
					if (this.aClass232_2.anIntArray583[this.anInt5753] == 0) {
						this.anInt5753++;
					} else {
						if (this.aClass125_2.method2604()) {
							local18 = false;
							break;
						}
						if (this.aByteArray66[this.anInt5753] != 1) {
							this.method4435(2, this.anInt5753);
						}
						if (this.aByteArray66[this.anInt5753] != 1) {
							local114 = new Class4();
							local114.aLong225 = this.anInt5753;
							this.aClass258_38.method5526(local114);
							local18 = false;
						}
						this.anInt5753++;
					}
				}
				if (local18) {
					this.anInt5753 = 0;
					this.aBoolean382 = false;
				}
			} else {
				this.aClass258_38 = null;
			}
		}
		if (!this.aBoolean384 || this.aLong172 > Static199.method2845()) {
			return;
		}
		for (@Pc(321) Class4_Sub1_Sub3 local321 = (Class4_Sub1_Sub3) this.aClass196_33.method4482(); local321 != null; local321 = (Class4_Sub1_Sub3) this.aClass196_33.method4472()) {
			if (!local321.aBoolean330) {
				if (local321.aBoolean332) {
					if (!local321.aBoolean331) {
						throw new RuntimeException();
					}
					local321.method5854();
				} else {
					local321.aBoolean332 = true;
				}
			}
		}
		this.aLong172 = Static199.method2845() + 1000L;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)Lclient!tt;")
	private Class4_Sub1_Sub3 method4435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class4_Sub1_Sub3 local13 = (Class4_Sub1_Sub3) this.aClass196_33.method4477((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean331 && local13.aBoolean330) {
			local13.method5854();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass113_5 == null || this.aByteArray66[arg1] == -1) {
					if (this.aClass125_2.method2613()) {
						return null;
					}
					local13 = this.aClass125_2.method2612(true, this.anInt5745, (byte) 2, arg1);
				} else {
					local13 = this.aClass227_3.method5114(arg1, this.aClass113_5);
				}
			} else if (arg0 == 1) {
				if (this.aClass113_5 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass227_3.method5117(this.aClass113_5, arg1);
			} else if (arg0 == 2) {
				if (this.aClass113_5 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray66[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass125_2.method2604()) {
					return null;
				}
				local13 = this.aClass125_2.method2612(false, this.anInt5745, (byte) 2, arg1);
			} else {
				throw new RuntimeException();
			}
			this.aClass196_33.method4474((long) arg1, local13);
		}
		if (local13.aBoolean330) {
			return null;
		}
		@Pc(160) byte[] local160 = local13.method3403();
		@Pc(189) int local189;
		@Pc(235) Class4_Sub1_Sub3_Sub1 local235;
		if (!(local13 instanceof Class4_Sub1_Sub3_Sub2)) {
			try {
				if (local160 == null || local160.length <= 2) {
					throw new RuntimeException();
				}
				Static249.aCRC32_1.reset();
				Static249.aCRC32_1.update(local160, 0, local160.length - 2);
				local189 = (int) Static249.aCRC32_1.getValue();
				if (this.aClass232_2.anIntArray580[arg1] != local189) {
					throw new RuntimeException();
				}
				this.aClass125_2.anInt3329 = 0;
				this.aClass125_2.anInt3328 = 0;
			} catch (@Pc(210) RuntimeException local210) {
				this.aClass125_2.method2603();
				local13.method5854();
				if (local13.aBoolean331 && !this.aClass125_2.method2613()) {
					local235 = this.aClass125_2.method2612(true, this.anInt5745, (byte) 2, arg1);
					this.aClass196_33.method4474((long) arg1, local235);
				}
				return null;
			}
			local160[local160.length - 2] = (byte) (this.aClass232_2.anIntArray586[arg1] >>> 8);
			local160[local160.length - 1] = (byte) this.aClass232_2.anIntArray586[arg1];
			if (this.aClass113_5 != null) {
				this.aClass227_3.method5112(local160, this.aClass113_5, arg1);
				if (this.aByteArray66[arg1] != 1) {
					this.anInt5741++;
					this.aByteArray66[arg1] = 1;
				}
			}
			if (!local13.aBoolean331) {
				local13.method5854();
			}
			return local13;
		}
		try {
			if (local160 == null || local160.length <= 2) {
				throw new RuntimeException();
			}
			Static249.aCRC32_1.reset();
			Static249.aCRC32_1.update(local160, 0, local160.length - 2);
			local189 = (int) Static249.aCRC32_1.getValue();
			if (local189 != this.aClass232_2.anIntArray580[arg1]) {
				throw new RuntimeException();
			}
			@Pc(369) int local369 = ((local160[local160.length - 2] & 0xFF) << 8) + (local160[local160.length - 1] & 0xFF);
			if (local369 != (this.aClass232_2.anIntArray586[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray66[arg1] != 1) {
				this.anInt5741++;
				this.aByteArray66[arg1] = 1;
			}
			if (!local13.aBoolean331) {
				local13.method5854();
			}
			return local13;
		} catch (@Pc(414) Exception local414) {
			this.aByteArray66[arg1] = -1;
			local13.method5854();
			if (local13.aBoolean331 && !this.aClass125_2.method2613()) {
				local235 = this.aClass125_2.method2612(true, this.anInt5745, (byte) 2, arg1);
				this.aClass196_33.method4474((long) arg1, local235);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)I")
	public int method4437() {
		return this.aClass232_2 == null ? 0 : this.aClass232_2.anInt6721;
	}
}
