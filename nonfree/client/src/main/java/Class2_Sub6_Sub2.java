import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class2_Sub6_Sub2 extends Class2_Sub6 {

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
	public int anInt3330;

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
	private int anInt3332;

	@OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
	public int anInt3334;

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
	public int anInt3336;

	@OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
	public int anInt3337;

	@OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
	public int anInt3340;

	@OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
	private int anInt3341;

	@OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
	public int anInt3343;

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
	private int anInt3335;

	@OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
	private int anInt3338;

	@OriginalMember(owner = "client!oj", name = "G", descriptor = "Z")
	private boolean aBoolean193;

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
	private int anInt3331;

	@OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
	private int anInt3339;

	@OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
	private int anInt3342;

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
	public int anInt3333;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!tf;II)V")
	public Class2_Sub6_Sub2(@OriginalArg(0) Class2_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub9_5 = arg0;
		this.anInt3335 = arg0.anInt4359;
		this.anInt3338 = arg0.anInt4358;
		this.aBoolean193 = arg0.aBoolean271;
		this.anInt3331 = arg1;
		this.anInt3339 = arg2;
		this.anInt3342 = 8192;
		this.anInt3333 = 0;
		this.method2297();
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!tf;III)V")
	public Class2_Sub6_Sub2(@OriginalArg(0) Class2_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub9_5 = arg0;
		this.anInt3335 = arg0.anInt4359;
		this.anInt3338 = arg0.anInt4358;
		this.aBoolean193 = arg0.aBoolean271;
		this.anInt3331 = arg1;
		this.anInt3339 = arg2;
		this.anInt3342 = arg3;
		this.anInt3333 = 0;
		this.method2297();
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	public synchronized void method2269(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2274();
			this.method3314();
		} else if (this.anInt3343 == 0 && this.anInt3330 == 0) {
			this.anInt3341 = 0;
			this.anInt3339 = 0;
			this.anInt3337 = 0;
			this.method3314();
		} else {
			@Pc(31) int local31 = -this.anInt3337;
			if (this.anInt3337 > local31) {
				local31 = this.anInt3337;
			}
			if (-this.anInt3343 > local31) {
				local31 = -this.anInt3343;
			}
			if (this.anInt3343 > local31) {
				local31 = this.anInt3343;
			}
			if (-this.anInt3330 > local31) {
				local31 = -this.anInt3330;
			}
			if (this.anInt3330 > local31) {
				local31 = this.anInt3330;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3341 = arg0;
			this.anInt3339 = Integer.MIN_VALUE;
			this.anInt3336 = -this.anInt3337 / arg0;
			this.anInt3334 = -this.anInt3343 / arg0;
			this.anInt3340 = -this.anInt3330 / arg0;
		}
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "()I")
	@Override
	public int method3089() {
		return this.anInt3339 == 0 && this.anInt3341 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "()Z")
	private boolean method2271() {
		@Pc(2) int local2 = this.anInt3339;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static226.method2289(local2, this.anInt3342);
			local8 = Static226.method2285(local2, this.anInt3342);
		}
		if (this.anInt3337 != local2 || this.anInt3343 != local10 || this.anInt3330 != local8) {
			if (this.anInt3337 < local2) {
				this.anInt3336 = 1;
				this.anInt3341 = local2 - this.anInt3337;
			} else if (this.anInt3337 > local2) {
				this.anInt3336 = -1;
				this.anInt3341 = this.anInt3337 - local2;
			} else {
				this.anInt3336 = 0;
			}
			if (this.anInt3343 < local10) {
				this.anInt3334 = 1;
				if (this.anInt3341 == 0 || this.anInt3341 > local10 - this.anInt3343) {
					this.anInt3341 = local10 - this.anInt3343;
				}
			} else if (this.anInt3343 > local10) {
				this.anInt3334 = -1;
				if (this.anInt3341 == 0 || this.anInt3341 > this.anInt3343 - local10) {
					this.anInt3341 = this.anInt3343 - local10;
				}
			} else {
				this.anInt3334 = 0;
			}
			if (this.anInt3330 < local8) {
				this.anInt3340 = 1;
				if (this.anInt3341 == 0 || this.anInt3341 > local8 - this.anInt3330) {
					this.anInt3341 = local8 - this.anInt3330;
				}
			} else if (this.anInt3330 > local8) {
				this.anInt3340 = -1;
				if (this.anInt3341 == 0 || this.anInt3341 > this.anInt3330 - local8) {
					this.anInt3341 = this.anInt3330 - local8;
				}
			} else {
				this.anInt3340 = 0;
			}
			return false;
		} else if (this.anInt3339 == Integer.MIN_VALUE) {
			this.anInt3339 = 0;
			this.anInt3337 = this.anInt3343 = this.anInt3330 = 0;
			this.method3314();
			return true;
		} else {
			this.method2297();
			return false;
		}
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
	private synchronized void method2274() {
		this.method2298(0, this.method2286());
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "()I")
	@Override
	public int method3088() {
		@Pc(6) int local6 = this.anInt3337 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3332 == 0) {
			local6 -= local6 * this.anInt3333 / (((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61.length << 8);
		} else if (this.anInt3332 >= 0) {
			local6 -= local6 * this.anInt3335 / ((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
	public synchronized void method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2298(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static226.method2289(arg1, arg2);
		@Pc(14) int local14 = Static226.method2285(arg1, arg2);
		if (this.anInt3343 == local10 && this.anInt3330 == local14) {
			this.anInt3341 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3337;
		if (this.anInt3337 - arg1 > local31) {
			local31 = this.anInt3337 - arg1;
		}
		if (local10 - this.anInt3343 > local31) {
			local31 = local10 - this.anInt3343;
		}
		if (this.anInt3343 - local10 > local31) {
			local31 = this.anInt3343 - local10;
		}
		if (local14 - this.anInt3330 > local31) {
			local31 = local14 - this.anInt3330;
		}
		if (this.anInt3330 - local14 > local31) {
			local31 = this.anInt3330 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3341 = arg0;
		this.anInt3339 = arg1;
		this.anInt3342 = arg2;
		this.anInt3336 = (arg1 - this.anInt3337) / arg0;
		this.anInt3334 = (local10 - this.anInt3343) / arg0;
		this.anInt3340 = (local14 - this.anInt3330) / arg0;
	}

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "()I")
	public synchronized int method2276() {
		return this.anInt3339 == Integer.MIN_VALUE ? 0 : this.anInt3339;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([IIIII)I")
	private int method2283(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3341 <= 0) {
				if (this.anInt3331 == 256 && (this.anInt3333 & 0xFF) == 0) {
					if (Static6.aBoolean13) {
						return Static226.method2279(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3343, this.anInt3330, arg3, arg2, this);
					}
					return Static226.method2284(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3337, arg3, arg2, this);
				}
				if (Static6.aBoolean13) {
					return Static226.method2308(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3343, this.anInt3330, arg3, arg2, this, this.anInt3331, arg4);
				}
				return Static226.method2306(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3337, arg3, arg2, this, this.anInt3331, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3341;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3341 += arg1;
			if (this.anInt3331 == 256 && (this.anInt3333 & 0xFF) == 0) {
				if (Static6.aBoolean13) {
					arg1 = Static226.method2282(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3343, this.anInt3330, this.anInt3334, this.anInt3340, local5, arg2, this);
				} else {
					arg1 = Static226.method2305(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3337, this.anInt3336, local5, arg2, this);
				}
			} else if (Static6.aBoolean13) {
				arg1 = Static226.method2273(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3343, this.anInt3330, this.anInt3334, this.anInt3340, local5, arg2, this, this.anInt3331, arg4);
			} else {
				arg1 = Static226.method2270(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3337, this.anInt3336, local5, arg2, this, this.anInt3331, arg4);
			}
			this.anInt3341 -= arg1;
			if (this.anInt3341 != 0) {
				return arg1;
			}
		} while (!this.method2271());
		return arg3;
	}

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "()I")
	public synchronized int method2286() {
		return this.anInt3342 < 0 ? -1 : this.anInt3342;
	}

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "()I")
	public synchronized int method2287() {
		return this.anInt3331 < 0 ? -this.anInt3331 : this.anInt3331;
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
	public synchronized void method2288(@OriginalArg(0) int arg0) {
		if (this.anInt3331 < 0) {
			this.anInt3331 = -arg0;
		} else {
			this.anInt3331 = arg0;
		}
	}

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)V")
	public synchronized void method2291(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3333 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "()Lclient!ef;")
	@Override
	public Class2_Sub6 method3086() {
		return null;
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "()Lclient!ef;")
	@Override
	public Class2_Sub6 method3091() {
		return null;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)V")
	public synchronized void method2294() {
		this.anInt3331 = (this.anInt3331 ^ this.anInt3331 >> 31) + (this.anInt3331 >>> 31);
		this.anInt3331 = -this.anInt3331;
	}

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "()V")
	private void method2296() {
		if (this.anInt3341 == 0) {
			return;
		}
		if (this.anInt3339 == Integer.MIN_VALUE) {
			this.anInt3339 = 0;
		}
		this.anInt3341 = 0;
		this.method2297();
	}

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "()V")
	private void method2297() {
		this.anInt3337 = this.anInt3339;
		this.anInt3343 = Static226.method2289(this.anInt3339, this.anInt3342);
		this.anInt3330 = Static226.method2285(this.anInt3339, this.anInt3342);
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(II)V")
	private synchronized void method2298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3339 = arg0;
		this.anInt3342 = arg1;
		this.anInt3341 = 0;
		this.method2297();
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(II)V")
	public synchronized void method2299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2275(arg0, arg1, this.method2286());
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3085(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3339 == 0 && this.anInt3341 == 0) {
			this.method3090(arg2);
			return;
		}
		@Pc(13) Class2_Sub9_Sub1 local13 = (Class2_Sub9_Sub1) super.aClass2_Sub9_5;
		@Pc(18) int local18 = this.anInt3335 << 8;
		@Pc(23) int local23 = this.anInt3338 << 8;
		@Pc(29) int local29 = local13.aByteArray61.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3332 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3333 < 0) {
			if (this.anInt3331 <= 0) {
				this.method2296();
				this.method3314();
				return;
			}
			this.anInt3333 = 0;
		}
		if (this.anInt3333 >= local29) {
			if (this.anInt3331 >= 0) {
				this.method2296();
				this.method3314();
				return;
			}
			this.anInt3333 = local29 - 1;
		}
		if (this.anInt3332 >= 0) {
			if (this.anInt3332 > 0) {
				if (this.aBoolean193) {
					label130: {
						if (this.anInt3331 < 0) {
							local40 = this.method2301(arg0, arg1, local18, local44, local13.aByteArray61[this.anInt3335]);
							if (this.anInt3333 >= local18) {
								return;
							}
							this.anInt3333 = local18 + local18 - this.anInt3333 - 1;
							this.anInt3331 = -this.anInt3331;
							if (--this.anInt3332 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2283(arg0, local40, local23, local44, local13.aByteArray61[this.anInt3338 - 1]);
							if (this.anInt3333 < local23) {
								return;
							}
							this.anInt3333 = local23 + local23 - this.anInt3333 - 1;
							this.anInt3331 = -this.anInt3331;
							if (--this.anInt3332 == 0) {
								break;
							}
							local40 = this.method2301(arg0, local40, local18, local44, local13.aByteArray61[this.anInt3335]);
							if (this.anInt3333 >= local18) {
								return;
							}
							this.anInt3333 = local18 + local18 - this.anInt3333 - 1;
							this.anInt3331 = -this.anInt3331;
						} while (--this.anInt3332 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3331 < 0) {
						while (true) {
							local40 = this.method2301(arg0, local40, local18, local44, local13.aByteArray61[this.anInt3338 - 1]);
							if (this.anInt3333 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3333 - 1) / local33;
							if (local416 >= this.anInt3332) {
								this.anInt3333 += local33 * this.anInt3332;
								this.anInt3332 = 0;
								break;
							}
							this.anInt3333 += local33 * local416;
							this.anInt3332 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2283(arg0, local40, local23, local44, local13.aByteArray61[this.anInt3335]);
							if (this.anInt3333 < local23) {
								return;
							}
							local416 = (this.anInt3333 - local18) / local33;
							if (local416 >= this.anInt3332) {
								this.anInt3333 -= local33 * this.anInt3332;
								this.anInt3332 = 0;
								break;
							}
							this.anInt3333 -= local33 * local416;
							this.anInt3332 -= local416;
						}
					}
				}
			}
			if (this.anInt3331 < 0) {
				this.method2301(arg0, local40, 0, local44, 0);
				if (this.anInt3333 < 0) {
					this.anInt3333 = -1;
					this.method2296();
					this.method3314();
					return;
				}
			} else {
				this.method2283(arg0, local40, local29, local44, 0);
				if (this.anInt3333 >= local29) {
					this.anInt3333 = local29;
					this.method2296();
					this.method3314();
				}
			}
		} else if (this.aBoolean193) {
			if (this.anInt3331 < 0) {
				local40 = this.method2301(arg0, arg1, local18, local44, local13.aByteArray61[this.anInt3335]);
				if (this.anInt3333 >= local18) {
					return;
				}
				this.anInt3333 = local18 + local18 - this.anInt3333 - 1;
				this.anInt3331 = -this.anInt3331;
			}
			while (true) {
				local40 = this.method2283(arg0, local40, local23, local44, local13.aByteArray61[this.anInt3338 - 1]);
				if (this.anInt3333 < local23) {
					return;
				}
				this.anInt3333 = local23 + local23 - this.anInt3333 - 1;
				this.anInt3331 = -this.anInt3331;
				local40 = this.method2301(arg0, local40, local18, local44, local13.aByteArray61[this.anInt3335]);
				if (this.anInt3333 >= local18) {
					return;
				}
				this.anInt3333 = local18 + local18 - this.anInt3333 - 1;
				this.anInt3331 = -this.anInt3331;
			}
		} else if (this.anInt3331 < 0) {
			while (true) {
				local40 = this.method2301(arg0, local40, local18, local44, local13.aByteArray61[this.anInt3338 - 1]);
				if (this.anInt3333 >= local18) {
					return;
				}
				this.anInt3333 = local23 - (local23 - 1 - this.anInt3333) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2283(arg0, local40, local23, local44, local13.aByteArray61[this.anInt3335]);
				if (this.anInt3333 < local23) {
					return;
				}
				this.anInt3333 = local18 + (this.anInt3333 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)V")
	public synchronized void method2300(@OriginalArg(0) int arg0) {
		this.method2298(arg0 << 6, this.method2286());
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "([IIIII)I")
	private int method2301(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3341 <= 0) {
				if (this.anInt3331 == -256 && (this.anInt3333 & 0xFF) == 0) {
					if (Static6.aBoolean13) {
						return Static226.method2277(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3343, this.anInt3330, arg3, arg2, this);
					}
					return Static226.method2272(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3337, arg3, arg2, this);
				}
				if (Static6.aBoolean13) {
					return Static226.method2295(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3343, this.anInt3330, arg3, arg2, this, this.anInt3331, arg4);
				}
				return Static226.method2290(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3337, arg3, arg2, this, this.anInt3331, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3341;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3341 += arg1;
			if (this.anInt3331 == -256 && (this.anInt3333 & 0xFF) == 0) {
				if (Static6.aBoolean13) {
					arg1 = Static226.method2280(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3343, this.anInt3330, this.anInt3334, this.anInt3340, local5, arg2, this);
				} else {
					arg1 = Static226.method2278(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3337, this.anInt3336, local5, arg2, this);
				}
			} else if (Static6.aBoolean13) {
				arg1 = Static226.method2292(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3343, this.anInt3330, this.anInt3334, this.anInt3340, local5, arg2, this, this.anInt3331, arg4);
			} else {
				arg1 = Static226.method2293(((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61, arg0, this.anInt3333, arg1, this.anInt3337, this.anInt3336, local5, arg2, this, this.anInt3331, arg4);
			}
			this.anInt3341 -= arg1;
			if (this.anInt3341 != 0) {
				return arg1;
			}
		} while (!this.method2271());
		return arg3;
	}

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V")
	public synchronized void method2302(@OriginalArg(0) int arg0) {
		this.anInt3332 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "()Z")
	public boolean method2303() {
		return this.anInt3333 < 0 || this.anInt3333 >= ((Class2_Sub9_Sub1) super.aClass2_Sub9_5).aByteArray61.length << 8;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3090(@OriginalArg(0) int arg0) {
		if (this.anInt3341 > 0) {
			if (arg0 >= this.anInt3341) {
				if (this.anInt3339 == Integer.MIN_VALUE) {
					this.anInt3339 = 0;
					this.anInt3337 = this.anInt3343 = this.anInt3330 = 0;
					this.method3314();
					arg0 = this.anInt3341;
				}
				this.anInt3341 = 0;
				this.method2297();
			} else {
				this.anInt3337 += this.anInt3336 * arg0;
				this.anInt3343 += this.anInt3334 * arg0;
				this.anInt3330 += this.anInt3340 * arg0;
				this.anInt3341 -= arg0;
			}
		}
		@Pc(71) Class2_Sub9_Sub1 local71 = (Class2_Sub9_Sub1) super.aClass2_Sub9_5;
		@Pc(76) int local76 = this.anInt3335 << 8;
		@Pc(81) int local81 = this.anInt3338 << 8;
		@Pc(87) int local87 = local71.aByteArray61.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3332 = 0;
		}
		if (this.anInt3333 < 0) {
			if (this.anInt3331 <= 0) {
				this.method2296();
				this.method3314();
				return;
			}
			this.anInt3333 = 0;
		}
		if (this.anInt3333 >= local87) {
			if (this.anInt3331 >= 0) {
				this.method2296();
				this.method3314();
				return;
			}
			this.anInt3333 = local87 - 1;
		}
		this.anInt3333 += this.anInt3331 * arg0;
		if (this.anInt3332 >= 0) {
			if (this.anInt3332 > 0) {
				if (this.aBoolean193) {
					label125: {
						if (this.anInt3331 < 0) {
							if (this.anInt3333 >= local76) {
								return;
							}
							this.anInt3333 = local76 + local76 - this.anInt3333 - 1;
							this.anInt3331 = -this.anInt3331;
							if (--this.anInt3332 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3333 < local81) {
								return;
							}
							this.anInt3333 = local81 + local81 - this.anInt3333 - 1;
							this.anInt3331 = -this.anInt3331;
							if (--this.anInt3332 == 0) {
								break;
							}
							if (this.anInt3333 >= local76) {
								return;
							}
							this.anInt3333 = local76 + local76 - this.anInt3333 - 1;
							this.anInt3331 = -this.anInt3331;
						} while (--this.anInt3332 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3331 < 0) {
						if (this.anInt3333 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3333 - 1) / local91;
						if (local361 < this.anInt3332) {
							this.anInt3333 += local91 * local361;
							this.anInt3332 -= local361;
							return;
						}
						this.anInt3333 += local91 * this.anInt3332;
						this.anInt3332 = 0;
					} else if (this.anInt3333 >= local81) {
						local361 = (this.anInt3333 - local76) / local91;
						if (local361 < this.anInt3332) {
							this.anInt3333 -= local91 * local361;
							this.anInt3332 -= local361;
							return;
						}
						this.anInt3333 -= local91 * this.anInt3332;
						this.anInt3332 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3331 < 0) {
				if (this.anInt3333 < 0) {
					this.anInt3333 = -1;
					this.method2296();
					this.method3314();
					return;
				}
			} else if (this.anInt3333 >= local87) {
				this.anInt3333 = local87;
				this.method2296();
				this.method3314();
			}
		} else if (this.aBoolean193) {
			if (this.anInt3331 < 0) {
				if (this.anInt3333 >= local76) {
					return;
				}
				this.anInt3333 = local76 + local76 - this.anInt3333 - 1;
				this.anInt3331 = -this.anInt3331;
			}
			while (this.anInt3333 >= local81) {
				this.anInt3333 = local81 + local81 - this.anInt3333 - 1;
				this.anInt3331 = -this.anInt3331;
				if (this.anInt3333 >= local76) {
					return;
				}
				this.anInt3333 = local76 + local76 - this.anInt3333 - 1;
				this.anInt3331 = -this.anInt3331;
			}
		} else if (this.anInt3331 < 0) {
			if (this.anInt3333 < local76) {
				this.anInt3333 = local81 - (local81 - 1 - this.anInt3333) % local91 - 1;
			}
		} else if (this.anInt3333 >= local81) {
			this.anInt3333 = local76 + (this.anInt3333 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "()Z")
	public boolean method2304() {
		return this.anInt3341 != 0;
	}
}
