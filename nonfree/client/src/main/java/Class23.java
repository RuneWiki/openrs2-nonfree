import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class23 {

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "Lclient!jg;")
	private Class124 aClass124_1;

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
	private int anInt567;

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!bo", name = "F", descriptor = "Lclient!eb;")
	private Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "Lclient!ot;")
	private final Class174 aClass174_2 = new Class174();

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "Lclient!ot;")
	private final Class174 aClass174_3 = new Class174();

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Lclient!ot;")
	private final Class174 aClass174_4 = new Class174();

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "Lclient!ot;")
	private final Class174 aClass174_5 = new Class174();

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "Lclient!lk;")
	private final Class2_Sub13 aClass2_Sub13_3 = new Class2_Sub13(4);

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "B")
	private byte aByte6 = 0;

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
	public volatile int anInt568 = 0;

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "I")
	public volatile int anInt569 = 0;

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "Lclient!lk;")
	private final Class2_Sub13 aClass2_Sub13_4 = new Class2_Sub13(8);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Z")
	public boolean method632() {
		return this.method646() >= 20;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZLclient!jg;B)V")
	public void method634(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class124 arg1) {
		if (this.aClass124_1 != null) {
			try {
				this.aClass124_1.method2714();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass124_1 = null;
		}
		this.aClass124_1 = arg1;
		this.method645();
		this.method638(arg0);
		this.aClass2_Sub13_4.anInt4788 = 0;
		this.aClass2_Sub1_Sub3_Sub1_1 = null;
		while (true) {
			@Pc(46) Class2_Sub1_Sub3_Sub1 local46 = (Class2_Sub1_Sub3_Sub1) this.aClass174_3.method4104();
			if (local46 == null) {
				while (true) {
					local46 = (Class2_Sub1_Sub3_Sub1) this.aClass174_5.method4104();
					if (local46 == null) {
						if (this.aByte6 != 0) {
							try {
								this.aClass2_Sub13_3.anInt4788 = 0;
								this.aClass2_Sub13_3.method4207(4);
								this.aClass2_Sub13_3.method4207(this.aByte6);
								this.aClass2_Sub13_3.method4199(0);
								this.aClass124_1.method2717(4, this.aClass2_Sub13_3.aByteArray77);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass124_1.method2714();
								} catch (@Pc(113) Exception local113) {
								}
								this.anInt569 = -2;
								this.anInt568++;
								this.aClass124_1 = null;
							}
						}
						this.anInt567 = 0;
						this.aLong23 = Static51.method979();
						return;
					}
					this.aClass174_4.method4099(local46);
				}
			}
			this.aClass174_2.method4099(local46);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I")
	private int method635() {
		return this.aClass174_4.method4097() + this.aClass174_5.method4097();
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V")
	public void method637() {
		try {
			this.aClass124_1.method2714();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt569 = -1;
		this.anInt568++;
		this.aByte6 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass124_1 = null;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZB)V")
	public void method638(@OriginalArg(0) boolean arg0) {
		if (this.aClass124_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub13_3.anInt4788 = 0;
			this.aClass2_Sub13_3.method4207(arg0 ? 2 : 3);
			this.aClass2_Sub13_3.method4216(0);
			this.aClass124_1.method2717(4, this.aClass2_Sub13_3.aByteArray77);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass124_1.method2714();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt568++;
			this.anInt569 = -2;
			this.aClass124_1 = null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIZIB)Lclient!eb;")
	public Class2_Sub1_Sub3_Sub1 method639(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg2 + (arg0 << 16));
		@Pc(14) Class2_Sub1_Sub3_Sub1 local14 = new Class2_Sub1_Sub3_Sub1();
		local14.aLong209 = local10;
		local14.aBoolean432 = arg1;
		local14.aByte15 = arg3;
		if (arg1) {
			if (this.method646() >= 20) {
				throw new RuntimeException();
			}
			this.aClass174_2.method4099(local14);
		} else if (this.method635() < 20) {
			this.aClass174_4.method4099(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V")
	public void method640() {
		if (this.aClass124_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub13_3.anInt4788 = 0;
			this.aClass2_Sub13_3.method4207(7);
			this.aClass2_Sub13_3.method4216(0);
			this.aClass124_1.method2717(4, this.aClass2_Sub13_3.aByteArray77);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass124_1.method2714();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass124_1 = null;
			this.anInt569 = -2;
			this.anInt568++;
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V")
	public void method641() {
		if (this.aClass124_1 != null) {
			this.aClass124_1.method2715();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
	public void method642() {
		if (this.aClass124_1 != null) {
			this.aClass124_1.method2714();
		}
	}

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "(I)Z")
	public boolean method643() {
		@Pc(14) int local14;
		if (this.aClass124_1 != null) {
			@Pc(7) long local7 = Static51.method979();
			local14 = (int) (local7 - this.aLong23);
			this.aLong23 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt567 += local14;
			if (this.anInt567 > 30000) {
				try {
					this.aClass124_1.method2714();
				} catch (@Pc(38) Exception local38) {
				}
				this.aClass124_1 = null;
			}
		}
		if (this.aClass124_1 == null) {
			return this.method646() == 0 && this.method635() == 0;
		}
		try {
			this.aClass124_1.method2719();
			for (@Pc(75) Class2_Sub1_Sub3_Sub1 local75 = (Class2_Sub1_Sub3_Sub1) this.aClass174_2.method4102(); local75 != null; local75 = (Class2_Sub1_Sub3_Sub1) this.aClass174_2.method4098()) {
				this.aClass2_Sub13_3.anInt4788 = 0;
				this.aClass2_Sub13_3.method4207(1);
				this.aClass2_Sub13_3.method4216((int) local75.aLong209);
				this.aClass124_1.method2717(4, this.aClass2_Sub13_3.aByteArray77);
				this.aClass174_3.method4099(local75);
			}
			for (@Pc(123) Class2_Sub1_Sub3_Sub1 local123 = (Class2_Sub1_Sub3_Sub1) this.aClass174_4.method4102(); local123 != null; local123 = (Class2_Sub1_Sub3_Sub1) this.aClass174_4.method4098()) {
				this.aClass2_Sub13_3.anInt4788 = 0;
				this.aClass2_Sub13_3.method4207(0);
				this.aClass2_Sub13_3.method4216((int) local123.aLong209);
				this.aClass124_1.method2717(4, this.aClass2_Sub13_3.aByteArray77);
				this.aClass174_5.method4099(local123);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(174) int local174 = this.aClass124_1.method2716();
				if (local174 < 0) {
					throw new IOException();
				}
				if (local174 == 0) {
					break;
				}
				this.anInt567 = 0;
				@Pc(193) byte local193 = 0;
				if (this.aClass2_Sub1_Sub3_Sub1_1 == null) {
					local193 = 8;
				} else if (this.aClass2_Sub1_Sub3_Sub1_1.anInt1353 == 0) {
					local193 = 1;
				}
				@Pc(218) int local218;
				@Pc(243) int local243;
				@Pc(304) int local304;
				if (local193 > 0) {
					local218 = local193 - this.aClass2_Sub13_4.anInt4788;
					if (local174 < local218) {
						local218 = local174;
					}
					this.aClass124_1.method2720(this.aClass2_Sub13_4.aByteArray77, local218, this.aClass2_Sub13_4.anInt4788);
					if (this.aByte6 != 0) {
						for (local243 = 0; local243 < local218; local243++) {
							this.aClass2_Sub13_4.aByteArray77[local243 + this.aClass2_Sub13_4.anInt4788] ^= this.aByte6;
						}
					}
					this.aClass2_Sub13_4.anInt4788 += local218;
					if (local193 <= this.aClass2_Sub13_4.anInt4788) {
						if (this.aClass2_Sub1_Sub3_Sub1_1 == null) {
							this.aClass2_Sub13_4.anInt4788 = 0;
							local243 = this.aClass2_Sub13_4.method4240();
							local304 = this.aClass2_Sub13_4.method4245();
							@Pc(309) int local309 = this.aClass2_Sub13_4.method4240();
							@Pc(314) int local314 = this.aClass2_Sub13_4.method4239();
							@Pc(318) int local318 = local309 & 0x7F;
							@Pc(329) boolean local329 = (local309 & 0x80) != 0;
							@Pc(336) long local336 = (long) ((local243 << 16) + local304);
							@Pc(346) Class2_Sub1_Sub3_Sub1 local346;
							if (local329) {
								for (local346 = (Class2_Sub1_Sub3_Sub1) this.aClass174_5.method4102(); local346 != null && local336 != local346.aLong209; local346 = (Class2_Sub1_Sub3_Sub1) this.aClass174_5.method4098()) {
								}
							} else {
								for (local346 = (Class2_Sub1_Sub3_Sub1) this.aClass174_3.method4102(); local346 != null && local346.aLong209 != local336; local346 = (Class2_Sub1_Sub3_Sub1) this.aClass174_3.method4098()) {
								}
							}
							if (local346 == null) {
								throw new IOException();
							}
							this.aClass2_Sub1_Sub3_Sub1_1 = local346;
							@Pc(402) int local402 = local318 == 0 ? 5 : 9;
							this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6 = new Class2_Sub13(local314 + local402 + this.aClass2_Sub1_Sub3_Sub1_1.aByte15);
							this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.method4207(local318);
							this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.method4218(local314);
							this.aClass2_Sub13_4.anInt4788 = 0;
							this.aClass2_Sub1_Sub3_Sub1_1.anInt1353 = 8;
						} else if (this.aClass2_Sub1_Sub3_Sub1_1.anInt1353 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub13_4.aByteArray77[0] == -1) {
							this.aClass2_Sub1_Sub3_Sub1_1.anInt1353 = 1;
							this.aClass2_Sub13_4.anInt4788 = 0;
						} else {
							this.aClass2_Sub1_Sub3_Sub1_1 = null;
						}
					}
				} else {
					local218 = this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.aByteArray77.length - this.aClass2_Sub1_Sub3_Sub1_1.aByte15;
					local243 = 512 - this.aClass2_Sub1_Sub3_Sub1_1.anInt1353;
					if (local218 - this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.anInt4788 < local243) {
						local243 = local218 - this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.anInt4788;
					}
					if (local243 > local174) {
						local243 = local174;
					}
					this.aClass124_1.method2720(this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.aByteArray77, local243, this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.anInt4788);
					if (this.aByte6 != 0) {
						for (local304 = 0; local304 < local243; local304++) {
							this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.aByteArray77[local304 + this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.anInt4788] ^= this.aByte6;
						}
					}
					this.aClass2_Sub1_Sub3_Sub1_1.anInt1353 += local243;
					this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.anInt4788 += local243;
					if (local218 == this.aClass2_Sub1_Sub3_Sub1_1.aClass2_Sub13_6.anInt4788) {
						this.aClass2_Sub1_Sub3_Sub1_1.method5748();
						this.aClass2_Sub1_Sub3_Sub1_1.aBoolean434 = false;
						this.aClass2_Sub1_Sub3_Sub1_1 = null;
					} else if (this.aClass2_Sub1_Sub3_Sub1_1.anInt1353 == 512) {
						this.aClass2_Sub1_Sub3_Sub1_1.anInt1353 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(621) IOException local621) {
			try {
				this.aClass124_1.method2714();
			} catch (@Pc(627) Exception local627) {
			}
			this.anInt568++;
			this.aClass124_1 = null;
			this.anInt569 = -2;
			return this.method646() == 0 && this.method635() == 0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Z")
	public boolean method644() {
		return this.method635() >= 20;
	}

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "(I)V")
	private void method645() {
		if (this.aClass124_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub13_3.anInt4788 = 0;
			this.aClass2_Sub13_3.method4207(6);
			this.aClass2_Sub13_3.method4216(3);
			this.aClass124_1.method2717(4, this.aClass2_Sub13_3.aByteArray77);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass124_1.method2714();
			} catch (@Pc(40) Exception local40) {
			}
			this.anInt569 = -2;
			this.anInt568++;
			this.aClass124_1 = null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "(I)I")
	public int method646() {
		return this.aClass174_2.method4097() + this.aClass174_3.method4097();
	}
}
