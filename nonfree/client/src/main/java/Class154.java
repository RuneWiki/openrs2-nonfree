import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class154 {

	@OriginalMember(owner = "client!p", name = "u", descriptor = "Lclient!uq;")
	private Class202 aClass202_5;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "I")
	private int anInt4729;

	@OriginalMember(owner = "client!p", name = "x", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!p", name = "C", descriptor = "Lclient!sf;")
	private Class1_Sub2_Sub10_Sub2 aClass1_Sub2_Sub10_Sub2_1;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!ql;")
	private final Class169 aClass169_6 = new Class169();

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!ql;")
	private final Class169 aClass169_7 = new Class169();

	@OriginalMember(owner = "client!p", name = "r", descriptor = "Lclient!ql;")
	private final Class169 aClass169_8 = new Class169();

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Lclient!ql;")
	private final Class169 aClass169_9 = new Class169();

	@OriginalMember(owner = "client!p", name = "w", descriptor = "Lclient!nj;")
	private final Class1_Sub21 aClass1_Sub21_5 = new Class1_Sub21(4);

	@OriginalMember(owner = "client!p", name = "A", descriptor = "B")
	private byte aByte61 = 0;

	@OriginalMember(owner = "client!p", name = "y", descriptor = "I")
	public volatile int anInt4730 = 0;

	@OriginalMember(owner = "client!p", name = "B", descriptor = "I")
	public volatile int anInt4731 = 0;

	@OriginalMember(owner = "client!p", name = "z", descriptor = "Lclient!nj;")
	private final Class1_Sub21 aClass1_Sub21_6 = new Class1_Sub21(8);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public void method4095() {
		if (this.aClass202_5 != null) {
			this.aClass202_5.method5479();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!uq;BZ)V")
	public void method4096(@OriginalArg(0) Class202 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass202_5 != null) {
			try {
				this.aClass202_5.method5477();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass202_5 = null;
		}
		this.aClass202_5 = arg0;
		this.method4106();
		this.method4099(arg1);
		this.aClass1_Sub2_Sub10_Sub2_1 = null;
		this.aClass1_Sub21_6.anInt6611 = 0;
		while (true) {
			@Pc(42) Class1_Sub2_Sub10_Sub2 local42 = (Class1_Sub2_Sub10_Sub2) this.aClass169_7.method4476();
			if (local42 == null) {
				while (true) {
					local42 = (Class1_Sub2_Sub10_Sub2) this.aClass169_9.method4476();
					if (local42 == null) {
						if (this.aByte61 != 0) {
							try {
								this.aClass1_Sub21_5.anInt6611 = 0;
								this.aClass1_Sub21_5.method5718(4);
								this.aClass1_Sub21_5.method5718(this.aByte61);
								this.aClass1_Sub21_5.method5698(0);
								this.aClass202_5.method5480(4, this.aClass1_Sub21_5.aByteArray82);
							} catch (@Pc(104) IOException local104) {
								try {
									this.aClass202_5.method5477();
								} catch (@Pc(110) Exception local110) {
								}
								this.anInt4731 = -2;
								this.anInt4730++;
								this.aClass202_5 = null;
							}
						}
						this.anInt4729 = 0;
						this.aLong138 = Static292.method5114();
						return;
					}
					this.aClass169_8.method4475(local42);
				}
			}
			this.aClass169_6.method4475(local42);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I")
	private int method4097() {
		return this.aClass169_8.method4482() + this.aClass169_9.method4482();
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)Z")
	public boolean method4098() {
		return this.method4097() >= 20;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZB)V")
	public void method4099(@OriginalArg(0) boolean arg0) {
		if (this.aClass202_5 == null) {
			return;
		}
		try {
			this.aClass1_Sub21_5.anInt6611 = 0;
			this.aClass1_Sub21_5.method5718(arg0 ? 2 : 3);
			this.aClass1_Sub21_5.method5737(0);
			this.aClass202_5.method5480(4, this.aClass1_Sub21_5.aByteArray82);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass202_5.method5477();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass202_5 = null;
			this.anInt4730++;
			this.anInt4731 = -2;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIBZI)Lclient!sf;")
	public Class1_Sub2_Sub10_Sub2 method4100(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg3 << 16));
		@Pc(14) Class1_Sub2_Sub10_Sub2 local14 = new Class1_Sub2_Sub10_Sub2();
		local14.aByte69 = arg1;
		local14.aLong213 = local10;
		local14.aBoolean470 = arg2;
		if (arg2) {
			if (this.method4102() >= 20) {
				throw new RuntimeException();
			}
			this.aClass169_6.method4475(local14);
		} else if (this.method4097() < 20) {
			this.aClass169_8.method4475(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)Z")
	public boolean method4101() {
		return this.method4102() >= 20;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)I")
	public int method4102() {
		return this.aClass169_6.method4482() + this.aClass169_7.method4482();
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public void method4103() {
		if (this.aClass202_5 != null) {
			this.aClass202_5.method5477();
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Z")
	public boolean method4105() {
		@Pc(14) int local14;
		if (this.aClass202_5 != null) {
			@Pc(7) long local7 = Static292.method5114();
			local14 = (int) (local7 - this.aLong138);
			this.aLong138 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt4729 += local14;
			if (this.anInt4729 > 30000) {
				try {
					this.aClass202_5.method5477();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass202_5 = null;
			}
		}
		if (this.aClass202_5 == null) {
			return this.method4102() == 0 && this.method4097() == 0;
		}
		try {
			this.aClass202_5.method5475();
			for (@Pc(82) Class1_Sub2_Sub10_Sub2 local82 = (Class1_Sub2_Sub10_Sub2) this.aClass169_6.method4480(); local82 != null; local82 = (Class1_Sub2_Sub10_Sub2) this.aClass169_6.method4474()) {
				this.aClass1_Sub21_5.anInt6611 = 0;
				this.aClass1_Sub21_5.method5718(1);
				this.aClass1_Sub21_5.method5737((int) local82.aLong213);
				this.aClass202_5.method5480(4, this.aClass1_Sub21_5.aByteArray82);
				this.aClass169_7.method4475(local82);
			}
			for (@Pc(130) Class1_Sub2_Sub10_Sub2 local130 = (Class1_Sub2_Sub10_Sub2) this.aClass169_8.method4480(); local130 != null; local130 = (Class1_Sub2_Sub10_Sub2) this.aClass169_8.method4474()) {
				this.aClass1_Sub21_5.anInt6611 = 0;
				this.aClass1_Sub21_5.method5718(0);
				this.aClass1_Sub21_5.method5737((int) local130.aLong213);
				this.aClass202_5.method5480(4, this.aClass1_Sub21_5.aByteArray82);
				this.aClass169_9.method4475(local130);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(183) int local183 = this.aClass202_5.method5473();
				if (local183 < 0) {
					throw new IOException();
				}
				if (local183 == 0) {
					break;
				}
				this.anInt4729 = 0;
				@Pc(199) byte local199 = 0;
				if (this.aClass1_Sub2_Sub10_Sub2_1 == null) {
					local199 = 8;
				} else if (this.aClass1_Sub2_Sub10_Sub2_1.anInt5676 == 0) {
					local199 = 1;
				}
				@Pc(224) int local224;
				@Pc(249) int local249;
				@Pc(310) int local310;
				if (local199 > 0) {
					local224 = local199 - this.aClass1_Sub21_6.anInt6611;
					if (local224 > local183) {
						local224 = local183;
					}
					this.aClass202_5.method5476(this.aClass1_Sub21_6.anInt6611, this.aClass1_Sub21_6.aByteArray82, local224);
					if (this.aByte61 != 0) {
						for (local249 = 0; local249 < local224; local249++) {
							this.aClass1_Sub21_6.aByteArray82[this.aClass1_Sub21_6.anInt6611 + local249] ^= this.aByte61;
						}
					}
					this.aClass1_Sub21_6.anInt6611 += local224;
					if (this.aClass1_Sub21_6.anInt6611 >= local199) {
						if (this.aClass1_Sub2_Sub10_Sub2_1 == null) {
							this.aClass1_Sub21_6.anInt6611 = 0;
							local249 = this.aClass1_Sub21_6.method5720();
							local310 = this.aClass1_Sub21_6.method5715();
							@Pc(315) int local315 = this.aClass1_Sub21_6.method5720();
							@Pc(320) int local320 = this.aClass1_Sub21_6.method5716();
							@Pc(324) int local324 = local315 & 0x7F;
							@Pc(332) boolean local332 = (local315 & 0x80) != 0;
							@Pc(339) long local339 = (long) ((local249 << 16) + local310);
							@Pc(349) Class1_Sub2_Sub10_Sub2 local349;
							if (local332) {
								for (local349 = (Class1_Sub2_Sub10_Sub2) this.aClass169_9.method4480(); local349 != null && local349.aLong213 != local339; local349 = (Class1_Sub2_Sub10_Sub2) this.aClass169_9.method4474()) {
								}
							} else {
								for (local349 = (Class1_Sub2_Sub10_Sub2) this.aClass169_7.method4480(); local349 != null && local339 != local349.aLong213; local349 = (Class1_Sub2_Sub10_Sub2) this.aClass169_7.method4474()) {
								}
							}
							if (local349 == null) {
								throw new IOException();
							}
							@Pc(412) int local412 = local324 == 0 ? 5 : 9;
							this.aClass1_Sub2_Sub10_Sub2_1 = local349;
							this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7 = new Class1_Sub21(this.aClass1_Sub2_Sub10_Sub2_1.aByte69 + local320 + local412);
							this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.method5718(local324);
							this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.method5702(local320);
							this.aClass1_Sub21_6.anInt6611 = 0;
							this.aClass1_Sub2_Sub10_Sub2_1.anInt5676 = 8;
						} else if (this.aClass1_Sub2_Sub10_Sub2_1.anInt5676 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub21_6.aByteArray82[0] == -1) {
							this.aClass1_Sub21_6.anInt6611 = 0;
							this.aClass1_Sub2_Sub10_Sub2_1.anInt5676 = 1;
						} else {
							this.aClass1_Sub2_Sub10_Sub2_1 = null;
						}
					}
				} else {
					local224 = this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.aByteArray82.length - this.aClass1_Sub2_Sub10_Sub2_1.aByte69;
					local249 = 512 - this.aClass1_Sub2_Sub10_Sub2_1.anInt5676;
					if (local224 - this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.anInt6611 < local249) {
						local249 = local224 - this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.anInt6611;
					}
					if (local183 < local249) {
						local249 = local183;
					}
					this.aClass202_5.method5476(this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.anInt6611, this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.aByteArray82, local249);
					if (this.aByte61 != 0) {
						for (local310 = 0; local310 < local249; local310++) {
							this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.aByteArray82[local310 + this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.anInt6611] ^= this.aByte61;
						}
					}
					this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.anInt6611 += local249;
					this.aClass1_Sub2_Sub10_Sub2_1.anInt5676 += local249;
					if (local224 == this.aClass1_Sub2_Sub10_Sub2_1.aClass1_Sub21_7.anInt6611) {
						this.aClass1_Sub2_Sub10_Sub2_1.method5784();
						this.aClass1_Sub2_Sub10_Sub2_1.aBoolean471 = false;
						this.aClass1_Sub2_Sub10_Sub2_1 = null;
					} else if (this.aClass1_Sub2_Sub10_Sub2_1.anInt5676 == 512) {
						this.aClass1_Sub2_Sub10_Sub2_1.anInt5676 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(639) IOException local639) {
			try {
				this.aClass202_5.method5477();
			} catch (@Pc(645) Exception local645) {
			}
			this.anInt4731 = -2;
			this.aClass202_5 = null;
			this.anInt4730++;
			return this.method4102() == 0 && this.method4097() == 0;
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
	private void method4106() {
		if (this.aClass202_5 == null) {
			return;
		}
		try {
			this.aClass1_Sub21_5.anInt6611 = 0;
			this.aClass1_Sub21_5.method5718(6);
			this.aClass1_Sub21_5.method5737(3);
			this.aClass202_5.method5480(4, this.aClass1_Sub21_5.aByteArray82);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass202_5.method5477();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt4730++;
			this.anInt4731 = -2;
			this.aClass202_5 = null;
		}
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
	public void method4107() {
		try {
			this.aClass202_5.method5477();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt4731 = -1;
		this.anInt4730++;
		this.aClass202_5 = null;
		this.aByte61 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
	public void method4109() {
		if (this.aClass202_5 == null) {
			return;
		}
		try {
			this.aClass1_Sub21_5.anInt6611 = 0;
			this.aClass1_Sub21_5.method5718(7);
			this.aClass1_Sub21_5.method5737(0);
			this.aClass202_5.method5480(4, this.aClass1_Sub21_5.aByteArray82);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass202_5.method5477();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt4730++;
			this.aClass202_5 = null;
			this.anInt4731 = -2;
		}
	}
}
