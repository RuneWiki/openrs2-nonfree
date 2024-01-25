import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class309 {

	@OriginalMember(owner = "client!qfa", name = "x", descriptor = "I")
	private int anInt8153;

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "J")
	private long aLong254;

	@OriginalMember(owner = "client!qfa", name = "u", descriptor = "Lclient!jg;")
	private Class194 aClass194_2;

	@OriginalMember(owner = "client!qfa", name = "A", descriptor = "Lclient!as;")
	private Class2_Sub6_Sub1_Sub1 aClass2_Sub6_Sub1_Sub1_1;

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "Lclient!vl;")
	private final Class388 aClass388_9 = new Class388();

	@OriginalMember(owner = "client!qfa", name = "p", descriptor = "Lclient!vl;")
	private final Class388 aClass388_10 = new Class388();

	@OriginalMember(owner = "client!qfa", name = "q", descriptor = "Lclient!vl;")
	private final Class388 aClass388_11 = new Class388();

	@OriginalMember(owner = "client!qfa", name = "s", descriptor = "Lclient!vl;")
	private final Class388 aClass388_12 = new Class388();

	@OriginalMember(owner = "client!qfa", name = "t", descriptor = "Lclient!et;")
	private final Class2_Sub20 aClass2_Sub20_8 = new Class2_Sub20(4);

	@OriginalMember(owner = "client!qfa", name = "D", descriptor = "I")
	public volatile int anInt8154 = 0;

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
	public volatile int anInt8155 = 0;

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "B")
	private byte aByte114 = 0;

	@OriginalMember(owner = "client!qfa", name = "j", descriptor = "Lclient!et;")
	private final Class2_Sub20 aClass2_Sub20_9 = new Class2_Sub20(8);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!jg;ZI)V")
	public void method7254(@OriginalArg(0) Class194 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass194_2 != null) {
			try {
				this.aClass194_2.method4169();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass194_2 = null;
		}
		this.aClass194_2 = arg0;
		this.method7264();
		this.method7263(arg1);
		this.aClass2_Sub20_9.anInt9723 = 0;
		this.aClass2_Sub6_Sub1_Sub1_1 = null;
		while (true) {
			@Pc(45) Class2_Sub6_Sub1_Sub1 local45 = (Class2_Sub6_Sub1_Sub1) this.aClass388_10.method9216();
			if (local45 == null) {
				while (true) {
					local45 = (Class2_Sub6_Sub1_Sub1) this.aClass388_12.method9216();
					if (local45 == null) {
						if (this.aByte114 != 0) {
							try {
								this.aClass2_Sub20_8.anInt9723 = 0;
								this.aClass2_Sub20_8.method8584(4);
								this.aClass2_Sub20_8.method8584(this.aByte114);
								this.aClass2_Sub20_8.method8551(0);
								this.aClass194_2.method4173(4, this.aClass2_Sub20_8.aByteArray111);
							} catch (@Pc(117) IOException local117) {
								try {
									this.aClass194_2.method4169();
								} catch (@Pc(123) Exception local123) {
								}
								this.aClass194_2 = null;
								this.anInt8154++;
								this.anInt8155 = -2;
							}
						}
						this.anInt8153 = 0;
						this.aLong254 = Static567.method7863();
						return;
					}
					this.aClass388_11.method9215(local45);
				}
			}
			this.aClass388_9.method9215(local45);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
	public void method7255() {
		try {
			this.aClass194_2.method4169();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt8154++;
		this.anInt8155 = -1;
		this.aClass194_2 = null;
		this.aByte114 = (byte) (int) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)Z")
	public boolean method7256() {
		return this.method7261() >= 20;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)I")
	private int method7257() {
		return this.aClass388_11.method9210() + this.aClass388_12.method9210();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IBZBI)Lclient!as;")
	public Class2_Sub6_Sub1_Sub1 method7259(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(18) long local18 = (long) (arg0 + (arg3 << 16));
		@Pc(22) Class2_Sub6_Sub1_Sub1 local22 = new Class2_Sub6_Sub1_Sub1();
		local22.aLong311 = local18;
		local22.aByte24 = arg1;
		local22.aBoolean843 = arg2;
		if (arg2) {
			if (this.method7261() >= 20) {
				throw new RuntimeException();
			}
			this.aClass388_9.method9215(local22);
		} else if (this.method7257() < 20) {
			this.aClass388_11.method9215(local22);
		} else {
			throw new RuntimeException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(B)V")
	public void method7260() {
		if (this.aClass194_2 != null) {
			this.aClass194_2.method4164(36);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Z)I")
	public int method7261() {
		return this.aClass388_9.method9210() + this.aClass388_10.method9210();
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)Z")
	public boolean method7262() {
		@Pc(18) int local18;
		if (this.aClass194_2 != null) {
			@Pc(11) long local11 = Static567.method7863();
			local18 = (int) (local11 - this.aLong254);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong254 = local11;
			this.anInt8153 += local18;
			if (this.anInt8153 > 30000) {
				try {
					this.aClass194_2.method4169();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass194_2 = null;
			}
		}
		if (this.aClass194_2 == null) {
			return this.method7261() == 0 && this.method7257() == 0;
		}
		try {
			this.aClass194_2.method4171();
			for (@Pc(77) Class2_Sub6_Sub1_Sub1 local77 = (Class2_Sub6_Sub1_Sub1) this.aClass388_9.method9213(); local77 != null; local77 = (Class2_Sub6_Sub1_Sub1) this.aClass388_9.method9212()) {
				this.aClass2_Sub20_8.anInt9723 = 0;
				this.aClass2_Sub20_8.method8584(1);
				this.aClass2_Sub20_8.method8585((int) local77.aLong311);
				this.aClass194_2.method4173(4, this.aClass2_Sub20_8.aByteArray111);
				this.aClass388_10.method9215(local77);
			}
			for (@Pc(125) Class2_Sub6_Sub1_Sub1 local125 = (Class2_Sub6_Sub1_Sub1) this.aClass388_11.method9213(); local125 != null; local125 = (Class2_Sub6_Sub1_Sub1) this.aClass388_11.method9212()) {
				this.aClass2_Sub20_8.anInt9723 = 0;
				this.aClass2_Sub20_8.method8584(0);
				this.aClass2_Sub20_8.method8585((int) local125.aLong311);
				this.aClass194_2.method4173(4, this.aClass2_Sub20_8.aByteArray111);
				this.aClass388_12.method9215(local125);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(190) int local190 = this.aClass194_2.method4168();
				if (local190 < 0) {
					throw new IOException();
				}
				if (local190 == 0) {
					break;
				}
				this.anInt8153 = 0;
				@Pc(206) byte local206 = 0;
				if (this.aClass2_Sub6_Sub1_Sub1_1 == null) {
					local206 = 8;
				} else if (this.aClass2_Sub6_Sub1_Sub1_1.anInt418 == 0) {
					local206 = 1;
				}
				@Pc(237) int local237;
				@Pc(243) int local243;
				@Pc(289) int local289;
				if (local206 <= 0) {
					local237 = this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.aByteArray111.length - this.aClass2_Sub6_Sub1_Sub1_1.aByte24;
					local243 = 512 - this.aClass2_Sub6_Sub1_Sub1_1.anInt418;
					if (local243 > local237 - this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.anInt9723) {
						local243 = local237 - this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.anInt9723;
					}
					if (local243 > local190) {
						local243 = local190;
					}
					this.aClass194_2.method4174(this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.anInt9723, this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.aByteArray111, local243);
					if (this.aByte114 != 0) {
						for (local289 = 0; local289 < local243; local289++) {
							this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.aByteArray111[this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.anInt9723 + local289] = (byte) (this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.aByteArray111[this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.anInt9723 + local289] ^ this.aByte114);
						}
					}
					this.aClass2_Sub6_Sub1_Sub1_1.anInt418 += local243;
					this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.anInt9723 += local243;
					if (local237 == this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.anInt9723) {
						this.aClass2_Sub6_Sub1_Sub1_1.method8698();
						this.aClass2_Sub6_Sub1_Sub1_1.aBoolean842 = false;
						this.aClass2_Sub6_Sub1_Sub1_1 = null;
					} else if (this.aClass2_Sub6_Sub1_Sub1_1.anInt418 == 512) {
						this.aClass2_Sub6_Sub1_Sub1_1.anInt418 = 0;
					}
				} else {
					local237 = local206 - this.aClass2_Sub20_9.anInt9723;
					if (local190 < local237) {
						local237 = local190;
					}
					this.aClass194_2.method4174(this.aClass2_Sub20_9.anInt9723, this.aClass2_Sub20_9.aByteArray111, local237);
					if (this.aByte114 != 0) {
						for (local243 = 0; local243 < local237; local243++) {
							this.aClass2_Sub20_9.aByteArray111[local243 + this.aClass2_Sub20_9.anInt9723] ^= this.aByte114;
						}
					}
					this.aClass2_Sub20_9.anInt9723 += local237;
					if (local206 <= this.aClass2_Sub20_9.anInt9723) {
						if (this.aClass2_Sub6_Sub1_Sub1_1 == null) {
							this.aClass2_Sub20_9.anInt9723 = 0;
							local243 = this.aClass2_Sub20_9.method8581(-17416);
							local289 = this.aClass2_Sub20_9.method8575();
							@Pc(481) int local481 = this.aClass2_Sub20_9.method8581(-17416);
							@Pc(486) int local486 = this.aClass2_Sub20_9.method8555(-9372);
							@Pc(490) int local490 = local481 & 0x7F;
							@Pc(502) boolean local502 = (local481 & 0x80) != 0;
							@Pc(509) long local509 = (long) (local289 + (local243 << 16));
							@Pc(519) Class2_Sub6_Sub1_Sub1 local519;
							if (local502) {
								for (local519 = (Class2_Sub6_Sub1_Sub1) this.aClass388_12.method9213(); local519 != null && local509 != local519.aLong311; local519 = (Class2_Sub6_Sub1_Sub1) this.aClass388_12.method9212()) {
								}
							} else {
								for (local519 = (Class2_Sub6_Sub1_Sub1) this.aClass388_10.method9213(); local519 != null && local509 != local519.aLong311; local519 = (Class2_Sub6_Sub1_Sub1) this.aClass388_10.method9212()) {
								}
							}
							if (local519 == null) {
								throw new IOException();
							}
							this.aClass2_Sub6_Sub1_Sub1_1 = local519;
							@Pc(602) int local602 = local490 == 0 ? 5 : 9;
							this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2 = new Class2_Sub20(local602 + local486 + this.aClass2_Sub6_Sub1_Sub1_1.aByte24);
							this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.method8584(local490);
							this.aClass2_Sub6_Sub1_Sub1_1.aClass2_Sub20_2.method8577(local486);
							this.aClass2_Sub6_Sub1_Sub1_1.anInt418 = 8;
							this.aClass2_Sub20_9.anInt9723 = 0;
						} else if (this.aClass2_Sub6_Sub1_Sub1_1.anInt418 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub20_9.aByteArray111[0] == -1) {
							this.aClass2_Sub6_Sub1_Sub1_1.anInt418 = 1;
							this.aClass2_Sub20_9.anInt9723 = 0;
						} else {
							this.aClass2_Sub6_Sub1_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(690) IOException local690) {
			try {
				this.aClass194_2.method4169();
			} catch (@Pc(696) Exception local696) {
			}
			this.anInt8154++;
			this.aClass194_2 = null;
			this.anInt8155 = -2;
			return this.method7261() == 0 && this.method7257() == 0;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZB)V")
	public void method7263(@OriginalArg(0) boolean arg0) {
		if (this.aClass194_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub20_8.anInt9723 = 0;
			this.aClass2_Sub20_8.method8584(arg0 ? 2 : 3);
			this.aClass2_Sub20_8.method8585(0);
			this.aClass194_2.method4173(4, this.aClass2_Sub20_8.aByteArray111);
		} catch (@Pc(46) IOException local46) {
			try {
				this.aClass194_2.method4169();
			} catch (@Pc(52) Exception local52) {
			}
			this.anInt8154++;
			this.anInt8155 = -2;
			this.aClass194_2 = null;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(I)V")
	private void method7264() {
		if (this.aClass194_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub20_8.anInt9723 = 0;
			this.aClass2_Sub20_8.method8584(6);
			this.aClass2_Sub20_8.method8585(3);
			this.aClass194_2.method4173(4, this.aClass2_Sub20_8.aByteArray111);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass194_2.method4169();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt8154++;
			this.anInt8155 = -2;
			this.aClass194_2 = null;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(B)V")
	public void method7266() {
		if (this.aClass194_2 != null) {
			this.aClass194_2.method4169();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V")
	public void method7267() {
		if (this.aClass194_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub20_8.anInt9723 = 0;
			this.aClass2_Sub20_8.method8584(7);
			this.aClass2_Sub20_8.method8585(0);
			this.aClass194_2.method4173(4, this.aClass2_Sub20_8.aByteArray111);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass194_2.method4169();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt8154++;
			this.anInt8155 = -2;
			this.aClass194_2 = null;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)Z")
	public boolean method7269() {
		return this.method7257() >= 20;
	}
}
