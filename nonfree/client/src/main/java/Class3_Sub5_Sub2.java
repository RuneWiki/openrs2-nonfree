import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 {

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
	public int anInt2802;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
	public int anInt2804;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
	public int anInt2805;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
	public int anInt2807;

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
	private int anInt2808;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
	public int anInt2810;

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
	private int anInt2811;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
	public int anInt2812;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
	private final int anInt2806;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
	private final int anInt2803;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "Z")
	private final boolean aBoolean261;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
	private int anInt2809;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
	private int anInt2801;

	@OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
	private int anInt2814;

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
	public int anInt2813;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!bq;II)V")
	public Class3_Sub5_Sub2(@OriginalArg(0) Class3_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub6_5 = arg0;
		this.anInt2806 = arg0.anInt1041;
		this.anInt2803 = arg0.anInt1040;
		this.aBoolean261 = arg0.aBoolean95;
		this.anInt2809 = arg1;
		this.anInt2801 = arg2;
		this.anInt2814 = 8192;
		this.anInt2813 = 0;
		this.method2117();
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!bq;III)V")
	public Class3_Sub5_Sub2(@OriginalArg(0) Class3_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub6_5 = arg0;
		this.anInt2806 = arg0.anInt1041;
		this.anInt2803 = arg0.anInt1040;
		this.aBoolean261 = arg0.aBoolean95;
		this.anInt2809 = arg1;
		this.anInt2801 = arg2;
		this.anInt2814 = arg3;
		this.anInt2813 = 0;
		this.method2117();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "()I")
	@Override
	public int method5118() {
		@Pc(6) int local6 = this.anInt2807 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2811 == 0) {
			local6 -= local6 * this.anInt2813 / (((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16.length << 8);
		} else if (this.anInt2811 >= 0) {
			local6 -= local6 * this.anInt2806 / ((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5119(@OriginalArg(0) int arg0) {
		if (this.anInt2808 > 0) {
			if (arg0 >= this.anInt2808) {
				if (this.anInt2801 == Integer.MIN_VALUE) {
					this.anInt2801 = 0;
					this.anInt2807 = this.anInt2812 = this.anInt2802 = 0;
					this.method5977();
					arg0 = this.anInt2808;
				}
				this.anInt2808 = 0;
				this.method2117();
			} else {
				this.anInt2807 += this.anInt2810 * arg0;
				this.anInt2812 += this.anInt2805 * arg0;
				this.anInt2802 += this.anInt2804 * arg0;
				this.anInt2808 -= arg0;
			}
		}
		@Pc(71) Class3_Sub6_Sub1 local71 = (Class3_Sub6_Sub1) super.aClass3_Sub6_5;
		@Pc(76) int local76 = this.anInt2806 << 8;
		@Pc(81) int local81 = this.anInt2803 << 8;
		@Pc(87) int local87 = local71.aByteArray16.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2811 = 0;
		}
		if (this.anInt2813 < 0) {
			if (this.anInt2809 <= 0) {
				this.method2088();
				this.method5977();
				return;
			}
			this.anInt2813 = 0;
		}
		if (this.anInt2813 >= local87) {
			if (this.anInt2809 >= 0) {
				this.method2088();
				this.method5977();
				return;
			}
			this.anInt2813 = local87 - 1;
		}
		this.anInt2813 += this.anInt2809 * arg0;
		if (this.anInt2811 >= 0) {
			if (this.anInt2811 > 0) {
				if (this.aBoolean261) {
					label125: {
						if (this.anInt2809 < 0) {
							if (this.anInt2813 >= local76) {
								return;
							}
							this.anInt2813 = local76 + local76 - this.anInt2813 - 1;
							this.anInt2809 = -this.anInt2809;
							if (--this.anInt2811 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2813 < local81) {
								return;
							}
							this.anInt2813 = local81 + local81 - this.anInt2813 - 1;
							this.anInt2809 = -this.anInt2809;
							if (--this.anInt2811 == 0) {
								break;
							}
							if (this.anInt2813 >= local76) {
								return;
							}
							this.anInt2813 = local76 + local76 - this.anInt2813 - 1;
							this.anInt2809 = -this.anInt2809;
						} while (--this.anInt2811 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2809 < 0) {
						if (this.anInt2813 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2813 - 1) / local91;
						if (local361 < this.anInt2811) {
							this.anInt2813 += local91 * local361;
							this.anInt2811 -= local361;
							return;
						}
						this.anInt2813 += local91 * this.anInt2811;
						this.anInt2811 = 0;
					} else if (this.anInt2813 >= local81) {
						local361 = (this.anInt2813 - local76) / local91;
						if (local361 < this.anInt2811) {
							this.anInt2813 -= local91 * local361;
							this.anInt2811 -= local361;
							return;
						}
						this.anInt2813 -= local91 * this.anInt2811;
						this.anInt2811 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2809 < 0) {
				if (this.anInt2813 < 0) {
					this.anInt2813 = -1;
					this.method2088();
					this.method5977();
					return;
				}
			} else if (this.anInt2813 >= local87) {
				this.anInt2813 = local87;
				this.method2088();
				this.method5977();
			}
		} else if (this.aBoolean261) {
			if (this.anInt2809 < 0) {
				if (this.anInt2813 >= local76) {
					return;
				}
				this.anInt2813 = local76 + local76 - this.anInt2813 - 1;
				this.anInt2809 = -this.anInt2809;
			}
			while (this.anInt2813 >= local81) {
				this.anInt2813 = local81 + local81 - this.anInt2813 - 1;
				this.anInt2809 = -this.anInt2809;
				if (this.anInt2813 >= local76) {
					return;
				}
				this.anInt2813 = local76 + local76 - this.anInt2813 - 1;
				this.anInt2809 = -this.anInt2809;
			}
		} else if (this.anInt2809 < 0) {
			if (this.anInt2813 < local76) {
				this.anInt2813 = local81 - (local81 - 1 - this.anInt2813) % local91 - 1;
			}
		} else if (this.anInt2813 >= local81) {
			this.anInt2813 = local76 + (this.anInt2813 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "()Lclient!bl;")
	@Override
	public Class3_Sub5 method5123() {
		return null;
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "()V")
	private void method2088() {
		if (this.anInt2808 == 0) {
			return;
		}
		if (this.anInt2801 == Integer.MIN_VALUE) {
			this.anInt2801 = 0;
		}
		this.anInt2808 = 0;
		this.method2117();
	}

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "()Z")
	private boolean method2090() {
		@Pc(2) int local2 = this.anInt2801;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static458.method2116(local2, this.anInt2814);
			local8 = Static458.method2110(local2, this.anInt2814);
		}
		if (this.anInt2807 != local2 || this.anInt2812 != local10 || this.anInt2802 != local8) {
			if (this.anInt2807 < local2) {
				this.anInt2810 = 1;
				this.anInt2808 = local2 - this.anInt2807;
			} else if (this.anInt2807 > local2) {
				this.anInt2810 = -1;
				this.anInt2808 = this.anInt2807 - local2;
			} else {
				this.anInt2810 = 0;
			}
			if (this.anInt2812 < local10) {
				this.anInt2805 = 1;
				if (this.anInt2808 == 0 || this.anInt2808 > local10 - this.anInt2812) {
					this.anInt2808 = local10 - this.anInt2812;
				}
			} else if (this.anInt2812 > local10) {
				this.anInt2805 = -1;
				if (this.anInt2808 == 0 || this.anInt2808 > this.anInt2812 - local10) {
					this.anInt2808 = this.anInt2812 - local10;
				}
			} else {
				this.anInt2805 = 0;
			}
			if (this.anInt2802 < local8) {
				this.anInt2804 = 1;
				if (this.anInt2808 == 0 || this.anInt2808 > local8 - this.anInt2802) {
					this.anInt2808 = local8 - this.anInt2802;
				}
			} else if (this.anInt2802 > local8) {
				this.anInt2804 = -1;
				if (this.anInt2808 == 0 || this.anInt2808 > this.anInt2802 - local8) {
					this.anInt2808 = this.anInt2802 - local8;
				}
			} else {
				this.anInt2804 = 0;
			}
			return false;
		} else if (this.anInt2801 == Integer.MIN_VALUE) {
			this.anInt2801 = 0;
			this.anInt2807 = this.anInt2812 = this.anInt2802 = 0;
			this.method5977();
			return true;
		} else {
			this.method2117();
			return false;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V")
	public synchronized void method2092() {
		this.anInt2809 = (this.anInt2809 ^ this.anInt2809 >> 31) + (this.anInt2809 >>> 31);
		this.anInt2809 = -this.anInt2809;
	}

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "()I")
	public synchronized int method2095() {
		return this.anInt2814 < 0 ? -1 : this.anInt2814;
	}

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "()I")
	public synchronized int method2096() {
		return this.anInt2809 < 0 ? -this.anInt2809 : this.anInt2809;
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V")
	public synchronized void method2097(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2813 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V")
	public synchronized void method2098(@OriginalArg(0) int arg0) {
		this.method2101(arg0 << 6, this.method2095());
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "()I")
	@Override
	public int method5122() {
		return this.anInt2801 == 0 && this.anInt2808 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V")
	public synchronized void method2100(@OriginalArg(0) int arg0) {
		this.anInt2811 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
	private synchronized void method2101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2801 = arg0;
		this.anInt2814 = arg1;
		this.anInt2808 = 0;
		this.method2117();
	}

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "()I")
	public synchronized int method2102() {
		return this.anInt2801 == Integer.MIN_VALUE ? 0 : this.anInt2801;
	}

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)V")
	private synchronized void method2103() {
		this.method2101(0, this.method2095());
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([IIIII)I")
	private int method2107(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2808 <= 0) {
				if (this.anInt2809 == 256 && (this.anInt2813 & 0xFF) == 0) {
					if (Static324.aBoolean657) {
						return Static458.method2087(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2812, this.anInt2802, arg3, arg2, this);
					}
					return Static458.method2106(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2807, arg3, arg2, this);
				}
				if (Static324.aBoolean657) {
					return Static458.method2123(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2812, this.anInt2802, arg3, arg2, this, this.anInt2809, arg4);
				}
				return Static458.method2094(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2807, arg3, arg2, this, this.anInt2809, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2808;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2808 += arg1;
			if (this.anInt2809 == 256 && (this.anInt2813 & 0xFF) == 0) {
				if (Static324.aBoolean657) {
					arg1 = Static458.method2086(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2812, this.anInt2802, this.anInt2805, this.anInt2804, local5, arg2, this);
				} else {
					arg1 = Static458.method2099(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2807, this.anInt2810, local5, arg2, this);
				}
			} else if (Static324.aBoolean657) {
				arg1 = Static458.method2108(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2812, this.anInt2802, this.anInt2805, this.anInt2804, local5, arg2, this, this.anInt2809, arg4);
			} else {
				arg1 = Static458.method2105(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2807, this.anInt2810, local5, arg2, this, this.anInt2809, arg4);
			}
			this.anInt2808 -= arg1;
			if (this.anInt2808 != 0) {
				return arg1;
			}
		} while (!this.method2090());
		return arg3;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	public synchronized void method2109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2101(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static458.method2116(arg1, arg2);
		@Pc(14) int local14 = Static458.method2110(arg1, arg2);
		if (this.anInt2812 == local10 && this.anInt2802 == local14) {
			this.anInt2808 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2807;
		if (this.anInt2807 - arg1 > local31) {
			local31 = this.anInt2807 - arg1;
		}
		if (local10 - this.anInt2812 > local31) {
			local31 = local10 - this.anInt2812;
		}
		if (this.anInt2812 - local10 > local31) {
			local31 = this.anInt2812 - local10;
		}
		if (local14 - this.anInt2802 > local31) {
			local31 = local14 - this.anInt2802;
		}
		if (this.anInt2802 - local14 > local31) {
			local31 = this.anInt2802 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2808 = arg0;
		this.anInt2801 = arg1;
		this.anInt2814 = arg2;
		this.anInt2810 = (arg1 - this.anInt2807) / arg0;
		this.anInt2805 = (local10 - this.anInt2812) / arg0;
		this.anInt2804 = (local14 - this.anInt2802) / arg0;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "()Lclient!bl;")
	@Override
	public Class3_Sub5 method5120() {
		return null;
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)V")
	public synchronized void method2112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2109(arg0, arg1, this.method2095());
	}

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "()Z")
	public boolean method2113() {
		return this.anInt2808 != 0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5117(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2801 == 0 && this.anInt2808 == 0) {
			this.method5119(arg2);
			return;
		}
		@Pc(13) Class3_Sub6_Sub1 local13 = (Class3_Sub6_Sub1) super.aClass3_Sub6_5;
		@Pc(18) int local18 = this.anInt2806 << 8;
		@Pc(23) int local23 = this.anInt2803 << 8;
		@Pc(29) int local29 = local13.aByteArray16.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2811 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2813 < 0) {
			if (this.anInt2809 <= 0) {
				this.method2088();
				this.method5977();
				return;
			}
			this.anInt2813 = 0;
		}
		if (this.anInt2813 >= local29) {
			if (this.anInt2809 >= 0) {
				this.method2088();
				this.method5977();
				return;
			}
			this.anInt2813 = local29 - 1;
		}
		if (this.anInt2811 >= 0) {
			if (this.anInt2811 > 0) {
				if (this.aBoolean261) {
					label130: {
						if (this.anInt2809 < 0) {
							local40 = this.method2115(arg0, arg1, local18, local44, local13.aByteArray16[this.anInt2806]);
							if (this.anInt2813 >= local18) {
								return;
							}
							this.anInt2813 = local18 + local18 - this.anInt2813 - 1;
							this.anInt2809 = -this.anInt2809;
							if (--this.anInt2811 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2107(arg0, local40, local23, local44, local13.aByteArray16[this.anInt2803 - 1]);
							if (this.anInt2813 < local23) {
								return;
							}
							this.anInt2813 = local23 + local23 - this.anInt2813 - 1;
							this.anInt2809 = -this.anInt2809;
							if (--this.anInt2811 == 0) {
								break;
							}
							local40 = this.method2115(arg0, local40, local18, local44, local13.aByteArray16[this.anInt2806]);
							if (this.anInt2813 >= local18) {
								return;
							}
							this.anInt2813 = local18 + local18 - this.anInt2813 - 1;
							this.anInt2809 = -this.anInt2809;
						} while (--this.anInt2811 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2809 < 0) {
						while (true) {
							local40 = this.method2115(arg0, local40, local18, local44, local13.aByteArray16[this.anInt2803 - 1]);
							if (this.anInt2813 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2813 - 1) / local33;
							if (local416 >= this.anInt2811) {
								this.anInt2813 += local33 * this.anInt2811;
								this.anInt2811 = 0;
								break;
							}
							this.anInt2813 += local33 * local416;
							this.anInt2811 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2107(arg0, local40, local23, local44, local13.aByteArray16[this.anInt2806]);
							if (this.anInt2813 < local23) {
								return;
							}
							local416 = (this.anInt2813 - local18) / local33;
							if (local416 >= this.anInt2811) {
								this.anInt2813 -= local33 * this.anInt2811;
								this.anInt2811 = 0;
								break;
							}
							this.anInt2813 -= local33 * local416;
							this.anInt2811 -= local416;
						}
					}
				}
			}
			if (this.anInt2809 < 0) {
				this.method2115(arg0, local40, 0, local44, 0);
				if (this.anInt2813 < 0) {
					this.anInt2813 = -1;
					this.method2088();
					this.method5977();
					return;
				}
			} else {
				this.method2107(arg0, local40, local29, local44, 0);
				if (this.anInt2813 >= local29) {
					this.anInt2813 = local29;
					this.method2088();
					this.method5977();
				}
			}
		} else if (this.aBoolean261) {
			if (this.anInt2809 < 0) {
				local40 = this.method2115(arg0, arg1, local18, local44, local13.aByteArray16[this.anInt2806]);
				if (this.anInt2813 >= local18) {
					return;
				}
				this.anInt2813 = local18 + local18 - this.anInt2813 - 1;
				this.anInt2809 = -this.anInt2809;
			}
			while (true) {
				local40 = this.method2107(arg0, local40, local23, local44, local13.aByteArray16[this.anInt2803 - 1]);
				if (this.anInt2813 < local23) {
					return;
				}
				this.anInt2813 = local23 + local23 - this.anInt2813 - 1;
				this.anInt2809 = -this.anInt2809;
				local40 = this.method2115(arg0, local40, local18, local44, local13.aByteArray16[this.anInt2806]);
				if (this.anInt2813 >= local18) {
					return;
				}
				this.anInt2813 = local18 + local18 - this.anInt2813 - 1;
				this.anInt2809 = -this.anInt2809;
			}
		} else if (this.anInt2809 < 0) {
			while (true) {
				local40 = this.method2115(arg0, local40, local18, local44, local13.aByteArray16[this.anInt2803 - 1]);
				if (this.anInt2813 >= local18) {
					return;
				}
				this.anInt2813 = local23 - (local23 - 1 - this.anInt2813) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2107(arg0, local40, local23, local44, local13.aByteArray16[this.anInt2806]);
				if (this.anInt2813 < local23) {
					return;
				}
				this.anInt2813 = local18 + (this.anInt2813 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "(I)V")
	public synchronized void method2114(@OriginalArg(0) int arg0) {
		if (this.anInt2809 < 0) {
			this.anInt2809 = -arg0;
		} else {
			this.anInt2809 = arg0;
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "([IIIII)I")
	private int method2115(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2808 <= 0) {
				if (this.anInt2809 == -256 && (this.anInt2813 & 0xFF) == 0) {
					if (Static324.aBoolean657) {
						return Static458.method2091(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2812, this.anInt2802, arg3, arg2, this);
					}
					return Static458.method2111(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2807, arg3, arg2, this);
				}
				if (Static324.aBoolean657) {
					return Static458.method2089(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2812, this.anInt2802, arg3, arg2, this, this.anInt2809, arg4);
				}
				return Static458.method2120(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2807, arg3, arg2, this, this.anInt2809, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2808;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2808 += arg1;
			if (this.anInt2809 == -256 && (this.anInt2813 & 0xFF) == 0) {
				if (Static324.aBoolean657) {
					arg1 = Static458.method2124(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2812, this.anInt2802, this.anInt2805, this.anInt2804, local5, arg2, this);
				} else {
					arg1 = Static458.method2093(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2807, this.anInt2810, local5, arg2, this);
				}
			} else if (Static324.aBoolean657) {
				arg1 = Static458.method2118(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2812, this.anInt2802, this.anInt2805, this.anInt2804, local5, arg2, this, this.anInt2809, arg4);
			} else {
				arg1 = Static458.method2122(((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16, arg0, this.anInt2813, arg1, this.anInt2807, this.anInt2810, local5, arg2, this, this.anInt2809, arg4);
			}
			this.anInt2808 -= arg1;
			if (this.anInt2808 != 0) {
				return arg1;
			}
		} while (!this.method2090());
		return arg3;
	}

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "()V")
	private void method2117() {
		this.anInt2807 = this.anInt2801;
		this.anInt2812 = Static458.method2116(this.anInt2801, this.anInt2814);
		this.anInt2802 = Static458.method2110(this.anInt2801, this.anInt2814);
	}

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "()Z")
	public boolean method2119() {
		return this.anInt2813 < 0 || this.anInt2813 >= ((Class3_Sub6_Sub1) super.aClass3_Sub6_5).aByteArray16.length << 8;
	}

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "(I)V")
	public synchronized void method2121(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2103();
			this.method5977();
		} else if (this.anInt2812 == 0 && this.anInt2802 == 0) {
			this.anInt2808 = 0;
			this.anInt2801 = 0;
			this.anInt2807 = 0;
			this.method5977();
		} else {
			@Pc(31) int local31 = -this.anInt2807;
			if (this.anInt2807 > local31) {
				local31 = this.anInt2807;
			}
			if (-this.anInt2812 > local31) {
				local31 = -this.anInt2812;
			}
			if (this.anInt2812 > local31) {
				local31 = this.anInt2812;
			}
			if (-this.anInt2802 > local31) {
				local31 = -this.anInt2802;
			}
			if (this.anInt2802 > local31) {
				local31 = this.anInt2802;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2808 = arg0;
			this.anInt2801 = Integer.MIN_VALUE;
			this.anInt2810 = -this.anInt2807 / arg0;
			this.anInt2805 = -this.anInt2812 / arg0;
			this.anInt2804 = -this.anInt2802 / arg0;
		}
	}
}
