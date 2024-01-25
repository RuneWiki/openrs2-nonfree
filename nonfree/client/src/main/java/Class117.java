import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class117 {

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "Lclient!qg;")
	private Class240 aClass240_1;

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
	private int anInt3158;

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "Lclient!pm;")
	private Class1_Sub2_Sub6_Sub2 aClass1_Sub2_Sub6_Sub2_1;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Lclient!rp;")
	private final Class259 aClass259_5 = new Class259();

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "Lclient!rp;")
	private final Class259 aClass259_6 = new Class259();

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "Lclient!rp;")
	private final Class259 aClass259_7 = new Class259();

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Lclient!rp;")
	private final Class259 aClass259_8 = new Class259();

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "Lclient!os;")
	private final Class1_Sub17 aClass1_Sub17_2 = new Class1_Sub17(4);

	@OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
	public volatile int anInt3160 = 0;

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
	public volatile int anInt3159 = 0;

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "B")
	private byte aByte50 = 0;

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "Lclient!os;")
	private final Class1_Sub17 aClass1_Sub17_3 = new Class1_Sub17(8);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public void method2919() {
		if (this.aClass240_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub17_2.anInt4872 = 0;
			this.aClass1_Sub17_2.method4451(7);
			this.aClass1_Sub17_2.method4460(0);
			this.aClass240_1.method6266(this.aClass1_Sub17_2.aByteArray58, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass240_1.method6260();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt3160++;
			this.aClass240_1 = null;
			this.anInt3159 = -2;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	public void method2920() {
		if (this.aClass240_1 != null) {
			this.aClass240_1.method6260();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BIIZZ)Lclient!pm;")
	public Class1_Sub2_Sub6_Sub2 method2921(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(10) long local10 = (long) (arg1 + (arg2 << 16));
		@Pc(14) Class1_Sub2_Sub6_Sub2 local14 = new Class1_Sub2_Sub6_Sub2();
		local14.aByte77 = arg0;
		local14.aLong228 = local10;
		local14.aBoolean496 = arg3;
		if (arg3) {
			if (this.method2934() >= 20) {
				throw new RuntimeException();
			}
			this.aClass259_5.method6656(local14);
		} else if (this.method2922() < 20) {
			this.aClass259_7.method6656(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)I")
	private int method2922() {
		return this.aClass259_7.method6655() + this.aClass259_8.method6655();
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	public void method2923() {
		try {
			this.aClass240_1.method6260();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt3159 = -1;
		this.anInt3160++;
		this.aClass240_1 = null;
		this.aByte50 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Z")
	public boolean method2925() {
		return this.method2934() >= 20;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLclient!qg;B)V")
	public void method2926(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class240 arg1) {
		if (this.aClass240_1 != null) {
			try {
				this.aClass240_1.method6260();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass240_1 = null;
		}
		this.aClass240_1 = arg1;
		this.method2929();
		this.method2933(arg0);
		this.aClass1_Sub17_3.anInt4872 = 0;
		this.aClass1_Sub2_Sub6_Sub2_1 = null;
		while (true) {
			@Pc(48) Class1_Sub2_Sub6_Sub2 local48 = (Class1_Sub2_Sub6_Sub2) this.aClass259_6.method6658();
			if (local48 == null) {
				while (true) {
					local48 = (Class1_Sub2_Sub6_Sub2) this.aClass259_8.method6658();
					if (local48 == null) {
						if (this.aByte50 != 0) {
							try {
								this.aClass1_Sub17_2.anInt4872 = 0;
								this.aClass1_Sub17_2.method4451(4);
								this.aClass1_Sub17_2.method4451(this.aByte50);
								this.aClass1_Sub17_2.method4473(0);
								this.aClass240_1.method6266(this.aClass1_Sub17_2.aByteArray58, 4);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass240_1.method6260();
								} catch (@Pc(112) Exception local112) {
								}
								this.aClass240_1 = null;
								this.anInt3159 = -2;
								this.anInt3160++;
							}
						}
						this.anInt3158 = 0;
						this.aLong80 = Static110.method2222();
						return;
					}
					this.aClass259_7.method6656(local48);
				}
			}
			this.aClass259_5.method6656(local48);
		}
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V")
	public void method2928() {
		if (this.aClass240_1 != null) {
			this.aClass240_1.method6259();
		}
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
	private void method2929() {
		if (this.aClass240_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub17_2.anInt4872 = 0;
			this.aClass1_Sub17_2.method4451(6);
			this.aClass1_Sub17_2.method4460(3);
			this.aClass240_1.method6266(this.aClass1_Sub17_2.aByteArray58, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass240_1.method6260();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass240_1 = null;
			this.anInt3159 = -2;
			this.anInt3160++;
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)Z")
	public boolean method2931() {
		return this.method2922() >= 20;
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)Z")
	public boolean method2932() {
		@Pc(13) int local13;
		if (this.aClass240_1 != null) {
			@Pc(7) long local7 = Static110.method2222();
			local13 = (int) (local7 - this.aLong80);
			if (local13 > 200) {
				local13 = 200;
			}
			this.aLong80 = local7;
			this.anInt3158 += local13;
			if (this.anInt3158 > 30000) {
				try {
					this.aClass240_1.method6260();
				} catch (@Pc(37) Exception local37) {
				}
				this.aClass240_1 = null;
			}
		}
		if (this.aClass240_1 == null) {
			return this.method2934() == 0 && this.method2922() == 0;
		}
		try {
			this.aClass240_1.method6262();
			for (@Pc(75) Class1_Sub2_Sub6_Sub2 local75 = (Class1_Sub2_Sub6_Sub2) this.aClass259_5.method6652(); local75 != null; local75 = (Class1_Sub2_Sub6_Sub2) this.aClass259_5.method6654()) {
				this.aClass1_Sub17_2.anInt4872 = 0;
				this.aClass1_Sub17_2.method4451(1);
				this.aClass1_Sub17_2.method4460((int) local75.aLong228);
				this.aClass240_1.method6266(this.aClass1_Sub17_2.aByteArray58, 4);
				this.aClass259_6.method6656(local75);
			}
			for (@Pc(127) Class1_Sub2_Sub6_Sub2 local127 = (Class1_Sub2_Sub6_Sub2) this.aClass259_7.method6652(); local127 != null; local127 = (Class1_Sub2_Sub6_Sub2) this.aClass259_7.method6654()) {
				this.aClass1_Sub17_2.anInt4872 = 0;
				this.aClass1_Sub17_2.method4451(0);
				this.aClass1_Sub17_2.method4460((int) local127.aLong228);
				this.aClass240_1.method6266(this.aClass1_Sub17_2.aByteArray58, 4);
				this.aClass259_8.method6656(local127);
			}
			for (local13 = 0; local13 < 100; local13++) {
				@Pc(176) int local176 = this.aClass240_1.method6264();
				if (local176 < 0) {
					throw new IOException();
				}
				if (local176 == 0) {
					break;
				}
				this.anInt3158 = 0;
				@Pc(192) byte local192 = 0;
				if (this.aClass1_Sub2_Sub6_Sub2_1 == null) {
					local192 = 8;
				} else if (this.aClass1_Sub2_Sub6_Sub2_1.anInt6722 == 0) {
					local192 = 1;
				}
				@Pc(216) int local216;
				@Pc(241) int local241;
				@Pc(298) int local298;
				if (local192 > 0) {
					local216 = local192 - this.aClass1_Sub17_3.anInt4872;
					if (local176 < local216) {
						local216 = local176;
					}
					this.aClass240_1.method6263(this.aClass1_Sub17_3.aByteArray58, local216, this.aClass1_Sub17_3.anInt4872);
					if (this.aByte50 != 0) {
						for (local241 = 0; local241 < local216; local241++) {
							this.aClass1_Sub17_3.aByteArray58[local241 + this.aClass1_Sub17_3.anInt4872] ^= this.aByte50;
						}
					}
					this.aClass1_Sub17_3.anInt4872 += local216;
					if (local192 <= this.aClass1_Sub17_3.anInt4872) {
						if (this.aClass1_Sub2_Sub6_Sub2_1 == null) {
							this.aClass1_Sub17_3.anInt4872 = 0;
							local241 = this.aClass1_Sub17_3.method4487();
							local298 = this.aClass1_Sub17_3.method4494();
							@Pc(303) int local303 = this.aClass1_Sub17_3.method4487();
							@Pc(308) int local308 = this.aClass1_Sub17_3.method4481();
							@Pc(312) int local312 = local303 & 0x7F;
							@Pc(320) boolean local320 = (local303 & 0x80) != 0;
							@Pc(327) long local327 = (long) ((local241 << 16) + local298);
							@Pc(337) Class1_Sub2_Sub6_Sub2 local337;
							if (local320) {
								for (local337 = (Class1_Sub2_Sub6_Sub2) this.aClass259_8.method6652(); local337 != null && local327 != local337.aLong228; local337 = (Class1_Sub2_Sub6_Sub2) this.aClass259_8.method6654()) {
								}
							} else {
								for (local337 = (Class1_Sub2_Sub6_Sub2) this.aClass259_6.method6652(); local337 != null && local337.aLong228 != local327; local337 = (Class1_Sub2_Sub6_Sub2) this.aClass259_6.method6654()) {
								}
							}
							if (local337 == null) {
								throw new IOException();
							}
							this.aClass1_Sub2_Sub6_Sub2_1 = local337;
							@Pc(400) int local400 = local312 == 0 ? 5 : 9;
							this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7 = new Class1_Sub17(local400 + local308 + this.aClass1_Sub2_Sub6_Sub2_1.aByte77);
							this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.method4451(local312);
							this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.method4489(local308);
							this.aClass1_Sub17_3.anInt4872 = 0;
							this.aClass1_Sub2_Sub6_Sub2_1.anInt6722 = 8;
						} else if (this.aClass1_Sub2_Sub6_Sub2_1.anInt6722 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub17_3.aByteArray58[0] == -1) {
							this.aClass1_Sub2_Sub6_Sub2_1.anInt6722 = 1;
							this.aClass1_Sub17_3.anInt4872 = 0;
						} else {
							this.aClass1_Sub2_Sub6_Sub2_1 = null;
						}
					}
				} else {
					local216 = this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.aByteArray58.length - this.aClass1_Sub2_Sub6_Sub2_1.aByte77;
					local241 = 512 - this.aClass1_Sub2_Sub6_Sub2_1.anInt6722;
					if (local216 - this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.anInt4872 < local241) {
						local241 = local216 - this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.anInt4872;
					}
					if (local176 < local241) {
						local241 = local176;
					}
					this.aClass240_1.method6263(this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.aByteArray58, local241, this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.anInt4872);
					if (this.aByte50 != 0) {
						for (local298 = 0; local298 < local241; local298++) {
							this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.aByteArray58[local298 + this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.anInt4872] ^= this.aByte50;
						}
					}
					this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.anInt4872 += local241;
					this.aClass1_Sub2_Sub6_Sub2_1.anInt6722 += local241;
					if (this.aClass1_Sub2_Sub6_Sub2_1.aClass1_Sub17_7.anInt4872 == local216) {
						this.aClass1_Sub2_Sub6_Sub2_1.method7390();
						this.aClass1_Sub2_Sub6_Sub2_1.aBoolean497 = false;
						this.aClass1_Sub2_Sub6_Sub2_1 = null;
					} else if (this.aClass1_Sub2_Sub6_Sub2_1.anInt6722 == 512) {
						this.aClass1_Sub2_Sub6_Sub2_1.anInt6722 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(608) IOException local608) {
			try {
				this.aClass240_1.method6260();
			} catch (@Pc(614) Exception local614) {
			}
			this.aClass240_1 = null;
			this.anInt3160++;
			this.anInt3159 = -2;
			return this.method2934() == 0 && this.method2922() == 0;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZI)V")
	public void method2933(@OriginalArg(0) boolean arg0) {
		if (this.aClass240_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub17_2.anInt4872 = 0;
			this.aClass1_Sub17_2.method4451(arg0 ? 2 : 3);
			this.aClass1_Sub17_2.method4460(0);
			this.aClass240_1.method6266(this.aClass1_Sub17_2.aByteArray58, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass240_1.method6260();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt3159 = -2;
			this.aClass240_1 = null;
			this.anInt3160++;
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)I")
	public int method2934() {
		return this.aClass259_5.method6655() + this.aClass259_6.method6655();
	}
}
