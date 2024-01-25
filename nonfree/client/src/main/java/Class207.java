import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class207 {

	@OriginalMember(owner = "client!lfa", name = "u", descriptor = "I")
	private int anInt5472;

	@OriginalMember(owner = "client!lfa", name = "w", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!lfa", name = "x", descriptor = "Lclient!fv;")
	private Class111 aClass111_1;

	@OriginalMember(owner = "client!lfa", name = "C", descriptor = "Lclient!ve;")
	private Class4_Sub7_Sub7_Sub2 aClass4_Sub7_Sub7_Sub2_1;

	@OriginalMember(owner = "client!lfa", name = "q", descriptor = "Lclient!rda;")
	private final Class286 aClass286_7 = new Class286();

	@OriginalMember(owner = "client!lfa", name = "r", descriptor = "Lclient!rda;")
	private final Class286 aClass286_8 = new Class286();

	@OriginalMember(owner = "client!lfa", name = "s", descriptor = "Lclient!rda;")
	private final Class286 aClass286_9 = new Class286();

	@OriginalMember(owner = "client!lfa", name = "t", descriptor = "Lclient!rda;")
	private final Class286 aClass286_10 = new Class286();

	@OriginalMember(owner = "client!lfa", name = "v", descriptor = "Lclient!eh;")
	private final Class4_Sub9 aClass4_Sub9_3 = new Class4_Sub9(4);

	@OriginalMember(owner = "client!lfa", name = "z", descriptor = "B")
	private byte aByte69 = 0;

	@OriginalMember(owner = "client!lfa", name = "A", descriptor = "I")
	public volatile int anInt5474 = 0;

	@OriginalMember(owner = "client!lfa", name = "y", descriptor = "I")
	public volatile int anInt5473 = 0;

	@OriginalMember(owner = "client!lfa", name = "B", descriptor = "Lclient!eh;")
	private final Class4_Sub9 aClass4_Sub9_4 = new Class4_Sub9(8);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILclient!fv;Z)V")
	public void method4627(@OriginalArg(1) Class111 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass111_1 != null) {
			try {
				this.aClass111_1.method3090();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass111_1 = null;
		}
		this.aClass111_1 = arg0;
		this.method4630();
		this.method4639(arg1);
		this.aClass4_Sub7_Sub7_Sub2_1 = null;
		this.aClass4_Sub9_4.anInt7219 = 0;
		while (true) {
			@Pc(40) Class4_Sub7_Sub7_Sub2 local40 = (Class4_Sub7_Sub7_Sub2) this.aClass286_8.method6405();
			if (local40 == null) {
				while (true) {
					local40 = (Class4_Sub7_Sub7_Sub2) this.aClass286_10.method6405();
					if (local40 == null) {
						if (this.aByte69 != 0) {
							try {
								this.aClass4_Sub9_3.anInt7219 = 0;
								this.aClass4_Sub9_3.method5961(-345277664, 4);
								this.aClass4_Sub9_3.method5961(-345277664, this.aByte69);
								this.aClass4_Sub9_3.method6012(0);
								this.aClass111_1.method3085(this.aClass4_Sub9_3.aByteArray97, 4);
							} catch (@Pc(101) IOException local101) {
								try {
									this.aClass111_1.method3090();
								} catch (@Pc(107) Exception local107) {
								}
								this.anInt5474++;
								this.anInt5473 = -2;
								this.aClass111_1 = null;
							}
						}
						this.anInt5472 = 0;
						this.aLong154 = Static184.method3422();
						return;
					}
					this.aClass286_9.method6409(local40);
				}
			}
			this.aClass286_7.method6409(local40);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)Z")
	public boolean method4628() {
		return this.method4634() >= 20;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Z)V")
	public void method4629() {
		if (this.aClass111_1 != null) {
			this.aClass111_1.method3092();
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(B)V")
	private void method4630() {
		if (this.aClass111_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub9_3.anInt7219 = 0;
			this.aClass4_Sub9_3.method5961(-345277664, 6);
			this.aClass4_Sub9_3.method6022(3);
			this.aClass111_1.method3085(this.aClass4_Sub9_3.aByteArray97, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass111_1.method3090();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass111_1 = null;
			this.anInt5473 = -2;
			this.anInt5474++;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(B)V")
	public void method4632() {
		try {
			this.aClass111_1.method3090();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass111_1 = null;
		this.anInt5473 = -1;
		this.aByte69 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5474++;
	}

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "(B)I")
	private int method4634() {
		return this.aClass286_9.method6406() + this.aClass286_10.method6406();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZBIB)Lclient!ve;")
	public Class4_Sub7_Sub7_Sub2 method4635(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(10) long local10 = (long) (arg3 + (arg0 << 16));
		@Pc(21) Class4_Sub7_Sub7_Sub2 local21 = new Class4_Sub7_Sub7_Sub2();
		local21.aLong303 = local10;
		local21.aBoolean643 = arg1;
		local21.aByte106 = arg2;
		if (arg1) {
			if (this.method4636() >= 20) {
				throw new RuntimeException();
			}
			this.aClass286_7.method6409(local21);
		} else if (this.method4634() < 20) {
			this.aClass286_9.method6409(local21);
		} else {
			throw new RuntimeException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)I")
	public int method4636() {
		return this.aClass286_7.method6406() + this.aClass286_8.method6406();
	}

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)V")
	public void method4637() {
		if (this.aClass111_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub9_3.anInt7219 = 0;
			this.aClass4_Sub9_3.method5961(-345277664, 7);
			this.aClass4_Sub9_3.method6022(0);
			this.aClass111_1.method3085(this.aClass4_Sub9_3.aByteArray97, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass111_1.method3090();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt5474++;
			this.anInt5473 = -2;
			this.aClass111_1 = null;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)Z")
	public boolean method4638() {
		@Pc(14) int local14;
		if (this.aClass111_1 != null) {
			@Pc(7) long local7 = Static184.method3422();
			local14 = (int) (local7 - this.aLong154);
			this.aLong154 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt5472 += local14;
			if (this.anInt5472 > 30000) {
				try {
					this.aClass111_1.method3090();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass111_1 = null;
			}
		}
		if (this.aClass111_1 == null) {
			return this.method4636() == 0 && this.method4634() == 0;
		}
		try {
			this.aClass111_1.method3089();
			for (@Pc(75) Class4_Sub7_Sub7_Sub2 local75 = (Class4_Sub7_Sub7_Sub2) this.aClass286_7.method6403(); local75 != null; local75 = (Class4_Sub7_Sub7_Sub2) this.aClass286_7.method6414()) {
				this.aClass4_Sub9_3.anInt7219 = 0;
				this.aClass4_Sub9_3.method5961(-345277664, 1);
				this.aClass4_Sub9_3.method6022((int) local75.aLong303);
				this.aClass111_1.method3085(this.aClass4_Sub9_3.aByteArray97, 4);
				this.aClass286_8.method6409(local75);
			}
			for (@Pc(127) Class4_Sub7_Sub7_Sub2 local127 = (Class4_Sub7_Sub7_Sub2) this.aClass286_9.method6403(); local127 != null; local127 = (Class4_Sub7_Sub7_Sub2) this.aClass286_9.method6414()) {
				this.aClass4_Sub9_3.anInt7219 = 0;
				this.aClass4_Sub9_3.method5961(-345277664, 0);
				this.aClass4_Sub9_3.method6022((int) local127.aLong303);
				this.aClass111_1.method3085(this.aClass4_Sub9_3.aByteArray97, 4);
				this.aClass286_10.method6409(local127);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(180) int local180 = this.aClass111_1.method3088();
				if (local180 < 0) {
					throw new IOException();
				}
				if (local180 == 0) {
					break;
				}
				this.anInt5472 = 0;
				@Pc(199) byte local199 = 0;
				if (this.aClass4_Sub7_Sub7_Sub2_1 == null) {
					local199 = 8;
				} else if (this.aClass4_Sub7_Sub7_Sub2_1.anInt9269 == 0) {
					local199 = 1;
				}
				@Pc(231) int local231;
				@Pc(238) int local238;
				@Pc(278) int local278;
				if (local199 <= 0) {
					local231 = this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.aByteArray97.length - this.aClass4_Sub7_Sub7_Sub2_1.aByte106;
					local238 = 512 - this.aClass4_Sub7_Sub7_Sub2_1.anInt9269;
					if (local231 - this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.anInt7219 < local238) {
						local238 = local231 - this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.anInt7219;
					}
					if (local180 < local238) {
						local238 = local180;
					}
					this.aClass111_1.method3084(local238, this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.aByteArray97, this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.anInt7219);
					if (this.aByte69 != 0) {
						for (local278 = 0; local278 < local238; local278++) {
							this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.aByteArray97[local278 + this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.anInt7219] ^= this.aByte69;
						}
					}
					this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.anInt7219 += local238;
					this.aClass4_Sub7_Sub7_Sub2_1.anInt9269 += local238;
					if (local231 == this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.anInt7219) {
						this.aClass4_Sub7_Sub7_Sub2_1.method7963();
						this.aClass4_Sub7_Sub7_Sub2_1.aBoolean642 = false;
						this.aClass4_Sub7_Sub7_Sub2_1 = null;
					} else if (this.aClass4_Sub7_Sub7_Sub2_1.anInt9269 == 512) {
						this.aClass4_Sub7_Sub7_Sub2_1.anInt9269 = 0;
					}
				} else {
					local231 = local199 - this.aClass4_Sub9_4.anInt7219;
					if (local180 < local231) {
						local231 = local180;
					}
					this.aClass111_1.method3084(local231, this.aClass4_Sub9_4.aByteArray97, this.aClass4_Sub9_4.anInt7219);
					if (this.aByte69 != 0) {
						for (local238 = 0; local238 < local231; local238++) {
							this.aClass4_Sub9_4.aByteArray97[this.aClass4_Sub9_4.anInt7219 + local238] = (byte) (this.aClass4_Sub9_4.aByteArray97[this.aClass4_Sub9_4.anInt7219 + local238] ^ this.aByte69);
						}
					}
					this.aClass4_Sub9_4.anInt7219 += local231;
					if (this.aClass4_Sub9_4.anInt7219 >= local199) {
						if (this.aClass4_Sub7_Sub7_Sub2_1 == null) {
							this.aClass4_Sub9_4.anInt7219 = 0;
							local238 = this.aClass4_Sub9_4.method6015();
							local278 = this.aClass4_Sub9_4.method5982();
							@Pc(460) int local460 = this.aClass4_Sub9_4.method6015();
							@Pc(465) int local465 = this.aClass4_Sub9_4.method6026();
							@Pc(469) int local469 = local460 & 0x7F;
							@Pc(477) boolean local477 = (local460 & 0x80) != 0;
							@Pc(485) long local485 = (long) ((local238 << 16) + local278);
							@Pc(495) Class4_Sub7_Sub7_Sub2 local495;
							if (local477) {
								for (local495 = (Class4_Sub7_Sub7_Sub2) this.aClass286_10.method6403(); local495 != null && local485 != local495.aLong303; local495 = (Class4_Sub7_Sub7_Sub2) this.aClass286_10.method6414()) {
								}
							} else {
								for (local495 = (Class4_Sub7_Sub7_Sub2) this.aClass286_8.method6403(); local495 != null && local495.aLong303 != local485; local495 = (Class4_Sub7_Sub7_Sub2) this.aClass286_8.method6414()) {
								}
							}
							if (local495 == null) {
								throw new IOException();
							}
							this.aClass4_Sub7_Sub7_Sub2_1 = local495;
							@Pc(555) int local555 = local469 == 0 ? 5 : 9;
							this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7 = new Class4_Sub9(this.aClass4_Sub7_Sub7_Sub2_1.aByte106 + local465 + local555);
							this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.method5961(-345277664, local469);
							this.aClass4_Sub7_Sub7_Sub2_1.aClass4_Sub9_7.method5963(local465);
							this.aClass4_Sub7_Sub7_Sub2_1.anInt9269 = 8;
							this.aClass4_Sub9_4.anInt7219 = 0;
						} else if (this.aClass4_Sub7_Sub7_Sub2_1.anInt9269 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub9_4.aByteArray97[0] == -1) {
							this.aClass4_Sub9_4.anInt7219 = 0;
							this.aClass4_Sub7_Sub7_Sub2_1.anInt9269 = 1;
						} else {
							this.aClass4_Sub7_Sub7_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(634) IOException local634) {
			try {
				this.aClass111_1.method3090();
			} catch (@Pc(642) Exception local642) {
			}
			this.anInt5473 = -2;
			this.aClass111_1 = null;
			this.anInt5474++;
			return this.method4636() == 0 && this.method4634() == 0;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZB)V")
	public void method4639(@OriginalArg(0) boolean arg0) {
		if (this.aClass111_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub9_3.anInt7219 = 0;
			this.aClass4_Sub9_3.method5961(-345277664, arg0 ? 2 : 3);
			this.aClass4_Sub9_3.method6022(0);
			this.aClass111_1.method3085(this.aClass4_Sub9_3.aByteArray97, 4);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass111_1.method3090();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt5473 = -2;
			this.anInt5474++;
			this.aClass111_1 = null;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "(B)Z")
	public boolean method4640() {
		return this.method4636() >= 20;
	}

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "(I)V")
	public void method4641() {
		if (this.aClass111_1 != null) {
			this.aClass111_1.method3090();
		}
	}
}
