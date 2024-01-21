import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class6_Sub6_Sub1 extends Class6_Sub6 {

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
	public int anInt995;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
	public int anInt999;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
	public int anInt1000;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
	public int anInt1001;

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
	public int anInt1005;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
	public int anInt1008;

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
	private final int anInt998;

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
	private final int anInt1007;

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "Z")
	private final boolean aBoolean54;

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
	public int anInt1002;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!ta;II)V")
	public Class6_Sub6_Sub1(@OriginalArg(0) Class6_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass6_Sub11_5 = arg0;
		this.anInt998 = arg0.anInt2866;
		this.anInt1007 = arg0.anInt2867;
		this.aBoolean54 = arg0.aBoolean154;
		this.anInt1004 = arg1;
		this.anInt1006 = arg2;
		this.anInt997 = 8192;
		this.anInt1002 = 0;
		this.method771();
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!ta;III)V")
	public Class6_Sub6_Sub1(@OriginalArg(0) Class6_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub11_5 = arg0;
		this.anInt998 = arg0.anInt2866;
		this.anInt1007 = arg0.anInt2867;
		this.aBoolean54 = arg0.aBoolean154;
		this.anInt1004 = arg1;
		this.anInt1006 = arg2;
		this.anInt997 = arg3;
		this.anInt1002 = 0;
		this.method771();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public synchronized void method758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method773(arg0, arg1, this.method776());
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public synchronized void method759(@OriginalArg(0) int arg0) {
		this.method787(arg0 << 6, this.method776());
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "()I")
	@Override
	public int method1919() {
		return this.anInt1006 == 0 && this.anInt1003 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	public synchronized void method760(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1002 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "()I")
	@Override
	public int method1916() {
		@Pc(6) int local6 = this.anInt999 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt996 == 0) {
			local6 -= local6 * this.anInt1002 / (((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34.length << 8);
		} else if (this.anInt996 >= 0) {
			local6 -= local6 * this.anInt998 / ((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "()Lclient!kf;")
	@Override
	public Class6_Sub6 method1913() {
		return null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([IIIII)I")
	private int method766(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1003 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1003;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1003 += arg1;
			if (this.anInt1004 == 256 && (this.anInt1002 & 0xFF) == 0) {
				if (Static52.aBoolean78) {
					arg1 = Static126.method790(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt1008, this.anInt995, this.anInt1005, this.anInt1000, local7, arg2, this);
				} else {
					arg1 = Static126.method782(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt999, this.anInt1001, local7, arg2, this);
				}
			} else if (Static52.aBoolean78) {
				arg1 = Static126.method761(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt1008, this.anInt995, this.anInt1005, this.anInt1000, local7, arg2, this, this.anInt1004, arg4);
			} else {
				arg1 = Static126.method778(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt999, this.anInt1001, local7, arg2, this, this.anInt1004, arg4);
			}
			this.anInt1003 -= arg1;
			if (this.anInt1003 != 0) {
				return arg1;
			}
			if (this.anInt1006 == Integer.MIN_VALUE) {
				this.anInt1006 = 0;
				this.anInt999 = this.anInt1008 = this.anInt995 = 0;
				this.method2123();
				return arg3;
			}
			this.method771();
		}
		if (this.anInt1004 == 256 && (this.anInt1002 & 0xFF) == 0) {
			return Static52.aBoolean78 ? Static126.method770(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt1008, this.anInt995, arg3, arg2, this) : Static126.method769(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt999, arg3, arg2, this);
		} else if (Static52.aBoolean78) {
			return Static126.method765(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt1008, this.anInt995, arg3, arg2, this, this.anInt1004, arg4);
		} else {
			return Static126.method792(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt999, arg3, arg2, this, this.anInt1004, arg4);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1915(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1006 == 0 && this.anInt1003 == 0) {
			this.method1917(arg2);
			return;
		}
		@Pc(13) Class6_Sub11_Sub1 local13 = (Class6_Sub11_Sub1) super.aClass6_Sub11_5;
		@Pc(18) int local18 = this.anInt998 << 8;
		@Pc(23) int local23 = this.anInt1007 << 8;
		@Pc(29) int local29 = local13.aByteArray34.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt996 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1002 < 0) {
			if (this.anInt1004 <= 0) {
				this.method783();
				this.method2123();
				return;
			}
			this.anInt1002 = 0;
		}
		if (this.anInt1002 >= local29) {
			if (this.anInt1004 >= 0) {
				this.method783();
				this.method2123();
				return;
			}
			this.anInt1002 = local29 - 1;
		}
		if (this.anInt996 >= 0) {
			if (this.anInt996 > 0) {
				if (this.aBoolean54) {
					label130: {
						if (this.anInt1004 < 0) {
							local40 = this.method775(arg0, arg1, local18, local44, local13.aByteArray34[this.anInt998]);
							if (this.anInt1002 >= local18) {
								return;
							}
							this.anInt1002 = local18 + local18 - this.anInt1002 - 1;
							this.anInt1004 = -this.anInt1004;
							if (--this.anInt996 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method766(arg0, local40, local23, local44, local13.aByteArray34[this.anInt1007 - 1]);
							if (this.anInt1002 < local23) {
								return;
							}
							this.anInt1002 = local23 + local23 - this.anInt1002 - 1;
							this.anInt1004 = -this.anInt1004;
							if (--this.anInt996 == 0) {
								break;
							}
							local40 = this.method775(arg0, local40, local18, local44, local13.aByteArray34[this.anInt998]);
							if (this.anInt1002 >= local18) {
								return;
							}
							this.anInt1002 = local18 + local18 - this.anInt1002 - 1;
							this.anInt1004 = -this.anInt1004;
						} while (--this.anInt996 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1004 < 0) {
						while (true) {
							local40 = this.method775(arg0, local40, local18, local44, local13.aByteArray34[this.anInt1007 - 1]);
							if (this.anInt1002 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1002 - 1) / local33;
							if (local416 >= this.anInt996) {
								this.anInt1002 += local33 * this.anInt996;
								this.anInt996 = 0;
								break;
							}
							this.anInt1002 += local33 * local416;
							this.anInt996 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method766(arg0, local40, local23, local44, local13.aByteArray34[this.anInt998]);
							if (this.anInt1002 < local23) {
								return;
							}
							local416 = (this.anInt1002 - local18) / local33;
							if (local416 >= this.anInt996) {
								this.anInt1002 -= local33 * this.anInt996;
								this.anInt996 = 0;
								break;
							}
							this.anInt1002 -= local33 * local416;
							this.anInt996 -= local416;
						}
					}
				}
			}
			if (this.anInt1004 < 0) {
				this.method775(arg0, local40, 0, local44, 0);
				if (this.anInt1002 < 0) {
					this.anInt1002 = -1;
					this.method783();
					this.method2123();
					return;
				}
			} else {
				this.method766(arg0, local40, local29, local44, 0);
				if (this.anInt1002 >= local29) {
					this.anInt1002 = local29;
					this.method783();
					this.method2123();
				}
			}
		} else if (this.aBoolean54) {
			if (this.anInt1004 < 0) {
				local40 = this.method775(arg0, arg1, local18, local44, local13.aByteArray34[this.anInt998]);
				if (this.anInt1002 >= local18) {
					return;
				}
				this.anInt1002 = local18 + local18 - this.anInt1002 - 1;
				this.anInt1004 = -this.anInt1004;
			}
			while (true) {
				local40 = this.method766(arg0, local40, local23, local44, local13.aByteArray34[this.anInt1007 - 1]);
				if (this.anInt1002 < local23) {
					return;
				}
				this.anInt1002 = local23 + local23 - this.anInt1002 - 1;
				this.anInt1004 = -this.anInt1004;
				local40 = this.method775(arg0, local40, local18, local44, local13.aByteArray34[this.anInt998]);
				if (this.anInt1002 >= local18) {
					return;
				}
				this.anInt1002 = local18 + local18 - this.anInt1002 - 1;
				this.anInt1004 = -this.anInt1004;
			}
		} else if (this.anInt1004 < 0) {
			while (true) {
				local40 = this.method775(arg0, local40, local18, local44, local13.aByteArray34[this.anInt1007 - 1]);
				if (this.anInt1002 >= local18) {
					return;
				}
				this.anInt1002 = local23 - (local23 - 1 - this.anInt1002) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method766(arg0, local40, local23, local44, local13.aByteArray34[this.anInt998]);
				if (this.anInt1002 < local23) {
					return;
				}
				this.anInt1002 = local18 + (this.anInt1002 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "()V")
	private void method771() {
		this.anInt999 = this.anInt1006;
		this.anInt1008 = Static126.method762(this.anInt1006, this.anInt997);
		this.anInt995 = Static126.method774(this.anInt1006, this.anInt997);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
	public synchronized void method773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method787(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static126.method762(arg1, arg2);
		@Pc(14) int local14 = Static126.method774(arg1, arg2);
		if (this.anInt1008 == local10 && this.anInt995 == local14) {
			this.anInt1003 = 0;
			return;
		}
		this.anInt1003 = arg0;
		this.anInt1006 = arg1;
		this.anInt997 = arg2;
		this.anInt1001 = (arg1 - this.anInt999) / arg0;
		this.anInt1005 = (local10 - this.anInt1008) / arg0;
		this.anInt1000 = (local14 - this.anInt995) / arg0;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "([IIIII)I")
	private int method775(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1003 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1003;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1003 += arg1;
			if (this.anInt1004 == -256 && (this.anInt1002 & 0xFF) == 0) {
				if (Static52.aBoolean78) {
					arg1 = Static126.method763(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt1008, this.anInt995, this.anInt1005, this.anInt1000, local7, arg2, this);
				} else {
					arg1 = Static126.method796(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt999, this.anInt1001, local7, arg2, this);
				}
			} else if (Static52.aBoolean78) {
				arg1 = Static126.method781(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt1008, this.anInt995, this.anInt1005, this.anInt1000, local7, arg2, this, this.anInt1004, arg4);
			} else {
				arg1 = Static126.method777(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt999, this.anInt1001, local7, arg2, this, this.anInt1004, arg4);
			}
			this.anInt1003 -= arg1;
			if (this.anInt1003 != 0) {
				return arg1;
			}
			if (this.anInt1006 == Integer.MIN_VALUE) {
				this.anInt1006 = 0;
				this.anInt999 = this.anInt1008 = this.anInt995 = 0;
				this.method2123();
				return arg3;
			}
			this.method771();
		}
		if (this.anInt1004 == -256 && (this.anInt1002 & 0xFF) == 0) {
			return Static52.aBoolean78 ? Static126.method764(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt1008, this.anInt995, arg3, arg2, this) : Static126.method768(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt999, arg3, arg2, this);
		} else if (Static52.aBoolean78) {
			return Static126.method794(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt1008, this.anInt995, arg3, arg2, this, this.anInt1004, arg4);
		} else {
			return Static126.method767(((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34, arg0, this.anInt1002, arg1, this.anInt999, arg3, arg2, this, this.anInt1004, arg4);
		}
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "()I")
	public synchronized int method776() {
		return this.anInt997 < 0 ? -1 : this.anInt997;
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "()Z")
	public boolean method779() {
		return this.anInt1002 < 0 || this.anInt1002 >= ((Class6_Sub11_Sub1) super.aClass6_Sub11_5).aByteArray34.length << 8;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1917(@OriginalArg(0) int arg0) {
		if (this.anInt1003 > 0) {
			if (arg0 >= this.anInt1003) {
				if (this.anInt1006 == Integer.MIN_VALUE) {
					this.anInt1006 = 0;
					this.anInt999 = this.anInt1008 = this.anInt995 = 0;
					this.method2123();
					arg0 = this.anInt1003;
				}
				this.anInt1003 = 0;
				this.method771();
			} else {
				this.anInt999 += this.anInt1001 * arg0;
				this.anInt1008 += this.anInt1005 * arg0;
				this.anInt995 += this.anInt1000 * arg0;
				this.anInt1003 -= arg0;
			}
		}
		@Pc(71) Class6_Sub11_Sub1 local71 = (Class6_Sub11_Sub1) super.aClass6_Sub11_5;
		@Pc(76) int local76 = this.anInt998 << 8;
		@Pc(81) int local81 = this.anInt1007 << 8;
		@Pc(87) int local87 = local71.aByteArray34.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt996 = 0;
		}
		if (this.anInt1002 < 0) {
			if (this.anInt1004 <= 0) {
				this.method783();
				this.method2123();
				return;
			}
			this.anInt1002 = 0;
		}
		if (this.anInt1002 >= local87) {
			if (this.anInt1004 >= 0) {
				this.method783();
				this.method2123();
				return;
			}
			this.anInt1002 = local87 - 1;
		}
		this.anInt1002 += this.anInt1004 * arg0;
		if (this.anInt996 >= 0) {
			if (this.anInt996 > 0) {
				if (this.aBoolean54) {
					label125: {
						if (this.anInt1004 < 0) {
							if (this.anInt1002 >= local76) {
								return;
							}
							this.anInt1002 = local76 + local76 - this.anInt1002 - 1;
							this.anInt1004 = -this.anInt1004;
							if (--this.anInt996 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1002 < local81) {
								return;
							}
							this.anInt1002 = local81 + local81 - this.anInt1002 - 1;
							this.anInt1004 = -this.anInt1004;
							if (--this.anInt996 == 0) {
								break;
							}
							if (this.anInt1002 >= local76) {
								return;
							}
							this.anInt1002 = local76 + local76 - this.anInt1002 - 1;
							this.anInt1004 = -this.anInt1004;
						} while (--this.anInt996 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1004 < 0) {
						if (this.anInt1002 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1002 - 1) / local91;
						if (local361 < this.anInt996) {
							this.anInt1002 += local91 * local361;
							this.anInt996 -= local361;
							return;
						}
						this.anInt1002 += local91 * this.anInt996;
						this.anInt996 = 0;
					} else if (this.anInt1002 >= local81) {
						local361 = (this.anInt1002 - local76) / local91;
						if (local361 < this.anInt996) {
							this.anInt1002 -= local91 * local361;
							this.anInt996 -= local361;
							return;
						}
						this.anInt1002 -= local91 * this.anInt996;
						this.anInt996 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1004 < 0) {
				if (this.anInt1002 < 0) {
					this.anInt1002 = -1;
					this.method783();
					this.method2123();
					return;
				}
			} else if (this.anInt1002 >= local87) {
				this.anInt1002 = local87;
				this.method783();
				this.method2123();
			}
		} else if (this.aBoolean54) {
			if (this.anInt1004 < 0) {
				if (this.anInt1002 >= local76) {
					return;
				}
				this.anInt1002 = local76 + local76 - this.anInt1002 - 1;
				this.anInt1004 = -this.anInt1004;
			}
			while (this.anInt1002 >= local81) {
				this.anInt1002 = local81 + local81 - this.anInt1002 - 1;
				this.anInt1004 = -this.anInt1004;
				if (this.anInt1002 >= local76) {
					return;
				}
				this.anInt1002 = local76 + local76 - this.anInt1002 - 1;
				this.anInt1004 = -this.anInt1004;
			}
		} else if (this.anInt1004 < 0) {
			if (this.anInt1002 < local76) {
				this.anInt1002 = local81 - (local81 - 1 - this.anInt1002) % local91 - 1;
			}
		} else if (this.anInt1002 >= local81) {
			this.anInt1002 = local76 + (this.anInt1002 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "()I")
	public synchronized int method780() {
		return this.anInt1006 == Integer.MIN_VALUE ? 0 : this.anInt1006;
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "()V")
	private void method783() {
		if (this.anInt1003 == 0) {
			return;
		}
		if (this.anInt1006 == Integer.MIN_VALUE) {
			this.anInt1006 = 0;
		}
		this.anInt1003 = 0;
		this.method771();
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	public synchronized void method784(@OriginalArg(0) int arg0) {
		this.anInt996 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "()Z")
	public boolean method785() {
		return this.anInt1003 != 0;
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V")
	public synchronized void method786(@OriginalArg(0) int arg0) {
		if (this.anInt1004 < 0) {
			this.anInt1004 = -arg0;
		} else {
			this.anInt1004 = arg0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)V")
	private synchronized void method787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1006 = arg0;
		this.anInt997 = arg1;
		this.anInt1003 = 0;
		this.method771();
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)V")
	private synchronized void method788() {
		this.method787(0, this.method776());
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "()I")
	public synchronized int method789() {
		return this.anInt1004 < 0 ? -this.anInt1004 : this.anInt1004;
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "(I)V")
	public synchronized void method791(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method788();
			this.method2123();
		} else if (this.anInt1008 == 0 && this.anInt995 == 0) {
			this.anInt1003 = 0;
			this.anInt1006 = 0;
			this.anInt999 = 0;
			this.method2123();
		} else {
			this.anInt1003 = arg0;
			this.anInt1006 = Integer.MIN_VALUE;
			this.anInt1001 = -this.anInt999 / arg0;
			this.anInt1005 = -this.anInt1008 / arg0;
			this.anInt1000 = -this.anInt995 / arg0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
	public synchronized void method795() {
		this.anInt1004 = (this.anInt1004 ^ this.anInt1004 >> 31) + (this.anInt1004 >>> 31);
		this.anInt1004 = -this.anInt1004;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "()Lclient!kf;")
	@Override
	public Class6_Sub6 method1918() {
		return null;
	}
}
