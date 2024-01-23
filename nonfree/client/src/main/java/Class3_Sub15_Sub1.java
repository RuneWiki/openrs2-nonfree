import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class3_Sub15_Sub1 extends Class3_Sub15 {

	@OriginalMember(owner = "client!j", name = "r", descriptor = "I")
	public int anInt2389;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "I")
	public int anInt2390;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "I")
	private int anInt2391;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	public int anInt2392;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "I")
	public int anInt2393;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "I")
	public int anInt2394;

	@OriginalMember(owner = "client!j", name = "C", descriptor = "I")
	public int anInt2400;

	@OriginalMember(owner = "client!j", name = "D", descriptor = "I")
	private int anInt2401;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "I")
	private int anInt2395;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "I")
	private int anInt2402;

	@OriginalMember(owner = "client!j", name = "F", descriptor = "Z")
	private boolean aBoolean182;

	@OriginalMember(owner = "client!j", name = "A", descriptor = "I")
	private int anInt2398;

	@OriginalMember(owner = "client!j", name = "B", descriptor = "I")
	private int anInt2399;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "I")
	private int anInt2397;

	@OriginalMember(owner = "client!j", name = "y", descriptor = "I")
	public int anInt2396;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!qj;II)V")
	public Class3_Sub15_Sub1(@OriginalArg(0) Class3_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub11_5 = arg0;
		this.anInt2395 = arg0.anInt4385;
		this.anInt2402 = arg0.anInt4383;
		this.aBoolean182 = arg0.aBoolean313;
		this.anInt2398 = arg1;
		this.anInt2399 = arg2;
		this.anInt2397 = 8192;
		this.anInt2396 = 0;
		this.method2127();
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!qj;III)V")
	public Class3_Sub15_Sub1(@OriginalArg(0) Class3_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass3_Sub11_5 = arg0;
		this.anInt2395 = arg0.anInt4385;
		this.anInt2402 = arg0.anInt4383;
		this.aBoolean182 = arg0.aBoolean313;
		this.anInt2398 = arg1;
		this.anInt2399 = arg2;
		this.anInt2397 = arg3;
		this.anInt2396 = 0;
		this.method2127();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2399 == 0 && this.anInt2391 == 0) {
			this.method4561(arg2);
			return;
		}
		@Pc(13) Class3_Sub11_Sub1 local13 = (Class3_Sub11_Sub1) this.aClass3_Sub11_5;
		@Pc(18) int local18 = this.anInt2395 << 8;
		@Pc(23) int local23 = this.anInt2402 << 8;
		@Pc(29) int local29 = local13.aByteArray59.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2401 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2396 < 0) {
			if (this.anInt2398 <= 0) {
				this.method2111();
				this.method5013();
				return;
			}
			this.anInt2396 = 0;
		}
		if (this.anInt2396 >= local29) {
			if (this.anInt2398 >= 0) {
				this.method2111();
				this.method5013();
				return;
			}
			this.anInt2396 = local29 - 1;
		}
		if (this.anInt2401 >= 0) {
			if (this.anInt2401 > 0) {
				if (this.aBoolean182) {
					label131: {
						if (this.anInt2398 < 0) {
							local40 = this.method2118(arg0, arg1, local18, local44, local13.aByteArray59[this.anInt2395]);
							if (this.anInt2396 >= local18) {
								return;
							}
							this.anInt2396 = local18 + local18 - this.anInt2396 - 1;
							this.anInt2398 = -this.anInt2398;
							if (--this.anInt2401 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method2134(arg0, local40, local23, local44, local13.aByteArray59[this.anInt2402 - 1]);
							if (this.anInt2396 < local23) {
								return;
							}
							this.anInt2396 = local23 + local23 - this.anInt2396 - 1;
							this.anInt2398 = -this.anInt2398;
							if (--this.anInt2401 == 0) {
								break;
							}
							local40 = this.method2118(arg0, local40, local18, local44, local13.aByteArray59[this.anInt2395]);
							if (this.anInt2396 >= local18) {
								return;
							}
							this.anInt2396 = local18 + local18 - this.anInt2396 - 1;
							this.anInt2398 = -this.anInt2398;
						} while (--this.anInt2401 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt2398 < 0) {
						while (true) {
							local40 = this.method2118(arg0, local40, local18, local44, local13.aByteArray59[this.anInt2402 - 1]);
							if (this.anInt2396 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt2396 - 1) / local33;
							if (local417 >= this.anInt2401) {
								this.anInt2396 += local33 * this.anInt2401;
								this.anInt2401 = 0;
								break;
							}
							this.anInt2396 += local33 * local417;
							this.anInt2401 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method2134(arg0, local40, local23, local44, local13.aByteArray59[this.anInt2395]);
							if (this.anInt2396 < local23) {
								return;
							}
							local417 = (this.anInt2396 - local18) / local33;
							if (local417 >= this.anInt2401) {
								this.anInt2396 -= local33 * this.anInt2401;
								this.anInt2401 = 0;
								break;
							}
							this.anInt2396 -= local33 * local417;
							this.anInt2401 -= local417;
						}
					}
				}
			}
			if (this.anInt2398 < 0) {
				this.method2118(arg0, local40, 0, local44, 0);
				if (this.anInt2396 < 0) {
					this.anInt2396 = -1;
					this.method2111();
					this.method5013();
				}
			} else {
				this.method2134(arg0, local40, local29, local44, 0);
				if (this.anInt2396 >= local29) {
					this.anInt2396 = local29;
					this.method2111();
					this.method5013();
				}
			}
		} else if (this.aBoolean182) {
			if (this.anInt2398 < 0) {
				local40 = this.method2118(arg0, arg1, local18, local44, local13.aByteArray59[this.anInt2395]);
				if (this.anInt2396 >= local18) {
					return;
				}
				this.anInt2396 = local18 + local18 - this.anInt2396 - 1;
				this.anInt2398 = -this.anInt2398;
			}
			while (true) {
				local40 = this.method2134(arg0, local40, local23, local44, local13.aByteArray59[this.anInt2402 - 1]);
				if (this.anInt2396 < local23) {
					return;
				}
				this.anInt2396 = local23 + local23 - this.anInt2396 - 1;
				this.anInt2398 = -this.anInt2398;
				local40 = this.method2118(arg0, local40, local18, local44, local13.aByteArray59[this.anInt2395]);
				if (this.anInt2396 >= local18) {
					return;
				}
				this.anInt2396 = local18 + local18 - this.anInt2396 - 1;
				this.anInt2398 = -this.anInt2398;
			}
		} else if (this.anInt2398 < 0) {
			while (true) {
				local40 = this.method2118(arg0, local40, local18, local44, local13.aByteArray59[this.anInt2402 - 1]);
				if (this.anInt2396 >= local18) {
					return;
				}
				this.anInt2396 = local23 - (local23 - 1 - this.anInt2396) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2134(arg0, local40, local23, local44, local13.aByteArray59[this.anInt2395]);
				if (this.anInt2396 < local23) {
					return;
				}
				this.anInt2396 = local18 + (this.anInt2396 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "()V")
	private void method2111() {
		if (this.anInt2391 == 0) {
			return;
		}
		if (this.anInt2399 == Integer.MIN_VALUE) {
			this.anInt2399 = 0;
		}
		this.anInt2391 = 0;
		this.method2127();
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "()I")
	public synchronized int method2115() {
		return this.anInt2399 == Integer.MIN_VALUE ? 0 : this.anInt2399;
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
	public synchronized void method2116(@OriginalArg(0) int arg0) {
		if (this.anInt2398 < 0) {
			this.anInt2398 = -arg0;
		} else {
			this.anInt2398 = arg0;
		}
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "()I")
	public synchronized int method2117() {
		return this.anInt2397 < 0 ? -1 : this.anInt2397;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
	@Override
	public int method4558() {
		@Pc(6) int local6 = this.anInt2390 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2401 == 0) {
			local6 -= local6 * this.anInt2396 / (((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59.length << 8);
		} else if (this.anInt2401 >= 0) {
			local6 -= local6 * this.anInt2395 / ((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([IIIII)I")
	private int method2118(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt2391 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt2391;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt2391 += arg1;
				if (this.anInt2398 == -256 && (this.anInt2396 & 0xFF) == 0) {
					if (Static105.aBoolean156) {
						arg1 = Static319.method2130(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2392, this.anInt2400, this.anInt2389, this.anInt2394, local7, arg2, this);
					} else {
						arg1 = Static319.method2110(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2390, this.anInt2393, local7, arg2, this);
					}
				} else if (Static105.aBoolean156) {
					arg1 = Static319.method2122(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2392, this.anInt2400, this.anInt2389, this.anInt2394, local7, arg2, this, this.anInt2398, arg4);
				} else {
					arg1 = Static319.method2131(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2390, this.anInt2393, local7, arg2, this, this.anInt2398, arg4);
				}
				this.anInt2391 -= arg1;
				if (this.anInt2391 != 0) {
					return arg1;
				}
				if (!this.method2144()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt2398 == -256 && (this.anInt2396 & 0xFF) == 0) {
				if (Static105.aBoolean156) {
					return Static319.method2135(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2392, this.anInt2400, arg3, arg2, this);
				}
				return Static319.method2114(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2390, arg3, arg2, this);
			}
			if (Static105.aBoolean156) {
				return Static319.method2149(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2392, this.anInt2400, arg3, arg2, this, this.anInt2398, arg4);
			}
			return Static319.method2146(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2390, arg3, arg2, this, this.anInt2398, arg4);
		}
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
	public synchronized void method2120(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2396 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()Lclient!ph;")
	@Override
	public Class3_Sub15 method4559() {
		return null;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V")
	public synchronized void method2124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2129(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static319.method2147(arg1, arg2);
		@Pc(14) int local14 = Static319.method2140(arg1, arg2);
		if (this.anInt2392 == local10 && this.anInt2400 == local14) {
			this.anInt2391 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2390;
		if (this.anInt2390 - arg1 > local31) {
			local31 = this.anInt2390 - arg1;
		}
		if (local10 - this.anInt2392 > local31) {
			local31 = local10 - this.anInt2392;
		}
		if (this.anInt2392 - local10 > local31) {
			local31 = this.anInt2392 - local10;
		}
		if (local14 - this.anInt2400 > local31) {
			local31 = local14 - this.anInt2400;
		}
		if (this.anInt2400 - local14 > local31) {
			local31 = this.anInt2400 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2391 = arg0;
		this.anInt2399 = arg1;
		this.anInt2397 = arg2;
		this.anInt2393 = (arg1 - this.anInt2390) / arg0;
		this.anInt2389 = (local10 - this.anInt2392) / arg0;
		this.anInt2394 = (local14 - this.anInt2400) / arg0;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public synchronized void method2125(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2136();
			this.method5013();
		} else if (this.anInt2392 == 0 && this.anInt2400 == 0) {
			this.anInt2391 = 0;
			this.anInt2399 = 0;
			this.anInt2390 = 0;
			this.method5013();
		} else {
			@Pc(31) int local31 = -this.anInt2390;
			if (this.anInt2390 > local31) {
				local31 = this.anInt2390;
			}
			if (-this.anInt2392 > local31) {
				local31 = -this.anInt2392;
			}
			if (this.anInt2392 > local31) {
				local31 = this.anInt2392;
			}
			if (-this.anInt2400 > local31) {
				local31 = -this.anInt2400;
			}
			if (this.anInt2400 > local31) {
				local31 = this.anInt2400;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2391 = arg0;
			this.anInt2399 = Integer.MIN_VALUE;
			this.anInt2393 = -this.anInt2390 / arg0;
			this.anInt2389 = -this.anInt2392 / arg0;
			this.anInt2394 = -this.anInt2400 / arg0;
		}
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "()Z")
	public boolean method2126() {
		return this.anInt2391 != 0;
	}

	@OriginalMember(owner = "client!j", name = "i", descriptor = "()V")
	private void method2127() {
		this.anInt2390 = this.anInt2399;
		this.anInt2392 = Static319.method2147(this.anInt2399, this.anInt2397);
		this.anInt2400 = Static319.method2140(this.anInt2399, this.anInt2397);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
	private synchronized void method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2399 = arg0;
		this.anInt2397 = arg1;
		this.anInt2391 = 0;
		this.method2127();
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(II)V")
	public synchronized void method2132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2124(arg0, arg1, this.method2117());
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V")
	public synchronized void method2133(@OriginalArg(0) int arg0) {
		this.anInt2401 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "([IIIII)I")
	private int method2134(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt2391 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt2391;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt2391 += arg1;
				if (this.anInt2398 == 256 && (this.anInt2396 & 0xFF) == 0) {
					if (Static105.aBoolean156) {
						arg1 = Static319.method2121(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2392, this.anInt2400, this.anInt2389, this.anInt2394, local7, arg2, this);
					} else {
						arg1 = Static319.method2123(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2390, this.anInt2393, local7, arg2, this);
					}
				} else if (Static105.aBoolean156) {
					arg1 = Static319.method2145(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2392, this.anInt2400, this.anInt2389, this.anInt2394, local7, arg2, this, this.anInt2398, arg4);
				} else {
					arg1 = Static319.method2128(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2390, this.anInt2393, local7, arg2, this, this.anInt2398, arg4);
				}
				this.anInt2391 -= arg1;
				if (this.anInt2391 != 0) {
					return arg1;
				}
				if (!this.method2144()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt2398 == 256 && (this.anInt2396 & 0xFF) == 0) {
				if (Static105.aBoolean156) {
					return Static319.method2137(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2392, this.anInt2400, arg3, arg2, this);
				}
				return Static319.method2141(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2390, arg3, arg2, this);
			}
			if (Static105.aBoolean156) {
				return Static319.method2119(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2392, this.anInt2400, arg3, arg2, this, this.anInt2398, arg4);
			}
			return Static319.method2112(((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59, arg0, this.anInt2396, arg1, this.anInt2390, arg3, arg2, this, this.anInt2398, arg4);
		}
	}

	@OriginalMember(owner = "client!j", name = "i", descriptor = "(I)V")
	private synchronized void method2136() {
		this.method2129(0, this.method2117());
	}

	@OriginalMember(owner = "client!j", name = "j", descriptor = "(I)V")
	public synchronized void method2138(@OriginalArg(0) int arg0) {
		this.method2129(arg0 << 6, this.method2117());
	}

	@OriginalMember(owner = "client!j", name = "j", descriptor = "()Z")
	public boolean method2139() {
		return this.anInt2396 < 0 || this.anInt2396 >= ((Class3_Sub11_Sub1) this.aClass3_Sub11_5).aByteArray59.length << 8;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()Lclient!ph;")
	@Override
	public Class3_Sub15 method4563() {
		return null;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4561(@OriginalArg(0) int arg0) {
		if (this.anInt2391 > 0) {
			if (arg0 >= this.anInt2391) {
				if (this.anInt2399 == Integer.MIN_VALUE) {
					this.anInt2399 = 0;
					this.anInt2390 = this.anInt2392 = this.anInt2400 = 0;
					this.method5013();
					arg0 = this.anInt2391;
				}
				this.anInt2391 = 0;
				this.method2127();
			} else {
				this.anInt2390 += this.anInt2393 * arg0;
				this.anInt2392 += this.anInt2389 * arg0;
				this.anInt2400 += this.anInt2394 * arg0;
				this.anInt2391 -= arg0;
			}
		}
		@Pc(71) Class3_Sub11_Sub1 local71 = (Class3_Sub11_Sub1) this.aClass3_Sub11_5;
		@Pc(76) int local76 = this.anInt2395 << 8;
		@Pc(81) int local81 = this.anInt2402 << 8;
		@Pc(87) int local87 = local71.aByteArray59.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2401 = 0;
		}
		if (this.anInt2396 < 0) {
			if (this.anInt2398 <= 0) {
				this.method2111();
				this.method5013();
				return;
			}
			this.anInt2396 = 0;
		}
		if (this.anInt2396 >= local87) {
			if (this.anInt2398 >= 0) {
				this.method2111();
				this.method5013();
				return;
			}
			this.anInt2396 = local87 - 1;
		}
		this.anInt2396 += this.anInt2398 * arg0;
		if (this.anInt2401 >= 0) {
			if (this.anInt2401 > 0) {
				if (this.aBoolean182) {
					label121: {
						if (this.anInt2398 < 0) {
							if (this.anInt2396 >= local76) {
								return;
							}
							this.anInt2396 = local76 + local76 - this.anInt2396 - 1;
							this.anInt2398 = -this.anInt2398;
							if (--this.anInt2401 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt2396 < local81) {
								return;
							}
							this.anInt2396 = local81 + local81 - this.anInt2396 - 1;
							this.anInt2398 = -this.anInt2398;
							if (--this.anInt2401 == 0) {
								break;
							}
							if (this.anInt2396 >= local76) {
								return;
							}
							this.anInt2396 = local76 + local76 - this.anInt2396 - 1;
							this.anInt2398 = -this.anInt2398;
						} while (--this.anInt2401 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt2398 < 0) {
							if (this.anInt2396 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt2396 - 1) / local91;
							if (local362 >= this.anInt2401) {
								this.anInt2396 += local91 * this.anInt2401;
								this.anInt2401 = 0;
								break label153;
							}
							this.anInt2396 += local91 * local362;
							this.anInt2401 -= local362;
						} else if (this.anInt2396 >= local81) {
							local362 = (this.anInt2396 - local76) / local91;
							if (local362 >= this.anInt2401) {
								this.anInt2396 -= local91 * this.anInt2401;
								this.anInt2401 = 0;
								break label153;
							}
							this.anInt2396 -= local91 * local362;
							this.anInt2401 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt2398 < 0) {
				if (this.anInt2396 < 0) {
					this.anInt2396 = -1;
					this.method2111();
					this.method5013();
				}
			} else if (this.anInt2396 >= local87) {
				this.anInt2396 = local87;
				this.method2111();
				this.method5013();
			}
		} else if (this.aBoolean182) {
			if (this.anInt2398 < 0) {
				if (this.anInt2396 >= local76) {
					return;
				}
				this.anInt2396 = local76 + local76 - this.anInt2396 - 1;
				this.anInt2398 = -this.anInt2398;
			}
			while (this.anInt2396 >= local81) {
				this.anInt2396 = local81 + local81 - this.anInt2396 - 1;
				this.anInt2398 = -this.anInt2398;
				if (this.anInt2396 >= local76) {
					return;
				}
				this.anInt2396 = local76 + local76 - this.anInt2396 - 1;
				this.anInt2398 = -this.anInt2398;
			}
		} else if (this.anInt2398 < 0) {
			if (this.anInt2396 >= local76) {
				return;
			}
			this.anInt2396 = local81 - (local81 - 1 - this.anInt2396) % local91 - 1;
		} else if (this.anInt2396 >= local81) {
			this.anInt2396 = local76 + (this.anInt2396 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!j", name = "k", descriptor = "()I")
	public synchronized int method2142() {
		return this.anInt2398 < 0 ? -this.anInt2398 : this.anInt2398;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public synchronized void method2143() {
		this.anInt2398 = (this.anInt2398 ^ this.anInt2398 >> 31) + (this.anInt2398 >>> 31);
		this.anInt2398 = -this.anInt2398;
	}

	@OriginalMember(owner = "client!j", name = "l", descriptor = "()Z")
	private boolean method2144() {
		@Pc(2) int local2 = this.anInt2399;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static319.method2147(local2, this.anInt2397);
			local8 = Static319.method2140(local2, this.anInt2397);
		}
		if (this.anInt2390 != local2 || this.anInt2392 != local10 || this.anInt2400 != local8) {
			if (this.anInt2390 < local2) {
				this.anInt2393 = 1;
				this.anInt2391 = local2 - this.anInt2390;
			} else if (this.anInt2390 > local2) {
				this.anInt2393 = -1;
				this.anInt2391 = this.anInt2390 - local2;
			} else {
				this.anInt2393 = 0;
			}
			if (this.anInt2392 < local10) {
				this.anInt2389 = 1;
				if (this.anInt2391 == 0 || this.anInt2391 > local10 - this.anInt2392) {
					this.anInt2391 = local10 - this.anInt2392;
				}
			} else if (this.anInt2392 > local10) {
				this.anInt2389 = -1;
				if (this.anInt2391 == 0 || this.anInt2391 > this.anInt2392 - local10) {
					this.anInt2391 = this.anInt2392 - local10;
				}
			} else {
				this.anInt2389 = 0;
			}
			if (this.anInt2400 < local8) {
				this.anInt2394 = 1;
				if (this.anInt2391 == 0 || this.anInt2391 > local8 - this.anInt2400) {
					this.anInt2391 = local8 - this.anInt2400;
				}
			} else if (this.anInt2400 > local8) {
				this.anInt2394 = -1;
				if (this.anInt2391 == 0 || this.anInt2391 > this.anInt2400 - local8) {
					this.anInt2391 = this.anInt2400 - local8;
				}
			} else {
				this.anInt2394 = 0;
			}
			return false;
		} else if (this.anInt2399 == Integer.MIN_VALUE) {
			this.anInt2399 = 0;
			this.anInt2390 = this.anInt2392 = this.anInt2400 = 0;
			this.method5013();
			return true;
		} else {
			this.method2127();
			return false;
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
	@Override
	public int method4564() {
		return this.anInt2399 == 0 && this.anInt2391 == 0 ? 0 : 1;
	}
}
