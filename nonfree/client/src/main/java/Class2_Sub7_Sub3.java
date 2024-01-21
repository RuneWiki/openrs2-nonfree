import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class2_Sub7_Sub3 extends Class2_Sub7 {

	@OriginalMember(owner = "client!td", name = "s", descriptor = "I")
	public int anInt4230;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "I")
	private int anInt4231;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	public int anInt4233;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "I")
	public int anInt4234;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	public int anInt4236;

	@OriginalMember(owner = "client!td", name = "C", descriptor = "I")
	public int anInt4239;

	@OriginalMember(owner = "client!td", name = "D", descriptor = "I")
	private int anInt4240;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "I")
	public int anInt4243;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "I")
	private final int anInt4242;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "I")
	private final int anInt4232;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "Z")
	private final boolean aBoolean169;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "I")
	private int anInt4235;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "I")
	private int anInt4237;

	@OriginalMember(owner = "client!td", name = "F", descriptor = "I")
	private int anInt4241;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "I")
	public int anInt4238;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!oa;II)V")
	public Class2_Sub7_Sub3(@OriginalArg(0) Class2_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub16_5 = arg0;
		this.anInt4242 = arg0.anInt3445;
		this.anInt4232 = arg0.anInt3447;
		this.aBoolean169 = arg0.aBoolean128;
		this.anInt4235 = arg1;
		this.anInt4237 = arg2;
		this.anInt4241 = 8192;
		this.anInt4238 = 0;
		this.method3225();
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!oa;III)V")
	public Class2_Sub7_Sub3(@OriginalArg(0) Class2_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub16_5 = arg0;
		this.anInt4242 = arg0.anInt3445;
		this.anInt4232 = arg0.anInt3447;
		this.aBoolean169 = arg0.aBoolean128;
		this.anInt4235 = arg1;
		this.anInt4237 = arg2;
		this.anInt4241 = arg3;
		this.anInt4238 = 0;
		this.method3225();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([IIIII)I")
	private int method3219(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4240 <= 0) {
				if (this.anInt4235 == -256 && (this.anInt4238 & 0xFF) == 0) {
					if (Static16.aBoolean15) {
						return Static205.method3231(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4243, this.anInt4233, arg3, arg2, this);
					}
					return Static205.method3234(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4236, arg3, arg2, this);
				}
				if (Static16.aBoolean15) {
					return Static205.method3227(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4243, this.anInt4233, arg3, arg2, this, this.anInt4235, arg4);
				}
				return Static205.method3228(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4236, arg3, arg2, this, this.anInt4235, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4240;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4240 += arg1;
			if (this.anInt4235 == -256 && (this.anInt4238 & 0xFF) == 0) {
				if (Static16.aBoolean15) {
					arg1 = Static205.method3255(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4243, this.anInt4233, this.anInt4234, this.anInt4239, local5, arg2, this);
				} else {
					arg1 = Static205.method3253(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4236, this.anInt4230, local5, arg2, this);
				}
			} else if (Static16.aBoolean15) {
				arg1 = Static205.method3233(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4243, this.anInt4233, this.anInt4234, this.anInt4239, local5, arg2, this, this.anInt4235, arg4);
			} else {
				arg1 = Static205.method3241(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4236, this.anInt4230, local5, arg2, this, this.anInt4235, arg4);
			}
			this.anInt4240 -= arg1;
			if (this.anInt4240 != 0) {
				return arg1;
			}
		} while (!this.method3246());
		return arg3;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "()I")
	public synchronized int method3220() {
		return this.anInt4237 == Integer.MIN_VALUE ? 0 : this.anInt4237;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "([IIIII)I")
	private int method3224(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4240 <= 0) {
				if (this.anInt4235 == 256 && (this.anInt4238 & 0xFF) == 0) {
					if (Static16.aBoolean15) {
						return Static205.method3222(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4243, this.anInt4233, arg3, arg2, this);
					}
					return Static205.method3250(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4236, arg3, arg2, this);
				}
				if (Static16.aBoolean15) {
					return Static205.method3223(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4243, this.anInt4233, arg3, arg2, this, this.anInt4235, arg4);
				}
				return Static205.method3221(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4236, arg3, arg2, this, this.anInt4235, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4240;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4240 += arg1;
			if (this.anInt4235 == 256 && (this.anInt4238 & 0xFF) == 0) {
				if (Static16.aBoolean15) {
					arg1 = Static205.method3247(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4243, this.anInt4233, this.anInt4234, this.anInt4239, local5, arg2, this);
				} else {
					arg1 = Static205.method3245(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4236, this.anInt4230, local5, arg2, this);
				}
			} else if (Static16.aBoolean15) {
				arg1 = Static205.method3226(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4243, this.anInt4233, this.anInt4234, this.anInt4239, local5, arg2, this, this.anInt4235, arg4);
			} else {
				arg1 = Static205.method3239(((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38, arg0, this.anInt4238, arg1, this.anInt4236, this.anInt4230, local5, arg2, this, this.anInt4235, arg4);
			}
			this.anInt4240 -= arg1;
			if (this.anInt4240 != 0) {
				return arg1;
			}
		} while (!this.method3246());
		return arg3;
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "()V")
	private void method3225() {
		this.anInt4236 = this.anInt4237;
		this.anInt4243 = Static205.method3252(this.anInt4237, this.anInt4241);
		this.anInt4233 = Static205.method3235(this.anInt4237, this.anInt4241);
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "()I")
	public synchronized int method3229() {
		return this.anInt4241 < 0 ? -1 : this.anInt4241;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
	public synchronized void method3232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3240(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static205.method3252(arg1, arg2);
		@Pc(14) int local14 = Static205.method3235(arg1, arg2);
		if (this.anInt4243 == local10 && this.anInt4233 == local14) {
			this.anInt4240 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4236;
		if (this.anInt4236 - arg1 > local31) {
			local31 = this.anInt4236 - arg1;
		}
		if (local10 - this.anInt4243 > local31) {
			local31 = local10 - this.anInt4243;
		}
		if (this.anInt4243 - local10 > local31) {
			local31 = this.anInt4243 - local10;
		}
		if (local14 - this.anInt4233 > local31) {
			local31 = local14 - this.anInt4233;
		}
		if (this.anInt4233 - local14 > local31) {
			local31 = this.anInt4233 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4240 = arg0;
		this.anInt4237 = arg1;
		this.anInt4241 = arg2;
		this.anInt4230 = (arg1 - this.anInt4236) / arg0;
		this.anInt4234 = (local10 - this.anInt4243) / arg0;
		this.anInt4239 = (local14 - this.anInt4233) / arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3312(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4237 == 0 && this.anInt4240 == 0) {
			this.method3309(arg2);
			return;
		}
		@Pc(13) Class2_Sub16_Sub1 local13 = (Class2_Sub16_Sub1) super.aClass2_Sub16_5;
		@Pc(18) int local18 = this.anInt4242 << 8;
		@Pc(23) int local23 = this.anInt4232 << 8;
		@Pc(29) int local29 = local13.aByteArray38.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4231 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4238 < 0) {
			if (this.anInt4235 <= 0) {
				this.method3258();
				this.method3556();
				return;
			}
			this.anInt4238 = 0;
		}
		if (this.anInt4238 >= local29) {
			if (this.anInt4235 >= 0) {
				this.method3258();
				this.method3556();
				return;
			}
			this.anInt4238 = local29 - 1;
		}
		if (this.anInt4231 >= 0) {
			if (this.anInt4231 > 0) {
				if (this.aBoolean169) {
					label130: {
						if (this.anInt4235 < 0) {
							local40 = this.method3219(arg0, arg1, local18, local44, local13.aByteArray38[this.anInt4242]);
							if (this.anInt4238 >= local18) {
								return;
							}
							this.anInt4238 = local18 + local18 - this.anInt4238 - 1;
							this.anInt4235 = -this.anInt4235;
							if (--this.anInt4231 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3224(arg0, local40, local23, local44, local13.aByteArray38[this.anInt4232 - 1]);
							if (this.anInt4238 < local23) {
								return;
							}
							this.anInt4238 = local23 + local23 - this.anInt4238 - 1;
							this.anInt4235 = -this.anInt4235;
							if (--this.anInt4231 == 0) {
								break;
							}
							local40 = this.method3219(arg0, local40, local18, local44, local13.aByteArray38[this.anInt4242]);
							if (this.anInt4238 >= local18) {
								return;
							}
							this.anInt4238 = local18 + local18 - this.anInt4238 - 1;
							this.anInt4235 = -this.anInt4235;
						} while (--this.anInt4231 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4235 < 0) {
						while (true) {
							local40 = this.method3219(arg0, local40, local18, local44, local13.aByteArray38[this.anInt4232 - 1]);
							if (this.anInt4238 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4238 - 1) / local33;
							if (local416 >= this.anInt4231) {
								this.anInt4238 += local33 * this.anInt4231;
								this.anInt4231 = 0;
								break;
							}
							this.anInt4238 += local33 * local416;
							this.anInt4231 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3224(arg0, local40, local23, local44, local13.aByteArray38[this.anInt4242]);
							if (this.anInt4238 < local23) {
								return;
							}
							local416 = (this.anInt4238 - local18) / local33;
							if (local416 >= this.anInt4231) {
								this.anInt4238 -= local33 * this.anInt4231;
								this.anInt4231 = 0;
								break;
							}
							this.anInt4238 -= local33 * local416;
							this.anInt4231 -= local416;
						}
					}
				}
			}
			if (this.anInt4235 < 0) {
				this.method3219(arg0, local40, 0, local44, 0);
				if (this.anInt4238 < 0) {
					this.anInt4238 = -1;
					this.method3258();
					this.method3556();
					return;
				}
			} else {
				this.method3224(arg0, local40, local29, local44, 0);
				if (this.anInt4238 >= local29) {
					this.anInt4238 = local29;
					this.method3258();
					this.method3556();
				}
			}
		} else if (this.aBoolean169) {
			if (this.anInt4235 < 0) {
				local40 = this.method3219(arg0, arg1, local18, local44, local13.aByteArray38[this.anInt4242]);
				if (this.anInt4238 >= local18) {
					return;
				}
				this.anInt4238 = local18 + local18 - this.anInt4238 - 1;
				this.anInt4235 = -this.anInt4235;
			}
			while (true) {
				local40 = this.method3224(arg0, local40, local23, local44, local13.aByteArray38[this.anInt4232 - 1]);
				if (this.anInt4238 < local23) {
					return;
				}
				this.anInt4238 = local23 + local23 - this.anInt4238 - 1;
				this.anInt4235 = -this.anInt4235;
				local40 = this.method3219(arg0, local40, local18, local44, local13.aByteArray38[this.anInt4242]);
				if (this.anInt4238 >= local18) {
					return;
				}
				this.anInt4238 = local18 + local18 - this.anInt4238 - 1;
				this.anInt4235 = -this.anInt4235;
			}
		} else if (this.anInt4235 < 0) {
			while (true) {
				local40 = this.method3219(arg0, local40, local18, local44, local13.aByteArray38[this.anInt4232 - 1]);
				if (this.anInt4238 >= local18) {
					return;
				}
				this.anInt4238 = local23 - (local23 - 1 - this.anInt4238) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3224(arg0, local40, local23, local44, local13.aByteArray38[this.anInt4242]);
				if (this.anInt4238 < local23) {
					return;
				}
				this.anInt4238 = local18 + (this.anInt4238 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()I")
	@Override
	public int method3310() {
		@Pc(6) int local6 = this.anInt4236 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4231 == 0) {
			local6 -= local6 * this.anInt4238 / (((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38.length << 8);
		} else if (this.anInt4231 >= 0) {
			local6 -= local6 * this.anInt4242 / ((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V")
	public synchronized void method3236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3232(arg0, arg1, this.method3229());
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
	public synchronized void method3237(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4238 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	private synchronized void method3238() {
		this.method3240(0, this.method3229());
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
	@Override
	public int method3311() {
		return this.anInt4237 == 0 && this.anInt4240 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(II)V")
	private synchronized void method3240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4237 = arg0;
		this.anInt4241 = arg1;
		this.anInt4240 = 0;
		this.method3225();
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()Lclient!sg;")
	@Override
	public Class2_Sub7 method3314() {
		return null;
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "()Z")
	public boolean method3242() {
		return this.anInt4238 < 0 || this.anInt4238 >= ((Class2_Sub16_Sub1) super.aClass2_Sub16_5).aByteArray38.length << 8;
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
	public synchronized void method3243(@OriginalArg(0) int arg0) {
		this.anInt4231 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "i", descriptor = "()Z")
	private boolean method3246() {
		@Pc(2) int local2 = this.anInt4237;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static205.method3252(local2, this.anInt4241);
			local8 = Static205.method3235(local2, this.anInt4241);
		}
		if (this.anInt4236 != local2 || this.anInt4243 != local10 || this.anInt4233 != local8) {
			if (this.anInt4236 < local2) {
				this.anInt4230 = 1;
				this.anInt4240 = local2 - this.anInt4236;
			} else if (this.anInt4236 > local2) {
				this.anInt4230 = -1;
				this.anInt4240 = this.anInt4236 - local2;
			} else {
				this.anInt4230 = 0;
			}
			if (this.anInt4243 < local10) {
				this.anInt4234 = 1;
				if (this.anInt4240 == 0 || this.anInt4240 > local10 - this.anInt4243) {
					this.anInt4240 = local10 - this.anInt4243;
				}
			} else if (this.anInt4243 > local10) {
				this.anInt4234 = -1;
				if (this.anInt4240 == 0 || this.anInt4240 > this.anInt4243 - local10) {
					this.anInt4240 = this.anInt4243 - local10;
				}
			} else {
				this.anInt4234 = 0;
			}
			if (this.anInt4233 < local8) {
				this.anInt4239 = 1;
				if (this.anInt4240 == 0 || this.anInt4240 > local8 - this.anInt4233) {
					this.anInt4240 = local8 - this.anInt4233;
				}
			} else if (this.anInt4233 > local8) {
				this.anInt4239 = -1;
				if (this.anInt4240 == 0 || this.anInt4240 > this.anInt4233 - local8) {
					this.anInt4240 = this.anInt4233 - local8;
				}
			} else {
				this.anInt4239 = 0;
			}
			return false;
		} else if (this.anInt4237 == Integer.MIN_VALUE) {
			this.anInt4237 = 0;
			this.anInt4236 = this.anInt4243 = this.anInt4233 = 0;
			this.method3556();
			return true;
		} else {
			this.method3225();
			return false;
		}
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "()I")
	public synchronized int method3248() {
		return this.anInt4235 < 0 ? -this.anInt4235 : this.anInt4235;
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
	public synchronized void method3249(@OriginalArg(0) int arg0) {
		this.method3240(arg0 << 6, this.method3229());
	}

	@OriginalMember(owner = "client!td", name = "k", descriptor = "()Z")
	public boolean method3251() {
		return this.anInt4240 != 0;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3309(@OriginalArg(0) int arg0) {
		if (this.anInt4240 > 0) {
			if (arg0 >= this.anInt4240) {
				if (this.anInt4237 == Integer.MIN_VALUE) {
					this.anInt4237 = 0;
					this.anInt4236 = this.anInt4243 = this.anInt4233 = 0;
					this.method3556();
					arg0 = this.anInt4240;
				}
				this.anInt4240 = 0;
				this.method3225();
			} else {
				this.anInt4236 += this.anInt4230 * arg0;
				this.anInt4243 += this.anInt4234 * arg0;
				this.anInt4233 += this.anInt4239 * arg0;
				this.anInt4240 -= arg0;
			}
		}
		@Pc(71) Class2_Sub16_Sub1 local71 = (Class2_Sub16_Sub1) super.aClass2_Sub16_5;
		@Pc(76) int local76 = this.anInt4242 << 8;
		@Pc(81) int local81 = this.anInt4232 << 8;
		@Pc(87) int local87 = local71.aByteArray38.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4231 = 0;
		}
		if (this.anInt4238 < 0) {
			if (this.anInt4235 <= 0) {
				this.method3258();
				this.method3556();
				return;
			}
			this.anInt4238 = 0;
		}
		if (this.anInt4238 >= local87) {
			if (this.anInt4235 >= 0) {
				this.method3258();
				this.method3556();
				return;
			}
			this.anInt4238 = local87 - 1;
		}
		this.anInt4238 += this.anInt4235 * arg0;
		if (this.anInt4231 >= 0) {
			if (this.anInt4231 > 0) {
				if (this.aBoolean169) {
					label125: {
						if (this.anInt4235 < 0) {
							if (this.anInt4238 >= local76) {
								return;
							}
							this.anInt4238 = local76 + local76 - this.anInt4238 - 1;
							this.anInt4235 = -this.anInt4235;
							if (--this.anInt4231 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4238 < local81) {
								return;
							}
							this.anInt4238 = local81 + local81 - this.anInt4238 - 1;
							this.anInt4235 = -this.anInt4235;
							if (--this.anInt4231 == 0) {
								break;
							}
							if (this.anInt4238 >= local76) {
								return;
							}
							this.anInt4238 = local76 + local76 - this.anInt4238 - 1;
							this.anInt4235 = -this.anInt4235;
						} while (--this.anInt4231 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4235 < 0) {
						if (this.anInt4238 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4238 - 1) / local91;
						if (local361 < this.anInt4231) {
							this.anInt4238 += local91 * local361;
							this.anInt4231 -= local361;
							return;
						}
						this.anInt4238 += local91 * this.anInt4231;
						this.anInt4231 = 0;
					} else if (this.anInt4238 >= local81) {
						local361 = (this.anInt4238 - local76) / local91;
						if (local361 < this.anInt4231) {
							this.anInt4238 -= local91 * local361;
							this.anInt4231 -= local361;
							return;
						}
						this.anInt4238 -= local91 * this.anInt4231;
						this.anInt4231 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4235 < 0) {
				if (this.anInt4238 < 0) {
					this.anInt4238 = -1;
					this.method3258();
					this.method3556();
					return;
				}
			} else if (this.anInt4238 >= local87) {
				this.anInt4238 = local87;
				this.method3258();
				this.method3556();
			}
		} else if (this.aBoolean169) {
			if (this.anInt4235 < 0) {
				if (this.anInt4238 >= local76) {
					return;
				}
				this.anInt4238 = local76 + local76 - this.anInt4238 - 1;
				this.anInt4235 = -this.anInt4235;
			}
			while (this.anInt4238 >= local81) {
				this.anInt4238 = local81 + local81 - this.anInt4238 - 1;
				this.anInt4235 = -this.anInt4235;
				if (this.anInt4238 >= local76) {
					return;
				}
				this.anInt4238 = local76 + local76 - this.anInt4238 - 1;
				this.anInt4235 = -this.anInt4235;
			}
		} else if (this.anInt4235 < 0) {
			if (this.anInt4238 < local76) {
				this.anInt4238 = local81 - (local81 - 1 - this.anInt4238) % local91 - 1;
			}
		} else if (this.anInt4238 >= local81) {
			this.anInt4238 = local76 + (this.anInt4238 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V")
	public synchronized void method3254(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3238();
			this.method3556();
		} else if (this.anInt4243 == 0 && this.anInt4233 == 0) {
			this.anInt4240 = 0;
			this.anInt4237 = 0;
			this.anInt4236 = 0;
			this.method3556();
		} else {
			@Pc(31) int local31 = -this.anInt4236;
			if (this.anInt4236 > local31) {
				local31 = this.anInt4236;
			}
			if (-this.anInt4243 > local31) {
				local31 = -this.anInt4243;
			}
			if (this.anInt4243 > local31) {
				local31 = this.anInt4243;
			}
			if (-this.anInt4233 > local31) {
				local31 = -this.anInt4233;
			}
			if (this.anInt4233 > local31) {
				local31 = this.anInt4233;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4240 = arg0;
			this.anInt4237 = Integer.MIN_VALUE;
			this.anInt4230 = -this.anInt4236 / arg0;
			this.anInt4234 = -this.anInt4243 / arg0;
			this.anInt4239 = -this.anInt4233 / arg0;
		}
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V")
	public synchronized void method3256(@OriginalArg(0) int arg0) {
		if (this.anInt4235 < 0) {
			this.anInt4235 = -arg0;
		} else {
			this.anInt4235 = arg0;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public synchronized void method3257() {
		this.anInt4235 = (this.anInt4235 ^ this.anInt4235 >> 31) + (this.anInt4235 >>> 31);
		this.anInt4235 = -this.anInt4235;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()Lclient!sg;")
	@Override
	public Class2_Sub7 method3313() {
		return null;
	}

	@OriginalMember(owner = "client!td", name = "l", descriptor = "()V")
	private void method3258() {
		if (this.anInt4240 == 0) {
			return;
		}
		if (this.anInt4237 == Integer.MIN_VALUE) {
			this.anInt4237 = 0;
		}
		this.anInt4240 = 0;
		this.method3225();
	}
}
