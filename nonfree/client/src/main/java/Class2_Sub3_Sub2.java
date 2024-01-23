import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	public int anInt487;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	public int anInt492;

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	public int anInt499;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
	public int anInt500;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
	private int anInt488;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "Z")
	private boolean aBoolean32;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
	private int anInt493;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
	private int anInt489;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
	public int anInt494;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!lb;II)V")
	public Class2_Sub3_Sub2(@OriginalArg(0) Class2_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub19_5 = arg0;
		this.anInt495 = arg0.anInt3518;
		this.anInt488 = arg0.anInt3519;
		this.aBoolean32 = arg0.aBoolean241;
		this.anInt493 = arg1;
		this.anInt489 = arg2;
		this.anInt490 = 8192;
		this.anInt494 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!lb;III)V")
	public Class2_Sub3_Sub2(@OriginalArg(0) Class2_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass2_Sub19_5 = arg0;
		this.anInt495 = arg0.anInt3518;
		this.anInt488 = arg0.anInt3519;
		this.aBoolean32 = arg0.aBoolean241;
		this.anInt493 = arg1;
		this.anInt489 = arg2;
		this.anInt490 = arg3;
		this.anInt494 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	public synchronized void method402(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method404();
			this.method4743();
		} else if (this.anInt496 == 0 && this.anInt497 == 0) {
			this.anInt491 = 0;
			this.anInt489 = 0;
			this.anInt492 = 0;
			this.method4743();
		} else {
			@Pc(31) int local31 = -this.anInt492;
			if (this.anInt492 > local31) {
				local31 = this.anInt492;
			}
			if (-this.anInt496 > local31) {
				local31 = -this.anInt496;
			}
			if (this.anInt496 > local31) {
				local31 = this.anInt496;
			}
			if (-this.anInt497 > local31) {
				local31 = -this.anInt497;
			}
			if (this.anInt497 > local31) {
				local31 = this.anInt497;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt491 = arg0;
			this.anInt489 = Integer.MIN_VALUE;
			this.anInt487 = -this.anInt492 / arg0;
			this.anInt499 = -this.anInt496 / arg0;
			this.anInt500 = -this.anInt497 / arg0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	private synchronized void method404() {
		this.method411(0, this.method418());
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "()I")
	@Override
	public int method4655() {
		@Pc(6) int local6 = this.anInt492 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt498 == 0) {
			local6 -= local6 * this.anInt494 / (((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36.length << 8);
		} else if (this.anInt498 >= 0) {
			local6 -= local6 * this.anInt495 / ((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
	public synchronized void method405(@OriginalArg(0) int arg0) {
		this.anInt498 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "()Z")
	public boolean method406() {
		return this.anInt494 < 0 || this.anInt494 >= ((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36.length << 8;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "()I")
	public synchronized int method407() {
		return this.anInt489 == Integer.MIN_VALUE ? 0 : this.anInt489;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)V")
	private synchronized void method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt489 = arg0;
		this.anInt490 = arg1;
		this.anInt491 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "()Z")
	private boolean method412() {
		@Pc(2) int local2 = this.anInt489;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static316.method398(local2, this.anInt490);
			local8 = Static316.method399(local2, this.anInt490);
		}
		if (this.anInt492 != local2 || this.anInt496 != local10 || this.anInt497 != local8) {
			if (this.anInt492 < local2) {
				this.anInt487 = 1;
				this.anInt491 = local2 - this.anInt492;
			} else if (this.anInt492 > local2) {
				this.anInt487 = -1;
				this.anInt491 = this.anInt492 - local2;
			} else {
				this.anInt487 = 0;
			}
			if (this.anInt496 < local10) {
				this.anInt499 = 1;
				if (this.anInt491 == 0 || this.anInt491 > local10 - this.anInt496) {
					this.anInt491 = local10 - this.anInt496;
				}
			} else if (this.anInt496 > local10) {
				this.anInt499 = -1;
				if (this.anInt491 == 0 || this.anInt491 > this.anInt496 - local10) {
					this.anInt491 = this.anInt496 - local10;
				}
			} else {
				this.anInt499 = 0;
			}
			if (this.anInt497 < local8) {
				this.anInt500 = 1;
				if (this.anInt491 == 0 || this.anInt491 > local8 - this.anInt497) {
					this.anInt491 = local8 - this.anInt497;
				}
			} else if (this.anInt497 > local8) {
				this.anInt500 = -1;
				if (this.anInt491 == 0 || this.anInt491 > this.anInt497 - local8) {
					this.anInt491 = this.anInt497 - local8;
				}
			} else {
				this.anInt500 = 0;
			}
			return false;
		} else if (this.anInt489 == Integer.MIN_VALUE) {
			this.anInt489 = 0;
			this.anInt492 = this.anInt496 = this.anInt497 = 0;
			this.method4743();
			return true;
		} else {
			this.method416();
			return false;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()Lclient!mh;")
	@Override
	public Class2_Sub3 method4649() {
		return null;
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
	public synchronized void method413(@OriginalArg(0) int arg0) {
		if (this.anInt493 < 0) {
			this.anInt493 = -arg0;
		} else {
			this.anInt493 = arg0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)V")
	public synchronized void method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method433(arg0, arg1, this.method418());
	}

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "()V")
	private void method416() {
		this.anInt492 = this.anInt489;
		this.anInt496 = Static316.method398(this.anInt489, this.anInt490);
		this.anInt497 = Static316.method399(this.anInt489, this.anInt490);
	}

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "()Z")
	public boolean method417() {
		return this.anInt491 != 0;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4653(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt489 == 0 && this.anInt491 == 0) {
			this.method4650(arg2);
			return;
		}
		@Pc(13) Class2_Sub19_Sub1 local13 = (Class2_Sub19_Sub1) this.aClass2_Sub19_5;
		@Pc(18) int local18 = this.anInt495 << 8;
		@Pc(23) int local23 = this.anInt488 << 8;
		@Pc(29) int local29 = local13.aByteArray36.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt498 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt494 < 0) {
			if (this.anInt493 <= 0) {
				this.method420();
				this.method4743();
				return;
			}
			this.anInt494 = 0;
		}
		if (this.anInt494 >= local29) {
			if (this.anInt493 >= 0) {
				this.method420();
				this.method4743();
				return;
			}
			this.anInt494 = local29 - 1;
		}
		if (this.anInt498 >= 0) {
			if (this.anInt498 > 0) {
				if (this.aBoolean32) {
					label131: {
						if (this.anInt493 < 0) {
							local40 = this.method437(arg0, arg1, local18, local44, local13.aByteArray36[this.anInt495]);
							if (this.anInt494 >= local18) {
								return;
							}
							this.anInt494 = local18 + local18 - this.anInt494 - 1;
							this.anInt493 = -this.anInt493;
							if (--this.anInt498 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method424(arg0, local40, local23, local44, local13.aByteArray36[this.anInt488 - 1]);
							if (this.anInt494 < local23) {
								return;
							}
							this.anInt494 = local23 + local23 - this.anInt494 - 1;
							this.anInt493 = -this.anInt493;
							if (--this.anInt498 == 0) {
								break;
							}
							local40 = this.method437(arg0, local40, local18, local44, local13.aByteArray36[this.anInt495]);
							if (this.anInt494 >= local18) {
								return;
							}
							this.anInt494 = local18 + local18 - this.anInt494 - 1;
							this.anInt493 = -this.anInt493;
						} while (--this.anInt498 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt493 < 0) {
						while (true) {
							local40 = this.method437(arg0, local40, local18, local44, local13.aByteArray36[this.anInt488 - 1]);
							if (this.anInt494 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt494 - 1) / local33;
							if (local417 >= this.anInt498) {
								this.anInt494 += local33 * this.anInt498;
								this.anInt498 = 0;
								break;
							}
							this.anInt494 += local33 * local417;
							this.anInt498 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method424(arg0, local40, local23, local44, local13.aByteArray36[this.anInt495]);
							if (this.anInt494 < local23) {
								return;
							}
							local417 = (this.anInt494 - local18) / local33;
							if (local417 >= this.anInt498) {
								this.anInt494 -= local33 * this.anInt498;
								this.anInt498 = 0;
								break;
							}
							this.anInt494 -= local33 * local417;
							this.anInt498 -= local417;
						}
					}
				}
			}
			if (this.anInt493 < 0) {
				this.method437(arg0, local40, 0, local44, 0);
				if (this.anInt494 < 0) {
					this.anInt494 = -1;
					this.method420();
					this.method4743();
				}
			} else {
				this.method424(arg0, local40, local29, local44, 0);
				if (this.anInt494 >= local29) {
					this.anInt494 = local29;
					this.method420();
					this.method4743();
				}
			}
		} else if (this.aBoolean32) {
			if (this.anInt493 < 0) {
				local40 = this.method437(arg0, arg1, local18, local44, local13.aByteArray36[this.anInt495]);
				if (this.anInt494 >= local18) {
					return;
				}
				this.anInt494 = local18 + local18 - this.anInt494 - 1;
				this.anInt493 = -this.anInt493;
			}
			while (true) {
				local40 = this.method424(arg0, local40, local23, local44, local13.aByteArray36[this.anInt488 - 1]);
				if (this.anInt494 < local23) {
					return;
				}
				this.anInt494 = local23 + local23 - this.anInt494 - 1;
				this.anInt493 = -this.anInt493;
				local40 = this.method437(arg0, local40, local18, local44, local13.aByteArray36[this.anInt495]);
				if (this.anInt494 >= local18) {
					return;
				}
				this.anInt494 = local18 + local18 - this.anInt494 - 1;
				this.anInt493 = -this.anInt493;
			}
		} else if (this.anInt493 < 0) {
			while (true) {
				local40 = this.method437(arg0, local40, local18, local44, local13.aByteArray36[this.anInt488 - 1]);
				if (this.anInt494 >= local18) {
					return;
				}
				this.anInt494 = local23 - (local23 - 1 - this.anInt494) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method424(arg0, local40, local23, local44, local13.aByteArray36[this.anInt495]);
				if (this.anInt494 < local23) {
					return;
				}
				this.anInt494 = local18 + (this.anInt494 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "()I")
	public synchronized int method418() {
		return this.anInt490 < 0 ? -1 : this.anInt490;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4650(@OriginalArg(0) int arg0) {
		if (this.anInt491 > 0) {
			if (arg0 >= this.anInt491) {
				if (this.anInt489 == Integer.MIN_VALUE) {
					this.anInt489 = 0;
					this.anInt492 = this.anInt496 = this.anInt497 = 0;
					this.method4743();
					arg0 = this.anInt491;
				}
				this.anInt491 = 0;
				this.method416();
			} else {
				this.anInt492 += this.anInt487 * arg0;
				this.anInt496 += this.anInt499 * arg0;
				this.anInt497 += this.anInt500 * arg0;
				this.anInt491 -= arg0;
			}
		}
		@Pc(71) Class2_Sub19_Sub1 local71 = (Class2_Sub19_Sub1) this.aClass2_Sub19_5;
		@Pc(76) int local76 = this.anInt495 << 8;
		@Pc(81) int local81 = this.anInt488 << 8;
		@Pc(87) int local87 = local71.aByteArray36.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt498 = 0;
		}
		if (this.anInt494 < 0) {
			if (this.anInt493 <= 0) {
				this.method420();
				this.method4743();
				return;
			}
			this.anInt494 = 0;
		}
		if (this.anInt494 >= local87) {
			if (this.anInt493 >= 0) {
				this.method420();
				this.method4743();
				return;
			}
			this.anInt494 = local87 - 1;
		}
		this.anInt494 += this.anInt493 * arg0;
		if (this.anInt498 >= 0) {
			if (this.anInt498 > 0) {
				if (this.aBoolean32) {
					label121: {
						if (this.anInt493 < 0) {
							if (this.anInt494 >= local76) {
								return;
							}
							this.anInt494 = local76 + local76 - this.anInt494 - 1;
							this.anInt493 = -this.anInt493;
							if (--this.anInt498 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt494 < local81) {
								return;
							}
							this.anInt494 = local81 + local81 - this.anInt494 - 1;
							this.anInt493 = -this.anInt493;
							if (--this.anInt498 == 0) {
								break;
							}
							if (this.anInt494 >= local76) {
								return;
							}
							this.anInt494 = local76 + local76 - this.anInt494 - 1;
							this.anInt493 = -this.anInt493;
						} while (--this.anInt498 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt493 < 0) {
							if (this.anInt494 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt494 - 1) / local91;
							if (local362 >= this.anInt498) {
								this.anInt494 += local91 * this.anInt498;
								this.anInt498 = 0;
								break label153;
							}
							this.anInt494 += local91 * local362;
							this.anInt498 -= local362;
						} else if (this.anInt494 >= local81) {
							local362 = (this.anInt494 - local76) / local91;
							if (local362 >= this.anInt498) {
								this.anInt494 -= local91 * this.anInt498;
								this.anInt498 = 0;
								break label153;
							}
							this.anInt494 -= local91 * local362;
							this.anInt498 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt493 < 0) {
				if (this.anInt494 < 0) {
					this.anInt494 = -1;
					this.method420();
					this.method4743();
				}
			} else if (this.anInt494 >= local87) {
				this.anInt494 = local87;
				this.method420();
				this.method4743();
			}
		} else if (this.aBoolean32) {
			if (this.anInt493 < 0) {
				if (this.anInt494 >= local76) {
					return;
				}
				this.anInt494 = local76 + local76 - this.anInt494 - 1;
				this.anInt493 = -this.anInt493;
			}
			while (this.anInt494 >= local81) {
				this.anInt494 = local81 + local81 - this.anInt494 - 1;
				this.anInt493 = -this.anInt493;
				if (this.anInt494 >= local76) {
					return;
				}
				this.anInt494 = local76 + local76 - this.anInt494 - 1;
				this.anInt493 = -this.anInt493;
			}
		} else if (this.anInt493 < 0) {
			if (this.anInt494 >= local76) {
				return;
			}
			this.anInt494 = local81 - (local81 - 1 - this.anInt494) % local91 - 1;
		} else if (this.anInt494 >= local81) {
			this.anInt494 = local76 + (this.anInt494 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "()V")
	private void method420() {
		if (this.anInt491 == 0) {
			return;
		}
		if (this.anInt489 == Integer.MIN_VALUE) {
			this.anInt489 = 0;
		}
		this.anInt491 = 0;
		this.method416();
	}

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V")
	public synchronized void method421(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt494 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([IIIII)I")
	private int method424(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt491 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt491;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt491 += arg1;
				if (this.anInt493 == 256 && (this.anInt494 & 0xFF) == 0) {
					if (Static49.aBoolean84) {
						arg1 = Static316.method428(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt496, this.anInt497, this.anInt499, this.anInt500, local7, arg2, this);
					} else {
						arg1 = Static316.method410(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt492, this.anInt487, local7, arg2, this);
					}
				} else if (Static49.aBoolean84) {
					arg1 = Static316.method422(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt496, this.anInt497, this.anInt499, this.anInt500, local7, arg2, this, this.anInt493, arg4);
				} else {
					arg1 = Static316.method431(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt492, this.anInt487, local7, arg2, this, this.anInt493, arg4);
				}
				this.anInt491 -= arg1;
				if (this.anInt491 != 0) {
					return arg1;
				}
				if (!this.method412()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt493 == 256 && (this.anInt494 & 0xFF) == 0) {
				if (Static49.aBoolean84) {
					return Static316.method435(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt496, this.anInt497, arg3, arg2, this);
				}
				return Static316.method430(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt492, arg3, arg2, this);
			}
			if (Static49.aBoolean84) {
				return Static316.method409(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt496, this.anInt497, arg3, arg2, this, this.anInt493, arg4);
			}
			return Static316.method427(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt492, arg3, arg2, this, this.anInt493, arg4);
		}
	}

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "(I)V")
	public synchronized void method426(@OriginalArg(0) int arg0) {
		this.method411(arg0 << 6, this.method418());
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()Lclient!mh;")
	@Override
	public Class2_Sub3 method4654() {
		return null;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()I")
	@Override
	public int method4651() {
		return this.anInt489 == 0 && this.anInt491 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
	public synchronized void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method411(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static316.method398(arg1, arg2);
		@Pc(14) int local14 = Static316.method399(arg1, arg2);
		if (this.anInt496 == local10 && this.anInt497 == local14) {
			this.anInt491 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt492;
		if (this.anInt492 - arg1 > local31) {
			local31 = this.anInt492 - arg1;
		}
		if (local10 - this.anInt496 > local31) {
			local31 = local10 - this.anInt496;
		}
		if (this.anInt496 - local10 > local31) {
			local31 = this.anInt496 - local10;
		}
		if (local14 - this.anInt497 > local31) {
			local31 = local14 - this.anInt497;
		}
		if (this.anInt497 - local14 > local31) {
			local31 = this.anInt497 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt491 = arg0;
		this.anInt489 = arg1;
		this.anInt490 = arg2;
		this.anInt487 = (arg1 - this.anInt492) / arg0;
		this.anInt499 = (local10 - this.anInt496) / arg0;
		this.anInt500 = (local14 - this.anInt497) / arg0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
	public synchronized void method434() {
		this.anInt493 = (this.anInt493 ^ this.anInt493 >> 31) + (this.anInt493 >>> 31);
		this.anInt493 = -this.anInt493;
	}

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "()I")
	public synchronized int method436() {
		return this.anInt493 < 0 ? -this.anInt493 : this.anInt493;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "([IIIII)I")
	private int method437(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt491 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt491;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt491 += arg1;
				if (this.anInt493 == -256 && (this.anInt494 & 0xFF) == 0) {
					if (Static49.aBoolean84) {
						arg1 = Static316.method400(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt496, this.anInt497, this.anInt499, this.anInt500, local7, arg2, this);
					} else {
						arg1 = Static316.method403(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt492, this.anInt487, local7, arg2, this);
					}
				} else if (Static49.aBoolean84) {
					arg1 = Static316.method429(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt496, this.anInt497, this.anInt499, this.anInt500, local7, arg2, this, this.anInt493, arg4);
				} else {
					arg1 = Static316.method425(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt492, this.anInt487, local7, arg2, this, this.anInt493, arg4);
				}
				this.anInt491 -= arg1;
				if (this.anInt491 != 0) {
					return arg1;
				}
				if (!this.method412()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt493 == -256 && (this.anInt494 & 0xFF) == 0) {
				if (Static49.aBoolean84) {
					return Static316.method408(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt496, this.anInt497, arg3, arg2, this);
				}
				return Static316.method419(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt492, arg3, arg2, this);
			}
			if (Static49.aBoolean84) {
				return Static316.method432(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt496, this.anInt497, arg3, arg2, this, this.anInt493, arg4);
			}
			return Static316.method423(((Class2_Sub19_Sub1) this.aClass2_Sub19_5).aByteArray36, arg0, this.anInt494, arg1, this.anInt492, arg3, arg2, this, this.anInt493, arg4);
		}
	}
}
