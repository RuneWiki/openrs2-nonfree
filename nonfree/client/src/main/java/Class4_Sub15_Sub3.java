import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class4_Sub15_Sub3 extends Class4_Sub15 {

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
	public int anInt5705;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	public int anInt5708;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
	private int anInt5709;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
	public int anInt5710;

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
	private int anInt5712;

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
	public int anInt5715;

	@OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
	public int anInt5717;

	@OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
	public int anInt5718;

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
	private final int anInt5706;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "I")
	private final int anInt5713;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "Z")
	private final boolean aBoolean516;

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
	private int anInt5716;

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
	private int anInt5714;

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
	private int anInt5711;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	public int anInt5707;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!js;II)V")
	public Class4_Sub15_Sub3(@OriginalArg(0) Class4_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub4_5 = arg0;
		this.anInt5706 = arg0.anInt3726;
		this.anInt5713 = arg0.anInt3725;
		this.aBoolean516 = arg0.aBoolean346;
		this.anInt5716 = arg1;
		this.anInt5714 = arg2;
		this.anInt5711 = 8192;
		this.anInt5707 = 0;
		this.method4472();
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!js;III)V")
	public Class4_Sub15_Sub3(@OriginalArg(0) Class4_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub4_5 = arg0;
		this.anInt5706 = arg0.anInt3726;
		this.anInt5713 = arg0.anInt3725;
		this.aBoolean516 = arg0.aBoolean346;
		this.anInt5716 = arg1;
		this.anInt5714 = arg2;
		this.anInt5711 = arg3;
		this.anInt5707 = 0;
		this.method4472();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([IIIII)I")
	private int method4452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5712 <= 0) {
				if (this.anInt5716 == -256 && (this.anInt5707 & 0xFF) == 0) {
					if (Static422.aBoolean649) {
						return Static462.method4453(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5717, this.anInt5718, arg3, arg2, this);
					}
					return Static462.method4457(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5708, arg3, arg2, this);
				}
				if (Static422.aBoolean649) {
					return Static462.method4468(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5717, this.anInt5718, arg3, arg2, this, this.anInt5716, arg4);
				}
				return Static462.method4465(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5708, arg3, arg2, this, this.anInt5716, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5712;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5712 += arg1;
			if (this.anInt5716 == -256 && (this.anInt5707 & 0xFF) == 0) {
				if (Static422.aBoolean649) {
					arg1 = Static462.method4491(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5717, this.anInt5718, this.anInt5710, this.anInt5705, local5, arg2, this);
				} else {
					arg1 = Static462.method4456(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5708, this.anInt5715, local5, arg2, this);
				}
			} else if (Static422.aBoolean649) {
				arg1 = Static462.method4470(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5717, this.anInt5718, this.anInt5710, this.anInt5705, local5, arg2, this, this.anInt5716, arg4);
			} else {
				arg1 = Static462.method4460(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5708, this.anInt5715, local5, arg2, this, this.anInt5716, arg4);
			}
			this.anInt5712 -= arg1;
			if (this.anInt5712 != 0) {
				return arg1;
			}
		} while (!this.method4459());
		return arg3;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4861(@OriginalArg(0) int arg0) {
		if (this.anInt5712 > 0) {
			if (arg0 >= this.anInt5712) {
				if (this.anInt5714 == Integer.MIN_VALUE) {
					this.anInt5714 = 0;
					this.anInt5708 = this.anInt5717 = this.anInt5718 = 0;
					this.method5684();
					arg0 = this.anInt5712;
				}
				this.anInt5712 = 0;
				this.method4472();
			} else {
				this.anInt5708 += this.anInt5715 * arg0;
				this.anInt5717 += this.anInt5710 * arg0;
				this.anInt5718 += this.anInt5705 * arg0;
				this.anInt5712 -= arg0;
			}
		}
		@Pc(71) Class4_Sub4_Sub1 local71 = (Class4_Sub4_Sub1) super.aClass4_Sub4_5;
		@Pc(76) int local76 = this.anInt5706 << 8;
		@Pc(81) int local81 = this.anInt5713 << 8;
		@Pc(87) int local87 = local71.aByteArray48.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5709 = 0;
		}
		if (this.anInt5707 < 0) {
			if (this.anInt5716 <= 0) {
				this.method4466();
				this.method5684();
				return;
			}
			this.anInt5707 = 0;
		}
		if (this.anInt5707 >= local87) {
			if (this.anInt5716 >= 0) {
				this.method4466();
				this.method5684();
				return;
			}
			this.anInt5707 = local87 - 1;
		}
		this.anInt5707 += this.anInt5716 * arg0;
		if (this.anInt5709 >= 0) {
			if (this.anInt5709 > 0) {
				if (this.aBoolean516) {
					label125: {
						if (this.anInt5716 < 0) {
							if (this.anInt5707 >= local76) {
								return;
							}
							this.anInt5707 = local76 + local76 - this.anInt5707 - 1;
							this.anInt5716 = -this.anInt5716;
							if (--this.anInt5709 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5707 < local81) {
								return;
							}
							this.anInt5707 = local81 + local81 - this.anInt5707 - 1;
							this.anInt5716 = -this.anInt5716;
							if (--this.anInt5709 == 0) {
								break;
							}
							if (this.anInt5707 >= local76) {
								return;
							}
							this.anInt5707 = local76 + local76 - this.anInt5707 - 1;
							this.anInt5716 = -this.anInt5716;
						} while (--this.anInt5709 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5716 < 0) {
						if (this.anInt5707 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5707 - 1) / local91;
						if (local361 < this.anInt5709) {
							this.anInt5707 += local91 * local361;
							this.anInt5709 -= local361;
							return;
						}
						this.anInt5707 += local91 * this.anInt5709;
						this.anInt5709 = 0;
					} else if (this.anInt5707 >= local81) {
						local361 = (this.anInt5707 - local76) / local91;
						if (local361 < this.anInt5709) {
							this.anInt5707 -= local91 * local361;
							this.anInt5709 -= local361;
							return;
						}
						this.anInt5707 -= local91 * this.anInt5709;
						this.anInt5709 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5716 < 0) {
				if (this.anInt5707 < 0) {
					this.anInt5707 = -1;
					this.method4466();
					this.method5684();
					return;
				}
			} else if (this.anInt5707 >= local87) {
				this.anInt5707 = local87;
				this.method4466();
				this.method5684();
			}
		} else if (this.aBoolean516) {
			if (this.anInt5716 < 0) {
				if (this.anInt5707 >= local76) {
					return;
				}
				this.anInt5707 = local76 + local76 - this.anInt5707 - 1;
				this.anInt5716 = -this.anInt5716;
			}
			while (this.anInt5707 >= local81) {
				this.anInt5707 = local81 + local81 - this.anInt5707 - 1;
				this.anInt5716 = -this.anInt5716;
				if (this.anInt5707 >= local76) {
					return;
				}
				this.anInt5707 = local76 + local76 - this.anInt5707 - 1;
				this.anInt5716 = -this.anInt5716;
			}
		} else if (this.anInt5716 < 0) {
			if (this.anInt5707 < local76) {
				this.anInt5707 = local81 - (local81 - 1 - this.anInt5707) % local91 - 1;
			}
		} else if (this.anInt5707 >= local81) {
			this.anInt5707 = local76 + (this.anInt5707 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
	public synchronized void method4454() {
		this.anInt5716 = (this.anInt5716 ^ this.anInt5716 >> 31) + (this.anInt5716 >>> 31);
		this.anInt5716 = -this.anInt5716;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "()I")
	@Override
	public int method4859() {
		return this.anInt5714 == 0 && this.anInt5712 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "()Z")
	private boolean method4459() {
		@Pc(2) int local2 = this.anInt5714;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static462.method4458(local2, this.anInt5711);
			local8 = Static462.method4485(local2, this.anInt5711);
		}
		if (this.anInt5708 != local2 || this.anInt5717 != local10 || this.anInt5718 != local8) {
			if (this.anInt5708 < local2) {
				this.anInt5715 = 1;
				this.anInt5712 = local2 - this.anInt5708;
			} else if (this.anInt5708 > local2) {
				this.anInt5715 = -1;
				this.anInt5712 = this.anInt5708 - local2;
			} else {
				this.anInt5715 = 0;
			}
			if (this.anInt5717 < local10) {
				this.anInt5710 = 1;
				if (this.anInt5712 == 0 || this.anInt5712 > local10 - this.anInt5717) {
					this.anInt5712 = local10 - this.anInt5717;
				}
			} else if (this.anInt5717 > local10) {
				this.anInt5710 = -1;
				if (this.anInt5712 == 0 || this.anInt5712 > this.anInt5717 - local10) {
					this.anInt5712 = this.anInt5717 - local10;
				}
			} else {
				this.anInt5710 = 0;
			}
			if (this.anInt5718 < local8) {
				this.anInt5705 = 1;
				if (this.anInt5712 == 0 || this.anInt5712 > local8 - this.anInt5718) {
					this.anInt5712 = local8 - this.anInt5718;
				}
			} else if (this.anInt5718 > local8) {
				this.anInt5705 = -1;
				if (this.anInt5712 == 0 || this.anInt5712 > this.anInt5718 - local8) {
					this.anInt5712 = this.anInt5718 - local8;
				}
			} else {
				this.anInt5705 = 0;
			}
			return false;
		} else if (this.anInt5714 == Integer.MIN_VALUE) {
			this.anInt5714 = 0;
			this.anInt5708 = this.anInt5717 = this.anInt5718 = 0;
			this.method5684();
			return true;
		} else {
			this.method4472();
			return false;
		}
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
	public synchronized void method4461(@OriginalArg(0) int arg0) {
		this.anInt5709 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4855(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5714 == 0 && this.anInt5712 == 0) {
			this.method4861(arg2);
			return;
		}
		@Pc(13) Class4_Sub4_Sub1 local13 = (Class4_Sub4_Sub1) super.aClass4_Sub4_5;
		@Pc(18) int local18 = this.anInt5706 << 8;
		@Pc(23) int local23 = this.anInt5713 << 8;
		@Pc(29) int local29 = local13.aByteArray48.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5709 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5707 < 0) {
			if (this.anInt5716 <= 0) {
				this.method4466();
				this.method5684();
				return;
			}
			this.anInt5707 = 0;
		}
		if (this.anInt5707 >= local29) {
			if (this.anInt5716 >= 0) {
				this.method4466();
				this.method5684();
				return;
			}
			this.anInt5707 = local29 - 1;
		}
		if (this.anInt5709 >= 0) {
			if (this.anInt5709 > 0) {
				if (this.aBoolean516) {
					label130: {
						if (this.anInt5716 < 0) {
							local40 = this.method4452(arg0, arg1, local18, local44, local13.aByteArray48[this.anInt5706]);
							if (this.anInt5707 >= local18) {
								return;
							}
							this.anInt5707 = local18 + local18 - this.anInt5707 - 1;
							this.anInt5716 = -this.anInt5716;
							if (--this.anInt5709 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4479(arg0, local40, local23, local44, local13.aByteArray48[this.anInt5713 - 1]);
							if (this.anInt5707 < local23) {
								return;
							}
							this.anInt5707 = local23 + local23 - this.anInt5707 - 1;
							this.anInt5716 = -this.anInt5716;
							if (--this.anInt5709 == 0) {
								break;
							}
							local40 = this.method4452(arg0, local40, local18, local44, local13.aByteArray48[this.anInt5706]);
							if (this.anInt5707 >= local18) {
								return;
							}
							this.anInt5707 = local18 + local18 - this.anInt5707 - 1;
							this.anInt5716 = -this.anInt5716;
						} while (--this.anInt5709 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5716 < 0) {
						while (true) {
							local40 = this.method4452(arg0, local40, local18, local44, local13.aByteArray48[this.anInt5713 - 1]);
							if (this.anInt5707 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5707 - 1) / local33;
							if (local416 >= this.anInt5709) {
								this.anInt5707 += local33 * this.anInt5709;
								this.anInt5709 = 0;
								break;
							}
							this.anInt5707 += local33 * local416;
							this.anInt5709 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4479(arg0, local40, local23, local44, local13.aByteArray48[this.anInt5706]);
							if (this.anInt5707 < local23) {
								return;
							}
							local416 = (this.anInt5707 - local18) / local33;
							if (local416 >= this.anInt5709) {
								this.anInt5707 -= local33 * this.anInt5709;
								this.anInt5709 = 0;
								break;
							}
							this.anInt5707 -= local33 * local416;
							this.anInt5709 -= local416;
						}
					}
				}
			}
			if (this.anInt5716 < 0) {
				this.method4452(arg0, local40, 0, local44, 0);
				if (this.anInt5707 < 0) {
					this.anInt5707 = -1;
					this.method4466();
					this.method5684();
					return;
				}
			} else {
				this.method4479(arg0, local40, local29, local44, 0);
				if (this.anInt5707 >= local29) {
					this.anInt5707 = local29;
					this.method4466();
					this.method5684();
				}
			}
		} else if (this.aBoolean516) {
			if (this.anInt5716 < 0) {
				local40 = this.method4452(arg0, arg1, local18, local44, local13.aByteArray48[this.anInt5706]);
				if (this.anInt5707 >= local18) {
					return;
				}
				this.anInt5707 = local18 + local18 - this.anInt5707 - 1;
				this.anInt5716 = -this.anInt5716;
			}
			while (true) {
				local40 = this.method4479(arg0, local40, local23, local44, local13.aByteArray48[this.anInt5713 - 1]);
				if (this.anInt5707 < local23) {
					return;
				}
				this.anInt5707 = local23 + local23 - this.anInt5707 - 1;
				this.anInt5716 = -this.anInt5716;
				local40 = this.method4452(arg0, local40, local18, local44, local13.aByteArray48[this.anInt5706]);
				if (this.anInt5707 >= local18) {
					return;
				}
				this.anInt5707 = local18 + local18 - this.anInt5707 - 1;
				this.anInt5716 = -this.anInt5716;
			}
		} else if (this.anInt5716 < 0) {
			while (true) {
				local40 = this.method4452(arg0, local40, local18, local44, local13.aByteArray48[this.anInt5713 - 1]);
				if (this.anInt5707 >= local18) {
					return;
				}
				this.anInt5707 = local23 - (local23 - 1 - this.anInt5707) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4479(arg0, local40, local23, local44, local13.aByteArray48[this.anInt5706]);
				if (this.anInt5707 < local23) {
					return;
				}
				this.anInt5707 = local18 + (this.anInt5707 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "()Z")
	public boolean method4462() {
		return this.anInt5707 < 0 || this.anInt5707 >= ((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48.length << 8;
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "()Lclient!ti;")
	@Override
	public Class4_Sub15 method4860() {
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "()I")
	@Override
	public int method4856() {
		@Pc(6) int local6 = this.anInt5708 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5709 == 0) {
			local6 -= local6 * this.anInt5707 / (((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48.length << 8);
		} else if (this.anInt5709 >= 0) {
			local6 -= local6 * this.anInt5706 / ((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "()V")
	private void method4466() {
		if (this.anInt5712 == 0) {
			return;
		}
		if (this.anInt5714 == Integer.MIN_VALUE) {
			this.anInt5714 = 0;
		}
		this.anInt5712 = 0;
		this.method4472();
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
	public synchronized void method4467(@OriginalArg(0) int arg0) {
		if (this.anInt5716 < 0) {
			this.anInt5716 = -arg0;
		} else {
			this.anInt5716 = arg0;
		}
	}

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "()I")
	public synchronized int method4469() {
		return this.anInt5714 == Integer.MIN_VALUE ? 0 : this.anInt5714;
	}

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "()V")
	private void method4472() {
		this.anInt5708 = this.anInt5714;
		this.anInt5717 = Static462.method4458(this.anInt5714, this.anInt5711);
		this.anInt5718 = Static462.method4485(this.anInt5714, this.anInt5711);
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
	public synchronized void method4473(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5707 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "()I")
	public synchronized int method4474() {
		return this.anInt5711 < 0 ? -1 : this.anInt5711;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(II)V")
	private synchronized void method4475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5714 = arg0;
		this.anInt5711 = arg1;
		this.anInt5712 = 0;
		this.method4472();
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)V")
	public synchronized void method4478(@OriginalArg(0) int arg0) {
		this.method4475(arg0 << 6, this.method4474());
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "([IIIII)I")
	private int method4479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5712 <= 0) {
				if (this.anInt5716 == 256 && (this.anInt5707 & 0xFF) == 0) {
					if (Static422.aBoolean649) {
						return Static462.method4463(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5717, this.anInt5718, arg3, arg2, this);
					}
					return Static462.method4476(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5708, arg3, arg2, this);
				}
				if (Static422.aBoolean649) {
					return Static462.method4455(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5717, this.anInt5718, arg3, arg2, this, this.anInt5716, arg4);
				}
				return Static462.method4477(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5708, arg3, arg2, this, this.anInt5716, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5712;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5712 += arg1;
			if (this.anInt5716 == 256 && (this.anInt5707 & 0xFF) == 0) {
				if (Static422.aBoolean649) {
					arg1 = Static462.method4464(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5717, this.anInt5718, this.anInt5710, this.anInt5705, local5, arg2, this);
				} else {
					arg1 = Static462.method4483(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5708, this.anInt5715, local5, arg2, this);
				}
			} else if (Static422.aBoolean649) {
				arg1 = Static462.method4471(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5717, this.anInt5718, this.anInt5710, this.anInt5705, local5, arg2, this, this.anInt5716, arg4);
			} else {
				arg1 = Static462.method4482(((Class4_Sub4_Sub1) super.aClass4_Sub4_5).aByteArray48, arg0, this.anInt5707, arg1, this.anInt5708, this.anInt5715, local5, arg2, this, this.anInt5716, arg4);
			}
			this.anInt5712 -= arg1;
			if (this.anInt5712 != 0) {
				return arg1;
			}
		} while (!this.method4459());
		return arg3;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	public synchronized void method4480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4475(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static462.method4458(arg1, arg2);
		@Pc(14) int local14 = Static462.method4485(arg1, arg2);
		if (this.anInt5717 == local10 && this.anInt5718 == local14) {
			this.anInt5712 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5708;
		if (this.anInt5708 - arg1 > local31) {
			local31 = this.anInt5708 - arg1;
		}
		if (local10 - this.anInt5717 > local31) {
			local31 = local10 - this.anInt5717;
		}
		if (this.anInt5717 - local10 > local31) {
			local31 = this.anInt5717 - local10;
		}
		if (local14 - this.anInt5718 > local31) {
			local31 = local14 - this.anInt5718;
		}
		if (this.anInt5718 - local14 > local31) {
			local31 = this.anInt5718 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5712 = arg0;
		this.anInt5714 = arg1;
		this.anInt5711 = arg2;
		this.anInt5715 = (arg1 - this.anInt5708) / arg0;
		this.anInt5710 = (local10 - this.anInt5717) / arg0;
		this.anInt5705 = (local14 - this.anInt5718) / arg0;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(II)V")
	public synchronized void method4481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4480(arg0, arg1, this.method4474());
	}

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "()I")
	public synchronized int method4484() {
		return this.anInt5716 < 0 ? -this.anInt5716 : this.anInt5716;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "()Lclient!ti;")
	@Override
	public Class4_Sub15 method4857() {
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "()Z")
	public boolean method4487() {
		return this.anInt5712 != 0;
	}

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)V")
	private synchronized void method4488() {
		this.method4475(0, this.method4474());
	}

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "(I)V")
	public synchronized void method4490(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4488();
			this.method5684();
		} else if (this.anInt5717 == 0 && this.anInt5718 == 0) {
			this.anInt5712 = 0;
			this.anInt5714 = 0;
			this.anInt5708 = 0;
			this.method5684();
		} else {
			@Pc(31) int local31 = -this.anInt5708;
			if (this.anInt5708 > local31) {
				local31 = this.anInt5708;
			}
			if (-this.anInt5717 > local31) {
				local31 = -this.anInt5717;
			}
			if (this.anInt5717 > local31) {
				local31 = this.anInt5717;
			}
			if (-this.anInt5718 > local31) {
				local31 = -this.anInt5718;
			}
			if (this.anInt5718 > local31) {
				local31 = this.anInt5718;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5712 = arg0;
			this.anInt5714 = Integer.MIN_VALUE;
			this.anInt5715 = -this.anInt5708 / arg0;
			this.anInt5710 = -this.anInt5717 / arg0;
			this.anInt5705 = -this.anInt5718 / arg0;
		}
	}
}
