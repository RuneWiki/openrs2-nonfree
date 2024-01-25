import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!t", name = "n", descriptor = "I")
	public int anInt6487;

	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public int anInt6488;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "I")
	public int anInt6489;

	@OriginalMember(owner = "client!t", name = "q", descriptor = "I")
	private int anInt6490;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "I")
	public int anInt6491;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "I")
	public int anInt6494;

	@OriginalMember(owner = "client!t", name = "w", descriptor = "I")
	public int anInt6495;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "I")
	private int anInt6496;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "I")
	private final int anInt6498;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "I")
	private final int anInt6497;

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Z")
	private final boolean aBoolean446;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "I")
	private int anInt6500;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	private int anInt6499;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "I")
	private int anInt6493;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "I")
	public int anInt6492;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!jp;II)V")
	public Class3_Sub1_Sub3(@OriginalArg(0) Class3_Sub28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub28_5 = arg0;
		this.anInt6498 = arg0.anInt3568;
		this.anInt6497 = arg0.anInt3570;
		this.aBoolean446 = arg0.aBoolean272;
		this.anInt6500 = arg1;
		this.anInt6499 = arg2;
		this.anInt6493 = 8192;
		this.anInt6492 = 0;
		this.method5350();
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!jp;III)V")
	public Class3_Sub1_Sub3(@OriginalArg(0) Class3_Sub28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub28_5 = arg0;
		this.anInt6498 = arg0.anInt3568;
		this.anInt6497 = arg0.anInt3570;
		this.aBoolean446 = arg0.aBoolean272;
		this.anInt6500 = arg1;
		this.anInt6499 = arg2;
		this.anInt6493 = arg3;
		this.anInt6492 = 0;
		this.method5350();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIII)I")
	private int method5344(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6496 <= 0) {
				if (this.anInt6500 == -256 && (this.anInt6492 & 0xFF) == 0) {
					if (Static158.aBoolean222) {
						return Static474.method5370(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6488, this.anInt6489, arg3, arg2, this);
					}
					return Static474.method5369(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6487, arg3, arg2, this);
				}
				if (Static158.aBoolean222) {
					return Static474.method5374(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6488, this.anInt6489, arg3, arg2, this, this.anInt6500, arg4);
				}
				return Static474.method5371(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6487, arg3, arg2, this, this.anInt6500, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6496;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6496 += arg1;
			if (this.anInt6500 == -256 && (this.anInt6492 & 0xFF) == 0) {
				if (Static158.aBoolean222) {
					arg1 = Static474.method5362(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6488, this.anInt6489, this.anInt6494, this.anInt6495, local5, arg2, this);
				} else {
					arg1 = Static474.method5378(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6487, this.anInt6491, local5, arg2, this);
				}
			} else if (Static158.aBoolean222) {
				arg1 = Static474.method5361(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6488, this.anInt6489, this.anInt6494, this.anInt6495, local5, arg2, this, this.anInt6500, arg4);
			} else {
				arg1 = Static474.method5376(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6487, this.anInt6491, local5, arg2, this, this.anInt6500, arg4);
			}
			this.anInt6496 -= arg1;
			if (this.anInt6496 != 0) {
				return arg1;
			}
		} while (!this.method5346());
		return arg3;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6294(@OriginalArg(0) int arg0) {
		if (this.anInt6496 > 0) {
			if (arg0 >= this.anInt6496) {
				if (this.anInt6499 == Integer.MIN_VALUE) {
					this.anInt6499 = 0;
					this.anInt6487 = this.anInt6488 = this.anInt6489 = 0;
					this.method6288();
					arg0 = this.anInt6496;
				}
				this.anInt6496 = 0;
				this.method5350();
			} else {
				this.anInt6487 += this.anInt6491 * arg0;
				this.anInt6488 += this.anInt6494 * arg0;
				this.anInt6489 += this.anInt6495 * arg0;
				this.anInt6496 -= arg0;
			}
		}
		@Pc(71) Class3_Sub28_Sub1 local71 = (Class3_Sub28_Sub1) super.aClass3_Sub28_5;
		@Pc(76) int local76 = this.anInt6498 << 8;
		@Pc(81) int local81 = this.anInt6497 << 8;
		@Pc(87) int local87 = local71.aByteArray70.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt6490 = 0;
		}
		if (this.anInt6492 < 0) {
			if (this.anInt6500 <= 0) {
				this.method5347();
				this.method6288();
				return;
			}
			this.anInt6492 = 0;
		}
		if (this.anInt6492 >= local87) {
			if (this.anInt6500 >= 0) {
				this.method5347();
				this.method6288();
				return;
			}
			this.anInt6492 = local87 - 1;
		}
		this.anInt6492 += this.anInt6500 * arg0;
		if (this.anInt6490 >= 0) {
			if (this.anInt6490 > 0) {
				if (this.aBoolean446) {
					label125: {
						if (this.anInt6500 < 0) {
							if (this.anInt6492 >= local76) {
								return;
							}
							this.anInt6492 = local76 + local76 - this.anInt6492 - 1;
							this.anInt6500 = -this.anInt6500;
							if (--this.anInt6490 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt6492 < local81) {
								return;
							}
							this.anInt6492 = local81 + local81 - this.anInt6492 - 1;
							this.anInt6500 = -this.anInt6500;
							if (--this.anInt6490 == 0) {
								break;
							}
							if (this.anInt6492 >= local76) {
								return;
							}
							this.anInt6492 = local76 + local76 - this.anInt6492 - 1;
							this.anInt6500 = -this.anInt6500;
						} while (--this.anInt6490 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt6500 < 0) {
						if (this.anInt6492 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt6492 - 1) / local91;
						if (local361 < this.anInt6490) {
							this.anInt6492 += local91 * local361;
							this.anInt6490 -= local361;
							return;
						}
						this.anInt6492 += local91 * this.anInt6490;
						this.anInt6490 = 0;
					} else if (this.anInt6492 >= local81) {
						local361 = (this.anInt6492 - local76) / local91;
						if (local361 < this.anInt6490) {
							this.anInt6492 -= local91 * local361;
							this.anInt6490 -= local361;
							return;
						}
						this.anInt6492 -= local91 * this.anInt6490;
						this.anInt6490 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt6500 < 0) {
				if (this.anInt6492 < 0) {
					this.anInt6492 = -1;
					this.method5347();
					this.method6288();
					return;
				}
			} else if (this.anInt6492 >= local87) {
				this.anInt6492 = local87;
				this.method5347();
				this.method6288();
			}
		} else if (this.aBoolean446) {
			if (this.anInt6500 < 0) {
				if (this.anInt6492 >= local76) {
					return;
				}
				this.anInt6492 = local76 + local76 - this.anInt6492 - 1;
				this.anInt6500 = -this.anInt6500;
			}
			while (this.anInt6492 >= local81) {
				this.anInt6492 = local81 + local81 - this.anInt6492 - 1;
				this.anInt6500 = -this.anInt6500;
				if (this.anInt6492 >= local76) {
					return;
				}
				this.anInt6492 = local76 + local76 - this.anInt6492 - 1;
				this.anInt6500 = -this.anInt6500;
			}
		} else if (this.anInt6500 < 0) {
			if (this.anInt6492 < local76) {
				this.anInt6492 = local81 - (local81 - 1 - this.anInt6492) % local91 - 1;
			}
		} else if (this.anInt6492 >= local81) {
			this.anInt6492 = local76 + (this.anInt6492 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()Lclient!wq;")
	@Override
	public Class3_Sub1 method6296() {
		return null;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "()Z")
	private boolean method5346() {
		@Pc(2) int local2 = this.anInt6499;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static474.method5345(local2, this.anInt6493);
			local8 = Static474.method5380(local2, this.anInt6493);
		}
		if (this.anInt6487 != local2 || this.anInt6488 != local10 || this.anInt6489 != local8) {
			if (this.anInt6487 < local2) {
				this.anInt6491 = 1;
				this.anInt6496 = local2 - this.anInt6487;
			} else if (this.anInt6487 > local2) {
				this.anInt6491 = -1;
				this.anInt6496 = this.anInt6487 - local2;
			} else {
				this.anInt6491 = 0;
			}
			if (this.anInt6488 < local10) {
				this.anInt6494 = 1;
				if (this.anInt6496 == 0 || this.anInt6496 > local10 - this.anInt6488) {
					this.anInt6496 = local10 - this.anInt6488;
				}
			} else if (this.anInt6488 > local10) {
				this.anInt6494 = -1;
				if (this.anInt6496 == 0 || this.anInt6496 > this.anInt6488 - local10) {
					this.anInt6496 = this.anInt6488 - local10;
				}
			} else {
				this.anInt6494 = 0;
			}
			if (this.anInt6489 < local8) {
				this.anInt6495 = 1;
				if (this.anInt6496 == 0 || this.anInt6496 > local8 - this.anInt6489) {
					this.anInt6496 = local8 - this.anInt6489;
				}
			} else if (this.anInt6489 > local8) {
				this.anInt6495 = -1;
				if (this.anInt6496 == 0 || this.anInt6496 > this.anInt6489 - local8) {
					this.anInt6496 = this.anInt6489 - local8;
				}
			} else {
				this.anInt6495 = 0;
			}
			return false;
		} else if (this.anInt6499 == Integer.MIN_VALUE) {
			this.anInt6499 = 0;
			this.anInt6487 = this.anInt6488 = this.anInt6489 = 0;
			this.method6288();
			return true;
		} else {
			this.method5350();
			return false;
		}
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "()V")
	private void method5347() {
		if (this.anInt6496 == 0) {
			return;
		}
		if (this.anInt6499 == Integer.MIN_VALUE) {
			this.anInt6499 = 0;
		}
		this.anInt6496 = 0;
		this.method5350();
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
	public synchronized void method5348(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt6492 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "()V")
	private void method5350() {
		this.anInt6487 = this.anInt6499;
		this.anInt6488 = Static474.method5345(this.anInt6499, this.anInt6493);
		this.anInt6489 = Static474.method5380(this.anInt6499, this.anInt6493);
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "()I")
	public synchronized int method5351() {
		return this.anInt6499 == Integer.MIN_VALUE ? 0 : this.anInt6499;
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
	public synchronized void method5352(@OriginalArg(0) int arg0) {
		if (this.anInt6500 < 0) {
			this.anInt6500 = -arg0;
		} else {
			this.anInt6500 = arg0;
		}
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(I)V")
	public synchronized void method5353(@OriginalArg(0) int arg0) {
		this.method5354(arg0 << 6, this.method5379());
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V")
	private synchronized void method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6499 = arg0;
		this.anInt6493 = arg1;
		this.anInt6496 = 0;
		this.method5350();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()I")
	@Override
	public int method6291() {
		return this.anInt6499 == 0 && this.anInt6496 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!t", name = "i", descriptor = "()Z")
	public boolean method5357() {
		return this.anInt6496 != 0;
	}

	@OriginalMember(owner = "client!t", name = "i", descriptor = "(I)V")
	public synchronized void method5358(@OriginalArg(0) int arg0) {
		this.anInt6490 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	public synchronized void method5359() {
		this.anInt6500 = (this.anInt6500 ^ this.anInt6500 >> 31) + (this.anInt6500 >>> 31);
		this.anInt6500 = -this.anInt6500;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6290(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6499 == 0 && this.anInt6496 == 0) {
			this.method6294(arg2);
			return;
		}
		@Pc(13) Class3_Sub28_Sub1 local13 = (Class3_Sub28_Sub1) super.aClass3_Sub28_5;
		@Pc(18) int local18 = this.anInt6498 << 8;
		@Pc(23) int local23 = this.anInt6497 << 8;
		@Pc(29) int local29 = local13.aByteArray70.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt6490 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt6492 < 0) {
			if (this.anInt6500 <= 0) {
				this.method5347();
				this.method6288();
				return;
			}
			this.anInt6492 = 0;
		}
		if (this.anInt6492 >= local29) {
			if (this.anInt6500 >= 0) {
				this.method5347();
				this.method6288();
				return;
			}
			this.anInt6492 = local29 - 1;
		}
		if (this.anInt6490 >= 0) {
			if (this.anInt6490 > 0) {
				if (this.aBoolean446) {
					label130: {
						if (this.anInt6500 < 0) {
							local40 = this.method5344(arg0, arg1, local18, local44, local13.aByteArray70[this.anInt6498]);
							if (this.anInt6492 >= local18) {
								return;
							}
							this.anInt6492 = local18 + local18 - this.anInt6492 - 1;
							this.anInt6500 = -this.anInt6500;
							if (--this.anInt6490 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5382(arg0, local40, local23, local44, local13.aByteArray70[this.anInt6497 - 1]);
							if (this.anInt6492 < local23) {
								return;
							}
							this.anInt6492 = local23 + local23 - this.anInt6492 - 1;
							this.anInt6500 = -this.anInt6500;
							if (--this.anInt6490 == 0) {
								break;
							}
							local40 = this.method5344(arg0, local40, local18, local44, local13.aByteArray70[this.anInt6498]);
							if (this.anInt6492 >= local18) {
								return;
							}
							this.anInt6492 = local18 + local18 - this.anInt6492 - 1;
							this.anInt6500 = -this.anInt6500;
						} while (--this.anInt6490 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt6500 < 0) {
						while (true) {
							local40 = this.method5344(arg0, local40, local18, local44, local13.aByteArray70[this.anInt6497 - 1]);
							if (this.anInt6492 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt6492 - 1) / local33;
							if (local416 >= this.anInt6490) {
								this.anInt6492 += local33 * this.anInt6490;
								this.anInt6490 = 0;
								break;
							}
							this.anInt6492 += local33 * local416;
							this.anInt6490 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5382(arg0, local40, local23, local44, local13.aByteArray70[this.anInt6498]);
							if (this.anInt6492 < local23) {
								return;
							}
							local416 = (this.anInt6492 - local18) / local33;
							if (local416 >= this.anInt6490) {
								this.anInt6492 -= local33 * this.anInt6490;
								this.anInt6490 = 0;
								break;
							}
							this.anInt6492 -= local33 * local416;
							this.anInt6490 -= local416;
						}
					}
				}
			}
			if (this.anInt6500 < 0) {
				this.method5344(arg0, local40, 0, local44, 0);
				if (this.anInt6492 < 0) {
					this.anInt6492 = -1;
					this.method5347();
					this.method6288();
					return;
				}
			} else {
				this.method5382(arg0, local40, local29, local44, 0);
				if (this.anInt6492 >= local29) {
					this.anInt6492 = local29;
					this.method5347();
					this.method6288();
				}
			}
		} else if (this.aBoolean446) {
			if (this.anInt6500 < 0) {
				local40 = this.method5344(arg0, arg1, local18, local44, local13.aByteArray70[this.anInt6498]);
				if (this.anInt6492 >= local18) {
					return;
				}
				this.anInt6492 = local18 + local18 - this.anInt6492 - 1;
				this.anInt6500 = -this.anInt6500;
			}
			while (true) {
				local40 = this.method5382(arg0, local40, local23, local44, local13.aByteArray70[this.anInt6497 - 1]);
				if (this.anInt6492 < local23) {
					return;
				}
				this.anInt6492 = local23 + local23 - this.anInt6492 - 1;
				this.anInt6500 = -this.anInt6500;
				local40 = this.method5344(arg0, local40, local18, local44, local13.aByteArray70[this.anInt6498]);
				if (this.anInt6492 >= local18) {
					return;
				}
				this.anInt6492 = local18 + local18 - this.anInt6492 - 1;
				this.anInt6500 = -this.anInt6500;
			}
		} else if (this.anInt6500 < 0) {
			while (true) {
				local40 = this.method5344(arg0, local40, local18, local44, local13.aByteArray70[this.anInt6497 - 1]);
				if (this.anInt6492 >= local18) {
					return;
				}
				this.anInt6492 = local23 - (local23 - 1 - this.anInt6492) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5382(arg0, local40, local23, local44, local13.aByteArray70[this.anInt6498]);
				if (this.anInt6492 < local23) {
					return;
				}
				this.anInt6492 = local18 + (this.anInt6492 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(II)V")
	public synchronized void method5363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5377(arg0, arg1, this.method5379());
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()Lclient!wq;")
	@Override
	public Class3_Sub1 method6292() {
		return null;
	}

	@OriginalMember(owner = "client!t", name = "j", descriptor = "()I")
	public synchronized int method5365() {
		return this.anInt6500 < 0 ? -this.anInt6500 : this.anInt6500;
	}

	@OriginalMember(owner = "client!t", name = "j", descriptor = "(I)V")
	public synchronized void method5366(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5367();
			this.method6288();
		} else if (this.anInt6488 == 0 && this.anInt6489 == 0) {
			this.anInt6496 = 0;
			this.anInt6499 = 0;
			this.anInt6487 = 0;
			this.method6288();
		} else {
			@Pc(31) int local31 = -this.anInt6487;
			if (this.anInt6487 > local31) {
				local31 = this.anInt6487;
			}
			if (-this.anInt6488 > local31) {
				local31 = -this.anInt6488;
			}
			if (this.anInt6488 > local31) {
				local31 = this.anInt6488;
			}
			if (-this.anInt6489 > local31) {
				local31 = -this.anInt6489;
			}
			if (this.anInt6489 > local31) {
				local31 = this.anInt6489;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt6496 = arg0;
			this.anInt6499 = Integer.MIN_VALUE;
			this.anInt6491 = -this.anInt6487 / arg0;
			this.anInt6494 = -this.anInt6488 / arg0;
			this.anInt6495 = -this.anInt6489 / arg0;
		}
	}

	@OriginalMember(owner = "client!t", name = "k", descriptor = "(I)V")
	private synchronized void method5367() {
		this.method5354(0, this.method5379());
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
	@Override
	public int method6293() {
		@Pc(6) int local6 = this.anInt6487 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt6490 == 0) {
			local6 -= local6 * this.anInt6492 / (((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70.length << 8);
		} else if (this.anInt6490 >= 0) {
			local6 -= local6 * this.anInt6498 / ((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public synchronized void method5377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5354(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static474.method5345(arg1, arg2);
		@Pc(14) int local14 = Static474.method5380(arg1, arg2);
		if (this.anInt6488 == local10 && this.anInt6489 == local14) {
			this.anInt6496 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt6487;
		if (this.anInt6487 - arg1 > local31) {
			local31 = this.anInt6487 - arg1;
		}
		if (local10 - this.anInt6488 > local31) {
			local31 = local10 - this.anInt6488;
		}
		if (this.anInt6488 - local10 > local31) {
			local31 = this.anInt6488 - local10;
		}
		if (local14 - this.anInt6489 > local31) {
			local31 = local14 - this.anInt6489;
		}
		if (this.anInt6489 - local14 > local31) {
			local31 = this.anInt6489 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt6496 = arg0;
		this.anInt6499 = arg1;
		this.anInt6493 = arg2;
		this.anInt6491 = (arg1 - this.anInt6487) / arg0;
		this.anInt6494 = (local10 - this.anInt6488) / arg0;
		this.anInt6495 = (local14 - this.anInt6489) / arg0;
	}

	@OriginalMember(owner = "client!t", name = "k", descriptor = "()I")
	public synchronized int method5379() {
		return this.anInt6493 < 0 ? -1 : this.anInt6493;
	}

	@OriginalMember(owner = "client!t", name = "l", descriptor = "()Z")
	public boolean method5381() {
		return this.anInt6492 < 0 || this.anInt6492 >= ((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70.length << 8;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "([IIIII)I")
	private int method5382(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt6496 <= 0) {
				if (this.anInt6500 == 256 && (this.anInt6492 & 0xFF) == 0) {
					if (Static158.aBoolean222) {
						return Static474.method5375(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6488, this.anInt6489, arg3, arg2, this);
					}
					return Static474.method5373(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6487, arg3, arg2, this);
				}
				if (Static158.aBoolean222) {
					return Static474.method5360(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6488, this.anInt6489, arg3, arg2, this, this.anInt6500, arg4);
				}
				return Static474.method5368(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6487, arg3, arg2, this, this.anInt6500, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt6496;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt6496 += arg1;
			if (this.anInt6500 == 256 && (this.anInt6492 & 0xFF) == 0) {
				if (Static158.aBoolean222) {
					arg1 = Static474.method5349(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6488, this.anInt6489, this.anInt6494, this.anInt6495, local5, arg2, this);
				} else {
					arg1 = Static474.method5355(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6487, this.anInt6491, local5, arg2, this);
				}
			} else if (Static158.aBoolean222) {
				arg1 = Static474.method5356(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6488, this.anInt6489, this.anInt6494, this.anInt6495, local5, arg2, this, this.anInt6500, arg4);
			} else {
				arg1 = Static474.method5364(((Class3_Sub28_Sub1) super.aClass3_Sub28_5).aByteArray70, arg0, this.anInt6492, arg1, this.anInt6487, this.anInt6491, local5, arg2, this, this.anInt6500, arg4);
			}
			this.anInt6496 -= arg1;
			if (this.anInt6496 != 0) {
				return arg1;
			}
		} while (!this.method5346());
		return arg3;
	}
}
