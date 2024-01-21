import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!je", name = "r", descriptor = "I")
	public int anInt2339;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "I")
	public int anInt2340;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "I")
	private int anInt2341;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "I")
	public int anInt2342;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "I")
	public int anInt2345;

	@OriginalMember(owner = "client!je", name = "D", descriptor = "I")
	public int anInt2350;

	@OriginalMember(owner = "client!je", name = "E", descriptor = "I")
	public int anInt2351;

	@OriginalMember(owner = "client!je", name = "F", descriptor = "I")
	private int anInt2352;

	@OriginalMember(owner = "client!je", name = "B", descriptor = "I")
	private final int anInt2348;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "I")
	private final int anInt2344;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Z")
	private final boolean aBoolean181;

	@OriginalMember(owner = "client!je", name = "C", descriptor = "I")
	private int anInt2349;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "I")
	private int anInt2346;

	@OriginalMember(owner = "client!je", name = "A", descriptor = "I")
	private int anInt2347;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "I")
	public int anInt2343;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!ai;II)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) Class1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub4_5 = arg0;
		this.anInt2348 = arg0.anInt310;
		this.anInt2344 = arg0.anInt311;
		this.aBoolean181 = arg0.aBoolean27;
		this.anInt2349 = arg1;
		this.anInt2346 = arg2;
		this.anInt2347 = 8192;
		this.anInt2343 = 0;
		this.method1766();
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!ai;III)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) Class1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub4_5 = arg0;
		this.anInt2348 = arg0.anInt310;
		this.anInt2344 = arg0.anInt311;
		this.aBoolean181 = arg0.aBoolean27;
		this.anInt2349 = arg1;
		this.anInt2346 = arg2;
		this.anInt2347 = arg3;
		this.anInt2343 = 0;
		this.method1766();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public synchronized void method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1744(arg0, arg1, this.method1769());
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()Lclient!ve;")
	@Override
	public Class1_Sub12 method2629() {
		return null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([IIIII)I")
	private int method1739(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2352 <= 0) {
				if (this.anInt2349 == -256 && (this.anInt2343 & 0xFF) == 0) {
					if (Static97.aBoolean323) {
						return Static192.method1750(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2351, this.anInt2342, arg3, arg2, this);
					}
					return Static192.method1741(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2340, arg3, arg2, this);
				}
				if (Static97.aBoolean323) {
					return Static192.method1737(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2351, this.anInt2342, arg3, arg2, this, this.anInt2349, arg4);
				}
				return Static192.method1770(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2340, arg3, arg2, this, this.anInt2349, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2352;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2352 += arg1;
			if (this.anInt2349 == -256 && (this.anInt2343 & 0xFF) == 0) {
				if (Static97.aBoolean323) {
					arg1 = Static192.method1774(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2351, this.anInt2342, this.anInt2350, this.anInt2345, local5, arg2, this);
				} else {
					arg1 = Static192.method1738(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2340, this.anInt2339, local5, arg2, this);
				}
			} else if (Static97.aBoolean323) {
				arg1 = Static192.method1740(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2351, this.anInt2342, this.anInt2350, this.anInt2345, local5, arg2, this, this.anInt2349, arg4);
			} else {
				arg1 = Static192.method1746(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2340, this.anInt2339, local5, arg2, this, this.anInt2349, arg4);
			}
			this.anInt2352 -= arg1;
			if (this.anInt2352 != 0) {
				return arg1;
			}
		} while (!this.method1757());
		return arg3;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "()I")
	@Override
	public int method2631() {
		@Pc(6) int local6 = this.anInt2340 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2341 == 0) {
			local6 -= local6 * this.anInt2343 / (((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6.length << 8);
		} else if (this.anInt2341 >= 0) {
			local6 -= local6 * this.anInt2348 / ((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	public synchronized void method1743(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1759();
			this.method3056();
		} else if (this.anInt2351 == 0 && this.anInt2342 == 0) {
			this.anInt2352 = 0;
			this.anInt2346 = 0;
			this.anInt2340 = 0;
			this.method3056();
		} else {
			@Pc(31) int local31 = -this.anInt2340;
			if (this.anInt2340 > local31) {
				local31 = this.anInt2340;
			}
			if (-this.anInt2351 > local31) {
				local31 = -this.anInt2351;
			}
			if (this.anInt2351 > local31) {
				local31 = this.anInt2351;
			}
			if (-this.anInt2342 > local31) {
				local31 = -this.anInt2342;
			}
			if (this.anInt2342 > local31) {
				local31 = this.anInt2342;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2352 = arg0;
			this.anInt2346 = Integer.MIN_VALUE;
			this.anInt2339 = -this.anInt2340 / arg0;
			this.anInt2350 = -this.anInt2351 / arg0;
			this.anInt2345 = -this.anInt2342 / arg0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public synchronized void method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1758(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static192.method1745(arg1, arg2);
		@Pc(14) int local14 = Static192.method1773(arg1, arg2);
		if (this.anInt2351 == local10 && this.anInt2342 == local14) {
			this.anInt2352 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2340;
		if (this.anInt2340 - arg1 > local31) {
			local31 = this.anInt2340 - arg1;
		}
		if (local10 - this.anInt2351 > local31) {
			local31 = local10 - this.anInt2351;
		}
		if (this.anInt2351 - local10 > local31) {
			local31 = this.anInt2351 - local10;
		}
		if (local14 - this.anInt2342 > local31) {
			local31 = local14 - this.anInt2342;
		}
		if (this.anInt2342 - local14 > local31) {
			local31 = this.anInt2342 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2352 = arg0;
		this.anInt2346 = arg1;
		this.anInt2347 = arg2;
		this.anInt2339 = (arg1 - this.anInt2340) / arg0;
		this.anInt2350 = (local10 - this.anInt2351) / arg0;
		this.anInt2345 = (local14 - this.anInt2342) / arg0;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2633(@OriginalArg(0) int arg0) {
		if (this.anInt2352 > 0) {
			if (arg0 >= this.anInt2352) {
				if (this.anInt2346 == Integer.MIN_VALUE) {
					this.anInt2346 = 0;
					this.anInt2340 = this.anInt2351 = this.anInt2342 = 0;
					this.method3056();
					arg0 = this.anInt2352;
				}
				this.anInt2352 = 0;
				this.method1766();
			} else {
				this.anInt2340 += this.anInt2339 * arg0;
				this.anInt2351 += this.anInt2350 * arg0;
				this.anInt2342 += this.anInt2345 * arg0;
				this.anInt2352 -= arg0;
			}
		}
		@Pc(71) Class1_Sub4_Sub1 local71 = (Class1_Sub4_Sub1) super.aClass1_Sub4_5;
		@Pc(76) int local76 = this.anInt2348 << 8;
		@Pc(81) int local81 = this.anInt2344 << 8;
		@Pc(87) int local87 = local71.aByteArray6.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2341 = 0;
		}
		if (this.anInt2343 < 0) {
			if (this.anInt2349 <= 0) {
				this.method1748();
				this.method3056();
				return;
			}
			this.anInt2343 = 0;
		}
		if (this.anInt2343 >= local87) {
			if (this.anInt2349 >= 0) {
				this.method1748();
				this.method3056();
				return;
			}
			this.anInt2343 = local87 - 1;
		}
		this.anInt2343 += this.anInt2349 * arg0;
		if (this.anInt2341 >= 0) {
			if (this.anInt2341 > 0) {
				if (this.aBoolean181) {
					label125: {
						if (this.anInt2349 < 0) {
							if (this.anInt2343 >= local76) {
								return;
							}
							this.anInt2343 = local76 + local76 - this.anInt2343 - 1;
							this.anInt2349 = -this.anInt2349;
							if (--this.anInt2341 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2343 < local81) {
								return;
							}
							this.anInt2343 = local81 + local81 - this.anInt2343 - 1;
							this.anInt2349 = -this.anInt2349;
							if (--this.anInt2341 == 0) {
								break;
							}
							if (this.anInt2343 >= local76) {
								return;
							}
							this.anInt2343 = local76 + local76 - this.anInt2343 - 1;
							this.anInt2349 = -this.anInt2349;
						} while (--this.anInt2341 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2349 < 0) {
						if (this.anInt2343 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2343 - 1) / local91;
						if (local361 < this.anInt2341) {
							this.anInt2343 += local91 * local361;
							this.anInt2341 -= local361;
							return;
						}
						this.anInt2343 += local91 * this.anInt2341;
						this.anInt2341 = 0;
					} else if (this.anInt2343 >= local81) {
						local361 = (this.anInt2343 - local76) / local91;
						if (local361 < this.anInt2341) {
							this.anInt2343 -= local91 * local361;
							this.anInt2341 -= local361;
							return;
						}
						this.anInt2343 -= local91 * this.anInt2341;
						this.anInt2341 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2349 < 0) {
				if (this.anInt2343 < 0) {
					this.anInt2343 = -1;
					this.method1748();
					this.method3056();
					return;
				}
			} else if (this.anInt2343 >= local87) {
				this.anInt2343 = local87;
				this.method1748();
				this.method3056();
			}
		} else if (this.aBoolean181) {
			if (this.anInt2349 < 0) {
				if (this.anInt2343 >= local76) {
					return;
				}
				this.anInt2343 = local76 + local76 - this.anInt2343 - 1;
				this.anInt2349 = -this.anInt2349;
			}
			while (this.anInt2343 >= local81) {
				this.anInt2343 = local81 + local81 - this.anInt2343 - 1;
				this.anInt2349 = -this.anInt2349;
				if (this.anInt2343 >= local76) {
					return;
				}
				this.anInt2343 = local76 + local76 - this.anInt2343 - 1;
				this.anInt2349 = -this.anInt2349;
			}
		} else if (this.anInt2349 < 0) {
			if (this.anInt2343 < local76) {
				this.anInt2343 = local81 - (local81 - 1 - this.anInt2343) % local91 - 1;
			}
		} else if (this.anInt2343 >= local81) {
			this.anInt2343 = local76 + (this.anInt2343 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "()V")
	private void method1748() {
		if (this.anInt2352 == 0) {
			return;
		}
		if (this.anInt2346 == Integer.MIN_VALUE) {
			this.anInt2346 = 0;
		}
		this.anInt2352 = 0;
		this.method1766();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "([IIIII)I")
	private int method1751(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2352 <= 0) {
				if (this.anInt2349 == 256 && (this.anInt2343 & 0xFF) == 0) {
					if (Static97.aBoolean323) {
						return Static192.method1749(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2351, this.anInt2342, arg3, arg2, this);
					}
					return Static192.method1775(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2340, arg3, arg2, this);
				}
				if (Static97.aBoolean323) {
					return Static192.method1742(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2351, this.anInt2342, arg3, arg2, this, this.anInt2349, arg4);
				}
				return Static192.method1753(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2340, arg3, arg2, this, this.anInt2349, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2352;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2352 += arg1;
			if (this.anInt2349 == 256 && (this.anInt2343 & 0xFF) == 0) {
				if (Static97.aBoolean323) {
					arg1 = Static192.method1771(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2351, this.anInt2342, this.anInt2350, this.anInt2345, local5, arg2, this);
				} else {
					arg1 = Static192.method1763(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2340, this.anInt2339, local5, arg2, this);
				}
			} else if (Static97.aBoolean323) {
				arg1 = Static192.method1764(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2351, this.anInt2342, this.anInt2350, this.anInt2345, local5, arg2, this, this.anInt2349, arg4);
			} else {
				arg1 = Static192.method1772(((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6, arg0, this.anInt2343, arg1, this.anInt2340, this.anInt2339, local5, arg2, this, this.anInt2349, arg4);
			}
			this.anInt2352 -= arg1;
			if (this.anInt2352 != 0) {
				return arg1;
			}
		} while (!this.method1757());
		return arg3;
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "()Z")
	public boolean method1752() {
		return this.anInt2343 < 0 || this.anInt2343 >= ((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6.length << 8;
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "()I")
	public synchronized int method1755() {
		return this.anInt2349 < 0 ? -this.anInt2349 : this.anInt2349;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()Lclient!ve;")
	@Override
	public Class1_Sub12 method2630() {
		return null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2632(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2346 == 0 && this.anInt2352 == 0) {
			this.method2633(arg2);
			return;
		}
		@Pc(13) Class1_Sub4_Sub1 local13 = (Class1_Sub4_Sub1) super.aClass1_Sub4_5;
		@Pc(18) int local18 = this.anInt2348 << 8;
		@Pc(23) int local23 = this.anInt2344 << 8;
		@Pc(29) int local29 = local13.aByteArray6.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2341 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2343 < 0) {
			if (this.anInt2349 <= 0) {
				this.method1748();
				this.method3056();
				return;
			}
			this.anInt2343 = 0;
		}
		if (this.anInt2343 >= local29) {
			if (this.anInt2349 >= 0) {
				this.method1748();
				this.method3056();
				return;
			}
			this.anInt2343 = local29 - 1;
		}
		if (this.anInt2341 >= 0) {
			if (this.anInt2341 > 0) {
				if (this.aBoolean181) {
					label130: {
						if (this.anInt2349 < 0) {
							local40 = this.method1739(arg0, arg1, local18, local44, local13.aByteArray6[this.anInt2348]);
							if (this.anInt2343 >= local18) {
								return;
							}
							this.anInt2343 = local18 + local18 - this.anInt2343 - 1;
							this.anInt2349 = -this.anInt2349;
							if (--this.anInt2341 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1751(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2344 - 1]);
							if (this.anInt2343 < local23) {
								return;
							}
							this.anInt2343 = local23 + local23 - this.anInt2343 - 1;
							this.anInt2349 = -this.anInt2349;
							if (--this.anInt2341 == 0) {
								break;
							}
							local40 = this.method1739(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2348]);
							if (this.anInt2343 >= local18) {
								return;
							}
							this.anInt2343 = local18 + local18 - this.anInt2343 - 1;
							this.anInt2349 = -this.anInt2349;
						} while (--this.anInt2341 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2349 < 0) {
						while (true) {
							local40 = this.method1739(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2344 - 1]);
							if (this.anInt2343 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2343 - 1) / local33;
							if (local416 >= this.anInt2341) {
								this.anInt2343 += local33 * this.anInt2341;
								this.anInt2341 = 0;
								break;
							}
							this.anInt2343 += local33 * local416;
							this.anInt2341 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1751(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2348]);
							if (this.anInt2343 < local23) {
								return;
							}
							local416 = (this.anInt2343 - local18) / local33;
							if (local416 >= this.anInt2341) {
								this.anInt2343 -= local33 * this.anInt2341;
								this.anInt2341 = 0;
								break;
							}
							this.anInt2343 -= local33 * local416;
							this.anInt2341 -= local416;
						}
					}
				}
			}
			if (this.anInt2349 < 0) {
				this.method1739(arg0, local40, 0, local44, 0);
				if (this.anInt2343 < 0) {
					this.anInt2343 = -1;
					this.method1748();
					this.method3056();
					return;
				}
			} else {
				this.method1751(arg0, local40, local29, local44, 0);
				if (this.anInt2343 >= local29) {
					this.anInt2343 = local29;
					this.method1748();
					this.method3056();
				}
			}
		} else if (this.aBoolean181) {
			if (this.anInt2349 < 0) {
				local40 = this.method1739(arg0, arg1, local18, local44, local13.aByteArray6[this.anInt2348]);
				if (this.anInt2343 >= local18) {
					return;
				}
				this.anInt2343 = local18 + local18 - this.anInt2343 - 1;
				this.anInt2349 = -this.anInt2349;
			}
			while (true) {
				local40 = this.method1751(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2344 - 1]);
				if (this.anInt2343 < local23) {
					return;
				}
				this.anInt2343 = local23 + local23 - this.anInt2343 - 1;
				this.anInt2349 = -this.anInt2349;
				local40 = this.method1739(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2348]);
				if (this.anInt2343 >= local18) {
					return;
				}
				this.anInt2343 = local18 + local18 - this.anInt2343 - 1;
				this.anInt2349 = -this.anInt2349;
			}
		} else if (this.anInt2349 < 0) {
			while (true) {
				local40 = this.method1739(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2344 - 1]);
				if (this.anInt2343 >= local18) {
					return;
				}
				this.anInt2343 = local23 - (local23 - 1 - this.anInt2343) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1751(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2348]);
				if (this.anInt2343 < local23) {
					return;
				}
				this.anInt2343 = local18 + (this.anInt2343 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
	public synchronized void method1756(@OriginalArg(0) int arg0) {
		this.method1758(arg0 << 6, this.method1769());
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()I")
	@Override
	public int method2628() {
		return this.anInt2346 == 0 && this.anInt2352 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "()Z")
	private boolean method1757() {
		@Pc(2) int local2 = this.anInt2346;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static192.method1745(local2, this.anInt2347);
			local8 = Static192.method1773(local2, this.anInt2347);
		}
		if (this.anInt2340 != local2 || this.anInt2351 != local10 || this.anInt2342 != local8) {
			if (this.anInt2340 < local2) {
				this.anInt2339 = 1;
				this.anInt2352 = local2 - this.anInt2340;
			} else if (this.anInt2340 > local2) {
				this.anInt2339 = -1;
				this.anInt2352 = this.anInt2340 - local2;
			} else {
				this.anInt2339 = 0;
			}
			if (this.anInt2351 < local10) {
				this.anInt2350 = 1;
				if (this.anInt2352 == 0 || this.anInt2352 > local10 - this.anInt2351) {
					this.anInt2352 = local10 - this.anInt2351;
				}
			} else if (this.anInt2351 > local10) {
				this.anInt2350 = -1;
				if (this.anInt2352 == 0 || this.anInt2352 > this.anInt2351 - local10) {
					this.anInt2352 = this.anInt2351 - local10;
				}
			} else {
				this.anInt2350 = 0;
			}
			if (this.anInt2342 < local8) {
				this.anInt2345 = 1;
				if (this.anInt2352 == 0 || this.anInt2352 > local8 - this.anInt2342) {
					this.anInt2352 = local8 - this.anInt2342;
				}
			} else if (this.anInt2342 > local8) {
				this.anInt2345 = -1;
				if (this.anInt2352 == 0 || this.anInt2352 > this.anInt2342 - local8) {
					this.anInt2352 = this.anInt2342 - local8;
				}
			} else {
				this.anInt2345 = 0;
			}
			return false;
		} else if (this.anInt2346 == Integer.MIN_VALUE) {
			this.anInt2346 = 0;
			this.anInt2340 = this.anInt2351 = this.anInt2342 = 0;
			this.method3056();
			return true;
		} else {
			this.method1766();
			return false;
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(II)V")
	private synchronized void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2346 = arg0;
		this.anInt2347 = arg1;
		this.anInt2352 = 0;
		this.method1766();
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
	private synchronized void method1759() {
		this.method1758(0, this.method1769());
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
	public synchronized void method1760(@OriginalArg(0) int arg0) {
		this.anInt2341 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "i", descriptor = "()Z")
	public boolean method1761() {
		return this.anInt2352 != 0;
	}

	@OriginalMember(owner = "client!je", name = "j", descriptor = "()I")
	public synchronized int method1762() {
		return this.anInt2346 == Integer.MIN_VALUE ? 0 : this.anInt2346;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public synchronized void method1765() {
		this.anInt2349 = (this.anInt2349 ^ this.anInt2349 >> 31) + (this.anInt2349 >>> 31);
		this.anInt2349 = -this.anInt2349;
	}

	@OriginalMember(owner = "client!je", name = "k", descriptor = "()V")
	private void method1766() {
		this.anInt2340 = this.anInt2346;
		this.anInt2351 = Static192.method1745(this.anInt2346, this.anInt2347);
		this.anInt2342 = Static192.method1773(this.anInt2346, this.anInt2347);
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
	public synchronized void method1767(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub4_Sub1) super.aClass1_Sub4_5).aByteArray6.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2343 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "i", descriptor = "(I)V")
	public synchronized void method1768(@OriginalArg(0) int arg0) {
		if (this.anInt2349 < 0) {
			this.anInt2349 = -arg0;
		} else {
			this.anInt2349 = arg0;
		}
	}

	@OriginalMember(owner = "client!je", name = "l", descriptor = "()I")
	public synchronized int method1769() {
		return this.anInt2347 < 0 ? -1 : this.anInt2347;
	}
}
