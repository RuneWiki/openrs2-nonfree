import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	public int anInt2097;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	public int anInt2098;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt2099;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	public int anInt2102;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt2103;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt2104;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt2105;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	private final int anInt2107;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	private final int anInt2095;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "Z")
	private final boolean aBoolean101;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	private int anInt2106;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
	private int anInt2094;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt2100;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	public int anInt2101;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!ti;II)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) Class1_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub9_5 = arg0;
		this.anInt2107 = arg0.anInt4140;
		this.anInt2095 = arg0.anInt4139;
		this.aBoolean101 = arg0.aBoolean196;
		this.anInt2106 = arg1;
		this.anInt2094 = arg2;
		this.anInt2100 = 8192;
		this.anInt2101 = 0;
		this.method1648();
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!ti;III)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) Class1_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub9_5 = arg0;
		this.anInt2107 = arg0.anInt4140;
		this.anInt2095 = arg0.anInt4139;
		this.aBoolean101 = arg0.aBoolean196;
		this.anInt2106 = arg1;
		this.anInt2094 = arg2;
		this.anInt2100 = arg3;
		this.anInt2101 = 0;
		this.method1648();
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
	public synchronized void method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1640(arg0, arg1, this.method1638());
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2855(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2094 == 0 && this.anInt2099 == 0) {
			this.method2858(arg2);
			return;
		}
		@Pc(13) Class1_Sub9_Sub1 local13 = (Class1_Sub9_Sub1) super.aClass1_Sub9_5;
		@Pc(18) int local18 = this.anInt2107 << 8;
		@Pc(23) int local23 = this.anInt2095 << 8;
		@Pc(29) int local29 = local13.aByteArray53.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2096 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2101 < 0) {
			if (this.anInt2106 <= 0) {
				this.method1633();
				this.method3563();
				return;
			}
			this.anInt2101 = 0;
		}
		if (this.anInt2101 >= local29) {
			if (this.anInt2106 >= 0) {
				this.method1633();
				this.method3563();
				return;
			}
			this.anInt2101 = local29 - 1;
		}
		if (this.anInt2096 >= 0) {
			if (this.anInt2096 > 0) {
				if (this.aBoolean101) {
					label130: {
						if (this.anInt2106 < 0) {
							local40 = this.method1635(arg0, arg1, local18, local44, local13.aByteArray53[this.anInt2107]);
							if (this.anInt2101 >= local18) {
								return;
							}
							this.anInt2101 = local18 + local18 - this.anInt2101 - 1;
							this.anInt2106 = -this.anInt2106;
							if (--this.anInt2096 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1615(arg0, local40, local23, local44, local13.aByteArray53[this.anInt2095 - 1]);
							if (this.anInt2101 < local23) {
								return;
							}
							this.anInt2101 = local23 + local23 - this.anInt2101 - 1;
							this.anInt2106 = -this.anInt2106;
							if (--this.anInt2096 == 0) {
								break;
							}
							local40 = this.method1635(arg0, local40, local18, local44, local13.aByteArray53[this.anInt2107]);
							if (this.anInt2101 >= local18) {
								return;
							}
							this.anInt2101 = local18 + local18 - this.anInt2101 - 1;
							this.anInt2106 = -this.anInt2106;
						} while (--this.anInt2096 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2106 < 0) {
						while (true) {
							local40 = this.method1635(arg0, local40, local18, local44, local13.aByteArray53[this.anInt2095 - 1]);
							if (this.anInt2101 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2101 - 1) / local33;
							if (local416 >= this.anInt2096) {
								this.anInt2101 += local33 * this.anInt2096;
								this.anInt2096 = 0;
								break;
							}
							this.anInt2101 += local33 * local416;
							this.anInt2096 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1615(arg0, local40, local23, local44, local13.aByteArray53[this.anInt2107]);
							if (this.anInt2101 < local23) {
								return;
							}
							local416 = (this.anInt2101 - local18) / local33;
							if (local416 >= this.anInt2096) {
								this.anInt2101 -= local33 * this.anInt2096;
								this.anInt2096 = 0;
								break;
							}
							this.anInt2101 -= local33 * local416;
							this.anInt2096 -= local416;
						}
					}
				}
			}
			if (this.anInt2106 < 0) {
				this.method1635(arg0, local40, 0, local44, 0);
				if (this.anInt2101 < 0) {
					this.anInt2101 = -1;
					this.method1633();
					this.method3563();
					return;
				}
			} else {
				this.method1615(arg0, local40, local29, local44, 0);
				if (this.anInt2101 >= local29) {
					this.anInt2101 = local29;
					this.method1633();
					this.method3563();
				}
			}
		} else if (this.aBoolean101) {
			if (this.anInt2106 < 0) {
				local40 = this.method1635(arg0, arg1, local18, local44, local13.aByteArray53[this.anInt2107]);
				if (this.anInt2101 >= local18) {
					return;
				}
				this.anInt2101 = local18 + local18 - this.anInt2101 - 1;
				this.anInt2106 = -this.anInt2106;
			}
			while (true) {
				local40 = this.method1615(arg0, local40, local23, local44, local13.aByteArray53[this.anInt2095 - 1]);
				if (this.anInt2101 < local23) {
					return;
				}
				this.anInt2101 = local23 + local23 - this.anInt2101 - 1;
				this.anInt2106 = -this.anInt2106;
				local40 = this.method1635(arg0, local40, local18, local44, local13.aByteArray53[this.anInt2107]);
				if (this.anInt2101 >= local18) {
					return;
				}
				this.anInt2101 = local18 + local18 - this.anInt2101 - 1;
				this.anInt2106 = -this.anInt2106;
			}
		} else if (this.anInt2106 < 0) {
			while (true) {
				local40 = this.method1635(arg0, local40, local18, local44, local13.aByteArray53[this.anInt2095 - 1]);
				if (this.anInt2101 >= local18) {
					return;
				}
				this.anInt2101 = local23 - (local23 - 1 - this.anInt2101) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1615(arg0, local40, local23, local44, local13.aByteArray53[this.anInt2107]);
				if (this.anInt2101 < local23) {
					return;
				}
				this.anInt2101 = local18 + (this.anInt2101 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)V")
	private synchronized void method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2094 = arg0;
		this.anInt2100 = arg1;
		this.anInt2099 = 0;
		this.method1648();
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "()I")
	public synchronized int method1614() {
		return this.anInt2094 == Integer.MIN_VALUE ? 0 : this.anInt2094;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIIII)I")
	private int method1615(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2099 <= 0) {
				if (this.anInt2106 == 256 && (this.anInt2101 & 0xFF) == 0) {
					if (Static138.aBoolean145) {
						return Static215.method1644(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2097, this.anInt2102, arg3, arg2, this);
					}
					return Static215.method1631(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2098, arg3, arg2, this);
				}
				if (Static138.aBoolean145) {
					return Static215.method1625(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2097, this.anInt2102, arg3, arg2, this, this.anInt2106, arg4);
				}
				return Static215.method1611(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2098, arg3, arg2, this, this.anInt2106, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2099;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2099 += arg1;
			if (this.anInt2106 == 256 && (this.anInt2101 & 0xFF) == 0) {
				if (Static138.aBoolean145) {
					arg1 = Static215.method1641(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2097, this.anInt2102, this.anInt2105, this.anInt2103, local5, arg2, this);
				} else {
					arg1 = Static215.method1612(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2098, this.anInt2104, local5, arg2, this);
				}
			} else if (Static138.aBoolean145) {
				arg1 = Static215.method1629(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2097, this.anInt2102, this.anInt2105, this.anInt2103, local5, arg2, this, this.anInt2106, arg4);
			} else {
				arg1 = Static215.method1643(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2098, this.anInt2104, local5, arg2, this, this.anInt2106, arg4);
			}
			this.anInt2099 -= arg1;
			if (this.anInt2099 != 0) {
				return arg1;
			}
		} while (!this.method1626());
		return arg3;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()Lclient!rd;")
	@Override
	public Class1_Sub3 method2854() {
		return null;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public synchronized void method1618(@OriginalArg(0) int arg0) {
		this.anInt2096 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()I")
	@Override
	public int method2856() {
		return this.anInt2094 == 0 && this.anInt2099 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "()Z")
	public boolean method1620() {
		return this.anInt2099 != 0;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	private synchronized void method1621() {
		this.method1613(0, this.method1638());
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
	public synchronized void method1622(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1621();
			this.method3563();
		} else if (this.anInt2097 == 0 && this.anInt2102 == 0) {
			this.anInt2099 = 0;
			this.anInt2094 = 0;
			this.anInt2098 = 0;
			this.method3563();
		} else {
			@Pc(31) int local31 = -this.anInt2098;
			if (this.anInt2098 > local31) {
				local31 = this.anInt2098;
			}
			if (-this.anInt2097 > local31) {
				local31 = -this.anInt2097;
			}
			if (this.anInt2097 > local31) {
				local31 = this.anInt2097;
			}
			if (-this.anInt2102 > local31) {
				local31 = -this.anInt2102;
			}
			if (this.anInt2102 > local31) {
				local31 = this.anInt2102;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2099 = arg0;
			this.anInt2094 = Integer.MIN_VALUE;
			this.anInt2104 = -this.anInt2098 / arg0;
			this.anInt2105 = -this.anInt2097 / arg0;
			this.anInt2103 = -this.anInt2102 / arg0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public synchronized void method1624() {
		this.anInt2106 = (this.anInt2106 ^ this.anInt2106 >> 31) + (this.anInt2106 >>> 31);
		this.anInt2106 = -this.anInt2106;
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "()Z")
	private boolean method1626() {
		@Pc(2) int local2 = this.anInt2094;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static215.method1619(local2, this.anInt2100);
			local8 = Static215.method1616(local2, this.anInt2100);
		}
		if (this.anInt2098 != local2 || this.anInt2097 != local10 || this.anInt2102 != local8) {
			if (this.anInt2098 < local2) {
				this.anInt2104 = 1;
				this.anInt2099 = local2 - this.anInt2098;
			} else if (this.anInt2098 > local2) {
				this.anInt2104 = -1;
				this.anInt2099 = this.anInt2098 - local2;
			} else {
				this.anInt2104 = 0;
			}
			if (this.anInt2097 < local10) {
				this.anInt2105 = 1;
				if (this.anInt2099 == 0 || this.anInt2099 > local10 - this.anInt2097) {
					this.anInt2099 = local10 - this.anInt2097;
				}
			} else if (this.anInt2097 > local10) {
				this.anInt2105 = -1;
				if (this.anInt2099 == 0 || this.anInt2099 > this.anInt2097 - local10) {
					this.anInt2099 = this.anInt2097 - local10;
				}
			} else {
				this.anInt2105 = 0;
			}
			if (this.anInt2102 < local8) {
				this.anInt2103 = 1;
				if (this.anInt2099 == 0 || this.anInt2099 > local8 - this.anInt2102) {
					this.anInt2099 = local8 - this.anInt2102;
				}
			} else if (this.anInt2102 > local8) {
				this.anInt2103 = -1;
				if (this.anInt2099 == 0 || this.anInt2099 > this.anInt2102 - local8) {
					this.anInt2099 = this.anInt2102 - local8;
				}
			} else {
				this.anInt2103 = 0;
			}
			return false;
		} else if (this.anInt2094 == Integer.MIN_VALUE) {
			this.anInt2094 = 0;
			this.anInt2098 = this.anInt2097 = this.anInt2102 = 0;
			this.method3563();
			return true;
		} else {
			this.method1648();
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "()Z")
	public boolean method1627() {
		return this.anInt2101 < 0 || this.anInt2101 >= ((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53.length << 8;
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
	public synchronized void method1628(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2101 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V")
	public synchronized void method1630(@OriginalArg(0) int arg0) {
		if (this.anInt2106 < 0) {
			this.anInt2106 = -arg0;
		} else {
			this.anInt2106 = arg0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "()V")
	private void method1633() {
		if (this.anInt2099 == 0) {
			return;
		}
		if (this.anInt2094 == Integer.MIN_VALUE) {
			this.anInt2094 = 0;
		}
		this.anInt2099 = 0;
		this.method1648();
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2858(@OriginalArg(0) int arg0) {
		if (this.anInt2099 > 0) {
			if (arg0 >= this.anInt2099) {
				if (this.anInt2094 == Integer.MIN_VALUE) {
					this.anInt2094 = 0;
					this.anInt2098 = this.anInt2097 = this.anInt2102 = 0;
					this.method3563();
					arg0 = this.anInt2099;
				}
				this.anInt2099 = 0;
				this.method1648();
			} else {
				this.anInt2098 += this.anInt2104 * arg0;
				this.anInt2097 += this.anInt2105 * arg0;
				this.anInt2102 += this.anInt2103 * arg0;
				this.anInt2099 -= arg0;
			}
		}
		@Pc(71) Class1_Sub9_Sub1 local71 = (Class1_Sub9_Sub1) super.aClass1_Sub9_5;
		@Pc(76) int local76 = this.anInt2107 << 8;
		@Pc(81) int local81 = this.anInt2095 << 8;
		@Pc(87) int local87 = local71.aByteArray53.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2096 = 0;
		}
		if (this.anInt2101 < 0) {
			if (this.anInt2106 <= 0) {
				this.method1633();
				this.method3563();
				return;
			}
			this.anInt2101 = 0;
		}
		if (this.anInt2101 >= local87) {
			if (this.anInt2106 >= 0) {
				this.method1633();
				this.method3563();
				return;
			}
			this.anInt2101 = local87 - 1;
		}
		this.anInt2101 += this.anInt2106 * arg0;
		if (this.anInt2096 >= 0) {
			if (this.anInt2096 > 0) {
				if (this.aBoolean101) {
					label125: {
						if (this.anInt2106 < 0) {
							if (this.anInt2101 >= local76) {
								return;
							}
							this.anInt2101 = local76 + local76 - this.anInt2101 - 1;
							this.anInt2106 = -this.anInt2106;
							if (--this.anInt2096 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2101 < local81) {
								return;
							}
							this.anInt2101 = local81 + local81 - this.anInt2101 - 1;
							this.anInt2106 = -this.anInt2106;
							if (--this.anInt2096 == 0) {
								break;
							}
							if (this.anInt2101 >= local76) {
								return;
							}
							this.anInt2101 = local76 + local76 - this.anInt2101 - 1;
							this.anInt2106 = -this.anInt2106;
						} while (--this.anInt2096 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2106 < 0) {
						if (this.anInt2101 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2101 - 1) / local91;
						if (local361 < this.anInt2096) {
							this.anInt2101 += local91 * local361;
							this.anInt2096 -= local361;
							return;
						}
						this.anInt2101 += local91 * this.anInt2096;
						this.anInt2096 = 0;
					} else if (this.anInt2101 >= local81) {
						local361 = (this.anInt2101 - local76) / local91;
						if (local361 < this.anInt2096) {
							this.anInt2101 -= local91 * local361;
							this.anInt2096 -= local361;
							return;
						}
						this.anInt2101 -= local91 * this.anInt2096;
						this.anInt2096 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2106 < 0) {
				if (this.anInt2101 < 0) {
					this.anInt2101 = -1;
					this.method1633();
					this.method3563();
					return;
				}
			} else if (this.anInt2101 >= local87) {
				this.anInt2101 = local87;
				this.method1633();
				this.method3563();
			}
		} else if (this.aBoolean101) {
			if (this.anInt2106 < 0) {
				if (this.anInt2101 >= local76) {
					return;
				}
				this.anInt2101 = local76 + local76 - this.anInt2101 - 1;
				this.anInt2106 = -this.anInt2106;
			}
			while (this.anInt2101 >= local81) {
				this.anInt2101 = local81 + local81 - this.anInt2101 - 1;
				this.anInt2106 = -this.anInt2106;
				if (this.anInt2101 >= local76) {
					return;
				}
				this.anInt2101 = local76 + local76 - this.anInt2101 - 1;
				this.anInt2106 = -this.anInt2106;
			}
		} else if (this.anInt2106 < 0) {
			if (this.anInt2101 < local76) {
				this.anInt2101 = local81 - (local81 - 1 - this.anInt2101) % local91 - 1;
			}
		} else if (this.anInt2101 >= local81) {
			this.anInt2101 = local76 + (this.anInt2101 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "([IIIII)I")
	private int method1635(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2099 <= 0) {
				if (this.anInt2106 == -256 && (this.anInt2101 & 0xFF) == 0) {
					if (Static138.aBoolean145) {
						return Static215.method1642(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2097, this.anInt2102, arg3, arg2, this);
					}
					return Static215.method1632(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2098, arg3, arg2, this);
				}
				if (Static138.aBoolean145) {
					return Static215.method1649(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2097, this.anInt2102, arg3, arg2, this, this.anInt2106, arg4);
				}
				return Static215.method1639(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2098, arg3, arg2, this, this.anInt2106, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2099;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2099 += arg1;
			if (this.anInt2106 == -256 && (this.anInt2101 & 0xFF) == 0) {
				if (Static138.aBoolean145) {
					arg1 = Static215.method1617(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2097, this.anInt2102, this.anInt2105, this.anInt2103, local5, arg2, this);
				} else {
					arg1 = Static215.method1636(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2098, this.anInt2104, local5, arg2, this);
				}
			} else if (Static138.aBoolean145) {
				arg1 = Static215.method1634(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2097, this.anInt2102, this.anInt2105, this.anInt2103, local5, arg2, this, this.anInt2106, arg4);
			} else {
				arg1 = Static215.method1647(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53, arg0, this.anInt2101, arg1, this.anInt2098, this.anInt2104, local5, arg2, this, this.anInt2106, arg4);
			}
			this.anInt2099 -= arg1;
			if (this.anInt2099 != 0) {
				return arg1;
			}
		} while (!this.method1626());
		return arg3;
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V")
	public synchronized void method1637(@OriginalArg(0) int arg0) {
		this.method1613(arg0 << 6, this.method1638());
	}

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "()I")
	public synchronized int method1638() {
		return this.anInt2100 < 0 ? -1 : this.anInt2100;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public synchronized void method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1613(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static215.method1619(arg1, arg2);
		@Pc(14) int local14 = Static215.method1616(arg1, arg2);
		if (this.anInt2097 == local10 && this.anInt2102 == local14) {
			this.anInt2099 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2098;
		if (this.anInt2098 - arg1 > local31) {
			local31 = this.anInt2098 - arg1;
		}
		if (local10 - this.anInt2097 > local31) {
			local31 = local10 - this.anInt2097;
		}
		if (this.anInt2097 - local10 > local31) {
			local31 = this.anInt2097 - local10;
		}
		if (local14 - this.anInt2102 > local31) {
			local31 = local14 - this.anInt2102;
		}
		if (this.anInt2102 - local14 > local31) {
			local31 = this.anInt2102 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2099 = arg0;
		this.anInt2094 = arg1;
		this.anInt2100 = arg2;
		this.anInt2104 = (arg1 - this.anInt2098) / arg0;
		this.anInt2105 = (local10 - this.anInt2097) / arg0;
		this.anInt2103 = (local14 - this.anInt2102) / arg0;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()I")
	@Override
	public int method2859() {
		@Pc(6) int local6 = this.anInt2098 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2096 == 0) {
			local6 -= local6 * this.anInt2101 / (((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53.length << 8);
		} else if (this.anInt2096 >= 0) {
			local6 -= local6 * this.anInt2107 / ((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray53.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "()I")
	public synchronized int method1645() {
		return this.anInt2106 < 0 ? -this.anInt2106 : this.anInt2106;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "()Lclient!rd;")
	@Override
	public Class1_Sub3 method2860() {
		return null;
	}

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "()V")
	private void method1648() {
		this.anInt2098 = this.anInt2094;
		this.anInt2097 = Static215.method1619(this.anInt2094, this.anInt2100);
		this.anInt2102 = Static215.method1616(this.anInt2094, this.anInt2100);
	}
}
