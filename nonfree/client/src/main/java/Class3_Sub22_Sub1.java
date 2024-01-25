import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class3_Sub22_Sub1 extends Class3_Sub22 {

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
	private int anInt4662;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
	public int anInt4663;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
	public int anInt4664;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
	public int anInt4665;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
	public int anInt4667;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
	public int anInt4669;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
	public int anInt4671;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
	private int anInt4672;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
	private final int anInt4675;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
	private final int anInt4674;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "Z")
	private final boolean aBoolean410;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
	private int anInt4673;

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
	private int anInt4668;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
	private int anInt4666;

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
	public int anInt4670;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!mca;III)V")
	public Class3_Sub22_Sub1(@OriginalArg(0) Class3_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub33_6 = arg0;
		this.anInt4675 = arg0.anInt6922;
		this.anInt4674 = arg0.anInt6920;
		this.aBoolean410 = arg0.aBoolean542;
		this.anInt4673 = arg1;
		this.anInt4668 = arg2;
		this.anInt4666 = arg3;
		this.anInt4670 = 0;
		this.method3887();
	}

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "(I)V")
	public synchronized void method3879(@OriginalArg(0) int arg0) {
		this.method3882(this.method3904(), arg0);
	}

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "(I)V")
	public synchronized void method3881(@OriginalArg(0) int arg0) {
		this.anInt4672 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V")
	private synchronized void method3882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4668 = arg0;
		this.anInt4666 = arg1;
		this.anInt4662 = 0;
		this.method3887();
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9302(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4668 == 0 && this.anInt4662 == 0) {
			this.method9304(arg2);
			return;
		}
		@Pc(13) Class3_Sub33_Sub1 local13 = (Class3_Sub33_Sub1) super.aClass3_Sub33_6;
		@Pc(18) int local18 = this.anInt4675 << 8;
		@Pc(23) int local23 = this.anInt4674 << 8;
		@Pc(29) int local29 = local13.aByteArray53.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4672 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4670 < 0) {
			if (this.anInt4673 <= 0) {
				this.method3917();
				this.method9446();
				return;
			}
			this.anInt4670 = 0;
		}
		if (this.anInt4670 >= local29) {
			if (this.anInt4673 >= 0) {
				this.method3917();
				this.method9446();
				return;
			}
			this.anInt4670 = local29 - 1;
		}
		if (this.anInt4672 >= 0) {
			if (this.anInt4672 > 0) {
				if (this.aBoolean410) {
					label130: {
						if (this.anInt4673 < 0) {
							local40 = this.method3902(arg0, arg1, local18, local44, local13.aByteArray53[this.anInt4675]);
							if (this.anInt4670 >= local18) {
								return;
							}
							this.anInt4670 = local18 + local18 - this.anInt4670 - 1;
							this.anInt4673 = -this.anInt4673;
							if (--this.anInt4672 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3885(arg0, local40, local23, local44, local13.aByteArray53[this.anInt4674 - 1]);
							if (this.anInt4670 < local23) {
								return;
							}
							this.anInt4670 = local23 + local23 - this.anInt4670 - 1;
							this.anInt4673 = -this.anInt4673;
							if (--this.anInt4672 == 0) {
								break;
							}
							local40 = this.method3902(arg0, local40, local18, local44, local13.aByteArray53[this.anInt4675]);
							if (this.anInt4670 >= local18) {
								return;
							}
							this.anInt4670 = local18 + local18 - this.anInt4670 - 1;
							this.anInt4673 = -this.anInt4673;
						} while (--this.anInt4672 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4673 < 0) {
						while (true) {
							local40 = this.method3902(arg0, local40, local18, local44, local13.aByteArray53[this.anInt4674 - 1]);
							if (this.anInt4670 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4670 - 1) / local33;
							if (local416 >= this.anInt4672) {
								this.anInt4670 += local33 * this.anInt4672;
								this.anInt4672 = 0;
								break;
							}
							this.anInt4670 += local33 * local416;
							this.anInt4672 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3885(arg0, local40, local23, local44, local13.aByteArray53[this.anInt4675]);
							if (this.anInt4670 < local23) {
								return;
							}
							local416 = (this.anInt4670 - local18) / local33;
							if (local416 >= this.anInt4672) {
								this.anInt4670 -= local33 * this.anInt4672;
								this.anInt4672 = 0;
								break;
							}
							this.anInt4670 -= local33 * local416;
							this.anInt4672 -= local416;
						}
					}
				}
			}
			if (this.anInt4673 < 0) {
				this.method3902(arg0, local40, 0, local44, 0);
				if (this.anInt4670 < 0) {
					this.anInt4670 = -1;
					this.method3917();
					this.method9446();
					return;
				}
			} else {
				this.method3885(arg0, local40, local29, local44, 0);
				if (this.anInt4670 >= local29) {
					this.anInt4670 = local29;
					this.method3917();
					this.method9446();
				}
			}
		} else if (this.aBoolean410) {
			if (this.anInt4673 < 0) {
				local40 = this.method3902(arg0, arg1, local18, local44, local13.aByteArray53[this.anInt4675]);
				if (this.anInt4670 >= local18) {
					return;
				}
				this.anInt4670 = local18 + local18 - this.anInt4670 - 1;
				this.anInt4673 = -this.anInt4673;
			}
			while (true) {
				local40 = this.method3885(arg0, local40, local23, local44, local13.aByteArray53[this.anInt4674 - 1]);
				if (this.anInt4670 < local23) {
					return;
				}
				this.anInt4670 = local23 + local23 - this.anInt4670 - 1;
				this.anInt4673 = -this.anInt4673;
				local40 = this.method3902(arg0, local40, local18, local44, local13.aByteArray53[this.anInt4675]);
				if (this.anInt4670 >= local18) {
					return;
				}
				this.anInt4670 = local18 + local18 - this.anInt4670 - 1;
				this.anInt4673 = -this.anInt4673;
			}
		} else if (this.anInt4673 < 0) {
			while (true) {
				local40 = this.method3902(arg0, local40, local18, local44, local13.aByteArray53[this.anInt4674 - 1]);
				if (this.anInt4670 >= local18) {
					return;
				}
				this.anInt4670 = local23 - (local23 - 1 - this.anInt4670) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3885(arg0, local40, local23, local44, local13.aByteArray53[this.anInt4675]);
				if (this.anInt4670 < local23) {
					return;
				}
				this.anInt4670 = local18 + (this.anInt4670 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "()I")
	@Override
	public int method9307() {
		return this.anInt4668 == 0 && this.anInt4662 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "()Z")
	public boolean method3883() {
		return this.anInt4662 != 0;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "()Lclient!fga;")
	@Override
	public Class3_Sub22 method9305() {
		return null;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "([IIIII)I")
	private int method3885(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4662 <= 0) {
				if (this.anInt4673 == 256 && (this.anInt4670 & 0xFF) == 0) {
					if (Static510.aBoolean777) {
						return Static727.method3893(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4664, this.anInt4663, arg3, arg2, this);
					}
					return Static727.method3891(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4665, arg3, arg2, this);
				}
				if (Static510.aBoolean777) {
					return Static727.method3907(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4664, this.anInt4663, arg3, arg2, this, this.anInt4673, arg4);
				}
				return Static727.method3897(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4665, arg3, arg2, this, this.anInt4673, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4662;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4662 += arg1;
			if (this.anInt4673 == 256 && (this.anInt4670 & 0xFF) == 0) {
				if (Static510.aBoolean777) {
					arg1 = Static727.method3895(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4664, this.anInt4663, this.anInt4669, this.anInt4671, local5, arg2, this);
				} else {
					arg1 = Static727.method3900(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4665, this.anInt4667, local5, arg2, this);
				}
			} else if (Static510.aBoolean777) {
				arg1 = Static727.method3915(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4664, this.anInt4663, this.anInt4669, this.anInt4671, local5, arg2, this, this.anInt4673, arg4);
			} else {
				arg1 = Static727.method3914(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4665, this.anInt4667, local5, arg2, this, this.anInt4673, arg4);
			}
			this.anInt4662 -= arg1;
			if (this.anInt4662 != 0) {
				return arg1;
			}
		} while (!this.method3909());
		return arg3;
	}

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "()V")
	private void method3887() {
		this.anInt4665 = this.anInt4668;
		this.anInt4664 = Static727.method3892(this.anInt4668, this.anInt4666);
		this.anInt4663 = Static727.method3880(this.anInt4668, this.anInt4666);
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V")
	private synchronized void method3888() {
		this.method3882(0, this.method3898());
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V")
	public synchronized void method3889(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4670 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "()I")
	public synchronized int method3898() {
		return this.anInt4666 < 0 ? -1 : this.anInt4666;
	}

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "(I)V")
	public synchronized void method3899(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3888();
			this.method9446();
		} else if (this.anInt4664 == 0 && this.anInt4663 == 0) {
			this.anInt4662 = 0;
			this.anInt4668 = 0;
			this.anInt4665 = 0;
			this.method9446();
		} else {
			@Pc(31) int local31 = -this.anInt4665;
			if (this.anInt4665 > local31) {
				local31 = this.anInt4665;
			}
			if (-this.anInt4664 > local31) {
				local31 = -this.anInt4664;
			}
			if (this.anInt4664 > local31) {
				local31 = this.anInt4664;
			}
			if (-this.anInt4663 > local31) {
				local31 = -this.anInt4663;
			}
			if (this.anInt4663 > local31) {
				local31 = this.anInt4663;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4662 = arg0;
			this.anInt4668 = Integer.MIN_VALUE;
			this.anInt4667 = -this.anInt4665 / arg0;
			this.anInt4669 = -this.anInt4664 / arg0;
			this.anInt4671 = -this.anInt4663 / arg0;
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "()Lclient!fga;")
	@Override
	public Class3_Sub22 method9303() {
		return null;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "()I")
	@Override
	public int method9306() {
		@Pc(6) int local6 = this.anInt4665 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4672 == 0) {
			local6 -= local6 * this.anInt4670 / (((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53.length << 8);
		} else if (this.anInt4672 >= 0) {
			local6 -= local6 * this.anInt4675 / ((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "()Z")
	public boolean method3901() {
		return this.anInt4670 < 0 || this.anInt4670 >= ((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53.length << 8;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([IIIII)I")
	private int method3902(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4662 <= 0) {
				if (this.anInt4673 == -256 && (this.anInt4670 & 0xFF) == 0) {
					if (Static510.aBoolean777) {
						return Static727.method3894(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4664, this.anInt4663, arg3, arg2, this);
					}
					return Static727.method3890(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4665, arg3, arg2, this);
				}
				if (Static510.aBoolean777) {
					return Static727.method3878(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4664, this.anInt4663, arg3, arg2, this, this.anInt4673, arg4);
				}
				return Static727.method3886(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4665, arg3, arg2, this, this.anInt4673, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4662;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4662 += arg1;
			if (this.anInt4673 == -256 && (this.anInt4670 & 0xFF) == 0) {
				if (Static510.aBoolean777) {
					arg1 = Static727.method3884(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4664, this.anInt4663, this.anInt4669, this.anInt4671, local5, arg2, this);
				} else {
					arg1 = Static727.method3912(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4665, this.anInt4667, local5, arg2, this);
				}
			} else if (Static510.aBoolean777) {
				arg1 = Static727.method3903(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4664, this.anInt4663, this.anInt4669, this.anInt4671, local5, arg2, this, this.anInt4673, arg4);
			} else {
				arg1 = Static727.method3913(((Class3_Sub33_Sub1) super.aClass3_Sub33_6).aByteArray53, arg0, this.anInt4670, arg1, this.anInt4665, this.anInt4667, local5, arg2, this, this.anInt4673, arg4);
			}
			this.anInt4662 -= arg1;
			if (this.anInt4662 != 0) {
				return arg1;
			}
		} while (!this.method3909());
		return arg3;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9304(@OriginalArg(0) int arg0) {
		if (this.anInt4662 > 0) {
			if (arg0 >= this.anInt4662) {
				if (this.anInt4668 == Integer.MIN_VALUE) {
					this.anInt4668 = 0;
					this.anInt4665 = this.anInt4664 = this.anInt4663 = 0;
					this.method9446();
					arg0 = this.anInt4662;
				}
				this.anInt4662 = 0;
				this.method3887();
			} else {
				this.anInt4665 += this.anInt4667 * arg0;
				this.anInt4664 += this.anInt4669 * arg0;
				this.anInt4663 += this.anInt4671 * arg0;
				this.anInt4662 -= arg0;
			}
		}
		@Pc(71) Class3_Sub33_Sub1 local71 = (Class3_Sub33_Sub1) super.aClass3_Sub33_6;
		@Pc(76) int local76 = this.anInt4675 << 8;
		@Pc(81) int local81 = this.anInt4674 << 8;
		@Pc(87) int local87 = local71.aByteArray53.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4672 = 0;
		}
		if (this.anInt4670 < 0) {
			if (this.anInt4673 <= 0) {
				this.method3917();
				this.method9446();
				return;
			}
			this.anInt4670 = 0;
		}
		if (this.anInt4670 >= local87) {
			if (this.anInt4673 >= 0) {
				this.method3917();
				this.method9446();
				return;
			}
			this.anInt4670 = local87 - 1;
		}
		this.anInt4670 += this.anInt4673 * arg0;
		if (this.anInt4672 >= 0) {
			if (this.anInt4672 > 0) {
				if (this.aBoolean410) {
					label125: {
						if (this.anInt4673 < 0) {
							if (this.anInt4670 >= local76) {
								return;
							}
							this.anInt4670 = local76 + local76 - this.anInt4670 - 1;
							this.anInt4673 = -this.anInt4673;
							if (--this.anInt4672 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4670 < local81) {
								return;
							}
							this.anInt4670 = local81 + local81 - this.anInt4670 - 1;
							this.anInt4673 = -this.anInt4673;
							if (--this.anInt4672 == 0) {
								break;
							}
							if (this.anInt4670 >= local76) {
								return;
							}
							this.anInt4670 = local76 + local76 - this.anInt4670 - 1;
							this.anInt4673 = -this.anInt4673;
						} while (--this.anInt4672 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4673 < 0) {
						if (this.anInt4670 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4670 - 1) / local91;
						if (local361 < this.anInt4672) {
							this.anInt4670 += local91 * local361;
							this.anInt4672 -= local361;
							return;
						}
						this.anInt4670 += local91 * this.anInt4672;
						this.anInt4672 = 0;
					} else if (this.anInt4670 >= local81) {
						local361 = (this.anInt4670 - local76) / local91;
						if (local361 < this.anInt4672) {
							this.anInt4670 -= local91 * local361;
							this.anInt4672 -= local361;
							return;
						}
						this.anInt4670 -= local91 * this.anInt4672;
						this.anInt4672 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4673 < 0) {
				if (this.anInt4670 < 0) {
					this.anInt4670 = -1;
					this.method3917();
					this.method9446();
					return;
				}
			} else if (this.anInt4670 >= local87) {
				this.anInt4670 = local87;
				this.method3917();
				this.method9446();
			}
		} else if (this.aBoolean410) {
			if (this.anInt4673 < 0) {
				if (this.anInt4670 >= local76) {
					return;
				}
				this.anInt4670 = local76 + local76 - this.anInt4670 - 1;
				this.anInt4673 = -this.anInt4673;
			}
			while (this.anInt4670 >= local81) {
				this.anInt4670 = local81 + local81 - this.anInt4670 - 1;
				this.anInt4673 = -this.anInt4673;
				if (this.anInt4670 >= local76) {
					return;
				}
				this.anInt4670 = local76 + local76 - this.anInt4670 - 1;
				this.anInt4673 = -this.anInt4673;
			}
		} else if (this.anInt4673 < 0) {
			if (this.anInt4670 < local76) {
				this.anInt4670 = local81 - (local81 - 1 - this.anInt4670) % local91 - 1;
			}
		} else if (this.anInt4670 >= local81) {
			this.anInt4670 = local76 + (this.anInt4670 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "()I")
	public synchronized int method3904() {
		return this.anInt4668 == Integer.MIN_VALUE ? 0 : this.anInt4668;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public synchronized void method3905(@OriginalArg(0) int arg0) {
		if (this.anInt4673 < 0) {
			this.anInt4673 = -arg0;
		} else {
			this.anInt4673 = arg0;
		}
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)V")
	public synchronized void method3906(@OriginalArg(0) int arg0) {
		this.method3882(arg0 << 6, this.method3898());
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	public synchronized void method3908() {
		this.anInt4673 = (this.anInt4673 ^ this.anInt4673 >> 31) + (this.anInt4673 >>> 31);
		this.anInt4673 = -this.anInt4673;
	}

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "()Z")
	private boolean method3909() {
		@Pc(2) int local2 = this.anInt4668;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static727.method3892(local2, this.anInt4666);
			local8 = Static727.method3880(local2, this.anInt4666);
		}
		if (this.anInt4665 != local2 || this.anInt4664 != local10 || this.anInt4663 != local8) {
			if (this.anInt4665 < local2) {
				this.anInt4667 = 1;
				this.anInt4662 = local2 - this.anInt4665;
			} else if (this.anInt4665 > local2) {
				this.anInt4667 = -1;
				this.anInt4662 = this.anInt4665 - local2;
			} else {
				this.anInt4667 = 0;
			}
			if (this.anInt4664 < local10) {
				this.anInt4669 = 1;
				if (this.anInt4662 == 0 || this.anInt4662 > local10 - this.anInt4664) {
					this.anInt4662 = local10 - this.anInt4664;
				}
			} else if (this.anInt4664 > local10) {
				this.anInt4669 = -1;
				if (this.anInt4662 == 0 || this.anInt4662 > this.anInt4664 - local10) {
					this.anInt4662 = this.anInt4664 - local10;
				}
			} else {
				this.anInt4669 = 0;
			}
			if (this.anInt4663 < local8) {
				this.anInt4671 = 1;
				if (this.anInt4662 == 0 || this.anInt4662 > local8 - this.anInt4663) {
					this.anInt4662 = local8 - this.anInt4663;
				}
			} else if (this.anInt4663 > local8) {
				this.anInt4671 = -1;
				if (this.anInt4662 == 0 || this.anInt4662 > this.anInt4663 - local8) {
					this.anInt4662 = this.anInt4663 - local8;
				}
			} else {
				this.anInt4671 = 0;
			}
			return false;
		} else if (this.anInt4668 == Integer.MIN_VALUE) {
			this.anInt4668 = 0;
			this.anInt4665 = this.anInt4664 = this.anInt4663 = 0;
			this.method9446();
			return true;
		} else {
			this.method3887();
			return false;
		}
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(II)V")
	public synchronized void method3910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3916(arg0, arg1, this.method3898());
	}

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "()I")
	public synchronized int method3911() {
		return this.anInt4673 < 0 ? -this.anInt4673 : this.anInt4673;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
	public synchronized void method3916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3882(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static727.method3892(arg1, arg2);
		@Pc(14) int local14 = Static727.method3880(arg1, arg2);
		if (this.anInt4664 == local10 && this.anInt4663 == local14) {
			this.anInt4662 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4665;
		if (this.anInt4665 - arg1 > local31) {
			local31 = this.anInt4665 - arg1;
		}
		if (local10 - this.anInt4664 > local31) {
			local31 = local10 - this.anInt4664;
		}
		if (this.anInt4664 - local10 > local31) {
			local31 = this.anInt4664 - local10;
		}
		if (local14 - this.anInt4663 > local31) {
			local31 = local14 - this.anInt4663;
		}
		if (this.anInt4663 - local14 > local31) {
			local31 = this.anInt4663 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4662 = arg0;
		this.anInt4668 = arg1;
		this.anInt4666 = arg2;
		this.anInt4667 = (arg1 - this.anInt4665) / arg0;
		this.anInt4669 = (local10 - this.anInt4664) / arg0;
		this.anInt4671 = (local14 - this.anInt4663) / arg0;
	}

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "()V")
	private void method3917() {
		if (this.anInt4662 == 0) {
			return;
		}
		if (this.anInt4668 == Integer.MIN_VALUE) {
			this.anInt4668 = 0;
		}
		this.anInt4662 = 0;
		this.method3887();
	}
}
