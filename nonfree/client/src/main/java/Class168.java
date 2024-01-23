import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class168 {

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Lclient!i;")
	private Class73 aClass73_4;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
	private int anInt5581;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "J")
	private long aLong181;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "Lclient!ab;")
	private Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!bl;")
	private Class17 aClass17_5 = new Class17();

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!bl;")
	private Class17 aClass17_6 = new Class17();

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!bl;")
	private Class17 aClass17_7 = new Class17();

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!bl;")
	private Class17 aClass17_8 = new Class17();

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Lclient!jj;")
	private Class1_Sub18 aClass1_Sub18_8 = new Class1_Sub18(4);

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	public volatile int anInt5582 = 0;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
	public volatile int anInt5583 = 0;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "B")
	private byte aByte25 = 0;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "Lclient!jj;")
	private Class1_Sub18 aClass1_Sub18_9 = new Class1_Sub18(8);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
	public boolean method4266() {
		return this.method4271() >= 20;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	public void method4268() {
		try {
			this.aClass73_4.method1691();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt5582++;
		this.aClass73_4 = null;
		this.anInt5583 = -1;
		this.aByte25 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
	public int method4271() {
		return this.aClass17_5.method467() + this.aClass17_6.method467();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
	public void method4272(@OriginalArg(1) boolean arg0) {
		if (this.aClass73_4 == null) {
			return;
		}
		try {
			this.aClass1_Sub18_8.anInt3911 = 0;
			this.aClass1_Sub18_8.method3093(arg0 ? 2 : 3);
			this.aClass1_Sub18_8.method3072(0);
			this.aClass73_4.method1685(4, this.aClass1_Sub18_8.aByteArray71);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass73_4.method1691();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt5582++;
			this.aClass73_4 = null;
			this.anInt5583 = -2;
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)I")
	private int method4273() {
		return this.aClass17_7.method467() + this.aClass17_8.method467();
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)Z")
	public boolean method4274() {
		if (this.aClass73_4 != null) {
			@Pc(9) long local9 = Static252.method3964();
			@Pc(16) int local16 = (int) (local9 - this.aLong181);
			if (local16 > 200) {
				local16 = 200;
			}
			this.aLong181 = local9;
			this.anInt5581 += local16;
			if (this.anInt5581 > 30000) {
				try {
					this.aClass73_4.method1691();
				} catch (@Pc(41) Exception local41) {
				}
				this.aClass73_4 = null;
			}
		}
		if (this.aClass73_4 == null) {
			return this.method4271() == 0 && this.method4273() == 0;
		}
		try {
			this.aClass73_4.method1690();
			@Pc(88) Class1_Sub2_Sub1_Sub1 local88;
			for (local88 = (Class1_Sub2_Sub1_Sub1) this.aClass17_5.method469(); local88 != null; local88 = (Class1_Sub2_Sub1_Sub1) this.aClass17_5.method466()) {
				this.aClass1_Sub18_8.anInt3911 = 0;
				this.aClass1_Sub18_8.method3093(1);
				this.aClass1_Sub18_8.method3072((int) local88.aLong197);
				this.aClass73_4.method1685(4, this.aClass1_Sub18_8.aByteArray71);
				this.aClass17_6.method462(local88);
			}
			for (local88 = (Class1_Sub2_Sub1_Sub1) this.aClass17_7.method469(); local88 != null; local88 = (Class1_Sub2_Sub1_Sub1) this.aClass17_7.method466()) {
				this.aClass1_Sub18_8.anInt3911 = 0;
				this.aClass1_Sub18_8.method3093(0);
				this.aClass1_Sub18_8.method3072((int) local88.aLong197);
				this.aClass73_4.method1685(4, this.aClass1_Sub18_8.aByteArray71);
				this.aClass17_8.method462(local88);
			}
			for (@Pc(177) int local177 = 0; local177 < 100; local177++) {
				@Pc(187) int local187 = this.aClass73_4.method1687();
				if (local187 < 0) {
					throw new IOException();
				}
				if (local187 == 0) {
					break;
				}
				this.anInt5581 = 0;
				@Pc(206) byte local206 = 0;
				if (this.aClass1_Sub2_Sub1_Sub1_2 == null) {
					local206 = 8;
				} else if (this.aClass1_Sub2_Sub1_Sub1_2.anInt145 == 0) {
					local206 = 1;
				}
				@Pc(239) int local239;
				@Pc(229) int local229;
				@Pc(291) int local291;
				if (local206 <= 0) {
					local229 = 512 - this.aClass1_Sub2_Sub1_Sub1_2.anInt145;
					local239 = this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.aByteArray71.length - this.aClass1_Sub2_Sub1_Sub1_2.aByte1;
					if (local239 - this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.anInt3911 < local229) {
						local229 = local239 - this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.anInt3911;
					}
					if (local229 > local187) {
						local229 = local187;
					}
					this.aClass73_4.method1689(local229, this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.aByteArray71, this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.anInt3911);
					if (this.aByte25 != 0) {
						for (local291 = 0; local291 < local229; local291++) {
							this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.aByteArray71[local291 + this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.anInt3911] ^= this.aByte25;
						}
					}
					this.aClass1_Sub2_Sub1_Sub1_2.anInt145 += local229;
					this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.anInt3911 += local229;
					if (this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.anInt3911 == local239) {
						this.aClass1_Sub2_Sub1_Sub1_2.method4509();
						this.aClass1_Sub2_Sub1_Sub1_2.aBoolean233 = false;
						this.aClass1_Sub2_Sub1_Sub1_2 = null;
					} else if (this.aClass1_Sub2_Sub1_Sub1_2.anInt145 == 512) {
						this.aClass1_Sub2_Sub1_Sub1_2.anInt145 = 0;
					}
				} else {
					local239 = local206 - this.aClass1_Sub18_9.anInt3911;
					if (local239 > local187) {
						local239 = local187;
					}
					this.aClass73_4.method1689(local239, this.aClass1_Sub18_9.aByteArray71, this.aClass1_Sub18_9.anInt3911);
					if (this.aByte25 != 0) {
						for (local229 = 0; local229 < local239; local229++) {
							this.aClass1_Sub18_9.aByteArray71[local229 + this.aClass1_Sub18_9.anInt3911] ^= this.aByte25;
						}
					}
					this.aClass1_Sub18_9.anInt3911 += local239;
					if (this.aClass1_Sub18_9.anInt3911 >= local206) {
						if (this.aClass1_Sub2_Sub1_Sub1_2 == null) {
							this.aClass1_Sub18_9.anInt3911 = 0;
							local229 = this.aClass1_Sub18_9.method3122();
							local291 = this.aClass1_Sub18_9.method3107();
							@Pc(475) int local475 = this.aClass1_Sub18_9.method3122();
							@Pc(480) int local480 = this.aClass1_Sub18_9.method3074();
							@Pc(488) boolean local488 = (local475 & 0x80) != 0;
							@Pc(495) long local495 = (long) ((local229 << 16) + local291);
							@Pc(501) int local501 = local475 & 0x7F;
							@Pc(509) Class1_Sub2_Sub1_Sub1 local509;
							if (local488) {
								for (local509 = (Class1_Sub2_Sub1_Sub1) this.aClass17_8.method469(); local509 != null && local509.aLong197 != local495; local509 = (Class1_Sub2_Sub1_Sub1) this.aClass17_8.method466()) {
								}
							} else {
								for (local509 = (Class1_Sub2_Sub1_Sub1) this.aClass17_6.method469(); local509 != null && local509.aLong197 != local495; local509 = (Class1_Sub2_Sub1_Sub1) this.aClass17_6.method466()) {
								}
							}
							if (local509 == null) {
								throw new IOException();
							}
							@Pc(565) int local565 = local501 == 0 ? 5 : 9;
							this.aClass1_Sub2_Sub1_Sub1_2 = local509;
							this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1 = new Class1_Sub18(local565 + local480 + this.aClass1_Sub2_Sub1_Sub1_2.aByte1);
							this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.method3093(local501);
							this.aClass1_Sub2_Sub1_Sub1_2.aClass1_Sub18_1.method3119(local480);
							this.aClass1_Sub2_Sub1_Sub1_2.anInt145 = 8;
							this.aClass1_Sub18_9.anInt3911 = 0;
						} else if (this.aClass1_Sub2_Sub1_Sub1_2.anInt145 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub18_9.aByteArray71[0] == -1) {
							this.aClass1_Sub18_9.anInt3911 = 0;
							this.aClass1_Sub2_Sub1_Sub1_2.anInt145 = 1;
						} else {
							this.aClass1_Sub2_Sub1_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(643) IOException local643) {
			try {
				this.aClass73_4.method1691();
			} catch (@Pc(649) Exception local649) {
			}
			this.anInt5583 = -2;
			this.anInt5582++;
			this.aClass73_4 = null;
			return this.method4271() == 0 && this.method4273() == 0;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!i;ZZ)V")
	public void method4275(@OriginalArg(0) Class73 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass73_4 != null) {
			try {
				this.aClass73_4.method1691();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass73_4 = null;
		}
		this.aClass73_4 = arg0;
		this.method4280();
		this.method4272(arg1);
		this.aClass1_Sub2_Sub1_Sub1_2 = null;
		this.aClass1_Sub18_9.anInt3911 = 0;
		while (true) {
			@Pc(45) Class1_Sub2_Sub1_Sub1 local45 = (Class1_Sub2_Sub1_Sub1) this.aClass17_6.method463();
			if (local45 == null) {
				while (true) {
					local45 = (Class1_Sub2_Sub1_Sub1) this.aClass17_8.method463();
					if (local45 == null) {
						if (this.aByte25 != 0) {
							try {
								this.aClass1_Sub18_8.anInt3911 = 0;
								this.aClass1_Sub18_8.method3093(4);
								this.aClass1_Sub18_8.method3093(this.aByte25);
								this.aClass1_Sub18_8.method3123(0);
								this.aClass73_4.method1685(4, this.aClass1_Sub18_8.aByteArray71);
							} catch (@Pc(110) IOException local110) {
								try {
									this.aClass73_4.method1691();
								} catch (@Pc(116) Exception local116) {
								}
								this.anInt5582++;
								this.aClass73_4 = null;
								this.anInt5583 = -2;
							}
						}
						this.anInt5581 = 0;
						this.aLong181 = Static252.method3964();
						return;
					}
					this.aClass17_7.method462(local45);
				}
			}
			this.aClass17_5.method462(local45);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIZBI)Lclient!ab;")
	public Class1_Sub2_Sub1_Sub1 method4276(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class1_Sub2_Sub1_Sub1 local14 = new Class1_Sub2_Sub1_Sub1();
		local14.aBoolean231 = arg2;
		local14.aByte1 = arg0;
		@Pc(27) long local27 = (long) (arg1 + (arg3 << 16));
		local14.aLong197 = local27;
		if (arg2) {
			if (this.method4271() >= 20) {
				throw new RuntimeException();
			}
			this.aClass17_5.method462(local14);
		} else if (this.method4273() < 20) {
			this.aClass17_7.method462(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	public void method4277() {
		if (this.aClass73_4 != null) {
			this.aClass73_4.method1688();
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
	public void method4278() {
		if (this.aClass73_4 == null) {
			return;
		}
		try {
			this.aClass1_Sub18_8.anInt3911 = 0;
			this.aClass1_Sub18_8.method3093(7);
			this.aClass1_Sub18_8.method3072(0);
			this.aClass73_4.method1685(4, this.aClass1_Sub18_8.aByteArray71);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass73_4.method1691();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass73_4 = null;
			this.anInt5583 = -2;
			this.anInt5582++;
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)V")
	public void method4279() {
		if (this.aClass73_4 != null) {
			this.aClass73_4.method1691();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	private void method4280() {
		if (this.aClass73_4 == null) {
			return;
		}
		try {
			this.aClass1_Sub18_8.anInt3911 = 0;
			this.aClass1_Sub18_8.method3093(6);
			this.aClass1_Sub18_8.method3072(3);
			this.aClass73_4.method1685(4, this.aClass1_Sub18_8.aByteArray71);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass73_4.method1691();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass73_4 = null;
			this.anInt5582++;
			this.anInt5583 = -2;
		}
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)Z")
	public boolean method4281() {
		return this.method4273() >= 20;
	}
}
