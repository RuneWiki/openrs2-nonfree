import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class2_Sub11_Sub2 extends Class2_Sub11 {

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
	public int anInt3474;

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
	public int anInt3476;

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
	public int anInt3477;

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
	public int anInt3478;

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "I")
	private int anInt3480;

	@OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
	private int anInt3481;

	@OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
	public int anInt3482;

	@OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
	public int anInt3483;

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
	private final int anInt3475;

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
	private final int anInt3472;

	@OriginalMember(owner = "client!jr", name = "G", descriptor = "Z")
	private final boolean aBoolean260;

	@OriginalMember(owner = "client!jr", name = "E", descriptor = "I")
	private int anInt3484;

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
	private int anInt3473;

	@OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
	private int anInt3485;

	@OriginalMember(owner = "client!jr", name = "z", descriptor = "I")
	public int anInt3479;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!jk;II)V")
	public Class2_Sub11_Sub2(@OriginalArg(0) Class2_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub20_5 = arg0;
		this.anInt3475 = arg0.anInt3406;
		this.anInt3472 = arg0.anInt3405;
		this.aBoolean260 = arg0.aBoolean257;
		this.anInt3484 = arg1;
		this.anInt3473 = arg2;
		this.anInt3485 = 8192;
		this.anInt3479 = 0;
		this.method3008();
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!jk;III)V")
	public Class2_Sub11_Sub2(@OriginalArg(0) Class2_Sub20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub20_5 = arg0;
		this.anInt3475 = arg0.anInt3406;
		this.anInt3472 = arg0.anInt3405;
		this.aBoolean260 = arg0.aBoolean257;
		this.anInt3484 = arg1;
		this.anInt3473 = arg2;
		this.anInt3485 = arg3;
		this.anInt3479 = 0;
		this.method3008();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([IIIII)I")
	private int method2981(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3481 <= 0) {
				if (this.anInt3484 == 256 && (this.anInt3479 & 0xFF) == 0) {
					if (Static291.aBoolean399) {
						return Static397.method2986(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3477, this.anInt3474, arg3, arg2, this);
					}
					return Static397.method2982(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3478, arg3, arg2, this);
				}
				if (Static291.aBoolean399) {
					return Static397.method3009(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3477, this.anInt3474, arg3, arg2, this, this.anInt3484, arg4);
				}
				return Static397.method3011(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3478, arg3, arg2, this, this.anInt3484, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3481;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3481 += arg1;
			if (this.anInt3484 == 256 && (this.anInt3479 & 0xFF) == 0) {
				if (Static291.aBoolean399) {
					arg1 = Static397.method2996(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3477, this.anInt3474, this.anInt3483, this.anInt3476, local5, arg2, this);
				} else {
					arg1 = Static397.method3015(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3478, this.anInt3482, local5, arg2, this);
				}
			} else if (Static291.aBoolean399) {
				arg1 = Static397.method3012(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3477, this.anInt3474, this.anInt3483, this.anInt3476, local5, arg2, this, this.anInt3484, arg4);
			} else {
				arg1 = Static397.method3001(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3478, this.anInt3482, local5, arg2, this, this.anInt3484, arg4);
			}
			this.anInt3481 -= arg1;
			if (this.anInt3481 != 0) {
				return arg1;
			}
		} while (!this.method2983());
		return arg3;
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "()Z")
	private boolean method2983() {
		@Pc(2) int local2 = this.anInt3473;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static397.method3014(local2, this.anInt3485);
			local8 = Static397.method2988(local2, this.anInt3485);
		}
		if (this.anInt3478 != local2 || this.anInt3477 != local10 || this.anInt3474 != local8) {
			if (this.anInt3478 < local2) {
				this.anInt3482 = 1;
				this.anInt3481 = local2 - this.anInt3478;
			} else if (this.anInt3478 > local2) {
				this.anInt3482 = -1;
				this.anInt3481 = this.anInt3478 - local2;
			} else {
				this.anInt3482 = 0;
			}
			if (this.anInt3477 < local10) {
				this.anInt3483 = 1;
				if (this.anInt3481 == 0 || this.anInt3481 > local10 - this.anInt3477) {
					this.anInt3481 = local10 - this.anInt3477;
				}
			} else if (this.anInt3477 > local10) {
				this.anInt3483 = -1;
				if (this.anInt3481 == 0 || this.anInt3481 > this.anInt3477 - local10) {
					this.anInt3481 = this.anInt3477 - local10;
				}
			} else {
				this.anInt3483 = 0;
			}
			if (this.anInt3474 < local8) {
				this.anInt3476 = 1;
				if (this.anInt3481 == 0 || this.anInt3481 > local8 - this.anInt3474) {
					this.anInt3481 = local8 - this.anInt3474;
				}
			} else if (this.anInt3474 > local8) {
				this.anInt3476 = -1;
				if (this.anInt3481 == 0 || this.anInt3481 > this.anInt3474 - local8) {
					this.anInt3481 = this.anInt3474 - local8;
				}
			} else {
				this.anInt3476 = 0;
			}
			return false;
		} else if (this.anInt3473 == Integer.MIN_VALUE) {
			this.anInt3473 = 0;
			this.anInt3478 = this.anInt3477 = this.anInt3474 = 0;
			this.method6130();
			return true;
		} else {
			this.method3008();
			return false;
		}
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
	public synchronized void method2984(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3479 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "()V")
	private void method2985() {
		if (this.anInt3481 == 0) {
			return;
		}
		if (this.anInt3473 == Integer.MIN_VALUE) {
			this.anInt3473 = 0;
		}
		this.anInt3481 = 0;
		this.method3008();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
	public synchronized void method2987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2990(arg0, arg1, this.method2993());
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V")
	public synchronized void method2989() {
		this.anInt3484 = (this.anInt3484 ^ this.anInt3484 >> 31) + (this.anInt3484 >>> 31);
		this.anInt3484 = -this.anInt3484;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
	public synchronized void method2990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3004(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static397.method3014(arg1, arg2);
		@Pc(14) int local14 = Static397.method2988(arg1, arg2);
		if (this.anInt3477 == local10 && this.anInt3474 == local14) {
			this.anInt3481 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3478;
		if (this.anInt3478 - arg1 > local31) {
			local31 = this.anInt3478 - arg1;
		}
		if (local10 - this.anInt3477 > local31) {
			local31 = local10 - this.anInt3477;
		}
		if (this.anInt3477 - local10 > local31) {
			local31 = this.anInt3477 - local10;
		}
		if (local14 - this.anInt3474 > local31) {
			local31 = local14 - this.anInt3474;
		}
		if (this.anInt3474 - local14 > local31) {
			local31 = this.anInt3474 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3481 = arg0;
		this.anInt3473 = arg1;
		this.anInt3485 = arg2;
		this.anInt3482 = (arg1 - this.anInt3478) / arg0;
		this.anInt3483 = (local10 - this.anInt3477) / arg0;
		this.anInt3476 = (local14 - this.anInt3474) / arg0;
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V")
	public synchronized void method2991(@OriginalArg(0) int arg0) {
		this.anInt3480 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "()I")
	public synchronized int method2993() {
		return this.anInt3485 < 0 ? -1 : this.anInt3485;
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V")
	public synchronized void method2998(@OriginalArg(0) int arg0) {
		if (this.anInt3484 < 0) {
			this.anInt3484 = -arg0;
		} else {
			this.anInt3484 = arg0;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "([IIIII)I")
	private int method3002(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3481 <= 0) {
				if (this.anInt3484 == -256 && (this.anInt3479 & 0xFF) == 0) {
					if (Static291.aBoolean399) {
						return Static397.method2999(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3477, this.anInt3474, arg3, arg2, this);
					}
					return Static397.method3006(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3478, arg3, arg2, this);
				}
				if (Static291.aBoolean399) {
					return Static397.method3017(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3477, this.anInt3474, arg3, arg2, this, this.anInt3484, arg4);
				}
				return Static397.method3000(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3478, arg3, arg2, this, this.anInt3484, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3481;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3481 += arg1;
			if (this.anInt3484 == -256 && (this.anInt3479 & 0xFF) == 0) {
				if (Static291.aBoolean399) {
					arg1 = Static397.method3007(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3477, this.anInt3474, this.anInt3483, this.anInt3476, local5, arg2, this);
				} else {
					arg1 = Static397.method3020(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3478, this.anInt3482, local5, arg2, this);
				}
			} else if (Static291.aBoolean399) {
				arg1 = Static397.method2995(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3477, this.anInt3474, this.anInt3483, this.anInt3476, local5, arg2, this, this.anInt3484, arg4);
			} else {
				arg1 = Static397.method2994(((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40, arg0, this.anInt3479, arg1, this.anInt3478, this.anInt3482, local5, arg2, this, this.anInt3484, arg4);
			}
			this.anInt3481 -= arg1;
			if (this.anInt3481 != 0) {
				return arg1;
			}
		} while (!this.method2983());
		return arg3;
	}

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "()Z")
	public boolean method3003() {
		return this.anInt3479 < 0 || this.anInt3479 >= ((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40.length << 8;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(II)V")
	private synchronized void method3004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3473 = arg0;
		this.anInt3485 = arg1;
		this.anInt3481 = 0;
		this.method3008();
	}

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "()I")
	public synchronized int method3005() {
		return this.anInt3484 < 0 ? -this.anInt3484 : this.anInt3484;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "()Lclient!rk;")
	@Override
	public Class2_Sub11 method4872() {
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "()V")
	private void method3008() {
		this.anInt3478 = this.anInt3473;
		this.anInt3477 = Static397.method3014(this.anInt3473, this.anInt3485);
		this.anInt3474 = Static397.method2988(this.anInt3473, this.anInt3485);
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V")
	private synchronized void method3010() {
		this.method3004(0, this.method2993());
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "()I")
	@Override
	public int method4876() {
		return this.anInt3473 == 0 && this.anInt3481 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
	public synchronized void method3013(@OriginalArg(0) int arg0) {
		this.method3004(arg0 << 6, this.method2993());
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4875(@OriginalArg(0) int arg0) {
		if (this.anInt3481 > 0) {
			if (arg0 >= this.anInt3481) {
				if (this.anInt3473 == Integer.MIN_VALUE) {
					this.anInt3473 = 0;
					this.anInt3478 = this.anInt3477 = this.anInt3474 = 0;
					this.method6130();
					arg0 = this.anInt3481;
				}
				this.anInt3481 = 0;
				this.method3008();
			} else {
				this.anInt3478 += this.anInt3482 * arg0;
				this.anInt3477 += this.anInt3483 * arg0;
				this.anInt3474 += this.anInt3476 * arg0;
				this.anInt3481 -= arg0;
			}
		}
		@Pc(71) Class2_Sub20_Sub1 local71 = (Class2_Sub20_Sub1) super.aClass2_Sub20_5;
		@Pc(76) int local76 = this.anInt3475 << 8;
		@Pc(81) int local81 = this.anInt3472 << 8;
		@Pc(87) int local87 = local71.aByteArray40.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3480 = 0;
		}
		if (this.anInt3479 < 0) {
			if (this.anInt3484 <= 0) {
				this.method2985();
				this.method6130();
				return;
			}
			this.anInt3479 = 0;
		}
		if (this.anInt3479 >= local87) {
			if (this.anInt3484 >= 0) {
				this.method2985();
				this.method6130();
				return;
			}
			this.anInt3479 = local87 - 1;
		}
		this.anInt3479 += this.anInt3484 * arg0;
		if (this.anInt3480 >= 0) {
			if (this.anInt3480 > 0) {
				if (this.aBoolean260) {
					label125: {
						if (this.anInt3484 < 0) {
							if (this.anInt3479 >= local76) {
								return;
							}
							this.anInt3479 = local76 + local76 - this.anInt3479 - 1;
							this.anInt3484 = -this.anInt3484;
							if (--this.anInt3480 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3479 < local81) {
								return;
							}
							this.anInt3479 = local81 + local81 - this.anInt3479 - 1;
							this.anInt3484 = -this.anInt3484;
							if (--this.anInt3480 == 0) {
								break;
							}
							if (this.anInt3479 >= local76) {
								return;
							}
							this.anInt3479 = local76 + local76 - this.anInt3479 - 1;
							this.anInt3484 = -this.anInt3484;
						} while (--this.anInt3480 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3484 < 0) {
						if (this.anInt3479 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3479 - 1) / local91;
						if (local361 < this.anInt3480) {
							this.anInt3479 += local91 * local361;
							this.anInt3480 -= local361;
							return;
						}
						this.anInt3479 += local91 * this.anInt3480;
						this.anInt3480 = 0;
					} else if (this.anInt3479 >= local81) {
						local361 = (this.anInt3479 - local76) / local91;
						if (local361 < this.anInt3480) {
							this.anInt3479 -= local91 * local361;
							this.anInt3480 -= local361;
							return;
						}
						this.anInt3479 -= local91 * this.anInt3480;
						this.anInt3480 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3484 < 0) {
				if (this.anInt3479 < 0) {
					this.anInt3479 = -1;
					this.method2985();
					this.method6130();
					return;
				}
			} else if (this.anInt3479 >= local87) {
				this.anInt3479 = local87;
				this.method2985();
				this.method6130();
			}
		} else if (this.aBoolean260) {
			if (this.anInt3484 < 0) {
				if (this.anInt3479 >= local76) {
					return;
				}
				this.anInt3479 = local76 + local76 - this.anInt3479 - 1;
				this.anInt3484 = -this.anInt3484;
			}
			while (this.anInt3479 >= local81) {
				this.anInt3479 = local81 + local81 - this.anInt3479 - 1;
				this.anInt3484 = -this.anInt3484;
				if (this.anInt3479 >= local76) {
					return;
				}
				this.anInt3479 = local76 + local76 - this.anInt3479 - 1;
				this.anInt3484 = -this.anInt3484;
			}
		} else if (this.anInt3484 < 0) {
			if (this.anInt3479 < local76) {
				this.anInt3479 = local81 - (local81 - 1 - this.anInt3479) % local91 - 1;
			}
		} else if (this.anInt3479 >= local81) {
			this.anInt3479 = local76 + (this.anInt3479 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4877(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3473 == 0 && this.anInt3481 == 0) {
			this.method4875(arg2);
			return;
		}
		@Pc(13) Class2_Sub20_Sub1 local13 = (Class2_Sub20_Sub1) super.aClass2_Sub20_5;
		@Pc(18) int local18 = this.anInt3475 << 8;
		@Pc(23) int local23 = this.anInt3472 << 8;
		@Pc(29) int local29 = local13.aByteArray40.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3480 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3479 < 0) {
			if (this.anInt3484 <= 0) {
				this.method2985();
				this.method6130();
				return;
			}
			this.anInt3479 = 0;
		}
		if (this.anInt3479 >= local29) {
			if (this.anInt3484 >= 0) {
				this.method2985();
				this.method6130();
				return;
			}
			this.anInt3479 = local29 - 1;
		}
		if (this.anInt3480 >= 0) {
			if (this.anInt3480 > 0) {
				if (this.aBoolean260) {
					label130: {
						if (this.anInt3484 < 0) {
							local40 = this.method3002(arg0, arg1, local18, local44, local13.aByteArray40[this.anInt3475]);
							if (this.anInt3479 >= local18) {
								return;
							}
							this.anInt3479 = local18 + local18 - this.anInt3479 - 1;
							this.anInt3484 = -this.anInt3484;
							if (--this.anInt3480 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2981(arg0, local40, local23, local44, local13.aByteArray40[this.anInt3472 - 1]);
							if (this.anInt3479 < local23) {
								return;
							}
							this.anInt3479 = local23 + local23 - this.anInt3479 - 1;
							this.anInt3484 = -this.anInt3484;
							if (--this.anInt3480 == 0) {
								break;
							}
							local40 = this.method3002(arg0, local40, local18, local44, local13.aByteArray40[this.anInt3475]);
							if (this.anInt3479 >= local18) {
								return;
							}
							this.anInt3479 = local18 + local18 - this.anInt3479 - 1;
							this.anInt3484 = -this.anInt3484;
						} while (--this.anInt3480 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3484 < 0) {
						while (true) {
							local40 = this.method3002(arg0, local40, local18, local44, local13.aByteArray40[this.anInt3472 - 1]);
							if (this.anInt3479 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3479 - 1) / local33;
							if (local416 >= this.anInt3480) {
								this.anInt3479 += local33 * this.anInt3480;
								this.anInt3480 = 0;
								break;
							}
							this.anInt3479 += local33 * local416;
							this.anInt3480 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2981(arg0, local40, local23, local44, local13.aByteArray40[this.anInt3475]);
							if (this.anInt3479 < local23) {
								return;
							}
							local416 = (this.anInt3479 - local18) / local33;
							if (local416 >= this.anInt3480) {
								this.anInt3479 -= local33 * this.anInt3480;
								this.anInt3480 = 0;
								break;
							}
							this.anInt3479 -= local33 * local416;
							this.anInt3480 -= local416;
						}
					}
				}
			}
			if (this.anInt3484 < 0) {
				this.method3002(arg0, local40, 0, local44, 0);
				if (this.anInt3479 < 0) {
					this.anInt3479 = -1;
					this.method2985();
					this.method6130();
					return;
				}
			} else {
				this.method2981(arg0, local40, local29, local44, 0);
				if (this.anInt3479 >= local29) {
					this.anInt3479 = local29;
					this.method2985();
					this.method6130();
				}
			}
		} else if (this.aBoolean260) {
			if (this.anInt3484 < 0) {
				local40 = this.method3002(arg0, arg1, local18, local44, local13.aByteArray40[this.anInt3475]);
				if (this.anInt3479 >= local18) {
					return;
				}
				this.anInt3479 = local18 + local18 - this.anInt3479 - 1;
				this.anInt3484 = -this.anInt3484;
			}
			while (true) {
				local40 = this.method2981(arg0, local40, local23, local44, local13.aByteArray40[this.anInt3472 - 1]);
				if (this.anInt3479 < local23) {
					return;
				}
				this.anInt3479 = local23 + local23 - this.anInt3479 - 1;
				this.anInt3484 = -this.anInt3484;
				local40 = this.method3002(arg0, local40, local18, local44, local13.aByteArray40[this.anInt3475]);
				if (this.anInt3479 >= local18) {
					return;
				}
				this.anInt3479 = local18 + local18 - this.anInt3479 - 1;
				this.anInt3484 = -this.anInt3484;
			}
		} else if (this.anInt3484 < 0) {
			while (true) {
				local40 = this.method3002(arg0, local40, local18, local44, local13.aByteArray40[this.anInt3472 - 1]);
				if (this.anInt3479 >= local18) {
					return;
				}
				this.anInt3479 = local23 - (local23 - 1 - this.anInt3479) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2981(arg0, local40, local23, local44, local13.aByteArray40[this.anInt3475]);
				if (this.anInt3479 < local23) {
					return;
				}
				this.anInt3479 = local18 + (this.anInt3479 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "()I")
	@Override
	public int method4873() {
		@Pc(6) int local6 = this.anInt3478 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3480 == 0) {
			local6 -= local6 * this.anInt3479 / (((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40.length << 8);
		} else if (this.anInt3480 >= 0) {
			local6 -= local6 * this.anInt3475 / ((Class2_Sub20_Sub1) super.aClass2_Sub20_5).aByteArray40.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "()I")
	public synchronized int method3016() {
		return this.anInt3473 == Integer.MIN_VALUE ? 0 : this.anInt3473;
	}

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "(I)V")
	public synchronized void method3018(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3010();
			this.method6130();
		} else if (this.anInt3477 == 0 && this.anInt3474 == 0) {
			this.anInt3481 = 0;
			this.anInt3473 = 0;
			this.anInt3478 = 0;
			this.method6130();
		} else {
			@Pc(31) int local31 = -this.anInt3478;
			if (this.anInt3478 > local31) {
				local31 = this.anInt3478;
			}
			if (-this.anInt3477 > local31) {
				local31 = -this.anInt3477;
			}
			if (this.anInt3477 > local31) {
				local31 = this.anInt3477;
			}
			if (-this.anInt3474 > local31) {
				local31 = -this.anInt3474;
			}
			if (this.anInt3474 > local31) {
				local31 = this.anInt3474;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3481 = arg0;
			this.anInt3473 = Integer.MIN_VALUE;
			this.anInt3482 = -this.anInt3478 / arg0;
			this.anInt3483 = -this.anInt3477 / arg0;
			this.anInt3476 = -this.anInt3474 / arg0;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "()Lclient!rk;")
	@Override
	public Class2_Sub11 method4871() {
		return null;
	}

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "()Z")
	public boolean method3019() {
		return this.anInt3481 != 0;
	}
}
