import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class4_Sub4_Sub3 extends Class4_Sub4 {

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	public int anInt1980;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "I")
	public int anInt1981;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "I")
	private int anInt1983;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "I")
	public int anInt1986;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "I")
	public int anInt1987;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "I")
	public int anInt1989;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "I")
	public int anInt1991;

	@OriginalMember(owner = "client!n", name = "I", descriptor = "I")
	private int anInt1992;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "I")
	private final int anInt1990;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "I")
	private final int anInt1984;

	@OriginalMember(owner = "client!n", name = "F", descriptor = "Z")
	private final boolean aBoolean170;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	private int anInt1985;

	@OriginalMember(owner = "client!n", name = "D", descriptor = "I")
	private int anInt1988;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "I")
	private int anInt1982;

	@OriginalMember(owner = "client!n", name = "J", descriptor = "I")
	public int anInt1993;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!ib;II)V")
	public Class4_Sub4_Sub3(@OriginalArg(0) Class4_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub13_5 = arg0;
		this.anInt1990 = arg0.anInt1365;
		this.anInt1984 = arg0.anInt1366;
		this.aBoolean170 = arg0.aBoolean132;
		this.anInt1985 = arg1;
		this.anInt1988 = arg2;
		this.anInt1982 = 8192;
		this.anInt1993 = 0;
		this.method1262();
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!ib;III)V")
	public Class4_Sub4_Sub3(@OriginalArg(0) Class4_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub13_5 = arg0;
		this.anInt1990 = arg0.anInt1365;
		this.anInt1984 = arg0.anInt1366;
		this.aBoolean170 = arg0.aBoolean132;
		this.anInt1985 = arg1;
		this.anInt1988 = arg2;
		this.anInt1982 = arg3;
		this.anInt1993 = 0;
		this.method1262();
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
	public synchronized void method1226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1257(arg0, arg1, this.method1245());
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
	public synchronized void method1227(@OriginalArg(0) int arg0) {
		if (this.anInt1985 < 0) {
			this.anInt1985 = -arg0;
		} else {
			this.anInt1985 = arg0;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()Lclient!fd;")
	@Override
	public Class4_Sub4 method1638() {
		return null;
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
	public synchronized void method1230(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1241();
			this.method1999();
		} else if (this.anInt1987 == 0 && this.anInt1991 == 0) {
			this.anInt1992 = 0;
			this.anInt1988 = 0;
			this.anInt1986 = 0;
			this.method1999();
		} else {
			@Pc(31) int local31 = -this.anInt1986;
			if (this.anInt1986 > local31) {
				local31 = this.anInt1986;
			}
			if (-this.anInt1987 > local31) {
				local31 = -this.anInt1987;
			}
			if (this.anInt1987 > local31) {
				local31 = this.anInt1987;
			}
			if (-this.anInt1991 > local31) {
				local31 = -this.anInt1991;
			}
			if (this.anInt1991 > local31) {
				local31 = this.anInt1991;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1992 = arg0;
			this.anInt1988 = Integer.MIN_VALUE;
			this.anInt1981 = -this.anInt1986 / arg0;
			this.anInt1989 = -this.anInt1987 / arg0;
			this.anInt1980 = -this.anInt1991 / arg0;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "()Lclient!fd;")
	@Override
	public Class4_Sub4 method1640() {
		return null;
	}

	@OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
	public synchronized void method1232(@OriginalArg(0) int arg0) {
		this.anInt1983 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1637(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1988 == 0 && this.anInt1992 == 0) {
			this.method1639(arg2);
			return;
		}
		@Pc(13) Class4_Sub13_Sub1 local13 = (Class4_Sub13_Sub1) super.aClass4_Sub13_5;
		@Pc(18) int local18 = this.anInt1990 << 8;
		@Pc(23) int local23 = this.anInt1984 << 8;
		@Pc(29) int local29 = local13.aByteArray12.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1983 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1993 < 0) {
			if (this.anInt1985 <= 0) {
				this.method1263();
				this.method1999();
				return;
			}
			this.anInt1993 = 0;
		}
		if (this.anInt1993 >= local29) {
			if (this.anInt1985 >= 0) {
				this.method1263();
				this.method1999();
				return;
			}
			this.anInt1993 = local29 - 1;
		}
		if (this.anInt1983 >= 0) {
			if (this.anInt1983 > 0) {
				if (this.aBoolean170) {
					label130: {
						if (this.anInt1985 < 0) {
							local40 = this.method1236(arg0, arg1, local18, local44, local13.aByteArray12[this.anInt1990]);
							if (this.anInt1993 >= local18) {
								return;
							}
							this.anInt1993 = local18 + local18 - this.anInt1993 - 1;
							this.anInt1985 = -this.anInt1985;
							if (--this.anInt1983 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1252(arg0, local40, local23, local44, local13.aByteArray12[this.anInt1984 - 1]);
							if (this.anInt1993 < local23) {
								return;
							}
							this.anInt1993 = local23 + local23 - this.anInt1993 - 1;
							this.anInt1985 = -this.anInt1985;
							if (--this.anInt1983 == 0) {
								break;
							}
							local40 = this.method1236(arg0, local40, local18, local44, local13.aByteArray12[this.anInt1990]);
							if (this.anInt1993 >= local18) {
								return;
							}
							this.anInt1993 = local18 + local18 - this.anInt1993 - 1;
							this.anInt1985 = -this.anInt1985;
						} while (--this.anInt1983 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1985 < 0) {
						while (true) {
							local40 = this.method1236(arg0, local40, local18, local44, local13.aByteArray12[this.anInt1984 - 1]);
							if (this.anInt1993 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1993 - 1) / local33;
							if (local416 >= this.anInt1983) {
								this.anInt1993 += local33 * this.anInt1983;
								this.anInt1983 = 0;
								break;
							}
							this.anInt1993 += local33 * local416;
							this.anInt1983 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1252(arg0, local40, local23, local44, local13.aByteArray12[this.anInt1990]);
							if (this.anInt1993 < local23) {
								return;
							}
							local416 = (this.anInt1993 - local18) / local33;
							if (local416 >= this.anInt1983) {
								this.anInt1993 -= local33 * this.anInt1983;
								this.anInt1983 = 0;
								break;
							}
							this.anInt1993 -= local33 * local416;
							this.anInt1983 -= local416;
						}
					}
				}
			}
			if (this.anInt1985 < 0) {
				this.method1236(arg0, local40, 0, local44, 0);
				if (this.anInt1993 < 0) {
					this.anInt1993 = -1;
					this.method1263();
					this.method1999();
					return;
				}
			} else {
				this.method1252(arg0, local40, local29, local44, 0);
				if (this.anInt1993 >= local29) {
					this.anInt1993 = local29;
					this.method1263();
					this.method1999();
				}
			}
		} else if (this.aBoolean170) {
			if (this.anInt1985 < 0) {
				local40 = this.method1236(arg0, arg1, local18, local44, local13.aByteArray12[this.anInt1990]);
				if (this.anInt1993 >= local18) {
					return;
				}
				this.anInt1993 = local18 + local18 - this.anInt1993 - 1;
				this.anInt1985 = -this.anInt1985;
			}
			while (true) {
				local40 = this.method1252(arg0, local40, local23, local44, local13.aByteArray12[this.anInt1984 - 1]);
				if (this.anInt1993 < local23) {
					return;
				}
				this.anInt1993 = local23 + local23 - this.anInt1993 - 1;
				this.anInt1985 = -this.anInt1985;
				local40 = this.method1236(arg0, local40, local18, local44, local13.aByteArray12[this.anInt1990]);
				if (this.anInt1993 >= local18) {
					return;
				}
				this.anInt1993 = local18 + local18 - this.anInt1993 - 1;
				this.anInt1985 = -this.anInt1985;
			}
		} else if (this.anInt1985 < 0) {
			while (true) {
				local40 = this.method1236(arg0, local40, local18, local44, local13.aByteArray12[this.anInt1984 - 1]);
				if (this.anInt1993 >= local18) {
					return;
				}
				this.anInt1993 = local23 - (local23 - 1 - this.anInt1993) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1252(arg0, local40, local23, local44, local13.aByteArray12[this.anInt1990]);
				if (this.anInt1993 < local23) {
					return;
				}
				this.anInt1993 = local18 + (this.anInt1993 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([IIIII)I")
	private int method1236(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1992 <= 0) {
				if (this.anInt1985 == -256 && (this.anInt1993 & 0xFF) == 0) {
					if (Static48.aBoolean123) {
						return Static140.method1231(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1987, this.anInt1991, arg3, arg2, this);
					}
					return Static140.method1244(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1986, arg3, arg2, this);
				}
				if (Static48.aBoolean123) {
					return Static140.method1235(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1987, this.anInt1991, arg3, arg2, this, this.anInt1985, arg4);
				}
				return Static140.method1261(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1986, arg3, arg2, this, this.anInt1985, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1992;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1992 += arg1;
			if (this.anInt1985 == -256 && (this.anInt1993 & 0xFF) == 0) {
				if (Static48.aBoolean123) {
					arg1 = Static140.method1255(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1987, this.anInt1991, this.anInt1989, this.anInt1980, local5, arg2, this);
				} else {
					arg1 = Static140.method1256(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1986, this.anInt1981, local5, arg2, this);
				}
			} else if (Static48.aBoolean123) {
				arg1 = Static140.method1237(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1987, this.anInt1991, this.anInt1989, this.anInt1980, local5, arg2, this, this.anInt1985, arg4);
			} else {
				arg1 = Static140.method1233(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1986, this.anInt1981, local5, arg2, this, this.anInt1985, arg4);
			}
			this.anInt1992 -= arg1;
			if (this.anInt1992 != 0) {
				return arg1;
			}
		} while (!this.method1251());
		return arg3;
	}

	@OriginalMember(owner = "client!n", name = "h", descriptor = "(I)V")
	public synchronized void method1238(@OriginalArg(0) int arg0) {
		this.method1239(arg0 << 6, this.method1245());
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V")
	private synchronized void method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1988 = arg0;
		this.anInt1982 = arg1;
		this.anInt1992 = 0;
		this.method1262();
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "()I")
	@Override
	public int method1641() {
		@Pc(6) int local6 = this.anInt1986 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1983 == 0) {
			local6 -= local6 * this.anInt1993 / (((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12.length << 8);
		} else if (this.anInt1983 >= 0) {
			local6 -= local6 * this.anInt1990 / ((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "()I")
	public synchronized int method1240() {
		return this.anInt1985 < 0 ? -this.anInt1985 : this.anInt1985;
	}

	@OriginalMember(owner = "client!n", name = "i", descriptor = "(I)V")
	private synchronized void method1241() {
		this.method1239(0, this.method1245());
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "()I")
	public synchronized int method1245() {
		return this.anInt1982 < 0 ? -1 : this.anInt1982;
	}

	@OriginalMember(owner = "client!n", name = "g", descriptor = "()Z")
	public boolean method1247() {
		return this.anInt1993 < 0 || this.anInt1993 >= ((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12.length << 8;
	}

	@OriginalMember(owner = "client!n", name = "h", descriptor = "()I")
	public synchronized int method1249() {
		return this.anInt1988 == Integer.MIN_VALUE ? 0 : this.anInt1988;
	}

	@OriginalMember(owner = "client!n", name = "j", descriptor = "(I)V")
	public synchronized void method1250(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1993 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1639(@OriginalArg(0) int arg0) {
		if (this.anInt1992 > 0) {
			if (arg0 >= this.anInt1992) {
				if (this.anInt1988 == Integer.MIN_VALUE) {
					this.anInt1988 = 0;
					this.anInt1986 = this.anInt1987 = this.anInt1991 = 0;
					this.method1999();
					arg0 = this.anInt1992;
				}
				this.anInt1992 = 0;
				this.method1262();
			} else {
				this.anInt1986 += this.anInt1981 * arg0;
				this.anInt1987 += this.anInt1989 * arg0;
				this.anInt1991 += this.anInt1980 * arg0;
				this.anInt1992 -= arg0;
			}
		}
		@Pc(71) Class4_Sub13_Sub1 local71 = (Class4_Sub13_Sub1) super.aClass4_Sub13_5;
		@Pc(76) int local76 = this.anInt1990 << 8;
		@Pc(81) int local81 = this.anInt1984 << 8;
		@Pc(87) int local87 = local71.aByteArray12.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1983 = 0;
		}
		if (this.anInt1993 < 0) {
			if (this.anInt1985 <= 0) {
				this.method1263();
				this.method1999();
				return;
			}
			this.anInt1993 = 0;
		}
		if (this.anInt1993 >= local87) {
			if (this.anInt1985 >= 0) {
				this.method1263();
				this.method1999();
				return;
			}
			this.anInt1993 = local87 - 1;
		}
		this.anInt1993 += this.anInt1985 * arg0;
		if (this.anInt1983 >= 0) {
			if (this.anInt1983 > 0) {
				if (this.aBoolean170) {
					label125: {
						if (this.anInt1985 < 0) {
							if (this.anInt1993 >= local76) {
								return;
							}
							this.anInt1993 = local76 + local76 - this.anInt1993 - 1;
							this.anInt1985 = -this.anInt1985;
							if (--this.anInt1983 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1993 < local81) {
								return;
							}
							this.anInt1993 = local81 + local81 - this.anInt1993 - 1;
							this.anInt1985 = -this.anInt1985;
							if (--this.anInt1983 == 0) {
								break;
							}
							if (this.anInt1993 >= local76) {
								return;
							}
							this.anInt1993 = local76 + local76 - this.anInt1993 - 1;
							this.anInt1985 = -this.anInt1985;
						} while (--this.anInt1983 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1985 < 0) {
						if (this.anInt1993 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1993 - 1) / local91;
						if (local361 < this.anInt1983) {
							this.anInt1993 += local91 * local361;
							this.anInt1983 -= local361;
							return;
						}
						this.anInt1993 += local91 * this.anInt1983;
						this.anInt1983 = 0;
					} else if (this.anInt1993 >= local81) {
						local361 = (this.anInt1993 - local76) / local91;
						if (local361 < this.anInt1983) {
							this.anInt1993 -= local91 * local361;
							this.anInt1983 -= local361;
							return;
						}
						this.anInt1993 -= local91 * this.anInt1983;
						this.anInt1983 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1985 < 0) {
				if (this.anInt1993 < 0) {
					this.anInt1993 = -1;
					this.method1263();
					this.method1999();
					return;
				}
			} else if (this.anInt1993 >= local87) {
				this.anInt1993 = local87;
				this.method1263();
				this.method1999();
			}
		} else if (this.aBoolean170) {
			if (this.anInt1985 < 0) {
				if (this.anInt1993 >= local76) {
					return;
				}
				this.anInt1993 = local76 + local76 - this.anInt1993 - 1;
				this.anInt1985 = -this.anInt1985;
			}
			while (this.anInt1993 >= local81) {
				this.anInt1993 = local81 + local81 - this.anInt1993 - 1;
				this.anInt1985 = -this.anInt1985;
				if (this.anInt1993 >= local76) {
					return;
				}
				this.anInt1993 = local76 + local76 - this.anInt1993 - 1;
				this.anInt1985 = -this.anInt1985;
			}
		} else if (this.anInt1985 < 0) {
			if (this.anInt1993 < local76) {
				this.anInt1993 = local81 - (local81 - 1 - this.anInt1993) % local91 - 1;
			}
		} else if (this.anInt1993 >= local81) {
			this.anInt1993 = local76 + (this.anInt1993 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!n", name = "i", descriptor = "()Z")
	private boolean method1251() {
		@Pc(2) int local2 = this.anInt1988;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static140.method1248(local2, this.anInt1982);
			local8 = Static140.method1259(local2, this.anInt1982);
		}
		if (this.anInt1986 != local2 || this.anInt1987 != local10 || this.anInt1991 != local8) {
			if (this.anInt1986 < local2) {
				this.anInt1981 = 1;
				this.anInt1992 = local2 - this.anInt1986;
			} else if (this.anInt1986 > local2) {
				this.anInt1981 = -1;
				this.anInt1992 = this.anInt1986 - local2;
			} else {
				this.anInt1981 = 0;
			}
			if (this.anInt1987 < local10) {
				this.anInt1989 = 1;
				if (this.anInt1992 == 0 || this.anInt1992 > local10 - this.anInt1987) {
					this.anInt1992 = local10 - this.anInt1987;
				}
			} else if (this.anInt1987 > local10) {
				this.anInt1989 = -1;
				if (this.anInt1992 == 0 || this.anInt1992 > this.anInt1987 - local10) {
					this.anInt1992 = this.anInt1987 - local10;
				}
			} else {
				this.anInt1989 = 0;
			}
			if (this.anInt1991 < local8) {
				this.anInt1980 = 1;
				if (this.anInt1992 == 0 || this.anInt1992 > local8 - this.anInt1991) {
					this.anInt1992 = local8 - this.anInt1991;
				}
			} else if (this.anInt1991 > local8) {
				this.anInt1980 = -1;
				if (this.anInt1992 == 0 || this.anInt1992 > this.anInt1991 - local8) {
					this.anInt1992 = this.anInt1991 - local8;
				}
			} else {
				this.anInt1980 = 0;
			}
			return false;
		} else if (this.anInt1988 == Integer.MIN_VALUE) {
			this.anInt1988 = 0;
			this.anInt1986 = this.anInt1987 = this.anInt1991 = 0;
			this.method1999();
			return true;
		} else {
			this.method1262();
			return false;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "([IIIII)I")
	private int method1252(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1992 <= 0) {
				if (this.anInt1985 == 256 && (this.anInt1993 & 0xFF) == 0) {
					if (Static48.aBoolean123) {
						return Static140.method1228(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1987, this.anInt1991, arg3, arg2, this);
					}
					return Static140.method1254(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1986, arg3, arg2, this);
				}
				if (Static48.aBoolean123) {
					return Static140.method1242(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1987, this.anInt1991, arg3, arg2, this, this.anInt1985, arg4);
				}
				return Static140.method1258(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1986, arg3, arg2, this, this.anInt1985, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1992;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1992 += arg1;
			if (this.anInt1985 == 256 && (this.anInt1993 & 0xFF) == 0) {
				if (Static48.aBoolean123) {
					arg1 = Static140.method1243(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1987, this.anInt1991, this.anInt1989, this.anInt1980, local5, arg2, this);
				} else {
					arg1 = Static140.method1246(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1986, this.anInt1981, local5, arg2, this);
				}
			} else if (Static48.aBoolean123) {
				arg1 = Static140.method1253(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1987, this.anInt1991, this.anInt1989, this.anInt1980, local5, arg2, this, this.anInt1985, arg4);
			} else {
				arg1 = Static140.method1225(((Class4_Sub13_Sub1) super.aClass4_Sub13_5).aByteArray12, arg0, this.anInt1993, arg1, this.anInt1986, this.anInt1981, local5, arg2, this, this.anInt1985, arg4);
			}
			this.anInt1992 -= arg1;
			if (this.anInt1992 != 0) {
				return arg1;
			}
		} while (!this.method1251());
		return arg3;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()I")
	@Override
	public int method1635() {
		return this.anInt1988 == 0 && this.anInt1992 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	public synchronized void method1257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1239(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static140.method1248(arg1, arg2);
		@Pc(14) int local14 = Static140.method1259(arg1, arg2);
		if (this.anInt1987 == local10 && this.anInt1991 == local14) {
			this.anInt1992 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1986;
		if (this.anInt1986 - arg1 > local31) {
			local31 = this.anInt1986 - arg1;
		}
		if (local10 - this.anInt1987 > local31) {
			local31 = local10 - this.anInt1987;
		}
		if (this.anInt1987 - local10 > local31) {
			local31 = this.anInt1987 - local10;
		}
		if (local14 - this.anInt1991 > local31) {
			local31 = local14 - this.anInt1991;
		}
		if (this.anInt1991 - local14 > local31) {
			local31 = this.anInt1991 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1992 = arg0;
		this.anInt1988 = arg1;
		this.anInt1982 = arg2;
		this.anInt1981 = (arg1 - this.anInt1986) / arg0;
		this.anInt1989 = (local10 - this.anInt1987) / arg0;
		this.anInt1980 = (local14 - this.anInt1991) / arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public synchronized void method1260() {
		this.anInt1985 = (this.anInt1985 ^ this.anInt1985 >> 31) + (this.anInt1985 >>> 31);
		this.anInt1985 = -this.anInt1985;
	}

	@OriginalMember(owner = "client!n", name = "j", descriptor = "()V")
	private void method1262() {
		this.anInt1986 = this.anInt1988;
		this.anInt1987 = Static140.method1248(this.anInt1988, this.anInt1982);
		this.anInt1991 = Static140.method1259(this.anInt1988, this.anInt1982);
	}

	@OriginalMember(owner = "client!n", name = "k", descriptor = "()V")
	private void method1263() {
		if (this.anInt1992 == 0) {
			return;
		}
		if (this.anInt1988 == Integer.MIN_VALUE) {
			this.anInt1988 = 0;
		}
		this.anInt1992 = 0;
		this.method1262();
	}

	@OriginalMember(owner = "client!n", name = "l", descriptor = "()Z")
	public boolean method1264() {
		return this.anInt1992 != 0;
	}
}
