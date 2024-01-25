import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!au", name = "k", descriptor = "Lclient!jn;")
	private Class132 aClass132_1;

	@OriginalMember(owner = "client!au", name = "K", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!au", name = "M", descriptor = "Z")
	private boolean aBoolean9;

	@OriginalMember(owner = "client!au", name = "v", descriptor = "I")
	private int anInt461 = 0;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "Lclient!bj;")
	private final Class27 aClass27_4 = new Class27(16);

	@OriginalMember(owner = "client!au", name = "P", descriptor = "I")
	private int anInt472 = 0;

	@OriginalMember(owner = "client!au", name = "O", descriptor = "Lclient!wo;")
	private final Class266 aClass266_5 = new Class266();

	@OriginalMember(owner = "client!au", name = "S", descriptor = "J")
	private long aLong17 = 0L;

	@OriginalMember(owner = "client!au", name = "m", descriptor = "I")
	private final int anInt455;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "Lclient!dh;")
	private final Class52 aClass52_2;

	@OriginalMember(owner = "client!au", name = "Q", descriptor = "Z")
	private boolean aBoolean10;

	@OriginalMember(owner = "client!au", name = "N", descriptor = "Lclient!wo;")
	private Class266 aClass266_4;

	@OriginalMember(owner = "client!au", name = "B", descriptor = "Lclient!kp;")
	private final Class142 aClass142_2;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "Lclient!dh;")
	private final Class52 aClass52_1;

	@OriginalMember(owner = "client!au", name = "J", descriptor = "Lclient!gl;")
	private final Class94 aClass94_1;

	@OriginalMember(owner = "client!au", name = "E", descriptor = "I")
	private final int anInt467;

	@OriginalMember(owner = "client!au", name = "R", descriptor = "Z")
	private final boolean aBoolean11;

	@OriginalMember(owner = "client!au", name = "L", descriptor = "I")
	private final int anInt471;

	@OriginalMember(owner = "client!au", name = "D", descriptor = "Lclient!fr;")
	private Class1_Sub2_Sub7 aClass1_Sub2_Sub7_1;

	static {
		new Class84("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(ILclient!dh;Lclient!dh;Lclient!gl;Lclient!kp;IIZ)V")
	public Class16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) Class94 arg3, @OriginalArg(4) Class142 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt455 = arg0;
		this.aClass52_2 = arg1;
		if (this.aClass52_2 == null) {
			this.aBoolean10 = false;
		} else {
			this.aBoolean10 = true;
			this.aClass266_4 = new Class266();
		}
		this.aClass142_2 = arg4;
		this.aClass52_1 = arg2;
		this.aClass94_1 = arg3;
		this.anInt467 = arg5;
		this.aBoolean11 = arg7;
		this.anInt471 = arg6;
		if (this.aClass52_1 != null) {
			this.aClass1_Sub2_Sub7_1 = this.aClass142_2.method3271(this.aClass52_1, this.anInt455);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IB)V")
	@Override
	public void method398(@OriginalArg(0) int arg0) {
		if (this.aClass52_2 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass266_5.method6000(); local14 != null; local14 = this.aClass266_5.method5994()) {
			if ((long) arg0 == local14.aLong227) {
				return;
			}
		}
		@Pc(38) Class1 local38 = new Class1();
		local38.aLong227 = arg0;
		this.aClass266_5.method5998(local38);
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
	public void method399() {
		if (this.aClass266_4 == null || this.method397() == null) {
			return;
		}
		for (@Pc(19) Class1 local19 = this.aClass266_5.method6000(); local19 != null; local19 = this.aClass266_5.method5994()) {
			@Pc(25) int local25 = (int) local19.aLong227;
			if (local25 < 0 || local25 >= this.aClass132_1.anInt3614 || this.aClass132_1.anIntArray296[local25] == 0) {
				local19.method6071();
			} else {
				if (this.aByteArray10[local25] == 0) {
					this.method405(local25, 1);
				}
				if (this.aByteArray10[local25] == -1) {
					this.method405(local25, 2);
				}
				if (this.aByteArray10[local25] == 1) {
					local19.method6071();
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)I")
	@Override
	public int method394(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub2_Sub7 local11 = (Class1_Sub2_Sub7) this.aClass27_4.method553((long) arg0);
		return local11 == null ? 0 : local11.method5889();
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(B)I")
	public int method401() {
		if (this.aClass132_1 == null) {
			return 0;
		} else if (this.aBoolean10) {
			@Pc(26) Class1 local26 = this.aClass266_4.method6000();
			return local26 == null ? 0 : (int) local26.aLong227;
		} else {
			return this.aClass132_1.anInt3613;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
	public void method402() {
		if (this.aClass52_2 != null) {
			this.aBoolean9 = true;
			if (this.aClass266_4 == null) {
				this.aClass266_4 = new Class266();
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V")
	public void method403() {
		if (this.aClass266_4 != null) {
			if (this.method397() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class1 local26;
			@Pc(32) int local32;
			@Pc(120) Class1 local120;
			if (this.aBoolean10) {
				local21 = true;
				for (local26 = this.aClass266_4.method6000(); local26 != null; local26 = this.aClass266_4.method5994()) {
					local32 = (int) local26.aLong227;
					if (this.aByteArray10[local32] == 0) {
						this.method405(local32, 1);
					}
					if (this.aByteArray10[local32] == 0) {
						local21 = false;
					} else {
						local26.method6071();
					}
				}
				while (this.anInt472 < this.aClass132_1.anIntArray296.length) {
					if (this.aClass132_1.anIntArray296[this.anInt472] == 0) {
						this.anInt472++;
					} else {
						if (this.aClass142_2.anInt3926 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray10[this.anInt472] == 0) {
							this.method405(this.anInt472, 1);
						}
						if (this.aByteArray10[this.anInt472] == 0) {
							local120 = new Class1();
							local120.aLong227 = this.anInt472;
							this.aClass266_4.method5998(local120);
							local21 = false;
						}
						this.anInt472++;
					}
				}
				if (local21) {
					this.aBoolean10 = false;
					this.anInt472 = 0;
				}
			} else if (this.aBoolean9) {
				local21 = true;
				for (local26 = this.aClass266_4.method6000(); local26 != null; local26 = this.aClass266_4.method5994()) {
					local32 = (int) local26.aLong227;
					if (this.aByteArray10[local32] != 1) {
						this.method405(local32, 2);
					}
					if (this.aByteArray10[local32] == 1) {
						local26.method6071();
					} else {
						local21 = false;
					}
				}
				while (this.aClass132_1.anIntArray296.length > this.anInt472) {
					if (this.aClass132_1.anIntArray296[this.anInt472] == 0) {
						this.anInt472++;
					} else {
						if (this.aClass94_1.method1902()) {
							local21 = false;
							break;
						}
						if (this.aByteArray10[this.anInt472] != 1) {
							this.method405(this.anInt472, 2);
						}
						if (this.aByteArray10[this.anInt472] != 1) {
							local120 = new Class1();
							local120.aLong227 = this.anInt472;
							local21 = false;
							this.aClass266_4.method5998(local120);
						}
						this.anInt472++;
					}
				}
				if (local21) {
					this.anInt472 = 0;
					this.aBoolean9 = false;
				}
			} else {
				this.aClass266_4 = null;
			}
		}
		if (!this.aBoolean11 || Static101.method1557() < this.aLong17) {
			return;
		}
		for (@Pc(313) Class1_Sub2_Sub7 local313 = (Class1_Sub2_Sub7) this.aClass27_4.method555(); local313 != null; local313 = (Class1_Sub2_Sub7) this.aClass27_4.method563()) {
			if (!local313.aBoolean481) {
				if (local313.aBoolean483) {
					if (!local313.aBoolean482) {
						throw new RuntimeException();
					}
					local313.method6071();
				} else {
					local313.aBoolean483 = true;
				}
			}
		}
		this.aLong17 = Static101.method1557() + 1000L;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method395(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub2_Sub7 local9 = this.method405(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method5887();
			local9.method6071();
			return local17;
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)I")
	public int method404() {
		return this.anInt461;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(III)Lclient!fr;")
	private Class1_Sub2_Sub7 method405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class1_Sub2_Sub7 local18 = (Class1_Sub2_Sub7) this.aClass27_4.method553((long) arg0);
		if (local18 != null && arg1 == 0 && !local18.aBoolean482 && local18.aBoolean481) {
			local18.method6071();
			local18 = null;
		}
		if (local18 == null) {
			if (arg1 == 0) {
				if (this.aClass52_2 == null || this.aByteArray10[arg0] == -1) {
					if (this.aClass94_1.method1903()) {
						return null;
					}
					local18 = this.aClass94_1.method1908(this.anInt455, arg0, true, (byte) 2);
				} else {
					local18 = this.aClass142_2.method3271(this.aClass52_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass52_2 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass142_2.method3274(arg0, this.aClass52_2);
			} else if (arg1 == 2) {
				if (this.aClass52_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray10[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass94_1.method1902()) {
					return null;
				}
				local18 = this.aClass94_1.method1908(this.anInt455, arg0, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass27_4.method564((long) arg0, local18);
		}
		if (local18.aBoolean481) {
			return null;
		}
		@Pc(162) byte[] local162 = local18.method5887();
		@Pc(189) int local189;
		@Pc(295) Class1_Sub2_Sub7_Sub2 local295;
		if (!(local18 instanceof Class1_Sub2_Sub7_Sub1)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				Static281.aCRC32_1.reset();
				Static281.aCRC32_1.update(local162, 0, local162.length - 2);
				local189 = (int) Static281.aCRC32_1.getValue();
				if (this.aClass132_1.anIntArray294[arg0] != local189) {
					throw new RuntimeException();
				}
				this.aClass94_1.anInt2299 = 0;
				this.aClass94_1.anInt2298 = 0;
			} catch (@Pc(351) RuntimeException local351) {
				this.aClass94_1.method1907();
				local18.method6071();
				if (local18.aBoolean482 && !this.aClass94_1.method1903()) {
					local295 = this.aClass94_1.method1908(this.anInt455, arg0, true, (byte) 2);
					this.aClass27_4.method564((long) arg0, local295);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass132_1.anIntArray298[arg0] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass132_1.anIntArray298[arg0];
			if (this.aClass52_2 != null) {
				this.aClass142_2.method3273(arg0, local162, this.aClass52_2);
				if (this.aByteArray10[arg0] != 1) {
					this.anInt461++;
					this.aByteArray10[arg0] = 1;
				}
			}
			if (!local18.aBoolean482) {
				local18.method6071();
			}
			return local18;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static281.aCRC32_1.reset();
			Static281.aCRC32_1.update(local162, 0, local162.length - 2);
			local189 = (int) Static281.aCRC32_1.getValue();
			if (this.aClass132_1.anIntArray294[arg0] != local189) {
				throw new RuntimeException();
			}
			@Pc(224) int local224 = (local162[local162.length - 1] & 0xFF) + ((local162[local162.length - 2] & 0xFF) << 8);
			if ((this.aClass132_1.anIntArray298[arg0] & 0xFFFF) != local224) {
				throw new RuntimeException();
			}
			if (this.aByteArray10[arg0] != 1) {
				this.anInt461++;
				this.aByteArray10[arg0] = 1;
			}
			if (!local18.aBoolean482) {
				local18.method6071();
			}
			return local18;
		} catch (@Pc(269) Exception local269) {
			this.aByteArray10[arg0] = -1;
			local18.method6071();
			if (local18.aBoolean482 && !this.aClass94_1.method1903()) {
				local295 = this.aClass94_1.method1908(this.anInt455, arg0, true, (byte) 2);
				this.aClass27_4.method564((long) arg0, local295);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(B)I")
	public int method407() {
		if (this.method397() == null) {
			return this.aClass1_Sub2_Sub7_1 == null ? 0 : this.aClass1_Sub2_Sub7_1.method5889();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!au", name = "f", descriptor = "(I)I")
	public int method408() {
		return this.aClass132_1 == null ? 0 : this.aClass132_1.anInt3613;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)Lclient!jn;")
	@Override
	public Class132 method397() {
		if (this.aClass132_1 != null) {
			return this.aClass132_1;
		}
		if (this.aClass1_Sub2_Sub7_1 == null) {
			if (this.aClass94_1.method1903()) {
				return null;
			}
			this.aClass1_Sub2_Sub7_1 = this.aClass94_1.method1908(255, this.anInt455, true, (byte) 0);
		}
		if (this.aClass1_Sub2_Sub7_1.aBoolean481) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass1_Sub2_Sub7_1.method5887();
		if (this.aClass1_Sub2_Sub7_1 instanceof Class1_Sub2_Sub7_Sub1) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass132_1 = new Class132(local48, this.anInt467);
				if (this.aClass132_1.anInt3615 != this.anInt471) {
					throw new RuntimeException();
				}
			} catch (@Pc(81) RuntimeException local81) {
				this.aClass132_1 = null;
				if (this.aClass94_1.method1903()) {
					this.aClass1_Sub2_Sub7_1 = null;
				} else {
					this.aClass1_Sub2_Sub7_1 = this.aClass94_1.method1908(255, this.anInt455, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass132_1 = new Class132(local48, this.anInt467);
			} catch (@Pc(123) RuntimeException local123) {
				this.aClass94_1.method1907();
				this.aClass132_1 = null;
				if (this.aClass94_1.method1903()) {
					this.aClass1_Sub2_Sub7_1 = null;
				} else {
					this.aClass1_Sub2_Sub7_1 = this.aClass94_1.method1908(255, this.anInt455, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass52_1 != null) {
				this.aClass142_2.method3273(this.anInt455, local48, this.aClass52_1);
			}
		}
		if (this.aClass52_2 != null) {
			this.anInt461 = 0;
			this.aByteArray10 = new byte[this.aClass132_1.anInt3614];
		}
		this.aClass1_Sub2_Sub7_1 = null;
		return this.aClass132_1;
	}
}
