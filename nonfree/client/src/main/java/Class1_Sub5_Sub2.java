import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 {

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
	private int anInt2361;

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
	public int anInt2362;

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
	public int anInt2364;

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
	public int anInt2365;

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
	public int anInt2368;

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
	public int anInt2369;

	@OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
	private int anInt2372;

	@OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
	public int anInt2373;

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
	private final int anInt2366;

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
	private final int anInt2371;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "Z")
	private final boolean aBoolean187;

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
	private int anInt2367;

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
	private int anInt2370;

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
	private int anInt2360;

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
	public int anInt2363;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!bv;II)V")
	public Class1_Sub5_Sub2(@OriginalArg(0) Class1_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub6_5 = arg0;
		this.anInt2366 = arg0.anInt645;
		this.anInt2371 = arg0.anInt644;
		this.aBoolean187 = arg0.aBoolean57;
		this.anInt2367 = arg1;
		this.anInt2370 = arg2;
		this.anInt2360 = 8192;
		this.anInt2363 = 0;
		this.method2003();
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!bv;III)V")
	public Class1_Sub5_Sub2(@OriginalArg(0) Class1_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub6_5 = arg0;
		this.anInt2366 = arg0.anInt645;
		this.anInt2371 = arg0.anInt644;
		this.aBoolean187 = arg0.aBoolean57;
		this.anInt2367 = arg1;
		this.anInt2370 = arg2;
		this.anInt2360 = arg3;
		this.anInt2363 = 0;
		this.method2003();
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V")
	private synchronized void method1966() {
		this.method1969(0, this.method1985());
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V")
	public synchronized void method1968(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1966();
			this.method5965();
		} else if (this.anInt2373 == 0 && this.anInt2364 == 0) {
			this.anInt2372 = 0;
			this.anInt2370 = 0;
			this.anInt2365 = 0;
			this.method5965();
		} else {
			@Pc(31) int local31 = -this.anInt2365;
			if (this.anInt2365 > local31) {
				local31 = this.anInt2365;
			}
			if (-this.anInt2373 > local31) {
				local31 = -this.anInt2373;
			}
			if (this.anInt2373 > local31) {
				local31 = this.anInt2373;
			}
			if (-this.anInt2364 > local31) {
				local31 = -this.anInt2364;
			}
			if (this.anInt2364 > local31) {
				local31 = this.anInt2364;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2372 = arg0;
			this.anInt2370 = Integer.MIN_VALUE;
			this.anInt2368 = -this.anInt2365 / arg0;
			this.anInt2362 = -this.anInt2373 / arg0;
			this.anInt2369 = -this.anInt2364 / arg0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
	private synchronized void method1969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2370 = arg0;
		this.anInt2360 = arg1;
		this.anInt2372 = 0;
		this.method2003();
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V")
	public synchronized void method1972(@OriginalArg(0) int arg0) {
		this.anInt2361 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4445(@OriginalArg(0) int arg0) {
		if (this.anInt2372 > 0) {
			if (arg0 >= this.anInt2372) {
				if (this.anInt2370 == Integer.MIN_VALUE) {
					this.anInt2370 = 0;
					this.anInt2365 = this.anInt2373 = this.anInt2364 = 0;
					this.method5965();
					arg0 = this.anInt2372;
				}
				this.anInt2372 = 0;
				this.method2003();
			} else {
				this.anInt2365 += this.anInt2368 * arg0;
				this.anInt2373 += this.anInt2362 * arg0;
				this.anInt2364 += this.anInt2369 * arg0;
				this.anInt2372 -= arg0;
			}
		}
		@Pc(71) Class1_Sub6_Sub1 local71 = (Class1_Sub6_Sub1) super.aClass1_Sub6_5;
		@Pc(76) int local76 = this.anInt2366 << 8;
		@Pc(81) int local81 = this.anInt2371 << 8;
		@Pc(87) int local87 = local71.aByteArray6.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2361 = 0;
		}
		if (this.anInt2363 < 0) {
			if (this.anInt2367 <= 0) {
				this.method1975();
				this.method5965();
				return;
			}
			this.anInt2363 = 0;
		}
		if (this.anInt2363 >= local87) {
			if (this.anInt2367 >= 0) {
				this.method1975();
				this.method5965();
				return;
			}
			this.anInt2363 = local87 - 1;
		}
		this.anInt2363 += this.anInt2367 * arg0;
		if (this.anInt2361 >= 0) {
			if (this.anInt2361 > 0) {
				if (this.aBoolean187) {
					label125: {
						if (this.anInt2367 < 0) {
							if (this.anInt2363 >= local76) {
								return;
							}
							this.anInt2363 = local76 + local76 - this.anInt2363 - 1;
							this.anInt2367 = -this.anInt2367;
							if (--this.anInt2361 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2363 < local81) {
								return;
							}
							this.anInt2363 = local81 + local81 - this.anInt2363 - 1;
							this.anInt2367 = -this.anInt2367;
							if (--this.anInt2361 == 0) {
								break;
							}
							if (this.anInt2363 >= local76) {
								return;
							}
							this.anInt2363 = local76 + local76 - this.anInt2363 - 1;
							this.anInt2367 = -this.anInt2367;
						} while (--this.anInt2361 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2367 < 0) {
						if (this.anInt2363 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2363 - 1) / local91;
						if (local361 < this.anInt2361) {
							this.anInt2363 += local91 * local361;
							this.anInt2361 -= local361;
							return;
						}
						this.anInt2363 += local91 * this.anInt2361;
						this.anInt2361 = 0;
					} else if (this.anInt2363 >= local81) {
						local361 = (this.anInt2363 - local76) / local91;
						if (local361 < this.anInt2361) {
							this.anInt2363 -= local91 * local361;
							this.anInt2361 -= local361;
							return;
						}
						this.anInt2363 -= local91 * this.anInt2361;
						this.anInt2361 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2367 < 0) {
				if (this.anInt2363 < 0) {
					this.anInt2363 = -1;
					this.method1975();
					this.method5965();
					return;
				}
			} else if (this.anInt2363 >= local87) {
				this.anInt2363 = local87;
				this.method1975();
				this.method5965();
			}
		} else if (this.aBoolean187) {
			if (this.anInt2367 < 0) {
				if (this.anInt2363 >= local76) {
					return;
				}
				this.anInt2363 = local76 + local76 - this.anInt2363 - 1;
				this.anInt2367 = -this.anInt2367;
			}
			while (this.anInt2363 >= local81) {
				this.anInt2363 = local81 + local81 - this.anInt2363 - 1;
				this.anInt2367 = -this.anInt2367;
				if (this.anInt2363 >= local76) {
					return;
				}
				this.anInt2363 = local76 + local76 - this.anInt2363 - 1;
				this.anInt2367 = -this.anInt2367;
			}
		} else if (this.anInt2367 < 0) {
			if (this.anInt2363 < local76) {
				this.anInt2363 = local81 - (local81 - 1 - this.anInt2363) % local91 - 1;
			}
		} else if (this.anInt2363 >= local81) {
			this.anInt2363 = local76 + (this.anInt2363 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "()V")
	private void method1975() {
		if (this.anInt2372 == 0) {
			return;
		}
		if (this.anInt2370 == Integer.MIN_VALUE) {
			this.anInt2370 = 0;
		}
		this.anInt2372 = 0;
		this.method2003();
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V")
	public synchronized void method1976(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2363 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "()I")
	@Override
	public int method4444() {
		@Pc(6) int local6 = this.anInt2365 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2361 == 0) {
			local6 -= local6 * this.anInt2363 / (((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6.length << 8);
		} else if (this.anInt2361 >= 0) {
			local6 -= local6 * this.anInt2366 / ((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "()Z")
	private boolean method1978() {
		@Pc(2) int local2 = this.anInt2370;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static460.method1994(local2, this.anInt2360);
			local8 = Static460.method1998(local2, this.anInt2360);
		}
		if (this.anInt2365 != local2 || this.anInt2373 != local10 || this.anInt2364 != local8) {
			if (this.anInt2365 < local2) {
				this.anInt2368 = 1;
				this.anInt2372 = local2 - this.anInt2365;
			} else if (this.anInt2365 > local2) {
				this.anInt2368 = -1;
				this.anInt2372 = this.anInt2365 - local2;
			} else {
				this.anInt2368 = 0;
			}
			if (this.anInt2373 < local10) {
				this.anInt2362 = 1;
				if (this.anInt2372 == 0 || this.anInt2372 > local10 - this.anInt2373) {
					this.anInt2372 = local10 - this.anInt2373;
				}
			} else if (this.anInt2373 > local10) {
				this.anInt2362 = -1;
				if (this.anInt2372 == 0 || this.anInt2372 > this.anInt2373 - local10) {
					this.anInt2372 = this.anInt2373 - local10;
				}
			} else {
				this.anInt2362 = 0;
			}
			if (this.anInt2364 < local8) {
				this.anInt2369 = 1;
				if (this.anInt2372 == 0 || this.anInt2372 > local8 - this.anInt2364) {
					this.anInt2372 = local8 - this.anInt2364;
				}
			} else if (this.anInt2364 > local8) {
				this.anInt2369 = -1;
				if (this.anInt2372 == 0 || this.anInt2372 > this.anInt2364 - local8) {
					this.anInt2372 = this.anInt2364 - local8;
				}
			} else {
				this.anInt2369 = 0;
			}
			return false;
		} else if (this.anInt2370 == Integer.MIN_VALUE) {
			this.anInt2370 = 0;
			this.anInt2365 = this.anInt2373 = this.anInt2364 = 0;
			this.method5965();
			return true;
		} else {
			this.method2003();
			return false;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([IIIII)I")
	private int method1979(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2372 <= 0) {
				if (this.anInt2367 == -256 && (this.anInt2363 & 0xFF) == 0) {
					if (Static183.aBoolean268) {
						return Static460.method1999(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2373, this.anInt2364, arg3, arg2, this);
					}
					return Static460.method1992(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2365, arg3, arg2, this);
				}
				if (Static183.aBoolean268) {
					return Static460.method2001(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2373, this.anInt2364, arg3, arg2, this, this.anInt2367, arg4);
				}
				return Static460.method1984(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2365, arg3, arg2, this, this.anInt2367, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2372;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2372 += arg1;
			if (this.anInt2367 == -256 && (this.anInt2363 & 0xFF) == 0) {
				if (Static183.aBoolean268) {
					arg1 = Static460.method1973(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2373, this.anInt2364, this.anInt2362, this.anInt2369, local5, arg2, this);
				} else {
					arg1 = Static460.method1988(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2365, this.anInt2368, local5, arg2, this);
				}
			} else if (Static183.aBoolean268) {
				arg1 = Static460.method1967(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2373, this.anInt2364, this.anInt2362, this.anInt2369, local5, arg2, this, this.anInt2367, arg4);
			} else {
				arg1 = Static460.method1977(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2365, this.anInt2368, local5, arg2, this, this.anInt2367, arg4);
			}
			this.anInt2372 -= arg1;
			if (this.anInt2372 != 0) {
				return arg1;
			}
		} while (!this.method1978());
		return arg3;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "()Lclient!ei;")
	@Override
	public Class1_Sub5 method4447() {
		return null;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4446(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2370 == 0 && this.anInt2372 == 0) {
			this.method4445(arg2);
			return;
		}
		@Pc(13) Class1_Sub6_Sub1 local13 = (Class1_Sub6_Sub1) super.aClass1_Sub6_5;
		@Pc(18) int local18 = this.anInt2366 << 8;
		@Pc(23) int local23 = this.anInt2371 << 8;
		@Pc(29) int local29 = local13.aByteArray6.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2361 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2363 < 0) {
			if (this.anInt2367 <= 0) {
				this.method1975();
				this.method5965();
				return;
			}
			this.anInt2363 = 0;
		}
		if (this.anInt2363 >= local29) {
			if (this.anInt2367 >= 0) {
				this.method1975();
				this.method5965();
				return;
			}
			this.anInt2363 = local29 - 1;
		}
		if (this.anInt2361 >= 0) {
			if (this.anInt2361 > 0) {
				if (this.aBoolean187) {
					label130: {
						if (this.anInt2367 < 0) {
							local40 = this.method1979(arg0, arg1, local18, local44, local13.aByteArray6[this.anInt2366]);
							if (this.anInt2363 >= local18) {
								return;
							}
							this.anInt2363 = local18 + local18 - this.anInt2363 - 1;
							this.anInt2367 = -this.anInt2367;
							if (--this.anInt2361 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1991(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2371 - 1]);
							if (this.anInt2363 < local23) {
								return;
							}
							this.anInt2363 = local23 + local23 - this.anInt2363 - 1;
							this.anInt2367 = -this.anInt2367;
							if (--this.anInt2361 == 0) {
								break;
							}
							local40 = this.method1979(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2366]);
							if (this.anInt2363 >= local18) {
								return;
							}
							this.anInt2363 = local18 + local18 - this.anInt2363 - 1;
							this.anInt2367 = -this.anInt2367;
						} while (--this.anInt2361 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2367 < 0) {
						while (true) {
							local40 = this.method1979(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2371 - 1]);
							if (this.anInt2363 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2363 - 1) / local33;
							if (local416 >= this.anInt2361) {
								this.anInt2363 += local33 * this.anInt2361;
								this.anInt2361 = 0;
								break;
							}
							this.anInt2363 += local33 * local416;
							this.anInt2361 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1991(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2366]);
							if (this.anInt2363 < local23) {
								return;
							}
							local416 = (this.anInt2363 - local18) / local33;
							if (local416 >= this.anInt2361) {
								this.anInt2363 -= local33 * this.anInt2361;
								this.anInt2361 = 0;
								break;
							}
							this.anInt2363 -= local33 * local416;
							this.anInt2361 -= local416;
						}
					}
				}
			}
			if (this.anInt2367 < 0) {
				this.method1979(arg0, local40, 0, local44, 0);
				if (this.anInt2363 < 0) {
					this.anInt2363 = -1;
					this.method1975();
					this.method5965();
					return;
				}
			} else {
				this.method1991(arg0, local40, local29, local44, 0);
				if (this.anInt2363 >= local29) {
					this.anInt2363 = local29;
					this.method1975();
					this.method5965();
				}
			}
		} else if (this.aBoolean187) {
			if (this.anInt2367 < 0) {
				local40 = this.method1979(arg0, arg1, local18, local44, local13.aByteArray6[this.anInt2366]);
				if (this.anInt2363 >= local18) {
					return;
				}
				this.anInt2363 = local18 + local18 - this.anInt2363 - 1;
				this.anInt2367 = -this.anInt2367;
			}
			while (true) {
				local40 = this.method1991(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2371 - 1]);
				if (this.anInt2363 < local23) {
					return;
				}
				this.anInt2363 = local23 + local23 - this.anInt2363 - 1;
				this.anInt2367 = -this.anInt2367;
				local40 = this.method1979(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2366]);
				if (this.anInt2363 >= local18) {
					return;
				}
				this.anInt2363 = local18 + local18 - this.anInt2363 - 1;
				this.anInt2367 = -this.anInt2367;
			}
		} else if (this.anInt2367 < 0) {
			while (true) {
				local40 = this.method1979(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2371 - 1]);
				if (this.anInt2363 >= local18) {
					return;
				}
				this.anInt2363 = local23 - (local23 - 1 - this.anInt2363) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1991(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2366]);
				if (this.anInt2363 < local23) {
					return;
				}
				this.anInt2363 = local18 + (this.anInt2363 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "()I")
	public synchronized int method1981() {
		return this.anInt2370 == Integer.MIN_VALUE ? 0 : this.anInt2370;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	public synchronized void method1982() {
		this.anInt2367 = (this.anInt2367 ^ this.anInt2367 >> 31) + (this.anInt2367 >>> 31);
		this.anInt2367 = -this.anInt2367;
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "()Z")
	public boolean method1983() {
		return this.anInt2363 < 0 || this.anInt2363 >= ((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6.length << 8;
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "()I")
	public synchronized int method1985() {
		return this.anInt2360 < 0 ? -1 : this.anInt2360;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	public synchronized void method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1969(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static460.method1994(arg1, arg2);
		@Pc(14) int local14 = Static460.method1998(arg1, arg2);
		if (this.anInt2373 == local10 && this.anInt2364 == local14) {
			this.anInt2372 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2365;
		if (this.anInt2365 - arg1 > local31) {
			local31 = this.anInt2365 - arg1;
		}
		if (local10 - this.anInt2373 > local31) {
			local31 = local10 - this.anInt2373;
		}
		if (this.anInt2373 - local10 > local31) {
			local31 = this.anInt2373 - local10;
		}
		if (local14 - this.anInt2364 > local31) {
			local31 = local14 - this.anInt2364;
		}
		if (this.anInt2364 - local14 > local31) {
			local31 = this.anInt2364 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2372 = arg0;
		this.anInt2370 = arg1;
		this.anInt2360 = arg2;
		this.anInt2368 = (arg1 - this.anInt2365) / arg0;
		this.anInt2362 = (local10 - this.anInt2373) / arg0;
		this.anInt2369 = (local14 - this.anInt2364) / arg0;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V")
	public synchronized void method1987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1986(arg0, arg1, this.method1985());
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "()Z")
	public boolean method1989() {
		return this.anInt2372 != 0;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "([IIIII)I")
	private int method1991(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2372 <= 0) {
				if (this.anInt2367 == 256 && (this.anInt2363 & 0xFF) == 0) {
					if (Static183.aBoolean268) {
						return Static460.method1970(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2373, this.anInt2364, arg3, arg2, this);
					}
					return Static460.method2002(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2365, arg3, arg2, this);
				}
				if (Static183.aBoolean268) {
					return Static460.method2000(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2373, this.anInt2364, arg3, arg2, this, this.anInt2367, arg4);
				}
				return Static460.method1974(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2365, arg3, arg2, this, this.anInt2367, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2372;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2372 += arg1;
			if (this.anInt2367 == 256 && (this.anInt2363 & 0xFF) == 0) {
				if (Static183.aBoolean268) {
					arg1 = Static460.method1993(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2373, this.anInt2364, this.anInt2362, this.anInt2369, local5, arg2, this);
				} else {
					arg1 = Static460.method1990(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2365, this.anInt2368, local5, arg2, this);
				}
			} else if (Static183.aBoolean268) {
				arg1 = Static460.method1980(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2373, this.anInt2364, this.anInt2362, this.anInt2369, local5, arg2, this, this.anInt2367, arg4);
			} else {
				arg1 = Static460.method1971(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray6, arg0, this.anInt2363, arg1, this.anInt2365, this.anInt2368, local5, arg2, this, this.anInt2367, arg4);
			}
			this.anInt2372 -= arg1;
			if (this.anInt2372 != 0) {
				return arg1;
			}
		} while (!this.method1978());
		return arg3;
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)V")
	public synchronized void method1995(@OriginalArg(0) int arg0) {
		this.method1969(arg0 << 6, this.method1985());
	}

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "()I")
	public synchronized int method1996() {
		return this.anInt2367 < 0 ? -this.anInt2367 : this.anInt2367;
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "(I)V")
	public synchronized void method1997(@OriginalArg(0) int arg0) {
		if (this.anInt2367 < 0) {
			this.anInt2367 = -arg0;
		} else {
			this.anInt2367 = arg0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()I")
	@Override
	public int method4441() {
		return this.anInt2370 == 0 && this.anInt2372 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "()V")
	private void method2003() {
		this.anInt2365 = this.anInt2370;
		this.anInt2373 = Static460.method1994(this.anInt2370, this.anInt2360);
		this.anInt2364 = Static460.method1998(this.anInt2370, this.anInt2360);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "()Lclient!ei;")
	@Override
	public Class1_Sub5 method4442() {
		return null;
	}
}
