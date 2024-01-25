import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class103 {

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
	private int anInt3118;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "Lclient!ur;")
	private Class253 aClass253_2;

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "Lclient!rd;")
	private Class10_Sub1_Sub13_Sub1 aClass10_Sub1_Sub13_Sub1_1;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Lclient!ju;")
	private final Class136 aClass136_3 = new Class136();

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "Lclient!ju;")
	private final Class136 aClass136_4 = new Class136();

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Lclient!ju;")
	private final Class136 aClass136_5 = new Class136();

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Lclient!ju;")
	private final Class136 aClass136_6 = new Class136();

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "Lclient!nn;")
	private final Class10_Sub8 aClass10_Sub8_5 = new Class10_Sub8(4);

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
	public volatile int anInt3119 = 0;

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "B")
	private byte aByte27 = 0;

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
	public volatile int anInt3120 = 0;

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "Lclient!nn;")
	private final Class10_Sub8 aClass10_Sub8_6 = new Class10_Sub8(8);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Z")
	public boolean method2589() {
		return this.method2595() >= 20;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Z")
	public boolean method2590() {
		@Pc(14) int local14;
		if (this.aClass253_2 != null) {
			@Pc(7) long local7 = Static220.method3314();
			local14 = (int) (local7 - this.aLong99);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong99 = local7;
			this.anInt3118 += local14;
			if (this.anInt3118 > 30000) {
				try {
					this.aClass253_2.method5484();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass253_2 = null;
			}
		}
		if (this.aClass253_2 == null) {
			return this.method2595() == 0 && this.method2600() == 0;
		}
		try {
			this.aClass253_2.method5492();
			for (@Pc(75) Class10_Sub1_Sub13_Sub1 local75 = (Class10_Sub1_Sub13_Sub1) this.aClass136_3.method3200(); local75 != null; local75 = (Class10_Sub1_Sub13_Sub1) this.aClass136_3.method3201()) {
				this.aClass10_Sub8_5.anInt2989 = 0;
				this.aClass10_Sub8_5.method2458(1);
				this.aClass10_Sub8_5.method2504((int) local75.aLong254);
				this.aClass253_2.method5494(4, this.aClass10_Sub8_5.aByteArray44);
				this.aClass136_4.method3197(local75);
			}
			for (@Pc(130) Class10_Sub1_Sub13_Sub1 local130 = (Class10_Sub1_Sub13_Sub1) this.aClass136_5.method3200(); local130 != null; local130 = (Class10_Sub1_Sub13_Sub1) this.aClass136_5.method3201()) {
				this.aClass10_Sub8_5.anInt2989 = 0;
				this.aClass10_Sub8_5.method2458(0);
				this.aClass10_Sub8_5.method2504((int) local130.aLong254);
				this.aClass253_2.method5494(4, this.aClass10_Sub8_5.aByteArray44);
				this.aClass136_6.method3197(local130);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(181) int local181 = this.aClass253_2.method5486();
				if (local181 < 0) {
					throw new IOException();
				}
				if (local181 == 0) {
					break;
				}
				this.anInt3118 = 0;
				@Pc(194) byte local194 = 0;
				if (this.aClass10_Sub1_Sub13_Sub1_1 == null) {
					local194 = 8;
				} else if (this.aClass10_Sub1_Sub13_Sub1_1.anInt5876 == 0) {
					local194 = 1;
				}
				@Pc(220) int local220;
				@Pc(226) int local226;
				@Pc(273) int local273;
				if (local194 <= 0) {
					local220 = this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.aByteArray44.length - this.aClass10_Sub1_Sub13_Sub1_1.aByte66;
					local226 = 512 - this.aClass10_Sub1_Sub13_Sub1_1.anInt5876;
					if (local226 > local220 - this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.anInt2989) {
						local226 = local220 - this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.anInt2989;
					}
					if (local226 > local181) {
						local226 = local181;
					}
					this.aClass253_2.method5487(this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.anInt2989, local226, this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.aByteArray44);
					if (this.aByte27 != 0) {
						for (local273 = 0; local273 < local226; local273++) {
							this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.aByteArray44[local273 + this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.anInt2989] ^= this.aByte27;
						}
					}
					this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.anInt2989 += local226;
					this.aClass10_Sub1_Sub13_Sub1_1.anInt5876 += local226;
					if (this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.anInt2989 == local220) {
						this.aClass10_Sub1_Sub13_Sub1_1.method5897();
						this.aClass10_Sub1_Sub13_Sub1_1.aBoolean383 = false;
						this.aClass10_Sub1_Sub13_Sub1_1 = null;
					} else if (this.aClass10_Sub1_Sub13_Sub1_1.anInt5876 == 512) {
						this.aClass10_Sub1_Sub13_Sub1_1.anInt5876 = 0;
					}
				} else {
					local220 = local194 - this.aClass10_Sub8_6.anInt2989;
					if (local220 > local181) {
						local220 = local181;
					}
					this.aClass253_2.method5487(this.aClass10_Sub8_6.anInt2989, local220, this.aClass10_Sub8_6.aByteArray44);
					if (this.aByte27 != 0) {
						for (local226 = 0; local226 < local220; local226++) {
							this.aClass10_Sub8_6.aByteArray44[local226 + this.aClass10_Sub8_6.anInt2989] ^= this.aByte27;
						}
					}
					this.aClass10_Sub8_6.anInt2989 += local220;
					if (local194 <= this.aClass10_Sub8_6.anInt2989) {
						if (this.aClass10_Sub1_Sub13_Sub1_1 == null) {
							this.aClass10_Sub8_6.anInt2989 = 0;
							local226 = this.aClass10_Sub8_6.method2502();
							local273 = this.aClass10_Sub8_6.method2485();
							@Pc(450) int local450 = this.aClass10_Sub8_6.method2502();
							@Pc(455) int local455 = this.aClass10_Sub8_6.method2459();
							@Pc(459) int local459 = local450 & 0x7F;
							@Pc(470) boolean local470 = (local450 & 0x80) != 0;
							@Pc(477) long local477 = (long) (local273 + (local226 << 16));
							@Pc(487) Class10_Sub1_Sub13_Sub1 local487;
							if (local470) {
								for (local487 = (Class10_Sub1_Sub13_Sub1) this.aClass136_6.method3200(); local487 != null && local487.aLong254 != local477; local487 = (Class10_Sub1_Sub13_Sub1) this.aClass136_6.method3201()) {
								}
							} else {
								for (local487 = (Class10_Sub1_Sub13_Sub1) this.aClass136_4.method3200(); local487 != null && local477 != local487.aLong254; local487 = (Class10_Sub1_Sub13_Sub1) this.aClass136_4.method3201()) {
								}
							}
							if (local487 == null) {
								throw new IOException();
							}
							@Pc(550) int local550 = local459 == 0 ? 5 : 9;
							this.aClass10_Sub1_Sub13_Sub1_1 = local487;
							this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12 = new Class10_Sub8(local455 + local550 + this.aClass10_Sub1_Sub13_Sub1_1.aByte66);
							this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.method2458(local459);
							this.aClass10_Sub1_Sub13_Sub1_1.aClass10_Sub8_12.method2506(local455);
							this.aClass10_Sub8_6.anInt2989 = 0;
							this.aClass10_Sub1_Sub13_Sub1_1.anInt5876 = 8;
						} else if (this.aClass10_Sub1_Sub13_Sub1_1.anInt5876 != 0) {
							throw new IOException();
						} else if (this.aClass10_Sub8_6.aByteArray44[0] == -1) {
							this.aClass10_Sub1_Sub13_Sub1_1.anInt5876 = 1;
							this.aClass10_Sub8_6.anInt2989 = 0;
						} else {
							this.aClass10_Sub1_Sub13_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(627) IOException local627) {
			try {
				this.aClass253_2.method5484();
			} catch (@Pc(633) Exception local633) {
			}
			this.aClass253_2 = null;
			this.anInt3120 = -2;
			this.anInt3119++;
			return this.method2595() == 0 && this.method2600() == 0;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	private void method2591() {
		if (this.aClass253_2 == null) {
			return;
		}
		try {
			this.aClass10_Sub8_5.anInt2989 = 0;
			this.aClass10_Sub8_5.method2458(6);
			this.aClass10_Sub8_5.method2504(3);
			this.aClass253_2.method5494(4, this.aClass10_Sub8_5.aByteArray44);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass253_2.method5484();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt3119++;
			this.aClass253_2 = null;
			this.anInt3120 = -2;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIIZB)Lclient!rd;")
	public Class10_Sub1_Sub13_Sub1 method2592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(14) Class10_Sub1_Sub13_Sub1 local14 = new Class10_Sub1_Sub13_Sub1();
		local14.aBoolean382 = arg2;
		local14.aLong254 = local10;
		local14.aByte66 = arg3;
		if (arg2) {
			if (this.method2595() >= 20) {
				throw new RuntimeException();
			}
			this.aClass136_3.method3197(local14);
		} else if (this.method2600() < 20) {
			this.aClass136_5.method3197(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Z")
	public boolean method2593() {
		return this.method2600() >= 20;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	public void method2594() {
		if (this.aClass253_2 == null) {
			return;
		}
		try {
			this.aClass10_Sub8_5.anInt2989 = 0;
			this.aClass10_Sub8_5.method2458(7);
			this.aClass10_Sub8_5.method2504(0);
			this.aClass253_2.method5494(4, this.aClass10_Sub8_5.aByteArray44);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass253_2.method5484();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass253_2 = null;
			this.anInt3120 = -2;
			this.anInt3119++;
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)I")
	public int method2595() {
		return this.aClass136_3.method3202() + this.aClass136_4.method3202();
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
	public void method2596() {
		if (this.aClass253_2 != null) {
			this.aClass253_2.method5488();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BZLclient!ur;)V")
	public void method2597(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class253 arg1) {
		if (this.aClass253_2 != null) {
			try {
				this.aClass253_2.method5484();
			} catch (@Pc(18) Exception local18) {
			}
			this.aClass253_2 = null;
		}
		this.aClass253_2 = arg1;
		this.method2591();
		this.method2599(arg0);
		this.aClass10_Sub8_6.anInt2989 = 0;
		this.aClass10_Sub1_Sub13_Sub1_1 = null;
		while (true) {
			@Pc(48) Class10_Sub1_Sub13_Sub1 local48 = (Class10_Sub1_Sub13_Sub1) this.aClass136_4.method3198();
			if (local48 == null) {
				while (true) {
					local48 = (Class10_Sub1_Sub13_Sub1) this.aClass136_6.method3198();
					if (local48 == null) {
						if (this.aByte27 != 0) {
							try {
								this.aClass10_Sub8_5.anInt2989 = 0;
								this.aClass10_Sub8_5.method2458(4);
								this.aClass10_Sub8_5.method2458(this.aByte27);
								this.aClass10_Sub8_5.method2509(0);
								this.aClass253_2.method5494(4, this.aClass10_Sub8_5.aByteArray44);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass253_2.method5484();
								} catch (@Pc(112) Exception local112) {
								}
								this.aClass253_2 = null;
								this.anInt3120 = -2;
								this.anInt3119++;
							}
						}
						this.anInt3118 = 0;
						this.aLong99 = Static220.method3314();
						return;
					}
					this.aClass136_5.method3197(local48);
				}
			}
			this.aClass136_3.method3197(local48);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZB)V")
	public void method2599(@OriginalArg(0) boolean arg0) {
		if (this.aClass253_2 == null) {
			return;
		}
		try {
			this.aClass10_Sub8_5.anInt2989 = 0;
			this.aClass10_Sub8_5.method2458(arg0 ? 2 : 3);
			this.aClass10_Sub8_5.method2504(0);
			this.aClass253_2.method5494(4, this.aClass10_Sub8_5.aByteArray44);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass253_2.method5484();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass253_2 = null;
			this.anInt3120 = -2;
			this.anInt3119++;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)I")
	private int method2600() {
		return this.aClass136_5.method3202() + this.aClass136_6.method3202();
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
	public void method2601() {
		try {
			this.aClass253_2.method5484();
		} catch (@Pc(9) Exception local9) {
		}
		this.aByte27 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt3119++;
		this.anInt3120 = -1;
		this.aClass253_2 = null;
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V")
	public void method2602() {
		if (this.aClass253_2 != null) {
			this.aClass253_2.method5484();
		}
	}
}
