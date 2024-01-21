import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
	public int anInt2141;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
	public int anInt2143;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
	public int anInt2145;

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
	private int anInt2146;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
	public int anInt2149;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	public int anInt2150;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
	public int anInt2151;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
	private int anInt2152;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
	private final int anInt2144;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
	private final int anInt2147;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "Z")
	private final boolean aBoolean108;

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
	private int anInt2139;

	@OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
	private int anInt2140;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
	private int anInt2148;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
	public int anInt2142;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!ke;II)V")
	public Class4_Sub1_Sub4(@OriginalArg(0) Class4_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub6_5 = arg0;
		this.anInt2144 = arg0.anInt1656;
		this.anInt2147 = arg0.anInt1655;
		this.aBoolean108 = arg0.aBoolean93;
		this.anInt2139 = arg1;
		this.anInt2140 = arg2;
		this.anInt2148 = 8192;
		this.anInt2142 = 0;
		this.method1562();
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!ke;III)V")
	public Class4_Sub1_Sub4(@OriginalArg(0) Class4_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub6_5 = arg0;
		this.anInt2144 = arg0.anInt1656;
		this.anInt2147 = arg0.anInt1655;
		this.aBoolean108 = arg0.aBoolean93;
		this.anInt2139 = arg1;
		this.anInt2140 = arg2;
		this.anInt2148 = arg3;
		this.anInt2142 = 0;
		this.method1562();
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
	public synchronized void method1539(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1550();
			this.method2189();
		} else if (this.anInt2143 == 0 && this.anInt2141 == 0) {
			this.anInt2146 = 0;
			this.anInt2140 = 0;
			this.anInt2150 = 0;
			this.method2189();
		} else {
			@Pc(31) int local31 = -this.anInt2150;
			if (this.anInt2150 > local31) {
				local31 = this.anInt2150;
			}
			if (-this.anInt2143 > local31) {
				local31 = -this.anInt2143;
			}
			if (this.anInt2143 > local31) {
				local31 = this.anInt2143;
			}
			if (-this.anInt2141 > local31) {
				local31 = -this.anInt2141;
			}
			if (this.anInt2141 > local31) {
				local31 = this.anInt2141;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2146 = arg0;
			this.anInt2140 = Integer.MIN_VALUE;
			this.anInt2151 = -this.anInt2150 / arg0;
			this.anInt2149 = -this.anInt2143 / arg0;
			this.anInt2145 = -this.anInt2141 / arg0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)V")
	private synchronized void method1542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2140 = arg0;
		this.anInt2148 = arg1;
		this.anInt2146 = 0;
		this.method1562();
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "()I")
	public synchronized int method1543() {
		return this.anInt2148 < 0 ? -1 : this.anInt2148;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()I")
	@Override
	public int method1535() {
		return this.anInt2140 == 0 && this.anInt2146 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)V")
	public synchronized void method1549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1563(arg0, arg1, this.method1543());
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
	private synchronized void method1550() {
		this.method1542(0, this.method1543());
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()Lclient!md;")
	@Override
	public Class4_Sub1 method1532() {
		return null;
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "()I")
	public synchronized int method1551() {
		return this.anInt2139 < 0 ? -this.anInt2139 : this.anInt2139;
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "()Z")
	public boolean method1553() {
		return this.anInt2142 < 0 || this.anInt2142 >= ((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13.length << 8;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public synchronized void method1554() {
		this.anInt2139 = (this.anInt2139 ^ this.anInt2139 >> 31) + (this.anInt2139 >>> 31);
		this.anInt2139 = -this.anInt2139;
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "()V")
	private void method1555() {
		if (this.anInt2146 == 0) {
			return;
		}
		if (this.anInt2140 == Integer.MIN_VALUE) {
			this.anInt2140 = 0;
		}
		this.anInt2146 = 0;
		this.method1562();
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
	public synchronized void method1558(@OriginalArg(0) int arg0) {
		this.anInt2152 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([IIIII)I")
	private int method1560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2146 <= 0) {
				if (this.anInt2139 == 256 && (this.anInt2142 & 0xFF) == 0) {
					if (Static7.aBoolean9) {
						return Static135.method1547(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2143, this.anInt2141, arg3, arg2, this);
					}
					return Static135.method1571(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2150, arg3, arg2, this);
				}
				if (Static7.aBoolean9) {
					return Static135.method1565(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2143, this.anInt2141, arg3, arg2, this, this.anInt2139, arg4);
				}
				return Static135.method1541(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2150, arg3, arg2, this, this.anInt2139, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2146;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2146 += arg1;
			if (this.anInt2139 == 256 && (this.anInt2142 & 0xFF) == 0) {
				if (Static7.aBoolean9) {
					arg1 = Static135.method1540(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2143, this.anInt2141, this.anInt2149, this.anInt2145, local5, arg2, this);
				} else {
					arg1 = Static135.method1544(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2150, this.anInt2151, local5, arg2, this);
				}
			} else if (Static7.aBoolean9) {
				arg1 = Static135.method1548(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2143, this.anInt2141, this.anInt2149, this.anInt2145, local5, arg2, this, this.anInt2139, arg4);
			} else {
				arg1 = Static135.method1552(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2150, this.anInt2151, local5, arg2, this, this.anInt2139, arg4);
			}
			this.anInt2146 -= arg1;
			if (this.anInt2146 != 0) {
				return arg1;
			}
		} while (!this.method1577());
		return arg3;
	}

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "()V")
	private void method1562() {
		this.anInt2150 = this.anInt2140;
		this.anInt2143 = Static135.method1573(this.anInt2140, this.anInt2148);
		this.anInt2141 = Static135.method1572(this.anInt2140, this.anInt2148);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	public synchronized void method1563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1542(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static135.method1573(arg1, arg2);
		@Pc(14) int local14 = Static135.method1572(arg1, arg2);
		if (this.anInt2143 == local10 && this.anInt2141 == local14) {
			this.anInt2146 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2150;
		if (this.anInt2150 - arg1 > local31) {
			local31 = this.anInt2150 - arg1;
		}
		if (local10 - this.anInt2143 > local31) {
			local31 = local10 - this.anInt2143;
		}
		if (this.anInt2143 - local10 > local31) {
			local31 = this.anInt2143 - local10;
		}
		if (local14 - this.anInt2141 > local31) {
			local31 = local14 - this.anInt2141;
		}
		if (this.anInt2141 - local14 > local31) {
			local31 = this.anInt2141 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2146 = arg0;
		this.anInt2140 = arg1;
		this.anInt2148 = arg2;
		this.anInt2151 = (arg1 - this.anInt2150) / arg0;
		this.anInt2149 = (local10 - this.anInt2143) / arg0;
		this.anInt2145 = (local14 - this.anInt2141) / arg0;
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
	public synchronized void method1564(@OriginalArg(0) int arg0) {
		this.method1542(arg0 << 6, this.method1543());
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
	public synchronized void method1566(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2142 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1534(@OriginalArg(0) int arg0) {
		if (this.anInt2146 > 0) {
			if (arg0 >= this.anInt2146) {
				if (this.anInt2140 == Integer.MIN_VALUE) {
					this.anInt2140 = 0;
					this.anInt2150 = this.anInt2143 = this.anInt2141 = 0;
					this.method2189();
					arg0 = this.anInt2146;
				}
				this.anInt2146 = 0;
				this.method1562();
			} else {
				this.anInt2150 += this.anInt2151 * arg0;
				this.anInt2143 += this.anInt2149 * arg0;
				this.anInt2141 += this.anInt2145 * arg0;
				this.anInt2146 -= arg0;
			}
		}
		@Pc(71) Class4_Sub6_Sub1 local71 = (Class4_Sub6_Sub1) super.aClass4_Sub6_5;
		@Pc(76) int local76 = this.anInt2144 << 8;
		@Pc(81) int local81 = this.anInt2147 << 8;
		@Pc(87) int local87 = local71.aByteArray13.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2152 = 0;
		}
		if (this.anInt2142 < 0) {
			if (this.anInt2139 <= 0) {
				this.method1555();
				this.method2189();
				return;
			}
			this.anInt2142 = 0;
		}
		if (this.anInt2142 >= local87) {
			if (this.anInt2139 >= 0) {
				this.method1555();
				this.method2189();
				return;
			}
			this.anInt2142 = local87 - 1;
		}
		this.anInt2142 += this.anInt2139 * arg0;
		if (this.anInt2152 >= 0) {
			if (this.anInt2152 > 0) {
				if (this.aBoolean108) {
					label125: {
						if (this.anInt2139 < 0) {
							if (this.anInt2142 >= local76) {
								return;
							}
							this.anInt2142 = local76 + local76 - this.anInt2142 - 1;
							this.anInt2139 = -this.anInt2139;
							if (--this.anInt2152 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2142 < local81) {
								return;
							}
							this.anInt2142 = local81 + local81 - this.anInt2142 - 1;
							this.anInt2139 = -this.anInt2139;
							if (--this.anInt2152 == 0) {
								break;
							}
							if (this.anInt2142 >= local76) {
								return;
							}
							this.anInt2142 = local76 + local76 - this.anInt2142 - 1;
							this.anInt2139 = -this.anInt2139;
						} while (--this.anInt2152 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2139 < 0) {
						if (this.anInt2142 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2142 - 1) / local91;
						if (local361 < this.anInt2152) {
							this.anInt2142 += local91 * local361;
							this.anInt2152 -= local361;
							return;
						}
						this.anInt2142 += local91 * this.anInt2152;
						this.anInt2152 = 0;
					} else if (this.anInt2142 >= local81) {
						local361 = (this.anInt2142 - local76) / local91;
						if (local361 < this.anInt2152) {
							this.anInt2142 -= local91 * local361;
							this.anInt2152 -= local361;
							return;
						}
						this.anInt2142 -= local91 * this.anInt2152;
						this.anInt2152 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2139 < 0) {
				if (this.anInt2142 < 0) {
					this.anInt2142 = -1;
					this.method1555();
					this.method2189();
					return;
				}
			} else if (this.anInt2142 >= local87) {
				this.anInt2142 = local87;
				this.method1555();
				this.method2189();
			}
		} else if (this.aBoolean108) {
			if (this.anInt2139 < 0) {
				if (this.anInt2142 >= local76) {
					return;
				}
				this.anInt2142 = local76 + local76 - this.anInt2142 - 1;
				this.anInt2139 = -this.anInt2139;
			}
			while (this.anInt2142 >= local81) {
				this.anInt2142 = local81 + local81 - this.anInt2142 - 1;
				this.anInt2139 = -this.anInt2139;
				if (this.anInt2142 >= local76) {
					return;
				}
				this.anInt2142 = local76 + local76 - this.anInt2142 - 1;
				this.anInt2139 = -this.anInt2139;
			}
		} else if (this.anInt2139 < 0) {
			if (this.anInt2142 < local76) {
				this.anInt2142 = local81 - (local81 - 1 - this.anInt2142) % local91 - 1;
			}
		} else if (this.anInt2142 >= local81) {
			this.anInt2142 = local76 + (this.anInt2142 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "()I")
	public synchronized int method1569() {
		return this.anInt2140 == Integer.MIN_VALUE ? 0 : this.anInt2140;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "()Lclient!md;")
	@Override
	public Class4_Sub1 method1536() {
		return null;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "()I")
	@Override
	public int method1537() {
		@Pc(6) int local6 = this.anInt2150 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2152 == 0) {
			local6 -= local6 * this.anInt2142 / (((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13.length << 8);
		} else if (this.anInt2152 >= 0) {
			local6 -= local6 * this.anInt2144 / ((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V")
	public synchronized void method1575(@OriginalArg(0) int arg0) {
		if (this.anInt2139 < 0) {
			this.anInt2139 = -arg0;
		} else {
			this.anInt2139 = arg0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "([IIIII)I")
	private int method1576(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2146 <= 0) {
				if (this.anInt2139 == -256 && (this.anInt2142 & 0xFF) == 0) {
					if (Static7.aBoolean9) {
						return Static135.method1568(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2143, this.anInt2141, arg3, arg2, this);
					}
					return Static135.method1545(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2150, arg3, arg2, this);
				}
				if (Static7.aBoolean9) {
					return Static135.method1574(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2143, this.anInt2141, arg3, arg2, this, this.anInt2139, arg4);
				}
				return Static135.method1570(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2150, arg3, arg2, this, this.anInt2139, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2146;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2146 += arg1;
			if (this.anInt2139 == -256 && (this.anInt2142 & 0xFF) == 0) {
				if (Static7.aBoolean9) {
					arg1 = Static135.method1561(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2143, this.anInt2141, this.anInt2149, this.anInt2145, local5, arg2, this);
				} else {
					arg1 = Static135.method1557(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2150, this.anInt2151, local5, arg2, this);
				}
			} else if (Static7.aBoolean9) {
				arg1 = Static135.method1567(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2143, this.anInt2141, this.anInt2149, this.anInt2145, local5, arg2, this, this.anInt2139, arg4);
			} else {
				arg1 = Static135.method1559(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray13, arg0, this.anInt2142, arg1, this.anInt2150, this.anInt2151, local5, arg2, this, this.anInt2139, arg4);
			}
			this.anInt2146 -= arg1;
			if (this.anInt2146 != 0) {
				return arg1;
			}
		} while (!this.method1577());
		return arg3;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1533(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2140 == 0 && this.anInt2146 == 0) {
			this.method1534(arg2);
			return;
		}
		@Pc(13) Class4_Sub6_Sub1 local13 = (Class4_Sub6_Sub1) super.aClass4_Sub6_5;
		@Pc(18) int local18 = this.anInt2144 << 8;
		@Pc(23) int local23 = this.anInt2147 << 8;
		@Pc(29) int local29 = local13.aByteArray13.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2152 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2142 < 0) {
			if (this.anInt2139 <= 0) {
				this.method1555();
				this.method2189();
				return;
			}
			this.anInt2142 = 0;
		}
		if (this.anInt2142 >= local29) {
			if (this.anInt2139 >= 0) {
				this.method1555();
				this.method2189();
				return;
			}
			this.anInt2142 = local29 - 1;
		}
		if (this.anInt2152 >= 0) {
			if (this.anInt2152 > 0) {
				if (this.aBoolean108) {
					label130: {
						if (this.anInt2139 < 0) {
							local40 = this.method1576(arg0, arg1, local18, local44, local13.aByteArray13[this.anInt2144]);
							if (this.anInt2142 >= local18) {
								return;
							}
							this.anInt2142 = local18 + local18 - this.anInt2142 - 1;
							this.anInt2139 = -this.anInt2139;
							if (--this.anInt2152 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1560(arg0, local40, local23, local44, local13.aByteArray13[this.anInt2147 - 1]);
							if (this.anInt2142 < local23) {
								return;
							}
							this.anInt2142 = local23 + local23 - this.anInt2142 - 1;
							this.anInt2139 = -this.anInt2139;
							if (--this.anInt2152 == 0) {
								break;
							}
							local40 = this.method1576(arg0, local40, local18, local44, local13.aByteArray13[this.anInt2144]);
							if (this.anInt2142 >= local18) {
								return;
							}
							this.anInt2142 = local18 + local18 - this.anInt2142 - 1;
							this.anInt2139 = -this.anInt2139;
						} while (--this.anInt2152 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2139 < 0) {
						while (true) {
							local40 = this.method1576(arg0, local40, local18, local44, local13.aByteArray13[this.anInt2147 - 1]);
							if (this.anInt2142 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2142 - 1) / local33;
							if (local416 >= this.anInt2152) {
								this.anInt2142 += local33 * this.anInt2152;
								this.anInt2152 = 0;
								break;
							}
							this.anInt2142 += local33 * local416;
							this.anInt2152 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1560(arg0, local40, local23, local44, local13.aByteArray13[this.anInt2144]);
							if (this.anInt2142 < local23) {
								return;
							}
							local416 = (this.anInt2142 - local18) / local33;
							if (local416 >= this.anInt2152) {
								this.anInt2142 -= local33 * this.anInt2152;
								this.anInt2152 = 0;
								break;
							}
							this.anInt2142 -= local33 * local416;
							this.anInt2152 -= local416;
						}
					}
				}
			}
			if (this.anInt2139 < 0) {
				this.method1576(arg0, local40, 0, local44, 0);
				if (this.anInt2142 < 0) {
					this.anInt2142 = -1;
					this.method1555();
					this.method2189();
					return;
				}
			} else {
				this.method1560(arg0, local40, local29, local44, 0);
				if (this.anInt2142 >= local29) {
					this.anInt2142 = local29;
					this.method1555();
					this.method2189();
				}
			}
		} else if (this.aBoolean108) {
			if (this.anInt2139 < 0) {
				local40 = this.method1576(arg0, arg1, local18, local44, local13.aByteArray13[this.anInt2144]);
				if (this.anInt2142 >= local18) {
					return;
				}
				this.anInt2142 = local18 + local18 - this.anInt2142 - 1;
				this.anInt2139 = -this.anInt2139;
			}
			while (true) {
				local40 = this.method1560(arg0, local40, local23, local44, local13.aByteArray13[this.anInt2147 - 1]);
				if (this.anInt2142 < local23) {
					return;
				}
				this.anInt2142 = local23 + local23 - this.anInt2142 - 1;
				this.anInt2139 = -this.anInt2139;
				local40 = this.method1576(arg0, local40, local18, local44, local13.aByteArray13[this.anInt2144]);
				if (this.anInt2142 >= local18) {
					return;
				}
				this.anInt2142 = local18 + local18 - this.anInt2142 - 1;
				this.anInt2139 = -this.anInt2139;
			}
		} else if (this.anInt2139 < 0) {
			while (true) {
				local40 = this.method1576(arg0, local40, local18, local44, local13.aByteArray13[this.anInt2147 - 1]);
				if (this.anInt2142 >= local18) {
					return;
				}
				this.anInt2142 = local23 - (local23 - 1 - this.anInt2142) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1560(arg0, local40, local23, local44, local13.aByteArray13[this.anInt2144]);
				if (this.anInt2142 < local23) {
					return;
				}
				this.anInt2142 = local18 + (this.anInt2142 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "()Z")
	private boolean method1577() {
		@Pc(2) int local2 = this.anInt2140;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static135.method1573(local2, this.anInt2148);
			local8 = Static135.method1572(local2, this.anInt2148);
		}
		if (this.anInt2150 != local2 || this.anInt2143 != local10 || this.anInt2141 != local8) {
			if (this.anInt2150 < local2) {
				this.anInt2151 = 1;
				this.anInt2146 = local2 - this.anInt2150;
			} else if (this.anInt2150 > local2) {
				this.anInt2151 = -1;
				this.anInt2146 = this.anInt2150 - local2;
			} else {
				this.anInt2151 = 0;
			}
			if (this.anInt2143 < local10) {
				this.anInt2149 = 1;
				if (this.anInt2146 == 0 || this.anInt2146 > local10 - this.anInt2143) {
					this.anInt2146 = local10 - this.anInt2143;
				}
			} else if (this.anInt2143 > local10) {
				this.anInt2149 = -1;
				if (this.anInt2146 == 0 || this.anInt2146 > this.anInt2143 - local10) {
					this.anInt2146 = this.anInt2143 - local10;
				}
			} else {
				this.anInt2149 = 0;
			}
			if (this.anInt2141 < local8) {
				this.anInt2145 = 1;
				if (this.anInt2146 == 0 || this.anInt2146 > local8 - this.anInt2141) {
					this.anInt2146 = local8 - this.anInt2141;
				}
			} else if (this.anInt2141 > local8) {
				this.anInt2145 = -1;
				if (this.anInt2146 == 0 || this.anInt2146 > this.anInt2141 - local8) {
					this.anInt2146 = this.anInt2141 - local8;
				}
			} else {
				this.anInt2145 = 0;
			}
			return false;
		} else if (this.anInt2140 == Integer.MIN_VALUE) {
			this.anInt2140 = 0;
			this.anInt2150 = this.anInt2143 = this.anInt2141 = 0;
			this.method2189();
			return true;
		} else {
			this.method1562();
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "()Z")
	public boolean method1578() {
		return this.anInt2146 != 0;
	}
}
