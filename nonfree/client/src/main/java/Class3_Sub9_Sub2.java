import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class3_Sub9_Sub2 extends Class3_Sub9 {

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
	public int anInt4433;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
	public int anInt4435;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
	public int anInt4436;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
	public int anInt4437;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
	public int anInt4438;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
	public int anInt4441;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
	private int anInt4443;

	@OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
	private int anInt4446;

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
	private final int anInt4442;

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
	private final int anInt4444;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "Z")
	private final boolean aBoolean345;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	private int anInt4439;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	private int anInt4434;

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
	private int anInt4445;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
	public int anInt4440;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!rea;III)V")
	public Class3_Sub9_Sub2(@OriginalArg(0) Class3_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub12_6 = arg0;
		this.anInt4442 = arg0.anInt8566;
		this.anInt4444 = arg0.anInt8564;
		this.aBoolean345 = arg0.aBoolean641;
		this.anInt4439 = arg1;
		this.anInt4434 = arg2;
		this.anInt4445 = arg3;
		this.anInt4440 = 0;
		this.method3742();
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "()Z")
	private boolean method3723() {
		@Pc(2) int local2 = this.anInt4434;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static684.method3745(local2, this.anInt4445);
			local8 = Static684.method3735(local2, this.anInt4445);
		}
		if (this.anInt4438 != local2 || this.anInt4435 != local10 || this.anInt4433 != local8) {
			if (this.anInt4438 < local2) {
				this.anInt4441 = 1;
				this.anInt4443 = local2 - this.anInt4438;
			} else if (this.anInt4438 > local2) {
				this.anInt4441 = -1;
				this.anInt4443 = this.anInt4438 - local2;
			} else {
				this.anInt4441 = 0;
			}
			if (this.anInt4435 < local10) {
				this.anInt4437 = 1;
				if (this.anInt4443 == 0 || this.anInt4443 > local10 - this.anInt4435) {
					this.anInt4443 = local10 - this.anInt4435;
				}
			} else if (this.anInt4435 > local10) {
				this.anInt4437 = -1;
				if (this.anInt4443 == 0 || this.anInt4443 > this.anInt4435 - local10) {
					this.anInt4443 = this.anInt4435 - local10;
				}
			} else {
				this.anInt4437 = 0;
			}
			if (this.anInt4433 < local8) {
				this.anInt4436 = 1;
				if (this.anInt4443 == 0 || this.anInt4443 > local8 - this.anInt4433) {
					this.anInt4443 = local8 - this.anInt4433;
				}
			} else if (this.anInt4433 > local8) {
				this.anInt4436 = -1;
				if (this.anInt4443 == 0 || this.anInt4443 > this.anInt4433 - local8) {
					this.anInt4443 = this.anInt4433 - local8;
				}
			} else {
				this.anInt4436 = 0;
			}
			return false;
		} else if (this.anInt4434 == Integer.MIN_VALUE) {
			this.anInt4434 = 0;
			this.anInt4438 = this.anInt4435 = this.anInt4433 = 0;
			this.method8770();
			return true;
		} else {
			this.method3742();
			return false;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6701(@OriginalArg(0) int arg0) {
		if (this.anInt4443 > 0) {
			if (arg0 >= this.anInt4443) {
				if (this.anInt4434 == Integer.MIN_VALUE) {
					this.anInt4434 = 0;
					this.anInt4438 = this.anInt4435 = this.anInt4433 = 0;
					this.method8770();
					arg0 = this.anInt4443;
				}
				this.anInt4443 = 0;
				this.method3742();
			} else {
				this.anInt4438 += this.anInt4441 * arg0;
				this.anInt4435 += this.anInt4437 * arg0;
				this.anInt4433 += this.anInt4436 * arg0;
				this.anInt4443 -= arg0;
			}
		}
		@Pc(71) Class3_Sub12_Sub1 local71 = (Class3_Sub12_Sub1) super.aClass3_Sub12_6;
		@Pc(76) int local76 = this.anInt4442 << 8;
		@Pc(81) int local81 = this.anInt4444 << 8;
		@Pc(87) int local87 = local71.aByteArray94.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4446 = 0;
		}
		if (this.anInt4440 < 0) {
			if (this.anInt4439 <= 0) {
				this.method3732();
				this.method8770();
				return;
			}
			this.anInt4440 = 0;
		}
		if (this.anInt4440 >= local87) {
			if (this.anInt4439 >= 0) {
				this.method3732();
				this.method8770();
				return;
			}
			this.anInt4440 = local87 - 1;
		}
		this.anInt4440 += this.anInt4439 * arg0;
		if (this.anInt4446 >= 0) {
			if (this.anInt4446 > 0) {
				if (this.aBoolean345) {
					label125: {
						if (this.anInt4439 < 0) {
							if (this.anInt4440 >= local76) {
								return;
							}
							this.anInt4440 = local76 + local76 - this.anInt4440 - 1;
							this.anInt4439 = -this.anInt4439;
							if (--this.anInt4446 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4440 < local81) {
								return;
							}
							this.anInt4440 = local81 + local81 - this.anInt4440 - 1;
							this.anInt4439 = -this.anInt4439;
							if (--this.anInt4446 == 0) {
								break;
							}
							if (this.anInt4440 >= local76) {
								return;
							}
							this.anInt4440 = local76 + local76 - this.anInt4440 - 1;
							this.anInt4439 = -this.anInt4439;
						} while (--this.anInt4446 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4439 < 0) {
						if (this.anInt4440 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4440 - 1) / local91;
						if (local361 < this.anInt4446) {
							this.anInt4440 += local91 * local361;
							this.anInt4446 -= local361;
							return;
						}
						this.anInt4440 += local91 * this.anInt4446;
						this.anInt4446 = 0;
					} else if (this.anInt4440 >= local81) {
						local361 = (this.anInt4440 - local76) / local91;
						if (local361 < this.anInt4446) {
							this.anInt4440 -= local91 * local361;
							this.anInt4446 -= local361;
							return;
						}
						this.anInt4440 -= local91 * this.anInt4446;
						this.anInt4446 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4439 < 0) {
				if (this.anInt4440 < 0) {
					this.anInt4440 = -1;
					this.method3732();
					this.method8770();
					return;
				}
			} else if (this.anInt4440 >= local87) {
				this.anInt4440 = local87;
				this.method3732();
				this.method8770();
			}
		} else if (this.aBoolean345) {
			if (this.anInt4439 < 0) {
				if (this.anInt4440 >= local76) {
					return;
				}
				this.anInt4440 = local76 + local76 - this.anInt4440 - 1;
				this.anInt4439 = -this.anInt4439;
			}
			while (this.anInt4440 >= local81) {
				this.anInt4440 = local81 + local81 - this.anInt4440 - 1;
				this.anInt4439 = -this.anInt4439;
				if (this.anInt4440 >= local76) {
					return;
				}
				this.anInt4440 = local76 + local76 - this.anInt4440 - 1;
				this.anInt4439 = -this.anInt4439;
			}
		} else if (this.anInt4439 < 0) {
			if (this.anInt4440 < local76) {
				this.anInt4440 = local81 - (local81 - 1 - this.anInt4440) % local91 - 1;
			}
		} else if (this.anInt4440 >= local81) {
			this.anInt4440 = local76 + (this.anInt4440 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "()I")
	@Override
	public int method6698() {
		@Pc(6) int local6 = this.anInt4438 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4446 == 0) {
			local6 -= local6 * this.anInt4440 / (((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94.length << 8);
		} else if (this.anInt4446 >= 0) {
			local6 -= local6 * this.anInt4442 / ((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "()Lclient!ri;")
	@Override
	public Class3_Sub9 method6696() {
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
	public synchronized void method3728(@OriginalArg(0) int arg0) {
		this.method3731(arg0 << 6, this.method3752());
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	public synchronized void method3730(@OriginalArg(0) int arg0) {
		this.anInt4446 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)V")
	private synchronized void method3731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4434 = arg0;
		this.anInt4445 = arg1;
		this.anInt4443 = 0;
		this.method3742();
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "()V")
	private void method3732() {
		if (this.anInt4443 == 0) {
			return;
		}
		if (this.anInt4434 == Integer.MIN_VALUE) {
			this.anInt4434 = 0;
		}
		this.anInt4443 = 0;
		this.method3742();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	public synchronized void method3733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3731(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static684.method3745(arg1, arg2);
		@Pc(14) int local14 = Static684.method3735(arg1, arg2);
		if (this.anInt4435 == local10 && this.anInt4433 == local14) {
			this.anInt4443 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4438;
		if (this.anInt4438 - arg1 > local31) {
			local31 = this.anInt4438 - arg1;
		}
		if (local10 - this.anInt4435 > local31) {
			local31 = local10 - this.anInt4435;
		}
		if (this.anInt4435 - local10 > local31) {
			local31 = this.anInt4435 - local10;
		}
		if (local14 - this.anInt4433 > local31) {
			local31 = local14 - this.anInt4433;
		}
		if (this.anInt4433 - local14 > local31) {
			local31 = this.anInt4433 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4443 = arg0;
		this.anInt4434 = arg1;
		this.anInt4445 = arg2;
		this.anInt4441 = (arg1 - this.anInt4438) / arg0;
		this.anInt4437 = (local10 - this.anInt4435) / arg0;
		this.anInt4436 = (local14 - this.anInt4433) / arg0;
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V")
	public synchronized void method3739(@OriginalArg(0) int arg0) {
		this.method3731(this.method3754(), arg0);
	}

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)V")
	private synchronized void method3741() {
		this.method3731(0, this.method3752());
	}

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "()V")
	private void method3742() {
		this.anInt4438 = this.anInt4434;
		this.anInt4435 = Static684.method3745(this.anInt4434, this.anInt4445);
		this.anInt4433 = Static684.method3735(this.anInt4434, this.anInt4445);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([IIIII)I")
	private int method3743(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4443 <= 0) {
				if (this.anInt4439 == 256 && (this.anInt4440 & 0xFF) == 0) {
					if (Static293.aBoolean421) {
						return Static684.method3725(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4435, this.anInt4433, arg3, arg2, this);
					}
					return Static684.method3736(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4438, arg3, arg2, this);
				}
				if (Static293.aBoolean421) {
					return Static684.method3738(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4435, this.anInt4433, arg3, arg2, this, this.anInt4439, arg4);
				}
				return Static684.method3722(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4438, arg3, arg2, this, this.anInt4439, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4443;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4443 += arg1;
			if (this.anInt4439 == 256 && (this.anInt4440 & 0xFF) == 0) {
				if (Static293.aBoolean421) {
					arg1 = Static684.method3734(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4435, this.anInt4433, this.anInt4437, this.anInt4436, local5, arg2, this);
				} else {
					arg1 = Static684.method3724(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4438, this.anInt4441, local5, arg2, this);
				}
			} else if (Static293.aBoolean421) {
				arg1 = Static684.method3740(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4435, this.anInt4433, this.anInt4437, this.anInt4436, local5, arg2, this, this.anInt4439, arg4);
			} else {
				arg1 = Static684.method3726(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4438, this.anInt4441, local5, arg2, this, this.anInt4439, arg4);
			}
			this.anInt4443 -= arg1;
			if (this.anInt4443 != 0) {
				return arg1;
			}
		} while (!this.method3723());
		return arg3;
	}

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "(I)V")
	public synchronized void method3744(@OriginalArg(0) int arg0) {
		if (this.anInt4439 < 0) {
			this.anInt4439 = -arg0;
		} else {
			this.anInt4439 = arg0;
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6702(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4434 == 0 && this.anInt4443 == 0) {
			this.method6701(arg2);
			return;
		}
		@Pc(13) Class3_Sub12_Sub1 local13 = (Class3_Sub12_Sub1) super.aClass3_Sub12_6;
		@Pc(18) int local18 = this.anInt4442 << 8;
		@Pc(23) int local23 = this.anInt4444 << 8;
		@Pc(29) int local29 = local13.aByteArray94.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4446 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4440 < 0) {
			if (this.anInt4439 <= 0) {
				this.method3732();
				this.method8770();
				return;
			}
			this.anInt4440 = 0;
		}
		if (this.anInt4440 >= local29) {
			if (this.anInt4439 >= 0) {
				this.method3732();
				this.method8770();
				return;
			}
			this.anInt4440 = local29 - 1;
		}
		if (this.anInt4446 >= 0) {
			if (this.anInt4446 > 0) {
				if (this.aBoolean345) {
					label130: {
						if (this.anInt4439 < 0) {
							local40 = this.method3761(arg0, arg1, local18, local44, local13.aByteArray94[this.anInt4442]);
							if (this.anInt4440 >= local18) {
								return;
							}
							this.anInt4440 = local18 + local18 - this.anInt4440 - 1;
							this.anInt4439 = -this.anInt4439;
							if (--this.anInt4446 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3743(arg0, local40, local23, local44, local13.aByteArray94[this.anInt4444 - 1]);
							if (this.anInt4440 < local23) {
								return;
							}
							this.anInt4440 = local23 + local23 - this.anInt4440 - 1;
							this.anInt4439 = -this.anInt4439;
							if (--this.anInt4446 == 0) {
								break;
							}
							local40 = this.method3761(arg0, local40, local18, local44, local13.aByteArray94[this.anInt4442]);
							if (this.anInt4440 >= local18) {
								return;
							}
							this.anInt4440 = local18 + local18 - this.anInt4440 - 1;
							this.anInt4439 = -this.anInt4439;
						} while (--this.anInt4446 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4439 < 0) {
						while (true) {
							local40 = this.method3761(arg0, local40, local18, local44, local13.aByteArray94[this.anInt4444 - 1]);
							if (this.anInt4440 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4440 - 1) / local33;
							if (local416 >= this.anInt4446) {
								this.anInt4440 += local33 * this.anInt4446;
								this.anInt4446 = 0;
								break;
							}
							this.anInt4440 += local33 * local416;
							this.anInt4446 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3743(arg0, local40, local23, local44, local13.aByteArray94[this.anInt4442]);
							if (this.anInt4440 < local23) {
								return;
							}
							local416 = (this.anInt4440 - local18) / local33;
							if (local416 >= this.anInt4446) {
								this.anInt4440 -= local33 * this.anInt4446;
								this.anInt4446 = 0;
								break;
							}
							this.anInt4440 -= local33 * local416;
							this.anInt4446 -= local416;
						}
					}
				}
			}
			if (this.anInt4439 < 0) {
				this.method3761(arg0, local40, 0, local44, 0);
				if (this.anInt4440 < 0) {
					this.anInt4440 = -1;
					this.method3732();
					this.method8770();
					return;
				}
			} else {
				this.method3743(arg0, local40, local29, local44, 0);
				if (this.anInt4440 >= local29) {
					this.anInt4440 = local29;
					this.method3732();
					this.method8770();
				}
			}
		} else if (this.aBoolean345) {
			if (this.anInt4439 < 0) {
				local40 = this.method3761(arg0, arg1, local18, local44, local13.aByteArray94[this.anInt4442]);
				if (this.anInt4440 >= local18) {
					return;
				}
				this.anInt4440 = local18 + local18 - this.anInt4440 - 1;
				this.anInt4439 = -this.anInt4439;
			}
			while (true) {
				local40 = this.method3743(arg0, local40, local23, local44, local13.aByteArray94[this.anInt4444 - 1]);
				if (this.anInt4440 < local23) {
					return;
				}
				this.anInt4440 = local23 + local23 - this.anInt4440 - 1;
				this.anInt4439 = -this.anInt4439;
				local40 = this.method3761(arg0, local40, local18, local44, local13.aByteArray94[this.anInt4442]);
				if (this.anInt4440 >= local18) {
					return;
				}
				this.anInt4440 = local18 + local18 - this.anInt4440 - 1;
				this.anInt4439 = -this.anInt4439;
			}
		} else if (this.anInt4439 < 0) {
			while (true) {
				local40 = this.method3761(arg0, local40, local18, local44, local13.aByteArray94[this.anInt4444 - 1]);
				if (this.anInt4440 >= local18) {
					return;
				}
				this.anInt4440 = local23 - (local23 - 1 - this.anInt4440) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3743(arg0, local40, local23, local44, local13.aByteArray94[this.anInt4442]);
				if (this.anInt4440 < local23) {
					return;
				}
				this.anInt4440 = local18 + (this.anInt4440 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "()Z")
	public boolean method3746() {
		return this.anInt4440 < 0 || this.anInt4440 >= ((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94.length << 8;
	}

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "(I)V")
	public synchronized void method3749(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4440 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
	public synchronized void method3750() {
		this.anInt4439 = (this.anInt4439 ^ this.anInt4439 >> 31) + (this.anInt4439 >>> 31);
		this.anInt4439 = -this.anInt4439;
	}

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "()I")
	public synchronized int method3751() {
		return this.anInt4439 < 0 ? -this.anInt4439 : this.anInt4439;
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "()Lclient!ri;")
	@Override
	public Class3_Sub9 method6700() {
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "()I")
	public synchronized int method3752() {
		return this.anInt4445 < 0 ? -1 : this.anInt4445;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "()I")
	@Override
	public int method6699() {
		return this.anInt4434 == 0 && this.anInt4443 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(II)V")
	public synchronized void method3753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3733(arg0, arg1, this.method3752());
	}

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "()I")
	public synchronized int method3754() {
		return this.anInt4434 == Integer.MIN_VALUE ? 0 : this.anInt4434;
	}

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "()Z")
	public boolean method3755() {
		return this.anInt4443 != 0;
	}

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "(I)V")
	public synchronized void method3757(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3741();
			this.method8770();
		} else if (this.anInt4435 == 0 && this.anInt4433 == 0) {
			this.anInt4443 = 0;
			this.anInt4434 = 0;
			this.anInt4438 = 0;
			this.method8770();
		} else {
			@Pc(31) int local31 = -this.anInt4438;
			if (this.anInt4438 > local31) {
				local31 = this.anInt4438;
			}
			if (-this.anInt4435 > local31) {
				local31 = -this.anInt4435;
			}
			if (this.anInt4435 > local31) {
				local31 = this.anInt4435;
			}
			if (-this.anInt4433 > local31) {
				local31 = -this.anInt4433;
			}
			if (this.anInt4433 > local31) {
				local31 = this.anInt4433;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4443 = arg0;
			this.anInt4434 = Integer.MIN_VALUE;
			this.anInt4441 = -this.anInt4438 / arg0;
			this.anInt4437 = -this.anInt4435 / arg0;
			this.anInt4436 = -this.anInt4433 / arg0;
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "([IIIII)I")
	private int method3761(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4443 <= 0) {
				if (this.anInt4439 == -256 && (this.anInt4440 & 0xFF) == 0) {
					if (Static293.aBoolean421) {
						return Static684.method3737(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4435, this.anInt4433, arg3, arg2, this);
					}
					return Static684.method3748(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4438, arg3, arg2, this);
				}
				if (Static293.aBoolean421) {
					return Static684.method3759(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4435, this.anInt4433, arg3, arg2, this, this.anInt4439, arg4);
				}
				return Static684.method3760(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4438, arg3, arg2, this, this.anInt4439, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4443;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4443 += arg1;
			if (this.anInt4439 == -256 && (this.anInt4440 & 0xFF) == 0) {
				if (Static293.aBoolean421) {
					arg1 = Static684.method3758(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4435, this.anInt4433, this.anInt4437, this.anInt4436, local5, arg2, this);
				} else {
					arg1 = Static684.method3729(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4438, this.anInt4441, local5, arg2, this);
				}
			} else if (Static293.aBoolean421) {
				arg1 = Static684.method3747(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4435, this.anInt4433, this.anInt4437, this.anInt4436, local5, arg2, this, this.anInt4439, arg4);
			} else {
				arg1 = Static684.method3756(((Class3_Sub12_Sub1) super.aClass3_Sub12_6).aByteArray94, arg0, this.anInt4440, arg1, this.anInt4438, this.anInt4441, local5, arg2, this, this.anInt4439, arg4);
			}
			this.anInt4443 -= arg1;
			if (this.anInt4443 != 0) {
				return arg1;
			}
		} while (!this.method3723());
		return arg3;
	}
}
