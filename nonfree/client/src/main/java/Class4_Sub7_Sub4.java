import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class4_Sub7_Sub4 extends Class4_Sub7 {

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
	public int anInt7721;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
	public int anInt7723;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
	public int anInt7724;

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
	public int anInt7725;

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
	public int anInt7728;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
	private int anInt7729;

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
	public int anInt7731;

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
	private int anInt7733;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
	private final int anInt7727;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
	private final int anInt7722;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "Z")
	private final boolean aBoolean533;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
	private int anInt7732;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
	private int anInt7726;

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
	private int anInt7734;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
	public int anInt7730;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!ep;III)V")
	public Class4_Sub7_Sub4(@OriginalArg(0) Class4_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub16_5 = arg0;
		this.anInt7727 = arg0.anInt2745;
		this.anInt7722 = arg0.anInt2746;
		this.aBoolean533 = arg0.aBoolean207;
		this.anInt7732 = arg1;
		this.anInt7726 = arg2;
		this.anInt7734 = arg3;
		this.anInt7730 = 0;
		this.method6432();
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "()I")
	public synchronized int method6407() {
		return this.anInt7732 < 0 ? -this.anInt7732 : this.anInt7732;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public synchronized void method6408(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method6435();
			this.method8379();
		} else if (this.anInt7724 == 0 && this.anInt7731 == 0) {
			this.anInt7729 = 0;
			this.anInt7726 = 0;
			this.anInt7723 = 0;
			this.method8379();
		} else {
			@Pc(31) int local31 = -this.anInt7723;
			if (this.anInt7723 > local31) {
				local31 = this.anInt7723;
			}
			if (-this.anInt7724 > local31) {
				local31 = -this.anInt7724;
			}
			if (this.anInt7724 > local31) {
				local31 = this.anInt7724;
			}
			if (-this.anInt7731 > local31) {
				local31 = -this.anInt7731;
			}
			if (this.anInt7731 > local31) {
				local31 = this.anInt7731;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt7729 = arg0;
			this.anInt7726 = Integer.MIN_VALUE;
			this.anInt7728 = -this.anInt7723 / arg0;
			this.anInt7725 = -this.anInt7724 / arg0;
			this.anInt7721 = -this.anInt7731 / arg0;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6400(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7726 == 0 && this.anInt7729 == 0) {
			this.method6402(arg2);
			return;
		}
		@Pc(13) Class4_Sub16_Sub1 local13 = (Class4_Sub16_Sub1) super.aClass4_Sub16_5;
		@Pc(18) int local18 = this.anInt7727 << 8;
		@Pc(23) int local23 = this.anInt7722 << 8;
		@Pc(29) int local29 = local13.aByteArray27.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt7733 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt7730 < 0) {
			if (this.anInt7732 <= 0) {
				this.method6414();
				this.method8379();
				return;
			}
			this.anInt7730 = 0;
		}
		if (this.anInt7730 >= local29) {
			if (this.anInt7732 >= 0) {
				this.method6414();
				this.method8379();
				return;
			}
			this.anInt7730 = local29 - 1;
		}
		if (this.anInt7733 >= 0) {
			if (this.anInt7733 > 0) {
				if (this.aBoolean533) {
					label130: {
						if (this.anInt7732 < 0) {
							local40 = this.method6416(arg0, arg1, local18, local44, local13.aByteArray27[this.anInt7727]);
							if (this.anInt7730 >= local18) {
								return;
							}
							this.anInt7730 = local18 + local18 - this.anInt7730 - 1;
							this.anInt7732 = -this.anInt7732;
							if (--this.anInt7733 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method6445(arg0, local40, local23, local44, local13.aByteArray27[this.anInt7722 - 1]);
							if (this.anInt7730 < local23) {
								return;
							}
							this.anInt7730 = local23 + local23 - this.anInt7730 - 1;
							this.anInt7732 = -this.anInt7732;
							if (--this.anInt7733 == 0) {
								break;
							}
							local40 = this.method6416(arg0, local40, local18, local44, local13.aByteArray27[this.anInt7727]);
							if (this.anInt7730 >= local18) {
								return;
							}
							this.anInt7730 = local18 + local18 - this.anInt7730 - 1;
							this.anInt7732 = -this.anInt7732;
						} while (--this.anInt7733 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt7732 < 0) {
						while (true) {
							local40 = this.method6416(arg0, local40, local18, local44, local13.aByteArray27[this.anInt7722 - 1]);
							if (this.anInt7730 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt7730 - 1) / local33;
							if (local416 >= this.anInt7733) {
								this.anInt7730 += local33 * this.anInt7733;
								this.anInt7733 = 0;
								break;
							}
							this.anInt7730 += local33 * local416;
							this.anInt7733 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method6445(arg0, local40, local23, local44, local13.aByteArray27[this.anInt7727]);
							if (this.anInt7730 < local23) {
								return;
							}
							local416 = (this.anInt7730 - local18) / local33;
							if (local416 >= this.anInt7733) {
								this.anInt7730 -= local33 * this.anInt7733;
								this.anInt7733 = 0;
								break;
							}
							this.anInt7730 -= local33 * local416;
							this.anInt7733 -= local416;
						}
					}
				}
			}
			if (this.anInt7732 < 0) {
				this.method6416(arg0, local40, 0, local44, 0);
				if (this.anInt7730 < 0) {
					this.anInt7730 = -1;
					this.method6414();
					this.method8379();
					return;
				}
			} else {
				this.method6445(arg0, local40, local29, local44, 0);
				if (this.anInt7730 >= local29) {
					this.anInt7730 = local29;
					this.method6414();
					this.method8379();
				}
			}
		} else if (this.aBoolean533) {
			if (this.anInt7732 < 0) {
				local40 = this.method6416(arg0, arg1, local18, local44, local13.aByteArray27[this.anInt7727]);
				if (this.anInt7730 >= local18) {
					return;
				}
				this.anInt7730 = local18 + local18 - this.anInt7730 - 1;
				this.anInt7732 = -this.anInt7732;
			}
			while (true) {
				local40 = this.method6445(arg0, local40, local23, local44, local13.aByteArray27[this.anInt7722 - 1]);
				if (this.anInt7730 < local23) {
					return;
				}
				this.anInt7730 = local23 + local23 - this.anInt7730 - 1;
				this.anInt7732 = -this.anInt7732;
				local40 = this.method6416(arg0, local40, local18, local44, local13.aByteArray27[this.anInt7727]);
				if (this.anInt7730 >= local18) {
					return;
				}
				this.anInt7730 = local18 + local18 - this.anInt7730 - 1;
				this.anInt7732 = -this.anInt7732;
			}
		} else if (this.anInt7732 < 0) {
			while (true) {
				local40 = this.method6416(arg0, local40, local18, local44, local13.aByteArray27[this.anInt7722 - 1]);
				if (this.anInt7730 >= local18) {
					return;
				}
				this.anInt7730 = local23 - (local23 - 1 - this.anInt7730) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method6445(arg0, local40, local23, local44, local13.aByteArray27[this.anInt7727]);
				if (this.anInt7730 < local23) {
					return;
				}
				this.anInt7730 = local18 + (this.anInt7730 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V")
	public synchronized void method6410() {
		this.method6417(this.method6426(), 8192);
	}

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "(I)V")
	public synchronized void method6411(@OriginalArg(0) int arg0) {
		if (this.anInt7732 < 0) {
			this.anInt7732 = -arg0;
		} else {
			this.anInt7732 = arg0;
		}
	}

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "(I)V")
	public synchronized void method6412(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt7730 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "()I")
	@Override
	public int method6399() {
		@Pc(6) int local6 = this.anInt7723 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt7733 == 0) {
			local6 -= local6 * this.anInt7730 / (((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27.length << 8);
		} else if (this.anInt7733 >= 0) {
			local6 -= local6 * this.anInt7727 / ((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "()Z")
	public boolean method6413() {
		return this.anInt7729 != 0;
	}

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "()V")
	private void method6414() {
		if (this.anInt7729 == 0) {
			return;
		}
		if (this.anInt7726 == Integer.MIN_VALUE) {
			this.anInt7726 = 0;
		}
		this.anInt7729 = 0;
		this.method6432();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([IIIII)I")
	private int method6416(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7729 <= 0) {
				if (this.anInt7732 == -256 && (this.anInt7730 & 0xFF) == 0) {
					if (Static161.aBoolean31) {
						return Static600.method6425(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7724, this.anInt7731, arg3, arg2, this);
					}
					return Static600.method6418(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7723, arg3, arg2, this);
				}
				if (Static161.aBoolean31) {
					return Static600.method6420(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7724, this.anInt7731, arg3, arg2, this, this.anInt7732, arg4);
				}
				return Static600.method6421(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7723, arg3, arg2, this, this.anInt7732, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7729;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7729 += arg1;
			if (this.anInt7732 == -256 && (this.anInt7730 & 0xFF) == 0) {
				if (Static161.aBoolean31) {
					arg1 = Static600.method6441(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7724, this.anInt7731, this.anInt7725, this.anInt7721, local5, arg2, this);
				} else {
					arg1 = Static600.method6409(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7723, this.anInt7728, local5, arg2, this);
				}
			} else if (Static161.aBoolean31) {
				arg1 = Static600.method6442(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7724, this.anInt7731, this.anInt7725, this.anInt7721, local5, arg2, this, this.anInt7732, arg4);
			} else {
				arg1 = Static600.method6428(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7723, this.anInt7728, local5, arg2, this, this.anInt7732, arg4);
			}
			this.anInt7729 -= arg1;
			if (this.anInt7729 != 0) {
				return arg1;
			}
		} while (!this.method6438());
		return arg3;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
	private synchronized void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7726 = arg0;
		this.anInt7734 = arg1;
		this.anInt7729 = 0;
		this.method6432();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6402(@OriginalArg(0) int arg0) {
		if (this.anInt7729 > 0) {
			if (arg0 >= this.anInt7729) {
				if (this.anInt7726 == Integer.MIN_VALUE) {
					this.anInt7726 = 0;
					this.anInt7723 = this.anInt7724 = this.anInt7731 = 0;
					this.method8379();
					arg0 = this.anInt7729;
				}
				this.anInt7729 = 0;
				this.method6432();
			} else {
				this.anInt7723 += this.anInt7728 * arg0;
				this.anInt7724 += this.anInt7725 * arg0;
				this.anInt7731 += this.anInt7721 * arg0;
				this.anInt7729 -= arg0;
			}
		}
		@Pc(71) Class4_Sub16_Sub1 local71 = (Class4_Sub16_Sub1) super.aClass4_Sub16_5;
		@Pc(76) int local76 = this.anInt7727 << 8;
		@Pc(81) int local81 = this.anInt7722 << 8;
		@Pc(87) int local87 = local71.aByteArray27.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt7733 = 0;
		}
		if (this.anInt7730 < 0) {
			if (this.anInt7732 <= 0) {
				this.method6414();
				this.method8379();
				return;
			}
			this.anInt7730 = 0;
		}
		if (this.anInt7730 >= local87) {
			if (this.anInt7732 >= 0) {
				this.method6414();
				this.method8379();
				return;
			}
			this.anInt7730 = local87 - 1;
		}
		this.anInt7730 += this.anInt7732 * arg0;
		if (this.anInt7733 >= 0) {
			if (this.anInt7733 > 0) {
				if (this.aBoolean533) {
					label125: {
						if (this.anInt7732 < 0) {
							if (this.anInt7730 >= local76) {
								return;
							}
							this.anInt7730 = local76 + local76 - this.anInt7730 - 1;
							this.anInt7732 = -this.anInt7732;
							if (--this.anInt7733 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt7730 < local81) {
								return;
							}
							this.anInt7730 = local81 + local81 - this.anInt7730 - 1;
							this.anInt7732 = -this.anInt7732;
							if (--this.anInt7733 == 0) {
								break;
							}
							if (this.anInt7730 >= local76) {
								return;
							}
							this.anInt7730 = local76 + local76 - this.anInt7730 - 1;
							this.anInt7732 = -this.anInt7732;
						} while (--this.anInt7733 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt7732 < 0) {
						if (this.anInt7730 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt7730 - 1) / local91;
						if (local361 < this.anInt7733) {
							this.anInt7730 += local91 * local361;
							this.anInt7733 -= local361;
							return;
						}
						this.anInt7730 += local91 * this.anInt7733;
						this.anInt7733 = 0;
					} else if (this.anInt7730 >= local81) {
						local361 = (this.anInt7730 - local76) / local91;
						if (local361 < this.anInt7733) {
							this.anInt7730 -= local91 * local361;
							this.anInt7733 -= local361;
							return;
						}
						this.anInt7730 -= local91 * this.anInt7733;
						this.anInt7733 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt7732 < 0) {
				if (this.anInt7730 < 0) {
					this.anInt7730 = -1;
					this.method6414();
					this.method8379();
					return;
				}
			} else if (this.anInt7730 >= local87) {
				this.anInt7730 = local87;
				this.method6414();
				this.method8379();
			}
		} else if (this.aBoolean533) {
			if (this.anInt7732 < 0) {
				if (this.anInt7730 >= local76) {
					return;
				}
				this.anInt7730 = local76 + local76 - this.anInt7730 - 1;
				this.anInt7732 = -this.anInt7732;
			}
			while (this.anInt7730 >= local81) {
				this.anInt7730 = local81 + local81 - this.anInt7730 - 1;
				this.anInt7732 = -this.anInt7732;
				if (this.anInt7730 >= local76) {
					return;
				}
				this.anInt7730 = local76 + local76 - this.anInt7730 - 1;
				this.anInt7732 = -this.anInt7732;
			}
		} else if (this.anInt7732 < 0) {
			if (this.anInt7730 < local76) {
				this.anInt7730 = local81 - (local81 - 1 - this.anInt7730) % local91 - 1;
			}
		} else if (this.anInt7730 >= local81) {
			this.anInt7730 = local76 + (this.anInt7730 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "(I)V")
	public synchronized void method6422(@OriginalArg(0) int arg0) {
		this.anInt7733 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "()I")
	public synchronized int method6426() {
		return this.anInt7726 == Integer.MIN_VALUE ? 0 : this.anInt7726;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
	public synchronized void method6427() {
		this.anInt7732 = (this.anInt7732 ^ this.anInt7732 >> 31) + (this.anInt7732 >>> 31);
		this.anInt7732 = -this.anInt7732;
	}

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "()I")
	public synchronized int method6431() {
		return this.anInt7734 < 0 ? -1 : this.anInt7734;
	}

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "()V")
	private void method6432() {
		this.anInt7723 = this.anInt7726;
		this.anInt7724 = Static600.method6419(this.anInt7726, this.anInt7734);
		this.anInt7731 = Static600.method6436(this.anInt7726, this.anInt7734);
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "()I")
	@Override
	public int method6405() {
		return this.anInt7726 == 0 && this.anInt7729 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "()Lclient!mi;")
	@Override
	public Class4_Sub7 method6401() {
		return null;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(II)V")
	public synchronized void method6434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6443(arg0, arg1, this.method6431());
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public Class4_Sub7 method6404() {
		return null;
	}

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "(I)V")
	private synchronized void method6435() {
		this.method6417(0, this.method6431());
	}

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "()Z")
	private boolean method6438() {
		@Pc(2) int local2 = this.anInt7726;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static600.method6419(local2, this.anInt7734);
			local8 = Static600.method6436(local2, this.anInt7734);
		}
		if (this.anInt7723 != local2 || this.anInt7724 != local10 || this.anInt7731 != local8) {
			if (this.anInt7723 < local2) {
				this.anInt7728 = 1;
				this.anInt7729 = local2 - this.anInt7723;
			} else if (this.anInt7723 > local2) {
				this.anInt7728 = -1;
				this.anInt7729 = this.anInt7723 - local2;
			} else {
				this.anInt7728 = 0;
			}
			if (this.anInt7724 < local10) {
				this.anInt7725 = 1;
				if (this.anInt7729 == 0 || this.anInt7729 > local10 - this.anInt7724) {
					this.anInt7729 = local10 - this.anInt7724;
				}
			} else if (this.anInt7724 > local10) {
				this.anInt7725 = -1;
				if (this.anInt7729 == 0 || this.anInt7729 > this.anInt7724 - local10) {
					this.anInt7729 = this.anInt7724 - local10;
				}
			} else {
				this.anInt7725 = 0;
			}
			if (this.anInt7731 < local8) {
				this.anInt7721 = 1;
				if (this.anInt7729 == 0 || this.anInt7729 > local8 - this.anInt7731) {
					this.anInt7729 = local8 - this.anInt7731;
				}
			} else if (this.anInt7731 > local8) {
				this.anInt7721 = -1;
				if (this.anInt7729 == 0 || this.anInt7729 > this.anInt7731 - local8) {
					this.anInt7729 = this.anInt7731 - local8;
				}
			} else {
				this.anInt7721 = 0;
			}
			return false;
		} else if (this.anInt7726 == Integer.MIN_VALUE) {
			this.anInt7726 = 0;
			this.anInt7723 = this.anInt7724 = this.anInt7731 = 0;
			this.method8379();
			return true;
		} else {
			this.method6432();
			return false;
		}
	}

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "()Z")
	public boolean method6439() {
		return this.anInt7730 < 0 || this.anInt7730 >= ((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27.length << 8;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(III)V")
	public synchronized void method6443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method6417(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static600.method6419(arg1, arg2);
		@Pc(14) int local14 = Static600.method6436(arg1, arg2);
		if (this.anInt7724 == local10 && this.anInt7731 == local14) {
			this.anInt7729 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt7723;
		if (this.anInt7723 - arg1 > local31) {
			local31 = this.anInt7723 - arg1;
		}
		if (local10 - this.anInt7724 > local31) {
			local31 = local10 - this.anInt7724;
		}
		if (this.anInt7724 - local10 > local31) {
			local31 = this.anInt7724 - local10;
		}
		if (local14 - this.anInt7731 > local31) {
			local31 = local14 - this.anInt7731;
		}
		if (this.anInt7731 - local14 > local31) {
			local31 = this.anInt7731 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt7729 = arg0;
		this.anInt7726 = arg1;
		this.anInt7734 = arg2;
		this.anInt7728 = (arg1 - this.anInt7723) / arg0;
		this.anInt7725 = (local10 - this.anInt7724) / arg0;
		this.anInt7721 = (local14 - this.anInt7731) / arg0;
	}

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "(I)V")
	public synchronized void method6444(@OriginalArg(0) int arg0) {
		this.method6417(arg0 << 6, this.method6431());
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "([IIIII)I")
	private int method6445(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7729 <= 0) {
				if (this.anInt7732 == 256 && (this.anInt7730 & 0xFF) == 0) {
					if (Static161.aBoolean31) {
						return Static600.method6406(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7724, this.anInt7731, arg3, arg2, this);
					}
					return Static600.method6415(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7723, arg3, arg2, this);
				}
				if (Static161.aBoolean31) {
					return Static600.method6437(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7724, this.anInt7731, arg3, arg2, this, this.anInt7732, arg4);
				}
				return Static600.method6429(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7723, arg3, arg2, this, this.anInt7732, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7729;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7729 += arg1;
			if (this.anInt7732 == 256 && (this.anInt7730 & 0xFF) == 0) {
				if (Static161.aBoolean31) {
					arg1 = Static600.method6433(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7724, this.anInt7731, this.anInt7725, this.anInt7721, local5, arg2, this);
				} else {
					arg1 = Static600.method6423(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7723, this.anInt7728, local5, arg2, this);
				}
			} else if (Static161.aBoolean31) {
				arg1 = Static600.method6424(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7724, this.anInt7731, this.anInt7725, this.anInt7721, local5, arg2, this, this.anInt7732, arg4);
			} else {
				arg1 = Static600.method6440(((Class4_Sub16_Sub1) super.aClass4_Sub16_5).aByteArray27, arg0, this.anInt7730, arg1, this.anInt7723, this.anInt7728, local5, arg2, this, this.anInt7732, arg4);
			}
			this.anInt7729 -= arg1;
			if (this.anInt7729 != 0) {
				return arg1;
			}
		} while (!this.method6438());
		return arg3;
	}
}
