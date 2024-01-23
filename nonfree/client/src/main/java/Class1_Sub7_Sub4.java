import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class1_Sub7_Sub4 extends Class1_Sub7 {

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
	private int anInt4679;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
	public int anInt4680;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
	public int anInt4681;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
	private int anInt4682;

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
	public int anInt4683;

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
	public int anInt4685;

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
	public int anInt4690;

	@OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
	public int anInt4691;

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
	private int anInt4687;

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
	private int anInt4684;

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "Z")
	private boolean aBoolean264;

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
	private int anInt4686;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
	private int anInt4678;

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
	private int anInt4689;

	@OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
	public int anInt4688;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!pd;II)V")
	public Class1_Sub7_Sub4(@OriginalArg(0) Class1_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub19_5 = arg0;
		this.anInt4687 = arg0.anInt3296;
		this.anInt4684 = arg0.anInt3297;
		this.aBoolean264 = arg0.aBoolean182;
		this.anInt4686 = arg1;
		this.anInt4678 = arg2;
		this.anInt4689 = 8192;
		this.anInt4688 = 0;
		this.method3489();
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!pd;III)V")
	public Class1_Sub7_Sub4(@OriginalArg(0) Class1_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub19_5 = arg0;
		this.anInt4687 = arg0.anInt3296;
		this.anInt4684 = arg0.anInt3297;
		this.aBoolean264 = arg0.aBoolean182;
		this.anInt4686 = arg1;
		this.anInt4678 = arg2;
		this.anInt4689 = arg3;
		this.anInt4688 = 0;
		this.method3489();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
	public synchronized void method3455() {
		this.anInt4686 = (this.anInt4686 ^ this.anInt4686 >> 31) + (this.anInt4686 >>> 31);
		this.anInt4686 = -this.anInt4686;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()I")
	@Override
	public int method3451() {
		@Pc(6) int local6 = this.anInt4685 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4682 == 0) {
			local6 -= local6 * this.anInt4688 / (((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42.length << 8);
		} else if (this.anInt4682 >= 0) {
			local6 -= local6 * this.anInt4687 / ((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "()Z")
	public boolean method3457() {
		return this.anInt4688 < 0 || this.anInt4688 >= ((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42.length << 8;
	}

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "()I")
	public synchronized int method3459() {
		return this.anInt4686 < 0 ? -this.anInt4686 : this.anInt4686;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V")
	public synchronized void method3460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3467(arg0, arg1, this.method3462());
	}

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "()I")
	public synchronized int method3462() {
		return this.anInt4689 < 0 ? -1 : this.anInt4689;
	}

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "()I")
	public synchronized int method3463() {
		return this.anInt4678 == Integer.MIN_VALUE ? 0 : this.anInt4678;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([IIIII)I")
	private int method3464(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4679 <= 0) {
				if (this.anInt4686 == 256 && (this.anInt4688 & 0xFF) == 0) {
					if (Static59.aBoolean76) {
						return Static229.method3486(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4690, this.anInt4691, arg3, arg2, this);
					}
					return Static229.method3492(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4685, arg3, arg2, this);
				}
				if (Static59.aBoolean76) {
					return Static229.method3482(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4690, this.anInt4691, arg3, arg2, this, this.anInt4686, arg4);
				}
				return Static229.method3488(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4685, arg3, arg2, this, this.anInt4686, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4679;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4679 += arg1;
			if (this.anInt4686 == 256 && (this.anInt4688 & 0xFF) == 0) {
				if (Static59.aBoolean76) {
					arg1 = Static229.method3494(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4690, this.anInt4691, this.anInt4680, this.anInt4681, local5, arg2, this);
				} else {
					arg1 = Static229.method3493(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4685, this.anInt4683, local5, arg2, this);
				}
			} else if (Static59.aBoolean76) {
				arg1 = Static229.method3468(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4690, this.anInt4691, this.anInt4680, this.anInt4681, local5, arg2, this, this.anInt4686, arg4);
			} else {
				arg1 = Static229.method3476(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4685, this.anInt4683, local5, arg2, this, this.anInt4686, arg4);
			}
			this.anInt4679 -= arg1;
			if (this.anInt4679 != 0) {
				return arg1;
			}
		} while (!this.method3477());
		return arg3;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	public synchronized void method3465(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3487();
			this.method3530();
		} else if (this.anInt4690 == 0 && this.anInt4691 == 0) {
			this.anInt4679 = 0;
			this.anInt4678 = 0;
			this.anInt4685 = 0;
			this.method3530();
		} else {
			@Pc(31) int local31 = -this.anInt4685;
			if (this.anInt4685 > local31) {
				local31 = this.anInt4685;
			}
			if (-this.anInt4690 > local31) {
				local31 = -this.anInt4690;
			}
			if (this.anInt4690 > local31) {
				local31 = this.anInt4690;
			}
			if (-this.anInt4691 > local31) {
				local31 = -this.anInt4691;
			}
			if (this.anInt4691 > local31) {
				local31 = this.anInt4691;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4679 = arg0;
			this.anInt4678 = Integer.MIN_VALUE;
			this.anInt4683 = -this.anInt4685 / arg0;
			this.anInt4680 = -this.anInt4690 / arg0;
			this.anInt4681 = -this.anInt4691 / arg0;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	public synchronized void method3467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3490(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static229.method3472(arg1, arg2);
		@Pc(14) int local14 = Static229.method3458(arg1, arg2);
		if (this.anInt4690 == local10 && this.anInt4691 == local14) {
			this.anInt4679 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4685;
		if (this.anInt4685 - arg1 > local31) {
			local31 = this.anInt4685 - arg1;
		}
		if (local10 - this.anInt4690 > local31) {
			local31 = local10 - this.anInt4690;
		}
		if (this.anInt4690 - local10 > local31) {
			local31 = this.anInt4690 - local10;
		}
		if (local14 - this.anInt4691 > local31) {
			local31 = local14 - this.anInt4691;
		}
		if (this.anInt4691 - local14 > local31) {
			local31 = this.anInt4691 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4679 = arg0;
		this.anInt4678 = arg1;
		this.anInt4689 = arg2;
		this.anInt4683 = (arg1 - this.anInt4685) / arg0;
		this.anInt4680 = (local10 - this.anInt4690) / arg0;
		this.anInt4681 = (local14 - this.anInt4691) / arg0;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V")
	public synchronized void method3469(@OriginalArg(0) int arg0) {
		this.method3490(arg0 << 6, this.method3462());
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
	public synchronized void method3470(@OriginalArg(0) int arg0) {
		this.anInt4682 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)V")
	public synchronized void method3471(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4688 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "([IIIII)I")
	private int method3473(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4679 <= 0) {
				if (this.anInt4686 == -256 && (this.anInt4688 & 0xFF) == 0) {
					if (Static59.aBoolean76) {
						return Static229.method3456(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4690, this.anInt4691, arg3, arg2, this);
					}
					return Static229.method3481(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4685, arg3, arg2, this);
				}
				if (Static59.aBoolean76) {
					return Static229.method3479(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4690, this.anInt4691, arg3, arg2, this, this.anInt4686, arg4);
				}
				return Static229.method3475(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4685, arg3, arg2, this, this.anInt4686, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4679;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4679 += arg1;
			if (this.anInt4686 == -256 && (this.anInt4688 & 0xFF) == 0) {
				if (Static59.aBoolean76) {
					arg1 = Static229.method3485(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4690, this.anInt4691, this.anInt4680, this.anInt4681, local5, arg2, this);
				} else {
					arg1 = Static229.method3483(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4685, this.anInt4683, local5, arg2, this);
				}
			} else if (Static59.aBoolean76) {
				arg1 = Static229.method3461(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4690, this.anInt4691, this.anInt4680, this.anInt4681, local5, arg2, this, this.anInt4686, arg4);
			} else {
				arg1 = Static229.method3478(((Class1_Sub19_Sub1) super.aClass1_Sub19_5).aByteArray42, arg0, this.anInt4688, arg1, this.anInt4685, this.anInt4683, local5, arg2, this, this.anInt4686, arg4);
			}
			this.anInt4679 -= arg1;
			if (this.anInt4679 != 0) {
				return arg1;
			}
		} while (!this.method3477());
		return arg3;
	}

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "()V")
	private void method3474() {
		if (this.anInt4679 == 0) {
			return;
		}
		if (this.anInt4678 == Integer.MIN_VALUE) {
			this.anInt4678 = 0;
		}
		this.anInt4679 = 0;
		this.method3489();
	}

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "()Z")
	private boolean method3477() {
		@Pc(2) int local2 = this.anInt4678;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static229.method3472(local2, this.anInt4689);
			local8 = Static229.method3458(local2, this.anInt4689);
		}
		if (this.anInt4685 != local2 || this.anInt4690 != local10 || this.anInt4691 != local8) {
			if (this.anInt4685 < local2) {
				this.anInt4683 = 1;
				this.anInt4679 = local2 - this.anInt4685;
			} else if (this.anInt4685 > local2) {
				this.anInt4683 = -1;
				this.anInt4679 = this.anInt4685 - local2;
			} else {
				this.anInt4683 = 0;
			}
			if (this.anInt4690 < local10) {
				this.anInt4680 = 1;
				if (this.anInt4679 == 0 || this.anInt4679 > local10 - this.anInt4690) {
					this.anInt4679 = local10 - this.anInt4690;
				}
			} else if (this.anInt4690 > local10) {
				this.anInt4680 = -1;
				if (this.anInt4679 == 0 || this.anInt4679 > this.anInt4690 - local10) {
					this.anInt4679 = this.anInt4690 - local10;
				}
			} else {
				this.anInt4680 = 0;
			}
			if (this.anInt4691 < local8) {
				this.anInt4681 = 1;
				if (this.anInt4679 == 0 || this.anInt4679 > local8 - this.anInt4691) {
					this.anInt4679 = local8 - this.anInt4691;
				}
			} else if (this.anInt4691 > local8) {
				this.anInt4681 = -1;
				if (this.anInt4679 == 0 || this.anInt4679 > this.anInt4691 - local8) {
					this.anInt4679 = this.anInt4691 - local8;
				}
			} else {
				this.anInt4681 = 0;
			}
			return false;
		} else if (this.anInt4678 == Integer.MIN_VALUE) {
			this.anInt4678 = 0;
			this.anInt4685 = this.anInt4690 = this.anInt4691 = 0;
			this.method3530();
			return true;
		} else {
			this.method3489();
			return false;
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "()I")
	@Override
	public int method3453() {
		return this.anInt4678 == 0 && this.anInt4679 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "()Lclient!li;")
	@Override
	public Class1_Sub7 method3454() {
		return null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3448(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4678 == 0 && this.anInt4679 == 0) {
			this.method3450(arg2);
			return;
		}
		@Pc(13) Class1_Sub19_Sub1 local13 = (Class1_Sub19_Sub1) super.aClass1_Sub19_5;
		@Pc(18) int local18 = this.anInt4687 << 8;
		@Pc(23) int local23 = this.anInt4684 << 8;
		@Pc(29) int local29 = local13.aByteArray42.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4682 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4688 < 0) {
			if (this.anInt4686 <= 0) {
				this.method3474();
				this.method3530();
				return;
			}
			this.anInt4688 = 0;
		}
		if (this.anInt4688 >= local29) {
			if (this.anInt4686 >= 0) {
				this.method3474();
				this.method3530();
				return;
			}
			this.anInt4688 = local29 - 1;
		}
		if (this.anInt4682 >= 0) {
			if (this.anInt4682 > 0) {
				if (this.aBoolean264) {
					label130: {
						if (this.anInt4686 < 0) {
							local40 = this.method3473(arg0, arg1, local18, local44, local13.aByteArray42[this.anInt4687]);
							if (this.anInt4688 >= local18) {
								return;
							}
							this.anInt4688 = local18 + local18 - this.anInt4688 - 1;
							this.anInt4686 = -this.anInt4686;
							if (--this.anInt4682 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3464(arg0, local40, local23, local44, local13.aByteArray42[this.anInt4684 - 1]);
							if (this.anInt4688 < local23) {
								return;
							}
							this.anInt4688 = local23 + local23 - this.anInt4688 - 1;
							this.anInt4686 = -this.anInt4686;
							if (--this.anInt4682 == 0) {
								break;
							}
							local40 = this.method3473(arg0, local40, local18, local44, local13.aByteArray42[this.anInt4687]);
							if (this.anInt4688 >= local18) {
								return;
							}
							this.anInt4688 = local18 + local18 - this.anInt4688 - 1;
							this.anInt4686 = -this.anInt4686;
						} while (--this.anInt4682 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4686 < 0) {
						while (true) {
							local40 = this.method3473(arg0, local40, local18, local44, local13.aByteArray42[this.anInt4684 - 1]);
							if (this.anInt4688 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4688 - 1) / local33;
							if (local416 >= this.anInt4682) {
								this.anInt4688 += local33 * this.anInt4682;
								this.anInt4682 = 0;
								break;
							}
							this.anInt4688 += local33 * local416;
							this.anInt4682 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3464(arg0, local40, local23, local44, local13.aByteArray42[this.anInt4687]);
							if (this.anInt4688 < local23) {
								return;
							}
							local416 = (this.anInt4688 - local18) / local33;
							if (local416 >= this.anInt4682) {
								this.anInt4688 -= local33 * this.anInt4682;
								this.anInt4682 = 0;
								break;
							}
							this.anInt4688 -= local33 * local416;
							this.anInt4682 -= local416;
						}
					}
				}
			}
			if (this.anInt4686 < 0) {
				this.method3473(arg0, local40, 0, local44, 0);
				if (this.anInt4688 < 0) {
					this.anInt4688 = -1;
					this.method3474();
					this.method3530();
					return;
				}
			} else {
				this.method3464(arg0, local40, local29, local44, 0);
				if (this.anInt4688 >= local29) {
					this.anInt4688 = local29;
					this.method3474();
					this.method3530();
				}
			}
		} else if (this.aBoolean264) {
			if (this.anInt4686 < 0) {
				local40 = this.method3473(arg0, arg1, local18, local44, local13.aByteArray42[this.anInt4687]);
				if (this.anInt4688 >= local18) {
					return;
				}
				this.anInt4688 = local18 + local18 - this.anInt4688 - 1;
				this.anInt4686 = -this.anInt4686;
			}
			while (true) {
				local40 = this.method3464(arg0, local40, local23, local44, local13.aByteArray42[this.anInt4684 - 1]);
				if (this.anInt4688 < local23) {
					return;
				}
				this.anInt4688 = local23 + local23 - this.anInt4688 - 1;
				this.anInt4686 = -this.anInt4686;
				local40 = this.method3473(arg0, local40, local18, local44, local13.aByteArray42[this.anInt4687]);
				if (this.anInt4688 >= local18) {
					return;
				}
				this.anInt4688 = local18 + local18 - this.anInt4688 - 1;
				this.anInt4686 = -this.anInt4686;
			}
		} else if (this.anInt4686 < 0) {
			while (true) {
				local40 = this.method3473(arg0, local40, local18, local44, local13.aByteArray42[this.anInt4684 - 1]);
				if (this.anInt4688 >= local18) {
					return;
				}
				this.anInt4688 = local23 - (local23 - 1 - this.anInt4688) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3464(arg0, local40, local23, local44, local13.aByteArray42[this.anInt4687]);
				if (this.anInt4688 < local23) {
					return;
				}
				this.anInt4688 = local18 + (this.anInt4688 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "()Z")
	public boolean method3484() {
		return this.anInt4679 != 0;
	}

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
	private synchronized void method3487() {
		this.method3490(0, this.method3462());
	}

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "()V")
	private void method3489() {
		this.anInt4685 = this.anInt4678;
		this.anInt4690 = Static229.method3472(this.anInt4678, this.anInt4689);
		this.anInt4691 = Static229.method3458(this.anInt4678, this.anInt4689);
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(II)V")
	private synchronized void method3490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4678 = arg0;
		this.anInt4689 = arg1;
		this.anInt4679 = 0;
		this.method3489();
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3450(@OriginalArg(0) int arg0) {
		if (this.anInt4679 > 0) {
			if (arg0 >= this.anInt4679) {
				if (this.anInt4678 == Integer.MIN_VALUE) {
					this.anInt4678 = 0;
					this.anInt4685 = this.anInt4690 = this.anInt4691 = 0;
					this.method3530();
					arg0 = this.anInt4679;
				}
				this.anInt4679 = 0;
				this.method3489();
			} else {
				this.anInt4685 += this.anInt4683 * arg0;
				this.anInt4690 += this.anInt4680 * arg0;
				this.anInt4691 += this.anInt4681 * arg0;
				this.anInt4679 -= arg0;
			}
		}
		@Pc(71) Class1_Sub19_Sub1 local71 = (Class1_Sub19_Sub1) super.aClass1_Sub19_5;
		@Pc(76) int local76 = this.anInt4687 << 8;
		@Pc(81) int local81 = this.anInt4684 << 8;
		@Pc(87) int local87 = local71.aByteArray42.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4682 = 0;
		}
		if (this.anInt4688 < 0) {
			if (this.anInt4686 <= 0) {
				this.method3474();
				this.method3530();
				return;
			}
			this.anInt4688 = 0;
		}
		if (this.anInt4688 >= local87) {
			if (this.anInt4686 >= 0) {
				this.method3474();
				this.method3530();
				return;
			}
			this.anInt4688 = local87 - 1;
		}
		this.anInt4688 += this.anInt4686 * arg0;
		if (this.anInt4682 >= 0) {
			if (this.anInt4682 > 0) {
				if (this.aBoolean264) {
					label125: {
						if (this.anInt4686 < 0) {
							if (this.anInt4688 >= local76) {
								return;
							}
							this.anInt4688 = local76 + local76 - this.anInt4688 - 1;
							this.anInt4686 = -this.anInt4686;
							if (--this.anInt4682 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4688 < local81) {
								return;
							}
							this.anInt4688 = local81 + local81 - this.anInt4688 - 1;
							this.anInt4686 = -this.anInt4686;
							if (--this.anInt4682 == 0) {
								break;
							}
							if (this.anInt4688 >= local76) {
								return;
							}
							this.anInt4688 = local76 + local76 - this.anInt4688 - 1;
							this.anInt4686 = -this.anInt4686;
						} while (--this.anInt4682 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4686 < 0) {
						if (this.anInt4688 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4688 - 1) / local91;
						if (local361 < this.anInt4682) {
							this.anInt4688 += local91 * local361;
							this.anInt4682 -= local361;
							return;
						}
						this.anInt4688 += local91 * this.anInt4682;
						this.anInt4682 = 0;
					} else if (this.anInt4688 >= local81) {
						local361 = (this.anInt4688 - local76) / local91;
						if (local361 < this.anInt4682) {
							this.anInt4688 -= local91 * local361;
							this.anInt4682 -= local361;
							return;
						}
						this.anInt4688 -= local91 * this.anInt4682;
						this.anInt4682 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4686 < 0) {
				if (this.anInt4688 < 0) {
					this.anInt4688 = -1;
					this.method3474();
					this.method3530();
					return;
				}
			} else if (this.anInt4688 >= local87) {
				this.anInt4688 = local87;
				this.method3474();
				this.method3530();
			}
		} else if (this.aBoolean264) {
			if (this.anInt4686 < 0) {
				if (this.anInt4688 >= local76) {
					return;
				}
				this.anInt4688 = local76 + local76 - this.anInt4688 - 1;
				this.anInt4686 = -this.anInt4686;
			}
			while (this.anInt4688 >= local81) {
				this.anInt4688 = local81 + local81 - this.anInt4688 - 1;
				this.anInt4686 = -this.anInt4686;
				if (this.anInt4688 >= local76) {
					return;
				}
				this.anInt4688 = local76 + local76 - this.anInt4688 - 1;
				this.anInt4686 = -this.anInt4686;
			}
		} else if (this.anInt4686 < 0) {
			if (this.anInt4688 < local76) {
				this.anInt4688 = local81 - (local81 - 1 - this.anInt4688) % local91 - 1;
			}
		} else if (this.anInt4688 >= local81) {
			this.anInt4688 = local76 + (this.anInt4688 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "(I)V")
	public synchronized void method3491(@OriginalArg(0) int arg0) {
		if (this.anInt4686 < 0) {
			this.anInt4686 = -arg0;
		} else {
			this.anInt4686 = arg0;
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()Lclient!li;")
	@Override
	public Class1_Sub7 method3452() {
		return null;
	}
}
