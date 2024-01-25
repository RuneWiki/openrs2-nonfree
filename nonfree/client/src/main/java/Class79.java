import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class79 {

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "Lclient!kd;")
	private Class117 aClass117_1;

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
	private int anInt2288;

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "Lclient!mi;")
	private Class2_Sub9_Sub14_Sub1 aClass2_Sub9_Sub14_Sub1_1;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!lq;")
	private final Class129 aClass129_3 = new Class129();

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "Lclient!lq;")
	private final Class129 aClass129_4 = new Class129();

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "Lclient!lq;")
	private final Class129 aClass129_5 = new Class129();

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "Lclient!lq;")
	private final Class129 aClass129_6 = new Class129();

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "Lclient!ef;")
	private final Class2_Sub12 aClass2_Sub12_2 = new Class2_Sub12(4);

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "B")
	private byte aByte24 = 0;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
	public volatile int anInt2290 = 0;

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
	public volatile int anInt2289 = 0;

	@OriginalMember(owner = "client!gh", name = "A", descriptor = "Lclient!ef;")
	private final Class2_Sub12 aClass2_Sub12_3 = new Class2_Sub12(8);

	static {
		new Class140("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public void method2107() {
		if (this.aClass117_1 != null) {
			this.aClass117_1.method3280();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZIIB)Lclient!mi;")
	public Class2_Sub9_Sub14_Sub1 method2108(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) ((arg0 << 16) + arg2);
		@Pc(14) Class2_Sub9_Sub14_Sub1 local14 = new Class2_Sub9_Sub14_Sub1();
		local14.aLong211 = local10;
		local14.aBoolean559 = arg1;
		local14.aByte48 = arg3;
		if (arg1) {
			if (this.method2118() >= 20) {
				throw new RuntimeException();
			}
			this.aClass129_3.method3575(local14);
		} else if (this.method2113() < 20) {
			this.aClass129_5.method3575(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z")
	public boolean method2109() {
		return this.method2118() >= 20;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	public void method2110() {
		try {
			this.aClass117_1.method3278();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte24 = (byte) ((double) 255 * Math.random() + 1.0D);
		this.aClass117_1 = null;
		this.anInt2290++;
		this.anInt2289 = -1;
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
	public void method2111() {
		if (this.aClass117_1 != null) {
			this.aClass117_1.method3278();
		}
	}

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)I")
	private int method2113() {
		return this.aClass129_5.method3583() + this.aClass129_6.method3583();
	}

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)V")
	public void method2114() {
		if (this.aClass117_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub12_2.anInt3606 = 0;
			this.aClass2_Sub12_2.method3147(7);
			this.aClass2_Sub12_2.method3118(0);
			this.aClass117_1.method3279(4, this.aClass2_Sub12_2.aByteArray30);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass117_1.method3278();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass117_1 = null;
			this.anInt2290++;
			this.anInt2289 = -2;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)Z")
	public boolean method2115() {
		@Pc(13) int local13;
		if (this.aClass117_1 != null) {
			@Pc(7) long local7 = Static22.method285();
			local13 = (int) (local7 - this.aLong76);
			this.aLong76 = local7;
			if (local13 > 200) {
				local13 = 200;
			}
			this.anInt2288 += local13;
			if (this.anInt2288 > 30000) {
				try {
					this.aClass117_1.method3278();
				} catch (@Pc(37) Exception local37) {
				}
				this.aClass117_1 = null;
			}
		}
		if (this.aClass117_1 == null) {
			return this.method2118() == 0 && this.method2113() == 0;
		}
		try {
			this.aClass117_1.method3282();
			for (@Pc(75) Class2_Sub9_Sub14_Sub1 local75 = (Class2_Sub9_Sub14_Sub1) this.aClass129_3.method3577(); local75 != null; local75 = (Class2_Sub9_Sub14_Sub1) this.aClass129_3.method3578()) {
				this.aClass2_Sub12_2.anInt3606 = 0;
				this.aClass2_Sub12_2.method3147(1);
				this.aClass2_Sub12_2.method3118((int) local75.aLong211);
				this.aClass117_1.method3279(4, this.aClass2_Sub12_2.aByteArray30);
				this.aClass129_4.method3575(local75);
			}
			for (@Pc(121) Class2_Sub9_Sub14_Sub1 local121 = (Class2_Sub9_Sub14_Sub1) this.aClass129_5.method3577(); local121 != null; local121 = (Class2_Sub9_Sub14_Sub1) this.aClass129_5.method3578()) {
				this.aClass2_Sub12_2.anInt3606 = 0;
				this.aClass2_Sub12_2.method3147(0);
				this.aClass2_Sub12_2.method3118((int) local121.aLong211);
				this.aClass117_1.method3279(4, this.aClass2_Sub12_2.aByteArray30);
				this.aClass129_6.method3575(local121);
			}
			for (local13 = 0; local13 < 100; local13++) {
				@Pc(174) int local174 = this.aClass117_1.method3273();
				if (local174 < 0) {
					throw new IOException();
				}
				if (local174 == 0) {
					break;
				}
				this.anInt2288 = 0;
				@Pc(190) byte local190 = 0;
				if (this.aClass2_Sub9_Sub14_Sub1_1 == null) {
					local190 = 8;
				} else if (this.aClass2_Sub9_Sub14_Sub1_1.anInt4411 == 0) {
					local190 = 1;
				}
				@Pc(215) int local215;
				@Pc(243) int local243;
				@Pc(309) int local309;
				if (local190 > 0) {
					local215 = local190 - this.aClass2_Sub12_3.anInt3606;
					if (local174 < local215) {
						local215 = local174;
					}
					this.aClass117_1.method3274(this.aClass2_Sub12_3.anInt3606, local215, this.aClass2_Sub12_3.aByteArray30);
					if (this.aByte24 != 0) {
						for (local243 = 0; local243 < local215; local243++) {
							this.aClass2_Sub12_3.aByteArray30[this.aClass2_Sub12_3.anInt3606 + local243] = (byte) (this.aClass2_Sub12_3.aByteArray30[this.aClass2_Sub12_3.anInt3606 + local243] ^ this.aByte24);
						}
					}
					this.aClass2_Sub12_3.anInt3606 += local215;
					if (local190 <= this.aClass2_Sub12_3.anInt3606) {
						if (this.aClass2_Sub9_Sub14_Sub1_1 == null) {
							this.aClass2_Sub12_3.anInt3606 = 0;
							local243 = this.aClass2_Sub12_3.method3124();
							local309 = this.aClass2_Sub12_3.method3104();
							@Pc(314) int local314 = this.aClass2_Sub12_3.method3124();
							@Pc(319) int local319 = this.aClass2_Sub12_3.method3135();
							@Pc(323) int local323 = local314 & 0x7F;
							@Pc(334) boolean local334 = (local314 & 0x80) != 0;
							@Pc(341) long local341 = (long) ((local243 << 16) + local309);
							@Pc(351) Class2_Sub9_Sub14_Sub1 local351;
							if (local334) {
								for (local351 = (Class2_Sub9_Sub14_Sub1) this.aClass129_6.method3577(); local351 != null && local341 != local351.aLong211; local351 = (Class2_Sub9_Sub14_Sub1) this.aClass129_6.method3578()) {
								}
							} else {
								for (local351 = (Class2_Sub9_Sub14_Sub1) this.aClass129_4.method3577(); local351 != null && local341 != local351.aLong211; local351 = (Class2_Sub9_Sub14_Sub1) this.aClass129_4.method3578()) {
								}
							}
							if (local351 == null) {
								throw new IOException();
							}
							@Pc(407) int local407 = local323 == 0 ? 5 : 9;
							this.aClass2_Sub9_Sub14_Sub1_1 = local351;
							this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4 = new Class2_Sub12(this.aClass2_Sub9_Sub14_Sub1_1.aByte48 + local319 + local407);
							this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.method3147(local323);
							this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.method3162(local319);
							this.aClass2_Sub12_3.anInt3606 = 0;
							this.aClass2_Sub9_Sub14_Sub1_1.anInt4411 = 8;
						} else if (this.aClass2_Sub9_Sub14_Sub1_1.anInt4411 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub12_3.aByteArray30[0] == -1) {
							this.aClass2_Sub9_Sub14_Sub1_1.anInt4411 = 1;
							this.aClass2_Sub12_3.anInt3606 = 0;
						} else {
							this.aClass2_Sub9_Sub14_Sub1_1 = null;
						}
					}
				} else {
					local215 = this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.aByteArray30.length - this.aClass2_Sub9_Sub14_Sub1_1.aByte48;
					local243 = 512 - this.aClass2_Sub9_Sub14_Sub1_1.anInt4411;
					if (local215 - this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.anInt3606 < local243) {
						local243 = local215 - this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.anInt3606;
					}
					if (local174 < local243) {
						local243 = local174;
					}
					this.aClass117_1.method3274(this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.anInt3606, local243, this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.aByteArray30);
					if (this.aByte24 != 0) {
						for (local309 = 0; local309 < local243; local309++) {
							this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.aByteArray30[this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.anInt3606 + local309] ^= this.aByte24;
						}
					}
					this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.anInt3606 += local243;
					this.aClass2_Sub9_Sub14_Sub1_1.anInt4411 += local243;
					if (this.aClass2_Sub9_Sub14_Sub1_1.aClass2_Sub12_4.anInt3606 == local215) {
						this.aClass2_Sub9_Sub14_Sub1_1.method5600();
						this.aClass2_Sub9_Sub14_Sub1_1.aBoolean557 = false;
						this.aClass2_Sub9_Sub14_Sub1_1 = null;
					} else if (this.aClass2_Sub9_Sub14_Sub1_1.anInt4411 == 512) {
						this.aClass2_Sub9_Sub14_Sub1_1.anInt4411 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(638) IOException local638) {
			try {
				this.aClass117_1.method3278();
			} catch (@Pc(644) Exception local644) {
			}
			this.aClass117_1 = null;
			this.anInt2290++;
			this.anInt2289 = -2;
			return this.method2118() == 0 && this.method2113() == 0;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
	private void method2116() {
		if (this.aClass117_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub12_2.anInt3606 = 0;
			this.aClass2_Sub12_2.method3147(6);
			this.aClass2_Sub12_2.method3118(3);
			this.aClass117_1.method3279(4, this.aClass2_Sub12_2.aByteArray30);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass117_1.method3278();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt2289 = -2;
			this.anInt2290++;
			this.aClass117_1 = null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)Z")
	public boolean method2117() {
		return this.method2113() >= 20;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)I")
	public int method2118() {
		return this.aClass129_3.method3583() + this.aClass129_4.method3583();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!kd;ZZ)V")
	public void method2119(@OriginalArg(0) Class117 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass117_1 != null) {
			try {
				this.aClass117_1.method3278();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass117_1 = null;
		}
		this.aClass117_1 = arg0;
		this.method2116();
		this.method2121(arg1);
		this.aClass2_Sub12_3.anInt3606 = 0;
		this.aClass2_Sub9_Sub14_Sub1_1 = null;
		while (true) {
			@Pc(44) Class2_Sub9_Sub14_Sub1 local44 = (Class2_Sub9_Sub14_Sub1) this.aClass129_4.method3582();
			if (local44 == null) {
				while (true) {
					local44 = (Class2_Sub9_Sub14_Sub1) this.aClass129_6.method3582();
					if (local44 == null) {
						if (this.aByte24 != 0) {
							try {
								this.aClass2_Sub12_2.anInt3606 = 0;
								this.aClass2_Sub12_2.method3147(4);
								this.aClass2_Sub12_2.method3147(this.aByte24);
								this.aClass2_Sub12_2.method3158(0);
								this.aClass117_1.method3279(4, this.aClass2_Sub12_2.aByteArray30);
							} catch (@Pc(105) IOException local105) {
								try {
									this.aClass117_1.method3278();
								} catch (@Pc(115) Exception local115) {
								}
								this.anInt2289 = -2;
								this.aClass117_1 = null;
								this.anInt2290++;
							}
						}
						this.anInt2288 = 0;
						this.aLong76 = Static22.method285();
						return;
					}
					this.aClass129_5.method3575(local44);
				}
			}
			this.aClass129_3.method3575(local44);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BZ)V")
	public void method2121(@OriginalArg(1) boolean arg0) {
		if (this.aClass117_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub12_2.anInt3606 = 0;
			this.aClass2_Sub12_2.method3147(arg0 ? 2 : 3);
			this.aClass2_Sub12_2.method3118(0);
			this.aClass117_1.method3279(4, this.aClass2_Sub12_2.aByteArray30);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass117_1.method3278();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt2289 = -2;
			this.aClass117_1 = null;
			this.anInt2290++;
		}
	}
}
