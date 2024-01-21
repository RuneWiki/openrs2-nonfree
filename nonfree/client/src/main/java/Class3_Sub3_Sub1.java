import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	private int anInt430;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
	public int anInt432;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
	private int anInt433;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
	public int anInt435;

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
	public int anInt437;

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
	public int anInt438;

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	private final int anInt429;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
	private final int anInt434;

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "Z")
	private final boolean aBoolean25;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	private int anInt431;

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public int anInt428;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!le;II)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) Class3_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub13_5 = arg0;
		this.anInt429 = arg0.anInt2595;
		this.anInt434 = arg0.anInt2596;
		this.aBoolean25 = arg0.aBoolean130;
		this.anInt431 = arg1;
		this.anInt439 = arg2;
		this.anInt436 = 8192;
		this.anInt428 = 0;
		this.method449();
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!le;III)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) Class3_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub13_5 = arg0;
		this.anInt429 = arg0.anInt2595;
		this.anInt434 = arg0.anInt2596;
		this.aBoolean25 = arg0.aBoolean130;
		this.anInt431 = arg1;
		this.anInt439 = arg2;
		this.anInt436 = arg3;
		this.anInt428 = 0;
		this.method449();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()I")
	@Override
	public int method2841() {
		return this.anInt439 == 0 && this.anInt433 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()Lclient!ch;")
	@Override
	public Class3_Sub3 method2843() {
		return null;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)V")
	public synchronized void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method436(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static183.method459(arg1, arg2);
		@Pc(14) int local14 = Static183.method466(arg1, arg2);
		if (this.anInt435 == local10 && this.anInt441 == local14) {
			this.anInt433 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt432;
		if (this.anInt432 - arg1 > local31) {
			local31 = this.anInt432 - arg1;
		}
		if (local10 - this.anInt435 > local31) {
			local31 = local10 - this.anInt435;
		}
		if (this.anInt435 - local10 > local31) {
			local31 = this.anInt435 - local10;
		}
		if (local14 - this.anInt441 > local31) {
			local31 = local14 - this.anInt441;
		}
		if (this.anInt441 - local14 > local31) {
			local31 = this.anInt441 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt433 = arg0;
		this.anInt439 = arg1;
		this.anInt436 = arg2;
		this.anInt440 = (arg1 - this.anInt432) / arg0;
		this.anInt438 = (local10 - this.anInt435) / arg0;
		this.anInt437 = (local14 - this.anInt441) / arg0;
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
	public synchronized void method435(@OriginalArg(0) int arg0) {
		this.method436(arg0 << 6, this.method461());
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	private synchronized void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt439 = arg0;
		this.anInt436 = arg1;
		this.anInt433 = 0;
		this.method449();
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "()I")
	public synchronized int method439() {
		return this.anInt439 == Integer.MIN_VALUE ? 0 : this.anInt439;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2839(@OriginalArg(0) int arg0) {
		if (this.anInt433 > 0) {
			if (arg0 >= this.anInt433) {
				if (this.anInt439 == Integer.MIN_VALUE) {
					this.anInt439 = 0;
					this.anInt432 = this.anInt435 = this.anInt441 = 0;
					this.method3167();
					arg0 = this.anInt433;
				}
				this.anInt433 = 0;
				this.method449();
			} else {
				this.anInt432 += this.anInt440 * arg0;
				this.anInt435 += this.anInt438 * arg0;
				this.anInt441 += this.anInt437 * arg0;
				this.anInt433 -= arg0;
			}
		}
		@Pc(71) Class3_Sub13_Sub1 local71 = (Class3_Sub13_Sub1) super.aClass3_Sub13_5;
		@Pc(76) int local76 = this.anInt429 << 8;
		@Pc(81) int local81 = this.anInt434 << 8;
		@Pc(87) int local87 = local71.aByteArray32.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt430 = 0;
		}
		if (this.anInt428 < 0) {
			if (this.anInt431 <= 0) {
				this.method457();
				this.method3167();
				return;
			}
			this.anInt428 = 0;
		}
		if (this.anInt428 >= local87) {
			if (this.anInt431 >= 0) {
				this.method457();
				this.method3167();
				return;
			}
			this.anInt428 = local87 - 1;
		}
		this.anInt428 += this.anInt431 * arg0;
		if (this.anInt430 >= 0) {
			if (this.anInt430 > 0) {
				if (this.aBoolean25) {
					label125: {
						if (this.anInt431 < 0) {
							if (this.anInt428 >= local76) {
								return;
							}
							this.anInt428 = local76 + local76 - this.anInt428 - 1;
							this.anInt431 = -this.anInt431;
							if (--this.anInt430 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt428 < local81) {
								return;
							}
							this.anInt428 = local81 + local81 - this.anInt428 - 1;
							this.anInt431 = -this.anInt431;
							if (--this.anInt430 == 0) {
								break;
							}
							if (this.anInt428 >= local76) {
								return;
							}
							this.anInt428 = local76 + local76 - this.anInt428 - 1;
							this.anInt431 = -this.anInt431;
						} while (--this.anInt430 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt431 < 0) {
						if (this.anInt428 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt428 - 1) / local91;
						if (local361 < this.anInt430) {
							this.anInt428 += local91 * local361;
							this.anInt430 -= local361;
							return;
						}
						this.anInt428 += local91 * this.anInt430;
						this.anInt430 = 0;
					} else if (this.anInt428 >= local81) {
						local361 = (this.anInt428 - local76) / local91;
						if (local361 < this.anInt430) {
							this.anInt428 -= local91 * local361;
							this.anInt430 -= local361;
							return;
						}
						this.anInt428 -= local91 * this.anInt430;
						this.anInt430 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt431 < 0) {
				if (this.anInt428 < 0) {
					this.anInt428 = -1;
					this.method457();
					this.method3167();
					return;
				}
			} else if (this.anInt428 >= local87) {
				this.anInt428 = local87;
				this.method457();
				this.method3167();
			}
		} else if (this.aBoolean25) {
			if (this.anInt431 < 0) {
				if (this.anInt428 >= local76) {
					return;
				}
				this.anInt428 = local76 + local76 - this.anInt428 - 1;
				this.anInt431 = -this.anInt431;
			}
			while (this.anInt428 >= local81) {
				this.anInt428 = local81 + local81 - this.anInt428 - 1;
				this.anInt431 = -this.anInt431;
				if (this.anInt428 >= local76) {
					return;
				}
				this.anInt428 = local76 + local76 - this.anInt428 - 1;
				this.anInt431 = -this.anInt431;
			}
		} else if (this.anInt431 < 0) {
			if (this.anInt428 < local76) {
				this.anInt428 = local81 - (local81 - 1 - this.anInt428) % local91 - 1;
			}
		} else if (this.anInt428 >= local81) {
			this.anInt428 = local76 + (this.anInt428 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "()I")
	public synchronized int method440() {
		return this.anInt431 < 0 ? -this.anInt431 : this.anInt431;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([IIIII)I")
	private int method441(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt433 <= 0) {
				if (this.anInt431 == -256 && (this.anInt428 & 0xFF) == 0) {
					if (Static31.aBoolean51) {
						return Static183.method453(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt435, this.anInt441, arg3, arg2, this);
					}
					return Static183.method445(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt432, arg3, arg2, this);
				}
				if (Static31.aBoolean51) {
					return Static183.method456(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt435, this.anInt441, arg3, arg2, this, this.anInt431, arg4);
				}
				return Static183.method462(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt432, arg3, arg2, this, this.anInt431, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt433;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt433 += arg1;
			if (this.anInt431 == -256 && (this.anInt428 & 0xFF) == 0) {
				if (Static31.aBoolean51) {
					arg1 = Static183.method454(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt435, this.anInt441, this.anInt438, this.anInt437, local5, arg2, this);
				} else {
					arg1 = Static183.method438(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt432, this.anInt440, local5, arg2, this);
				}
			} else if (Static31.aBoolean51) {
				arg1 = Static183.method470(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt435, this.anInt441, this.anInt438, this.anInt437, local5, arg2, this, this.anInt431, arg4);
			} else {
				arg1 = Static183.method442(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt432, this.anInt440, local5, arg2, this, this.anInt431, arg4);
			}
			this.anInt433 -= arg1;
			if (this.anInt433 != 0) {
				return arg1;
			}
		} while (!this.method464());
		return arg3;
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "()Z")
	public boolean method443() {
		return this.anInt428 < 0 || this.anInt428 >= ((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32.length << 8;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
	public synchronized void method447(@OriginalArg(0) int arg0) {
		if (this.anInt431 < 0) {
			this.anInt431 = -arg0;
		} else {
			this.anInt431 = arg0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "()V")
	private void method449() {
		this.anInt432 = this.anInt439;
		this.anInt435 = Static183.method459(this.anInt439, this.anInt436);
		this.anInt441 = Static183.method466(this.anInt439, this.anInt436);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V")
	public synchronized void method450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method433(arg0, arg1, this.method461());
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2838(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt439 == 0 && this.anInt433 == 0) {
			this.method2839(arg2);
			return;
		}
		@Pc(13) Class3_Sub13_Sub1 local13 = (Class3_Sub13_Sub1) super.aClass3_Sub13_5;
		@Pc(18) int local18 = this.anInt429 << 8;
		@Pc(23) int local23 = this.anInt434 << 8;
		@Pc(29) int local29 = local13.aByteArray32.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt430 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt428 < 0) {
			if (this.anInt431 <= 0) {
				this.method457();
				this.method3167();
				return;
			}
			this.anInt428 = 0;
		}
		if (this.anInt428 >= local29) {
			if (this.anInt431 >= 0) {
				this.method457();
				this.method3167();
				return;
			}
			this.anInt428 = local29 - 1;
		}
		if (this.anInt430 >= 0) {
			if (this.anInt430 > 0) {
				if (this.aBoolean25) {
					label130: {
						if (this.anInt431 < 0) {
							local40 = this.method441(arg0, arg1, local18, local44, local13.aByteArray32[this.anInt429]);
							if (this.anInt428 >= local18) {
								return;
							}
							this.anInt428 = local18 + local18 - this.anInt428 - 1;
							this.anInt431 = -this.anInt431;
							if (--this.anInt430 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method455(arg0, local40, local23, local44, local13.aByteArray32[this.anInt434 - 1]);
							if (this.anInt428 < local23) {
								return;
							}
							this.anInt428 = local23 + local23 - this.anInt428 - 1;
							this.anInt431 = -this.anInt431;
							if (--this.anInt430 == 0) {
								break;
							}
							local40 = this.method441(arg0, local40, local18, local44, local13.aByteArray32[this.anInt429]);
							if (this.anInt428 >= local18) {
								return;
							}
							this.anInt428 = local18 + local18 - this.anInt428 - 1;
							this.anInt431 = -this.anInt431;
						} while (--this.anInt430 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt431 < 0) {
						while (true) {
							local40 = this.method441(arg0, local40, local18, local44, local13.aByteArray32[this.anInt434 - 1]);
							if (this.anInt428 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt428 - 1) / local33;
							if (local416 >= this.anInt430) {
								this.anInt428 += local33 * this.anInt430;
								this.anInt430 = 0;
								break;
							}
							this.anInt428 += local33 * local416;
							this.anInt430 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method455(arg0, local40, local23, local44, local13.aByteArray32[this.anInt429]);
							if (this.anInt428 < local23) {
								return;
							}
							local416 = (this.anInt428 - local18) / local33;
							if (local416 >= this.anInt430) {
								this.anInt428 -= local33 * this.anInt430;
								this.anInt430 = 0;
								break;
							}
							this.anInt428 -= local33 * local416;
							this.anInt430 -= local416;
						}
					}
				}
			}
			if (this.anInt431 < 0) {
				this.method441(arg0, local40, 0, local44, 0);
				if (this.anInt428 < 0) {
					this.anInt428 = -1;
					this.method457();
					this.method3167();
					return;
				}
			} else {
				this.method455(arg0, local40, local29, local44, 0);
				if (this.anInt428 >= local29) {
					this.anInt428 = local29;
					this.method457();
					this.method3167();
				}
			}
		} else if (this.aBoolean25) {
			if (this.anInt431 < 0) {
				local40 = this.method441(arg0, arg1, local18, local44, local13.aByteArray32[this.anInt429]);
				if (this.anInt428 >= local18) {
					return;
				}
				this.anInt428 = local18 + local18 - this.anInt428 - 1;
				this.anInt431 = -this.anInt431;
			}
			while (true) {
				local40 = this.method455(arg0, local40, local23, local44, local13.aByteArray32[this.anInt434 - 1]);
				if (this.anInt428 < local23) {
					return;
				}
				this.anInt428 = local23 + local23 - this.anInt428 - 1;
				this.anInt431 = -this.anInt431;
				local40 = this.method441(arg0, local40, local18, local44, local13.aByteArray32[this.anInt429]);
				if (this.anInt428 >= local18) {
					return;
				}
				this.anInt428 = local18 + local18 - this.anInt428 - 1;
				this.anInt431 = -this.anInt431;
			}
		} else if (this.anInt431 < 0) {
			while (true) {
				local40 = this.method441(arg0, local40, local18, local44, local13.aByteArray32[this.anInt434 - 1]);
				if (this.anInt428 >= local18) {
					return;
				}
				this.anInt428 = local23 - (local23 - 1 - this.anInt428) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method455(arg0, local40, local23, local44, local13.aByteArray32[this.anInt429]);
				if (this.anInt428 < local23) {
					return;
				}
				this.anInt428 = local18 + (this.anInt428 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "()Lclient!ch;")
	@Override
	public Class3_Sub3 method2844() {
		return null;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "([IIIII)I")
	private int method455(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt433 <= 0) {
				if (this.anInt431 == 256 && (this.anInt428 & 0xFF) == 0) {
					if (Static31.aBoolean51) {
						return Static183.method469(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt435, this.anInt441, arg3, arg2, this);
					}
					return Static183.method437(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt432, arg3, arg2, this);
				}
				if (Static31.aBoolean51) {
					return Static183.method446(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt435, this.anInt441, arg3, arg2, this, this.anInt431, arg4);
				}
				return Static183.method452(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt432, arg3, arg2, this, this.anInt431, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt433;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt433 += arg1;
			if (this.anInt431 == 256 && (this.anInt428 & 0xFF) == 0) {
				if (Static31.aBoolean51) {
					arg1 = Static183.method471(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt435, this.anInt441, this.anInt438, this.anInt437, local5, arg2, this);
				} else {
					arg1 = Static183.method444(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt432, this.anInt440, local5, arg2, this);
				}
			} else if (Static31.aBoolean51) {
				arg1 = Static183.method448(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt435, this.anInt441, this.anInt438, this.anInt437, local5, arg2, this, this.anInt431, arg4);
			} else {
				arg1 = Static183.method458(((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32, arg0, this.anInt428, arg1, this.anInt432, this.anInt440, local5, arg2, this, this.anInt431, arg4);
			}
			this.anInt433 -= arg1;
			if (this.anInt433 != 0) {
				return arg1;
			}
		} while (!this.method464());
		return arg3;
	}

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "()V")
	private void method457() {
		if (this.anInt433 == 0) {
			return;
		}
		if (this.anInt439 == Integer.MIN_VALUE) {
			this.anInt439 = 0;
		}
		this.anInt433 = 0;
		this.method449();
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
	public synchronized void method460(@OriginalArg(0) int arg0) {
		this.anInt430 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "()I")
	public synchronized int method461() {
		return this.anInt436 < 0 ? -1 : this.anInt436;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
	public synchronized void method463() {
		this.anInt431 = (this.anInt431 ^ this.anInt431 >> 31) + (this.anInt431 >>> 31);
		this.anInt431 = -this.anInt431;
	}

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "()Z")
	private boolean method464() {
		@Pc(2) int local2 = this.anInt439;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static183.method459(local2, this.anInt436);
			local8 = Static183.method466(local2, this.anInt436);
		}
		if (this.anInt432 != local2 || this.anInt435 != local10 || this.anInt441 != local8) {
			if (this.anInt432 < local2) {
				this.anInt440 = 1;
				this.anInt433 = local2 - this.anInt432;
			} else if (this.anInt432 > local2) {
				this.anInt440 = -1;
				this.anInt433 = this.anInt432 - local2;
			} else {
				this.anInt440 = 0;
			}
			if (this.anInt435 < local10) {
				this.anInt438 = 1;
				if (this.anInt433 == 0 || this.anInt433 > local10 - this.anInt435) {
					this.anInt433 = local10 - this.anInt435;
				}
			} else if (this.anInt435 > local10) {
				this.anInt438 = -1;
				if (this.anInt433 == 0 || this.anInt433 > this.anInt435 - local10) {
					this.anInt433 = this.anInt435 - local10;
				}
			} else {
				this.anInt438 = 0;
			}
			if (this.anInt441 < local8) {
				this.anInt437 = 1;
				if (this.anInt433 == 0 || this.anInt433 > local8 - this.anInt441) {
					this.anInt433 = local8 - this.anInt441;
				}
			} else if (this.anInt441 > local8) {
				this.anInt437 = -1;
				if (this.anInt433 == 0 || this.anInt433 > this.anInt441 - local8) {
					this.anInt433 = this.anInt441 - local8;
				}
			} else {
				this.anInt437 = 0;
			}
			return false;
		} else if (this.anInt439 == Integer.MIN_VALUE) {
			this.anInt439 = 0;
			this.anInt432 = this.anInt435 = this.anInt441 = 0;
			this.method3167();
			return true;
		} else {
			this.method449();
			return false;
		}
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
	public synchronized void method465(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method472();
			this.method3167();
		} else if (this.anInt435 == 0 && this.anInt441 == 0) {
			this.anInt433 = 0;
			this.anInt439 = 0;
			this.anInt432 = 0;
			this.method3167();
		} else {
			@Pc(31) int local31 = -this.anInt432;
			if (this.anInt432 > local31) {
				local31 = this.anInt432;
			}
			if (-this.anInt435 > local31) {
				local31 = -this.anInt435;
			}
			if (this.anInt435 > local31) {
				local31 = this.anInt435;
			}
			if (-this.anInt441 > local31) {
				local31 = -this.anInt441;
			}
			if (this.anInt441 > local31) {
				local31 = this.anInt441;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt433 = arg0;
			this.anInt439 = Integer.MIN_VALUE;
			this.anInt440 = -this.anInt432 / arg0;
			this.anInt438 = -this.anInt435 / arg0;
			this.anInt437 = -this.anInt441 / arg0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "()Z")
	public boolean method467() {
		return this.anInt433 != 0;
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)V")
	public synchronized void method468(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt428 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
	@Override
	public int method2842() {
		@Pc(6) int local6 = this.anInt432 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt430 == 0) {
			local6 -= local6 * this.anInt428 / (((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32.length << 8);
		} else if (this.anInt430 >= 0) {
			local6 -= local6 * this.anInt429 / ((Class3_Sub13_Sub1) super.aClass3_Sub13_5).aByteArray32.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "(I)V")
	private synchronized void method472() {
		this.method436(0, this.method461());
	}
}
