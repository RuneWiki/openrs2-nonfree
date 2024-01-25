import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class5_Sub17_Sub2 extends Class5_Sub17 {

	@OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
	public int anInt4686;

	@OriginalMember(owner = "client!iha", name = "v", descriptor = "I")
	public int anInt4691;

	@OriginalMember(owner = "client!iha", name = "w", descriptor = "I")
	public int anInt4692;

	@OriginalMember(owner = "client!iha", name = "y", descriptor = "I")
	public int anInt4694;

	@OriginalMember(owner = "client!iha", name = "z", descriptor = "I")
	public int anInt4695;

	@OriginalMember(owner = "client!iha", name = "A", descriptor = "I")
	private int anInt4696;

	@OriginalMember(owner = "client!iha", name = "B", descriptor = "I")
	private int anInt4697;

	@OriginalMember(owner = "client!iha", name = "D", descriptor = "I")
	public int anInt4699;

	@OriginalMember(owner = "client!iha", name = "u", descriptor = "I")
	private final int anInt4690;

	@OriginalMember(owner = "client!iha", name = "t", descriptor = "I")
	private final int anInt4689;

	@OriginalMember(owner = "client!iha", name = "q", descriptor = "Z")
	private final boolean aBoolean392;

	@OriginalMember(owner = "client!iha", name = "x", descriptor = "I")
	private int anInt4693;

	@OriginalMember(owner = "client!iha", name = "r", descriptor = "I")
	private int anInt4687;

	@OriginalMember(owner = "client!iha", name = "C", descriptor = "I")
	private int anInt4698;

	@OriginalMember(owner = "client!iha", name = "s", descriptor = "I")
	public int anInt4688;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!nga;III)V")
	public Class5_Sub17_Sub2(@OriginalArg(0) Class5_Sub42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub42_6 = arg0;
		this.anInt4690 = arg0.anInt7023;
		this.anInt4689 = arg0.anInt7022;
		this.aBoolean392 = arg0.aBoolean606;
		this.anInt4693 = arg1;
		this.anInt4687 = arg2;
		this.anInt4698 = arg3;
		this.anInt4688 = 0;
		this.method3956();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "([IIIII)I")
	private int method3932(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4697 <= 0) {
				if (this.anInt4693 == -256 && (this.anInt4688 & 0xFF) == 0) {
					if (Static143.aBoolean243) {
						return Static684.method3971(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4692, this.anInt4699, arg3, arg2, this);
					}
					return Static684.method3951(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4691, arg3, arg2, this);
				}
				if (Static143.aBoolean243) {
					return Static684.method3960(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4692, this.anInt4699, arg3, arg2, this, this.anInt4693, arg4);
				}
				return Static684.method3957(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4691, arg3, arg2, this, this.anInt4693, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4697;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4697 += arg1;
			if (this.anInt4693 == -256 && (this.anInt4688 & 0xFF) == 0) {
				if (Static143.aBoolean243) {
					arg1 = Static684.method3948(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4692, this.anInt4699, this.anInt4686, this.anInt4694, local5, arg2, this);
				} else {
					arg1 = Static684.method3968(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4691, this.anInt4695, local5, arg2, this);
				}
			} else if (Static143.aBoolean243) {
				arg1 = Static684.method3936(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4692, this.anInt4699, this.anInt4686, this.anInt4694, local5, arg2, this, this.anInt4693, arg4);
			} else {
				arg1 = Static684.method3962(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4691, this.anInt4695, local5, arg2, this, this.anInt4693, arg4);
			}
			this.anInt4697 -= arg1;
			if (this.anInt4697 != 0) {
				return arg1;
			}
		} while (!this.method3940());
		return arg3;
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)V")
	public synchronized void method3934(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4688 = arg0;
	}

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "()Lclient!km;")
	@Override
	public Class5_Sub17 method6652() {
		return null;
	}

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "()V")
	private void method3935() {
		if (this.anInt4697 == 0) {
			return;
		}
		if (this.anInt4687 == Integer.MIN_VALUE) {
			this.anInt4687 = 0;
		}
		this.anInt4697 = 0;
		this.method3956();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "()I")
	@Override
	public int method6646() {
		return this.anInt4687 == 0 && this.anInt4697 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "(I)V")
	public synchronized void method3938(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3943();
			this.method9052();
		} else if (this.anInt4692 == 0 && this.anInt4699 == 0) {
			this.anInt4697 = 0;
			this.anInt4687 = 0;
			this.anInt4691 = 0;
			this.method9052();
		} else {
			@Pc(31) int local31 = -this.anInt4691;
			if (this.anInt4691 > local31) {
				local31 = this.anInt4691;
			}
			if (-this.anInt4692 > local31) {
				local31 = -this.anInt4692;
			}
			if (this.anInt4692 > local31) {
				local31 = this.anInt4692;
			}
			if (-this.anInt4699 > local31) {
				local31 = -this.anInt4699;
			}
			if (this.anInt4699 > local31) {
				local31 = this.anInt4699;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4697 = arg0;
			this.anInt4687 = Integer.MIN_VALUE;
			this.anInt4695 = -this.anInt4691 / arg0;
			this.anInt4686 = -this.anInt4692 / arg0;
			this.anInt4694 = -this.anInt4699 / arg0;
		}
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "([IIIII)I")
	private int method3939(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4697 <= 0) {
				if (this.anInt4693 == 256 && (this.anInt4688 & 0xFF) == 0) {
					if (Static143.aBoolean243) {
						return Static684.method3933(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4692, this.anInt4699, arg3, arg2, this);
					}
					return Static684.method3949(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4691, arg3, arg2, this);
				}
				if (Static143.aBoolean243) {
					return Static684.method3955(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4692, this.anInt4699, arg3, arg2, this, this.anInt4693, arg4);
				}
				return Static684.method3964(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4691, arg3, arg2, this, this.anInt4693, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4697;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4697 += arg1;
			if (this.anInt4693 == 256 && (this.anInt4688 & 0xFF) == 0) {
				if (Static143.aBoolean243) {
					arg1 = Static684.method3941(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4692, this.anInt4699, this.anInt4686, this.anInt4694, local5, arg2, this);
				} else {
					arg1 = Static684.method3942(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4691, this.anInt4695, local5, arg2, this);
				}
			} else if (Static143.aBoolean243) {
				arg1 = Static684.method3937(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4692, this.anInt4699, this.anInt4686, this.anInt4694, local5, arg2, this, this.anInt4693, arg4);
			} else {
				arg1 = Static684.method3945(((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67, arg0, this.anInt4688, arg1, this.anInt4691, this.anInt4695, local5, arg2, this, this.anInt4693, arg4);
			}
			this.anInt4697 -= arg1;
			if (this.anInt4697 != 0) {
				return arg1;
			}
		} while (!this.method3940());
		return arg3;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4687 == 0 && this.anInt4697 == 0) {
			this.method6650(arg2);
			return;
		}
		@Pc(13) Class5_Sub42_Sub1 local13 = (Class5_Sub42_Sub1) super.aClass5_Sub42_6;
		@Pc(18) int local18 = this.anInt4690 << 8;
		@Pc(23) int local23 = this.anInt4689 << 8;
		@Pc(29) int local29 = local13.aByteArray67.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4696 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4688 < 0) {
			if (this.anInt4693 <= 0) {
				this.method3935();
				this.method9052();
				return;
			}
			this.anInt4688 = 0;
		}
		if (this.anInt4688 >= local29) {
			if (this.anInt4693 >= 0) {
				this.method3935();
				this.method9052();
				return;
			}
			this.anInt4688 = local29 - 1;
		}
		if (this.anInt4696 >= 0) {
			if (this.anInt4696 > 0) {
				if (this.aBoolean392) {
					label130: {
						if (this.anInt4693 < 0) {
							local40 = this.method3932(arg0, arg1, local18, local44, local13.aByteArray67[this.anInt4690]);
							if (this.anInt4688 >= local18) {
								return;
							}
							this.anInt4688 = local18 + local18 - this.anInt4688 - 1;
							this.anInt4693 = -this.anInt4693;
							if (--this.anInt4696 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3939(arg0, local40, local23, local44, local13.aByteArray67[this.anInt4689 - 1]);
							if (this.anInt4688 < local23) {
								return;
							}
							this.anInt4688 = local23 + local23 - this.anInt4688 - 1;
							this.anInt4693 = -this.anInt4693;
							if (--this.anInt4696 == 0) {
								break;
							}
							local40 = this.method3932(arg0, local40, local18, local44, local13.aByteArray67[this.anInt4690]);
							if (this.anInt4688 >= local18) {
								return;
							}
							this.anInt4688 = local18 + local18 - this.anInt4688 - 1;
							this.anInt4693 = -this.anInt4693;
						} while (--this.anInt4696 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4693 < 0) {
						while (true) {
							local40 = this.method3932(arg0, local40, local18, local44, local13.aByteArray67[this.anInt4689 - 1]);
							if (this.anInt4688 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4688 - 1) / local33;
							if (local416 >= this.anInt4696) {
								this.anInt4688 += local33 * this.anInt4696;
								this.anInt4696 = 0;
								break;
							}
							this.anInt4688 += local33 * local416;
							this.anInt4696 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3939(arg0, local40, local23, local44, local13.aByteArray67[this.anInt4690]);
							if (this.anInt4688 < local23) {
								return;
							}
							local416 = (this.anInt4688 - local18) / local33;
							if (local416 >= this.anInt4696) {
								this.anInt4688 -= local33 * this.anInt4696;
								this.anInt4696 = 0;
								break;
							}
							this.anInt4688 -= local33 * local416;
							this.anInt4696 -= local416;
						}
					}
				}
			}
			if (this.anInt4693 < 0) {
				this.method3932(arg0, local40, 0, local44, 0);
				if (this.anInt4688 < 0) {
					this.anInt4688 = -1;
					this.method3935();
					this.method9052();
					return;
				}
			} else {
				this.method3939(arg0, local40, local29, local44, 0);
				if (this.anInt4688 >= local29) {
					this.anInt4688 = local29;
					this.method3935();
					this.method9052();
				}
			}
		} else if (this.aBoolean392) {
			if (this.anInt4693 < 0) {
				local40 = this.method3932(arg0, arg1, local18, local44, local13.aByteArray67[this.anInt4690]);
				if (this.anInt4688 >= local18) {
					return;
				}
				this.anInt4688 = local18 + local18 - this.anInt4688 - 1;
				this.anInt4693 = -this.anInt4693;
			}
			while (true) {
				local40 = this.method3939(arg0, local40, local23, local44, local13.aByteArray67[this.anInt4689 - 1]);
				if (this.anInt4688 < local23) {
					return;
				}
				this.anInt4688 = local23 + local23 - this.anInt4688 - 1;
				this.anInt4693 = -this.anInt4693;
				local40 = this.method3932(arg0, local40, local18, local44, local13.aByteArray67[this.anInt4690]);
				if (this.anInt4688 >= local18) {
					return;
				}
				this.anInt4688 = local18 + local18 - this.anInt4688 - 1;
				this.anInt4693 = -this.anInt4693;
			}
		} else if (this.anInt4693 < 0) {
			while (true) {
				local40 = this.method3932(arg0, local40, local18, local44, local13.aByteArray67[this.anInt4689 - 1]);
				if (this.anInt4688 >= local18) {
					return;
				}
				this.anInt4688 = local23 - (local23 - 1 - this.anInt4688) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3939(arg0, local40, local23, local44, local13.aByteArray67[this.anInt4690]);
				if (this.anInt4688 < local23) {
					return;
				}
				this.anInt4688 = local18 + (this.anInt4688 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "()Z")
	private boolean method3940() {
		@Pc(2) int local2 = this.anInt4687;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static684.method3947(local2, this.anInt4698);
			local8 = Static684.method3944(local2, this.anInt4698);
		}
		if (this.anInt4691 != local2 || this.anInt4692 != local10 || this.anInt4699 != local8) {
			if (this.anInt4691 < local2) {
				this.anInt4695 = 1;
				this.anInt4697 = local2 - this.anInt4691;
			} else if (this.anInt4691 > local2) {
				this.anInt4695 = -1;
				this.anInt4697 = this.anInt4691 - local2;
			} else {
				this.anInt4695 = 0;
			}
			if (this.anInt4692 < local10) {
				this.anInt4686 = 1;
				if (this.anInt4697 == 0 || this.anInt4697 > local10 - this.anInt4692) {
					this.anInt4697 = local10 - this.anInt4692;
				}
			} else if (this.anInt4692 > local10) {
				this.anInt4686 = -1;
				if (this.anInt4697 == 0 || this.anInt4697 > this.anInt4692 - local10) {
					this.anInt4697 = this.anInt4692 - local10;
				}
			} else {
				this.anInt4686 = 0;
			}
			if (this.anInt4699 < local8) {
				this.anInt4694 = 1;
				if (this.anInt4697 == 0 || this.anInt4697 > local8 - this.anInt4699) {
					this.anInt4697 = local8 - this.anInt4699;
				}
			} else if (this.anInt4699 > local8) {
				this.anInt4694 = -1;
				if (this.anInt4697 == 0 || this.anInt4697 > this.anInt4699 - local8) {
					this.anInt4697 = this.anInt4699 - local8;
				}
			} else {
				this.anInt4694 = 0;
			}
			return false;
		} else if (this.anInt4687 == Integer.MIN_VALUE) {
			this.anInt4687 = 0;
			this.anInt4691 = this.anInt4692 = this.anInt4699 = 0;
			this.method9052();
			return true;
		} else {
			this.method3956();
			return false;
		}
	}

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "(I)V")
	private synchronized void method3943() {
		this.method3954(0, this.method3966());
	}

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "()Z")
	public boolean method3946() {
		return this.anInt4688 < 0 || this.anInt4688 >= ((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67.length << 8;
	}

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "()Z")
	public boolean method3950() {
		return this.anInt4697 != 0;
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "()Lclient!km;")
	@Override
	public Class5_Sub17 method6649() {
		return null;
	}

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "(I)V")
	public synchronized void method3953(@OriginalArg(0) int arg0) {
		this.method3954(arg0 << 6, this.method3966());
	}

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "(II)V")
	private synchronized void method3954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4687 = arg0;
		this.anInt4698 = arg1;
		this.anInt4697 = 0;
		this.method3956();
	}

	@OriginalMember(owner = "client!iha", name = "i", descriptor = "()V")
	private void method3956() {
		this.anInt4691 = this.anInt4687;
		this.anInt4692 = Static684.method3947(this.anInt4687, this.anInt4698);
		this.anInt4699 = Static684.method3944(this.anInt4687, this.anInt4698);
	}

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "(I)V")
	public synchronized void method3958(@OriginalArg(0) int arg0) {
		if (this.anInt4693 < 0) {
			this.anInt4693 = -arg0;
		} else {
			this.anInt4693 = arg0;
		}
	}

	@OriginalMember(owner = "client!iha", name = "i", descriptor = "(I)V")
	public synchronized void method3959(@OriginalArg(0) int arg0) {
		this.method3954(this.method3967(), arg0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V")
	public synchronized void method3961() {
		this.anInt4693 = (this.anInt4693 ^ this.anInt4693 >> 31) + (this.anInt4693 >>> 31);
		this.anInt4693 = -this.anInt4693;
	}

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "()I")
	public synchronized int method3963() {
		return this.anInt4693 < 0 ? -this.anInt4693 : this.anInt4693;
	}

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "(II)V")
	public synchronized void method3965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3970(arg0, arg1, this.method3966());
	}

	@OriginalMember(owner = "client!iha", name = "k", descriptor = "()I")
	public synchronized int method3966() {
		return this.anInt4698 < 0 ? -1 : this.anInt4698;
	}

	@OriginalMember(owner = "client!iha", name = "l", descriptor = "()I")
	public synchronized int method3967() {
		return this.anInt4687 == Integer.MIN_VALUE ? 0 : this.anInt4687;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6650(@OriginalArg(0) int arg0) {
		if (this.anInt4697 > 0) {
			if (arg0 >= this.anInt4697) {
				if (this.anInt4687 == Integer.MIN_VALUE) {
					this.anInt4687 = 0;
					this.anInt4691 = this.anInt4692 = this.anInt4699 = 0;
					this.method9052();
					arg0 = this.anInt4697;
				}
				this.anInt4697 = 0;
				this.method3956();
			} else {
				this.anInt4691 += this.anInt4695 * arg0;
				this.anInt4692 += this.anInt4686 * arg0;
				this.anInt4699 += this.anInt4694 * arg0;
				this.anInt4697 -= arg0;
			}
		}
		@Pc(71) Class5_Sub42_Sub1 local71 = (Class5_Sub42_Sub1) super.aClass5_Sub42_6;
		@Pc(76) int local76 = this.anInt4690 << 8;
		@Pc(81) int local81 = this.anInt4689 << 8;
		@Pc(87) int local87 = local71.aByteArray67.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4696 = 0;
		}
		if (this.anInt4688 < 0) {
			if (this.anInt4693 <= 0) {
				this.method3935();
				this.method9052();
				return;
			}
			this.anInt4688 = 0;
		}
		if (this.anInt4688 >= local87) {
			if (this.anInt4693 >= 0) {
				this.method3935();
				this.method9052();
				return;
			}
			this.anInt4688 = local87 - 1;
		}
		this.anInt4688 += this.anInt4693 * arg0;
		if (this.anInt4696 >= 0) {
			if (this.anInt4696 > 0) {
				if (this.aBoolean392) {
					label125: {
						if (this.anInt4693 < 0) {
							if (this.anInt4688 >= local76) {
								return;
							}
							this.anInt4688 = local76 + local76 - this.anInt4688 - 1;
							this.anInt4693 = -this.anInt4693;
							if (--this.anInt4696 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4688 < local81) {
								return;
							}
							this.anInt4688 = local81 + local81 - this.anInt4688 - 1;
							this.anInt4693 = -this.anInt4693;
							if (--this.anInt4696 == 0) {
								break;
							}
							if (this.anInt4688 >= local76) {
								return;
							}
							this.anInt4688 = local76 + local76 - this.anInt4688 - 1;
							this.anInt4693 = -this.anInt4693;
						} while (--this.anInt4696 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4693 < 0) {
						if (this.anInt4688 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4688 - 1) / local91;
						if (local361 < this.anInt4696) {
							this.anInt4688 += local91 * local361;
							this.anInt4696 -= local361;
							return;
						}
						this.anInt4688 += local91 * this.anInt4696;
						this.anInt4696 = 0;
					} else if (this.anInt4688 >= local81) {
						local361 = (this.anInt4688 - local76) / local91;
						if (local361 < this.anInt4696) {
							this.anInt4688 -= local91 * local361;
							this.anInt4696 -= local361;
							return;
						}
						this.anInt4688 -= local91 * this.anInt4696;
						this.anInt4696 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4693 < 0) {
				if (this.anInt4688 < 0) {
					this.anInt4688 = -1;
					this.method3935();
					this.method9052();
					return;
				}
			} else if (this.anInt4688 >= local87) {
				this.anInt4688 = local87;
				this.method3935();
				this.method9052();
			}
		} else if (this.aBoolean392) {
			if (this.anInt4693 < 0) {
				if (this.anInt4688 >= local76) {
					return;
				}
				this.anInt4688 = local76 + local76 - this.anInt4688 - 1;
				this.anInt4693 = -this.anInt4693;
			}
			while (this.anInt4688 >= local81) {
				this.anInt4688 = local81 + local81 - this.anInt4688 - 1;
				this.anInt4693 = -this.anInt4693;
				if (this.anInt4688 >= local76) {
					return;
				}
				this.anInt4688 = local76 + local76 - this.anInt4688 - 1;
				this.anInt4693 = -this.anInt4693;
			}
		} else if (this.anInt4693 < 0) {
			if (this.anInt4688 < local76) {
				this.anInt4688 = local81 - (local81 - 1 - this.anInt4688) % local91 - 1;
			}
		} else if (this.anInt4688 >= local81) {
			this.anInt4688 = local76 + (this.anInt4688 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "(I)V")
	public synchronized void method3969(@OriginalArg(0) int arg0) {
		this.anInt4696 = arg0;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(III)V")
	public synchronized void method3970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3954(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static684.method3947(arg1, arg2);
		@Pc(14) int local14 = Static684.method3944(arg1, arg2);
		if (this.anInt4692 == local10 && this.anInt4699 == local14) {
			this.anInt4697 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4691;
		if (this.anInt4691 - arg1 > local31) {
			local31 = this.anInt4691 - arg1;
		}
		if (local10 - this.anInt4692 > local31) {
			local31 = local10 - this.anInt4692;
		}
		if (this.anInt4692 - local10 > local31) {
			local31 = this.anInt4692 - local10;
		}
		if (local14 - this.anInt4699 > local31) {
			local31 = local14 - this.anInt4699;
		}
		if (this.anInt4699 - local14 > local31) {
			local31 = this.anInt4699 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4697 = arg0;
		this.anInt4687 = arg1;
		this.anInt4698 = arg2;
		this.anInt4695 = (arg1 - this.anInt4691) / arg0;
		this.anInt4686 = (local10 - this.anInt4692) / arg0;
		this.anInt4694 = (local14 - this.anInt4699) / arg0;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "()I")
	@Override
	public int method6651() {
		@Pc(6) int local6 = this.anInt4691 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4696 == 0) {
			local6 -= local6 * this.anInt4688 / (((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67.length << 8);
		} else if (this.anInt4696 >= 0) {
			local6 -= local6 * this.anInt4690 / ((Class5_Sub42_Sub1) super.aClass5_Sub42_6).aByteArray67.length;
		}
		return local6 > 255 ? 255 : local6;
	}
}
