import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class2_Sub5_Sub2 extends Class2_Sub5 {

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
	public int anInt1993;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
	public int anInt1994;

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
	public int anInt1998;

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
	public int anInt2000;

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
	public int anInt2002;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
	public int anInt2004;

	@OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
	private int anInt2005;

	@OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
	private int anInt2006;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
	private final int anInt1996;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
	private final int anInt2003;

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "Z")
	private final boolean aBoolean150;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
	private int anInt1997;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
	private int anInt1999;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
	private int anInt2001;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
	public int anInt1995;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!s;II)V")
	public Class2_Sub5_Sub2(@OriginalArg(0) Class2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub4_5 = arg0;
		this.anInt1996 = arg0.anInt2501;
		this.anInt2003 = arg0.anInt2502;
		this.aBoolean150 = arg0.aBoolean201;
		this.anInt1997 = arg1;
		this.anInt1999 = arg2;
		this.anInt2001 = 8192;
		this.anInt1995 = 0;
		this.method1306();
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!s;III)V")
	public Class2_Sub5_Sub2(@OriginalArg(0) Class2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub4_5 = arg0;
		this.anInt1996 = arg0.anInt2501;
		this.anInt2003 = arg0.anInt2502;
		this.aBoolean150 = arg0.aBoolean201;
		this.anInt1997 = arg1;
		this.anInt1999 = arg2;
		this.anInt2001 = arg3;
		this.anInt1995 = 0;
		this.method1306();
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
	public synchronized void method1287(@OriginalArg(0) int arg0) {
		this.method1315(arg0 << 6, this.method1320());
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1959(@OriginalArg(0) int arg0) {
		if (this.anInt2005 > 0) {
			if (arg0 >= this.anInt2005) {
				if (this.anInt1999 == Integer.MIN_VALUE) {
					this.anInt1999 = 0;
					this.anInt1993 = this.anInt1994 = this.anInt1998 = 0;
					this.method2209();
					arg0 = this.anInt2005;
				}
				this.anInt2005 = 0;
				this.method1306();
			} else {
				this.anInt1993 += this.anInt2002 * arg0;
				this.anInt1994 += this.anInt2000 * arg0;
				this.anInt1998 += this.anInt2004 * arg0;
				this.anInt2005 -= arg0;
			}
		}
		@Pc(71) Class2_Sub4_Sub1 local71 = (Class2_Sub4_Sub1) super.aClass2_Sub4_5;
		@Pc(76) int local76 = this.anInt1996 << 8;
		@Pc(81) int local81 = this.anInt2003 << 8;
		@Pc(87) int local87 = local71.aByteArray35.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2006 = 0;
		}
		if (this.anInt1995 < 0) {
			if (this.anInt1997 <= 0) {
				this.method1308();
				this.method2209();
				return;
			}
			this.anInt1995 = 0;
		}
		if (this.anInt1995 >= local87) {
			if (this.anInt1997 >= 0) {
				this.method1308();
				this.method2209();
				return;
			}
			this.anInt1995 = local87 - 1;
		}
		this.anInt1995 += this.anInt1997 * arg0;
		if (this.anInt2006 >= 0) {
			if (this.anInt2006 > 0) {
				if (this.aBoolean150) {
					label125: {
						if (this.anInt1997 < 0) {
							if (this.anInt1995 >= local76) {
								return;
							}
							this.anInt1995 = local76 + local76 - this.anInt1995 - 1;
							this.anInt1997 = -this.anInt1997;
							if (--this.anInt2006 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1995 < local81) {
								return;
							}
							this.anInt1995 = local81 + local81 - this.anInt1995 - 1;
							this.anInt1997 = -this.anInt1997;
							if (--this.anInt2006 == 0) {
								break;
							}
							if (this.anInt1995 >= local76) {
								return;
							}
							this.anInt1995 = local76 + local76 - this.anInt1995 - 1;
							this.anInt1997 = -this.anInt1997;
						} while (--this.anInt2006 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1997 < 0) {
						if (this.anInt1995 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1995 - 1) / local91;
						if (local361 < this.anInt2006) {
							this.anInt1995 += local91 * local361;
							this.anInt2006 -= local361;
							return;
						}
						this.anInt1995 += local91 * this.anInt2006;
						this.anInt2006 = 0;
					} else if (this.anInt1995 >= local81) {
						local361 = (this.anInt1995 - local76) / local91;
						if (local361 < this.anInt2006) {
							this.anInt1995 -= local91 * local361;
							this.anInt2006 -= local361;
							return;
						}
						this.anInt1995 -= local91 * this.anInt2006;
						this.anInt2006 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1997 < 0) {
				if (this.anInt1995 < 0) {
					this.anInt1995 = -1;
					this.method1308();
					this.method2209();
					return;
				}
			} else if (this.anInt1995 >= local87) {
				this.anInt1995 = local87;
				this.method1308();
				this.method2209();
			}
		} else if (this.aBoolean150) {
			if (this.anInt1997 < 0) {
				if (this.anInt1995 >= local76) {
					return;
				}
				this.anInt1995 = local76 + local76 - this.anInt1995 - 1;
				this.anInt1997 = -this.anInt1997;
			}
			while (this.anInt1995 >= local81) {
				this.anInt1995 = local81 + local81 - this.anInt1995 - 1;
				this.anInt1997 = -this.anInt1997;
				if (this.anInt1995 >= local76) {
					return;
				}
				this.anInt1995 = local76 + local76 - this.anInt1995 - 1;
				this.anInt1997 = -this.anInt1997;
			}
		} else if (this.anInt1997 < 0) {
			if (this.anInt1995 < local76) {
				this.anInt1995 = local81 - (local81 - 1 - this.anInt1995) % local91 - 1;
			}
		} else if (this.anInt1995 >= local81) {
			this.anInt1995 = local76 + (this.anInt1995 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()Lclient!d;")
	@Override
	public Class2_Sub5 method1954() {
		return null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public synchronized void method1292() {
		this.anInt1997 = (this.anInt1997 ^ this.anInt1997 >> 31) + (this.anInt1997 >>> 31);
		this.anInt1997 = -this.anInt1997;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "()I")
	@Override
	public int method1958() {
		@Pc(6) int local6 = this.anInt1993 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2006 == 0) {
			local6 -= local6 * this.anInt1995 / (((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35.length << 8);
		} else if (this.anInt2006 >= 0) {
			local6 -= local6 * this.anInt1996 / ((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "()Lclient!d;")
	@Override
	public Class2_Sub5 method1960() {
		return null;
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "()Z")
	public boolean method1296() {
		return this.anInt2005 != 0;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "()I")
	public synchronized int method1298() {
		return this.anInt1997 < 0 ? -this.anInt1997 : this.anInt1997;
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
	public synchronized void method1299(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1995 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	public synchronized void method1300(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1322();
			this.method2209();
		} else if (this.anInt1994 == 0 && this.anInt1998 == 0) {
			this.anInt2005 = 0;
			this.anInt1999 = 0;
			this.anInt1993 = 0;
			this.method2209();
		} else {
			@Pc(31) int local31 = -this.anInt1993;
			if (this.anInt1993 > local31) {
				local31 = this.anInt1993;
			}
			if (-this.anInt1994 > local31) {
				local31 = -this.anInt1994;
			}
			if (this.anInt1994 > local31) {
				local31 = this.anInt1994;
			}
			if (-this.anInt1998 > local31) {
				local31 = -this.anInt1998;
			}
			if (this.anInt1998 > local31) {
				local31 = this.anInt1998;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2005 = arg0;
			this.anInt1999 = Integer.MIN_VALUE;
			this.anInt2002 = -this.anInt1993 / arg0;
			this.anInt2000 = -this.anInt1994 / arg0;
			this.anInt2004 = -this.anInt1998 / arg0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "()V")
	private void method1306() {
		this.anInt1993 = this.anInt1999;
		this.anInt1994 = Static137.method1301(this.anInt1999, this.anInt2001);
		this.anInt1998 = Static137.method1323(this.anInt1999, this.anInt2001);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V")
	public synchronized void method1307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1321(arg0, arg1, this.method1320());
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1957(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1999 == 0 && this.anInt2005 == 0) {
			this.method1959(arg2);
			return;
		}
		@Pc(13) Class2_Sub4_Sub1 local13 = (Class2_Sub4_Sub1) super.aClass2_Sub4_5;
		@Pc(18) int local18 = this.anInt1996 << 8;
		@Pc(23) int local23 = this.anInt2003 << 8;
		@Pc(29) int local29 = local13.aByteArray35.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2006 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1995 < 0) {
			if (this.anInt1997 <= 0) {
				this.method1308();
				this.method2209();
				return;
			}
			this.anInt1995 = 0;
		}
		if (this.anInt1995 >= local29) {
			if (this.anInt1997 >= 0) {
				this.method1308();
				this.method2209();
				return;
			}
			this.anInt1995 = local29 - 1;
		}
		if (this.anInt2006 >= 0) {
			if (this.anInt2006 > 0) {
				if (this.aBoolean150) {
					label130: {
						if (this.anInt1997 < 0) {
							local40 = this.method1311(arg0, arg1, local18, local44, local13.aByteArray35[this.anInt1996]);
							if (this.anInt1995 >= local18) {
								return;
							}
							this.anInt1995 = local18 + local18 - this.anInt1995 - 1;
							this.anInt1997 = -this.anInt1997;
							if (--this.anInt2006 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1310(arg0, local40, local23, local44, local13.aByteArray35[this.anInt2003 - 1]);
							if (this.anInt1995 < local23) {
								return;
							}
							this.anInt1995 = local23 + local23 - this.anInt1995 - 1;
							this.anInt1997 = -this.anInt1997;
							if (--this.anInt2006 == 0) {
								break;
							}
							local40 = this.method1311(arg0, local40, local18, local44, local13.aByteArray35[this.anInt1996]);
							if (this.anInt1995 >= local18) {
								return;
							}
							this.anInt1995 = local18 + local18 - this.anInt1995 - 1;
							this.anInt1997 = -this.anInt1997;
						} while (--this.anInt2006 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1997 < 0) {
						while (true) {
							local40 = this.method1311(arg0, local40, local18, local44, local13.aByteArray35[this.anInt2003 - 1]);
							if (this.anInt1995 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1995 - 1) / local33;
							if (local416 >= this.anInt2006) {
								this.anInt1995 += local33 * this.anInt2006;
								this.anInt2006 = 0;
								break;
							}
							this.anInt1995 += local33 * local416;
							this.anInt2006 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1310(arg0, local40, local23, local44, local13.aByteArray35[this.anInt1996]);
							if (this.anInt1995 < local23) {
								return;
							}
							local416 = (this.anInt1995 - local18) / local33;
							if (local416 >= this.anInt2006) {
								this.anInt1995 -= local33 * this.anInt2006;
								this.anInt2006 = 0;
								break;
							}
							this.anInt1995 -= local33 * local416;
							this.anInt2006 -= local416;
						}
					}
				}
			}
			if (this.anInt1997 < 0) {
				this.method1311(arg0, local40, 0, local44, 0);
				if (this.anInt1995 < 0) {
					this.anInt1995 = -1;
					this.method1308();
					this.method2209();
					return;
				}
			} else {
				this.method1310(arg0, local40, local29, local44, 0);
				if (this.anInt1995 >= local29) {
					this.anInt1995 = local29;
					this.method1308();
					this.method2209();
				}
			}
		} else if (this.aBoolean150) {
			if (this.anInt1997 < 0) {
				local40 = this.method1311(arg0, arg1, local18, local44, local13.aByteArray35[this.anInt1996]);
				if (this.anInt1995 >= local18) {
					return;
				}
				this.anInt1995 = local18 + local18 - this.anInt1995 - 1;
				this.anInt1997 = -this.anInt1997;
			}
			while (true) {
				local40 = this.method1310(arg0, local40, local23, local44, local13.aByteArray35[this.anInt2003 - 1]);
				if (this.anInt1995 < local23) {
					return;
				}
				this.anInt1995 = local23 + local23 - this.anInt1995 - 1;
				this.anInt1997 = -this.anInt1997;
				local40 = this.method1311(arg0, local40, local18, local44, local13.aByteArray35[this.anInt1996]);
				if (this.anInt1995 >= local18) {
					return;
				}
				this.anInt1995 = local18 + local18 - this.anInt1995 - 1;
				this.anInt1997 = -this.anInt1997;
			}
		} else if (this.anInt1997 < 0) {
			while (true) {
				local40 = this.method1311(arg0, local40, local18, local44, local13.aByteArray35[this.anInt2003 - 1]);
				if (this.anInt1995 >= local18) {
					return;
				}
				this.anInt1995 = local23 - (local23 - 1 - this.anInt1995) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1310(arg0, local40, local23, local44, local13.aByteArray35[this.anInt1996]);
				if (this.anInt1995 < local23) {
					return;
				}
				this.anInt1995 = local18 + (this.anInt1995 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "()V")
	private void method1308() {
		if (this.anInt2005 == 0) {
			return;
		}
		if (this.anInt1999 == Integer.MIN_VALUE) {
			this.anInt1999 = 0;
		}
		this.anInt2005 = 0;
		this.method1306();
	}

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "()Z")
	public boolean method1309() {
		return this.anInt1995 < 0 || this.anInt1995 >= ((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35.length << 8;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([IIIII)I")
	private int method1310(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2005 <= 0) {
				if (this.anInt1997 == 256 && (this.anInt1995 & 0xFF) == 0) {
					if (Static34.aBoolean59) {
						return Static137.method1314(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1994, this.anInt1998, arg3, arg2, this);
					}
					return Static137.method1295(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1993, arg3, arg2, this);
				}
				if (Static34.aBoolean59) {
					return Static137.method1318(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1994, this.anInt1998, arg3, arg2, this, this.anInt1997, arg4);
				}
				return Static137.method1312(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1993, arg3, arg2, this, this.anInt1997, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2005;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2005 += arg1;
			if (this.anInt1997 == 256 && (this.anInt1995 & 0xFF) == 0) {
				if (Static34.aBoolean59) {
					arg1 = Static137.method1291(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1994, this.anInt1998, this.anInt2000, this.anInt2004, local5, arg2, this);
				} else {
					arg1 = Static137.method1297(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1993, this.anInt2002, local5, arg2, this);
				}
			} else if (Static34.aBoolean59) {
				arg1 = Static137.method1289(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1994, this.anInt1998, this.anInt2000, this.anInt2004, local5, arg2, this, this.anInt1997, arg4);
			} else {
				arg1 = Static137.method1290(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1993, this.anInt2002, local5, arg2, this, this.anInt1997, arg4);
			}
			this.anInt2005 -= arg1;
			if (this.anInt2005 != 0) {
				return arg1;
			}
		} while (!this.method1325());
		return arg3;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "([IIIII)I")
	private int method1311(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2005 <= 0) {
				if (this.anInt1997 == -256 && (this.anInt1995 & 0xFF) == 0) {
					if (Static34.aBoolean59) {
						return Static137.method1293(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1994, this.anInt1998, arg3, arg2, this);
					}
					return Static137.method1303(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1993, arg3, arg2, this);
				}
				if (Static34.aBoolean59) {
					return Static137.method1324(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1994, this.anInt1998, arg3, arg2, this, this.anInt1997, arg4);
				}
				return Static137.method1305(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1993, arg3, arg2, this, this.anInt1997, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2005;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2005 += arg1;
			if (this.anInt1997 == -256 && (this.anInt1995 & 0xFF) == 0) {
				if (Static34.aBoolean59) {
					arg1 = Static137.method1302(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1994, this.anInt1998, this.anInt2000, this.anInt2004, local5, arg2, this);
				} else {
					arg1 = Static137.method1288(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1993, this.anInt2002, local5, arg2, this);
				}
			} else if (Static34.aBoolean59) {
				arg1 = Static137.method1317(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1994, this.anInt1998, this.anInt2000, this.anInt2004, local5, arg2, this, this.anInt1997, arg4);
			} else {
				arg1 = Static137.method1304(((Class2_Sub4_Sub1) super.aClass2_Sub4_5).aByteArray35, arg0, this.anInt1995, arg1, this.anInt1993, this.anInt2002, local5, arg2, this, this.anInt1997, arg4);
			}
			this.anInt2005 -= arg1;
			if (this.anInt2005 != 0) {
				return arg1;
			}
		} while (!this.method1325());
		return arg3;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "()I")
	@Override
	public int method1955() {
		return this.anInt1999 == 0 && this.anInt2005 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)V")
	private synchronized void method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1999 = arg0;
		this.anInt2001 = arg1;
		this.anInt2005 = 0;
		this.method1306();
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
	public synchronized void method1316(@OriginalArg(0) int arg0) {
		if (this.anInt1997 < 0) {
			this.anInt1997 = -arg0;
		} else {
			this.anInt1997 = arg0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "()I")
	public synchronized int method1319() {
		return this.anInt1999 == Integer.MIN_VALUE ? 0 : this.anInt1999;
	}

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "()I")
	public synchronized int method1320() {
		return this.anInt2001 < 0 ? -1 : this.anInt2001;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
	public synchronized void method1321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1315(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static137.method1301(arg1, arg2);
		@Pc(14) int local14 = Static137.method1323(arg1, arg2);
		if (this.anInt1994 == local10 && this.anInt1998 == local14) {
			this.anInt2005 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1993;
		if (this.anInt1993 - arg1 > local31) {
			local31 = this.anInt1993 - arg1;
		}
		if (local10 - this.anInt1994 > local31) {
			local31 = local10 - this.anInt1994;
		}
		if (this.anInt1994 - local10 > local31) {
			local31 = this.anInt1994 - local10;
		}
		if (local14 - this.anInt1998 > local31) {
			local31 = local14 - this.anInt1998;
		}
		if (this.anInt1998 - local14 > local31) {
			local31 = this.anInt1998 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2005 = arg0;
		this.anInt1999 = arg1;
		this.anInt2001 = arg2;
		this.anInt2002 = (arg1 - this.anInt1993) / arg0;
		this.anInt2000 = (local10 - this.anInt1994) / arg0;
		this.anInt2004 = (local14 - this.anInt1998) / arg0;
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V")
	private synchronized void method1322() {
		this.method1315(0, this.method1320());
	}

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "()Z")
	private boolean method1325() {
		@Pc(2) int local2 = this.anInt1999;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static137.method1301(local2, this.anInt2001);
			local8 = Static137.method1323(local2, this.anInt2001);
		}
		if (this.anInt1993 != local2 || this.anInt1994 != local10 || this.anInt1998 != local8) {
			if (this.anInt1993 < local2) {
				this.anInt2002 = 1;
				this.anInt2005 = local2 - this.anInt1993;
			} else if (this.anInt1993 > local2) {
				this.anInt2002 = -1;
				this.anInt2005 = this.anInt1993 - local2;
			} else {
				this.anInt2002 = 0;
			}
			if (this.anInt1994 < local10) {
				this.anInt2000 = 1;
				if (this.anInt2005 == 0 || this.anInt2005 > local10 - this.anInt1994) {
					this.anInt2005 = local10 - this.anInt1994;
				}
			} else if (this.anInt1994 > local10) {
				this.anInt2000 = -1;
				if (this.anInt2005 == 0 || this.anInt2005 > this.anInt1994 - local10) {
					this.anInt2005 = this.anInt1994 - local10;
				}
			} else {
				this.anInt2000 = 0;
			}
			if (this.anInt1998 < local8) {
				this.anInt2004 = 1;
				if (this.anInt2005 == 0 || this.anInt2005 > local8 - this.anInt1998) {
					this.anInt2005 = local8 - this.anInt1998;
				}
			} else if (this.anInt1998 > local8) {
				this.anInt2004 = -1;
				if (this.anInt2005 == 0 || this.anInt2005 > this.anInt1998 - local8) {
					this.anInt2005 = this.anInt1998 - local8;
				}
			} else {
				this.anInt2004 = 0;
			}
			return false;
		} else if (this.anInt1999 == Integer.MIN_VALUE) {
			this.anInt1999 = 0;
			this.anInt1993 = this.anInt1994 = this.anInt1998 = 0;
			this.method2209();
			return true;
		} else {
			this.method1306();
			return false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "(I)V")
	public synchronized void method1326(@OriginalArg(0) int arg0) {
		this.anInt2006 = arg0;
	}
}
