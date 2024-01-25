import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class153 {

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "J")
	private long aLong128;

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "Lclient!wda;")
	private Class317 aClass317_3;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
	private int anInt4927;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "Lclient!bm;")
	private Class3_Sub10_Sub1_Sub1 aClass3_Sub10_Sub1_Sub1_1;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "Lclient!tf;")
	private final Class279 aClass279_3 = new Class279();

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "Lclient!tf;")
	private final Class279 aClass279_4 = new Class279();

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "Lclient!tf;")
	private final Class279 aClass279_5 = new Class279();

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "Lclient!tf;")
	private final Class279 aClass279_6 = new Class279();

	@OriginalMember(owner = "client!jq", name = "A", descriptor = "Lclient!rt;")
	private final Class3_Sub27 aClass3_Sub27_4 = new Class3_Sub27(4);

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "B")
	private byte aByte43 = 0;

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
	public volatile int anInt4929 = 0;

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
	public volatile int anInt4928 = 0;

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "Lclient!rt;")
	private final Class3_Sub27 aClass3_Sub27_5 = new Class3_Sub27(8);

	static {
		new Class67("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!wda;Z)V")
	public void method4114(@OriginalArg(1) Class317 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass317_3 != null) {
			try {
				this.aClass317_3.method7656();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass317_3 = null;
		}
		this.aClass317_3 = arg0;
		this.method4128();
		this.method4115(arg1);
		this.aClass3_Sub10_Sub1_Sub1_1 = null;
		this.aClass3_Sub27_5.anInt9191 = 0;
		while (true) {
			@Pc(40) Class3_Sub10_Sub1_Sub1 local40 = (Class3_Sub10_Sub1_Sub1) this.aClass279_4.method6909();
			if (local40 == null) {
				while (true) {
					local40 = (Class3_Sub10_Sub1_Sub1) this.aClass279_6.method6909();
					if (local40 == null) {
						if (this.aByte43 != 0) {
							try {
								this.aClass3_Sub27_4.anInt9191 = 0;
								this.aClass3_Sub27_4.method7576(4);
								this.aClass3_Sub27_4.method7576(this.aByte43);
								this.aClass3_Sub27_4.method7600(0, 30364);
								this.aClass317_3.method7653(4, this.aClass3_Sub27_4.aByteArray114);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass317_3.method7656();
								} catch (@Pc(112) Exception local112) {
								}
								this.anInt4929++;
								this.anInt4928 = -2;
								this.aClass317_3 = null;
							}
						}
						this.anInt4927 = 0;
						this.aLong128 = Static12.method647();
						return;
					}
					this.aClass279_5.method6910(local40);
				}
			}
			this.aClass279_3.method6910(local40);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZB)V")
	public void method4115(@OriginalArg(0) boolean arg0) {
		if (this.aClass317_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub27_4.anInt9191 = 0;
			this.aClass3_Sub27_4.method7576(arg0 ? 2 : 3);
			this.aClass3_Sub27_4.method7611(0);
			this.aClass317_3.method7653(4, this.aClass3_Sub27_4.aByteArray114);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass317_3.method7656();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass317_3 = null;
			this.anInt4928 = -2;
			this.anInt4929++;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBIIZ)Lclient!bm;")
	public Class3_Sub10_Sub1_Sub1 method4117(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) long local10 = (long) (arg2 + (arg0 << 16));
		@Pc(14) Class3_Sub10_Sub1_Sub1 local14 = new Class3_Sub10_Sub1_Sub1();
		local14.aByte5 = arg1;
		local14.aLong277 = local10;
		local14.aBoolean381 = arg3;
		if (arg3) {
			if (this.method4122() >= 20) {
				throw new RuntimeException();
			}
			this.aClass279_3.method6910(local14);
		} else if (this.method4127() < 20) {
			this.aClass279_5.method6910(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Z")
	public boolean method4118() {
		if (this.aClass317_3 != null) {
			@Pc(11) long local11 = Static12.method647();
			@Pc(18) int local18 = (int) (local11 - this.aLong128);
			this.aLong128 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt4927 += local18;
			if (this.anInt4927 > 30000) {
				try {
					this.aClass317_3.method7656();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass317_3 = null;
			}
		}
		if (this.aClass317_3 == null) {
			return this.method4122() == 0 && this.method4127() == 0;
		}
		try {
			this.aClass317_3.method7654();
			for (@Pc(76) Class3_Sub10_Sub1_Sub1 local76 = (Class3_Sub10_Sub1_Sub1) this.aClass279_3.method6908(); local76 != null; local76 = (Class3_Sub10_Sub1_Sub1) this.aClass279_3.method6906()) {
				this.aClass3_Sub27_4.anInt9191 = 0;
				this.aClass3_Sub27_4.method7576(1);
				this.aClass3_Sub27_4.method7611((int) local76.aLong277);
				this.aClass317_3.method7653(4, this.aClass3_Sub27_4.aByteArray114);
				this.aClass279_4.method6910(local76);
			}
			for (@Pc(122) Class3_Sub10_Sub1_Sub1 local122 = (Class3_Sub10_Sub1_Sub1) this.aClass279_5.method6908(); local122 != null; local122 = (Class3_Sub10_Sub1_Sub1) this.aClass279_5.method6906()) {
				this.aClass3_Sub27_4.anInt9191 = 0;
				this.aClass3_Sub27_4.method7576(0);
				this.aClass3_Sub27_4.method7611((int) local122.aLong277);
				this.aClass317_3.method7653(4, this.aClass3_Sub27_4.aByteArray114);
				this.aClass279_6.method6910(local122);
			}
			for (@Pc(172) int local172 = 0; local172 < 100; local172++) {
				@Pc(179) int local179 = this.aClass317_3.method7651();
				if (local179 < 0) {
					throw new IOException();
				}
				if (local179 == 0) {
					break;
				}
				this.anInt4927 = 0;
				@Pc(195) byte local195 = 0;
				if (this.aClass3_Sub10_Sub1_Sub1_1 == null) {
					local195 = 8;
				} else if (this.aClass3_Sub10_Sub1_Sub1_1.anInt988 == 0) {
					local195 = 1;
				}
				@Pc(223) int local223;
				@Pc(230) int local230;
				@Pc(276) int local276;
				if (local195 <= 0) {
					local223 = this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.aByteArray114.length - this.aClass3_Sub10_Sub1_Sub1_1.aByte5;
					local230 = 512 - this.aClass3_Sub10_Sub1_Sub1_1.anInt988;
					if (local230 > local223 - this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.anInt9191) {
						local230 = local223 - this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.anInt9191;
					}
					if (local230 > local179) {
						local230 = local179;
					}
					this.aClass317_3.method7650(this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.aByteArray114, this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.anInt9191, local230);
					if (this.aByte43 != 0) {
						for (local276 = 0; local276 < local230; local276++) {
							this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.aByteArray114[local276 + this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.anInt9191] ^= this.aByte43;
						}
					}
					this.aClass3_Sub10_Sub1_Sub1_1.anInt988 += local230;
					this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.anInt9191 += local230;
					if (local223 == this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.anInt9191) {
						this.aClass3_Sub10_Sub1_Sub1_1.method7643();
						this.aClass3_Sub10_Sub1_Sub1_1.aBoolean382 = false;
						this.aClass3_Sub10_Sub1_Sub1_1 = null;
					} else if (this.aClass3_Sub10_Sub1_Sub1_1.anInt988 == 512) {
						this.aClass3_Sub10_Sub1_Sub1_1.anInt988 = 0;
					}
				} else {
					local223 = local195 - this.aClass3_Sub27_5.anInt9191;
					if (local223 > local179) {
						local223 = local179;
					}
					this.aClass317_3.method7650(this.aClass3_Sub27_5.aByteArray114, this.aClass3_Sub27_5.anInt9191, local223);
					if (this.aByte43 != 0) {
						for (local230 = 0; local230 < local223; local230++) {
							this.aClass3_Sub27_5.aByteArray114[local230 + this.aClass3_Sub27_5.anInt9191] ^= this.aByte43;
						}
					}
					this.aClass3_Sub27_5.anInt9191 += local223;
					if (this.aClass3_Sub27_5.anInt9191 >= local195) {
						if (this.aClass3_Sub10_Sub1_Sub1_1 == null) {
							this.aClass3_Sub27_5.anInt9191 = 0;
							local230 = this.aClass3_Sub27_5.method7548();
							local276 = this.aClass3_Sub27_5.method7591();
							@Pc(459) int local459 = this.aClass3_Sub27_5.method7548();
							@Pc(464) int local464 = this.aClass3_Sub27_5.method7549();
							@Pc(468) int local468 = local459 & 0x7F;
							@Pc(479) boolean local479 = (local459 & 0x80) != 0;
							@Pc(486) long local486 = (long) ((local230 << 16) + local276);
							@Pc(496) Class3_Sub10_Sub1_Sub1 local496;
							if (local479) {
								for (local496 = (Class3_Sub10_Sub1_Sub1) this.aClass279_6.method6908(); local496 != null && local486 != local496.aLong277; local496 = (Class3_Sub10_Sub1_Sub1) this.aClass279_6.method6906()) {
								}
							} else {
								for (local496 = (Class3_Sub10_Sub1_Sub1) this.aClass279_4.method6908(); local496 != null && local496.aLong277 != local486; local496 = (Class3_Sub10_Sub1_Sub1) this.aClass279_4.method6906()) {
								}
							}
							if (local496 == null) {
								throw new IOException();
							}
							this.aClass3_Sub10_Sub1_Sub1_1 = local496;
							@Pc(563) int local563 = local468 == 0 ? 5 : 9;
							this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1 = new Class3_Sub27(local464 + local563 + this.aClass3_Sub10_Sub1_Sub1_1.aByte5);
							this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.method7576(local468);
							this.aClass3_Sub10_Sub1_Sub1_1.aClass3_Sub27_1.method7594(local464);
							this.aClass3_Sub27_5.anInt9191 = 0;
							this.aClass3_Sub10_Sub1_Sub1_1.anInt988 = 8;
						} else if (this.aClass3_Sub10_Sub1_Sub1_1.anInt988 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub27_5.aByteArray114[0] == -1) {
							this.aClass3_Sub27_5.anInt9191 = 0;
							this.aClass3_Sub10_Sub1_Sub1_1.anInt988 = 1;
						} else {
							this.aClass3_Sub10_Sub1_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(636) IOException local636) {
			try {
				this.aClass317_3.method7656();
			} catch (@Pc(642) Exception local642) {
			}
			this.anInt4929++;
			this.anInt4928 = -2;
			this.aClass317_3 = null;
			return this.method4122() == 0 && this.method4127() == 0;
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public void method4119() {
		if (this.aClass317_3 != null) {
			this.aClass317_3.method7657();
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)V")
	public void method4120() {
		if (this.aClass317_3 != null) {
			this.aClass317_3.method7656();
		}
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)I")
	public int method4122() {
		return this.aClass279_3.method6907() + this.aClass279_4.method6907();
	}

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V")
	public void method4123() {
		try {
			this.aClass317_3.method7656();
		} catch (@Pc(11) Exception local11) {
		}
		this.aByte43 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt4928 = -1;
		this.anInt4929++;
		this.aClass317_3 = null;
	}

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)Z")
	public boolean method4124() {
		return this.method4127() >= 20;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I")
	private int method4127() {
		return this.aClass279_5.method6907() + this.aClass279_6.method6907();
	}

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "(I)V")
	private void method4128() {
		if (this.aClass317_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub27_4.anInt9191 = 0;
			this.aClass3_Sub27_4.method7576(6);
			this.aClass3_Sub27_4.method7611(3);
			this.aClass317_3.method7653(4, this.aClass3_Sub27_4.aByteArray114);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass317_3.method7656();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass317_3 = null;
			this.anInt4929++;
			this.anInt4928 = -2;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	public void method4129() {
		if (this.aClass317_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub27_4.anInt9191 = 0;
			this.aClass3_Sub27_4.method7576(7);
			this.aClass3_Sub27_4.method7611(0);
			this.aClass317_3.method7653(4, this.aClass3_Sub27_4.aByteArray114);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass317_3.method7656();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt4929++;
			this.aClass317_3 = null;
			this.anInt4928 = -2;
		}
	}

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "(I)Z")
	public boolean method4130() {
		return this.method4122() >= 20;
	}
}
