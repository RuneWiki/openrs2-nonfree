import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub7_Sub2 extends Class1_Sub7 {

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	public int anInt2727;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
	public int anInt2728;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
	public int anInt2730;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
	private int anInt2731;

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
	public int anInt2732;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
	private int anInt2735;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
	public int anInt2736;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	public int anInt2737;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	private final int anInt2740;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	private final int anInt2733;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "Z")
	private final boolean aBoolean236;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
	private int anInt2729;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	private int anInt2738;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	private int anInt2734;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	public int anInt2739;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!uk;II)V")
	public Class1_Sub7_Sub2(@OriginalArg(0) Class1_Sub31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub31_5 = arg0;
		this.anInt2740 = arg0.anInt5827;
		this.anInt2733 = arg0.anInt5826;
		this.aBoolean236 = arg0.aBoolean533;
		this.anInt2729 = arg1;
		this.anInt2738 = arg2;
		this.anInt2734 = 8192;
		this.anInt2739 = 0;
		this.method2235();
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!uk;III)V")
	public Class1_Sub7_Sub2(@OriginalArg(0) Class1_Sub31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub31_5 = arg0;
		this.anInt2740 = arg0.anInt5827;
		this.anInt2733 = arg0.anInt5826;
		this.aBoolean236 = arg0.aBoolean533;
		this.anInt2729 = arg1;
		this.anInt2738 = arg2;
		this.anInt2734 = arg3;
		this.anInt2739 = 0;
		this.method2235();
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "()Z")
	public boolean method2227() {
		return this.anInt2731 != 0;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4404(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2738 == 0 && this.anInt2731 == 0) {
			this.method4405(arg2);
			return;
		}
		@Pc(13) Class1_Sub31_Sub1 local13 = (Class1_Sub31_Sub1) super.aClass1_Sub31_5;
		@Pc(18) int local18 = this.anInt2740 << 8;
		@Pc(23) int local23 = this.anInt2733 << 8;
		@Pc(29) int local29 = local13.aByteArray84.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2735 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2739 < 0) {
			if (this.anInt2729 <= 0) {
				this.method2254();
				this.method5577();
				return;
			}
			this.anInt2739 = 0;
		}
		if (this.anInt2739 >= local29) {
			if (this.anInt2729 >= 0) {
				this.method2254();
				this.method5577();
				return;
			}
			this.anInt2739 = local29 - 1;
		}
		if (this.anInt2735 >= 0) {
			if (this.anInt2735 > 0) {
				if (this.aBoolean236) {
					label130: {
						if (this.anInt2729 < 0) {
							local40 = this.method2257(arg0, arg1, local18, local44, local13.aByteArray84[this.anInt2740]);
							if (this.anInt2739 >= local18) {
								return;
							}
							this.anInt2739 = local18 + local18 - this.anInt2739 - 1;
							this.anInt2729 = -this.anInt2729;
							if (--this.anInt2735 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2233(arg0, local40, local23, local44, local13.aByteArray84[this.anInt2733 - 1]);
							if (this.anInt2739 < local23) {
								return;
							}
							this.anInt2739 = local23 + local23 - this.anInt2739 - 1;
							this.anInt2729 = -this.anInt2729;
							if (--this.anInt2735 == 0) {
								break;
							}
							local40 = this.method2257(arg0, local40, local18, local44, local13.aByteArray84[this.anInt2740]);
							if (this.anInt2739 >= local18) {
								return;
							}
							this.anInt2739 = local18 + local18 - this.anInt2739 - 1;
							this.anInt2729 = -this.anInt2729;
						} while (--this.anInt2735 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2729 < 0) {
						while (true) {
							local40 = this.method2257(arg0, local40, local18, local44, local13.aByteArray84[this.anInt2733 - 1]);
							if (this.anInt2739 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2739 - 1) / local33;
							if (local416 >= this.anInt2735) {
								this.anInt2739 += local33 * this.anInt2735;
								this.anInt2735 = 0;
								break;
							}
							this.anInt2739 += local33 * local416;
							this.anInt2735 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2233(arg0, local40, local23, local44, local13.aByteArray84[this.anInt2740]);
							if (this.anInt2739 < local23) {
								return;
							}
							local416 = (this.anInt2739 - local18) / local33;
							if (local416 >= this.anInt2735) {
								this.anInt2739 -= local33 * this.anInt2735;
								this.anInt2735 = 0;
								break;
							}
							this.anInt2739 -= local33 * local416;
							this.anInt2735 -= local416;
						}
					}
				}
			}
			if (this.anInt2729 < 0) {
				this.method2257(arg0, local40, 0, local44, 0);
				if (this.anInt2739 < 0) {
					this.anInt2739 = -1;
					this.method2254();
					this.method5577();
					return;
				}
			} else {
				this.method2233(arg0, local40, local29, local44, 0);
				if (this.anInt2739 >= local29) {
					this.anInt2739 = local29;
					this.method2254();
					this.method5577();
				}
			}
		} else if (this.aBoolean236) {
			if (this.anInt2729 < 0) {
				local40 = this.method2257(arg0, arg1, local18, local44, local13.aByteArray84[this.anInt2740]);
				if (this.anInt2739 >= local18) {
					return;
				}
				this.anInt2739 = local18 + local18 - this.anInt2739 - 1;
				this.anInt2729 = -this.anInt2729;
			}
			while (true) {
				local40 = this.method2233(arg0, local40, local23, local44, local13.aByteArray84[this.anInt2733 - 1]);
				if (this.anInt2739 < local23) {
					return;
				}
				this.anInt2739 = local23 + local23 - this.anInt2739 - 1;
				this.anInt2729 = -this.anInt2729;
				local40 = this.method2257(arg0, local40, local18, local44, local13.aByteArray84[this.anInt2740]);
				if (this.anInt2739 >= local18) {
					return;
				}
				this.anInt2739 = local18 + local18 - this.anInt2739 - 1;
				this.anInt2729 = -this.anInt2729;
			}
		} else if (this.anInt2729 < 0) {
			while (true) {
				local40 = this.method2257(arg0, local40, local18, local44, local13.aByteArray84[this.anInt2733 - 1]);
				if (this.anInt2739 >= local18) {
					return;
				}
				this.anInt2739 = local23 - (local23 - 1 - this.anInt2739) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2233(arg0, local40, local23, local44, local13.aByteArray84[this.anInt2740]);
				if (this.anInt2739 < local23) {
					return;
				}
				this.anInt2739 = local18 + (this.anInt2739 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()I")
	@Override
	public int method4409() {
		return this.anInt2738 == 0 && this.anInt2731 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "()Z")
	private boolean method2230() {
		@Pc(2) int local2 = this.anInt2738;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static399.method2232(local2, this.anInt2734);
			local8 = Static399.method2258(local2, this.anInt2734);
		}
		if (this.anInt2728 != local2 || this.anInt2727 != local10 || this.anInt2736 != local8) {
			if (this.anInt2728 < local2) {
				this.anInt2737 = 1;
				this.anInt2731 = local2 - this.anInt2728;
			} else if (this.anInt2728 > local2) {
				this.anInt2737 = -1;
				this.anInt2731 = this.anInt2728 - local2;
			} else {
				this.anInt2737 = 0;
			}
			if (this.anInt2727 < local10) {
				this.anInt2730 = 1;
				if (this.anInt2731 == 0 || this.anInt2731 > local10 - this.anInt2727) {
					this.anInt2731 = local10 - this.anInt2727;
				}
			} else if (this.anInt2727 > local10) {
				this.anInt2730 = -1;
				if (this.anInt2731 == 0 || this.anInt2731 > this.anInt2727 - local10) {
					this.anInt2731 = this.anInt2727 - local10;
				}
			} else {
				this.anInt2730 = 0;
			}
			if (this.anInt2736 < local8) {
				this.anInt2732 = 1;
				if (this.anInt2731 == 0 || this.anInt2731 > local8 - this.anInt2736) {
					this.anInt2731 = local8 - this.anInt2736;
				}
			} else if (this.anInt2736 > local8) {
				this.anInt2732 = -1;
				if (this.anInt2731 == 0 || this.anInt2731 > this.anInt2736 - local8) {
					this.anInt2731 = this.anInt2736 - local8;
				}
			} else {
				this.anInt2732 = 0;
			}
			return false;
		} else if (this.anInt2738 == Integer.MIN_VALUE) {
			this.anInt2738 = 0;
			this.anInt2728 = this.anInt2727 = this.anInt2736 = 0;
			this.method5577();
			return true;
		} else {
			this.method2235();
			return false;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIII)I")
	private int method2233(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2731 <= 0) {
				if (this.anInt2729 == 256 && (this.anInt2739 & 0xFF) == 0) {
					if (Static250.aBoolean432) {
						return Static399.method2247(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2727, this.anInt2736, arg3, arg2, this);
					}
					return Static399.method2261(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2728, arg3, arg2, this);
				}
				if (Static250.aBoolean432) {
					return Static399.method2242(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2727, this.anInt2736, arg3, arg2, this, this.anInt2729, arg4);
				}
				return Static399.method2250(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2728, arg3, arg2, this, this.anInt2729, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2731;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2731 += arg1;
			if (this.anInt2729 == 256 && (this.anInt2739 & 0xFF) == 0) {
				if (Static250.aBoolean432) {
					arg1 = Static399.method2256(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2727, this.anInt2736, this.anInt2730, this.anInt2732, local5, arg2, this);
				} else {
					arg1 = Static399.method2236(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2728, this.anInt2737, local5, arg2, this);
				}
			} else if (Static250.aBoolean432) {
				arg1 = Static399.method2229(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2727, this.anInt2736, this.anInt2730, this.anInt2732, local5, arg2, this, this.anInt2729, arg4);
			} else {
				arg1 = Static399.method2240(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2728, this.anInt2737, local5, arg2, this, this.anInt2729, arg4);
			}
			this.anInt2731 -= arg1;
			if (this.anInt2731 != 0) {
				return arg1;
			}
		} while (!this.method2230());
		return arg3;
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	private synchronized void method2234() {
		this.method2260(0, this.method2239());
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "()V")
	private void method2235() {
		this.anInt2728 = this.anInt2738;
		this.anInt2727 = Static399.method2232(this.anInt2738, this.anInt2734);
		this.anInt2736 = Static399.method2258(this.anInt2738, this.anInt2734);
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4405(@OriginalArg(0) int arg0) {
		if (this.anInt2731 > 0) {
			if (arg0 >= this.anInt2731) {
				if (this.anInt2738 == Integer.MIN_VALUE) {
					this.anInt2738 = 0;
					this.anInt2728 = this.anInt2727 = this.anInt2736 = 0;
					this.method5577();
					arg0 = this.anInt2731;
				}
				this.anInt2731 = 0;
				this.method2235();
			} else {
				this.anInt2728 += this.anInt2737 * arg0;
				this.anInt2727 += this.anInt2730 * arg0;
				this.anInt2736 += this.anInt2732 * arg0;
				this.anInt2731 -= arg0;
			}
		}
		@Pc(71) Class1_Sub31_Sub1 local71 = (Class1_Sub31_Sub1) super.aClass1_Sub31_5;
		@Pc(76) int local76 = this.anInt2740 << 8;
		@Pc(81) int local81 = this.anInt2733 << 8;
		@Pc(87) int local87 = local71.aByteArray84.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2735 = 0;
		}
		if (this.anInt2739 < 0) {
			if (this.anInt2729 <= 0) {
				this.method2254();
				this.method5577();
				return;
			}
			this.anInt2739 = 0;
		}
		if (this.anInt2739 >= local87) {
			if (this.anInt2729 >= 0) {
				this.method2254();
				this.method5577();
				return;
			}
			this.anInt2739 = local87 - 1;
		}
		this.anInt2739 += this.anInt2729 * arg0;
		if (this.anInt2735 >= 0) {
			if (this.anInt2735 > 0) {
				if (this.aBoolean236) {
					label125: {
						if (this.anInt2729 < 0) {
							if (this.anInt2739 >= local76) {
								return;
							}
							this.anInt2739 = local76 + local76 - this.anInt2739 - 1;
							this.anInt2729 = -this.anInt2729;
							if (--this.anInt2735 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2739 < local81) {
								return;
							}
							this.anInt2739 = local81 + local81 - this.anInt2739 - 1;
							this.anInt2729 = -this.anInt2729;
							if (--this.anInt2735 == 0) {
								break;
							}
							if (this.anInt2739 >= local76) {
								return;
							}
							this.anInt2739 = local76 + local76 - this.anInt2739 - 1;
							this.anInt2729 = -this.anInt2729;
						} while (--this.anInt2735 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2729 < 0) {
						if (this.anInt2739 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2739 - 1) / local91;
						if (local361 < this.anInt2735) {
							this.anInt2739 += local91 * local361;
							this.anInt2735 -= local361;
							return;
						}
						this.anInt2739 += local91 * this.anInt2735;
						this.anInt2735 = 0;
					} else if (this.anInt2739 >= local81) {
						local361 = (this.anInt2739 - local76) / local91;
						if (local361 < this.anInt2735) {
							this.anInt2739 -= local91 * local361;
							this.anInt2735 -= local361;
							return;
						}
						this.anInt2739 -= local91 * this.anInt2735;
						this.anInt2735 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2729 < 0) {
				if (this.anInt2739 < 0) {
					this.anInt2739 = -1;
					this.method2254();
					this.method5577();
					return;
				}
			} else if (this.anInt2739 >= local87) {
				this.anInt2739 = local87;
				this.method2254();
				this.method5577();
			}
		} else if (this.aBoolean236) {
			if (this.anInt2729 < 0) {
				if (this.anInt2739 >= local76) {
					return;
				}
				this.anInt2739 = local76 + local76 - this.anInt2739 - 1;
				this.anInt2729 = -this.anInt2729;
			}
			while (this.anInt2739 >= local81) {
				this.anInt2739 = local81 + local81 - this.anInt2739 - 1;
				this.anInt2729 = -this.anInt2729;
				if (this.anInt2739 >= local76) {
					return;
				}
				this.anInt2739 = local76 + local76 - this.anInt2739 - 1;
				this.anInt2729 = -this.anInt2729;
			}
		} else if (this.anInt2729 < 0) {
			if (this.anInt2739 < local76) {
				this.anInt2739 = local81 - (local81 - 1 - this.anInt2739) % local91 - 1;
			}
		} else if (this.anInt2739 >= local81) {
			this.anInt2739 = local76 + (this.anInt2739 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
	public synchronized void method2238(@OriginalArg(0) int arg0) {
		this.anInt2735 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "()I")
	public synchronized int method2239() {
		return this.anInt2734 < 0 ? -1 : this.anInt2734;
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
	public synchronized void method2244(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2739 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "()I")
	public synchronized int method2246() {
		return this.anInt2729 < 0 ? -this.anInt2729 : this.anInt2729;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)V")
	public synchronized void method2248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2249(arg0, arg1, this.method2239());
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public synchronized void method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2260(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static399.method2232(arg1, arg2);
		@Pc(14) int local14 = Static399.method2258(arg1, arg2);
		if (this.anInt2727 == local10 && this.anInt2736 == local14) {
			this.anInt2731 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2728;
		if (this.anInt2728 - arg1 > local31) {
			local31 = this.anInt2728 - arg1;
		}
		if (local10 - this.anInt2727 > local31) {
			local31 = local10 - this.anInt2727;
		}
		if (this.anInt2727 - local10 > local31) {
			local31 = this.anInt2727 - local10;
		}
		if (local14 - this.anInt2736 > local31) {
			local31 = local14 - this.anInt2736;
		}
		if (this.anInt2736 - local14 > local31) {
			local31 = this.anInt2736 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2731 = arg0;
		this.anInt2738 = arg1;
		this.anInt2734 = arg2;
		this.anInt2737 = (arg1 - this.anInt2728) / arg0;
		this.anInt2730 = (local10 - this.anInt2727) / arg0;
		this.anInt2732 = (local14 - this.anInt2736) / arg0;
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
	public synchronized void method2251(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2234();
			this.method5577();
		} else if (this.anInt2727 == 0 && this.anInt2736 == 0) {
			this.anInt2731 = 0;
			this.anInt2738 = 0;
			this.anInt2728 = 0;
			this.method5577();
		} else {
			@Pc(31) int local31 = -this.anInt2728;
			if (this.anInt2728 > local31) {
				local31 = this.anInt2728;
			}
			if (-this.anInt2727 > local31) {
				local31 = -this.anInt2727;
			}
			if (this.anInt2727 > local31) {
				local31 = this.anInt2727;
			}
			if (-this.anInt2736 > local31) {
				local31 = -this.anInt2736;
			}
			if (this.anInt2736 > local31) {
				local31 = this.anInt2736;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2731 = arg0;
			this.anInt2738 = Integer.MIN_VALUE;
			this.anInt2737 = -this.anInt2728 / arg0;
			this.anInt2730 = -this.anInt2727 / arg0;
			this.anInt2732 = -this.anInt2736 / arg0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "(I)V")
	public synchronized void method2252(@OriginalArg(0) int arg0) {
		this.method2260(arg0 << 6, this.method2239());
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()I")
	@Override
	public int method4406() {
		@Pc(6) int local6 = this.anInt2728 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2735 == 0) {
			local6 -= local6 * this.anInt2739 / (((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84.length << 8);
		} else if (this.anInt2735 >= 0) {
			local6 -= local6 * this.anInt2740 / ((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "()Z")
	public boolean method2253() {
		return this.anInt2739 < 0 || this.anInt2739 >= ((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84.length << 8;
	}

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "()V")
	private void method2254() {
		if (this.anInt2731 == 0) {
			return;
		}
		if (this.anInt2738 == Integer.MIN_VALUE) {
			this.anInt2738 = 0;
		}
		this.anInt2731 = 0;
		this.method2235();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "([IIIII)I")
	private int method2257(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2731 <= 0) {
				if (this.anInt2729 == -256 && (this.anInt2739 & 0xFF) == 0) {
					if (Static250.aBoolean432) {
						return Static399.method2231(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2727, this.anInt2736, arg3, arg2, this);
					}
					return Static399.method2241(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2728, arg3, arg2, this);
				}
				if (Static250.aBoolean432) {
					return Static399.method2226(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2727, this.anInt2736, arg3, arg2, this, this.anInt2729, arg4);
				}
				return Static399.method2237(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2728, arg3, arg2, this, this.anInt2729, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2731;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2731 += arg1;
			if (this.anInt2729 == -256 && (this.anInt2739 & 0xFF) == 0) {
				if (Static250.aBoolean432) {
					arg1 = Static399.method2225(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2727, this.anInt2736, this.anInt2730, this.anInt2732, local5, arg2, this);
				} else {
					arg1 = Static399.method2228(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2728, this.anInt2737, local5, arg2, this);
				}
			} else if (Static250.aBoolean432) {
				arg1 = Static399.method2245(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2727, this.anInt2736, this.anInt2730, this.anInt2732, local5, arg2, this, this.anInt2729, arg4);
			} else {
				arg1 = Static399.method2259(((Class1_Sub31_Sub1) super.aClass1_Sub31_5).aByteArray84, arg0, this.anInt2739, arg1, this.anInt2728, this.anInt2737, local5, arg2, this, this.anInt2729, arg4);
			}
			this.anInt2731 -= arg1;
			if (this.anInt2731 != 0) {
				return arg1;
			}
		} while (!this.method2230());
		return arg3;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(II)V")
	private synchronized void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2738 = arg0;
		this.anInt2734 = arg1;
		this.anInt2731 = 0;
		this.method2235();
	}

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "()I")
	public synchronized int method2262() {
		return this.anInt2738 == Integer.MIN_VALUE ? 0 : this.anInt2738;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()Lclient!uh;")
	@Override
	public Class1_Sub7 method4408() {
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()Lclient!uh;")
	@Override
	public Class1_Sub7 method4407() {
		return null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public synchronized void method2263() {
		this.anInt2729 = (this.anInt2729 ^ this.anInt2729 >> 31) + (this.anInt2729 >>> 31);
		this.anInt2729 = -this.anInt2729;
	}

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "(I)V")
	public synchronized void method2264(@OriginalArg(0) int arg0) {
		if (this.anInt2729 < 0) {
			this.anInt2729 = -arg0;
		} else {
			this.anInt2729 = arg0;
		}
	}
}
