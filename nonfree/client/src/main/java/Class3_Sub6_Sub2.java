import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class3_Sub6_Sub2 extends Class3_Sub6 {

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	public int anInt1812;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
	public int anInt1813;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	private int anInt1814;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
	public int anInt1815;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
	public int anInt1818;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
	private int anInt1819;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
	public int anInt1820;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
	public int anInt1823;

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
	private final int anInt1824;

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
	private final int anInt1817;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "Z")
	private final boolean aBoolean143;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
	private int anInt1816;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
	private int anInt1821;

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
	private int anInt1825;

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
	public int anInt1822;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ee;II)V")
	public Class3_Sub6_Sub2(@OriginalArg(0) Class3_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub20_5 = arg0;
		this.anInt1824 = arg0.anInt2620;
		this.anInt1817 = arg0.anInt2621;
		this.aBoolean143 = arg0.aBoolean212;
		this.anInt1816 = arg1;
		this.anInt1821 = arg2;
		this.anInt1825 = 8192;
		this.anInt1822 = 0;
		this.method1575();
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ee;III)V")
	public Class3_Sub6_Sub2(@OriginalArg(0) Class3_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub20_5 = arg0;
		this.anInt1824 = arg0.anInt2620;
		this.anInt1817 = arg0.anInt2621;
		this.aBoolean143 = arg0.aBoolean212;
		this.anInt1816 = arg1;
		this.anInt1821 = arg2;
		this.anInt1825 = arg3;
		this.anInt1822 = 0;
		this.method1575();
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
	private synchronized void method1551() {
		this.method1564(0, this.method1580());
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	public synchronized void method1552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1564(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static598.method1558(arg1, arg2);
		@Pc(14) int local14 = Static598.method1556(arg1, arg2);
		if (this.anInt1815 == local10 && this.anInt1820 == local14) {
			this.anInt1814 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1812;
		if (this.anInt1812 - arg1 > local31) {
			local31 = this.anInt1812 - arg1;
		}
		if (local10 - this.anInt1815 > local31) {
			local31 = local10 - this.anInt1815;
		}
		if (this.anInt1815 - local10 > local31) {
			local31 = this.anInt1815 - local10;
		}
		if (local14 - this.anInt1820 > local31) {
			local31 = local14 - this.anInt1820;
		}
		if (this.anInt1820 - local14 > local31) {
			local31 = this.anInt1820 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1814 = arg0;
		this.anInt1821 = arg1;
		this.anInt1825 = arg2;
		this.anInt1818 = (arg1 - this.anInt1812) / arg0;
		this.anInt1823 = (local10 - this.anInt1815) / arg0;
		this.anInt1813 = (local14 - this.anInt1820) / arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()I")
	@Override
	public int method3727() {
		return this.anInt1821 == 0 && this.anInt1814 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "()Lclient!oea;")
	@Override
	public Class3_Sub6 method3730() {
		return null;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()I")
	@Override
	public int method3729() {
		@Pc(6) int local6 = this.anInt1812 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1819 == 0) {
			local6 -= local6 * this.anInt1822 / (((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23.length << 8);
		} else if (this.anInt1819 >= 0) {
			local6 -= local6 * this.anInt1824 / ((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "()Z")
	public boolean method1555() {
		return this.anInt1822 < 0 || this.anInt1822 >= ((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23.length << 8;
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "()Lclient!oea;")
	@Override
	public Class3_Sub6 method3731() {
		return null;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([IIIII)I")
	private int method1559(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1814 <= 0) {
				if (this.anInt1816 == 256 && (this.anInt1822 & 0xFF) == 0) {
					if (Static134.aBoolean244) {
						return Static598.method1569(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1815, this.anInt1820, arg3, arg2, this);
					}
					return Static598.method1566(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1812, arg3, arg2, this);
				}
				if (Static134.aBoolean244) {
					return Static598.method1568(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1815, this.anInt1820, arg3, arg2, this, this.anInt1816, arg4);
				}
				return Static598.method1570(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1812, arg3, arg2, this, this.anInt1816, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1814;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1814 += arg1;
			if (this.anInt1816 == 256 && (this.anInt1822 & 0xFF) == 0) {
				if (Static134.aBoolean244) {
					arg1 = Static598.method1574(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1815, this.anInt1820, this.anInt1823, this.anInt1813, local5, arg2, this);
				} else {
					arg1 = Static598.method1589(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1812, this.anInt1818, local5, arg2, this);
				}
			} else if (Static134.aBoolean244) {
				arg1 = Static598.method1583(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1815, this.anInt1820, this.anInt1823, this.anInt1813, local5, arg2, this, this.anInt1816, arg4);
			} else {
				arg1 = Static598.method1571(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1812, this.anInt1818, local5, arg2, this, this.anInt1816, arg4);
			}
			this.anInt1814 -= arg1;
			if (this.anInt1814 != 0) {
				return arg1;
			}
		} while (!this.method1578());
		return arg3;
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
	public synchronized void method1560(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1551();
			this.method7812();
		} else if (this.anInt1815 == 0 && this.anInt1820 == 0) {
			this.anInt1814 = 0;
			this.anInt1821 = 0;
			this.anInt1812 = 0;
			this.method7812();
		} else {
			@Pc(31) int local31 = -this.anInt1812;
			if (this.anInt1812 > local31) {
				local31 = this.anInt1812;
			}
			if (-this.anInt1815 > local31) {
				local31 = -this.anInt1815;
			}
			if (this.anInt1815 > local31) {
				local31 = this.anInt1815;
			}
			if (-this.anInt1820 > local31) {
				local31 = -this.anInt1820;
			}
			if (this.anInt1820 > local31) {
				local31 = this.anInt1820;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1814 = arg0;
			this.anInt1821 = Integer.MIN_VALUE;
			this.anInt1818 = -this.anInt1812 / arg0;
			this.anInt1823 = -this.anInt1815 / arg0;
			this.anInt1813 = -this.anInt1820 / arg0;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3728(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1821 == 0 && this.anInt1814 == 0) {
			this.method3732(arg2);
			return;
		}
		@Pc(13) Class3_Sub20_Sub1 local13 = (Class3_Sub20_Sub1) super.aClass3_Sub20_5;
		@Pc(18) int local18 = this.anInt1824 << 8;
		@Pc(23) int local23 = this.anInt1817 << 8;
		@Pc(29) int local29 = local13.aByteArray23.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1819 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1822 < 0) {
			if (this.anInt1816 <= 0) {
				this.method1565();
				this.method7812();
				return;
			}
			this.anInt1822 = 0;
		}
		if (this.anInt1822 >= local29) {
			if (this.anInt1816 >= 0) {
				this.method1565();
				this.method7812();
				return;
			}
			this.anInt1822 = local29 - 1;
		}
		if (this.anInt1819 >= 0) {
			if (this.anInt1819 > 0) {
				if (this.aBoolean143) {
					label130: {
						if (this.anInt1816 < 0) {
							local40 = this.method1573(arg0, arg1, local18, local44, local13.aByteArray23[this.anInt1824]);
							if (this.anInt1822 >= local18) {
								return;
							}
							this.anInt1822 = local18 + local18 - this.anInt1822 - 1;
							this.anInt1816 = -this.anInt1816;
							if (--this.anInt1819 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1559(arg0, local40, local23, local44, local13.aByteArray23[this.anInt1817 - 1]);
							if (this.anInt1822 < local23) {
								return;
							}
							this.anInt1822 = local23 + local23 - this.anInt1822 - 1;
							this.anInt1816 = -this.anInt1816;
							if (--this.anInt1819 == 0) {
								break;
							}
							local40 = this.method1573(arg0, local40, local18, local44, local13.aByteArray23[this.anInt1824]);
							if (this.anInt1822 >= local18) {
								return;
							}
							this.anInt1822 = local18 + local18 - this.anInt1822 - 1;
							this.anInt1816 = -this.anInt1816;
						} while (--this.anInt1819 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1816 < 0) {
						while (true) {
							local40 = this.method1573(arg0, local40, local18, local44, local13.aByteArray23[this.anInt1817 - 1]);
							if (this.anInt1822 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1822 - 1) / local33;
							if (local416 >= this.anInt1819) {
								this.anInt1822 += local33 * this.anInt1819;
								this.anInt1819 = 0;
								break;
							}
							this.anInt1822 += local33 * local416;
							this.anInt1819 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1559(arg0, local40, local23, local44, local13.aByteArray23[this.anInt1824]);
							if (this.anInt1822 < local23) {
								return;
							}
							local416 = (this.anInt1822 - local18) / local33;
							if (local416 >= this.anInt1819) {
								this.anInt1822 -= local33 * this.anInt1819;
								this.anInt1819 = 0;
								break;
							}
							this.anInt1822 -= local33 * local416;
							this.anInt1819 -= local416;
						}
					}
				}
			}
			if (this.anInt1816 < 0) {
				this.method1573(arg0, local40, 0, local44, 0);
				if (this.anInt1822 < 0) {
					this.anInt1822 = -1;
					this.method1565();
					this.method7812();
					return;
				}
			} else {
				this.method1559(arg0, local40, local29, local44, 0);
				if (this.anInt1822 >= local29) {
					this.anInt1822 = local29;
					this.method1565();
					this.method7812();
				}
			}
		} else if (this.aBoolean143) {
			if (this.anInt1816 < 0) {
				local40 = this.method1573(arg0, arg1, local18, local44, local13.aByteArray23[this.anInt1824]);
				if (this.anInt1822 >= local18) {
					return;
				}
				this.anInt1822 = local18 + local18 - this.anInt1822 - 1;
				this.anInt1816 = -this.anInt1816;
			}
			while (true) {
				local40 = this.method1559(arg0, local40, local23, local44, local13.aByteArray23[this.anInt1817 - 1]);
				if (this.anInt1822 < local23) {
					return;
				}
				this.anInt1822 = local23 + local23 - this.anInt1822 - 1;
				this.anInt1816 = -this.anInt1816;
				local40 = this.method1573(arg0, local40, local18, local44, local13.aByteArray23[this.anInt1824]);
				if (this.anInt1822 >= local18) {
					return;
				}
				this.anInt1822 = local18 + local18 - this.anInt1822 - 1;
				this.anInt1816 = -this.anInt1816;
			}
		} else if (this.anInt1816 < 0) {
			while (true) {
				local40 = this.method1573(arg0, local40, local18, local44, local13.aByteArray23[this.anInt1817 - 1]);
				if (this.anInt1822 >= local18) {
					return;
				}
				this.anInt1822 = local23 - (local23 - 1 - this.anInt1822) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1559(arg0, local40, local23, local44, local13.aByteArray23[this.anInt1824]);
				if (this.anInt1822 < local23) {
					return;
				}
				this.anInt1822 = local18 + (this.anInt1822 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)V")
	private synchronized void method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1821 = arg0;
		this.anInt1825 = arg1;
		this.anInt1814 = 0;
		this.method1575();
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "()V")
	private void method1565() {
		if (this.anInt1814 == 0) {
			return;
		}
		if (this.anInt1821 == Integer.MIN_VALUE) {
			this.anInt1821 = 0;
		}
		this.anInt1814 = 0;
		this.method1575();
	}

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "()I")
	public synchronized int method1567() {
		return this.anInt1816 < 0 ? -this.anInt1816 : this.anInt1816;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3732(@OriginalArg(0) int arg0) {
		if (this.anInt1814 > 0) {
			if (arg0 >= this.anInt1814) {
				if (this.anInt1821 == Integer.MIN_VALUE) {
					this.anInt1821 = 0;
					this.anInt1812 = this.anInt1815 = this.anInt1820 = 0;
					this.method7812();
					arg0 = this.anInt1814;
				}
				this.anInt1814 = 0;
				this.method1575();
			} else {
				this.anInt1812 += this.anInt1818 * arg0;
				this.anInt1815 += this.anInt1823 * arg0;
				this.anInt1820 += this.anInt1813 * arg0;
				this.anInt1814 -= arg0;
			}
		}
		@Pc(71) Class3_Sub20_Sub1 local71 = (Class3_Sub20_Sub1) super.aClass3_Sub20_5;
		@Pc(76) int local76 = this.anInt1824 << 8;
		@Pc(81) int local81 = this.anInt1817 << 8;
		@Pc(87) int local87 = local71.aByteArray23.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1819 = 0;
		}
		if (this.anInt1822 < 0) {
			if (this.anInt1816 <= 0) {
				this.method1565();
				this.method7812();
				return;
			}
			this.anInt1822 = 0;
		}
		if (this.anInt1822 >= local87) {
			if (this.anInt1816 >= 0) {
				this.method1565();
				this.method7812();
				return;
			}
			this.anInt1822 = local87 - 1;
		}
		this.anInt1822 += this.anInt1816 * arg0;
		if (this.anInt1819 >= 0) {
			if (this.anInt1819 > 0) {
				if (this.aBoolean143) {
					label125: {
						if (this.anInt1816 < 0) {
							if (this.anInt1822 >= local76) {
								return;
							}
							this.anInt1822 = local76 + local76 - this.anInt1822 - 1;
							this.anInt1816 = -this.anInt1816;
							if (--this.anInt1819 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1822 < local81) {
								return;
							}
							this.anInt1822 = local81 + local81 - this.anInt1822 - 1;
							this.anInt1816 = -this.anInt1816;
							if (--this.anInt1819 == 0) {
								break;
							}
							if (this.anInt1822 >= local76) {
								return;
							}
							this.anInt1822 = local76 + local76 - this.anInt1822 - 1;
							this.anInt1816 = -this.anInt1816;
						} while (--this.anInt1819 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1816 < 0) {
						if (this.anInt1822 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1822 - 1) / local91;
						if (local361 < this.anInt1819) {
							this.anInt1822 += local91 * local361;
							this.anInt1819 -= local361;
							return;
						}
						this.anInt1822 += local91 * this.anInt1819;
						this.anInt1819 = 0;
					} else if (this.anInt1822 >= local81) {
						local361 = (this.anInt1822 - local76) / local91;
						if (local361 < this.anInt1819) {
							this.anInt1822 -= local91 * local361;
							this.anInt1819 -= local361;
							return;
						}
						this.anInt1822 -= local91 * this.anInt1819;
						this.anInt1819 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1816 < 0) {
				if (this.anInt1822 < 0) {
					this.anInt1822 = -1;
					this.method1565();
					this.method7812();
					return;
				}
			} else if (this.anInt1822 >= local87) {
				this.anInt1822 = local87;
				this.method1565();
				this.method7812();
			}
		} else if (this.aBoolean143) {
			if (this.anInt1816 < 0) {
				if (this.anInt1822 >= local76) {
					return;
				}
				this.anInt1822 = local76 + local76 - this.anInt1822 - 1;
				this.anInt1816 = -this.anInt1816;
			}
			while (this.anInt1822 >= local81) {
				this.anInt1822 = local81 + local81 - this.anInt1822 - 1;
				this.anInt1816 = -this.anInt1816;
				if (this.anInt1822 >= local76) {
					return;
				}
				this.anInt1822 = local76 + local76 - this.anInt1822 - 1;
				this.anInt1816 = -this.anInt1816;
			}
		} else if (this.anInt1816 < 0) {
			if (this.anInt1822 < local76) {
				this.anInt1822 = local81 - (local81 - 1 - this.anInt1822) % local91 - 1;
			}
		} else if (this.anInt1822 >= local81) {
			this.anInt1822 = local76 + (this.anInt1822 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
	public synchronized void method1572(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1822 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "([IIIII)I")
	private int method1573(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1814 <= 0) {
				if (this.anInt1816 == -256 && (this.anInt1822 & 0xFF) == 0) {
					if (Static134.aBoolean244) {
						return Static598.method1553(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1815, this.anInt1820, arg3, arg2, this);
					}
					return Static598.method1563(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1812, arg3, arg2, this);
				}
				if (Static134.aBoolean244) {
					return Static598.method1584(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1815, this.anInt1820, arg3, arg2, this, this.anInt1816, arg4);
				}
				return Static598.method1576(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1812, arg3, arg2, this, this.anInt1816, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1814;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1814 += arg1;
			if (this.anInt1816 == -256 && (this.anInt1822 & 0xFF) == 0) {
				if (Static134.aBoolean244) {
					arg1 = Static598.method1561(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1815, this.anInt1820, this.anInt1823, this.anInt1813, local5, arg2, this);
				} else {
					arg1 = Static598.method1562(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1812, this.anInt1818, local5, arg2, this);
				}
			} else if (Static134.aBoolean244) {
				arg1 = Static598.method1554(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1815, this.anInt1820, this.anInt1823, this.anInt1813, local5, arg2, this, this.anInt1816, arg4);
			} else {
				arg1 = Static598.method1579(((Class3_Sub20_Sub1) super.aClass3_Sub20_5).aByteArray23, arg0, this.anInt1822, arg1, this.anInt1812, this.anInt1818, local5, arg2, this, this.anInt1816, arg4);
			}
			this.anInt1814 -= arg1;
			if (this.anInt1814 != 0) {
				return arg1;
			}
		} while (!this.method1578());
		return arg3;
	}

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "()V")
	private void method1575() {
		this.anInt1812 = this.anInt1821;
		this.anInt1815 = Static598.method1558(this.anInt1821, this.anInt1825);
		this.anInt1820 = Static598.method1556(this.anInt1821, this.anInt1825);
	}

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "()Z")
	public boolean method1577() {
		return this.anInt1814 != 0;
	}

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "()Z")
	private boolean method1578() {
		@Pc(2) int local2 = this.anInt1821;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static598.method1558(local2, this.anInt1825);
			local8 = Static598.method1556(local2, this.anInt1825);
		}
		if (this.anInt1812 != local2 || this.anInt1815 != local10 || this.anInt1820 != local8) {
			if (this.anInt1812 < local2) {
				this.anInt1818 = 1;
				this.anInt1814 = local2 - this.anInt1812;
			} else if (this.anInt1812 > local2) {
				this.anInt1818 = -1;
				this.anInt1814 = this.anInt1812 - local2;
			} else {
				this.anInt1818 = 0;
			}
			if (this.anInt1815 < local10) {
				this.anInt1823 = 1;
				if (this.anInt1814 == 0 || this.anInt1814 > local10 - this.anInt1815) {
					this.anInt1814 = local10 - this.anInt1815;
				}
			} else if (this.anInt1815 > local10) {
				this.anInt1823 = -1;
				if (this.anInt1814 == 0 || this.anInt1814 > this.anInt1815 - local10) {
					this.anInt1814 = this.anInt1815 - local10;
				}
			} else {
				this.anInt1823 = 0;
			}
			if (this.anInt1820 < local8) {
				this.anInt1813 = 1;
				if (this.anInt1814 == 0 || this.anInt1814 > local8 - this.anInt1820) {
					this.anInt1814 = local8 - this.anInt1820;
				}
			} else if (this.anInt1820 > local8) {
				this.anInt1813 = -1;
				if (this.anInt1814 == 0 || this.anInt1814 > this.anInt1820 - local8) {
					this.anInt1814 = this.anInt1820 - local8;
				}
			} else {
				this.anInt1813 = 0;
			}
			return false;
		} else if (this.anInt1821 == Integer.MIN_VALUE) {
			this.anInt1821 = 0;
			this.anInt1812 = this.anInt1815 = this.anInt1820 = 0;
			this.method7812();
			return true;
		} else {
			this.method1575();
			return false;
		}
	}

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "()I")
	public synchronized int method1580() {
		return this.anInt1825 < 0 ? -1 : this.anInt1825;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	public synchronized void method1581() {
		this.anInt1816 = (this.anInt1816 ^ this.anInt1816 >> 31) + (this.anInt1816 >>> 31);
		this.anInt1816 = -this.anInt1816;
	}

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "(I)V")
	public synchronized void method1582(@OriginalArg(0) int arg0) {
		this.anInt1819 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)V")
	public synchronized void method1585(@OriginalArg(0) int arg0) {
		if (this.anInt1816 < 0) {
			this.anInt1816 = -arg0;
		} else {
			this.anInt1816 = arg0;
		}
	}

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "(I)V")
	public synchronized void method1586(@OriginalArg(0) int arg0) {
		this.method1564(arg0 << 6, this.method1580());
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(II)V")
	public synchronized void method1587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1552(arg0, arg1, this.method1580());
	}

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "()I")
	public synchronized int method1590() {
		return this.anInt1821 == Integer.MIN_VALUE ? 0 : this.anInt1821;
	}
}
