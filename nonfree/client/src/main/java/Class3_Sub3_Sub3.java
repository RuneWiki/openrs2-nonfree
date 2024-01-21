import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
	private int anInt2644;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
	private int anInt2645;

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
	public int anInt2646;

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
	public int anInt2651;

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
	public int anInt2654;

	@OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
	public int anInt2655;

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
	public int anInt2656;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
	private final int anInt2652;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	private final int anInt2643;

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "Z")
	private final boolean aBoolean154;

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
	private int anInt2653;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
	private int anInt2650;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
	private int anInt2648;

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
	public int anInt2649;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!nb;II)V")
	public Class3_Sub3_Sub3(@OriginalArg(0) Class3_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub5_5 = arg0;
		this.anInt2652 = arg0.anInt2122;
		this.anInt2643 = arg0.anInt2120;
		this.aBoolean154 = arg0.aBoolean107;
		this.anInt2653 = arg1;
		this.anInt2650 = arg2;
		this.anInt2648 = 8192;
		this.anInt2649 = 0;
		this.method1831();
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!nb;III)V")
	public Class3_Sub3_Sub3(@OriginalArg(0) Class3_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub5_5 = arg0;
		this.anInt2652 = arg0.anInt2122;
		this.anInt2643 = arg0.anInt2120;
		this.aBoolean154 = arg0.aBoolean107;
		this.anInt2653 = arg1;
		this.anInt2650 = arg2;
		this.anInt2648 = arg3;
		this.anInt2649 = 0;
		this.method1831();
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "()I")
	public synchronized int method1815() {
		return this.anInt2650 == Integer.MIN_VALUE ? 0 : this.anInt2650;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	public synchronized void method1816(@OriginalArg(0) int arg0) {
		if (this.anInt2653 < 0) {
			this.anInt2653 = -arg0;
		} else {
			this.anInt2653 = arg0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIIII)I")
	private int method1822(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2644 <= 0) {
				if (this.anInt2653 == -256 && (this.anInt2649 & 0xFF) == 0) {
					if (Static31.aBoolean156) {
						return Static139.method1846(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2654, this.anInt2647, arg3, arg2, this);
					}
					return Static139.method1832(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2655, arg3, arg2, this);
				}
				if (Static31.aBoolean156) {
					return Static139.method1814(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2654, this.anInt2647, arg3, arg2, this, this.anInt2653, arg4);
				}
				return Static139.method1827(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2655, arg3, arg2, this, this.anInt2653, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2644;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2644 += arg1;
			if (this.anInt2653 == -256 && (this.anInt2649 & 0xFF) == 0) {
				if (Static31.aBoolean156) {
					arg1 = Static139.method1817(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2654, this.anInt2647, this.anInt2656, this.anInt2651, local5, arg2, this);
				} else {
					arg1 = Static139.method1818(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2655, this.anInt2646, local5, arg2, this);
				}
			} else if (Static31.aBoolean156) {
				arg1 = Static139.method1821(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2654, this.anInt2647, this.anInt2656, this.anInt2651, local5, arg2, this, this.anInt2653, arg4);
			} else {
				arg1 = Static139.method1847(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2655, this.anInt2646, local5, arg2, this, this.anInt2653, arg4);
			}
			this.anInt2644 -= arg1;
			if (this.anInt2644 != 0) {
				return arg1;
			}
		} while (!this.method1837());
		return arg3;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "()Z")
	public boolean method1823() {
		return this.anInt2649 < 0 || this.anInt2649 >= ((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23.length << 8;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "([IIIII)I")
	private int method1828(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2644 <= 0) {
				if (this.anInt2653 == 256 && (this.anInt2649 & 0xFF) == 0) {
					if (Static31.aBoolean156) {
						return Static139.method1841(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2654, this.anInt2647, arg3, arg2, this);
					}
					return Static139.method1824(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2655, arg3, arg2, this);
				}
				if (Static31.aBoolean156) {
					return Static139.method1825(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2654, this.anInt2647, arg3, arg2, this, this.anInt2653, arg4);
				}
				return Static139.method1848(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2655, arg3, arg2, this, this.anInt2653, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2644;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2644 += arg1;
			if (this.anInt2653 == 256 && (this.anInt2649 & 0xFF) == 0) {
				if (Static31.aBoolean156) {
					arg1 = Static139.method1820(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2654, this.anInt2647, this.anInt2656, this.anInt2651, local5, arg2, this);
				} else {
					arg1 = Static139.method1833(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2655, this.anInt2646, local5, arg2, this);
				}
			} else if (Static31.aBoolean156) {
				arg1 = Static139.method1853(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2654, this.anInt2647, this.anInt2656, this.anInt2651, local5, arg2, this, this.anInt2653, arg4);
			} else {
				arg1 = Static139.method1850(((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23, arg0, this.anInt2649, arg1, this.anInt2655, this.anInt2646, local5, arg2, this, this.anInt2653, arg4);
			}
			this.anInt2644 -= arg1;
			if (this.anInt2644 != 0) {
				return arg1;
			}
		} while (!this.method1837());
		return arg3;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	public synchronized void method1829(@OriginalArg(0) int arg0) {
		this.anInt2645 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "()Lclient!da;")
	@Override
	public Class3_Sub3 method2147() {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
	public synchronized void method1830(@OriginalArg(0) int arg0) {
		this.method1836(arg0 << 6, this.method1838());
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "()V")
	private void method1831() {
		this.anInt2655 = this.anInt2650;
		this.anInt2654 = Static139.method1852(this.anInt2650, this.anInt2648);
		this.anInt2647 = Static139.method1819(this.anInt2650, this.anInt2648);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2146(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2650 == 0 && this.anInt2644 == 0) {
			this.method2148(arg2);
			return;
		}
		@Pc(13) Class3_Sub5_Sub1 local13 = (Class3_Sub5_Sub1) super.aClass3_Sub5_5;
		@Pc(18) int local18 = this.anInt2652 << 8;
		@Pc(23) int local23 = this.anInt2643 << 8;
		@Pc(29) int local29 = local13.aByteArray23.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2645 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2649 < 0) {
			if (this.anInt2653 <= 0) {
				this.method1843();
				this.method2201();
				return;
			}
			this.anInt2649 = 0;
		}
		if (this.anInt2649 >= local29) {
			if (this.anInt2653 >= 0) {
				this.method1843();
				this.method2201();
				return;
			}
			this.anInt2649 = local29 - 1;
		}
		if (this.anInt2645 >= 0) {
			if (this.anInt2645 > 0) {
				if (this.aBoolean154) {
					label130: {
						if (this.anInt2653 < 0) {
							local40 = this.method1822(arg0, arg1, local18, local44, local13.aByteArray23[this.anInt2652]);
							if (this.anInt2649 >= local18) {
								return;
							}
							this.anInt2649 = local18 + local18 - this.anInt2649 - 1;
							this.anInt2653 = -this.anInt2653;
							if (--this.anInt2645 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1828(arg0, local40, local23, local44, local13.aByteArray23[this.anInt2643 - 1]);
							if (this.anInt2649 < local23) {
								return;
							}
							this.anInt2649 = local23 + local23 - this.anInt2649 - 1;
							this.anInt2653 = -this.anInt2653;
							if (--this.anInt2645 == 0) {
								break;
							}
							local40 = this.method1822(arg0, local40, local18, local44, local13.aByteArray23[this.anInt2652]);
							if (this.anInt2649 >= local18) {
								return;
							}
							this.anInt2649 = local18 + local18 - this.anInt2649 - 1;
							this.anInt2653 = -this.anInt2653;
						} while (--this.anInt2645 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2653 < 0) {
						while (true) {
							local40 = this.method1822(arg0, local40, local18, local44, local13.aByteArray23[this.anInt2643 - 1]);
							if (this.anInt2649 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2649 - 1) / local33;
							if (local416 >= this.anInt2645) {
								this.anInt2649 += local33 * this.anInt2645;
								this.anInt2645 = 0;
								break;
							}
							this.anInt2649 += local33 * local416;
							this.anInt2645 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1828(arg0, local40, local23, local44, local13.aByteArray23[this.anInt2652]);
							if (this.anInt2649 < local23) {
								return;
							}
							local416 = (this.anInt2649 - local18) / local33;
							if (local416 >= this.anInt2645) {
								this.anInt2649 -= local33 * this.anInt2645;
								this.anInt2645 = 0;
								break;
							}
							this.anInt2649 -= local33 * local416;
							this.anInt2645 -= local416;
						}
					}
				}
			}
			if (this.anInt2653 < 0) {
				this.method1822(arg0, local40, 0, local44, 0);
				if (this.anInt2649 < 0) {
					this.anInt2649 = -1;
					this.method1843();
					this.method2201();
					return;
				}
			} else {
				this.method1828(arg0, local40, local29, local44, 0);
				if (this.anInt2649 >= local29) {
					this.anInt2649 = local29;
					this.method1843();
					this.method2201();
				}
			}
		} else if (this.aBoolean154) {
			if (this.anInt2653 < 0) {
				local40 = this.method1822(arg0, arg1, local18, local44, local13.aByteArray23[this.anInt2652]);
				if (this.anInt2649 >= local18) {
					return;
				}
				this.anInt2649 = local18 + local18 - this.anInt2649 - 1;
				this.anInt2653 = -this.anInt2653;
			}
			while (true) {
				local40 = this.method1828(arg0, local40, local23, local44, local13.aByteArray23[this.anInt2643 - 1]);
				if (this.anInt2649 < local23) {
					return;
				}
				this.anInt2649 = local23 + local23 - this.anInt2649 - 1;
				this.anInt2653 = -this.anInt2653;
				local40 = this.method1822(arg0, local40, local18, local44, local13.aByteArray23[this.anInt2652]);
				if (this.anInt2649 >= local18) {
					return;
				}
				this.anInt2649 = local18 + local18 - this.anInt2649 - 1;
				this.anInt2653 = -this.anInt2653;
			}
		} else if (this.anInt2653 < 0) {
			while (true) {
				local40 = this.method1822(arg0, local40, local18, local44, local13.aByteArray23[this.anInt2643 - 1]);
				if (this.anInt2649 >= local18) {
					return;
				}
				this.anInt2649 = local23 - (local23 - 1 - this.anInt2649) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1828(arg0, local40, local23, local44, local13.aByteArray23[this.anInt2652]);
				if (this.anInt2649 < local23) {
					return;
				}
				this.anInt2649 = local18 + (this.anInt2649 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
	public synchronized void method1834(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2649 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
	private synchronized void method1835() {
		this.method1836(0, this.method1838());
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V")
	private synchronized void method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2650 = arg0;
		this.anInt2648 = arg1;
		this.anInt2644 = 0;
		this.method1831();
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "()Z")
	private boolean method1837() {
		@Pc(2) int local2 = this.anInt2650;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static139.method1852(local2, this.anInt2648);
			local8 = Static139.method1819(local2, this.anInt2648);
		}
		if (this.anInt2655 != local2 || this.anInt2654 != local10 || this.anInt2647 != local8) {
			if (this.anInt2655 < local2) {
				this.anInt2646 = 1;
				this.anInt2644 = local2 - this.anInt2655;
			} else if (this.anInt2655 > local2) {
				this.anInt2646 = -1;
				this.anInt2644 = this.anInt2655 - local2;
			} else {
				this.anInt2646 = 0;
			}
			if (this.anInt2654 < local10) {
				this.anInt2656 = 1;
				if (this.anInt2644 == 0 || this.anInt2644 > local10 - this.anInt2654) {
					this.anInt2644 = local10 - this.anInt2654;
				}
			} else if (this.anInt2654 > local10) {
				this.anInt2656 = -1;
				if (this.anInt2644 == 0 || this.anInt2644 > this.anInt2654 - local10) {
					this.anInt2644 = this.anInt2654 - local10;
				}
			} else {
				this.anInt2656 = 0;
			}
			if (this.anInt2647 < local8) {
				this.anInt2651 = 1;
				if (this.anInt2644 == 0 || this.anInt2644 > local8 - this.anInt2647) {
					this.anInt2644 = local8 - this.anInt2647;
				}
			} else if (this.anInt2647 > local8) {
				this.anInt2651 = -1;
				if (this.anInt2644 == 0 || this.anInt2644 > this.anInt2647 - local8) {
					this.anInt2644 = this.anInt2647 - local8;
				}
			} else {
				this.anInt2651 = 0;
			}
			return false;
		} else if (this.anInt2650 == Integer.MIN_VALUE) {
			this.anInt2650 = 0;
			this.anInt2655 = this.anInt2654 = this.anInt2647 = 0;
			this.method2201();
			return true;
		} else {
			this.method1831();
			return false;
		}
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "()I")
	public synchronized int method1838() {
		return this.anInt2648 < 0 ? -1 : this.anInt2648;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)V")
	public synchronized void method1839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1844(arg0, arg1, this.method1838());
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()I")
	@Override
	public int method2144() {
		return this.anInt2650 == 0 && this.anInt2644 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
	public synchronized void method1842() {
		this.anInt2653 = (this.anInt2653 ^ this.anInt2653 >> 31) + (this.anInt2653 >>> 31);
		this.anInt2653 = -this.anInt2653;
	}

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "()V")
	private void method1843() {
		if (this.anInt2644 == 0) {
			return;
		}
		if (this.anInt2650 == Integer.MIN_VALUE) {
			this.anInt2650 = 0;
		}
		this.anInt2644 = 0;
		this.method1831();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	public synchronized void method1844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1836(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static139.method1852(arg1, arg2);
		@Pc(14) int local14 = Static139.method1819(arg1, arg2);
		if (this.anInt2654 == local10 && this.anInt2647 == local14) {
			this.anInt2644 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2655;
		if (this.anInt2655 - arg1 > local31) {
			local31 = this.anInt2655 - arg1;
		}
		if (local10 - this.anInt2654 > local31) {
			local31 = local10 - this.anInt2654;
		}
		if (this.anInt2654 - local10 > local31) {
			local31 = this.anInt2654 - local10;
		}
		if (local14 - this.anInt2647 > local31) {
			local31 = local14 - this.anInt2647;
		}
		if (this.anInt2647 - local14 > local31) {
			local31 = this.anInt2647 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2644 = arg0;
		this.anInt2650 = arg1;
		this.anInt2648 = arg2;
		this.anInt2646 = (arg1 - this.anInt2655) / arg0;
		this.anInt2656 = (local10 - this.anInt2654) / arg0;
		this.anInt2651 = (local14 - this.anInt2647) / arg0;
	}

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "()Z")
	public boolean method1845() {
		return this.anInt2644 != 0;
	}

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "()I")
	public synchronized int method1849() {
		return this.anInt2653 < 0 ? -this.anInt2653 : this.anInt2653;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()Lclient!da;")
	@Override
	public Class3_Sub3 method2145() {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2148(@OriginalArg(0) int arg0) {
		if (this.anInt2644 > 0) {
			if (arg0 >= this.anInt2644) {
				if (this.anInt2650 == Integer.MIN_VALUE) {
					this.anInt2650 = 0;
					this.anInt2655 = this.anInt2654 = this.anInt2647 = 0;
					this.method2201();
					arg0 = this.anInt2644;
				}
				this.anInt2644 = 0;
				this.method1831();
			} else {
				this.anInt2655 += this.anInt2646 * arg0;
				this.anInt2654 += this.anInt2656 * arg0;
				this.anInt2647 += this.anInt2651 * arg0;
				this.anInt2644 -= arg0;
			}
		}
		@Pc(71) Class3_Sub5_Sub1 local71 = (Class3_Sub5_Sub1) super.aClass3_Sub5_5;
		@Pc(76) int local76 = this.anInt2652 << 8;
		@Pc(81) int local81 = this.anInt2643 << 8;
		@Pc(87) int local87 = local71.aByteArray23.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2645 = 0;
		}
		if (this.anInt2649 < 0) {
			if (this.anInt2653 <= 0) {
				this.method1843();
				this.method2201();
				return;
			}
			this.anInt2649 = 0;
		}
		if (this.anInt2649 >= local87) {
			if (this.anInt2653 >= 0) {
				this.method1843();
				this.method2201();
				return;
			}
			this.anInt2649 = local87 - 1;
		}
		this.anInt2649 += this.anInt2653 * arg0;
		if (this.anInt2645 >= 0) {
			if (this.anInt2645 > 0) {
				if (this.aBoolean154) {
					label125: {
						if (this.anInt2653 < 0) {
							if (this.anInt2649 >= local76) {
								return;
							}
							this.anInt2649 = local76 + local76 - this.anInt2649 - 1;
							this.anInt2653 = -this.anInt2653;
							if (--this.anInt2645 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2649 < local81) {
								return;
							}
							this.anInt2649 = local81 + local81 - this.anInt2649 - 1;
							this.anInt2653 = -this.anInt2653;
							if (--this.anInt2645 == 0) {
								break;
							}
							if (this.anInt2649 >= local76) {
								return;
							}
							this.anInt2649 = local76 + local76 - this.anInt2649 - 1;
							this.anInt2653 = -this.anInt2653;
						} while (--this.anInt2645 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2653 < 0) {
						if (this.anInt2649 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2649 - 1) / local91;
						if (local361 < this.anInt2645) {
							this.anInt2649 += local91 * local361;
							this.anInt2645 -= local361;
							return;
						}
						this.anInt2649 += local91 * this.anInt2645;
						this.anInt2645 = 0;
					} else if (this.anInt2649 >= local81) {
						local361 = (this.anInt2649 - local76) / local91;
						if (local361 < this.anInt2645) {
							this.anInt2649 -= local91 * local361;
							this.anInt2645 -= local361;
							return;
						}
						this.anInt2649 -= local91 * this.anInt2645;
						this.anInt2645 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2653 < 0) {
				if (this.anInt2649 < 0) {
					this.anInt2649 = -1;
					this.method1843();
					this.method2201();
					return;
				}
			} else if (this.anInt2649 >= local87) {
				this.anInt2649 = local87;
				this.method1843();
				this.method2201();
			}
		} else if (this.aBoolean154) {
			if (this.anInt2653 < 0) {
				if (this.anInt2649 >= local76) {
					return;
				}
				this.anInt2649 = local76 + local76 - this.anInt2649 - 1;
				this.anInt2653 = -this.anInt2653;
			}
			while (this.anInt2649 >= local81) {
				this.anInt2649 = local81 + local81 - this.anInt2649 - 1;
				this.anInt2653 = -this.anInt2653;
				if (this.anInt2649 >= local76) {
					return;
				}
				this.anInt2649 = local76 + local76 - this.anInt2649 - 1;
				this.anInt2653 = -this.anInt2653;
			}
		} else if (this.anInt2653 < 0) {
			if (this.anInt2649 < local76) {
				this.anInt2649 = local81 - (local81 - 1 - this.anInt2649) % local91 - 1;
			}
		} else if (this.anInt2649 >= local81) {
			this.anInt2649 = local76 + (this.anInt2649 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "()I")
	@Override
	public int method2149() {
		@Pc(6) int local6 = this.anInt2655 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2645 == 0) {
			local6 -= local6 * this.anInt2649 / (((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23.length << 8);
		} else if (this.anInt2645 >= 0) {
			local6 -= local6 * this.anInt2652 / ((Class3_Sub5_Sub1) super.aClass3_Sub5_5).aByteArray23.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)V")
	public synchronized void method1851(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1835();
			this.method2201();
		} else if (this.anInt2654 == 0 && this.anInt2647 == 0) {
			this.anInt2644 = 0;
			this.anInt2650 = 0;
			this.anInt2655 = 0;
			this.method2201();
		} else {
			@Pc(31) int local31 = -this.anInt2655;
			if (this.anInt2655 > local31) {
				local31 = this.anInt2655;
			}
			if (-this.anInt2654 > local31) {
				local31 = -this.anInt2654;
			}
			if (this.anInt2654 > local31) {
				local31 = this.anInt2654;
			}
			if (-this.anInt2647 > local31) {
				local31 = -this.anInt2647;
			}
			if (this.anInt2647 > local31) {
				local31 = this.anInt2647;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2644 = arg0;
			this.anInt2650 = Integer.MIN_VALUE;
			this.anInt2646 = -this.anInt2655 / arg0;
			this.anInt2656 = -this.anInt2654 / arg0;
			this.anInt2651 = -this.anInt2647 / arg0;
		}
	}
}
