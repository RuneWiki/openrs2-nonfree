import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class195 {

	@OriginalMember(owner = "client!pr", name = "B", descriptor = "Lclient!ti;")
	private Class229 aClass229_3;

	@OriginalMember(owner = "client!pr", name = "C", descriptor = "J")
	private long aLong164;

	@OriginalMember(owner = "client!pr", name = "F", descriptor = "I")
	private int anInt5402;

	@OriginalMember(owner = "client!pr", name = "L", descriptor = "Lclient!pp;")
	private Class1_Sub2_Sub8_Sub2 aClass1_Sub2_Sub8_Sub2_1;

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "Lclient!su;")
	private final Class227 aClass227_5 = new Class227();

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "Lclient!su;")
	private final Class227 aClass227_6 = new Class227();

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "Lclient!su;")
	private final Class227 aClass227_7 = new Class227();

	@OriginalMember(owner = "client!pr", name = "A", descriptor = "Lclient!su;")
	private final Class227 aClass227_8 = new Class227();

	@OriginalMember(owner = "client!pr", name = "D", descriptor = "Lclient!hp;")
	private final Class1_Sub5 aClass1_Sub5_6 = new Class1_Sub5(4);

	@OriginalMember(owner = "client!pr", name = "G", descriptor = "B")
	private byte aByte87 = 0;

	@OriginalMember(owner = "client!pr", name = "K", descriptor = "I")
	public volatile int anInt5404 = 0;

	@OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
	public volatile int anInt5403 = 0;

	@OriginalMember(owner = "client!pr", name = "I", descriptor = "Lclient!hp;")
	private final Class1_Sub5 aClass1_Sub5_7 = new Class1_Sub5(8);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	private void method4443() {
		if (this.aClass229_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub5_6.anInt6475 = 0;
			this.aClass1_Sub5_6.method5396(6);
			this.aClass1_Sub5_6.method5370(3);
			this.aClass229_3.method5207(this.aClass1_Sub5_6.aByteArray89, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass229_3.method5204();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt5404++;
			this.anInt5403 = -2;
			this.aClass229_3 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZZ)V")
	public void method4444(@OriginalArg(0) boolean arg0) {
		if (this.aClass229_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub5_6.anInt6475 = 0;
			this.aClass1_Sub5_6.method5396(arg0 ? 2 : 3);
			this.aClass1_Sub5_6.method5370(0);
			this.aClass229_3.method5207(this.aClass1_Sub5_6.aByteArray89, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass229_3.method5204();
			} catch (@Pc(47) Exception local47) {
			}
			this.aClass229_3 = null;
			this.anInt5403 = -2;
			this.anInt5404++;
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)Z")
	public boolean method4445() {
		return this.method4452() >= 20;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V")
	public void method4446() {
		if (this.aClass229_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub5_6.anInt6475 = 0;
			this.aClass1_Sub5_6.method5396(7);
			this.aClass1_Sub5_6.method5370(0);
			this.aClass229_3.method5207(this.aClass1_Sub5_6.aByteArray89, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass229_3.method5204();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt5404++;
			this.aClass229_3 = null;
			this.anInt5403 = -2;
		}
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	public void method4447() {
		try {
			this.aClass229_3.method5204();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt5404++;
		this.aByte87 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5403 = -1;
		this.aClass229_3 = null;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZILclient!ti;)V")
	public void method4448(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class229 arg1) {
		if (this.aClass229_3 != null) {
			try {
				this.aClass229_3.method5204();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass229_3 = null;
		}
		this.aClass229_3 = arg1;
		this.method4443();
		this.method4444(arg0);
		this.aClass1_Sub2_Sub8_Sub2_1 = null;
		this.aClass1_Sub5_7.anInt6475 = 0;
		while (true) {
			@Pc(40) Class1_Sub2_Sub8_Sub2 local40 = (Class1_Sub2_Sub8_Sub2) this.aClass227_6.method5104();
			if (local40 == null) {
				while (true) {
					local40 = (Class1_Sub2_Sub8_Sub2) this.aClass227_8.method5104();
					if (local40 == null) {
						if (this.aByte87 != 0) {
							try {
								this.aClass1_Sub5_6.anInt6475 = 0;
								this.aClass1_Sub5_6.method5396(4);
								this.aClass1_Sub5_6.method5396(this.aByte87);
								this.aClass1_Sub5_6.method5393(0);
								this.aClass229_3.method5207(this.aClass1_Sub5_6.aByteArray89, 4);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass229_3.method5204();
								} catch (@Pc(113) Exception local113) {
								}
								this.anInt5404++;
								this.aClass229_3 = null;
								this.anInt5403 = -2;
							}
						}
						this.anInt5402 = 0;
						this.aLong164 = Static279.method4058();
						return;
					}
					this.aClass227_7.method5106(local40);
				}
			}
			this.aClass227_5.method5106(local40);
		}
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(B)Z")
	public boolean method4449() {
		if (this.aClass229_3 != null) {
			@Pc(7) long local7 = Static279.method4058();
			@Pc(14) int local14 = (int) (local7 - this.aLong164);
			this.aLong164 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt5402 += local14;
			if (this.anInt5402 > 30000) {
				try {
					this.aClass229_3.method5204();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass229_3 = null;
			}
		}
		if (this.aClass229_3 == null) {
			return this.method4453() == 0 && this.method4452() == 0;
		}
		try {
			this.aClass229_3.method5202();
			for (@Pc(80) Class1_Sub2_Sub8_Sub2 local80 = (Class1_Sub2_Sub8_Sub2) this.aClass227_5.method5109(); local80 != null; local80 = (Class1_Sub2_Sub8_Sub2) this.aClass227_5.method5107()) {
				this.aClass1_Sub5_6.anInt6475 = 0;
				this.aClass1_Sub5_6.method5396(1);
				this.aClass1_Sub5_6.method5370((int) local80.aLong213);
				this.aClass229_3.method5207(this.aClass1_Sub5_6.aByteArray89, 4);
				this.aClass227_6.method5106(local80);
			}
			for (@Pc(126) Class1_Sub2_Sub8_Sub2 local126 = (Class1_Sub2_Sub8_Sub2) this.aClass227_7.method5109(); local126 != null; local126 = (Class1_Sub2_Sub8_Sub2) this.aClass227_7.method5107()) {
				this.aClass1_Sub5_6.anInt6475 = 0;
				this.aClass1_Sub5_6.method5396(0);
				this.aClass1_Sub5_6.method5370((int) local126.aLong213);
				this.aClass229_3.method5207(this.aClass1_Sub5_6.aByteArray89, 4);
				this.aClass227_8.method5106(local126);
			}
			for (@Pc(168) int local168 = 0; local168 < 100; local168++) {
				@Pc(175) int local175 = this.aClass229_3.method5208();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt5402 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass1_Sub2_Sub8_Sub2_1 == null) {
					local191 = 8;
				} else if (this.aClass1_Sub2_Sub8_Sub2_1.anInt5358 == 0) {
					local191 = 1;
				}
				@Pc(212) int local212;
				@Pc(237) int local237;
				@Pc(302) int local302;
				if (local191 > 0) {
					local212 = local191 - this.aClass1_Sub5_7.anInt6475;
					if (local175 < local212) {
						local212 = local175;
					}
					this.aClass229_3.method5203(this.aClass1_Sub5_7.anInt6475, local212, this.aClass1_Sub5_7.aByteArray89);
					if (this.aByte87 != 0) {
						for (local237 = 0; local237 < local212; local237++) {
							this.aClass1_Sub5_7.aByteArray89[local237 + this.aClass1_Sub5_7.anInt6475] ^= this.aByte87;
						}
					}
					this.aClass1_Sub5_7.anInt6475 += local212;
					if (local191 <= this.aClass1_Sub5_7.anInt6475) {
						if (this.aClass1_Sub2_Sub8_Sub2_1 == null) {
							this.aClass1_Sub5_7.anInt6475 = 0;
							local237 = this.aClass1_Sub5_7.method5366();
							local302 = this.aClass1_Sub5_7.method5362();
							@Pc(307) int local307 = this.aClass1_Sub5_7.method5366();
							@Pc(312) int local312 = this.aClass1_Sub5_7.method5407();
							@Pc(316) int local316 = local307 & 0x7F;
							@Pc(324) boolean local324 = (local307 & 0x80) != 0;
							@Pc(331) long local331 = (long) ((local237 << 16) + local302);
							@Pc(341) Class1_Sub2_Sub8_Sub2 local341;
							if (local324) {
								for (local341 = (Class1_Sub2_Sub8_Sub2) this.aClass227_8.method5109(); local341 != null && local341.aLong213 != local331; local341 = (Class1_Sub2_Sub8_Sub2) this.aClass227_8.method5107()) {
								}
							} else {
								for (local341 = (Class1_Sub2_Sub8_Sub2) this.aClass227_6.method5109(); local341 != null && local331 != local341.aLong213; local341 = (Class1_Sub2_Sub8_Sub2) this.aClass227_6.method5107()) {
								}
							}
							if (local341 == null) {
								throw new IOException();
							}
							@Pc(397) int local397 = local316 == 0 ? 5 : 9;
							this.aClass1_Sub2_Sub8_Sub2_1 = local341;
							this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5 = new Class1_Sub5(local397 + local312 + this.aClass1_Sub2_Sub8_Sub2_1.aByte84);
							this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.method5396(local316);
							this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.method5417(local312);
							this.aClass1_Sub5_7.anInt6475 = 0;
							this.aClass1_Sub2_Sub8_Sub2_1.anInt5358 = 8;
						} else if (this.aClass1_Sub2_Sub8_Sub2_1.anInt5358 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub5_7.aByteArray89[0] == -1) {
							this.aClass1_Sub5_7.anInt6475 = 0;
							this.aClass1_Sub2_Sub8_Sub2_1.anInt5358 = 1;
						} else {
							this.aClass1_Sub2_Sub8_Sub2_1 = null;
						}
					}
				} else {
					local212 = this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.aByteArray89.length - this.aClass1_Sub2_Sub8_Sub2_1.aByte84;
					local237 = 512 - this.aClass1_Sub2_Sub8_Sub2_1.anInt5358;
					if (local237 > local212 - this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.anInt6475) {
						local237 = local212 - this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.anInt6475;
					}
					if (local237 > local175) {
						local237 = local175;
					}
					this.aClass229_3.method5203(this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.anInt6475, local237, this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.aByteArray89);
					if (this.aByte87 != 0) {
						for (local302 = 0; local302 < local237; local302++) {
							this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.aByteArray89[local302 + this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.anInt6475] ^= this.aByte87;
						}
					}
					this.aClass1_Sub2_Sub8_Sub2_1.anInt5358 += local237;
					this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.anInt6475 += local237;
					if (local212 == this.aClass1_Sub2_Sub8_Sub2_1.aClass1_Sub5_5.anInt6475) {
						this.aClass1_Sub2_Sub8_Sub2_1.method5813();
						this.aClass1_Sub2_Sub8_Sub2_1.aBoolean385 = false;
						this.aClass1_Sub2_Sub8_Sub2_1 = null;
					} else if (this.aClass1_Sub2_Sub8_Sub2_1.anInt5358 == 512) {
						this.aClass1_Sub2_Sub8_Sub2_1.anInt5358 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(620) IOException local620) {
			try {
				this.aClass229_3.method5204();
			} catch (@Pc(626) Exception local626) {
			}
			this.anInt5403 = -2;
			this.anInt5404++;
			this.aClass229_3 = null;
			return this.method4453() == 0 && this.method4452() == 0;
		}
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)Z")
	public boolean method4450() {
		return this.method4453() >= 20;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBZIB)Lclient!pp;")
	public Class1_Sub2_Sub8_Sub2 method4451(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(15) long local15 = (long) (arg3 + (arg0 << 16));
		@Pc(19) Class1_Sub2_Sub8_Sub2 local19 = new Class1_Sub2_Sub8_Sub2();
		local19.aByte84 = arg1;
		local19.aLong213 = local15;
		local19.aBoolean384 = arg2;
		if (arg2) {
			if (this.method4453() >= 20) {
				throw new RuntimeException();
			}
			this.aClass227_5.method5106(local19);
		} else if (this.method4452() < 20) {
			this.aClass227_7.method5106(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)I")
	private int method4452() {
		return this.aClass227_7.method5108() + this.aClass227_8.method5108();
	}

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)I")
	public int method4453() {
		return this.aClass227_5.method5108() + this.aClass227_6.method5108();
	}

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)V")
	public void method4454() {
		if (this.aClass229_3 != null) {
			this.aClass229_3.method5210();
		}
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(B)V")
	public void method4455() {
		if (this.aClass229_3 != null) {
			this.aClass229_3.method5204();
		}
	}
}
