import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
	public int anInt2002;

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
	public int anInt2003;

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
	private int anInt2004;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
	public int anInt2006;

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
	private int anInt2007;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
	public int anInt2009;

	@OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
	public int anInt2012;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
	public int anInt2014;

	@OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
	private final int anInt2013;

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
	private final int anInt2011;

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "Z")
	private final boolean aBoolean97;

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
	private int anInt2010;

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
	private int anInt2001;

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
	private int anInt2005;

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
	public int anInt2008;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!pa;II)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) Class1_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub14_5 = arg0;
		this.anInt2013 = arg0.anInt2052;
		this.anInt2011 = arg0.anInt2050;
		this.aBoolean97 = arg0.aBoolean99;
		this.anInt2010 = arg1;
		this.anInt2001 = arg2;
		this.anInt2005 = 8192;
		this.anInt2008 = 0;
		this.method1512();
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!pa;III)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) Class1_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub14_5 = arg0;
		this.anInt2013 = arg0.anInt2052;
		this.anInt2011 = arg0.anInt2050;
		this.aBoolean97 = arg0.aBoolean99;
		this.anInt2010 = arg1;
		this.anInt2001 = arg2;
		this.anInt2005 = arg3;
		this.anInt2008 = 0;
		this.method1512();
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
	public synchronized void method1474(@OriginalArg(0) int arg0) {
		this.anInt2004 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()Lclient!h;")
	@Override
	public Class1_Sub3 method2026() {
		return null;
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "()Lclient!h;")
	@Override
	public Class1_Sub3 method2032() {
		return null;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "()I")
	public synchronized int method1478() {
		return this.anInt2010 < 0 ? -this.anInt2010 : this.anInt2010;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
	public synchronized void method1479(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2008 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "()I")
	public synchronized int method1480() {
		return this.anInt2005 < 0 ? -1 : this.anInt2005;
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
	public synchronized void method1483(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1487();
			this.method2024();
		} else if (this.anInt2012 == 0 && this.anInt2014 == 0) {
			this.anInt2007 = 0;
			this.anInt2001 = 0;
			this.anInt2009 = 0;
			this.method2024();
		} else {
			@Pc(31) int local31 = -this.anInt2009;
			if (this.anInt2009 > local31) {
				local31 = this.anInt2009;
			}
			if (-this.anInt2012 > local31) {
				local31 = -this.anInt2012;
			}
			if (this.anInt2012 > local31) {
				local31 = this.anInt2012;
			}
			if (-this.anInt2014 > local31) {
				local31 = -this.anInt2014;
			}
			if (this.anInt2014 > local31) {
				local31 = this.anInt2014;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2007 = arg0;
			this.anInt2001 = Integer.MIN_VALUE;
			this.anInt2006 = -this.anInt2009 / arg0;
			this.anInt2002 = -this.anInt2012 / arg0;
			this.anInt2003 = -this.anInt2014 / arg0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
	public synchronized void method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1494(arg0, arg1, this.method1480());
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V")
	public synchronized void method1486(@OriginalArg(0) int arg0) {
		this.method1488(arg0 << 6, this.method1480());
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
	private synchronized void method1487() {
		this.method1488(0, this.method1480());
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2030(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2001 == 0 && this.anInt2007 == 0) {
			this.method2028(arg2);
			return;
		}
		@Pc(13) Class1_Sub14_Sub1 local13 = (Class1_Sub14_Sub1) super.aClass1_Sub14_5;
		@Pc(18) int local18 = this.anInt2013 << 8;
		@Pc(23) int local23 = this.anInt2011 << 8;
		@Pc(29) int local29 = local13.aByteArray21.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2004 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2008 < 0) {
			if (this.anInt2010 <= 0) {
				this.method1511();
				this.method2024();
				return;
			}
			this.anInt2008 = 0;
		}
		if (this.anInt2008 >= local29) {
			if (this.anInt2010 >= 0) {
				this.method1511();
				this.method2024();
				return;
			}
			this.anInt2008 = local29 - 1;
		}
		if (this.anInt2004 >= 0) {
			if (this.anInt2004 > 0) {
				if (this.aBoolean97) {
					label130: {
						if (this.anInt2010 < 0) {
							local40 = this.method1500(arg0, arg1, local18, local44, local13.aByteArray21[this.anInt2013]);
							if (this.anInt2008 >= local18) {
								return;
							}
							this.anInt2008 = local18 + local18 - this.anInt2008 - 1;
							this.anInt2010 = -this.anInt2010;
							if (--this.anInt2004 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1510(arg0, local40, local23, local44, local13.aByteArray21[this.anInt2011 - 1]);
							if (this.anInt2008 < local23) {
								return;
							}
							this.anInt2008 = local23 + local23 - this.anInt2008 - 1;
							this.anInt2010 = -this.anInt2010;
							if (--this.anInt2004 == 0) {
								break;
							}
							local40 = this.method1500(arg0, local40, local18, local44, local13.aByteArray21[this.anInt2013]);
							if (this.anInt2008 >= local18) {
								return;
							}
							this.anInt2008 = local18 + local18 - this.anInt2008 - 1;
							this.anInt2010 = -this.anInt2010;
						} while (--this.anInt2004 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2010 < 0) {
						while (true) {
							local40 = this.method1500(arg0, local40, local18, local44, local13.aByteArray21[this.anInt2011 - 1]);
							if (this.anInt2008 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2008 - 1) / local33;
							if (local416 >= this.anInt2004) {
								this.anInt2008 += local33 * this.anInt2004;
								this.anInt2004 = 0;
								break;
							}
							this.anInt2008 += local33 * local416;
							this.anInt2004 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1510(arg0, local40, local23, local44, local13.aByteArray21[this.anInt2013]);
							if (this.anInt2008 < local23) {
								return;
							}
							local416 = (this.anInt2008 - local18) / local33;
							if (local416 >= this.anInt2004) {
								this.anInt2008 -= local33 * this.anInt2004;
								this.anInt2004 = 0;
								break;
							}
							this.anInt2008 -= local33 * local416;
							this.anInt2004 -= local416;
						}
					}
				}
			}
			if (this.anInt2010 < 0) {
				this.method1500(arg0, local40, 0, local44, 0);
				if (this.anInt2008 < 0) {
					this.anInt2008 = -1;
					this.method1511();
					this.method2024();
					return;
				}
			} else {
				this.method1510(arg0, local40, local29, local44, 0);
				if (this.anInt2008 >= local29) {
					this.anInt2008 = local29;
					this.method1511();
					this.method2024();
				}
			}
		} else if (this.aBoolean97) {
			if (this.anInt2010 < 0) {
				local40 = this.method1500(arg0, arg1, local18, local44, local13.aByteArray21[this.anInt2013]);
				if (this.anInt2008 >= local18) {
					return;
				}
				this.anInt2008 = local18 + local18 - this.anInt2008 - 1;
				this.anInt2010 = -this.anInt2010;
			}
			while (true) {
				local40 = this.method1510(arg0, local40, local23, local44, local13.aByteArray21[this.anInt2011 - 1]);
				if (this.anInt2008 < local23) {
					return;
				}
				this.anInt2008 = local23 + local23 - this.anInt2008 - 1;
				this.anInt2010 = -this.anInt2010;
				local40 = this.method1500(arg0, local40, local18, local44, local13.aByteArray21[this.anInt2013]);
				if (this.anInt2008 >= local18) {
					return;
				}
				this.anInt2008 = local18 + local18 - this.anInt2008 - 1;
				this.anInt2010 = -this.anInt2010;
			}
		} else if (this.anInt2010 < 0) {
			while (true) {
				local40 = this.method1500(arg0, local40, local18, local44, local13.aByteArray21[this.anInt2011 - 1]);
				if (this.anInt2008 >= local18) {
					return;
				}
				this.anInt2008 = local23 - (local23 - 1 - this.anInt2008) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1510(arg0, local40, local23, local44, local13.aByteArray21[this.anInt2013]);
				if (this.anInt2008 < local23) {
					return;
				}
				this.anInt2008 = local18 + (this.anInt2008 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()I")
	@Override
	public int method2029() {
		return this.anInt2001 == 0 && this.anInt2007 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)V")
	private synchronized void method1488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2001 = arg0;
		this.anInt2005 = arg1;
		this.anInt2007 = 0;
		this.method1512();
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "()I")
	public synchronized int method1491() {
		return this.anInt2001 == Integer.MIN_VALUE ? 0 : this.anInt2001;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public synchronized void method1494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1488(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static135.method1481(arg1, arg2);
		@Pc(14) int local14 = Static135.method1501(arg1, arg2);
		if (this.anInt2012 == local10 && this.anInt2014 == local14) {
			this.anInt2007 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2009;
		if (this.anInt2009 - arg1 > local31) {
			local31 = this.anInt2009 - arg1;
		}
		if (local10 - this.anInt2012 > local31) {
			local31 = local10 - this.anInt2012;
		}
		if (this.anInt2012 - local10 > local31) {
			local31 = this.anInt2012 - local10;
		}
		if (local14 - this.anInt2014 > local31) {
			local31 = local14 - this.anInt2014;
		}
		if (this.anInt2014 - local14 > local31) {
			local31 = this.anInt2014 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2007 = arg0;
		this.anInt2001 = arg1;
		this.anInt2005 = arg2;
		this.anInt2006 = (arg1 - this.anInt2009) / arg0;
		this.anInt2002 = (local10 - this.anInt2012) / arg0;
		this.anInt2003 = (local14 - this.anInt2014) / arg0;
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "()Z")
	public boolean method1496() {
		return this.anInt2008 < 0 || this.anInt2008 >= ((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21.length << 8;
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "()Z")
	public boolean method1498() {
		return this.anInt2007 != 0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([IIIII)I")
	private int method1500(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2007 <= 0) {
				if (this.anInt2010 == -256 && (this.anInt2008 & 0xFF) == 0) {
					if (Static10.aBoolean6) {
						return Static135.method1508(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2012, this.anInt2014, arg3, arg2, this);
					}
					return Static135.method1505(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2009, arg3, arg2, this);
				}
				if (Static10.aBoolean6) {
					return Static135.method1493(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2012, this.anInt2014, arg3, arg2, this, this.anInt2010, arg4);
				}
				return Static135.method1495(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2009, arg3, arg2, this, this.anInt2010, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2007;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2007 += arg1;
			if (this.anInt2010 == -256 && (this.anInt2008 & 0xFF) == 0) {
				if (Static10.aBoolean6) {
					arg1 = Static135.method1490(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2012, this.anInt2014, this.anInt2002, this.anInt2003, local5, arg2, this);
				} else {
					arg1 = Static135.method1473(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2009, this.anInt2006, local5, arg2, this);
				}
			} else if (Static10.aBoolean6) {
				arg1 = Static135.method1476(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2012, this.anInt2014, this.anInt2002, this.anInt2003, local5, arg2, this, this.anInt2010, arg4);
			} else {
				arg1 = Static135.method1497(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2009, this.anInt2006, local5, arg2, this, this.anInt2010, arg4);
			}
			this.anInt2007 -= arg1;
			if (this.anInt2007 != 0) {
				return arg1;
			}
		} while (!this.method1506());
		return arg3;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2028(@OriginalArg(0) int arg0) {
		if (this.anInt2007 > 0) {
			if (arg0 >= this.anInt2007) {
				if (this.anInt2001 == Integer.MIN_VALUE) {
					this.anInt2001 = 0;
					this.anInt2009 = this.anInt2012 = this.anInt2014 = 0;
					this.method2024();
					arg0 = this.anInt2007;
				}
				this.anInt2007 = 0;
				this.method1512();
			} else {
				this.anInt2009 += this.anInt2006 * arg0;
				this.anInt2012 += this.anInt2002 * arg0;
				this.anInt2014 += this.anInt2003 * arg0;
				this.anInt2007 -= arg0;
			}
		}
		@Pc(71) Class1_Sub14_Sub1 local71 = (Class1_Sub14_Sub1) super.aClass1_Sub14_5;
		@Pc(76) int local76 = this.anInt2013 << 8;
		@Pc(81) int local81 = this.anInt2011 << 8;
		@Pc(87) int local87 = local71.aByteArray21.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2004 = 0;
		}
		if (this.anInt2008 < 0) {
			if (this.anInt2010 <= 0) {
				this.method1511();
				this.method2024();
				return;
			}
			this.anInt2008 = 0;
		}
		if (this.anInt2008 >= local87) {
			if (this.anInt2010 >= 0) {
				this.method1511();
				this.method2024();
				return;
			}
			this.anInt2008 = local87 - 1;
		}
		this.anInt2008 += this.anInt2010 * arg0;
		if (this.anInt2004 >= 0) {
			if (this.anInt2004 > 0) {
				if (this.aBoolean97) {
					label125: {
						if (this.anInt2010 < 0) {
							if (this.anInt2008 >= local76) {
								return;
							}
							this.anInt2008 = local76 + local76 - this.anInt2008 - 1;
							this.anInt2010 = -this.anInt2010;
							if (--this.anInt2004 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2008 < local81) {
								return;
							}
							this.anInt2008 = local81 + local81 - this.anInt2008 - 1;
							this.anInt2010 = -this.anInt2010;
							if (--this.anInt2004 == 0) {
								break;
							}
							if (this.anInt2008 >= local76) {
								return;
							}
							this.anInt2008 = local76 + local76 - this.anInt2008 - 1;
							this.anInt2010 = -this.anInt2010;
						} while (--this.anInt2004 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2010 < 0) {
						if (this.anInt2008 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2008 - 1) / local91;
						if (local361 < this.anInt2004) {
							this.anInt2008 += local91 * local361;
							this.anInt2004 -= local361;
							return;
						}
						this.anInt2008 += local91 * this.anInt2004;
						this.anInt2004 = 0;
					} else if (this.anInt2008 >= local81) {
						local361 = (this.anInt2008 - local76) / local91;
						if (local361 < this.anInt2004) {
							this.anInt2008 -= local91 * local361;
							this.anInt2004 -= local361;
							return;
						}
						this.anInt2008 -= local91 * this.anInt2004;
						this.anInt2004 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2010 < 0) {
				if (this.anInt2008 < 0) {
					this.anInt2008 = -1;
					this.method1511();
					this.method2024();
					return;
				}
			} else if (this.anInt2008 >= local87) {
				this.anInt2008 = local87;
				this.method1511();
				this.method2024();
			}
		} else if (this.aBoolean97) {
			if (this.anInt2010 < 0) {
				if (this.anInt2008 >= local76) {
					return;
				}
				this.anInt2008 = local76 + local76 - this.anInt2008 - 1;
				this.anInt2010 = -this.anInt2010;
			}
			while (this.anInt2008 >= local81) {
				this.anInt2008 = local81 + local81 - this.anInt2008 - 1;
				this.anInt2010 = -this.anInt2010;
				if (this.anInt2008 >= local76) {
					return;
				}
				this.anInt2008 = local76 + local76 - this.anInt2008 - 1;
				this.anInt2010 = -this.anInt2010;
			}
		} else if (this.anInt2010 < 0) {
			if (this.anInt2008 < local76) {
				this.anInt2008 = local81 - (local81 - 1 - this.anInt2008) % local91 - 1;
			}
		} else if (this.anInt2008 >= local81) {
			this.anInt2008 = local76 + (this.anInt2008 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "()I")
	@Override
	public int method2027() {
		@Pc(6) int local6 = this.anInt2009 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2004 == 0) {
			local6 -= local6 * this.anInt2008 / (((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21.length << 8);
		} else if (this.anInt2004 >= 0) {
			local6 -= local6 * this.anInt2013 / ((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	public synchronized void method1503() {
		this.anInt2010 = (this.anInt2010 ^ this.anInt2010 >> 31) + (this.anInt2010 >>> 31);
		this.anInt2010 = -this.anInt2010;
	}

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "()Z")
	private boolean method1506() {
		@Pc(2) int local2 = this.anInt2001;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static135.method1481(local2, this.anInt2005);
			local8 = Static135.method1501(local2, this.anInt2005);
		}
		if (this.anInt2009 != local2 || this.anInt2012 != local10 || this.anInt2014 != local8) {
			if (this.anInt2009 < local2) {
				this.anInt2006 = 1;
				this.anInt2007 = local2 - this.anInt2009;
			} else if (this.anInt2009 > local2) {
				this.anInt2006 = -1;
				this.anInt2007 = this.anInt2009 - local2;
			} else {
				this.anInt2006 = 0;
			}
			if (this.anInt2012 < local10) {
				this.anInt2002 = 1;
				if (this.anInt2007 == 0 || this.anInt2007 > local10 - this.anInt2012) {
					this.anInt2007 = local10 - this.anInt2012;
				}
			} else if (this.anInt2012 > local10) {
				this.anInt2002 = -1;
				if (this.anInt2007 == 0 || this.anInt2007 > this.anInt2012 - local10) {
					this.anInt2007 = this.anInt2012 - local10;
				}
			} else {
				this.anInt2002 = 0;
			}
			if (this.anInt2014 < local8) {
				this.anInt2003 = 1;
				if (this.anInt2007 == 0 || this.anInt2007 > local8 - this.anInt2014) {
					this.anInt2007 = local8 - this.anInt2014;
				}
			} else if (this.anInt2014 > local8) {
				this.anInt2003 = -1;
				if (this.anInt2007 == 0 || this.anInt2007 > this.anInt2014 - local8) {
					this.anInt2007 = this.anInt2014 - local8;
				}
			} else {
				this.anInt2003 = 0;
			}
			return false;
		} else if (this.anInt2001 == Integer.MIN_VALUE) {
			this.anInt2001 = 0;
			this.anInt2009 = this.anInt2012 = this.anInt2014 = 0;
			this.method2024();
			return true;
		} else {
			this.method1512();
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)V")
	public synchronized void method1507(@OriginalArg(0) int arg0) {
		if (this.anInt2010 < 0) {
			this.anInt2010 = -arg0;
		} else {
			this.anInt2010 = arg0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "([IIIII)I")
	private int method1510(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2007 <= 0) {
				if (this.anInt2010 == 256 && (this.anInt2008 & 0xFF) == 0) {
					if (Static10.aBoolean6) {
						return Static135.method1475(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2012, this.anInt2014, arg3, arg2, this);
					}
					return Static135.method1502(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2009, arg3, arg2, this);
				}
				if (Static10.aBoolean6) {
					return Static135.method1477(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2012, this.anInt2014, arg3, arg2, this, this.anInt2010, arg4);
				}
				return Static135.method1509(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2009, arg3, arg2, this, this.anInt2010, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2007;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2007 += arg1;
			if (this.anInt2010 == 256 && (this.anInt2008 & 0xFF) == 0) {
				if (Static10.aBoolean6) {
					arg1 = Static135.method1499(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2012, this.anInt2014, this.anInt2002, this.anInt2003, local5, arg2, this);
				} else {
					arg1 = Static135.method1489(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2009, this.anInt2006, local5, arg2, this);
				}
			} else if (Static10.aBoolean6) {
				arg1 = Static135.method1484(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2012, this.anInt2014, this.anInt2002, this.anInt2003, local5, arg2, this, this.anInt2010, arg4);
			} else {
				arg1 = Static135.method1492(((Class1_Sub14_Sub1) super.aClass1_Sub14_5).aByteArray21, arg0, this.anInt2008, arg1, this.anInt2009, this.anInt2006, local5, arg2, this, this.anInt2010, arg4);
			}
			this.anInt2007 -= arg1;
			if (this.anInt2007 != 0) {
				return arg1;
			}
		} while (!this.method1506());
		return arg3;
	}

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "()V")
	private void method1511() {
		if (this.anInt2007 == 0) {
			return;
		}
		if (this.anInt2001 == Integer.MIN_VALUE) {
			this.anInt2001 = 0;
		}
		this.anInt2007 = 0;
		this.method1512();
	}

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "()V")
	private void method1512() {
		this.anInt2009 = this.anInt2001;
		this.anInt2012 = Static135.method1481(this.anInt2001, this.anInt2005);
		this.anInt2014 = Static135.method1501(this.anInt2001, this.anInt2005);
	}
}
