import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class13 {

	@OriginalMember(owner = "client!as", name = "i", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!as", name = "B", descriptor = "Lclient!kg;")
	private Class114 aClass114_1;

	@OriginalMember(owner = "client!as", name = "D", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!as", name = "E", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!as", name = "J", descriptor = "Lclient!bo;")
	private Class4_Sub4_Sub2_Sub1 aClass4_Sub4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Lclient!se;")
	private final Class180 aClass180_1 = new Class180();

	@OriginalMember(owner = "client!as", name = "o", descriptor = "Lclient!se;")
	private final Class180 aClass180_2 = new Class180();

	@OriginalMember(owner = "client!as", name = "y", descriptor = "Lclient!se;")
	private final Class180 aClass180_3 = new Class180();

	@OriginalMember(owner = "client!as", name = "A", descriptor = "Lclient!se;")
	private final Class180 aClass180_4 = new Class180();

	@OriginalMember(owner = "client!as", name = "C", descriptor = "Lclient!lf;")
	private final Class4_Sub11 aClass4_Sub11_1 = new Class4_Sub11(4);

	@OriginalMember(owner = "client!as", name = "I", descriptor = "B")
	private byte aByte6 = 0;

	@OriginalMember(owner = "client!as", name = "H", descriptor = "I")
	public volatile int anInt343 = 0;

	@OriginalMember(owner = "client!as", name = "G", descriptor = "I")
	public volatile int anInt342 = 0;

	@OriginalMember(owner = "client!as", name = "F", descriptor = "Lclient!lf;")
	private final Class4_Sub11 aClass4_Sub11_2 = new Class4_Sub11(8);

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)Z")
	public boolean method285() {
		return this.method299() >= 20;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)Z")
	public boolean method288() {
		return this.method295() >= 20;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZLclient!kg;I)V")
	public void method289(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class114 arg1) {
		if (this.aClass114_1 != null) {
			try {
				this.aClass114_1.method3165();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass114_1 = null;
		}
		this.aClass114_1 = arg1;
		this.method301();
		this.method290(arg0);
		this.aClass4_Sub11_2.anInt3768 = 0;
		this.aClass4_Sub4_Sub2_Sub1_1 = null;
		while (true) {
			@Pc(45) Class4_Sub4_Sub2_Sub1 local45 = (Class4_Sub4_Sub2_Sub1) this.aClass180_2.method4839();
			if (local45 == null) {
				while (true) {
					local45 = (Class4_Sub4_Sub2_Sub1) this.aClass180_4.method4839();
					if (local45 == null) {
						if (this.aByte6 != 0) {
							try {
								this.aClass4_Sub11_1.anInt3768 = 0;
								this.aClass4_Sub11_1.method3434(4);
								this.aClass4_Sub11_1.method3434(this.aByte6);
								this.aClass4_Sub11_1.method3402(0);
								this.aClass114_1.method3163(this.aClass4_Sub11_1.aByteArray55, 4);
							} catch (@Pc(103) IOException local103) {
								try {
									this.aClass114_1.method3165();
								} catch (@Pc(109) Exception local109) {
								}
								this.anInt342 = -2;
								this.anInt343++;
								this.aClass114_1 = null;
							}
						}
						this.anInt341 = 0;
						this.aLong11 = Static208.method3879();
						return;
					}
					this.aClass180_3.method4840(local45);
				}
			}
			this.aClass180_1.method4840(local45);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZB)V")
	public void method290(@OriginalArg(0) boolean arg0) {
		if (this.aClass114_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub11_1.anInt3768 = 0;
			this.aClass4_Sub11_1.method3434(arg0 ? 2 : 3);
			this.aClass4_Sub11_1.method3429(0);
			this.aClass114_1.method3163(this.aClass4_Sub11_1.aByteArray55, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass114_1.method3165();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass114_1 = null;
			this.anInt343++;
			this.anInt342 = -2;
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
	public void method292() {
		try {
			this.aClass114_1.method3165();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte6 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt343++;
		this.anInt342 = -1;
		this.aClass114_1 = null;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IBZIB)Lclient!bo;")
	public Class4_Sub4_Sub2_Sub1 method294(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg2 + (arg0 << 16));
		@Pc(14) Class4_Sub4_Sub2_Sub1 local14 = new Class4_Sub4_Sub2_Sub1();
		local14.aBoolean198 = arg1;
		local14.aByte9 = arg3;
		local14.aLong222 = local10;
		if (arg1) {
			if (this.method295() >= 20) {
				throw new RuntimeException();
			}
			this.aClass180_1.method4840(local14);
		} else if (this.method299() < 20) {
			this.aClass180_3.method4840(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I")
	public int method295() {
		return this.aClass180_1.method4844() + this.aClass180_2.method4844();
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(I)Z")
	public boolean method296() {
		@Pc(14) int local14;
		if (this.aClass114_1 != null) {
			@Pc(7) long local7 = Static208.method3879();
			local14 = (int) (local7 - this.aLong11);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong11 = local7;
			this.anInt341 += local14;
			if (this.anInt341 > 30000) {
				try {
					this.aClass114_1.method3165();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass114_1 = null;
			}
		}
		if (this.aClass114_1 == null) {
			return this.method295() == 0 && this.method299() == 0;
		}
		try {
			this.aClass114_1.method3164();
			for (@Pc(79) Class4_Sub4_Sub2_Sub1 local79 = (Class4_Sub4_Sub2_Sub1) this.aClass180_1.method4838(); local79 != null; local79 = (Class4_Sub4_Sub2_Sub1) this.aClass180_1.method4843()) {
				this.aClass4_Sub11_1.anInt3768 = 0;
				this.aClass4_Sub11_1.method3434(1);
				this.aClass4_Sub11_1.method3429((int) local79.aLong222);
				this.aClass114_1.method3163(this.aClass4_Sub11_1.aByteArray55, 4);
				this.aClass180_2.method4840(local79);
			}
			for (@Pc(129) Class4_Sub4_Sub2_Sub1 local129 = (Class4_Sub4_Sub2_Sub1) this.aClass180_3.method4838(); local129 != null; local129 = (Class4_Sub4_Sub2_Sub1) this.aClass180_3.method4843()) {
				this.aClass4_Sub11_1.anInt3768 = 0;
				this.aClass4_Sub11_1.method3434(0);
				this.aClass4_Sub11_1.method3429((int) local129.aLong222);
				this.aClass114_1.method3163(this.aClass4_Sub11_1.aByteArray55, 4);
				this.aClass180_4.method4840(local129);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(183) int local183 = this.aClass114_1.method3161();
				if (local183 < 0) {
					throw new IOException();
				}
				if (local183 == 0) {
					break;
				}
				this.anInt341 = 0;
				@Pc(199) byte local199 = 0;
				if (this.aClass4_Sub4_Sub2_Sub1_1 == null) {
					local199 = 8;
				} else if (this.aClass4_Sub4_Sub2_Sub1_1.anInt634 == 0) {
					local199 = 1;
				}
				@Pc(224) int local224;
				@Pc(254) int local254;
				@Pc(315) int local315;
				if (local199 > 0) {
					local224 = local199 - this.aClass4_Sub11_2.anInt3768;
					if (local183 < local224) {
						local224 = local183;
					}
					this.aClass114_1.method3168(local224, this.aClass4_Sub11_2.aByteArray55, this.aClass4_Sub11_2.anInt3768);
					if (this.aByte6 != 0) {
						for (local254 = 0; local254 < local224; local254++) {
							this.aClass4_Sub11_2.aByteArray55[this.aClass4_Sub11_2.anInt3768 + local254] ^= this.aByte6;
						}
					}
					this.aClass4_Sub11_2.anInt3768 += local224;
					if (local199 <= this.aClass4_Sub11_2.anInt3768) {
						if (this.aClass4_Sub4_Sub2_Sub1_1 == null) {
							this.aClass4_Sub11_2.anInt3768 = 0;
							local254 = this.aClass4_Sub11_2.method3440();
							local315 = this.aClass4_Sub11_2.method3401();
							@Pc(320) int local320 = this.aClass4_Sub11_2.method3440();
							@Pc(325) int local325 = this.aClass4_Sub11_2.method3418();
							@Pc(329) int local329 = local320 & 0x7F;
							@Pc(340) boolean local340 = (local320 & 0x80) != 0;
							@Pc(347) long local347 = (long) (local315 + (local254 << 16));
							@Pc(357) Class4_Sub4_Sub2_Sub1 local357;
							if (local340) {
								for (local357 = (Class4_Sub4_Sub2_Sub1) this.aClass180_4.method4838(); local357 != null && local347 != local357.aLong222; local357 = (Class4_Sub4_Sub2_Sub1) this.aClass180_4.method4843()) {
								}
							} else {
								for (local357 = (Class4_Sub4_Sub2_Sub1) this.aClass180_2.method4838(); local357 != null && local357.aLong222 != local347; local357 = (Class4_Sub4_Sub2_Sub1) this.aClass180_2.method4843()) {
								}
							}
							if (local357 == null) {
								throw new IOException();
							}
							this.aClass4_Sub4_Sub2_Sub1_1 = local357;
							@Pc(416) int local416 = local329 == 0 ? 5 : 9;
							this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3 = new Class4_Sub11(local325 + local416 + this.aClass4_Sub4_Sub2_Sub1_1.aByte9);
							this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.method3434(local329);
							this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.method3452(local325);
							this.aClass4_Sub4_Sub2_Sub1_1.anInt634 = 8;
							this.aClass4_Sub11_2.anInt3768 = 0;
						} else if (this.aClass4_Sub4_Sub2_Sub1_1.anInt634 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub11_2.aByteArray55[0] == -1) {
							this.aClass4_Sub4_Sub2_Sub1_1.anInt634 = 1;
							this.aClass4_Sub11_2.anInt3768 = 0;
						} else {
							this.aClass4_Sub4_Sub2_Sub1_1 = null;
						}
					}
				} else {
					local224 = this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.aByteArray55.length - this.aClass4_Sub4_Sub2_Sub1_1.aByte9;
					local254 = 512 - this.aClass4_Sub4_Sub2_Sub1_1.anInt634;
					if (local224 - this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.anInt3768 < local254) {
						local254 = local224 - this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.anInt3768;
					}
					if (local183 < local254) {
						local254 = local183;
					}
					this.aClass114_1.method3168(local254, this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.aByteArray55, this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.anInt3768);
					if (this.aByte6 != 0) {
						for (local315 = 0; local315 < local254; local315++) {
							this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.aByteArray55[this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.anInt3768 + local315] ^= this.aByte6;
						}
					}
					this.aClass4_Sub4_Sub2_Sub1_1.anInt634 += local254;
					this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.anInt3768 += local254;
					if (local224 == this.aClass4_Sub4_Sub2_Sub1_1.aClass4_Sub11_3.anInt3768) {
						this.aClass4_Sub4_Sub2_Sub1_1.method5678();
						this.aClass4_Sub4_Sub2_Sub1_1.aBoolean197 = false;
						this.aClass4_Sub4_Sub2_Sub1_1 = null;
					} else if (this.aClass4_Sub4_Sub2_Sub1_1.anInt634 == 512) {
						this.aClass4_Sub4_Sub2_Sub1_1.anInt634 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(635) IOException local635) {
			try {
				this.aClass114_1.method3165();
			} catch (@Pc(641) Exception local641) {
			}
			this.anInt342 = -2;
			this.aClass114_1 = null;
			this.anInt343++;
			return this.method295() == 0 && this.method299() == 0;
		}
	}

	@OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V")
	public void method297() {
		if (this.aClass114_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub11_1.anInt3768 = 0;
			this.aClass4_Sub11_1.method3434(7);
			this.aClass4_Sub11_1.method3429(0);
			this.aClass114_1.method3163(this.aClass4_Sub11_1.aByteArray55, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass114_1.method3165();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt343++;
			this.aClass114_1 = null;
			this.anInt342 = -2;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
	public void method298() {
		if (this.aClass114_1 != null) {
			this.aClass114_1.method3165();
		}
	}

	@OriginalMember(owner = "client!as", name = "f", descriptor = "(I)I")
	private int method299() {
		return this.aClass180_3.method4844() + this.aClass180_4.method4844();
	}

	@OriginalMember(owner = "client!as", name = "g", descriptor = "(I)V")
	private void method301() {
		if (this.aClass114_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub11_1.anInt3768 = 0;
			this.aClass4_Sub11_1.method3434(6);
			this.aClass4_Sub11_1.method3429(3);
			this.aClass114_1.method3163(this.aClass4_Sub11_1.aByteArray55, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass114_1.method3165();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt342 = -2;
			this.aClass114_1 = null;
			this.anInt343++;
		}
	}

	@OriginalMember(owner = "client!as", name = "h", descriptor = "(I)V")
	public void method302() {
		if (this.aClass114_1 != null) {
			this.aClass114_1.method3171();
		}
	}
}
