import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "[B")
	private byte[] aByteArray164;

	@OriginalMember(owner = "client!sj", name = "N", descriptor = "Lclient!qc;")
	private Class140 aClass140_2;

	@OriginalMember(owner = "client!sj", name = "Q", descriptor = "Z")
	private boolean aBoolean453;

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
	private int anInt4769 = 0;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "Lclient!il;")
	private Class86 aClass86_32 = new Class86(16);

	@OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
	private int anInt4779 = 0;

	@OriginalMember(owner = "client!sj", name = "S", descriptor = "Lclient!jo;")
	private Class96 aClass96_24 = new Class96();

	@OriginalMember(owner = "client!sj", name = "X", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
	private int anInt4764;

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "Lclient!qe;")
	private Class141 aClass141_3;

	@OriginalMember(owner = "client!sj", name = "O", descriptor = "Z")
	private boolean aBoolean452;

	@OriginalMember(owner = "client!sj", name = "V", descriptor = "Lclient!jo;")
	private Class96 aClass96_25;

	@OriginalMember(owner = "client!sj", name = "B", descriptor = "Lclient!te;")
	private Class164 aClass164_3;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "Lclient!qe;")
	private Class141 aClass141_2;

	@OriginalMember(owner = "client!sj", name = "W", descriptor = "Z")
	private boolean aBoolean454;

	@OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
	private int anInt4777;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	private int anInt4766;

	@OriginalMember(owner = "client!sj", name = "K", descriptor = "Lclient!vd;")
	private Class178 aClass178_7;

	@OriginalMember(owner = "client!sj", name = "M", descriptor = "Lclient!bj;")
	private Class1_Sub5_Sub3 aClass1_Sub5_Sub3_1;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(ILclient!qe;Lclient!qe;Lclient!te;Lclient!vd;IIZ)V")
	public Class53_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) Class141 arg2, @OriginalArg(3) Class164 arg3, @OriginalArg(4) Class178 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4764 = arg0;
		this.aClass141_3 = arg1;
		if (this.aClass141_3 == null) {
			this.aBoolean452 = false;
		} else {
			this.aBoolean452 = true;
			this.aClass96_25 = new Class96();
		}
		this.aClass164_3 = arg3;
		this.aClass141_2 = arg2;
		this.aBoolean454 = arg7;
		this.anInt4777 = arg5;
		this.anInt4766 = arg6;
		this.aClass178_7 = arg4;
		if (this.aClass141_2 != null) {
			this.aClass1_Sub5_Sub3_1 = this.aClass178_7.method4411(this.aClass141_2, this.anInt4764);
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(IZ)V")
	@Override
	public void method3992(@OriginalArg(0) int arg0) {
		if (this.aClass141_3 == null) {
			return;
		}
		@Pc(21) Class1 local21;
		for (local21 = this.aClass96_24.method2340(); local21 != null; local21 = this.aClass96_24.method2342()) {
			if (local21.aLong210 == (long) arg0) {
				return;
			}
		}
		local21 = new Class1();
		local21.aLong210 = arg0;
		this.aClass96_24.method2336(local21);
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
	public void method3993() {
		if (this.aClass141_3 != null) {
			this.aBoolean453 = true;
			if (this.aClass96_25 == null) {
				this.aClass96_25 = new Class96();
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)I")
	public int method3994() {
		if (this.method3991() == null) {
			return this.aClass1_Sub5_Sub3_1 == null ? 0 : this.aClass1_Sub5_Sub3_1.method4019();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
	public void method3996() {
		if (this.aClass96_25 != null) {
			if (this.method3991() == null) {
				return;
			}
			@Pc(22) boolean local22;
			@Pc(27) Class1 local27;
			@Pc(34) int local34;
			if (this.aBoolean452) {
				local22 = true;
				for (local27 = this.aClass96_25.method2340(); local27 != null; local27 = this.aClass96_25.method2342()) {
					local34 = (int) local27.aLong210;
					if (this.aByteArray164[local34] == 0) {
						this.method4003(1, local34);
					}
					if (this.aByteArray164[local34] == 0) {
						local22 = false;
					} else {
						local27.method4573();
					}
				}
				while (this.aClass140_2.anIntArray466.length > this.anInt4779) {
					if (this.aClass140_2.anIntArray466[this.anInt4779] == 0) {
						this.anInt4779++;
					} else {
						if (this.aClass178_7.anInt5305 >= 250) {
							local22 = false;
							break;
						}
						if (this.aByteArray164[this.anInt4779] == 0) {
							this.method4003(1, this.anInt4779);
						}
						if (this.aByteArray164[this.anInt4779] == 0) {
							local22 = false;
							local27 = new Class1();
							local27.aLong210 = this.anInt4779;
							this.aClass96_25.method2336(local27);
						}
						this.anInt4779++;
					}
				}
				if (local22) {
					this.anInt4779 = 0;
					this.aBoolean452 = false;
				}
			} else if (this.aBoolean453) {
				local22 = true;
				for (local27 = this.aClass96_25.method2340(); local27 != null; local27 = this.aClass96_25.method2342()) {
					local34 = (int) local27.aLong210;
					if (this.aByteArray164[local34] != 1) {
						this.method4003(2, local34);
					}
					if (this.aByteArray164[local34] == 1) {
						local27.method4573();
					} else {
						local22 = false;
					}
				}
				while (this.anInt4779 < this.aClass140_2.anIntArray466.length) {
					if (this.aClass140_2.anIntArray466[this.anInt4779] == 0) {
						this.anInt4779++;
					} else {
						if (this.aClass164_3.method4076()) {
							local22 = false;
							break;
						}
						if (this.aByteArray164[this.anInt4779] != 1) {
							this.method4003(2, this.anInt4779);
						}
						if (this.aByteArray164[this.anInt4779] != 1) {
							local22 = false;
							local27 = new Class1();
							local27.aLong210 = this.anInt4779;
							this.aClass96_25.method2336(local27);
						}
						this.anInt4779++;
					}
				}
				if (local22) {
					this.anInt4779 = 0;
					this.aBoolean453 = false;
				}
			} else {
				this.aClass96_25 = null;
			}
		}
		if (!this.aBoolean454 || this.aLong183 > Static244.method3859()) {
			return;
		}
		for (@Pc(328) Class1_Sub5_Sub3 local328 = (Class1_Sub5_Sub3) this.aClass86_32.method2134(); local328 != null; local328 = (Class1_Sub5_Sub3) this.aClass86_32.method2141()) {
			if (!local328.aBoolean460) {
				if (local328.aBoolean461) {
					if (!local328.aBoolean462) {
						throw new RuntimeException();
					}
					local328.method4573();
				} else {
					local328.aBoolean461 = true;
				}
			}
		}
		this.aLong183 = Static244.method3859() + 1000L;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(ZI)I")
	@Override
	public int method3986(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub5_Sub3 local13 = (Class1_Sub5_Sub3) this.aClass86_32.method2136((long) arg0);
		return local13 == null ? 0 : local13.method4019();
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)I")
	public int method3997() {
		if (this.aClass140_2 == null) {
			return 0;
		} else if (this.aBoolean452) {
			@Pc(28) Class1 local28 = this.aClass96_25.method2340();
			return local28 == null ? 0 : (int) local28.aLong210;
		} else {
			return this.aClass140_2.anInt4192;
		}
	}

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)I")
	public int method3998() {
		return this.anInt4769;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)Lclient!qc;")
	@Override
	public Class140 method3991() {
		if (this.aClass140_2 != null) {
			return this.aClass140_2;
		}
		if (this.aClass1_Sub5_Sub3_1 == null) {
			if (this.aClass164_3.method4082()) {
				return null;
			}
			this.aClass1_Sub5_Sub3_1 = this.aClass164_3.method4074(this.anInt4764, 255, (byte) 0, true);
		}
		if (this.aClass1_Sub5_Sub3_1.aBoolean460) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass1_Sub5_Sub3_1.method4020();
		if (this.aClass1_Sub5_Sub3_1 instanceof Class1_Sub5_Sub3_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass140_2 = new Class140(local48, this.anInt4777);
				if (this.aClass140_2.anInt4196 != this.anInt4766) {
					throw new RuntimeException();
				}
			} catch (@Pc(146) RuntimeException local146) {
				this.aClass140_2 = null;
				if (this.aClass164_3.method4082()) {
					this.aClass1_Sub5_Sub3_1 = null;
				} else {
					this.aClass1_Sub5_Sub3_1 = this.aClass164_3.method4074(this.anInt4764, 255, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass140_2 = new Class140(local48, this.anInt4777);
			} catch (@Pc(69) RuntimeException local69) {
				this.aClass164_3.method4072();
				this.aClass140_2 = null;
				if (this.aClass164_3.method4082()) {
					this.aClass1_Sub5_Sub3_1 = null;
				} else {
					this.aClass1_Sub5_Sub3_1 = this.aClass164_3.method4074(this.anInt4764, 255, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass141_2 != null) {
				this.aClass178_7.method4413(this.aClass141_2, this.anInt4764, local48);
			}
		}
		if (this.aClass141_3 != null) {
			this.aByteArray164 = new byte[this.aClass140_2.anInt4193];
			this.anInt4769 = 0;
		}
		this.aClass1_Sub5_Sub3_1 = null;
		return this.aClass140_2;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
	public void method4000() {
		if (this.aClass96_25 == null || this.method3991() == null) {
			return;
		}
		for (@Pc(29) Class1 local29 = this.aClass96_24.method2340(); local29 != null; local29 = this.aClass96_24.method2342()) {
			@Pc(36) int local36 = (int) local29.aLong210;
			if (local36 < 0 || local36 >= this.aClass140_2.anInt4193 || this.aClass140_2.anIntArray466[local36] == 0) {
				local29.method4573();
			} else {
				if (this.aByteArray164[local36] == 0) {
					this.method4003(1, local36);
				}
				if (this.aByteArray164[local36] == -1) {
					this.method4003(2, local36);
				}
				if (this.aByteArray164[local36] == 1) {
					local29.method4573();
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)I")
	public int method4001() {
		return this.aClass140_2 == null ? 0 : this.aClass140_2.anInt4192;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)[B")
	@Override
	public byte[] method3983(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub5_Sub3 local9 = this.method4003(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = local9.method4020();
			local9.method4573();
			return local18;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Lclient!bj;")
	private Class1_Sub5_Sub3 method4003(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub5_Sub3 local18 = (Class1_Sub5_Sub3) this.aClass86_32.method2136((long) arg1);
		if (local18 != null && arg0 == 0 && !local18.aBoolean462 && local18.aBoolean460) {
			local18.method4573();
			local18 = null;
		}
		if (local18 == null) {
			if (arg0 == 0) {
				if (this.aClass141_3 == null || this.aByteArray164[arg1] == -1) {
					if (this.aClass164_3.method4082()) {
						return null;
					}
					local18 = this.aClass164_3.method4074(arg1, this.anInt4764, (byte) 2, true);
				} else {
					local18 = this.aClass178_7.method4411(this.aClass141_3, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass141_3 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass178_7.method4416(this.aClass141_3, arg1);
			} else if (arg0 == 2) {
				if (this.aClass141_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray164[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass164_3.method4076()) {
					return null;
				}
				local18 = this.aClass164_3.method4074(arg1, this.anInt4764, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass86_32.method2144(local18, (long) arg1);
		}
		if (local18.aBoolean460) {
			return null;
		}
		@Pc(175) byte[] local175 = local18.method4020();
		@Pc(203) int local203;
		@Pc(323) Class1_Sub5_Sub3_Sub1 local323;
		if (!(local18 instanceof Class1_Sub5_Sub3_Sub2)) {
			try {
				if (local175 == null || local175.length <= 2) {
					throw new RuntimeException();
				}
				Static14.aCRC32_1.reset();
				Static14.aCRC32_1.update(local175, 0, local175.length - 2);
				local203 = (int) Static14.aCRC32_1.getValue();
				if (this.aClass140_2.anIntArray467[arg1] != local203) {
					throw new RuntimeException();
				}
				this.aClass164_3.anInt4892 = 0;
				this.aClass164_3.anInt4891 = 0;
			} catch (@Pc(382) RuntimeException local382) {
				this.aClass164_3.method4072();
				local18.method4573();
				if (local18.aBoolean462 && !this.aClass164_3.method4082()) {
					local323 = this.aClass164_3.method4074(arg1, this.anInt4764, (byte) 2, true);
					this.aClass86_32.method2144(local323, (long) arg1);
				}
				return null;
			}
			local175[local175.length - 2] = (byte) (this.aClass140_2.anIntArray468[arg1] >>> 8);
			local175[local175.length - 1] = (byte) this.aClass140_2.anIntArray468[arg1];
			if (this.aClass141_3 != null) {
				this.aClass178_7.method4413(this.aClass141_3, arg1, local175);
				if (this.aByteArray164[arg1] != 1) {
					this.anInt4769++;
					this.aByteArray164[arg1] = 1;
				}
			}
			if (!local18.aBoolean462) {
				local18.method4573();
			}
			return local18;
		}
		try {
			if (local175 == null || local175.length <= 2) {
				throw new RuntimeException();
			}
			Static14.aCRC32_1.reset();
			Static14.aCRC32_1.update(local175, 0, local175.length - 2);
			local203 = (int) Static14.aCRC32_1.getValue();
			if (this.aClass140_2.anIntArray467[arg1] != local203) {
				throw new RuntimeException();
			}
			@Pc(239) int local239 = ((local175[local175.length - 2] & 0xFF) << 8) + (local175[local175.length - 1] & 0xFF);
			if (local239 != (this.aClass140_2.anIntArray468[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray164[arg1] != 1) {
				if (this.aByteArray164[arg1] == 0) {
				}
				this.anInt4769++;
				this.aByteArray164[arg1] = 1;
			}
			if (!local18.aBoolean462) {
				local18.method4573();
			}
			return local18;
		} catch (@Pc(295) Exception local295) {
			this.aByteArray164[arg1] = -1;
			local18.method4573();
			if (local18.aBoolean462 && !this.aClass164_3.method4082()) {
				local323 = this.aClass164_3.method4074(arg1, this.anInt4764, (byte) 2, true);
				this.aClass86_32.method2144(local323, (long) arg1);
			}
			return null;
		}
	}
}
