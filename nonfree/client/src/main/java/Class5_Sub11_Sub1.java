import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class5_Sub11_Sub1 extends Class5_Sub11 {

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
	public int anInt2051;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
	public int anInt2052;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
	public int anInt2055;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	public int anInt2056;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
	public int anInt2057;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
	public int anInt2060;

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
	private int anInt2061;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
	private int anInt2062;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
	private final int anInt2054;

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
	private final int anInt2058;

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "Z")
	private final boolean aBoolean89;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
	private int anInt2050;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
	private int anInt2049;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
	private int anInt2059;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
	public int anInt2053;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!ne;II)V")
	public Class5_Sub11_Sub1(@OriginalArg(0) Class5_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass5_Sub7_5 = arg0;
		this.anInt2054 = arg0.anInt2689;
		this.anInt2058 = arg0.anInt2687;
		this.aBoolean89 = arg0.aBoolean118;
		this.anInt2050 = arg1;
		this.anInt2049 = arg2;
		this.anInt2059 = 8192;
		this.anInt2053 = 0;
		this.method1616();
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!ne;III)V")
	public Class5_Sub11_Sub1(@OriginalArg(0) Class5_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub7_5 = arg0;
		this.anInt2054 = arg0.anInt2689;
		this.anInt2058 = arg0.anInt2687;
		this.aBoolean89 = arg0.aBoolean118;
		this.anInt2050 = arg1;
		this.anInt2049 = arg2;
		this.anInt2059 = arg3;
		this.anInt2053 = 0;
		this.method1616();
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2869(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2049 == 0 && this.anInt2062 == 0) {
			this.method2870(arg2);
			return;
		}
		@Pc(13) Class5_Sub7_Sub1 local13 = (Class5_Sub7_Sub1) super.aClass5_Sub7_5;
		@Pc(18) int local18 = this.anInt2054 << 8;
		@Pc(23) int local23 = this.anInt2058 << 8;
		@Pc(29) int local29 = local13.aByteArray42.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2061 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2053 < 0) {
			if (this.anInt2050 <= 0) {
				this.method1602();
				this.method3207();
				return;
			}
			this.anInt2053 = 0;
		}
		if (this.anInt2053 >= local29) {
			if (this.anInt2050 >= 0) {
				this.method1602();
				this.method3207();
				return;
			}
			this.anInt2053 = local29 - 1;
		}
		if (this.anInt2061 >= 0) {
			if (this.anInt2061 > 0) {
				if (this.aBoolean89) {
					label130: {
						if (this.anInt2050 < 0) {
							local40 = this.method1591(arg0, arg1, local18, local44, local13.aByteArray42[this.anInt2054]);
							if (this.anInt2053 >= local18) {
								return;
							}
							this.anInt2053 = local18 + local18 - this.anInt2053 - 1;
							this.anInt2050 = -this.anInt2050;
							if (--this.anInt2061 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1590(arg0, local40, local23, local44, local13.aByteArray42[this.anInt2058 - 1]);
							if (this.anInt2053 < local23) {
								return;
							}
							this.anInt2053 = local23 + local23 - this.anInt2053 - 1;
							this.anInt2050 = -this.anInt2050;
							if (--this.anInt2061 == 0) {
								break;
							}
							local40 = this.method1591(arg0, local40, local18, local44, local13.aByteArray42[this.anInt2054]);
							if (this.anInt2053 >= local18) {
								return;
							}
							this.anInt2053 = local18 + local18 - this.anInt2053 - 1;
							this.anInt2050 = -this.anInt2050;
						} while (--this.anInt2061 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2050 < 0) {
						while (true) {
							local40 = this.method1591(arg0, local40, local18, local44, local13.aByteArray42[this.anInt2058 - 1]);
							if (this.anInt2053 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2053 - 1) / local33;
							if (local416 >= this.anInt2061) {
								this.anInt2053 += local33 * this.anInt2061;
								this.anInt2061 = 0;
								break;
							}
							this.anInt2053 += local33 * local416;
							this.anInt2061 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1590(arg0, local40, local23, local44, local13.aByteArray42[this.anInt2054]);
							if (this.anInt2053 < local23) {
								return;
							}
							local416 = (this.anInt2053 - local18) / local33;
							if (local416 >= this.anInt2061) {
								this.anInt2053 -= local33 * this.anInt2061;
								this.anInt2061 = 0;
								break;
							}
							this.anInt2053 -= local33 * local416;
							this.anInt2061 -= local416;
						}
					}
				}
			}
			if (this.anInt2050 < 0) {
				this.method1591(arg0, local40, 0, local44, 0);
				if (this.anInt2053 < 0) {
					this.anInt2053 = -1;
					this.method1602();
					this.method3207();
					return;
				}
			} else {
				this.method1590(arg0, local40, local29, local44, 0);
				if (this.anInt2053 >= local29) {
					this.anInt2053 = local29;
					this.method1602();
					this.method3207();
				}
			}
		} else if (this.aBoolean89) {
			if (this.anInt2050 < 0) {
				local40 = this.method1591(arg0, arg1, local18, local44, local13.aByteArray42[this.anInt2054]);
				if (this.anInt2053 >= local18) {
					return;
				}
				this.anInt2053 = local18 + local18 - this.anInt2053 - 1;
				this.anInt2050 = -this.anInt2050;
			}
			while (true) {
				local40 = this.method1590(arg0, local40, local23, local44, local13.aByteArray42[this.anInt2058 - 1]);
				if (this.anInt2053 < local23) {
					return;
				}
				this.anInt2053 = local23 + local23 - this.anInt2053 - 1;
				this.anInt2050 = -this.anInt2050;
				local40 = this.method1591(arg0, local40, local18, local44, local13.aByteArray42[this.anInt2054]);
				if (this.anInt2053 >= local18) {
					return;
				}
				this.anInt2053 = local18 + local18 - this.anInt2053 - 1;
				this.anInt2050 = -this.anInt2050;
			}
		} else if (this.anInt2050 < 0) {
			while (true) {
				local40 = this.method1591(arg0, local40, local18, local44, local13.aByteArray42[this.anInt2058 - 1]);
				if (this.anInt2053 >= local18) {
					return;
				}
				this.anInt2053 = local23 - (local23 - 1 - this.anInt2053) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1590(arg0, local40, local23, local44, local13.aByteArray42[this.anInt2054]);
				if (this.anInt2053 < local23) {
					return;
				}
				this.anInt2053 = local18 + (this.anInt2053 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "()I")
	public synchronized int method1578() {
		return this.anInt2050 < 0 ? -this.anInt2050 : this.anInt2050;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2870(@OriginalArg(0) int arg0) {
		if (this.anInt2062 > 0) {
			if (arg0 >= this.anInt2062) {
				if (this.anInt2049 == Integer.MIN_VALUE) {
					this.anInt2049 = 0;
					this.anInt2052 = this.anInt2051 = this.anInt2056 = 0;
					this.method3207();
					arg0 = this.anInt2062;
				}
				this.anInt2062 = 0;
				this.method1616();
			} else {
				this.anInt2052 += this.anInt2055 * arg0;
				this.anInt2051 += this.anInt2057 * arg0;
				this.anInt2056 += this.anInt2060 * arg0;
				this.anInt2062 -= arg0;
			}
		}
		@Pc(71) Class5_Sub7_Sub1 local71 = (Class5_Sub7_Sub1) super.aClass5_Sub7_5;
		@Pc(76) int local76 = this.anInt2054 << 8;
		@Pc(81) int local81 = this.anInt2058 << 8;
		@Pc(87) int local87 = local71.aByteArray42.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2061 = 0;
		}
		if (this.anInt2053 < 0) {
			if (this.anInt2050 <= 0) {
				this.method1602();
				this.method3207();
				return;
			}
			this.anInt2053 = 0;
		}
		if (this.anInt2053 >= local87) {
			if (this.anInt2050 >= 0) {
				this.method1602();
				this.method3207();
				return;
			}
			this.anInt2053 = local87 - 1;
		}
		this.anInt2053 += this.anInt2050 * arg0;
		if (this.anInt2061 >= 0) {
			if (this.anInt2061 > 0) {
				if (this.aBoolean89) {
					label125: {
						if (this.anInt2050 < 0) {
							if (this.anInt2053 >= local76) {
								return;
							}
							this.anInt2053 = local76 + local76 - this.anInt2053 - 1;
							this.anInt2050 = -this.anInt2050;
							if (--this.anInt2061 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2053 < local81) {
								return;
							}
							this.anInt2053 = local81 + local81 - this.anInt2053 - 1;
							this.anInt2050 = -this.anInt2050;
							if (--this.anInt2061 == 0) {
								break;
							}
							if (this.anInt2053 >= local76) {
								return;
							}
							this.anInt2053 = local76 + local76 - this.anInt2053 - 1;
							this.anInt2050 = -this.anInt2050;
						} while (--this.anInt2061 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2050 < 0) {
						if (this.anInt2053 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2053 - 1) / local91;
						if (local361 < this.anInt2061) {
							this.anInt2053 += local91 * local361;
							this.anInt2061 -= local361;
							return;
						}
						this.anInt2053 += local91 * this.anInt2061;
						this.anInt2061 = 0;
					} else if (this.anInt2053 >= local81) {
						local361 = (this.anInt2053 - local76) / local91;
						if (local361 < this.anInt2061) {
							this.anInt2053 -= local91 * local361;
							this.anInt2061 -= local361;
							return;
						}
						this.anInt2053 -= local91 * this.anInt2061;
						this.anInt2061 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2050 < 0) {
				if (this.anInt2053 < 0) {
					this.anInt2053 = -1;
					this.method1602();
					this.method3207();
					return;
				}
			} else if (this.anInt2053 >= local87) {
				this.anInt2053 = local87;
				this.method1602();
				this.method3207();
			}
		} else if (this.aBoolean89) {
			if (this.anInt2050 < 0) {
				if (this.anInt2053 >= local76) {
					return;
				}
				this.anInt2053 = local76 + local76 - this.anInt2053 - 1;
				this.anInt2050 = -this.anInt2050;
			}
			while (this.anInt2053 >= local81) {
				this.anInt2053 = local81 + local81 - this.anInt2053 - 1;
				this.anInt2050 = -this.anInt2050;
				if (this.anInt2053 >= local76) {
					return;
				}
				this.anInt2053 = local76 + local76 - this.anInt2053 - 1;
				this.anInt2050 = -this.anInt2050;
			}
		} else if (this.anInt2050 < 0) {
			if (this.anInt2053 < local76) {
				this.anInt2053 = local81 - (local81 - 1 - this.anInt2053) % local91 - 1;
			}
		} else if (this.anInt2053 >= local81) {
			this.anInt2053 = local76 + (this.anInt2053 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "()Z")
	private boolean method1581() {
		@Pc(2) int local2 = this.anInt2049;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static222.method1604(local2, this.anInt2059);
			local8 = Static222.method1601(local2, this.anInt2059);
		}
		if (this.anInt2052 != local2 || this.anInt2051 != local10 || this.anInt2056 != local8) {
			if (this.anInt2052 < local2) {
				this.anInt2055 = 1;
				this.anInt2062 = local2 - this.anInt2052;
			} else if (this.anInt2052 > local2) {
				this.anInt2055 = -1;
				this.anInt2062 = this.anInt2052 - local2;
			} else {
				this.anInt2055 = 0;
			}
			if (this.anInt2051 < local10) {
				this.anInt2057 = 1;
				if (this.anInt2062 == 0 || this.anInt2062 > local10 - this.anInt2051) {
					this.anInt2062 = local10 - this.anInt2051;
				}
			} else if (this.anInt2051 > local10) {
				this.anInt2057 = -1;
				if (this.anInt2062 == 0 || this.anInt2062 > this.anInt2051 - local10) {
					this.anInt2062 = this.anInt2051 - local10;
				}
			} else {
				this.anInt2057 = 0;
			}
			if (this.anInt2056 < local8) {
				this.anInt2060 = 1;
				if (this.anInt2062 == 0 || this.anInt2062 > local8 - this.anInt2056) {
					this.anInt2062 = local8 - this.anInt2056;
				}
			} else if (this.anInt2056 > local8) {
				this.anInt2060 = -1;
				if (this.anInt2062 == 0 || this.anInt2062 > this.anInt2056 - local8) {
					this.anInt2062 = this.anInt2056 - local8;
				}
			} else {
				this.anInt2060 = 0;
			}
			return false;
		} else if (this.anInt2049 == Integer.MIN_VALUE) {
			this.anInt2049 = 0;
			this.anInt2052 = this.anInt2051 = this.anInt2056 = 0;
			this.method3207();
			return true;
		} else {
			this.method1616();
			return false;
		}
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "()I")
	public synchronized int method1582() {
		return this.anInt2049 == Integer.MIN_VALUE ? 0 : this.anInt2049;
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "()I")
	public synchronized int method1583() {
		return this.anInt2059 < 0 ? -1 : this.anInt2059;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public synchronized void method1585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1617(arg0, arg1, this.method1583());
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public synchronized void method1589(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1614();
			this.method3207();
		} else if (this.anInt2051 == 0 && this.anInt2056 == 0) {
			this.anInt2062 = 0;
			this.anInt2049 = 0;
			this.anInt2052 = 0;
			this.method3207();
		} else {
			@Pc(31) int local31 = -this.anInt2052;
			if (this.anInt2052 > local31) {
				local31 = this.anInt2052;
			}
			if (-this.anInt2051 > local31) {
				local31 = -this.anInt2051;
			}
			if (this.anInt2051 > local31) {
				local31 = this.anInt2051;
			}
			if (-this.anInt2056 > local31) {
				local31 = -this.anInt2056;
			}
			if (this.anInt2056 > local31) {
				local31 = this.anInt2056;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2062 = arg0;
			this.anInt2049 = Integer.MIN_VALUE;
			this.anInt2055 = -this.anInt2052 / arg0;
			this.anInt2057 = -this.anInt2051 / arg0;
			this.anInt2060 = -this.anInt2056 / arg0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([IIIII)I")
	private int method1590(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2062 <= 0) {
				if (this.anInt2050 == 256 && (this.anInt2053 & 0xFF) == 0) {
					if (Static30.aBoolean37) {
						return Static222.method1615(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2051, this.anInt2056, arg3, arg2, this);
					}
					return Static222.method1579(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2052, arg3, arg2, this);
				}
				if (Static30.aBoolean37) {
					return Static222.method1595(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2051, this.anInt2056, arg3, arg2, this, this.anInt2050, arg4);
				}
				return Static222.method1600(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2052, arg3, arg2, this, this.anInt2050, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2062;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2062 += arg1;
			if (this.anInt2050 == 256 && (this.anInt2053 & 0xFF) == 0) {
				if (Static30.aBoolean37) {
					arg1 = Static222.method1603(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2051, this.anInt2056, this.anInt2057, this.anInt2060, local5, arg2, this);
				} else {
					arg1 = Static222.method1610(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2052, this.anInt2055, local5, arg2, this);
				}
			} else if (Static30.aBoolean37) {
				arg1 = Static222.method1587(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2051, this.anInt2056, this.anInt2057, this.anInt2060, local5, arg2, this, this.anInt2050, arg4);
			} else {
				arg1 = Static222.method1586(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2052, this.anInt2055, local5, arg2, this, this.anInt2050, arg4);
			}
			this.anInt2062 -= arg1;
			if (this.anInt2062 != 0) {
				return arg1;
			}
		} while (!this.method1581());
		return arg3;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "([IIIII)I")
	private int method1591(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2062 <= 0) {
				if (this.anInt2050 == -256 && (this.anInt2053 & 0xFF) == 0) {
					if (Static30.aBoolean37) {
						return Static222.method1592(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2051, this.anInt2056, arg3, arg2, this);
					}
					return Static222.method1584(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2052, arg3, arg2, this);
				}
				if (Static30.aBoolean37) {
					return Static222.method1612(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2051, this.anInt2056, arg3, arg2, this, this.anInt2050, arg4);
				}
				return Static222.method1611(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2052, arg3, arg2, this, this.anInt2050, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2062;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2062 += arg1;
			if (this.anInt2050 == -256 && (this.anInt2053 & 0xFF) == 0) {
				if (Static30.aBoolean37) {
					arg1 = Static222.method1609(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2051, this.anInt2056, this.anInt2057, this.anInt2060, local5, arg2, this);
				} else {
					arg1 = Static222.method1588(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2052, this.anInt2055, local5, arg2, this);
				}
			} else if (Static30.aBoolean37) {
				arg1 = Static222.method1605(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2051, this.anInt2056, this.anInt2057, this.anInt2060, local5, arg2, this, this.anInt2050, arg4);
			} else {
				arg1 = Static222.method1607(((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42, arg0, this.anInt2053, arg1, this.anInt2052, this.anInt2055, local5, arg2, this, this.anInt2050, arg4);
			}
			this.anInt2062 -= arg1;
			if (this.anInt2062 != 0) {
				return arg1;
			}
		} while (!this.method1581());
		return arg3;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public synchronized void method1593() {
		this.anInt2050 = (this.anInt2050 ^ this.anInt2050 >> 31) + (this.anInt2050 >>> 31);
		this.anInt2050 = -this.anInt2050;
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
	public synchronized void method1594(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2053 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "()Z")
	public boolean method1596() {
		return this.anInt2062 != 0;
	}

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "()Z")
	public boolean method1597() {
		return this.anInt2053 < 0 || this.anInt2053 >= ((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42.length << 8;
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
	public synchronized void method1598(@OriginalArg(0) int arg0) {
		if (this.anInt2050 < 0) {
			this.anInt2050 = -arg0;
		} else {
			this.anInt2050 = arg0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
	@Override
	public int method2864() {
		return this.anInt2049 == 0 && this.anInt2062 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "()V")
	private void method1602() {
		if (this.anInt2062 == 0) {
			return;
		}
		if (this.anInt2049 == Integer.MIN_VALUE) {
			this.anInt2049 = 0;
		}
		this.anInt2062 = 0;
		this.method1616();
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
	public synchronized void method1606(@OriginalArg(0) int arg0) {
		this.anInt2061 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)V")
	private synchronized void method1608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2049 = arg0;
		this.anInt2059 = arg1;
		this.anInt2062 = 0;
		this.method1616();
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
	public synchronized void method1613(@OriginalArg(0) int arg0) {
		this.method1608(arg0 << 6, this.method1583());
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()Lclient!f;")
	@Override
	public Class5_Sub11 method2865() {
		return null;
	}

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)V")
	private synchronized void method1614() {
		this.method1608(0, this.method1583());
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()I")
	@Override
	public int method2868() {
		@Pc(6) int local6 = this.anInt2052 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2061 == 0) {
			local6 -= local6 * this.anInt2053 / (((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42.length << 8);
		} else if (this.anInt2061 >= 0) {
			local6 -= local6 * this.anInt2054 / ((Class5_Sub7_Sub1) super.aClass5_Sub7_5).aByteArray42.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "()V")
	private void method1616() {
		this.anInt2052 = this.anInt2049;
		this.anInt2051 = Static222.method1604(this.anInt2049, this.anInt2059);
		this.anInt2056 = Static222.method1601(this.anInt2049, this.anInt2059);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	public synchronized void method1617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1608(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static222.method1604(arg1, arg2);
		@Pc(14) int local14 = Static222.method1601(arg1, arg2);
		if (this.anInt2051 == local10 && this.anInt2056 == local14) {
			this.anInt2062 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2052;
		if (this.anInt2052 - arg1 > local31) {
			local31 = this.anInt2052 - arg1;
		}
		if (local10 - this.anInt2051 > local31) {
			local31 = local10 - this.anInt2051;
		}
		if (this.anInt2051 - local10 > local31) {
			local31 = this.anInt2051 - local10;
		}
		if (local14 - this.anInt2056 > local31) {
			local31 = local14 - this.anInt2056;
		}
		if (this.anInt2056 - local14 > local31) {
			local31 = this.anInt2056 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2062 = arg0;
		this.anInt2049 = arg1;
		this.anInt2059 = arg2;
		this.anInt2055 = (arg1 - this.anInt2052) / arg0;
		this.anInt2057 = (local10 - this.anInt2051) / arg0;
		this.anInt2060 = (local14 - this.anInt2056) / arg0;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()Lclient!f;")
	@Override
	public Class5_Sub11 method2866() {
		return null;
	}
}
