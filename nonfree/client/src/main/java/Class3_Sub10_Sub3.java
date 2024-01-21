import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class3_Sub10_Sub3 extends Class3_Sub10 {

	@OriginalMember(owner = "client!r", name = "u", descriptor = "I")
	public int anInt2284;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "I")
	public int anInt2285;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	private int anInt2286;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	public int anInt2287;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "I")
	public int anInt2289;

	@OriginalMember(owner = "client!r", name = "B", descriptor = "I")
	public int anInt2290;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "I")
	private int anInt2291;

	@OriginalMember(owner = "client!r", name = "D", descriptor = "I")
	public int anInt2292;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "I")
	private final int anInt2296;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "I")
	private final int anInt2295;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Z")
	private final boolean aBoolean95;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "I")
	private int anInt2288;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "I")
	private int anInt2294;

	@OriginalMember(owner = "client!r", name = "E", descriptor = "I")
	private int anInt2293;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!tc;II)V")
	public Class3_Sub10_Sub3(@OriginalArg(0) Class3_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub2_5 = arg0;
		this.anInt2296 = arg0.anInt2452;
		this.anInt2295 = arg0.anInt2453;
		this.aBoolean95 = arg0.aBoolean104;
		this.anInt2288 = arg1;
		this.anInt2294 = arg2;
		this.anInt2293 = 8192;
		this.anInt2283 = 0;
		this.method1599();
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!tc;III)V")
	public Class3_Sub10_Sub3(@OriginalArg(0) Class3_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub2_5 = arg0;
		this.anInt2296 = arg0.anInt2452;
		this.anInt2295 = arg0.anInt2453;
		this.aBoolean95 = arg0.aBoolean104;
		this.anInt2288 = arg1;
		this.anInt2294 = arg2;
		this.anInt2293 = arg3;
		this.anInt2283 = 0;
		this.method1599();
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
	private void method1586() {
		if (this.anInt2291 == 0) {
			return;
		}
		if (this.anInt2294 == Integer.MIN_VALUE) {
			this.anInt2294 = 0;
		}
		this.anInt2291 = 0;
		this.method1599();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()I")
	@Override
	public int method1864() {
		@Pc(6) int local6 = this.anInt2285 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2286 == 0) {
			local6 -= local6 * this.anInt2283 / (((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52.length << 8);
		} else if (this.anInt2286 >= 0) {
			local6 -= local6 * this.anInt2296 / ((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()I")
	public synchronized int method1589() {
		return this.anInt2294 == Integer.MIN_VALUE ? 0 : this.anInt2294;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public synchronized void method1591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1613(arg0, arg1, this.method1597());
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	@Override
	public int method1866() {
		return this.anInt2294 == 0 && this.anInt2291 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)I")
	private int method1593(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2291 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2291;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2291 += arg1;
			if (this.anInt2288 == -256 && (this.anInt2283 & 0xFF) == 0) {
				if (Static49.aBoolean48) {
					arg1 = Static132.method1617(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2292, this.anInt2290, this.anInt2289, this.anInt2284, local7, arg2, this);
				} else {
					arg1 = Static132.method1608(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2285, this.anInt2287, local7, arg2, this);
				}
			} else if (Static49.aBoolean48) {
				arg1 = Static132.method1605(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2292, this.anInt2290, this.anInt2289, this.anInt2284, local7, arg2, this, this.anInt2288, arg4);
			} else {
				arg1 = Static132.method1611(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2285, this.anInt2287, local7, arg2, this, this.anInt2288, arg4);
			}
			this.anInt2291 -= arg1;
			if (this.anInt2291 != 0) {
				return arg1;
			}
			if (this.anInt2294 == Integer.MIN_VALUE) {
				this.anInt2294 = 0;
				this.anInt2285 = this.anInt2292 = this.anInt2290 = 0;
				this.method1962();
				return arg3;
			}
			this.method1599();
		}
		if (this.anInt2288 == -256 && (this.anInt2283 & 0xFF) == 0) {
			return Static49.aBoolean48 ? Static132.method1588(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2292, this.anInt2290, arg3, arg2, this) : Static132.method1600(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2285, arg3, arg2, this);
		} else if (Static49.aBoolean48) {
			return Static132.method1590(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2292, this.anInt2290, arg3, arg2, this, this.anInt2288, arg4);
		} else {
			return Static132.method1621(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2285, arg3, arg2, this, this.anInt2288, arg4);
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	private synchronized void method1594() {
		this.method1610(0, this.method1597());
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public synchronized void method1595(@OriginalArg(0) int arg0) {
		this.anInt2286 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "([IIIII)I")
	private int method1596(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2291 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2291;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2291 += arg1;
			if (this.anInt2288 == 256 && (this.anInt2283 & 0xFF) == 0) {
				if (Static49.aBoolean48) {
					arg1 = Static132.method1609(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2292, this.anInt2290, this.anInt2289, this.anInt2284, local7, arg2, this);
				} else {
					arg1 = Static132.method1584(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2285, this.anInt2287, local7, arg2, this);
				}
			} else if (Static49.aBoolean48) {
				arg1 = Static132.method1604(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2292, this.anInt2290, this.anInt2289, this.anInt2284, local7, arg2, this, this.anInt2288, arg4);
			} else {
				arg1 = Static132.method1587(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2285, this.anInt2287, local7, arg2, this, this.anInt2288, arg4);
			}
			this.anInt2291 -= arg1;
			if (this.anInt2291 != 0) {
				return arg1;
			}
			if (this.anInt2294 == Integer.MIN_VALUE) {
				this.anInt2294 = 0;
				this.anInt2285 = this.anInt2292 = this.anInt2290 = 0;
				this.method1962();
				return arg3;
			}
			this.method1599();
		}
		if (this.anInt2288 == 256 && (this.anInt2283 & 0xFF) == 0) {
			return Static49.aBoolean48 ? Static132.method1603(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2292, this.anInt2290, arg3, arg2, this) : Static132.method1592(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2285, arg3, arg2, this);
		} else if (Static49.aBoolean48) {
			return Static132.method1615(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2292, this.anInt2290, arg3, arg2, this, this.anInt2288, arg4);
		} else {
			return Static132.method1602(((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52, arg0, this.anInt2283, arg1, this.anInt2285, arg3, arg2, this, this.anInt2288, arg4);
		}
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()I")
	public synchronized int method1597() {
		return this.anInt2293 < 0 ? -1 : this.anInt2293;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1865(@OriginalArg(0) int arg0) {
		if (this.anInt2291 > 0) {
			if (arg0 >= this.anInt2291) {
				if (this.anInt2294 == Integer.MIN_VALUE) {
					this.anInt2294 = 0;
					this.anInt2285 = this.anInt2292 = this.anInt2290 = 0;
					this.method1962();
					arg0 = this.anInt2291;
				}
				this.anInt2291 = 0;
				this.method1599();
			} else {
				this.anInt2285 += this.anInt2287 * arg0;
				this.anInt2292 += this.anInt2289 * arg0;
				this.anInt2290 += this.anInt2284 * arg0;
				this.anInt2291 -= arg0;
			}
		}
		@Pc(71) Class3_Sub2_Sub1 local71 = (Class3_Sub2_Sub1) super.aClass3_Sub2_5;
		@Pc(76) int local76 = this.anInt2296 << 8;
		@Pc(81) int local81 = this.anInt2295 << 8;
		@Pc(87) int local87 = local71.aByteArray52.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2286 = 0;
		}
		if (this.anInt2283 < 0) {
			if (this.anInt2288 <= 0) {
				this.method1586();
				this.method1962();
				return;
			}
			this.anInt2283 = 0;
		}
		if (this.anInt2283 >= local87) {
			if (this.anInt2288 >= 0) {
				this.method1586();
				this.method1962();
				return;
			}
			this.anInt2283 = local87 - 1;
		}
		this.anInt2283 += this.anInt2288 * arg0;
		if (this.anInt2286 >= 0) {
			if (this.anInt2286 > 0) {
				if (this.aBoolean95) {
					label125: {
						if (this.anInt2288 < 0) {
							if (this.anInt2283 >= local76) {
								return;
							}
							this.anInt2283 = local76 + local76 - this.anInt2283 - 1;
							this.anInt2288 = -this.anInt2288;
							if (--this.anInt2286 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2283 < local81) {
								return;
							}
							this.anInt2283 = local81 + local81 - this.anInt2283 - 1;
							this.anInt2288 = -this.anInt2288;
							if (--this.anInt2286 == 0) {
								break;
							}
							if (this.anInt2283 >= local76) {
								return;
							}
							this.anInt2283 = local76 + local76 - this.anInt2283 - 1;
							this.anInt2288 = -this.anInt2288;
						} while (--this.anInt2286 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2288 < 0) {
						if (this.anInt2283 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2283 - 1) / local91;
						if (local361 < this.anInt2286) {
							this.anInt2283 += local91 * local361;
							this.anInt2286 -= local361;
							return;
						}
						this.anInt2283 += local91 * this.anInt2286;
						this.anInt2286 = 0;
					} else if (this.anInt2283 >= local81) {
						local361 = (this.anInt2283 - local76) / local91;
						if (local361 < this.anInt2286) {
							this.anInt2283 -= local91 * local361;
							this.anInt2286 -= local361;
							return;
						}
						this.anInt2283 -= local91 * this.anInt2286;
						this.anInt2286 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2288 < 0) {
				if (this.anInt2283 < 0) {
					this.anInt2283 = -1;
					this.method1586();
					this.method1962();
					return;
				}
			} else if (this.anInt2283 >= local87) {
				this.anInt2283 = local87;
				this.method1586();
				this.method1962();
			}
		} else if (this.aBoolean95) {
			if (this.anInt2288 < 0) {
				if (this.anInt2283 >= local76) {
					return;
				}
				this.anInt2283 = local76 + local76 - this.anInt2283 - 1;
				this.anInt2288 = -this.anInt2288;
			}
			while (this.anInt2283 >= local81) {
				this.anInt2283 = local81 + local81 - this.anInt2283 - 1;
				this.anInt2288 = -this.anInt2288;
				if (this.anInt2283 >= local76) {
					return;
				}
				this.anInt2283 = local76 + local76 - this.anInt2283 - 1;
				this.anInt2288 = -this.anInt2288;
			}
		} else if (this.anInt2288 < 0) {
			if (this.anInt2283 < local76) {
				this.anInt2283 = local81 - (local81 - 1 - this.anInt2283) % local91 - 1;
			}
		} else if (this.anInt2283 >= local81) {
			this.anInt2283 = local76 + (this.anInt2283 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
	public boolean method1598() {
		return this.anInt2283 < 0 || this.anInt2283 >= ((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52.length << 8;
	}

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()V")
	private void method1599() {
		this.anInt2285 = this.anInt2294;
		this.anInt2292 = Static132.method1612(this.anInt2294, this.anInt2293);
		this.anInt2290 = Static132.method1620(this.anInt2294, this.anInt2293);
	}

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()Z")
	public boolean method1601() {
		return this.anInt2291 != 0;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Lclient!hb;")
	@Override
	public Class3_Sub10 method1867() {
		return null;
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public synchronized void method1606(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1594();
			this.method1962();
		} else if (this.anInt2292 == 0 && this.anInt2290 == 0) {
			this.anInt2291 = 0;
			this.anInt2294 = 0;
			this.anInt2285 = 0;
			this.method1962();
		} else {
			this.anInt2291 = arg0;
			this.anInt2294 = Integer.MIN_VALUE;
			this.anInt2287 = -this.anInt2285 / arg0;
			this.anInt2289 = -this.anInt2292 / arg0;
			this.anInt2284 = -this.anInt2290 / arg0;
		}
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public synchronized void method1607(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub2_Sub1) super.aClass3_Sub2_5).aByteArray52.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2283 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1870(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2294 == 0 && this.anInt2291 == 0) {
			this.method1865(arg2);
			return;
		}
		@Pc(13) Class3_Sub2_Sub1 local13 = (Class3_Sub2_Sub1) super.aClass3_Sub2_5;
		@Pc(18) int local18 = this.anInt2296 << 8;
		@Pc(23) int local23 = this.anInt2295 << 8;
		@Pc(29) int local29 = local13.aByteArray52.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2286 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2283 < 0) {
			if (this.anInt2288 <= 0) {
				this.method1586();
				this.method1962();
				return;
			}
			this.anInt2283 = 0;
		}
		if (this.anInt2283 >= local29) {
			if (this.anInt2288 >= 0) {
				this.method1586();
				this.method1962();
				return;
			}
			this.anInt2283 = local29 - 1;
		}
		if (this.anInt2286 >= 0) {
			if (this.anInt2286 > 0) {
				if (this.aBoolean95) {
					label130: {
						if (this.anInt2288 < 0) {
							local40 = this.method1593(arg0, arg1, local18, local44, local13.aByteArray52[this.anInt2296]);
							if (this.anInt2283 >= local18) {
								return;
							}
							this.anInt2283 = local18 + local18 - this.anInt2283 - 1;
							this.anInt2288 = -this.anInt2288;
							if (--this.anInt2286 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1596(arg0, local40, local23, local44, local13.aByteArray52[this.anInt2295 - 1]);
							if (this.anInt2283 < local23) {
								return;
							}
							this.anInt2283 = local23 + local23 - this.anInt2283 - 1;
							this.anInt2288 = -this.anInt2288;
							if (--this.anInt2286 == 0) {
								break;
							}
							local40 = this.method1593(arg0, local40, local18, local44, local13.aByteArray52[this.anInt2296]);
							if (this.anInt2283 >= local18) {
								return;
							}
							this.anInt2283 = local18 + local18 - this.anInt2283 - 1;
							this.anInt2288 = -this.anInt2288;
						} while (--this.anInt2286 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2288 < 0) {
						while (true) {
							local40 = this.method1593(arg0, local40, local18, local44, local13.aByteArray52[this.anInt2295 - 1]);
							if (this.anInt2283 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2283 - 1) / local33;
							if (local416 >= this.anInt2286) {
								this.anInt2283 += local33 * this.anInt2286;
								this.anInt2286 = 0;
								break;
							}
							this.anInt2283 += local33 * local416;
							this.anInt2286 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1596(arg0, local40, local23, local44, local13.aByteArray52[this.anInt2296]);
							if (this.anInt2283 < local23) {
								return;
							}
							local416 = (this.anInt2283 - local18) / local33;
							if (local416 >= this.anInt2286) {
								this.anInt2283 -= local33 * this.anInt2286;
								this.anInt2286 = 0;
								break;
							}
							this.anInt2283 -= local33 * local416;
							this.anInt2286 -= local416;
						}
					}
				}
			}
			if (this.anInt2288 < 0) {
				this.method1593(arg0, local40, 0, local44, 0);
				if (this.anInt2283 < 0) {
					this.anInt2283 = -1;
					this.method1586();
					this.method1962();
					return;
				}
			} else {
				this.method1596(arg0, local40, local29, local44, 0);
				if (this.anInt2283 >= local29) {
					this.anInt2283 = local29;
					this.method1586();
					this.method1962();
				}
			}
		} else if (this.aBoolean95) {
			if (this.anInt2288 < 0) {
				local40 = this.method1593(arg0, arg1, local18, local44, local13.aByteArray52[this.anInt2296]);
				if (this.anInt2283 >= local18) {
					return;
				}
				this.anInt2283 = local18 + local18 - this.anInt2283 - 1;
				this.anInt2288 = -this.anInt2288;
			}
			while (true) {
				local40 = this.method1596(arg0, local40, local23, local44, local13.aByteArray52[this.anInt2295 - 1]);
				if (this.anInt2283 < local23) {
					return;
				}
				this.anInt2283 = local23 + local23 - this.anInt2283 - 1;
				this.anInt2288 = -this.anInt2288;
				local40 = this.method1593(arg0, local40, local18, local44, local13.aByteArray52[this.anInt2296]);
				if (this.anInt2283 >= local18) {
					return;
				}
				this.anInt2283 = local18 + local18 - this.anInt2283 - 1;
				this.anInt2288 = -this.anInt2288;
			}
		} else if (this.anInt2288 < 0) {
			while (true) {
				local40 = this.method1593(arg0, local40, local18, local44, local13.aByteArray52[this.anInt2295 - 1]);
				if (this.anInt2283 >= local18) {
					return;
				}
				this.anInt2283 = local23 - (local23 - 1 - this.anInt2283) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1596(arg0, local40, local23, local44, local13.aByteArray52[this.anInt2296]);
				if (this.anInt2283 < local23) {
					return;
				}
				this.anInt2283 = local18 + (this.anInt2283 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
	private synchronized void method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2294 = arg0;
		this.anInt2293 = arg1;
		this.anInt2291 = 0;
		this.method1599();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
	public synchronized void method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1610(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static132.method1612(arg1, arg2);
		@Pc(14) int local14 = Static132.method1620(arg1, arg2);
		if (this.anInt2292 == local10 && this.anInt2290 == local14) {
			this.anInt2291 = 0;
			return;
		}
		this.anInt2291 = arg0;
		this.anInt2294 = arg1;
		this.anInt2293 = arg2;
		this.anInt2287 = (arg1 - this.anInt2285) / arg0;
		this.anInt2289 = (local10 - this.anInt2292) / arg0;
		this.anInt2284 = (local14 - this.anInt2290) / arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public synchronized void method1614() {
		this.anInt2288 = (this.anInt2288 ^ this.anInt2288 >> 31) + (this.anInt2288 >>> 31);
		this.anInt2288 = -this.anInt2288;
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
	public synchronized void method1618(@OriginalArg(0) int arg0) {
		this.method1610(arg0 << 6, this.method1597());
	}

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()I")
	public synchronized int method1619() {
		return this.anInt2288 < 0 ? -this.anInt2288 : this.anInt2288;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()Lclient!hb;")
	@Override
	public Class3_Sub10 method1869() {
		return null;
	}

	@OriginalMember(owner = "client!r", name = "i", descriptor = "(I)V")
	public synchronized void method1622(@OriginalArg(0) int arg0) {
		if (this.anInt2288 < 0) {
			this.anInt2288 = -arg0;
		} else {
			this.anInt2288 = arg0;
		}
	}
}
