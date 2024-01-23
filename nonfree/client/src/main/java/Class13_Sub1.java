import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "Lclient!ha;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "Z")
	private boolean aBoolean254;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
	private int anInt4039 = 0;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Lclient!vl;")
	private Class186 aClass186_17 = new Class186(16);

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
	private int anInt4044 = 0;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "Lclient!ci;")
	private Class26 aClass26_39 = new Class26();

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "J")
	private long aLong145 = 0L;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "Lclient!ja;")
	private Class83 aClass83_3;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
	private int anInt4038;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "Z")
	private boolean aBoolean253;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "Lclient!ci;")
	private Class26 aClass26_38;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "Lclient!ja;")
	private Class83 aClass83_4;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Lclient!ea;")
	private Class41 aClass41_2;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	private int anInt4031;

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
	private int anInt4043;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "Lclient!io;")
	private Class81 aClass81_2;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "Z")
	private boolean aBoolean255;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!cc;")
	private Class1_Sub3_Sub4 aClass1_Sub3_Sub4_1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILclient!ja;Lclient!ja;Lclient!ea;Lclient!io;IIZ)V")
	public Class13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class41 arg3, @OriginalArg(4) Class81 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass83_3 = arg1;
		this.anInt4038 = arg0;
		if (this.aClass83_3 == null) {
			this.aBoolean253 = false;
		} else {
			this.aBoolean253 = true;
			this.aClass26_38 = new Class26();
		}
		this.aClass83_4 = arg2;
		this.aClass41_2 = arg3;
		this.anInt4031 = arg5;
		this.anInt4043 = arg6;
		this.aClass81_2 = arg4;
		this.aBoolean255 = arg7;
		if (this.aClass83_4 != null) {
			this.aClass1_Sub3_Sub4_1 = this.aClass81_2.method1964(this.anInt4038, this.aClass83_4);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	public int method2965() {
		if (this.method2963() == null) {
			return this.aClass1_Sub3_Sub4_1 == null ? 0 : this.aClass1_Sub3_Sub4_1.method3228();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
	public int method2966() {
		return this.anInt4039;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
	public void method2967() {
		if (this.aClass26_38 == null || this.method2963() == null) {
			return;
		}
		for (@Pc(28) Class1 local28 = this.aClass26_39.method666(); local28 != null; local28 = this.aClass26_39.method672()) {
			@Pc(34) int local34 = (int) local28.aLong247;
			if (local34 < 0 || this.aClass67_1.anInt2190 <= local34 || this.aClass67_1.anIntArray216[local34] == 0) {
				local28.method4767();
			} else {
				if (this.aByteArray60[local34] == 0) {
					this.method2975(local34, 1);
				}
				if (this.aByteArray60[local34] == -1) {
					this.method2975(local34, 2);
				}
				if (this.aByteArray60[local34] == 1) {
					local28.method4767();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)Lclient!ha;")
	@Override
	public Class67 method2963() {
		if (this.aClass67_1 != null) {
			return this.aClass67_1;
		}
		if (this.aClass1_Sub3_Sub4_1 == null) {
			if (this.aClass41_2.method1032()) {
				return null;
			}
			this.aClass1_Sub3_Sub4_1 = this.aClass41_2.method1035(true, 255, this.anInt4038, (byte) 0);
		}
		if (this.aClass1_Sub3_Sub4_1.aBoolean275) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass1_Sub3_Sub4_1.method3229();
		if (this.aClass1_Sub3_Sub4_1 instanceof Class1_Sub3_Sub4_Sub1) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass67_1 = new Class67(local49, this.anInt4031);
				if (this.aClass67_1.anInt2192 != this.anInt4043) {
					throw new RuntimeException();
				}
			} catch (@Pc(145) RuntimeException local145) {
				this.aClass67_1 = null;
				if (this.aClass41_2.method1032()) {
					this.aClass1_Sub3_Sub4_1 = null;
				} else {
					this.aClass1_Sub3_Sub4_1 = this.aClass41_2.method1035(true, 255, this.anInt4038, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass67_1 = new Class67(local49, this.anInt4031);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass41_2.method1038();
				this.aClass67_1 = null;
				if (this.aClass41_2.method1032()) {
					this.aClass1_Sub3_Sub4_1 = null;
				} else {
					this.aClass1_Sub3_Sub4_1 = this.aClass41_2.method1035(true, 255, this.anInt4038, (byte) 0);
				}
				return null;
			}
			if (this.aClass83_4 != null) {
				this.aClass81_2.method1970(this.aClass83_4, local49, this.anInt4038);
			}
		}
		this.aClass1_Sub3_Sub4_1 = null;
		if (this.aClass83_3 != null) {
			this.aByteArray60 = new byte[this.aClass67_1.anInt2190];
			this.anInt4039 = 0;
		}
		return this.aClass67_1;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I")
	public int method2968() {
		if (this.aClass67_1 == null) {
			return 0;
		} else if (this.aBoolean253) {
			@Pc(29) Class1 local29 = this.aClass26_38.method666();
			return local29 == null ? 0 : (int) local29.aLong247;
		} else {
			return this.aClass67_1.anInt2195;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
	@Override
	public int method2959(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub3_Sub4 local18 = (Class1_Sub3_Sub4) this.aClass186_17.method4570((long) arg0);
		return local18 == null ? 0 : local18.method3228();
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)[B")
	@Override
	public byte[] method2964(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub3_Sub4 local9 = this.method2975(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local9.method3229();
			local9.method4767();
			return local24;
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
	public void method2972() {
		if (this.aClass26_38 != null) {
			if (this.method2963() == null) {
				return;
			}
			@Pc(19) boolean local19;
			@Pc(24) Class1 local24;
			@Pc(30) int local30;
			if (this.aBoolean253) {
				local19 = true;
				for (local24 = this.aClass26_38.method666(); local24 != null; local24 = this.aClass26_38.method672()) {
					local30 = (int) local24.aLong247;
					if (this.aByteArray60[local30] == 0) {
						this.method2975(local30, 1);
					}
					if (this.aByteArray60[local30] == 0) {
						local19 = false;
					} else {
						local24.method4767();
					}
				}
				while (this.anInt4044 < this.aClass67_1.anIntArray216.length) {
					if (this.aClass67_1.anIntArray216[this.anInt4044] == 0) {
						this.anInt4044++;
					} else {
						if (this.aClass81_2.anInt2638 >= 250) {
							local19 = false;
							break;
						}
						if (this.aByteArray60[this.anInt4044] == 0) {
							this.method2975(this.anInt4044, 1);
						}
						if (this.aByteArray60[this.anInt4044] == 0) {
							local19 = false;
							local24 = new Class1();
							local24.aLong247 = this.anInt4044;
							this.aClass26_38.method668(local24);
						}
						this.anInt4044++;
					}
				}
				if (local19) {
					this.anInt4044 = 0;
					this.aBoolean253 = false;
				}
			} else if (this.aBoolean254) {
				local19 = true;
				for (local24 = this.aClass26_38.method666(); local24 != null; local24 = this.aClass26_38.method672()) {
					local30 = (int) local24.aLong247;
					if (this.aByteArray60[local30] != 1) {
						this.method2975(local30, 2);
					}
					if (this.aByteArray60[local30] == 1) {
						local24.method4767();
					} else {
						local19 = false;
					}
				}
				while (this.anInt4044 < this.aClass67_1.anIntArray216.length) {
					if (this.aClass67_1.anIntArray216[this.anInt4044] == 0) {
						this.anInt4044++;
					} else {
						if (this.aClass41_2.method1028()) {
							local19 = false;
							break;
						}
						if (this.aByteArray60[this.anInt4044] != 1) {
							this.method2975(this.anInt4044, 2);
						}
						if (this.aByteArray60[this.anInt4044] != 1) {
							local19 = false;
							local24 = new Class1();
							local24.aLong247 = this.anInt4044;
							this.aClass26_38.method668(local24);
						}
						this.anInt4044++;
					}
				}
				if (local19) {
					this.anInt4044 = 0;
					this.aBoolean254 = false;
				}
			} else {
				this.aClass26_38 = null;
			}
		}
		if (!this.aBoolean255 || Static258.method3967() < this.aLong145) {
			return;
		}
		for (@Pc(317) Class1_Sub3_Sub4 local317 = (Class1_Sub3_Sub4) this.aClass186_17.method4567(); local317 != null; local317 = (Class1_Sub3_Sub4) this.aClass186_17.method4579()) {
			if (!local317.aBoolean275) {
				if (local317.aBoolean274) {
					if (!local317.aBoolean272) {
						throw new RuntimeException();
					}
					local317.method4767();
				} else {
					local317.aBoolean274 = true;
				}
			}
		}
		this.aLong145 = Static258.method3967() + 1000L;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)I")
	public int method2974() {
		return this.aClass67_1 == null ? 0 : this.aClass67_1.anInt2195;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Lclient!cc;")
	private Class1_Sub3_Sub4 method2975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) Class1_Sub3_Sub4 local22 = (Class1_Sub3_Sub4) this.aClass186_17.method4570((long) arg0);
		if (local22 != null && arg1 == 0 && !local22.aBoolean272 && local22.aBoolean275) {
			local22.method4767();
			local22 = null;
		}
		if (local22 == null) {
			if (arg1 == 0) {
				if (this.aClass83_3 == null || this.aByteArray60[arg0] == -1) {
					if (this.aClass41_2.method1032()) {
						return null;
					}
					local22 = this.aClass41_2.method1035(true, this.anInt4038, arg0, (byte) 2);
				} else {
					local22 = this.aClass81_2.method1964(arg0, this.aClass83_3);
				}
			} else if (arg1 == 1) {
				if (this.aClass83_3 == null) {
					throw new RuntimeException();
				}
				local22 = this.aClass81_2.method1971(arg0, this.aClass83_3);
			} else if (arg1 == 2) {
				if (this.aClass83_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray60[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass41_2.method1028()) {
					return null;
				}
				local22 = this.aClass41_2.method1035(false, this.anInt4038, arg0, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass186_17.method4575((long) arg0, local22);
		}
		if (local22.aBoolean275) {
			return null;
		}
		@Pc(172) byte[] local172 = local22.method3229();
		@Pc(201) int local201;
		@Pc(255) Class1_Sub3_Sub4_Sub2 local255;
		if (!(local22 instanceof Class1_Sub3_Sub4_Sub1)) {
			try {
				if (local172 == null || local172.length <= 2) {
					throw new RuntimeException();
				}
				Static8.aCRC32_1.reset();
				Static8.aCRC32_1.update(local172, 0, local172.length - 2);
				local201 = (int) Static8.aCRC32_1.getValue();
				if (this.aClass67_1.anIntArray215[arg0] != local201) {
					throw new RuntimeException();
				}
				this.aClass41_2.anInt1236 = 0;
				this.aClass41_2.anInt1237 = 0;
			} catch (@Pc(227) RuntimeException local227) {
				this.aClass41_2.method1038();
				local22.method4767();
				if (local22.aBoolean272 && !this.aClass41_2.method1032()) {
					local255 = this.aClass41_2.method1035(true, this.anInt4038, arg0, (byte) 2);
					this.aClass186_17.method4575((long) arg0, local255);
				}
				return null;
			}
			local172[local172.length - 2] = (byte) (this.aClass67_1.anIntArray210[arg0] >>> 8);
			local172[local172.length - 1] = (byte) this.aClass67_1.anIntArray210[arg0];
			if (this.aClass83_3 != null) {
				this.aClass81_2.method1970(this.aClass83_3, local172, arg0);
				if (this.aByteArray60[arg0] != 1) {
					this.anInt4039++;
					this.aByteArray60[arg0] = 1;
				}
			}
			if (!local22.aBoolean272) {
				local22.method4767();
			}
			return local22;
		}
		try {
			if (local172 == null || local172.length <= 2) {
				throw new RuntimeException();
			}
			Static8.aCRC32_1.reset();
			Static8.aCRC32_1.update(local172, 0, local172.length - 2);
			local201 = (int) Static8.aCRC32_1.getValue();
			if (this.aClass67_1.anIntArray215[arg0] != local201) {
				throw new RuntimeException();
			}
			@Pc(388) int local388 = ((local172[local172.length - 2] & 0xFF) << 8) + (local172[local172.length - 1] & 0xFF);
			if ((this.aClass67_1.anIntArray210[arg0] & 0xFFFF) != local388) {
				throw new RuntimeException();
			}
			if (this.aByteArray60[arg0] != 1) {
				if (this.aByteArray60[arg0] != 0) {
				}
				this.anInt4039++;
				this.aByteArray60[arg0] = 1;
			}
			if (!local22.aBoolean272) {
				local22.method4767();
			}
			return local22;
		} catch (@Pc(441) Exception local441) {
			this.aByteArray60[arg0] = -1;
			local22.method4767();
			if (local22.aBoolean272 && !this.aClass41_2.method1032()) {
				local255 = this.aClass41_2.method1035(true, this.anInt4038, arg0, (byte) 2);
				this.aClass186_17.method4575((long) arg0, local255);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
	@Override
	public void method2962(@OriginalArg(1) int arg0) {
		if (this.aClass83_3 == null) {
			return;
		}
		@Pc(16) Class1 local16;
		for (local16 = this.aClass26_39.method666(); local16 != null; local16 = this.aClass26_39.method672()) {
			if ((long) arg0 == local16.aLong247) {
				return;
			}
		}
		local16 = new Class1();
		local16.aLong247 = arg0;
		this.aClass26_39.method668(local16);
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(B)V")
	public void method2977() {
		if (this.aClass83_3 != null) {
			this.aBoolean254 = true;
			if (this.aClass26_38 == null) {
				this.aClass26_38 = new Class26();
			}
		}
	}
}
