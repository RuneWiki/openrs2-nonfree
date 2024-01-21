import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!og", name = "v", descriptor = "I")
	public int anInt2816;

	@OriginalMember(owner = "client!og", name = "x", descriptor = "I")
	public int anInt2818;

	@OriginalMember(owner = "client!og", name = "B", descriptor = "I")
	private int anInt2821;

	@OriginalMember(owner = "client!og", name = "D", descriptor = "I")
	public int anInt2823;

	@OriginalMember(owner = "client!og", name = "E", descriptor = "I")
	public int anInt2824;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "I")
	public int anInt2825;

	@OriginalMember(owner = "client!og", name = "J", descriptor = "I")
	public int anInt2828;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "I")
	private int anInt2829;

	@OriginalMember(owner = "client!og", name = "A", descriptor = "I")
	private final int anInt2820;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "I")
	private final int anInt2827;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "Z")
	private final boolean aBoolean113;

	@OriginalMember(owner = "client!og", name = "z", descriptor = "I")
	private int anInt2819;

	@OriginalMember(owner = "client!og", name = "G", descriptor = "I")
	private int anInt2826;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "I")
	private int anInt2817;

	@OriginalMember(owner = "client!og", name = "C", descriptor = "I")
	public int anInt2822;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!oc;II)V")
	public Class3_Sub4_Sub4(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub19_5 = arg0;
		this.anInt2820 = arg0.anInt2751;
		this.anInt2827 = arg0.anInt2749;
		this.aBoolean113 = arg0.aBoolean110;
		this.anInt2819 = arg1;
		this.anInt2826 = arg2;
		this.anInt2817 = 8192;
		this.anInt2822 = 0;
		this.method2012();
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!oc;III)V")
	public Class3_Sub4_Sub4(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub19_5 = arg0;
		this.anInt2820 = arg0.anInt2751;
		this.anInt2827 = arg0.anInt2749;
		this.aBoolean113 = arg0.aBoolean110;
		this.anInt2819 = arg1;
		this.anInt2826 = arg2;
		this.anInt2817 = arg3;
		this.anInt2822 = 0;
		this.method2012();
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "()Z")
	public boolean method1977() {
		return this.anInt2822 < 0 || this.anInt2822 >= ((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37.length << 8;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "()I")
	public synchronized int method1978() {
		return this.anInt2819 < 0 ? -this.anInt2819 : this.anInt2819;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([IIIII)I")
	private int method1980(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2829 <= 0) {
				if (this.anInt2819 == 256 && (this.anInt2822 & 0xFF) == 0) {
					if (Static112.aBoolean97) {
						return Static202.method1990(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2816, this.anInt2823, arg3, arg2, this);
					}
					return Static202.method2011(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2825, arg3, arg2, this);
				}
				if (Static112.aBoolean97) {
					return Static202.method2002(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2816, this.anInt2823, arg3, arg2, this, this.anInt2819, arg4);
				}
				return Static202.method1984(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2825, arg3, arg2, this, this.anInt2819, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2829;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2829 += arg1;
			if (this.anInt2819 == 256 && (this.anInt2822 & 0xFF) == 0) {
				if (Static112.aBoolean97) {
					arg1 = Static202.method2004(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2816, this.anInt2823, this.anInt2818, this.anInt2828, local5, arg2, this);
				} else {
					arg1 = Static202.method1989(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2825, this.anInt2824, local5, arg2, this);
				}
			} else if (Static112.aBoolean97) {
				arg1 = Static202.method1983(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2816, this.anInt2823, this.anInt2818, this.anInt2828, local5, arg2, this, this.anInt2819, arg4);
			} else {
				arg1 = Static202.method1998(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2825, this.anInt2824, local5, arg2, this, this.anInt2819, arg4);
			}
			this.anInt2829 -= arg1;
			if (this.anInt2829 != 0) {
				return arg1;
			}
		} while (!this.method2014());
		return arg3;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
	public synchronized void method1981(@OriginalArg(0) int arg0) {
		if (this.anInt2819 < 0) {
			this.anInt2819 = -arg0;
		} else {
			this.anInt2819 = arg0;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public synchronized void method1982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2008(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static202.method2007(arg1, arg2);
		@Pc(14) int local14 = Static202.method1986(arg1, arg2);
		if (this.anInt2816 == local10 && this.anInt2823 == local14) {
			this.anInt2829 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2825;
		if (this.anInt2825 - arg1 > local31) {
			local31 = this.anInt2825 - arg1;
		}
		if (local10 - this.anInt2816 > local31) {
			local31 = local10 - this.anInt2816;
		}
		if (this.anInt2816 - local10 > local31) {
			local31 = this.anInt2816 - local10;
		}
		if (local14 - this.anInt2823 > local31) {
			local31 = local14 - this.anInt2823;
		}
		if (this.anInt2823 - local14 > local31) {
			local31 = this.anInt2823 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2829 = arg0;
		this.anInt2826 = arg1;
		this.anInt2817 = arg2;
		this.anInt2824 = (arg1 - this.anInt2825) / arg0;
		this.anInt2818 = (local10 - this.anInt2816) / arg0;
		this.anInt2828 = (local14 - this.anInt2823) / arg0;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1975(@OriginalArg(0) int arg0) {
		if (this.anInt2829 > 0) {
			if (arg0 >= this.anInt2829) {
				if (this.anInt2826 == Integer.MIN_VALUE) {
					this.anInt2826 = 0;
					this.anInt2825 = this.anInt2816 = this.anInt2823 = 0;
					this.method3159();
					arg0 = this.anInt2829;
				}
				this.anInt2829 = 0;
				this.method2012();
			} else {
				this.anInt2825 += this.anInt2824 * arg0;
				this.anInt2816 += this.anInt2818 * arg0;
				this.anInt2823 += this.anInt2828 * arg0;
				this.anInt2829 -= arg0;
			}
		}
		@Pc(71) Class3_Sub19_Sub1 local71 = (Class3_Sub19_Sub1) super.aClass3_Sub19_5;
		@Pc(76) int local76 = this.anInt2820 << 8;
		@Pc(81) int local81 = this.anInt2827 << 8;
		@Pc(87) int local87 = local71.aByteArray37.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2821 = 0;
		}
		if (this.anInt2822 < 0) {
			if (this.anInt2819 <= 0) {
				this.method2016();
				this.method3159();
				return;
			}
			this.anInt2822 = 0;
		}
		if (this.anInt2822 >= local87) {
			if (this.anInt2819 >= 0) {
				this.method2016();
				this.method3159();
				return;
			}
			this.anInt2822 = local87 - 1;
		}
		this.anInt2822 += this.anInt2819 * arg0;
		if (this.anInt2821 >= 0) {
			if (this.anInt2821 > 0) {
				if (this.aBoolean113) {
					label125: {
						if (this.anInt2819 < 0) {
							if (this.anInt2822 >= local76) {
								return;
							}
							this.anInt2822 = local76 + local76 - this.anInt2822 - 1;
							this.anInt2819 = -this.anInt2819;
							if (--this.anInt2821 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2822 < local81) {
								return;
							}
							this.anInt2822 = local81 + local81 - this.anInt2822 - 1;
							this.anInt2819 = -this.anInt2819;
							if (--this.anInt2821 == 0) {
								break;
							}
							if (this.anInt2822 >= local76) {
								return;
							}
							this.anInt2822 = local76 + local76 - this.anInt2822 - 1;
							this.anInt2819 = -this.anInt2819;
						} while (--this.anInt2821 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2819 < 0) {
						if (this.anInt2822 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2822 - 1) / local91;
						if (local361 < this.anInt2821) {
							this.anInt2822 += local91 * local361;
							this.anInt2821 -= local361;
							return;
						}
						this.anInt2822 += local91 * this.anInt2821;
						this.anInt2821 = 0;
					} else if (this.anInt2822 >= local81) {
						local361 = (this.anInt2822 - local76) / local91;
						if (local361 < this.anInt2821) {
							this.anInt2822 -= local91 * local361;
							this.anInt2821 -= local361;
							return;
						}
						this.anInt2822 -= local91 * this.anInt2821;
						this.anInt2821 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2819 < 0) {
				if (this.anInt2822 < 0) {
					this.anInt2822 = -1;
					this.method2016();
					this.method3159();
					return;
				}
			} else if (this.anInt2822 >= local87) {
				this.anInt2822 = local87;
				this.method2016();
				this.method3159();
			}
		} else if (this.aBoolean113) {
			if (this.anInt2819 < 0) {
				if (this.anInt2822 >= local76) {
					return;
				}
				this.anInt2822 = local76 + local76 - this.anInt2822 - 1;
				this.anInt2819 = -this.anInt2819;
			}
			while (this.anInt2822 >= local81) {
				this.anInt2822 = local81 + local81 - this.anInt2822 - 1;
				this.anInt2819 = -this.anInt2819;
				if (this.anInt2822 >= local76) {
					return;
				}
				this.anInt2822 = local76 + local76 - this.anInt2822 - 1;
				this.anInt2819 = -this.anInt2819;
			}
		} else if (this.anInt2819 < 0) {
			if (this.anInt2822 < local76) {
				this.anInt2822 = local81 - (local81 - 1 - this.anInt2822) % local91 - 1;
			}
		} else if (this.anInt2822 >= local81) {
			this.anInt2822 = local76 + (this.anInt2822 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
	public synchronized void method1985(@OriginalArg(0) int arg0) {
		this.method2008(arg0 << 6, this.method2015());
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
	private synchronized void method1987() {
		this.method2008(0, this.method2015());
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)V")
	public synchronized void method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1982(arg0, arg1, this.method2015());
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	public synchronized void method1991(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1987();
			this.method3159();
		} else if (this.anInt2816 == 0 && this.anInt2823 == 0) {
			this.anInt2829 = 0;
			this.anInt2826 = 0;
			this.anInt2825 = 0;
			this.method3159();
		} else {
			@Pc(31) int local31 = -this.anInt2825;
			if (this.anInt2825 > local31) {
				local31 = this.anInt2825;
			}
			if (-this.anInt2816 > local31) {
				local31 = -this.anInt2816;
			}
			if (this.anInt2816 > local31) {
				local31 = this.anInt2816;
			}
			if (-this.anInt2823 > local31) {
				local31 = -this.anInt2823;
			}
			if (this.anInt2823 > local31) {
				local31 = this.anInt2823;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2829 = arg0;
			this.anInt2826 = Integer.MIN_VALUE;
			this.anInt2824 = -this.anInt2825 / arg0;
			this.anInt2818 = -this.anInt2816 / arg0;
			this.anInt2828 = -this.anInt2823 / arg0;
		}
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(I)V")
	public synchronized void method1994(@OriginalArg(0) int arg0) {
		this.anInt2821 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "(I)V")
	public synchronized void method1995(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2822 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "()Z")
	public boolean method1997() {
		return this.anInt2829 != 0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	public synchronized void method2001() {
		this.anInt2819 = (this.anInt2819 ^ this.anInt2819 >> 31) + (this.anInt2819 >>> 31);
		this.anInt2819 = -this.anInt2819;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1971(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2826 == 0 && this.anInt2829 == 0) {
			this.method1975(arg2);
			return;
		}
		@Pc(13) Class3_Sub19_Sub1 local13 = (Class3_Sub19_Sub1) super.aClass3_Sub19_5;
		@Pc(18) int local18 = this.anInt2820 << 8;
		@Pc(23) int local23 = this.anInt2827 << 8;
		@Pc(29) int local29 = local13.aByteArray37.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2821 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2822 < 0) {
			if (this.anInt2819 <= 0) {
				this.method2016();
				this.method3159();
				return;
			}
			this.anInt2822 = 0;
		}
		if (this.anInt2822 >= local29) {
			if (this.anInt2819 >= 0) {
				this.method2016();
				this.method3159();
				return;
			}
			this.anInt2822 = local29 - 1;
		}
		if (this.anInt2821 >= 0) {
			if (this.anInt2821 > 0) {
				if (this.aBoolean113) {
					label130: {
						if (this.anInt2819 < 0) {
							local40 = this.method2010(arg0, arg1, local18, local44, local13.aByteArray37[this.anInt2820]);
							if (this.anInt2822 >= local18) {
								return;
							}
							this.anInt2822 = local18 + local18 - this.anInt2822 - 1;
							this.anInt2819 = -this.anInt2819;
							if (--this.anInt2821 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1980(arg0, local40, local23, local44, local13.aByteArray37[this.anInt2827 - 1]);
							if (this.anInt2822 < local23) {
								return;
							}
							this.anInt2822 = local23 + local23 - this.anInt2822 - 1;
							this.anInt2819 = -this.anInt2819;
							if (--this.anInt2821 == 0) {
								break;
							}
							local40 = this.method2010(arg0, local40, local18, local44, local13.aByteArray37[this.anInt2820]);
							if (this.anInt2822 >= local18) {
								return;
							}
							this.anInt2822 = local18 + local18 - this.anInt2822 - 1;
							this.anInt2819 = -this.anInt2819;
						} while (--this.anInt2821 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2819 < 0) {
						while (true) {
							local40 = this.method2010(arg0, local40, local18, local44, local13.aByteArray37[this.anInt2827 - 1]);
							if (this.anInt2822 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2822 - 1) / local33;
							if (local416 >= this.anInt2821) {
								this.anInt2822 += local33 * this.anInt2821;
								this.anInt2821 = 0;
								break;
							}
							this.anInt2822 += local33 * local416;
							this.anInt2821 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1980(arg0, local40, local23, local44, local13.aByteArray37[this.anInt2820]);
							if (this.anInt2822 < local23) {
								return;
							}
							local416 = (this.anInt2822 - local18) / local33;
							if (local416 >= this.anInt2821) {
								this.anInt2822 -= local33 * this.anInt2821;
								this.anInt2821 = 0;
								break;
							}
							this.anInt2822 -= local33 * local416;
							this.anInt2821 -= local416;
						}
					}
				}
			}
			if (this.anInt2819 < 0) {
				this.method2010(arg0, local40, 0, local44, 0);
				if (this.anInt2822 < 0) {
					this.anInt2822 = -1;
					this.method2016();
					this.method3159();
					return;
				}
			} else {
				this.method1980(arg0, local40, local29, local44, 0);
				if (this.anInt2822 >= local29) {
					this.anInt2822 = local29;
					this.method2016();
					this.method3159();
				}
			}
		} else if (this.aBoolean113) {
			if (this.anInt2819 < 0) {
				local40 = this.method2010(arg0, arg1, local18, local44, local13.aByteArray37[this.anInt2820]);
				if (this.anInt2822 >= local18) {
					return;
				}
				this.anInt2822 = local18 + local18 - this.anInt2822 - 1;
				this.anInt2819 = -this.anInt2819;
			}
			while (true) {
				local40 = this.method1980(arg0, local40, local23, local44, local13.aByteArray37[this.anInt2827 - 1]);
				if (this.anInt2822 < local23) {
					return;
				}
				this.anInt2822 = local23 + local23 - this.anInt2822 - 1;
				this.anInt2819 = -this.anInt2819;
				local40 = this.method2010(arg0, local40, local18, local44, local13.aByteArray37[this.anInt2820]);
				if (this.anInt2822 >= local18) {
					return;
				}
				this.anInt2822 = local18 + local18 - this.anInt2822 - 1;
				this.anInt2819 = -this.anInt2819;
			}
		} else if (this.anInt2819 < 0) {
			while (true) {
				local40 = this.method2010(arg0, local40, local18, local44, local13.aByteArray37[this.anInt2827 - 1]);
				if (this.anInt2822 >= local18) {
					return;
				}
				this.anInt2822 = local23 - (local23 - 1 - this.anInt2822) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1980(arg0, local40, local23, local44, local13.aByteArray37[this.anInt2820]);
				if (this.anInt2822 < local23) {
					return;
				}
				this.anInt2822 = local18 + (this.anInt2822 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(II)V")
	private synchronized void method2008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2826 = arg0;
		this.anInt2817 = arg1;
		this.anInt2829 = 0;
		this.method2012();
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "([IIIII)I")
	private int method2010(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2829 <= 0) {
				if (this.anInt2819 == -256 && (this.anInt2822 & 0xFF) == 0) {
					if (Static112.aBoolean97) {
						return Static202.method2003(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2816, this.anInt2823, arg3, arg2, this);
					}
					return Static202.method1999(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2825, arg3, arg2, this);
				}
				if (Static112.aBoolean97) {
					return Static202.method1979(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2816, this.anInt2823, arg3, arg2, this, this.anInt2819, arg4);
				}
				return Static202.method2006(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2825, arg3, arg2, this, this.anInt2819, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2829;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2829 += arg1;
			if (this.anInt2819 == -256 && (this.anInt2822 & 0xFF) == 0) {
				if (Static112.aBoolean97) {
					arg1 = Static202.method2000(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2816, this.anInt2823, this.anInt2818, this.anInt2828, local5, arg2, this);
				} else {
					arg1 = Static202.method2009(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2825, this.anInt2824, local5, arg2, this);
				}
			} else if (Static112.aBoolean97) {
				arg1 = Static202.method1992(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2816, this.anInt2823, this.anInt2818, this.anInt2828, local5, arg2, this, this.anInt2819, arg4);
			} else {
				arg1 = Static202.method1993(((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37, arg0, this.anInt2822, arg1, this.anInt2825, this.anInt2824, local5, arg2, this, this.anInt2819, arg4);
			}
			this.anInt2829 -= arg1;
			if (this.anInt2829 != 0) {
				return arg1;
			}
		} while (!this.method2014());
		return arg3;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "()I")
	@Override
	public int method1974() {
		@Pc(6) int local6 = this.anInt2825 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2821 == 0) {
			local6 -= local6 * this.anInt2822 / (((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37.length << 8);
		} else if (this.anInt2821 >= 0) {
			local6 -= local6 * this.anInt2820 / ((Class3_Sub19_Sub1) super.aClass3_Sub19_5).aByteArray37.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "()V")
	private void method2012() {
		this.anInt2825 = this.anInt2826;
		this.anInt2816 = Static202.method2007(this.anInt2826, this.anInt2817);
		this.anInt2823 = Static202.method1986(this.anInt2826, this.anInt2817);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "()Lclient!pg;")
	@Override
	public Class3_Sub4 method1973() {
		return null;
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "()I")
	public synchronized int method2013() {
		return this.anInt2826 == Integer.MIN_VALUE ? 0 : this.anInt2826;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "()Lclient!pg;")
	@Override
	public Class3_Sub4 method1976() {
		return null;
	}

	@OriginalMember(owner = "client!og", name = "j", descriptor = "()Z")
	private boolean method2014() {
		@Pc(2) int local2 = this.anInt2826;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static202.method2007(local2, this.anInt2817);
			local8 = Static202.method1986(local2, this.anInt2817);
		}
		if (this.anInt2825 != local2 || this.anInt2816 != local10 || this.anInt2823 != local8) {
			if (this.anInt2825 < local2) {
				this.anInt2824 = 1;
				this.anInt2829 = local2 - this.anInt2825;
			} else if (this.anInt2825 > local2) {
				this.anInt2824 = -1;
				this.anInt2829 = this.anInt2825 - local2;
			} else {
				this.anInt2824 = 0;
			}
			if (this.anInt2816 < local10) {
				this.anInt2818 = 1;
				if (this.anInt2829 == 0 || this.anInt2829 > local10 - this.anInt2816) {
					this.anInt2829 = local10 - this.anInt2816;
				}
			} else if (this.anInt2816 > local10) {
				this.anInt2818 = -1;
				if (this.anInt2829 == 0 || this.anInt2829 > this.anInt2816 - local10) {
					this.anInt2829 = this.anInt2816 - local10;
				}
			} else {
				this.anInt2818 = 0;
			}
			if (this.anInt2823 < local8) {
				this.anInt2828 = 1;
				if (this.anInt2829 == 0 || this.anInt2829 > local8 - this.anInt2823) {
					this.anInt2829 = local8 - this.anInt2823;
				}
			} else if (this.anInt2823 > local8) {
				this.anInt2828 = -1;
				if (this.anInt2829 == 0 || this.anInt2829 > this.anInt2823 - local8) {
					this.anInt2829 = this.anInt2823 - local8;
				}
			} else {
				this.anInt2828 = 0;
			}
			return false;
		} else if (this.anInt2826 == Integer.MIN_VALUE) {
			this.anInt2826 = 0;
			this.anInt2825 = this.anInt2816 = this.anInt2823 = 0;
			this.method3159();
			return true;
		} else {
			this.method2012();
			return false;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()I")
	@Override
	public int method1970() {
		return this.anInt2826 == 0 && this.anInt2829 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!og", name = "k", descriptor = "()I")
	public synchronized int method2015() {
		return this.anInt2817 < 0 ? -1 : this.anInt2817;
	}

	@OriginalMember(owner = "client!og", name = "l", descriptor = "()V")
	private void method2016() {
		if (this.anInt2829 == 0) {
			return;
		}
		if (this.anInt2826 == Integer.MIN_VALUE) {
			this.anInt2826 = 0;
		}
		this.anInt2829 = 0;
		this.method2012();
	}
}
