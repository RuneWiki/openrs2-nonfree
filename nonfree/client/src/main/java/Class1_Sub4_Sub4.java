import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub4_Sub4 extends Class1_Sub4 {

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
	public int anInt3000;

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
	public int anInt3001;

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
	public int anInt3002;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
	private int anInt3006;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
	public int anInt3008;

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	public int anInt3009;

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
	private int anInt3010;

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
	public int anInt3012;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
	private int anInt3004;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
	private int anInt3005;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "Z")
	private boolean aBoolean133;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
	private int anInt3007;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
	private int anInt3013;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
	private int anInt3011;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
	public int anInt3003;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!oh;II)V")
	public Class1_Sub4_Sub4(@OriginalArg(0) Class1_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub6_5 = arg0;
		this.anInt3004 = arg0.anInt3210;
		this.anInt3005 = arg0.anInt3209;
		this.aBoolean133 = arg0.aBoolean142;
		this.anInt3007 = arg1;
		this.anInt3013 = arg2;
		this.anInt3011 = 8192;
		this.anInt3003 = 0;
		this.method2385();
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!oh;III)V")
	public Class1_Sub4_Sub4(@OriginalArg(0) Class1_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub6_5 = arg0;
		this.anInt3004 = arg0.anInt3210;
		this.anInt3005 = arg0.anInt3209;
		this.aBoolean133 = arg0.aBoolean142;
		this.anInt3007 = arg1;
		this.anInt3013 = arg2;
		this.anInt3011 = arg3;
		this.anInt3003 = 0;
		this.method2385();
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "()I")
	public synchronized int method2363() {
		return this.anInt3011 < 0 ? -1 : this.anInt3011;
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
	public synchronized void method2365(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3003 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V")
	public synchronized void method2370(@OriginalArg(0) int arg0) {
		this.method2374(arg0 << 6, this.method2363());
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method2357(@OriginalArg(0) int arg0) {
		if (this.anInt3006 > 0) {
			if (arg0 >= this.anInt3006) {
				if (this.anInt3013 == Integer.MIN_VALUE) {
					this.anInt3013 = 0;
					this.anInt3002 = this.anInt3001 = this.anInt3008 = 0;
					this.method3758();
					arg0 = this.anInt3006;
				}
				this.anInt3006 = 0;
				this.method2385();
			} else {
				this.anInt3002 += this.anInt3009 * arg0;
				this.anInt3001 += this.anInt3012 * arg0;
				this.anInt3008 += this.anInt3000 * arg0;
				this.anInt3006 -= arg0;
			}
		}
		@Pc(71) Class1_Sub6_Sub1 local71 = (Class1_Sub6_Sub1) super.aClass1_Sub6_5;
		@Pc(76) int local76 = this.anInt3004 << 8;
		@Pc(81) int local81 = this.anInt3005 << 8;
		@Pc(87) int local87 = local71.aByteArray32.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3010 = 0;
		}
		if (this.anInt3003 < 0) {
			if (this.anInt3007 <= 0) {
				this.method2383();
				this.method3758();
				return;
			}
			this.anInt3003 = 0;
		}
		if (this.anInt3003 >= local87) {
			if (this.anInt3007 >= 0) {
				this.method2383();
				this.method3758();
				return;
			}
			this.anInt3003 = local87 - 1;
		}
		this.anInt3003 += this.anInt3007 * arg0;
		if (this.anInt3010 >= 0) {
			if (this.anInt3010 > 0) {
				if (this.aBoolean133) {
					label125: {
						if (this.anInt3007 < 0) {
							if (this.anInt3003 >= local76) {
								return;
							}
							this.anInt3003 = local76 + local76 - this.anInt3003 - 1;
							this.anInt3007 = -this.anInt3007;
							if (--this.anInt3010 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3003 < local81) {
								return;
							}
							this.anInt3003 = local81 + local81 - this.anInt3003 - 1;
							this.anInt3007 = -this.anInt3007;
							if (--this.anInt3010 == 0) {
								break;
							}
							if (this.anInt3003 >= local76) {
								return;
							}
							this.anInt3003 = local76 + local76 - this.anInt3003 - 1;
							this.anInt3007 = -this.anInt3007;
						} while (--this.anInt3010 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3007 < 0) {
						if (this.anInt3003 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3003 - 1) / local91;
						if (local361 < this.anInt3010) {
							this.anInt3003 += local91 * local361;
							this.anInt3010 -= local361;
							return;
						}
						this.anInt3003 += local91 * this.anInt3010;
						this.anInt3010 = 0;
					} else if (this.anInt3003 >= local81) {
						local361 = (this.anInt3003 - local76) / local91;
						if (local361 < this.anInt3010) {
							this.anInt3003 -= local91 * local361;
							this.anInt3010 -= local361;
							return;
						}
						this.anInt3003 -= local91 * this.anInt3010;
						this.anInt3010 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3007 < 0) {
				if (this.anInt3003 < 0) {
					this.anInt3003 = -1;
					this.method2383();
					this.method3758();
					return;
				}
			} else if (this.anInt3003 >= local87) {
				this.anInt3003 = local87;
				this.method2383();
				this.method3758();
			}
		} else if (this.aBoolean133) {
			if (this.anInt3007 < 0) {
				if (this.anInt3003 >= local76) {
					return;
				}
				this.anInt3003 = local76 + local76 - this.anInt3003 - 1;
				this.anInt3007 = -this.anInt3007;
			}
			while (this.anInt3003 >= local81) {
				this.anInt3003 = local81 + local81 - this.anInt3003 - 1;
				this.anInt3007 = -this.anInt3007;
				if (this.anInt3003 >= local76) {
					return;
				}
				this.anInt3003 = local76 + local76 - this.anInt3003 - 1;
				this.anInt3007 = -this.anInt3007;
			}
		} else if (this.anInt3007 < 0) {
			if (this.anInt3003 < local76) {
				this.anInt3003 = local81 - (local81 - 1 - this.anInt3003) % local91 - 1;
			}
		} else if (this.anInt3003 >= local81) {
			this.anInt3003 = local76 + (this.anInt3003 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public synchronized void method2372() {
		this.anInt3007 = (this.anInt3007 ^ this.anInt3007 >> 31) + (this.anInt3007 >>> 31);
		this.anInt3007 = -this.anInt3007;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([IIIII)I")
	private int method2373(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3006 <= 0) {
				if (this.anInt3007 == 256 && (this.anInt3003 & 0xFF) == 0) {
					if (Static15.aBoolean12) {
						return Static237.method2364(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3001, this.anInt3008, arg3, arg2, this);
					}
					return Static237.method2381(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3002, arg3, arg2, this);
				}
				if (Static15.aBoolean12) {
					return Static237.method2366(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3001, this.anInt3008, arg3, arg2, this, this.anInt3007, arg4);
				}
				return Static237.method2369(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3002, arg3, arg2, this, this.anInt3007, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3006;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3006 += arg1;
			if (this.anInt3007 == 256 && (this.anInt3003 & 0xFF) == 0) {
				if (Static15.aBoolean12) {
					arg1 = Static237.method2376(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3001, this.anInt3008, this.anInt3012, this.anInt3000, local5, arg2, this);
				} else {
					arg1 = Static237.method2371(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3002, this.anInt3009, local5, arg2, this);
				}
			} else if (Static15.aBoolean12) {
				arg1 = Static237.method2380(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3001, this.anInt3008, this.anInt3012, this.anInt3000, local5, arg2, this, this.anInt3007, arg4);
			} else {
				arg1 = Static237.method2388(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3002, this.anInt3009, local5, arg2, this, this.anInt3007, arg4);
			}
			this.anInt3006 -= arg1;
			if (this.anInt3006 != 0) {
				return arg1;
			}
		} while (!this.method2399());
		return arg3;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)V")
	private synchronized void method2374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3013 = arg0;
		this.anInt3011 = arg1;
		this.anInt3006 = 0;
		this.method2385();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	public synchronized void method2375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2374(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static237.method2377(arg1, arg2);
		@Pc(14) int local14 = Static237.method2379(arg1, arg2);
		if (this.anInt3001 == local10 && this.anInt3008 == local14) {
			this.anInt3006 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3002;
		if (this.anInt3002 - arg1 > local31) {
			local31 = this.anInt3002 - arg1;
		}
		if (local10 - this.anInt3001 > local31) {
			local31 = local10 - this.anInt3001;
		}
		if (this.anInt3001 - local10 > local31) {
			local31 = this.anInt3001 - local10;
		}
		if (local14 - this.anInt3008 > local31) {
			local31 = local14 - this.anInt3008;
		}
		if (this.anInt3008 - local14 > local31) {
			local31 = this.anInt3008 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3006 = arg0;
		this.anInt3013 = arg1;
		this.anInt3011 = arg2;
		this.anInt3009 = (arg1 - this.anInt3002) / arg0;
		this.anInt3012 = (local10 - this.anInt3001) / arg0;
		this.anInt3000 = (local14 - this.anInt3008) / arg0;
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "()V")
	private void method2383() {
		if (this.anInt3006 == 0) {
			return;
		}
		if (this.anInt3013 == Integer.MIN_VALUE) {
			this.anInt3013 = 0;
		}
		this.anInt3006 = 0;
		this.method2385();
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "()Z")
	public boolean method2384() {
		return this.anInt3003 < 0 || this.anInt3003 >= ((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32.length << 8;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "()Lclient!r;")
	@Override
	public Class1_Sub4 method2354() {
		return null;
	}

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "()V")
	private void method2385() {
		this.anInt3002 = this.anInt3013;
		this.anInt3001 = Static237.method2377(this.anInt3013, this.anInt3011);
		this.anInt3008 = Static237.method2379(this.anInt3013, this.anInt3011);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "()I")
	@Override
	public int method2356() {
		return this.anInt3013 == 0 && this.anInt3006 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "()I")
	@Override
	public int method2358() {
		@Pc(6) int local6 = this.anInt3002 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3010 == 0) {
			local6 -= local6 * this.anInt3003 / (((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32.length << 8);
		} else if (this.anInt3010 >= 0) {
			local6 -= local6 * this.anInt3004 / ((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)V")
	public synchronized void method2389(@OriginalArg(0) int arg0) {
		this.anInt3010 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "([IIIII)I")
	private int method2390(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3006 <= 0) {
				if (this.anInt3007 == -256 && (this.anInt3003 & 0xFF) == 0) {
					if (Static15.aBoolean12) {
						return Static237.method2367(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3001, this.anInt3008, arg3, arg2, this);
					}
					return Static237.method2361(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3002, arg3, arg2, this);
				}
				if (Static15.aBoolean12) {
					return Static237.method2360(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3001, this.anInt3008, arg3, arg2, this, this.anInt3007, arg4);
				}
				return Static237.method2368(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3002, arg3, arg2, this, this.anInt3007, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3006;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3006 += arg1;
			if (this.anInt3007 == -256 && (this.anInt3003 & 0xFF) == 0) {
				if (Static15.aBoolean12) {
					arg1 = Static237.method2387(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3001, this.anInt3008, this.anInt3012, this.anInt3000, local5, arg2, this);
				} else {
					arg1 = Static237.method2382(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3002, this.anInt3009, local5, arg2, this);
				}
			} else if (Static15.aBoolean12) {
				arg1 = Static237.method2362(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3001, this.anInt3008, this.anInt3012, this.anInt3000, local5, arg2, this, this.anInt3007, arg4);
			} else {
				arg1 = Static237.method2386(((Class1_Sub6_Sub1) super.aClass1_Sub6_5).aByteArray32, arg0, this.anInt3003, arg1, this.anInt3002, this.anInt3009, local5, arg2, this, this.anInt3007, arg4);
			}
			this.anInt3006 -= arg1;
			if (this.anInt3006 != 0) {
				return arg1;
			}
		} while (!this.method2399());
		return arg3;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2355(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3013 == 0 && this.anInt3006 == 0) {
			this.method2357(arg2);
			return;
		}
		@Pc(13) Class1_Sub6_Sub1 local13 = (Class1_Sub6_Sub1) super.aClass1_Sub6_5;
		@Pc(18) int local18 = this.anInt3004 << 8;
		@Pc(23) int local23 = this.anInt3005 << 8;
		@Pc(29) int local29 = local13.aByteArray32.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3010 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3003 < 0) {
			if (this.anInt3007 <= 0) {
				this.method2383();
				this.method3758();
				return;
			}
			this.anInt3003 = 0;
		}
		if (this.anInt3003 >= local29) {
			if (this.anInt3007 >= 0) {
				this.method2383();
				this.method3758();
				return;
			}
			this.anInt3003 = local29 - 1;
		}
		if (this.anInt3010 >= 0) {
			if (this.anInt3010 > 0) {
				if (this.aBoolean133) {
					label130: {
						if (this.anInt3007 < 0) {
							local40 = this.method2390(arg0, arg1, local18, local44, local13.aByteArray32[this.anInt3004]);
							if (this.anInt3003 >= local18) {
								return;
							}
							this.anInt3003 = local18 + local18 - this.anInt3003 - 1;
							this.anInt3007 = -this.anInt3007;
							if (--this.anInt3010 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2373(arg0, local40, local23, local44, local13.aByteArray32[this.anInt3005 - 1]);
							if (this.anInt3003 < local23) {
								return;
							}
							this.anInt3003 = local23 + local23 - this.anInt3003 - 1;
							this.anInt3007 = -this.anInt3007;
							if (--this.anInt3010 == 0) {
								break;
							}
							local40 = this.method2390(arg0, local40, local18, local44, local13.aByteArray32[this.anInt3004]);
							if (this.anInt3003 >= local18) {
								return;
							}
							this.anInt3003 = local18 + local18 - this.anInt3003 - 1;
							this.anInt3007 = -this.anInt3007;
						} while (--this.anInt3010 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3007 < 0) {
						while (true) {
							local40 = this.method2390(arg0, local40, local18, local44, local13.aByteArray32[this.anInt3005 - 1]);
							if (this.anInt3003 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3003 - 1) / local33;
							if (local416 >= this.anInt3010) {
								this.anInt3003 += local33 * this.anInt3010;
								this.anInt3010 = 0;
								break;
							}
							this.anInt3003 += local33 * local416;
							this.anInt3010 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2373(arg0, local40, local23, local44, local13.aByteArray32[this.anInt3004]);
							if (this.anInt3003 < local23) {
								return;
							}
							local416 = (this.anInt3003 - local18) / local33;
							if (local416 >= this.anInt3010) {
								this.anInt3003 -= local33 * this.anInt3010;
								this.anInt3010 = 0;
								break;
							}
							this.anInt3003 -= local33 * local416;
							this.anInt3010 -= local416;
						}
					}
				}
			}
			if (this.anInt3007 < 0) {
				this.method2390(arg0, local40, 0, local44, 0);
				if (this.anInt3003 < 0) {
					this.anInt3003 = -1;
					this.method2383();
					this.method3758();
					return;
				}
			} else {
				this.method2373(arg0, local40, local29, local44, 0);
				if (this.anInt3003 >= local29) {
					this.anInt3003 = local29;
					this.method2383();
					this.method3758();
				}
			}
		} else if (this.aBoolean133) {
			if (this.anInt3007 < 0) {
				local40 = this.method2390(arg0, arg1, local18, local44, local13.aByteArray32[this.anInt3004]);
				if (this.anInt3003 >= local18) {
					return;
				}
				this.anInt3003 = local18 + local18 - this.anInt3003 - 1;
				this.anInt3007 = -this.anInt3007;
			}
			while (true) {
				local40 = this.method2373(arg0, local40, local23, local44, local13.aByteArray32[this.anInt3005 - 1]);
				if (this.anInt3003 < local23) {
					return;
				}
				this.anInt3003 = local23 + local23 - this.anInt3003 - 1;
				this.anInt3007 = -this.anInt3007;
				local40 = this.method2390(arg0, local40, local18, local44, local13.aByteArray32[this.anInt3004]);
				if (this.anInt3003 >= local18) {
					return;
				}
				this.anInt3003 = local18 + local18 - this.anInt3003 - 1;
				this.anInt3007 = -this.anInt3007;
			}
		} else if (this.anInt3007 < 0) {
			while (true) {
				local40 = this.method2390(arg0, local40, local18, local44, local13.aByteArray32[this.anInt3005 - 1]);
				if (this.anInt3003 >= local18) {
					return;
				}
				this.anInt3003 = local23 - (local23 - 1 - this.anInt3003) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2373(arg0, local40, local23, local44, local13.aByteArray32[this.anInt3004]);
				if (this.anInt3003 < local23) {
					return;
				}
				this.anInt3003 = local18 + (this.anInt3003 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "()I")
	public synchronized int method2391() {
		return this.anInt3007 < 0 ? -this.anInt3007 : this.anInt3007;
	}

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "()Z")
	public boolean method2393() {
		return this.anInt3006 != 0;
	}

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)V")
	public synchronized void method2394(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2398();
			this.method3758();
		} else if (this.anInt3001 == 0 && this.anInt3008 == 0) {
			this.anInt3006 = 0;
			this.anInt3013 = 0;
			this.anInt3002 = 0;
			this.method3758();
		} else {
			@Pc(31) int local31 = -this.anInt3002;
			if (this.anInt3002 > local31) {
				local31 = this.anInt3002;
			}
			if (-this.anInt3001 > local31) {
				local31 = -this.anInt3001;
			}
			if (this.anInt3001 > local31) {
				local31 = this.anInt3001;
			}
			if (-this.anInt3008 > local31) {
				local31 = -this.anInt3008;
			}
			if (this.anInt3008 > local31) {
				local31 = this.anInt3008;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3006 = arg0;
			this.anInt3013 = Integer.MIN_VALUE;
			this.anInt3009 = -this.anInt3002 / arg0;
			this.anInt3012 = -this.anInt3001 / arg0;
			this.anInt3000 = -this.anInt3008 / arg0;
		}
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(II)V")
	public synchronized void method2395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2375(arg0, arg1, this.method2363());
	}

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "(I)V")
	public synchronized void method2396(@OriginalArg(0) int arg0) {
		if (this.anInt3007 < 0) {
			this.anInt3007 = -arg0;
		} else {
			this.anInt3007 = arg0;
		}
	}

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "()I")
	public synchronized int method2397() {
		return this.anInt3013 == Integer.MIN_VALUE ? 0 : this.anInt3013;
	}

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "(I)V")
	private synchronized void method2398() {
		this.method2374(0, this.method2363());
	}

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "()Z")
	private boolean method2399() {
		@Pc(2) int local2 = this.anInt3013;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static237.method2377(local2, this.anInt3011);
			local8 = Static237.method2379(local2, this.anInt3011);
		}
		if (this.anInt3002 != local2 || this.anInt3001 != local10 || this.anInt3008 != local8) {
			if (this.anInt3002 < local2) {
				this.anInt3009 = 1;
				this.anInt3006 = local2 - this.anInt3002;
			} else if (this.anInt3002 > local2) {
				this.anInt3009 = -1;
				this.anInt3006 = this.anInt3002 - local2;
			} else {
				this.anInt3009 = 0;
			}
			if (this.anInt3001 < local10) {
				this.anInt3012 = 1;
				if (this.anInt3006 == 0 || this.anInt3006 > local10 - this.anInt3001) {
					this.anInt3006 = local10 - this.anInt3001;
				}
			} else if (this.anInt3001 > local10) {
				this.anInt3012 = -1;
				if (this.anInt3006 == 0 || this.anInt3006 > this.anInt3001 - local10) {
					this.anInt3006 = this.anInt3001 - local10;
				}
			} else {
				this.anInt3012 = 0;
			}
			if (this.anInt3008 < local8) {
				this.anInt3000 = 1;
				if (this.anInt3006 == 0 || this.anInt3006 > local8 - this.anInt3008) {
					this.anInt3006 = local8 - this.anInt3008;
				}
			} else if (this.anInt3008 > local8) {
				this.anInt3000 = -1;
				if (this.anInt3006 == 0 || this.anInt3006 > this.anInt3008 - local8) {
					this.anInt3006 = this.anInt3008 - local8;
				}
			} else {
				this.anInt3000 = 0;
			}
			return false;
		} else if (this.anInt3013 == Integer.MIN_VALUE) {
			this.anInt3013 = 0;
			this.anInt3002 = this.anInt3001 = this.anInt3008 = 0;
			this.method3758();
			return true;
		} else {
			this.method2385();
			return false;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()Lclient!r;")
	@Override
	public Class1_Sub4 method2353() {
		return null;
	}
}
