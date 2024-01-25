import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class2_Sub8_Sub5 extends Class2_Sub8 {

	@OriginalMember(owner = "client!via", name = "t", descriptor = "I")
	public int anInt10585;

	@OriginalMember(owner = "client!via", name = "u", descriptor = "I")
	public int anInt10586;

	@OriginalMember(owner = "client!via", name = "v", descriptor = "I")
	private int anInt10587;

	@OriginalMember(owner = "client!via", name = "w", descriptor = "I")
	public int anInt10588;

	@OriginalMember(owner = "client!via", name = "x", descriptor = "I")
	public int anInt10589;

	@OriginalMember(owner = "client!via", name = "z", descriptor = "I")
	public int anInt10591;

	@OriginalMember(owner = "client!via", name = "B", descriptor = "I")
	public int anInt10593;

	@OriginalMember(owner = "client!via", name = "D", descriptor = "I")
	private int anInt10595;

	@OriginalMember(owner = "client!via", name = "y", descriptor = "I")
	private final int anInt10590;

	@OriginalMember(owner = "client!via", name = "F", descriptor = "I")
	private final int anInt10596;

	@OriginalMember(owner = "client!via", name = "E", descriptor = "Z")
	private final boolean aBoolean724;

	@OriginalMember(owner = "client!via", name = "C", descriptor = "I")
	private int anInt10594;

	@OriginalMember(owner = "client!via", name = "s", descriptor = "I")
	private int anInt10584;

	@OriginalMember(owner = "client!via", name = "A", descriptor = "I")
	private int anInt10592;

	@OriginalMember(owner = "client!via", name = "G", descriptor = "I")
	public int anInt10597;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!ob;III)V")
	public Class2_Sub8_Sub5(@OriginalArg(0) Class2_Sub29_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub29_6 = arg0;
		this.anInt10590 = arg0.anInt7489;
		this.anInt10596 = arg0.anInt7488;
		this.aBoolean724 = arg0.aBoolean543;
		this.anInt10594 = arg1;
		this.anInt10584 = arg2;
		this.anInt10592 = arg3;
		this.anInt10597 = 0;
		this.method8851();
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(III)V")
	public synchronized void method8821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method8859(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static654.method8837(arg1, arg2);
		@Pc(14) int local14 = Static654.method8822(arg1, arg2);
		if (this.anInt10585 == local10 && this.anInt10589 == local14) {
			this.anInt10587 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt10591;
		if (this.anInt10591 - arg1 > local31) {
			local31 = this.anInt10591 - arg1;
		}
		if (local10 - this.anInt10585 > local31) {
			local31 = local10 - this.anInt10585;
		}
		if (this.anInt10585 - local10 > local31) {
			local31 = this.anInt10585 - local10;
		}
		if (local14 - this.anInt10589 > local31) {
			local31 = local14 - this.anInt10589;
		}
		if (this.anInt10589 - local14 > local31) {
			local31 = this.anInt10589 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt10587 = arg0;
		this.anInt10584 = arg1;
		this.anInt10592 = arg2;
		this.anInt10588 = (arg1 - this.anInt10591) / arg0;
		this.anInt10586 = (local10 - this.anInt10585) / arg0;
		this.anInt10593 = (local14 - this.anInt10589) / arg0;
	}

	@OriginalMember(owner = "client!via", name = "e", descriptor = "()Z")
	public boolean method8823() {
		return this.anInt10597 < 0 || this.anInt10597 >= ((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97.length << 8;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Z)V")
	public synchronized void method8824() {
		this.anInt10594 = (this.anInt10594 ^ this.anInt10594 >> 31) + (this.anInt10594 >>> 31);
		this.anInt10594 = -this.anInt10594;
	}

	@OriginalMember(owner = "client!via", name = "f", descriptor = "()I")
	public synchronized int method8825() {
		return this.anInt10592 < 0 ? -1 : this.anInt10592;
	}

	@OriginalMember(owner = "client!via", name = "c", descriptor = "()I")
	@Override
	public int method8819() {
		@Pc(6) int local6 = this.anInt10591 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt10595 == 0) {
			local6 -= local6 * this.anInt10597 / (((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97.length << 8);
		} else if (this.anInt10595 >= 0) {
			local6 -= local6 * this.anInt10590 / ((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!via", name = "g", descriptor = "()Z")
	public boolean method8828() {
		return this.anInt10587 != 0;
	}

	@OriginalMember(owner = "client!via", name = "h", descriptor = "()V")
	private void method8829() {
		if (this.anInt10587 == 0) {
			return;
		}
		if (this.anInt10584 == Integer.MIN_VALUE) {
			this.anInt10584 = 0;
		}
		this.anInt10587 = 0;
		this.method8851();
	}

	@OriginalMember(owner = "client!via", name = "i", descriptor = "()Z")
	private boolean method8831() {
		@Pc(2) int local2 = this.anInt10584;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static654.method8837(local2, this.anInt10592);
			local8 = Static654.method8822(local2, this.anInt10592);
		}
		if (this.anInt10591 != local2 || this.anInt10585 != local10 || this.anInt10589 != local8) {
			if (this.anInt10591 < local2) {
				this.anInt10588 = 1;
				this.anInt10587 = local2 - this.anInt10591;
			} else if (this.anInt10591 > local2) {
				this.anInt10588 = -1;
				this.anInt10587 = this.anInt10591 - local2;
			} else {
				this.anInt10588 = 0;
			}
			if (this.anInt10585 < local10) {
				this.anInt10586 = 1;
				if (this.anInt10587 == 0 || this.anInt10587 > local10 - this.anInt10585) {
					this.anInt10587 = local10 - this.anInt10585;
				}
			} else if (this.anInt10585 > local10) {
				this.anInt10586 = -1;
				if (this.anInt10587 == 0 || this.anInt10587 > this.anInt10585 - local10) {
					this.anInt10587 = this.anInt10585 - local10;
				}
			} else {
				this.anInt10586 = 0;
			}
			if (this.anInt10589 < local8) {
				this.anInt10593 = 1;
				if (this.anInt10587 == 0 || this.anInt10587 > local8 - this.anInt10589) {
					this.anInt10587 = local8 - this.anInt10589;
				}
			} else if (this.anInt10589 > local8) {
				this.anInt10593 = -1;
				if (this.anInt10587 == 0 || this.anInt10587 > this.anInt10589 - local8) {
					this.anInt10587 = this.anInt10589 - local8;
				}
			} else {
				this.anInt10593 = 0;
			}
			return false;
		} else if (this.anInt10584 == Integer.MIN_VALUE) {
			this.anInt10584 = 0;
			this.anInt10591 = this.anInt10585 = this.anInt10589 = 0;
			this.method9253();
			return true;
		} else {
			this.method8851();
			return false;
		}
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V")
	public synchronized void method8834(@OriginalArg(0) int arg0) {
		if (this.anInt10594 < 0) {
			this.anInt10594 = -arg0;
		} else {
			this.anInt10594 = arg0;
		}
	}

	@OriginalMember(owner = "client!via", name = "d", descriptor = "(I)V")
	public synchronized void method8835(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method8856();
			this.method9253();
		} else if (this.anInt10585 == 0 && this.anInt10589 == 0) {
			this.anInt10587 = 0;
			this.anInt10584 = 0;
			this.anInt10591 = 0;
			this.method9253();
		} else {
			@Pc(31) int local31 = -this.anInt10591;
			if (this.anInt10591 > local31) {
				local31 = this.anInt10591;
			}
			if (-this.anInt10585 > local31) {
				local31 = -this.anInt10585;
			}
			if (this.anInt10585 > local31) {
				local31 = this.anInt10585;
			}
			if (-this.anInt10589 > local31) {
				local31 = -this.anInt10589;
			}
			if (this.anInt10589 > local31) {
				local31 = this.anInt10589;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt10587 = arg0;
			this.anInt10584 = Integer.MIN_VALUE;
			this.anInt10588 = -this.anInt10591 / arg0;
			this.anInt10586 = -this.anInt10585 / arg0;
			this.anInt10593 = -this.anInt10589 / arg0;
		}
	}

	@OriginalMember(owner = "client!via", name = "d", descriptor = "()I")
	@Override
	public int method8820() {
		return this.anInt10584 == 0 && this.anInt10587 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!via", name = "j", descriptor = "()I")
	public synchronized int method8839() {
		return this.anInt10584 == Integer.MIN_VALUE ? 0 : this.anInt10584;
	}

	@OriginalMember(owner = "client!via", name = "e", descriptor = "(I)V")
	public synchronized void method8842(@OriginalArg(0) int arg0) {
		this.method8859(this.method8839(), arg0);
	}

	@OriginalMember(owner = "client!via", name = "k", descriptor = "()I")
	public synchronized int method8847() {
		return this.anInt10594 < 0 ? -this.anInt10594 : this.anInt10594;
	}

	@OriginalMember(owner = "client!via", name = "f", descriptor = "(I)V")
	public synchronized void method8848(@OriginalArg(0) int arg0) {
		this.method8859(arg0 << 6, this.method8825());
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "()Lclient!jba;")
	@Override
	public Class2_Sub8 method8817() {
		return null;
	}

	@OriginalMember(owner = "client!via", name = "e", descriptor = "(II)V")
	public synchronized void method8849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method8821(arg0, arg1, this.method8825());
	}

	@OriginalMember(owner = "client!via", name = "g", descriptor = "(I)V")
	public synchronized void method8850(@OriginalArg(0) int arg0) {
		this.anInt10595 = arg0;
	}

	@OriginalMember(owner = "client!via", name = "l", descriptor = "()V")
	private void method8851() {
		this.anInt10591 = this.anInt10584;
		this.anInt10585 = Static654.method8837(this.anInt10584, this.anInt10592);
		this.anInt10589 = Static654.method8822(this.anInt10584, this.anInt10592);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "([IIIII)I")
	private int method8852(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt10587 <= 0) {
				if (this.anInt10594 == 256 && (this.anInt10597 & 0xFF) == 0) {
					if (Static600.aBoolean722) {
						return Static654.method8843(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10585, this.anInt10589, arg3, arg2, this);
					}
					return Static654.method8838(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10591, arg3, arg2, this);
				}
				if (Static600.aBoolean722) {
					return Static654.method8855(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10585, this.anInt10589, arg3, arg2, this, this.anInt10594, arg4);
				}
				return Static654.method8858(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10591, arg3, arg2, this, this.anInt10594, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt10587;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt10587 += arg1;
			if (this.anInt10594 == 256 && (this.anInt10597 & 0xFF) == 0) {
				if (Static600.aBoolean722) {
					arg1 = Static654.method8826(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10585, this.anInt10589, this.anInt10586, this.anInt10593, local5, arg2, this);
				} else {
					arg1 = Static654.method8846(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10591, this.anInt10588, local5, arg2, this);
				}
			} else if (Static600.aBoolean722) {
				arg1 = Static654.method8832(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10585, this.anInt10589, this.anInt10586, this.anInt10593, local5, arg2, this, this.anInt10594, arg4);
			} else {
				arg1 = Static654.method8836(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10591, this.anInt10588, local5, arg2, this, this.anInt10594, arg4);
			}
			this.anInt10587 -= arg1;
			if (this.anInt10587 != 0) {
				return arg1;
			}
		} while (!this.method8831());
		return arg3;
	}

	@OriginalMember(owner = "client!via", name = "h", descriptor = "(I)V")
	private synchronized void method8856() {
		this.method8859(0, this.method8825());
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8816(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt10584 == 0 && this.anInt10587 == 0) {
			this.method8818(arg2);
			return;
		}
		@Pc(13) Class2_Sub29_Sub1 local13 = (Class2_Sub29_Sub1) super.aClass2_Sub29_6;
		@Pc(18) int local18 = this.anInt10590 << 8;
		@Pc(23) int local23 = this.anInt10596 << 8;
		@Pc(29) int local29 = local13.aByteArray97.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt10595 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt10597 < 0) {
			if (this.anInt10594 <= 0) {
				this.method8829();
				this.method9253();
				return;
			}
			this.anInt10597 = 0;
		}
		if (this.anInt10597 >= local29) {
			if (this.anInt10594 >= 0) {
				this.method8829();
				this.method9253();
				return;
			}
			this.anInt10597 = local29 - 1;
		}
		if (this.anInt10595 >= 0) {
			if (this.anInt10595 > 0) {
				if (this.aBoolean724) {
					label130: {
						if (this.anInt10594 < 0) {
							local40 = this.method8860(arg0, arg1, local18, local44, local13.aByteArray97[this.anInt10590]);
							if (this.anInt10597 >= local18) {
								return;
							}
							this.anInt10597 = local18 + local18 - this.anInt10597 - 1;
							this.anInt10594 = -this.anInt10594;
							if (--this.anInt10595 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method8852(arg0, local40, local23, local44, local13.aByteArray97[this.anInt10596 - 1]);
							if (this.anInt10597 < local23) {
								return;
							}
							this.anInt10597 = local23 + local23 - this.anInt10597 - 1;
							this.anInt10594 = -this.anInt10594;
							if (--this.anInt10595 == 0) {
								break;
							}
							local40 = this.method8860(arg0, local40, local18, local44, local13.aByteArray97[this.anInt10590]);
							if (this.anInt10597 >= local18) {
								return;
							}
							this.anInt10597 = local18 + local18 - this.anInt10597 - 1;
							this.anInt10594 = -this.anInt10594;
						} while (--this.anInt10595 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt10594 < 0) {
						while (true) {
							local40 = this.method8860(arg0, local40, local18, local44, local13.aByteArray97[this.anInt10596 - 1]);
							if (this.anInt10597 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt10597 - 1) / local33;
							if (local416 >= this.anInt10595) {
								this.anInt10597 += local33 * this.anInt10595;
								this.anInt10595 = 0;
								break;
							}
							this.anInt10597 += local33 * local416;
							this.anInt10595 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method8852(arg0, local40, local23, local44, local13.aByteArray97[this.anInt10590]);
							if (this.anInt10597 < local23) {
								return;
							}
							local416 = (this.anInt10597 - local18) / local33;
							if (local416 >= this.anInt10595) {
								this.anInt10597 -= local33 * this.anInt10595;
								this.anInt10595 = 0;
								break;
							}
							this.anInt10597 -= local33 * local416;
							this.anInt10595 -= local416;
						}
					}
				}
			}
			if (this.anInt10594 < 0) {
				this.method8860(arg0, local40, 0, local44, 0);
				if (this.anInt10597 < 0) {
					this.anInt10597 = -1;
					this.method8829();
					this.method9253();
					return;
				}
			} else {
				this.method8852(arg0, local40, local29, local44, 0);
				if (this.anInt10597 >= local29) {
					this.anInt10597 = local29;
					this.method8829();
					this.method9253();
				}
			}
		} else if (this.aBoolean724) {
			if (this.anInt10594 < 0) {
				local40 = this.method8860(arg0, arg1, local18, local44, local13.aByteArray97[this.anInt10590]);
				if (this.anInt10597 >= local18) {
					return;
				}
				this.anInt10597 = local18 + local18 - this.anInt10597 - 1;
				this.anInt10594 = -this.anInt10594;
			}
			while (true) {
				local40 = this.method8852(arg0, local40, local23, local44, local13.aByteArray97[this.anInt10596 - 1]);
				if (this.anInt10597 < local23) {
					return;
				}
				this.anInt10597 = local23 + local23 - this.anInt10597 - 1;
				this.anInt10594 = -this.anInt10594;
				local40 = this.method8860(arg0, local40, local18, local44, local13.aByteArray97[this.anInt10590]);
				if (this.anInt10597 >= local18) {
					return;
				}
				this.anInt10597 = local18 + local18 - this.anInt10597 - 1;
				this.anInt10594 = -this.anInt10594;
			}
		} else if (this.anInt10594 < 0) {
			while (true) {
				local40 = this.method8860(arg0, local40, local18, local44, local13.aByteArray97[this.anInt10596 - 1]);
				if (this.anInt10597 >= local18) {
					return;
				}
				this.anInt10597 = local23 - (local23 - 1 - this.anInt10597) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method8852(arg0, local40, local23, local44, local13.aByteArray97[this.anInt10590]);
				if (this.anInt10597 < local23) {
					return;
				}
				this.anInt10597 = local18 + (this.anInt10597 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!via", name = "i", descriptor = "(I)V")
	public synchronized void method8857(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt10597 = arg0;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "()Lclient!jba;")
	@Override
	public Class2_Sub8 method8815() {
		return null;
	}

	@OriginalMember(owner = "client!via", name = "f", descriptor = "(II)V")
	private synchronized void method8859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10584 = arg0;
		this.anInt10592 = arg1;
		this.anInt10587 = 0;
		this.method8851();
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8818(@OriginalArg(0) int arg0) {
		if (this.anInt10587 > 0) {
			if (arg0 >= this.anInt10587) {
				if (this.anInt10584 == Integer.MIN_VALUE) {
					this.anInt10584 = 0;
					this.anInt10591 = this.anInt10585 = this.anInt10589 = 0;
					this.method9253();
					arg0 = this.anInt10587;
				}
				this.anInt10587 = 0;
				this.method8851();
			} else {
				this.anInt10591 += this.anInt10588 * arg0;
				this.anInt10585 += this.anInt10586 * arg0;
				this.anInt10589 += this.anInt10593 * arg0;
				this.anInt10587 -= arg0;
			}
		}
		@Pc(71) Class2_Sub29_Sub1 local71 = (Class2_Sub29_Sub1) super.aClass2_Sub29_6;
		@Pc(76) int local76 = this.anInt10590 << 8;
		@Pc(81) int local81 = this.anInt10596 << 8;
		@Pc(87) int local87 = local71.aByteArray97.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt10595 = 0;
		}
		if (this.anInt10597 < 0) {
			if (this.anInt10594 <= 0) {
				this.method8829();
				this.method9253();
				return;
			}
			this.anInt10597 = 0;
		}
		if (this.anInt10597 >= local87) {
			if (this.anInt10594 >= 0) {
				this.method8829();
				this.method9253();
				return;
			}
			this.anInt10597 = local87 - 1;
		}
		this.anInt10597 += this.anInt10594 * arg0;
		if (this.anInt10595 >= 0) {
			if (this.anInt10595 > 0) {
				if (this.aBoolean724) {
					label125: {
						if (this.anInt10594 < 0) {
							if (this.anInt10597 >= local76) {
								return;
							}
							this.anInt10597 = local76 + local76 - this.anInt10597 - 1;
							this.anInt10594 = -this.anInt10594;
							if (--this.anInt10595 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt10597 < local81) {
								return;
							}
							this.anInt10597 = local81 + local81 - this.anInt10597 - 1;
							this.anInt10594 = -this.anInt10594;
							if (--this.anInt10595 == 0) {
								break;
							}
							if (this.anInt10597 >= local76) {
								return;
							}
							this.anInt10597 = local76 + local76 - this.anInt10597 - 1;
							this.anInt10594 = -this.anInt10594;
						} while (--this.anInt10595 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt10594 < 0) {
						if (this.anInt10597 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt10597 - 1) / local91;
						if (local361 < this.anInt10595) {
							this.anInt10597 += local91 * local361;
							this.anInt10595 -= local361;
							return;
						}
						this.anInt10597 += local91 * this.anInt10595;
						this.anInt10595 = 0;
					} else if (this.anInt10597 >= local81) {
						local361 = (this.anInt10597 - local76) / local91;
						if (local361 < this.anInt10595) {
							this.anInt10597 -= local91 * local361;
							this.anInt10595 -= local361;
							return;
						}
						this.anInt10597 -= local91 * this.anInt10595;
						this.anInt10595 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt10594 < 0) {
				if (this.anInt10597 < 0) {
					this.anInt10597 = -1;
					this.method8829();
					this.method9253();
					return;
				}
			} else if (this.anInt10597 >= local87) {
				this.anInt10597 = local87;
				this.method8829();
				this.method9253();
			}
		} else if (this.aBoolean724) {
			if (this.anInt10594 < 0) {
				if (this.anInt10597 >= local76) {
					return;
				}
				this.anInt10597 = local76 + local76 - this.anInt10597 - 1;
				this.anInt10594 = -this.anInt10594;
			}
			while (this.anInt10597 >= local81) {
				this.anInt10597 = local81 + local81 - this.anInt10597 - 1;
				this.anInt10594 = -this.anInt10594;
				if (this.anInt10597 >= local76) {
					return;
				}
				this.anInt10597 = local76 + local76 - this.anInt10597 - 1;
				this.anInt10594 = -this.anInt10594;
			}
		} else if (this.anInt10594 < 0) {
			if (this.anInt10597 < local76) {
				this.anInt10597 = local81 - (local81 - 1 - this.anInt10597) % local91 - 1;
			}
		} else if (this.anInt10597 >= local81) {
			this.anInt10597 = local76 + (this.anInt10597 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "([IIIII)I")
	private int method8860(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt10587 <= 0) {
				if (this.anInt10594 == -256 && (this.anInt10597 & 0xFF) == 0) {
					if (Static600.aBoolean722) {
						return Static654.method8830(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10585, this.anInt10589, arg3, arg2, this);
					}
					return Static654.method8854(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10591, arg3, arg2, this);
				}
				if (Static600.aBoolean722) {
					return Static654.method8827(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10585, this.anInt10589, arg3, arg2, this, this.anInt10594, arg4);
				}
				return Static654.method8840(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10591, arg3, arg2, this, this.anInt10594, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt10587;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt10587 += arg1;
			if (this.anInt10594 == -256 && (this.anInt10597 & 0xFF) == 0) {
				if (Static600.aBoolean722) {
					arg1 = Static654.method8833(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10585, this.anInt10589, this.anInt10586, this.anInt10593, local5, arg2, this);
				} else {
					arg1 = Static654.method8841(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10591, this.anInt10588, local5, arg2, this);
				}
			} else if (Static600.aBoolean722) {
				arg1 = Static654.method8853(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10585, this.anInt10589, this.anInt10586, this.anInt10593, local5, arg2, this, this.anInt10594, arg4);
			} else {
				arg1 = Static654.method8845(((Class2_Sub29_Sub1) super.aClass2_Sub29_6).aByteArray97, arg0, this.anInt10597, arg1, this.anInt10591, this.anInt10588, local5, arg2, this, this.anInt10594, arg4);
			}
			this.anInt10587 -= arg1;
			if (this.anInt10587 != 0) {
				return arg1;
			}
		} while (!this.method8831());
		return arg3;
	}
}
