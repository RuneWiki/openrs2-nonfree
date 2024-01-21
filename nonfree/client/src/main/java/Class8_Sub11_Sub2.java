import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class8_Sub11_Sub2 extends Class8_Sub11 {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	private int anInt1615;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	public int anInt1617;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	public int anInt1619;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
	private int anInt1622;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
	public int anInt1623;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	public int anInt1625;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public int anInt1627;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	public int anInt1628;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	private final int anInt1624;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	private final int anInt1621;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
	private final boolean aBoolean67;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private int anInt1616;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private int anInt1618;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private int anInt1626;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	public int anInt1620;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!p;II)V")
	public Class8_Sub11_Sub2(@OriginalArg(0) Class8_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass8_Sub9_5 = arg0;
		this.anInt1624 = arg0.anInt2235;
		this.anInt1621 = arg0.anInt2237;
		this.aBoolean67 = arg0.aBoolean88;
		this.anInt1616 = arg1;
		this.anInt1618 = arg2;
		this.anInt1626 = 8192;
		this.anInt1620 = 0;
		this.method971();
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!p;III)V")
	public Class8_Sub11_Sub2(@OriginalArg(0) Class8_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass8_Sub9_5 = arg0;
		this.anInt1624 = arg0.anInt2235;
		this.anInt1621 = arg0.anInt2237;
		this.aBoolean67 = arg0.aBoolean88;
		this.anInt1616 = arg1;
		this.anInt1618 = arg2;
		this.anInt1626 = arg3;
		this.anInt1620 = 0;
		this.method971();
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "()I")
	public synchronized int method967() {
		return this.anInt1618 == Integer.MIN_VALUE ? 0 : this.anInt1618;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	private synchronized void method968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1618 = arg0;
		this.anInt1626 = arg1;
		this.anInt1622 = 0;
		this.method971();
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public synchronized void method969(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1620 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "()Z")
	private boolean method970() {
		@Pc(2) int local2 = this.anInt1618;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static136.method976(local2, this.anInt1626);
			local8 = Static136.method973(local2, this.anInt1626);
		}
		if (this.anInt1625 != local2 || this.anInt1623 != local10 || this.anInt1619 != local8) {
			if (this.anInt1625 < local2) {
				this.anInt1627 = 1;
				this.anInt1622 = local2 - this.anInt1625;
			} else if (this.anInt1625 > local2) {
				this.anInt1627 = -1;
				this.anInt1622 = this.anInt1625 - local2;
			} else {
				this.anInt1627 = 0;
			}
			if (this.anInt1623 < local10) {
				this.anInt1628 = 1;
				if (this.anInt1622 == 0 || this.anInt1622 > local10 - this.anInt1623) {
					this.anInt1622 = local10 - this.anInt1623;
				}
			} else if (this.anInt1623 > local10) {
				this.anInt1628 = -1;
				if (this.anInt1622 == 0 || this.anInt1622 > this.anInt1623 - local10) {
					this.anInt1622 = this.anInt1623 - local10;
				}
			} else {
				this.anInt1628 = 0;
			}
			if (this.anInt1619 < local8) {
				this.anInt1617 = 1;
				if (this.anInt1622 == 0 || this.anInt1622 > local8 - this.anInt1619) {
					this.anInt1622 = local8 - this.anInt1619;
				}
			} else if (this.anInt1619 > local8) {
				this.anInt1617 = -1;
				if (this.anInt1622 == 0 || this.anInt1622 > this.anInt1619 - local8) {
					this.anInt1622 = this.anInt1619 - local8;
				}
			} else {
				this.anInt1617 = 0;
			}
			return false;
		} else if (this.anInt1618 == Integer.MIN_VALUE) {
			this.anInt1618 = 0;
			this.anInt1625 = this.anInt1623 = this.anInt1619 = 0;
			this.method2013();
			return true;
		} else {
			this.method971();
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "()V")
	private void method971() {
		this.anInt1625 = this.anInt1618;
		this.anInt1623 = Static136.method976(this.anInt1618, this.anInt1626);
		this.anInt1619 = Static136.method973(this.anInt1618, this.anInt1626);
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "()Z")
	public boolean method972() {
		return this.anInt1622 != 0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
	public synchronized void method975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method999(arg0, arg1, this.method980());
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public synchronized void method977(@OriginalArg(0) int arg0) {
		this.method968(arg0 << 6, this.method980());
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([IIIII)I")
	private int method979(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1622 <= 0) {
				if (this.anInt1616 == -256 && (this.anInt1620 & 0xFF) == 0) {
					if (Static23.aBoolean34) {
						return Static136.method966(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1623, this.anInt1619, arg3, arg2, this);
					}
					return Static136.method974(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1625, arg3, arg2, this);
				}
				if (Static23.aBoolean34) {
					return Static136.method994(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1623, this.anInt1619, arg3, arg2, this, this.anInt1616, arg4);
				}
				return Static136.method1003(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1625, arg3, arg2, this, this.anInt1616, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1622;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1622 += arg1;
			if (this.anInt1616 == -256 && (this.anInt1620 & 0xFF) == 0) {
				if (Static23.aBoolean34) {
					arg1 = Static136.method996(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1623, this.anInt1619, this.anInt1628, this.anInt1617, local5, arg2, this);
				} else {
					arg1 = Static136.method997(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1625, this.anInt1627, local5, arg2, this);
				}
			} else if (Static23.aBoolean34) {
				arg1 = Static136.method992(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1623, this.anInt1619, this.anInt1628, this.anInt1617, local5, arg2, this, this.anInt1616, arg4);
			} else {
				arg1 = Static136.method1004(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1625, this.anInt1627, local5, arg2, this, this.anInt1616, arg4);
			}
			this.anInt1622 -= arg1;
			if (this.anInt1622 != 0) {
				return arg1;
			}
		} while (!this.method970());
		return arg3;
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "()I")
	public synchronized int method980() {
		return this.anInt1626 < 0 ? -1 : this.anInt1626;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()Lclient!rf;")
	@Override
	public Class8_Sub11 method1918() {
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1917(@OriginalArg(0) int arg0) {
		if (this.anInt1622 > 0) {
			if (arg0 >= this.anInt1622) {
				if (this.anInt1618 == Integer.MIN_VALUE) {
					this.anInt1618 = 0;
					this.anInt1625 = this.anInt1623 = this.anInt1619 = 0;
					this.method2013();
					arg0 = this.anInt1622;
				}
				this.anInt1622 = 0;
				this.method971();
			} else {
				this.anInt1625 += this.anInt1627 * arg0;
				this.anInt1623 += this.anInt1628 * arg0;
				this.anInt1619 += this.anInt1617 * arg0;
				this.anInt1622 -= arg0;
			}
		}
		@Pc(71) Class8_Sub9_Sub1 local71 = (Class8_Sub9_Sub1) super.aClass8_Sub9_5;
		@Pc(76) int local76 = this.anInt1624 << 8;
		@Pc(81) int local81 = this.anInt1621 << 8;
		@Pc(87) int local87 = local71.aByteArray37.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1615 = 0;
		}
		if (this.anInt1620 < 0) {
			if (this.anInt1616 <= 0) {
				this.method985();
				this.method2013();
				return;
			}
			this.anInt1620 = 0;
		}
		if (this.anInt1620 >= local87) {
			if (this.anInt1616 >= 0) {
				this.method985();
				this.method2013();
				return;
			}
			this.anInt1620 = local87 - 1;
		}
		this.anInt1620 += this.anInt1616 * arg0;
		if (this.anInt1615 >= 0) {
			if (this.anInt1615 > 0) {
				if (this.aBoolean67) {
					label125: {
						if (this.anInt1616 < 0) {
							if (this.anInt1620 >= local76) {
								return;
							}
							this.anInt1620 = local76 + local76 - this.anInt1620 - 1;
							this.anInt1616 = -this.anInt1616;
							if (--this.anInt1615 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1620 < local81) {
								return;
							}
							this.anInt1620 = local81 + local81 - this.anInt1620 - 1;
							this.anInt1616 = -this.anInt1616;
							if (--this.anInt1615 == 0) {
								break;
							}
							if (this.anInt1620 >= local76) {
								return;
							}
							this.anInt1620 = local76 + local76 - this.anInt1620 - 1;
							this.anInt1616 = -this.anInt1616;
						} while (--this.anInt1615 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1616 < 0) {
						if (this.anInt1620 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1620 - 1) / local91;
						if (local361 < this.anInt1615) {
							this.anInt1620 += local91 * local361;
							this.anInt1615 -= local361;
							return;
						}
						this.anInt1620 += local91 * this.anInt1615;
						this.anInt1615 = 0;
					} else if (this.anInt1620 >= local81) {
						local361 = (this.anInt1620 - local76) / local91;
						if (local361 < this.anInt1615) {
							this.anInt1620 -= local91 * local361;
							this.anInt1615 -= local361;
							return;
						}
						this.anInt1620 -= local91 * this.anInt1615;
						this.anInt1615 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1616 < 0) {
				if (this.anInt1620 < 0) {
					this.anInt1620 = -1;
					this.method985();
					this.method2013();
					return;
				}
			} else if (this.anInt1620 >= local87) {
				this.anInt1620 = local87;
				this.method985();
				this.method2013();
			}
		} else if (this.aBoolean67) {
			if (this.anInt1616 < 0) {
				if (this.anInt1620 >= local76) {
					return;
				}
				this.anInt1620 = local76 + local76 - this.anInt1620 - 1;
				this.anInt1616 = -this.anInt1616;
			}
			while (this.anInt1620 >= local81) {
				this.anInt1620 = local81 + local81 - this.anInt1620 - 1;
				this.anInt1616 = -this.anInt1616;
				if (this.anInt1620 >= local76) {
					return;
				}
				this.anInt1620 = local76 + local76 - this.anInt1620 - 1;
				this.anInt1616 = -this.anInt1616;
			}
		} else if (this.anInt1616 < 0) {
			if (this.anInt1620 < local76) {
				this.anInt1620 = local81 - (local81 - 1 - this.anInt1620) % local91 - 1;
			}
		} else if (this.anInt1620 >= local81) {
			this.anInt1620 = local76 + (this.anInt1620 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "([IIIII)I")
	private int method982(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1622 <= 0) {
				if (this.anInt1616 == 256 && (this.anInt1620 & 0xFF) == 0) {
					if (Static23.aBoolean34) {
						return Static136.method978(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1623, this.anInt1619, arg3, arg2, this);
					}
					return Static136.method991(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1625, arg3, arg2, this);
				}
				if (Static23.aBoolean34) {
					return Static136.method1002(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1623, this.anInt1619, arg3, arg2, this, this.anInt1616, arg4);
				}
				return Static136.method989(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1625, arg3, arg2, this, this.anInt1616, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1622;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1622 += arg1;
			if (this.anInt1616 == 256 && (this.anInt1620 & 0xFF) == 0) {
				if (Static23.aBoolean34) {
					arg1 = Static136.method981(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1623, this.anInt1619, this.anInt1628, this.anInt1617, local5, arg2, this);
				} else {
					arg1 = Static136.method986(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1625, this.anInt1627, local5, arg2, this);
				}
			} else if (Static23.aBoolean34) {
				arg1 = Static136.method965(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1623, this.anInt1619, this.anInt1628, this.anInt1617, local5, arg2, this, this.anInt1616, arg4);
			} else {
				arg1 = Static136.method995(((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37, arg0, this.anInt1620, arg1, this.anInt1625, this.anInt1627, local5, arg2, this, this.anInt1616, arg4);
			}
			this.anInt1622 -= arg1;
			if (this.anInt1622 != 0) {
				return arg1;
			}
		} while (!this.method970());
		return arg3;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public synchronized void method983() {
		this.anInt1616 = (this.anInt1616 ^ this.anInt1616 >> 31) + (this.anInt1616 >>> 31);
		this.anInt1616 = -this.anInt1616;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	public synchronized void method984(@OriginalArg(0) int arg0) {
		this.anInt1615 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
	@Override
	public int method1915() {
		@Pc(6) int local6 = this.anInt1625 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1615 == 0) {
			local6 -= local6 * this.anInt1620 / (((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37.length << 8);
		} else if (this.anInt1615 >= 0) {
			local6 -= local6 * this.anInt1624 / ((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()Lclient!rf;")
	@Override
	public Class8_Sub11 method1920() {
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "()V")
	private void method985() {
		if (this.anInt1622 == 0) {
			return;
		}
		if (this.anInt1618 == Integer.MIN_VALUE) {
			this.anInt1618 = 0;
		}
		this.anInt1622 = 0;
		this.method971();
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
	private synchronized void method987() {
		this.method968(0, this.method980());
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
	public synchronized void method993(@OriginalArg(0) int arg0) {
		if (this.anInt1616 < 0) {
			this.anInt1616 = -arg0;
		} else {
			this.anInt1616 = arg0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
	public synchronized void method998(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method987();
			this.method2013();
		} else if (this.anInt1623 == 0 && this.anInt1619 == 0) {
			this.anInt1622 = 0;
			this.anInt1618 = 0;
			this.anInt1625 = 0;
			this.method2013();
		} else {
			@Pc(31) int local31 = -this.anInt1625;
			if (this.anInt1625 > local31) {
				local31 = this.anInt1625;
			}
			if (-this.anInt1623 > local31) {
				local31 = -this.anInt1623;
			}
			if (this.anInt1623 > local31) {
				local31 = this.anInt1623;
			}
			if (-this.anInt1619 > local31) {
				local31 = -this.anInt1619;
			}
			if (this.anInt1619 > local31) {
				local31 = this.anInt1619;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1622 = arg0;
			this.anInt1618 = Integer.MIN_VALUE;
			this.anInt1627 = -this.anInt1625 / arg0;
			this.anInt1628 = -this.anInt1623 / arg0;
			this.anInt1617 = -this.anInt1619 / arg0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public synchronized void method999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method968(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static136.method976(arg1, arg2);
		@Pc(14) int local14 = Static136.method973(arg1, arg2);
		if (this.anInt1623 == local10 && this.anInt1619 == local14) {
			this.anInt1622 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1625;
		if (this.anInt1625 - arg1 > local31) {
			local31 = this.anInt1625 - arg1;
		}
		if (local10 - this.anInt1623 > local31) {
			local31 = local10 - this.anInt1623;
		}
		if (this.anInt1623 - local10 > local31) {
			local31 = this.anInt1623 - local10;
		}
		if (local14 - this.anInt1619 > local31) {
			local31 = local14 - this.anInt1619;
		}
		if (this.anInt1619 - local14 > local31) {
			local31 = this.anInt1619 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1622 = arg0;
		this.anInt1618 = arg1;
		this.anInt1626 = arg2;
		this.anInt1627 = (arg1 - this.anInt1625) / arg0;
		this.anInt1628 = (local10 - this.anInt1623) / arg0;
		this.anInt1617 = (local14 - this.anInt1619) / arg0;
	}

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "()I")
	public synchronized int method1000() {
		return this.anInt1616 < 0 ? -this.anInt1616 : this.anInt1616;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1921(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1618 == 0 && this.anInt1622 == 0) {
			this.method1917(arg2);
			return;
		}
		@Pc(13) Class8_Sub9_Sub1 local13 = (Class8_Sub9_Sub1) super.aClass8_Sub9_5;
		@Pc(18) int local18 = this.anInt1624 << 8;
		@Pc(23) int local23 = this.anInt1621 << 8;
		@Pc(29) int local29 = local13.aByteArray37.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1615 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1620 < 0) {
			if (this.anInt1616 <= 0) {
				this.method985();
				this.method2013();
				return;
			}
			this.anInt1620 = 0;
		}
		if (this.anInt1620 >= local29) {
			if (this.anInt1616 >= 0) {
				this.method985();
				this.method2013();
				return;
			}
			this.anInt1620 = local29 - 1;
		}
		if (this.anInt1615 >= 0) {
			if (this.anInt1615 > 0) {
				if (this.aBoolean67) {
					label130: {
						if (this.anInt1616 < 0) {
							local40 = this.method979(arg0, arg1, local18, local44, local13.aByteArray37[this.anInt1624]);
							if (this.anInt1620 >= local18) {
								return;
							}
							this.anInt1620 = local18 + local18 - this.anInt1620 - 1;
							this.anInt1616 = -this.anInt1616;
							if (--this.anInt1615 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method982(arg0, local40, local23, local44, local13.aByteArray37[this.anInt1621 - 1]);
							if (this.anInt1620 < local23) {
								return;
							}
							this.anInt1620 = local23 + local23 - this.anInt1620 - 1;
							this.anInt1616 = -this.anInt1616;
							if (--this.anInt1615 == 0) {
								break;
							}
							local40 = this.method979(arg0, local40, local18, local44, local13.aByteArray37[this.anInt1624]);
							if (this.anInt1620 >= local18) {
								return;
							}
							this.anInt1620 = local18 + local18 - this.anInt1620 - 1;
							this.anInt1616 = -this.anInt1616;
						} while (--this.anInt1615 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1616 < 0) {
						while (true) {
							local40 = this.method979(arg0, local40, local18, local44, local13.aByteArray37[this.anInt1621 - 1]);
							if (this.anInt1620 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1620 - 1) / local33;
							if (local416 >= this.anInt1615) {
								this.anInt1620 += local33 * this.anInt1615;
								this.anInt1615 = 0;
								break;
							}
							this.anInt1620 += local33 * local416;
							this.anInt1615 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method982(arg0, local40, local23, local44, local13.aByteArray37[this.anInt1624]);
							if (this.anInt1620 < local23) {
								return;
							}
							local416 = (this.anInt1620 - local18) / local33;
							if (local416 >= this.anInt1615) {
								this.anInt1620 -= local33 * this.anInt1615;
								this.anInt1615 = 0;
								break;
							}
							this.anInt1620 -= local33 * local416;
							this.anInt1615 -= local416;
						}
					}
				}
			}
			if (this.anInt1616 < 0) {
				this.method979(arg0, local40, 0, local44, 0);
				if (this.anInt1620 < 0) {
					this.anInt1620 = -1;
					this.method985();
					this.method2013();
					return;
				}
			} else {
				this.method982(arg0, local40, local29, local44, 0);
				if (this.anInt1620 >= local29) {
					this.anInt1620 = local29;
					this.method985();
					this.method2013();
				}
			}
		} else if (this.aBoolean67) {
			if (this.anInt1616 < 0) {
				local40 = this.method979(arg0, arg1, local18, local44, local13.aByteArray37[this.anInt1624]);
				if (this.anInt1620 >= local18) {
					return;
				}
				this.anInt1620 = local18 + local18 - this.anInt1620 - 1;
				this.anInt1616 = -this.anInt1616;
			}
			while (true) {
				local40 = this.method982(arg0, local40, local23, local44, local13.aByteArray37[this.anInt1621 - 1]);
				if (this.anInt1620 < local23) {
					return;
				}
				this.anInt1620 = local23 + local23 - this.anInt1620 - 1;
				this.anInt1616 = -this.anInt1616;
				local40 = this.method979(arg0, local40, local18, local44, local13.aByteArray37[this.anInt1624]);
				if (this.anInt1620 >= local18) {
					return;
				}
				this.anInt1620 = local18 + local18 - this.anInt1620 - 1;
				this.anInt1616 = -this.anInt1616;
			}
		} else if (this.anInt1616 < 0) {
			while (true) {
				local40 = this.method979(arg0, local40, local18, local44, local13.aByteArray37[this.anInt1621 - 1]);
				if (this.anInt1620 >= local18) {
					return;
				}
				this.anInt1620 = local23 - (local23 - 1 - this.anInt1620) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method982(arg0, local40, local23, local44, local13.aByteArray37[this.anInt1624]);
				if (this.anInt1620 < local23) {
					return;
				}
				this.anInt1620 = local18 + (this.anInt1620 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "()Z")
	public boolean method1001() {
		return this.anInt1620 < 0 || this.anInt1620 >= ((Class8_Sub9_Sub1) super.aClass8_Sub9_5).aByteArray37.length << 8;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	@Override
	public int method1919() {
		return this.anInt1618 == 0 && this.anInt1622 == 0 ? 0 : 1;
	}
}
