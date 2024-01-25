import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class3_Sub5_Sub3 extends Class3_Sub5 {

	@OriginalMember(owner = "client!os", name = "t", descriptor = "I")
	public int anInt5396;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "I")
	private int anInt5399;

	@OriginalMember(owner = "client!os", name = "x", descriptor = "I")
	public int anInt5400;

	@OriginalMember(owner = "client!os", name = "y", descriptor = "I")
	private int anInt5401;

	@OriginalMember(owner = "client!os", name = "B", descriptor = "I")
	public int anInt5404;

	@OriginalMember(owner = "client!os", name = "E", descriptor = "I")
	public int anInt5406;

	@OriginalMember(owner = "client!os", name = "G", descriptor = "I")
	public int anInt5408;

	@OriginalMember(owner = "client!os", name = "H", descriptor = "I")
	public int anInt5409;

	@OriginalMember(owner = "client!os", name = "F", descriptor = "I")
	private final int anInt5407;

	@OriginalMember(owner = "client!os", name = "C", descriptor = "I")
	private final int anInt5405;

	@OriginalMember(owner = "client!os", name = "D", descriptor = "Z")
	private final boolean aBoolean396;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "I")
	private int anInt5398;

	@OriginalMember(owner = "client!os", name = "z", descriptor = "I")
	private int anInt5402;

	@OriginalMember(owner = "client!os", name = "u", descriptor = "I")
	private int anInt5397;

	@OriginalMember(owner = "client!os", name = "A", descriptor = "I")
	public int anInt5403;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!eb;II)V")
	public Class3_Sub5_Sub3(@OriginalArg(0) Class3_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub13_5 = arg0;
		this.anInt5407 = arg0.anInt1850;
		this.anInt5405 = arg0.anInt1851;
		this.aBoolean396 = arg0.aBoolean152;
		this.anInt5398 = arg1;
		this.anInt5402 = arg2;
		this.anInt5397 = 8192;
		this.anInt5403 = 0;
		this.method4354();
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!eb;III)V")
	public Class3_Sub5_Sub3(@OriginalArg(0) Class3_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub13_5 = arg0;
		this.anInt5407 = arg0.anInt1850;
		this.anInt5405 = arg0.anInt1851;
		this.aBoolean396 = arg0.aBoolean152;
		this.anInt5398 = arg1;
		this.anInt5402 = arg2;
		this.anInt5397 = arg3;
		this.anInt5403 = 0;
		this.method4354();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
	public synchronized void method4331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4368(arg0, arg1, this.method4340());
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "()Z")
	public boolean method4332() {
		return this.anInt5399 != 0;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "()Lclient!ar;")
	@Override
	public Class3_Sub5 method5188() {
		return null;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V")
	private synchronized void method4334() {
		this.method4362(0, this.method4340());
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V")
	public synchronized void method4336(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5403 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "()I")
	public synchronized int method4340() {
		return this.anInt5397 < 0 ? -1 : this.anInt5397;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "()Z")
	private boolean method4341() {
		@Pc(2) int local2 = this.anInt5402;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static461.method4369(local2, this.anInt5397);
			local8 = Static461.method4357(local2, this.anInt5397);
		}
		if (this.anInt5396 != local2 || this.anInt5409 != local10 || this.anInt5408 != local8) {
			if (this.anInt5396 < local2) {
				this.anInt5404 = 1;
				this.anInt5399 = local2 - this.anInt5396;
			} else if (this.anInt5396 > local2) {
				this.anInt5404 = -1;
				this.anInt5399 = this.anInt5396 - local2;
			} else {
				this.anInt5404 = 0;
			}
			if (this.anInt5409 < local10) {
				this.anInt5406 = 1;
				if (this.anInt5399 == 0 || this.anInt5399 > local10 - this.anInt5409) {
					this.anInt5399 = local10 - this.anInt5409;
				}
			} else if (this.anInt5409 > local10) {
				this.anInt5406 = -1;
				if (this.anInt5399 == 0 || this.anInt5399 > this.anInt5409 - local10) {
					this.anInt5399 = this.anInt5409 - local10;
				}
			} else {
				this.anInt5406 = 0;
			}
			if (this.anInt5408 < local8) {
				this.anInt5400 = 1;
				if (this.anInt5399 == 0 || this.anInt5399 > local8 - this.anInt5408) {
					this.anInt5399 = local8 - this.anInt5408;
				}
			} else if (this.anInt5408 > local8) {
				this.anInt5400 = -1;
				if (this.anInt5399 == 0 || this.anInt5399 > this.anInt5408 - local8) {
					this.anInt5399 = this.anInt5408 - local8;
				}
			} else {
				this.anInt5400 = 0;
			}
			return false;
		} else if (this.anInt5402 == Integer.MIN_VALUE) {
			this.anInt5402 = 0;
			this.anInt5396 = this.anInt5409 = this.anInt5408 = 0;
			this.method5987();
			return true;
		} else {
			this.method4354();
			return false;
		}
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
	public synchronized void method4342(@OriginalArg(0) int arg0) {
		if (this.anInt5398 < 0) {
			this.anInt5398 = -arg0;
		} else {
			this.anInt5398 = arg0;
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "()Lclient!ar;")
	@Override
	public Class3_Sub5 method5187() {
		return null;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V")
	public synchronized void method4346(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4334();
			this.method5987();
		} else if (this.anInt5409 == 0 && this.anInt5408 == 0) {
			this.anInt5399 = 0;
			this.anInt5402 = 0;
			this.anInt5396 = 0;
			this.method5987();
		} else {
			@Pc(31) int local31 = -this.anInt5396;
			if (this.anInt5396 > local31) {
				local31 = this.anInt5396;
			}
			if (-this.anInt5409 > local31) {
				local31 = -this.anInt5409;
			}
			if (this.anInt5409 > local31) {
				local31 = this.anInt5409;
			}
			if (-this.anInt5408 > local31) {
				local31 = -this.anInt5408;
			}
			if (this.anInt5408 > local31) {
				local31 = this.anInt5408;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5399 = arg0;
			this.anInt5402 = Integer.MIN_VALUE;
			this.anInt5404 = -this.anInt5396 / arg0;
			this.anInt5406 = -this.anInt5409 / arg0;
			this.anInt5400 = -this.anInt5408 / arg0;
		}
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "()I")
	public synchronized int method4348() {
		return this.anInt5402 == Integer.MIN_VALUE ? 0 : this.anInt5402;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5189(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5402 == 0 && this.anInt5399 == 0) {
			this.method5190(arg2);
			return;
		}
		@Pc(13) Class3_Sub13_Sub1 local13 = (Class3_Sub13_Sub1) super.aClass3_Sub13_5;
		@Pc(18) int local18 = this.anInt5407 << 8;
		@Pc(23) int local23 = this.anInt5405 << 8;
		@Pc(29) int local29 = local13.aByteArray24.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5401 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5403 < 0) {
			if (this.anInt5398 <= 0) {
				this.method4350();
				this.method5987();
				return;
			}
			this.anInt5403 = 0;
		}
		if (this.anInt5403 >= local29) {
			if (this.anInt5398 >= 0) {
				this.method4350();
				this.method5987();
				return;
			}
			this.anInt5403 = local29 - 1;
		}
		if (this.anInt5401 >= 0) {
			if (this.anInt5401 > 0) {
				if (this.aBoolean396) {
					label130: {
						if (this.anInt5398 < 0) {
							local40 = this.method4367(arg0, arg1, local18, local44, local13.aByteArray24[this.anInt5407]);
							if (this.anInt5403 >= local18) {
								return;
							}
							this.anInt5403 = local18 + local18 - this.anInt5403 - 1;
							this.anInt5398 = -this.anInt5398;
							if (--this.anInt5401 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4364(arg0, local40, local23, local44, local13.aByteArray24[this.anInt5405 - 1]);
							if (this.anInt5403 < local23) {
								return;
							}
							this.anInt5403 = local23 + local23 - this.anInt5403 - 1;
							this.anInt5398 = -this.anInt5398;
							if (--this.anInt5401 == 0) {
								break;
							}
							local40 = this.method4367(arg0, local40, local18, local44, local13.aByteArray24[this.anInt5407]);
							if (this.anInt5403 >= local18) {
								return;
							}
							this.anInt5403 = local18 + local18 - this.anInt5403 - 1;
							this.anInt5398 = -this.anInt5398;
						} while (--this.anInt5401 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5398 < 0) {
						while (true) {
							local40 = this.method4367(arg0, local40, local18, local44, local13.aByteArray24[this.anInt5405 - 1]);
							if (this.anInt5403 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5403 - 1) / local33;
							if (local416 >= this.anInt5401) {
								this.anInt5403 += local33 * this.anInt5401;
								this.anInt5401 = 0;
								break;
							}
							this.anInt5403 += local33 * local416;
							this.anInt5401 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4364(arg0, local40, local23, local44, local13.aByteArray24[this.anInt5407]);
							if (this.anInt5403 < local23) {
								return;
							}
							local416 = (this.anInt5403 - local18) / local33;
							if (local416 >= this.anInt5401) {
								this.anInt5403 -= local33 * this.anInt5401;
								this.anInt5401 = 0;
								break;
							}
							this.anInt5403 -= local33 * local416;
							this.anInt5401 -= local416;
						}
					}
				}
			}
			if (this.anInt5398 < 0) {
				this.method4367(arg0, local40, 0, local44, 0);
				if (this.anInt5403 < 0) {
					this.anInt5403 = -1;
					this.method4350();
					this.method5987();
					return;
				}
			} else {
				this.method4364(arg0, local40, local29, local44, 0);
				if (this.anInt5403 >= local29) {
					this.anInt5403 = local29;
					this.method4350();
					this.method5987();
				}
			}
		} else if (this.aBoolean396) {
			if (this.anInt5398 < 0) {
				local40 = this.method4367(arg0, arg1, local18, local44, local13.aByteArray24[this.anInt5407]);
				if (this.anInt5403 >= local18) {
					return;
				}
				this.anInt5403 = local18 + local18 - this.anInt5403 - 1;
				this.anInt5398 = -this.anInt5398;
			}
			while (true) {
				local40 = this.method4364(arg0, local40, local23, local44, local13.aByteArray24[this.anInt5405 - 1]);
				if (this.anInt5403 < local23) {
					return;
				}
				this.anInt5403 = local23 + local23 - this.anInt5403 - 1;
				this.anInt5398 = -this.anInt5398;
				local40 = this.method4367(arg0, local40, local18, local44, local13.aByteArray24[this.anInt5407]);
				if (this.anInt5403 >= local18) {
					return;
				}
				this.anInt5403 = local18 + local18 - this.anInt5403 - 1;
				this.anInt5398 = -this.anInt5398;
			}
		} else if (this.anInt5398 < 0) {
			while (true) {
				local40 = this.method4367(arg0, local40, local18, local44, local13.aByteArray24[this.anInt5405 - 1]);
				if (this.anInt5403 >= local18) {
					return;
				}
				this.anInt5403 = local23 - (local23 - 1 - this.anInt5403) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4364(arg0, local40, local23, local44, local13.aByteArray24[this.anInt5407]);
				if (this.anInt5403 < local23) {
					return;
				}
				this.anInt5403 = local18 + (this.anInt5403 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
	public synchronized void method4349() {
		this.anInt5398 = (this.anInt5398 ^ this.anInt5398 >> 31) + (this.anInt5398 >>> 31);
		this.anInt5398 = -this.anInt5398;
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "()V")
	private void method4350() {
		if (this.anInt5399 == 0) {
			return;
		}
		if (this.anInt5402 == Integer.MIN_VALUE) {
			this.anInt5402 = 0;
		}
		this.anInt5399 = 0;
		this.method4354();
	}

	@OriginalMember(owner = "client!os", name = "j", descriptor = "()V")
	private void method4354() {
		this.anInt5396 = this.anInt5402;
		this.anInt5409 = Static461.method4369(this.anInt5402, this.anInt5397);
		this.anInt5408 = Static461.method4357(this.anInt5402, this.anInt5397);
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(I)V")
	public synchronized void method4356(@OriginalArg(0) int arg0) {
		this.method4362(arg0 << 6, this.method4340());
	}

	@OriginalMember(owner = "client!os", name = "k", descriptor = "()I")
	public synchronized int method4358() {
		return this.anInt5398 < 0 ? -this.anInt5398 : this.anInt5398;
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(I)V")
	public synchronized void method4360(@OriginalArg(0) int arg0) {
		this.anInt5401 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "()I")
	@Override
	public int method5186() {
		@Pc(6) int local6 = this.anInt5396 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5401 == 0) {
			local6 -= local6 * this.anInt5403 / (((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24.length << 8);
		} else if (this.anInt5401 >= 0) {
			local6 -= local6 * this.anInt5407 / ((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(II)V")
	private synchronized void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5402 = arg0;
		this.anInt5397 = arg1;
		this.anInt5399 = 0;
		this.method4354();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([IIIII)I")
	private int method4364(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5399 <= 0) {
				if (this.anInt5398 == 256 && (this.anInt5403 & 0xFF) == 0) {
					if (Static29.aBoolean45) {
						return Static461.method4352(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5409, this.anInt5408, arg3, arg2, this);
					}
					return Static461.method4335(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5396, arg3, arg2, this);
				}
				if (Static29.aBoolean45) {
					return Static461.method4365(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5409, this.anInt5408, arg3, arg2, this, this.anInt5398, arg4);
				}
				return Static461.method4359(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5396, arg3, arg2, this, this.anInt5398, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5399;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5399 += arg1;
			if (this.anInt5398 == 256 && (this.anInt5403 & 0xFF) == 0) {
				if (Static29.aBoolean45) {
					arg1 = Static461.method4337(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5409, this.anInt5408, this.anInt5406, this.anInt5400, local5, arg2, this);
				} else {
					arg1 = Static461.method4345(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5396, this.anInt5404, local5, arg2, this);
				}
			} else if (Static29.aBoolean45) {
				arg1 = Static461.method4353(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5409, this.anInt5408, this.anInt5406, this.anInt5400, local5, arg2, this, this.anInt5398, arg4);
			} else {
				arg1 = Static461.method4355(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5396, this.anInt5404, local5, arg2, this, this.anInt5398, arg4);
			}
			this.anInt5399 -= arg1;
			if (this.anInt5399 != 0) {
				return arg1;
			}
		} while (!this.method4341());
		return arg3;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "()I")
	@Override
	public int method5185() {
		return this.anInt5402 == 0 && this.anInt5399 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5190(@OriginalArg(0) int arg0) {
		if (this.anInt5399 > 0) {
			if (arg0 >= this.anInt5399) {
				if (this.anInt5402 == Integer.MIN_VALUE) {
					this.anInt5402 = 0;
					this.anInt5396 = this.anInt5409 = this.anInt5408 = 0;
					this.method5987();
					arg0 = this.anInt5399;
				}
				this.anInt5399 = 0;
				this.method4354();
			} else {
				this.anInt5396 += this.anInt5404 * arg0;
				this.anInt5409 += this.anInt5406 * arg0;
				this.anInt5408 += this.anInt5400 * arg0;
				this.anInt5399 -= arg0;
			}
		}
		@Pc(71) Class3_Sub13_Sub1 local71 = (Class3_Sub13_Sub1) super.aClass3_Sub13_5;
		@Pc(76) int local76 = this.anInt5407 << 8;
		@Pc(81) int local81 = this.anInt5405 << 8;
		@Pc(87) int local87 = local71.aByteArray24.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5401 = 0;
		}
		if (this.anInt5403 < 0) {
			if (this.anInt5398 <= 0) {
				this.method4350();
				this.method5987();
				return;
			}
			this.anInt5403 = 0;
		}
		if (this.anInt5403 >= local87) {
			if (this.anInt5398 >= 0) {
				this.method4350();
				this.method5987();
				return;
			}
			this.anInt5403 = local87 - 1;
		}
		this.anInt5403 += this.anInt5398 * arg0;
		if (this.anInt5401 >= 0) {
			if (this.anInt5401 > 0) {
				if (this.aBoolean396) {
					label125: {
						if (this.anInt5398 < 0) {
							if (this.anInt5403 >= local76) {
								return;
							}
							this.anInt5403 = local76 + local76 - this.anInt5403 - 1;
							this.anInt5398 = -this.anInt5398;
							if (--this.anInt5401 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5403 < local81) {
								return;
							}
							this.anInt5403 = local81 + local81 - this.anInt5403 - 1;
							this.anInt5398 = -this.anInt5398;
							if (--this.anInt5401 == 0) {
								break;
							}
							if (this.anInt5403 >= local76) {
								return;
							}
							this.anInt5403 = local76 + local76 - this.anInt5403 - 1;
							this.anInt5398 = -this.anInt5398;
						} while (--this.anInt5401 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5398 < 0) {
						if (this.anInt5403 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5403 - 1) / local91;
						if (local361 < this.anInt5401) {
							this.anInt5403 += local91 * local361;
							this.anInt5401 -= local361;
							return;
						}
						this.anInt5403 += local91 * this.anInt5401;
						this.anInt5401 = 0;
					} else if (this.anInt5403 >= local81) {
						local361 = (this.anInt5403 - local76) / local91;
						if (local361 < this.anInt5401) {
							this.anInt5403 -= local91 * local361;
							this.anInt5401 -= local361;
							return;
						}
						this.anInt5403 -= local91 * this.anInt5401;
						this.anInt5401 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5398 < 0) {
				if (this.anInt5403 < 0) {
					this.anInt5403 = -1;
					this.method4350();
					this.method5987();
					return;
				}
			} else if (this.anInt5403 >= local87) {
				this.anInt5403 = local87;
				this.method4350();
				this.method5987();
			}
		} else if (this.aBoolean396) {
			if (this.anInt5398 < 0) {
				if (this.anInt5403 >= local76) {
					return;
				}
				this.anInt5403 = local76 + local76 - this.anInt5403 - 1;
				this.anInt5398 = -this.anInt5398;
			}
			while (this.anInt5403 >= local81) {
				this.anInt5403 = local81 + local81 - this.anInt5403 - 1;
				this.anInt5398 = -this.anInt5398;
				if (this.anInt5403 >= local76) {
					return;
				}
				this.anInt5403 = local76 + local76 - this.anInt5403 - 1;
				this.anInt5398 = -this.anInt5398;
			}
		} else if (this.anInt5398 < 0) {
			if (this.anInt5403 < local76) {
				this.anInt5403 = local81 - (local81 - 1 - this.anInt5403) % local91 - 1;
			}
		} else if (this.anInt5403 >= local81) {
			this.anInt5403 = local76 + (this.anInt5403 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!os", name = "l", descriptor = "()Z")
	public boolean method4366() {
		return this.anInt5403 < 0 || this.anInt5403 >= ((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24.length << 8;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "([IIIII)I")
	private int method4367(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5399 <= 0) {
				if (this.anInt5398 == -256 && (this.anInt5403 & 0xFF) == 0) {
					if (Static29.aBoolean45) {
						return Static461.method4338(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5409, this.anInt5408, arg3, arg2, this);
					}
					return Static461.method4344(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5396, arg3, arg2, this);
				}
				if (Static29.aBoolean45) {
					return Static461.method4347(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5409, this.anInt5408, arg3, arg2, this, this.anInt5398, arg4);
				}
				return Static461.method4361(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5396, arg3, arg2, this, this.anInt5398, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5399;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5399 += arg1;
			if (this.anInt5398 == -256 && (this.anInt5403 & 0xFF) == 0) {
				if (Static29.aBoolean45) {
					arg1 = Static461.method4351(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5409, this.anInt5408, this.anInt5406, this.anInt5400, local5, arg2, this);
				} else {
					arg1 = Static461.method4333(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5396, this.anInt5404, local5, arg2, this);
				}
			} else if (Static29.aBoolean45) {
				arg1 = Static461.method4343(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5409, this.anInt5408, this.anInt5406, this.anInt5400, local5, arg2, this, this.anInt5398, arg4);
			} else {
				arg1 = Static461.method4363(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray24, arg0, this.anInt5403, arg1, this.anInt5396, this.anInt5404, local5, arg2, this, this.anInt5398, arg4);
			}
			this.anInt5399 -= arg1;
			if (this.anInt5399 != 0) {
				return arg1;
			}
		} while (!this.method4341());
		return arg3;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	public synchronized void method4368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4362(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static461.method4369(arg1, arg2);
		@Pc(14) int local14 = Static461.method4357(arg1, arg2);
		if (this.anInt5409 == local10 && this.anInt5408 == local14) {
			this.anInt5399 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5396;
		if (this.anInt5396 - arg1 > local31) {
			local31 = this.anInt5396 - arg1;
		}
		if (local10 - this.anInt5409 > local31) {
			local31 = local10 - this.anInt5409;
		}
		if (this.anInt5409 - local10 > local31) {
			local31 = this.anInt5409 - local10;
		}
		if (local14 - this.anInt5408 > local31) {
			local31 = local14 - this.anInt5408;
		}
		if (this.anInt5408 - local14 > local31) {
			local31 = this.anInt5408 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5399 = arg0;
		this.anInt5402 = arg1;
		this.anInt5397 = arg2;
		this.anInt5404 = (arg1 - this.anInt5396) / arg0;
		this.anInt5406 = (local10 - this.anInt5409) / arg0;
		this.anInt5400 = (local14 - this.anInt5408) / arg0;
	}
}
