import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class3_Sub7_Sub3 extends Class3_Sub7 {

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
	public int anInt4584;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
	private int anInt4585;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	public int anInt4586;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public int anInt4589;

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
	public int anInt4593;

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
	private int anInt4596;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
	public int anInt4597;

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
	private final int anInt4591;

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
	private final int anInt4595;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "Z")
	private final boolean aBoolean310;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
	private int anInt4594;

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
	private int anInt4592;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
	private int anInt4587;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
	public int anInt4588;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!jda;III)V")
	public Class3_Sub7_Sub3(@OriginalArg(0) Class3_Sub30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass3_Sub30_6 = arg0;
		this.anInt4591 = arg0.anInt4762;
		this.anInt4595 = arg0.anInt4761;
		this.aBoolean310 = arg0.aBoolean313;
		this.anInt4594 = arg1;
		this.anInt4592 = arg2;
		this.anInt4587 = arg3;
		this.anInt4588 = 0;
		this.method4061();
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "()I")
	@Override
	public int method8762() {
		@Pc(6) int local6 = this.anInt4589 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4596 == 0) {
			local6 -= local6 * this.anInt4588 / (((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55.length << 8);
		} else if (this.anInt4596 >= 0) {
			local6 -= local6 * this.anInt4591 / ((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "()I")
	public synchronized int method4040() {
		return this.anInt4592 == Integer.MIN_VALUE ? 0 : this.anInt4592;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	private synchronized void method4043() {
		this.method4063(0, this.method4053());
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
	public synchronized void method4044(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4588 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "()I")
	public synchronized int method4045() {
		return this.anInt4594 < 0 ? -this.anInt4594 : this.anInt4594;
	}

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "()V")
	private void method4047() {
		if (this.anInt4585 == 0) {
			return;
		}
		if (this.anInt4592 == Integer.MIN_VALUE) {
			this.anInt4592 = 0;
		}
		this.anInt4585 = 0;
		this.method4061();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([IIIII)I")
	private int method4048(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4585 <= 0) {
				if (this.anInt4594 == -256 && (this.anInt4588 & 0xFF) == 0) {
					if (Static447.aBoolean556) {
						return Static647.method4042(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4586, this.anInt4597, arg3, arg2, this);
					}
					return Static647.method4039(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4589, arg3, arg2, this);
				}
				if (Static447.aBoolean556) {
					return Static647.method4076(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4586, this.anInt4597, arg3, arg2, this, this.anInt4594, arg4);
				}
				return Static647.method4060(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4589, arg3, arg2, this, this.anInt4594, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4585;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4585 += arg1;
			if (this.anInt4594 == -256 && (this.anInt4588 & 0xFF) == 0) {
				if (Static447.aBoolean556) {
					arg1 = Static647.method4062(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4586, this.anInt4597, this.anInt4590, this.anInt4593, local5, arg2, this);
				} else {
					arg1 = Static647.method4054(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4589, this.anInt4584, local5, arg2, this);
				}
			} else if (Static447.aBoolean556) {
				arg1 = Static647.method4066(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4586, this.anInt4597, this.anInt4590, this.anInt4593, local5, arg2, this, this.anInt4594, arg4);
			} else {
				arg1 = Static647.method4059(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4589, this.anInt4584, local5, arg2, this, this.anInt4594, arg4);
			}
			this.anInt4585 -= arg1;
			if (this.anInt4585 != 0) {
				return arg1;
			}
		} while (!this.method4055());
		return arg3;
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "()I")
	@Override
	public int method8763() {
		return this.anInt4592 == 0 && this.anInt4585 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "()Z")
	public boolean method4050() {
		return this.anInt4588 < 0 || this.anInt4588 >= ((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55.length << 8;
	}

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "()I")
	public synchronized int method4053() {
		return this.anInt4587 < 0 ? -1 : this.anInt4587;
	}

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "()Z")
	private boolean method4055() {
		@Pc(2) int local2 = this.anInt4592;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static647.method4069(local2, this.anInt4587);
			local8 = Static647.method4057(local2, this.anInt4587);
		}
		if (this.anInt4589 != local2 || this.anInt4586 != local10 || this.anInt4597 != local8) {
			if (this.anInt4589 < local2) {
				this.anInt4584 = 1;
				this.anInt4585 = local2 - this.anInt4589;
			} else if (this.anInt4589 > local2) {
				this.anInt4584 = -1;
				this.anInt4585 = this.anInt4589 - local2;
			} else {
				this.anInt4584 = 0;
			}
			if (this.anInt4586 < local10) {
				this.anInt4590 = 1;
				if (this.anInt4585 == 0 || this.anInt4585 > local10 - this.anInt4586) {
					this.anInt4585 = local10 - this.anInt4586;
				}
			} else if (this.anInt4586 > local10) {
				this.anInt4590 = -1;
				if (this.anInt4585 == 0 || this.anInt4585 > this.anInt4586 - local10) {
					this.anInt4585 = this.anInt4586 - local10;
				}
			} else {
				this.anInt4590 = 0;
			}
			if (this.anInt4597 < local8) {
				this.anInt4593 = 1;
				if (this.anInt4585 == 0 || this.anInt4585 > local8 - this.anInt4597) {
					this.anInt4585 = local8 - this.anInt4597;
				}
			} else if (this.anInt4597 > local8) {
				this.anInt4593 = -1;
				if (this.anInt4585 == 0 || this.anInt4585 > this.anInt4597 - local8) {
					this.anInt4585 = this.anInt4597 - local8;
				}
			} else {
				this.anInt4593 = 0;
			}
			return false;
		} else if (this.anInt4592 == Integer.MIN_VALUE) {
			this.anInt4592 = 0;
			this.anInt4589 = this.anInt4586 = this.anInt4597 = 0;
			this.method8769();
			return true;
		} else {
			this.method4061();
			return false;
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)V")
	public synchronized void method4056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4065(arg0, arg1, this.method4053());
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "()Lclient!os;")
	@Override
	public Class3_Sub7 method8761() {
		return null;
	}

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "()V")
	private void method4061() {
		this.anInt4589 = this.anInt4592;
		this.anInt4586 = Static647.method4069(this.anInt4592, this.anInt4587);
		this.anInt4597 = Static647.method4057(this.anInt4592, this.anInt4587);
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(II)V")
	private synchronized void method4063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4592 = arg0;
		this.anInt4587 = arg1;
		this.anInt4585 = 0;
		this.method4061();
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
	public synchronized void method4064(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4043();
			this.method8769();
		} else if (this.anInt4586 == 0 && this.anInt4597 == 0) {
			this.anInt4585 = 0;
			this.anInt4592 = 0;
			this.anInt4589 = 0;
			this.method8769();
		} else {
			@Pc(31) int local31 = -this.anInt4589;
			if (this.anInt4589 > local31) {
				local31 = this.anInt4589;
			}
			if (-this.anInt4586 > local31) {
				local31 = -this.anInt4586;
			}
			if (this.anInt4586 > local31) {
				local31 = this.anInt4586;
			}
			if (-this.anInt4597 > local31) {
				local31 = -this.anInt4597;
			}
			if (this.anInt4597 > local31) {
				local31 = this.anInt4597;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4585 = arg0;
			this.anInt4592 = Integer.MIN_VALUE;
			this.anInt4584 = -this.anInt4589 / arg0;
			this.anInt4590 = -this.anInt4586 / arg0;
			this.anInt4593 = -this.anInt4597 / arg0;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	public synchronized void method4065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4063(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static647.method4069(arg1, arg2);
		@Pc(14) int local14 = Static647.method4057(arg1, arg2);
		if (this.anInt4586 == local10 && this.anInt4597 == local14) {
			this.anInt4585 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4589;
		if (this.anInt4589 - arg1 > local31) {
			local31 = this.anInt4589 - arg1;
		}
		if (local10 - this.anInt4586 > local31) {
			local31 = local10 - this.anInt4586;
		}
		if (this.anInt4586 - local10 > local31) {
			local31 = this.anInt4586 - local10;
		}
		if (local14 - this.anInt4597 > local31) {
			local31 = local14 - this.anInt4597;
		}
		if (this.anInt4597 - local14 > local31) {
			local31 = this.anInt4597 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4585 = arg0;
		this.anInt4592 = arg1;
		this.anInt4587 = arg2;
		this.anInt4584 = (arg1 - this.anInt4589) / arg0;
		this.anInt4590 = (local10 - this.anInt4586) / arg0;
		this.anInt4593 = (local14 - this.anInt4597) / arg0;
	}

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "()Z")
	public boolean method4067() {
		return this.anInt4585 != 0;
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V")
	public synchronized void method4068(@OriginalArg(0) int arg0) {
		this.anInt4596 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)V")
	public synchronized void method4070(@OriginalArg(0) int arg0) {
		if (this.anInt4594 < 0) {
			this.anInt4594 = -arg0;
		} else {
			this.anInt4594 = arg0;
		}
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)V")
	public synchronized void method4072(@OriginalArg(0) int arg0) {
		this.method4063(this.method4040(), arg0);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
	public synchronized void method4073() {
		this.anInt4594 = (this.anInt4594 ^ this.anInt4594 >> 31) + (this.anInt4594 >>> 31);
		this.anInt4594 = -this.anInt4594;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "([IIIII)I")
	private int method4074(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4585 <= 0) {
				if (this.anInt4594 == 256 && (this.anInt4588 & 0xFF) == 0) {
					if (Static447.aBoolean556) {
						return Static647.method4049(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4586, this.anInt4597, arg3, arg2, this);
					}
					return Static647.method4075(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4589, arg3, arg2, this);
				}
				if (Static447.aBoolean556) {
					return Static647.method4078(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4586, this.anInt4597, arg3, arg2, this, this.anInt4594, arg4);
				}
				return Static647.method4052(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4589, arg3, arg2, this, this.anInt4594, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4585;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4585 += arg1;
			if (this.anInt4594 == 256 && (this.anInt4588 & 0xFF) == 0) {
				if (Static447.aBoolean556) {
					arg1 = Static647.method4051(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4586, this.anInt4597, this.anInt4590, this.anInt4593, local5, arg2, this);
				} else {
					arg1 = Static647.method4046(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4589, this.anInt4584, local5, arg2, this);
				}
			} else if (Static447.aBoolean556) {
				arg1 = Static647.method4071(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4586, this.anInt4597, this.anInt4590, this.anInt4593, local5, arg2, this, this.anInt4594, arg4);
			} else {
				arg1 = Static647.method4041(((Class3_Sub30_Sub1) super.aClass3_Sub30_6).aByteArray55, arg0, this.anInt4588, arg1, this.anInt4589, this.anInt4584, local5, arg2, this, this.anInt4594, arg4);
			}
			this.anInt4585 -= arg1;
			if (this.anInt4585 != 0) {
				return arg1;
			}
		} while (!this.method4055());
		return arg3;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8758(@OriginalArg(0) int arg0) {
		if (this.anInt4585 > 0) {
			if (arg0 >= this.anInt4585) {
				if (this.anInt4592 == Integer.MIN_VALUE) {
					this.anInt4592 = 0;
					this.anInt4589 = this.anInt4586 = this.anInt4597 = 0;
					this.method8769();
					arg0 = this.anInt4585;
				}
				this.anInt4585 = 0;
				this.method4061();
			} else {
				this.anInt4589 += this.anInt4584 * arg0;
				this.anInt4586 += this.anInt4590 * arg0;
				this.anInt4597 += this.anInt4593 * arg0;
				this.anInt4585 -= arg0;
			}
		}
		@Pc(71) Class3_Sub30_Sub1 local71 = (Class3_Sub30_Sub1) super.aClass3_Sub30_6;
		@Pc(76) int local76 = this.anInt4591 << 8;
		@Pc(81) int local81 = this.anInt4595 << 8;
		@Pc(87) int local87 = local71.aByteArray55.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4596 = 0;
		}
		if (this.anInt4588 < 0) {
			if (this.anInt4594 <= 0) {
				this.method4047();
				this.method8769();
				return;
			}
			this.anInt4588 = 0;
		}
		if (this.anInt4588 >= local87) {
			if (this.anInt4594 >= 0) {
				this.method4047();
				this.method8769();
				return;
			}
			this.anInt4588 = local87 - 1;
		}
		this.anInt4588 += this.anInt4594 * arg0;
		if (this.anInt4596 >= 0) {
			if (this.anInt4596 > 0) {
				if (this.aBoolean310) {
					label125: {
						if (this.anInt4594 < 0) {
							if (this.anInt4588 >= local76) {
								return;
							}
							this.anInt4588 = local76 + local76 - this.anInt4588 - 1;
							this.anInt4594 = -this.anInt4594;
							if (--this.anInt4596 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4588 < local81) {
								return;
							}
							this.anInt4588 = local81 + local81 - this.anInt4588 - 1;
							this.anInt4594 = -this.anInt4594;
							if (--this.anInt4596 == 0) {
								break;
							}
							if (this.anInt4588 >= local76) {
								return;
							}
							this.anInt4588 = local76 + local76 - this.anInt4588 - 1;
							this.anInt4594 = -this.anInt4594;
						} while (--this.anInt4596 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4594 < 0) {
						if (this.anInt4588 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4588 - 1) / local91;
						if (local361 < this.anInt4596) {
							this.anInt4588 += local91 * local361;
							this.anInt4596 -= local361;
							return;
						}
						this.anInt4588 += local91 * this.anInt4596;
						this.anInt4596 = 0;
					} else if (this.anInt4588 >= local81) {
						local361 = (this.anInt4588 - local76) / local91;
						if (local361 < this.anInt4596) {
							this.anInt4588 -= local91 * local361;
							this.anInt4596 -= local361;
							return;
						}
						this.anInt4588 -= local91 * this.anInt4596;
						this.anInt4596 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4594 < 0) {
				if (this.anInt4588 < 0) {
					this.anInt4588 = -1;
					this.method4047();
					this.method8769();
					return;
				}
			} else if (this.anInt4588 >= local87) {
				this.anInt4588 = local87;
				this.method4047();
				this.method8769();
			}
		} else if (this.aBoolean310) {
			if (this.anInt4594 < 0) {
				if (this.anInt4588 >= local76) {
					return;
				}
				this.anInt4588 = local76 + local76 - this.anInt4588 - 1;
				this.anInt4594 = -this.anInt4594;
			}
			while (this.anInt4588 >= local81) {
				this.anInt4588 = local81 + local81 - this.anInt4588 - 1;
				this.anInt4594 = -this.anInt4594;
				if (this.anInt4588 >= local76) {
					return;
				}
				this.anInt4588 = local76 + local76 - this.anInt4588 - 1;
				this.anInt4594 = -this.anInt4594;
			}
		} else if (this.anInt4594 < 0) {
			if (this.anInt4588 < local76) {
				this.anInt4588 = local81 - (local81 - 1 - this.anInt4588) % local91 - 1;
			}
		} else if (this.anInt4588 >= local81) {
			this.anInt4588 = local76 + (this.anInt4588 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)V")
	public synchronized void method4077(@OriginalArg(0) int arg0) {
		this.method4063(arg0 << 6, this.method4053());
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "()Lclient!os;")
	@Override
	public Class3_Sub7 method8760() {
		return null;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8757(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4592 == 0 && this.anInt4585 == 0) {
			this.method8758(arg2);
			return;
		}
		@Pc(13) Class3_Sub30_Sub1 local13 = (Class3_Sub30_Sub1) super.aClass3_Sub30_6;
		@Pc(18) int local18 = this.anInt4591 << 8;
		@Pc(23) int local23 = this.anInt4595 << 8;
		@Pc(29) int local29 = local13.aByteArray55.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4596 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4588 < 0) {
			if (this.anInt4594 <= 0) {
				this.method4047();
				this.method8769();
				return;
			}
			this.anInt4588 = 0;
		}
		if (this.anInt4588 >= local29) {
			if (this.anInt4594 >= 0) {
				this.method4047();
				this.method8769();
				return;
			}
			this.anInt4588 = local29 - 1;
		}
		if (this.anInt4596 >= 0) {
			if (this.anInt4596 > 0) {
				if (this.aBoolean310) {
					label130: {
						if (this.anInt4594 < 0) {
							local40 = this.method4048(arg0, arg1, local18, local44, local13.aByteArray55[this.anInt4591]);
							if (this.anInt4588 >= local18) {
								return;
							}
							this.anInt4588 = local18 + local18 - this.anInt4588 - 1;
							this.anInt4594 = -this.anInt4594;
							if (--this.anInt4596 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4074(arg0, local40, local23, local44, local13.aByteArray55[this.anInt4595 - 1]);
							if (this.anInt4588 < local23) {
								return;
							}
							this.anInt4588 = local23 + local23 - this.anInt4588 - 1;
							this.anInt4594 = -this.anInt4594;
							if (--this.anInt4596 == 0) {
								break;
							}
							local40 = this.method4048(arg0, local40, local18, local44, local13.aByteArray55[this.anInt4591]);
							if (this.anInt4588 >= local18) {
								return;
							}
							this.anInt4588 = local18 + local18 - this.anInt4588 - 1;
							this.anInt4594 = -this.anInt4594;
						} while (--this.anInt4596 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4594 < 0) {
						while (true) {
							local40 = this.method4048(arg0, local40, local18, local44, local13.aByteArray55[this.anInt4595 - 1]);
							if (this.anInt4588 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4588 - 1) / local33;
							if (local416 >= this.anInt4596) {
								this.anInt4588 += local33 * this.anInt4596;
								this.anInt4596 = 0;
								break;
							}
							this.anInt4588 += local33 * local416;
							this.anInt4596 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4074(arg0, local40, local23, local44, local13.aByteArray55[this.anInt4591]);
							if (this.anInt4588 < local23) {
								return;
							}
							local416 = (this.anInt4588 - local18) / local33;
							if (local416 >= this.anInt4596) {
								this.anInt4588 -= local33 * this.anInt4596;
								this.anInt4596 = 0;
								break;
							}
							this.anInt4588 -= local33 * local416;
							this.anInt4596 -= local416;
						}
					}
				}
			}
			if (this.anInt4594 < 0) {
				this.method4048(arg0, local40, 0, local44, 0);
				if (this.anInt4588 < 0) {
					this.anInt4588 = -1;
					this.method4047();
					this.method8769();
					return;
				}
			} else {
				this.method4074(arg0, local40, local29, local44, 0);
				if (this.anInt4588 >= local29) {
					this.anInt4588 = local29;
					this.method4047();
					this.method8769();
				}
			}
		} else if (this.aBoolean310) {
			if (this.anInt4594 < 0) {
				local40 = this.method4048(arg0, arg1, local18, local44, local13.aByteArray55[this.anInt4591]);
				if (this.anInt4588 >= local18) {
					return;
				}
				this.anInt4588 = local18 + local18 - this.anInt4588 - 1;
				this.anInt4594 = -this.anInt4594;
			}
			while (true) {
				local40 = this.method4074(arg0, local40, local23, local44, local13.aByteArray55[this.anInt4595 - 1]);
				if (this.anInt4588 < local23) {
					return;
				}
				this.anInt4588 = local23 + local23 - this.anInt4588 - 1;
				this.anInt4594 = -this.anInt4594;
				local40 = this.method4048(arg0, local40, local18, local44, local13.aByteArray55[this.anInt4591]);
				if (this.anInt4588 >= local18) {
					return;
				}
				this.anInt4588 = local18 + local18 - this.anInt4588 - 1;
				this.anInt4594 = -this.anInt4594;
			}
		} else if (this.anInt4594 < 0) {
			while (true) {
				local40 = this.method4048(arg0, local40, local18, local44, local13.aByteArray55[this.anInt4595 - 1]);
				if (this.anInt4588 >= local18) {
					return;
				}
				this.anInt4588 = local23 - (local23 - 1 - this.anInt4588) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4074(arg0, local40, local23, local44, local13.aByteArray55[this.anInt4591]);
				if (this.anInt4588 < local23) {
					return;
				}
				this.anInt4588 = local18 + (this.anInt4588 - local18) % local33;
			}
		}
	}
}
