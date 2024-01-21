import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!m", name = "y", descriptor = "I")
	private int anInt2418;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "I")
	public int anInt2420;

	@OriginalMember(owner = "client!m", name = "D", descriptor = "I")
	public int anInt2421;

	@OriginalMember(owner = "client!m", name = "G", descriptor = "I")
	public int anInt2424;

	@OriginalMember(owner = "client!m", name = "J", descriptor = "I")
	public int anInt2426;

	@OriginalMember(owner = "client!m", name = "L", descriptor = "I")
	public int anInt2427;

	@OriginalMember(owner = "client!m", name = "M", descriptor = "I")
	private int anInt2428;

	@OriginalMember(owner = "client!m", name = "N", descriptor = "I")
	public int anInt2429;

	@OriginalMember(owner = "client!m", name = "F", descriptor = "I")
	private final int anInt2423;

	@OriginalMember(owner = "client!m", name = "O", descriptor = "I")
	private final int anInt2430;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "Z")
	private final boolean aBoolean104;

	@OriginalMember(owner = "client!m", name = "I", descriptor = "I")
	private int anInt2425;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "I")
	private int anInt2419;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "I")
	private int anInt2422;

	@OriginalMember(owner = "client!m", name = "P", descriptor = "I")
	public int anInt2431;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!jb;II)V")
	public Class2_Sub9_Sub1(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub5_5 = arg0;
		this.anInt2423 = arg0.anInt1943;
		this.anInt2430 = arg0.anInt1945;
		this.aBoolean104 = arg0.aBoolean85;
		this.anInt2425 = arg1;
		this.anInt2419 = arg2;
		this.anInt2422 = 8192;
		this.anInt2431 = 0;
		this.method1722();
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!jb;III)V")
	public Class2_Sub9_Sub1(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub5_5 = arg0;
		this.anInt2423 = arg0.anInt1943;
		this.anInt2430 = arg0.anInt1945;
		this.aBoolean104 = arg0.aBoolean85;
		this.anInt2425 = arg1;
		this.anInt2419 = arg2;
		this.anInt2422 = arg3;
		this.anInt2431 = 0;
		this.method1722();
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "()I")
	@Override
	public int method2931() {
		return this.anInt2419 == 0 && this.anInt2428 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "()I")
	public synchronized int method1705() {
		return this.anInt2422 < 0 ? -1 : this.anInt2422;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	public synchronized void method1707(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2431 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "()I")
	public synchronized int method1709() {
		return this.anInt2425 < 0 ? -this.anInt2425 : this.anInt2425;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "()Lclient!ig;")
	@Override
	public Class2_Sub9 method2926() {
		return null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()Lclient!ig;")
	@Override
	public Class2_Sub9 method2925() {
		return null;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "()I")
	@Override
	public int method2928() {
		@Pc(6) int local6 = this.anInt2421 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2418 == 0) {
			local6 -= local6 * this.anInt2431 / (((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28.length << 8);
		} else if (this.anInt2418 >= 0) {
			local6 -= local6 * this.anInt2423 / ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
	public synchronized void method1713(@OriginalArg(0) int arg0) {
		if (this.anInt2425 < 0) {
			this.anInt2425 = -arg0;
		} else {
			this.anInt2425 = arg0;
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(II)V")
	public synchronized void method1714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1734(arg0, arg1, this.method1705());
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "()Z")
	public boolean method1716() {
		return this.anInt2428 != 0;
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "()Z")
	public boolean method1717() {
		return this.anInt2431 < 0 || this.anInt2431 >= ((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28.length << 8;
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
	public synchronized void method1719(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1728();
			this.method3004();
		} else if (this.anInt2424 == 0 && this.anInt2427 == 0) {
			this.anInt2428 = 0;
			this.anInt2419 = 0;
			this.anInt2421 = 0;
			this.method3004();
		} else {
			@Pc(31) int local31 = -this.anInt2421;
			if (this.anInt2421 > local31) {
				local31 = this.anInt2421;
			}
			if (-this.anInt2424 > local31) {
				local31 = -this.anInt2424;
			}
			if (this.anInt2424 > local31) {
				local31 = this.anInt2424;
			}
			if (-this.anInt2427 > local31) {
				local31 = -this.anInt2427;
			}
			if (this.anInt2427 > local31) {
				local31 = this.anInt2427;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2428 = arg0;
			this.anInt2419 = Integer.MIN_VALUE;
			this.anInt2429 = -this.anInt2421 / arg0;
			this.anInt2420 = -this.anInt2424 / arg0;
			this.anInt2426 = -this.anInt2427 / arg0;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	public synchronized void method1720() {
		this.anInt2425 = (this.anInt2425 ^ this.anInt2425 >> 31) + (this.anInt2425 >>> 31);
		this.anInt2425 = -this.anInt2425;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2927(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2419 == 0 && this.anInt2428 == 0) {
			this.method2930(arg2);
			return;
		}
		@Pc(13) Class2_Sub5_Sub1 local13 = (Class2_Sub5_Sub1) super.aClass2_Sub5_5;
		@Pc(18) int local18 = this.anInt2423 << 8;
		@Pc(23) int local23 = this.anInt2430 << 8;
		@Pc(29) int local29 = local13.aByteArray28.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2418 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2431 < 0) {
			if (this.anInt2425 <= 0) {
				this.method1733();
				this.method3004();
				return;
			}
			this.anInt2431 = 0;
		}
		if (this.anInt2431 >= local29) {
			if (this.anInt2425 >= 0) {
				this.method1733();
				this.method3004();
				return;
			}
			this.anInt2431 = local29 - 1;
		}
		if (this.anInt2418 >= 0) {
			if (this.anInt2418 > 0) {
				if (this.aBoolean104) {
					label130: {
						if (this.anInt2425 < 0) {
							local40 = this.method1730(arg0, arg1, local18, local44, local13.aByteArray28[this.anInt2423]);
							if (this.anInt2431 >= local18) {
								return;
							}
							this.anInt2431 = local18 + local18 - this.anInt2431 - 1;
							this.anInt2425 = -this.anInt2425;
							if (--this.anInt2418 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1740(arg0, local40, local23, local44, local13.aByteArray28[this.anInt2430 - 1]);
							if (this.anInt2431 < local23) {
								return;
							}
							this.anInt2431 = local23 + local23 - this.anInt2431 - 1;
							this.anInt2425 = -this.anInt2425;
							if (--this.anInt2418 == 0) {
								break;
							}
							local40 = this.method1730(arg0, local40, local18, local44, local13.aByteArray28[this.anInt2423]);
							if (this.anInt2431 >= local18) {
								return;
							}
							this.anInt2431 = local18 + local18 - this.anInt2431 - 1;
							this.anInt2425 = -this.anInt2425;
						} while (--this.anInt2418 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2425 < 0) {
						while (true) {
							local40 = this.method1730(arg0, local40, local18, local44, local13.aByteArray28[this.anInt2430 - 1]);
							if (this.anInt2431 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2431 - 1) / local33;
							if (local416 >= this.anInt2418) {
								this.anInt2431 += local33 * this.anInt2418;
								this.anInt2418 = 0;
								break;
							}
							this.anInt2431 += local33 * local416;
							this.anInt2418 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1740(arg0, local40, local23, local44, local13.aByteArray28[this.anInt2423]);
							if (this.anInt2431 < local23) {
								return;
							}
							local416 = (this.anInt2431 - local18) / local33;
							if (local416 >= this.anInt2418) {
								this.anInt2431 -= local33 * this.anInt2418;
								this.anInt2418 = 0;
								break;
							}
							this.anInt2431 -= local33 * local416;
							this.anInt2418 -= local416;
						}
					}
				}
			}
			if (this.anInt2425 < 0) {
				this.method1730(arg0, local40, 0, local44, 0);
				if (this.anInt2431 < 0) {
					this.anInt2431 = -1;
					this.method1733();
					this.method3004();
					return;
				}
			} else {
				this.method1740(arg0, local40, local29, local44, 0);
				if (this.anInt2431 >= local29) {
					this.anInt2431 = local29;
					this.method1733();
					this.method3004();
				}
			}
		} else if (this.aBoolean104) {
			if (this.anInt2425 < 0) {
				local40 = this.method1730(arg0, arg1, local18, local44, local13.aByteArray28[this.anInt2423]);
				if (this.anInt2431 >= local18) {
					return;
				}
				this.anInt2431 = local18 + local18 - this.anInt2431 - 1;
				this.anInt2425 = -this.anInt2425;
			}
			while (true) {
				local40 = this.method1740(arg0, local40, local23, local44, local13.aByteArray28[this.anInt2430 - 1]);
				if (this.anInt2431 < local23) {
					return;
				}
				this.anInt2431 = local23 + local23 - this.anInt2431 - 1;
				this.anInt2425 = -this.anInt2425;
				local40 = this.method1730(arg0, local40, local18, local44, local13.aByteArray28[this.anInt2423]);
				if (this.anInt2431 >= local18) {
					return;
				}
				this.anInt2431 = local18 + local18 - this.anInt2431 - 1;
				this.anInt2425 = -this.anInt2425;
			}
		} else if (this.anInt2425 < 0) {
			while (true) {
				local40 = this.method1730(arg0, local40, local18, local44, local13.aByteArray28[this.anInt2430 - 1]);
				if (this.anInt2431 >= local18) {
					return;
				}
				this.anInt2431 = local23 - (local23 - 1 - this.anInt2431) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1740(arg0, local40, local23, local44, local13.aByteArray28[this.anInt2423]);
				if (this.anInt2431 < local23) {
					return;
				}
				this.anInt2431 = local18 + (this.anInt2431 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "()V")
	private void method1722() {
		this.anInt2421 = this.anInt2419;
		this.anInt2424 = Static187.method1703(this.anInt2419, this.anInt2422);
		this.anInt2427 = Static187.method1706(this.anInt2419, this.anInt2422);
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V")
	public synchronized void method1723(@OriginalArg(0) int arg0) {
		this.anInt2418 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(II)V")
	private synchronized void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2419 = arg0;
		this.anInt2422 = arg1;
		this.anInt2428 = 0;
		this.method1722();
	}

	@OriginalMember(owner = "client!m", name = "j", descriptor = "()I")
	public synchronized int method1727() {
		return this.anInt2419 == Integer.MIN_VALUE ? 0 : this.anInt2419;
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "(I)V")
	private synchronized void method1728() {
		this.method1725(0, this.method1705());
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([IIIII)I")
	private int method1730(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2428 <= 0) {
				if (this.anInt2425 == -256 && (this.anInt2431 & 0xFF) == 0) {
					if (Static46.aBoolean62) {
						return Static187.method1731(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2424, this.anInt2427, arg3, arg2, this);
					}
					return Static187.method1729(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2421, arg3, arg2, this);
				}
				if (Static46.aBoolean62) {
					return Static187.method1715(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2424, this.anInt2427, arg3, arg2, this, this.anInt2425, arg4);
				}
				return Static187.method1724(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2421, arg3, arg2, this, this.anInt2425, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2428;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2428 += arg1;
			if (this.anInt2425 == -256 && (this.anInt2431 & 0xFF) == 0) {
				if (Static46.aBoolean62) {
					arg1 = Static187.method1704(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2424, this.anInt2427, this.anInt2420, this.anInt2426, local5, arg2, this);
				} else {
					arg1 = Static187.method1737(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2421, this.anInt2429, local5, arg2, this);
				}
			} else if (Static46.aBoolean62) {
				arg1 = Static187.method1732(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2424, this.anInt2427, this.anInt2420, this.anInt2426, local5, arg2, this, this.anInt2425, arg4);
			} else {
				arg1 = Static187.method1726(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2421, this.anInt2429, local5, arg2, this, this.anInt2425, arg4);
			}
			this.anInt2428 -= arg1;
			if (this.anInt2428 != 0) {
				return arg1;
			}
		} while (!this.method1739());
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "k", descriptor = "()V")
	private void method1733() {
		if (this.anInt2428 == 0) {
			return;
		}
		if (this.anInt2419 == Integer.MIN_VALUE) {
			this.anInt2419 = 0;
		}
		this.anInt2428 = 0;
		this.method1722();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
	public synchronized void method1734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1725(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static187.method1703(arg1, arg2);
		@Pc(14) int local14 = Static187.method1706(arg1, arg2);
		if (this.anInt2424 == local10 && this.anInt2427 == local14) {
			this.anInt2428 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2421;
		if (this.anInt2421 - arg1 > local31) {
			local31 = this.anInt2421 - arg1;
		}
		if (local10 - this.anInt2424 > local31) {
			local31 = local10 - this.anInt2424;
		}
		if (this.anInt2424 - local10 > local31) {
			local31 = this.anInt2424 - local10;
		}
		if (local14 - this.anInt2427 > local31) {
			local31 = local14 - this.anInt2427;
		}
		if (this.anInt2427 - local14 > local31) {
			local31 = this.anInt2427 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2428 = arg0;
		this.anInt2419 = arg1;
		this.anInt2422 = arg2;
		this.anInt2429 = (arg1 - this.anInt2421) / arg0;
		this.anInt2420 = (local10 - this.anInt2424) / arg0;
		this.anInt2426 = (local14 - this.anInt2427) / arg0;
	}

	@OriginalMember(owner = "client!m", name = "j", descriptor = "(I)V")
	public synchronized void method1735(@OriginalArg(0) int arg0) {
		this.method1725(arg0 << 6, this.method1705());
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2930(@OriginalArg(0) int arg0) {
		if (this.anInt2428 > 0) {
			if (arg0 >= this.anInt2428) {
				if (this.anInt2419 == Integer.MIN_VALUE) {
					this.anInt2419 = 0;
					this.anInt2421 = this.anInt2424 = this.anInt2427 = 0;
					this.method3004();
					arg0 = this.anInt2428;
				}
				this.anInt2428 = 0;
				this.method1722();
			} else {
				this.anInt2421 += this.anInt2429 * arg0;
				this.anInt2424 += this.anInt2420 * arg0;
				this.anInt2427 += this.anInt2426 * arg0;
				this.anInt2428 -= arg0;
			}
		}
		@Pc(71) Class2_Sub5_Sub1 local71 = (Class2_Sub5_Sub1) super.aClass2_Sub5_5;
		@Pc(76) int local76 = this.anInt2423 << 8;
		@Pc(81) int local81 = this.anInt2430 << 8;
		@Pc(87) int local87 = local71.aByteArray28.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2418 = 0;
		}
		if (this.anInt2431 < 0) {
			if (this.anInt2425 <= 0) {
				this.method1733();
				this.method3004();
				return;
			}
			this.anInt2431 = 0;
		}
		if (this.anInt2431 >= local87) {
			if (this.anInt2425 >= 0) {
				this.method1733();
				this.method3004();
				return;
			}
			this.anInt2431 = local87 - 1;
		}
		this.anInt2431 += this.anInt2425 * arg0;
		if (this.anInt2418 >= 0) {
			if (this.anInt2418 > 0) {
				if (this.aBoolean104) {
					label125: {
						if (this.anInt2425 < 0) {
							if (this.anInt2431 >= local76) {
								return;
							}
							this.anInt2431 = local76 + local76 - this.anInt2431 - 1;
							this.anInt2425 = -this.anInt2425;
							if (--this.anInt2418 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2431 < local81) {
								return;
							}
							this.anInt2431 = local81 + local81 - this.anInt2431 - 1;
							this.anInt2425 = -this.anInt2425;
							if (--this.anInt2418 == 0) {
								break;
							}
							if (this.anInt2431 >= local76) {
								return;
							}
							this.anInt2431 = local76 + local76 - this.anInt2431 - 1;
							this.anInt2425 = -this.anInt2425;
						} while (--this.anInt2418 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2425 < 0) {
						if (this.anInt2431 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2431 - 1) / local91;
						if (local361 < this.anInt2418) {
							this.anInt2431 += local91 * local361;
							this.anInt2418 -= local361;
							return;
						}
						this.anInt2431 += local91 * this.anInt2418;
						this.anInt2418 = 0;
					} else if (this.anInt2431 >= local81) {
						local361 = (this.anInt2431 - local76) / local91;
						if (local361 < this.anInt2418) {
							this.anInt2431 -= local91 * local361;
							this.anInt2418 -= local361;
							return;
						}
						this.anInt2431 -= local91 * this.anInt2418;
						this.anInt2418 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2425 < 0) {
				if (this.anInt2431 < 0) {
					this.anInt2431 = -1;
					this.method1733();
					this.method3004();
					return;
				}
			} else if (this.anInt2431 >= local87) {
				this.anInt2431 = local87;
				this.method1733();
				this.method3004();
			}
		} else if (this.aBoolean104) {
			if (this.anInt2425 < 0) {
				if (this.anInt2431 >= local76) {
					return;
				}
				this.anInt2431 = local76 + local76 - this.anInt2431 - 1;
				this.anInt2425 = -this.anInt2425;
			}
			while (this.anInt2431 >= local81) {
				this.anInt2431 = local81 + local81 - this.anInt2431 - 1;
				this.anInt2425 = -this.anInt2425;
				if (this.anInt2431 >= local76) {
					return;
				}
				this.anInt2431 = local76 + local76 - this.anInt2431 - 1;
				this.anInt2425 = -this.anInt2425;
			}
		} else if (this.anInt2425 < 0) {
			if (this.anInt2431 < local76) {
				this.anInt2431 = local81 - (local81 - 1 - this.anInt2431) % local91 - 1;
			}
		} else if (this.anInt2431 >= local81) {
			this.anInt2431 = local76 + (this.anInt2431 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!m", name = "l", descriptor = "()Z")
	private boolean method1739() {
		@Pc(2) int local2 = this.anInt2419;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static187.method1703(local2, this.anInt2422);
			local8 = Static187.method1706(local2, this.anInt2422);
		}
		if (this.anInt2421 != local2 || this.anInt2424 != local10 || this.anInt2427 != local8) {
			if (this.anInt2421 < local2) {
				this.anInt2429 = 1;
				this.anInt2428 = local2 - this.anInt2421;
			} else if (this.anInt2421 > local2) {
				this.anInt2429 = -1;
				this.anInt2428 = this.anInt2421 - local2;
			} else {
				this.anInt2429 = 0;
			}
			if (this.anInt2424 < local10) {
				this.anInt2420 = 1;
				if (this.anInt2428 == 0 || this.anInt2428 > local10 - this.anInt2424) {
					this.anInt2428 = local10 - this.anInt2424;
				}
			} else if (this.anInt2424 > local10) {
				this.anInt2420 = -1;
				if (this.anInt2428 == 0 || this.anInt2428 > this.anInt2424 - local10) {
					this.anInt2428 = this.anInt2424 - local10;
				}
			} else {
				this.anInt2420 = 0;
			}
			if (this.anInt2427 < local8) {
				this.anInt2426 = 1;
				if (this.anInt2428 == 0 || this.anInt2428 > local8 - this.anInt2427) {
					this.anInt2428 = local8 - this.anInt2427;
				}
			} else if (this.anInt2427 > local8) {
				this.anInt2426 = -1;
				if (this.anInt2428 == 0 || this.anInt2428 > this.anInt2427 - local8) {
					this.anInt2428 = this.anInt2427 - local8;
				}
			} else {
				this.anInt2426 = 0;
			}
			return false;
		} else if (this.anInt2419 == Integer.MIN_VALUE) {
			this.anInt2419 = 0;
			this.anInt2421 = this.anInt2424 = this.anInt2427 = 0;
			this.method3004();
			return true;
		} else {
			this.method1722();
			return false;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([IIIII)I")
	private int method1740(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2428 <= 0) {
				if (this.anInt2425 == 256 && (this.anInt2431 & 0xFF) == 0) {
					if (Static46.aBoolean62) {
						return Static187.method1721(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2424, this.anInt2427, arg3, arg2, this);
					}
					return Static187.method1741(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2421, arg3, arg2, this);
				}
				if (Static46.aBoolean62) {
					return Static187.method1736(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2424, this.anInt2427, arg3, arg2, this, this.anInt2425, arg4);
				}
				return Static187.method1712(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2421, arg3, arg2, this, this.anInt2425, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2428;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2428 += arg1;
			if (this.anInt2425 == 256 && (this.anInt2431 & 0xFF) == 0) {
				if (Static46.aBoolean62) {
					arg1 = Static187.method1742(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2424, this.anInt2427, this.anInt2420, this.anInt2426, local5, arg2, this);
				} else {
					arg1 = Static187.method1710(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2421, this.anInt2429, local5, arg2, this);
				}
			} else if (Static46.aBoolean62) {
				arg1 = Static187.method1718(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2424, this.anInt2427, this.anInt2420, this.anInt2426, local5, arg2, this, this.anInt2425, arg4);
			} else {
				arg1 = Static187.method1711(((Class2_Sub5_Sub1) super.aClass2_Sub5_5).aByteArray28, arg0, this.anInt2431, arg1, this.anInt2421, this.anInt2429, local5, arg2, this, this.anInt2425, arg4);
			}
			this.anInt2428 -= arg1;
			if (this.anInt2428 != 0) {
				return arg1;
			}
		} while (!this.method1739());
		return arg3;
	}
}
