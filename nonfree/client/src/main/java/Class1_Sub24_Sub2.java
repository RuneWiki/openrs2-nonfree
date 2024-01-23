import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub24_Sub2 extends Class1_Sub24 {

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private int anInt4360;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public int anInt4361;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public int anInt4362;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	public int anInt4365;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public int anInt4366;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
	public int anInt4367;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
	private int anInt4368;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
	public int anInt4371;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	private int anInt4364;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
	private int anInt4363;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
	private int anInt4369;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	private int anInt4370;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	private int anInt4372;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
	public int anInt4373;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!fn;II)V")
	public Class1_Sub24_Sub2(@OriginalArg(0) Class1_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub5_5 = arg0;
		this.anInt4364 = arg0.anInt1674;
		this.anInt4363 = arg0.anInt1673;
		this.aBoolean301 = arg0.aBoolean90;
		this.anInt4369 = arg1;
		this.anInt4370 = arg2;
		this.anInt4372 = 8192;
		this.anInt4373 = 0;
		this.method3725();
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!fn;III)V")
	public Class1_Sub24_Sub2(@OriginalArg(0) Class1_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass1_Sub5_5 = arg0;
		this.anInt4364 = arg0.anInt1674;
		this.anInt4363 = arg0.anInt1673;
		this.aBoolean301 = arg0.aBoolean90;
		this.anInt4369 = arg1;
		this.anInt4370 = arg2;
		this.anInt4372 = arg3;
		this.anInt4373 = 0;
		this.method3725();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([IIIII)I")
	private int method3701(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt4368 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt4368;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt4368 += arg1;
				if (this.anInt4369 == 256 && (this.anInt4373 & 0xFF) == 0) {
					if (Static257.aBoolean319) {
						arg1 = Static323.method3738(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4367, this.anInt4371, this.anInt4362, this.anInt4365, local7, arg2, this);
					} else {
						arg1 = Static323.method3700(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4366, this.anInt4361, local7, arg2, this);
					}
				} else if (Static257.aBoolean319) {
					arg1 = Static323.method3734(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4367, this.anInt4371, this.anInt4362, this.anInt4365, local7, arg2, this, this.anInt4369, arg4);
				} else {
					arg1 = Static323.method3702(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4366, this.anInt4361, local7, arg2, this, this.anInt4369, arg4);
				}
				this.anInt4368 -= arg1;
				if (this.anInt4368 != 0) {
					return arg1;
				}
				if (!this.method3730()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt4369 == 256 && (this.anInt4373 & 0xFF) == 0) {
				if (Static257.aBoolean319) {
					return Static323.method3721(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4367, this.anInt4371, arg3, arg2, this);
				}
				return Static323.method3716(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4366, arg3, arg2, this);
			}
			if (Static257.aBoolean319) {
				return Static323.method3733(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4367, this.anInt4371, arg3, arg2, this, this.anInt4369, arg4);
			}
			return Static323.method3720(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4366, arg3, arg2, this, this.anInt4369, arg4);
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public synchronized void method3704(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4373 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public synchronized void method3705() {
		this.anInt4369 = (this.anInt4369 ^ this.anInt4369 >> 31) + (this.anInt4369 >>> 31);
		this.anInt4369 = -this.anInt4369;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
	private synchronized void method3706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4370 = arg0;
		this.anInt4372 = arg1;
		this.anInt4368 = 0;
		this.method3725();
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "()I")
	public synchronized int method3707() {
		return this.anInt4372 < 0 ? -1 : this.anInt4372;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "()I")
	public synchronized int method3708() {
		return this.anInt4369 < 0 ? -this.anInt4369 : this.anInt4369;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	public synchronized void method3710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3706(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static323.method3737(arg1, arg2);
		@Pc(14) int local14 = Static323.method3709(arg1, arg2);
		if (this.anInt4367 == local10 && this.anInt4371 == local14) {
			this.anInt4368 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4366;
		if (this.anInt4366 - arg1 > local31) {
			local31 = this.anInt4366 - arg1;
		}
		if (local10 - this.anInt4367 > local31) {
			local31 = local10 - this.anInt4367;
		}
		if (this.anInt4367 - local10 > local31) {
			local31 = this.anInt4367 - local10;
		}
		if (local14 - this.anInt4371 > local31) {
			local31 = local14 - this.anInt4371;
		}
		if (this.anInt4371 - local14 > local31) {
			local31 = this.anInt4371 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4368 = arg0;
		this.anInt4370 = arg1;
		this.anInt4372 = arg2;
		this.anInt4361 = (arg1 - this.anInt4366) / arg0;
		this.anInt4362 = (local10 - this.anInt4367) / arg0;
		this.anInt4365 = (local14 - this.anInt4371) / arg0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V")
	public synchronized void method3712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3710(arg0, arg1, this.method3707());
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "()I")
	@Override
	public int method4621() {
		@Pc(6) int local6 = this.anInt4366 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4360 == 0) {
			local6 -= local6 * this.anInt4373 / (((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21.length << 8);
		} else if (this.anInt4360 >= 0) {
			local6 -= local6 * this.anInt4364 / ((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	public synchronized void method3714(@OriginalArg(0) int arg0) {
		if (this.anInt4369 < 0) {
			this.anInt4369 = -arg0;
		} else {
			this.anInt4369 = arg0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "()V")
	private void method3717() {
		if (this.anInt4368 == 0) {
			return;
		}
		if (this.anInt4370 == Integer.MIN_VALUE) {
			this.anInt4370 = 0;
		}
		this.anInt4368 = 0;
		this.method3725();
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4624(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4370 == 0 && this.anInt4368 == 0) {
			this.method4619(arg2);
			return;
		}
		@Pc(13) Class1_Sub5_Sub1 local13 = (Class1_Sub5_Sub1) this.aClass1_Sub5_5;
		@Pc(18) int local18 = this.anInt4364 << 8;
		@Pc(23) int local23 = this.anInt4363 << 8;
		@Pc(29) int local29 = local13.aByteArray21.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4360 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4373 < 0) {
			if (this.anInt4369 <= 0) {
				this.method3717();
				this.method4779();
				return;
			}
			this.anInt4373 = 0;
		}
		if (this.anInt4373 >= local29) {
			if (this.anInt4369 >= 0) {
				this.method3717();
				this.method4779();
				return;
			}
			this.anInt4373 = local29 - 1;
		}
		if (this.anInt4360 >= 0) {
			if (this.anInt4360 > 0) {
				if (this.aBoolean301) {
					label131: {
						if (this.anInt4369 < 0) {
							local40 = this.method3731(arg0, arg1, local18, local44, local13.aByteArray21[this.anInt4364]);
							if (this.anInt4373 >= local18) {
								return;
							}
							this.anInt4373 = local18 + local18 - this.anInt4373 - 1;
							this.anInt4369 = -this.anInt4369;
							if (--this.anInt4360 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method3701(arg0, local40, local23, local44, local13.aByteArray21[this.anInt4363 - 1]);
							if (this.anInt4373 < local23) {
								return;
							}
							this.anInt4373 = local23 + local23 - this.anInt4373 - 1;
							this.anInt4369 = -this.anInt4369;
							if (--this.anInt4360 == 0) {
								break;
							}
							local40 = this.method3731(arg0, local40, local18, local44, local13.aByteArray21[this.anInt4364]);
							if (this.anInt4373 >= local18) {
								return;
							}
							this.anInt4373 = local18 + local18 - this.anInt4373 - 1;
							this.anInt4369 = -this.anInt4369;
						} while (--this.anInt4360 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt4369 < 0) {
						while (true) {
							local40 = this.method3731(arg0, local40, local18, local44, local13.aByteArray21[this.anInt4363 - 1]);
							if (this.anInt4373 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt4373 - 1) / local33;
							if (local417 >= this.anInt4360) {
								this.anInt4373 += local33 * this.anInt4360;
								this.anInt4360 = 0;
								break;
							}
							this.anInt4373 += local33 * local417;
							this.anInt4360 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method3701(arg0, local40, local23, local44, local13.aByteArray21[this.anInt4364]);
							if (this.anInt4373 < local23) {
								return;
							}
							local417 = (this.anInt4373 - local18) / local33;
							if (local417 >= this.anInt4360) {
								this.anInt4373 -= local33 * this.anInt4360;
								this.anInt4360 = 0;
								break;
							}
							this.anInt4373 -= local33 * local417;
							this.anInt4360 -= local417;
						}
					}
				}
			}
			if (this.anInt4369 < 0) {
				this.method3731(arg0, local40, 0, local44, 0);
				if (this.anInt4373 < 0) {
					this.anInt4373 = -1;
					this.method3717();
					this.method4779();
				}
			} else {
				this.method3701(arg0, local40, local29, local44, 0);
				if (this.anInt4373 >= local29) {
					this.anInt4373 = local29;
					this.method3717();
					this.method4779();
				}
			}
		} else if (this.aBoolean301) {
			if (this.anInt4369 < 0) {
				local40 = this.method3731(arg0, arg1, local18, local44, local13.aByteArray21[this.anInt4364]);
				if (this.anInt4373 >= local18) {
					return;
				}
				this.anInt4373 = local18 + local18 - this.anInt4373 - 1;
				this.anInt4369 = -this.anInt4369;
			}
			while (true) {
				local40 = this.method3701(arg0, local40, local23, local44, local13.aByteArray21[this.anInt4363 - 1]);
				if (this.anInt4373 < local23) {
					return;
				}
				this.anInt4373 = local23 + local23 - this.anInt4373 - 1;
				this.anInt4369 = -this.anInt4369;
				local40 = this.method3731(arg0, local40, local18, local44, local13.aByteArray21[this.anInt4364]);
				if (this.anInt4373 >= local18) {
					return;
				}
				this.anInt4373 = local18 + local18 - this.anInt4373 - 1;
				this.anInt4369 = -this.anInt4369;
			}
		} else if (this.anInt4369 < 0) {
			while (true) {
				local40 = this.method3731(arg0, local40, local18, local44, local13.aByteArray21[this.anInt4363 - 1]);
				if (this.anInt4373 >= local18) {
					return;
				}
				this.anInt4373 = local23 - (local23 - 1 - this.anInt4373) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3701(arg0, local40, local23, local44, local13.aByteArray21[this.anInt4364]);
				if (this.anInt4373 < local23) {
					return;
				}
				this.anInt4373 = local18 + (this.anInt4373 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()Lclient!qd;")
	@Override
	public Class1_Sub24 method4618() {
		return null;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "()I")
	@Override
	public int method4623() {
		return this.anInt4370 == 0 && this.anInt4368 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	public synchronized void method3722(@OriginalArg(0) int arg0) {
		this.anInt4360 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
	public synchronized void method3723(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3736();
			this.method4779();
		} else if (this.anInt4367 == 0 && this.anInt4371 == 0) {
			this.anInt4368 = 0;
			this.anInt4370 = 0;
			this.anInt4366 = 0;
			this.method4779();
		} else {
			@Pc(31) int local31 = -this.anInt4366;
			if (this.anInt4366 > local31) {
				local31 = this.anInt4366;
			}
			if (-this.anInt4367 > local31) {
				local31 = -this.anInt4367;
			}
			if (this.anInt4367 > local31) {
				local31 = this.anInt4367;
			}
			if (-this.anInt4371 > local31) {
				local31 = -this.anInt4371;
			}
			if (this.anInt4371 > local31) {
				local31 = this.anInt4371;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4368 = arg0;
			this.anInt4370 = Integer.MIN_VALUE;
			this.anInt4361 = -this.anInt4366 / arg0;
			this.anInt4362 = -this.anInt4367 / arg0;
			this.anInt4365 = -this.anInt4371 / arg0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "()V")
	private void method3725() {
		this.anInt4366 = this.anInt4370;
		this.anInt4367 = Static323.method3737(this.anInt4370, this.anInt4372);
		this.anInt4371 = Static323.method3709(this.anInt4370, this.anInt4372);
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "()Lclient!qd;")
	@Override
	public Class1_Sub24 method4622() {
		return null;
	}

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "()Z")
	public boolean method3726() {
		return this.anInt4373 < 0 || this.anInt4373 >= ((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21.length << 8;
	}

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "()I")
	public synchronized int method3727() {
		return this.anInt4370 == Integer.MIN_VALUE ? 0 : this.anInt4370;
	}

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "()Z")
	private boolean method3730() {
		@Pc(2) int local2 = this.anInt4370;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static323.method3737(local2, this.anInt4372);
			local8 = Static323.method3709(local2, this.anInt4372);
		}
		if (this.anInt4366 != local2 || this.anInt4367 != local10 || this.anInt4371 != local8) {
			if (this.anInt4366 < local2) {
				this.anInt4361 = 1;
				this.anInt4368 = local2 - this.anInt4366;
			} else if (this.anInt4366 > local2) {
				this.anInt4361 = -1;
				this.anInt4368 = this.anInt4366 - local2;
			} else {
				this.anInt4361 = 0;
			}
			if (this.anInt4367 < local10) {
				this.anInt4362 = 1;
				if (this.anInt4368 == 0 || this.anInt4368 > local10 - this.anInt4367) {
					this.anInt4368 = local10 - this.anInt4367;
				}
			} else if (this.anInt4367 > local10) {
				this.anInt4362 = -1;
				if (this.anInt4368 == 0 || this.anInt4368 > this.anInt4367 - local10) {
					this.anInt4368 = this.anInt4367 - local10;
				}
			} else {
				this.anInt4362 = 0;
			}
			if (this.anInt4371 < local8) {
				this.anInt4365 = 1;
				if (this.anInt4368 == 0 || this.anInt4368 > local8 - this.anInt4371) {
					this.anInt4368 = local8 - this.anInt4371;
				}
			} else if (this.anInt4371 > local8) {
				this.anInt4365 = -1;
				if (this.anInt4368 == 0 || this.anInt4368 > this.anInt4371 - local8) {
					this.anInt4368 = this.anInt4371 - local8;
				}
			} else {
				this.anInt4365 = 0;
			}
			return false;
		} else if (this.anInt4370 == Integer.MIN_VALUE) {
			this.anInt4370 = 0;
			this.anInt4366 = this.anInt4367 = this.anInt4371 = 0;
			this.method4779();
			return true;
		} else {
			this.method3725();
			return false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "([IIIII)I")
	private int method3731(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt4368 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt4368;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt4368 += arg1;
				if (this.anInt4369 == -256 && (this.anInt4373 & 0xFF) == 0) {
					if (Static257.aBoolean319) {
						arg1 = Static323.method3713(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4367, this.anInt4371, this.anInt4362, this.anInt4365, local7, arg2, this);
					} else {
						arg1 = Static323.method3728(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4366, this.anInt4361, local7, arg2, this);
					}
				} else if (Static257.aBoolean319) {
					arg1 = Static323.method3715(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4367, this.anInt4371, this.anInt4362, this.anInt4365, local7, arg2, this, this.anInt4369, arg4);
				} else {
					arg1 = Static323.method3711(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4366, this.anInt4361, local7, arg2, this, this.anInt4369, arg4);
				}
				this.anInt4368 -= arg1;
				if (this.anInt4368 != 0) {
					return arg1;
				}
				if (!this.method3730()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt4369 == -256 && (this.anInt4373 & 0xFF) == 0) {
				if (Static257.aBoolean319) {
					return Static323.method3703(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4367, this.anInt4371, arg3, arg2, this);
				}
				return Static323.method3719(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4366, arg3, arg2, this);
			}
			if (Static257.aBoolean319) {
				return Static323.method3718(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4367, this.anInt4371, arg3, arg2, this, this.anInt4369, arg4);
			}
			return Static323.method3732(((Class1_Sub5_Sub1) this.aClass1_Sub5_5).aByteArray21, arg0, this.anInt4373, arg1, this.anInt4366, arg3, arg2, this, this.anInt4369, arg4);
		}
	}

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "()Z")
	public boolean method3735() {
		return this.anInt4368 != 0;
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)V")
	private synchronized void method3736() {
		this.method3706(0, this.method3707());
	}

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "(I)V")
	public synchronized void method3739(@OriginalArg(0) int arg0) {
		this.method3706(arg0 << 6, this.method3707());
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4619(@OriginalArg(0) int arg0) {
		if (this.anInt4368 > 0) {
			if (arg0 >= this.anInt4368) {
				if (this.anInt4370 == Integer.MIN_VALUE) {
					this.anInt4370 = 0;
					this.anInt4366 = this.anInt4367 = this.anInt4371 = 0;
					this.method4779();
					arg0 = this.anInt4368;
				}
				this.anInt4368 = 0;
				this.method3725();
			} else {
				this.anInt4366 += this.anInt4361 * arg0;
				this.anInt4367 += this.anInt4362 * arg0;
				this.anInt4371 += this.anInt4365 * arg0;
				this.anInt4368 -= arg0;
			}
		}
		@Pc(71) Class1_Sub5_Sub1 local71 = (Class1_Sub5_Sub1) this.aClass1_Sub5_5;
		@Pc(76) int local76 = this.anInt4364 << 8;
		@Pc(81) int local81 = this.anInt4363 << 8;
		@Pc(87) int local87 = local71.aByteArray21.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4360 = 0;
		}
		if (this.anInt4373 < 0) {
			if (this.anInt4369 <= 0) {
				this.method3717();
				this.method4779();
				return;
			}
			this.anInt4373 = 0;
		}
		if (this.anInt4373 >= local87) {
			if (this.anInt4369 >= 0) {
				this.method3717();
				this.method4779();
				return;
			}
			this.anInt4373 = local87 - 1;
		}
		this.anInt4373 += this.anInt4369 * arg0;
		if (this.anInt4360 >= 0) {
			if (this.anInt4360 > 0) {
				if (this.aBoolean301) {
					label121: {
						if (this.anInt4369 < 0) {
							if (this.anInt4373 >= local76) {
								return;
							}
							this.anInt4373 = local76 + local76 - this.anInt4373 - 1;
							this.anInt4369 = -this.anInt4369;
							if (--this.anInt4360 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt4373 < local81) {
								return;
							}
							this.anInt4373 = local81 + local81 - this.anInt4373 - 1;
							this.anInt4369 = -this.anInt4369;
							if (--this.anInt4360 == 0) {
								break;
							}
							if (this.anInt4373 >= local76) {
								return;
							}
							this.anInt4373 = local76 + local76 - this.anInt4373 - 1;
							this.anInt4369 = -this.anInt4369;
						} while (--this.anInt4360 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt4369 < 0) {
							if (this.anInt4373 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt4373 - 1) / local91;
							if (local362 >= this.anInt4360) {
								this.anInt4373 += local91 * this.anInt4360;
								this.anInt4360 = 0;
								break label153;
							}
							this.anInt4373 += local91 * local362;
							this.anInt4360 -= local362;
						} else if (this.anInt4373 >= local81) {
							local362 = (this.anInt4373 - local76) / local91;
							if (local362 >= this.anInt4360) {
								this.anInt4373 -= local91 * this.anInt4360;
								this.anInt4360 = 0;
								break label153;
							}
							this.anInt4373 -= local91 * local362;
							this.anInt4360 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt4369 < 0) {
				if (this.anInt4373 < 0) {
					this.anInt4373 = -1;
					this.method3717();
					this.method4779();
				}
			} else if (this.anInt4373 >= local87) {
				this.anInt4373 = local87;
				this.method3717();
				this.method4779();
			}
		} else if (this.aBoolean301) {
			if (this.anInt4369 < 0) {
				if (this.anInt4373 >= local76) {
					return;
				}
				this.anInt4373 = local76 + local76 - this.anInt4373 - 1;
				this.anInt4369 = -this.anInt4369;
			}
			while (this.anInt4373 >= local81) {
				this.anInt4373 = local81 + local81 - this.anInt4373 - 1;
				this.anInt4369 = -this.anInt4369;
				if (this.anInt4373 >= local76) {
					return;
				}
				this.anInt4373 = local76 + local76 - this.anInt4373 - 1;
				this.anInt4369 = -this.anInt4369;
			}
		} else if (this.anInt4369 < 0) {
			if (this.anInt4373 >= local76) {
				return;
			}
			this.anInt4373 = local81 - (local81 - 1 - this.anInt4373) % local91 - 1;
		} else if (this.anInt4373 >= local81) {
			this.anInt4373 = local76 + (this.anInt4373 - local76) % local91;
		} else {
			return;
		}
	}
}
