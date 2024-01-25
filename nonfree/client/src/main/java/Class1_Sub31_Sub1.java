import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class1_Sub31_Sub1 extends Class1_Sub31 {

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public int anInt4487;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "I")
	public int anInt4488;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "I")
	public int anInt4489;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	public int anInt4491;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "I")
	private int anInt4492;

	@OriginalMember(owner = "client!od", name = "v", descriptor = "I")
	public int anInt4494;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "I")
	public int anInt4495;

	@OriginalMember(owner = "client!od", name = "A", descriptor = "I")
	private int anInt4499;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "I")
	private final int anInt4496;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "I")
	private final int anInt4493;

	@OriginalMember(owner = "client!od", name = "B", descriptor = "Z")
	private final boolean aBoolean358;

	@OriginalMember(owner = "client!od", name = "C", descriptor = "I")
	private int anInt4500;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	private int anInt4498;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "I")
	private int anInt4490;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "I")
	public int anInt4497;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!ig;II)V")
	public Class1_Sub31_Sub1(@OriginalArg(0) Class1_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub20_5 = arg0;
		this.anInt4496 = arg0.anInt2541;
		this.anInt4493 = arg0.anInt2543;
		this.aBoolean358 = arg0.aBoolean206;
		this.anInt4500 = arg1;
		this.anInt4498 = arg2;
		this.anInt4490 = 8192;
		this.anInt4497 = 0;
		this.method3920();
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!ig;III)V")
	public Class1_Sub31_Sub1(@OriginalArg(0) Class1_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub20_5 = arg0;
		this.anInt4496 = arg0.anInt2541;
		this.anInt4493 = arg0.anInt2543;
		this.aBoolean358 = arg0.aBoolean206;
		this.anInt4500 = arg1;
		this.anInt4498 = arg2;
		this.anInt4490 = arg3;
		this.anInt4497 = 0;
		this.method3920();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public synchronized void method3885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3894(arg0, arg1, this.method3917());
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	public synchronized void method3886(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3892();
			this.method5796();
		} else if (this.anInt4489 == 0 && this.anInt4495 == 0) {
			this.anInt4492 = 0;
			this.anInt4498 = 0;
			this.anInt4494 = 0;
			this.method5796();
		} else {
			@Pc(31) int local31 = -this.anInt4494;
			if (this.anInt4494 > local31) {
				local31 = this.anInt4494;
			}
			if (-this.anInt4489 > local31) {
				local31 = -this.anInt4489;
			}
			if (this.anInt4489 > local31) {
				local31 = this.anInt4489;
			}
			if (-this.anInt4495 > local31) {
				local31 = -this.anInt4495;
			}
			if (this.anInt4495 > local31) {
				local31 = this.anInt4495;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4492 = arg0;
			this.anInt4498 = Integer.MIN_VALUE;
			this.anInt4491 = -this.anInt4494 / arg0;
			this.anInt4488 = -this.anInt4489 / arg0;
			this.anInt4487 = -this.anInt4495 / arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "()Z")
	private boolean method3888() {
		@Pc(2) int local2 = this.anInt4498;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static366.method3895(local2, this.anInt4490);
			local8 = Static366.method3924(local2, this.anInt4490);
		}
		if (this.anInt4494 != local2 || this.anInt4489 != local10 || this.anInt4495 != local8) {
			if (this.anInt4494 < local2) {
				this.anInt4491 = 1;
				this.anInt4492 = local2 - this.anInt4494;
			} else if (this.anInt4494 > local2) {
				this.anInt4491 = -1;
				this.anInt4492 = this.anInt4494 - local2;
			} else {
				this.anInt4491 = 0;
			}
			if (this.anInt4489 < local10) {
				this.anInt4488 = 1;
				if (this.anInt4492 == 0 || this.anInt4492 > local10 - this.anInt4489) {
					this.anInt4492 = local10 - this.anInt4489;
				}
			} else if (this.anInt4489 > local10) {
				this.anInt4488 = -1;
				if (this.anInt4492 == 0 || this.anInt4492 > this.anInt4489 - local10) {
					this.anInt4492 = this.anInt4489 - local10;
				}
			} else {
				this.anInt4488 = 0;
			}
			if (this.anInt4495 < local8) {
				this.anInt4487 = 1;
				if (this.anInt4492 == 0 || this.anInt4492 > local8 - this.anInt4495) {
					this.anInt4492 = local8 - this.anInt4495;
				}
			} else if (this.anInt4495 > local8) {
				this.anInt4487 = -1;
				if (this.anInt4492 == 0 || this.anInt4492 > this.anInt4495 - local8) {
					this.anInt4492 = this.anInt4495 - local8;
				}
			} else {
				this.anInt4487 = 0;
			}
			return false;
		} else if (this.anInt4498 == Integer.MIN_VALUE) {
			this.anInt4498 = 0;
			this.anInt4494 = this.anInt4489 = this.anInt4495 = 0;
			this.method5796();
			return true;
		} else {
			this.method3920();
			return false;
		}
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "()Z")
	public boolean method3890() {
		return this.anInt4492 != 0;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
	private synchronized void method3892() {
		this.method3905(0, this.method3917());
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	public synchronized void method3894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3905(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static366.method3895(arg1, arg2);
		@Pc(14) int local14 = Static366.method3924(arg1, arg2);
		if (this.anInt4489 == local10 && this.anInt4495 == local14) {
			this.anInt4492 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4494;
		if (this.anInt4494 - arg1 > local31) {
			local31 = this.anInt4494 - arg1;
		}
		if (local10 - this.anInt4489 > local31) {
			local31 = local10 - this.anInt4489;
		}
		if (this.anInt4489 - local10 > local31) {
			local31 = this.anInt4489 - local10;
		}
		if (local14 - this.anInt4495 > local31) {
			local31 = local14 - this.anInt4495;
		}
		if (this.anInt4495 - local14 > local31) {
			local31 = this.anInt4495 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4492 = arg0;
		this.anInt4498 = arg1;
		this.anInt4490 = arg2;
		this.anInt4491 = (arg1 - this.anInt4494) / arg0;
		this.anInt4488 = (local10 - this.anInt4489) / arg0;
		this.anInt4487 = (local14 - this.anInt4495) / arg0;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public synchronized void method3896(@OriginalArg(0) int arg0) {
		this.method3905(arg0 << 6, this.method3917());
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public synchronized void method3898() {
		this.anInt4500 = (this.anInt4500 ^ this.anInt4500 >> 31) + (this.anInt4500 >>> 31);
		this.anInt4500 = -this.anInt4500;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()I")
	@Override
	public int method5518() {
		return this.anInt4498 == 0 && this.anInt4492 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "()I")
	public synchronized int method3899() {
		return this.anInt4498 == Integer.MIN_VALUE ? 0 : this.anInt4498;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
	public synchronized void method3902(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4497 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(II)V")
	private synchronized void method3905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4498 = arg0;
		this.anInt4490 = arg1;
		this.anInt4492 = 0;
		this.method3920();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([IIIII)I")
	private int method3906(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4492 <= 0) {
				if (this.anInt4500 == 256 && (this.anInt4497 & 0xFF) == 0) {
					if (Static340.aBoolean542) {
						return Static366.method3923(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4489, this.anInt4495, arg3, arg2, this);
					}
					return Static366.method3887(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4494, arg3, arg2, this);
				}
				if (Static340.aBoolean542) {
					return Static366.method3903(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4489, this.anInt4495, arg3, arg2, this, this.anInt4500, arg4);
				}
				return Static366.method3914(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4494, arg3, arg2, this, this.anInt4500, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4492;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4492 += arg1;
			if (this.anInt4500 == 256 && (this.anInt4497 & 0xFF) == 0) {
				if (Static340.aBoolean542) {
					arg1 = Static366.method3897(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4489, this.anInt4495, this.anInt4488, this.anInt4487, local5, arg2, this);
				} else {
					arg1 = Static366.method3901(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4494, this.anInt4491, local5, arg2, this);
				}
			} else if (Static340.aBoolean542) {
				arg1 = Static366.method3900(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4489, this.anInt4495, this.anInt4488, this.anInt4487, local5, arg2, this, this.anInt4500, arg4);
			} else {
				arg1 = Static366.method3922(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4494, this.anInt4491, local5, arg2, this, this.anInt4500, arg4);
			}
			this.anInt4492 -= arg1;
			if (this.anInt4492 != 0) {
				return arg1;
			}
		} while (!this.method3888());
		return arg3;
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "()V")
	private void method3907() {
		if (this.anInt4492 == 0) {
			return;
		}
		if (this.anInt4498 == Integer.MIN_VALUE) {
			this.anInt4498 = 0;
		}
		this.anInt4492 = 0;
		this.method3920();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()I")
	@Override
	public int method5512() {
		@Pc(6) int local6 = this.anInt4494 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4499 == 0) {
			local6 -= local6 * this.anInt4497 / (((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23.length << 8);
		} else if (this.anInt4499 >= 0) {
			local6 -= local6 * this.anInt4496 / ((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!od", name = "i", descriptor = "()Z")
	public boolean method3908() {
		return this.anInt4497 < 0 || this.anInt4497 >= ((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23.length << 8;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()Lclient!pl;")
	@Override
	public Class1_Sub31 method5517() {
		return null;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5516(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4498 == 0 && this.anInt4492 == 0) {
			this.method5514(arg2);
			return;
		}
		@Pc(13) Class1_Sub20_Sub1 local13 = (Class1_Sub20_Sub1) super.aClass1_Sub20_5;
		@Pc(18) int local18 = this.anInt4496 << 8;
		@Pc(23) int local23 = this.anInt4493 << 8;
		@Pc(29) int local29 = local13.aByteArray23.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4499 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4497 < 0) {
			if (this.anInt4500 <= 0) {
				this.method3907();
				this.method5796();
				return;
			}
			this.anInt4497 = 0;
		}
		if (this.anInt4497 >= local29) {
			if (this.anInt4500 >= 0) {
				this.method3907();
				this.method5796();
				return;
			}
			this.anInt4497 = local29 - 1;
		}
		if (this.anInt4499 >= 0) {
			if (this.anInt4499 > 0) {
				if (this.aBoolean358) {
					label130: {
						if (this.anInt4500 < 0) {
							local40 = this.method3910(arg0, arg1, local18, local44, local13.aByteArray23[this.anInt4496]);
							if (this.anInt4497 >= local18) {
								return;
							}
							this.anInt4497 = local18 + local18 - this.anInt4497 - 1;
							this.anInt4500 = -this.anInt4500;
							if (--this.anInt4499 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3906(arg0, local40, local23, local44, local13.aByteArray23[this.anInt4493 - 1]);
							if (this.anInt4497 < local23) {
								return;
							}
							this.anInt4497 = local23 + local23 - this.anInt4497 - 1;
							this.anInt4500 = -this.anInt4500;
							if (--this.anInt4499 == 0) {
								break;
							}
							local40 = this.method3910(arg0, local40, local18, local44, local13.aByteArray23[this.anInt4496]);
							if (this.anInt4497 >= local18) {
								return;
							}
							this.anInt4497 = local18 + local18 - this.anInt4497 - 1;
							this.anInt4500 = -this.anInt4500;
						} while (--this.anInt4499 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4500 < 0) {
						while (true) {
							local40 = this.method3910(arg0, local40, local18, local44, local13.aByteArray23[this.anInt4493 - 1]);
							if (this.anInt4497 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4497 - 1) / local33;
							if (local416 >= this.anInt4499) {
								this.anInt4497 += local33 * this.anInt4499;
								this.anInt4499 = 0;
								break;
							}
							this.anInt4497 += local33 * local416;
							this.anInt4499 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3906(arg0, local40, local23, local44, local13.aByteArray23[this.anInt4496]);
							if (this.anInt4497 < local23) {
								return;
							}
							local416 = (this.anInt4497 - local18) / local33;
							if (local416 >= this.anInt4499) {
								this.anInt4497 -= local33 * this.anInt4499;
								this.anInt4499 = 0;
								break;
							}
							this.anInt4497 -= local33 * local416;
							this.anInt4499 -= local416;
						}
					}
				}
			}
			if (this.anInt4500 < 0) {
				this.method3910(arg0, local40, 0, local44, 0);
				if (this.anInt4497 < 0) {
					this.anInt4497 = -1;
					this.method3907();
					this.method5796();
					return;
				}
			} else {
				this.method3906(arg0, local40, local29, local44, 0);
				if (this.anInt4497 >= local29) {
					this.anInt4497 = local29;
					this.method3907();
					this.method5796();
				}
			}
		} else if (this.aBoolean358) {
			if (this.anInt4500 < 0) {
				local40 = this.method3910(arg0, arg1, local18, local44, local13.aByteArray23[this.anInt4496]);
				if (this.anInt4497 >= local18) {
					return;
				}
				this.anInt4497 = local18 + local18 - this.anInt4497 - 1;
				this.anInt4500 = -this.anInt4500;
			}
			while (true) {
				local40 = this.method3906(arg0, local40, local23, local44, local13.aByteArray23[this.anInt4493 - 1]);
				if (this.anInt4497 < local23) {
					return;
				}
				this.anInt4497 = local23 + local23 - this.anInt4497 - 1;
				this.anInt4500 = -this.anInt4500;
				local40 = this.method3910(arg0, local40, local18, local44, local13.aByteArray23[this.anInt4496]);
				if (this.anInt4497 >= local18) {
					return;
				}
				this.anInt4497 = local18 + local18 - this.anInt4497 - 1;
				this.anInt4500 = -this.anInt4500;
			}
		} else if (this.anInt4500 < 0) {
			while (true) {
				local40 = this.method3910(arg0, local40, local18, local44, local13.aByteArray23[this.anInt4493 - 1]);
				if (this.anInt4497 >= local18) {
					return;
				}
				this.anInt4497 = local23 - (local23 - 1 - this.anInt4497) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3906(arg0, local40, local23, local44, local13.aByteArray23[this.anInt4496]);
				if (this.anInt4497 < local23) {
					return;
				}
				this.anInt4497 = local18 + (this.anInt4497 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "([IIIII)I")
	private int method3910(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4492 <= 0) {
				if (this.anInt4500 == -256 && (this.anInt4497 & 0xFF) == 0) {
					if (Static340.aBoolean542) {
						return Static366.method3909(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4489, this.anInt4495, arg3, arg2, this);
					}
					return Static366.method3893(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4494, arg3, arg2, this);
				}
				if (Static340.aBoolean542) {
					return Static366.method3916(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4489, this.anInt4495, arg3, arg2, this, this.anInt4500, arg4);
				}
				return Static366.method3904(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4494, arg3, arg2, this, this.anInt4500, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4492;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4492 += arg1;
			if (this.anInt4500 == -256 && (this.anInt4497 & 0xFF) == 0) {
				if (Static340.aBoolean542) {
					arg1 = Static366.method3891(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4489, this.anInt4495, this.anInt4488, this.anInt4487, local5, arg2, this);
				} else {
					arg1 = Static366.method3915(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4494, this.anInt4491, local5, arg2, this);
				}
			} else if (Static340.aBoolean542) {
				arg1 = Static366.method3918(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4489, this.anInt4495, this.anInt4488, this.anInt4487, local5, arg2, this, this.anInt4500, arg4);
			} else {
				arg1 = Static366.method3912(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray23, arg0, this.anInt4497, arg1, this.anInt4494, this.anInt4491, local5, arg2, this, this.anInt4500, arg4);
			}
			this.anInt4492 -= arg1;
			if (this.anInt4492 != 0) {
				return arg1;
			}
		} while (!this.method3888());
		return arg3;
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(I)V")
	public synchronized void method3911(@OriginalArg(0) int arg0) {
		if (this.anInt4500 < 0) {
			this.anInt4500 = -arg0;
		} else {
			this.anInt4500 = arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "j", descriptor = "()I")
	public synchronized int method3913() {
		return this.anInt4500 < 0 ? -this.anInt4500 : this.anInt4500;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5514(@OriginalArg(0) int arg0) {
		if (this.anInt4492 > 0) {
			if (arg0 >= this.anInt4492) {
				if (this.anInt4498 == Integer.MIN_VALUE) {
					this.anInt4498 = 0;
					this.anInt4494 = this.anInt4489 = this.anInt4495 = 0;
					this.method5796();
					arg0 = this.anInt4492;
				}
				this.anInt4492 = 0;
				this.method3920();
			} else {
				this.anInt4494 += this.anInt4491 * arg0;
				this.anInt4489 += this.anInt4488 * arg0;
				this.anInt4495 += this.anInt4487 * arg0;
				this.anInt4492 -= arg0;
			}
		}
		@Pc(71) Class1_Sub20_Sub1 local71 = (Class1_Sub20_Sub1) super.aClass1_Sub20_5;
		@Pc(76) int local76 = this.anInt4496 << 8;
		@Pc(81) int local81 = this.anInt4493 << 8;
		@Pc(87) int local87 = local71.aByteArray23.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4499 = 0;
		}
		if (this.anInt4497 < 0) {
			if (this.anInt4500 <= 0) {
				this.method3907();
				this.method5796();
				return;
			}
			this.anInt4497 = 0;
		}
		if (this.anInt4497 >= local87) {
			if (this.anInt4500 >= 0) {
				this.method3907();
				this.method5796();
				return;
			}
			this.anInt4497 = local87 - 1;
		}
		this.anInt4497 += this.anInt4500 * arg0;
		if (this.anInt4499 >= 0) {
			if (this.anInt4499 > 0) {
				if (this.aBoolean358) {
					label125: {
						if (this.anInt4500 < 0) {
							if (this.anInt4497 >= local76) {
								return;
							}
							this.anInt4497 = local76 + local76 - this.anInt4497 - 1;
							this.anInt4500 = -this.anInt4500;
							if (--this.anInt4499 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4497 < local81) {
								return;
							}
							this.anInt4497 = local81 + local81 - this.anInt4497 - 1;
							this.anInt4500 = -this.anInt4500;
							if (--this.anInt4499 == 0) {
								break;
							}
							if (this.anInt4497 >= local76) {
								return;
							}
							this.anInt4497 = local76 + local76 - this.anInt4497 - 1;
							this.anInt4500 = -this.anInt4500;
						} while (--this.anInt4499 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4500 < 0) {
						if (this.anInt4497 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4497 - 1) / local91;
						if (local361 < this.anInt4499) {
							this.anInt4497 += local91 * local361;
							this.anInt4499 -= local361;
							return;
						}
						this.anInt4497 += local91 * this.anInt4499;
						this.anInt4499 = 0;
					} else if (this.anInt4497 >= local81) {
						local361 = (this.anInt4497 - local76) / local91;
						if (local361 < this.anInt4499) {
							this.anInt4497 -= local91 * local361;
							this.anInt4499 -= local361;
							return;
						}
						this.anInt4497 -= local91 * this.anInt4499;
						this.anInt4499 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4500 < 0) {
				if (this.anInt4497 < 0) {
					this.anInt4497 = -1;
					this.method3907();
					this.method5796();
					return;
				}
			} else if (this.anInt4497 >= local87) {
				this.anInt4497 = local87;
				this.method3907();
				this.method5796();
			}
		} else if (this.aBoolean358) {
			if (this.anInt4500 < 0) {
				if (this.anInt4497 >= local76) {
					return;
				}
				this.anInt4497 = local76 + local76 - this.anInt4497 - 1;
				this.anInt4500 = -this.anInt4500;
			}
			while (this.anInt4497 >= local81) {
				this.anInt4497 = local81 + local81 - this.anInt4497 - 1;
				this.anInt4500 = -this.anInt4500;
				if (this.anInt4497 >= local76) {
					return;
				}
				this.anInt4497 = local76 + local76 - this.anInt4497 - 1;
				this.anInt4500 = -this.anInt4500;
			}
		} else if (this.anInt4500 < 0) {
			if (this.anInt4497 < local76) {
				this.anInt4497 = local81 - (local81 - 1 - this.anInt4497) % local91 - 1;
			}
		} else if (this.anInt4497 >= local81) {
			this.anInt4497 = local76 + (this.anInt4497 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!od", name = "k", descriptor = "()I")
	public synchronized int method3917() {
		return this.anInt4490 < 0 ? -1 : this.anInt4490;
	}

	@OriginalMember(owner = "client!od", name = "i", descriptor = "(I)V")
	public synchronized void method3919(@OriginalArg(0) int arg0) {
		this.anInt4499 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "l", descriptor = "()V")
	private void method3920() {
		this.anInt4494 = this.anInt4498;
		this.anInt4489 = Static366.method3895(this.anInt4498, this.anInt4490);
		this.anInt4495 = Static366.method3924(this.anInt4498, this.anInt4490);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()Lclient!pl;")
	@Override
	public Class1_Sub31 method5513() {
		return null;
	}
}
