import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class1_Sub8_Sub4 extends Class1_Sub8 {

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
	public int anInt3932;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
	public int anInt3933;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
	public int anInt3938;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
	public int anInt3939;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
	private int anInt3941;

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
	public int anInt3942;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
	public int anInt3944;

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
	private int anInt3945;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
	private final int anInt3940;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
	private final int anInt3936;

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "Z")
	private final boolean aBoolean148;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
	private int anInt3935;

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
	private int anInt3937;

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
	private int anInt3934;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	public int anInt3943;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!qe;II)V")
	public Class1_Sub8_Sub4(@OriginalArg(0) Class1_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub20_5 = arg0;
		this.anInt3940 = arg0.anInt3737;
		this.anInt3936 = arg0.anInt3736;
		this.aBoolean148 = arg0.aBoolean140;
		this.anInt3935 = arg1;
		this.anInt3937 = arg2;
		this.anInt3934 = 8192;
		this.anInt3943 = 0;
		this.method2978();
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!qe;III)V")
	public Class1_Sub8_Sub4(@OriginalArg(0) Class1_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub20_5 = arg0;
		this.anInt3940 = arg0.anInt3737;
		this.anInt3936 = arg0.anInt3736;
		this.aBoolean148 = arg0.aBoolean140;
		this.anInt3935 = arg1;
		this.anInt3937 = arg2;
		this.anInt3934 = arg3;
		this.anInt3943 = 0;
		this.method2978();
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "()Z")
	private boolean method2944() {
		@Pc(2) int local2 = this.anInt3937;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static190.method2955(local2, this.anInt3934);
			local8 = Static190.method2949(local2, this.anInt3934);
		}
		if (this.anInt3938 != local2 || this.anInt3942 != local10 || this.anInt3933 != local8) {
			if (this.anInt3938 < local2) {
				this.anInt3944 = 1;
				this.anInt3945 = local2 - this.anInt3938;
			} else if (this.anInt3938 > local2) {
				this.anInt3944 = -1;
				this.anInt3945 = this.anInt3938 - local2;
			} else {
				this.anInt3944 = 0;
			}
			if (this.anInt3942 < local10) {
				this.anInt3939 = 1;
				if (this.anInt3945 == 0 || this.anInt3945 > local10 - this.anInt3942) {
					this.anInt3945 = local10 - this.anInt3942;
				}
			} else if (this.anInt3942 > local10) {
				this.anInt3939 = -1;
				if (this.anInt3945 == 0 || this.anInt3945 > this.anInt3942 - local10) {
					this.anInt3945 = this.anInt3942 - local10;
				}
			} else {
				this.anInt3939 = 0;
			}
			if (this.anInt3933 < local8) {
				this.anInt3932 = 1;
				if (this.anInt3945 == 0 || this.anInt3945 > local8 - this.anInt3933) {
					this.anInt3945 = local8 - this.anInt3933;
				}
			} else if (this.anInt3933 > local8) {
				this.anInt3932 = -1;
				if (this.anInt3945 == 0 || this.anInt3945 > this.anInt3933 - local8) {
					this.anInt3945 = this.anInt3933 - local8;
				}
			} else {
				this.anInt3932 = 0;
			}
			return false;
		} else if (this.anInt3937 == Integer.MIN_VALUE) {
			this.anInt3937 = 0;
			this.anInt3938 = this.anInt3942 = this.anInt3933 = 0;
			this.method3499();
			return true;
		} else {
			this.method2978();
			return false;
		}
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "()Lclient!qh;")
	@Override
	public Class1_Sub8 method2942() {
		return null;
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "()Z")
	public boolean method2947() {
		return this.anInt3943 < 0 || this.anInt3943 >= ((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45.length << 8;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "()I")
	@Override
	public int method2940() {
		@Pc(6) int local6 = this.anInt3938 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3941 == 0) {
			local6 -= local6 * this.anInt3943 / (((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45.length << 8);
		} else if (this.anInt3941 >= 0) {
			local6 -= local6 * this.anInt3940 / ((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "()I")
	public synchronized int method2948() {
		return this.anInt3934 < 0 ? -1 : this.anInt3934;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2941(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3937 == 0 && this.anInt3945 == 0) {
			this.method2943(arg2);
			return;
		}
		@Pc(13) Class1_Sub20_Sub1 local13 = (Class1_Sub20_Sub1) super.aClass1_Sub20_5;
		@Pc(18) int local18 = this.anInt3940 << 8;
		@Pc(23) int local23 = this.anInt3936 << 8;
		@Pc(29) int local29 = local13.aByteArray45.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3941 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3943 < 0) {
			if (this.anInt3935 <= 0) {
				this.method2958();
				this.method3499();
				return;
			}
			this.anInt3943 = 0;
		}
		if (this.anInt3943 >= local29) {
			if (this.anInt3935 >= 0) {
				this.method2958();
				this.method3499();
				return;
			}
			this.anInt3943 = local29 - 1;
		}
		if (this.anInt3941 >= 0) {
			if (this.anInt3941 > 0) {
				if (this.aBoolean148) {
					label130: {
						if (this.anInt3935 < 0) {
							local40 = this.method2956(arg0, arg1, local18, local44, local13.aByteArray45[this.anInt3940]);
							if (this.anInt3943 >= local18) {
								return;
							}
							this.anInt3943 = local18 + local18 - this.anInt3943 - 1;
							this.anInt3935 = -this.anInt3935;
							if (--this.anInt3941 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2982(arg0, local40, local23, local44, local13.aByteArray45[this.anInt3936 - 1]);
							if (this.anInt3943 < local23) {
								return;
							}
							this.anInt3943 = local23 + local23 - this.anInt3943 - 1;
							this.anInt3935 = -this.anInt3935;
							if (--this.anInt3941 == 0) {
								break;
							}
							local40 = this.method2956(arg0, local40, local18, local44, local13.aByteArray45[this.anInt3940]);
							if (this.anInt3943 >= local18) {
								return;
							}
							this.anInt3943 = local18 + local18 - this.anInt3943 - 1;
							this.anInt3935 = -this.anInt3935;
						} while (--this.anInt3941 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3935 < 0) {
						while (true) {
							local40 = this.method2956(arg0, local40, local18, local44, local13.aByteArray45[this.anInt3936 - 1]);
							if (this.anInt3943 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3943 - 1) / local33;
							if (local416 >= this.anInt3941) {
								this.anInt3943 += local33 * this.anInt3941;
								this.anInt3941 = 0;
								break;
							}
							this.anInt3943 += local33 * local416;
							this.anInt3941 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2982(arg0, local40, local23, local44, local13.aByteArray45[this.anInt3940]);
							if (this.anInt3943 < local23) {
								return;
							}
							local416 = (this.anInt3943 - local18) / local33;
							if (local416 >= this.anInt3941) {
								this.anInt3943 -= local33 * this.anInt3941;
								this.anInt3941 = 0;
								break;
							}
							this.anInt3943 -= local33 * local416;
							this.anInt3941 -= local416;
						}
					}
				}
			}
			if (this.anInt3935 < 0) {
				this.method2956(arg0, local40, 0, local44, 0);
				if (this.anInt3943 < 0) {
					this.anInt3943 = -1;
					this.method2958();
					this.method3499();
					return;
				}
			} else {
				this.method2982(arg0, local40, local29, local44, 0);
				if (this.anInt3943 >= local29) {
					this.anInt3943 = local29;
					this.method2958();
					this.method3499();
				}
			}
		} else if (this.aBoolean148) {
			if (this.anInt3935 < 0) {
				local40 = this.method2956(arg0, arg1, local18, local44, local13.aByteArray45[this.anInt3940]);
				if (this.anInt3943 >= local18) {
					return;
				}
				this.anInt3943 = local18 + local18 - this.anInt3943 - 1;
				this.anInt3935 = -this.anInt3935;
			}
			while (true) {
				local40 = this.method2982(arg0, local40, local23, local44, local13.aByteArray45[this.anInt3936 - 1]);
				if (this.anInt3943 < local23) {
					return;
				}
				this.anInt3943 = local23 + local23 - this.anInt3943 - 1;
				this.anInt3935 = -this.anInt3935;
				local40 = this.method2956(arg0, local40, local18, local44, local13.aByteArray45[this.anInt3940]);
				if (this.anInt3943 >= local18) {
					return;
				}
				this.anInt3943 = local18 + local18 - this.anInt3943 - 1;
				this.anInt3935 = -this.anInt3935;
			}
		} else if (this.anInt3935 < 0) {
			while (true) {
				local40 = this.method2956(arg0, local40, local18, local44, local13.aByteArray45[this.anInt3936 - 1]);
				if (this.anInt3943 >= local18) {
					return;
				}
				this.anInt3943 = local23 - (local23 - 1 - this.anInt3943) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2982(arg0, local40, local23, local44, local13.aByteArray45[this.anInt3940]);
				if (this.anInt3943 < local23) {
					return;
				}
				this.anInt3943 = local18 + (this.anInt3943 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "()I")
	@Override
	public int method2938() {
		return this.anInt3937 == 0 && this.anInt3945 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([IIIII)I")
	private int method2956(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3945 <= 0) {
				if (this.anInt3935 == -256 && (this.anInt3943 & 0xFF) == 0) {
					if (Static9.aBoolean13) {
						return Static190.method2954(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3942, this.anInt3933, arg3, arg2, this);
					}
					return Static190.method2977(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3938, arg3, arg2, this);
				}
				if (Static9.aBoolean13) {
					return Static190.method2957(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3942, this.anInt3933, arg3, arg2, this, this.anInt3935, arg4);
				}
				return Static190.method2983(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3938, arg3, arg2, this, this.anInt3935, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3945;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3945 += arg1;
			if (this.anInt3935 == -256 && (this.anInt3943 & 0xFF) == 0) {
				if (Static9.aBoolean13) {
					arg1 = Static190.method2953(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3942, this.anInt3933, this.anInt3939, this.anInt3932, local5, arg2, this);
				} else {
					arg1 = Static190.method2961(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3938, this.anInt3944, local5, arg2, this);
				}
			} else if (Static9.aBoolean13) {
				arg1 = Static190.method2971(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3942, this.anInt3933, this.anInt3939, this.anInt3932, local5, arg2, this, this.anInt3935, arg4);
			} else {
				arg1 = Static190.method2962(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3938, this.anInt3944, local5, arg2, this, this.anInt3935, arg4);
			}
			this.anInt3945 -= arg1;
			if (this.anInt3945 != 0) {
				return arg1;
			}
		} while (!this.method2944());
		return arg3;
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "()V")
	private void method2958() {
		if (this.anInt3945 == 0) {
			return;
		}
		if (this.anInt3937 == Integer.MIN_VALUE) {
			this.anInt3937 = 0;
		}
		this.anInt3945 = 0;
		this.method2978();
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V")
	public synchronized void method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2969(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static190.method2955(arg1, arg2);
		@Pc(14) int local14 = Static190.method2949(arg1, arg2);
		if (this.anInt3942 == local10 && this.anInt3933 == local14) {
			this.anInt3945 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3938;
		if (this.anInt3938 - arg1 > local31) {
			local31 = this.anInt3938 - arg1;
		}
		if (local10 - this.anInt3942 > local31) {
			local31 = local10 - this.anInt3942;
		}
		if (this.anInt3942 - local10 > local31) {
			local31 = this.anInt3942 - local10;
		}
		if (local14 - this.anInt3933 > local31) {
			local31 = local14 - this.anInt3933;
		}
		if (this.anInt3933 - local14 > local31) {
			local31 = this.anInt3933 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3945 = arg0;
		this.anInt3937 = arg1;
		this.anInt3934 = arg2;
		this.anInt3944 = (arg1 - this.anInt3938) / arg0;
		this.anInt3939 = (local10 - this.anInt3942) / arg0;
		this.anInt3932 = (local14 - this.anInt3933) / arg0;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
	public synchronized void method2960(@OriginalArg(0) int arg0) {
		this.method2969(arg0 << 6, this.method2948());
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
	public synchronized void method2964(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3943 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	public synchronized void method2965() {
		this.anInt3935 = (this.anInt3935 ^ this.anInt3935 >> 31) + (this.anInt3935 >>> 31);
		this.anInt3935 = -this.anInt3935;
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "()I")
	public synchronized int method2966() {
		return this.anInt3937 == Integer.MIN_VALUE ? 0 : this.anInt3937;
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2943(@OriginalArg(0) int arg0) {
		if (this.anInt3945 > 0) {
			if (arg0 >= this.anInt3945) {
				if (this.anInt3937 == Integer.MIN_VALUE) {
					this.anInt3937 = 0;
					this.anInt3938 = this.anInt3942 = this.anInt3933 = 0;
					this.method3499();
					arg0 = this.anInt3945;
				}
				this.anInt3945 = 0;
				this.method2978();
			} else {
				this.anInt3938 += this.anInt3944 * arg0;
				this.anInt3942 += this.anInt3939 * arg0;
				this.anInt3933 += this.anInt3932 * arg0;
				this.anInt3945 -= arg0;
			}
		}
		@Pc(71) Class1_Sub20_Sub1 local71 = (Class1_Sub20_Sub1) super.aClass1_Sub20_5;
		@Pc(76) int local76 = this.anInt3940 << 8;
		@Pc(81) int local81 = this.anInt3936 << 8;
		@Pc(87) int local87 = local71.aByteArray45.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3941 = 0;
		}
		if (this.anInt3943 < 0) {
			if (this.anInt3935 <= 0) {
				this.method2958();
				this.method3499();
				return;
			}
			this.anInt3943 = 0;
		}
		if (this.anInt3943 >= local87) {
			if (this.anInt3935 >= 0) {
				this.method2958();
				this.method3499();
				return;
			}
			this.anInt3943 = local87 - 1;
		}
		this.anInt3943 += this.anInt3935 * arg0;
		if (this.anInt3941 >= 0) {
			if (this.anInt3941 > 0) {
				if (this.aBoolean148) {
					label125: {
						if (this.anInt3935 < 0) {
							if (this.anInt3943 >= local76) {
								return;
							}
							this.anInt3943 = local76 + local76 - this.anInt3943 - 1;
							this.anInt3935 = -this.anInt3935;
							if (--this.anInt3941 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3943 < local81) {
								return;
							}
							this.anInt3943 = local81 + local81 - this.anInt3943 - 1;
							this.anInt3935 = -this.anInt3935;
							if (--this.anInt3941 == 0) {
								break;
							}
							if (this.anInt3943 >= local76) {
								return;
							}
							this.anInt3943 = local76 + local76 - this.anInt3943 - 1;
							this.anInt3935 = -this.anInt3935;
						} while (--this.anInt3941 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3935 < 0) {
						if (this.anInt3943 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3943 - 1) / local91;
						if (local361 < this.anInt3941) {
							this.anInt3943 += local91 * local361;
							this.anInt3941 -= local361;
							return;
						}
						this.anInt3943 += local91 * this.anInt3941;
						this.anInt3941 = 0;
					} else if (this.anInt3943 >= local81) {
						local361 = (this.anInt3943 - local76) / local91;
						if (local361 < this.anInt3941) {
							this.anInt3943 -= local91 * local361;
							this.anInt3941 -= local361;
							return;
						}
						this.anInt3943 -= local91 * this.anInt3941;
						this.anInt3941 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3935 < 0) {
				if (this.anInt3943 < 0) {
					this.anInt3943 = -1;
					this.method2958();
					this.method3499();
					return;
				}
			} else if (this.anInt3943 >= local87) {
				this.anInt3943 = local87;
				this.method2958();
				this.method3499();
			}
		} else if (this.aBoolean148) {
			if (this.anInt3935 < 0) {
				if (this.anInt3943 >= local76) {
					return;
				}
				this.anInt3943 = local76 + local76 - this.anInt3943 - 1;
				this.anInt3935 = -this.anInt3935;
			}
			while (this.anInt3943 >= local81) {
				this.anInt3943 = local81 + local81 - this.anInt3943 - 1;
				this.anInt3935 = -this.anInt3935;
				if (this.anInt3943 >= local76) {
					return;
				}
				this.anInt3943 = local76 + local76 - this.anInt3943 - 1;
				this.anInt3935 = -this.anInt3935;
			}
		} else if (this.anInt3935 < 0) {
			if (this.anInt3943 < local76) {
				this.anInt3943 = local81 - (local81 - 1 - this.anInt3943) % local91 - 1;
			}
		} else if (this.anInt3943 >= local81) {
			this.anInt3943 = local76 + (this.anInt3943 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(II)V")
	public synchronized void method2967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2959(arg0, arg1, this.method2948());
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
	public synchronized void method2968(@OriginalArg(0) int arg0) {
		this.anInt3941 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(II)V")
	private synchronized void method2969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3937 = arg0;
		this.anInt3934 = arg1;
		this.anInt3945 = 0;
		this.method2978();
	}

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "()Z")
	public boolean method2972() {
		return this.anInt3945 != 0;
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)V")
	private synchronized void method2973() {
		this.method2969(0, this.method2948());
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "()Lclient!qh;")
	@Override
	public Class1_Sub8 method2937() {
		return null;
	}

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "()I")
	public synchronized int method2974() {
		return this.anInt3935 < 0 ? -this.anInt3935 : this.anInt3935;
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)V")
	public synchronized void method2975(@OriginalArg(0) int arg0) {
		if (this.anInt3935 < 0) {
			this.anInt3935 = -arg0;
		} else {
			this.anInt3935 = arg0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "()V")
	private void method2978() {
		this.anInt3938 = this.anInt3937;
		this.anInt3942 = Static190.method2955(this.anInt3937, this.anInt3934);
		this.anInt3933 = Static190.method2949(this.anInt3937, this.anInt3934);
	}

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "(I)V")
	public synchronized void method2979(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2973();
			this.method3499();
		} else if (this.anInt3942 == 0 && this.anInt3933 == 0) {
			this.anInt3945 = 0;
			this.anInt3937 = 0;
			this.anInt3938 = 0;
			this.method3499();
		} else {
			@Pc(31) int local31 = -this.anInt3938;
			if (this.anInt3938 > local31) {
				local31 = this.anInt3938;
			}
			if (-this.anInt3942 > local31) {
				local31 = -this.anInt3942;
			}
			if (this.anInt3942 > local31) {
				local31 = this.anInt3942;
			}
			if (-this.anInt3933 > local31) {
				local31 = -this.anInt3933;
			}
			if (this.anInt3933 > local31) {
				local31 = this.anInt3933;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3945 = arg0;
			this.anInt3937 = Integer.MIN_VALUE;
			this.anInt3944 = -this.anInt3938 / arg0;
			this.anInt3939 = -this.anInt3942 / arg0;
			this.anInt3932 = -this.anInt3933 / arg0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "([IIIII)I")
	private int method2982(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3945 <= 0) {
				if (this.anInt3935 == 256 && (this.anInt3943 & 0xFF) == 0) {
					if (Static9.aBoolean13) {
						return Static190.method2952(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3942, this.anInt3933, arg3, arg2, this);
					}
					return Static190.method2951(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3938, arg3, arg2, this);
				}
				if (Static9.aBoolean13) {
					return Static190.method2970(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3942, this.anInt3933, arg3, arg2, this, this.anInt3935, arg4);
				}
				return Static190.method2980(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3938, arg3, arg2, this, this.anInt3935, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3945;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3945 += arg1;
			if (this.anInt3935 == 256 && (this.anInt3943 & 0xFF) == 0) {
				if (Static9.aBoolean13) {
					arg1 = Static190.method2946(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3942, this.anInt3933, this.anInt3939, this.anInt3932, local5, arg2, this);
				} else {
					arg1 = Static190.method2963(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3938, this.anInt3944, local5, arg2, this);
				}
			} else if (Static9.aBoolean13) {
				arg1 = Static190.method2945(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3942, this.anInt3933, this.anInt3939, this.anInt3932, local5, arg2, this, this.anInt3935, arg4);
			} else {
				arg1 = Static190.method2950(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray45, arg0, this.anInt3943, arg1, this.anInt3938, this.anInt3944, local5, arg2, this, this.anInt3935, arg4);
			}
			this.anInt3945 -= arg1;
			if (this.anInt3945 != 0) {
				return arg1;
			}
		} while (!this.method2944());
		return arg3;
	}
}
