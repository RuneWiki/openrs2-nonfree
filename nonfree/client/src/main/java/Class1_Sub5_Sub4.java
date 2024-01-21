import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class1_Sub5_Sub4 extends Class1_Sub5 {

	@OriginalMember(owner = "client!id", name = "t", descriptor = "I")
	public int anInt2003;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	public int anInt2005;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "I")
	public int anInt2009;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	public int anInt2010;

	@OriginalMember(owner = "client!id", name = "C", descriptor = "I")
	public int anInt2011;

	@OriginalMember(owner = "client!id", name = "D", descriptor = "I")
	public int anInt2012;

	@OriginalMember(owner = "client!id", name = "E", descriptor = "I")
	private int anInt2013;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "I")
	private int anInt2014;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "I")
	private final int anInt2008;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "I")
	private final int anInt2015;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Z")
	private final boolean aBoolean80;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "I")
	private int anInt2007;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "I")
	private int anInt2004;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	private int anInt2006;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	public int anInt2002;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class1_Sub5_Sub4(@OriginalArg(0) Class1_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub13_5 = arg0;
		this.anInt2008 = arg0.anInt2079;
		this.anInt2015 = arg0.anInt2080;
		this.aBoolean80 = arg0.aBoolean81;
		this.anInt2007 = arg1;
		this.anInt2004 = arg2;
		this.anInt2006 = 8192;
		this.anInt2002 = 0;
		this.method1354();
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!ih;III)V")
	public Class1_Sub5_Sub4(@OriginalArg(0) Class1_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub13_5 = arg0;
		this.anInt2008 = arg0.anInt2079;
		this.anInt2015 = arg0.anInt2080;
		this.aBoolean80 = arg0.aBoolean81;
		this.anInt2007 = arg1;
		this.anInt2004 = arg2;
		this.anInt2006 = arg3;
		this.anInt2002 = 0;
		this.method1354();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()I")
	@Override
	public int method1312() {
		return this.anInt2004 == 0 && this.anInt2013 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([IIIII)I")
	private int method1322(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2013 <= 0) {
				if (this.anInt2007 == 256 && (this.anInt2002 & 0xFF) == 0) {
					if (Static71.aBoolean84) {
						return Static183.method1343(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2009, this.anInt2012, arg3, arg2, this);
					}
					return Static183.method1321(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2011, arg3, arg2, this);
				}
				if (Static71.aBoolean84) {
					return Static183.method1325(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2009, this.anInt2012, arg3, arg2, this, this.anInt2007, arg4);
				}
				return Static183.method1349(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2011, arg3, arg2, this, this.anInt2007, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2013;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2013 += arg1;
			if (this.anInt2007 == 256 && (this.anInt2002 & 0xFF) == 0) {
				if (Static71.aBoolean84) {
					arg1 = Static183.method1332(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2009, this.anInt2012, this.anInt2003, this.anInt2010, local5, arg2, this);
				} else {
					arg1 = Static183.method1346(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2011, this.anInt2005, local5, arg2, this);
				}
			} else if (Static71.aBoolean84) {
				arg1 = Static183.method1323(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2009, this.anInt2012, this.anInt2003, this.anInt2010, local5, arg2, this, this.anInt2007, arg4);
			} else {
				arg1 = Static183.method1351(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2011, this.anInt2005, local5, arg2, this, this.anInt2007, arg4);
			}
			this.anInt2013 -= arg1;
			if (this.anInt2013 != 0) {
				return arg1;
			}
		} while (!this.method1327());
		return arg3;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public synchronized void method1324(@OriginalArg(0) int arg0) {
		if (this.anInt2007 < 0) {
			this.anInt2007 = -arg0;
		} else {
			this.anInt2007 = arg0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	private synchronized void method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2004 = arg0;
		this.anInt2006 = arg1;
		this.anInt2013 = 0;
		this.method1354();
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "()Z")
	private boolean method1327() {
		@Pc(2) int local2 = this.anInt2004;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static183.method1339(local2, this.anInt2006);
			local8 = Static183.method1330(local2, this.anInt2006);
		}
		if (this.anInt2011 != local2 || this.anInt2009 != local10 || this.anInt2012 != local8) {
			if (this.anInt2011 < local2) {
				this.anInt2005 = 1;
				this.anInt2013 = local2 - this.anInt2011;
			} else if (this.anInt2011 > local2) {
				this.anInt2005 = -1;
				this.anInt2013 = this.anInt2011 - local2;
			} else {
				this.anInt2005 = 0;
			}
			if (this.anInt2009 < local10) {
				this.anInt2003 = 1;
				if (this.anInt2013 == 0 || this.anInt2013 > local10 - this.anInt2009) {
					this.anInt2013 = local10 - this.anInt2009;
				}
			} else if (this.anInt2009 > local10) {
				this.anInt2003 = -1;
				if (this.anInt2013 == 0 || this.anInt2013 > this.anInt2009 - local10) {
					this.anInt2013 = this.anInt2009 - local10;
				}
			} else {
				this.anInt2003 = 0;
			}
			if (this.anInt2012 < local8) {
				this.anInt2010 = 1;
				if (this.anInt2013 == 0 || this.anInt2013 > local8 - this.anInt2012) {
					this.anInt2013 = local8 - this.anInt2012;
				}
			} else if (this.anInt2012 > local8) {
				this.anInt2010 = -1;
				if (this.anInt2013 == 0 || this.anInt2013 > this.anInt2012 - local8) {
					this.anInt2013 = this.anInt2012 - local8;
				}
			} else {
				this.anInt2010 = 0;
			}
			return false;
		} else if (this.anInt2004 == Integer.MIN_VALUE) {
			this.anInt2004 = 0;
			this.anInt2011 = this.anInt2009 = this.anInt2012 = 0;
			this.method3198();
			return true;
		} else {
			this.method1354();
			return false;
		}
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
	public synchronized void method1328(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1342();
			this.method3198();
		} else if (this.anInt2009 == 0 && this.anInt2012 == 0) {
			this.anInt2013 = 0;
			this.anInt2004 = 0;
			this.anInt2011 = 0;
			this.method3198();
		} else {
			@Pc(31) int local31 = -this.anInt2011;
			if (this.anInt2011 > local31) {
				local31 = this.anInt2011;
			}
			if (-this.anInt2009 > local31) {
				local31 = -this.anInt2009;
			}
			if (this.anInt2009 > local31) {
				local31 = this.anInt2009;
			}
			if (-this.anInt2012 > local31) {
				local31 = -this.anInt2012;
			}
			if (this.anInt2012 > local31) {
				local31 = this.anInt2012;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2013 = arg0;
			this.anInt2004 = Integer.MIN_VALUE;
			this.anInt2005 = -this.anInt2011 / arg0;
			this.anInt2003 = -this.anInt2009 / arg0;
			this.anInt2010 = -this.anInt2012 / arg0;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
	public synchronized void method1329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1341(arg0, arg1, this.method1353());
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()Lclient!bc;")
	@Override
	public Class1_Sub5 method1318() {
		return null;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1316(@OriginalArg(0) int arg0) {
		if (this.anInt2013 > 0) {
			if (arg0 >= this.anInt2013) {
				if (this.anInt2004 == Integer.MIN_VALUE) {
					this.anInt2004 = 0;
					this.anInt2011 = this.anInt2009 = this.anInt2012 = 0;
					this.method3198();
					arg0 = this.anInt2013;
				}
				this.anInt2013 = 0;
				this.method1354();
			} else {
				this.anInt2011 += this.anInt2005 * arg0;
				this.anInt2009 += this.anInt2003 * arg0;
				this.anInt2012 += this.anInt2010 * arg0;
				this.anInt2013 -= arg0;
			}
		}
		@Pc(71) Class1_Sub13_Sub1 local71 = (Class1_Sub13_Sub1) super.aClass1_Sub13_5;
		@Pc(76) int local76 = this.anInt2008 << 8;
		@Pc(81) int local81 = this.anInt2015 << 8;
		@Pc(87) int local87 = local71.aByteArray17.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2014 = 0;
		}
		if (this.anInt2002 < 0) {
			if (this.anInt2007 <= 0) {
				this.method1340();
				this.method3198();
				return;
			}
			this.anInt2002 = 0;
		}
		if (this.anInt2002 >= local87) {
			if (this.anInt2007 >= 0) {
				this.method1340();
				this.method3198();
				return;
			}
			this.anInt2002 = local87 - 1;
		}
		this.anInt2002 += this.anInt2007 * arg0;
		if (this.anInt2014 >= 0) {
			if (this.anInt2014 > 0) {
				if (this.aBoolean80) {
					label125: {
						if (this.anInt2007 < 0) {
							if (this.anInt2002 >= local76) {
								return;
							}
							this.anInt2002 = local76 + local76 - this.anInt2002 - 1;
							this.anInt2007 = -this.anInt2007;
							if (--this.anInt2014 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2002 < local81) {
								return;
							}
							this.anInt2002 = local81 + local81 - this.anInt2002 - 1;
							this.anInt2007 = -this.anInt2007;
							if (--this.anInt2014 == 0) {
								break;
							}
							if (this.anInt2002 >= local76) {
								return;
							}
							this.anInt2002 = local76 + local76 - this.anInt2002 - 1;
							this.anInt2007 = -this.anInt2007;
						} while (--this.anInt2014 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2007 < 0) {
						if (this.anInt2002 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2002 - 1) / local91;
						if (local361 < this.anInt2014) {
							this.anInt2002 += local91 * local361;
							this.anInt2014 -= local361;
							return;
						}
						this.anInt2002 += local91 * this.anInt2014;
						this.anInt2014 = 0;
					} else if (this.anInt2002 >= local81) {
						local361 = (this.anInt2002 - local76) / local91;
						if (local361 < this.anInt2014) {
							this.anInt2002 -= local91 * local361;
							this.anInt2014 -= local361;
							return;
						}
						this.anInt2002 -= local91 * this.anInt2014;
						this.anInt2014 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2007 < 0) {
				if (this.anInt2002 < 0) {
					this.anInt2002 = -1;
					this.method1340();
					this.method3198();
					return;
				}
			} else if (this.anInt2002 >= local87) {
				this.anInt2002 = local87;
				this.method1340();
				this.method3198();
			}
		} else if (this.aBoolean80) {
			if (this.anInt2007 < 0) {
				if (this.anInt2002 >= local76) {
					return;
				}
				this.anInt2002 = local76 + local76 - this.anInt2002 - 1;
				this.anInt2007 = -this.anInt2007;
			}
			while (this.anInt2002 >= local81) {
				this.anInt2002 = local81 + local81 - this.anInt2002 - 1;
				this.anInt2007 = -this.anInt2007;
				if (this.anInt2002 >= local76) {
					return;
				}
				this.anInt2002 = local76 + local76 - this.anInt2002 - 1;
				this.anInt2007 = -this.anInt2007;
			}
		} else if (this.anInt2007 < 0) {
			if (this.anInt2002 < local76) {
				this.anInt2002 = local81 - (local81 - 1 - this.anInt2002) % local91 - 1;
			}
		} else if (this.anInt2002 >= local81) {
			this.anInt2002 = local76 + (this.anInt2002 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "()Z")
	public boolean method1334() {
		return this.anInt2013 != 0;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(Z)V")
	public synchronized void method1335() {
		this.anInt2007 = (this.anInt2007 ^ this.anInt2007 >> 31) + (this.anInt2007 >>> 31);
		this.anInt2007 = -this.anInt2007;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
	public synchronized void method1337(@OriginalArg(0) int arg0) {
		this.method1326(arg0 << 6, this.method1353());
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
	public synchronized void method1338(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2002 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "()V")
	private void method1340() {
		if (this.anInt2013 == 0) {
			return;
		}
		if (this.anInt2004 == Integer.MIN_VALUE) {
			this.anInt2004 = 0;
		}
		this.anInt2013 = 0;
		this.method1354();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	public synchronized void method1341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1326(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static183.method1339(arg1, arg2);
		@Pc(14) int local14 = Static183.method1330(arg1, arg2);
		if (this.anInt2009 == local10 && this.anInt2012 == local14) {
			this.anInt2013 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2011;
		if (this.anInt2011 - arg1 > local31) {
			local31 = this.anInt2011 - arg1;
		}
		if (local10 - this.anInt2009 > local31) {
			local31 = local10 - this.anInt2009;
		}
		if (this.anInt2009 - local10 > local31) {
			local31 = this.anInt2009 - local10;
		}
		if (local14 - this.anInt2012 > local31) {
			local31 = local14 - this.anInt2012;
		}
		if (this.anInt2012 - local14 > local31) {
			local31 = this.anInt2012 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2013 = arg0;
		this.anInt2004 = arg1;
		this.anInt2006 = arg2;
		this.anInt2005 = (arg1 - this.anInt2011) / arg0;
		this.anInt2003 = (local10 - this.anInt2009) / arg0;
		this.anInt2010 = (local14 - this.anInt2012) / arg0;
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(I)V")
	private synchronized void method1342() {
		this.method1326(0, this.method1353());
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1313(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2004 == 0 && this.anInt2013 == 0) {
			this.method1316(arg2);
			return;
		}
		@Pc(13) Class1_Sub13_Sub1 local13 = (Class1_Sub13_Sub1) super.aClass1_Sub13_5;
		@Pc(18) int local18 = this.anInt2008 << 8;
		@Pc(23) int local23 = this.anInt2015 << 8;
		@Pc(29) int local29 = local13.aByteArray17.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2014 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2002 < 0) {
			if (this.anInt2007 <= 0) {
				this.method1340();
				this.method3198();
				return;
			}
			this.anInt2002 = 0;
		}
		if (this.anInt2002 >= local29) {
			if (this.anInt2007 >= 0) {
				this.method1340();
				this.method3198();
				return;
			}
			this.anInt2002 = local29 - 1;
		}
		if (this.anInt2014 >= 0) {
			if (this.anInt2014 > 0) {
				if (this.aBoolean80) {
					label130: {
						if (this.anInt2007 < 0) {
							local40 = this.method1355(arg0, arg1, local18, local44, local13.aByteArray17[this.anInt2008]);
							if (this.anInt2002 >= local18) {
								return;
							}
							this.anInt2002 = local18 + local18 - this.anInt2002 - 1;
							this.anInt2007 = -this.anInt2007;
							if (--this.anInt2014 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1322(arg0, local40, local23, local44, local13.aByteArray17[this.anInt2015 - 1]);
							if (this.anInt2002 < local23) {
								return;
							}
							this.anInt2002 = local23 + local23 - this.anInt2002 - 1;
							this.anInt2007 = -this.anInt2007;
							if (--this.anInt2014 == 0) {
								break;
							}
							local40 = this.method1355(arg0, local40, local18, local44, local13.aByteArray17[this.anInt2008]);
							if (this.anInt2002 >= local18) {
								return;
							}
							this.anInt2002 = local18 + local18 - this.anInt2002 - 1;
							this.anInt2007 = -this.anInt2007;
						} while (--this.anInt2014 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2007 < 0) {
						while (true) {
							local40 = this.method1355(arg0, local40, local18, local44, local13.aByteArray17[this.anInt2015 - 1]);
							if (this.anInt2002 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2002 - 1) / local33;
							if (local416 >= this.anInt2014) {
								this.anInt2002 += local33 * this.anInt2014;
								this.anInt2014 = 0;
								break;
							}
							this.anInt2002 += local33 * local416;
							this.anInt2014 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1322(arg0, local40, local23, local44, local13.aByteArray17[this.anInt2008]);
							if (this.anInt2002 < local23) {
								return;
							}
							local416 = (this.anInt2002 - local18) / local33;
							if (local416 >= this.anInt2014) {
								this.anInt2002 -= local33 * this.anInt2014;
								this.anInt2014 = 0;
								break;
							}
							this.anInt2002 -= local33 * local416;
							this.anInt2014 -= local416;
						}
					}
				}
			}
			if (this.anInt2007 < 0) {
				this.method1355(arg0, local40, 0, local44, 0);
				if (this.anInt2002 < 0) {
					this.anInt2002 = -1;
					this.method1340();
					this.method3198();
					return;
				}
			} else {
				this.method1322(arg0, local40, local29, local44, 0);
				if (this.anInt2002 >= local29) {
					this.anInt2002 = local29;
					this.method1340();
					this.method3198();
				}
			}
		} else if (this.aBoolean80) {
			if (this.anInt2007 < 0) {
				local40 = this.method1355(arg0, arg1, local18, local44, local13.aByteArray17[this.anInt2008]);
				if (this.anInt2002 >= local18) {
					return;
				}
				this.anInt2002 = local18 + local18 - this.anInt2002 - 1;
				this.anInt2007 = -this.anInt2007;
			}
			while (true) {
				local40 = this.method1322(arg0, local40, local23, local44, local13.aByteArray17[this.anInt2015 - 1]);
				if (this.anInt2002 < local23) {
					return;
				}
				this.anInt2002 = local23 + local23 - this.anInt2002 - 1;
				this.anInt2007 = -this.anInt2007;
				local40 = this.method1355(arg0, local40, local18, local44, local13.aByteArray17[this.anInt2008]);
				if (this.anInt2002 >= local18) {
					return;
				}
				this.anInt2002 = local18 + local18 - this.anInt2002 - 1;
				this.anInt2007 = -this.anInt2007;
			}
		} else if (this.anInt2007 < 0) {
			while (true) {
				local40 = this.method1355(arg0, local40, local18, local44, local13.aByteArray17[this.anInt2015 - 1]);
				if (this.anInt2002 >= local18) {
					return;
				}
				this.anInt2002 = local23 - (local23 - 1 - this.anInt2002) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1322(arg0, local40, local23, local44, local13.aByteArray17[this.anInt2008]);
				if (this.anInt2002 < local23) {
					return;
				}
				this.anInt2002 = local18 + (this.anInt2002 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "()I")
	public synchronized int method1345() {
		return this.anInt2004 == Integer.MIN_VALUE ? 0 : this.anInt2004;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()I")
	@Override
	public int method1317() {
		@Pc(6) int local6 = this.anInt2011 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2014 == 0) {
			local6 -= local6 * this.anInt2002 / (((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17.length << 8);
		} else if (this.anInt2014 >= 0) {
			local6 -= local6 * this.anInt2008 / ((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!id", name = "i", descriptor = "()I")
	public synchronized int method1348() {
		return this.anInt2007 < 0 ? -this.anInt2007 : this.anInt2007;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()Lclient!bc;")
	@Override
	public Class1_Sub5 method1314() {
		return null;
	}

	@OriginalMember(owner = "client!id", name = "j", descriptor = "()I")
	public synchronized int method1353() {
		return this.anInt2006 < 0 ? -1 : this.anInt2006;
	}

	@OriginalMember(owner = "client!id", name = "k", descriptor = "()V")
	private void method1354() {
		this.anInt2011 = this.anInt2004;
		this.anInt2009 = Static183.method1339(this.anInt2004, this.anInt2006);
		this.anInt2012 = Static183.method1330(this.anInt2004, this.anInt2006);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "([IIIII)I")
	private int method1355(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2013 <= 0) {
				if (this.anInt2007 == -256 && (this.anInt2002 & 0xFF) == 0) {
					if (Static71.aBoolean84) {
						return Static183.method1347(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2009, this.anInt2012, arg3, arg2, this);
					}
					return Static183.method1352(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2011, arg3, arg2, this);
				}
				if (Static71.aBoolean84) {
					return Static183.method1336(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2009, this.anInt2012, arg3, arg2, this, this.anInt2007, arg4);
				}
				return Static183.method1344(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2011, arg3, arg2, this, this.anInt2007, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2013;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2013 += arg1;
			if (this.anInt2007 == -256 && (this.anInt2002 & 0xFF) == 0) {
				if (Static71.aBoolean84) {
					arg1 = Static183.method1331(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2009, this.anInt2012, this.anInt2003, this.anInt2010, local5, arg2, this);
				} else {
					arg1 = Static183.method1333(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2011, this.anInt2005, local5, arg2, this);
				}
			} else if (Static71.aBoolean84) {
				arg1 = Static183.method1350(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2009, this.anInt2012, this.anInt2003, this.anInt2010, local5, arg2, this, this.anInt2007, arg4);
			} else {
				arg1 = Static183.method1358(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17, arg0, this.anInt2002, arg1, this.anInt2011, this.anInt2005, local5, arg2, this, this.anInt2007, arg4);
			}
			this.anInt2013 -= arg1;
			if (this.anInt2013 != 0) {
				return arg1;
			}
		} while (!this.method1327());
		return arg3;
	}

	@OriginalMember(owner = "client!id", name = "l", descriptor = "()Z")
	public boolean method1356() {
		return this.anInt2002 < 0 || this.anInt2002 >= ((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray17.length << 8;
	}

	@OriginalMember(owner = "client!id", name = "i", descriptor = "(I)V")
	public synchronized void method1357(@OriginalArg(0) int arg0) {
		this.anInt2014 = arg0;
	}
}
