import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class3_Sub8_Sub1 extends Class3_Sub8 {

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
	public int anInt1483;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
	public int anInt1484;

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
	public int anInt1486;

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
	private int anInt1487;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
	public int anInt1488;

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
	private int anInt1490;

	@OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
	public int anInt1491;

	@OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
	public int anInt1492;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
	private final int anInt1485;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
	private final int anInt1482;

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "Z")
	private final boolean aBoolean109;

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
	private int anInt1489;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
	private int anInt1481;

	@OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
	private int anInt1493;

	@OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
	public int anInt1494;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!nd;II)V")
	public Class3_Sub8_Sub1(@OriginalArg(0) Class3_Sub29_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub29_5 = arg0;
		this.anInt1485 = arg0.anInt4133;
		this.anInt1482 = arg0.anInt4132;
		this.aBoolean109 = arg0.aBoolean324;
		this.anInt1489 = arg1;
		this.anInt1481 = arg2;
		this.anInt1493 = 8192;
		this.anInt1494 = 0;
		this.method1279();
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!nd;III)V")
	public Class3_Sub8_Sub1(@OriginalArg(0) Class3_Sub29_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub29_5 = arg0;
		this.anInt1485 = arg0.anInt4133;
		this.anInt1482 = arg0.anInt4132;
		this.aBoolean109 = arg0.aBoolean324;
		this.anInt1489 = arg1;
		this.anInt1481 = arg2;
		this.anInt1493 = arg3;
		this.anInt1494 = 0;
		this.method1279();
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "()Lclient!me;")
	@Override
	public Class3_Sub8 method2126() {
		return null;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
	public synchronized void method1242(@OriginalArg(0) int arg0) {
		this.method1249(arg0 << 6, this.method1275());
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2129(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1481 == 0 && this.anInt1487 == 0) {
			this.method2131(arg2);
			return;
		}
		@Pc(13) Class3_Sub29_Sub1 local13 = (Class3_Sub29_Sub1) super.aClass3_Sub29_5;
		@Pc(18) int local18 = this.anInt1485 << 8;
		@Pc(23) int local23 = this.anInt1482 << 8;
		@Pc(29) int local29 = local13.aByteArray54.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1490 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1494 < 0) {
			if (this.anInt1489 <= 0) {
				this.method1268();
				this.method5700();
				return;
			}
			this.anInt1494 = 0;
		}
		if (this.anInt1494 >= local29) {
			if (this.anInt1489 >= 0) {
				this.method1268();
				this.method5700();
				return;
			}
			this.anInt1494 = local29 - 1;
		}
		if (this.anInt1490 >= 0) {
			if (this.anInt1490 > 0) {
				if (this.aBoolean109) {
					label130: {
						if (this.anInt1489 < 0) {
							local40 = this.method1250(arg0, arg1, local18, local44, local13.aByteArray54[this.anInt1485]);
							if (this.anInt1494 >= local18) {
								return;
							}
							this.anInt1494 = local18 + local18 - this.anInt1494 - 1;
							this.anInt1489 = -this.anInt1489;
							if (--this.anInt1490 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1274(arg0, local40, local23, local44, local13.aByteArray54[this.anInt1482 - 1]);
							if (this.anInt1494 < local23) {
								return;
							}
							this.anInt1494 = local23 + local23 - this.anInt1494 - 1;
							this.anInt1489 = -this.anInt1489;
							if (--this.anInt1490 == 0) {
								break;
							}
							local40 = this.method1250(arg0, local40, local18, local44, local13.aByteArray54[this.anInt1485]);
							if (this.anInt1494 >= local18) {
								return;
							}
							this.anInt1494 = local18 + local18 - this.anInt1494 - 1;
							this.anInt1489 = -this.anInt1489;
						} while (--this.anInt1490 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1489 < 0) {
						while (true) {
							local40 = this.method1250(arg0, local40, local18, local44, local13.aByteArray54[this.anInt1482 - 1]);
							if (this.anInt1494 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1494 - 1) / local33;
							if (local416 >= this.anInt1490) {
								this.anInt1494 += local33 * this.anInt1490;
								this.anInt1490 = 0;
								break;
							}
							this.anInt1494 += local33 * local416;
							this.anInt1490 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1274(arg0, local40, local23, local44, local13.aByteArray54[this.anInt1485]);
							if (this.anInt1494 < local23) {
								return;
							}
							local416 = (this.anInt1494 - local18) / local33;
							if (local416 >= this.anInt1490) {
								this.anInt1494 -= local33 * this.anInt1490;
								this.anInt1490 = 0;
								break;
							}
							this.anInt1494 -= local33 * local416;
							this.anInt1490 -= local416;
						}
					}
				}
			}
			if (this.anInt1489 < 0) {
				this.method1250(arg0, local40, 0, local44, 0);
				if (this.anInt1494 < 0) {
					this.anInt1494 = -1;
					this.method1268();
					this.method5700();
					return;
				}
			} else {
				this.method1274(arg0, local40, local29, local44, 0);
				if (this.anInt1494 >= local29) {
					this.anInt1494 = local29;
					this.method1268();
					this.method5700();
				}
			}
		} else if (this.aBoolean109) {
			if (this.anInt1489 < 0) {
				local40 = this.method1250(arg0, arg1, local18, local44, local13.aByteArray54[this.anInt1485]);
				if (this.anInt1494 >= local18) {
					return;
				}
				this.anInt1494 = local18 + local18 - this.anInt1494 - 1;
				this.anInt1489 = -this.anInt1489;
			}
			while (true) {
				local40 = this.method1274(arg0, local40, local23, local44, local13.aByteArray54[this.anInt1482 - 1]);
				if (this.anInt1494 < local23) {
					return;
				}
				this.anInt1494 = local23 + local23 - this.anInt1494 - 1;
				this.anInt1489 = -this.anInt1489;
				local40 = this.method1250(arg0, local40, local18, local44, local13.aByteArray54[this.anInt1485]);
				if (this.anInt1494 >= local18) {
					return;
				}
				this.anInt1494 = local18 + local18 - this.anInt1494 - 1;
				this.anInt1489 = -this.anInt1489;
			}
		} else if (this.anInt1489 < 0) {
			while (true) {
				local40 = this.method1250(arg0, local40, local18, local44, local13.aByteArray54[this.anInt1482 - 1]);
				if (this.anInt1494 >= local18) {
					return;
				}
				this.anInt1494 = local23 - (local23 - 1 - this.anInt1494) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1274(arg0, local40, local23, local44, local13.aByteArray54[this.anInt1485]);
				if (this.anInt1494 < local23) {
					return;
				}
				this.anInt1494 = local18 + (this.anInt1494 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "()I")
	@Override
	public int method2130() {
		@Pc(6) int local6 = this.anInt1491 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1490 == 0) {
			local6 -= local6 * this.anInt1494 / (((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54.length << 8);
		} else if (this.anInt1490 >= 0) {
			local6 -= local6 * this.anInt1485 / ((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "()I")
	public synchronized int method1246() {
		return this.anInt1489 < 0 ? -this.anInt1489 : this.anInt1489;
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V")
	public synchronized void method1247(@OriginalArg(0) int arg0) {
		if (this.anInt1489 < 0) {
			this.anInt1489 = -arg0;
		} else {
			this.anInt1489 = arg0;
		}
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
	public synchronized void method1248(@OriginalArg(0) int arg0) {
		this.anInt1490 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V")
	private synchronized void method1249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1481 = arg0;
		this.anInt1493 = arg1;
		this.anInt1487 = 0;
		this.method1279();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([IIIII)I")
	private int method1250(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1487 <= 0) {
				if (this.anInt1489 == -256 && (this.anInt1494 & 0xFF) == 0) {
					if (Static340.aBoolean439) {
						return Static396.method1270(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1483, this.anInt1492, arg3, arg2, this);
					}
					return Static396.method1256(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1491, arg3, arg2, this);
				}
				if (Static340.aBoolean439) {
					return Static396.method1257(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1483, this.anInt1492, arg3, arg2, this, this.anInt1489, arg4);
				}
				return Static396.method1244(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1491, arg3, arg2, this, this.anInt1489, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1487;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1487 += arg1;
			if (this.anInt1489 == -256 && (this.anInt1494 & 0xFF) == 0) {
				if (Static340.aBoolean439) {
					arg1 = Static396.method1277(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1483, this.anInt1492, this.anInt1488, this.anInt1484, local5, arg2, this);
				} else {
					arg1 = Static396.method1251(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1491, this.anInt1486, local5, arg2, this);
				}
			} else if (Static340.aBoolean439) {
				arg1 = Static396.method1272(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1483, this.anInt1492, this.anInt1488, this.anInt1484, local5, arg2, this, this.anInt1489, arg4);
			} else {
				arg1 = Static396.method1254(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1491, this.anInt1486, local5, arg2, this, this.anInt1489, arg4);
			}
			this.anInt1487 -= arg1;
			if (this.anInt1487 != 0) {
				return arg1;
			}
		} while (!this.method1266());
		return arg3;
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)V")
	public synchronized void method1253(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1269();
			this.method5700();
		} else if (this.anInt1483 == 0 && this.anInt1492 == 0) {
			this.anInt1487 = 0;
			this.anInt1481 = 0;
			this.anInt1491 = 0;
			this.method5700();
		} else {
			@Pc(31) int local31 = -this.anInt1491;
			if (this.anInt1491 > local31) {
				local31 = this.anInt1491;
			}
			if (-this.anInt1483 > local31) {
				local31 = -this.anInt1483;
			}
			if (this.anInt1483 > local31) {
				local31 = this.anInt1483;
			}
			if (-this.anInt1492 > local31) {
				local31 = -this.anInt1492;
			}
			if (this.anInt1492 > local31) {
				local31 = this.anInt1492;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1487 = arg0;
			this.anInt1481 = Integer.MIN_VALUE;
			this.anInt1486 = -this.anInt1491 / arg0;
			this.anInt1488 = -this.anInt1483 / arg0;
			this.anInt1484 = -this.anInt1492 / arg0;
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)V")
	public synchronized void method1255() {
		this.anInt1489 = (this.anInt1489 ^ this.anInt1489 >> 31) + (this.anInt1489 >>> 31);
		this.anInt1489 = -this.anInt1489;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2131(@OriginalArg(0) int arg0) {
		if (this.anInt1487 > 0) {
			if (arg0 >= this.anInt1487) {
				if (this.anInt1481 == Integer.MIN_VALUE) {
					this.anInt1481 = 0;
					this.anInt1491 = this.anInt1483 = this.anInt1492 = 0;
					this.method5700();
					arg0 = this.anInt1487;
				}
				this.anInt1487 = 0;
				this.method1279();
			} else {
				this.anInt1491 += this.anInt1486 * arg0;
				this.anInt1483 += this.anInt1488 * arg0;
				this.anInt1492 += this.anInt1484 * arg0;
				this.anInt1487 -= arg0;
			}
		}
		@Pc(71) Class3_Sub29_Sub1 local71 = (Class3_Sub29_Sub1) super.aClass3_Sub29_5;
		@Pc(76) int local76 = this.anInt1485 << 8;
		@Pc(81) int local81 = this.anInt1482 << 8;
		@Pc(87) int local87 = local71.aByteArray54.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1490 = 0;
		}
		if (this.anInt1494 < 0) {
			if (this.anInt1489 <= 0) {
				this.method1268();
				this.method5700();
				return;
			}
			this.anInt1494 = 0;
		}
		if (this.anInt1494 >= local87) {
			if (this.anInt1489 >= 0) {
				this.method1268();
				this.method5700();
				return;
			}
			this.anInt1494 = local87 - 1;
		}
		this.anInt1494 += this.anInt1489 * arg0;
		if (this.anInt1490 >= 0) {
			if (this.anInt1490 > 0) {
				if (this.aBoolean109) {
					label125: {
						if (this.anInt1489 < 0) {
							if (this.anInt1494 >= local76) {
								return;
							}
							this.anInt1494 = local76 + local76 - this.anInt1494 - 1;
							this.anInt1489 = -this.anInt1489;
							if (--this.anInt1490 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1494 < local81) {
								return;
							}
							this.anInt1494 = local81 + local81 - this.anInt1494 - 1;
							this.anInt1489 = -this.anInt1489;
							if (--this.anInt1490 == 0) {
								break;
							}
							if (this.anInt1494 >= local76) {
								return;
							}
							this.anInt1494 = local76 + local76 - this.anInt1494 - 1;
							this.anInt1489 = -this.anInt1489;
						} while (--this.anInt1490 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1489 < 0) {
						if (this.anInt1494 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1494 - 1) / local91;
						if (local361 < this.anInt1490) {
							this.anInt1494 += local91 * local361;
							this.anInt1490 -= local361;
							return;
						}
						this.anInt1494 += local91 * this.anInt1490;
						this.anInt1490 = 0;
					} else if (this.anInt1494 >= local81) {
						local361 = (this.anInt1494 - local76) / local91;
						if (local361 < this.anInt1490) {
							this.anInt1494 -= local91 * local361;
							this.anInt1490 -= local361;
							return;
						}
						this.anInt1494 -= local91 * this.anInt1490;
						this.anInt1490 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1489 < 0) {
				if (this.anInt1494 < 0) {
					this.anInt1494 = -1;
					this.method1268();
					this.method5700();
					return;
				}
			} else if (this.anInt1494 >= local87) {
				this.anInt1494 = local87;
				this.method1268();
				this.method5700();
			}
		} else if (this.aBoolean109) {
			if (this.anInt1489 < 0) {
				if (this.anInt1494 >= local76) {
					return;
				}
				this.anInt1494 = local76 + local76 - this.anInt1494 - 1;
				this.anInt1489 = -this.anInt1489;
			}
			while (this.anInt1494 >= local81) {
				this.anInt1494 = local81 + local81 - this.anInt1494 - 1;
				this.anInt1489 = -this.anInt1489;
				if (this.anInt1494 >= local76) {
					return;
				}
				this.anInt1494 = local76 + local76 - this.anInt1494 - 1;
				this.anInt1489 = -this.anInt1489;
			}
		} else if (this.anInt1489 < 0) {
			if (this.anInt1494 < local76) {
				this.anInt1494 = local81 - (local81 - 1 - this.anInt1494) % local91 - 1;
			}
		} else if (this.anInt1494 >= local81) {
			this.anInt1494 = local76 + (this.anInt1494 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)V")
	public synchronized void method1260(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1494 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "()Lclient!me;")
	@Override
	public Class3_Sub8 method2128() {
		return null;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "()I")
	@Override
	public int method2125() {
		return this.anInt1481 == 0 && this.anInt1487 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "()I")
	public synchronized int method1263() {
		return this.anInt1481 == Integer.MIN_VALUE ? 0 : this.anInt1481;
	}

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "()Z")
	public boolean method1264() {
		return this.anInt1487 != 0;
	}

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "()Z")
	private boolean method1266() {
		@Pc(2) int local2 = this.anInt1481;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static396.method1271(local2, this.anInt1493);
			local8 = Static396.method1261(local2, this.anInt1493);
		}
		if (this.anInt1491 != local2 || this.anInt1483 != local10 || this.anInt1492 != local8) {
			if (this.anInt1491 < local2) {
				this.anInt1486 = 1;
				this.anInt1487 = local2 - this.anInt1491;
			} else if (this.anInt1491 > local2) {
				this.anInt1486 = -1;
				this.anInt1487 = this.anInt1491 - local2;
			} else {
				this.anInt1486 = 0;
			}
			if (this.anInt1483 < local10) {
				this.anInt1488 = 1;
				if (this.anInt1487 == 0 || this.anInt1487 > local10 - this.anInt1483) {
					this.anInt1487 = local10 - this.anInt1483;
				}
			} else if (this.anInt1483 > local10) {
				this.anInt1488 = -1;
				if (this.anInt1487 == 0 || this.anInt1487 > this.anInt1483 - local10) {
					this.anInt1487 = this.anInt1483 - local10;
				}
			} else {
				this.anInt1488 = 0;
			}
			if (this.anInt1492 < local8) {
				this.anInt1484 = 1;
				if (this.anInt1487 == 0 || this.anInt1487 > local8 - this.anInt1492) {
					this.anInt1487 = local8 - this.anInt1492;
				}
			} else if (this.anInt1492 > local8) {
				this.anInt1484 = -1;
				if (this.anInt1487 == 0 || this.anInt1487 > this.anInt1492 - local8) {
					this.anInt1487 = this.anInt1492 - local8;
				}
			} else {
				this.anInt1484 = 0;
			}
			return false;
		} else if (this.anInt1481 == Integer.MIN_VALUE) {
			this.anInt1481 = 0;
			this.anInt1491 = this.anInt1483 = this.anInt1492 = 0;
			this.method5700();
			return true;
		} else {
			this.method1279();
			return false;
		}
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(II)V")
	public synchronized void method1267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1276(arg0, arg1, this.method1275());
	}

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "()V")
	private void method1268() {
		if (this.anInt1487 == 0) {
			return;
		}
		if (this.anInt1481 == Integer.MIN_VALUE) {
			this.anInt1481 = 0;
		}
		this.anInt1487 = 0;
		this.method1279();
	}

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "(I)V")
	private synchronized void method1269() {
		this.method1249(0, this.method1275());
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "([IIIII)I")
	private int method1274(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1487 <= 0) {
				if (this.anInt1489 == 256 && (this.anInt1494 & 0xFF) == 0) {
					if (Static340.aBoolean439) {
						return Static396.method1278(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1483, this.anInt1492, arg3, arg2, this);
					}
					return Static396.method1252(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1491, arg3, arg2, this);
				}
				if (Static340.aBoolean439) {
					return Static396.method1243(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1483, this.anInt1492, arg3, arg2, this, this.anInt1489, arg4);
				}
				return Static396.method1262(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1491, arg3, arg2, this, this.anInt1489, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1487;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1487 += arg1;
			if (this.anInt1489 == 256 && (this.anInt1494 & 0xFF) == 0) {
				if (Static340.aBoolean439) {
					arg1 = Static396.method1273(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1483, this.anInt1492, this.anInt1488, this.anInt1484, local5, arg2, this);
				} else {
					arg1 = Static396.method1265(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1491, this.anInt1486, local5, arg2, this);
				}
			} else if (Static340.aBoolean439) {
				arg1 = Static396.method1259(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1483, this.anInt1492, this.anInt1488, this.anInt1484, local5, arg2, this, this.anInt1489, arg4);
			} else {
				arg1 = Static396.method1241(((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54, arg0, this.anInt1494, arg1, this.anInt1491, this.anInt1486, local5, arg2, this, this.anInt1489, arg4);
			}
			this.anInt1487 -= arg1;
			if (this.anInt1487 != 0) {
				return arg1;
			}
		} while (!this.method1266());
		return arg3;
	}

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "()I")
	public synchronized int method1275() {
		return this.anInt1493 < 0 ? -1 : this.anInt1493;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V")
	public synchronized void method1276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1249(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static396.method1271(arg1, arg2);
		@Pc(14) int local14 = Static396.method1261(arg1, arg2);
		if (this.anInt1483 == local10 && this.anInt1492 == local14) {
			this.anInt1487 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1491;
		if (this.anInt1491 - arg1 > local31) {
			local31 = this.anInt1491 - arg1;
		}
		if (local10 - this.anInt1483 > local31) {
			local31 = local10 - this.anInt1483;
		}
		if (this.anInt1483 - local10 > local31) {
			local31 = this.anInt1483 - local10;
		}
		if (local14 - this.anInt1492 > local31) {
			local31 = local14 - this.anInt1492;
		}
		if (this.anInt1492 - local14 > local31) {
			local31 = this.anInt1492 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1487 = arg0;
		this.anInt1481 = arg1;
		this.anInt1493 = arg2;
		this.anInt1486 = (arg1 - this.anInt1491) / arg0;
		this.anInt1488 = (local10 - this.anInt1483) / arg0;
		this.anInt1484 = (local14 - this.anInt1492) / arg0;
	}

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "()V")
	private void method1279() {
		this.anInt1491 = this.anInt1481;
		this.anInt1483 = Static396.method1271(this.anInt1481, this.anInt1493);
		this.anInt1492 = Static396.method1261(this.anInt1481, this.anInt1493);
	}

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "()Z")
	public boolean method1280() {
		return this.anInt1494 < 0 || this.anInt1494 >= ((Class3_Sub29_Sub1) super.aClass3_Sub29_5).aByteArray54.length << 8;
	}
}
