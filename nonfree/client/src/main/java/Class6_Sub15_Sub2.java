import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class6_Sub15_Sub2 extends Class6_Sub15 {

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
	private int anInt4549;

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
	public int anInt4551;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
	public int anInt4552;

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
	public int anInt4554;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
	private int anInt4555;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
	public int anInt4557;

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
	public int anInt4559;

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
	public int anInt4560;

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
	private final int anInt4558;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
	private final int anInt4561;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "Z")
	private final boolean aBoolean335;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	private int anInt4548;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
	private int anInt4556;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
	private int anInt4553;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
	public int anInt4550;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!qr;II)V")
	public Class6_Sub15_Sub2(@OriginalArg(0) Class6_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass6_Sub6_5 = arg0;
		this.anInt4558 = arg0.anInt7693;
		this.anInt4561 = arg0.anInt7692;
		this.aBoolean335 = arg0.aBoolean507;
		this.anInt4548 = arg1;
		this.anInt4556 = arg2;
		this.anInt4553 = 8192;
		this.anInt4550 = 0;
		this.method3868();
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!qr;III)V")
	public Class6_Sub15_Sub2(@OriginalArg(0) Class6_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub6_5 = arg0;
		this.anInt4558 = arg0.anInt7693;
		this.anInt4561 = arg0.anInt7692;
		this.aBoolean335 = arg0.aBoolean507;
		this.anInt4548 = arg1;
		this.anInt4556 = arg2;
		this.anInt4553 = arg3;
		this.anInt4550 = 0;
		this.method3868();
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "()V")
	private void method3846() {
		if (this.anInt4555 == 0) {
			return;
		}
		if (this.anInt4556 == Integer.MIN_VALUE) {
			this.anInt4556 = 0;
		}
		this.anInt4555 = 0;
		this.method3868();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	private synchronized void method3847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4556 = arg0;
		this.anInt4553 = arg1;
		this.anInt4555 = 0;
		this.method3868();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	private synchronized void method3848() {
		this.method3847(0, this.method3870());
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "()Z")
	public boolean method3849() {
		return this.anInt4550 < 0 || this.anInt4550 >= ((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99.length << 8;
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
	public synchronized void method3850(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3848();
			this.method7948();
		} else if (this.anInt4557 == 0 && this.anInt4554 == 0) {
			this.anInt4555 = 0;
			this.anInt4556 = 0;
			this.anInt4559 = 0;
			this.method7948();
		} else {
			@Pc(31) int local31 = -this.anInt4559;
			if (this.anInt4559 > local31) {
				local31 = this.anInt4559;
			}
			if (-this.anInt4557 > local31) {
				local31 = -this.anInt4557;
			}
			if (this.anInt4557 > local31) {
				local31 = this.anInt4557;
			}
			if (-this.anInt4554 > local31) {
				local31 = -this.anInt4554;
			}
			if (this.anInt4554 > local31) {
				local31 = this.anInt4554;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4555 = arg0;
			this.anInt4556 = Integer.MIN_VALUE;
			this.anInt4560 = -this.anInt4559 / arg0;
			this.anInt4552 = -this.anInt4557 / arg0;
			this.anInt4551 = -this.anInt4554 / arg0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "()Lclient!vw;")
	@Override
	public Class6_Sub15 method7937() {
		return null;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "()I")
	@Override
	public int method7938() {
		@Pc(6) int local6 = this.anInt4559 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4549 == 0) {
			local6 -= local6 * this.anInt4550 / (((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99.length << 8);
		} else if (this.anInt4549 >= 0) {
			local6 -= local6 * this.anInt4558 / ((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
	public synchronized void method3856(@OriginalArg(0) int arg0) {
		if (this.anInt4548 < 0) {
			this.anInt4548 = -arg0;
		} else {
			this.anInt4548 = arg0;
		}
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "()I")
	public synchronized int method3857() {
		return this.anInt4548 < 0 ? -this.anInt4548 : this.anInt4548;
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "()Z")
	public boolean method3859() {
		return this.anInt4555 != 0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V")
	public synchronized void method3861() {
		this.anInt4548 = (this.anInt4548 ^ this.anInt4548 >> 31) + (this.anInt4548 >>> 31);
		this.anInt4548 = -this.anInt4548;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7933(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4556 == 0 && this.anInt4555 == 0) {
			this.method7939(arg2);
			return;
		}
		@Pc(13) Class6_Sub6_Sub1 local13 = (Class6_Sub6_Sub1) super.aClass6_Sub6_5;
		@Pc(18) int local18 = this.anInt4558 << 8;
		@Pc(23) int local23 = this.anInt4561 << 8;
		@Pc(29) int local29 = local13.aByteArray99.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4549 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4550 < 0) {
			if (this.anInt4548 <= 0) {
				this.method3846();
				this.method7948();
				return;
			}
			this.anInt4550 = 0;
		}
		if (this.anInt4550 >= local29) {
			if (this.anInt4548 >= 0) {
				this.method3846();
				this.method7948();
				return;
			}
			this.anInt4550 = local29 - 1;
		}
		if (this.anInt4549 >= 0) {
			if (this.anInt4549 > 0) {
				if (this.aBoolean335) {
					label130: {
						if (this.anInt4548 < 0) {
							local40 = this.method3877(arg0, arg1, local18, local44, local13.aByteArray99[this.anInt4558]);
							if (this.anInt4550 >= local18) {
								return;
							}
							this.anInt4550 = local18 + local18 - this.anInt4550 - 1;
							this.anInt4548 = -this.anInt4548;
							if (--this.anInt4549 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3884(arg0, local40, local23, local44, local13.aByteArray99[this.anInt4561 - 1]);
							if (this.anInt4550 < local23) {
								return;
							}
							this.anInt4550 = local23 + local23 - this.anInt4550 - 1;
							this.anInt4548 = -this.anInt4548;
							if (--this.anInt4549 == 0) {
								break;
							}
							local40 = this.method3877(arg0, local40, local18, local44, local13.aByteArray99[this.anInt4558]);
							if (this.anInt4550 >= local18) {
								return;
							}
							this.anInt4550 = local18 + local18 - this.anInt4550 - 1;
							this.anInt4548 = -this.anInt4548;
						} while (--this.anInt4549 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4548 < 0) {
						while (true) {
							local40 = this.method3877(arg0, local40, local18, local44, local13.aByteArray99[this.anInt4561 - 1]);
							if (this.anInt4550 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4550 - 1) / local33;
							if (local416 >= this.anInt4549) {
								this.anInt4550 += local33 * this.anInt4549;
								this.anInt4549 = 0;
								break;
							}
							this.anInt4550 += local33 * local416;
							this.anInt4549 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3884(arg0, local40, local23, local44, local13.aByteArray99[this.anInt4558]);
							if (this.anInt4550 < local23) {
								return;
							}
							local416 = (this.anInt4550 - local18) / local33;
							if (local416 >= this.anInt4549) {
								this.anInt4550 -= local33 * this.anInt4549;
								this.anInt4549 = 0;
								break;
							}
							this.anInt4550 -= local33 * local416;
							this.anInt4549 -= local416;
						}
					}
				}
			}
			if (this.anInt4548 < 0) {
				this.method3877(arg0, local40, 0, local44, 0);
				if (this.anInt4550 < 0) {
					this.anInt4550 = -1;
					this.method3846();
					this.method7948();
					return;
				}
			} else {
				this.method3884(arg0, local40, local29, local44, 0);
				if (this.anInt4550 >= local29) {
					this.anInt4550 = local29;
					this.method3846();
					this.method7948();
				}
			}
		} else if (this.aBoolean335) {
			if (this.anInt4548 < 0) {
				local40 = this.method3877(arg0, arg1, local18, local44, local13.aByteArray99[this.anInt4558]);
				if (this.anInt4550 >= local18) {
					return;
				}
				this.anInt4550 = local18 + local18 - this.anInt4550 - 1;
				this.anInt4548 = -this.anInt4548;
			}
			while (true) {
				local40 = this.method3884(arg0, local40, local23, local44, local13.aByteArray99[this.anInt4561 - 1]);
				if (this.anInt4550 < local23) {
					return;
				}
				this.anInt4550 = local23 + local23 - this.anInt4550 - 1;
				this.anInt4548 = -this.anInt4548;
				local40 = this.method3877(arg0, local40, local18, local44, local13.aByteArray99[this.anInt4558]);
				if (this.anInt4550 >= local18) {
					return;
				}
				this.anInt4550 = local18 + local18 - this.anInt4550 - 1;
				this.anInt4548 = -this.anInt4548;
			}
		} else if (this.anInt4548 < 0) {
			while (true) {
				local40 = this.method3877(arg0, local40, local18, local44, local13.aByteArray99[this.anInt4561 - 1]);
				if (this.anInt4550 >= local18) {
					return;
				}
				this.anInt4550 = local23 - (local23 - 1 - this.anInt4550) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3884(arg0, local40, local23, local44, local13.aByteArray99[this.anInt4558]);
				if (this.anInt4550 < local23) {
					return;
				}
				this.anInt4550 = local18 + (this.anInt4550 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7939(@OriginalArg(0) int arg0) {
		if (this.anInt4555 > 0) {
			if (arg0 >= this.anInt4555) {
				if (this.anInt4556 == Integer.MIN_VALUE) {
					this.anInt4556 = 0;
					this.anInt4559 = this.anInt4557 = this.anInt4554 = 0;
					this.method7948();
					arg0 = this.anInt4555;
				}
				this.anInt4555 = 0;
				this.method3868();
			} else {
				this.anInt4559 += this.anInt4560 * arg0;
				this.anInt4557 += this.anInt4552 * arg0;
				this.anInt4554 += this.anInt4551 * arg0;
				this.anInt4555 -= arg0;
			}
		}
		@Pc(71) Class6_Sub6_Sub1 local71 = (Class6_Sub6_Sub1) super.aClass6_Sub6_5;
		@Pc(76) int local76 = this.anInt4558 << 8;
		@Pc(81) int local81 = this.anInt4561 << 8;
		@Pc(87) int local87 = local71.aByteArray99.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4549 = 0;
		}
		if (this.anInt4550 < 0) {
			if (this.anInt4548 <= 0) {
				this.method3846();
				this.method7948();
				return;
			}
			this.anInt4550 = 0;
		}
		if (this.anInt4550 >= local87) {
			if (this.anInt4548 >= 0) {
				this.method3846();
				this.method7948();
				return;
			}
			this.anInt4550 = local87 - 1;
		}
		this.anInt4550 += this.anInt4548 * arg0;
		if (this.anInt4549 >= 0) {
			if (this.anInt4549 > 0) {
				if (this.aBoolean335) {
					label125: {
						if (this.anInt4548 < 0) {
							if (this.anInt4550 >= local76) {
								return;
							}
							this.anInt4550 = local76 + local76 - this.anInt4550 - 1;
							this.anInt4548 = -this.anInt4548;
							if (--this.anInt4549 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4550 < local81) {
								return;
							}
							this.anInt4550 = local81 + local81 - this.anInt4550 - 1;
							this.anInt4548 = -this.anInt4548;
							if (--this.anInt4549 == 0) {
								break;
							}
							if (this.anInt4550 >= local76) {
								return;
							}
							this.anInt4550 = local76 + local76 - this.anInt4550 - 1;
							this.anInt4548 = -this.anInt4548;
						} while (--this.anInt4549 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4548 < 0) {
						if (this.anInt4550 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4550 - 1) / local91;
						if (local361 < this.anInt4549) {
							this.anInt4550 += local91 * local361;
							this.anInt4549 -= local361;
							return;
						}
						this.anInt4550 += local91 * this.anInt4549;
						this.anInt4549 = 0;
					} else if (this.anInt4550 >= local81) {
						local361 = (this.anInt4550 - local76) / local91;
						if (local361 < this.anInt4549) {
							this.anInt4550 -= local91 * local361;
							this.anInt4549 -= local361;
							return;
						}
						this.anInt4550 -= local91 * this.anInt4549;
						this.anInt4549 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4548 < 0) {
				if (this.anInt4550 < 0) {
					this.anInt4550 = -1;
					this.method3846();
					this.method7948();
					return;
				}
			} else if (this.anInt4550 >= local87) {
				this.anInt4550 = local87;
				this.method3846();
				this.method7948();
			}
		} else if (this.aBoolean335) {
			if (this.anInt4548 < 0) {
				if (this.anInt4550 >= local76) {
					return;
				}
				this.anInt4550 = local76 + local76 - this.anInt4550 - 1;
				this.anInt4548 = -this.anInt4548;
			}
			while (this.anInt4550 >= local81) {
				this.anInt4550 = local81 + local81 - this.anInt4550 - 1;
				this.anInt4548 = -this.anInt4548;
				if (this.anInt4550 >= local76) {
					return;
				}
				this.anInt4550 = local76 + local76 - this.anInt4550 - 1;
				this.anInt4548 = -this.anInt4548;
			}
		} else if (this.anInt4548 < 0) {
			if (this.anInt4550 < local76) {
				this.anInt4550 = local81 - (local81 - 1 - this.anInt4550) % local91 - 1;
			}
		} else if (this.anInt4550 >= local81) {
			this.anInt4550 = local76 + (this.anInt4550 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)V")
	public synchronized void method3864(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4550 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V")
	public synchronized void method3865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3847(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static591.method3863(arg1, arg2);
		@Pc(14) int local14 = Static591.method3852(arg1, arg2);
		if (this.anInt4557 == local10 && this.anInt4554 == local14) {
			this.anInt4555 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4559;
		if (this.anInt4559 - arg1 > local31) {
			local31 = this.anInt4559 - arg1;
		}
		if (local10 - this.anInt4557 > local31) {
			local31 = local10 - this.anInt4557;
		}
		if (this.anInt4557 - local10 > local31) {
			local31 = this.anInt4557 - local10;
		}
		if (local14 - this.anInt4554 > local31) {
			local31 = local14 - this.anInt4554;
		}
		if (this.anInt4554 - local14 > local31) {
			local31 = this.anInt4554 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4555 = arg0;
		this.anInt4556 = arg1;
		this.anInt4553 = arg2;
		this.anInt4560 = (arg1 - this.anInt4559) / arg0;
		this.anInt4552 = (local10 - this.anInt4557) / arg0;
		this.anInt4551 = (local14 - this.anInt4554) / arg0;
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "()V")
	private void method3868() {
		this.anInt4559 = this.anInt4556;
		this.anInt4557 = Static591.method3863(this.anInt4556, this.anInt4553);
		this.anInt4554 = Static591.method3852(this.anInt4556, this.anInt4553);
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "()I")
	public synchronized int method3870() {
		return this.anInt4553 < 0 ? -1 : this.anInt4553;
	}

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "()I")
	public synchronized int method3872() {
		return this.anInt4556 == Integer.MIN_VALUE ? 0 : this.anInt4556;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)V")
	public synchronized void method3873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3865(arg0, arg1, this.method3870());
	}

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "()Z")
	private boolean method3876() {
		@Pc(2) int local2 = this.anInt4556;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static591.method3863(local2, this.anInt4553);
			local8 = Static591.method3852(local2, this.anInt4553);
		}
		if (this.anInt4559 != local2 || this.anInt4557 != local10 || this.anInt4554 != local8) {
			if (this.anInt4559 < local2) {
				this.anInt4560 = 1;
				this.anInt4555 = local2 - this.anInt4559;
			} else if (this.anInt4559 > local2) {
				this.anInt4560 = -1;
				this.anInt4555 = this.anInt4559 - local2;
			} else {
				this.anInt4560 = 0;
			}
			if (this.anInt4557 < local10) {
				this.anInt4552 = 1;
				if (this.anInt4555 == 0 || this.anInt4555 > local10 - this.anInt4557) {
					this.anInt4555 = local10 - this.anInt4557;
				}
			} else if (this.anInt4557 > local10) {
				this.anInt4552 = -1;
				if (this.anInt4555 == 0 || this.anInt4555 > this.anInt4557 - local10) {
					this.anInt4555 = this.anInt4557 - local10;
				}
			} else {
				this.anInt4552 = 0;
			}
			if (this.anInt4554 < local8) {
				this.anInt4551 = 1;
				if (this.anInt4555 == 0 || this.anInt4555 > local8 - this.anInt4554) {
					this.anInt4555 = local8 - this.anInt4554;
				}
			} else if (this.anInt4554 > local8) {
				this.anInt4551 = -1;
				if (this.anInt4555 == 0 || this.anInt4555 > this.anInt4554 - local8) {
					this.anInt4555 = this.anInt4554 - local8;
				}
			} else {
				this.anInt4551 = 0;
			}
			return false;
		} else if (this.anInt4556 == Integer.MIN_VALUE) {
			this.anInt4556 = 0;
			this.anInt4559 = this.anInt4557 = this.anInt4554 = 0;
			this.method7948();
			return true;
		} else {
			this.method3868();
			return false;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()Lclient!vw;")
	@Override
	public Class6_Sub15 method7934() {
		return null;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()I")
	@Override
	public int method7935() {
		return this.anInt4556 == 0 && this.anInt4555 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIII)I")
	private int method3877(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4555 <= 0) {
				if (this.anInt4548 == -256 && (this.anInt4550 & 0xFF) == 0) {
					if (Static480.aBoolean552) {
						return Static591.method3871(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4557, this.anInt4554, arg3, arg2, this);
					}
					return Static591.method3875(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4559, arg3, arg2, this);
				}
				if (Static480.aBoolean552) {
					return Static591.method3854(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4557, this.anInt4554, arg3, arg2, this, this.anInt4548, arg4);
				}
				return Static591.method3866(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4559, arg3, arg2, this, this.anInt4548, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4555;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4555 += arg1;
			if (this.anInt4548 == -256 && (this.anInt4550 & 0xFF) == 0) {
				if (Static480.aBoolean552) {
					arg1 = Static591.method3878(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4557, this.anInt4554, this.anInt4552, this.anInt4551, local5, arg2, this);
				} else {
					arg1 = Static591.method3845(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4559, this.anInt4560, local5, arg2, this);
				}
			} else if (Static480.aBoolean552) {
				arg1 = Static591.method3883(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4557, this.anInt4554, this.anInt4552, this.anInt4551, local5, arg2, this, this.anInt4548, arg4);
			} else {
				arg1 = Static591.method3882(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4559, this.anInt4560, local5, arg2, this, this.anInt4548, arg4);
			}
			this.anInt4555 -= arg1;
			if (this.anInt4555 != 0) {
				return arg1;
			}
		} while (!this.method3876());
		return arg3;
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)V")
	public synchronized void method3879(@OriginalArg(0) int arg0) {
		this.method3847(arg0 << 6, this.method3870());
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(I)V")
	public synchronized void method3880(@OriginalArg(0) int arg0) {
		this.anInt4549 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "([IIIII)I")
	private int method3884(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4555 <= 0) {
				if (this.anInt4548 == 256 && (this.anInt4550 & 0xFF) == 0) {
					if (Static480.aBoolean552) {
						return Static591.method3874(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4557, this.anInt4554, arg3, arg2, this);
					}
					return Static591.method3862(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4559, arg3, arg2, this);
				}
				if (Static480.aBoolean552) {
					return Static591.method3853(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4557, this.anInt4554, arg3, arg2, this, this.anInt4548, arg4);
				}
				return Static591.method3867(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4559, arg3, arg2, this, this.anInt4548, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4555;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4555 += arg1;
			if (this.anInt4548 == 256 && (this.anInt4550 & 0xFF) == 0) {
				if (Static480.aBoolean552) {
					arg1 = Static591.method3869(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4557, this.anInt4554, this.anInt4552, this.anInt4551, local5, arg2, this);
				} else {
					arg1 = Static591.method3851(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4559, this.anInt4560, local5, arg2, this);
				}
			} else if (Static480.aBoolean552) {
				arg1 = Static591.method3855(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4557, this.anInt4554, this.anInt4552, this.anInt4551, local5, arg2, this, this.anInt4548, arg4);
			} else {
				arg1 = Static591.method3881(((Class6_Sub6_Sub1) super.aClass6_Sub6_5).aByteArray99, arg0, this.anInt4550, arg1, this.anInt4559, this.anInt4560, local5, arg2, this, this.anInt4548, arg4);
			}
			this.anInt4555 -= arg1;
			if (this.anInt4555 != 0) {
				return arg1;
			}
		} while (!this.method3876());
		return arg3;
	}
}
