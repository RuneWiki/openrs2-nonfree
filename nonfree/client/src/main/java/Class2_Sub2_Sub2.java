import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
	public int anInt3707;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
	public int anInt3709;

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
	public int anInt3710;

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
	private int anInt3711;

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
	private int anInt3713;

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
	public int anInt3718;

	@OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
	public int anInt3719;

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
	public int anInt3720;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
	private final int anInt3712;

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
	private final int anInt3714;

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "Z")
	private final boolean aBoolean286;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
	private int anInt3708;

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
	private int anInt3715;

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
	private int anInt3716;

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
	public int anInt3717;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!qq;II)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) Class2_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub15_5 = arg0;
		this.anInt3712 = arg0.anInt4954;
		this.anInt3714 = arg0.anInt4955;
		this.aBoolean286 = arg0.aBoolean379;
		this.anInt3708 = arg1;
		this.anInt3715 = arg2;
		this.anInt3716 = 8192;
		this.anInt3717 = 0;
		this.method3406();
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!qq;III)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) Class2_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub15_5 = arg0;
		this.anInt3712 = arg0.anInt4954;
		this.anInt3714 = arg0.anInt4955;
		this.aBoolean286 = arg0.aBoolean379;
		this.anInt3708 = arg1;
		this.anInt3715 = arg2;
		this.anInt3716 = arg3;
		this.anInt3717 = 0;
		this.method3406();
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "()Lclient!oe;")
	@Override
	public Class2_Sub2 method5266() {
		return null;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5271(@OriginalArg(0) int arg0) {
		if (this.anInt3713 > 0) {
			if (arg0 >= this.anInt3713) {
				if (this.anInt3715 == Integer.MIN_VALUE) {
					this.anInt3715 = 0;
					this.anInt3720 = this.anInt3719 = this.anInt3710 = 0;
					this.method5617();
					arg0 = this.anInt3713;
				}
				this.anInt3713 = 0;
				this.method3406();
			} else {
				this.anInt3720 += this.anInt3709 * arg0;
				this.anInt3719 += this.anInt3707 * arg0;
				this.anInt3710 += this.anInt3718 * arg0;
				this.anInt3713 -= arg0;
			}
		}
		@Pc(71) Class2_Sub15_Sub1 local71 = (Class2_Sub15_Sub1) super.aClass2_Sub15_5;
		@Pc(76) int local76 = this.anInt3712 << 8;
		@Pc(81) int local81 = this.anInt3714 << 8;
		@Pc(87) int local87 = local71.aByteArray99.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3711 = 0;
		}
		if (this.anInt3717 < 0) {
			if (this.anInt3708 <= 0) {
				this.method3400();
				this.method5617();
				return;
			}
			this.anInt3717 = 0;
		}
		if (this.anInt3717 >= local87) {
			if (this.anInt3708 >= 0) {
				this.method3400();
				this.method5617();
				return;
			}
			this.anInt3717 = local87 - 1;
		}
		this.anInt3717 += this.anInt3708 * arg0;
		if (this.anInt3711 >= 0) {
			if (this.anInt3711 > 0) {
				if (this.aBoolean286) {
					label125: {
						if (this.anInt3708 < 0) {
							if (this.anInt3717 >= local76) {
								return;
							}
							this.anInt3717 = local76 + local76 - this.anInt3717 - 1;
							this.anInt3708 = -this.anInt3708;
							if (--this.anInt3711 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3717 < local81) {
								return;
							}
							this.anInt3717 = local81 + local81 - this.anInt3717 - 1;
							this.anInt3708 = -this.anInt3708;
							if (--this.anInt3711 == 0) {
								break;
							}
							if (this.anInt3717 >= local76) {
								return;
							}
							this.anInt3717 = local76 + local76 - this.anInt3717 - 1;
							this.anInt3708 = -this.anInt3708;
						} while (--this.anInt3711 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3708 < 0) {
						if (this.anInt3717 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3717 - 1) / local91;
						if (local361 < this.anInt3711) {
							this.anInt3717 += local91 * local361;
							this.anInt3711 -= local361;
							return;
						}
						this.anInt3717 += local91 * this.anInt3711;
						this.anInt3711 = 0;
					} else if (this.anInt3717 >= local81) {
						local361 = (this.anInt3717 - local76) / local91;
						if (local361 < this.anInt3711) {
							this.anInt3717 -= local91 * local361;
							this.anInt3711 -= local361;
							return;
						}
						this.anInt3717 -= local91 * this.anInt3711;
						this.anInt3711 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3708 < 0) {
				if (this.anInt3717 < 0) {
					this.anInt3717 = -1;
					this.method3400();
					this.method5617();
					return;
				}
			} else if (this.anInt3717 >= local87) {
				this.anInt3717 = local87;
				this.method3400();
				this.method5617();
			}
		} else if (this.aBoolean286) {
			if (this.anInt3708 < 0) {
				if (this.anInt3717 >= local76) {
					return;
				}
				this.anInt3717 = local76 + local76 - this.anInt3717 - 1;
				this.anInt3708 = -this.anInt3708;
			}
			while (this.anInt3717 >= local81) {
				this.anInt3717 = local81 + local81 - this.anInt3717 - 1;
				this.anInt3708 = -this.anInt3708;
				if (this.anInt3717 >= local76) {
					return;
				}
				this.anInt3717 = local76 + local76 - this.anInt3717 - 1;
				this.anInt3708 = -this.anInt3708;
			}
		} else if (this.anInt3708 < 0) {
			if (this.anInt3717 < local76) {
				this.anInt3717 = local81 - (local81 - 1 - this.anInt3717) % local91 - 1;
			}
		} else if (this.anInt3717 >= local81) {
			this.anInt3717 = local76 + (this.anInt3717 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)V")
	public synchronized void method3390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3429(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static402.method3409(arg1, arg2);
		@Pc(14) int local14 = Static402.method3393(arg1, arg2);
		if (this.anInt3719 == local10 && this.anInt3710 == local14) {
			this.anInt3713 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3720;
		if (this.anInt3720 - arg1 > local31) {
			local31 = this.anInt3720 - arg1;
		}
		if (local10 - this.anInt3719 > local31) {
			local31 = local10 - this.anInt3719;
		}
		if (this.anInt3719 - local10 > local31) {
			local31 = this.anInt3719 - local10;
		}
		if (local14 - this.anInt3710 > local31) {
			local31 = local14 - this.anInt3710;
		}
		if (this.anInt3710 - local14 > local31) {
			local31 = this.anInt3710 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3713 = arg0;
		this.anInt3715 = arg1;
		this.anInt3716 = arg2;
		this.anInt3709 = (arg1 - this.anInt3720) / arg0;
		this.anInt3707 = (local10 - this.anInt3719) / arg0;
		this.anInt3718 = (local14 - this.anInt3710) / arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()I")
	@Override
	public int method5265() {
		@Pc(6) int local6 = this.anInt3720 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3711 == 0) {
			local6 -= local6 * this.anInt3717 / (((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99.length << 8);
		} else if (this.anInt3711 >= 0) {
			local6 -= local6 * this.anInt3712 / ((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "()I")
	public synchronized int method3396() {
		return this.anInt3716 < 0 ? -1 : this.anInt3716;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
	public synchronized void method3397() {
		this.anInt3708 = (this.anInt3708 ^ this.anInt3708 >> 31) + (this.anInt3708 >>> 31);
		this.anInt3708 = -this.anInt3708;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
	public synchronized void method3398(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3421();
			this.method5617();
		} else if (this.anInt3719 == 0 && this.anInt3710 == 0) {
			this.anInt3713 = 0;
			this.anInt3715 = 0;
			this.anInt3720 = 0;
			this.method5617();
		} else {
			@Pc(31) int local31 = -this.anInt3720;
			if (this.anInt3720 > local31) {
				local31 = this.anInt3720;
			}
			if (-this.anInt3719 > local31) {
				local31 = -this.anInt3719;
			}
			if (this.anInt3719 > local31) {
				local31 = this.anInt3719;
			}
			if (-this.anInt3710 > local31) {
				local31 = -this.anInt3710;
			}
			if (this.anInt3710 > local31) {
				local31 = this.anInt3710;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3713 = arg0;
			this.anInt3715 = Integer.MIN_VALUE;
			this.anInt3709 = -this.anInt3720 / arg0;
			this.anInt3707 = -this.anInt3719 / arg0;
			this.anInt3718 = -this.anInt3710 / arg0;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([IIIII)I")
	private int method3399(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3713 <= 0) {
				if (this.anInt3708 == -256 && (this.anInt3717 & 0xFF) == 0) {
					if (Static44.aBoolean66) {
						return Static402.method3422(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3719, this.anInt3710, arg3, arg2, this);
					}
					return Static402.method3411(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3720, arg3, arg2, this);
				}
				if (Static44.aBoolean66) {
					return Static402.method3413(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3719, this.anInt3710, arg3, arg2, this, this.anInt3708, arg4);
				}
				return Static402.method3401(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3720, arg3, arg2, this, this.anInt3708, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3713;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3713 += arg1;
			if (this.anInt3708 == -256 && (this.anInt3717 & 0xFF) == 0) {
				if (Static44.aBoolean66) {
					arg1 = Static402.method3423(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3719, this.anInt3710, this.anInt3707, this.anInt3718, local5, arg2, this);
				} else {
					arg1 = Static402.method3417(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3720, this.anInt3709, local5, arg2, this);
				}
			} else if (Static44.aBoolean66) {
				arg1 = Static402.method3425(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3719, this.anInt3710, this.anInt3707, this.anInt3718, local5, arg2, this, this.anInt3708, arg4);
			} else {
				arg1 = Static402.method3424(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3720, this.anInt3709, local5, arg2, this, this.anInt3708, arg4);
			}
			this.anInt3713 -= arg1;
			if (this.anInt3713 != 0) {
				return arg1;
			}
		} while (!this.method3415());
		return arg3;
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "()V")
	private void method3400() {
		if (this.anInt3713 == 0) {
			return;
		}
		if (this.anInt3715 == Integer.MIN_VALUE) {
			this.anInt3715 = 0;
		}
		this.anInt3713 = 0;
		this.method3406();
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
	public synchronized void method3403(@OriginalArg(0) int arg0) {
		if (this.anInt3708 < 0) {
			this.anInt3708 = -arg0;
		} else {
			this.anInt3708 = arg0;
		}
	}

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "()Z")
	public boolean method3404() {
		return this.anInt3717 < 0 || this.anInt3717 >= ((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99.length << 8;
	}

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "()I")
	public synchronized int method3405() {
		return this.anInt3708 < 0 ? -this.anInt3708 : this.anInt3708;
	}

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "()V")
	private void method3406() {
		this.anInt3720 = this.anInt3715;
		this.anInt3719 = Static402.method3409(this.anInt3715, this.anInt3716);
		this.anInt3710 = Static402.method3393(this.anInt3715, this.anInt3716);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "([IIIII)I")
	private int method3407(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3713 <= 0) {
				if (this.anInt3708 == 256 && (this.anInt3717 & 0xFF) == 0) {
					if (Static44.aBoolean66) {
						return Static402.method3408(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3719, this.anInt3710, arg3, arg2, this);
					}
					return Static402.method3426(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3720, arg3, arg2, this);
				}
				if (Static44.aBoolean66) {
					return Static402.method3392(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3719, this.anInt3710, arg3, arg2, this, this.anInt3708, arg4);
				}
				return Static402.method3416(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3720, arg3, arg2, this, this.anInt3708, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3713;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3713 += arg1;
			if (this.anInt3708 == 256 && (this.anInt3717 & 0xFF) == 0) {
				if (Static44.aBoolean66) {
					arg1 = Static402.method3402(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3719, this.anInt3710, this.anInt3707, this.anInt3718, local5, arg2, this);
				} else {
					arg1 = Static402.method3391(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3720, this.anInt3709, local5, arg2, this);
				}
			} else if (Static44.aBoolean66) {
				arg1 = Static402.method3428(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3719, this.anInt3710, this.anInt3707, this.anInt3718, local5, arg2, this, this.anInt3708, arg4);
			} else {
				arg1 = Static402.method3395(((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99, arg0, this.anInt3717, arg1, this.anInt3720, this.anInt3709, local5, arg2, this, this.anInt3708, arg4);
			}
			this.anInt3713 -= arg1;
			if (this.anInt3713 != 0) {
				return arg1;
			}
		} while (!this.method3415());
		return arg3;
	}

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "(I)V")
	public synchronized void method3410(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub15_Sub1) super.aClass2_Sub15_5).aByteArray99.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3717 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "()Lclient!oe;")
	@Override
	public Class2_Sub2 method5268() {
		return null;
	}

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "(I)V")
	public synchronized void method3412(@OriginalArg(0) int arg0) {
		this.method3429(arg0 << 6, this.method3396());
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5269(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3715 == 0 && this.anInt3713 == 0) {
			this.method5271(arg2);
			return;
		}
		@Pc(13) Class2_Sub15_Sub1 local13 = (Class2_Sub15_Sub1) super.aClass2_Sub15_5;
		@Pc(18) int local18 = this.anInt3712 << 8;
		@Pc(23) int local23 = this.anInt3714 << 8;
		@Pc(29) int local29 = local13.aByteArray99.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3711 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3717 < 0) {
			if (this.anInt3708 <= 0) {
				this.method3400();
				this.method5617();
				return;
			}
			this.anInt3717 = 0;
		}
		if (this.anInt3717 >= local29) {
			if (this.anInt3708 >= 0) {
				this.method3400();
				this.method5617();
				return;
			}
			this.anInt3717 = local29 - 1;
		}
		if (this.anInt3711 >= 0) {
			if (this.anInt3711 > 0) {
				if (this.aBoolean286) {
					label130: {
						if (this.anInt3708 < 0) {
							local40 = this.method3399(arg0, arg1, local18, local44, local13.aByteArray99[this.anInt3712]);
							if (this.anInt3717 >= local18) {
								return;
							}
							this.anInt3717 = local18 + local18 - this.anInt3717 - 1;
							this.anInt3708 = -this.anInt3708;
							if (--this.anInt3711 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3407(arg0, local40, local23, local44, local13.aByteArray99[this.anInt3714 - 1]);
							if (this.anInt3717 < local23) {
								return;
							}
							this.anInt3717 = local23 + local23 - this.anInt3717 - 1;
							this.anInt3708 = -this.anInt3708;
							if (--this.anInt3711 == 0) {
								break;
							}
							local40 = this.method3399(arg0, local40, local18, local44, local13.aByteArray99[this.anInt3712]);
							if (this.anInt3717 >= local18) {
								return;
							}
							this.anInt3717 = local18 + local18 - this.anInt3717 - 1;
							this.anInt3708 = -this.anInt3708;
						} while (--this.anInt3711 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3708 < 0) {
						while (true) {
							local40 = this.method3399(arg0, local40, local18, local44, local13.aByteArray99[this.anInt3714 - 1]);
							if (this.anInt3717 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3717 - 1) / local33;
							if (local416 >= this.anInt3711) {
								this.anInt3717 += local33 * this.anInt3711;
								this.anInt3711 = 0;
								break;
							}
							this.anInt3717 += local33 * local416;
							this.anInt3711 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3407(arg0, local40, local23, local44, local13.aByteArray99[this.anInt3712]);
							if (this.anInt3717 < local23) {
								return;
							}
							local416 = (this.anInt3717 - local18) / local33;
							if (local416 >= this.anInt3711) {
								this.anInt3717 -= local33 * this.anInt3711;
								this.anInt3711 = 0;
								break;
							}
							this.anInt3717 -= local33 * local416;
							this.anInt3711 -= local416;
						}
					}
				}
			}
			if (this.anInt3708 < 0) {
				this.method3399(arg0, local40, 0, local44, 0);
				if (this.anInt3717 < 0) {
					this.anInt3717 = -1;
					this.method3400();
					this.method5617();
					return;
				}
			} else {
				this.method3407(arg0, local40, local29, local44, 0);
				if (this.anInt3717 >= local29) {
					this.anInt3717 = local29;
					this.method3400();
					this.method5617();
				}
			}
		} else if (this.aBoolean286) {
			if (this.anInt3708 < 0) {
				local40 = this.method3399(arg0, arg1, local18, local44, local13.aByteArray99[this.anInt3712]);
				if (this.anInt3717 >= local18) {
					return;
				}
				this.anInt3717 = local18 + local18 - this.anInt3717 - 1;
				this.anInt3708 = -this.anInt3708;
			}
			while (true) {
				local40 = this.method3407(arg0, local40, local23, local44, local13.aByteArray99[this.anInt3714 - 1]);
				if (this.anInt3717 < local23) {
					return;
				}
				this.anInt3717 = local23 + local23 - this.anInt3717 - 1;
				this.anInt3708 = -this.anInt3708;
				local40 = this.method3399(arg0, local40, local18, local44, local13.aByteArray99[this.anInt3712]);
				if (this.anInt3717 >= local18) {
					return;
				}
				this.anInt3717 = local18 + local18 - this.anInt3717 - 1;
				this.anInt3708 = -this.anInt3708;
			}
		} else if (this.anInt3708 < 0) {
			while (true) {
				local40 = this.method3399(arg0, local40, local18, local44, local13.aByteArray99[this.anInt3714 - 1]);
				if (this.anInt3717 >= local18) {
					return;
				}
				this.anInt3717 = local23 - (local23 - 1 - this.anInt3717) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3407(arg0, local40, local23, local44, local13.aByteArray99[this.anInt3712]);
				if (this.anInt3717 < local23) {
					return;
				}
				this.anInt3717 = local18 + (this.anInt3717 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "()I")
	public synchronized int method3414() {
		return this.anInt3715 == Integer.MIN_VALUE ? 0 : this.anInt3715;
	}

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "()Z")
	private boolean method3415() {
		@Pc(2) int local2 = this.anInt3715;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static402.method3409(local2, this.anInt3716);
			local8 = Static402.method3393(local2, this.anInt3716);
		}
		if (this.anInt3720 != local2 || this.anInt3719 != local10 || this.anInt3710 != local8) {
			if (this.anInt3720 < local2) {
				this.anInt3709 = 1;
				this.anInt3713 = local2 - this.anInt3720;
			} else if (this.anInt3720 > local2) {
				this.anInt3709 = -1;
				this.anInt3713 = this.anInt3720 - local2;
			} else {
				this.anInt3709 = 0;
			}
			if (this.anInt3719 < local10) {
				this.anInt3707 = 1;
				if (this.anInt3713 == 0 || this.anInt3713 > local10 - this.anInt3719) {
					this.anInt3713 = local10 - this.anInt3719;
				}
			} else if (this.anInt3719 > local10) {
				this.anInt3707 = -1;
				if (this.anInt3713 == 0 || this.anInt3713 > this.anInt3719 - local10) {
					this.anInt3713 = this.anInt3719 - local10;
				}
			} else {
				this.anInt3707 = 0;
			}
			if (this.anInt3710 < local8) {
				this.anInt3718 = 1;
				if (this.anInt3713 == 0 || this.anInt3713 > local8 - this.anInt3710) {
					this.anInt3713 = local8 - this.anInt3710;
				}
			} else if (this.anInt3710 > local8) {
				this.anInt3718 = -1;
				if (this.anInt3713 == 0 || this.anInt3713 > this.anInt3710 - local8) {
					this.anInt3713 = this.anInt3710 - local8;
				}
			} else {
				this.anInt3718 = 0;
			}
			return false;
		} else if (this.anInt3715 == Integer.MIN_VALUE) {
			this.anInt3715 = 0;
			this.anInt3720 = this.anInt3719 = this.anInt3710 = 0;
			this.method5617();
			return true;
		} else {
			this.method3406();
			return false;
		}
	}

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "()Z")
	public boolean method3418() {
		return this.anInt3713 != 0;
	}

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "(I)V")
	public synchronized void method3419(@OriginalArg(0) int arg0) {
		this.anInt3711 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "(I)V")
	private synchronized void method3421() {
		this.method3429(0, this.method3396());
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "()I")
	@Override
	public int method5267() {
		return this.anInt3715 == 0 && this.anInt3713 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(II)V")
	public synchronized void method3427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3390(arg0, arg1, this.method3396());
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(II)V")
	private synchronized void method3429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3715 = arg0;
		this.anInt3716 = arg1;
		this.anInt3713 = 0;
		this.method3406();
	}
}
