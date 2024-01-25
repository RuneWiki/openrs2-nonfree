import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hja")
public final class Class153 {

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "Lclient!up;")
	private Class375 aClass375_2;

	@OriginalMember(owner = "client!hja", name = "G", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!hja", name = "r", descriptor = "I")
	private int anInt4576;

	@OriginalMember(owner = "client!hja", name = "x", descriptor = "Lclient!hc;")
	private Class3_Sub4_Sub10_Sub1 aClass3_Sub4_Sub10_Sub1_1;

	@OriginalMember(owner = "client!hja", name = "z", descriptor = "Lclient!pda;")
	private final Class283 aClass283_4 = new Class283();

	@OriginalMember(owner = "client!hja", name = "f", descriptor = "Lclient!pda;")
	private final Class283 aClass283_5 = new Class283();

	@OriginalMember(owner = "client!hja", name = "p", descriptor = "Lclient!pda;")
	private final Class283 aClass283_6 = new Class283();

	@OriginalMember(owner = "client!hja", name = "H", descriptor = "Lclient!pda;")
	private final Class283 aClass283_7 = new Class283();

	@OriginalMember(owner = "client!hja", name = "F", descriptor = "Lclient!rba;")
	private final Class3_Sub28 aClass3_Sub28_6 = new Class3_Sub28(4);

	@OriginalMember(owner = "client!hja", name = "d", descriptor = "I")
	public volatile int anInt4578 = 0;

	@OriginalMember(owner = "client!hja", name = "s", descriptor = "B")
	private byte aByte84 = 0;

	@OriginalMember(owner = "client!hja", name = "j", descriptor = "I")
	public volatile int anInt4577 = 0;

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "Lclient!rba;")
	private final Class3_Sub28 aClass3_Sub28_7 = new Class3_Sub28(8);

	@OriginalMember(owner = "client!hja", name = "c", descriptor = "(B)V")
	public void method3732() {
		if (this.aClass375_2 != null) {
			this.aClass375_2.method8810();
		}
	}

	@OriginalMember(owner = "client!hja", name = "c", descriptor = "(I)V")
	public void method3733() {
		if (this.aClass375_2 != null) {
			this.aClass375_2.method8811();
		}
	}

	@OriginalMember(owner = "client!hja", name = "e", descriptor = "(B)Z")
	public boolean method3734() {
		return this.method3744() >= 20;
	}

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "(Z)I")
	public int method3735() {
		return this.aClass283_4.method7032() + this.aClass283_5.method7032();
	}

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "(I)Z")
	public boolean method3736() {
		@Pc(18) int local18;
		if (this.aClass375_2 != null) {
			@Pc(11) long local11 = Static626.method8479();
			local18 = (int) (local11 - this.aLong157);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong157 = local11;
			this.anInt4576 += local18;
			if (this.anInt4576 > 30000) {
				try {
					this.aClass375_2.method8811();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass375_2 = null;
			}
		}
		if (this.aClass375_2 == null) {
			return this.method3735() == 0 && this.method3744() == 0;
		}
		try {
			this.aClass375_2.method8819();
			for (@Pc(80) Class3_Sub4_Sub10_Sub1 local80 = (Class3_Sub4_Sub10_Sub1) this.aClass283_4.method7031(); local80 != null; local80 = (Class3_Sub4_Sub10_Sub1) this.aClass283_4.method7035()) {
				this.aClass3_Sub28_6.anInt6241 = 0;
				this.aClass3_Sub28_6.method5329(1);
				this.aClass3_Sub28_6.method5317((int) local80.aLong363);
				this.aClass375_2.method8813(4, this.aClass3_Sub28_6.aByteArray50);
				this.aClass283_5.method7036(local80);
			}
			@Pc(128) Class3_Sub4_Sub10_Sub1 local128 = (Class3_Sub4_Sub10_Sub1) this.aClass283_6.method7031();
			if (127 <= 122) {
				this.anInt4576 = 78;
			}
			while (local128 != null) {
				this.aClass3_Sub28_6.anInt6241 = 0;
				this.aClass3_Sub28_6.method5329(0);
				this.aClass3_Sub28_6.method5317((int) local128.aLong363);
				this.aClass375_2.method8813(4, this.aClass3_Sub28_6.aByteArray50);
				this.aClass283_7.method7036(local128);
				local128 = (Class3_Sub4_Sub10_Sub1) this.aClass283_6.method7035();
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(193) int local193 = this.aClass375_2.method8814();
				if (local193 < 0) {
					throw new IOException();
				}
				if (local193 == 0) {
					break;
				}
				this.anInt4576 = 0;
				@Pc(209) byte local209 = 0;
				if (this.aClass3_Sub4_Sub10_Sub1_1 == null) {
					local209 = 8;
				} else if (this.aClass3_Sub4_Sub10_Sub1_1.anInt4383 == 0) {
					local209 = 1;
				}
				@Pc(237) int local237;
				@Pc(243) int local243;
				@Pc(290) int local290;
				if (local209 <= 0) {
					local237 = this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.aByteArray50.length - this.aClass3_Sub4_Sub10_Sub1_1.aByte77;
					local243 = 512 - this.aClass3_Sub4_Sub10_Sub1_1.anInt4383;
					if (local243 > local237 - this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.anInt6241) {
						local243 = local237 - this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.anInt6241;
					}
					if (local243 > local193) {
						local243 = local193;
					}
					this.aClass375_2.method8817(this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.anInt6241, local243, this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.aByteArray50);
					if (this.aByte84 != 0) {
						for (local290 = 0; local290 < local243; local290++) {
							this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.aByteArray50[local290 + this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.anInt6241] ^= this.aByte84;
						}
					}
					this.aClass3_Sub4_Sub10_Sub1_1.anInt4383 += local243;
					this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.anInt6241 += local243;
					if (local237 == this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.anInt6241) {
						this.aClass3_Sub4_Sub10_Sub1_1.method8848();
						this.aClass3_Sub4_Sub10_Sub1_1.aBoolean389 = false;
						this.aClass3_Sub4_Sub10_Sub1_1 = null;
					} else if (this.aClass3_Sub4_Sub10_Sub1_1.anInt4383 == 512) {
						this.aClass3_Sub4_Sub10_Sub1_1.anInt4383 = 0;
					}
				} else {
					local237 = local209 - this.aClass3_Sub28_7.anInt6241;
					if (local193 < local237) {
						local237 = local193;
					}
					this.aClass375_2.method8817(this.aClass3_Sub28_7.anInt6241, local237, this.aClass3_Sub28_7.aByteArray50);
					if (this.aByte84 != 0) {
						for (local243 = 0; local243 < local237; local243++) {
							this.aClass3_Sub28_7.aByteArray50[this.aClass3_Sub28_7.anInt6241 + local243] ^= this.aByte84;
						}
					}
					this.aClass3_Sub28_7.anInt6241 += local237;
					if (local209 <= this.aClass3_Sub28_7.anInt6241) {
						if (this.aClass3_Sub4_Sub10_Sub1_1 == null) {
							this.aClass3_Sub28_7.anInt6241 = 0;
							local243 = this.aClass3_Sub28_7.method5322(-20);
							local290 = this.aClass3_Sub28_7.method5272();
							@Pc(489) int local489 = this.aClass3_Sub28_7.method5322(-17);
							@Pc(494) int local494 = this.aClass3_Sub28_7.method5312();
							@Pc(498) int local498 = local489 & 0x7F;
							@Pc(507) boolean local507 = (local489 & 0x80) != 0;
							@Pc(514) long local514 = (long) ((local243 << 16) + local290);
							@Pc(524) Class3_Sub4_Sub10_Sub1 local524;
							if (local507) {
								for (local524 = (Class3_Sub4_Sub10_Sub1) this.aClass283_7.method7031(); local524 != null && local524.aLong363 != local514; local524 = (Class3_Sub4_Sub10_Sub1) this.aClass283_7.method7035()) {
								}
							} else {
								for (local524 = (Class3_Sub4_Sub10_Sub1) this.aClass283_5.method7031(); local524 != null && local524.aLong363 != local514; local524 = (Class3_Sub4_Sub10_Sub1) this.aClass283_5.method7035()) {
								}
							}
							if (local524 == null) {
								throw new IOException();
							}
							@Pc(604) int local604 = local498 == 0 ? 5 : 9;
							this.aClass3_Sub4_Sub10_Sub1_1 = local524;
							this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5 = new Class3_Sub28(local494 + local604 + this.aClass3_Sub4_Sub10_Sub1_1.aByte77);
							this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.method5329(local498);
							this.aClass3_Sub4_Sub10_Sub1_1.aClass3_Sub28_5.method5311(local494);
							this.aClass3_Sub28_7.anInt6241 = 0;
							this.aClass3_Sub4_Sub10_Sub1_1.anInt4383 = 8;
						} else if (this.aClass3_Sub4_Sub10_Sub1_1.anInt4383 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub28_7.aByteArray50[0] == -1) {
							this.aClass3_Sub28_7.anInt6241 = 0;
							this.aClass3_Sub4_Sub10_Sub1_1.anInt4383 = 1;
						} else {
							this.aClass3_Sub4_Sub10_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(695) IOException local695) {
			try {
				this.aClass375_2.method8811();
			} catch (@Pc(701) Exception local701) {
			}
			this.anInt4578++;
			this.anInt4577 = -2;
			this.aClass375_2 = null;
			return this.method3735() == 0 && this.method3744() == 0;
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(Z)V")
	public void method3737() {
		if (this.aClass375_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub28_6.anInt6241 = 0;
			this.aClass3_Sub28_6.method5329(7);
			this.aClass3_Sub28_6.method5317(0);
			this.aClass375_2.method8813(4, this.aClass3_Sub28_6.aByteArray50);
		} catch (@Pc(33) IOException local33) {
			try {
				this.aClass375_2.method8811();
			} catch (@Pc(39) Exception local39) {
			}
			this.anInt4578++;
			this.anInt4577 = -2;
			this.aClass375_2 = null;
		}
	}

	@OriginalMember(owner = "client!hja", name = "d", descriptor = "(B)V")
	private void method3739() {
		if (this.aClass375_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub28_6.anInt6241 = 0;
			this.aClass3_Sub28_6.method5329(6);
			this.aClass3_Sub28_6.method5317(3);
			this.aClass375_2.method8813(4, this.aClass3_Sub28_6.aByteArray50);
		} catch (@Pc(45) IOException local45) {
			try {
				this.aClass375_2.method8811();
			} catch (@Pc(51) Exception local51) {
			}
			this.anInt4577 = -2;
			this.aClass375_2 = null;
			this.anInt4578++;
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(ZZ)V")
	public void method3740(@OriginalArg(0) boolean arg0) {
		if (this.aClass375_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub28_6.anInt6241 = 0;
			this.aClass3_Sub28_6.method5329(arg0 ? 2 : 3);
			this.aClass3_Sub28_6.method5317(0);
			this.aClass375_2.method8813(4, this.aClass3_Sub28_6.aByteArray50);
		} catch (@Pc(46) IOException local46) {
			try {
				this.aClass375_2.method8811();
			} catch (@Pc(52) Exception local52) {
			}
			this.anInt4577 = -2;
			this.aClass375_2 = null;
			this.anInt4578++;
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(Lclient!up;BZ)V")
	public void method3741(@OriginalArg(0) Class375 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass375_2 != null) {
			try {
				this.aClass375_2.method8811();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass375_2 = null;
		}
		this.aClass375_2 = arg0;
		this.method3739();
		this.method3740(arg1);
		this.aClass3_Sub28_7.anInt6241 = 0;
		this.aClass3_Sub4_Sub10_Sub1_1 = null;
		while (true) {
			@Pc(40) Class3_Sub4_Sub10_Sub1 local40 = (Class3_Sub4_Sub10_Sub1) this.aClass283_5.method7034();
			if (local40 == null) {
				while (true) {
					local40 = (Class3_Sub4_Sub10_Sub1) this.aClass283_7.method7034();
					if (local40 == null) {
						if (this.aByte84 != 0) {
							try {
								this.aClass3_Sub28_6.anInt6241 = 0;
								this.aClass3_Sub28_6.method5329(4);
								this.aClass3_Sub28_6.method5329(this.aByte84);
								this.aClass3_Sub28_6.method5282(0);
								this.aClass375_2.method8813(4, this.aClass3_Sub28_6.aByteArray50);
							} catch (@Pc(112) IOException local112) {
								try {
									this.aClass375_2.method8811();
								} catch (@Pc(118) Exception local118) {
								}
								this.anInt4578++;
								this.anInt4577 = -2;
								this.aClass375_2 = null;
							}
						}
						this.anInt4576 = 0;
						this.aLong157 = Static626.method8479();
						return;
					}
					this.aClass283_6.method7036(local40);
				}
			}
			this.aClass283_4.method7036(local40);
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)Z")
	public boolean method3743() {
		return this.method3735() >= 20;
	}

	@OriginalMember(owner = "client!hja", name = "d", descriptor = "(I)I")
	private int method3744() {
		return this.aClass283_6.method7032() + this.aClass283_7.method7032();
	}

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "(B)V")
	public void method3746() {
		try {
			this.aClass375_2.method8811();
		} catch (@Pc(14) Exception local14) {
		}
		this.aClass375_2 = null;
		this.anInt4577 = -1;
		this.aByte84 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.anInt4578++;
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(IZIBB)Lclient!hc;")
	public Class3_Sub4_Sub10_Sub1 method3747(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(10) long local10 = (long) (arg2 + (arg0 << 16));
		@Pc(20) Class3_Sub4_Sub10_Sub1 local20 = new Class3_Sub4_Sub10_Sub1();
		local20.aByte77 = arg3;
		local20.aBoolean388 = arg1;
		local20.aLong363 = local10;
		if (arg1) {
			if (this.method3735() >= 20) {
				throw new RuntimeException();
			}
			this.aClass283_4.method7036(local20);
		} else if (this.method3744() < 20) {
			this.aClass283_6.method7036(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}
}
