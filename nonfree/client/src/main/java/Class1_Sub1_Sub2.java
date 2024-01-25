import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!np", name = "q", descriptor = "I")
	public int anInt4487;

	@OriginalMember(owner = "client!np", name = "r", descriptor = "I")
	private int anInt4488;

	@OriginalMember(owner = "client!np", name = "t", descriptor = "I")
	public int anInt4490;

	@OriginalMember(owner = "client!np", name = "u", descriptor = "I")
	public int anInt4491;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "I")
	private int anInt4492;

	@OriginalMember(owner = "client!np", name = "w", descriptor = "I")
	public int anInt4493;

	@OriginalMember(owner = "client!np", name = "y", descriptor = "I")
	public int anInt4495;

	@OriginalMember(owner = "client!np", name = "B", descriptor = "I")
	public int anInt4498;

	@OriginalMember(owner = "client!np", name = "x", descriptor = "I")
	private final int anInt4494;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "I")
	private final int anInt4489;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "Z")
	private final boolean aBoolean424;

	@OriginalMember(owner = "client!np", name = "z", descriptor = "I")
	private int anInt4496;

	@OriginalMember(owner = "client!np", name = "C", descriptor = "I")
	private int anInt4499;

	@OriginalMember(owner = "client!np", name = "A", descriptor = "I")
	private int anInt4497;

	@OriginalMember(owner = "client!np", name = "o", descriptor = "I")
	public int anInt4486;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!ve;II)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) Class1_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub15_5 = arg0;
		this.anInt4494 = arg0.anInt6346;
		this.anInt4489 = arg0.anInt6347;
		this.aBoolean424 = arg0.aBoolean619;
		this.anInt4496 = arg1;
		this.anInt4499 = arg2;
		this.anInt4497 = 8192;
		this.anInt4486 = 0;
		this.method4024();
	}

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!ve;III)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) Class1_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub15_5 = arg0;
		this.anInt4494 = arg0.anInt6346;
		this.anInt4489 = arg0.anInt6347;
		this.aBoolean424 = arg0.aBoolean619;
		this.anInt4496 = arg1;
		this.anInt4499 = arg2;
		this.anInt4497 = arg3;
		this.anInt4486 = 0;
		this.method4024();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([IIIII)I")
	private int method4020(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4488 <= 0) {
				if (this.anInt4496 == -256 && (this.anInt4486 & 0xFF) == 0) {
					if (Static330.aBoolean615) {
						return Static370.method4021(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4495, this.anInt4491, arg3, arg2, this);
					}
					return Static370.method4051(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4493, arg3, arg2, this);
				}
				if (Static330.aBoolean615) {
					return Static370.method4045(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4495, this.anInt4491, arg3, arg2, this, this.anInt4496, arg4);
				}
				return Static370.method4047(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4493, arg3, arg2, this, this.anInt4496, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4488;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4488 += arg1;
			if (this.anInt4496 == -256 && (this.anInt4486 & 0xFF) == 0) {
				if (Static330.aBoolean615) {
					arg1 = Static370.method4053(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4495, this.anInt4491, this.anInt4490, this.anInt4487, local5, arg2, this);
				} else {
					arg1 = Static370.method4033(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4493, this.anInt4498, local5, arg2, this);
				}
			} else if (Static330.aBoolean615) {
				arg1 = Static370.method4044(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4495, this.anInt4491, this.anInt4490, this.anInt4487, local5, arg2, this, this.anInt4496, arg4);
			} else {
				arg1 = Static370.method4038(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4493, this.anInt4498, local5, arg2, this, this.anInt4496, arg4);
			}
			this.anInt4488 -= arg1;
			if (this.anInt4488 != 0) {
				return arg1;
			}
		} while (!this.method4034());
		return arg3;
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public Class1_Sub1 method5033() {
		return null;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
	public synchronized void method4022(@OriginalArg(0) int arg0) {
		if (this.anInt4496 < 0) {
			this.anInt4496 = -arg0;
		} else {
			this.anInt4496 = arg0;
		}
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "()I")
	public synchronized int method4023() {
		return this.anInt4497 < 0 ? -1 : this.anInt4497;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "()Lclient!tf;")
	@Override
	public Class1_Sub1 method5029() {
		return null;
	}

	@OriginalMember(owner = "client!np", name = "f", descriptor = "()V")
	private void method4024() {
		this.anInt4493 = this.anInt4499;
		this.anInt4495 = Static370.method4036(this.anInt4499, this.anInt4497);
		this.anInt4491 = Static370.method4035(this.anInt4499, this.anInt4497);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5028(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4499 == 0 && this.anInt4488 == 0) {
			this.method5034(arg2);
			return;
		}
		@Pc(13) Class1_Sub15_Sub1 local13 = (Class1_Sub15_Sub1) super.aClass1_Sub15_5;
		@Pc(18) int local18 = this.anInt4494 << 8;
		@Pc(23) int local23 = this.anInt4489 << 8;
		@Pc(29) int local29 = local13.aByteArray92.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4492 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4486 < 0) {
			if (this.anInt4496 <= 0) {
				this.method4042();
				this.method5628();
				return;
			}
			this.anInt4486 = 0;
		}
		if (this.anInt4486 >= local29) {
			if (this.anInt4496 >= 0) {
				this.method4042();
				this.method5628();
				return;
			}
			this.anInt4486 = local29 - 1;
		}
		if (this.anInt4492 >= 0) {
			if (this.anInt4492 > 0) {
				if (this.aBoolean424) {
					label130: {
						if (this.anInt4496 < 0) {
							local40 = this.method4020(arg0, arg1, local18, local44, local13.aByteArray92[this.anInt4494]);
							if (this.anInt4486 >= local18) {
								return;
							}
							this.anInt4486 = local18 + local18 - this.anInt4486 - 1;
							this.anInt4496 = -this.anInt4496;
							if (--this.anInt4492 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4048(arg0, local40, local23, local44, local13.aByteArray92[this.anInt4489 - 1]);
							if (this.anInt4486 < local23) {
								return;
							}
							this.anInt4486 = local23 + local23 - this.anInt4486 - 1;
							this.anInt4496 = -this.anInt4496;
							if (--this.anInt4492 == 0) {
								break;
							}
							local40 = this.method4020(arg0, local40, local18, local44, local13.aByteArray92[this.anInt4494]);
							if (this.anInt4486 >= local18) {
								return;
							}
							this.anInt4486 = local18 + local18 - this.anInt4486 - 1;
							this.anInt4496 = -this.anInt4496;
						} while (--this.anInt4492 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4496 < 0) {
						while (true) {
							local40 = this.method4020(arg0, local40, local18, local44, local13.aByteArray92[this.anInt4489 - 1]);
							if (this.anInt4486 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4486 - 1) / local33;
							if (local416 >= this.anInt4492) {
								this.anInt4486 += local33 * this.anInt4492;
								this.anInt4492 = 0;
								break;
							}
							this.anInt4486 += local33 * local416;
							this.anInt4492 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4048(arg0, local40, local23, local44, local13.aByteArray92[this.anInt4494]);
							if (this.anInt4486 < local23) {
								return;
							}
							local416 = (this.anInt4486 - local18) / local33;
							if (local416 >= this.anInt4492) {
								this.anInt4486 -= local33 * this.anInt4492;
								this.anInt4492 = 0;
								break;
							}
							this.anInt4486 -= local33 * local416;
							this.anInt4492 -= local416;
						}
					}
				}
			}
			if (this.anInt4496 < 0) {
				this.method4020(arg0, local40, 0, local44, 0);
				if (this.anInt4486 < 0) {
					this.anInt4486 = -1;
					this.method4042();
					this.method5628();
					return;
				}
			} else {
				this.method4048(arg0, local40, local29, local44, 0);
				if (this.anInt4486 >= local29) {
					this.anInt4486 = local29;
					this.method4042();
					this.method5628();
				}
			}
		} else if (this.aBoolean424) {
			if (this.anInt4496 < 0) {
				local40 = this.method4020(arg0, arg1, local18, local44, local13.aByteArray92[this.anInt4494]);
				if (this.anInt4486 >= local18) {
					return;
				}
				this.anInt4486 = local18 + local18 - this.anInt4486 - 1;
				this.anInt4496 = -this.anInt4496;
			}
			while (true) {
				local40 = this.method4048(arg0, local40, local23, local44, local13.aByteArray92[this.anInt4489 - 1]);
				if (this.anInt4486 < local23) {
					return;
				}
				this.anInt4486 = local23 + local23 - this.anInt4486 - 1;
				this.anInt4496 = -this.anInt4496;
				local40 = this.method4020(arg0, local40, local18, local44, local13.aByteArray92[this.anInt4494]);
				if (this.anInt4486 >= local18) {
					return;
				}
				this.anInt4486 = local18 + local18 - this.anInt4486 - 1;
				this.anInt4496 = -this.anInt4496;
			}
		} else if (this.anInt4496 < 0) {
			while (true) {
				local40 = this.method4020(arg0, local40, local18, local44, local13.aByteArray92[this.anInt4489 - 1]);
				if (this.anInt4486 >= local18) {
					return;
				}
				this.anInt4486 = local23 - (local23 - 1 - this.anInt4486) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4048(arg0, local40, local23, local44, local13.aByteArray92[this.anInt4494]);
				if (this.anInt4486 < local23) {
					return;
				}
				this.anInt4486 = local18 + (this.anInt4486 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "g", descriptor = "()Z")
	public boolean method4026() {
		return this.anInt4488 != 0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public synchronized void method4029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4043(arg0, arg1, this.method4023());
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
	private synchronized void method4031() {
		this.method4055(0, this.method4023());
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(I)V")
	public synchronized void method4032(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4031();
			this.method5628();
		} else if (this.anInt4495 == 0 && this.anInt4491 == 0) {
			this.anInt4488 = 0;
			this.anInt4499 = 0;
			this.anInt4493 = 0;
			this.method5628();
		} else {
			@Pc(31) int local31 = -this.anInt4493;
			if (this.anInt4493 > local31) {
				local31 = this.anInt4493;
			}
			if (-this.anInt4495 > local31) {
				local31 = -this.anInt4495;
			}
			if (this.anInt4495 > local31) {
				local31 = this.anInt4495;
			}
			if (-this.anInt4491 > local31) {
				local31 = -this.anInt4491;
			}
			if (this.anInt4491 > local31) {
				local31 = this.anInt4491;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4488 = arg0;
			this.anInt4499 = Integer.MIN_VALUE;
			this.anInt4498 = -this.anInt4493 / arg0;
			this.anInt4490 = -this.anInt4495 / arg0;
			this.anInt4487 = -this.anInt4491 / arg0;
		}
	}

	@OriginalMember(owner = "client!np", name = "h", descriptor = "()Z")
	private boolean method4034() {
		@Pc(2) int local2 = this.anInt4499;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static370.method4036(local2, this.anInt4497);
			local8 = Static370.method4035(local2, this.anInt4497);
		}
		if (this.anInt4493 != local2 || this.anInt4495 != local10 || this.anInt4491 != local8) {
			if (this.anInt4493 < local2) {
				this.anInt4498 = 1;
				this.anInt4488 = local2 - this.anInt4493;
			} else if (this.anInt4493 > local2) {
				this.anInt4498 = -1;
				this.anInt4488 = this.anInt4493 - local2;
			} else {
				this.anInt4498 = 0;
			}
			if (this.anInt4495 < local10) {
				this.anInt4490 = 1;
				if (this.anInt4488 == 0 || this.anInt4488 > local10 - this.anInt4495) {
					this.anInt4488 = local10 - this.anInt4495;
				}
			} else if (this.anInt4495 > local10) {
				this.anInt4490 = -1;
				if (this.anInt4488 == 0 || this.anInt4488 > this.anInt4495 - local10) {
					this.anInt4488 = this.anInt4495 - local10;
				}
			} else {
				this.anInt4490 = 0;
			}
			if (this.anInt4491 < local8) {
				this.anInt4487 = 1;
				if (this.anInt4488 == 0 || this.anInt4488 > local8 - this.anInt4491) {
					this.anInt4488 = local8 - this.anInt4491;
				}
			} else if (this.anInt4491 > local8) {
				this.anInt4487 = -1;
				if (this.anInt4488 == 0 || this.anInt4488 > this.anInt4491 - local8) {
					this.anInt4488 = this.anInt4491 - local8;
				}
			} else {
				this.anInt4487 = 0;
			}
			return false;
		} else if (this.anInt4499 == Integer.MIN_VALUE) {
			this.anInt4499 = 0;
			this.anInt4493 = this.anInt4495 = this.anInt4491 = 0;
			this.method5628();
			return true;
		} else {
			this.method4024();
			return false;
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5034(@OriginalArg(0) int arg0) {
		if (this.anInt4488 > 0) {
			if (arg0 >= this.anInt4488) {
				if (this.anInt4499 == Integer.MIN_VALUE) {
					this.anInt4499 = 0;
					this.anInt4493 = this.anInt4495 = this.anInt4491 = 0;
					this.method5628();
					arg0 = this.anInt4488;
				}
				this.anInt4488 = 0;
				this.method4024();
			} else {
				this.anInt4493 += this.anInt4498 * arg0;
				this.anInt4495 += this.anInt4490 * arg0;
				this.anInt4491 += this.anInt4487 * arg0;
				this.anInt4488 -= arg0;
			}
		}
		@Pc(71) Class1_Sub15_Sub1 local71 = (Class1_Sub15_Sub1) super.aClass1_Sub15_5;
		@Pc(76) int local76 = this.anInt4494 << 8;
		@Pc(81) int local81 = this.anInt4489 << 8;
		@Pc(87) int local87 = local71.aByteArray92.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4492 = 0;
		}
		if (this.anInt4486 < 0) {
			if (this.anInt4496 <= 0) {
				this.method4042();
				this.method5628();
				return;
			}
			this.anInt4486 = 0;
		}
		if (this.anInt4486 >= local87) {
			if (this.anInt4496 >= 0) {
				this.method4042();
				this.method5628();
				return;
			}
			this.anInt4486 = local87 - 1;
		}
		this.anInt4486 += this.anInt4496 * arg0;
		if (this.anInt4492 >= 0) {
			if (this.anInt4492 > 0) {
				if (this.aBoolean424) {
					label125: {
						if (this.anInt4496 < 0) {
							if (this.anInt4486 >= local76) {
								return;
							}
							this.anInt4486 = local76 + local76 - this.anInt4486 - 1;
							this.anInt4496 = -this.anInt4496;
							if (--this.anInt4492 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4486 < local81) {
								return;
							}
							this.anInt4486 = local81 + local81 - this.anInt4486 - 1;
							this.anInt4496 = -this.anInt4496;
							if (--this.anInt4492 == 0) {
								break;
							}
							if (this.anInt4486 >= local76) {
								return;
							}
							this.anInt4486 = local76 + local76 - this.anInt4486 - 1;
							this.anInt4496 = -this.anInt4496;
						} while (--this.anInt4492 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4496 < 0) {
						if (this.anInt4486 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4486 - 1) / local91;
						if (local361 < this.anInt4492) {
							this.anInt4486 += local91 * local361;
							this.anInt4492 -= local361;
							return;
						}
						this.anInt4486 += local91 * this.anInt4492;
						this.anInt4492 = 0;
					} else if (this.anInt4486 >= local81) {
						local361 = (this.anInt4486 - local76) / local91;
						if (local361 < this.anInt4492) {
							this.anInt4486 -= local91 * local361;
							this.anInt4492 -= local361;
							return;
						}
						this.anInt4486 -= local91 * this.anInt4492;
						this.anInt4492 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4496 < 0) {
				if (this.anInt4486 < 0) {
					this.anInt4486 = -1;
					this.method4042();
					this.method5628();
					return;
				}
			} else if (this.anInt4486 >= local87) {
				this.anInt4486 = local87;
				this.method4042();
				this.method5628();
			}
		} else if (this.aBoolean424) {
			if (this.anInt4496 < 0) {
				if (this.anInt4486 >= local76) {
					return;
				}
				this.anInt4486 = local76 + local76 - this.anInt4486 - 1;
				this.anInt4496 = -this.anInt4496;
			}
			while (this.anInt4486 >= local81) {
				this.anInt4486 = local81 + local81 - this.anInt4486 - 1;
				this.anInt4496 = -this.anInt4496;
				if (this.anInt4486 >= local76) {
					return;
				}
				this.anInt4486 = local76 + local76 - this.anInt4486 - 1;
				this.anInt4496 = -this.anInt4496;
			}
		} else if (this.anInt4496 < 0) {
			if (this.anInt4486 < local76) {
				this.anInt4486 = local81 - (local81 - 1 - this.anInt4486) % local91 - 1;
			}
		} else if (this.anInt4486 >= local81) {
			this.anInt4486 = local76 + (this.anInt4486 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
	public synchronized void method4037() {
		this.anInt4496 = (this.anInt4496 ^ this.anInt4496 >> 31) + (this.anInt4496 >>> 31);
		this.anInt4496 = -this.anInt4496;
	}

	@OriginalMember(owner = "client!np", name = "i", descriptor = "()V")
	private void method4042() {
		if (this.anInt4488 == 0) {
			return;
		}
		if (this.anInt4499 == Integer.MIN_VALUE) {
			this.anInt4499 = 0;
		}
		this.anInt4488 = 0;
		this.method4024();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)V")
	public synchronized void method4043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4055(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static370.method4036(arg1, arg2);
		@Pc(14) int local14 = Static370.method4035(arg1, arg2);
		if (this.anInt4495 == local10 && this.anInt4491 == local14) {
			this.anInt4488 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4493;
		if (this.anInt4493 - arg1 > local31) {
			local31 = this.anInt4493 - arg1;
		}
		if (local10 - this.anInt4495 > local31) {
			local31 = local10 - this.anInt4495;
		}
		if (this.anInt4495 - local10 > local31) {
			local31 = this.anInt4495 - local10;
		}
		if (local14 - this.anInt4491 > local31) {
			local31 = local14 - this.anInt4491;
		}
		if (this.anInt4491 - local14 > local31) {
			local31 = this.anInt4491 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4488 = arg0;
		this.anInt4499 = arg1;
		this.anInt4497 = arg2;
		this.anInt4498 = (arg1 - this.anInt4493) / arg0;
		this.anInt4490 = (local10 - this.anInt4495) / arg0;
		this.anInt4487 = (local14 - this.anInt4491) / arg0;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "()I")
	@Override
	public int method5030() {
		@Pc(6) int local6 = this.anInt4493 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4492 == 0) {
			local6 -= local6 * this.anInt4486 / (((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92.length << 8);
		} else if (this.anInt4492 >= 0) {
			local6 -= local6 * this.anInt4494 / ((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "()I")
	@Override
	public int method5031() {
		return this.anInt4499 == 0 && this.anInt4488 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "([IIIII)I")
	private int method4048(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4488 <= 0) {
				if (this.anInt4496 == 256 && (this.anInt4486 & 0xFF) == 0) {
					if (Static330.aBoolean615) {
						return Static370.method4046(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4495, this.anInt4491, arg3, arg2, this);
					}
					return Static370.method4052(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4493, arg3, arg2, this);
				}
				if (Static330.aBoolean615) {
					return Static370.method4041(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4495, this.anInt4491, arg3, arg2, this, this.anInt4496, arg4);
				}
				return Static370.method4028(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4493, arg3, arg2, this, this.anInt4496, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4488;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4488 += arg1;
			if (this.anInt4496 == 256 && (this.anInt4486 & 0xFF) == 0) {
				if (Static330.aBoolean615) {
					arg1 = Static370.method4040(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4495, this.anInt4491, this.anInt4490, this.anInt4487, local5, arg2, this);
				} else {
					arg1 = Static370.method4030(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4493, this.anInt4498, local5, arg2, this);
				}
			} else if (Static330.aBoolean615) {
				arg1 = Static370.method4027(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4495, this.anInt4491, this.anInt4490, this.anInt4487, local5, arg2, this, this.anInt4496, arg4);
			} else {
				arg1 = Static370.method4025(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92, arg0, this.anInt4486, arg1, this.anInt4493, this.anInt4498, local5, arg2, this, this.anInt4496, arg4);
			}
			this.anInt4488 -= arg1;
			if (this.anInt4488 != 0) {
				return arg1;
			}
		} while (!this.method4034());
		return arg3;
	}

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(I)V")
	public synchronized void method4049(@OriginalArg(0) int arg0) {
		this.anInt4492 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "g", descriptor = "(I)V")
	public synchronized void method4050(@OriginalArg(0) int arg0) {
		this.method4055(arg0 << 6, this.method4023());
	}

	@OriginalMember(owner = "client!np", name = "j", descriptor = "()Z")
	public boolean method4054() {
		return this.anInt4486 < 0 || this.anInt4486 >= ((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92.length << 8;
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(II)V")
	private synchronized void method4055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4499 = arg0;
		this.anInt4497 = arg1;
		this.anInt4488 = 0;
		this.method4024();
	}

	@OriginalMember(owner = "client!np", name = "k", descriptor = "()I")
	public synchronized int method4056() {
		return this.anInt4496 < 0 ? -this.anInt4496 : this.anInt4496;
	}

	@OriginalMember(owner = "client!np", name = "l", descriptor = "()I")
	public synchronized int method4058() {
		return this.anInt4499 == Integer.MIN_VALUE ? 0 : this.anInt4499;
	}

	@OriginalMember(owner = "client!np", name = "h", descriptor = "(I)V")
	public synchronized void method4059(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray92.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4486 = arg0;
	}
}
