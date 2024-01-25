import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
	public int anInt474;

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
	public int anInt477;

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
	public int anInt480;

	@OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
	public int anInt484;

	@OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
	private int anInt485;

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
	private final int anInt478;

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
	private final int anInt483;

	@OriginalMember(owner = "client!ar", name = "G", descriptor = "Z")
	private final boolean aBoolean23;

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
	private int anInt481;

	@OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
	private int anInt487;

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
	public int anInt486;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!hh;II)V")
	public Class6_Sub4_Sub1(@OriginalArg(0) Class6_Sub17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass6_Sub17_5 = arg0;
		this.anInt478 = arg0.anInt3088;
		this.anInt483 = arg0.anInt3087;
		this.aBoolean23 = arg0.aBoolean195;
		this.anInt481 = arg1;
		this.anInt487 = arg2;
		this.anInt479 = 8192;
		this.anInt486 = 0;
		this.method428();
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!hh;III)V")
	public Class6_Sub4_Sub1(@OriginalArg(0) Class6_Sub17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub17_5 = arg0;
		this.anInt478 = arg0.anInt3088;
		this.anInt483 = arg0.anInt3087;
		this.aBoolean23 = arg0.aBoolean195;
		this.anInt481 = arg1;
		this.anInt487 = arg2;
		this.anInt479 = arg3;
		this.anInt486 = 0;
		this.method428();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5899(@OriginalArg(0) int arg0) {
		if (this.anInt475 > 0) {
			if (arg0 >= this.anInt475) {
				if (this.anInt487 == Integer.MIN_VALUE) {
					this.anInt487 = 0;
					this.anInt474 = this.anInt476 = this.anInt482 = 0;
					this.method6525();
					arg0 = this.anInt475;
				}
				this.anInt475 = 0;
				this.method428();
			} else {
				this.anInt474 += this.anInt477 * arg0;
				this.anInt476 += this.anInt484 * arg0;
				this.anInt482 += this.anInt480 * arg0;
				this.anInt475 -= arg0;
			}
		}
		@Pc(71) Class6_Sub17_Sub1 local71 = (Class6_Sub17_Sub1) super.aClass6_Sub17_5;
		@Pc(76) int local76 = this.anInt478 << 8;
		@Pc(81) int local81 = this.anInt483 << 8;
		@Pc(87) int local87 = local71.aByteArray38.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt485 = 0;
		}
		if (this.anInt486 < 0) {
			if (this.anInt481 <= 0) {
				this.method429();
				this.method6525();
				return;
			}
			this.anInt486 = 0;
		}
		if (this.anInt486 >= local87) {
			if (this.anInt481 >= 0) {
				this.method429();
				this.method6525();
				return;
			}
			this.anInt486 = local87 - 1;
		}
		this.anInt486 += this.anInt481 * arg0;
		if (this.anInt485 >= 0) {
			if (this.anInt485 > 0) {
				if (this.aBoolean23) {
					label125: {
						if (this.anInt481 < 0) {
							if (this.anInt486 >= local76) {
								return;
							}
							this.anInt486 = local76 + local76 - this.anInt486 - 1;
							this.anInt481 = -this.anInt481;
							if (--this.anInt485 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt486 < local81) {
								return;
							}
							this.anInt486 = local81 + local81 - this.anInt486 - 1;
							this.anInt481 = -this.anInt481;
							if (--this.anInt485 == 0) {
								break;
							}
							if (this.anInt486 >= local76) {
								return;
							}
							this.anInt486 = local76 + local76 - this.anInt486 - 1;
							this.anInt481 = -this.anInt481;
						} while (--this.anInt485 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt481 < 0) {
						if (this.anInt486 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt486 - 1) / local91;
						if (local361 < this.anInt485) {
							this.anInt486 += local91 * local361;
							this.anInt485 -= local361;
							return;
						}
						this.anInt486 += local91 * this.anInt485;
						this.anInt485 = 0;
					} else if (this.anInt486 >= local81) {
						local361 = (this.anInt486 - local76) / local91;
						if (local361 < this.anInt485) {
							this.anInt486 -= local91 * local361;
							this.anInt485 -= local361;
							return;
						}
						this.anInt486 -= local91 * this.anInt485;
						this.anInt485 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt481 < 0) {
				if (this.anInt486 < 0) {
					this.anInt486 = -1;
					this.method429();
					this.method6525();
					return;
				}
			} else if (this.anInt486 >= local87) {
				this.anInt486 = local87;
				this.method429();
				this.method6525();
			}
		} else if (this.aBoolean23) {
			if (this.anInt481 < 0) {
				if (this.anInt486 >= local76) {
					return;
				}
				this.anInt486 = local76 + local76 - this.anInt486 - 1;
				this.anInt481 = -this.anInt481;
			}
			while (this.anInt486 >= local81) {
				this.anInt486 = local81 + local81 - this.anInt486 - 1;
				this.anInt481 = -this.anInt481;
				if (this.anInt486 >= local76) {
					return;
				}
				this.anInt486 = local76 + local76 - this.anInt486 - 1;
				this.anInt481 = -this.anInt481;
			}
		} else if (this.anInt481 < 0) {
			if (this.anInt486 < local76) {
				this.anInt486 = local81 - (local81 - 1 - this.anInt486) % local91 - 1;
			}
		} else if (this.anInt486 >= local81) {
			this.anInt486 = local76 + (this.anInt486 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "()Lclient!cb;")
	@Override
	public Class6_Sub4 method5901() {
		return null;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "()I")
	@Override
	public int method5902() {
		@Pc(6) int local6 = this.anInt474 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt485 == 0) {
			local6 -= local6 * this.anInt486 / (((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38.length << 8);
		} else if (this.anInt485 >= 0) {
			local6 -= local6 * this.anInt478 / ((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "()V")
	private void method428() {
		this.anInt474 = this.anInt487;
		this.anInt476 = Static452.method450(this.anInt487, this.anInt479);
		this.anInt482 = Static452.method433(this.anInt487, this.anInt479);
	}

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "()V")
	private void method429() {
		if (this.anInt475 == 0) {
			return;
		}
		if (this.anInt487 == Integer.MIN_VALUE) {
			this.anInt487 = 0;
		}
		this.anInt475 = 0;
		this.method428();
	}

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "()Z")
	public boolean method434() {
		return this.anInt486 < 0 || this.anInt486 >= ((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38.length << 8;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V")
	public synchronized void method435(@OriginalArg(0) int arg0) {
		this.anInt485 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([IIIII)I")
	private int method436(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt475 <= 0) {
				if (this.anInt481 == 256 && (this.anInt486 & 0xFF) == 0) {
					if (Static314.aBoolean348) {
						return Static452.method427(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt476, this.anInt482, arg3, arg2, this);
					}
					return Static452.method465(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt474, arg3, arg2, this);
				}
				if (Static314.aBoolean348) {
					return Static452.method447(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt476, this.anInt482, arg3, arg2, this, this.anInt481, arg4);
				}
				return Static452.method444(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt474, arg3, arg2, this, this.anInt481, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt475;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt475 += arg1;
			if (this.anInt481 == 256 && (this.anInt486 & 0xFF) == 0) {
				if (Static314.aBoolean348) {
					arg1 = Static452.method432(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt476, this.anInt482, this.anInt484, this.anInt480, local5, arg2, this);
				} else {
					arg1 = Static452.method438(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt474, this.anInt477, local5, arg2, this);
				}
			} else if (Static314.aBoolean348) {
				arg1 = Static452.method443(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt476, this.anInt482, this.anInt484, this.anInt480, local5, arg2, this, this.anInt481, arg4);
			} else {
				arg1 = Static452.method454(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt474, this.anInt477, local5, arg2, this, this.anInt481, arg4);
			}
			this.anInt475 -= arg1;
			if (this.anInt475 != 0) {
				return arg1;
			}
		} while (!this.method441());
		return arg3;
	}

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "()Z")
	public boolean method439() {
		return this.anInt475 != 0;
	}

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "()I")
	public synchronized int method440() {
		return this.anInt487 == Integer.MIN_VALUE ? 0 : this.anInt487;
	}

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "()Z")
	private boolean method441() {
		@Pc(2) int local2 = this.anInt487;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static452.method450(local2, this.anInt479);
			local8 = Static452.method433(local2, this.anInt479);
		}
		if (this.anInt474 != local2 || this.anInt476 != local10 || this.anInt482 != local8) {
			if (this.anInt474 < local2) {
				this.anInt477 = 1;
				this.anInt475 = local2 - this.anInt474;
			} else if (this.anInt474 > local2) {
				this.anInt477 = -1;
				this.anInt475 = this.anInt474 - local2;
			} else {
				this.anInt477 = 0;
			}
			if (this.anInt476 < local10) {
				this.anInt484 = 1;
				if (this.anInt475 == 0 || this.anInt475 > local10 - this.anInt476) {
					this.anInt475 = local10 - this.anInt476;
				}
			} else if (this.anInt476 > local10) {
				this.anInt484 = -1;
				if (this.anInt475 == 0 || this.anInt475 > this.anInt476 - local10) {
					this.anInt475 = this.anInt476 - local10;
				}
			} else {
				this.anInt484 = 0;
			}
			if (this.anInt482 < local8) {
				this.anInt480 = 1;
				if (this.anInt475 == 0 || this.anInt475 > local8 - this.anInt482) {
					this.anInt475 = local8 - this.anInt482;
				}
			} else if (this.anInt482 > local8) {
				this.anInt480 = -1;
				if (this.anInt475 == 0 || this.anInt475 > this.anInt482 - local8) {
					this.anInt475 = this.anInt482 - local8;
				}
			} else {
				this.anInt480 = 0;
			}
			return false;
		} else if (this.anInt487 == Integer.MIN_VALUE) {
			this.anInt487 = 0;
			this.anInt474 = this.anInt476 = this.anInt482 = 0;
			this.method6525();
			return true;
		} else {
			this.method428();
			return false;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5898(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt487 == 0 && this.anInt475 == 0) {
			this.method5899(arg2);
			return;
		}
		@Pc(13) Class6_Sub17_Sub1 local13 = (Class6_Sub17_Sub1) super.aClass6_Sub17_5;
		@Pc(18) int local18 = this.anInt478 << 8;
		@Pc(23) int local23 = this.anInt483 << 8;
		@Pc(29) int local29 = local13.aByteArray38.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt485 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt486 < 0) {
			if (this.anInt481 <= 0) {
				this.method429();
				this.method6525();
				return;
			}
			this.anInt486 = 0;
		}
		if (this.anInt486 >= local29) {
			if (this.anInt481 >= 0) {
				this.method429();
				this.method6525();
				return;
			}
			this.anInt486 = local29 - 1;
		}
		if (this.anInt485 >= 0) {
			if (this.anInt485 > 0) {
				if (this.aBoolean23) {
					label130: {
						if (this.anInt481 < 0) {
							local40 = this.method451(arg0, arg1, local18, local44, local13.aByteArray38[this.anInt478]);
							if (this.anInt486 >= local18) {
								return;
							}
							this.anInt486 = local18 + local18 - this.anInt486 - 1;
							this.anInt481 = -this.anInt481;
							if (--this.anInt485 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method436(arg0, local40, local23, local44, local13.aByteArray38[this.anInt483 - 1]);
							if (this.anInt486 < local23) {
								return;
							}
							this.anInt486 = local23 + local23 - this.anInt486 - 1;
							this.anInt481 = -this.anInt481;
							if (--this.anInt485 == 0) {
								break;
							}
							local40 = this.method451(arg0, local40, local18, local44, local13.aByteArray38[this.anInt478]);
							if (this.anInt486 >= local18) {
								return;
							}
							this.anInt486 = local18 + local18 - this.anInt486 - 1;
							this.anInt481 = -this.anInt481;
						} while (--this.anInt485 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt481 < 0) {
						while (true) {
							local40 = this.method451(arg0, local40, local18, local44, local13.aByteArray38[this.anInt483 - 1]);
							if (this.anInt486 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt486 - 1) / local33;
							if (local416 >= this.anInt485) {
								this.anInt486 += local33 * this.anInt485;
								this.anInt485 = 0;
								break;
							}
							this.anInt486 += local33 * local416;
							this.anInt485 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method436(arg0, local40, local23, local44, local13.aByteArray38[this.anInt478]);
							if (this.anInt486 < local23) {
								return;
							}
							local416 = (this.anInt486 - local18) / local33;
							if (local416 >= this.anInt485) {
								this.anInt486 -= local33 * this.anInt485;
								this.anInt485 = 0;
								break;
							}
							this.anInt486 -= local33 * local416;
							this.anInt485 -= local416;
						}
					}
				}
			}
			if (this.anInt481 < 0) {
				this.method451(arg0, local40, 0, local44, 0);
				if (this.anInt486 < 0) {
					this.anInt486 = -1;
					this.method429();
					this.method6525();
					return;
				}
			} else {
				this.method436(arg0, local40, local29, local44, 0);
				if (this.anInt486 >= local29) {
					this.anInt486 = local29;
					this.method429();
					this.method6525();
				}
			}
		} else if (this.aBoolean23) {
			if (this.anInt481 < 0) {
				local40 = this.method451(arg0, arg1, local18, local44, local13.aByteArray38[this.anInt478]);
				if (this.anInt486 >= local18) {
					return;
				}
				this.anInt486 = local18 + local18 - this.anInt486 - 1;
				this.anInt481 = -this.anInt481;
			}
			while (true) {
				local40 = this.method436(arg0, local40, local23, local44, local13.aByteArray38[this.anInt483 - 1]);
				if (this.anInt486 < local23) {
					return;
				}
				this.anInt486 = local23 + local23 - this.anInt486 - 1;
				this.anInt481 = -this.anInt481;
				local40 = this.method451(arg0, local40, local18, local44, local13.aByteArray38[this.anInt478]);
				if (this.anInt486 >= local18) {
					return;
				}
				this.anInt486 = local18 + local18 - this.anInt486 - 1;
				this.anInt481 = -this.anInt481;
			}
		} else if (this.anInt481 < 0) {
			while (true) {
				local40 = this.method451(arg0, local40, local18, local44, local13.aByteArray38[this.anInt483 - 1]);
				if (this.anInt486 >= local18) {
					return;
				}
				this.anInt486 = local23 - (local23 - 1 - this.anInt486) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method436(arg0, local40, local23, local44, local13.aByteArray38[this.anInt478]);
				if (this.anInt486 < local23) {
					return;
				}
				this.anInt486 = local18 + (this.anInt486 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)V")
	public synchronized void method442(@OriginalArg(0) int arg0) {
		if (this.anInt481 < 0) {
			this.anInt481 = -arg0;
		} else {
			this.anInt481 = arg0;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)V")
	public synchronized void method445() {
		this.anInt481 = (this.anInt481 ^ this.anInt481 >> 31) + (this.anInt481 >>> 31);
		this.anInt481 = -this.anInt481;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V")
	public synchronized void method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method456(arg0, arg1, this.method458());
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V")
	public synchronized void method449(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt486 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "([IIIII)I")
	private int method451(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt475 <= 0) {
				if (this.anInt481 == -256 && (this.anInt486 & 0xFF) == 0) {
					if (Static314.aBoolean348) {
						return Static452.method461(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt476, this.anInt482, arg3, arg2, this);
					}
					return Static452.method446(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt474, arg3, arg2, this);
				}
				if (Static314.aBoolean348) {
					return Static452.method466(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt476, this.anInt482, arg3, arg2, this, this.anInt481, arg4);
				}
				return Static452.method462(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt474, arg3, arg2, this, this.anInt481, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt475;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt475 += arg1;
			if (this.anInt481 == -256 && (this.anInt486 & 0xFF) == 0) {
				if (Static314.aBoolean348) {
					arg1 = Static452.method457(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt476, this.anInt482, this.anInt484, this.anInt480, local5, arg2, this);
				} else {
					arg1 = Static452.method453(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt474, this.anInt477, local5, arg2, this);
				}
			} else if (Static314.aBoolean348) {
				arg1 = Static452.method437(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt476, this.anInt482, this.anInt484, this.anInt480, local5, arg2, this, this.anInt481, arg4);
			} else {
				arg1 = Static452.method464(((Class6_Sub17_Sub1) super.aClass6_Sub17_5).aByteArray38, arg0, this.anInt486, arg1, this.anInt474, this.anInt477, local5, arg2, this, this.anInt481, arg4);
			}
			this.anInt475 -= arg1;
			if (this.anInt475 != 0) {
				return arg1;
			}
		} while (!this.method441());
		return arg3;
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(II)V")
	private synchronized void method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt487 = arg0;
		this.anInt479 = arg1;
		this.anInt475 = 0;
		this.method428();
	}

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "()I")
	public synchronized int method455() {
		return this.anInt481 < 0 ? -this.anInt481 : this.anInt481;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(III)V")
	public synchronized void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method452(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static452.method450(arg1, arg2);
		@Pc(14) int local14 = Static452.method433(arg1, arg2);
		if (this.anInt476 == local10 && this.anInt482 == local14) {
			this.anInt475 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt474;
		if (this.anInt474 - arg1 > local31) {
			local31 = this.anInt474 - arg1;
		}
		if (local10 - this.anInt476 > local31) {
			local31 = local10 - this.anInt476;
		}
		if (this.anInt476 - local10 > local31) {
			local31 = this.anInt476 - local10;
		}
		if (local14 - this.anInt482 > local31) {
			local31 = local14 - this.anInt482;
		}
		if (this.anInt482 - local14 > local31) {
			local31 = this.anInt482 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt475 = arg0;
		this.anInt487 = arg1;
		this.anInt479 = arg2;
		this.anInt477 = (arg1 - this.anInt474) / arg0;
		this.anInt484 = (local10 - this.anInt476) / arg0;
		this.anInt480 = (local14 - this.anInt482) / arg0;
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "()Lclient!cb;")
	@Override
	public Class6_Sub4 method5904() {
		return null;
	}

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "()I")
	public synchronized int method458() {
		return this.anInt479 < 0 ? -1 : this.anInt479;
	}

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V")
	private synchronized void method459() {
		this.method452(0, this.method458());
	}

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V")
	public synchronized void method460(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method459();
			this.method6525();
		} else if (this.anInt476 == 0 && this.anInt482 == 0) {
			this.anInt475 = 0;
			this.anInt487 = 0;
			this.anInt474 = 0;
			this.method6525();
		} else {
			@Pc(31) int local31 = -this.anInt474;
			if (this.anInt474 > local31) {
				local31 = this.anInt474;
			}
			if (-this.anInt476 > local31) {
				local31 = -this.anInt476;
			}
			if (this.anInt476 > local31) {
				local31 = this.anInt476;
			}
			if (-this.anInt482 > local31) {
				local31 = -this.anInt482;
			}
			if (this.anInt482 > local31) {
				local31 = this.anInt482;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt475 = arg0;
			this.anInt487 = Integer.MIN_VALUE;
			this.anInt477 = -this.anInt474 / arg0;
			this.anInt484 = -this.anInt476 / arg0;
			this.anInt480 = -this.anInt482 / arg0;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "()I")
	@Override
	public int method5900() {
		return this.anInt487 == 0 && this.anInt475 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)V")
	public synchronized void method463(@OriginalArg(0) int arg0) {
		this.method452(arg0 << 6, this.method458());
	}
}
