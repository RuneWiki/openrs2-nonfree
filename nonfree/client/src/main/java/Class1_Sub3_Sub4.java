import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
	public int anInt3263;

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
	public int anInt3265;

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
	private int anInt3266;

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
	public int anInt3268;

	@OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
	private int anInt3269;

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
	public int anInt3271;

	@OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
	public int anInt3273;

	@OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
	public int anInt3274;

	@OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
	private int anInt3275;

	@OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
	private int anInt3267;

	@OriginalMember(owner = "client!kl", name = "J", descriptor = "Z")
	private boolean aBoolean170;

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
	private int anInt3272;

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
	private int anInt3264;

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
	private int anInt3270;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
	public int anInt3262;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!qj;II)V")
	public Class1_Sub3_Sub4(@OriginalArg(0) Class1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub4_5 = arg0;
		this.anInt3275 = arg0.anInt4841;
		this.anInt3267 = arg0.anInt4840;
		this.aBoolean170 = arg0.aBoolean266;
		this.anInt3272 = arg1;
		this.anInt3264 = arg2;
		this.anInt3270 = 8192;
		this.anInt3262 = 0;
		this.method2551();
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!qj;III)V")
	public Class1_Sub3_Sub4(@OriginalArg(0) Class1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass1_Sub4_5 = arg0;
		this.anInt3275 = arg0.anInt4841;
		this.anInt3267 = arg0.anInt4840;
		this.aBoolean170 = arg0.aBoolean266;
		this.anInt3272 = arg1;
		this.anInt3264 = arg2;
		this.anInt3270 = arg3;
		this.anInt3262 = 0;
		this.method2551();
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "()I")
	public synchronized int method2545() {
		return this.anInt3264 == Integer.MIN_VALUE ? 0 : this.anInt3264;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
	public synchronized void method2547(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2555();
			this.method4742();
		} else if (this.anInt3274 == 0 && this.anInt3273 == 0) {
			this.anInt3269 = 0;
			this.anInt3264 = 0;
			this.anInt3263 = 0;
			this.method4742();
		} else {
			@Pc(31) int local31 = -this.anInt3263;
			if (this.anInt3263 > local31) {
				local31 = this.anInt3263;
			}
			if (-this.anInt3274 > local31) {
				local31 = -this.anInt3274;
			}
			if (this.anInt3274 > local31) {
				local31 = this.anInt3274;
			}
			if (-this.anInt3273 > local31) {
				local31 = -this.anInt3273;
			}
			if (this.anInt3273 > local31) {
				local31 = this.anInt3273;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3269 = arg0;
			this.anInt3264 = Integer.MIN_VALUE;
			this.anInt3271 = -this.anInt3263 / arg0;
			this.anInt3268 = -this.anInt3274 / arg0;
			this.anInt3265 = -this.anInt3273 / arg0;
		}
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
	public synchronized void method2548(@OriginalArg(0) int arg0) {
		this.method2550(arg0 << 6, this.method2566());
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V")
	private synchronized void method2550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3264 = arg0;
		this.anInt3270 = arg1;
		this.anInt3269 = 0;
		this.method2551();
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "()V")
	private void method2551() {
		this.anInt3263 = this.anInt3264;
		this.anInt3274 = Static304.method2562(this.anInt3264, this.anInt3270);
		this.anInt3273 = Static304.method2576(this.anInt3264, this.anInt3270);
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)V")
	private synchronized void method2555() {
		this.method2550(0, this.method2566());
	}

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "()Z")
	public boolean method2556() {
		return this.anInt3262 < 0 || this.anInt3262 >= ((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65.length << 8;
	}

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "()Z")
	private boolean method2558() {
		@Pc(2) int local2 = this.anInt3264;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static304.method2562(local2, this.anInt3270);
			local8 = Static304.method2576(local2, this.anInt3270);
		}
		if (this.anInt3263 != local2 || this.anInt3274 != local10 || this.anInt3273 != local8) {
			if (this.anInt3263 < local2) {
				this.anInt3271 = 1;
				this.anInt3269 = local2 - this.anInt3263;
			} else if (this.anInt3263 > local2) {
				this.anInt3271 = -1;
				this.anInt3269 = this.anInt3263 - local2;
			} else {
				this.anInt3271 = 0;
			}
			if (this.anInt3274 < local10) {
				this.anInt3268 = 1;
				if (this.anInt3269 == 0 || this.anInt3269 > local10 - this.anInt3274) {
					this.anInt3269 = local10 - this.anInt3274;
				}
			} else if (this.anInt3274 > local10) {
				this.anInt3268 = -1;
				if (this.anInt3269 == 0 || this.anInt3269 > this.anInt3274 - local10) {
					this.anInt3269 = this.anInt3274 - local10;
				}
			} else {
				this.anInt3268 = 0;
			}
			if (this.anInt3273 < local8) {
				this.anInt3265 = 1;
				if (this.anInt3269 == 0 || this.anInt3269 > local8 - this.anInt3273) {
					this.anInt3269 = local8 - this.anInt3273;
				}
			} else if (this.anInt3273 > local8) {
				this.anInt3265 = -1;
				if (this.anInt3269 == 0 || this.anInt3269 > this.anInt3273 - local8) {
					this.anInt3269 = this.anInt3273 - local8;
				}
			} else {
				this.anInt3265 = 0;
			}
			return false;
		} else if (this.anInt3264 == Integer.MIN_VALUE) {
			this.anInt3264 = 0;
			this.anInt3263 = this.anInt3274 = this.anInt3273 = 0;
			this.method4742();
			return true;
		} else {
			this.method2551();
			return false;
		}
	}

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "()I")
	public synchronized int method2559() {
		return this.anInt3272 < 0 ? -this.anInt3272 : this.anInt3272;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "()I")
	@Override
	public int method2541() {
		return this.anInt3264 == 0 && this.anInt3269 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "()Lclient!ba;")
	@Override
	public Class1_Sub3 method2542() {
		return null;
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)V")
	public synchronized void method2563(@OriginalArg(0) int arg0) {
		if (this.anInt3272 < 0) {
			this.anInt3272 = -arg0;
		} else {
			this.anInt3272 = arg0;
		}
	}

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "()V")
	private void method2564() {
		if (this.anInt3269 == 0) {
			return;
		}
		if (this.anInt3264 == Integer.MIN_VALUE) {
			this.anInt3264 = 0;
		}
		this.anInt3269 = 0;
		this.method2551();
	}

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "()I")
	public synchronized int method2566() {
		return this.anInt3270 < 0 ? -1 : this.anInt3270;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
	public synchronized void method2568() {
		this.anInt3272 = (this.anInt3272 ^ this.anInt3272 >> 31) + (this.anInt3272 >>> 31);
		this.anInt3272 = -this.anInt3272;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2539(@OriginalArg(0) int arg0) {
		if (this.anInt3269 > 0) {
			if (arg0 >= this.anInt3269) {
				if (this.anInt3264 == Integer.MIN_VALUE) {
					this.anInt3264 = 0;
					this.anInt3263 = this.anInt3274 = this.anInt3273 = 0;
					this.method4742();
					arg0 = this.anInt3269;
				}
				this.anInt3269 = 0;
				this.method2551();
			} else {
				this.anInt3263 += this.anInt3271 * arg0;
				this.anInt3274 += this.anInt3268 * arg0;
				this.anInt3273 += this.anInt3265 * arg0;
				this.anInt3269 -= arg0;
			}
		}
		@Pc(71) Class1_Sub4_Sub1 local71 = (Class1_Sub4_Sub1) this.aClass1_Sub4_5;
		@Pc(76) int local76 = this.anInt3275 << 8;
		@Pc(81) int local81 = this.anInt3267 << 8;
		@Pc(87) int local87 = local71.aByteArray65.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3266 = 0;
		}
		if (this.anInt3262 < 0) {
			if (this.anInt3272 <= 0) {
				this.method2564();
				this.method4742();
				return;
			}
			this.anInt3262 = 0;
		}
		if (this.anInt3262 >= local87) {
			if (this.anInt3272 >= 0) {
				this.method2564();
				this.method4742();
				return;
			}
			this.anInt3262 = local87 - 1;
		}
		this.anInt3262 += this.anInt3272 * arg0;
		if (this.anInt3266 >= 0) {
			if (this.anInt3266 > 0) {
				if (this.aBoolean170) {
					label121: {
						if (this.anInt3272 < 0) {
							if (this.anInt3262 >= local76) {
								return;
							}
							this.anInt3262 = local76 + local76 - this.anInt3262 - 1;
							this.anInt3272 = -this.anInt3272;
							if (--this.anInt3266 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt3262 < local81) {
								return;
							}
							this.anInt3262 = local81 + local81 - this.anInt3262 - 1;
							this.anInt3272 = -this.anInt3272;
							if (--this.anInt3266 == 0) {
								break;
							}
							if (this.anInt3262 >= local76) {
								return;
							}
							this.anInt3262 = local76 + local76 - this.anInt3262 - 1;
							this.anInt3272 = -this.anInt3272;
						} while (--this.anInt3266 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt3272 < 0) {
							if (this.anInt3262 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt3262 - 1) / local91;
							if (local362 >= this.anInt3266) {
								this.anInt3262 += local91 * this.anInt3266;
								this.anInt3266 = 0;
								break label153;
							}
							this.anInt3262 += local91 * local362;
							this.anInt3266 -= local362;
						} else if (this.anInt3262 >= local81) {
							local362 = (this.anInt3262 - local76) / local91;
							if (local362 >= this.anInt3266) {
								this.anInt3262 -= local91 * this.anInt3266;
								this.anInt3266 = 0;
								break label153;
							}
							this.anInt3262 -= local91 * local362;
							this.anInt3266 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt3272 < 0) {
				if (this.anInt3262 < 0) {
					this.anInt3262 = -1;
					this.method2564();
					this.method4742();
				}
			} else if (this.anInt3262 >= local87) {
				this.anInt3262 = local87;
				this.method2564();
				this.method4742();
			}
		} else if (this.aBoolean170) {
			if (this.anInt3272 < 0) {
				if (this.anInt3262 >= local76) {
					return;
				}
				this.anInt3262 = local76 + local76 - this.anInt3262 - 1;
				this.anInt3272 = -this.anInt3272;
			}
			while (this.anInt3262 >= local81) {
				this.anInt3262 = local81 + local81 - this.anInt3262 - 1;
				this.anInt3272 = -this.anInt3272;
				if (this.anInt3262 >= local76) {
					return;
				}
				this.anInt3262 = local76 + local76 - this.anInt3262 - 1;
				this.anInt3272 = -this.anInt3272;
			}
		} else if (this.anInt3272 < 0) {
			if (this.anInt3262 >= local76) {
				return;
			}
			this.anInt3262 = local81 - (local81 - 1 - this.anInt3262) % local91 - 1;
		} else if (this.anInt3262 >= local81) {
			this.anInt3262 = local76 + (this.anInt3262 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([IIIII)I")
	private int method2569(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt3269 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt3269;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt3269 += arg1;
				if (this.anInt3272 == -256 && (this.anInt3262 & 0xFF) == 0) {
					if (Static199.aBoolean240) {
						arg1 = Static304.method2567(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3274, this.anInt3273, this.anInt3268, this.anInt3265, local7, arg2, this);
					} else {
						arg1 = Static304.method2577(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3263, this.anInt3271, local7, arg2, this);
					}
				} else if (Static199.aBoolean240) {
					arg1 = Static304.method2571(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3274, this.anInt3273, this.anInt3268, this.anInt3265, local7, arg2, this, this.anInt3272, arg4);
				} else {
					arg1 = Static304.method2557(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3263, this.anInt3271, local7, arg2, this, this.anInt3272, arg4);
				}
				this.anInt3269 -= arg1;
				if (this.anInt3269 != 0) {
					return arg1;
				}
				if (!this.method2558()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt3272 == -256 && (this.anInt3262 & 0xFF) == 0) {
				if (Static199.aBoolean240) {
					return Static304.method2553(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3274, this.anInt3273, arg3, arg2, this);
				}
				return Static304.method2581(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3263, arg3, arg2, this);
			}
			if (Static199.aBoolean240) {
				return Static304.method2554(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3274, this.anInt3273, arg3, arg2, this, this.anInt3272, arg4);
			}
			return Static304.method2565(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3263, arg3, arg2, this, this.anInt3272, arg4);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()I")
	@Override
	public int method2538() {
		@Pc(6) int local6 = this.anInt3263 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3266 == 0) {
			local6 -= local6 * this.anInt3262 / (((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65.length << 8);
		} else if (this.anInt3266 >= 0) {
			local6 -= local6 * this.anInt3275 / ((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
	public synchronized void method2573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2550(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static304.method2562(arg1, arg2);
		@Pc(14) int local14 = Static304.method2576(arg1, arg2);
		if (this.anInt3274 == local10 && this.anInt3273 == local14) {
			this.anInt3269 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3263;
		if (this.anInt3263 - arg1 > local31) {
			local31 = this.anInt3263 - arg1;
		}
		if (local10 - this.anInt3274 > local31) {
			local31 = local10 - this.anInt3274;
		}
		if (this.anInt3274 - local10 > local31) {
			local31 = this.anInt3274 - local10;
		}
		if (local14 - this.anInt3273 > local31) {
			local31 = local14 - this.anInt3273;
		}
		if (this.anInt3273 - local14 > local31) {
			local31 = this.anInt3273 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3269 = arg0;
		this.anInt3264 = arg1;
		this.anInt3270 = arg2;
		this.anInt3271 = (arg1 - this.anInt3263) / arg0;
		this.anInt3268 = (local10 - this.anInt3274) / arg0;
		this.anInt3265 = (local14 - this.anInt3273) / arg0;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()Lclient!ba;")
	@Override
	public Class1_Sub3 method2543() {
		return null;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "([IIIII)I")
	private int method2578(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt3269 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt3269;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt3269 += arg1;
				if (this.anInt3272 == 256 && (this.anInt3262 & 0xFF) == 0) {
					if (Static199.aBoolean240) {
						arg1 = Static304.method2574(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3274, this.anInt3273, this.anInt3268, this.anInt3265, local7, arg2, this);
					} else {
						arg1 = Static304.method2572(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3263, this.anInt3271, local7, arg2, this);
					}
				} else if (Static199.aBoolean240) {
					arg1 = Static304.method2546(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3274, this.anInt3273, this.anInt3268, this.anInt3265, local7, arg2, this, this.anInt3272, arg4);
				} else {
					arg1 = Static304.method2570(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3263, this.anInt3271, local7, arg2, this, this.anInt3272, arg4);
				}
				this.anInt3269 -= arg1;
				if (this.anInt3269 != 0) {
					return arg1;
				}
				if (!this.method2558()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt3272 == 256 && (this.anInt3262 & 0xFF) == 0) {
				if (Static199.aBoolean240) {
					return Static304.method2560(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3274, this.anInt3273, arg3, arg2, this);
				}
				return Static304.method2584(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3263, arg3, arg2, this);
			}
			if (Static199.aBoolean240) {
				return Static304.method2552(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3274, this.anInt3273, arg3, arg2, this, this.anInt3272, arg4);
			}
			return Static304.method2575(((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65, arg0, this.anInt3262, arg1, this.anInt3263, arg3, arg2, this, this.anInt3272, arg4);
		}
	}

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "()Z")
	public boolean method2579() {
		return this.anInt3269 != 0;
	}

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)V")
	public synchronized void method2580(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub4_Sub1) this.aClass1_Sub4_5).aByteArray65.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3262 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2540(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3264 == 0 && this.anInt3269 == 0) {
			this.method2539(arg2);
			return;
		}
		@Pc(13) Class1_Sub4_Sub1 local13 = (Class1_Sub4_Sub1) this.aClass1_Sub4_5;
		@Pc(18) int local18 = this.anInt3275 << 8;
		@Pc(23) int local23 = this.anInt3267 << 8;
		@Pc(29) int local29 = local13.aByteArray65.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3266 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3262 < 0) {
			if (this.anInt3272 <= 0) {
				this.method2564();
				this.method4742();
				return;
			}
			this.anInt3262 = 0;
		}
		if (this.anInt3262 >= local29) {
			if (this.anInt3272 >= 0) {
				this.method2564();
				this.method4742();
				return;
			}
			this.anInt3262 = local29 - 1;
		}
		if (this.anInt3266 >= 0) {
			if (this.anInt3266 > 0) {
				if (this.aBoolean170) {
					label131: {
						if (this.anInt3272 < 0) {
							local40 = this.method2569(arg0, arg1, local18, local44, local13.aByteArray65[this.anInt3275]);
							if (this.anInt3262 >= local18) {
								return;
							}
							this.anInt3262 = local18 + local18 - this.anInt3262 - 1;
							this.anInt3272 = -this.anInt3272;
							if (--this.anInt3266 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method2578(arg0, local40, local23, local44, local13.aByteArray65[this.anInt3267 - 1]);
							if (this.anInt3262 < local23) {
								return;
							}
							this.anInt3262 = local23 + local23 - this.anInt3262 - 1;
							this.anInt3272 = -this.anInt3272;
							if (--this.anInt3266 == 0) {
								break;
							}
							local40 = this.method2569(arg0, local40, local18, local44, local13.aByteArray65[this.anInt3275]);
							if (this.anInt3262 >= local18) {
								return;
							}
							this.anInt3262 = local18 + local18 - this.anInt3262 - 1;
							this.anInt3272 = -this.anInt3272;
						} while (--this.anInt3266 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt3272 < 0) {
						while (true) {
							local40 = this.method2569(arg0, local40, local18, local44, local13.aByteArray65[this.anInt3267 - 1]);
							if (this.anInt3262 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt3262 - 1) / local33;
							if (local417 >= this.anInt3266) {
								this.anInt3262 += local33 * this.anInt3266;
								this.anInt3266 = 0;
								break;
							}
							this.anInt3262 += local33 * local417;
							this.anInt3266 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method2578(arg0, local40, local23, local44, local13.aByteArray65[this.anInt3275]);
							if (this.anInt3262 < local23) {
								return;
							}
							local417 = (this.anInt3262 - local18) / local33;
							if (local417 >= this.anInt3266) {
								this.anInt3262 -= local33 * this.anInt3266;
								this.anInt3266 = 0;
								break;
							}
							this.anInt3262 -= local33 * local417;
							this.anInt3266 -= local417;
						}
					}
				}
			}
			if (this.anInt3272 < 0) {
				this.method2569(arg0, local40, 0, local44, 0);
				if (this.anInt3262 < 0) {
					this.anInt3262 = -1;
					this.method2564();
					this.method4742();
				}
			} else {
				this.method2578(arg0, local40, local29, local44, 0);
				if (this.anInt3262 >= local29) {
					this.anInt3262 = local29;
					this.method2564();
					this.method4742();
				}
			}
		} else if (this.aBoolean170) {
			if (this.anInt3272 < 0) {
				local40 = this.method2569(arg0, arg1, local18, local44, local13.aByteArray65[this.anInt3275]);
				if (this.anInt3262 >= local18) {
					return;
				}
				this.anInt3262 = local18 + local18 - this.anInt3262 - 1;
				this.anInt3272 = -this.anInt3272;
			}
			while (true) {
				local40 = this.method2578(arg0, local40, local23, local44, local13.aByteArray65[this.anInt3267 - 1]);
				if (this.anInt3262 < local23) {
					return;
				}
				this.anInt3262 = local23 + local23 - this.anInt3262 - 1;
				this.anInt3272 = -this.anInt3272;
				local40 = this.method2569(arg0, local40, local18, local44, local13.aByteArray65[this.anInt3275]);
				if (this.anInt3262 >= local18) {
					return;
				}
				this.anInt3262 = local18 + local18 - this.anInt3262 - 1;
				this.anInt3272 = -this.anInt3272;
			}
		} else if (this.anInt3272 < 0) {
			while (true) {
				local40 = this.method2569(arg0, local40, local18, local44, local13.aByteArray65[this.anInt3267 - 1]);
				if (this.anInt3262 >= local18) {
					return;
				}
				this.anInt3262 = local23 - (local23 - 1 - this.anInt3262) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2578(arg0, local40, local23, local44, local13.aByteArray65[this.anInt3275]);
				if (this.anInt3262 < local23) {
					return;
				}
				this.anInt3262 = local18 + (this.anInt3262 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(II)V")
	public synchronized void method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2573(arg0, arg1, this.method2566());
	}

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)V")
	public synchronized void method2583(@OriginalArg(0) int arg0) {
		this.anInt3266 = arg0;
	}
}
