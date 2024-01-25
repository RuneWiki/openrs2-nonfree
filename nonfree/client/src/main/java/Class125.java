import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class125 {

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "Lclient!ad;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!iu", name = "z", descriptor = "I")
	private int anInt3327;

	@OriginalMember(owner = "client!iu", name = "B", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!iu", name = "G", descriptor = "Lclient!bi;")
	private Class4_Sub1_Sub3_Sub1 aClass4_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "Lclient!kn;")
	private final Class140 aClass140_4 = new Class140();

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "Lclient!kn;")
	private final Class140 aClass140_5 = new Class140();

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "Lclient!kn;")
	private final Class140 aClass140_6 = new Class140();

	@OriginalMember(owner = "client!iu", name = "x", descriptor = "Lclient!kn;")
	private final Class140 aClass140_7 = new Class140();

	@OriginalMember(owner = "client!iu", name = "A", descriptor = "Lclient!tl;")
	private final Class4_Sub30 aClass4_Sub30_4 = new Class4_Sub30(4);

	@OriginalMember(owner = "client!iu", name = "E", descriptor = "I")
	public volatile int anInt3329 = 0;

	@OriginalMember(owner = "client!iu", name = "F", descriptor = "B")
	private byte aByte60 = 0;

	@OriginalMember(owner = "client!iu", name = "C", descriptor = "I")
	public volatile int anInt3328 = 0;

	@OriginalMember(owner = "client!iu", name = "D", descriptor = "Lclient!tl;")
	private final Class4_Sub30 aClass4_Sub30_5 = new Class4_Sub30(8);

	static {
		new Class242("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
	public void method2602() {
		if (this.aClass5_1 != null) {
			this.aClass5_1.method119();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
	public void method2603() {
		try {
			this.aClass5_1.method119();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt3329++;
		this.aByte60 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass5_1 = null;
		this.anInt3328 = -1;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)Z")
	public boolean method2604() {
		return this.method2609() >= 20;
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
	public void method2605() {
		if (this.aClass5_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub30_4.anInt6244 = 0;
			this.aClass4_Sub30_4.method4871(7);
			this.aClass4_Sub30_4.method4830(0);
			this.aClass5_1.method124(this.aClass4_Sub30_4.aByteArray79, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass5_1.method119();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt3328 = -2;
			this.anInt3329++;
			this.aClass5_1 = null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(Z)V")
	public void method2606() {
		if (this.aClass5_1 != null) {
			this.aClass5_1.method115();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZB)V")
	public void method2608(@OriginalArg(0) boolean arg0) {
		if (this.aClass5_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub30_4.anInt6244 = 0;
			this.aClass4_Sub30_4.method4871(arg0 ? 2 : 3);
			this.aClass4_Sub30_4.method4830(0);
			this.aClass5_1.method124(this.aClass4_Sub30_4.aByteArray79, 4);
		} catch (@Pc(47) IOException local47) {
			try {
				this.aClass5_1.method119();
			} catch (@Pc(55) Exception local55) {
			}
			this.anInt3328 = -2;
			this.anInt3329++;
			this.aClass5_1 = null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)I")
	private int method2609() {
		return this.aClass140_6.method3017() + this.aClass140_7.method3017();
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(Z)V")
	private void method2610() {
		if (this.aClass5_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub30_4.anInt6244 = 0;
			this.aClass4_Sub30_4.method4871(6);
			this.aClass4_Sub30_4.method4830(3);
			this.aClass5_1.method124(this.aClass4_Sub30_4.aByteArray79, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass5_1.method119();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt3328 = -2;
			this.anInt3329++;
			this.aClass5_1 = null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZBIBI)Lclient!bi;")
	public Class4_Sub1_Sub3_Sub1 method2612(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg3);
		@Pc(20) Class4_Sub1_Sub3_Sub1 local20 = new Class4_Sub1_Sub3_Sub1();
		local20.aByte12 = arg2;
		local20.aBoolean331 = arg0;
		local20.aLong226 = local16;
		if (arg0) {
			if (this.method2618() >= 20) {
				throw new RuntimeException();
			}
			this.aClass140_4.method3015(local20);
		} else if (this.method2609() < 20) {
			this.aClass140_6.method3015(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)Z")
	public boolean method2613() {
		return this.method2618() >= 20;
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)Z")
	public boolean method2614() {
		@Pc(18) int local18;
		if (this.aClass5_1 != null) {
			@Pc(11) long local11 = Static199.method2845();
			local18 = (int) (local11 - this.aLong89);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong89 = local11;
			this.anInt3327 += local18;
			if (this.anInt3327 > 30000) {
				try {
					this.aClass5_1.method119();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass5_1 = null;
			}
		}
		if (this.aClass5_1 == null) {
			return this.method2618() == 0 && this.method2609() == 0;
		}
		try {
			this.aClass5_1.method123();
			for (@Pc(77) Class4_Sub1_Sub3_Sub1 local77 = (Class4_Sub1_Sub3_Sub1) this.aClass140_4.method3014(); local77 != null; local77 = (Class4_Sub1_Sub3_Sub1) this.aClass140_4.method3018()) {
				this.aClass4_Sub30_4.anInt6244 = 0;
				this.aClass4_Sub30_4.method4871(1);
				this.aClass4_Sub30_4.method4830((int) local77.aLong226);
				this.aClass5_1.method124(this.aClass4_Sub30_4.aByteArray79, 4);
				this.aClass140_5.method3015(local77);
			}
			for (@Pc(129) Class4_Sub1_Sub3_Sub1 local129 = (Class4_Sub1_Sub3_Sub1) this.aClass140_6.method3014(); local129 != null; local129 = (Class4_Sub1_Sub3_Sub1) this.aClass140_6.method3018()) {
				this.aClass4_Sub30_4.anInt6244 = 0;
				this.aClass4_Sub30_4.method4871(0);
				this.aClass4_Sub30_4.method4830((int) local129.aLong226);
				this.aClass5_1.method124(this.aClass4_Sub30_4.aByteArray79, 4);
				this.aClass140_7.method3015(local129);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(178) int local178 = this.aClass5_1.method120();
				if (local178 < 0) {
					throw new IOException();
				}
				if (local178 == 0) {
					break;
				}
				this.anInt3327 = 0;
				@Pc(194) byte local194 = 0;
				if (this.aClass4_Sub1_Sub3_Sub1_2 == null) {
					local194 = 8;
				} else if (this.aClass4_Sub1_Sub3_Sub1_2.anInt725 == 0) {
					local194 = 1;
				}
				@Pc(218) int local218;
				@Pc(243) int local243;
				@Pc(300) int local300;
				if (local194 > 0) {
					local218 = local194 - this.aClass4_Sub30_5.anInt6244;
					if (local218 > local178) {
						local218 = local178;
					}
					this.aClass5_1.method122(this.aClass4_Sub30_5.aByteArray79, local218, this.aClass4_Sub30_5.anInt6244);
					if (this.aByte60 != 0) {
						for (local243 = 0; local243 < local218; local243++) {
							this.aClass4_Sub30_5.aByteArray79[this.aClass4_Sub30_5.anInt6244 + local243] ^= this.aByte60;
						}
					}
					this.aClass4_Sub30_5.anInt6244 += local218;
					if (local194 <= this.aClass4_Sub30_5.anInt6244) {
						if (this.aClass4_Sub1_Sub3_Sub1_2 == null) {
							this.aClass4_Sub30_5.anInt6244 = 0;
							local243 = this.aClass4_Sub30_5.method4864();
							local300 = this.aClass4_Sub30_5.method4877();
							@Pc(305) int local305 = this.aClass4_Sub30_5.method4864();
							@Pc(310) int local310 = this.aClass4_Sub30_5.method4872();
							@Pc(314) int local314 = local305 & 0x7F;
							@Pc(325) boolean local325 = (local305 & 0x80) != 0;
							@Pc(333) long local333 = (long) ((local243 << 16) + local300);
							@Pc(343) Class4_Sub1_Sub3_Sub1 local343;
							if (local325) {
								for (local343 = (Class4_Sub1_Sub3_Sub1) this.aClass140_7.method3014(); local343 != null && local333 != local343.aLong226; local343 = (Class4_Sub1_Sub3_Sub1) this.aClass140_7.method3018()) {
								}
							} else {
								for (local343 = (Class4_Sub1_Sub3_Sub1) this.aClass140_5.method3014(); local343 != null && local343.aLong226 != local333; local343 = (Class4_Sub1_Sub3_Sub1) this.aClass140_5.method3018()) {
								}
							}
							if (local343 == null) {
								throw new IOException();
							}
							this.aClass4_Sub1_Sub3_Sub1_2 = local343;
							@Pc(407) int local407 = local314 == 0 ? 5 : 9;
							this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1 = new Class4_Sub30(this.aClass4_Sub1_Sub3_Sub1_2.aByte12 + local407 + local310);
							this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.method4871(local314);
							this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.method4861(local310);
							this.aClass4_Sub1_Sub3_Sub1_2.anInt725 = 8;
							this.aClass4_Sub30_5.anInt6244 = 0;
						} else if (this.aClass4_Sub1_Sub3_Sub1_2.anInt725 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub30_5.aByteArray79[0] == -1) {
							this.aClass4_Sub30_5.anInt6244 = 0;
							this.aClass4_Sub1_Sub3_Sub1_2.anInt725 = 1;
						} else {
							this.aClass4_Sub1_Sub3_Sub1_2 = null;
						}
					}
				} else {
					local218 = this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.aByteArray79.length - this.aClass4_Sub1_Sub3_Sub1_2.aByte12;
					local243 = 512 - this.aClass4_Sub1_Sub3_Sub1_2.anInt725;
					if (local243 > local218 - this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.anInt6244) {
						local243 = local218 - this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.anInt6244;
					}
					if (local243 > local178) {
						local243 = local178;
					}
					this.aClass5_1.method122(this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.aByteArray79, local243, this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.anInt6244);
					if (this.aByte60 != 0) {
						for (local300 = 0; local300 < local243; local300++) {
							this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.aByteArray79[this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.anInt6244 + local300] ^= this.aByte60;
						}
					}
					this.aClass4_Sub1_Sub3_Sub1_2.anInt725 += local243;
					this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.anInt6244 += local243;
					if (local218 == this.aClass4_Sub1_Sub3_Sub1_2.aClass4_Sub30_1.anInt6244) {
						this.aClass4_Sub1_Sub3_Sub1_2.method5863();
						this.aClass4_Sub1_Sub3_Sub1_2.aBoolean330 = false;
						this.aClass4_Sub1_Sub3_Sub1_2 = null;
					} else if (this.aClass4_Sub1_Sub3_Sub1_2.anInt725 == 512) {
						this.aClass4_Sub1_Sub3_Sub1_2.anInt725 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(616) IOException local616) {
			try {
				this.aClass5_1.method119();
			} catch (@Pc(622) Exception local622) {
			}
			this.anInt3328 = -2;
			this.aClass5_1 = null;
			this.anInt3329++;
			return this.method2618() == 0 && this.method2609() == 0;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZLclient!ad;I)V")
	public void method2615(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5 arg1) {
		if (this.aClass5_1 != null) {
			try {
				this.aClass5_1.method119();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass5_1 = null;
		}
		this.aClass5_1 = arg1;
		this.method2610();
		this.method2608(arg0);
		this.aClass4_Sub30_5.anInt6244 = 0;
		this.aClass4_Sub1_Sub3_Sub1_2 = null;
		while (true) {
			@Pc(40) Class4_Sub1_Sub3_Sub1 local40 = (Class4_Sub1_Sub3_Sub1) this.aClass140_5.method3016();
			if (local40 == null) {
				while (true) {
					local40 = (Class4_Sub1_Sub3_Sub1) this.aClass140_7.method3016();
					if (local40 == null) {
						if (this.aByte60 != 0) {
							try {
								this.aClass4_Sub30_4.anInt6244 = 0;
								this.aClass4_Sub30_4.method4871(4);
								this.aClass4_Sub30_4.method4871(this.aByte60);
								this.aClass4_Sub30_4.method4846(0);
								this.aClass5_1.method124(this.aClass4_Sub30_4.aByteArray79, 4);
							} catch (@Pc(103) IOException local103) {
								try {
									this.aClass5_1.method119();
								} catch (@Pc(109) Exception local109) {
								}
								this.anInt3329++;
								this.aClass5_1 = null;
								this.anInt3328 = -2;
							}
						}
						this.anInt3327 = 0;
						this.aLong89 = Static199.method2845();
						return;
					}
					this.aClass140_6.method3015(local40);
				}
			}
			this.aClass140_4.method3015(local40);
		}
	}

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)I")
	public int method2618() {
		return this.aClass140_4.method3017() + this.aClass140_5.method3017();
	}
}
