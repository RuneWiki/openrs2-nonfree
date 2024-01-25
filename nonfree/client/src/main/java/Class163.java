import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class163 {

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
	private int anInt4876;

	@OriginalMember(owner = "client!jt", name = "y", descriptor = "Lclient!ok;")
	private Class239 aClass239_1;

	@OriginalMember(owner = "client!jt", name = "E", descriptor = "Lclient!mj;")
	private Class6_Sub2_Sub4_Sub2 aClass6_Sub2_Sub4_Sub2_2;

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "Lclient!kp;")
	private final Class180 aClass180_6 = new Class180();

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "Lclient!kp;")
	private final Class180 aClass180_7 = new Class180();

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "Lclient!kp;")
	private final Class180 aClass180_8 = new Class180();

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "Lclient!kp;")
	private final Class180 aClass180_9 = new Class180();

	@OriginalMember(owner = "client!jt", name = "v", descriptor = "Lclient!ji;")
	private final Class6_Sub21 aClass6_Sub21_2 = new Class6_Sub21(4);

	@OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
	public volatile int anInt4877 = 0;

	@OriginalMember(owner = "client!jt", name = "C", descriptor = "B")
	private byte aByte42 = 0;

	@OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
	public volatile int anInt4878 = 0;

	@OriginalMember(owner = "client!jt", name = "A", descriptor = "Lclient!ji;")
	private final Class6_Sub21 aClass6_Sub21_3 = new Class6_Sub21(8);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
	public void method4206() {
		if (this.aClass239_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub21_2.anInt7338 = 0;
			this.aClass6_Sub21_2.method6062(7);
			this.aClass6_Sub21_2.method6028(0);
			this.aClass239_1.method5552(this.aClass6_Sub21_2.aByteArray93, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass239_1.method5554();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass239_1 = null;
			this.anInt4877++;
			this.anInt4878 = -2;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)I")
	public int method4207() {
		return this.aClass180_6.method4469() + this.aClass180_7.method4469();
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBZII)Lclient!mj;")
	public Class6_Sub2_Sub4_Sub2 method4208(@OriginalArg(1) byte arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) ((arg3 << 16) + arg2);
		@Pc(20) Class6_Sub2_Sub4_Sub2 local20 = new Class6_Sub2_Sub4_Sub2();
		local20.aByte48 = arg0;
		local20.aBoolean398 = arg1;
		local20.aLong247 = local16;
		if (arg1) {
			if (this.method4207() >= 20) {
				throw new RuntimeException();
			}
			this.aClass180_6.method4468(local20);
		} else if (this.method4216() < 20) {
			this.aClass180_8.method4468(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)Z")
	public boolean method4209() {
		return this.method4207() >= 20;
	}

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "(B)V")
	public void method4210() {
		if (this.aClass239_1 != null) {
			this.aClass239_1.method5554();
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZ)V")
	public void method4211(@OriginalArg(1) boolean arg0) {
		if (this.aClass239_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub21_2.anInt7338 = 0;
			this.aClass6_Sub21_2.method6062(arg0 ? 2 : 3);
			this.aClass6_Sub21_2.method6028(0);
			this.aClass239_1.method5552(this.aClass6_Sub21_2.aByteArray93, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass239_1.method5554();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt4877++;
			this.aClass239_1 = null;
			this.anInt4878 = -2;
		}
	}

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)Z")
	public boolean method4213() {
		if (this.aClass239_1 != null) {
			@Pc(7) long local7 = Static8.method201();
			@Pc(13) int local13 = (int) (local7 - this.aLong132);
			if (local13 > 200) {
				local13 = 200;
			}
			this.aLong132 = local7;
			this.anInt4876 += local13;
			if (this.anInt4876 > 30000) {
				try {
					this.aClass239_1.method5554();
				} catch (@Pc(39) Exception local39) {
				}
				this.aClass239_1 = null;
			}
		}
		if (this.aClass239_1 == null) {
			return this.method4207() == 0 && this.method4216() == 0;
		}
		try {
			this.aClass239_1.method5555();
			for (@Pc(71) Class6_Sub2_Sub4_Sub2 local71 = (Class6_Sub2_Sub4_Sub2) this.aClass180_6.method4466(); local71 != null; local71 = (Class6_Sub2_Sub4_Sub2) this.aClass180_6.method4473()) {
				this.aClass6_Sub21_2.anInt7338 = 0;
				this.aClass6_Sub21_2.method6062(1);
				this.aClass6_Sub21_2.method6028((int) local71.aLong247);
				this.aClass239_1.method5552(this.aClass6_Sub21_2.aByteArray93, 4);
				this.aClass180_7.method4468(local71);
			}
			for (@Pc(117) Class6_Sub2_Sub4_Sub2 local117 = (Class6_Sub2_Sub4_Sub2) this.aClass180_8.method4466(); local117 != null; local117 = (Class6_Sub2_Sub4_Sub2) this.aClass180_8.method4473()) {
				this.aClass6_Sub21_2.anInt7338 = 0;
				this.aClass6_Sub21_2.method6062(0);
				this.aClass6_Sub21_2.method6028((int) local117.aLong247);
				this.aClass239_1.method5552(this.aClass6_Sub21_2.aByteArray93, 4);
				this.aClass180_9.method4468(local117);
			}
			for (@Pc(167) int local167 = 0; local167 < 100; local167++) {
				@Pc(174) int local174 = this.aClass239_1.method5553();
				if (local174 < 0) {
					throw new IOException();
				}
				if (local174 == 0) {
					break;
				}
				this.anInt4876 = 0;
				@Pc(190) byte local190 = 0;
				if (this.aClass6_Sub2_Sub4_Sub2_2 == null) {
					local190 = 8;
				} else if (this.aClass6_Sub2_Sub4_Sub2_2.anInt5711 == 0) {
					local190 = 1;
				}
				@Pc(212) int local212;
				@Pc(236) int local236;
				@Pc(297) int local297;
				if (local190 > 0) {
					local212 = local190 - this.aClass6_Sub21_3.anInt7338;
					if (local212 > local174) {
						local212 = local174;
					}
					this.aClass239_1.method5551(local212, this.aClass6_Sub21_3.aByteArray93, this.aClass6_Sub21_3.anInt7338);
					if (this.aByte42 != 0) {
						for (local236 = 0; local236 < local212; local236++) {
							this.aClass6_Sub21_3.aByteArray93[local236 + this.aClass6_Sub21_3.anInt7338] ^= this.aByte42;
						}
					}
					this.aClass6_Sub21_3.anInt7338 += local212;
					if (local190 <= this.aClass6_Sub21_3.anInt7338) {
						if (this.aClass6_Sub2_Sub4_Sub2_2 == null) {
							this.aClass6_Sub21_3.anInt7338 = 0;
							local236 = this.aClass6_Sub21_3.method6069();
							local297 = this.aClass6_Sub21_3.method6003();
							@Pc(302) int local302 = this.aClass6_Sub21_3.method6069();
							@Pc(307) int local307 = this.aClass6_Sub21_3.method6036();
							@Pc(311) int local311 = local302 & 0x7F;
							@Pc(319) boolean local319 = (local302 & 0x80) != 0;
							@Pc(326) long local326 = (long) (local297 + (local236 << 16));
							@Pc(336) Class6_Sub2_Sub4_Sub2 local336;
							if (local319) {
								for (local336 = (Class6_Sub2_Sub4_Sub2) this.aClass180_9.method4466(); local336 != null && local326 != local336.aLong247; local336 = (Class6_Sub2_Sub4_Sub2) this.aClass180_9.method4473()) {
								}
							} else {
								for (local336 = (Class6_Sub2_Sub4_Sub2) this.aClass180_7.method4466(); local336 != null && local336.aLong247 != local326; local336 = (Class6_Sub2_Sub4_Sub2) this.aClass180_7.method4473()) {
								}
							}
							if (local336 == null) {
								throw new IOException();
							}
							this.aClass6_Sub2_Sub4_Sub2_2 = local336;
							@Pc(392) int local392 = local311 == 0 ? 5 : 9;
							this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5 = new Class6_Sub21(local307 + local392 + this.aClass6_Sub2_Sub4_Sub2_2.aByte48);
							this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.method6062(local311);
							this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.method6033(local307);
							this.aClass6_Sub21_3.anInt7338 = 0;
							this.aClass6_Sub2_Sub4_Sub2_2.anInt5711 = 8;
						} else if (this.aClass6_Sub2_Sub4_Sub2_2.anInt5711 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub21_3.aByteArray93[0] == -1) {
							this.aClass6_Sub21_3.anInt7338 = 0;
							this.aClass6_Sub2_Sub4_Sub2_2.anInt5711 = 1;
						} else {
							this.aClass6_Sub2_Sub4_Sub2_2 = null;
						}
					}
				} else {
					local212 = this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.aByteArray93.length - this.aClass6_Sub2_Sub4_Sub2_2.aByte48;
					local236 = 512 - this.aClass6_Sub2_Sub4_Sub2_2.anInt5711;
					if (local212 - this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.anInt7338 < local236) {
						local236 = local212 - this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.anInt7338;
					}
					if (local174 < local236) {
						local236 = local174;
					}
					this.aClass239_1.method5551(local236, this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.aByteArray93, this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.anInt7338);
					if (this.aByte42 != 0) {
						for (local297 = 0; local297 < local236; local297++) {
							this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.aByteArray93[this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.anInt7338 + local297] = (byte) (this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.aByteArray93[this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.anInt7338 + local297] ^ this.aByte42);
						}
					}
					this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.anInt7338 += local236;
					this.aClass6_Sub2_Sub4_Sub2_2.anInt5711 += local236;
					if (local212 == this.aClass6_Sub2_Sub4_Sub2_2.aClass6_Sub21_5.anInt7338) {
						this.aClass6_Sub2_Sub4_Sub2_2.method7405();
						this.aClass6_Sub2_Sub4_Sub2_2.aBoolean400 = false;
						this.aClass6_Sub2_Sub4_Sub2_2 = null;
					} else if (this.aClass6_Sub2_Sub4_Sub2_2.anInt5711 == 512) {
						this.aClass6_Sub2_Sub4_Sub2_2.anInt5711 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(612) IOException local612) {
			try {
				this.aClass239_1.method5554();
			} catch (@Pc(618) Exception local618) {
			}
			this.anInt4877++;
			this.anInt4878 = -2;
			this.aClass239_1 = null;
			return this.method4207() == 0 && this.method4216() == 0;
		}
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V")
	public void method4214() {
		if (this.aClass239_1 != null) {
			this.aClass239_1.method5556();
		}
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(B)Z")
	public boolean method4215() {
		return this.method4216() >= 20;
	}

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "(B)I")
	private int method4216() {
		return this.aClass180_8.method4469() + this.aClass180_9.method4469();
	}

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)V")
	private void method4218() {
		if (this.aClass239_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub21_2.anInt7338 = 0;
			this.aClass6_Sub21_2.method6062(6);
			this.aClass6_Sub21_2.method6028(3);
			this.aClass239_1.method5552(this.aClass6_Sub21_2.aByteArray93, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass239_1.method5554();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass239_1 = null;
			this.anInt4877++;
			this.anInt4878 = -2;
		}
	}

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)V")
	public void method4219() {
		try {
			this.aClass239_1.method5554();
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass239_1 = null;
		this.anInt4878 = -1;
		this.anInt4877++;
		this.aByte42 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZZLclient!ok;)V")
	public void method4220(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class239 arg1) {
		if (this.aClass239_1 != null) {
			try {
				this.aClass239_1.method5554();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass239_1 = null;
		}
		this.aClass239_1 = arg1;
		this.method4218();
		this.method4211(arg0);
		this.aClass6_Sub21_3.anInt7338 = 0;
		this.aClass6_Sub2_Sub4_Sub2_2 = null;
		while (true) {
			@Pc(40) Class6_Sub2_Sub4_Sub2 local40 = (Class6_Sub2_Sub4_Sub2) this.aClass180_7.method4471();
			if (local40 == null) {
				while (true) {
					local40 = (Class6_Sub2_Sub4_Sub2) this.aClass180_9.method4471();
					if (local40 == null) {
						if (this.aByte42 != 0) {
							try {
								this.aClass6_Sub21_2.anInt7338 = 0;
								this.aClass6_Sub21_2.method6062(4);
								this.aClass6_Sub21_2.method6062(this.aByte42);
								this.aClass6_Sub21_2.method6052(0);
								this.aClass239_1.method5552(this.aClass6_Sub21_2.aByteArray93, 4);
							} catch (@Pc(103) IOException local103) {
								try {
									this.aClass239_1.method5554();
								} catch (@Pc(109) Exception local109) {
								}
								this.aClass239_1 = null;
								this.anInt4878 = -2;
								this.anInt4877++;
							}
						}
						this.anInt4876 = 0;
						this.aLong132 = Static8.method201();
						return;
					}
					this.aClass180_8.method4468(local40);
				}
			}
			this.aClass180_6.method4468(local40);
		}
	}
}
