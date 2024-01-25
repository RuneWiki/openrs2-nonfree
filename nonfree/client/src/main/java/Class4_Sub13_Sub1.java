import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class4_Sub13_Sub1 extends Class4_Sub13 {

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
	public int anInt2330;

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
	public int anInt2332;

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
	public int anInt2333;

	@OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
	private int anInt2335;

	@OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
	public int anInt2336;

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
	private int anInt2337;

	@OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
	public int anInt2339;

	@OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
	public int anInt2341;

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
	private final int anInt2329;

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
	private final int anInt2334;

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "Z")
	private final boolean aBoolean197;

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
	private int anInt2331;

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
	private int anInt2338;

	@OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
	private int anInt2340;

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
	public int anInt2328;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!wo;II)V")
	public Class4_Sub13_Sub1(@OriginalArg(0) Class4_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub5_5 = arg0;
		this.anInt2329 = arg0.anInt6832;
		this.anInt2334 = arg0.anInt6831;
		this.aBoolean197 = arg0.aBoolean595;
		this.anInt2331 = arg1;
		this.anInt2338 = arg2;
		this.anInt2340 = 8192;
		this.anInt2328 = 0;
		this.method1953();
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!wo;III)V")
	public Class4_Sub13_Sub1(@OriginalArg(0) Class4_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub5_5 = arg0;
		this.anInt2329 = arg0.anInt6832;
		this.anInt2334 = arg0.anInt6831;
		this.aBoolean197 = arg0.aBoolean595;
		this.anInt2331 = arg1;
		this.anInt2338 = arg2;
		this.anInt2340 = arg3;
		this.anInt2328 = 0;
		this.method1953();
	}

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "()Z")
	public boolean method1918() {
		return this.anInt2335 != 0;
	}

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "()V")
	private void method1919() {
		if (this.anInt2335 == 0) {
			return;
		}
		if (this.anInt2338 == Integer.MIN_VALUE) {
			this.anInt2338 = 0;
		}
		this.anInt2335 = 0;
		this.method1953();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
	public synchronized void method1920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1931(arg0, arg1, this.method1926());
	}

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "()I")
	public synchronized int method1922() {
		return this.anInt2338 == Integer.MIN_VALUE ? 0 : this.anInt2338;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "([IIIII)I")
	private int method1924(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2335 <= 0) {
				if (this.anInt2331 == -256 && (this.anInt2328 & 0xFF) == 0) {
					if (Static288.aBoolean515) {
						return Static359.method1923(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2341, this.anInt2336, arg3, arg2, this);
					}
					return Static359.method1947(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2339, arg3, arg2, this);
				}
				if (Static288.aBoolean515) {
					return Static359.method1921(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2341, this.anInt2336, arg3, arg2, this, this.anInt2331, arg4);
				}
				return Static359.method1949(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2339, arg3, arg2, this, this.anInt2331, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2335;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2335 += arg1;
			if (this.anInt2331 == -256 && (this.anInt2328 & 0xFF) == 0) {
				if (Static288.aBoolean515) {
					arg1 = Static359.method1954(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2341, this.anInt2336, this.anInt2332, this.anInt2333, local5, arg2, this);
				} else {
					arg1 = Static359.method1943(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2339, this.anInt2330, local5, arg2, this);
				}
			} else if (Static288.aBoolean515) {
				arg1 = Static359.method1936(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2341, this.anInt2336, this.anInt2332, this.anInt2333, local5, arg2, this, this.anInt2331, arg4);
			} else {
				arg1 = Static359.method1952(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2339, this.anInt2330, local5, arg2, this, this.anInt2331, arg4);
			}
			this.anInt2335 -= arg1;
			if (this.anInt2335 != 0) {
				return arg1;
			}
		} while (!this.method1955());
		return arg3;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()Lclient!le;")
	@Override
	public Class4_Sub13 method5301() {
		return null;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5299(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2338 == 0 && this.anInt2335 == 0) {
			this.method5300(arg2);
			return;
		}
		@Pc(13) Class4_Sub5_Sub1 local13 = (Class4_Sub5_Sub1) super.aClass4_Sub5_5;
		@Pc(18) int local18 = this.anInt2329 << 8;
		@Pc(23) int local23 = this.anInt2334 << 8;
		@Pc(29) int local29 = local13.aByteArray94.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2337 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2328 < 0) {
			if (this.anInt2331 <= 0) {
				this.method1919();
				this.method5667();
				return;
			}
			this.anInt2328 = 0;
		}
		if (this.anInt2328 >= local29) {
			if (this.anInt2331 >= 0) {
				this.method1919();
				this.method5667();
				return;
			}
			this.anInt2328 = local29 - 1;
		}
		if (this.anInt2337 >= 0) {
			if (this.anInt2337 > 0) {
				if (this.aBoolean197) {
					label130: {
						if (this.anInt2331 < 0) {
							local40 = this.method1924(arg0, arg1, local18, local44, local13.aByteArray94[this.anInt2329]);
							if (this.anInt2328 >= local18) {
								return;
							}
							this.anInt2328 = local18 + local18 - this.anInt2328 - 1;
							this.anInt2331 = -this.anInt2331;
							if (--this.anInt2337 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1928(arg0, local40, local23, local44, local13.aByteArray94[this.anInt2334 - 1]);
							if (this.anInt2328 < local23) {
								return;
							}
							this.anInt2328 = local23 + local23 - this.anInt2328 - 1;
							this.anInt2331 = -this.anInt2331;
							if (--this.anInt2337 == 0) {
								break;
							}
							local40 = this.method1924(arg0, local40, local18, local44, local13.aByteArray94[this.anInt2329]);
							if (this.anInt2328 >= local18) {
								return;
							}
							this.anInt2328 = local18 + local18 - this.anInt2328 - 1;
							this.anInt2331 = -this.anInt2331;
						} while (--this.anInt2337 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2331 < 0) {
						while (true) {
							local40 = this.method1924(arg0, local40, local18, local44, local13.aByteArray94[this.anInt2334 - 1]);
							if (this.anInt2328 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2328 - 1) / local33;
							if (local416 >= this.anInt2337) {
								this.anInt2328 += local33 * this.anInt2337;
								this.anInt2337 = 0;
								break;
							}
							this.anInt2328 += local33 * local416;
							this.anInt2337 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1928(arg0, local40, local23, local44, local13.aByteArray94[this.anInt2329]);
							if (this.anInt2328 < local23) {
								return;
							}
							local416 = (this.anInt2328 - local18) / local33;
							if (local416 >= this.anInt2337) {
								this.anInt2328 -= local33 * this.anInt2337;
								this.anInt2337 = 0;
								break;
							}
							this.anInt2328 -= local33 * local416;
							this.anInt2337 -= local416;
						}
					}
				}
			}
			if (this.anInt2331 < 0) {
				this.method1924(arg0, local40, 0, local44, 0);
				if (this.anInt2328 < 0) {
					this.anInt2328 = -1;
					this.method1919();
					this.method5667();
					return;
				}
			} else {
				this.method1928(arg0, local40, local29, local44, 0);
				if (this.anInt2328 >= local29) {
					this.anInt2328 = local29;
					this.method1919();
					this.method5667();
				}
			}
		} else if (this.aBoolean197) {
			if (this.anInt2331 < 0) {
				local40 = this.method1924(arg0, arg1, local18, local44, local13.aByteArray94[this.anInt2329]);
				if (this.anInt2328 >= local18) {
					return;
				}
				this.anInt2328 = local18 + local18 - this.anInt2328 - 1;
				this.anInt2331 = -this.anInt2331;
			}
			while (true) {
				local40 = this.method1928(arg0, local40, local23, local44, local13.aByteArray94[this.anInt2334 - 1]);
				if (this.anInt2328 < local23) {
					return;
				}
				this.anInt2328 = local23 + local23 - this.anInt2328 - 1;
				this.anInt2331 = -this.anInt2331;
				local40 = this.method1924(arg0, local40, local18, local44, local13.aByteArray94[this.anInt2329]);
				if (this.anInt2328 >= local18) {
					return;
				}
				this.anInt2328 = local18 + local18 - this.anInt2328 - 1;
				this.anInt2331 = -this.anInt2331;
			}
		} else if (this.anInt2331 < 0) {
			while (true) {
				local40 = this.method1924(arg0, local40, local18, local44, local13.aByteArray94[this.anInt2334 - 1]);
				if (this.anInt2328 >= local18) {
					return;
				}
				this.anInt2328 = local23 - (local23 - 1 - this.anInt2328) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1928(arg0, local40, local23, local44, local13.aByteArray94[this.anInt2329]);
				if (this.anInt2328 < local23) {
					return;
				}
				this.anInt2328 = local18 + (this.anInt2328 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "()I")
	public synchronized int method1926() {
		return this.anInt2340 < 0 ? -1 : this.anInt2340;
	}

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V")
	private synchronized void method1927() {
		this.method1950(0, this.method1926());
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "([IIIII)I")
	private int method1928(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2335 <= 0) {
				if (this.anInt2331 == 256 && (this.anInt2328 & 0xFF) == 0) {
					if (Static288.aBoolean515) {
						return Static359.method1917(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2341, this.anInt2336, arg3, arg2, this);
					}
					return Static359.method1932(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2339, arg3, arg2, this);
				}
				if (Static288.aBoolean515) {
					return Static359.method1946(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2341, this.anInt2336, arg3, arg2, this, this.anInt2331, arg4);
				}
				return Static359.method1941(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2339, arg3, arg2, this, this.anInt2331, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2335;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2335 += arg1;
			if (this.anInt2331 == 256 && (this.anInt2328 & 0xFF) == 0) {
				if (Static288.aBoolean515) {
					arg1 = Static359.method1942(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2341, this.anInt2336, this.anInt2332, this.anInt2333, local5, arg2, this);
				} else {
					arg1 = Static359.method1937(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2339, this.anInt2330, local5, arg2, this);
				}
			} else if (Static288.aBoolean515) {
				arg1 = Static359.method1929(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2341, this.anInt2336, this.anInt2332, this.anInt2333, local5, arg2, this, this.anInt2331, arg4);
			} else {
				arg1 = Static359.method1933(((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94, arg0, this.anInt2328, arg1, this.anInt2339, this.anInt2330, local5, arg2, this, this.anInt2331, arg4);
			}
			this.anInt2335 -= arg1;
			if (this.anInt2335 != 0) {
				return arg1;
			}
		} while (!this.method1955());
		return arg3;
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "()I")
	@Override
	public int method5305() {
		return this.anInt2338 == 0 && this.anInt2335 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	public synchronized void method1931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1950(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static359.method1945(arg1, arg2);
		@Pc(14) int local14 = Static359.method1930(arg1, arg2);
		if (this.anInt2341 == local10 && this.anInt2336 == local14) {
			this.anInt2335 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2339;
		if (this.anInt2339 - arg1 > local31) {
			local31 = this.anInt2339 - arg1;
		}
		if (local10 - this.anInt2341 > local31) {
			local31 = local10 - this.anInt2341;
		}
		if (this.anInt2341 - local10 > local31) {
			local31 = this.anInt2341 - local10;
		}
		if (local14 - this.anInt2336 > local31) {
			local31 = local14 - this.anInt2336;
		}
		if (this.anInt2336 - local14 > local31) {
			local31 = this.anInt2336 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2335 = arg0;
		this.anInt2338 = arg1;
		this.anInt2340 = arg2;
		this.anInt2330 = (arg1 - this.anInt2339) / arg0;
		this.anInt2332 = (local10 - this.anInt2341) / arg0;
		this.anInt2333 = (local14 - this.anInt2336) / arg0;
	}

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V")
	public synchronized void method1934(@OriginalArg(0) int arg0) {
		if (this.anInt2331 < 0) {
			this.anInt2331 = -arg0;
		} else {
			this.anInt2331 = arg0;
		}
	}

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "(I)V")
	public synchronized void method1938(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2328 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "(I)V")
	public synchronized void method1939(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1927();
			this.method5667();
		} else if (this.anInt2341 == 0 && this.anInt2336 == 0) {
			this.anInt2335 = 0;
			this.anInt2338 = 0;
			this.anInt2339 = 0;
			this.method5667();
		} else {
			@Pc(31) int local31 = -this.anInt2339;
			if (this.anInt2339 > local31) {
				local31 = this.anInt2339;
			}
			if (-this.anInt2341 > local31) {
				local31 = -this.anInt2341;
			}
			if (this.anInt2341 > local31) {
				local31 = this.anInt2341;
			}
			if (-this.anInt2336 > local31) {
				local31 = -this.anInt2336;
			}
			if (this.anInt2336 > local31) {
				local31 = this.anInt2336;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2335 = arg0;
			this.anInt2338 = Integer.MIN_VALUE;
			this.anInt2330 = -this.anInt2339 / arg0;
			this.anInt2332 = -this.anInt2341 / arg0;
			this.anInt2333 = -this.anInt2336 / arg0;
		}
	}

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "(I)V")
	public synchronized void method1940(@OriginalArg(0) int arg0) {
		this.anInt2337 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "()I")
	@Override
	public int method5302() {
		@Pc(6) int local6 = this.anInt2339 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2337 == 0) {
			local6 -= local6 * this.anInt2328 / (((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94.length << 8);
		} else if (this.anInt2337 >= 0) {
			local6 -= local6 * this.anInt2329 / ((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
	public synchronized void method1944() {
		this.anInt2331 = (this.anInt2331 ^ this.anInt2331 >> 31) + (this.anInt2331 >>> 31);
		this.anInt2331 = -this.anInt2331;
	}

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "()I")
	public synchronized int method1948() {
		return this.anInt2331 < 0 ? -this.anInt2331 : this.anInt2331;
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(II)V")
	private synchronized void method1950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2338 = arg0;
		this.anInt2340 = arg1;
		this.anInt2335 = 0;
		this.method1953();
	}

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "()Z")
	public boolean method1951() {
		return this.anInt2328 < 0 || this.anInt2328 >= ((Class4_Sub5_Sub1) super.aClass4_Sub5_5).aByteArray94.length << 8;
	}

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "()V")
	private void method1953() {
		this.anInt2339 = this.anInt2338;
		this.anInt2341 = Static359.method1945(this.anInt2338, this.anInt2340);
		this.anInt2336 = Static359.method1930(this.anInt2338, this.anInt2340);
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "()Lclient!le;")
	@Override
	public Class4_Sub13 method5303() {
		return null;
	}

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "()Z")
	private boolean method1955() {
		@Pc(2) int local2 = this.anInt2338;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static359.method1945(local2, this.anInt2340);
			local8 = Static359.method1930(local2, this.anInt2340);
		}
		if (this.anInt2339 != local2 || this.anInt2341 != local10 || this.anInt2336 != local8) {
			if (this.anInt2339 < local2) {
				this.anInt2330 = 1;
				this.anInt2335 = local2 - this.anInt2339;
			} else if (this.anInt2339 > local2) {
				this.anInt2330 = -1;
				this.anInt2335 = this.anInt2339 - local2;
			} else {
				this.anInt2330 = 0;
			}
			if (this.anInt2341 < local10) {
				this.anInt2332 = 1;
				if (this.anInt2335 == 0 || this.anInt2335 > local10 - this.anInt2341) {
					this.anInt2335 = local10 - this.anInt2341;
				}
			} else if (this.anInt2341 > local10) {
				this.anInt2332 = -1;
				if (this.anInt2335 == 0 || this.anInt2335 > this.anInt2341 - local10) {
					this.anInt2335 = this.anInt2341 - local10;
				}
			} else {
				this.anInt2332 = 0;
			}
			if (this.anInt2336 < local8) {
				this.anInt2333 = 1;
				if (this.anInt2335 == 0 || this.anInt2335 > local8 - this.anInt2336) {
					this.anInt2335 = local8 - this.anInt2336;
				}
			} else if (this.anInt2336 > local8) {
				this.anInt2333 = -1;
				if (this.anInt2335 == 0 || this.anInt2335 > this.anInt2336 - local8) {
					this.anInt2335 = this.anInt2336 - local8;
				}
			} else {
				this.anInt2333 = 0;
			}
			return false;
		} else if (this.anInt2338 == Integer.MIN_VALUE) {
			this.anInt2338 = 0;
			this.anInt2339 = this.anInt2341 = this.anInt2336 = 0;
			this.method5667();
			return true;
		} else {
			this.method1953();
			return false;
		}
	}

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "(I)V")
	public synchronized void method1956(@OriginalArg(0) int arg0) {
		this.method1950(arg0 << 6, this.method1926());
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5300(@OriginalArg(0) int arg0) {
		if (this.anInt2335 > 0) {
			if (arg0 >= this.anInt2335) {
				if (this.anInt2338 == Integer.MIN_VALUE) {
					this.anInt2338 = 0;
					this.anInt2339 = this.anInt2341 = this.anInt2336 = 0;
					this.method5667();
					arg0 = this.anInt2335;
				}
				this.anInt2335 = 0;
				this.method1953();
			} else {
				this.anInt2339 += this.anInt2330 * arg0;
				this.anInt2341 += this.anInt2332 * arg0;
				this.anInt2336 += this.anInt2333 * arg0;
				this.anInt2335 -= arg0;
			}
		}
		@Pc(71) Class4_Sub5_Sub1 local71 = (Class4_Sub5_Sub1) super.aClass4_Sub5_5;
		@Pc(76) int local76 = this.anInt2329 << 8;
		@Pc(81) int local81 = this.anInt2334 << 8;
		@Pc(87) int local87 = local71.aByteArray94.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2337 = 0;
		}
		if (this.anInt2328 < 0) {
			if (this.anInt2331 <= 0) {
				this.method1919();
				this.method5667();
				return;
			}
			this.anInt2328 = 0;
		}
		if (this.anInt2328 >= local87) {
			if (this.anInt2331 >= 0) {
				this.method1919();
				this.method5667();
				return;
			}
			this.anInt2328 = local87 - 1;
		}
		this.anInt2328 += this.anInt2331 * arg0;
		if (this.anInt2337 >= 0) {
			if (this.anInt2337 > 0) {
				if (this.aBoolean197) {
					label125: {
						if (this.anInt2331 < 0) {
							if (this.anInt2328 >= local76) {
								return;
							}
							this.anInt2328 = local76 + local76 - this.anInt2328 - 1;
							this.anInt2331 = -this.anInt2331;
							if (--this.anInt2337 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2328 < local81) {
								return;
							}
							this.anInt2328 = local81 + local81 - this.anInt2328 - 1;
							this.anInt2331 = -this.anInt2331;
							if (--this.anInt2337 == 0) {
								break;
							}
							if (this.anInt2328 >= local76) {
								return;
							}
							this.anInt2328 = local76 + local76 - this.anInt2328 - 1;
							this.anInt2331 = -this.anInt2331;
						} while (--this.anInt2337 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2331 < 0) {
						if (this.anInt2328 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2328 - 1) / local91;
						if (local361 < this.anInt2337) {
							this.anInt2328 += local91 * local361;
							this.anInt2337 -= local361;
							return;
						}
						this.anInt2328 += local91 * this.anInt2337;
						this.anInt2337 = 0;
					} else if (this.anInt2328 >= local81) {
						local361 = (this.anInt2328 - local76) / local91;
						if (local361 < this.anInt2337) {
							this.anInt2328 -= local91 * local361;
							this.anInt2337 -= local361;
							return;
						}
						this.anInt2328 -= local91 * this.anInt2337;
						this.anInt2337 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2331 < 0) {
				if (this.anInt2328 < 0) {
					this.anInt2328 = -1;
					this.method1919();
					this.method5667();
					return;
				}
			} else if (this.anInt2328 >= local87) {
				this.anInt2328 = local87;
				this.method1919();
				this.method5667();
			}
		} else if (this.aBoolean197) {
			if (this.anInt2331 < 0) {
				if (this.anInt2328 >= local76) {
					return;
				}
				this.anInt2328 = local76 + local76 - this.anInt2328 - 1;
				this.anInt2331 = -this.anInt2331;
			}
			while (this.anInt2328 >= local81) {
				this.anInt2328 = local81 + local81 - this.anInt2328 - 1;
				this.anInt2331 = -this.anInt2331;
				if (this.anInt2328 >= local76) {
					return;
				}
				this.anInt2328 = local76 + local76 - this.anInt2328 - 1;
				this.anInt2331 = -this.anInt2331;
			}
		} else if (this.anInt2331 < 0) {
			if (this.anInt2328 < local76) {
				this.anInt2328 = local81 - (local81 - 1 - this.anInt2328) % local91 - 1;
			}
		} else if (this.anInt2328 >= local81) {
			this.anInt2328 = local76 + (this.anInt2328 - local76) % local91;
		}
	}
}
