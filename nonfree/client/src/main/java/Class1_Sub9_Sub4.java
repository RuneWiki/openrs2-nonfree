import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class1_Sub9_Sub4 extends Class1_Sub9 {

	@OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
	public int anInt2262;

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
	public int anInt2263;

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
	private int anInt2264;

	@OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
	public int anInt2265;

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
	public int anInt2269;

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
	private int anInt2271;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
	public int anInt2272;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
	private final int anInt2260;

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
	private final int anInt2261;

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "Z")
	private final boolean aBoolean95;

	@OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
	private int anInt2267;

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
	private int anInt2268;

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
	private int anInt2259;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
	public int anInt2270;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!u;II)V")
	public Class1_Sub9_Sub4(@OriginalArg(0) Class1_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub14_5 = arg0;
		this.anInt2260 = arg0.anInt2721;
		this.anInt2261 = arg0.anInt2722;
		this.aBoolean95 = arg0.aBoolean115;
		this.anInt2267 = arg1;
		this.anInt2268 = arg2;
		this.anInt2259 = 8192;
		this.anInt2270 = 0;
		this.method1570();
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!u;III)V")
	public Class1_Sub9_Sub4(@OriginalArg(0) Class1_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub14_5 = arg0;
		this.anInt2260 = arg0.anInt2721;
		this.anInt2261 = arg0.anInt2722;
		this.aBoolean95 = arg0.aBoolean115;
		this.anInt2267 = arg1;
		this.anInt2268 = arg2;
		this.anInt2259 = arg3;
		this.anInt2270 = 0;
		this.method1570();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	public synchronized void method1555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1576(arg0, arg1, this.method1561());
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([IIIII)I")
	private int method1556(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2264 <= 0) {
				if (this.anInt2267 == 256 && (this.anInt2270 & 0xFF) == 0) {
					if (Static59.aBoolean73) {
						return Static140.method1560(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2265, this.anInt2272, arg3, arg2, this);
					}
					return Static140.method1578(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2266, arg3, arg2, this);
				}
				if (Static59.aBoolean73) {
					return Static140.method1586(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2265, this.anInt2272, arg3, arg2, this, this.anInt2267, arg4);
				}
				return Static140.method1581(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2266, arg3, arg2, this, this.anInt2267, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2264;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2264 += arg1;
			if (this.anInt2267 == 256 && (this.anInt2270 & 0xFF) == 0) {
				if (Static59.aBoolean73) {
					arg1 = Static140.method1580(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2265, this.anInt2272, this.anInt2263, this.anInt2262, local5, arg2, this);
				} else {
					arg1 = Static140.method1582(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2266, this.anInt2269, local5, arg2, this);
				}
			} else if (Static59.aBoolean73) {
				arg1 = Static140.method1559(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2265, this.anInt2272, this.anInt2263, this.anInt2262, local5, arg2, this, this.anInt2267, arg4);
			} else {
				arg1 = Static140.method1565(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2266, this.anInt2269, local5, arg2, this, this.anInt2267, arg4);
			}
			this.anInt2264 -= arg1;
			if (this.anInt2264 != 0) {
				return arg1;
			}
		} while (!this.method1592());
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public synchronized void method1558(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1563();
			this.method2050();
		} else if (this.anInt2265 == 0 && this.anInt2272 == 0) {
			this.anInt2264 = 0;
			this.anInt2268 = 0;
			this.anInt2266 = 0;
			this.method2050();
		} else {
			@Pc(31) int local31 = -this.anInt2266;
			if (this.anInt2266 > local31) {
				local31 = this.anInt2266;
			}
			if (-this.anInt2265 > local31) {
				local31 = -this.anInt2265;
			}
			if (this.anInt2265 > local31) {
				local31 = this.anInt2265;
			}
			if (-this.anInt2272 > local31) {
				local31 = -this.anInt2272;
			}
			if (this.anInt2272 > local31) {
				local31 = this.anInt2272;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2264 = arg0;
			this.anInt2268 = Integer.MIN_VALUE;
			this.anInt2269 = -this.anInt2266 / arg0;
			this.anInt2263 = -this.anInt2265 / arg0;
			this.anInt2262 = -this.anInt2272 / arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "()I")
	public synchronized int method1561() {
		return this.anInt2259 < 0 ? -1 : this.anInt2259;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1553(@OriginalArg(0) int arg0) {
		if (this.anInt2264 > 0) {
			if (arg0 >= this.anInt2264) {
				if (this.anInt2268 == Integer.MIN_VALUE) {
					this.anInt2268 = 0;
					this.anInt2266 = this.anInt2265 = this.anInt2272 = 0;
					this.method2050();
					arg0 = this.anInt2264;
				}
				this.anInt2264 = 0;
				this.method1570();
			} else {
				this.anInt2266 += this.anInt2269 * arg0;
				this.anInt2265 += this.anInt2263 * arg0;
				this.anInt2272 += this.anInt2262 * arg0;
				this.anInt2264 -= arg0;
			}
		}
		@Pc(71) Class1_Sub14_Sub1 local71 = (Class1_Sub14_Sub1) super.aClass1_Sub14_5;
		@Pc(76) int local76 = this.anInt2260 << 8;
		@Pc(81) int local81 = this.anInt2261 << 8;
		@Pc(87) int local87 = local71.aByteArray36.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2271 = 0;
		}
		if (this.anInt2270 < 0) {
			if (this.anInt2267 <= 0) {
				this.method1587();
				this.method2050();
				return;
			}
			this.anInt2270 = 0;
		}
		if (this.anInt2270 >= local87) {
			if (this.anInt2267 >= 0) {
				this.method1587();
				this.method2050();
				return;
			}
			this.anInt2270 = local87 - 1;
		}
		this.anInt2270 += this.anInt2267 * arg0;
		if (this.anInt2271 >= 0) {
			if (this.anInt2271 > 0) {
				if (this.aBoolean95) {
					label125: {
						if (this.anInt2267 < 0) {
							if (this.anInt2270 >= local76) {
								return;
							}
							this.anInt2270 = local76 + local76 - this.anInt2270 - 1;
							this.anInt2267 = -this.anInt2267;
							if (--this.anInt2271 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2270 < local81) {
								return;
							}
							this.anInt2270 = local81 + local81 - this.anInt2270 - 1;
							this.anInt2267 = -this.anInt2267;
							if (--this.anInt2271 == 0) {
								break;
							}
							if (this.anInt2270 >= local76) {
								return;
							}
							this.anInt2270 = local76 + local76 - this.anInt2270 - 1;
							this.anInt2267 = -this.anInt2267;
						} while (--this.anInt2271 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2267 < 0) {
						if (this.anInt2270 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2270 - 1) / local91;
						if (local361 < this.anInt2271) {
							this.anInt2270 += local91 * local361;
							this.anInt2271 -= local361;
							return;
						}
						this.anInt2270 += local91 * this.anInt2271;
						this.anInt2271 = 0;
					} else if (this.anInt2270 >= local81) {
						local361 = (this.anInt2270 - local76) / local91;
						if (local361 < this.anInt2271) {
							this.anInt2270 -= local91 * local361;
							this.anInt2271 -= local361;
							return;
						}
						this.anInt2270 -= local91 * this.anInt2271;
						this.anInt2271 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2267 < 0) {
				if (this.anInt2270 < 0) {
					this.anInt2270 = -1;
					this.method1587();
					this.method2050();
					return;
				}
			} else if (this.anInt2270 >= local87) {
				this.anInt2270 = local87;
				this.method1587();
				this.method2050();
			}
		} else if (this.aBoolean95) {
			if (this.anInt2267 < 0) {
				if (this.anInt2270 >= local76) {
					return;
				}
				this.anInt2270 = local76 + local76 - this.anInt2270 - 1;
				this.anInt2267 = -this.anInt2267;
			}
			while (this.anInt2270 >= local81) {
				this.anInt2270 = local81 + local81 - this.anInt2270 - 1;
				this.anInt2267 = -this.anInt2267;
				if (this.anInt2270 >= local76) {
					return;
				}
				this.anInt2270 = local76 + local76 - this.anInt2270 - 1;
				this.anInt2267 = -this.anInt2267;
			}
		} else if (this.anInt2267 < 0) {
			if (this.anInt2270 < local76) {
				this.anInt2270 = local81 - (local81 - 1 - this.anInt2270) % local91 - 1;
			}
		} else if (this.anInt2270 >= local81) {
			this.anInt2270 = local76 + (this.anInt2270 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	public synchronized void method1562(@OriginalArg(0) int arg0) {
		this.method1574(arg0 << 6, this.method1561());
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	private synchronized void method1563() {
		this.method1574(0, this.method1561());
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "()I")
	@Override
	public int method1550() {
		@Pc(6) int local6 = this.anInt2266 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2271 == 0) {
			local6 -= local6 * this.anInt2270 / (((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36.length << 8);
		} else if (this.anInt2271 >= 0) {
			local6 -= local6 * this.anInt2260 / ((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "()I")
	public synchronized int method1564() {
		return this.anInt2267 < 0 ? -this.anInt2267 : this.anInt2267;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	public synchronized void method1566(@OriginalArg(0) int arg0) {
		if (this.anInt2267 < 0) {
			this.anInt2267 = -arg0;
		} else {
			this.anInt2267 = arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	public synchronized void method1567(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2270 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "()V")
	private void method1570() {
		this.anInt2266 = this.anInt2268;
		this.anInt2265 = Static140.method1569(this.anInt2268, this.anInt2259);
		this.anInt2272 = Static140.method1589(this.anInt2268, this.anInt2259);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()I")
	@Override
	public int method1551() {
		return this.anInt2268 == 0 && this.anInt2264 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
	private synchronized void method1574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2268 = arg0;
		this.anInt2259 = arg1;
		this.anInt2264 = 0;
		this.method1570();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class1_Sub9 method1549() {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
	public synchronized void method1575(@OriginalArg(0) int arg0) {
		this.anInt2271 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public synchronized void method1576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1574(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static140.method1569(arg1, arg2);
		@Pc(14) int local14 = Static140.method1589(arg1, arg2);
		if (this.anInt2265 == local10 && this.anInt2272 == local14) {
			this.anInt2264 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2266;
		if (this.anInt2266 - arg1 > local31) {
			local31 = this.anInt2266 - arg1;
		}
		if (local10 - this.anInt2265 > local31) {
			local31 = local10 - this.anInt2265;
		}
		if (this.anInt2265 - local10 > local31) {
			local31 = this.anInt2265 - local10;
		}
		if (local14 - this.anInt2272 > local31) {
			local31 = local14 - this.anInt2272;
		}
		if (this.anInt2272 - local14 > local31) {
			local31 = this.anInt2272 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2264 = arg0;
		this.anInt2268 = arg1;
		this.anInt2259 = arg2;
		this.anInt2269 = (arg1 - this.anInt2266) / arg0;
		this.anInt2263 = (local10 - this.anInt2265) / arg0;
		this.anInt2262 = (local14 - this.anInt2272) / arg0;
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "()Z")
	public boolean method1579() {
		return this.anInt2264 != 0;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "()Lclient!m;")
	@Override
	public Class1_Sub9 method1552() {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	public synchronized void method1583() {
		this.anInt2267 = (this.anInt2267 ^ this.anInt2267 >> 31) + (this.anInt2267 >>> 31);
		this.anInt2267 = -this.anInt2267;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([IIIII)I")
	private int method1584(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2264 <= 0) {
				if (this.anInt2267 == -256 && (this.anInt2270 & 0xFF) == 0) {
					if (Static59.aBoolean73) {
						return Static140.method1571(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2265, this.anInt2272, arg3, arg2, this);
					}
					return Static140.method1572(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2266, arg3, arg2, this);
				}
				if (Static59.aBoolean73) {
					return Static140.method1557(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2265, this.anInt2272, arg3, arg2, this, this.anInt2267, arg4);
				}
				return Static140.method1590(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2266, arg3, arg2, this, this.anInt2267, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2264;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2264 += arg1;
			if (this.anInt2267 == -256 && (this.anInt2270 & 0xFF) == 0) {
				if (Static59.aBoolean73) {
					arg1 = Static140.method1585(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2265, this.anInt2272, this.anInt2263, this.anInt2262, local5, arg2, this);
				} else {
					arg1 = Static140.method1588(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2266, this.anInt2269, local5, arg2, this);
				}
			} else if (Static59.aBoolean73) {
				arg1 = Static140.method1573(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2265, this.anInt2272, this.anInt2263, this.anInt2262, local5, arg2, this, this.anInt2267, arg4);
			} else {
				arg1 = Static140.method1591(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36, arg0, this.anInt2270, arg1, this.anInt2266, this.anInt2269, local5, arg2, this, this.anInt2267, arg4);
			}
			this.anInt2264 -= arg1;
			if (this.anInt2264 != 0) {
				return arg1;
			}
		} while (!this.method1592());
		return arg3;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1554(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2268 == 0 && this.anInt2264 == 0) {
			this.method1553(arg2);
			return;
		}
		@Pc(13) Class1_Sub14_Sub1 local13 = (Class1_Sub14_Sub1) super.aClass1_Sub14_5;
		@Pc(18) int local18 = this.anInt2260 << 8;
		@Pc(23) int local23 = this.anInt2261 << 8;
		@Pc(29) int local29 = local13.aByteArray36.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2271 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2270 < 0) {
			if (this.anInt2267 <= 0) {
				this.method1587();
				this.method2050();
				return;
			}
			this.anInt2270 = 0;
		}
		if (this.anInt2270 >= local29) {
			if (this.anInt2267 >= 0) {
				this.method1587();
				this.method2050();
				return;
			}
			this.anInt2270 = local29 - 1;
		}
		if (this.anInt2271 >= 0) {
			if (this.anInt2271 > 0) {
				if (this.aBoolean95) {
					label130: {
						if (this.anInt2267 < 0) {
							local40 = this.method1584(arg0, arg1, local18, local44, local13.aByteArray36[this.anInt2260]);
							if (this.anInt2270 >= local18) {
								return;
							}
							this.anInt2270 = local18 + local18 - this.anInt2270 - 1;
							this.anInt2267 = -this.anInt2267;
							if (--this.anInt2271 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1556(arg0, local40, local23, local44, local13.aByteArray36[this.anInt2261 - 1]);
							if (this.anInt2270 < local23) {
								return;
							}
							this.anInt2270 = local23 + local23 - this.anInt2270 - 1;
							this.anInt2267 = -this.anInt2267;
							if (--this.anInt2271 == 0) {
								break;
							}
							local40 = this.method1584(arg0, local40, local18, local44, local13.aByteArray36[this.anInt2260]);
							if (this.anInt2270 >= local18) {
								return;
							}
							this.anInt2270 = local18 + local18 - this.anInt2270 - 1;
							this.anInt2267 = -this.anInt2267;
						} while (--this.anInt2271 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2267 < 0) {
						while (true) {
							local40 = this.method1584(arg0, local40, local18, local44, local13.aByteArray36[this.anInt2261 - 1]);
							if (this.anInt2270 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2270 - 1) / local33;
							if (local416 >= this.anInt2271) {
								this.anInt2270 += local33 * this.anInt2271;
								this.anInt2271 = 0;
								break;
							}
							this.anInt2270 += local33 * local416;
							this.anInt2271 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1556(arg0, local40, local23, local44, local13.aByteArray36[this.anInt2260]);
							if (this.anInt2270 < local23) {
								return;
							}
							local416 = (this.anInt2270 - local18) / local33;
							if (local416 >= this.anInt2271) {
								this.anInt2270 -= local33 * this.anInt2271;
								this.anInt2271 = 0;
								break;
							}
							this.anInt2270 -= local33 * local416;
							this.anInt2271 -= local416;
						}
					}
				}
			}
			if (this.anInt2267 < 0) {
				this.method1584(arg0, local40, 0, local44, 0);
				if (this.anInt2270 < 0) {
					this.anInt2270 = -1;
					this.method1587();
					this.method2050();
					return;
				}
			} else {
				this.method1556(arg0, local40, local29, local44, 0);
				if (this.anInt2270 >= local29) {
					this.anInt2270 = local29;
					this.method1587();
					this.method2050();
				}
			}
		} else if (this.aBoolean95) {
			if (this.anInt2267 < 0) {
				local40 = this.method1584(arg0, arg1, local18, local44, local13.aByteArray36[this.anInt2260]);
				if (this.anInt2270 >= local18) {
					return;
				}
				this.anInt2270 = local18 + local18 - this.anInt2270 - 1;
				this.anInt2267 = -this.anInt2267;
			}
			while (true) {
				local40 = this.method1556(arg0, local40, local23, local44, local13.aByteArray36[this.anInt2261 - 1]);
				if (this.anInt2270 < local23) {
					return;
				}
				this.anInt2270 = local23 + local23 - this.anInt2270 - 1;
				this.anInt2267 = -this.anInt2267;
				local40 = this.method1584(arg0, local40, local18, local44, local13.aByteArray36[this.anInt2260]);
				if (this.anInt2270 >= local18) {
					return;
				}
				this.anInt2270 = local18 + local18 - this.anInt2270 - 1;
				this.anInt2267 = -this.anInt2267;
			}
		} else if (this.anInt2267 < 0) {
			while (true) {
				local40 = this.method1584(arg0, local40, local18, local44, local13.aByteArray36[this.anInt2261 - 1]);
				if (this.anInt2270 >= local18) {
					return;
				}
				this.anInt2270 = local23 - (local23 - 1 - this.anInt2270) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1556(arg0, local40, local23, local44, local13.aByteArray36[this.anInt2260]);
				if (this.anInt2270 < local23) {
					return;
				}
				this.anInt2270 = local18 + (this.anInt2270 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "()V")
	private void method1587() {
		if (this.anInt2264 == 0) {
			return;
		}
		if (this.anInt2268 == Integer.MIN_VALUE) {
			this.anInt2268 = 0;
		}
		this.anInt2264 = 0;
		this.method1570();
	}

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "()Z")
	private boolean method1592() {
		@Pc(2) int local2 = this.anInt2268;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static140.method1569(local2, this.anInt2259);
			local8 = Static140.method1589(local2, this.anInt2259);
		}
		if (this.anInt2266 != local2 || this.anInt2265 != local10 || this.anInt2272 != local8) {
			if (this.anInt2266 < local2) {
				this.anInt2269 = 1;
				this.anInt2264 = local2 - this.anInt2266;
			} else if (this.anInt2266 > local2) {
				this.anInt2269 = -1;
				this.anInt2264 = this.anInt2266 - local2;
			} else {
				this.anInt2269 = 0;
			}
			if (this.anInt2265 < local10) {
				this.anInt2263 = 1;
				if (this.anInt2264 == 0 || this.anInt2264 > local10 - this.anInt2265) {
					this.anInt2264 = local10 - this.anInt2265;
				}
			} else if (this.anInt2265 > local10) {
				this.anInt2263 = -1;
				if (this.anInt2264 == 0 || this.anInt2264 > this.anInt2265 - local10) {
					this.anInt2264 = this.anInt2265 - local10;
				}
			} else {
				this.anInt2263 = 0;
			}
			if (this.anInt2272 < local8) {
				this.anInt2262 = 1;
				if (this.anInt2264 == 0 || this.anInt2264 > local8 - this.anInt2272) {
					this.anInt2264 = local8 - this.anInt2272;
				}
			} else if (this.anInt2272 > local8) {
				this.anInt2262 = -1;
				if (this.anInt2264 == 0 || this.anInt2264 > this.anInt2272 - local8) {
					this.anInt2264 = this.anInt2272 - local8;
				}
			} else {
				this.anInt2262 = 0;
			}
			return false;
		} else if (this.anInt2268 == Integer.MIN_VALUE) {
			this.anInt2268 = 0;
			this.anInt2266 = this.anInt2265 = this.anInt2272 = 0;
			this.method2050();
			return true;
		} else {
			this.method1570();
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "()I")
	public synchronized int method1593() {
		return this.anInt2268 == Integer.MIN_VALUE ? 0 : this.anInt2268;
	}

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "()Z")
	public boolean method1594() {
		return this.anInt2270 < 0 || this.anInt2270 >= ((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray36.length << 8;
	}
}
