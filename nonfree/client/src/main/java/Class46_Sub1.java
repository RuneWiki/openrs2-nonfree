import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!se;")
	private Class152 aClass152_1;

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "Z")
	private boolean aBoolean100;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	private int anInt1357 = 0;

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "Lclient!pd;")
	private Class129 aClass129_5 = new Class129(16);

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
	private int anInt1376 = 0;

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "Lclient!wn;")
	private Class182 aClass182_8 = new Class182();

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "J")
	private long aLong47 = 0L;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "Lclient!pm;")
	private Class133 aClass133_2;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
	private int anInt1365;

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "Z")
	private boolean aBoolean99;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "Lclient!wn;")
	private Class182 aClass182_7;

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	private int anInt1370;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "Z")
	private boolean aBoolean101;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!pm;")
	private Class133 aClass133_1;

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
	private int anInt1375;

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "Lclient!ea;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "Lclient!r;")
	private Class139 aClass139_1;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "Lclient!ch;")
	private Class8_Sub1_Sub4 aClass8_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(ILclient!pm;Lclient!pm;Lclient!r;Lclient!ea;IIZ)V")
	public Class46_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(4) Class42 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass133_2 = arg1;
		this.anInt1365 = arg0;
		if (this.aClass133_2 == null) {
			this.aBoolean99 = false;
		} else {
			this.aBoolean99 = true;
			this.aClass182_7 = new Class182();
		}
		this.anInt1370 = arg6;
		this.aBoolean101 = arg7;
		this.aClass133_1 = arg2;
		this.anInt1375 = arg5;
		this.aClass42_1 = arg4;
		this.aClass139_1 = arg3;
		if (this.aClass133_1 != null) {
			this.aClass8_Sub1_Sub4_1 = this.aClass42_1.method941(this.anInt1365, this.aClass133_1);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)I")
	public int method973() {
		return this.aClass152_1 == null ? 0 : this.aClass152_1.anInt4798;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public void method975() {
		if (this.aClass182_7 != null) {
			if (this.method971() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(28) Class8 local28;
			@Pc(34) int local34;
			if (this.aBoolean99) {
				local21 = true;
				for (local28 = this.aClass182_7.method4319(); local28 != null; local28 = this.aClass182_7.method4329()) {
					local34 = (int) local28.aLong203;
					if (this.aByteArray8[local34] == 0) {
						this.method983(1, local34);
					}
					if (this.aByteArray8[local34] == 0) {
						local21 = false;
					} else {
						local28.method4273();
					}
				}
				while (this.aClass152_1.anIntArray361.length > this.anInt1376) {
					if (this.aClass152_1.anIntArray361[this.anInt1376] == 0) {
						this.anInt1376++;
					} else {
						if (this.aClass42_1.anInt1303 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray8[this.anInt1376] == 0) {
							this.method983(1, this.anInt1376);
						}
						if (this.aByteArray8[this.anInt1376] == 0) {
							local21 = false;
							local28 = new Class8();
							local28.aLong203 = this.anInt1376;
							this.aClass182_7.method4328(local28);
						}
						this.anInt1376++;
					}
				}
				if (local21) {
					this.aBoolean99 = false;
					this.anInt1376 = 0;
				}
			} else if (this.aBoolean100) {
				local21 = true;
				for (local28 = this.aClass182_7.method4319(); local28 != null; local28 = this.aClass182_7.method4329()) {
					local34 = (int) local28.aLong203;
					if (this.aByteArray8[local34] != 1) {
						this.method983(2, local34);
					}
					if (this.aByteArray8[local34] == 1) {
						local28.method4273();
					} else {
						local21 = false;
					}
				}
				while (this.aClass152_1.anIntArray361.length > this.anInt1376) {
					if (this.aClass152_1.anIntArray361[this.anInt1376] == 0) {
						this.anInt1376++;
					} else {
						if (this.aClass139_1.method3441()) {
							local21 = false;
							break;
						}
						if (this.aByteArray8[this.anInt1376] != 1) {
							this.method983(2, this.anInt1376);
						}
						if (this.aByteArray8[this.anInt1376] != 1) {
							local28 = new Class8();
							local28.aLong203 = this.anInt1376;
							this.aClass182_7.method4328(local28);
							local21 = false;
						}
						this.anInt1376++;
					}
				}
				if (local21) {
					this.aBoolean100 = false;
					this.anInt1376 = 0;
				}
			} else {
				this.aClass182_7 = null;
			}
		}
		if (!this.aBoolean101 || Static71.method1143() < this.aLong47) {
			return;
		}
		for (@Pc(330) Class8_Sub1_Sub4 local330 = (Class8_Sub1_Sub4) this.aClass129_5.method3035(); local330 != null; local330 = (Class8_Sub1_Sub4) this.aClass129_5.method3048()) {
			if (!local330.aBoolean313) {
				if (local330.aBoolean312) {
					if (!local330.aBoolean315) {
						throw new RuntimeException();
					}
					local330.method4273();
				} else {
					local330.aBoolean312 = true;
				}
			}
		}
		this.aLong47 = Static71.method1143() + 1000L;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
	@Override
	public int method970(@OriginalArg(1) int arg0) {
		@Pc(11) Class8_Sub1_Sub4 local11 = (Class8_Sub1_Sub4) this.aClass129_5.method3043((long) arg0);
		return local11 == null ? 0 : local11.method3007();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method969(@OriginalArg(1) int arg0) {
		@Pc(11) Class8_Sub1_Sub4 local11 = this.method983(0, arg0);
		if (local11 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local11.method3013();
			local11.method4273();
			return local24;
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	public void method977() {
		if (this.aClass182_7 == null || this.method971() == null) {
			return;
		}
		for (@Pc(22) Class8 local22 = this.aClass182_8.method4319(); local22 != null; local22 = this.aClass182_8.method4329()) {
			@Pc(28) int local28 = (int) local22.aLong203;
			if (local28 < 0 || this.aClass152_1.anInt4797 <= local28 || this.aClass152_1.anIntArray361[local28] == 0) {
				local22.method4273();
			} else {
				if (this.aByteArray8[local28] == 0) {
					this.method983(1, local28);
				}
				if (this.aByteArray8[local28] == -1) {
					this.method983(2, local28);
				}
				if (this.aByteArray8[local28] == 1) {
					local22.method4273();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
	public void method978() {
		if (this.aClass133_2 != null) {
			this.aBoolean100 = true;
			if (this.aClass182_7 == null) {
				this.aClass182_7 = new Class182();
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lclient!se;")
	@Override
	public Class152 method971() {
		if (this.aClass152_1 != null) {
			return this.aClass152_1;
		}
		if (this.aClass8_Sub1_Sub4_1 == null) {
			if (this.aClass139_1.method3447()) {
				return null;
			}
			this.aClass8_Sub1_Sub4_1 = this.aClass139_1.method3443(255, this.anInt1365, true, (byte) 0);
		}
		if (this.aClass8_Sub1_Sub4_1.aBoolean313) {
			return null;
		}
		@Pc(46) byte[] local46 = this.aClass8_Sub1_Sub4_1.method3013();
		if (this.aClass8_Sub1_Sub4_1 instanceof Class8_Sub1_Sub4_Sub2) {
			try {
				if (local46 == null) {
					throw new RuntimeException();
				}
				this.aClass152_1 = new Class152(local46, this.anInt1375);
				if (this.anInt1370 != this.aClass152_1.anInt4795) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass152_1 = null;
				if (this.aClass139_1.method3447()) {
					this.aClass8_Sub1_Sub4_1 = null;
				} else {
					this.aClass8_Sub1_Sub4_1 = this.aClass139_1.method3443(255, this.anInt1365, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local46 == null) {
					throw new RuntimeException();
				}
				this.aClass152_1 = new Class152(local46, this.anInt1375);
			} catch (@Pc(122) RuntimeException local122) {
				this.aClass139_1.method3453();
				this.aClass152_1 = null;
				if (this.aClass139_1.method3447()) {
					this.aClass8_Sub1_Sub4_1 = null;
				} else {
					this.aClass8_Sub1_Sub4_1 = this.aClass139_1.method3443(255, this.anInt1365, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass133_1 != null) {
				this.aClass42_1.method942(this.aClass133_1, local46, this.anInt1365);
			}
		}
		if (this.aClass133_2 != null) {
			this.anInt1357 = 0;
			this.aByteArray8 = new byte[this.aClass152_1.anInt4797];
		}
		this.aClass8_Sub1_Sub4_1 = null;
		return this.aClass152_1;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)I")
	public int method980() {
		if (this.method971() == null) {
			return this.aClass8_Sub1_Sub4_1 == null ? 0 : this.aClass8_Sub1_Sub4_1.method3007();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
	@Override
	public void method972(@OriginalArg(1) int arg0) {
		if (this.aClass133_2 == null) {
			return;
		}
		@Pc(14) Class8 local14;
		for (local14 = this.aClass182_8.method4319(); local14 != null; local14 = this.aClass182_8.method4329()) {
			if ((long) arg0 == local14.aLong203) {
				return;
			}
		}
		local14 = new Class8();
		local14.aLong203 = arg0;
		this.aClass182_8.method4328(local14);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)Lclient!ch;")
	private Class8_Sub1_Sub4 method983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class8_Sub1_Sub4 local9 = (Class8_Sub1_Sub4) this.aClass129_5.method3043((long) arg1);
		if (local9 != null && arg0 == 0 && !local9.aBoolean315 && local9.aBoolean313) {
			local9.method4273();
			local9 = null;
		}
		if (local9 == null) {
			if (arg0 == 0) {
				if (this.aClass133_2 == null || this.aByteArray8[arg1] == -1) {
					if (this.aClass139_1.method3447()) {
						return null;
					}
					local9 = this.aClass139_1.method3443(this.anInt1365, arg1, true, (byte) 2);
				} else {
					local9 = this.aClass42_1.method941(arg1, this.aClass133_2);
				}
			} else if (arg0 == 1) {
				if (this.aClass133_2 == null) {
					throw new RuntimeException();
				}
				local9 = this.aClass42_1.method936(this.aClass133_2, arg1);
			} else if (arg0 == 2) {
				if (this.aClass133_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray8[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass139_1.method3441()) {
					return null;
				}
				local9 = this.aClass139_1.method3443(this.anInt1365, arg1, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass129_5.method3039(local9, (long) arg1);
		}
		if (local9.aBoolean313) {
			return null;
		}
		@Pc(169) byte[] local169 = local9.method3013();
		@Pc(198) int local198;
		@Pc(310) Class8_Sub1_Sub4_Sub1 local310;
		if (!(local9 instanceof Class8_Sub1_Sub4_Sub2)) {
			try {
				if (local169 == null || local169.length <= 2) {
					throw new RuntimeException();
				}
				Static236.aCRC32_1.reset();
				Static236.aCRC32_1.update(local169, 0, local169.length - 2);
				local198 = (int) Static236.aCRC32_1.getValue();
				if (this.aClass152_1.anIntArray362[arg1] != local198) {
					throw new RuntimeException();
				}
				this.aClass139_1.anInt4543 = 0;
				this.aClass139_1.anInt4544 = 0;
			} catch (@Pc(365) RuntimeException local365) {
				this.aClass139_1.method3453();
				local9.method4273();
				if (local9.aBoolean315 && !this.aClass139_1.method3447()) {
					local310 = this.aClass139_1.method3443(this.anInt1365, arg1, true, (byte) 2);
					this.aClass129_5.method3039(local310, (long) arg1);
				}
				return null;
			}
			local169[local169.length - 2] = (byte) (this.aClass152_1.anIntArray364[arg1] >>> 8);
			local169[local169.length - 1] = (byte) this.aClass152_1.anIntArray364[arg1];
			if (this.aClass133_2 != null) {
				this.aClass42_1.method942(this.aClass133_2, local169, arg1);
				if (this.aByteArray8[arg1] != 1) {
					this.anInt1357++;
					this.aByteArray8[arg1] = 1;
				}
			}
			if (!local9.aBoolean315) {
				local9.method4273();
			}
			return local9;
		}
		try {
			if (local169 == null || local169.length <= 2) {
				throw new RuntimeException();
			}
			Static236.aCRC32_1.reset();
			Static236.aCRC32_1.update(local169, 0, local169.length - 2);
			local198 = (int) Static236.aCRC32_1.getValue();
			if (this.aClass152_1.anIntArray362[arg1] != local198) {
				throw new RuntimeException();
			}
			@Pc(229) int local229 = (local169[local169.length - 1] & 0xFF) + ((local169[local169.length - 2] & 0xFF) << 8);
			if ((this.aClass152_1.anIntArray364[arg1] & 0xFFFF) != local229) {
				throw new RuntimeException();
			}
			if (this.aByteArray8[arg1] != 1) {
				if (this.aByteArray8[arg1] == 0) {
				}
				this.anInt1357++;
				this.aByteArray8[arg1] = 1;
			}
			if (!local9.aBoolean315) {
				local9.method4273();
			}
			return local9;
		} catch (@Pc(283) Exception local283) {
			this.aByteArray8[arg1] = -1;
			local9.method4273();
			if (local9.aBoolean315 && !this.aClass139_1.method3447()) {
				local310 = this.aClass139_1.method3443(this.anInt1365, arg1, true, (byte) 2);
				this.aClass129_5.method3039(local310, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)I")
	public int method984() {
		return this.anInt1357;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)I")
	public int method986() {
		if (this.aClass152_1 == null) {
			return 0;
		} else if (this.aBoolean99) {
			@Pc(30) Class8 local30 = this.aClass182_7.method4319();
			return local30 == null ? 0 : (int) local30.aLong203;
		} else {
			return this.aClass152_1.anInt4798;
		}
	}
}
