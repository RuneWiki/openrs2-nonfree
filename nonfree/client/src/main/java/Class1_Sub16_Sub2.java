import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class1_Sub16_Sub2 extends Class1_Sub16 {

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
	public int anInt4751;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
	private int anInt4754;

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
	public int anInt4756;

	@OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
	public int anInt4757;

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "I")
	public int anInt4758;

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "I")
	public int anInt4760;

	@OriginalMember(owner = "client!ju", name = "A", descriptor = "I")
	private int anInt4763;

	@OriginalMember(owner = "client!ju", name = "B", descriptor = "I")
	public int anInt4764;

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
	private final int anInt4753;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
	private final int anInt4752;

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "Z")
	private final boolean aBoolean336;

	@OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
	private int anInt4762;

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
	private int anInt4761;

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
	private int anInt4755;

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "I")
	public int anInt4759;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!ti;II)V")
	public Class1_Sub16_Sub2(@OriginalArg(0) Class1_Sub37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub37_5 = arg0;
		this.anInt4753 = arg0.anInt7862;
		this.anInt4752 = arg0.anInt7860;
		this.aBoolean336 = arg0.aBoolean560;
		this.anInt4762 = arg1;
		this.anInt4761 = arg2;
		this.anInt4755 = 8192;
		this.anInt4759 = 0;
		this.method4098();
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!ti;III)V")
	public Class1_Sub16_Sub2(@OriginalArg(0) Class1_Sub37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub37_5 = arg0;
		this.anInt4753 = arg0.anInt7862;
		this.anInt4752 = arg0.anInt7860;
		this.aBoolean336 = arg0.aBoolean560;
		this.anInt4762 = arg1;
		this.anInt4761 = arg2;
		this.anInt4755 = arg3;
		this.anInt4759 = 0;
		this.method4098();
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
	private synchronized void method4081() {
		this.method4094(0, this.method4102());
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "()I")
	@Override
	public int method5751() {
		@Pc(6) int local6 = this.anInt4751 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4763 == 0) {
			local6 -= local6 * this.anInt4759 / (((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111.length << 8);
		} else if (this.anInt4763 >= 0) {
			local6 -= local6 * this.anInt4753 / ((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
	public synchronized void method4083(@OriginalArg(0) int arg0) {
		this.anInt4763 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "(I)V")
	public synchronized void method4084(@OriginalArg(0) int arg0) {
		this.method4094(arg0 << 6, this.method4102());
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
	public synchronized void method4085() {
		this.anInt4762 = (this.anInt4762 ^ this.anInt4762 >> 31) + (this.anInt4762 >>> 31);
		this.anInt4762 = -this.anInt4762;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)V")
	public synchronized void method4087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4094(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static555.method4090(arg1, arg2);
		@Pc(14) int local14 = Static555.method4089(arg1, arg2);
		if (this.anInt4758 == local10 && this.anInt4757 == local14) {
			this.anInt4754 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4751;
		if (this.anInt4751 - arg1 > local31) {
			local31 = this.anInt4751 - arg1;
		}
		if (local10 - this.anInt4758 > local31) {
			local31 = local10 - this.anInt4758;
		}
		if (this.anInt4758 - local10 > local31) {
			local31 = this.anInt4758 - local10;
		}
		if (local14 - this.anInt4757 > local31) {
			local31 = local14 - this.anInt4757;
		}
		if (this.anInt4757 - local14 > local31) {
			local31 = this.anInt4757 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4754 = arg0;
		this.anInt4761 = arg1;
		this.anInt4755 = arg2;
		this.anInt4756 = (arg1 - this.anInt4751) / arg0;
		this.anInt4760 = (local10 - this.anInt4758) / arg0;
		this.anInt4764 = (local14 - this.anInt4757) / arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "()Lclient!gv;")
	@Override
	public Class1_Sub16 method5748() {
		return null;
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(II)V")
	private synchronized void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4761 = arg0;
		this.anInt4755 = arg1;
		this.anInt4754 = 0;
		this.method4098();
	}

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "()I")
	public synchronized int method4097() {
		return this.anInt4762 < 0 ? -this.anInt4762 : this.anInt4762;
	}

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "()V")
	private void method4098() {
		this.anInt4751 = this.anInt4761;
		this.anInt4758 = Static555.method4090(this.anInt4761, this.anInt4755);
		this.anInt4757 = Static555.method4089(this.anInt4761, this.anInt4755);
	}

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "()Z")
	private boolean method4099() {
		@Pc(2) int local2 = this.anInt4761;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static555.method4090(local2, this.anInt4755);
			local8 = Static555.method4089(local2, this.anInt4755);
		}
		if (this.anInt4751 != local2 || this.anInt4758 != local10 || this.anInt4757 != local8) {
			if (this.anInt4751 < local2) {
				this.anInt4756 = 1;
				this.anInt4754 = local2 - this.anInt4751;
			} else if (this.anInt4751 > local2) {
				this.anInt4756 = -1;
				this.anInt4754 = this.anInt4751 - local2;
			} else {
				this.anInt4756 = 0;
			}
			if (this.anInt4758 < local10) {
				this.anInt4760 = 1;
				if (this.anInt4754 == 0 || this.anInt4754 > local10 - this.anInt4758) {
					this.anInt4754 = local10 - this.anInt4758;
				}
			} else if (this.anInt4758 > local10) {
				this.anInt4760 = -1;
				if (this.anInt4754 == 0 || this.anInt4754 > this.anInt4758 - local10) {
					this.anInt4754 = this.anInt4758 - local10;
				}
			} else {
				this.anInt4760 = 0;
			}
			if (this.anInt4757 < local8) {
				this.anInt4764 = 1;
				if (this.anInt4754 == 0 || this.anInt4754 > local8 - this.anInt4757) {
					this.anInt4754 = local8 - this.anInt4757;
				}
			} else if (this.anInt4757 > local8) {
				this.anInt4764 = -1;
				if (this.anInt4754 == 0 || this.anInt4754 > this.anInt4757 - local8) {
					this.anInt4754 = this.anInt4757 - local8;
				}
			} else {
				this.anInt4764 = 0;
			}
			return false;
		} else if (this.anInt4761 == Integer.MIN_VALUE) {
			this.anInt4761 = 0;
			this.anInt4751 = this.anInt4758 = this.anInt4757 = 0;
			this.method7525();
			return true;
		} else {
			this.method4098();
			return false;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([IIIII)I")
	private int method4100(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4754 <= 0) {
				if (this.anInt4762 == -256 && (this.anInt4759 & 0xFF) == 0) {
					if (Static187.aBoolean231) {
						return Static555.method4111(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4758, this.anInt4757, arg3, arg2, this);
					}
					return Static555.method4091(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4751, arg3, arg2, this);
				}
				if (Static187.aBoolean231) {
					return Static555.method4109(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4758, this.anInt4757, arg3, arg2, this, this.anInt4762, arg4);
				}
				return Static555.method4086(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4751, arg3, arg2, this, this.anInt4762, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4754;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4754 += arg1;
			if (this.anInt4762 == -256 && (this.anInt4759 & 0xFF) == 0) {
				if (Static187.aBoolean231) {
					arg1 = Static555.method4093(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4758, this.anInt4757, this.anInt4760, this.anInt4764, local5, arg2, this);
				} else {
					arg1 = Static555.method4104(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4751, this.anInt4756, local5, arg2, this);
				}
			} else if (Static187.aBoolean231) {
				arg1 = Static555.method4119(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4758, this.anInt4757, this.anInt4760, this.anInt4764, local5, arg2, this, this.anInt4762, arg4);
			} else {
				arg1 = Static555.method4114(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4751, this.anInt4756, local5, arg2, this, this.anInt4762, arg4);
			}
			this.anInt4754 -= arg1;
			if (this.anInt4754 != 0) {
				return arg1;
			}
		} while (!this.method4099());
		return arg3;
	}

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "()V")
	private void method4101() {
		if (this.anInt4754 == 0) {
			return;
		}
		if (this.anInt4761 == Integer.MIN_VALUE) {
			this.anInt4761 = 0;
		}
		this.anInt4754 = 0;
		this.method4098();
	}

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "()I")
	public synchronized int method4102() {
		return this.anInt4755 < 0 ? -1 : this.anInt4755;
	}

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "()I")
	public synchronized int method4103() {
		return this.anInt4761 == Integer.MIN_VALUE ? 0 : this.anInt4761;
	}

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "(I)V")
	public synchronized void method4105(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4759 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5754(@OriginalArg(0) int arg0) {
		if (this.anInt4754 > 0) {
			if (arg0 >= this.anInt4754) {
				if (this.anInt4761 == Integer.MIN_VALUE) {
					this.anInt4761 = 0;
					this.anInt4751 = this.anInt4758 = this.anInt4757 = 0;
					this.method7525();
					arg0 = this.anInt4754;
				}
				this.anInt4754 = 0;
				this.method4098();
			} else {
				this.anInt4751 += this.anInt4756 * arg0;
				this.anInt4758 += this.anInt4760 * arg0;
				this.anInt4757 += this.anInt4764 * arg0;
				this.anInt4754 -= arg0;
			}
		}
		@Pc(71) Class1_Sub37_Sub1 local71 = (Class1_Sub37_Sub1) super.aClass1_Sub37_5;
		@Pc(76) int local76 = this.anInt4753 << 8;
		@Pc(81) int local81 = this.anInt4752 << 8;
		@Pc(87) int local87 = local71.aByteArray111.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4763 = 0;
		}
		if (this.anInt4759 < 0) {
			if (this.anInt4762 <= 0) {
				this.method4101();
				this.method7525();
				return;
			}
			this.anInt4759 = 0;
		}
		if (this.anInt4759 >= local87) {
			if (this.anInt4762 >= 0) {
				this.method4101();
				this.method7525();
				return;
			}
			this.anInt4759 = local87 - 1;
		}
		this.anInt4759 += this.anInt4762 * arg0;
		if (this.anInt4763 >= 0) {
			if (this.anInt4763 > 0) {
				if (this.aBoolean336) {
					label125: {
						if (this.anInt4762 < 0) {
							if (this.anInt4759 >= local76) {
								return;
							}
							this.anInt4759 = local76 + local76 - this.anInt4759 - 1;
							this.anInt4762 = -this.anInt4762;
							if (--this.anInt4763 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4759 < local81) {
								return;
							}
							this.anInt4759 = local81 + local81 - this.anInt4759 - 1;
							this.anInt4762 = -this.anInt4762;
							if (--this.anInt4763 == 0) {
								break;
							}
							if (this.anInt4759 >= local76) {
								return;
							}
							this.anInt4759 = local76 + local76 - this.anInt4759 - 1;
							this.anInt4762 = -this.anInt4762;
						} while (--this.anInt4763 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4762 < 0) {
						if (this.anInt4759 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4759 - 1) / local91;
						if (local361 < this.anInt4763) {
							this.anInt4759 += local91 * local361;
							this.anInt4763 -= local361;
							return;
						}
						this.anInt4759 += local91 * this.anInt4763;
						this.anInt4763 = 0;
					} else if (this.anInt4759 >= local81) {
						local361 = (this.anInt4759 - local76) / local91;
						if (local361 < this.anInt4763) {
							this.anInt4759 -= local91 * local361;
							this.anInt4763 -= local361;
							return;
						}
						this.anInt4759 -= local91 * this.anInt4763;
						this.anInt4763 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4762 < 0) {
				if (this.anInt4759 < 0) {
					this.anInt4759 = -1;
					this.method4101();
					this.method7525();
					return;
				}
			} else if (this.anInt4759 >= local87) {
				this.anInt4759 = local87;
				this.method4101();
				this.method7525();
			}
		} else if (this.aBoolean336) {
			if (this.anInt4762 < 0) {
				if (this.anInt4759 >= local76) {
					return;
				}
				this.anInt4759 = local76 + local76 - this.anInt4759 - 1;
				this.anInt4762 = -this.anInt4762;
			}
			while (this.anInt4759 >= local81) {
				this.anInt4759 = local81 + local81 - this.anInt4759 - 1;
				this.anInt4762 = -this.anInt4762;
				if (this.anInt4759 >= local76) {
					return;
				}
				this.anInt4759 = local76 + local76 - this.anInt4759 - 1;
				this.anInt4762 = -this.anInt4762;
			}
		} else if (this.anInt4762 < 0) {
			if (this.anInt4759 < local76) {
				this.anInt4759 = local81 - (local81 - 1 - this.anInt4759) % local91 - 1;
			}
		} else if (this.anInt4759 >= local81) {
			this.anInt4759 = local76 + (this.anInt4759 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "([IIIII)I")
	private int method4107(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4754 <= 0) {
				if (this.anInt4762 == 256 && (this.anInt4759 & 0xFF) == 0) {
					if (Static187.aBoolean231) {
						return Static555.method4117(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4758, this.anInt4757, arg3, arg2, this);
					}
					return Static555.method4095(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4751, arg3, arg2, this);
				}
				if (Static187.aBoolean231) {
					return Static555.method4096(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4758, this.anInt4757, arg3, arg2, this, this.anInt4762, arg4);
				}
				return Static555.method4113(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4751, arg3, arg2, this, this.anInt4762, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4754;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4754 += arg1;
			if (this.anInt4762 == 256 && (this.anInt4759 & 0xFF) == 0) {
				if (Static187.aBoolean231) {
					arg1 = Static555.method4116(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4758, this.anInt4757, this.anInt4760, this.anInt4764, local5, arg2, this);
				} else {
					arg1 = Static555.method4080(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4751, this.anInt4756, local5, arg2, this);
				}
			} else if (Static187.aBoolean231) {
				arg1 = Static555.method4106(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4758, this.anInt4757, this.anInt4760, this.anInt4764, local5, arg2, this, this.anInt4762, arg4);
			} else {
				arg1 = Static555.method4092(((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111, arg0, this.anInt4759, arg1, this.anInt4751, this.anInt4756, local5, arg2, this, this.anInt4762, arg4);
			}
			this.anInt4754 -= arg1;
			if (this.anInt4754 != 0) {
				return arg1;
			}
		} while (!this.method4099());
		return arg3;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4761 == 0 && this.anInt4754 == 0) {
			this.method5754(arg2);
			return;
		}
		@Pc(13) Class1_Sub37_Sub1 local13 = (Class1_Sub37_Sub1) super.aClass1_Sub37_5;
		@Pc(18) int local18 = this.anInt4753 << 8;
		@Pc(23) int local23 = this.anInt4752 << 8;
		@Pc(29) int local29 = local13.aByteArray111.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4763 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4759 < 0) {
			if (this.anInt4762 <= 0) {
				this.method4101();
				this.method7525();
				return;
			}
			this.anInt4759 = 0;
		}
		if (this.anInt4759 >= local29) {
			if (this.anInt4762 >= 0) {
				this.method4101();
				this.method7525();
				return;
			}
			this.anInt4759 = local29 - 1;
		}
		if (this.anInt4763 >= 0) {
			if (this.anInt4763 > 0) {
				if (this.aBoolean336) {
					label130: {
						if (this.anInt4762 < 0) {
							local40 = this.method4100(arg0, arg1, local18, local44, local13.aByteArray111[this.anInt4753]);
							if (this.anInt4759 >= local18) {
								return;
							}
							this.anInt4759 = local18 + local18 - this.anInt4759 - 1;
							this.anInt4762 = -this.anInt4762;
							if (--this.anInt4763 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4107(arg0, local40, local23, local44, local13.aByteArray111[this.anInt4752 - 1]);
							if (this.anInt4759 < local23) {
								return;
							}
							this.anInt4759 = local23 + local23 - this.anInt4759 - 1;
							this.anInt4762 = -this.anInt4762;
							if (--this.anInt4763 == 0) {
								break;
							}
							local40 = this.method4100(arg0, local40, local18, local44, local13.aByteArray111[this.anInt4753]);
							if (this.anInt4759 >= local18) {
								return;
							}
							this.anInt4759 = local18 + local18 - this.anInt4759 - 1;
							this.anInt4762 = -this.anInt4762;
						} while (--this.anInt4763 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4762 < 0) {
						while (true) {
							local40 = this.method4100(arg0, local40, local18, local44, local13.aByteArray111[this.anInt4752 - 1]);
							if (this.anInt4759 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4759 - 1) / local33;
							if (local416 >= this.anInt4763) {
								this.anInt4759 += local33 * this.anInt4763;
								this.anInt4763 = 0;
								break;
							}
							this.anInt4759 += local33 * local416;
							this.anInt4763 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4107(arg0, local40, local23, local44, local13.aByteArray111[this.anInt4753]);
							if (this.anInt4759 < local23) {
								return;
							}
							local416 = (this.anInt4759 - local18) / local33;
							if (local416 >= this.anInt4763) {
								this.anInt4759 -= local33 * this.anInt4763;
								this.anInt4763 = 0;
								break;
							}
							this.anInt4759 -= local33 * local416;
							this.anInt4763 -= local416;
						}
					}
				}
			}
			if (this.anInt4762 < 0) {
				this.method4100(arg0, local40, 0, local44, 0);
				if (this.anInt4759 < 0) {
					this.anInt4759 = -1;
					this.method4101();
					this.method7525();
					return;
				}
			} else {
				this.method4107(arg0, local40, local29, local44, 0);
				if (this.anInt4759 >= local29) {
					this.anInt4759 = local29;
					this.method4101();
					this.method7525();
				}
			}
		} else if (this.aBoolean336) {
			if (this.anInt4762 < 0) {
				local40 = this.method4100(arg0, arg1, local18, local44, local13.aByteArray111[this.anInt4753]);
				if (this.anInt4759 >= local18) {
					return;
				}
				this.anInt4759 = local18 + local18 - this.anInt4759 - 1;
				this.anInt4762 = -this.anInt4762;
			}
			while (true) {
				local40 = this.method4107(arg0, local40, local23, local44, local13.aByteArray111[this.anInt4752 - 1]);
				if (this.anInt4759 < local23) {
					return;
				}
				this.anInt4759 = local23 + local23 - this.anInt4759 - 1;
				this.anInt4762 = -this.anInt4762;
				local40 = this.method4100(arg0, local40, local18, local44, local13.aByteArray111[this.anInt4753]);
				if (this.anInt4759 >= local18) {
					return;
				}
				this.anInt4759 = local18 + local18 - this.anInt4759 - 1;
				this.anInt4762 = -this.anInt4762;
			}
		} else if (this.anInt4762 < 0) {
			while (true) {
				local40 = this.method4100(arg0, local40, local18, local44, local13.aByteArray111[this.anInt4752 - 1]);
				if (this.anInt4759 >= local18) {
					return;
				}
				this.anInt4759 = local23 - (local23 - 1 - this.anInt4759) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4107(arg0, local40, local23, local44, local13.aByteArray111[this.anInt4753]);
				if (this.anInt4759 < local23) {
					return;
				}
				this.anInt4759 = local18 + (this.anInt4759 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "()I")
	@Override
	public int method5749() {
		return this.anInt4761 == 0 && this.anInt4754 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "()Z")
	public boolean method4108() {
		return this.anInt4759 < 0 || this.anInt4759 >= ((Class1_Sub37_Sub1) super.aClass1_Sub37_5).aByteArray111.length << 8;
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(II)V")
	public synchronized void method4110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4087(arg0, arg1, this.method4102());
	}

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "(I)V")
	public synchronized void method4112(@OriginalArg(0) int arg0) {
		if (this.anInt4762 < 0) {
			this.anInt4762 = -arg0;
		} else {
			this.anInt4762 = arg0;
		}
	}

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "()Z")
	public boolean method4115() {
		return this.anInt4754 != 0;
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "()Lclient!gv;")
	@Override
	public Class1_Sub16 method5752() {
		return null;
	}

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "(I)V")
	public synchronized void method4118(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4081();
			this.method7525();
		} else if (this.anInt4758 == 0 && this.anInt4757 == 0) {
			this.anInt4754 = 0;
			this.anInt4761 = 0;
			this.anInt4751 = 0;
			this.method7525();
		} else {
			@Pc(31) int local31 = -this.anInt4751;
			if (this.anInt4751 > local31) {
				local31 = this.anInt4751;
			}
			if (-this.anInt4758 > local31) {
				local31 = -this.anInt4758;
			}
			if (this.anInt4758 > local31) {
				local31 = this.anInt4758;
			}
			if (-this.anInt4757 > local31) {
				local31 = -this.anInt4757;
			}
			if (this.anInt4757 > local31) {
				local31 = this.anInt4757;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4754 = arg0;
			this.anInt4761 = Integer.MIN_VALUE;
			this.anInt4756 = -this.anInt4751 / arg0;
			this.anInt4760 = -this.anInt4758 / arg0;
			this.anInt4764 = -this.anInt4757 / arg0;
		}
	}
}
