import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class1_Sub19_Sub1 extends Class1_Sub19 {

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
	private int anInt2318;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
	public int anInt2319;

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
	private int anInt2320;

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
	public int anInt2321;

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
	public int anInt2322;

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
	public int anInt2323;

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
	public int anInt2325;

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
	public int anInt2329;

	@OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
	private final int anInt2328;

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
	private final int anInt2316;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "Z")
	private final boolean aBoolean137;

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
	private int anInt2324;

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
	private int anInt2326;

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
	private int anInt2317;

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
	public int anInt2327;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!fv;II)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) Class1_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub20_5 = arg0;
		this.anInt2328 = arg0.anInt2446;
		this.anInt2316 = arg0.anInt2448;
		this.aBoolean137 = arg0.aBoolean148;
		this.anInt2324 = arg1;
		this.anInt2326 = arg2;
		this.anInt2317 = 8192;
		this.anInt2327 = 0;
		this.method2033();
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!fv;III)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) Class1_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub20_5 = arg0;
		this.anInt2328 = arg0.anInt2446;
		this.anInt2316 = arg0.anInt2448;
		this.aBoolean137 = arg0.aBoolean148;
		this.anInt2324 = arg1;
		this.anInt2326 = arg2;
		this.anInt2317 = arg3;
		this.anInt2327 = 0;
		this.method2033();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
	public synchronized void method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2022(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static462.method2045(arg1, arg2);
		@Pc(14) int local14 = Static462.method2031(arg1, arg2);
		if (this.anInt2329 == local10 && this.anInt2322 == local14) {
			this.anInt2320 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2319;
		if (this.anInt2319 - arg1 > local31) {
			local31 = this.anInt2319 - arg1;
		}
		if (local10 - this.anInt2329 > local31) {
			local31 = local10 - this.anInt2329;
		}
		if (this.anInt2329 - local10 > local31) {
			local31 = this.anInt2329 - local10;
		}
		if (local14 - this.anInt2322 > local31) {
			local31 = local14 - this.anInt2322;
		}
		if (this.anInt2322 - local14 > local31) {
			local31 = this.anInt2322 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2320 = arg0;
		this.anInt2326 = arg1;
		this.anInt2317 = arg2;
		this.anInt2323 = (arg1 - this.anInt2319) / arg0;
		this.anInt2321 = (local10 - this.anInt2329) / arg0;
		this.anInt2325 = (local14 - this.anInt2322) / arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2326 == 0 && this.anInt2320 == 0) {
			this.method3650(arg2);
			return;
		}
		@Pc(13) Class1_Sub20_Sub1 local13 = (Class1_Sub20_Sub1) super.aClass1_Sub20_5;
		@Pc(18) int local18 = this.anInt2328 << 8;
		@Pc(23) int local23 = this.anInt2316 << 8;
		@Pc(29) int local29 = local13.aByteArray46.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2318 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2327 < 0) {
			if (this.anInt2324 <= 0) {
				this.method2055();
				this.method6020();
				return;
			}
			this.anInt2327 = 0;
		}
		if (this.anInt2327 >= local29) {
			if (this.anInt2324 >= 0) {
				this.method2055();
				this.method6020();
				return;
			}
			this.anInt2327 = local29 - 1;
		}
		if (this.anInt2318 >= 0) {
			if (this.anInt2318 > 0) {
				if (this.aBoolean137) {
					label130: {
						if (this.anInt2324 < 0) {
							local40 = this.method2018(arg0, arg1, local18, local44, local13.aByteArray46[this.anInt2328]);
							if (this.anInt2327 >= local18) {
								return;
							}
							this.anInt2327 = local18 + local18 - this.anInt2327 - 1;
							this.anInt2324 = -this.anInt2324;
							if (--this.anInt2318 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2034(arg0, local40, local23, local44, local13.aByteArray46[this.anInt2316 - 1]);
							if (this.anInt2327 < local23) {
								return;
							}
							this.anInt2327 = local23 + local23 - this.anInt2327 - 1;
							this.anInt2324 = -this.anInt2324;
							if (--this.anInt2318 == 0) {
								break;
							}
							local40 = this.method2018(arg0, local40, local18, local44, local13.aByteArray46[this.anInt2328]);
							if (this.anInt2327 >= local18) {
								return;
							}
							this.anInt2327 = local18 + local18 - this.anInt2327 - 1;
							this.anInt2324 = -this.anInt2324;
						} while (--this.anInt2318 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2324 < 0) {
						while (true) {
							local40 = this.method2018(arg0, local40, local18, local44, local13.aByteArray46[this.anInt2316 - 1]);
							if (this.anInt2327 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2327 - 1) / local33;
							if (local416 >= this.anInt2318) {
								this.anInt2327 += local33 * this.anInt2318;
								this.anInt2318 = 0;
								break;
							}
							this.anInt2327 += local33 * local416;
							this.anInt2318 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2034(arg0, local40, local23, local44, local13.aByteArray46[this.anInt2328]);
							if (this.anInt2327 < local23) {
								return;
							}
							local416 = (this.anInt2327 - local18) / local33;
							if (local416 >= this.anInt2318) {
								this.anInt2327 -= local33 * this.anInt2318;
								this.anInt2318 = 0;
								break;
							}
							this.anInt2327 -= local33 * local416;
							this.anInt2318 -= local416;
						}
					}
				}
			}
			if (this.anInt2324 < 0) {
				this.method2018(arg0, local40, 0, local44, 0);
				if (this.anInt2327 < 0) {
					this.anInt2327 = -1;
					this.method2055();
					this.method6020();
					return;
				}
			} else {
				this.method2034(arg0, local40, local29, local44, 0);
				if (this.anInt2327 >= local29) {
					this.anInt2327 = local29;
					this.method2055();
					this.method6020();
				}
			}
		} else if (this.aBoolean137) {
			if (this.anInt2324 < 0) {
				local40 = this.method2018(arg0, arg1, local18, local44, local13.aByteArray46[this.anInt2328]);
				if (this.anInt2327 >= local18) {
					return;
				}
				this.anInt2327 = local18 + local18 - this.anInt2327 - 1;
				this.anInt2324 = -this.anInt2324;
			}
			while (true) {
				local40 = this.method2034(arg0, local40, local23, local44, local13.aByteArray46[this.anInt2316 - 1]);
				if (this.anInt2327 < local23) {
					return;
				}
				this.anInt2327 = local23 + local23 - this.anInt2327 - 1;
				this.anInt2324 = -this.anInt2324;
				local40 = this.method2018(arg0, local40, local18, local44, local13.aByteArray46[this.anInt2328]);
				if (this.anInt2327 >= local18) {
					return;
				}
				this.anInt2327 = local18 + local18 - this.anInt2327 - 1;
				this.anInt2324 = -this.anInt2324;
			}
		} else if (this.anInt2324 < 0) {
			while (true) {
				local40 = this.method2018(arg0, local40, local18, local44, local13.aByteArray46[this.anInt2316 - 1]);
				if (this.anInt2327 >= local18) {
					return;
				}
				this.anInt2327 = local23 - (local23 - 1 - this.anInt2327) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2034(arg0, local40, local23, local44, local13.aByteArray46[this.anInt2328]);
				if (this.anInt2327 < local23) {
					return;
				}
				this.anInt2327 = local18 + (this.anInt2327 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([IIIII)I")
	private int method2018(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2320 <= 0) {
				if (this.anInt2324 == -256 && (this.anInt2327 & 0xFF) == 0) {
					if (Static222.aBoolean288) {
						return Static462.method2021(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2329, this.anInt2322, arg3, arg2, this);
					}
					return Static462.method2053(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2319, arg3, arg2, this);
				}
				if (Static222.aBoolean288) {
					return Static462.method2024(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2329, this.anInt2322, arg3, arg2, this, this.anInt2324, arg4);
				}
				return Static462.method2030(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2319, arg3, arg2, this, this.anInt2324, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2320;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2320 += arg1;
			if (this.anInt2324 == -256 && (this.anInt2327 & 0xFF) == 0) {
				if (Static222.aBoolean288) {
					arg1 = Static462.method2040(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2329, this.anInt2322, this.anInt2321, this.anInt2325, local5, arg2, this);
				} else {
					arg1 = Static462.method2028(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2319, this.anInt2323, local5, arg2, this);
				}
			} else if (Static222.aBoolean288) {
				arg1 = Static462.method2016(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2329, this.anInt2322, this.anInt2321, this.anInt2325, local5, arg2, this, this.anInt2324, arg4);
			} else {
				arg1 = Static462.method2019(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2319, this.anInt2323, local5, arg2, this, this.anInt2324, arg4);
			}
			this.anInt2320 -= arg1;
			if (this.anInt2320 != 0) {
				return arg1;
			}
		} while (!this.method2020());
		return arg3;
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "()Z")
	private boolean method2020() {
		@Pc(2) int local2 = this.anInt2326;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static462.method2045(local2, this.anInt2317);
			local8 = Static462.method2031(local2, this.anInt2317);
		}
		if (this.anInt2319 != local2 || this.anInt2329 != local10 || this.anInt2322 != local8) {
			if (this.anInt2319 < local2) {
				this.anInt2323 = 1;
				this.anInt2320 = local2 - this.anInt2319;
			} else if (this.anInt2319 > local2) {
				this.anInt2323 = -1;
				this.anInt2320 = this.anInt2319 - local2;
			} else {
				this.anInt2323 = 0;
			}
			if (this.anInt2329 < local10) {
				this.anInt2321 = 1;
				if (this.anInt2320 == 0 || this.anInt2320 > local10 - this.anInt2329) {
					this.anInt2320 = local10 - this.anInt2329;
				}
			} else if (this.anInt2329 > local10) {
				this.anInt2321 = -1;
				if (this.anInt2320 == 0 || this.anInt2320 > this.anInt2329 - local10) {
					this.anInt2320 = this.anInt2329 - local10;
				}
			} else {
				this.anInt2321 = 0;
			}
			if (this.anInt2322 < local8) {
				this.anInt2325 = 1;
				if (this.anInt2320 == 0 || this.anInt2320 > local8 - this.anInt2322) {
					this.anInt2320 = local8 - this.anInt2322;
				}
			} else if (this.anInt2322 > local8) {
				this.anInt2325 = -1;
				if (this.anInt2320 == 0 || this.anInt2320 > this.anInt2322 - local8) {
					this.anInt2320 = this.anInt2322 - local8;
				}
			} else {
				this.anInt2325 = 0;
			}
			return false;
		} else if (this.anInt2326 == Integer.MIN_VALUE) {
			this.anInt2326 = 0;
			this.anInt2319 = this.anInt2329 = this.anInt2322 = 0;
			this.method6020();
			return true;
		} else {
			this.method2033();
			return false;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
	private synchronized void method2022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2326 = arg0;
		this.anInt2317 = arg1;
		this.anInt2320 = 0;
		this.method2033();
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "()I")
	@Override
	public int method3646() {
		return this.anInt2326 == 0 && this.anInt2320 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
	public synchronized void method2029(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2049();
			this.method6020();
		} else if (this.anInt2329 == 0 && this.anInt2322 == 0) {
			this.anInt2320 = 0;
			this.anInt2326 = 0;
			this.anInt2319 = 0;
			this.method6020();
		} else {
			@Pc(31) int local31 = -this.anInt2319;
			if (this.anInt2319 > local31) {
				local31 = this.anInt2319;
			}
			if (-this.anInt2329 > local31) {
				local31 = -this.anInt2329;
			}
			if (this.anInt2329 > local31) {
				local31 = this.anInt2329;
			}
			if (-this.anInt2322 > local31) {
				local31 = -this.anInt2322;
			}
			if (this.anInt2322 > local31) {
				local31 = this.anInt2322;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2320 = arg0;
			this.anInt2326 = Integer.MIN_VALUE;
			this.anInt2323 = -this.anInt2319 / arg0;
			this.anInt2321 = -this.anInt2329 / arg0;
			this.anInt2325 = -this.anInt2322 / arg0;
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "()Lclient!fp;")
	@Override
	public Class1_Sub19 method3651() {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "()V")
	private void method2033() {
		this.anInt2319 = this.anInt2326;
		this.anInt2329 = Static462.method2045(this.anInt2326, this.anInt2317);
		this.anInt2322 = Static462.method2031(this.anInt2326, this.anInt2317);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "([IIIII)I")
	private int method2034(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2320 <= 0) {
				if (this.anInt2324 == 256 && (this.anInt2327 & 0xFF) == 0) {
					if (Static222.aBoolean288) {
						return Static462.method2023(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2329, this.anInt2322, arg3, arg2, this);
					}
					return Static462.method2039(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2319, arg3, arg2, this);
				}
				if (Static222.aBoolean288) {
					return Static462.method2052(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2329, this.anInt2322, arg3, arg2, this, this.anInt2324, arg4);
				}
				return Static462.method2043(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2319, arg3, arg2, this, this.anInt2324, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2320;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2320 += arg1;
			if (this.anInt2324 == 256 && (this.anInt2327 & 0xFF) == 0) {
				if (Static222.aBoolean288) {
					arg1 = Static462.method2027(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2329, this.anInt2322, this.anInt2321, this.anInt2325, local5, arg2, this);
				} else {
					arg1 = Static462.method2037(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2319, this.anInt2323, local5, arg2, this);
				}
			} else if (Static222.aBoolean288) {
				arg1 = Static462.method2025(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2329, this.anInt2322, this.anInt2321, this.anInt2325, local5, arg2, this, this.anInt2324, arg4);
			} else {
				arg1 = Static462.method2032(((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46, arg0, this.anInt2327, arg1, this.anInt2319, this.anInt2323, local5, arg2, this, this.anInt2324, arg4);
			}
			this.anInt2320 -= arg1;
			if (this.anInt2320 != 0) {
				return arg1;
			}
		} while (!this.method2020());
		return arg3;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "()Lclient!fp;")
	@Override
	public Class1_Sub19 method3649() {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "()I")
	public synchronized int method2035() {
		return this.anInt2317 < 0 ? -1 : this.anInt2317;
	}

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
	public synchronized void method2036(@OriginalArg(0) int arg0) {
		this.method2022(arg0 << 6, this.method2035());
	}

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "(I)V")
	public synchronized void method2038(@OriginalArg(0) int arg0) {
		this.anInt2318 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "(I)V")
	public synchronized void method2041(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2327 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3650(@OriginalArg(0) int arg0) {
		if (this.anInt2320 > 0) {
			if (arg0 >= this.anInt2320) {
				if (this.anInt2326 == Integer.MIN_VALUE) {
					this.anInt2326 = 0;
					this.anInt2319 = this.anInt2329 = this.anInt2322 = 0;
					this.method6020();
					arg0 = this.anInt2320;
				}
				this.anInt2320 = 0;
				this.method2033();
			} else {
				this.anInt2319 += this.anInt2323 * arg0;
				this.anInt2329 += this.anInt2321 * arg0;
				this.anInt2322 += this.anInt2325 * arg0;
				this.anInt2320 -= arg0;
			}
		}
		@Pc(71) Class1_Sub20_Sub1 local71 = (Class1_Sub20_Sub1) super.aClass1_Sub20_5;
		@Pc(76) int local76 = this.anInt2328 << 8;
		@Pc(81) int local81 = this.anInt2316 << 8;
		@Pc(87) int local87 = local71.aByteArray46.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2318 = 0;
		}
		if (this.anInt2327 < 0) {
			if (this.anInt2324 <= 0) {
				this.method2055();
				this.method6020();
				return;
			}
			this.anInt2327 = 0;
		}
		if (this.anInt2327 >= local87) {
			if (this.anInt2324 >= 0) {
				this.method2055();
				this.method6020();
				return;
			}
			this.anInt2327 = local87 - 1;
		}
		this.anInt2327 += this.anInt2324 * arg0;
		if (this.anInt2318 >= 0) {
			if (this.anInt2318 > 0) {
				if (this.aBoolean137) {
					label125: {
						if (this.anInt2324 < 0) {
							if (this.anInt2327 >= local76) {
								return;
							}
							this.anInt2327 = local76 + local76 - this.anInt2327 - 1;
							this.anInt2324 = -this.anInt2324;
							if (--this.anInt2318 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2327 < local81) {
								return;
							}
							this.anInt2327 = local81 + local81 - this.anInt2327 - 1;
							this.anInt2324 = -this.anInt2324;
							if (--this.anInt2318 == 0) {
								break;
							}
							if (this.anInt2327 >= local76) {
								return;
							}
							this.anInt2327 = local76 + local76 - this.anInt2327 - 1;
							this.anInt2324 = -this.anInt2324;
						} while (--this.anInt2318 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2324 < 0) {
						if (this.anInt2327 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2327 - 1) / local91;
						if (local361 < this.anInt2318) {
							this.anInt2327 += local91 * local361;
							this.anInt2318 -= local361;
							return;
						}
						this.anInt2327 += local91 * this.anInt2318;
						this.anInt2318 = 0;
					} else if (this.anInt2327 >= local81) {
						local361 = (this.anInt2327 - local76) / local91;
						if (local361 < this.anInt2318) {
							this.anInt2327 -= local91 * local361;
							this.anInt2318 -= local361;
							return;
						}
						this.anInt2327 -= local91 * this.anInt2318;
						this.anInt2318 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2324 < 0) {
				if (this.anInt2327 < 0) {
					this.anInt2327 = -1;
					this.method2055();
					this.method6020();
					return;
				}
			} else if (this.anInt2327 >= local87) {
				this.anInt2327 = local87;
				this.method2055();
				this.method6020();
			}
		} else if (this.aBoolean137) {
			if (this.anInt2324 < 0) {
				if (this.anInt2327 >= local76) {
					return;
				}
				this.anInt2327 = local76 + local76 - this.anInt2327 - 1;
				this.anInt2324 = -this.anInt2324;
			}
			while (this.anInt2327 >= local81) {
				this.anInt2327 = local81 + local81 - this.anInt2327 - 1;
				this.anInt2324 = -this.anInt2324;
				if (this.anInt2327 >= local76) {
					return;
				}
				this.anInt2327 = local76 + local76 - this.anInt2327 - 1;
				this.anInt2324 = -this.anInt2324;
			}
		} else if (this.anInt2324 < 0) {
			if (this.anInt2327 < local76) {
				this.anInt2327 = local81 - (local81 - 1 - this.anInt2327) % local91 - 1;
			}
		} else if (this.anInt2327 >= local81) {
			this.anInt2327 = local76 + (this.anInt2327 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "()I")
	public synchronized int method2044() {
		return this.anInt2326 == Integer.MIN_VALUE ? 0 : this.anInt2326;
	}

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "(I)V")
	public synchronized void method2046(@OriginalArg(0) int arg0) {
		if (this.anInt2324 < 0) {
			this.anInt2324 = -arg0;
		} else {
			this.anInt2324 = arg0;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	public synchronized void method2047() {
		this.anInt2324 = (this.anInt2324 ^ this.anInt2324 >> 31) + (this.anInt2324 >>> 31);
		this.anInt2324 = -this.anInt2324;
	}

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "()Z")
	public boolean method2048() {
		return this.anInt2320 != 0;
	}

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "(I)V")
	private synchronized void method2049() {
		this.method2022(0, this.method2035());
	}

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "()Z")
	public boolean method2050() {
		return this.anInt2327 < 0 || this.anInt2327 >= ((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46.length << 8;
	}

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "()I")
	public synchronized int method2051() {
		return this.anInt2324 < 0 ? -this.anInt2324 : this.anInt2324;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()I")
	@Override
	public int method3645() {
		@Pc(6) int local6 = this.anInt2319 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2318 == 0) {
			local6 -= local6 * this.anInt2327 / (((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46.length << 8);
		} else if (this.anInt2318 >= 0) {
			local6 -= local6 * this.anInt2328 / ((Class1_Sub20_Sub1) super.aClass1_Sub20_5).aByteArray46.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)V")
	public synchronized void method2054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2017(arg0, arg1, this.method2035());
	}

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "()V")
	private void method2055() {
		if (this.anInt2320 == 0) {
			return;
		}
		if (this.anInt2326 == Integer.MIN_VALUE) {
			this.anInt2326 = 0;
		}
		this.anInt2320 = 0;
		this.method2033();
	}
}
