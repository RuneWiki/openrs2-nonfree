import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
	public int anInt3550;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
	public int anInt3552;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
	public int anInt3554;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
	private int anInt3555;

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
	public int anInt3556;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
	private int anInt3558;

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
	public int anInt3559;

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
	public int anInt3560;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	private final int anInt3551;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
	private final int anInt3553;

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "Z")
	private final boolean aBoolean194;

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
	private int anInt3561;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
	private int anInt3548;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
	private int anInt3557;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
	public int anInt3549;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!hh;II)V")
	public Class3_Sub2_Sub3(@OriginalArg(0) Class3_Sub17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub17_5 = arg0;
		this.anInt3551 = arg0.anInt2521;
		this.anInt3553 = arg0.anInt2522;
		this.aBoolean194 = arg0.aBoolean139;
		this.anInt3561 = arg1;
		this.anInt3548 = arg2;
		this.anInt3557 = 8192;
		this.anInt3549 = 0;
		this.method2810();
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!hh;III)V")
	public Class3_Sub2_Sub3(@OriginalArg(0) Class3_Sub17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub17_5 = arg0;
		this.anInt3551 = arg0.anInt2521;
		this.anInt3553 = arg0.anInt2522;
		this.aBoolean194 = arg0.aBoolean139;
		this.anInt3561 = arg1;
		this.anInt3548 = arg2;
		this.anInt3557 = arg3;
		this.anInt3549 = 0;
		this.method2810();
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "()I")
	public synchronized int method2782() {
		return this.anInt3557 < 0 ? -1 : this.anInt3557;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	public synchronized void method2783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2809(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static364.method2816(arg1, arg2);
		@Pc(14) int local14 = Static364.method2815(arg1, arg2);
		if (this.anInt3554 == local10 && this.anInt3550 == local14) {
			this.anInt3555 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3560;
		if (this.anInt3560 - arg1 > local31) {
			local31 = this.anInt3560 - arg1;
		}
		if (local10 - this.anInt3554 > local31) {
			local31 = local10 - this.anInt3554;
		}
		if (this.anInt3554 - local10 > local31) {
			local31 = this.anInt3554 - local10;
		}
		if (local14 - this.anInt3550 > local31) {
			local31 = local14 - this.anInt3550;
		}
		if (this.anInt3550 - local14 > local31) {
			local31 = this.anInt3550 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3555 = arg0;
		this.anInt3548 = arg1;
		this.anInt3557 = arg2;
		this.anInt3552 = (arg1 - this.anInt3560) / arg0;
		this.anInt3559 = (local10 - this.anInt3554) / arg0;
		this.anInt3556 = (local14 - this.anInt3550) / arg0;
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "()I")
	public synchronized int method2785() {
		return this.anInt3561 < 0 ? -this.anInt3561 : this.anInt3561;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "()I")
	@Override
	public int method5113() {
		return this.anInt3548 == 0 && this.anInt3555 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([IIIII)I")
	private int method2786(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3555 <= 0) {
				if (this.anInt3561 == -256 && (this.anInt3549 & 0xFF) == 0) {
					if (Static272.aBoolean339) {
						return Static364.method2790(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3554, this.anInt3550, arg3, arg2, this);
					}
					return Static364.method2803(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3560, arg3, arg2, this);
				}
				if (Static272.aBoolean339) {
					return Static364.method2781(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3554, this.anInt3550, arg3, arg2, this, this.anInt3561, arg4);
				}
				return Static364.method2798(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3560, arg3, arg2, this, this.anInt3561, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3555;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3555 += arg1;
			if (this.anInt3561 == -256 && (this.anInt3549 & 0xFF) == 0) {
				if (Static272.aBoolean339) {
					arg1 = Static364.method2806(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3554, this.anInt3550, this.anInt3559, this.anInt3556, local5, arg2, this);
				} else {
					arg1 = Static364.method2799(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3560, this.anInt3552, local5, arg2, this);
				}
			} else if (Static272.aBoolean339) {
				arg1 = Static364.method2788(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3554, this.anInt3550, this.anInt3559, this.anInt3556, local5, arg2, this, this.anInt3561, arg4);
			} else {
				arg1 = Static364.method2789(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3560, this.anInt3552, local5, arg2, this, this.anInt3561, arg4);
			}
			this.anInt3555 -= arg1;
			if (this.anInt3555 != 0) {
				return arg1;
			}
		} while (!this.method2802());
		return arg3;
	}

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "()Z")
	public boolean method2791() {
		return this.anInt3555 != 0;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "()Lclient!mq;")
	@Override
	public Class3_Sub2 method5111() {
		return null;
	}

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "()I")
	public synchronized int method2793() {
		return this.anInt3548 == Integer.MIN_VALUE ? 0 : this.anInt3548;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(Z)V")
	public synchronized void method2794() {
		this.anInt3561 = (this.anInt3561 ^ this.anInt3561 >> 31) + (this.anInt3561 >>> 31);
		this.anInt3561 = -this.anInt3561;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5108(@OriginalArg(0) int arg0) {
		if (this.anInt3555 > 0) {
			if (arg0 >= this.anInt3555) {
				if (this.anInt3548 == Integer.MIN_VALUE) {
					this.anInt3548 = 0;
					this.anInt3560 = this.anInt3554 = this.anInt3550 = 0;
					this.method5717();
					arg0 = this.anInt3555;
				}
				this.anInt3555 = 0;
				this.method2810();
			} else {
				this.anInt3560 += this.anInt3552 * arg0;
				this.anInt3554 += this.anInt3559 * arg0;
				this.anInt3550 += this.anInt3556 * arg0;
				this.anInt3555 -= arg0;
			}
		}
		@Pc(71) Class3_Sub17_Sub1 local71 = (Class3_Sub17_Sub1) super.aClass3_Sub17_5;
		@Pc(76) int local76 = this.anInt3551 << 8;
		@Pc(81) int local81 = this.anInt3553 << 8;
		@Pc(87) int local87 = local71.aByteArray48.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3558 = 0;
		}
		if (this.anInt3549 < 0) {
			if (this.anInt3561 <= 0) {
				this.method2796();
				this.method5717();
				return;
			}
			this.anInt3549 = 0;
		}
		if (this.anInt3549 >= local87) {
			if (this.anInt3561 >= 0) {
				this.method2796();
				this.method5717();
				return;
			}
			this.anInt3549 = local87 - 1;
		}
		this.anInt3549 += this.anInt3561 * arg0;
		if (this.anInt3558 >= 0) {
			if (this.anInt3558 > 0) {
				if (this.aBoolean194) {
					label125: {
						if (this.anInt3561 < 0) {
							if (this.anInt3549 >= local76) {
								return;
							}
							this.anInt3549 = local76 + local76 - this.anInt3549 - 1;
							this.anInt3561 = -this.anInt3561;
							if (--this.anInt3558 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3549 < local81) {
								return;
							}
							this.anInt3549 = local81 + local81 - this.anInt3549 - 1;
							this.anInt3561 = -this.anInt3561;
							if (--this.anInt3558 == 0) {
								break;
							}
							if (this.anInt3549 >= local76) {
								return;
							}
							this.anInt3549 = local76 + local76 - this.anInt3549 - 1;
							this.anInt3561 = -this.anInt3561;
						} while (--this.anInt3558 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3561 < 0) {
						if (this.anInt3549 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3549 - 1) / local91;
						if (local361 < this.anInt3558) {
							this.anInt3549 += local91 * local361;
							this.anInt3558 -= local361;
							return;
						}
						this.anInt3549 += local91 * this.anInt3558;
						this.anInt3558 = 0;
					} else if (this.anInt3549 >= local81) {
						local361 = (this.anInt3549 - local76) / local91;
						if (local361 < this.anInt3558) {
							this.anInt3549 -= local91 * local361;
							this.anInt3558 -= local361;
							return;
						}
						this.anInt3549 -= local91 * this.anInt3558;
						this.anInt3558 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3561 < 0) {
				if (this.anInt3549 < 0) {
					this.anInt3549 = -1;
					this.method2796();
					this.method5717();
					return;
				}
			} else if (this.anInt3549 >= local87) {
				this.anInt3549 = local87;
				this.method2796();
				this.method5717();
			}
		} else if (this.aBoolean194) {
			if (this.anInt3561 < 0) {
				if (this.anInt3549 >= local76) {
					return;
				}
				this.anInt3549 = local76 + local76 - this.anInt3549 - 1;
				this.anInt3561 = -this.anInt3561;
			}
			while (this.anInt3549 >= local81) {
				this.anInt3549 = local81 + local81 - this.anInt3549 - 1;
				this.anInt3561 = -this.anInt3561;
				if (this.anInt3549 >= local76) {
					return;
				}
				this.anInt3549 = local76 + local76 - this.anInt3549 - 1;
				this.anInt3561 = -this.anInt3561;
			}
		} else if (this.anInt3561 < 0) {
			if (this.anInt3549 < local76) {
				this.anInt3549 = local81 - (local81 - 1 - this.anInt3549) % local91 - 1;
			}
		} else if (this.anInt3549 >= local81) {
			this.anInt3549 = local76 + (this.anInt3549 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "()V")
	private void method2796() {
		if (this.anInt3555 == 0) {
			return;
		}
		if (this.anInt3548 == Integer.MIN_VALUE) {
			this.anInt3548 = 0;
		}
		this.anInt3555 = 0;
		this.method2810();
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5109(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3548 == 0 && this.anInt3555 == 0) {
			this.method5108(arg2);
			return;
		}
		@Pc(13) Class3_Sub17_Sub1 local13 = (Class3_Sub17_Sub1) super.aClass3_Sub17_5;
		@Pc(18) int local18 = this.anInt3551 << 8;
		@Pc(23) int local23 = this.anInt3553 << 8;
		@Pc(29) int local29 = local13.aByteArray48.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3558 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3549 < 0) {
			if (this.anInt3561 <= 0) {
				this.method2796();
				this.method5717();
				return;
			}
			this.anInt3549 = 0;
		}
		if (this.anInt3549 >= local29) {
			if (this.anInt3561 >= 0) {
				this.method2796();
				this.method5717();
				return;
			}
			this.anInt3549 = local29 - 1;
		}
		if (this.anInt3558 >= 0) {
			if (this.anInt3558 > 0) {
				if (this.aBoolean194) {
					label130: {
						if (this.anInt3561 < 0) {
							local40 = this.method2786(arg0, arg1, local18, local44, local13.aByteArray48[this.anInt3551]);
							if (this.anInt3549 >= local18) {
								return;
							}
							this.anInt3549 = local18 + local18 - this.anInt3549 - 1;
							this.anInt3561 = -this.anInt3561;
							if (--this.anInt3558 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2808(arg0, local40, local23, local44, local13.aByteArray48[this.anInt3553 - 1]);
							if (this.anInt3549 < local23) {
								return;
							}
							this.anInt3549 = local23 + local23 - this.anInt3549 - 1;
							this.anInt3561 = -this.anInt3561;
							if (--this.anInt3558 == 0) {
								break;
							}
							local40 = this.method2786(arg0, local40, local18, local44, local13.aByteArray48[this.anInt3551]);
							if (this.anInt3549 >= local18) {
								return;
							}
							this.anInt3549 = local18 + local18 - this.anInt3549 - 1;
							this.anInt3561 = -this.anInt3561;
						} while (--this.anInt3558 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3561 < 0) {
						while (true) {
							local40 = this.method2786(arg0, local40, local18, local44, local13.aByteArray48[this.anInt3553 - 1]);
							if (this.anInt3549 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3549 - 1) / local33;
							if (local416 >= this.anInt3558) {
								this.anInt3549 += local33 * this.anInt3558;
								this.anInt3558 = 0;
								break;
							}
							this.anInt3549 += local33 * local416;
							this.anInt3558 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2808(arg0, local40, local23, local44, local13.aByteArray48[this.anInt3551]);
							if (this.anInt3549 < local23) {
								return;
							}
							local416 = (this.anInt3549 - local18) / local33;
							if (local416 >= this.anInt3558) {
								this.anInt3549 -= local33 * this.anInt3558;
								this.anInt3558 = 0;
								break;
							}
							this.anInt3549 -= local33 * local416;
							this.anInt3558 -= local416;
						}
					}
				}
			}
			if (this.anInt3561 < 0) {
				this.method2786(arg0, local40, 0, local44, 0);
				if (this.anInt3549 < 0) {
					this.anInt3549 = -1;
					this.method2796();
					this.method5717();
					return;
				}
			} else {
				this.method2808(arg0, local40, local29, local44, 0);
				if (this.anInt3549 >= local29) {
					this.anInt3549 = local29;
					this.method2796();
					this.method5717();
				}
			}
		} else if (this.aBoolean194) {
			if (this.anInt3561 < 0) {
				local40 = this.method2786(arg0, arg1, local18, local44, local13.aByteArray48[this.anInt3551]);
				if (this.anInt3549 >= local18) {
					return;
				}
				this.anInt3549 = local18 + local18 - this.anInt3549 - 1;
				this.anInt3561 = -this.anInt3561;
			}
			while (true) {
				local40 = this.method2808(arg0, local40, local23, local44, local13.aByteArray48[this.anInt3553 - 1]);
				if (this.anInt3549 < local23) {
					return;
				}
				this.anInt3549 = local23 + local23 - this.anInt3549 - 1;
				this.anInt3561 = -this.anInt3561;
				local40 = this.method2786(arg0, local40, local18, local44, local13.aByteArray48[this.anInt3551]);
				if (this.anInt3549 >= local18) {
					return;
				}
				this.anInt3549 = local18 + local18 - this.anInt3549 - 1;
				this.anInt3561 = -this.anInt3561;
			}
		} else if (this.anInt3561 < 0) {
			while (true) {
				local40 = this.method2786(arg0, local40, local18, local44, local13.aByteArray48[this.anInt3553 - 1]);
				if (this.anInt3549 >= local18) {
					return;
				}
				this.anInt3549 = local23 - (local23 - 1 - this.anInt3549) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2808(arg0, local40, local23, local44, local13.aByteArray48[this.anInt3551]);
				if (this.anInt3549 < local23) {
					return;
				}
				this.anInt3549 = local18 + (this.anInt3549 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	public synchronized void method2797(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2818();
			this.method5717();
		} else if (this.anInt3554 == 0 && this.anInt3550 == 0) {
			this.anInt3555 = 0;
			this.anInt3548 = 0;
			this.anInt3560 = 0;
			this.method5717();
		} else {
			@Pc(31) int local31 = -this.anInt3560;
			if (this.anInt3560 > local31) {
				local31 = this.anInt3560;
			}
			if (-this.anInt3554 > local31) {
				local31 = -this.anInt3554;
			}
			if (this.anInt3554 > local31) {
				local31 = this.anInt3554;
			}
			if (-this.anInt3550 > local31) {
				local31 = -this.anInt3550;
			}
			if (this.anInt3550 > local31) {
				local31 = this.anInt3550;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3555 = arg0;
			this.anInt3548 = Integer.MIN_VALUE;
			this.anInt3552 = -this.anInt3560 / arg0;
			this.anInt3559 = -this.anInt3554 / arg0;
			this.anInt3556 = -this.anInt3550 / arg0;
		}
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V")
	public synchronized void method2801(@OriginalArg(0) int arg0) {
		if (this.anInt3561 < 0) {
			this.anInt3561 = -arg0;
		} else {
			this.anInt3561 = arg0;
		}
	}

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "()Z")
	private boolean method2802() {
		@Pc(2) int local2 = this.anInt3548;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static364.method2816(local2, this.anInt3557);
			local8 = Static364.method2815(local2, this.anInt3557);
		}
		if (this.anInt3560 != local2 || this.anInt3554 != local10 || this.anInt3550 != local8) {
			if (this.anInt3560 < local2) {
				this.anInt3552 = 1;
				this.anInt3555 = local2 - this.anInt3560;
			} else if (this.anInt3560 > local2) {
				this.anInt3552 = -1;
				this.anInt3555 = this.anInt3560 - local2;
			} else {
				this.anInt3552 = 0;
			}
			if (this.anInt3554 < local10) {
				this.anInt3559 = 1;
				if (this.anInt3555 == 0 || this.anInt3555 > local10 - this.anInt3554) {
					this.anInt3555 = local10 - this.anInt3554;
				}
			} else if (this.anInt3554 > local10) {
				this.anInt3559 = -1;
				if (this.anInt3555 == 0 || this.anInt3555 > this.anInt3554 - local10) {
					this.anInt3555 = this.anInt3554 - local10;
				}
			} else {
				this.anInt3559 = 0;
			}
			if (this.anInt3550 < local8) {
				this.anInt3556 = 1;
				if (this.anInt3555 == 0 || this.anInt3555 > local8 - this.anInt3550) {
					this.anInt3555 = local8 - this.anInt3550;
				}
			} else if (this.anInt3550 > local8) {
				this.anInt3556 = -1;
				if (this.anInt3555 == 0 || this.anInt3555 > this.anInt3550 - local8) {
					this.anInt3555 = this.anInt3550 - local8;
				}
			} else {
				this.anInt3556 = 0;
			}
			return false;
		} else if (this.anInt3548 == Integer.MIN_VALUE) {
			this.anInt3548 = 0;
			this.anInt3560 = this.anInt3554 = this.anInt3550 = 0;
			this.method5717();
			return true;
		} else {
			this.method2810();
			return false;
		}
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
	public synchronized void method2804(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3549 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V")
	public synchronized void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2783(arg0, arg1, this.method2782());
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "([IIIII)I")
	private int method2808(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3555 <= 0) {
				if (this.anInt3561 == 256 && (this.anInt3549 & 0xFF) == 0) {
					if (Static272.aBoolean339) {
						return Static364.method2792(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3554, this.anInt3550, arg3, arg2, this);
					}
					return Static364.method2807(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3560, arg3, arg2, this);
				}
				if (Static272.aBoolean339) {
					return Static364.method2784(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3554, this.anInt3550, arg3, arg2, this, this.anInt3561, arg4);
				}
				return Static364.method2820(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3560, arg3, arg2, this, this.anInt3561, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3555;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3555 += arg1;
			if (this.anInt3561 == 256 && (this.anInt3549 & 0xFF) == 0) {
				if (Static272.aBoolean339) {
					arg1 = Static364.method2787(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3554, this.anInt3550, this.anInt3559, this.anInt3556, local5, arg2, this);
				} else {
					arg1 = Static364.method2817(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3560, this.anInt3552, local5, arg2, this);
				}
			} else if (Static272.aBoolean339) {
				arg1 = Static364.method2814(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3554, this.anInt3550, this.anInt3559, this.anInt3556, local5, arg2, this, this.anInt3561, arg4);
			} else {
				arg1 = Static364.method2812(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48, arg0, this.anInt3549, arg1, this.anInt3560, this.anInt3552, local5, arg2, this, this.anInt3561, arg4);
			}
			this.anInt3555 -= arg1;
			if (this.anInt3555 != 0) {
				return arg1;
			}
		} while (!this.method2802());
		return arg3;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)V")
	private synchronized void method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3548 = arg0;
		this.anInt3557 = arg1;
		this.anInt3555 = 0;
		this.method2810();
	}

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "()V")
	private void method2810() {
		this.anInt3560 = this.anInt3548;
		this.anInt3554 = Static364.method2816(this.anInt3548, this.anInt3557);
		this.anInt3550 = Static364.method2815(this.anInt3548, this.anInt3557);
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V")
	public synchronized void method2811(@OriginalArg(0) int arg0) {
		this.anInt3558 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "()I")
	@Override
	public int method5112() {
		@Pc(6) int local6 = this.anInt3560 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3558 == 0) {
			local6 -= local6 * this.anInt3549 / (((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48.length << 8);
		} else if (this.anInt3558 >= 0) {
			local6 -= local6 * this.anInt3551 / ((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V")
	public synchronized void method2813(@OriginalArg(0) int arg0) {
		this.method2809(arg0 << 6, this.method2782());
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "()Lclient!mq;")
	@Override
	public Class3_Sub2 method5110() {
		return null;
	}

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "(I)V")
	private synchronized void method2818() {
		this.method2809(0, this.method2782());
	}

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "()Z")
	public boolean method2819() {
		return this.anInt3549 < 0 || this.anInt3549 >= ((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray48.length << 8;
	}
}
