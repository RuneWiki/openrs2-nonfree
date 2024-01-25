import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class6_Sub4_Sub5 extends Class6_Sub4 {

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
	public int anInt10608;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
	public int anInt10611;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
	private int anInt10612;

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
	public int anInt10615;

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
	public int anInt10616;

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
	public int anInt10617;

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
	public int anInt10619;

	@OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
	private int anInt10621;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
	private final int anInt10609;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
	private final int anInt10610;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "Z")
	private final boolean aBoolean835;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
	private int anInt10613;

	@OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
	private int anInt10620;

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
	private int anInt10614;

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
	public int anInt10618;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!ib;III)V")
	public Class6_Sub4_Sub5(@OriginalArg(0) Class6_Sub27_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub27_6 = arg0;
		this.anInt10609 = arg0.anInt5148;
		this.anInt10610 = arg0.anInt5147;
		this.aBoolean835 = arg0.aBoolean413;
		this.anInt10613 = arg1;
		this.anInt10620 = arg2;
		this.anInt10614 = arg3;
		this.anInt10618 = 0;
		this.method8653();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([IIIII)I")
	private int method8639(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt10621 <= 0) {
				if (this.anInt10613 == -256 && (this.anInt10618 & 0xFF) == 0) {
					if (Static528.aBoolean739) {
						return Static656.method8674(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10615, this.anInt10619, arg3, arg2, this);
					}
					return Static656.method8659(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10616, arg3, arg2, this);
				}
				if (Static528.aBoolean739) {
					return Static656.method8651(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10615, this.anInt10619, arg3, arg2, this, this.anInt10613, arg4);
				}
				return Static656.method8649(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10616, arg3, arg2, this, this.anInt10613, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt10621;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt10621 += arg1;
			if (this.anInt10613 == -256 && (this.anInt10618 & 0xFF) == 0) {
				if (Static528.aBoolean739) {
					arg1 = Static656.method8665(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10615, this.anInt10619, this.anInt10611, this.anInt10608, local5, arg2, this);
				} else {
					arg1 = Static656.method8663(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10616, this.anInt10617, local5, arg2, this);
				}
			} else if (Static528.aBoolean739) {
				arg1 = Static656.method8654(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10615, this.anInt10619, this.anInt10611, this.anInt10608, local5, arg2, this, this.anInt10613, arg4);
			} else {
				arg1 = Static656.method8640(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10616, this.anInt10617, local5, arg2, this, this.anInt10613, arg4);
			}
			this.anInt10621 -= arg1;
			if (this.anInt10621 != 0) {
				return arg1;
			}
		} while (!this.method8643());
		return arg3;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "()Lclient!mha;")
	@Override
	public Class6_Sub4 method8632() {
		return null;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8635(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt10620 == 0 && this.anInt10621 == 0) {
			this.method8631(arg2);
			return;
		}
		@Pc(13) Class6_Sub27_Sub1 local13 = (Class6_Sub27_Sub1) super.aClass6_Sub27_6;
		@Pc(18) int local18 = this.anInt10609 << 8;
		@Pc(23) int local23 = this.anInt10610 << 8;
		@Pc(29) int local29 = local13.aByteArray33.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt10612 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt10618 < 0) {
			if (this.anInt10613 <= 0) {
				this.method8658();
				this.method8792();
				return;
			}
			this.anInt10618 = 0;
		}
		if (this.anInt10618 >= local29) {
			if (this.anInt10613 >= 0) {
				this.method8658();
				this.method8792();
				return;
			}
			this.anInt10618 = local29 - 1;
		}
		if (this.anInt10612 >= 0) {
			if (this.anInt10612 > 0) {
				if (this.aBoolean835) {
					label130: {
						if (this.anInt10613 < 0) {
							local40 = this.method8639(arg0, arg1, local18, local44, local13.aByteArray33[this.anInt10609]);
							if (this.anInt10618 >= local18) {
								return;
							}
							this.anInt10618 = local18 + local18 - this.anInt10618 - 1;
							this.anInt10613 = -this.anInt10613;
							if (--this.anInt10612 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method8673(arg0, local40, local23, local44, local13.aByteArray33[this.anInt10610 - 1]);
							if (this.anInt10618 < local23) {
								return;
							}
							this.anInt10618 = local23 + local23 - this.anInt10618 - 1;
							this.anInt10613 = -this.anInt10613;
							if (--this.anInt10612 == 0) {
								break;
							}
							local40 = this.method8639(arg0, local40, local18, local44, local13.aByteArray33[this.anInt10609]);
							if (this.anInt10618 >= local18) {
								return;
							}
							this.anInt10618 = local18 + local18 - this.anInt10618 - 1;
							this.anInt10613 = -this.anInt10613;
						} while (--this.anInt10612 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt10613 < 0) {
						while (true) {
							local40 = this.method8639(arg0, local40, local18, local44, local13.aByteArray33[this.anInt10610 - 1]);
							if (this.anInt10618 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt10618 - 1) / local33;
							if (local416 >= this.anInt10612) {
								this.anInt10618 += local33 * this.anInt10612;
								this.anInt10612 = 0;
								break;
							}
							this.anInt10618 += local33 * local416;
							this.anInt10612 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method8673(arg0, local40, local23, local44, local13.aByteArray33[this.anInt10609]);
							if (this.anInt10618 < local23) {
								return;
							}
							local416 = (this.anInt10618 - local18) / local33;
							if (local416 >= this.anInt10612) {
								this.anInt10618 -= local33 * this.anInt10612;
								this.anInt10612 = 0;
								break;
							}
							this.anInt10618 -= local33 * local416;
							this.anInt10612 -= local416;
						}
					}
				}
			}
			if (this.anInt10613 < 0) {
				this.method8639(arg0, local40, 0, local44, 0);
				if (this.anInt10618 < 0) {
					this.anInt10618 = -1;
					this.method8658();
					this.method8792();
					return;
				}
			} else {
				this.method8673(arg0, local40, local29, local44, 0);
				if (this.anInt10618 >= local29) {
					this.anInt10618 = local29;
					this.method8658();
					this.method8792();
				}
			}
		} else if (this.aBoolean835) {
			if (this.anInt10613 < 0) {
				local40 = this.method8639(arg0, arg1, local18, local44, local13.aByteArray33[this.anInt10609]);
				if (this.anInt10618 >= local18) {
					return;
				}
				this.anInt10618 = local18 + local18 - this.anInt10618 - 1;
				this.anInt10613 = -this.anInt10613;
			}
			while (true) {
				local40 = this.method8673(arg0, local40, local23, local44, local13.aByteArray33[this.anInt10610 - 1]);
				if (this.anInt10618 < local23) {
					return;
				}
				this.anInt10618 = local23 + local23 - this.anInt10618 - 1;
				this.anInt10613 = -this.anInt10613;
				local40 = this.method8639(arg0, local40, local18, local44, local13.aByteArray33[this.anInt10609]);
				if (this.anInt10618 >= local18) {
					return;
				}
				this.anInt10618 = local18 + local18 - this.anInt10618 - 1;
				this.anInt10613 = -this.anInt10613;
			}
		} else if (this.anInt10613 < 0) {
			while (true) {
				local40 = this.method8639(arg0, local40, local18, local44, local13.aByteArray33[this.anInt10610 - 1]);
				if (this.anInt10618 >= local18) {
					return;
				}
				this.anInt10618 = local23 - (local23 - 1 - this.anInt10618) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method8673(arg0, local40, local23, local44, local13.aByteArray33[this.anInt10609]);
				if (this.anInt10618 < local23) {
					return;
				}
				this.anInt10618 = local18 + (this.anInt10618 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "()Lclient!mha;")
	@Override
	public Class6_Sub4 method8637() {
		return null;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	public synchronized void method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method8657(arg0, arg1, this.method8671());
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "()Z")
	private boolean method8643() {
		@Pc(2) int local2 = this.anInt10620;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static656.method8650(local2, this.anInt10614);
			local8 = Static656.method8666(local2, this.anInt10614);
		}
		if (this.anInt10616 != local2 || this.anInt10615 != local10 || this.anInt10619 != local8) {
			if (this.anInt10616 < local2) {
				this.anInt10617 = 1;
				this.anInt10621 = local2 - this.anInt10616;
			} else if (this.anInt10616 > local2) {
				this.anInt10617 = -1;
				this.anInt10621 = this.anInt10616 - local2;
			} else {
				this.anInt10617 = 0;
			}
			if (this.anInt10615 < local10) {
				this.anInt10611 = 1;
				if (this.anInt10621 == 0 || this.anInt10621 > local10 - this.anInt10615) {
					this.anInt10621 = local10 - this.anInt10615;
				}
			} else if (this.anInt10615 > local10) {
				this.anInt10611 = -1;
				if (this.anInt10621 == 0 || this.anInt10621 > this.anInt10615 - local10) {
					this.anInt10621 = this.anInt10615 - local10;
				}
			} else {
				this.anInt10611 = 0;
			}
			if (this.anInt10619 < local8) {
				this.anInt10608 = 1;
				if (this.anInt10621 == 0 || this.anInt10621 > local8 - this.anInt10619) {
					this.anInt10621 = local8 - this.anInt10619;
				}
			} else if (this.anInt10619 > local8) {
				this.anInt10608 = -1;
				if (this.anInt10621 == 0 || this.anInt10621 > this.anInt10619 - local8) {
					this.anInt10621 = this.anInt10619 - local8;
				}
			} else {
				this.anInt10608 = 0;
			}
			return false;
		} else if (this.anInt10620 == Integer.MIN_VALUE) {
			this.anInt10620 = 0;
			this.anInt10616 = this.anInt10615 = this.anInt10619 = 0;
			this.method8792();
			return true;
		} else {
			this.method8653();
			return false;
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public synchronized void method8644(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt10618 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "()I")
	public synchronized int method8645() {
		return this.anInt10620 == Integer.MIN_VALUE ? 0 : this.anInt10620;
	}

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "()Z")
	public boolean method8646() {
		return this.anInt10618 < 0 || this.anInt10618 >= ((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33.length << 8;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8631(@OriginalArg(0) int arg0) {
		if (this.anInt10621 > 0) {
			if (arg0 >= this.anInt10621) {
				if (this.anInt10620 == Integer.MIN_VALUE) {
					this.anInt10620 = 0;
					this.anInt10616 = this.anInt10615 = this.anInt10619 = 0;
					this.method8792();
					arg0 = this.anInt10621;
				}
				this.anInt10621 = 0;
				this.method8653();
			} else {
				this.anInt10616 += this.anInt10617 * arg0;
				this.anInt10615 += this.anInt10611 * arg0;
				this.anInt10619 += this.anInt10608 * arg0;
				this.anInt10621 -= arg0;
			}
		}
		@Pc(71) Class6_Sub27_Sub1 local71 = (Class6_Sub27_Sub1) super.aClass6_Sub27_6;
		@Pc(76) int local76 = this.anInt10609 << 8;
		@Pc(81) int local81 = this.anInt10610 << 8;
		@Pc(87) int local87 = local71.aByteArray33.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt10612 = 0;
		}
		if (this.anInt10618 < 0) {
			if (this.anInt10613 <= 0) {
				this.method8658();
				this.method8792();
				return;
			}
			this.anInt10618 = 0;
		}
		if (this.anInt10618 >= local87) {
			if (this.anInt10613 >= 0) {
				this.method8658();
				this.method8792();
				return;
			}
			this.anInt10618 = local87 - 1;
		}
		this.anInt10618 += this.anInt10613 * arg0;
		if (this.anInt10612 >= 0) {
			if (this.anInt10612 > 0) {
				if (this.aBoolean835) {
					label125: {
						if (this.anInt10613 < 0) {
							if (this.anInt10618 >= local76) {
								return;
							}
							this.anInt10618 = local76 + local76 - this.anInt10618 - 1;
							this.anInt10613 = -this.anInt10613;
							if (--this.anInt10612 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt10618 < local81) {
								return;
							}
							this.anInt10618 = local81 + local81 - this.anInt10618 - 1;
							this.anInt10613 = -this.anInt10613;
							if (--this.anInt10612 == 0) {
								break;
							}
							if (this.anInt10618 >= local76) {
								return;
							}
							this.anInt10618 = local76 + local76 - this.anInt10618 - 1;
							this.anInt10613 = -this.anInt10613;
						} while (--this.anInt10612 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt10613 < 0) {
						if (this.anInt10618 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt10618 - 1) / local91;
						if (local361 < this.anInt10612) {
							this.anInt10618 += local91 * local361;
							this.anInt10612 -= local361;
							return;
						}
						this.anInt10618 += local91 * this.anInt10612;
						this.anInt10612 = 0;
					} else if (this.anInt10618 >= local81) {
						local361 = (this.anInt10618 - local76) / local91;
						if (local361 < this.anInt10612) {
							this.anInt10618 -= local91 * local361;
							this.anInt10612 -= local361;
							return;
						}
						this.anInt10618 -= local91 * this.anInt10612;
						this.anInt10612 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt10613 < 0) {
				if (this.anInt10618 < 0) {
					this.anInt10618 = -1;
					this.method8658();
					this.method8792();
					return;
				}
			} else if (this.anInt10618 >= local87) {
				this.anInt10618 = local87;
				this.method8658();
				this.method8792();
			}
		} else if (this.aBoolean835) {
			if (this.anInt10613 < 0) {
				if (this.anInt10618 >= local76) {
					return;
				}
				this.anInt10618 = local76 + local76 - this.anInt10618 - 1;
				this.anInt10613 = -this.anInt10613;
			}
			while (this.anInt10618 >= local81) {
				this.anInt10618 = local81 + local81 - this.anInt10618 - 1;
				this.anInt10613 = -this.anInt10613;
				if (this.anInt10618 >= local76) {
					return;
				}
				this.anInt10618 = local76 + local76 - this.anInt10618 - 1;
				this.anInt10613 = -this.anInt10613;
			}
		} else if (this.anInt10613 < 0) {
			if (this.anInt10618 < local76) {
				this.anInt10618 = local81 - (local81 - 1 - this.anInt10618) % local91 - 1;
			}
		} else if (this.anInt10618 >= local81) {
			this.anInt10618 = local76 + (this.anInt10618 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
	public synchronized void method8652(@OriginalArg(0) int arg0) {
		if (this.anInt10613 < 0) {
			this.anInt10613 = -arg0;
		} else {
			this.anInt10613 = arg0;
		}
	}

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "()V")
	private void method8653() {
		this.anInt10616 = this.anInt10620;
		this.anInt10615 = Static656.method8650(this.anInt10620, this.anInt10614);
		this.anInt10619 = Static656.method8666(this.anInt10620, this.anInt10614);
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)V")
	private synchronized void method8655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10620 = arg0;
		this.anInt10614 = arg1;
		this.anInt10621 = 0;
		this.method8653();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	public synchronized void method8656() {
		this.anInt10613 = (this.anInt10613 ^ this.anInt10613 >> 31) + (this.anInt10613 >>> 31);
		this.anInt10613 = -this.anInt10613;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)V")
	public synchronized void method8657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method8655(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static656.method8650(arg1, arg2);
		@Pc(14) int local14 = Static656.method8666(arg1, arg2);
		if (this.anInt10615 == local10 && this.anInt10619 == local14) {
			this.anInt10621 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt10616;
		if (this.anInt10616 - arg1 > local31) {
			local31 = this.anInt10616 - arg1;
		}
		if (local10 - this.anInt10615 > local31) {
			local31 = local10 - this.anInt10615;
		}
		if (this.anInt10615 - local10 > local31) {
			local31 = this.anInt10615 - local10;
		}
		if (local14 - this.anInt10619 > local31) {
			local31 = local14 - this.anInt10619;
		}
		if (this.anInt10619 - local14 > local31) {
			local31 = this.anInt10619 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt10621 = arg0;
		this.anInt10620 = arg1;
		this.anInt10614 = arg2;
		this.anInt10617 = (arg1 - this.anInt10616) / arg0;
		this.anInt10611 = (local10 - this.anInt10615) / arg0;
		this.anInt10608 = (local14 - this.anInt10619) / arg0;
	}

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "()V")
	private void method8658() {
		if (this.anInt10621 == 0) {
			return;
		}
		if (this.anInt10620 == Integer.MIN_VALUE) {
			this.anInt10620 = 0;
		}
		this.anInt10621 = 0;
		this.method8653();
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
	private synchronized void method8664() {
		this.method8655(0, this.method8671());
	}

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)V")
	public synchronized void method8667(@OriginalArg(0) int arg0) {
		this.anInt10612 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V")
	public synchronized void method8668(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method8664();
			this.method8792();
		} else if (this.anInt10615 == 0 && this.anInt10619 == 0) {
			this.anInt10621 = 0;
			this.anInt10620 = 0;
			this.anInt10616 = 0;
			this.method8792();
		} else {
			@Pc(31) int local31 = -this.anInt10616;
			if (this.anInt10616 > local31) {
				local31 = this.anInt10616;
			}
			if (-this.anInt10615 > local31) {
				local31 = -this.anInt10615;
			}
			if (this.anInt10615 > local31) {
				local31 = this.anInt10615;
			}
			if (-this.anInt10619 > local31) {
				local31 = -this.anInt10619;
			}
			if (this.anInt10619 > local31) {
				local31 = this.anInt10619;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt10621 = arg0;
			this.anInt10620 = Integer.MIN_VALUE;
			this.anInt10617 = -this.anInt10616 / arg0;
			this.anInt10611 = -this.anInt10615 / arg0;
			this.anInt10608 = -this.anInt10619 / arg0;
		}
	}

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "()Z")
	public boolean method8670() {
		return this.anInt10621 != 0;
	}

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "()I")
	public synchronized int method8671() {
		return this.anInt10614 < 0 ? -1 : this.anInt10614;
	}

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
	public synchronized void method8672(@OriginalArg(0) int arg0) {
		this.method8655(arg0 << 6, this.method8671());
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "()I")
	@Override
	public int method8636() {
		return this.anInt10620 == 0 && this.anInt10621 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "([IIIII)I")
	private int method8673(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt10621 <= 0) {
				if (this.anInt10613 == 256 && (this.anInt10618 & 0xFF) == 0) {
					if (Static528.aBoolean739) {
						return Static656.method8648(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10615, this.anInt10619, arg3, arg2, this);
					}
					return Static656.method8641(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10616, arg3, arg2, this);
				}
				if (Static528.aBoolean739) {
					return Static656.method8638(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10615, this.anInt10619, arg3, arg2, this, this.anInt10613, arg4);
				}
				return Static656.method8677(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10616, arg3, arg2, this, this.anInt10613, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt10621;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt10621 += arg1;
			if (this.anInt10613 == 256 && (this.anInt10618 & 0xFF) == 0) {
				if (Static528.aBoolean739) {
					arg1 = Static656.method8662(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10615, this.anInt10619, this.anInt10611, this.anInt10608, local5, arg2, this);
				} else {
					arg1 = Static656.method8661(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10616, this.anInt10617, local5, arg2, this);
				}
			} else if (Static528.aBoolean739) {
				arg1 = Static656.method8660(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10615, this.anInt10619, this.anInt10611, this.anInt10608, local5, arg2, this, this.anInt10613, arg4);
			} else {
				arg1 = Static656.method8669(((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33, arg0, this.anInt10618, arg1, this.anInt10616, this.anInt10617, local5, arg2, this, this.anInt10613, arg4);
			}
			this.anInt10621 -= arg1;
			if (this.anInt10621 != 0) {
				return arg1;
			}
		} while (!this.method8643());
		return arg3;
	}

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "()I")
	public synchronized int method8675() {
		return this.anInt10613 < 0 ? -this.anInt10613 : this.anInt10613;
	}

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "(I)V")
	public synchronized void method8676(@OriginalArg(0) int arg0) {
		this.method8655(this.method8645(), arg0);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "()I")
	@Override
	public int method8633() {
		@Pc(6) int local6 = this.anInt10616 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt10612 == 0) {
			local6 -= local6 * this.anInt10618 / (((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33.length << 8);
		} else if (this.anInt10612 >= 0) {
			local6 -= local6 * this.anInt10609 / ((Class6_Sub27_Sub1) super.aClass6_Sub27_6).aByteArray33.length;
		}
		return local6 > 255 ? 255 : local6;
	}
}
