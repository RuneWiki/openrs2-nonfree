import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class3_Sub16_Sub2 extends Class3_Sub16 {

	@OriginalMember(owner = "client!qga", name = "u", descriptor = "I")
	public int anInt7709;

	@OriginalMember(owner = "client!qga", name = "w", descriptor = "I")
	public int anInt7711;

	@OriginalMember(owner = "client!qga", name = "y", descriptor = "I")
	public int anInt7713;

	@OriginalMember(owner = "client!qga", name = "B", descriptor = "I")
	private int anInt7716;

	@OriginalMember(owner = "client!qga", name = "C", descriptor = "I")
	public int anInt7717;

	@OriginalMember(owner = "client!qga", name = "D", descriptor = "I")
	public int anInt7718;

	@OriginalMember(owner = "client!qga", name = "F", descriptor = "I")
	public int anInt7720;

	@OriginalMember(owner = "client!qga", name = "I", descriptor = "I")
	private int anInt7722;

	@OriginalMember(owner = "client!qga", name = "A", descriptor = "I")
	private final int anInt7715;

	@OriginalMember(owner = "client!qga", name = "z", descriptor = "I")
	private final int anInt7714;

	@OriginalMember(owner = "client!qga", name = "G", descriptor = "Z")
	private final boolean aBoolean537;

	@OriginalMember(owner = "client!qga", name = "E", descriptor = "I")
	private int anInt7719;

	@OriginalMember(owner = "client!qga", name = "v", descriptor = "I")
	private int anInt7710;

	@OriginalMember(owner = "client!qga", name = "x", descriptor = "I")
	private int anInt7712;

	@OriginalMember(owner = "client!qga", name = "H", descriptor = "I")
	public int anInt7721;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!qr;III)V")
	public Class3_Sub16_Sub2(@OriginalArg(0) Class3_Sub17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub17_5 = arg0;
		this.anInt7715 = arg0.anInt7875;
		this.anInt7714 = arg0.anInt7876;
		this.aBoolean537 = arg0.aBoolean547;
		this.anInt7719 = arg1;
		this.anInt7710 = arg2;
		this.anInt7712 = arg3;
		this.anInt7721 = 0;
		this.method6025();
	}

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "()V")
	private void method6025() {
		this.anInt7709 = this.anInt7710;
		this.anInt7711 = Static603.method6053(this.anInt7710, this.anInt7712);
		this.anInt7718 = Static603.method6032(this.anInt7710, this.anInt7712);
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V")
	public synchronized void method6027(@OriginalArg(0) int arg0) {
		this.method6041(arg0 << 6, this.method6044());
	}

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "(I)V")
	private synchronized void method6029() {
		this.method6041(0, this.method6044());
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(III)V")
	public synchronized void method6030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method6041(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static603.method6053(arg1, arg2);
		@Pc(14) int local14 = Static603.method6032(arg1, arg2);
		if (this.anInt7711 == local10 && this.anInt7718 == local14) {
			this.anInt7716 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt7709;
		if (this.anInt7709 - arg1 > local31) {
			local31 = this.anInt7709 - arg1;
		}
		if (local10 - this.anInt7711 > local31) {
			local31 = local10 - this.anInt7711;
		}
		if (this.anInt7711 - local10 > local31) {
			local31 = this.anInt7711 - local10;
		}
		if (local14 - this.anInt7718 > local31) {
			local31 = local14 - this.anInt7718;
		}
		if (this.anInt7718 - local14 > local31) {
			local31 = this.anInt7718 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt7716 = arg0;
		this.anInt7710 = arg1;
		this.anInt7712 = arg2;
		this.anInt7713 = (arg1 - this.anInt7709) / arg0;
		this.anInt7720 = (local10 - this.anInt7711) / arg0;
		this.anInt7717 = (local14 - this.anInt7718) / arg0;
	}

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "()I")
	@Override
	public int method7753() {
		@Pc(6) int local6 = this.anInt7709 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt7722 == 0) {
			local6 -= local6 * this.anInt7721 / (((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195.length << 8);
		} else if (this.anInt7722 >= 0) {
			local6 -= local6 * this.anInt7715 / ((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "()Lclient!eq;")
	@Override
	public Class3_Sub16 method7748() {
		return null;
	}

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "()I")
	public synchronized int method6031() {
		return this.anInt7719 < 0 ? -this.anInt7719 : this.anInt7719;
	}

	@OriginalMember(owner = "client!qga", name = "g", descriptor = "(I)V")
	public synchronized void method6034(@OriginalArg(0) int arg0) {
		if (this.anInt7719 < 0) {
			this.anInt7719 = -arg0;
		} else {
			this.anInt7719 = arg0;
		}
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7754(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7710 == 0 && this.anInt7716 == 0) {
			this.method7751(arg2);
			return;
		}
		@Pc(13) Class3_Sub17_Sub1 local13 = (Class3_Sub17_Sub1) super.aClass3_Sub17_5;
		@Pc(18) int local18 = this.anInt7715 << 8;
		@Pc(23) int local23 = this.anInt7714 << 8;
		@Pc(29) int local29 = local13.aByteArray195.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt7722 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt7721 < 0) {
			if (this.anInt7719 <= 0) {
				this.method6047();
				this.method8128();
				return;
			}
			this.anInt7721 = 0;
		}
		if (this.anInt7721 >= local29) {
			if (this.anInt7719 >= 0) {
				this.method6047();
				this.method8128();
				return;
			}
			this.anInt7721 = local29 - 1;
		}
		if (this.anInt7722 >= 0) {
			if (this.anInt7722 > 0) {
				if (this.aBoolean537) {
					label130: {
						if (this.anInt7719 < 0) {
							local40 = this.method6056(arg0, arg1, local18, local44, local13.aByteArray195[this.anInt7715]);
							if (this.anInt7721 >= local18) {
								return;
							}
							this.anInt7721 = local18 + local18 - this.anInt7721 - 1;
							this.anInt7719 = -this.anInt7719;
							if (--this.anInt7722 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method6051(arg0, local40, local23, local44, local13.aByteArray195[this.anInt7714 - 1]);
							if (this.anInt7721 < local23) {
								return;
							}
							this.anInt7721 = local23 + local23 - this.anInt7721 - 1;
							this.anInt7719 = -this.anInt7719;
							if (--this.anInt7722 == 0) {
								break;
							}
							local40 = this.method6056(arg0, local40, local18, local44, local13.aByteArray195[this.anInt7715]);
							if (this.anInt7721 >= local18) {
								return;
							}
							this.anInt7721 = local18 + local18 - this.anInt7721 - 1;
							this.anInt7719 = -this.anInt7719;
						} while (--this.anInt7722 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt7719 < 0) {
						while (true) {
							local40 = this.method6056(arg0, local40, local18, local44, local13.aByteArray195[this.anInt7714 - 1]);
							if (this.anInt7721 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt7721 - 1) / local33;
							if (local416 >= this.anInt7722) {
								this.anInt7721 += local33 * this.anInt7722;
								this.anInt7722 = 0;
								break;
							}
							this.anInt7721 += local33 * local416;
							this.anInt7722 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method6051(arg0, local40, local23, local44, local13.aByteArray195[this.anInt7715]);
							if (this.anInt7721 < local23) {
								return;
							}
							local416 = (this.anInt7721 - local18) / local33;
							if (local416 >= this.anInt7722) {
								this.anInt7721 -= local33 * this.anInt7722;
								this.anInt7722 = 0;
								break;
							}
							this.anInt7721 -= local33 * local416;
							this.anInt7722 -= local416;
						}
					}
				}
			}
			if (this.anInt7719 < 0) {
				this.method6056(arg0, local40, 0, local44, 0);
				if (this.anInt7721 < 0) {
					this.anInt7721 = -1;
					this.method6047();
					this.method8128();
					return;
				}
			} else {
				this.method6051(arg0, local40, local29, local44, 0);
				if (this.anInt7721 >= local29) {
					this.anInt7721 = local29;
					this.method6047();
					this.method8128();
				}
			}
		} else if (this.aBoolean537) {
			if (this.anInt7719 < 0) {
				local40 = this.method6056(arg0, arg1, local18, local44, local13.aByteArray195[this.anInt7715]);
				if (this.anInt7721 >= local18) {
					return;
				}
				this.anInt7721 = local18 + local18 - this.anInt7721 - 1;
				this.anInt7719 = -this.anInt7719;
			}
			while (true) {
				local40 = this.method6051(arg0, local40, local23, local44, local13.aByteArray195[this.anInt7714 - 1]);
				if (this.anInt7721 < local23) {
					return;
				}
				this.anInt7721 = local23 + local23 - this.anInt7721 - 1;
				this.anInt7719 = -this.anInt7719;
				local40 = this.method6056(arg0, local40, local18, local44, local13.aByteArray195[this.anInt7715]);
				if (this.anInt7721 >= local18) {
					return;
				}
				this.anInt7721 = local18 + local18 - this.anInt7721 - 1;
				this.anInt7719 = -this.anInt7719;
			}
		} else if (this.anInt7719 < 0) {
			while (true) {
				local40 = this.method6056(arg0, local40, local18, local44, local13.aByteArray195[this.anInt7714 - 1]);
				if (this.anInt7721 >= local18) {
					return;
				}
				this.anInt7721 = local23 - (local23 - 1 - this.anInt7721) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method6051(arg0, local40, local23, local44, local13.aByteArray195[this.anInt7715]);
				if (this.anInt7721 < local23) {
					return;
				}
				this.anInt7721 = local18 + (this.anInt7721 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "g", descriptor = "()Z")
	public boolean method6036() {
		return this.anInt7721 < 0 || this.anInt7721 >= ((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195.length << 8;
	}

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "(I)V")
	public synchronized void method6040(@OriginalArg(0) int arg0) {
		this.method6041(this.method6042(), arg0);
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)V")
	private synchronized void method6041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7710 = arg0;
		this.anInt7712 = arg1;
		this.anInt7716 = 0;
		this.method6025();
	}

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "()I")
	public synchronized int method6042() {
		return this.anInt7710 == Integer.MIN_VALUE ? 0 : this.anInt7710;
	}

	@OriginalMember(owner = "client!qga", name = "i", descriptor = "()Z")
	private boolean method6043() {
		@Pc(2) int local2 = this.anInt7710;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static603.method6053(local2, this.anInt7712);
			local8 = Static603.method6032(local2, this.anInt7712);
		}
		if (this.anInt7709 != local2 || this.anInt7711 != local10 || this.anInt7718 != local8) {
			if (this.anInt7709 < local2) {
				this.anInt7713 = 1;
				this.anInt7716 = local2 - this.anInt7709;
			} else if (this.anInt7709 > local2) {
				this.anInt7713 = -1;
				this.anInt7716 = this.anInt7709 - local2;
			} else {
				this.anInt7713 = 0;
			}
			if (this.anInt7711 < local10) {
				this.anInt7720 = 1;
				if (this.anInt7716 == 0 || this.anInt7716 > local10 - this.anInt7711) {
					this.anInt7716 = local10 - this.anInt7711;
				}
			} else if (this.anInt7711 > local10) {
				this.anInt7720 = -1;
				if (this.anInt7716 == 0 || this.anInt7716 > this.anInt7711 - local10) {
					this.anInt7716 = this.anInt7711 - local10;
				}
			} else {
				this.anInt7720 = 0;
			}
			if (this.anInt7718 < local8) {
				this.anInt7717 = 1;
				if (this.anInt7716 == 0 || this.anInt7716 > local8 - this.anInt7718) {
					this.anInt7716 = local8 - this.anInt7718;
				}
			} else if (this.anInt7718 > local8) {
				this.anInt7717 = -1;
				if (this.anInt7716 == 0 || this.anInt7716 > this.anInt7718 - local8) {
					this.anInt7716 = this.anInt7718 - local8;
				}
			} else {
				this.anInt7717 = 0;
			}
			return false;
		} else if (this.anInt7710 == Integer.MIN_VALUE) {
			this.anInt7710 = 0;
			this.anInt7709 = this.anInt7711 = this.anInt7718 = 0;
			this.method8128();
			return true;
		} else {
			this.method6025();
			return false;
		}
	}

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "()I")
	public synchronized int method6044() {
		return this.anInt7712 < 0 ? -1 : this.anInt7712;
	}

	@OriginalMember(owner = "client!qga", name = "i", descriptor = "(I)V")
	public synchronized void method6045(@OriginalArg(0) int arg0) {
		this.anInt7722 = arg0;
	}

	@OriginalMember(owner = "client!qga", name = "k", descriptor = "()V")
	private void method6047() {
		if (this.anInt7716 == 0) {
			return;
		}
		if (this.anInt7710 == Integer.MIN_VALUE) {
			this.anInt7710 = 0;
		}
		this.anInt7716 = 0;
		this.method6025();
	}

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "(I)V")
	public synchronized void method6048(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt7721 = arg0;
	}

	@OriginalMember(owner = "client!qga", name = "k", descriptor = "(I)V")
	public synchronized void method6049(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method6029();
			this.method8128();
		} else if (this.anInt7711 == 0 && this.anInt7718 == 0) {
			this.anInt7716 = 0;
			this.anInt7710 = 0;
			this.anInt7709 = 0;
			this.method8128();
		} else {
			@Pc(31) int local31 = -this.anInt7709;
			if (this.anInt7709 > local31) {
				local31 = this.anInt7709;
			}
			if (-this.anInt7711 > local31) {
				local31 = -this.anInt7711;
			}
			if (this.anInt7711 > local31) {
				local31 = this.anInt7711;
			}
			if (-this.anInt7718 > local31) {
				local31 = -this.anInt7718;
			}
			if (this.anInt7718 > local31) {
				local31 = this.anInt7718;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt7716 = arg0;
			this.anInt7710 = Integer.MIN_VALUE;
			this.anInt7713 = -this.anInt7709 / arg0;
			this.anInt7720 = -this.anInt7711 / arg0;
			this.anInt7717 = -this.anInt7718 / arg0;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "([IIIII)I")
	private int method6051(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7716 <= 0) {
				if (this.anInt7719 == 256 && (this.anInt7721 & 0xFF) == 0) {
					if (Static102.aBoolean181) {
						return Static603.method6063(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7711, this.anInt7718, arg3, arg2, this);
					}
					return Static603.method6028(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7709, arg3, arg2, this);
				}
				if (Static102.aBoolean181) {
					return Static603.method6037(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7711, this.anInt7718, arg3, arg2, this, this.anInt7719, arg4);
				}
				return Static603.method6060(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7709, arg3, arg2, this, this.anInt7719, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7716;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7716 += arg1;
			if (this.anInt7719 == 256 && (this.anInt7721 & 0xFF) == 0) {
				if (Static102.aBoolean181) {
					arg1 = Static603.method6038(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7711, this.anInt7718, this.anInt7720, this.anInt7717, local5, arg2, this);
				} else {
					arg1 = Static603.method6062(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7709, this.anInt7713, local5, arg2, this);
				}
			} else if (Static102.aBoolean181) {
				arg1 = Static603.method6059(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7711, this.anInt7718, this.anInt7720, this.anInt7717, local5, arg2, this, this.anInt7719, arg4);
			} else {
				arg1 = Static603.method6058(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7709, this.anInt7713, local5, arg2, this, this.anInt7719, arg4);
			}
			this.anInt7716 -= arg1;
			if (this.anInt7716 != 0) {
				return arg1;
			}
		} while (!this.method6043());
		return arg3;
	}

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "(II)V")
	public synchronized void method6052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6030(arg0, arg1, this.method6044());
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "()I")
	@Override
	public int method7749() {
		return this.anInt7710 == 0 && this.anInt7716 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "([IIIII)I")
	private int method6056(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7716 <= 0) {
				if (this.anInt7719 == -256 && (this.anInt7721 & 0xFF) == 0) {
					if (Static102.aBoolean181) {
						return Static603.method6054(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7711, this.anInt7718, arg3, arg2, this);
					}
					return Static603.method6057(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7709, arg3, arg2, this);
				}
				if (Static102.aBoolean181) {
					return Static603.method6039(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7711, this.anInt7718, arg3, arg2, this, this.anInt7719, arg4);
				}
				return Static603.method6026(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7709, arg3, arg2, this, this.anInt7719, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7716;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7716 += arg1;
			if (this.anInt7719 == -256 && (this.anInt7721 & 0xFF) == 0) {
				if (Static102.aBoolean181) {
					arg1 = Static603.method6035(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7711, this.anInt7718, this.anInt7720, this.anInt7717, local5, arg2, this);
				} else {
					arg1 = Static603.method6033(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7709, this.anInt7713, local5, arg2, this);
				}
			} else if (Static102.aBoolean181) {
				arg1 = Static603.method6050(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7711, this.anInt7718, this.anInt7720, this.anInt7717, local5, arg2, this, this.anInt7719, arg4);
			} else {
				arg1 = Static603.method6046(((Class3_Sub17_Sub1) super.aClass3_Sub17_5).aByteArray195, arg0, this.anInt7721, arg1, this.anInt7709, this.anInt7713, local5, arg2, this, this.anInt7719, arg4);
			}
			this.anInt7716 -= arg1;
			if (this.anInt7716 != 0) {
				return arg1;
			}
		} while (!this.method6043());
		return arg3;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)V")
	public synchronized void method6061() {
		this.anInt7719 = (this.anInt7719 ^ this.anInt7719 >> 31) + (this.anInt7719 >>> 31);
		this.anInt7719 = -this.anInt7719;
	}

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "()Lclient!eq;")
	@Override
	public Class3_Sub16 method7752() {
		return null;
	}

	@OriginalMember(owner = "client!qga", name = "l", descriptor = "()Z")
	public boolean method6064() {
		return this.anInt7716 != 0;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7751(@OriginalArg(0) int arg0) {
		if (this.anInt7716 > 0) {
			if (arg0 >= this.anInt7716) {
				if (this.anInt7710 == Integer.MIN_VALUE) {
					this.anInt7710 = 0;
					this.anInt7709 = this.anInt7711 = this.anInt7718 = 0;
					this.method8128();
					arg0 = this.anInt7716;
				}
				this.anInt7716 = 0;
				this.method6025();
			} else {
				this.anInt7709 += this.anInt7713 * arg0;
				this.anInt7711 += this.anInt7720 * arg0;
				this.anInt7718 += this.anInt7717 * arg0;
				this.anInt7716 -= arg0;
			}
		}
		@Pc(71) Class3_Sub17_Sub1 local71 = (Class3_Sub17_Sub1) super.aClass3_Sub17_5;
		@Pc(76) int local76 = this.anInt7715 << 8;
		@Pc(81) int local81 = this.anInt7714 << 8;
		@Pc(87) int local87 = local71.aByteArray195.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt7722 = 0;
		}
		if (this.anInt7721 < 0) {
			if (this.anInt7719 <= 0) {
				this.method6047();
				this.method8128();
				return;
			}
			this.anInt7721 = 0;
		}
		if (this.anInt7721 >= local87) {
			if (this.anInt7719 >= 0) {
				this.method6047();
				this.method8128();
				return;
			}
			this.anInt7721 = local87 - 1;
		}
		this.anInt7721 += this.anInt7719 * arg0;
		if (this.anInt7722 >= 0) {
			if (this.anInt7722 > 0) {
				if (this.aBoolean537) {
					label125: {
						if (this.anInt7719 < 0) {
							if (this.anInt7721 >= local76) {
								return;
							}
							this.anInt7721 = local76 + local76 - this.anInt7721 - 1;
							this.anInt7719 = -this.anInt7719;
							if (--this.anInt7722 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt7721 < local81) {
								return;
							}
							this.anInt7721 = local81 + local81 - this.anInt7721 - 1;
							this.anInt7719 = -this.anInt7719;
							if (--this.anInt7722 == 0) {
								break;
							}
							if (this.anInt7721 >= local76) {
								return;
							}
							this.anInt7721 = local76 + local76 - this.anInt7721 - 1;
							this.anInt7719 = -this.anInt7719;
						} while (--this.anInt7722 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt7719 < 0) {
						if (this.anInt7721 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt7721 - 1) / local91;
						if (local361 < this.anInt7722) {
							this.anInt7721 += local91 * local361;
							this.anInt7722 -= local361;
							return;
						}
						this.anInt7721 += local91 * this.anInt7722;
						this.anInt7722 = 0;
					} else if (this.anInt7721 >= local81) {
						local361 = (this.anInt7721 - local76) / local91;
						if (local361 < this.anInt7722) {
							this.anInt7721 -= local91 * local361;
							this.anInt7722 -= local361;
							return;
						}
						this.anInt7721 -= local91 * this.anInt7722;
						this.anInt7722 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt7719 < 0) {
				if (this.anInt7721 < 0) {
					this.anInt7721 = -1;
					this.method6047();
					this.method8128();
					return;
				}
			} else if (this.anInt7721 >= local87) {
				this.anInt7721 = local87;
				this.method6047();
				this.method8128();
			}
		} else if (this.aBoolean537) {
			if (this.anInt7719 < 0) {
				if (this.anInt7721 >= local76) {
					return;
				}
				this.anInt7721 = local76 + local76 - this.anInt7721 - 1;
				this.anInt7719 = -this.anInt7719;
			}
			while (this.anInt7721 >= local81) {
				this.anInt7721 = local81 + local81 - this.anInt7721 - 1;
				this.anInt7719 = -this.anInt7719;
				if (this.anInt7721 >= local76) {
					return;
				}
				this.anInt7721 = local76 + local76 - this.anInt7721 - 1;
				this.anInt7719 = -this.anInt7719;
			}
		} else if (this.anInt7719 < 0) {
			if (this.anInt7721 < local76) {
				this.anInt7721 = local81 - (local81 - 1 - this.anInt7721) % local91 - 1;
			}
		} else if (this.anInt7721 >= local81) {
			this.anInt7721 = local76 + (this.anInt7721 - local76) % local91;
		}
	}
}
