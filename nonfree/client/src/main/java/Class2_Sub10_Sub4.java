import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class2_Sub10_Sub4 extends Class2_Sub10 {

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
	public int anInt4051;

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
	private int anInt4053;

	@OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
	public int anInt4055;

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
	private int anInt4056;

	@OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
	public int anInt4057;

	@OriginalMember(owner = "client!hw", name = "v", descriptor = "I")
	public int anInt4058;

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "I")
	public int anInt4059;

	@OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
	public int anInt4062;

	@OriginalMember(owner = "client!hw", name = "r", descriptor = "I")
	private final int anInt4054;

	@OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
	private final int anInt4064;

	@OriginalMember(owner = "client!hw", name = "B", descriptor = "Z")
	private final boolean aBoolean330;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
	private int anInt4052;

	@OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
	private int anInt4061;

	@OriginalMember(owner = "client!hw", name = "C", descriptor = "I")
	private int anInt4063;

	@OriginalMember(owner = "client!hw", name = "x", descriptor = "I")
	public int anInt4060;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!oaa;II)V")
	public Class2_Sub10_Sub4(@OriginalArg(0) Class2_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub7_5 = arg0;
		this.anInt4054 = arg0.anInt6607;
		this.anInt4064 = arg0.anInt6609;
		this.aBoolean330 = arg0.aBoolean517;
		this.anInt4052 = arg1;
		this.anInt4061 = arg2;
		this.anInt4063 = 8192;
		this.anInt4060 = 0;
		this.method3400();
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!oaa;III)V")
	public Class2_Sub10_Sub4(@OriginalArg(0) Class2_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub7_5 = arg0;
		this.anInt4054 = arg0.anInt6607;
		this.anInt4064 = arg0.anInt6609;
		this.aBoolean330 = arg0.aBoolean517;
		this.anInt4052 = arg1;
		this.anInt4061 = arg2;
		this.anInt4063 = arg3;
		this.anInt4060 = 0;
		this.method3400();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)V")
	public synchronized void method3372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3406(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static600.method3380(arg1, arg2);
		@Pc(14) int local14 = Static600.method3391(arg1, arg2);
		if (this.anInt4062 == local10 && this.anInt4057 == local14) {
			this.anInt4056 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4051;
		if (this.anInt4051 - arg1 > local31) {
			local31 = this.anInt4051 - arg1;
		}
		if (local10 - this.anInt4062 > local31) {
			local31 = local10 - this.anInt4062;
		}
		if (this.anInt4062 - local10 > local31) {
			local31 = this.anInt4062 - local10;
		}
		if (local14 - this.anInt4057 > local31) {
			local31 = local14 - this.anInt4057;
		}
		if (this.anInt4057 - local14 > local31) {
			local31 = this.anInt4057 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4056 = arg0;
		this.anInt4061 = arg1;
		this.anInt4063 = arg2;
		this.anInt4055 = (arg1 - this.anInt4051) / arg0;
		this.anInt4058 = (local10 - this.anInt4062) / arg0;
		this.anInt4059 = (local14 - this.anInt4057) / arg0;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "()Lclient!pn;")
	@Override
	public Class2_Sub10 method3364() {
		return null;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V")
	public synchronized void method3375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3372(arg0, arg1, this.method3376());
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "()I")
	public synchronized int method3376() {
		return this.anInt4063 < 0 ? -1 : this.anInt4063;
	}

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "()Z")
	public boolean method3378() {
		return this.anInt4060 < 0 || this.anInt4060 >= ((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68.length << 8;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
	private synchronized void method3379() {
		this.method3406(0, this.method3376());
	}

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "()I")
	public synchronized int method3382() {
		return this.anInt4052 < 0 ? -this.anInt4052 : this.anInt4052;
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
	public synchronized void method3383(@OriginalArg(0) int arg0) {
		if (this.anInt4052 < 0) {
			this.anInt4052 = -arg0;
		} else {
			this.anInt4052 = arg0;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "([IIIII)I")
	private int method3384(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4056 <= 0) {
				if (this.anInt4052 == -256 && (this.anInt4060 & 0xFF) == 0) {
					if (Static591.aBoolean732) {
						return Static600.method3402(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4062, this.anInt4057, arg3, arg2, this);
					}
					return Static600.method3394(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4051, arg3, arg2, this);
				}
				if (Static591.aBoolean732) {
					return Static600.method3401(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4062, this.anInt4057, arg3, arg2, this, this.anInt4052, arg4);
				}
				return Static600.method3369(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4051, arg3, arg2, this, this.anInt4052, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4056;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4056 += arg1;
			if (this.anInt4052 == -256 && (this.anInt4060 & 0xFF) == 0) {
				if (Static591.aBoolean732) {
					arg1 = Static600.method3393(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4062, this.anInt4057, this.anInt4058, this.anInt4059, local5, arg2, this);
				} else {
					arg1 = Static600.method3395(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4051, this.anInt4055, local5, arg2, this);
				}
			} else if (Static591.aBoolean732) {
				arg1 = Static600.method3368(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4062, this.anInt4057, this.anInt4058, this.anInt4059, local5, arg2, this, this.anInt4052, arg4);
			} else {
				arg1 = Static600.method3404(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4051, this.anInt4055, local5, arg2, this, this.anInt4052, arg4);
			}
			this.anInt4056 -= arg1;
			if (this.anInt4056 != 0) {
				return arg1;
			}
		} while (!this.method3390());
		return arg3;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
	public synchronized void method3385() {
		this.anInt4052 = (this.anInt4052 ^ this.anInt4052 >> 31) + (this.anInt4052 >>> 31);
		this.anInt4052 = -this.anInt4052;
	}

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "()V")
	private void method3386() {
		if (this.anInt4056 == 0) {
			return;
		}
		if (this.anInt4061 == Integer.MIN_VALUE) {
			this.anInt4061 = 0;
		}
		this.anInt4056 = 0;
		this.method3400();
	}

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "(I)V")
	public synchronized void method3387(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4060 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "()I")
	public synchronized int method3388() {
		return this.anInt4061 == Integer.MIN_VALUE ? 0 : this.anInt4061;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "([IIIII)I")
	private int method3389(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4056 <= 0) {
				if (this.anInt4052 == 256 && (this.anInt4060 & 0xFF) == 0) {
					if (Static591.aBoolean732) {
						return Static600.method3397(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4062, this.anInt4057, arg3, arg2, this);
					}
					return Static600.method3381(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4051, arg3, arg2, this);
				}
				if (Static591.aBoolean732) {
					return Static600.method3371(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4062, this.anInt4057, arg3, arg2, this, this.anInt4052, arg4);
				}
				return Static600.method3377(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4051, arg3, arg2, this, this.anInt4052, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4056;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4056 += arg1;
			if (this.anInt4052 == 256 && (this.anInt4060 & 0xFF) == 0) {
				if (Static591.aBoolean732) {
					arg1 = Static600.method3367(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4062, this.anInt4057, this.anInt4058, this.anInt4059, local5, arg2, this);
				} else {
					arg1 = Static600.method3370(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4051, this.anInt4055, local5, arg2, this);
				}
			} else if (Static591.aBoolean732) {
				arg1 = Static600.method3374(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4062, this.anInt4057, this.anInt4058, this.anInt4059, local5, arg2, this, this.anInt4052, arg4);
			} else {
				arg1 = Static600.method3396(((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68, arg0, this.anInt4060, arg1, this.anInt4051, this.anInt4055, local5, arg2, this, this.anInt4052, arg4);
			}
			this.anInt4056 -= arg1;
			if (this.anInt4056 != 0) {
				return arg1;
			}
		} while (!this.method3390());
		return arg3;
	}

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "()Z")
	private boolean method3390() {
		@Pc(2) int local2 = this.anInt4061;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static600.method3380(local2, this.anInt4063);
			local8 = Static600.method3391(local2, this.anInt4063);
		}
		if (this.anInt4051 != local2 || this.anInt4062 != local10 || this.anInt4057 != local8) {
			if (this.anInt4051 < local2) {
				this.anInt4055 = 1;
				this.anInt4056 = local2 - this.anInt4051;
			} else if (this.anInt4051 > local2) {
				this.anInt4055 = -1;
				this.anInt4056 = this.anInt4051 - local2;
			} else {
				this.anInt4055 = 0;
			}
			if (this.anInt4062 < local10) {
				this.anInt4058 = 1;
				if (this.anInt4056 == 0 || this.anInt4056 > local10 - this.anInt4062) {
					this.anInt4056 = local10 - this.anInt4062;
				}
			} else if (this.anInt4062 > local10) {
				this.anInt4058 = -1;
				if (this.anInt4056 == 0 || this.anInt4056 > this.anInt4062 - local10) {
					this.anInt4056 = this.anInt4062 - local10;
				}
			} else {
				this.anInt4058 = 0;
			}
			if (this.anInt4057 < local8) {
				this.anInt4059 = 1;
				if (this.anInt4056 == 0 || this.anInt4056 > local8 - this.anInt4057) {
					this.anInt4056 = local8 - this.anInt4057;
				}
			} else if (this.anInt4057 > local8) {
				this.anInt4059 = -1;
				if (this.anInt4056 == 0 || this.anInt4056 > this.anInt4057 - local8) {
					this.anInt4056 = this.anInt4057 - local8;
				}
			} else {
				this.anInt4059 = 0;
			}
			return false;
		} else if (this.anInt4061 == Integer.MIN_VALUE) {
			this.anInt4061 = 0;
			this.anInt4051 = this.anInt4062 = this.anInt4057 = 0;
			this.method7966();
			return true;
		} else {
			this.method3400();
			return false;
		}
	}

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "(I)V")
	public synchronized void method3392(@OriginalArg(0) int arg0) {
		this.method3406(arg0 << 6, this.method3376());
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "()Lclient!pn;")
	@Override
	public Class2_Sub10 method3360() {
		return null;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3363(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4061 == 0 && this.anInt4056 == 0) {
			this.method3361(arg2);
			return;
		}
		@Pc(13) Class2_Sub7_Sub1 local13 = (Class2_Sub7_Sub1) super.aClass2_Sub7_5;
		@Pc(18) int local18 = this.anInt4054 << 8;
		@Pc(23) int local23 = this.anInt4064 << 8;
		@Pc(29) int local29 = local13.aByteArray68.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4053 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4060 < 0) {
			if (this.anInt4052 <= 0) {
				this.method3386();
				this.method7966();
				return;
			}
			this.anInt4060 = 0;
		}
		if (this.anInt4060 >= local29) {
			if (this.anInt4052 >= 0) {
				this.method3386();
				this.method7966();
				return;
			}
			this.anInt4060 = local29 - 1;
		}
		if (this.anInt4053 >= 0) {
			if (this.anInt4053 > 0) {
				if (this.aBoolean330) {
					label130: {
						if (this.anInt4052 < 0) {
							local40 = this.method3384(arg0, arg1, local18, local44, local13.aByteArray68[this.anInt4054]);
							if (this.anInt4060 >= local18) {
								return;
							}
							this.anInt4060 = local18 + local18 - this.anInt4060 - 1;
							this.anInt4052 = -this.anInt4052;
							if (--this.anInt4053 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3389(arg0, local40, local23, local44, local13.aByteArray68[this.anInt4064 - 1]);
							if (this.anInt4060 < local23) {
								return;
							}
							this.anInt4060 = local23 + local23 - this.anInt4060 - 1;
							this.anInt4052 = -this.anInt4052;
							if (--this.anInt4053 == 0) {
								break;
							}
							local40 = this.method3384(arg0, local40, local18, local44, local13.aByteArray68[this.anInt4054]);
							if (this.anInt4060 >= local18) {
								return;
							}
							this.anInt4060 = local18 + local18 - this.anInt4060 - 1;
							this.anInt4052 = -this.anInt4052;
						} while (--this.anInt4053 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4052 < 0) {
						while (true) {
							local40 = this.method3384(arg0, local40, local18, local44, local13.aByteArray68[this.anInt4064 - 1]);
							if (this.anInt4060 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4060 - 1) / local33;
							if (local416 >= this.anInt4053) {
								this.anInt4060 += local33 * this.anInt4053;
								this.anInt4053 = 0;
								break;
							}
							this.anInt4060 += local33 * local416;
							this.anInt4053 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3389(arg0, local40, local23, local44, local13.aByteArray68[this.anInt4054]);
							if (this.anInt4060 < local23) {
								return;
							}
							local416 = (this.anInt4060 - local18) / local33;
							if (local416 >= this.anInt4053) {
								this.anInt4060 -= local33 * this.anInt4053;
								this.anInt4053 = 0;
								break;
							}
							this.anInt4060 -= local33 * local416;
							this.anInt4053 -= local416;
						}
					}
				}
			}
			if (this.anInt4052 < 0) {
				this.method3384(arg0, local40, 0, local44, 0);
				if (this.anInt4060 < 0) {
					this.anInt4060 = -1;
					this.method3386();
					this.method7966();
					return;
				}
			} else {
				this.method3389(arg0, local40, local29, local44, 0);
				if (this.anInt4060 >= local29) {
					this.anInt4060 = local29;
					this.method3386();
					this.method7966();
				}
			}
		} else if (this.aBoolean330) {
			if (this.anInt4052 < 0) {
				local40 = this.method3384(arg0, arg1, local18, local44, local13.aByteArray68[this.anInt4054]);
				if (this.anInt4060 >= local18) {
					return;
				}
				this.anInt4060 = local18 + local18 - this.anInt4060 - 1;
				this.anInt4052 = -this.anInt4052;
			}
			while (true) {
				local40 = this.method3389(arg0, local40, local23, local44, local13.aByteArray68[this.anInt4064 - 1]);
				if (this.anInt4060 < local23) {
					return;
				}
				this.anInt4060 = local23 + local23 - this.anInt4060 - 1;
				this.anInt4052 = -this.anInt4052;
				local40 = this.method3384(arg0, local40, local18, local44, local13.aByteArray68[this.anInt4054]);
				if (this.anInt4060 >= local18) {
					return;
				}
				this.anInt4060 = local18 + local18 - this.anInt4060 - 1;
				this.anInt4052 = -this.anInt4052;
			}
		} else if (this.anInt4052 < 0) {
			while (true) {
				local40 = this.method3384(arg0, local40, local18, local44, local13.aByteArray68[this.anInt4064 - 1]);
				if (this.anInt4060 >= local18) {
					return;
				}
				this.anInt4060 = local23 - (local23 - 1 - this.anInt4060) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3389(arg0, local40, local23, local44, local13.aByteArray68[this.anInt4054]);
				if (this.anInt4060 < local23) {
					return;
				}
				this.anInt4060 = local18 + (this.anInt4060 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "()I")
	@Override
	public int method3366() {
		return this.anInt4061 == 0 && this.anInt4056 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "()I")
	@Override
	public int method3365() {
		@Pc(6) int local6 = this.anInt4051 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4053 == 0) {
			local6 -= local6 * this.anInt4060 / (((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68.length << 8);
		} else if (this.anInt4053 >= 0) {
			local6 -= local6 * this.anInt4054 / ((Class2_Sub7_Sub1) super.aClass2_Sub7_5).aByteArray68.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3361(@OriginalArg(0) int arg0) {
		if (this.anInt4056 > 0) {
			if (arg0 >= this.anInt4056) {
				if (this.anInt4061 == Integer.MIN_VALUE) {
					this.anInt4061 = 0;
					this.anInt4051 = this.anInt4062 = this.anInt4057 = 0;
					this.method7966();
					arg0 = this.anInt4056;
				}
				this.anInt4056 = 0;
				this.method3400();
			} else {
				this.anInt4051 += this.anInt4055 * arg0;
				this.anInt4062 += this.anInt4058 * arg0;
				this.anInt4057 += this.anInt4059 * arg0;
				this.anInt4056 -= arg0;
			}
		}
		@Pc(71) Class2_Sub7_Sub1 local71 = (Class2_Sub7_Sub1) super.aClass2_Sub7_5;
		@Pc(76) int local76 = this.anInt4054 << 8;
		@Pc(81) int local81 = this.anInt4064 << 8;
		@Pc(87) int local87 = local71.aByteArray68.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4053 = 0;
		}
		if (this.anInt4060 < 0) {
			if (this.anInt4052 <= 0) {
				this.method3386();
				this.method7966();
				return;
			}
			this.anInt4060 = 0;
		}
		if (this.anInt4060 >= local87) {
			if (this.anInt4052 >= 0) {
				this.method3386();
				this.method7966();
				return;
			}
			this.anInt4060 = local87 - 1;
		}
		this.anInt4060 += this.anInt4052 * arg0;
		if (this.anInt4053 >= 0) {
			if (this.anInt4053 > 0) {
				if (this.aBoolean330) {
					label125: {
						if (this.anInt4052 < 0) {
							if (this.anInt4060 >= local76) {
								return;
							}
							this.anInt4060 = local76 + local76 - this.anInt4060 - 1;
							this.anInt4052 = -this.anInt4052;
							if (--this.anInt4053 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4060 < local81) {
								return;
							}
							this.anInt4060 = local81 + local81 - this.anInt4060 - 1;
							this.anInt4052 = -this.anInt4052;
							if (--this.anInt4053 == 0) {
								break;
							}
							if (this.anInt4060 >= local76) {
								return;
							}
							this.anInt4060 = local76 + local76 - this.anInt4060 - 1;
							this.anInt4052 = -this.anInt4052;
						} while (--this.anInt4053 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4052 < 0) {
						if (this.anInt4060 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4060 - 1) / local91;
						if (local361 < this.anInt4053) {
							this.anInt4060 += local91 * local361;
							this.anInt4053 -= local361;
							return;
						}
						this.anInt4060 += local91 * this.anInt4053;
						this.anInt4053 = 0;
					} else if (this.anInt4060 >= local81) {
						local361 = (this.anInt4060 - local76) / local91;
						if (local361 < this.anInt4053) {
							this.anInt4060 -= local91 * local361;
							this.anInt4053 -= local361;
							return;
						}
						this.anInt4060 -= local91 * this.anInt4053;
						this.anInt4053 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4052 < 0) {
				if (this.anInt4060 < 0) {
					this.anInt4060 = -1;
					this.method3386();
					this.method7966();
					return;
				}
			} else if (this.anInt4060 >= local87) {
				this.anInt4060 = local87;
				this.method3386();
				this.method7966();
			}
		} else if (this.aBoolean330) {
			if (this.anInt4052 < 0) {
				if (this.anInt4060 >= local76) {
					return;
				}
				this.anInt4060 = local76 + local76 - this.anInt4060 - 1;
				this.anInt4052 = -this.anInt4052;
			}
			while (this.anInt4060 >= local81) {
				this.anInt4060 = local81 + local81 - this.anInt4060 - 1;
				this.anInt4052 = -this.anInt4052;
				if (this.anInt4060 >= local76) {
					return;
				}
				this.anInt4060 = local76 + local76 - this.anInt4060 - 1;
				this.anInt4052 = -this.anInt4052;
			}
		} else if (this.anInt4052 < 0) {
			if (this.anInt4060 < local76) {
				this.anInt4060 = local81 - (local81 - 1 - this.anInt4060) % local91 - 1;
			}
		} else if (this.anInt4060 >= local81) {
			this.anInt4060 = local76 + (this.anInt4060 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "(I)V")
	public synchronized void method3399(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3379();
			this.method7966();
		} else if (this.anInt4062 == 0 && this.anInt4057 == 0) {
			this.anInt4056 = 0;
			this.anInt4061 = 0;
			this.anInt4051 = 0;
			this.method7966();
		} else {
			@Pc(31) int local31 = -this.anInt4051;
			if (this.anInt4051 > local31) {
				local31 = this.anInt4051;
			}
			if (-this.anInt4062 > local31) {
				local31 = -this.anInt4062;
			}
			if (this.anInt4062 > local31) {
				local31 = this.anInt4062;
			}
			if (-this.anInt4057 > local31) {
				local31 = -this.anInt4057;
			}
			if (this.anInt4057 > local31) {
				local31 = this.anInt4057;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4056 = arg0;
			this.anInt4061 = Integer.MIN_VALUE;
			this.anInt4055 = -this.anInt4051 / arg0;
			this.anInt4058 = -this.anInt4062 / arg0;
			this.anInt4059 = -this.anInt4057 / arg0;
		}
	}

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "()V")
	private void method3400() {
		this.anInt4051 = this.anInt4061;
		this.anInt4062 = Static600.method3380(this.anInt4061, this.anInt4063);
		this.anInt4057 = Static600.method3391(this.anInt4061, this.anInt4063);
	}

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "(I)V")
	public synchronized void method3403(@OriginalArg(0) int arg0) {
		this.anInt4053 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "()Z")
	public boolean method3405() {
		return this.anInt4056 != 0;
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(II)V")
	private synchronized void method3406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4061 = arg0;
		this.anInt4063 = arg1;
		this.anInt4056 = 0;
		this.method3400();
	}
}
