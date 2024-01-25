import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
	public int anInt80;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
	public int anInt82;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
	private int anInt85;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
	public int anInt86;

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
	public int anInt88;

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
	private int anInt89;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
	public int anInt92;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	private final int anInt84;

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
	private final int anInt91;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "Z")
	private final boolean aBoolean10;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
	private int anInt90;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
	public int anInt87;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!bg;II)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class4_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub7_5 = arg0;
		this.anInt84 = arg0.anInt483;
		this.anInt91 = arg0.anInt481;
		this.aBoolean10 = arg0.aBoolean36;
		this.anInt90 = arg1;
		this.anInt79 = arg2;
		this.anInt83 = 8192;
		this.anInt87 = 0;
		this.method92();
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!bg;III)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class4_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub7_5 = arg0;
		this.anInt84 = arg0.anInt483;
		this.anInt91 = arg0.anInt481;
		this.aBoolean10 = arg0.aBoolean36;
		this.anInt90 = arg1;
		this.anInt79 = arg2;
		this.anInt83 = arg3;
		this.anInt87 = 0;
		this.method92();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public synchronized void method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method101(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static358.method86(arg1, arg2);
		@Pc(14) int local14 = Static358.method115(arg1, arg2);
		if (this.anInt80 == local10 && this.anInt86 == local14) {
			this.anInt89 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt81;
		if (this.anInt81 - arg1 > local31) {
			local31 = this.anInt81 - arg1;
		}
		if (local10 - this.anInt80 > local31) {
			local31 = local10 - this.anInt80;
		}
		if (this.anInt80 - local10 > local31) {
			local31 = this.anInt80 - local10;
		}
		if (local14 - this.anInt86 > local31) {
			local31 = local14 - this.anInt86;
		}
		if (this.anInt86 - local14 > local31) {
			local31 = this.anInt86 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt89 = arg0;
		this.anInt79 = arg1;
		this.anInt83 = arg2;
		this.anInt82 = (arg1 - this.anInt81) / arg0;
		this.anInt92 = (local10 - this.anInt80) / arg0;
		this.anInt88 = (local14 - this.anInt86) / arg0;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "()I")
	@Override
	public int method3786() {
		return this.anInt79 == 0 && this.anInt89 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public synchronized void method77(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method89();
			this.method5687();
		} else if (this.anInt80 == 0 && this.anInt86 == 0) {
			this.anInt89 = 0;
			this.anInt79 = 0;
			this.anInt81 = 0;
			this.method5687();
		} else {
			@Pc(31) int local31 = -this.anInt81;
			if (this.anInt81 > local31) {
				local31 = this.anInt81;
			}
			if (-this.anInt80 > local31) {
				local31 = -this.anInt80;
			}
			if (this.anInt80 > local31) {
				local31 = this.anInt80;
			}
			if (-this.anInt86 > local31) {
				local31 = -this.anInt86;
			}
			if (this.anInt86 > local31) {
				local31 = this.anInt86;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt89 = arg0;
			this.anInt79 = Integer.MIN_VALUE;
			this.anInt82 = -this.anInt81 / arg0;
			this.anInt92 = -this.anInt80 / arg0;
			this.anInt88 = -this.anInt86 / arg0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "()Z")
	public boolean method79() {
		return this.anInt87 < 0 || this.anInt87 >= ((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5.length << 8;
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "()I")
	public synchronized int method88() {
		return this.anInt79 == Integer.MIN_VALUE ? 0 : this.anInt79;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()Lclient!kb;")
	@Override
	public Class4_Sub1 method3784() {
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	private synchronized void method89() {
		this.method101(0, this.method114());
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([IIIII)I")
	private int method90(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt89 <= 0) {
				if (this.anInt90 == 256 && (this.anInt87 & 0xFF) == 0) {
					if (Static314.aBoolean451) {
						return Static358.method111(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt80, this.anInt86, arg3, arg2, this);
					}
					return Static358.method82(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt81, arg3, arg2, this);
				}
				if (Static314.aBoolean451) {
					return Static358.method80(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt80, this.anInt86, arg3, arg2, this, this.anInt90, arg4);
				}
				return Static358.method109(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt81, arg3, arg2, this, this.anInt90, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt89;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt89 += arg1;
			if (this.anInt90 == 256 && (this.anInt87 & 0xFF) == 0) {
				if (Static314.aBoolean451) {
					arg1 = Static358.method93(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt80, this.anInt86, this.anInt92, this.anInt88, local5, arg2, this);
				} else {
					arg1 = Static358.method85(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt81, this.anInt82, local5, arg2, this);
				}
			} else if (Static314.aBoolean451) {
				arg1 = Static358.method81(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt80, this.anInt86, this.anInt92, this.anInt88, local5, arg2, this, this.anInt90, arg4);
			} else {
				arg1 = Static358.method100(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt81, this.anInt82, local5, arg2, this, this.anInt90, arg4);
			}
			this.anInt89 -= arg1;
			if (this.anInt89 != 0) {
				return arg1;
			}
		} while (!this.method99());
		return arg3;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	public synchronized void method91(@OriginalArg(0) int arg0) {
		this.method101(arg0 << 6, this.method114());
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "()V")
	private void method92() {
		this.anInt81 = this.anInt79;
		this.anInt80 = Static358.method86(this.anInt79, this.anInt83);
		this.anInt86 = Static358.method115(this.anInt79, this.anInt83);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "([IIIII)I")
	private int method94(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt89 <= 0) {
				if (this.anInt90 == -256 && (this.anInt87 & 0xFF) == 0) {
					if (Static314.aBoolean451) {
						return Static358.method78(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt80, this.anInt86, arg3, arg2, this);
					}
					return Static358.method84(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt81, arg3, arg2, this);
				}
				if (Static314.aBoolean451) {
					return Static358.method112(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt80, this.anInt86, arg3, arg2, this, this.anInt90, arg4);
				}
				return Static358.method97(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt81, arg3, arg2, this, this.anInt90, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt89;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt89 += arg1;
			if (this.anInt90 == -256 && (this.anInt87 & 0xFF) == 0) {
				if (Static314.aBoolean451) {
					arg1 = Static358.method87(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt80, this.anInt86, this.anInt92, this.anInt88, local5, arg2, this);
				} else {
					arg1 = Static358.method104(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt81, this.anInt82, local5, arg2, this);
				}
			} else if (Static314.aBoolean451) {
				arg1 = Static358.method83(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt80, this.anInt86, this.anInt92, this.anInt88, local5, arg2, this, this.anInt90, arg4);
			} else {
				arg1 = Static358.method102(((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5, arg0, this.anInt87, arg1, this.anInt81, this.anInt82, local5, arg2, this, this.anInt90, arg4);
			}
			this.anInt89 -= arg1;
			if (this.anInt89 != 0) {
				return arg1;
			}
		} while (!this.method99());
		return arg3;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3783(@OriginalArg(0) int arg0) {
		if (this.anInt89 > 0) {
			if (arg0 >= this.anInt89) {
				if (this.anInt79 == Integer.MIN_VALUE) {
					this.anInt79 = 0;
					this.anInt81 = this.anInt80 = this.anInt86 = 0;
					this.method5687();
					arg0 = this.anInt89;
				}
				this.anInt89 = 0;
				this.method92();
			} else {
				this.anInt81 += this.anInt82 * arg0;
				this.anInt80 += this.anInt92 * arg0;
				this.anInt86 += this.anInt88 * arg0;
				this.anInt89 -= arg0;
			}
		}
		@Pc(71) Class4_Sub7_Sub1 local71 = (Class4_Sub7_Sub1) super.aClass4_Sub7_5;
		@Pc(76) int local76 = this.anInt84 << 8;
		@Pc(81) int local81 = this.anInt91 << 8;
		@Pc(87) int local87 = local71.aByteArray5.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt85 = 0;
		}
		if (this.anInt87 < 0) {
			if (this.anInt90 <= 0) {
				this.method95();
				this.method5687();
				return;
			}
			this.anInt87 = 0;
		}
		if (this.anInt87 >= local87) {
			if (this.anInt90 >= 0) {
				this.method95();
				this.method5687();
				return;
			}
			this.anInt87 = local87 - 1;
		}
		this.anInt87 += this.anInt90 * arg0;
		if (this.anInt85 >= 0) {
			if (this.anInt85 > 0) {
				if (this.aBoolean10) {
					label125: {
						if (this.anInt90 < 0) {
							if (this.anInt87 >= local76) {
								return;
							}
							this.anInt87 = local76 + local76 - this.anInt87 - 1;
							this.anInt90 = -this.anInt90;
							if (--this.anInt85 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt87 < local81) {
								return;
							}
							this.anInt87 = local81 + local81 - this.anInt87 - 1;
							this.anInt90 = -this.anInt90;
							if (--this.anInt85 == 0) {
								break;
							}
							if (this.anInt87 >= local76) {
								return;
							}
							this.anInt87 = local76 + local76 - this.anInt87 - 1;
							this.anInt90 = -this.anInt90;
						} while (--this.anInt85 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt90 < 0) {
						if (this.anInt87 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt87 - 1) / local91;
						if (local361 < this.anInt85) {
							this.anInt87 += local91 * local361;
							this.anInt85 -= local361;
							return;
						}
						this.anInt87 += local91 * this.anInt85;
						this.anInt85 = 0;
					} else if (this.anInt87 >= local81) {
						local361 = (this.anInt87 - local76) / local91;
						if (local361 < this.anInt85) {
							this.anInt87 -= local91 * local361;
							this.anInt85 -= local361;
							return;
						}
						this.anInt87 -= local91 * this.anInt85;
						this.anInt85 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt90 < 0) {
				if (this.anInt87 < 0) {
					this.anInt87 = -1;
					this.method95();
					this.method5687();
					return;
				}
			} else if (this.anInt87 >= local87) {
				this.anInt87 = local87;
				this.method95();
				this.method5687();
			}
		} else if (this.aBoolean10) {
			if (this.anInt90 < 0) {
				if (this.anInt87 >= local76) {
					return;
				}
				this.anInt87 = local76 + local76 - this.anInt87 - 1;
				this.anInt90 = -this.anInt90;
			}
			while (this.anInt87 >= local81) {
				this.anInt87 = local81 + local81 - this.anInt87 - 1;
				this.anInt90 = -this.anInt90;
				if (this.anInt87 >= local76) {
					return;
				}
				this.anInt87 = local76 + local76 - this.anInt87 - 1;
				this.anInt90 = -this.anInt90;
			}
		} else if (this.anInt90 < 0) {
			if (this.anInt87 < local76) {
				this.anInt87 = local81 - (local81 - 1 - this.anInt87) % local91 - 1;
			}
		} else if (this.anInt87 >= local81) {
			this.anInt87 = local76 + (this.anInt87 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "()V")
	private void method95() {
		if (this.anInt89 == 0) {
			return;
		}
		if (this.anInt79 == Integer.MIN_VALUE) {
			this.anInt79 = 0;
		}
		this.anInt89 = 0;
		this.method92();
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "()Lclient!kb;")
	@Override
	public Class4_Sub1 method3787() {
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt79 == 0 && this.anInt89 == 0) {
			this.method3783(arg2);
			return;
		}
		@Pc(13) Class4_Sub7_Sub1 local13 = (Class4_Sub7_Sub1) super.aClass4_Sub7_5;
		@Pc(18) int local18 = this.anInt84 << 8;
		@Pc(23) int local23 = this.anInt91 << 8;
		@Pc(29) int local29 = local13.aByteArray5.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt85 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt87 < 0) {
			if (this.anInt90 <= 0) {
				this.method95();
				this.method5687();
				return;
			}
			this.anInt87 = 0;
		}
		if (this.anInt87 >= local29) {
			if (this.anInt90 >= 0) {
				this.method95();
				this.method5687();
				return;
			}
			this.anInt87 = local29 - 1;
		}
		if (this.anInt85 >= 0) {
			if (this.anInt85 > 0) {
				if (this.aBoolean10) {
					label130: {
						if (this.anInt90 < 0) {
							local40 = this.method94(arg0, arg1, local18, local44, local13.aByteArray5[this.anInt84]);
							if (this.anInt87 >= local18) {
								return;
							}
							this.anInt87 = local18 + local18 - this.anInt87 - 1;
							this.anInt90 = -this.anInt90;
							if (--this.anInt85 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method90(arg0, local40, local23, local44, local13.aByteArray5[this.anInt91 - 1]);
							if (this.anInt87 < local23) {
								return;
							}
							this.anInt87 = local23 + local23 - this.anInt87 - 1;
							this.anInt90 = -this.anInt90;
							if (--this.anInt85 == 0) {
								break;
							}
							local40 = this.method94(arg0, local40, local18, local44, local13.aByteArray5[this.anInt84]);
							if (this.anInt87 >= local18) {
								return;
							}
							this.anInt87 = local18 + local18 - this.anInt87 - 1;
							this.anInt90 = -this.anInt90;
						} while (--this.anInt85 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt90 < 0) {
						while (true) {
							local40 = this.method94(arg0, local40, local18, local44, local13.aByteArray5[this.anInt91 - 1]);
							if (this.anInt87 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt87 - 1) / local33;
							if (local416 >= this.anInt85) {
								this.anInt87 += local33 * this.anInt85;
								this.anInt85 = 0;
								break;
							}
							this.anInt87 += local33 * local416;
							this.anInt85 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method90(arg0, local40, local23, local44, local13.aByteArray5[this.anInt84]);
							if (this.anInt87 < local23) {
								return;
							}
							local416 = (this.anInt87 - local18) / local33;
							if (local416 >= this.anInt85) {
								this.anInt87 -= local33 * this.anInt85;
								this.anInt85 = 0;
								break;
							}
							this.anInt87 -= local33 * local416;
							this.anInt85 -= local416;
						}
					}
				}
			}
			if (this.anInt90 < 0) {
				this.method94(arg0, local40, 0, local44, 0);
				if (this.anInt87 < 0) {
					this.anInt87 = -1;
					this.method95();
					this.method5687();
					return;
				}
			} else {
				this.method90(arg0, local40, local29, local44, 0);
				if (this.anInt87 >= local29) {
					this.anInt87 = local29;
					this.method95();
					this.method5687();
				}
			}
		} else if (this.aBoolean10) {
			if (this.anInt90 < 0) {
				local40 = this.method94(arg0, arg1, local18, local44, local13.aByteArray5[this.anInt84]);
				if (this.anInt87 >= local18) {
					return;
				}
				this.anInt87 = local18 + local18 - this.anInt87 - 1;
				this.anInt90 = -this.anInt90;
			}
			while (true) {
				local40 = this.method90(arg0, local40, local23, local44, local13.aByteArray5[this.anInt91 - 1]);
				if (this.anInt87 < local23) {
					return;
				}
				this.anInt87 = local23 + local23 - this.anInt87 - 1;
				this.anInt90 = -this.anInt90;
				local40 = this.method94(arg0, local40, local18, local44, local13.aByteArray5[this.anInt84]);
				if (this.anInt87 >= local18) {
					return;
				}
				this.anInt87 = local18 + local18 - this.anInt87 - 1;
				this.anInt90 = -this.anInt90;
			}
		} else if (this.anInt90 < 0) {
			while (true) {
				local40 = this.method94(arg0, local40, local18, local44, local13.aByteArray5[this.anInt91 - 1]);
				if (this.anInt87 >= local18) {
					return;
				}
				this.anInt87 = local23 - (local23 - 1 - this.anInt87) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method90(arg0, local40, local23, local44, local13.aByteArray5[this.anInt84]);
				if (this.anInt87 < local23) {
					return;
				}
				this.anInt87 = local18 + (this.anInt87 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	public synchronized void method98(@OriginalArg(0) int arg0) {
		if (this.anInt90 < 0) {
			this.anInt90 = -arg0;
		} else {
			this.anInt90 = arg0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "()Z")
	private boolean method99() {
		@Pc(2) int local2 = this.anInt79;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static358.method86(local2, this.anInt83);
			local8 = Static358.method115(local2, this.anInt83);
		}
		if (this.anInt81 != local2 || this.anInt80 != local10 || this.anInt86 != local8) {
			if (this.anInt81 < local2) {
				this.anInt82 = 1;
				this.anInt89 = local2 - this.anInt81;
			} else if (this.anInt81 > local2) {
				this.anInt82 = -1;
				this.anInt89 = this.anInt81 - local2;
			} else {
				this.anInt82 = 0;
			}
			if (this.anInt80 < local10) {
				this.anInt92 = 1;
				if (this.anInt89 == 0 || this.anInt89 > local10 - this.anInt80) {
					this.anInt89 = local10 - this.anInt80;
				}
			} else if (this.anInt80 > local10) {
				this.anInt92 = -1;
				if (this.anInt89 == 0 || this.anInt89 > this.anInt80 - local10) {
					this.anInt89 = this.anInt80 - local10;
				}
			} else {
				this.anInt92 = 0;
			}
			if (this.anInt86 < local8) {
				this.anInt88 = 1;
				if (this.anInt89 == 0 || this.anInt89 > local8 - this.anInt86) {
					this.anInt89 = local8 - this.anInt86;
				}
			} else if (this.anInt86 > local8) {
				this.anInt88 = -1;
				if (this.anInt89 == 0 || this.anInt89 > this.anInt86 - local8) {
					this.anInt89 = this.anInt86 - local8;
				}
			} else {
				this.anInt88 = 0;
			}
			return false;
		} else if (this.anInt79 == Integer.MIN_VALUE) {
			this.anInt79 = 0;
			this.anInt81 = this.anInt80 = this.anInt86 = 0;
			this.method5687();
			return true;
		} else {
			this.method92();
			return false;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V")
	private synchronized void method101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt79 = arg0;
		this.anInt83 = arg1;
		this.anInt89 = 0;
		this.method92();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	public synchronized void method103() {
		this.anInt90 = (this.anInt90 ^ this.anInt90 >> 31) + (this.anInt90 >>> 31);
		this.anInt90 = -this.anInt90;
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	public synchronized void method105(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt87 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "()Z")
	public boolean method106() {
		return this.anInt89 != 0;
	}

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "()I")
	public synchronized int method107() {
		return this.anInt90 < 0 ? -this.anInt90 : this.anInt90;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()I")
	@Override
	public int method3782() {
		@Pc(6) int local6 = this.anInt81 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt85 == 0) {
			local6 -= local6 * this.anInt87 / (((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5.length << 8);
		} else if (this.anInt85 >= 0) {
			local6 -= local6 * this.anInt84 / ((Class4_Sub7_Sub1) super.aClass4_Sub7_5).aByteArray5.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
	public synchronized void method108(@OriginalArg(0) int arg0) {
		this.anInt85 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)V")
	public synchronized void method113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method76(arg0, arg1, this.method114());
	}

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "()I")
	public synchronized int method114() {
		return this.anInt83 < 0 ? -1 : this.anInt83;
	}
}
