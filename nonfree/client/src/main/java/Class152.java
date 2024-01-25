import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class152 {

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	private int anInt5585;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "Lclient!vt;")
	private Class365 aClass365_1;

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "Lclient!gb;")
	private Class6_Sub5_Sub12_Sub1 aClass6_Sub5_Sub12_Sub1_2;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!ns;")
	private final Class231 aClass231_6 = new Class231();

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Lclient!ns;")
	private final Class231 aClass231_7 = new Class231();

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "Lclient!ns;")
	private final Class231 aClass231_8 = new Class231();

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!ns;")
	private final Class231 aClass231_9 = new Class231();

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "Lclient!ji;")
	private final Class6_Sub8 aClass6_Sub8_5 = new Class6_Sub8(4);

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
	public volatile int anInt5586 = 0;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
	public volatile int anInt5587 = 0;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "B")
	private byte aByte56 = 0;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "Lclient!ji;")
	private final Class6_Sub8 aClass6_Sub8_6 = new Class6_Sub8(8);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method4598() {
		if (this.aClass365_1 != null) {
			this.aClass365_1.method8465();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
	private int method4600() {
		return this.aClass231_8.method6051() + this.aClass231_9.method6051();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBIIZ)Lclient!gb;")
	public Class6_Sub5_Sub12_Sub1 method4601(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg2);
		@Pc(15) Class6_Sub5_Sub12_Sub1 local15 = new Class6_Sub5_Sub12_Sub1();
		local15.aByte30 = arg1;
		local15.aLong254 = local11;
		local15.aBoolean681 = arg3;
		if (arg3) {
			if (this.method4610() >= 20) {
				throw new RuntimeException();
			}
			this.aClass231_6.method6048(local15);
		} else if (this.method4600() < 20) {
			this.aClass231_8.method6048(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)Z")
	public boolean method4602() {
		return this.method4610() >= 20;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
	public void method4603() {
		if (this.aClass365_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub8_5.anInt10061 = 0;
			this.aClass6_Sub8_5.method8211(7);
			this.aClass6_Sub8_5.method8242(0);
			this.aClass365_1.method8462(4, this.aClass6_Sub8_5.aByteArray102);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass365_1.method8465();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass365_1 = null;
			this.anInt5587 = -2;
			this.anInt5586++;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
	public void method4604(@OriginalArg(1) boolean arg0) {
		if (this.aClass365_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub8_5.anInt10061 = 0;
			this.aClass6_Sub8_5.method8211(arg0 ? 2 : 3);
			this.aClass6_Sub8_5.method8242(0);
			this.aClass365_1.method8462(4, this.aClass6_Sub8_5.aByteArray102);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass365_1.method8465();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt5587 = -2;
			this.anInt5586++;
			this.aClass365_1 = null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)Z")
	public boolean method4605() {
		@Pc(17) int local17;
		if (this.aClass365_1 != null) {
			@Pc(11) long local11 = Static582.method8056();
			local17 = (int) (local11 - this.aLong153);
			this.aLong153 = local11;
			if (local17 > 200) {
				local17 = 200;
			}
			this.anInt5585 += local17;
			if (this.anInt5585 > 30000) {
				try {
					this.aClass365_1.method8465();
				} catch (@Pc(41) Exception local41) {
				}
				this.aClass365_1 = null;
			}
		}
		if (this.aClass365_1 == null) {
			return this.method4610() == 0 && this.method4600() == 0;
		}
		try {
			this.aClass365_1.method8458();
			for (@Pc(69) Class6_Sub5_Sub12_Sub1 local69 = (Class6_Sub5_Sub12_Sub1) this.aClass231_6.method6055(); local69 != null; local69 = (Class6_Sub5_Sub12_Sub1) this.aClass231_6.method6050()) {
				this.aClass6_Sub8_5.anInt10061 = 0;
				this.aClass6_Sub8_5.method8211(1);
				this.aClass6_Sub8_5.method8242((int) local69.aLong254);
				this.aClass365_1.method8462(4, this.aClass6_Sub8_5.aByteArray102);
				this.aClass231_7.method6048(local69);
			}
			for (@Pc(124) Class6_Sub5_Sub12_Sub1 local124 = (Class6_Sub5_Sub12_Sub1) this.aClass231_8.method6055(); local124 != null; local124 = (Class6_Sub5_Sub12_Sub1) this.aClass231_8.method6050()) {
				this.aClass6_Sub8_5.anInt10061 = 0;
				this.aClass6_Sub8_5.method8211(0);
				this.aClass6_Sub8_5.method8242((int) local124.aLong254);
				this.aClass365_1.method8462(4, this.aClass6_Sub8_5.aByteArray102);
				this.aClass231_9.method6048(local124);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(179) int local179 = this.aClass365_1.method8457();
				if (local179 < 0) {
					throw new IOException();
				}
				if (local179 == 0) {
					break;
				}
				this.anInt5585 = 0;
				@Pc(192) byte local192 = 0;
				if (this.aClass6_Sub5_Sub12_Sub1_2 == null) {
					local192 = 8;
				} else if (this.aClass6_Sub5_Sub12_Sub1_2.anInt3886 == 0) {
					local192 = 1;
				}
				@Pc(221) int local221;
				@Pc(228) int local228;
				@Pc(268) int local268;
				if (local192 <= 0) {
					local221 = this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.aByteArray102.length - this.aClass6_Sub5_Sub12_Sub1_2.aByte30;
					local228 = 512 - this.aClass6_Sub5_Sub12_Sub1_2.anInt3886;
					if (local221 - this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.anInt10061 < local228) {
						local228 = local221 - this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.anInt10061;
					}
					if (local228 > local179) {
						local228 = local179;
					}
					this.aClass365_1.method8463(this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.anInt10061, local228, this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.aByteArray102);
					if (this.aByte56 != 0) {
						for (local268 = 0; local268 < local228; local268++) {
							this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.aByteArray102[local268 + this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.anInt10061] ^= this.aByte56;
						}
					}
					this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.anInt10061 += local228;
					this.aClass6_Sub5_Sub12_Sub1_2.anInt3886 += local228;
					if (local221 == this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.anInt10061) {
						this.aClass6_Sub5_Sub12_Sub1_2.method7748();
						this.aClass6_Sub5_Sub12_Sub1_2.aBoolean682 = false;
						this.aClass6_Sub5_Sub12_Sub1_2 = null;
					} else if (this.aClass6_Sub5_Sub12_Sub1_2.anInt3886 == 512) {
						this.aClass6_Sub5_Sub12_Sub1_2.anInt3886 = 0;
					}
				} else {
					local221 = local192 - this.aClass6_Sub8_6.anInt10061;
					if (local179 < local221) {
						local221 = local179;
					}
					this.aClass365_1.method8463(this.aClass6_Sub8_6.anInt10061, local221, this.aClass6_Sub8_6.aByteArray102);
					if (this.aByte56 != 0) {
						for (local228 = 0; local228 < local221; local228++) {
							this.aClass6_Sub8_6.aByteArray102[local228 + this.aClass6_Sub8_6.anInt10061] ^= this.aByte56;
						}
					}
					this.aClass6_Sub8_6.anInt10061 += local221;
					if (local192 <= this.aClass6_Sub8_6.anInt10061) {
						if (this.aClass6_Sub5_Sub12_Sub1_2 == null) {
							this.aClass6_Sub8_6.anInt10061 = 0;
							local228 = this.aClass6_Sub8_6.method8246();
							local268 = this.aClass6_Sub8_6.method8220();
							@Pc(454) int local454 = this.aClass6_Sub8_6.method8246();
							@Pc(461) int local461 = this.aClass6_Sub8_6.method8236();
							@Pc(465) int local465 = local454 & 0x7F;
							@Pc(473) boolean local473 = (local454 & 0x80) != 0;
							@Pc(481) long local481 = (long) ((local228 << 16) + local268);
							@Pc(493) Class6_Sub5_Sub12_Sub1 local493;
							if (local473) {
								for (local493 = (Class6_Sub5_Sub12_Sub1) this.aClass231_9.method6055(); local493 != null && local481 != local493.aLong254; local493 = (Class6_Sub5_Sub12_Sub1) this.aClass231_9.method6050()) {
								}
							} else {
								for (local493 = (Class6_Sub5_Sub12_Sub1) this.aClass231_7.method6055(); local493 != null && local493.aLong254 != local481; local493 = (Class6_Sub5_Sub12_Sub1) this.aClass231_7.method6050()) {
								}
							}
							if (local493 == null) {
								throw new IOException();
							}
							@Pc(557) int local557 = local465 == 0 ? 5 : 9;
							this.aClass6_Sub5_Sub12_Sub1_2 = local493;
							this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3 = new Class6_Sub8(this.aClass6_Sub5_Sub12_Sub1_2.aByte30 + local461 + local557);
							this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.method8211(local465);
							this.aClass6_Sub5_Sub12_Sub1_2.aClass6_Sub8_3.method8202(local461);
							this.aClass6_Sub8_6.anInt10061 = 0;
							this.aClass6_Sub5_Sub12_Sub1_2.anInt3886 = 8;
						} else if (this.aClass6_Sub5_Sub12_Sub1_2.anInt3886 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub8_6.aByteArray102[0] == -1) {
							this.aClass6_Sub5_Sub12_Sub1_2.anInt3886 = 1;
							this.aClass6_Sub8_6.anInt10061 = 0;
						} else {
							this.aClass6_Sub5_Sub12_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(638) IOException local638) {
			try {
				this.aClass365_1.method8465();
			} catch (@Pc(646) Exception local646) {
			}
			this.anInt5586++;
			this.anInt5587 = -2;
			this.aClass365_1 = null;
			return this.method4610() == 0 && this.method4600() == 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
	public void method4606() {
		try {
			this.aClass365_1.method8465();
		} catch (@Pc(15) Exception local15) {
		}
		this.anInt5586++;
		this.aClass365_1 = null;
		this.anInt5587 = -1;
		this.aByte56 = (byte) (int) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
	public void method4608() {
		if (this.aClass365_1 != null) {
			this.aClass365_1.method8464();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!vt;ZB)V")
	public void method4609(@OriginalArg(0) Class365 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass365_1 != null) {
			try {
				this.aClass365_1.method8465();
			} catch (@Pc(21) Exception local21) {
			}
			this.aClass365_1 = null;
		}
		this.aClass365_1 = arg0;
		this.method4611();
		this.method4604(arg1);
		this.aClass6_Sub8_6.anInt10061 = 0;
		this.aClass6_Sub5_Sub12_Sub1_2 = null;
		while (true) {
			@Pc(47) Class6_Sub5_Sub12_Sub1 local47 = (Class6_Sub5_Sub12_Sub1) this.aClass231_7.method6052();
			if (local47 == null) {
				while (true) {
					local47 = (Class6_Sub5_Sub12_Sub1) this.aClass231_9.method6052();
					if (local47 == null) {
						if (this.aByte56 != 0) {
							try {
								this.aClass6_Sub8_5.anInt10061 = 0;
								this.aClass6_Sub8_5.method8211(4);
								this.aClass6_Sub8_5.method8211(this.aByte56);
								this.aClass6_Sub8_5.method8241(0);
								this.aClass365_1.method8462(4, this.aClass6_Sub8_5.aByteArray102);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass365_1.method8465();
								} catch (@Pc(114) Exception local114) {
								}
								this.aClass365_1 = null;
								this.anInt5586++;
								this.anInt5587 = -2;
							}
						}
						this.anInt5585 = 0;
						this.aLong153 = Static582.method8056();
						return;
					}
					this.aClass231_8.method6048(local47);
				}
			}
			this.aClass231_6.method6048(local47);
		}
	}

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)I")
	public int method4610() {
		return this.aClass231_6.method6051() + this.aClass231_7.method6051();
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	private void method4611() {
		if (this.aClass365_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub8_5.anInt10061 = 0;
			this.aClass6_Sub8_5.method8211(6);
			this.aClass6_Sub8_5.method8242(3);
			this.aClass365_1.method8462(4, this.aClass6_Sub8_5.aByteArray102);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass365_1.method8465();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt5586++;
			this.anInt5587 = -2;
			this.aClass365_1 = null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)Z")
	public boolean method4612() {
		return this.method4600() >= 20;
	}
}
