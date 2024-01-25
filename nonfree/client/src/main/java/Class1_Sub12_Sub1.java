import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public int anInt2495;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
	public int anInt2497;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	private int anInt2498;

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	public int anInt2502;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
	public int anInt2503;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
	public int anInt2505;

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
	private int anInt2506;

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
	public int anInt2507;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
	private final int anInt2500;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	private final int anInt2496;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "Z")
	private final boolean aBoolean176;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	private int anInt2499;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
	private int anInt2501;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
	private int anInt2504;

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
	public int anInt2508;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!qk;II)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) Class1_Sub32_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub32_5 = arg0;
		this.anInt2500 = arg0.anInt6858;
		this.anInt2496 = arg0.anInt6860;
		this.aBoolean176 = arg0.aBoolean459;
		this.anInt2499 = arg1;
		this.anInt2501 = arg2;
		this.anInt2504 = 8192;
		this.anInt2508 = 0;
		this.method2342();
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!qk;III)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) Class1_Sub32_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub32_5 = arg0;
		this.anInt2500 = arg0.anInt6858;
		this.anInt2496 = arg0.anInt6860;
		this.aBoolean176 = arg0.aBoolean459;
		this.anInt2499 = arg1;
		this.anInt2501 = arg2;
		this.anInt2504 = arg3;
		this.anInt2508 = 0;
		this.method2342();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6516(@OriginalArg(0) int arg0) {
		if (this.anInt2498 > 0) {
			if (arg0 >= this.anInt2498) {
				if (this.anInt2501 == Integer.MIN_VALUE) {
					this.anInt2501 = 0;
					this.anInt2497 = this.anInt2507 = this.anInt2502 = 0;
					this.method7983();
					arg0 = this.anInt2498;
				}
				this.anInt2498 = 0;
				this.method2342();
			} else {
				this.anInt2497 += this.anInt2505 * arg0;
				this.anInt2507 += this.anInt2495 * arg0;
				this.anInt2502 += this.anInt2503 * arg0;
				this.anInt2498 -= arg0;
			}
		}
		@Pc(71) Class1_Sub32_Sub1 local71 = (Class1_Sub32_Sub1) super.aClass1_Sub32_5;
		@Pc(76) int local76 = this.anInt2500 << 8;
		@Pc(81) int local81 = this.anInt2496 << 8;
		@Pc(87) int local87 = local71.aByteArray81.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2506 = 0;
		}
		if (this.anInt2508 < 0) {
			if (this.anInt2499 <= 0) {
				this.method2346();
				this.method7983();
				return;
			}
			this.anInt2508 = 0;
		}
		if (this.anInt2508 >= local87) {
			if (this.anInt2499 >= 0) {
				this.method2346();
				this.method7983();
				return;
			}
			this.anInt2508 = local87 - 1;
		}
		this.anInt2508 += this.anInt2499 * arg0;
		if (this.anInt2506 >= 0) {
			if (this.anInt2506 > 0) {
				if (this.aBoolean176) {
					label125: {
						if (this.anInt2499 < 0) {
							if (this.anInt2508 >= local76) {
								return;
							}
							this.anInt2508 = local76 + local76 - this.anInt2508 - 1;
							this.anInt2499 = -this.anInt2499;
							if (--this.anInt2506 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2508 < local81) {
								return;
							}
							this.anInt2508 = local81 + local81 - this.anInt2508 - 1;
							this.anInt2499 = -this.anInt2499;
							if (--this.anInt2506 == 0) {
								break;
							}
							if (this.anInt2508 >= local76) {
								return;
							}
							this.anInt2508 = local76 + local76 - this.anInt2508 - 1;
							this.anInt2499 = -this.anInt2499;
						} while (--this.anInt2506 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2499 < 0) {
						if (this.anInt2508 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2508 - 1) / local91;
						if (local361 < this.anInt2506) {
							this.anInt2508 += local91 * local361;
							this.anInt2506 -= local361;
							return;
						}
						this.anInt2508 += local91 * this.anInt2506;
						this.anInt2506 = 0;
					} else if (this.anInt2508 >= local81) {
						local361 = (this.anInt2508 - local76) / local91;
						if (local361 < this.anInt2506) {
							this.anInt2508 -= local91 * local361;
							this.anInt2506 -= local361;
							return;
						}
						this.anInt2508 -= local91 * this.anInt2506;
						this.anInt2506 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2499 < 0) {
				if (this.anInt2508 < 0) {
					this.anInt2508 = -1;
					this.method2346();
					this.method7983();
					return;
				}
			} else if (this.anInt2508 >= local87) {
				this.anInt2508 = local87;
				this.method2346();
				this.method7983();
			}
		} else if (this.aBoolean176) {
			if (this.anInt2499 < 0) {
				if (this.anInt2508 >= local76) {
					return;
				}
				this.anInt2508 = local76 + local76 - this.anInt2508 - 1;
				this.anInt2499 = -this.anInt2499;
			}
			while (this.anInt2508 >= local81) {
				this.anInt2508 = local81 + local81 - this.anInt2508 - 1;
				this.anInt2499 = -this.anInt2499;
				if (this.anInt2508 >= local76) {
					return;
				}
				this.anInt2508 = local76 + local76 - this.anInt2508 - 1;
				this.anInt2499 = -this.anInt2499;
			}
		} else if (this.anInt2499 < 0) {
			if (this.anInt2508 < local76) {
				this.anInt2508 = local81 - (local81 - 1 - this.anInt2508) % local91 - 1;
			}
		} else if (this.anInt2508 >= local81) {
			this.anInt2508 = local76 + (this.anInt2508 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([IIIII)I")
	private int method2324(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2498 <= 0) {
				if (this.anInt2499 == 256 && (this.anInt2508 & 0xFF) == 0) {
					if (Static267.aBoolean348) {
						return Static550.method2332(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2507, this.anInt2502, arg3, arg2, this);
					}
					return Static550.method2358(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2497, arg3, arg2, this);
				}
				if (Static267.aBoolean348) {
					return Static550.method2340(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2507, this.anInt2502, arg3, arg2, this, this.anInt2499, arg4);
				}
				return Static550.method2353(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2497, arg3, arg2, this, this.anInt2499, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2498;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2498 += arg1;
			if (this.anInt2499 == 256 && (this.anInt2508 & 0xFF) == 0) {
				if (Static267.aBoolean348) {
					arg1 = Static550.method2357(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2507, this.anInt2502, this.anInt2495, this.anInt2503, local5, arg2, this);
				} else {
					arg1 = Static550.method2359(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2497, this.anInt2505, local5, arg2, this);
				}
			} else if (Static267.aBoolean348) {
				arg1 = Static550.method2323(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2507, this.anInt2502, this.anInt2495, this.anInt2503, local5, arg2, this, this.anInt2499, arg4);
			} else {
				arg1 = Static550.method2331(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2497, this.anInt2505, local5, arg2, this, this.anInt2499, arg4);
			}
			this.anInt2498 -= arg1;
			if (this.anInt2498 != 0) {
				return arg1;
			}
		} while (!this.method2334());
		return arg3;
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "()I")
	public synchronized int method2325() {
		return this.anInt2501 == Integer.MIN_VALUE ? 0 : this.anInt2501;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
	public synchronized void method2326(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2347();
			this.method7983();
		} else if (this.anInt2507 == 0 && this.anInt2502 == 0) {
			this.anInt2498 = 0;
			this.anInt2501 = 0;
			this.anInt2497 = 0;
			this.method7983();
		} else {
			@Pc(31) int local31 = -this.anInt2497;
			if (this.anInt2497 > local31) {
				local31 = this.anInt2497;
			}
			if (-this.anInt2507 > local31) {
				local31 = -this.anInt2507;
			}
			if (this.anInt2507 > local31) {
				local31 = this.anInt2507;
			}
			if (-this.anInt2502 > local31) {
				local31 = -this.anInt2502;
			}
			if (this.anInt2502 > local31) {
				local31 = this.anInt2502;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2498 = arg0;
			this.anInt2501 = Integer.MIN_VALUE;
			this.anInt2505 = -this.anInt2497 / arg0;
			this.anInt2495 = -this.anInt2507 / arg0;
			this.anInt2503 = -this.anInt2502 / arg0;
		}
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "()I")
	@Override
	public int method6521() {
		return this.anInt2501 == 0 && this.anInt2498 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)V")
	public synchronized void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2343(arg0, arg1, this.method2345());
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "()Z")
	public boolean method2329() {
		return this.anInt2508 < 0 || this.anInt2508 >= ((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81.length << 8;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6519(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2501 == 0 && this.anInt2498 == 0) {
			this.method6516(arg2);
			return;
		}
		@Pc(13) Class1_Sub32_Sub1 local13 = (Class1_Sub32_Sub1) super.aClass1_Sub32_5;
		@Pc(18) int local18 = this.anInt2500 << 8;
		@Pc(23) int local23 = this.anInt2496 << 8;
		@Pc(29) int local29 = local13.aByteArray81.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2506 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2508 < 0) {
			if (this.anInt2499 <= 0) {
				this.method2346();
				this.method7983();
				return;
			}
			this.anInt2508 = 0;
		}
		if (this.anInt2508 >= local29) {
			if (this.anInt2499 >= 0) {
				this.method2346();
				this.method7983();
				return;
			}
			this.anInt2508 = local29 - 1;
		}
		if (this.anInt2506 >= 0) {
			if (this.anInt2506 > 0) {
				if (this.aBoolean176) {
					label130: {
						if (this.anInt2499 < 0) {
							local40 = this.method2335(arg0, arg1, local18, local44, local13.aByteArray81[this.anInt2500]);
							if (this.anInt2508 >= local18) {
								return;
							}
							this.anInt2508 = local18 + local18 - this.anInt2508 - 1;
							this.anInt2499 = -this.anInt2499;
							if (--this.anInt2506 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2324(arg0, local40, local23, local44, local13.aByteArray81[this.anInt2496 - 1]);
							if (this.anInt2508 < local23) {
								return;
							}
							this.anInt2508 = local23 + local23 - this.anInt2508 - 1;
							this.anInt2499 = -this.anInt2499;
							if (--this.anInt2506 == 0) {
								break;
							}
							local40 = this.method2335(arg0, local40, local18, local44, local13.aByteArray81[this.anInt2500]);
							if (this.anInt2508 >= local18) {
								return;
							}
							this.anInt2508 = local18 + local18 - this.anInt2508 - 1;
							this.anInt2499 = -this.anInt2499;
						} while (--this.anInt2506 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2499 < 0) {
						while (true) {
							local40 = this.method2335(arg0, local40, local18, local44, local13.aByteArray81[this.anInt2496 - 1]);
							if (this.anInt2508 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2508 - 1) / local33;
							if (local416 >= this.anInt2506) {
								this.anInt2508 += local33 * this.anInt2506;
								this.anInt2506 = 0;
								break;
							}
							this.anInt2508 += local33 * local416;
							this.anInt2506 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2324(arg0, local40, local23, local44, local13.aByteArray81[this.anInt2500]);
							if (this.anInt2508 < local23) {
								return;
							}
							local416 = (this.anInt2508 - local18) / local33;
							if (local416 >= this.anInt2506) {
								this.anInt2508 -= local33 * this.anInt2506;
								this.anInt2506 = 0;
								break;
							}
							this.anInt2508 -= local33 * local416;
							this.anInt2506 -= local416;
						}
					}
				}
			}
			if (this.anInt2499 < 0) {
				this.method2335(arg0, local40, 0, local44, 0);
				if (this.anInt2508 < 0) {
					this.anInt2508 = -1;
					this.method2346();
					this.method7983();
					return;
				}
			} else {
				this.method2324(arg0, local40, local29, local44, 0);
				if (this.anInt2508 >= local29) {
					this.anInt2508 = local29;
					this.method2346();
					this.method7983();
				}
			}
		} else if (this.aBoolean176) {
			if (this.anInt2499 < 0) {
				local40 = this.method2335(arg0, arg1, local18, local44, local13.aByteArray81[this.anInt2500]);
				if (this.anInt2508 >= local18) {
					return;
				}
				this.anInt2508 = local18 + local18 - this.anInt2508 - 1;
				this.anInt2499 = -this.anInt2499;
			}
			while (true) {
				local40 = this.method2324(arg0, local40, local23, local44, local13.aByteArray81[this.anInt2496 - 1]);
				if (this.anInt2508 < local23) {
					return;
				}
				this.anInt2508 = local23 + local23 - this.anInt2508 - 1;
				this.anInt2499 = -this.anInt2499;
				local40 = this.method2335(arg0, local40, local18, local44, local13.aByteArray81[this.anInt2500]);
				if (this.anInt2508 >= local18) {
					return;
				}
				this.anInt2508 = local18 + local18 - this.anInt2508 - 1;
				this.anInt2499 = -this.anInt2499;
			}
		} else if (this.anInt2499 < 0) {
			while (true) {
				local40 = this.method2335(arg0, local40, local18, local44, local13.aByteArray81[this.anInt2496 - 1]);
				if (this.anInt2508 >= local18) {
					return;
				}
				this.anInt2508 = local23 - (local23 - 1 - this.anInt2508) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2324(arg0, local40, local23, local44, local13.aByteArray81[this.anInt2500]);
				if (this.anInt2508 < local23) {
					return;
				}
				this.anInt2508 = local18 + (this.anInt2508 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "()Z")
	private boolean method2334() {
		@Pc(2) int local2 = this.anInt2501;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static550.method2356(local2, this.anInt2504);
			local8 = Static550.method2349(local2, this.anInt2504);
		}
		if (this.anInt2497 != local2 || this.anInt2507 != local10 || this.anInt2502 != local8) {
			if (this.anInt2497 < local2) {
				this.anInt2505 = 1;
				this.anInt2498 = local2 - this.anInt2497;
			} else if (this.anInt2497 > local2) {
				this.anInt2505 = -1;
				this.anInt2498 = this.anInt2497 - local2;
			} else {
				this.anInt2505 = 0;
			}
			if (this.anInt2507 < local10) {
				this.anInt2495 = 1;
				if (this.anInt2498 == 0 || this.anInt2498 > local10 - this.anInt2507) {
					this.anInt2498 = local10 - this.anInt2507;
				}
			} else if (this.anInt2507 > local10) {
				this.anInt2495 = -1;
				if (this.anInt2498 == 0 || this.anInt2498 > this.anInt2507 - local10) {
					this.anInt2498 = this.anInt2507 - local10;
				}
			} else {
				this.anInt2495 = 0;
			}
			if (this.anInt2502 < local8) {
				this.anInt2503 = 1;
				if (this.anInt2498 == 0 || this.anInt2498 > local8 - this.anInt2502) {
					this.anInt2498 = local8 - this.anInt2502;
				}
			} else if (this.anInt2502 > local8) {
				this.anInt2503 = -1;
				if (this.anInt2498 == 0 || this.anInt2498 > this.anInt2502 - local8) {
					this.anInt2498 = this.anInt2502 - local8;
				}
			} else {
				this.anInt2503 = 0;
			}
			return false;
		} else if (this.anInt2501 == Integer.MIN_VALUE) {
			this.anInt2501 = 0;
			this.anInt2497 = this.anInt2507 = this.anInt2502 = 0;
			this.method7983();
			return true;
		} else {
			this.method2342();
			return false;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "([IIIII)I")
	private int method2335(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2498 <= 0) {
				if (this.anInt2499 == -256 && (this.anInt2508 & 0xFF) == 0) {
					if (Static267.aBoolean348) {
						return Static550.method2330(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2507, this.anInt2502, arg3, arg2, this);
					}
					return Static550.method2341(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2497, arg3, arg2, this);
				}
				if (Static267.aBoolean348) {
					return Static550.method2327(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2507, this.anInt2502, arg3, arg2, this, this.anInt2499, arg4);
				}
				return Static550.method2333(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2497, arg3, arg2, this, this.anInt2499, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2498;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2498 += arg1;
			if (this.anInt2499 == -256 && (this.anInt2508 & 0xFF) == 0) {
				if (Static267.aBoolean348) {
					arg1 = Static550.method2322(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2507, this.anInt2502, this.anInt2495, this.anInt2503, local5, arg2, this);
				} else {
					arg1 = Static550.method2337(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2497, this.anInt2505, local5, arg2, this);
				}
			} else if (Static267.aBoolean348) {
				arg1 = Static550.method2355(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2507, this.anInt2502, this.anInt2495, this.anInt2503, local5, arg2, this, this.anInt2499, arg4);
			} else {
				arg1 = Static550.method2354(((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81, arg0, this.anInt2508, arg1, this.anInt2497, this.anInt2505, local5, arg2, this, this.anInt2499, arg4);
			}
			this.anInt2498 -= arg1;
			if (this.anInt2498 != 0) {
				return arg1;
			}
		} while (!this.method2334());
		return arg3;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "()Lclient!kca;")
	@Override
	public Class1_Sub12 method6515() {
		return null;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public synchronized void method2338(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2508 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "(I)V")
	public synchronized void method2339(@OriginalArg(0) int arg0) {
		if (this.anInt2499 < 0) {
			this.anInt2499 = -arg0;
		} else {
			this.anInt2499 = arg0;
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "()I")
	@Override
	public int method6518() {
		@Pc(6) int local6 = this.anInt2497 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2506 == 0) {
			local6 -= local6 * this.anInt2508 / (((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81.length << 8);
		} else if (this.anInt2506 >= 0) {
			local6 -= local6 * this.anInt2500 / ((Class1_Sub32_Sub1) super.aClass1_Sub32_5).aByteArray81.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "()V")
	private void method2342() {
		this.anInt2497 = this.anInt2501;
		this.anInt2507 = Static550.method2356(this.anInt2501, this.anInt2504);
		this.anInt2502 = Static550.method2349(this.anInt2501, this.anInt2504);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
	public synchronized void method2343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2350(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static550.method2356(arg1, arg2);
		@Pc(14) int local14 = Static550.method2349(arg1, arg2);
		if (this.anInt2507 == local10 && this.anInt2502 == local14) {
			this.anInt2498 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2497;
		if (this.anInt2497 - arg1 > local31) {
			local31 = this.anInt2497 - arg1;
		}
		if (local10 - this.anInt2507 > local31) {
			local31 = local10 - this.anInt2507;
		}
		if (this.anInt2507 - local10 > local31) {
			local31 = this.anInt2507 - local10;
		}
		if (local14 - this.anInt2502 > local31) {
			local31 = local14 - this.anInt2502;
		}
		if (this.anInt2502 - local14 > local31) {
			local31 = this.anInt2502 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2498 = arg0;
		this.anInt2501 = arg1;
		this.anInt2504 = arg2;
		this.anInt2505 = (arg1 - this.anInt2497) / arg0;
		this.anInt2495 = (local10 - this.anInt2507) / arg0;
		this.anInt2503 = (local14 - this.anInt2502) / arg0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
	public synchronized void method2344() {
		this.anInt2499 = (this.anInt2499 ^ this.anInt2499 >> 31) + (this.anInt2499 >>> 31);
		this.anInt2499 = -this.anInt2499;
	}

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "()I")
	public synchronized int method2345() {
		return this.anInt2504 < 0 ? -1 : this.anInt2504;
	}

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "()V")
	private void method2346() {
		if (this.anInt2498 == 0) {
			return;
		}
		if (this.anInt2501 == Integer.MIN_VALUE) {
			this.anInt2501 = 0;
		}
		this.anInt2498 = 0;
		this.method2342();
	}

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "(I)V")
	private synchronized void method2347() {
		this.method2350(0, this.method2345());
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(II)V")
	private synchronized void method2350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2501 = arg0;
		this.anInt2504 = arg1;
		this.anInt2498 = 0;
		this.method2342();
	}

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "(I)V")
	public synchronized void method2351(@OriginalArg(0) int arg0) {
		this.anInt2506 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "(I)V")
	public synchronized void method2352(@OriginalArg(0) int arg0) {
		this.method2350(arg0 << 6, this.method2345());
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "()Lclient!kca;")
	@Override
	public Class1_Sub12 method6517() {
		return null;
	}

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "()Z")
	public boolean method2360() {
		return this.anInt2498 != 0;
	}

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "()I")
	public synchronized int method2361() {
		return this.anInt2499 < 0 ? -this.anInt2499 : this.anInt2499;
	}
}
