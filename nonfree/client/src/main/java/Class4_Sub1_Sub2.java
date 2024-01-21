import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
	private int anInt1521;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
	public int anInt1523;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
	public int anInt1524;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
	public int anInt1525;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
	public int anInt1526;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
	private int anInt1527;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
	public int anInt1530;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
	public int anInt1532;

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
	private final int anInt1533;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
	private final int anInt1528;

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "Z")
	private final boolean aBoolean49;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
	private int anInt1531;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	private int anInt1522;

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
	private int anInt1534;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
	public int anInt1529;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!re;II)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class4_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub6_5 = arg0;
		this.anInt1533 = arg0.anInt2327;
		this.anInt1528 = arg0.anInt2325;
		this.aBoolean49 = arg0.aBoolean85;
		this.anInt1531 = arg1;
		this.anInt1522 = arg2;
		this.anInt1534 = 8192;
		this.anInt1529 = 0;
		this.method915();
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!re;III)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class4_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub6_5 = arg0;
		this.anInt1533 = arg0.anInt2327;
		this.anInt1528 = arg0.anInt2325;
		this.aBoolean49 = arg0.aBoolean85;
		this.anInt1531 = arg1;
		this.anInt1522 = arg2;
		this.anInt1534 = arg3;
		this.anInt1529 = 0;
		this.method915();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1522 == 0 && this.anInt1521 == 0) {
			this.method1817(arg2);
			return;
		}
		@Pc(13) Class4_Sub6_Sub1 local13 = (Class4_Sub6_Sub1) super.aClass4_Sub6_5;
		@Pc(18) int local18 = this.anInt1533 << 8;
		@Pc(23) int local23 = this.anInt1528 << 8;
		@Pc(29) int local29 = local13.aByteArray36.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1527 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1529 < 0) {
			if (this.anInt1531 <= 0) {
				this.method909();
				this.method1989();
				return;
			}
			this.anInt1529 = 0;
		}
		if (this.anInt1529 >= local29) {
			if (this.anInt1531 >= 0) {
				this.method909();
				this.method1989();
				return;
			}
			this.anInt1529 = local29 - 1;
		}
		if (this.anInt1527 >= 0) {
			if (this.anInt1527 > 0) {
				if (this.aBoolean49) {
					label130: {
						if (this.anInt1531 < 0) {
							local40 = this.method923(arg0, arg1, local18, local44, local13.aByteArray36[this.anInt1533]);
							if (this.anInt1529 >= local18) {
								return;
							}
							this.anInt1529 = local18 + local18 - this.anInt1529 - 1;
							this.anInt1531 = -this.anInt1531;
							if (--this.anInt1527 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method901(arg0, local40, local23, local44, local13.aByteArray36[this.anInt1528 - 1]);
							if (this.anInt1529 < local23) {
								return;
							}
							this.anInt1529 = local23 + local23 - this.anInt1529 - 1;
							this.anInt1531 = -this.anInt1531;
							if (--this.anInt1527 == 0) {
								break;
							}
							local40 = this.method923(arg0, local40, local18, local44, local13.aByteArray36[this.anInt1533]);
							if (this.anInt1529 >= local18) {
								return;
							}
							this.anInt1529 = local18 + local18 - this.anInt1529 - 1;
							this.anInt1531 = -this.anInt1531;
						} while (--this.anInt1527 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1531 < 0) {
						while (true) {
							local40 = this.method923(arg0, local40, local18, local44, local13.aByteArray36[this.anInt1528 - 1]);
							if (this.anInt1529 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1529 - 1) / local33;
							if (local416 >= this.anInt1527) {
								this.anInt1529 += local33 * this.anInt1527;
								this.anInt1527 = 0;
								break;
							}
							this.anInt1529 += local33 * local416;
							this.anInt1527 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method901(arg0, local40, local23, local44, local13.aByteArray36[this.anInt1533]);
							if (this.anInt1529 < local23) {
								return;
							}
							local416 = (this.anInt1529 - local18) / local33;
							if (local416 >= this.anInt1527) {
								this.anInt1529 -= local33 * this.anInt1527;
								this.anInt1527 = 0;
								break;
							}
							this.anInt1529 -= local33 * local416;
							this.anInt1527 -= local416;
						}
					}
				}
			}
			if (this.anInt1531 < 0) {
				this.method923(arg0, local40, 0, local44, 0);
				if (this.anInt1529 < 0) {
					this.anInt1529 = -1;
					this.method909();
					this.method1989();
					return;
				}
			} else {
				this.method901(arg0, local40, local29, local44, 0);
				if (this.anInt1529 >= local29) {
					this.anInt1529 = local29;
					this.method909();
					this.method1989();
				}
			}
		} else if (this.aBoolean49) {
			if (this.anInt1531 < 0) {
				local40 = this.method923(arg0, arg1, local18, local44, local13.aByteArray36[this.anInt1533]);
				if (this.anInt1529 >= local18) {
					return;
				}
				this.anInt1529 = local18 + local18 - this.anInt1529 - 1;
				this.anInt1531 = -this.anInt1531;
			}
			while (true) {
				local40 = this.method901(arg0, local40, local23, local44, local13.aByteArray36[this.anInt1528 - 1]);
				if (this.anInt1529 < local23) {
					return;
				}
				this.anInt1529 = local23 + local23 - this.anInt1529 - 1;
				this.anInt1531 = -this.anInt1531;
				local40 = this.method923(arg0, local40, local18, local44, local13.aByteArray36[this.anInt1533]);
				if (this.anInt1529 >= local18) {
					return;
				}
				this.anInt1529 = local18 + local18 - this.anInt1529 - 1;
				this.anInt1531 = -this.anInt1531;
			}
		} else if (this.anInt1531 < 0) {
			while (true) {
				local40 = this.method923(arg0, local40, local18, local44, local13.aByteArray36[this.anInt1528 - 1]);
				if (this.anInt1529 >= local18) {
					return;
				}
				this.anInt1529 = local23 - (local23 - 1 - this.anInt1529) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method901(arg0, local40, local23, local44, local13.aByteArray36[this.anInt1533]);
				if (this.anInt1529 < local23) {
					return;
				}
				this.anInt1529 = local18 + (this.anInt1529 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	public synchronized void method899(@OriginalArg(0) int arg0) {
		this.anInt1527 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "()Z")
	public boolean method900() {
		return this.anInt1529 < 0 || this.anInt1529 >= ((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36.length << 8;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "()I")
	@Override
	public int method1816() {
		return this.anInt1522 == 0 && this.anInt1521 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([IIIII)I")
	private int method901(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1521 <= 0) {
				if (this.anInt1531 == 256 && (this.anInt1529 & 0xFF) == 0) {
					if (Static6.aBoolean2) {
						return Static137.method905(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1524, this.anInt1523, arg3, arg2, this);
					}
					return Static137.method910(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1526, arg3, arg2, this);
				}
				if (Static6.aBoolean2) {
					return Static137.method918(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1524, this.anInt1523, arg3, arg2, this, this.anInt1531, arg4);
				}
				return Static137.method934(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1526, arg3, arg2, this, this.anInt1531, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1521;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1521 += arg1;
			if (this.anInt1531 == 256 && (this.anInt1529 & 0xFF) == 0) {
				if (Static6.aBoolean2) {
					arg1 = Static137.method916(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1524, this.anInt1523, this.anInt1530, this.anInt1532, local5, arg2, this);
				} else {
					arg1 = Static137.method913(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1526, this.anInt1525, local5, arg2, this);
				}
			} else if (Static6.aBoolean2) {
				arg1 = Static137.method922(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1524, this.anInt1523, this.anInt1530, this.anInt1532, local5, arg2, this, this.anInt1531, arg4);
			} else {
				arg1 = Static137.method919(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1526, this.anInt1525, local5, arg2, this, this.anInt1531, arg4);
			}
			this.anInt1521 -= arg1;
			if (this.anInt1521 != 0) {
				return arg1;
			}
		} while (!this.method917());
		return arg3;
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "()Z")
	public boolean method902() {
		return this.anInt1521 != 0;
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "()I")
	public synchronized int method903() {
		return this.anInt1534 < 0 ? -1 : this.anInt1534;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "()Lclient!ac;")
	@Override
	public Class4_Sub1 method1814() {
		return null;
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
	public synchronized void method906(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method911();
			this.method1989();
		} else if (this.anInt1524 == 0 && this.anInt1523 == 0) {
			this.anInt1521 = 0;
			this.anInt1522 = 0;
			this.anInt1526 = 0;
			this.method1989();
		} else {
			@Pc(31) int local31 = -this.anInt1526;
			if (this.anInt1526 > local31) {
				local31 = this.anInt1526;
			}
			if (-this.anInt1524 > local31) {
				local31 = -this.anInt1524;
			}
			if (this.anInt1524 > local31) {
				local31 = this.anInt1524;
			}
			if (-this.anInt1523 > local31) {
				local31 = -this.anInt1523;
			}
			if (this.anInt1523 > local31) {
				local31 = this.anInt1523;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1521 = arg0;
			this.anInt1522 = Integer.MIN_VALUE;
			this.anInt1525 = -this.anInt1526 / arg0;
			this.anInt1530 = -this.anInt1524 / arg0;
			this.anInt1532 = -this.anInt1523 / arg0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "()Lclient!ac;")
	@Override
	public Class4_Sub1 method1811() {
		return null;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
	private synchronized void method908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1522 = arg0;
		this.anInt1534 = arg1;
		this.anInt1521 = 0;
		this.method915();
	}

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "()V")
	private void method909() {
		if (this.anInt1521 == 0) {
			return;
		}
		if (this.anInt1522 == Integer.MIN_VALUE) {
			this.anInt1522 = 0;
		}
		this.anInt1521 = 0;
		this.method915();
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
	private synchronized void method911() {
		this.method908(0, this.method903());
	}

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "(I)V")
	public synchronized void method912(@OriginalArg(0) int arg0) {
		if (this.anInt1531 < 0) {
			this.anInt1531 = -arg0;
		} else {
			this.anInt1531 = arg0;
		}
	}

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "()V")
	private void method915() {
		this.anInt1526 = this.anInt1522;
		this.anInt1524 = Static137.method907(this.anInt1522, this.anInt1534);
		this.anInt1523 = Static137.method914(this.anInt1522, this.anInt1534);
	}

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "()Z")
	private boolean method917() {
		@Pc(2) int local2 = this.anInt1522;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static137.method907(local2, this.anInt1534);
			local8 = Static137.method914(local2, this.anInt1534);
		}
		if (this.anInt1526 != local2 || this.anInt1524 != local10 || this.anInt1523 != local8) {
			if (this.anInt1526 < local2) {
				this.anInt1525 = 1;
				this.anInt1521 = local2 - this.anInt1526;
			} else if (this.anInt1526 > local2) {
				this.anInt1525 = -1;
				this.anInt1521 = this.anInt1526 - local2;
			} else {
				this.anInt1525 = 0;
			}
			if (this.anInt1524 < local10) {
				this.anInt1530 = 1;
				if (this.anInt1521 == 0 || this.anInt1521 > local10 - this.anInt1524) {
					this.anInt1521 = local10 - this.anInt1524;
				}
			} else if (this.anInt1524 > local10) {
				this.anInt1530 = -1;
				if (this.anInt1521 == 0 || this.anInt1521 > this.anInt1524 - local10) {
					this.anInt1521 = this.anInt1524 - local10;
				}
			} else {
				this.anInt1530 = 0;
			}
			if (this.anInt1523 < local8) {
				this.anInt1532 = 1;
				if (this.anInt1521 == 0 || this.anInt1521 > local8 - this.anInt1523) {
					this.anInt1521 = local8 - this.anInt1523;
				}
			} else if (this.anInt1523 > local8) {
				this.anInt1532 = -1;
				if (this.anInt1521 == 0 || this.anInt1521 > this.anInt1523 - local8) {
					this.anInt1521 = this.anInt1523 - local8;
				}
			} else {
				this.anInt1532 = 0;
			}
			return false;
		} else if (this.anInt1522 == Integer.MIN_VALUE) {
			this.anInt1522 = 0;
			this.anInt1526 = this.anInt1524 = this.anInt1523 = 0;
			this.method1989();
			return true;
		} else {
			this.method915();
			return false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "()I")
	@Override
	public int method1812() {
		@Pc(6) int local6 = this.anInt1526 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1527 == 0) {
			local6 -= local6 * this.anInt1529 / (((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36.length << 8);
		} else if (this.anInt1527 >= 0) {
			local6 -= local6 * this.anInt1533 / ((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1817(@OriginalArg(0) int arg0) {
		if (this.anInt1521 > 0) {
			if (arg0 >= this.anInt1521) {
				if (this.anInt1522 == Integer.MIN_VALUE) {
					this.anInt1522 = 0;
					this.anInt1526 = this.anInt1524 = this.anInt1523 = 0;
					this.method1989();
					arg0 = this.anInt1521;
				}
				this.anInt1521 = 0;
				this.method915();
			} else {
				this.anInt1526 += this.anInt1525 * arg0;
				this.anInt1524 += this.anInt1530 * arg0;
				this.anInt1523 += this.anInt1532 * arg0;
				this.anInt1521 -= arg0;
			}
		}
		@Pc(71) Class4_Sub6_Sub1 local71 = (Class4_Sub6_Sub1) super.aClass4_Sub6_5;
		@Pc(76) int local76 = this.anInt1533 << 8;
		@Pc(81) int local81 = this.anInt1528 << 8;
		@Pc(87) int local87 = local71.aByteArray36.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1527 = 0;
		}
		if (this.anInt1529 < 0) {
			if (this.anInt1531 <= 0) {
				this.method909();
				this.method1989();
				return;
			}
			this.anInt1529 = 0;
		}
		if (this.anInt1529 >= local87) {
			if (this.anInt1531 >= 0) {
				this.method909();
				this.method1989();
				return;
			}
			this.anInt1529 = local87 - 1;
		}
		this.anInt1529 += this.anInt1531 * arg0;
		if (this.anInt1527 >= 0) {
			if (this.anInt1527 > 0) {
				if (this.aBoolean49) {
					label125: {
						if (this.anInt1531 < 0) {
							if (this.anInt1529 >= local76) {
								return;
							}
							this.anInt1529 = local76 + local76 - this.anInt1529 - 1;
							this.anInt1531 = -this.anInt1531;
							if (--this.anInt1527 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1529 < local81) {
								return;
							}
							this.anInt1529 = local81 + local81 - this.anInt1529 - 1;
							this.anInt1531 = -this.anInt1531;
							if (--this.anInt1527 == 0) {
								break;
							}
							if (this.anInt1529 >= local76) {
								return;
							}
							this.anInt1529 = local76 + local76 - this.anInt1529 - 1;
							this.anInt1531 = -this.anInt1531;
						} while (--this.anInt1527 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1531 < 0) {
						if (this.anInt1529 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1529 - 1) / local91;
						if (local361 < this.anInt1527) {
							this.anInt1529 += local91 * local361;
							this.anInt1527 -= local361;
							return;
						}
						this.anInt1529 += local91 * this.anInt1527;
						this.anInt1527 = 0;
					} else if (this.anInt1529 >= local81) {
						local361 = (this.anInt1529 - local76) / local91;
						if (local361 < this.anInt1527) {
							this.anInt1529 -= local91 * local361;
							this.anInt1527 -= local361;
							return;
						}
						this.anInt1529 -= local91 * this.anInt1527;
						this.anInt1527 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1531 < 0) {
				if (this.anInt1529 < 0) {
					this.anInt1529 = -1;
					this.method909();
					this.method1989();
					return;
				}
			} else if (this.anInt1529 >= local87) {
				this.anInt1529 = local87;
				this.method909();
				this.method1989();
			}
		} else if (this.aBoolean49) {
			if (this.anInt1531 < 0) {
				if (this.anInt1529 >= local76) {
					return;
				}
				this.anInt1529 = local76 + local76 - this.anInt1529 - 1;
				this.anInt1531 = -this.anInt1531;
			}
			while (this.anInt1529 >= local81) {
				this.anInt1529 = local81 + local81 - this.anInt1529 - 1;
				this.anInt1531 = -this.anInt1531;
				if (this.anInt1529 >= local76) {
					return;
				}
				this.anInt1529 = local76 + local76 - this.anInt1529 - 1;
				this.anInt1531 = -this.anInt1531;
			}
		} else if (this.anInt1531 < 0) {
			if (this.anInt1529 < local76) {
				this.anInt1529 = local81 - (local81 - 1 - this.anInt1529) % local91 - 1;
			}
		} else if (this.anInt1529 >= local81) {
			this.anInt1529 = local76 + (this.anInt1529 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "([IIIII)I")
	private int method923(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1521 <= 0) {
				if (this.anInt1531 == -256 && (this.anInt1529 & 0xFF) == 0) {
					if (Static6.aBoolean2) {
						return Static137.method935(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1524, this.anInt1523, arg3, arg2, this);
					}
					return Static137.method920(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1526, arg3, arg2, this);
				}
				if (Static6.aBoolean2) {
					return Static137.method931(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1524, this.anInt1523, arg3, arg2, this, this.anInt1531, arg4);
				}
				return Static137.method921(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1526, arg3, arg2, this, this.anInt1531, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1521;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1521 += arg1;
			if (this.anInt1531 == -256 && (this.anInt1529 & 0xFF) == 0) {
				if (Static6.aBoolean2) {
					arg1 = Static137.method927(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1524, this.anInt1523, this.anInt1530, this.anInt1532, local5, arg2, this);
				} else {
					arg1 = Static137.method924(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1526, this.anInt1525, local5, arg2, this);
				}
			} else if (Static6.aBoolean2) {
				arg1 = Static137.method930(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1524, this.anInt1523, this.anInt1530, this.anInt1532, local5, arg2, this, this.anInt1531, arg4);
			} else {
				arg1 = Static137.method932(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36, arg0, this.anInt1529, arg1, this.anInt1526, this.anInt1525, local5, arg2, this, this.anInt1531, arg4);
			}
			this.anInt1521 -= arg1;
			if (this.anInt1521 != 0) {
				return arg1;
			}
		} while (!this.method917());
		return arg3;
	}

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "()I")
	public synchronized int method925() {
		return this.anInt1522 == Integer.MIN_VALUE ? 0 : this.anInt1522;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)V")
	public synchronized void method926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method929(arg0, arg1, this.method903());
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public synchronized void method928() {
		this.anInt1531 = (this.anInt1531 ^ this.anInt1531 >> 31) + (this.anInt1531 >>> 31);
		this.anInt1531 = -this.anInt1531;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
	public synchronized void method929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method908(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static137.method907(arg1, arg2);
		@Pc(14) int local14 = Static137.method914(arg1, arg2);
		if (this.anInt1524 == local10 && this.anInt1523 == local14) {
			this.anInt1521 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1526;
		if (this.anInt1526 - arg1 > local31) {
			local31 = this.anInt1526 - arg1;
		}
		if (local10 - this.anInt1524 > local31) {
			local31 = local10 - this.anInt1524;
		}
		if (this.anInt1524 - local10 > local31) {
			local31 = this.anInt1524 - local10;
		}
		if (local14 - this.anInt1523 > local31) {
			local31 = local14 - this.anInt1523;
		}
		if (this.anInt1523 - local14 > local31) {
			local31 = this.anInt1523 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1521 = arg0;
		this.anInt1522 = arg1;
		this.anInt1534 = arg2;
		this.anInt1525 = (arg1 - this.anInt1526) / arg0;
		this.anInt1530 = (local10 - this.anInt1524) / arg0;
		this.anInt1532 = (local14 - this.anInt1523) / arg0;
	}

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "()I")
	public synchronized int method933() {
		return this.anInt1531 < 0 ? -this.anInt1531 : this.anInt1531;
	}

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)V")
	public synchronized void method936(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray36.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1529 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "(I)V")
	public synchronized void method938(@OriginalArg(0) int arg0) {
		this.method908(arg0 << 6, this.method903());
	}
}
