import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class6_Sub3_Sub3 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
	public int anInt4393;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
	public int anInt4395;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
	private int anInt4396;

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
	public int anInt4401;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
	public int anInt4402;

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
	private int anInt4403;

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
	public int anInt4404;

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
	public int anInt4405;

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
	private final int anInt4400;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
	private final int anInt4399;

	@OriginalMember(owner = "client!ia", name = "B", descriptor = "Z")
	private final boolean aBoolean314;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
	private int anInt4394;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
	private int anInt4406;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
	private int anInt4397;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
	public int anInt4398;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!ut;III)V")
	public Class6_Sub3_Sub3(@OriginalArg(0) Class6_Sub37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub37_6 = arg0;
		this.anInt4400 = arg0.anInt9841;
		this.anInt4399 = arg0.anInt9840;
		this.aBoolean314 = arg0.aBoolean673;
		this.anInt4394 = arg1;
		this.anInt4406 = arg2;
		this.anInt4397 = arg3;
		this.anInt4398 = 0;
		this.method3831();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([IIIII)I")
	private int method3829(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4396 <= 0) {
				if (this.anInt4394 == -256 && (this.anInt4398 & 0xFF) == 0) {
					if (Static339.aBoolean677) {
						return Static653.method3827(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4405, this.anInt4404, arg3, arg2, this);
					}
					return Static653.method3858(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4395, arg3, arg2, this);
				}
				if (Static339.aBoolean677) {
					return Static653.method3859(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4405, this.anInt4404, arg3, arg2, this, this.anInt4394, arg4);
				}
				return Static653.method3828(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4395, arg3, arg2, this, this.anInt4394, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4396;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4396 += arg1;
			if (this.anInt4394 == -256 && (this.anInt4398 & 0xFF) == 0) {
				if (Static339.aBoolean677) {
					arg1 = Static653.method3838(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4405, this.anInt4404, this.anInt4401, this.anInt4393, local5, arg2, this);
				} else {
					arg1 = Static653.method3845(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4395, this.anInt4402, local5, arg2, this);
				}
			} else if (Static339.aBoolean677) {
				arg1 = Static653.method3848(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4405, this.anInt4404, this.anInt4401, this.anInt4393, local5, arg2, this, this.anInt4394, arg4);
			} else {
				arg1 = Static653.method3849(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4395, this.anInt4402, local5, arg2, this, this.anInt4394, arg4);
			}
			this.anInt4396 -= arg1;
			if (this.anInt4396 != 0) {
				return arg1;
			}
		} while (!this.method3833());
		return arg3;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "()V")
	private void method3831() {
		this.anInt4395 = this.anInt4406;
		this.anInt4405 = Static653.method3846(this.anInt4406, this.anInt4397);
		this.anInt4404 = Static653.method3850(this.anInt4406, this.anInt4397);
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "()I")
	@Override
	public int method7804() {
		return this.anInt4406 == 0 && this.anInt4396 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "()Z")
	private boolean method3833() {
		@Pc(2) int local2 = this.anInt4406;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static653.method3846(local2, this.anInt4397);
			local8 = Static653.method3850(local2, this.anInt4397);
		}
		if (this.anInt4395 != local2 || this.anInt4405 != local10 || this.anInt4404 != local8) {
			if (this.anInt4395 < local2) {
				this.anInt4402 = 1;
				this.anInt4396 = local2 - this.anInt4395;
			} else if (this.anInt4395 > local2) {
				this.anInt4402 = -1;
				this.anInt4396 = this.anInt4395 - local2;
			} else {
				this.anInt4402 = 0;
			}
			if (this.anInt4405 < local10) {
				this.anInt4401 = 1;
				if (this.anInt4396 == 0 || this.anInt4396 > local10 - this.anInt4405) {
					this.anInt4396 = local10 - this.anInt4405;
				}
			} else if (this.anInt4405 > local10) {
				this.anInt4401 = -1;
				if (this.anInt4396 == 0 || this.anInt4396 > this.anInt4405 - local10) {
					this.anInt4396 = this.anInt4405 - local10;
				}
			} else {
				this.anInt4401 = 0;
			}
			if (this.anInt4404 < local8) {
				this.anInt4393 = 1;
				if (this.anInt4396 == 0 || this.anInt4396 > local8 - this.anInt4404) {
					this.anInt4396 = local8 - this.anInt4404;
				}
			} else if (this.anInt4404 > local8) {
				this.anInt4393 = -1;
				if (this.anInt4396 == 0 || this.anInt4396 > this.anInt4404 - local8) {
					this.anInt4396 = this.anInt4404 - local8;
				}
			} else {
				this.anInt4393 = 0;
			}
			return false;
		} else if (this.anInt4406 == Integer.MIN_VALUE) {
			this.anInt4406 = 0;
			this.anInt4395 = this.anInt4405 = this.anInt4404 = 0;
			this.method9043();
			return true;
		} else {
			this.method3831();
			return false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	public synchronized void method3836(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4398 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public synchronized void method3837() {
		this.anInt4394 = (this.anInt4394 ^ this.anInt4394 >> 31) + (this.anInt4394 >>> 31);
		this.anInt4394 = -this.anInt4394;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	private synchronized void method3839() {
		this.method3862(0, this.method3840());
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "()I")
	public synchronized int method3840() {
		return this.anInt4397 < 0 ? -1 : this.anInt4397;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	public synchronized void method3841(@OriginalArg(0) int arg0) {
		this.anInt4403 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public synchronized void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3844(arg0, arg1, this.method3840());
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public synchronized void method3843(@OriginalArg(0) int arg0) {
		this.method3862(this.method3851(), arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	public synchronized void method3844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3862(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static653.method3846(arg1, arg2);
		@Pc(14) int local14 = Static653.method3850(arg1, arg2);
		if (this.anInt4405 == local10 && this.anInt4404 == local14) {
			this.anInt4396 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4395;
		if (this.anInt4395 - arg1 > local31) {
			local31 = this.anInt4395 - arg1;
		}
		if (local10 - this.anInt4405 > local31) {
			local31 = local10 - this.anInt4405;
		}
		if (this.anInt4405 - local10 > local31) {
			local31 = this.anInt4405 - local10;
		}
		if (local14 - this.anInt4404 > local31) {
			local31 = local14 - this.anInt4404;
		}
		if (this.anInt4404 - local14 > local31) {
			local31 = this.anInt4404 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4396 = arg0;
		this.anInt4406 = arg1;
		this.anInt4397 = arg2;
		this.anInt4402 = (arg1 - this.anInt4395) / arg0;
		this.anInt4401 = (local10 - this.anInt4405) / arg0;
		this.anInt4393 = (local14 - this.anInt4404) / arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7801(@OriginalArg(0) int arg0) {
		if (this.anInt4396 > 0) {
			if (arg0 >= this.anInt4396) {
				if (this.anInt4406 == Integer.MIN_VALUE) {
					this.anInt4406 = 0;
					this.anInt4395 = this.anInt4405 = this.anInt4404 = 0;
					this.method9043();
					arg0 = this.anInt4396;
				}
				this.anInt4396 = 0;
				this.method3831();
			} else {
				this.anInt4395 += this.anInt4402 * arg0;
				this.anInt4405 += this.anInt4401 * arg0;
				this.anInt4404 += this.anInt4393 * arg0;
				this.anInt4396 -= arg0;
			}
		}
		@Pc(71) Class6_Sub37_Sub1 local71 = (Class6_Sub37_Sub1) super.aClass6_Sub37_6;
		@Pc(76) int local76 = this.anInt4400 << 8;
		@Pc(81) int local81 = this.anInt4399 << 8;
		@Pc(87) int local87 = local71.aByteArray111.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4403 = 0;
		}
		if (this.anInt4398 < 0) {
			if (this.anInt4394 <= 0) {
				this.method3861();
				this.method9043();
				return;
			}
			this.anInt4398 = 0;
		}
		if (this.anInt4398 >= local87) {
			if (this.anInt4394 >= 0) {
				this.method3861();
				this.method9043();
				return;
			}
			this.anInt4398 = local87 - 1;
		}
		this.anInt4398 += this.anInt4394 * arg0;
		if (this.anInt4403 >= 0) {
			if (this.anInt4403 > 0) {
				if (this.aBoolean314) {
					label125: {
						if (this.anInt4394 < 0) {
							if (this.anInt4398 >= local76) {
								return;
							}
							this.anInt4398 = local76 + local76 - this.anInt4398 - 1;
							this.anInt4394 = -this.anInt4394;
							if (--this.anInt4403 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4398 < local81) {
								return;
							}
							this.anInt4398 = local81 + local81 - this.anInt4398 - 1;
							this.anInt4394 = -this.anInt4394;
							if (--this.anInt4403 == 0) {
								break;
							}
							if (this.anInt4398 >= local76) {
								return;
							}
							this.anInt4398 = local76 + local76 - this.anInt4398 - 1;
							this.anInt4394 = -this.anInt4394;
						} while (--this.anInt4403 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4394 < 0) {
						if (this.anInt4398 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4398 - 1) / local91;
						if (local361 < this.anInt4403) {
							this.anInt4398 += local91 * local361;
							this.anInt4403 -= local361;
							return;
						}
						this.anInt4398 += local91 * this.anInt4403;
						this.anInt4403 = 0;
					} else if (this.anInt4398 >= local81) {
						local361 = (this.anInt4398 - local76) / local91;
						if (local361 < this.anInt4403) {
							this.anInt4398 -= local91 * local361;
							this.anInt4403 -= local361;
							return;
						}
						this.anInt4398 -= local91 * this.anInt4403;
						this.anInt4403 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4394 < 0) {
				if (this.anInt4398 < 0) {
					this.anInt4398 = -1;
					this.method3861();
					this.method9043();
					return;
				}
			} else if (this.anInt4398 >= local87) {
				this.anInt4398 = local87;
				this.method3861();
				this.method9043();
			}
		} else if (this.aBoolean314) {
			if (this.anInt4394 < 0) {
				if (this.anInt4398 >= local76) {
					return;
				}
				this.anInt4398 = local76 + local76 - this.anInt4398 - 1;
				this.anInt4394 = -this.anInt4394;
			}
			while (this.anInt4398 >= local81) {
				this.anInt4398 = local81 + local81 - this.anInt4398 - 1;
				this.anInt4394 = -this.anInt4394;
				if (this.anInt4398 >= local76) {
					return;
				}
				this.anInt4398 = local76 + local76 - this.anInt4398 - 1;
				this.anInt4394 = -this.anInt4394;
			}
		} else if (this.anInt4394 < 0) {
			if (this.anInt4398 < local76) {
				this.anInt4398 = local81 - (local81 - 1 - this.anInt4398) % local91 - 1;
			}
		} else if (this.anInt4398 >= local81) {
			this.anInt4398 = local76 + (this.anInt4398 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()I")
	@Override
	public int method7802() {
		@Pc(6) int local6 = this.anInt4395 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4403 == 0) {
			local6 -= local6 * this.anInt4398 / (((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111.length << 8);
		} else if (this.anInt4403 >= 0) {
			local6 -= local6 * this.anInt4400 / ((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lclient!ca;")
	@Override
	public Class6_Sub3 method7800() {
		return null;
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "()I")
	public synchronized int method3851() {
		return this.anInt4406 == Integer.MIN_VALUE ? 0 : this.anInt4406;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7805(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4406 == 0 && this.anInt4396 == 0) {
			this.method7801(arg2);
			return;
		}
		@Pc(13) Class6_Sub37_Sub1 local13 = (Class6_Sub37_Sub1) super.aClass6_Sub37_6;
		@Pc(18) int local18 = this.anInt4400 << 8;
		@Pc(23) int local23 = this.anInt4399 << 8;
		@Pc(29) int local29 = local13.aByteArray111.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4403 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4398 < 0) {
			if (this.anInt4394 <= 0) {
				this.method3861();
				this.method9043();
				return;
			}
			this.anInt4398 = 0;
		}
		if (this.anInt4398 >= local29) {
			if (this.anInt4394 >= 0) {
				this.method3861();
				this.method9043();
				return;
			}
			this.anInt4398 = local29 - 1;
		}
		if (this.anInt4403 >= 0) {
			if (this.anInt4403 > 0) {
				if (this.aBoolean314) {
					label130: {
						if (this.anInt4394 < 0) {
							local40 = this.method3829(arg0, arg1, local18, local44, local13.aByteArray111[this.anInt4400]);
							if (this.anInt4398 >= local18) {
								return;
							}
							this.anInt4398 = local18 + local18 - this.anInt4398 - 1;
							this.anInt4394 = -this.anInt4394;
							if (--this.anInt4403 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3857(arg0, local40, local23, local44, local13.aByteArray111[this.anInt4399 - 1]);
							if (this.anInt4398 < local23) {
								return;
							}
							this.anInt4398 = local23 + local23 - this.anInt4398 - 1;
							this.anInt4394 = -this.anInt4394;
							if (--this.anInt4403 == 0) {
								break;
							}
							local40 = this.method3829(arg0, local40, local18, local44, local13.aByteArray111[this.anInt4400]);
							if (this.anInt4398 >= local18) {
								return;
							}
							this.anInt4398 = local18 + local18 - this.anInt4398 - 1;
							this.anInt4394 = -this.anInt4394;
						} while (--this.anInt4403 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4394 < 0) {
						while (true) {
							local40 = this.method3829(arg0, local40, local18, local44, local13.aByteArray111[this.anInt4399 - 1]);
							if (this.anInt4398 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4398 - 1) / local33;
							if (local416 >= this.anInt4403) {
								this.anInt4398 += local33 * this.anInt4403;
								this.anInt4403 = 0;
								break;
							}
							this.anInt4398 += local33 * local416;
							this.anInt4403 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3857(arg0, local40, local23, local44, local13.aByteArray111[this.anInt4400]);
							if (this.anInt4398 < local23) {
								return;
							}
							local416 = (this.anInt4398 - local18) / local33;
							if (local416 >= this.anInt4403) {
								this.anInt4398 -= local33 * this.anInt4403;
								this.anInt4403 = 0;
								break;
							}
							this.anInt4398 -= local33 * local416;
							this.anInt4403 -= local416;
						}
					}
				}
			}
			if (this.anInt4394 < 0) {
				this.method3829(arg0, local40, 0, local44, 0);
				if (this.anInt4398 < 0) {
					this.anInt4398 = -1;
					this.method3861();
					this.method9043();
					return;
				}
			} else {
				this.method3857(arg0, local40, local29, local44, 0);
				if (this.anInt4398 >= local29) {
					this.anInt4398 = local29;
					this.method3861();
					this.method9043();
				}
			}
		} else if (this.aBoolean314) {
			if (this.anInt4394 < 0) {
				local40 = this.method3829(arg0, arg1, local18, local44, local13.aByteArray111[this.anInt4400]);
				if (this.anInt4398 >= local18) {
					return;
				}
				this.anInt4398 = local18 + local18 - this.anInt4398 - 1;
				this.anInt4394 = -this.anInt4394;
			}
			while (true) {
				local40 = this.method3857(arg0, local40, local23, local44, local13.aByteArray111[this.anInt4399 - 1]);
				if (this.anInt4398 < local23) {
					return;
				}
				this.anInt4398 = local23 + local23 - this.anInt4398 - 1;
				this.anInt4394 = -this.anInt4394;
				local40 = this.method3829(arg0, local40, local18, local44, local13.aByteArray111[this.anInt4400]);
				if (this.anInt4398 >= local18) {
					return;
				}
				this.anInt4398 = local18 + local18 - this.anInt4398 - 1;
				this.anInt4394 = -this.anInt4394;
			}
		} else if (this.anInt4394 < 0) {
			while (true) {
				local40 = this.method3829(arg0, local40, local18, local44, local13.aByteArray111[this.anInt4399 - 1]);
				if (this.anInt4398 >= local18) {
					return;
				}
				this.anInt4398 = local23 - (local23 - 1 - this.anInt4398) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3857(arg0, local40, local23, local44, local13.aByteArray111[this.anInt4400]);
				if (this.anInt4398 < local23) {
					return;
				}
				this.anInt4398 = local18 + (this.anInt4398 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "()Z")
	public boolean method3853() {
		return this.anInt4396 != 0;
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V")
	public synchronized void method3856(@OriginalArg(0) int arg0) {
		this.method3862(arg0 << 6, this.method3840());
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "([IIIII)I")
	private int method3857(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4396 <= 0) {
				if (this.anInt4394 == 256 && (this.anInt4398 & 0xFF) == 0) {
					if (Static339.aBoolean677) {
						return Static653.method3832(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4405, this.anInt4404, arg3, arg2, this);
					}
					return Static653.method3854(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4395, arg3, arg2, this);
				}
				if (Static339.aBoolean677) {
					return Static653.method3835(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4405, this.anInt4404, arg3, arg2, this, this.anInt4394, arg4);
				}
				return Static653.method3855(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4395, arg3, arg2, this, this.anInt4394, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4396;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4396 += arg1;
			if (this.anInt4394 == 256 && (this.anInt4398 & 0xFF) == 0) {
				if (Static339.aBoolean677) {
					arg1 = Static653.method3847(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4405, this.anInt4404, this.anInt4401, this.anInt4393, local5, arg2, this);
				} else {
					arg1 = Static653.method3834(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4395, this.anInt4402, local5, arg2, this);
				}
			} else if (Static339.aBoolean677) {
				arg1 = Static653.method3830(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4405, this.anInt4404, this.anInt4401, this.anInt4393, local5, arg2, this, this.anInt4394, arg4);
			} else {
				arg1 = Static653.method3852(((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111, arg0, this.anInt4398, arg1, this.anInt4395, this.anInt4402, local5, arg2, this, this.anInt4394, arg4);
			}
			this.anInt4396 -= arg1;
			if (this.anInt4396 != 0) {
				return arg1;
			}
		} while (!this.method3833());
		return arg3;
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)V")
	public synchronized void method3860(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3839();
			this.method9043();
		} else if (this.anInt4405 == 0 && this.anInt4404 == 0) {
			this.anInt4396 = 0;
			this.anInt4406 = 0;
			this.anInt4395 = 0;
			this.method9043();
		} else {
			@Pc(31) int local31 = -this.anInt4395;
			if (this.anInt4395 > local31) {
				local31 = this.anInt4395;
			}
			if (-this.anInt4405 > local31) {
				local31 = -this.anInt4405;
			}
			if (this.anInt4405 > local31) {
				local31 = this.anInt4405;
			}
			if (-this.anInt4404 > local31) {
				local31 = -this.anInt4404;
			}
			if (this.anInt4404 > local31) {
				local31 = this.anInt4404;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4396 = arg0;
			this.anInt4406 = Integer.MIN_VALUE;
			this.anInt4402 = -this.anInt4395 / arg0;
			this.anInt4401 = -this.anInt4405 / arg0;
			this.anInt4393 = -this.anInt4404 / arg0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "()Lclient!ca;")
	@Override
	public Class6_Sub3 method7803() {
		return null;
	}

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "()V")
	private void method3861() {
		if (this.anInt4396 == 0) {
			return;
		}
		if (this.anInt4406 == Integer.MIN_VALUE) {
			this.anInt4406 = 0;
		}
		this.anInt4396 = 0;
		this.method3831();
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)V")
	private synchronized void method3862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4406 = arg0;
		this.anInt4397 = arg1;
		this.anInt4396 = 0;
		this.method3831();
	}

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "(I)V")
	public synchronized void method3863(@OriginalArg(0) int arg0) {
		if (this.anInt4394 < 0) {
			this.anInt4394 = -arg0;
		} else {
			this.anInt4394 = arg0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "()Z")
	public boolean method3864() {
		return this.anInt4398 < 0 || this.anInt4398 >= ((Class6_Sub37_Sub1) super.aClass6_Sub37_6).aByteArray111.length << 8;
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "()I")
	public synchronized int method3865() {
		return this.anInt4394 < 0 ? -this.anInt4394 : this.anInt4394;
	}
}
