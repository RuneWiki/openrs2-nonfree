import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub5_Sub2 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
	public int anInt3251;

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
	public int anInt3253;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
	public int anInt3254;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
	private int anInt3255;

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
	public int anInt3259;

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
	public int anInt3260;

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
	public int anInt3261;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
	private int anInt3263;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	private final int anInt3257;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
	private final int anInt3258;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Z")
	private final boolean aBoolean144;

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
	private int anInt3262;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	private int anInt3264;

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
	private int anInt3256;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
	public int anInt3252;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!jc;II)V")
	public Class2_Sub5_Sub2(@OriginalArg(0) Class2_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub10_5 = arg0;
		this.anInt3257 = arg0.anInt1798;
		this.anInt3258 = arg0.anInt1797;
		this.aBoolean144 = arg0.aBoolean78;
		this.anInt3262 = arg1;
		this.anInt3264 = arg2;
		this.anInt3256 = 8192;
		this.anInt3252 = 0;
		this.method2317();
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!jc;III)V")
	public Class2_Sub5_Sub2(@OriginalArg(0) Class2_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub10_5 = arg0;
		this.anInt3257 = arg0.anInt1798;
		this.anInt3258 = arg0.anInt1797;
		this.aBoolean144 = arg0.aBoolean78;
		this.anInt3262 = arg1;
		this.anInt3264 = arg2;
		this.anInt3256 = arg3;
		this.anInt3252 = 0;
		this.method2317();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([IIIII)I")
	private int method2313(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3255 <= 0) {
				if (this.anInt3262 == -256 && (this.anInt3252 & 0xFF) == 0) {
					if (Static128.aBoolean130) {
						return Static186.method2319(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3261, this.anInt3260, arg3, arg2, this);
					}
					return Static186.method2349(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3253, arg3, arg2, this);
				}
				if (Static128.aBoolean130) {
					return Static186.method2351(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3261, this.anInt3260, arg3, arg2, this, this.anInt3262, arg4);
				}
				return Static186.method2344(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3253, arg3, arg2, this, this.anInt3262, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3255;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3255 += arg1;
			if (this.anInt3262 == -256 && (this.anInt3252 & 0xFF) == 0) {
				if (Static128.aBoolean130) {
					arg1 = Static186.method2314(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3261, this.anInt3260, this.anInt3251, this.anInt3259, local5, arg2, this);
				} else {
					arg1 = Static186.method2331(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3253, this.anInt3254, local5, arg2, this);
				}
			} else if (Static128.aBoolean130) {
				arg1 = Static186.method2325(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3261, this.anInt3260, this.anInt3251, this.anInt3259, local5, arg2, this, this.anInt3262, arg4);
			} else {
				arg1 = Static186.method2337(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3253, this.anInt3254, local5, arg2, this, this.anInt3262, arg4);
			}
			this.anInt3255 -= arg1;
			if (this.anInt3255 != 0) {
				return arg1;
			}
		} while (!this.method2342());
		return arg3;
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	public synchronized void method2316(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3252 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "()V")
	private void method2317() {
		this.anInt3253 = this.anInt3264;
		this.anInt3261 = Static186.method2336(this.anInt3264, this.anInt3256);
		this.anInt3260 = Static186.method2339(this.anInt3264, this.anInt3256);
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
	public synchronized void method2318(@OriginalArg(0) int arg0) {
		this.anInt3263 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
	public synchronized void method2320(@OriginalArg(0) int arg0) {
		this.method2348(arg0 << 6, this.method2330());
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "()V")
	private void method2321() {
		if (this.anInt3255 == 0) {
			return;
		}
		if (this.anInt3264 == Integer.MIN_VALUE) {
			this.anInt3264 = 0;
		}
		this.anInt3255 = 0;
		this.method2317();
	}

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
	private synchronized void method2322() {
		this.method2348(0, this.method2330());
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "([IIIII)I")
	private int method2324(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3255 <= 0) {
				if (this.anInt3262 == 256 && (this.anInt3252 & 0xFF) == 0) {
					if (Static128.aBoolean130) {
						return Static186.method2315(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3261, this.anInt3260, arg3, arg2, this);
					}
					return Static186.method2312(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3253, arg3, arg2, this);
				}
				if (Static128.aBoolean130) {
					return Static186.method2334(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3261, this.anInt3260, arg3, arg2, this, this.anInt3262, arg4);
				}
				return Static186.method2328(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3253, arg3, arg2, this, this.anInt3262, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3255;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3255 += arg1;
			if (this.anInt3262 == 256 && (this.anInt3252 & 0xFF) == 0) {
				if (Static128.aBoolean130) {
					arg1 = Static186.method2350(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3261, this.anInt3260, this.anInt3251, this.anInt3259, local5, arg2, this);
				} else {
					arg1 = Static186.method2323(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3253, this.anInt3254, local5, arg2, this);
				}
			} else if (Static128.aBoolean130) {
				arg1 = Static186.method2343(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3261, this.anInt3260, this.anInt3251, this.anInt3259, local5, arg2, this, this.anInt3262, arg4);
			} else {
				arg1 = Static186.method2327(((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21, arg0, this.anInt3252, arg1, this.anInt3253, this.anInt3254, local5, arg2, this, this.anInt3262, arg4);
			}
			this.anInt3255 -= arg1;
			if (this.anInt3255 != 0) {
				return arg1;
			}
		} while (!this.method2342());
		return arg3;
	}

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "()Z")
	public boolean method2329() {
		return this.anInt3255 != 0;
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "()I")
	public synchronized int method2330() {
		return this.anInt3256 < 0 ? -1 : this.anInt3256;
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "()I")
	@Override
	public int method2657() {
		return this.anInt3264 == 0 && this.anInt3255 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	public synchronized void method2332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2335(arg0, arg1, this.method2330());
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2651(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3264 == 0 && this.anInt3255 == 0) {
			this.method2653(arg2);
			return;
		}
		@Pc(13) Class2_Sub10_Sub1 local13 = (Class2_Sub10_Sub1) super.aClass2_Sub10_5;
		@Pc(18) int local18 = this.anInt3257 << 8;
		@Pc(23) int local23 = this.anInt3258 << 8;
		@Pc(29) int local29 = local13.aByteArray21.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3263 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3252 < 0) {
			if (this.anInt3262 <= 0) {
				this.method2321();
				this.method2705();
				return;
			}
			this.anInt3252 = 0;
		}
		if (this.anInt3252 >= local29) {
			if (this.anInt3262 >= 0) {
				this.method2321();
				this.method2705();
				return;
			}
			this.anInt3252 = local29 - 1;
		}
		if (this.anInt3263 >= 0) {
			if (this.anInt3263 > 0) {
				if (this.aBoolean144) {
					label130: {
						if (this.anInt3262 < 0) {
							local40 = this.method2313(arg0, arg1, local18, local44, local13.aByteArray21[this.anInt3257]);
							if (this.anInt3252 >= local18) {
								return;
							}
							this.anInt3252 = local18 + local18 - this.anInt3252 - 1;
							this.anInt3262 = -this.anInt3262;
							if (--this.anInt3263 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2324(arg0, local40, local23, local44, local13.aByteArray21[this.anInt3258 - 1]);
							if (this.anInt3252 < local23) {
								return;
							}
							this.anInt3252 = local23 + local23 - this.anInt3252 - 1;
							this.anInt3262 = -this.anInt3262;
							if (--this.anInt3263 == 0) {
								break;
							}
							local40 = this.method2313(arg0, local40, local18, local44, local13.aByteArray21[this.anInt3257]);
							if (this.anInt3252 >= local18) {
								return;
							}
							this.anInt3252 = local18 + local18 - this.anInt3252 - 1;
							this.anInt3262 = -this.anInt3262;
						} while (--this.anInt3263 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3262 < 0) {
						while (true) {
							local40 = this.method2313(arg0, local40, local18, local44, local13.aByteArray21[this.anInt3258 - 1]);
							if (this.anInt3252 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3252 - 1) / local33;
							if (local416 >= this.anInt3263) {
								this.anInt3252 += local33 * this.anInt3263;
								this.anInt3263 = 0;
								break;
							}
							this.anInt3252 += local33 * local416;
							this.anInt3263 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2324(arg0, local40, local23, local44, local13.aByteArray21[this.anInt3257]);
							if (this.anInt3252 < local23) {
								return;
							}
							local416 = (this.anInt3252 - local18) / local33;
							if (local416 >= this.anInt3263) {
								this.anInt3252 -= local33 * this.anInt3263;
								this.anInt3263 = 0;
								break;
							}
							this.anInt3252 -= local33 * local416;
							this.anInt3263 -= local416;
						}
					}
				}
			}
			if (this.anInt3262 < 0) {
				this.method2313(arg0, local40, 0, local44, 0);
				if (this.anInt3252 < 0) {
					this.anInt3252 = -1;
					this.method2321();
					this.method2705();
					return;
				}
			} else {
				this.method2324(arg0, local40, local29, local44, 0);
				if (this.anInt3252 >= local29) {
					this.anInt3252 = local29;
					this.method2321();
					this.method2705();
				}
			}
		} else if (this.aBoolean144) {
			if (this.anInt3262 < 0) {
				local40 = this.method2313(arg0, arg1, local18, local44, local13.aByteArray21[this.anInt3257]);
				if (this.anInt3252 >= local18) {
					return;
				}
				this.anInt3252 = local18 + local18 - this.anInt3252 - 1;
				this.anInt3262 = -this.anInt3262;
			}
			while (true) {
				local40 = this.method2324(arg0, local40, local23, local44, local13.aByteArray21[this.anInt3258 - 1]);
				if (this.anInt3252 < local23) {
					return;
				}
				this.anInt3252 = local23 + local23 - this.anInt3252 - 1;
				this.anInt3262 = -this.anInt3262;
				local40 = this.method2313(arg0, local40, local18, local44, local13.aByteArray21[this.anInt3257]);
				if (this.anInt3252 >= local18) {
					return;
				}
				this.anInt3252 = local18 + local18 - this.anInt3252 - 1;
				this.anInt3262 = -this.anInt3262;
			}
		} else if (this.anInt3262 < 0) {
			while (true) {
				local40 = this.method2313(arg0, local40, local18, local44, local13.aByteArray21[this.anInt3258 - 1]);
				if (this.anInt3252 >= local18) {
					return;
				}
				this.anInt3252 = local23 - (local23 - 1 - this.anInt3252) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2324(arg0, local40, local23, local44, local13.aByteArray21[this.anInt3257]);
				if (this.anInt3252 < local23) {
					return;
				}
				this.anInt3252 = local18 + (this.anInt3252 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "()I")
	public synchronized int method2333() {
		return this.anInt3264 == Integer.MIN_VALUE ? 0 : this.anInt3264;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()Lclient!nb;")
	@Override
	public Class2_Sub5 method2655() {
		return null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	public synchronized void method2335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2348(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static186.method2336(arg1, arg2);
		@Pc(14) int local14 = Static186.method2339(arg1, arg2);
		if (this.anInt3261 == local10 && this.anInt3260 == local14) {
			this.anInt3255 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3253;
		if (this.anInt3253 - arg1 > local31) {
			local31 = this.anInt3253 - arg1;
		}
		if (local10 - this.anInt3261 > local31) {
			local31 = local10 - this.anInt3261;
		}
		if (this.anInt3261 - local10 > local31) {
			local31 = this.anInt3261 - local10;
		}
		if (local14 - this.anInt3260 > local31) {
			local31 = local14 - this.anInt3260;
		}
		if (this.anInt3260 - local14 > local31) {
			local31 = this.anInt3260 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3255 = arg0;
		this.anInt3264 = arg1;
		this.anInt3256 = arg2;
		this.anInt3254 = (arg1 - this.anInt3253) / arg0;
		this.anInt3251 = (local10 - this.anInt3261) / arg0;
		this.anInt3259 = (local14 - this.anInt3260) / arg0;
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "(I)V")
	public synchronized void method2338(@OriginalArg(0) int arg0) {
		if (this.anInt3262 < 0) {
			this.anInt3262 = -arg0;
		} else {
			this.anInt3262 = arg0;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()Lclient!nb;")
	@Override
	public Class2_Sub5 method2652() {
		return null;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
	@Override
	public int method2656() {
		@Pc(6) int local6 = this.anInt3253 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3263 == 0) {
			local6 -= local6 * this.anInt3252 / (((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21.length << 8);
		} else if (this.anInt3263 >= 0) {
			local6 -= local6 * this.anInt3257 / ((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public synchronized void method2340() {
		this.anInt3262 = (this.anInt3262 ^ this.anInt3262 >> 31) + (this.anInt3262 >>> 31);
		this.anInt3262 = -this.anInt3262;
	}

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "()I")
	public synchronized int method2341() {
		return this.anInt3262 < 0 ? -this.anInt3262 : this.anInt3262;
	}

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "()Z")
	private boolean method2342() {
		@Pc(2) int local2 = this.anInt3264;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static186.method2336(local2, this.anInt3256);
			local8 = Static186.method2339(local2, this.anInt3256);
		}
		if (this.anInt3253 != local2 || this.anInt3261 != local10 || this.anInt3260 != local8) {
			if (this.anInt3253 < local2) {
				this.anInt3254 = 1;
				this.anInt3255 = local2 - this.anInt3253;
			} else if (this.anInt3253 > local2) {
				this.anInt3254 = -1;
				this.anInt3255 = this.anInt3253 - local2;
			} else {
				this.anInt3254 = 0;
			}
			if (this.anInt3261 < local10) {
				this.anInt3251 = 1;
				if (this.anInt3255 == 0 || this.anInt3255 > local10 - this.anInt3261) {
					this.anInt3255 = local10 - this.anInt3261;
				}
			} else if (this.anInt3261 > local10) {
				this.anInt3251 = -1;
				if (this.anInt3255 == 0 || this.anInt3255 > this.anInt3261 - local10) {
					this.anInt3255 = this.anInt3261 - local10;
				}
			} else {
				this.anInt3251 = 0;
			}
			if (this.anInt3260 < local8) {
				this.anInt3259 = 1;
				if (this.anInt3255 == 0 || this.anInt3255 > local8 - this.anInt3260) {
					this.anInt3255 = local8 - this.anInt3260;
				}
			} else if (this.anInt3260 > local8) {
				this.anInt3259 = -1;
				if (this.anInt3255 == 0 || this.anInt3255 > this.anInt3260 - local8) {
					this.anInt3255 = this.anInt3260 - local8;
				}
			} else {
				this.anInt3259 = 0;
			}
			return false;
		} else if (this.anInt3264 == Integer.MIN_VALUE) {
			this.anInt3264 = 0;
			this.anInt3253 = this.anInt3261 = this.anInt3260 = 0;
			this.method2705();
			return true;
		} else {
			this.method2317();
			return false;
		}
	}

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "(I)V")
	public synchronized void method2345(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2322();
			this.method2705();
		} else if (this.anInt3261 == 0 && this.anInt3260 == 0) {
			this.anInt3255 = 0;
			this.anInt3264 = 0;
			this.anInt3253 = 0;
			this.method2705();
		} else {
			@Pc(31) int local31 = -this.anInt3253;
			if (this.anInt3253 > local31) {
				local31 = this.anInt3253;
			}
			if (-this.anInt3261 > local31) {
				local31 = -this.anInt3261;
			}
			if (this.anInt3261 > local31) {
				local31 = this.anInt3261;
			}
			if (-this.anInt3260 > local31) {
				local31 = -this.anInt3260;
			}
			if (this.anInt3260 > local31) {
				local31 = this.anInt3260;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3255 = arg0;
			this.anInt3264 = Integer.MIN_VALUE;
			this.anInt3254 = -this.anInt3253 / arg0;
			this.anInt3251 = -this.anInt3261 / arg0;
			this.anInt3259 = -this.anInt3260 / arg0;
		}
	}

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "()Z")
	public boolean method2346() {
		return this.anInt3252 < 0 || this.anInt3252 >= ((Class2_Sub10_Sub1) super.aClass2_Sub10_5).aByteArray21.length << 8;
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(II)V")
	private synchronized void method2348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3264 = arg0;
		this.anInt3256 = arg1;
		this.anInt3255 = 0;
		this.method2317();
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2653(@OriginalArg(0) int arg0) {
		if (this.anInt3255 > 0) {
			if (arg0 >= this.anInt3255) {
				if (this.anInt3264 == Integer.MIN_VALUE) {
					this.anInt3264 = 0;
					this.anInt3253 = this.anInt3261 = this.anInt3260 = 0;
					this.method2705();
					arg0 = this.anInt3255;
				}
				this.anInt3255 = 0;
				this.method2317();
			} else {
				this.anInt3253 += this.anInt3254 * arg0;
				this.anInt3261 += this.anInt3251 * arg0;
				this.anInt3260 += this.anInt3259 * arg0;
				this.anInt3255 -= arg0;
			}
		}
		@Pc(71) Class2_Sub10_Sub1 local71 = (Class2_Sub10_Sub1) super.aClass2_Sub10_5;
		@Pc(76) int local76 = this.anInt3257 << 8;
		@Pc(81) int local81 = this.anInt3258 << 8;
		@Pc(87) int local87 = local71.aByteArray21.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3263 = 0;
		}
		if (this.anInt3252 < 0) {
			if (this.anInt3262 <= 0) {
				this.method2321();
				this.method2705();
				return;
			}
			this.anInt3252 = 0;
		}
		if (this.anInt3252 >= local87) {
			if (this.anInt3262 >= 0) {
				this.method2321();
				this.method2705();
				return;
			}
			this.anInt3252 = local87 - 1;
		}
		this.anInt3252 += this.anInt3262 * arg0;
		if (this.anInt3263 >= 0) {
			if (this.anInt3263 > 0) {
				if (this.aBoolean144) {
					label125: {
						if (this.anInt3262 < 0) {
							if (this.anInt3252 >= local76) {
								return;
							}
							this.anInt3252 = local76 + local76 - this.anInt3252 - 1;
							this.anInt3262 = -this.anInt3262;
							if (--this.anInt3263 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3252 < local81) {
								return;
							}
							this.anInt3252 = local81 + local81 - this.anInt3252 - 1;
							this.anInt3262 = -this.anInt3262;
							if (--this.anInt3263 == 0) {
								break;
							}
							if (this.anInt3252 >= local76) {
								return;
							}
							this.anInt3252 = local76 + local76 - this.anInt3252 - 1;
							this.anInt3262 = -this.anInt3262;
						} while (--this.anInt3263 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3262 < 0) {
						if (this.anInt3252 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3252 - 1) / local91;
						if (local361 < this.anInt3263) {
							this.anInt3252 += local91 * local361;
							this.anInt3263 -= local361;
							return;
						}
						this.anInt3252 += local91 * this.anInt3263;
						this.anInt3263 = 0;
					} else if (this.anInt3252 >= local81) {
						local361 = (this.anInt3252 - local76) / local91;
						if (local361 < this.anInt3263) {
							this.anInt3252 -= local91 * local361;
							this.anInt3263 -= local361;
							return;
						}
						this.anInt3252 -= local91 * this.anInt3263;
						this.anInt3263 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3262 < 0) {
				if (this.anInt3252 < 0) {
					this.anInt3252 = -1;
					this.method2321();
					this.method2705();
					return;
				}
			} else if (this.anInt3252 >= local87) {
				this.anInt3252 = local87;
				this.method2321();
				this.method2705();
			}
		} else if (this.aBoolean144) {
			if (this.anInt3262 < 0) {
				if (this.anInt3252 >= local76) {
					return;
				}
				this.anInt3252 = local76 + local76 - this.anInt3252 - 1;
				this.anInt3262 = -this.anInt3262;
			}
			while (this.anInt3252 >= local81) {
				this.anInt3252 = local81 + local81 - this.anInt3252 - 1;
				this.anInt3262 = -this.anInt3262;
				if (this.anInt3252 >= local76) {
					return;
				}
				this.anInt3252 = local76 + local76 - this.anInt3252 - 1;
				this.anInt3262 = -this.anInt3262;
			}
		} else if (this.anInt3262 < 0) {
			if (this.anInt3252 < local76) {
				this.anInt3252 = local81 - (local81 - 1 - this.anInt3252) % local91 - 1;
			}
		} else if (this.anInt3252 >= local81) {
			this.anInt3252 = local76 + (this.anInt3252 - local76) % local91;
		}
	}
}
