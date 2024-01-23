import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class1_Sub12_Sub4 extends Class1_Sub12 {

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	public int anInt3826;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
	public int anInt3828;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
	public int anInt3830;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	public int anInt3832;

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
	public int anInt3833;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
	public int anInt3834;

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
	private int anInt3835;

	@OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
	private int anInt3838;

	@OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
	private int anInt3839;

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
	private int anInt3837;

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "Z")
	private boolean aBoolean174;

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
	private int anInt3831;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
	private int anInt3827;

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
	private int anInt3829;

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
	public int anInt3836;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!qa;II)V")
	public Class1_Sub12_Sub4(@OriginalArg(0) Class1_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub15_5 = arg0;
		this.anInt3839 = arg0.anInt3460;
		this.anInt3837 = arg0.anInt3459;
		this.aBoolean174 = arg0.aBoolean148;
		this.anInt3831 = arg1;
		this.anInt3827 = arg2;
		this.anInt3829 = 8192;
		this.anInt3836 = 0;
		this.method3058();
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!qa;III)V")
	public Class1_Sub12_Sub4(@OriginalArg(0) Class1_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub15_5 = arg0;
		this.anInt3839 = arg0.anInt3460;
		this.anInt3837 = arg0.anInt3459;
		this.aBoolean174 = arg0.aBoolean148;
		this.anInt3831 = arg1;
		this.anInt3827 = arg2;
		this.anInt3829 = arg3;
		this.anInt3836 = 0;
		this.method3058();
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V")
	public synchronized void method3041(@OriginalArg(0) int arg0) {
		this.anInt3835 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method3037(@OriginalArg(0) int arg0) {
		if (this.anInt3838 > 0) {
			if (arg0 >= this.anInt3838) {
				if (this.anInt3827 == Integer.MIN_VALUE) {
					this.anInt3827 = 0;
					this.anInt3833 = this.anInt3830 = this.anInt3826 = 0;
					this.method3525();
					arg0 = this.anInt3838;
				}
				this.anInt3838 = 0;
				this.method3058();
			} else {
				this.anInt3833 += this.anInt3834 * arg0;
				this.anInt3830 += this.anInt3832 * arg0;
				this.anInt3826 += this.anInt3828 * arg0;
				this.anInt3838 -= arg0;
			}
		}
		@Pc(71) Class1_Sub15_Sub1 local71 = (Class1_Sub15_Sub1) super.aClass1_Sub15_5;
		@Pc(76) int local76 = this.anInt3839 << 8;
		@Pc(81) int local81 = this.anInt3837 << 8;
		@Pc(87) int local87 = local71.aByteArray49.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3835 = 0;
		}
		if (this.anInt3836 < 0) {
			if (this.anInt3831 <= 0) {
				this.method3049();
				this.method3525();
				return;
			}
			this.anInt3836 = 0;
		}
		if (this.anInt3836 >= local87) {
			if (this.anInt3831 >= 0) {
				this.method3049();
				this.method3525();
				return;
			}
			this.anInt3836 = local87 - 1;
		}
		this.anInt3836 += this.anInt3831 * arg0;
		if (this.anInt3835 >= 0) {
			if (this.anInt3835 > 0) {
				if (this.aBoolean174) {
					label125: {
						if (this.anInt3831 < 0) {
							if (this.anInt3836 >= local76) {
								return;
							}
							this.anInt3836 = local76 + local76 - this.anInt3836 - 1;
							this.anInt3831 = -this.anInt3831;
							if (--this.anInt3835 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3836 < local81) {
								return;
							}
							this.anInt3836 = local81 + local81 - this.anInt3836 - 1;
							this.anInt3831 = -this.anInt3831;
							if (--this.anInt3835 == 0) {
								break;
							}
							if (this.anInt3836 >= local76) {
								return;
							}
							this.anInt3836 = local76 + local76 - this.anInt3836 - 1;
							this.anInt3831 = -this.anInt3831;
						} while (--this.anInt3835 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3831 < 0) {
						if (this.anInt3836 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3836 - 1) / local91;
						if (local361 < this.anInt3835) {
							this.anInt3836 += local91 * local361;
							this.anInt3835 -= local361;
							return;
						}
						this.anInt3836 += local91 * this.anInt3835;
						this.anInt3835 = 0;
					} else if (this.anInt3836 >= local81) {
						local361 = (this.anInt3836 - local76) / local91;
						if (local361 < this.anInt3835) {
							this.anInt3836 -= local91 * local361;
							this.anInt3835 -= local361;
							return;
						}
						this.anInt3836 -= local91 * this.anInt3835;
						this.anInt3835 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3831 < 0) {
				if (this.anInt3836 < 0) {
					this.anInt3836 = -1;
					this.method3049();
					this.method3525();
					return;
				}
			} else if (this.anInt3836 >= local87) {
				this.anInt3836 = local87;
				this.method3049();
				this.method3525();
			}
		} else if (this.aBoolean174) {
			if (this.anInt3831 < 0) {
				if (this.anInt3836 >= local76) {
					return;
				}
				this.anInt3836 = local76 + local76 - this.anInt3836 - 1;
				this.anInt3831 = -this.anInt3831;
			}
			while (this.anInt3836 >= local81) {
				this.anInt3836 = local81 + local81 - this.anInt3836 - 1;
				this.anInt3831 = -this.anInt3831;
				if (this.anInt3836 >= local76) {
					return;
				}
				this.anInt3836 = local76 + local76 - this.anInt3836 - 1;
				this.anInt3831 = -this.anInt3831;
			}
		} else if (this.anInt3831 < 0) {
			if (this.anInt3836 < local76) {
				this.anInt3836 = local81 - (local81 - 1 - this.anInt3836) % local91 - 1;
			}
		} else if (this.anInt3836 >= local81) {
			this.anInt3836 = local76 + (this.anInt3836 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "()I")
	public synchronized int method3043() {
		return this.anInt3827 == Integer.MIN_VALUE ? 0 : this.anInt3827;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	private synchronized void method3046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3827 = arg0;
		this.anInt3829 = arg1;
		this.anInt3838 = 0;
		this.method3058();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "()I")
	@Override
	public int method3033() {
		return this.anInt3827 == 0 && this.anInt3838 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "()V")
	private void method3049() {
		if (this.anInt3838 == 0) {
			return;
		}
		if (this.anInt3827 == Integer.MIN_VALUE) {
			this.anInt3827 = 0;
		}
		this.anInt3838 = 0;
		this.method3058();
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "()Lclient!ge;")
	@Override
	public Class1_Sub12 method3038() {
		return null;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([IIIII)I")
	private int method3051(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3838 <= 0) {
				if (this.anInt3831 == -256 && (this.anInt3836 & 0xFF) == 0) {
					if (Static130.aBoolean114) {
						return Static245.method3060(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3830, this.anInt3826, arg3, arg2, this);
					}
					return Static245.method3047(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3833, arg3, arg2, this);
				}
				if (Static130.aBoolean114) {
					return Static245.method3074(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3830, this.anInt3826, arg3, arg2, this, this.anInt3831, arg4);
				}
				return Static245.method3070(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3833, arg3, arg2, this, this.anInt3831, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3838;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3838 += arg1;
			if (this.anInt3831 == -256 && (this.anInt3836 & 0xFF) == 0) {
				if (Static130.aBoolean114) {
					arg1 = Static245.method3040(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3830, this.anInt3826, this.anInt3832, this.anInt3828, local5, arg2, this);
				} else {
					arg1 = Static245.method3069(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3833, this.anInt3834, local5, arg2, this);
				}
			} else if (Static130.aBoolean114) {
				arg1 = Static245.method3050(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3830, this.anInt3826, this.anInt3832, this.anInt3828, local5, arg2, this, this.anInt3831, arg4);
			} else {
				arg1 = Static245.method3044(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3833, this.anInt3834, local5, arg2, this, this.anInt3831, arg4);
			}
			this.anInt3838 -= arg1;
			if (this.anInt3838 != 0) {
				return arg1;
			}
		} while (!this.method3071());
		return arg3;
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
	private synchronized void method3054() {
		this.method3046(0, this.method3059());
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "()Z")
	public boolean method3055() {
		return this.anInt3836 < 0 || this.anInt3836 >= ((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49.length << 8;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3036(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3827 == 0 && this.anInt3838 == 0) {
			this.method3037(arg2);
			return;
		}
		@Pc(13) Class1_Sub15_Sub1 local13 = (Class1_Sub15_Sub1) super.aClass1_Sub15_5;
		@Pc(18) int local18 = this.anInt3839 << 8;
		@Pc(23) int local23 = this.anInt3837 << 8;
		@Pc(29) int local29 = local13.aByteArray49.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3835 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3836 < 0) {
			if (this.anInt3831 <= 0) {
				this.method3049();
				this.method3525();
				return;
			}
			this.anInt3836 = 0;
		}
		if (this.anInt3836 >= local29) {
			if (this.anInt3831 >= 0) {
				this.method3049();
				this.method3525();
				return;
			}
			this.anInt3836 = local29 - 1;
		}
		if (this.anInt3835 >= 0) {
			if (this.anInt3835 > 0) {
				if (this.aBoolean174) {
					label130: {
						if (this.anInt3831 < 0) {
							local40 = this.method3051(arg0, arg1, local18, local44, local13.aByteArray49[this.anInt3839]);
							if (this.anInt3836 >= local18) {
								return;
							}
							this.anInt3836 = local18 + local18 - this.anInt3836 - 1;
							this.anInt3831 = -this.anInt3831;
							if (--this.anInt3835 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3073(arg0, local40, local23, local44, local13.aByteArray49[this.anInt3837 - 1]);
							if (this.anInt3836 < local23) {
								return;
							}
							this.anInt3836 = local23 + local23 - this.anInt3836 - 1;
							this.anInt3831 = -this.anInt3831;
							if (--this.anInt3835 == 0) {
								break;
							}
							local40 = this.method3051(arg0, local40, local18, local44, local13.aByteArray49[this.anInt3839]);
							if (this.anInt3836 >= local18) {
								return;
							}
							this.anInt3836 = local18 + local18 - this.anInt3836 - 1;
							this.anInt3831 = -this.anInt3831;
						} while (--this.anInt3835 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3831 < 0) {
						while (true) {
							local40 = this.method3051(arg0, local40, local18, local44, local13.aByteArray49[this.anInt3837 - 1]);
							if (this.anInt3836 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3836 - 1) / local33;
							if (local416 >= this.anInt3835) {
								this.anInt3836 += local33 * this.anInt3835;
								this.anInt3835 = 0;
								break;
							}
							this.anInt3836 += local33 * local416;
							this.anInt3835 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3073(arg0, local40, local23, local44, local13.aByteArray49[this.anInt3839]);
							if (this.anInt3836 < local23) {
								return;
							}
							local416 = (this.anInt3836 - local18) / local33;
							if (local416 >= this.anInt3835) {
								this.anInt3836 -= local33 * this.anInt3835;
								this.anInt3835 = 0;
								break;
							}
							this.anInt3836 -= local33 * local416;
							this.anInt3835 -= local416;
						}
					}
				}
			}
			if (this.anInt3831 < 0) {
				this.method3051(arg0, local40, 0, local44, 0);
				if (this.anInt3836 < 0) {
					this.anInt3836 = -1;
					this.method3049();
					this.method3525();
					return;
				}
			} else {
				this.method3073(arg0, local40, local29, local44, 0);
				if (this.anInt3836 >= local29) {
					this.anInt3836 = local29;
					this.method3049();
					this.method3525();
				}
			}
		} else if (this.aBoolean174) {
			if (this.anInt3831 < 0) {
				local40 = this.method3051(arg0, arg1, local18, local44, local13.aByteArray49[this.anInt3839]);
				if (this.anInt3836 >= local18) {
					return;
				}
				this.anInt3836 = local18 + local18 - this.anInt3836 - 1;
				this.anInt3831 = -this.anInt3831;
			}
			while (true) {
				local40 = this.method3073(arg0, local40, local23, local44, local13.aByteArray49[this.anInt3837 - 1]);
				if (this.anInt3836 < local23) {
					return;
				}
				this.anInt3836 = local23 + local23 - this.anInt3836 - 1;
				this.anInt3831 = -this.anInt3831;
				local40 = this.method3051(arg0, local40, local18, local44, local13.aByteArray49[this.anInt3839]);
				if (this.anInt3836 >= local18) {
					return;
				}
				this.anInt3836 = local18 + local18 - this.anInt3836 - 1;
				this.anInt3831 = -this.anInt3831;
			}
		} else if (this.anInt3831 < 0) {
			while (true) {
				local40 = this.method3051(arg0, local40, local18, local44, local13.aByteArray49[this.anInt3837 - 1]);
				if (this.anInt3836 >= local18) {
					return;
				}
				this.anInt3836 = local23 - (local23 - 1 - this.anInt3836) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3073(arg0, local40, local23, local44, local13.aByteArray49[this.anInt3839]);
				if (this.anInt3836 < local23) {
					return;
				}
				this.anInt3836 = local18 + (this.anInt3836 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "()V")
	private void method3058() {
		this.anInt3833 = this.anInt3827;
		this.anInt3830 = Static245.method3057(this.anInt3827, this.anInt3829);
		this.anInt3826 = Static245.method3052(this.anInt3827, this.anInt3829);
	}

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "()I")
	public synchronized int method3059() {
		return this.anInt3829 < 0 ? -1 : this.anInt3829;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V")
	public synchronized void method3062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3046(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static245.method3057(arg1, arg2);
		@Pc(14) int local14 = Static245.method3052(arg1, arg2);
		if (this.anInt3830 == local10 && this.anInt3826 == local14) {
			this.anInt3838 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3833;
		if (this.anInt3833 - arg1 > local31) {
			local31 = this.anInt3833 - arg1;
		}
		if (local10 - this.anInt3830 > local31) {
			local31 = local10 - this.anInt3830;
		}
		if (this.anInt3830 - local10 > local31) {
			local31 = this.anInt3830 - local10;
		}
		if (local14 - this.anInt3826 > local31) {
			local31 = local14 - this.anInt3826;
		}
		if (this.anInt3826 - local14 > local31) {
			local31 = this.anInt3826 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3838 = arg0;
		this.anInt3827 = arg1;
		this.anInt3829 = arg2;
		this.anInt3834 = (arg1 - this.anInt3833) / arg0;
		this.anInt3832 = (local10 - this.anInt3830) / arg0;
		this.anInt3828 = (local14 - this.anInt3826) / arg0;
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
	public synchronized void method3063(@OriginalArg(0) int arg0) {
		this.method3046(arg0 << 6, this.method3059());
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V")
	public synchronized void method3064(@OriginalArg(0) int arg0) {
		if (this.anInt3831 < 0) {
			this.anInt3831 = -arg0;
		} else {
			this.anInt3831 = arg0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)V")
	public synchronized void method3065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3062(arg0, arg1, this.method3059());
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "()Lclient!ge;")
	@Override
	public Class1_Sub12 method3035() {
		return null;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public synchronized void method3067() {
		this.anInt3831 = (this.anInt3831 ^ this.anInt3831 >> 31) + (this.anInt3831 >>> 31);
		this.anInt3831 = -this.anInt3831;
	}

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "()Z")
	public boolean method3068() {
		return this.anInt3838 != 0;
	}

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "()Z")
	private boolean method3071() {
		@Pc(2) int local2 = this.anInt3827;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static245.method3057(local2, this.anInt3829);
			local8 = Static245.method3052(local2, this.anInt3829);
		}
		if (this.anInt3833 != local2 || this.anInt3830 != local10 || this.anInt3826 != local8) {
			if (this.anInt3833 < local2) {
				this.anInt3834 = 1;
				this.anInt3838 = local2 - this.anInt3833;
			} else if (this.anInt3833 > local2) {
				this.anInt3834 = -1;
				this.anInt3838 = this.anInt3833 - local2;
			} else {
				this.anInt3834 = 0;
			}
			if (this.anInt3830 < local10) {
				this.anInt3832 = 1;
				if (this.anInt3838 == 0 || this.anInt3838 > local10 - this.anInt3830) {
					this.anInt3838 = local10 - this.anInt3830;
				}
			} else if (this.anInt3830 > local10) {
				this.anInt3832 = -1;
				if (this.anInt3838 == 0 || this.anInt3838 > this.anInt3830 - local10) {
					this.anInt3838 = this.anInt3830 - local10;
				}
			} else {
				this.anInt3832 = 0;
			}
			if (this.anInt3826 < local8) {
				this.anInt3828 = 1;
				if (this.anInt3838 == 0 || this.anInt3838 > local8 - this.anInt3826) {
					this.anInt3838 = local8 - this.anInt3826;
				}
			} else if (this.anInt3826 > local8) {
				this.anInt3828 = -1;
				if (this.anInt3838 == 0 || this.anInt3838 > this.anInt3826 - local8) {
					this.anInt3838 = this.anInt3826 - local8;
				}
			} else {
				this.anInt3828 = 0;
			}
			return false;
		} else if (this.anInt3827 == Integer.MIN_VALUE) {
			this.anInt3827 = 0;
			this.anInt3833 = this.anInt3830 = this.anInt3826 = 0;
			this.method3525();
			return true;
		} else {
			this.method3058();
			return false;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
	@Override
	public int method3034() {
		@Pc(6) int local6 = this.anInt3833 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3835 == 0) {
			local6 -= local6 * this.anInt3836 / (((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49.length << 8);
		} else if (this.anInt3835 >= 0) {
			local6 -= local6 * this.anInt3839 / ((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "()I")
	public synchronized int method3072() {
		return this.anInt3831 < 0 ? -this.anInt3831 : this.anInt3831;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "([IIIII)I")
	private int method3073(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3838 <= 0) {
				if (this.anInt3831 == 256 && (this.anInt3836 & 0xFF) == 0) {
					if (Static130.aBoolean114) {
						return Static245.method3042(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3830, this.anInt3826, arg3, arg2, this);
					}
					return Static245.method3053(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3833, arg3, arg2, this);
				}
				if (Static130.aBoolean114) {
					return Static245.method3076(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3830, this.anInt3826, arg3, arg2, this, this.anInt3831, arg4);
				}
				return Static245.method3061(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3833, arg3, arg2, this, this.anInt3831, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3838;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3838 += arg1;
			if (this.anInt3831 == 256 && (this.anInt3836 & 0xFF) == 0) {
				if (Static130.aBoolean114) {
					arg1 = Static245.method3045(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3830, this.anInt3826, this.anInt3832, this.anInt3828, local5, arg2, this);
				} else {
					arg1 = Static245.method3048(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3833, this.anInt3834, local5, arg2, this);
				}
			} else if (Static130.aBoolean114) {
				arg1 = Static245.method3075(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3830, this.anInt3826, this.anInt3832, this.anInt3828, local5, arg2, this, this.anInt3831, arg4);
			} else {
				arg1 = Static245.method3077(((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49, arg0, this.anInt3836, arg1, this.anInt3833, this.anInt3834, local5, arg2, this, this.anInt3831, arg4);
			}
			this.anInt3838 -= arg1;
			if (this.anInt3838 != 0) {
				return arg1;
			}
		} while (!this.method3071());
		return arg3;
	}

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)V")
	public synchronized void method3078(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub15_Sub1) super.aClass1_Sub15_5).aByteArray49.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3836 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "(I)V")
	public synchronized void method3079(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3054();
			this.method3525();
		} else if (this.anInt3830 == 0 && this.anInt3826 == 0) {
			this.anInt3838 = 0;
			this.anInt3827 = 0;
			this.anInt3833 = 0;
			this.method3525();
		} else {
			@Pc(31) int local31 = -this.anInt3833;
			if (this.anInt3833 > local31) {
				local31 = this.anInt3833;
			}
			if (-this.anInt3830 > local31) {
				local31 = -this.anInt3830;
			}
			if (this.anInt3830 > local31) {
				local31 = this.anInt3830;
			}
			if (-this.anInt3826 > local31) {
				local31 = -this.anInt3826;
			}
			if (this.anInt3826 > local31) {
				local31 = this.anInt3826;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3838 = arg0;
			this.anInt3827 = Integer.MIN_VALUE;
			this.anInt3834 = -this.anInt3833 / arg0;
			this.anInt3832 = -this.anInt3830 / arg0;
			this.anInt3828 = -this.anInt3826 / arg0;
		}
	}
}
