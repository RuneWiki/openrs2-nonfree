import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "[B")
	private byte[] aByteArray96;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "Lclient!eq;")
	private Class71 aClass71_2;

	@OriginalMember(owner = "client!ws", name = "M", descriptor = "Z")
	private boolean aBoolean509;

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
	private int anInt7516 = 0;

	@OriginalMember(owner = "client!ws", name = "H", descriptor = "Lclient!mt;")
	private final Class164 aClass164_39 = new Class164(16);

	@OriginalMember(owner = "client!ws", name = "K", descriptor = "I")
	private int anInt7520 = 0;

	@OriginalMember(owner = "client!ws", name = "J", descriptor = "Lclient!fr;")
	private final Class85 aClass85_49 = new Class85();

	@OriginalMember(owner = "client!ws", name = "P", descriptor = "J")
	private long aLong229 = 0L;

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "Lclient!ur;")
	private final Class250 aClass250_3;

	@OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
	private final int anInt7517;

	@OriginalMember(owner = "client!ws", name = "N", descriptor = "Z")
	private boolean aBoolean510;

	@OriginalMember(owner = "client!ws", name = "L", descriptor = "Lclient!fr;")
	private Class85 aClass85_50;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
	private final int anInt7506;

	@OriginalMember(owner = "client!ws", name = "E", descriptor = "Lclient!cd;")
	private final Class36 aClass36_3;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "Lclient!iv;")
	private final Class120 aClass120_3;

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "Lclient!ur;")
	private final Class250 aClass250_4;

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "I")
	private final int anInt7514;

	@OriginalMember(owner = "client!ws", name = "O", descriptor = "Z")
	private final boolean aBoolean511;

	@OriginalMember(owner = "client!ws", name = "A", descriptor = "Lclient!hh;")
	private Class7_Sub4_Sub8 aClass7_Sub4_Sub8_1;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(ILclient!ur;Lclient!ur;Lclient!iv;Lclient!cd;IIZ)V")
	public Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class120 arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass250_3 = arg1;
		this.anInt7517 = arg0;
		if (this.aClass250_3 == null) {
			this.aBoolean510 = false;
		} else {
			this.aBoolean510 = true;
			this.aClass85_50 = new Class85();
		}
		this.anInt7506 = arg5;
		this.aClass36_3 = arg4;
		this.aClass120_3 = arg3;
		this.aClass250_4 = arg2;
		this.anInt7514 = arg6;
		this.aBoolean511 = arg7;
		if (this.aClass250_4 != null) {
			this.aClass7_Sub4_Sub8_1 = this.aClass36_3.method597(this.aClass250_4, this.anInt7517);
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)I")
	public int method5783() {
		if (this.aClass71_2 == null) {
			return 0;
		} else if (this.aBoolean510) {
			@Pc(20) Class7 local20 = this.aClass85_50.method2010();
			return local20 == null ? 0 : (int) local20.aLong230;
		} else {
			return this.aClass71_2.anInt1996;
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
	public void method5785() {
		if (this.aClass85_50 == null || this.method5781() == null) {
			return;
		}
		for (@Pc(19) Class7 local19 = this.aClass85_49.method2010(); local19 != null; local19 = this.aClass85_49.method2000()) {
			@Pc(25) int local25 = (int) local19.aLong230;
			if (local25 < 0 || local25 >= this.aClass71_2.anInt1988 || this.aClass71_2.anIntArray129[local25] == 0) {
				local19.method5802();
			} else {
				if (this.aByteArray96[local25] == 0) {
					this.method5791(1, local25);
				}
				if (this.aByteArray96[local25] == -1) {
					this.method5791(2, local25);
				}
				if (this.aByteArray96[local25] == 1) {
					local19.method5802();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)I")
	public int method5786() {
		if (this.method5781() == null) {
			return this.aClass7_Sub4_Sub8_1 == null ? 0 : this.aClass7_Sub4_Sub8_1.method4537();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(BI)V")
	@Override
	public void method5782(@OriginalArg(1) int arg0) {
		if (this.aClass250_3 == null) {
			return;
		}
		for (@Pc(14) Class7 local14 = this.aClass85_49.method2010(); local14 != null; local14 = this.aClass85_49.method2000()) {
			if ((long) arg0 == local14.aLong230) {
				return;
			}
		}
		@Pc(42) Class7 local42 = new Class7();
		local42.aLong230 = arg0;
		this.aClass85_49.method2011(local42);
	}

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)I")
	public int method5787() {
		return this.anInt7516;
	}

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)I")
	public int method5788() {
		return this.aClass71_2 == null ? 0 : this.aClass71_2.anInt1996;
	}

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "(I)V")
	public void method5789() {
		if (this.aClass250_3 != null) {
			this.aBoolean509 = true;
			if (this.aClass85_50 == null) {
				this.aClass85_50 = new Class85();
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)Lclient!eq;")
	@Override
	public Class71 method5781() {
		if (this.aClass71_2 != null) {
			return this.aClass71_2;
		}
		if (this.aClass7_Sub4_Sub8_1 == null) {
			if (this.aClass120_3.method2656()) {
				return null;
			}
			this.aClass7_Sub4_Sub8_1 = this.aClass120_3.method2658(255, this.anInt7517, true, (byte) 0);
		}
		if (this.aClass7_Sub4_Sub8_1.aBoolean380) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass7_Sub4_Sub8_1.method4536();
		if (this.aClass7_Sub4_Sub8_1 instanceof Class7_Sub4_Sub8_Sub1) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass71_2 = new Class71(local48, this.anInt7506);
				if (this.anInt7514 != this.aClass71_2.anInt1992) {
					throw new RuntimeException();
				}
			} catch (@Pc(77) RuntimeException local77) {
				this.aClass71_2 = null;
				if (this.aClass120_3.method2656()) {
					this.aClass7_Sub4_Sub8_1 = null;
				} else {
					this.aClass7_Sub4_Sub8_1 = this.aClass120_3.method2658(255, this.anInt7517, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass71_2 = new Class71(local48, this.anInt7506);
			} catch (@Pc(121) RuntimeException local121) {
				this.aClass120_3.method2659();
				this.aClass71_2 = null;
				if (this.aClass120_3.method2656()) {
					this.aClass7_Sub4_Sub8_1 = null;
				} else {
					this.aClass7_Sub4_Sub8_1 = this.aClass120_3.method2658(255, this.anInt7517, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass250_4 != null) {
				this.aClass36_3.method595(this.aClass250_4, local48, this.anInt7517);
			}
		}
		if (this.aClass250_3 != null) {
			this.aByteArray96 = new byte[this.aClass71_2.anInt1988];
			this.anInt7516 = 0;
		}
		this.aClass7_Sub4_Sub8_1 = null;
		return this.aClass71_2;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method5777(@OriginalArg(1) int arg0) {
		@Pc(9) Class7_Sub4_Sub8 local9 = this.method5791(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method4536();
			local9.method5802();
			return local17;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)I")
	@Override
	public int method5780(@OriginalArg(1) int arg0) {
		@Pc(19) Class7_Sub4_Sub8 local19 = (Class7_Sub4_Sub8) this.aClass164_39.method3512((long) arg0);
		return local19 == null ? 0 : local19.method4537();
	}

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "(I)V")
	public void method5790() {
		if (this.aClass85_50 != null) {
			if (this.method5781() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class7 local31;
			@Pc(37) int local37;
			@Pc(128) Class7 local128;
			if (this.aBoolean510) {
				local26 = true;
				for (local31 = this.aClass85_50.method2010(); local31 != null; local31 = this.aClass85_50.method2000()) {
					local37 = (int) local31.aLong230;
					if (this.aByteArray96[local37] == 0) {
						this.method5791(1, local37);
					}
					if (this.aByteArray96[local37] == 0) {
						local26 = false;
					} else {
						local31.method5802();
					}
				}
				while (this.anInt7520 < this.aClass71_2.anIntArray129.length) {
					if (this.aClass71_2.anIntArray129[this.anInt7520] == 0) {
						this.anInt7520++;
					} else {
						if (this.aClass36_3.anInt725 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray96[this.anInt7520] == 0) {
							this.method5791(1, this.anInt7520);
						}
						if (this.aByteArray96[this.anInt7520] == 0) {
							local128 = new Class7();
							local128.aLong230 = this.anInt7520;
							local26 = false;
							this.aClass85_50.method2011(local128);
						}
						this.anInt7520++;
					}
				}
				if (local26) {
					this.aBoolean510 = false;
					this.anInt7520 = 0;
				}
			} else if (this.aBoolean509) {
				local26 = true;
				for (local31 = this.aClass85_50.method2010(); local31 != null; local31 = this.aClass85_50.method2000()) {
					local37 = (int) local31.aLong230;
					if (this.aByteArray96[local37] != 1) {
						this.method5791(2, local37);
					}
					if (this.aByteArray96[local37] == 1) {
						local31.method5802();
					} else {
						local26 = false;
					}
				}
				while (this.anInt7520 < this.aClass71_2.anIntArray129.length) {
					if (this.aClass71_2.anIntArray129[this.anInt7520] == 0) {
						this.anInt7520++;
					} else {
						if (this.aClass120_3.method2651()) {
							local26 = false;
							break;
						}
						if (this.aByteArray96[this.anInt7520] != 1) {
							this.method5791(2, this.anInt7520);
						}
						if (this.aByteArray96[this.anInt7520] != 1) {
							local128 = new Class7();
							local128.aLong230 = this.anInt7520;
							local26 = false;
							this.aClass85_50.method2011(local128);
						}
						this.anInt7520++;
					}
				}
				if (local26) {
					this.aBoolean509 = false;
					this.anInt7520 = 0;
				}
			} else {
				this.aClass85_50 = null;
			}
		}
		if (!this.aBoolean511 || this.aLong229 > Static158.method2342()) {
			return;
		}
		for (@Pc(331) Class7_Sub4_Sub8 local331 = (Class7_Sub4_Sub8) this.aClass164_39.method3514(); local331 != null; local331 = (Class7_Sub4_Sub8) this.aClass164_39.method3519()) {
			if (!local331.aBoolean380) {
				if (local331.aBoolean378) {
					if (!local331.aBoolean379) {
						throw new RuntimeException();
					}
					local331.method5802();
				} else {
					local331.aBoolean378 = true;
				}
			}
		}
		this.aLong229 = Static158.method2342() + 1000L;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Lclient!hh;")
	private Class7_Sub4_Sub8 method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) Class7_Sub4_Sub8 local21 = (Class7_Sub4_Sub8) this.aClass164_39.method3512((long) arg1);
		if (local21 != null && arg0 == 0 && !local21.aBoolean379 && local21.aBoolean380) {
			local21.method5802();
			local21 = null;
		}
		if (local21 == null) {
			if (arg0 == 0) {
				if (this.aClass250_3 == null || this.aByteArray96[arg1] == -1) {
					if (this.aClass120_3.method2656()) {
						return null;
					}
					local21 = this.aClass120_3.method2658(this.anInt7517, arg1, true, (byte) 2);
				} else {
					local21 = this.aClass36_3.method597(this.aClass250_3, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass250_3 == null) {
					throw new RuntimeException();
				}
				local21 = this.aClass36_3.method594(arg1, this.aClass250_3);
			} else if (arg0 == 2) {
				if (this.aClass250_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray96[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass120_3.method2651()) {
					return null;
				}
				local21 = this.aClass120_3.method2658(this.anInt7517, arg1, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass164_39.method3508((long) arg1, local21);
		}
		if (local21.aBoolean380) {
			return null;
		}
		@Pc(164) byte[] local164 = local21.method4536();
		@Pc(191) int local191;
		@Pc(237) Class7_Sub4_Sub8_Sub2 local237;
		if (!(local21 instanceof Class7_Sub4_Sub8_Sub1)) {
			try {
				if (local164 == null || local164.length <= 2) {
					throw new RuntimeException();
				}
				Static344.aCRC32_1.reset();
				Static344.aCRC32_1.update(local164, 0, local164.length - 2);
				local191 = (int) Static344.aCRC32_1.getValue();
				if (local191 != this.aClass71_2.anIntArray131[arg1]) {
					throw new RuntimeException();
				}
				this.aClass120_3.anInt3283 = 0;
				this.aClass120_3.anInt3284 = 0;
			} catch (@Pc(212) RuntimeException local212) {
				this.aClass120_3.method2659();
				local21.method5802();
				if (local21.aBoolean379 && !this.aClass120_3.method2656()) {
					local237 = this.aClass120_3.method2658(this.anInt7517, arg1, true, (byte) 2);
					this.aClass164_39.method3508((long) arg1, local237);
				}
				return null;
			}
			local164[local164.length - 2] = (byte) (this.aClass71_2.anIntArray130[arg1] >>> 8);
			local164[local164.length - 1] = (byte) this.aClass71_2.anIntArray130[arg1];
			if (this.aClass250_3 != null) {
				this.aClass36_3.method595(this.aClass250_3, local164, arg1);
				if (this.aByteArray96[arg1] != 1) {
					this.anInt7516++;
					this.aByteArray96[arg1] = 1;
				}
			}
			if (!local21.aBoolean379) {
				local21.method5802();
			}
			return local21;
		}
		try {
			if (local164 == null || local164.length <= 2) {
				throw new RuntimeException();
			}
			Static344.aCRC32_1.reset();
			Static344.aCRC32_1.update(local164, 0, local164.length - 2);
			local191 = (int) Static344.aCRC32_1.getValue();
			if (local191 != this.aClass71_2.anIntArray131[arg1]) {
				throw new RuntimeException();
			}
			@Pc(366) int local366 = (local164[local164.length - 1] & 0xFF) + ((local164[local164.length - 2] & 0xFF) << 8);
			if (local366 != (this.aClass71_2.anIntArray130[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray96[arg1] != 1) {
				this.anInt7516++;
				this.aByteArray96[arg1] = 1;
			}
			if (!local21.aBoolean379) {
				local21.method5802();
			}
			return local21;
		} catch (@Pc(411) Exception local411) {
			this.aByteArray96[arg1] = -1;
			local21.method5802();
			if (local21.aBoolean379 && !this.aClass120_3.method2656()) {
				local237 = this.aClass120_3.method2658(this.anInt7517, arg1, true, (byte) 2);
				this.aClass164_39.method3508((long) arg1, local237);
			}
			return null;
		}
	}
}
