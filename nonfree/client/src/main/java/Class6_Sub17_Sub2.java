import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class6_Sub17_Sub2 extends Class6_Sub17 {

	@OriginalMember(owner = "client!hba", name = "r", descriptor = "I")
	public int anInt4250;

	@OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
	public int anInt4251;

	@OriginalMember(owner = "client!hba", name = "A", descriptor = "I")
	private int anInt4253;

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
	public int anInt4254;

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "I")
	public int anInt4256;

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
	public int anInt4258;

	@OriginalMember(owner = "client!hba", name = "q", descriptor = "I")
	public int anInt4259;

	@OriginalMember(owner = "client!hba", name = "w", descriptor = "I")
	private int anInt4261;

	@OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
	private final int anInt4252;

	@OriginalMember(owner = "client!hba", name = "x", descriptor = "I")
	private final int anInt4248;

	@OriginalMember(owner = "client!hba", name = "p", descriptor = "Z")
	private final boolean aBoolean338;

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "I")
	private int anInt4257;

	@OriginalMember(owner = "client!hba", name = "v", descriptor = "I")
	private int anInt4260;

	@OriginalMember(owner = "client!hba", name = "u", descriptor = "I")
	private int anInt4255;

	@OriginalMember(owner = "client!hba", name = "z", descriptor = "I")
	public int anInt4249;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!vfa;III)V")
	public Class6_Sub17_Sub2(@OriginalArg(0) Class6_Sub54_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub54_6 = arg0;
		this.anInt4252 = arg0.anInt9979;
		this.anInt4248 = arg0.anInt9980;
		this.aBoolean338 = arg0.aBoolean735;
		this.anInt4257 = arg1;
		this.anInt4260 = arg2;
		this.anInt4255 = arg3;
		this.anInt4249 = 0;
		this.method3907();
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
	public synchronized void method3902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3904(arg0, arg1, this.method3921());
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "([IIIII)I")
	private int method3903(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4261 <= 0) {
				if (this.anInt4257 == 256 && (this.anInt4249 & 0xFF) == 0) {
					if (Static30.aBoolean32) {
						return Static693.method3919(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4259, this.anInt4254, arg3, arg2, this);
					}
					return Static693.method3932(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4250, arg3, arg2, this);
				}
				if (Static30.aBoolean32) {
					return Static693.method3939(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4259, this.anInt4254, arg3, arg2, this, this.anInt4257, arg4);
				}
				return Static693.method3914(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4250, arg3, arg2, this, this.anInt4257, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4261;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4261 += arg1;
			if (this.anInt4257 == 256 && (this.anInt4249 & 0xFF) == 0) {
				if (Static30.aBoolean32) {
					arg1 = Static693.method3935(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4259, this.anInt4254, this.anInt4258, this.anInt4251, local5, arg2, this);
				} else {
					arg1 = Static693.method3918(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4250, this.anInt4256, local5, arg2, this);
				}
			} else if (Static30.aBoolean32) {
				arg1 = Static693.method3936(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4259, this.anInt4254, this.anInt4258, this.anInt4251, local5, arg2, this, this.anInt4257, arg4);
			} else {
				arg1 = Static693.method3922(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4250, this.anInt4256, local5, arg2, this, this.anInt4257, arg4);
			}
			this.anInt4261 -= arg1;
			if (this.anInt4261 != 0) {
				return arg1;
			}
		} while (!this.method3912());
		return arg3;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)V")
	public synchronized void method3904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3916(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static693.method3925(arg1, arg2);
		@Pc(14) int local14 = Static693.method3901(arg1, arg2);
		if (this.anInt4259 == local10 && this.anInt4254 == local14) {
			this.anInt4261 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4250;
		if (this.anInt4250 - arg1 > local31) {
			local31 = this.anInt4250 - arg1;
		}
		if (local10 - this.anInt4259 > local31) {
			local31 = local10 - this.anInt4259;
		}
		if (this.anInt4259 - local10 > local31) {
			local31 = this.anInt4259 - local10;
		}
		if (local14 - this.anInt4254 > local31) {
			local31 = local14 - this.anInt4254;
		}
		if (this.anInt4254 - local14 > local31) {
			local31 = this.anInt4254 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4261 = arg0;
		this.anInt4260 = arg1;
		this.anInt4255 = arg2;
		this.anInt4256 = (arg1 - this.anInt4250) / arg0;
		this.anInt4258 = (local10 - this.anInt4259) / arg0;
		this.anInt4251 = (local14 - this.anInt4254) / arg0;
	}

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "()V")
	private void method3905() {
		if (this.anInt4261 == 0) {
			return;
		}
		if (this.anInt4260 == Integer.MIN_VALUE) {
			this.anInt4260 = 0;
		}
		this.anInt4261 = 0;
		this.method3907();
	}

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "()V")
	private void method3907() {
		this.anInt4250 = this.anInt4260;
		this.anInt4259 = Static693.method3925(this.anInt4260, this.anInt4255);
		this.anInt4254 = Static693.method3901(this.anInt4260, this.anInt4255);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)V")
	public synchronized void method3908() {
		this.anInt4257 = (this.anInt4257 ^ this.anInt4257 >> 31) + (this.anInt4257 >>> 31);
		this.anInt4257 = -this.anInt4257;
	}

	@OriginalMember(owner = "client!hba", name = "j", descriptor = "()I")
	public synchronized int method3909() {
		return this.anInt4260 == Integer.MIN_VALUE ? 0 : this.anInt4260;
	}

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "()I")
	public synchronized int method3910() {
		return this.anInt4257 < 0 ? -this.anInt4257 : this.anInt4257;
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "([IIIII)I")
	private int method3911(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4261 <= 0) {
				if (this.anInt4257 == -256 && (this.anInt4249 & 0xFF) == 0) {
					if (Static30.aBoolean32) {
						return Static693.method3924(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4259, this.anInt4254, arg3, arg2, this);
					}
					return Static693.method3913(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4250, arg3, arg2, this);
				}
				if (Static30.aBoolean32) {
					return Static693.method3929(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4259, this.anInt4254, arg3, arg2, this, this.anInt4257, arg4);
				}
				return Static693.method3940(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4250, arg3, arg2, this, this.anInt4257, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4261;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4261 += arg1;
			if (this.anInt4257 == -256 && (this.anInt4249 & 0xFF) == 0) {
				if (Static30.aBoolean32) {
					arg1 = Static693.method3934(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4259, this.anInt4254, this.anInt4258, this.anInt4251, local5, arg2, this);
				} else {
					arg1 = Static693.method3915(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4250, this.anInt4256, local5, arg2, this);
				}
			} else if (Static30.aBoolean32) {
				arg1 = Static693.method3930(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4259, this.anInt4254, this.anInt4258, this.anInt4251, local5, arg2, this, this.anInt4257, arg4);
			} else {
				arg1 = Static693.method3906(((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107, arg0, this.anInt4249, arg1, this.anInt4250, this.anInt4256, local5, arg2, this, this.anInt4257, arg4);
			}
			this.anInt4261 -= arg1;
			if (this.anInt4261 != 0) {
				return arg1;
			}
		} while (!this.method3912());
		return arg3;
	}

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "()Z")
	private boolean method3912() {
		@Pc(2) int local2 = this.anInt4260;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static693.method3925(local2, this.anInt4255);
			local8 = Static693.method3901(local2, this.anInt4255);
		}
		if (this.anInt4250 != local2 || this.anInt4259 != local10 || this.anInt4254 != local8) {
			if (this.anInt4250 < local2) {
				this.anInt4256 = 1;
				this.anInt4261 = local2 - this.anInt4250;
			} else if (this.anInt4250 > local2) {
				this.anInt4256 = -1;
				this.anInt4261 = this.anInt4250 - local2;
			} else {
				this.anInt4256 = 0;
			}
			if (this.anInt4259 < local10) {
				this.anInt4258 = 1;
				if (this.anInt4261 == 0 || this.anInt4261 > local10 - this.anInt4259) {
					this.anInt4261 = local10 - this.anInt4259;
				}
			} else if (this.anInt4259 > local10) {
				this.anInt4258 = -1;
				if (this.anInt4261 == 0 || this.anInt4261 > this.anInt4259 - local10) {
					this.anInt4261 = this.anInt4259 - local10;
				}
			} else {
				this.anInt4258 = 0;
			}
			if (this.anInt4254 < local8) {
				this.anInt4251 = 1;
				if (this.anInt4261 == 0 || this.anInt4261 > local8 - this.anInt4254) {
					this.anInt4261 = local8 - this.anInt4254;
				}
			} else if (this.anInt4254 > local8) {
				this.anInt4251 = -1;
				if (this.anInt4261 == 0 || this.anInt4261 > this.anInt4254 - local8) {
					this.anInt4261 = this.anInt4254 - local8;
				}
			} else {
				this.anInt4251 = 0;
			}
			return false;
		} else if (this.anInt4260 == Integer.MIN_VALUE) {
			this.anInt4260 = 0;
			this.anInt4250 = this.anInt4259 = this.anInt4254 = 0;
			this.method9051();
			return true;
		} else {
			this.method3907();
			return false;
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)V")
	private synchronized void method3916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4260 = arg0;
		this.anInt4255 = arg1;
		this.anInt4261 = 0;
		this.method3907();
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
	public synchronized void method3917(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3926();
			this.method9051();
		} else if (this.anInt4259 == 0 && this.anInt4254 == 0) {
			this.anInt4261 = 0;
			this.anInt4260 = 0;
			this.anInt4250 = 0;
			this.method9051();
		} else {
			@Pc(31) int local31 = -this.anInt4250;
			if (this.anInt4250 > local31) {
				local31 = this.anInt4250;
			}
			if (-this.anInt4259 > local31) {
				local31 = -this.anInt4259;
			}
			if (this.anInt4259 > local31) {
				local31 = this.anInt4259;
			}
			if (-this.anInt4254 > local31) {
				local31 = -this.anInt4254;
			}
			if (this.anInt4254 > local31) {
				local31 = this.anInt4254;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4261 = arg0;
			this.anInt4260 = Integer.MIN_VALUE;
			this.anInt4256 = -this.anInt4250 / arg0;
			this.anInt4258 = -this.anInt4259 / arg0;
			this.anInt4251 = -this.anInt4254 / arg0;
		}
	}

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "()I")
	public synchronized int method3921() {
		return this.anInt4255 < 0 ? -1 : this.anInt4255;
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "()I")
	@Override
	public int method8141() {
		return this.anInt4260 == 0 && this.anInt4261 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "()Lclient!jn;")
	@Override
	public Class6_Sub17 method8143() {
		return null;
	}

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "(I)V")
	public synchronized void method3923(@OriginalArg(0) int arg0) {
		this.method3916(arg0 << 6, this.method3921());
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
	private synchronized void method3926() {
		this.method3916(0, this.method3921());
	}

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "(I)V")
	public synchronized void method3927(@OriginalArg(0) int arg0) {
		if (this.anInt4257 < 0) {
			this.anInt4257 = -arg0;
		} else {
			this.anInt4257 = arg0;
		}
	}

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "()Z")
	public boolean method3928() {
		return this.anInt4261 != 0;
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8139(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4260 == 0 && this.anInt4261 == 0) {
			this.method8144(arg2);
			return;
		}
		@Pc(13) Class6_Sub54_Sub1 local13 = (Class6_Sub54_Sub1) super.aClass6_Sub54_6;
		@Pc(18) int local18 = this.anInt4252 << 8;
		@Pc(23) int local23 = this.anInt4248 << 8;
		@Pc(29) int local29 = local13.aByteArray107.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4253 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4249 < 0) {
			if (this.anInt4257 <= 0) {
				this.method3905();
				this.method9051();
				return;
			}
			this.anInt4249 = 0;
		}
		if (this.anInt4249 >= local29) {
			if (this.anInt4257 >= 0) {
				this.method3905();
				this.method9051();
				return;
			}
			this.anInt4249 = local29 - 1;
		}
		if (this.anInt4253 >= 0) {
			if (this.anInt4253 > 0) {
				if (this.aBoolean338) {
					label130: {
						if (this.anInt4257 < 0) {
							local40 = this.method3911(arg0, arg1, local18, local44, local13.aByteArray107[this.anInt4252]);
							if (this.anInt4249 >= local18) {
								return;
							}
							this.anInt4249 = local18 + local18 - this.anInt4249 - 1;
							this.anInt4257 = -this.anInt4257;
							if (--this.anInt4253 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3903(arg0, local40, local23, local44, local13.aByteArray107[this.anInt4248 - 1]);
							if (this.anInt4249 < local23) {
								return;
							}
							this.anInt4249 = local23 + local23 - this.anInt4249 - 1;
							this.anInt4257 = -this.anInt4257;
							if (--this.anInt4253 == 0) {
								break;
							}
							local40 = this.method3911(arg0, local40, local18, local44, local13.aByteArray107[this.anInt4252]);
							if (this.anInt4249 >= local18) {
								return;
							}
							this.anInt4249 = local18 + local18 - this.anInt4249 - 1;
							this.anInt4257 = -this.anInt4257;
						} while (--this.anInt4253 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4257 < 0) {
						while (true) {
							local40 = this.method3911(arg0, local40, local18, local44, local13.aByteArray107[this.anInt4248 - 1]);
							if (this.anInt4249 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4249 - 1) / local33;
							if (local416 >= this.anInt4253) {
								this.anInt4249 += local33 * this.anInt4253;
								this.anInt4253 = 0;
								break;
							}
							this.anInt4249 += local33 * local416;
							this.anInt4253 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3903(arg0, local40, local23, local44, local13.aByteArray107[this.anInt4252]);
							if (this.anInt4249 < local23) {
								return;
							}
							local416 = (this.anInt4249 - local18) / local33;
							if (local416 >= this.anInt4253) {
								this.anInt4249 -= local33 * this.anInt4253;
								this.anInt4253 = 0;
								break;
							}
							this.anInt4249 -= local33 * local416;
							this.anInt4253 -= local416;
						}
					}
				}
			}
			if (this.anInt4257 < 0) {
				this.method3911(arg0, local40, 0, local44, 0);
				if (this.anInt4249 < 0) {
					this.anInt4249 = -1;
					this.method3905();
					this.method9051();
					return;
				}
			} else {
				this.method3903(arg0, local40, local29, local44, 0);
				if (this.anInt4249 >= local29) {
					this.anInt4249 = local29;
					this.method3905();
					this.method9051();
				}
			}
		} else if (this.aBoolean338) {
			if (this.anInt4257 < 0) {
				local40 = this.method3911(arg0, arg1, local18, local44, local13.aByteArray107[this.anInt4252]);
				if (this.anInt4249 >= local18) {
					return;
				}
				this.anInt4249 = local18 + local18 - this.anInt4249 - 1;
				this.anInt4257 = -this.anInt4257;
			}
			while (true) {
				local40 = this.method3903(arg0, local40, local23, local44, local13.aByteArray107[this.anInt4248 - 1]);
				if (this.anInt4249 < local23) {
					return;
				}
				this.anInt4249 = local23 + local23 - this.anInt4249 - 1;
				this.anInt4257 = -this.anInt4257;
				local40 = this.method3911(arg0, local40, local18, local44, local13.aByteArray107[this.anInt4252]);
				if (this.anInt4249 >= local18) {
					return;
				}
				this.anInt4249 = local18 + local18 - this.anInt4249 - 1;
				this.anInt4257 = -this.anInt4257;
			}
		} else if (this.anInt4257 < 0) {
			while (true) {
				local40 = this.method3911(arg0, local40, local18, local44, local13.aByteArray107[this.anInt4248 - 1]);
				if (this.anInt4249 >= local18) {
					return;
				}
				this.anInt4249 = local23 - (local23 - 1 - this.anInt4249) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3903(arg0, local40, local23, local44, local13.aByteArray107[this.anInt4252]);
				if (this.anInt4249 < local23) {
					return;
				}
				this.anInt4249 = local18 + (this.anInt4249 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "j", descriptor = "(I)V")
	public synchronized void method3931(@OriginalArg(0) int arg0) {
		this.method3916(this.method3909(), arg0);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "()Lclient!jn;")
	@Override
	public Class6_Sub17 method8140() {
		return null;
	}

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "(I)V")
	public synchronized void method3933(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4249 = arg0;
	}

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "(I)V")
	public synchronized void method3937(@OriginalArg(0) int arg0) {
		this.anInt4253 = arg0;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8144(@OriginalArg(0) int arg0) {
		if (this.anInt4261 > 0) {
			if (arg0 >= this.anInt4261) {
				if (this.anInt4260 == Integer.MIN_VALUE) {
					this.anInt4260 = 0;
					this.anInt4250 = this.anInt4259 = this.anInt4254 = 0;
					this.method9051();
					arg0 = this.anInt4261;
				}
				this.anInt4261 = 0;
				this.method3907();
			} else {
				this.anInt4250 += this.anInt4256 * arg0;
				this.anInt4259 += this.anInt4258 * arg0;
				this.anInt4254 += this.anInt4251 * arg0;
				this.anInt4261 -= arg0;
			}
		}
		@Pc(71) Class6_Sub54_Sub1 local71 = (Class6_Sub54_Sub1) super.aClass6_Sub54_6;
		@Pc(76) int local76 = this.anInt4252 << 8;
		@Pc(81) int local81 = this.anInt4248 << 8;
		@Pc(87) int local87 = local71.aByteArray107.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4253 = 0;
		}
		if (this.anInt4249 < 0) {
			if (this.anInt4257 <= 0) {
				this.method3905();
				this.method9051();
				return;
			}
			this.anInt4249 = 0;
		}
		if (this.anInt4249 >= local87) {
			if (this.anInt4257 >= 0) {
				this.method3905();
				this.method9051();
				return;
			}
			this.anInt4249 = local87 - 1;
		}
		this.anInt4249 += this.anInt4257 * arg0;
		if (this.anInt4253 >= 0) {
			if (this.anInt4253 > 0) {
				if (this.aBoolean338) {
					label125: {
						if (this.anInt4257 < 0) {
							if (this.anInt4249 >= local76) {
								return;
							}
							this.anInt4249 = local76 + local76 - this.anInt4249 - 1;
							this.anInt4257 = -this.anInt4257;
							if (--this.anInt4253 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4249 < local81) {
								return;
							}
							this.anInt4249 = local81 + local81 - this.anInt4249 - 1;
							this.anInt4257 = -this.anInt4257;
							if (--this.anInt4253 == 0) {
								break;
							}
							if (this.anInt4249 >= local76) {
								return;
							}
							this.anInt4249 = local76 + local76 - this.anInt4249 - 1;
							this.anInt4257 = -this.anInt4257;
						} while (--this.anInt4253 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4257 < 0) {
						if (this.anInt4249 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4249 - 1) / local91;
						if (local361 < this.anInt4253) {
							this.anInt4249 += local91 * local361;
							this.anInt4253 -= local361;
							return;
						}
						this.anInt4249 += local91 * this.anInt4253;
						this.anInt4253 = 0;
					} else if (this.anInt4249 >= local81) {
						local361 = (this.anInt4249 - local76) / local91;
						if (local361 < this.anInt4253) {
							this.anInt4249 -= local91 * local361;
							this.anInt4253 -= local361;
							return;
						}
						this.anInt4249 -= local91 * this.anInt4253;
						this.anInt4253 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4257 < 0) {
				if (this.anInt4249 < 0) {
					this.anInt4249 = -1;
					this.method3905();
					this.method9051();
					return;
				}
			} else if (this.anInt4249 >= local87) {
				this.anInt4249 = local87;
				this.method3905();
				this.method9051();
			}
		} else if (this.aBoolean338) {
			if (this.anInt4257 < 0) {
				if (this.anInt4249 >= local76) {
					return;
				}
				this.anInt4249 = local76 + local76 - this.anInt4249 - 1;
				this.anInt4257 = -this.anInt4257;
			}
			while (this.anInt4249 >= local81) {
				this.anInt4249 = local81 + local81 - this.anInt4249 - 1;
				this.anInt4257 = -this.anInt4257;
				if (this.anInt4249 >= local76) {
					return;
				}
				this.anInt4249 = local76 + local76 - this.anInt4249 - 1;
				this.anInt4257 = -this.anInt4257;
			}
		} else if (this.anInt4257 < 0) {
			if (this.anInt4249 < local76) {
				this.anInt4249 = local81 - (local81 - 1 - this.anInt4249) % local91 - 1;
			}
		} else if (this.anInt4249 >= local81) {
			this.anInt4249 = local76 + (this.anInt4249 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "()I")
	@Override
	public int method8142() {
		@Pc(6) int local6 = this.anInt4250 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4253 == 0) {
			local6 -= local6 * this.anInt4249 / (((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107.length << 8);
		} else if (this.anInt4253 >= 0) {
			local6 -= local6 * this.anInt4252 / ((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "()Z")
	public boolean method3938() {
		return this.anInt4249 < 0 || this.anInt4249 >= ((Class6_Sub54_Sub1) super.aClass6_Sub54_6).aByteArray107.length << 8;
	}
}
