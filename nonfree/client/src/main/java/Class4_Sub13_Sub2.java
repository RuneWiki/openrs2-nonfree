import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class4_Sub13_Sub2 extends Class4_Sub13 {

	@OriginalMember(owner = "client!in", name = "m", descriptor = "I")
	public int anInt4625;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "I")
	public int anInt4627;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	public int anInt4630;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "I")
	public int anInt4631;

	@OriginalMember(owner = "client!in", name = "t", descriptor = "I")
	public int anInt4632;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "I")
	private int anInt4633;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "I")
	private int anInt4635;

	@OriginalMember(owner = "client!in", name = "x", descriptor = "I")
	public int anInt4636;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "I")
	private final int anInt4634;

	@OriginalMember(owner = "client!in", name = "z", descriptor = "I")
	private final int anInt4637;

	@OriginalMember(owner = "client!in", name = "y", descriptor = "Z")
	private final boolean aBoolean349;

	@OriginalMember(owner = "client!in", name = "A", descriptor = "I")
	private int anInt4638;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "I")
	private int anInt4629;

	@OriginalMember(owner = "client!in", name = "n", descriptor = "I")
	private int anInt4626;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	public int anInt4628;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!fc;II)V")
	public Class4_Sub13_Sub2(@OriginalArg(0) Class4_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub16_5 = arg0;
		this.anInt4634 = arg0.anInt3114;
		this.anInt4637 = arg0.anInt3116;
		this.aBoolean349 = arg0.aBoolean247;
		this.anInt4638 = arg1;
		this.anInt4629 = arg2;
		this.anInt4626 = 8192;
		this.anInt4628 = 0;
		this.method3941();
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!fc;III)V")
	public Class4_Sub13_Sub2(@OriginalArg(0) Class4_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub16_5 = arg0;
		this.anInt4634 = arg0.anInt3114;
		this.anInt4637 = arg0.anInt3116;
		this.aBoolean349 = arg0.aBoolean247;
		this.anInt4638 = arg1;
		this.anInt4629 = arg2;
		this.anInt4626 = arg3;
		this.anInt4628 = 0;
		this.method3941();
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
	public synchronized void method3903(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4628 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
	private synchronized void method3906() {
		this.method3932(0, this.method3925());
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V")
	public synchronized void method3907() {
		this.anInt4638 = (this.anInt4638 ^ this.anInt4638 >> 31) + (this.anInt4638 >>> 31);
		this.anInt4638 = -this.anInt4638;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "([IIIII)I")
	private int method3908(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4635 <= 0) {
				if (this.anInt4638 == -256 && (this.anInt4628 & 0xFF) == 0) {
					if (Static558.aBoolean667) {
						return Static604.method3940(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4632, this.anInt4627, arg3, arg2, this);
					}
					return Static604.method3923(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4630, arg3, arg2, this);
				}
				if (Static558.aBoolean667) {
					return Static604.method3938(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4632, this.anInt4627, arg3, arg2, this, this.anInt4638, arg4);
				}
				return Static604.method3927(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4630, arg3, arg2, this, this.anInt4638, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4635;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4635 += arg1;
			if (this.anInt4638 == -256 && (this.anInt4628 & 0xFF) == 0) {
				if (Static558.aBoolean667) {
					arg1 = Static604.method3920(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4632, this.anInt4627, this.anInt4631, this.anInt4625, local5, arg2, this);
				} else {
					arg1 = Static604.method3926(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4630, this.anInt4636, local5, arg2, this);
				}
			} else if (Static558.aBoolean667) {
				arg1 = Static604.method3933(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4632, this.anInt4627, this.anInt4631, this.anInt4625, local5, arg2, this, this.anInt4638, arg4);
			} else {
				arg1 = Static604.method3936(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4630, this.anInt4636, local5, arg2, this, this.anInt4638, arg4);
			}
			this.anInt4635 -= arg1;
			if (this.anInt4635 != 0) {
				return arg1;
			}
		} while (!this.method3934());
		return arg3;
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "()Z")
	public boolean method3909() {
		return this.anInt4635 != 0;
	}

	@OriginalMember(owner = "client!in", name = "f", descriptor = "()V")
	private void method3910() {
		if (this.anInt4635 == 0) {
			return;
		}
		if (this.anInt4629 == Integer.MIN_VALUE) {
			this.anInt4629 = 0;
		}
		this.anInt4635 = 0;
		this.method3941();
	}

	@OriginalMember(owner = "client!in", name = "f", descriptor = "(I)V")
	public synchronized void method3911(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3906();
			this.method8013();
		} else if (this.anInt4632 == 0 && this.anInt4627 == 0) {
			this.anInt4635 = 0;
			this.anInt4629 = 0;
			this.anInt4630 = 0;
			this.method8013();
		} else {
			@Pc(31) int local31 = -this.anInt4630;
			if (this.anInt4630 > local31) {
				local31 = this.anInt4630;
			}
			if (-this.anInt4632 > local31) {
				local31 = -this.anInt4632;
			}
			if (this.anInt4632 > local31) {
				local31 = this.anInt4632;
			}
			if (-this.anInt4627 > local31) {
				local31 = -this.anInt4627;
			}
			if (this.anInt4627 > local31) {
				local31 = this.anInt4627;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4635 = arg0;
			this.anInt4629 = Integer.MIN_VALUE;
			this.anInt4636 = -this.anInt4630 / arg0;
			this.anInt4631 = -this.anInt4632 / arg0;
			this.anInt4625 = -this.anInt4627 / arg0;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "([IIIII)I")
	private int method3912(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4635 <= 0) {
				if (this.anInt4638 == 256 && (this.anInt4628 & 0xFF) == 0) {
					if (Static558.aBoolean667) {
						return Static604.method3916(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4632, this.anInt4627, arg3, arg2, this);
					}
					return Static604.method3939(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4630, arg3, arg2, this);
				}
				if (Static558.aBoolean667) {
					return Static604.method3924(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4632, this.anInt4627, arg3, arg2, this, this.anInt4638, arg4);
				}
				return Static604.method3917(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4630, arg3, arg2, this, this.anInt4638, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4635;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4635 += arg1;
			if (this.anInt4638 == 256 && (this.anInt4628 & 0xFF) == 0) {
				if (Static558.aBoolean667) {
					arg1 = Static604.method3922(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4632, this.anInt4627, this.anInt4631, this.anInt4625, local5, arg2, this);
				} else {
					arg1 = Static604.method3937(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4630, this.anInt4636, local5, arg2, this);
				}
			} else if (Static558.aBoolean667) {
				arg1 = Static604.method3902(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4632, this.anInt4627, this.anInt4631, this.anInt4625, local5, arg2, this, this.anInt4638, arg4);
			} else {
				arg1 = Static604.method3904(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37, arg0, this.anInt4628, arg1, this.anInt4630, this.anInt4636, local5, arg2, this, this.anInt4638, arg4);
			}
			this.anInt4635 -= arg1;
			if (this.anInt4635 != 0) {
				return arg1;
			}
		} while (!this.method3934());
		return arg3;
	}

	@OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V")
	public synchronized void method3913(@OriginalArg(0) int arg0) {
		if (this.anInt4638 < 0) {
			this.anInt4638 = -arg0;
		} else {
			this.anInt4638 = arg0;
		}
	}

	@OriginalMember(owner = "client!in", name = "h", descriptor = "(I)V")
	public synchronized void method3914(@OriginalArg(0) int arg0) {
		this.anInt4633 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "g", descriptor = "()Z")
	public boolean method3915() {
		return this.anInt4628 < 0 || this.anInt4628 >= ((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37.length << 8;
	}

	@OriginalMember(owner = "client!in", name = "i", descriptor = "(I)V")
	public synchronized void method3919(@OriginalArg(0) int arg0) {
		this.method3932(arg0 << 6, this.method3925());
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "()Lclient!sda;")
	@Override
	public Class4_Sub13 method6220() {
		return null;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6221(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4629 == 0 && this.anInt4635 == 0) {
			this.method6215(arg2);
			return;
		}
		@Pc(13) Class4_Sub16_Sub1 local13 = (Class4_Sub16_Sub1) super.aClass4_Sub16_5;
		@Pc(18) int local18 = this.anInt4634 << 8;
		@Pc(23) int local23 = this.anInt4637 << 8;
		@Pc(29) int local29 = local13.aByteArray37.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4633 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4628 < 0) {
			if (this.anInt4638 <= 0) {
				this.method3910();
				this.method8013();
				return;
			}
			this.anInt4628 = 0;
		}
		if (this.anInt4628 >= local29) {
			if (this.anInt4638 >= 0) {
				this.method3910();
				this.method8013();
				return;
			}
			this.anInt4628 = local29 - 1;
		}
		if (this.anInt4633 >= 0) {
			if (this.anInt4633 > 0) {
				if (this.aBoolean349) {
					label130: {
						if (this.anInt4638 < 0) {
							local40 = this.method3908(arg0, arg1, local18, local44, local13.aByteArray37[this.anInt4634]);
							if (this.anInt4628 >= local18) {
								return;
							}
							this.anInt4628 = local18 + local18 - this.anInt4628 - 1;
							this.anInt4638 = -this.anInt4638;
							if (--this.anInt4633 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3912(arg0, local40, local23, local44, local13.aByteArray37[this.anInt4637 - 1]);
							if (this.anInt4628 < local23) {
								return;
							}
							this.anInt4628 = local23 + local23 - this.anInt4628 - 1;
							this.anInt4638 = -this.anInt4638;
							if (--this.anInt4633 == 0) {
								break;
							}
							local40 = this.method3908(arg0, local40, local18, local44, local13.aByteArray37[this.anInt4634]);
							if (this.anInt4628 >= local18) {
								return;
							}
							this.anInt4628 = local18 + local18 - this.anInt4628 - 1;
							this.anInt4638 = -this.anInt4638;
						} while (--this.anInt4633 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4638 < 0) {
						while (true) {
							local40 = this.method3908(arg0, local40, local18, local44, local13.aByteArray37[this.anInt4637 - 1]);
							if (this.anInt4628 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4628 - 1) / local33;
							if (local416 >= this.anInt4633) {
								this.anInt4628 += local33 * this.anInt4633;
								this.anInt4633 = 0;
								break;
							}
							this.anInt4628 += local33 * local416;
							this.anInt4633 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3912(arg0, local40, local23, local44, local13.aByteArray37[this.anInt4634]);
							if (this.anInt4628 < local23) {
								return;
							}
							local416 = (this.anInt4628 - local18) / local33;
							if (local416 >= this.anInt4633) {
								this.anInt4628 -= local33 * this.anInt4633;
								this.anInt4633 = 0;
								break;
							}
							this.anInt4628 -= local33 * local416;
							this.anInt4633 -= local416;
						}
					}
				}
			}
			if (this.anInt4638 < 0) {
				this.method3908(arg0, local40, 0, local44, 0);
				if (this.anInt4628 < 0) {
					this.anInt4628 = -1;
					this.method3910();
					this.method8013();
					return;
				}
			} else {
				this.method3912(arg0, local40, local29, local44, 0);
				if (this.anInt4628 >= local29) {
					this.anInt4628 = local29;
					this.method3910();
					this.method8013();
				}
			}
		} else if (this.aBoolean349) {
			if (this.anInt4638 < 0) {
				local40 = this.method3908(arg0, arg1, local18, local44, local13.aByteArray37[this.anInt4634]);
				if (this.anInt4628 >= local18) {
					return;
				}
				this.anInt4628 = local18 + local18 - this.anInt4628 - 1;
				this.anInt4638 = -this.anInt4638;
			}
			while (true) {
				local40 = this.method3912(arg0, local40, local23, local44, local13.aByteArray37[this.anInt4637 - 1]);
				if (this.anInt4628 < local23) {
					return;
				}
				this.anInt4628 = local23 + local23 - this.anInt4628 - 1;
				this.anInt4638 = -this.anInt4638;
				local40 = this.method3908(arg0, local40, local18, local44, local13.aByteArray37[this.anInt4634]);
				if (this.anInt4628 >= local18) {
					return;
				}
				this.anInt4628 = local18 + local18 - this.anInt4628 - 1;
				this.anInt4638 = -this.anInt4638;
			}
		} else if (this.anInt4638 < 0) {
			while (true) {
				local40 = this.method3908(arg0, local40, local18, local44, local13.aByteArray37[this.anInt4637 - 1]);
				if (this.anInt4628 >= local18) {
					return;
				}
				this.anInt4628 = local23 - (local23 - 1 - this.anInt4628) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3912(arg0, local40, local23, local44, local13.aByteArray37[this.anInt4634]);
				if (this.anInt4628 < local23) {
					return;
				}
				this.anInt4628 = local18 + (this.anInt4628 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "()I")
	@Override
	public int method6218() {
		@Pc(6) int local6 = this.anInt4630 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4633 == 0) {
			local6 -= local6 * this.anInt4628 / (((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37.length << 8);
		} else if (this.anInt4633 >= 0) {
			local6 -= local6 * this.anInt4634 / ((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray37.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!in", name = "h", descriptor = "()I")
	public synchronized int method3925() {
		return this.anInt4626 < 0 ? -1 : this.anInt4626;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
	public synchronized void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3931(arg0, arg1, this.method3925());
	}

	@OriginalMember(owner = "client!in", name = "i", descriptor = "()I")
	public synchronized int method3929() {
		return this.anInt4629 == Integer.MIN_VALUE ? 0 : this.anInt4629;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
	public synchronized void method3931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3932(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static604.method3930(arg1, arg2);
		@Pc(14) int local14 = Static604.method3918(arg1, arg2);
		if (this.anInt4632 == local10 && this.anInt4627 == local14) {
			this.anInt4635 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4630;
		if (this.anInt4630 - arg1 > local31) {
			local31 = this.anInt4630 - arg1;
		}
		if (local10 - this.anInt4632 > local31) {
			local31 = local10 - this.anInt4632;
		}
		if (this.anInt4632 - local10 > local31) {
			local31 = this.anInt4632 - local10;
		}
		if (local14 - this.anInt4627 > local31) {
			local31 = local14 - this.anInt4627;
		}
		if (this.anInt4627 - local14 > local31) {
			local31 = this.anInt4627 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4635 = arg0;
		this.anInt4629 = arg1;
		this.anInt4626 = arg2;
		this.anInt4636 = (arg1 - this.anInt4630) / arg0;
		this.anInt4631 = (local10 - this.anInt4632) / arg0;
		this.anInt4625 = (local14 - this.anInt4627) / arg0;
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(II)V")
	private synchronized void method3932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4629 = arg0;
		this.anInt4626 = arg1;
		this.anInt4635 = 0;
		this.method3941();
	}

	@OriginalMember(owner = "client!in", name = "j", descriptor = "()Z")
	private boolean method3934() {
		@Pc(2) int local2 = this.anInt4629;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static604.method3930(local2, this.anInt4626);
			local8 = Static604.method3918(local2, this.anInt4626);
		}
		if (this.anInt4630 != local2 || this.anInt4632 != local10 || this.anInt4627 != local8) {
			if (this.anInt4630 < local2) {
				this.anInt4636 = 1;
				this.anInt4635 = local2 - this.anInt4630;
			} else if (this.anInt4630 > local2) {
				this.anInt4636 = -1;
				this.anInt4635 = this.anInt4630 - local2;
			} else {
				this.anInt4636 = 0;
			}
			if (this.anInt4632 < local10) {
				this.anInt4631 = 1;
				if (this.anInt4635 == 0 || this.anInt4635 > local10 - this.anInt4632) {
					this.anInt4635 = local10 - this.anInt4632;
				}
			} else if (this.anInt4632 > local10) {
				this.anInt4631 = -1;
				if (this.anInt4635 == 0 || this.anInt4635 > this.anInt4632 - local10) {
					this.anInt4635 = this.anInt4632 - local10;
				}
			} else {
				this.anInt4631 = 0;
			}
			if (this.anInt4627 < local8) {
				this.anInt4625 = 1;
				if (this.anInt4635 == 0 || this.anInt4635 > local8 - this.anInt4627) {
					this.anInt4635 = local8 - this.anInt4627;
				}
			} else if (this.anInt4627 > local8) {
				this.anInt4625 = -1;
				if (this.anInt4635 == 0 || this.anInt4635 > this.anInt4627 - local8) {
					this.anInt4635 = this.anInt4627 - local8;
				}
			} else {
				this.anInt4625 = 0;
			}
			return false;
		} else if (this.anInt4629 == Integer.MIN_VALUE) {
			this.anInt4629 = 0;
			this.anInt4630 = this.anInt4632 = this.anInt4627 = 0;
			this.method8013();
			return true;
		} else {
			this.method3941();
			return false;
		}
	}

	@OriginalMember(owner = "client!in", name = "k", descriptor = "()I")
	public synchronized int method3935() {
		return this.anInt4638 < 0 ? -this.anInt4638 : this.anInt4638;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6215(@OriginalArg(0) int arg0) {
		if (this.anInt4635 > 0) {
			if (arg0 >= this.anInt4635) {
				if (this.anInt4629 == Integer.MIN_VALUE) {
					this.anInt4629 = 0;
					this.anInt4630 = this.anInt4632 = this.anInt4627 = 0;
					this.method8013();
					arg0 = this.anInt4635;
				}
				this.anInt4635 = 0;
				this.method3941();
			} else {
				this.anInt4630 += this.anInt4636 * arg0;
				this.anInt4632 += this.anInt4631 * arg0;
				this.anInt4627 += this.anInt4625 * arg0;
				this.anInt4635 -= arg0;
			}
		}
		@Pc(71) Class4_Sub16_Sub1 local71 = (Class4_Sub16_Sub1) super.aClass4_Sub16_5;
		@Pc(76) int local76 = this.anInt4634 << 8;
		@Pc(81) int local81 = this.anInt4637 << 8;
		@Pc(87) int local87 = local71.aByteArray37.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4633 = 0;
		}
		if (this.anInt4628 < 0) {
			if (this.anInt4638 <= 0) {
				this.method3910();
				this.method8013();
				return;
			}
			this.anInt4628 = 0;
		}
		if (this.anInt4628 >= local87) {
			if (this.anInt4638 >= 0) {
				this.method3910();
				this.method8013();
				return;
			}
			this.anInt4628 = local87 - 1;
		}
		this.anInt4628 += this.anInt4638 * arg0;
		if (this.anInt4633 >= 0) {
			if (this.anInt4633 > 0) {
				if (this.aBoolean349) {
					label125: {
						if (this.anInt4638 < 0) {
							if (this.anInt4628 >= local76) {
								return;
							}
							this.anInt4628 = local76 + local76 - this.anInt4628 - 1;
							this.anInt4638 = -this.anInt4638;
							if (--this.anInt4633 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4628 < local81) {
								return;
							}
							this.anInt4628 = local81 + local81 - this.anInt4628 - 1;
							this.anInt4638 = -this.anInt4638;
							if (--this.anInt4633 == 0) {
								break;
							}
							if (this.anInt4628 >= local76) {
								return;
							}
							this.anInt4628 = local76 + local76 - this.anInt4628 - 1;
							this.anInt4638 = -this.anInt4638;
						} while (--this.anInt4633 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4638 < 0) {
						if (this.anInt4628 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4628 - 1) / local91;
						if (local361 < this.anInt4633) {
							this.anInt4628 += local91 * local361;
							this.anInt4633 -= local361;
							return;
						}
						this.anInt4628 += local91 * this.anInt4633;
						this.anInt4633 = 0;
					} else if (this.anInt4628 >= local81) {
						local361 = (this.anInt4628 - local76) / local91;
						if (local361 < this.anInt4633) {
							this.anInt4628 -= local91 * local361;
							this.anInt4633 -= local361;
							return;
						}
						this.anInt4628 -= local91 * this.anInt4633;
						this.anInt4633 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4638 < 0) {
				if (this.anInt4628 < 0) {
					this.anInt4628 = -1;
					this.method3910();
					this.method8013();
					return;
				}
			} else if (this.anInt4628 >= local87) {
				this.anInt4628 = local87;
				this.method3910();
				this.method8013();
			}
		} else if (this.aBoolean349) {
			if (this.anInt4638 < 0) {
				if (this.anInt4628 >= local76) {
					return;
				}
				this.anInt4628 = local76 + local76 - this.anInt4628 - 1;
				this.anInt4638 = -this.anInt4638;
			}
			while (this.anInt4628 >= local81) {
				this.anInt4628 = local81 + local81 - this.anInt4628 - 1;
				this.anInt4638 = -this.anInt4638;
				if (this.anInt4628 >= local76) {
					return;
				}
				this.anInt4628 = local76 + local76 - this.anInt4628 - 1;
				this.anInt4638 = -this.anInt4638;
			}
		} else if (this.anInt4638 < 0) {
			if (this.anInt4628 < local76) {
				this.anInt4628 = local81 - (local81 - 1 - this.anInt4628) % local91 - 1;
			}
		} else if (this.anInt4628 >= local81) {
			this.anInt4628 = local76 + (this.anInt4628 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "()Lclient!sda;")
	@Override
	public Class4_Sub13 method6216() {
		return null;
	}

	@OriginalMember(owner = "client!in", name = "l", descriptor = "()V")
	private void method3941() {
		this.anInt4630 = this.anInt4629;
		this.anInt4632 = Static604.method3930(this.anInt4629, this.anInt4626);
		this.anInt4627 = Static604.method3918(this.anInt4629, this.anInt4626);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "()I")
	@Override
	public int method6217() {
		return this.anInt4629 == 0 && this.anInt4635 == 0 ? 0 : 1;
	}
}
