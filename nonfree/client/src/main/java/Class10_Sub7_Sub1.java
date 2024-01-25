import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class10_Sub7_Sub1 extends Class10_Sub7 {

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
	public int anInt675;

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
	public int anInt682;

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
	private final int anInt672;

	@OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
	private final int anInt673;

	@OriginalMember(owner = "client!bs", name = "C", descriptor = "Z")
	private final boolean aBoolean47;

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
	private int anInt674;

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "I")
	private int anInt679;

	@OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
	public int anInt681;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!wq;II)V")
	public Class10_Sub7_Sub1(@OriginalArg(0) Class10_Sub25_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass10_Sub25_5 = arg0;
		this.anInt672 = arg0.anInt7556;
		this.anInt673 = arg0.anInt7557;
		this.aBoolean47 = arg0.aBoolean498;
		this.anInt674 = arg1;
		this.anInt670 = arg2;
		this.anInt679 = 8192;
		this.anInt681 = 0;
		this.method616();
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!wq;III)V")
	public Class10_Sub7_Sub1(@OriginalArg(0) Class10_Sub25_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass10_Sub25_5 = arg0;
		this.anInt672 = arg0.anInt7556;
		this.anInt673 = arg0.anInt7557;
		this.aBoolean47 = arg0.aBoolean498;
		this.anInt674 = arg1;
		this.anInt670 = arg2;
		this.anInt679 = arg3;
		this.anInt681 = 0;
		this.method616();
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "()Lclient!sc;")
	@Override
	public Class10_Sub7 method4816() {
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)V")
	public synchronized void method584(@OriginalArg(0) int arg0) {
		this.method586(arg0 << 6, this.method618());
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "()I")
	@Override
	public int method4814() {
		@Pc(6) int local6 = this.anInt682 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt676 == 0) {
			local6 -= local6 * this.anInt681 / (((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94.length << 8);
		} else if (this.anInt676 >= 0) {
			local6 -= local6 * this.anInt672 / ((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)V")
	private synchronized void method586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt670 = arg0;
		this.anInt679 = arg1;
		this.anInt671 = 0;
		this.method616();
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "()I")
	public synchronized int method588() {
		return this.anInt670 == Integer.MIN_VALUE ? 0 : this.anInt670;
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)V")
	private synchronized void method589() {
		this.method586(0, this.method618());
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([IIIII)I")
	private int method592(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt671 <= 0) {
				if (this.anInt674 == 256 && (this.anInt681 & 0xFF) == 0) {
					if (Static324.aBoolean365) {
						return Static462.method619(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt669, this.anInt678, arg3, arg2, this);
					}
					return Static462.method587(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt682, arg3, arg2, this);
				}
				if (Static324.aBoolean365) {
					return Static462.method603(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt669, this.anInt678, arg3, arg2, this, this.anInt674, arg4);
				}
				return Static462.method602(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt682, arg3, arg2, this, this.anInt674, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt671;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt671 += arg1;
			if (this.anInt674 == 256 && (this.anInt681 & 0xFF) == 0) {
				if (Static324.aBoolean365) {
					arg1 = Static462.method611(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt669, this.anInt678, this.anInt675, this.anInt677, local5, arg2, this);
				} else {
					arg1 = Static462.method617(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt682, this.anInt680, local5, arg2, this);
				}
			} else if (Static324.aBoolean365) {
				arg1 = Static462.method595(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt669, this.anInt678, this.anInt675, this.anInt677, local5, arg2, this, this.anInt674, arg4);
			} else {
				arg1 = Static462.method593(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt682, this.anInt680, local5, arg2, this, this.anInt674, arg4);
			}
			this.anInt671 -= arg1;
			if (this.anInt671 != 0) {
				return arg1;
			}
		} while (!this.method615());
		return arg3;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4817(@OriginalArg(0) int arg0) {
		if (this.anInt671 > 0) {
			if (arg0 >= this.anInt671) {
				if (this.anInt670 == Integer.MIN_VALUE) {
					this.anInt670 = 0;
					this.anInt682 = this.anInt669 = this.anInt678 = 0;
					this.method6033();
					arg0 = this.anInt671;
				}
				this.anInt671 = 0;
				this.method616();
			} else {
				this.anInt682 += this.anInt680 * arg0;
				this.anInt669 += this.anInt675 * arg0;
				this.anInt678 += this.anInt677 * arg0;
				this.anInt671 -= arg0;
			}
		}
		@Pc(71) Class10_Sub25_Sub1 local71 = (Class10_Sub25_Sub1) super.aClass10_Sub25_5;
		@Pc(76) int local76 = this.anInt672 << 8;
		@Pc(81) int local81 = this.anInt673 << 8;
		@Pc(87) int local87 = local71.aByteArray94.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt676 = 0;
		}
		if (this.anInt681 < 0) {
			if (this.anInt674 <= 0) {
				this.method607();
				this.method6033();
				return;
			}
			this.anInt681 = 0;
		}
		if (this.anInt681 >= local87) {
			if (this.anInt674 >= 0) {
				this.method607();
				this.method6033();
				return;
			}
			this.anInt681 = local87 - 1;
		}
		this.anInt681 += this.anInt674 * arg0;
		if (this.anInt676 >= 0) {
			if (this.anInt676 > 0) {
				if (this.aBoolean47) {
					label125: {
						if (this.anInt674 < 0) {
							if (this.anInt681 >= local76) {
								return;
							}
							this.anInt681 = local76 + local76 - this.anInt681 - 1;
							this.anInt674 = -this.anInt674;
							if (--this.anInt676 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt681 < local81) {
								return;
							}
							this.anInt681 = local81 + local81 - this.anInt681 - 1;
							this.anInt674 = -this.anInt674;
							if (--this.anInt676 == 0) {
								break;
							}
							if (this.anInt681 >= local76) {
								return;
							}
							this.anInt681 = local76 + local76 - this.anInt681 - 1;
							this.anInt674 = -this.anInt674;
						} while (--this.anInt676 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt674 < 0) {
						if (this.anInt681 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt681 - 1) / local91;
						if (local361 < this.anInt676) {
							this.anInt681 += local91 * local361;
							this.anInt676 -= local361;
							return;
						}
						this.anInt681 += local91 * this.anInt676;
						this.anInt676 = 0;
					} else if (this.anInt681 >= local81) {
						local361 = (this.anInt681 - local76) / local91;
						if (local361 < this.anInt676) {
							this.anInt681 -= local91 * local361;
							this.anInt676 -= local361;
							return;
						}
						this.anInt681 -= local91 * this.anInt676;
						this.anInt676 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt674 < 0) {
				if (this.anInt681 < 0) {
					this.anInt681 = -1;
					this.method607();
					this.method6033();
					return;
				}
			} else if (this.anInt681 >= local87) {
				this.anInt681 = local87;
				this.method607();
				this.method6033();
			}
		} else if (this.aBoolean47) {
			if (this.anInt674 < 0) {
				if (this.anInt681 >= local76) {
					return;
				}
				this.anInt681 = local76 + local76 - this.anInt681 - 1;
				this.anInt674 = -this.anInt674;
			}
			while (this.anInt681 >= local81) {
				this.anInt681 = local81 + local81 - this.anInt681 - 1;
				this.anInt674 = -this.anInt674;
				if (this.anInt681 >= local76) {
					return;
				}
				this.anInt681 = local76 + local76 - this.anInt681 - 1;
				this.anInt674 = -this.anInt674;
			}
		} else if (this.anInt674 < 0) {
			if (this.anInt681 < local76) {
				this.anInt681 = local81 - (local81 - 1 - this.anInt681) % local91 - 1;
			}
		} else if (this.anInt681 >= local81) {
			this.anInt681 = local76 + (this.anInt681 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "()Z")
	public boolean method594() {
		return this.anInt671 != 0;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)V")
	public synchronized void method597() {
		this.anInt674 = (this.anInt674 ^ this.anInt674 >> 31) + (this.anInt674 >>> 31);
		this.anInt674 = -this.anInt674;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt670 == 0 && this.anInt671 == 0) {
			this.method4817(arg2);
			return;
		}
		@Pc(13) Class10_Sub25_Sub1 local13 = (Class10_Sub25_Sub1) super.aClass10_Sub25_5;
		@Pc(18) int local18 = this.anInt672 << 8;
		@Pc(23) int local23 = this.anInt673 << 8;
		@Pc(29) int local29 = local13.aByteArray94.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt676 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt681 < 0) {
			if (this.anInt674 <= 0) {
				this.method607();
				this.method6033();
				return;
			}
			this.anInt681 = 0;
		}
		if (this.anInt681 >= local29) {
			if (this.anInt674 >= 0) {
				this.method607();
				this.method6033();
				return;
			}
			this.anInt681 = local29 - 1;
		}
		if (this.anInt676 >= 0) {
			if (this.anInt676 > 0) {
				if (this.aBoolean47) {
					label130: {
						if (this.anInt674 < 0) {
							local40 = this.method609(arg0, arg1, local18, local44, local13.aByteArray94[this.anInt672]);
							if (this.anInt681 >= local18) {
								return;
							}
							this.anInt681 = local18 + local18 - this.anInt681 - 1;
							this.anInt674 = -this.anInt674;
							if (--this.anInt676 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method592(arg0, local40, local23, local44, local13.aByteArray94[this.anInt673 - 1]);
							if (this.anInt681 < local23) {
								return;
							}
							this.anInt681 = local23 + local23 - this.anInt681 - 1;
							this.anInt674 = -this.anInt674;
							if (--this.anInt676 == 0) {
								break;
							}
							local40 = this.method609(arg0, local40, local18, local44, local13.aByteArray94[this.anInt672]);
							if (this.anInt681 >= local18) {
								return;
							}
							this.anInt681 = local18 + local18 - this.anInt681 - 1;
							this.anInt674 = -this.anInt674;
						} while (--this.anInt676 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt674 < 0) {
						while (true) {
							local40 = this.method609(arg0, local40, local18, local44, local13.aByteArray94[this.anInt673 - 1]);
							if (this.anInt681 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt681 - 1) / local33;
							if (local416 >= this.anInt676) {
								this.anInt681 += local33 * this.anInt676;
								this.anInt676 = 0;
								break;
							}
							this.anInt681 += local33 * local416;
							this.anInt676 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method592(arg0, local40, local23, local44, local13.aByteArray94[this.anInt672]);
							if (this.anInt681 < local23) {
								return;
							}
							local416 = (this.anInt681 - local18) / local33;
							if (local416 >= this.anInt676) {
								this.anInt681 -= local33 * this.anInt676;
								this.anInt676 = 0;
								break;
							}
							this.anInt681 -= local33 * local416;
							this.anInt676 -= local416;
						}
					}
				}
			}
			if (this.anInt674 < 0) {
				this.method609(arg0, local40, 0, local44, 0);
				if (this.anInt681 < 0) {
					this.anInt681 = -1;
					this.method607();
					this.method6033();
					return;
				}
			} else {
				this.method592(arg0, local40, local29, local44, 0);
				if (this.anInt681 >= local29) {
					this.anInt681 = local29;
					this.method607();
					this.method6033();
				}
			}
		} else if (this.aBoolean47) {
			if (this.anInt674 < 0) {
				local40 = this.method609(arg0, arg1, local18, local44, local13.aByteArray94[this.anInt672]);
				if (this.anInt681 >= local18) {
					return;
				}
				this.anInt681 = local18 + local18 - this.anInt681 - 1;
				this.anInt674 = -this.anInt674;
			}
			while (true) {
				local40 = this.method592(arg0, local40, local23, local44, local13.aByteArray94[this.anInt673 - 1]);
				if (this.anInt681 < local23) {
					return;
				}
				this.anInt681 = local23 + local23 - this.anInt681 - 1;
				this.anInt674 = -this.anInt674;
				local40 = this.method609(arg0, local40, local18, local44, local13.aByteArray94[this.anInt672]);
				if (this.anInt681 >= local18) {
					return;
				}
				this.anInt681 = local18 + local18 - this.anInt681 - 1;
				this.anInt674 = -this.anInt674;
			}
		} else if (this.anInt674 < 0) {
			while (true) {
				local40 = this.method609(arg0, local40, local18, local44, local13.aByteArray94[this.anInt673 - 1]);
				if (this.anInt681 >= local18) {
					return;
				}
				this.anInt681 = local23 - (local23 - 1 - this.anInt681) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method592(arg0, local40, local23, local44, local13.aByteArray94[this.anInt672]);
				if (this.anInt681 < local23) {
					return;
				}
				this.anInt681 = local18 + (this.anInt681 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "()I")
	public synchronized int method598() {
		return this.anInt674 < 0 ? -this.anInt674 : this.anInt674;
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
	public synchronized void method600(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt681 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(II)V")
	public synchronized void method605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method620(arg0, arg1, this.method618());
	}

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "()V")
	private void method607() {
		if (this.anInt671 == 0) {
			return;
		}
		if (this.anInt670 == Integer.MIN_VALUE) {
			this.anInt670 = 0;
		}
		this.anInt671 = 0;
		this.method616();
	}

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "()Z")
	public boolean method608() {
		return this.anInt681 < 0 || this.anInt681 >= ((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94.length << 8;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "([IIIII)I")
	private int method609(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt671 <= 0) {
				if (this.anInt674 == -256 && (this.anInt681 & 0xFF) == 0) {
					if (Static324.aBoolean365) {
						return Static462.method599(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt669, this.anInt678, arg3, arg2, this);
					}
					return Static462.method596(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt682, arg3, arg2, this);
				}
				if (Static324.aBoolean365) {
					return Static462.method610(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt669, this.anInt678, arg3, arg2, this, this.anInt674, arg4);
				}
				return Static462.method590(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt682, arg3, arg2, this, this.anInt674, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt671;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt671 += arg1;
			if (this.anInt674 == -256 && (this.anInt681 & 0xFF) == 0) {
				if (Static324.aBoolean365) {
					arg1 = Static462.method606(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt669, this.anInt678, this.anInt675, this.anInt677, local5, arg2, this);
				} else {
					arg1 = Static462.method613(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt682, this.anInt680, local5, arg2, this);
				}
			} else if (Static324.aBoolean365) {
				arg1 = Static462.method601(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt669, this.anInt678, this.anInt675, this.anInt677, local5, arg2, this, this.anInt674, arg4);
			} else {
				arg1 = Static462.method585(((Class10_Sub25_Sub1) super.aClass10_Sub25_5).aByteArray94, arg0, this.anInt681, arg1, this.anInt682, this.anInt680, local5, arg2, this, this.anInt674, arg4);
			}
			this.anInt671 -= arg1;
			if (this.anInt671 != 0) {
				return arg1;
			}
		} while (!this.method615());
		return arg3;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "()Lclient!sc;")
	@Override
	public Class10_Sub7 method4818() {
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
	public synchronized void method612(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method589();
			this.method6033();
		} else if (this.anInt669 == 0 && this.anInt678 == 0) {
			this.anInt671 = 0;
			this.anInt670 = 0;
			this.anInt682 = 0;
			this.method6033();
		} else {
			@Pc(31) int local31 = -this.anInt682;
			if (this.anInt682 > local31) {
				local31 = this.anInt682;
			}
			if (-this.anInt669 > local31) {
				local31 = -this.anInt669;
			}
			if (this.anInt669 > local31) {
				local31 = this.anInt669;
			}
			if (-this.anInt678 > local31) {
				local31 = -this.anInt678;
			}
			if (this.anInt678 > local31) {
				local31 = this.anInt678;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt671 = arg0;
			this.anInt670 = Integer.MIN_VALUE;
			this.anInt680 = -this.anInt682 / arg0;
			this.anInt675 = -this.anInt669 / arg0;
			this.anInt677 = -this.anInt678 / arg0;
		}
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "()I")
	@Override
	public int method4819() {
		return this.anInt670 == 0 && this.anInt671 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "(I)V")
	public synchronized void method614(@OriginalArg(0) int arg0) {
		if (this.anInt674 < 0) {
			this.anInt674 = -arg0;
		} else {
			this.anInt674 = arg0;
		}
	}

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "()Z")
	private boolean method615() {
		@Pc(2) int local2 = this.anInt670;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static462.method622(local2, this.anInt679);
			local8 = Static462.method621(local2, this.anInt679);
		}
		if (this.anInt682 != local2 || this.anInt669 != local10 || this.anInt678 != local8) {
			if (this.anInt682 < local2) {
				this.anInt680 = 1;
				this.anInt671 = local2 - this.anInt682;
			} else if (this.anInt682 > local2) {
				this.anInt680 = -1;
				this.anInt671 = this.anInt682 - local2;
			} else {
				this.anInt680 = 0;
			}
			if (this.anInt669 < local10) {
				this.anInt675 = 1;
				if (this.anInt671 == 0 || this.anInt671 > local10 - this.anInt669) {
					this.anInt671 = local10 - this.anInt669;
				}
			} else if (this.anInt669 > local10) {
				this.anInt675 = -1;
				if (this.anInt671 == 0 || this.anInt671 > this.anInt669 - local10) {
					this.anInt671 = this.anInt669 - local10;
				}
			} else {
				this.anInt675 = 0;
			}
			if (this.anInt678 < local8) {
				this.anInt677 = 1;
				if (this.anInt671 == 0 || this.anInt671 > local8 - this.anInt678) {
					this.anInt671 = local8 - this.anInt678;
				}
			} else if (this.anInt678 > local8) {
				this.anInt677 = -1;
				if (this.anInt671 == 0 || this.anInt671 > this.anInt678 - local8) {
					this.anInt671 = this.anInt678 - local8;
				}
			} else {
				this.anInt677 = 0;
			}
			return false;
		} else if (this.anInt670 == Integer.MIN_VALUE) {
			this.anInt670 = 0;
			this.anInt682 = this.anInt669 = this.anInt678 = 0;
			this.method6033();
			return true;
		} else {
			this.method616();
			return false;
		}
	}

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "()V")
	private void method616() {
		this.anInt682 = this.anInt670;
		this.anInt669 = Static462.method622(this.anInt670, this.anInt679);
		this.anInt678 = Static462.method621(this.anInt670, this.anInt679);
	}

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "()I")
	public synchronized int method618() {
		return this.anInt679 < 0 ? -1 : this.anInt679;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)V")
	public synchronized void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method586(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static462.method622(arg1, arg2);
		@Pc(14) int local14 = Static462.method621(arg1, arg2);
		if (this.anInt669 == local10 && this.anInt678 == local14) {
			this.anInt671 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt682;
		if (this.anInt682 - arg1 > local31) {
			local31 = this.anInt682 - arg1;
		}
		if (local10 - this.anInt669 > local31) {
			local31 = local10 - this.anInt669;
		}
		if (this.anInt669 - local10 > local31) {
			local31 = this.anInt669 - local10;
		}
		if (local14 - this.anInt678 > local31) {
			local31 = local14 - this.anInt678;
		}
		if (this.anInt678 - local14 > local31) {
			local31 = this.anInt678 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt671 = arg0;
		this.anInt670 = arg1;
		this.anInt679 = arg2;
		this.anInt680 = (arg1 - this.anInt682) / arg0;
		this.anInt675 = (local10 - this.anInt669) / arg0;
		this.anInt677 = (local14 - this.anInt678) / arg0;
	}

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "(I)V")
	public synchronized void method623(@OriginalArg(0) int arg0) {
		this.anInt676 = arg0;
	}
}
