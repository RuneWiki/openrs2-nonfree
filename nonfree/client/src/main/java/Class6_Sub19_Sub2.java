import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class6_Sub19_Sub2 extends Class6_Sub19 {

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	private int anInt3299;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
	private int anInt3301;

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
	public int anInt3304;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	public int anInt3305;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
	public int anInt3306;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
	public int anInt3307;

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
	public int anInt3310;

	@OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
	public int anInt3312;

	@OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
	private final int anInt3311;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
	private final int anInt3302;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "Z")
	private final boolean aBoolean220;

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
	private int anInt3303;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
	private int anInt3308;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
	private int anInt3300;

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
	public int anInt3309;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!mda;II)V")
	public Class6_Sub19_Sub2(@OriginalArg(0) Class6_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass6_Sub12_5 = arg0;
		this.anInt3311 = arg0.anInt5510;
		this.anInt3302 = arg0.anInt5512;
		this.aBoolean220 = arg0.aBoolean351;
		this.anInt3303 = arg1;
		this.anInt3308 = arg2;
		this.anInt3300 = 8192;
		this.anInt3309 = 0;
		this.method2839();
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!mda;III)V")
	public Class6_Sub19_Sub2(@OriginalArg(0) Class6_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub12_5 = arg0;
		this.anInt3311 = arg0.anInt5510;
		this.anInt3302 = arg0.anInt5512;
		this.aBoolean220 = arg0.aBoolean351;
		this.anInt3303 = arg1;
		this.anInt3308 = arg2;
		this.anInt3300 = arg3;
		this.anInt3309 = 0;
		this.method2839();
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "()Z")
	public boolean method2810() {
		return this.anInt3309 < 0 || this.anInt3309 >= ((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66.length << 8;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public synchronized void method2811(@OriginalArg(0) int arg0) {
		this.method2813(arg0 << 6, this.method2843());
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
	public synchronized void method2812(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3309 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
	private synchronized void method2813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3308 = arg0;
		this.anInt3300 = arg1;
		this.anInt3301 = 0;
		this.method2839();
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)V")
	private synchronized void method2814() {
		this.method2813(0, this.method2843());
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([IIIII)I")
	private int method2816(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3301 <= 0) {
				if (this.anInt3303 == -256 && (this.anInt3309 & 0xFF) == 0) {
					if (Static570.aBoolean666) {
						return Static583.method2819(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3305, this.anInt3310, arg3, arg2, this);
					}
					return Static583.method2844(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3307, arg3, arg2, this);
				}
				if (Static570.aBoolean666) {
					return Static583.method2823(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3305, this.anInt3310, arg3, arg2, this, this.anInt3303, arg4);
				}
				return Static583.method2835(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3307, arg3, arg2, this, this.anInt3303, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3301;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3301 += arg1;
			if (this.anInt3303 == -256 && (this.anInt3309 & 0xFF) == 0) {
				if (Static570.aBoolean666) {
					arg1 = Static583.method2829(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3305, this.anInt3310, this.anInt3312, this.anInt3306, local5, arg2, this);
				} else {
					arg1 = Static583.method2818(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3307, this.anInt3304, local5, arg2, this);
				}
			} else if (Static570.aBoolean666) {
				arg1 = Static583.method2838(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3305, this.anInt3310, this.anInt3312, this.anInt3306, local5, arg2, this, this.anInt3303, arg4);
			} else {
				arg1 = Static583.method2842(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3307, this.anInt3304, local5, arg2, this, this.anInt3303, arg4);
			}
			this.anInt3301 -= arg1;
			if (this.anInt3301 != 0) {
				return arg1;
			}
		} while (!this.method2831());
		return arg3;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
	public synchronized void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2837(arg0, arg1, this.method2843());
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "([IIIII)I")
	private int method2821(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3301 <= 0) {
				if (this.anInt3303 == 256 && (this.anInt3309 & 0xFF) == 0) {
					if (Static570.aBoolean666) {
						return Static583.method2820(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3305, this.anInt3310, arg3, arg2, this);
					}
					return Static583.method2830(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3307, arg3, arg2, this);
				}
				if (Static570.aBoolean666) {
					return Static583.method2833(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3305, this.anInt3310, arg3, arg2, this, this.anInt3303, arg4);
				}
				return Static583.method2832(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3307, arg3, arg2, this, this.anInt3303, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3301;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3301 += arg1;
			if (this.anInt3303 == 256 && (this.anInt3309 & 0xFF) == 0) {
				if (Static570.aBoolean666) {
					arg1 = Static583.method2847(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3305, this.anInt3310, this.anInt3312, this.anInt3306, local5, arg2, this);
				} else {
					arg1 = Static583.method2841(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3307, this.anInt3304, local5, arg2, this);
				}
			} else if (Static570.aBoolean666) {
				arg1 = Static583.method2840(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3305, this.anInt3310, this.anInt3312, this.anInt3306, local5, arg2, this, this.anInt3303, arg4);
			} else {
				arg1 = Static583.method2848(((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66, arg0, this.anInt3309, arg1, this.anInt3307, this.anInt3304, local5, arg2, this, this.anInt3303, arg4);
			}
			this.anInt3301 -= arg1;
			if (this.anInt3301 != 0) {
				return arg1;
			}
		} while (!this.method2831());
		return arg3;
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "()Z")
	public boolean method2825() {
		return this.anInt3301 != 0;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "()I")
	@Override
	public int method7699() {
		@Pc(6) int local6 = this.anInt3307 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3299 == 0) {
			local6 -= local6 * this.anInt3309 / (((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66.length << 8);
		} else if (this.anInt3299 >= 0) {
			local6 -= local6 * this.anInt3311 / ((Class6_Sub12_Sub1) super.aClass6_Sub12_5).aByteArray66.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "()Lclient!wi;")
	@Override
	public Class6_Sub19 method7694() {
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7698(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3308 == 0 && this.anInt3301 == 0) {
			this.method7697(arg2);
			return;
		}
		@Pc(13) Class6_Sub12_Sub1 local13 = (Class6_Sub12_Sub1) super.aClass6_Sub12_5;
		@Pc(18) int local18 = this.anInt3311 << 8;
		@Pc(23) int local23 = this.anInt3302 << 8;
		@Pc(29) int local29 = local13.aByteArray66.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3299 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3309 < 0) {
			if (this.anInt3303 <= 0) {
				this.method2827();
				this.method7849();
				return;
			}
			this.anInt3309 = 0;
		}
		if (this.anInt3309 >= local29) {
			if (this.anInt3303 >= 0) {
				this.method2827();
				this.method7849();
				return;
			}
			this.anInt3309 = local29 - 1;
		}
		if (this.anInt3299 >= 0) {
			if (this.anInt3299 > 0) {
				if (this.aBoolean220) {
					label130: {
						if (this.anInt3303 < 0) {
							local40 = this.method2816(arg0, arg1, local18, local44, local13.aByteArray66[this.anInt3311]);
							if (this.anInt3309 >= local18) {
								return;
							}
							this.anInt3309 = local18 + local18 - this.anInt3309 - 1;
							this.anInt3303 = -this.anInt3303;
							if (--this.anInt3299 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2821(arg0, local40, local23, local44, local13.aByteArray66[this.anInt3302 - 1]);
							if (this.anInt3309 < local23) {
								return;
							}
							this.anInt3309 = local23 + local23 - this.anInt3309 - 1;
							this.anInt3303 = -this.anInt3303;
							if (--this.anInt3299 == 0) {
								break;
							}
							local40 = this.method2816(arg0, local40, local18, local44, local13.aByteArray66[this.anInt3311]);
							if (this.anInt3309 >= local18) {
								return;
							}
							this.anInt3309 = local18 + local18 - this.anInt3309 - 1;
							this.anInt3303 = -this.anInt3303;
						} while (--this.anInt3299 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3303 < 0) {
						while (true) {
							local40 = this.method2816(arg0, local40, local18, local44, local13.aByteArray66[this.anInt3302 - 1]);
							if (this.anInt3309 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3309 - 1) / local33;
							if (local416 >= this.anInt3299) {
								this.anInt3309 += local33 * this.anInt3299;
								this.anInt3299 = 0;
								break;
							}
							this.anInt3309 += local33 * local416;
							this.anInt3299 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2821(arg0, local40, local23, local44, local13.aByteArray66[this.anInt3311]);
							if (this.anInt3309 < local23) {
								return;
							}
							local416 = (this.anInt3309 - local18) / local33;
							if (local416 >= this.anInt3299) {
								this.anInt3309 -= local33 * this.anInt3299;
								this.anInt3299 = 0;
								break;
							}
							this.anInt3309 -= local33 * local416;
							this.anInt3299 -= local416;
						}
					}
				}
			}
			if (this.anInt3303 < 0) {
				this.method2816(arg0, local40, 0, local44, 0);
				if (this.anInt3309 < 0) {
					this.anInt3309 = -1;
					this.method2827();
					this.method7849();
					return;
				}
			} else {
				this.method2821(arg0, local40, local29, local44, 0);
				if (this.anInt3309 >= local29) {
					this.anInt3309 = local29;
					this.method2827();
					this.method7849();
				}
			}
		} else if (this.aBoolean220) {
			if (this.anInt3303 < 0) {
				local40 = this.method2816(arg0, arg1, local18, local44, local13.aByteArray66[this.anInt3311]);
				if (this.anInt3309 >= local18) {
					return;
				}
				this.anInt3309 = local18 + local18 - this.anInt3309 - 1;
				this.anInt3303 = -this.anInt3303;
			}
			while (true) {
				local40 = this.method2821(arg0, local40, local23, local44, local13.aByteArray66[this.anInt3302 - 1]);
				if (this.anInt3309 < local23) {
					return;
				}
				this.anInt3309 = local23 + local23 - this.anInt3309 - 1;
				this.anInt3303 = -this.anInt3303;
				local40 = this.method2816(arg0, local40, local18, local44, local13.aByteArray66[this.anInt3311]);
				if (this.anInt3309 >= local18) {
					return;
				}
				this.anInt3309 = local18 + local18 - this.anInt3309 - 1;
				this.anInt3303 = -this.anInt3303;
			}
		} else if (this.anInt3303 < 0) {
			while (true) {
				local40 = this.method2816(arg0, local40, local18, local44, local13.aByteArray66[this.anInt3302 - 1]);
				if (this.anInt3309 >= local18) {
					return;
				}
				this.anInt3309 = local23 - (local23 - 1 - this.anInt3309) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2821(arg0, local40, local23, local44, local13.aByteArray66[this.anInt3311]);
				if (this.anInt3309 < local23) {
					return;
				}
				this.anInt3309 = local18 + (this.anInt3309 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)V")
	public synchronized void method2826(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2814();
			this.method7849();
		} else if (this.anInt3305 == 0 && this.anInt3310 == 0) {
			this.anInt3301 = 0;
			this.anInt3308 = 0;
			this.anInt3307 = 0;
			this.method7849();
		} else {
			@Pc(31) int local31 = -this.anInt3307;
			if (this.anInt3307 > local31) {
				local31 = this.anInt3307;
			}
			if (-this.anInt3305 > local31) {
				local31 = -this.anInt3305;
			}
			if (this.anInt3305 > local31) {
				local31 = this.anInt3305;
			}
			if (-this.anInt3310 > local31) {
				local31 = -this.anInt3310;
			}
			if (this.anInt3310 > local31) {
				local31 = this.anInt3310;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3301 = arg0;
			this.anInt3308 = Integer.MIN_VALUE;
			this.anInt3304 = -this.anInt3307 / arg0;
			this.anInt3312 = -this.anInt3305 / arg0;
			this.anInt3306 = -this.anInt3310 / arg0;
		}
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "()V")
	private void method2827() {
		if (this.anInt3301 == 0) {
			return;
		}
		if (this.anInt3308 == Integer.MIN_VALUE) {
			this.anInt3308 = 0;
		}
		this.anInt3301 = 0;
		this.method2839();
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "()Lclient!wi;")
	@Override
	public Class6_Sub19 method7700() {
		return null;
	}

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)V")
	public synchronized void method2828(@OriginalArg(0) int arg0) {
		if (this.anInt3303 < 0) {
			this.anInt3303 = -arg0;
		} else {
			this.anInt3303 = arg0;
		}
	}

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "()Z")
	private boolean method2831() {
		@Pc(2) int local2 = this.anInt3308;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static583.method2822(local2, this.anInt3300);
			local8 = Static583.method2824(local2, this.anInt3300);
		}
		if (this.anInt3307 != local2 || this.anInt3305 != local10 || this.anInt3310 != local8) {
			if (this.anInt3307 < local2) {
				this.anInt3304 = 1;
				this.anInt3301 = local2 - this.anInt3307;
			} else if (this.anInt3307 > local2) {
				this.anInt3304 = -1;
				this.anInt3301 = this.anInt3307 - local2;
			} else {
				this.anInt3304 = 0;
			}
			if (this.anInt3305 < local10) {
				this.anInt3312 = 1;
				if (this.anInt3301 == 0 || this.anInt3301 > local10 - this.anInt3305) {
					this.anInt3301 = local10 - this.anInt3305;
				}
			} else if (this.anInt3305 > local10) {
				this.anInt3312 = -1;
				if (this.anInt3301 == 0 || this.anInt3301 > this.anInt3305 - local10) {
					this.anInt3301 = this.anInt3305 - local10;
				}
			} else {
				this.anInt3312 = 0;
			}
			if (this.anInt3310 < local8) {
				this.anInt3306 = 1;
				if (this.anInt3301 == 0 || this.anInt3301 > local8 - this.anInt3310) {
					this.anInt3301 = local8 - this.anInt3310;
				}
			} else if (this.anInt3310 > local8) {
				this.anInt3306 = -1;
				if (this.anInt3301 == 0 || this.anInt3301 > this.anInt3310 - local8) {
					this.anInt3301 = this.anInt3310 - local8;
				}
			} else {
				this.anInt3306 = 0;
			}
			return false;
		} else if (this.anInt3308 == Integer.MIN_VALUE) {
			this.anInt3308 = 0;
			this.anInt3307 = this.anInt3305 = this.anInt3310 = 0;
			this.method7849();
			return true;
		} else {
			this.method2839();
			return false;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7697(@OriginalArg(0) int arg0) {
		if (this.anInt3301 > 0) {
			if (arg0 >= this.anInt3301) {
				if (this.anInt3308 == Integer.MIN_VALUE) {
					this.anInt3308 = 0;
					this.anInt3307 = this.anInt3305 = this.anInt3310 = 0;
					this.method7849();
					arg0 = this.anInt3301;
				}
				this.anInt3301 = 0;
				this.method2839();
			} else {
				this.anInt3307 += this.anInt3304 * arg0;
				this.anInt3305 += this.anInt3312 * arg0;
				this.anInt3310 += this.anInt3306 * arg0;
				this.anInt3301 -= arg0;
			}
		}
		@Pc(71) Class6_Sub12_Sub1 local71 = (Class6_Sub12_Sub1) super.aClass6_Sub12_5;
		@Pc(76) int local76 = this.anInt3311 << 8;
		@Pc(81) int local81 = this.anInt3302 << 8;
		@Pc(87) int local87 = local71.aByteArray66.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3299 = 0;
		}
		if (this.anInt3309 < 0) {
			if (this.anInt3303 <= 0) {
				this.method2827();
				this.method7849();
				return;
			}
			this.anInt3309 = 0;
		}
		if (this.anInt3309 >= local87) {
			if (this.anInt3303 >= 0) {
				this.method2827();
				this.method7849();
				return;
			}
			this.anInt3309 = local87 - 1;
		}
		this.anInt3309 += this.anInt3303 * arg0;
		if (this.anInt3299 >= 0) {
			if (this.anInt3299 > 0) {
				if (this.aBoolean220) {
					label125: {
						if (this.anInt3303 < 0) {
							if (this.anInt3309 >= local76) {
								return;
							}
							this.anInt3309 = local76 + local76 - this.anInt3309 - 1;
							this.anInt3303 = -this.anInt3303;
							if (--this.anInt3299 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3309 < local81) {
								return;
							}
							this.anInt3309 = local81 + local81 - this.anInt3309 - 1;
							this.anInt3303 = -this.anInt3303;
							if (--this.anInt3299 == 0) {
								break;
							}
							if (this.anInt3309 >= local76) {
								return;
							}
							this.anInt3309 = local76 + local76 - this.anInt3309 - 1;
							this.anInt3303 = -this.anInt3303;
						} while (--this.anInt3299 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3303 < 0) {
						if (this.anInt3309 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3309 - 1) / local91;
						if (local361 < this.anInt3299) {
							this.anInt3309 += local91 * local361;
							this.anInt3299 -= local361;
							return;
						}
						this.anInt3309 += local91 * this.anInt3299;
						this.anInt3299 = 0;
					} else if (this.anInt3309 >= local81) {
						local361 = (this.anInt3309 - local76) / local91;
						if (local361 < this.anInt3299) {
							this.anInt3309 -= local91 * local361;
							this.anInt3299 -= local361;
							return;
						}
						this.anInt3309 -= local91 * this.anInt3299;
						this.anInt3299 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3303 < 0) {
				if (this.anInt3309 < 0) {
					this.anInt3309 = -1;
					this.method2827();
					this.method7849();
					return;
				}
			} else if (this.anInt3309 >= local87) {
				this.anInt3309 = local87;
				this.method2827();
				this.method7849();
			}
		} else if (this.aBoolean220) {
			if (this.anInt3303 < 0) {
				if (this.anInt3309 >= local76) {
					return;
				}
				this.anInt3309 = local76 + local76 - this.anInt3309 - 1;
				this.anInt3303 = -this.anInt3303;
			}
			while (this.anInt3309 >= local81) {
				this.anInt3309 = local81 + local81 - this.anInt3309 - 1;
				this.anInt3303 = -this.anInt3303;
				if (this.anInt3309 >= local76) {
					return;
				}
				this.anInt3309 = local76 + local76 - this.anInt3309 - 1;
				this.anInt3303 = -this.anInt3303;
			}
		} else if (this.anInt3303 < 0) {
			if (this.anInt3309 < local76) {
				this.anInt3309 = local81 - (local81 - 1 - this.anInt3309) % local91 - 1;
			}
		} else if (this.anInt3309 >= local81) {
			this.anInt3309 = local76 + (this.anInt3309 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "()I")
	@Override
	public int method7695() {
		return this.anInt3308 == 0 && this.anInt3301 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "()I")
	public synchronized int method2834() {
		return this.anInt3308 == Integer.MIN_VALUE ? 0 : this.anInt3308;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	public synchronized void method2836() {
		this.anInt3303 = (this.anInt3303 ^ this.anInt3303 >> 31) + (this.anInt3303 >>> 31);
		this.anInt3303 = -this.anInt3303;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V")
	public synchronized void method2837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2813(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static583.method2822(arg1, arg2);
		@Pc(14) int local14 = Static583.method2824(arg1, arg2);
		if (this.anInt3305 == local10 && this.anInt3310 == local14) {
			this.anInt3301 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3307;
		if (this.anInt3307 - arg1 > local31) {
			local31 = this.anInt3307 - arg1;
		}
		if (local10 - this.anInt3305 > local31) {
			local31 = local10 - this.anInt3305;
		}
		if (this.anInt3305 - local10 > local31) {
			local31 = this.anInt3305 - local10;
		}
		if (local14 - this.anInt3310 > local31) {
			local31 = local14 - this.anInt3310;
		}
		if (this.anInt3310 - local14 > local31) {
			local31 = this.anInt3310 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3301 = arg0;
		this.anInt3308 = arg1;
		this.anInt3300 = arg2;
		this.anInt3304 = (arg1 - this.anInt3307) / arg0;
		this.anInt3312 = (local10 - this.anInt3305) / arg0;
		this.anInt3306 = (local14 - this.anInt3310) / arg0;
	}

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "()V")
	private void method2839() {
		this.anInt3307 = this.anInt3308;
		this.anInt3305 = Static583.method2822(this.anInt3308, this.anInt3300);
		this.anInt3310 = Static583.method2824(this.anInt3308, this.anInt3300);
	}

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "()I")
	public synchronized int method2843() {
		return this.anInt3300 < 0 ? -1 : this.anInt3300;
	}

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "(I)V")
	public synchronized void method2845(@OriginalArg(0) int arg0) {
		this.anInt3299 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "()I")
	public synchronized int method2846() {
		return this.anInt3303 < 0 ? -this.anInt3303 : this.anInt3303;
	}
}
