import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class14_Sub5_Sub4 extends Class14_Sub5 {

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
	public int anInt8704;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
	public int anInt8706;

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
	public int anInt8708;

	@OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
	public int anInt8710;

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
	public int anInt8711;

	@OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
	private int anInt8712;

	@OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
	public int anInt8714;

	@OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
	private int anInt8715;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
	private final int anInt8709;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
	private final int anInt8707;

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "Z")
	private final boolean aBoolean623;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
	private int anInt8705;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
	private int anInt8702;

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
	private int anInt8713;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
	public int anInt8703;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!dga;III)V")
	public Class14_Sub5_Sub4(@OriginalArg(0) Class14_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass14_Sub14_6 = arg0;
		this.anInt8709 = arg0.anInt2151;
		this.anInt8707 = arg0.anInt2149;
		this.aBoolean623 = arg0.aBoolean178;
		this.anInt8705 = arg1;
		this.anInt8702 = arg2;
		this.anInt8713 = arg3;
		this.anInt8703 = 0;
		this.method7214();
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "()I")
	@Override
	public int method8689() {
		@Pc(6) int local6 = this.anInt8704 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt8715 == 0) {
			local6 -= local6 * this.anInt8703 / (((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35.length << 8);
		} else if (this.anInt8715 >= 0) {
			local6 -= local6 * this.anInt8709 / ((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
	public synchronized void method7183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method7216(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static684.method7195(arg1, arg2);
		@Pc(14) int local14 = Static684.method7209(arg1, arg2);
		if (this.anInt8714 == local10 && this.anInt8710 == local14) {
			this.anInt8712 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt8704;
		if (this.anInt8704 - arg1 > local31) {
			local31 = this.anInt8704 - arg1;
		}
		if (local10 - this.anInt8714 > local31) {
			local31 = local10 - this.anInt8714;
		}
		if (this.anInt8714 - local10 > local31) {
			local31 = this.anInt8714 - local10;
		}
		if (local14 - this.anInt8710 > local31) {
			local31 = local14 - this.anInt8710;
		}
		if (this.anInt8710 - local14 > local31) {
			local31 = this.anInt8710 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt8712 = arg0;
		this.anInt8702 = arg1;
		this.anInt8713 = arg2;
		this.anInt8711 = (arg1 - this.anInt8704) / arg0;
		this.anInt8708 = (local10 - this.anInt8714) / arg0;
		this.anInt8706 = (local14 - this.anInt8710) / arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([IIIII)I")
	private int method7185(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt8712 <= 0) {
				if (this.anInt8705 == 256 && (this.anInt8703 & 0xFF) == 0) {
					if (Static40.aBoolean129) {
						return Static684.method7202(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8714, this.anInt8710, arg3, arg2, this);
					}
					return Static684.method7197(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8704, arg3, arg2, this);
				}
				if (Static40.aBoolean129) {
					return Static684.method7190(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8714, this.anInt8710, arg3, arg2, this, this.anInt8705, arg4);
				}
				return Static684.method7215(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8704, arg3, arg2, this, this.anInt8705, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt8712;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt8712 += arg1;
			if (this.anInt8705 == 256 && (this.anInt8703 & 0xFF) == 0) {
				if (Static40.aBoolean129) {
					arg1 = Static684.method7182(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8714, this.anInt8710, this.anInt8708, this.anInt8706, local5, arg2, this);
				} else {
					arg1 = Static684.method7194(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8704, this.anInt8711, local5, arg2, this);
				}
			} else if (Static40.aBoolean129) {
				arg1 = Static684.method7187(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8714, this.anInt8710, this.anInt8708, this.anInt8706, local5, arg2, this, this.anInt8705, arg4);
			} else {
				arg1 = Static684.method7181(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8704, this.anInt8711, local5, arg2, this, this.anInt8705, arg4);
			}
			this.anInt8712 -= arg1;
			if (this.anInt8712 != 0) {
				return arg1;
			}
		} while (!this.method7211());
		return arg3;
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "()I")
	public synchronized int method7186() {
		return this.anInt8713 < 0 ? -1 : this.anInt8713;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public synchronized void method7188(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method7200();
			this.method9315();
		} else if (this.anInt8714 == 0 && this.anInt8710 == 0) {
			this.anInt8712 = 0;
			this.anInt8702 = 0;
			this.anInt8704 = 0;
			this.method9315();
		} else {
			@Pc(31) int local31 = -this.anInt8704;
			if (this.anInt8704 > local31) {
				local31 = this.anInt8704;
			}
			if (-this.anInt8714 > local31) {
				local31 = -this.anInt8714;
			}
			if (this.anInt8714 > local31) {
				local31 = this.anInt8714;
			}
			if (-this.anInt8710 > local31) {
				local31 = -this.anInt8710;
			}
			if (this.anInt8710 > local31) {
				local31 = this.anInt8710;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt8712 = arg0;
			this.anInt8702 = Integer.MIN_VALUE;
			this.anInt8711 = -this.anInt8704 / arg0;
			this.anInt8708 = -this.anInt8714 / arg0;
			this.anInt8706 = -this.anInt8710 / arg0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	public synchronized void method7189(@OriginalArg(0) int arg0) {
		this.method7216(arg0 << 6, this.method7186());
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "()Lclient!sd;")
	@Override
	public Class14_Sub5 method8692() {
		return null;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
	public synchronized void method7191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method7183(arg0, arg1, this.method7186());
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
	public synchronized void method7192(@OriginalArg(0) int arg0) {
		this.anInt8715 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8688(@OriginalArg(0) int arg0) {
		if (this.anInt8712 > 0) {
			if (arg0 >= this.anInt8712) {
				if (this.anInt8702 == Integer.MIN_VALUE) {
					this.anInt8702 = 0;
					this.anInt8704 = this.anInt8714 = this.anInt8710 = 0;
					this.method9315();
					arg0 = this.anInt8712;
				}
				this.anInt8712 = 0;
				this.method7214();
			} else {
				this.anInt8704 += this.anInt8711 * arg0;
				this.anInt8714 += this.anInt8708 * arg0;
				this.anInt8710 += this.anInt8706 * arg0;
				this.anInt8712 -= arg0;
			}
		}
		@Pc(71) Class14_Sub14_Sub1 local71 = (Class14_Sub14_Sub1) super.aClass14_Sub14_6;
		@Pc(76) int local76 = this.anInt8709 << 8;
		@Pc(81) int local81 = this.anInt8707 << 8;
		@Pc(87) int local87 = local71.aByteArray35.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt8715 = 0;
		}
		if (this.anInt8703 < 0) {
			if (this.anInt8705 <= 0) {
				this.method7212();
				this.method9315();
				return;
			}
			this.anInt8703 = 0;
		}
		if (this.anInt8703 >= local87) {
			if (this.anInt8705 >= 0) {
				this.method7212();
				this.method9315();
				return;
			}
			this.anInt8703 = local87 - 1;
		}
		this.anInt8703 += this.anInt8705 * arg0;
		if (this.anInt8715 >= 0) {
			if (this.anInt8715 > 0) {
				if (this.aBoolean623) {
					label125: {
						if (this.anInt8705 < 0) {
							if (this.anInt8703 >= local76) {
								return;
							}
							this.anInt8703 = local76 + local76 - this.anInt8703 - 1;
							this.anInt8705 = -this.anInt8705;
							if (--this.anInt8715 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt8703 < local81) {
								return;
							}
							this.anInt8703 = local81 + local81 - this.anInt8703 - 1;
							this.anInt8705 = -this.anInt8705;
							if (--this.anInt8715 == 0) {
								break;
							}
							if (this.anInt8703 >= local76) {
								return;
							}
							this.anInt8703 = local76 + local76 - this.anInt8703 - 1;
							this.anInt8705 = -this.anInt8705;
						} while (--this.anInt8715 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt8705 < 0) {
						if (this.anInt8703 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt8703 - 1) / local91;
						if (local361 < this.anInt8715) {
							this.anInt8703 += local91 * local361;
							this.anInt8715 -= local361;
							return;
						}
						this.anInt8703 += local91 * this.anInt8715;
						this.anInt8715 = 0;
					} else if (this.anInt8703 >= local81) {
						local361 = (this.anInt8703 - local76) / local91;
						if (local361 < this.anInt8715) {
							this.anInt8703 -= local91 * local361;
							this.anInt8715 -= local361;
							return;
						}
						this.anInt8703 -= local91 * this.anInt8715;
						this.anInt8715 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt8705 < 0) {
				if (this.anInt8703 < 0) {
					this.anInt8703 = -1;
					this.method7212();
					this.method9315();
					return;
				}
			} else if (this.anInt8703 >= local87) {
				this.anInt8703 = local87;
				this.method7212();
				this.method9315();
			}
		} else if (this.aBoolean623) {
			if (this.anInt8705 < 0) {
				if (this.anInt8703 >= local76) {
					return;
				}
				this.anInt8703 = local76 + local76 - this.anInt8703 - 1;
				this.anInt8705 = -this.anInt8705;
			}
			while (this.anInt8703 >= local81) {
				this.anInt8703 = local81 + local81 - this.anInt8703 - 1;
				this.anInt8705 = -this.anInt8705;
				if (this.anInt8703 >= local76) {
					return;
				}
				this.anInt8703 = local76 + local76 - this.anInt8703 - 1;
				this.anInt8705 = -this.anInt8705;
			}
		} else if (this.anInt8705 < 0) {
			if (this.anInt8703 < local76) {
				this.anInt8703 = local81 - (local81 - 1 - this.anInt8703) % local91 - 1;
			}
		} else if (this.anInt8703 >= local81) {
			this.anInt8703 = local76 + (this.anInt8703 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public synchronized void method7196() {
		this.anInt8705 = (this.anInt8705 ^ this.anInt8705 >> 31) + (this.anInt8705 >>> 31);
		this.anInt8705 = -this.anInt8705;
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
	public synchronized void method7198(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt8703 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V")
	private synchronized void method7200() {
		this.method7216(0, this.method7186());
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "()Lclient!sd;")
	@Override
	public Class14_Sub5 method8691() {
		return null;
	}

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
	public synchronized void method7203(@OriginalArg(0) int arg0) {
		this.method7216(this.method7218(), arg0);
	}

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "()Z")
	public boolean method7204() {
		return this.anInt8703 < 0 || this.anInt8703 >= ((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35.length << 8;
	}

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "()Z")
	public boolean method7207() {
		return this.anInt8712 != 0;
	}

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "()I")
	public synchronized int method7208() {
		return this.anInt8705 < 0 ? -this.anInt8705 : this.anInt8705;
	}

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)V")
	public synchronized void method7210(@OriginalArg(0) int arg0) {
		if (this.anInt8705 < 0) {
			this.anInt8705 = -arg0;
		} else {
			this.anInt8705 = arg0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "()Z")
	private boolean method7211() {
		@Pc(2) int local2 = this.anInt8702;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static684.method7195(local2, this.anInt8713);
			local8 = Static684.method7209(local2, this.anInt8713);
		}
		if (this.anInt8704 != local2 || this.anInt8714 != local10 || this.anInt8710 != local8) {
			if (this.anInt8704 < local2) {
				this.anInt8711 = 1;
				this.anInt8712 = local2 - this.anInt8704;
			} else if (this.anInt8704 > local2) {
				this.anInt8711 = -1;
				this.anInt8712 = this.anInt8704 - local2;
			} else {
				this.anInt8711 = 0;
			}
			if (this.anInt8714 < local10) {
				this.anInt8708 = 1;
				if (this.anInt8712 == 0 || this.anInt8712 > local10 - this.anInt8714) {
					this.anInt8712 = local10 - this.anInt8714;
				}
			} else if (this.anInt8714 > local10) {
				this.anInt8708 = -1;
				if (this.anInt8712 == 0 || this.anInt8712 > this.anInt8714 - local10) {
					this.anInt8712 = this.anInt8714 - local10;
				}
			} else {
				this.anInt8708 = 0;
			}
			if (this.anInt8710 < local8) {
				this.anInt8706 = 1;
				if (this.anInt8712 == 0 || this.anInt8712 > local8 - this.anInt8710) {
					this.anInt8712 = local8 - this.anInt8710;
				}
			} else if (this.anInt8710 > local8) {
				this.anInt8706 = -1;
				if (this.anInt8712 == 0 || this.anInt8712 > this.anInt8710 - local8) {
					this.anInt8712 = this.anInt8710 - local8;
				}
			} else {
				this.anInt8706 = 0;
			}
			return false;
		} else if (this.anInt8702 == Integer.MIN_VALUE) {
			this.anInt8702 = 0;
			this.anInt8704 = this.anInt8714 = this.anInt8710 = 0;
			this.method9315();
			return true;
		} else {
			this.method7214();
			return false;
		}
	}

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "()V")
	private void method7212() {
		if (this.anInt8712 == 0) {
			return;
		}
		if (this.anInt8702 == Integer.MIN_VALUE) {
			this.anInt8702 = 0;
		}
		this.anInt8712 = 0;
		this.method7214();
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8693(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8702 == 0 && this.anInt8712 == 0) {
			this.method8688(arg2);
			return;
		}
		@Pc(13) Class14_Sub14_Sub1 local13 = (Class14_Sub14_Sub1) super.aClass14_Sub14_6;
		@Pc(18) int local18 = this.anInt8709 << 8;
		@Pc(23) int local23 = this.anInt8707 << 8;
		@Pc(29) int local29 = local13.aByteArray35.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt8715 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt8703 < 0) {
			if (this.anInt8705 <= 0) {
				this.method7212();
				this.method9315();
				return;
			}
			this.anInt8703 = 0;
		}
		if (this.anInt8703 >= local29) {
			if (this.anInt8705 >= 0) {
				this.method7212();
				this.method9315();
				return;
			}
			this.anInt8703 = local29 - 1;
		}
		if (this.anInt8715 >= 0) {
			if (this.anInt8715 > 0) {
				if (this.aBoolean623) {
					label130: {
						if (this.anInt8705 < 0) {
							local40 = this.method7219(arg0, arg1, local18, local44, local13.aByteArray35[this.anInt8709]);
							if (this.anInt8703 >= local18) {
								return;
							}
							this.anInt8703 = local18 + local18 - this.anInt8703 - 1;
							this.anInt8705 = -this.anInt8705;
							if (--this.anInt8715 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method7185(arg0, local40, local23, local44, local13.aByteArray35[this.anInt8707 - 1]);
							if (this.anInt8703 < local23) {
								return;
							}
							this.anInt8703 = local23 + local23 - this.anInt8703 - 1;
							this.anInt8705 = -this.anInt8705;
							if (--this.anInt8715 == 0) {
								break;
							}
							local40 = this.method7219(arg0, local40, local18, local44, local13.aByteArray35[this.anInt8709]);
							if (this.anInt8703 >= local18) {
								return;
							}
							this.anInt8703 = local18 + local18 - this.anInt8703 - 1;
							this.anInt8705 = -this.anInt8705;
						} while (--this.anInt8715 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt8705 < 0) {
						while (true) {
							local40 = this.method7219(arg0, local40, local18, local44, local13.aByteArray35[this.anInt8707 - 1]);
							if (this.anInt8703 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt8703 - 1) / local33;
							if (local416 >= this.anInt8715) {
								this.anInt8703 += local33 * this.anInt8715;
								this.anInt8715 = 0;
								break;
							}
							this.anInt8703 += local33 * local416;
							this.anInt8715 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method7185(arg0, local40, local23, local44, local13.aByteArray35[this.anInt8709]);
							if (this.anInt8703 < local23) {
								return;
							}
							local416 = (this.anInt8703 - local18) / local33;
							if (local416 >= this.anInt8715) {
								this.anInt8703 -= local33 * this.anInt8715;
								this.anInt8715 = 0;
								break;
							}
							this.anInt8703 -= local33 * local416;
							this.anInt8715 -= local416;
						}
					}
				}
			}
			if (this.anInt8705 < 0) {
				this.method7219(arg0, local40, 0, local44, 0);
				if (this.anInt8703 < 0) {
					this.anInt8703 = -1;
					this.method7212();
					this.method9315();
					return;
				}
			} else {
				this.method7185(arg0, local40, local29, local44, 0);
				if (this.anInt8703 >= local29) {
					this.anInt8703 = local29;
					this.method7212();
					this.method9315();
				}
			}
		} else if (this.aBoolean623) {
			if (this.anInt8705 < 0) {
				local40 = this.method7219(arg0, arg1, local18, local44, local13.aByteArray35[this.anInt8709]);
				if (this.anInt8703 >= local18) {
					return;
				}
				this.anInt8703 = local18 + local18 - this.anInt8703 - 1;
				this.anInt8705 = -this.anInt8705;
			}
			while (true) {
				local40 = this.method7185(arg0, local40, local23, local44, local13.aByteArray35[this.anInt8707 - 1]);
				if (this.anInt8703 < local23) {
					return;
				}
				this.anInt8703 = local23 + local23 - this.anInt8703 - 1;
				this.anInt8705 = -this.anInt8705;
				local40 = this.method7219(arg0, local40, local18, local44, local13.aByteArray35[this.anInt8709]);
				if (this.anInt8703 >= local18) {
					return;
				}
				this.anInt8703 = local18 + local18 - this.anInt8703 - 1;
				this.anInt8705 = -this.anInt8705;
			}
		} else if (this.anInt8705 < 0) {
			while (true) {
				local40 = this.method7219(arg0, local40, local18, local44, local13.aByteArray35[this.anInt8707 - 1]);
				if (this.anInt8703 >= local18) {
					return;
				}
				this.anInt8703 = local23 - (local23 - 1 - this.anInt8703) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method7185(arg0, local40, local23, local44, local13.aByteArray35[this.anInt8709]);
				if (this.anInt8703 < local23) {
					return;
				}
				this.anInt8703 = local18 + (this.anInt8703 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "()V")
	private void method7214() {
		this.anInt8704 = this.anInt8702;
		this.anInt8714 = Static684.method7195(this.anInt8702, this.anInt8713);
		this.anInt8710 = Static684.method7209(this.anInt8702, this.anInt8713);
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(II)V")
	private synchronized void method7216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8702 = arg0;
		this.anInt8713 = arg1;
		this.anInt8712 = 0;
		this.method7214();
	}

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "()I")
	public synchronized int method7218() {
		return this.anInt8702 == Integer.MIN_VALUE ? 0 : this.anInt8702;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "([IIIII)I")
	private int method7219(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt8712 <= 0) {
				if (this.anInt8705 == -256 && (this.anInt8703 & 0xFF) == 0) {
					if (Static40.aBoolean129) {
						return Static684.method7199(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8714, this.anInt8710, arg3, arg2, this);
					}
					return Static684.method7206(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8704, arg3, arg2, this);
				}
				if (Static40.aBoolean129) {
					return Static684.method7217(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8714, this.anInt8710, arg3, arg2, this, this.anInt8705, arg4);
				}
				return Static684.method7180(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8704, arg3, arg2, this, this.anInt8705, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt8712;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt8712 += arg1;
			if (this.anInt8705 == -256 && (this.anInt8703 & 0xFF) == 0) {
				if (Static40.aBoolean129) {
					arg1 = Static684.method7184(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8714, this.anInt8710, this.anInt8708, this.anInt8706, local5, arg2, this);
				} else {
					arg1 = Static684.method7201(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8704, this.anInt8711, local5, arg2, this);
				}
			} else if (Static40.aBoolean129) {
				arg1 = Static684.method7193(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8714, this.anInt8710, this.anInt8708, this.anInt8706, local5, arg2, this, this.anInt8705, arg4);
			} else {
				arg1 = Static684.method7213(((Class14_Sub14_Sub1) super.aClass14_Sub14_6).aByteArray35, arg0, this.anInt8703, arg1, this.anInt8704, this.anInt8711, local5, arg2, this, this.anInt8705, arg4);
			}
			this.anInt8712 -= arg1;
			if (this.anInt8712 != 0) {
				return arg1;
			}
		} while (!this.method7211());
		return arg3;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "()I")
	@Override
	public int method8687() {
		return this.anInt8702 == 0 && this.anInt8712 == 0 ? 0 : 1;
	}
}
