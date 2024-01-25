import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
	public int anInt9016;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
	public int anInt9017;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
	public int anInt9019;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
	public int anInt9020;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	private int anInt9022;

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "I")
	private int anInt9024;

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
	public int anInt9025;

	@OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
	public int anInt9029;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
	private final int anInt9023;

	@OriginalMember(owner = "client!sv", name = "A", descriptor = "I")
	private final int anInt9027;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "Z")
	private final boolean aBoolean658;

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
	private int anInt9018;

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
	private int anInt9026;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
	private int anInt9021;

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
	public int anInt9028;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!so;III)V")
	public Class5_Sub1_Sub4(@OriginalArg(0) Class5_Sub37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub37_6 = arg0;
		this.anInt9023 = arg0.anInt8936;
		this.anInt9027 = arg0.anInt8935;
		this.aBoolean658 = arg0.aBoolean655;
		this.anInt9018 = arg1;
		this.anInt9026 = arg2;
		this.anInt9021 = arg3;
		this.anInt9028 = 0;
		this.method7798();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
	public synchronized void method7759() {
		this.anInt9018 = (this.anInt9018 ^ this.anInt9018 >> 31) + (this.anInt9018 >>> 31);
		this.anInt9018 = -this.anInt9018;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
	public synchronized void method7760(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method7793();
			this.method9047();
		} else if (this.anInt9016 == 0 && this.anInt9025 == 0) {
			this.anInt9024 = 0;
			this.anInt9026 = 0;
			this.anInt9020 = 0;
			this.method9047();
		} else {
			@Pc(31) int local31 = -this.anInt9020;
			if (this.anInt9020 > local31) {
				local31 = this.anInt9020;
			}
			if (-this.anInt9016 > local31) {
				local31 = -this.anInt9016;
			}
			if (this.anInt9016 > local31) {
				local31 = this.anInt9016;
			}
			if (-this.anInt9025 > local31) {
				local31 = -this.anInt9025;
			}
			if (this.anInt9025 > local31) {
				local31 = this.anInt9025;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt9024 = arg0;
			this.anInt9026 = Integer.MIN_VALUE;
			this.anInt9017 = -this.anInt9020 / arg0;
			this.anInt9029 = -this.anInt9016 / arg0;
			this.anInt9019 = -this.anInt9025 / arg0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "()Lclient!aca;")
	@Override
	public Class5_Sub1 method8285() {
		return null;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "()Lclient!aca;")
	@Override
	public Class5_Sub1 method8282() {
		return null;
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(II)V")
	private synchronized void method7764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9026 = arg0;
		this.anInt9021 = arg1;
		this.anInt9024 = 0;
		this.method7798();
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V")
	public synchronized void method7765(@OriginalArg(0) int arg0) {
		this.anInt9022 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(I)V")
	public synchronized void method7766(@OriginalArg(0) int arg0) {
		this.method7764(arg0 << 6, this.method7791());
	}

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "()Z")
	public boolean method7768() {
		return this.anInt9024 != 0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([IIIII)I")
	private int method7769(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt9024 <= 0) {
				if (this.anInt9018 == 256 && (this.anInt9028 & 0xFF) == 0) {
					if (Static21.aBoolean12) {
						return Static654.method7781(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9016, this.anInt9025, arg3, arg2, this);
					}
					return Static654.method7762(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9020, arg3, arg2, this);
				}
				if (Static21.aBoolean12) {
					return Static654.method7786(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9016, this.anInt9025, arg3, arg2, this, this.anInt9018, arg4);
				}
				return Static654.method7797(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9020, arg3, arg2, this, this.anInt9018, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt9024;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt9024 += arg1;
			if (this.anInt9018 == 256 && (this.anInt9028 & 0xFF) == 0) {
				if (Static21.aBoolean12) {
					arg1 = Static654.method7771(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9016, this.anInt9025, this.anInt9029, this.anInt9019, local5, arg2, this);
				} else {
					arg1 = Static654.method7775(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9020, this.anInt9017, local5, arg2, this);
				}
			} else if (Static21.aBoolean12) {
				arg1 = Static654.method7785(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9016, this.anInt9025, this.anInt9029, this.anInt9019, local5, arg2, this, this.anInt9018, arg4);
			} else {
				arg1 = Static654.method7794(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9020, this.anInt9017, local5, arg2, this, this.anInt9018, arg4);
			}
			this.anInt9024 -= arg1;
			if (this.anInt9024 != 0) {
				return arg1;
			}
		} while (!this.method7782());
		return arg3;
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "()V")
	private void method7773() {
		if (this.anInt9024 == 0) {
			return;
		}
		if (this.anInt9026 == Integer.MIN_VALUE) {
			this.anInt9026 = 0;
		}
		this.anInt9024 = 0;
		this.method7798();
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "()I")
	public synchronized int method7774() {
		return this.anInt9018 < 0 ? -this.anInt9018 : this.anInt9018;
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "()I")
	public synchronized int method7776() {
		return this.anInt9026 == Integer.MIN_VALUE ? 0 : this.anInt9026;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "([IIIII)I")
	private int method7777(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt9024 <= 0) {
				if (this.anInt9018 == -256 && (this.anInt9028 & 0xFF) == 0) {
					if (Static21.aBoolean12) {
						return Static654.method7790(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9016, this.anInt9025, arg3, arg2, this);
					}
					return Static654.method7789(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9020, arg3, arg2, this);
				}
				if (Static21.aBoolean12) {
					return Static654.method7761(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9016, this.anInt9025, arg3, arg2, this, this.anInt9018, arg4);
				}
				return Static654.method7770(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9020, arg3, arg2, this, this.anInt9018, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt9024;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt9024 += arg1;
			if (this.anInt9018 == -256 && (this.anInt9028 & 0xFF) == 0) {
				if (Static21.aBoolean12) {
					arg1 = Static654.method7795(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9016, this.anInt9025, this.anInt9029, this.anInt9019, local5, arg2, this);
				} else {
					arg1 = Static654.method7772(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9020, this.anInt9017, local5, arg2, this);
				}
			} else if (Static21.aBoolean12) {
				arg1 = Static654.method7763(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9016, this.anInt9025, this.anInt9029, this.anInt9019, local5, arg2, this, this.anInt9018, arg4);
			} else {
				arg1 = Static654.method7792(((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94, arg0, this.anInt9028, arg1, this.anInt9020, this.anInt9017, local5, arg2, this, this.anInt9018, arg4);
			}
			this.anInt9024 -= arg1;
			if (this.anInt9024 != 0) {
				return arg1;
			}
		} while (!this.method7782());
		return arg3;
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)V")
	public synchronized void method7779(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt9028 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(II)V")
	public synchronized void method7780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method7787(arg0, arg1, this.method7791());
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "()I")
	@Override
	public int method8284() {
		return this.anInt9026 == 0 && this.anInt9024 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "()Z")
	private boolean method7782() {
		@Pc(2) int local2 = this.anInt9026;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static654.method7778(local2, this.anInt9021);
			local8 = Static654.method7767(local2, this.anInt9021);
		}
		if (this.anInt9020 != local2 || this.anInt9016 != local10 || this.anInt9025 != local8) {
			if (this.anInt9020 < local2) {
				this.anInt9017 = 1;
				this.anInt9024 = local2 - this.anInt9020;
			} else if (this.anInt9020 > local2) {
				this.anInt9017 = -1;
				this.anInt9024 = this.anInt9020 - local2;
			} else {
				this.anInt9017 = 0;
			}
			if (this.anInt9016 < local10) {
				this.anInt9029 = 1;
				if (this.anInt9024 == 0 || this.anInt9024 > local10 - this.anInt9016) {
					this.anInt9024 = local10 - this.anInt9016;
				}
			} else if (this.anInt9016 > local10) {
				this.anInt9029 = -1;
				if (this.anInt9024 == 0 || this.anInt9024 > this.anInt9016 - local10) {
					this.anInt9024 = this.anInt9016 - local10;
				}
			} else {
				this.anInt9029 = 0;
			}
			if (this.anInt9025 < local8) {
				this.anInt9019 = 1;
				if (this.anInt9024 == 0 || this.anInt9024 > local8 - this.anInt9025) {
					this.anInt9024 = local8 - this.anInt9025;
				}
			} else if (this.anInt9025 > local8) {
				this.anInt9019 = -1;
				if (this.anInt9024 == 0 || this.anInt9024 > this.anInt9025 - local8) {
					this.anInt9024 = this.anInt9025 - local8;
				}
			} else {
				this.anInt9019 = 0;
			}
			return false;
		} else if (this.anInt9026 == Integer.MIN_VALUE) {
			this.anInt9026 = 0;
			this.anInt9020 = this.anInt9016 = this.anInt9025 = 0;
			this.method9047();
			return true;
		} else {
			this.method7798();
			return false;
		}
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "(I)V")
	public synchronized void method7783(@OriginalArg(0) int arg0) {
		this.method7764(this.method7776(), arg0);
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "()I")
	@Override
	public int method8288() {
		@Pc(6) int local6 = this.anInt9020 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt9022 == 0) {
			local6 -= local6 * this.anInt9028 / (((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94.length << 8);
		} else if (this.anInt9022 >= 0) {
			local6 -= local6 * this.anInt9023 / ((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)V")
	public synchronized void method7787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method7764(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static654.method7778(arg1, arg2);
		@Pc(14) int local14 = Static654.method7767(arg1, arg2);
		if (this.anInt9016 == local10 && this.anInt9025 == local14) {
			this.anInt9024 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt9020;
		if (this.anInt9020 - arg1 > local31) {
			local31 = this.anInt9020 - arg1;
		}
		if (local10 - this.anInt9016 > local31) {
			local31 = local10 - this.anInt9016;
		}
		if (this.anInt9016 - local10 > local31) {
			local31 = this.anInt9016 - local10;
		}
		if (local14 - this.anInt9025 > local31) {
			local31 = local14 - this.anInt9025;
		}
		if (this.anInt9025 - local14 > local31) {
			local31 = this.anInt9025 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt9024 = arg0;
		this.anInt9026 = arg1;
		this.anInt9021 = arg2;
		this.anInt9017 = (arg1 - this.anInt9020) / arg0;
		this.anInt9029 = (local10 - this.anInt9016) / arg0;
		this.anInt9019 = (local14 - this.anInt9025) / arg0;
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "(I)V")
	public synchronized void method7788(@OriginalArg(0) int arg0) {
		if (this.anInt9018 < 0) {
			this.anInt9018 = -arg0;
		} else {
			this.anInt9018 = arg0;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8283(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9026 == 0 && this.anInt9024 == 0) {
			this.method8287(arg2);
			return;
		}
		@Pc(13) Class5_Sub37_Sub1 local13 = (Class5_Sub37_Sub1) super.aClass5_Sub37_6;
		@Pc(18) int local18 = this.anInt9023 << 8;
		@Pc(23) int local23 = this.anInt9027 << 8;
		@Pc(29) int local29 = local13.aByteArray94.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt9022 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt9028 < 0) {
			if (this.anInt9018 <= 0) {
				this.method7773();
				this.method9047();
				return;
			}
			this.anInt9028 = 0;
		}
		if (this.anInt9028 >= local29) {
			if (this.anInt9018 >= 0) {
				this.method7773();
				this.method9047();
				return;
			}
			this.anInt9028 = local29 - 1;
		}
		if (this.anInt9022 >= 0) {
			if (this.anInt9022 > 0) {
				if (this.aBoolean658) {
					label130: {
						if (this.anInt9018 < 0) {
							local40 = this.method7777(arg0, arg1, local18, local44, local13.aByteArray94[this.anInt9023]);
							if (this.anInt9028 >= local18) {
								return;
							}
							this.anInt9028 = local18 + local18 - this.anInt9028 - 1;
							this.anInt9018 = -this.anInt9018;
							if (--this.anInt9022 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method7769(arg0, local40, local23, local44, local13.aByteArray94[this.anInt9027 - 1]);
							if (this.anInt9028 < local23) {
								return;
							}
							this.anInt9028 = local23 + local23 - this.anInt9028 - 1;
							this.anInt9018 = -this.anInt9018;
							if (--this.anInt9022 == 0) {
								break;
							}
							local40 = this.method7777(arg0, local40, local18, local44, local13.aByteArray94[this.anInt9023]);
							if (this.anInt9028 >= local18) {
								return;
							}
							this.anInt9028 = local18 + local18 - this.anInt9028 - 1;
							this.anInt9018 = -this.anInt9018;
						} while (--this.anInt9022 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt9018 < 0) {
						while (true) {
							local40 = this.method7777(arg0, local40, local18, local44, local13.aByteArray94[this.anInt9027 - 1]);
							if (this.anInt9028 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt9028 - 1) / local33;
							if (local416 >= this.anInt9022) {
								this.anInt9028 += local33 * this.anInt9022;
								this.anInt9022 = 0;
								break;
							}
							this.anInt9028 += local33 * local416;
							this.anInt9022 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method7769(arg0, local40, local23, local44, local13.aByteArray94[this.anInt9023]);
							if (this.anInt9028 < local23) {
								return;
							}
							local416 = (this.anInt9028 - local18) / local33;
							if (local416 >= this.anInt9022) {
								this.anInt9028 -= local33 * this.anInt9022;
								this.anInt9022 = 0;
								break;
							}
							this.anInt9028 -= local33 * local416;
							this.anInt9022 -= local416;
						}
					}
				}
			}
			if (this.anInt9018 < 0) {
				this.method7777(arg0, local40, 0, local44, 0);
				if (this.anInt9028 < 0) {
					this.anInt9028 = -1;
					this.method7773();
					this.method9047();
					return;
				}
			} else {
				this.method7769(arg0, local40, local29, local44, 0);
				if (this.anInt9028 >= local29) {
					this.anInt9028 = local29;
					this.method7773();
					this.method9047();
				}
			}
		} else if (this.aBoolean658) {
			if (this.anInt9018 < 0) {
				local40 = this.method7777(arg0, arg1, local18, local44, local13.aByteArray94[this.anInt9023]);
				if (this.anInt9028 >= local18) {
					return;
				}
				this.anInt9028 = local18 + local18 - this.anInt9028 - 1;
				this.anInt9018 = -this.anInt9018;
			}
			while (true) {
				local40 = this.method7769(arg0, local40, local23, local44, local13.aByteArray94[this.anInt9027 - 1]);
				if (this.anInt9028 < local23) {
					return;
				}
				this.anInt9028 = local23 + local23 - this.anInt9028 - 1;
				this.anInt9018 = -this.anInt9018;
				local40 = this.method7777(arg0, local40, local18, local44, local13.aByteArray94[this.anInt9023]);
				if (this.anInt9028 >= local18) {
					return;
				}
				this.anInt9028 = local18 + local18 - this.anInt9028 - 1;
				this.anInt9018 = -this.anInt9018;
			}
		} else if (this.anInt9018 < 0) {
			while (true) {
				local40 = this.method7777(arg0, local40, local18, local44, local13.aByteArray94[this.anInt9027 - 1]);
				if (this.anInt9028 >= local18) {
					return;
				}
				this.anInt9028 = local23 - (local23 - 1 - this.anInt9028) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method7769(arg0, local40, local23, local44, local13.aByteArray94[this.anInt9023]);
				if (this.anInt9028 < local23) {
					return;
				}
				this.anInt9028 = local18 + (this.anInt9028 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "()I")
	public synchronized int method7791() {
		return this.anInt9021 < 0 ? -1 : this.anInt9021;
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "(I)V")
	private synchronized void method7793() {
		this.method7764(0, this.method7791());
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8287(@OriginalArg(0) int arg0) {
		if (this.anInt9024 > 0) {
			if (arg0 >= this.anInt9024) {
				if (this.anInt9026 == Integer.MIN_VALUE) {
					this.anInt9026 = 0;
					this.anInt9020 = this.anInt9016 = this.anInt9025 = 0;
					this.method9047();
					arg0 = this.anInt9024;
				}
				this.anInt9024 = 0;
				this.method7798();
			} else {
				this.anInt9020 += this.anInt9017 * arg0;
				this.anInt9016 += this.anInt9029 * arg0;
				this.anInt9025 += this.anInt9019 * arg0;
				this.anInt9024 -= arg0;
			}
		}
		@Pc(71) Class5_Sub37_Sub1 local71 = (Class5_Sub37_Sub1) super.aClass5_Sub37_6;
		@Pc(76) int local76 = this.anInt9023 << 8;
		@Pc(81) int local81 = this.anInt9027 << 8;
		@Pc(87) int local87 = local71.aByteArray94.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt9022 = 0;
		}
		if (this.anInt9028 < 0) {
			if (this.anInt9018 <= 0) {
				this.method7773();
				this.method9047();
				return;
			}
			this.anInt9028 = 0;
		}
		if (this.anInt9028 >= local87) {
			if (this.anInt9018 >= 0) {
				this.method7773();
				this.method9047();
				return;
			}
			this.anInt9028 = local87 - 1;
		}
		this.anInt9028 += this.anInt9018 * arg0;
		if (this.anInt9022 >= 0) {
			if (this.anInt9022 > 0) {
				if (this.aBoolean658) {
					label125: {
						if (this.anInt9018 < 0) {
							if (this.anInt9028 >= local76) {
								return;
							}
							this.anInt9028 = local76 + local76 - this.anInt9028 - 1;
							this.anInt9018 = -this.anInt9018;
							if (--this.anInt9022 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt9028 < local81) {
								return;
							}
							this.anInt9028 = local81 + local81 - this.anInt9028 - 1;
							this.anInt9018 = -this.anInt9018;
							if (--this.anInt9022 == 0) {
								break;
							}
							if (this.anInt9028 >= local76) {
								return;
							}
							this.anInt9028 = local76 + local76 - this.anInt9028 - 1;
							this.anInt9018 = -this.anInt9018;
						} while (--this.anInt9022 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt9018 < 0) {
						if (this.anInt9028 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt9028 - 1) / local91;
						if (local361 < this.anInt9022) {
							this.anInt9028 += local91 * local361;
							this.anInt9022 -= local361;
							return;
						}
						this.anInt9028 += local91 * this.anInt9022;
						this.anInt9022 = 0;
					} else if (this.anInt9028 >= local81) {
						local361 = (this.anInt9028 - local76) / local91;
						if (local361 < this.anInt9022) {
							this.anInt9028 -= local91 * local361;
							this.anInt9022 -= local361;
							return;
						}
						this.anInt9028 -= local91 * this.anInt9022;
						this.anInt9022 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt9018 < 0) {
				if (this.anInt9028 < 0) {
					this.anInt9028 = -1;
					this.method7773();
					this.method9047();
					return;
				}
			} else if (this.anInt9028 >= local87) {
				this.anInt9028 = local87;
				this.method7773();
				this.method9047();
			}
		} else if (this.aBoolean658) {
			if (this.anInt9018 < 0) {
				if (this.anInt9028 >= local76) {
					return;
				}
				this.anInt9028 = local76 + local76 - this.anInt9028 - 1;
				this.anInt9018 = -this.anInt9018;
			}
			while (this.anInt9028 >= local81) {
				this.anInt9028 = local81 + local81 - this.anInt9028 - 1;
				this.anInt9018 = -this.anInt9018;
				if (this.anInt9028 >= local76) {
					return;
				}
				this.anInt9028 = local76 + local76 - this.anInt9028 - 1;
				this.anInt9018 = -this.anInt9018;
			}
		} else if (this.anInt9018 < 0) {
			if (this.anInt9028 < local76) {
				this.anInt9028 = local81 - (local81 - 1 - this.anInt9028) % local91 - 1;
			}
		} else if (this.anInt9028 >= local81) {
			this.anInt9028 = local76 + (this.anInt9028 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "()Z")
	public boolean method7796() {
		return this.anInt9028 < 0 || this.anInt9028 >= ((Class5_Sub37_Sub1) super.aClass5_Sub37_6).aByteArray94.length << 8;
	}

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "()V")
	private void method7798() {
		this.anInt9020 = this.anInt9026;
		this.anInt9016 = Static654.method7778(this.anInt9026, this.anInt9021);
		this.anInt9025 = Static654.method7767(this.anInt9026, this.anInt9021);
	}
}
