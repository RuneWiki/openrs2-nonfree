import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class4_Sub6_Sub4 extends Class4_Sub6 {

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	public int anInt4096;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
	public int anInt4097;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
	public int anInt4098;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
	public int anInt4099;

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
	public int anInt4102;

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
	public int anInt4104;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
	private int anInt4105;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
	private int anInt4108;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
	private int anInt4106;

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
	private int anInt4107;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Z")
	private boolean aBoolean290;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
	private int anInt4095;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
	private int anInt4101;

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
	private int anInt4103;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
	public int anInt4100;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!pb;II)V")
	public Class4_Sub6_Sub4(@OriginalArg(0) Class4_Sub8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub8_5 = arg0;
		this.anInt4106 = arg0.anInt4084;
		this.anInt4107 = arg0.anInt4086;
		this.aBoolean290 = arg0.aBoolean288;
		this.anInt4095 = arg1;
		this.anInt4101 = arg2;
		this.anInt4103 = 8192;
		this.anInt4100 = 0;
		this.method3384();
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!pb;III)V")
	public Class4_Sub6_Sub4(@OriginalArg(0) Class4_Sub8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass4_Sub8_5 = arg0;
		this.anInt4106 = arg0.anInt4084;
		this.anInt4107 = arg0.anInt4086;
		this.aBoolean290 = arg0.aBoolean288;
		this.anInt4095 = arg1;
		this.anInt4101 = arg2;
		this.anInt4103 = arg3;
		this.anInt4100 = 0;
		this.method3384();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public synchronized void method3365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3399(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static322.method3387(arg1, arg2);
		@Pc(14) int local14 = Static322.method3368(arg1, arg2);
		if (this.anInt4104 == local10 && this.anInt4098 == local14) {
			this.anInt4105 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4096;
		if (this.anInt4096 - arg1 > local31) {
			local31 = this.anInt4096 - arg1;
		}
		if (local10 - this.anInt4104 > local31) {
			local31 = local10 - this.anInt4104;
		}
		if (this.anInt4104 - local10 > local31) {
			local31 = this.anInt4104 - local10;
		}
		if (local14 - this.anInt4098 > local31) {
			local31 = local14 - this.anInt4098;
		}
		if (this.anInt4098 - local14 > local31) {
			local31 = this.anInt4098 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4105 = arg0;
		this.anInt4101 = arg1;
		this.anInt4103 = arg2;
		this.anInt4097 = (arg1 - this.anInt4096) / arg0;
		this.anInt4102 = (local10 - this.anInt4104) / arg0;
		this.anInt4099 = (local14 - this.anInt4098) / arg0;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public synchronized void method3366(@OriginalArg(0) int arg0) {
		if (this.anInt4095 < 0) {
			this.anInt4095 = -arg0;
		} else {
			this.anInt4095 = arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "()I")
	@Override
	public int method3360() {
		@Pc(6) int local6 = this.anInt4096 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4108 == 0) {
			local6 -= local6 * this.anInt4100 / (((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52.length << 8);
		} else if (this.anInt4108 >= 0) {
			local6 -= local6 * this.anInt4106 / ((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "()V")
	private void method3367() {
		if (this.anInt4105 == 0) {
			return;
		}
		if (this.anInt4101 == Integer.MIN_VALUE) {
			this.anInt4101 = 0;
		}
		this.anInt4105 = 0;
		this.method3384();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([IIIII)I")
	private int method3371(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt4105 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt4105;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt4105 += arg1;
				if (this.anInt4095 == -256 && (this.anInt4100 & 0xFF) == 0) {
					if (Static138.aBoolean183) {
						arg1 = Static322.method3389(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, this.anInt4102, this.anInt4099, local7, arg2, this);
					} else {
						arg1 = Static322.method3402(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4096, this.anInt4097, local7, arg2, this);
					}
				} else if (Static138.aBoolean183) {
					arg1 = Static322.method3383(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, this.anInt4102, this.anInt4099, local7, arg2, this, this.anInt4095, arg4);
				} else {
					arg1 = Static322.method3403(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4096, this.anInt4097, local7, arg2, this, this.anInt4095, arg4);
				}
				this.anInt4105 -= arg1;
				if (this.anInt4105 != 0) {
					return arg1;
				}
				if (!this.method3380()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt4095 == -256 && (this.anInt4100 & 0xFF) == 0) {
				if (Static138.aBoolean183) {
					return Static322.method3400(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, arg3, arg2, this);
				}
				return Static322.method3393(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4096, arg3, arg2, this);
			}
			if (Static138.aBoolean183) {
				return Static322.method3369(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, arg3, arg2, this, this.anInt4095, arg4);
			}
			return Static322.method3404(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4096, arg3, arg2, this, this.anInt4095, arg4);
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	public synchronized void method3372(@OriginalArg(0) int arg0) {
		this.anInt4108 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	public synchronized void method3373(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3395();
			this.method4854();
		} else if (this.anInt4104 == 0 && this.anInt4098 == 0) {
			this.anInt4105 = 0;
			this.anInt4101 = 0;
			this.anInt4096 = 0;
			this.method4854();
		} else {
			@Pc(31) int local31 = -this.anInt4096;
			if (this.anInt4096 > local31) {
				local31 = this.anInt4096;
			}
			if (-this.anInt4104 > local31) {
				local31 = -this.anInt4104;
			}
			if (this.anInt4104 > local31) {
				local31 = this.anInt4104;
			}
			if (-this.anInt4098 > local31) {
				local31 = -this.anInt4098;
			}
			if (this.anInt4098 > local31) {
				local31 = this.anInt4098;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4105 = arg0;
			this.anInt4101 = Integer.MIN_VALUE;
			this.anInt4097 = -this.anInt4096 / arg0;
			this.anInt4102 = -this.anInt4104 / arg0;
			this.anInt4099 = -this.anInt4098 / arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3358(@OriginalArg(0) int arg0) {
		if (this.anInt4105 > 0) {
			if (arg0 >= this.anInt4105) {
				if (this.anInt4101 == Integer.MIN_VALUE) {
					this.anInt4101 = 0;
					this.anInt4096 = this.anInt4104 = this.anInt4098 = 0;
					this.method4854();
					arg0 = this.anInt4105;
				}
				this.anInt4105 = 0;
				this.method3384();
			} else {
				this.anInt4096 += this.anInt4097 * arg0;
				this.anInt4104 += this.anInt4102 * arg0;
				this.anInt4098 += this.anInt4099 * arg0;
				this.anInt4105 -= arg0;
			}
		}
		@Pc(71) Class4_Sub8_Sub1 local71 = (Class4_Sub8_Sub1) this.aClass4_Sub8_5;
		@Pc(76) int local76 = this.anInt4106 << 8;
		@Pc(81) int local81 = this.anInt4107 << 8;
		@Pc(87) int local87 = local71.aByteArray52.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4108 = 0;
		}
		if (this.anInt4100 < 0) {
			if (this.anInt4095 <= 0) {
				this.method3367();
				this.method4854();
				return;
			}
			this.anInt4100 = 0;
		}
		if (this.anInt4100 >= local87) {
			if (this.anInt4095 >= 0) {
				this.method3367();
				this.method4854();
				return;
			}
			this.anInt4100 = local87 - 1;
		}
		this.anInt4100 += this.anInt4095 * arg0;
		if (this.anInt4108 >= 0) {
			if (this.anInt4108 > 0) {
				if (this.aBoolean290) {
					label121: {
						if (this.anInt4095 < 0) {
							if (this.anInt4100 >= local76) {
								return;
							}
							this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
							if (--this.anInt4108 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt4100 < local81) {
								return;
							}
							this.anInt4100 = local81 + local81 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
							if (--this.anInt4108 == 0) {
								break;
							}
							if (this.anInt4100 >= local76) {
								return;
							}
							this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
						} while (--this.anInt4108 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt4095 < 0) {
							if (this.anInt4100 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt4100 - 1) / local91;
							if (local362 >= this.anInt4108) {
								this.anInt4100 += local91 * this.anInt4108;
								this.anInt4108 = 0;
								break label153;
							}
							this.anInt4100 += local91 * local362;
							this.anInt4108 -= local362;
						} else if (this.anInt4100 >= local81) {
							local362 = (this.anInt4100 - local76) / local91;
							if (local362 >= this.anInt4108) {
								this.anInt4100 -= local91 * this.anInt4108;
								this.anInt4108 = 0;
								break label153;
							}
							this.anInt4100 -= local91 * local362;
							this.anInt4108 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt4095 < 0) {
				if (this.anInt4100 < 0) {
					this.anInt4100 = -1;
					this.method3367();
					this.method4854();
				}
			} else if (this.anInt4100 >= local87) {
				this.anInt4100 = local87;
				this.method3367();
				this.method4854();
			}
		} else if (this.aBoolean290) {
			if (this.anInt4095 < 0) {
				if (this.anInt4100 >= local76) {
					return;
				}
				this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
			}
			while (this.anInt4100 >= local81) {
				this.anInt4100 = local81 + local81 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
				if (this.anInt4100 >= local76) {
					return;
				}
				this.anInt4100 = local76 + local76 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
			}
		} else if (this.anInt4095 < 0) {
			if (this.anInt4100 >= local76) {
				return;
			}
			this.anInt4100 = local81 - (local81 - 1 - this.anInt4100) % local91 - 1;
		} else if (this.anInt4100 >= local81) {
			this.anInt4100 = local76 + (this.anInt4100 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	public synchronized void method3377() {
		this.anInt4095 = (this.anInt4095 ^ this.anInt4095 >> 31) + (this.anInt4095 >>> 31);
		this.anInt4095 = -this.anInt4095;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "()Z")
	public boolean method3378() {
		return this.anInt4100 < 0 || this.anInt4100 >= ((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52.length << 8;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()Lclient!tf;")
	@Override
	public Class4_Sub6 method3362() {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "()Z")
	private boolean method3380() {
		@Pc(2) int local2 = this.anInt4101;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static322.method3387(local2, this.anInt4103);
			local8 = Static322.method3368(local2, this.anInt4103);
		}
		if (this.anInt4096 != local2 || this.anInt4104 != local10 || this.anInt4098 != local8) {
			if (this.anInt4096 < local2) {
				this.anInt4097 = 1;
				this.anInt4105 = local2 - this.anInt4096;
			} else if (this.anInt4096 > local2) {
				this.anInt4097 = -1;
				this.anInt4105 = this.anInt4096 - local2;
			} else {
				this.anInt4097 = 0;
			}
			if (this.anInt4104 < local10) {
				this.anInt4102 = 1;
				if (this.anInt4105 == 0 || this.anInt4105 > local10 - this.anInt4104) {
					this.anInt4105 = local10 - this.anInt4104;
				}
			} else if (this.anInt4104 > local10) {
				this.anInt4102 = -1;
				if (this.anInt4105 == 0 || this.anInt4105 > this.anInt4104 - local10) {
					this.anInt4105 = this.anInt4104 - local10;
				}
			} else {
				this.anInt4102 = 0;
			}
			if (this.anInt4098 < local8) {
				this.anInt4099 = 1;
				if (this.anInt4105 == 0 || this.anInt4105 > local8 - this.anInt4098) {
					this.anInt4105 = local8 - this.anInt4098;
				}
			} else if (this.anInt4098 > local8) {
				this.anInt4099 = -1;
				if (this.anInt4105 == 0 || this.anInt4105 > this.anInt4098 - local8) {
					this.anInt4105 = this.anInt4098 - local8;
				}
			} else {
				this.anInt4099 = 0;
			}
			return false;
		} else if (this.anInt4101 == Integer.MIN_VALUE) {
			this.anInt4101 = 0;
			this.anInt4096 = this.anInt4104 = this.anInt4098 = 0;
			this.method4854();
			return true;
		} else {
			this.method3384();
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "()I")
	public synchronized int method3381() {
		return this.anInt4095 < 0 ? -this.anInt4095 : this.anInt4095;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	public synchronized void method3382(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4100 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "()V")
	private void method3384() {
		this.anInt4096 = this.anInt4101;
		this.anInt4104 = Static322.method3387(this.anInt4101, this.anInt4103);
		this.anInt4098 = Static322.method3368(this.anInt4101, this.anInt4103);
	}

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "()Z")
	public boolean method3385() {
		return this.anInt4105 != 0;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	public synchronized void method3390(@OriginalArg(0) int arg0) {
		this.method3399(arg0 << 6, this.method3401());
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
	public synchronized void method3392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3365(arg0, arg1, this.method3401());
	}

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "()I")
	public synchronized int method3394() {
		return this.anInt4101 == Integer.MIN_VALUE ? 0 : this.anInt4101;
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
	private synchronized void method3395() {
		this.method3399(0, this.method3401());
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([IIIII)I")
	private int method3396(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt4105 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt4105;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt4105 += arg1;
				if (this.anInt4095 == 256 && (this.anInt4100 & 0xFF) == 0) {
					if (Static138.aBoolean183) {
						arg1 = Static322.method3375(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, this.anInt4102, this.anInt4099, local7, arg2, this);
					} else {
						arg1 = Static322.method3391(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4096, this.anInt4097, local7, arg2, this);
					}
				} else if (Static138.aBoolean183) {
					arg1 = Static322.method3379(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, this.anInt4102, this.anInt4099, local7, arg2, this, this.anInt4095, arg4);
				} else {
					arg1 = Static322.method3376(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4096, this.anInt4097, local7, arg2, this, this.anInt4095, arg4);
				}
				this.anInt4105 -= arg1;
				if (this.anInt4105 != 0) {
					return arg1;
				}
				if (!this.method3380()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt4095 == 256 && (this.anInt4100 & 0xFF) == 0) {
				if (Static138.aBoolean183) {
					return Static322.method3388(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, arg3, arg2, this);
				}
				return Static322.method3374(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4096, arg3, arg2, this);
			}
			if (Static138.aBoolean183) {
				return Static322.method3370(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4104, this.anInt4098, arg3, arg2, this, this.anInt4095, arg4);
			}
			return Static322.method3386(((Class4_Sub8_Sub1) this.aClass4_Sub8_5).aByteArray52, arg0, this.anInt4100, arg1, this.anInt4096, arg3, arg2, this, this.anInt4095, arg4);
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)V")
	private synchronized void method3399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4101 = arg0;
		this.anInt4103 = arg1;
		this.anInt4105 = 0;
		this.method3384();
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "()Lclient!tf;")
	@Override
	public Class4_Sub6 method3363() {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "()I")
	public synchronized int method3401() {
		return this.anInt4103 < 0 ? -1 : this.anInt4103;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3361(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4101 == 0 && this.anInt4105 == 0) {
			this.method3358(arg2);
			return;
		}
		@Pc(13) Class4_Sub8_Sub1 local13 = (Class4_Sub8_Sub1) this.aClass4_Sub8_5;
		@Pc(18) int local18 = this.anInt4106 << 8;
		@Pc(23) int local23 = this.anInt4107 << 8;
		@Pc(29) int local29 = local13.aByteArray52.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4108 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4100 < 0) {
			if (this.anInt4095 <= 0) {
				this.method3367();
				this.method4854();
				return;
			}
			this.anInt4100 = 0;
		}
		if (this.anInt4100 >= local29) {
			if (this.anInt4095 >= 0) {
				this.method3367();
				this.method4854();
				return;
			}
			this.anInt4100 = local29 - 1;
		}
		if (this.anInt4108 >= 0) {
			if (this.anInt4108 > 0) {
				if (this.aBoolean290) {
					label131: {
						if (this.anInt4095 < 0) {
							local40 = this.method3371(arg0, arg1, local18, local44, local13.aByteArray52[this.anInt4106]);
							if (this.anInt4100 >= local18) {
								return;
							}
							this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
							if (--this.anInt4108 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method3396(arg0, local40, local23, local44, local13.aByteArray52[this.anInt4107 - 1]);
							if (this.anInt4100 < local23) {
								return;
							}
							this.anInt4100 = local23 + local23 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
							if (--this.anInt4108 == 0) {
								break;
							}
							local40 = this.method3371(arg0, local40, local18, local44, local13.aByteArray52[this.anInt4106]);
							if (this.anInt4100 >= local18) {
								return;
							}
							this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
							this.anInt4095 = -this.anInt4095;
						} while (--this.anInt4108 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt4095 < 0) {
						while (true) {
							local40 = this.method3371(arg0, local40, local18, local44, local13.aByteArray52[this.anInt4107 - 1]);
							if (this.anInt4100 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt4100 - 1) / local33;
							if (local417 >= this.anInt4108) {
								this.anInt4100 += local33 * this.anInt4108;
								this.anInt4108 = 0;
								break;
							}
							this.anInt4100 += local33 * local417;
							this.anInt4108 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method3396(arg0, local40, local23, local44, local13.aByteArray52[this.anInt4106]);
							if (this.anInt4100 < local23) {
								return;
							}
							local417 = (this.anInt4100 - local18) / local33;
							if (local417 >= this.anInt4108) {
								this.anInt4100 -= local33 * this.anInt4108;
								this.anInt4108 = 0;
								break;
							}
							this.anInt4100 -= local33 * local417;
							this.anInt4108 -= local417;
						}
					}
				}
			}
			if (this.anInt4095 < 0) {
				this.method3371(arg0, local40, 0, local44, 0);
				if (this.anInt4100 < 0) {
					this.anInt4100 = -1;
					this.method3367();
					this.method4854();
				}
			} else {
				this.method3396(arg0, local40, local29, local44, 0);
				if (this.anInt4100 >= local29) {
					this.anInt4100 = local29;
					this.method3367();
					this.method4854();
				}
			}
		} else if (this.aBoolean290) {
			if (this.anInt4095 < 0) {
				local40 = this.method3371(arg0, arg1, local18, local44, local13.aByteArray52[this.anInt4106]);
				if (this.anInt4100 >= local18) {
					return;
				}
				this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
			}
			while (true) {
				local40 = this.method3396(arg0, local40, local23, local44, local13.aByteArray52[this.anInt4107 - 1]);
				if (this.anInt4100 < local23) {
					return;
				}
				this.anInt4100 = local23 + local23 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
				local40 = this.method3371(arg0, local40, local18, local44, local13.aByteArray52[this.anInt4106]);
				if (this.anInt4100 >= local18) {
					return;
				}
				this.anInt4100 = local18 + local18 - this.anInt4100 - 1;
				this.anInt4095 = -this.anInt4095;
			}
		} else if (this.anInt4095 < 0) {
			while (true) {
				local40 = this.method3371(arg0, local40, local18, local44, local13.aByteArray52[this.anInt4107 - 1]);
				if (this.anInt4100 >= local18) {
					return;
				}
				this.anInt4100 = local23 - (local23 - 1 - this.anInt4100) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3396(arg0, local40, local23, local44, local13.aByteArray52[this.anInt4106]);
				if (this.anInt4100 < local23) {
					return;
				}
				this.anInt4100 = local18 + (this.anInt4100 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()I")
	@Override
	public int method3359() {
		return this.anInt4101 == 0 && this.anInt4105 == 0 ? 0 : 1;
	}
}
