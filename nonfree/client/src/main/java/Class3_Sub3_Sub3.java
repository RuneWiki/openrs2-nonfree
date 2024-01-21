import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!p", name = "K", descriptor = "I")
	public int anInt2325;

	@OriginalMember(owner = "client!p", name = "L", descriptor = "I")
	public int anInt2326;

	@OriginalMember(owner = "client!p", name = "O", descriptor = "I")
	public int anInt2329;

	@OriginalMember(owner = "client!p", name = "P", descriptor = "I")
	private int anInt2330;

	@OriginalMember(owner = "client!p", name = "S", descriptor = "I")
	public int anInt2332;

	@OriginalMember(owner = "client!p", name = "T", descriptor = "I")
	private int anInt2333;

	@OriginalMember(owner = "client!p", name = "W", descriptor = "I")
	public int anInt2336;

	@OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
	public int anInt2338;

	@OriginalMember(owner = "client!p", name = "N", descriptor = "I")
	private final int anInt2328;

	@OriginalMember(owner = "client!p", name = "R", descriptor = "I")
	private final int anInt2331;

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "Z")
	private final boolean aBoolean107;

	@OriginalMember(owner = "client!p", name = "V", descriptor = "I")
	private int anInt2335;

	@OriginalMember(owner = "client!p", name = "U", descriptor = "I")
	private int anInt2334;

	@OriginalMember(owner = "client!p", name = "X", descriptor = "I")
	private int anInt2337;

	@OriginalMember(owner = "client!p", name = "M", descriptor = "I")
	public int anInt2327;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!r;II)V")
	public Class3_Sub3_Sub3(@OriginalArg(0) Class3_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub4_5 = arg0;
		this.anInt2328 = arg0.anInt2499;
		this.anInt2331 = arg0.anInt2500;
		this.aBoolean107 = arg0.aBoolean117;
		this.anInt2335 = arg1;
		this.anInt2334 = arg2;
		this.anInt2337 = 8192;
		this.anInt2327 = 0;
		this.method1567();
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!r;III)V")
	public Class3_Sub3_Sub3(@OriginalArg(0) Class3_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub4_5 = arg0;
		this.anInt2328 = arg0.anInt2499;
		this.anInt2331 = arg0.anInt2500;
		this.aBoolean107 = arg0.aBoolean117;
		this.anInt2335 = arg1;
		this.anInt2334 = arg2;
		this.anInt2337 = arg3;
		this.anInt2327 = 0;
		this.method1567();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()I")
	@Override
	public int method2058() {
		@Pc(6) int local6 = this.anInt2338 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2330 == 0) {
			local6 -= local6 * this.anInt2327 / (((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32.length << 8);
		} else if (this.anInt2330 >= 0) {
			local6 -= local6 * this.anInt2328 / ((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "()I")
	public synchronized int method1561() {
		return this.anInt2334 == Integer.MIN_VALUE ? 0 : this.anInt2334;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
	public synchronized void method1562(@OriginalArg(0) int arg0) {
		this.method1566(arg0 << 6, this.method1573());
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([IIIII)I")
	private int method1563(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2333 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2333;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2333 += arg1;
			if (this.anInt2335 == 256 && (this.anInt2327 & 0xFF) == 0) {
				if (Static28.aBoolean44) {
					arg1 = Static132.method1587(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2332, this.anInt2329, this.anInt2325, this.anInt2326, local7, arg2, this);
				} else {
					arg1 = Static132.method1559(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2338, this.anInt2336, local7, arg2, this);
				}
			} else if (Static28.aBoolean44) {
				arg1 = Static132.method1584(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2332, this.anInt2329, this.anInt2325, this.anInt2326, local7, arg2, this, this.anInt2335, arg4);
			} else {
				arg1 = Static132.method1580(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2338, this.anInt2336, local7, arg2, this, this.anInt2335, arg4);
			}
			this.anInt2333 -= arg1;
			if (this.anInt2333 != 0) {
				return arg1;
			}
			if (this.anInt2334 == Integer.MIN_VALUE) {
				this.anInt2334 = 0;
				this.anInt2338 = this.anInt2332 = this.anInt2329 = 0;
				this.method2055();
				return arg3;
			}
			this.method1567();
		}
		if (this.anInt2335 == 256 && (this.anInt2327 & 0xFF) == 0) {
			return Static28.aBoolean44 ? Static132.method1582(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2332, this.anInt2329, arg3, arg2, this) : Static132.method1595(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2338, arg3, arg2, this);
		} else if (Static28.aBoolean44) {
			return Static132.method1570(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2332, this.anInt2329, arg3, arg2, this, this.anInt2335, arg4);
		} else {
			return Static132.method1596(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2338, arg3, arg2, this, this.anInt2335, arg4);
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
	public synchronized void method1564(@OriginalArg(0) int arg0) {
		this.anInt2330 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2057(@OriginalArg(0) int arg0) {
		if (this.anInt2333 > 0) {
			if (arg0 >= this.anInt2333) {
				if (this.anInt2334 == Integer.MIN_VALUE) {
					this.anInt2334 = 0;
					this.anInt2338 = this.anInt2332 = this.anInt2329 = 0;
					this.method2055();
					arg0 = this.anInt2333;
				}
				this.anInt2333 = 0;
				this.method1567();
			} else {
				this.anInt2338 += this.anInt2336 * arg0;
				this.anInt2332 += this.anInt2325 * arg0;
				this.anInt2329 += this.anInt2326 * arg0;
				this.anInt2333 -= arg0;
			}
		}
		@Pc(71) Class3_Sub4_Sub1 local71 = (Class3_Sub4_Sub1) super.aClass3_Sub4_5;
		@Pc(76) int local76 = this.anInt2328 << 8;
		@Pc(81) int local81 = this.anInt2331 << 8;
		@Pc(87) int local87 = local71.aByteArray32.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2330 = 0;
		}
		if (this.anInt2327 < 0) {
			if (this.anInt2335 <= 0) {
				this.method1579();
				this.method2055();
				return;
			}
			this.anInt2327 = 0;
		}
		if (this.anInt2327 >= local87) {
			if (this.anInt2335 >= 0) {
				this.method1579();
				this.method2055();
				return;
			}
			this.anInt2327 = local87 - 1;
		}
		this.anInt2327 += this.anInt2335 * arg0;
		if (this.anInt2330 >= 0) {
			if (this.anInt2330 > 0) {
				if (this.aBoolean107) {
					label125: {
						if (this.anInt2335 < 0) {
							if (this.anInt2327 >= local76) {
								return;
							}
							this.anInt2327 = local76 + local76 - this.anInt2327 - 1;
							this.anInt2335 = -this.anInt2335;
							if (--this.anInt2330 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2327 < local81) {
								return;
							}
							this.anInt2327 = local81 + local81 - this.anInt2327 - 1;
							this.anInt2335 = -this.anInt2335;
							if (--this.anInt2330 == 0) {
								break;
							}
							if (this.anInt2327 >= local76) {
								return;
							}
							this.anInt2327 = local76 + local76 - this.anInt2327 - 1;
							this.anInt2335 = -this.anInt2335;
						} while (--this.anInt2330 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2335 < 0) {
						if (this.anInt2327 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2327 - 1) / local91;
						if (local361 < this.anInt2330) {
							this.anInt2327 += local91 * local361;
							this.anInt2330 -= local361;
							return;
						}
						this.anInt2327 += local91 * this.anInt2330;
						this.anInt2330 = 0;
					} else if (this.anInt2327 >= local81) {
						local361 = (this.anInt2327 - local76) / local91;
						if (local361 < this.anInt2330) {
							this.anInt2327 -= local91 * local361;
							this.anInt2330 -= local361;
							return;
						}
						this.anInt2327 -= local91 * this.anInt2330;
						this.anInt2330 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2335 < 0) {
				if (this.anInt2327 < 0) {
					this.anInt2327 = -1;
					this.method1579();
					this.method2055();
					return;
				}
			} else if (this.anInt2327 >= local87) {
				this.anInt2327 = local87;
				this.method1579();
				this.method2055();
			}
		} else if (this.aBoolean107) {
			if (this.anInt2335 < 0) {
				if (this.anInt2327 >= local76) {
					return;
				}
				this.anInt2327 = local76 + local76 - this.anInt2327 - 1;
				this.anInt2335 = -this.anInt2335;
			}
			while (this.anInt2327 >= local81) {
				this.anInt2327 = local81 + local81 - this.anInt2327 - 1;
				this.anInt2335 = -this.anInt2335;
				if (this.anInt2327 >= local76) {
					return;
				}
				this.anInt2327 = local76 + local76 - this.anInt2327 - 1;
				this.anInt2335 = -this.anInt2335;
			}
		} else if (this.anInt2335 < 0) {
			if (this.anInt2327 < local76) {
				this.anInt2327 = local81 - (local81 - 1 - this.anInt2327) % local91 - 1;
			}
		} else if (this.anInt2327 >= local81) {
			this.anInt2327 = local76 + (this.anInt2327 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
	private synchronized void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2334 = arg0;
		this.anInt2337 = arg1;
		this.anInt2333 = 0;
		this.method1567();
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "()V")
	private void method1567() {
		this.anInt2338 = this.anInt2334;
		this.anInt2332 = Static132.method1585(this.anInt2334, this.anInt2337);
		this.anInt2329 = Static132.method1565(this.anInt2334, this.anInt2337);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public synchronized void method1568() {
		this.anInt2335 = (this.anInt2335 ^ this.anInt2335 >> 31) + (this.anInt2335 >>> 31);
		this.anInt2335 = -this.anInt2335;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
	public synchronized void method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1566(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static132.method1585(arg1, arg2);
		@Pc(14) int local14 = Static132.method1565(arg1, arg2);
		if (this.anInt2332 == local10 && this.anInt2329 == local14) {
			this.anInt2333 = 0;
			return;
		}
		this.anInt2333 = arg0;
		this.anInt2334 = arg1;
		this.anInt2337 = arg2;
		this.anInt2336 = (arg1 - this.anInt2338) / arg0;
		this.anInt2325 = (local10 - this.anInt2332) / arg0;
		this.anInt2326 = (local14 - this.anInt2329) / arg0;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()Lclient!be;")
	@Override
	public Class3_Sub3 method2060() {
		return null;
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
	public synchronized void method1571(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1572();
			this.method2055();
		} else if (this.anInt2332 == 0 && this.anInt2329 == 0) {
			this.anInt2333 = 0;
			this.anInt2334 = 0;
			this.anInt2338 = 0;
			this.method2055();
		} else {
			this.anInt2333 = arg0;
			this.anInt2334 = Integer.MIN_VALUE;
			this.anInt2336 = -this.anInt2338 / arg0;
			this.anInt2325 = -this.anInt2332 / arg0;
			this.anInt2326 = -this.anInt2329 / arg0;
		}
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
	private synchronized void method1572() {
		this.method1566(0, this.method1573());
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "()I")
	public synchronized int method1573() {
		return this.anInt2337 < 0 ? -1 : this.anInt2337;
	}

	@OriginalMember(owner = "client!p", name = "h", descriptor = "()I")
	public synchronized int method1575() {
		return this.anInt2335 < 0 ? -this.anInt2335 : this.anInt2335;
	}

	@OriginalMember(owner = "client!p", name = "i", descriptor = "()Z")
	public boolean method1576() {
		return this.anInt2327 < 0 || this.anInt2327 >= ((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32.length << 8;
	}

	@OriginalMember(owner = "client!p", name = "j", descriptor = "()V")
	private void method1579() {
		if (this.anInt2333 == 0) {
			return;
		}
		if (this.anInt2334 == Integer.MIN_VALUE) {
			this.anInt2334 = 0;
		}
		this.anInt2333 = 0;
		this.method1567();
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "([IIIII)I")
	private int method1581(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2333 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2333;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2333 += arg1;
			if (this.anInt2335 == -256 && (this.anInt2327 & 0xFF) == 0) {
				if (Static28.aBoolean44) {
					arg1 = Static132.method1574(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2332, this.anInt2329, this.anInt2325, this.anInt2326, local7, arg2, this);
				} else {
					arg1 = Static132.method1589(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2338, this.anInt2336, local7, arg2, this);
				}
			} else if (Static28.aBoolean44) {
				arg1 = Static132.method1588(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2332, this.anInt2329, this.anInt2325, this.anInt2326, local7, arg2, this, this.anInt2335, arg4);
			} else {
				arg1 = Static132.method1578(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2338, this.anInt2336, local7, arg2, this, this.anInt2335, arg4);
			}
			this.anInt2333 -= arg1;
			if (this.anInt2333 != 0) {
				return arg1;
			}
			if (this.anInt2334 == Integer.MIN_VALUE) {
				this.anInt2334 = 0;
				this.anInt2338 = this.anInt2332 = this.anInt2329 = 0;
				this.method2055();
				return arg3;
			}
			this.method1567();
		}
		if (this.anInt2335 == -256 && (this.anInt2327 & 0xFF) == 0) {
			return Static28.aBoolean44 ? Static132.method1560(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2332, this.anInt2329, arg3, arg2, this) : Static132.method1586(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2338, arg3, arg2, this);
		} else if (Static28.aBoolean44) {
			return Static132.method1591(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2332, this.anInt2329, arg3, arg2, this, this.anInt2335, arg4);
		} else {
			return Static132.method1558(((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32, arg0, this.anInt2327, arg1, this.anInt2338, arg3, arg2, this, this.anInt2335, arg4);
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "()I")
	@Override
	public int method2063() {
		return this.anInt2334 == 0 && this.anInt2333 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2062(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2334 == 0 && this.anInt2333 == 0) {
			this.method2057(arg2);
			return;
		}
		@Pc(13) Class3_Sub4_Sub1 local13 = (Class3_Sub4_Sub1) super.aClass3_Sub4_5;
		@Pc(18) int local18 = this.anInt2328 << 8;
		@Pc(23) int local23 = this.anInt2331 << 8;
		@Pc(29) int local29 = local13.aByteArray32.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2330 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2327 < 0) {
			if (this.anInt2335 <= 0) {
				this.method1579();
				this.method2055();
				return;
			}
			this.anInt2327 = 0;
		}
		if (this.anInt2327 >= local29) {
			if (this.anInt2335 >= 0) {
				this.method1579();
				this.method2055();
				return;
			}
			this.anInt2327 = local29 - 1;
		}
		if (this.anInt2330 >= 0) {
			if (this.anInt2330 > 0) {
				if (this.aBoolean107) {
					label130: {
						if (this.anInt2335 < 0) {
							local40 = this.method1581(arg0, arg1, local18, local44, local13.aByteArray32[this.anInt2328]);
							if (this.anInt2327 >= local18) {
								return;
							}
							this.anInt2327 = local18 + local18 - this.anInt2327 - 1;
							this.anInt2335 = -this.anInt2335;
							if (--this.anInt2330 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1563(arg0, local40, local23, local44, local13.aByteArray32[this.anInt2331 - 1]);
							if (this.anInt2327 < local23) {
								return;
							}
							this.anInt2327 = local23 + local23 - this.anInt2327 - 1;
							this.anInt2335 = -this.anInt2335;
							if (--this.anInt2330 == 0) {
								break;
							}
							local40 = this.method1581(arg0, local40, local18, local44, local13.aByteArray32[this.anInt2328]);
							if (this.anInt2327 >= local18) {
								return;
							}
							this.anInt2327 = local18 + local18 - this.anInt2327 - 1;
							this.anInt2335 = -this.anInt2335;
						} while (--this.anInt2330 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2335 < 0) {
						while (true) {
							local40 = this.method1581(arg0, local40, local18, local44, local13.aByteArray32[this.anInt2331 - 1]);
							if (this.anInt2327 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2327 - 1) / local33;
							if (local416 >= this.anInt2330) {
								this.anInt2327 += local33 * this.anInt2330;
								this.anInt2330 = 0;
								break;
							}
							this.anInt2327 += local33 * local416;
							this.anInt2330 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1563(arg0, local40, local23, local44, local13.aByteArray32[this.anInt2328]);
							if (this.anInt2327 < local23) {
								return;
							}
							local416 = (this.anInt2327 - local18) / local33;
							if (local416 >= this.anInt2330) {
								this.anInt2327 -= local33 * this.anInt2330;
								this.anInt2330 = 0;
								break;
							}
							this.anInt2327 -= local33 * local416;
							this.anInt2330 -= local416;
						}
					}
				}
			}
			if (this.anInt2335 < 0) {
				this.method1581(arg0, local40, 0, local44, 0);
				if (this.anInt2327 < 0) {
					this.anInt2327 = -1;
					this.method1579();
					this.method2055();
					return;
				}
			} else {
				this.method1563(arg0, local40, local29, local44, 0);
				if (this.anInt2327 >= local29) {
					this.anInt2327 = local29;
					this.method1579();
					this.method2055();
				}
			}
		} else if (this.aBoolean107) {
			if (this.anInt2335 < 0) {
				local40 = this.method1581(arg0, arg1, local18, local44, local13.aByteArray32[this.anInt2328]);
				if (this.anInt2327 >= local18) {
					return;
				}
				this.anInt2327 = local18 + local18 - this.anInt2327 - 1;
				this.anInt2335 = -this.anInt2335;
			}
			while (true) {
				local40 = this.method1563(arg0, local40, local23, local44, local13.aByteArray32[this.anInt2331 - 1]);
				if (this.anInt2327 < local23) {
					return;
				}
				this.anInt2327 = local23 + local23 - this.anInt2327 - 1;
				this.anInt2335 = -this.anInt2335;
				local40 = this.method1581(arg0, local40, local18, local44, local13.aByteArray32[this.anInt2328]);
				if (this.anInt2327 >= local18) {
					return;
				}
				this.anInt2327 = local18 + local18 - this.anInt2327 - 1;
				this.anInt2335 = -this.anInt2335;
			}
		} else if (this.anInt2335 < 0) {
			while (true) {
				local40 = this.method1581(arg0, local40, local18, local44, local13.aByteArray32[this.anInt2331 - 1]);
				if (this.anInt2327 >= local18) {
					return;
				}
				this.anInt2327 = local23 - (local23 - 1 - this.anInt2327) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1563(arg0, local40, local23, local44, local13.aByteArray32[this.anInt2328]);
				if (this.anInt2327 < local23) {
					return;
				}
				this.anInt2327 = local18 + (this.anInt2327 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()Lclient!be;")
	@Override
	public Class3_Sub3 method2059() {
		return null;
	}

	@OriginalMember(owner = "client!p", name = "h", descriptor = "(I)V")
	public synchronized void method1590(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub4_Sub1) super.aClass3_Sub4_5).aByteArray32.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2327 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(II)V")
	public synchronized void method1592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1569(arg0, arg1, this.method1573());
	}

	@OriginalMember(owner = "client!p", name = "i", descriptor = "(I)V")
	public synchronized void method1593(@OriginalArg(0) int arg0) {
		if (this.anInt2335 < 0) {
			this.anInt2335 = -arg0;
		} else {
			this.anInt2335 = arg0;
		}
	}

	@OriginalMember(owner = "client!p", name = "k", descriptor = "()Z")
	public boolean method1594() {
		return this.anInt2333 != 0;
	}
}
