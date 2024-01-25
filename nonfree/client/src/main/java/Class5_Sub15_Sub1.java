import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class5_Sub15_Sub1 extends Class5_Sub15 {

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public int anInt2734;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public int anInt2735;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
	private int anInt2737;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
	public int anInt2738;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	private int anInt2739;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
	public int anInt2740;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
	public int anInt2741;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
	public int anInt2742;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
	private final int anInt2746;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
	private final int anInt2745;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Z")
	private final boolean aBoolean181;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	private int anInt2743;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
	private int anInt2736;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
	private int anInt2747;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	public int anInt2744;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!ar;II)V")
	public Class5_Sub15_Sub1(@OriginalArg(0) Class5_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass5_Sub5_5 = arg0;
		this.anInt2746 = arg0.anInt483;
		this.anInt2745 = arg0.anInt482;
		this.aBoolean181 = arg0.aBoolean13;
		this.anInt2743 = arg1;
		this.anInt2736 = arg2;
		this.anInt2747 = 8192;
		this.anInt2744 = 0;
		this.method2456();
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!ar;III)V")
	public Class5_Sub15_Sub1(@OriginalArg(0) Class5_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub5_5 = arg0;
		this.anInt2746 = arg0.anInt483;
		this.anInt2745 = arg0.anInt482;
		this.aBoolean181 = arg0.aBoolean13;
		this.anInt2743 = arg1;
		this.anInt2736 = arg2;
		this.anInt2747 = arg3;
		this.anInt2744 = 0;
		this.method2456();
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "()V")
	private void method2456() {
		this.anInt2734 = this.anInt2736;
		this.anInt2741 = Static552.method2473(this.anInt2736, this.anInt2747);
		this.anInt2735 = Static552.method2465(this.anInt2736, this.anInt2747);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public synchronized void method2459(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2481();
			this.method7425();
		} else if (this.anInt2741 == 0 && this.anInt2735 == 0) {
			this.anInt2737 = 0;
			this.anInt2736 = 0;
			this.anInt2734 = 0;
			this.method7425();
		} else {
			@Pc(31) int local31 = -this.anInt2734;
			if (this.anInt2734 > local31) {
				local31 = this.anInt2734;
			}
			if (-this.anInt2741 > local31) {
				local31 = -this.anInt2741;
			}
			if (this.anInt2741 > local31) {
				local31 = this.anInt2741;
			}
			if (-this.anInt2735 > local31) {
				local31 = -this.anInt2735;
			}
			if (this.anInt2735 > local31) {
				local31 = this.anInt2735;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2737 = arg0;
			this.anInt2736 = Integer.MIN_VALUE;
			this.anInt2742 = -this.anInt2734 / arg0;
			this.anInt2738 = -this.anInt2741 / arg0;
			this.anInt2740 = -this.anInt2735 / arg0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "()I")
	public synchronized int method2460() {
		return this.anInt2743 < 0 ? -this.anInt2743 : this.anInt2743;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIII)I")
	private int method2463(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2737 <= 0) {
				if (this.anInt2743 == 256 && (this.anInt2744 & 0xFF) == 0) {
					if (Static543.aBoolean438) {
						return Static552.method2458(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2741, this.anInt2735, arg3, arg2, this);
					}
					return Static552.method2485(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2734, arg3, arg2, this);
				}
				if (Static543.aBoolean438) {
					return Static552.method2479(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2741, this.anInt2735, arg3, arg2, this, this.anInt2743, arg4);
				}
				return Static552.method2474(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2734, arg3, arg2, this, this.anInt2743, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2737;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2737 += arg1;
			if (this.anInt2743 == 256 && (this.anInt2744 & 0xFF) == 0) {
				if (Static543.aBoolean438) {
					arg1 = Static552.method2461(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2741, this.anInt2735, this.anInt2738, this.anInt2740, local5, arg2, this);
				} else {
					arg1 = Static552.method2462(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2734, this.anInt2742, local5, arg2, this);
				}
			} else if (Static543.aBoolean438) {
				arg1 = Static552.method2488(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2741, this.anInt2735, this.anInt2738, this.anInt2740, local5, arg2, this, this.anInt2743, arg4);
			} else {
				arg1 = Static552.method2494(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2734, this.anInt2742, local5, arg2, this, this.anInt2743, arg4);
			}
			this.anInt2737 -= arg1;
			if (this.anInt2737 != 0) {
				return arg1;
			}
		} while (!this.method2492());
		return arg3;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()Lclient!ps;")
	@Override
	public Class5_Sub15 method6506() {
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "()Z")
	public boolean method2467() {
		return this.anInt2737 != 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6505(@OriginalArg(0) int arg0) {
		if (this.anInt2737 > 0) {
			if (arg0 >= this.anInt2737) {
				if (this.anInt2736 == Integer.MIN_VALUE) {
					this.anInt2736 = 0;
					this.anInt2734 = this.anInt2741 = this.anInt2735 = 0;
					this.method7425();
					arg0 = this.anInt2737;
				}
				this.anInt2737 = 0;
				this.method2456();
			} else {
				this.anInt2734 += this.anInt2742 * arg0;
				this.anInt2741 += this.anInt2738 * arg0;
				this.anInt2735 += this.anInt2740 * arg0;
				this.anInt2737 -= arg0;
			}
		}
		@Pc(71) Class5_Sub5_Sub1 local71 = (Class5_Sub5_Sub1) super.aClass5_Sub5_5;
		@Pc(76) int local76 = this.anInt2746 << 8;
		@Pc(81) int local81 = this.anInt2745 << 8;
		@Pc(87) int local87 = local71.aByteArray6.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2739 = 0;
		}
		if (this.anInt2744 < 0) {
			if (this.anInt2743 <= 0) {
				this.method2491();
				this.method7425();
				return;
			}
			this.anInt2744 = 0;
		}
		if (this.anInt2744 >= local87) {
			if (this.anInt2743 >= 0) {
				this.method2491();
				this.method7425();
				return;
			}
			this.anInt2744 = local87 - 1;
		}
		this.anInt2744 += this.anInt2743 * arg0;
		if (this.anInt2739 >= 0) {
			if (this.anInt2739 > 0) {
				if (this.aBoolean181) {
					label125: {
						if (this.anInt2743 < 0) {
							if (this.anInt2744 >= local76) {
								return;
							}
							this.anInt2744 = local76 + local76 - this.anInt2744 - 1;
							this.anInt2743 = -this.anInt2743;
							if (--this.anInt2739 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2744 < local81) {
								return;
							}
							this.anInt2744 = local81 + local81 - this.anInt2744 - 1;
							this.anInt2743 = -this.anInt2743;
							if (--this.anInt2739 == 0) {
								break;
							}
							if (this.anInt2744 >= local76) {
								return;
							}
							this.anInt2744 = local76 + local76 - this.anInt2744 - 1;
							this.anInt2743 = -this.anInt2743;
						} while (--this.anInt2739 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2743 < 0) {
						if (this.anInt2744 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2744 - 1) / local91;
						if (local361 < this.anInt2739) {
							this.anInt2744 += local91 * local361;
							this.anInt2739 -= local361;
							return;
						}
						this.anInt2744 += local91 * this.anInt2739;
						this.anInt2739 = 0;
					} else if (this.anInt2744 >= local81) {
						local361 = (this.anInt2744 - local76) / local91;
						if (local361 < this.anInt2739) {
							this.anInt2744 -= local91 * local361;
							this.anInt2739 -= local361;
							return;
						}
						this.anInt2744 -= local91 * this.anInt2739;
						this.anInt2739 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2743 < 0) {
				if (this.anInt2744 < 0) {
					this.anInt2744 = -1;
					this.method2491();
					this.method7425();
					return;
				}
			} else if (this.anInt2744 >= local87) {
				this.anInt2744 = local87;
				this.method2491();
				this.method7425();
			}
		} else if (this.aBoolean181) {
			if (this.anInt2743 < 0) {
				if (this.anInt2744 >= local76) {
					return;
				}
				this.anInt2744 = local76 + local76 - this.anInt2744 - 1;
				this.anInt2743 = -this.anInt2743;
			}
			while (this.anInt2744 >= local81) {
				this.anInt2744 = local81 + local81 - this.anInt2744 - 1;
				this.anInt2743 = -this.anInt2743;
				if (this.anInt2744 >= local76) {
					return;
				}
				this.anInt2744 = local76 + local76 - this.anInt2744 - 1;
				this.anInt2743 = -this.anInt2743;
			}
		} else if (this.anInt2743 < 0) {
			if (this.anInt2744 < local76) {
				this.anInt2744 = local81 - (local81 - 1 - this.anInt2744) % local91 - 1;
			}
		} else if (this.anInt2744 >= local81) {
			this.anInt2744 = local76 + (this.anInt2744 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	public synchronized void method2469() {
		this.anInt2743 = (this.anInt2743 ^ this.anInt2743 >> 31) + (this.anInt2743 >>> 31);
		this.anInt2743 = -this.anInt2743;
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "()Z")
	public boolean method2470() {
		return this.anInt2744 < 0 || this.anInt2744 >= ((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6.length << 8;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public synchronized void method2472(@OriginalArg(0) int arg0) {
		this.anInt2739 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "()Lclient!ps;")
	@Override
	public Class5_Sub15 method6511() {
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6510(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2736 == 0 && this.anInt2737 == 0) {
			this.method6505(arg2);
			return;
		}
		@Pc(13) Class5_Sub5_Sub1 local13 = (Class5_Sub5_Sub1) super.aClass5_Sub5_5;
		@Pc(18) int local18 = this.anInt2746 << 8;
		@Pc(23) int local23 = this.anInt2745 << 8;
		@Pc(29) int local29 = local13.aByteArray6.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2739 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2744 < 0) {
			if (this.anInt2743 <= 0) {
				this.method2491();
				this.method7425();
				return;
			}
			this.anInt2744 = 0;
		}
		if (this.anInt2744 >= local29) {
			if (this.anInt2743 >= 0) {
				this.method2491();
				this.method7425();
				return;
			}
			this.anInt2744 = local29 - 1;
		}
		if (this.anInt2739 >= 0) {
			if (this.anInt2739 > 0) {
				if (this.aBoolean181) {
					label130: {
						if (this.anInt2743 < 0) {
							local40 = this.method2480(arg0, arg1, local18, local44, local13.aByteArray6[this.anInt2746]);
							if (this.anInt2744 >= local18) {
								return;
							}
							this.anInt2744 = local18 + local18 - this.anInt2744 - 1;
							this.anInt2743 = -this.anInt2743;
							if (--this.anInt2739 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2463(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2745 - 1]);
							if (this.anInt2744 < local23) {
								return;
							}
							this.anInt2744 = local23 + local23 - this.anInt2744 - 1;
							this.anInt2743 = -this.anInt2743;
							if (--this.anInt2739 == 0) {
								break;
							}
							local40 = this.method2480(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2746]);
							if (this.anInt2744 >= local18) {
								return;
							}
							this.anInt2744 = local18 + local18 - this.anInt2744 - 1;
							this.anInt2743 = -this.anInt2743;
						} while (--this.anInt2739 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2743 < 0) {
						while (true) {
							local40 = this.method2480(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2745 - 1]);
							if (this.anInt2744 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2744 - 1) / local33;
							if (local416 >= this.anInt2739) {
								this.anInt2744 += local33 * this.anInt2739;
								this.anInt2739 = 0;
								break;
							}
							this.anInt2744 += local33 * local416;
							this.anInt2739 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2463(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2746]);
							if (this.anInt2744 < local23) {
								return;
							}
							local416 = (this.anInt2744 - local18) / local33;
							if (local416 >= this.anInt2739) {
								this.anInt2744 -= local33 * this.anInt2739;
								this.anInt2739 = 0;
								break;
							}
							this.anInt2744 -= local33 * local416;
							this.anInt2739 -= local416;
						}
					}
				}
			}
			if (this.anInt2743 < 0) {
				this.method2480(arg0, local40, 0, local44, 0);
				if (this.anInt2744 < 0) {
					this.anInt2744 = -1;
					this.method2491();
					this.method7425();
					return;
				}
			} else {
				this.method2463(arg0, local40, local29, local44, 0);
				if (this.anInt2744 >= local29) {
					this.anInt2744 = local29;
					this.method2491();
					this.method7425();
				}
			}
		} else if (this.aBoolean181) {
			if (this.anInt2743 < 0) {
				local40 = this.method2480(arg0, arg1, local18, local44, local13.aByteArray6[this.anInt2746]);
				if (this.anInt2744 >= local18) {
					return;
				}
				this.anInt2744 = local18 + local18 - this.anInt2744 - 1;
				this.anInt2743 = -this.anInt2743;
			}
			while (true) {
				local40 = this.method2463(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2745 - 1]);
				if (this.anInt2744 < local23) {
					return;
				}
				this.anInt2744 = local23 + local23 - this.anInt2744 - 1;
				this.anInt2743 = -this.anInt2743;
				local40 = this.method2480(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2746]);
				if (this.anInt2744 >= local18) {
					return;
				}
				this.anInt2744 = local18 + local18 - this.anInt2744 - 1;
				this.anInt2743 = -this.anInt2743;
			}
		} else if (this.anInt2743 < 0) {
			while (true) {
				local40 = this.method2480(arg0, local40, local18, local44, local13.aByteArray6[this.anInt2745 - 1]);
				if (this.anInt2744 >= local18) {
					return;
				}
				this.anInt2744 = local23 - (local23 - 1 - this.anInt2744) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2463(arg0, local40, local23, local44, local13.aByteArray6[this.anInt2746]);
				if (this.anInt2744 < local23) {
					return;
				}
				this.anInt2744 = local18 + (this.anInt2744 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
	public synchronized void method2477(@OriginalArg(0) int arg0) {
		if (this.anInt2743 < 0) {
			this.anInt2743 = -arg0;
		} else {
			this.anInt2743 = arg0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "()I")
	public synchronized int method2478() {
		return this.anInt2736 == Integer.MIN_VALUE ? 0 : this.anInt2736;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "([IIIII)I")
	private int method2480(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2737 <= 0) {
				if (this.anInt2743 == -256 && (this.anInt2744 & 0xFF) == 0) {
					if (Static543.aBoolean438) {
						return Static552.method2483(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2741, this.anInt2735, arg3, arg2, this);
					}
					return Static552.method2464(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2734, arg3, arg2, this);
				}
				if (Static543.aBoolean438) {
					return Static552.method2475(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2741, this.anInt2735, arg3, arg2, this, this.anInt2743, arg4);
				}
				return Static552.method2493(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2734, arg3, arg2, this, this.anInt2743, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2737;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2737 += arg1;
			if (this.anInt2743 == -256 && (this.anInt2744 & 0xFF) == 0) {
				if (Static543.aBoolean438) {
					arg1 = Static552.method2471(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2741, this.anInt2735, this.anInt2738, this.anInt2740, local5, arg2, this);
				} else {
					arg1 = Static552.method2468(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2734, this.anInt2742, local5, arg2, this);
				}
			} else if (Static543.aBoolean438) {
				arg1 = Static552.method2482(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2741, this.anInt2735, this.anInt2738, this.anInt2740, local5, arg2, this, this.anInt2743, arg4);
			} else {
				arg1 = Static552.method2457(((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6, arg0, this.anInt2744, arg1, this.anInt2734, this.anInt2742, local5, arg2, this, this.anInt2743, arg4);
			}
			this.anInt2737 -= arg1;
			if (this.anInt2737 != 0) {
				return arg1;
			}
		} while (!this.method2492());
		return arg3;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()I")
	@Override
	public int method6508() {
		return this.anInt2736 == 0 && this.anInt2737 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
	private synchronized void method2481() {
		this.method2486(0, this.method2490());
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
	public synchronized void method2484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2486(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static552.method2473(arg1, arg2);
		@Pc(14) int local14 = Static552.method2465(arg1, arg2);
		if (this.anInt2741 == local10 && this.anInt2735 == local14) {
			this.anInt2737 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2734;
		if (this.anInt2734 - arg1 > local31) {
			local31 = this.anInt2734 - arg1;
		}
		if (local10 - this.anInt2741 > local31) {
			local31 = local10 - this.anInt2741;
		}
		if (this.anInt2741 - local10 > local31) {
			local31 = this.anInt2741 - local10;
		}
		if (local14 - this.anInt2735 > local31) {
			local31 = local14 - this.anInt2735;
		}
		if (this.anInt2735 - local14 > local31) {
			local31 = this.anInt2735 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2737 = arg0;
		this.anInt2736 = arg1;
		this.anInt2747 = arg2;
		this.anInt2742 = (arg1 - this.anInt2734) / arg0;
		this.anInt2738 = (local10 - this.anInt2741) / arg0;
		this.anInt2740 = (local14 - this.anInt2735) / arg0;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "()I")
	@Override
	public int method6509() {
		@Pc(6) int local6 = this.anInt2734 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2739 == 0) {
			local6 -= local6 * this.anInt2744 / (((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6.length << 8);
		} else if (this.anInt2739 >= 0) {
			local6 -= local6 * this.anInt2746 / ((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V")
	private synchronized void method2486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2736 = arg0;
		this.anInt2747 = arg1;
		this.anInt2737 = 0;
		this.method2456();
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)V")
	public synchronized void method2487(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub5_Sub1) super.aClass5_Sub5_5).aByteArray6.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2744 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(II)V")
	public synchronized void method2489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2484(arg0, arg1, this.method2490());
	}

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "()I")
	public synchronized int method2490() {
		return this.anInt2747 < 0 ? -1 : this.anInt2747;
	}

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "()V")
	private void method2491() {
		if (this.anInt2737 == 0) {
			return;
		}
		if (this.anInt2736 == Integer.MIN_VALUE) {
			this.anInt2736 = 0;
		}
		this.anInt2737 = 0;
		this.method2456();
	}

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "()Z")
	private boolean method2492() {
		@Pc(2) int local2 = this.anInt2736;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static552.method2473(local2, this.anInt2747);
			local8 = Static552.method2465(local2, this.anInt2747);
		}
		if (this.anInt2734 != local2 || this.anInt2741 != local10 || this.anInt2735 != local8) {
			if (this.anInt2734 < local2) {
				this.anInt2742 = 1;
				this.anInt2737 = local2 - this.anInt2734;
			} else if (this.anInt2734 > local2) {
				this.anInt2742 = -1;
				this.anInt2737 = this.anInt2734 - local2;
			} else {
				this.anInt2742 = 0;
			}
			if (this.anInt2741 < local10) {
				this.anInt2738 = 1;
				if (this.anInt2737 == 0 || this.anInt2737 > local10 - this.anInt2741) {
					this.anInt2737 = local10 - this.anInt2741;
				}
			} else if (this.anInt2741 > local10) {
				this.anInt2738 = -1;
				if (this.anInt2737 == 0 || this.anInt2737 > this.anInt2741 - local10) {
					this.anInt2737 = this.anInt2741 - local10;
				}
			} else {
				this.anInt2738 = 0;
			}
			if (this.anInt2735 < local8) {
				this.anInt2740 = 1;
				if (this.anInt2737 == 0 || this.anInt2737 > local8 - this.anInt2735) {
					this.anInt2737 = local8 - this.anInt2735;
				}
			} else if (this.anInt2735 > local8) {
				this.anInt2740 = -1;
				if (this.anInt2737 == 0 || this.anInt2737 > this.anInt2735 - local8) {
					this.anInt2737 = this.anInt2735 - local8;
				}
			} else {
				this.anInt2740 = 0;
			}
			return false;
		} else if (this.anInt2736 == Integer.MIN_VALUE) {
			this.anInt2736 = 0;
			this.anInt2734 = this.anInt2741 = this.anInt2735 = 0;
			this.method7425();
			return true;
		} else {
			this.method2456();
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V")
	public synchronized void method2495(@OriginalArg(0) int arg0) {
		this.method2486(arg0 << 6, this.method2490());
	}
}
