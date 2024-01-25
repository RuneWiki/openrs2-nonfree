import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class5_Sub16_Sub3 extends Class5_Sub16 {

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
	public int anInt7110;

	@OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
	public int anInt7111;

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
	public int anInt7112;

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
	private int anInt7114;

	@OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
	public int anInt7115;

	@OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
	public int anInt7116;

	@OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
	private int anInt7118;

	@OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
	public int anInt7119;

	@OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
	private final int anInt7109;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
	private final int anInt7121;

	@OriginalMember(owner = "client!oaa", name = "u", descriptor = "Z")
	private final boolean aBoolean549;

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
	private int anInt7117;

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
	private int anInt7108;

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
	private int anInt7120;

	@OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
	public int anInt7113;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lclient!ps;III)V")
	public Class5_Sub16_Sub3(@OriginalArg(0) Class5_Sub24_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub24_6 = arg0;
		this.anInt7109 = arg0.anInt7870;
		this.anInt7121 = arg0.anInt7871;
		this.aBoolean549 = arg0.aBoolean594;
		this.anInt7117 = arg1;
		this.anInt7108 = arg2;
		this.anInt7120 = arg3;
		this.anInt7113 = 0;
		this.method6141();
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "()I")
	@Override
	public int method8734() {
		@Pc(6) int local6 = this.anInt7110 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt7114 == 0) {
			local6 -= local6 * this.anInt7113 / (((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77.length << 8);
		} else if (this.anInt7114 >= 0) {
			local6 -= local6 * this.anInt7109 / ((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II)V")
	public synchronized void method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6157(arg0, arg1, this.method6153());
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7108 == 0 && this.anInt7118 == 0) {
			this.method8740(arg2);
			return;
		}
		@Pc(13) Class5_Sub24_Sub1 local13 = (Class5_Sub24_Sub1) super.aClass5_Sub24_6;
		@Pc(18) int local18 = this.anInt7109 << 8;
		@Pc(23) int local23 = this.anInt7121 << 8;
		@Pc(29) int local29 = local13.aByteArray77.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt7114 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt7113 < 0) {
			if (this.anInt7117 <= 0) {
				this.method6162();
				this.method9327(1);
				return;
			}
			this.anInt7113 = 0;
		}
		if (this.anInt7113 >= local29) {
			if (this.anInt7117 >= 0) {
				this.method6162();
				this.method9327(1);
				return;
			}
			this.anInt7113 = local29 - 1;
		}
		if (this.anInt7114 >= 0) {
			if (this.anInt7114 > 0) {
				if (this.aBoolean549) {
					label130: {
						if (this.anInt7117 < 0) {
							local40 = this.method6144(arg0, arg1, local18, local44, local13.aByteArray77[this.anInt7109]);
							if (this.anInt7113 >= local18) {
								return;
							}
							this.anInt7113 = local18 + local18 - this.anInt7113 - 1;
							this.anInt7117 = -this.anInt7117;
							if (--this.anInt7114 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method6151(arg0, local40, local23, local44, local13.aByteArray77[this.anInt7121 - 1]);
							if (this.anInt7113 < local23) {
								return;
							}
							this.anInt7113 = local23 + local23 - this.anInt7113 - 1;
							this.anInt7117 = -this.anInt7117;
							if (--this.anInt7114 == 0) {
								break;
							}
							local40 = this.method6144(arg0, local40, local18, local44, local13.aByteArray77[this.anInt7109]);
							if (this.anInt7113 >= local18) {
								return;
							}
							this.anInt7113 = local18 + local18 - this.anInt7113 - 1;
							this.anInt7117 = -this.anInt7117;
						} while (--this.anInt7114 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt7117 < 0) {
						while (true) {
							local40 = this.method6144(arg0, local40, local18, local44, local13.aByteArray77[this.anInt7121 - 1]);
							if (this.anInt7113 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt7113 - 1) / local33;
							if (local416 >= this.anInt7114) {
								this.anInt7113 += local33 * this.anInt7114;
								this.anInt7114 = 0;
								break;
							}
							this.anInt7113 += local33 * local416;
							this.anInt7114 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method6151(arg0, local40, local23, local44, local13.aByteArray77[this.anInt7109]);
							if (this.anInt7113 < local23) {
								return;
							}
							local416 = (this.anInt7113 - local18) / local33;
							if (local416 >= this.anInt7114) {
								this.anInt7113 -= local33 * this.anInt7114;
								this.anInt7114 = 0;
								break;
							}
							this.anInt7113 -= local33 * local416;
							this.anInt7114 -= local416;
						}
					}
				}
			}
			if (this.anInt7117 < 0) {
				this.method6144(arg0, local40, 0, local44, 0);
				if (this.anInt7113 < 0) {
					this.anInt7113 = -1;
					this.method6162();
					this.method9327(1);
					return;
				}
			} else {
				this.method6151(arg0, local40, local29, local44, 0);
				if (this.anInt7113 >= local29) {
					this.anInt7113 = local29;
					this.method6162();
					this.method9327(1);
				}
			}
		} else if (this.aBoolean549) {
			if (this.anInt7117 < 0) {
				local40 = this.method6144(arg0, arg1, local18, local44, local13.aByteArray77[this.anInt7109]);
				if (this.anInt7113 >= local18) {
					return;
				}
				this.anInt7113 = local18 + local18 - this.anInt7113 - 1;
				this.anInt7117 = -this.anInt7117;
			}
			while (true) {
				local40 = this.method6151(arg0, local40, local23, local44, local13.aByteArray77[this.anInt7121 - 1]);
				if (this.anInt7113 < local23) {
					return;
				}
				this.anInt7113 = local23 + local23 - this.anInt7113 - 1;
				this.anInt7117 = -this.anInt7117;
				local40 = this.method6144(arg0, local40, local18, local44, local13.aByteArray77[this.anInt7109]);
				if (this.anInt7113 >= local18) {
					return;
				}
				this.anInt7113 = local18 + local18 - this.anInt7113 - 1;
				this.anInt7117 = -this.anInt7117;
			}
		} else if (this.anInt7117 < 0) {
			while (true) {
				local40 = this.method6144(arg0, local40, local18, local44, local13.aByteArray77[this.anInt7121 - 1]);
				if (this.anInt7113 >= local18) {
					return;
				}
				this.anInt7113 = local23 - (local23 - 1 - this.anInt7113) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method6151(arg0, local40, local23, local44, local13.aByteArray77[this.anInt7109]);
				if (this.anInt7113 < local23) {
					return;
				}
				this.anInt7113 = local18 + (this.anInt7113 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "()Lclient!fq;")
	@Override
	public Class5_Sub16 method8735() {
		return null;
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V")
	public synchronized void method6128(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt7113 = arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V")
	public synchronized void method6133() {
		this.anInt7117 = (this.anInt7117 ^ this.anInt7117 >> 31) + (this.anInt7117 >>> 31);
		this.anInt7117 = -this.anInt7117;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
	public synchronized void method6134(@OriginalArg(0) int arg0) {
		this.method6146(arg0 << 6, this.method6153());
	}

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "()I")
	public synchronized int method6135() {
		return this.anInt7108 == Integer.MIN_VALUE ? 0 : this.anInt7108;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "()Lclient!fq;")
	@Override
	public Class5_Sub16 method8737() {
		return null;
	}

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "(I)V")
	public synchronized void method6140(@OriginalArg(0) int arg0) {
		this.anInt7114 = arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "()V")
	private void method6141() {
		this.anInt7110 = this.anInt7108;
		this.anInt7112 = Static688.method6129(this.anInt7108, this.anInt7120);
		this.anInt7111 = Static688.method6158(this.anInt7108, this.anInt7120);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "([IIIII)I")
	private int method6144(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7118 <= 0) {
				if (this.anInt7117 == -256 && (this.anInt7113 & 0xFF) == 0) {
					if (Static128.aBoolean541) {
						return Static688.method6138(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7112, this.anInt7111, arg3, arg2, this);
					}
					return Static688.method6139(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7110, arg3, arg2, this);
				}
				if (Static128.aBoolean541) {
					return Static688.method6159(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7112, this.anInt7111, arg3, arg2, this, this.anInt7117, arg4);
				}
				return Static688.method6130(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7110, arg3, arg2, this, this.anInt7117, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7118;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7118 += arg1;
			if (this.anInt7117 == -256 && (this.anInt7113 & 0xFF) == 0) {
				if (Static128.aBoolean541) {
					arg1 = Static688.method6143(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7112, this.anInt7111, this.anInt7115, this.anInt7119, local5, arg2, this);
				} else {
					arg1 = Static688.method6148(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7110, this.anInt7116, local5, arg2, this);
				}
			} else if (Static128.aBoolean541) {
				arg1 = Static688.method6161(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7112, this.anInt7111, this.anInt7115, this.anInt7119, local5, arg2, this, this.anInt7117, arg4);
			} else {
				arg1 = Static688.method6127(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7110, this.anInt7116, local5, arg2, this, this.anInt7117, arg4);
			}
			this.anInt7118 -= arg1;
			if (this.anInt7118 != 0) {
				return arg1;
			}
		} while (!this.method6152());
		return arg3;
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(II)V")
	private synchronized void method6146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7108 = arg0;
		this.anInt7120 = arg1;
		this.anInt7118 = 0;
		this.method6141();
	}

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "()Z")
	public boolean method6147() {
		return this.anInt7118 != 0;
	}

	@OriginalMember(owner = "client!oaa", name = "h", descriptor = "()I")
	public synchronized int method6149() {
		return this.anInt7117 < 0 ? -this.anInt7117 : this.anInt7117;
	}

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "(I)V")
	public synchronized void method6150(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method6156();
			this.method9327(1);
		} else if (this.anInt7112 == 0 && this.anInt7111 == 0) {
			this.anInt7118 = 0;
			this.anInt7108 = 0;
			this.anInt7110 = 0;
			this.method9327(1);
		} else {
			@Pc(31) int local31 = -this.anInt7110;
			if (this.anInt7110 > local31) {
				local31 = this.anInt7110;
			}
			if (-this.anInt7112 > local31) {
				local31 = -this.anInt7112;
			}
			if (this.anInt7112 > local31) {
				local31 = this.anInt7112;
			}
			if (-this.anInt7111 > local31) {
				local31 = -this.anInt7111;
			}
			if (this.anInt7111 > local31) {
				local31 = this.anInt7111;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt7118 = arg0;
			this.anInt7108 = Integer.MIN_VALUE;
			this.anInt7116 = -this.anInt7110 / arg0;
			this.anInt7115 = -this.anInt7112 / arg0;
			this.anInt7119 = -this.anInt7111 / arg0;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "([IIIII)I")
	private int method6151(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7118 <= 0) {
				if (this.anInt7117 == 256 && (this.anInt7113 & 0xFF) == 0) {
					if (Static128.aBoolean541) {
						return Static688.method6145(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7112, this.anInt7111, arg3, arg2, this);
					}
					return Static688.method6137(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7110, arg3, arg2, this);
				}
				if (Static128.aBoolean541) {
					return Static688.method6132(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7112, this.anInt7111, arg3, arg2, this, this.anInt7117, arg4);
				}
				return Static688.method6165(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7110, arg3, arg2, this, this.anInt7117, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7118;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7118 += arg1;
			if (this.anInt7117 == 256 && (this.anInt7113 & 0xFF) == 0) {
				if (Static128.aBoolean541) {
					arg1 = Static688.method6136(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7112, this.anInt7111, this.anInt7115, this.anInt7119, local5, arg2, this);
				} else {
					arg1 = Static688.method6131(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7110, this.anInt7116, local5, arg2, this);
				}
			} else if (Static128.aBoolean541) {
				arg1 = Static688.method6142(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7112, this.anInt7111, this.anInt7115, this.anInt7119, local5, arg2, this, this.anInt7117, arg4);
			} else {
				arg1 = Static688.method6160(((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77, arg0, this.anInt7113, arg1, this.anInt7110, this.anInt7116, local5, arg2, this, this.anInt7117, arg4);
			}
			this.anInt7118 -= arg1;
			if (this.anInt7118 != 0) {
				return arg1;
			}
		} while (!this.method6152());
		return arg3;
	}

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "()Z")
	private boolean method6152() {
		@Pc(2) int local2 = this.anInt7108;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static688.method6129(local2, this.anInt7120);
			local8 = Static688.method6158(local2, this.anInt7120);
		}
		if (this.anInt7110 != local2 || this.anInt7112 != local10 || this.anInt7111 != local8) {
			if (this.anInt7110 < local2) {
				this.anInt7116 = 1;
				this.anInt7118 = local2 - this.anInt7110;
			} else if (this.anInt7110 > local2) {
				this.anInt7116 = -1;
				this.anInt7118 = this.anInt7110 - local2;
			} else {
				this.anInt7116 = 0;
			}
			if (this.anInt7112 < local10) {
				this.anInt7115 = 1;
				if (this.anInt7118 == 0 || this.anInt7118 > local10 - this.anInt7112) {
					this.anInt7118 = local10 - this.anInt7112;
				}
			} else if (this.anInt7112 > local10) {
				this.anInt7115 = -1;
				if (this.anInt7118 == 0 || this.anInt7118 > this.anInt7112 - local10) {
					this.anInt7118 = this.anInt7112 - local10;
				}
			} else {
				this.anInt7115 = 0;
			}
			if (this.anInt7111 < local8) {
				this.anInt7119 = 1;
				if (this.anInt7118 == 0 || this.anInt7118 > local8 - this.anInt7111) {
					this.anInt7118 = local8 - this.anInt7111;
				}
			} else if (this.anInt7111 > local8) {
				this.anInt7119 = -1;
				if (this.anInt7118 == 0 || this.anInt7118 > this.anInt7111 - local8) {
					this.anInt7118 = this.anInt7111 - local8;
				}
			} else {
				this.anInt7119 = 0;
			}
			return false;
		} else if (this.anInt7108 == Integer.MIN_VALUE) {
			this.anInt7108 = 0;
			this.anInt7110 = this.anInt7112 = this.anInt7111 = 0;
			this.method9327(1);
			return true;
		} else {
			this.method6141();
			return false;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "()I")
	public synchronized int method6153() {
		return this.anInt7120 < 0 ? -1 : this.anInt7120;
	}

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "(I)V")
	public synchronized void method6154(@OriginalArg(0) int arg0) {
		if (this.anInt7117 < 0) {
			this.anInt7117 = -arg0;
		} else {
			this.anInt7117 = arg0;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "()Z")
	public boolean method6155() {
		return this.anInt7113 < 0 || this.anInt7113 >= ((Class5_Sub24_Sub1) super.aClass5_Sub24_6).aByteArray77.length << 8;
	}

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "(I)V")
	private synchronized void method6156() {
		this.method6146(0, this.method6153());
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8740(@OriginalArg(0) int arg0) {
		if (this.anInt7118 > 0) {
			if (arg0 >= this.anInt7118) {
				if (this.anInt7108 == Integer.MIN_VALUE) {
					this.anInt7108 = 0;
					this.anInt7110 = this.anInt7112 = this.anInt7111 = 0;
					this.method9327(1);
					arg0 = this.anInt7118;
				}
				this.anInt7118 = 0;
				this.method6141();
			} else {
				this.anInt7110 += this.anInt7116 * arg0;
				this.anInt7112 += this.anInt7115 * arg0;
				this.anInt7111 += this.anInt7119 * arg0;
				this.anInt7118 -= arg0;
			}
		}
		@Pc(71) Class5_Sub24_Sub1 local71 = (Class5_Sub24_Sub1) super.aClass5_Sub24_6;
		@Pc(76) int local76 = this.anInt7109 << 8;
		@Pc(81) int local81 = this.anInt7121 << 8;
		@Pc(87) int local87 = local71.aByteArray77.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt7114 = 0;
		}
		if (this.anInt7113 < 0) {
			if (this.anInt7117 <= 0) {
				this.method6162();
				this.method9327(1);
				return;
			}
			this.anInt7113 = 0;
		}
		if (this.anInt7113 >= local87) {
			if (this.anInt7117 >= 0) {
				this.method6162();
				this.method9327(1);
				return;
			}
			this.anInt7113 = local87 - 1;
		}
		this.anInt7113 += this.anInt7117 * arg0;
		if (this.anInt7114 >= 0) {
			if (this.anInt7114 > 0) {
				if (this.aBoolean549) {
					label125: {
						if (this.anInt7117 < 0) {
							if (this.anInt7113 >= local76) {
								return;
							}
							this.anInt7113 = local76 + local76 - this.anInt7113 - 1;
							this.anInt7117 = -this.anInt7117;
							if (--this.anInt7114 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt7113 < local81) {
								return;
							}
							this.anInt7113 = local81 + local81 - this.anInt7113 - 1;
							this.anInt7117 = -this.anInt7117;
							if (--this.anInt7114 == 0) {
								break;
							}
							if (this.anInt7113 >= local76) {
								return;
							}
							this.anInt7113 = local76 + local76 - this.anInt7113 - 1;
							this.anInt7117 = -this.anInt7117;
						} while (--this.anInt7114 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt7117 < 0) {
						if (this.anInt7113 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt7113 - 1) / local91;
						if (local361 < this.anInt7114) {
							this.anInt7113 += local91 * local361;
							this.anInt7114 -= local361;
							return;
						}
						this.anInt7113 += local91 * this.anInt7114;
						this.anInt7114 = 0;
					} else if (this.anInt7113 >= local81) {
						local361 = (this.anInt7113 - local76) / local91;
						if (local361 < this.anInt7114) {
							this.anInt7113 -= local91 * local361;
							this.anInt7114 -= local361;
							return;
						}
						this.anInt7113 -= local91 * this.anInt7114;
						this.anInt7114 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt7117 < 0) {
				if (this.anInt7113 < 0) {
					this.anInt7113 = -1;
					this.method6162();
					this.method9327(1);
					return;
				}
			} else if (this.anInt7113 >= local87) {
				this.anInt7113 = local87;
				this.method6162();
				this.method9327(1);
			}
		} else if (this.aBoolean549) {
			if (this.anInt7117 < 0) {
				if (this.anInt7113 >= local76) {
					return;
				}
				this.anInt7113 = local76 + local76 - this.anInt7113 - 1;
				this.anInt7117 = -this.anInt7117;
			}
			while (this.anInt7113 >= local81) {
				this.anInt7113 = local81 + local81 - this.anInt7113 - 1;
				this.anInt7117 = -this.anInt7117;
				if (this.anInt7113 >= local76) {
					return;
				}
				this.anInt7113 = local76 + local76 - this.anInt7113 - 1;
				this.anInt7117 = -this.anInt7117;
			}
		} else if (this.anInt7117 < 0) {
			if (this.anInt7113 < local76) {
				this.anInt7113 = local81 - (local81 - 1 - this.anInt7113) % local91 - 1;
			}
		} else if (this.anInt7113 >= local81) {
			this.anInt7113 = local76 + (this.anInt7113 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III)V")
	public synchronized void method6157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method6146(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static688.method6129(arg1, arg2);
		@Pc(14) int local14 = Static688.method6158(arg1, arg2);
		if (this.anInt7112 == local10 && this.anInt7111 == local14) {
			this.anInt7118 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt7110;
		if (this.anInt7110 - arg1 > local31) {
			local31 = this.anInt7110 - arg1;
		}
		if (local10 - this.anInt7112 > local31) {
			local31 = local10 - this.anInt7112;
		}
		if (this.anInt7112 - local10 > local31) {
			local31 = this.anInt7112 - local10;
		}
		if (local14 - this.anInt7111 > local31) {
			local31 = local14 - this.anInt7111;
		}
		if (this.anInt7111 - local14 > local31) {
			local31 = this.anInt7111 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt7118 = arg0;
		this.anInt7108 = arg1;
		this.anInt7120 = arg2;
		this.anInt7116 = (arg1 - this.anInt7110) / arg0;
		this.anInt7115 = (local10 - this.anInt7112) / arg0;
		this.anInt7119 = (local14 - this.anInt7111) / arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "()V")
	private void method6162() {
		if (this.anInt7118 == 0) {
			return;
		}
		if (this.anInt7108 == Integer.MIN_VALUE) {
			this.anInt7108 = 0;
		}
		this.anInt7118 = 0;
		this.method6141();
	}

	@OriginalMember(owner = "client!oaa", name = "h", descriptor = "(I)V")
	public synchronized void method6164(@OriginalArg(0) int arg0) {
		this.method6146(this.method6135(), arg0);
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "()I")
	@Override
	public int method8739() {
		return this.anInt7108 == 0 && this.anInt7118 == 0 ? 0 : 1;
	}
}
