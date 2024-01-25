import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class184 {

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "J")
	private long aLong161;

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
	private int anInt5312;

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "Lclient!bj;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!oi", name = "D", descriptor = "Lclient!ij;")
	private Class4_Sub1_Sub13_Sub1 aClass4_Sub1_Sub13_Sub1_2;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "Lclient!ub;")
	private final Class252 aClass252_5 = new Class252();

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "Lclient!ub;")
	private final Class252 aClass252_6 = new Class252();

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "Lclient!ub;")
	private final Class252 aClass252_7 = new Class252();

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "Lclient!ub;")
	private final Class252 aClass252_8 = new Class252();

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "Lclient!wn;")
	private final Class4_Sub20 aClass4_Sub20_6 = new Class4_Sub20(4);

	@OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
	public volatile int anInt5314 = 0;

	@OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
	public volatile int anInt5313 = 0;

	@OriginalMember(owner = "client!oi", name = "C", descriptor = "B")
	private byte aByte73 = 0;

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "Lclient!wn;")
	private final Class4_Sub20 aClass4_Sub20_7 = new Class4_Sub20(8);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	private void method4429() {
		if (this.aClass25_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub20_6.anInt5526 = 0;
			this.aClass4_Sub20_6.method4590(6);
			this.aClass4_Sub20_6.method4598(3);
			this.aClass25_2.method403(this.aClass4_Sub20_6.aByteArray77, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass25_2.method408();
			} catch (@Pc(45) Exception local45) {
			}
			this.aClass25_2 = null;
			this.anInt5314++;
			this.anInt5313 = -2;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public void method4430() {
		try {
			this.aClass25_2.method408();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass25_2 = null;
		this.aByte73 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5314++;
		this.anInt5313 = -1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)V")
	public void method4431(@OriginalArg(0) boolean arg0) {
		if (this.aClass25_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub20_6.anInt5526 = 0;
			this.aClass4_Sub20_6.method4590(arg0 ? 2 : 3);
			this.aClass4_Sub20_6.method4598(0);
			this.aClass25_2.method403(this.aClass4_Sub20_6.aByteArray77, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass25_2.method408();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass25_2 = null;
			this.anInt5313 = -2;
			this.anInt5314++;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)I")
	private int method4432() {
		return this.aClass252_7.method5693() + this.aClass252_8.method5693();
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Z")
	public boolean method4434() {
		return this.method4436() >= 20;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
	public void method4435() {
		if (this.aClass25_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub20_6.anInt5526 = 0;
			this.aClass4_Sub20_6.method4590(7);
			this.aClass4_Sub20_6.method4598(0);
			this.aClass25_2.method403(this.aClass4_Sub20_6.aByteArray77, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass25_2.method408();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt5313 = -2;
			this.anInt5314++;
			this.aClass25_2 = null;
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)I")
	public int method4436() {
		return this.aClass252_5.method5693() + this.aClass252_6.method5693();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)Z")
	public boolean method4437() {
		@Pc(18) int local18;
		if (this.aClass25_2 != null) {
			@Pc(11) long local11 = Static167.method2929();
			local18 = (int) (local11 - this.aLong161);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong161 = local11;
			this.anInt5312 += local18;
			if (this.anInt5312 > 30000) {
				try {
					this.aClass25_2.method408();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass25_2 = null;
			}
		}
		if (this.aClass25_2 == null) {
			return this.method4436() == 0 && this.method4432() == 0;
		}
		try {
			this.aClass25_2.method405();
			for (@Pc(75) Class4_Sub1_Sub13_Sub1 local75 = (Class4_Sub1_Sub13_Sub1) this.aClass252_5.method5697(); local75 != null; local75 = (Class4_Sub1_Sub13_Sub1) this.aClass252_5.method5700()) {
				this.aClass4_Sub20_6.anInt5526 = 0;
				this.aClass4_Sub20_6.method4590(1);
				this.aClass4_Sub20_6.method4598((int) local75.aLong219);
				this.aClass25_2.method403(this.aClass4_Sub20_6.aByteArray77, 4);
				this.aClass252_6.method5694(local75);
			}
			for (@Pc(121) Class4_Sub1_Sub13_Sub1 local121 = (Class4_Sub1_Sub13_Sub1) this.aClass252_7.method5697(); local121 != null; local121 = (Class4_Sub1_Sub13_Sub1) this.aClass252_7.method5700()) {
				this.aClass4_Sub20_6.anInt5526 = 0;
				this.aClass4_Sub20_6.method4590(0);
				this.aClass4_Sub20_6.method4598((int) local121.aLong219);
				this.aClass25_2.method403(this.aClass4_Sub20_6.aByteArray77, 4);
				this.aClass252_8.method5694(local121);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(170) int local170 = this.aClass25_2.method409();
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt5312 = 0;
				@Pc(183) byte local183 = 0;
				if (this.aClass4_Sub1_Sub13_Sub1_2 == null) {
					local183 = 8;
				} else if (this.aClass4_Sub1_Sub13_Sub1_2.anInt3349 == 0) {
					local183 = 1;
				}
				@Pc(205) int local205;
				@Pc(229) int local229;
				@Pc(291) int local291;
				if (local183 > 0) {
					local205 = local183 - this.aClass4_Sub20_7.anInt5526;
					if (local170 < local205) {
						local205 = local170;
					}
					this.aClass25_2.method406(this.aClass4_Sub20_7.aByteArray77, local205, this.aClass4_Sub20_7.anInt5526);
					if (this.aByte73 != 0) {
						for (local229 = 0; local229 < local205; local229++) {
							this.aClass4_Sub20_7.aByteArray77[this.aClass4_Sub20_7.anInt5526 + local229] = (byte) (this.aClass4_Sub20_7.aByteArray77[this.aClass4_Sub20_7.anInt5526 + local229] ^ this.aByte73);
						}
					}
					this.aClass4_Sub20_7.anInt5526 += local205;
					if (this.aClass4_Sub20_7.anInt5526 >= local183) {
						if (this.aClass4_Sub1_Sub13_Sub1_2 == null) {
							this.aClass4_Sub20_7.anInt5526 = 0;
							local229 = this.aClass4_Sub20_7.method4614();
							local291 = this.aClass4_Sub20_7.method4560();
							@Pc(296) int local296 = this.aClass4_Sub20_7.method4614();
							@Pc(301) int local301 = this.aClass4_Sub20_7.method4595();
							@Pc(305) int local305 = local296 & 0x7F;
							@Pc(313) boolean local313 = (local296 & 0x80) != 0;
							@Pc(320) long local320 = (long) ((local229 << 16) + local291);
							@Pc(330) Class4_Sub1_Sub13_Sub1 local330;
							if (local313) {
								for (local330 = (Class4_Sub1_Sub13_Sub1) this.aClass252_8.method5697(); local330 != null && local330.aLong219 != local320; local330 = (Class4_Sub1_Sub13_Sub1) this.aClass252_8.method5700()) {
								}
							} else {
								for (local330 = (Class4_Sub1_Sub13_Sub1) this.aClass252_6.method5697(); local330 != null && local330.aLong219 != local320; local330 = (Class4_Sub1_Sub13_Sub1) this.aClass252_6.method5700()) {
								}
							}
							if (local330 == null) {
								throw new IOException();
							}
							this.aClass4_Sub1_Sub13_Sub1_2 = local330;
							@Pc(393) int local393 = local305 == 0 ? 5 : 9;
							this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1 = new Class4_Sub20(this.aClass4_Sub1_Sub13_Sub1_2.aByte20 + local393 + local301);
							this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.method4590(local305);
							this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.method4561(local301);
							this.aClass4_Sub1_Sub13_Sub1_2.anInt3349 = 8;
							this.aClass4_Sub20_7.anInt5526 = 0;
						} else if (this.aClass4_Sub1_Sub13_Sub1_2.anInt3349 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub20_7.aByteArray77[0] == -1) {
							this.aClass4_Sub1_Sub13_Sub1_2.anInt3349 = 1;
							this.aClass4_Sub20_7.anInt5526 = 0;
						} else {
							this.aClass4_Sub1_Sub13_Sub1_2 = null;
						}
					}
				} else {
					local205 = this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.aByteArray77.length - this.aClass4_Sub1_Sub13_Sub1_2.aByte20;
					local229 = 512 - this.aClass4_Sub1_Sub13_Sub1_2.anInt3349;
					if (local205 - this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.anInt5526 < local229) {
						local229 = local205 - this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.anInt5526;
					}
					if (local229 > local170) {
						local229 = local170;
					}
					this.aClass25_2.method406(this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.aByteArray77, local229, this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.anInt5526);
					if (this.aByte73 != 0) {
						for (local291 = 0; local291 < local229; local291++) {
							this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.aByteArray77[this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.anInt5526 + local291] = (byte) (this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.aByteArray77[this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.anInt5526 + local291] ^ this.aByte73);
						}
					}
					this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.anInt5526 += local229;
					this.aClass4_Sub1_Sub13_Sub1_2.anInt3349 += local229;
					if (local205 == this.aClass4_Sub1_Sub13_Sub1_2.aClass4_Sub20_1.anInt5526) {
						this.aClass4_Sub1_Sub13_Sub1_2.method5985();
						this.aClass4_Sub1_Sub13_Sub1_2.aBoolean542 = false;
						this.aClass4_Sub1_Sub13_Sub1_2 = null;
					} else if (this.aClass4_Sub1_Sub13_Sub1_2.anInt3349 == 512) {
						this.aClass4_Sub1_Sub13_Sub1_2.anInt3349 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(606) IOException local606) {
			try {
				this.aClass25_2.method408();
			} catch (@Pc(612) Exception local612) {
			}
			this.anInt5314++;
			this.aClass25_2 = null;
			this.anInt5313 = -2;
			return this.method4436() == 0 && this.method4432() == 0;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBZII)Lclient!ij;")
	public Class4_Sub1_Sub13_Sub1 method4438(@OriginalArg(1) byte arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) (arg3 + (arg2 << 16));
		@Pc(14) Class4_Sub1_Sub13_Sub1 local14 = new Class4_Sub1_Sub13_Sub1();
		local14.aLong219 = local10;
		local14.aByte20 = arg0;
		local14.aBoolean543 = arg1;
		if (arg1) {
			if (this.method4436() >= 20) {
				throw new RuntimeException();
			}
			this.aClass252_5.method5694(local14);
		} else if (this.method4432() < 20) {
			this.aClass252_7.method5694(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!bj;ZI)V")
	public void method4439(@OriginalArg(0) Class25 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass25_2 != null) {
			try {
				this.aClass25_2.method408();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass25_2 = null;
		}
		this.aClass25_2 = arg0;
		this.method4429();
		this.method4431(arg1);
		this.aClass4_Sub20_7.anInt5526 = 0;
		this.aClass4_Sub1_Sub13_Sub1_2 = null;
		while (true) {
			@Pc(48) Class4_Sub1_Sub13_Sub1 local48 = (Class4_Sub1_Sub13_Sub1) this.aClass252_6.method5698();
			if (local48 == null) {
				while (true) {
					local48 = (Class4_Sub1_Sub13_Sub1) this.aClass252_8.method5698();
					if (local48 == null) {
						if (this.aByte73 != 0) {
							try {
								this.aClass4_Sub20_6.anInt5526 = 0;
								this.aClass4_Sub20_6.method4590(4);
								this.aClass4_Sub20_6.method4590(this.aByte73);
								this.aClass4_Sub20_6.method4558(0);
								this.aClass25_2.method403(this.aClass4_Sub20_6.aByteArray77, 4);
							} catch (@Pc(109) IOException local109) {
								try {
									this.aClass25_2.method408();
								} catch (@Pc(115) Exception local115) {
								}
								this.aClass25_2 = null;
								this.anInt5314++;
								this.anInt5313 = -2;
							}
						}
						this.anInt5312 = 0;
						this.aLong161 = Static167.method2929();
						return;
					}
					this.aClass252_7.method5694(local48);
				}
			}
			this.aClass252_5.method5694(local48);
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Z")
	public boolean method4440() {
		return this.method4432() >= 20;
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V")
	public void method4441() {
		if (this.aClass25_2 != null) {
			this.aClass25_2.method407();
		}
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
	public void method4442() {
		if (this.aClass25_2 != null) {
			this.aClass25_2.method408();
		}
	}
}
