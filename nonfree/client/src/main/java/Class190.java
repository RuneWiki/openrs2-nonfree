import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kha")
public final class Class190 {

	@OriginalMember(owner = "client!kha", name = "t", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!kha", name = "u", descriptor = "I")
	private int anInt5523;

	@OriginalMember(owner = "client!kha", name = "w", descriptor = "Lclient!qw;")
	private Class286 aClass286_2;

	@OriginalMember(owner = "client!kha", name = "C", descriptor = "Lclient!gq;")
	private Class2_Sub5_Sub6_Sub1 aClass2_Sub5_Sub6_Sub1_1;

	@OriginalMember(owner = "client!kha", name = "p", descriptor = "Lclient!jh;")
	private final Class175 aClass175_6 = new Class175();

	@OriginalMember(owner = "client!kha", name = "q", descriptor = "Lclient!jh;")
	private final Class175 aClass175_7 = new Class175();

	@OriginalMember(owner = "client!kha", name = "r", descriptor = "Lclient!jh;")
	private final Class175 aClass175_8 = new Class175();

	@OriginalMember(owner = "client!kha", name = "s", descriptor = "Lclient!jh;")
	private final Class175 aClass175_9 = new Class175();

	@OriginalMember(owner = "client!kha", name = "v", descriptor = "Lclient!ud;")
	private final Class2_Sub34 aClass2_Sub34_11 = new Class2_Sub34(4);

	@OriginalMember(owner = "client!kha", name = "A", descriptor = "I")
	public volatile int anInt5525 = 0;

	@OriginalMember(owner = "client!kha", name = "z", descriptor = "B")
	private byte aByte81 = 0;

	@OriginalMember(owner = "client!kha", name = "y", descriptor = "I")
	public volatile int anInt5524 = 0;

	@OriginalMember(owner = "client!kha", name = "x", descriptor = "Lclient!ud;")
	private final Class2_Sub34 aClass2_Sub34_12 = new Class2_Sub34(8);

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)I")
	private int method4601() {
		return this.aClass175_8.method4282() + this.aClass175_9.method4282();
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZI)V")
	public void method4602(@OriginalArg(0) boolean arg0) {
		if (this.aClass286_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub34_11.anInt8188 = 0;
			this.aClass2_Sub34_11.method6894(arg0 ? 2 : 3);
			this.aClass2_Sub34_11.method6876(0);
			this.aClass286_2.method6803(4, this.aClass2_Sub34_11.aByteArray77);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass286_2.method6807();
			} catch (@Pc(50) Exception local50) {
			}
			this.aClass286_2 = null;
			this.anInt5525++;
			this.anInt5524 = -2;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)V")
	public void method4604() {
		try {
			this.aClass286_2.method6807();
		} catch (@Pc(13) Exception local13) {
		}
		this.anInt5525++;
		this.aByte81 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5524 = -1;
		this.aClass286_2 = null;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lclient!qw;ZB)V")
	public void method4605(@OriginalArg(0) Class286 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass286_2 != null) {
			try {
				this.aClass286_2.method6807();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass286_2 = null;
		}
		this.aClass286_2 = arg0;
		this.method4615();
		this.method4602(arg1);
		this.aClass2_Sub5_Sub6_Sub1_1 = null;
		this.aClass2_Sub34_12.anInt8188 = 0;
		while (true) {
			@Pc(46) Class2_Sub5_Sub6_Sub1 local46 = (Class2_Sub5_Sub6_Sub1) this.aClass175_7.method4284();
			if (local46 == null) {
				while (true) {
					local46 = (Class2_Sub5_Sub6_Sub1) this.aClass175_9.method4284();
					if (local46 == null) {
						if (this.aByte81 != 0) {
							try {
								this.aClass2_Sub34_11.anInt8188 = 0;
								this.aClass2_Sub34_11.method6894(4);
								this.aClass2_Sub34_11.method6894(this.aByte81);
								this.aClass2_Sub34_11.method6854(0);
								this.aClass286_2.method6803(4, this.aClass2_Sub34_11.aByteArray77);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass286_2.method6807();
								} catch (@Pc(113) Exception local113) {
								}
								this.anInt5525++;
								this.aClass286_2 = null;
								this.anInt5524 = -2;
							}
						}
						this.anInt5523 = 0;
						this.aLong157 = Static438.method6517();
						return;
					}
					this.aClass175_8.method4287(local46);
				}
			}
			this.aClass175_6.method4287(local46);
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V")
	public void method4606() {
		if (this.aClass286_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub34_11.anInt8188 = 0;
			this.aClass2_Sub34_11.method6894(7);
			this.aClass2_Sub34_11.method6876(0);
			this.aClass286_2.method6803(4, this.aClass2_Sub34_11.aByteArray77);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass286_2.method6807();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass286_2 = null;
			this.anInt5524 = -2;
			this.anInt5525++;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(BIIIZ)Lclient!gq;")
	public Class2_Sub5_Sub6_Sub1 method4607(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(15) long local15 = (long) (arg1 + (arg2 << 16));
		@Pc(19) Class2_Sub5_Sub6_Sub1 local19 = new Class2_Sub5_Sub6_Sub1();
		local19.aByte75 = arg0;
		local19.aBoolean401 = arg3;
		local19.aLong283 = local15;
		if (arg3) {
			if (this.method4610() >= 20) {
				throw new RuntimeException();
			}
			this.aClass175_6.method4287(local19);
		} else if (this.method4601() < 20) {
			this.aClass175_8.method4287(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)V")
	public void method4609() {
		if (this.aClass286_2 != null) {
			this.aClass286_2.method6807();
		}
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)I")
	public int method4610() {
		return this.aClass175_6.method4282() + this.aClass175_7.method4282();
	}

	@OriginalMember(owner = "client!kha", name = "d", descriptor = "(I)V")
	public void method4611() {
		if (this.aClass286_2 != null) {
			this.aClass286_2.method6801();
		}
	}

	@OriginalMember(owner = "client!kha", name = "e", descriptor = "(I)Z")
	public boolean method4612() {
		@Pc(14) int local14;
		if (this.aClass286_2 != null) {
			@Pc(7) long local7 = Static438.method6517();
			local14 = (int) (local7 - this.aLong157);
			this.aLong157 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt5523 += local14;
			if (this.anInt5523 > 30000) {
				try {
					this.aClass286_2.method6807();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass286_2 = null;
			}
		}
		if (this.aClass286_2 == null) {
			return this.method4610() == 0 && this.method4601() == 0;
		}
		try {
			this.aClass286_2.method6800();
			for (@Pc(77) Class2_Sub5_Sub6_Sub1 local77 = (Class2_Sub5_Sub6_Sub1) this.aClass175_6.method4280(); local77 != null; local77 = (Class2_Sub5_Sub6_Sub1) this.aClass175_6.method4288()) {
				this.aClass2_Sub34_11.anInt8188 = 0;
				this.aClass2_Sub34_11.method6894(1);
				this.aClass2_Sub34_11.method6876((int) local77.aLong283);
				this.aClass286_2.method6803(4, this.aClass2_Sub34_11.aByteArray77);
				this.aClass175_7.method4287(local77);
			}
			for (@Pc(123) Class2_Sub5_Sub6_Sub1 local123 = (Class2_Sub5_Sub6_Sub1) this.aClass175_8.method4280(); local123 != null; local123 = (Class2_Sub5_Sub6_Sub1) this.aClass175_8.method4288()) {
				this.aClass2_Sub34_11.anInt8188 = 0;
				this.aClass2_Sub34_11.method6894(0);
				this.aClass2_Sub34_11.method6876((int) local123.aLong283);
				this.aClass286_2.method6803(4, this.aClass2_Sub34_11.aByteArray77);
				this.aClass175_9.method4287(local123);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(172) int local172 = this.aClass286_2.method6806();
				if (local172 < 0) {
					throw new IOException();
				}
				if (local172 == 0) {
					break;
				}
				this.anInt5523 = 0;
				@Pc(188) byte local188 = 0;
				if (this.aClass2_Sub5_Sub6_Sub1_1 == null) {
					local188 = 8;
				} else if (this.aClass2_Sub5_Sub6_Sub1_1.anInt4144 == 0) {
					local188 = 1;
				}
				@Pc(210) int local210;
				@Pc(238) int local238;
				@Pc(303) int local303;
				if (local188 > 0) {
					local210 = local188 - this.aClass2_Sub34_12.anInt8188;
					if (local210 > local172) {
						local210 = local172;
					}
					this.aClass286_2.method6799(local210, this.aClass2_Sub34_12.anInt8188, this.aClass2_Sub34_12.aByteArray77);
					if (this.aByte81 != 0) {
						for (local238 = 0; local238 < local210; local238++) {
							this.aClass2_Sub34_12.aByteArray77[this.aClass2_Sub34_12.anInt8188 + local238] ^= this.aByte81;
						}
					}
					this.aClass2_Sub34_12.anInt8188 += local210;
					if (local188 <= this.aClass2_Sub34_12.anInt8188) {
						if (this.aClass2_Sub5_Sub6_Sub1_1 == null) {
							this.aClass2_Sub34_12.anInt8188 = 0;
							local238 = this.aClass2_Sub34_12.method6904();
							local303 = this.aClass2_Sub34_12.method6884();
							@Pc(308) int local308 = this.aClass2_Sub34_12.method6904();
							@Pc(313) int local313 = this.aClass2_Sub34_12.method6865();
							@Pc(317) int local317 = local308 & 0x7F;
							@Pc(325) boolean local325 = (local308 & 0x80) != 0;
							@Pc(333) long local333 = (long) ((local238 << 16) + local303);
							@Pc(343) Class2_Sub5_Sub6_Sub1 local343;
							if (local325) {
								for (local343 = (Class2_Sub5_Sub6_Sub1) this.aClass175_9.method4280(); local343 != null && local333 != local343.aLong283; local343 = (Class2_Sub5_Sub6_Sub1) this.aClass175_9.method4288()) {
								}
							} else {
								for (local343 = (Class2_Sub5_Sub6_Sub1) this.aClass175_7.method4280(); local343 != null && local333 != local343.aLong283; local343 = (Class2_Sub5_Sub6_Sub1) this.aClass175_7.method4288()) {
								}
							}
							if (local343 == null) {
								throw new IOException();
							}
							@Pc(399) int local399 = local317 == 0 ? 5 : 9;
							this.aClass2_Sub5_Sub6_Sub1_1 = local343;
							this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9 = new Class2_Sub34(local399 + local313 + this.aClass2_Sub5_Sub6_Sub1_1.aByte75);
							this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.method6894(local317);
							this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.method6864(local313);
							this.aClass2_Sub5_Sub6_Sub1_1.anInt4144 = 8;
							this.aClass2_Sub34_12.anInt8188 = 0;
						} else if (this.aClass2_Sub5_Sub6_Sub1_1.anInt4144 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub34_12.aByteArray77[0] == -1) {
							this.aClass2_Sub5_Sub6_Sub1_1.anInt4144 = 1;
							this.aClass2_Sub34_12.anInt8188 = 0;
						} else {
							this.aClass2_Sub5_Sub6_Sub1_1 = null;
						}
					}
				} else {
					local210 = this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.aByteArray77.length - this.aClass2_Sub5_Sub6_Sub1_1.aByte75;
					local238 = 512 - this.aClass2_Sub5_Sub6_Sub1_1.anInt4144;
					if (local238 > local210 - this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.anInt8188) {
						local238 = local210 - this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.anInt8188;
					}
					if (local172 < local238) {
						local238 = local172;
					}
					this.aClass286_2.method6799(local238, this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.anInt8188, this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.aByteArray77);
					if (this.aByte81 != 0) {
						for (local303 = 0; local303 < local238; local303++) {
							this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.aByteArray77[local303 + this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.anInt8188] ^= this.aByte81;
						}
					}
					this.aClass2_Sub5_Sub6_Sub1_1.anInt4144 += local238;
					this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.anInt8188 += local238;
					if (this.aClass2_Sub5_Sub6_Sub1_1.aClass2_Sub34_9.anInt8188 == local210) {
						this.aClass2_Sub5_Sub6_Sub1_1.method8464();
						this.aClass2_Sub5_Sub6_Sub1_1.aBoolean400 = false;
						this.aClass2_Sub5_Sub6_Sub1_1 = null;
					} else if (this.aClass2_Sub5_Sub6_Sub1_1.anInt4144 == 512) {
						this.aClass2_Sub5_Sub6_Sub1_1.anInt4144 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(622) IOException local622) {
			try {
				this.aClass286_2.method6807();
			} catch (@Pc(628) Exception local628) {
			}
			this.aClass286_2 = null;
			this.anInt5525++;
			this.anInt5524 = -2;
			return this.method4610() == 0 && this.method4601() == 0;
		}
	}

	@OriginalMember(owner = "client!kha", name = "f", descriptor = "(I)Z")
	public boolean method4613() {
		return this.method4610() >= 20;
	}

	@OriginalMember(owner = "client!kha", name = "g", descriptor = "(I)Z")
	public boolean method4614() {
		return this.method4601() >= 20;
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(B)V")
	private void method4615() {
		if (this.aClass286_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub34_11.anInt8188 = 0;
			this.aClass2_Sub34_11.method6894(6);
			this.aClass2_Sub34_11.method6876(3);
			this.aClass286_2.method6803(4, this.aClass2_Sub34_11.aByteArray77);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass286_2.method6807();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt5525++;
			this.aClass286_2 = null;
			this.anInt5524 = -2;
		}
	}
}
