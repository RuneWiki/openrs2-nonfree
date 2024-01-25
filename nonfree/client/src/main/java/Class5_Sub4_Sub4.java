import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class5_Sub4_Sub4 extends Class5_Sub4 {

	@OriginalMember(owner = "client!it", name = "s", descriptor = "I")
	private int anInt4611;

	@OriginalMember(owner = "client!it", name = "w", descriptor = "I")
	private int anInt4615;

	@OriginalMember(owner = "client!it", name = "v", descriptor = "I")
	public int anInt4616;

	@OriginalMember(owner = "client!it", name = "x", descriptor = "I")
	public int anInt4617;

	@OriginalMember(owner = "client!it", name = "y", descriptor = "I")
	public int anInt4620;

	@OriginalMember(owner = "client!it", name = "E", descriptor = "I")
	public int anInt4621;

	@OriginalMember(owner = "client!it", name = "B", descriptor = "I")
	public int anInt4622;

	@OriginalMember(owner = "client!it", name = "D", descriptor = "I")
	public int anInt4623;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "I")
	private final int anInt4624;

	@OriginalMember(owner = "client!it", name = "A", descriptor = "I")
	private final int anInt4613;

	@OriginalMember(owner = "client!it", name = "t", descriptor = "Z")
	private final boolean aBoolean308;

	@OriginalMember(owner = "client!it", name = "u", descriptor = "I")
	private int anInt4619;

	@OriginalMember(owner = "client!it", name = "q", descriptor = "I")
	private int anInt4614;

	@OriginalMember(owner = "client!it", name = "z", descriptor = "I")
	private int anInt4618;

	@OriginalMember(owner = "client!it", name = "r", descriptor = "I")
	public int anInt4612;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!jg;III)V")
	public Class5_Sub4_Sub4(@OriginalArg(0) Class5_Sub27_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub27_6 = arg0;
		this.anInt4624 = arg0.anInt4766;
		this.anInt4613 = arg0.anInt4768;
		this.aBoolean308 = arg0.aBoolean316;
		this.anInt4619 = arg1;
		this.anInt4614 = arg2;
		this.anInt4618 = arg3;
		this.anInt4612 = 0;
		this.method4171();
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "()I")
	@Override
	public int method4708() {
		@Pc(6) int local6 = this.anInt4616 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4611 == 0) {
			local6 -= local6 * this.anInt4612 / (((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46.length << 8);
		} else if (this.anInt4611 >= 0) {
			local6 -= local6 * this.anInt4624 / ((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(II)V")
	public synchronized void method4142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4164(arg0, arg1, this.method4154());
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(II)V")
	private synchronized void method4144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4614 = arg0;
		this.anInt4618 = arg1;
		this.anInt4615 = 0;
		this.method4171();
	}

	@OriginalMember(owner = "client!it", name = "j", descriptor = "()Z")
	public boolean method4149() {
		return this.anInt4615 != 0;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4713(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4614 == 0 && this.anInt4615 == 0) {
			this.method4712(arg2);
			return;
		}
		@Pc(13) Class5_Sub27_Sub1 local13 = (Class5_Sub27_Sub1) super.aClass5_Sub27_6;
		@Pc(18) int local18 = this.anInt4624 << 8;
		@Pc(23) int local23 = this.anInt4613 << 8;
		@Pc(29) int local29 = local13.aByteArray46.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4611 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4612 < 0) {
			if (this.anInt4619 <= 0) {
				this.method4162();
				this.method9222();
				return;
			}
			this.anInt4612 = 0;
		}
		if (this.anInt4612 >= local29) {
			if (this.anInt4619 >= 0) {
				this.method4162();
				this.method9222();
				return;
			}
			this.anInt4612 = local29 - 1;
		}
		if (this.anInt4611 >= 0) {
			if (this.anInt4611 > 0) {
				if (this.aBoolean308) {
					label130: {
						if (this.anInt4619 < 0) {
							local40 = this.method4170(arg0, arg1, local18, local44, local13.aByteArray46[this.anInt4624]);
							if (this.anInt4612 >= local18) {
								return;
							}
							this.anInt4612 = local18 + local18 - this.anInt4612 - 1;
							this.anInt4619 = -this.anInt4619;
							if (--this.anInt4611 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4166(arg0, local40, local23, local44, local13.aByteArray46[this.anInt4613 - 1]);
							if (this.anInt4612 < local23) {
								return;
							}
							this.anInt4612 = local23 + local23 - this.anInt4612 - 1;
							this.anInt4619 = -this.anInt4619;
							if (--this.anInt4611 == 0) {
								break;
							}
							local40 = this.method4170(arg0, local40, local18, local44, local13.aByteArray46[this.anInt4624]);
							if (this.anInt4612 >= local18) {
								return;
							}
							this.anInt4612 = local18 + local18 - this.anInt4612 - 1;
							this.anInt4619 = -this.anInt4619;
						} while (--this.anInt4611 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4619 < 0) {
						while (true) {
							local40 = this.method4170(arg0, local40, local18, local44, local13.aByteArray46[this.anInt4613 - 1]);
							if (this.anInt4612 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4612 - 1) / local33;
							if (local416 >= this.anInt4611) {
								this.anInt4612 += local33 * this.anInt4611;
								this.anInt4611 = 0;
								break;
							}
							this.anInt4612 += local33 * local416;
							this.anInt4611 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4166(arg0, local40, local23, local44, local13.aByteArray46[this.anInt4624]);
							if (this.anInt4612 < local23) {
								return;
							}
							local416 = (this.anInt4612 - local18) / local33;
							if (local416 >= this.anInt4611) {
								this.anInt4612 -= local33 * this.anInt4611;
								this.anInt4611 = 0;
								break;
							}
							this.anInt4612 -= local33 * local416;
							this.anInt4611 -= local416;
						}
					}
				}
			}
			if (this.anInt4619 < 0) {
				this.method4170(arg0, local40, 0, local44, 0);
				if (this.anInt4612 < 0) {
					this.anInt4612 = -1;
					this.method4162();
					this.method9222();
					return;
				}
			} else {
				this.method4166(arg0, local40, local29, local44, 0);
				if (this.anInt4612 >= local29) {
					this.anInt4612 = local29;
					this.method4162();
					this.method9222();
				}
			}
		} else if (this.aBoolean308) {
			if (this.anInt4619 < 0) {
				local40 = this.method4170(arg0, arg1, local18, local44, local13.aByteArray46[this.anInt4624]);
				if (this.anInt4612 >= local18) {
					return;
				}
				this.anInt4612 = local18 + local18 - this.anInt4612 - 1;
				this.anInt4619 = -this.anInt4619;
			}
			while (true) {
				local40 = this.method4166(arg0, local40, local23, local44, local13.aByteArray46[this.anInt4613 - 1]);
				if (this.anInt4612 < local23) {
					return;
				}
				this.anInt4612 = local23 + local23 - this.anInt4612 - 1;
				this.anInt4619 = -this.anInt4619;
				local40 = this.method4170(arg0, local40, local18, local44, local13.aByteArray46[this.anInt4624]);
				if (this.anInt4612 >= local18) {
					return;
				}
				this.anInt4612 = local18 + local18 - this.anInt4612 - 1;
				this.anInt4619 = -this.anInt4619;
			}
		} else if (this.anInt4619 < 0) {
			while (true) {
				local40 = this.method4170(arg0, local40, local18, local44, local13.aByteArray46[this.anInt4613 - 1]);
				if (this.anInt4612 >= local18) {
					return;
				}
				this.anInt4612 = local23 - (local23 - 1 - this.anInt4612) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4166(arg0, local40, local23, local44, local13.aByteArray46[this.anInt4624]);
				if (this.anInt4612 < local23) {
					return;
				}
				this.anInt4612 = local18 + (this.anInt4612 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "k", descriptor = "()I")
	public synchronized int method4153() {
		return this.anInt4619 < 0 ? -this.anInt4619 : this.anInt4619;
	}

	@OriginalMember(owner = "client!it", name = "i", descriptor = "()I")
	public synchronized int method4154() {
		return this.anInt4618 < 0 ? -1 : this.anInt4618;
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V")
	public synchronized void method4155(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4176();
			this.method9222();
		} else if (this.anInt4620 == 0 && this.anInt4617 == 0) {
			this.anInt4615 = 0;
			this.anInt4614 = 0;
			this.anInt4616 = 0;
			this.method9222();
		} else {
			@Pc(31) int local31 = -this.anInt4616;
			if (this.anInt4616 > local31) {
				local31 = this.anInt4616;
			}
			if (-this.anInt4620 > local31) {
				local31 = -this.anInt4620;
			}
			if (this.anInt4620 > local31) {
				local31 = this.anInt4620;
			}
			if (-this.anInt4617 > local31) {
				local31 = -this.anInt4617;
			}
			if (this.anInt4617 > local31) {
				local31 = this.anInt4617;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4615 = arg0;
			this.anInt4614 = Integer.MIN_VALUE;
			this.anInt4623 = -this.anInt4616 / arg0;
			this.anInt4621 = -this.anInt4620 / arg0;
			this.anInt4622 = -this.anInt4617 / arg0;
		}
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "()Lclient!ef;")
	@Override
	public Class5_Sub4 method4711() {
		return null;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
	public synchronized void method4157() {
		this.anInt4619 = (this.anInt4619 ^ this.anInt4619 >> 31) + (this.anInt4619 >>> 31);
		this.anInt4619 = -this.anInt4619;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	public synchronized void method4158(@OriginalArg(0) int arg0) {
		this.method4144(arg0 << 6, this.method4154());
	}

	@OriginalMember(owner = "client!it", name = "g", descriptor = "()Z")
	private boolean method4159() {
		@Pc(2) int local2 = this.anInt4614;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static688.method4150(local2, this.anInt4618);
			local8 = Static688.method4143(local2, this.anInt4618);
		}
		if (this.anInt4616 != local2 || this.anInt4620 != local10 || this.anInt4617 != local8) {
			if (this.anInt4616 < local2) {
				this.anInt4623 = 1;
				this.anInt4615 = local2 - this.anInt4616;
			} else if (this.anInt4616 > local2) {
				this.anInt4623 = -1;
				this.anInt4615 = this.anInt4616 - local2;
			} else {
				this.anInt4623 = 0;
			}
			if (this.anInt4620 < local10) {
				this.anInt4621 = 1;
				if (this.anInt4615 == 0 || this.anInt4615 > local10 - this.anInt4620) {
					this.anInt4615 = local10 - this.anInt4620;
				}
			} else if (this.anInt4620 > local10) {
				this.anInt4621 = -1;
				if (this.anInt4615 == 0 || this.anInt4615 > this.anInt4620 - local10) {
					this.anInt4615 = this.anInt4620 - local10;
				}
			} else {
				this.anInt4621 = 0;
			}
			if (this.anInt4617 < local8) {
				this.anInt4622 = 1;
				if (this.anInt4615 == 0 || this.anInt4615 > local8 - this.anInt4617) {
					this.anInt4615 = local8 - this.anInt4617;
				}
			} else if (this.anInt4617 > local8) {
				this.anInt4622 = -1;
				if (this.anInt4615 == 0 || this.anInt4615 > this.anInt4617 - local8) {
					this.anInt4615 = this.anInt4617 - local8;
				}
			} else {
				this.anInt4622 = 0;
			}
			return false;
		} else if (this.anInt4614 == Integer.MIN_VALUE) {
			this.anInt4614 = 0;
			this.anInt4616 = this.anInt4620 = this.anInt4617 = 0;
			this.method9222();
			return true;
		} else {
			this.method4171();
			return false;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "()Lclient!ef;")
	@Override
	public Class5_Sub4 method4714() {
		return null;
	}

	@OriginalMember(owner = "client!it", name = "h", descriptor = "()Z")
	public boolean method4161() {
		return this.anInt4612 < 0 || this.anInt4612 >= ((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46.length << 8;
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "()V")
	private void method4162() {
		if (this.anInt4615 == 0) {
			return;
		}
		if (this.anInt4614 == Integer.MIN_VALUE) {
			this.anInt4614 = 0;
		}
		this.anInt4615 = 0;
		this.method4171();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
	public synchronized void method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4144(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static688.method4150(arg1, arg2);
		@Pc(14) int local14 = Static688.method4143(arg1, arg2);
		if (this.anInt4620 == local10 && this.anInt4617 == local14) {
			this.anInt4615 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4616;
		if (this.anInt4616 - arg1 > local31) {
			local31 = this.anInt4616 - arg1;
		}
		if (local10 - this.anInt4620 > local31) {
			local31 = local10 - this.anInt4620;
		}
		if (this.anInt4620 - local10 > local31) {
			local31 = this.anInt4620 - local10;
		}
		if (local14 - this.anInt4617 > local31) {
			local31 = local14 - this.anInt4617;
		}
		if (this.anInt4617 - local14 > local31) {
			local31 = this.anInt4617 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4615 = arg0;
		this.anInt4614 = arg1;
		this.anInt4618 = arg2;
		this.anInt4623 = (arg1 - this.anInt4616) / arg0;
		this.anInt4621 = (local10 - this.anInt4620) / arg0;
		this.anInt4622 = (local14 - this.anInt4617) / arg0;
	}

	@OriginalMember(owner = "client!it", name = "l", descriptor = "(I)V")
	public synchronized void method4165(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4612 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([IIIII)I")
	private int method4166(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4615 <= 0) {
				if (this.anInt4619 == 256 && (this.anInt4612 & 0xFF) == 0) {
					if (Static404.aBoolean460) {
						return Static688.method4151(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4620, this.anInt4617, arg3, arg2, this);
					}
					return Static688.method4152(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4616, arg3, arg2, this);
				}
				if (Static404.aBoolean460) {
					return Static688.method4179(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4620, this.anInt4617, arg3, arg2, this, this.anInt4619, arg4);
				}
				return Static688.method4177(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4616, arg3, arg2, this, this.anInt4619, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4615;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4615 += arg1;
			if (this.anInt4619 == 256 && (this.anInt4612 & 0xFF) == 0) {
				if (Static404.aBoolean460) {
					arg1 = Static688.method4178(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4620, this.anInt4617, this.anInt4621, this.anInt4622, local5, arg2, this);
				} else {
					arg1 = Static688.method4173(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4616, this.anInt4623, local5, arg2, this);
				}
			} else if (Static404.aBoolean460) {
				arg1 = Static688.method4156(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4620, this.anInt4617, this.anInt4621, this.anInt4622, local5, arg2, this, this.anInt4619, arg4);
			} else {
				arg1 = Static688.method4140(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4616, this.anInt4623, local5, arg2, this, this.anInt4619, arg4);
			}
			this.anInt4615 -= arg1;
			if (this.anInt4615 != 0) {
				return arg1;
			}
		} while (!this.method4159());
		return arg3;
	}

	@OriginalMember(owner = "client!it", name = "k", descriptor = "(I)V")
	public synchronized void method4168(@OriginalArg(0) int arg0) {
		this.anInt4611 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(I)V")
	public synchronized void method4169(@OriginalArg(0) int arg0) {
		if (this.anInt4619 < 0) {
			this.anInt4619 = -arg0;
		} else {
			this.anInt4619 = arg0;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4712(@OriginalArg(0) int arg0) {
		if (this.anInt4615 > 0) {
			if (arg0 >= this.anInt4615) {
				if (this.anInt4614 == Integer.MIN_VALUE) {
					this.anInt4614 = 0;
					this.anInt4616 = this.anInt4620 = this.anInt4617 = 0;
					this.method9222();
					arg0 = this.anInt4615;
				}
				this.anInt4615 = 0;
				this.method4171();
			} else {
				this.anInt4616 += this.anInt4623 * arg0;
				this.anInt4620 += this.anInt4621 * arg0;
				this.anInt4617 += this.anInt4622 * arg0;
				this.anInt4615 -= arg0;
			}
		}
		@Pc(71) Class5_Sub27_Sub1 local71 = (Class5_Sub27_Sub1) super.aClass5_Sub27_6;
		@Pc(76) int local76 = this.anInt4624 << 8;
		@Pc(81) int local81 = this.anInt4613 << 8;
		@Pc(87) int local87 = local71.aByteArray46.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4611 = 0;
		}
		if (this.anInt4612 < 0) {
			if (this.anInt4619 <= 0) {
				this.method4162();
				this.method9222();
				return;
			}
			this.anInt4612 = 0;
		}
		if (this.anInt4612 >= local87) {
			if (this.anInt4619 >= 0) {
				this.method4162();
				this.method9222();
				return;
			}
			this.anInt4612 = local87 - 1;
		}
		this.anInt4612 += this.anInt4619 * arg0;
		if (this.anInt4611 >= 0) {
			if (this.anInt4611 > 0) {
				if (this.aBoolean308) {
					label125: {
						if (this.anInt4619 < 0) {
							if (this.anInt4612 >= local76) {
								return;
							}
							this.anInt4612 = local76 + local76 - this.anInt4612 - 1;
							this.anInt4619 = -this.anInt4619;
							if (--this.anInt4611 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4612 < local81) {
								return;
							}
							this.anInt4612 = local81 + local81 - this.anInt4612 - 1;
							this.anInt4619 = -this.anInt4619;
							if (--this.anInt4611 == 0) {
								break;
							}
							if (this.anInt4612 >= local76) {
								return;
							}
							this.anInt4612 = local76 + local76 - this.anInt4612 - 1;
							this.anInt4619 = -this.anInt4619;
						} while (--this.anInt4611 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4619 < 0) {
						if (this.anInt4612 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4612 - 1) / local91;
						if (local361 < this.anInt4611) {
							this.anInt4612 += local91 * local361;
							this.anInt4611 -= local361;
							return;
						}
						this.anInt4612 += local91 * this.anInt4611;
						this.anInt4611 = 0;
					} else if (this.anInt4612 >= local81) {
						local361 = (this.anInt4612 - local76) / local91;
						if (local361 < this.anInt4611) {
							this.anInt4612 -= local91 * local361;
							this.anInt4611 -= local361;
							return;
						}
						this.anInt4612 -= local91 * this.anInt4611;
						this.anInt4611 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4619 < 0) {
				if (this.anInt4612 < 0) {
					this.anInt4612 = -1;
					this.method4162();
					this.method9222();
					return;
				}
			} else if (this.anInt4612 >= local87) {
				this.anInt4612 = local87;
				this.method4162();
				this.method9222();
			}
		} else if (this.aBoolean308) {
			if (this.anInt4619 < 0) {
				if (this.anInt4612 >= local76) {
					return;
				}
				this.anInt4612 = local76 + local76 - this.anInt4612 - 1;
				this.anInt4619 = -this.anInt4619;
			}
			while (this.anInt4612 >= local81) {
				this.anInt4612 = local81 + local81 - this.anInt4612 - 1;
				this.anInt4619 = -this.anInt4619;
				if (this.anInt4612 >= local76) {
					return;
				}
				this.anInt4612 = local76 + local76 - this.anInt4612 - 1;
				this.anInt4619 = -this.anInt4619;
			}
		} else if (this.anInt4619 < 0) {
			if (this.anInt4612 < local76) {
				this.anInt4612 = local81 - (local81 - 1 - this.anInt4612) % local91 - 1;
			}
		} else if (this.anInt4612 >= local81) {
			this.anInt4612 = local76 + (this.anInt4612 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "([IIIII)I")
	private int method4170(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4615 <= 0) {
				if (this.anInt4619 == -256 && (this.anInt4612 & 0xFF) == 0) {
					if (Static404.aBoolean460) {
						return Static688.method4147(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4620, this.anInt4617, arg3, arg2, this);
					}
					return Static688.method4163(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4616, arg3, arg2, this);
				}
				if (Static404.aBoolean460) {
					return Static688.method4141(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4620, this.anInt4617, arg3, arg2, this, this.anInt4619, arg4);
				}
				return Static688.method4146(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4616, arg3, arg2, this, this.anInt4619, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4615;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4615 += arg1;
			if (this.anInt4619 == -256 && (this.anInt4612 & 0xFF) == 0) {
				if (Static404.aBoolean460) {
					arg1 = Static688.method4145(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4620, this.anInt4617, this.anInt4621, this.anInt4622, local5, arg2, this);
				} else {
					arg1 = Static688.method4160(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4616, this.anInt4623, local5, arg2, this);
				}
			} else if (Static404.aBoolean460) {
				arg1 = Static688.method4148(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4620, this.anInt4617, this.anInt4621, this.anInt4622, local5, arg2, this, this.anInt4619, arg4);
			} else {
				arg1 = Static688.method4167(((Class5_Sub27_Sub1) super.aClass5_Sub27_6).aByteArray46, arg0, this.anInt4612, arg1, this.anInt4616, this.anInt4623, local5, arg2, this, this.anInt4619, arg4);
			}
			this.anInt4615 -= arg1;
			if (this.anInt4615 != 0) {
				return arg1;
			}
		} while (!this.method4159());
		return arg3;
	}

	@OriginalMember(owner = "client!it", name = "l", descriptor = "()V")
	private void method4171() {
		this.anInt4616 = this.anInt4614;
		this.anInt4620 = Static688.method4150(this.anInt4614, this.anInt4618);
		this.anInt4617 = Static688.method4143(this.anInt4614, this.anInt4618);
	}

	@OriginalMember(owner = "client!it", name = "f", descriptor = "()I")
	public synchronized int method4174() {
		return this.anInt4614 == Integer.MIN_VALUE ? 0 : this.anInt4614;
	}

	@OriginalMember(owner = "client!it", name = "j", descriptor = "(I)V")
	public synchronized void method4175(@OriginalArg(0) int arg0) {
		this.method4144(this.method4174(), arg0);
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	private synchronized void method4176() {
		this.method4144(0, this.method4154());
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "()I")
	@Override
	public int method4710() {
		return this.anInt4614 == 0 && this.anInt4615 == 0 ? 0 : 1;
	}
}
