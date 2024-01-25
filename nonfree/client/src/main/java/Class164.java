import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class164 {

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
	private int anInt4317;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "Lclient!hu;")
	private Class114 aClass114_5;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "J")
	private long aLong124;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "Lclient!wd;")
	private Class1_Sub1_Sub11_Sub2 aClass1_Sub1_Sub11_Sub2_1;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!uq;")
	private final Class247 aClass247_4 = new Class247();

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Lclient!uq;")
	private final Class247 aClass247_5 = new Class247();

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "Lclient!uq;")
	private final Class247 aClass247_6 = new Class247();

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "Lclient!uq;")
	private final Class247 aClass247_7 = new Class247();

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "Lclient!ti;")
	private final Class1_Sub14 aClass1_Sub14_2 = new Class1_Sub14(4);

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
	public volatile int anInt4318 = 0;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "B")
	private byte aByte64 = 0;

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
	public volatile int anInt4319 = 0;

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "Lclient!ti;")
	private final Class1_Sub14 aClass1_Sub14_3 = new Class1_Sub14(8);

	static {
		new Class96("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Z")
	public boolean method3574() {
		@Pc(14) int local14;
		if (this.aClass114_5 != null) {
			@Pc(7) long local7 = Static107.method1707();
			local14 = (int) (local7 - this.aLong124);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong124 = local7;
			this.anInt4317 += local14;
			if (this.anInt4317 > 30000) {
				try {
					this.aClass114_5.method2496();
				} catch (@Pc(38) Exception local38) {
				}
				this.aClass114_5 = null;
			}
		}
		if (this.aClass114_5 == null) {
			return this.method3584() == 0 && this.method3585() == 0;
		}
		try {
			this.aClass114_5.method2498();
			for (@Pc(70) Class1_Sub1_Sub11_Sub2 local70 = (Class1_Sub1_Sub11_Sub2) this.aClass247_4.method5591(); local70 != null; local70 = (Class1_Sub1_Sub11_Sub2) this.aClass247_4.method5587()) {
				this.aClass1_Sub14_2.anInt5695 = 0;
				this.aClass1_Sub14_2.method4553(1);
				this.aClass1_Sub14_2.method4516((int) local70.aLong231);
				this.aClass114_5.method2497(4, this.aClass1_Sub14_2.aByteArray65);
				this.aClass247_5.method5590(local70);
			}
			for (@Pc(116) Class1_Sub1_Sub11_Sub2 local116 = (Class1_Sub1_Sub11_Sub2) this.aClass247_6.method5591(); local116 != null; local116 = (Class1_Sub1_Sub11_Sub2) this.aClass247_6.method5587()) {
				this.aClass1_Sub14_2.anInt5695 = 0;
				this.aClass1_Sub14_2.method4553(0);
				this.aClass1_Sub14_2.method4516((int) local116.aLong231);
				this.aClass114_5.method2497(4, this.aClass1_Sub14_2.aByteArray65);
				this.aClass247_7.method5590(local116);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(167) int local167 = this.aClass114_5.method2495();
				if (local167 < 0) {
					throw new IOException();
				}
				if (local167 == 0) {
					break;
				}
				this.anInt4317 = 0;
				@Pc(183) byte local183 = 0;
				if (this.aClass1_Sub1_Sub11_Sub2_1 == null) {
					local183 = 8;
				} else if (this.aClass1_Sub1_Sub11_Sub2_1.anInt7670 == 0) {
					local183 = 1;
				}
				@Pc(209) int local209;
				@Pc(216) int local216;
				@Pc(260) int local260;
				if (local183 <= 0) {
					local209 = this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.aByteArray65.length - this.aClass1_Sub1_Sub11_Sub2_1.aByte100;
					local216 = 512 - this.aClass1_Sub1_Sub11_Sub2_1.anInt7670;
					if (local216 > local209 - this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.anInt5695) {
						local216 = local209 - this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.anInt5695;
					}
					if (local167 < local216) {
						local216 = local167;
					}
					this.aClass114_5.method2493(this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.anInt5695, this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.aByteArray65, local216);
					if (this.aByte64 != 0) {
						for (local260 = 0; local260 < local216; local260++) {
							this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.aByteArray65[local260 + this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.anInt5695] ^= this.aByte64;
						}
					}
					this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.anInt5695 += local216;
					this.aClass1_Sub1_Sub11_Sub2_1.anInt7670 += local216;
					if (this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.anInt5695 == local209) {
						this.aClass1_Sub1_Sub11_Sub2_1.method5893();
						this.aClass1_Sub1_Sub11_Sub2_1.aBoolean649 = false;
						this.aClass1_Sub1_Sub11_Sub2_1 = null;
					} else if (this.aClass1_Sub1_Sub11_Sub2_1.anInt7670 == 512) {
						this.aClass1_Sub1_Sub11_Sub2_1.anInt7670 = 0;
					}
				} else {
					local209 = local183 - this.aClass1_Sub14_3.anInt5695;
					if (local209 > local167) {
						local209 = local167;
					}
					this.aClass114_5.method2493(this.aClass1_Sub14_3.anInt5695, this.aClass1_Sub14_3.aByteArray65, local209);
					if (this.aByte64 != 0) {
						for (local216 = 0; local216 < local209; local216++) {
							this.aClass1_Sub14_3.aByteArray65[local216 + this.aClass1_Sub14_3.anInt5695] ^= this.aByte64;
						}
					}
					this.aClass1_Sub14_3.anInt5695 += local209;
					if (this.aClass1_Sub14_3.anInt5695 >= local183) {
						if (this.aClass1_Sub1_Sub11_Sub2_1 == null) {
							this.aClass1_Sub14_3.anInt5695 = 0;
							local216 = this.aClass1_Sub14_3.method4548();
							local260 = this.aClass1_Sub14_3.method4498();
							@Pc(435) int local435 = this.aClass1_Sub14_3.method4548();
							@Pc(440) int local440 = this.aClass1_Sub14_3.method4500();
							@Pc(444) int local444 = local435 & 0x7F;
							@Pc(455) boolean local455 = (local435 & 0x80) != 0;
							@Pc(462) long local462 = (long) ((local216 << 16) + local260);
							@Pc(472) Class1_Sub1_Sub11_Sub2 local472;
							if (local455) {
								for (local472 = (Class1_Sub1_Sub11_Sub2) this.aClass247_7.method5591(); local472 != null && local472.aLong231 != local462; local472 = (Class1_Sub1_Sub11_Sub2) this.aClass247_7.method5587()) {
								}
							} else {
								for (local472 = (Class1_Sub1_Sub11_Sub2) this.aClass247_5.method5591(); local472 != null && local472.aLong231 != local462; local472 = (Class1_Sub1_Sub11_Sub2) this.aClass247_5.method5587()) {
								}
							}
							if (local472 == null) {
								throw new IOException();
							}
							this.aClass1_Sub1_Sub11_Sub2_1 = local472;
							@Pc(534) int local534 = local444 == 0 ? 5 : 9;
							this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7 = new Class1_Sub14(this.aClass1_Sub1_Sub11_Sub2_1.aByte100 + local534 + local440);
							this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.method4553(local444);
							this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub14_7.method4522(local440);
							this.aClass1_Sub14_3.anInt5695 = 0;
							this.aClass1_Sub1_Sub11_Sub2_1.anInt7670 = 8;
						} else if (this.aClass1_Sub1_Sub11_Sub2_1.anInt7670 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub14_3.aByteArray65[0] == -1) {
							this.aClass1_Sub1_Sub11_Sub2_1.anInt7670 = 1;
							this.aClass1_Sub14_3.anInt5695 = 0;
						} else {
							this.aClass1_Sub1_Sub11_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(611) IOException local611) {
			try {
				this.aClass114_5.method2496();
			} catch (@Pc(617) Exception local617) {
			}
			this.anInt4319 = -2;
			this.aClass114_5 = null;
			this.anInt4318++;
			return this.method3584() == 0 && this.method3585() == 0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public void method3576() {
		if (this.aClass114_5 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_2.anInt5695 = 0;
			this.aClass1_Sub14_2.method4553(7);
			this.aClass1_Sub14_2.method4516(0);
			this.aClass114_5.method2497(4, this.aClass1_Sub14_2.aByteArray65);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass114_5.method2496();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt4318++;
			this.aClass114_5 = null;
			this.anInt4319 = -2;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Z")
	public boolean method3578() {
		return this.method3584() >= 20;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	public void method3579() {
		if (this.aClass114_5 != null) {
			this.aClass114_5.method2492();
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	public void method3580() {
		try {
			this.aClass114_5.method2496();
		} catch (@Pc(9) Exception local9) {
		}
		this.aByte64 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt4319 = -1;
		this.anInt4318++;
		this.aClass114_5 = null;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)Z")
	public boolean method3581() {
		return this.method3585() >= 20;
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
	private void method3582() {
		if (this.aClass114_5 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_2.anInt5695 = 0;
			this.aClass1_Sub14_2.method4553(6);
			this.aClass1_Sub14_2.method4516(3);
			this.aClass114_5.method2497(4, this.aClass1_Sub14_2.aByteArray65);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass114_5.method2496();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt4319 = -2;
			this.aClass114_5 = null;
			this.anInt4318++;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)I")
	public int method3584() {
		return this.aClass247_4.method5596() + this.aClass247_5.method5596();
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)I")
	private int method3585() {
		return this.aClass247_6.method5596() + this.aClass247_7.method5596();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLclient!hu;I)V")
	public void method3587(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class114 arg1) {
		if (this.aClass114_5 != null) {
			try {
				this.aClass114_5.method2496();
			} catch (@Pc(16) Exception local16) {
			}
			this.aClass114_5 = null;
		}
		this.aClass114_5 = arg1;
		this.method3582();
		this.method3590(arg0);
		this.aClass1_Sub14_3.anInt5695 = 0;
		this.aClass1_Sub1_Sub11_Sub2_1 = null;
		while (true) {
			@Pc(46) Class1_Sub1_Sub11_Sub2 local46 = (Class1_Sub1_Sub11_Sub2) this.aClass247_5.method5585();
			if (local46 == null) {
				while (true) {
					local46 = (Class1_Sub1_Sub11_Sub2) this.aClass247_7.method5585();
					if (local46 == null) {
						if (this.aByte64 != 0) {
							try {
								this.aClass1_Sub14_2.anInt5695 = 0;
								this.aClass1_Sub14_2.method4553(4);
								this.aClass1_Sub14_2.method4553(this.aByte64);
								this.aClass1_Sub14_2.method4504(0);
								this.aClass114_5.method2497(4, this.aClass1_Sub14_2.aByteArray65);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass114_5.method2496();
								} catch (@Pc(112) Exception local112) {
								}
								this.aClass114_5 = null;
								this.anInt4318++;
								this.anInt4319 = -2;
							}
						}
						this.anInt4317 = 0;
						this.aLong124 = Static107.method1707();
						return;
					}
					this.aClass247_6.method5590(local46);
				}
			}
			this.aClass247_4.method5590(local46);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBBZI)Lclient!wd;")
	public Class1_Sub1_Sub11_Sub2 method3588(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 + (arg0 << 16));
		@Pc(20) Class1_Sub1_Sub11_Sub2 local20 = new Class1_Sub1_Sub11_Sub2();
		local20.aBoolean650 = arg2;
		local20.aByte100 = arg1;
		local20.aLong231 = local16;
		if (arg2) {
			if (this.method3584() >= 20) {
				throw new RuntimeException();
			}
			this.aClass247_4.method5590(local20);
		} else if (this.method3585() < 20) {
			this.aClass247_6.method5590(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V")
	public void method3589() {
		if (this.aClass114_5 != null) {
			this.aClass114_5.method2496();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZ)V")
	public void method3590(@OriginalArg(1) boolean arg0) {
		if (this.aClass114_5 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_2.anInt5695 = 0;
			this.aClass1_Sub14_2.method4553(arg0 ? 2 : 3);
			this.aClass1_Sub14_2.method4516(0);
			this.aClass114_5.method2497(4, this.aClass1_Sub14_2.aByteArray65);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass114_5.method2496();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt4319 = -2;
			this.anInt4318++;
			this.aClass114_5 = null;
		}
	}
}
